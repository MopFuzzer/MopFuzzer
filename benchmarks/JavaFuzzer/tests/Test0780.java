// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:12 2023
public class Test0780 {

    public static final int N = 400;

    public static long instanceCount = 8756551994438015559L;
    public static boolean bFld = true;
    public static long lFld = 9423L;
    public static volatile float fFld = -52.22F;
    public static double dFld = 88.63209;
    public static volatile short sFld = -12196;
    public static byte byFld = -81;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public int iFld = 11;

    public static void vMeth1(int i4, float f, long l) {

        int i5 = -61;
        int i6 = 42;
        int i7 = 2;
        int i8 = -154;
        int[] iArr = new int[N];
        double d = -2.71161;
        double[] dArr = new double[N];
        long l1 = -11733L;

        FuzzerUtils.init(iArr, -9);
        FuzzerUtils.init(dArr, -33.73752);

        i4 ^= i4;
        i4 = i4;
        i4 += i4;
        for (i5 = 7; i5 < 332; i5++) {
            d += i6;
            Test0780.instanceCount += l1;
            iArr[i5 - 1] = -20579;
            if (Test0780.bFld) {
                dArr[i5] += i5;
            } else {
                for (i7 = 1; i7 < 5; ++i7) {
                    f = i6;
                    iArr[i7 + 1] -= (int) f;
                    if (Test0780.bFld) break;
                    Test0780.instanceCount += (i7 + i7);
                    l |= i4;
                }
            }
        }
        vMeth1_check_sum += i4 + Float.floatToIntBits(f) + l + i5 + i6 + Double.doubleToLongBits(d) + l1 + i7 + i8 +
                FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth() {

        int i2 = -20901;
        int i3 = 52;
        int i9 = 13;
        int i10 = 145;
        int i11 = 232;
        int i12 = 48741;
        int i13 = -152;
        int[] iArr1 = new int[N];
        int[][] iArr2 = new int[N][N];
        short s = 21699;
        byte by = 66;

        FuzzerUtils.init(iArr1, -16361);
        FuzzerUtils.init(iArr2, 45175);

        for (i2 = 7; i2 < 196; i2 += 3) {
            vMeth1(i2, -36.1016F, Test0780.lFld);
            for (i9 = 1; i9 < 24; ++i9) {
                for (i11 = 2; i11 > i2; --i11) {
                    Test0780.fFld += i11;
                    Test0780.instanceCount >>= i11;
                    i10 *= s;
                    i13 >>= i9;
                    i3 += (i11 | i9);
                    switch ((i9 % 6) + 50) {
                        case 50:
                            if (Test0780.bFld) {
                                i13 /= (int) (i9 | 1);
                                Test0780.lFld -= i9;
                                iArr1[i9] -= (int) Test0780.fFld;
                                Test0780.fFld += i10;
                                vMeth_check_sum += i2 + i3 + i9 + i10 + i11 + i12 + s + i13 + by +
                                        FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(iArr2);
                                return;
                            } else {
                                iArr1[i11] = (int) -3953169083L;
                            }
                            break;
                        case 51:
                            Test0780.fFld = by;
                            break;
                        case 52:
                            Test0780.fFld = i12;
                            break;
                        case 53:
                            Test0780.instanceCount += i11;
                        case 54:
                            iArr2 = iArr2;
                            break;
                        case 55:
                            i3 *= (int) Test0780.fFld;
                            break;
                    }
                }
            }
        }
        vMeth_check_sum += i2 + i3 + i9 + i10 + i11 + i12 + s + i13 + by + FuzzerUtils.checkSum(iArr1) +
                FuzzerUtils.checkSum(iArr2);
    }

    public static int iMeth(int i) {

        int i1 = -63212;
        int i14 = -10;
        int i15 = -171;
        int[] iArr3 = new int[N];

        FuzzerUtils.init(iArr3, -198);

        i1 = 162;
        while (--i1 > 0) {
            vMeth();
            switch (((i1 % 6) * 5) + 43) {
                case 73:
                    i += (int) (-28889L + (i1 * i1));
                    Test0780.bFld = false;
                case 44:
                    i <<= (int) Test0780.instanceCount;
                    Test0780.bFld = false;
                    i = (int) Test0780.fFld;
                    break;
                case 68:
                    i >>= (int) Test0780.lFld;
                    for (i14 = 1; i14 < 10; i14++) {
                        Test0780.lFld += 6;
                        switch ((i14 % 2) + 49) {
                            case 49:
                                i15 += i1;
                                iArr3[i14 - 1] %= (int) (i | 1);
                                iArr3[i1] *= i;
                                break;
                            case 50:
                                i *= (int) -57.1002F;
                            default:
                                i15 -= (int) Test0780.dFld;
                        }
                    }
                case 55:
                    i -= i;
                case 64:
                    i += (((i1 * Test0780.lFld) + i) - Test0780.lFld);
                    break;
                case 52:
                default:
                    i15 += (i1 ^ i15);
            }
        }
        long meth_res = i + i1 + i14 + i15 + FuzzerUtils.checkSum(iArr3);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0780 _instance = new Test0780();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        long l2 = -200L, l3 = -9L;
        int i16 = 5;
        int i17 = -43;
        int i18 = -63132;
        int i19 = -145;
        int i20 = 13;
        int i21 = 8613;
        int i22 = -192;
        int i23 = -2;
        int[] iArr4 = new int[N];
        double[] dArr1 = new double[N];
        short[] sArr = new short[N];
        float[] fArr = new float[N];

        FuzzerUtils.init(iArr4, 2);
        FuzzerUtils.init(dArr1, 0.97750);
        FuzzerUtils.init(sArr, (short) -30800);
        FuzzerUtils.init(fArr, 0.293F);

        iFld = ((iMeth(94) + iFld) - iFld);
        for (l2 = 8; l2 < 225; ++l2) {
            for (i17 = 7; i17 < 116; i17++) {
                Test0780.sFld += (short) (i17 * i17);
                i16 += (i17 * Test0780.fFld);
                Test0780.lFld ^= 1;
                iArr4[(int) (l2)] *= i17;
                i19 = 1;
                while (++i19 < 2) {
                    Test0780.dFld -= -4;
                    dArr1[i19] += 2.51331;
                    i16 = i17;
                    Test0780.lFld = -31748;
                    i16 += (i19 * i19);
                    if (Test0780.bFld) break;
                    Test0780.byFld = (byte) i17;
                    Test0780.fFld -= 232;
                    Test0780.instanceCount = (long) Test0780.fFld;
                    iFld = i19;
                }
            }
        }
        i16 = 8;
        for (i20 = 2; i20 < 295; i20 += 3) {
            sArr[i20] -= (short) -21330;
            switch (((i17 >>> 1) % 2) + 70) {
                case 70:
                    Test0780.sFld /= (short) (i17 | 1);
                    l3 = 1;
                    do {
                        iArr4[i20] &= 6;
                        for (i22 = 1; i22 < 1; i22++) {
                            Test0780.fFld += (i22 * i22);
                            Test0780.instanceCount = -4391419256670290709L;
                            i23 -= (int) Test0780.fFld;
                            fArr[(int) (l3)] %= (i17 | 1);
                        }
                    } while (++l3 < 258);
                    break;
                case 71:
            }
        }

        FuzzerUtils.out.println("l2 i16 i17 = " + l2 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 l3 i22 = " + i21 + "," + l3 + "," + i22);
        FuzzerUtils.out.println("i23 iArr4 dArr1 = " + i23 + "," + FuzzerUtils.checkSum(iArr4) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)));
        FuzzerUtils.out.println("sArr fArr = " + FuzzerUtils.checkSum(sArr) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test0780.instanceCount iFld Test0780.bFld = " + Test0780.instanceCount + "," + iFld + "," +
                (Test0780.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0780.lFld Test0780.fFld Test0780.dFld = " + Test0780.lFld + "," + Float.floatToIntBits(Test0780.fFld)
                + "," + Double.doubleToLongBits(Test0780.dFld));
        FuzzerUtils.out.println("Test0780.sFld Test0780.byFld = " + Test0780.sFld + "," + Test0780.byFld);

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
