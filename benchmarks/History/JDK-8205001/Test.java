// Generated by Java* Fuzzer test generator (1.0.001). Thu Jun  7 18:39:55 2018
public class Test {

    public static final int N = 400;

    public static long instanceCount=-4884L;
    public static short sFld=14385;
    public static float fFld=-1.982F;
    public static double dFld=0.12412;
    public static volatile long[] lArrFld =new long[N];
    public static float[] fArrFld =new float[N];
    public static int[] iArrFld =new int[N];
    public static double[] dArrFld =new double[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -175L);
        FuzzerUtils.init(Test.fArrFld, -127.619F);
        FuzzerUtils.init(Test.iArrFld, 10);
        FuzzerUtils.init(Test.dArrFld, -2.43767);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i3, long l, int i4) {

        int i5=225;
        int i6=33;
        int i7=4;
        int[] iArr =new int[N];
        float[][] fArr =new float[N][N];

        FuzzerUtils.init(iArr, 4);
        FuzzerUtils.init(fArr, -83.35F);

        Test.sFld = (short)i4;
        l = l;
        i4 = i3;
        Test.lArrFld[(i4 >>> 1) % N] *= (long)Test.fFld;
        i5 = 251;
        do {
            i3 -= (int)Test.fFld;
            i3 = 6;
            for (i6 = 1; i6 < 6; ++i6) {
                Test.fFld = i6;
                Test.fFld += (((i6 * Test.fFld) + i4) - Test.instanceCount);
                iArr[i6] = i7;
                i7 += i3;
                fArr[i5][i5] -= Test.fFld;
                i7 += -53187;
            }
            Test.dFld *= -68.164F;
        } while (--i5 > 0);
        long meth_res = i3 + l + i4 + i5 + i6 + i7 + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i1, int i2) {

        int i8=-186;
        int i9=-3;
        int[] iArr1 =new int[N];
        long l1=10580L;
        double[] dArr =new double[N];

        FuzzerUtils.init(dArr, -122.21805);
        FuzzerUtils.init(iArr1, -29821);

        i2 = (int)((dArr[(180 >>> 1) % N] + (-i1)) * (lMeth(i2, Test.instanceCount, i1) + Test.sFld));
        i1 >>= i2;
        for (i8 = 11; i8 < 203; ++i8) {
            i1 = (int)1.79441;
            Test.instanceCount += Test.instanceCount;
            Test.instanceCount -= 53382;
            i2 = (int)l1;
            Test.fArrFld = Test.fArrFld;
            i1 = i2;
            iArr1[i8] <<= -2;
            i9 -= i1;
            switch ((i8 % 1) + 73) {
            case 73:
                i2 >>= -13;
                Test.instanceCount *= -4718507799730063964L;
                iArr1[i8 - 1] = i9;
                break;
            }
        }
        vMeth_check_sum += i1 + i2 + i8 + i9 + l1 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            FuzzerUtils.checkSum(iArr1);
    }

    public static void vSmallMeth(int i) {


        vMeth(i, i);
        Test.dFld -= -80;
        vSmallMeth_check_sum += i;
    }

    public void mainTest(String[] strArr1) {

        int i12=-1, i14=-151, i15=5598, i16=43873, i17=60772, i18=-186, i19=-8079, i20=35687;
        byte by=-97;
        float f=0.365F;

        for (int smallinvoc=0; smallinvoc<220; smallinvoc++) vSmallMeth(76);
        i12 = 1;
        do {
            Test.instanceCount >>= i12;
            for (i14 = 2; 89 > i14; ++i14) {
                switch (((i12 % 1) * 5) + 60) {
                case 61:
                    Test.lArrFld = FuzzerUtils.long1array(N, (long)-1L);
                    Test.iArrFld[i12] *= (int)Test.instanceCount;
                    i15 = i15;
                    i15 >>= by;
                    break;
                }
                Test.instanceCount += i12;
                Test.iArrFld[i12 - 1] += i12;
                i16 = 1;
                do {
                    i15 += (int)Test.fFld;
                    Test.iArrFld[i16] -= i15;
                    i15 = i14;
                    i15 = (int)Test.instanceCount;
                    Test.instanceCount = -4180;
                    Test.instanceCount *= i15;
                    i15 += i12;
                } while (++i16 < 2);
            }
            Test.instanceCount >>= i14;
            i15 >>= i15;
            Test.instanceCount *= (long)f;
            for (i17 = i12; i17 < 89; i17++) {
                i15 = i14;
                for (i19 = i12; i19 < 1; i19++) {
                    Test.lArrFld[i19] <<= i17;
                    i18 += (i19 | i14);
                    Test.dArrFld[i12 - 1] -= i16;
                    Test.dArrFld[i12 - 1] *= Test.dFld;
                    Test.iArrFld[i17 + 1] += i20;
                }
            }
        } while (++i12 < 282);

        FuzzerUtils.out.println("i12 i14 i15 = " + i12 + "," + i14 + "," + i15);
        FuzzerUtils.out.println("by i16 f = " + by + "," + i16 + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 = " + i20);

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.fFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.dFld Test.lArrFld Test.fArrFld = " + Double.doubleToLongBits(Test.dFld) + "," +
            FuzzerUtils.checkSum(Test.lArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));
        FuzzerUtils.out.println("Test.iArrFld Test.dArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  lMeth ->  lMeth vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
