// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:35 2023
public class Test0487 {

    public static final int N = 400;

    public static long instanceCount=226L;
    public static volatile int iFld=6;
    public static float fFld=-37.21F;
    public float fFld1=0.292F;
    public static volatile long[] lArrFld =new long[N];
    public static boolean[] bArrFld =new boolean[N];

    static {
        FuzzerUtils.init(Test0487.lArrFld, -6L);
        FuzzerUtils.init(Test0487.bArrFld, false);
    }

    public static long iMeth_check_sum = 0;
    public static long byMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        double d1=0.28761, d2=-1.123564;
        int i9=-9;
        int i11=8;
        int i12=-18303;
        int i13=-101;
        int i14=13;
        int[] iArr2 =new int[N];

        FuzzerUtils.init(iArr2, 38220);

        Test0487.instanceCount /= (Test0487.instanceCount | 1);
        d1 = 1;
        do {
            d2 = i9;
            try {
                i9 = (i9 / -1559314151);
                i9 = (i9 % -1983687202);
                i9 = (iArr2[(int)(d1 - 1)] % i9);
            } catch (ArithmeticException a_e) {}
            i9 = i9;
            if (true) break;
        } while ((d1 += 3) < 174);
        iArr2 = iArr2;
        switch (((i9 >>> 1) % 6) + 109) {
        case 109:
            for (i11 = 5; i11 < 226; ++i11) {
                Test0487.instanceCount <<= i9;
                for (i13 = 1; i13 < 7; i13 += 3) {
                    d2 *= 46027;
                    i9 -= i12;
                    i14 += (int)3946L;
                    Test0487.iFld += (int) (-56778L + (i13 * i13));
                }
            }
            break;
        case 110:
            Test0487.instanceCount -= (long) d2;
        case 111:
            Test0487.instanceCount = i12;
            break;
        case 112:
            Test0487.bArrFld = Test0487.bArrFld;
            break;
        case 113:
            Test0487.instanceCount >>= Test0487.instanceCount;
            break;
        case 114:
        }
        vMeth_check_sum += Double.doubleToLongBits(d1) + Double.doubleToLongBits(d2) + i9 + i11 + i12 + i13 + i14 +
            FuzzerUtils.checkSum(iArr2);
    }

    public static byte byMeth(short s, float f) {

        int i8=-135;
        int i15=-14696;
        int i16=6;
        int i17=-34863;
        int i18=0;
        int i19=-240;
        int[] iArr1 =new int[N];
        byte[] byArr =new byte[N];

        FuzzerUtils.init(iArr1, -127);
        FuzzerUtils.init(byArr, (byte)-74);

        i8 -= (int) (-((iArr1[(i8 >>> 1) % N]--) + (Test0487.instanceCount * f)));
        vMeth();
        Test0487.instanceCount -= s;
        iArr1[(Test0487.iFld >>> 1) % N] *= (int) Test0487.instanceCount;
        i15 = 1;
        do {
            Test0487.iFld >>= Test0487.iFld;
            for (i16 = i15; i16 < 5; ++i16) {
                s >>= (short) Test0487.instanceCount;
            }
            f *= f;
            for (i18 = i15; i18 < 5; ++i18) {
                Test0487.instanceCount >>>= i16;
                Test0487.instanceCount = Test0487.instanceCount;
                if (true) break;
                f = Test0487.iFld;
                byArr[i15] = (byte) Test0487.instanceCount;
            }
        } while (++i15 < 338);
        long meth_res = s + Float.floatToIntBits(f) + i8 + i15 + i16 + i17 + i18 + i19 + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(byArr);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public static int iMeth(int i1, int i2) {

        int i4=-149;
        int i5=180;
        int i6=58869;
        int i7=4;
        int i20=24410;
        int i21=6;
        int[] iArr =new int[N];
        double d=86.73671;
        byte by=-1;
        short s1=-27731;
        float[][] fArr =new float[N][N];

        FuzzerUtils.init(iArr, -54151);
        FuzzerUtils.init(fArr, 62.474F);

        iArr[(-201 >>> 1) % N] += (i2--);
        for (int i3 : iArr) {
            if (i3 != 0) {
            }
            for (i4 = 1; i4 < 4; ++i4) {
                i1 *= (int) (d + (Test0487.lArrFld[i4]++));
                i2 += (((i4 * Test0487.instanceCount) + Test0487.instanceCount) - i5);
                by += (byte)i4;
                i3 = i1;
                for (i6 = 1; i6 < 2; ++i6) {
                    Test0487.lArrFld[i4 + 1] -= byMeth(s1, Test0487.fFld);
                }
                for (i20 = 1; i20 < 2; ++i20) {
                    s1 = (short)-1;
                    i7 *= i2;
                    fArr[i4][i4 - 1] -= i7;
                    i5 += (2 + (i20 * i20));
                }
            }
        }
        long meth_res = i1 + i2 + i4 + i5 + Double.doubleToLongBits(d) + by + i6 + i7 + s1 + i20 + i21 +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-62494;
        int i22=12643;
        int i23=13437;
        int i24=54220;
        int i25=-82;
        int i26=5;
        int i27=-37879;
        int i28=6;
        int i29=94;
        int i30=64060;
        int i31=29762;
        int i32=60863;
        int i33=35615;
        int[] iArr3 =new int[N];
        boolean b=true;
        float f1=-38.717F;
        float[] fArr1 =new float[N];
        double d3=2.120891;
        byte by1=110;
        short s2=-29028;

        FuzzerUtils.init(fArr1, 0.166F);
        FuzzerUtils.init(iArr3, 104);

        i += (int) ((Test0487.instanceCount >>= iMeth(i, i)) - Test0487.instanceCount);
        for (i22 = 9; i22 < 151; ++i22) {
            switch (((Test0487.iFld >>> 1) % 2) + 10) {
            case 10:
                if (b) break;
                Test0487.iFld += (int) Test0487.instanceCount;
                break;
            case 11:
                Test0487.lArrFld[i22 + 1] -= Test0487.instanceCount;
            }
            i += (((i22 * i23) + Test0487.iFld) - Test0487.instanceCount);
            for (i24 = 6; i24 < 177; i24++) {
                if (b) break;
                for (f1 = 1; f1 < 2; f1++) {
                    fArr1[i24 + 1] *= i23;
                    Test0487.iFld -= (int) d3;
                }
                Test0487.instanceCount *= i23;
            }
            Test0487.iFld = (int) d3;
            i = (int)d3;
            Test0487.iFld = i27;
            by1 += (byte)(-8288 + (i22 * i22));
        }
        iArr3[(45157 >>> 1) % N] = i26;
        i28 = 1;
        while (++i28 < 355) {
            for (i29 = 71; i29 > 2; i29--) {
                Test0487.instanceCount *= Test0487.instanceCount;
                for (i31 = 1; i31 < 2; i31++) {
                    Test0487.iFld = Test0487.iFld;
                    i30 += i33;
                    s2 += (short)(i31 - f1);
                    i33 += (i31 ^ Test0487.instanceCount);
                    i33 += (((i31 * fFld1) + i32) - i22);
                    if (b) break;
                }
                i25 -= (int)1.505F;
                iArr3[i29] = i26;
            }
        }

        FuzzerUtils.out.println("i i22 i23 = " + i + "," + i22 + "," + i23);
        FuzzerUtils.out.println("b i24 i25 = " + (b ? 1 : 0) + "," + i24 + "," + i25);
        FuzzerUtils.out.println("f1 i26 d3 = " + Float.floatToIntBits(f1) + "," + i26 + "," +
            Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("i27 by1 i28 = " + i27 + "," + by1 + "," + i28);
        FuzzerUtils.out.println("i29 i30 i31 = " + i29 + "," + i30 + "," + i31);
        FuzzerUtils.out.println("i32 i33 s2 = " + i32 + "," + i33 + "," + s2);
        FuzzerUtils.out.println("fArr1 iArr3 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + "," +
            FuzzerUtils.checkSum(iArr3));

        FuzzerUtils.out.println("Test0487.instanceCount Test0487.iFld Test0487.fFld = " + Test0487.instanceCount + "," + Test0487.iFld +
                "," + Float.floatToIntBits(Test0487.fFld));
        FuzzerUtils.out.println("fFld1 Test0487.lArrFld Test0487.bArrFld = " + Float.floatToIntBits(fFld1) + "," +
                FuzzerUtils.checkSum(Test0487.lArrFld) + "," + FuzzerUtils.checkSum(Test0487.bArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("byMeth_check_sum: " + byMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0487 _instance = new Test0487();
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
//DEBUG  byMeth ->  byMeth iMeth mainTest
//DEBUG  vMeth ->  vMeth byMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}