// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:04 2023
public class Test0451 {

    public static final int N = 400;

    public static long instanceCount = -5671832947418613690L;
    public static volatile short sFld = 9822;
    public static double dFld = 1.70277;
    public static int[] iArrFld = new int[N];
    public static int[][] iArrFld1 = new int[N][N];
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0451.iArrFld, 3);
        FuzzerUtils.init(Test0451.iArrFld1, -13);
    }

    public boolean bFld = false;
    public int iFld = -11;
    public short[][] sArrFld = new short[N][N];

    public static long lMeth(byte by) {

        int i8 = 2, i9 = -225, i10 = 3, i11 = -57, i12 = -17431;
        float f2 = 21.309F;
        float[] fArr = new float[N];
        boolean b1 = false;
        long l1 = 82L;

        FuzzerUtils.init(fArr, 0.223F);

        i8 -= (int) Test0451.instanceCount;
        for (i9 = 11; i9 < 245; i9++) {
            for (i11 = 7; i11 > i9; --i11) {
                Test0451.dFld = i8;
                fArr[i9] *= -52.547F;
                i8 = i10;
                f2 += ((long) i11 | (long) i12);
                if (b1) continue;
                i8 <<= i9;
                i12 = i12;
            }
            l1 = 1;
            do {
                Test0451.dFld = l1;
                i12 += (int) (l1 + i9);
                if (i10 != 0) {
                }
                i10 = i10;
            } while (++l1 < 7);
        }
        long meth_res = by + i8 + i9 + i10 + i11 + i12 + Float.floatToIntBits(f2) + (b1 ? 1 : 0) + l1 +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0451 _instance = new Test0451();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public int iMeth(long l, boolean b) {

        int i2 = -28896, i3 = -21932, i4 = -227, i5 = 191, i6 = 50217, i7 = -108, i13 = 211, i14 = -29111, i15 = -7175;
        float f1 = 105.1006F;
        byte by1 = 6;

        i2 <<= Math.min((int) ((i2 - i2) - Test0451.instanceCount), i2);
        for (i3 = 2; i3 < 171; i3 += 3) {
            for (i5 = 27; 1 < i5; i5--) {
                i6 += (i5 * i5);
                Test0451.sFld -= (short) (((i4 * l) + Test0451.iArrFld[i5]) * (-(f1 * i7)));
                i6 += (int) Test0451.dFld;
                i4 >>= (int) lMeth(by1);
                Test0451.iArrFld[i3] = (int) Test0451.instanceCount;
                l = i3;
                for (i13 = 1; i13 < 2; i13++) {
                    l = (long) 1.59336;
                    i15 ^= i6;
                    f1 *= -181;
                    i6 /= (int) (i2 | 1);
                    Test0451.dFld += i6;
                }
            }
        }
        long meth_res = l + (b ? 1 : 0) + i2 + i3 + i4 + i5 + i6 + Float.floatToIntBits(f1) + i7 + by1 + i13 + i14 +
                i15;
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public void vMeth() {

        int i1 = -9, i16 = -57643, i17 = 7824, i18 = -49, i19 = -38939;
        long l2 = 21098L;

        if (bFld) {
            if (bFld) {
                i1 = iMeth(Test0451.instanceCount, bFld);
                for (i16 = 1; 154 > i16; ++i16) {
                    for (i18 = 10; i18 > 1; --i18) {
                        float f3 = 77.740F;
                        if (bFld) break;
                        i19 += (((i18 * i1) + i1) - f3);
                        Test0451.instanceCount += 11L;
                        i17 += (i18 + Test0451.instanceCount);
                        Test0451.instanceCount += (((i18 * i1) + Test0451.instanceCount) - i18);
                        i19 -= i19;
                        i19 = (int) Test0451.instanceCount;
                        i19 = (int) l2;
                    }
                    i19 = i17;
                    l2 = l2;
                }
            }
        }
        vMeth_check_sum += i1 + i16 + i17 + i18 + i19 + l2;
    }

    public void mainTest(String[] strArr1) {

        int i = -122, i20 = -2, i21 = 27, i22 = -33432;
        double d = 30.44214;
        float f = -2.22F;
        byte by2 = -22;
        byte[] byArr = new byte[N];
        boolean[] bArr = new boolean[N];

        FuzzerUtils.init(byArr, (byte) -106);
        FuzzerUtils.init(bArr, false);

        i = 1;
        do {
            d *= ((i % ((--Test0451.instanceCount) | 1)) * ((i - f) + (Test0451.sFld * i)));
            vMeth();
            byArr[i - 1] = by2;
            iFld += -53768;
            Test0451.iArrFld[i] = i;
            iFld >>= i;
            switch (((i % 7) * 5) + 59) {
                case 84:
                    for (i20 = i; i20 < 108; i20++) {
                        if (bFld) break;
                        Test0451.instanceCount = (long) d;
                        Test0451.iArrFld[i20 - 1] = iFld;
                        i22 = 1;
                        while (++i22 < 1) {
                            iFld += (i22 * i22);
                            Test0451.instanceCount = i;
                            if (bFld) {
                                i21 >>= i22;
                                f -= 30769;
                                iFld -= (int) -70.112281;
                                iFld += (int) Test0451.instanceCount;
                            } else if (bFld) {
                                iFld += (i22 * i22);
                                bArr[i20 - 1] = bFld;
                                i21 = i;
                            } else {
                                iFld += (((i22 * Test0451.sFld) + i22) - i22);
                                i21 += (((i22 * i21) + f) - f);
                                d *= f;
                            }
                            iFld = i21;
                            sArrFld[i] = sArrFld[i + 1];
                            Test0451.dFld = i;
                            Test0451.iArrFld1 = Test0451.iArrFld1;
                        }
                    }
                    break;
                case 77:
                    iFld = (int) Test0451.instanceCount;
                    break;
                case 82:
                    Test0451.instanceCount = by2;
                case 62:
                    Test0451.instanceCount += 88;
                    break;
                case 70:
                    i21 -= i22;
                    break;
                case 74:
                    Test0451.sFld += (short) (i * i);
                    break;
                case 90:
            }
        } while (++i < 232);

        FuzzerUtils.out.println("i d f = " + i + "," + Double.doubleToLongBits(d) + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("by2 i20 i21 = " + by2 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 byArr bArr = " + i22 + "," + FuzzerUtils.checkSum(byArr) + "," +
                FuzzerUtils.checkSum(bArr));

        FuzzerUtils.out.println("Test0451.instanceCount Test0451.sFld Test0451.dFld = " + Test0451.instanceCount + "," + Test0451.sFld +
                "," + Double.doubleToLongBits(Test0451.dFld));
        FuzzerUtils.out.println("bFld iFld Test0451.iArrFld = " + (bFld ? 1 : 0) + "," + iFld + "," +
                FuzzerUtils.checkSum(Test0451.iArrFld));
        FuzzerUtils.out.println("sArrFld Test0451.iArrFld1 = " + FuzzerUtils.checkSum(sArrFld) + "," +
                FuzzerUtils.checkSum(Test0451.iArrFld1));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  lMeth ->  lMeth iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
