// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:12 2023
public class Test0765 {

    public static final int N = 400;

    public static long instanceCount = -8299949007637329263L;
    public static byte byFld = 3;
    public static boolean bFld = false;
    public static int iFld = 220;
    public static float fFld = -104.272F;
    public static long[] lArrFld = new long[N];
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0765.lArrFld, -249L);
    }

    public int[] iArrFld = new int[N];

    public static void vMeth1() {

        int i2 = 163, i3 = -9, i4 = 13, i5 = -9, i6 = -118, i7 = -39778, i8 = 16213;

        for (i2 = 7; i2 < 221; i2++) {
            i3 += (((i2 * Test0765.instanceCount) + i3) - i2);
            i3 += i3;
            i4 = 1;
            do {
                float f2 = -59.830F;
                f2 += (i4 * i4);
                Test0765.lArrFld[i2 + 1] *= 196;
                i3 += (-14 + (i4 * i4));
            } while (++i4 < 8);
            i3 += i2;
            Test0765.byFld *= (byte) i4;
            for (i5 = 1; i5 < 8; i5++) {
                i6 *= (int) Test0765.instanceCount;
                for (i7 = 2; i7 > 1; --i7) {
                    i6 += (i7 * i7);
                    i3 -= i3;
                    i3 += (int) -21.458F;
                }
            }
        }
        vMeth1_check_sum += i2 + i3 + i4 + i5 + i6 + i7 + i8;
    }

    public static void vMeth(float f1, int i, int i1) {

        int i9 = 14;
        int i10 = -17038;
        int[][] iArr = new int[N][N];

        FuzzerUtils.init(iArr, 1);

        vMeth1();
        for (i9 = 12; i9 < 299; i9++) {
            try {
                i = (i1 % -54663);
                i = (46450 % iArr[i9 + 1][i9 - 1]);
                i1 = (-128 / i9);
            } catch (ArithmeticException a_e) {
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f1) + i + i1 + i9 + i10 + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(float f) {

        int i11 = -40405;
        int i13 = 43;
        int i14 = -7;
        int i15 = -36446;
        int i16 = -38;
        int i17 = -6;
        int i18 = -12;
        int[] iArr1 = new int[N];
        short s = -8650;

        FuzzerUtils.init(iArr1, 8);

        vMeth(f, i11, i11);
        for (int i12 : iArr1) {
            for (i13 = 4; i13 > 1; i13--) {
                Test0765.instanceCount *= i14;
            }
            for (i15 = 1; 4 > i15; i15++) {
                for (i17 = 1; i17 < 2; i17++) {
                    Test0765.instanceCount += (179 + (i17 * i17));
                    Test0765.instanceCount += (i17 + Test0765.instanceCount);
                    if (Test0765.bFld) break;
                    Test0765.instanceCount -= i16;
                    i18 >>= i17;
                    i12 = s;
                }
            }
            i14 *= i15;
            i11 -= i11;
        }
        i14 = -12;
        long meth_res = Float.floatToIntBits(f) + i11 + i13 + i14 + i15 + i16 + i17 + i18 + s +
                FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0765 _instance = new Test0765();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i19 = -122, i20 = -47910, i21 = -44597, i22 = -30222, i23 = -2, i24 = -140, i25 = -27757, i26 = 81, i27 = 39;
        short s1 = -19095;
        long l = -7695662153322661678L;

        Test0765.instanceCount = iMeth(96.72F);
        iArrFld = iArrFld;
        Test0765.iFld ^= Test0765.iFld;
        for (i19 = 10; 206 > i19; ++i19) {
            i21 = 1;
            while ((i21 += 3) < 128) {
                Test0765.instanceCount += i21;
                Test0765.instanceCount = Test0765.iFld;
                Test0765.iFld = Test0765.byFld;
                for (i22 = 1; 4 > i22; ++i22) {
                    Test0765.instanceCount *= i19;
                    Test0765.instanceCount += (((i22 * i23) + i22) - Test0765.instanceCount);
                    Test0765.instanceCount += Test0765.iFld;
                    i23 = 2323;
                    i20 = i21;
                }
                Test0765.instanceCount -= i22;
                s1 = (short) Test0765.iFld;
                Test0765.instanceCount += (i21 * i23);
                for (l = 1; l < 4; ++l) {
                    i20 *= -9;
                }
                for (i25 = i19; 4 > i25; i25++) {
                    Test0765.iFld += (int) l;
                    i26 = (int) 5L;
                    Test0765.fFld += (i25 * i25);
                    Test0765.instanceCount >>= i25;
                    switch (((i25 % 2) * 5) + 25) {
                        case 27:
                            Test0765.bFld = Test0765.bFld;
                            if (Test0765.bFld) {
                                i20 += (i25 * i25);
                            } else if (Test0765.bFld) {
                                i24 -= Test0765.byFld;
                                try {
                                    i26 = (-865419549 % i22);
                                    Test0765.iFld = (i27 / i24);
                                    i24 = (12155 / Test0765.iFld);
                                } catch (ArithmeticException a_e) {
                                }
                            } else {
                                Test0765.instanceCount = -1;
                            }
                            break;
                        case 32:
                            i23 = i22;
                        default:
                            if (Test0765.bFld) break;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 s1 = " + i22 + "," + i23 + "," + s1);
        FuzzerUtils.out.println("l i24 i25 = " + l + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 i27 = " + i26 + "," + i27);

        FuzzerUtils.out.println("Test0765.instanceCount Test0765.byFld Test0765.bFld = " + Test0765.instanceCount + "," + Test0765.byFld +
                "," + (Test0765.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0765.iFld Test0765.fFld Test0765.lArrFld = " + Test0765.iFld + "," +
                Float.floatToIntBits(Test0765.fFld) + "," + FuzzerUtils.checkSum(Test0765.lArrFld));
        FuzzerUtils.out.println("iArrFld = " + FuzzerUtils.checkSum(iArrFld));

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
