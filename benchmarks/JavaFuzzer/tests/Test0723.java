// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:11 2023
public class Test0723 {

    public static final int N = 400;

    public static long instanceCount = -14L;
    public static int iFld = 137;
    public static float fFld = 1.185F;
    public static byte byFld = 68;
    public static double dFld = 122.55421;
    public static volatile int iFld1 = 21520;
    public static boolean bFld = true;
    public static double[] dArrFld = new double[N];
    public static int[] iArrFld = new int[N];
    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0723.dArrFld, 21.106541);
        FuzzerUtils.init(Test0723.iArrFld, -235);
    }

    public float[] fArrFld = new float[N];

    public static void vMeth1(long l1, int i4) {

        int i5 = 42;
        int i6 = -252;
        int i7 = 34051;
        int i8 = 11;
        int i9 = 128;
        int i10 = -9;
        int[] iArr = new int[N];
        double d2 = -2.48182;

        FuzzerUtils.init(iArr, 57675);

        Test0723.instanceCount = i4;
        i5 = 1;
        do {
            l1 = l1;
            Test0723.instanceCount = i4;
            i4 += (((i5 * i5) + Test0723.iFld) - Test0723.fFld);
            Test0723.instanceCount ^= i4;
            for (i6 = 1; i6 < 13; ++i6) {
                i7 = i4;
                Test0723.instanceCount = 110;
                i8 += (((i6 * Test0723.instanceCount) + Test0723.instanceCount) - i6);
                i4 = (int) 12L;
                for (i9 = 1; i9 < 2; i9++) {
                    d2 += i9;
                    iArr[i6] = 10;
                    i4 = (int) l1;
                }
            }
        } while (++i5 < 121);
        vMeth1_check_sum += l1 + i4 + i5 + i6 + i7 + i8 + i9 + i10 + Double.doubleToLongBits(d2) +
                FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i2) {

        double d1 = 64.82359;
        int i3 = 8;
        int[] iArr1 = new int[N];
        float f = 41.225F;
        long l2 = -5668183118172180264L;
        long[] lArr = new long[N];
        byte by = -32;

        FuzzerUtils.init(lArr, 8L);
        FuzzerUtils.init(iArr1, -35640);

        for (d1 = 7; d1 < 263; d1++) {
            Test0723.instanceCount = Test0723.instanceCount;
            Test0723.instanceCount >>= (long) (f - (++i2));
            i3 = (int) Test0723.instanceCount;
            vMeth1(Test0723.instanceCount, i3);
            i2 -= (int) d1;
            i2 -= Test0723.iFld;
            switch ((((i3 >>> 1) % 5) * 5) + 115) {
                case 129:
                    lArr[(int) (d1)] += Test0723.iFld;
                    switch ((int) (((d1 % 2) * 5) + 70)) {
                        case 78:
                            l2 -= Test0723.instanceCount;
                            break;
                        case 74:
                        default:
                            Test0723.iFld = i3;
                            Test0723.instanceCount += -70;
                            i2 += (int) l2;
                            Test0723.instanceCount += l2;
                    }
                case 134:
                    iArr1[(int) (d1 + 1)] -= by;
                case 139:
                case 116:
                    i3 >>>= by;
                    break;
                case 136:
                    i3 += (int) (d1 * d1);
                default:
                    Test0723.iFld = i3;
            }
        }
        vMeth_check_sum += i2 + Double.doubleToLongBits(d1) + i3 + Float.floatToIntBits(f) + l2 + by +
                FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1);
    }

    public static float fMeth(int i1) {

        double d = 24.77452;
        int i11 = 1;
        int i12 = -63619;
        int i13 = -3;
        int i14 = 7;
        int i15 = -11;
        int i16 = 4931;
        int[] iArr2 = new int[N];

        FuzzerUtils.init(iArr2, 0);

        d = 1;
        while (++d < 159) {
            vMeth(i1);
            Test0723.instanceCount += (-25 + (d * d));
            i1 = Test0723.byFld;
            for (i11 = 1; i11 < 10; ++i11) {
                Test0723.fFld += i1;
                for (i13 = 1; i13 < 2; ++i13) {
                    Test0723.instanceCount &= Test0723.instanceCount;
                    i1 *= -170;
                    iArr2[i13 - 1] >>= i11;
                }
            }
            i12 += (int) (27.231F + (d * d));
        }
        for (i15 = 2; i15 < 293; i15++) {
            Test0723.instanceCount = 53648L;
            Test0723.dFld = Test0723.fFld;
            i16 += (int) Test0723.fFld;
        }
        long meth_res = i1 + Double.doubleToLongBits(d) + i11 + i12 + i13 + i14 + i15 + i16 +
                FuzzerUtils.checkSum(iArr2);
        fMeth_check_sum += meth_res;
        return (float) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0723 _instance = new Test0723();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        long l = 8727818815444453821L;
        long[] lArr1 = new long[N];
        int i = -11, i17 = 11, i18 = 136, i19 = 0, i20 = 3, i21 = 5, i22 = 6, i23 = -10;
        short s = -13128;
        byte[] byArr = new byte[N];

        FuzzerUtils.init(lArr1, -5528458103737448952L);
        FuzzerUtils.init(byArr, (byte) -51);

        for (l = 226; l > 5; l--) {
            if (Test0723.bFld) {
                i += (int) l;
                Test0723.dArrFld[(int) (l - 1)] = ((fMeth(i) + Test0723.fFld) * i);
            } else if (Test0723.bFld) {
                Test0723.iArrFld[(int) (l + 1)] = (int) l;
                fArrFld[(int) (l - 1)] -= Test0723.iFld;
            } else if (Test0723.bFld) {
                lArr1[(int) (l + 1)] += s;
                if (false) continue;
                for (i17 = 3; i17 < 114; i17++) {
                    i19 = 1;
                    do {
                        i18 = (int) Test0723.instanceCount;
                        Test0723.iArrFld[i19 - 1] += Test0723.iFld;
                        i18 = s;
                        Test0723.iFld1 += i19;
                    } while (++i19 < 2);
                }
                i18 += (int) (((l * Test0723.iFld1) + s) - Test0723.fFld);
            } else {
                Test0723.iFld1 += Test0723.iFld;
                Test0723.bFld = Test0723.bFld;
            }
            for (i20 = 5; i20 < 114; i20 += 3) {
                switch (((-251 >>> 1) % 1) + 52) {
                    case 52:
                        Test0723.iArrFld = Test0723.iArrFld;
                        i21 -= (int) Test0723.dFld;
                        i18 = Test0723.iFld;
                        Test0723.fFld += (6338 + (i20 * i20));
                        break;
                    default:
                        for (i22 = 1; i22 < 4; i22++) {
                            i21 += (0 + (i22 * i22));
                            if (Test0723.bFld) continue;
                            byArr[(int) (l)] += (byte) Test0723.dFld;
                            Test0723.instanceCount -= i23;
                            i18 = (int) l;
                            i23 = Test0723.byFld;
                        }
                }
            }
        }

        FuzzerUtils.out.println("l i s = " + l + "," + i + "," + s);
        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 lArr1 byArr = " + i23 + "," + FuzzerUtils.checkSum(lArr1) + "," +
                FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test0723.instanceCount Test0723.iFld Test0723.fFld = " + Test0723.instanceCount + "," + Test0723.iFld +
                "," + Float.floatToIntBits(Test0723.fFld));
        FuzzerUtils.out.println("Test0723.byFld Test0723.dFld Test0723.iFld1 = " + Test0723.byFld + "," +
                Double.doubleToLongBits(Test0723.dFld) + "," + Test0723.iFld1);
        FuzzerUtils.out.println("Test0723.bFld Test0723.dArrFld Test0723.iArrFld = " + (Test0723.bFld ? 1 : 0) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0723.dArrFld)) + "," + FuzzerUtils.checkSum(Test0723.iArrFld));
        FuzzerUtils.out.println("fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
