// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:13 2023
public class Test0782 {

    public static final int N = 400;

    public static volatile long instanceCount = -3L;
    public static double dFld = 1.113542;
    public static int iFld = -84;
    public static int[][] iArrFld = new int[N][N];
    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0782.iArrFld, 25251);
    }

    public static long lMeth(int i3) {

        float f = -2.980F;
        float[] fArr = new float[N];
        byte by = -75;
        int i4 = -85, i5 = 131, i6 = 174, i7 = -17821, i8 = 52, i9 = 39976, i10 = 5, i11 = 0;
        boolean b = false;
        short[] sArr = new short[N];
        double[] dArr = new double[N];

        FuzzerUtils.init(sArr, (short) 30348);
        FuzzerUtils.init(fArr, -1.148F);
        FuzzerUtils.init(dArr, 1.67181);

        f -= i3;
        by = (byte) 4945;
        for (i4 = 9; i4 < 208; ++i4) {
            Test0782.dFld -= -8269;
            if (b) continue;
            switch ((i4 % 2) + 94) {
                case 94:
                    for (i6 = 1; i6 < 8; i6++) {
                        for (i8 = 1; i8 < 2; i8++) {
                            if (i10 != 0) {
                            }
                            Test0782.iArrFld[i8][i4 - 1] = (int) Test0782.instanceCount;
                            fArr[i4] *= i4;
                            i10 += (int) (-8557L + (i8 * i8));
                            try {
                                i9 = (i6 / 1441675083);
                                i3 = (i7 % -54304);
                                Test0782.iArrFld[(4411 >>> 1) % N][i8 + 1] = (Test0782.iArrFld[i6 - 1][i4 - 1] / i3);
                            } catch (ArithmeticException a_e) {
                            }
                            dArr[i6] = 13L;
                            b = b;
                        }
                    }
                    break;
                case 95:
                    i11 >>= i9;
                    break;
                default:
                    i10 -= i5;
            }
        }
        long meth_res = i3 + Float.floatToIntBits(f) + by + i4 + i5 + (b ? 1 : 0) + i6 + i7 + i8 + i9 + i10 + i11 +
                FuzzerUtils.checkSum(sArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public static void vMeth(int i1, int i2) {

        int i12 = -18459;
        int i13 = 0;
        int i14 = -6667;
        int i15 = -13;
        int i16 = 166;
        int[] iArr = new int[N];
        long l1 = 5547905019577648567L;

        FuzzerUtils.init(iArr, -47706);

        if (false) {
            i1 *= (int) (((iArr[(i2 >>> 1) % N] -= i1) - Math.abs(i2)) % ((lMeth(i2) - i2) | 1));
            for (i12 = 1; i12 < 245; i12++) {
                i2 += (((i12 * Test0782.instanceCount) + Test0782.instanceCount) - Test0782.instanceCount);
                Test0782.instanceCount = (long) Test0782.dFld;
                i2 += (int) Test0782.instanceCount;
                i2 += i12;
                for (i14 = i12; i14 < 7; ++i14) {
                    i16 = 1;
                    do {
                        i1 <<= i1;
                        l1 += i16;
                        switch ((i16 % 1) + 70) {
                            case 70:
                                i15 += (i16 | i1);
                                iArr[i12] = i12;
                                break;
                            default:
                                iArr[i14 + 1] = (int) Test0782.instanceCount;
                        }
                    } while ((i16 += 3) < 1);
                }
            }
        }
        vMeth_check_sum += i1 + i2 + i12 + i13 + i14 + i15 + i16 + l1 + FuzzerUtils.checkSum(iArr);
    }

    public static void vSmallMeth(int i, long l) {


        vMeth(i, i);
        vSmallMeth_check_sum += i + l;
    }

    public static void main(String[] strArr) {

        try {
            Test0782 _instance = new Test0782();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i17 = 6, i18 = 2;
        byte[] byArr = new byte[N];

        FuzzerUtils.init(byArr, (byte) -62);

        for (int smallinvoc = 0; smallinvoc < 761; smallinvoc++) vSmallMeth(Test0782.iFld, Test0782.instanceCount);
        for (i17 = 6; i17 < 324; i17++) {
            i18 += (int) Test0782.instanceCount;
            Test0782.iFld = i17;
            switch (((i17 >>> 1) % 1) + 99) {
                case 99:
                    Test0782.instanceCount += Test0782.iFld;
                    i18 -= i18;
                    Test0782.instanceCount >>= Test0782.instanceCount;
                    i18 = 83;
                    break;
            }
        }

        FuzzerUtils.out.println("i17 i18 byArr = " + i17 + "," + i18 + "," + FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test0782.instanceCount Test0782.dFld Test0782.iFld = " + Test0782.instanceCount + "," +
                Double.doubleToLongBits(Test0782.dFld) + "," + Test0782.iFld);
        FuzzerUtils.out.println("Test0782.iArrFld = " + FuzzerUtils.checkSum(Test0782.iArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  lMeth ->  lMeth vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
