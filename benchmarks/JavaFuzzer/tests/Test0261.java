// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:59 2023
public class Test0261 {

    public static final int N = 400;

    public static long instanceCount = 127168122L;
    public static int iFld = 102;
    public static long lFld = -4L;
    public static double dFld = 0.90201;
    public static float fFld = 114.383F;
    public static short sFld = -10157;
    public static int iFld1 = 70;
    public static int[] iArrFld = new int[N];
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0261.iArrFld, -15521);
    }

    public long[] lArrFld = new long[N];

    public static long lMeth(float f1, int i3, int i4) {

        int i5 = 128, i6 = 250, i7 = -41615, i8 = 6944, i9 = 6, i10 = -4, i11 = 8;
        byte by = -71;
        boolean b = false;

        i5 = 354;
        while (--i5 > 0) {
            i3 += (((i5 * Test0261.instanceCount) + i5) - i3);
            i3 = Test0261.iFld;
        }
        Test0261.iFld <<= i4;
        Test0261.iArrFld[(41270 >>> 1) % N] -= (int) Test0261.instanceCount;
        by = (byte) f1;
        Test0261.iFld = -44974;
        Test0261.lFld *= Test0261.iFld;
        for (i6 = 258; i6 > 16; i6 -= 2) {
            for (i8 = 1; i8 < 13; i8 += 3) {
                for (i10 = 1; 4 > i10; i10++) {
                    b = b;
                    by <<= (byte) 45696L;
                    if (b) break;
                    i3 >>= (int) Test0261.lFld;
                }
            }
        }
        long meth_res = Float.floatToIntBits(f1) + i3 + i4 + i5 + by + i6 + i7 + i8 + i9 + i10 + i11 + (b ? 1 : 0);
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public static void vMeth1(int i1) {

        int i2 = -4;
        float f2 = 1.919F;
        byte by1 = -9;

        i2 = 1;
        do {
            Test0261.iArrFld[i2 + 1] += (int) lMeth(f2, i2, Test0261.iFld);
            Test0261.lFld &= Test0261.iFld;
            Test0261.lFld *= i2;
        } while (++i2 < 307);
        by1 ^= (byte) i1;
        vMeth1_check_sum += i1 + i2 + Float.floatToIntBits(f2) + by1;
    }

    public static void vMeth(double d, int i, long l) {

        float f = -2.572F, f3 = -1.238F;
        short s = -19183;
        int i12 = -62484, i13 = -67, i14 = 8, i15 = 152, i16 = -14;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, 58172L);

        try {
            Test0261.instanceCount = (long) (((f + s) * (s++)) * (--l));
            vMeth1(Test0261.iFld);
            i *= Test0261.iFld;
            for (i12 = 12; i12 < 246; ++i12) {
                for (f3 = 1; f3 < 7; ++f3) {
                    for (i15 = i12; 2 > i15; ++i15) {
                        lArr[i15 - 1] *= (long) 39.12329;
                        d -= -94;
                        i13 += (int) 14L;
                        Test0261.iFld += i16;
                        i13 += i16;
                        Test0261.iArrFld[i12 + 1] &= i16;
                    }
                    Test0261.lFld += (long) ((long) f3 | Test0261.lFld);
                    i = 113;
                }
            }
        } catch (UserDefinedExceptionTest0261 exc1) {
            i13 -= i13;
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + i + l + Float.floatToIntBits(f) + s + i12 + i13 +
                Float.floatToIntBits(f3) + i14 + i15 + i16 + FuzzerUtils.checkSum(lArr);
    }

    public static void main(String[] strArr) {

        try {
            Test0261 _instance = new Test0261();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i17 = -25592, i18 = -14, i19 = -60407, i20 = -12, i21 = -8, i22 = 3, i23 = -3;
        boolean b1 = true;
        float f4 = -11.159F;
        float[] fArr = new float[N];

        FuzzerUtils.init(fArr, 2.525F);

        vMeth(Test0261.dFld, Test0261.iFld, 46317L);
        Test0261.iFld = Test0261.iFld;
        lArrFld[(Test0261.iFld >>> 1) % N] = Test0261.iFld;
        Test0261.iArrFld[(Test0261.iFld >>> 1) % N] += Test0261.iFld;
        i17 = 180;
        while ((i17 -= 2) > 0) {
            if (true) continue;
            fArr[i17 - 1] = -65.34F;
            i18 = 1;
            while (++i18 < 278) {
                Test0261.fFld = Test0261.sFld;
                for (i19 = 1; 1 > i19; i19 += 3) {
                    Test0261.lFld -= i20;
                    if (b1) break;
                    Test0261.iFld >>= -44716;
                    if (b1) {
                        i20 <<= i18;
                        Test0261.instanceCount = i18;
                        Test0261.dFld *= Test0261.iFld;
                        Test0261.iFld1 = 57470;
                    } else {
                        if (b1) continue;
                        Test0261.iFld1 -= Test0261.iFld1;
                    }
                }
                for (f4 = 1; f4 > 1; --f4) {
                    i20 = i17;
                    Test0261.iFld += 160;
                    Test0261.iFld1 -= Test0261.iFld1;
                    Test0261.iArrFld[i17] -= i17;
                    Test0261.iFld = -14722;
                }
            }
            Test0261.iArrFld[i17 + 1] &= 205;
            for (i22 = 1; i22 < 278; ++i22) {
                Test0261.dFld -= i22;
                Test0261.instanceCount = Test0261.lFld;
            }
        }

        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 b1 f4 = " + i20 + "," + (b1 ? 1 : 0) + "," + Float.floatToIntBits(f4));
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test0261.instanceCount Test0261.iFld Test0261.lFld = " + Test0261.instanceCount + "," + Test0261.iFld +
                "," + Test0261.lFld);
        FuzzerUtils.out.println("Test0261.dFld Test0261.fFld Test0261.sFld = " + Double.doubleToLongBits(Test0261.dFld) + "," +
                Float.floatToIntBits(Test0261.fFld) + "," + Test0261.sFld);
        FuzzerUtils.out.println("Test0261.iFld1 Test0261.iArrFld lArrFld = " + Test0261.iFld1 + "," +
                FuzzerUtils.checkSum(Test0261.iArrFld) + "," + FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
}

///////////////////////////////////////////////////////////////////////
class UserDefinedExceptionTest0261 extends RuntimeException {
    public int field;
}

//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}