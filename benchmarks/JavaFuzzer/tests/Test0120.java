// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:55 2023
public class Test0120 {

    public static final int N = 400;

    public static volatile long instanceCount = 1182L;
    public static boolean bFld = false;
    public static float fFld = 96.39F;
    public static int iFld = 7;
    public static int iFld1 = 5503;
    public static int[] iArrFld = new int[N];
    public static volatile float[] fArrFld = new float[N];
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0120.iArrFld, 57257);
        FuzzerUtils.init(Test0120.fArrFld, 4.502F);
    }

    public volatile double dFld = -52.98067;
    public short sFld = -932;

    public static int iMeth1(long l1, int i4, int i5) {


        i5 = i5;
        long meth_res = l1 + i4 + i5;
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0120 _instance = new Test0120();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public int iMeth(long l) {

        int i2 = -52013, i3 = 9, i6 = 159, i7 = -75, i8 = -551, i9 = -207, i10 = 6831;
        long l2 = -2L;
        byte by1 = 42;

        for (i2 = 9; i2 < 287; ++i2) {
            Test0120.iArrFld[i2] = (int) -9195077307013798274L;
        }
        i3 *= (int) (iMeth1(Test0120.instanceCount, i3, i2) - Test0120.instanceCount);
        i3 -= i3;
        for (i6 = 219; 13 < i6; --i6) {
            for (i8 = 1; 8 > i8; ++i8) {
                for (l2 = 1; l2 < 2; l2++) {
                    i3 = i8;
                    i3 -= i3;
                    i3 += -177;
                    try {
                        Test0120.iArrFld[i8] = (i2 / i2);
                        i9 = (i8 / -48774);
                        i10 = (i3 / 123);
                    } catch (ArithmeticException a_e) {
                    }
                    i10 >>= i8;
                    by1 = (byte) 9;
                }
                if (i7 != 0) {
                }
            }
            Test0120.fFld += i6;
        }
        long meth_res = l + i2 + i3 + i6 + i7 + i8 + i9 + l2 + i10 + by1;
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public void vMeth() {

        byte by = 113;
        int i = 233;
        int i1 = 1;
        int i11 = 244;
        int i12 = -139;
        int[] iArr = new int[N];
        float f = 0.817F;
        double d = 35.49451;
        double[] dArr = new double[N];
        short s = 18989;

        FuzzerUtils.init(iArr, 1);
        FuzzerUtils.init(dArr, -25.122304);

        by = (byte) Test0120.instanceCount;
        iArr[(i >>> 1) % N] <<= (--i);
        f = 1;
        do {
            Test0120.fFld += (f + i);
            for (d = 1; 5 > d; d++) {
                Test0120.fFld += (float) (((d * Test0120.instanceCount) + f) - Test0120.instanceCount);
                s = (short) dArr[(int) (f + 1)];
                iMeth(Test0120.instanceCount);
            }
            i -= (int) Test0120.instanceCount;
            Test0120.instanceCount -= i;
            i += (int) ((long) f | Test0120.instanceCount);
            for (i11 = 1; 5 > i11; ++i11) {
                i1 = i12;
                i1 += (i11 * i1);
                Test0120.instanceCount += i11;
            }
        } while (++f < 309);
        vMeth_check_sum += by + i + Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i1 + s + i11 + i12 +
                FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        int i13 = 118, i14 = 0, i15 = 66, i16 = 51677, i17 = -31984, i18 = -30;
        byte by2 = 58;
        long[] lArr = new long[N];
        double[] dArr1 = new double[N];

        FuzzerUtils.init(lArr, 68L);
        FuzzerUtils.init(dArr1, 0.17479);

        Test0120.bFld = Test0120.bFld;
        vMeth();
        for (i13 = 5; i13 < 162; ++i13) {
            Test0120.iFld += (int) 14L;
            switch ((i13 % 9) + 121) {
                case 121:
                    i14 -= (int) Test0120.instanceCount;
                    for (i15 = i13; i15 < 160; ++i15) {
                        for (i17 = 1; i17 < 1; ++i17) {
                            Test0120.instanceCount = Test0120.instanceCount;
                            Test0120.instanceCount += (long) dFld;
                            dFld = Test0120.iFld;
                            Test0120.iFld = (int) Test0120.instanceCount;
                            Test0120.fFld = by2;
                            Test0120.fArrFld[i13] = i14;
                            Test0120.iFld -= 9;
                            switch (((i13 % 8) * 5) + 53) {
                                case 78:
                                    try {
                                        Test0120.iFld = (Test0120.iFld % i14);
                                        Test0120.iArrFld[i13] = (-16974 % i14);
                                        i16 = (-34162 / Test0120.iArrFld[i13 - 1]);
                                    } catch (ArithmeticException a_e) {
                                    }
                                    break;
                                case 84:
                                    Test0120.fFld += i17;
                                    i16 += (((i17 * i17) + i14) - Test0120.instanceCount);
                                    Test0120.iArrFld[i17 + 1] = (int) dFld;
                                    Test0120.iArrFld[i15] *= i13;
                                    break;
                                case 82:
                                    Test0120.iArrFld = Test0120.iArrFld;
                                    Test0120.iFld += (-181 + (i17 * i17));
                                    Test0120.iFld += (((i17 * i17) + Test0120.fFld) - Test0120.iFld);
                                    i14 = i15;
                                case 86:
                                    Test0120.iFld = i17;
                                    break;
                                case 74:
                                    Test0120.iFld = -212;
                                    i18 -= (int) Test0120.instanceCount;
                                    i18 -= (int) Test0120.instanceCount;
                                    i16 = i18;
                                case 71:
                                    i14 <<= i13;
                                    break;
                                case 55:
                                    lArr[i15 - 1] = Test0120.instanceCount;
                                    break;
                                case 76:
                                    i16 = -183;
                                    break;
                                default:
                                    i14 *= -9;
                            }
                        }
                    }
                    break;
                case 122:
                    i16 <<= (int) Test0120.instanceCount;
                    break;
                case 123:
                    sFld -= (short) Test0120.instanceCount;
                case 124:
                    i16 = i14;
                    break;
                case 125:
                    Test0120.instanceCount += (i13 + Test0120.instanceCount);
                    break;
                case 126:
                    Test0120.iFld = (int) 116L;
                    break;
                case 127:
                    lArr[(-53444 >>> 1) % N] -= (long) -1.516F;
                    break;
                case 128:
                    Test0120.iFld1 += (i13 ^ i16);
                case 129:
                    Test0120.iArrFld[i13] += i14;
                    break;
                default:
                    Test0120.instanceCount -= i18;
            }
        }

        FuzzerUtils.out.println("i13 i14 i15 = " + i13 + "," + i14 + "," + i15);
        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("by2 lArr dArr1 = " + by2 + "," + FuzzerUtils.checkSum(lArr) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)));

        FuzzerUtils.out.println("Test0120.instanceCount Test0120.bFld Test0120.fFld = " + Test0120.instanceCount + "," + (Test0120.bFld ? 1
                : 0) + "," + Float.floatToIntBits(Test0120.fFld));
        FuzzerUtils.out.println("Test0120.iFld dFld sFld = " + Test0120.iFld + "," + Double.doubleToLongBits(dFld) + "," +
                sFld);
        FuzzerUtils.out.println("Test0120.iFld1 Test0120.iArrFld Test0120.fArrFld = " + Test0120.iFld1 + "," +
                FuzzerUtils.checkSum(Test0120.iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0120.fArrFld)));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
