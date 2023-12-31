// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:25 2023
public class Test0280 {

    public static final int N = 400;

    public static long instanceCount=3556912191985811375L;
    public static boolean bFld=false;
    public static byte byFld=-109;
    public static float fFld=73.464F;
    public static long lFld=13L;
    public static short sFld=374;
    public static double[] dArrFld =new double[N];
    public static boolean[] bArrFld =new boolean[N];

    static {
        FuzzerUtils.init(Test0280.dArrFld, 8.108247);
        FuzzerUtils.init(Test0280.bArrFld, false);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;

    public static void vSmallMeth(long l, int i) {


        i += (Integer.reverseBytes(i) - -13);
        vSmallMeth_check_sum += l + i;
    }

    public static int iMeth(int i2, long l1, int i3) {

        short s=32276;
        long l2=-190L;
        int i5=-40580;
        int i6=-171;
        int i7=8;
        int[] iArr =new int[N];
        float f=0.531F;
        double d=2.17783;

        FuzzerUtils.init(iArr, -57);

        for (int i4 : iArr) {
            vSmallMeth(-(i2--), i2 - (--s));
            iArr[(i3 >>> 1) % N] += -9316;
            i2 = (i3--);
            i3 = (i2++);
        }
        vSmallMeth(Long.reverseBytes(i2 + (i3++)), ++i3);
        i3 = i2;
        for (l2 = 18; 314 > l2; ++l2) {
            for (i6 = (int)(l2); i6 < 6; ++i6) {
                iArr[i6] = (int)(iArr[i6 + 1] - ((--l1) - (++l1)));
                f += (i6 + i7);
                Test0280.bFld = true;
                d = (i7 = (int)((i5 - d) - Long.reverseBytes(-6026810623350522147L)));
                i2 += (i6 * i6);
            }
            f += (((l2 * f) + i6) - i2);
        }
        long meth_res = i2 + l1 + i3 + s + l2 + i5 + i6 + i7 + Float.floatToIntBits(f) + Double.doubleToLongBits(d) +
            FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static double dMeth() {

        int i11=-13315;
        int i12=-14;
        int i13=10;
        int[] iArr1 =new int[N];
        double d2=-2.7159;
        long l3=-203L;
        long[][] lArr =new long[N][N];

        FuzzerUtils.init(lArr, 3300328724L);
        FuzzerUtils.init(iArr1, -8);

        iMeth(i11, 23477L, -1);
        i12 = 1;
        do {
            float f1=-114.53F;
            i11 = 159;
            Test0280.instanceCount = -58;
            lArr[i12 - 1][i12 - 1] = i12;
            lArr[i12 + 1][i12] *= i11;
            i11 -= i12;
            i11 *= i12;
            Test0280.instanceCount = i11;
            d2 += f1;
            for (l3 = 1; l3 < 6; ++l3) {
                iArr1[(int)(l3 + 1)] += i12;
                if (Test0280.bFld) {
                    f1 += l3;
                    if (true) break;
                }
            }
        } while (++i12 < 270);
        long meth_res = i11 + i12 + Double.doubleToLongBits(d2) + l3 + i13 + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr1);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static boolean bMeth(int i10) {

        double d1=13.73515;
        int i14=-62254;
        int i15=-62810;
        int i16=-17210;
        int i17=11;
        int i18=-12;
        int i19=6;
        int[][] iArr2 =new int[N][N];

        FuzzerUtils.init(iArr2, 9521);

        d1 *= dMeth();
        iArr2[(i10 >>> 1) % N][(i10 >>> 1) % N] -= (int) Test0280.instanceCount;
        for (i14 = 5; i14 < 281; i14++) {
            Test0280.fFld += i14;
            for (i16 = 1; i16 < 6; ++i16) {
                switch (((46142 >>> 1) % 2) + 124) {
                case 124:
                    i15 = (int) Test0280.instanceCount;
                    i15 *= -78;
                    iArr2[i14 + 1][i14 + 1] = (int) Test0280.instanceCount;
                    for (i18 = 1; i18 < 2; ++i18) {
                        i10 *= i10;
                        Test0280.bFld = Test0280.bFld;
                        i17 = i14;
                        Test0280.instanceCount += (long) d1;
                        iArr2[i18][i14] >>>= (int)-6L;
                    }
                    break;
                case 125:
                    Test0280.lFld += i19;
                default:
                    iArr2[i14 + 1][i14] = i15;
                }
            }
        }
        long meth_res = i10 + Double.doubleToLongBits(d1) + i14 + i15 + i16 + i17 + i18 + i19 +
            FuzzerUtils.checkSum(iArr2);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public void mainTest(String[] strArr1) {

        int i1=-38;
        int i8=-3;
        int i9=-10;
        int i20=6;
        int i21=27240;
        int i22=82;
        int i23=75;
        int i24=0;
        int i25=-4;
        int[] iArr3 =new int[N];

        FuzzerUtils.init(iArr3, 31950);

        for (int smallinvoc = 0; smallinvoc < 630; smallinvoc++)
            vSmallMeth(++Test0280.instanceCount, ((i1 + i1) - iMeth(i1,
                    Test0280.instanceCount, i1)) / ((Test0280.byFld - (i1 + 4)) | 1));
        for (i8 = 10; 200 > i8; i8++) {
            bMeth(i1);
            Test0280.lFld >>>= Test0280.lFld;
            for (i20 = 5; 132 > i20; ++i20) {
                Test0280.fFld = Test0280.sFld;
                switch (((i20 % 1) * 5) + 41) {
                case 45:
                    i21 *= -13;
                    Test0280.sFld += (short) (((i20 * i1) + Test0280.lFld) - Test0280.byFld);
                    Test0280.dArrFld = Test0280.dArrFld;
                    break;
                default:
                    i1 += (i20 * i8);
                    i21 = (int)2595691806770532079L;
                }
                if (Test0280.bFld) continue;
                i9 = i20;
                Test0280.instanceCount += i20;
                i21 = i1;
                Test0280.bArrFld[i8 - 1] = Test0280.bFld;
                i21 += (i20 - i21);
                iArr3[i8] *= 26;
                i22 = 1;
                do {
                    i21 = i9;
                } while (++i22 < 2);
            }
            i23 = 1;
            do {
                iArr3[i23] = -178;
                Test0280.lFld += (i23 | i23);
                i24 = 1;
                do {
                    Test0280.lFld = i24;
                    i9 = i1;
                    i9 -= (int) Test0280.instanceCount;
                    i1 += (int) Test0280.lFld;
                    Test0280.lFld <<= i25;
                } while (++i24 < 1);
            } while (++i23 < 132);
        }

        FuzzerUtils.out.println("i1 i8 i9 = " + i1 + "," + i8 + "," + i9);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("iArr3 = " + FuzzerUtils.checkSum(iArr3));

        FuzzerUtils.out.println("Test0280.instanceCount Test0280.bFld Test0280.byFld = " + Test0280.instanceCount + "," + (Test0280.bFld ?
                1 : 0) + "," + Test0280.byFld);
        FuzzerUtils.out.println("Test0280.fFld Test0280.lFld Test0280.sFld = " + Float.floatToIntBits(Test0280.fFld) + "," + Test0280.lFld
                + "," + Test0280.sFld);
        FuzzerUtils.out.println("Test0280.dArrFld Test0280.bArrFld = " +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0280.dArrFld)) + "," + FuzzerUtils.checkSum(Test0280.bArrFld));

        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0280 _instance = new Test0280();
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test iMeth dMeth bMeth
//DEBUG  iMeth ->  iMeth mainTest dMeth bMeth
//DEBUG  bMeth ->  bMeth mainTest
//DEBUG  dMeth ->  dMeth bMeth mainTest
//DEBUG  Depth = 4
//DEBUG  Classes = 1
//DEBUG  static objects = {}
