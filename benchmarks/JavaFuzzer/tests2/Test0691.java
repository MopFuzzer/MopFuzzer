// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:44 2023
public class Test0691 {

    public static final int N = 400;

    public static volatile long instanceCount=64425L;
    public static int iFld=-165;
    public static short sFld=20174;
    public static double dFld=-97.96427;
    public volatile float fFld=78.930F;
    public static long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test0691.lArrFld, 5963293699900276036L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(int i13, int i14) {

        int i15=64;
        int i16=-6;
        int i17=-12;
        int i18=-16336;
        int i19=57;
        int i20=-59164;
        int i21=7;
        int[] iArr =new int[N];
        float f=0.91F;
        boolean b=true;
        double d1=101.15012;

        FuzzerUtils.init(iArr, -8);

        i14 >>= 3;
        Test0691.instanceCount >>= 10;
        i15 = 1;
        do {
            iArr[i15] *= i14;
            f += i15;
        } while (++i15 < 390);
        for (i16 = 326; i16 > 14; --i16) {
            for (i18 = 1; i18 < 5; i18++) {
                i17 += (i18 - i15);
                for (i20 = i16; i20 < 2; i20++) {
                    if (b) break;
                    i19 ^= i20;
                    Test0691.instanceCount += (i20 ^ i21);
                    d1 -= i20;
                    i13 += (220 + (i20 * i20));
                }
            }
            iArr[i16 - 1] = (int)d1;
        }
        long meth_res = i13 + i14 + i15 + Float.floatToIntBits(f) + i16 + i17 + i18 + i19 + i20 + i21 + (b ? 1 : 0) +
            Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth1(int i7) {

        double d=-1.55636;
        int i8=12, i9=9, i10=-62285, i11=-46, i12=-113, i22=-20766, i23=-34;
        short s=18834;
        float f1=-83.922F;
        float[] fArr =new float[N];
        long[] lArr =new long[N];

        FuzzerUtils.init(fArr, 28.79F);
        FuzzerUtils.init(lArr, -132L);

        for (d = 15; d < 284; d++) {
            i8 += i8;
            i9 = 6;
            do {
                fArr = (fArr = (fArr = (fArr = fArr)));
                for (i10 = 1; i10 < 1; ++i10) {
                    i7 = (int)lArr[i9];
                    i12 = (int) ((fMeth(-166, i12) * Test0691.instanceCount) * i10);
                    i12 <<= s;
                    i8 += (int)4471503420697308893L;
                    lArr[i10 + 1] |= 7224963596254757933L;
                }
                for (i22 = 1; i22 < 1; i22++) {
                    i23 -= (int)f1;
                    i7 >>= i22;
                    if (i23 != 0) {
                        vMeth1_check_sum += i7 + Double.doubleToLongBits(d) + i8 + i9 + i10 + i11 + i12 + s + i22 + i23
                            + Float.floatToIntBits(f1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
                            FuzzerUtils.checkSum(lArr);
                        return;
                    }
                    Test0691.instanceCount *= (long) f1;
                }
            } while (--i9 > 0);
        }
        vMeth1_check_sum += i7 + Double.doubleToLongBits(d) + i8 + i9 + i10 + i11 + i12 + s + i22 + i23 +
            Float.floatToIntBits(f1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(int i5, long l, int i6) {

        int i24=125;
        int i25=69;
        int[][] iArr1 =new int[N][N];
        byte by=68;
        double d2=-1.115303;
        boolean b1=false;

        FuzzerUtils.init(iArr1, 115);

        vMeth1(i5);
        i6 += i6;
        if (b1) {
            i6 = i6;
            iArr1[(i6 >>> 1) % N][(i5 >>> 1) % N] = (int) Test0691.instanceCount;
            iArr1[(i24 >>> 1) % N][(Test0691.iFld >>> 1) % N] >>>= by;
            iArr1[(i24 >>> 1) % N][(i6 >>> 1) % N] = -1195;
        } else if (true) {
            iArr1[(i24 >>> 1) % N][(i24 >>> 1) % N] += Test0691.iFld;
        } else if (b1) {
            d2 = 1;
            do {
                Test0691.sFld += (short) (((d2 * Test0691.instanceCount) + Test0691.instanceCount) - i25);
                i6 += (int)d2;
                i5 += Test0691.iFld;
                Test0691.lArrFld[(int) (d2)] -= 151;
                i5 >>>= Test0691.iFld;
                l += i6;
            } while (++d2 < 350);
        }
        vMeth_check_sum += i5 + l + i6 + i24 + by + Double.doubleToLongBits(d2) + i25 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=61212;
        int i1=141;
        int i2=-62;
        int i3=-30;
        int i4=-13257;
        int i26=-14;
        int i27=-67;
        int i28=32504;
        int i29=42301;
        int i30=60518;
        int[] iArr2 =new
                    int[N];
        double[][] dArr =new double[N][N];

        FuzzerUtils.init(iArr2, -65028);
        FuzzerUtils.init(dArr, 2.121335);

        for (i = 14; i < 261; i++) {
            for (i2 = 3; i2 < 102; ++i2) {
                i4 = 1;
                do {
                    i1 -= (int) (Test0691.instanceCount++);
                } while (++i4 < 2);
                vMeth(i4, Test0691.instanceCount, i);
                i26 = 1;
                while (++i26 < 2) {
                    float f2=-89.740F;
                    f2 *= (float) Test0691.dFld;
                    i1 += (i26 * i4);
                    i1 = i;
                    iArr2[i - 1] -= (int) Test0691.dFld;
                    iArr2[i26] >>= i26;
                }
                dArr[i2][i2 - 1] -= i4;
                Test0691.instanceCount += Test0691.instanceCount;
                i1 = i2;
                Test0691.lArrFld[i - 1] += 27;
            }
            Test0691.dFld = i;
            for (i27 = 4; i27 < 102; i27 += 2) {
                i28 -= i27;
                i1 += (((i27 * fFld) + Test0691.instanceCount) - i4);
                fFld += i27;
                switch (((i26 >>> 1) % 10) + 109) {
                case 109:
                    Test0691.iFld = 65138;
                    i1 = i27;
                    break;
                case 110:
                    for (i29 = 1; i29 < 3; i29++) {
                        Test0691.dFld *= Test0691.dFld;
                        i1 += i29;
                        i28 /= (int)(i28 | 1);
                        iArr2[i27] = Test0691.sFld;
                    }
                    Test0691.iFld = (int) fFld;
                    Test0691.instanceCount = 928782466L;
                    break;
                case 111:
                    i30 += i27;
                    break;
                case 112:
                    iArr2[i] -= i1;
                    break;
                case 113:
                    iArr2[i27 + 1] = Test0691.sFld;
                    break;
                case 114:
                    i1 -= (int) Test0691.dFld;
                    break;
                case 115:
                    Test0691.sFld += (short) (((i27 * i27) + Test0691.instanceCount) - Test0691.instanceCount);
                    break;
                case 116:
                case 117:
                    i28 = Test0691.sFld;
                    break;
                case 118:
                default:
                    Test0691.iFld <<= (int) Test0691.instanceCount;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i4 i26 = " + i3 + "," + i4 + "," + i26);
        FuzzerUtils.out.println("i27 i28 i29 = " + i27 + "," + i28 + "," + i29);
        FuzzerUtils.out.println("i30 iArr2 dArr = " + i30 + "," + FuzzerUtils.checkSum(iArr2) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test0691.instanceCount Test0691.iFld Test0691.sFld = " + Test0691.instanceCount + "," + Test0691.iFld +
                "," + Test0691.sFld);
        FuzzerUtils.out.println("Test0691.dFld fFld Test0691.lArrFld = " + Double.doubleToLongBits(Test0691.dFld) + "," +
                Float.floatToIntBits(fFld) + "," + FuzzerUtils.checkSum(Test0691.lArrFld));

        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0691 _instance = new Test0691();
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  fMeth ->  fMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
