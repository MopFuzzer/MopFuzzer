// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:02 2023
public class Test0375 {

    public static final int N = 400;

    public static long instanceCount = 1778L;
    public static float fFld = -1.69F;
    public static int iFld = 11;
    public static long[] lArrFld = new long[N];
    public static float[] fArrFld = new float[N];
    public static int[][] iArrFld = new int[N][N];
    public static boolean[][] bArrFld = new boolean[N][N];
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long fMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0375.lArrFld, 1L);
        FuzzerUtils.init(Test0375.fArrFld, 0.133F);
        FuzzerUtils.init(Test0375.iArrFld, 5);
        FuzzerUtils.init(Test0375.bArrFld, true);
    }

    public byte byFld = 110;

    public static float fMeth(double d1, int i6, int i7) {

        double d2 = -18.71460, d3 = 1.81385;
        int i8 = -9;
        int i9 = 2;
        int[] iArr1 = new int[N];
        boolean b = false;

        FuzzerUtils.init(iArr1, 132);

        Test0375.instanceCount += 3048123348L;
        if (b) {
            Test0375.fFld *= 7;
            Test0375.instanceCount >>>= Test0375.instanceCount;
            i6 += 58530;
            if (b) {
                for (d2 = 2; d2 < 187; ++d2) {
                    i6 = (int) Test0375.instanceCount;
                    for (d3 = 1; d3 < 9; d3 += 3) {
                        iArr1[(int) (d2 - 1)] = i6;
                        Test0375.instanceCount += (long) d3;
                        i6 -= (int) Test0375.instanceCount;
                        Test0375.lArrFld[(int) (d2 - 1)] = Test0375.instanceCount;
                        i8 *= i6;
                    }
                    i6 = -86;
                }
            } else {
                i7 += i9;
            }
        }
        long meth_res = Double.doubleToLongBits(d1) + i6 + i7 + Double.doubleToLongBits(d2) + i8 +
                Double.doubleToLongBits(d3) + i9 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr1);
        fMeth_check_sum += meth_res;
        return (float) meth_res;
    }

    public static void vMeth1(float f) {

        int i4 = 161;
        int i5 = -40806;
        int i10 = 107;
        int i11 = 1516;
        int[] iArr = new int[N];
        boolean b1 = false;
        byte by = -3;
        double[] dArr = new double[N];

        FuzzerUtils.init(dArr, -1.67961);
        FuzzerUtils.init(iArr, 62804);

        for (double d : dArr) {
            for (i4 = 4; i4 > 1; i4 -= 2) {
                iArr[i4] = (int) fMeth(d, i5, -9);
                if (b1) {
                    iArr[i4 + 1] = i5;
                }
                for (i10 = 1; 4 > i10; ++i10) {
                    Test0375.fArrFld[i10 - 1] *= i4;
                    i5 >>>= i4;
                    by += (byte) (i10 * i10);
                    i11 += i4;
                    switch ((i4 % 2) + 99) {
                        case 99:
                            i5 += (((i10 * i10) + i11) - i4);
                            break;
                        case 100:
                            Test0375.lArrFld[i10 + 1] -= -13;
                            i11 = i4;
                            Test0375.instanceCount -= i10;
                            break;
                        default:
                            i11 |= i5;
                    }
                }
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f) + i4 + i5 + (b1 ? 1 : 0) + i10 + i11 + by +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth() {

        int i2 = -42119;
        int i3 = 12;
        int i12 = 173;
        int i13 = 108;
        int i14 = -135;
        int i15 = -165;
        int[] iArr2 = new int[N];
        short s = 9335;

        FuzzerUtils.init(iArr2, 95);

        for (i2 = 7; i2 < 127; ++i2) {
            Test0375.lArrFld[i2] <<= (++i3);
            vMeth1(Test0375.fFld);
            i3 += (int) Test0375.fFld;
            i3 = i2;
            i3 += i3;
            Test0375.instanceCount -= -14;
            Test0375.instanceCount += (i2 ^ s);
            for (i12 = 1; i12 < 13; i12++) {
                i3 &= i2;
                Test0375.iFld = Test0375.iFld;
                try {
                    iArr2[i2] = (i12 / -200627092);
                    i13 = (Test0375.iFld / 649520902);
                    i3 = (Test0375.iFld % i12);
                } catch (ArithmeticException a_e) {
                }
            }
            for (i14 = i2; 13 > i14; i14 += 2) {
                Test0375.iFld = i3;
                Test0375.instanceCount += (i14 * i14);
            }
        }
        vMeth_check_sum += i2 + i3 + s + i12 + i13 + i14 + i15 + FuzzerUtils.checkSum(iArr2);
    }

    public static void main(String[] strArr2) {

        try {
            Test0375 _instance = new Test0375();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr2);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr3) {

        int i1 = 43571, i16 = -29523, i17 = 3, i18 = -160, i19 = 2;
        short s1 = 11907;
        float f1 = -1.28F;
        boolean b2 = true;
        double d4 = -127.48382;
        long l = 10L;

        i1 = 1;
        while (++i1 < 369) {
            vMeth();
            Test0375.iFld = s1;
            Test0375.lArrFld[i1] -= Test0375.instanceCount;
            Test0375.iFld -= Test0375.iFld;
            Test0375.instanceCount += (8434007245995425970L + (i1 * i1));
            byFld -= (byte) 3111428774L;
            Test0375.iFld = (int) Test0375.instanceCount;
            Test0375.iFld = i1;
            Test0375.iArrFld[i1 - 1][i1] -= Test0375.iFld;
            f1 += i1;
        }
        for (i16 = 8; 183 > i16; ++i16) {
            Test0375.iArrFld[i16 + 1] = Test0375.iArrFld[i16];
            Test0375.iArrFld[(i1 >>> 1) % N][i16] = (int) Test0375.instanceCount;
            byFld += (byte) i1;
            Test0375.lArrFld[i16 + 1] = 24394;
            if (false) {
                f1 += i1;
                i17 += (i16 * i16);
            } else if (b2) {
                Test0375.instanceCount -= i1;
                Test0375.iFld += (37577 + (i16 * i16));
                f1 *= i17;
                s1 += (short) i16;
            }
            for (i18 = 143; i18 > i16; --i18) {
                Test0375.bArrFld[i16][i16 + 1] = b2;
                d4 = 11;
                Test0375.instanceCount = byFld;
                byFld = (byte) i18;
                Test0375.iArrFld[i16 - 1] = Test0375.iArrFld[i18 - 1];
                l += (i18 - i18);
            }
        }

        FuzzerUtils.out.println("i1 s1 f1 = " + i1 + "," + s1 + "," + Float.floatToIntBits(f1));
        FuzzerUtils.out.println("i16 i17 b2 = " + i16 + "," + i17 + "," + (b2 ? 1 : 0));
        FuzzerUtils.out.println("i18 i19 d4 = " + i18 + "," + i19 + "," + Double.doubleToLongBits(d4));
        FuzzerUtils.out.println("l = " + l);

        FuzzerUtils.out.println("Test0375.instanceCount Test0375.fFld Test0375.iFld = " + Test0375.instanceCount + "," +
                Float.floatToIntBits(Test0375.fFld) + "," + Test0375.iFld);
        FuzzerUtils.out.println("byFld Test0375.lArrFld Test0375.fArrFld = " + byFld + "," + FuzzerUtils.checkSum(Test0375.lArrFld)
                + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0375.fArrFld)));
        FuzzerUtils.out.println("Test0375.iArrFld Test0375.bArrFld = " + FuzzerUtils.checkSum(Test0375.iArrFld) + "," +
                FuzzerUtils.checkSum(Test0375.bArrFld));

        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  fMeth ->  fMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
