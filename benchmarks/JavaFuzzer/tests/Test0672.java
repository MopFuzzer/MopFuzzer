// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:10 2023
public class Test0672 {

    public static final int N = 400;

    public static long instanceCount = -2L;
    public static double dFld = 0.35169;
    public static short sFld = -20301;
    public static int[] iArrFld = new int[N];
    public static long[] lArrFld = new long[N];
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    static {
        FuzzerUtils.init(Test0672.iArrFld, 54707);
        FuzzerUtils.init(Test0672.lArrFld, 5537621710483526096L);
    }

    public volatile byte byFld = 89;

    public static void vMeth2(float f, int i2) {

        float f1 = -2.256F;
        int i3 = 5, i4 = -17778, i5 = 2, i6 = -63, i7 = 182, i8 = -176, i9 = 7;
        byte by1 = 60;
        boolean b = false;
        boolean[] bArr = new boolean[N];

        FuzzerUtils.init(bArr, false);

        f1 = 1;
        do {
            for (i3 = 1; i3 < 8; ++i3) {
                i5 = 1;
                while (++i5 < 2) {
                    i4 += (int) f;
                    i4 = by1;
                    bArr[i5] = b;
                    b = false;
                }
                i2 = i3;
            }
            for (i6 = 1; i6 < 8; i6++) {
                for (i8 = 1; i8 < 2; i8++) {
                    i9 >>= i7;
                }
                f = Test0672.instanceCount;
                i7 = (int) -126.776F;
                i7 += i5;
                i7 >>= i4;
            }
        } while (++f1 < 205);
        vMeth2_check_sum += Float.floatToIntBits(f) + i2 + Float.floatToIntBits(f1) + i3 + i4 + i5 + by1 + (b ? 1 : 0)
                + i6 + i7 + i8 + i9 + FuzzerUtils.checkSum(bArr);
    }

    public static void vMeth1(byte by, int i1) {

        short s = -12892;

        Test0672.instanceCount += (Test0672.iArrFld[(i1 >>> 1) % N] - (s--));
        Test0672.iArrFld[(i1 >>> 1) % N] += i1;
        vMeth2(1.971F, i1);
        Test0672.iArrFld = Test0672.iArrFld;
        vMeth1_check_sum += by + i1 + s;
    }

    public static void main(String[] strArr) {

        try {
            Test0672 _instance = new Test0672();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void vMeth(double d, int i) {

        float f2 = -2.318F;
        int i10 = 188, i11 = -102, i12 = 127, i13 = 1;
        boolean b1 = true;

        vMeth1(byFld, 60);
        for (f2 = 6; f2 < 294; ++f2) {
            if (b1) continue;
            i -= i;
            i += (int) f2;
            i >>= i;
            i += (int) Test0672.instanceCount;
            b1 = b1;
            if (b1) continue;
        }
        for (i11 = 14; i11 < 308; ++i11) {
            Test0672.instanceCount -= 13;
            i13 = 6;
            while ((i13 -= 3) > 0) {
                Test0672.instanceCount = i11;
            }
            Test0672.instanceCount = Test0672.instanceCount;
            i = (int) Test0672.instanceCount;
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + i + Float.floatToIntBits(f2) + i10 + (b1 ? 1 : 0) + i11 + i12 +
                i13;
    }

    public void mainTest(String[] strArr1) {

        int i14 = 14, i15 = 13, i16 = 98, i17 = -229, i18 = -118, i19 = 0, i20 = 7125;
        float f3 = 0.321F;
        boolean b2 = false;
        short[] sArr = new short[N];

        FuzzerUtils.init(sArr, (short) -6801);

        vMeth(-38.90983, i14);
        for (long l : Test0672.lArrFld) {
            if (false) {
                for (i15 = 3; i15 < 63; i15++) {
                    i14 += byFld;
                    Test0672.iArrFld[i15 - 1] *= (int) -43.104F;
                    for (i17 = 1; 2 > i17; ++i17) {
                        i16 += i14;
                        Test0672.dFld += byFld;
                        f3 += (((i17 * i15) + Test0672.sFld) - i14);
                        Test0672.lArrFld[(i18 >>> 1) % N] |= i17;
                        Test0672.iArrFld[i15 + 1] = (int) Test0672.instanceCount;
                        i18 <<= (int) Test0672.instanceCount;
                        i14 += (((i17 * Test0672.instanceCount) + i18) - l);
                    }
                    for (i19 = 1; 2 > i19; ++i19) {
                        i16 += i16;
                        i14 >>= byFld;
                        i18 >>= i17;
                        l = i18;
                        Test0672.instanceCount = i17;
                        Test0672.sFld += (short) (((i19 * i20) + f3) - Test0672.instanceCount);
                        l &= -21564;
                        switch ((((i19 >>> 1) % 1) * 5) + 42) {
                            case 43:
                                i18 += (int) Test0672.instanceCount;
                            default:
                                l += (((i19 * i19) + i14) - l);
                                sArr[i19] *= (short) i16;
                        }
                        if (b2) break;
                        i16 += i16;
                    }
                    i18 += i15;
                    Test0672.sFld = (short) i16;
                }
            }
        }

        FuzzerUtils.out.println("i14 i15 i16 = " + i14 + "," + i15 + "," + i16);
        FuzzerUtils.out.println("i17 i18 f3 = " + i17 + "," + i18 + "," + Float.floatToIntBits(f3));
        FuzzerUtils.out.println("i19 i20 b2 = " + i19 + "," + i20 + "," + (b2 ? 1 : 0));
        FuzzerUtils.out.println("sArr = " + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test0672.instanceCount byFld Test0672.dFld = " + Test0672.instanceCount + "," + byFld + "," +
                Double.doubleToLongBits(Test0672.dFld));
        FuzzerUtils.out.println("Test0672.sFld Test0672.iArrFld Test0672.lArrFld = " + Test0672.sFld + "," +
                FuzzerUtils.checkSum(Test0672.iArrFld) + "," + FuzzerUtils.checkSum(Test0672.lArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}