// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:17 2023
public class Test0964 {

    public static final int N = 400;

    public static long instanceCount = 1219768907L;
    public static float fFld = 0.580F;
    public static boolean bFld = false;
    public static volatile byte byFld = -73;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public short sFld = 7066;
    public long[][] lArrFld = new long[N][N];

    public static void vMeth1(int i2) {

        int i3 = -12146;
        short s = 26310;

        i3 = 1;
        while (++i3 < 210) {
            Test0964.instanceCount = (i2--);
            i2 += (((i3 * i2) + i2) - s);
        }
        vMeth1_check_sum += i2 + i3 + s;
    }

    public static int iMeth() {

        int i4 = -6;
        int i5 = 44;
        int i6 = -14;
        int i7 = 9;
        int i8 = 12;
        int[] iArr = new int[N];
        short s1 = 5452;
        double d = 91.71937;
        float f2 = 0.175F;

        FuzzerUtils.init(iArr, 14);

        for (i4 = 11; i4 < 293; ++i4) {
            boolean b = true;
            iArr[i4 - 1] = i4;
            vMeth1(i5);
            i5 = s1;
            Test0964.instanceCount += 160L;
            b = true;
            try {
                iArr[i4 - 1] = (i4 / i5);
                i5 = (65801578 % i5);
                i5 = (i4 / iArr[i4 - 1]);
            } catch (ArithmeticException a_e) {
            }
            for (i6 = 6; i6 > 1; --i6) {
                byte by = 112;
                switch ((i6 % 10) + 96) {
                    case 96:
                        i8 = 1;
                        while (++i8 < 2) {
                            float f1 = 1.991F;
                            i5 += (int) (16024L + (i8 * i8));
                            iArr[i4] = i8;
                            i5 <<= -6;
                            Test0964.instanceCount += (long) f1;
                        }
                        break;
                    case 97:
                        d *= -2L;
                        break;
                    case 98:
                        iArr[i4 - 1] = i8;
                        break;
                    case 99:
                        i7 += i6;
                        break;
                    case 100:
                        iArr[i6] /= 3;
                    case 101:
                        Test0964.instanceCount = by;
                        break;
                    case 102:
                    case 103:
                        i5 <<= 181;
                    case 104:
                        f2 += (i6 - Test0964.instanceCount);
                    case 105:
                        Test0964.instanceCount += i8;
                }
            }
        }
        long meth_res = i4 + i5 + s1 + i6 + i7 + i8 + Double.doubleToLongBits(d) + Float.floatToIntBits(f2) +
                FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth() {

        int i = 68, i1 = 28166, i9 = -133, i10 = -14;
        double d1 = 2.67268, d2 = 28.28680;

        for (i = 15; 265 > i; i++) {
            vMeth1(iMeth());
            d1 += i;
            for (i9 = 7; 1 < i9; i9 -= 3) {
                d1 = Test0964.fFld;
                i10 = i10;
                if (true) continue;
                if (i1 != 0) {
                    vMeth_check_sum += i + i1 + Double.doubleToLongBits(d1) + i9 + i10 + Double.doubleToLongBits(d2);
                    return;
                }
                i10 += (i9 | i10);
                if (false) {
                    i1 = i9;
                    i1 -= i;
                    d2 *= Test0964.instanceCount;
                } else if (Test0964.bFld) {
                    i1 = i1;
                    if (false) break;
                }
            }
        }
        vMeth_check_sum += i + i1 + Double.doubleToLongBits(d1) + i9 + i10 + Double.doubleToLongBits(d2);
    }

    public static void main(String[] strArr) {

        try {
            Test0964 _instance = new Test0964();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        float f = 36.16F, f3 = 0.151F;
        int i11 = -12;
        int i12 = 4278;
        int i13 = -246;
        int i14 = 10;
        int i15 = -135;
        int[][] iArr1 = new int[N][N];
        double d3 = 2.56467;
        byte[] byArr = new byte[N];

        FuzzerUtils.init(iArr1, -35488);
        FuzzerUtils.init(byArr, (byte) -13);

        f = 1;
        while (++f < 336) {
            vMeth();
            i11 += (int) f;
            d3 -= f;
            Test0964.fFld = Test0964.instanceCount;
            iArr1[(int) (f)][(int) (f)] = i11;
            Test0964.instanceCount -= i11;
            Test0964.instanceCount = i11;
            i11 += (int) (f * i11);
            iArr1[(int) (f)][(int) (f)] -= i11;
            for (i12 = 75; i12 > 2; i12 -= 2) {
                switch (((i12 >>> 1) % 8) + 75) {
                    case 75:
                        switch ((int) ((f % 6) + 113)) {
                            case 113:
                                Test0964.byFld = (byte) Test0964.fFld;
                                i13 -= (int) d3;
                                iArr1[(int) (f)][i12 - 1] >>= i13;
                                switch ((int) (((f % 5) * 5) + 52)) {
                                    case 58:
                                        Test0964.fFld += (i12 * i11);
                                        lArrFld[i12][i12] = i13;
                                        i11 += i12;
                                        break;
                                    case 54:
                                        i11 = i12;
                                        break;
                                    case 70:
                                        i11 %= (int) (Test0964.byFld | 1);
                                        i13 %= -12988;
                                        Test0964.instanceCount <<= i13;
                                        break;
                                    case 60:
                                        i11 += (int) d3;
                                    case 61:
                                        iArr1[i12][i12 - 1] = i13;
                                        i13 *= (int) d3;
                                }
                                break;
                            case 114:
                                for (i14 = 1; i14 < 3; ++i14) {
                                    i11 = (int) d3;
                                    i13 -= (int) Test0964.fFld;
                                }
                            case 115:
                                iArr1[i12 - 1][i12] *= sFld;
                                break;
                            case 116:
                            case 117:
                                i11 >>= i12;
                                break;
                            case 118:
                                if (Test0964.bFld) break;
                            default:
                                Test0964.fFld = i11;
                        }
                        break;
                    case 76:
                        Test0964.instanceCount = Test0964.instanceCount;
                    case 77:
                        i11 += i12;
                        break;
                    case 78:
                        iArr1[i12][i12 - 1] = i13;
                        break;
                    case 79:
                        Test0964.byFld %= (byte) (i15 | 1);
                        break;
                    case 80:
                        f3 -= Test0964.instanceCount;
                        break;
                    case 81:
                        i11 = i13;
                        break;
                    case 82:
                        byArr[i12 - 1] = Test0964.byFld;
                        break;
                }
            }
        }

        FuzzerUtils.out.println("f i11 d3 = " + Float.floatToIntBits(f) + "," + i11 + "," +
                Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("i12 i13 i14 = " + i12 + "," + i13 + "," + i14);
        FuzzerUtils.out.println("i15 f3 iArr1 = " + i15 + "," + Float.floatToIntBits(f3) + "," +
                FuzzerUtils.checkSum(iArr1));
        FuzzerUtils.out.println("byArr = " + FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test0964.instanceCount Test0964.fFld Test0964.bFld = " + Test0964.instanceCount + "," +
                Float.floatToIntBits(Test0964.fFld) + "," + (Test0964.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0964.byFld sFld lArrFld = " + Test0964.byFld + "," + sFld + "," +
                FuzzerUtils.checkSum(lArrFld));

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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest iMeth
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}