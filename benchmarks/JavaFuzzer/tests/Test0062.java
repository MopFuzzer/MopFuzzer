// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:54 2023
public class Test0062 {

    public static final int N = 400;

    public static long instanceCount = 1L;
    public static short sFld = 17779;
    public static byte byFld = 90;
    public static float fFld = -67.660F;
    public static boolean bFld = false;
    public static int[] iArrFld1 = new int[N];
    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0062.iArrFld1, -23301);
    }

    public int[][] iArrFld = new int[N][N];

    public static void vMeth1() {

        int i8 = 22115, i9 = 241, i10 = 55133, i11 = -40917;
        long l = -1147406888L;
        long[] lArr = new long[N];
        double d2 = 0.27648;
        boolean b = false;
        byte[] byArr = new byte[N];

        FuzzerUtils.init(byArr, (byte) -23);
        FuzzerUtils.init(lArr, -29642L);

        Test0062.instanceCount += Test0062.sFld;
        for (i8 = 18; i8 < 366; i8++) {
            for (i10 = 1; i10 < 5; i10++) {
                l = 1;
                do {
                    i9 -= i9;
                    byArr[i8 + 1] = (byte) i9;
                    Test0062.iArrFld1[(int) (l - 1)] = 31007;
                    Test0062.fFld = (float) d2;
                    d2 *= Test0062.instanceCount;
                    Test0062.instanceCount -= i9;
                    switch ((int) (((l % 2) * 5) + 109)) {
                        case 115:
                            b = b;
                            break;
                        case 112:
                            Test0062.instanceCount += l;
                            break;
                    }
                    Test0062.instanceCount += (((l * i10) + i9) - Test0062.fFld);
                } while (++l < 2);
                lArr = FuzzerUtils.long1array(N, (long) -47282L);
            }
        }
        vMeth1_check_sum += i8 + i9 + i10 + i11 + l + Double.doubleToLongBits(d2) + (b ? 1 : 0) +
                FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(int i5, int i6) {

        int i7 = 24440, i12 = 6, i13 = 53129, i14 = -66;
        boolean b1 = true;

        i7 = 386;
        while (--i7 > 0) {
            vMeth1();
            switch (((i5 >>> 1) % 2) + 47) {
                case 47:
                    i6 -= i6;
                    Test0062.instanceCount += (((i7 * i7) + i7) - Test0062.fFld);
                case 48:
            }
            i12 = 1;
            while (++i12 < 4) {
                for (i13 = 1; i13 < 1; ++i13) {
                    Test0062.iArrFld1[i12] = -24407;
                    b1 = b1;
                    Test0062.byFld += (byte) (i13 * i13);
                    Test0062.instanceCount *= (long) Test0062.fFld;
                    i14 <<= (int) 110L;
                    i6 = i5;
                    Test0062.iArrFld1[i12 - 1] = 31629;
                }
                i14 -= i7;
            }
        }
        vMeth_check_sum += i5 + i6 + i7 + i12 + i13 + i14 + (b1 ? 1 : 0);
    }

    public static float fMeth(int i1, int i2) {

        float f = 86.925F;
        float[] fArr = new float[N];
        int i3 = -241, i4 = -205, i15 = -28787, i16 = -47397, i17 = -24, i18 = 2;
        double d1 = 8.120831;
        long[] lArr1 = new long[N];

        FuzzerUtils.init(fArr, -40.687F);
        FuzzerUtils.init(lArr1, 3420430030L);

        i2 += (int) f;
        Test0062.iArrFld1[(i2 >>> 1) % N] <<= (int) Test0062.instanceCount;
        for (i3 = 137; i3 > 6; i3 -= 2) {
            Test0062.byFld -= (byte) (((Test0062.iArrFld1[i3 + 1]--) * (Test0062.byFld = (byte) i2)) >> (long) ((i2 + i3) + (i3 +
                    d1)));
            vMeth(i4, 27162);
            d1 *= i4;
            fArr[i3 + 1] /= (i3 | 1);
            i2 += (int) Test0062.instanceCount;
            switch (((i3 % 2) * 5) + 111) {
                case 117:
                    fArr[i3] -= i1;
                    for (i15 = 1; i15 < 24; i15++) {
                        for (i17 = 1; 2 > i17; i17++) {
                            lArr1[i15 + 1] ^= i1;
                            i2 = 5;
                            Test0062.byFld = (byte) i1;
                        }
                    }
                    break;
                case 116:
                    Test0062.bFld = Test0062.bFld;
            }
        }
        long meth_res = i1 + i2 + Float.floatToIntBits(f) + i3 + i4 + Double.doubleToLongBits(d1) + i15 + i16 + i17 +
                i18 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr1);
        fMeth_check_sum += meth_res;
        return (float) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0062 _instance = new Test0062();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = -2487, i19 = 70, i20 = -39270, i21 = 64774, i22 = -45, i23 = -22360, i24 = 6, i25 = 191, i26 = -52;
        double d = 1.117143;
        long l1 = 239L;
        long[] lArr2 = new long[N];

        FuzzerUtils.init(lArr2, -3206247337L);

        iArrFld = (iArrFld = FuzzerUtils.int2array(N, (int) 67));
        Test0062.sFld <<= (short) iArrFld[(i >>> 1) % N][(i >>> 1) % N];
        i = (int) (iArrFld[(i >>> 1) % N][(i >>> 1) % N] <<= (int) ((d++) + fMeth(i, i)));
        for (i19 = 187; i19 > 7; --i19) {
            Test0062.instanceCount += (((i19 * i) + i) - Test0062.sFld);
            i20 <<= Test0062.byFld;
            i20 = 214;
            Test0062.fFld += (-3186L + (i19 * i19));
            for (i21 = 4; i21 < 139; i21++) {
                for (i23 = 1; i23 < 2; ++i23) {
                    i22 = i22;
                    i22 = (int) Test0062.instanceCount;
                    i24 -= i;
                    Test0062.sFld = (short) i19;
                    Test0062.instanceCount = i24;
                    Test0062.byFld &= (byte) i25;
                    Test0062.sFld >>= (short) Test0062.instanceCount;
                    lArr2 = lArr2;
                    if (Test0062.bFld) break;
                }
                switch (((i21 % 6) * 5) + 46) {
                    case 58:
                        Test0062.instanceCount = i23;
                        break;
                    case 65:
                        Test0062.instanceCount = Test0062.sFld;
                        break;
                    case 69:
                        Test0062.fFld = i22;
                        break;
                    case 50:
                        i -= i20;
                        if (Test0062.bFld) continue;
                        d = Test0062.instanceCount;
                        break;
                    case 72:
                        i26 = 1;
                        while (++i26 < 2) {
                            i22 += i26;
                            Test0062.instanceCount = 29;
                        }
                        break;
                    case 75:
                        iArrFld[i19 + 1][i21 + 1] ^= i21;
                    default:
                        lArr2[i19] += l1;
                }
            }
        }

        FuzzerUtils.out.println("i d i19 = " + i + "," + Double.doubleToLongBits(d) + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 l1 lArr2 = " + i26 + "," + l1 + "," + FuzzerUtils.checkSum(lArr2));

        FuzzerUtils.out.println("Test0062.instanceCount Test0062.sFld Test0062.byFld = " + Test0062.instanceCount + "," + Test0062.sFld +
                "," + Test0062.byFld);
        FuzzerUtils.out.println("Test0062.fFld Test0062.bFld iArrFld = " + Float.floatToIntBits(Test0062.fFld) + "," + (Test0062.bFld ?
                1 : 0) + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("Test0062.iArrFld1 = " + FuzzerUtils.checkSum(Test0062.iArrFld1));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}