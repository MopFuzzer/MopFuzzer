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
 *
 */

/**
 * @test
 * @bug 8031320
 * @summary Verify that NoRTMLockEliding option could be applied to
 *          specified method and that such method will not use rtm.
 * @library /testlibrary /testlibrary/whitebox /compiler/testlibrary
 * @build TestNoRTMLockElidingOption
 * @run main ClassFileInstaller sun.hotspot.WhiteBox
 * @run main/othervm -Xbootclasspath/a:. -XX:+UnlockDiagnosticVMOptions
 *                   -XX:+WhiteBoxAPI TestNoRTMLockElidingOption
 */

import java.util.List;
import com.oracle.java.testlibrary.*;
import com.oracle.java.testlibrary.cli.CommandLineOptionTest;
import com.oracle.java.testlibrary.cli.predicate.AndPredicate;
import rtm.*;
import rtm.predicate.SupportedCPU;
import rtm.predicate.SupportedVM;

/**
 * Test verifies that method tagged with option <i>NoRTMLockElidingOption</i>
 * will not use RTM-based lock elision.
 * Test invokes compiled method and checks that no deoptimization with
 * <i>rtm_state_change</i> reason had happened and that that VM output
 * does not contain RTM locking statistics for compiled method.
 */
public class TestNoRTMLockElidingOption extends CommandLineOptionTest {
    private TestNoRTMLockElidingOption() {
        super(new AndPredicate(new SupportedCPU(), new SupportedVM()));
    }

    @Override
    public void runTestCases() throws Throwable {
        verifyOption(false);
        verifyOption(true);
    }

    public void verifyOption(boolean useStackLock) throws Throwable {
        AbortProvoker provoker = AbortType.XABORT.provoker();
        String logFileName = String.format("rtm_deopt_%s_stack_lock.xml",
                (useStackLock ? "use" : "no"));
        String methodOption = String.format("-XX:CompileCommand=option," +
                "%s,NoRTMLockEliding", provoker.getMethodWithLockName());

        OutputAnalyzer outputAnalyzer = RTMTestBase.executeRTMTest(
                logFileName,
                provoker,
                CommandLineOptionTest.prepareBooleanFlag("UseRTMForStackLocks",
                        useStackLock),
                methodOption,
                "-XX:RTMTotalCountIncrRate=1",
                "-XX:+UseRTMDeopt",
                "-XX:+PrintPreciseRTMLockingStatistics",
                AbortProvoker.class.getName(),
                AbortType.XABORT.toString(),
                Boolean.toString(!useStackLock)
        );

        outputAnalyzer.shouldHaveExitValue(0);

        int firedTraps = RTMTestBase.firedRTMStateChangeTraps(logFileName);

        Asserts.assertEQ(firedTraps, 0,
                "No deoptimizations with rtm_state_change reason are expected");

        List<RTMLockingStatistics> statistics = RTMLockingStatistics.fromString(
                provoker.getMethodWithLockName(), outputAnalyzer.getOutput());

        Asserts.assertEQ(statistics.size(), 0,
                "VM output should not contain RTM locking statistics entries "
                + "for method " + provoker.getMethodWithLockName());
    }

    public static void main(String[] args) throws Throwable {
        new TestNoRTMLockElidingOption().test();
    }
}
