// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:00 2023
public class Test0308 {

    public static final int N = 400;

    public static long instanceCount = -185L;
    public static int iFld = 37831;
    public static volatile short sFld = 5110;
    public static float fFld = 0.519F;
    public static volatile int[] iArrFld = new int[N];
    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0308.iArrFld, 83);
    }

    public double dFld = -17.31294;
    public boolean bFld = false;
    public volatile int iFld1 = -7;
    public volatile long[] lArrFld = new long[N];

    public static void vMeth1(int i4, int i5) {

        int i6 = -203, i7 = 7, i8 = -244, i9 = 71;
        float f = -2.233F, f1 = 94.122F;
        byte by1 = -81;
        boolean b = false;

        for (i6 = 1; 122 > i6; i6 += 2) {
            Test0308.iFld = i4;
            i7 = (int) f;
            Test0308.sFld = (short) 32182;
            f1 = 1;
            do {
                Test0308.iFld = 24146;
                for (i8 = 1; 1 > i8; i8 += 2) {
                    i5 -= by1;
                    i7 = i6;
                    f += Test0308.iFld;
                    Test0308.iArrFld[(int) (f1 - 1)] = i4;
                    Test0308.instanceCount = Test0308.instanceCount;
                    Test0308.instanceCount = Test0308.instanceCount;
                }
                b = b;
            } while (++f1 < 26);
        }
        i7 -= i8;
        vMeth1_check_sum += i4 + i5 + i6 + i7 + Float.floatToIntBits(f) + Float.floatToIntBits(f1) + i8 + i9 + by1 + (b
                ? 1 : 0);
    }

    public static void vMeth() {

        int i10 = 13, i11 = -8, i12 = 7;
        double d = 19.79882;
        byte by2 = 65;
        short[] sArr = new short[N];

        FuzzerUtils.init(sArr, (short) -25581);

        vMeth1(Test0308.iFld, Test0308.iFld);
        Test0308.iFld <<= (int) -1L;
        Test0308.fFld = Test0308.instanceCount;
        i10 = 131;
        do {
            Test0308.iFld += (i10 * i10);
            Test0308.iFld += i10;
            Test0308.fFld += (((i10 * Test0308.fFld) + Test0308.iFld) - Test0308.iFld);
            switch ((((Test0308.iFld >>> 1) % 3) * 5) + 73) {
                case 75:
                    Test0308.iArrFld[i10 + 1] += (int) Test0308.instanceCount;
                    Test0308.instanceCount = i10;
                    d += Test0308.sFld;
                    break;
                case 82:
                    for (i11 = 1; i11 < 35; i11 += 2) {
                        Test0308.iFld += i10;
                        sArr = sArr;
                    }
                    i12 += by2;
                    break;
                case 78:
                    Test0308.iFld *= Test0308.sFld;
                    break;
                default:
                    i12 = (int) Test0308.instanceCount;
            }
        } while ((i10 -= 3) > 0);
        vMeth_check_sum += i10 + Double.doubleToLongBits(d) + i11 + i12 + by2 + FuzzerUtils.checkSum(sArr);
    }

    public static void main(String[] strArr) {

        try {
            Test0308 _instance = new Test0308();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public long lMeth(byte by) {

        int i3 = 13122, i13 = 2, i14 = -1, i16 = 50320, i17 = 7605;
        double[] dArr = new double[N];
        long[] lArr = new long[N];

        FuzzerUtils.init(dArr, 105.117211);
        FuzzerUtils.init(lArr, 3440051563L);

        dArr[(0 >>> 1) % N] = (((-(--i3)) - (Test0308.instanceCount = i3)) * ((++i3) - (++Test0308.iArrFld[(17403 >>> 1) %
                N])));
        i3 += (int) (dFld - ((i3++) * (i3 + i3)));
        vMeth();
        for (i13 = 7; i13 < 227; i13++) {
            switch ((i13 % 6) + 97) {
                case 97:
                    Test0308.fFld = i13;
                    i14 = 0;
                case 98:
                    lArr[i13 + 1] *= Test0308.iFld;
                    switch ((i13 % 2) + 21) {
                        case 21:
                            i16 = 1;
                            while (++i16 < 7) {
                                i17 = 1;
                                do {
                                    boolean b1 = true;
                                    b1 = true;
                                    dFld = -8792;
                                } while (++i17 < 1);
                                i3 >>= i14;
                                i14 += (i16 * i16);
                            }
                            break;
                        case 22:
                            Test0308.iFld += (i13 | i3);
                            break;
                    }
                    break;
                case 99:
                    Test0308.instanceCount *= i3;
                    break;
                case 100:
                    if (i13 != 0) {
                    }
                    break;
                case 101:
                    try {
                        i14 = (-22760 % i14);
                        Test0308.iArrFld[i13 - 1] = (-1022338649 / i14);
                        i3 = (i14 % 6434);
                    } catch (ArithmeticException a_e) {
                    }
                    break;
                case 102:
                    Test0308.iFld = by;
                    break;
                default:
                    i3 *= i3;
            }
        }
        long meth_res = by + i3 + i13 + i14 + i16 + i17 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
                FuzzerUtils.checkSum(lArr);
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i = 191;
        int i1 = 3;
        int i18 = 14531;
        int i19 = -40304;
        int i20 = 11;
        int i21 = 117;
        int[] iArr = new int[N];
        byte by3 = -97;
        float[] fArr = new float[N];
        double[][] dArr1 = new double[N][N];

        FuzzerUtils.init(iArr, -55894);
        FuzzerUtils.init(fArr, 124.133F);
        FuzzerUtils.init(dArr1, 0.94694);

        for (i = 7; i < 207; ++i) {
            lMeth(by3);
            for (i18 = 3; i18 < 126; i18++) {
                Test0308.instanceCount -= -25037;
                for (i20 = 1; i20 < 2; ++i20) {
                    i19 += (((i20 * i) + Test0308.fFld) - i21);
                    Test0308.iArrFld[i - 1] *= Test0308.iFld;
                    i1 = i18;
                    Test0308.iArrFld[i18] = i;
                    if (false) {
                        Test0308.instanceCount += (i20 | i19);
                        fArr[i] *= Test0308.iFld;
                        switch (((i20 % 9) * 5) + 76) {
                            case 89:
                                i21 = -11;
                                break;
                            case 109:
                                Test0308.sFld >>= (short) Test0308.instanceCount;
                                i1 += -1;
                                break;
                            case 117:
                                bFld = bFld;
                                i1 -= i;
                                i21 = i1;
                                break;
                            case 118:
                                iArr[i18] <<= i19;
                                Test0308.iArrFld[i] <<= (int) Test0308.instanceCount;
                                switch ((((i >>> 1) % 9) * 5) + 11) {
                                    case 38:
                                        i19 >>= (int) Test0308.instanceCount;
                                        try {
                                            i19 = (i19 % 6);
                                            i1 = (-114 / i21);
                                            Test0308.iFld = (i1 % 166);
                                        } catch (ArithmeticException a_e) {
                                        }
                                        switch ((i20 % 6) + 62) {
                                            case 62:
                                                if (bFld) break;
                                                Test0308.fFld = i1;
                                                Test0308.iFld -= 38296;
                                                break;
                                            case 63:
                                            case 64:
                                                dFld += -42701;
                                                Test0308.sFld = (short) 16977;
                                                break;
                                            case 65:
                                                Test0308.instanceCount = Test0308.iFld;
                                                break;
                                            case 66:
                                                Test0308.instanceCount = i;
                                                break;
                                            case 67:
                                                Test0308.instanceCount += (i20 | i);
                                                break;
                                            default:
                                                i21 = i20;
                                        }
                                        break;
                                    case 50:
                                    case 24:
                                        i1 *= Test0308.sFld;
                                        break;
                                    case 40:
                                        if (bFld) break;
                                        break;
                                    case 22:
                                        i19 = (int) Test0308.fFld;
                                        break;
                                    case 36:
                                        iArr[i - 1] = (int) -60808L;
                                    case 29:
                                        i19 += i18;
                                        break;
                                    case 25:
                                        Test0308.iFld = i18;
                                        break;
                                    case 14:
                                        dArr1[i20][i18 - 1] = Test0308.iFld;
                                        break;
                                    default:
                                        Test0308.fFld -= i19;
                                }
                                break;
                            case 90:
                                lArrFld = lArrFld;
                                break;
                            case 99:
                                Test0308.instanceCount = iFld1;
                                break;
                            case 100:
                                Test0308.iFld += i21;
                                break;
                            case 102:
                                iFld1 = (int) 90L;
                                break;
                            case 121:
                                i1 = Test0308.iFld;
                                break;
                            default:
                                Test0308.instanceCount >>= -57655;
                        }
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 by3 = " + i + "," + i1 + "," + by3);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 iArr fArr = " + i21 + "," + FuzzerUtils.checkSum(iArr) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));
        FuzzerUtils.out.println("dArr1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)));

        FuzzerUtils.out.println("Test0308.instanceCount dFld Test0308.iFld = " + Test0308.instanceCount + "," +
                Double.doubleToLongBits(dFld) + "," + Test0308.iFld);
        FuzzerUtils.out.println("Test0308.sFld Test0308.fFld bFld = " + Test0308.sFld + "," + Float.floatToIntBits(Test0308.fFld) + ","
                + (bFld ? 1 : 0));
        FuzzerUtils.out.println("iFld1 Test0308.iArrFld lArrFld = " + iFld1 + "," + FuzzerUtils.checkSum(Test0308.iArrFld) +
                "," + FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
