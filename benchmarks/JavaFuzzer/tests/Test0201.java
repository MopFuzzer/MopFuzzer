// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:58 2023
public class Test0201 {

    public static final int N = 400;

    public static long instanceCount = -289781132503028336L;
    public static int iFld = 51358;
    public static double dFld = 0.128786;
    public static float fFld = 0.516F;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public int iFld1 = 3328;
    public int[] iArrFld = new int[N];

    public static void vMeth1() {

        float f = 2.987F, f1 = 57.834F;
        int i4 = -6258;
        int i5 = -7780;
        int i6 = 124;
        int i7 = -10390;
        int i8 = 2;
        int[] iArr = new int[N];

        FuzzerUtils.init(iArr, -61022);

        for (f = 2; f < 346; f++) {
            for (i5 = 1; i5 < 5; ++i5) {
                i4 <<= i6;
                i6 = i5;
                Test0201.iFld >>= (int) Test0201.instanceCount;
                f1 += i5;
                Test0201.instanceCount = (long) 1.1001F;
                iArr[i5 + 1] ^= i6;
                for (i7 = 1; i7 < 2; i7++) {
                    Test0201.instanceCount &= 10;
                    Test0201.iFld <<= (int) Test0201.instanceCount;
                    iArr[(int) (f + 1)] -= (int) f;
                    i6 += i5;
                }
            }
            i6 += i5;
            i8 -= (int) Test0201.instanceCount;
        }
        vMeth1_check_sum += Float.floatToIntBits(f) + i4 + i5 + i6 + Float.floatToIntBits(f1) + i7 + i8 +
                FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(double d, int i2, int i3) {


        vMeth1();
        long meth_res = Double.doubleToLongBits(d) + i2 + i3;
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth(int i, long l, int i1) {

        int i9 = 5;
        int i10 = -71;
        int i11 = -99;
        int[] iArr1 = new int[N];

        FuzzerUtils.init(iArr1, -12);

        i %= (int) (iMeth(Test0201.dFld, Test0201.iFld, i1) | 1);
        i9 = 1;
        while (++i9 < 367) {
            Test0201.iFld += Test0201.iFld;
            Test0201.iFld -= (int) Test0201.fFld;
            iArr1[i9] |= Test0201.iFld;
            Test0201.instanceCount &= Test0201.instanceCount;
            Test0201.instanceCount = i9;
            i += (50711 + (i9 * i9));
            iArr1[i9 - 1] += (int) Test0201.instanceCount;
            for (i10 = 1; i10 < 5; i10++) {
                Test0201.dFld -= Test0201.dFld;
                l = -36286;
            }
        }
        Test0201.fFld = 6;
        Test0201.dFld = i10;
        Test0201.fFld -= i11;
        vMeth_check_sum += i + l + i1 + i9 + i10 + i11 + FuzzerUtils.checkSum(iArr1);
    }

    public static void main(String[] strArr) {

        try {
            Test0201 _instance = new Test0201();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        byte by = 43;
        int i12 = -6, i13 = 49275, i14 = -132, i15 = -57, i16 = 217, i17 = -243, i18 = 48634, i19 = 2, i20 = -13, i21 = 84, i22 = -47170,
                i23 = 26619, i24 = -175;
        boolean b = false;
        long[][] lArr = new long[N][N];

        FuzzerUtils.init(lArr, 71L);

        vMeth(Test0201.iFld, -2860843506L, Test0201.iFld);
        Test0201.iFld -= (int) Test0201.instanceCount;
        by *= (byte) Test0201.dFld;
        Test0201.iFld *= Test0201.iFld;
        for (i12 = 15; i12 < 280; ++i12) {
            i14 = 95;
            do {
                Test0201.dFld *= i15;
                i15 *= (int) Test0201.fFld;
                i15 += i14;
                for (i16 = i12; 1 > i16; ++i16) {
                    i15 += i16;
                    i13 += i16;
                    i17 >>= (int) Test0201.instanceCount;
                }
                lArr[i14][i14] = 3L;
                Test0201.instanceCount += Test0201.instanceCount;
                iArrFld[i12] -= i16;
                Test0201.instanceCount += (long) 1.903F;
            } while (--i14 > 0);
            i15 = i14;
            Test0201.iFld = (int) 1.122859;
            Test0201.dFld = i15;
            i18 += (((i12 * i16) + Test0201.instanceCount) - Test0201.fFld);
        }
        for (i19 = 13; i19 < 306; ++i19) {
            i15 = (int) Test0201.instanceCount;
            Test0201.instanceCount = Test0201.instanceCount;
            for (i21 = i19; i21 < 86; i21 += 2) {
                for (i23 = 1; i23 < 1; i23++) {
                    iFld1 >>>= (int) Test0201.instanceCount;
                    if (b) continue;
                }
                i24 <<= i15;
                iFld1 *= (int) Test0201.instanceCount;
            }
        }

        FuzzerUtils.out.println("by i12 i13 = " + by + "," + i12 + "," + i13);
        FuzzerUtils.out.println("i14 i15 i16 = " + i14 + "," + i15 + "," + i16);
        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 b = " + i23 + "," + i24 + "," + (b ? 1 : 0));
        FuzzerUtils.out.println("lArr = " + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test0201.instanceCount Test0201.iFld Test0201.dFld = " + Test0201.instanceCount + "," + Test0201.iFld +
                "," + Double.doubleToLongBits(Test0201.dFld));
        FuzzerUtils.out.println("Test0201.fFld iFld1 iArrFld = " + Float.floatToIntBits(Test0201.fFld) + "," + iFld1 + "," +
                FuzzerUtils.checkSum(iArrFld));

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
