// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:08 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-179L;
    public static float fFld=20.575F;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 6666132085921210351L);
        FuzzerUtils.init(Test.iArrFld, -86);
        FuzzerUtils.init(Test.fArrFld, 2.253F);
        FuzzerUtils.init(Test.dArrFld, -1.76751);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i5, long l) {

        byte by1=60;
        int i6=239, i7=-52801, i8=-7241, i9=190;
        long l2=-8L;
        double d=41.33791;
        float f1=-6.539F;

        for (long l1 : Test.lArrFld) {
            by1 = (byte)i5;
            i5 -= i6;
            for (l2 = 1; l2 < 4; ++l2) {
                for (i8 = 1; i8 < 2; i8++) {
                    short s=-4405;
                    d += l1;
                    switch ((i8 % 2) + 122) {
                    case 122:
                        s = (short)l1;
                        f1 = i6;
                        break;
                    case 123:
                        i6 *= i8;
                        l <<= i5;
                        Test.iArrFld[i8 + 1] += (int)f1;
                        break;
                    default:
                        i5 = (int)d;
                        i6 += (((i8 * i8) + i6) - i8);
                    }
                }
                i7 += (int)l2;
            }
        }
        vMeth2_check_sum += i5 + l + by1 + i6 + l2 + i7 + i8 + i9 + Double.doubleToLongBits(d) +
            Float.floatToIntBits(f1);
    }

    public static void vMeth1(int i4) {

        int i10=20786, i11=-43, i12=39290;

        vMeth2(i4, Test.instanceCount);
        for (i10 = 8; i10 < 218; ++i10) {
            if (i10 != 0) {
                vMeth1_check_sum += i4 + i10 + i11 + i12;
                return;
            }
            i11 = i4;
            i12 = 1;
            do {
                Test.iArrFld = Test.iArrFld;
                Test.iArrFld[i10] -= (int)Test.fFld;
                i11 <<= i12;
                i4 |= i11;
                i4 += i10;
                Test.instanceCount += (((i12 * Test.instanceCount) + i11) - i10);
                i4 += -3;
                i4 -= i12;
                Test.iArrFld[i10 + 1] >>>= (int)Test.instanceCount;
            } while (++i12 < 8);
            Test.fArrFld[i10 + 1] += i11;
        }
        vMeth1_check_sum += i4 + i10 + i11 + i12;
    }

    public static void vMeth(float f, int i, int i1) {

        byte by=13;
        int i2=242, i3=145, i13=19508, i14=60370, i15=4, i16=-12, i17=-2;
        double d1=-16.56053;

        by -= (byte)(--Test.lArrFld[(i1 >>> 1) % N]);
        for (i2 = 12; i2 < 261; ++i2) {
            vMeth1(i2);
            i += (i2 * i2);
            for (i13 = 1; 7 > i13; i13++) {
                for (i15 = 1; i15 < 2; i15++) {
                    i16 += (i15 | i3);
                    i16 = (int)d1;
                    try {
                        i1 = (i16 / -104);
                        i = (i17 / i15);
                        i17 = (13558 % Test.iArrFld[i2]);
                    } catch (ArithmeticException a_e) {}
                    i1 -= (int)4871317696229455510L;
                    Test.iArrFld[i15 - 1] *= (int)Test.instanceCount;
                    Test.instanceCount = (long)Test.fFld;
                    if (true) break;
                    i14 += i15;
                    i1 *= i14;
                }
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f) + i + i1 + by + i2 + i3 + i13 + i14 + i15 + i16 +
            Double.doubleToLongBits(d1) + i17;
    }

    public void mainTest(String[] strArr1) {

        int i18=-21333, i19=17968, i20=2, i21=-13, i22=36902, i23=-5, i24=215, i25=184, i26=34102, i27=-214, i28=-36,
            i29=1, i30=-5, i31=3;
        byte by2=-75, by3=75;
        short s1=12511;

        vMeth(Test.fFld, -73, i18);
        Test.iArrFld[(i18 >>> 1) % N] = i18;
        for (i19 = 359; i19 > 19; i19 -= 3) {
            for (i21 = 5; i21 < 222; i21++) {
                for (i23 = 1; i23 < 2; i23++) {
                    i22 &= i19;
                    i20 = by2;
                    i22 *= i20;
                    i22 = (int)Test.instanceCount;
                }
                s1 = (short)i18;
                i20 += (((i21 * by2) + i18) - Test.instanceCount);
                Test.dArrFld[i19] *= i24;
                i24 = i20;
                for (i25 = 1; i25 < 2; i25++) {
                    boolean b=true;
                    try {
                        i20 = (i24 % 40277);
                        i22 = (i19 % i25);
                        i22 = (7735 / i18);
                    } catch (ArithmeticException a_e) {}
                    i26 -= 9;
                    Test.lArrFld[i21 - 1] = i20;
                    by3 += (byte)i25;
                    s1 = (short)i20;
                    i18 = (int)96.41590;
                    Test.instanceCount += (i25 - i20);
                    b = b;
                }
            }
            Test.instanceCount = i19;
            Test.instanceCount += (5 + (i19 * i19));
        }
        for (i27 = 8; i27 < 131; i27 += 3) {
            i29 = 1;
            do {
                i24 = (int)Test.instanceCount;
                for (i30 = 1; i30 < 2; ++i30) {
                    i22 += (int)(-69L + (i30 * i30));
                    Test.instanceCount *= 4L;
                }
            } while (++i29 < i27);
        }

        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 by2 s1 = " + i24 + "," + by2 + "," + s1);
        FuzzerUtils.out.println("i25 i26 by3 = " + i25 + "," + i26 + "," + by3);
        FuzzerUtils.out.println("i27 i28 i29 = " + i27 + "," + i28 + "," + i29);
        FuzzerUtils.out.println("i30 i31 = " + i30 + "," + i31);

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.lArrFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + FuzzerUtils.checkSum(Test.lArrFld));
        FuzzerUtils.out.println("Test.iArrFld Test.fArrFld Test.dArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + ","
            + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));

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
