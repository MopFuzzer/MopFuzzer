// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:07 2023
public class Test0549 {

    public static final int N = 400;

    public static volatile long instanceCount = -11790L;
    public static int iFld = -38495;
    public static short sFld = -16139;
    public static int[] iArrFld = new int[N];
    public static volatile long[] lArrFld = new long[N];
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    static {
        FuzzerUtils.init(Test0549.iArrFld, 5);
        FuzzerUtils.init(Test0549.lArrFld, 2805600170200227954L);
    }

    public byte byFld = -55;
    public float fFld = 0.993F;
    public short[] sArrFld = new short[N];

    public static void vMeth2(boolean b, long l1, long l2) {

        int i5 = 63595;
        int i6 = -111;
        int i7 = -9984;
        int i8 = -22701;
        int i9 = 143;
        int i10 = 17856;
        int[] iArr1 = new int[N];
        float f = -10.590F;
        short[][] sArr = new short[N][N];
        long[] lArr = new long[N];
        double[] dArr = new double[N];

        FuzzerUtils.init(iArr1, 2);
        FuzzerUtils.init(sArr, (short) -27935);
        FuzzerUtils.init(lArr, -13L);
        FuzzerUtils.init(dArr, 88.86249);

        for (i5 = 6; i5 < 275; i5++) {
            iArr1[i5] += i6;
            i6 += (((i5 * l1) + i5) - f);
            for (i7 = 1; i7 < 6; ++i7) {
                i8 += (((i7 * f) + i5) - Test0549.instanceCount);
                i6 *= i5;
                switch (((i8 >>> 1) % 4) + 6) {
                    case 6:
                        for (i9 = 1; i9 < 2; ++i9) {
                            i8 >>= i9;
                            iArr1[i9 - 1] += (int) l1;
                            try {
                                i6 = (i10 / i7);
                                i8 = (i10 / -88);
                                i10 = (i8 % 160);
                            } catch (ArithmeticException a_e) {
                            }
                        }
                        Test0549.instanceCount = l2;
                        iArr1[i5 + 1] *= i7;
                        sArr[i5 - 1][i5 - 1] >>>= (short) 57;
                        break;
                    case 7:
                        i6 += i8;
                        break;
                    case 8:
                        i6 *= (int) l1;
                        break;
                    case 9:
                        lArr[i5 - 1] -= i6;
                        break;
                    default:
                        dArr[i5] -= l2;
                }
            }
        }
        vMeth2_check_sum += (b ? 1 : 0) + l1 + l2 + i5 + i6 + Float.floatToIntBits(f) + i7 + i8 + i9 + i10 +
                FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(lArr) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth1() {

        int i4 = -104;
        int i11 = 0;
        int i12 = -2;
        int i13 = -1;
        int i14 = 2278;
        int i15 = 22167;
        int[] iArr2 = new int[N];
        boolean b1 = true;
        byte by = 58;
        double d = -1.16726;
        float[][] fArr = new float[N][N];

        FuzzerUtils.init(fArr, -101.944F);
        FuzzerUtils.init(iArr2, 0);

        fArr[(i4 >>> 1) % N][(i4 >>> 1) % N] /= ((-((i4 * Test0549.instanceCount) + (i4 <<= i4))) | 1);
        vMeth2(b1, Test0549.instanceCount, Test0549.instanceCount);
        for (i11 = 3; i11 < 240; ++i11) {
            iArr2[i11 - 1] += by;
            b1 = b1;
        }
        for (d = 14; d < 311; d++) {
            Test0549.instanceCount += (long) d;
            i12 += i4;
            switch ((int) (((d % 2) * 5) + 74)) {
                case 82:
                    iArr2[(int) (d + 1)] -= (int) Test0549.instanceCount;
                    break;
                case 84:
                    for (i14 = (int) (d); 6 > i14; i14++) {
                        if (b1) continue;
                        i4 <<= -70;
                        Test0549.instanceCount = i11;
                        i15 -= (int) -120.375F;
                    }
            }
        }
        vMeth1_check_sum += i4 + (b1 ? 1 : 0) + i11 + i12 + by + Double.doubleToLongBits(d) + i13 + i14 + i15 +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr2);
    }

