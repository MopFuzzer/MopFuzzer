// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:57 2023
public class Test0968 {

    public static final int N = 400;

    public static long instanceCount=-647177014856272603L;
    public int iFld=61149;
    public static float fFld=1.584F;
    public double dFld=-2.13452;
    public short sFld=4272;
    public static int[][] iArrFld =new int[N][N];
    public static long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test0968.iArrFld, 0);
        FuzzerUtils.init(Test0968.lArrFld, -41995L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public void vMeth(long l) {

        float f=-32.1019F;
        int i2=-6;
        int i3=3;
        int[] iArr =new int[N];

        FuzzerUtils.init(iArr, 35);

        iFld += (int)((-iFld) * ((f++) - -43071));
        for (i2 = 17; i2 < 290; ++i2) {
            try {
                iFld = (iArr[i2] / i3);
                i3 = (i3 / iFld);
                iFld = (51012 % i3);
            } catch (ArithmeticException a_e) {}
            l -= (long)(--f);
            i3 += i2;
        }
        vMeth_check_sum += l + Float.floatToIntBits(f) + i2 + i3 + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(int i11, int i12, int i13) {


        Test0968.fFld = i11;
        long meth_res = i11 + i12 + i13;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth2(int i6, short s) {

        int i7=-1, i8=-57, i9=-51253, i10=1;
        double d=93.19560;
        boolean b=false;
        short[] sArr =new short[N];
        long[] lArr =new long[N];

        FuzzerUtils.init(sArr, (short)19259);
        FuzzerUtils.init(lArr, -229L);

        for (short s1 : sArr) {
            for (i7 = 4; i7 > 1; --i7) {
                for (i9 = 1; i9 < 2; ++i9) {
                    d = i9;
                    Test0968.iArrFld[i9 - 1][i7] = (int) (((i10--) % ((i7 * -82L) | 1)) - ((i9 - i8) + iMeth(i10, i9, i10)));
                    Test0968.iArrFld[i9][i9] >>>= i10;
                    if (b) {
                        i8 -= i7;
                    } else {
                        Test0968.fFld += i9;
                        d -= i8;
                        Test0968.instanceCount >>= i8;
                        Test0968.fFld *= i8;
                    }
                    Test0968.instanceCount = 56;
                    if (b) continue;
                    lArr[i9] *= (long)-1.124998;
                }
            }
        }
        vMeth2_check_sum += i6 + s + i7 + i8 + i9 + i10 + Double.doubleToLongBits(d) + (b ? 1 : 0) +
            FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(lArr);
    }

    public void vMeth1(long l1) {

        int i4=-55163, i5=-8197, i14=29, i15=5, i16=53929, i17=14;
        short s2=-4713;
        double[] dArr =new double[N];
        long[] lArr1 =new long[N];

        FuzzerUtils.init(dArr, -2.69704);
        FuzzerUtils.init(lArr1, -749007556L);

        for (i4 = 9; 289 > i4; ++i4) {
            dArr[i4 + 1] -= i5;
            vMeth2(i4, s2);
            for (i14 = 1; i14 < 6; i14++) {
                iFld -= (int)5.155F;
                lArr1[i4] >>= -5844;
                i5 += i14;
                for (i16 = 2; i16 > 1; i16--) {
                    Test0968.iArrFld[i14][i4 - 1] -= i14;
                    i5 = i4;
                    if (true) continue;
                    Test0968.iArrFld[i16 + 1][i4 + 1] = (int) l1;
                    i15 = s2;
                }
                l1 >>= l1;
                Test0968.instanceCount -= i4;
            }
        }
        vMeth1_check_sum += l1 + i4 + i5 + s2 + i14 + i15 + i16 + i17 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(lArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=21260, i1=58245, i18=8, i19=-147, i20=50499, i21=-104;
        byte by=40;
        boolean b1=false;

        for (i = 10; i < 380; ++i) {
            vMeth(Test0968.instanceCount);
            vMeth1(Test0968.instanceCount);
            iFld = (int)-4920568512512695670L;
            Test0968.iArrFld[i][i] = 53;
            Test0968.iArrFld[i][i + 1] = (int) Test0968.fFld;
        }
        i1 = by;
        Test0968.iArrFld[(i1 >>> 1) % N][(i >>> 1) % N] = -55952;
        iFld += (int) Test0968.fFld;
        Test0968.lArrFld[(i >>> 1) % N] *= iFld;
        Test0968.iArrFld[(i >>> 1) % N][(-229 >>> 1) % N] += i1;
        for (i18 = 395; 13 < i18; i18--) {
            dFld *= i18;
            Test0968.fFld -= sFld;
            Test0968.fFld = Test0968.instanceCount;
            i20 = 1;
            do {
                dFld += -43.109656;
                i19 = iFld;
                Test0968.fFld *= Test0968.instanceCount;
                switch (((i18 % 8) * 5) + 92) {
                case 131:
                    i1 = (int) Test0968.instanceCount;
                    b1 = true;
                    try {
                        iFld = (-53635 / i1);
                        Test0968.iArrFld[i20 - 1][i20] = (26287 / i18);
                        i1 = (i18 / Test0968.iArrFld[(i20 >>> 1) % N][i18 + 1]);
                    } catch (ArithmeticException a_e) {}
                    i19 += (i20 + i18);
                case 115:
                case 105:
                    i1 = i20;
                    i21 = 1;
                    while (--i21 > 0) {
                        i1 = i1;
                        i1 = iFld;
                        i1 -= (int)1.38760;
                        Test0968.instanceCount += (((i21 * i21) + sFld) - Test0968.instanceCount);
                    }
                    break;
                case 117:
                    Test0968.instanceCount += (i20 * sFld);
                    break;
                case 102:
                    Test0968.instanceCount >>= iFld;
                    break;
                case 130:
                    Test0968.instanceCount -= 0L;
                case 120:
                    Test0968.instanceCount += by;
                    break;
                case 113:
                    by += (byte)251;
                    break;
                }
            } while (++i20 < 66);
        }

        FuzzerUtils.out.println("i i1 by = " + i + "," + i1 + "," + by);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("b1 i21 = " + (b1 ? 1 : 0) + "," + i21);

        FuzzerUtils.out.println("Test0968.instanceCount iFld Test0968.fFld = " + Test0968.instanceCount + "," + iFld + "," +
                Float.floatToIntBits(Test0968.fFld));
        FuzzerUtils.out.println("dFld sFld Test0968.iArrFld = " + Double.doubleToLongBits(dFld) + "," + sFld + "," +
                FuzzerUtils.checkSum(Test0968.iArrFld));
        FuzzerUtils.out.println("Test0968.lArrFld = " + FuzzerUtils.checkSum(Test0968.lArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0968 _instance = new Test0968();
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
//DEBUG  vMeth1 ->  vMeth1 mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 mainTest
//DEBUG  iMeth ->  iMeth vMeth2 vMeth1 mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
