// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:54 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=4L;
    public static double dFld=51.73403;
    public static boolean bFld=false;
    public static short sFld=-19808;
    public static int iFld=7;
    public byte byFld=-9;
    public static volatile int iArrFld[][]=new int[N][N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 9);
        FuzzerUtils.init(Test.lArrFld, 9163125853143465787L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(short s, int i3, int i4) {

        int i5=28214, i6=-53867, i7=-9, i8=103, i9=-12, i10=8;
        float f1=53.764F;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-89);

        Test.iArrFld[(i3 >>> 1) % N][(i4 >>> 1) % N] = i3;
        for (i5 = 3; i5 < 226; ++i5) {
            for (i7 = 1; 7 > i7; ++i7) {
                try {
                    i6 = (i7 / 402626179);
                    i4 = (Test.iArrFld[i5][i5] / -52029);
                    i8 = (i3 / 152);
                } catch (ArithmeticException a_e) {}
                i3 = (int)Test.dFld;
                for (i9 = i7; i9 < 2; i9++) {
                    i8 = i3;
                    f1 -= i7;
                    if (true) continue;
                    Test.instanceCount += Test.instanceCount;
                    byArr[i9] -= (byte)i5;
                    Test.instanceCount += (long)f1;
                    Test.bFld = Test.bFld;
                    Test.iArrFld[i9] = Test.iArrFld[i7 - 1];
                    f1 = i7;
                }
            }
        }
        vMeth2_check_sum += s + i3 + i4 + i5 + i6 + i7 + i8 + i9 + i10 + Float.floatToIntBits(f1) +
            FuzzerUtils.checkSum(byArr);
    }

    public static void vMeth1() {

        int i11=200, i12=66;

        vMeth2(Test.sFld, Test.iFld, 2);
        for (i11 = 4; 163 > i11; ++i11) {
            Test.instanceCount = Test.iFld;
            Test.lArrFld[i11] = -3208462722L;
        }
        Test.instanceCount = i11;
        vMeth1_check_sum += i11 + i12;
    }

    public static void vMeth(float f, long l, int i2) {

        int i13=15, i14=131, i15=-61781, i16=198;
        float f2=110.512F;
        byte byArr1[]=new byte[N];

        FuzzerUtils.init(byArr1, (byte)-87);

        vMeth1();
        Test.iFld = (int)Test.instanceCount;
        if (Test.bFld) {
            for (long l1 : Test.lArrFld) {
                i2 -= 80;
            }
            i13 = 1;
            while (++i13 < 368) {
                Test.iFld = (int)Test.instanceCount;
                for (i14 = 1; 5 > i14; ++i14) {
                    if (i15 != 0) {
                        vMeth_check_sum += Float.floatToIntBits(f) + l + i2 + i13 + i14 + i15 +
                            Float.floatToIntBits(f2) + i16 + FuzzerUtils.checkSum(byArr1);
                        return;
                    }
                }
                i2 -= i13;
                for (f2 = 5; 1 < f2; f2 -= 3) {
                    f += 54026;
                    byArr1[(125 >>> 1) % N] = (byte)189;
                    i16 += (int)f2;
                    if (Test.bFld) continue;
                }
            }
        } else if (Test.bFld) {
            i16 = i13;
        }
        vMeth_check_sum += Float.floatToIntBits(f) + l + i2 + i13 + i14 + i15 + Float.floatToIntBits(f2) + i16 +
            FuzzerUtils.checkSum(byArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=-147, i1=-7141, i17=11449, i18=-9113, i19=-9, i20=-242, i21=14, i22=13;
        float f3=2.138F, f4=1.338F;
        byte byArr2[][]=new byte[N][N];

        FuzzerUtils.init(byArr2, (byte)32);

        Test.iArrFld[(i >>> 1) % N][(i >>> 1) % N] = (int)Test.dFld;
        Test.instanceCount = ((--Test.instanceCount) - i);
        i1 = 1;
        while (++i1 < 361) {
            vMeth(-101.646F, Test.instanceCount, i1);
            Test.iFld += (i1 | Test.instanceCount);
            for (i17 = 1; i17 < 70; i17++) {
                f3 += Test.iFld;
                if (Test.bFld) {
                    i += (((i17 * Test.iFld) + i17) - Test.instanceCount);
                    i18 = (int)Test.instanceCount;
                    Test.iArrFld[i17 - 1][i17 + 1] = i1;
                    i18 <<= i17;
                } else if (Test.bFld) {
                    Test.instanceCount += i1;
                    i18 = i17;
                } else {
                    Test.iFld -= byFld;
                }
            }
            i <<= i;
            for (f4 = 4; f4 < 70; f4++) {
                i19 = Test.iFld;
                Test.iFld <<= -210;
                Test.iArrFld[i1 + 1][i1] *= (int)f3;
            }
            i18 *= i18;
            i19 = i17;
            i20 = 1;
            while (++i20 < 70) {
                Test.lArrFld = Test.lArrFld;
            }
        }
        i18 = Test.iFld;
        if (Test.bFld) {
            for (i21 = 6; 165 > i21; i21++) {
                i18 += (int)Test.instanceCount;
                Test.iFld *= i20;
                i >>>= -24307;
            }
        } else if (true) {
            byArr2[(i >>> 1) % N] = byArr2[(i1 >>> 1) % N];
        } else if (Test.bFld) {
            Test.lArrFld[(i17 >>> 1) % N] -= Test.instanceCount;
        } else {
            byFld = (byte)1146187459849092383L;
        }

        FuzzerUtils.out.println("i i1 i17 = " + i + "," + i1 + "," + i17);
        FuzzerUtils.out.println("i18 f3 f4 = " + i18 + "," + Float.floatToIntBits(f3) + "," + Float.floatToIntBits(f4));
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 byArr2 = " + i22 + "," + FuzzerUtils.checkSum(byArr2));

        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.bFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(Test.dFld) + "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.sFld Test.iFld byFld = " + Test.sFld + "," + Test.iFld + "," + byFld);
        FuzzerUtils.out.println("Test.iArrFld Test.lArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            FuzzerUtils.checkSum(Test.lArrFld));

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