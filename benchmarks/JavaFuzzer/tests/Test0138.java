// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:56 2023
public class Test0138 {

    public static final int N = 400;

    public static long instanceCount = -4969832209222765614L;
    public static boolean bFld = true;
    public static volatile short sFld = 7961;
    public static int[][] iArrFld = new int[N][N];
    public static double[] dArrFld = new double[N];
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0138.iArrFld, 39);
        FuzzerUtils.init(Test0138.dArrFld, -1.64559);
    }

    public float fFld = -57.843F;
    public boolean[] bArrFld = new boolean[N];

    public static int iMeth1(long l) {

        int i11 = -82, i12 = 55514, i13 = 2, i14 = -25188, i15 = 2087, i16 = 11, i17 = -5;
        float f = 28.284F;
        float[] fArr = new float[N];
        byte by = 16;

        FuzzerUtils.init(fArr, -49.678F);

        fArr[(i11 >>> 1) % N] += Test0138.instanceCount;
        Test0138.iArrFld[(-4182 >>> 1) % N][(i11 >>> 1) % N] = i11;
        Test0138.instanceCount *= i11;
        for (i12 = 19; i12 < 367; ++i12) {
            f = i12;
            i13 >>>= 7123;
            for (i14 = 1; i14 < 5; i14++) {
                Test0138.instanceCount += i14;
                i15 += i14;
                by %= (byte) (i13 | 1);
                l &= i12;
                i13 = i14;
                for (i16 = 1; i16 < 2; i16 += 2) {
                    boolean b = false;
                    if (b) break;
                    by = (byte) i14;
                }
            }
        }
        long meth_res = l + i11 + i12 + i13 + Float.floatToIntBits(f) + i14 + i15 + by + i16 + i17 +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public static int iMeth() {

        int i7 = 7, i8 = 10642, i9 = 5315, i10 = -13, i18 = 113;
        double d = -100.61935;
        short s = 6391;

        i7 = 1;
        do {
            switch ((((((int) (i7 + d)) >>> 1) % 1) * 5) + 108) {
                case 113:
                    i8 = 1;
                    do {
                        for (i9 = 1; i9 < 1; i9++) {
                            i10 *= iMeth1(Test0138.instanceCount);
                            i10 += (i9 | i8);
                            Test0138.iArrFld[i9 + 1][i7 + 1] -= (int) Test0138.instanceCount;
                            i10 -= (int) d;
                            Test0138.dArrFld = FuzzerUtils.double1array(N, (double) 0.53505);
                            i10 += i8;
                            if (Test0138.bFld) break;
                            i10 *= i8;
                            i18 -= i8;
                        }
                        Test0138.instanceCount = i10;
                        i18 ^= i18;
                    } while (++i8 < 9);
                    break;
                default:
                    s -= (short) 7886;
            }
        } while (++i7 < 179);
        long meth_res = i7 + Double.doubleToLongBits(d) + i8 + i9 + i10 + i18 + s;
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth(int i2, int i3, int i4) {

        int i5 = -103, i6 = 46, i19 = -242, i20 = 239;
        float f1 = 2.786F;
        double d1 = -84.6481;

        for (i5 = 2; i5 < 136; i5++) {
            Test0138.instanceCount *= iMeth();
            i4 = i5;
            Test0138.instanceCount += (((i5 * Test0138.instanceCount) + f1) - i6);
            if (Test0138.bFld) {
                d1 -= Test0138.instanceCount;
                Test0138.iArrFld[i5][i5 + 1] = i3;
            } else if (Test0138.bFld) {
                f1 += (i5 - Test0138.sFld);
                i4 = (int) Test0138.instanceCount;
            } else {
                for (i19 = i5; 12 > i19; i19++) {
                    i4 += (((i19 * i2) + i6) - i19);
                    Test0138.instanceCount = i4;
                    d1 += -8;
                }
                i3 = i2;
                i3 += (i5 * Test0138.instanceCount);
            }
        }
        vMeth_check_sum += i2 + i3 + i4 + i5 + i6 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d1) + i19 + i20;
    }

    public static void main(String[] strArr) {

        try {
            Test0138 _instance = new Test0138();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = -131, i1 = -90, i21 = 21267, i22 = 51947, i23 = 165, i24 = -7, i25 = -6907;
        double d2 = -72.118033;
        short[] sArr = new short[N];

        FuzzerUtils.init(sArr, (short) 32256);

        for (i = 180; i > 10; i -= 2) {
            vMeth(i, i, i);
            fFld += i1;
            i1 -= -10;
            for (i21 = 13; i21 < 295; ++i21) {
                fFld = Test0138.instanceCount;
                for (i23 = 1; i23 < 2; ++i23) {
                    fFld -= -9114;
                    Test0138.bFld = Test0138.bFld;
                    i24 = i1;
                    i1 -= (int) Test0138.instanceCount;
                    i1 += -5;
                    switch (((i21 % 5) * 5) + 75) {
                        case 93:
                            switch ((i23 % 3) + 90) {
                                case 90:
                                    d2 = i24;
                                    Test0138.iArrFld[i21 + 1][i - 1] *= -35425;
                                    if (Test0138.bFld) {
                                        if (true) {
                                            i1 -= -19;
                                            Test0138.instanceCount <<= Test0138.instanceCount;
                                        }
                                        if (Test0138.bFld) {
                                            Test0138.dArrFld[i21] *= i;
                                            sArr[i] = (short) i24;
                                            switch ((i23 % 10) + 84) {
                                                case 84:
                                                    i22 += (i23 * i23);
                                                    i22 <<= i1;
                                                    Test0138.sFld += (short) (i23 + i23);
                                                    break;
                                                case 85:
                                                    Test0138.instanceCount -= (long) fFld;
                                                    Test0138.instanceCount ^= i23;
                                                case 86:
                                                    Test0138.instanceCount += (i23 * i23);
                                                    break;
                                                case 87:
                                                    i22 &= (int) Test0138.instanceCount;
                                                    break;
                                                case 88:
                                                    i24 = 29;
                                                case 89:
                                                    i24 -= (int) Test0138.instanceCount;
                                                case 90:
                                                    Test0138.iArrFld[i23 - 1][i21 - 1] = (int) Test0138.instanceCount;
                                                    break;
                                                case 91:
                                                    i1 += i24;
                                                case 92:
                                                    bArrFld[i21 + 1] = Test0138.bFld;
                                                case 93:
                                                    i24 = i;
                                                    break;
                                            }
                                        } else {
                                            if (Test0138.bFld) break;
                                        }
                                    }
                                    break;
                                case 91:
                                    i24 = (int) Test0138.instanceCount;
                                    break;
                                case 92:
                                    Test0138.bFld = true;
                                    break;
                            }
                            break;
                        case 89:
                            i1 <<= i1;
                            break;
                        case 80:
                            Test0138.iArrFld[i] = Test0138.iArrFld[i23];
                            break;
                        case 91:
                            Test0138.instanceCount += (((i23 * i) + Test0138.instanceCount) - i25);
                            break;
                        case 96:
                            if (Test0138.bFld) continue;
                            break;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 i21 = " + i + "," + i1 + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("d2 i25 sArr = " + Double.doubleToLongBits(d2) + "," + i25 + "," +
                FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test0138.instanceCount Test0138.bFld Test0138.sFld = " + Test0138.instanceCount + "," + (Test0138.bFld ? 1
                : 0) + "," + Test0138.sFld);
        FuzzerUtils.out.println("fFld Test0138.iArrFld Test0138.dArrFld = " + Float.floatToIntBits(fFld) + "," +
                FuzzerUtils.checkSum(Test0138.iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0138.dArrFld)));
        FuzzerUtils.out.println("bArrFld = " + FuzzerUtils.checkSum(bArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
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
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
