// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:11 2023
public class Test0729 {

    public static final int N = 400;

    public static long instanceCount = -2971325255104502683L;
    public static boolean bFld = false;
    public static byte byFld = 91;
    public static int iFld = -14;
    public static short sFld = 16189;
    public static long[] lArrFld = new long[N];
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0729.lArrFld, 134L);
    }

    public volatile double dFld = -103.104680;
    public int[] iArrFld = new int[N];

    public static int iMeth1(int i2, int i3, long l1) {

        int i4 = 23115, i5 = 67;
        long l2 = -25854L;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, -12L);

        lArr[(i2 >>> 1) % N] = 56687;
        i3 -= i3;
        i4 = 130;
        while (--i4 > 0) {
            i2 /= (int) (i4 | 1);
            if (Test0729.bFld) continue;
            for (l2 = 12; l2 > 1; l2 -= 3) {
                switch ((int) ((l2 % 8) + 23)) {
                    case 23:
                    case 24:
                        i3 >>= (int) l2;
                    case 25:
                        i2 = i3;
                        break;
                    case 26:
                        i2 &= i5;
                        break;
                    case 27:
                        i2 = -51036;
                        i2 = i4;
                        l1 += l2;
                        break;
                    case 28:
                        i2 = i3;
                        break;
                    case 29:
                        i5 = i2;
                    case 30:
                        i5 = i4;
                        break;
                    default:
                        i5 >>= i5;
                }
            }
        }
        long meth_res = i2 + i3 + l1 + i4 + l2 + i5 + FuzzerUtils.checkSum(lArr);
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0729 _instance = new Test0729();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public int iMeth(long l) {

        int i6 = -23;
        int i7 = 105;
        int i8 = 0;
        int i9 = -183;
        int i10 = 2;
        int i11 = 14;
        int i12 = 9;
        int i13 = 2;
        int i14 = 181;
        int[] iArr = new int[N];
        float f1 = 0.753F;
        double d = 103.99778, d1 = 1.70123;

        FuzzerUtils.init(iArr, -225);

        iMeth1(i6, -57752, l);
        for (i7 = 3; i7 < 303; i7 += 3) {
            i6 -= 87;
            i8 += (((i7 * l) + i8) - i8);
            for (i9 = i7; 16 > i9; i9++) {
                iArr[i7] *= Test0729.byFld;
            }
            for (i11 = 1; 16 > i11; i11++) {
                for (i13 = 2; i13 > 1; i13 -= 2) {
                    f1 -= (float) d;
                    Test0729.bFld = Test0729.bFld;
                    switch ((i13 % 9) + 2) {
                        case 2:
                            d1 = 7;
                            iArr[i11] &= i6;
                            iArr = iArr;
                        case 3:
                            i14 += (int) f1;
                            break;
                        case 4:
                            l *= 6;
                            break;
                        case 5:
                            i10 >>= i7;
                            break;
                        case 6:
                            iArr[i7 + 1] -= i12;
                        case 7:
                            l /= (i7 | 1);
                            break;
                        case 8:
                            i6 -= (int) f1;
                            break;
                        case 9:
                            Test0729.instanceCount -= l;
                        case 10:
                            i10 = (int) l;
                            break;
                    }
                }
            }
        }
        long meth_res = l + i6 + i7 + i8 + i9 + i10 + i11 + i12 + i13 + i14 + Float.floatToIntBits(f1) +
                Double.doubleToLongBits(d) + Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public void vMeth(int i, float f, int i1) {

        int i15 = -5, i16 = -2;
        short s = -5157;

        Test0729.instanceCount <<= i;
        i -= (iMeth(Test0729.instanceCount) + i1);
        Test0729.lArrFld[(i1 >>> 1) % N] = i;
        i -= (int) dFld;
        i1 = (int) Test0729.instanceCount;
        i1 >>= i1;
        i1 = (int) dFld;
        for (i15 = 18; i15 < 378; i15++) {
            s -= (short) 38370;
            Test0729.instanceCount += (i15 * f);
            iArrFld = iArrFld;
            i16 = i;
            i1 += i15;
            f += (54437 + (i15 * i15));
            i16 += (((i15 * i) + i) - i16);
        }
        vMeth_check_sum += i + Float.floatToIntBits(f) + i1 + i15 + i16 + s;
    }

    public void mainTest(String[] strArr1) {

        float f2 = 91.148F;
        float[] fArr = new float[N];
        float[] fArr1 = new float[N];
        int i17 = -58475, i18 = -1, i19 = 9, i20 = 109, i21 = -53;
        double d2 = 67.29097;

        FuzzerUtils.init(fArr, 0.832F);
        FuzzerUtils.init(fArr1, 0.823F);

        vMeth(Test0729.iFld, f2, Test0729.iFld);
        for (i17 = 9; i17 < 240; i17++) {
            i19 = 1;
            do {
                f2 *= Test0729.iFld;
                fArr = fArr1;
                Test0729.instanceCount = Test0729.byFld;
                iArrFld = iArrFld;
                for (i20 = i17; i20 < 1; ++i20) {
                    Test0729.iFld = Test0729.byFld;
                    Test0729.iFld = i18;
                    Test0729.instanceCount = i19;
                    i18 -= i21;
                    iArrFld = iArrFld;
                    switch (((-14 >>> 1) % 9) + 107) {
                        case 107:
                            if (false) {
                                Test0729.lArrFld[i19] *= i19;
                            }
                            break;
                        case 108:
                            if (Test0729.bFld) {
                                f2 += i17;
                                switch ((((i20 >>> 1) % 7) * 5) + 8) {
                                    case 40:
                                        Test0729.instanceCount |= Test0729.iFld;
                                        Test0729.instanceCount += i20;
                                        break;
                                    case 15:
                                        f2 = i20;
                                        iArrFld[i20] += (int) dFld;
                                        Test0729.iFld >>= Test0729.iFld;
                                        i18 += (int) d2;
                                        break;
                                    case 13:
                                        i21 += i17;
                                        Test0729.iFld -= (int) f2;
                                        Test0729.lArrFld[i17 - 1] = -1832454212L;
                                    case 24:
                                        Test0729.instanceCount = i18;
                                        Test0729.bFld = false;
                                        break;
                                    case 39:
                                        i18 = i19;
                                        break;
                                    case 28:
                                        iArrFld[i17 + 1] = (int) f2;
                                        break;
                                    case 10:
                                        Test0729.lArrFld[i19] %= (Test0729.sFld | 1);
                                    default:
                                        i18 = (int) -8L;
                                }
                            } else {
                                iArrFld[i17 - 1] *= Test0729.iFld;
                            }
                            break;
                        case 109:
                            Test0729.instanceCount <<= i21;
                            break;
                        case 110:
                            iArrFld[i20 - 1] += i19;
                        case 111:
                            dFld = i17;
                            break;
                        case 112:
                            Test0729.instanceCount += Test0729.instanceCount;
                            break;
                        case 113:
                            if (Test0729.bFld) break;
                            break;
                        case 114:
                            iArrFld[i20] <<= Test0729.sFld;
                            break;
                        case 115:
                            iArrFld[i19] += i20;
                        default:
                            i18 -= (int) d2;
                    }
                }
            } while (++i19 < 109);
        }

        FuzzerUtils.out.println("f2 i17 i18 = " + Float.floatToIntBits(f2) + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("d2 fArr fArr1 = " + Double.doubleToLongBits(d2) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));

        FuzzerUtils.out.println("Test0729.instanceCount Test0729.bFld Test0729.byFld = " + Test0729.instanceCount + "," + (Test0729.bFld ?
                1 : 0) + "," + Test0729.byFld);
        FuzzerUtils.out.println("dFld Test0729.iFld Test0729.sFld = " + Double.doubleToLongBits(dFld) + "," + Test0729.iFld + "," +
                Test0729.sFld);
        FuzzerUtils.out.println("Test0729.lArrFld iArrFld = " + FuzzerUtils.checkSum(Test0729.lArrFld) + "," +
                FuzzerUtils.checkSum(iArrFld));

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
