// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:47 2023
public class Test0750 {

    public static final int N = 400;

    public static long instanceCount=5560993137653529422L;
    public static int iFld=53620;
    public static volatile boolean bFld=false;
    public static volatile float fFld=1.672F;
    public static byte byFld=-52;
    public static int iFld1=-174;
    public int iFld2=25345;
    public long lFld=-1809890304517117148L;
    public static boolean[] bArrFld =new boolean[N];
    public static boolean[][] bArrFld1 =new boolean[N][N];
    public static int[][] iArrFld =new int[N][N];
    public static double[] dArrFld =new double[N];

    static {
        FuzzerUtils.init(Test0750.bArrFld, true);
        FuzzerUtils.init(Test0750.bArrFld1, true);
        FuzzerUtils.init(Test0750.iArrFld, 42);
        FuzzerUtils.init(Test0750.dArrFld, 38.113941);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i5=62796, i6=-4, i7=-46682, i8=-57, i9=-906, i10=13, i11=-63581, i12=12;
        float f=2.835F;
        double d1=-2.124637;

        Test0750.iFld -= Test0750.iFld;
        for (i5 = 8; i5 < 227; ++i5) {
            Test0750.iFld -= Test0750.iFld;
            for (i7 = 1; i7 < 7; i7++) {
                i6 += i7;
                Test0750.iFld -= i6;
                Test0750.iFld >>= 7;
                Test0750.bArrFld1 = Test0750.bArrFld1;
                for (i9 = 1; i9 < 2; i9++) {
                    f += (float)d1;
                }
                Test0750.iArrFld = Test0750.iArrFld;
                if (Test0750.bFld) continue;
                for (i11 = i5; i11 < 2; ++i11) {
                    f += (((i11 * i10) + i7) - i8);
                    i10 += (((i11 * i11) + i9) - Test0750.instanceCount);
                }
            }
        }
        vMeth2_check_sum += i5 + i6 + i7 + i8 + i9 + i10 + Float.floatToIntBits(f) + Double.doubleToLongBits(d1) + i11
            + i12;
    }

    public static void vMeth1() {

        int i1=41, i2=-6, i3=-45509, i4=56698, i13=-48523, i14=124, i15=45, i16=10;
        double d=-1.26783;
        short s=-23541;
        byte[] byArr =new byte[N];

        FuzzerUtils.init(byArr, (byte)-7);

        i1 = 1;
        while (++i1 < 328) {
            for (d = 1; d < 5; d++) {
                for (i3 = 1; i3 < 2; i3++) {
                    vMeth2();
                    i2 -= (int) Test0750.fFld;
                }
                for (i13 = 1; i13 < 2; i13 += 2) {
                    Test0750.iFld += i13;
                    Test0750.instanceCount *= i13;
                    byArr = byArr;
                }
                Test0750.byFld += (byte) i3;
            }
        }
        for (i15 = 8; 354 > i15; i15++) {
            Test0750.bFld = Test0750.bFld;
            if (Test0750.bFld) {
                i2 >>= s;
                i4 -= i3;
            } else {
                Test0750.iArrFld[i15 - 1][i15] = i14;
            }
        }
        vMeth1_check_sum += i1 + Double.doubleToLongBits(d) + i2 + i3 + i4 + i13 + i14 + i15 + i16 + s +
            FuzzerUtils.checkSum(byArr);
    }

    public static void vMeth() {

        int i17=9, i18=-128, i19=9, i20=-105, i21=-28;
        long l=-58681L;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, 8418086017774944315L);

