// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:12 2023
public class Test0761 {

    public static final int N = 400;

    public static long instanceCount = -129L;
    public static byte byFld = 84;
    public static float fFld = -42.540F;
    public static int[] iArrFld = new int[N];
    public static byte[] byArrFld = new byte[N];
    public static boolean[] bArrFld = new boolean[N];
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0761.iArrFld, 41574);
        FuzzerUtils.init(Test0761.byArrFld, (byte) -27);
        FuzzerUtils.init(Test0761.bArrFld, false);
    }

    public static int iMeth1() {

        int i7 = 25588, i8 = -123, i9 = 17743, i10 = -50555, i11 = 230;
        float f = 0.476F, f1 = -52.818F;
        byte by = -53;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, -2845372708L);

        for (i7 = 6; 189 > i7; i7++) {
            f -= Test0761.instanceCount;
            f += (45 + (i7 * i7));
            by >>= (byte) 4064;
            if (i7 != 0) {
            }
            Test0761.instanceCount = 95L;
            by = (byte) 49;
            i8 -= (int) Test0761.instanceCount;
            for (i9 = 1; i9 < 9; ++i9) {
                short s3 = -17232;
                lArr[i7] >>= -193L;
                i10 >>>= (int) Test0761.instanceCount;
                s3 += (short) (i9 - i10);
                for (f1 = 1; f1 < 2; ++f1) {
                    i8 += i10;
                    i8 <<= i9;
                }
            }
        }
        long meth_res = i7 + i8 + Float.floatToIntBits(f) + by + i9 + i10 + Float.floatToIntBits(f1) + i11 +
                FuzzerUtils.checkSum(lArr);
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public static int iMeth(short s1, short s2) {

        int i1 = -55, i2 = 106, i3 = -50772, i4 = -116, i5 = -68, i6 = -57982;
        double d = 103.45788;
        double[] dArr = new double[N];
        boolean b1 = false;

        FuzzerUtils.init(dArr, 1.76574);

        for (i1 = 19; 335 > i1; i1++) {
            if (b1) {
                for (i3 = 1; i3 < 5; ++i3) {
                    for (i5 = 2; i5 > 1; i5 -= 2) {
                        Test0761.iArrFld[i5] *= (-(-i4));
                        dArr[i1] -= i5;
                        i2 += (int) Float.intBitsToFloat(i4 = (Test0761.iArrFld[i5 + 1]++));
                        d = ((iMeth1() - -21448) / (Test0761.instanceCount | 1));
                    }
                    Test0761.iArrFld = Test0761.iArrFld;
                    i6 = -37944;
                }
                Test0761.iArrFld[i1 - 1] -= i6;
                Test0761.instanceCount = Test0761.instanceCount;
            } else if (b1) {
                Test0761.iArrFld[i1] = (int) Test0761.instanceCount;
                Test0761.iArrFld[i1] >>= i2;
                Test0761.iArrFld[i1 - 1] = 63366;
            } else if (b1) {
                i6 <<= i6;
            }
        }
        long meth_res = s1 + s2 + i1 + i2 + i3 + i4 + i5 + i6 + Double.doubleToLongBits(d) + (b1 ? 1 : 0) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth(boolean b, short s, long l1) {

        int i12 = -5641, i13 = 176, i14 = -63246, i15 = 3963, i16 = 5, i17 = 0, i18 = 49840, i19 = -7, i20 = 165;
        short s4 = 5259;

        l1 >>= (iMeth((short) (-8195), s) + i12);
        for (i13 = 4; i13 < 302; ++i13) {
            Test0761.byFld = (byte) i13;
        }
        Test0761.fFld *= i13;
        for (i15 = 3; i15 < 211; ++i15) {
            Test0761.iArrFld[i15 + 1] = (int) -86695100465011730L;
            for (i17 = i15; i17 < 8; i17++) {
                for (i19 = i17; 1 > i19; i19++) {
                    i16 = s4;
                    switch (((11 >>> 1) % 5) + 7) {
                        case 7:
                            i16 += (((i19 * i12) + Test0761.fFld) - i12);
                            i18 -= i20;
                            Test0761.instanceCount += (((i19 * i15) + i19) - i13);
                            break;
                        case 8:
                            if (false) break;
                            l1 = Test0761.instanceCount;
                            break;
                        case 9:
                        case 10:
                            i16 = (int) Test0761.instanceCount;
                            break;
                        case 11:
                            i20 >>>= (int) l1;
                            break;
                    }
                }
            }
        }
        vMeth_check_sum += (b ? 1 : 0) + s + l1 + i12 + i13 + i14 + i15 + i16 + i17 + i18 + i19 + i20 + s4;
    }

    public static void main(String[] strArr) {

        try {
            Test0761 _instance = new Test0761();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        long l = 796510694L;
        long l2 = 4L;
        long[] lArr1 = new long[N];
        int i = -60, i21 = 123, i22 = 56561, i23 = 63173, i24 = 7, i26 = 31824, i27 = 35528, i28 = 23905, i29 = -9169;
        boolean b2 = true;
        short s5 = 32430;
        double d1 = -1.17415;

        FuzzerUtils.init(lArr1, -3L);

        for (l = 2; l < 135; ++l) {
            vMeth(b2, (short) (-13536), -9L);
        }
        i = i;
        for (i21 = 2; i21 < 237; i21++) {
            lArr1[i21] -= 4;
        }
        for (i23 = 7; i23 < 207; i23++) {
            Test0761.byFld <<= (byte) i21;
            Test0761.instanceCount = 39185;
            s5 = (short) i23;
        }
        for (int i25 : Test0761.iArrFld) {
            for (i26 = 1; i26 < 63; i26++) {
                Test0761.fFld += i21;
                i28 = 1;
                do {
                    Test0761.fFld += ((long) i28 ^ (long) Test0761.instanceCount);
                    Test0761.byFld += (byte) i28;
                    s5 += (short) i22;
                    Test0761.fFld += i28;
                    d1 = i27;
                    l2 += i28;
                } while (++i28 < 2);
                Test0761.byArrFld = Test0761.byArrFld;
                i27 += (i26 + l2);
                Test0761.iArrFld[i26 - 1] += i22;
                l2 <<= 11466;
                Test0761.fFld += (i26 - i21);
                i = -12;
            }
            i29 = 63;
            do {
                l2 += i28;
                Test0761.iArrFld[i29 - 1] *= i25;
                s5 = (short) i24;
            } while (--i29 > 0);
        }
        Test0761.bArrFld[(i23 >>> 1) % N] = b2;

        FuzzerUtils.out.println("l i b2 = " + l + "," + i + "," + (b2 ? 1 : 0));
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 s5 i26 = " + i24 + "," + s5 + "," + i26);
        FuzzerUtils.out.println("i27 i28 d1 = " + i27 + "," + i28 + "," + Double.doubleToLongBits(d1));
        FuzzerUtils.out.println("l2 i29 lArr1 = " + l2 + "," + i29 + "," + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test0761.instanceCount Test0761.byFld Test0761.fFld = " + Test0761.instanceCount + "," + Test0761.byFld +
                "," + Float.floatToIntBits(Test0761.fFld));
        FuzzerUtils.out.println("Test0761.iArrFld Test0761.byArrFld Test0761.bArrFld = " + FuzzerUtils.checkSum(Test0761.iArrFld) + ","
                + FuzzerUtils.checkSum(Test0761.byArrFld) + "," + FuzzerUtils.checkSum(Test0761.bArrFld));

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
