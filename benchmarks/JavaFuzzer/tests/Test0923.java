// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:16 2023
public class Test0923 {

    public static final int N = 400;

    public static long instanceCount = 52273L;
    public static boolean bFld = false;
    public static volatile float fFld = -1.745F;
    public static byte byFld = 59;
    public static volatile float[][] fArrFld = new float[N][N];
    public static long vSmallMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0923.fArrFld, -2.642F);
    }

    public int[] iArrFld = new int[N];
    public long[][] lArrFld = new long[N][N];

    public static void vMeth() {

        int i4 = -93;
        int i5 = 5;
        int i6 = -13;
        int i8 = -5;
        int i9 = -57881;
        int i10 = 44684;
        int[] iArr = new int[N];
        float f = 89.362F;
        double d1 = -123.114553;
        double[] dArr = new double[N];

        FuzzerUtils.init(iArr, 89);
        FuzzerUtils.init(dArr, -2.111039);

        i4 = i4;
        i4 -= i4;
        for (i5 = 2; i5 < 325; i5++) {
            if (i4 != 0) {
                vMeth_check_sum += i4 + i5 + i6 + i8 + i9 + Float.floatToIntBits(f) + Double.doubleToLongBits(d1) + i10
                        + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                return;
            }
            for (i8 = 1; i8 < 5; i8++) {
                f -= f;
                dArr[i8 - 1] = d1;
                i4 += (133 + (i8 * i8));
                iArr[i8 + 1] = i8;
                i6 -= (int) Test0923.instanceCount;
                if (Test0923.bFld) continue;
            }
            i10 = 1;
            while (++i10 < 5) {
                i6 += (int) Test0923.instanceCount;
                iArr[i5] = i10;
                i6 += (i10 * i10);
            }
        }
        vMeth_check_sum += i4 + i5 + i6 + i8 + i9 + Float.floatToIntBits(f) + Double.doubleToLongBits(d1) + i10 +
                FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static long lMeth(int i2, boolean b) {

        double d = -125.103289;
        int i3 = 14, i11 = 58535, i12 = 4, i13 = -2;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, -64L);

        lArr[(i2 >>> 1) % N] = (Math.max(i2 + i2, (int) (-5370254297285358024L - (d - Test0923.instanceCount))) + (i2 -
                (i3--)));
        vMeth();
        for (i11 = 8; i11 < 145; i11++) {
            if (i3 != 0) {
            }
            i2 += (int) Test0923.fFld;
        }
        i3 -= (int) Test0923.instanceCount;
        i3 = Test0923.byFld;
        Test0923.fFld += 8036404385205616257L;
        i13 -= i2;
        Test0923.instanceCount -= Test0923.instanceCount;
        long meth_res = i2 + (b ? 1 : 0) + Double.doubleToLongBits(d) + i3 + i11 + i12 + i13 +
                FuzzerUtils.checkSum(lArr);
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public static void vSmallMeth(int i1, long l) {


        i1 -= (int) (((i1 -= i1) - lMeth(-102, Test0923.bFld)) + l);
        vSmallMeth_check_sum += i1 + l;
    }

    public static void main(String[] strArr) {

        try {
            Test0923 _instance = new Test0923();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = -137, i14 = 6, i15 = 43204, i16 = 0, i17 = -25604, i18 = 209, i19 = -8, i20 = 4, i21 = 3068, i22 = 34787, i23 = -404,
                i24 = -2879, i25 = -35479;
        float f1 = 0.773F;
        float[] fArr = new float[N];

        FuzzerUtils.init(fArr, 0.86F);

        i = (iArrFld[(i >>> 1) % N] = -13);
        for (int smallinvoc = 0; smallinvoc < 185; smallinvoc++) vSmallMeth(i, Test0923.instanceCount);
        Test0923.instanceCount += i;
        for (i14 = 22; i14 < 385; ++i14) {
            Test0923.fFld = -58737;
            i16 += (i14 + i16);
            i += (i14 ^ i16);
            Test0923.instanceCount = i16;
            for (i17 = 2; i17 < 69; i17++) {
                fArr[i17 - 1] *= -7;
                lArrFld[i14][i14] -= Test0923.instanceCount;
                Test0923.fFld -= i;
                iArrFld[i14 - 1] = -61456;
                Test0923.fFld = 6559877663525265437L;
            }
            for (i19 = 1; i19 < 69; i19++) {
                Test0923.fArrFld = Test0923.fArrFld;
                i16 >>= Test0923.byFld;
                i15 -= i20;
                iArrFld[i19 - 1] -= i;
                Test0923.fFld -= 0.255F;
                Test0923.instanceCount >>>= -10679;
                lArrFld[i19] = FuzzerUtils.long1array(N, (long) 137580226965991105L);
            }
            i18 = -201;
        }
        Test0923.fFld *= Test0923.instanceCount;
        for (i21 = 280; i21 > 16; i21 -= 2) {
            for (i23 = i21; 190 > i23; i23++) {
                Test0923.instanceCount = (long) f1;
                if (Test0923.bFld) continue;
                iArrFld[i23] += i14;
                i24 += (((i23 * f1) + i25) - Test0923.instanceCount);
            }
        }

        FuzzerUtils.out.println("i i14 i15 = " + i + "," + i14 + "," + i15);
        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("f1 i25 fArr = " + Float.floatToIntBits(f1) + "," + i25 + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test0923.instanceCount Test0923.bFld Test0923.fFld = " + Test0923.instanceCount + "," + (Test0923.bFld ? 1
                : 0) + "," + Float.floatToIntBits(Test0923.fFld));
        FuzzerUtils.out.println("Test0923.byFld iArrFld lArrFld = " + Test0923.byFld + "," + FuzzerUtils.checkSum(iArrFld) +
                "," + FuzzerUtils.checkSum(lArrFld));
        FuzzerUtils.out.println("Test0923.fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0923.fArrFld)));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  lMeth ->  lMeth vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth lMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}