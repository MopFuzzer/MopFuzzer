// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:57 2023
public class Test0189 {

    public static final int N = 400;

    public static long instanceCount = 2676730777L;
    public static volatile float fFld = -45.383F;
    public static volatile int iFld = -212;
    public static byte byFld = -93;
    public static long dMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public boolean bFld = true;
    public volatile int[] iArrFld = new int[N];

    public static void vMeth1() {

        int i9 = -59806;
        int i10 = 54;
        int i11 = 10;
        int[] iArr = new int[N];
        boolean b = false;

        FuzzerUtils.init(iArr, 4593);

        Test0189.iFld = Test0189.iFld;
        Test0189.fFld = Test0189.fFld;
        i9 = 1;
        do {
            i10 = 7;
            while (--i10 > 0) {
                Test0189.instanceCount *= Test0189.iFld;
                switch (((i10 % 7) * 5) + 120) {
                    case 150:
                    case 132:
                        if (b) break;
                        break;
                    case 148:
                        i11 = 1;
                        do {
                            iArr[i11 - 1] >>= i10;
                            Test0189.iFld -= i10;
                            Test0189.iFld += (((i11 * i9) + i10) - Test0189.instanceCount);
                            Test0189.iFld |= 6;
                        } while (++i11 < 1);
                        Test0189.iFld = i11;
                        Test0189.iFld += Test0189.byFld;
                        break;
                    case 137:
                    case 154:
                        Test0189.iFld += (i10 ^ i9);
                        break;
                    case 152:
                        Test0189.iFld -= Test0189.iFld;
                        break;
                    case 133:
                        Test0189.iFld = 222;
                        break;
                    default:
                        Test0189.iFld += (((i10 * Test0189.fFld) + i11) - Test0189.instanceCount);
                }
            }
        } while (++i9 < 219);
        vMeth1_check_sum += i9 + i10 + (b ? 1 : 0) + i11 + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i, int i1) {

        int i2 = 13426;
        int i3 = 95;
        int i4 = -60501;
        int i5 = 7;
        int i6 = -11;
        int i7 = 86;
        int i8 = 79;
        int[] iArr1 = new int[N];
        byte by = -33;
        double d = 5.77412;
        boolean b1 = true;

        FuzzerUtils.init(iArr1, -6);

        for (i2 = 15; i2 < 313; ++i2) {
            for (i4 = i2; i4 < 6; ++i4) {
                Test0189.iFld += (int) (++Test0189.instanceCount);
                Test0189.instanceCount ^= Test0189.iFld;
                Test0189.instanceCount -= -1L;
                i5 += (-30048 + (i4 * i4));
                i1 += i4;
                if (b1) {
                    Test0189.iFld -= (int) ((i2 / ((i1 - Test0189.iFld) | 1)) & Test0189.instanceCount);
                    i6 = 1;
                    while (++i6 < 1) {
                        by += (byte) (((i6 * Test0189.iFld) + Test0189.instanceCount) - i);
                    }
                    for (i7 = 1; i7 < 1; i7 += 3) {
                        vMeth1();
                        d *= i4;
                        Test0189.iFld += 10;
                    }
                } else if (b1) {
                    try {
                        i = (Test0189.iFld % i2);
                        i1 = (i5 % i8);
                        i5 = (i5 / iArr1[i2 + 1]);
                    } catch (ArithmeticException a_e) {
                    }
                } else {
                    Test0189.instanceCount -= -228;
                }
            }
        }
        vMeth_check_sum += i + i1 + i2 + i3 + i4 + i5 + i6 + by + i7 + i8 + Double.doubleToLongBits(d) + (b1 ? 1 : 0) +
                FuzzerUtils.checkSum(iArr1);
    }

