// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:57 2023
public class Test0186 {

    public static final int N = 400;

    public static long instanceCount = -6250250747342805821L;
    public static int iFld = -113;
    public static double dFld = 0.47497;
    public static long[] lArrFld = new long[N];
    public static float[] fArrFld = new float[N];
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long bMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0186.lArrFld, 47962L);
        FuzzerUtils.init(Test0186.fArrFld, 0.189F);
    }

    public int iFld1 = -44059;

    public static boolean bMeth(int i2, float f) {

        long l2 = 12L;
        int i3 = -40818;
        int i4 = -44583;
        int i5 = -37417;
        int[][] iArr = new int[N][N];
        double d = -2.99621;

        FuzzerUtils.init(iArr, 213);

        Test0186.lArrFld[(Test0186.iFld >>> 1) % N] = -63995L;
        for (l2 = 1; l2 < 131; l2++) {
            for (i4 = 12; i4 > 1; i4--) {
                Test0186.iFld &= -62;
                switch ((((i5 >>> 1) % 1) * 5) + 109) {
                    case 113:
                        i3 = (int) Test0186.instanceCount;
                        if (false) break;
                        iArr[(int) (l2 - 1)][(int) (l2 - 1)] |= i2;
                        Test0186.instanceCount *= l2;
                    default:
                        iArr[i4][i4] = (int) -517229233613956599L;
                        Test0186.instanceCount = i2;
                }
            }
            d = 1;
            while (++d < 12) {
                i3 += (int) (d * d);
                Test0186.instanceCount += i5;
                iArr[(int) (d)][(int) (l2 - 1)] = i4;
            }
        }
        long meth_res = i2 + Float.floatToIntBits(f) + l2 + i3 + i4 + i5 + Double.doubleToLongBits(d) +
                FuzzerUtils.checkSum(iArr);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static void vMeth1(boolean b, long l1) {

        byte by1 = -90;
        int i = 13;
        int i1 = 100;
        int i6 = -86;
        int i7 = -65265;
        int i8 = 188;
        int i9 = -8;
        int i10 = -53;
        int[] iArr1 = new int[N];
        float f1 = -1.538F;

        FuzzerUtils.init(iArr1, 5074);

        l1 = (by1 * Test0186.iFld);
        for (i = 1; 136 > i; i++) {
            bMeth(i, f1);
            Test0186.fArrFld[i] = Test0186.instanceCount;
        }
        iArr1[(Test0186.iFld >>> 1) % N] -= i;
        for (i6 = 13; i6 < 248; i6++) {
            i1 -= i6;
            i7 = i6;
            i1 = (int) Test0186.dFld;
            for (i8 = 1; i8 < 7; i8++) {
                Test0186.dFld *= l1;
                i9 += (int) (5L + (i8 * i8));
                Test0186.instanceCount += i1;
            }
        }
        i10 |= by1;
        i10 %= (int) ((long) (f1) | 1);
        vMeth1_check_sum += (b ? 1 : 0) + l1 + by1 + i + i1 + Float.floatToIntBits(f1) + i6 + i7 + i8 + i9 + i10 +
                FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(byte by, long l) {

        int i11 = -24773, i12 = 54743, i13 = -155, i14 = -3, i15 = -33, i16 = -180, i17 = 0;
        boolean b1 = false;
        float f2 = 0.373F;

        vMeth1(false, l);
        for (i11 = 13; i11 < 235; i11 += 3) {
            Test0186.iFld += Test0186.iFld;
            if (b1) continue;
        }
        by += (byte) f2;
        l = 28288;
        for (i13 = 153; i13 > 4; i13--) {
            Test0186.lArrFld[i13 - 1] = (long) Test0186.dFld;
            Test0186.instanceCount += i11;
            for (i15 = 1; i15 < 11; i15++) {
                i17 = 1;
                do {
                    i12 -= i12;
                    i14 += i14;
                    i12 >>>= 1;
                    if (i16 != 0) {
                        vMeth_check_sum += by + l + i11 + i12 + (b1 ? 1 : 0) + Float.floatToIntBits(f2) + i13 + i14 +
                                i15 + i16 + i17;
                        return;
                    }
                } while (++i17 < 2);
            }
        }
        vMeth_check_sum += by + l + i11 + i12 + (b1 ? 1 : 0) + Float.floatToIntBits(f2) + i13 + i14 + i15 + i16 + i17;
    }

    public static void main(String[] strArr) {

        try {
            Test0186 _instance = new Test0186();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        byte by2 = -50;
        short s = 26829;
        int i19 = -252;
        int i20 = -36438;
        int i21 = 34763;
        int i22 = -253;
        int i23 = 28390;
        int i24 = -55897;
        int i25 = 3;
        int[] iArr2 = new int[N];
        float f3 = 13.810F;

        FuzzerUtils.init(iArr2, -47125);

        Test0186.instanceCount -= ((-(Test0186.iFld--)) + ((Test0186.instanceCount + Test0186.iFld) + (-(--Test0186.iFld))));
        vMeth(by2, Test0186.instanceCount);
        for (int i18 : iArr2) {
            s = (short) Test0186.instanceCount;
            for (i19 = 63; i19 > 2; --i19) {
                Test0186.instanceCount -= Test0186.instanceCount;
                iArr2[i19 + 1] = (int) f3;
                Test0186.iFld += (((i19 * Test0186.instanceCount) + Test0186.iFld) - f3);
                Test0186.iFld *= iFld1;
                iArr2[i19 - 1] += iFld1;
                iArr2[i19 + 1] -= (int) f3;
                for (i21 = 1; 2 > i21; i21++) {
                    i20 += (-1 + (i21 * i21));
                    f3 *= 134;
                }
                Test0186.iFld += (i19 | Test0186.iFld);
                Test0186.iFld -= i19;
                Test0186.instanceCount += (((i19 * s) + i20) - i22);
            }
            i20 = i19;
            iFld1 -= i22;
            switch ((((Test0186.iFld >>> 1) % 3) * 5) + 90) {
                case 95:
                    Test0186.dFld = Test0186.iFld;
                    f3 = -120;
                case 91:
                    i23 = 1;
                    while ((i23 += 3) < 63) {
                        for (i24 = i23; i24 < 3; ++i24) {
                            iArr2[i24 + 1] = i19;
                            Test0186.lArrFld[i24 + 1] = (long) f3;
                            i18 *= i25;
                            Test0186.iFld += (i24 | by2);
                            Test0186.instanceCount = 145;
                            s = (short) i24;
                        }
                    }
                    break;
                case 94:
                    iFld1 >>= Test0186.iFld;
                    break;
                default:
                    if (true) continue;
            }
        }

        FuzzerUtils.out.println("by2 s i19 = " + by2 + "," + s + "," + i19);
        FuzzerUtils.out.println("i20 f3 i21 = " + i20 + "," + Float.floatToIntBits(f3) + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 iArr2 = " + i25 + "," + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test0186.instanceCount Test0186.iFld Test0186.dFld = " + Test0186.instanceCount + "," + Test0186.iFld +
                "," + Double.doubleToLongBits(Test0186.dFld));
        FuzzerUtils.out.println("iFld1 Test0186.lArrFld Test0186.fArrFld = " + iFld1 + "," + FuzzerUtils.checkSum(Test0186.lArrFld)
                + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0186.fArrFld)));

        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
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
//DEBUG  bMeth ->  bMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
