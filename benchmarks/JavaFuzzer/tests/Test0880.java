// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:15 2023
public class Test0880 {

    public static final int N = 400;

    public static long instanceCount = 2072631669L;
    public static float fFld = 34.45F;
    public static boolean bFld = true;
    public static short sFld = -24392;
    public static int iFld1 = -149;
    public static double dFld = -1.77133;
    public static float[] fArrFld = new float[N];
    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long byMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0880.fArrFld, -1.701F);
    }

    public volatile int iFld = -14;

    public static byte byMeth(int i5, byte by) {

        int i6 = 134;
        int i7 = -3;
        int i8 = -8372;
        int i9 = -58379;
        int i10 = -121;
        int i11 = 2008;
        int i12 = 12;
        int i13 = -5545;
        int[] iArr = new int[N];
        double d = 2.66564;
        boolean b = false;
        long[] lArr = new long[N];

        FuzzerUtils.init(iArr, -2);
        FuzzerUtils.init(lArr, 41376L);

        Test0880.instanceCount -= i5;
        i5 += i5;
        for (i6 = 6; i6 < 208; i6++) {
            i7 = 0;
            for (i8 = 1; i8 < 8; ++i8) {
                i5 += (int) d;
            }
            if (false) {
                i5 += (((i6 * Test0880.fFld) + by) - i9);
                for (i10 = i6; i10 < 8; i10++) {
                    Test0880.instanceCount += i10;
                    i11 += -8;
                    b = b;
                }
            } else if (b) {
                for (i12 = i6; i12 < 8; ++i12) {
                    iArr[i6 + 1] |= i8;
                }
                lArr[i6 - 1] *= i11;
            } else {
                if (b) continue;
            }
        }
        long meth_res = i5 + by + i6 + i7 + i8 + i9 + Double.doubleToLongBits(d) + i10 + i11 + (b ? 1 : 0) + i12 + i13
                + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
        byMeth_check_sum += meth_res;
        return (byte) meth_res;
    }

    public static void vMeth(float f1) {

        int i1 = 12, i2 = -2, i3 = -178, i4 = 34223, i14 = 7, i15 = 192, i16 = 0, i17 = -58604, i18 = 8;
        byte by1 = -21;
        long[] lArr1 = new long[N];

        FuzzerUtils.init(lArr1, -27581L);

        for (i1 = 9; i1 < 171; i1++) {
            for (i3 = 1; 10 > i3; ++i3) {
                i2 = (int) (i2 + ((-(Test0880.instanceCount - i1)) * (Test0880.instanceCount + i4)));
                if (byMeth(i4, by1) != i3) break;
                if (Test0880.bFld) continue;
            }
            i14 = (int) Test0880.instanceCount;
            for (i15 = 1; i15 < 10; i15 += 2) {
                for (i17 = 1; i17 < 3; i17 += 2) {
                    Test0880.sFld -= (short) 1846205450915224076L;
                    Test0880.iFld1 <<= i2;
                    lArr1[i1 - 1] = 6;
                    if (Test0880.bFld) {
                        i14 = i14;
                    } else {
                        Test0880.instanceCount += i17;
                        i16 += Test0880.iFld1;
                    }
                }
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f1) + i1 + i2 + i3 + i4 + by1 + i14 + i15 + i16 + i17 + i18 +
                FuzzerUtils.checkSum(lArr1);
    }

    public static float fMeth() {

        int i = -220;
        int i19 = -59;
        int i20 = -34;
        int i21 = 105;
        int i22 = -205;
        int i23 = 44;
        int[][] iArr1 = new int[N][N];
        long l = 8571282584460180873L;

        FuzzerUtils.init(iArr1, 893);

        i = 1;
        while (++i < 227) {
            vMeth(Test0880.fFld);
            Test0880.fFld = Test0880.iFld1;
            for (i19 = 1; i19 < 7; i19++) {
                Test0880.fFld += (0.765F + (i19 * i19));
                for (l = 1; l < 2; l += 3) {
                    i20 += (int) l;
                    i20 += Test0880.iFld1;
                    Test0880.fFld += (l + i20);
                    i20 = i;
                }
                Test0880.bFld = Test0880.bFld;
                for (i22 = i; i22 < 2; i22++) {
                    if (i22 != 0) {
                    }
                    iArr1[i] = iArr1[i22 - 1];
                    i21 |= (int) l;
                }
            }
        }
        long meth_res = i + i19 + i20 + l + i21 + i22 + i23 + FuzzerUtils.checkSum(iArr1);
        fMeth_check_sum += meth_res;
        return (float) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0880 _instance = new Test0880();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        float f = -19.477F;
        int i24 = -21204;
        int i25 = -185;
        int i26 = 108;
        int i27 = -116;
        int[][] iArr2 = new int[N][N];
        short[] sArr = new short[N];
        long[][] lArr2 = new long[N][N];
        byte[] byArr = new byte[N];

        FuzzerUtils.init(sArr, (short) 19413);
        FuzzerUtils.init(iArr2, 18376);
        FuzzerUtils.init(lArr2, 4430024821581838531L);
        FuzzerUtils.init(byArr, (byte) 95);

        Test0880.instanceCount -= (long) Math.abs(Math.abs(--f));
        for (short s : sArr) {
            iFld += (int) (fMeth() + Test0880.dFld);
            iArr2[(iFld >>> 1) % N] = FuzzerUtils.int1array(N, (int) 13);
            switch (((iFld >>> 1) % 2) + 54) {
                case 54:
                    iFld += (int) Test0880.instanceCount;
                    iFld -= (int) Test0880.instanceCount;
                    for (i24 = 2; i24 < 63; i24++) {
                        iArr2[i24 + 1][i24 + 1] ^= i24;
                        lArr2 = lArr2;
                        i25 <<= 1;
                        if (Test0880.bFld) {
                            iFld += (((i24 * iFld) + Test0880.instanceCount) - Test0880.fFld);
                        } else if (Test0880.bFld) {
                            Test0880.iFld1 <<= i24;
                            iFld += -13625;
                        } else {
                            byArr[(i24 >>> 1) % N] *= (byte) iFld;
                            i25 -= -34495;
                            for (i26 = 1; i26 < 2; ++i26) {
                                if (false) continue;
                                f += Test0880.instanceCount;
                                f *= i27;
                                try {
                                    Test0880.iFld1 = (i26 % 216);
                                    Test0880.iFld1 = (-29372 % iArr2[i26][i26]);
                                    i27 = (i24 / i25);
                                } catch (ArithmeticException a_e) {
                                }
                                Test0880.iFld1 -= i24;
                                switch ((((-38199 >>> 1) % 9) * 5) + 71) {
                                    case 77:
                                        iFld = (int) 2875969242041626187L;
                                        Test0880.bFld = Test0880.bFld;
                                        i27 += (((i26 * Test0880.instanceCount) + i26) - i27);
                                    case 101:
                                        Test0880.instanceCount = Test0880.instanceCount;
                                        break;
                                    case 74:
                                        Test0880.instanceCount = Test0880.sFld;
                                        Test0880.fArrFld[i26] = i24;
                                        break;
                                    case 78:
                                        Test0880.instanceCount <<= Test0880.instanceCount;
                                        break;
                                    case 113:
                                        Test0880.bFld = Test0880.bFld;
                                        break;
                                    case 81:
                                        i25 = iFld;
                                        break;
                                    case 115:
                                        Test0880.iFld1 += (((i26 * Test0880.instanceCount) + Test0880.fFld) - Test0880.iFld1);
                                        break;
                                    case 98:
                                        Test0880.fFld += iFld;
                                    case 106:
                                        i27 >>>= iFld;
                                        break;
                                }
                            }
                        }
                    }
                    break;
                case 55:
                    iFld >>= (int) Test0880.instanceCount;
            }
        }

        FuzzerUtils.out.println("f i24 i25 = " + Float.floatToIntBits(f) + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 i27 sArr = " + i26 + "," + i27 + "," + FuzzerUtils.checkSum(sArr));
        FuzzerUtils.out.println("iArr2 lArr2 byArr = " + FuzzerUtils.checkSum(iArr2) + "," +
                FuzzerUtils.checkSum(lArr2) + "," + FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test0880.instanceCount iFld Test0880.fFld = " + Test0880.instanceCount + "," + iFld + "," +
                Float.floatToIntBits(Test0880.fFld));
        FuzzerUtils.out.println("Test0880.bFld Test0880.sFld Test0880.iFld1 = " + (Test0880.bFld ? 1 : 0) + "," + Test0880.sFld + "," +
                Test0880.iFld1);
        FuzzerUtils.out.println("Test0880.dFld Test0880.fArrFld = " + Double.doubleToLongBits(Test0880.dFld) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0880.fArrFld)));

        FuzzerUtils.out.println("byMeth_check_sum: " + byMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  byMeth ->  byMeth vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
