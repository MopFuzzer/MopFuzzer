// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:00 2023
public class Test0283 {

    public static final int N = 400;

    public static long instanceCount = -3257507719L;
    public static volatile int iFld = -132;
    public static short sFld = -1547;
    public static float fFld = -61.798F;
    public static int[] iArrFld = new int[N];
    public static long vMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0283.iArrFld, 2);
    }

    public double[] dArrFld = new double[N];

    public static void vMeth1(int i8) {

        double d = -127.105233;
        double[][] dArr = new double[N][N];
        int i9 = -14;
        int i10 = -23;
        int i11 = -95;
        int[] iArr = new int[N];
        byte by = 67;
        boolean b1 = false;
        short[][] sArr = new short[N][N];

        FuzzerUtils.init(sArr, (short) -285);
        FuzzerUtils.init(iArr, 0);
        FuzzerUtils.init(dArr, -19.19602);

        d += -6L;
        for (i9 = 1; 271 > i9; i9++) {
            by += (byte) i9;
            Test0283.instanceCount += (((i9 * Test0283.iFld) + Test0283.instanceCount) - i8);
            sArr[(i9 >>> 1) % N] = sArr[i9];
            Test0283.instanceCount |= 97L;
            if (true) {
                i11 = 1;
                while (++i11 < 6) {
                    Test0283.sFld += (short) (i11 - Test0283.iFld);
                    Test0283.instanceCount = (long) -2.965F;
                    Test0283.fFld += (i11 + by);
                    if (b1) {
                        iArr[i9 + 1] = Test0283.iFld;
                        i10 *= (int) d;
                        dArr[i11][i9 + 1] += Test0283.instanceCount;
                    } else if (true) {
                        Test0283.iFld = (int) d;
                    }
                }
            } else {
                if (i8 != 0) {
                    vMeth1_check_sum += i8 + Double.doubleToLongBits(d) + i9 + i10 + by + i11 + (b1 ? 1 : 0) +
                            FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr) +
                            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                    return;
                }
            }
        }
        vMeth1_check_sum += i8 + Double.doubleToLongBits(d) + i9 + i10 + by + i11 + (b1 ? 1 : 0) +
                FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static double dMeth(long l) {

        int i12 = -6;
        int i13 = -7034;
        int i14 = -62;
        int i15 = -118;
        int i16 = 15425;
        int i17 = 26;
        int[] iArr1 = new int[N];
        byte by1 = 81;

        FuzzerUtils.init(iArr1, -29079);

        vMeth1(Test0283.iFld);
        Test0283.fFld += 0;
        Test0283.iFld = Test0283.iFld;
        for (i12 = 273; i12 > 11; i12--) {
            i13 += 19;
            for (i14 = 1; i14 < 6; i14++) {
                iArr1[i14 + 1] <<= (int) l;
                i15 += Test0283.iFld;
                for (i16 = 1; i16 < 2; i16++) {
                    Test0283.fFld += Test0283.fFld;
                }
                Test0283.iFld = i16;
                iArr1[i12 - 1] += i16;
                by1 -= (byte) Test0283.instanceCount;
                i15 += i14;
            }
            Test0283.iFld = (int) -3011021701L;
        }
        long meth_res = l + i12 + i13 + i14 + i15 + i16 + i17 + by1 + FuzzerUtils.checkSum(iArr1);
        dMeth_check_sum += meth_res;
        return (double) meth_res;
    }

    public static void vMeth(int i6, int i7, boolean b) {

        int i18 = 161;
        int i19 = -4013;
        int i20 = 226;
        int i21 = 17497;
        int i22 = 194;
        int[] iArr2 = new int[N];
        double d1 = -76.81499;

        FuzzerUtils.init(iArr2, 37810);

        dMeth(Test0283.instanceCount);
        for (i18 = 12; i18 < 208; i18++) {
            i19 += (((i18 * Test0283.instanceCount) + i19) - i19);
            Test0283.instanceCount >>= -50L;
            if (i6 != 0) {
                vMeth_check_sum += i6 + i7 + (b ? 1 : 0) + i18 + i19 + Double.doubleToLongBits(d1) + i20 + i21 + i22 +
                        FuzzerUtils.checkSum(iArr2);
                return;
            }
            i6 = (int) d1;
            iArr2[i18] -= i18;
            i20 = 1;
            do {
                i6 += 1036;
                i6 += (int) Test0283.fFld;
                for (i21 = 1; 1 > i21; i21++) {
                    i22 *= 4;
                }
                i7 -= Test0283.sFld;
                if (Test0283.iFld != 0) {
                    vMeth_check_sum += i6 + i7 + (b ? 1 : 0) + i18 + i19 + Double.doubleToLongBits(d1) + i20 + i21 +
                            i22 + FuzzerUtils.checkSum(iArr2);
                    return;
                }
                i22 = (int) 1814058196L;
            } while (++i20 < 8);
        }
        vMeth_check_sum += i6 + i7 + (b ? 1 : 0) + i18 + i19 + Double.doubleToLongBits(d1) + i20 + i21 + i22 +
                FuzzerUtils.checkSum(iArr2);
    }

    public static void main(String[] strArr) {

        try {
            Test0283 _instance = new Test0283();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = 238, i1 = 17961, i2 = -61149, i3 = 126, i4 = 50950, i5 = -7, i23 = 91, i24 = -3, i25 = 6;
        boolean b2 = false;
        boolean[][] bArr = new boolean[N][N];
        float f = 0.616F;
        float[] fArr = new float[N];
        double d2 = -120.88190;
        byte by2 = 38;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, -154L);
        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(fArr, -1.913F);

        Test0283.iFld >>>= (int) (++lArr[(Test0283.iFld >>> 1) % N]);
        for (i = 2; 262 > i; i++) {
            Test0283.iFld = i1;
            for (i2 = i; i2 < 97; ++i2) {
                i1 -= -19446;
                for (i4 = 1; i4 < 1; ++i4) {
                    vMeth(i5, i, b2);
                    i3 += (i4 + Test0283.fFld);
                    Test0283.instanceCount ^= -38187;
                    i1 = (int) Test0283.instanceCount;
                    bArr[i4][i4] = b2;
                }
                f = 1;
                do {
                    i3 *= i;
                    i3 += (int) (((f * i5) + i) - i1);
                    switch ((i % 1) + 92) {
                        case 92:
                            Test0283.iArrFld[(int) (f)] &= (int) -45872L;
                            Test0283.iArrFld[i + 1] += 4;
                            Test0283.fFld -= i3;
                            break;
                    }
                    dArrFld[(int) (f + 1)] -= d2;
                    i5 >>= by2;
                    fArr[i2] = Test0283.fFld;
                    Test0283.iArrFld[i + 1] /= (int) (Test0283.instanceCount | 1);
                    i23 = i;
                } while (++f < 1);
                Test0283.iFld *= i1;
                i3 += (int) f;
                i5 += i2;
                for (i24 = i2; i24 < 1; i24++) {
                    Test0283.sFld = (short) i1;
                    d2 = i24;
                    i5 = i4;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i4 i5 = " + i3 + "," + i4 + "," + i5);
        FuzzerUtils.out.println("b2 f d2 = " + (b2 ? 1 : 0) + "," + Float.floatToIntBits(f) + "," +
                Double.doubleToLongBits(d2));
        FuzzerUtils.out.println("by2 i23 i24 = " + by2 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 lArr bArr = " + i25 + "," + FuzzerUtils.checkSum(lArr) + "," +
                FuzzerUtils.checkSum(bArr));
        FuzzerUtils.out.println("fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test0283.instanceCount Test0283.iFld Test0283.sFld = " + Test0283.instanceCount + "," + Test0283.iFld +
                "," + Test0283.sFld);
        FuzzerUtils.out.println("Test0283.fFld Test0283.iArrFld dArrFld = " + Float.floatToIntBits(Test0283.fFld) + "," +
                FuzzerUtils.checkSum(Test0283.iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  dMeth ->  dMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 dMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}