// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:11 2023
public class Test0708 {

    public static final int N = 400;

    public static long instanceCount = -5L;
    public static volatile int iFld = -127;
    public static float fFld = 1.376F;
    public static short sFld = -26807;
    public static long iMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public double dFld = -47.113098;
    public boolean bFld = true;
    public volatile int[] iArrFld = new int[N];
    public long[] lArrFld = new long[N];

    public static long lMeth(long l, int i7, int i8) {

        int i10 = -12742;
        int i11 = 27680;
        int i12 = 27085;
        int i13 = 63845;
        int i14 = 21319;
        int i15 = 190;
        int[] iArr1 = new int[N];
        short s = 847;
        boolean b1 = true;
        double[] dArr = new double[N];

        FuzzerUtils.init(iArr1, 10);
        FuzzerUtils.init(dArr, -1.32968);

        for (int i9 : iArr1) {
            i7 += Test0708.iFld;
            i8 = Test0708.iFld;
            for (i10 = 1; i10 < 4; i10++) {
                double d1 = 0.90172;
                iArr1[i10 + 1] *= i8;
                i9 += (i10 ^ Test0708.iFld);
                i9 += (((i10 * s) + Test0708.iFld) - i8);
                i9 += 20734;
                d1 *= i8;
            }
            Test0708.iFld *= -4;
            for (i12 = 1; i12 < 4; ++i12) {
                for (i14 = 1; i14 < 2; ++i14) {
                    iArr1[i14 - 1] -= (int) l;
                    b1 = b1;
                    dArr[i14] *= i8;
                }
            }
        }
        long meth_res = l + i7 + i8 + i10 + i11 + s + i12 + i13 + i14 + i15 + (b1 ? 1 : 0) +
                FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public static short sMeth(int i6) {

        int i16 = -230;
        int i17 = 33;
        int i18 = -2;
        int[] iArr = new int[N];
        long l1 = 5798515020263038499L;
        short s1 = 29557;

        FuzzerUtils.init(iArr, 17253);

        Test0708.iFld *= (int) ((-(-(-iArr[(i6 >>> 1) % N]))) - lMeth(Test0708.instanceCount, i6, i6));
        i16 = 368;
        do {
            float f = 2.953F;
            Test0708.iFld >>= -203;
            switch (((Test0708.iFld >>> 1) % 2) + 22) {
                case 22:
                    i6 += (int) f;
                    for (i17 = 1; 5 > i17; ++i17) {
                        try {
                            Test0708.iFld = (31762 % i16);
                            i18 = (i18 % i6);
                            iArr[i17 + 1] = (iArr[i16] % -969581431);
                        } catch (ArithmeticException a_e) {
                        }
                        i18 += (i17 ^ i17);
                        l1 = 1;
                        while (++l1 < 2) {
                            s1 &= (short) l1;
                            i18 >>>= i16;
                            switch ((((Test0708.iFld >>> 1) % 1) * 5) + 57) {
                                case 61:
                                    i6 += (5 + (l1 * l1));
                                    i6 += (int) l1;
                            }
                        }
                        Test0708.iFld ^= 13;
                    }
                    break;
                case 23:
                    iArr = FuzzerUtils.int1array(N, (int) -218);
                    break;
                default:
                    i6 -= Test0708.iFld;
            }
        } while (--i16 > 0);
        long meth_res = i6 + i16 + i17 + i18 + l1 + s1 + FuzzerUtils.checkSum(iArr);
        sMeth_check_sum += meth_res;
        return (short) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0708 _instance = new Test0708();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public int iMeth(int i) {

        int i1 = -139, i2 = 0, i3 = 32071, i4 = -2, i5 = 178, i19 = 25702;
        boolean b = false;
        float f1 = 113.199F;

        Test0708.instanceCount += (long) (Math.abs(dFld) - ((i--) + Math.min(i, -63565)));
        for (i1 = 7; i1 < 233; i1++) {
            i3 = 1;
            while (++i3 < 7) {
                for (i4 = 1; 1 > i4; ++i4) {
                    b = b;
                    iArrFld[i3 - 1] &= (Test0708.iFld -= ((i5 * Test0708.iFld) + (-iArrFld[i1])));
                }
                Test0708.instanceCount -= sMeth(i4);
                for (f1 = 1; 1 > f1; ++f1) {
                    Test0708.instanceCount = (long) f1;
                    switch ((int) (((f1 % 2) * 5) + 26)) {
                        case 28:
                            switch ((i3 % 2) + 13) {
                                case 13:
                                    i5 = 0;
                                    i5 <<= i4;
                                    i5 = Test0708.iFld;
                                    break;
                                case 14:
                                    iArrFld[(int) (f1)] -= -9;
                                    break;
                            }
                        case 29:
                            i += (237 + (f1 * f1));
                    }
                }
            }
        }
        long meth_res = i + i1 + i2 + i3 + i4 + i5 + (b ? 1 : 0) + Float.floatToIntBits(f1) + i19;
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d = -125.108904;
        double[] dArr1 = new double[N];
        int i20 = 3, i21 = 4, i22 = 12734, i23 = -14, i24 = 226;
        long l2 = 4734124250992076289L;
        byte by = -43;
        float[] fArr = new float[N];

        FuzzerUtils.init(fArr, -126.521F);
        FuzzerUtils.init(dArr1, 63.57705);

        d += (iMeth(Test0708.iFld) + Test0708.iFld);
        if (false) {
            bFld = bFld;
            for (i20 = 7; i20 < 186; i20 += 2) {
                iArrFld[i20 + 1] -= Test0708.iFld;
                for (i22 = 11; i22 < 281; i22++) {
                    lArrFld = FuzzerUtils.long1array(N, (long) -13L);
                    for (l2 = i20; l2 < 2; l2++) {
                        Test0708.instanceCount = 47919;
                        lArrFld[i22] %= -25439;
                        i24 ^= i22;
                        i23 += i22;
                        iArrFld[i20] -= (int) Test0708.instanceCount;
                        i23 += (int) (l2 | i23);
                        Test0708.instanceCount = (long) Test0708.fFld;
                        if (bFld) break;
                        switch ((((125 >>> 1) % 5) * 5) + 32) {
                            case 47:
                                Test0708.fFld += l2;
                                fArr[i20] += (float) dFld;
                                dArr1[(int) (l2)] -= Test0708.fFld;
                                switch ((i20 % 2) + 87) {
                                    case 87:
                                        bFld = bFld;
                                        lArrFld = FuzzerUtils.long1array(N, (long) 2616387128L);
                                        if (bFld) {
                                            switch (((i20 % 2) * 5) + 58) {
                                                case 60:
                                                    try {
                                                        iArrFld[i22 + 1] = (i23 / i21);
                                                        Test0708.iFld = (-10698 / i20);
                                                        i23 = (i22 / 231);
                                                    } catch (ArithmeticException a_e) {
                                                    }
                                                    i21 -= 91;
                                                    by = (byte) i24;
                                                    break;
                                                case 63:
                                                    by = (byte) i21;
                                                    i21 = by;
                                                    break;
                                            }
                                        } else {
                                            Test0708.sFld *= (short) Test0708.iFld;
                                        }
                                    case 88:
                                        i24 &= i24;
                                        break;
                                    default:
                                        iArrFld = FuzzerUtils.int1array(N, (int) -191);
                                }
                                break;
                            case 52:
                                Test0708.fFld = Test0708.fFld;
                                break;
                            case 36:
                                iArrFld[(int) (l2 - 1)] *= (int) dFld;
                                break;
                            case 51:
                                by = (byte) -11L;
                                break;
                            case 34:
                                Test0708.iFld += (int) l2;
                                break;
                            default:
                                fArr = FuzzerUtils.float1array(N, (float) -1.449F);
                        }
                    }
                }
            }
        } else {
            Test0708.instanceCount = 120;
        }

        FuzzerUtils.out.println("d i20 i21 = " + Double.doubleToLongBits(d) + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 l2 = " + i22 + "," + i23 + "," + l2);
        FuzzerUtils.out.println("i24 by fArr = " + i24 + "," + by + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));
        FuzzerUtils.out.println("dArr1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)));

        FuzzerUtils.out.println("Test0708.instanceCount dFld Test0708.iFld = " + Test0708.instanceCount + "," +
                Double.doubleToLongBits(dFld) + "," + Test0708.iFld);
        FuzzerUtils.out.println("bFld Test0708.fFld Test0708.sFld = " + (bFld ? 1 : 0) + "," + Float.floatToIntBits(Test0708.fFld)
                + "," + Test0708.sFld);
        FuzzerUtils.out.println("iArrFld lArrFld = " + FuzzerUtils.checkSum(iArrFld) + "," +
                FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  sMeth ->  sMeth iMeth mainTest
//DEBUG  lMeth ->  lMeth sMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
