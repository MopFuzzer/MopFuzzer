// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:05 2023
public class Test0496 {

    public static final int N = 400;

    public static long instanceCount = -4212886113L;
    public static float fFld = 0.878F;
    public static int iFld = -217;
    public static double dFld = 125.36316;
    public static int[] iArrFld = new int[N];
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0496.iArrFld, 5);
    }

    public short[] sArrFld = new short[N];

    public static void vMeth1() {

        int i2 = 8, i3 = 3, i4 = -9, i5 = -7093, i6 = -4;
        double d = -1.39070;
        boolean b = false;
        byte by = 19;

        i2 *= (int) Test0496.instanceCount;
        d /= (i2 | 1);
        for (i3 = 22; i3 < 363; i3++) {
            for (i5 = 1; 5 > i5; ++i5) {
                if (i4 != 0) {
                    vMeth1_check_sum += i2 + Double.doubleToLongBits(d) + i3 + i4 + i5 + i6 + (b ? 1 : 0) + by;
                    return;
                }
                if (b) continue;
            }
            if (b) {
                if (b) {
                    i4 += i4;
                } else {
                    i4 = by;
                    i6 += i5;
                }
                vMeth1_check_sum += i2 + Double.doubleToLongBits(d) + i3 + i4 + i5 + i6 + (b ? 1 : 0) + by;
                return;
            } else {
                Test0496.fFld += (i3 + Test0496.instanceCount);
                Test0496.instanceCount -= i5;
            }
            Test0496.instanceCount = i2;
            Test0496.instanceCount += (i3 * i3);
        }
        vMeth1_check_sum += i2 + Double.doubleToLongBits(d) + i3 + i4 + i5 + i6 + (b ? 1 : 0) + by;
    }

    public static void vMeth() {

        int i7 = 44966, i8 = 13, i9 = -9316, i10 = -3864, i11 = -12, i12 = -27877;
        boolean b1 = true;
        double[] dArr = new double[N];
        long[] lArr = new long[N];

        FuzzerUtils.init(dArr, -1.49713);
        FuzzerUtils.init(lArr, 22969L);

        vMeth1();
        Test0496.iFld = Test0496.iFld;
        for (i7 = 5; i7 < 144; ++i7) {
            switch ((i7 % 3) + 30) {
                case 30:
                    for (i9 = 1; i9 < 11; i9++) {
                        dArr = dArr;
                        for (i11 = 1; i11 < 2; ++i11) {
                            Test0496.dFld += i8;
                            Test0496.instanceCount = i11;
                            Test0496.instanceCount >>= i11;
                            i10 -= (int) 2.228F;
                            Test0496.instanceCount <<= i12;
                            Test0496.dFld = i8;
                            i8 = i12;
                        }
                    }
                    Test0496.instanceCount = i7;
                    break;
                case 31:
                    if (b1) break;
                case 32:
                    lArr[i7] += Test0496.instanceCount;
                    break;
                default:
                    Test0496.iFld *= i8;
            }
        }
        vMeth_check_sum += i7 + i8 + i9 + i10 + i11 + i12 + (b1 ? 1 : 0) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth(int i1, short s) {

        long l = 1L;
        long[] lArr1 = new long[N];
        int i13 = 14;
        int i14 = 10;
        int i15 = 12;
        int i16 = 57125;
        int i17 = -38859;
        int i18 = -42596;
        int i19 = -60956;
        int i20 = 1149;
        int i21 = -43;
        int[] iArr = new int[N];

        FuzzerUtils.init(lArr1, 32461L);
        FuzzerUtils.init(iArr, -9553);

        vMeth();
        for (l = 11; l < 296; ++l) {
            for (i14 = 6; 1 < i14; i14--) {
                i15 = (int) l;
                lArr1[(int) (l - 1)] *= (long) Test0496.fFld;
            }
            Test0496.instanceCount >>= Test0496.instanceCount;
            iArr[(int) (l)] *= -9479;
            i16 += i16;
            iArr[(int) (l)] *= i13;
            i17 = Test0496.iFld;
        }
        for (i18 = 3; i18 < 192; i18++) {
            for (i20 = 1; i20 < 8; ++i20) {
                i19 &= (int) l;
                i21 <<= s;
                i1 += i20;
            }
        }
        long meth_res = i1 + s + l + i13 + i14 + i15 + i16 + i17 + i18 + i19 + i20 + i21 + FuzzerUtils.checkSum(lArr1)
                + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0496 _instance = new Test0496();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = 118, i22 = -168, i23 = 184, i24 = -61402, i25 = -237, i26 = 6, i27 = 34288;
        short s1 = 2413;
        float f = 1.40F;
        byte by1 = -3;
        boolean b2 = true;
        long[][] lArr2 = new long[N][N];

        FuzzerUtils.init(lArr2, 27857L);

        i = iMeth(i, s1);
        for (i22 = 244; i22 > 5; --i22) {
            i = (int) Test0496.instanceCount;
            Test0496.instanceCount = Test0496.iFld;
        }
        lArr2[(8419 >>> 1) % N][(i22 >>> 1) % N] += -116;
        Test0496.fFld *= Test0496.instanceCount;
        if (b2) {
            Test0496.instanceCount = 10;
            Test0496.iArrFld[(Test0496.iFld >>> 1) % N] = Test0496.iFld;
            for (i24 = 171; i24 > 9; i24 -= 2) {
                i25 += (int) Test0496.instanceCount;
                Test0496.iFld += i24;
                try {
                    i25 = (i24 / Test0496.iArrFld[i24]);
                    i23 = (Test0496.iArrFld[i24] % -99);
                    Test0496.iFld = (Test0496.iArrFld[i24] % -1966328696);
                } catch (ArithmeticException a_e) {
                }
                for (i26 = 19; 309 > i26; ++i26) {
                    lArr2[i26][i26 - 1] += s1;
                }
                Test0496.fFld = i25;
                f = 1;
                while (++f < 309) {
                    i += (int) ((long) f ^ Test0496.instanceCount);
                    sArrFld[i24] += (short) Test0496.instanceCount;
                    Test0496.dFld *= i22;
                    i27 -= Test0496.iFld;
                    by1 -= (byte) Test0496.dFld;
                    i23 -= (int) Test0496.dFld;
                    i27 *= s1;
                    Test0496.iFld += (int) f;
                    Test0496.instanceCount <<= Test0496.instanceCount;
                }
                i27 = (int) Test0496.instanceCount;
                Test0496.iFld = i27;
                Test0496.iFld = i27;
                i25 = i23;
            }
        } else {
            i23 &= i27;
        }

        FuzzerUtils.out.println("i s1 i22 = " + i + "," + s1 + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 i27 f = " + i26 + "," + i27 + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("by1 b2 lArr2 = " + by1 + "," + (b2 ? 1 : 0) + "," + FuzzerUtils.checkSum(lArr2));

        FuzzerUtils.out.println("Test0496.instanceCount Test0496.fFld Test0496.iFld = " + Test0496.instanceCount + "," +
                Float.floatToIntBits(Test0496.fFld) + "," + Test0496.iFld);
        FuzzerUtils.out.println("Test0496.dFld Test0496.iArrFld sArrFld = " + Double.doubleToLongBits(Test0496.dFld) + "," +
                FuzzerUtils.checkSum(Test0496.iArrFld) + "," + FuzzerUtils.checkSum(sArrFld));

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