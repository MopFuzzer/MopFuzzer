// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:03 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=8373712019782286613L;
    public static double dFld=75.44024;
    public static int iFld=27234;
    public static boolean bFld=false;
    public static byte byFld=62;
    public static float fFld=80.889F;
    public short sFld=26665;
    public static boolean bFld1=true;
    public static int iArrFld[]=new int[N];
    public static short sArrFld[][]=new short[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, 39087);
        FuzzerUtils.init(Test.sArrFld, (short)27988);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        int i9=-10, i10=-7, i11=-177;
        boolean b=true;
        byte by=34;

        i9 = 1;
        while (++i9 < 247) {
            Test.instanceCount = Test.instanceCount;
            Test.dFld -= -91L;
        }
        Test.iFld >>= i9;
        i10 = 1;
        do {
            Test.iFld += (i10 * i10);
            b = b;
            Test.iFld = i9;
            Test.iFld = i9;
            Test.sArrFld[(Test.iFld >>> 1) % N] = FuzzerUtils.short1array(N, (short)-4565);
            Test.iFld *= (int)Test.dFld;
            i11 = 1;
            while (++i11 < 5) {
                Test.instanceCount += (1090 + (i11 * i11));
                by += (byte)Test.iFld;
                b = false;
            }
        } while (++i10 < 330);
        vMeth_check_sum += i9 + i10 + (b ? 1 : 0) + i11 + by;
    }

    public static int iMeth1(int i6, double d, int i7) {

        double d1=-113.107905;
        int i8=-1, i12=-12, i13=233, i14=215;
        long l1=-4543433511190646978L;

        for (d1 = 9; 231 > d1; d1++) {
            vMeth();
            i7 = (int)-25101L;
            for (l1 = (long)(d1); l1 < 7; ++l1) {
                i7 = 110;
                Test.bFld = Test.bFld;
                Test.instanceCount += 124;
                switch ((int)((l1 % 1) + 113)) {
                case 113:
                    Test.instanceCount += (l1 ^ i6);
                    switch ((int)((l1 % 1) + 99)) {
                    case 99:
                        for (i13 = 1; i13 < 1; ++i13) {
                            i7 >>>= (int)l1;
                            Test.instanceCount <<= i8;
                            d -= i14;
                            d -= i13;
                        }
                        break;
                    default:
                        try {
                            i12 = (20818 % i13);
                            i12 = (Test.iFld / -25);
                            i8 = (-174 % i13);
                        } catch (ArithmeticException a_e) {}
                    }
                    break;
                default:
                    i12 -= i14;
                }
            }
        }
        long meth_res = i6 + Double.doubleToLongBits(d) + i7 + Double.doubleToLongBits(d1) + i8 + l1 + i12 + i13 + i14;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(short s, int i1) {

        int i2=49464, i3=219, i4=-4, i5=297, i15=-237;
        long l=3099L, lArr1[]=new long[N];
        double d2=2.50040;

        FuzzerUtils.init(lArr1, -6L);

        for (i2 = 4; i2 < 322; i2++) {
            for (i4 = 1; 5 > i4; i4++) {
                i5 += i4;
                l = 1;
                do {
                    Test.iArrFld = (Test.iArrFld = (Test.iArrFld = (Test.iArrFld = FuzzerUtils.int1array(N, (int)-2))));
                    Test.instanceCount *= (Test.instanceCount << (iMeth1(Test.iFld, Test.dFld, 117) + i5));
                } while (++l < 2);
                try {
                    Test.iFld = (Test.iArrFld[i4 + 1] / 649848232);
                    Test.iArrFld[i4 + 1] = (i2 / -39);
                    i1 = (Test.iArrFld[i2 - 1] / i2);
                } catch (ArithmeticException a_e) {}
                Test.byFld = (byte)-2;
            }
            Test.byFld += (byte)i1;
            i3 = (int)l;
        }
        lArr1[(-3367 >>> 1) % N] -= (long)Test.fFld;
        d2 = 1;
        do {
            i15 = 1;
            do {
                i3 = -1;
                Test.instanceCount += 14;
            } while (++i15 < 10);
        } while (++d2 < 154);
        long meth_res = s + i1 + i2 + i3 + i4 + i5 + l + Double.doubleToLongBits(d2) + i15 +
            FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-1, i16=-70, i17=-19121, i18=148, i19=6, i20=-25, i21=-38143, i22=-27091, i23=5;
        long lArr[]=new long[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(lArr, -118L);
        FuzzerUtils.init(fArr, 77.903F);

        Test.iArrFld[(i >>> 1) % N] += (int)((lArr[(i >>> 1) % N] - (i + Test.instanceCount)) + i);
        Test.dFld = iMeth(sFld, Test.iFld);
        Test.instanceCount = Test.iFld;
        for (i16 = 9; i16 < 168; ++i16) {
            for (i18 = i16; i18 < 158; i18++) {
                i19 += -4741;
                Test.instanceCount = Test.byFld;
                if (Test.bFld) {
                    Test.iFld = i17;
                    i17 += i;
                } else if (Test.bFld1) {
                    Test.iArrFld[i16] = Test.iFld;
                } else if (Test.bFld) {
                    if (Test.bFld) break;
                    for (i20 = 1; i20 > 1; i20--) {
                        Test.iFld %= (int)(i21 | 1);
                        Test.iFld += (i20 + sFld);
                    }
                    Test.iFld -= (int)-106.961F;
                } else {
                    Test.instanceCount += (long)Test.dFld;
                    Test.iArrFld[i18 - 1] <<= i;
                }
                for (i22 = 1; i22 < 1; i22++) {
                    i23 = i16;
                    Test.dFld += i18;
                    i += Test.iFld;
                    i17 += (i22 ^ (long)Test.fFld);
                    i17 = (int)-5L;
                    Test.iFld = -8;
                }
                try {
                    i23 = (Test.iFld % i22);
                    i17 = (i16 % 91);
                    i19 = (i16 % -45475);
                } catch (ArithmeticException a_e) {}
                fArr[i16 + 1] += Test.instanceCount;
                Test.fFld *= Test.iFld;
                i17 *= i18;
            }
            lArr[i16 - 1] = i21;
        }

        FuzzerUtils.out.println("i i16 i17 = " + i + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("lArr fArr = " + FuzzerUtils.checkSum(lArr) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.iFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(Test.dFld) + "," + Test.iFld);
        FuzzerUtils.out.println("Test.bFld Test.byFld Test.fFld = " + (Test.bFld ? 1 : 0) + "," + Test.byFld + "," +
            Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("sFld Test.bFld1 Test.iArrFld = " + sFld + "," + (Test.bFld1 ? 1 : 0) + "," +
            FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.sArrFld = " + FuzzerUtils.checkSum(Test.sArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
