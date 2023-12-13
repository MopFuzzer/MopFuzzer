import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class TestLogSum {
    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            for (int n = 2; n < 30; n++) {
                for (int j = 1; j <= n; j++) {
                    for (int k = 1; k <= j; k++) {
                        System.out.println(computeSum(k, j));
                    }
                }
            }
        }
    }

    private static Map<List<Integer>, Double> cache = new HashMap<List<Integer>, Double>();
    public static double computeSum(int x, int y) {
        List<Integer> key = Arrays.asList(new Integer[] {x, y});

        if (!cache.containsKey(key)) {

            // explicitly creating/updating a double[] array, instead of using the LogSumArray wrapper object, will prevent the error
            LogSumArray toReturn = new LogSumArray(x);

            // changing loop indices will prevent the error
            // in particular, for(z=0; z<x-1; z++), and then using z+1 in place of z, will not produce error
// for (int z = 0; z < x; z++) {
// double logSummand = Math.log(1 + z + x + y);
            for (int z = 1; z < x+1; z++) {
                double logSummand = Math.log(z + x + y);
                toReturn.addLogSummand(logSummand);
            }

            // returning the value here without cacheing it will prevent the segfault
            cache.put(key, toReturn.retrieveLogSum());
        }
        return cache.get(key);
    }

    /*
     * Given a bunch of logarithms log(X),log(Y),log(Z),...
     * This class is used to compute the log of the sum, log(X+Y+Z+...)
     */
    private static class LogSumArray {
        private double[] logSummandArray;
        private int currSize;

        private double maxLogSummand;

        public LogSumArray(int maxEntries) {
            this.logSummandArray = new double[maxEntries];

            this.currSize = 0;
            this.maxLogSummand = Double.NEGATIVE_INFINITY;
        }

        public void addLogSummand(double logSummand) {
            logSummandArray[currSize] = logSummand;
            currSize++;
            // removing this line will prevent the error
            maxLogSummand = Math.max(maxLogSummand, logSummand);
        }

        public double retrieveLogSum() {
            if (maxLogSummand == Double.NEGATIVE_INFINITY) return Double.NEGATIVE_INFINITY;

            assert currSize <= logSummandArray.length;

            double factorSum = 0;
            for (int i = 0; i < currSize; i++) {
                factorSum += Math.exp(logSummandArray[i] - maxLogSummand);
            }

            return Math.log(factorSum) + maxLogSummand;
        }
    }
}
