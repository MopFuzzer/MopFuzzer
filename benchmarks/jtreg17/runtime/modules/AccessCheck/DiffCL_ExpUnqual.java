/*
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
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
 */

/*
 * @test
 * @summary Test that if module m1x can read module m2x, and package p2 in m2x is
 *          exported unqualifiedly, then class p1.c1 in m1x can read p2.c2 in m2x.
 * @modules java.base/jdk.internal.misc
 * @library /test/lib
 * @compile myloaders/MyDiffClassLoader.java
 * @compile p2/c2.java
 * @compile p1/c1.java
 * @run main/othervm -Xbootclasspath/a:. DiffCL_ExpUnqual
 */

import static jdk.test.lib.Asserts.*;

import java.lang.module.Configuration;
import java.lang.module.ModuleDescriptor;
import java.lang.module.ModuleFinder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import myloaders.MyDiffClassLoader;

//
// ClassLoader1 --> defines m1x --> packages p1
// ClassLoader2 --> defines m2x --> packages p2
//
// m1x can read m2x
// package p2 in m2x is exported to m1x
//
// class p1.c1 defined in m1x tries to access p2.c2 defined in m2x
// Access allowed since m1x can read m2x and package p2 is exported
// unqualifiedly.
//
public class DiffCL_ExpUnqual {

    // Create a layer over the boot layer.
    // Define modules within this layer to test access between
    // publically defined classes within packages of those modules.
    public void createLayerOnBoot() throws Throwable {

        // Define module:     m1x
        // Can read:          java.base, m2x
        // Packages:          p1
        // Packages exported: p1 is exported unqualifiedly
        ModuleDescriptor descriptor_m1x =
                ModuleDescriptor.newModule("m1x")
                        .requires("java.base")
                        .requires("m2x")
                        .exports("p1")
                        .build();

        // Define module:     m2x
        // Can read:          java.base
        // Packages:          p2
        // Packages exported: package p2 is exported to m1x
        ModuleDescriptor descriptor_m2x =
                ModuleDescriptor.newModule("m2x")
                        .requires("java.base")
                        .exports("p2")
                        .build();

        // Set up a ModuleFinder containing all modules for this layer.
        ModuleFinder finder = ModuleLibrary.of(descriptor_m1x, descriptor_m2x);

        // Resolves "m1x"
        Configuration cf = ModuleLayer.boot()
                .configuration()
                .resolve(finder, ModuleFinder.of(), Set.of("m1x"));

        // map each module to differing class loaders for this test
        Map<String, ClassLoader> map = new HashMap<>();
        map.put("m1x", MyDiffClassLoader.loader1);
        map.put("m2x", MyDiffClassLoader.loader2);

        // Create layer that contains m1x & m2x
        ModuleLayer layer = ModuleLayer.boot().defineModules(cf, map::get);

        assertTrue(layer.findLoader("m1x") == MyDiffClassLoader.loader1);
        assertTrue(layer.findLoader("m2x") == MyDiffClassLoader.loader2);
        assertTrue(layer.findLoader("java.base") == null);

        // now use the same loader to load class p1.c1
        Class p1_c1_class = MyDiffClassLoader.loader1.loadClass("p1.c1");
        try {
            p1_c1_class.newInstance();
        } catch (IllegalAccessError e) {
            throw new RuntimeException("Test Failed, an IAE should not be thrown since p2 is exported qualifiedly to m1x");
        }
    }

    public static void main(String[] args) throws Throwable {
      DiffCL_ExpUnqual test = new DiffCL_ExpUnqual();
      test.createLayerOnBoot();
    }
}
