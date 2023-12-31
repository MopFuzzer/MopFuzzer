// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:58 2023
public class Test0207 {

    public static final int N = 400;

    public static long instanceCount = -14655L;
    public static boolean bFld = true;
    public static volatile int iFld = 65381;
    public static int[] iArrFld = new int[N];
    public static double[][] dArrFld = new double[N][N];
    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long byMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0207.iArrFld, -49840);
        FuzzerUtils.init(Test0207.dArrFld, 2.94315);
    }

    public float fFld = 2.512F;
    public double dFld = 2.34094;

    public static void vSmallMeth() {

        int i = 13829, i1 = 134;

        i += i;
        i1 = 204;
        vSmallMeth_check_sum += i + i1;
    }

    public static byte byMeth(long l, int i5, double d) {

        int i6 = 1, i7 = -150;
        byte by1 = -124;
        long[] lArr = new long[N];
        float[] fArr = new float[N];

        FuzzerUtils.init(lArr, 3907741692523637028L);
        FuzzerUtils.init(fArr, 7.971F);

        i6 = 398;
        while (--i6 > 0) {
            l <<= 49922;
            vSmallMeth();
            i7 = 1;
            do {
                i5 >>>= (int) Test0207.instanceCount;
                Test0207.instanceCount -= i7;
                i5 >>= i7;
                lArr = lArr;
                i5 = i7;
                Test0207.instanceCount = l;
                Test0207.iArrFld[i7] = -4;
            } while (++i7 < 4);
        }
        l -= -9;
        i5 = i6;
        by1 *= (byte) 16143;
        i5 -= i6;
        long meth_res = l + i5 + Double.doubleToLongBits(d) + i6 + i7 + by1 + FuzzerUtils.checkSum(lArr) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        byMeth_check_sum += meth_res;
        return (byte) meth_res;
    }

    public static void vMeth(byte by, int i3, int i4) {

        double d1 = 34.100549;
        int i8 = 48851;
        int i9 = 0;
        int i10 = -13;
        int i11 = 163;
        int i12 = 9945;
        int[] iArr = new int[N];
        short s = -27386;
        float f1 = -1.836F;
        byte[][] byArr = new byte[N][N];
        long[] lArr1 = new long[N];

        FuzzerUtils.init(byArr, (byte) -91);
        FuzzerUtils.init(iArr, 6);
        FuzzerUtils.init(lArr1, 337071373L);

        byArr[(i3 >>> 1) % N][(i3 >>> 1) % N] = (byte) (++i3);
        iArr[(i4 >>> 1) % N] = byMeth(Test0207.instanceCount, i4, d1);
        for (i8 = 6; i8 < 160; i8 += 3) {
            if (Test0207.bFld) continue;
            i3 += (i8 * i8);
            switch ((((i4 >>> 1) % 1) * 5) + 121) {
                case 125:
                    Test0207.instanceCount = i10;
                    Test0207.instanceCount = Test0207.instanceCount;
                    break;
                default:
                    Test0207.instanceCount = i9;
                    s += (short) (i8 * i8);
            }
        }
        for (i11 = 143; i11 > 6; i11--) {
            i12 -= 6128;
            Test0207.instanceCount *= -230;
            f1 = s;
            lArr1[i11] -= i9;
        }
        vMeth_check_sum += by + i3 + i4 + Double.doubleToLongBits(d1) + i8 + i9 + i10 + s + i11 + i12 +
                Float.floatToIntBits(f1) + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr) +
                FuzzerUtils.checkSum(lArr1);
    }

    public static void main(String[] strArr) {

        try {
            Test0207 _instance = new Test0207();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i2 = 237, i13 = -38226, i14 = 10774, i15 = 4, i16 = 200, i17 = -83, i18 = -202;
        byte by2 = 38;
        boolean[] bArr = new boolean[N];
        long[] lArr2 = new long[N];

        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(lArr2, -2193980882L);

        for (int smallinvoc = 0; smallinvoc < 852; smallinvoc++) vSmallMeth();
        i2 = 1;
        do {
            vMeth(by2, i2, -10105);
            for (i13 = 9; i13 < 194; ++i13) {
                i14 += i13;
                i14 &= i2;
                bArr[i13] = Test0207.bFld;
                by2 *= (byte) Test0207.instanceCount;
                i14 *= i13;
                switch (((i14 >>> 1) % 2) + 67) {
                    case 67:
                    case 68:
                        Test0207.instanceCount -= i2;
                        lArr2[i2] += i13;
                        Test0207.dArrFld[i13 - 1][i13 - 1] -= Test0207.instanceCount;
                        for (i15 = 1; 2 > i15; i15++) {
                            i14 += (i15 + Test0207.instanceCount);
                            Test0207.instanceCount *= (long) fFld;
                            Test0207.instanceCount = i14;
                            Test0207.iArrFld[i2 + 1] *= i13;
                            Test0207.instanceCount += (i15 * i14);
                            if (false) break;
                            i16 <<= i16;
                        }
                        break;
                    default:
                        Test0207.instanceCount = -1;
                        i14 <<= i15;
                        i14 += (((i13 * i15) + i16) - i2);
                        lArr2[i2] += i16;
                }
                for (i17 = 1; i17 < 2; i17++) {
                    Test0207.bFld = Test0207.bFld;
                    dFld = i2;
                    i14 = i17;
                    Test0207.iFld += i17;
                }
            }
        } while (++i2 < 129);

        FuzzerUtils.out.println("i2 by2 i13 = " + i2 + "," + by2 + "," + i13);
        FuzzerUtils.out.println("i14 i15 i16 = " + i14 + "," + i15 + "," + i16);
        FuzzerUtils.out.println("i17 i18 bArr = " + i17 + "," + i18 + "," + FuzzerUtils.checkSum(bArr));
        FuzzerUtils.out.println("lArr2 = " + FuzzerUtils.checkSum(lArr2));

        FuzzerUtils.out.println("Test0207.instanceCount Test0207.bFld fFld = " + Test0207.instanceCount + "," + (Test0207.bFld ? 1 : 0)
                + "," + Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("dFld Test0207.iFld Test0207.iArrFld = " + Double.doubleToLongBits(dFld) + "," + Test0207.iFld +
                "," + FuzzerUtils.checkSum(Test0207.iArrFld));
        FuzzerUtils.out.println("Test0207.dArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0207.dArrFld)));

        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
        FuzzerUtils.out.println("byMeth_check_sum: " + byMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test byMeth vMeth
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  byMeth ->  byMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
