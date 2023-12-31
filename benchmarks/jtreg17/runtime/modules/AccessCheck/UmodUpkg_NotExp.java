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
 * @summary Test if package p6 in module m2x is not exported, then class c5
 *          in an unnamed module can not access p6.c2 in module m2x.
 * @modules java.base/jdk.internal.misc
 * @library /test/lib
 * @compile myloaders/MySameClassLoader.java
 * @compile p6/c6.java
 * @compile c5.java
 * @run main/othervm -Xbootclasspath/a:. UmodUpkg_NotExp
 */

import static jdk.test.lib.Asserts.*;

import java.lang.module.Configuration;
import java.lang.module.ModuleDescriptor;
import java.lang.module.ModuleFinder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import myloaders.MySameClassLoader;

// ClassLoader1 --> defines m1x --> no packages
//                  defines m2x --> packages p6
//
// m1x can read m2x
// package p6 in m2x is not exported
//
// class c5 defined in an unnamed module tries to access p6.c2 defined in m2x
// Access denied since p6 is not exported.
//
public class UmodUpkg_NotExp {

    // Create a layer over the boot layer.
    // Define modules within this layer to test access between
    // publically defined classes within packages of those modules.
    public void createLayerOnBoot() throws Throwable {

        // Define module:     m1x
        // Can read:          java.base, m2x
        // Packages:          none
        // Packages exported: none
        ModuleDescriptor descriptor_m1x =
                ModuleDescriptor.newModule("m1x")
                        .requires("java.base")
                        .requires("m2x")
                        .build();

        // Define module:     m2x
        // Can read:          java.base
        // Packages:          p6
        // Packages exported: none
        ModuleDescriptor descriptor_m2x =
                ModuleDescriptor.newModule("m2x")
                        .requires("java.base")
                        .packages(Set.of("p6"))
                        .build();

        // Set up a ModuleFinder containing all modules for this layer.
        ModuleFinder finder = ModuleLibrary.of(descriptor_m1x, descriptor_m2x);

        // Resolves "m1x"
        Configuration cf = ModuleLayer.boot()
                .configuration()
                .resolve(finder, ModuleFinder.of(), Set.of("m1x"));

        // map each module to the same class loader for this test
        Map<String, ClassLoader> map = new HashMap<>();
        map.put("m1x", MySameClassLoader.loader1);
        map.put("m2x", MySameClassLoader.loader1);

        // Create layer that contains m1x and m2x
        ModuleLayer layer = ModuleLayer.boot().defineModules(cf, map::get);

        assertTrue(layer.findLoader("m1x") == MySameClassLoader.loader1);
        assertTrue(layer.findLoader("m2x") == MySameClassLoader.loader1);
        assertTrue(layer.findLoader("java.base") == null);

        // now use the same loader to load class c5
        Class c5_class = MySameClassLoader.loader1.loadClass("c5");
        try {
            c5_class.newInstance();
            throw new RuntimeException("Failed to get IAE (p6 in m2x is not exported)");
        } catch (IllegalAccessError e) {
          System.out.println(e.getMessage());
          if (!e.getMessage().contains("does not export")) {
              throw new RuntimeException("Wrong message: " + e.getMessage());
          }
        }
    }

    public static void main(String[] args) throws Throwable {
      UmodUpkg_NotExp test = new UmodUpkg_NotExp();
      test.createLayerOnBoot();
    }
}
