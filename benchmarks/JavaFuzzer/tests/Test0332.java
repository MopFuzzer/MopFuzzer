// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:01 2023
public class Test0332 {

    public static final int N = 400;

    public static long instanceCount = -2794952345L;
    public static int iFld = -162;
    public static float fFld = -90.123F;
    public static int[][] iArrFld = new int[N][N];
    public static double[][] dArrFld = new double[N][N];
    public static volatile long[] lArrFld = new long[N];
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0332.iArrFld, 173);
        FuzzerUtils.init(Test0332.dArrFld, 0.15785);
        FuzzerUtils.init(Test0332.lArrFld, 3354239458L);
    }

    public boolean bFld = true;
    public double dFld = 109.55602;
    public float fFld1 = -68.637F;

    public static int iMeth1() {

        int i5 = 14;
        int i6 = 14;
        int i7 = -13;
        int i8 = 24168;
        int i9 = 25517;
        int[][] iArr1 = new int[N][N];
        boolean b = true;
        float[] fArr = new float[N];

        FuzzerUtils.init(fArr, -1.429F);
        FuzzerUtils.init(iArr1, -167);

        for (i5 = 19; i5 < 307; i5++) {
            Test0332.iArrFld[i5][i5] = i5;
            switch ((((Test0332.iFld >>> 1) % 2) * 5) + 65) {
                case 73:
                case 72:
                    Test0332.fFld -= Test0332.instanceCount;
            }
            for (i7 = 1; i7 < 6; i7++) {
                Test0332.iArrFld = Test0332.iArrFld;
                i8 = i6;
                i8 += (-95 + (i7 * i7));
                switch ((i7 % 8) + 123) {
                    case 123:
                        i9 = 1;
                        while (++i9 < 2) {
                            fArr[i9] = i8;
                            i6 += (int) Test0332.instanceCount;
                            iArr1[i7][i5 + 1] -= i5;
                            Test0332.iFld >>= i9;
                            Test0332.instanceCount <<= i5;
                        }
                        break;
                    case 124:
                        Test0332.instanceCount += 21094;
                        break;
                    case 125:
                        Test0332.instanceCount -= i5;
                        break;
                    case 126:
                        Test0332.instanceCount -= Test0332.instanceCount;
                        break;
                    case 127:
                    case 128:
                        Test0332.dArrFld[i5] = Test0332.dArrFld[i7];
                        break;
                    case 129:
                        if (b) continue;
                    case 130:
                        i8 += (int) Test0332.instanceCount;
                        break;
                    default:
                        Test0332.iFld = i5;
                }
            }
        }
        long meth_res = i5 + i6 + i7 + i8 + i9 + (b ? 1 : 0) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
                FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public static int iMeth(int i4) {

        float f = 0.221F;
        int i10 = 14561, i11 = 79;

        f = (Test0332.iFld = iMeth1());
        for (i10 = 15; i10 < 354; ++i10) {
            Test0332.instanceCount = Test0332.instanceCount;
        }
        long meth_res = i4 + Float.floatToIntBits(f) + i10 + i11;
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth() {

        int i2 = 11;
        int i3 = 40380;
        int i12 = 0;
        int i13 = 10;
        int i14 = 11;
        int[] iArr2 = new int[N];
        double d = 2.48640;
        boolean b1 = false;
        byte[] byArr = new byte[N];

        FuzzerUtils.init(byArr, (byte) 33);
        FuzzerUtils.init(iArr2, 0);

        if (b1) {
            Test0332.iFld = (byArr[(-13 >>> 1) % N]--);
            for (i2 = 7; i2 < 136; i2++) {
                try {
                    i3 = (i3 / i3);
                    Test0332.iFld = (i2 % Test0332.iFld);
                    i3 = (i3 / Test0332.iFld);
                } catch (ArithmeticException a_e) {
                }
                Test0332.iFld >>= (iMeth(i3) - Test0332.iFld);
                switch (((i2 % 1) * 5) + 94) {
                    case 99:
                        i3 += (64733 + (i2 * i2));
                        break;
                    default:
                        switch (((i2 >>> 1) % 5) + 9) {
                            case 9:
                                i3 = i2;
                            case 10:
                                Test0332.fFld += i12;
                                i13 = 1;
                                while (++i13 < 12) {
                                    if (true) break;
                                    for (d = 1; d < 1; ++d) {
                                        Test0332.iFld = Test0332.iFld;
                                        Test0332.iFld *= (int) Test0332.fFld;
                                    }
                                }
                                break;
                            case 11:
                                Test0332.instanceCount *= -7L;
                                break;
                            case 12:
                                Test0332.iArrFld[i2][i2 - 1] = i14;
                            case 13:
                                iArr2 = Test0332.iArrFld[i2];
                                break;
                            default:
                                Test0332.iFld = (int) -720124527L;
                        }
                }
            }
        } else if (b1) {
            i12 *= i3;
        } else if (b1) {
            Test0332.iArrFld[(i13 >>> 1) % N][(Test0332.iFld >>> 1) % N] %= (int) (i12 | 1);
        } else {
            Test0332.instanceCount -= 61519L;
        }
        vMeth_check_sum += i2 + i3 + i12 + i13 + Double.doubleToLongBits(d) + i14 + (b1 ? 1 : 0) +
                FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr2);
    }

    public static void main(String[] strArr) {

        try {
            Test0332 _instance = new Test0332();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = 53367;
        int i1 = 8;
        int i16 = 11737;
        int i17 = -6;
        int i18 = -146;
        int i19 = 0;
        int i20 = -55095;
        int i21 = -4;
        int i22 = 63567;
        int[] iArr = new int[N];
        short s = -4515;
        long l = -454358270L;
        float[][] fArr1 = new float[N][N];

        FuzzerUtils.init(iArr, 34352);
        FuzzerUtils.init(fArr1, -97.229F);

        i += i;
        iArr[(i >>> 1) % N] = (int) (Test0332.instanceCount--);
        i1 = 1;
        do {
            vMeth();
            s += (short) (((i1 * Test0332.instanceCount) + Test0332.fFld) - Test0332.iFld);
            for (l = 3; l < 70; l++) {
                Test0332.instanceCount *= Test0332.instanceCount;
                Test0332.iArrFld[i1][i1 + 1] <<= i16;
            }
            bFld = true;
            for (i17 = 2; 70 > i17; i17++) {
                i *= (int) Test0332.instanceCount;
                Test0332.iFld += (253 + (i17 * i17));
                Test0332.iFld -= (int) l;
                for (i19 = 1; i19 < 2; i19++) {
                    Test0332.iFld -= i17;
                    fArr1[i19 + 1][i17] = Test0332.fFld;
                    i >>= i20;
                    Test0332.iFld = 11;
                    Test0332.iArrFld[i19 + 1] = iArr;
                    i20 += (int) l;
                }
                i18 = i;
                iArr[i1 + 1] += (int) l;
                i20 += (i17 + i1);
                dFld += fFld1;
                Test0332.lArrFld[i17] *= l;
                i16 = (int) Test0332.fFld;
            }
            Test0332.instanceCount += (i1 ^ i17);
            for (i21 = 3; 70 > i21; i21++) {
                i += (int) Test0332.instanceCount;
                s = (short) i18;
            }
        } while (++i1 < 358);

        FuzzerUtils.out.println("i i1 s = " + i + "," + i1 + "," + s);
        FuzzerUtils.out.println("l i16 i17 = " + l + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 iArr = " + i21 + "," + i22 + "," + FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println("fArr1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));

        FuzzerUtils.out.println("Test0332.instanceCount Test0332.iFld Test0332.fFld = " + Test0332.instanceCount + "," + Test0332.iFld +
                "," + Float.floatToIntBits(Test0332.fFld));
        FuzzerUtils.out.println("bFld dFld fFld1 = " + (bFld ? 1 : 0) + "," + Double.doubleToLongBits(dFld) + "," +
                Float.floatToIntBits(fFld1));
        FuzzerUtils.out.println("Test0332.iArrFld Test0332.dArrFld Test0332.lArrFld = " + FuzzerUtils.checkSum(Test0332.iArrFld) + ","
                + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0332.dArrFld)) + "," + FuzzerUtils.checkSum(Test0332.lArrFld));

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
