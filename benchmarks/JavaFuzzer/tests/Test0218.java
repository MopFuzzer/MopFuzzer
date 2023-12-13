// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:58 2023
public class Test0218 {

    public static final int N = 400;

    public static long instanceCount = 67L;
    public static short sFld = 31506;
    public static byte byFld = -50;
    public static int[] iArrFld1 = new int[N];
    public static long sMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0218.iArrFld1, -62170);
    }

    public int[] iArrFld = new int[N];

    public static void vMeth1(float f2) {

        int i7 = -164, i8 = -10, i9 = -22474, i10 = 42158, i11 = -8414, i12 = -19038, i13 = -57, i14 = -12;
        byte by = -107;
        byte[] byArr1 = new byte[N];
        byte[] byArr2 = new byte[N];
        float[][] fArr = new float[N][N];

        FuzzerUtils.init(fArr, -84.152F);
        FuzzerUtils.init(byArr1, (byte) -27);
        FuzzerUtils.init(byArr2, (byte) -110);

        i7 = 1;
        do {
            i8 ^= i7;
            for (i9 = 1; i9 < 7; i9++) {
                for (i11 = 1; i11 < 2; ++i11) {
                    Test0218.iArrFld1[i11 + 1] >>= (int) Test0218.instanceCount;
                    fArr[i9 + 1][i11 - 1] = f2;
                }
                byArr1 = byArr2;
                Test0218.iArrFld1[i9 + 1] *= i7;
                for (i13 = 1; i13 < 2; i13++) {
                    f2 += (((i13 * by) + i10) - i12);
                    i12 += i11;
                    Test0218.iArrFld1[i13 + 1] >>= i7;
                    Test0218.iArrFld1[i7 + 1] -= i14;
                    Test0218.instanceCount -= i13;
                    Test0218.iArrFld1[i7 - 1] = by;
                }
            }
        } while (++i7 < 237);
        vMeth1_check_sum += Float.floatToIntBits(f2) + i7 + i8 + i9 + i10 + i11 + i12 + i13 + i14 + by +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(byArr1) +
                FuzzerUtils.checkSum(byArr2);
    }

    public static void vMeth(long l2) {

        int i4 = 192, i5 = -26659, i6 = 27, i15 = -12, i16 = 183, i17 = -37163, i18 = -895;
        float f3 = 0.456F;
        long[] lArr1 = new long[N];
        short[] sArr = new short[N];

        FuzzerUtils.init(lArr1, -2L);
        FuzzerUtils.init(sArr, (short) 12153);

        i4 *= (int) Test0218.instanceCount;
        for (i5 = 12; i5 < 243; ++i5) {
            vMeth1(f3);
            i6 ^= Test0218.sFld;
            i6 -= Test0218.byFld;
            for (i15 = 7; i15 > 1; i15--) {
                Test0218.iArrFld1[i5] = i16;
                for (i17 = 1; i17 < 2; i17++) {
                    Test0218.iArrFld1[i15] = -52380;
                    if (i16 != 0) {
                        vMeth_check_sum += l2 + i4 + i5 + i6 + Float.floatToIntBits(f3) + i15 + i16 + i17 + i18 +
                                FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(sArr);
                        return;
                    }
                    i18 += (((i17 * i6) + Test0218.instanceCount) - i18);
                    lArr1[i5 + 1] += -44069;
                    Test0218.instanceCount = i16;
                    sArr[i15 + 1] = (short) i5;
                    i4 *= i18;
                }
            }
        }
        vMeth_check_sum += l2 + i4 + i5 + i6 + Float.floatToIntBits(f3) + i15 + i16 + i17 + i18 +
                FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(sArr);
    }

    public static void main(String[] strArr) {

        try {
            Test0218 _instance = new Test0218();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public short sMeth(boolean b, short s1) {

        int i19 = 19, i20 = 52, i22 = 2820;
        long l3 = -186L;
        float f4 = -105.778F;
        double d = 17.17944;

        vMeth(4242L);
        for (i19 = 143; 2 < i19; --i19) {
            if (b) {
                i20 = (int) Test0218.instanceCount;
                i20 *= (int) l3;
            } else {
                i20 *= (int) Test0218.instanceCount;
            }
            i22 = 1;
            while (++i22 < 11) {
                f4 += i19;
                d -= f4;
                if (b) continue;
                Test0218.iArrFld1[i19 - 1] = i20;
                i20 += i22;
                i20 = (int) d;
                i20 = i22;
            }
            l3 += i20;
        }
        long meth_res = (b ? 1 : 0) + s1 + i19 + i20 + l3 + i22 + Float.floatToIntBits(f4) + Double.doubleToLongBits(d);
        sMeth_check_sum += meth_res;
        return (short) meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i = 12894;
        int i1 = -236;
        int i2 = 51512;
        int i3 = 143;
        int i23 = 22577;
        int i24 = -8;
        int i25 = -129;
        int[] iArr = new int[N];
        float f = 2.554F;
        float f1 = 71.661F;
        float[] fArr1 = new float[N];
        long l1 = 13L;
        long l4 = 247L;
        long[] lArr = new long[N];
        boolean b1 = true;
        byte[] byArr = new byte[N];

        FuzzerUtils.init(lArr, 1777579363L);
        FuzzerUtils.init(byArr, (byte) -51);
        FuzzerUtils.init(iArr, 0);
        FuzzerUtils.init(fArr1, -2.32F);

        for (long l : lArr) {
            iArrFld[(220 >>> 1) % N] = (int) (-((l--) - (l + i)));
            for (f = 63; f > 2; --f) {
                for (l1 = (long) (f); l1 < 2; l1++) {
                    short s = 19092;
                    i2 += (int) l1;
                    if (iArrFld[(int) (f - 1)] <= (l++)) continue;
                    byArr[(int) (f + 1)] ^= (byte) (i1++);
                    f1 += (l1 * s);
                }
                i3 = 1;
                while (++i3 < 2) {
                    i1 = (int) ((i1--) + (--lArr[i3]));
                    i2 += (i++);
                    i2 += (i3 * l1);
                }
                i1 += (i1--);
                Test0218.instanceCount -= ((i * sMeth(b1, Test0218.sFld)) * Test0218.instanceCount);
                for (i23 = 1; i23 < 2; i23++) {
                    i1 += i23;
                    Test0218.iArrFld1[(int) (f + 1)] = 0;
                    Test0218.instanceCount += (i23 ^ i1);
                    try {
                        i24 = (i % i23);
                        i24 = (i1 % i23);
                        i24 = (i % i3);
                    } catch (ArithmeticException a_e) {
                    }
                    if (b1) continue;
                    i2 += i23;
                    f1 = i1;
                    iArr[(int) (f + 1)] -= i;
                    f1 += (i23 - i2);
                }
                lArr = lArr;
            }
            for (l4 = 63; l4 > 2; --l4) {
                fArr1[(int) (l4)] -= i;
                Test0218.instanceCount -= i1;
                fArr1[(int) (l4)] *= i25;
                f1 = l4;
            }
        }

        FuzzerUtils.out.println("i f i1 = " + i + "," + Float.floatToIntBits(f) + "," + i1);
        FuzzerUtils.out.println("l1 i2 f1 = " + l1 + "," + i2 + "," + Float.floatToIntBits(f1));
        FuzzerUtils.out.println("i3 b1 i23 = " + i3 + "," + (b1 ? 1 : 0) + "," + i23);
        FuzzerUtils.out.println("i24 l4 i25 = " + i24 + "," + l4 + "," + i25);
        FuzzerUtils.out.println("lArr byArr iArr = " + FuzzerUtils.checkSum(lArr) + "," + FuzzerUtils.checkSum(byArr) +
                "," + FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println("fArr1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));

        FuzzerUtils.out.println("Test0218.instanceCount Test0218.sFld Test0218.byFld = " + Test0218.instanceCount + "," + Test0218.sFld +
                "," + Test0218.byFld);
        FuzzerUtils.out.println("iArrFld Test0218.iArrFld1 = " + FuzzerUtils.checkSum(iArrFld) + "," +
                FuzzerUtils.checkSum(Test0218.iArrFld1));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  sMeth ->  sMeth mainTest
//DEBUG  vMeth ->  vMeth sMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth sMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}