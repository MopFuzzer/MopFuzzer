// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:34 2023
public class Test0476 {

    public static final int N = 400;

    public static long instanceCount=77L;
    public static boolean bFld=false;
    public float fFld=1.493F;
    public static byte byFld=95;
    public static int[] iArrFld =new int[N];
    public static double[] dArrFld =new double[N];
    public short[] sArrFld =new short[N];
    public long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test0476.iArrFld, 8);
        FuzzerUtils.init(Test0476.dArrFld, 92.2043);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i4, byte by, int i5) {

        int i6=115, i7=-243, i8=-43745, i9=-4, i10=31088, i11=5;
        float f1=53.139F;
        long l2=6959253742117117269L;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, 71L);

        for (i6 = 9; i6 < 179; i6++) {
            Test0476.instanceCount += (((i6 * i7) + i4) - f1);
            for (i8 = 1; i8 < 9; ++i8) {
                for (i10 = 1; i10 < 2; ++i10) {
                    Test0476.instanceCount = i7;
                    Test0476.instanceCount = i5;
                    try {
                        i9 = (i5 % i8);
                        i5 = (i10 / 168);
                        i11 = (i11 % i11);
                    } catch (ArithmeticException a_e) {}
                    Test0476.iArrFld[i6] *= (int) l2;
                    lArr[i8] -= Test0476.instanceCount;
                    Test0476.iArrFld[i6] += i7;
                    l2 = Test0476.instanceCount;
                    i9 >>= i10;
                    i4 >>>= i7;
                }
                Test0476.iArrFld = Test0476.iArrFld;
                l2 = l2;
            }
        }
        long meth_res = i4 + by + i5 + i6 + i7 + Float.floatToIntBits(f1) + i8 + i9 + i10 + i11 + l2 +
            FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i2, float f, int i3) {

        byte by1=15;
        int i12=-163, i13=13, i14=51852, i15=4, i16=93, i17=156, i18=56, i19=-13;
        short[] sArr =new short[N];

        FuzzerUtils.init(sArr, (short)2039);

        Test0476.instanceCount = 109;
        i2 -= (++sArr[(i2 >>> 1) % N]);
        iMeth(i2, by1, i2);
        for (i12 = 308; i12 > 8; i12 -= 3) {
            for (i14 = 1; 16 > i14; i14++) {
                try {
                    i2 = (1503582883 / i15);
                    i15 = (i15 % -39092);
                    i2 = (i15 / i15);
                } catch (ArithmeticException a_e) {}
                for (i16 = 1; i16 < 2; ++i16) {
                    i13 = i2;
                    i15 += (int) Test0476.instanceCount;
                    i2 -= i2;
                }
                i15 += i14;
                i13 >>>= i16;
                for (i18 = 1; i18 < 2; ++i18) {
                    i3 = 40646;
                    Test0476.bFld = true;
                }
            }
        }
        vMeth1_check_sum += i2 + Float.floatToIntBits(f) + i3 + by1 + i12 + i13 + i14 + i15 + i16 + i17 + i18 + i19 +
            FuzzerUtils.checkSum(sArr);
    }

    public static void vMeth(long l, long l1, double d) {

        int i20=-34780, i21=-12244, i22=-11, i23=30407, i24=-59565, i25=13, i26=-242, i27=28349;
        long l3=-3100494423L;
        long[] lArr1 =new long[N];
        short s=-5374;
        float f2=113.238F;

        FuzzerUtils.init(lArr1, -351899389L);

        vMeth1(i20, 125.205F, i20);
        for (i21 = 18; i21 < 331; i21++) {
            i20 += (int) Test0476.instanceCount;
            for (i23 = 1; i23 < 5; ++i23) {
                switch (((i21 % 9) * 5) + 2) {
                case 18:
                case 6:
                    i20 += i22;
                    if (i20 != 0) {
                        vMeth_check_sum += l + l1 + Double.doubleToLongBits(d) + i20 + i21 + i22 + i23 + i24 + i25 +
                            i26 + l3 + i27 + s + Float.floatToIntBits(f2) + FuzzerUtils.checkSum(lArr1);
                        return;
                    }
                    for (i25 = 1; 2 > i25; i25++) {
                        l3 = l1;
                        i27 <<= -23998;
                        i26 += -32285;
                        i24 *= i27;
                        d += s;
                        l1 += i21;
                        Test0476.dArrFld[i23] = -43;
                    }
                    break;
                case 41:
                    lArr1[i21 + 1] = l1;
                case 35:
                case 36:
                    i20 -= (int)f2;
                    break;
                case 23:
                    f2 += i20;
                    break;
                case 26:
                case 7:
                    Test0476.iArrFld = Test0476.iArrFld;
                    break;
                case 19:
                    l3 += l;
                    break;
                default:
                    d += i27;
                }
            }
        }
        vMeth_check_sum += l + l1 + Double.doubleToLongBits(d) + i20 + i21 + i22 + i23 + i24 + i25 + i26 + l3 + i27 + s
            + Float.floatToIntBits(f2) + FuzzerUtils.checkSum(lArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=-42712, i1=170, i28=-111, i29=213, i30=43552;
        double d1=-33.33074;
        short s1=-32025;
        boolean[][] bArr =new boolean[N][N];
        float[] fArr =new float[N];
        byte[][] byArr =new byte[N][N];

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(fArr, 10.180F);
        FuzzerUtils.init(byArr, (byte)-75);

        for (i = 9; 254 > i; ++i) {
            vMeth(Test0476.instanceCount, Test0476.instanceCount, d1);
            i1 >>= -22206;
            fFld += -61477;
            i28 = 103;
            while (--i28 > 0) {
                Test0476.instanceCount = Test0476.instanceCount;
                for (i29 = 1; i29 < 1; i29++) {
                    Test0476.byFld += (byte) fFld;
                    sArrFld[i29] <<= (short)7;
                    switch ((((0 >>> 1) % 4) * 5) + 99) {
                    case 117:
                        Test0476.instanceCount <<= Test0476.instanceCount;
                        bArr[i29][i29] = false;
                        fFld = 211;
                        fFld = i1;
                    case 119:
                        Test0476.bFld = Test0476.bFld;
                        fArr[i + 1] -= Test0476.instanceCount;
                        i30 = s1;
                    case 114:
                        if (Test0476.bFld) break;
                        if (Test0476.bFld) continue;
                        Test0476.iArrFld = Test0476.iArrFld;
                        break;
                    case 118:
                        i30 *= i1;
                        lArrFld[i - 1] += Test0476.instanceCount;
                        i30 -= i;
                    default:
                        Test0476.instanceCount += (((i29 * Test0476.instanceCount) + i) - i1);
                        i30 += (i29 * i29);
                        switch (((i28 % 6) * 5) + 21) {
                        case 49:
                            Test0476.bFld = Test0476.bFld;
                            i30 = (int) Test0476.instanceCount;
                            i30 *= -87;
                            break;
                        case 40:
                            i1 += (int)d1;
                        case 41:
                            fFld += i30;
                        case 38:
                            byArr[i29 + 1][i] -= (byte)i29;
                            break;
                        case 24:
                            Test0476.instanceCount += i30;
                        case 36:
                            i30 *= i;
                            break;
                        default:
                            i1 *= (int)fFld;
                        }
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 d1 = " + i + "," + i1 + "," + Double.doubleToLongBits(d1));
        FuzzerUtils.out.println("i28 i29 i30 = " + i28 + "," + i29 + "," + i30);
        FuzzerUtils.out.println("s1 bArr fArr = " + s1 + "," + FuzzerUtils.checkSum(bArr) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));
        FuzzerUtils.out.println("byArr = " + FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test0476.instanceCount Test0476.bFld fFld = " + Test0476.instanceCount + "," + (Test0476.bFld ? 1 : 0)
            + "," + Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("Test0476.byFld Test0476.iArrFld Test0476.dArrFld = " + Test0476.byFld + "," +
                FuzzerUtils.checkSum(Test0476.iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0476.dArrFld)));
        FuzzerUtils.out.println("sArrFld lArrFld = " + FuzzerUtils.checkSum(sArrFld) + "," +
            FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0476 _instance = new Test0476();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
