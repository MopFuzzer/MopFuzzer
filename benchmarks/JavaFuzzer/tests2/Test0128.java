// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:17 2023
public class Test0128 {

    public static final int N = 400;

    public static long instanceCount=241L;
    public static float fFld=-111.897F;
    public byte byFld=-68;
    public static double dFld=-103.104192;
    public static volatile boolean bFld=false;
    public static int iFld=-60538;
    public static long lFld=50911L;
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0128.iArrFld, 11);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(float f1, long l, long l1) {

        int i4=9;
        int[] iArr =new int[N];
        byte by=-32;

        FuzzerUtils.init(iArr, -62397);

        i4 = by;
        iArr[(-2 >>> 1) % N] = (int)l1;
        i4 += i4;
        vMeth2_check_sum += Float.floatToIntBits(f1) + l + l1 + i4 + by + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(float f, int i2, int i3) {

        int i5=-68;
        int i6=9;
        int i7=-119;
        int i8=11;
        int i9=-7;
        int i10=182;
        int[] iArr1 =new int[N];
        byte by1=-37;
        double d=-83.12786;
        double[][] dArr =new double[N][N];

        FuzzerUtils.init(iArr1, 218);
        FuzzerUtils.init(dArr, -79.72662);

        vMeth2(f, Test0128.instanceCount, Test0128.instanceCount);
        for (i5 = 1; i5 < 261; i5 += 2) {
            for (i7 = 1; i7 < 12; ++i7) {
                switch ((i5 % 2) + 33) {
                case 33:
                    Test0128.instanceCount += i7;
                    iArr1[i5 - 1] = i3;
                    break;
                case 34:
                    i8 += (((i7 * Test0128.instanceCount) + Test0128.instanceCount) - f);
                    iArr1[i5] -= (int)-100.915F;
                    for (i9 = 1; 2 > i9; ++i9) {
                        i2 += i9;
                        Test0128.instanceCount += i9;
                        iArr1[i5 - 1] *= by1;
                        d += -9;
                        i3 -= 26244;
                        dArr[i9 + 1][i9 - 1] += Test0128.instanceCount;
                    }
                }
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f) + i2 + i3 + i5 + i6 + i7 + i8 + i9 + i10 + by1 +
            Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void vMeth(boolean b) {

        int i=-10;
        int i1=-240;
        int i11=8;
        int i12=248;
        int[] iArr2 =new int[N];
        float f2=127.180F;
        double[] dArr1 =new double[N];

        FuzzerUtils.init(dArr1, 1.51872);
        FuzzerUtils.init(iArr2, 154);

        for (i = 315; i > 5; --i) {
            i1 *= (int) (Test0128.instanceCount + (i1++));
            vMeth1(Test0128.fFld, i1, -25);
            Test0128.instanceCount += (long) f2;
            byFld -= byFld;
            i1 = (int) Test0128.instanceCount;
            dArr1[i - 1] += Test0128.dFld;
            Test0128.instanceCount = i;
            i1 = 22;
            i11 += (((i * Test0128.instanceCount) + Test0128.instanceCount) - i11);
            i12 = 1;
            while (++i12 < 5) {
                i1 = 230;
                i1 = (int) Test0128.instanceCount;
                i1 >>= i12;
                try {
                    iArr2[i12 + 1] = (i11 / i);
                    i11 = (-151 / i12);
                    i11 = (i11 % -29908);
                } catch (ArithmeticException a_e) {}
            }
        }
        vMeth_check_sum += (b ? 1 : 0) + i + i1 + Float.floatToIntBits(f2) + i11 + i12 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)) + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i13=-13, i14=45185, i15=-5, i16=6, i17=4086, i18=49136;
        long l2=212L;
        long l3=-161L;
        long[] lArr =new long[N];
        float f3=2.963F;
        short s=17803;

        FuzzerUtils.init(lArr, 1304128694L);

        vMeth(Test0128.bFld);
        i13 ^= i13;
        Test0128.instanceCount += Test0128.instanceCount;
        l2 = 1;
        do {
            Test0128.iArrFld[(int) (l2 - 1)] <<= (int) Test0128.instanceCount;
            Test0128.bFld = Test0128.bFld;
            i13 = i13;
            Test0128.instanceCount *= 3;
        } while ((l2 += 3) < 123);
        if (Test0128.bFld) {
            Test0128.dFld = Test0128.iFld;
            f3 = 1;
            while (++f3 < 153) {
                Test0128.lFld = 8775626687275742550L;
                Test0128.instanceCount = i13;
                lArr = lArr;
                if (Test0128.bFld) {
                    Test0128.iFld += (int) ((long) f3 ^ s);
                    for (l3 = (long)(f3); l3 < 164; l3++) {
                        i13 += (int)(((l3 * i13) + l3) - l2);
                        switch ((int)((l3 % 1) + 67)) {
                        case 67:
                            for (i15 = 1; 1 > i15; i15++) {
                                Test0128.iFld *= Test0128.iFld;
                                i13 = i14;
                                i16 = (int) Test0128.lFld;
                                Test0128.instanceCount >>= i15;
                                lArr[i15] -= Test0128.lFld;
                            }
                            break;
                        }
                        i16 -= -12;
                        i14 -= byFld;
                        for (i17 = 1; i17 > 1; --i17) {
                            Test0128.iFld = s;
                            i18 %= (int)-2184297059727390831L;
                        }
                    }
                } else if (Test0128.bFld) {
                    Test0128.iArrFld = Test0128.iArrFld;
                } else if (Test0128.bFld) {
                    i18 += (int) (((f3 * Test0128.iFld) + Test0128.iFld) - i14);
                }
            }
        } else {
            Test0128.fFld += 11708L;
        }

        FuzzerUtils.out.println("i13 l2 f3 = " + i13 + "," + l2 + "," + Float.floatToIntBits(f3));
        FuzzerUtils.out.println("s l3 i14 = " + s + "," + l3 + "," + i14);
        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 lArr = " + i18 + "," + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test0128.instanceCount Test0128.fFld byFld = " + Test0128.instanceCount + "," +
                Float.floatToIntBits(Test0128.fFld) + "," + byFld);
        FuzzerUtils.out.println("Test0128.dFld Test0128.bFld Test0128.iFld = " + Double.doubleToLongBits(Test0128.dFld) + "," +
                (Test0128.bFld ? 1 : 0) + "," + Test0128.iFld);
        FuzzerUtils.out.println("Test0128.lFld Test0128.iArrFld = " + Test0128.lFld + "," + FuzzerUtils.checkSum(Test0128.iArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0128 _instance = new Test0128();
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
