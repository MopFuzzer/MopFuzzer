// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:07 2023
public class Test0575 {

    public static final int N = 400;

    public static long instanceCount = -5310636006567181573L;
    public static volatile double dFld = 0.64300;
    public static float fFld = -78.105F;
    public static byte byFld = 57;
    public static short sFld = -853;
    public static boolean[] bArrFld = new boolean[N];
    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0575.bArrFld, false);
    }

    public int[] iArrFld = new int[N];
    public long[] lArrFld = new long[N];

    public static void vMeth1(int i3) {

        int i4 = -134, i5 = -24645;

        i3 = i3;
        Test0575.instanceCount = i3;
        Test0575.fFld *= Test0575.byFld;
        for (i4 = 17; i4 < 333; ++i4) {
            i5 &= (int) -3201012704L;
        }
        i3 = (int) Test0575.instanceCount;
        vMeth1_check_sum += i3 + i4 + i5;
    }

    public static void vMeth(int i1, int i2) {

        int i6 = -13, i7 = -12;
        double[] dArr = new double[N];

        FuzzerUtils.init(dArr, -2.25926);

        vMeth1(i2);
        for (i6 = 8; i6 < 228; i6++) {
            dArr = FuzzerUtils.double1array(N, (double) 66.114377);
        }
        vMeth_check_sum += i1 + i2 + i6 + i7 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vSmallMeth() {

        int i8 = -168;

        vMeth(3, i8);
        vSmallMeth_check_sum += i8;
    }

    public static void main(String[] strArr) {

        try {
            Test0575 _instance = new Test0575();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = 13, i9 = -108, i10 = -58207, i11 = -178, i12 = 9, i13 = 46894;
        byte by = 16;
        boolean b = false;
        float[] fArr = new float[N];

        FuzzerUtils.init(fArr, 66.229F);

        Test0575.dFld = (((i * 1562024965L) * i) + by);
        iArrFld[(40248 >>> 1) % N] *= (int) ((++lArrFld[(i >>> 1) % N]) + (-(++i)));
        for (int smallinvoc = 0; smallinvoc < 976; smallinvoc++) vSmallMeth();
        i += (int) Test0575.instanceCount;
        i9 = 1;
        do {
            switch (((i9 % 2) * 5) + 7) {
                case 10:
                    i10 = 1;
                    while (++i10 < 205) {
                        Test0575.instanceCount = Test0575.instanceCount;
                        iArrFld[i9] += -15881;
                        for (i11 = 1; i11 < 1; ++i11) {
                            switch (((i9 % 4) * 5) + 26) {
                                case 39:
                                    Test0575.instanceCount = Test0575.instanceCount;
                                    break;
                                case 42:
                                    Test0575.dFld += 4804;
                                    i12 -= (int) Test0575.instanceCount;
                                    Test0575.dFld %= (i11 | 1);
                                    break;
                                case 45:
                                    i12 = i12;
                                    Test0575.byFld += (byte) Test0575.instanceCount;
                                    break;
                                case 32:
                                    i12 = i10;
                                    i = Test0575.sFld;
                                    Test0575.sFld -= (short) 7374;
                                    break;
                                default:
                                    Test0575.byFld += (byte) (i11 + Test0575.instanceCount);
                                    Test0575.instanceCount += i12;
                            }
                        }
                        lArrFld[i9 - 1] &= i;
                        i13 = 1;
                        do {
                            Test0575.bArrFld[i9 - 1] = b;
                            switch (((i13 % 1) * 5) + 22) {
                                case 24:
                                    Test0575.instanceCount += i9;
                                    break;
                                default:
                                    fArr[i9] = i9;
                            }
                            Test0575.instanceCount <<= by;
                            Test0575.fFld *= i11;
                        } while (++i13 < 1);
                    }
                    break;
                case 8:
                    Test0575.instanceCount <<= Test0575.sFld;
                    break;
            }
        } while (++i9 < 122);

        FuzzerUtils.out.println("i by i9 = " + i + "," + by + "," + i9);
        FuzzerUtils.out.println("i10 i11 i12 = " + i10 + "," + i11 + "," + i12);
        FuzzerUtils.out.println("i13 b fArr = " + i13 + "," + (b ? 1 : 0) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test0575.instanceCount Test0575.dFld Test0575.fFld = " + Test0575.instanceCount + "," +
                Double.doubleToLongBits(Test0575.dFld) + "," + Float.floatToIntBits(Test0575.fFld));
        FuzzerUtils.out.println("Test0575.byFld Test0575.sFld iArrFld = " + Test0575.byFld + "," + Test0575.sFld + "," +
                FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("lArrFld Test0575.bArrFld = " + FuzzerUtils.checkSum(lArrFld) + "," +
                FuzzerUtils.checkSum(Test0575.bArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
