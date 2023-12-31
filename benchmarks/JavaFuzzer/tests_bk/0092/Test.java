// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:55 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=19727L;
    public static byte byFld=-3;
    public static float fFld=-2.443F;
    public static double dFld=12.115672;
    public boolean bFld=false;
    public static int iArrFld[]=new int[N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 4);
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;

    public static double dMeth(float f1) {

        int i7=-27215, i8=-14, i9=-55, i10=-221;
        short s=19831;
        double d1=-4.18982;
        float f2=1.196F;
        boolean b=true, bArr[][]=new boolean[N][N];

        FuzzerUtils.init(bArr, false);

        for (i7 = 1; i7 < 216; i7++) {
            Test.instanceCount <<= Test.instanceCount;
            i9 = i8;
            i9 = i9;
            Test.instanceCount += (-14 + (i7 * i7));
            f1 += i9;
            s -= (short)d1;
        }
        Test.instanceCount >>= i9;
        Test.byFld += (byte)i9;
        i10 = 1;
        while (++i10 < 217) {
            Test.instanceCount += (i10 * i10);
            f2 = 1;
            while (++f2 < 7) {
                if (true) break;
                bArr[(int)(f2 + 1)][i10] = b;
                d1 = i9;
            }
        }
        long meth_res = Float.floatToIntBits(f1) + i7 + i8 + i9 + s + Double.doubleToLongBits(d1) + i10 +
            Float.floatToIntBits(f2) + (b ? 1 : 0) + FuzzerUtils.checkSum(bArr);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth(long l1) {

        int i11=-63, i12=-58, i13=5, i14=13, i15=-4, i16=26001, i17=158;
        double d2=2.44758;
        long lArr[]=new long[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(lArr, -3372355054962323527L);
        FuzzerUtils.init(fArr, 0.434F);

        dMeth(Test.fFld);
        for (i11 = 20; 346 > i11; i11++) {
            for (i13 = 5; i13 > 1; --i13) {
                i14 += (0 + (i13 * i13));
            }
            if (i11 != 0) {
                vMeth_check_sum += l1 + i11 + i12 + i13 + i14 + i15 + i16 + i17 + Double.doubleToLongBits(d2) +
                    FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                return;
            }
            i14 += (5841 + (i11 * i11));
            for (i15 = i11; i15 < 5; ++i15) {
                l1 *= i15;
            }
            i17 = 1;
            while (++i17 < 5) {
                i16 += (i17 * i17);
                Test.instanceCount = i15;
                lArr[i17 - 1] = -27558;
                fArr[i17 + 1] *= (float)d2;
                i14 >>>= (int)Test.instanceCount;
                try {
                    i16 = (i13 / i11);
                    i16 = (i16 / i14);
                    i14 = (i16 / Test.iArrFld[i17 - 1]);
                } catch (ArithmeticException a_e) {}
            }
        }
        vMeth_check_sum += l1 + i11 + i12 + i13 + i14 + i15 + i16 + i17 + Double.doubleToLongBits(d2) +
            FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static int iMeth(long l, int i5, int i6) {

        boolean b1=true;

        vMeth(Test.instanceCount);
        Test.dFld = Test.byFld;
        l >>>= Test.instanceCount;
        Test.iArrFld[(i5 >>> 1) % N] = 1333;
        if (b1) {
            i5 = i6;
            i6 -= Test.byFld;
            i6 %= (int)(i5 | 1);
        } else {
            Test.byFld &= (byte)i6;
            i6 += i5;
        }
        switch ((((i6 >>> 1) % 2) * 5) + 73) {
        case 82:
            i5 >>>= i5;
            l = -30085;
        case 83:
            Test.dFld *= i5;
            Test.instanceCount += i6;
        }
        long meth_res = l + i5 + i6 + (b1 ? 1 : 0);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-12, i1=-21744, i2=-1292, i3=-92, i4=53266, i18=10, i19=-42636, i20=116, i21=147, i22=-32269, i23=-8,
            i24=1, i25=-7;
        double d=1.69141;
        float f=2.548F, f3=-103.356F;
        short s1=-9007;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 1584373349L);

        Test.iArrFld[(i >>> 1) % N] -= (int)(-(i += (int)Test.instanceCount));
        i *= (int)Test.instanceCount;
        d -= ((i + (i - i)) + (f--));
        for (i1 = 6; 135 > i1; i1++) {
            for (i3 = 194; i3 > i1; i3 -= 2) {
                Test.instanceCount += ((--Test.iArrFld[i1 + 1]) + (i4 + iMeth(Test.instanceCount, i2, i2)));
                Test.instanceCount = (long)-71.515F;
                i4 += (int)(2913463182L + (i3 * i3));
                for (i18 = 1; 1 < i18; i18--) {
                    i += (i18 + i1);
                }
                for (f3 = 1; f3 < 1; ++f3) {
                    Test.byFld *= (byte)238;
                    i *= (int)2.91438;
                    i4 += (int)f3;
                    i19 = i2;
                }
                i2 *= i19;
            }
            s1 = (short)48.102F;
        }
        lArr1[(i19 >>> 1) % N] = i20;
        i19 %= (int)175L;
        i20 = i4;
        bFld = true;
        for (i21 = 4; i21 < 353; ++i21) {
            Test.bArrFld[i21] = bFld;
            Test.iArrFld[i21] -= i;
            i4 += (((i21 * i22) + s1) - s1);
        }
        for (i23 = 355; i23 > 5; i23--) {
            lArr1[i23] = 2447454L;
            Test.iArrFld[i23] = i25;
            f = i1;
            f += (float)d;
        }

        FuzzerUtils.out.println("i d f = " + i + "," + Double.doubleToLongBits(d) + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("i1 i2 i3 = " + i1 + "," + i2 + "," + i3);
        FuzzerUtils.out.println("i4 i18 i19 = " + i4 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("f3 i20 s1 = " + Float.floatToIntBits(f3) + "," + i20 + "," + s1);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 lArr1 = " + i24 + "," + i25 + "," + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.fFld = " + Test.instanceCount + "," + Test.byFld +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.dFld bFld Test.iArrFld = " + Double.doubleToLongBits(Test.dFld) + "," + (bFld ? 1
            : 0) + "," + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.bArrFld = " + FuzzerUtils.checkSum(Test.bArrFld));

        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
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
//DEBUG  dMeth ->  dMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
