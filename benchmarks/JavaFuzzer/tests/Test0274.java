// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:59 2023
public class Test0274 {

    public static final int N = 400;

    public static long instanceCount = 22047L;
    public static volatile double dFld = 18.8817;
    public static float fFld = 57.946F;
    public static volatile boolean[] bArrFld = new boolean[N];
    public static double[] dArrFld = new double[N];
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0274.bArrFld, true);
        FuzzerUtils.init(Test0274.dArrFld, -16.75354);
    }

    public short sFld = -26612;
    public boolean bFld = false;
    public int[][] iArrFld = new int[N][N];

    public static int iMeth1(int i8, int i9, int i10) {

        int i11 = -248, i12 = 14, i13 = -9;
        short s2 = 12650;
        short[] sArr = new short[N];
        boolean b = false;

        FuzzerUtils.init(sArr, (short) -30022);

        i11 = 1;
        do {
            switch (((i11 % 1) * 5) + 23) {
                case 28:
                    Test0274.fFld += i11;
                    switch ((i11 % 10) + 28) {
                        case 28:
                            Test0274.dFld -= s2;
                            i10 *= i9;
                            s2 += (short) i10;
                            Test0274.fFld = Test0274.instanceCount;
                            break;
                        case 29:
                            Test0274.fFld -= Test0274.instanceCount;
                            Test0274.instanceCount |= i8;
                            break;
                        case 30:
                            i8 += (((i11 * i11) + i9) - i10);
                            for (i12 = 1; i12 < 6; i12++) {
                                i10 *= i10;
                                Test0274.dFld += i11;
                                Test0274.instanceCount += i9;
                            }
                            break;
                        case 31:
                            s2 += (short) i11;
                        case 32:
                            Test0274.dArrFld = FuzzerUtils.double1array(N, (double) -1.6504);
                            break;
                        case 33:
                            i10 += (i11 ^ i11);
                            break;
                        case 34:
                            if (b) continue;
                            break;
                        case 35:
                            i10 = 15715;
                        case 36:
                            Test0274.dFld *= i13;
                            break;
                        case 37:
                            Test0274.instanceCount = i12;
                            break;
                    }
                default:
                    Test0274.instanceCount = i13;
            }
        } while (++i11 < 296);
        long meth_res = i8 + i9 + i10 + i11 + s2 + i12 + i13 + (b ? 1 : 0) + FuzzerUtils.checkSum(sArr);
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth(float f1, int i4) {

        int i5 = -61531;
        int i6 = -23;
        int i7 = -42104;
        int[] iArr = new int[N];
        int[] iArr1 = new int[N];
        short s1 = -11545;
        byte by1 = -10;
        double d1 = 0.5580;
        boolean b1 = false;

        FuzzerUtils.init(iArr, 47316);
        FuzzerUtils.init(iArr1, -254);

        i5 = 1;
        while (++i5 < 187) {
            i4 -= (i4--);
            i4 *= (iArr[i5 - 1] * ((-(i4 * s1)) * (by1 - i4)));
            if (Test0274.bArrFld[(i4 >>> 1) % N] = (iMeth1(i7, i7, 7) != 0L)) {
                i6 = 9;
                while ((i6 -= 2) > 0) {
                    i4 = (-(Math.max(i5, -13) * i6));
                }
                for (d1 = 1; d1 < 9; ++d1) {
                    i7 <<= (int) (i4 += (int) ((i6 - i4) + (i4 * Test0274.instanceCount)));
                    i7 *= -95;
                    Test0274.instanceCount += -179;
                    i4 = (int) (((++iArr1[i5 + 1]) >> (++i4)) + ((--f1) + iArr[(int) (d1)]));
                    i7 = (int) Test0274.instanceCount;
                }
            } else if (b1) {
                i7 = (int) (--Test0274.instanceCount);
            } else {
                Test0274.dFld += 51726;
                i4 += (int) 13L;
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f1) + i4 + i5 + s1 + by1 + i6 + Double.doubleToLongBits(d1) + i7 + (b1
                ? 1 : 0) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(iArr1);
    }

    public static void main(String[] strArr) {

        try {
            Test0274 _instance = new Test0274();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public int iMeth(double d, int i3, byte by) {

        long l = -492931635883774001L;
        int i14 = -9;
        int i15 = -80;
        int i16 = -38277;
        int i17 = 10031;
        int i18 = 4;
        int[] iArr2 = new int[N];
        boolean b2 = true;

        FuzzerUtils.init(iArr2, 192);

        l = 1;
        while (++l < 287) {
            vMeth(Test0274.fFld, i3);
            by -= (byte) Test0274.fFld;
            switch ((int) ((l % 2) + 120)) {
                case 120:
                    for (i14 = (int) (l); i14 < 6; ++i14) {
                        if (b2) continue;
                        for (i16 = 1; i16 < 1; i16 += 3) {
                            Test0274.instanceCount += (i16 - l);
                            iArr2[i14 - 1] = 111;
                            i17 += 15550;
                            switch ((((i16 >>> 1) % 2) * 5) + 86) {
                                case 95:
                                    i18 ^= i17;
                                    break;
                                case 91:
                                    if (b2) {
                                        if (b2) break;
                                    } else {
                                        Test0274.dArrFld[i14] += i17;
                                    }
                                    break;
                            }
                        }
                    }
                    break;
                case 121:
                    i15 += sFld;
                    break;
                default:
                    Test0274.dArrFld[(int) (l)] -= Test0274.fFld;
            }
        }
        long meth_res = Double.doubleToLongBits(d) + i3 + by + l + i14 + i15 + (b2 ? 1 : 0) + i16 + i17 + i18 +
                FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i = -213, i1 = 8, i2 = 18562;
        float f = 0.1009F;
        float[][] fArr = new float[N][N];
        short s = -13958;
        boolean b3 = true;
        byte by3 = 68;
        long l1 = 12L;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, -10314L);
        FuzzerUtils.init(fArr, -125.498F);

        i = 1;
        while (++i < 312) {
            for (i1 = 4; i1 < 81; i1++) {
                byte by2 = 74;
                i2 *= (int) (lArr[i] + (f += (++s)));
                switch ((i % 1) + 16) {
                    case 16:
                        Test0274.dFld -= (Math.min((int) (0.52F * i), i2++) * ((i1 * i) + iMeth(70.18729, 199, (byte) (61))));
                        if (bFld) {
                            i2 += i2;
                            by2 += (byte) i2;
                        }
                        break;
                    default:
                        i2 += (((i1 * Test0274.instanceCount) + Test0274.fFld) - Test0274.instanceCount);
                        Test0274.instanceCount <<= i2;
                }
                i2 *= i1;
            }
            lArr[i] *= 129;
            switch (((i >>> 1) % 8) + 58) {
                case 58:
                    bFld = b3;
                    i2 = by3;
                    l1 = 1;
                    while (++l1 < 81) {
                        i2 = (int) Test0274.fFld;
                    }
                    break;
                case 59:
                    if (b3) {
                        if (b3) {
                            i2 = (int) Test0274.instanceCount;
                            lArr[i + 1] -= i2;
                        }
                        i2 -= (int) Test0274.instanceCount;
                        sFld += (short) l1;
                    } else if (bFld) {
                        try {
                            i2 = (iArrFld[i - 1][i] % iArrFld[i + 1][i - 1]);
                            i2 = (92 % i1);
                            i2 = (93 % i);
                        } catch (ArithmeticException a_e) {
                        }
                        iArrFld[i][i] |= (int) -23575L;
                        Test0274.instanceCount += i2;
                        i2 <<= (int) Test0274.instanceCount;
                    } else if (bFld) {
                        i2 += (i - i);
                    }
                    i2 = i1;
                    break;
                case 60:
                    i2 += sFld;
                case 61:
                    i2 = i2;
                    break;
                case 62:
                    lArr[i] = (long) Test0274.fFld;
                    break;
                case 63:
                    i2 += (((i * i1) + i2) - i2);
                case 64:
                    fArr[i + 1][i + 1] = i2;
                    break;
                case 65:
                    i2 *= i;
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("f s b3 = " + Float.floatToIntBits(f) + "," + s + "," + (b3 ? 1 : 0));
        FuzzerUtils.out.println("by3 l1 lArr = " + by3 + "," + l1 + "," + FuzzerUtils.checkSum(lArr));
        FuzzerUtils.out.println("fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test0274.instanceCount Test0274.dFld Test0274.fFld = " + Test0274.instanceCount + "," +
                Double.doubleToLongBits(Test0274.dFld) + "," + Float.floatToIntBits(Test0274.fFld));
        FuzzerUtils.out.println("sFld bFld Test0274.bArrFld = " + sFld + "," + (bFld ? 1 : 0) + "," +
                FuzzerUtils.checkSum(Test0274.bArrFld));
        FuzzerUtils.out.println("Test0274.dArrFld iArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0274.dArrFld))
                + "," + FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
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
//DEBUG  iMeth1 ->  iMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
