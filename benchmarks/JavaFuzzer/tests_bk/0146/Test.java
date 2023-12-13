// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:56 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-4766L;
    public static float fFld=-115.95F;
    public static volatile short sFld=22588;
    public static int iFld=9335;
    public static int iFld1=10;
    public static double dArrFld[]=new double[N];
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.dArrFld, -102.117286);
        FuzzerUtils.init(Test.iArrFld, -27904);
        FuzzerUtils.init(Test.lArrFld, 14L);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static void vSmallMeth(double d, double d1, int i) {

        int iArr[]=new int[N];

        FuzzerUtils.init(iArr, -114);

        iArr = (iArr = iArr);
        vSmallMeth_check_sum += Double.doubleToLongBits(d) + Double.doubleToLongBits(d1) + i +
            FuzzerUtils.checkSum(iArr);
    }

    public static long lMeth(long l) {

        int i8=60, i9=-1, i10=113, i11=14, i12=-3, iArr1[]=new int[N];
        double d3=-1.90947;

        FuzzerUtils.init(iArr1, 253);

        Test.fFld = -844798137L;
        i8 = (int)Test.instanceCount;
        iArr1[(i8 >>> 1) % N] = i8;
        i9 = 1;
        do {
            iArr1[i9 + 1] ^= (int)l;
            for (d3 = i9; d3 < 9; d3++) {
                try {
                    i8 = (i9 / -56824);
                    i10 = (-1736797177 / i8);
                    i8 = (-44796 / i9);
                } catch (ArithmeticException a_e) {}
                for (i11 = 1; i11 < 1; i11++) {
                    i10 = i12;
                    Test.fFld += Test.instanceCount;
                    i10 = i9;
                    Test.instanceCount = i11;
                    iArr1[(int)(d3 - 1)] += (int)Test.fFld;
                    Test.instanceCount *= i12;
                    iArr1[i9 + 1] >>>= (int)Test.instanceCount;
                }
            }
        } while (++i9 < 183);
        long meth_res = l + i8 + i9 + Double.doubleToLongBits(d3) + i10 + i11 + i12 + FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i7) {

        int i13=-9, i14=-10172, i15=-60, i16=-9130, i17=-13, i18=40140, iArr2[]=new int[N];
        boolean b=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -921211490823798076L);
        FuzzerUtils.init(iArr2, -58725);

        i7 = (int)Test.instanceCount;
        for (double d2 : Test.dArrFld) {
            i7 = (int)Math.min(Test.instanceCount, lMeth(Test.instanceCount));
            Test.instanceCount |= i7;
            if (i7 != 0) {
                vMeth_check_sum += i7 + i13 + i14 + i15 + i16 + i17 + i18 + (b ? 1 : 0) + FuzzerUtils.checkSum(lArr) +
                    FuzzerUtils.checkSum(iArr2);
                return;
            }
            for (i13 = 1; i13 < 4; i13++) {
                Test.instanceCount |= i14;
                i7 += (((i13 * Test.instanceCount) + Test.instanceCount) - i13);
                i7 *= i14;
                iArr2[i13 - 1] &= (int)Test.instanceCount;
                Test.instanceCount = Test.instanceCount;
            }
        }
        for (i15 = 12; i15 < 363; i15++) {
            for (i17 = 1; i17 < 5; ++i17) {
                i16 += (i17 ^ i15);
                if (b) break;
            }
        }
        vMeth_check_sum += i7 + i13 + i14 + i15 + i16 + i17 + i18 + (b ? 1 : 0) + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr2);
    }

    public static int iMeth(int i1, int i2, float f1) {

        int i3=-216, i4=-191, i5=54, i6=-205, iArr3[][]=new int[N][N];
        byte by=122;
        double d4=-18.61308;
        float fArr[]=new float[N], fArr1[][]=new float[N][N];

        FuzzerUtils.init(fArr, 0.105F);
        FuzzerUtils.init(iArr3, 1);
        FuzzerUtils.init(fArr1, 1.336F);

        for (i3 = 337; i3 > 13; i3--) {
            for (i5 = 1; i5 < 5; i5++) {
                fArr[i3 - 1] -= (i4 -= (int)((-78.399F % (Math.abs(i6) | 1)) * (f1 / (i5 | 1))));
            }
            switch ((i3 % 6) + 76) {
            case 76:
                vMeth(i5);
                i6 <<= i4;
                try {
                    i6 = (i3 % -2001402452);
                    iArr3[i3][i3 + 1] = (iArr3[i3][i3 - 1] / -250);
                    Test.iArrFld[i3 + 1] = (iArr3[i3 + 1][i3 + 1] % -16462);
                } catch (ArithmeticException a_e) {}
                break;
            case 77:
                i2 ^= by;
                break;
            case 78:
                i1 >>= Test.sFld;
                Test.lArrFld[i3 - 1] -= (long)d4;
            case 79:
                Test.iArrFld[i3 + 1] ^= i2;
                Test.lArrFld[i3] = i5;
                Test.iArrFld[(8 >>> 1) % N] ^= i1;
                break;
            case 80:
                i1 >>= (int)Test.instanceCount;
                fArr1 = fArr1;
                break;
            case 81:
                Test.instanceCount += (i3 - Test.instanceCount);
                break;
            }
        }
        long meth_res = i1 + i2 + Float.floatToIntBits(f1) + i3 + i4 + i5 + i6 + by + Double.doubleToLongBits(d4) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr3) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f=-97.667F, fArr2[]=new float[N];
        double d5=0.106237, d6=-105.26336;
        int i19=3, i20=-8, i21=-56168, i22=141, i23=65018, i24=129, i25=236, i26=-147, i27=56754, iArr4[][]=new
            int[N][N];

        FuzzerUtils.init(fArr2, 0.72F);
        FuzzerUtils.init(iArr4, 20243);

        for (int smallinvoc=0; smallinvoc<601; smallinvoc++) vSmallMeth((--f) + iMeth(Test.iFld, Test.iFld, -16.83F),
            d5, Test.iFld);
        Test.iFld = (int)f;
        i19 = 279;
        while (--i19 > 0) {
            Test.instanceCount = Test.sFld;
        }
        d6 -= i19;
        Test.sFld = (short)Test.instanceCount;
        Test.iArrFld[(Test.iFld >>> 1) % N] = Test.iFld;
        Test.iFld *= 27;
        for (i20 = 245; i20 > 4; i20 -= 2) {
            i22 = 209;
            do {
                d6 -= i19;
            } while (--i22 > 0);
            for (i23 = 209; i23 > i20; i23--) {
                try {
                    Test.iArrFld[i23 + 1] = (-85 / i23);
                    Test.iArrFld[i23 - 1] = (Test.iFld / 578877596);
                    i24 = (i24 / i22);
                } catch (ArithmeticException a_e) {}
                try {
                    i21 = (i21 / i24);
                    Test.iArrFld[i20] = (Test.iFld % 231);
                    Test.iArrFld[i23] = (i20 / -133);
                } catch (ArithmeticException a_e) {}
                for (i25 = 1; i25 < 1; ++i25) {
                    Test.instanceCount += i24;
                    if (false) continue;
                    switch (((i20 >>> 1) % 8) + 41) {
                    case 41:
                        f -= 1;
                        Test.iFld = i21;
                        Test.iFld -= (int)Test.fFld;
                        break;
                    case 42:
                        i26 = i20;
                    case 43:
                        Test.lArrFld[i20] -= i24;
                        i24 += (int)d5;
                        break;
                    case 44:
                        i24 = -50708;
                        Test.instanceCount = (long)Test.fFld;
                        i21 /= (int)(Test.iFld | 1);
                        try {
                            i24 = (55406 % i19);
                            i24 = (1147022872 % i19);
                            i26 = (i21 / i19);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 45:
                        i21 = i21;
                        Test.sFld *= (short)d6;
                        break;
                    case 46:
                        Test.iFld1 += (i25 - Test.instanceCount);
                        break;
                    case 47:
                        fArr2[i23 - 1] += i23;
                    case 48:
                        i27 = -48;
                        break;
                    default:
                        iArr4 = iArr4;
                    }
                }
            }
        }

        FuzzerUtils.out.println("f d5 i19 = " + Float.floatToIntBits(f) + "," + Double.doubleToLongBits(d5) + "," +
            i19);
        FuzzerUtils.out.println("d6 i20 i21 = " + Double.doubleToLongBits(d6) + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("fArr2 iArr4 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr2)) + "," +
            FuzzerUtils.checkSum(iArr4));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.sFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.sFld);
        FuzzerUtils.out.println("Test.iFld Test.iFld1 Test.dArrFld = " + Test.iFld + "," + Test.iFld1 + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));
        FuzzerUtils.out.println("Test.iArrFld Test.lArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
