// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:58 2023
public class Test0223 {

    public static final int N = 400;

    public static long instanceCount = -9047910393555029085L;
    public static double dFld1 = -123.54834;
    public static volatile int iFld = 31802;
    public static int[] iArrFld = new int[N];
    public static long[] lArrFld = new long[N];
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0223.iArrFld, -59206);
        FuzzerUtils.init(Test0223.lArrFld, -2328728810L);
    }

    public double dFld = -1.14502;

    public static void vMeth1(int i7, long l2) {

        int i8 = 2, i9 = -10, i10 = 11, i11 = -58, i12 = -6;
        double d = 1.128608;
        float f2 = -75.599F;
        boolean b = true;
        byte by = -6;
        byte[] byArr = new byte[N];

        FuzzerUtils.init(byArr, (byte) 37);

        for (i8 = 10; i8 < 193; ++i8) {
            for (i10 = 1; i10 < 9; i10++) {
                Test0223.iArrFld[i8] >>>= (int) 61196L;
                if (i7 != 0) {
                    vMeth1_check_sum += i7 + l2 + i8 + i9 + i10 + i11 + Double.doubleToLongBits(d) + i12 +
                            Float.floatToIntBits(f2) + (b ? 1 : 0) + by + FuzzerUtils.checkSum(byArr);
                    return;
                }
                i9 += (i10 * i10);
                i11 |= (int) -3729508176L;
                Test0223.iArrFld[i10 + 1] = 234;
                i9 ^= (int) Test0223.instanceCount;
                for (d = 1; 2 > d; d++) {
                    f2 += (float) (((d * l2) + i9) - l2);
                    byArr[(int) (d + 1)] = (byte) i11;
                }
            }
            l2 *= i9;
            if (b) continue;
            b = b;
            i11 = by;
        }
        vMeth1_check_sum += i7 + l2 + i8 + i9 + i10 + i11 + Double.doubleToLongBits(d) + i12 + Float.floatToIntBits(f2)
                + (b ? 1 : 0) + by + FuzzerUtils.checkSum(byArr);
    }

    public static void vMeth(long l1) {

        int i13 = 23, i14 = 73, i15 = 0, i16 = 12, i17 = 7, i18 = 0, i19 = 58749, i20 = 214, i21 = -25565, i22 = 1;
        float f3 = 125.687F;
        byte by1 = 87;
        double d1 = -18.70652;
        long[] lArr1 = new long[N];

        FuzzerUtils.init(lArr1, -7306249779950231792L);

        vMeth1(i13, -136L);
        for (i14 = 14; i14 < 280; ++i14) {
            f3 += 53583;
            lArr1[i14 + 1] -= l1;
            f3 += i13;
            by1 >>= (byte) i13;
            for (i16 = i14; i16 < 6; i16++) {
                i15 += i16;
                for (i18 = 1; i14 < i18; i18 -= 2) {
                    l1 = i13;
                }
                l1 <<= i16;
            }
            for (i20 = 1; i20 < 6; i20++) {
                Test0223.iArrFld[i20 - 1] = i22;
                f3 -= (float) d1;
                i22 = 4;
            }
        }
        vMeth_check_sum += l1 + i13 + i14 + i15 + Float.floatToIntBits(f3) + by1 + i16 + i17 + i18 + i19 + i20 + i21 +
                i22 + Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(lArr1);
    }

    public static int iMeth(long l, float f1, int i1) {

        int i2 = -23075, i3 = 0, i4 = -40051, i5 = -9, i6 = -7;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, 18102L);

        for (i2 = 324; i2 > 16; --i2) {
            for (i4 = 5; i4 > 1; i4--) {
                i5 = (int) l;
                i6 = 1;
                while (++i6 < 2) {
                    i1 += (i6 * i6);
                    i5 = (int) lArr[i4 - 1];
                    l -= (long) (++f1);
                    vMeth(-46384L);
                    switch ((i4 % 2) + 50) {
                        case 50:
                            i1 -= i6;
                            break;
                        case 51:
                            i1 = (int) 0L;
                        default:
                            switch (((i6 % 2) * 5) + 50) {
                                case 57:
                                    try {
                                        i1 = (i6 % 63124);
                                        i5 = (i2 / i1);
                                        Test0223.iArrFld[i2] = (61854 % i2);
                                    } catch (ArithmeticException a_e) {
                                    }
                                    if (false) break;
                                    f1 *= (float) Test0223.dFld1;
                                    break;
                                case 52:
                                    Test0223.iArrFld[i6] -= i2;
                                    break;
                            }
                    }
                }
            }
        }
        long meth_res = l + Float.floatToIntBits(f1) + i1 + i2 + i3 + i4 + i5 + i6 + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0223 _instance = new Test0223();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = -18, i23 = 14, i24 = 11963, i25 = 100, i26 = 143;
        float f = 0.978F;
        boolean b1 = false;
        long l3 = 38750L;
        byte by2 = 64;
        byte[] byArr1 = new byte[N];
        short s = 5492;

        FuzzerUtils.init(byArr1, (byte) 45);

        switch (((((int) (dFld + i)) >>> 1) % 1) + 123) {
            case 123:
                i = (i * Test0223.iArrFld[(i >>> 1) % N]);
                f = 1;
                do {
                    Test0223.instanceCount += (iMeth(Test0223.instanceCount, f, i) - 235L);
                    dFld += i;
                    if (b1) continue;
                    i -= (int) Test0223.instanceCount;
                    for (l3 = 1; 70 > l3; ++l3) {
                        by2 = (byte) i;
                        s >>>= (short) i23;
                        switch ((int) ((f % 5) + 40)) {
                            case 40:
                                i = i23;
                                Test0223.instanceCount += (104L + (l3 * l3));
                            case 41:
                                Test0223.instanceCount = i23;
                                i24 = 1;
                                do {
                                    Test0223.instanceCount = i23;
                                    if (b1) break;
                                    i *= (int) f;
                                    i23 += (i24 + i23);
                                    Test0223.instanceCount = -2608272480L;
                                    i25 -= (int) l3;
                                    i25 += i24;
                                    if (b1) {
                                        Test0223.lArrFld[(int) (l3 + 1)] = by2;
                                        byArr1[(int) (l3)] *= (byte) s;
                                        byArr1[(int) (l3 - 1)] -= (byte) dFld;
                                        i25 = i23;
                                    } else {
                                        i23 += (((i24 * i26) + i26) - Test0223.instanceCount);
                                        i23 <<= i24;
                                        i26 -= (int) Test0223.instanceCount;
                                    }
                                } while (++i24 < 2);
                                break;
                            case 42:
                                try {
                                    i25 = (Test0223.iArrFld[(int) (f - 1)] % -55);
                                    Test0223.iArrFld[(int) (l3 + 1)] = (i23 % -241);
                                    Test0223.iFld = (54936 / i);
                                } catch (ArithmeticException a_e) {
                                }
                            case 43:
                                i23 |= (int) l3;
                                break;
                            case 44:
                                i25 += -5;
                                break;
                            default:
                        }
                    }
                } while (++f < 361);
            default:
                Test0223.instanceCount *= -200;
        }

        FuzzerUtils.out.println("i f b1 = " + i + "," + Float.floatToIntBits(f) + "," + (b1 ? 1 : 0));
        FuzzerUtils.out.println("l3 i23 by2 = " + l3 + "," + i23 + "," + by2);
        FuzzerUtils.out.println("s i24 i25 = " + s + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 byArr1 = " + i26 + "," + FuzzerUtils.checkSum(byArr1));

        FuzzerUtils.out.println("Test0223.instanceCount dFld Test0223.dFld1 = " + Test0223.instanceCount + "," +
                Double.doubleToLongBits(dFld) + "," + Double.doubleToLongBits(Test0223.dFld1));
        FuzzerUtils.out.println("Test0223.iFld Test0223.iArrFld Test0223.lArrFld = " + Test0223.iFld + "," +
                FuzzerUtils.checkSum(Test0223.iArrFld) + "," + FuzzerUtils.checkSum(Test0223.lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
