// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:15 2023
public class Test0871 {

    public static final int N = 400;

    public static long instanceCount = 14L;
    public static short sFld = 14717;
    public static int[] iArrFld = new int[N];
    public static long byMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0871.iArrFld, 0);
    }

    public double dFld = 1.107650;

    public static int iMeth(int i5) {

        int i6 = -5, i7 = -11, i8 = -39392, i9 = -43539, i10 = -23056;
        float f3 = 7.292F;
        double d = -109.115163;
        byte by = -39;

        i6 = 175;
        while (--i6 > 0) {
            i5 += i6;
            Test0871.instanceCount = (long) f3;
            i5 *= i5;
            i7 = 1;
            while (++i7 < 9) {
                d *= d;
                Test0871.instanceCount += i5;
                for (i8 = 1; i8 < 1; i8++) {
                    i5 = Test0871.sFld;
                    i5 = i9;
                    f3 -= by;
                    Test0871.iArrFld[i8 - 1] >>= i5;
                    Test0871.instanceCount += (i8 ^ i7);
                    i10 += (int) Test0871.instanceCount;
                }
                Test0871.instanceCount = -2;
            }
        }
        long meth_res = i5 + i6 + Float.floatToIntBits(f3) + i7 + Double.doubleToLongBits(d) + i8 + i9 + by + i10;
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth(int i4) {

        float f2 = -59.233F;
        boolean b = false;
        long l1 = 2798906846L;
        long l2 = -2576640618L;
        long[] lArr = new long[N];
        int i11 = 39267, i12 = -228, i13 = -19991;
        double d1 = -1.97333;

        FuzzerUtils.init(lArr, 928307626L);

        f2 *= Math.abs(Integer.reverseBytes(iMeth(-1)));
        b = b;
        for (l1 = 6; l1 < 183; ++l1) {
            i4 += (int) (((l1 * i4) + l1) - i11);
            i11 += (int) f2;
            i11 *= i11;
        }
        i4 *= (int) 149L;
        for (l2 = 3; l2 < 306; l2++) {
            for (d1 = 5; d1 > 1; d1 -= 2) {
                Test0871.instanceCount <<= -13;
                b = b;
                if (b) {
                    lArr[(int) (d1)] -= i12;
                }
                i4 = i4;
                i12 += -56723;
            }
        }
        vMeth_check_sum += i4 + Float.floatToIntBits(f2) + (b ? 1 : 0) + l1 + i11 + l2 + i12 +
                Double.doubleToLongBits(d1) + i13 + FuzzerUtils.checkSum(lArr);
    }

    public static byte byMeth(long l, int i3, float f1) {

        int i14 = 2, i15 = 233, i16 = 35278, i17 = 19, i18 = 37972, i19 = -152, i20 = -60248;
        byte by1 = -119;
        double d2 = 103.16201;
        long[] lArr1 = new long[N];

        FuzzerUtils.init(lArr1, 8L);

        vMeth(-21);
        i3 -= (int) l;
        for (i14 = 307; 2 < i14; --i14) {
            lArr1[i14 - 1] *= i14;
        }
        for (i16 = 3; 260 > i16; i16++) {
            i17 -= i3;
            lArr1[i16 + 1] *= l;
            for (i18 = 6; i18 > 1; i18 -= 3) {
                i20 = 1;
                do {
                    i3 <<= i18;
                    i19 += by1;
                    lArr1[i20] -= i3;
                    by1 += (byte) (166 + (i20 * i20));
                    d2 += l;
                    i19 >>= 19;
                } while (++i20 < 6);
            }
        }
        long meth_res = l + i3 + Float.floatToIntBits(f1) + i14 + i15 + i16 + i17 + i18 + i19 + i20 + by1 +
                Double.doubleToLongBits(d2) + FuzzerUtils.checkSum(lArr1);
        byMeth_check_sum += meth_res;
        return (byte) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0871 _instance = new Test0871();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = 5, i1 = 189, i21 = 63391, i22 = 36, i23 = -37740, i24 = -40091, i25 = -36072, i26 = -44, i27 = -53310;
        float f = 44.146F;
        short s = -13545;
        byte by2 = -65;
        boolean b1 = false;
        double d3 = -1.95277, d4 = 2.90464;

        for (i = 9; i < 150; ++i) {
            i1 *= (int) (((f - s) + byMeth(-32L, i, f)) + by2);
            i1 *= (int) f;
            Test0871.iArrFld[i - 1] = -50;
            for (i21 = 4; i21 < 178; i21++) {
                i23 = 1;
                do {
                    Test0871.instanceCount >>= i1;
                    Test0871.iArrFld[i21] -= i;
                    i22 += (((i23 * i1) + Test0871.instanceCount) - by2);
                    i22 += (int) Test0871.instanceCount;
                    f *= Test0871.instanceCount;
                    i22 = (int) Test0871.instanceCount;
                    f += (247 + (i23 * i23));
                    i22 += i22;
                } while (++i23 < 2);
                for (i24 = 1; i24 < 2; i24++) {
                    i22 = 42017;
                    f = (float) dFld;
                    i22 -= 97;
                    i1 = i22;
                    b1 = b1;
                    i1 += i24;
                    i26 += (((i24 * i21) + Test0871.instanceCount) - Test0871.instanceCount);
                    by2 = (byte) Test0871.instanceCount;
                }
                Test0871.iArrFld[i21 - 1] = i23;
            }
        }
        i26 |= i23;
        for (d3 = 1; d3 < 202; ++d3) {
            Test0871.iArrFld[(int) (d3 - 1)] = by2;
            i26 -= i23;
            d4 *= f;
            Test0871.instanceCount += (long) (d3 * d3);
        }

        FuzzerUtils.out.println("i i1 f = " + i + "," + i1 + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("s by2 i21 = " + s + "," + by2 + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 b1 i26 = " + i25 + "," + (b1 ? 1 : 0) + "," + i26);
        FuzzerUtils.out.println("d3 i27 d4 = " + Double.doubleToLongBits(d3) + "," + i27 + "," +
                Double.doubleToLongBits(d4));

        FuzzerUtils.out.println("Test0871.instanceCount Test0871.sFld dFld = " + Test0871.instanceCount + "," + Test0871.sFld + "," +
                Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("Test0871.iArrFld = " + FuzzerUtils.checkSum(Test0871.iArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("byMeth_check_sum: " + byMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  byMeth ->  byMeth mainTest
//DEBUG  vMeth ->  vMeth byMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth byMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
