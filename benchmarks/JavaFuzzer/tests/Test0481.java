// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:05 2023
public class Test0481 {

    public static final int N = 400;

    public static long instanceCount = -18537L;
    public static volatile int iFld = 25799;
    public static long lFld = -1762153466L;
    public static volatile int[] iArrFld = new int[N];
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0481.iArrFld, 159);
    }

    public double[] dArrFld = new double[N];

    public static void vMeth1(int i11, double d) {

        int i12 = 47;
        int i13 = -177;
        int i14 = 14;
        int i15 = -32126;
        int i16 = -10;
        int i17 = 26914;
        int i18 = 26567;
        int[] iArr = new int[N];
        float f = -36.930F, f1 = -1.754F;
        boolean b = true;
        long l1 = -8L;

        FuzzerUtils.init(iArr, -22457);

        if (b) {
            i12 = 1;
            while (++i12 < 232) {
                for (f = 1; f < 7; ++f) {
                    i13 = (int) f;
                    i13 += (int) (((f * i11) + i11) - i12);
                }
                for (i14 = i12; i14 < 7; ++i14) {
                    f1 += Test0481.instanceCount;
                }
                i16 = 1;
                do {
                    for (i17 = 1; i17 > 1; i17 -= 2) {
                        f1 += -1.776F;
                        d /= (i18 | 1);
                        b = b;
                    }
                    Test0481.instanceCount += (134 + (i16 * i16));
                } while (++i16 < 7);
                if (i13 != 0) {
                    vMeth1_check_sum += i11 + Double.doubleToLongBits(d) + i12 + Float.floatToIntBits(f) + i13 + i14 +
                            i15 + Float.floatToIntBits(f1) + i16 + i17 + i18 + (b ? 1 : 0) + l1 +
                            FuzzerUtils.checkSum(iArr);
                    return;
                }
                iArr[i12 + 1] = 26452;
            }
        } else if (b) {
            l1 = i16;
        } else {
            l1 = l1;
            vMeth1_check_sum += i11 + Double.doubleToLongBits(d) + i12 + Float.floatToIntBits(f) + i13 + i14 + i15 +
                    Float.floatToIntBits(f1) + i16 + i17 + i18 + (b ? 1 : 0) + l1 + FuzzerUtils.checkSum(iArr);
            return;
        }
        vMeth1_check_sum += i11 + Double.doubleToLongBits(d) + i12 + Float.floatToIntBits(f) + i13 + i14 + i15 +
                Float.floatToIntBits(f1) + i16 + i17 + i18 + (b ? 1 : 0) + l1 + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(int i8, int i9, int i10) {

        int i19 = -106, i20 = 10, i21 = -3607, i22 = 65091, i23 = 237;
        double d1 = -2.29663;
        boolean b1 = true;
        boolean[] bArr = new boolean[N];
        float f2 = 2.691F;
        byte by = -1;
        short s = 8353;

        FuzzerUtils.init(bArr, true);

        vMeth1(-3, -2.99222);
        i10 = i9;
        for (i19 = 128; 5 < i19; i19--) {
            i21 = 13;
            while ((i21 -= 2) > 0) {
                i9 = (int) d1;
                i9 += (((i21 * i20) + Test0481.instanceCount) - i9);
                bArr[i21] = b1;
                i10 *= i8;
                f2 = -2;
            }
            i20 += (((i19 * i9) + Test0481.instanceCount) - Test0481.instanceCount);
            for (i22 = 1; 13 > i22; i22++) {
                by -= (byte) f2;
                f2 += (((i22 * i8) + s) - Test0481.instanceCount);
                i23 += i22;
            }
            i10 += (((i19 * Test0481.iFld) + i23) - i23);
        }
        long meth_res = i8 + i9 + i10 + i19 + i20 + i21 + Double.doubleToLongBits(d1) + (b1 ? 1 : 0) +
                Float.floatToIntBits(f2) + i22 + i23 + by + s + FuzzerUtils.checkSum(bArr);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth(int i3, int i4, int i5) {

        int i6 = 7, i7 = -46711, i24 = 38;
        boolean b2 = false;
        long l2 = -154L;
        long[] lArr = new long[N];
        double[] dArr = new double[N];

        FuzzerUtils.init(dArr, 11.58159);
        FuzzerUtils.init(lArr, 3536953003L);

        for (i6 = 9; 196 > i6; ++i6) {
            dArr[i6 + 1] -= ((++lArr[i6]) >> i3);
            if (b2) {
                i3 -= (int) (-65257 + ((Test0481.instanceCount % -15395) * (-Test0481.instanceCount)));
                iMeth(i5, Test0481.iFld, i7);
                i5 = (int) Test0481.lFld;
                Test0481.iArrFld[i6] = (int) Test0481.lFld;
                vMeth_check_sum += i3 + i4 + i5 + i6 + i7 + (b2 ? 1 : 0) + l2 + i24 +
                        Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(lArr);
                return;
            } else {
                Test0481.iArrFld = Test0481.iArrFld;
                switch ((((i7 >>> 1) % 10) * 5) + 41) {
                    case 74:
                        try {
                            i4 = (-3851 % Test0481.iArrFld[i6 - 1]);
                            Test0481.iArrFld[i6] = (-128 / Test0481.iFld);
                            i3 = (Test0481.iArrFld[i6] / i7);
                        } catch (ArithmeticException a_e) {
                        }
                        break;
                    case 65:
                        for (l2 = 1; l2 < 9; ++l2) {
                            i3 >>= i4;
                            i24 ^= (int) -12L;
                            i3 = i4;
                            lArr[(int) (l2 - 1)] <<= i7;
                        }
                        break;
                    case 90:
                        try {
                            Test0481.iArrFld[i6 + 1] = (i3 / i4);
                            Test0481.iArrFld[i6 + 1] = (Test0481.iArrFld[i6] % Test0481.iArrFld[i6 - 1]);
                            i3 = (Test0481.iArrFld[i6] % -9);
                        } catch (ArithmeticException a_e) {
                        }
                        break;
                    case 45:
                        i5 >>>= i5;
                        break;
                    case 56:
                        try {
                            i7 = (Test0481.iArrFld[i6 - 1] % i7);
                            i24 = (i7 / i7);
                            Test0481.iArrFld[i6 - 1] = (i24 % -62757);
                        } catch (ArithmeticException a_e) {
                        }
                        break;
                    case 48:
                        Test0481.instanceCount -= i24;
                        break;
                    case 68:
                        i24 += (i6 | l2);
                        break;
                    case 78:
                        Test0481.lFld = i4;
                        break;
                    case 88:
                        i3 += (((i6 * Test0481.lFld) + i4) - Test0481.lFld);
                        break;
                    case 49:
                        i5 = i5;
                        break;
                    default:
                        Test0481.instanceCount = Test0481.instanceCount;
                }
            }
        }
        vMeth_check_sum += i3 + i4 + i5 + i6 + i7 + (b2 ? 1 : 0) + l2 + i24 +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(lArr);
    }

    public static void main(String[] strArr) {

        try {
            Test0481 _instance = new Test0481();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = -1, i1 = -80, i2 = -179, i25 = 243, i26 = 200, i27 = 40950, i28 = 105, i29 = 198;
        long l = 3520985898873281677L;
        float f3 = 2.466F;
        byte by2 = -26;
        boolean b3 = true;
        double d2 = -34.18185;
        short s1 = 20675;

        for (i = 9; i < 261; i++) {
            if (b3) {
                for (l = i; l < 100; l++) {
                    byte by1 = -44;
                    i1 = (int) (Integer.reverseBytes(i1 - i1) + ((i2 * i1) / ((l + l) | 1)));
                    vMeth(i25, i25, 8);
                    i1 = i1;
                    Test0481.instanceCount += by1;
                    f3 = i2;
                    i25 -= (int) Test0481.lFld;
                }
                Test0481.lFld += i;
                i2 += (i * i);
            } else if (b3) {
                for (i26 = 6; i26 < 100; ++i26) {
                    switch ((((2 >>> 1) % 6) * 5) + 4) {
                        case 24:
                            i25 += (((i26 * i1) + f3) - i26);
                            Test0481.instanceCount += i26;
                            break;
                        case 8:
                            i2 <<= by2;
                            break;
                        case 31:
                            Test0481.iArrFld[i - 1] -= Test0481.iFld;
                            i2 += (i26 | (long) f3);
                            i2 = 10347;
                            break;
                        case 32:
                            Test0481.lFld = i25;
                            dArrFld[i - 1] -= f3;
                            Test0481.lFld += i26;
                            if (b3) break;
                            break;
                        case 18:
                            Test0481.instanceCount += -2;
                            break;
                        case 33:
                            f3 = (float) d2;
                            i27 = i27;
                            for (i28 = 1; i28 < 2; ++i28) {
                                i27 = (int) Test0481.instanceCount;
                                s1 -= (short) Test0481.lFld;
                                i29 += i28;
                            }
                            break;
                    }
                }
            } else if (b3) {
                i25 = i25;
            } else {
                i27 = s1;
            }
        }

        FuzzerUtils.out.println("i i1 l = " + i + "," + i1 + "," + l);
        FuzzerUtils.out.println("i2 i25 f3 = " + i2 + "," + i25 + "," + Float.floatToIntBits(f3));
        FuzzerUtils.out.println("i26 i27 by2 = " + i26 + "," + i27 + "," + by2);
        FuzzerUtils.out.println("b3 d2 i28 = " + (b3 ? 1 : 0) + "," + Double.doubleToLongBits(d2) + "," + i28);
        FuzzerUtils.out.println("i29 s1 = " + i29 + "," + s1);

        FuzzerUtils.out.println("Test0481.instanceCount Test0481.iFld Test0481.lFld = " + Test0481.instanceCount + "," + Test0481.iFld +
                "," + Test0481.lFld);
        FuzzerUtils.out.println("Test0481.iArrFld dArrFld = " + FuzzerUtils.checkSum(Test0481.iArrFld) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
