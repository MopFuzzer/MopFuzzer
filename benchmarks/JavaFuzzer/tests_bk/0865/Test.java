// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:15 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-3858859608989279860L;
    public static short sFld=-31027;
    public static float fFld=-2.88F;
    public static boolean bFld=false;
    public int iFld=-51365;
    public static byte byFld=-114;
    public static int iArrFld[]=new int[N];
    public static float fArrFld[][]=new float[N][N];
    public static volatile long lArrFld[]=new long[N];
    public static byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 204);
        FuzzerUtils.init(Test.fArrFld, -73.168F);
        FuzzerUtils.init(Test.lArrFld, -4210262885345061163L);
        FuzzerUtils.init(Test.byArrFld, (byte)23);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i6=-22291, i7=-16360, i8=-4, i9=-45047, i10=242;
        float f=-41.287F;
        double d1=-1.55109;

        for (i6 = 15; i6 < 303; i6 += 3) {
            for (i8 = 16; i8 > i6; --i8) {
                i10 = 1;
                do {
                    i7 *= i6;
                    f += 20137;
                    Test.sFld += (short)Test.instanceCount;
                    i9 += (((i10 * i7) + i8) - i6);
                    switch ((i8 % 1) + 33) {
                    case 33:
                        Test.instanceCount |= i9;
                    default:
                        i9 += (i10 * i10);
                    }
                    i7 += (((i10 * f) + i8) - Test.instanceCount);
                    Test.iArrFld[i6] -= (int)7960292029961164722L;
                    try {
                        i7 = (Test.iArrFld[i8 + 1] % Test.iArrFld[i10]);
                        i9 = (840819592 % i10);
                        i7 = (5024 / i8);
                    } catch (ArithmeticException a_e) {}
                    i7 += (int)d1;
                } while (++i10 < 1);
                Test.fArrFld[i8 - 1][i6 - 1] = i6;
            }
        }
        long meth_res = i6 + i7 + i8 + i9 + i10 + Float.floatToIntBits(f) + Double.doubleToLongBits(d1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i3, double d) {

        int i4=55668, i5=10, i12=-32271, i13=-5, i14=40676;
        long l=-12L;
        boolean b1=true;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)6518);

        for (i4 = 397; 9 < i4; i4 -= 2) {
            Test.instanceCount -= Math.max((++Test.iArrFld[i4 - 1]) - i5, i3++);
        }
        if (b1) {
            i5 = i5;
            Test.iArrFld[(i3 >>> 1) % N] -= iMeth();
            for (int i11 : Test.iArrFld) {
                Test.instanceCount = -11;
                i11 *= i3;
                switch (((253 >>> 1) % 1) + 117) {
                case 117:
                    for (l = 1; l < 4; l += 2) {
                        i5 += (int)(((l * i11) + l) - i3);
                        if (b1) continue;
                        for (i13 = 1; i13 < 4; i13 += 2) {
                            Test.iArrFld[(int)(l - 1)] = (int)Test.instanceCount;
                            Test.iArrFld[(i12 >>> 1) % N] += i4;
                        }
                    }
                    break;
                default:
                    sArr[(i5 >>> 1) % N] -= (short)i5;
                }
            }
        } else if (b1) {
            i5 = i12;
        } else {
            Test.fFld *= Test.instanceCount;
            vMeth1_check_sum += i3 + Double.doubleToLongBits(d) + i4 + i5 + l + i12 + (b1 ? 1 : 0) + i13 + i14 +
                FuzzerUtils.checkSum(sArr);
            return;
        }
        vMeth1_check_sum += i3 + Double.doubleToLongBits(d) + i4 + i5 + l + i12 + (b1 ? 1 : 0) + i13 + i14 +
            FuzzerUtils.checkSum(sArr);
    }

    public static void vMeth() {

        int i15=23206, i16=63572, i17=0, i18=-17658, i19=-31114, i20=-34640, i21=6;
        double d2=-1.111806;
        boolean b2=false;

        vMeth1(i15, d2);
        i15 += (int)Test.instanceCount;
        for (i16 = 9; i16 < 168; i16++) {
            d2 += i15;
        }
        i15 = i16;
        Test.instanceCount -= Test.instanceCount;
        d2 += Test.fFld;
        for (i18 = 11; i18 < 209; ++i18) {
            i19 = (int)4L;
            Test.bFld = b2;
            i19 *= i16;
            i17 -= (int)-10L;
            for (i20 = 1; i20 < 8; i20++) {
                i15 = i18;
                i17 += (i20 * i20);
            }
        }
        vMeth_check_sum += i15 + Double.doubleToLongBits(d2) + i16 + i17 + i18 + i19 + (b2 ? 1 : 0) + i20 + i21;
    }

    public void mainTest(String[] strArr1) {

        int i=11, i1=-10, i2=87, i22=-6, i23=113, i24=12, i25=7, i26=105;
        boolean b=true;

        Test.iArrFld[(i >>> 1) % N] &= i;
        for (i1 = 1; i1 < 224; i1++) {
            b = (i <= Math.abs(48076L + i));
            vMeth();
            if (false) continue;
            i <<= i2;
            if (b) {
                Test.fArrFld[i1][i1 + 1] = i2;
            } else if (Test.bFld) {
                Test.iArrFld[i1] = (int)24.62097;
                Test.instanceCount <<= i2;
            }
            Test.instanceCount += (long)Test.fFld;
            i = (int)1.884F;
            if (b) break;
            for (i22 = 2; 113 > i22; i22 += 3) {
                i = i2;
                switch ((i1 % 6) + 72) {
                case 72:
                    Test.instanceCount += 34474L;
                    Test.sFld = (short)i22;
                    break;
                case 73:
                    Test.lArrFld[i22 - 1] = iFld;
                    i24 = 1;
                    do {
                        Test.instanceCount += (110L + (i24 * i24));
                        Test.fFld += (-111 + (i24 * i24));
                        Test.instanceCount += i24;
                        Test.byArrFld[i1 - 1] = (byte)-26297L;
                        iFld = i1;
                        i23 = i23;
                    } while (++i24 < 4);
                    for (i25 = 1; i25 < 4; ++i25) {
                        Test.instanceCount = i22;
                        Test.byArrFld[i1 - 1] = (byte)i2;
                        Test.iArrFld[i22 + 1] >>= Test.byFld;
                    }
                case 74:
                    Test.fFld = i1;
                case 75:
                    i2 += (i22 * i22);
                    break;
                case 76:
                    i26 = (int)Test.instanceCount;
                    break;
                case 77:
                    i23 -= iFld;
                    break;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("b i22 i23 = " + (b ? 1 : 0) + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.fFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.bFld iFld Test.byFld = " + (Test.bFld ? 1 : 0) + "," + iFld + "," + Test.byFld);
        FuzzerUtils.out.println("Test.iArrFld Test.fArrFld Test.lArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + ","
            + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," + FuzzerUtils.checkSum(Test.lArrFld));
        FuzzerUtils.out.println("Test.byArrFld = " + FuzzerUtils.checkSum(Test.byArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}