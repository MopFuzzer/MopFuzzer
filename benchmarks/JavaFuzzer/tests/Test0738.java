// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:11 2023
public class Test0738 {

    public static final int N = 400;

    public static long instanceCount = 7743553659651056323L;
    public static float fFld = 109.162F;
    public static volatile int iFld = 137;
    public static volatile double dFld = -102.26317;
    public static int[] iArrFld = new int[N];
    public static long[] lArrFld = new long[N];
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    static {
        FuzzerUtils.init(Test0738.iArrFld, 106);
        FuzzerUtils.init(Test0738.lArrFld, 6337585831026684390L);
    }

    public byte byFld = 120;
    public int iFld1 = -5;

    public static void vMeth2(long l, long l1, byte by) {

        int i7 = 7, i8 = 52, i9 = -32165, i10 = 0, i11 = -10;
        boolean b = true;
        double d = -80.81129;
        double[][] dArr = new double[N][N];

        FuzzerUtils.init(dArr, 0.116276);

        for (i7 = 6; i7 < 214; ++i7) {
            if (b) break;
            i8 = (int) l;
            d -= -1.883F;
        }
        i8 = i7;
        i8 = (int) l1;
        Test0738.lArrFld[(i8 >>> 1) % N] += (long) Test0738.fFld;
        Test0738.iArrFld[(i8 >>> 1) % N] = (int) l;
        for (i9 = 12; i9 < 298; i9++) {
            Test0738.iArrFld[i9 - 1] = i10;
            dArr = dArr;
        }
        i11 = 1;
        do {
            Test0738.fFld += -229;
            if (b) continue;
            l1 = i11;
        } while (++i11 < 240);
        vMeth2_check_sum += l + l1 + by + i7 + i8 + (b ? 1 : 0) + Double.doubleToLongBits(d) + i9 + i10 + i11 +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth1(int i1, int i2, int i3) {

        int i4 = 7;
        int i5 = -19470;
        int i12 = 54247;
        int[][] iArr = new int[N][N];
        long l2 = -208L;
        byte by1 = -16;

        FuzzerUtils.init(iArr, -168);

        i3 = i1;
        i1 = (--iArr[(i1 >>> 1) % N][(i1 >>> 1) % N]);
        for (i4 = 5; i4 < 130; i4++) {
            Test0738.instanceCount |= Test0738.instanceCount;
            vMeth2(l2, l2, by1);
            Test0738.instanceCount += (i4 * i4);
            i12 = 1;
            while (++i12 < 13) {
                i2 += (i12 - i12);
                Test0738.fFld = i5;
            }
            i1 += (i4 - i4);
        }
        Test0738.instanceCount -= i3;
        Test0738.iArrFld[(i3 >>> 1) % N] *= i2;
        i3 <<= i2;
        Test0738.instanceCount = i1;
        l2 -= -8;
        vMeth1_check_sum += i1 + i2 + i3 + i4 + i5 + l2 + by1 + i12 + FuzzerUtils.checkSum(iArr);
    }

    public static void main(String[] strArr) {

        try {
            Test0738 _instance = new Test0738();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void vMeth() {

        int i13 = -74, i14 = -9, i15 = -65, i16 = -136, i17 = -8, i18 = 45697, i19 = 10;
        short s = 8946;

        vMeth1(Test0738.iFld, Test0738.iFld, -11);
        Test0738.iFld /= (int) (i13 | 1);
        Test0738.lArrFld[(Test0738.iFld >>> 1) % N] = i13;
        Test0738.dFld += i13;
        i14 = 164;
        do {
            i13 += (25251 + (i14 * i14));
            for (i15 = 1; i15 < 10; i15++) {
                Test0738.iFld += i15;
            }
            for (i17 = 1; i17 < 10; ++i17) {
                Test0738.fFld += Test0738.instanceCount;
            }
            i19 = 1;
            do {
                Test0738.fFld = byFld;
                Test0738.iArrFld[i14 + 1] += i19;
                Test0738.iFld += (i19 * Test0738.instanceCount);
                s += (short) (((i19 * Test0738.fFld) + Test0738.iFld) - i16);
            } while (++i19 < 10);
        } while (--i14 > 0);
        vMeth_check_sum += i13 + i14 + i15 + i16 + i17 + i18 + i19 + s;
    }

    public void mainTest(String[] strArr1) {

        int i = 222, i20 = -120, i21 = -14, i22 = -23, i23 = 61;
        long l3 = 7542L;
        byte by2 = 99;
        short s1 = 19940;

        i = 1;
        do {
            vMeth();
            l3 = 77;
            while ((l3 -= 3) > 0) {
                for (i20 = 1; i20 < 3; i20++) {
                    try {
                        Test0738.iFld = (Test0738.iArrFld[(int) (l3)] / Test0738.iFld);
                        i21 = (i21 / i21);
                        Test0738.iFld = (148 % Test0738.iArrFld[(int) (l3 - 1)]);
                    } catch (ArithmeticException a_e) {
                    }
                }
                Test0738.lArrFld[(int) (l3 + 1)] *= i21;
                for (i22 = 1; i22 < 3; ++i22) {
                    switch ((((Test0738.iFld >>> 1) % 8) * 5) + 50) {
                        case 73:
                            switch ((i % 8) + 49) {
                                case 49:
                                    Test0738.iArrFld[(int) (l3)] += (int) Test0738.dFld;
                                    Test0738.instanceCount += (i22 - i23);
                                    iFld1 <<= i20;
                                    Test0738.iArrFld[(int) (l3 + 1)] += (int) Test0738.dFld;
                                    break;
                                case 50:
                                    Test0738.iArrFld[(int) (l3 + 1)] += i21;
                                    i21 += (((i22 * iFld1) + iFld1) - i23);
                                    i23 += (int) (4.586F + (i22 * i22));
                                    break;
                                case 51:
                                    Test0738.iFld += (int) 2.86068;
                                    break;
                                case 52:
                                    i21 = 113;
                                    Test0738.iArrFld[(int) (l3 + 1)] >>= i22;
                                    iFld1 = (int) 4143669761L;
                                    Test0738.dFld *= i;
                                    break;
                                case 53:
                                    Test0738.iFld += -14;
                                    Test0738.iFld += (-89 + (i22 * i22));
                                    Test0738.instanceCount = iFld1;
                                    Test0738.iArrFld[i22] >>= i20;
                                case 54:
                                    Test0738.iArrFld[i] -= i23;
                                    i23 = (int) l3;
                                    Test0738.iFld = (int) Test0738.dFld;
                                    Test0738.iFld = -55979;
                                    break;
                                case 55:
                                    Test0738.instanceCount += (i22 * i22);
                                case 56:
                                    Test0738.iFld |= 86;
                            }
                        case 81:
                            Test0738.instanceCount += i23;
                            break;
                        case 74:
                            iFld1 += (((i22 * iFld1) + Test0738.iFld) - i);
                        case 53:
                            i23 *= (int) l3;
                            break;
                        case 57:
                            by2 = (byte) i20;
                            break;
                        case 69:
                        case 89:
                            Test0738.iArrFld[i - 1] -= s1;
                        case 78:
                            i23 += i23;
                            break;
                        default:
                            i21 = i21;
                    }
                }
            }
        } while (++i < 325);

        FuzzerUtils.out.println("i l3 i20 = " + i + "," + l3 + "," + i20);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("by2 s1 = " + by2 + "," + s1);

        FuzzerUtils.out.println("Test0738.instanceCount Test0738.fFld Test0738.iFld = " + Test0738.instanceCount + "," +
                Float.floatToIntBits(Test0738.fFld) + "," + Test0738.iFld);
        FuzzerUtils.out.println("Test0738.dFld byFld iFld1 = " + Double.doubleToLongBits(Test0738.dFld) + "," + byFld + "," +
                iFld1);
        FuzzerUtils.out.println("Test0738.iArrFld Test0738.lArrFld = " + FuzzerUtils.checkSum(Test0738.iArrFld) + "," +
                FuzzerUtils.checkSum(Test0738.lArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}