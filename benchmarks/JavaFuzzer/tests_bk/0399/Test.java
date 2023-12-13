// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:03 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-28313532062149030L;
    public static byte byFld=-86;
    public static double dFld=0.41259;
    public int iFld=-9;
    public static float fFld=-25.289F;
    public short sFld=-11693;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 5);
        FuzzerUtils.init(Test.lArrFld, -1405592105L);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(float f1, long l1, int i6) {

        int i7=-3163, i8=-36526, i9=63754, i10=-1, i11=-381, i12=27487;
        boolean b=true;
        byte byArr1[]=new byte[N];

        FuzzerUtils.init(byArr1, (byte)-68);

        for (i7 = 3; i7 < 233; i7++) {
            byArr1[i7] >>= (byte)Test.instanceCount;
            for (i9 = 1; i9 < 7; i9++) {
                for (i11 = 1; 2 > i11; i11++) {
                    if (b) break;
                    Test.iArrFld[i11] -= i7;
                    l1 -= i6;
                    l1 >>>= 14;
                    switch (((i7 % 8) * 5) + 119) {
                    case 142:
                        Test.byFld += (byte)117;
                        i10 += (int)Test.dFld;
                        i6 += i11;
                        i10 = (int)1625459433L;
                        break;
                    case 146:
                        i10 *= i12;
                        l1 ^= i9;
                        break;
                    case 148:
                        i6 = i8;
                        break;
                    case 151:
                    case 125:
                        if (b) continue;
                        break;
                    case 133:
                        b = b;
                    case 145:
                        i6 <<= i9;
                        break;
                    case 136:
                    }
                }
            }
        }
        long meth_res = Float.floatToIntBits(f1) + l1 + i6 + i7 + i8 + i9 + i10 + i11 + i12 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(byArr1);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static int iMeth(double d, long l, int i3) {

        int i4=-80, i5=-166, i13=52868, i14=-212, i15=-76;
        float f2=1.814F;
        boolean b1=false;

        if (b1) {
            for (i4 = 6; i4 < 124; ++i4) {
                i5 *= (int)fMeth(0.824F, Test.instanceCount, i3);
                for (i13 = 1; i13 < 13; i13++) {
                    i3 += (i13 - l);
                    i15 = 1;
                    while (++i15 < 2) {
                        i3 += i15;
                        i3 += (i15 - i14);
                        f2 += i13;
                        Test.instanceCount <<= i5;
                        Test.instanceCount *= i14;
                        f2 += f2;
                        Test.iArrFld[i4 + 1] += i5;
                    }
                    Test.iArrFld[i4] <<= i4;
                    i14 -= (int)l;
                }
            }
        }
        long meth_res = Double.doubleToLongBits(d) + l + i3 + i4 + i5 + i13 + i14 + i15 + Float.floatToIntBits(f2) +
            (b1 ? 1 : 0);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth() {

        int i=14, i1=-6, i2=-2;
        float f=66.937F;
        short s=-2568;
        long l2=-1913392528900958831L, lArr[][]=new long[N][N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(lArr, -57638L);
        FuzzerUtils.init(byArr, (byte)53);

        lArr[(i >>> 1) % N][(i >>> 1) % N] = byArr[(i >>> 1) % N];
        for (i1 = 292; i1 > 16; --i1) {
            if (false) {
                f += (((i1 * i1) - iMeth(Test.dFld, Test.instanceCount, i2)) - i1);
                i += (int)14.59F;
            }
            i2 = i1;
            switch (((i1 % 2) * 5) + 31) {
            case 38:
                s = (short)i2;
                break;
            case 40:
                l2 = 1;
                do {
                    i += (int)(((l2 * Test.instanceCount) + i) - f);
                    f = 14;
                    i += (int)(l2 * l2);
                } while ((l2 += 2) < 6);
                break;
            default:
                i2 = -54297;
                Test.iArrFld[i1 + 1] >>= i2;
                Test.instanceCount += (i1 * i1);
            }
        }
        vMeth_check_sum += i + i1 + i2 + Float.floatToIntBits(f) + s + l2 + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(byArr);
    }

    public void mainTest(String[] strArr1) {

        int i16=-76, i17=-13, i18=9, i19=-100, i20=11, i21=56, i22=0;
        boolean b2=true;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)-2085);

        vMeth();
        sArr[(iFld >>> 1) % N] = (short)Test.dFld;
        iFld = 9;
        for (i16 = 5; i16 < 377; i16++) {
            Test.instanceCount *= (long)Test.dFld;
            Test.byFld <<= (byte)iFld;
        }
        iFld -= (int)Test.fFld;
        i18 = 1;
        while (++i18 < 335) {
            iFld += (int)(-3321L + (i18 * i18));
            for (i19 = 4; i19 < 75; i19 += 2) {
                i20 = i18;
                i20 = i18;
                iFld -= i20;
                iFld -= (int)226L;
                Test.instanceCount = i17;
                Test.lArrFld[i18] -= 4;
                for (i21 = 3; i21 > 1; --i21) {
                    Test.instanceCount = Test.instanceCount;
                    Test.iArrFld[i19 + 1] += i18;
                    Test.byFld += (byte)i21;
                    Test.fFld *= sFld;
                    Test.dFld += i19;
                    Test.instanceCount >>= 59719;
                    i20 += i21;
                    Test.instanceCount &= 0;
                    b2 = b2;
                }
                Test.iArrFld[i18 + 1] = (int)Test.instanceCount;
                sFld = (short)i18;
                Test.dFld *= Test.instanceCount;
            }
            i20 = i17;
        }

        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 b2 sArr = " + i22 + "," + (b2 ? 1 : 0) + "," + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.dFld = " + Test.instanceCount + "," + Test.byFld +
            "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("iFld Test.fFld sFld = " + iFld + "," + Float.floatToIntBits(Test.fFld) + "," + sFld);
        FuzzerUtils.out.println("Test.iArrFld Test.lArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  fMeth ->  fMeth iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
