// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:55 2023
public class Test0125 {

    public static final int N = 400;

    public static long instanceCount = -16502L;
    public static boolean bFld = false;
    public static int[] iArrFld = new int[N];
    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0125.iArrFld, -8);
    }

    public byte byFld = -115;
    public int iFld = -6;
    public volatile short sFld = -27274;

    public static long lMeth(int i2, int i3, int i4) {

        short s = 12886;
        float f = -49.63F;

        s = (short) (++f);
        long meth_res = i2 + i3 + i4 + s + Float.floatToIntBits(f);
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0125 _instance = new Test0125();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public int iMeth1(int i12, double d2) {

        int i13 = 14767, i14 = 19307, i15 = 230, i16 = 74, i17 = -8, i18 = -83;
        float f3 = 1.661F;

        Test0125.iArrFld[(i12 >>> 1) % N] = -162;
        for (i13 = 15; 292 > i13; i13++) {
            for (i15 = 1; i15 < 6; ++i15) {
                i14 += i16;
                i14 = i14;
                iFld = -63;
                Test0125.instanceCount *= i12;
                f3 -= i14;
                sFld <<= (short) i14;
                i12 += i14;
            }
            if (Test0125.bFld) break;
            i12 = (int) 5012560638270853745L;
            for (i17 = 1; i17 < 6; i17++) {
                i14 = 13733;
                byFld *= (byte) iFld;
            }
        }
        long meth_res = i12 + Double.doubleToLongBits(d2) + i13 + i14 + i15 + i16 + Float.floatToIntBits(f3) + i17 +
                i18;
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public float fMeth(float f2, int i8) {

        int i9 = 14, i10 = 157, i11 = 5, i19 = -40398, i20 = 21707;
        double d1 = 121.25907;
        long l1 = -2537884060L;
        long[][] lArr1 = new long[N][N];

        FuzzerUtils.init(lArr1, -8931L);

        for (i9 = 6; 293 > i9; ++i9) {
            for (d1 = i9; 6 > d1; d1++) {
                f2 += (float) (((d1 * i11) + i8) - Test0125.instanceCount);
                iFld = ((iMeth1(i9, d1) * i8) - -11);
                Test0125.instanceCount -= Test0125.instanceCount;
            }
            lArr1 = lArr1;
            for (i19 = 1; i19 < 6; i19++) {
                double d3 = 73.12246;
                int i21 = -8;
                lArr1[i19 - 1][i9 + 1] &= iFld;
                d3 -= i11;
                i20 = i11;
                lArr1[i9 + 1][i9 + 1] = -254;
                i21 -= (int) -4720168369443095356L;
                Test0125.iArrFld[i19] -= (int) l1;
            }
            i10 += (i9 | (long) f2);
            i10 >>= byFld;
        }
        long meth_res = Float.floatToIntBits(f2) + i8 + i9 + i10 + Double.doubleToLongBits(d1) + i11 + i19 + i20 + l1 +
                FuzzerUtils.checkSum(lArr1);
        fMeth_check_sum += meth_res;
        return (float) meth_res;
    }

    public int iMeth(long l) {

        int i5 = 10;
        int i6 = -2;
        int i7 = -40733;
        int i22 = 0;
        int i23 = 207;
        int i24 = -65;
        int i25 = 6;
        int i26 = -34;
        int i27 = -136;
        int[] iArr = new int[N];
        short s1 = -17044;
        float f1 = 0.742F;
        float[] fArr = new float[N];
        long[] lArr = new long[N];

        FuzzerUtils.init(fArr, 0.637F);
        FuzzerUtils.init(iArr, 14);
        FuzzerUtils.init(lArr, -4L);

        i5 = (int) (((++s1) - Math.abs(f1)) * ((--Test0125.instanceCount) - (i5 + f1)));
        fArr[(i6 >>> 1) % N] -= (((l = (long) -1.428F) + iArr[(i7 >>> 1) % N]) - (lArr[(i7 >>> 1) % N]--));
        iArr[(i5 >>> 1) % N] = (int) ((fMeth(f1, 30093) * iFld) - i6);
        i5 += iFld;
        for (i22 = 13; i22 < 327; i22++) {
            Test0125.iArrFld[i22] = i6;
            i6 *= i7;
            for (i24 = i22; 5 > i24; i24++) {
                Test0125.iArrFld[i24 - 1] += -3852;
                for (i26 = 1; i26 < 1; ++i26) {
                    i27 = 65;
                    if (Test0125.bFld) continue;
                    byFld -= (byte) 12;
                    l = l;
                    if (Test0125.bFld) break;
                }
            }
        }
        long meth_res = l + i5 + s1 + Float.floatToIntBits(f1) + i6 + i7 + i22 + i23 + i24 + i25 + i26 + i27 +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr) +
                FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i = 2, i1 = 9, i28 = -14, i29 = -151;
        double d = -1.103152;
        double[] dArr = new double[N];
        float f4 = -15.294F;
        float[] fArr1 = new float[N];

        FuzzerUtils.init(dArr, 28.76772);
        FuzzerUtils.init(fArr1, 73.324F);

        for (i = 5; i < 299; ++i) {
            i1 >>>= ((-(i1--)) % (Math.abs((int) (d - i1)) | 1));
            Test0125.instanceCount = Test0125.instanceCount;
            switch ((i % 4) + 66) {
                case 66:
                    byFld = (byte) ((lMeth(i, i1, i) - iMeth(Test0125.instanceCount)) / (Test0125.instanceCount | 1));
                    i1 += (((i * Test0125.instanceCount) + iFld) - iFld);
                    i1 -= -20102;
                    break;
                case 67:
                    f4 -= iFld;
                    break;
                case 68:
                    Test0125.iArrFld[i] = i;
                    i1 = i1;
                    i28 = 1;
                    do {
                        iFld >>= i28;
                        i1 -= i1;
                        dArr = FuzzerUtils.double1array(N, (double) 2.27304);
                        Test0125.instanceCount += (i28 * i28);
                        i29 = 1;
                        do {
                            i1 += (i29 * i29);
                            fArr1[i28 - 1] -= -948545794876526695L;
                            switch ((i28 % 2) + 125) {
                                case 125:
                                    iFld += iFld;
                                    switch (((i28 % 5) * 5) + 99) {
                                        case 108:
                                            iFld += i29;
                                            Test0125.instanceCount = i1;
                                            Test0125.instanceCount += i;
                                            i1 += iFld;
                                            break;
                                        case 109:
                                            i1 += (((i29 * i1) + i28) - i28);
                                            iFld <<= i29;
                                            dArr[i + 1] += i28;
                                            break;
                                        case 116:
                                            Test0125.iArrFld[i29] += (int) f4;
                                            i1 += (int) Test0125.instanceCount;
                                        case 112:
                                            d = i1;
                                            break;
                                        case 114:
                                    }
                                case 126:
                                    fArr1 = FuzzerUtils.float1array(N, (float) 0.329F);
                                    break;
                            }
                        } while (++i29 < 1);
                    } while (++i28 < 86);
                    break;
                case 69:
                    iFld -= i;
                    break;
                default:
                    d -= i28;
            }
        }

        FuzzerUtils.out.println("i i1 d = " + i + "," + i1 + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("f4 i28 i29 = " + Float.floatToIntBits(f4) + "," + i28 + "," + i29);
        FuzzerUtils.out.println("dArr fArr1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));

        FuzzerUtils.out.println("Test0125.instanceCount byFld iFld = " + Test0125.instanceCount + "," + byFld + "," + iFld);
        FuzzerUtils.out.println("sFld Test0125.bFld Test0125.iArrFld = " + sFld + "," + (Test0125.bFld ? 1 : 0) + "," +
                FuzzerUtils.checkSum(Test0125.iArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  fMeth ->  fMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 fMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
