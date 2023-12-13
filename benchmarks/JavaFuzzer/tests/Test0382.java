// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:02 2023
public class Test0382 {

    public static final int N = 400;

    public static volatile long instanceCount = 68L;
    public static volatile int iFld = 49;
    public static int[] iArrFld = new int[N];
    public static long[] lArrFld = new long[N];
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0382.iArrFld, 187);
        FuzzerUtils.init(Test0382.lArrFld, -8L);
    }

    public static void vMeth() {


        Test0382.iFld += Test0382.iFld;
        Test0382.iFld <<= 57797;
        vMeth_check_sum += 0;
    }

    public static int iMeth1(int i8, long l) {

        int i9 = -12, i10 = -120, i11 = 128, i12 = 8729, i13 = -122;
        float f1 = 40.768F;
        byte by1 = -99;

        i9 = 1;
        do {
            i8 = i8;
            i8 <<= (Test0382.iArrFld[i9 + 1]++);
            vMeth();
        } while (++i9 < 146);
        for (i10 = 293; i10 > 8; --i10) {
            Test0382.iFld |= Test0382.iFld;
            Test0382.iFld += i10;
            Test0382.iFld = 5770;
        }
        i11 /= (int) (i10 | 1);
        for (i12 = 7; i12 < 344; ++i12) {
            Test0382.iFld = (int) f1;
            by1 <<= (byte) i10;
            Test0382.iFld += (int) Test0382.instanceCount;
            Test0382.iFld += i12;
            Test0382.iArrFld[i12] = i12;
        }
        long meth_res = i8 + l + i9 + i10 + i11 + i12 + i13 + Float.floatToIntBits(f1) + by1;
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public static int iMeth(int i, int i1) {

        int i2 = -9154, i3 = 17521, i4 = -20721, i5 = 9, i6 = 162, i7 = 10;
        boolean b = false;
        double[] dArr = new double[N];
        byte[] byArr = new byte[N];

        FuzzerUtils.init(dArr, -47.81140);
        FuzzerUtils.init(byArr, (byte) 113);

        Test0382.iArrFld[(i >>> 1) % N] -= (int) (-3885317477371174322L * (Test0382.lArrFld[(-115 >>> 1) % N] - (i1--)));
        Test0382.instanceCount += (long) ((dArr[(Test0382.iFld >>> 1) % N]++) * (Test0382.iArrFld[(i >>> 1) % N] +
                (Test0382.iArrFld[(-247 >>> 1) % N]++)));
        Test0382.iFld -= (int) (-42714 + (Test0382.instanceCount - Math.abs(i1)));
        for (i2 = 9; i2 < 273; ++i2) {
            i1 = (byArr[i2 - 1] * (++i3));
            for (i4 = i2; i4 < 6; ++i4) {
                i3 += i4;
                b = ((byArr[(i4 >>> 1) % N]--) <= (Test0382.iFld--));
                if (b) {
                    i5 += (int) (dArr[i2 + 1] + -40.664F);
                    for (i6 = i2; 1 > i6; ++i6) {
                        Test0382.iFld += (69 + (i6 * i6));
                        Test0382.iFld += (int) (221L + (i6 * i6));
                        Test0382.instanceCount -= (i1 - (i1++));
                        i5 = i2;
                    }
                } else {
                    Test0382.instanceCount += iMeth1(i1, 3639230045L);
                }
            }
        }
        long meth_res = i + i1 + i2 + i3 + i4 + i5 + (b ? 1 : 0) + i6 + i7 +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(byArr);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0382 _instance = new Test0382();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        float f = -2.958F;
        double d = 2.126548;
        byte by = -5;
        int[] iArr = new int[N];

        FuzzerUtils.init(iArr, 17595);

        f = (float) (--d);
        by += (byte) (((Test0382.iFld | Test0382.iFld) + (-2720087463L + (Test0382.iFld = Test0382.iFld))) - ((++iArr[(Test0382.iFld >>> 1)
                % N]) - iMeth(-8, Test0382.iFld)));

        FuzzerUtils.out.println("f d by = " + Float.floatToIntBits(f) + "," + Double.doubleToLongBits(d) + "," + by);
        FuzzerUtils.out.println("iArr = " + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test0382.instanceCount Test0382.iFld Test0382.iArrFld = " + Test0382.instanceCount + "," + Test0382.iFld +
                "," + FuzzerUtils.checkSum(Test0382.iArrFld));
        FuzzerUtils.out.println("Test0382.lArrFld = " + FuzzerUtils.checkSum(Test0382.lArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}