// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:05 2023
public class Test0494 {

    public static final int N = 400;

    public static long instanceCount = 10L;
    public static short sFld = -8018;
    public static byte byFld = 70;
    public static boolean bFld = false;
    public static float[] fArrFld = new float[N];
    public static volatile long[] lArrFld = new long[N];
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0494.fArrFld, 1.991F);
        FuzzerUtils.init(Test0494.lArrFld, -30449L);
    }

    public static int iMeth1() {

        int i10 = -10;
        int i11 = -11;
        int i12 = -10;
        int i13 = 178;
        int i14 = 2565;
        int i15 = 28377;
        int i16 = 253;
        int[] iArr = new int[N];
        byte by = 15;
        float f1 = -60.308F;
        double d = 36.43015;
        double[][] dArr = new double[N][N];
        long[] lArr = new long[N];

        FuzzerUtils.init(dArr, 0.43899);
        FuzzerUtils.init(iArr, 17);
        FuzzerUtils.init(lArr, -5686537374077597361L);

        for (i10 = 4; 331 > i10; ++i10) {
            for (i12 = 1; i12 < 5; ++i12) {
                by -= by;
                f1 = Test0494.instanceCount;
            }
            switch ((i10 % 10) + 69) {
                case 69:
                    i13 += i10;
                    break;
                case 70:
                    for (i14 = 1; i14 < 5; i14++) {
                        i16 = 1;
                        while (++i16 < 2) {
                            Test0494.instanceCount /= (i14 | 1);
                            dArr[i14 - 1][i10] *= i11;
                            i11 += (i16 - i13);
                            i15 /= (int) (i10 | 1);
                            i15 += (-16 + (i16 * i16));
                            try {
                                i15 = (i10 % i13);
                                iArr[i10 - 1] = (i11 % i15);
                                i11 = (iArr[i16 + 1] / i16);
                            } catch (ArithmeticException a_e) {
                            }
                            iArr[i16] = i13;
                        }
                    }
                    break;
                case 71:
                    i15 = i12;
                    break;
                case 72:
                    i13 += i14;
                case 73:
                    i13 += (i10 ^ Test0494.instanceCount);
                case 74:
                    i15 -= i11;
                case 75:
                    i15 *= (int) 2572796667258629744L;
                    break;
                case 76:
                    f1 *= -126;
                case 77:
                    lArr[i10] += i11;
                    break;
                case 78:
                    d -= i15;
                    break;
                default:
                    if (i13 != 0) {
                    }
            }
        }
        long meth_res = i10 + i11 + i12 + i13 + by + Float.floatToIntBits(f1) + i14 + i15 + i16 +
                Double.doubleToLongBits(d) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
                FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public static int iMeth(int i4, long l) {

        int i5 = -160, i6 = 121, i7 = -8, i8 = -50, i9 = -11, i17 = -53048, i18 = -176, i19 = 51403;
        long l1 = 25L;
        short s = 18797;
        float f2 = -31.777F;
        double d1 = 0.122974;

        i5 = 1;
        while ((i5 += 2) < 269) {
            for (i6 = 1; i6 < 12; i6++) {
                for (i8 = 1; i8 < 2; i8 += 3) {
                    Test0494.instanceCount = (((++i4) - l1) - (--i7));
                }
                i9 -= (iMeth1() / (s | 1));
            }
            i7 = (int) f2;
            d1 += i7;
            i9 >>= 62183;
        }
        l1 = i4;
        i7 &= i6;
        i7 >>= i8;
        for (i17 = 3; i17 < 235; ++i17) {
            f2 = i19;
            i18 = i5;
            i18 *= i6;
        }
        long meth_res = i4 + l + i5 + i6 + i7 + i8 + i9 + l1 + s + Float.floatToIntBits(f2) +
                Double.doubleToLongBits(d1) + i17 + i18 + i19;
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth(int i3, float f) {

        int i20 = -15146;
        int i21 = -6;
        int i22 = 95;
        int i23 = -67;
        int i24 = 14;
        int i25 = -4;
        int[] iArr1 = new int[N];
        double d2 = -38.45316;
        byte by1 = -52;
        short[] sArr = new short[N];
        long[] lArr1 = new long[N];

        FuzzerUtils.init(iArr1, -1);
        FuzzerUtils.init(sArr, (short) 23553);
        FuzzerUtils.init(lArr1, -1694414994959854602L);

        iMeth(i3, Test0494.instanceCount);
        i3 -= i3;
        f = i3;
        switch (((-51947 >>> 1) % 9) + 38) {
            case 38:
                for (i20 = 14; 354 > i20; i20++) {
                    Test0494.instanceCount &= 6;
                    i21 += (int) (3113558678L + (i20 * i20));
                    for (i22 = 1; i22 < 5; ++i22) {
                        iArr1[i22 + 1] = -58147;
                    }
                }
                d2 -= Test0494.instanceCount;
                for (i24 = 5; 201 > i24; ++i24) {
                    f += i23;
                    i25 += (int) (238L + (i24 * i24));
                    Test0494.instanceCount >>= i25;
                    i21 = i25;
                }
                break;
            case 39:
                i23 >>= i20;
            case 40:
                f -= i22;
                break;
            case 41:
                f += Test0494.instanceCount;
                break;
            case 42:
                i3 = by1;
                break;
            case 43:
                sArr[(233 >>> 1) % N] >>>= (short) i25;
                break;
            case 44:
                Test0494.instanceCount %= (i20 | 1);
            case 45:
                lArr1[(i24 >>> 1) % N] -= (long) f;
            case 46:
                Test0494.fArrFld[(i22 >>> 1) % N] -= Test0494.instanceCount;
                break;
        }
        vMeth_check_sum += i3 + Float.floatToIntBits(f) + i20 + i21 + i22 + i23 + Double.doubleToLongBits(d2) + i24 +
                i25 + by1 + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(lArr1);
    }

    public static void main(String[] strArr) {

        try {
            Test0494 _instance = new Test0494();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = 22128;
        int i1 = -6;
        int i2 = -3;
        int i26 = -37991;
        int i27 = -4;
        int[] iArr2 = new int[N];
        float f3 = 0.775F;
        double d3 = 0.93419;
        double[] dArr1 = new double[N];

        FuzzerUtils.init(iArr2, -32818);
        FuzzerUtils.init(dArr1, 2.48179);

        for (i = 15; i < 291; ++i) {
            switch ((i % 10) + 87) {
                case 87:
                    i2 = 1;
                    do {
                        vMeth(i, f3);
                        i1 += -136;
                        i26 = 1;
                        while (++i26 < 1) {
                            f3 += 5845;
                            i1 += (int) f3;
                            try {
                                i1 = (i2 % -67);
                                i1 = (i1 % iArr2[i2 - 1]);
                                i1 = (-130 / i);
                            } catch (ArithmeticException a_e) {
                            }
                            Test0494.lArrFld[i26 - 1] = i;
                            d3 -= Test0494.instanceCount;
                            d3 -= 49317;
                        }
                        dArr1[i - 1] *= Test0494.sFld;
                        i1 = -62838;
                        i1 += (((i2 * Test0494.byFld) + i1) - Test0494.instanceCount);
                        iArr2[i2] = (int) Test0494.instanceCount;
                        if (Test0494.bFld) {
                            i27 = 1;
                            do {
                                Test0494.instanceCount += (i27 + Test0494.sFld);
                                f3 *= i26;
                                i1 += (i27 * i27);
                                i1 += (i27 - Test0494.instanceCount);
                                Test0494.instanceCount += (((i27 * i1) + f3) - Test0494.instanceCount);
                                i1 += (((i27 * i) + Test0494.sFld) - i26);
                                i1 = i;
                                i1 -= Test0494.sFld;
                                Test0494.byFld = (byte) Test0494.instanceCount;
                            } while (++i27 < 1);
                        } else if (Test0494.bFld) {
                        } else {
                            i1 |= i27;
                            i1 += i27;
                            i1 = (int) d3;
                        }
                    } while (++i2 < 91);
                    break;
                case 88:
                    try {
                        i1 = (5270 / i26);
                        i1 = (i1 / i26);
                        i1 = (734 / i27);
                    } catch (ArithmeticException a_e) {
                    }
                    break;
                case 89:
                    i1 = (int) Test0494.instanceCount;
                    break;
                case 90:
                    Test0494.instanceCount += (long) d3;
                    break;
                case 91:
                    iArr2[i - 1] >>= i1;
                    break;
                case 92:
                    i1 += (int) d3;
                    break;
                case 93:
                case 94:
                case 95:
                    if (Test0494.bFld) continue;
                    break;
                case 96:
                    try {
                        i1 = (i2 % -56);
                        iArr2[i] = (i27 % 69699831);
                        i1 = (-35267 / i);
                    } catch (ArithmeticException a_e) {
                    }
                    break;
                default:
                    Test0494.lArrFld[i + 1] >>= i1;
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("f3 i26 d3 = " + Float.floatToIntBits(f3) + "," + i26 + "," +
                Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("i27 iArr2 dArr1 = " + i27 + "," + FuzzerUtils.checkSum(iArr2) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)));

        FuzzerUtils.out.println("Test0494.instanceCount Test0494.sFld Test0494.byFld = " + Test0494.instanceCount + "," + Test0494.sFld +
                "," + Test0494.byFld);
        FuzzerUtils.out.println("Test0494.bFld Test0494.fArrFld Test0494.lArrFld = " + (Test0494.bFld ? 1 : 0) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0494.fArrFld)) + "," + FuzzerUtils.checkSum(Test0494.lArrFld));

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