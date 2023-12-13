#!/bin/sh
export RESULTS_DIR=${RESULTS_DIR:-"."}
export TEST_DIR="$(dirname $(readlink -f "$0"))"
export JAVA_UNDER_TEST="${JAVA_UNDER_TEST:-"/home/xiezf/tools/jdk1.8.0_301/bin/java"}"
export JAVA_UNDER_TEST_OPTS="${JAVA_UNDER_TEST_OPTS:-"-Xmx1G "}"
${JAVA_UNDER_TEST} ${JAVA_UNDER_TEST_OPTS} ${JAVA_ADD_OPTS} -cp ${TEST_DIR} Test >${RESULTS_DIR}/rt_out_rerun 2>${RESULTS_DIR}/rt_err_rerun
diff -I ".*CompilerOracle.*" ${TEST_DIR}/rt_out_ref ${RESULTS_DIR}/rt_out_rerun
res_out=$?
diff -I ".*CompilerOracle.*" ${TEST_DIR}/rt_err_ref ${RESULTS_DIR}/rt_err_rerun
res_err=$?
exit $(( res_out + res_err))
