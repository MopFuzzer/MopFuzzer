// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:59 2023
public class Test0269 {

    public static final int N = 400;

    public static long instanceCount = 23254L;
    public static float fFld = 52.630F;
    public static boolean bFld = false;
    public static byte byFld = -38;
    public static int iFld = -11;
    public static volatile boolean[] bArrFld = new boolean[N];
    public static float[][] fArrFld = new float[N][N];
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long lMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0269.bArrFld, false);
        FuzzerUtils.init(Test0269.fArrFld, -112.624F);
    }

    public static long lMeth1(int i7, int i8) {

        int i9 = -171;
        int i10 = 4;
        int i11 = 45922;
        int i12 = 2;
        int[] iArr = new int[N];
        long l1 = -61509L;
        long[][] lArr = new long[N][N];
        byte by = -117;

        FuzzerUtils.init(lArr, 6153911395424901441L);
        FuzzerUtils.init(iArr, 4525);

        i9 = 1;
        do {
            Test0269.fFld = i7;
            for (i10 = 1; i10 < 7; i10++) {
                i7 *= (int) Test0269.instanceCount;
                i11 += (int) Test0269.fFld;
                lArr[i10 - 1][i10] <<= 9L;
                Test0269.bArrFld[i10 - 1] = false;
                for (l1 = 1; 2 > l1; ++l1) {
                    Test0269.instanceCount += i9;
                    by >>= (byte) i12;
                    Test0269.fFld -= i9;
                    iArr[i9] *= (int) l1;
                    Test0269.bFld = Test0269.bFld;
                    Test0269.fArrFld[(int) (l1)][i9] = i10;
                    i12 += (int) (l1 ^ i11);
                }
            }
        } while (++i9 < 217);
        long meth_res = i7 + i8 + i9 + i10 + i11 + l1 + i12 + by + FuzzerUtils.checkSum(lArr) +
                FuzzerUtils.checkSum(iArr);
        lMeth1_check_sum += meth_res;
        return (long) meth_res;
    }

    public static long lMeth(int i1, int i2, long l) {

        int i3 = 5, i4 = 4, i5 = -100, i6 = 38305, i13 = 2;
        boolean b = false;
        float f = 1.737F;
        float f1 = -15.650F;
        float[][] fArr = new float[N][N];

        FuzzerUtils.init(fArr, -1.215F);

        for (i3 = 2; 143 > i3; i3++) {
            Test0269.bArrFld[i3 - 1] = b;
            for (i5 = 1; i5 < 11; i5++) {
                i1 = (int) ((Math.min(0, 12) & (long) (-f)) + i5);
                fArr[i3][i3] = lMeth1(i6, 27572);
                Test0269.instanceCount += (i5 + i6);
                if (i2 != 0) {
                }
                for (f1 = i5; f1 < 2; ++f1) {
                    i2 -= i3;
                    i4 *= 157;
                }
            }
            Test0269.bFld = b;
            l += (i3 * Test0269.instanceCount);
            i13 += (((i3 * i6) + i5) - i1);
            i1 *= i13;
            i4 -= (int) l;
        }
        long meth_res = i1 + i2 + l + i3 + i4 + (b ? 1 : 0) + i5 + i6 + Float.floatToIntBits(f) +
                Float.floatToIntBits(f1) + i13 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public static void vMeth(int i) {

        int i14 = -10;
        int i15 = 2;
        int i16 = 35718;
        int i17 = -116;
        int i18 = -14;
        int[] iArr1 = new int[N];
        short s = -9353;
        double d = -100.88912;
        long[] lArr1 = new long[N];

        FuzzerUtils.init(lArr1, -2L);
        FuzzerUtils.init(iArr1, -97);

        i = (int) (lMeth(i, -23075, Test0269.instanceCount) + i);
        for (i14 = 6; i14 < 223; ++i14) {
            lArr1[i14 - 1] <<= i;
            iArr1[i14] = i;
            switch (((i14 % 3) * 5) + 55) {
                case 59:
                    switch (((i14 >>> 1) % 1) + 45) {
                        case 45:
                            i16 = 1;
                            while ((i16 += 2) < 7) {
                                i15 += (((i16 * Test0269.instanceCount) + Test0269.fFld) - Test0269.instanceCount);
                                iArr1[i16 - 1] >>= Test0269.byFld;
                                for (i17 = 1; i17 < 3; i17++) {
                                    Test0269.instanceCount = i16;
                                    i += i17;
                                    s += (short) i17;
                                    iArr1[i16 + 1] = i18;
                                    lArr1[i14] -= -17966;
                                }
                            }
                            break;
                        default:
                            d *= 4;
                    }
                    break;
                case 69:
                    Test0269.instanceCount += (i14 - i17);
                case 64:
                    iArr1 = iArr1;
                    break;
            }
        }
        vMeth_check_sum += i + i14 + i15 + i16 + i17 + i18 + s + Double.doubleToLongBits(d) +
                FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr1);
    }

    public static void main(String[] strArr) {

        try {
            Test0269 _instance = new Test0269();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {


        vMeth(Test0269.iFld);


        FuzzerUtils.out.println("Test0269.instanceCount Test0269.fFld Test0269.bFld = " + Test0269.instanceCount + "," +
                Float.floatToIntBits(Test0269.fFld) + "," + (Test0269.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0269.byFld Test0269.iFld Test0269.bArrFld = " + Test0269.byFld + "," + Test0269.iFld + "," +
                FuzzerUtils.checkSum(Test0269.bArrFld));
        FuzzerUtils.out.println("Test0269.fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0269.fArrFld)));

        FuzzerUtils.out.println("lMeth1_check_sum: " + lMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  lMeth1 ->  lMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
