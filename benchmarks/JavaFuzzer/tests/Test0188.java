// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:57 2023
public class Test0188 {

    public static final int N = 400;

    public static long instanceCount = -22L;
    public static boolean bFld = false;
    public static short sFld = 9467;
    public static double dFld = -37.30372;
    public static int[] iArrFld = new int[N];
    public static long vSmallMeth_check_sum = 0;
    public static long vSmallMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0188.iArrFld, -39991);
    }

    public float fFld = 1.817F;
    public byte byFld = 50;
    public volatile float[] fArrFld = new float[N];

    public static void vSmallMeth() {


        Test0188.bFld = (Test0188.bFld = Test0188.bFld);
        vSmallMeth_check_sum += 0;
    }

    public static void vSmallMeth1() {

        int i3 = 3;

        Test0188.instanceCount = i3;
        vSmallMeth1_check_sum += i3;
    }

    public static float fMeth(int i17) {

        float f = 2.817F, f1 = 98.467F;
        int i18 = -33782;
        int i19 = -9;
        int i20 = 686;
        int i21 = -12;
        int i22 = -41;
        int[] iArr1 = new int[N];
        int[][] iArr2 = new int[N][N];
        long l2 = 65402L;
        double d = 3.64109;

        FuzzerUtils.init(iArr1, -1);
        FuzzerUtils.init(iArr2, 13032);

        i17 += (int) Test0188.instanceCount;
        for (f = 4; f < 194; f++) {
            Test0188.instanceCount = i17;
            i19 = 1;
            while (++i19 < 8) {
                for (l2 = 1; l2 < 1; ++l2) {
                    f1 = -243;
                    iArr1[i19] = i19;
                }
                if (Test0188.bFld) continue;
                i18 *= (int) f;
                for (i21 = 1; i21 < 1; i21++) {
                    i20 = i21;
                    i17 -= i20;
                    d *= 33;
                    try {
                        i18 = (i22 / 1908572803);
                        i22 = (i18 / 36);
                        i20 = (i17 / iArr1[i21 + 1]);
                    } catch (ArithmeticException a_e) {
                    }
                    iArr2 = FuzzerUtils.int2array(N, (int) -45368);
                }
            }
        }
        long meth_res = i17 + Float.floatToIntBits(f) + i18 + i19 + l2 + i20 + Float.floatToIntBits(f1) + i21 + i22 +
                Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(iArr2);
        fMeth_check_sum += meth_res;
        return (float) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0188 _instance = new Test0188();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public long lMeth(int i14) {

        long l1 = 6528313294659077661L;
        int i15 = -17;
        int i16 = 19139;
        int i23 = 11;
        int[] iArr = new int[N];
        double[] dArr1 = new double[N];

        FuzzerUtils.init(iArr, -14);
        FuzzerUtils.init(dArr1, -88.20760);

        l1 = 1;
        while (++l1 < 211) {
            Test0188.instanceCount <<= 46208L;
            Test0188.sFld += (short) l1;
            Test0188.sFld += (short) (l1 ^ Test0188.instanceCount);
            if (iArr[(int) (l1)] <= (((Test0188.sFld >>> i14) + (++Test0188.instanceCount)) - iArr[(int) (l1)])) break;
            for (i15 = 1; i15 < 8; i15++) {
                i14 = (int) Math.abs(fMeth(i16));
                i16 -= (int) l1;
                i16 += (int) Test0188.dFld;
                if (Test0188.bFld) {
                    dArr1[i15 - 1] += i14;
                }
                i23 = 1;
                while (++i23 < 2) {
                    fFld *= (float) Test0188.dFld;
                    Test0188.dFld = fFld;
                    i16 += i23;
                }
            }
        }
        long meth_res = i14 + l1 + i15 + i16 + i23 + FuzzerUtils.checkSum(iArr) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1));
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public int iMeth() {

        int i5 = -12, i6 = -1, i7 = 233, i8 = 54946, i9 = -42, i10 = -6, i11 = 10, i12 = -21572, i13 = -5;
        long l = -1L;
        double[] dArr = new double[N];

        FuzzerUtils.init(dArr, 127.103518);

        for (i5 = 8; i5 < 331; i5++) {
            for (i7 = 5; i7 > 1; i7 -= 2) {
                Test0188.instanceCount >>= i8;
                i6 = (int) (-(Test0188.instanceCount++));
                i6 += (i7 * i8);
            }
            l = 1;
            while ((l += 2) < 5) {
                vSmallMeth1();
            }
        }
        for (i9 = 2; i9 < 143; i9++) {
            i11 = 1;
            while (++i11 < 11) {
                dArr[i11 + 1] *= ((-(i11 + fFld)) + ((i7 * fFld) - (i8 = byFld)));
                for (i12 = i9; i12 < 1; i12++) {
                    vSmallMeth1();
                    fFld += lMeth(i7);
                    i10 -= i12;
                    i8 += (i12 | (long) fFld);
                }
            }
        }
        long meth_res = i5 + i6 + i7 + i8 + l + i9 + i10 + i11 + i12 + i13 +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i = 7, i1 = -87, i2 = 194, i4 = 34924, i24 = 80, i25 = -4;
        boolean[] bArr = new boolean[N];

        FuzzerUtils.init(bArr, false);

        for (int smallinvoc = 0; smallinvoc < 651; smallinvoc++) vSmallMeth();
        i += (int) (++Test0188.instanceCount);
        for (i1 = 181; 3 < i1; i1 -= 2) {
            for (int smallinvoc = 0; smallinvoc < 62; smallinvoc++) vSmallMeth1();
            vSmallMeth();
            i4 = 1;
            do {
                Test0188.instanceCount = iMeth();
                i += 4;
                for (i24 = 1; i24 < 1; i24 += 2) {
                    Test0188.instanceCount += (long) -12.980F;
                    i += i25;
                    Test0188.iArrFld[i24 - 1] <<= byFld;
                    i25 <<= i2;
                    switch ((i4 % 6) + 99) {
                        case 99:
                            Test0188.iArrFld[i24 + 1] = i25;
                            i25 = i1;
                        case 100:
                            switch (((-16795 >>> 1) % 10) + 26) {
                                case 26:
                                case 27:
                                case 28:
                                    i = 27759;
                                    Test0188.instanceCount *= Test0188.instanceCount;
                                    break;
                                case 29:
                                    switch ((i1 % 8) + 60) {
                                        case 60:
                                        case 61:
                                            Test0188.dFld += Test0188.instanceCount;
                                            fFld += i;
                                            Test0188.iArrFld = Test0188.iArrFld;
                                            i2 *= i2;
                                        case 62:
                                            Test0188.bFld = Test0188.bFld;
                                        case 63:
                                            fFld = i25;
                                        case 64:
                                            bArr[i1] = Test0188.bFld;
                                            i2 += i25;
                                            byFld *= (byte) Test0188.sFld;
                                        case 65:
                                            Test0188.instanceCount = i;
                                            break;
                                        case 66:
                                            fFld -= fFld;
                                            break;
                                        case 67:
                                            fArrFld[i24] = -40731;
                                            break;
                                        default:
                                            i25 >>>= i24;
                                    }
                                    break;
                                case 30:
                                    i2 -= 26294;
                                    break;
                                case 31:
                                    i2 >>= i4;
                                case 32:
                                case 33:
                                    Test0188.instanceCount = Test0188.instanceCount;
                                    break;
                                case 34:
                                    i2 += 238;
                                    break;
                                case 35:
                                    fArrFld[i4] += -207;
                                    break;
                                default:
                                    byFld *= (byte) 5L;
                            }
                            break;
                        case 101:
                            i += (((i24 * i24) + Test0188.instanceCount) - fFld);
                            break;
                        case 102:
                            byFld *= (byte) i;
                        case 103:
                            i = i1;
                            break;
                        case 104:
                            Test0188.instanceCount = 57395;
                            break;
                    }
                }
            } while (++i4 < 281);
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i4 i24 i25 = " + i4 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("bArr = " + FuzzerUtils.checkSum(bArr));

        FuzzerUtils.out.println("Test0188.instanceCount Test0188.bFld fFld = " + Test0188.instanceCount + "," + (Test0188.bFld ? 1 : 0)
                + "," + Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("byFld Test0188.sFld Test0188.dFld = " + byFld + "," + Test0188.sFld + "," +
                Double.doubleToLongBits(Test0188.dFld));
        FuzzerUtils.out.println("Test0188.iArrFld fArrFld = " + FuzzerUtils.checkSum(Test0188.iArrFld) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));

        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth1_check_sum: " + vSmallMeth1_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  vSmallMeth1 ->  vSmallMeth1 mainTest Test iMeth
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  lMeth ->  lMeth iMeth mainTest
//DEBUG  fMeth ->  fMeth lMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
