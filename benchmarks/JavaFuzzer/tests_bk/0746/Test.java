// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:12 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-1536621788220743619L;
    public short sFld=30041;
    public static short sFld1=21244;
    public static volatile boolean bFld=false;
    public static byte byFld=-113;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 58);
    }

    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i4, int i5) {

        double d=0.115921;
        int i6=14, i7=-5, i8=201;
        float f2=3.616F, fArr[]=new float[N];
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(fArr, -2.830F);
        FuzzerUtils.init(bArr, false);

        Test.iArrFld[(i4 >>> 1) % N] = (int)Test.instanceCount;
        i4 += i5;
        d = i5;
        for (i6 = 9; i6 < 205; ++i6) {
            i8 = 8;
            do {
                Test.bFld = Test.bFld;
                i7 = i4;
                f2 = 1;
                while (++f2 < 3) {
                    Test.instanceCount ^= i4;
                }
                fArr[i6] = i5;
                Test.bFld = Test.bFld;
                i4 = i4;
                bArr[i6] = Test.bFld;
                i5 += (i8 * i8);
                i4 += (((i8 * i4) + i8) - i4);
            } while ((i8 -= 3) > 0);
        }
        long meth_res = i4 + i5 + Double.doubleToLongBits(d) + i6 + i7 + i8 + Float.floatToIntBits(f2) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(bArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i=52, i1=-57801, i2=-206, i3=-9, i9=108;
        float fArr1[]=new float[N];

        FuzzerUtils.init(fArr1, 86.411F);

        i = 353;
        do {
            Test.sFld1 = (short)0;
            if (Test.bFld) {
                switch ((i % 2) + 74) {
                case 74:
                    i1 = 1;
                    do {
                        for (i2 = 1; i2 > 1; i2 -= 3) {
                            Test.instanceCount += i2;
                            Test.sFld1 = (short)Test.instanceCount;
                            Test.instanceCount += (i2 * i2);
                            Test.iArrFld[i2 - 1] = i2;
                            i3 &= (((Test.sFld1 + 8) + (156 - (--i3))) * iMeth(-6431, i3));
                            fArr1[i1 - 1] = i3;
                            Test.instanceCount += (i2 * i2);
                            i3 = (int)-34279L;
                            i3 <<= (int)-3260081375L;
                        }
                    } while (++i1 < 5);
                    break;
                case 75:
                    Test.instanceCount = i2;
                    break;
                }
                vMeth_check_sum += i + i1 + i2 + i3 + i9 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
                return;
            } else if (Test.bFld) {
                i3 = (int)Test.instanceCount;
            } else if (Test.bFld) {
                if (Test.bFld) break;
            } else {
                i3 += (i - i9);
            }
        } while (--i > 0);
        vMeth_check_sum += i + i1 + i2 + i3 + i9 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public static float fMeth(long l, float f1) {

        int i10=-23, i11=41964, i12=-114;
        byte by=-120;
        float fArr2[][]=new float[N][N];

        FuzzerUtils.init(fArr2, 123.166F);

        vMeth();
        f1 = i10;
        i11 = 1;
        while (++i11 < 186) {
            double d1=-123.23566;
            try {
                Test.iArrFld[i11] = (41612 / i11);
                i10 = (i11 / Test.iArrFld[i11 + 1]);
                i10 = (i11 / i11);
            } catch (ArithmeticException a_e) {}
            Test.iArrFld[i11 + 1] |= i11;
            Test.sFld1 = (short)i10;
            i10 += i11;
            d1 += by;
            i12 = 1;
            while (++i12 < 9) {
                fArr2[i12 - 1][i11] *= i10;
                i10 -= (int)l;
                i10 += (i12 - Test.sFld1);
                l += (long)d1;
                if (i12 != 0) {
                }
                Test.iArrFld[i12 + 1] += -59688;
            }
        }
        long meth_res = l + Float.floatToIntBits(f1) + i10 + i11 + by + i12 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr2));
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f=95.960F;
        int i13=51400, i14=-64, i15=-37, i16=-11, i17=114, i18=-5, i19=0, i20=45565, i21=60;
        double d2=111.53644, d3=12.83118;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 6193790142873830578L);

        Test.instanceCount ^= (long)(((sFld++) + (f - f)) - fMeth(Test.instanceCount, 109.360F));
        i13 = i13;
        i14 = 1;
        do {
            Test.byFld += (byte)(i14 | Test.byFld);
            Test.iArrFld[i14 - 1] *= i13;
            i13 += (int)Test.instanceCount;
        } while (++i14 < 256);
        i13 = -3;
        Test.iArrFld[(i14 >>> 1) % N] = 9;
        Test.bFld = Test.bFld;
        i13 |= -43583;
        i15 = 330;
        do {
            for (i16 = 228; i16 > 1; i16 -= 2) {
                try {
                    i13 = (i14 % 6);
                    i17 = (-3 % i16);
                    i13 = (Test.iArrFld[i16] / i18);
                } catch (ArithmeticException a_e) {}
                Test.instanceCount += (((i16 * i18) + i14) - i13);
                Test.instanceCount <<= i15;
                Test.iArrFld[i15 + 1] = (int)Test.instanceCount;
            }
            i19 = 1;
            do {
                i13 += (int)81L;
                Test.instanceCount = Test.instanceCount;
                i13 = i15;
                Test.instanceCount += (((i19 * Test.instanceCount) + i16) - i13);
            } while (++i19 < 228);
            for (i20 = 13; i20 < 228; ++i20) {
                d2 = 1;
                while (++d2 < 2) {
                    Test.byFld = (byte)-125;
                    Test.instanceCount = i19;
                }
                if (Test.bFld) {
                    lArr[i15] = i17;
                    Test.instanceCount >>= i18;
                } else {
                    d3 = Test.instanceCount;
                    if (Test.bFld) continue;
                }
            }
        } while ((i15 -= 3) > 0);

        FuzzerUtils.out.println("f i13 i14 = " + Float.floatToIntBits(f) + "," + i13 + "," + i14);
        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 d2 d3 = " + i21 + "," + Double.doubleToLongBits(d2) + "," +
            Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("lArr = " + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test.instanceCount sFld Test.sFld1 = " + Test.instanceCount + "," + sFld + "," +
            Test.sFld1);
        FuzzerUtils.out.println("Test.bFld Test.byFld Test.iArrFld = " + (Test.bFld ? 1 : 0) + "," + Test.byFld + "," +
            FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
