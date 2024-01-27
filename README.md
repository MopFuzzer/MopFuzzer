# MopFuzzer

 
This is a supplementary repository for paper submission Validating JVM Compilers via Maximizing Optimization Interleaving.

## The designed optimization evoking mutators

In this work, we designed 13 Optimization Evoking Mutators, which aim to trigger primarily the following optimization behaviors respectively: LoopUnrolling, LockElimination, LockCoarsening, Inlining, DeReflection, LoopPeeling, LoopUnswitching, Deoptimization, AutoboxElimination, RedundantStoreElimination, AlgebraicSimplification, EscapeAnalysis, DeadCodeElimination.

The remaining mutators can be found at the **[Supplementary Material](SupplementaryMaterial.pdf)** of the paper.


## Usage of MopFuzzer

### Step 1: Prerequisites

MopFuzzer needs the debug build of JVM, so users should download the source code of JVM and set the debug flag. Here we take the OpenJDK17 as an example.

```
# git clone https://github.com/openjdk/jdk17u.git
# cd jdk17u
# bash configure --enable-debug
# make images
```

### Step 2: Run the tool

MopFuzzer is developed as a maven project using JDK17, so to configure and run MopFuzzer, you can import it directly into your IntelliJ IDEA workspace as a maven project. 

To use MopFuzzer, users should specify the target test case, the path of the debug build of JVM, the path of the second JVM (if perform differential testing). The following is Parameters of running MopFuzzer.

```
 -jdk <arg>                      the jdk directory, path to jdk/bin/
 -jdk_level <arg>                the jdk level, e.g., 8
 -project_path <arg>             Directory of test case. e.g., benchmarks/jtreg17
 -target_case <arg>              Target java file. e.g., a.b.c denotes a/b/c.java
 -max_iter <arg>                 Max iteration times, default is 50. Not necessary.                                
 -secondJDK <arg>                Second jdk path (if perform differential testing). Not necessary.
 -isUseJtreg <arg>               use Jtreg? e.g., default is false. Not necessary.
 -line_number <arg>              line number of target file to be mutated. e.g., 10. Not necessary.

```

### Example. 

The JDK in the environment variable should >= JDK17, and the target test case is compiler.c1.Test8172751 in benchmarks/jtreg17/

```
mvn exec:java -D"--project_path benchmarks/jtreg17/ --target_case compiler.c1.Test8172751 --jdk D:/repository/jdk17u/build/windows-x86_64-server-fastdebug/jdk/bin --jdk_level 17"
```

## Show Cases of detected Bugs

<details>
<summary><b>JDK-8322743</b></summary>

