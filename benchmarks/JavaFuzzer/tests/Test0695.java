// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:10 2023
public class Test0695 {

    public static final int N = 400;

    public static long instanceCount = -2058378012L;
    public static float fFld = 2.428F;
    public static double dFld = -97.69146;
    public static volatile int iFld = -189;
    public static byte byFld = 90;
    public static volatile float[] fArrFld = new float[N];
    public static long vSmallMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;
    public static long byMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0695.fArrFld, -102.591F);
    }

    public boolean bFld = false;
    public int iFld1 = 1;
    public int[] iArrFld = new int[N];

    public static void vSmallMeth(int i, long l, int i1) {

        long l1 = -7L;

        i &= (int) ((l1 - (-(i - Test0695.instanceCount))) << i);
        vSmallMeth_check_sum += i + l + i1 + l1;
    }

    public static int iMeth1(byte by1, int i8) {

        int i9 = -11;
        int i10 = 9;
        int i12 = 160;
        int i13 = 36006;
        int[] iArr = new int[N];
        short s1 = 7427;
        long[] lArr = new long[N];

        FuzzerUtils.init(iArr, 7);
        FuzzerUtils.init(lArr, 2648433039L);

        Test0695.dFld = Test0695.iFld;
        try {
            for (i9 = 4; i9 < 132; i9++) {
                Test0695.instanceCount = Test0695.instanceCount;
                Test0695.fArrFld[i9 - 1] += i8;
                i8 = i8;
            }
            for (int i11 : iArr) {
                lArr[(i8 >>> 1) % N] >>>= 3676954100L;
                i11 = i8;
                Test0695.dFld -= Test0695.fFld;
                i11 = (int) -1759754560L;
                for (i12 = 1; i12 < 4; ++i12) {
                    by1 = (byte) 103;
                    if (Test0695.iFld != 0) {
                    }
                    s1 += (short) Test0695.dFld;
                }
            }
        } catch (ArithmeticException exc1) {
            iArr[(-3 >>> 1) % N] *= (int) -155L;
        }
        long meth_res = by1 + i8 + i9 + i10 + i12 + i13 + s1 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public static int iMeth(int i6) {

        int i7 = 16400, i14 = -120, i15 = 5, i16 = 9, i17 = 5, i18 = 2, i19 = 113, i20 = 1;
        byte by2 = 75;
        boolean b1 = false;
        float f = -2.578F;
        long[] lArr1 = new long[N];

        FuzzerUtils.init(lArr1, 137L);

        i7 = 1;
        do {
            Test0695.iFld = iMeth1(by2, Test0695.iFld);
            Test0695.iFld >>= i6;
            for (i14 = 1; i14 < 13; ++i14) {
                for (i16 = 1; i16 < 2; i16 += 2) {
                    i15 += i18;
                    lArr1[i16] -= i19;
                }
                b1 = b1;
                if (b1) continue;
                i6 += (i14 + i7);
                i18 %= (int) 1.121F;
                for (f = 2; f > 1; f -= 3) {
                    i20 = i19;
                    i17 += (int) (((f * i7) + i15) - i18);
                }
                Test0695.fArrFld[i7 - 1] -= 4;
            }
        } while ((i7 += 2) < 251);
        long meth_res = i6 + i7 + by2 + i14 + i15 + i16 + i17 + i18 + i19 + (b1 ? 1 : 0) + Float.floatToIntBits(f) +
                i20 + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static byte byMeth() {

        int i21 = 16578;
        int i22 = 8;
        int i23 = 3;
        int i24 = 51;
        int i25 = 6;
        int i26 = 143;
        int[] iArr1 = new int[N];
        short s2 = -2910;
        boolean b2 = true;

        FuzzerUtils.init(iArr1, -11326);

        Test0695.iFld = iMeth(14);
        for (i21 = 145; i21 > 4; i21 -= 3) {
            i22 += (i21 * Test0695.fFld);
        }
        for (i23 = 22; i23 < 378; i23 += 2) {
            if (b2) {
                i22 = (int) Test0695.instanceCount;
                i25 = 9;
                do {
                    Test0695.instanceCount = -215L;
                    if (true) {
                        i26 = 1;
                        do {
                            s2 -= (short) i25;
                            i24 += i26;
                            iArr1[i26] <<= i23;
                            Test0695.instanceCount *= Test0695.instanceCount;
                            i24 <<= 21552;
                        } while (++i26 < 3);
                    }
                } while ((i25 -= 3) > 0);
            } else {
                i24 -= (int) Test0695.instanceCount;
            }
        }
        long meth_res = i21 + i22 + i23 + i24 + i25 + i26 + s2 + (b2 ? 1 : 0) + FuzzerUtils.checkSum(iArr1);
        byMeth_check_sum += meth_res;
        return (byte) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0695 _instance = new Test0695();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public short sMeth(long l2, long l3, byte by) {

        int i3 = -6, i4 = 7, i5 = 123;
        boolean b = true;
        short s = -32318;
        float[] fArr = new float[N];

        FuzzerUtils.init(fArr, 1.41F);

        vSmallMeth(i3, -(i3 + l2), iArrFld[(i3 >>> 1) % N]);
        for (i4 = 1; i4 < 129; ++i4) {
            if (!(b = ((i4 * i5) < l3))) break;
            i3 += (i4 * s);
            i5 = (int) (s + (fArr[i4] -= (1 * (Test0695.fFld--))));
        }
        long meth_res = l2 + l3 + by + i3 + i4 + i5 + (b ? 1 : 0) + s +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        sMeth_check_sum += meth_res;
        return (short) meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i2 = 35860, i27 = -89, i28 = -11, i29 = -19782, i30 = 53, i31 = -54682, i32 = -10, i33 = -11, i34 = -61601, i35 = 0;
        short s3 = 3495;
        double d = -1.68954;
        double[] dArr = new double[N];

        FuzzerUtils.init(dArr, 1.12496);

        for (int smallinvoc = 0; smallinvoc < 780; smallinvoc++)
            vSmallMeth((int) (((i2++) * (i2 - i2)) + ((i2 - i2) * (i2 +
                    Test0695.fFld))), Test0695.instanceCount++, (int) ((Test0695.instanceCount -= (long) Test0695.dFld) -
                    sMeth(Test0695.instanceCount++, 2091512942L, byMeth())));
        for (i27 = 20; i27 < 371; ++i27) {
            if (bFld) break;
            Test0695.instanceCount += (i27 * i27);
            i2 += (i27 + Test0695.byFld);
            Test0695.iFld += i27;
        }
        for (i29 = 5; 145 > i29; ++i29) {
            i28 = 1;
            iArrFld[i29] ^= (int) Test0695.instanceCount;
            for (i31 = 11; i31 < 179; i31++) {
                iArrFld[i29 - 1] = s3;
                Test0695.fFld += i31;
                Test0695.instanceCount -= 3113780520L;
                Test0695.iFld += (((i31 * s3) + Test0695.instanceCount) - i32);
                for (i33 = 1; i33 < 2; i33++) {
                    try {
                        i2 = (i31 % 129);
                        i2 = (-1245 / iArrFld[i33]);
                        iArrFld[i31 - 1] = (i28 % iArrFld[i33 + 1]);
                    } catch (ArithmeticException a_e) {
                    }
                    Test0695.iFld = Test0695.iFld;
                    iFld1 <<= i2;
                    i34 -= (int) 11299L;
                    i28 += (int) 12L;
                    bFld = bFld;
                }
                for (d = 2; d > 1; d -= 2) {
                    Test0695.iFld += (int) (d * d);
                    dArr = FuzzerUtils.double1array(N, (double) -70.109957);
                    Test0695.dFld = i27;
                    iFld1 <<= Test0695.iFld;
                    iArrFld[i29] += i35;
                    if (true) {
                        bFld = false;
                        iArrFld[i29] <<= 23;
                    } else if (true) {
                        iArrFld[i29] += (int) Test0695.instanceCount;
                    } else if (bFld) {
                        iFld1 = i2;
                    } else {
                        iArrFld[i29 + 1] += i35;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i2 i27 i28 = " + i2 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("i29 i30 i31 = " + i29 + "," + i30 + "," + i31);
        FuzzerUtils.out.println("i32 s3 i33 = " + i32 + "," + s3 + "," + i33);
        FuzzerUtils.out.println("i34 d i35 = " + i34 + "," + Double.doubleToLongBits(d) + "," + i35);
        FuzzerUtils.out.println("dArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test0695.instanceCount Test0695.fFld Test0695.dFld = " + Test0695.instanceCount + "," +
                Float.floatToIntBits(Test0695.fFld) + "," + Double.doubleToLongBits(Test0695.dFld));
        FuzzerUtils.out.println("Test0695.iFld bFld Test0695.byFld = " + Test0695.iFld + "," + (bFld ? 1 : 0) + "," + Test0695.byFld);
        FuzzerUtils.out.println("iFld1 iArrFld Test0695.fArrFld = " + iFld1 + "," + FuzzerUtils.checkSum(iArrFld) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0695.fArrFld)));

        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("byMeth_check_sum: " + byMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test sMeth
//DEBUG  sMeth ->  sMeth mainTest
//DEBUG  byMeth ->  byMeth mainTest
//DEBUG  iMeth ->  iMeth byMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth byMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
