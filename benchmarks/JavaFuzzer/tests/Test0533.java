// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:06 2023
public class Test0533 {

    public static final int N = 400;

    public static long instanceCount = 6L;
    public static byte byFld = 3;
    public static double dFld = -1.102914;
    public static int iFld = -40579;
    public static volatile int[] iArrFld = new int[N];
    public static long[] lArrFld = new long[N];
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    static {
        FuzzerUtils.init(Test0533.iArrFld, -222);
        FuzzerUtils.init(Test0533.lArrFld, 1675229862L);
    }

    public boolean bFld = false;

    public static void vMeth2(int i6, int i7) {

        int i8 = -9, i9 = -13, i10 = 128, i11 = 0, i12 = 7376, i13 = -3, i14 = -11, i15 = -39110;
        float f1 = -72.191F;
        float[] fArr = new float[N];
        boolean b1 = true;
        short s = -26054;

        FuzzerUtils.init(fArr, 107.813F);

        for (i8 = 5; 233 > i8; i8++) {
            switch ((i8 % 7) + 50) {
                case 50:
                    i7 += (((i8 * i9) + i10) - i9);
                    for (i11 = i8; i11 < 7; ++i11) {
                        i6 <<= (int) Test0533.instanceCount;
                        f1 += Test0533.instanceCount;
                        i9 = 62978;
                        i6 += (((i11 * i10) + Test0533.instanceCount) - Test0533.instanceCount);
                        fArr[i8 + 1] = i10;
                    }
                    if (b1) {
                        i13 = 7;
                        do {
                            Test0533.instanceCount += i13;
                            for (i14 = 1; i14 < 1; i14++) {
                                i7 = (int) Test0533.instanceCount;
                                Test0533.byFld += (byte) (14 + (i14 * i14));
                            }
                        } while (--i13 > 0);
                    } else {
                        i10 -= 27357;
                    }
                    break;
                case 51:
                    i15 *= i14;
                    break;
                case 52:
                    i6 >>= -3;
                case 53:
                    Test0533.instanceCount = s;
                case 54:
                    Test0533.iArrFld[i8] *= (int) Test0533.instanceCount;
                    break;
                case 55:
                    i6 = i11;
                case 56:
                    f1 += i8;
                    break;
                default:
                    i6 *= (int) -89.875F;
            }
        }
        vMeth2_check_sum += i6 + i7 + i8 + i9 + i10 + i11 + i12 + Float.floatToIntBits(f1) + i13 + i14 + i15 + (b1 ? 1
                : 0) + s + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth1() {

        int i16 = 209, i17 = 4, i18 = 172, i19 = -204, i20 = 59777, i21 = -103, i22 = 37, i23 = -5, i24 = -7;
        long l = -5462742295909966154L;
        long[] lArr1 = new long[N];
        float f2 = -2.915F;
        short s1 = -3323;

        FuzzerUtils.init(lArr1, 7422122787893420226L);

        vMeth2(i16, i16);
        for (i17 = 18; i17 < 394; i17++) {
            i18 += (i17 | i16);
            Test0533.dFld *= i17;
            i16 <<= i17;
            for (l = 1; 4 > l; l += 3) {
                i18 += (int) (l | (long) f2);
                switch ((i17 % 7) + 115) {
                    case 115:
                        i20 = 1;
                        while (++i20 < 4) {
                            i16 += (int) l;
                        }
                        for (i21 = 1; 4 > i21; ++i21) {
                            if (i17 != 0) {
                                vMeth1_check_sum += i16 + i17 + i18 + l + i19 + Float.floatToIntBits(f2) + i20 + i21 + i22
                                        + i23 + i24 + s1 + FuzzerUtils.checkSum(lArr1);
                                return;
                            }
                        }
                        break;
                    case 116:
                        for (i23 = 4; i23 > 1; i23 -= 2) {
                            Test0533.dFld += -127L;
                            i22 = (int) l;
                        }
                        break;
                    case 117:
                        if (i18 != 0) {
                            vMeth1_check_sum += i16 + i17 + i18 + l + i19 + Float.floatToIntBits(f2) + i20 + i21 + i22 +
                                    i23 + i24 + s1 + FuzzerUtils.checkSum(lArr1);
                            return;
                        }
                    case 118:
                        i16 *= (int) 36769L;
                    case 119:
                        lArr1[i17 - 1] -= i24;
                    case 120:
                        Test0533.instanceCount += i18;
                        break;
                    case 121:
                        i19 += s1;
                        break;
                    default:
                        Test0533.iArrFld = Test0533.iArrFld;
                }
            }
        }
        vMeth1_check_sum += i16 + i17 + i18 + l + i19 + Float.floatToIntBits(f2) + i20 + i21 + i22 + i23 + i24 + s1 +
                FuzzerUtils.checkSum(lArr1);
    }

    public static void vMeth() {

        int i1 = 12596, i2 = 121, i3 = 72, i4 = 46, i5 = 45555, i25 = 11, i26 = 4, i27 = -801, i28 = -48630;
        float f = 2.454F;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, -3027693287810287044L);

        lArr[(-4 >>> 1) % N] = (Math.max(i1 + i1, Test0533.instanceCount * Test0533.byFld) * 6);
        for (i2 = 9; 297 > i2; i2++) {
            boolean b = true;
            if (b) {
                f += (((i2 * Test0533.instanceCount) + i2) - Test0533.instanceCount);
            } else {
                for (i4 = 1; i4 < 6; ++i4) {
                    i5 >>= i4;
                    vMeth1();
                    i25 ^= -16883;
                }
                i25 += i1;
                i26 = 6;
                while (--i26 > 0) {
                    Test0533.iFld |= i5;
                    Test0533.instanceCount += (i26 * i2);
                    for (i27 = 1; 1 > i27; i27++) {
                        try {
                            i1 = (966788968 / Test0533.iArrFld[i2]);
                            i3 = (Test0533.iFld % i2);
                            i25 = (i2 % i27);
                        } catch (ArithmeticException a_e) {
                        }
                        i5 = 6;
                    }
                }
            }
        }
        vMeth_check_sum += i1 + i2 + i3 + Float.floatToIntBits(f) + i4 + i5 + i25 + i26 + i27 + i28 +
                FuzzerUtils.checkSum(lArr);
    }