[JDK-8322743: assert(held_monitor_count() == jni_monitor_count())](https://bugs.openjdk.org/browse/JDK-8322743)

```java
synchronized void write(char[] data, int offset, int length) throws IOException {
        while (--length >= 0) {
            synchronized (new Test8267042()) {
                int var1 = 0;
                while (var1 < 100000) {
                    if (var1 == 50000) {
                        getZeroOnStack(offset);
                    }
                    var1++;
                }
            }
            // original code
            // getZeroOnStack(offset);
            write(data[offset++]);
        }
    }
```

</details>


The cause of this bug lies in improper operations during the Just-In-Time (JIT) compiler's escape analysis and On-Stack Replacement (OSR) transformation. 

This bug involves optimization processes including escape analysis and lock optimization. Specifically, JVM incorrectly identifies certain objects as non-escaping during escape analysis, leading to incorrect handling of these objects' lock states in the On-Stack Replacement (OSR) transformation, which triggers a crash.

<details>
<summary><b>JDK-8324174</b></summary>

[JDK-8324174: assert(m->is_entered(current)) failed: invariant](https://bugs.openjdk.org/browse/JDK-8324174)

```java
public class Test {

    public static final int CHUNK = 10000;
    public static ArrayList<Object> arr = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            synchronized (Test.class){
                synchronized (new Test()) {
                    synchronized (Test.class){
                        arr.add(new byte[CHUNK]);
                    }
                }
            }
        }
    }
}

```

</details>


The cause of this bug is improper handling of nested synchronized locks during the deoptimization process. The bug involves optimization processes related to deoptimization and the maintenance of synchronized locks.

JVM attempts to eliminate nested locks and locks on non-escaping allocations in the C2 compiler optimization behavior, but during deoptimization, it handles the unlocking and relocking sequence improperly (starting from the inner frame instead of the outer frame), leading to a crash during the deoptimization process.




<details>
<summary><b>OpenJ9 Issue #18756</b></summary>

[Issue #18756 · eclipse-openj9/openj9 (github.com)](https://github.com/eclipse-openj9/openj9/issues/18756)

```java
public class Test {
    public static final int N = 400;

    public static long instanceCount = 3L;
    public static int[] iArrFld = new int[N];

    public void mainTest(String[] strArr1) {
        for (int i0 = 0; i0 < N; i0++) {
            Test.iArrFld[i0] = -1;
        }

        for (int i14 = 343; i14 > 21; --i14) {
            Test.instanceCount += (i14 ^ Test.instanceCount);
        }

        for (int i1 = 0; i1 < N; ++i1) {
            for (int var6 = 0; var6 < 10000; ++var6) { if (var6 == 4) { } }

            int[] tmp = new int[N];
            for (int i2 = 0; i2 < N; i2++) {
                tmp[i2] = 9;
            }
            Test.iArrFld = tmp;

            for (int i18 = 3; i18 < 63; i18++) {
                Test.iArrFld[i18 - 1] <<= (int) Test.instanceCount;
            }
        }

        long sum = 0;
        for (int i : Test.iArrFld) {
            sum += i;
        }
        System.out.println("sum: " + sum);
    }

    public static void main(String[] strArr) {
        Test _instance = new Test();
        _instance.mainTest(strArr);
    }
}
```
</details>



The cause of this bug is the improper handling of shift operation codes by the JVM during automatic SIMD (Single Instruction, Multiple Data) optimization, leading to behavior inconsistent with Java semantics. This bug involves the optimization process of automatic SIMD optimization. Specifically, the JVM improperly handled the VSHL (Vector Shift Left) operation code during the execution of automatic SIMD optimization.


## Confirmed Bugs

Since unconfirmed bugs cannot be shown in Java Bug System(JBS), we only show the bugs that are confirmed by developers.



### OpenJDK Bugs

| Bug ID      | Affected Versions         | Link                                        |
| ----------- | ------------------------- | ------------------------------------------- |
| JDK-8312741 | 11                        | https://bugs.openjdk.org/browse/JDK-8312741 |
| JDK-8312438 | 11                        | https://bugs.openjdk.org/browse/JDK-8312438 |
| JDK-8322743 | 8, 11, 17, 20, 21, 22, 23 | https://bugs.openjdk.org/browse/JDK-8322743 |
| JDK-8324174 | 8, 11, 17, 21, 22, 23     | https://bugs.openjdk.org/browse/JDK-8324174 |
| JDK-8312744 | 22                        | https://bugs.openjdk.org/browse/JDK-8312744 |
| JDK-8312748 | 22                        | https://bugs.openjdk.org/browse/JDK-8312748 |
| JDK-8315916 | 17,20,21,22               | https://bugs.openjdk.org/browse/JDK-8315916 |
| JDK-8324739 | 17.0.10-oracle            | https://bugs.openjdk.org/browse/JDK-8324739 |
| JDK-8313405 | 17                        | https://bugs.openjdk.org/browse/JDK-8313405 |
| JDK-8313992 | 17                        | https://bugs.openjdk.org/browse/JDK-8313992 |
| JDK-8313405 | 17                        | https://bugs.openjdk.org/browse/JDK-8313405 |
| JDK-8323507 | 22                        | https://bugs.openjdk.org/browse/JDK-8323507 |
| JDK-8324339 | 8                         | https://bugs.openjdk.org/browse/JDK-8324339 |
| JDK-8316862 | 8                         | https://bugs.openjdk.org/browse/JDK-8316862 |
| JDK-8318291 | 8                         | https://bugs.openjdk.org/browse/JDK-8318291 |
| JDK-8318886 | 8                         | https://bugs.openjdk.org/browse/JDK-8318886 |
| JDK-8316863 | 8                         | https://bugs.openjdk.org/browse/JDK-8316863 |
| JDK-8317504 | 8                         | https://bugs.openjdk.org/browse/JDK-8317504 |
| JDK-8317506 | 8                         | https://bugs.openjdk.org/browse/JDK-8317506 |
| JDK-8316864 | 8                         | https://bugs.openjdk.org/browse/JDK-8316864 |
| JDK-8316950 | 8                         | https://bugs.openjdk.org/browse/JDK-8316950 |
| JDK-8316951 | 8                         | https://bugs.openjdk.org/browse/JDK-8316951 |
| JDK-8317299 | 17,20,22                  | https://bugs.openjdk.org/browse/JDK-8317299 |
| JDK-8317823 | 8                         | https://bugs.openjdk.org/browse/JDK-8317823 |
| JDK-8317865 | 8                         | https://bugs.openjdk.org/browse/JDK-8317865 |
| JDK-8316865 | 8                         | https://bugs.openjdk.org/browse/JDK-8316865 |
| JDK-8316866 | 8,11                      | https://bugs.openjdk.org/browse/JDK-8316866 |
| JDK-8323686 | 11                        | https://bugs.openjdk.org/browse/JDK-8323686 |
| JDK-8316952 | 8                         | https://bugs.openjdk.org/browse/JDK-8316952 |
| JDK-8317301 | 8                         | https://bugs.openjdk.org/browse/JDK-8317301 |
| JDK-8316939 | 8                         | https://bugs.openjdk.org/browse/JDK-8316939 |
| JDK-8317578 | 8,11                      | https://bugs.openjdk.org/browse/JDK-8317578 |
| JDK-8317576 | 8                         | https://bugs.openjdk.org/browse/JDK-8317576 |
| JDK-8317816 | 8                         | https://bugs.openjdk.org/browse/JDK-8317816 |
| JDK-8316937 | 8                         | https://bugs.openjdk.org/browse/JDK-8316937 |
| JDK-8316949 | 8                         | https://bugs.openjdk.org/browse/JDK-8316949 |
| JDK-8317236 | 8                         | https://bugs.openjdk.org/browse/JDK-8317236 |
| JDK-8317346 | 8                         | https://bugs.openjdk.org/browse/JDK-8317346 |

### OpenJ9 Bugs

| Issue ID     | Link                                                  |
| ------------ | ----------------------------------------------------- |
| Issue #18756 | https://github.com/eclipse-openj9/openj9/issues/18756 |
| Issue #18765 | https://github.com/eclipse-openj9/openj9/issues/18765 |
| Issue #18777 | https://github.com/eclipse-openj9/openj9/issues/18777 |







