// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:07 2023
public class Test0552 {

    public static final int N = 400;

    public static long instanceCount = -24349L;
    public static long lFld = -2L;
    public static short sFld = -26231;
    public static long[] lArrFld = new long[N];
    public static float[][] fArrFld = new float[N][N];
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0552.lArrFld, -132L);
        FuzzerUtils.init(Test0552.fArrFld, 2.604F);
    }

    public int iFld = -195;

    public static void vMeth1(int i3, int i4, float f1) {

        int i5 = -48;
        int i6 = 43895;
        int i7 = 3105;
        int i8 = -7;
        int[] iArr = new int[N];
        boolean b = false;
        long l1 = 65224L;

        FuzzerUtils.init(iArr, 26776);

        for (i5 = 6; i5 < 178; ++i5) {
            double d1 = -105.104573;
            d1 = f1;
            i4 -= i6;
            f1 -= Test0552.instanceCount;
            Test0552.instanceCount += (i5 * i5);
        }
        i7 = 1;
        while (++i7 < 343) {
            iArr[i7] = (int) Test0552.instanceCount;
            Test0552.instanceCount += (i7 * i7);
            try {
                i3 = (i4 % i6);
                i3 = (i7 % i4);
                i4 = (-53920 / i7);
            } catch (ArithmeticException a_e) {
            }
        }
        b = b;
        i8 = 360;
        do {
            Test0552.lArrFld[i8] >>= -5257;
            i3 += (i8 * l1);
            i6 += i3;
            i6 = -54367;
        } while (--i8 > 0);
        vMeth1_check_sum += i3 + i4 + Float.floatToIntBits(f1) + i5 + i6 + i7 + (b ? 1 : 0) + i8 + l1 +
                FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i1, int i2) {

        float f2 = -2.50F, f3 = 117.660F;
        int i9 = 13;
        int i10 = -46375;
        int i11 = 37076;
        int i12 = -12235;
        int[] iArr1 = new int[N];
        long l2 = -4L;
        boolean b1 = false;
        double d2 = -83.11615;
        short s = 13820;

        FuzzerUtils.init(iArr1, -10);

        vMeth1(i1, i1, 1.308F);
        i1 = i1;
        for (f2 = 6; f2 < 135; ++f2) {
            for (i10 = (int) (f2); i10 < 12; i10++) {
                for (l2 = 1; l2 > 1; l2 -= 3) {
                    if (i9 != 0) {
                        vMeth_check_sum += i1 + i2 + Float.floatToIntBits(f2) + i9 + i10 + i11 + l2 + i12 + (b1 ? 1 :
                                0) + Double.doubleToLongBits(d2) + Float.floatToIntBits(f3) + s +
                                FuzzerUtils.checkSum(iArr1);
                        return;
                    }
                    switch ((int) ((l2 % 2) + 22)) {
                        case 22:
                            b1 = b1;
                            break;
                        case 23:
                            d2 += d2;
                            switch (((i10 % 10) * 5) + 37) {
                                case 86:
                                    i11 = i1;
                                    i9 = i11;
                                    Test0552.instanceCount += l2;
                                    i11 += (int) (l2 + l2);
                                case 83:
                                    d2 = Test0552.instanceCount;
                                    break;
                                case 84:
                                    f3 = 215;
                                    break;
                                case 75:
                                    Test0552.fArrFld[(int) (f2)][i10] += i10;
                                    break;
                                case 82:
                                    Test0552.instanceCount = i1;
                                case 76:
                                    Test0552.instanceCount += (l2 + f2);
                                    break;
                                case 65:
                                    i12 += (int) (((l2 * i12) + i10) - i1);
                                    break;
                                case 70:
                                    i1 = -58;
                                case 54:
                                    i11 *= (int) d2;
                                case 55:
                                    iArr1 = FuzzerUtils.int1array(N, (int) -32);
                                    break;
                            }
                        default:
                            i9 += s;
                    }
                }
            }
        }
        vMeth_check_sum += i1 + i2 + Float.floatToIntBits(f2) + i9 + i10 + i11 + l2 + i12 + (b1 ? 1 : 0) +
                Double.doubleToLongBits(d2) + Float.floatToIntBits(f3) + s + FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth(long l) {

        int i = -101, i13 = 7, i14 = -9, i15 = 213, i16 = -154, i17 = -38373;
        float f = -1.779F;
        double d = 114.17754, d3 = 2.45309;
        byte by = -120;

        i *= (int) (Math.max((long) (i - f), l) + Test0552.instanceCount);
        d *= (l -= (--i));
        vMeth(33, i);
        for (d3 = 16; d3 < 302; ++d3) {
            f *= Test0552.lFld;
            i = by;
            i13 += (int) f;
            for (i14 = 1; i14 < 6; i14++) {
                Test0552.lArrFld[i14 + 1] <<= -149;
                for (i16 = 1; i16 < 2; ++i16) {
                    i15 = (int) Test0552.instanceCount;
                    i17 = i16;
                    i17 -= i14;
                    i15 -= 1;
                    i17 -= Test0552.sFld;
                }
            }
        }
        long meth_res = l + i + Float.floatToIntBits(f) + Double.doubleToLongBits(d) + Double.doubleToLongBits(d3) +
                i13 + by + i14 + i15 + i16 + i17;
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0552 _instance = new Test0552();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i18 = -17768;
        int i19 = -116;
        int i20 = 237;
        int i21 = 30351;
        int i23 = -11;
        int i24 = 233;
        int i25 = 18857;
        int[] iArr2 = new int[N];
        int[][] iArr3 = new
                int[N][N];
        boolean b2 = true;
        float f4 = -63.151F;
        byte by1 = 102;
        double d4 = 43.26821;

        FuzzerUtils.init(iArr2, -69);
        FuzzerUtils.init(iArr3, -199);

        iFld <<= iMeth(Test0552.lFld);
        iFld <<= iFld;
        if (true) {
            Test0552.lArrFld[(iFld >>> 1) % N] *= iFld;
        } else if (true) {
            for (i18 = 8; i18 < 264; ++i18) {
                for (i20 = 98; i20 > i18; --i20) {
                    try {
                        i19 = (-59 % i19);
                        i21 = (iArr2[i20 - 1] % i19);
                        i21 = (-52517 / iFld);
                    } catch (ArithmeticException a_e) {
                    }
                    i19 -= i21;
                    if (b2) break;
                    iFld = i18;
                    Test0552.instanceCount = Test0552.lFld;
                    if (b2) break;
                    Test0552.instanceCount += (((i20 * i19) + i20) - Test0552.instanceCount);
                    f4 = i20;
                }
                iArr3 = iArr3;
                by1 += (byte) i18;
                i19 += (i18 | Test0552.instanceCount);
            }
            for (i23 = 10; i23 < 337; ++i23) {
                Test0552.instanceCount += i23;
                i24 *= 208;
                Test0552.instanceCount += (i23 - i21);
                iArr2 = iArr2;
                f4 += (((i23 * by1) + i19) - i21);
                i24 = i21;
                i25 = 1;
                do {
                    i19 >>>= i20;
                    switch ((i23 % 2) + 58) {
                        case 58:
                            d4 += by1;
                            iFld = (int) d4;
                            break;
                        case 59:
                            Test0552.instanceCount = -10;
                            break;
                    }
                } while (++i25 < 77);
            }
        } else {
            Test0552.lArrFld[(-8 >>> 1) % N] -= i21;
        }

        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 b2 f4 = " + i21 + "," + (b2 ? 1 : 0) + "," + Float.floatToIntBits(f4));
        FuzzerUtils.out.println("by1 i23 i24 = " + by1 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 d4 iArr2 = " + i25 + "," + Double.doubleToLongBits(d4) + "," +
                FuzzerUtils.checkSum(iArr2));
        FuzzerUtils.out.println("iArr3 = " + FuzzerUtils.checkSum(iArr3));

        FuzzerUtils.out.println("Test0552.instanceCount iFld Test0552.lFld = " + Test0552.instanceCount + "," + iFld + "," +
                Test0552.lFld);
        FuzzerUtils.out.println("Test0552.sFld Test0552.lArrFld Test0552.fArrFld = " + Test0552.sFld + "," +
                FuzzerUtils.checkSum(Test0552.lArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0552.fArrFld)));

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