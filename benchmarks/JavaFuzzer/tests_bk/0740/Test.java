// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:11 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=20889L;
    public static int iFld=11;
    public static float fFld=2.872F;
    public static short sFld=-8376;
    public static byte byFld=58;
    public static volatile int iArrFld[]=new int[N];
    public static volatile float fArrFld[]=new float[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -854);
        FuzzerUtils.init(Test.fArrFld, 0.58F);
        FuzzerUtils.init(Test.lArrFld, 2896078081699288152L);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i4) {

        int i5=-10, i6=58976, i7=46707, i8=11, i9=-114, i10=-112;
        short s=-26934;
        double d=123.123790;
        boolean b=true;

        for (i5 = 4; i5 < 174; i5++) {
            for (i7 = 1; i7 < 9; i7++) {
                i6 += i7;
                Test.instanceCount = i4;
                Test.instanceCount += (i7 * i7);
                i6 = (int)Test.instanceCount;
                i6 = s;
                for (i9 = 1; 2 > i9; i9++) {
                    Test.iArrFld[i9] += i9;
                    i6 = i9;
                    Test.instanceCount -= i9;
                    d = i7;
                    i8 <<= i5;
                    Test.iArrFld[i5 - 1] += i9;
                    if (b) break;
                }
            }
        }
        vMeth_check_sum += i4 + i5 + i6 + i7 + i8 + s + i9 + i10 + Double.doubleToLongBits(d) + (b ? 1 : 0);
    }

    public static int iMeth1() {

        int i11=-52218, i12=-58788, i13=-14, i14=-7, i15=61515;
        byte by=-7;
        long lArr[]=new long[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(lArr, 8512457737575056319L);
        FuzzerUtils.init(fArr, 0.362F);

        vMeth(i11);
        for (long l : lArr) {
            for (i12 = 1; 4 > i12; ++i12) {
                if (i11 != 0) {
                }
            }
            fArr[(Test.iFld >>> 1) % N] *= i11;
            switch (((i12 >>> 1) % 10) + 20) {
            case 20:
                l = 29L;
                Test.fArrFld[(-11 >>> 1) % N] = i11;
                break;
            case 21:
                by ^= (byte)18127;
                Test.fFld *= l;
                break;
            case 22:
                for (i14 = 4; i14 > 1; i14--) {
                    Test.iArrFld = Test.iArrFld;
                }
            case 23:
                i15 -= i12;
                l -= (long)Test.fFld;
                i11 = i14;
                break;
            case 24:
                Test.fFld = Test.iFld;
                break;
            case 25:
                i15 = i11;
                break;
            case 26:
                try {
                    i13 = (i11 / i12);
                    i11 = (-61694 % Test.iArrFld[(i12 >>> 1) % N]);
                    i13 = (i11 % Test.iArrFld[(i11 >>> 1) % N]);
                } catch (ArithmeticException a_e) {}
                break;
            case 27:
                l = i12;
            case 28:
                i13 = (int)l;
            case 29:
                Test.instanceCount = Test.instanceCount;
                break;
            }
        }
        long meth_res = i11 + i12 + i13 + by + i14 + i15 + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i1) {

        int i2=-66, i3=4, i16=12, i17=51494, i18=-13, i19=-11, i20=10;

        for (i2 = 8; i2 < 248; i2++) {
            try {
                i3 = (i2 % i2);
                i1 = (125 % i1);
                i1 = (Test.iArrFld[i2] % Test.iArrFld[i2]);
            } catch (ArithmeticException a_e) {}
            i3 = iMeth1();
        }
        for (i16 = 9; 294 > i16; ++i16) {
            Test.instanceCount = Test.instanceCount;
            Test.sFld <<= (short)Test.instanceCount;
            Test.iFld += (((i16 * Test.instanceCount) + i2) - i1);
            Test.iFld = 52;
            for (i18 = i16; i18 < 6; ++i18) {
                Test.instanceCount >>= Test.instanceCount;
                switch ((i16 % 6) + 12) {
                case 12:
                case 13:
                    Test.instanceCount += (-44664 + (i18 * i18));
                    break;
                case 14:
                    i20 = 1;
                    do {
                        Test.instanceCount = i20;
                        Test.iArrFld[i16] += i20;
                    } while (++i20 < 1);
                    break;
                case 15:
                    i19 = -49872;
                    break;
                case 16:
                    i3 += (i18 + Test.byFld);
                    break;
                case 17:
                    Test.instanceCount += i3;
                    break;
                default:
                    Test.instanceCount >>>= Test.instanceCount;
                }
            }
        }
        long meth_res = i1 + i2 + i3 + i16 + i17 + i18 + i19 + i20;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=24788, i21=2, i22=141, i23=-110, i24=3814, i25=-7, i26=-36, i27=13418, i28=4, i29=-22, iArr[][]=new
            int[N][N];
        double d1=0.33332, d2=-121.9075;
        boolean b1=false;

        FuzzerUtils.init(iArr, -173);

        i -= (int)(Test.instanceCount <<= iMeth(-80));
        Test.iArrFld[(659 >>> 1) % N] = (int)-4192032394239611365L;
        Test.instanceCount = Test.iFld;
        Test.instanceCount -= Test.iFld;
        for (d1 = 14; d1 < 343; ++d1) {
            switch (((13 >>> 1) % 2) + 97) {
            case 97:
                Test.fFld += (float)d1;
                i *= (int)Test.instanceCount;
                break;
            case 98:
                for (i22 = 1; i22 < 76; ++i22) {
                    for (i24 = 1; i24 < 2; i24++) {
                        Test.lArrFld[(i25 >>> 1) % N] = (long)Test.fFld;
                        Test.instanceCount %= (Test.instanceCount | 1);
                        i += (i24 - Test.fFld);
                        i21 += (((i24 * Test.instanceCount) + Test.instanceCount) - i21);
                        d2 *= -55588L;
                        i += (((i24 * i23) + i22) - i23);
                        Test.iArrFld[(int)(d1 + 1)] -= i;
                    }
                }
                if (b1) {
                    Test.iArrFld = Test.iArrFld;
                    switch ((int)(((d1 % 6) * 5) + 70)) {
                    case 97:
                    case 76:
                        for (i26 = 1; i26 < 76; i26 += 2) {
                            d2 *= Test.fFld;
                            i25 += (-149 + (i26 * i26));
                            i28 = 3;
                            do {
                                iArr = iArr;
                                Test.fFld = Test.sFld;
                                i += (((i28 * i21) + i21) - i22);
                                i21 <<= 104;
                                Test.iArrFld[i26] -= Test.byFld;
                                Test.iFld += i28;
                            } while (--i28 > 0);
                        }
                    case 82:
                        i23 *= i23;
                        break;
                    case 92:
                        try {
                            iArr[(int)(d1)][(int)(d1 + 1)] = (58114 / Test.iArrFld[(int)(d1 + 1)]);
                            Test.iFld = (-1503990342 / i21);
                            i = (i29 % 9970);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 99:
                        try {
                            i23 = (i26 % i27);
                            i23 = (i22 % Test.iArrFld[(int)(d1)]);
                            i = (i25 % Test.iFld);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 84:
                        d2 = Test.instanceCount;
                        break;
                    }
                } else if (b1) {
                    Test.iArrFld[(int)(d1)] = Test.sFld;
                } else if (b1) {
                    i27 = 3;
                } else {
                    d2 += Test.instanceCount;
                }
                break;
            }
        }

        FuzzerUtils.out.println("i d1 i21 = " + i + "," + Double.doubleToLongBits(d1) + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 d2 i26 = " + i25 + "," + Double.doubleToLongBits(d2) + "," + i26);
        FuzzerUtils.out.println("i27 i28 i29 = " + i27 + "," + i28 + "," + i29);
        FuzzerUtils.out.println("b1 iArr = " + (b1 ? 1 : 0) + "," + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.fFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.sFld Test.byFld Test.iArrFld = " + Test.sFld + "," + Test.byFld + "," +
            FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.fArrFld Test.lArrFld = " +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}