// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:54 2023
public class Test0065 {

    public static final int N = 400;

    public static long instanceCount = -49L;
    public static short sFld = -3322;
    public static volatile byte[] byArrFld = new byte[N];
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0065.byArrFld, (byte) -59);
    }

    public static void vMeth1(int i6) {

        int i7 = 54457, i8 = 35404;
        byte by1 = -39;
        short s1 = 9256;

        for (i7 = 2; i7 < 393; ++i7) {
            Test0065.instanceCount += (((i7 * i8) + i6) - i6);
            switch ((i7 % 1) + 46) {
                case 46:
                    Test0065.instanceCount += (((i7 * i7) + by1) - Test0065.instanceCount);
                    s1 += (short) -7;
                    break;
                default:
                    Test0065.instanceCount -= i7;
                    Test0065.instanceCount *= i8;
                    i8 = i8;
                    i6 = by1;
            }
        }
        i6 *= i8;
        vMeth1_check_sum += i6 + i7 + i8 + by1 + s1;
    }

    public static int iMeth(long l2, int i3, short s) {

        int i4 = -97;
        int i5 = -48514;
        int i9 = -130;
        int i10 = 5;
        int i12 = -35126;
        int i13 = 28437;
        int[] iArr = new int[N];
        byte by2 = 58;
        float f = 32.478F;

        FuzzerUtils.init(iArr, -9);

        for (i4 = 15; 298 > i4; ++i4) {
            vMeth1(i4);
            for (i9 = 1; 6 > i9; ++i9) {
                i3 += 0;
                by2 += (byte) Test0065.instanceCount;
                i3 = (int) Test0065.instanceCount;
                i3 += (int) (-4.190F + (i9 * i9));
            }
            try {
                i3 = (-21 / i5);
                i10 = (i5 % i9);
                i3 = (48866 / i9);
            } catch (ArithmeticException a_e) {
            }
            for (i12 = 1; i12 < 6; ++i12) {
                by2 = (byte) Test0065.instanceCount;
                s += (short) i9;
                if (i5 != 0) {
                }
                i13 += (((i12 * i3) + i9) - i13);
            }
            iArr[i4 + 1] += (int) Test0065.instanceCount;
            f -= -199;
        }
        long meth_res = l2 + i3 + s + i4 + i5 + i9 + i10 + by2 + i12 + i13 + Float.floatToIntBits(f) +
                FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth(int i, int i1, long l) {

        byte by = -55;
        long l1 = -41605L;
        int i2 = -3;
        int i14 = -156;
        int i15 = -8167;
        int i16 = -12;
        int i17 = 134;
        int[] iArr1 = new int[N];

        FuzzerUtils.init(iArr1, 9917);

        i *= (++i);
        Test0065.instanceCount += by;
        for (l1 = 6; l1 < 162; ++l1) {
            double d = -1.4314;
            i1 <<= iMeth(-3570435409L, i, Test0065.sFld);
            i2 += (-49223 + (l1 * l1));
            switch ((int) ((l1 % 9) + 28)) {
                case 28:
                case 29:
                    i = i2;
                    for (i14 = 1; i14 < 10; ++i14) {
                        l += i2;
                        if (i2 != 0) {
                            vMeth_check_sum += i + i1 + l + by + l1 + i2 + i14 + i15 + i16 + i17 +
                                    FuzzerUtils.checkSum(iArr1);
                            return;
                        }
                        for (i16 = 1; i16 < 2; ++i16) {
                            int i18 = 161;
                            try {
                                i1 = (iArr1[i16] / i15);
                                i18 = (i17 % 118);
                                i1 = (i1 / -58864);
                            } catch (ArithmeticException a_e) {
                            }
                            l >>>= i;
                            by = (byte) i18;
                        }
                        Test0065.instanceCount += (17335 + (i14 * i14));
                    }
                case 30:
                    Test0065.instanceCount += i17;
                    break;
                case 31:
                    i17 += (int) d;
                    break;
                case 32:
                    Test0065.instanceCount *= i17;
                case 33:
                    iArr1[(int) (l1 + 1)] += i14;
                    break;
                case 34:
                    Test0065.byArrFld[(int) (l1 - 1)] *= (byte) i1;
                    break;
                case 35:
                    i = i14;
                    break;
                case 36:
                    i15 = i15;
                    break;
                default:
                    i17 %= 6;
            }
        }
        vMeth_check_sum += i + i1 + l + by + l1 + i2 + i14 + i15 + i16 + i17 + FuzzerUtils.checkSum(iArr1);
    }

    public static void main(String[] strArr) {

        try {
            Test0065 _instance = new Test0065();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i19 = 11;
        int i20 = -14;
        int i21 = 0;
        int i22 = -29954;
        int i23 = 17;
        int i24 = -2931;
        int i25 = 11;
        int i26 = -236;
        int i27 = 67;
        int[] iArr2 = new int[N];
        double d1 = 0.73363, d2 = 1.20264;
        boolean b = true;
        byte by3 = 58;
        float f1 = -1.73F;
        short[] sArr = new short[N];

        FuzzerUtils.init(iArr2, 34509);
        FuzzerUtils.init(sArr, (short) -10062);

        vMeth(i19, i19, Test0065.instanceCount);
        for (d1 = 14; d1 < 277; ++d1) {
            i19 += (int) (d1 * d1);
            i19 = i19;
            iArr2 = iArr2;
            for (i21 = 1; i21 < 96; ++i21) {
                Test0065.instanceCount = i19;
                if (b) continue;
                for (i23 = 2; i23 > 1; --i23) {
                    i24 = Test0065.sFld;
                    if (b) continue;
                }
            }
        }
        iArr2[(i24 >>> 1) % N] = by3;
        d2 -= -2;
        f1 = by3;
        by3 = (byte) -12902;
        i20 <<= i19;
        Test0065.instanceCount >>= Test0065.instanceCount;
        for (i25 = 358; i25 > 6; i25 -= 2) {
            try {
                i22 = (i25 % i24);
                i19 = (i22 / i19);
                i26 = (-192 / i19);
            } catch (ArithmeticException a_e) {
            }
            f1 = Test0065.instanceCount;
            switch (((i25 % 2) * 5) + 33) {
                case 43:
                case 41:
                    i19 -= 62;
            }
            if (b) continue;
            switch (((i20 >>> 1) % 1) + 46) {
                case 46:
                    i26 = i19;
                    i27 = 143;
                    while (--i27 > 0) {
                        iArr2[i27] = i26;
                        i26 += (((i27 * i22) + Test0065.sFld) - by3);
                        i22 = (int) d2;
                        sArr[i27] = (short) -6;
                    }
                    break;
            }
        }

        FuzzerUtils.out.println("i19 d1 i20 = " + i19 + "," + Double.doubleToLongBits(d1) + "," + i20);
        FuzzerUtils.out.println("i21 i22 b = " + i21 + "," + i22 + "," + (b ? 1 : 0));
        FuzzerUtils.out.println("i23 i24 by3 = " + i23 + "," + i24 + "," + by3);
        FuzzerUtils.out.println("d2 f1 i25 = " + Double.doubleToLongBits(d2) + "," + Float.floatToIntBits(f1) + "," +
                i25);
        FuzzerUtils.out.println("i26 i27 iArr2 = " + i26 + "," + i27 + "," + FuzzerUtils.checkSum(iArr2));
        FuzzerUtils.out.println("sArr = " + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test0065.instanceCount Test0065.sFld Test0065.byArrFld = " + Test0065.instanceCount + "," + Test0065.sFld
                + "," + FuzzerUtils.checkSum(Test0065.byArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
