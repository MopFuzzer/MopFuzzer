/*
 * Copyright (c) 2017, 2022, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 *
 */

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import jdk.test.whitebox.WhiteBox;

public class CheckCachedResolvedReferencesApp {
    public static void main(String[] args) throws Exception {
        String path = args[0];
        URL url = new File(path).toURI().toURL();
        URL[] urls = new URL[] {url};

        URLClassLoader loader = new URLClassLoader(urls);
        Class hello = loader.loadClass("Hello");
        System.out.println("Loaded " + hello + " from " + url + " using loader " + loader);

        WhiteBox wb = WhiteBox.getWhiteBox();

        if (!wb.areOpenArchiveHeapObjectsMapped()) {
            System.out.println("Archived open_archive_heap objects are not mapped.");
            System.out.println("This may happen during normal operation. Test Skipped.");
            return;
        }

        // CheckCachedResolvedReferencesApp is shared class and loaded by the
        // AppClassLoader. It should have cached resolved_references.
        if (wb.isSharedClass(CheckCachedResolvedReferencesApp.class)) {
            Object refs1 = wb.getResolvedReferences(CheckCachedResolvedReferencesApp.class);
            if (refs1 != null && wb.isShared(refs1)) {
                System.out.println(
                    "resolved references from CheckCachedResolvedReferencesApp is cached");
            } else {
                throw new RuntimeException(
                    "FAILED. CheckCachedResolvedReferencesApp has no cached resolved references");
            }
        }

        // Hello is shared class and loaded by the 'loader' defined in current app.
        // It should not have cached resolved_references.
        if (wb.isSharedClass(hello)) {
            Object refs2 = wb.getResolvedReferences(hello);
            if (refs2 != null) {
                if (!wb.isShared(refs2)) {
                    System.out.println("resolved references from hello is not cached");
                } else {
                    throw new RuntimeException(
                        "FAILED. Hello has unexpected cached resolved references");
                }
            } else {
                throw new RuntimeException("FAILED. Hello has no resolved references");
            }
        }
    }
}
