/*
 * Copyright (c) 2014, Oracle and/or its affiliates. All rights reserved.
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

/**
 * @test
 * @bug 8031321
 * @summary Verify processing of UseBMI1Instructions option on CPU with
 *          BMI1 feature support.
 * @library /testlibrary /testlibrary/whitebox
 * @build TestUseBMI1InstructionsOnSupportedCPU
 *        BMISupportedCPUTest
 * @run main ClassFileInstaller sun.hotspot.WhiteBox
 * @run main/othervm -Xbootclasspath/a:. -XX:+UnlockDiagnosticVMOptions
 *                   -XX:+WhiteBoxAPI TestUseBMI1InstructionsOnSupportedCPU
 */

import sun.hotspot.cpuinfo.CPUInfo;
import com.oracle.java.testlibrary.*;

public class TestUseBMI1InstructionsOnSupportedCPU
     extends BMISupportedCPUTest {

    public TestUseBMI1InstructionsOnSupportedCPU() {
        super("UseBMI1Instructions", BMI1_WARNING, "bmi1");
    }

    public static void main(String[] args) throws Throwable {
        new TestUseBMI1InstructionsOnSupportedCPU().test();
    }
}

