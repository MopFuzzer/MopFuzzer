// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:58 2023
public class Test0233 {

    public static final int N = 400;

    public static long instanceCount = -1369000412L;
    public static float fFld = 2.736F;
    public static volatile byte byFld = 11;
    public static int iFld = -14;
    public static double[] dArrFld = new double[N];
    public static long vMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0233.dArrFld, -115.24320);
    }

    public boolean bFld = true;

    public static void vMeth1(int i4, long l2, int i5) {

        int i6 = -48785, i7 = 198, i8 = 36, i9 = 168, i10 = -222, i11 = 9;
        short s = -1420;
        double d1 = 84.73800;
        byte by = -126;

        switch (((i5 >>> 1) % 1) + 70) {
            case 70:
                Test0233.fFld /= (l2 | 1);
                for (i6 = 22; 381 > i6; i6++) {
                    s -= (short) i5;
                }
                for (i8 = 267; i8 > 10; i8 -= 2) {
                    d1 -= Test0233.instanceCount;
                    Test0233.fFld += i8;
                    i5 *= -12;
                    Test0233.instanceCount = l2;
                }
                break;
            default:
                l2 -= i7;
                for (i10 = 3; 356 > i10; i10++) {
                    by += (byte) -2;
                }
                i5 = i8;
                s >>= (short) l2;
        }
        Test0233.dArrFld[(i6 >>> 1) % N] = i5;
        vMeth1_check_sum += i4 + l2 + i5 + i6 + i7 + s + i8 + i9 + Double.doubleToLongBits(d1) + i10 + i11 + by;
    }

    public static double dMeth(int i2) {

        long l1 = 1L;
        int i3 = -13;
        int i12 = 0;
        int[] iArr1 = new int[N];
        byte by1 = 24;

        FuzzerUtils.init(iArr1, 33265);

        for (l1 = 8; l1 < 129; ++l1) {
            vMeth1(i3, Test0233.instanceCount, i2);
            i2 = i3;
            try {
                iArr1[(int) (l1 - 1)] = (iArr1[(int) (l1)] / -18637);
                i3 = (i12 % 132);
                i12 = (iArr1[(int) (l1 + 1)] % -38910);
            } catch (ArithmeticException a_e) {
            }
            i12 <<= i12;
            i2 += (int) (l1 * by1);
            Test0233.instanceCount -= -3684;
            i12 *= i2;
        }
        long meth_res = i2 + l1 + i3 + i12 + by1 + FuzzerUtils.checkSum(iArr1);
        dMeth_check_sum += meth_res;
        return (double) meth_res;
    }

    public static void vMeth(long l, double d) {

        int i1 = -18547;
        int i13 = 8;
        int i14 = 206;
        int i15 = -175;
        int i16 = 0;
        int[] iArr = new int[N];
        float f1 = 2.765F;
        float f2 = 2.443F;
        float[] fArr = new float[N];
        boolean b = false;
        long[] lArr = new long[N];

        FuzzerUtils.init(iArr, -118);
        FuzzerUtils.init(fArr, -1.49F);
        FuzzerUtils.init(lArr, 8L);

        iArr[(0 >>> 1) % N] |= (int) (((i1--) + (f1 -= Test0233.instanceCount)) % ((long) (dMeth(i1)) | 1));
        for (i13 = 19; i13 < 398; i13++) {
            switch (((i13 % 5) * 5) + 68) {
                case 77:
                    fArr[i13] -= (float) d;
                    i1 += (int) f2;
                    break;
                case 83:
                    i14 += (((i13 * f1) + Test0233.fFld) - i1);
                    i1 = (int) Test0233.instanceCount;
                    i14 = i13;
                    for (i15 = 1; 4 > i15; i15++) {
                        Test0233.instanceCount -= Test0233.byFld;
                        b = b;
                        lArr[i13 + 1] = -10656L;
                        f2 += (i15 * i13);
                        i14 -= (int) l;
                    }
                case 75:
                    f1 = i13;
                    break;
                case 86:
                    if (i15 != 0) {
                        vMeth_check_sum += l + Double.doubleToLongBits(d) + i1 + Float.floatToIntBits(f1) + i13 + i14 +
                                Float.floatToIntBits(f2) + i15 + i16 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr) +
                                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr);
                        return;
                    }
                    break;
                case 87:
                    l >>>= i15;
                default:
                    d += -63333;
            }
        }
        vMeth_check_sum += l + Double.doubleToLongBits(d) + i1 + Float.floatToIntBits(f1) + i13 + i14 +
                Float.floatToIntBits(f2) + i15 + i16 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr);
    }

    public static void main(String[] strArr) {

        try {
            Test0233 _instance = new Test0233();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        float f = -71.853F;
        int i = -55617;
        int i17 = 196;
        int i18 = -6428;
        int i19 = 57916;
        int[] iArr2 = new int[N];
        double d2 = 1.21962;
        long[] lArr1 = new long[N];

        FuzzerUtils.init(iArr2, -8);
        FuzzerUtils.init(lArr1, 867L);

        for (f = 3; 138 > f; f++) {
            i -= (i--);
            vMeth(56500L, d2);
            i += (int) f;
            for (i17 = 186; i17 > 1; i17--) {
                i18 >>= i18;
                i19 = 1;
                do {
                    i += (int) Test0233.instanceCount;
                    iArr2[i17] -= i19;
                    i <<= i;
                    iArr2[(int) (f)] >>= i19;
                    if (bFld) break;
                    switch (((i17 % 6) * 5) + 73) {
                        case 82:
                            i18 += (int) -103.51794;
                            iArr2[i19 - 1] = i18;
                            lArr1 = FuzzerUtils.long1array(N, (long) 4953525204796940020L);
                            break;
                        case 97:
                            Test0233.instanceCount += (i19 ^ Test0233.instanceCount);
                            Test0233.instanceCount <<= i19;
                            break;
                        case 78:
                            iArr2[i17] <<= i;
                            if (bFld) break;
                            break;
                        case 79:
                            if (true) continue;
                            break;
                        case 86:
                            i18 = i18;
                            lArr1[(int) (f - 1)] = i17;
                            Test0233.byFld += (byte) i17;
                            break;
                        case 95:
                            i18 = i19;
                            Test0233.byFld *= (byte) i17;
                            break;
                        default:
                            d2 -= -119.727F;
                            try {
                                i18 = (i19 % i19);
                                i = (35575 / i18);
                                i = (iArr2[i17 - 1] % 14714);
                            } catch (ArithmeticException a_e) {
                            }
                    }
                    i18 += (((i19 * f) + i) - Test0233.iFld);
                    i <<= i18;
                } while ((i19 += 3) < 2);
            }
        }

        FuzzerUtils.out.println("f i d2 = " + Float.floatToIntBits(f) + "," + i + "," + Double.doubleToLongBits(d2));
        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("iArr2 lArr1 = " + FuzzerUtils.checkSum(iArr2) + "," + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test0233.instanceCount Test0233.fFld Test0233.byFld = " + Test0233.instanceCount + "," +
                Float.floatToIntBits(Test0233.fFld) + "," + Test0233.byFld);
        FuzzerUtils.out.println("bFld Test0233.iFld Test0233.dArrFld = " + (bFld ? 1 : 0) + "," + Test0233.iFld + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0233.dArrFld)));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  dMeth ->  dMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 dMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
