// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:08 2023
public class Test0597 {

    public static final int N = 400;

    public static long instanceCount = -8706866004932605194L;
    public static float fFld = -78.733F;
    public static short sFld = 5782;
    public static long lFld = -49L;
    public static int iFld = -39093;
    public static volatile int[] iArrFld = new int[N];
    public static int[] iArrFld1 = new int[N];
    public static long[] lArrFld = new long[N];
    public static long byMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0597.iArrFld, 13);
        FuzzerUtils.init(Test0597.iArrFld1, 3566);
        FuzzerUtils.init(Test0597.lArrFld, -2701954581L);
    }

    public byte[] byArrFld = new byte[N];

    public static int iMeth(int i3, long l, int i4) {

        int i5 = -42182, i6 = 9677, i7 = -7, i8 = 39735, i9 = -7, i10 = 148, i11 = 23760, i12 = 201;
        float f = 0.925F;
        double d1 = 1.67947;
        boolean b1 = true;
        byte[] byArr = new byte[N];

        FuzzerUtils.init(byArr, (byte) 92);

        for (i5 = 11; i5 < 188; i5++) {
            i4 = (int) f;
        }
        for (i7 = 178; i7 > 11; i7 -= 3) {
            for (i9 = 1; i9 < 28; i9++) {
                i10 *= (int) f;
                i10 += (-47280 + (i9 * i9));
                if (b1) {
                    d1 -= i3;
                    byArr[i7] -= (byte) i8;
                    f += l;
                }
                Test0597.instanceCount = i9;
                for (i11 = 1; i11 < 2; i11++) {
                    Test0597.iArrFld[i9 - 1] = i10;
                    i8 *= i3;
                    i6 += i3;
                }
            }
        }
        long meth_res = i3 + l + i4 + i5 + i6 + Float.floatToIntBits(f) + i7 + i8 + i9 + i10 +
                Double.doubleToLongBits(d1) + (b1 ? 1 : 0) + i11 + i12 + FuzzerUtils.checkSum(byArr);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth() {

        double d = -2.117547;
        int i1 = 152, i2 = 10, i13 = -4, i14 = 14, i15 = -235, i16 = 53811, i17 = 13, i18 = -3;
        byte by1 = -120;
        boolean b2 = false;
        short s = -13170;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, 21L);

        d += (-Test0597.instanceCount);
        for (i1 = 10; 166 > i1; i1++) {
            i2 += (i1 ^ by1);
            Test0597.instanceCount = iMeth(-14, Test0597.instanceCount, -3);
            for (i13 = i1; 10 > i13; ++i13) {
                for (i15 = 1; i15 < 1; ++i15) {
                    Test0597.instanceCount <<= 11;
                    i14 += (i15 - i16);
                    b2 = b2;
                    i14 += (int) Test0597.instanceCount;
                }
                Test0597.fFld += (((i13 * i15) + Test0597.fFld) - Test0597.instanceCount);
            }
            for (i17 = 1; i17 < 10; i17++) {
                Test0597.fFld += (float) d;
                lArr[i17 + 1] <<= s;
            }
            i18 = (int) Test0597.fFld;
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + i1 + i2 + by1 + i13 + i14 + i15 + i16 + (b2 ? 1 : 0) + i17 +
                i18 + s + FuzzerUtils.checkSum(lArr);
    }

    public static void main(String[] strArr) {

        try {
            Test0597 _instance = new Test0597();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public byte byMeth(byte by, boolean b, int i) {

        int i19 = 3, i20 = -47884, i21 = 40228, i22 = -12;
        float f1 = -82.405F;
        long[] lArr1 = new long[N];

        FuzzerUtils.init(lArr1, -126L);

        vMeth();
        i19 = 133;
        while (--i19 > 0) {
            i = (int) Test0597.fFld;
            for (i20 = 12; i20 > 1; --i20) {
                for (f1 = 2; i19 < f1; f1--) {
                    i += (int) f1;
                    i >>= (int) Test0597.instanceCount;
                    Test0597.instanceCount *= Test0597.sFld;
                    i += (int) (f1 * f1);
                    switch ((int) (((f1 % 7) * 5) + 72)) {
                        case 106:
                            Test0597.iArrFld1[(int) (f1 - 1)] = i20;
                            Test0597.instanceCount += (long) (((f1 * Test0597.fFld) + Test0597.instanceCount) - Test0597.instanceCount);
                            break;
                        case 92:
                            i21 += i22;
                            i += (int) (((f1 * Test0597.instanceCount) + i21) - by);
                            i21 -= (int) f1;
                        case 74:
                            Test0597.fFld -= Test0597.instanceCount;
                            break;
                        case 85:
                            lArr1[i20 - 1] += (long) Test0597.fFld;
                            break;
                        case 79:
                            Test0597.lFld += 12;
                            break;
                        case 91:
                            Test0597.iArrFld[i20 + 1] = by;
                            break;
                        case 93:
                            Test0597.instanceCount += by;
                            break;
                        default:
                            Test0597.instanceCount |= by;
                    }
                }
            }
        }
        long meth_res = by + (b ? 1 : 0) + i + i19 + i20 + i21 + Float.floatToIntBits(f1) + i22 +
                FuzzerUtils.checkSum(lArr1);
        byMeth_check_sum += meth_res;
        return (byte) meth_res;
    }

    public void mainTest(String[] strArr1) {

        byte by2 = 126;
        boolean b3 = false;
        int i23 = -8, i24 = 61076, i25 = -18710, i27 = -13, i28 = -51185, i29 = 1, i30 = 14664, i31 = 0, i32 = -32132;
        double d2 = -115.59115;
        double[] dArr = new double[N];
        float[] fArr = new float[N];

        FuzzerUtils.init(fArr, -1.403F);
        FuzzerUtils.init(dArr, 6.47361);

        byMeth(by2, b3, i23);
        for (i24 = 3; 125 > i24; ++i24) {
            b3 = b3;
            fArr[i24 + 1] = i24;
            i25 += 21377;
        }
        fArr[(155 >>> 1) % N] *= Test0597.fFld;
        Test0597.lArrFld = FuzzerUtils.long1array(N, (long) 189L);
        for (i27 = 351; i27 > 10; i27 -= 3) {
            switch ((i27 % 2) + 78) {
                case 78:
                    switch ((i27 % 6) + 77) {
                        case 77:
                            for (i29 = 222; i29 > 2; --i29) {
                                Test0597.fFld *= i28;
                                Test0597.lArrFld[i29] = i24;
                                i28 += i23;
                                i31 = 1;
                                do {
                                    i23 += (i31 | i28);
                                    byArrFld[(154 >>> 1) % N] >>>= (byte) Test0597.lFld;
                                    i25 = (int) d2;
                                    if (b3) {
                                        try {
                                            i23 = (103 % i24);
                                            i30 = (i24 / -79);
                                            i23 = (i28 / i25);
                                        } catch (ArithmeticException a_e) {
                                        }
                                        i30 >>= (int) Test0597.lFld;
                                        i25 += i31;
                                        i30 += (i31 + Test0597.sFld);
                                    } else {
                                        dArr[i31] = by2;
                                        if (b3) continue;
                                    }
                                    Test0597.instanceCount -= Test0597.sFld;
                                } while (++i31 < 2);
                            }
                            i32 = 1;
                            while (++i32 < 222) {
                                i23 = i23;
                                Test0597.fFld += by2;
                                Test0597.sFld = (short) -204;
                            }
                            break;
                        case 78:
                            Test0597.lArrFld[i27 + 1] = i28;
                        case 79:
                            if (true) break;
                            break;
                        case 80:
                            Test0597.iFld += (-6 + (i27 * i27));
                            break;
                        case 81:
                            d2 += i27;
                            break;
                        case 82:
                            Test0597.sFld += (short) Test0597.fFld;
                            break;
                        default:
                            i30 -= (int) 7246629009671947742L;
                    }
                    break;
                case 79:
                    i28 += i27;
                    break;
                default:
                    i28 = -47766;
            }
        }

        FuzzerUtils.out.println("by2 b3 i23 = " + by2 + "," + (b3 ? 1 : 0) + "," + i23);
        FuzzerUtils.out.println("i24 i25 i27 = " + i24 + "," + i25 + "," + i27);
        FuzzerUtils.out.println("i28 i29 i30 = " + i28 + "," + i29 + "," + i30);
        FuzzerUtils.out.println("i31 d2 i32 = " + i31 + "," + Double.doubleToLongBits(d2) + "," + i32);
        FuzzerUtils.out.println("fArr dArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test0597.instanceCount Test0597.fFld Test0597.sFld = " + Test0597.instanceCount + "," +
                Float.floatToIntBits(Test0597.fFld) + "," + Test0597.sFld);
        FuzzerUtils.out.println("Test0597.lFld Test0597.iFld Test0597.iArrFld = " + Test0597.lFld + "," + Test0597.iFld + "," +
                FuzzerUtils.checkSum(Test0597.iArrFld));
        FuzzerUtils.out.println("Test0597.iArrFld1 Test0597.lArrFld byArrFld = " + FuzzerUtils.checkSum(Test0597.iArrFld1) + "," +
                FuzzerUtils.checkSum(Test0597.lArrFld) + "," + FuzzerUtils.checkSum(byArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("byMeth_check_sum: " + byMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  byMeth ->  byMeth mainTest
//DEBUG  vMeth ->  vMeth byMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth byMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
