// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:54 2023
public class Test0082 {

    public static final int N = 400;

    public static long instanceCount = -1L;
    public static short sFld = 25939;
    public static int iFld = 10;
    public static float fFld = 56.803F;
    public static double dFld = 114.57856;
    public static float[] fArrFld = new float[N];
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0082.fArrFld, -17.738F);
    }

    public volatile long[] lArrFld = new long[N];

    public static long lMeth() {

        int i7 = 95;
        int i8 = -236;
        int i9 = 10;
        int i10 = 6;
        int i11 = -8;
        int i12 = 0;
        int i13 = 50150;
        int[] iArr1 = new int[N];
        float f1 = 2.444F;
        double d3 = 1.100545;
        byte[] byArr = new byte[N];

        FuzzerUtils.init(iArr1, 54861);
        FuzzerUtils.init(byArr, (byte) 2);

        for (i7 = 7; 121 > i7; i7++) {
            if (i9 != 0) {
            }
            f1 = (float) d3;
            f1 += i7;
            Test0082.instanceCount >>= Test0082.instanceCount;
            iArr1[i7] = Test0082.sFld;
            Test0082.iFld += (((i7 * i9) + i9) - Test0082.sFld);
            i8 += Test0082.iFld;
        }
        byArr[(i7 >>> 1) % N] -= (byte) Test0082.iFld;
        i9 <<= (int) Test0082.instanceCount;
        for (i10 = 2; i10 < 199; ++i10) {
            for (i12 = 1; i12 < 8; ++i12) {
                iArr1[i12 + 1] = (int) Test0082.instanceCount;
                Test0082.iFld *= i12;
                Test0082.iFld = i7;
            }
        }
        long meth_res = i7 + i8 + i9 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d3) + i10 + i11 + i12 + i13 +
                FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(byArr);
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public static int iMeth() {

        byte by1 = 24;
        int i5 = 14, i6 = 46490, i14 = -5, i15 = 10, i16 = -14, i17 = 153, i18 = -9;
        double d2 = -2.10009, d4 = -66.21455;
        float f2 = 117.563F;

        Test0082.iFld += Test0082.iFld;
        Test0082.iFld = by1;
        for (i5 = 18; i5 < 308; ++i5) {
            i6 -= (int) ((long) ((d2 + Test0082.iFld) - by1) >>> ((8 * (0 * lMeth())) - i5));
        }
        for (i14 = 7; 133 > i14; i14++) {
            Test0082.instanceCount += Test0082.instanceCount;
            Test0082.iFld = i6;
            Test0082.iFld = -237;
            by1 *= (byte) i15;
            for (d4 = i14; d4 < 12; d4 += 2) {
                i6 += (int) (d4 - by1);
                for (i17 = 1; i17 < 1; ++i17) {
                    i6 += (i17 * i17);
                    i18 ^= i16;
                    f2 *= i15;
                }
            }
        }
        long meth_res = by1 + i5 + i6 + Double.doubleToLongBits(d2) + i14 + i15 + Double.doubleToLongBits(d4) + i16 +
                i17 + i18 + Float.floatToIntBits(f2);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth(long l, long l1) {

        double d = 78.36535;
        double[] dArr = new double[N];
        int i4 = 31942;
        int[] iArr2 = new int[N];
        long l2 = 2378236146397936051L;
        boolean[][] bArr = new boolean[N][N];

        FuzzerUtils.init(dArr, 75.107271);
        FuzzerUtils.init(iArr2, 142);
        FuzzerUtils.init(bArr, false);

        Test0082.instanceCount = (long) (++d);
        i4 = 1;
        do {
            boolean b = false;
            if (b) {
                switch ((((iMeth() >>> 1) % 2) * 5) + 24) {
                    case 26:
                        Test0082.fFld += Test0082.iFld;
                        d += i4;
                        bArr[i4][i4 - 1] = b;
                    case 31:
                        iArr2[i4] -= (int) l2;
                        Test0082.iFld += (int) 1.439F;
                        iArr2[i4 + 1] <<= i4;
                        switch ((i4 % 1) + 10) {
                            case 10:
                                Test0082.iFld = 48571;
                                if (Test0082.iFld != 0) {
                                    vMeth_check_sum += l + l1 + Double.doubleToLongBits(d) + i4 + l2 +
                                            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr2) +
                                            FuzzerUtils.checkSum(bArr);
                                    return;
                                }
                                l1 = Test0082.iFld;
                                break;
                        }
                        break;
                    default:
                        Test0082.iFld = (int) 4871303790755164385L;
                }
            }
        } while (++i4 < 326);
        vMeth_check_sum += l + l1 + Double.doubleToLongBits(d) + i4 + l2 +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr2) +
                FuzzerUtils.checkSum(bArr);
    }

    public static void main(String[] strArr) {

        try {
            Test0082 _instance = new Test0082();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = -14;
        int i1 = 101;
        int i2 = 3;
        int i3 = -14;
        int i20 = -39;
        int i21 = 4395;
        int[] iArr = new int[N];
        float f = -122.596F;
        byte by = 116;
        double d5 = -2.70443;
        double[] dArr1 = new double[N];

        FuzzerUtils.init(iArr, 2);
        FuzzerUtils.init(dArr1, -1.25098);

        for (i = 10; i < 282; i++) {
            f *= (--Test0082.fArrFld[i + 1]);
            i1 <<= iArr[i];
            Test0082.instanceCount += i;
            for (i2 = 1; i2 < 92; ++i2) {
                i3 = ((++i3) - i2);
                Test0082.sFld -= (short) i2;
                i1 >>>= (int) (Test0082.instanceCount * (~(by * i)));
                vMeth(Test0082.instanceCount, Test0082.instanceCount);
                i3 >>= i3;
                for (i20 = 1; 2 > i20; ++i20) {
                    i1 = i20;
                    Test0082.instanceCount -= (long) Test0082.fFld;
                    Test0082.iFld = 4822;
                    i3 /= (int) ((long) (d5) | 1);
                    d5 = d5;
                    lArrFld[i2] -= Test0082.instanceCount;
                    Test0082.fFld *= Test0082.iFld;
                    switch ((i2 % 3) + 1) {
                        case 1:
                            Test0082.iFld += i20;
                            break;
                        case 2:
                            i1 = i20;
                            Test0082.instanceCount = (long) d5;
                            break;
                        case 3:
                            i3 = (int) Test0082.instanceCount;
                            dArr1[i2 - 1] *= i;
                            break;
                    }
                    lArrFld[i20 - 1] = Test0082.iFld;
                }
                iArr = iArr;
                i3 += (((i2 * Test0082.instanceCount) + i) - i20);
                i21 <<= Test0082.sFld;
                Test0082.iFld += (((i2 * i3) + i) - Test0082.fFld);
            }
            i1 += (int) Test0082.dFld;
        }

        FuzzerUtils.out.println("i i1 f = " + i + "," + i1 + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("i2 i3 by = " + i2 + "," + i3 + "," + by);
        FuzzerUtils.out.println("i20 i21 d5 = " + i20 + "," + i21 + "," + Double.doubleToLongBits(d5));
        FuzzerUtils.out.println("iArr dArr1 = " + FuzzerUtils.checkSum(iArr) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)));

        FuzzerUtils.out.println("Test0082.instanceCount Test0082.sFld Test0082.iFld = " + Test0082.instanceCount + "," + Test0082.sFld +
                "," + Test0082.iFld);
        FuzzerUtils.out.println("Test0082.fFld Test0082.dFld Test0082.fArrFld = " + Float.floatToIntBits(Test0082.fFld) + "," +
                Double.doubleToLongBits(Test0082.dFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0082.fArrFld)));
        FuzzerUtils.out.println("lArrFld = " + FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
