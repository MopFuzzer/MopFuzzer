// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:54 2023
public class Test0048 {

    public static final int N = 400;

    public static volatile long instanceCount = 63813L;
    public static short sFld = 18247;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public float fFld = 2.106F;

    public static void vMeth() {

        int i10 = 8;
        int i11 = 12;
        int i12 = -49;
        int i13 = -95;
        int i14 = 10;
        int i15 = 113;
        int[] iArr = new int[N];
        boolean b = true;
        float f2 = -2.366F;
        double d = -34.126965;

        FuzzerUtils.init(iArr, 22739);

        for (i10 = 5; i10 < 307; ++i10) {
            if (b) break;
            iArr[i10] -= i10;
            i11 -= (int) f2;
            d -= i10;
            for (i12 = 1; i12 < 5; ++i12) {
                i13 >>= 97;
                i11 >>= i11;
                for (i14 = 2; i14 > 1; i14--) {
                    f2 += i12;
                    i11 *= i12;
                    if (b) continue;
                    i11 -= i14;
                    iArr[i14 + 1] >>>= (int) Test0048.instanceCount;
                    Test0048.sFld += (short) i14;
                }
            }
        }
        vMeth_check_sum += i10 + i11 + (b ? 1 : 0) + Float.floatToIntBits(f2) + Double.doubleToLongBits(d) + i12 + i13
                + i14 + i15 + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth1(float f1) {

        int i7 = -194;
        int i8 = 124;
        int i9 = 5461;
        int i16 = -4;
        int i17 = 60333;
        int i18 = 234;
        int i19 = -8;
        int i20 = 251;
        int[] iArr1 = new int[N];
        double d1 = 18.86193;
        byte[][] byArr = new byte[N][N];
        long[][] lArr = new long[N][N];

        FuzzerUtils.init(byArr, (byte) -127);
        FuzzerUtils.init(iArr1, 82);
        FuzzerUtils.init(lArr, -3336870383L);

        byArr[(i7 >>> 1) % N][(i7 >>> 1) % N] += (byte) (i7--);
        for (i8 = 3; 201 > i8; ++i8) {
            vMeth();
            for (i16 = i8; i16 < 8; i16++) {
                f1 = i9;
                for (i18 = i16; i18 < 1; i18++) {
                    i17 -= i20;
                    i7 += i18;
                    Test0048.instanceCount = i16;
                    iArr1[i16 + 1] <<= i19;
                    i17 = i18;
                    f1 *= i20;
                    d1 = Test0048.instanceCount;
                    lArr[i8 - 1][i18 - 1] >>>= 93;
                    i7 += i18;
                }
            }
        }
        long meth_res = Float.floatToIntBits(f1) + i7 + i8 + i9 + i16 + i17 + i18 + i19 + i20 +
                Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr1) +
                FuzzerUtils.checkSum(lArr);
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public static int iMeth(long l, int i4, float f) {

        int i5 = 170;
        int i6 = 0;
        int i21 = 125;
        int i22 = 64191;
        int[] iArr2 = new int[N];
        double d3 = 21.114697;

        FuzzerUtils.init(iArr2, -32247);

        for (i5 = 278; i5 > 8; i5 -= 2) {
            double d2 = 30.16031;
            i4 = (int) (((++l) * (Test0048.instanceCount + 38.72364)) - (-(i5 - i6)));
            l = iMeth1(f);
            Test0048.instanceCount <<= i4;
            f = i6;
            i4 *= -30768;
            i4 += i5;
            f -= i6;
            iArr2[i5] = i5;
            i4 += (((i5 * i4) + i6) - i6);
            d2 -= i6;
        }
        for (i21 = 375; i21 > 4; i21 -= 3) {
            i6 += i21;
            iArr2[i21 - 1] -= (int) d3;
        }
        i6 |= -137;
        long meth_res = l + i4 + Float.floatToIntBits(f) + i5 + i6 + i21 + i22 + Double.doubleToLongBits(d3) +
                FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0048 _instance = new Test0048();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = -246;
        int i1 = -36421;
        int i2 = -39852;
        int i3 = 13;
        int i23 = -20;
        int i24 = -187;
        int i25 = 171;
        int i26 = -6;
        int i27 = 186;
        int i28 = 230;
        int[] iArr3 = new
                int[N];
        byte by = 15;

        FuzzerUtils.init(iArr3, 33449);

        for (i = 6; i < 143; ++i) {
            for (i2 = i; i2 < 183; ++i2) {
                i1 *= (int) (Math.abs(50741 + (fFld * i2)) - iMeth(Test0048.instanceCount, i2, fFld));
                i23 = 1;
                do {
                    Test0048.instanceCount = -29853;
                    iArr3[i2 + 1] *= -8891;
                } while (++i23 < 1);
                by -= (byte) i;
                try {
                    iArr3[i + 1] = (i % -63370);
                    i1 = (iArr3[i2 - 1] % i3);
                    i3 = (i % 48361);
                } catch (ArithmeticException a_e) {
                }
                i24 = 1;
                do {
                    i1 = (int) Test0048.instanceCount;
                    Test0048.instanceCount *= (long) fFld;
                    iArr3[i24 - 1] = (int) Test0048.instanceCount;
                    Test0048.instanceCount <<= i1;
                    Test0048.instanceCount <<= -248L;
                    try {
                        i3 = (i3 / i1);
                        i1 = (i23 / i23);
                        i25 = (i3 % i3);
                    } catch (ArithmeticException a_e) {
                    }
                    iArr3 = iArr3;
                    Test0048.instanceCount >>>= -2262128637L;
                    i1 >>= i1;
                } while (--i24 > 0);
                fFld = i1;
                Test0048.instanceCount += (((i2 * i2) + i2) - i);
                for (i26 = 1; i26 < 1; i26++) {
                    Test0048.instanceCount += (i26 - i28);
                    fFld -= i28;
                    iArr3[i2] -= (int) 1.234F;
                    i27 = i27;
                    Test0048.sFld += (short) (i26 * i26);
                    i28 >>>= 3;
                    Test0048.sFld += (short) i26;
                    iArr3[i - 1] ^= i27;
                    fFld = i23;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i23 by = " + i3 + "," + i23 + "," + by);
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 i28 iArr3 = " + i27 + "," + i28 + "," + FuzzerUtils.checkSum(iArr3));

        FuzzerUtils.out.println("Test0048.instanceCount fFld Test0048.sFld = " + Test0048.instanceCount + "," +
                Float.floatToIntBits(fFld) + "," + Test0048.sFld);

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}