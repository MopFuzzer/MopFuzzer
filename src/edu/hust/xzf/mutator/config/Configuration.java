package edu.hust.xzf.mutator.config;

public class Configuration {

    //    public static final String TEMP_FILES_PATH = ".temp/";

    public static final int LinuxTimeout = 1000;
    public static final long SHELL_RUN_TIMEOUT = 300L;
    public static final long TEST_SHELL_RUN_TIMEOUT = LinuxTimeout + 15;
    public static final String TEMP_FILES_PATH = "mutants/";
    public final String osName = System.getProperty("os.name");
    public String projectPath;
    public String javaFilePath;

    public String targetCase;
    public String JDKRoot;

    public static String secondJDK;
    public static int lineNumber = -1;
    public String java;
    public String javac;
    public String classPathSplitter;

    public static int JDK_level;

    public static boolean isWin;

    //    private final String add_export = "--add-exports java.base/sun.nio.cs=ALL-UNNAMED "
//            + "--add-exports java.base/jdk.internal.vm.annotation=ALL-UNNAMED "
//            + "--add-exports java.base/jdk.internal.access=ALL-UNNAMED "
//            + "--add-exports java.base/jdk.internal.reflect=ALL-UNNAMED "
//            + "--add-exports java.base/jdk.internal.util=ALL-UNNAMED "
//            + "--add-exports java.base/jdk.internal.org.objectweb.asm=ALL-UNNAMED ";
    public static final String profileFlags = " -XX:+TraceLoopOpts -XX:+PrintCEE -XX:+PrintInlining -XX:+TraceDeoptimization -XX:+PrintEscapeAnalysis" +
            " -XX:+PrintEliminateLocks -XX:+PrintOptoStatistics -XX:+PrintEliminateAllocations -XX:+PrintBlockElimination -XX:+PrintPhiFunctions" +
            " -XX:+PrintCanonicalization -XX:+PrintNullCheckElimination -XX:+TraceRangeCheckElimination -XX:+PrintOptimizePtrCompare ";

    public boolean isCompiler;

    public String jtregTestsRoot;
    public String jtregTestsRoot_bk;

    public String jtreg;

    public String testLibRoot;
    public String javaFuzzerRoot;

    public String test_jdk = null;

    public static boolean disableRandomOptions = false;

    public static final int MaxHitMutatorTimes = 5;
    public static int maxIter = 50;
    public static boolean usejTreg = false;

    public Configuration() {

    }

