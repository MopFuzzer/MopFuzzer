// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:56 2023
public class Test0129 {

    public static final int N = 400;

    public static long instanceCount = -30L;
    public static volatile int iFld1 = -126;
    public static volatile boolean bFld = true;
    public static float fFld = -36.766F;
    public static double dFld = -98.100672;
    public static long[] lArrFld = new long[N];
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    static {
        FuzzerUtils.init(Test0129.lArrFld, 53365L);
    }

    public short sFld = -7689;

    public static void vMeth2() {

        int i9 = 57911;
        int[] iArr = new int[N];

        FuzzerUtils.init(iArr, 97);

        iArr = iArr;
        i9 = i9;
        vMeth2_check_sum += i9 + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(int i7, int i8) {

        double d1 = 114.84691;
        double[] dArr = new double[N];
        int i10 = 2, i11 = -28632, i12 = -238, i13 = 11, i14 = 67, i15 = -249, i16 = 221;
        short s1 = -6741;
        boolean b = true;
        byte[] byArr1 = new byte[N];

        FuzzerUtils.init(dArr, 87.72256);
        FuzzerUtils.init(byArr1, (byte) -126);

        vMeth2();
        for (d1 = 15; d1 < 355; ++d1) {
            Test0129.instanceCount -= Test0129.iFld1;
        }
        Test0129.instanceCount <<= i7;
        for (i11 = 12; i11 < 202; ++i11) {
            i8 = i7;
            i10 += (i11 * i11);
            i13 = 1;
            do {
                dArr[i13 + 1] = i14;
                for (i15 = 1; i15 > 1; i15--) {
                    byArr1[i13] = (byte) s1;
                }
                if (b) continue;
                dArr = FuzzerUtils.double1array(N, (double) 1.110983);
                i10 += (int) Test0129.instanceCount;
            } while (++i13 < 8);
            i16 -= -154;
        }
        vMeth1_check_sum += i7 + i8 + Double.doubleToLongBits(d1) + i10 + i11 + i12 + i13 + i14 + i15 + i16 + s1 + (b ?
                1 : 0) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(byArr1);
    }

    public static void vMeth(int i, long l, int i1) {

        int i2 = 6970;
        int i3 = -198;
        int i4 = 26481;
        int i5 = -9;
        int i6 = -4265;
        int i17 = 112;
        int i18 = 194;
        int[] iArr1 = new int[N];
        float f = 70.797F;
        short s = -8309;
        double d = 66.116260;
        byte by1 = 121;
        byte[] byArr = new byte[N];

        FuzzerUtils.init(byArr, (byte) 2);
        FuzzerUtils.init(iArr1, 0);

        for (i2 = 267; i2 > 6; i2--) {
            for (f = 6; 1 < f; f -= 3) {
                s = (short) Test0129.instanceCount;
                for (i5 = 1; i5 < 6; ++i5) {
                    d += byArr[i2 - 1];
                    vMeth1(i4, Test0129.iFld1);
                    i6 = (int) -82127500L;
                    i4 = i;
                    try {
                        iArr1[(int) (f - 1)] = (-159 / i1);
                        i4 = (iArr1[i2 - 1] % -39);
                        Test0129.iFld1 = (i2 / 25527);
                    } catch (ArithmeticException a_e) {
                    }
                    i += (i5 * i1);
                }
                i3 = (int) l;
                for (i17 = 1; i17 < 6; i17++) {
                    if (Test0129.bFld) {
                        iArr1[(int) (f - 1)] = i3;
                        i18 += (i17 | i3);
                    } else if (Test0129.bFld) {
                        by1 *= (byte) i17;
                    } else {
                        if (Test0129.bFld) break;
                    }
                }
            }
        }
        vMeth_check_sum += i + l + i1 + i2 + i3 + Float.floatToIntBits(f) + i4 + s + i5 + i6 +
                Double.doubleToLongBits(d) + i17 + i18 + by1 + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr1);
    }

    public static void main(String[] strArr2) {

        try {
            Test0129 _instance = new Test0129();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr2);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr3) {

        double d2 = 125.34893;
        double d3 = 100.10395;
        double[] dArr1 = new double[N];
        int i19 = 169;
        int i20 = 163;
        int i21 = 5141;
        int i22 = -86;
        int i23 = 20608;
        int i24 = -7943;
        int i25 = -13;
        int i26 = 62;
        int i27 = -48;
        int[][] iArr2 = new
                int[N][N];
        byte by2 = 105;
        long l2 = -551574024L;

        FuzzerUtils.init(dArr1, 111.87266);
        FuzzerUtils.init(iArr2, 1);

        vMeth(Test0129.iFld1, Test0129.instanceCount, Test0129.iFld1);
        Test0129.fFld = Test0129.instanceCount;
        Test0129.iFld1 = Test0129.iFld1;
        Test0129.fFld -= Test0129.instanceCount;
        dArr1 = dArr1;
        Test0129.iFld1 = (int) Test0129.fFld;
        d2 = 1;
        while (++d2 < 149) {
            Test0129.fFld = 14;
            i19 -= Test0129.iFld1;
        }
        for (d3 = 21; d3 < 374; ++d3) {
            iArr2[(int) (d3 + 1)] = iArr2[(int) (d3)];
        }
        Test0129.instanceCount = 2;
        by2 = (byte) sFld;
        for (i21 = 12; 265 > i21; i21++) {
            Test0129.fFld += i22;
            for (l2 = 99; i21 < l2; l2--) {
                Test0129.dFld = Test0129.fFld;
                i22 = i20;
                Test0129.fFld = i23;
                i22 -= (int) 2089849284L;
            }
            i23 = 141;
            for (i24 = i21; i24 < 99; i24++) {
                i20 >>= i21;
            }
            i19 = (int) l2;
            for (i26 = i21; 99 > i26; ++i26) {
                if (Test0129.bFld) {
                    i25 += (i26 * i26);
                    Test0129.iFld1 = i22;
                    Test0129.instanceCount &= i21;
                } else {
                    i20 *= i21;
                }
            }
        }

        FuzzerUtils.out.println("d2 i19 d3 = " + Double.doubleToLongBits(d2) + "," + i19 + "," +
                Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("i20 by2 i21 = " + i20 + "," + by2 + "," + i21);
        FuzzerUtils.out.println("i22 l2 i23 = " + i22 + "," + l2 + "," + i23);
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 dArr1 iArr2 = " + i27 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1))
                + "," + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test0129.instanceCount Test0129.iFld1 Test0129.bFld = " + Test0129.instanceCount + "," + Test0129.iFld1 +
                "," + (Test0129.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0129.fFld sFld Test0129.dFld = " + Float.floatToIntBits(Test0129.fFld) + "," + sFld + "," +
                Double.doubleToLongBits(Test0129.dFld));
        FuzzerUtils.out.println("Test0129.lArrFld = " + FuzzerUtils.checkSum(Test0129.lArrFld));

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