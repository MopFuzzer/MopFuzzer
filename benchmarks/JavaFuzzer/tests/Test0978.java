// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:18 2023
public class Test0978 {

    public static final int N = 400;

    public static long instanceCount = -209L;
    public static boolean bFld = false;
    public static int iFld = -13;
    public static float fFld = 2.602F;
    public static int[] iArrFld = new int[N];
    public static volatile float[] fArrFld = new float[N];
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    static {
        FuzzerUtils.init(Test0978.iArrFld, -11081);
        FuzzerUtils.init(Test0978.fArrFld, -42.75F);
    }

    public static void vMeth2(int i, int i1, int i2) {

        int i3 = 42680;
        int i4 = -16988;
        int i5 = -11;
        int i6 = 7619;
        int i7 = 11655;
        int i8 = 51058;
        int i9 = 0;
        int i10 = 1;
        int[][] iArr = new int[N][N];
        double d = -2.32260;
        short s = 18534;
        float f = 74.763F;
        long[] lArr = new long[N];

        FuzzerUtils.init(iArr, 4);
        FuzzerUtils.init(lArr, -30924L);

        for (i3 = 8; i3 < 159; i3++) {
            for (i5 = 1; i5 < 10; ++i5) {
                iArr[i5 - 1][i5] = i4;
                d += i5;
                i = s;
                Test0978.bFld = Test0978.bFld;
                i4 <<= i3;
            }
        }
        d = f;
        for (i7 = 4; i7 < 327; i7++) {
            i6 = i5;
            i8 = i7;
            i *= (int) Test0978.instanceCount;
            for (i9 = 1; 5 > i9; i9 += 3) {
                iArr[i7][i9] += i;
                i4 += (-12 + (i9 * i9));
            }
        }
        vMeth2_check_sum += i + i1 + i2 + i3 + i4 + i5 + i6 + Double.doubleToLongBits(d) + s + Float.floatToIntBits(f)
                + i7 + i8 + i9 + i10 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1() {

        byte by = -37;
        int i11 = 163, i12 = 10, i13 = -12080, i14 = -121;
        float[] fArr = new float[N];

        FuzzerUtils.init(fArr, 40.1F);

        Test0978.instanceCount = (++by);
        vMeth2(23426, Test0978.iFld, -5);
        Test0978.iFld = -108;
        for (i11 = 8; i11 < 357; ++i11) {
            Test0978.bFld = Test0978.bFld;
            fArr[i11 + 1] += Test0978.instanceCount;
            i12 = by;
            i12 += (int) Test0978.instanceCount;
            switch (((i11 % 2) * 5) + 72) {
                case 78:
                    by -= (byte) i11;
                case 74:
                    for (i13 = i11; i13 < 5; i13++) {
                        i12 += (i13 * i14);
                        Test0978.iFld += (i13 - i14);
                        i14 += (i13 * i13);
                        Test0978.fFld -= i14;
                    }
            }
        }
        vMeth1_check_sum += by + i11 + i12 + i13 + i14 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth() {

        int i15 = 10, i16 = -179, i17 = -53188, i18 = -147, i19 = 190, i20 = 43369;
        boolean[] bArr = new boolean[N];

        FuzzerUtils.init(bArr, false);

        vMeth1();
        for (i15 = 14; i15 < 324; ++i15) {
            for (i17 = 1; 5 > i17; ++i17) {
                Test0978.instanceCount -= Test0978.iFld;
                switch (((i18 >>> 1) % 5) + 61) {
                    case 61:
                    case 62:
                        for (i19 = 2; i19 > 1; i19 -= 3) {
                            short s1 = -12771;
                            if (i15 != 0) {
                                vMeth_check_sum += i15 + i16 + i17 + i18 + i19 + i20 + FuzzerUtils.checkSum(bArr);
                                return;
                            }
                            Test0978.fFld += (-35853 + (i19 * i19));
                            switch ((i17 % 7) + 122) {
                                case 122:
                                    i18 += (i19 ^ i15);
                                    Test0978.iArrFld[i15 - 1] = Test0978.iFld;
                                    i20 = i20;
                                case 123:
                                    bArr[i17] = Test0978.bFld;
                                    i18 += (int) Test0978.fFld;
                                    s1 = (short) 108.75800;
                                    break;
                                case 124:
                                case 125:
                                    i20 += (55599 + (i19 * i19));
                                    break;
                                case 126:
                                    i20 = i15;
                                    break;
                                case 127:
                                    Test0978.instanceCount = Test0978.instanceCount;
                                    break;
                                case 128:
                                    i16 += (int) -63.76749;
                                    break;
                                default:
                                    i16 = i19;
                            }
                        }
                    case 63:
                        Test0978.iArrFld[i15] += i16;
                        break;
                    case 64:
                        try {
                            Test0978.iFld = (-1908617075 / i15);
                            i18 = (i19 % -8);
                            i20 = (13469 / i20);
                        } catch (ArithmeticException a_e) {
                        }
                        break;
                    case 65:
                        Test0978.fArrFld[i17 + 1] = 44;
                        break;
                    default:
                        Test0978.instanceCount = 232;
                }
            }
        }
        vMeth_check_sum += i15 + i16 + i17 + i18 + i19 + i20 + FuzzerUtils.checkSum(bArr);
    }

    public static void main(String[] strArr) {

        try {
            Test0978 _instance = new Test0978();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i21 = -57541, i22 = -52597, i23 = 5, i24 = 8938, i25 = -13, i26 = -8, i27 = -13, i28 = 115;
        byte by1 = -53;
        short s2 = -7537;
        short[][] sArr = new short[N][N];
        double d1 = -51.71956;

        FuzzerUtils.init(sArr, (short) -10825);

        vMeth();
        for (i21 = 6; i21 < 366; i21++) {
            for (i23 = 70; i23 > 2; i23--) {
                i22 >>= 18;
            }
            Test0978.instanceCount = i23;
            i22 += (((i21 * i21) + i23) - Test0978.instanceCount);
            Test0978.iArrFld = FuzzerUtils.int1array(N, (int) -113);
            for (i25 = 4; 70 > i25; i25++) {
                Test0978.instanceCount += (i25 ^ i26);
                Test0978.instanceCount += (i25 * i25);
                for (i27 = 1; i27 < 2; i27++) {
                    i24 *= Test0978.iFld;
                    i24 += i27;
                    sArr[i27][i21] -= (short) i24;
                    i26 = i23;
                    Test0978.iArrFld[i21 + 1] -= Test0978.iFld;
                    if (Test0978.bFld) {
                        if (Test0978.bFld) {
                            Test0978.fFld = by1;
                            i24 = (int) -31.129287;
                        } else if (Test0978.bFld) {
                            i26 -= Test0978.iFld;
                            i24 += (i27 - Test0978.instanceCount);
                        } else if (true) {
                            i26 = Test0978.iFld;
                            sArr[i21][i27 - 1] = (short) i24;
                            Test0978.fFld += -12;
                        }
                    } else {
                        Test0978.fFld += (((i27 * s2) + Test0978.fFld) - Test0978.instanceCount);
                        i24 += i27;
                    }
                    Test0978.iFld += i25;
                }
                Test0978.fFld -= (float) d1;
                by1 <<= (byte) i23;
            }
        }

        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 i28 by1 = " + i27 + "," + i28 + "," + by1);
        FuzzerUtils.out.println("s2 d1 sArr = " + s2 + "," + Double.doubleToLongBits(d1) + "," +
                FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test0978.instanceCount Test0978.bFld Test0978.iFld = " + Test0978.instanceCount + "," + (Test0978.bFld ? 1
                : 0) + "," + Test0978.iFld);
        FuzzerUtils.out.println("Test0978.fFld Test0978.iArrFld Test0978.fArrFld = " + Float.floatToIntBits(Test0978.fFld) + "," +
                FuzzerUtils.checkSum(Test0978.iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0978.fArrFld)));

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
