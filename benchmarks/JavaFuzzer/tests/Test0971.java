// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:17 2023
public class Test0971 {

    public static final int N = 400;

    public static long instanceCount = -9191492164131221472L;
    public static boolean bFld = false;
    public static short sFld = 15231;
    public static int[] iArrFld = new int[N];
    public static long[] lArrFld = new long[N];
    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0971.iArrFld, 10310);
        FuzzerUtils.init(Test0971.lArrFld, -3871798167672922639L);
    }

    public byte byFld = 55;
    public float[] fArrFld = new float[N];

    public static double dMeth(int i6, int i7) {

        int i8 = -222, i9 = 37789, i10 = -250, i11 = -246;
        float f3 = -120.34F;
        short[] sArr = new short[N];

        FuzzerUtils.init(sArr, (short) -15357);

        i6 <<= i6;
        Test0971.iArrFld = Test0971.iArrFld;
        for (i8 = 9; i8 < 303; ++i8) {
            i9 = (int) f3;
            Test0971.iArrFld[(i9 >>> 1) % N] = i8;
            i7 += (62940 + (i8 * i8));
            i9 += i8;
            Test0971.instanceCount *= i6;
            i9 -= (int) f3;
            for (i10 = 1; 6 > i10; ++i10) {
                double d = 10.107300;
                sArr[i10] += (short) d;
                if (Test0971.bFld) break;
                d *= Test0971.instanceCount;
                Test0971.iArrFld = Test0971.iArrFld;
                Test0971.instanceCount *= Test0971.instanceCount;
            }
        }
        long meth_res = i6 + i7 + i8 + i9 + Float.floatToIntBits(f3) + i10 + i11 + FuzzerUtils.checkSum(sArr);
        dMeth_check_sum += meth_res;
        return (double) meth_res;
    }

    public static int iMeth(int i5) {

        int i12 = -147, i13 = 26234, i14 = -7, i15 = -37, i16 = -11947, i17 = -12108, i18 = -38061;
        byte by1 = 42;
        double d1 = 112.31410;

        dMeth(i5, i5);
        for (i12 = 3; i12 < 245; ++i12) {
            for (i14 = 1; 7 > i14; i14++) {
                i5 += i15;
            }
            Test0971.iArrFld[i12] = by1;
            i5 = i13;
            for (d1 = 1; d1 < 7; d1++) {
                i15 += (int) ((long) d1 | i5);
                i16 += (int) (d1 * d1);
            }
            Test0971.instanceCount = 44;
            Test0971.instanceCount += i5;
        }
        for (i17 = 4; i17 < 319; i17++) {
            Test0971.iArrFld[i17] >>= 5;
            i15 &= i5;
            i16 = (int) d1;
        }
        long meth_res = i5 + i12 + i13 + i14 + i15 + by1 + Double.doubleToLongBits(d1) + i16 + i17 + i18;
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static long lMeth(float f1, int i3, byte by) {

        float f2 = -118.720F;
        int i4 = -215, i19 = 3720, i20 = 148, i21 = 62594, i22 = 13403;
        double d2 = 0.62450;
        short s = 5658;

        for (f2 = 11; 222 > f2; ++f2) {
            Test0971.instanceCount -= (-iMeth(i4));
            by += (byte) (f2 * i4);
            for (i19 = 8; i19 > 1; i19 -= 3) {
                d2 += i20;
                i20 = 17522;
                by >>>= (byte) i20;
            }
        }
        for (i21 = 14; i21 < 268; ++i21) {
            if (Test0971.bFld) break;
        }
        Test0971.instanceCount = i4;
        i3 >>= i21;
        Test0971.instanceCount -= Test0971.instanceCount;
        Test0971.iArrFld[(i3 >>> 1) % N] += -16462;
        Test0971.instanceCount += (long) f1;
        d2 -= s;
        long meth_res = Float.floatToIntBits(f1) + i3 + by + Float.floatToIntBits(f2) + i4 + i19 + i20 +
                Double.doubleToLongBits(d2) + i21 + i22 + s;
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0971 _instance = new Test0971();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = 2, i1 = -14, i23 = 46299, i24 = -6, i25 = -9, i26 = 0, i27 = -4, i28 = 189, i29 = 163, i30 = 5, i31 = 10, i32 = 58428, i33 = 94;
        float f = 53.274F;
        double d3 = -36.68376;

        for (i = 18; i < 288; ++i) {
            if (Test0971.bFld) {
                switch (((i % 10) * 5) + 92) {
                    case 140:
                        f += (((i * Test0971.instanceCount) + i1) - i);
                    case 103:
                        f -= ((--i1) - (++Test0971.instanceCount));
                        break;
                    case 112:
                        if (false) {
                            i1 += (int) ((--f) * ((92.94134 * Test0971.iArrFld[i - 1]) - (f++)));
                            Test0971.iArrFld[i] <<= (int) ((fArrFld[i] -= (byFld--)) + Math.min((int) (-174 - lMeth(f, i,
                                    byFld)), 241));
                            for (i23 = 5; i23 < 93; ++i23) {
                                f += Test0971.instanceCount;
                                for (i25 = 1; i25 < 2; ++i25) {
                                    i24 = -63466;
                                    Test0971.iArrFld[i25 - 1] <<= i25;
                                }
                                for (i27 = 1; i27 < 2; i27++) {
                                    Test0971.instanceCount <<= Test0971.instanceCount;
                                    Test0971.instanceCount += (((i27 * Test0971.sFld) + i28) - Test0971.instanceCount);
                                }
                                for (i29 = 1; i29 < 2; i29++) {
                                    d3 += i28;
                                    d3 += i1;
                                    i28 = i29;
                                    Test0971.iArrFld[i29] = i24;
                                    i24 = i26;
                                    d3 -= i29;
                                }
                                Test0971.instanceCount *= 19604;
                                i24 -= (int) 56856L;
                                if (Test0971.bFld) {
                                    i26 >>= i27;
                                    for (i31 = 1; i31 < 2; ++i31) {
                                        try {
                                            i28 = (i29 / 40524);
                                            i1 = (i23 % i23);
                                            i1 = (i24 % 10014);
                                        } catch (ArithmeticException a_e) {
                                        }
                                        i32 = i24;
                                    }
                                } else {
                                    Test0971.iArrFld[i + 1] %= (int) (Test0971.instanceCount | 1);
                                }
                            }
                        } else if (Test0971.bFld) {
                            if (Test0971.bFld) break;
                        } else {
                            Test0971.iArrFld[i - 1] *= (int) f;
                        }
                    case 142:
                        Test0971.instanceCount += -1;
                        break;
                    case 97:
                        byFld <<= (byte) i;
                        break;
                    case 128:
                        byFld = (byte) -114.980F;
                    case 107:
                        Test0971.instanceCount = (long) f;
                        break;
                    case 104:
                        i24 += (((i * i25) + i27) - i28);
                        break;
                    case 106:
                        Test0971.lArrFld = Test0971.lArrFld;
                        break;
                    case 135:
                        f -= byFld;
                        break;
                }
            } else if (Test0971.bFld) {
                f += (i * i33);
            }
        }

        FuzzerUtils.out.println("i i1 f = " + i + "," + i1 + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 i27 i28 = " + i26 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("i29 i30 d3 = " + i29 + "," + i30 + "," + Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("i31 i32 i33 = " + i31 + "," + i32 + "," + i33);

        FuzzerUtils.out.println("Test0971.instanceCount byFld Test0971.bFld = " + Test0971.instanceCount + "," + byFld + "," +
                (Test0971.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0971.sFld Test0971.iArrFld fArrFld = " + Test0971.sFld + "," +
                FuzzerUtils.checkSum(Test0971.iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));
        FuzzerUtils.out.println("Test0971.lArrFld = " + FuzzerUtils.checkSum(Test0971.lArrFld));

        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  iMeth ->  iMeth lMeth mainTest
//DEBUG  dMeth ->  dMeth iMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
