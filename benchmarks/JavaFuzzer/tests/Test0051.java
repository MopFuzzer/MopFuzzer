// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:54 2023
public class Test0051 {

    public static final int N = 400;

    public static long instanceCount = 58L;
    public static int iFld = 247;
    public static boolean bFld = false;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public float fFld = 0.227F;
    public double dFld = -127.56282;
    public int[][] iArrFld = new int[N][N];
    public boolean[] bArrFld = new boolean[N];

    public static long lMeth(long l1, long l2, int i11) {

        int i12 = -43501;
        int[] iArr2 = new int[N];
        byte by1 = -75;
        double d2 = 0.41868;

        FuzzerUtils.init(iArr2, 10);

        i12 = 1;
        do {
            by1 = (byte) Test0051.iFld;
            i11 *= (int) d2;
            i11 += i11;
            l1 *= 57L;
        } while (++i12 < 215);
        i11 += Test0051.iFld;
        long meth_res = l1 + l2 + i11 + i12 + by1 + Double.doubleToLongBits(d2) + FuzzerUtils.checkSum(iArr2);
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public static void vMeth1(int i4, long l, int i5) {

        int i6 = 22317;
        int i7 = 37673;
        int i8 = -20;
        int i9 = -82;
        int i10 = -244;
        int[] iArr1 = new int[N];
        double d1 = -27.8534;
        short[] sArr = new short[N];

        FuzzerUtils.init(iArr1, 16315);
        FuzzerUtils.init(sArr, (short) -2421);

        i6 += (int) ((++Test0051.instanceCount) % 0.68F);
        for (i7 = 2; i7 < 344; ++i7) {
            i9 = 1;
            while (++i9 < 5) {
                byte by = -107;
                try {
                    i5 = (iArr1[i9 + 1] % 45);
                    iArr1[i7] = (-101 / iArr1[i7 - 1]);
                    i4 = (i9 % -54);
                } catch (ArithmeticException a_e) {
                }
                by >>= (byte) (iArr1[i7 - 1]--);
                sArr[i7 - 1] -= (short) (d1++);
                i10 = 1;
                while (++i10 < 1) {
                    i6 += (int) (-119L + (i10 * i10));
                    by = (byte) i7;
                    Test0051.iFld *= i5;
                    Test0051.instanceCount += (i10 * i10);
                    i5 *= ((i7 + (Test0051.iFld + Test0051.iFld)) + i7);
                    i6 &= (int) (by / (lMeth(l, l, i9) | 1));
                    i6 = 16474;
                    i5 += Test0051.iFld;
                }
            }
        }
        vMeth1_check_sum += i4 + l + i5 + i6 + i7 + i8 + i9 + Double.doubleToLongBits(d1) + i10 +
                FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(sArr);
    }

    public static void main(String[] strArr2) {

        try {
            Test0051 _instance = new Test0051();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr2);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void vMeth(int i3) {

        int i14 = -2;
        int i15 = 34277;
        int i16 = -188;
        int i17 = -9;
        int[] iArr3 = new int[N];
        double d3 = 32.123600;
        float f2 = 2.451F;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, 3984228261429375201L);
        FuzzerUtils.init(iArr3, 26703);

        vMeth1(87, -8276780686422869644L, Test0051.iFld);
        for (i14 = 2; i14 < 378; ++i14) {
            if (true) {
                i15 <<= i15;
            } else if (Test0051.bFld) {
                lArr[i14 + 1] >>= Test0051.instanceCount;
                Test0051.instanceCount = i14;
            }
            d3 *= 109;
            i15 = 11;
            for (i16 = 4; i16 > 1; --i16) {
                try {
                    iArr3[i14] = (-156 / i16);
                    i15 = (i15 / i3);
                    Test0051.iFld = (-121 / i3);
                } catch (ArithmeticException a_e) {
                }
                switch (((i15 >>> 1) % 4) + 41) {
                    case 41:
                        i3 -= i16;
                        i17 *= (int) Test0051.instanceCount;
                        i17 *= i14;
                        break;
                    case 42:
                        iArr3[i14 - 1] *= (int) f2;
                    case 43:
                        if (i17 != 0) {
                            vMeth_check_sum += i3 + i14 + i15 + Double.doubleToLongBits(d3) + i16 + i17 +
                                    Float.floatToIntBits(f2) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr3);
                            return;
                        }
                        break;
                    case 44:
                        lArr[i14 - 1] = i16;
                        break;
                    default:
                        i17 *= (int) -1.748F;
                }
            }
        }
        vMeth_check_sum += i3 + i14 + i15 + Double.doubleToLongBits(d3) + i16 + i17 + Float.floatToIntBits(f2) +
                FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr3);
    }

    public void mainTest(String[] strArr3) {

        double d = -40.72167;
        int i2 = -30604, i18 = 2317, i19 = -219, i20 = 15, i21 = 6;
        byte by2 = 46;
        float f3 = 22.614F;
        float[] fArr = new float[N];
        long[] lArr1 = new long[N];

        FuzzerUtils.init(lArr1, -58134L);
        FuzzerUtils.init(fArr, -17.778F);

        for (d = 6; 246 > d; ++d) {
            vMeth(i2);
            fFld = i2;
            i2 -= (int) Test0051.instanceCount;
            Test0051.iFld += (int) fFld;
            iArrFld[(201 >>> 1) % N][(int) (d + 1)] += 2;
        }
        by2 += (byte) i2;
        for (i18 = 10; i18 < 334; ++i18) {
            short s = 18845;
            i2 -= s;
            iArrFld[i18][i18 - 1] -= i18;
            Test0051.bFld = true;
            Test0051.bFld = Test0051.bFld;
            lArr1[i18 + 1] += Test0051.instanceCount;
            i2 &= i19;
            i20 = 1;
            do {
                lArr1[i18] = i18;
                dFld -= i2;
                fFld += (i20 + i19);
                i2 += (i20 * i20);
                iArrFld = iArrFld;
                i19 += 14;
                Test0051.instanceCount <<= i20;
                Test0051.bFld = false;
            } while (++i20 < 78);
            i2 <<= i20;
            fFld += i18;
        }
        for (f3 = 11; f3 < 234; f3++) {
            lArr1[(int) (f3 + 1)] += (long) dFld;
        }
        bArrFld[(i19 >>> 1) % N] = false;
        Test0051.iFld -= i2;
        fArr = FuzzerUtils.float1array(N, (float) 1.883F);

        FuzzerUtils.out.println("d i2 by2 = " + Double.doubleToLongBits(d) + "," + i2 + "," + by2);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("f3 i21 lArr1 = " + Float.floatToIntBits(f3) + "," + i21 + "," +
                FuzzerUtils.checkSum(lArr1));
        FuzzerUtils.out.println("fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test0051.instanceCount Test0051.iFld Test0051.bFld = " + Test0051.instanceCount + "," + Test0051.iFld +
                "," + (Test0051.bFld ? 1 : 0));
        FuzzerUtils.out.println("fFld dFld iArrFld = " + Float.floatToIntBits(fFld) + "," +
                Double.doubleToLongBits(dFld) + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("bArrFld = " + FuzzerUtils.checkSum(bArrFld));

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
