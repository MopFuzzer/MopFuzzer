// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:54 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-6L;
    public static double dFld=-2.54884;
    public static short sFld=25800;
    public static volatile long lArrFld[]=new long[N];
    public int iArrFld[]=new int[N];
    public static int iArrFld1[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -58122L);
        FuzzerUtils.init(Test.iArrFld1, 56725);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i6, int i7) {

        int i8=10, i9=-28133, i10=-161, i11=-10, i12=137, i13=105, i14=-187, i15=11, i16=12, i17=-12, i18=-220,
            iArr[]=new int[N], iArr1[]=new int[N];
        float f2=0.601F;
        boolean b1=false;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(iArr, 13347);
        FuzzerUtils.init(iArr1, 196);
        FuzzerUtils.init(byArr, (byte)68);

        for (i8 = 4; i8 < 173; ++i8) {
            for (i10 = i8; 9 > i10; i10++) {
                i6 >>>= i10;
            }
        }
        for (i12 = 4; i12 < 232; ++i12) {
            for (i14 = 1; i14 < 7; i14++) {
                i16 += (((i14 * f2) + i11) - i9);
                for (i17 = 2; 1 < i17; i17 -= 3) {
                    Test.instanceCount = i6;
                    iArr[i17] += -77;
                    Test.dFld *= i17;
                    if (b1) {
                        Test.instanceCount += i9;
                    }
                    i13 += i17;
                    iArr1[i12] = i16;
                    byArr[i12 + 1] -= (byte)i8;
                }
            }
        }
        vMeth2_check_sum += i6 + i7 + i8 + i9 + i10 + i11 + i12 + i13 + i14 + i15 + i16 + Float.floatToIntBits(f2) +
            i17 + i18 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(byArr);
    }

    public static void vMeth1(boolean b, float f1) {

        int i19=-12;

        vMeth2(i19, i19);
        Test.instanceCount *= i19;
        vMeth1_check_sum += (b ? 1 : 0) + Float.floatToIntBits(f1) + i19;
    }

    public static void vMeth(short s) {

        int i4=248, i5=133, i20=9, i21=134, i22=43545, i23=748, i24=0, i25=156, i26=-12, i27=219;
        boolean b2=false;

        for (i4 = 6; 231 > i4; i4++) {
            float f3=-42.702F;
            vMeth1(b2, f3);
            Test.instanceCount = 11289L;
            for (i20 = 7; i20 > 1; i20 -= 2) {
                Test.dFld *= Test.instanceCount;
                i5 += (int)Test.instanceCount;
            }
            for (i22 = 1; i22 < 7; ++i22) {
                for (i24 = 1; i24 < 2; ++i24) {
                    Test.iArrFld1[i22] >>= i24;
                }
                Test.iArrFld1[i22] *= i5;
                Test.instanceCount = Test.instanceCount;
                for (i26 = i22; 2 > i26; ++i26) {
                    Test.dFld *= i4;
                    if (b2) continue;
                }
                i27 = i5;
            }
        }
        vMeth_check_sum += s + i4 + i5 + (b2 ? 1 : 0) + i20 + i21 + i22 + i23 + i24 + i25 + i26 + i27;
    }

    public void mainTest(String[] strArr1) {

        int i=-39851, i2=238, i3=5597, i28=-24087, i29=-24898, i30=-5;
        float f=69.911F, f4=6.715F, f5=2.47F;
        byte by=-47;
        boolean b3=true;

        i -= (int)(--Test.lArrFld[(-4 >>> 1) % N]);
        iArrFld[(i >>> 1) % N] += (int)(++Test.instanceCount);
        for (int i1 : iArrFld) {
            for (i2 = 1; i2 < 63; i2 += 2) {
                Test.instanceCount += (i2 * Test.instanceCount);
                i1 <<= (int)(((i2 - Test.instanceCount) - i3) - ((Test.instanceCount + i) * (--f)));
                vMeth(Test.sFld);
                i1 *= by;
                i = i2;
                by += (byte)i2;
                try {
                    i1 = (-170 % i2);
                    i = (i3 % i3);
                    i = (19949 % i2);
                } catch (ArithmeticException a_e) {}
                Test.dFld = i3;
            }
            i1 += 53614;
            for (f4 = 1; f4 < 63; ++f4) {
                for (f5 = 1; f5 < 2; ++f5) {
                    i1 += (int)(((f5 * f4) + i28) - i29);
                    i1 = i1;
                    if (b3) continue;
                    i1 += i3;
                    try {
                        iArrFld[(int)(f4)] = (i28 / Test.iArrFld1[(int)(f5)]);
                        i3 = (i / 33208);
                        i = (-85 / i28);
                    } catch (ArithmeticException a_e) {}
                    Test.instanceCount = i1;
                    i3 *= i1;
                    if (b3) break;
                    Test.instanceCount %= (by | 1);
                }
                i29 = i1;
                if (b3) break;
                i30 = 1;
                while (++i30 < 2) {
                    iArrFld[(int)(f4 - 1)] = i2;
                    i29 = i3;
                    i28 = i;
                }
            }
        }

        FuzzerUtils.out.println("i i2 i3 = " + i + "," + i2 + "," + i3);
        FuzzerUtils.out.println("f by f4 = " + Float.floatToIntBits(f) + "," + by + "," + Float.floatToIntBits(f4));
        FuzzerUtils.out.println("i28 f5 i29 = " + i28 + "," + Float.floatToIntBits(f5) + "," + i29);
        FuzzerUtils.out.println("b3 i30 = " + (b3 ? 1 : 0) + "," + i30);

        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.sFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(Test.dFld) + "," + Test.sFld);
        FuzzerUtils.out.println("Test.lArrFld iArrFld Test.iArrFld1 = " + FuzzerUtils.checkSum(Test.lArrFld) + "," +
            FuzzerUtils.checkSum(iArrFld) + "," + FuzzerUtils.checkSum(Test.iArrFld1));

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
