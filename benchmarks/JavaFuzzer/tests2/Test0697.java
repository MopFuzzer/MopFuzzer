// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:44 2023
public class Test0697 {

    public static final int N = 400;

    public static long instanceCount=-8L;
    public static float fFld=2.847F;
    public static double dFld=1.93436;
    public static boolean bFld=false;
    public byte byFld=103;
    public long[] lArrFld =new long[N];
    public static long[] lArrFld1 =new long[N];
    public static int[] iArrFld =new int[N];
    public int[][] iArrFld1 =new int[N][N];

    static {
        FuzzerUtils.init(Test0697.lArrFld1, -2176188516L);
        FuzzerUtils.init(Test0697.iArrFld, 8);
    }

    public static long dMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i7, int i8) {

        int i9=-39;
        int i10=-57243;
        int i11=-220;
        int i12=9;
        int[][] iArr1 =new int[N][N];
        double d=1.106295;
        double[] dArr =new double[N];
        boolean b=false;

        FuzzerUtils.init(iArr1, -54572);
        FuzzerUtils.init(dArr, -18.94333);

        for (i9 = 1; 262 > i9; ++i9) {
            iArr1[i9][i9] /= (int) (Test0697.instanceCount | 1);
            dArr[i9 - 1] -= 11866;
            for (i11 = 1; i11 < 6; ++i11) {
                int i13=-4;
                Test0697.instanceCount |= -3281L;
                Test0697.instanceCount += (i11 * i10);
                d -= d;
                if (b) {
                    iArr1[i9 - 1][i9 - 1] = i7;
                    Test0697.instanceCount = -8;
                    i10 += (-24473 + (i11 * i11));
                    d *= Test0697.instanceCount;
                }
                i8 += (-160 + (i11 * i11));
                i13 = -6;
                Test0697.instanceCount -= i7;
            }
        }
        long meth_res = i7 + i8 + i9 + i10 + i11 + i12 + Double.doubleToLongBits(d) + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i4) {

        int i5=-772;
        int i6=254;
        int i14=0;
        int i15=59904;
        int i16=-12;
        int i17=-149;
        int i18=62583;
        int i19=-2;
        int[] iArr =new int[N];
        byte by2=55;

        FuzzerUtils.init(iArr, 88);

        for (i5 = 7; 121 > i5; i5++) {
            switch ((i5 % 5) + 103) {
            case 103:
                i6 <<= (int) (Float.intBitsToFloat(iArr[i5]--) + (Test0697.lArrFld1[(10 >>> 1) % N]--));
                break;
            case 104:
                iMeth(i5, i6);
                for (i14 = 1; i14 < 14; i14++) {
                    for (i16 = 1; i16 < 2; ++i16) {
                        byte by1=-113;
                        by1 += (byte)(i16 | i16);
                        iArr[i16 + 1] = i14;
                        i4 += (i16 + Test0697.fFld);
                    }
                    for (i18 = 1; i18 < 2; i18++) {
                        if (false) break;
                        i19 >>= i15;
                        iArr[i5 - 1] += i16;
                        if (true) continue;
                        try {
                            i19 = (iArr[i14 + 1] / i4);
                            i15 = (i5 / iArr[i5 + 1]);
                            iArr[i5 - 1] = (iArr[i14 + 1] / 7159);
                        } catch (ArithmeticException a_e) {}
                    }
                }
                break;
            case 105:
                i15 = (int) Test0697.fFld;
            case 106:
                Test0697.dFld += by2;
                break;
            case 107:
                i6 <<= i4;
                break;
            }
        }
        vMeth_check_sum += i4 + i5 + i6 + i14 + i15 + i16 + i17 + i18 + i19 + by2 + FuzzerUtils.checkSum(iArr);
    }

    public static double dMeth() {

        long l=-61383L, l1=-23L;
        int i2=-41042, i3=-2, i20=-6;
        byte by=127;
        short s=17640;
        boolean b1=true;

        for (l = 6; l < 152; l++) {
            float f=-2.524F;
            by >>>= (byte)(i2 - ((f++) * Math.min(i2, i2)));
            for (l1 = l; l1 < 11; l1++) {
                s += (short)(10 + (l1 * l1));
                vMeth(i3);
                i20 = 1;
                while (++i20 < 1) {
                    i3 -= (int)1.809F;
                    Test0697.dFld = i3;
                    s *= (short) Test0697.dFld;
                    i2 >>= (int)l;
                    switch ((int)((l1 % 10) + 31)) {
                    case 31:
                        Test0697.iArrFld[(int) (l1 + 1)] += i2;
                        Test0697.lArrFld1[(int) (l)] >>= s;
                        Test0697.dFld -= 0.372F;
                        try {
                            i2 = (-212 % Test0697.iArrFld[(int) (l1 + 1)]);
                            i2 = (1985391303 % i2);
                            i2 = (i20 % i20);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 32:
                    case 33:
                        Test0697.fFld = i3;
                        break;
                    case 34:
                        i2 += (i20 * i20);
                    case 35:
                        Test0697.fFld *= Test0697.fFld;
                        break;
                    case 36:
                        i3 += (i20 * i20);
                    case 37:
                        i3 = (int) Test0697.fFld;
                        break;
                    case 38:
                    case 39:
                        i3 >>>= i2;
                        break;
                    case 40:
                        if (b1) continue;
                        break;
                    default:
                        if (b1) break;
                    }
                }
            }
        }
        long meth_res = l + i2 + by + l1 + i3 + s + i20 + (b1 ? 1 : 0);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-60248, i1=-12, i21=-16845, i22=-35224, i23=9, i24=-117, i25=-9, i26=33628, i27=167, i28=5, i29=10, i30=7;
        double d1=2.98203;
        long l2=-9L;
        short s1=5005;
        float[] fArr =new float[N];

        FuzzerUtils.init(fArr, 1.230F);

        for (i = 1; 273 > i; ++i) {
            Test0697.instanceCount += (i1++);
            lArrFld[i + 1] *= (long) ((++i1) + (dMeth() + Test0697.fFld));
            i1 -= i1;
            for (d1 = 92; d1 > 2; d1--) {
                for (i22 = 1; i22 < 2; i22++) {
                    Test0697.bFld = Test0697.bFld;
                    if (false) continue;
                }
            }
        }
        for (l2 = 11; 191 > l2; ++l2) {
            byFld += (byte)-10;
            Test0697.fFld = l2;
            for (i25 = 7; 139 > i25; ++i25) {
                Test0697.iArrFld[i25 + 1] += (int) 0L;
                Test0697.fFld -= (float) Test0697.dFld;
            }
            switch ((int)((l2 % 2) + 62)) {
            case 62:
                i1 &= s1;
                Test0697.instanceCount += i21;
                iArrFld1 = iArrFld1;
                break;
            case 63:
                try {
                    i26 = (i / i1);
                    i23 = (193 % i21);
                    i24 = (i22 % i21);
                } catch (ArithmeticException a_e) {}
                for (i27 = 1; i27 < 139; ++i27) {
                    Test0697.bFld = Test0697.bFld;
                    for (i29 = 1; i29 < 2; i29++) {
                        Test0697.instanceCount += i24;
                        i30 = i30;
                        Test0697.instanceCount -= i21;
                        iArrFld1[i27 - 1][i27 + 1] *= (int)1.947F;
                        i23 += (int)d1;
                        Test0697.dFld += i1;
                        fArr[i29] -= i29;
                        Test0697.instanceCount -= i;
                    }
                }
                break;
            default:
                if (Test0697.bFld) continue;
            }
        }

        FuzzerUtils.out.println("i i1 d1 = " + i + "," + i1 + "," + Double.doubleToLongBits(d1));
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("l2 i24 i25 = " + l2 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 s1 i27 = " + i26 + "," + s1 + "," + i27);
        FuzzerUtils.out.println("i28 i29 i30 = " + i28 + "," + i29 + "," + i30);
        FuzzerUtils.out.println("fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test0697.instanceCount Test0697.fFld Test0697.dFld = " + Test0697.instanceCount + "," +
                Float.floatToIntBits(Test0697.fFld) + "," + Double.doubleToLongBits(Test0697.dFld));
        FuzzerUtils.out.println("Test0697.bFld byFld lArrFld = " + (Test0697.bFld ? 1 : 0) + "," + byFld + "," +
            FuzzerUtils.checkSum(lArrFld));
        FuzzerUtils.out.println("Test0697.lArrFld1 Test0697.iArrFld iArrFld1 = " + FuzzerUtils.checkSum(Test0697.lArrFld1) + "," +
                FuzzerUtils.checkSum(Test0697.iArrFld) + "," + FuzzerUtils.checkSum(iArrFld1));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0697 _instance = new Test0697();
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
//DEBUG  dMeth ->  dMeth mainTest
//DEBUG  vMeth ->  vMeth dMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth dMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}