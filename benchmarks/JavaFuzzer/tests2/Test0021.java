// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:12 2023
public class Test0021 {

    public static final int N = 400;

    public static long instanceCount=8273730419302875068L;
    public volatile boolean bFld=false;
    public static volatile byte byFld=120;
    public static int[][] iArrFld =new int[N][N];
    public static double[] dArrFld =new double[N];
    public static float[] fArrFld =new float[N];

    static {
        FuzzerUtils.init(Test0021.iArrFld, 21794);
        FuzzerUtils.init(Test0021.dArrFld, 2.8941);
        FuzzerUtils.init(Test0021.fArrFld, 0.336F);
    }

    public static long dMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i7, int i8) {

        byte by=-114;
        int i9=-14, i10=219, i11=65031, i12=4539, i13=-78, i14=17705;
        float f=-60.647F;
        boolean b=true;

        i8 = i7;
        i8 = i7;
        if (b) {
            i7 = i8;
            by -= (byte)i8;
        } else if (b) {
            for (i9 = 10; i9 < 180; i9++) {
                for (i11 = 1; i11 < 9; i11++) {
                    f += i7;
                    for (i13 = 2; i13 > i11; i13 -= 3) {
                        Test0021.instanceCount *= -11;
                        i10 *= i7;
                        Test0021.iArrFld[i13 - 1][i13] = i9;
                        if (i11 != 0) {
                            vMeth1_check_sum += i7 + i8 + by + i9 + i10 + i11 + i12 + Float.floatToIntBits(f) + i13 +
                                i14 + (b ? 1 : 0);
                            return;
                        }
                        i7 += i13;
                        f += (((i13 * i9) + i14) - f);
                    }
                }
            }
            vMeth1_check_sum += i7 + i8 + by + i9 + i10 + i11 + i12 + Float.floatToIntBits(f) + i13 + i14 + (b ? 1 : 0);
            return;
        } else {
            i8 += (int) Test0021.instanceCount;
        }
        vMeth1_check_sum += i7 + i8 + by + i9 + i10 + i11 + i12 + Float.floatToIntBits(f) + i13 + i14 + (b ? 1 : 0);
    }

    public static void vMeth(int i5, long l1, int i6) {

        int i15=-3, i16=-129, i17=54108, i18=-63787, i19=3, i20=5;
        short s=27380;
        float f1=-2.711F;
        float[] fArr =new float[N];

        FuzzerUtils.init(fArr, -67.998F);

        vMeth1(i6, 168);
        i6 = (int)l1;
        for (i15 = 10; i15 < 162; ++i15) {
            for (i17 = 1; i17 < 10; ++i17) {
                for (i19 = 2; 1 < i19; i19--) {
                    i5 += (i19 | l1);
                    i20 += (i19 ^ i15);
                    i5 ^= (int)l1;
                    l1 ^= l1;
                    i5 += (((i19 * s) + i15) - i17);
                    i18 *= (int)f1;
                    i6 = (int)f1;
                    i6 += i18;
                    fArr[i19] = i18;
                    i6 = (int)l1;
                }
            }
        }
        vMeth_check_sum += i5 + l1 + i6 + i15 + i16 + i17 + i18 + i19 + i20 + s + Float.floatToIntBits(f1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static double dMeth(double d, int i4) {

        int i21=-3;
        int i22=58592;
        int i24=-7;
        int i25=29505;
        int i26=-10;
        int i27=26246;
        int[] iArr1 =new int[N];
        int[][] iArr2 =new int[N][N];
        float f2=27.744F;
        short s1=-29740;
        long[] lArr =new long[N];

        FuzzerUtils.init(iArr1, -13);
        FuzzerUtils.init(iArr2, 30541);
        FuzzerUtils.init(lArr, 51544L);

        Test0021.instanceCount = (long) (--d);
        vMeth(i4, Test0021.instanceCount, i4);
        i4 >>= (int) Test0021.instanceCount;
        for (i21 = 12; i21 < 210; i21++) {
            d = i22;
            i24 = 1;
            while (++i24 < 8) {
                Test0021.fArrFld[i21 + 1] += i22;
                for (i25 = i21; i25 < 1; ++i25) {
                    Test0021.fArrFld[i25 - 1] = i22;
                    i22 += i25;
                    Test0021.iArrFld = iArr2;
                    i27 -= i22;
                    i26 += (((i25 * Test0021.instanceCount) + i27) - f2);
                    lArr[i21 - 1] *= s1;
                    i26 += i25;
                }
            }
        }
        long meth_res = Double.doubleToLongBits(d) + i4 + i21 + i22 + i24 + i25 + i26 + i27 + Float.floatToIntBits(f2)
            + s1 + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(lArr);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=64787;
        int i1=16973;
        int i2=10;
        int i3=-13;
        int i28=-13;
        int i29=-108;
        int i30=151;
        int i31=179;
        int i32=188;
        int[] iArr =new int[N];
        long l=4726L;
        double d2=-102.62034, d3=89.89718;
        float f3=0.46F;
        boolean b1=false;
        short s2=-16603;

        FuzzerUtils.init(iArr, -11569);

        for (i = 14; i < 244; ++i) {
            i2 = 109;
            while (--i2 > 0) {
                Test0021.instanceCount += i2;
                for (l = i; 1 > l; l++) {
                    iArr[(int)(l + 1)] |= (i3++);
                }
                Test0021.instanceCount *= (long) dMeth(d2, i1);
                i3 += (((i2 * i2) + f3) - f3);
                b1 = bFld;
                i1 = i2;
            }
            Test0021.instanceCount >>>= Test0021.instanceCount;
        }
        d3 = 1;
        while (++d3 < 367) {
            for (i28 = (int)(d3); 69 > i28; ++i28) {
                d2 = 118;
                i30 = 1;
                while (++i30 < 1) {
                    Test0021.byFld = (byte) i28;
                    iArr[i28] *= i2;
                    iArr[(int)(d3)] += i30;
                    i1 = (int)8173667276277260408L;
                    i29 = s2;
                    i1 >>= i28;
                    i3 += (i30 * Test0021.byFld);
                }
                i1 *= i28;
                for (i31 = (int)(d3); i31 < 1; ++i31) {
                    f3 += -77;
                    Test0021.instanceCount = (long) d2;
                    Test0021.iArrFld[i31 - 1][i28 - 1] = i30;
                    Test0021.instanceCount -= Test0021.instanceCount;
                    iArr[(int) (d3)] -= Test0021.byFld;
                    d2 -= l;
                    iArr[(int)(d3)] = -86;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("l i3 d2 = " + l + "," + i3 + "," + Double.doubleToLongBits(d2));
        FuzzerUtils.out.println("f3 b1 d3 = " + Float.floatToIntBits(f3) + "," + (b1 ? 1 : 0) + "," +
            Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("i28 i29 i30 = " + i28 + "," + i29 + "," + i30);
        FuzzerUtils.out.println("s2 i31 i32 = " + s2 + "," + i31 + "," + i32);
        FuzzerUtils.out.println("iArr = " + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test0021.instanceCount bFld Test0021.byFld = " + Test0021.instanceCount + "," + (bFld ? 1 : 0) +
                "," + Test0021.byFld);
        FuzzerUtils.out.println("Test0021.iArrFld Test0021.dArrFld Test0021.fArrFld = " + FuzzerUtils.checkSum(Test0021.iArrFld) + ","
                + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0021.dArrFld)) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0021.fArrFld)));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0021 _instance = new Test0021();
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
//DEBUG  dMeth ->  dMeth mainTest
//DEBUG  vMeth ->  vMeth dMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth dMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
