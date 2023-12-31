// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:11 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-175L;
    public byte byFld=-71;
    public static byte byFld1=33;
    public static int iFld=-63130;
    public static double dFld=33.81222;
    public static float fFld=-85.417F;
    public static int iArrFld[]=new int[N];
    public static boolean bArrFld[][]=new boolean[N][N];
    public static int iArrFld1[]=new int[N];
    public float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 60321);
        FuzzerUtils.init(Test.bArrFld, false);
        FuzzerUtils.init(Test.iArrFld1, -131);
    }

    public static long fMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;

    public static boolean bMeth() {

        int i1=-2, i2=-91, i3=-46, i4=-22535, i5=48448, iArr[]=new int[N];
        double d=41.66430;
        short s1=6686;

        FuzzerUtils.init(iArr, 9778);

        i1 = 268;
        do {
            d = i1;
            Test.byFld1 = (byte)115;
        } while (--i1 > 0);
        for (i2 = 13; i2 < 288; ++i2) {
            try {
                i3 = (-211 % i2);
                iArr[i2] = (i1 % iArr[i2 + 1]);
                i3 = (i1 % -2296);
            } catch (ArithmeticException a_e) {}
            i3 = i1;
            d += i2;
        }
        iArr[(i3 >>> 1) % N] -= (int)Test.instanceCount;
        s1 *= (short)Test.instanceCount;
        for (i4 = 12; i4 < 336; ++i4) {
            i3 += (int)Test.instanceCount;
            iArr[i4 - 1] = s1;
        }
        d *= -218;
        Test.instanceCount = i3;
        i5 -= i2;
        long meth_res = i1 + Double.doubleToLongBits(d) + i2 + i3 + s1 + i4 + i5 + FuzzerUtils.checkSum(iArr);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static long lMeth() {

        boolean b=false, bArr[]=new boolean[N];
        int i6=-4, i7=57672, i8=5, i9=137, i10=6, i11=-7, i12=50507, i13=225, i14=-64694, i15=176;
        short s2=7575;

        FuzzerUtils.init(bArr, true);

        b = ((b = (b = b)) | (bArr[(13001 >>> 1) % N] = bMeth()));
        Test.iFld += Test.iFld;
        for (i6 = 11; i6 < 228; ++i6) {
            Test.instanceCount += i6;
            for (i8 = 1; i8 < 7; ++i8) {
                for (i10 = 1; i10 < 2; ++i10) {
                    Test.iFld = s2;
                    i11 = (int)Test.dFld;
                }
            }
        }
        i11 -= Test.iFld;
        for (i12 = 1; i12 < 237; ++i12) {
            for (i14 = 1; i14 < 7; i14++) {
                i15 -= i14;
                Test.byFld1 *= (byte)61.678F;
            }
            if (b) continue;
            i15 *= i6;
        }
        long meth_res = (b ? 1 : 0) + i6 + i7 + i8 + i9 + i10 + i11 + s2 + i12 + i13 + i14 + i15 +
            FuzzerUtils.checkSum(bArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public float fMeth(short s, int i) {

        int i17=3, i18=4, i19=10, i20=-67;

        i = (int)Math.max(lMeth(), Test.instanceCount);
        for (int i16 : Test.iArrFld) {
            Test.bArrFld[(-12 >>> 1) % N] = Test.bArrFld[(Test.iFld >>> 1) % N];
            for (i17 = 1; i17 < 4; ++i17) {
                Test.fFld += i17;
                Test.fFld = s;
                Test.iFld += i;
                switch (((Test.iFld >>> 1) % 7) + 105) {
                case 105:
                    i18 += (i17 * i17);
                    Test.byFld1 = (byte)s;
                    Test.instanceCount += Test.instanceCount;
                    for (i19 = 1; 2 > i19; ++i19) {
                        Test.iArrFld[i17 + 1] = 19713;
                        i = (int)Test.fFld;
                    }
                    break;
                case 106:
                    i16 *= i20;
                    break;
                case 107:
                    Test.iArrFld1[i17] = i20;
                    break;
                case 108:
                    if (false) break;
                    break;
                case 109:
                    i += (((i17 * i17) + Test.instanceCount) - i17);
                    break;
                case 110:
                    Test.instanceCount = 192;
                    break;
                case 111:
                    i16 *= Test.iFld;
                default:
                    if (i19 != 0) {
                    }
                }
            }
        }
        long meth_res = s + i + i17 + i18 + i19 + i20;
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        short s3=-29880;
        float f=1.493F, f1=104.858F;
        int i21=52588, i22=55, i23=-40069, i24=87, i25=194, i26=61, i27=0;
        boolean b1=false;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, 2498665130L);

        byFld += (byte)fMeth(s3, Test.iFld);
        switch (((23238 >>> 1) % 2) + 18) {
        case 18:
            f = 1;
            while (++f < 221) {
                Test.iFld = -28117;
            }
            break;
        case 19:
        default:
            for (i21 = 11; i21 < 337; ++i21) {
                Test.iFld -= i22;
                if (false) continue;
                Test.instanceCount += (i21 + Test.iFld);
                for (i23 = 3; i23 < 77; i23++) {
                    if (b1) continue;
                    for (i25 = 1; i25 < 2; ++i25) {
                        Test.instanceCount += (i25 - Test.instanceCount);
                        i26 += i24;
                        Test.instanceCount += i25;
                        Test.instanceCount -= i24;
                        i24 = (int)Test.fFld;
                        switch ((i25 % 10) + 107) {
                        case 107:
                            Test.iFld += i22;
                            i26 = (int)Test.instanceCount;
                            switch ((i25 % 8) + 91) {
                            case 91:
                                Test.iFld >>= i21;
                                Test.iFld += (((i25 * f) + i26) - s3);
                                break;
                            case 92:
                                Test.iFld += (i25 | i23);
                                break;
                            case 93:
                                fArrFld[i25 - 1] += 32067;
                                break;
                            case 94:
                                Test.instanceCount = Test.instanceCount;
                                Test.fFld = f;
                                Test.fFld -= i24;
                                Test.instanceCount = i25;
                            case 95:
                                Test.instanceCount ^= -7325;
                            case 96:
                                Test.iFld = (int)5L;
                            case 97:
                                try {
                                    i26 = (Test.iFld / 8814);
                                    i26 = (Test.iFld / i22);
                                    Test.iArrFld[i25 - 1] = (Test.iFld / 3101);
                                } catch (ArithmeticException a_e) {}
                                break;
                            case 98:
                                i22 -= (int)Test.instanceCount;
                                break;
                            }
                            break;
                        case 108:
                            Test.dFld *= i21;
                            break;
                        case 109:
                            s3 *= (short)Test.instanceCount;
                            break;
                        case 110:
                            i22 *= 56448;
                            break;
                        case 111:
                            lArr[i23 - 1][i25 + 1] = 13331;
                        case 112:
                        case 113:
                            if (b1) continue;
                            break;
                        case 114:
                            i24 += (((i25 * i25) + byFld) - i27);
                        case 115:
                            i26 <<= i27;
                            break;
                        case 116:
                            i24 += i26;
                        default:
                            f1 = 82.885F;
                        }
                    }
                }
            }
        }

        FuzzerUtils.out.println("s3 f i21 = " + s3 + "," + Float.floatToIntBits(f) + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("b1 i25 i26 = " + (b1 ? 1 : 0) + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 f1 lArr = " + i27 + "," + Float.floatToIntBits(f1) + "," +
            FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test.instanceCount byFld Test.byFld1 = " + Test.instanceCount + "," + byFld + "," +
            Test.byFld1);
        FuzzerUtils.out.println("Test.iFld Test.dFld Test.fFld = " + Test.iFld + "," +
            Double.doubleToLongBits(Test.dFld) + "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.iArrFld Test.bArrFld Test.iArrFld1 = " + FuzzerUtils.checkSum(Test.iArrFld) + ","
            + FuzzerUtils.checkSum(Test.bArrFld) + "," + FuzzerUtils.checkSum(Test.iArrFld1));
        FuzzerUtils.out.println("fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));

        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth fMeth mainTest
//DEBUG  bMeth ->  bMeth lMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
