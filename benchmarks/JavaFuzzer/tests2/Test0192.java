// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:20 2023
public class Test0192 {

    public static final int N = 400;

    public static long instanceCount=-89L;
    public static int iFld=4693;
    public byte byFld=-56;
    public float fFld=-2.73F;
    public static int[] iArrFld =new int[N];
    public static long[] lArrFld =new long[N];
    public volatile float[] fArrFld =new float[N];

    static {
        FuzzerUtils.init(Test0192.iArrFld, -42);
        FuzzerUtils.init(Test0192.lArrFld, -1594365446L);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(short s) {

        long l1=4286704381245143859L;

        l1 |= Test0192.iFld;
        long meth_res = s + l1;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i2=-2, i3=19647, i4=316;
        boolean b=true;
        double d=-110.28895;

        Test0192.instanceCount += (long) (((Test0192.iFld % (Test0192.iFld | 1)) + Math.abs(0.738F)) - (iMeth((short) (-5753)) *
                Test0192.iFld));
        Test0192.iArrFld[(Test0192.iFld >>> 1) % N] += Test0192.iFld;
        Test0192.iFld -= (int) Test0192.instanceCount;
        Test0192.instanceCount -= Test0192.iFld;
        Test0192.iFld %= (int) (Test0192.iFld | 1);
        Test0192.iFld += -11;
        for (i2 = 8; 243 > i2; i2++) {
            Test0192.iFld *= i2;
            Test0192.iArrFld = FuzzerUtils.int1array(N, (int) 223);
            Test0192.iFld |= (int) Test0192.instanceCount;
            if (b) break;
        }
        i4 = 1;
        while (++i4 < 369) {
            int i5=207;
            Test0192.instanceCount += (((i4 * Test0192.iFld) + i5) - i2);
            d = -196;
            Test0192.lArrFld[i4 + 1] = Test0192.instanceCount;
        }
        vMeth_check_sum += i2 + i3 + (b ? 1 : 0) + i4 + Double.doubleToLongBits(d);
    }

    public static void vSmallMeth(int i, long l, int i1) {


        vMeth();
        Test0192.iArrFld[(i >>> 1) % N] = (int) l;
        vSmallMeth_check_sum += i + l + i1;
    }

    public void mainTest(String[] strArr1) {

        int i6=142, i7=163, i8=-27756, i9=-64534, i10=-2723, i11=4, i12=15556, i13=-63078;
        boolean b1=false;
        double d1=-1.26900;
        double[] dArr =new double[N];
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, 2169L);
        FuzzerUtils.init(dArr, 2.110506);

        for (int smallinvoc = 0; smallinvoc < 718; smallinvoc++)
            vSmallMeth(Test0192.iFld, Test0192.instanceCount, Test0192.iFld);
        i6 = 1;
        do {
            lArr[i6] *= 19355;
            fArrFld[i6 + 1] *= Test0192.iFld;
            Test0192.iArrFld[i6] -= i6;
            if (b1) continue;
            lArr[i6 + 1] *= i6;
            for (i7 = i6; i7 < 102; i7++) {
                lArr[i6 + 1] *= byFld;
                i8 *= 22868;
                Test0192.instanceCount = i8;
                fFld = byFld;
                if (b1) continue;
                Test0192.iFld += (((i7 * Test0192.instanceCount) + i8) - Test0192.instanceCount);
            }
            for (i9 = i6; 102 > i9; ++i9) {
                i10 += i9;
                Test0192.instanceCount *= i8;
                if (b1) {
                    d1 = 1;
                    while (++d1 < 1) {
                        double d2=1.8143;
                        Test0192.iArrFld = Test0192.iArrFld;
                        d2 += 51155;
                        Test0192.iArrFld[(int) (d1 - 1)] >>= (int) Test0192.instanceCount;
                    }
                } else {
                    dArr[i9] = i8;
                    i10 *= (int)47.22F;
                    for (i11 = i6; i11 < 1; i11++) {
                        i10 += i11;
                    }
                    i8 %= (int)(i7 | 1);
                }
                i13 = 1;
                while (++i13 < 1) {
                    Test0192.instanceCount = i7;
                }
                i10 -= 118;
            }
        } while (++i6 < 246);

        FuzzerUtils.out.println("i6 b1 i7 = " + i6 + "," + (b1 ? 1 : 0) + "," + i7);
        FuzzerUtils.out.println("i8 i9 i10 = " + i8 + "," + i9 + "," + i10);
        FuzzerUtils.out.println("d1 i11 i12 = " + Double.doubleToLongBits(d1) + "," + i11 + "," + i12);
        FuzzerUtils.out.println("i13 lArr dArr = " + i13 + "," + FuzzerUtils.checkSum(lArr) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test0192.instanceCount Test0192.iFld byFld = " + Test0192.instanceCount + "," + Test0192.iFld + "," +
            byFld);
        FuzzerUtils.out.println("fFld Test0192.iArrFld Test0192.lArrFld = " + Float.floatToIntBits(fFld) + "," +
                FuzzerUtils.checkSum(Test0192.iArrFld) + "," + FuzzerUtils.checkSum(Test0192.lArrFld));
        FuzzerUtils.out.println("fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0192 _instance = new Test0192();
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
//DEBUG  iMeth ->  iMeth vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
