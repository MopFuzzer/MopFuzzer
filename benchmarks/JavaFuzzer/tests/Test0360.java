// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:02 2023
public class Test0360 {

    public static final int N = 400;

    public static long instanceCount = 6L;
    public static byte byFld = -122;
    public static double dFld = 0.45458;
    public static volatile float fFld = 63.192F;
    public static int[][] iArrFld = new int[N][N];
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long lMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0360.iArrFld, 0);
    }

    public short sFld = -2623;

    public static void vMeth1(long l1, float f, int i5) {

        double d = 0.126645;
        float[] fArr = new float[N];

        FuzzerUtils.init(fArr, 122.996F);

        d += (i5 - (fArr[(i5 >>> 1) % N] %= (i5 | 1)));
        i5 -= Math.abs(Integer.reverseBytes(-200));
        l1 += -19621;
        vMeth1_check_sum += l1 + Float.floatToIntBits(f) + i5 + Double.doubleToLongBits(d) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static long lMeth1(int i8, int i9) {

        int i10 = -60780;
        int i11 = 33334;
        int i12 = -12;
        int[] iArr = new int[N];
        float f1 = -40.703F, f2 = 0.281F;

        FuzzerUtils.init(iArr, -40);

        for (i10 = 6; i10 < 223; i10++) {
            short s = 18121;
            iArr[i10] -= i8;
            i9 += (int) f1;
            Test0360.byFld += (byte) (i10 + i10);
            switch (((i10 % 2) * 5) + 99) {
                case 109:
                    Test0360.instanceCount += (i10 * i10);
                    iArr[i10 + 1] += (int) f1;
                    break;
                case 104:
                    i8 -= s;
                default:
                    Test0360.instanceCount = Test0360.instanceCount;
                    if (true) {
                        i12 = 1;
                        do {
                            f2 = 1;
                            do {
                                Test0360.iArrFld[(i9 >>> 1) % N][i12 + 1] = -93;
                                i11 = (int) Test0360.instanceCount;
                                Test0360.instanceCount += (long) (((f2 * i8) + i12) - i12);
                            } while (++f2 < 1);
                        } while (++i12 < 7);
                    } else {
                        i8 += i10;
                    }
            }
        }
        long meth_res = i8 + i9 + i10 + i11 + Float.floatToIntBits(f1) + i12 + Float.floatToIntBits(f2) +
                FuzzerUtils.checkSum(iArr);
        lMeth1_check_sum += meth_res;
        return (long) meth_res;
    }

    public static long lMeth(double d1, int i6) {

        long l2 = -146L;
        int i7 = -6, i13 = -1, i14 = 213;
        short s1 = 29775;
        float f3 = -2.298F;

        for (l2 = 10; 369 > l2; l2++) {
            i6 *= (int) lMeth1(i7, i6);
            s1 += (short) l2;
            switch ((((-4124 >>> 1) % 2) * 5) + 57) {
                case 65:
                    i7 += (int) (((l2 * i7) + i6) - i7);
                    i7 += (int) l2;
                    for (i13 = (int) (l2); i13 < 5; ++i13) {
                        i14 = i13;
                        i7 = i6;
                        Test0360.iArrFld[i13 - 1][i13] <<= -190;
                        i7 = (int) -3711089863L;
                        try {
                            i6 = (i14 % i7);
                            i7 = (i7 % Test0360.iArrFld[(i13 >>> 1) % N][(int) (l2 + 1)]);
                            i6 = (i14 % i7);
                        } catch (ArithmeticException a_e) {
                        }
                        Test0360.instanceCount += (i13 - f3);
                        Test0360.instanceCount += (i13 + i13);
                        i14 = i13;
                    }
                    break;
                case 62:
                    i6 -= i6;
                default:
                    Test0360.byFld |= (byte) -18970;
            }
        }
        long meth_res = Double.doubleToLongBits(d1) + i6 + l2 + i7 + s1 + i13 + i14 + Float.floatToIntBits(f3);
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0360 _instance = new Test0360();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void vMeth(int i2, boolean b, long l) {

        int i3 = -182, i4 = 155, i15 = -31337, i16 = 70, i17 = 0, i18 = -51594, i19 = 4;

        for (i3 = 13; i3 < 382; ++i3) {
            float f4 = 5.425F;
            vMeth1(sFld - lMeth(Test0360.dFld, i2), f4, i4);
            for (i15 = 5; 1 < i15; i15 -= 3) {
                i4 -= (int) Test0360.instanceCount;
                i17 = 1;
                do {
                    i2 = (int) Test0360.instanceCount;
                    Test0360.instanceCount += (((i17 * f4) + l) - Test0360.byFld);
                    if (i3 != 0) {
                        vMeth_check_sum += i2 + (b ? 1 : 0) + l + i3 + i4 + i15 + i16 + i17 + i18 + i19;
                        return;
                    }
                    i2 *= i4;
                    i2 += (int) 84.663F;
                    i2 = i17;
                    i16 += (-11 + (i17 * i17));
                } while (++i17 < 5);
                for (i18 = 1; i18 < 5; i18++) {
                    Test0360.iArrFld[i18] = Test0360.iArrFld[i15 + 1];
                    if (i4 != 0) {
                        vMeth_check_sum += i2 + (b ? 1 : 0) + l + i3 + i4 + i15 + i16 + i17 + i18 + i19;
                        return;
                    }
                }
            }
        }
        vMeth_check_sum += i2 + (b ? 1 : 0) + l + i3 + i4 + i15 + i16 + i17 + i18 + i19;
    }

    public void mainTest(String[] strArr1) {

        int i = 0, i1 = 9, i20 = 13, i21 = 0, i22 = -13, i23 = 13;
        long l3 = -8666442547813178499L;
        long[] lArr = new long[N];
        boolean b1 = true;
        double[] dArr = new double[N];

        FuzzerUtils.init(lArr, -2618007763L);
        FuzzerUtils.init(dArr, 2.78108);

        for (i = 14; i < 254; ++i) {
            vMeth(i, false, Test0360.instanceCount);
            for (i20 = i; i20 < 105; ++i20) {
                i21 += i20;
                for (i22 = 1; i22 < 1; ++i22) {
                    switch (((i23 >>> 1) % 9) + 57) {
                        case 57:
                            lArr[i22 - 1] /= (i21 | 1);
                            Test0360.fFld += (i22 * i22);
                            try {
                                i23 = (i21 / -226);
                                i1 = (i1 % i20);
                                i21 = (i1 / 10739);
                            } catch (ArithmeticException a_e) {
                            }
                            Test0360.instanceCount = i1;
                            break;
                        case 58:
                            i23 <<= i23;
                            break;
                        case 59:
                            lArr[i20 + 1] >>= Test0360.instanceCount;
                            break;
                        case 60:
                            i1 <<= (int) Test0360.instanceCount;
                            l3 = (long) Test0360.fFld;
                            Test0360.instanceCount -= l3;
                            l3 -= -224;
                        case 61:
                            dArr[i22] += -1160;
                            Test0360.instanceCount -= i21;
                            break;
                        case 62:
                            i1 = i1;
                            break;
                        case 63:
                            Test0360.byFld *= (byte) i1;
                            Test0360.iArrFld[i20][i22 - 1] = 47806;
                            i1 = i21;
                            i23 += (((i22 * i21) + Test0360.instanceCount) - Test0360.instanceCount);
                        case 64:
                            Test0360.dFld -= i23;
                            Test0360.iArrFld[i20 + 1][i22] = i23;
                            l3 += (long) Test0360.fFld;
                        case 65:
                            sFld <<= (short) i20;
                            if (b1) break;
                            break;
                    }
                    Test0360.instanceCount = i23;
                    Test0360.fFld = -11L;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i20 = " + i + "," + i1 + "," + i20);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("l3 b1 lArr = " + l3 + "," + (b1 ? 1 : 0) + "," + FuzzerUtils.checkSum(lArr));
        FuzzerUtils.out.println("dArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test0360.instanceCount sFld Test0360.byFld = " + Test0360.instanceCount + "," + sFld + "," +
                Test0360.byFld);
        FuzzerUtils.out.println("Test0360.dFld Test0360.fFld Test0360.iArrFld = " + Double.doubleToLongBits(Test0360.dFld) + "," +
                Float.floatToIntBits(Test0360.fFld) + "," + FuzzerUtils.checkSum(Test0360.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("lMeth1_check_sum: " + lMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  lMeth1 ->  lMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}