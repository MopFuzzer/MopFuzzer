// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:01 2023
public class Test0344 {

    public static final int N = 400;

    public static long instanceCount = -236L;
    public static boolean bFld = false;
    public static int iFld = 110;
    public static int[] iArrFld = new int[N];
    public static float[] fArrFld = new float[N];
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0344.iArrFld, 12);
        FuzzerUtils.init(Test0344.fArrFld, 97.571F);
    }

    public short sFld = -13251;
    public volatile long[] lArrFld = new long[N];

    public static void vMeth1() {

        int i11 = -109, i12 = -32512, i13 = 108, i14 = -106;
        float f1 = 112.440F;
        double d1 = 2.9133;
        long[][] lArr = new long[N][N];

        FuzzerUtils.init(lArr, -6L);

        for (int i10 : Test0344.iArrFld) {
            for (i11 = 1; 4 > i11; ++i11) {
                f1 = 1;
                for (i13 = 1; 2 > i13; i13++) {
                    byte by = 5;
                    long l1 = 36120L;
                    f1 += i11;
                    d1 -= d1;
                    try {
                        i14 = (Test0344.iArrFld[i13] / i13);
                        i10 = (i14 % -36740);
                        Test0344.iArrFld[i13 + 1] = (Test0344.iArrFld[i13 - 1] % i10);
                    } catch (ArithmeticException a_e) {
                    }
                    i10 -= 42;
                    by = (byte) i12;
                    i12 += i11;
                    try {
                        Test0344.iArrFld[i11] = (Test0344.iArrFld[i11 - 1] / 205);
                        i12 = (i13 % i12);
                        i12 = (i13 / i10);
                    } catch (ArithmeticException a_e) {
                    }
                    l1 += l1;
                    l1 = l1;
                    Test0344.instanceCount >>= i14;
                }
                lArr[i11 + 1] = lArr[i11];
            }
        }
        vMeth1_check_sum += i11 + i12 + Float.floatToIntBits(f1) + i13 + i14 + Double.doubleToLongBits(d1) +
                FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth() {

        int i15 = 0, i16 = -46236, i17 = -46235;
        float f2 = 98.680F;
        byte by1 = 91;
        long l2 = 6471357390133813985L;

        vMeth1();
        i15 = 316;
        while (--i15 > 0) {
            Test0344.iFld += (-236 + (i15 * i15));
            f2 = i15;
            Test0344.iFld >>>= -27929;
            by1 += (byte) (i15 - i15);
            Test0344.iFld += (int) Test0344.instanceCount;
            Test0344.fArrFld[i15] += Test0344.iFld;
            for (l2 = 5; l2 > i15; --l2) {
                if (i17 != 0) {
                    vMeth_check_sum += i15 + Float.floatToIntBits(f2) + by1 + l2 + i16 + i17;
                    return;
                }
                switch ((((i15 >>> 1) % 3) * 5) + 33) {
                    case 45:
                        switch ((((Test0344.iFld >>> 1) % 2) * 5) + 105) {
                            case 106:
                                i17 += (int) f2;
                                break;
                            case 109:
                                i16 += (73 + (l2 * l2));
                                i17 = (int) Test0344.instanceCount;
                                break;
                        }
                        break;
                    case 35:
                    case 42:
                        i16 &= (int) l2;
                        break;
                }
            }
        }
        vMeth_check_sum += i15 + Float.floatToIntBits(f2) + by1 + l2 + i16 + i17;
    }

    public static int iMeth(long l) {

        int i8 = 13;
        int i9 = -48313;
        int i18 = 248;
        int i19 = -91;
        int i20 = -25;
        int[] iArr = new int[N];
        short s = -1645;
        double[] dArr = new double[N];
        long[] lArr1 = new long[N];

        FuzzerUtils.init(iArr, -49854);
        FuzzerUtils.init(dArr, -40.1045);
        FuzzerUtils.init(lArr1, 33868L);

        for (i8 = 342; i8 > 17; i8--) {
            iArr[i8 + 1] <<= s;
            vMeth();
        }
        Test0344.iArrFld[(i8 >>> 1) % N] += -11;
        i18 = 1;
        do {
            iArr[i18] -= i9;
            iArr[i18 + 1] *= -9;
            i9 = i18;
            Test0344.iFld >>>= i18;
            dArr[i18] *= i18;
            for (i19 = i18; i19 < 6; ++i19) {
                lArr1[i19] *= i9;
                l += (((i19 * i8) + i19) - i18);
                i20 += (i19 - Test0344.instanceCount);
                Test0344.iFld *= 11;
            }
        } while (++i18 < 297);
        long meth_res = l + i8 + i9 + s + i18 + i19 + i20 + FuzzerUtils.checkSum(iArr) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0344 _instance = new Test0344();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = 14, i1 = 2, i2 = 0, i3 = 186, i4 = -12, i5 = 14, i6 = 35740, i7 = -48673;
        float f = 60.123F;
        boolean b = false;
        double d = 101.110909;

        for (i = 5; i < 153; ++i) {
            i1 = (int) (((i2 - -2L) - i1) * ((i + i) * (--f)));
            for (i3 = 7; i3 < 169; i3 += 2) {
                i1 += (int) (Test0344.instanceCount--);
                for (i5 = i3; i5 < 3; i5++) {
                    if (Test0344.bFld = (i3 < (-(Test0344.instanceCount - i2)))) break;
                    b = ((i6 + (11 + (Test0344.instanceCount - i5))) < (i6++));
                    lArrFld[i] -= (long) ((d * (i1 - Test0344.instanceCount)) + (i2--));
                    switch ((((i2 >>> 1) % 6) * 5) + 78) {
                        case 97:
                        case 108:
                            i7 -= iMeth(Test0344.instanceCount);
                            Test0344.bFld = false;
                            d -= i6;
                        case 91:
                            Test0344.instanceCount += (i5 * i5);
                            Test0344.instanceCount = i6;
                            break;
                        case 101:
                            i7 = -133;
                        case 100:
                            b = false;
                            i2 <<= i1;
                            Test0344.iFld = i4;
                            Test0344.iFld <<= i3;
                            break;
                        case 102:
                            lArrFld[i + 1] = Test0344.instanceCount;
                            break;
                        default:
                            i4 = i4;
                            i2 -= 225;
                            i1 = i2;
                            Test0344.instanceCount *= Test0344.instanceCount;
                    }
                    Test0344.iArrFld[i5 - 1] = i;
                    Test0344.iFld += i5;
                    f += (float) d;
                    sFld += (short) i4;
                    Test0344.instanceCount -= i6;
                }
                if (false) continue;
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("f i3 i4 = " + Float.floatToIntBits(f) + "," + i3 + "," + i4);
        FuzzerUtils.out.println("i5 i6 b = " + i5 + "," + i6 + "," + (b ? 1 : 0));
        FuzzerUtils.out.println("d i7 = " + Double.doubleToLongBits(d) + "," + i7);

        FuzzerUtils.out.println("Test0344.instanceCount Test0344.bFld Test0344.iFld = " + Test0344.instanceCount + "," + (Test0344.bFld ? 1
                : 0) + "," + Test0344.iFld);
        FuzzerUtils.out.println("sFld lArrFld Test0344.iArrFld = " + sFld + "," + FuzzerUtils.checkSum(lArrFld) + "," +
                FuzzerUtils.checkSum(Test0344.iArrFld));
        FuzzerUtils.out.println("Test0344.fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0344.fArrFld)));

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