// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:32 2023
public class Test0435 {

    public static final int N = 400;

    public static long instanceCount=573906811L;
    public static long lFld=2737404124L;
    public static byte byFld=-76;
    public volatile double[] dArrFld =new double[N];
    public static volatile int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0435.iArrFld, -8);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long iMeth2_check_sum = 0;

    public static void vMeth(double d, long l, double d1) {

        int i=-62865;
        short s=11082;

        i = ((i + -10713) - (--s));
        vMeth_check_sum += Double.doubleToLongBits(d) + l + Double.doubleToLongBits(d1) + i + s;
    }

    public static int iMeth2(int i6, int i7) {

        float f2=-38.751F;
        int i8=54, i10=-13, i11=129;
        double d2=-2.54350;
        boolean b=false;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(lArr1, 31864L);

        lArr1[(i6 >>> 1) % N] -= (long)f2;
        i8 = 1;
        do {
            switch (((i8 >>> 1) % 7) + 4) {
            case 4:
                i6 = (int) Test0435.instanceCount;
                if (b) {
                    i6 -= (int)d2;
                    switch ((((i8 >>> 1) % 6) * 5) + 124) {
                    case 142:
                        if (b) {
                            i7 -= (int)f2;
                        } else {
                            for (i10 = 5; 1 < i10; i10--) {
                                byte by=42;
                                i6 = i7;
                                i7 = i7;
                                d2 += f2;
                                Test0435.instanceCount >>= by;
                                i6 = -6;
                            }
                        }
                        break;
                    case 140:
                        b = b;
                        break;
                    case 130:
                        i6 %= (int)(i6 | 1);
                        break;
                    case 131:
                        if (i7 != 0) {
                        }
                    case 152:
                        i7 = i8;
                        break;
                    case 145:
                        i6 &= i10;
                    }
                }
                break;
            case 5:
                d2 -= Test0435.instanceCount;
                break;
            case 6:
                i7 -= i11;
            case 7:
                i11 = (int) Test0435.instanceCount;
                break;
            case 8:
                Test0435.iArrFld = FuzzerUtils.int1array(N, (int) -140);
                break;
            case 9:
                i11 *= 3;
            case 10:
                i6 = (int)f2;
                break;
            }
        } while (++i8 < 327);
        long meth_res = i6 + i7 + Float.floatToIntBits(f2) + i8 + Double.doubleToLongBits(d2) + (b ? 1 : 0) + i10 + i11
            + FuzzerUtils.checkSum(lArr1);
        iMeth2_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth1(float f1) {

        int i4=87, i5=-56502, i13=43402, i14=-5, i15=-11072, i16=1, i17=101, i18=16629;
        double d3=113.272;
        float[] fArr =new float[N];
        long[] lArr2 =new long[N];

        FuzzerUtils.init(fArr, 1.253F);
        FuzzerUtils.init(lArr2, -221722929L);

        for (i4 = 4; i4 < 368; ++i4) {
            Test0435.instanceCount <<= iMeth2(i4, i4);
            d3 += Test0435.lFld;
            i5 += i5;
            i5 += i4;
            d3 += -3;
        }
        fArr[(i5 >>> 1) % N] = i5;
        for (i13 = 357; i13 > 6; --i13) {
            Test0435.byFld = (byte) Test0435.instanceCount;
            for (i15 = i13; i15 < 5; ++i15) {
                lArr2[i15] <<= i4;
                i16 = (int)1.644F;
                for (i17 = 1; 1 > i17; i17++) {
                    i18 |= i15;
                    f1 -= Test0435.instanceCount;
                }
            }
        }
        long meth_res = Float.floatToIntBits(f1) + i4 + i5 + Double.doubleToLongBits(d3) + i13 + i14 + i15 + i16 + i17
            + i18 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr2);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i2, int i3) {

        float f3=-1.368F;
        int i19=13;
        int i21=-59;
        int i22=-86;
        int i23=13651;
        int i24=-9;
        int[] iArr =new int[N];
        double d4=-2.2087;
        double[][] dArr =new double[N][N];
        long[] lArr =new long[N];

        FuzzerUtils.init(iArr, 0);
        FuzzerUtils.init(lArr, 245L);
        FuzzerUtils.init(dArr, -1.273);

        iArr[(-9 >>> 1) % N] = i3;
        lArr[(i2 >>> 1) % N] *= ((-(Test0435.lFld--)) + i2);
        i3 *= (-((10 - i3) + (-64882 + iMeth1(f3))));
        dArr[(i2 >>> 1) % N][(3 >>> 1) % N] += i3;
        i19 = 1;
        while (++i19 < 322) {
            d4 = 1;
            do {
                i21 = 1;
                do {
                    i2 = i21;
                    Test0435.iArrFld[i19] = i22;
                    iArr[i19 + 1] = (int) Test0435.lFld;
                    i2 += (((i21 * i3) + i3) - f3);
                    i22 = (int) Test0435.lFld;
                } while ((i21 -= 3) > 0);
                for (i23 = 1; 1 > i23; ++i23) {
                    Test0435.lFld *= i22;
                    f3 += i2;
                }
            } while (++d4 < 5);
        }
        long meth_res = i2 + i3 + Float.floatToIntBits(f3) + i19 + Double.doubleToLongBits(d4) + i21 + i22 + i23 + i24
            + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i1=6, i25=150, i26=158, i27=-14653, i28=52057, i29=202, i30=-111, i31=12, i32=-2, i33=-22937, i34=108;
        float f=0.913F;
        float[] fArr1 =new float[N];
        double d5=1.118107;
        short s1=11949;
        short[] sArr =new short[N];
        long[] lArr3 =new long[N];

        FuzzerUtils.init(sArr, (short)-22750);
        FuzzerUtils.init(lArr3, 6L);
        FuzzerUtils.init(fArr1, -55.639F);

        vMeth(dArrFld[(-63912 >>> 1) % N], Test0435.instanceCount--, Long.reverseBytes((long) (i1 + f)) +
            Float.intBitsToFloat(iMeth(i1, i1)));
        sArr[(i1 >>> 1) % N] *= (short) Test0435.instanceCount;
        d5 += Test0435.lFld;
        for (i25 = 16; i25 < 323; i25++) {
            for (i27 = 4; i27 < 82; ++i27) {
                i28 += (i27 * i1);
                lArr3 = lArr3;
                d5 *= s1;
                i28 = (int)269848505L;
            }
            f *= i1;
            fArr1[i25 + 1] -= i26;
            Test0435.instanceCount = i25;
            i1 += (i25 | i25);
        }
        lArr3[(-1 >>> 1) % N] = i28;
        i28 |= i28;
        for (i29 = 12; i29 < 275; i29++) {
            i26 += (((i29 * i1) + i26) - Test0435.instanceCount);
            for (i31 = 2; i31 < 96; i31++) {
                i30 += (((i31 * i26) + i26) - i26);
                i30 = (int) Test0435.instanceCount;
                if (true) continue;
                for (i33 = i29; i33 < 2; i33++) {
                    i34 += i33;
                    i30 += (i33 * i31);
                }
                i32 >>= (int) Test0435.lFld;
                i32 += i31;
                f -= i32;
                i28 *= i1;
                i1 += 141;
            }
            Test0435.iArrFld[i29 + 1] = i33;
        }

        FuzzerUtils.out.println("i1 f d5 = " + i1 + "," + Float.floatToIntBits(f) + "," + Double.doubleToLongBits(d5));
        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("i28 s1 i29 = " + i28 + "," + s1 + "," + i29);
        FuzzerUtils.out.println("i30 i31 i32 = " + i30 + "," + i31 + "," + i32);
        FuzzerUtils.out.println("i33 i34 sArr = " + i33 + "," + i34 + "," + FuzzerUtils.checkSum(sArr));
        FuzzerUtils.out.println("lArr3 fArr1 = " + FuzzerUtils.checkSum(lArr3) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));

        FuzzerUtils.out.println("Test0435.instanceCount Test0435.lFld Test0435.byFld = " + Test0435.instanceCount + "," + Test0435.lFld +
                "," + Test0435.byFld);
        FuzzerUtils.out.println("dArrFld Test0435.iArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)) +
                "," + FuzzerUtils.checkSum(Test0435.iArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth2_check_sum: " + iMeth2_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0435 _instance = new Test0435();
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  iMeth2 ->  iMeth2 iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
