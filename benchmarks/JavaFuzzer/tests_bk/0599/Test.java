// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:08 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=2L;
    public static int iFld=-14;
    public static boolean bFld=true;
    public static int iFld1=-3332;
    public static short sFld=18487;
    public float fFld=23.722F;
    public static double dFld=1.115111;
    public long lFld=14L;
    public static float fArrFld[]=new float[N];
    public static int iArrFld[]=new int[N];
    public long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 85.300F);
        FuzzerUtils.init(Test.iArrFld, -60913);
    }

    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i3=11, i4=-40774, i5=-8, i6=237;
        float f=-2.257F;
        long l=3505543795077727978L;

        i3 = 1;
        while (++i3 < 366) {
            Test.instanceCount = Test.iFld1;
            f = -209L;
            Test.iFld1 += (i3 * i3);
            for (i4 = 1; i4 < 5; ++i4) {
                Test.instanceCount = i3;
                Test.bFld = Test.bFld;
                i5 += (i4 ^ Test.iFld1);
                Test.iFld = (int)Test.instanceCount;
                if (i4 != 0) {
                }
                for (l = 1; l < 2; l++) {
                    i5 = i5;
                }
                if (i4 != 0) {
                }
            }
            i5 -= (int)f;
            Test.iArrFld[i3 + 1] += Test.iFld1;
        }
        long meth_res = i3 + Float.floatToIntBits(f) + i4 + i5 + l + i6;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static float fMeth(double d) {

        int i1=18727, i2=-10861, i7=-12, i8=166, i9=7, i10=-249, i11=-58485;
        byte by=60;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -2309192735666740131L);

        for (i1 = 8; i1 < 215; ++i1) {
            Test.fArrFld[i1] -= ((-by) - by);
            Test.sFld = (short)(Math.min((long)(-1.331F % (iMeth() | 1)), Test.instanceCount) >> Test.iFld1);
            Test.iFld = 13;
            if (Test.bFld) continue;
        }
        Test.iFld1 = Test.iFld;
        i7 = 1;
        while ((i7 += 3) < 159) {
            for (i8 = i7; i8 < 29; ++i8) {
                i10 -= i2;
                i2 += (i8 + i7);
                lArr[i8 + 1] *= (long)-1.310F;
                i11 = 1;
                do {
                    Test.instanceCount += (((i11 * i8) + Test.instanceCount) - i1);
                    Test.iArrFld[i7] = i9;
                    i9 = i7;
                } while (++i11 < 1);
            }
        }
        long meth_res = Double.doubleToLongBits(d) + i1 + i2 + by + i7 + i8 + i9 + i10 + i11 +
            FuzzerUtils.checkSum(lArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void vMeth() {

        double d1=-5.40103;

        Test.bFld = (Test.bFld = (Test.bFld = Test.bFld));
        Test.iFld1 = Test.iFld;
        Test.instanceCount <<= -49;
        Test.iFld1 = (int)(-fMeth(d1));
        lArrFld[(Test.iFld1 >>> 1) % N] += Test.instanceCount;
        vMeth_check_sum += Double.doubleToLongBits(d1);
    }

    public void mainTest(String[] strArr1) {

        int i=-125, i12=49845, i13=-114, i14=4, i15=2, i16=11, i17=-2, i18=147;
        byte by1=49;
        long l1=6L;

        i = (int)(Test.instanceCount = (Test.iFld = (56145 - (Test.iFld - 36294))));
        vMeth();
        fFld = -73;
        if (Test.bFld) {
            i |= Test.iFld;
            Test.iFld1 = i;
            Test.iFld1 -= Test.iFld1;
            i12 = 1;
            while (++i12 < 242) {
                Test.instanceCount = Test.instanceCount;
                i >>= by1;
                by1 += (byte)4882L;
            }
        } else if (true) {
            for (i13 = 2; i13 < 130; i13++) {
                for (l1 = 3; l1 < 196; ++l1) {
                    Test.iArrFld[i13 + 1] = i15;
                    i = -7977;
                    lArrFld[i13] = Test.instanceCount;
                    i16 = 1;
                    while (++i16 < 2) {
                        i15 -= i16;
                        fFld += by1;
                        Test.iArrFld[(int)(l1 - 1)] = (int)-2.631F;
                        Test.iFld1 -= i14;
                    }
                    for (i17 = 1; i17 < 2; i17 += 2) {
                        Test.iFld1 *= Test.iFld1;
                        Test.iFld -= i14;
                        Test.instanceCount = 12;
                        Test.iFld1 = 12;
                        i15 = (int)l1;
                        Test.dFld += i13;
                        i18 = by1;
                    }
                    i15 += i13;
                }
            }
        } else {
            fFld -= lFld;
        }

        FuzzerUtils.out.println("i i12 by1 = " + i + "," + i12 + "," + by1);
        FuzzerUtils.out.println("i13 i14 l1 = " + i13 + "," + i14 + "," + l1);
        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 = " + i18);

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.bFld = " + Test.instanceCount + "," + Test.iFld +
            "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.iFld1 Test.sFld fFld = " + Test.iFld1 + "," + Test.sFld + "," +
            Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("Test.dFld lFld Test.fArrFld = " + Double.doubleToLongBits(Test.dFld) + "," + lFld +
            "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));
        FuzzerUtils.out.println("Test.iArrFld lArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  fMeth ->  fMeth vMeth mainTest
//DEBUG  iMeth ->  iMeth fMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}