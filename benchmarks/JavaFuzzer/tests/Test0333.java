// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:01 2023
public class Test0333 {

    public static final int N = 400;

    public static long instanceCount = -8319622922667092091L;
    public static int iFld = 0;
    public static double dFld = 0.14716;
    public static float fFld = 2.409F;
    public static long[][] lArrFld = new long[N][N];
    public static int[] iArrFld = new int[N];
    public static long iMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0333.lArrFld, -3658238961L);
        FuzzerUtils.init(Test0333.iArrFld, -27947);
    }

    public volatile int iFld1 = 2;

    public static int iMeth1(int i12) {


        Test0333.iArrFld[(Test0333.iFld >>> 1) % N] = (int) -1077633024596232897L;
        long meth_res = i12;
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public static double dMeth(float f1, int i6) {

        int i7 = 31153, i8 = 41606, i9 = 49019, i10 = 27236, i11 = 41187;
        double[] dArr = new double[N];

        FuzzerUtils.init(dArr, 0.36701);

        for (double d : dArr) {
            Test0333.iFld = (int) ((Test0333.instanceCount - (i6 >>>= Test0333.iFld)) * ((Test0333.iFld + i6) - (--Test0333.iFld)));
        }
        Test0333.iFld -= (int) (((++Test0333.instanceCount) * (Test0333.dFld -= Test0333.iFld)) + i6);
        for (i7 = 22; i7 < 385; i7++) {
            i9 = 1;
            do {
                Test0333.iFld *= (int) (++dArr[i9 + 1]);
                Test0333.iArrFld[(i7 >>> 1) % N] -= (int) (Test0333.instanceCount = Test0333.lArrFld[i7 + 1][i7]);
                for (i10 = 1; i10 < 1; ++i10) {
                    Test0333.iFld -= (-(iMeth1(4023) / 56));
                    f1 *= f1;
                }
                Test0333.dFld = 58;
                Test0333.iArrFld = Test0333.iArrFld;
                f1 += (i9 * i9);
                Test0333.iArrFld[i9] -= (int) Test0333.instanceCount;
                Test0333.instanceCount ^= i6;
            } while (++i9 < 5);
        }
        long meth_res = Float.floatToIntBits(f1) + i6 + i7 + i8 + i9 + i10 + i11 +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        dMeth_check_sum += meth_res;
        return (double) meth_res;
    }

    public static int iMeth(int i1) {

        int i2 = -39254, i3 = 20125, i4 = -132, i5 = -4;
        float f = -70.458F;
        boolean b = true;
        byte by = -63;

        i2 = 1;
        while (++i2 < 225) {
            for (i3 = 7; i3 > 1; --i3) {
                Test0333.instanceCount = (i3 * -88);
                if (b) {
                    Test0333.instanceCount += Test0333.iArrFld[i2 + 1];
                    for (f = i3; 2 > f; f++) {
                        dMeth(f, Test0333.iFld);
                        Test0333.iFld = Test0333.iFld;
                        Test0333.iFld = (int) -58601L;
                        try {
                            i1 = (-96 % i1);
                            i5 = (i3 % 57080);
                            i1 = (49445 % i1);
                        } catch (ArithmeticException a_e) {
                        }
                        i5 -= (int) f;
                    }
                }
                i4 = (int) f;
                i4 -= 51;
                by = (byte) 29147L;
            }
            i1 *= i4;
        }
        long meth_res = i1 + i2 + i3 + i4 + Float.floatToIntBits(f) + i5 + (b ? 1 : 0) + by;
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0333 _instance = new Test0333();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = 42268, i13 = -30687, i14 = -5;
        boolean b1 = true;
        boolean[] bArr = new boolean[N];
        short s = -21428;
        float[] fArr = new float[N];

        FuzzerUtils.init(fArr, 1.91F);
        FuzzerUtils.init(bArr, false);

        Test0333.iFld &= Integer.reverseBytes((int) (-fArr[(Test0333.iFld >>> 1) % N]));
        Test0333.lArrFld[(Test0333.iFld >>> 1) % N] = (Test0333.lArrFld[(Test0333.iFld >>> 1) % N] = (Test0333.lArrFld[(Test0333.iFld >>> 1) %
                N] = (Test0333.lArrFld[(Test0333.iFld >>> 1) % N] = Test0333.lArrFld[(Test0333.iFld >>> 1) % N])));
        i = 1;
        do {
            Test0333.iFld = ((iMeth(Test0333.iFld) + -105) + -9);
            Test0333.iArrFld = Test0333.iArrFld;
            Test0333.iFld >>= i;
            Test0333.lArrFld[i + 1][i - 1] -= (long) Test0333.fFld;
            b1 = b1;
            Test0333.iFld <<= (int) Test0333.instanceCount;
            Test0333.fFld += (((i * Test0333.instanceCount) + i) - Test0333.iFld);
            i13 = 1;
            while (++i13 < 90) {
                i14 = 1;
                do {
                    Test0333.iFld += (23514 + (i14 * i14));
                    Test0333.instanceCount += i13;
                    Test0333.iFld = Test0333.iFld;
                    Test0333.iArrFld[i13] = (int) Test0333.instanceCount;
                    Test0333.iFld -= (int) Test0333.dFld;
                } while (++i14 < 1);
                Test0333.dFld -= Test0333.dFld;
                Test0333.iArrFld[i + 1] = s;
                Test0333.iFld >>>= i13;
                Test0333.iArrFld[(i >>> 1) % N] = i13;
                switch (((i13 % 3) * 5) + 83) {
                    case 85:
                        Test0333.iFld = i;
                        Test0333.iFld += (((i13 * s) + iFld1) - Test0333.iFld);
                        Test0333.iFld >>= i14;
                    case 95:
                        iFld1 = -177;
                        fArr[i] = 126;
                        s = (short) Test0333.instanceCount;
                        break;
                    case 97:
                        iFld1 = (int) -1998616326L;
                        Test0333.lArrFld[i] = Test0333.lArrFld[i13];
                        break;
                    default:
                        bArr[i13] = b1;
                }
            }
        } while (++i < 279);

        FuzzerUtils.out.println("i b1 i13 = " + i + "," + (b1 ? 1 : 0) + "," + i13);
        FuzzerUtils.out.println("i14 s fArr = " + i14 + "," + s + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));
        FuzzerUtils.out.println("bArr = " + FuzzerUtils.checkSum(bArr));

        FuzzerUtils.out.println("Test0333.instanceCount Test0333.iFld Test0333.dFld = " + Test0333.instanceCount + "," + Test0333.iFld +
                "," + Double.doubleToLongBits(Test0333.dFld));
        FuzzerUtils.out.println("Test0333.fFld iFld1 Test0333.lArrFld = " + Float.floatToIntBits(Test0333.fFld) + "," + iFld1 + ","
                + FuzzerUtils.checkSum(Test0333.lArrFld));
        FuzzerUtils.out.println("Test0333.iArrFld = " + FuzzerUtils.checkSum(Test0333.iArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  dMeth ->  dMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 dMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
