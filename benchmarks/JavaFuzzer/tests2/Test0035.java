// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:14 2023
public class Test0035 {

    public static final int N = 400;

    public static volatile long instanceCount=-3599947666L;
    public static byte byFld=-25;
    public static float fFld=-114.152F;
    public static int iFld=47355;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long l, int i4, long l1) {

        byte by=14;
        int i5=54629;
        int i6=-198;
        int i7=-126;
        int i8=0;
        int i9=6;
        int i10=102;
        int i11=32953;
        int i12=83;
        int i13=5;
        int[] iArr =new int[N];
        short s=23819;
        float f1=0.656F;
        double d1=1.3876;

        FuzzerUtils.init(iArr, 23289);

        iArr[(i4 >>> 1) % N] &= by;
        i5 = 1;
        while (++i5 < 164) {
            i4 = i4;
            for (i6 = 1; i6 < 10; ++i6) {
                i7 = i4;
                s = (short)164;
            }
            iArr[i5 - 1] = i7;
            i7 = (int)f1;
        }
        for (i8 = 22; i8 < 368; i8++) {
            for (i10 = 1; 5 > i10; i10++) {
                i4 *= 7;
                i7 -= -5;
                for (i12 = 1; i12 < 2; ++i12) {
                    d1 -= 143;
                }
                l1 *= l1;
            }
        }
        vMeth2_check_sum += l + i4 + l1 + by + i5 + i6 + i7 + s + Float.floatToIntBits(f1) + i8 + i9 + i10 + i11 + i12
            + i13 + Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(double d, int i3, float f) {

        int i14=11;
        int i15=52469;
        int i16=149;
        int i17=4036;
        int i18=-61;
        int[][] iArr1 =new int[N][N];

        FuzzerUtils.init(iArr1, 7);

        vMeth2(Test0035.instanceCount, i3, Test0035.instanceCount);
        for (i14 = 8; i14 < 181; i14++) {
            i15 -= (int)29.79610;
            i3 -= (int)f;
            i16 = 1;
            do {
                i3 += (i16 * i16);
                i3 += (10 + (i16 * i16));
                iArr1[i16 - 1][(i15 >>> 1) % N] -= i3;
                i3 += i16;
            } while (++i16 < 9);
            Test0035.instanceCount += i14;
            d = i15;
            Test0035.instanceCount *= Test0035.byFld;
            for (i17 = 1; i17 < 9; i17++) {
                try {
                    i3 = (i14 % i3);
                    i3 = (i14 % iArr1[(i3 >>> 1) % N][i17]);
                    i15 = (i15 % i14);
                } catch (ArithmeticException a_e) {}
                d += -1.63867;
            }
        }
        vMeth1_check_sum += Double.doubleToLongBits(d) + i3 + Float.floatToIntBits(f) + i14 + i15 + i16 + i17 + i18 +
            FuzzerUtils.checkSum(iArr1);
    }

    public void vMeth(int i, int i1, int i2) {

        double d2=-2.104567;
        int i19=4;
        int i20=10;
        int i21=-202;
        int i22=8;
        int i23=7;
        int i24=-198;
        int i25=-8;
        int i26=1;
        int[] iArr2 =new int[N];
        boolean b=false;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, 11L);
        FuzzerUtils.init(iArr2, -205);

        vMeth1(d2, i2, Test0035.fFld);
        Test0035.instanceCount += i;
        for (i19 = 233; 1 < i19; --i19) {
            i += (i19 * Test0035.instanceCount);
            d2 = 42021;
            for (i21 = 1; i21 < 7; i21++) {
                i20 *= Test0035.iFld;
            }
        }
        if (b) {
            for (long l2 : lArr) {
                for (i23 = 1; i23 < 4; i23 += 3) {
                    for (i25 = i23; i25 < 4; ++i25) {
                        iArr2 = iArr2;
                    }
                    i20 += (i23 * i23);
                }
                d2 = i23;
                i20 /= (int) (Test0035.instanceCount | 1);
            }
        } else {
            i = (int)42L;
        }
        vMeth_check_sum += i + i1 + i2 + Double.doubleToLongBits(d2) + i19 + i20 + i21 + i22 + i23 + i24 + i25 + i26 +
            (b ? 1 : 0) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i27=-3;
        int i28=47;
        int i29=-28298;
        int i30=-73;
        int i31=90;
        int i32=18;
        int i33=-56167;
        int i34=-88;
        int i35=-32710;
        int i36=-232;
        int[] iArr3 =new
                    int[N];
        short s1=12057;
        double d3=-22.51926;
        double[][] dArr =new double[N][N];
        boolean b1=false;
        long[] lArr1 =new long[N], lArr2 =new long[N];

        FuzzerUtils.init(lArr1, 40908L);
        FuzzerUtils.init(dArr, -1.101837);
        FuzzerUtils.init(lArr2, 9L);
        FuzzerUtils.init(iArr3, 54646);

        vMeth(Test0035.iFld, Test0035.iFld, 177);
        Test0035.fFld -= Test0035.instanceCount;
        Test0035.byFld = (byte) Test0035.iFld;
        Test0035.instanceCount = -157;
        for (i27 = 11; i27 < 218; ++i27) {
            Test0035.fFld -= i27;
            for (i29 = 121; i29 > 7; --i29) {
                Test0035.iFld -= i28;
                i30 += s1;
                lArr1[i29] >>= Test0035.iFld;
                i31 = 1;
                while (++i31 < 2) {
                    dArr[i29 - 1][i31 + 1] += -9512L;
                    lArr2[i31] = i29;
                    d3 += -2;
                    Test0035.instanceCount += Test0035.byFld;
                    Test0035.fFld = (float) d3;
                    iArr3[i31 - 1] = (int)d3;
                    if (b1) continue;
                    Test0035.instanceCount = s1;
                    lArr2[i31] = 217;
                    i28 %= 22283;
                }
                dArr[i27 + 1][i27 - 1] *= i28;
            }
            i28 += (int)1.276F;
            i32 = -30;
            for (i33 = i27; 121 > i33; ++i33) {
                for (i35 = 1; 1 > i35; i35++) {
                    i36 += (((i35 * Test0035.instanceCount) + Test0035.instanceCount) - Test0035.instanceCount);
                    lArr2[i33 + 1] = -1581721778585768848L;
                    i36 += (((i35 * Test0035.instanceCount) + Test0035.fFld) - i31);
                    i34 += (i35 - i30);
                }
            }
        }

        FuzzerUtils.out.println("i27 i28 i29 = " + i27 + "," + i28 + "," + i29);
        FuzzerUtils.out.println("i30 s1 i31 = " + i30 + "," + s1 + "," + i31);
        FuzzerUtils.out.println("d3 b1 i32 = " + Double.doubleToLongBits(d3) + "," + (b1 ? 1 : 0) + "," + i32);
        FuzzerUtils.out.println("i33 i34 i35 = " + i33 + "," + i34 + "," + i35);
        FuzzerUtils.out.println("i36 lArr1 dArr = " + i36 + "," + FuzzerUtils.checkSum(lArr1) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));
        FuzzerUtils.out.println("lArr2 iArr3 = " + FuzzerUtils.checkSum(lArr2) + "," + FuzzerUtils.checkSum(iArr3));

        FuzzerUtils.out.println("Test0035.instanceCount Test0035.byFld Test0035.fFld = " + Test0035.instanceCount + "," + Test0035.byFld +
                "," + Float.floatToIntBits(Test0035.fFld));
        FuzzerUtils.out.println("Test0035.iFld = " + Test0035.iFld);

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0035 _instance = new Test0035();
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