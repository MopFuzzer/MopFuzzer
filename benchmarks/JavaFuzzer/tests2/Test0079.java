// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:15 2023
public class Test0079 {

    public static final int N = 400;

    public static long instanceCount=-1774L;
    public static volatile int iFld=-131;
    public static float fFld=110.173F;
    public static boolean bFld=true;
    public static short sFld=22623;
    public static byte[] byArrFld =new byte[N];
    public static long[][] lArrFld =new long[N][N];
    public static int[] iArrFld =new int[N];
    public static float[] fArrFld =new float[N];

    static {
        FuzzerUtils.init(Test0079.byArrFld, (byte) -45);
        FuzzerUtils.init(Test0079.lArrFld, 13L);
        FuzzerUtils.init(Test0079.iArrFld, -230);
        FuzzerUtils.init(Test0079.fArrFld, -1.276F);
    }

    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i3, int i4) {

        int i5=87;
        int i6=2085;
        int i7=-4;
        int i8=-177;
        int[] iArr =new int[N];
        float f=103.96F;
        double d=112.12827;

        FuzzerUtils.init(iArr, -14);

        Test0079.iFld *= i4;
        iArr[(Test0079.iFld >>> 1) % N] &= 11;
        i5 = 1;
        do {
            Test0079.fFld += (((i5 * Test0079.iFld) + i4) - i5);
            i3 += Test0079.iFld;
            for (f = 1; 13 > f; f++) {
                Test0079.instanceCount *= Test0079.instanceCount;
                Test0079.bFld = Test0079.bFld;
                Test0079.instanceCount = i3;
                if (false) continue;
            }
            Test0079.fFld += (((i5 * Test0079.instanceCount) + i6) - i3);
            for (i7 = 1; i7 < 13; i7++) {
                Test0079.iFld >>= i8;
                i6 = i5;
                d += i7;
            }
        } while (++i5 < 122);
        vMeth_check_sum += i3 + i4 + i5 + Float.floatToIntBits(f) + i6 + i7 + i8 + Double.doubleToLongBits(d) +
            FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth() {

        double d1=53.117918, d2=-58.38086;
        int i9=19700, i10=36490;

        vMeth(Test0079.iFld, -11);
        Test0079.lArrFld[(Test0079.iFld >>> 1) % N][(Test0079.iFld >>> 1) % N] %= -66911874L;
        Test0079.iFld *= -21607;
        Test0079.iArrFld[(Test0079.iFld >>> 1) % N] <<= Test0079.iFld;
        Test0079.iArrFld[(220 >>> 1) % N] *= Test0079.iFld;
        d1 -= d1;
        i9 = 1;
        do {
            Test0079.instanceCount = Test0079.iFld;
            Test0079.bFld = true;
            Test0079.iFld += i9;
            for (d2 = 9; d2 > 1; --d2) {
                Test0079.fFld -= i10;
                Test0079.instanceCount *= Test0079.iFld;
                Test0079.iFld = Test0079.iFld;
                Test0079.iFld <<= i10;
            }
        } while (++i9 < 181);
        long meth_res = Double.doubleToLongBits(d1) + i9 + Double.doubleToLongBits(d2) + i10;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth(int i, long l, int i1) {

        int i2=0, i11=-9, i12=-105;
        float f1=0.827F;
        double d3=60.110800;

        i2 = 1;
        do {
            Test0079.byArrFld[i2 + 1] = (byte) iMeth();
            i1 += i2;
            for (f1 = 9; i2 < f1; f1--) {
                i1 = (int)f1;
                for (d3 = 1; d3 < 1; d3++) {
                    l -= i1;
                    i1 += 52;
                    i11 += (int) (d3 * Test0079.fFld);
                    i1 = (int)-193L;
                    if (Test0079.bFld) {
                        Test0079.iArrFld[(int) (d3 - 1)] -= i1;
                        if (i != 0) {
                        }
                    } else if (Test0079.bFld) {
                        Test0079.fArrFld[i2] += -575385101L;
                        i12 += (int)d3;
                    } else if (Test0079.bFld) {
                        i11 += 14;
                    }
                }
            }
        } while (++i2 < 184);
        long meth_res = i + l + i1 + i2 + Float.floatToIntBits(f1) + i11 + Double.doubleToLongBits(d3) + i12;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i13=9, i14=-1, i15=7, i16=-44028, i17=248, i18=16097, i19=-10;
        byte by=-20;
        float f2=61.279F;
        double d4=-2.7785;

        lMeth(-155, Test0079.instanceCount, 24315);
        for (i13 = 12; i13 < 390; i13++) {
            Test0079.fFld = by;
        }
        i15 = 1;
        do {
            i14 = (int) Test0079.instanceCount;
            f2 = 1;
            do {
                Test0079.iArrFld = Test0079.iArrFld;
                switch ((((i15 >>> 1) % 4) * 5) + 110) {
                case 125:
                    Test0079.iFld = Test0079.iFld;
                    break;
                case 123:
                case 120:
                    Test0079.instanceCount = Test0079.iFld;
                    i16 = 1;
                    do {
                        Test0079.iFld = Test0079.iFld;
                        Test0079.fFld -= i13;
                        Test0079.iFld = 1;
                    } while (--i16 > 0);
                    switch ((((i15 >>> 1) % 6) * 5) + 26) {
                    case 55:
                        i14 = 29712;
                        break;
                    case 37:
                        Test0079.fArrFld[i15 + 1] -= i14;
                        Test0079.iArrFld[(int) (f2 - 1)] = Test0079.iFld;
                        Test0079.instanceCount *= Test0079.iFld;
                        break;
                    case 39:
                        d4 -= Test0079.instanceCount;
                        Test0079.lArrFld[i15][i15 + 1] += -11;
                        break;
                    case 44:
                        try {
                            Test0079.iFld = (i16 / i16);
                            i14 = (i15 % i15);
                            i17 = (-127 / i13);
                        } catch (ArithmeticException a_e) {}
                        i17 += (int)f2;
                        for (i18 = 1; i18 > 1; --i18) {
                            Test0079.iFld += (((i18 * Test0079.fFld) + i16) - f2);
                            Test0079.instanceCount <<= i18;
                            Test0079.instanceCount += (((i18 * Test0079.sFld) + i14) - Test0079.instanceCount);
                            Test0079.instanceCount = i17;
                            Test0079.iArrFld[i15] = i17;
                            i14 += (int)f2;
                        }
                        break;
                    case 46:
                        Test0079.fArrFld[i15 - 1] -= Test0079.sFld;
                        break;
                    case 28:
                        Test0079.fFld += (((f2 * i17) + by) - i19);
                    }
                    break;
                case 128:
                    i19 >>= i18;
                    break;
                default:
                    if (Test0079.bFld) break;
                }
            } while (++f2 < 99);
        } while (++i15 < 254);

        FuzzerUtils.out.println("i13 i14 by = " + i13 + "," + i14 + "," + by);
        FuzzerUtils.out.println("i15 f2 i16 = " + i15 + "," + Float.floatToIntBits(f2) + "," + i16);
        FuzzerUtils.out.println("d4 i17 i18 = " + Double.doubleToLongBits(d4) + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 = " + i19);

        FuzzerUtils.out.println("Test0079.instanceCount Test0079.iFld Test0079.fFld = " + Test0079.instanceCount + "," + Test0079.iFld +
                "," + Float.floatToIntBits(Test0079.fFld));
        FuzzerUtils.out.println("Test0079.bFld Test0079.sFld Test0079.byArrFld = " + (Test0079.bFld ? 1 : 0) + "," + Test0079.sFld + "," +
                FuzzerUtils.checkSum(Test0079.byArrFld));
        FuzzerUtils.out.println("Test0079.lArrFld Test0079.iArrFld Test0079.fArrFld = " + FuzzerUtils.checkSum(Test0079.lArrFld) + ","
                + FuzzerUtils.checkSum(Test0079.iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0079.fArrFld)));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0079 _instance = new Test0079();
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
//DEBUG  iMeth ->  iMeth lMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
