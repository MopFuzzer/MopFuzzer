// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:38 2023
public class Test0560 {

    public static final int N = 400;

    public static long instanceCount=-6007740483537367967L;
    public static double dFld=-43.29041;
    public static short sFld=-18319;
    public static volatile int iFld=12;
    public static volatile float fFld=-107.97F;
    public static boolean bFld=false;
    public int[] iArrFld =new int[N];
    public short[] sArrFld =new short[N];
    public static float[][] fArrFld =new float[N][N];

    static {
        FuzzerUtils.init(Test0560.fArrFld, 1.583F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public long lMeth(int i3, int i4) {

        int i5=-251;
        int i6=11;
        int i7=-54233;
        int i8=-239;
        int i9=212;
        int i10=205;
        int[] iArr1 =new int[N];
        boolean b=true;
        float f=1.1011F;

        FuzzerUtils.init(iArr1, 12);

        for (i5 = 15; 245 > i5; i5++) {
            iArr1[i5] += (int) Test0560.instanceCount;
            if (b) break;
            if (i4 != 0) {
            }
        }
        i7 = 143;
        while ((i7 -= 2) > 0) {
            i3 = i5;
            for (i8 = 1; i8 < 21; i8++) {
                i4 = (int) Test0560.dFld;
            }
            Test0560.instanceCount &= Test0560.instanceCount;
            i6 = i7;
            f += i7;
            try {
                iArr1[i7 + 1] = (-240 % i6);
                i9 = (i9 / i8);
                i3 = (iArr1[i7] / i7);
            } catch (ArithmeticException a_e) {}
            i10 = 1;
            do {
                i3 += i10;
            } while (++i10 < 21);
        }
        i6 *= i8;
        long meth_res = i3 + i4 + i5 + i6 + (b ? 1 : 0) + i7 + i8 + i9 + Float.floatToIntBits(f) + i10 +
            FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void vMeth1() {

        int i2=-35753;
        int i11=140;
        int i12=6;
        int i13=-23;
        int i14=-10;
        int i15=-42506;
        int[] iArr =new int[N];
        double d=0.30963;
        boolean b1=false;

        FuzzerUtils.init(iArr, -143);

        iArr = (iArr = (iArr = (iArr = FuzzerUtils.int1array(N, (int)8))));
        Test0560.dFld -= (i2--);
        i2 -= (int)lMeth(-107, i2);
        for (d = 4; d < 296; ++d) {
            Test0560.instanceCount = 174;
            for (i12 = 6; i12 > d; i12 -= 3) {
                i2 += (i12 * Test0560.instanceCount);
                if (b1) break;
                iArr[(int)(d - 1)] = i13;
                for (i14 = 1; i14 < 1; ++i14) {
                    Test0560.dFld -= i12;
                    Test0560.instanceCount -= i11;
                    Test0560.instanceCount = i2;
                }
                Test0560.instanceCount -= (long) d;
                i13 += (i12 * i12);
            }
        }
        vMeth1_check_sum += i2 + Double.doubleToLongBits(d) + i11 + i12 + i13 + (b1 ? 1 : 0) + i14 + i15 +
            FuzzerUtils.checkSum(iArr);
    }

    public void vMeth(long l, int i, int i1) {

        int i17=-14;
        int i18=13;
        int i19=10725;
        int[] iArr2 =new int[N];
        byte by=108;
        short s=9733;
        double[] dArr =new double[N];

        FuzzerUtils.init(dArr, 2.72813);
        FuzzerUtils.init(iArr2, -55910);

        vMeth1();
        dArr[(13 >>> 1) % N] += Test0560.instanceCount;
        Test0560.dFld %= (i | 1);
        for (int i16 : iArr2) {
            i17 = 1;
            while (++i17 < 4) {
                i1 += (i17 | by);
                i16 *= 39970;
                for (i18 = 1; i18 < 1; i18 += 3) {
                    l <<= -12108;
                    i16 = -79;
                    i19 = i1;
                    i19 <<= i18;
                    l = i;
                    i16 += i19;
                    l += (((i18 * s) + i) - i18);
                }
            }
        }
        vMeth_check_sum += l + i + i1 + i17 + by + i18 + i19 + s + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr))
            + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i20=-57235, i21=-13504, i22=16, i23=184, i24=-32204, i25=-6, i26=-169, i27=-8, i28=13, i29=-13, i30=201,
            i31=-41470, i32=52205;
        boolean b2=true;

        vMeth(Test0560.instanceCount, i20, i20);
        i20 = 17003;
        iArrFld[(45302 >>> 1) % N] >>= Test0560.sFld;
        Test0560.iFld >>= Test0560.iFld;
        for (i21 = 10; 179 > i21; i21++) {
            Test0560.iFld *= i20;
            Test0560.iFld += (((i21 * Test0560.fFld) + i21) - i20);
            for (i23 = i21; i23 < 148; i23++) {
                i24 += i24;
                sArrFld[i21 + 1] += (short) Test0560.iFld;
                i22 -= (int) Test0560.fFld;
            }
            for (i25 = 7; 148 > i25; ++i25) {
                Test0560.iFld = i26;
                for (i27 = 2; i27 > 1; i27--) {
                    iArrFld[i21 - 1] *= (int)1956L;
                    i28 = i26;
                    i22 += i27;
                }
                i28 = -26660;
                i28 %= (int)(i20 | 1);
                Test0560.fFld += (i25 * i25);
                Test0560.dFld += 4L;
            }
            Test0560.bFld = Test0560.bFld;
            if (false) {
                for (i29 = 6; i29 < 148; ++i29) {
                    Test0560.dFld = i20;
                }
                Test0560.fArrFld[i21 + 1][i21] += Test0560.sFld;
            } else if (true) {
                for (i31 = i21; 148 > i31; ++i31) {
                    Test0560.fArrFld[i31][i31 + 1] = i23;
                    Test0560.instanceCount += i31;
                    if (b2) continue;
                }
            } else {
                i22 = -56988;
            }
        }

        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 i27 i28 = " + i26 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("i29 i30 i31 = " + i29 + "," + i30 + "," + i31);
        FuzzerUtils.out.println("i32 b2 = " + i32 + "," + (b2 ? 1 : 0));

        FuzzerUtils.out.println("Test0560.instanceCount Test0560.dFld Test0560.sFld = " + Test0560.instanceCount + "," +
                Double.doubleToLongBits(Test0560.dFld) + "," + Test0560.sFld);
        FuzzerUtils.out.println("Test0560.iFld Test0560.fFld Test0560.bFld = " + Test0560.iFld + "," + Float.floatToIntBits(Test0560.fFld)
                + "," + (Test0560.bFld ? 1 : 0));
        FuzzerUtils.out.println("iArrFld sArrFld Test0560.fArrFld = " + FuzzerUtils.checkSum(iArrFld) + "," +
                FuzzerUtils.checkSum(sArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0560.fArrFld)));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0560 _instance = new Test0560();
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
//DEBUG  lMeth ->  lMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
