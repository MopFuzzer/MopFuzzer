// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:02 2023
public class Test0392 {

    public static final int N = 400;

    public static long instanceCount = -8547873395663651885L;
    public static double dFld = 1.104798;
    public static int iFld = -2776;
    public static short sFld = -18;
    public static boolean bFld = true;
    public static byte byFld = -35;
    public static int[] iArrFld = new int[N];
    public static volatile float[] fArrFld = new float[N];
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0392.iArrFld, 90);
        FuzzerUtils.init(Test0392.fArrFld, -33.141F);
    }

    public byte[] byArrFld = new byte[N];

    public static int iMeth1(long l1, float f1) {

        long l2 = 2718710982L;
        int i6 = -2236, i7 = 247, i8 = 75, i9 = 3;
        boolean b2 = false;
        short s1 = -27050;

        l2 = 1;
        while (++l2 < 295) {
            switch ((int) ((l2 % 6) + 20)) {
                case 20:
                    l1 += (long) Test0392.dFld;
                    i6 -= i6;
                    for (i7 = 1; i7 < 6; ++i7) {
                        i9 = 1;
                        do {
                            try {
                                i6 = (Test0392.iArrFld[i7 - 1] % i7);
                                i6 = (39054 % i9);
                                i6 = (-48795 % i6);
                            } catch (ArithmeticException a_e) {
                            }
                            Test0392.instanceCount += i9;
                            i6 += i9;
                            i6 = -80;
                            if (b2) break;
                            i6 += (((i9 * i6) + s1) - i6);
                            Test0392.fArrFld[(int) (l2)] = i8;
                            i8 = (int) l1;
                            Test0392.fArrFld[i9] += Test0392.instanceCount;
                        } while (++i9 < 2);
                    }
                    break;
                case 21:
                    l1 |= 14002L;
                case 22:
                    i6 = (int) 1.327F;
                    break;
                case 23:
                    i8 = 99;
                    break;
                case 24:
                    i6 += Test0392.iFld;
                case 25:
                    Test0392.iFld = (int) l2;
                    break;
            }
        }
        long meth_res = l1 + Float.floatToIntBits(f1) + l2 + i6 + i7 + i8 + i9 + (b2 ? 1 : 0) + s1;
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth(int i1, byte by, double d) {

        int i2 = -1, i3 = -1, i4 = 27419, i5 = -77, i10 = 13, i11 = -2;
        boolean b1 = false;
        long l = -2801840008L;
        float f3 = 81.359F;

        for (i2 = 6; 179 > i2; ++i2) {
            if (b1 = b1) continue;
            i4 = 1;
            do {
                for (l = i2; 1 > l; l++) {
                    float f2 = 1.1004F;
                    Test0392.instanceCount >>= (++Test0392.instanceCount);
                    i5 = iMeth1(-12L, f2);
                    try {
                        Test0392.iFld = (Test0392.iArrFld[(int) (l + 1)] / i3);
                        i3 = (i1 / i1);
                        i1 = (Test0392.iArrFld[i2 - 1] / 9423);
                    } catch (ArithmeticException a_e) {
                    }
                    if (b1) {
                        if (i5 != 0) {
                            vMeth_check_sum += i1 + by + Double.doubleToLongBits(d) + i2 + i3 + (b1 ? 1 : 0) + i4 + l +
                                    i5 + i10 + i11 + Float.floatToIntBits(f3);
                            return;
                        }
                    } else {
                        if (b1) continue;
                        Test0392.iArrFld[i2 - 1] -= Test0392.iFld;
                        vMeth_check_sum += i1 + by + Double.doubleToLongBits(d) + i2 + i3 + (b1 ? 1 : 0) + i4 + l + i5
                                + i10 + i11 + Float.floatToIntBits(f3);
                        return;
                    }
                    f2 = Test0392.sFld;
                }
                for (i10 = 1; 1 > i10; i10++) {
                    Test0392.iFld *= (int) f3;
                    d *= i5;
                }
            } while (++i4 < 9);
        }
        vMeth_check_sum += i1 + by + Double.doubleToLongBits(d) + i2 + i3 + (b1 ? 1 : 0) + i4 + l + i5 + i10 + i11 +
                Float.floatToIntBits(f3);
    }

    public static void main(String[] strArr) {

        try {
            Test0392 _instance = new Test0392();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public int iMeth(short s) {

        float f = 2.901F;
        boolean b = false;
        boolean[][] bArr = new boolean[N][N];
        int i = 30450, i12 = -214, i13 = -18056, i14 = -11;
        byte by1 = -49;
        double d1 = 0.120587;
        double[] dArr = new double[N];
        long[] lArr = new long[N];

        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(lArr, 8L);
        FuzzerUtils.init(dArr, 70.10387);

        f = 210;
        do {
            bArr[(int) (f)][(int) (f - 1)] = b;
            i += (int) f;
            vMeth(-13, by1, Test0392.dFld);
            for (i12 = 1; 8 > i12; i12++) {
                byArrFld[(int) (f + 1)] &= (byte) Test0392.instanceCount;
                i13 += (i12 * i12);
                for (d1 = i12; d1 < 2; d1++) {
                    i >>= i14;
                    i14 = by1;
                    lArr[(int) (f + 1)] += i13;
                    i14 += (int) Test0392.instanceCount;
                    Test0392.fArrFld[(int) (f - 1)] %= (Test0392.instanceCount | 1);
                    dArr[(int) (d1 - 1)] = Test0392.iFld;
                    Test0392.iFld += (int) (d1 * d1);
                }
            }
        } while (--f > 0);
        long meth_res = s + Float.floatToIntBits(f) + (b ? 1 : 0) + i + by1 + i12 + i13 + Double.doubleToLongBits(d1) +
                i14 + FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(lArr) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i15 = 12, i16 = -212, i17 = 20, i18 = 100, i19 = 25, i20 = 1, i21 = 225;
        float f4 = -27.583F;
        long[] lArr1 = new long[N];
        double[][] dArr1 = new double[N][N];

        FuzzerUtils.init(lArr1, 3956592574L);
        FuzzerUtils.init(dArr1, -1.112557);

        Test0392.instanceCount *= iMeth(Test0392.sFld);
        for (i15 = 4; i15 < 154; i15++) {
            for (i17 = 7; i17 < 167; i17++) {
                Test0392.sFld += (short) (((i17 * Test0392.iFld) + i18) - i18);
                Test0392.iArrFld = FuzzerUtils.int1array(N, (int) -95);
                for (i19 = i17; i19 < 2; i19++) {
                    i20 += (((i19 * f4) + i19) - Test0392.instanceCount);
                    switch ((i17 % 8) + 122) {
                        case 122:
                            Test0392.instanceCount += i20;
                            switch ((((-6 >>> 1) % 6) * 5) + 57) {
                                case 83:
                                    i16 ^= i15;
                                    break;
                                case 68:
                                    Test0392.iFld = (int) Test0392.instanceCount;
                                    Test0392.instanceCount -= i15;
                                    i18 = i18;
                                    Test0392.iFld += (((i19 * f4) + Test0392.instanceCount) - i20);
                                    break;
                                case 70:
                                case 62:
                                    Test0392.fArrFld[i17 + 1] -= Test0392.instanceCount;
                                    f4 -= i19;
                                    switch ((i17 % 8) + 21) {
                                        case 21:
                                            Test0392.iArrFld[i19 - 1] += i20;
                                        case 22:
                                            if (Test0392.bFld) continue;
                                            break;
                                        case 23:
                                            Test0392.instanceCount += (((i19 * i15) + Test0392.instanceCount) - Test0392.instanceCount);
                                            Test0392.iArrFld = Test0392.iArrFld;
                                            if (Test0392.bFld) break;
                                        case 24:
                                            Test0392.sFld += (short) i16;
                                            switch ((((i16 >>> 1) % 3) * 5) + 4) {
                                                case 16:
                                                    f4 = f4;
                                                    i18 *= i21;
                                                    f4 = i17;
                                                case 9:
                                                    Test0392.instanceCount = i19;
                                                    i18 -= i19;
                                                case 19:
                                                    lArr1[i15] -= (long) f4;
                                                default:
                                                    Test0392.iArrFld[i19 - 1] = (int) Test0392.instanceCount;
                                            }
                                            break;
                                        case 25:
                                            dArr1[i17][i19 - 1] = Test0392.byFld;
                                        case 26:
                                            i18 += Test0392.sFld;
                                            break;
                                        case 27:
                                            f4 = -207;
                                        case 28:
                                            i16 += i21;
                                            break;
                                        default:
                                            Test0392.iArrFld[i15 - 1] *= i19;
                                    }
                                    break;
                                case 81:
                                    i20 += (i19 * i19);
                                case 58:
                                    i18 += -111;
                                    break;
                            }
                        case 123:
                            Test0392.iFld = i19;
                            break;
                        case 124:
                            i18 += (i19 + i17);
                            break;
                        case 125:
                        case 126:
                            i18 += i19;
                            break;
                        case 127:
                            i16 += (((i19 * i17) + Test0392.iFld) - i16);
                        case 128:
                            i21 = i16;
                            break;
                        case 129:
                            i16 -= (int) f4;
                            break;
                        default:
                            Test0392.instanceCount = 7789920859517898276L;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("f4 i21 lArr1 = " + Float.floatToIntBits(f4) + "," + i21 + "," +
                FuzzerUtils.checkSum(lArr1));
        FuzzerUtils.out.println("dArr1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)));

        FuzzerUtils.out.println("Test0392.instanceCount Test0392.dFld Test0392.iFld = " + Test0392.instanceCount + "," +
                Double.doubleToLongBits(Test0392.dFld) + "," + Test0392.iFld);
        FuzzerUtils.out.println("Test0392.sFld Test0392.bFld Test0392.byFld = " + Test0392.sFld + "," + (Test0392.bFld ? 1 : 0) + "," +
                Test0392.byFld);
        FuzzerUtils.out.println("Test0392.iArrFld Test0392.fArrFld byArrFld = " + FuzzerUtils.checkSum(Test0392.iArrFld) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0392.fArrFld)) + "," + FuzzerUtils.checkSum(byArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
