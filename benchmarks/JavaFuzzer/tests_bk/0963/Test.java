// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:17 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=605217087L;
    public static short sFld=-3859;
    public int iFld=-24;
    public static double dFld=1.29630;
    public static boolean bFld=true;
    public static byte byFld=7;
    public long lFld=1243052893L;
    public static volatile int iArrFld[]=new int[N];
    public static double dArrFld[]=new double[N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 58);
        FuzzerUtils.init(Test.dArrFld, -1.102348);
        FuzzerUtils.init(Test.bArrFld, true);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static long lMeth(long l, int i7, int i8) {

        int i9=-16166, i10=0, i11=7, i12=-20605, i13=43223, i14=42;
        float f1=-1.988F, fArr[]=new float[N];
        boolean b=true;

        FuzzerUtils.init(fArr, 0.0F);

        for (double d3 : Test.dArrFld) {
            i7 >>= (int)((--fArr[(i7 >>> 1) % N]) - 50418);
        }
        for (i9 = 204; i9 > 11; i9 -= 2) {
            f1 += (i9 - i9);
            Test.dFld *= i10;
        }
        for (i11 = 14; i11 < 379; ++i11) {
            Test.instanceCount = (i10 = (int)(Math.abs(Test.instanceCount) % (Test.instanceCount | 1)));
            i8 = (int)(i9 + ((6 * (Test.instanceCount--)) - (Test.sFld + -240)));
            Test.instanceCount += (i11 * i11);
            for (i13 = i11; i13 < 5; i13++) {
                if (b = b) break;
                i14 = (int)((-i14) * (l++));
                Test.iArrFld[i13] = (--Test.iArrFld[i11]);
                if (i10 != 0) {
                }
                f1 += (l * (i8 * (i10 * -16)));
            }
        }
        long meth_res = l + i7 + i8 + i9 + i10 + Float.floatToIntBits(f1) + i11 + i12 + i13 + i14 + (b ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1(int i17, int i18) {

        int i19=29512, i20=252, i21=-16784, i22=-91, i23=-53;
        float f2=29.605F, f3=-118.972F;
        boolean b1=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 21789L);

        i17 = -12403;
        i17 ^= i18;
        Test.instanceCount = Test.sFld;
        i17 = (int)Test.instanceCount;
        i17 *= i17;
        for (i19 = 9; 357 > i19; ++i19) {
            for (i21 = 1; 5 > i21; i21++) {
                i17 >>>= i18;
                i23 = 1;
                do {
                    f2 -= -23909;
                    i20 = i19;
                    switch ((((i17 >>> 1) % 1) * 5) + 59) {
                    case 61:
                        lArr[i21 - 1] += (long)f3;
                        b1 = b1;
                        Test.iArrFld = Test.iArrFld;
                        break;
                    default:
                        Test.iArrFld[i19] *= (int)70783945L;
                    }
                } while (++i23 < 2);
            }
        }
        vMeth1_check_sum += i17 + i18 + i19 + i20 + i21 + i22 + i23 + Float.floatToIntBits(f2) +
            Float.floatToIntBits(f3) + (b1 ? 1 : 0) + FuzzerUtils.checkSum(lArr);
    }

    public static float fMeth(int i15, long l1, int i16) {

        long l2=1278898798L;
        float f4=82.114F;
        double d4=-64.116344;
        int i24=162, i25=-177, i26=146;

        vMeth1(i16, 52519);
        if (Test.bFld) {
            Test.dFld *= i16;
            l2 = 1;
            while (++l2 < 204) {
                Test.bArrFld[(int)(l2 + 1)] = Test.bFld;
                try {
                    i15 = (-51320 / i16);
                    i15 = (-48 / i16);
                    i16 = (i15 % -16107);
                } catch (ArithmeticException a_e) {}
                f4 %= 47881;
                i15 += i15;
                for (d4 = 1; 8 > d4; ++d4) {
                    f4 += (float)(((d4 * i24) + i24) - f4);
                    for (i25 = 1; i25 < 2; i25++) {
                        Test.iArrFld[(int)(d4)] <<= -30093;
                        i16 += (i25 ^ i24);
                        i15 = 13;
                        i24 = -10;
                    }
                }
            }
        } else if (true) {
            Test.iArrFld[(i24 >>> 1) % N] <<= (int)l1;
        } else if (true) {
            l1 = i25;
        } else {
            f4 = 0;
        }
        long meth_res = i15 + l1 + i16 + l2 + Float.floatToIntBits(f4) + Double.doubleToLongBits(d4) + i24 + i25 + i26;
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth(int i2, float f, short s) {

        int i3=-5406, i4=11, i5=-4, i6=20;
        double d=21.97248, d1=-1.15798, d2=-1.44191;

        for (i3 = 1; 180 > i3; ++i3) {
            for (d = 1; d < 9; ++d) {
                for (d1 = 1; 2 > d1; d1++) {
                    Test.instanceCount = (((Test.instanceCount--) + (i6 - i3)) - i6);
                    i6 &= Test.iArrFld[(int)(d1)];
                    i4 += (int)((long)d1 ^ Test.instanceCount);
                    i5 += (int)d1;
                    d2 += (((++i2) + (-(++Test.dArrFld[(int)(d1)]))) - lMeth(i2 * Test.instanceCount,
                        (int)(-Test.dFld), (int)(Test.instanceCount * 48.556F)));
                    switch ((int)((d1 % 9) + 115)) {
                    case 115:
                        s = (short)(f * ((++Test.instanceCount) + fMeth(i2, Test.instanceCount, i3)));
                        i5 += (int)(d1 + i6);
                        switch ((((i2 >>> 1) % 2) * 5) + 95) {
                        case 104:
                            i6 *= i2;
                            i2 >>= (int)Test.instanceCount;
                            i4 = (int)Test.instanceCount;
                            break;
                        case 100:
                            i2 += (int)((long)d1 | i2);
                            break;
                        default:
                            try {
                                i5 = (i2 / -82);
                                i6 = (i2 % -99);
                                i6 = (144 / i6);
                            } catch (ArithmeticException a_e) {}
                        }
                        break;
                    case 116:
                        i6 += (int)Test.instanceCount;
                        break;
                    case 117:
                        Test.iArrFld[i3 - 1] += i6;
                        break;
                    case 118:
                        Test.instanceCount = 61;
                        break;
                    case 119:
                    case 120:
                        i4 += (int)(d1 * d1);
                        break;
                    case 121:
                        Test.iArrFld[i3] -= Test.byFld;
                    case 122:
                        i6 = -5;
                        break;
                    case 123:
                        Test.instanceCount = (long)f;
                        break;
                    default:
                        Test.iArrFld = Test.iArrFld;
                    }
                }
            }
        }
        vMeth_check_sum += i2 + Float.floatToIntBits(f) + s + i3 + i4 + Double.doubleToLongBits(d) + i5 +
            Double.doubleToLongBits(d1) + i6 + Double.doubleToLongBits(d2);
    }

    public void mainTest(String[] strArr1) {

        int i=42, i1=117, i27=-6, i28=12, iArr[]=new int[N];
        float f5=0.142F;
        short sArr[]=new short[N];

        FuzzerUtils.init(iArr, -10);
        FuzzerUtils.init(sArr, (short)9312);

        i = 1;
        while (++i < 269) {
            i1 = 1;
            do {
                Test.sFld |= (short)Integer.reverseBytes(-(iFld++));
                iFld -= (iArr[i1 + 1] + (-i));
                vMeth(i, f5, Test.sFld);
                if (Test.bFld) break;
                sArr[i + 1] += (short)f5;
                for (i27 = i; i27 < 1; ++i27) {
                    i28 -= Test.sFld;
                    sArr[i27] = (short)iFld;
                    if (Test.bFld) break;
                    f5 *= 4570436007350342963L;
                    switch ((((5 >>> 1) % 9) * 5) + 36) {
                    case 60:
                        lFld += iFld;
                        i28 *= (int)f5;
                        if (Test.bFld) {
                            sArr[i1] += (short)Test.instanceCount;
                            iArr[i1] = (int)Test.instanceCount;
                            i28 += iFld;
                        } else {
                            i28 >>>= Test.sFld;
                            i28 = i27;
                        }
                        break;
                    case 79:
                        Test.dFld = i28;
                        Test.byFld = (byte)-16389;
                        break;
                    case 80:
                        i28 = (int)-53607L;
                        switch ((i % 3) + 102) {
                        case 102:
                            i28 <<= 224;
                            f5 += -1863105114790538301L;
                            i28 += iFld;
                        case 103:
                            i28 <<= i;
                            Test.dFld += Test.instanceCount;
                            break;
                        case 104:
                            iFld &= i28;
                            break;
                        }
                        break;
                    case 49:
                        i28 *= i;
                    case 71:
                        Test.instanceCount *= (long)f5;
                    case 54:
                        Test.byFld -= (byte)i1;
                        break;
                    case 42:
                        f5 -= (float)Test.dFld;
                        break;
                    case 53:
                        iFld = i27;
                        break;
                    case 40:
                        i28 *= 2;
                        break;
                    }
                }
            } while (++i1 < 93);
        }

        FuzzerUtils.out.println("i i1 f5 = " + i + "," + i1 + "," + Float.floatToIntBits(f5));
        FuzzerUtils.out.println("i27 i28 iArr = " + i27 + "," + i28 + "," + FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println("sArr = " + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld iFld = " + Test.instanceCount + "," + Test.sFld + "," +
            iFld);
        FuzzerUtils.out.println("Test.dFld Test.bFld Test.byFld = " + Double.doubleToLongBits(Test.dFld) + "," +
            (Test.bFld ? 1 : 0) + "," + Test.byFld);
        FuzzerUtils.out.println("lFld Test.iArrFld Test.dArrFld = " + lFld + "," + FuzzerUtils.checkSum(Test.iArrFld) +
            "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));
        FuzzerUtils.out.println("Test.bArrFld = " + FuzzerUtils.checkSum(Test.bArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  fMeth ->  fMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 fMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
