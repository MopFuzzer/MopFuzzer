// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:59 2023
public class Test0245 {

    public static final int N = 400;

    public static long instanceCount = 5672910871542859161L;
    public static volatile int iFld = -185;
    public static float fFld = 0.116F;
    public static short sFld = 31932;
    public static volatile int[] iArrFld = new int[N];
    public static long[] lArrFld = new long[N];
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0245.iArrFld, 26642);
        FuzzerUtils.init(Test0245.lArrFld, 0L);
    }

    public boolean bFld = true;
    public float[] fArrFld = new float[N];

    public static void vMeth1(int i6, int i7, int i8) {

        long l1 = -58L;
        double d1 = 0.81189;
        boolean b = false;
        int i10 = 31013, i11 = 44857, i12 = -62123;
        float f1 = 101.598F;
        byte by = 92;

        switch (((-8641 >>> 1) % 2) + 37) {
            case 37:
                for (int i9 : Test0245.iArrFld) {
                    l1 = 1;
                    do {
                        d1 = d1;
                        i6 = 56;
                        Test0245.iArrFld[(int) (l1 + 1)] *= i8;
                        if (false) continue;
                        Test0245.instanceCount += i8;
                        b = b;
                    } while (++l1 < 4);
                    i10 = 1;
                    do {
                        i9 -= (int) 41367L;
                        Test0245.instanceCount += (((i10 * i8) + i8) - f1);
                        for (i11 = 1; i11 < 1; i11 += 2) {
                            d1 -= -42852;
                            if (i10 != 0) {
                                vMeth1_check_sum += i6 + i7 + i8 + l1 + Double.doubleToLongBits(d1) + (b ? 1 : 0) + i10 +
                                        Float.floatToIntBits(f1) + i11 + i12 + by;
                                return;
                            }
                        }
                    } while (++i10 < 4);
                }
            case 38:
                by += (byte) i12;
                break;
        }
        vMeth1_check_sum += i6 + i7 + i8 + l1 + Double.doubleToLongBits(d1) + (b ? 1 : 0) + i10 +
                Float.floatToIntBits(f1) + i11 + i12 + by;
    }

    public static void vMeth(int i5, long l, short s) {

        int i13 = -9, i14 = -14;
        double d2 = -2.106281;
        double[] dArr = new double[N];
        float f2 = -2.176F;
        byte by1 = 113;

        FuzzerUtils.init(dArr, 0.63714);

        vMeth1(-13, i5, i5);
        i13 = 1;
        do {
            i5 += i13;
            dArr[i13 - 1] -= i13;
            for (d2 = 1; d2 < 7; d2++) {
                Test0245.iArrFld = Test0245.iArrFld;
                i5 &= i14;
                f2 += Test0245.instanceCount;
                Test0245.iArrFld[i13] -= -29014;
                l += (long) (((d2 * Test0245.instanceCount) + f2) - Test0245.instanceCount);
            }
            l <<= i5;
            if (i13 != 0) {
                vMeth_check_sum += i5 + l + s + i13 + Double.doubleToLongBits(d2) + i14 + Float.floatToIntBits(f2) +
                        by1 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                return;
            }
            i14 = (int) Test0245.instanceCount;
            Test0245.iArrFld[i13] >>= by1;
        } while (++i13 < 224);
        i5 -= (int) -146L;
        vMeth_check_sum += i5 + l + s + i13 + Double.doubleToLongBits(d2) + i14 + Float.floatToIntBits(f2) + by1 +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static int iMeth() {

        int i15 = 185, i16 = -14, i17 = -4, i18 = -8, i19 = -233, i20 = -9, i21 = -32060, i22 = 7662, i23 = -170;
        short s1 = 8300;
        byte by2 = 120;

        vMeth(i15, Test0245.instanceCount, s1);
        i15 >>= i15;
        i15 = Test0245.iFld;
        for (i16 = 10; i16 < 339; ++i16) {
            for (i18 = 1; 5 > i18; ++i18) {
                for (i20 = i18; 2 > i20; i20++) {
                    Test0245.instanceCount -= 9;
                    Test0245.iArrFld[i16] >>= i21;
                }
                i21 = -242;
                Test0245.fFld -= Test0245.fFld;
                for (i22 = 1; i22 < 2; i22++) {
                    s1 <<= (short) 3;
                    Test0245.fFld += (i22 * i22);
                    by2 &= (byte) -95;
                }
                i19 += (-5 + (i18 * i18));
            }
        }
        long meth_res = i15 + s1 + i16 + i17 + i18 + i19 + i20 + i21 + i22 + i23 + by2;
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr2) {

        try {
            Test0245 _instance = new Test0245();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr2);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr3) {

        int i1 = -5;
        int i2 = -11436;
        int i3 = 4258;
        int i4 = 12;
        int i24 = -6085;
        int i25 = 92;
        int i26 = 86;
        int i27 = -226;
        int i28 = 16011;
        int i29 = 9;
        int i30 = 5;
        int[][] iArr1 = new int[N][N];
        float f = -94.858F;
        byte by3 = 115;
        double d3 = -118.26570;

        FuzzerUtils.init(iArr1, -5);

        for (i1 = 2; i1 < 239; ++i1) {
            switch ((i1 % 10) + 12) {
                case 12:
                    f += i1;
                    for (i3 = 106; 1 < i3; --i3) {
                        f += iMeth();
                        f += i3;
                        Test0245.instanceCount += (((i3 * f) + Test0245.sFld) - Test0245.iFld);
                        if (bFld) continue;
                    }
                case 13:
                    for (i24 = 106; i24 > 1; --i24) {
                        by3 >>= (byte) i25;
                        i25 += i3;
                        i4 += (int) (0.241F + (i24 * i24));
                        i25 -= i4;
                        by3 = (byte) i24;
                    }
                    Test0245.instanceCount -= (long) d3;
                    i25 = i2;
                    for (i26 = 106; i26 > 2; i26 -= 2) {
                        Test0245.iFld = (int) Test0245.fFld;
                    }
                    break;
                case 14:
                    Test0245.iArrFld[i1] -= by3;
                case 15:
                case 16:
                    i28 = 1;
                    while (++i28 < 106) {
                        Test0245.sFld += (short) (i28 - i3);
                        for (i29 = 1; 1 > i29; i29++) {
                            Test0245.iFld -= (int) Test0245.instanceCount;
                            Test0245.iFld = i27;
                            switch (i1 % 6) {
                                case 0:
                                    Test0245.instanceCount -= i30;
                                    i2 = i30;
                                    fArrFld[i1 - 1] = i26;
                                    i27 >>= i3;
                                    break;
                                case 1:
                                    i30 = (int) -10L;
                                case 2:
                                    i2 += -11564;
                                    break;
                                case 3:
                                    f += ((long) i29 | (long) i29);
                                case 4:
                                    iArr1 = iArr1;
                                    break;
                                case 5:
                                    f += (float) d3;
                                    break;
                            }
                        }
                    }
                case 17:
                    i27 *= i28;
                    break;
                case 18:
                    i4 >>= i29;
                    break;
                case 19:
                    Test0245.lArrFld[(Test0245.iFld >>> 1) % N] -= i27;
                    break;
                case 20:
                    d3 %= (i1 | 1);
                    break;
                case 21:
                    i30 >>= 14;
                    break;
                default:
                    Test0245.lArrFld[i1 - 1] = i28;
            }
        }

        FuzzerUtils.out.println("i1 i2 f = " + i1 + "," + i2 + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("i3 i4 i24 = " + i3 + "," + i4 + "," + i24);
        FuzzerUtils.out.println("i25 by3 d3 = " + i25 + "," + by3 + "," + Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("i26 i27 i28 = " + i26 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("i29 i30 iArr1 = " + i29 + "," + i30 + "," + FuzzerUtils.checkSum(iArr1));

        FuzzerUtils.out.println("Test0245.instanceCount Test0245.iFld Test0245.fFld = " + Test0245.instanceCount + "," + Test0245.iFld +
                "," + Float.floatToIntBits(Test0245.fFld));
        FuzzerUtils.out.println("Test0245.sFld bFld Test0245.iArrFld = " + Test0245.sFld + "," + (bFld ? 1 : 0) + "," +
                FuzzerUtils.checkSum(Test0245.iArrFld));
        FuzzerUtils.out.println("fArrFld Test0245.lArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)) +
                "," + FuzzerUtils.checkSum(Test0245.lArrFld));

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
