// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:53 2023
public class Test0038 {

    public static final int N = 400;

    public static long instanceCount = -28118L;
    public static volatile float fFld = 6.873F;
    public static volatile double dFld = -1.121197;
    public static int[][] iArrFld = new int[N][N];
    public static long bMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0038.iArrFld, 0);
    }

    public static int iMeth(int i7, int i8) {

        int i9 = 14;
        int i10 = -236;
        int i11 = -55796;
        int i12 = -27586;
        int i13 = -13;
        int[][] iArr = new int[N][N];
        short s = -14092;
        byte[] byArr = new byte[N];

        FuzzerUtils.init(iArr, 18114);
        FuzzerUtils.init(byArr, (byte) 72);

        i7 += i8;
        for (i9 = 14; i9 < 233; ++i9) {
            iArr[i9 - 1][i9 - 1] = i8;
            i11 = 1;
            do {
                i8 &= s;
            } while (++i11 < 7);
            i10 >>= i10;
            i7 = i11;
            try {
                i10 = (iArr[i9 - 1][i9 - 1] / -807653297);
                iArr[i9 - 1][i9] = (1567635316 % iArr[i9 + 1][i9]);
                iArr[i9 + 1][i9] = (43417 % i9);
            } catch (ArithmeticException a_e) {
            }
            i7 = -82;
            byArr[i9] += (byte) Test0038.instanceCount;
        }
        for (i12 = 1; i12 < 157; i12++) {
            Test0038.fFld += (((i12 * i7) + Test0038.instanceCount) - i8);
            i8 ^= 14;
            i8 += (75 + (i12 * i12));
        }
        i10 -= (int) Test0038.fFld;
        long meth_res = i7 + i8 + i9 + i10 + i11 + s + i12 + i13 + FuzzerUtils.checkSum(iArr) +
                FuzzerUtils.checkSum(byArr);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth(int i4, long l1) {

        int i5 = 165;
        int i6 = -32133;
        int i14 = 93;
        int i15 = 209;
        int i16 = 27144;
        int i17 = -214;
        int i18 = 20297;
        int i19 = 9;
        int i20 = -63175;
        int[] iArr1 = new int[N];
        double d = 0.77535;

        FuzzerUtils.init(iArr1, -139);

        for (i5 = 13; i5 < 356; ++i5) {
            i6 *= (int) (-((i6 * d) + iMeth(i5, i5)));
            Test0038.fFld = l1;
        }
        i14 = 1;
        while (++i14 < 352) {
            Test0038.instanceCount += (9555 + (i14 * i14));
        }
        i6 -= -146;
        for (i15 = 11; i15 < 189; i15++) {
            switch (((i14 >>> 1) % 6) + 112) {
                case 112:
                    for (i17 = 1; i17 < 9; ++i17) {
                        for (i19 = 1; i19 < 2; ++i19) {
                            iArr1[i17] -= (int) 14L;
                            switch (((52476 >>> 1) % 7) + 26) {
                                case 26:
                                    i20 += (((i19 * Test0038.instanceCount) + Test0038.fFld) - i15);
                                    i16 = i4;
                                    Test0038.instanceCount += i19;
                                    break;
                                case 27:
                                    iArr1[(240 >>> 1) % N] = (int) -16L;
                                case 28:
                                    Test0038.fFld = i16;
                                case 29:
                                    i20 = (int) Test0038.instanceCount;
                                    break;
                                case 30:
                                    i20 = 3;
                                    break;
                                case 31:
                                case 32:
                                default:
                                    Test0038.instanceCount *= l1;
                            }
                        }
                    }
                case 113:
                    i20 += (((i15 * Test0038.instanceCount) + l1) - i17);
                    break;
                case 114:
                    Test0038.instanceCount = l1;
                    break;
                case 115:
                    l1 *= (long) -30.162F;
                    break;
                case 116:
                    l1 += (203 + (i15 * i15));
                case 117:
                default:
                    i6 += (i15 | Test0038.instanceCount);
            }
        }
        vMeth_check_sum += i4 + l1 + i5 + i6 + Double.doubleToLongBits(d) + i14 + i15 + i16 + i17 + i18 + i19 + i20 +
                FuzzerUtils.checkSum(iArr1);
    }

    public static void main(String[] strArr) {

        try {
            Test0038 _instance = new Test0038();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public boolean bMeth(long l) {

        int i21 = -179, i22 = -55663, i23 = -16231, i24 = 10, i25 = -116, i26 = -8, i27 = 7, i28 = -64747;
        double d1 = 2.89554;
        double[] dArr = new double[N];
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, 63900L);
        FuzzerUtils.init(dArr, -90.107014);

        vMeth(i21, l);
        i21 = i21;
        i22 = 1;
        while (++i22 < 215) {
            for (d1 = 1; d1 < 7; d1++) {
                lArr[(int) (d1 + 1)] = i22;
                l = i22;
                for (i24 = 1; i24 < 2; i24++) {
                    Test0038.fFld = Test0038.fFld;
                }
                if (i26 != 0) {
                    return ((int) (l + i21 + i22 + Double.doubleToLongBits(d1) + i23 + i24 + i25 + i26 + i27 + i28 +
                            FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)))) % 2 > 0;
                }
                dArr[i22 - 1] -= Test0038.instanceCount;
                for (i27 = i22; i27 < 2; ++i27) {
                    i21 -= (int) d1;
                    Test0038.iArrFld[i27][i22] = (int) d1;
                    i25 = i21;
                    Test0038.iArrFld[i22 - 1][i27 - 1] = (int) d1;
                }
            }
        }
        long meth_res = l + i21 + i22 + Double.doubleToLongBits(d1) + i23 + i24 + i25 + i26 + i27 + i28 +
                FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public void mainTest(String[] strArr1) {

        int i = 130, i1 = -212, i2 = 189, i3 = 154, i29 = 14;
        byte by = 17;
        float[] fArr = new float[N];

        FuzzerUtils.init(fArr, 0.171F);

        for (i = 7; i < 207; ++i) {
            for (i2 = 4; i2 < 126; i2++) {
                boolean b = true;
                by = (byte) ((fArr[i2 - 1] - (Test0038.instanceCount + by)) * Test0038.instanceCount);
                switch ((i % 5) + 64) {
                    case 64:
                        b = bMeth(Test0038.instanceCount);
                        Test0038.instanceCount -= i;
                    case 65:
                        i29 = 2;
                        do {
                            by = (byte) 95.59F;
                            switch (((i29 % 1) * 5) + 99) {
                                case 100:
                                    Test0038.iArrFld[i2][i2] |= (int) Test0038.instanceCount;
                                    break;
                            }
                            switch ((((i29 >>> 1) % 2) * 5) + 110) {
                                case 120:
                                    i3 = i1;
                                    i3 >>= 106;
                                    i1 = -39752;
                                    break;
                                case 116:
                                    i1 += (i29 | Test0038.instanceCount);
                                    switch (((i % 2) * 5) + 107) {
                                        case 113:
                                            switch (((i29 % 4) * 5) + 54) {
                                                case 73:
                                                    i1 = i1;
                                                    i3 >>= i3;
                                                    Test0038.fFld = i2;
                                                case 65:
                                                    Test0038.iArrFld[i + 1][i2 + 1] += i3;
                                                case 62:
                                                    if (b) {
                                                        i3 *= (int) Test0038.dFld;
                                                    } else if (true) {
                                                        i3 += (i29 * Test0038.fFld);
                                                        i1 *= (int) Test0038.instanceCount;
                                                        i1 <<= (int) -52L;
                                                    }
                                                    Test0038.fFld += i;
                                                    break;
                                                case 64:
                                                    i3 = i1;
                                                    b = b;
                                                    break;
                                            }
                                            Test0038.instanceCount = (long) Test0038.dFld;
                                        case 117:
                                            i3 += i3;
                                    }
                                    break;
                            }
                        } while (--i29 > 0);
                        break;
                    case 66:
                        Test0038.fFld += i2;
                        break;
                    case 67:
                        i1 += (((i2 * by) + by) - Test0038.instanceCount);
                        break;
                    case 68:
                        b = b;
                    default:
                        if (b) continue;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 by i29 = " + i3 + "," + by + "," + i29);
        FuzzerUtils.out.println("fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test0038.instanceCount Test0038.fFld Test0038.dFld = " + Test0038.instanceCount + "," +
                Float.floatToIntBits(Test0038.fFld) + "," + Double.doubleToLongBits(Test0038.dFld));
        FuzzerUtils.out.println("Test0038.iArrFld = " + FuzzerUtils.checkSum(Test0038.iArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  bMeth ->  bMeth mainTest
//DEBUG  vMeth ->  vMeth bMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth bMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