    public void settingAll() {
        this.javaFilePath = projectPath + "/" + targetCase.replace(".", "/") + ".java";
        isWin = osName.toLowerCase().contains("windows");
        // jdk root = D:/repository/jdk11u/build/windows-x86_64-normal-server-fastdebug/images/jdk/bin/
        String jdk_repo = JDKRoot.substring(0, JDKRoot.indexOf("build"));
        if (isWin) {
            this.javac = JDKRoot + "/javac.exe -Xlint:none ";
            this.java = JDKRoot + "/java.exe ";
            this.classPathSplitter = ";";
        } else {
            this.javac = JDKRoot + "/javac -Xlint:none ";
            this.java = JDKRoot + "/java ";
            this.classPathSplitter = ":";
            if (jdk_repo.contains("openj9")) {
                this.javac = "/home/xiezf/tools/jdk-20.0.1/bin/javac -Xlint:none ";
                this.java += "-Xshareclasses ";
            }
        }
        // D:/repository/jdk11u/test/hotspot/jtreg
        isCompiler = this.targetCase.contains("compiler.") || this.targetCase.contains("History.");
        if (isCompiler) test_jdk = " -D\"test.jdk=" + JDKRoot.substring(0, JDKRoot.indexOf("bin")) + "\" ";
        else javaFuzzerRoot = "benchmarks/JavaFuzzer/";

        if (JDK_level != 8) {
            jtregTestsRoot = jdk_repo + "test/hotspot/jtreg/";
            jtregTestsRoot_bk = jdk_repo + "test/hotspot/jtreg_bk/";
            testLibRoot = jdk_repo + "test/lib/";
        } else {
            jtregTestsRoot = jdk_repo + "hotspot/test/";
            jtregTestsRoot_bk = jdk_repo + "hotspot/test_bk/";
            testLibRoot = jdk_repo + "hotspot/test/testlibrary/" + classPathSplitter + jdk_repo + "jdk/test/lib/";
        }

        jtreg = "java -jar jtreg/lib/jtreg.jar ";
        // clean jdk repo
//        try {
//            String reset_cmd = "cd " + jdk_repo + (isWin ? ";" : "&&") + " git checkout -- .";
//            Process pr = runCmd(reset_cmd);
//            ShellUtils.getShellOut(pr, 1, "logs/compile_log.log");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


//        if (JDK_level == 11) {
//            additionalOptions += " -XX:+IgnoreUnrecognizedVMOptions -XX:+UnlockDiagnosticVMOptions -XX:+UnlockExperimentalVMOptions -Xcomp -ea " +
//                    "-XX:+AssertRangeCheckElimination -XX:+StressLoopInvariantCodeMotion -XX:+StressRangeCheckElimination -XX:+AlwaysIncrementalInline " +
//                    "-XX:+StressLinearScan -XX:+BailoutToInterpreterForThrows -XX:+PostLoopMultiversioning -XX:+StressArrayCopyMacroNode " +
//                    "-XX:+AlwaysIncrementalInline -XX:+AlwaysSafeConstructors -XX:+TieredCompilation " +
//                    "-XX:+AggressiveUnboxing -XX:+BailoutToInterpreterForThrows -XX:+SuperWordLoopUnrollAnalysis";
//        } else if (JDK_level == 17) {
//            additionalOptions += " -XX:+IgnoreUnrecognizedVMOptions -XX:+UnlockDiagnosticVMOptions -XX:+UnlockExperimentalVMOptions -Xcomp -ea " +
//                    "-XX:+AssertRangeCheckElimination -XX:+StressLoopInvariantCodeMotion -XX:+StressRangeCheckElimination -XX:+AlwaysIncrementalInline " +
//                    "-XX:+StressLinearScan -XX:+BailoutToInterpreterForThrows -XX:+PostLoopMultiversioning -XX:+StressArrayCopyMacroNode " +
//                    "-XX:+EnableVectorAggressiveReboxing -XX:+EnableVectorReboxing -XX:+AlwaysIncrementalInline " +
//                    "-XX:+EnableVectorSupport -XX:+ExpandSubTypeCheckAtParseTime -XX:+IncrementalInlineForceCleanup " +
//                    "-XX:+StressMethodHandleLinkerInlining -XX:+TieredCompilation -XX:+SuperWordLoopUnrollAnalysis " +
//                    "-XX:+AggressiveUnboxing -XX:+BailoutToInterpreterForThrows ";
//        } else if (JDK_level == 22) {
//            additionalOptions += " -XX:+IgnoreUnrecognizedVMOptions -XX:+UnlockDiagnosticVMOptions -XX:+UnlockExperimentalVMOptions -Xcomp -ea " +
//                    "-XX:+AssertRangeCheckElimination -XX:+StressLoopInvariantCodeMotion -XX:+StressRangeCheckElimination -XX:+AlwaysIncrementalInline " +
//                    "-XX:+StressLinearScan -XX:+BailoutToInterpreterForThrows -XX:+PostLoopMultiversioning -XX:+StressArrayCopyMacroNode " +
//                    "-XX:+EnableVectorAggressiveReboxing -XX:+EnableVectorReboxing -XX:+AlwaysIncrementalInline " +
//                    "-XX:+EnableVectorSupport -XX:+ExpandSubTypeCheckAtParseTime -XX:+IncrementalInlineForceCleanup " +
//                    "-XX:+StressMethodHandleLinkerInlining -XX:+TieredCompilation -XX:+SuperWordLoopUnrollAnalysis " +
//                    "-XX:+AggressiveUnboxing -XX:+BailoutToInterpreterForThrows ";
//        }
    }
}
