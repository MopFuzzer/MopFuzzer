// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:18 2023
public class Test0998 {

    public static final int N = 400;

    public static long instanceCount = -13L;
    public static boolean bFld = true;
    public static short sFld = -25326;
    public static volatile long[] lArrFld = new long[N];
    public static int[][] iArrFld = new int[N][N];
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long fMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0998.lArrFld, 6L);
        FuzzerUtils.init(Test0998.iArrFld, -14304);
    }

    public byte byFld = -1;

    public static float fMeth(int i10, int i11) {

        float f1 = 2.365F;
        int i12 = 0;
        int i13 = -7190;
        int i14 = 43;
        int[] iArr1 = new int[N];
        boolean[] bArr = new boolean[N];

        FuzzerUtils.init(iArr1, 63090);
        FuzzerUtils.init(bArr, false);

        if (Test0998.bFld) {
            Test0998.lArrFld[(185 >>> 1) % N] += Test0998.instanceCount;
        } else if (Test0998.bFld) {
            Test0998.instanceCount = i10;
        } else {
            Test0998.instanceCount >>= i10;
        }
        i10 -= (int) f1;
        Test0998.instanceCount += i10;
        i12 = 1;
        do {
            for (i13 = 1; i13 < 5; ++i13) {
                iArr1[i12 - 1] = i10;
                if (i14 != 0) {
                }
                i11 -= (int) Test0998.instanceCount;
                Test0998.instanceCount = i12;
                i10 += i11;
            }
            bArr[i12] = true;
            if (Test0998.bFld) break;
        } while (++i12 < 375);
        long meth_res = i10 + i11 + Float.floatToIntBits(f1) + i12 + i13 + i14 + FuzzerUtils.checkSum(iArr1) +
                FuzzerUtils.checkSum(bArr);
        fMeth_check_sum += meth_res;
        return (float) meth_res;
    }

    public static void vMeth1(int i6, long l, int i7) {

        int i8 = -4, i9 = -12, i16 = -61861, i17 = -901;
        short s = 4572;
        long[][] lArr1 = new long[N][N];

        FuzzerUtils.init(lArr1, 2159651977097925717L);

        for (i8 = 8; i8 < 243; i8++) {
            lArr1[i8 + 1][i8 + 1] -= (long) (-((-i6) - fMeth(-241, i7)));
        }
        Test0998.iArrFld[(i9 >>> 1) % N][(i6 >>> 1) % N] *= (int) Test0998.instanceCount;
        Test0998.iArrFld[(i6 >>> 1) % N][(i9 >>> 1) % N] *= i8;
        Test0998.iArrFld[(i7 >>> 1) % N][(i9 >>> 1) % N] *= i6;
        i9 <<= i7;
        i7 = i7;
        for (i16 = 6; i16 < 196; i16++) {
            s += (short) 54232;
            switch (((i16 % 4) * 5) + 45) {
                case 48:
                    Test0998.iArrFld[i16] = Test0998.iArrFld[i16];
                    Test0998.bFld = true;
                case 65:
                    s -= (short) 9514;
                case 57:
                    i6 = -15811;
                case 58:
                    l = i9;
                    break;
            }
        }
        vMeth1_check_sum += i6 + l + i7 + i8 + i9 + i16 + i17 + s + FuzzerUtils.checkSum(lArr1);
    }

    public static void vMeth(float f) {

        double d = 106.14464;
        int i3 = 3;
        int i4 = -8;
        int i5 = 44646;
        int[] iArr = new int[N];
        byte by = 117;
        long[] lArr = new long[N];

        FuzzerUtils.init(iArr, 3);
        FuzzerUtils.init(lArr, 3L);

        for (d = 2; d < 131; d++) {
            try {
                i3 = (iArr[(int) (d - 1)] % -20);
                iArr[(int) (d - 1)] = (-78 % iArr[(int) (d)]);
                i3 = (-40444 / i3);
            } catch (ArithmeticException a_e) {
            }
            for (i4 = 1; i4 < 12; ++i4) {
                i3 = (i3++);
                i5 += (i4 * i4);
                i5 <<= (i3--);
                if (i5 != 0) {
                    vMeth_check_sum += Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i3 + i4 + i5 + by +
                            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
                    return;
                }
            }
            lArr[(int) (d + 1)] = (long) ((iArr[(int) (d + 1)] * 2.51935) - (iArr[(int) (d - 1)] - Test0998.instanceCount));
            switch ((int) ((d % 10) + 74)) {
                case 74:
                    i3 = by;
                    vMeth1(i4, Test0998.instanceCount, i4);
                    break;
                case 75:
                    switch ((int) (((d % 3) * 5) + 77)) {
                        case 82:
                            i5 += (int) d;
                            lArr[(int) (d)] += -51L;
                            Test0998.instanceCount = (long) d;
                            break;
                        case 91:
                            i3 *= i3;
                        case 85:
                            f = i5;
                            break;
                    }
                case 76:
                case 77:
                    i3 += (int) f;
                    break;
                case 78:
                    i3 = (int) f;
                    break;
                case 79:
                case 80:
                    Test0998.instanceCount += Test0998.instanceCount;
                    break;
                case 81:
                    if (Test0998.bFld) break;
                    break;
                case 82:
                    f += (float) d;
                    break;
                case 83:
                    f = f;
                    break;
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i3 + i4 + i5 + by +
                FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public static void main(String[] strArr) {

        try {
            Test0998 _instance = new Test0998();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = 5, i1 = 5500, i2 = 11, i18 = -158, i19 = -227, i20 = 64148, i21 = 38, i22 = 203, i23 = 3, i24 = 8;
        float f2 = -19.916F;
        double d1 = 0.40426;

        Test0998.instanceCount = (i++);
        for (i1 = 9; i1 < 153; i1++) {
            vMeth(f2);
            Test0998.sFld *= (short) i1;
            i = i2;
            for (i18 = 8; i18 < 174; i18++) {
                if (true) break;
                i += (i18 * i18);
                if (true) {
                    i19 += (i18 * i18);
                    Test0998.instanceCount = 10;
                } else {
                    i19 += (i18 * i18);
                    for (i20 = 1; i20 < 2; ++i20) {
                        switch (((i18 >>> 1) % 1) + 89) {
                            case 89:
                                i19 = (int) Test0998.instanceCount;
                                i21 += (((i20 * Test0998.instanceCount) + i) - i19);
                                d1 -= f2;
                                break;
                        }
                        i19 -= (int) d1;
                        f2 += (i20 * i20);
                    }
                    i <<= i2;
                    i19 += i18;
                }
                for (i22 = i1; 2 > i22; ++i22) {
                    byFld = (byte) i18;
                    i21 -= i;
                    i2 = (int) -40393L;
                    i23 *= (int) f2;
                    i19 += (((i22 * i24) + i20) - Test0998.instanceCount);
                    if (true) break;
                    Test0998.instanceCount -= -77;
                    Test0998.bFld = Test0998.bFld;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("f2 i18 i19 = " + Float.floatToIntBits(f2) + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 d1 = " + i20 + "," + i21 + "," + Double.doubleToLongBits(d1));
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);

        FuzzerUtils.out.println("Test0998.instanceCount Test0998.bFld Test0998.sFld = " + Test0998.instanceCount + "," + (Test0998.bFld ? 1
                : 0) + "," + Test0998.sFld);
        FuzzerUtils.out.println("byFld Test0998.lArrFld Test0998.iArrFld = " + byFld + "," + FuzzerUtils.checkSum(Test0998.lArrFld)
                + "," + FuzzerUtils.checkSum(Test0998.iArrFld));

        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  fMeth ->  fMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}