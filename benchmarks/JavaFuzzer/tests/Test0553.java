// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:07 2023
public class Test0553 {

    public static final int N = 400;

    public static long instanceCount = 3830620274878776520L;
    public static byte byFld = 13;
    public static int iFld = 42505;
    public static double dFld = -33.108726;
    public static float fFld = -14.225F;
    public static boolean bFld = false;
    public static int[] iArrFld = new int[N];
    public static long vMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0553.iArrFld, -48723);
    }

    public static void vMeth1(long l, int i6) {

        int i7 = 2, i8 = -115, i9 = 146, i10 = 0, i11 = 58430, i12 = 57542, i13 = 142;
        boolean b = true;
        boolean[] bArr = new boolean[N];
        short s = -8709;
        long l1 = 1668417587L;
        float[][] fArr1 = new float[N][N];

        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(fArr1, -1.196F);

        i7 = 1;
        do {
            for (i8 = 1; i8 < 10; ++i8) {
                bArr[i7 - 1] = b;
                i6 = i7;
                s = (short) Test0553.instanceCount;
                for (i10 = 1; i10 < 2; i10++) {
                    fArr1[i8][(i6 >>> 1) % N] += i6;
                }
            }
            i11 += i7;
            switch ((i7 % 4) * 5) {
                case 11:
                    i6 = i9;
                    for (i12 = 1; i12 < 10; ++i12) {
                        i6 += (int) l1;
                        l1 = Test0553.instanceCount;
                        l1 >>>= i8;
                        Test0553.byFld /= (byte) (i12 | 1);
                    }
                    break;
                case 20:
                    i6 >>>= i8;
                case 5:
                    try {
                        i6 = (i9 % 255);
                        i6 = (i6 / -44566);
                        i11 = (Test0553.iArrFld[i7 - 1] % Test0553.iArrFld[i7 - 1]);
                    } catch (ArithmeticException a_e) {
                    }
                    break;
                case 1:
                    l ^= Test0553.instanceCount;
            }
        } while ((i7 += 2) < 331);
        vMeth1_check_sum += l + i6 + i7 + i8 + i9 + (b ? 1 : 0) + s + i10 + i11 + i12 + i13 + l1 +
                FuzzerUtils.checkSum(bArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public static double dMeth(double d1, int i5, float f1) {

        int i15 = 214, i16 = 3, i17 = 59507, i18 = -1;
        long[][] lArr1 = new long[N][N];

        FuzzerUtils.init(lArr1, -5247245649688534709L);

        vMeth1(Test0553.instanceCount, -30969);
        i5 = (int) Test0553.instanceCount;
        Test0553.iArrFld[(i5 >>> 1) % N] -= i5;
        for (int i14 : Test0553.iArrFld) {
            f1 *= -116.759F;
        }
        i5 = (int) Test0553.instanceCount;
        lArr1[(i5 >>> 1) % N] = FuzzerUtils.long1array(N, (long) 41L);
        for (i15 = 12; i15 < 202; i15 += 2) {
            d1 *= d1;
            i5 += (((i15 * f1) + Test0553.instanceCount) - i5);
            for (i17 = 16; i17 > i15; --i17) {
                short s1 = -16378;
                Test0553.instanceCount += i17;
                Test0553.instanceCount = (long) 1.749F;
                Test0553.iFld >>= Test0553.byFld;
                i5 = s1;
            }
        }
        long meth_res = Double.doubleToLongBits(d1) + i5 + Float.floatToIntBits(f1) + i15 + i16 + i17 + i18 +
                FuzzerUtils.checkSum(lArr1);
        dMeth_check_sum += meth_res;
        return (double) meth_res;
    }

    public static void vMeth(double d) {

        int i = -196;
        int i1 = 16713;
        int i3 = 66;
        int i4 = 109;
        int[][] iArr = new int[N][N];
        int[] iArr1 = new int[N];
        float f = 114.209F;
        float[] fArr = new float[N];
        short s2 = 27009;
        long[] lArr = new long[N];
        double[] dArr = new double[N];

        FuzzerUtils.init(fArr, -2.885F);
        FuzzerUtils.init(iArr, 22288);
        FuzzerUtils.init(iArr1, -19723);
        FuzzerUtils.init(lArr, 2791771048L);
        FuzzerUtils.init(dArr, -59.28781);

        i = 213;
        while (--i > 0) {
            fArr[i] -= (i1 &= (int) ((--f) + iArr[i][i + 1]));
        }
        if (true) {
            for (int i2 : iArr1) {
                i2 -= Math.max(i2++, (int) ((i2 - d) + (-d)));
                for (i3 = 1; i3 < 4; i3++) {
                    lArr[i3] *= (long) dMeth(d, 11443, f);
                    if (false) {
                        switch (((i3 % 6) * 5) + 29) {
                            case 57:
                                i1 += i3;
                                break;
                            case 31:
                                iArr[i3 - 1][i3 + 1] += i1;
                                i4 = s2;
                                break;
                            case 34:
                                i4 += i4;
                                Test0553.instanceCount = Test0553.iFld;
                                iArr[i3][i3 - 1] += -3;
                                break;
                            case 49:
                                i2 += i3;
                            case 48:
                                f += (i3 * i3);
                            case 43:
                                iArr[i3][i3 - 1] = s2;
                                break;
                            default:
                                dArr[i3 + 1] = 74;
                        }
                    }
                }
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + i + i1 + Float.floatToIntBits(f) + i3 + i4 + s2 +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr) +
                FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void main(String[] strArr) {

        try {
            Test0553 _instance = new Test0553();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i19 = 55621, i20 = -45, i21 = 5, i22 = -9057, i23 = -137, i24 = 13, i25 = -53832, i26 = -42450;
        float f2 = -1.2F;
        short s3 = -6080;
        long[] lArr2 = new long[N];
        double[] dArr1 = new double[N];

        FuzzerUtils.init(lArr2, -6877956082599440598L);
        FuzzerUtils.init(dArr1, 117.114670);

        Test0553.byFld = (byte) 13;
        vMeth(Test0553.dFld);
        for (i19 = 7; i19 < 171; ++i19) {
            for (i21 = 5; i21 < 153; ++i21) {
                Test0553.fFld = Test0553.instanceCount;
                if (Test0553.bFld) break;
                Test0553.iFld = i21;
                Test0553.iFld += i21;
            }
            i20 ^= i22;
            Test0553.iFld >>= i22;
            Test0553.iFld = i22;
            i22 = -10;
            i23 = 1;
            while (++i23 < 153) {
                for (f2 = i19; f2 < 1; ++f2) {
                    Test0553.instanceCount += (long) f2;
                    Test0553.instanceCount = i23;
                    Test0553.iFld *= Test0553.byFld;
                }
                switch (((i21 >>> 1) % 10) + 62) {
                    case 62:
                        if (false) break;
                        i22 = i22;
                        break;
                    case 63:
                        for (i25 = 1; i25 < 1; i25++) {
                            Test0553.dFld += i24;
                            lArr2[i19 - 1] |= i22;
                            try {
                                i20 = (i22 % i22);
                                i22 = (17 / i20);
                                i20 = (Test0553.iArrFld[i19] % Test0553.iFld);
                            } catch (ArithmeticException a_e) {
                            }
                            i22 &= i24;
                            lArr2[i25 + 1] += Test0553.instanceCount;
                            dArr1[i19 + 1] += Test0553.fFld;
                            if (Test0553.bFld) {
                                i22 += (int) (0.622F + (i25 * i25));
                            }
                        }
                        Test0553.iFld = i19;
                        break;
                    case 64:
                    case 65:
                        Test0553.iFld += (-31 + (i23 * i23));
                        break;
                    case 66:
                        i22 = i22;
                        break;
                    case 67:
                        i20 += (int) Test0553.instanceCount;
                        break;
                    case 68:
                        Test0553.fFld *= s3;
                        break;
                    case 69:
                        try {
                            i20 = (Test0553.iArrFld[i19 - 1] % -20514);
                            i22 = (-58496 % i19);
                            Test0553.iArrFld[i23] = (0 / i21);
                        } catch (ArithmeticException a_e) {
                        }
                        break;
                    case 70:
                        i22 = i21;
                    case 71:
                        i20 = i24;
                        break;
                }
            }
        }

        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 f2 = " + i22 + "," + i23 + "," + Float.floatToIntBits(f2));
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("s3 lArr2 dArr1 = " + s3 + "," + FuzzerUtils.checkSum(lArr2) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)));

        FuzzerUtils.out.println("Test0553.instanceCount Test0553.byFld Test0553.iFld = " + Test0553.instanceCount + "," + Test0553.byFld +
                "," + Test0553.iFld);
        FuzzerUtils.out.println("Test0553.dFld Test0553.fFld Test0553.bFld = " + Double.doubleToLongBits(Test0553.dFld) + "," +
                Float.floatToIntBits(Test0553.fFld) + "," + (Test0553.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0553.iArrFld = " + FuzzerUtils.checkSum(Test0553.iArrFld));

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
