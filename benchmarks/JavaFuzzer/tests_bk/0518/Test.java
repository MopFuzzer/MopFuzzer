// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:06 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=23186L;
    public static int iFld=-60085;
    public static short sFld=-13366;
    public static int iFld1=-123;
    public static int iArrFld[]=new int[N];
    public static volatile short sArrFld[]=new short[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -35447);
        FuzzerUtils.init(Test.sArrFld, (short)15287);
        FuzzerUtils.init(Test.lArrFld, 4149582837027423392L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i3) {

        int i4=39760, i5=40239, i6=32, i7=-9, i8=-10;
        short s=-805;
        boolean b1=true;
        float f1=2.322F;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 0.77075);

        dArr[(-167 >>> 1) % N] = -181;
        Test.instanceCount ^= Test.iFld;
        for (i4 = 252; i4 > 5; i4--) {
            Test.iFld = i3;
            for (i6 = 1; i6 < 7; ++i6) {
                i7 *= (int)Test.instanceCount;
                i8 = 1;
                while (++i8 < 2) {
                    Test.instanceCount -= s;
                    if (i6 != 0) {
                        vMeth1_check_sum += i3 + i4 + i5 + i6 + i7 + i8 + s + (b1 ? 1 : 0) + Float.floatToIntBits(f1) +
                            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                        return;
                    }
                    Test.iFld = i3;
                    if (b1) continue;
                    i5 += i4;
                    f1 -= f1;
                    Test.instanceCount += (i8 * Test.instanceCount);
                    Test.instanceCount = Test.instanceCount;
                }
            }
        }
        vMeth1_check_sum += i3 + i4 + i5 + i6 + i7 + i8 + s + (b1 ? 1 : 0) + Float.floatToIntBits(f1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth(float f) {

        int i2=200, i9=243, i10=242;
        double d=0.56788, d1=74.122860, d2=2.85107;
        byte by=-77;

        Test.iArrFld[(i2 >>> 1) % N] += (Test.iFld >> Test.iFld);
        vMeth1(i2);
        i9 = 1;
        while (++i9 < 186) {
            d = 9;
            while (--d > 0) {
                i2 += (int)((long)d ^ Test.iFld);
                Test.iFld <<= Test.sFld;
            }
            by *= (byte)Test.instanceCount;
            d1 -= 14;
            Test.sArrFld[i9] -= (short)d;
            Test.iArrFld[i9 - 1] = 61209;
            Test.lArrFld[i9] >>= 204;
        }
        Test.iFld = i9;
        for (d2 = 8; d2 < 216; ++d2) {
            Test.lArrFld[(int)(d2)] = i9;
        }
        Test.instanceCount += -7;
        vMeth_check_sum += Float.floatToIntBits(f) + i2 + i9 + Double.doubleToLongBits(d) + by +
            Double.doubleToLongBits(d1) + Double.doubleToLongBits(d2) + i10;
    }

    public static int iMeth(boolean b, int i, int i1) {

        float f2=88.355F;
        double d3=50.72656;
        int i11=53575, i12=-8, i14=9, i15=-243, i16=-110;

        Test.instanceCount |= Test.iArrFld[(Test.iFld >>> 1) % N];
        vMeth(f2);
        Test.instanceCount <<= Test.instanceCount;
        Test.instanceCount *= (long)d3;
        for (i11 = 8; i11 < 170; i11 += 2) {
            i1 += 42258;
            Test.iArrFld[i11 + 1] = i1;
            Test.instanceCount *= i14;
            f2 -= i1;
            i -= (int)d3;
            for (i15 = 19; i15 > 1; i15 -= 2) {
                i12 -= (int)Test.instanceCount;
            }
            Test.sFld -= Test.sFld;
            Test.instanceCount = (long)f2;
            Test.instanceCount += i11;
        }
        long meth_res = (b ? 1 : 0) + i + i1 + Float.floatToIntBits(f2) + Double.doubleToLongBits(d3) + i11 + i12 + i14
            + i15 + i16;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        byte by1=-51;
        int i17=-63711, i18=57, i19=163, i20=7;

        Test.iFld <<= (iMeth(false, 20810, Test.iFld) * 94);
        Test.iFld = by1;
        Test.iFld = (int)Test.instanceCount;
        for (i17 = 11; 283 > i17; ++i17) {
            Test.instanceCount = Test.sFld;
            Test.iFld = Test.iFld;
        }
        for (i19 = 14; i19 < 273; i19++) {
            i18 >>>= i20;
            Test.instanceCount += 7287047255652844701L;
            Test.lArrFld[i19 + 1] = i19;
        }
        switch (((-5 >>> 1) % 2) + 28) {
        case 28:
        case 29:
            Test.iFld = Test.iFld1;
        }
        Test.iArrFld[(i18 >>> 1) % N] = -13;

        FuzzerUtils.out.println("by1 i17 i18 = " + by1 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 i20 = " + i19 + "," + i20);

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.sFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Test.sFld);
        FuzzerUtils.out.println("Test.iFld1 Test.iArrFld Test.sArrFld = " + Test.iFld1 + "," +
            FuzzerUtils.checkSum(Test.iArrFld) + "," + FuzzerUtils.checkSum(Test.sArrFld));
        FuzzerUtils.out.println("Test.lArrFld = " + FuzzerUtils.checkSum(Test.lArrFld));

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
