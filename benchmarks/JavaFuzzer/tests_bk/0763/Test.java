// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:12 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3265L;
    public static float fFld=1.151F;
    public static byte byFld=58;
    public int iFld=41090;
    public static int iArrFld[]=new int[N];
    public static int iArrFld1[]=new int[N];
    public static float fArrFld[]=new float[N];
    public static volatile long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -4);
        FuzzerUtils.init(Test.iArrFld1, 171);
        FuzzerUtils.init(Test.fArrFld, 0.118F);
        FuzzerUtils.init(Test.lArrFld, 1076383406L);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i9) {

        int i10=-18667, i11=-12679, i12=239, i13=-6, i14=6, i15=-4;

        for (i10 = 2; 188 > i10; i10++) {
            i9 += (i10 - i9);
            Test.instanceCount += (i10 * i10);
            Test.iArrFld = FuzzerUtils.int1array(N, (int)-13);
            switch ((i10 % 2) + 81) {
            case 81:
                for (i12 = 1; i12 < 9; ++i12) {
                    Test.instanceCount = Test.byFld;
                    i9 *= i9;
                    Test.instanceCount *= 5;
                    Test.iArrFld1[i10] = i14;
                    i15 = 1;
                    do {
                        Test.instanceCount += i9;
                        i11 += (i15 | i9);
                        Test.fFld = i10;
                    } while (++i15 < 2);
                    i13 >>>= i13;
                }
                break;
            case 82:
                Test.instanceCount += (((i10 * i10) + i9) - i15);
                break;
            default:
                Test.fArrFld = Test.fArrFld;
            }
        }
        long meth_res = i9 + i10 + i11 + i12 + i13 + i14 + i15;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i8=-131, i16=6, i17=-11;
        double d=-2.60496;
        boolean b1=false;

        i8 += iMeth(i8);
        for (d = 22; d < 381; ++d) {
            i17 = 1;
            while (++i17 < 5) {
                i16 += (int)(-64700L + (i17 * i17));
                Test.instanceCount += (i17 * Test.instanceCount);
                Test.instanceCount = (long)Test.fFld;
                Test.iArrFld1[(int)(d - 1)] -= -3;
                Test.instanceCount <<= -298640253L;
                Test.instanceCount += i17;
                Test.iArrFld1 = Test.iArrFld;
            }
            Test.lArrFld[(int)(d)] *= i17;
            if (b1) break;
            i8 += (int)(((d * Test.instanceCount) + Test.instanceCount) - i17);
            i16 = i17;
            Test.iArrFld1[(int)(d)] += i8;
        }
        vMeth_check_sum += i8 + Double.doubleToLongBits(d) + i16 + i17 + (b1 ? 1 : 0);
    }

    public static long lMeth(int i6, int i7, boolean b) {

        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)20262);

        i7 -= (--i6);
        vMeth();
        sArr[(i6 >>> 1) % N] *= (short)Test.instanceCount;
        Test.fFld = i7;
        Test.fFld += i7;
        i6 = 56;
        if (b) {
            Test.iArrFld[(i7 >>> 1) % N] = i7;
        }
        long meth_res = i6 + i7 + (b ? 1 : 0) + FuzzerUtils.checkSum(sArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=12, i1=-78, i2=10, i3=-243, i4=201, i5=-10855, i18=-26526, i19=27617, i20=-190;
        boolean b2=false;
        double d1=-80.79510, dArr[]=new double[N];
        short s=11512;

        FuzzerUtils.init(dArr, -77.17186);

        for (i = 7; i < 180; i++) {
            Test.iArrFld[i] = 28362;
        }
        for (i2 = 9; i2 < 313; ++i2) {
            for (i4 = 2; i4 < 83; ++i4) {
                Test.fFld -= lMeth(i3, i3, b2);
                for (i18 = 2; i18 > 1; i18--) {
                    Test.fFld += i18;
                    d1 *= i18;
                    switch ((i4 % 8) + 62) {
                    case 62:
                        Test.instanceCount += (201 + (i18 * i18));
                        i1 = i18;
                        i19 += (i18 - Test.byFld);
                        i19 = Test.byFld;
                    case 63:
                        Test.iArrFld1[i2 - 1] += iFld;
                        i19 >>= i5;
                        s -= (short)Test.instanceCount;
                        break;
                    case 64:
                        Test.iArrFld1[i4 - 1] ^= iFld;
                    case 65:
                        dArr[i2 - 1] -= Test.instanceCount;
                        Test.instanceCount = i;
                        Test.instanceCount += (i18 * i18);
                        Test.iArrFld = FuzzerUtils.int1array(N, (int)-3);
                        break;
                    case 66:
                        i5 = i1;
                        i1 = -8425;
                        i5 += i19;
                    case 67:
                        Test.instanceCount += Test.instanceCount;
                        i1 *= (int)Test.fFld;
                    case 68:
                        i20 += i18;
                        i19 >>= (int)Test.instanceCount;
                        break;
                    case 69:
                        Test.instanceCount += i18;
                        break;
                    default:
                        i1 += (((i18 * Test.instanceCount) + i2) - Test.instanceCount);
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i4 i5 = " + i3 + "," + i4 + "," + i5);
        FuzzerUtils.out.println("b2 i18 i19 = " + (b2 ? 1 : 0) + "," + i18 + "," + i19);
        FuzzerUtils.out.println("d1 s i20 = " + Double.doubleToLongBits(d1) + "," + s + "," + i20);
        FuzzerUtils.out.println("dArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.byFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.byFld);
        FuzzerUtils.out.println("iFld Test.iArrFld Test.iArrFld1 = " + iFld + "," + FuzzerUtils.checkSum(Test.iArrFld)
            + "," + FuzzerUtils.checkSum(Test.iArrFld1));
        FuzzerUtils.out.println("Test.fArrFld Test.lArrFld = " +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
