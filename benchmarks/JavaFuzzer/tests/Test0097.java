// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:55 2023
public class Test0097 {

    public static final int N = 400;

    public static volatile long instanceCount = -13L;
    public static volatile boolean bFld = false;
    public static byte byFld = 104;
    public static int[] iArrFld = new int[N];
    public static double[] dArrFld = new double[N];
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    static {
        FuzzerUtils.init(Test0097.iArrFld, 5);
        FuzzerUtils.init(Test0097.dArrFld, 0.127088);
    }

    public static void vMeth2(long l3, double d) {

        int i7 = 101, i8 = 218, i9 = 69, i10 = -233, i11 = 47629, i12 = 63965, i13 = -2;
        double d1 = 17.7462;
        float f = 90.947F;

        for (i7 = 256; i7 > 3; --i7) {
            Test0097.iArrFld[i7 - 1] = i7;
            for (i9 = 1; i9 < 6; i9++) {
                i10 = i8;
            }
            if (Test0097.bFld) break;
            for (d1 = i7; d1 < 6; d1 += 3) {
                for (i12 = 1; i12 < 1; i12++) {
                    l3 >>>= i8;
                    d += i8;
                    i13 += (i12 * i12);
                    i11 += -138;
                    i11 = i9;
                }
                i13 += (int) (((d1 * i9) + l3) - f);
                Test0097.instanceCount += -85;
                Test0097.iArrFld[i7] *= i10;
            }
        }
        vMeth2_check_sum += l3 + Double.doubleToLongBits(d) + i7 + i8 + i9 + i10 + Double.doubleToLongBits(d1) + i11 +
                i12 + i13 + Float.floatToIntBits(f);
    }

    public static void vMeth1(int i5, int i6, long l2) {

        double d2 = 41.118439;
        int i14 = 132, i15 = 44737, i16 = 30, i17 = -98, i18 = 105, i19 = 14, i20 = 3;
        float f1 = -76.157F;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, -14693L);

        vMeth2(l2, d2);
        l2 = 3;
        i5 = (int) -8L;
        lArr[(i6 >>> 1) % N] &= i5;
        for (i14 = 360; 13 < i14; i14 -= 3) {
            i5 = i15;
        }
        for (i16 = 12; i16 < 263; ++i16) {
            i18 = 1;
            while (++i18 < 6) {
                for (i19 = 1; i19 < 1; ++i19) {
                    Test0097.iArrFld = Test0097.iArrFld;
                    i20 += (i19 + i18);
                    try {
                        i6 = (i18 % i5);
                        i5 = (i18 / Test0097.iArrFld[i18 - 1]);
                        i20 = (i5 / i17);
                    } catch (ArithmeticException a_e) {
                    }
                    f1 *= f1;
                    i6 *= (int) f1;
                    i20 += (int) -1.98F;
                }
            }
        }
        vMeth1_check_sum += i5 + i6 + l2 + Double.doubleToLongBits(d2) + i14 + i15 + i16 + i17 + i18 + i19 + i20 +
                Float.floatToIntBits(f1) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(int i1, int i2, long l1) {

        int i3 = -13, i4 = -59906, i21 = -14, i22 = 11, i23 = 7;
        float f2 = 0.782F, f3 = -122.359F;

        Test0097.iArrFld[(-185 >>> 1) % N] += i2;
        for (i3 = 126; i3 > 7; --i3) {
            vMeth1(11, i2, Test0097.instanceCount);
            f2 += (i3 * Test0097.instanceCount);
            l1 |= l1;
        }
        for (f3 = 7; f3 < 203; ++f3) {
            l1 = i4;
            i2 += (int) (f3 * f3);
            f2 = f3;
            i21 += -2;
            i4 = i1;
            for (i22 = 1; i22 < 8; ++i22) {
                i1 += (int) f3;
                l1 = i2;
            }
            Test0097.dArrFld[(int) (f3 + 1)] = l1;
        }
        vMeth_check_sum += i1 + i2 + l1 + i3 + i4 + Float.floatToIntBits(f2) + Float.floatToIntBits(f3) + i21 + i22 +
                i23;
    }

    public static void main(String[] strArr) {

        try {
            Test0097 _instance = new Test0097();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        long l = -417905414L;
        long[] lArr1 = new long[N];
        int i = -51063, i24 = -187, i25 = -57525, i26 = 3, i27 = 0, i28 = 16009, i29 = -72;
        double d3 = 67.130038;
        short s = 15906;
        float f4 = 40.867F;

        FuzzerUtils.init(lArr1, -5L);

        for (l = 4; 264 > l; ++l) {
            vMeth(i, i, Test0097.instanceCount);
            Test0097.instanceCount = i;
            lArr1[(int) (l + 1)] = i;
        }
        i24 = 1;
        do {
            i += (((i24 * i24) + i24) - Test0097.instanceCount);
            if (true) break;
            Test0097.bFld = Test0097.bFld;
            for (i25 = 4; i25 < 150; i25++) {
                for (i27 = 1; i27 < 2; ++i27) {
                    i = i29;
                    try {
                        i = (i29 % 70);
                        i = (i / Test0097.iArrFld[i27]);
                        i26 = (i26 % i24);
                    } catch (ArithmeticException a_e) {
                    }
                    d3 -= 22;
                    i29 = i26;
                    Test0097.iArrFld[i24] = i;
                    Test0097.instanceCount <<= Test0097.byFld;
                    lArr1[i24] -= l;
                }
                s %= (short) ((long) (f4) | 1);
                Test0097.instanceCount = i28;
            }
        } while ((i24 += 2) < 335);
        Test0097.iArrFld[(i29 >>> 1) % N] = i;
        d3 -= i29;

        FuzzerUtils.out.println("l i i24 = " + l + "," + i + "," + i24);
        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("i28 i29 d3 = " + i28 + "," + i29 + "," + Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("s f4 lArr1 = " + s + "," + Float.floatToIntBits(f4) + "," +
                FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test0097.instanceCount Test0097.bFld Test0097.byFld = " + Test0097.instanceCount + "," + (Test0097.bFld ?
                1 : 0) + "," + Test0097.byFld);
        FuzzerUtils.out.println("Test0097.iArrFld Test0097.dArrFld = " + FuzzerUtils.checkSum(Test0097.iArrFld) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0097.dArrFld)));

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
