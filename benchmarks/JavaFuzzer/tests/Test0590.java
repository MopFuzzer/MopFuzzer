// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:08 2023
public class Test0590 {

    public static final int N = 400;

    public static volatile long instanceCount = 3997818286572551983L;
    public static volatile int iFld = 12;
    public static boolean bFld = true;
    public static double[][] dArrFld = new double[N][N];
    public static int[] iArrFld = new int[N];
    public static float[] fArrFld = new float[N];
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0590.dArrFld, 8.60148);
        FuzzerUtils.init(Test0590.iArrFld, 33441);
        FuzzerUtils.init(Test0590.fArrFld, -38.415F);
    }

    public double dFld = 0.67366;
    public volatile boolean[][] bArrFld = new boolean[N][N];

    public static void vMeth1(short s1, float f1) {

        int[] iArr = new int[N];
        long[] lArr1 = new long[N];

        FuzzerUtils.init(iArr, -239);
        FuzzerUtils.init(lArr1, -52L);

        Test0590.iFld = Test0590.iFld;
        Test0590.dArrFld = Test0590.dArrFld;
        Test0590.iFld -= Test0590.iFld;
        iArr = iArr;
        Test0590.iFld ^= Test0590.iFld;
        lArr1[(Test0590.iFld >>> 1) % N] -= Test0590.instanceCount;
        iArr = iArr;
        vMeth1_check_sum += s1 + Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr1);
    }

    public static long lMeth(int i1, int i2) {

        short s2 = 27715;
        int i3 = 7, i4 = 8, i5 = 14, i6 = -27, i7 = -10, i8 = -169, i9 = 180, i10 = -13;
        float f2 = 2.492F;
        byte by = -66;
        boolean b1 = false;
        long[] lArr2 = new long[N];

        FuzzerUtils.init(lArr2, 6698625423700712308L);

        vMeth1(s2, 36.452F);
        for (i3 = 6; 275 > i3; ++i3) {
            Test0590.iFld += i3;
            for (i5 = i3; i5 < 6; i5 += 3) {
                try {
                    Test0590.iArrFld[i3 - 1] = (-40729 / i2);
                    i2 = (Test0590.iArrFld[i3 - 1] % i2);
                    i4 = (20236 % i1);
                } catch (ArithmeticException a_e) {
                }
                i7 = 1;
                do {
                    lArr2[i3 - 1] >>>= Test0590.instanceCount;
                } while (++i7 < 1);
            }
            f2 += (((i3 * f2) + i3) - i4);
            by = (byte) i2;
            b1 = b1;
            for (i8 = i3; i8 < 6; i8++) {
                Test0590.instanceCount >>= i1;
                i10 = 1;
                do {
                    Test0590.iFld += i10;
                    Test0590.iArrFld[i3 + 1] += i6;
                } while (--i10 > 0);
            }
        }
        long meth_res = i1 + i2 + s2 + i3 + i4 + i5 + i6 + i7 + Float.floatToIntBits(f2) + by + (b1 ? 1 : 0) + i8 + i9
                + i10 + FuzzerUtils.checkSum(lArr2);
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public static void vMeth(double d, short s) {

        boolean b = false;
        int i = -42184;
        float f = -2.903F;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, 3578L);

        b = b;
        i = (int) (lArr[(i >>> 1) % N]--);
        i += (int) (((long) (i - f) & (long) (f + s)) * (lArr[(i >>> 1) % N] - lMeth(i, Test0590.iFld)));
        i -= i;
        vMeth_check_sum += Double.doubleToLongBits(d) + s + (b ? 1 : 0) + i + Float.floatToIntBits(f) +
                FuzzerUtils.checkSum(lArr);
    }

    public static void main(String[] strArr) {

        try {
            Test0590 _instance = new Test0590();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        float f3 = 0.114F, f4 = -96.581F;
        double d1 = -1.16420;
        int i11 = 154, i12 = 177, i13 = -41263, i14 = -62768, i15 = 206, i16 = -35872, i17 = 59186;

        vMeth(dFld, (short) (19901));
        dFld *= f3;
        Test0590.iFld = (int) Test0590.instanceCount;
        for (d1 = 182; d1 > 4; d1--) {
            i12 = 141;
            do {
                dFld += i11;
            } while (--i12 > 0);
            Test0590.fArrFld[(int) (d1 + 1)] -= -52.332F;
            i11 |= (int) Test0590.instanceCount;
            Test0590.iFld += (int) ((long) d1 | Test0590.instanceCount);
        }
        Test0590.iFld = Test0590.iFld;
        bArrFld[(i11 >>> 1) % N] = FuzzerUtils.boolean1array(N, (boolean) false);
        f3 += (float) d1;
        dFld = dFld;
        Test0590.iArrFld[(i11 >>> 1) % N] -= i11;
        for (i13 = 2; 181 > i13; i13++) {
            f3 += i13;
            Test0590.iArrFld[i13] -= (int) Test0590.instanceCount;
            i14 >>= 137;
            i11 = (int) -101.39968;
            Test0590.iFld += i13;
            Test0590.iFld += 0;
            Test0590.iFld += i13;
        }
        for (f4 = 13; f4 < 229; f4++) {
            f3 = 23120;
            i11 = i14;
            if (true) break;
            for (i16 = 5; i16 < 116; i16++) {
                Test0590.bFld = Test0590.bFld;
                dFld = Test0590.instanceCount;
            }
            Test0590.iArrFld[(int) (f4 + 1)] = (int) Test0590.instanceCount;
        }

        FuzzerUtils.out.println("f3 d1 i11 = " + Float.floatToIntBits(f3) + "," + Double.doubleToLongBits(d1) + "," +
                i11);
        FuzzerUtils.out.println("i12 i13 i14 = " + i12 + "," + i13 + "," + i14);
        FuzzerUtils.out.println("f4 i15 i16 = " + Float.floatToIntBits(f4) + "," + i15 + "," + i16);
        FuzzerUtils.out.println("i17 = " + i17);

        FuzzerUtils.out.println("Test0590.instanceCount Test0590.iFld dFld = " + Test0590.instanceCount + "," + Test0590.iFld + "," +
                Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("Test0590.bFld Test0590.dArrFld Test0590.iArrFld = " + (Test0590.bFld ? 1 : 0) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0590.dArrFld)) + "," + FuzzerUtils.checkSum(Test0590.iArrFld));
        FuzzerUtils.out.println("Test0590.fArrFld bArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0590.fArrFld))
                + "," + FuzzerUtils.checkSum(bArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
