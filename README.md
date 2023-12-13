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

## Confirmed Bugs

Since unconfirmed bugs cannot be shown in Java Bug System(JBS), we only show the bugs that are confirmed by developers. 

| Bug ID      | Affected Versions | Link                                        |
| ----------- | ----------------- | ------------------------------------------- |
| JDK-8312741 | 11                | https://bugs.openjdk.org/browse/JDK-8312741 |
| JDK-8312438 | 11                | https://bugs.openjdk.org/browse/JDK-8312438 |
| JDK-8312744 | 22                | https://bugs.openjdk.org/browse/JDK-8312744 |
| JDK-8312748 | 22                | https://bugs.openjdk.org/browse/JDK-8312748 |
| JDK-8315916 | 17,20,21,22       | https://bugs.openjdk.org/browse/JDK-8315916 |
| JDK-8313405 | 17                | https://bugs.openjdk.org/browse/JDK-8313405 |
| JDK-8313992 | 17                | https://bugs.openjdk.org/browse/JDK-8313992 |
| JDK-8316862 | 8                 | https://bugs.openjdk.org/browse/JDK-8316862 |
| JDK-8318291 | 8                 | https://bugs.openjdk.org/browse/JDK-8318291 |
| JDK-8318886 | 8                 | https://bugs.openjdk.org/browse/JDK-8318886 |
| JDK-8316863 | 8                 | https://bugs.openjdk.org/browse/JDK-8316863 |
| JDK-8317504 | 8                 | https://bugs.openjdk.org/browse/JDK-8317504 |
| JDK-8317506 | 8                 | https://bugs.openjdk.org/browse/JDK-8317506 |
| JDK-8316864 | 8                 | https://bugs.openjdk.org/browse/JDK-8316864 |
| JDK-8316950 | 8                 | https://bugs.openjdk.org/browse/JDK-8316950 |
| JDK-8316951 | 8                 | https://bugs.openjdk.org/browse/JDK-8316951 |
| JDK-8317299 | 17,20,22          | https://bugs.openjdk.org/browse/JDK-8317299 |
| JDK-8317823 | 8                 | https://bugs.openjdk.org/browse/JDK-8317823 |
| JDK-8317865 | 8                 | https://bugs.openjdk.org/browse/JDK-8317865 |
| JDK-8316865 | 8                 | https://bugs.openjdk.org/browse/JDK-8316865 |
| JDK-8316866 | 8,11              | https://bugs.openjdk.org/browse/JDK-8316866 |
| JDK-8316952 | 8                 | https://bugs.openjdk.org/browse/JDK-8316952 |
| JDK-8317301 | 8                 | https://bugs.openjdk.org/browse/JDK-8317301 |
| JDK-8316939 | 8                 | https://bugs.openjdk.org/browse/JDK-8316939 |
| JDK-8317578 | 8,11              | https://bugs.openjdk.org/browse/JDK-8317578 |
| JDK-8317576 | 8                 | https://bugs.openjdk.org/browse/JDK-8317576 |
| JDK-8317816 | 8                 | https://bugs.openjdk.org/browse/JDK-8317816 |
| JDK-8316937 | 8                 | https://bugs.openjdk.org/browse/JDK-8316937 |
| JDK-8316949 | 8                 | https://bugs.openjdk.org/browse/JDK-8316949 |
| JDK-8317236 | 8                 | https://bugs.openjdk.org/browse/JDK-8317236 |
| JDK-8317346 | 8                 | https://bugs.openjdk.org/browse/JDK-8317346 |

