// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:18 2023
public class Test0973 {

    public static final int N = 400;

    public static long instanceCount = 50567L;
    public static int[] iArrFld = new int[N];
    public static float[][] fArrFld = new float[N][N];
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0973.iArrFld, -57);
        FuzzerUtils.init(Test0973.fArrFld, 0.76F);
    }

    public int[] iArrFld1 = new int[N];
    public long[] lArrFld = new long[N];

    public static void vMeth1(int i9, int i10, int i11) {

        int i12 = 77, i13 = 60558, i14 = -3, i15 = -14, i16 = 239, i17 = -34, i18 = 238;
        float f = 86.223F, f1 = 118.462F;
        boolean b1 = false;
        short s = 29119;
        long[] lArr1 = new long[N];

        FuzzerUtils.init(lArr1, 5L);

        for (i12 = 7; i12 < 123; i12++) {
            Test0973.iArrFld[i12 - 1] = i10;
            i11 -= (int) Test0973.instanceCount;
            for (f = 1; f < 13; ++f) {
                lArr1[i12 + 1] *= i10;
                for (i15 = 2; i15 > 1; i15 -= 2) {
                    Test0973.iArrFld[i15 - 1] = i14;
                }
                i14 |= i16;
            }
            i16 = i12;
            b1 = b1;
            for (i17 = 13; i17 > 1; i17 -= 2) {
                s = (short) i11;
                Test0973.instanceCount ^= i11;
                f1 -= (float) -106.17712;
                i14 = i18;
            }
        }
        vMeth1_check_sum += i9 + i10 + i11 + i12 + i13 + Float.floatToIntBits(f) + i14 + i15 + i16 + (b1 ? 1 : 0) + i17
                + i18 + s + Float.floatToIntBits(f1) + FuzzerUtils.checkSum(lArr1);
    }

    public static int iMeth(int i4, int i5, int i6) {

        int i7 = -12;
        int i8 = 39099;
        int i19 = -63;
        int i20 = 185;
        int i21 = -9;
        int i22 = -44;
        int i23 = 56;
        int[] iArr = new int[N];
        double d1 = -103.17916;
        byte by1 = -13;
        boolean b2 = false;
        float f2 = 0.362F;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, 77L);
        FuzzerUtils.init(iArr, -161);

        for (i7 = 2; i7 < 152; i7++) {
            i4 -= (int) (iArr[i7 - 1] + d1);
            i6 += i7;
            if (b2) {
                vMeth1(i4, i6, i4);
                by1 += (byte) (((i7 * i6) + i6) - i19);
                i8 >>= i7;
            }
            i6 = i7;
            for (i20 = 1; 11 > i20; ++i20) {
                for (i22 = 1; i22 < 2; ++i22) {
                    Test0973.instanceCount -= (long) f2;
                    Test0973.iArrFld[i20 + 1] <<= i6;
                    f2 += (i22 * i22);
                    i8 = 77;
                    i4 -= (int) Test0973.instanceCount;
                }
            }
        }
        long meth_res = i4 + i5 + i6 + i7 + i8 + Double.doubleToLongBits(d1) + by1 + i19 + (b2 ? 1 : 0) + i20 + i21 +
                i22 + i23 + Float.floatToIntBits(f2) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth(boolean b, int i) {

        byte by = 43;
        double d = 73.13115;
        int i1 = -11, i2 = -11, i3 = 121;
        short s1 = -11911;
        float f3 = -37.501F;
        long[] lArr2 = new long[N];

        FuzzerUtils.init(lArr2, 8774917376779605856L);

        i = (int) (((by + -47394) * d) * Test0973.instanceCount);
        i1 = 1;
        while (++i1 < 327) {
            for (i2 = 1; i2 < 5; i2++) {
                i3 >>>= i1;
                switch (((i1 % 1) * 5) + 108) {
                    case 112:
                        i <<= (iMeth(i3, i3, i3) - i3);
                        break;
                }
                switch ((i1 % 8) + 55) {
                    case 55:
                        Test0973.instanceCount += (i2 + i3);
                        break;
                    case 56:
                        Test0973.instanceCount -= -2874405348L;
                        Test0973.iArrFld[i1] >>= -4160;
                        lArr2[i1 - 1] += Test0973.instanceCount;
                        break;
                    case 57:
                        switch ((i1 % 7) + 124) {
                            case 124:
                                Test0973.iArrFld[i2 + 1] /= (int) ((long) (d) | 1);
                            case 125:
                                lArr2[i2] = -130L;
                                break;
                            case 126:
                                Test0973.fArrFld[i1][i1] += i2;
                            case 127:
                                i <<= s1;
                                break;
                            case 128:
                                lArr2[(i2 >>> 1) % N] = i;
                            case 129:
                                i &= -11;
                                break;
                            case 130:
                                Test0973.instanceCount = i;
                                break;
                            default:
                                i3 = i3;
                        }
                        break;
                    case 58:
                        if (b) continue;
                    case 59:
                        s1 *= by;
                    case 60:
                        i3 = (int) Test0973.instanceCount;
                        break;
                    case 61:
                        f3 += (14L + (i2 * i2));
                        break;
                    case 62:
                        f3 += i2;
                    default:
                        f3 -= i1;
                }
            }
        }
        vMeth_check_sum += (b ? 1 : 0) + i + by + Double.doubleToLongBits(d) + i1 + i2 + i3 + s1 +
                Float.floatToIntBits(f3) + FuzzerUtils.checkSum(lArr2);
    }

    public static void main(String[] strArr) {

        try {
            Test0973 _instance = new Test0973();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        boolean b3 = false;
        int i24 = -7, i25 = -184, i26 = -17, i27 = -31729, i28 = 124, i29 = -73, i30 = 210;
        long l1 = -51726L;
        float f4 = -97.747F;
        short s2 = 9860;
        byte by3 = 120;

        vMeth(b3, -182);
        if (b3) {
            i24 = i24;
            for (l1 = 8; l1 < 190; ++l1) {
                Test0973.instanceCount = i25;
                switch ((((i25 >>> 1) % 8) * 5) + 27) {
                    case 53:
                        switch ((int) (((l1 % 6) * 5) + 60)) {
                            case 87:
                                for (i26 = 138; i26 > 5; i26--) {
                                    byte by2 = 93;
                                    i24 -= i25;
                                    i24 >>= (int) l1;
                                    i27 -= by2;
                                    i25 += (int) f4;
                                }
                                Test0973.iArrFld[(int) (l1 - 1)] %= (int) (i24 | 1);
                                break;
                            case 61:
                                iArrFld1[(int) (l1 - 1)] = i25;
                                break;
                            case 70:
                                for (i28 = 1; i28 < 138; ++i28) {
                                    i27 += (int) (-108.686F + (i28 * i28));
                                    Test0973.iArrFld[(int) (l1)] >>= i24;
                                    i30 = 1;
                                    do {
                                        switch ((i28 % 2) + 11) {
                                            case 11:
                                                i25 -= i28;
                                                switch (((i28 % 10) * 5) + 116) {
                                                    case 138:
                                                        i29 += i29;
                                                        break;
                                                    case 158:
                                                        i29 = (int) f4;
                                                        lArrFld[(int) (l1 - 1)] += i29;
                                                        Test0973.instanceCount >>= l1;
                                                        break;
                                                    case 130:
                                                        i27 >>= (int) Test0973.instanceCount;
                                                        break;
                                                    case 160:
                                                        Test0973.instanceCount *= 5;
                                                        i29 <<= s2;
                                                        Test0973.instanceCount <<= i26;
                                                        f4 += 37245;
                                                        break;
                                                    case 118:
                                                        i25 += 18;
                                                        break;
                                                    case 120:
                                                        iArrFld1[(int) (l1)] >>>= i30;
                                                        break;
                                                    case 154:
                                                        i27 += (i30 * i30);
                                                        break;
                                                    case 159:
                                                        if (true) break;
                                                    case 152:
                                                        i29 = 3;
                                                        break;
                                                    case 135:
                                                        by3 >>= (byte) i25;
                                                        break;
                                                }
                                            case 12:
                                                f4 = i29;
                                                break;
                                        }
                                    } while (++i30 < 2);
                                }
                                break;
                            case 88:
                                i27 *= -14;
                                break;
                            case 67:
                                Test0973.instanceCount += l1;
                                break;
                            case 80:
                                iArrFld1[(int) (l1 + 1)] -= (int) 12.28712;
                        }
                    case 40:
                        by3 = (byte) Test0973.instanceCount;
                        break;
                    case 33:
                        Test0973.instanceCount = i24;
                        break;
                    case 34:
                        i25 -= i29;
                        break;
                    case 32:
                        i25 >>= i28;
                        break;
                    case 54:
                        i25 += i29;
                        break;
                    case 62:
                        lArrFld[(int) (l1)] -= -63228L;
                        break;
                    case 35:
                        i29 += (int) l1;
                        break;
                }
            }
        } else if (b3) {
            i24 -= -54529;
        }

        FuzzerUtils.out.println("b3 i24 l1 = " + (b3 ? 1 : 0) + "," + i24 + "," + l1);
        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("f4 i28 i29 = " + Float.floatToIntBits(f4) + "," + i28 + "," + i29);
        FuzzerUtils.out.println("i30 s2 by3 = " + i30 + "," + s2 + "," + by3);

        FuzzerUtils.out.println("Test0973.instanceCount Test0973.iArrFld Test0973.fArrFld = " + Test0973.instanceCount + "," +
                FuzzerUtils.checkSum(Test0973.iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0973.fArrFld)));
        FuzzerUtils.out.println("iArrFld1 lArrFld = " + FuzzerUtils.checkSum(iArrFld1) + "," +
                FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
