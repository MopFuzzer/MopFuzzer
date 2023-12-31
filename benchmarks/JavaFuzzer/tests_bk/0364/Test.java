// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:02 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-38146L;
    public static volatile short sFld=8221;
    public static int iFld=-2;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 40899);
        FuzzerUtils.init(Test.lArrFld, -59L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(float f, int i9) {

        int i11=41, i12=-29643, i13=11, i14=-250;
        double d=-83.84795;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)48);

        i9 = -43;
        for (int i10 : Test.iArrFld) {
            i9 = i9;
            for (i11 = 4; i11 > 1; i11--) {
                i10 = i12;
                byArr = byArr;
                Test.iArrFld[i11] *= (int)Test.instanceCount;
                for (i13 = 1; i13 < 2; i13++) {
                    Test.sFld += (short)(i13 - f);
                    Test.instanceCount *= (long)1.21F;
                    i10 += (int)(-4704420568922362617L + (i13 * i13));
                    i9 = (int)-2.129344;
                }
                i12 += i10;
                Test.lArrFld = FuzzerUtils.long1array(N, (long)8642453411542725427L);
                d = i13;
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f) + i9 + i11 + i12 + i13 + i14 + Double.doubleToLongBits(d) +
            FuzzerUtils.checkSum(byArr);
    }

    public static void vMeth(int i1, int i2) {

        int i3=150, i4=229, i5=-107, i6=9, i7=-219, i8=63;
        float f1=0.732F;
        byte by=-3;
        double d1=-127.20429;

        for (i3 = 13; i3 < 229; i3++) {
            i4 += (i3 - Test.sFld);
            for (i5 = 1; 7 > i5; i5++) {
                for (i7 = 1; i7 < 2; i7++) {
                    vMeth1(f1, i3);
                    i1 *= i1;
                    i8 = i5;
                    i6 = (int)30.94F;
                    switch (((i3 % 8) * 5) + 48) {
                    case 67:
                        Test.instanceCount = by;
                    case 71:
                        Test.instanceCount += i7;
                        by -= (byte)i8;
                        i4 -= (int)-33.819F;
                        i8 >>= i4;
                    case 88:
                        i1 = i1;
                        break;
                    case 61:
                        Test.instanceCount -= i7;
                        break;
                    case 76:
                    case 73:
                        Test.instanceCount += (((i7 * Test.instanceCount) + Test.instanceCount) - i7);
                        break;
                    case 54:
                        f1 = (float)d1;
                        break;
                    case 77:
                        Test.iArrFld = Test.iArrFld;
                        break;
                    }
                }
            }
        }
        vMeth_check_sum += i1 + i2 + i3 + i4 + i5 + i6 + i7 + i8 + Float.floatToIntBits(f1) + by +
            Double.doubleToLongBits(d1);
    }

    public static int iMeth() {

        int i15=11534, i16=-203, i17=-69, i18=-5, i19=11;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)31832);

        vMeth(Test.iFld, Test.iFld);
        Test.instanceCount = Test.iFld;
        for (i15 = 4; i15 < 239; ++i15) {
            float f2=1.699F;
            f2 -= i16;
            Test.iFld += (i15 - Test.instanceCount);
            i16 = -64;
            Test.iFld = Test.iFld;
            sArr[i15] = (short)Test.instanceCount;
            i17 = 1;
            while (++i17 < 7) {
                Test.instanceCount *= Test.iFld;
                Test.iFld += (int)Test.instanceCount;
                Test.iFld *= i15;
                for (i18 = 1; i18 < 1; i18++) {
                    f2 -= 12;
                    i19 += i18;
                }
            }
        }
        long meth_res = i15 + i16 + i17 + i18 + i19 + FuzzerUtils.checkSum(sArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-9;

        i = iMeth();
        Test.sFld &= Test.sFld;
        Test.iFld -= i;
        Test.instanceCount += Test.iFld;

        FuzzerUtils.out.println("i = " + i);

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.iFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Test.iFld);
        FuzzerUtils.out.println("Test.iArrFld Test.lArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
