// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:05 2023
public class Test0489 {

    public static final int N = 400;

    public static long instanceCount = -177L;
    public static byte byFld = 61;
    public static double dFld = 47.62111;
    public static int iFld = 0;
    public static int[] iArrFld = new int[N];
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    static {
        FuzzerUtils.init(Test0489.iArrFld, 0);
    }

    public static void vMeth2(int i7) {

        int i8 = -48239, i9 = 215, i10 = -133, i11 = -21, i12 = -22631;
        double d2 = 0.6659;
        float f1 = 48.149F;
        float[] fArr = new float[N];

        FuzzerUtils.init(fArr, 91.195F);

        for (i8 = 130; i8 > 8; --i8) {
            i7 = (int) Test0489.instanceCount;
            if (false) continue;
            try {
                i7 = (i7 % i7);
                i9 = (52366 % i8);
                i9 = (i7 / -32778);
            } catch (ArithmeticException a_e) {
            }
            i10 = 1;
            do {
                for (i11 = i8; i11 < 1; ++i11) {
                    switch ((i11 % 2) + 28) {
                        case 28:
                            i12 += i11;
                            Test0489.iArrFld[i10] += i9;
                        case 29:
                            i12 = i7;
                            break;
                        default:
                            d2 -= Test0489.instanceCount;
                    }
                    Test0489.instanceCount = 8L;
                    i12 += (int) Test0489.instanceCount;
                }
                f1 *= i11;
                Test0489.instanceCount = (long) f1;
            } while (++i10 < 13);
        }
        vMeth2_check_sum += i7 + i8 + i9 + i10 + i11 + i12 + Double.doubleToLongBits(d2) + Float.floatToIntBits(f1) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth1(int i2) {

        int i3 = -13, i4 = -186, i5 = 0, i6 = -61468;
        short s1 = 29160;
        short s2 = -23703;
        short[][] sArr1 = new short[N][N];
        double d1 = -126.82532;
        long l = -114L;

        FuzzerUtils.init(sArr1, (short) 6883);

        for (i3 = 6; i3 < 172; i3++) {
            for (i5 = 1; i5 < 10; ++i5) {
                try {
                    i6 = (i3 % Test0489.iArrFld[i5 - 1]);
                    Test0489.iArrFld[i3] = (i2 % i3);
                    i2 = (-370009917 % i4);
                } catch (ArithmeticException a_e) {
                }
                i6 *= (int) (s1 ^= (short) (Math.sqrt(d1) * i2));
                Test0489.byFld <<= (byte) ((--Test0489.instanceCount) - ((Test0489.instanceCount + i4) - Float.intBitsToFloat(i5)));
                i2 += (i5 | i5);
                i2 += i2;
                d1 = (sArr1[i5][i3]++);
                d1 += i6;
                Test0489.instanceCount += (-4965949938442315407L + (i5 * i5));
            }
            l <<= Test0489.iArrFld[i3 + 1];
            vMeth2(i3);
        }
        s1 -= (short) l;
        i6 = (int) Test0489.instanceCount;
        s2 = (short) i2;
        vMeth1_check_sum += i2 + i3 + i4 + i5 + i6 + s1 + Double.doubleToLongBits(d1) + l + s2 +
                FuzzerUtils.checkSum(sArr1);
    }

    public static void vMeth() {

        int i1 = -152, i13 = 8, i14 = 7, i15 = -10, i16 = -10;
        double d3 = 98.99040;
        boolean b = false;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, 1643122488L);

        Test0489.iArrFld[(8 >>> 1) % N] *= (--Test0489.byFld);
        i1 = 1;
        while (++i1 < 179) {
            vMeth1(i1);
            i13 += (int) 820783036L;
            switch ((((-196 >>> 1) % 5) * 5) + 47) {
                case 69:
                    for (d3 = 1; d3 < 9; ++d3) {
                        for (i15 = 1; i15 < 2; ++i15) {
                            lArr[i15 - 1] <<= i16;
                            Test0489.instanceCount = i16;
                            lArr[i15 + 1] = -4;
                            Test0489.dFld *= Test0489.instanceCount;
                            if (b) continue;
                            i16 = i15;
                        }
                        i16 <<= i1;
                        i13 >>= (int) Test0489.instanceCount;
                    }
                    break;
                case 64:
                    Test0489.instanceCount *= -54801;
                case 50:
                    Test0489.instanceCount = i14;
                case 70:
                    Test0489.instanceCount *= Test0489.instanceCount;
                    break;
                case 67:
                    Test0489.byFld |= (byte) Test0489.iFld;
                    break;
                default:
                    i13 = (int) -8466923932906812830L;
            }
        }
        vMeth_check_sum += i1 + i13 + Double.doubleToLongBits(d3) + i14 + i15 + i16 + (b ? 1 : 0) +
                FuzzerUtils.checkSum(lArr);
    }

    public static void main(String[] strArr) {

        try {
            Test0489 _instance = new Test0489();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = 4;
        double d = 2.79980;
        double[] dArr = new double[N];
        short[] sArr = new short[N];

        FuzzerUtils.init(sArr, (short) -29776);
        FuzzerUtils.init(dArr, -83.3141);

        for (short s : sArr) {
            try {
                Test0489.iArrFld[(i >>> 1) % N] = (-1775 % Test0489.iArrFld[(i >>> 1) % N]);
                i = (26746 % i);
                i = (880376200 % i);
            } catch (ArithmeticException a_e) {
            }
            i >>>= (i++);
            i = (int) Test0489.instanceCount;
            try {
                Test0489.iArrFld[(i >>> 1) % N] = (-45127 / i);
                i = (0 / i);
                Test0489.iArrFld[(i >>> 1) % N] = (i % -42167);
            } catch (ArithmeticException a_e) {
            }
            dArr[(i >>> 1) % N] *= d;
            vMeth();
            Test0489.iFld = i;
            i |= i;
            if (false) break;
        }

        FuzzerUtils.out.println("i d sArr = " + i + "," + Double.doubleToLongBits(d) + "," +
                FuzzerUtils.checkSum(sArr));
        FuzzerUtils.out.println("dArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test0489.instanceCount Test0489.byFld Test0489.dFld = " + Test0489.instanceCount + "," + Test0489.byFld +
                "," + Double.doubleToLongBits(Test0489.dFld));
        FuzzerUtils.out.println("Test0489.iFld Test0489.iArrFld = " + Test0489.iFld + "," + FuzzerUtils.checkSum(Test0489.iArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
