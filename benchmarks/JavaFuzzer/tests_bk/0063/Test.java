// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:54 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-5L;
    public static boolean bFld=false;
    public static byte byFld=47;
    public static short sFld=28865;
    public int iFld=4;
    public static int iArrFld[]=new int[N];
    public static int iArrFld1[]=new int[N];
    public static double dArrFld[]=new double[N];
    public volatile float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 1);
        FuzzerUtils.init(Test.iArrFld1, -161);
        FuzzerUtils.init(Test.dArrFld, -2.100689);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(int i8, boolean b, int i9) {

        float f1=-2.158F, fArr[]=new float[N];
        int i10=-58215;
        boolean bArr[]=new boolean[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(fArr, 0.983F);
        FuzzerUtils.init(dArr, -1.109139);

        bArr[(i8 >>> 1) % N] = Test.bFld;
        fArr[(i8 >>> 1) % N] += -2900560345967831303L;
        Test.instanceCount = i9;
        Test.instanceCount -= (long)f1;
        i10 = 221;
        while ((i10 -= 2) > 0) {
            fArr[i10] -= i10;
            dArr[i10] -= i9;
        }
        long meth_res = i8 + (b ? 1 : 0) + i9 + Float.floatToIntBits(f1) + i10 + FuzzerUtils.checkSum(bArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth() {

        int i6=-9, i7=-34279, i11=-9, i12=9810, i13=8, i14=60741, iArr1[]=new int[N];
        double d=16.9809;
        short s=3416;
        float f=98.840F;

        FuzzerUtils.init(iArr1, 1);

        for (i6 = 10; i6 < 269; i6++) {
            i7 += (23060 + (i6 * i6));
            i7 = (int)(((d + s) - (i6 - f)) * (Math.abs(f) - fMeth(i7, true, i7)));
            for (i11 = i6; i11 < 6; ++i11) {
                Test.byFld -= (byte)i11;
                Test.instanceCount = 202;
                f += (i11 * i11);
                for (i13 = 1; 1 > i13; i13++) {
                    switch ((i6 % 10) + 28) {
                    case 28:
                        d = f;
                    case 29:
                        Test.bFld = Test.bFld;
                        break;
                    case 30:
                        i14 += (i13 - Test.instanceCount);
                    case 31:
                        Test.instanceCount += i7;
                        i12 = i6;
                        i7 = s;
                    case 32:
                        i12 += (int)Test.instanceCount;
                    case 33:
                        Test.instanceCount = i13;
                        break;
                    case 34:
                        i7 += -69;
                    case 35:
                        iArr1[i6 - 1] ^= (int)Test.instanceCount;
                        break;
                    case 36:
                        Test.instanceCount -= i11;
                        break;
                    case 37:
                        if (i12 != 0) {
                            vMeth_check_sum += i6 + i7 + Double.doubleToLongBits(d) + s + Float.floatToIntBits(f) + i11
                                + i12 + i13 + i14 + FuzzerUtils.checkSum(iArr1);
                            return;
                        }
                        break;
                    }
                }
            }
        }
        vMeth_check_sum += i6 + i7 + Double.doubleToLongBits(d) + s + Float.floatToIntBits(f) + i11 + i12 + i13 + i14 +
            FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth(int i3, int i4, int i5) {

        long l=3L;
        int i15=56292, i16=-30615, i17=-30950;
        short s1=-21927;
        float f2=26.818F;

        l = 1;
        while (++l < 165) {
            vMeth();
            i3 -= Test.byFld;
            i15 = 10;
            while ((i15 -= 2) > 0) {
                for (i16 = 1; i16 < 2; i16++) {
                    i3 += i3;
                    Test.instanceCount += (i16 + i5);
                    Test.instanceCount >>= i5;
                    i5 += (int)l;
                    i3 = Test.byFld;
                    s1 += (short)(32720 + (i16 * i16));
                    Test.iArrFld[i16] = (int)f2;
                }
                Test.byFld = (byte)i16;
            }
            if (Test.bFld) break;
            Test.iArrFld[(int)(l)] += 2;
        }
        long meth_res = i3 + i4 + i5 + l + i15 + i16 + i17 + s1 + Float.floatToIntBits(f2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=8, i1=-63335, i2=-93, i18=-12, i19=-60575, i20=10, i21=-25523, i22=8096, i23=5, iArr[]=new int[N];
        float f3=-81.867F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -5L);
        FuzzerUtils.init(iArr, 9);

        lArr[(i >>> 1) % N] = (-Integer.reverseBytes(iArr[(i >>> 1) % N]));
        for (i1 = 16; i1 < 354; ++i1) {
            byte by=12;
            i -= (((i++) & i2) - i2);
            by >>= (byte)(iArr[i1]++);
            i += (int)((iMeth(i, i, i) * f3) * Test.instanceCount);
            f3 -= i1;
            f3 = 2;
            i2 += (i1 * i1);
            for (i18 = i1; i18 < 74; i18++) {
                for (i20 = i18; i20 < 1; i20++) {
                    i |= 3;
                    Test.byFld = (byte)10;
                    switch ((i20 % 1) + 56) {
                    case 56:
                        i21 = -13;
                        try {
                            Test.iArrFld1[i20 - 1] = (i18 / i20);
                            i22 = (-36691 / i2);
                            i22 = (Test.iArrFld[i1] % -147);
                        } catch (ArithmeticException a_e) {}
                        lArr[(i1 >>> 1) % N] >>= Test.sFld;
                        Test.dArrFld = Test.dArrFld;
                        break;
                    }
                    Test.bFld = Test.bFld;
                }
                switch (((-8 >>> 1) % 10) + 97) {
                case 97:
                    Test.instanceCount = i18;
                    i2 += i22;
                    break;
                case 98:
                case 99:
                    i21 >>= iFld;
                    i2 += Test.byFld;
                    i22 = i20;
                case 100:
                    Test.instanceCount = i18;
                    i21 ^= (int)Test.instanceCount;
                    lArr[i1] += Test.instanceCount;
                    break;
                case 101:
                    iArr[i18 - 1] &= (int)Test.instanceCount;
                    try {
                        i19 = (i2 % 164);
                        Test.iArrFld[i18 + 1] = (i2 / -15369);
                        i23 = (1018 % i21);
                    } catch (ArithmeticException a_e) {}
                    Test.instanceCount += (i18 * i18);
                    break;
                case 102:
                    Test.iArrFld = Test.iArrFld1;
                case 103:
                    lArr[i1 - 1] *= (long)1.274F;
                    break;
                case 104:
                    fArrFld[i18 - 1] -= -12;
                    break;
                case 105:
                    Test.instanceCount %= (Test.instanceCount | 1);
                    break;
                case 106:
                    i23 = iFld;
                    break;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("f3 i18 i19 = " + Float.floatToIntBits(f3) + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 lArr iArr = " + i23 + "," + FuzzerUtils.checkSum(lArr) + "," +
            FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.byFld = " + Test.instanceCount + "," + (Test.bFld ?
            1 : 0) + "," + Test.byFld);
        FuzzerUtils.out.println("Test.sFld iFld Test.iArrFld = " + Test.sFld + "," + iFld + "," +
            FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.iArrFld1 Test.dArrFld fArrFld = " + FuzzerUtils.checkSum(Test.iArrFld1) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));

        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  fMeth ->  fMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
