// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:18 2023
public class Test0990 {

    public static final int N = 400;

    public static long instanceCount = -10L;
    public static byte byFld = 55;
    public static double dFld = 0.52639;
    public static int iFld = -1004;
    public static boolean bFld = true;
    public static volatile int iFld1 = -161;
    public static int iFld2 = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;
    public int[] iArrFld = new int[N];
    public long[] lArrFld = new long[N];

    public static void vMeth2(float f1, int i9, int i10) {

        int i11 = 65093;
        int i12 = 12;
        int i13 = -185;
        int i14 = -21050;
        int i15 = 10;
        int i16 = -11;
        int i17 = 245;
        int i18 = -207;
        int[] iArr = new int[N];
        byte by = 65;
        double d = -1.40761;

        FuzzerUtils.init(iArr, -37118);

        switch ((((10760 >>> 1) % 2) * 5) + 40) {
            case 42:
                for (i11 = 5; i11 < 274; i11 += 2) {
                    for (i13 = i11; i13 < 12; i13 += 2) {
                        Test0990.instanceCount = i14;
                        i12 -= i15;
                        Test0990.instanceCount /= -29656L;
                        Test0990.instanceCount <<= i13;
                        for (i16 = i13; i16 < 1; ++i16) {
                            if (i10 != 0) {
                                vMeth2_check_sum += Float.floatToIntBits(f1) + i9 + i10 + i11 + i12 + i13 + i14 + i15 + i16
                                        + i17 + i18 + by + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr);
                                return;
                            }
                        }
                        i15 *= i9;
                        i18 = 1;
                        while ((i18 += 2) < 1) {
                            i14 = (int) Test0990.instanceCount;
                            iArr[i18] = i16;
                            i15 -= by;
                            iArr[(224 >>> 1) % N] *= 106;
                        }
                    }
                }
                break;
            case 41:
                f1 += i9;
                break;
            default:
                d += i13;
        }
        vMeth2_check_sum += Float.floatToIntBits(f1) + i9 + i10 + i11 + i12 + i13 + i14 + i15 + i16 + i17 + i18 + by +
                Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(int i5, int i6) {

        float f = 0.464F, f2 = 2.571F, f3 = -68.705F;
        int i7 = 54652;
        int i8 = 22;
        int i19 = -8550;
        int i20 = 14;
        int i21 = -174;
        int[] iArr1 = new int[N];

        FuzzerUtils.init(iArr1, 14);

        i5 *= (int) (i5 - (Math.abs(f) * (++i5)));
        for (i7 = 18; i7 < 388; ++i7) {
            vMeth2(1.533F, i5, i7);
            for (f2 = i7; f2 < 5; ++f2) {
                i20 = 1;
                do {
                    Test0990.byFld = (byte) Test0990.instanceCount;
                } while (++i20 < 1);
                for (f3 = 1; f3 < 1; ++f3) {
                    i21 ^= i5;
                    Test0990.dFld += i7;
                    Test0990.iFld ^= i8;
                    Test0990.bFld = Test0990.bFld;
                }
                i21 = (int) Test0990.instanceCount;
                Test0990.iFld -= i6;
            }
        }
        iArr1[(i6 >>> 1) % N] = i7;
        Test0990.iFld >>>= 3022;
        vMeth1_check_sum += i5 + i6 + Float.floatToIntBits(f) + i7 + i8 + Float.floatToIntBits(f2) + i19 + i20 +
                Float.floatToIntBits(f3) + i21 + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i4) {

        int i22 = 34;
        int i23 = -10;
        int i24 = -4;
        int[][] iArr2 = new int[N][N];
        long[] lArr = new long[N];

        FuzzerUtils.init(iArr2, -51046);
        FuzzerUtils.init(lArr, 223L);

        vMeth1(i4, i4);
        Test0990.iFld += 47;
        i22 = 1;
        do {
            for (i23 = 1; i23 < 5; ++i23) {
                iArr2[i23 - 1][i23 - 1] -= (int) Test0990.instanceCount;
                i4 += (i23 - i22);
                Test0990.instanceCount *= (long) Test0990.dFld;
                Test0990.dFld = Test0990.iFld;
                i24 += i23;
                Test0990.dFld += i24;
                Test0990.iFld |= i23;
                switch ((((i23 >>> 1) % 10) * 5) + 84) {
                    case 118:
                        iArr2[i22][i22] = i23;
                        break;
                    case 117:
                        i4 = (int) Test0990.dFld;
                        if (Test0990.bFld) continue;
                    case 128:
                        Test0990.instanceCount += i23;
                        break;
                    case 106:
                        iArr2[i22 + 1][i23 - 1] *= (int) Test0990.dFld;
                        break;
                    case 127:
                    case 121:
                        Test0990.bFld = Test0990.bFld;
                    case 105:
                        if (Test0990.bFld) break;
                        break;
                    case 124:
                        lArr[i23 - 1] += Test0990.iFld1;
                        break;
                    case 101:
                    case 85:
                        Test0990.iFld = 15971;
                        break;
                }
            }
        } while (++i22 < 337);
        vMeth_check_sum += i4 + i22 + i23 + i24 + FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(lArr);
    }

