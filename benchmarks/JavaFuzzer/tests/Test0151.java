// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:56 2023
public class Test0151 {

    public static final int N = 400;

    public static volatile long instanceCount = 86L;
    public static float fFld = 0.909F;
    public static long lFld = 5L;
    public static float[] fArrFld = new float[N];
    public static long[] lArrFld = new long[N];
    public static int[] iArrFld = new int[N];
    public static double[] dArrFld = new double[N];
    public static long vSmallMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0151.fArrFld, -112.33F);
        FuzzerUtils.init(Test0151.lArrFld, 21932L);
        FuzzerUtils.init(Test0151.iArrFld, 38663);
        FuzzerUtils.init(Test0151.dArrFld, -2.126856);
    }

    public volatile byte byFld = -38;
    public boolean[] bArrFld = new boolean[N];

    public static void vSmallMeth(boolean b, int i2) {

        int[] iArr = new int[N];

        FuzzerUtils.init(iArr, 45013);

        i2 += (int) (Test0151.fArrFld[(i2 >>> 1) % N]--);
        Test0151.fArrFld[(i2 >>> 1) % N] *= Integer.reverseBytes(iArr[(i2 >>> 1) % N] <<= (i2--));
        vSmallMeth_check_sum += (b ? 1 : 0) + i2 + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(long l, int i6) {

        int i7 = -9, i8 = -3, i9 = 2, i10 = 164, i11 = 45385, i12 = 11, i13 = -104;
        byte by = 52;
        boolean b2 = true;

        for (i7 = 6; i7 < 162; ++i7) {
            vSmallMeth(true, -63);
            i9 = 10;
            do {
                for (i10 = 1; 1 > i10; i10++) {
                    by *= (byte) i8;
                    if (b2) break;
                    switch (((i10 % 7) * 5) + 115) {
                        case 119:
                        case 130:
                            i8 = i7;
                            Test0151.lArrFld[i10 + 1] = l;
                            try {
                                i6 = (26985 % i7);
                                Test0151.iArrFld[(162 >>> 1) % N] = (0 % i7);
                                i6 = (i11 / i7);
                            } catch (ArithmeticException a_e) {
                            }
                            break;
                        case 145:
                            Test0151.fArrFld[i9 - 1] = -4;
                            switch ((i9 % 9) + 36) {
                                case 36:
                                    i6 *= i8;
                                    break;
                                case 37:
                                    i12 += (((i10 * i10) + Test0151.fFld) - Test0151.instanceCount);
                                    i11 += i11;
                                case 38:
                                    i8 = (int) l;
                                case 39:
                                    Test0151.instanceCount -= i9;
                                    break;
                                case 40:
                                    i11 = (int) Test0151.instanceCount;
                                    break;
                                case 41:
                                    i12 = i6;
                                case 42:
                                case 43:
                                    i11 += (((i10 * Test0151.instanceCount) + i13) - by);
                                case 44:
                                    i11 = 157;
                                    break;
                                default:
                                    Test0151.lArrFld[i9] -= by;
                            }
                            break;
                        case 140:
                            i6 = (int) Test0151.instanceCount;
                            break;
                        case 147:
                            by = (byte) 14;
                            break;
                        case 148:
                            l = i12;
                        case 122:
                            by = (byte) i7;
                            break;
                        default:
                            l += (i10 * i12);
                    }
                }
            } while (--i9 > 0);
        }
        vMeth_check_sum += l + i6 + i7 + i8 + i9 + i10 + i11 + by + (b2 ? 1 : 0) + i12 + i13;
    }

    public static boolean bMeth() {

        int i3 = 47443, i4 = -68, i5 = 17203, i14 = -43577;
        float f = -1.669F;
        double d = 1.70050;

        i3 = 1;
        do {
            for (i4 = 1; i4 < 22; i4++) {
                vMeth(35215L, i3);
                for (f = 2; f > 1; --f) {
                    i5 -= i5;
                    Test0151.iArrFld[i4] += i4;
                    switch ((i3 % 1) + 109) {
                        case 109:
                    }
                    Test0151.iArrFld[i4 - 1] = (int) Test0151.instanceCount;
                    i14 += (int) ((long) f ^ Test0151.instanceCount);
                    Test0151.instanceCount &= Test0151.instanceCount;
                    Test0151.instanceCount += (long) (f * f);
                    i5 += (-48502 + (f * f));
                    Test0151.instanceCount += Test0151.instanceCount;
                }
                d -= i3;
                i14 = i4;
            }
        } while ((i3 += 3) < 211);
        long meth_res = i3 + i4 + i5 + Float.floatToIntBits(f) + i14 + Double.doubleToLongBits(d);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static void main(String[] strArr) {

        try {
            Test0151 _instance = new Test0151();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = -22674, i1 = -44, i15 = -5, i16 = -12, i17 = 100, i18 = 33, i19 = -82, i20 = -198, i21 = 7;
        boolean b1 = true;
        short s = 25782;

        for (i = 7; i < 300; i++) {
            for (int smallinvoc = 0; smallinvoc < 62; smallinvoc++) vSmallMeth(bArrFld[i] = (b1 = bMeth()), i);
            i1 <<= (int) Test0151.instanceCount;
            if (b1) break;
            Test0151.instanceCount <<= Test0151.instanceCount;
            Test0151.fArrFld[i - 1] = Test0151.fFld;
            for (i15 = 1; i15 < 86; i15++) {
                i16 = (int) Test0151.fFld;
                Test0151.lArrFld[i] <<= i16;
            }
        }
        i17 = 1;
        do {
            for (i18 = 8; 199 > i18; i18++) {
                i1 = i;
                for (i20 = 2; i20 > 1; i20--) {
                    Test0151.lArrFld[i18] *= i18;
                    i19 >>>= i18;
                    s *= (short) i16;
                    byFld += (byte) i16;
                    if (b1) {
                        i16 += i20;
                        Test0151.dArrFld[i18] -= i15;
                        Test0151.lFld -= i1;
                        Test0151.iArrFld[i17] -= i18;
                    } else if (false) {
                        Test0151.lFld &= Test0151.lFld;
                        Test0151.fFld = 122;
                    } else if (b1) {
                        i16 -= (int) Test0151.instanceCount;
                    } else {
                        Test0151.lArrFld[i18] *= Test0151.instanceCount;
                        i19 >>= i18;
                        Test0151.iArrFld[i17 - 1] = i16;
                        i16 <<= i15;
                    }
                    i1 = i15;
                }
            }
        } while ((i17 += 3) < 378);

        FuzzerUtils.out.println("i i1 b1 = " + i + "," + i1 + "," + (b1 ? 1 : 0));
        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 s = " + i21 + "," + s);

        FuzzerUtils.out.println("Test0151.instanceCount Test0151.fFld byFld = " + Test0151.instanceCount + "," +
                Float.floatToIntBits(Test0151.fFld) + "," + byFld);
        FuzzerUtils.out.println("Test0151.lFld Test0151.fArrFld bArrFld = " + Test0151.lFld + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0151.fArrFld)) + "," + FuzzerUtils.checkSum(bArrFld));
        FuzzerUtils.out.println("Test0151.lArrFld Test0151.iArrFld Test0151.dArrFld = " + FuzzerUtils.checkSum(Test0151.lArrFld) + ","
                + FuzzerUtils.checkSum(Test0151.iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0151.dArrFld)));

        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test vMeth bMeth
//DEBUG  bMeth ->  bMeth mainTest
//DEBUG  vMeth ->  vMeth bMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
