// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:03 2023
public class Test0415 {

    public static final int N = 400;

    public static long instanceCount = 19626L;
    public static short sFld = 15219;
    public static boolean bFld = true;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long dMeth_check_sum = 0;

    public static double dMeth(int i7, long l1, boolean b1) {

        double d1 = -2.6835;
        int i8 = -34003;
        int i9 = 3;
        int i10 = 5;
        int i11 = -4;
        int[] iArr1 = new int[N];
        float f2 = -2.971F;
        float[] fArr = new float[N];

        FuzzerUtils.init(fArr, 0.444F);
        FuzzerUtils.init(iArr1, -9463);

        fArr = fArr;
        d1 = i7;
        i7 += i7;
        for (i8 = 395; i8 > 3; --i8) {
            i9 += (((i8 * l1) + i9) - l1);
        }
        for (i10 = 9; i10 < 179; i10++) {
            i7 = (int) f2;
            i11 <<= (int) Test0415.instanceCount;
            i7 += (int) Test0415.instanceCount;
            f2 /= ((long) (d1) | 1);
            i7 += i10;
            iArr1[i10 + 1] += (int) -5752441640311828159L;
            i9 -= (int) l1;
        }
        i7 <<= (int) 13L;
        long meth_res = i7 + l1 + (b1 ? 1 : 0) + Double.doubleToLongBits(d1) + i8 + i9 + i10 + i11 +
                Float.floatToIntBits(f2) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
                FuzzerUtils.checkSum(iArr1);
        dMeth_check_sum += meth_res;
        return (double) meth_res;
    }

    public static void vMeth1(int i5, long l, int i6) {

        boolean b2 = true;
        float f3 = 95.177F, f4 = -56.690F;
        short s = 16007;
        int i12 = -76, i13 = 130, i14 = 1;

        dMeth(i6, l, b2);
        i6 = (int) -172L;
        f3 = 1;
        do {
            i6 = s;
        } while (++f3 < 270);
        i5 -= (int) l;
        i6 = i5;
        l *= i6;
        i5 >>= i6;
        for (i12 = 10; i12 < 216; ++i12) {
            s *= (short) f4;
            i5 += (i12 - f4);
            i14 = 1;
            do {
                f4 *= i12;
                i5 >>= i12;
            } while (++i14 < 8);
            i13 -= i6;
        }
        vMeth1_check_sum += i5 + l + i6 + (b2 ? 1 : 0) + Float.floatToIntBits(f3) + s + i12 + i13 +
                Float.floatToIntBits(f4) + i14;
    }

    public static void vMeth(double d) {

        int i1 = 59285;
        int i2 = -48002;
        int i3 = -8;
        int i4 = -46631;
        int i15 = -75;
        int i16 = 154;
        int i17 = -6;
        int[][] iArr = new int[N][N];
        float f1 = 121.783F;
        boolean b = false;
        boolean[][] bArr = new boolean[N][N];
        double d2 = 1.129054;
        long[][] lArr = new long[N][N];
        byte[] byArr = new byte[N];

        FuzzerUtils.init(lArr, 74198884L);
        FuzzerUtils.init(iArr, 11);
        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(byArr, (byte) 119);

        for (i1 = 9; i1 < 223; i1 += 2) {
            lArr[i1 + 1][i1] += (iArr[i1][i1 + 1] = i1);
            i3 = 1;
            do {
                for (f1 = 1; f1 < 1; f1++) {
                    b = (false && bArr[(int) (f1)][i3 + 1]);
                }
                Test0415.instanceCount = ((++i2) - iArr[i1 - 1][i3]);
            } while (++i3 < 15);
            vMeth1(-55749, Test0415.instanceCount, i2);
            if (i1 != 0) {
                vMeth_check_sum += Double.doubleToLongBits(d) + i1 + i2 + i3 + Float.floatToIntBits(f1) + i4 + (b ? 1 :
                        0) + i15 + i16 + Double.doubleToLongBits(d2) + i17 + FuzzerUtils.checkSum(lArr) +
                        FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(byArr);
                return;
            }
            for (i15 = 1; 15 > i15; i15++) {
                Test0415.sFld += (short) (((i15 * i4) + i15) - i3);
                for (d2 = 1; d2 < 2; ++d2) {
                    Test0415.instanceCount = -13L;
                    byArr[(int) (d2)] >>= (byte) 16276;
                    iArr[i15 + 1][i15 + 1] += (int) d;
                    Test0415.instanceCount *= i2;
                }
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + i1 + i2 + i3 + Float.floatToIntBits(f1) + i4 + (b ? 1 : 0) +
                i15 + i16 + Double.doubleToLongBits(d2) + i17 + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr) +
                FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(byArr);
    }

    public static void main(String[] strArr) {

        try {
            Test0415 _instance = new Test0415();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = 205;
        int i18 = -100;
        int i19 = 97;
        int i20 = 44367;
        int i21 = -5;
        int i22 = -34532;
        int i23 = -214;
        int[] iArr2 = new int[N];
        float f = 80.739F;
        double d3 = 0.3411;
        double[][] dArr = new double[N][N];
        byte by = 34;

        FuzzerUtils.init(iArr2, -36197);
        FuzzerUtils.init(dArr, -124.94380);

        i *= (int) f;
        if (Test0415.bFld) {
            vMeth(d3);
            iArr2[(i >>> 1) % N] = (int) Test0415.instanceCount;
            i <<= i;
            dArr[(i >>> 1) % N][(i >>> 1) % N] -= -184;
        } else if (Test0415.bFld) {
            iArr2 = FuzzerUtils.int1array(N, (int) -251);
        } else {
            i = i;
        }
        for (i18 = 17; i18 < 398; ++i18) {
            Test0415.instanceCount += (3 + (i18 * i18));
            for (i20 = 4; i20 < 66; i20++) {
                i21 = i19;
                by += (byte) i20;
                for (i22 = i18; i22 < 2; ++i22) {
                    try {
                        iArr2[i18 + 1] = (iArr2[i20 + 1] % -1108961246);
                        i = (iArr2[i22] / 58);
                        i21 = (i19 % 33694);
                    } catch (ArithmeticException a_e) {
                    }
                    i21 *= i19;
                    iArr2[i18] >>>= i19;
                    i21 = -20;
                    i = (int) f;
                    i += (((i22 * i18) + f) - i20);
                    dArr[i18 - 1][i20] = i22;
                    f = 21;
                }
                i >>>= i21;
                iArr2[i18 + 1] = (int) Test0415.instanceCount;
                switch ((((i >>> 1) % 2) * 5) + 124) {
                    case 130:
                        i21 += (int) -62797L;
                        i19 -= (int) Test0415.instanceCount;
                        iArr2[i20 + 1] -= (int) f;
                        break;
                    case 128:
                        d3 *= -88;
                        i19 += i20;
                        break;
                }
            }
        }

        FuzzerUtils.out.println("i f d3 = " + i + "," + Float.floatToIntBits(f) + "," + Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 by i22 = " + i21 + "," + by + "," + i22);
        FuzzerUtils.out.println("i23 iArr2 dArr = " + i23 + "," + FuzzerUtils.checkSum(iArr2) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test0415.instanceCount Test0415.sFld Test0415.bFld = " + Test0415.instanceCount + "," + Test0415.sFld +
                "," + (Test0415.bFld ? 1 : 0));

        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
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
//DEBUG  dMeth ->  dMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}