// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:01 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=4242377485715763460L;
    public static byte byFld=-85;
    public static float fFld=-1.278F;
    public static volatile boolean bFld=false;
    public static double dFld=9.98178;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];
    public static volatile double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -2510785021L);
        FuzzerUtils.init(Test.iArrFld, -20128);
        FuzzerUtils.init(Test.dArrFld, 10.99548);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i3) {

        int i4=-56589, i5=-55, i7=-6, i8=7;
        long l=25689L, l1=6L, lArr[]=new long[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(lArr, -53334L);
        FuzzerUtils.init(fArr, 0.4F);

        Test.lArrFld[(i3 >>> 1) % N] = 43468;
        i4 = 1;
        while (++i4 < 367) {
            for (l = 1; 5 > l; l++) {
                Test.iArrFld[(int)(l)] = i3;
            }
            Test.iArrFld[i4] = i3;
            i5 = i4;
            l1 = 1;
            while (++l1 < 5) {
                Test.instanceCount = (long)Test.fFld;
                i3 += (int)(l1 * l1);
                lArr[(int)(l1)] = (long)72.65454;
                fArr[(int)(l1 - 1)] = i3;
            }
            i5 -= (int)-2.33F;
        }
        for (i7 = 17; i7 < 348; i7++) {
            if (i7 != 0) {
                vMeth1_check_sum += i3 + i4 + l + i5 + l1 + i7 + i8 + FuzzerUtils.checkSum(lArr) +
                    Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                return;
            }
            i8 -= i3;
        }
        vMeth1_check_sum += i3 + i4 + l + i5 + l1 + i7 + i8 + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static int iMeth(int i1, int i2) {

        int i9=13, i10=14, i11=-56252, i12=6, i13=236, iArr[]=new int[N];

        FuzzerUtils.init(iArr, 472);

        iArr[(i2 >>> 1) % N] = (int)(Test.byFld - ((i2 & Test.instanceCount) + (i1++)));
        if (Test.bFld) {
            if (true) {
                vMeth1(-101);
                i1 -= 32;
                Test.fFld += Test.byFld;
            }
            i2 += (int)Test.instanceCount;
            Test.dArrFld[(i9 >>> 1) % N] = Test.instanceCount;
            i9 -= 9;
        }
        for (i10 = 7; i10 < 368; i10 += 2) {
            Test.fFld = i9;
            Test.instanceCount -= Test.instanceCount;
            for (i12 = 1; 9 > i12; ++i12) {
                i2 <<= i1;
                Test.instanceCount = Test.byFld;
            }
        }
        long meth_res = i1 + i2 + i9 + i10 + i11 + i12 + i13 + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i=-40164, i14=11, i15=236, i16=-5, i17=-46, i18=2;
        double d=0.65063;

        i >>= iMeth(i, i);
        i14 = 1;
        do {
            d = i;
            i <<= i14;
            Test.iArrFld[i14 + 1] = -1;
            i += (int)Test.instanceCount;
            i = (int)Test.instanceCount;
            for (i15 = 11; i14 < i15; i15 -= 2) {
                Test.iArrFld[i15 - 1] += i;
                for (i17 = i15; i17 < 1; i17++) {
                    i18 -= i;
                    if (Test.bFld) break;
                    Test.iArrFld[i17 - 1] = i18;
                    i = (int)d;
                    if (i14 != 0) {
                        vMeth_check_sum += i + i14 + Double.doubleToLongBits(d) + i15 + i16 + i17 + i18;
                        return;
                    }
                }
            }
        } while (++i14 < 137);
        vMeth_check_sum += i + i14 + Double.doubleToLongBits(d) + i15 + i16 + i17 + i18;
    }

    public void mainTest(String[] strArr1) {

        int i19=-9124, i20=3, i21=12713, i22=-215, i23=-48139, i24=21628, i25=-15182, i26=9737, i27=-9047;
        short s=17543, s1=13384;
        float fArr1[]=new float[N];

        FuzzerUtils.init(fArr1, 32.342F);

        vMeth();
        Test.instanceCount &= i19;
        Test.bFld = Test.bFld;
        for (i20 = 9; 158 > i20; ++i20) {
            Test.fFld += i21;
            try {
                i22 = (i20 % i20);
                i22 = (i21 / i21);
                Test.iArrFld[i20] = (i21 / -147);
            } catch (ArithmeticException a_e) {}
            i22 -= 166;
            for (i23 = 168; i23 > 2; i23 -= 3) {
                i22 += (((i23 * s) + i20) - i20);
                switch (((i20 % 2) * 5) + 71) {
                case 72:
                    s1 += (short)i23;
                    i19 += (int)Test.instanceCount;
                    Test.instanceCount += i24;
                    break;
                case 75:
                    fArr1[i23 - 1] += i23;
                    i25 = 1;
                    do {
                        Test.iArrFld[(i20 >>> 1) % N] = s;
                        Test.instanceCount /= ((long)(Test.dFld) | 1);
                        Test.instanceCount += i25;
                    } while (++i25 < 4);
                    for (i26 = i20; i26 < 4; i26++) {
                        i19 += (i26 - Test.instanceCount);
                        Test.instanceCount = Test.byFld;
                        i24 %= (int)(i19 | 1);
                        if (Test.bFld) {
                            try {
                                i22 = (i21 / -244);
                                i22 = (Test.iArrFld[i20 + 1] / 232);
                                i19 = (i22 % Test.iArrFld[i20]);
                            } catch (ArithmeticException a_e) {}
                        }
                        i27 = i24;
                        Test.iArrFld[i23 - 1] >>>= i27;
                        Test.instanceCount -= Test.instanceCount;
                        i21 *= i20;
                    }
                    break;
                }
                Test.fFld = i23;
                i24 >>>= 38793;
            }
        }

        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("s s1 i25 = " + s + "," + s1 + "," + i25);
        FuzzerUtils.out.println("i26 i27 fArr1 = " + i26 + "," + i27 + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));

        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.fFld = " + Test.instanceCount + "," + Test.byFld +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.bFld Test.dFld Test.lArrFld = " + (Test.bFld ? 1 : 0) + "," +
            Double.doubleToLongBits(Test.dFld) + "," + FuzzerUtils.checkSum(Test.lArrFld));
        FuzzerUtils.out.println("Test.iArrFld Test.dArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
