// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:00 2023
public class Test0300 {

    public static final int N = 400;

    public static long instanceCount = 56142L;
    public static double dFld = 31.107022;
    public static byte byFld = 64;
    public static volatile double[] dArrFld = new double[N];
    public static int[] iArrFld = new int[N];
    public static long vSmallMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0300.dArrFld, -2.94166);
        FuzzerUtils.init(Test0300.iArrFld, -12);
    }

    public static void vMeth(int i5, int i6) {

        int i7 = 542, i8 = 6, i9 = -109, i10 = 83, i11 = 3044;
        float f1 = -94.878F;

        i7 = 1;
        do {
            Test0300.instanceCount = i5;
            i5 -= (int) -99.992F;
            Test0300.iArrFld = Test0300.iArrFld;
            i5 += i7;
            for (i8 = 1; i8 < 5; i8++) {
                Test0300.dFld += -15;
                Test0300.iArrFld[i7] -= 125;
                for (i10 = i7; i10 < 2; ++i10) {
                    Test0300.iArrFld[i7] = i9;
                    i6 = (int) 51329L;
                    Test0300.instanceCount = Test0300.byFld;
                    i6 >>= i5;
                    f1 += (i10 + Test0300.instanceCount);
                    Test0300.instanceCount += (i10 * i10);
                }
            }
        } while (++i7 < 311);
        vMeth_check_sum += i5 + i6 + i7 + i8 + i9 + i10 + i11 + Float.floatToIntBits(f1);
    }

    public static int iMeth(long l1, int i2, long l2) {

        int i3 = 0;
        int i4 = 247;
        int i12 = -37944;
        int i13 = -58349;
        int i14 = 2;
        int[] iArr1 = new int[N];
        float f2 = 1.551F, f3 = -2.427F;

        FuzzerUtils.init(iArr1, 5);

        i2 = (++i2);
        for (i3 = 17; i3 < 324; ++i3) {
            l2 = (Math.abs(Math.min(i4, i2)) + (iArr1[i3 + 1] - (++i4)));
            iArr1[i3 - 1] += (i4++);
            vMeth(i4, i4);
            i4 -= i2;
            if (i2 != 0) {
            }
            for (f2 = 5; 1 < f2; --f2) {
                Test0300.dFld *= l2;
                i4 += (int) f2;
                f3 = (float) Test0300.dFld;
                for (i13 = 2; i13 > 1; i13 -= 3) {
                    i2 >>>= i4;
                    i4 += (i13 * i14);
                    i2 = i4;
                }
            }
        }
        long meth_res = l1 + i2 + l2 + i3 + i4 + Float.floatToIntBits(f2) + i12 + Float.floatToIntBits(f3) + i13 + i14
                + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vSmallMeth(long l) {

        short s = -31299;
        int i1 = -34262;

        l >>= s;
        i1 -= (int) (((++l) % (iMeth(-29618L, i1, l) | 1)) - Test0300.instanceCount);
        vSmallMeth_check_sum += l + s + i1;
    }

    public static void main(String[] strArr2) {

        try {
            Test0300 _instance = new Test0300();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr2);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr3) {

        int i = 14;
        int i15 = 10;
        int[] iArr = new int[N];

        FuzzerUtils.init(iArr, 31508);

        i = 1;
        do {
            Test0300.dArrFld[i] = iArr[i];
        } while (++i < 231);
        for (int smallinvoc = 0; smallinvoc < 263; smallinvoc++) vSmallMeth(Test0300.instanceCount);
        i15 = i15;
        i15 = i15;

        FuzzerUtils.out.println("i i15 iArr = " + i + "," + i15 + "," + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test0300.instanceCount Test0300.dFld Test0300.byFld = " + Test0300.instanceCount + "," +
                Double.doubleToLongBits(Test0300.dFld) + "," + Test0300.byFld);
        FuzzerUtils.out.println("Test0300.dArrFld Test0300.iArrFld = " +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0300.dArrFld)) + "," + FuzzerUtils.checkSum(Test0300.iArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  iMeth ->  iMeth vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth iMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
