// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:14 2023
public class Test0819 {

    public static final int N = 400;

    public static volatile long instanceCount = 9868L;
    public static float fFld = 2.330F;
    public static short sFld = 8539;
    public static double dFld = 87.102470;
    public static long[] lArrFld = new long[N];
    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    static {
        FuzzerUtils.init(Test0819.lArrFld, 0L);
    }

    public int[][] iArrFld = new int[N][N];

    public static float fMeth(int i13, int i14) {

        int[] iArr = new int[N];

        FuzzerUtils.init(iArr, -47874);

        iArr[(i13 >>> 1) % N] += i13;
        iArr = (iArr = (iArr = (iArr = iArr)));
        long meth_res = i13 + i14 + FuzzerUtils.checkSum(iArr);
        fMeth_check_sum += meth_res;
        return (float) meth_res;
    }

    public static void vMeth2(int i20, int i21, double d) {

        int i22 = -3850;
        int i23 = 136;
        int[][] iArr3 = new int[N][N];
        byte by2 = 103;
        long l = -8L;
        boolean b = true;
        double[] dArr = new double[N];

        FuzzerUtils.init(iArr3, 2);
        FuzzerUtils.init(dArr, -83.43423);

        i22 = 1;
        while (++i22 < 389) {
            i20 /= (int) (i22 | 1);
            switch ((i22 % 7) + 72) {
                case 72:
                    if (b) {
                        i20 += i22;
                        i20 = by2;
                        Test0819.fFld *= i22;
                        vMeth2_check_sum += i20 + i21 + Double.doubleToLongBits(d) + i22 + by2 + l + i23 + (b ? 1 : 0) +
                                FuzzerUtils.checkSum(iArr3) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                        return;
                    } else if (b) {
                        iArr3[i22 + 1][i22] <<= i20;
                        i21 -= 7670;
                    } else if (b) {
                        for (l = 1; 4 > l; ++l) {
                            Test0819.sFld += (short) l;
                            switch (((i22 % 9) * 5) + 118) {
                                case 137:
                                    dArr[(int) (l + 1)] = Test0819.instanceCount;
                                    iArr3[(int) (l - 1)][(int) (l + 1)] -= (int) l;
                                    if (b) break;
                                    break;
                                case 121:
                                    i21 -= i20;
                                    break;
                                case 134:
                                    i21 += (int) d;
                                    break;
                                case 158:
                                    Test0819.instanceCount += i23;
                                    break;
                                case 152:
                                    dArr[(int) (l - 1)] += by2;
                                case 128:
                                    Test0819.sFld += (short) (-31 + (l * l));
                                    break;
                                case 123:
                                    by2 += (byte) l;
                                case 157:
                                    Test0819.sFld >>= (short) i21;
                                case 143:
                                    Test0819.instanceCount += l;
                                    break;
                            }
                        }
                    } else {
                        b = b;
                    }
                    break;
                case 73:
                    if (b) continue;
                case 74:
                case 75:
                    i20 += i22;
                    break;
                case 76:
                    Test0819.fFld += (((i22 * Test0819.instanceCount) + by2) - Test0819.instanceCount);
                    break;
                case 77:
                    i21 = (int) Test0819.instanceCount;
                    break;
                case 78:
                    try {
                        i20 = (133 % i20);
                        i23 = (i23 / 41979);
                        iArr3[i22 + 1][i22 + 1] = (i20 / 61);
                    } catch (ArithmeticException a_e) {
                    }
                    break;
                default:
                    i21 ^= (int) Test0819.instanceCount;
            }
        }
        vMeth2_check_sum += i20 + i21 + Double.doubleToLongBits(d) + i22 + by2 + l + i23 + (b ? 1 : 0) +
                FuzzerUtils.checkSum(iArr3) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth1(short s, byte by1) {

        int i15 = 6;
        int i16 = -123;
        int i17 = 204;
        int i18 = -16;
        int i19 = 155;
        int i24 = 72;
        int[] iArr2 = new int[N];
        float f1 = -2.392F;
        byte[] byArr1 = new byte[N];
        long[][] lArr = new long[N][N];

        FuzzerUtils.init(iArr2, -1);
        FuzzerUtils.init(byArr1, (byte) -105);
        FuzzerUtils.init(lArr, -8L);

        iArr2[(i15 >>> 1) % N] = ((s++) - (--iArr2[(6 >>> 1) % N]));
        for (i16 = 13; i16 < 222; ++i16) {
            for (i18 = 1; i18 < 8; i18++) {
                byArr1[i18 + 1] = (byte) (iArr2[i18] + iArr2[i16]);
                lArr[i18] = (lArr[i18 + 1] = lArr[i16 - 1]);
                i15 >>= (i19 = (--i15));
                Test0819.instanceCount %= (((long) (-f1)) | 1);
                vMeth2(i18, i15, -2.113204);
                iArr2[i16] <<= i19;
                i24 = 1;
                while (++i24 < 2) {
                    i17 = (int) Test0819.fFld;
                    i19 += i24;
                    Test0819.instanceCount *= i15;
                    try {
                        i17 = (i15 % i15);
                        iArr2[i16 - 1] = (iArr2[i24 + 1] % i17);
                        i17 = (i17 % i17);
                    } catch (ArithmeticException a_e) {
                    }
                    i19 = i15;
                }
            }
        }
        vMeth1_check_sum += s + by1 + i15 + i16 + i17 + i18 + i19 + Float.floatToIntBits(f1) + i24 +
                FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(byArr1) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(int i6) {

        int i7 = 181;
        int i8 = 143;
        int i9 = -7561;
        int i10 = 201;
        int i11 = -3;
        int i12 = 62353;
        int[] iArr1 = new int[N];
        float f = 0.541F;
        byte by3 = -6;
        byte[] byArr = new byte[N];
        long[] lArr1 = new long[N];

        FuzzerUtils.init(iArr1, -6602);
        FuzzerUtils.init(byArr, (byte) 42);
        FuzzerUtils.init(lArr1, -975082413L);

        for (i7 = 233; 14 < i7; --i7) {
            for (i9 = 1; i9 < 7; i9++) {
                Test0819.instanceCount = (long) (((i8 = i9) * (f + i6)) - ((i7 + i7) + i7));
                for (i11 = 1; i11 < 2; i11++) {
                    switch (((i9 % 9) * 5) + 28) {
                        case 67:
                            i10 *= (int) (f * fMeth(i6 *= 248, (int) (i9 - Test0819.instanceCount)));
                            iArr1[i9] -= i12;
                            f = ((byArr[i11 + 1] * (i7 + 47293)) * (i6--));
                            break;
                        case 43:
                            i6 = i12;
                            break;
                        case 60:
                            i10 += (7 + (i11 * i11));
                            i8 = Integer.reverseBytes(i7);
                            Test0819.instanceCount >>>= i8;
                            break;
                        case 42:
                            vMeth1((short) (22831), by3);
                            Test0819.instanceCount >>= -40885;
                            Test0819.instanceCount += (i11 - i11);
                            break;
                        case 64:
                            i6 += i11;
                            break;
                        case 48:
                            lArr1[i9] >>= i6;
                        case 63:
                            i8 %= (int) (i6 | 1);
                            break;
                        case 59:
                            i6 *= (int) Test0819.instanceCount;
                            break;
                        case 69:
                            Test0819.sFld += (short) i11;
                    }
                }
            }
        }
        vMeth_check_sum += i6 + i7 + i8 + i9 + i10 + Float.floatToIntBits(f) + i11 + i12 + by3 +
                FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(lArr1);
    }

    public static void main(String[] strArr) {

        try {
            Test0819 _instance = new Test0819();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = 14996, i1 = -130, i2 = 75, i3 = -10, i4 = -220, i5 = 25402, i25 = -14;
        byte by = -113;
        boolean b1 = false;

        for (i = 1; i < 189; i++) {
            Test0819.instanceCount = (++i1);
            i1 += (i + i1);
            iArrFld[i][i + 1] *= Integer.reverseBytes(++i1);
            for (i2 = 8; 133 > i2; ++i2) {
                for (i4 = 1; i4 < 2; i4++) {
                    i1 += i5;
                    by += (byte) (i4 * i4);
                    vMeth(i4);
                    i3 += (((i4 * i1) + Test0819.instanceCount) - Test0819.instanceCount);
                    i5 -= i4;
                    i3 -= -164;
                    Test0819.lArrFld[i] >>= Test0819.instanceCount;
                    Test0819.dFld += i4;
                    Test0819.instanceCount += (long) Test0819.fFld;
                    i3 += (i4 * Test0819.instanceCount);
                }
                i3 /= (int) ((long) (Test0819.fFld) | 1);
                i3 = i1;
                i25 = 1;
                do {
                    Test0819.fFld -= (float) Test0819.dFld;
                    if (b1) continue;
                    i5 <<= i25;
                    by += (byte) 6;
                    Test0819.fFld += (i25 * by);
                    Test0819.fFld += (i25 * i25);
                    Test0819.instanceCount = i3;
                    Test0819.instanceCount += (i25 ^ Test0819.instanceCount);
                } while (++i25 < 2);
                Test0819.dFld = Test0819.instanceCount;
                Test0819.instanceCount += (i2 - Test0819.instanceCount);
                i3 = i4;
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i4 i5 = " + i3 + "," + i4 + "," + i5);
        FuzzerUtils.out.println("by i25 b1 = " + by + "," + i25 + "," + (b1 ? 1 : 0));

        FuzzerUtils.out.println("Test0819.instanceCount Test0819.fFld Test0819.sFld = " + Test0819.instanceCount + "," +
                Float.floatToIntBits(Test0819.fFld) + "," + Test0819.sFld);
        FuzzerUtils.out.println("Test0819.dFld iArrFld Test0819.lArrFld = " + Double.doubleToLongBits(Test0819.dFld) + "," +
                FuzzerUtils.checkSum(iArrFld) + "," + FuzzerUtils.checkSum(Test0819.lArrFld));

        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  fMeth ->  fMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}