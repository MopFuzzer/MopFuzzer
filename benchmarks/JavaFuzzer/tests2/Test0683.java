// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:44 2023
public class Test0683 {

    public static final int N = 400;

    public static long instanceCount=72L;
    public double dFld=6.49560;
    public static byte byFld=-47;
    public static int iFld1=220;
    public static byte byFld1=104;
    public static int[] iArrFld =new int[N];
    public static volatile int[] iArrFld1 =new int[N];
    public static double[][] dArrFld =new double[N][N];

    static {
        FuzzerUtils.init(Test0683.iArrFld, 0);
        FuzzerUtils.init(Test0683.iArrFld1, -40015);
        FuzzerUtils.init(Test0683.dArrFld, 116.104515);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i3, long l) {

        int i4=-9, i5=90, i6=-3, i7=167, i8=10587;
        float f2=0.340F, f3=-44.407F;
        short s=13676;
        double d1=-1.30041;
        long l1=14L, l2=-8836L;

        i4 = 1;
        do {
            i3 &= 22934;
            f2 *= i3;
            i3 = s;
            i3 += (int)d1;
            for (f3 = 1; 7 > f3; f3++) {
                i5 -= i5;
            }
            i5 += i4;
            l1 += l1;
            for (l2 = i4; l2 < 7; l2++) {
                i3 = (int)l1;
                for (i7 = i4; i7 < 1; i7++) {
                    i3 += Test0683.byFld;
                    i6 *= (int)f2;
                    i6 = (int)f3;
                }
            }
        } while (++i4 < 224);
        long meth_res = i3 + l + i4 + Float.floatToIntBits(f2) + s + Double.doubleToLongBits(d1) +
            Float.floatToIntBits(f3) + i5 + l1 + l2 + i6 + i7 + i8;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth() {

        float f1=1.384F;
        int i9=-241, i10=4677, i11=7, i12=80, i13=32800, i14=116;
        double[] dArr =new double[N];

        FuzzerUtils.init(dArr, -2.84728);

        f1 *= iMeth1(Test0683.iFld1, Test0683.instanceCount);
        f1 -= Test0683.iFld1;
        Test0683.iArrFld[(Test0683.iFld1 >>> 1) % N] ^= (int) Test0683.instanceCount;
        for (i9 = 369; i9 > 16; --i9) {
            dArr[i9 + 1] = -107;
            f1 -= i10;
            for (i11 = 1; i11 < 5; i11++) {
                for (i13 = 2; 1 < i13; i13 -= 3) {
                    boolean b=true;
                    Test0683.instanceCount = i11;
                    Test0683.instanceCount += i13;
                    i14 += (((i13 * Test0683.instanceCount) + Test0683.instanceCount) - i10);
                    i12 = (int)f1;
                    if (b) {
                        i14 = i11;
                        Test0683.instanceCount *= 4;
                    } else if (b) {
                        i12 ^= -144;
                    } else {
                        i10 *= (int)-1.539F;
                    }
                }
            }
        }
        long meth_res = Float.floatToIntBits(f1) + i9 + i10 + i11 + i12 + i13 + i14 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth(int i2, float f) {

        double d2=-2.86852;
        int i15=-142, i16=38, i17=187, i18=43136, i19=-3;
        boolean b1=false;
        long[] lArr =new long[N];
        float[] fArr =new float[N];

        FuzzerUtils.init(lArr, -9L);
        FuzzerUtils.init(fArr, 0.991F);

        lArr[(i2 >>> 1) % N] = Math.min((int)((i2 - dFld) - Math.abs(-109.301F)), (-(33073 + iMeth())) * i2);
        fArr[(Test0683.iFld1 >>> 1) % N] -= (float) dFld;
        for (d2 = 11; d2 < 282; d2++) {
            i16 = 1;
            while (++i16 < 6) {
                i17 = 1;
                do {
                    if (i2 != 0) {
                        vMeth_check_sum += i2 + Float.floatToIntBits(f) + Double.doubleToLongBits(d2) + i15 + i16 + i17
                            + i18 + i19 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(lArr) +
                            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                        return;
                    }
                } while (++i17 < 1);
                Test0683.iFld1 += Test0683.iFld1;
                try {
                    i2 = (-693204187 % Test0683.iFld1);
                    i15 = (6873 / i15);
                    Test0683.iArrFld1[i16] = (-23 % i15);
                } catch (ArithmeticException a_e) {}
                Test0683.iFld1 >>= (int) Test0683.instanceCount;
                Test0683.iFld1 = (int) 2083761843827326011L;
                Test0683.byFld %= (byte) -124;
                for (i18 = 1; i18 < 1; i18++) {
                    b1 = b1;
                    i2 -= i19;
                    i15 += i18;
                }
            }
        }
        vMeth_check_sum += i2 + Float.floatToIntBits(f) + Double.doubleToLongBits(d2) + i15 + i16 + i17 + i18 + i19 +
            (b1 ? 1 : 0) + FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr5) {

        float f4=1.127F;
        int i20=-197, i21=-42112, i22=-148, i23=-8, i24=48834, i25=38940, i26=-40527, i27=-116;
        short s1=23084;
        boolean b2=true;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(lArr1, -212726335L);

        vMeth(Test0683.iFld1, f4);
        i20 = 1;
        do {
            for (i21 = i20; i21 < 72; i21++) {
                Test0683.iFld1 += -89;
                f4 += Test0683.iFld1;
                i23 = 1;
                while (++i23 < 1) {
                    Test0683.iFld1 = i21;
                    lArr1[i23 - 1] -= (long)f4;
                    i22 /= (int)(i23 | 1);
                }
            }
            f4 += (i20 * i20);
            for (i24 = i20; 72 > i24; i24++) {
                for (i26 = 1; i26 < 1; i26++) {
                    Test0683.iFld1 -= s1;
                    Test0683.dArrFld[(i20 >>> 1) % N][i20 + 1] = 0;
                    Test0683.instanceCount = i21;
                    Test0683.iArrFld[i24 + 1] = i20;
                    switch (((Test0683.iFld1 >>> 1) % 10) + 75) {
                    case 75:
                        switch ((i26 % 2) + 46) {
                        case 46:
                        case 47:
                            Test0683.dArrFld[i24][i24] += Test0683.instanceCount;
                            dFld += i21;
                            break;
                        default:
                            f4 -= f4;
                            i25 += i21;
                        }
                        Test0683.iFld1 += (i26 - s1);
                        i22 += (i26 ^ i26);
                    case 76:
                        i25 &= i26;
                        Test0683.instanceCount += (((i26 * i23) + i20) - Test0683.instanceCount);
                        break;
                    case 77:
                        if (b2) {
                            Test0683.iFld1 = (int) dFld;
                            Test0683.iFld1 = i22;
                            Test0683.byFld1 = (byte) i20;
                        } else if (b2) {
                            lArr1[i24] *= i22;
                        } else {
                            Test0683.byFld1 += (byte) -3363;
                        }
                        break;
                    case 78:
                        i22 = (int)f4;
                        break;
                    case 79:
                        i25 = i22;
                    case 80:
                    case 81:
                        Test0683.iArrFld[i26 - 1] = (int) Test0683.instanceCount;
                    case 82:
                        i22 *= i22;
                        break;
                    case 83:
                        Test0683.iArrFld1[i20 - 1] = Test0683.byFld1;
                        break;
                    case 84:
                        i22 += (i26 * i26);
                    default:
                        Test0683.instanceCount += i24;
                    }
                }
            }
        } while (++i20 < 352);

        FuzzerUtils.out.println("f4 i20 i21 = " + Float.floatToIntBits(f4) + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("s1 b2 lArr1 = " + s1 + "," + (b2 ? 1 : 0) + "," + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test0683.instanceCount dFld Test0683.byFld = " + Test0683.instanceCount + "," +
                Double.doubleToLongBits(dFld) + "," + Test0683.byFld);
        FuzzerUtils.out.println("Test0683.iFld1 Test0683.byFld1 Test0683.iArrFld = " + Test0683.iFld1 + "," + Test0683.byFld1 + "," +
                FuzzerUtils.checkSum(Test0683.iArrFld));
        FuzzerUtils.out.println("Test0683.iArrFld1 Test0683.dArrFld = " + FuzzerUtils.checkSum(Test0683.iArrFld1) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0683.dArrFld)));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr4) {

        try {
            Test0683 _instance = new Test0683();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr4);
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
