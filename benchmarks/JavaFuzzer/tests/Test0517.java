// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:06 2023
public class Test0517 {

    public static final int N = 400;

    public static long instanceCount = -32374L;
    public static short sFld = 28130;
    public static double dFld = 66.101549;
    public static int iFld = -48738;
    public static int[] iArrFld = new int[N];
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long lMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0517.iArrFld, -12);
    }

    public boolean bFld = false;
    public float fFld = -2.178F;

    public static long lMeth1() {

        float f = -104.486F;
        float[] fArr = new float[N];
        int i6 = -47757, i7 = 10, i8 = 53, i9 = -12, i10 = 71, i11 = 162;
        byte by = 79;

        FuzzerUtils.init(fArr, 28.1018F);

        f = Test0517.instanceCount;
        i6 -= i6;
        by -= (byte) -139;
        Test0517.instanceCount <<= i6;
        i7 = 1;
        while (++i7 < 190) {
            for (i8 = 1; i8 < 8; i8++) {
                i9 += (((i8 * i7) + i8) - i6);
                fArr[i8 + 1] /= (i9 | 1);
                for (i10 = 1; i10 < 2; i10++) {
                    Test0517.instanceCount = 40203;
                    i6 += (int) Test0517.instanceCount;
                    i6 -= (int) -2.118325;
                    i6 = -6;
                    Test0517.instanceCount %= (i9 | 1);
                    Test0517.iArrFld[i7] ^= (int) Test0517.instanceCount;
                }
            }
        }
        long meth_res = Float.floatToIntBits(f) + i6 + by + i7 + i8 + i9 + i10 + i11 +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        lMeth1_check_sum += meth_res;
        return (long) meth_res;
    }

    public static long lMeth(int i2, int i3, double d) {

        int i4 = 18, i5 = 14, i12 = -7, i13 = 44395, i14 = 189, i15 = -6;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, -1473726851L);

        for (i4 = 10; 279 > i4; ++i4) {
            i3 += (((i4 * i4) + i5) - i5);
        }
        i3 *= (int) ((i5 * Double.longBitsToDouble(Test0517.instanceCount)) + (i3 + (--Test0517.iArrFld[(i4 >>> 1) % N])));
        d = (Math.max(lMeth1(), Test0517.instanceCount) + i4);
        for (i12 = 9; 391 > i12; ++i12) {
            lArr[(i5 >>> 1) % N] = -147;
            d -= i5;
            for (i14 = 1; i14 < 4; ++i14) {
                i13 += (((i14 * i15) + i2) - i13);
                try {
                    i2 = (2029564815 % Test0517.iArrFld[i12 + 1]);
                    i13 = (i13 / i5);
                    Test0517.iArrFld[i12 + 1] = (i12 / i14);
                } catch (ArithmeticException a_e) {
                }
                Test0517.instanceCount -= i4;
                Test0517.instanceCount += Test0517.instanceCount;
                lArr[i12] = i15;
            }
            lArr[i12 - 1] = Test0517.instanceCount;
            try {
                i5 = (i2 % i2);
                i15 = (-464 % i13);
                i3 = (46004 % i5);
            } catch (ArithmeticException a_e) {
            }
        }
        long meth_res = i2 + i3 + Double.doubleToLongBits(d) + i4 + i5 + i12 + i13 + i14 + i15 +
                FuzzerUtils.checkSum(lArr);
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public static void vMeth(long l, long l1) {

        int i1 = 133, i16 = 60, i17 = 59389, i18 = 0, i19 = -3, i20 = 246, i21 = -6, i22 = -113, i23 = -9;
        double d1 = 1.128662;
        long l2 = -9183422793600664644L;
        float f1 = 51.43F;

        i1 = 1;
        while (++i1 < 260) {
            Test0517.sFld >>>= (short) lMeth(-60741, i1, Test0517.dFld);
            for (i16 = i1; i16 < 6; i16++) {
                Test0517.iArrFld = Test0517.iArrFld;
                l1 = Test0517.instanceCount;
                for (i18 = 1; 1 > i18; ++i18) {
                    l1 = i17;
                }
            }
            i19 -= (int) Test0517.dFld;
            Test0517.iFld += (i1 * l1);
            for (i20 = 1; i20 < 6; ++i20) {
                i22 = 1;
                while (++i22 < 2) {
                    i21 -= Test0517.iFld;
                }
                for (d1 = 1; d1 < 2; d1++) {
                    l2 += i1;
                    Test0517.instanceCount += (long) (((d1 * i18) + f1) - f1);
                }
            }
        }
        vMeth_check_sum += l + l1 + i1 + i16 + i17 + i18 + i19 + i20 + i21 + i22 + Double.doubleToLongBits(d1) + i23 +
                l2 + Float.floatToIntBits(f1);
    }

    public static void main(String[] strArr) {

        try {
            Test0517 _instance = new Test0517();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = -159, i24 = 176, i25 = -18243, i26 = 7, i27 = 8, i28 = -65;
        boolean b = false, b1 = true;

        i = 1;
        do {
            Test0517.instanceCount += (i * i);
            bFld = bFld;
            vMeth(Test0517.instanceCount, Test0517.instanceCount);
            switch ((i % 3) + 114) {
                case 114:
                    Test0517.iArrFld[i] |= -34432;
                    Test0517.iFld -= Test0517.iFld;
                    Test0517.iFld *= i;
                case 115:
                    if (bFld) break;
                    Test0517.iFld *= Test0517.iFld;
                    if (b) {
                        bFld = bFld;
                        b = b;
                    }
                    fFld = -64.394F;
                    break;
                case 116:
                    Test0517.iFld = Test0517.iFld;
                    i24 = 1;
                    do {
                        Test0517.iFld -= (int) 4L;
                        Test0517.iArrFld[i - 1] *= i24;
                        Test0517.iFld ^= i;
                        bFld = bFld;
                        if (bFld) continue;
                        bFld = b1;
                        Test0517.instanceCount += (((i24 * i) + i) - Test0517.iFld);
                    } while (++i24 < 99);
                    break;
                default:
                    for (i25 = 5; i25 < 99; ++i25) {
                        for (i27 = 1; i27 < 2; ++i27) {
                            Test0517.iFld = i;
                            Test0517.iFld = (int) Test0517.instanceCount;
                            Test0517.sFld /= (short) (Test0517.iFld | 1);
                        }
                        Test0517.iArrFld[i + 1] -= 2;
                        Test0517.dFld -= i28;
                    }
            }
        } while (++i < 253);

        FuzzerUtils.out.println("i b i24 = " + i + "," + (b ? 1 : 0) + "," + i24);
        FuzzerUtils.out.println("b1 i25 i26 = " + (b1 ? 1 : 0) + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 i28 = " + i27 + "," + i28);

        FuzzerUtils.out.println("Test0517.instanceCount bFld Test0517.sFld = " + Test0517.instanceCount + "," + (bFld ? 1 : 0) +
                "," + Test0517.sFld);
        FuzzerUtils.out.println("Test0517.dFld Test0517.iFld fFld = " + Double.doubleToLongBits(Test0517.dFld) + "," + Test0517.iFld +
                "," + Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("Test0517.iArrFld = " + FuzzerUtils.checkSum(Test0517.iArrFld));

        FuzzerUtils.out.println("lMeth1_check_sum: " + lMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  lMeth1 ->  lMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
