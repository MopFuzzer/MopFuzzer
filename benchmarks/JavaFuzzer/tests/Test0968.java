// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:17 2023
public class Test0968 {

    public static final int N = 400;

    public static long instanceCount = -200L;
    public static float fFld = -1.343F;
    public static int[] iArrFld = new int[N];
    public static long[] lArrFld = new long[N];
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    static {
        FuzzerUtils.init(Test0968.iArrFld, -31174);
        FuzzerUtils.init(Test0968.lArrFld, 3917603855L);
    }

    public int iFld = 33992;

    public static void vMeth2(long l) {

        long l1 = 142L;
        int i4 = -2963;
        float f = 92.841F;

        for (l1 = 8; 172 > l1; l1++) {
            f /= (i4 | 1);
        }
        vMeth2_check_sum += l + l1 + i4 + Float.floatToIntBits(f);
    }

    public static void vMeth1(int i2, int i3) {

        long l2 = 8L;
        long l3 = -44461L;
        long[] lArr = new long[N];
        int i5 = -15094;
        int i6 = 21;
        int i7 = -17685;
        int i8 = 59780;
        int[] iArr = new int[N];
        double d = -35.71785;
        short s = 24301;
        boolean b = true;

        FuzzerUtils.init(lArr, 7324735815335434704L);
        FuzzerUtils.init(iArr, -128);

        vMeth2(-8459739390304445841L);
        for (l2 = 7; l2 < 186; ++l2) {
            i3 -= i2;
            i3 >>= i2;
            for (l3 = 1; l3 < 9; l3++) {
                d = Test0968.fFld;
                Test0968.fFld += (l3 * l3);
                i5 >>= (int) l3;
                for (i7 = 1; i7 < 2; ++i7) {
                    switch ((int) ((l2 % 10) + 86)) {
                        case 86:
                            lArr[i7] |= s;
                            i2 <<= i2;
                            i2 = i7;
                        case 87:
                            i5 += 89;
                            if (b) break;
                            break;
                        case 88:
                            Test0968.fFld = -2.375F;
                        case 89:
                            Test0968.instanceCount >>>= Test0968.instanceCount;
                            break;
                        case 90:
                        case 91:
                            i3 = i5;
                            break;
                        case 92:
                            lArr[i7 + 1] -= i3;
                            break;
                        case 93:
                            Test0968.instanceCount += Test0968.instanceCount;
                            break;
                        case 94:
                            i2 += i5;
                        case 95:
                            iArr[(int) (l3 + 1)] = (int) Test0968.fFld;
                    }
                }
            }
        }
        vMeth1_check_sum += i2 + i3 + l2 + i5 + l3 + i6 + Double.doubleToLongBits(d) + i7 + i8 + s + (b ? 1 : 0) +
                FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth() {

        int i9 = 157, i10 = 13, i11 = 42119, i12 = 215;
        long l4 = -4649L;
        float[] fArr = new float[N];

        FuzzerUtils.init(fArr, -126.853F);

        vMeth1(-6, i9);
        i9 *= -36167;
        for (l4 = 3; 171 > l4; l4 += 2) {
            switch ((int) ((l4 % 1) + 124)) {
                case 124:
                    i10 /= (int) (i10 | 1);
                    fArr[(int) (l4)] = i10;
                    if (i9 != 0) {
                        vMeth_check_sum += i9 + l4 + i10 + i11 + i12 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                        return;
                    }
                    switch ((int) ((l4 % 1) + 32)) {
                        case 32:
                            for (i11 = 1; i11 < 18; i11++) {
                                try {
                                    i9 = (i12 % -173);
                                    i10 = (-22 % Test0968.iArrFld[i11 + 1]);
                                    Test0968.iArrFld[(int) (l4 + 1)] = (Test0968.iArrFld[(int) (l4 + 1)] / i11);
                                } catch (ArithmeticException a_e) {
                                }
                                i9 = 31477;
                                if (i9 != 0) {
                                    vMeth_check_sum += i9 + l4 + i10 + i11 + i12 +
                                            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                                    return;
                                }
                                Test0968.iArrFld[i11] -= i12;
                                i9 -= (int) Test0968.fFld;
                                Test0968.fFld = i10;
                            }
                            break;
                        default:
                            Test0968.instanceCount /= (i9 | 1);
                    }
                    break;
                default:
                    Test0968.iArrFld[(int) (l4 + 1)] *= (int) Test0968.instanceCount;
            }
        }
        vMeth_check_sum += i9 + l4 + i10 + i11 + i12 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void main(String[] strArr) {

        try {
            Test0968 _instance = new Test0968();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = 8, i1 = 189, i13 = -54932, i14 = 65121;
        long l5 = -1993152037L, l6 = 231L;
        byte by = 0;
        double d1 = -95.130459;
        double[] dArr = new double[N];
        boolean b1 = true;
        short s1 = -32063;

        FuzzerUtils.init(dArr, 110.96093);

        for (i = 4; i < 202; i++) {
            vMeth();
            l5 = 1;
            do {
                i13 *= -7;
                Test0968.fFld = -100;
                i1 += i1;
                i13 = by;
                i1 |= i;
                dArr[(int) (l5 + 1)] -= Test0968.fFld;
            } while (++l5 < 127);
            switch ((((i >>> 1) % 7) * 5) + 97) {
                case 117:
                    Test0968.iArrFld[i + 1] *= (int) 6L;
                    i13 <<= i;
                    d1 = 1;
                    while (++d1 < 127) {
                        i1 -= i;
                        i14 = 1;
                        while (++i14 < 1) {
                            Test0968.instanceCount += -33620;
                            Test0968.iArrFld[(int) (d1 + 1)] = (int) 119.824F;
                            Test0968.lArrFld[i14] >>= l5;
                            if (false) {
                                switch ((i % 7) + 10) {
                                    case 10:
                                        i1 += i14;
                                        i1 -= iFld;
                                        break;
                                    case 11:
                                        try {
                                            iFld = (-116 / Test0968.iArrFld[i14]);
                                            i13 = (i % 19057);
                                            i13 = (-13626 / Test0968.iArrFld[i14]);
                                        } catch (ArithmeticException a_e) {
                                        }
                                    case 12:
                                        Test0968.instanceCount = Test0968.instanceCount;
                                        break;
                                    case 13:
                                    case 14:
                                        Test0968.fFld -= i14;
                                        if (true) {
                                            Test0968.instanceCount += (-10 + (i14 * i14));
                                            Test0968.lArrFld[i + 1] = i13;
                                            if (b1) break;
                                        } else {
                                            l6 = s1;
                                        }
                                        break;
                                    case 15:
                                        try {
                                            iFld = (i1 % i13);
                                            i1 = (i1 % i14);
                                            i13 = (41289 / Test0968.iArrFld[i14 - 1]);
                                        } catch (ArithmeticException a_e) {
                                        }
                                    case 16:
                                        i1 /= (int) (Test0968.instanceCount | 1);
                                        break;
                                    default:
                                        iFld += (i14 * i14);
                                }
                            } else {
                                iFld -= i13;
                            }
                        }
                    }
                    break;
                case 103:
                    if (b1) continue;
                case 110:
                    Test0968.iArrFld = Test0968.iArrFld;
                    break;
                case 130:
                    i13 -= (int) Test0968.instanceCount;
                case 127:
                    Test0968.instanceCount -= i;
                    break;
                case 116:
                    Test0968.lArrFld[i] = i;
                    break;
                case 121:
                    Test0968.lArrFld[i + 1] = i14;
                    break;
            }
        }

        FuzzerUtils.out.println("i i1 l5 = " + i + "," + i1 + "," + l5);
        FuzzerUtils.out.println("i13 by d1 = " + i13 + "," + by + "," + Double.doubleToLongBits(d1));
        FuzzerUtils.out.println("i14 b1 l6 = " + i14 + "," + (b1 ? 1 : 0) + "," + l6);
        FuzzerUtils.out.println("s1 dArr = " + s1 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test0968.instanceCount Test0968.fFld iFld = " + Test0968.instanceCount + "," +
                Float.floatToIntBits(Test0968.fFld) + "," + iFld);
        FuzzerUtils.out.println("Test0968.iArrFld Test0968.lArrFld = " + FuzzerUtils.checkSum(Test0968.iArrFld) + "," +
                FuzzerUtils.checkSum(Test0968.lArrFld));

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