    public static double dMeth(float f) {

        int i12 = 48198, i13 = 143, i14 = 48212, i15 = 19570, i16 = 4;
        boolean b2 = true;
        long[][] lArr1 = new long[N][N];

        FuzzerUtils.init(lArr1, 152L);

        vMeth(Test0189.iFld, Test0189.iFld);
        for (i12 = 4; 194 > i12; i12++) {
            Test0189.iFld += (i12 * i12);
            for (i14 = 1; i14 < 8; ++i14) {
                Test0189.instanceCount *= 11;
                b2 = b2;
                f += -10285;
                lArr1[i14 + 1][i14] = i12;
                Test0189.instanceCount += Test0189.iFld;
            }
            i15 *= (int) f;
            f = Test0189.instanceCount;
            i16 = 1;
            do {
                Test0189.instanceCount <<= i12;
                Test0189.instanceCount += Test0189.instanceCount;
            } while (++i16 < 8);
            Test0189.fFld = Test0189.instanceCount;
        }
        long meth_res = Float.floatToIntBits(f) + i12 + i13 + i14 + i15 + (b2 ? 1 : 0) + i16 +
                FuzzerUtils.checkSum(lArr1);
        dMeth_check_sum += meth_res;
        return (double) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0189 _instance = new Test0189();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i17 = 0, i18 = 35, i19 = 8, i20 = -4912, i21 = 9, i22 = 100, i23 = -14, i24 = 5;
        double d1 = 2.128753;
        short s = -21673;
        short[] sArr = new short[N];
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, 6148600429150347271L);
        FuzzerUtils.init(sArr, (short) -30862);

        Test0189.fFld -= (float) (lArr[(Test0189.iFld >>> 1) % N] - ((3075 + (-130 * iArrFld[(Test0189.iFld >>> 1) % N])) +
                dMeth(Test0189.fFld)));
        for (i17 = 17; i17 < 349; i17++) {
            d1 = Test0189.instanceCount;
            Test0189.instanceCount += (i17 * i17);
            i18 >>= 45162;
            Test0189.fFld = i18;
            Test0189.iFld *= i17;
            Test0189.fFld = Test0189.instanceCount;
            if (bFld) {
                bFld = bFld;
                iArrFld[i17 - 1] -= i17;
                for (i19 = 1; i19 < 76; ++i19) {
                    switch (((i19 % 3) * 5) + 82) {
                        case 85:
                            switch ((i17 % 2) + 87) {
                                case 87:
                                case 88:
                                    sArr[i19 + 1] <<= (short) Test0189.instanceCount;
                                    for (i21 = 1; i21 < 2; ++i21) {
                                        Test0189.fFld -= Test0189.instanceCount;
                                        d1 -= i19;
                                        Test0189.instanceCount >>= i19;
                                    }
                                    d1 -= s;
                                    for (i23 = i19; i23 < 2; i23++) {
                                        Test0189.iFld *= (int) Test0189.instanceCount;
                                        i20 = (int) Test0189.instanceCount;
                                        if (bFld) continue;
                                        i22 >>= i17;
                                        if (true) break;
                                        try {
                                            i22 = (38909 / i21);
                                            i20 = (i23 % -158);
                                            Test0189.iFld = (-65307 / iArrFld[i17 - 1]);
                                        } catch (ArithmeticException a_e) {
                                        }
                                    }
                                    break;
                            }
                            break;
                        case 83:
                            i22 *= (int) Test0189.fFld;
                            Test0189.instanceCount = i20;
                            i22 = (int) Test0189.fFld;
                            break;
                        case 96:
                            Test0189.fFld += i19;
                        default:
                            i18 <<= s;
                    }
                }
            } else if (bFld) {
                i18 = Test0189.iFld;
            } else if (bFld) {
                try {
                    Test0189.iFld = (i20 / -247);
                    i20 = (48066 / i23);
                    Test0189.iFld = (i17 % i24);
                } catch (ArithmeticException a_e) {
                }
            } else {
                i24 = Test0189.iFld;
            }
        }

        FuzzerUtils.out.println("i17 i18 d1 = " + i17 + "," + i18 + "," + Double.doubleToLongBits(d1));
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 s i23 = " + i22 + "," + s + "," + i23);
        FuzzerUtils.out.println("i24 lArr sArr = " + i24 + "," + FuzzerUtils.checkSum(lArr) + "," +
                FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test0189.instanceCount Test0189.fFld Test0189.iFld = " + Test0189.instanceCount + "," +
                Float.floatToIntBits(Test0189.fFld) + "," + Test0189.iFld);
        FuzzerUtils.out.println("Test0189.byFld bFld iArrFld = " + Test0189.byFld + "," + (bFld ? 1 : 0) + "," +
                FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  dMeth ->  dMeth mainTest
//DEBUG  vMeth ->  vMeth dMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth dMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
