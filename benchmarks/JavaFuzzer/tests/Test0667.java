// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:10 2023
public class Test0667 {

    public static final int N = 400;

    public static long instanceCount = -36416L;
    public static int iFld = -34153;
    public static byte byFld = -39;
    public static double dFld = 72.102490;
    public static int[] iArrFld = new int[N];
    public static long[] lArrFld = new long[N];
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0667.iArrFld, -60747);
        FuzzerUtils.init(Test0667.lArrFld, 48948L);
    }

    public boolean bFld = false;
    public boolean[] bArrFld = new boolean[N];

    public static void vMeth1(long l) {

        float f2 = 0.439F;
        float[] fArr = new float[N];
        int i8 = 6, i9 = -46056, i10 = 114;

        FuzzerUtils.init(fArr, 123.245F);

        Test0667.iArrFld[(Test0667.iFld >>> 1) % N] += Test0667.byFld;
        Test0667.iFld >>= Test0667.iFld;
        fArr[(Test0667.iFld >>> 1) % N] -= Test0667.iFld;
        l |= Test0667.byFld;
        Test0667.iFld -= (int) f2;
        fArr[(Test0667.iFld >>> 1) % N] = l;
        Test0667.iFld <<= Test0667.iFld;
        i8 = 1;
        do {
            Test0667.byFld *= (byte) 11;
            for (i9 = 1; i9 < 7; ++i9) {
                Test0667.iArrFld[i9] *= Test0667.iFld;
                i10 += (i9 * Test0667.iFld);
                Test0667.byFld = (byte) Test0667.iFld;
            }
            Test0667.iFld += Test0667.byFld;
            fArr[i8] = Test0667.iFld;
        } while (++i8 < 234);
        vMeth1_check_sum += l + Float.floatToIntBits(f2) + i8 + i9 + i10 +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth(int i4) {

        float f1 = -52.91F, f3 = 111.525F;
        int i5 = -9, i6 = -50596, i7 = -11;
        boolean b = false;
        double d = -99.100419;
        double[] dArr = new double[N];

        FuzzerUtils.init(dArr, -1.95810);

        for (f1 = 6; f1 < 155; ++f1) {
            for (i6 = 1; i6 < 11; i6++) {
                vMeth1(-2178504625L);
                Test0667.instanceCount <<= i7;
                b = b;
                i5 -= i6;
                i5 = (int) Test0667.instanceCount;
                Test0667.instanceCount *= 1133755926L;
                i5 += (int) f1;
            }
            if (b) {
                dArr[(int) (f1)] = i6;
                d -= i7;
                f3 = Test0667.instanceCount;
            }
            Test0667.instanceCount = Test0667.instanceCount;
        }
        Test0667.byFld -= (byte) i6;
        vMeth_check_sum += i4 + Float.floatToIntBits(f1) + i5 + i6 + i7 + (b ? 1 : 0) + Double.doubleToLongBits(d) +
                Float.floatToIntBits(f3) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void main(String[] strArr) {

        try {
            Test0667 _instance = new Test0667();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public int iMeth(int i1) {

        int i2 = 143, i3 = 31829, i11 = 40408, i12 = 48450, i13 = 2, i14 = -13;
        boolean b1 = false;
        boolean[] bArr = new boolean[N];
        float f4 = 1.734F;

        FuzzerUtils.init(bArr, false);

        for (i2 = 12; i2 < 255; ++i2) {
            vMeth(i1);
            bArr[i2] = b1;
            for (i11 = 1; 7 > i11; i11++) {
                for (i13 = 2; i13 > 1; --i13) {
                    f4 += -33417;
                    i1 = -145;
                    i12 = (int) Test0667.instanceCount;
                }
                Test0667.instanceCount = i13;
                i3 = i14;
            }
            Test0667.iArrFld = Test0667.iArrFld;
        }
        long meth_res = i1 + i2 + i3 + (b1 ? 1 : 0) + i11 + i12 + i13 + i14 + Float.floatToIntBits(f4) +
                FuzzerUtils.checkSum(bArr);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i = 13538, i15 = 27, i16 = 190, i17 = 63529;
        float f = -103.837F;

        i = 1;
        do {
            short s = -19148;
            switch (((i >>> 1) % 8) + 14) {
                case 14:
                    s += (short) (((i * i) + f) - i);
                    Test0667.iFld = (int) ((Test0667.instanceCount--) + (Test0667.iFld = iMeth(i)));
                    Test0667.iFld += i;
                case 15:
                    Test0667.iFld |= Test0667.iFld;
                    break;
                case 16:
                    bArrFld[i - 1] = false;
                    Test0667.iFld *= Test0667.iFld;
                    break;
                case 17:
                    Test0667.iArrFld[i] = Test0667.iFld;
                    Test0667.lArrFld[i] = 37;
                    Test0667.iFld += Test0667.iFld;
                    Test0667.iFld = s;
                case 18:
                    Test0667.lArrFld[i + 1] = i;
                    Test0667.iArrFld = Test0667.iArrFld;
                    break;
                case 19:
                    Test0667.iFld <<= i;
                    if (bFld) break;
                    switch ((i % 7) + 110) {
                        case 110:
                            f -= (float) Test0667.dFld;
                        case 111:
                            switch ((i % 1) + 120) {
                                case 120:
                            }
                        case 112:
                            Test0667.iFld += (int) Test0667.dFld;
                            Test0667.iFld += (i - Test0667.instanceCount);
                            break;
                        case 113:
                            Test0667.iFld -= i;
                            Test0667.instanceCount ^= Test0667.instanceCount;
                            Test0667.iFld += i;
                            for (i15 = i; i15 < 164; i15++) {
                                try {
                                    i16 = (-201 / i15);
                                    Test0667.iFld = (i16 % -43);
                                    Test0667.iFld = (i16 % i15);
                                } catch (ArithmeticException a_e) {
                                }
                                i17 = 1;
                                while (++i17 < 1) {
                                    i16 += i17;
                                    Test0667.iArrFld[i17] = -8;
                                    i16 -= 91;
                                }
                            }
                            break;
                        case 114:
                            Test0667.byFld ^= (byte) i;
                            break;
                        case 115:
                            bArrFld[i] = bFld;
                            break;
                        case 116:
                            Test0667.instanceCount -= s;
                            break;
                    }
                    break;
                case 20:
                    Test0667.iFld = i16;
                    break;
                case 21:
                    f -= Test0667.instanceCount;
                    break;
                default:
                    i16 = (int) Test0667.instanceCount;
            }
        } while (++i < 153);

        FuzzerUtils.out.println("i f i15 = " + i + "," + Float.floatToIntBits(f) + "," + i15);
        FuzzerUtils.out.println("i16 i17 = " + i16 + "," + i17);

        FuzzerUtils.out.println("Test0667.instanceCount Test0667.iFld Test0667.byFld = " + Test0667.instanceCount + "," + Test0667.iFld +
                "," + Test0667.byFld);
        FuzzerUtils.out.println("bFld Test0667.dFld Test0667.iArrFld = " + (bFld ? 1 : 0) + "," +
                Double.doubleToLongBits(Test0667.dFld) + "," + FuzzerUtils.checkSum(Test0667.iArrFld));
        FuzzerUtils.out.println("bArrFld Test0667.lArrFld = " + FuzzerUtils.checkSum(bArrFld) + "," +
                FuzzerUtils.checkSum(Test0667.lArrFld));

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
