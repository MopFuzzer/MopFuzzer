// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:12 2023
public class Test0776 {

    public static final int N = 400;

    public static volatile long instanceCount = 30427L;
    public static double dFld = 67.56247;
    public static boolean bFld = false;
    public static int iFld = -12;
    public static float fFld = -89.323F;
    public static volatile int iFld1 = 37037;
    public static int[][] iArrFld = new int[N][N];
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long fMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0776.iArrFld, 8);
    }

    public static float fMeth(long l1, int i4, int i5) {

        float f1 = 112.42F, f2 = 103.596F, f3 = 1.1F;
        int i6 = -1;
        int i7 = 35;
        int i8 = -1;
        int[] iArr1 = new int[N];
        boolean b = true;
        double d = 58.33940;

        FuzzerUtils.init(iArr1, -11);

        Test0776.instanceCount -= -59;
        f1 = 1;
        do {
            for (f2 = f1; f2 < 5; ++f2) {
                b = b;
                i6 += (int) d;
                f3 *= 160L;
                i5 += (int) f2;
                for (i7 = 1; i7 > 1; i7 -= 2) {
                    iArr1[(int) (f1)] -= (int) l1;
                    i6 += (-40 + (i7 * i7));
                    Test0776.iArrFld = Test0776.iArrFld;
                    iArr1[(int) (f1)] *= i8;
                }
                i8 -= (int) -1.673F;
            }
            i5 = i4;
            iArr1 = Test0776.iArrFld[(int) (f1 - 1)];
        } while (++f1 < 358);
        long meth_res = l1 + i4 + i5 + Float.floatToIntBits(f1) + Float.floatToIntBits(f2) + i6 + (b ? 1 : 0) +
                Double.doubleToLongBits(d) + Float.floatToIntBits(f3) + i7 + i8 + FuzzerUtils.checkSum(iArr1);
        fMeth_check_sum += meth_res;
        return (float) meth_res;
    }

    public static void vMeth1(int i2, float f, int i3) {

        int i9 = -6;
        int i10 = 14429;
        int i11 = -8;
        int i12 = -24852;
        int i13 = 67;
        int i14 = 41878;
        int[] iArr = new int[N];
        byte by = 98;
        short s = 20619;

        FuzzerUtils.init(iArr, 40);

        iArr[(-5698 >>> 1) % N] = i3;
        iArr[(i2 >>> 1) % N] -= (int) fMeth(Test0776.instanceCount, i2, i3);
        for (i9 = 6; i9 < 137; ++i9) {
            switch ((i9 % 8) + 77) {
                case 77:
                    Test0776.dFld = Test0776.instanceCount;
                    break;
                case 78:
                    for (i11 = i9; i11 < 12; i11++) {
                        if (Test0776.bFld) break;
                    }
                    if (Test0776.bFld) {
                        i3 ^= -2;
                        i2 <<= i11;
                    }
                    for (i13 = i9; i13 < 12; ++i13) {
                        i3 -= i10;
                        f -= i2;
                        i12 *= i12;
                        i3 -= (int) f;
                    }
                    break;
                case 79:
                    i14 &= (int) Test0776.instanceCount;
                    break;
                case 80:
                    Test0776.instanceCount <<= Test0776.instanceCount;
                    break;
                case 81:
                    by -= (byte) Test0776.instanceCount;
                case 82:
                case 83:
                    i3 = s;
                    break;
                case 84:
                    if (Test0776.bFld) continue;
                    break;
                default:
                    Test0776.instanceCount = i10;
            }
        }
        vMeth1_check_sum += i2 + Float.floatToIntBits(f) + i3 + i9 + i10 + i11 + i12 + i13 + i14 + by + s +
                FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(long l) {

        int i = 23965, i1 = -11, i15 = 51314, i16 = 5;
        float f4 = 121.481F;
        byte by1 = -105;
        byte[] byArr = new byte[N];
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, -444679089L);
        FuzzerUtils.init(byArr, (byte) 24);

        for (i = 14; 313 > i; i++) {
            vMeth1(i1, f4, i);
            i1 += i;
            l += (((i * i) + i1) - i1);
            Test0776.iArrFld[i][i] = i;
            l = i;
            Test0776.instanceCount += (long) -34.954;
            lArr[i - 1] -= (long) f4;
        }
        i1 = by1;
        try {
            i1 -= 61868;
            for (i15 = 16; i15 < 353; ++i15) {
                byArr[i15 - 1] *= (byte) l;
                i16 = (int) f4;
                Test0776.instanceCount = i16;
            }
        } catch (NegativeArraySizeException exc1) {
            lArr[(-178 >>> 1) % N] = -3011;
        }
        vMeth_check_sum += l + i + i1 + Float.floatToIntBits(f4) + by1 + i15 + i16 + FuzzerUtils.checkSum(lArr) +
                FuzzerUtils.checkSum(byArr);
    }

    public static void main(String[] strArr) {

        try {
            Test0776 _instance = new Test0776();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        double d1 = -88.97384;
        int i17 = -56945, i18 = 90, i19 = 12, i20 = -229, i21 = 29270, i22 = -41360, i23 = 226;
        long l2 = 128L;

        vMeth(Test0776.instanceCount);
        for (d1 = 15; d1 < 379; d1++) {
            Test0776.iArrFld[(int) (d1 - 1)][(int) (d1 + 1)] = i17;
        }
        i17 %= (int) 4110582673781211973L;
        for (i18 = 20; 358 > i18; i18++) {
            for (i20 = 4; i20 < 74; i20++) {
                for (i22 = i18; i22 < 2; ++i22) {
                    Test0776.instanceCount += (i22 * i22);
                    i17 = i19;
                    Test0776.iFld |= (int) Test0776.instanceCount;
                    Test0776.iArrFld[i22 + 1] = Test0776.iArrFld[i22 + 1];
                    Test0776.fFld += (i22 * i18);
                    i23 += (-52507 + (i22 * i22));
                    Test0776.iArrFld[i20 + 1][i18] /= (int) (i23 | 1);
                    i23 -= i17;
                    Test0776.instanceCount += (i22 ^ Test0776.instanceCount);
                    i23 = i21;
                }
                Test0776.instanceCount += i20;
                Test0776.iFld += (((i20 * Test0776.iFld1) + Test0776.instanceCount) - i23);
                l2 -= Test0776.iFld1;
                l2 -= l2;
                i17 *= (int) Test0776.fFld;
                i19 += i20;
                Test0776.dFld = i23;
            }
            Test0776.iArrFld[i18 - 1][i18] = 58985;
            switch (((i22 >>> 1) % 1) + 102) {
                case 102:
                    l2 -= i18;
                    Test0776.iArrFld[i18][i18 - 1] <<= Test0776.iFld;
                    Test0776.dFld -= Test0776.iFld;
                    i23 = Test0776.iFld;
            }
        }

        FuzzerUtils.out.println("d1 i17 i18 = " + Double.doubleToLongBits(d1) + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 l2 = " + i22 + "," + i23 + "," + l2);

        FuzzerUtils.out.println("Test0776.instanceCount Test0776.dFld Test0776.bFld = " + Test0776.instanceCount + "," +
                Double.doubleToLongBits(Test0776.dFld) + "," + (Test0776.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0776.iFld Test0776.fFld Test0776.iFld1 = " + Test0776.iFld + "," + Float.floatToIntBits(Test0776.fFld)
                + "," + Test0776.iFld1);
        FuzzerUtils.out.println("Test0776.iArrFld = " + FuzzerUtils.checkSum(Test0776.iArrFld));

        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  fMeth ->  fMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
