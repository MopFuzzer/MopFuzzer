// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:13 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=11L;
    public static float fFld=0.113F;
    public static int iFld=28754;
    public static double dFld=0.71075;
    public short sFld=-25998;
    public byte byFld=90;
    public static volatile double dArrFld[]=new double[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 0.4738);
        FuzzerUtils.init(Test.iArrFld, -12);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i6=-17308, i7=42083, i8=215, i9=922;
        boolean b=false;

        Test.iArrFld[(Test.iFld >>> 1) % N] -= Test.iFld;
        i6 = 1;
        while (++i6 < 300) {
            if (b) {
                for (i7 = 1; i7 < 6; ++i7) {
                    i9 = 1;
                    do {
                        Test.iFld = (int)Test.instanceCount;
                        i8 += i9;
                        switch (((i7 % 4) * 5) + 55) {
                        case 73:
                            b = b;
                            break;
                        case 63:
                            i8 = 3;
                            Test.instanceCount += (long)Test.dFld;
                            Test.fFld += (-24176L + (i9 * i9));
                            b = b;
                            break;
                        case 58:
                            if (b) continue;
                            Test.instanceCount += i7;
                            break;
                        case 64:
                            Test.instanceCount = i6;
                        }
                    } while (++i9 < 2);
                }
                vMeth2_check_sum += i6 + i7 + i8 + i9 + (b ? 1 : 0);
                return;
            }
        }
        vMeth2_check_sum += i6 + i7 + i8 + i9 + (b ? 1 : 0);
    }

    public static void vMeth1(int i3, int i4, int i5) {

        short s=4616;
        long lArr[]=new long[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(lArr, -3939695210L);
        FuzzerUtils.init(fArr, 1.667F);

        lArr[(i3 >>> 1) % N] += i3;
        s = (short)(Test.instanceCount--);
        fArr = fArr;
        i5 *= i5;
        vMeth2();
        vMeth1_check_sum += i3 + i4 + i5 + s + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void vMeth() {

        long l=7L;
        byte by=19;
        double d2=2.77128;
        int i10=253, i11=1, i12=28, i13=9628, i14=47233;

        vMeth1(Test.iFld, 167, Test.iFld);
        Test.iFld = Test.iFld;
        Test.iFld *= (int)Test.fFld;
        l = 1;
        while (++l < 345) {
            by -= (byte)Test.iFld;
        }
        Test.iFld += Test.iFld;
        Test.iFld += (int)Test.dFld;
        for (d2 = 358; d2 > 17; d2 -= 3) {
            by = (byte)9;
            for (i11 = 1; i11 < 14; ++i11) {
                sFld <<= (short)i10;
                try {
                    i10 = (Test.iFld / 136);
                    i10 = (i10 / Test.iFld);
                    Test.iArrFld[i11] = (Test.iFld / Test.iFld);
                } catch (ArithmeticException a_e) {}
                for (i13 = 1; i13 < 2; i13++) {
                    Test.iArrFld[i13] |= -10;
                    Test.dArrFld[i13] = -56;
                }
            }
        }
        vMeth_check_sum += l + by + Double.doubleToLongBits(d2) + i10 + i11 + i12 + i13 + i14;
    }

    public void mainTest(String[] strArr1) {

        double d=14.124870, d1=-30.86008, d3=1.60041;
        int i=-51831, i1=53, i2=-33, i15=156, i16=195, i17=21237, i18=-41666;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 148L);

        for (d = 9; d < 254; d++) {
            d1 = 103;
            do {
                for (i1 = 1; i1 > 1; i1--) {
                    Test.instanceCount = (i2 + ((--i2) - (--i)));
                    Test.dArrFld[i1] = -10;
                    Test.iArrFld[i1 - 1] ^= (int)(Test.instanceCount + ((224 + (Test.instanceCount++)) * (i *
                        Test.fFld)));
                }
                vMeth();
                d3 = 1;
                while (++d3 < 1) {
                    Test.iArrFld[(int)(d - 1)] = (int)Test.fFld;
                    i += (int)(d3 * d3);
                    Test.fFld *= byFld;
                    lArr1[(int)(d1 + 1)] /= ((long)(Test.dFld) | 1);
                }
            } while (--d1 > 0);
            for (i15 = 6; 103 > i15; ++i15) {
                i <<= (int)1664123562L;
                Test.iFld += i15;
                i >>= i;
                for (i17 = 1; 2 > i17; ++i17) {
                    i = i2;
                    sFld += (short)(i17 * i17);
                    i += (int)Test.instanceCount;
                    Test.instanceCount += 16325;
                    Test.iFld = (int)Test.instanceCount;
                    Test.instanceCount = Test.iFld;
                    byFld *= (byte)Test.iFld;
                }
                Test.fFld += (((i15 * i1) + i1) - Test.instanceCount);
                Test.iArrFld[i15 + 1] -= (int)Test.instanceCount;
                i18 += (((i15 * i18) + Test.instanceCount) - i15);
                Test.instanceCount -= i17;
            }
            byFld -= (byte)Test.iFld;
        }
        Test.instanceCount = Test.iFld;

        FuzzerUtils.out.println("d i d1 = " + Double.doubleToLongBits(d) + "," + i + "," + Double.doubleToLongBits(d1));
        FuzzerUtils.out.println("i1 i2 d3 = " + i1 + "," + i2 + "," + Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 lArr1 = " + i18 + "," + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.iFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.iFld);
        FuzzerUtils.out.println("Test.dFld sFld byFld = " + Double.doubleToLongBits(Test.dFld) + "," + sFld + "," +
            byFld);
        FuzzerUtils.out.println("Test.dArrFld Test.iArrFld = " +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)) + "," + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
