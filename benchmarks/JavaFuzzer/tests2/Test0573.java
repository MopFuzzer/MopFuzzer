// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:38 2023
public class Test0573 {

    public static final int N = 400;

    public static long instanceCount=-86L;
    public static volatile int iFld=1;
    public static byte byFld=95;
    public short sFld=4214;
    public static int[] iArrFld =new int[N];
    public volatile double[] dArrFld =new double[N];
    public static short[] sArrFld =new short[N];
    public static double[] dArrFld1 =new double[N];
    public float[] fArrFld =new float[N];

    static {
        FuzzerUtils.init(Test0573.iArrFld, -65266);
        FuzzerUtils.init(Test0573.sArrFld, (short) -19499);
        FuzzerUtils.init(Test0573.dArrFld1, -2.58152);
    }

    public static long iMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(long l) {

        float f2=0.959F;
        int i9=13, i10=0, i11=-1, i12=135;
        short s=-4079;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, 8326366608180245404L);

        Test0573.dArrFld1[(Test0573.iFld >>> 1) % N] = f2;
        Test0573.iFld *= -199;
        for (i9 = 167; 5 < i9; --i9) {
            l >>= i9;
            Test0573.iFld |= Test0573.iFld;
            i10 += (i9 | (long)f2);
            lArr[i9] %= ((long)(f2) | 1);
            Test0573.iFld += (int) l;
            if (i10 != 0) {
            }
            for (i11 = i9; i11 < 10; i11++) {
                l += (i11 * i12);
                if (i11 != 0) {
                }
                Test0573.iFld = -2;
                Test0573.iFld >>= i9;
                s -= (short)f2;
            }
        }
        long meth_res = l + Float.floatToIntBits(f2) + i9 + i10 + i11 + i12 + s + FuzzerUtils.checkSum(lArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static short sMeth(int i8, float f1) {

        int i13=-6, i14=10, i15=43455, i16=-14572, i17=27309, i18=-21042;
        byte by=-91;
        long l1=-21758L;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(lArr1, -6L);

        Test0573.sArrFld[(i8 >>> 1) % N] += (short) (f1++);
        i8 = (int)fMeth(5144L);
        Test0573.iFld += Test0573.iFld;
        for (i13 = 3; i13 < 295; i13++) {
            by |= (byte)i8;
        }
        lArr1[(Test0573.iFld >>> 1) % N] >>= by;
        i8 -= i14;
        i15 = 1;
        while (++i15 < 395) {
            if (i8 != 0) {
            }
            f1 += i14;
            i8 >>= i15;
            for (l1 = 4; l1 > 1; l1--) {
                for (i17 = 2; i17 > 1; i17 -= 3) {
                    i8 += (234 + (i17 * i17));
                    Test0573.instanceCount -= i14;
                }
            }
        }
        long meth_res = i8 + Float.floatToIntBits(f1) + i13 + i14 + by + i15 + l1 + i16 + i17 + i18 +
            FuzzerUtils.checkSum(lArr1);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static int iMeth() {

        int i6=53870, i7=3, i19=-121, i20=-200, i21=-3203, i22=-142, i23=58016, i24=4;
        float f3=0.126F;
        short s1=9333;

        for (i6 = 6; i6 < 235; i6++) {
            sMeth(i7, f3);
            i7 = (int)6354146684663242695L;
        }
        Test0573.byFld ^= (byte) i6;
        for (i19 = 1; 331 > i19; ++i19) {
            for (i21 = 5; i21 > 1; --i21) {
                i20 += (((i21 * Test0573.iFld) + i7) - i6);
            }
            s1 = (short) Test0573.instanceCount;
            Test0573.instanceCount -= i19;
            Test0573.iArrFld[i19 - 1] <<= -45955;
            i7 = i21;
            for (i23 = 1; 5 > i23; ++i23) {
                i20 = 11;
                f3 *= s1;
                i22 = (int)f3;
            }
        }
        long meth_res = i6 + i7 + Float.floatToIntBits(f3) + i19 + i20 + i21 + i22 + s1 + i23 + i24;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-5;
        int i1=-133;
        int i2=86;
        int i3=-45;
        int i4=-64689;
        int i5=-28503;
        int i26=-1;
        int i27=29;
        int[][] iArr =new int[N][N];
        float f=0.300F;
        boolean b=false;
        double d=2.63445;

        FuzzerUtils.init(iArr, -1590);

        Test0573.iArrFld = (Test0573.iArrFld = (Test0573.iArrFld = (Test0573.iArrFld = FuzzerUtils.int1array(N, (int) -12874))));
        for (i = 6; i < 241; ++i) {
            Test0573.instanceCount = -676576838L;
            for (i2 = 2; i2 < 107; ++i2) {
                for (i4 = 1; i4 < 2; ++i4) {
                    dArrFld[i2 + 1] = ((--f) * (42002 + (f - i4)));
                    i1 = iMeth();
                    f += i1;
                    Test0573.iArrFld[i] += i4;
                    sFld -= (short) Test0573.iFld;
                    i5 *= (int) Test0573.instanceCount;
                    Test0573.iArrFld[i + 1] = i2;
                    try {
                        i3 = (-150 / i2);
                        i1 = (10799 % i5);
                        Test0573.iArrFld[i4 - 1] = (Test0573.iFld / -573569198);
                    } catch (ArithmeticException a_e) {}
                    Test0573.iFld = (int) f;
                }
                fArrFld[i] += -1110102847L;
                if (b) {
                    dArrFld[i2] = f;
                    Test0573.iFld += i2;
                    Test0573.byFld = (byte) Test0573.instanceCount;
                }
                iArr = iArr;
            }
            Test0573.iFld *= i4;
        }
        f += Test0573.iFld;
        for (int i25 : Test0573.iArrFld) {
            for (i26 = 1; i26 < 63; i26++) {
                switch (((i2 >>> 1) % 2) + 106) {
                case 106:
                    d -= -75;
                    break;
                case 107:
                    i1 -= i25;
                    iArr[i26][i26 - 1] = i26;
                    i3 *= (int)f;
                    break;
                }
                i27 += -1;
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i4 i5 = " + i3 + "," + i4 + "," + i5);
        FuzzerUtils.out.println("f b i26 = " + Float.floatToIntBits(f) + "," + (b ? 1 : 0) + "," + i26);
        FuzzerUtils.out.println("i27 d iArr = " + i27 + "," + Double.doubleToLongBits(d) + "," +
            FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test0573.instanceCount Test0573.iFld Test0573.byFld = " + Test0573.instanceCount + "," + Test0573.iFld +
                "," + Test0573.byFld);
        FuzzerUtils.out.println("sFld Test0573.iArrFld dArrFld = " + sFld + "," + FuzzerUtils.checkSum(Test0573.iArrFld) + ","
            + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));
        FuzzerUtils.out.println("Test0573.sArrFld Test0573.dArrFld1 fArrFld = " + FuzzerUtils.checkSum(Test0573.sArrFld) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0573.dArrFld1)) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));

        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0573 _instance = new Test0573();
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  sMeth ->  sMeth iMeth mainTest
//DEBUG  fMeth ->  fMeth sMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
