// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:56 2023
public class Test0947 {

    public static final int N = 400;

    public static long instanceCount=2165440329925013129L;
    public long lFld=1484724217L;
    public static byte byFld=116;
    public static int iFld=84;
    public static boolean bFld=false;
    public int iFld1=-62473;
    public static float fFld=-1.441F;
    public int[] iArrFld =new int[N];
    public double[] dArrFld =new double[N];

    public static long lMeth_check_sum = 0;
    public static long lMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i3, long l, int i4) {

        int i5=-211;
        int i6=62826;
        int i7=-12;
        int i8=8692;
        int i9=-12;
        int[] iArr =new int[N];
        float f1=1.369F;
        long l1=8084735950816538003L;

        FuzzerUtils.init(iArr, 158);

        i5 = 294;
        do {
            i3 -= (int) Test0947.instanceCount;
            i4 = Test0947.iFld;
            if (i3 != 0) {
                vMeth_check_sum += i3 + l + i4 + i5 + Float.floatToIntBits(f1) + i6 + i7 + l1 + i8 + i9 +
                    FuzzerUtils.checkSum(iArr);
                return;
            }
            i4 += (i5 + i4);
            Test0947.iFld += Test0947.iFld;
            i3 += (((i5 * i3) + f1) - Test0947.iFld);
            i4 -= (int)-113.396F;
            i3 = (int) Test0947.instanceCount;
            iArr[i5 + 1] = Test0947.iFld;
            for (i6 = i5; i6 < 6; i6++) {
                l1 += (i6 * i6);
                for (i8 = i5; i8 < 1; ++i8) {
                    i9 = i3;
                    iArr[i5] += -173;
                }
            }
        } while (--i5 > 0);
        vMeth_check_sum += i3 + l + i4 + i5 + Float.floatToIntBits(f1) + i6 + i7 + l1 + i8 + i9 +
            FuzzerUtils.checkSum(iArr);
    }

    public static long lMeth1() {

        int i10=8;
        int i11=101;
        int i12=-26;
        int i13=11766;
        int i14=-54702;
        int i15=65;
        int i16=-9568;
        int i17=-4;
        int i18=0;
        int[] iArr1 =new int[N];
        byte[][] byArr =new byte[N][N];

        FuzzerUtils.init(byArr, (byte)24);
        FuzzerUtils.init(iArr1, 14);

        vMeth(170, Test0947.instanceCount, -5);
        for (i10 = 16; i10 < 332; ++i10) {
            Test0947.iFld -= i11;
            byArr[i10 + 1][i10] -= (byte) Test0947.iFld;
            Test0947.instanceCount += 13091;
            i11 += (i10 ^ i12);
            for (i13 = 5; 1 < i13; i13 -= 3) {
                iArr1[i10 - 1] = i10;
            }
            iArr1 = iArr1;
            i14 += (i10 + i10);
            iArr1 = iArr1;
            for (i15 = i10; i15 < 5; i15++) {
                for (i17 = 1; 1 > i17; i17++) {
                    Test0947.instanceCount = i10;
                    if (Test0947.bFld) break;
                }
            }
        }
        long meth_res = i10 + i11 + i12 + i13 + i14 + i15 + i16 + i17 + i18 + FuzzerUtils.checkSum(byArr) +
            FuzzerUtils.checkSum(iArr1);
        lMeth1_check_sum += meth_res;
        return (long)meth_res;
    }

    public long lMeth() {

        float f=27.196F;
        int i1=35462, i2=11, i19=-31068, i20=6;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, 4349660108922407265L);

        for (f = 3; f < 375; f++) {
            i1 |= (int) Test0947.instanceCount;
            lFld += (100L + (f * f));
            i2 = 1;
            do {
                Test0947.byFld += (byte) lMeth1();
                i1 += i1;
                switch ((int)(((f % 10) * 5) + 101)) {
                case 116:
                    try {
                        iArrFld[(int)(f - 1)] = (232 % i1);
                        i1 = (-1819877424 % Test0947.iFld);
                        iArrFld[i2 + 1] = (97 % iArrFld[i2 + 1]);
                    } catch (ArithmeticException a_e) {}
                    if (Test0947.bFld) break;
                    for (i19 = 1; i19 < 1; ++i19) {
                        lFld *= -235;
                        Test0947.instanceCount = i19;
                        Test0947.iFld = (int) lFld;
                        Test0947.iFld += (int) -3644459035L;
                        lArr[i19] -= i2;
                    }
                case 141:
                    Test0947.byFld >>= (byte) lFld;
                    break;
                case 110:
                    if (Test0947.iFld != 0) {
                    }
                    break;
                case 106:
                    i1 += i2;
                case 109:
                    Test0947.iFld = i20;
                    break;
                case 112:
                    i20 = (int)f;
                    break;
                case 145:
                    iArrFld[(int)(f - 1)] = i2;
                    break;
                case 137:
                    i1 ^= i2;
                    break;
                case 125:
                    Test0947.iFld <<= (int) Test0947.instanceCount;
                    break;
                case 144:
                    i1 <<= i20;
                default:
                    i1 -= i20;
                }
            } while (++i2 < 5);
        }
        long meth_res = Float.floatToIntBits(f) + i1 + i2 + i19 + i20 + FuzzerUtils.checkSum(lArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-9, i21=7, i22=6900, i23=15771, i24=209, i25=232, i26=47949, i27=125, i28=36754, i29=6, i30=-22821,
            i31=47816, i32=-15915;
        double d=-1.81621;
        long[][] lArr1 =new long[N][N];

        FuzzerUtils.init(lArr1, 3102410653L);

        i += (int)lMeth();
        lFld *= 253;
        for (d = 17; d < 287; d++) {
            iArrFld[(int)(d + 1)] = 7;
            for (i22 = 93; 5 < i22; --i22) {
                i23 -= (int)92L;
                Test0947.iFld += i23;
                for (i24 = 1; i24 < 2; i24++) {
                    iArrFld[(int)(d + 1)] |= i22;
                }
            }
            i26 = 1;
            while (++i26 < 93) {
                iArrFld[i26 + 1] -= i24;
                dArrFld = FuzzerUtils.double1array(N, (double)-25.36060);
                i25 = Test0947.iFld;
            }
        }
        i23 ^= i21;
        for (i27 = 3; 214 > i27; ++i27) {
            for (i29 = 2; i29 < 119; ++i29) {
                for (i31 = i29; i31 < 2; ++i31) {
                    lFld += Test0947.instanceCount;
                    i32 = i21;
                    i30 >>= iFld1;
                    if (Test0947.bFld) {
                        lFld <<= -5L;
                        Test0947.fFld += Test0947.fFld;
                    } else if (Test0947.bFld) {
                        iFld1 = (int)d;
                        lArr1 = lArr1;
                        if (Test0947.bFld) continue;
                    } else {
                        iArrFld[i29] = i29;
                        lFld += (i31 * i31);
                    }
                    i += (int)lFld;
                    i21 = (int)-7L;
                }
            }
        }

        FuzzerUtils.out.println("i d i21 = " + i + "," + Double.doubleToLongBits(d) + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("i28 i29 i30 = " + i28 + "," + i29 + "," + i30);
        FuzzerUtils.out.println("i31 i32 lArr1 = " + i31 + "," + i32 + "," + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test0947.instanceCount lFld Test0947.byFld = " + Test0947.instanceCount + "," + lFld + "," +
                Test0947.byFld);
        FuzzerUtils.out.println("Test0947.iFld Test0947.bFld iFld1 = " + Test0947.iFld + "," + (Test0947.bFld ? 1 : 0) + "," + iFld1);
        FuzzerUtils.out.println("Test0947.fFld iArrFld dArrFld = " + Float.floatToIntBits(Test0947.fFld) + "," +
            FuzzerUtils.checkSum(iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth1_check_sum: " + lMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0947 _instance = new Test0947();
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
//DEBUG  lMeth1 ->  lMeth1 lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth1 lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}