// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:32 2023
public class Test0422 {

    public static final int N = 400;

    public static long instanceCount=35045L;
    public double dFld=-114.122456;
    public static boolean bFld=true;
    public static int iFld=10;
    public double[] dArrFld =new double[N];
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0422.iArrFld, 5);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l, float f2, int i3) {

        double d1=0.3206;
        int i4=2, i5=-12843, i6=-2, i7=-155;
        short s=-10939;
        long l1=338571013L;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, 63968L);

        for (d1 = 2; d1 < 139; ++d1) {
            for (i5 = 1; i5 < 11; ++i5) {
                l = i5;
                Test0422.bFld = Test0422.bFld;
                s += (short)i5;
                Test0422.instanceCount ^= -217;
                for (l1 = 1; l1 < 2; l1++) {
                    i6 = i7;
                    Test0422.instanceCount += i4;
                    i6 = i3;
                    try {
                        i4 = (-22 / i7);
                        i7 = (i7 % i5);
                        i4 = (-34 % i5);
                    } catch (ArithmeticException a_e) {}
                    lArr[(int)(d1)] -= i3;
                    l >>= Test0422.instanceCount;
                    i6 += (int)(87.257F + (l1 * l1));
                    Test0422.iArrFld[(int) (l1)] = i6;
                }
            }
        }
        vMeth1_check_sum += l + Float.floatToIntBits(f2) + i3 + Double.doubleToLongBits(d1) + i4 + i5 + i6 + s + l1 +
            i7 + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth() {

        int i2=-161, i8=-249, i9=114;
        float f1=-2.876F;
        float f3=1.618F;
        float[] fArr =new float[N];
        double d2=2.82759;
        short s1=10435;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(fArr, 0.366F);
        FuzzerUtils.init(lArr1, -2332660274L);

        i2 = (int) ((long) (i2 * (f1 * i2)) >> (long) ((--fArr[(i2 >>> 1) % N]) - (Test0422.instanceCount + i2)));
        vMeth1(-50L, f1, i2);
        i8 = 1;
        while (++i8 < 375) {
            for (f3 = 1; f3 < 5; ++f3) {
                d2 = 1;
                do {
                    s1 = (short)i8;
                    f1 += -242;
                    i2 += (int)d2;
                    fArr[(int)(f3)] += i9;
                    lArr1[(int)(d2)] += (long)f3;
                    if (Test0422.bFld) {
                        Test0422.instanceCount += Test0422.instanceCount;
                        if (i2 != 0) {
                            vMeth_check_sum += i2 + Float.floatToIntBits(f1) + i8 + Float.floatToIntBits(f3) + i9 +
                                Double.doubleToLongBits(d2) + s1 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr))
                                + FuzzerUtils.checkSum(lArr1);
                            return;
                        }
                        i2 += (int)(d2 + i9);
                    } else if (Test0422.bFld) {
                        Test0422.instanceCount <<= 89;
                    } else if (false) {
                        if (i2 != 0) {
                            vMeth_check_sum += i2 + Float.floatToIntBits(f1) + i8 + Float.floatToIntBits(f3) + i9 +
                                Double.doubleToLongBits(d2) + s1 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr))
                                + FuzzerUtils.checkSum(lArr1);
                            return;
                        }
                    } else {
                        f1 -= Test0422.instanceCount;
                    }
                } while (++d2 < 2);
            }
        }
        vMeth_check_sum += i2 + Float.floatToIntBits(f1) + i8 + Float.floatToIntBits(f3) + i9 +
            Double.doubleToLongBits(d2) + s1 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(lArr1);
    }

    public static long lMeth(float f) {

        int i1=-8, i10=-78, i11=-11, i13=-7;
        double d=-2.121139;
        float f4=-50.978F;
        long[] lArr2 =new long[N];

        FuzzerUtils.init(lArr2, 48106L);

        i1 += (int) ((Test0422.iArrFld[(i1 >>> 1) % N]++) / (((long) ((f + i1) * (i1 * d))) | 1));
        Test0422.instanceCount = (i1 | (i1 - (-1 + (i1 + i1))));
        vMeth();
        lArr2[(0 >>> 1) % N] += Test0422.instanceCount;
        i1 += 61;
        for (i10 = 7; i10 < 206; ++i10) {
            Test0422.instanceCount *= 3;
            f += (i10 * i10);
            Test0422.instanceCount *= i11;
            d = -249;
            i11 += i10;
            i1 -= i11;
            for (f4 = 1; f4 < 8; ++f4) {
                Test0422.instanceCount = i11;
                try {
                    i11 = (i10 / -34540);
                    Test0422.iArrFld[(int) (f4)] = (i13 % 63870);
                    i13 = (i13 % 239);
                } catch (ArithmeticException a_e) {}
            }
        }
        long meth_res = Float.floatToIntBits(f) + i1 + Double.doubleToLongBits(d) + i10 + i11 +
            Float.floatToIntBits(f4) + i13 + FuzzerUtils.checkSum(lArr2);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=3, i14=2, i15=11, i16=8, i17=156, i18=-12053, i19=-14, i20=12, i21=52646, i22=62639, i23=-8, i24=-95,
            i25=59953, i26=-191, i27=2;
        float f5=-1.341F;
        long[] lArr3 =new long[N];

        FuzzerUtils.init(lArr3, -8L);

        i -= (int)((dFld--) - (-dArrFld[(i >>> 1) % N]));
        i = (int)(lMeth(f5) / (i | 1));
        for (i14 = 5; 147 > i14; i14 += 2) {
            dFld = Test0422.instanceCount;
        }
        for (i16 = 10; i16 < 317; ++i16) {
            for (i18 = 1; i18 < 82; i18++) {
                i19 -= (int)f5;
            }
            for (i20 = i16; i20 < 82; i20++) {
                for (i22 = 1; i22 < 1; ++i22) {
                    i23 -= i22;
                }
                i17 >>= 5956;
                Test0422.iFld += (8295 + (i20 * i20));
                Test0422.instanceCount <<= i23;
                Test0422.iFld += i22;
                Test0422.instanceCount -= 184;
                Test0422.instanceCount += (((i20 * i14) + f5) - i23);
            }
            for (i24 = 5; i24 < 82; i24 += 3) {
                Test0422.instanceCount = i20;
                i21 = (int) Test0422.instanceCount;
                i15 -= Test0422.iFld;
                for (i26 = 4; i26 > 1; i26 -= 2) {
                    i23 %= -2;
                    lArr3[i26 - 1] -= i25;
                    dFld *= i24;
                    Test0422.instanceCount += (((i26 * Test0422.iFld) + i26) - f5);
                    i19 += (int) Test0422.instanceCount;
                    i25 += (int)(211L + (i26 * i26));
                    i += (i26 | i20);
                    i23 = (int)1.75445;
                    i17 += (i26 * i26);
                }
            }
        }

        FuzzerUtils.out.println("i f5 i14 = " + i + "," + Float.floatToIntBits(f5) + "," + i14);
        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 lArr3 = " + i27 + "," + FuzzerUtils.checkSum(lArr3));

        FuzzerUtils.out.println("Test0422.instanceCount dFld Test0422.bFld = " + Test0422.instanceCount + "," +
                Double.doubleToLongBits(dFld) + "," + (Test0422.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0422.iFld dArrFld Test0422.iArrFld = " + Test0422.iFld + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)) + "," + FuzzerUtils.checkSum(Test0422.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0422 _instance = new Test0422();
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
