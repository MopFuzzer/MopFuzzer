// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:14 2023
public class Test0849 {

    public static final int N = 400;

    public static long instanceCount = 3388057823320374116L;
    public static volatile double dFld = 91.45005;
    public static int[][] iArrFld = new int[N][N];
    public static long[] lArrFld = new long[N];
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0849.iArrFld, 48503);
        FuzzerUtils.init(Test0849.lArrFld, -22L);
    }

    public static double dMeth(double d, int i6) {

        float f = 103.776F;
        float[] fArr = new float[N];
        int i7 = -8, i8 = -54111, i9 = 144, i10 = -6;
        double[][] dArr = new double[N][N];

        FuzzerUtils.init(dArr, -62.43715);
        FuzzerUtils.init(fArr, -23.186F);

        i6 += i6;
        dArr[(i6 >>> 1) % N][(4566 >>> 1) % N] += d;
        if (true) {
            i6 -= (int) f;
            if (false) {
                for (i7 = 318; i7 > 8; --i7) {
                    Test0849.instanceCount -= 125;
                    try {
                        i8 = (588316653 % i7);
                        i6 = (32242 % i7);
                        i6 = (i8 / 33);
                    } catch (ArithmeticException a_e) {
                    }
                    try {
                        i8 = (i7 / i8);
                        i6 = (3541 / i6);
                        i6 = (i7 / -213);
                    } catch (ArithmeticException a_e) {
                    }
                    i8 += i7;
                    try {
                        i8 = (i8 / 212);
                        i8 = (i6 % -239);
                        i8 = (i7 % -40715);
                    } catch (ArithmeticException a_e) {
                    }
                    for (i9 = i7; i9 < 5; ++i9) {
                        fArr[i7 + 1] *= Test0849.instanceCount;
                        Test0849.instanceCount = i10;
                        Test0849.iArrFld[i7][i9] += i6;
                    }
                }
            } else if (false) {
                Test0849.instanceCount &= i7;
            }
        } else {
            i8 -= i7;
        }
        long meth_res = Double.doubleToLongBits(d) + i6 + Float.floatToIntBits(f) + i7 + i8 + i9 + i10 +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        dMeth_check_sum += meth_res;
        return (double) meth_res;
    }

    public static long lMeth() {

        int i4 = 11, i5 = 20078, i11 = 1307, i12 = 0, i13 = 156, i14 = 25847;
        double d1 = 31.36736;
        byte by = -54;
        float f1 = 41.270F;
        short s = -10783;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, 2618696818830396679L);

        for (i4 = 3; i4 < 179; ++i4) {
            Test0849.iArrFld[i4][i4 - 1] += (int) dMeth(d1, i5);
            switch ((i4 % 2) + 89) {
                case 89:
                    Test0849.instanceCount >>>= i4;
                    by += (byte) i4;
                    f1 *= 178;
                    for (i11 = 1; i11 < 9; i11++) {
                        for (i13 = 1; 2 > i13; ++i13) {
                            i5 = i4;
                            i14 = i5;
                            i5 *= (int) Test0849.instanceCount;
                            i5 &= i13;
                            Test0849.instanceCount = 15637;
                            Test0849.instanceCount = s;
                            Test0849.iArrFld[i11 + 1][i11] = i4;
                        }
                    }
                    break;
                case 90:
                    lArr[i4 - 1] -= Test0849.instanceCount;
                    break;
                default:
                    f1 += i4;
            }
        }
        long meth_res = i4 + i5 + Double.doubleToLongBits(d1) + by + Float.floatToIntBits(f1) + i11 + i12 + i13 + i14 +
                s + FuzzerUtils.checkSum(lArr);
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public static void vMeth(long l, int i, int i1) {

        int i2 = 194, i3 = 2, i15 = 39519, i16 = -5, i17 = 41989, i18 = 37771, i19 = 91, i20 = 181;
        boolean b = true;

        for (i2 = 4; 218 > i2; i2++) {
            i += (int) lMeth();
            Test0849.iArrFld[i2][i2] -= i1;
            i = (int) Test0849.dFld;
            for (i15 = 1; i15 < 8; i15++) {
                Test0849.dFld = -159390715L;
                i1 = i1;
                if (b) continue;
            }
            Test0849.instanceCount >>= Test0849.instanceCount;
            Test0849.instanceCount = i16;
            for (i17 = 1; i17 < 8; ++i17) {
                for (i19 = 1; i19 < 2; i19++) {
                    if (i20 != 0) {
                        vMeth_check_sum += l + i + i1 + i2 + i3 + i15 + i16 + (b ? 1 : 0) + i17 + i18 + i19 + i20;
                        return;
                    }
                    Test0849.instanceCount = i18;
                }
                l <<= i20;
            }
        }
        vMeth_check_sum += l + i + i1 + i2 + i3 + i15 + i16 + (b ? 1 : 0) + i17 + i18 + i19 + i20;
    }

    public static void main(String[] strArr) {

        try {
            Test0849 _instance = new Test0849();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i21 = -20970, i22 = -17, i23 = -58148, i24 = -2, i25 = 2, i26 = 14, i27 = -14, i28 = -9, i29 = 61252, i30 = -32575, i31 = 150;
        byte by1 = -70;
        short s1 = -31414;
        short[] sArr = new short[N];
        float f3 = 64.585F;
        float[] fArr1 = new float[N];
        boolean b1 = true;

        FuzzerUtils.init(fArr1, -60.937F);
        FuzzerUtils.init(sArr, (short) -24913);

        vMeth(Test0849.instanceCount, i21, i21);
        switch (((-30 >>> 1) % 5) + 117) {
            case 117:
                i21 += i21;
                for (i22 = 12; i22 < 220; i22++) {
                    i21 >>= i21;
                    i21 += (i22 * Test0849.instanceCount);
                    Test0849.instanceCount = Test0849.instanceCount;
                }
                for (float f2 : fArr1) {
                    Test0849.lArrFld = Test0849.lArrFld;
                    try {
                        i23 = (i23 / i21);
                        i21 = (-59963 % i21);
                        i21 = (21875 % i22);
                    } catch (ArithmeticException a_e) {
                    }
                }
                i24 = 392;
                while (--i24 > 0) {
                    i25 = 1;
                    do {
                        i23 += i23;
                    } while (++i25 < 64);
                    Test0849.instanceCount = Test0849.instanceCount;
                    i23 += (((i24 * Test0849.instanceCount) + i21) - i24);
                    i21 += i25;
                    i21 -= (int) Test0849.instanceCount;
                    for (i26 = 4; i26 < 64; ++i26) {
                        Test0849.iArrFld = Test0849.iArrFld;
                        i27 += (41348 + (i26 * i26));
                        fArr1[i24] -= Test0849.instanceCount;
                        by1 += (byte) i26;
                    }
                    sArr[i24] = (short) Test0849.instanceCount;
                }
            case 118:
                for (i28 = 7; i28 < 213; ++i28) {
                    sArr[i28] = s1;
                    i27 ^= 59328;
                    for (i30 = 122; i30 > 4; --i30) {
                        Test0849.instanceCount = i23;
                        Test0849.instanceCount += i30;
                        Test0849.iArrFld[i30 - 1][i30 + 1] <<= i21;
                    }
                }
                break;
            case 119:
                f3 = Test0849.instanceCount;
                break;
            case 120:
                i21 *= i27;
                break;
            case 121:
                i23 /= (int) (i26 | 1);
                break;
            default:
                b1 = false;
        }

        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 by1 i28 = " + i27 + "," + by1 + "," + i28);
        FuzzerUtils.out.println("i29 s1 i30 = " + i29 + "," + s1 + "," + i30);
        FuzzerUtils.out.println("i31 f3 b1 = " + i31 + "," + Float.floatToIntBits(f3) + "," + (b1 ? 1 : 0));
        FuzzerUtils.out.println("fArr1 sArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + "," +
                FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test0849.instanceCount Test0849.dFld Test0849.iArrFld = " + Test0849.instanceCount + "," +
                Double.doubleToLongBits(Test0849.dFld) + "," + FuzzerUtils.checkSum(Test0849.iArrFld));
        FuzzerUtils.out.println("Test0849.lArrFld = " + FuzzerUtils.checkSum(Test0849.lArrFld));

        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  dMeth ->  dMeth lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}