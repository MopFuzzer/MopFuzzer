// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:10 2023
public class Test0696 {

    public static final int N = 400;

    public static long instanceCount = 1669061494L;
    public static short sFld = -29815;
    public static byte byFld = -86;
    public static long lFld = 26011L;
    public static float fFld = 1.780F;
    public static long[][] lArrFld = new long[N][N];
    public static int[][] iArrFld = new int[N][N];
    public static volatile int[] iArrFld1 = new int[N];
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0696.lArrFld, -7L);
        FuzzerUtils.init(Test0696.iArrFld, 3);
        FuzzerUtils.init(Test0696.iArrFld1, -47025);
    }

    public double dFld = 0.114202;
    public int iFld = -45;

    public static void vMeth1(long l2) {

        int i8 = 5;
        int i9 = 63987;
        int i10 = 43510;
        int i11 = -109;
        int i12 = -52712;
        int i13 = -2;
        int[] iArr = new int[N];
        double d = 1.38284;
        byte by = 112;
        float f = 80.405F;
        boolean b = false;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, 6L);
        FuzzerUtils.init(iArr, -26208);

        for (i8 = 327; i8 > 2; i8 -= 3) {
            lArr[i8] >>= l2;
            i9 += (int) 52870L;
            Test0696.sFld -= (short) -4082537588992825735L;
            Test0696.sFld = (short) 224;
            iArr[i8] -= (int) Test0696.instanceCount;
            i9 += (i8 | i8);
            d *= by;
            for (i10 = 1; i10 < 14; i10++) {
                for (i12 = 2; i12 > 1; i12--) {
                    f *= i11;
                    by = by;
                    iArr[i10 - 1] = i13;
                    i13 += i12;
                    if (b) break;
                }
            }
        }
        vMeth1_check_sum += l2 + i8 + i9 + Double.doubleToLongBits(d) + by + i10 + i11 + i12 + i13 +
                Float.floatToIntBits(f) + (b ? 1 : 0) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i3, long l1, int i4) {

        int i5 = 48363;
        int i6 = -8;
        int i7 = 9673;
        int i14 = 60542;
        int i15 = 13;
        int i16 = -19958;
        int i17 = -34931;
        int[] iArr1 = new int[N];
        short s = -32351;
        short[] sArr = new short[N];
        byte[] byArr = new byte[N];

        FuzzerUtils.init(sArr, (short) 31172);
        FuzzerUtils.init(byArr, (byte) 112);
        FuzzerUtils.init(iArr1, -156);

        i3 ^= i4;
        for (i5 = 395; i5 > 1; --i5) {
            i3 += (((i5 * Test0696.instanceCount) + s) - i6);
            Test0696.instanceCount += (-6256168374914346839L + (++Test0696.instanceCount));
            i7 = 1;
            while (++i7 < 4) {
                l1 <<= (i4++);
            }
            vMeth1(Test0696.instanceCount);
            switch (((i5 % 3) * 5) + 79) {
                case 87:
                    switch ((i5 % 2) + 54) {
                        case 54:
                            for (i14 = 1; 4 > i14; i14++) {
                                i16 = 1;
                                do {
                                    i6 -= i17;
                                    sArr[i16] -= (short) -103.115818;
                                    i4 += (int) 7L;
                                    byArr[i14] += (byte) 3028719479L;
                                } while (++i16 < 2);
                            }
                            break;
                        case 55:
                            iArr1[i5 + 1] = i7;
                            break;
                    }
                case 93:
                    if (true) break;
                    break;
                case 91:
                    i15 = -32869;
                    break;
            }
        }
        vMeth_check_sum += i3 + l1 + i4 + i5 + i6 + s + i7 + i14 + i15 + i16 + i17 + FuzzerUtils.checkSum(sArr) +
                FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth(long l) {

        int i = -49, i1 = -17622, i2 = 12, i18 = -11, i19 = 52264;
        long l3 = -3565360435L;
        boolean b1 = false;
        double[] dArr = new double[N];

        FuzzerUtils.init(dArr, 32.57898);

        i = 146;
        while ((i -= 2) > 0) {
            for (i1 = 1; i1 < 21; i1++) {
                vMeth(i1, l, i);
                for (l3 = 1; l3 < 2; ++l3) {
                    if (b1) continue;
                    dArr[(int) (l3)] += l3;
                    Test0696.lArrFld[i][i1 - 1] += 6;
                    i18 -= (int) 1.119400;
                    i2 += (-181 + (l3 * l3));
                    i18 <<= -12;
                    Test0696.byFld += (byte) -9;
                    i19 -= i1;
                }
                i2 += (i1 * i1);
                Test0696.lFld >>= -6300843998461327517L;
            }
        }
        Test0696.iArrFld[(-59911 >>> 1) % N][(i19 >>> 1) % N] = Test0696.byFld;
        long meth_res = l + i + i1 + i2 + l3 + i18 + (b1 ? 1 : 0) + i19 +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0696 _instance = new Test0696();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        double[] dArr1 = new double[N];

        FuzzerUtils.init(dArr1, -10.124791);

        dFld = iMeth(Test0696.lFld);
        iFld = iFld;
        Test0696.fFld = iFld;
        if (false) {
            Test0696.iArrFld[(iFld >>> 1) % N][(-13454 >>> 1) % N] <<= (int) Test0696.lFld;
            iFld = iFld;
        }
        dArr1[(iFld >>> 1) % N] = Test0696.fFld;
        iFld >>>= iFld;
        dFld = iFld;
        iFld >>= Test0696.sFld;
        for (int i20 : Test0696.iArrFld1) {
            try {
                iFld = (Test0696.iArrFld[(i20 >>> 1) % N][(i20 >>> 1) % N] / i20);
                iFld = (iFld % 1451008051);
                i20 = (i20 / iFld);
            } catch (ArithmeticException a_e) {
            }
            i20 = iFld;
            Test0696.iArrFld1[(6 >>> 1) % N] = iFld;
            i20 = Test0696.sFld;
            Test0696.instanceCount -= iFld;
        }
        iFld = (int) -10266L;

        FuzzerUtils.out.println("dArr1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)));

        FuzzerUtils.out.println("Test0696.instanceCount dFld Test0696.sFld = " + Test0696.instanceCount + "," +
                Double.doubleToLongBits(dFld) + "," + Test0696.sFld);
        FuzzerUtils.out.println("Test0696.byFld Test0696.lFld iFld = " + Test0696.byFld + "," + Test0696.lFld + "," + iFld);
        FuzzerUtils.out.println("Test0696.fFld Test0696.lArrFld Test0696.iArrFld = " + Float.floatToIntBits(Test0696.fFld) + "," +
                FuzzerUtils.checkSum(Test0696.lArrFld) + "," + FuzzerUtils.checkSum(Test0696.iArrFld));
        FuzzerUtils.out.println("Test0696.iArrFld1 = " + FuzzerUtils.checkSum(Test0696.iArrFld1));

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