    public static void main(String[] strArr) {

        try {
            Test0990 _instance = new Test0990();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = -25483, i1 = -65, i2 = -63203, i3 = -150, i25 = -35, i26 = -105, i27 = -4, i28 = 242, i29 = -65442;
        float[] fArr = new float[N];

        FuzzerUtils.init(fArr, 0.471F);

        for (i = 8; i < 135; i++) {
            for (i2 = 7; i2 < 197; i2++) {
                vMeth(24563);
                iArrFld[i - 1] <<= i25;
            }
            i3 = i;
            Test0990.iFld += (i * i);
            i3 >>= -7;
            i1 -= Test0990.iFld1;
            Test0990.instanceCount += i;
            for (i26 = 8; i26 < 197; i26 += 3) {
                Test0990.dFld += Test0990.iFld2;
                i1 = i3;
                Test0990.instanceCount *= 9;
                switch (((i % 2) * 5) + 80) {
                    case 84:
                        Test0990.instanceCount = i1;
                    case 81:
                        Test0990.iFld1 += (((i26 * i1) + Test0990.instanceCount) - Test0990.iFld2);
                        lArrFld[i + 1] <<= i26;
                        for (i28 = i26; i28 < 4; ++i28) {
                            fArr[i28 - 1] *= i29;
                            if (Test0990.bFld) {
                                iArrFld[i] <<= i1;
                            } else {
                                Test0990.byFld = (byte) 26910;
                            }
                            i1 += i28;
                            Test0990.byFld = (byte) Test0990.instanceCount;
                            Test0990.instanceCount += (i28 - Test0990.instanceCount);
                            Test0990.bFld = Test0990.bFld;
                            Test0990.iFld = (int) Test0990.instanceCount;
                        }
                        Test0990.iFld2 += (i26 + i29);
                        break;
                }
                Test0990.iFld2 = Test0990.iFld2;
                i1 &= (int) -18018L;
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i25 i26 = " + i3 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 i28 i29 = " + i27 + "," + i28 + "," + i29);
        FuzzerUtils.out.println("fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test0990.instanceCount Test0990.byFld Test0990.dFld = " + Test0990.instanceCount + "," + Test0990.byFld +
                "," + Double.doubleToLongBits(Test0990.dFld));
        FuzzerUtils.out.println("Test0990.iFld Test0990.bFld Test0990.iFld1 = " + Test0990.iFld + "," + (Test0990.bFld ? 1 : 0) + "," +
                Test0990.iFld1);
        FuzzerUtils.out.println("Test0990.iFld2 iArrFld lArrFld = " + Test0990.iFld2 + "," + FuzzerUtils.checkSum(iArrFld) +
                "," + FuzzerUtils.checkSum(lArrFld));

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