// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:12 2023
public class Test0760 {

    public static final int N = 400;

    public static long instanceCount = 13L;
    public static int iFld = -21425;
    public static boolean bFld = false;
    public static float fFld = -24.782F;
    public static boolean bFld1 = true;
    public static double dFld = -74.68627;
    public static int[] iArrFld = new int[N];
    public static long[] lArrFld1 = new long[N];
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0760.iArrFld, -14);
        FuzzerUtils.init(Test0760.lArrFld1, -2038123512636298692L);
    }

    public byte byFld = 0;
    public long[] lArrFld = new long[N];

    public static void vMeth() {

        float f2 = 0.804F;
        int i4 = 31206, i5 = 191, i6 = 11, i7 = 45290;
        byte by = -94;

        f2 = Test0760.iFld;
        Test0760.iFld ^= Test0760.iFld;
        Test0760.instanceCount <<= Test0760.iFld;
        for (i4 = 8; i4 < 139; ++i4) {
            for (i6 = 1; i6 < 12; i6 += 3) {
                Test0760.iArrFld[i4 - 1] = (int) Test0760.instanceCount;
                if (Test0760.bFld) break;
                Test0760.instanceCount -= i4;
                i5 |= i6;
                i7 ^= i4;
                Test0760.instanceCount += (long) (2.96F + (i6 * i6));
                Test0760.instanceCount = i6;
                Test0760.lArrFld1[i4 - 1] = Test0760.instanceCount;
            }
            by += (byte) (i4 * i4);
            Test0760.iArrFld[i4 + 1] *= 33871;
        }
        vMeth_check_sum += Float.floatToIntBits(f2) + i4 + i5 + i6 + i7 + by;
    }

    public static int iMeth1(int i2, int i3) {

        int i8 = -220, i9 = 0, i10 = -62107, i11 = 49826, i12 = 56766;
        byte by1 = -90;
        short s = -12597;

        vMeth();
        Test0760.iArrFld = Test0760.iArrFld;
        i8 = 1;
        while (++i8 < 173) {
            i3 = i3;
            for (i9 = 1; i9 < 9; ++i9) {
                Test0760.iArrFld[i8 - 1] = Test0760.iFld;
                Test0760.iFld *= i10;
                Test0760.instanceCount += (i9 | Test0760.iFld);
                for (i11 = 1; i11 < 2; ++i11) {
                    i10 >>= (int) Test0760.instanceCount;
                    i2 += (((i11 * i12) + i10) - i2);
                    i2 = 5730;
                    i10 += -8;
                    Test0760.fFld += (24090 + (i11 * i11));
                    by1 += (byte) (((i11 * i3) + i8) - s);
                }
            }
        }
        long meth_res = i2 + i3 + i8 + i9 + i10 + i11 + i12 + by1 + s;
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public static int iMeth(int i, float f1, int i1) {

        int i13 = 14, i14 = 45995, i15 = 52476, i16 = -12, i17 = -2523;

        f1 = iMeth1(i, Test0760.iFld);
        for (i13 = 4; i13 < 137; ++i13) {
            i15 = 1;
            do {
                i1 += (2505 + (i15 * i15));
                for (i16 = 1; i16 > i13; i16 -= 3) {
                    if (Test0760.bFld) continue;
                    Test0760.instanceCount >>= 62520;
                    Test0760.bFld1 = Test0760.bFld;
                    Test0760.instanceCount += (i16 | i14);
                    Test0760.lArrFld1[i15 - 1] *= (long) f1;
                    Test0760.instanceCount += (i16 | i1);
                    Test0760.instanceCount = Test0760.instanceCount;
                    i1 = (int) -5L;
                    i17 >>>= (int) Test0760.instanceCount;
                    if (Test0760.bFld) break;
                }
            } while (++i15 < 12);
        }
        long meth_res = i + Float.floatToIntBits(f1) + i1 + i13 + i14 + i15 + i16 + i17;
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0760 _instance = new Test0760();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        float f = 2.200F;
        float[] fArr = new float[N];
        int i18 = -14, i19 = -14, i20 = 37044, i21 = -14, i22 = 0, i23 = -42697, i24 = -63;
        short s1 = 21143;

        FuzzerUtils.init(fArr, -77.566F);

        lArrFld[(Test0760.iFld >>> 1) % N] += (long) ((-(--f)) + ((Test0760.iFld - Test0760.iFld) + iMeth(-20628, Test0760.fFld,
                34925)));
        Test0760.instanceCount *= Test0760.iFld;
        i18 = 1;
        do {
            Test0760.instanceCount = i19;
            Test0760.instanceCount |= byFld;
            Test0760.iFld = i19;
            for (i20 = 186; i20 > 10; i20 -= 2) {
                i19 = s1;
                Test0760.iFld += (((i20 * i19) + Test0760.instanceCount) - Test0760.iFld);
                Test0760.instanceCount = (long) -72.991F;
                Test0760.dFld = i20;
                Test0760.bFld = Test0760.bFld;
                fArr[(i21 >>> 1) % N] *= Test0760.instanceCount;
                for (i22 = 1; i22 < 3; i22++) {
                    Test0760.iArrFld[i20] -= i21;
                    Test0760.fFld += 43;
                    fArr[i18 - 1] -= f;
                    if (Test0760.bFld1) {
                        i23 -= -2102;
                        try {
                            i19 = (Test0760.iArrFld[i20 + 1] / -203);
                            i19 = (i21 / i19);
                            i23 = (Test0760.iFld / 74);
                        } catch (ArithmeticException a_e) {
                        }
                    } else if (Test0760.bFld1) {
                        i19 = (int) Test0760.instanceCount;
                        i19 |= i19;
                        Test0760.instanceCount += (i22 ^ Test0760.instanceCount);
                    } else if (false) {
                        f = i19;
                        i21 <<= byFld;
                    }
                    Test0760.instanceCount += i22;
                }
                f -= s1;
                Test0760.iFld += (int) Test0760.instanceCount;
            }
            i23 |= i24;
            Test0760.fFld += byFld;
        } while (++i18 < 135);

        FuzzerUtils.out.println("f i18 i19 = " + Float.floatToIntBits(f) + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 s1 = " + i20 + "," + i21 + "," + s1);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test0760.instanceCount Test0760.iFld Test0760.bFld = " + Test0760.instanceCount + "," + Test0760.iFld +
                "," + (Test0760.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0760.fFld Test0760.bFld1 byFld = " + Float.floatToIntBits(Test0760.fFld) + "," + (Test0760.bFld1 ?
                1 : 0) + "," + byFld);
        FuzzerUtils.out.println("Test0760.dFld lArrFld Test0760.iArrFld = " + Double.doubleToLongBits(Test0760.dFld) + "," +
                FuzzerUtils.checkSum(lArrFld) + "," + FuzzerUtils.checkSum(Test0760.iArrFld));
        FuzzerUtils.out.println("Test0760.lArrFld1 = " + FuzzerUtils.checkSum(Test0760.lArrFld1));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}