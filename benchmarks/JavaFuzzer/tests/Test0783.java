// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:13 2023
public class Test0783 {

    public static final int N = 400;

    public static long instanceCount = 3325L;
    public static int iFld = 128;
    public static double dFld = -79.122826;
    public static short sFld = 25925;
    public static int[] iArrFld = new int[N];
    public static double[] dArrFld = new double[N];
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    static {
        FuzzerUtils.init(Test0783.iArrFld, -13);
        FuzzerUtils.init(Test0783.dArrFld, -40.122754);
    }

    public float fFld = 60.520F;
    public boolean bFld = false;

    public static void vMeth2(long l, long l1, int i2) {

        int i3 = 47, i4 = 61722, i5 = -243, i6 = -2;
        boolean b = false;
        float f1 = -2.328F;
        double d = -52.6733;

        if (b) {
            for (i3 = 8; i3 < 211; i3++) {
                if (b) break;
                i5 = 1;
                while (++i5 < 8) {
                    i4 += (i5 | i3);
                    switch ((((i2 >>> 1) % 2) * 5) + 87) {
                        case 89:
                            l = (long) f1;
                            break;
                        case 90:
                            i4 >>= (int) Test0783.instanceCount;
                            l += i6;
                    }
                    f1 -= f1;
                    Test0783.instanceCount -= Test0783.iFld;
                    Test0783.instanceCount += (((i5 * i6) + i6) - f1);
                }
                if (i3 != 0) {
                    vMeth2_check_sum += l + l1 + i2 + i3 + i4 + (b ? 1 : 0) + i5 + Float.floatToIntBits(f1) + i6 +
                            Double.doubleToLongBits(d);
                    return;
                }
                i4 += (i3 + f1);
            }
            Test0783.iFld = (int) f1;
        } else {
            d -= f1;
        }
        vMeth2_check_sum += l + l1 + i2 + i3 + i4 + (b ? 1 : 0) + i5 + Float.floatToIntBits(f1) + i6 +
                Double.doubleToLongBits(d);
    }

