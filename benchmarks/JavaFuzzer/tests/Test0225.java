// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:58 2023
public class Test0225 {

    public static final int N = 400;

    public static long instanceCount = -223L;
    public static byte byFld = 117;
    public static float fFld = 2.99F;
    public static double dFld = -34.37236;
    public static int[] iArrFld = new int[N];
    public static volatile long[] lArrFld = new long[N];
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0225.iArrFld, -6);
        FuzzerUtils.init(Test0225.lArrFld, -612225055L);
    }

    public boolean bFld = true;

    public static int iMeth1(double d, int i4) {

        boolean b = true;
        boolean[] bArr = new boolean[N];
        int i5 = -240, i6 = -146, i7 = 42216, i8 = 2, i9 = -2, i10 = 12, i11 = -1;
        float f1 = 2.202F;

        FuzzerUtils.init(bArr, false);

        bArr[(i4 >>> 1) % N] = b;
        for (i5 = 7; i5 < 244; i5 += 3) {
            for (i7 = 1; i7 < 19; i7++) {
                i9 = 2;
                do {
                    try {
                        i6 = (Test0225.iArrFld[i9] % i4);
                        i4 = (i9 / 222913050);
                        i4 = (-16122 / i4);
                    } catch (ArithmeticException a_e) {
                    }
                    i6 += i7;
                    i6 = (int) Test0225.instanceCount;
                    Test0225.iArrFld[i5 + 1] = 202;
                    Test0225.byFld -= (byte) 7L;
                    f1 = Test0225.instanceCount;
                    Test0225.iArrFld[i5 + 1] -= 120;
                } while (--i9 > 0);
                for (i10 = 1; 2 > i10; ++i10) {
                    Test0225.byFld += (byte) i10;
                    i4 += i10;
                }
                i8 = (int) f1;
            }
        }
        long meth_res = Double.doubleToLongBits(d) + i4 + (b ? 1 : 0) + i5 + i6 + i7 + i8 + i9 +
                Float.floatToIntBits(f1) + i10 + i11 + FuzzerUtils.checkSum(bArr);
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public static int iMeth(int i2, long l) {

        float f = 109.74F;
        float[] fArr = new float[N];
        int i3 = -5, i12 = -23, i13 = -151, i14 = 35391, i15 = -241;
        long l1 = 37423L;
        boolean[] bArr1 = new boolean[N];

        FuzzerUtils.init(fArr, 120.321F);
        FuzzerUtils.init(bArr1, true);

        for (f = 12; 340 > f; ++f) {
            double d1 = 16.64649;
            Test0225.iArrFld[(int) (f - 1)] -= (int) ((Test0225.lArrFld[(int) (f + 1)] * (l * i3)) + iMeth1(d1, i3));
            for (i12 = 5; i12 > 1; i12 -= 2) {
                fArr[i12] *= -80.64F;
                for (i14 = 3; i14 > i12; --i14) {
                    bArr1[i14 - 1] = false;
                    i15 += (int) (-213282651666812795L + (i14 * i14));
                }
                Test0225.fFld += (i12 * i12);
                i15 += i12;
                Test0225.iArrFld[(int) (f)] -= i3;
                l1 += i13;
                i15 += i14;
                Test0225.instanceCount = (long) d1;
            }
            i2 = (int) f;
            d1 = 13;
        }
        long meth_res = i2 + l + Float.floatToIntBits(f) + i3 + i12 + i13 + i14 + i15 + l1 +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(bArr1);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth() {

        int i1 = -222;

        i1 >>>= iMeth(i1, -7396084418069472473L);
        vMeth_check_sum += i1;
    }

    public static void main(String[] strArr) {

        try {
            Test0225 _instance = new Test0225();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = 9, i16 = -55163, i17 = -57483, i18 = -9, i19 = -23582, i20 = -19905;
        long l2 = 1235708292L;
        byte[] byArr = new byte[N];

        FuzzerUtils.init(byArr, (byte) -41);

        byArr[(i >>> 1) % N] = (byte) (++Test0225.instanceCount);
        vMeth();
        i ^= i;
        Test0225.iArrFld[(i >>> 1) % N] <<= (int) 3L;
        for (i16 = 6; i16 < 313; i16++) {
            i += i16;
            i17 = i17;
            switch ((i16 % 7) + 13) {
                case 13:
                    if (bFld) {
                        Test0225.fFld *= 1920694818L;
                        Test0225.iArrFld = Test0225.iArrFld;
                    } else if (true) {
                        i = (int) Test0225.instanceCount;
                    }
                    i17 = 35;
                    i = i17;
                    break;
                case 14:
                    bFld = bFld;
                    break;
                case 15:
                    i17 -= (int) -2.634F;
                    i = (int) -21L;
                    for (i18 = 4; i18 < 82; i18++) {
                        byArr[i18] = (byte) 98;
                        Test0225.instanceCount += i19;
                        i17 += i18;
                        i17 += (198 + (i18 * i18));
                        Test0225.iArrFld[i18 - 1] -= i16;
                        for (l2 = 2; l2 > 1; --l2) {
                            i17 += (int) l2;
                            i17 -= i19;
                            i19 <<= i18;
                            Test0225.fFld = i16;
                            Test0225.instanceCount += (((l2 * i19) + i19) - Test0225.fFld);
                            i19 = (int) 3441L;
                        }
                    }
                    break;
                case 16:
                    i -= (int) Test0225.dFld;
                    break;
                case 17:
                    i20 += (-123 + (i16 * i16));
                    break;
                case 18:
                    i20 = i20;
                case 19:
                    i *= i20;
                    break;
            }
        }

        FuzzerUtils.out.println("i i16 i17 = " + i + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 i19 l2 = " + i18 + "," + i19 + "," + l2);
        FuzzerUtils.out.println("i20 byArr = " + i20 + "," + FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test0225.instanceCount Test0225.byFld Test0225.fFld = " + Test0225.instanceCount + "," + Test0225.byFld +
                "," + Float.floatToIntBits(Test0225.fFld));
        FuzzerUtils.out.println("bFld Test0225.dFld Test0225.iArrFld = " + (bFld ? 1 : 0) + "," +
                Double.doubleToLongBits(Test0225.dFld) + "," + FuzzerUtils.checkSum(Test0225.iArrFld));
        FuzzerUtils.out.println("Test0225.lArrFld = " + FuzzerUtils.checkSum(Test0225.lArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
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
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