    public static void main(String[] strArr) {

        try {
            Test0533 _instance = new Test0533();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i29 = -7, i30 = -13819, i31 = 130, i32 = -10, i33 = 110, i34 = -22561;
        short s2 = 4316;
        float f3 = 20.650F;
        float[][] fArr1 = new float[N][N];
        boolean[] bArr = new boolean[N];

        FuzzerUtils.init(fArr1, 0.447F);
        FuzzerUtils.init(bArr, true);

        for (int i : Test0533.iArrFld) {
            vMeth();
            for (i29 = 63; i29 > 2; --i29) {
                Test0533.lArrFld[i29 + 1] = s2;
                Test0533.instanceCount = 0;
                if (bFld) break;
                Test0533.iFld += i29;
            }
            Test0533.instanceCount += 51561;
            fArr1[(Test0533.iFld >>> 1) % N][(i30 >>> 1) % N] = (float) Test0533.dFld;
            for (i31 = 1; i31 < 63; ++i31) {
                Test0533.iFld *= i31;
                f3 += Test0533.iFld;
                Test0533.instanceCount -= i;
                bArr[i31] = bFld;
                Test0533.dFld += Test0533.iFld;
                if (bFld) {
                    Test0533.iFld += (i31 | i31);
                    Test0533.iArrFld[i31] -= i32;
                } else {
                    i -= i29;
                    Test0533.lArrFld = Test0533.lArrFld;
                    for (i33 = 1; i33 < 2; ++i33) {
                        Test0533.instanceCount = (long) f3;
                        i += (i33 | i32);
                        Test0533.instanceCount -= -1735138523L;
                        if (false) continue;
                        i32 = (int) Test0533.instanceCount;
                        i <<= i30;
                        Test0533.iArrFld = Test0533.iArrFld;
                        i34 = (int) f3;
                        Test0533.iArrFld[i31 - 1] = i30;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i29 i30 s2 = " + i29 + "," + i30 + "," + s2);
        FuzzerUtils.out.println("i31 i32 f3 = " + i31 + "," + i32 + "," + Float.floatToIntBits(f3));
        FuzzerUtils.out.println("i33 i34 fArr1 = " + i33 + "," + i34 + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));
        FuzzerUtils.out.println("bArr = " + FuzzerUtils.checkSum(bArr));

        FuzzerUtils.out.println("Test0533.instanceCount Test0533.byFld Test0533.dFld = " + Test0533.instanceCount + "," + Test0533.byFld +
                "," + Double.doubleToLongBits(Test0533.dFld));
        FuzzerUtils.out.println("Test0533.iFld bFld Test0533.iArrFld = " + Test0533.iFld + "," + (bFld ? 1 : 0) + "," +
                FuzzerUtils.checkSum(Test0533.iArrFld));
        FuzzerUtils.out.println("Test0533.lArrFld = " + FuzzerUtils.checkSum(Test0533.lArrFld));

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
