// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:09 2023
public class Test0645 {

    public static final int N = 400;

    public static long instanceCount = -1123591741L;
    public static float fFld = -49.549F;
    public static volatile int[] iArrFld = new int[N];
    public static long[] lArrFld = new long[N];
    public static short[][] sArrFld = new short[N][N];
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    static {
        FuzzerUtils.init(Test0645.iArrFld, -197);
        FuzzerUtils.init(Test0645.lArrFld, -48412L);
        FuzzerUtils.init(Test0645.sArrFld, (short) 27215);
    }

    public int iFld = -30146;
    public double dFld = -8.51993;
    public double[] dArrFld = new double[N];

    public static void vMeth2() {

        int i3 = -13, i4 = 4, i6 = -8, i7 = 3263, i8 = 64680, i9 = 5625;
        short s = 23675;
        float f2 = -124.759F;
        boolean b = true;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, 4L);

        for (i3 = 6; i3 < 145; i3++) {
            i4 = s;
            for (i6 = 11; i6 > 1; i6--) {
                f2 = 2;
                do {
                    b = true;
                    Test0645.instanceCount += (long) f2;
                } while (--f2 > 0);
                i4 += i6;
                s *= (short) i6;
                i7 -= i7;
            }
            switch ((i3 % 2) + 78) {
                case 78:
                    for (i8 = 11; i8 > 1; i8 -= 2) {
                        double d = -18.52927;
                        i4 *= (int) Test0645.instanceCount;
                        lArr[i3] = i9;
                        i9 += (((i8 * s) + i4) - i8);
                        i7 = (int) d;
                    }
                    break;
                case 79:
                    i4 += (-61196 + (i3 * i3));
                    break;
            }
        }
        vMeth2_check_sum += i3 + i4 + s + i6 + i7 + Float.floatToIntBits(f2) + (b ? 1 : 0) + i8 + i9 +
                FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1(float f, float f1, int i2) {

        long l = 12L;
        int i10 = 5;
        int i11 = -63;
        int i12 = -194;
        int[][] iArr1 = new int[N][N];
        boolean b1 = true;
        boolean[] bArr = new boolean[N];
        double d1 = 89.46751;
        float[] fArr = new float[N];

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(fArr, -48.473F);
        FuzzerUtils.init(iArr1, 6);

        vMeth2();
        for (l = 20; l < 323; ++l) {
            byte by = -24;
            i2 = i2;
            switch ((int) ((l % 9) + 17)) {
                case 17:
                    Test0645.instanceCount -= i2;
                    for (i11 = 1; i11 < 5; ++i11) {
                        Test0645.iArrFld[i11 - 1] *= i2;
                        f1 = l;
                        bArr[(int) (l)] = b1;
                        i10 += (int) l;
                        f += -165;
                        i10 -= i2;
                        Test0645.iArrFld[(int) (l - 1)] -= i2;
                        i10 &= (int) Test0645.instanceCount;
                        i12 *= i2;
                    }
                    break;
                case 18:
                    fArr[(int) (l + 1)] = f1;
                    break;
                case 19:
                    by -= (byte) i11;
                    break;
                case 20:
                    i2 = i11;
                    break;
                case 21:
                    if (b1) continue;
                    break;
                case 22:
                    f1 += i2;
                    break;
                case 23:
                    if (b1) break;
                    break;
                case 24:
                    iArr1 = iArr1;
                    break;
                case 25:
                    d1 += i11;
                    break;
                default:
                    Test0645.instanceCount -= i10;
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f) + Float.floatToIntBits(f1) + i2 + l + i10 + i11 + i12 + (b1 ? 1 :
                0) + Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(bArr) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i, int i1) {

        float f3 = -29.465F;
        short s1 = 4122;
        double d2 = 83.103317;
        int[] iArr = new int[N];

        FuzzerUtils.init(iArr, 27410);

        iArr = iArr;
        vMeth1(f3, f3, i);
        i <<= 8;
        Test0645.instanceCount /= (s1 | 1);
        f3 = (float) d2;
        vMeth_check_sum += i + i1 + Float.floatToIntBits(f3) + s1 + Double.doubleToLongBits(d2) +
                FuzzerUtils.checkSum(iArr);
    }

    public static void main(String[] strArr) {

        try {
            Test0645 _instance = new Test0645();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i13 = 6, i14 = 11, i15 = 35, i16 = 28535, i17 = -238, i18 = -11, i19 = 18003, i20 = -1, i21 = 25312;
        short s2 = 9966;

        vMeth(iFld, iFld);
        dFld = iFld;
        for (i13 = 382; i13 > 11; i13--) {
            Test0645.instanceCount |= i13;
            switch (((i13 % 4) * 5) + 89) {
                case 92:
                    iFld += iFld;
                    for (i15 = i13; i15 < 68; i15++) {
                        Test0645.fFld = 0.650F;
                        i16 = -16452;
                        Test0645.fFld -= i15;
                        Test0645.iArrFld = FuzzerUtils.int1array(N, (int) -55166);
                    }
                case 100:
                    for (i17 = 4; 68 > i17; i17++) {
                        i19 = 1;
                        while (++i19 < 2) {
                            dFld += i14;
                            i18 = s2;
                            dFld = i13;
                            i18 *= i17;
                            try {
                                iFld = (i17 % i17);
                                i16 = (i14 % -49778);
                                Test0645.iArrFld[i13] = (i16 % 52);
                            } catch (ArithmeticException a_e) {
                            }
                            Test0645.iArrFld[i17 - 1] *= (int) Test0645.instanceCount;
                            Test0645.iArrFld[i19 + 1] -= i15;
                        }
                        Test0645.fFld -= i14;
                        try {
                            iFld = (i16 % -1616);
                            iFld = (i14 % 14715);
                            i16 = (i15 % -41);
                        } catch (ArithmeticException a_e) {
                        }
                        Test0645.iArrFld[i13 - 1] += i16;
                    }
                    break;
                case 95:
                    switch ((i13 % 6) + 87) {
                        case 87:
                            Test0645.lArrFld[i13 - 1] += 52398;
                            break;
                        case 88:
                            switch ((i13 % 8) + 83) {
                                case 83:
                                    i20 = 1;
                                    do {
                                        Test0645.fFld -= Test0645.fFld;
                                        i18 = i17;
                                        Test0645.iArrFld[i20] += (int) -37.467F;
                                    } while (++i20 < 68);
                                    break;
                                case 84:
                                    iFld <<= -2;
                                case 85:
                                    Test0645.iArrFld[i13 - 1] >>= (int) Test0645.instanceCount;
                                    break;
                                case 86:
                                    Test0645.instanceCount = Test0645.instanceCount;
                                    break;
                                case 87:
                                    Test0645.iArrFld = Test0645.iArrFld;
                                    break;
                                case 88:
                                    i14 <<= i20;
                                    break;
                                case 89:
                                case 90:
                                    iFld -= i18;
                                    break;
                                default:
                                    iFld ^= i21;
                            }
                        case 89:
                            i14 >>>= (int) Test0645.instanceCount;
                            break;
                        case 90:
                            i14 >>= (int) Test0645.instanceCount;
                        case 91:
                            Test0645.sArrFld = Test0645.sArrFld;
                        case 92:
                            Test0645.instanceCount += (196 + (i13 * i13));
                            break;
                    }
                    break;
                case 104:
                    dFld -= Test0645.instanceCount;
                    break;
                default:
                    dArrFld[i13] += Test0645.instanceCount;
            }
        }

        FuzzerUtils.out.println("i13 i14 i15 = " + i13 + "," + i14 + "," + i15);
        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 s2 i20 = " + i19 + "," + s2 + "," + i20);
        FuzzerUtils.out.println("i21 = " + i21);

        FuzzerUtils.out.println("Test0645.instanceCount iFld dFld = " + Test0645.instanceCount + "," + iFld + "," +
                Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("Test0645.fFld Test0645.iArrFld Test0645.lArrFld = " + Float.floatToIntBits(Test0645.fFld) + "," +
                FuzzerUtils.checkSum(Test0645.iArrFld) + "," + FuzzerUtils.checkSum(Test0645.lArrFld));
        FuzzerUtils.out.println("Test0645.sArrFld dArrFld = " + FuzzerUtils.checkSum(Test0645.sArrFld) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));

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
