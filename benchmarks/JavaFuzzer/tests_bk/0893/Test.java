// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:15 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-4L;
    public volatile int iFld=-8443;
    public static double dFld=-2.24204;
    public static boolean bFld=true;
    public float fFld=1.57F;
    public int iArrFld[]=new int[N];
    public long lArrFld[]=new long[N];
    public static float fArrFld[]=new float[N];
    public static int iArrFld1[]=new int[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 0.326F);
        FuzzerUtils.init(Test.iArrFld1, -13);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i4) {

        int i5=-4, i6=-33537, i7=7, i8=182;
        float f1=0.73F;

        Test.instanceCount += i4;
        for (i5 = 9; i5 < 241; i5++) {
            switch ((i5 % 2) + 42) {
            case 42:
                for (i7 = 1; i7 < 7; i7++) {
                    Test.fArrFld[i7] *= 31011;
                    switch (((-36353 >>> 1) % 2) + 12) {
                    case 12:
                        Test.instanceCount += (i7 | i6);
                        f1 += (i7 - i4);
                        Test.iArrFld1[i7 - 1] *= (int)f1;
                        i8 = -24515;
                        break;
                    case 13:
                        f1 += i8;
                        i8 += (((i7 * Test.instanceCount) + Test.instanceCount) - i4);
                        break;
                    default:
                        Test.iArrFld1[i5 - 1] -= i5;
                    }
                    if (i4 != 0) {
                    }
                    Test.iArrFld1 = Test.iArrFld1;
                }
            case 43:
            }
        }
        long meth_res = i4 + i5 + i6 + i7 + i8 + Float.floatToIntBits(f1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth() {

        long l1=14L, lArr[]=new long[N];
        int i3=-54535, i9=60, i10=22447, i11=124, i12=-31468, i13=45422, i14=4, iArr[]=new int[N];
        float f2=-2.845F;
        boolean b=true;

        FuzzerUtils.init(lArr, 35652L);
        FuzzerUtils.init(iArr, -81);

        for (l1 = 14; l1 < 314; ++l1) {
            lArr[(int)(l1 + 1)] >>= (++Test.instanceCount);
            i3 += Math.max((int)((-(i3 - Test.dFld)) + iArr[(int)(l1)]), (int)((Test.instanceCount + i3) + (138 + (-(i3
                * Test.instanceCount)))));
        }
        lMeth(i3);
        for (i9 = 7; i9 < 335; ++i9) {
            i3 = (int)1.1022F;
            f2 *= i9;
            Test.instanceCount >>= l1;
            for (i11 = 1; i11 < 5; i11++) {
                Test.dFld = -194;
                for (i13 = 2; i13 > 1; i13 -= 2) {
                    i14 = -20;
                    try {
                        i10 = (1587539751 % i9);
                        i3 = (36851 / i9);
                        i12 = (i3 / i14);
                    } catch (ArithmeticException a_e) {}
                    if (b) continue;
                    Test.instanceCount >>= i13;
                }
            }
        }
        long meth_res = l1 + i3 + i9 + i10 + Float.floatToIntBits(f2) + i11 + i12 + i13 + i14 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth() {

        float f=53.384F, f3=1.989F;
        int i2=32465, i15=1, i16=158;

        iFld -= (int)((iFld * (iFld - f)) - ((f++) * -5));
        i2 = 1;
        while (++i2 < 137) {
            iFld = iMeth();
        }
        iFld -= (int)52.739F;
        for (f3 = 2; f3 < 322; ++f3) {
            i15 -= 95;
            Test.dFld = Test.dFld;
            iFld += (int)(f3 * f3);
            Test.bFld = Test.bFld;
            i16 = 1;
            while (++i16 < 5) {
                i15 *= iFld;
                iFld -= (int)Test.dFld;
                i15 -= i15;
                lArrFld[(int)(f3)] %= (i2 | 1);
            }
            Test.instanceCount = i2;
        }
        vMeth_check_sum += Float.floatToIntBits(f) + i2 + Float.floatToIntBits(f3) + i15 + i16;
    }

    public void mainTest(String[] strArr1) {

        long l=-13L;
        int i=-5, i1=-5153, i17=-12, i18=-40, i19=-5, iArr1[][]=new int[N][N];
        double d=71.93390;
        byte by=3;

        FuzzerUtils.init(iArr1, 38404);

        iFld <<= iFld;
        iArrFld[(iFld >>> 1) % N] = (int)((++iArrFld[(iFld >>> 1) % N]) + ((-2.250F - lArrFld[(iFld >>> 1) % N]) -
            (iFld << iFld)));
        for (l = 10; l < 181; ++l) {
            for (d = 147; d > 6; d--) {
                vMeth();
                iFld &= iFld;
                iFld = (int)l;
                i17 = 1;
                while (++i17 < 2) {
                    Test.instanceCount >>>= Test.instanceCount;
                    iFld = i17;
                    Test.instanceCount += l;
                    Test.dFld -= i17;
                }
                i1 -= i17;
                Test.instanceCount *= by;
            }
            i1 -= i;
            iArrFld = Test.iArrFld1;
            iFld -= i;
            iArr1 = iArr1;
            iFld = -150;
            Test.bFld = Test.bFld;
            Test.instanceCount += -10;
            for (i18 = 4; i18 < 147; i18++) {
                by >>>= (byte)i18;
                fFld = i;
                Test.instanceCount <<= 38628;
                iFld = i17;
                i -= (int)Test.instanceCount;
                iFld += -6;
                i += i1;
                Test.dFld -= fFld;
            }
        }

        FuzzerUtils.out.println("l i d = " + l + "," + i + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("i1 i17 by = " + i1 + "," + i17 + "," + by);
        FuzzerUtils.out.println("i18 i19 iArr1 = " + i18 + "," + i19 + "," + FuzzerUtils.checkSum(iArr1));

        FuzzerUtils.out.println("Test.instanceCount iFld Test.dFld = " + Test.instanceCount + "," + iFld + "," +
            Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.bFld fFld iArrFld = " + (Test.bFld ? 1 : 0) + "," + Float.floatToIntBits(fFld) +
            "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("lArrFld Test.fArrFld Test.iArrFld1 = " + FuzzerUtils.checkSum(lArrFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," + FuzzerUtils.checkSum(Test.iArrFld1));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  lMeth ->  lMeth iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
