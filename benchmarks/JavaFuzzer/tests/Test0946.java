// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:17 2023
public class Test0946 {

    public static final int N = 400;

    public static volatile long instanceCount = -3304316271L;
    public static int iFld = 8;
    public static volatile short sFld = -5617;
    public static boolean bFld = false;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth2_check_sum = 0;
    public volatile long[][] lArrFld = new long[N][N];

    public static int iMeth2(int i10, byte by1) {

        int i11 = 63, i12 = 34727, i13 = -60850, i14 = -38795;
        float f2 = -97.789F;
        double d2 = 2.125961;

        Test0946.iFld += i10;
        for (i11 = 2; i11 < 289; i11++) {
            Test0946.iFld = i12;
            Test0946.instanceCount *= (long) 20.82715;
        }
        for (i13 = 9; i13 < 197; ++i13) {
            Test0946.instanceCount *= Test0946.instanceCount;
            if (Test0946.bFld) break;
            if (Test0946.bFld) break;
            i12 <<= (int) Test0946.instanceCount;
            i12 += (-30230 + (i13 * i13));
            f2 += i11;
            i14 += (int) d2;
            Test0946.iFld += (i13 * i13);
        }
        Test0946.iFld += (int) d2;
        Test0946.iFld = Test0946.iFld;
        long meth_res = i10 + by1 + i11 + i12 + i13 + i14 + Float.floatToIntBits(f2) + Double.doubleToLongBits(d2);
        iMeth2_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth() {

        int i8 = 16;
        int i9 = 1;
        int[] iArr2 = new int[N];
        byte by2 = -59;
        double d3 = 106.99314;
        float f3 = -1.546F;

        FuzzerUtils.init(iArr2, -44);

        for (i8 = 7; i8 < 172; ++i8) {
            i9 += (((i8 * i8) + i8) - i8);
            i9 %= (int) (((iArr2[i8 - 1] * iMeth2(i8, by2)) * Test0946.instanceCount) | 1);
            if (i9 != 0) {
                vMeth_check_sum += i8 + i9 + by2 + Double.doubleToLongBits(d3) + Float.floatToIntBits(f3) +
                        FuzzerUtils.checkSum(iArr2);
                return;
            }
            if (Test0946.bFld) break;
        }
        i9 += (int) d3;
        i9 = (int) f3;
        iArr2[(Test0946.iFld >>> 1) % N] /= (int) (i9 | 1);
        f3 = i9;
        vMeth_check_sum += i8 + i9 + by2 + Double.doubleToLongBits(d3) + Float.floatToIntBits(f3) +
                FuzzerUtils.checkSum(iArr2);
    }

    public static int iMeth1(int i6, long l, byte by) {

        float f1 = -2.633F;
        int i7 = 158;
        int i15 = 22027;
        int i16 = -1;
        int i17 = -34002;
        int i18 = -46902;
        int i19 = -73;
        int i20 = -12;
        int[] iArr3 = new int[N];
        byte[] byArr = new byte[N];

        FuzzerUtils.init(byArr, (byte) 75);
        FuzzerUtils.init(iArr3, 7);

        for (f1 = 297; 15 < f1; f1 -= 2) {
            if (true) {
                vMeth();
                i6 += (int) (((f1 * i7) + i6) - i6);
            } else if (Test0946.bFld) {
                l &= -11338;
            } else {
                byArr[(int) (f1 + 1)] = (byte) -11030;
                iArr3[(int) (f1)] -= (int) Test0946.instanceCount;
                for (i15 = 1; i15 < 11; ++i15) {
                    for (i17 = 1; i17 < 2; i17++) {
                        i16 = i16;
                    }
                    Test0946.iFld *= i18;
                    for (i19 = 1; i19 < 2; ++i19) {
                        i20 = by;
                        if (i20 != 0) {
                        }
                        Test0946.iFld += (i19 ^ Test0946.instanceCount);
                    }
                }
            }
        }
        long meth_res = i6 + l + by + Float.floatToIntBits(f1) + i7 + i15 + i16 + i17 + i18 + i19 + i20 +
                FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr3);
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0946 _instance = new Test0946();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public int iMeth(double d, int i5) {

        int[] iArr1 = new int[N];

        FuzzerUtils.init(iArr1, -162);

        Test0946.iFld += iArr1[(Test0946.iFld >>> 1) % N];
        long meth_res = Double.doubleToLongBits(d) + i5 + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i = 29;
        int i1 = 14600;
        int i2 = -5;
        int i3 = 63416;
        int i4 = 237;
        int i21 = -4;
        int i22 = -18753;
        int[] iArr = new int[N];
        float f = 0.773F;
        double d1 = 50.122594;
        byte by3 = 1;
        byte[] byArr1 = new byte[N];

        FuzzerUtils.init(iArr, -253);
        FuzzerUtils.init(byArr1, (byte) 22);

        Test0946.instanceCount = (Test0946.iFld << (Math.min(Test0946.iFld, Test0946.iFld) * Math.min(Test0946.iFld, Test0946.iFld)));
        for (i = 7; i < 161; ++i) {
            i2 = 1;
            while ((i2 += 2) < 163) {
                for (i3 = 1; i3 < 3; ++i3) {
                    Test0946.iFld += (i3 ^ Test0946.iFld);
                    Test0946.iFld = (int) ((-(iArr[i3 + 1] *= (int) Test0946.instanceCount)) - (-14159L - i1));
                    f += (i3 * i3);
                    lArrFld[i3 + 1][i2] = (long) -2.70020;
                    i4 -= (int) (Test0946.sFld * (Test0946.instanceCount <<= iMeth(d1, -15664)));
                    i4 += (i3 ^ i4);
                }
                Test0946.instanceCount -= -6;
                iArr[i2 - 1] = (int) Test0946.instanceCount;
                i4 += (int) f;
                i4 += (i2 * f);
                i1 -= Test0946.iFld;
                i1 |= (int) (i - (Test0946.iFld += (int) (f + 32991L)));
                switch (((i % 1) * 5) + 102) {
                    case 105:
                        iArr[i - 1] = (int) (Test0946.iFld + ((-(f - Test0946.iFld)) - (--lArrFld[i2][i2 - 1])));
                        break;
                    default:
                        iMeth1(i4, 4640483016785547596L, by3);
                        for (i21 = 1; i21 < 3; i21 += 2) {
                            byArr1[i] -= (byte) i2;
                            iArr[i21] = i2;
                            by3 += (byte) Test0946.instanceCount;
                            i1 += (int) (24L + (i21 * i21));
                            i1 += i21;
                            i22 = (int) Test0946.instanceCount;
                            Test0946.instanceCount += (112 + (i21 * i21));
                            iArr[i21] = i;
                            Test0946.instanceCount = Test0946.iFld;
                            i4 -= (int) f;
                        }
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i4 f = " + i3 + "," + i4 + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("d1 by3 i21 = " + Double.doubleToLongBits(d1) + "," + by3 + "," + i21);
        FuzzerUtils.out.println("i22 iArr byArr1 = " + i22 + "," + FuzzerUtils.checkSum(iArr) + "," +
                FuzzerUtils.checkSum(byArr1));

        FuzzerUtils.out.println("Test0946.instanceCount Test0946.iFld Test0946.sFld = " + Test0946.instanceCount + "," + Test0946.iFld +
                "," + Test0946.sFld);
        FuzzerUtils.out.println("Test0946.bFld lArrFld = " + (Test0946.bFld ? 1 : 0) + "," + FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("iMeth2_check_sum: " + iMeth2_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 mainTest
//DEBUG  vMeth ->  vMeth iMeth1 mainTest
//DEBUG  iMeth2 ->  iMeth2 vMeth iMeth1 mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