    public static void main(String[] strArr) {

        try {
            Test0549 _instance = new Test0549();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void vMeth(long l, int i2) {

        int i3 = 5, i16 = -13;
        long l3 = 982421436L, l4 = 64295L;
        float f1 = -2.731F;

        i3 = 1;
        do {
            vMeth1();
            l3 = 1;
            do {
                switch (((i3 % 5) * 5) + 84) {
                    case 87:
                        switch ((int) ((l3 % 7) + 70)) {
                            case 70:
                                i2 <<= i3;
                                if (true) continue;
                                f1 -= i3;
                                switch (((i3 % 7) * 5) + 29) {
                                    case 52:
                                    case 45:
                                        i2 += i2;
                                    case 64:
                                        l += i2;
                                        Test0549.iArrFld[i3] += (int) 101L;
                                        i2 += (int) (l3 * i3);
                                        i2 = i2;
                                        break;
                                    case 56:
                                        i2 |= byFld;
                                        break;
                                    case 58:
                                        i2 *= (int) l;
                                        break;
                                    case 43:
                                        i2 = (int) Test0549.instanceCount;
                                    case 33:
                                        i2 += (241 + (l3 * l3));
                                    default:
                                        Test0549.iArrFld[(int) (l3 - 1)] >>= i16;
                                }
                            case 71:
                                f1 = i2;
                                break;
                            case 72:
                                Test0549.iFld += (int) l;
                            case 73:
                                l4 >>>= Test0549.iFld;
                                break;
                            case 74:
                                i2 = (int) Test0549.instanceCount;
                                break;
                            case 75:
                            case 76:
                                f1 = i2;
                        }
                        break;
                    case 97:
                        l = Test0549.sFld;
                        break;
                    case 86:
                        Test0549.iArrFld[i3 + 1] += (int) Test0549.instanceCount;
                        break;
                    case 91:
                        f1 = 3628672180L;
                    case 108:
                        sArrFld[(int) (l3 + 1)] = (short) i3;
                }
            } while (++l3 < 11);
        } while (++i3 < 147);
        vMeth_check_sum += l + i2 + i3 + l3 + Float.floatToIntBits(f1) + i16 + l4;
    }

    public void mainTest(String[] strArr1) {

        int i = 10;
        int i1 = -13;
        int i17 = -31685;
        int i18 = -12151;
        int i19 = -133;
        int i20 = 2;
        int i21 = -11;
        int[] iArr = new int[N];
        boolean b2 = false;
        float[] fArr1 = new float[N];

        FuzzerUtils.init(iArr, -84);
        FuzzerUtils.init(fArr1, 1.1003F);

        iArr[(i >>> 1) % N] += (int) 100L;
        i1 = 277;
        do {
            vMeth(Test0549.instanceCount, -23630);
            Test0549.iFld /= (int) (Test0549.instanceCount | 1);
            for (i17 = i1; i17 < 91; i17++) {
                Test0549.iFld += i18;
                i19 = 1;
                do {
                    fFld = Test0549.instanceCount;
                    fFld += i19;
                    i18 += (i19 ^ i1);
                    i18 = i1;
                    i18 = 9;
                    try {
                        iArr[i1 - 1] = (i / -1999810435);
                        Test0549.iFld = (-1249 / i18);
                        Test0549.iFld = (i % 1151860086);
                    } catch (ArithmeticException a_e) {
                    }
                    Test0549.lArrFld[i19] -= i19;
                } while (--i19 > 0);
                i += (i17 * i17);
                Test0549.iFld += (i17 + fFld);
                switch (((i1 % 8) * 5) + 25) {
                    case 28:
                        Test0549.instanceCount += 64;
                        Test0549.sFld += (short) 0;
                        for (i20 = i1; 1 > i20; i20++) {
                            Test0549.instanceCount = i18;
                            Test0549.iFld /= 5;
                            if (b2) {
                                fFld -= i;
                            } else {
                                i21 >>>= i20;
                                byFld = (byte) -8094;
                            }
                            fFld = i17;
                        }
                        break;
                    case 64:
                    case 39:
                        i += i17;
                        i *= i20;
                        break;
                    case 54:
                        Test0549.instanceCount *= i18;
                        break;
                    case 51:
                        fArr1[i1] += fFld;
                        break;
                    case 59:
                        Test0549.instanceCount += (i17 - i);
                        break;
                    case 63:
                        i += (((i17 * i18) + i18) - i20);
                    case 42:
                        i21 = i21;
                        break;
                }
            }
        } while (--i1 > 0);

        FuzzerUtils.out.println("i i1 i17 = " + i + "," + i1 + "," + i17);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 b2 iArr = " + i21 + "," + (b2 ? 1 : 0) + "," + FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println("fArr1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));

        FuzzerUtils.out.println("Test0549.instanceCount byFld Test0549.iFld = " + Test0549.instanceCount + "," + byFld + "," +
                Test0549.iFld);
        FuzzerUtils.out.println("Test0549.sFld fFld Test0549.iArrFld = " + Test0549.sFld + "," + Float.floatToIntBits(fFld) + "," +
                FuzzerUtils.checkSum(Test0549.iArrFld));
        FuzzerUtils.out.println("sArrFld Test0549.lArrFld = " + FuzzerUtils.checkSum(sArrFld) + "," +
                FuzzerUtils.checkSum(Test0549.lArrFld));

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
