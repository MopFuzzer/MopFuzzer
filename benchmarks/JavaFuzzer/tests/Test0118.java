// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:55 2023
public class Test0118 {

    public static final int N = 400;

    public static long instanceCount = 1205769362L;
    public static volatile int iFld = -70;
    public static boolean bFld = false;
    public static int iFld1 = -22895;
    public static int[] iArrFld = new int[N];
    public static long vMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0118.iArrFld, 211);
    }

    public static void vMeth1() {

        int i8 = -47680, i9 = 57532, i10 = 55930, i11 = -1, i12 = -2, i13 = 33859;
        float f2 = -2.582F;

        for (i8 = 10; i8 < 273; ++i8) {
            Test0118.iFld = i8;
            Test0118.instanceCount -= i9;
            for (i10 = 6; i10 > 1; i10--) {
                for (i12 = 1; i12 < 2; i12++) {
                    if (i9 != 0) {
                        vMeth1_check_sum += i8 + i9 + i10 + i11 + i12 + i13 + Float.floatToIntBits(f2);
                        return;
                    }
                    Test0118.iArrFld[i12] >>= i13;
                    i9 <<= -13527;
                }
                i13 += (((i10 * Test0118.instanceCount) + i13) - Test0118.instanceCount);
                switch ((i8 % 2) + 2) {
                    case 2:
                        i11 += (i10 * i10);
                        Test0118.iFld += (((i10 * i11) + f2) - i8);
                        break;
                    case 3:
                        i11 = i11;
                        i13 >>>= 15312;
                        i9 -= i12;
                }
            }
        }
        vMeth1_check_sum += i8 + i9 + i10 + i11 + i12 + i13 + Float.floatToIntBits(f2);
    }

    public static boolean bMeth(double d) {

        int i6 = 135, i7 = -5, i14 = 77, i15 = -228, i16 = -169, i17 = 26073;
        boolean b1 = true;
        float f1 = 2.798F;
        long[][] lArr1 = new long[N][N];

        FuzzerUtils.init(lArr1, -18912L);

        for (i6 = 12; i6 < 283; ++i6) {
            lArr1[(i6 >>> 1) % N][i6 + 1] *= Test0118.iFld;
            if (b1) break;
            Test0118.iFld = (int) (f1 + (Test0118.iFld++));
            vMeth1();
            for (i14 = 1; i14 < 6; ++i14) {
                f1 -= i7;
                for (i16 = 1; i16 < 2; i16++) {
                    Test0118.iArrFld[i6 + 1] -= Test0118.iFld;
                    i7 -= (int) Test0118.instanceCount;
                    switch ((((i14 >>> 1) % 5) * 5) + 82) {
                        case 84:
                            Test0118.iFld += i7;
                            i15 += (-9 + (i16 * i16));
                            break;
                        case 103:
                            i7 += (11 + (i16 * i16));
                            break;
                        case 99:
                            i7 >>= (int) Test0118.instanceCount;
                        case 88:
                            i17 = (int) f1;
                            break;
                        case 98:
                            i7 += i14;
                            break;
                        default:
                            Test0118.iArrFld = Test0118.iArrFld;
                    }
                }
            }
        }
        long meth_res = Double.doubleToLongBits(d) + i6 + i7 + (b1 ? 1 : 0) + Float.floatToIntBits(f1) + i14 + i15 +
                i16 + i17 + FuzzerUtils.checkSum(lArr1);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static void vMeth(short s, long l, int i1) {

        int i2 = -211, i3 = 8, i4 = 120, i5 = 47610, i18 = -39196, i19 = -57;
        boolean b = false;
        float f = -91.52F;
        long l1 = 3676932872L;
        double d1 = 104.110706;

        for (i2 = 3; i2 < 157; ++i2) {
            for (i4 = i2; i4 < 10; i4 += 2) {
                b = (b = ((-8 == f) && b));
                l1 += (--Test0118.iFld);
                b = bMeth(d1);
            }
            Test0118.iArrFld[i2 + 1] -= 5;
            for (i18 = 1; i18 < 10; ++i18) {
                Test0118.iFld += (int) 10L;
                i3 -= (int) l1;
                Test0118.iArrFld[i18] = i5;
                i5 += (i18 + l1);
                if (i19 != 0) {
                    vMeth_check_sum += s + l + i1 + i2 + i3 + i4 + i5 + (b ? 1 : 0) + Float.floatToIntBits(f) + l1 +
                            Double.doubleToLongBits(d1) + i18 + i19;
                    return;
                }
                s = (short) i3;
                i3 += i2;
            }
            try {
                Test0118.iArrFld[i2 - 1] = (-178 / i4);
                Test0118.iArrFld[i2] = (i2 % -60735);
                Test0118.iArrFld[i2] = (189 / i1);
            } catch (ArithmeticException a_e) {
            }
        }
        vMeth_check_sum += s + l + i1 + i2 + i3 + i4 + i5 + (b ? 1 : 0) + Float.floatToIntBits(f) + l1 +
                Double.doubleToLongBits(d1) + i18 + i19;
    }

    public static void main(String[] strArr) {

        try {
            Test0118 _instance = new Test0118();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = -157;
        int i20 = 13;
        int i21 = 67;
        int i22 = 60835;
        int i23 = 41178;
        int i24 = -11;
        int i25 = -3;
        int i26 = -1;
        int[][] iArr = new int[N][N];
        short s1 = -5084;
        float f3 = -15.538F;
        float[] fArr = new float[N];
        double d2 = 118.50214;
        long[] lArr = new long[N];

        FuzzerUtils.init(fArr, 0.325F);
        FuzzerUtils.init(lArr, 2481403640588206617L);
        FuzzerUtils.init(iArr, 132);

        fArr[(1 >>> 1) % N] -= (++lArr[(i >>> 1) % N]);
        iArr[(i >>> 1) % N][(-6 >>> 1) % N] += i;
        vMeth(s1, Test0118.instanceCount, i20);
        for (i21 = 14; i21 < 341; i21++) {
            i20 <<= (int) Test0118.instanceCount;
            s1 += (short) (i21 * i21);
            i22 += (int) 82L;
            switch ((i21 % 2) + 93) {
                case 93:
                    i22 -= s1;
                    for (i23 = 2; i23 < 77; i23 += 2) {
                        if (Test0118.bFld) break;
                        i24 = -220;
                        try {
                            Test0118.iFld = (i / Test0118.iArrFld[i23 - 1]);
                            i24 = (Test0118.iFld / -57399);
                            iArr[i21][i21] = (i22 % 60948);
                        } catch (ArithmeticException a_e) {
                        }
                        f3 = Test0118.iFld;
                        switch ((((Test0118.iFld >>> 1) % 9) * 5) + 76) {
                            case 90:
                                if (Test0118.bFld) {
                                    i <<= s1;
                                    try {
                                        iArr[i23 + 1][i21 + 1] = (33499 % Test0118.iFld);
                                        i22 = (-374383212 / i22);
                                        i24 = (i24 % 54795);
                                    } catch (ArithmeticException a_e) {
                                    }
                                    lArr[i23] -= -11004;
                                    lArr[i23 - 1] = i23;
                                } else if (Test0118.bFld) {
                                    Test0118.iArrFld = iArr[i21];
                                    Test0118.instanceCount >>= i22;
                                } else if (Test0118.bFld) {
                                    try {
                                        iArr[i21][i23 - 1] = (Test0118.iFld % -7751);
                                        i20 = (i20 / i22);
                                        iArr[i23 + 1][i21] = (3651 / i24);
                                    } catch (ArithmeticException a_e) {
                                    }
                                    if (Test0118.bFld) break;
                                    i = -122;
                                    for (i25 = 1; i25 < 3; i25++) {
                                        byte by = -5;
                                        i20 += i25;
                                        i *= (int) 2946912629L;
                                        s1 = by;
                                        Test0118.iArrFld[i21] -= (int) -2.247F;
                                    }
                                } else {
                                    i26 *= (int) f3;
                                }
                                break;
                            case 88:
                                i26 += (i23 * i23);
                                break;
                            case 120:
                                iArr[i23 + 1][i21 - 1] = i22;
                                break;
                            case 95:
                                i20 ^= Test0118.iFld;
                                break;
                            case 99:
                                i20 = s1;
                                break;
                            case 121:
                                i22 = Test0118.iFld1;
                            case 81:
                                f3 -= (float) d2;
                            case 113:
                                i26 <<= i20;
                                break;
                            case 112:
                                Test0118.iFld1 >>>= (int) Test0118.instanceCount;
                                break;
                            default:
                                Test0118.iFld |= -10;
                        }
                    }
                case 94:
                    i24 >>= i22;
                    break;
                default:
                    i >>= Test0118.iFld1;
            }
        }

        FuzzerUtils.out.println("i s1 i20 = " + i + "," + s1 + "," + i20);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 f3 i25 = " + i24 + "," + Float.floatToIntBits(f3) + "," + i25);
        FuzzerUtils.out.println("i26 d2 fArr = " + i26 + "," + Double.doubleToLongBits(d2) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));
        FuzzerUtils.out.println("lArr iArr = " + FuzzerUtils.checkSum(lArr) + "," + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test0118.instanceCount Test0118.iFld Test0118.bFld = " + Test0118.instanceCount + "," + Test0118.iFld +
                "," + (Test0118.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0118.iFld1 Test0118.iArrFld = " + Test0118.iFld1 + "," + FuzzerUtils.checkSum(Test0118.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  bMeth ->  bMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 bMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