    public static void vMeth1(float f) {

        int i = -11, i1 = -32395, i7 = -12721, i8 = 69, i9 = 20827, i10 = 14;
        long l2 = -2228330919L;

        for (i = 7; i < 267; i++) {
            vMeth2(Test0783.instanceCount, Test0783.instanceCount, i);
            for (i7 = 1; 6 > i7; i7++) {
                Test0783.instanceCount += (i7 - i7);
                Test0783.instanceCount += (long) Test0783.dFld;
                i8 = i8;
                Test0783.iArrFld[i7 + 1] *= i7;
                i1 *= (int) f;
                i1 += (((i7 * l2) + f) - i1);
                Test0783.dArrFld[i + 1] = -87;
            }
            for (i9 = 1; i9 < 6; i9++) {
                Test0783.iFld += (i9 * i9);
                i8 += (-132 + (i9 * i9));
                i1 -= (int) l2;
                i10 = (int) 70.950F;
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f) + i + i1 + i7 + i8 + l2 + i9 + i10;
    }

    public static void vMeth() {

        float f2 = -1.402F;
        int i11 = 12494, i12 = -1387, i13 = 2, i14 = -13, i15 = 8, i16 = 52858;
        short s = -26025;
        short[] sArr = new short[N];
        long l3 = 360436674943583024L;
        byte by = -77;
        boolean[] bArr = new boolean[N];

        FuzzerUtils.init(sArr, (short) 23986);
        FuzzerUtils.init(bArr, true);

        Test0783.iFld >>= (int) Math.min(Test0783.instanceCount, (Test0783.iFld * Test0783.instanceCount) + (Test0783.iFld + -10));
        vMeth1(f2);
        for (i11 = 203; i11 > 9; --i11) {
            for (i13 = 1; i13 < 8; ++i13) {
                Test0783.iArrFld[i13 - 1] += -54013;
                s = (short) i11;
                sArr[i11] = (short) Test0783.instanceCount;
                for (i15 = 1; i15 < 2; i15++) {
                    Test0783.iFld += (i15 | i16);
                    switch ((i11 % 10) + 43) {
                        case 43:
                            Test0783.instanceCount += i15;
                            Test0783.dFld = f2;
                        case 44:
                            Test0783.iFld |= (int) Test0783.instanceCount;
                            Test0783.iArrFld[i15 + 1] += Test0783.iFld;
                            i14 *= (int) l3;
                            break;
                        case 45:
                            i16 -= by;
                            break;
                        case 46:
                            Test0783.dFld = i12;
                        case 47:
                            Test0783.dArrFld[i11] *= Test0783.dFld;
                            break;
                        case 48:
                            f2 -= f2;
                            break;
                        case 49:
                            Test0783.instanceCount = Test0783.iFld;
                            break;
                        case 50:
                            Test0783.iFld -= (int) Test0783.dFld;
                        case 51:
                            s -= (short) 4709;
                            break;
                        case 52:
                            i12 >>= i14;
                            break;
                        default:
                            bArr[i11 - 1] = false;
                    }
                }
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f2) + i11 + i12 + i13 + i14 + s + i15 + i16 + l3 + by +
                FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(bArr);
    }

    public static void main(String[] strArr) {

        try {
            Test0783 _instance = new Test0783();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i17 = 177, i18 = 10, i19 = -5, i20 = -51850, i21 = -56281, i22 = 2976, i23 = 176, i24 = 6;
        byte by1 = 19;
        long l5 = -1L;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, 58L);

        vMeth();
        Test0783.iFld &= Test0783.iFld;
        i17 = 121;
        while (--i17 > 0) {
            Test0783.iFld = (int) Test0783.instanceCount;
            for (i18 = 10; i18 < 207; ++i18) {
                for (i20 = 1; i20 < 2; i20 += 3) {
                    Test0783.instanceCount = (long) 14.287F;
                    lArr[i17 + 1] += i20;
                    Test0783.dFld = -40560;
                    lArr[i20 + 1] = i20;
                    i19 += (int) -49L;
                    Test0783.iFld -= (int) fFld;
                }
                Test0783.instanceCount >>>= Test0783.instanceCount;
                switch ((i17 % 9) + 46) {
                    case 46:
                        i22 = 1;
                        do {
                            if (bFld) {
                                Test0783.iFld = i19;
                                fFld += i21;
                            } else if (bFld) {
                                Test0783.instanceCount += i22;
                                Test0783.instanceCount = by1;
                            } else {
                                i19 += (35 + (i22 * i22));
                                Test0783.instanceCount += (long) Test0783.dFld;
                                Test0783.iArrFld[i18 - 1] = i22;
                            }
                            Test0783.iArrFld[i22 - 1] <<= i19;
                        } while (++i22 < 2);
                        i21 += (((i18 * fFld) + i23) - i20);
                        if (true) continue;
                    case 47:
                        for (l5 = 1; l5 < 2; ++l5) {
                            Test0783.iArrFld[i17] = -93;
                            Test0783.iFld = Test0783.sFld;
                            Test0783.instanceCount = -226;
                        }
                        break;
                    case 48:
                        i19 += -3358;
                        break;
                    case 49:
                    case 50:
                        Test0783.iArrFld[i18 + 1] %= 41;
                    case 51:
                        i24 -= i23;
                        break;
                    case 52:
                        fFld = i21;
                        break;
                    case 53:
                        Test0783.dFld += i20;
                        break;
                    case 54:
                    default:
                        by1 += (byte) (-5 + (i18 * i18));
                }
            }
        }

        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("by1 i23 l5 = " + by1 + "," + i23 + "," + l5);
        FuzzerUtils.out.println("i24 lArr = " + i24 + "," + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test0783.instanceCount Test0783.iFld Test0783.dFld = " + Test0783.instanceCount + "," + Test0783.iFld +
                "," + Double.doubleToLongBits(Test0783.dFld));
        FuzzerUtils.out.println("fFld bFld Test0783.sFld = " + Float.floatToIntBits(fFld) + "," + (bFld ? 1 : 0) + "," +
                Test0783.sFld);
        FuzzerUtils.out.println("Test0783.iArrFld Test0783.dArrFld = " + FuzzerUtils.checkSum(Test0783.iArrFld) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0783.dArrFld)));

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