// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:22 2023
public class Test0222 {

    public static final int N = 400;

    public static long instanceCount=5717322710460463133L;
    public static int iFld=56;
    public static volatile byte byFld=-110;
    public static float fFld=-1.81F;
    public int iFld1=-6;
    public int[] iArrFld =new int[N];
    public long[] lArrFld =new long[N];
    public static double[] dArrFld =new double[N];

    static {
        FuzzerUtils.init(Test0222.dArrFld, 2.84116);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(float f) {

        int i3=54;
        int i4=-12;
        int i5=12926;
        int i6=8;
        int i7=-4;
        int i8=46394;
        int i9=-84;
        int i10=-11021;
        int[] iArr =new int[N];
        double d=-32.103292;

        FuzzerUtils.init(iArr, 189);

        iArr[(Test0222.iFld >>> 1) % N] = Test0222.iFld;
        for (i3 = 5; i3 < 130; ++i3) {
            Test0222.iFld *= (int) d;
            Test0222.instanceCount = Test0222.instanceCount;
            try {
                Test0222.iFld = (Test0222.iFld / i3);
                iArr[i3] = (i3 / -1294145117);
                i4 = (78 % Test0222.iFld);
            } catch (ArithmeticException a_e) {}
            iArr[i3 - 1] += (int) Test0222.instanceCount;
        }
        for (i5 = 6; 192 > i5; ++i5) {
            switch ((i5 % 1) + 82) {
            case 82:
                iArr[i5] *= i3;
                i6 += (i5 * i5);
                for (i7 = 1; i7 < 9; i7++) {
                    for (i9 = i5; 2 > i9; i9++) {
                        Test0222.iFld -= i10;
                        Test0222.instanceCount -= (long) f;
                        i8 /= (int)(i3 | 1);
                    }
                }
                break;
            default:
                i6 = i7;
            }
        }
        long meth_res = Float.floatToIntBits(f) + i3 + i4 + Double.doubleToLongBits(d) + i5 + i6 + i7 + i8 + i9 + i10 +
            FuzzerUtils.checkSum(iArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static long lMeth(byte by, int i2) {

        float f1=-1.944F;
        int i11=-52443, i12=3, i13=14, i14=-231, i15=128;
        boolean b=true;

        fMeth(f1);
        i11 = 1;
        do {
            Test0222.instanceCount += i11;
            i12 = 1;
            do {
                f1 = -184;
                for (i13 = i12; 1 > i13; ++i13) {
                    Test0222.iFld %= (int) (i11 | 1);
                    b = b;
                    f1 = i2;
                    i2 >>= -192;
                }
                Test0222.iFld = i2;
                i15 = 1;
                while (++i15 < 1) {
                    Test0222.instanceCount += i12;
                    if (i13 != 0) {
                    }
                    f1 += 5;
                }
            } while (++i12 < 5);
        } while (++i11 < 354);
        long meth_res = by + i2 + Float.floatToIntBits(f1) + i11 + i12 + i13 + i14 + (b ? 1 : 0) + i15;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void vMeth(int i, int i1) {

        int i16=12, i17=9419, i18=-2, i19=13, i20=0;
        double[] dArr =new double[N];
        long[] lArr =new long[N];

        FuzzerUtils.init(dArr, -2.92857);
        FuzzerUtils.init(lArr, 3096861492L);

        dArr[(i >>> 1) % N] += (((Test0222.iFld++) - (i1 - Test0222.instanceCount)) * Math.max(i - -146, Test0222.instanceCount));
        i = (int) (i - (lMeth(Test0222.byFld, i1) - i));
        i1 = (int)-5L;
        for (i16 = 9; i16 < 215; i16++) {
            Test0222.fFld = i17;
            i += i16;
            i18 = 1;
            while (++i18 < 8) {
                for (i19 = 1; i19 < 1; i19++) {
                    i17 <<= Test0222.byFld;
                }
                iArrFld[i18] -= i;
                Test0222.byFld = (byte) Test0222.instanceCount;
                switch (((i20 >>> 1) % 9) + 79) {
                case 79:
                case 80:
                    i1 += Test0222.byFld;
                    i -= Test0222.iFld;
                    Test0222.instanceCount <<= i20;
                    break;
                case 81:
                    i -= i20;
                    break;
                case 82:
                    iArrFld[i18 + 1] *= Test0222.byFld;
                case 83:
                    lArr[i18] = i16;
                case 84:
                    Test0222.iFld += (int) -121.95376;
                case 85:
                    Test0222.iFld = Test0222.iFld;
                    break;
                case 86:
                    try {
                        i20 = (i17 / 389906795);
                        i17 = (i20 / -47568);
                        Test0222.iFld = (i18 / i18);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 87:
                    iArrFld = iArrFld;
                    break;
                }
            }
        }
        vMeth_check_sum += i + i1 + i16 + i17 + i18 + i19 + i20 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i21=-6349;
        int i22=-219;
        int i23=10;
        int i24=23;
        int i25=48;
        int i26=-10;
        int i27=28935;
        int i28=-8345;
        int i29=-195;
        int[][] iArr1 =new
                    int[N][N];
        double d1=2.28311;
        boolean b1=false;

        FuzzerUtils.init(iArr1, -225);

        iArrFld[(Test0222.iFld >>> 1) % N] &= Test0222.iFld;
        vMeth(Test0222.iFld, 5);
        switch ((((243 >>> 1) % 6) * 5) + 68) {
        case 82:
            Test0222.iFld = Test0222.iFld;
            break;
        case 71:
            Test0222.instanceCount = Test0222.iFld;
            break;
        case 72:
            Test0222.instanceCount = Test0222.instanceCount;
            break;
        case 93:
            for (i21 = 2; i21 < 189; ++i21) {
                switch (((i22 >>> 1) % 2) + 85) {
                case 85:
                    for (i23 = 4; i23 < 134; i23++) {
                        lArrFld[i21] += -62772;
                        Test0222.instanceCount += (i23 ^ Test0222.instanceCount);
                        Test0222.iFld = (int) Test0222.instanceCount;
                        iArrFld[i23] *= i23;
                        switch (((Test0222.iFld >>> 1) % 1) + 74) {
                        case 74:
                            iArrFld[i21 + 1] *= (int)d1;
                            break;
                        }
                        i24 >>= (int) Test0222.instanceCount;
                    }
                    i22 += (int)1.499F;
                    if (b1) {
                        for (i25 = 134; i25 > 6; --i25) {
                            for (i27 = 1; 2 > i27; i27++) {
                                i22 += 7;
                                i26 += 10;
                                iArrFld[i25 - 1] = i28;
                                i22 += i25;
                                i29 ^= (int)0L;
                                i24 >>= 31296;
                                switch (((i25 % 1) * 5) + 86) {
                                case 87:
                                    lArrFld[i27] -= i26;
                                    lArrFld[i27] += iFld1;
                                    break;
                                default:
                                    Test0222.instanceCount = 12;
                                }
                            }
                        }
                    } else if (b1) {
                        i24 <<= i22;
                    }
                case 86:
                default:
                    i22 += -13;
                }
            }
            break;
        case 73:
            Test0222.dArrFld[(i27 >>> 1) % N] += Test0222.instanceCount;
            break;
        case 70:
            iArr1[(iFld1 >>> 1) % N][(i27 >>> 1) % N] %= (int)(i22 | 1);
            break;
        }

        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 d1 i25 = " + i24 + "," + Double.doubleToLongBits(d1) + "," + i25);
        FuzzerUtils.out.println("i26 i27 i28 = " + i26 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("i29 b1 iArr1 = " + i29 + "," + (b1 ? 1 : 0) + "," + FuzzerUtils.checkSum(iArr1));

        FuzzerUtils.out.println("Test0222.instanceCount Test0222.iFld Test0222.byFld = " + Test0222.instanceCount + "," + Test0222.iFld +
                "," + Test0222.byFld);
        FuzzerUtils.out.println("Test0222.fFld iFld1 iArrFld = " + Float.floatToIntBits(Test0222.fFld) + "," + iFld1 + "," +
            FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("lArrFld Test0222.dArrFld = " + FuzzerUtils.checkSum(lArrFld) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0222.dArrFld)));

        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0222 _instance = new Test0222();
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
//DEBUG  fMeth ->  fMeth lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
