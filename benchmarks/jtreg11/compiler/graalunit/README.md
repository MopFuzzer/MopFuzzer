This directory contains jtreg tests which are wrapper tests to execute Graal unit tests similar way they are run in
Graal project.
The tests use compiler.graalunit.common.GraalUnitTestLauncher helper class to run Graal unit tests where the set of
tests to execute
is specified by '-prefix' argument. GraalUnitTestLauncher launches ported com.oracle.mxtool.junit.MxJUnitWrapper to run
Graal unit
tests as it is done by "mx unittest" command from Graal project.

All compiler/graalunit/*.java tests were automatically generated by generateTests.sh script which reads
"testName -> testPrefix [requiresStatement]" mapping from TestPackages.txt file and generates corresponding <testName>
Test.java
tests. The mapping takes into account tests execution time to avoid very long test runs.

Graal unit tests depends on following external jar files:
asm-5.0.4.jar:
https://lafo.ssw.uni-linz.ac.at/pub/graal-external-deps/asm-5.0.4.jar

asm-tree-5.0.4.jar:
https://lafo.ssw.uni-linz.ac.at/pub/graal-external-deps/asm-tree-5.0.4.jar

junit-4.12.jar:
https://lafo.ssw.uni-linz.ac.at/pub/graal-external-deps/junit-4.12.jar

hamcrest-core-1.3.jar:
https://lafo.ssw.uni-linz.ac.at/pub/graal-external-deps/hamcrest-core-1.3.jar

java-allocation-instrumenter.jar:
https://lafo.ssw.uni-linz.ac.at/pub/java-allocation-instrumenter/java-allocation-instrumenter-8f0db117e64e.jar

Before running the tests you need to download these jars from above locations in build/<platform>
/images/test/hotspot/jtreg/graal/
directory. Then you can pass it to jtreg as java option by using "-vmoptions:-Dgraalunit.libs="  or as environment
variable
by using "-e:TEST_IMAGE_GRAAL_DIR=..."

Example:
> jtreg -vt -jdk:<TESTED_JDK> -vmoptions:"-vmoptions:-Dgraalunit.libs=build/<platform>/images/test/hotspot/jtreg/graal"
> compiler/graalunit/UtilTest.java

To run Graal unit tests in Graal as JIT mode pass additional -vmoptions to jtreg:
-XX:+UnlockExperimentalVMOptions -XX:+EnableJVMCI -XX:+TieredCompilation -XX:+UseJVMCICompiler -Djvmci.Compiler=graal
