// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:12 2023
public class Test0010 {

    public static final int N = 400;

    public static long instanceCount=-247L;
    public static byte byFld=96;
    public static int iFld=-4;
    public static float fFld=-35.306F;
    public static volatile boolean bFld=false;
    public long[][] lArrFld =new long[N][N];
    public static float[] fArrFld =new float[N];
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0010.fArrFld, 1.673F);
        FuzzerUtils.init(Test0010.iArrFld, -185);
    }

    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        int i7=5;
        int i8=223;
        int i9=9;
        int[] iArr =new int[N];
        short s1=14051;
        byte[] byArr =new byte[N];

        FuzzerUtils.init(iArr, 12);
        FuzzerUtils.init(byArr, (byte)-30);

        for (i7 = 221; 11 < i7; i7 -= 3) {
            Test0010.fArrFld[i7 - 1] -= Test0010.instanceCount;
            Test0010.iFld &= Test0010.byFld;
            s1 += (short)(i7 * i7);
            Test0010.iFld -= (int) Test0010.instanceCount;
        }
        Test0010.instanceCount = 64;
        Test0010.iFld -= i7;
        Test0010.instanceCount &= 11;
        i9 = 1;
        do {
            try {
                Test0010.iFld = (-63037 / i9);
                i8 = (i7 % -2139122294);
                Test0010.iFld = (i8 / iArr[i9]);
            } catch (ArithmeticException a_e) {}
            Test0010.iFld -= i7;
            byArr[i9 - 1] = (byte)i8;
            Test0010.iFld -= Test0010.iFld;
            i8 = Test0010.iFld;
            try {
                iArr[i9] = (iArr[i9 + 1] / 1794739611);
                i8 = (i8 % -55352);
                Test0010.iFld = (i9 / Test0010.iFld);
            } catch (ArithmeticException a_e) {}
        } while (++i9 < 206);
        vMeth_check_sum += i7 + i8 + s1 + i9 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(byArr);
    }

    public static long lMeth(double d1) {

        int i6=-21414, i10=-124, i11=-9, i12=-12, i13=11451, i14=34;
        float f=-49.190F;

        i6 = 1;
        while (++i6 < 372) {
            Test0010.instanceCount = (-(Test0010.instanceCount++));
            vMeth();
            i10 = 1;
            do {
                f = Test0010.instanceCount;
                Test0010.iFld -= i6;
            } while (++i10 < 5);
            Test0010.byFld >>= (byte) Test0010.iFld;
        }
        Test0010.iFld ^= Test0010.iFld;
        Test0010.instanceCount = i6;
        for (i11 = 332; i11 > 14; --i11) {
            for (i13 = i11; i13 < 5; i13++) {
                Test0010.iFld += (((i13 * f) + i10) - i13);
            }
            Test0010.instanceCount = Test0010.instanceCount;
            Test0010.iFld += (int) (4054529863283108835L + (i11 * i11));
            d1 *= i12;
        }
        long meth_res = Double.doubleToLongBits(d1) + i6 + i10 + Float.floatToIntBits(f) + i11 + i12 + i13 + i14;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth() {

        double d2=-1.7361;
        int i15=-9;
        int i16=-8;
        int i17=138;
        int i18=-40335;
        int[] iArr1 =new int[N];
        short s2=-22166;
        boolean b=true;

        FuzzerUtils.init(iArr1, 3177);

        Test0010.iFld -= (int) lMeth(d2);
        if (b) {
            for (i15 = 3; i15 < 223; ++i15) {
                s2 = (short)i15;
                Test0010.instanceCount &= Test0010.iFld;
                Test0010.iFld = i16;
                for (i17 = i15; i17 < 7; i17++) {
                    Test0010.instanceCount += (((i17 * i18) + Test0010.instanceCount) - i15);
                    Test0010.instanceCount += i17;
                    i16 += (int) Test0010.instanceCount;
                    s2 <<= (short)41706;
                    iArr1[i15] = (int)d2;
                    Test0010.byFld = (byte) Test0010.iFld;
                }
                try {
                    Test0010.iFld = (i16 / Test0010.iFld);
                    i16 = (i15 / 16004);
                    Test0010.iFld = (1974263195 % i16);
                } catch (ArithmeticException a_e) {}
                iArr1 = iArr1;
            }
        } else {
            Test0010.iFld %= (int) ((long) (Test0010.fFld) | 1);
        }
        long meth_res = Double.doubleToLongBits(d2) + i15 + i16 + s2 + i17 + i18 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=5, i1=-158, i2=-24503, i3=-6, i4=15260, i5=-7, i19=-14, i20=-16424;
        double d=-74.41942;
        short s=20455;
        boolean[][] bArr =new boolean[N][N];

        FuzzerUtils.init(bArr, true);

        i = (int) (++Test0010.instanceCount);
        for (d = 20; d < 391; d++) {
            try {
                i = (-49949 % i1);
                i = (i % i);
                i = (-47688 % i1);
            } catch (ArithmeticException a_e) {}
            for (i2 = (int)(d); i2 < 68; ++i2) {
                for (i4 = 1; i4 < 1; ++i4) {
                    lArrFld = (lArrFld = (lArrFld = (lArrFld = lArrFld)));
                    s += (short)(i4 | i5);
                    i += (i + (i2 >>> (i1 - Test0010.byFld)));
                    Test0010.instanceCount = (long) ((i5--) * 1.370F);
                    i1 += iMeth();
                    Test0010.iFld -= 21099;
                    Test0010.instanceCount = Test0010.instanceCount;
                }
                i3 = (int) Test0010.instanceCount;
                for (i19 = 1; i19 < 1; ++i19) {
                    switch ((i2 % 6) + 59) {
                    case 59:
                        i >>= i3;
                        Test0010.iFld = i3;
                        i5 += (int) Test0010.fFld;
                        switch (((i19 % 7) * 5) + 42) {
                        case 47:
                            i3 += i1;
                            break;
                        case 77:
                            s += (short) (i19 ^ (long) Test0010.fFld);
                            i >>= 42360;
                            Test0010.iArrFld[i19 - 1] += Test0010.iFld;
                            break;
                        case 52:
                            Test0010.instanceCount += (i19 ^ Test0010.instanceCount);
                            i20 = (int) Test0010.instanceCount;
                            Test0010.byFld >>= (byte) Test0010.iFld;
                            s = (short)3071;
                        case 66:
                            lArrFld[i2 - 1][(int) (d + 1)] *= Test0010.iFld;
                            break;
                        case 67:
                            Test0010.fFld -= Test0010.iFld;
                            break;
                        case 61:
                            bArr = bArr;
                            break;
                        case 68:
                            i5 += i19;
                        default:
                            bArr[(int) (d)][i19 - 1] = Test0010.bFld;
                        }
                        break;
                    case 60:
                        i1 %= (int) (Test0010.instanceCount | 1);
                        break;
                    case 61:
                        i3 = i5;
                        break;
                    case 62:
                        Test0010.instanceCount += i20;
                        break;
                    case 63:
                        Test0010.bFld = Test0010.bFld;
                    case 64:
                        i5 ^= 12;
                    default:
                        Test0010.iFld -= (int) Test0010.instanceCount;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i d i1 = " + i + "," + Double.doubleToLongBits(d) + "," + i1);
        FuzzerUtils.out.println("i2 i3 i4 = " + i2 + "," + i3 + "," + i4);
        FuzzerUtils.out.println("i5 s i19 = " + i5 + "," + s + "," + i19);
        FuzzerUtils.out.println("i20 bArr = " + i20 + "," + FuzzerUtils.checkSum(bArr));

        FuzzerUtils.out.println("Test0010.instanceCount Test0010.byFld Test0010.iFld = " + Test0010.instanceCount + "," + Test0010.byFld +
                "," + Test0010.iFld);
        FuzzerUtils.out.println("Test0010.fFld Test0010.bFld lArrFld = " + Float.floatToIntBits(Test0010.fFld) + "," + (Test0010.bFld ?
            1 : 0) + "," + FuzzerUtils.checkSum(lArrFld));
        FuzzerUtils.out.println("Test0010.fArrFld Test0010.iArrFld = " +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0010.fArrFld)) + "," + FuzzerUtils.checkSum(Test0010.iArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0010 _instance = new Test0010();
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
//DEBUG  lMeth ->  lMeth iMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
