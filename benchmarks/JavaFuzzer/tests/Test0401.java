// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:03 2023
public class Test0401 {

    public static final int N = 400;

    public static volatile long instanceCount = -1036739859L;
    public static int iFld = -6;
    public static float fFld = -2.436F;
    public static int iFld2 = -22194;
    public static double[] dArrFld = new double[N];
    public static long[] lArrFld = new long[N];
    public static volatile float[][] fArrFld = new float[N][N];
    public static int[] iArrFld = new int[N];
    public static long iMeth_check_sum = 0;
    public static long byMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0401.dArrFld, 18.39744);
        FuzzerUtils.init(Test0401.lArrFld, -5021877862314447615L);
        FuzzerUtils.init(Test0401.fArrFld, 2.782F);
        FuzzerUtils.init(Test0401.iArrFld, 1);
    }

    public boolean bFld = false;
    public int iFld1 = -88;
    public byte byFld = -110;

    public static int iMeth1(long l1) {

        byte by = 67;
        int i5 = 13;
        int i6 = -13;
        int i7 = -49685;
        int[] iArr1 = new int[N];

        FuzzerUtils.init(iArr1, -34147);

        Test0401.iFld *= Test0401.iFld;
        Test0401.lArrFld[(Test0401.iFld >>> 1) % N] = by;
        Test0401.iFld = Test0401.iFld;
        Test0401.fFld *= Test0401.iFld;
        Test0401.instanceCount &= Test0401.iFld;
        iArr1[(Test0401.iFld >>> 1) % N] *= (int) Test0401.fFld;
        Test0401.fFld -= Test0401.iFld;
        i5 = 1;
        do {
            iArr1 = iArr1;
            for (i6 = 1; i6 < 5; ++i6) {
                Test0401.lArrFld[i6] &= Test0401.iFld;
                i7 += (i6 - Test0401.fFld);
                Test0401.iFld <<= 9;
                iArr1[i5 + 1] = (int) Test0401.instanceCount;
            }
            Test0401.fFld = Test0401.fFld;
        } while (++i5 < 320);
        long meth_res = l1 + by + i5 + i6 + i7 + FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public static byte byMeth(int i2, int i3) {

        float f1 = -86.366F;
        int i4 = -3;
        int i8 = -41856;
        int i9 = 29;
        int[] iArr2 = new int[N];
        double d = 28.106006, d1 = -19.26037;
        long l = 3180952391L;

        FuzzerUtils.init(iArr2, -4);

        i3 = ((-i3) % (i2 | 1));
        for (f1 = 17; f1 < 318; f1 += 3) {
            d = 1;
            do {
                i2 -= i3;
                Test0401.instanceCount += (long) (((d * f1) + i3) - i2);
                l -= (long) ((i4 - (++i4)) % (((long) ((Test0401.dArrFld[(int) (d)]--) * (d - Test0401.instanceCount))) | 1));
                i4 += (int) (d - i2);
                d1 -= iMeth1(l);
                for (i8 = 1; 1 > i8; ++i8) {
                    l *= (long) d;
                    try {
                        i4 = (iArr2[i8 + 1] % i9);
                        iArr2[(int) (f1 + 1)] = (i8 % 207);
                        i4 = (53226 / iArr2[(int) (d + 1)]);
                    } catch (ArithmeticException a_e) {
                    }
                    if (Test0401.iFld != 0) {
                    }
                    Test0401.instanceCount += Test0401.iFld;
                }
                i3 |= i8;
            } while (++d < 16);
        }
        i4 = (int) d;
        long meth_res = i2 + i3 + Float.floatToIntBits(f1) + i4 + Double.doubleToLongBits(d) + l +
                Double.doubleToLongBits(d1) + i8 + i9 + FuzzerUtils.checkSum(iArr2);
        byMeth_check_sum += meth_res;
        return (byte) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0401 _instance = new Test0401();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public int iMeth(int i) {

        float f = 64.292F;
        int i1 = 31212;
        int i10 = -24153;
        int i11 = -188;
        int[] iArr = new int[N];
        double d2 = 58.87523;
        byte[] byArr = new byte[N];

        FuzzerUtils.init(byArr, (byte) 31);
        FuzzerUtils.init(iArr, 4);

        f -= byArr[(i >>> 1) % N];
        i1 = 144;
        do {
            i = ((--iArr[i1 + 1]) * byMeth(Test0401.iFld, i1));
            f *= i;
            d2 += Test0401.fFld;
            iArr = iArr;
            if (bFld) {
                f -= (float) d2;
                Test0401.iFld = Test0401.iFld;
                i = i;
                i += (((i1 * Test0401.instanceCount) + i1) - i1);
            } else {
                Test0401.instanceCount += (-56 + (i1 * i1));
                for (i10 = i1; i10 < 11; ++i10) {
                    Test0401.fArrFld[i1 + 1][i1] -= i1;
                    Test0401.instanceCount += (-40462 + (i10 * i10));
                }
            }
        } while (--i1 > 0);
        long meth_res = i + Float.floatToIntBits(f) + i1 + Double.doubleToLongBits(d2) + i10 + i11 +
                FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d3 = -115.98645;
        int i12 = -39984, i13 = -59485, i14 = -7, i15 = -246, i16 = 14, i17 = -39113, i18 = -45639;

        iMeth(Test0401.iFld);
        Test0401.dArrFld = Test0401.dArrFld;
        d3 -= Test0401.instanceCount;
        Test0401.iArrFld[(i12 >>> 1) % N] = 49;
        i12 -= (int) Test0401.instanceCount;
        i13 = 1;
        do {
            i12 = (int) Test0401.instanceCount;
        } while (++i13 < 377);
        for (i14 = 5; i14 < 362; i14 += 2) {
            Test0401.iArrFld[i14 - 1] += 14537;
            Test0401.fFld *= iFld1;
            try {
                i15 = (Test0401.iArrFld[i14 + 1] % i14);
                i12 = (Test0401.iFld / i14);
                Test0401.iArrFld[i14] = (Test0401.iFld / 483512729);
            } catch (ArithmeticException a_e) {
            }
            i16 = 1;
            do {
                i12 <<= 9;
                Test0401.instanceCount = -116;
                switch (((i14 % 2) * 5) + 116) {
                    case 124:
                        Test0401.iFld *= Test0401.iFld;
                        switch ((i16 % 8) + 104) {
                            case 104:
                                Test0401.dArrFld[i16] *= i12;
                                Test0401.iFld *= byFld;
                                Test0401.iFld2 += (int) d3;
                                if (true) continue;
                                break;
                            case 105:
                                i12 %= (int) (i15 | 1);
                                for (i17 = 1; i17 < 1; i17++) {
                                    switch ((i14 % 1) + 103) {
                                        case 103:
                                            Test0401.fFld += Test0401.instanceCount;
                                            break;
                                    }
                                    Test0401.iFld2 += 216;
                                    iFld1 += (((i17 * i16) + Test0401.instanceCount) - i18);
                                }
                                if (bFld) break;
                                break;
                            case 106:
                            case 107:
                            case 108:
                                Test0401.instanceCount += byFld;
                                iFld1 = i14;
                                break;
                            case 109:
                                i12 += i13;
                            case 110:
                                Test0401.iFld2 <<= i15;
                                break;
                            case 111:
                                if (false) continue;
                                break;
                        }
                        break;
                    case 120:
                        byFld = (byte) -104;
                        break;
                    default:
                        iFld1 <<= i13;
                }
            } while (++i16 < 141);
        }

        FuzzerUtils.out.println("d3 i12 i13 = " + Double.doubleToLongBits(d3) + "," + i12 + "," + i13);
        FuzzerUtils.out.println("i14 i15 i16 = " + i14 + "," + i15 + "," + i16);
        FuzzerUtils.out.println("i17 i18 = " + i17 + "," + i18);

        FuzzerUtils.out.println("Test0401.instanceCount Test0401.iFld Test0401.fFld = " + Test0401.instanceCount + "," + Test0401.iFld +
                "," + Float.floatToIntBits(Test0401.fFld));
        FuzzerUtils.out.println("bFld iFld1 byFld = " + (bFld ? 1 : 0) + "," + iFld1 + "," + byFld);
        FuzzerUtils.out.println("Test0401.iFld2 Test0401.dArrFld Test0401.lArrFld = " + Test0401.iFld2 + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0401.dArrFld)) + "," + FuzzerUtils.checkSum(Test0401.lArrFld));
        FuzzerUtils.out.println("Test0401.fArrFld Test0401.iArrFld = " +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0401.fArrFld)) + "," + FuzzerUtils.checkSum(Test0401.iArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("byMeth_check_sum: " + byMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  byMeth ->  byMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 byMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
