// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:56 2023
public class Test0152 {

    public static final int N = 400;

    public static long instanceCount = 122L;
    public static int iFld = -13;
    public static float fFld = -87.378F;
    public static int[] iArrFld = new int[N];
    public static long[] lArrFld1 = new long[N];
    public static volatile float[] fArrFld = new float[N];
    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0152.iArrFld, 97);
        FuzzerUtils.init(Test0152.lArrFld1, -2520113692451391565L);
        FuzzerUtils.init(Test0152.fArrFld, 1.886F);
    }

    public long[] lArrFld = new long[N];

    public static int iMeth(long l1) {

        short s = 10409;
        int i4 = -107, i5 = -46694, i6 = -17806;
        double d = 1.75853;
        boolean b = true;

        s *= (short) Test0152.iFld;
        i4 = 1;
        while ((i4 += 3) < 132) {
            Test0152.iArrFld[i4 - 1] &= Test0152.iFld;
            Test0152.iFld -= (int) d;
            l1 += (((i4 * Test0152.iFld) + l1) - i4);
            Test0152.iArrFld[i4 - 1] = Test0152.iFld;
            Test0152.iFld -= (int) 7L;
            Test0152.iFld += (i4 ^ (long) Test0152.fFld);
            if (Test0152.iFld != 0) {
            }
        }
        Test0152.iFld += Test0152.iFld;
        for (i5 = 6; i5 < 235; ++i5) {
            d += l1;
            Test0152.iFld += i4;
            Test0152.iFld = -119;
            if (b) continue;
        }
        long meth_res = l1 + s + i4 + Double.doubleToLongBits(d) + i5 + i6 + (b ? 1 : 0);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth() {

        int i2 = 7;
        int i3 = -44423;
        int i7 = -10;
        int i8 = 217;
        int i9 = 20627;
        int i10 = 43674;
        int i11 = -19743;
        int[] iArr = new int[N];
        long l2 = -203L;

        FuzzerUtils.init(iArr, 98);

        for (i2 = 1; i2 < 166; i2++) {
            iArr[i2 + 1] <<= Math.max(iMeth(Test0152.instanceCount), i3);
            i3 >>= i3;
            Test0152.fFld = -43.172F;
            i3 &= 26458;
        }
        for (i7 = 7; i7 < 263; i7++) {
            Test0152.fFld += i7;
        }
        try {
            i3 -= i2;
            for (i9 = 1; i9 < 142; i9++) {
                Test0152.instanceCount += Test0152.iFld;
                Test0152.iFld &= i9;
                for (l2 = 1; 11 > l2; l2++) {
                    i10 -= (int) l2;
                    Test0152.instanceCount <<= 61;
                }
            }
        } catch (NullPointerException exc1) {
            Test0152.instanceCount += Test0152.iFld;
        } finally {
            Test0152.instanceCount = -225L;
        }
        vMeth_check_sum += i2 + i3 + i7 + i8 + i9 + i10 + l2 + i11 + FuzzerUtils.checkSum(iArr);
    }

    public static void vSmallMeth(long l) {


        vMeth();
        Test0152.lArrFld1[(Test0152.iFld >>> 1) % N] += 23;
        vSmallMeth_check_sum += l;
    }

    public static void main(String[] strArr) {

        try {
            Test0152 _instance = new Test0152();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = 218, i1 = 200, i12 = 9, i13 = -11, i14 = -55, i15 = -175, i16 = 12;
        short s1 = 2098;
        double d1 = -63.96192;
        boolean b1 = false;

        i -= (int) (lArrFld[(-2 >>> 1) % N] = ((++i) + (-18350 * Math.max(i, i))));
        i1 = 1;
        while (++i1 < 144) {
            for (int smallinvoc = 0; smallinvoc < 62; smallinvoc++) vSmallMeth(Test0152.instanceCount);
            Test0152.instanceCount *= -1;
            try {
                Test0152.iFld = (Test0152.iFld / 74);
                i = (i / Test0152.iArrFld[i1 + 1]);
                Test0152.iFld = (i1 % Test0152.iArrFld[i1 - 1]);
            } catch (ArithmeticException a_e) {
            }
            Test0152.iFld >>>= s1;
            Test0152.lArrFld1[i1 - 1] = i1;
            Test0152.iFld += (i1 * i1);
            for (i12 = 6; i12 < 174; i12++) {
                Test0152.iFld += (i12 | i1);
                Test0152.instanceCount *= Test0152.instanceCount;
            }
            Test0152.fArrFld = Test0152.fArrFld;
            for (i14 = 174; 6 < i14; --i14) {
                i16 = 1;
                while ((i16 += 3) < 2) {
                    lArrFld[i14 + 1] = i13;
                    i15 = (int) Test0152.instanceCount;
                    i15 += i16;
                    s1 += (short) (i16 ^ i);
                    Test0152.iFld = (int) Test0152.instanceCount;
                    d1 += i13;
                    Test0152.iArrFld[i1] *= (int) Test0152.instanceCount;
                    i15 -= (int) Test0152.fFld;
                    Test0152.iFld = 10;
                }
                Test0152.iArrFld[i1] /= (int) (Test0152.instanceCount | 1);
                Test0152.instanceCount = (long) 76.209F;
                b1 = b1;
                b1 = b1;
                i13 = (int) -46296L;
                Test0152.iFld <<= (int) Test0152.instanceCount;
                i *= (int) Test0152.fFld;
            }
        }

        FuzzerUtils.out.println("i i1 s1 = " + i + "," + i1 + "," + s1);
        FuzzerUtils.out.println("i12 i13 i14 = " + i12 + "," + i13 + "," + i14);
        FuzzerUtils.out.println("i15 i16 d1 = " + i15 + "," + i16 + "," + Double.doubleToLongBits(d1));
        FuzzerUtils.out.println("b1 = " + (b1 ? 1 : 0));

        FuzzerUtils.out.println("Test0152.instanceCount Test0152.iFld Test0152.fFld = " + Test0152.instanceCount + "," + Test0152.iFld +
                "," + Float.floatToIntBits(Test0152.fFld));
        FuzzerUtils.out.println("lArrFld Test0152.iArrFld Test0152.lArrFld1 = " + FuzzerUtils.checkSum(lArrFld) + "," +
                FuzzerUtils.checkSum(Test0152.iArrFld) + "," + FuzzerUtils.checkSum(Test0152.lArrFld1));
        FuzzerUtils.out.println("Test0152.fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0152.fArrFld)));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}