// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:15 2023
public class Test0863 {

    public static final int N = 400;

    public static long instanceCount = 37881L;
    public static float fFld = -70.345F;
    public static double dFld = -1.120;
    public static boolean bFld = true;
    public static int[] iArrFld = new int[N];
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0863.iArrFld, -9588);
    }

    public int iFld = 211;
    public short sFld = -980;
    public byte byFld = -102;

    public static void vMeth1(int i5, int i6) {

        int i7 = -5, i8 = 4, i9 = -14;
        boolean b = true;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, 17277L);

        if (b) {
            i7 = 1;
            while (++i7 < 121) {
                for (i8 = 1; i8 < 13; ++i8) {
                    Test0863.fFld = i6;
                    i9 += (i8 * i8);
                    Test0863.instanceCount >>= -29;
                    i6 ^= 252;
                    Test0863.instanceCount -= i7;
                }
                i9 += i7;
                i6 *= 165;
                i9 -= (int) Test0863.fFld;
            }
        } else {
            Test0863.instanceCount = 12912;
            vMeth1_check_sum += i5 + i6 + i7 + i8 + i9 + (b ? 1 : 0) + FuzzerUtils.checkSum(lArr);
            return;
        }
        i9 -= (int) Test0863.dFld;
        lArr[(i5 >>> 1) % N] -= (long) 2.197F;
        Test0863.fFld -= Test0863.instanceCount;
        vMeth1_check_sum += i5 + i6 + i7 + i8 + i9 + (b ? 1 : 0) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(int i4, double d) {

        int i10 = 22541, i11 = -15615, i12 = 13, i13 = 9, i14 = -10, i15 = 4, i16 = 53516, i17 = -28;
        short s1 = 9720;
        boolean b1 = false;

        vMeth1(i4, i4);
        for (i10 = 22; i10 < 353; i10++) {
            i11 += (((i10 * Test0863.instanceCount) + Test0863.instanceCount) - Test0863.instanceCount);
            for (i12 = i10; 5 > i12; i12++) {
                Test0863.fFld -= i13;
            }
            i13 >>= 11;
            for (i14 = 1; i14 < 5; ++i14) {
                Test0863.fFld += (i14 * i14);
                s1 = (short) i13;
                b1 = b1;
                for (i16 = 1; 2 > i16; i16++) {
                    i17 += 227;
                }
                if (b1) break;
            }
            Test0863.fFld += (float) Test0863.dFld;
            Test0863.fFld += i11;
        }
        vMeth_check_sum += i4 + Double.doubleToLongBits(d) + i10 + i11 + i12 + i13 + i14 + i15 + s1 + (b1 ? 1 : 0) +
                i16 + i17;
    }

    public static int iMeth(int i, int i1, short s) {

        int i2 = -142;
        int i3 = 17071;
        int i18 = -43063;
        int i19 = 4;
        int i20 = 2;
        int i21 = -11816;
        int[][] iArr = new int[N][N];
        boolean b2 = false;
        long l = -3225785364475929465L;
        float[] fArr = new float[N];

        FuzzerUtils.init(fArr, -20.473F);
        FuzzerUtils.init(iArr, 20228);

        for (i2 = 13; 289 > i2; i2++) {
            i <<= -195;
            vMeth(i3, Test0863.dFld);
            i3 += i1;
            if (b2) break;
            i1 += i3;
            Test0863.fFld -= i1;
            for (i18 = i2; i18 < 6; i18++) {
                fArr[i18] *= i;
                for (i20 = i18; i20 < 1; ++i20) {
                    i -= (int) l;
                    if (i != 0) {
                    }
                    iArr = iArr;
                    iArr[i20][i2] = i;
                    i21 = i19;
                }
            }
        }
        long meth_res = i + i1 + s + i2 + i3 + (b2 ? 1 : 0) + i18 + i19 + i20 + i21 + l +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0863 _instance = new Test0863();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        float f = -113.651F;
        int i22 = 11, i23 = -187, i24 = 23627, i25 = -13, i26 = 110, i27 = -6, i28 = -44481;
        long[] lArr1 = new long[N];

        FuzzerUtils.init(lArr1, 4214443978L);

        iFld = (iMeth(iFld, 166, sFld) - iFld);
        iFld ^= iFld;
        sFld = (short) -234;
        f = 1;
        while (++f < 172) {
            for (i22 = 146; i22 > 9; --i22) {
                Test0863.dFld -= Test0863.instanceCount;
                iFld += i22;
                Test0863.fFld += (i22 - Test0863.instanceCount);
                i23 -= -39;
                iFld += -215;
            }
            i23 -= 8770;
        }
        i24 = 1;
        while (++i24 < 226) {
            iFld += (i24 * i24);
            for (i25 = i24; 111 > i25; i25++) {
                i26 <<= i22;
                byFld += (byte) i24;
                Test0863.instanceCount += i23;
                iFld = (int) Test0863.instanceCount;
            }
            Test0863.iArrFld[i24 - 1] <<= 164;
            if (Test0863.bFld) break;
            lArr1[i24 + 1] += i22;
            i26 += i24;
            Test0863.bFld = Test0863.bFld;
            Test0863.dFld = i26;
        }
        i23 &= i22;
        for (i27 = 14; i27 < 256; i27++) {
            Test0863.dFld -= i27;
            Test0863.iArrFld[i27 + 1] -= i22;
            i23 += (int) Test0863.instanceCount;
            Test0863.dFld = i23;
        }

        FuzzerUtils.out.println("f i22 i23 = " + Float.floatToIntBits(f) + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 i28 lArr1 = " + i27 + "," + i28 + "," + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test0863.instanceCount iFld Test0863.fFld = " + Test0863.instanceCount + "," + iFld + "," +
                Float.floatToIntBits(Test0863.fFld));
        FuzzerUtils.out.println("Test0863.dFld sFld byFld = " + Double.doubleToLongBits(Test0863.dFld) + "," + sFld + "," +
                byFld);
        FuzzerUtils.out.println("Test0863.bFld Test0863.iArrFld = " + (Test0863.bFld ? 1 : 0) + "," +
                FuzzerUtils.checkSum(Test0863.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
