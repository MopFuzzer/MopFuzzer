// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:09 2023
public class Test0632 {

    public static final int N = 400;

    public static long instanceCount = 1L;
    public static volatile int iFld = 1;
    public static int[] iArrFld = new int[N];
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0632.iArrFld, 205);
    }

    public byte byFld = -37;
    public double dFld = 80.94517;
    public volatile long[] lArrFld = new long[N];

    public static long lMeth() {

        int i5 = 10, i6 = -226, i7 = 67;
        boolean b1 = false;
        long l1 = -132L;
        float f2 = 2.974F;
        short[] sArr = new short[N];
        double[][] dArr = new double[N][N];

        FuzzerUtils.init(sArr, (short) 7940);
        FuzzerUtils.init(dArr, -9.5983);

        i5 = 1;
        do {
            sArr[i5 - 1] >>= (short) 69;
            i6 = 1;
            do {
                if (b1) continue;
                for (l1 = 1; 1 > l1; l1++) {
                    Test0632.instanceCount -= -14695;
                    i7 += (int) f2;
                    dArr[i6 + 1][i6] = i6;
                    f2 = i5;
                    i7 = i7;
                    f2 += Test0632.instanceCount;
                    i7 <<= i5;
                    i7 = (int) 3.202F;
                    i7 -= 63919;
                }
                i7 += -4;
            } while (++i6 < 10);
        } while (++i5 < 156);
        long meth_res = i5 + i6 + (b1 ? 1 : 0) + l1 + i7 + Float.floatToIntBits(f2) + FuzzerUtils.checkSum(sArr) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public static void vMeth1(int i4) {

        int i8 = 155, i9 = 10, i11 = -13, i12 = 4, i13 = -3;
        double d = 1.51924, d1 = 114.93699;
        boolean b2 = false;
        float f3 = -68.777F;
        float[] fArr = new float[N];

        FuzzerUtils.init(fArr, 0.634F);

        Test0632.iArrFld[(i4 >>> 1) % N] -= (int) lMeth();
        fArr = fArr;
        i8 = (int) Test0632.instanceCount;
        Test0632.iArrFld[(i8 >>> 1) % N] -= i9;
        fArr[(Test0632.iFld >>> 1) % N] = i4;
        for (int i10 : Test0632.iArrFld) {
            for (d = 1; d < 4; d++) {
                d1 -= i8;
                switch ((int) ((d % 3) + 59)) {
                    case 59:
                        if (b2) continue;
                        break;
                    case 60:
                        i9 += (int) ((long) d ^ Test0632.instanceCount);
                    case 61:
                        for (i12 = 2; i12 > 1; --i12) {
                            f3 = Test0632.instanceCount;
                            Test0632.iArrFld[(int) (d)] = 32978;
                            Test0632.iFld += (((i12 * i12) + f3) - Test0632.instanceCount);
                        }
                        break;
                }
            }
        }
        vMeth1_check_sum += i4 + i8 + i9 + Double.doubleToLongBits(d) + i11 + Double.doubleToLongBits(d1) + (b2 ? 1 :
                0) + i12 + i13 + Float.floatToIntBits(f3) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth(int i3) {

        float f = 1.553F, f1 = 85.584F;
        boolean b = false;
        boolean[] bArr = new boolean[N];
        int i14 = 143;
        int i15 = 167;
        int[] iArr = new int[N];
        short s = 19670;

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(iArr, -9);

        f = 1;
        do {
            i3 += (int) (Test0632.instanceCount + ((i3 - i3) + (i3 - i3)));
            b = (b = (bArr[(int) (f + 1)] ^ b));
            i3 += (int) f;
            Test0632.instanceCount += (long) (i3 - ((f - -13043) - Test0632.instanceCount));
            f1 *= iArr[(int) (f)];
            vMeth1(Test0632.iFld);
            for (i14 = 1; i14 < 5; ++i14) {
                try {
                    i15 = (11 % iArr[i14 - 1]);
                    Test0632.iFld = (i3 / i14);
                    i3 = (i15 % Test0632.iFld);
                } catch (ArithmeticException a_e) {
                }
                i15 = 5;
                Test0632.instanceCount &= Test0632.instanceCount;
                Test0632.iFld += (i14 ^ i14);
                s = (short) 150;
                f1 /= (i15 | 1);
                Test0632.iFld += (i14 * Test0632.iFld);
            }
        } while (++f < 306);
        vMeth_check_sum += i3 + Float.floatToIntBits(f) + (b ? 1 : 0) + Float.floatToIntBits(f1) + i14 + i15 + s +
                FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(iArr);
    }

    public static void main(String[] strArr) {

        try {
            Test0632 _instance = new Test0632();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = -57032, i1 = 6, i2 = 12060, i16 = -1, i17 = -36249, i18 = -99, i19 = -63265, i20 = 14, i21 = -28919, i22 = -9;
        long l = -4274093989L, l2 = -8039218134227557537L;
        short s1 = 8318;

        for (i = 10; i < 303; i++) {
            for (l = 4; l < 86; ++l) {
                vMeth(i2);
            }
        }
        i1 = i2;
        for (i16 = 12; i16 < 299; i16++) {
            i2 = 7;
            Test0632.iFld = (int) Test0632.instanceCount;
        }
        i18 = 1;
        while (++i18 < 136) {
            Test0632.iArrFld = Test0632.iArrFld;
            for (i19 = i18; i19 < 184; i19++) {
                switch ((i19 % 7) + 55) {
                    case 55:
                        i1 <<= 9;
                        lArrFld[i18 - 1] = -123;
                        i17 += (int) l2;
                        i17 *= i19;
                        break;
                    case 56:
                        i17 += (((i19 * i16) + l2) - i1);
                        break;
                    case 57:
                        s1 <<= (short) i19;
                        break;
                    case 58:
                    case 59:
                        try {
                            Test0632.iArrFld[i19] = (i19 / 1191321622);
                            i20 = (133 / i1);
                            i1 = (i20 / Test0632.iArrFld[i18]);
                        } catch (ArithmeticException a_e) {
                        }
                        break;
                    case 60:
                        byFld <<= (byte) Test0632.instanceCount;
                        i17 += i1;
                        break;
                    case 61:
                        for (i21 = 1; i21 < 1; i21++) {
                            int i23 = 11;
                            l2 += (-28630 + (i21 * i21));
                            Test0632.iFld |= (int) Test0632.instanceCount;
                            i17 -= (int) dFld;
                            i23 += Test0632.iFld;
                            i2 = Test0632.iFld;
                        }
                        i2 += (i19 * l2);
                        break;
                    default:
                        i22 >>= Test0632.iFld;
                        i22 = (int) l2;
                        Test0632.iFld -= Test0632.iFld;
                }
            }
        }

        FuzzerUtils.out.println("i i1 l = " + i + "," + i1 + "," + l);
        FuzzerUtils.out.println("i2 i16 i17 = " + i2 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("l2 s1 i21 = " + l2 + "," + s1 + "," + i21);
        FuzzerUtils.out.println("i22 = " + i22);

        FuzzerUtils.out.println("Test0632.instanceCount Test0632.iFld byFld = " + Test0632.instanceCount + "," + Test0632.iFld + "," +
                byFld);
        FuzzerUtils.out.println("dFld Test0632.iArrFld lArrFld = " + Double.doubleToLongBits(dFld) + "," +
                FuzzerUtils.checkSum(Test0632.iArrFld) + "," + FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}