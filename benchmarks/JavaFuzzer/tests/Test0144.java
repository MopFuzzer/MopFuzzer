// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:56 2023
public class Test0144 {

    public static final int N = 400;

    public static volatile long instanceCount = 231L;
    public static float fFld = 0.322F;
    public static double dFld = 59.94438;
    public static volatile boolean bFld = true;
    public static volatile short sFld = -1238;
    public static int[] iArrFld = new int[N];
    public static volatile short[] sArrFld = new short[N];
    public static long[] lArrFld = new long[N];
    public static boolean[] bArrFld = new boolean[N];
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0144.iArrFld, -145);
        FuzzerUtils.init(Test0144.sArrFld, (short) 8177);
        FuzzerUtils.init(Test0144.lArrFld, -14L);
        FuzzerUtils.init(Test0144.bArrFld, false);
    }

    public static void vMeth1() {

        int i4 = -4;
        int i5 = -207;
        int i6 = 188;
        int i7 = 13;
        int i8 = 3;
        int[] iArr = new int[N];
        double d1 = 0.49360;
        short s = 3412;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, -4L);
        FuzzerUtils.init(iArr, 12);

        i4 += (int) d1;
        for (i5 = 14; 383 > i5; i5++) {
            s |= (short) 59;
            i4 += (((i5 * i4) + i6) - Test0144.instanceCount);
            i7 = 5;
            while (--i7 > 0) {
                Test0144.instanceCount *= i4;
            }
            Test0144.fFld += (((i5 * i7) + Test0144.fFld) - i4);
            lArr[i5 + 1] += i7;
            i8 = 5;
            while ((i8 -= 2) > 0) {
                iArr = iArr;
                i6 += (i8 ^ (long) Test0144.fFld);
            }
            Test0144.fFld += i5;
        }
        vMeth1_check_sum += i4 + Double.doubleToLongBits(d1) + i5 + i6 + s + i7 + i8 + FuzzerUtils.checkSum(lArr) +
                FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(long l) {

        int i2 = -80;
        int i3 = 46758;
        int i9 = -29791;
        int i10 = 133;
        int i11 = -62038;
        int[] iArr1 = new int[N];
        short s1 = 3768;
        boolean b = false;

        FuzzerUtils.init(iArr1, -11);

        for (i2 = 18; i2 < 314; ++i2) {
            switch ((i2 % 2) + 106) {
                case 106:
                    vMeth1();
                    break;
                case 107:
                    i3 += (((i2 * i3) + s1) - Test0144.fFld);
                    Test0144.dFld += i2;
                    break;
                default:
                    if (b) continue;
                    i3 += i2;
                    for (i9 = 6; i9 > 1; i9--) {
                        byte by1 = 49;
                        Test0144.fFld = by1;
                        i11 = 1;
                        while (++i11 < 2) {
                            i10 += i2;
                            iArr1[i9 - 1] = -13954;
                            i10 += (-44444 + (i11 * i11));
                            i10 *= i11;
                        }
                        Test0144.fFld = -49;
                    }
            }
        }
        long meth_res = l + i2 + i3 + s1 + (b ? 1 : 0) + i9 + i10 + i11 + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth(int i) {

        double d = 45.20435;
        int i1 = -10816, i13 = -109, i14 = 0, i15 = -1, i16 = -10660;
        byte by = -58;
        float[] fArr = new float[N];

        FuzzerUtils.init(fArr, -2.642F);

        for (d = 4; d < 176; d++) {
            float f = -2.980F;
            f *= ((by = (byte) (12457 + Test0144.instanceCount)) + Math.abs(i + i));
        }
        i1 >>= iMeth(Test0144.instanceCount);
        for (int i12 : Test0144.iArrFld) {
            for (i13 = 1; i13 < 4; i13++) {
                Test0144.sArrFld[i13] -= (short) Test0144.instanceCount;
                Test0144.dFld += i;
            }
            Test0144.instanceCount = 51312;
            for (i15 = 4; 1 < i15; i15 -= 2) {
                i14 >>= -59;
                fArr[i15 - 1] = i;
                Test0144.dFld *= -4480;
                Test0144.bFld = Test0144.bFld;
                i12 >>>= i16;
                Test0144.sArrFld[i15 - 1] = (short) i15;
            }
        }
        vMeth_check_sum += i + Double.doubleToLongBits(d) + i1 + by + i13 + i14 + i15 + i16 +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void main(String[] strArr) {

        try {
            Test0144 _instance = new Test0144();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i17 = 40, i18 = 252, i19 = 9, i20 = -54284, i21 = 47223, i22 = -41525, i23 = 173, i24 = -3, i25 = 163, i26 = -36527;
        long l1 = 4321747066972737949L;
        long[][] lArr1 = new long[N][N];
        double[][] dArr = new double[N][N];
        short[][] sArr = new short[N][N];

        FuzzerUtils.init(dArr, -125.27834);
        FuzzerUtils.init(sArr, (short) 17923);
        FuzzerUtils.init(lArr1, -7L);

        vMeth(i17);
        Test0144.lArrFld[(i17 >>> 1) % N] = (long) Test0144.dFld;
        Test0144.dFld = -174;
        for (l1 = 3; 134 > l1; ++l1) {
            switch ((((i17 >>> 1) % 6) * 5) + 19) {
                case 32:
                    i17 -= (int) -201L;
                    switch ((int) (((l1 % 1) * 5) + 6)) {
                        case 7:
                            for (i19 = 1; i19 < 191; i19++) {
                                i20 += (int) Test0144.instanceCount;
                                i20 += i20;
                                i18 *= i20;
                                dArr[(int) (l1)][(int) (l1 + 1)] *= Test0144.instanceCount;
                                i20 >>= i19;
                                for (i21 = 1; i21 < 2; i21++) {
                                    Test0144.dFld = Test0144.instanceCount;
                                    Test0144.bArrFld[i19] = false;
                                    i20 += i18;
                                }
                            }
                            Test0144.iArrFld[(int) (l1 - 1)] -= i20;
                    }
                    break;
                case 35:
                    for (i23 = (int) (l1); i23 < 191; ++i23) {
                        Test0144.sFld <<= (short) i22;
                        Test0144.iArrFld[(int) (l1 + 1)] >>= (int) Test0144.instanceCount;
                        for (i25 = 1; i25 < 1; i25++) {
                            sArr = FuzzerUtils.short2array(N, (short) -10132);
                            i24 += (((i25 * i18) + i26) - i18);
                            i24 = i23;
                            if (Test0144.bFld) {
                                i24 = -3;
                            } else {
                                i17 += 60245;
                                lArr1 = FuzzerUtils.long2array(N, (long) -525028367L);
                                i17 += i22;
                            }
                        }
                    }
                    break;
                case 30:
                    Test0144.instanceCount += i25;
                    break;
                case 40:
                case 43:
                    lArr1[(int) (l1)][(int) (l1 + 1)] = i17;
                case 28:
                    i24 <<= -101;
                default:
            }
        }

        FuzzerUtils.out.println("i17 l1 i18 = " + i17 + "," + l1 + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 i26 dArr = " + i25 + "," + i26 + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));
        FuzzerUtils.out.println("sArr lArr1 = " + FuzzerUtils.checkSum(sArr) + "," + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test0144.instanceCount Test0144.fFld Test0144.dFld = " + Test0144.instanceCount + "," +
                Float.floatToIntBits(Test0144.fFld) + "," + Double.doubleToLongBits(Test0144.dFld));
        FuzzerUtils.out.println("Test0144.bFld Test0144.sFld Test0144.iArrFld = " + (Test0144.bFld ? 1 : 0) + "," + Test0144.sFld + "," +
                FuzzerUtils.checkSum(Test0144.iArrFld));
        FuzzerUtils.out.println("Test0144.sArrFld Test0144.lArrFld Test0144.bArrFld = " + FuzzerUtils.checkSum(Test0144.sArrFld) + ","
                + FuzzerUtils.checkSum(Test0144.lArrFld) + "," + FuzzerUtils.checkSum(Test0144.bArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
