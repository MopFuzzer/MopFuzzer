// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:11 2023
public class Test0711 {

    public static final int N = 400;

    public static long instanceCount = 3675482313L;
    public static int iFld = 7;
    public static double dFld = 1.93096;
    public static float fFld = -1.148F;
    public static short sFld = -29779;
    public static long iMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public boolean bFld = true;
    public volatile int[][] iArrFld = new int[N][N];

    public static int iMeth1(int i6, float f2, long l4) {

        int i7 = -3, i8 = 199, i9 = -37, i10 = -52567;
        boolean b = false;
        short s = 3777;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, -894116316L);

        for (i7 = 11; i7 < 207; ++i7) {
            lArr[i7] = i6;
            i6 -= (int) 78.824F;
            i8 <<= Test0711.iFld;
            if (b) break;
        }
        for (i9 = 7; i9 < 168; ++i9) {
            l4 <<= Test0711.instanceCount;
            i8 *= Test0711.iFld;
        }
        Test0711.dFld += f2;
        try {
            i10 = 12249;
            i10 = i10;
            Test0711.iFld += (int) Test0711.dFld;
            i6 >>>= -53;
            Test0711.instanceCount -= s;
        } catch (NullPointerException exc1) {
            Test0711.dFld += i10;
        } finally {
            i10 *= i10;
        }
        long meth_res = i6 + Float.floatToIntBits(f2) + l4 + i7 + i8 + (b ? 1 : 0) + i9 + i10 + s +
                FuzzerUtils.checkSum(lArr);
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth(long l2, int i1) {

        int i2 = -179;
        int i3 = 1;
        int i4 = 1;
        int i5 = 0;
        int[] iArr = new int[N];
        long l3 = 13L;
        long[] lArr1 = new long[N];
        float f3 = -126.762F;
        double d1 = 2.30688;
        double[] dArr = new double[N];
        boolean b1 = true;

        FuzzerUtils.init(dArr, 32.88364);
        FuzzerUtils.init(iArr, 56494);
        FuzzerUtils.init(lArr1, -19152L);

        i1 = (int) -61963L;
        i2 = 1;
        while (++i2 < 243) {
            for (l3 = 1; l3 < 7; l3++) {
                for (i4 = 1; 2 > i4; i4++) {
                    Test0711.instanceCount += (((i4 * i1) + i4) - l2);
                    if (i1 != 0) {
                        vMeth_check_sum += l2 + i1 + i2 + l3 + i3 + i4 + i5 + Float.floatToIntBits(f3) +
                                Double.doubleToLongBits(d1) + (b1 ? 1 : 0) +
                                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr) +
                                FuzzerUtils.checkSum(lArr1);
                        return;
                    }
                    Test0711.instanceCount = (((i5 * 2351) - iMeth1(Test0711.iFld, f3, 6L)) + i4);
                    Test0711.instanceCount += i4;
                }
                dArr[(int) (l3 + 1)] = f3;
                iArr[i2 - 1] >>>= (int) 46L;
                switch (((i1 >>> 1) % 6) + 71) {
                    case 71:
                        Test0711.iFld += (4 + (l3 * l3));
                        iArr[(int) (l3 + 1)] += (int) Test0711.dFld;
                        break;
                    case 72:
                        d1 -= Test0711.dFld;
                        dArr[i2 + 1] -= f3;
                    case 73:
                        l2 += l3;
                        break;
                    case 74:
                        b1 = false;
                    case 75:
                        lArr1[(int) (l3 - 1)] = 44;
                        break;
                    case 76:
                        l2 = Test0711.instanceCount;
                        break;
                }
            }
        }
        vMeth_check_sum += l2 + i1 + i2 + l3 + i3 + i4 + i5 + Float.floatToIntBits(f3) + Double.doubleToLongBits(d1) +
                (b1 ? 1 : 0) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr) +
                FuzzerUtils.checkSum(lArr1);
    }

    public static float fMeth() {

        float f1 = 2.246F;
        int i11 = 21081;
        int i12 = 1723;
        int i14 = 11438;
        int i15 = 211;
        int[] iArr1 = new int[N];
        long[][] lArr2 = new long[N][N];

        FuzzerUtils.init(iArr1, -124);
        FuzzerUtils.init(lArr2, -4149708183L);

        Test0711.dFld += (f1--);
        vMeth(Test0711.instanceCount, -3221);
        Test0711.iFld = Test0711.iFld;
        switch (((Test0711.iFld >>> 1) % 1) + 122) {
            case 122:
                for (i11 = 14; i11 < 329; ++i11) {
                    iArr1[(-13 >>> 1) % N] *= 133;
                    Test0711.iFld >>= (int) Test0711.instanceCount;
                    Test0711.iFld = i11;
                }
                for (int i13 : iArr1) {
                    lArr2[(Test0711.iFld >>> 1) % N] = lArr2[(i13 >>> 1) % N];
                    i12 = i11;
                    i13 *= -8;
                }
            default:
                for (i14 = 14; i14 < 362; ++i14) {
                    iArr1[i14] |= (int) Test0711.instanceCount;
                    Test0711.iFld -= i11;
                }
        }
        long meth_res = Float.floatToIntBits(f1) + i11 + i12 + i14 + i15 + FuzzerUtils.checkSum(iArr1) +
                FuzzerUtils.checkSum(lArr2);
        fMeth_check_sum += meth_res;
        return (float) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0711 _instance = new Test0711();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public int iMeth(long l, long l1) {

        float f = 0.174F;

        Test0711.iFld = (int) (--f);
        Test0711.instanceCount -= (long) f;
        long meth_res = l + l1 + Float.floatToIntBits(f);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d = -2.127584;
        int i = -60934, i16 = 189, i17 = 0, i18 = 1, i19 = -26257, i20 = 59, i21 = 191, i23 = 42534;
        byte by = 61;
        long l5 = 29L;

        for (d = 16; 380 > d; ++d) {
            float f4 = 106.77F;
            iArrFld = (iArrFld = (iArrFld = (iArrFld = iArrFld)));
            i = (iMeth(Test0711.instanceCount = i, --Test0711.instanceCount) + -10);
            i += (-12 + (d * d));
            Test0711.iFld *= (int) (46282L * Integer.reverseBytes(-174));
            i = (int) (-fMeth());
            f4 = i;
        }
        Test0711.instanceCount += Test0711.iFld;
        i |= (int) Test0711.instanceCount;
        for (i16 = 4; i16 < 300; ++i16) {
            Test0711.fFld = i16;
            for (i18 = 5; i18 < 85; ++i18) {
                int i22 = 14;
                i -= i17;
                i += (int) Test0711.instanceCount;
                iArrFld = iArrFld;
                Test0711.fFld = by;
                for (i20 = 1; i20 < 2; ++i20) {
                    i21 ^= -251;
                    Test0711.dFld += i19;
                }
                i22 = (int) -32248L;
                if (bFld) {
                    for (l5 = 1; l5 < 2; ++l5) {
                        i23 += (int) l5;
                        Test0711.dFld = Test0711.iFld;
                        iArrFld[(int) (l5)][(int) (l5 + 1)] *= i17;
                        if (bFld) {
                            i19 = i23;
                            i23 = i17;
                        } else if (bFld) {
                            i17 += (int) (l5 * Test0711.iFld);
                            Test0711.sFld += (short) i19;
                        } else {
                            i22 -= i16;
                        }
                    }
                } else {
                    i19 += (int) Test0711.fFld;
                }
            }
        }

        FuzzerUtils.out.println("d i i16 = " + Double.doubleToLongBits(d) + "," + i + "," + i16);
        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("by i20 i21 = " + by + "," + i20 + "," + i21);
        FuzzerUtils.out.println("l5 i23 = " + l5 + "," + i23);

        FuzzerUtils.out.println("Test0711.instanceCount Test0711.iFld Test0711.dFld = " + Test0711.instanceCount + "," + Test0711.iFld +
                "," + Double.doubleToLongBits(Test0711.dFld));
        FuzzerUtils.out.println("Test0711.fFld Test0711.sFld bFld = " + Float.floatToIntBits(Test0711.fFld) + "," + Test0711.sFld + ","
                + (bFld ? 1 : 0));
        FuzzerUtils.out.println("iArrFld = " + FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}