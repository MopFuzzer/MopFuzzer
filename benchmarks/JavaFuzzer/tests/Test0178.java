// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:57 2023
public class Test0178 {

    public static final int N = 400;

    public static long instanceCount = 14L;
    public static float fFld = -2.534F;
    public static boolean bFld = true;
    public static byte byFld = -75;
    public static int[] iArrFld = new int[N];
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0178.iArrFld, 12);
    }

    public static void vMeth1(long l1) {

        int i5 = 100, i6 = -71, i7 = 22939, i8 = 8, i9 = -180, i10 = -25954, i11 = -8;
        byte by = -67;
        boolean b1 = false;

        i5 *= (int) l1;
        i5 += i5;
        by >>= (byte) i5;
        Test0178.instanceCount = i5;
        i5 *= i5;
        for (i6 = 11; i6 < 182; ++i6) {
            if (b1) {
                Test0178.fFld *= Test0178.instanceCount;
            } else {
                if (b1) continue;
                for (i8 = 9; i6 < i8; i8 -= 3) {
                    for (i10 = 1; i10 < 1; ++i10) {
                        Test0178.iArrFld[i10] *= (int) Test0178.fFld;
                        Test0178.instanceCount >>= -13;
                        i5 = i5;
                        if (b1) break;
                    }
                }
            }
        }
        vMeth1_check_sum += l1 + i5 + by + i6 + i7 + (b1 ? 1 : 0) + i8 + i9 + i10 + i11;
    }

    public static void vMeth(int i2) {

        int i3 = -8579, i4 = -55, i12 = -2, i13 = 0, i14 = 2, i15 = 1;
        byte by1 = 50;
        float[] fArr = new float[N];

        FuzzerUtils.init(fArr, 21.696F);

        for (i3 = 8; i3 < 305; i3++) {
            i2 += i3;
            Test0178.instanceCount = (long) (((i3 - i4) / ((++i4) | 1)) * fArr[i3]);
            vMeth1(Test0178.instanceCount);
            i2 += (i3 | i3);
            if (Test0178.bFld) {
                i4 += i3;
            } else if (Test0178.bFld) {
            } else if (false) {
                for (i12 = 1; i12 < 6; i12 += 3) {
                    i13 |= i3;
                    for (i14 = 1; 6 > i14; i14++) {
                        i4 >>= i15;
                        i4 += i14;
                        i4 *= (int) Test0178.fFld;
                        i15 >>= i3;
                        i2 += (((i14 * i15) + Test0178.instanceCount) - i14);
                    }
                }
            } else {
                by1 *= (byte) i14;
            }
        }
        vMeth_check_sum += i2 + i3 + i4 + i12 + i13 + i14 + i15 + by1 +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static int iMeth(long l, float f) {

        int i1 = 113, i16 = -154, i17 = -9470, i18 = 77, i19 = -110, i20 = 42732;
        long l2 = 1616788181L;
        short s = 16410;

        i1 = (i1--);
        vMeth(i1);
        for (l2 = 7; l2 < 137; ++l2) {
            i1 >>= i1;
            i1 += (int) (((l2 * i1) + i1) - Test0178.fFld);
            for (i17 = 1; i17 < 12; ++i17) {
                i18 = -11538;
                i1 >>>= (int) Test0178.instanceCount;
                for (i19 = 2; i19 > 1; --i19) {
                    i20 += i19;
                    i18 = i18;
                    f += i19;
                    Test0178.bFld = Test0178.bFld;
                    i16 &= (int) -1986053661L;
                    i1 += (((i19 * i20) + s) - i18);
                }
            }
        }
        long meth_res = l + Float.floatToIntBits(f) + i1 + l2 + i16 + i17 + i18 + i19 + i20 + s;
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0178 _instance = new Test0178();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = 118, i21 = 7106, i22 = -12, i23 = 9429, i24 = 20250, i25 = -53, i26 = 160, i27 = 67, i28 = 7, i29 = 13, i30 = 109, i31 = -30,
                i32 = -4;
        boolean b = true;
        boolean[] bArr = new boolean[N];
        double d = 99.116783, d1 = 32.66601;
        short s1 = -24702;
        long[] lArr = new long[N];

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(lArr, -2L);

        bArr[(i >>> 1) % N] = (b = (b = (b && b)));
        i -= iMeth(9190295531594785512L, Test0178.fFld);
        for (i21 = 302; i21 > 18; i21 -= 2) {
            i >>>= i;
            Test0178.byFld -= (byte) i22;
            lArr[i21] -= -141;
            Test0178.iArrFld[i21] *= (int) d;
            for (d1 = 4; 177 > d1; d1++) {
                for (i24 = 1; 2 > i24; i24++) {
                    Test0178.iArrFld[i24 + 1] = i24;
                    i22 += i24;
                    i += i23;
                    Test0178.instanceCount -= 55690;
                    Test0178.iArrFld[i21] += (int) -179L;
                    i25 += (i24 * i24);
                    i25 >>= s1;
                }
                if (b) continue;
                i22 <<= (int) Test0178.instanceCount;
            }
            if (b) {
                try {
                    Test0178.iArrFld[i21 + 1] = (i24 % 45472);
                    i22 = (i % i23);
                    Test0178.iArrFld[i21 - 1] = (i23 % -18329);
                } catch (ArithmeticException a_e) {
                }
            }
            for (i26 = 177; i26 > i21; i26--) {
                Test0178.instanceCount = (long) Test0178.fFld;
            }
            for (i28 = 177; i28 > 4; i28--) {
                for (i30 = 1; i30 < 2; ++i30) {
                    i23 += (132 + (i30 * i30));
                    d = d;
                    Test0178.instanceCount += i30;
                    Test0178.fFld -= -43225;
                    Test0178.iArrFld[i21 + 1] += i32;
                    d = -94;
                }
            }
        }

        FuzzerUtils.out.println("i b i21 = " + i + "," + (b ? 1 : 0) + "," + i21);
        FuzzerUtils.out.println("i22 d d1 = " + i22 + "," + Double.doubleToLongBits(d) + "," +
                Double.doubleToLongBits(d1));
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("s1 i26 i27 = " + s1 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("i28 i29 i30 = " + i28 + "," + i29 + "," + i30);
        FuzzerUtils.out.println("i31 i32 bArr = " + i31 + "," + i32 + "," + FuzzerUtils.checkSum(bArr));
        FuzzerUtils.out.println("lArr = " + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test0178.instanceCount Test0178.fFld Test0178.bFld = " + Test0178.instanceCount + "," +
                Float.floatToIntBits(Test0178.fFld) + "," + (Test0178.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0178.byFld Test0178.iArrFld = " + Test0178.byFld + "," + FuzzerUtils.checkSum(Test0178.iArrFld));

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
