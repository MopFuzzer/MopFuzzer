// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:58 2023
public class Test0220 {

    public static final int N = 400;

    public static long instanceCount = -985450310177830516L;
    public static short sFld = -8110;
    public static int iFld = 5;
    public static float fFld = 2.739F;
    public static byte byFld = 12;
    public static int iFld1 = 80;
    public static double[] dArrFld = new double[N];
    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0220.dArrFld, 0.3781);
    }

    public volatile boolean bFld = false;

    public static int iMeth1(int i6) {

        int i7 = -198;
        int i8 = 24930;
        int i9 = -13;
        int i10 = 55460;
        int i11 = -216;
        int i12 = 219;
        int i13 = 50289;
        int i14 = 199;
        int i15 = 73;
        int[] iArr1 = new int[N];
        double d1 = -1.112010;
        boolean b = true;
        boolean[][] bArr = new boolean[N][N];

        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(iArr1, 8);

        for (i7 = 13; 359 > i7; i7++) {
            Test0220.iFld += (i7 * i7);
            Test0220.iFld += i7;
            i8 = (int) 30429L;
        }
        for (i9 = 7; 124 > i9; i9++) {
            bArr[i9] = bArr[i9 - 1];
            i6 -= i8;
            Test0220.instanceCount = (long) Test0220.fFld;
            for (d1 = 1; d1 < 13; ++d1) {
                for (i12 = 1; i12 < 2; i12++) {
                    i8 += (int) Test0220.fFld;
                    iArr1[i12 - 1] = i13;
                }
                for (i14 = i9; i14 < 2; ++i14) {
                    Test0220.iFld += (int) -101.1532;
                    if (b) continue;
                }
            }
        }
        long meth_res = i6 + i7 + i8 + i9 + i10 + Double.doubleToLongBits(d1) + i11 + i12 + i13 + i14 + i15 + (b ? 1 :
                0) + FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public static long lMeth(int i5) {

        double d2 = 0.92376;
        int i16 = -20444;
        int i17 = -111;
        int i18 = -62843;
        int[][] iArr2 = new int[N][N];
        boolean b1 = true;
        long l = -3196L;

        FuzzerUtils.init(iArr2, -51);

        Test0220.instanceCount = (long) (iMeth1(Test0220.iFld) + d2);
        i16 = 1;
        while ((i16 += 2) < 321) {
            switch ((i16 % 6) + 37) {
                case 37:
                    if (b1) {
                        for (i17 = 1; i17 < 10; ++i17) {
                            i5 = i18;
                            Test0220.byFld = (byte) i18;
                            if (i5 != 0) {
                            }
                            i18 += (i17 * i17);
                            try {
                                Test0220.iFld = (i5 / i18);
                                iArr2[i16 - 1][i17 + 1] = (i17 / i18);
                                Test0220.iFld = (i17 % -150);
                            } catch (ArithmeticException a_e) {
                            }
                            i5 = Test0220.sFld;
                            if (b1) continue;
                            iArr2[i17 + 1][i16 + 1] -= (int) l;
                            i5 <<= -12;
                            i5 <<= i18;
                        }
                    } else if (b1) {
                        Test0220.fFld += i16;
                    }
                    break;
                case 38:
                case 39:
                    i5 *= (int) d2;
                case 40:
                    iArr2[i16][i16] -= (int) l;
                    break;
                case 41:
                    Test0220.fFld -= (float) d2;
                case 42:
                    d2 += i18;
                    break;
                default:
                    Test0220.iFld += (235 + (i16 * i16));
            }
        }
        long meth_res = i5 + Double.doubleToLongBits(d2) + i16 + i17 + i18 + (b1 ? 1 : 0) + l +
                FuzzerUtils.checkSum(iArr2);
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public static int iMeth(int i) {

        int i1 = -11;
        int i2 = 20;
        int i3 = 12;
        int i4 = 61;
        int[] iArr = new int[N];
        double d = 1.5738;
        float f = 62.843F;
        long[] lArr = new long[N];

        FuzzerUtils.init(iArr, 6130);
        FuzzerUtils.init(lArr, -60L);

        for (i1 = 14; i1 < 258; i1++) {
            i |= (int) -30433L;
            i = (int) (iArr[i1 + 1] += (int) (iArr[i1 + 1] + (--Test0220.dArrFld[i1 + 1])));
            for (i3 = 1; i3 < 7; i3++) {
                i &= (int) Test0220.instanceCount;
                d += (lArr[i1 + 1]++);
                f = (i2--);
                i = (int) ((Test0220.sFld + (++i2)) - (i2 -= (int) f));
                i2 = i2;
                Test0220.iFld += (((i3 * Test0220.iFld) + Test0220.iFld) - Test0220.instanceCount);
                i <<= iArr[i3 - 1];
                iArr[i3 - 1] = (int) (Test0220.instanceCount--);
                Test0220.instanceCount = (iArr[i3] = (Test0220.sFld++));
                i >>= ((--i4) | iArr[i1 + 1]);
            }
            i = (int) lMeth(i2);
        }
        long meth_res = i + i1 + i2 + i3 + i4 + Double.doubleToLongBits(d) + Float.floatToIntBits(f) +
                FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0220 _instance = new Test0220();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        double d3 = -2.43344, d4 = 39.106519, d5 = -123.130147;
        int i19 = 4849;
        int i20 = -28191;
        int i21 = 10422;
        int i22 = 15;
        int i23 = -12;
        int i24 = 77;
        int[] iArr3 = new int[N];

        FuzzerUtils.init(iArr3, -9808);

        iMeth(Test0220.iFld);
        Test0220.iFld = (int) Test0220.instanceCount;
        d3 = 1;
        while (++d3 < 384) {
            Test0220.fFld -= -2.757F;
            switch ((int) (((d3 % 1) * 5) + 120)) {
                case 124:
                    iArr3 = iArr3;
                    d4 -= Test0220.iFld;
                    break;
            }
            Test0220.iFld += Test0220.iFld;
            for (i19 = 2; i19 < 66; i19++) {
                d4 *= Test0220.fFld;
                for (i21 = (int) (d3); i21 < 2; i21++) {
                    i22 = i20;
                    Test0220.instanceCount <<= Test0220.iFld;
                }
                Test0220.fFld = Test0220.fFld;
                for (i23 = (int) (d3); 2 > i23; i23++) {
                    i20 -= (int) Test0220.fFld;
                    i22 = Test0220.iFld1;
                    Test0220.iFld = i21;
                    iArr3[i19] += (int) 2.79765;
                }
                Test0220.iFld1 = Test0220.iFld1;
                i22 <<= i21;
                d5 = 1;
                do {
                    Test0220.instanceCount = i20;
                    i20 = (int) Test0220.instanceCount;
                    i24 = -58368;
                    Test0220.iFld += i22;
                    Test0220.sFld *= (short) Test0220.iFld;
                } while (++d5 < 2);
            }
            if (bFld) {
                i24 += i21;
                Test0220.sFld >>= (short) i21;
            } else {
                Test0220.instanceCount -= i19;
            }
        }

        FuzzerUtils.out.println("d3 d4 i19 = " + Double.doubleToLongBits(d3) + "," + Double.doubleToLongBits(d4) + ","
                + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 d5 = " + i23 + "," + i24 + "," + Double.doubleToLongBits(d5));
        FuzzerUtils.out.println("iArr3 = " + FuzzerUtils.checkSum(iArr3));

        FuzzerUtils.out.println("Test0220.instanceCount Test0220.sFld Test0220.iFld = " + Test0220.instanceCount + "," + Test0220.sFld +
                "," + Test0220.iFld);
        FuzzerUtils.out.println("Test0220.fFld Test0220.byFld Test0220.iFld1 = " + Float.floatToIntBits(Test0220.fFld) + "," +
                Test0220.byFld + "," + Test0220.iFld1);
        FuzzerUtils.out.println("bFld Test0220.dArrFld = " + (bFld ? 1 : 0) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0220.dArrFld)));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  lMeth ->  lMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 lMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
