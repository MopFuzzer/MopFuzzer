// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:00 2023
public class Test0301 {

    public static final int N = 400;

    public static volatile long instanceCount = -2541979492L;
    public static boolean bFld = false;
    public static float[] fArrFld = new float[N];
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0301.fArrFld, 98.913F);
    }

    public short sFld = -29885;
    public volatile long[] lArrFld = new long[N];

    public static void vMeth1() {

        int i6 = -136;
        int i7 = -39;
        int i8 = 58;
        int i9 = -20137;
        int i10 = -3;
        int[] iArr = new int[N];
        float f2 = 17.530F;
        float[] fArr = new float[N];
        double d1 = 1.3115, d2 = -50.120617;
        short s = 26853;
        boolean b = true;

        FuzzerUtils.init(fArr, -40.331F);
        FuzzerUtils.init(iArr, 47);

        for (i6 = 7; i6 < 337; ++i6) {
            if (true) {
                i7 *= i6;
                f2 = Test0301.instanceCount;
            } else if (false) {
                Test0301.instanceCount -= i7;
                for (i8 = i6; i8 < 5; i8++) {
                    d1 = -9;
                    i7 = i9;
                    for (d2 = 1; d2 < 1; ++d2) {
                        i10 += (int) ((long) d2 ^ i8);
                        Test0301.instanceCount *= Test0301.instanceCount;
                        i10 += (int) d2;
                        i7 <<= (int) Test0301.instanceCount;
                        fArr[(int) (d2)] = s;
                        s <<= (short) -9;
                    }
                }
            } else if (b) {
                Test0301.instanceCount = i7;
            } else {
                iArr[i6 + 1] = i7;
            }
        }
        vMeth1_check_sum += i6 + i7 + Float.floatToIntBits(f2) + i8 + i9 + Double.doubleToLongBits(d1) +
                Double.doubleToLongBits(d2) + i10 + s + (b ? 1 : 0) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
                FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i4, float f1, int i5) {

        int i11 = 36484;
        int i12 = 18;
        int i13 = 26860;
        int i14 = 0;
        int[] iArr1 = new int[N];
        short s1 = -12011;
        long[][] lArr1 = new long[N][N];
        byte[] byArr = new byte[N];

        FuzzerUtils.init(lArr1, 4L);
        FuzzerUtils.init(iArr1, 2448);
        FuzzerUtils.init(byArr, (byte) -112);

        vMeth1();
        i4 *= i4;
        Test0301.instanceCount = -374360822030207436L;
        f1 += i4;
        i4 -= i5;
        i11 = 1;
        do {
            i5 += (-9469 + (i11 * i11));
            i5 -= -2;
            for (i12 = 6; i12 > 1; i12 -= 3) {
                i13 = -233;
            }
            i14 = 1;
            while (++i14 < 6) {
                lArr1[i14 - 1][i14] = -134;
                iArr1[i11] >>= (int) Test0301.instanceCount;
            }
        } while (++i11 < 280);
        Test0301.instanceCount = s1;
        byArr[(i4 >>> 1) % N] *= (byte) i13;
        vMeth_check_sum += i4 + Float.floatToIntBits(f1) + i5 + i11 + i12 + i13 + i14 + s1 +
                FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(byArr);
    }

    public static int iMeth() {

        int i = -212;
        int i1 = -8;
        int i2 = 19165;
        int i3 = -4545;
        int i15 = -40095;
        int i16 = 17;
        int[] iArr2 = new int[N];
        double d = 106.88529, d3 = 1.57025;
        float f = 0.313F;
        long l = 3L;
        long[] lArr = new long[N];
        short[] sArr = new short[N];
        boolean[] bArr = new boolean[N];

        FuzzerUtils.init(lArr, -63517L);
        FuzzerUtils.init(sArr, (short) -19736);
        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(iArr2, 93);

        for (i = 5; i < 129; i++) {
            switch ((i % 6) + 74) {
                case 74:
                    d -= lArr[i + 1];
                    lArr[i] = (++sArr[i]);
                    for (i2 = i; i2 < 13; ++i2) {
                        d = (Math.min(-13L, (long) (f - i3)) + i3);
                        vMeth(i1, f, i2);
                        i3 <<= i;
                        d3 = i2;
                        Test0301.instanceCount = i3;
                    }
                case 75:
                    for (l = 1; l < 13; l++) {
                        i16 = 1;
                        do {
                            bArr[(int) (l + 1)] = Test0301.bFld;
                            i1 &= (int) -145L;
                            d3 += i15;
                        } while (++i16 < 2);
                    }
                    break;
                case 76:
                case 77:
                    if (i != 0) {
                    }
                    break;
                case 78:
                    Test0301.instanceCount = i16;
                    break;
                case 79:
                    iArr2 = iArr2;
                    break;
                default:
                    i15 += i;
            }
        }
        long meth_res = i + i1 + Double.doubleToLongBits(d) + i2 + i3 + Float.floatToIntBits(f) +
                Double.doubleToLongBits(d3) + l + i15 + i16 + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(sArr) +
                FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0301 _instance = new Test0301();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i17 = 61102;
        int i18 = -203;
        int i19 = -174;
        int i20 = 84;
        int i21 = -9;
        int i22 = 12;
        int i23 = -182;
        int i24 = -99;
        int i25 = -9232;
        int i26 = -18110;
        int[][] iArr3 = new int[N][N];
        byte by = -37;

        FuzzerUtils.init(iArr3, 6727);

        iMeth();
        i17 = (int) Test0301.instanceCount;
        Test0301.instanceCount >>= i17;
        sFld -= (short) i17;
        for (i18 = 3; i18 < 245; i18++) {
            for (i20 = 1; i20 < 104; ++i20) {
                float f3 = -2.454F;
                f3 = i20;
                i22 = 1;
                while (++i22 < 2) {
                    i21 = i18;
                    Test0301.instanceCount ^= i18;
                    i21 += i22;
                    Test0301.fArrFld[i18 - 1] -= Test0301.instanceCount;
                    f3 -= sFld;
                }
                for (i23 = i20; i23 < 2; i23++) {
                    i24 += (i23 * i23);
                    i17 >>= i17;
                    Test0301.instanceCount -= by;
                    i17 >>= i20;
                    i17 *= i22;
                }
                lArrFld[i20 - 1] -= Test0301.instanceCount;
                sFld += (short) (((i20 * i20) + i18) - by);
                for (i25 = i20; i25 < 2; ++i25) {
                    i26 = (int) Test0301.instanceCount;
                    Test0301.fArrFld[i25] = i26;
                    try {
                        i26 = (i18 / iArr3[i20][i25 - 1]);
                        i19 = (-2121311935 % i22);
                        i19 = (i20 % iArr3[i18 - 1][i20 - 1]);
                    } catch (ArithmeticException a_e) {
                    }
                    i21 = i25;
                    by -= (byte) i21;
                    f3 -= i24;
                    i24 += (i25 * i25);
                    Test0301.instanceCount <<= -5;
                }
            }
        }

        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 by = " + i23 + "," + i24 + "," + by);
        FuzzerUtils.out.println("i25 i26 iArr3 = " + i25 + "," + i26 + "," + FuzzerUtils.checkSum(iArr3));

        FuzzerUtils.out.println("Test0301.instanceCount Test0301.bFld sFld = " + Test0301.instanceCount + "," + (Test0301.bFld ? 1 : 0)
                + "," + sFld);
        FuzzerUtils.out.println("Test0301.fArrFld lArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0301.fArrFld))
                + "," + FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}