// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:00 2023
public class Test0303 {

    public static final int N = 400;

    public static long instanceCount = -45658L;
    public static byte byFld = -61;
    public static long lFld = -20339L;
    public static float fFld = 0.898F;
    public static int iFld = -188;
    public static boolean bFld = true;
    public static int iFld1 = 98;
    public static int[] iArrFld = new int[N];
    public static boolean[] bArrFld = new boolean[N];
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0303.iArrFld, -31590);
        FuzzerUtils.init(Test0303.bArrFld, true);
    }

    public static void vMeth1(long l) {

        double d = 60.776, d1 = -49.127780;
        float f = -30.7F;
        int i3 = 23131, i4 = 28609;
        short s = 16324;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, 209745557L);

        d = 1;
        do {
            for (f = 6; 1 < f; f--) {
                i3 -= (int) -155L;
                i3 = i3;
                i4 = 1;
                do {
                    Test0303.iArrFld[(int) (d - 1)] = i3;
                    lArr[i4 - 1] -= l;
                    switch ((int) ((d % 9) + 96)) {
                        case 96:
                            i3 = (int) 2964290156195631094L;
                            Test0303.iArrFld[(int) (f + 1)] = (int) l;
                            i3 -= 122;
                        case 97:
                            lArr[(int) (d - 1)] -= i3;
                            d1 = Test0303.byFld;
                            break;
                        case 98:
                            i3 = i4;
                            i3 += i4;
                            break;
                        case 99:
                            Test0303.instanceCount = i3;
                            break;
                        case 100:
                            if (true) continue;
                            break;
                        case 101:
                            i3 += (int) Test0303.lFld;
                        case 102:
                            s *= (short) Test0303.instanceCount;
                        case 103:
                            if (i4 != 0) {
                                vMeth1_check_sum += l + Double.doubleToLongBits(d) + Float.floatToIntBits(f) + i3 + i4 +
                                        Double.doubleToLongBits(d1) + s + FuzzerUtils.checkSum(lArr);
                                return;
                            }
                            break;
                        case 104:
                            try {
                                i3 = (i4 % Test0303.iArrFld[(int) (d - 1)]);
                                i3 = (Test0303.iArrFld[(int) (d + 1)] / 38914);
                                Test0303.iArrFld[(i3 >>> 1) % N] = (52850 / i3);
                            } catch (ArithmeticException a_e) {
                            }
                    }
                } while (++i4 < 2);
            }
        } while (++d < 281);
        vMeth1_check_sum += l + Double.doubleToLongBits(d) + Float.floatToIntBits(f) + i3 + i4 +
                Double.doubleToLongBits(d1) + s + FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth(int i1, int i2) {

        int i5 = -5, i6 = -27, i7 = 23281, i8 = 342, i9 = -41, i10 = 26;

        vMeth1(Test0303.instanceCount);
        i5 = 1;
        while (++i5 < 271) {
            Test0303.instanceCount += (i5 * i5);
        }
        i6 = 1;
        do {
            for (i7 = 1; 8 > i7; ++i7) {
                Test0303.fFld += (((i7 * i5) + Test0303.instanceCount) - i7);
                Test0303.iArrFld = Test0303.iArrFld;
                i2 -= 221;
                Test0303.iArrFld[i6] <<= (int) Test0303.instanceCount;
                Test0303.fFld += (((i7 * i1) + Test0303.lFld) - Test0303.lFld);
                i8 += (i7 * i7);
            }
        } while (++i6 < 192);
        Test0303.iArrFld[(107 >>> 1) % N] = i6;
        for (i9 = 6; i9 < 215; i9++) {
            Test0303.iArrFld[i9 + 1] += 30683;
            i10 ^= (int) Test0303.instanceCount;
        }
        long meth_res = i1 + i2 + i5 + i6 + i7 + i8 + i9 + i10;
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth(int i) {

        double d2 = 0.101141;
        int i11 = 31671, i12 = -8, i13 = 98, i14 = -3593, i15 = 11, i16 = 6;
        boolean b = true;
        float f1 = -39.729F;

        i *= iMeth(i, i);
        Test0303.iArrFld[(i >>> 1) % N] *= (int) d2;
        for (i11 = 7; i11 < 156; i11++) {
            Test0303.fFld = 28451;
            for (i13 = i11; i13 < 11; i13++) {
                b = b;
                if (i != 0) {
                    vMeth_check_sum += i + Double.doubleToLongBits(d2) + i11 + i12 + i13 + i14 + (b ? 1 : 0) +
                            Float.floatToIntBits(f1) + i15 + i16;
                    return;
                }
                i12 = -32151;
                i14 <<= i;
                Test0303.instanceCount = i12;
            }
            for (f1 = 1; f1 < 11; ++f1) {
                i16 = 1;
                do {
                    Test0303.fFld %= (i16 | 1);
                    i12 |= Test0303.byFld;
                } while (++i16 < 2);
                i12 *= (int) Test0303.lFld;
            }
        }
        vMeth_check_sum += i + Double.doubleToLongBits(d2) + i11 + i12 + i13 + i14 + (b ? 1 : 0) +
                Float.floatToIntBits(f1) + i15 + i16;
    }

    public static void main(String[] strArr) {

        try {
            Test0303 _instance = new Test0303();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        long l1 = 8621693204100026713L;
        int i17 = 56226, i18 = 22, i19 = -12, i20 = -18099, i21 = 2, i22 = -14323;
        double d3 = -104.49474;
        short s1 = -1287;

        vMeth(Test0303.iFld);
        for (l1 = 4; l1 < 309; ++l1) {
            Test0303.instanceCount += (long) d3;
            Test0303.iArrFld = Test0303.iArrFld;
            for (i18 = 82; i18 > l1; --i18) {
                for (i20 = 1; i20 < 1; i20++) {
                    switch ((int) ((l1 % 8) + 12)) {
                        case 12:
                            i21 *= 12;
                            Test0303.bArrFld[i18] = Test0303.bFld;
                            i19 *= (int) -1981675463417631827L;
                        case 13:
                            Test0303.iArrFld[i18 + 1] ^= i20;
                            Test0303.iFld += (((i20 * Test0303.iFld) + Test0303.iFld) - i18);
                            Test0303.fFld *= i22;
                            break;
                        case 14:
                            Test0303.fFld = i19;
                            Test0303.lFld += (i20 - i19);
                            s1 <<= (short) i21;
                            i17 += (((i20 * Test0303.iFld) + Test0303.instanceCount) - Test0303.iFld);
                            break;
                        case 15:
                            Test0303.fFld = i20;
                            switch ((int) (((l1 % 1) * 5) + 8)) {
                                case 13:
                                    switch ((i18 % 2) + 73) {
                                        case 73:
                                        case 74:
                                            i21 = i19;
                                            i17 = Test0303.iFld1;
                                            Test0303.bFld = Test0303.bFld;
                                            i22 = (int) Test0303.fFld;
                                            break;
                                        default:
                                            Test0303.fFld -= -33794L;
                                            Test0303.lFld = l1;
                                            i21 <<= -11768;
                                            Test0303.fFld *= i18;
                                    }
                                    Test0303.iFld = (int) 2L;
                                    break;
                            }
                            Test0303.lFld <<= Test0303.iFld;
                            break;
                        case 16:
                            Test0303.lFld |= 122;
                            break;
                        case 17:
                            i21 += Test0303.iFld1;
                            break;
                        case 18:
                            Test0303.iFld += (int) 2.128220;
                        case 19:
                            Test0303.iFld1 |= (int) Test0303.instanceCount;
                            break;
                        default:
                            Test0303.fFld = 0L;
                    }
                }
            }
        }

        FuzzerUtils.out.println("l1 i17 d3 = " + l1 + "," + i17 + "," + Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 s1 = " + i21 + "," + i22 + "," + s1);

        FuzzerUtils.out.println("Test0303.instanceCount Test0303.byFld Test0303.lFld = " + Test0303.instanceCount + "," + Test0303.byFld +
                "," + Test0303.lFld);
        FuzzerUtils.out.println("Test0303.fFld Test0303.iFld Test0303.bFld = " + Float.floatToIntBits(Test0303.fFld) + "," + Test0303.iFld
                + "," + (Test0303.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0303.iFld1 Test0303.iArrFld Test0303.bArrFld = " + Test0303.iFld1 + "," +
                FuzzerUtils.checkSum(Test0303.iArrFld) + "," + FuzzerUtils.checkSum(Test0303.bArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