        vMeth1();
        lArr[(Test0750.iFld >>> 1) % N] = -19572;
        for (i17 = 1; i17 < 216; i17++) {
            if (true) continue;
            for (i19 = 7; i19 > 1; --i19) {
                Test0750.iFld <<= (int) l;
            }
            try {
                Test0750.iFld = (-53840 % Test0750.iArrFld[i17][i17 - 1]);
                i18 = (i18 / Test0750.iArrFld[i17][i17 - 1]);
                Test0750.iFld = (i20 / i19);
            } catch (ArithmeticException a_e) {}
            i21 = 1;
            while ((i21 += 2) < 7) {
                Test0750.instanceCount += i21;
                Test0750.iFld ^= 7;
                i18 += i20;
                switch ((i21 % 6) + 71) {
                case 71:
                    i18 += (i21 * i21);
                    i20 += (int) Test0750.instanceCount;
                    Test0750.iFld += Test0750.iFld;
                    break;
                case 72:
                    Test0750.instanceCount |= i18;
                    break;
                case 73:
                case 74:
                    Test0750.iArrFld[i17 - 1][i17] += Test0750.iFld1;
                    break;
                case 75:
                    Test0750.iFld &= i18;
                    break;
                case 76:
                    i18 = (int)l;
                    break;
                default:
                    if (Test0750.iFld != 0) {
                        vMeth_check_sum += i17 + i18 + i19 + i20 + l + i21 + FuzzerUtils.checkSum(lArr);
                        return;
                    }
                }
            }
        }
        vMeth_check_sum += i17 + i18 + i19 + i20 + l + i21 + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        boolean b=false;
        int i=12, i22=139, i23=12314, i24=4, i25=12, i26=-3, i27=-2, i28=-8, i29=1;
        double d2=0.203;
        short s1=20083;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(lArr1, 15459L);

        b = (b = (b = (Test0750.bArrFld[(i >>> 1) % N] = b)));
        vMeth();
        i22 = 1;
        while (++i22 < 337) {
            Test0750.iFld1 = (int) Test0750.instanceCount;
            for (i23 = 4; i23 < 75; ++i23) {
                Test0750.iFld1 += i23;
                Test0750.iFld1 += (int) -2.360F;
                Test0750.fFld = Test0750.fFld;
                i25 = 2;
                do {
                    iFld2 -= (int)lFld;
                    lFld >>>= Test0750.instanceCount;
                    d2 = iFld2;
                    Test0750.iFld >>= i23;
                    i = Test0750.iFld;
                    lArr1[i23] += i22;
                    iFld2 = i;
                    Test0750.dArrFld[i25 + 1] += 10;
                    lFld += Test0750.iFld;
                    Test0750.iArrFld[i25 - 1][i22] *= Test0750.byFld;
                } while (--i25 > 0);
                for (i26 = i22; i26 < 2; i26++) {
                    iFld2 = -42;
                }
                iFld2 = i27;
                for (i28 = i23; 2 > i28; ++i28) {
                    try {
                        i = (-42 % Test0750.iArrFld[i23][i23 + 1]);
                        i = (Test0750.iFld1 / 13);
                        iFld2 = (2125026537 / i28);
                    } catch (ArithmeticException a_e) {}
                    i24 = (int) Test0750.fFld;
                    s1 += (short) Test0750.iFld1;
                    b = b;
                    Test0750.iArrFld[i23 - 1][i28 + 1] += i28;
                    i24 = i23;
                    lFld += Test0750.instanceCount;
                }
            }
        }

        FuzzerUtils.out.println("b i i22 = " + (b ? 1 : 0) + "," + i + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("d2 i26 i27 = " + Double.doubleToLongBits(d2) + "," + i26 + "," + i27);
        FuzzerUtils.out.println("i28 i29 s1 = " + i28 + "," + i29 + "," + s1);
        FuzzerUtils.out.println("lArr1 = " + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test0750.instanceCount Test0750.iFld Test0750.bFld = " + Test0750.instanceCount + "," + Test0750.iFld +
                "," + (Test0750.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0750.fFld Test0750.byFld Test0750.iFld1 = " + Float.floatToIntBits(Test0750.fFld) + "," +
                Test0750.byFld + "," + Test0750.iFld1);
        FuzzerUtils.out.println("iFld2 lFld Test0750.bArrFld = " + iFld2 + "," + lFld + "," +
                FuzzerUtils.checkSum(Test0750.bArrFld));
        FuzzerUtils.out.println("Test0750.bArrFld1 Test0750.iArrFld Test0750.dArrFld = " + FuzzerUtils.checkSum(Test0750.bArrFld1) +
                "," + FuzzerUtils.checkSum(Test0750.iArrFld) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0750.dArrFld)));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0750 _instance = new Test0750();
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
