// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:59 2023
public class Test0994 {

    public static final int N = 400;

    public static long instanceCount=3L;
    public int iFld=36963;
    public volatile byte byFld=87;
    public static float fFld=-27.776F;
    public static int iFld1=47824;
    public static byte byFld1=-113;

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        boolean b=false;
        int i6=22757;
        int i7=7;
        int i8=91;
        int[] iArr =new int[N];
        float f3=1.536F;

        FuzzerUtils.init(iArr, 55832);

        for (int i5 : iArr) {
            float f2=-1.167F;
            i5 = i5;
            f2 = i5;
            Test0994.instanceCount = i5;
            if (b) continue;
            for (i6 = 1; i6 < 4; ++i6) {
                f2 -= Test0994.instanceCount;
                i5 <<= i5;
            }
        }
        Test0994.instanceCount -= -93L;
        i8 = 250;
        while ((i8 -= 3) > 0) {
            i7 += (((i8 * Test0994.instanceCount) + i8) - f3);
            i7 += (179 + (i8 * i8));
            if (false) {
                try {
                    i7 = (iArr[i8 - 1] / i8);
                    i7 = (116 % i6);
                    iArr[i8 + 1] = (2 % i8);
                } catch (ArithmeticException a_e) {}
                iArr[i8 + 1] = -131;
            }
        }
        long meth_res = (b ? 1 : 0) + i6 + i7 + i8 + Float.floatToIntBits(f3) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(long l1, double d, long l2) {

        int i2=-118;
        int i3=40159;
        int i4=212;
        int i10=6;
        int i11=-94;
        int i12=-27862;
        int i13=-114;
        int i14=-2651;
        int[] iArr1 =new int[N];
        float f=1.326F, f1=1.579F;
        byte by=-124;
        byte[][] byArr =new byte[N][N];
        boolean b1=false;

        FuzzerUtils.init(iArr1, 13);
        FuzzerUtils.init(byArr, (byte)-44);

        for (i2 = 6; i2 < 130; ++i2) {
            for (f = 1; f < 13; ++f) {
                l1 += (long)(((22.524F * (i2 % (i2 | 1))) - -4) + l1);
            }
            f1 -= (iMeth() - 469939813L);
            for (i10 = 1; 13 > i10; ++i10) {
                i11 -= i2;
                iArr1[i2] = 17049;
                byArr[i2 - 1][i10 - 1] = (byte)-87;
                for (i12 = i2; i12 < 2; i12++) {
                    if (i14 != 0) {
                        vMeth_check_sum += l1 + Double.doubleToLongBits(d) + l2 + i2 + i3 + Float.floatToIntBits(f) +
                            i4 + Float.floatToIntBits(f1) + i10 + i11 + i12 + i13 + i14 + by + (b1 ? 1 : 0) +
                            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(byArr);
                        return;
                    }
                    if (b1) {
                        i13 *= 2;
                        f1 -= by;
                        vMeth_check_sum += l1 + Double.doubleToLongBits(d) + l2 + i2 + i3 + Float.floatToIntBits(f) +
                            i4 + Float.floatToIntBits(f1) + i10 + i11 + i12 + i13 + i14 + by + (b1 ? 1 : 0) +
                            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(byArr);
                        return;
                    } else {
                        Test0994.instanceCount |= Test0994.instanceCount;
                        i3 = i3;
                    }
                }
            }
        }
        vMeth_check_sum += l1 + Double.doubleToLongBits(d) + l2 + i2 + i3 + Float.floatToIntBits(f) + i4 +
            Float.floatToIntBits(f1) + i10 + i11 + i12 + i13 + i14 + by + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(byArr);
    }

    public static void vSmallMeth(int i, long l, int i1) {

        double d1=2.30663;

        vMeth(Test0994.instanceCount, d1, Test0994.instanceCount);
        vSmallMeth_check_sum += i + l + i1 + Double.doubleToLongBits(d1);
    }

    public void mainTest(String[] strArr1) {

        int i15=-226;
        int i16=34;
        int i17=0;
        int i18=-149;
        int i19=198;
        int i20=-145;
        int i21=-118;
        int i22=43207;
        int i23=-53986;
        int i24=21507;
        int i25=-48876;
        int[] iArr2 =new int[N];
        short s=6072;
        boolean b2=true;
        double d2=2.48;
        double d3=85.80562;
        double[] dArr =new double[N];
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -1L);
        FuzzerUtils.init(iArr2, -55252);
        FuzzerUtils.init(dArr, 0.67422);

        for (int smallinvoc = 0; smallinvoc < 568; smallinvoc++) vSmallMeth(iFld, Test0994.instanceCount, iFld);
        try {
            for (i15 = 377; 7 < i15; i15 -= 2) {
                byFld <<= (byte) Test0994.instanceCount;
                for (i17 = i15; i17 < 136; i17++) {
                    lArr[i15] >>= i17;
                    s = (short)i17;
                    for (i19 = 1; i19 < 1; i19++) {
                        i18 += (((i19 * i18) + Test0994.instanceCount) - i17);
                        i18 += (((i19 * i19) + Test0994.fFld) - Test0994.iFld1);
                        i20 = -137;
                        b2 = b2;
                    }
                    i18 += Test0994.iFld1;
                }
                Test0994.iFld1 += (int) Test0994.instanceCount;
                if (b2) {
                    Test0994.iFld1 += 197;
                }
                for (d2 = 6; d2 < 136; d2++) {
                    iFld = Test0994.byFld1;
                    iArr2[(int)(d2 - 1)] >>>= i17;
                    i16 += (int) (d2 - Test0994.byFld1);
                    iArr2[(int) (d2 - 1)] <<= (int) Test0994.instanceCount;
                    iArr2[i15] ^= i20;
                    iArr2[(int) (d2)] = (int) Test0994.instanceCount;
                }
                i16 = i19;
                for (i22 = 3; 136 > i22; ++i22) {
                    i20 >>= i17;
                    lArr[i22 + 1] += 5;
                    for (i24 = 1; 2 > i24; ++i24) {
                        i23 = Test0994.iFld1;
                        s += (short)(i24 ^ i20);
                    }
                }
            }
        }
        catch (NullPointerException exc1) {
            d3 = Test0994.fFld;
        }
        finally {
            byFld = (byte)188;
        }

        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 s i19 = " + i18 + "," + s + "," + i19);
        FuzzerUtils.out.println("i20 b2 d2 = " + i20 + "," + (b2 ? 1 : 0) + "," + Double.doubleToLongBits(d2));
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 d3 = " + i24 + "," + i25 + "," + Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("lArr iArr2 dArr = " + FuzzerUtils.checkSum(lArr) + "," + FuzzerUtils.checkSum(iArr2) +
            "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test0994.instanceCount iFld byFld = " + Test0994.instanceCount + "," + iFld + "," + byFld);
        FuzzerUtils.out.println("Test0994.fFld Test0994.iFld1 Test0994.byFld1 = " + Float.floatToIntBits(Test0994.fFld) + "," +
                Test0994.iFld1 + "," + Test0994.byFld1);

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0994 _instance = new Test0994();
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
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  iMeth ->  iMeth vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
