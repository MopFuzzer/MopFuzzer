// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:17 2023
public class Test0124 {

    public static final int N = 400;

    public static long instanceCount=-100L;
    public static double dFld=2.52796;
    public static int iFld=1;
    public static volatile byte byFld=27;
    public volatile float fFld=90.954F;
    public static boolean bFld=true;
    public volatile double dFld1=-2.22073;
    public double dFld2=-54.58413;
    public static int[] iArrFld =new int[N];
    public static volatile float[] fArrFld =new float[N];

    static {
        FuzzerUtils.init(Test0124.iArrFld, 24);
        FuzzerUtils.init(Test0124.fArrFld, -102.404F);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        int i3=4;
        int i4=-4;
        int i5=1;
        int i6=-127;
        int i7=-13;
        int i8=-3;
        int i9=47;
        int i10=-22382;
        int[][] iArr =new int[N][N];
        double d=-11.5813;
        long[] lArr =new long[N];

        FuzzerUtils.init(iArr, -10);
        FuzzerUtils.init(lArr, -157L);

        Test0124.iFld <<= Test0124.iFld;
        for (i3 = 6; 166 > i3; i3++) {
            i4 += Test0124.iFld;
            Test0124.iFld += (i3 + i4);
            for (i5 = 1; 10 > i5; i5++) {
                i6 = i4;
            }
            for (i7 = i3; i7 < 10; ++i7) {
                i6 += (i7 | i5);
                iArr[i7 + 1][i3 - 1] = Test0124.byFld;
                d -= Test0124.instanceCount;
            }
        }
        for (i9 = 20; i9 < 324; i9++) {
            i4 *= (int)d;
        }
        lArr[(-14027 >>> 1) % N] ^= i5;
        i4 = i5;
        i8 -= (int) Test0124.instanceCount;
        vMeth_check_sum += i3 + i4 + i5 + i6 + i7 + i8 + Double.doubleToLongBits(d) + i9 + i10 +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public static long lMeth(long l, int i) {

        int i1=-195;
        int i2=152;
        int i11=202;
        int i12=-42;
        int i13=235;
        int i14=-19314;
        int[][] iArr1 =new int[N][N];
        short s=16359;
        short[] sArr =new short[N];
        boolean b=false;
        double[] dArr =new double[N];
        long[] lArr1 =new long[N];

        FuzzerUtils.init(dArr, 5.93331);
        FuzzerUtils.init(sArr, (short)19598);
        FuzzerUtils.init(lArr1, 56455L);
        FuzzerUtils.init(iArr1, -43238);

        for (i1 = 21; i1 < 375; ++i1) {
            vMeth();
            switch (((i1 >>> 1) % 7) + 118) {
            case 118:
                dArr[i1] -= i2;
                for (i11 = 1; i11 < 5; i11++) {
                    sArr[i11 + 1] = (short)-27712;
                    try {
                        i = (-2063297345 % Test0124.iFld);
                        Test0124.iArrFld[i11] = (Test0124.iFld % 256);
                        i12 = (-1625836384 % i1);
                    } catch (ArithmeticException a_e) {}
                    dArr[i1 + 1] -= i11;
                    Test0124.instanceCount *= l;
                    i13 += s;
                    b = b;
                    lArr1[i1] *= i12;
                    Test0124.byFld += (byte) i12;
                    if (b) continue;
                    iArr1 = iArr1;
                }
            case 119:
                Test0124.instanceCount = i11;
                break;
            case 120:
                i14 += (i1 * i1);
            case 121:
                Test0124.byFld = (byte) i;
                break;
            case 122:
                i12 = Test0124.byFld;
            case 123:
                iArr1[i1 + 1][i1] = i12;
                break;
            case 124:
                i2 >>= i11;
                break;
            default:
                if (b) continue;
            }
        }
        long meth_res = l + i + i1 + i2 + i11 + i12 + i13 + s + (b ? 1 : 0) + i14 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(sArr) +
            FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vSmallMeth() {


        lMeth(Test0124.instanceCount, Test0124.iFld);
        Test0124.byFld <<= (byte) Test0124.iFld;
        vSmallMeth_check_sum += 0;
    }

    public void mainTest(String[] strArr1) {

        int i15=-5, i16=10991, i17=39857, i18=-35010, i19=-9;
        short s1=-19319;
        boolean[] bArr =new boolean[N];
        long[] lArr2 =new long[N];
        byte[] byArr =new byte[N];
        double[][] dArr1 =new double[N][N];

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(lArr2, -1301292418L);
        FuzzerUtils.init(byArr, (byte)-61);
        FuzzerUtils.init(dArr1, 41.108139);

        Test0124.dFld -= (((-1973539242744850653L - (Test0124.iFld--)) + Test0124.byFld) - ((Test0124.instanceCount +
                Test0124.instanceCount) + (Test0124.iFld + 2682273411L)));
        Test0124.iFld = (int) (++fFld);
        for (int smallinvoc=0; smallinvoc<418; smallinvoc++) vSmallMeth();
        i15 = 1;
        while ((i15 += 2) < 270) {
            Test0124.byFld += (byte) (i15 - Test0124.instanceCount);
            for (i16 = i15; i16 < 186; i16++) {
                long l1=-214L;
                Test0124.iFld -= i15;
                switch (i16 + 33) {
                case 33:
                    for (i18 = i15; i18 < 1; ++i18) {
                        switch ((i16 % 7) + 48) {
                        case 48:
                            i17 += i17;
                            break;
                        case 49:
                            Test0124.byFld *= (byte) i18;
                            i19 <<= (int) Test0124.instanceCount;
                            break;
                        case 50:
                            i19 = (int)60L;
                            break;
                        case 51:
                        case 52:
                            Test0124.instanceCount = Test0124.instanceCount;
                            fFld = (float) Test0124.dFld;
                            switch ((i16 % 10) + 106) {
                            case 106:
                                if (Test0124.bFld) continue;
                                break;
                            case 107:
                                Test0124.iFld >>>= (int) Test0124.instanceCount;
                                bArr[i15] = Test0124.bFld;
                                Test0124.bFld = false;
                                break;
                            case 108:
                                s1 += (short) Test0124.instanceCount;
                                try {
                                    Test0124.iFld = (Test0124.iArrFld[i16 - 1] % -77);
                                    i17 = (i17 / i16);
                                    Test0124.iFld = (1826791882 % i17);
                                } catch (ArithmeticException a_e) {}
                                break;
                            case 109:
                                if (Test0124.bFld) continue;
                                break;
                            case 110:
                                i17 -= i15;
                                lArr2[i16 - 1] <<= Test0124.instanceCount;
                                s1 += (short)(i18 | i19);
                                break;
                            case 111:
                                fFld *= -3;
                                Test0124.instanceCount = s1;
                                lArr2[i15] -= s1;
                                break;
                            case 112:
                            case 113:
                                byArr[i16 - 1] += (byte) Test0124.instanceCount;
                            case 114:
                                Test0124.iArrFld[i18 + 1] *= i19;
                                break;
                            case 115:
                                Test0124.instanceCount = (long) fFld;
                                break;
                            default:
                                Test0124.iFld <<= i15;
                            }
                            break;
                        case 53:
                            i19 >>= i18;
                        case 54:
                            Test0124.iFld -= s1;
                            break;
                        default:
                            i19 = Test0124.iFld;
                        }
                    }
                    break;
                case 34:
                    Test0124.byFld -= (byte) i19;
                case 35:
                    Test0124.instanceCount = i17;
                    break;
                case 36:
                    if (Test0124.bFld) break;
                    break;
                case 37:
                    Test0124.iArrFld[i15 - 1] *= i17;
                    break;
                case 38:
                case 39:
                    i17 += i17;
                    break;
                case 40:
                    Test0124.iArrFld[i15] = i16;
                    break;
                case 41:
                    fFld *= Test0124.instanceCount;
                    break;
                case 42:
                    i17 += i16;
                    break;
                case 43:
                    Test0124.instanceCount -= i18;
                    break;
                case 44:
                    Test0124.iFld += (i16 * s1);
                case 45:
                    i19 += i16;
                    break;
                case 46:
                    Test0124.iArrFld[i15] = Test0124.byFld;
                case 47:
                    Test0124.iFld = i19;
                case 48:
                    if (Test0124.bFld) continue;
                case 49:
                    dFld1 -= Test0124.instanceCount;
                    break;
                case 50:
                    i17 >>= Test0124.iFld;
                case 51:
                    i19 -= i17;
                    break;
                case 52:
                    i19 += (i16 - fFld);
                    break;
                case 53:
                    Test0124.instanceCount = i19;
                    break;
                case 54:
                    Test0124.iFld %= (int) ((long) (dFld2) | 1);
                    break;
                case 55:
                    Test0124.iFld *= (int) Test0124.instanceCount;
                case 56:
                    Test0124.iFld = 14;
                    break;
                case 57:
                case 58:
                    i19 += i19;
                case 59:
                    i19 ^= i16;
                    break;
                case 60:
                    i17 *= i17;
                case 61:
                    dFld2 += Test0124.byFld;
                    break;
                case 62:
                    i17 = (int) Test0124.instanceCount;
                    break;
                case 63:
                    Test0124.instanceCount = Test0124.iFld;
                    break;
                case 64:
                    Test0124.iFld -= 95;
                    break;
                case 65:
                    i19 = (int) Test0124.instanceCount;
                    break;
                case 66:
                    Test0124.iFld += i19;
                    break;
                case 67:
                    fFld = fFld;
                case 68:
                    i19 %= (int) ((long) (Test0124.dFld) | 1);
                    break;
                case 69:
                    Test0124.instanceCount -= Test0124.instanceCount;
                    break;
                case 70:
                    i17 += (((i16 * i18) + Test0124.iFld) - i18);
                    break;
                case 71:
                    fFld = -5;
                    break;
                case 72:
                    i17 = (int) Test0124.instanceCount;
                    break;
                case 73:
                    Test0124.instanceCount = i17;
                    break;
                case 74:
                    dArr1[i15][i15 - 1] -= 58744;
                case 75:
                    i17 <<= i17;
                case 76:
                    if (Test0124.bFld) continue;
                    break;
                case 77:
                    fFld += 112;
                    break;
                case 78:
                    Test0124.iArrFld[i16 - 1] *= i15;
                case 79:
                    i17 = i15;
                case 80:
                    Test0124.instanceCount += (i16 + Test0124.byFld);
                    break;
                case 81:
                    Test0124.instanceCount += (i16 * i16);
                    break;
                case 82:
                    Test0124.instanceCount += i17;
                    break;
                case 83:
                    l1 *= -43451;
                    break;
                case 84:
                    l1 = (long)1.100222;
                    break;
                case 85:
                    Test0124.instanceCount += (((i16 * Test0124.iFld) + Test0124.instanceCount) - i16);
                    break;
                case 86:
                    Test0124.iFld = i15;
                    break;
                case 87:
                    Test0124.iFld += (int) Test0124.instanceCount;
                    break;
                case 88:
                    fFld = i15;
                    break;
                case 89:
                    i19 = (int)l1;
                    break;
                case 90:
                    Test0124.instanceCount += i16;
                    break;
                case 91:
                case 92:
                    i19 += (i16 | (long)fFld);
                    break;
                case 93:
                    dFld2 = i17;
                    break;
                case 94:
                    Test0124.byFld += (byte) Test0124.instanceCount;
                    break;
                case 95:
                    Test0124.iFld *= (int) l1;
                    break;
                case 96:
                    Test0124.byFld += (byte) i16;
                    break;
                case 97:
                    if (Test0124.bFld) continue;
                    break;
                case 98:
                    i19 += s1;
                case 99:
                    fFld *= s1;
                case 100:
                    lArr2[i15 - 1] = 1;
                case 101:
                    s1 += (short) (((i16 * Test0124.iFld) + fFld) - s1);
                    break;
                case 102:
                    Test0124.instanceCount -= i17;
                }
            }
        }

        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 i19 s1 = " + i18 + "," + i19 + "," + s1);
        FuzzerUtils.out.println("bArr lArr2 byArr = " + FuzzerUtils.checkSum(bArr) + "," + FuzzerUtils.checkSum(lArr2)
            + "," + FuzzerUtils.checkSum(byArr));
        FuzzerUtils.out.println("dArr1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)));

        FuzzerUtils.out.println("Test0124.instanceCount Test0124.dFld Test0124.iFld = " + Test0124.instanceCount + "," +
                Double.doubleToLongBits(Test0124.dFld) + "," + Test0124.iFld);
        FuzzerUtils.out.println("Test0124.byFld fFld Test0124.bFld = " + Test0124.byFld + "," + Float.floatToIntBits(fFld) + "," +
                (Test0124.bFld ? 1 : 0));
        FuzzerUtils.out.println("dFld1 dFld2 Test0124.iArrFld = " + Double.doubleToLongBits(dFld1) + "," +
                Double.doubleToLongBits(dFld2) + "," + FuzzerUtils.checkSum(Test0124.iArrFld));
        FuzzerUtils.out.println("Test0124.fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0124.fArrFld)));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0124 _instance = new Test0124();
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
//DEBUG  lMeth ->  lMeth vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth lMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}