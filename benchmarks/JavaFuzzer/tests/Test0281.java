// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:00 2023
public class Test0281 {

    public static final int N = 400;

    public static long instanceCount = 3357195599812015319L;
    public static int iFld = -6;
    public static float fFld = 0.692F;
    public static volatile int iFld1 = 46776;
    public static double dFld = 121.46481;
    public static boolean bFld = false;
    public static short sFld = -19758;
    public static int[] iArrFld = new int[N];
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0281.iArrFld, -58473);
    }

    public byte byFld = -64;

    public static float fMeth() {

        byte by = 42;
        int i3 = -8;
        int i5 = -117;
        int i6 = -176;
        int[] iArr1 = new int[N];
        boolean b = false;

        FuzzerUtils.init(iArr1, -47644);

        Test0281.iFld += by;
        Test0281.iFld -= 2;
        Test0281.iFld /= (int) 5L;
        i3 = 1;
        do {
            Test0281.instanceCount -= 202L;
            Test0281.iFld -= i3;
            if (Test0281.iFld != 0) {
            }
            Test0281.instanceCount -= -4156;
            Test0281.fFld = Test0281.instanceCount;
        } while (++i3 < 270);
        for (int i4 : iArr1) {
            Test0281.instanceCount -= 4272215773L;
            for (i5 = 1; 4 > i5; i5++) {
                Test0281.iFld1 = i6;
                i4 += (51 + (i5 * i5));
            }
            if (b) break;
        }
        long meth_res = by + i3 + i5 + i6 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr1);
        fMeth_check_sum += meth_res;
        return (float) meth_res;
    }

    public static void vMeth() {

        int i2 = 10, i7 = -26, i8 = 26991, i9 = 17990, i10 = 152;
        short s = -26195;
        boolean b1 = true;
        double[] dArr = new double[N];

        FuzzerUtils.init(dArr, -75.38689);

        i2 *= (int) (fMeth() - s);
        b1 = b1;
        Test0281.instanceCount = Test0281.iFld1;
        try {
            i7 = 1;
            do {
                i8 = 1;
                while (++i8 < 7) {
                    Test0281.iFld1 ^= (int) Test0281.instanceCount;
                    for (i9 = 1; i9 > 1; i9--) {
                        Test0281.fFld = i2;
                        if (i2 != 0) {
                            vMeth_check_sum += i2 + s + (b1 ? 1 : 0) + i7 + i8 + i9 + i10 +
                                    Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                            return;
                        }
                        Test0281.iFld = (int) Test0281.instanceCount;
                        Test0281.instanceCount += (-108 + (i9 * i9));
                    }
                    Test0281.dFld = i9;
                    Test0281.instanceCount *= i9;
                    i2 -= (int) Test0281.fFld;
                }
            } while (++i7 < 230);
        } catch (NullPointerException exc1) {
            Test0281.instanceCount -= (long) Test0281.dFld;
        } finally {
            dArr[(i8 >>> 1) % N] = i7;
        }
        vMeth_check_sum += i2 + s + (b1 ? 1 : 0) + i7 + i8 + i9 + i10 +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static int iMeth(double d, int i1, long l) {

        float f = 2.291F;
        int i11 = -6;
        int i12 = 0;
        int i13 = -7;
        int i14 = -1;
        int i15 = 178;
        int i16 = -4559;
        int i17 = 13007;
        int[] iArr = new int[N];
        int[] iArr2 = new int[N];
        double d1 = -89.50549;
        long[] lArr = new long[N];
        byte[] byArr = new byte[N];

        FuzzerUtils.init(iArr, 17429);
        FuzzerUtils.init(lArr, -42262L);
        FuzzerUtils.init(iArr2, 59837);
        FuzzerUtils.init(byArr, (byte) 37);

        iArr[(i1 >>> 1) % N] -= (int) (((--f) - Float.intBitsToFloat(i1)) * i1);
        vMeth();
        Test0281.iFld = Test0281.iFld1;
        for (i11 = 11; i11 < 282; ++i11) {
            d1 = 1;
            while (++d1 < 6) {
                if (Test0281.bFld) continue;
                iArr2 = iArr;
            }
            for (i13 = 1; i13 < 6; i13++) {
                i15 = Test0281.iFld;
                i14 += (i13 | (long) Test0281.fFld);
                Test0281.iFld1 = -173;
            }
            Test0281.iFld1 += (i11 * i11);
            for (i16 = i11; 6 > i16; ++i16) {
                i15 -= i14;
                byArr[i11] = (byte) Test0281.sFld;
            }
        }
        long meth_res = Double.doubleToLongBits(d) + i1 + l + Float.floatToIntBits(f) + i11 + i12 +
                Double.doubleToLongBits(d1) + i13 + i14 + i15 + i16 + i17 + FuzzerUtils.checkSum(iArr) +
                FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(byArr);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0281 _instance = new Test0281();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = -3, i19 = -8, i20 = -21, i21 = 61502, i22 = -18131, i23 = 3, i24 = 4, i25 = -51798, i26 = -147;

        i += (int) (iMeth(Test0281.dFld, Test0281.iFld1, Test0281.instanceCount) * Test0281.dFld);
        Test0281.dFld += Test0281.iFld;
        Test0281.instanceCount = i;
        Test0281.instanceCount += (long) Test0281.fFld;
        Test0281.instanceCount *= Test0281.iFld;
        for (int i18 : Test0281.iArrFld) {
            Test0281.iFld1 = 7;
            Test0281.iArrFld[(Test0281.iFld >>> 1) % N] |= Test0281.iFld1;
            byFld = (byte) Test0281.iFld1;
            Test0281.iArrFld = Test0281.iArrFld;
            Test0281.instanceCount += Test0281.iFld;
            Test0281.dFld = Test0281.dFld;
            byFld = (byte) i;
            i19 = 1;
            do {
                i18 ^= Test0281.iFld;
                i20 = 1;
                while (++i20 < 1) {
                    Test0281.iFld += (i20 - Test0281.iFld1);
                }
                Test0281.fFld += 14237;
                i18 = (int) 172L;
                i >>>= (int) Test0281.instanceCount;
                i += (((i19 * Test0281.instanceCount) + Test0281.fFld) - Test0281.fFld);
                Test0281.iFld -= byFld;
            } while (++i19 < 63);
            Test0281.iArrFld[(Test0281.iFld >>> 1) % N] = i19;
        }
        for (i21 = 9; i21 < 170; i21++) {
            Test0281.iArrFld[(i19 >>> 1) % N] = -60188;
            for (i23 = i21; i23 < 156; i23++) {
                for (i25 = 1; i25 > i23; i25 -= 2) {
                    Test0281.iFld = (int) Test0281.instanceCount;
                    i24 = i26;
                    Test0281.instanceCount += (i25 * i25);
                }
            }
        }

        FuzzerUtils.out.println("i i19 i20 = " + i + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);

        FuzzerUtils.out.println("Test0281.instanceCount Test0281.iFld Test0281.fFld = " + Test0281.instanceCount + "," + Test0281.iFld +
                "," + Float.floatToIntBits(Test0281.fFld));
        FuzzerUtils.out.println("Test0281.iFld1 Test0281.dFld Test0281.bFld = " + Test0281.iFld1 + "," +
                Double.doubleToLongBits(Test0281.dFld) + "," + (Test0281.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0281.sFld byFld Test0281.iArrFld = " + Test0281.sFld + "," + byFld + "," +
                FuzzerUtils.checkSum(Test0281.iArrFld));

        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  fMeth ->  fMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}