// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:15 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-45901L;
    public static int iFld=164;
    public static boolean bFld=true;
    public static double dFld=-2.55699;
    public static float fFld=2.567F;
    public static int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];
    public static short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 15533);
        FuzzerUtils.init(Test.fArrFld, -30.777F);
        FuzzerUtils.init(Test.sArrFld, (short)-14317);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        boolean b=false;

        b = b;
        vMeth2_check_sum += (b ? 1 : 0);
    }

    public static void vMeth1() {

        float f=-5.238F;
        double d=-55.126994, dArr[]=new double[N];
        int i3=-34865, i4=0, iArr[]=new int[N];
        boolean b1=false;
        short s=28283;
        byte by=-90;

        FuzzerUtils.init(dArr, 2.33558);
        FuzzerUtils.init(iArr, -8);

        Test.iFld = Test.iFld;
        Test.iFld += (int)(Test.iFld - (dArr[(Test.iFld >>> 1) % N]++));
        vMeth2();
        f -= Test.iFld;
        d = Test.iFld;
        for (int i2 : iArr) {
            for (i3 = 1; i3 < 4; ++i3) {
                if (b1) break;
                Test.iFld += Test.iFld;
                s += (short)i3;
                i4 = i4;
                f += by;
                Test.iFld += (206 + (i3 * i3));
                i2 = 25327;
                Test.iFld += (int)Test.instanceCount;
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i3 + i4 + (b1 ? 1 : 0) + s + by +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i, long l1, int i1) {

        int i5=12, i6=14, i7=-2, i8=46312, i9=-6, i10=-22037;

        vMeth1();
        for (i5 = 11; i5 < 226; ++i5) {
            Test.iFld -= i6;
            for (i7 = 1; i7 < 7; i7++) {
                for (i9 = 1; i9 < 2; i9++) {
                    i8 = 28245;
                    Test.iArrFld[i7 + 1] *= Test.iFld;
                    switch (((i7 % 9) * 5) + 59) {
                    case 62:
                        l1 *= Test.iFld;
                        if (Test.bFld) continue;
                        i6 &= i10;
                        break;
                    case 86:
                        Test.iFld = i7;
                    case 64:
                        Test.dFld -= Test.fFld;
                        Test.fArrFld[i7] += i5;
                        i += (((i9 * Test.iFld) + Test.iFld) - l1);
                        break;
                    case 74:
                        i10 ^= i6;
                    case 103:
                    case 101:
                        i6 -= -46050;
                        break;
                    case 65:
                        i6 *= i8;
                        break;
                    case 100:
                        i -= i6;
                        break;
                    case 78:
                        i8 &= i10;
                        break;
                    default:
                        Test.dFld *= 242;
                    }
                }
            }
        }
        vMeth_check_sum += i + l1 + i1 + i5 + i6 + i7 + i8 + i9 + i10;
    }

    public void mainTest(String[] strArr1) {

        long l=-10544L, l2=-42L;
        byte by1=51;
        int i11=-41762, i12=23852, i13=-1, i14=-128, i15=-60, i16=-136, i17=-9556, i18=-32760, i19=-29712;

        l -= (((Test.iFld++) - (l++)) + ((Test.iFld--) - (-40436 + (-29544 + (-Test.iFld)))));
        vMeth(Test.iFld, Test.instanceCount, Test.iFld);
        Test.fFld -= Test.iFld;
        l = (long)Test.dFld;
        Test.iFld += by1;
        Test.iFld *= Test.iFld;
        Test.sArrFld[(Test.iFld >>> 1) % N] /= (short)(Test.iFld | 1);
        for (i11 = 6; i11 < 124; ++i11) {
            i12 += Test.iFld;
            i12 += -4982;
            for (i13 = 6; 212 > i13; i13 += 2) {
                for (i15 = 3; i15 > 1; i15 -= 2) {
                    Test.fFld -= Test.iFld;
                    i14 += (i15 * i15);
                    Test.iFld += 9;
                    l2 -= i15;
                    i17 = (int)Test.instanceCount;
                    if (Test.bFld) continue;
                    Test.instanceCount += (i15 ^ i11);
                    i12 <<= (int)Test.instanceCount;
                    i14 = -5;
                }
                for (i18 = 1; i18 < 3; ++i18) {
                    l2 = i19;
                    Test.iFld += (i18 * i18);
                    Test.fFld = i19;
                    i19 = (int)l;
                    Test.instanceCount *= i11;
                }
                Test.fFld += l;
                Test.instanceCount = -4039037759L;
                Test.iArrFld[i11 - 1] >>= i13;
            }
        }

        FuzzerUtils.out.println("l by1 i11 = " + l + "," + by1 + "," + i11);
        FuzzerUtils.out.println("i12 i13 i14 = " + i12 + "," + i13 + "," + i14);
        FuzzerUtils.out.println("i15 i16 l2 = " + i15 + "," + i16 + "," + l2);
        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.bFld = " + Test.instanceCount + "," + Test.iFld +
            "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.dFld Test.fFld Test.iArrFld = " + Double.doubleToLongBits(Test.dFld) + "," +
            Float.floatToIntBits(Test.fFld) + "," + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.fArrFld Test.sArrFld = " +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," + FuzzerUtils.checkSum(Test.sArrFld));

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