// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:57 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-28221L;
    public static float fFld=0.998F;
    public static short sFld=19729;
    public int iFld=4;
    public double dFld=-2.26076;
    public static int iFld1=63357;
    public static long lArrFld[]=new long[N];
    public static volatile float fArrFld[]=new float[N];
    public static int iArrFld[]=new int[N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 53351L);
        FuzzerUtils.init(Test.fArrFld, 124.373F);
        FuzzerUtils.init(Test.iArrFld, -20);
        FuzzerUtils.init(Test.dArrFld, -1.87662);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i8=13, i9=20483, i10=14, i11=90, i12=22387, i13=-53110;
        double d1=70.79725;
        boolean b=true, bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, true);

        i8 = 1;
        do {
            Test.lArrFld[i8] = Test.instanceCount;
            Test.fArrFld[i8 + 1] *= i8;
            for (d1 = 1; d1 < 8; ++d1) {
                for (i10 = i8; i10 < 2; i10++) {
                    i9 += i8;
                }
                i11 = 20396;
                Test.fFld -= i11;
                i12 = 1;
                while ((i12 += 3) < 2) {
                    bArr[i8] = b;
                    if (false) {
                        i11 += i9;
                    } else if (b) {
                        Test.iArrFld[i12 + 1] = (int)Test.instanceCount;
                        Test.dArrFld[i12 + 1] -= i12;
                    } else {
                        Test.instanceCount += (i12 * i13);
                        vMeth2_check_sum += i8 + Double.doubleToLongBits(d1) + i9 + i10 + i11 + i12 + (b ? 1 : 0) + i13
                            + FuzzerUtils.checkSum(bArr);
                        return;
                    }
                }
            }
        } while (++i8 < 205);
        vMeth2_check_sum += i8 + Double.doubleToLongBits(d1) + i9 + i10 + i11 + i12 + (b ? 1 : 0) + i13 +
            FuzzerUtils.checkSum(bArr);
    }

    public static void vMeth1(int i3, int i4, float f) {

        int i5=-1, i6=5, i7=92;
        boolean b1=false;
        byte by=1;

        i5 = 1;
        while (++i5 < 398) {
            i3 += (int)(-Test.instanceCount);
            i3 -= (i5 + i3);
            for (i6 = 1; i6 < 4; i6++) {
                vMeth2();
                Test.iArrFld = Test.iArrFld;
                i7 += i3;
                i3 += (i6 * i6);
            }
            Test.instanceCount += i3;
            Test.instanceCount -= (long)f;
            Test.instanceCount += (i5 * i5);
            switch ((i5 % 6) + 47) {
            case 47:
                if (b1) break;
                i7 ^= i3;
                i3 = i4;
                break;
            case 48:
                f += i5;
                break;
            case 49:
                b1 = b1;
                break;
            case 50:
                i7 += (0 + (i5 * i5));
            case 51:
                i4 *= by;
                break;
            case 52:
                Test.iArrFld[(-7080 >>> 1) % N] = i3;
            default:
                Test.iArrFld[i5 + 1] = -51;
            }
        }
        vMeth1_check_sum += i3 + i4 + Float.floatToIntBits(f) + i5 + i6 + i7 + (b1 ? 1 : 0) + by;
    }

    public static void vMeth() {

        double d=1.46617;
        int i=215, i1=204, i2=68, i14=58036, i15=-27, i16=221, i17=14;
        byte by1=-30;
        long l=2028631903L;
        boolean bArr1[]=new boolean[N];

        FuzzerUtils.init(bArr1, false);

        for (d = 16; d < 268; ++d) {
            for (i1 = 1; i1 < 6; ++i1) {
                vMeth1(i1, -209, Test.fFld);
                i2 += 31642;
            }
            Test.instanceCount = -63905L;
            i2 -= 25586;
        }
        i2 = i2;
        for (i14 = 4; i14 < 350; i14++) {
            by1 -= (byte)-27085;
            bArr1 = FuzzerUtils.boolean1array(N, (boolean)true);
            i16 = 1;
            while (++i16 < 5) {
                for (l = i14; l < 1; ++l) {
                    Test.instanceCount = i14;
                    Test.instanceCount -= Test.sFld;
                    Test.fFld = -2;
                }
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + i + i1 + i2 + i14 + i15 + by1 + i16 + l + i17 +
            FuzzerUtils.checkSum(bArr1);
    }

    public void mainTest(String[] strArr1) {

        int i18=7, i19=24039, i20=52266, i21=3466, i22=189, i23=9482, i24=-46, i25=-82;
        boolean b2=true;

        vMeth();
        Test.instanceCount *= Test.instanceCount;
        iFld <<= iFld;
        iFld = iFld;
        Test.sFld = (short)26302;
        Test.fArrFld[(iFld >>> 1) % N] = iFld;
        for (i18 = 359; i18 > 3; i18--) {
            Test.instanceCount -= Test.instanceCount;
            Test.instanceCount = Test.sFld;
            iFld >>= i18;
            for (i20 = 1; i20 < 71; ++i20) {
                Test.sFld += (short)(i20 - Test.instanceCount);
                Test.instanceCount += (i20 * i20);
            }
            for (i22 = 2; i22 < 71; ++i22) {
                if (b2) {
                    dFld = Test.instanceCount;
                    Test.instanceCount += i21;
                    for (i24 = 1; i24 < 2; ++i24) {
                        Test.instanceCount *= i23;
                        dFld = Test.sFld;
                        iFld = i19;
                        try {
                            i23 = (70 % Test.iFld1);
                            i25 = (i22 % 74);
                            i25 = (-24017 / i24);
                        } catch (ArithmeticException a_e) {}
                        Test.sFld = (short)i21;
                        Test.iArrFld[i24] = (int)Test.instanceCount;
                        i21 <<= i25;
                        switch ((i18 % 2) + 90) {
                        case 90:
                            if (b2) continue;
                            try {
                                Test.iArrFld[i24] = (-48778 % Test.iArrFld[i18 - 1]);
                                iFld = (i19 % -69);
                                i19 = (Test.iArrFld[i24 + 1] / 60);
                            } catch (ArithmeticException a_e) {}
                            Test.sFld -= (short)i22;
                            Test.fFld += (i24 * i24);
                            break;
                        case 91:
                            i25 >>= Test.iFld1;
                        }
                    }
                } else {
                    if (b2) break;
                }
            }
        }

        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 b2 = " + i24 + "," + i25 + "," + (b2 ? 1 : 0));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.sFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.sFld);
        FuzzerUtils.out.println("iFld dFld Test.iFld1 = " + iFld + "," + Double.doubleToLongBits(dFld) + "," +
            Test.iFld1);
        FuzzerUtils.out.println("Test.lArrFld Test.fArrFld Test.iArrFld = " + FuzzerUtils.checkSum(Test.lArrFld) + ","
            + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.dArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));

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
