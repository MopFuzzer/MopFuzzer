// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:06 2023
public class Test0519 {

    public static final int N = 400;

    public static volatile long instanceCount = 197L;
    public static int iFld = -2549;
    public static double dFld = 123.14265;
    public static volatile boolean bFld = true;
    public static short sFld = 1670;
    public static float[] fArrFld = new float[N];
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0519.fArrFld, -2.626F);
    }

    public byte byFld = -52;

    public static void vMeth1() {

        int i3 = 30448;
        int i4 = 9490;
        int i5 = 1;
        int i6 = -42;
        int i7 = -11700;
        int i8 = -55905;
        int[] iArr = new int[N];
        short s1 = -23361;
        long[] lArr = new long[N];

        FuzzerUtils.init(iArr, 183);
        FuzzerUtils.init(lArr, -1546885975L);

        for (i3 = 14; i3 < 338; ++i3) {
            float f2 = 0.655F;
            if (i3 != 0) {
                vMeth1_check_sum += i3 + i4 + s1 + i5 + i6 + i7 + i8 + FuzzerUtils.checkSum(iArr) +
                        FuzzerUtils.checkSum(lArr);
                return;
            }
            Test0519.iFld = (int) 44.392F;
            s1 -= (short) Test0519.iFld;
            i4 = 72;
            switch (((i3 % 5) * 5) + 41) {
                case 64:
                    switch ((i3 % 2) + 13) {
                        case 13:
                            for (i5 = 5; i5 > 1; --i5) {
                                iArr[i5] *= Test0519.iFld;
                            }
                            Test0519.iFld += i6;
                            Test0519.iFld = i6;
                            for (i7 = 1; i7 < 5; i7++) {
                                iArr[i7 + 1] += i6;
                                i8 *= i4;
                            }
                            break;
                        case 14:
                        default:
                            i4 /= (int) (Test0519.instanceCount | 1);
                    }
                    break;
                case 57:
                    lArr[i3] -= Test0519.instanceCount;
                    break;
                case 55:
                    i8 = 79;
                case 60:
                    Test0519.fArrFld[i3 - 1] = Test0519.iFld;
                    break;
                case 63:
                default:
                    Test0519.dFld /= ((long) (f2) | 1);
            }
        }
        vMeth1_check_sum += i3 + i4 + s1 + i5 + i6 + i7 + i8 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(long l1, int i1, int i2) {

        int i9 = -224, i10 = 31481, i11 = -30571, i12 = -9, i13 = -12275;

        vMeth1();
        Test0519.instanceCount *= i2;
        i9 = 1;
        while (++i9 < 169) {
            for (i10 = 9; i10 > 1; --i10) {
                i1 = (int) Test0519.instanceCount;
                Test0519.iFld *= (int) -23.106551;
                Test0519.fArrFld[i10 - 1] *= i11;
                l1 = i10;
                for (i12 = i10; i12 < 2; ++i12) {
                    Test0519.instanceCount *= l1;
                    i2 = i12;
                    switch ((i12 % 3) + 10) {
                        case 10:
                            Test0519.bFld = Test0519.bFld;
                            break;
                        case 11:
                            i1 += i10;
                            Test0519.instanceCount += i11;
                            break;
                        case 12:
                            if (Test0519.bFld) break;
                            break;
                    }
                }
            }
        }
        vMeth_check_sum += l1 + i1 + i2 + i9 + i10 + i11 + i12 + i13;
    }

    public static int iMeth(int i, short s) {

        float f1 = -2.198F;
        double d = -30.65719;

        Test0519.iFld -= (int) (((f1--) / (((long) (d * Test0519.instanceCount)) | 1)) + (--Test0519.iFld));
        Test0519.instanceCount += (((Test0519.iFld - i) >> (long) (i + f1)) * (Test0519.iFld--));
        i += (int) d;
        vMeth(Test0519.instanceCount, Test0519.iFld, -29);
        long meth_res = i + s + Float.floatToIntBits(f1) + Double.doubleToLongBits(d);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0519 _instance = new Test0519();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        long l = -47796L;
        long[] lArr1 = new long[N];
        float f = 64.246F;
        int i14 = 1;
        int i15 = -138;
        int i16 = 8;
        int i17 = 143;
        int i18 = 30739;
        int[] iArr1 = new int[N];
        double[] dArr = new double[N];

        FuzzerUtils.init(iArr1, 111);
        FuzzerUtils.init(lArr1, -726937479L);
        FuzzerUtils.init(dArr, 12.4148);

        l = 1;
        while (++l < 289) {
            f += (Test0519.iFld - ((Test0519.iFld + f) + iMeth(0, (short) (5405))));
            for (i14 = 2; i14 < 87; i14++) {
                for (i16 = 1; i16 < 2; i16++) {
                    i17 += (int) Test0519.instanceCount;
                    byFld = (byte) i17;
                    iArr1[i16 - 1] = (int) Test0519.dFld;
                    lArr1[(int) (l + 1)] = i14;
                    iArr1[i16 - 1] -= i16;
                    Test0519.fArrFld[(i17 >>> 1) % N] = 40703;
                    i17 -= i15;
                    Test0519.bFld = Test0519.bFld;
                    switch ((int) (((l % 9) * 5) + 57)) {
                        case 82:
                        case 67:
                            switch (((i14 % 1) * 5) + 121) {
                                case 122:
                                    f -= i14;
                                    Test0519.iFld = i14;
                                    break;
                                default:
                                    byFld = (byte) f;
                            }
                            Test0519.instanceCount >>= 26761;
                            Test0519.iFld += i16;
                            break;
                        case 100:
                            Test0519.iFld >>>= 94;
                            Test0519.sFld = (short) Test0519.instanceCount;
                            i15 += i16;
                            Test0519.iFld -= -1;
                            break;
                        case 86:
                            i15 = i18;
                            i15 -= i14;
                            i15 -= i17;
                            switch ((((i17 >>> 1) % 6) * 5) + 58) {
                                case 68:
                                    dArr[(i16 >>> 1) % N] = f;
                                    Test0519.dFld = f;
                                    f = i15;
                                case 69:
                                    f = l;
                                case 73:
                                    Test0519.sFld += (short) (-165 + (i16 * i16));
                                    break;
                                case 74:
                                    f += (((i16 * i16) + i17) - Test0519.iFld);
                                    break;
                                case 81:
                                    if (Test0519.bFld) break;
                                    break;
                                case 64:
                                    Test0519.iFld = (int) l;
                                    break;
                            }
                        case 81:
                            Test0519.instanceCount = (long) 42.425F;
                        case 79:
                            Test0519.instanceCount *= i17;
                            break;
                        case 73:
                            Test0519.instanceCount -= 3672122248L;
                            break;
                        case 60:
                            i17 *= (int) l;
                            break;
                        case 58:
                            i18 += i18;
                            break;
                        default:
                            Test0519.dFld = i14;
                    }
                }
            }
        }

        FuzzerUtils.out.println("l f i14 = " + l + "," + Float.floatToIntBits(f) + "," + i14);
        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 iArr1 lArr1 = " + i18 + "," + FuzzerUtils.checkSum(iArr1) + "," +
                FuzzerUtils.checkSum(lArr1));
        FuzzerUtils.out.println("dArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test0519.instanceCount Test0519.iFld Test0519.dFld = " + Test0519.instanceCount + "," + Test0519.iFld +
                "," + Double.doubleToLongBits(Test0519.dFld));
        FuzzerUtils.out.println("Test0519.bFld byFld Test0519.sFld = " + (Test0519.bFld ? 1 : 0) + "," + byFld + "," + Test0519.sFld);
        FuzzerUtils.out.println("Test0519.fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0519.fArrFld)));

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