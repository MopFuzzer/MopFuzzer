// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:04 2023
public class Test0472 {

    public static final int N = 400;

    public static long instanceCount = -178L;
    public static float fFld = -101.555F;
    public static int[] iArrFld = new int[N];
    public static long vSmallMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long lMeth1_check_sum = 0;
    public static long lMeth2_check_sum = 0;

    static {
        FuzzerUtils.init(Test0472.iArrFld, 52662);
    }

    public int iFld = -9;
    public int iFld1 = 250;
    public boolean bFld = false;
    public long[][] lArrFld = new long[N][N];

    public static void vSmallMeth(int i, long l, double d) {

        float f1 = 62.310F;
        long[][] lArr = new long[N][N];

        FuzzerUtils.init(lArr, -252L);

        i ^= (int) ((-(-(++f1))) + (f1 * (lArr[(i >>> 1) % N][(i >>> 1) % N] <<= i)));
        vSmallMeth_check_sum += i + l + Double.doubleToLongBits(d) + Float.floatToIntBits(f1) +
                FuzzerUtils.checkSum(lArr);
    }

    public static long lMeth2(long l1, int i5) {

        byte by1 = 48;
        int i6 = -215, i7 = 55724, i8 = 91, i9 = 38, i10 = 221;
        long l2 = -155429084L;
        float f2 = -15.198F;
        boolean b = true;

        i5 = i5;
        i5 = by1;
        i5 |= i5;
        l1 = i5;
        for (i6 = 7; i6 < 191; ++i6) {
            i7 += i6;
            for (i8 = i6; i8 < 9; ++i8) {
                for (l2 = 1; l2 > 1; --l2) {
                    Test0472.iArrFld[i8] <<= i10;
                    Test0472.instanceCount += (80 + (l2 * l2));
                    i10 += (int) f2;
                    i10 += (int) (l2 * Test0472.instanceCount);
                    b = b;
                    i5 = i7;
                    i9 = -3493;
                }
            }
        }
        long meth_res = l1 + i5 + by1 + i6 + i7 + i8 + i9 + l2 + i10 + Float.floatToIntBits(f2) + (b ? 1 : 0);
        lMeth2_check_sum += meth_res;
        return (long) meth_res;
    }

    public static long lMeth1(int i2, int i3) {

        double d1 = -1.64006;
        int i4 = 24, i11 = -244, i12 = -29, i13 = 186;
        boolean b1 = false;

        for (d1 = 17; d1 < 332; ++d1) {
            i4 = (int) ((Test0472.iArrFld[(int) (d1 - 1)]--) + lMeth2(Test0472.instanceCount, i3));
            i3 += (int) -11L;
            if (b1) {
                b1 = b1;
            }
            i3 = (int) Test0472.fFld;
            i11 = 1;
            do {
                Test0472.instanceCount -= i4;
                Test0472.instanceCount = i4;
                for (i12 = i11; 1 > i12; i12++) {
                    Test0472.instanceCount -= Test0472.instanceCount;
                    switch (((i11 % 2) * 5) + 109) {
                        case 111:
                        case 116:
                            b1 = b1;
                            Test0472.iArrFld = Test0472.iArrFld;
                            break;
                        default:
                            Test0472.instanceCount += i3;
                    }
                }
            } while (++i11 < 5);
        }
        long meth_res = i2 + i3 + Double.doubleToLongBits(d1) + i4 + (b1 ? 1 : 0) + i11 + i12 + i13;
        lMeth1_check_sum += meth_res;
        return (long) meth_res;
    }

