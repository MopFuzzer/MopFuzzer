// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:05 2023
public class Test0495 {

    public static final int N = 400;

    public static long instanceCount = 12L;
    public static short sFld = -24960;
    public static byte byFld = 126;
    public static double dFld = -50.47264;
    public static long[] lArrFld = new long[N];
    public static float[] fArrFld = new float[N];
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    static {
        FuzzerUtils.init(Test0495.lArrFld, -35369L);
        FuzzerUtils.init(Test0495.fArrFld, 1.51F);
    }

    public int iFld = 155;

    public static void vMeth2() {

        int i7 = 1, i8 = -100, i9 = -9, i10 = 0, i11 = -46513;
        float f2 = 0.339F;
        float[] fArr = new float[N];
        boolean b = false;

        FuzzerUtils.init(fArr, 2.852F);

        i7 = (int) Test0495.instanceCount;
        i7 += i7;
        Test0495.instanceCount += Test0495.sFld;
        for (i8 = 5; i8 < 329; ++i8) {
            Test0495.instanceCount *= i9;
            i9 = i7;
            fArr[i8 - 1] -= 35818;
            i9 -= (int) Test0495.instanceCount;
            i10 = 1;
            while (++i10 < 5) {
                switch ((i10 % 2) + 69) {
                    case 69:
                        f2 *= 49429L;
                        break;
                    case 70:
                        Test0495.sFld += (short) Test0495.instanceCount;
                        break;
                    default:
                        Test0495.byFld += (byte) -69;
                        i11 |= -6124;
                        if (b) continue;
                }
            }
        }
        vMeth2_check_sum += i7 + i8 + i9 + i10 + Float.floatToIntBits(f2) + i11 + (b ? 1 : 0) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth1(int i4, int i5, int i6) {

        int i12 = -1, i13 = -254, i14 = -5, i15 = -1, i16 = 80, i17 = 3;
        boolean b1 = false;

        vMeth2();
        for (i12 = 1; i12 < 236; ++i12) {
            switch ((((i12 >>> 1) % 2) * 5) + 67) {
                case 68:
                    for (i14 = 1; i14 < 7; i14++) {
                        for (i16 = 2; i16 > i14; i16 -= 3) {
                            double d1 = 1.89290;
                            Test0495.instanceCount += i16;
                            Test0495.instanceCount += (i16 * Test0495.instanceCount);
                            i13 += (int) d1;
                            i5 = (int) 8889129895714418451L;
                            if (b1) continue;
                        }
                    }
                    Test0495.instanceCount = i13;
                case 72:
            }
            Test0495.dFld += 0.578F;
        }
        vMeth1_check_sum += i4 + i5 + i6 + i12 + i13 + i14 + i15 + i16 + i17 + (b1 ? 1 : 0);
    }

    public static void vMeth(int i2, int i3) {

        float f1 = 84.296F;
        int i18 = 53343;
        int i19 = 10;
        int i20 = -170;
        int i21 = 9911;
        int i22 = -17109;
        int i23 = 206;
        int[][] iArr1 = new int[N][N];

        FuzzerUtils.init(iArr1, -60292);

        f1 += i2;
        vMeth1(i3, i3, i2);
        for (i18 = 5; i18 < 369; ++i18) {
            boolean b2 = true;
            iArr1[i18 - 1][i18 + 1] *= i18;
            if (b2) {
                for (i20 = 1; i20 < 5; i20++) {
                    i3 = -58181;
                    for (i22 = 1; i22 < 2; i22++) {
                        Test0495.lArrFld = Test0495.lArrFld;
                        if (i22 != 0) {
                            vMeth_check_sum += i2 + i3 + Float.floatToIntBits(f1) + i18 + i19 + i20 + i21 + i22 + i23 +
                                    FuzzerUtils.checkSum(iArr1);
                            return;
                        }
                        Test0495.fArrFld[i22] = Test0495.sFld;
                        f1 += (i22 + f1);
                        Test0495.dFld = i2;
                    }
                    Test0495.sFld += (short) i20;
                    if (true) break;
                }
            } else {
                i2 = -64;
            }
        }
        vMeth_check_sum += i2 + i3 + Float.floatToIntBits(f1) + i18 + i19 + i20 + i21 + i22 + i23 +
                FuzzerUtils.checkSum(iArr1);
    }

    public static void main(String[] strArr) {

        try {
            Test0495 _instance = new Test0495();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = -6;
        int i1 = 8;
        int i24 = 15;
        int i25 = -184;
        int i26 = -11;
        int[] iArr = new int[N];
        int[][] iArr2 = new int[N][N];
        float f = -59.835F, f3 = 1.15F, f4 = 0.632F;
        double d = 125.29082;

        FuzzerUtils.init(iArr, -239);
        FuzzerUtils.init(iArr2, 4);

        for (i = 318; i > 12; i -= 2) {
            Test0495.instanceCount -= Math.max(i1, i1--);
            Test0495.instanceCount >>>= (++i1);
            Test0495.sFld += (short) (((i * Test0495.instanceCount) + i1) - f);
            d -= (i1 - i);
            i1 = (int) 1.768F;
            try {
                i1 = (iArr[i - 1] / 17998);
                iArr[i + 1] = (i1 / iArr[i - 1]);
                iArr[i + 1] = (i1 % -80);
            } catch (ArithmeticException a_e) {
            }
            vMeth(i, i1);
        }
        i24 = 148;
        do {
            i1 += (i24 * i24);
            i1 += 8;
            Test0495.instanceCount += (i24 * i24);
            try {
                i1 = (iArr[i24 - 1] / i1);
                i1 = (-220 % i1);
                i1 = (i1 % i1);
            } catch (ArithmeticException a_e) {
            }
        } while (--i24 > 0);
        d *= Test0495.sFld;
        for (f3 = 7; f3 < 348; ++f3) {
            for (f4 = 2; f4 < 74; f4++) {
                switch ((int) ((f3 % 1) + 72)) {
                    case 72:
                        i25 += (int) (((f4 * iFld) + Test0495.instanceCount) - Test0495.instanceCount);
                        i26 += (int) (-5.642F + (f4 * f4));
                        try {
                            i1 = (-1868651079 % i);
                            i25 = (i % 30637);
                            i25 = (iArr[(int) (f4)] % i24);
                        } catch (ArithmeticException a_e) {
                        }
                        Test0495.lArrFld[(int) (f4 - 1)] ^= i25;
                        break;
                    default:
                        iArr[(int) (f4 + 1)] ^= (int) Test0495.instanceCount;
                        Test0495.instanceCount = i25;
                        iArr2 = FuzzerUtils.int2array(N, (int) -142);
                        iArr[(int) (f3 - 1)] >>>= i1;
                }
                iFld = Test0495.byFld;
                d = i24;
                iArr2[(int) (f3 + 1)][(int) (f3 - 1)] <<= (int) Test0495.instanceCount;
                iArr[(int) (f4)] = i25;
            }
            Test0495.instanceCount -= Test0495.sFld;
        }

        FuzzerUtils.out.println("i i1 f = " + i + "," + i1 + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("d i24 f3 = " + Double.doubleToLongBits(d) + "," + i24 + "," +
                Float.floatToIntBits(f3));
        FuzzerUtils.out.println("i25 f4 i26 = " + i25 + "," + Float.floatToIntBits(f4) + "," + i26);
        FuzzerUtils.out.println("iArr iArr2 = " + FuzzerUtils.checkSum(iArr) + "," + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test0495.instanceCount Test0495.sFld Test0495.byFld = " + Test0495.instanceCount + "," + Test0495.sFld +
                "," + Test0495.byFld);
        FuzzerUtils.out.println("Test0495.dFld iFld Test0495.lArrFld = " + Double.doubleToLongBits(Test0495.dFld) + "," + iFld +
                "," + FuzzerUtils.checkSum(Test0495.lArrFld));
        FuzzerUtils.out.println("Test0495.fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0495.fArrFld)));

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