// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:58 2023
public class Test0978 {

    public static final int N = 400;

    public static long instanceCount=-6L;
    public static volatile short sFld=7538;
    public static byte byFld=-88;
    public static boolean bFld=true;
    public static float fFld=1.473F;
    public static int[] iArrFld =new int[N];
    public long[] lArrFld =new long[N];
    public double[] dArrFld =new double[N];

    static {
        FuzzerUtils.init(Test0978.iArrFld, 138);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i7, float f) {


        Test0978.bFld = Test0978.bFld;
        vMeth2_check_sum += i7 + Float.floatToIntBits(f);
    }

    public static void vMeth1(int i3, short s, int i4) {

        int i5=157, i6=-61313;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -128L);

        for (i5 = 7; i5 < 130; ++i5) {
            lArr[i5 - 1] <<= (-((Test0978.byFld + i4) % -180L));
        }
        vMeth2(i5, Test0978.fFld);
        lArr[(-9 >>> 1) % N] = i4;
        vMeth1_check_sum += i3 + s + i4 + i5 + i6 + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth() {

        int i2=71, i8=-35097, i9=-14, i10=-19, i11=-236, i12=-11, i13=91, i14=227;

        Test0978.sFld -= (short) (Test0978.iArrFld[(i2 >>> 1) % N] - (i2 = i2));
        vMeth1(i2, Test0978.sFld, i2);
        Test0978.iArrFld[(i2 >>> 1) % N] -= i2;
        i8 = 1;
        while (++i8 < 312) {
            for (i9 = 1; i9 < 5; i9++) {
                try {
                    i10 = (i9 % -66);
                    i10 = (90407144 % Test0978.iArrFld[i8]);
                    i10 = (-60 / Test0978.iArrFld[i9]);
                } catch (ArithmeticException a_e) {}
                i2 -= i2;
                if (true) break;
                Test0978.instanceCount = i11;
                Test0978.instanceCount = i11;
                Test0978.sFld -= (short) i9;
                for (i12 = 1; i12 < 2; i12++) {
                    i13 = (int) Test0978.fFld;
                    i14 += (((i12 * i10) + i12) - Test0978.instanceCount);
                    i11 += (((i12 * Test0978.instanceCount) + i8) - i9);
                }
            }
        }
        vMeth_check_sum += i2 + i8 + i9 + i10 + i11 + i12 + i13 + i14;
    }

    public void mainTest(String[] strArr1) {

        int i=5, i1=-29648, i15=-26639, i16=43920, i17=35, i18=1, i19=11, i20=2945, i21=12;
        double d=-2.89045, d1=0.125100;
        long l=59297L;
        float[][] fArr =new float[N][N];

        FuzzerUtils.init(fArr, -18.798F);

        Test0978.iArrFld[(176 >>> 1) % N] += (int) Test0978.instanceCount;
        for (i = 7; i < 217; ++i) {
            vMeth();
            for (i15 = 7; i15 < 120; ++i15) {
                for (i17 = 1; i17 < 2; ++i17) {
                    fArr[i17 + 1] = fArr[i - 1];
                    d = -1.66381;
                    i1 -= 47769;
                    lArrFld = lArrFld;
                    i16 += i15;
                    Test0978.sFld += (short) (((i17 * Test0978.instanceCount) + i) - i18);
                    dArrFld[i - 1] *= i15;
                }
                for (i19 = 1; i19 < 2; i19++) {
                    i1 = i16;
                    Test0978.instanceCount += (i19 - i18);
                }
                i20 += (i15 * i17);
                i20 <<= i1;
                switch ((i % 3) * 5) {
                case 12:
                    for (d1 = 2; d1 > 1; --d1) {
                        i20 += (int)d1;
                        l += i15;
                        Test0978.instanceCount = l;
                        Test0978.iArrFld[(int) (d1 - 1)] += 34246;
                        i20 = i18;
                    }
                    Test0978.byFld += (byte) (7315 + (i15 * i15));
                    break;
                case 5:
                    i20 = (int)-170L;
                    break;
                case 11:
                    switch ((i15 % 5) + 31) {
                    case 31:
                        i1 >>= 2;
                        Test0978.instanceCount *= Test0978.byFld;
                        break;
                    case 32:
                    case 33:
                        fArr[i - 1][i - 1] -= (float)d1;
                        break;
                    case 34:
                        Test0978.iArrFld[i15 - 1] = i;
                    case 35:
                        i20 = (int)-5012959845811348342L;
                        break;
                    default:
                        i21 += (((i15 * Test0978.fFld) + i20) - Test0978.byFld);
                    }
                    break;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i15 = " + i + "," + i1 + "," + i15);
        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("d i19 i20 = " + Double.doubleToLongBits(d) + "," + i19 + "," + i20);
        FuzzerUtils.out.println("d1 i21 l = " + Double.doubleToLongBits(d1) + "," + i21 + "," + l);
        FuzzerUtils.out.println("fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test0978.instanceCount Test0978.sFld Test0978.byFld = " + Test0978.instanceCount + "," + Test0978.sFld +
                "," + Test0978.byFld);
        FuzzerUtils.out.println("Test0978.bFld Test0978.fFld Test0978.iArrFld = " + (Test0978.bFld ? 1 : 0) + "," +
                Float.floatToIntBits(Test0978.fFld) + "," + FuzzerUtils.checkSum(Test0978.iArrFld));
        FuzzerUtils.out.println("lArrFld dArrFld = " + FuzzerUtils.checkSum(lArrFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0978 _instance = new Test0978();
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