    public static long lMeth() {

        int i1 = 4, i14 = -29204, i15 = -45277, i16 = 10027, i17 = 61309;
        double d2 = -98.24057;
        byte by2 = -50;

        vSmallMeth(i1, Long.reverseBytes((i1 + i1) >> (-(i1 += i1))), (lMeth1(i1, i1) + Test0472.instanceCount) + i1);
        i14 = 1;
        while (++i14 < 176) {
            for (i15 = 1; 9 > i15; i15++) {
                i17 = 1;
                do {
                    i16 += (i17 - i15);
                    i16 = 13685;
                    d2 *= Test0472.instanceCount;
                    i16 += i14;
                    d2 -= 6131523935816476390L;
                    Test0472.iArrFld[i15 + 1] += i17;
                } while (++i17 < 2);
                Test0472.instanceCount += (-18563L + (i15 * i15));
                Test0472.fFld += 93;
                i16 += (((i15 * i1) + by2) - i14);
                d2 += Test0472.instanceCount;
                Test0472.fFld += i15;
            }
        }
        long meth_res = i1 + i14 + i15 + i16 + i17 + Double.doubleToLongBits(d2) + by2;
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0472 _instance = new Test0472();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        float f = 1.543F, f3 = -1.608F;
        byte by = 8;
        byte[] byArr = new byte[N];
        int i19 = 16731, i20 = 1689, i21 = -51282, i22 = -1, i23 = -6, i24 = -6;
        double d3 = -123.76761;

        FuzzerUtils.init(byArr, (byte) -29);

        f = (--iFld);
        by -= (byte) Test0472.instanceCount;
        for (int smallinvoc = 0; smallinvoc < 728; smallinvoc++)
            vSmallMeth(5, lArrFld[(iFld1 >>> 1) % N][(iFld >>> 1) %
                    N], Double.longBitsToDouble(lMeth()));
        for (int i18 : Test0472.iArrFld) {
            Test0472.instanceCount = i18;
            if (bFld) {
                for (i19 = 63; 2 < i19; i19--) {
                    i20 = (int) f;
                    i21 = 1;
                    while (++i21 < 2) {
                        i20 -= i18;
                        iFld1 += (i21 - iFld1);
                        i20 = (int) d3;
                        bFld = bFld;
                        Test0472.fFld += (4 + (i21 * i21));
                        iFld -= (int) f;
                        i20 |= i20;
                    }
                    iFld += i19;
                }
            } else if (bFld) {
                for (i22 = 2; i22 < 63; ++i22) {
                    i20 -= (int) Test0472.fFld;
                    Test0472.instanceCount *= i18;
                    f3 += iFld;
                    Test0472.iArrFld[(iFld1 >>> 1) % N] -= i20;
                    Test0472.instanceCount >>= iFld1;
                    i23 = (int) Test0472.instanceCount;
                    i24 = 1;
                    while (++i24 < 2) {
                        byArr = byArr;
                        iFld1 = (int) -8L;
                    }
                    iFld = 153;
                }
            }
        }
        i20 >>>= iFld1;
        i20 -= -7;

        FuzzerUtils.out.println("f by i19 = " + Float.floatToIntBits(f) + "," + by + "," + i19);
        FuzzerUtils.out.println("i20 i21 d3 = " + i20 + "," + i21 + "," + Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("i22 i23 f3 = " + i22 + "," + i23 + "," + Float.floatToIntBits(f3));
        FuzzerUtils.out.println("i24 byArr = " + i24 + "," + FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test0472.instanceCount iFld iFld1 = " + Test0472.instanceCount + "," + iFld + "," + iFld1);
        FuzzerUtils.out.println("Test0472.fFld bFld lArrFld = " + Float.floatToIntBits(Test0472.fFld) + "," + (bFld ? 1 : 0) +
                "," + FuzzerUtils.checkSum(lArrFld));
        FuzzerUtils.out.println("Test0472.iArrFld = " + FuzzerUtils.checkSum(Test0472.iArrFld));

        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
        FuzzerUtils.out.println("lMeth2_check_sum: " + lMeth2_check_sum);
        FuzzerUtils.out.println("lMeth1_check_sum: " + lMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test lMeth
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  lMeth1 ->  lMeth1 lMeth mainTest
//DEBUG  lMeth2 ->  lMeth2 lMeth1 lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
