// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:16 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=46051L;
    public static float fFld=-3.235F;
    public static double dFld=16.92421;
    public static int iFld=-207;
    public boolean bFld=true;
    public static float fArrFld[]=new float[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.fArrFld, -18.733F);
        FuzzerUtils.init(Test.lArrFld, 35150L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth() {

        int i3=4800, i4=-1, i5=52, i6=-159, i7=3;
        long l1=-3661224842664418437L, l2=1469962671L;
        boolean b=true;
        double d=-110.61286, d1=-4.26915, dArr[][]=new double[N][N];
        byte by=-53;
        short s1=-14298;

        FuzzerUtils.init(dArr, -75.113038);

        i3 = i3;
        for (l1 = 18; l1 < 351; ++l1) {
            Test.fFld += Test.instanceCount;
            l2 += i3;
            i3 -= i3;
            i4 >>>= i3;
            for (i5 = (int)(l1); i5 < 5; i5++) {
                if (b) break;
                if (i4 != 0) {
                }
            }
            d *= i4;
            switch ((int)(((l1 % 6) * 5) + 66)) {
            case 79:
                i3 = i5;
                break;
            case 68:
                for (d1 = 1; d1 < 5; ++d1) {
                    i6 = i4;
                    Test.fFld = i7;
                }
                break;
            case 93:
                i3 += i3;
                break;
            case 74:
                i4 = by;
            case 83:
                Test.fFld += (((l1 * i5) + i4) - Test.fFld);
                break;
            case 80:
                dArr[(int)(l1 + 1)][(int)(l1 - 1)] -= s1;
                break;
            }
        }
        long meth_res = i3 + l1 + i4 + l2 + i5 + i6 + (b ? 1 : 0) + Double.doubleToLongBits(d) +
            Double.doubleToLongBits(d1) + i7 + by + s1 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(long l, short s) {

        int i1=-7, i2=-34, i8=48057, i9=-39697, i10=-8, i11=-33533, iArr[]=new int[N];
        byte by1=119;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(iArr, -22510);
        FuzzerUtils.init(bArr, false);

        for (i1 = 11; 195 > i1; ++i1) {
            i2 /= (int)(lMeth() | 1);
            iArr[i1 - 1] = i2;
            l *= by1;
            i2 += (((i1 * i2) + l) - i1);
            for (i8 = i1; i8 < 9; i8++) {
                i2 |= i2;
                s += (short)(((i8 * i1) + l) - l);
                i2 += by1;
                Test.fFld = i9;
                for (i10 = 1; i10 > 1; --i10) {
                    Test.fFld *= i9;
                    Test.fArrFld[i10 - 1] += Test.fFld;
                    bArr = bArr;
                    i2 += (((i10 * i2) + Test.instanceCount) - i10);
                }
            }
        }
        vMeth_check_sum += l + s + i1 + i2 + by1 + i8 + i9 + i10 + i11 + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(bArr);
    }

    public static int iMeth(int i, float f) {

        short s2=25603;
        int i12=72, i13=15886, i14=252, iArr1[]=new int[N];
        byte by2=-42;
        long lArr[][]=new long[N][N];
        double dArr1[]=new double[N];

        FuzzerUtils.init(iArr1, -38);
        FuzzerUtils.init(lArr, -2358088993L);
        FuzzerUtils.init(dArr1, 0.28720);

        vMeth(Test.instanceCount, s2);
        i |= (int)1804610042076503264L;
        for (i12 = 11; 357 > i12; ++i12) {
            boolean b1=true;
            i13 = i12;
            i13 = i;
            i13 -= (int)1.625F;
            i += (i12 * i12);
            switch (i12 + 16) {
            case 16:
                iArr1[i12 + 1] *= (int)-22.700F;
            case 17:
                Test.instanceCount *= i;
                Test.instanceCount = (long)Test.fFld;
                iArr1[i12 + 1] = i;
                f = i;
            case 18:
                i += (i12 * i12);
                i += 4;
                break;
            case 19:
                i *= i;
                break;
            case 20:
                i &= s2;
                break;
            case 21:
            case 22:
                Test.instanceCount *= Test.instanceCount;
                break;
            case 23:
            case 24:
                i += (int)-91.13008;
                break;
            case 25:
                Test.dFld %= (i13 | 1);
                break;
            case 26:
                i += (i12 + i13);
            case 27:
                i13 += i12;
                break;
            case 28:
            case 29:
                Test.instanceCount += i13;
            case 30:
                b1 = b1;
            case 31:
                i13 = (int)Test.instanceCount;
                break;
            case 32:
                i += (int)7407L;
                break;
            case 33:
                i -= i13;
                break;
            case 34:
            case 35:
                f += i;
                break;
            case 36:
                i13 -= (int)f;
                break;
            case 37:
                if (b1) continue;
                break;
            case 38:
                i13 <<= (int)Test.instanceCount;
                break;
            case 39:
                Test.fArrFld[i12 - 1] *= i13;
                break;
            case 40:
                Test.instanceCount = i13;
                break;
            case 41:
                i13 += (2 + (i12 * i12));
                break;
            case 42:
                i *= (int)Test.instanceCount;
                break;
            case 43:
                Test.instanceCount = i13;
            case 44:
                i13 = i13;
            case 45:
                i13 = (int)Test.fFld;
                break;
            case 46:
                b1 = b1;
            case 47:
                i += (int)Test.dFld;
                break;
            case 48:
            case 49:
                i <<= (int)Test.instanceCount;
            case 50:
                Test.instanceCount = (long)Test.dFld;
                break;
            case 51:
                Test.fArrFld[i12 + 1] *= 4;
                break;
            case 52:
                i13 += (int)Test.instanceCount;
                break;
            case 53:
                f /= 16344L;
                break;
            case 54:
                b1 = b1;
                break;
            case 55:
                i = i;
                break;
            case 56:
                i = i13;
                break;
            case 57:
                i13 = i12;
                break;
            case 58:
                iArr1[i12 + 1] >>= i13;
                break;
            case 59:
                i13 = i12;
                break;
            case 60:
                i13 += 240;
                break;
            case 61:
                i13 += (i12 ^ Test.instanceCount);
            case 62:
                by2 += (byte)(((i12 * Test.iFld) + i12) - Test.iFld);
                break;
            case 63:
                if (i12 != 0) {
                }
                break;
            case 64:
                i += (i12 - Test.iFld);
                break;
            case 65:
                Test.iFld *= i;
            case 66:
                b1 = b1;
                break;
            case 67:
                Test.instanceCount *= i12;
                break;
            case 68:
                lArr[i12] = lArr[i12];
                break;
            case 69:
                i13 = (int)Test.instanceCount;
            case 70:
                Test.iFld = by2;
            case 71:
                try {
                    Test.iFld = (17494 % i12);
                    i13 = (iArr1[i12] / -1458);
                    i13 = (-136 % i12);
                } catch (ArithmeticException a_e) {}
                break;
            case 72:
                Test.instanceCount <<= Test.instanceCount;
                break;
            case 73:
                lArr[i12 - 1][i12] = Test.iFld;
                break;
            case 74:
                Test.instanceCount = i13;
                break;
            case 75:
                Test.iFld -= i;
                break;
            case 76:
                Test.instanceCount /= (i14 | 1);
                break;
            case 77:
                Test.instanceCount *= -39903;
            case 78:
                dArr1[i12] *= i12;
            case 79:
                if (b1) continue;
                break;
            case 80:
                iArr1[i12 - 1] = i;
                break;
            case 81:
                Test.iFld = i13;
                break;
            case 82:
                i14 = Test.iFld;
                break;
            case 83:
                i = Test.iFld;
                break;
            case 84:
                Test.iFld -= Test.iFld;
            case 85:
                i = Test.iFld;
                break;
            default:
                try {
                    iArr1[i12 + 1] = (iArr1[i12 + 1] / i);
                    iArr1[i12] = (i14 / iArr1[i12 + 1]);
                    i14 = (195 % i13);
                } catch (ArithmeticException a_e) {}
            }
        }
        long meth_res = i + Float.floatToIntBits(f) + s2 + i12 + i13 + by2 + i14 + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i15=-218, i16=51221, i17=118, i18=52718, i19=39964, i20=-223, i21=10;
        float f1=0.765F;
        byte by3=2;

        iMeth(Test.iFld, Test.fFld);
        Test.iFld *= Test.iFld;
        Test.iFld = Test.iFld;
        Test.dFld += -70;
        Test.dFld += Test.fFld;
        Test.instanceCount = Test.iFld;
        Test.iFld = (int)Test.instanceCount;
        for (i15 = 6; i15 < 198; i15++) {
            i16 &= i16;
            Test.instanceCount = Test.iFld;
        }
        i17 = 1;
        do {
            for (i18 = 3; i18 < 76; ++i18) {
                i19 += (i18 - Test.iFld);
                i16 = i18;
                i16 = (int)20438L;
                for (f1 = 1; f1 < 2; ++f1) {
                    Test.iFld = i15;
                    Test.iFld = (int)-85L;
                    Test.fFld = -4;
                    switch (((i18 >>> 1) % 7) + 38) {
                    case 38:
                        if (bFld) continue;
                        break;
                    case 39:
                        Test.instanceCount >>= Test.iFld;
                    case 40:
                        Test.dFld -= i15;
                        by3 += (byte)(-54 + (f1 * f1));
                        i16 &= i15;
                        break;
                    case 41:
                        if (bFld) continue;
                        if (bFld) {
                            Test.fFld *= by3;
                            Test.fFld = i20;
                            Test.instanceCount *= Test.instanceCount;
                        } else if (bFld) {
                            i19 += (int)(((f1 * i15) + i16) - i21);
                        }
                    case 42:
                        i21 = i18;
                        break;
                    case 43:
                        Test.lArrFld = FuzzerUtils.long1array(N, (long)-24201L);
                        break;
                    case 44:
                        Test.instanceCount += (long)f1;
                        break;
                    }
                }
            }
        } while (++i17 < 332);

        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 i19 f1 = " + i18 + "," + i19 + "," + Float.floatToIntBits(f1));
        FuzzerUtils.out.println("i20 by3 i21 = " + i20 + "," + by3 + "," + i21);

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.dFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.iFld bFld Test.fArrFld = " + Test.iFld + "," + (bFld ? 1 : 0) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));
        FuzzerUtils.out.println("Test.lArrFld = " + FuzzerUtils.checkSum(Test.lArrFld));

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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
