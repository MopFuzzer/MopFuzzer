// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:01 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=25038L;
    public static float fFld=-96.789F;
    public double dFld=1.56994;
    public boolean bFld=true;
    public static boolean bArrFld[]=new boolean[N];
    public static int iArrFld[]=new int[N];
    public static float fArrFld[][]=new float[N][N];

    static {
        FuzzerUtils.init(Test.bArrFld, false);
        FuzzerUtils.init(Test.iArrFld, 61239);
        FuzzerUtils.init(Test.fArrFld, -2.817F);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i13=1, i14=14, i15=-12, i16=26595, i17=-65066;
        boolean b1=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -1372014764104083959L);

        Test.instanceCount |= i13;
        for (i14 = 14; 231 > i14; ++i14) {
            Test.instanceCount = i13;
            i15 = (int)Test.instanceCount;
            for (i16 = 7; 1 < i16; i16 -= 3) {
                if (b1) break;
                switch (((i17 >>> 1) % 5) + 40) {
                case 40:
                    Test.instanceCount -= i14;
                    i15 *= i15;
                    lArr = lArr;
                    Test.instanceCount = i14;
                case 41:
                case 42:
                case 43:
                    Test.iArrFld = Test.iArrFld;
                    break;
                case 44:
                    try {
                        i17 = (i17 % i16);
                        i13 = (i17 / i15);
                        i17 = (Test.iArrFld[i14 + 1] / 51);
                    } catch (ArithmeticException a_e) {}
                    i15 *= i15;
                    break;
                default:
                    lArr[i14 - 1] ^= 5L;
                }
            }
        }
        vMeth1_check_sum += i13 + i14 + i15 + i16 + i17 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(lArr);
    }

    public static long lMeth(int i6, double d1, boolean b) {

        int i7=12, i8=9, i9=-13288, i10=42145, i11=-29617, i12=231, iArr1[]=new int[N];
        short s1=-4577;

        FuzzerUtils.init(iArr1, -7887);

        for (i7 = 16; i7 < 359; ++i7) {
            for (i9 = 1; i9 < 5; i9++) {
                for (i11 = 1; i11 < 2; ++i11) {
                    i12 = ((s1 + -9191) - ((iArr1[i11]--) - iArr1[i7 + 1]));
                    Test.fFld = (++Test.instanceCount);
                    Test.instanceCount >>>= (Test.instanceCount++);
                    i12 -= (int)((Test.fFld--) - (Short.reverseBytes(s1) - (Test.instanceCount + Test.instanceCount)));
                    i8 ^= (int)(++Test.instanceCount);
                    Test.instanceCount ^= (long)(iArr1[i7 + 1] + ((Test.fFld + -35640) + (--d1)));
                }
                Test.instanceCount = i10;
                if (i12 != 0) {
                }
            }
            vMeth1();
            Test.instanceCount -= i11;
            Test.fArrFld[i7 - 1][i7 - 1] += Test.instanceCount;
        }
        i6 = i8;
        long meth_res = i6 + Double.doubleToLongBits(d1) + (b ? 1 : 0) + i7 + i8 + i9 + i10 + i11 + i12 + s1 +
            FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth() {

        int i1=-6, i2=184, i3=-2, i4=-14, i5=-1;
        short s=-18073;
        double d=-77.26777, dArr[]=new double[N];
        boolean b2=true;

        FuzzerUtils.init(dArr, 117.36625);

        for (i1 = 16; i1 < 303; ++i1) {
            s += (short)(Test.fFld = i2);
            for (i3 = 1; 6 > i3; i3++) {
                for (d = i1; 2 > d; d++) {
                    dArr[i1 + 1] *= (-Test.fFld);
                    if (Test.bArrFld[i3 - 1] && ((lMeth(i3, d, b2) != Test.fFld) == b2)) continue;
                    Test.instanceCount = i2;
                }
                s = (short)i3;
                i4 = (int)Test.instanceCount;
                Test.instanceCount += (i3 * i3);
                if (false) continue;
                s *= (short)29311;
                i5 &= -28920;
                i5 <<= i2;
                if (i4 != 0) {
                    vMeth_check_sum += i1 + i2 + s + i3 + i4 + Double.doubleToLongBits(d) + i5 + (b2 ? 1 : 0) +
                        Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                    return;
                }
            }
        }
        vMeth_check_sum += i1 + i2 + s + i3 + i4 + Double.doubleToLongBits(d) + i5 + (b2 ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        byte by=-31;
        int i=-53785, i18=-1, i19=-86, i20=-32574, i21=6, i22=81, i23=-13, i24=107, i25=12, i26=42443, iArr[][]=new
            int[N][N];
        short s2=11000;
        double d2=0.34359;

        FuzzerUtils.init(iArr, 44);

        by += (byte)(Test.instanceCount + (iArr[(i >>> 1) % N][(i >>> 1) % N]++));
        vMeth();
        dFld = -6725571317903525169L;
        i -= i;
        Test.iArrFld = iArr[(i >>> 1) % N];
        for (i18 = 10; 218 > i18; ++i18) {
            for (i20 = i18; i20 < 121; ++i20) {
                for (i22 = 1; i22 > 1; i22 -= 2) {
                    dFld = -63L;
                    Test.fFld = i22;
                    i21 += (((i22 * i19) + i22) - i18);
                    i23 |= 11;
                }
                switch (((i20 % 2) * 5) + 121) {
                case 126:
                    s2 += (short)(118 + (i20 * i20));
                    i24 = 1;
                    do {
                        bFld = bFld;
                        dFld += 12L;
                    } while (--i24 > 0);
                    for (i25 = i18; i25 < 1; i25++) {
                        Test.instanceCount = s2;
                        Test.fArrFld[i25 + 1][i20] = i23;
                        i19 &= 32440;
                        i23 = i;
                        Test.instanceCount = i20;
                    }
                    try {
                        i = (i % -97);
                        i21 = (Test.iArrFld[i20] % -17571);
                        i19 = (i20 % 185418024);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 125:
                    i21 += i21;
                    i26 += (int)d2;
                    i -= i23;
                    i26 += (((i20 * i24) + i22) - i);
                    break;
                }
                Test.instanceCount += i26;
                i19 -= (int)-5L;
            }
        }

        FuzzerUtils.out.println("by i i18 = " + by + "," + i + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 s2 = " + i22 + "," + i23 + "," + s2);
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("d2 iArr = " + Double.doubleToLongBits(d2) + "," + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld dFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("bFld Test.bArrFld Test.iArrFld = " + (bFld ? 1 : 0) + "," +
            FuzzerUtils.checkSum(Test.bArrFld) + "," + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
