// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:13 2023
public class Test0791 {

    public static final int N = 400;

    public static long instanceCount = -8L;
    public static short sFld = -29985;
    public static volatile byte byFld = -111;
    public static float fFld = 2.559F;
    public static long[] lArrFld = new long[N];
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    static {
        FuzzerUtils.init(Test0791.lArrFld, -809492615L);
    }

    public static void vMeth2() {

        int i4 = -27442, i5 = -11, i6 = -196, i7 = 38;
        float f2 = -1.748F;
        long l = -8306167949678934357L;
        boolean b = true;
        double[] dArr = new double[N];

        FuzzerUtils.init(dArr, 1.59181);

        for (double d : dArr) {
            i4 = 1;
            do {
                for (i5 = 1; 1 < i5; i5 -= 2) {
                    i6 *= (int) d;
                    i6 += i5;
                    f2 += (i5 * i5);
                    i6 = i6;
                }
                Test0791.instanceCount += i4;
                i6 -= i6;
                for (l = 1; 1 > l; l++) {
                    if (b) {
                        if (b) {
                            d += i5;
                            d -= Test0791.sFld;
                            i6 = i7;
                        }
                        vMeth2_check_sum += i4 + i5 + i6 + Float.floatToIntBits(f2) + l + i7 + (b ? 1 : 0) +
                                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                        return;
                    }
                }
            } while (++i4 < 4);
        }
        vMeth2_check_sum += i4 + i5 + i6 + Float.floatToIntBits(f2) + l + i7 + (b ? 1 : 0) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth1() {

        int i2 = 128;
        int i3 = -26024;
        int i8 = -2;
        int i9 = -23797;
        int i10 = -28506;
        int i11 = -4;
        int i12 = 14;
        int i13 = -3;
        int[] iArr = new int[N];
        float f1 = 80.193F;
        double d1 = -2.128049;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, 11724L);
        FuzzerUtils.init(iArr, 116);

        for (i2 = 6; i2 < 123; i2 += 3) {
            f1 += (((i2 * f1) + i2) - Test0791.instanceCount);
            vMeth2();
            lArr[i2] -= 13623;
            for (i8 = i2; i8 < 39; i8++) {
                try {
                    i3 = (i9 % i3);
                    iArr[i8 - 1] = (i3 % -1765223464);
                    i3 = (i8 % -2861);
                } catch (ArithmeticException a_e) {
                }
                Test0791.sFld = (short) i2;
                i3 += (i8 ^ i3);
                for (i10 = i2; 1 > i10; ++i10) {
                    d1 += i8;
                }
                iArr[i2 + 1] -= Test0791.sFld;
                i3 += (((i8 * i11) + i11) - i11);
                for (i12 = 1; i12 > 1; i12--) {
                    i13 -= i13;
                    Test0791.instanceCount = i3;
                }
            }
        }
        vMeth1_check_sum += i2 + i3 + Float.floatToIntBits(f1) + i8 + i9 + i10 + i11 + Double.doubleToLongBits(d1) +
                i12 + i13 + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth() {

        int i = 224, i1 = 4, i14 = 247, i15 = 13, i16 = 61551, i17 = 31882;
        float f = 93.1015F;
        boolean b1 = true;
        double d2 = -36.706;

        for (i = 11; i < 331; ++i) {
            i1 = (int) (i1 -= (int) ((i1 * -32589) - (5739 - (f % (Test0791.instanceCount | 1)))));
            vMeth1();
            i1 &= (int) Test0791.instanceCount;
        }
        for (i14 = 338; 11 < i14; i14 -= 3) {
            for (i16 = 1; i16 < 14; i16++) {
                i17 -= (int) f;
                Test0791.lArrFld[i16] = (long) f;
                i15 <<= i15;
            }
            if (b1) break;
            f += Test0791.instanceCount;
        }
        i1 -= i15;
        i17 = i17;
        Test0791.instanceCount -= (long) d2;
        i15 = (int) Test0791.instanceCount;
        vMeth_check_sum += i + i1 + Float.floatToIntBits(f) + i14 + i15 + i16 + i17 + (b1 ? 1 : 0) +
                Double.doubleToLongBits(d2);
    }

    public static void main(String[] strArr) {

        try {
            Test0791 _instance = new Test0791();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i18 = -54753;
        int i19 = -188;
        int i20 = 230;
        int i21 = 103;
        int i22 = -16624;
        int i23 = 49981;
        int i24 = -7997;
        int i25 = 10;
        int[] iArr1 = new int[N];
        boolean b2 = true;
        long l1 = -3506860291L;
        double d3 = -126.91132;

        FuzzerUtils.init(iArr1, -55335);

        vMeth();
        for (i18 = 5; i18 < 262; ++i18) {
            for (i20 = i18; 98 > i20; ++i20) {
                if (b2) break;
                i19 <<= (int) Test0791.instanceCount;
                for (i22 = 1; i22 < 1; ++i22) {
                    i23 += i22;
                    i21 += (i22 * Test0791.instanceCount);
                    i23 = (int) Test0791.instanceCount;
                    Test0791.byFld += (byte) (((i22 * i19) + Test0791.sFld) - Test0791.instanceCount);
                }
                i21 %= 8210;
                Test0791.fFld += (i20 + i20);
            }
            Test0791.sFld += Test0791.byFld;
            iArr1 = FuzzerUtils.int1array(N, (int) 237);
            i21 = Test0791.sFld;
            i21 = (int) Test0791.instanceCount;
            for (i24 = i18; i24 < 98; ++i24) {
                l1 = 1;
                while (++l1 < 1) {
                    Test0791.instanceCount = l1;
                    i21 -= Test0791.byFld;
                    i25 += Test0791.byFld;
                    Test0791.instanceCount -= (long) Test0791.fFld;
                    i21 <<= Test0791.sFld;
                }
                i25 = (int) Test0791.fFld;
            }
            i21 += i18;
            iArr1[i18 - 1] = i24;
            d3 *= d3;
            iArr1[i18] += (int) d3;
        }
        i19 -= i21;
        i19 -= (int) Test0791.fFld;

        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 b2 i22 = " + i21 + "," + (b2 ? 1 : 0) + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("l1 d3 iArr1 = " + l1 + "," + Double.doubleToLongBits(d3) + "," +
                FuzzerUtils.checkSum(iArr1));

        FuzzerUtils.out.println("Test0791.instanceCount Test0791.sFld Test0791.byFld = " + Test0791.instanceCount + "," + Test0791.sFld +
                "," + Test0791.byFld);
        FuzzerUtils.out.println("Test0791.fFld Test0791.lArrFld = " + Float.floatToIntBits(Test0791.fFld) + "," +
                FuzzerUtils.checkSum(Test0791.lArrFld));

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