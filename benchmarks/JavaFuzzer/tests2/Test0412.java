// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:31 2023
public class Test0412 {

    public static final int N = 400;

    public static long instanceCount=1892130757L;
    public static volatile byte byFld=85;
    public volatile float fFld=-1.599F;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i8=2;
        int i9=-2273;
        int i11=11;
        int[] iArr1 =new int[N];
        double d1=0.52172;
        boolean b=false;
        float f=0.258F;
        float[] fArr =new float[N];

        FuzzerUtils.init(iArr1, -7);
        FuzzerUtils.init(fArr, -1.307F);

        for (i8 = 2; i8 < 285; ++i8) {
            d1 = 1;
            while (++d1 < 6) {
                i11 = 1;
                while ((i11 -= 3) > 0) {
                    i9 = i9;
                    try {
                        i9 = (-217 / i11);
                        i9 = (i11 / -1019929433);
                        iArr1[i8 + 1] = (i11 / -15334);
                    } catch (ArithmeticException a_e) {}
                    i9 += (((i11 * i11) + i11) - Test0412.instanceCount);
                    iArr1[i11 + 1] /= (int)((long)(d1) | 1);
                    fArr[i11] -= i8;
                    if (false) continue;
                    i9 = i8;
                }
                i9 -= (int) Test0412.instanceCount;
                i9 += (int)d1;
                i9 -= 1;
                if (b) continue;
            }
            i9 += (int)f;
        }
        vMeth2_check_sum += i8 + i9 + Double.doubleToLongBits(d1) + i11 + (b ? 1 : 0) + Float.floatToIntBits(f) +
            FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth1() {

        double d=-94.124649;
        double[] dArr =new double[N];
        int i5=-44949;
        int i6=-56842;
        int i7=197;
        int i12=63041;
        int i13=112;
        int i14=2950;
        int i15=-252;
        int[] iArr2 =new int[N];
        short s=-9342;
        float f1=1.970F;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(dArr, 0.95824);
        FuzzerUtils.init(iArr2, 97);
        FuzzerUtils.init(lArr1, 4L);

        d = i5;
        for (i6 = 7; i6 < 249; i6++) {
            int i16=10;
            Test0412.instanceCount += (long) (++dArr[i6]);
            vMeth2();
            for (i12 = 7; i12 > 1; --i12) {
                for (i14 = 1; i14 < 2; ++i14) {
                    i13 += (((i14 * i5) + i13) - s);
                    Test0412.instanceCount = 16890;
                    i5 += (i14 + Test0412.instanceCount);
                    iArr2[i12] <<= i5;
                }
            }
            switch ((i6 % 5) + 69) {
            case 69:
                d += d;
                lArr1[i6 - 1] = -12L;
            case 70:
                Test0412.instanceCount -= i6;
                i7 += i6;
                break;
            case 71:
                d += f1;
                break;
            case 72:
                i16 *= -14;
            case 73:
                i5 *= Test0412.byFld;
                break;
            }
        }
        vMeth1_check_sum += Double.doubleToLongBits(d) + i5 + i6 + i7 + i12 + i13 + i14 + i15 + s +
            Float.floatToIntBits(f1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(lArr1);
    }

    public static void vMeth(int i, int i1) {

        int i2=-6;
        int i3=23;
        int i4=155;
        int[][] iArr =new int[N][N];
        byte by=-6;
        long l=-1192621910L;
        long[] lArr =new long[N];
        short[] sArr =new short[N];
        double[] dArr1 =new double[N];

        FuzzerUtils.init(iArr, 21191);
        FuzzerUtils.init(lArr, -4812154587150108884L);
        FuzzerUtils.init(sArr, (short)4895);
        FuzzerUtils.init(dArr1, 79.67757);

        i = (i1 * iArr[(i1 >>> 1) % N][(-125 >>> 1) % N]);
        for (i2 = 10; i2 < 249; i2++) {
            lArr[i2] -= by;
            i4 = 7;
            while ((i4 -= 3) > 0) {
                vMeth1();
                iArr[i4 + 1][i2 - 1] += (int) Test0412.instanceCount;
                sArr[i4] *= (short) Test0412.instanceCount;
                l = 1;
                while (++l < 3) {
                    i1 += (int) (l - Test0412.instanceCount);
                    i3 += i;
                    iArr[(int)(l)][(int)(l)] = i3;
                    Test0412.instanceCount += i4;
                    dArr1 = dArr1;
                    Test0412.instanceCount -= 3043;
                    i3 <<= i2;
                }
            }
        }
        vMeth_check_sum += i + i1 + i2 + i3 + by + i4 + l + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(sArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1));
    }

    public void mainTest(String[] strArr1) {

        int i17=-83;
        int i18=11;
        int i19=24009;
        int i20=-1;
        int i21=61809;
        int i22=53;
        int i23=-36510;
        int i24=-201;
        int i25=-8;
        int i26=-57802;
        int i27=-251;
        int i28=-49799;
        int i29=-8;
        int i30=-27643;
        int[][] iArr3 =new int[N][N];
        double d2=-2.67663;
        boolean b1=true;
        float f2=-2.789F;

        FuzzerUtils.init(iArr3, 34985);

        vMeth(i17, i17);
        for (i18 = 13; 216 > i18; i18++) {
            d2 -= -66L;
        }
        i20 = 1;
        do {
            b1 = b1;
            iArr3[i20 - 1] = FuzzerUtils.int1array(N, (int)-13);
        } while (++i20 < 131);
        iArr3[(i17 >>> 1) % N][(i18 >>> 1) % N] = Test0412.byFld;
        for (i21 = 3; i21 < 282; ++i21) {
            for (i23 = 4; i23 < 90; ++i23) {
                for (i25 = 2; i25 > 1; i25--) {
                    iArr3[i25][i23] *= i22;
                    i19 |= (int)-9L;
                    i24 = (int) Test0412.instanceCount;
                    d2 += f2;
                    iArr3[i25 - 1][i23] -= (int) Test0412.instanceCount;
                    i24 <<= i25;
                    i26 += (i25 + f2);
                    i19 += (((i25 * Test0412.instanceCount) + Test0412.byFld) - f2);
                }
                i22 += (1 + (i23 * i23));
                iArr3[i23 + 1][i21 - 1] += (int) Test0412.instanceCount;
                i19 = i20;
                Test0412.byFld += (byte) (i23 * i23);
                fFld -= fFld;
                for (i27 = 1; i27 < 2; i27++) {
                    i28 >>= Test0412.byFld;
                }
                for (i29 = 1; 2 > i29; i29++) {
                    iArr3[i21] = iArr3[i23 - 1];
                    i28 += (((i29 * i30) + i17) - Test0412.instanceCount);
                    i26 += i22;
                }
                i24 += (int)(-6047562959320016891L + (i23 * i23));
            }
        }

        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("d2 i20 b1 = " + Double.doubleToLongBits(d2) + "," + i20 + "," + (b1 ? 1 : 0));
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("f2 i27 i28 = " + Float.floatToIntBits(f2) + "," + i27 + "," + i28);
        FuzzerUtils.out.println("i29 i30 iArr3 = " + i29 + "," + i30 + "," + FuzzerUtils.checkSum(iArr3));

        FuzzerUtils.out.println("Test0412.instanceCount Test0412.byFld fFld = " + Test0412.instanceCount + "," + Test0412.byFld + "," +
            Float.floatToIntBits(fFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0412 _instance = new Test0412();
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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}