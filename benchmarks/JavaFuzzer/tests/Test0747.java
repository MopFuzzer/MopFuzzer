// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:12 2023
public class Test0747 {

    public static final int N = 400;

    public static long instanceCount = 3411830526L;
    public static float fFld = 0.103F;
    public static boolean bFld = true;
    public static volatile short sFld = 24129;
    public static double[] dArrFld = new double[N];
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    static {
        FuzzerUtils.init(Test0747.dArrFld, -88.18953);
    }

    public double dFld = 0.50931;

    public static void vMeth2(int i4, int i5, int i6) {

        int i7 = -186;
        int i9 = -44;
        int i10 = -195;
        int[] iArr1 = new int[N];
        float f = -2.789F;
        short s = -8178;
        double d1 = 2.188;

        FuzzerUtils.init(iArr1, -10);

        i7 = 1;
        while (++i7 < 277) {
            i6 = -147;
            iArr1[i7 + 1] -= i7;
            for (i9 = 1; i9 < 6; i9++) {
                long l = 950171130L;
                i5 *= i7;
                iArr1[i9] = i9;
                i10 >>= (int) l;
                i10 = i7;
                f = 1;
                while ((f += 3) < 2) {
                    Test0747.instanceCount *= 8;
                    i5 |= s;
                    i4 >>= (int) Test0747.instanceCount;
                    i10 = (int) d1;
                    iArr1[i7] <<= i9;
                    Test0747.fFld = f;
                }
            }
        }
        vMeth2_check_sum += i4 + i5 + i6 + i7 + i9 + i10 + Float.floatToIntBits(f) + s + Double.doubleToLongBits(d1) +
                FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth1(int i, int i1) {

        int i2 = -50;
        int i3 = -65011;
        int i11 = -5;
        int[][] iArr = new int[N][N];
        short s1 = -32733;
        byte by = -29;

        FuzzerUtils.init(iArr, -3);

        iArr = (iArr = (iArr = (iArr = iArr)));
        for (i2 = 6; 204 > i2; ++i2) {
            vMeth2(i, i3, i1);
            if (Test0747.bFld) {
                Test0747.fFld *= i;
            }
            if (i3 != 0) {
                vMeth1_check_sum += i + i1 + i2 + i3 + s1 + i11 + by + FuzzerUtils.checkSum(iArr);
                return;
            }
            i1 -= (int) Test0747.instanceCount;
            i += i2;
            i3 -= 33600;
            i = s1;
        }
        i11 = 1;
        do {
            switch ((i11 % 1) + 107) {
                case 107:
                    i3 += (((i11 * i11) + i) - i);
                    i1 -= -28591;
                    iArr[i11 + 1][i11 - 1] -= by;
                default:
                    i *= i11;
            }
        } while ((i11 += 3) < 336);
        vMeth1_check_sum += i + i1 + i2 + i3 + s1 + i11 + by + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(double d) {

        int i12 = 34404, i13 = -10, i14 = -9546, i15 = 54151, i16 = -5, i17 = 55067, i18 = -9, i19 = -10, i20 = 10;

        vMeth1(i12, i12);
        Test0747.dArrFld = FuzzerUtils.double1array(N, (double) 14.96326);
        i13 = 1;
        do {
            i14 = 1;
            do {
                for (i15 = i14; 1 > i15; i15 += 3) {
                    if (i13 != 0) {
                        vMeth_check_sum += Double.doubleToLongBits(d) + i12 + i13 + i14 + i15 + i16 + i17 + i18 + i19 +
                                i20;
                        return;
                    }
                }
                for (i17 = 1; i17 < 1; i17++) {
                    i16 = i16;
                    Test0747.sFld = (short) i15;
                }
                i16 *= (int) Test0747.instanceCount;
                for (i19 = 1; i19 < 1; i19++) {
                    Test0747.fFld -= -1;
                    Test0747.bFld = Test0747.bFld;
                    i12 <<= i16;
                    i18 = 9;
                }
            } while (++i14 < 6);
        } while (++i13 < 273);
        vMeth_check_sum += Double.doubleToLongBits(d) + i12 + i13 + i14 + i15 + i16 + i17 + i18 + i19 + i20;
    }

    public static void main(String[] strArr) {

        try {
            Test0747 _instance = new Test0747();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        long l1 = 4L;
        int i21 = 0;
        int i22 = 13;
        int i23 = 2;
        int i24 = 0;
        int i25 = 190;
        int i26 = 61;
        int[] iArr2 = new int[N];
        byte by1 = -41;

        FuzzerUtils.init(iArr2, -46131);

        if (Test0747.bFld) {
            vMeth(dFld);
        } else if (Test0747.bFld) {
            for (l1 = 22; l1 < 366; l1++) {
                i21 <<= i21;
                for (i22 = (int) (l1); i22 < 73; ++i22) {
                    i21 += (i22 - i23);
                    switch ((int) ((l1 % 5) + 27)) {
                        case 27:
                            iArr2[(int) (l1 + 1)] <<= (int) Test0747.instanceCount;
                            Test0747.fFld += (i22 * i21);
                            break;
                        case 28:
                            i23 *= i23;
                            i23 = i21;
                            break;
                        case 29:
                            i23 += (((i22 * Test0747.fFld) + Test0747.fFld) - i21);
                            Test0747.fFld *= i22;
                            i23 += (int) Test0747.instanceCount;
                        case 30:
                            Test0747.sFld = (short) i22;
                            i21 += (-11660 + (i22 * i22));
                            i21 -= (int) Test0747.instanceCount;
                            Test0747.fFld += (i22 * i22);
                            break;
                        case 31:
                            Test0747.fFld = i24;
                    }
                    i23 -= i24;
                }
                i23 = (int) Test0747.fFld;
                switch ((((-13 >>> 1) % 1) * 5) + 1) {
                    case 2:
                        Test0747.fFld += i24;
                        Test0747.sFld += (short) (((l1 * i22) + i24) - i21);
                        for (i25 = 1; i25 < 73; ++i25) {
                            switch ((int) ((l1 % 9) + 123)) {
                                case 123:
                                    Test0747.instanceCount = (long) -1.68F;
                                    i26 = i23;
                                    Test0747.bFld = Test0747.bFld;
                                    Test0747.fFld = i21;
                                    break;
                                case 124:
                                    i21 += i25;
                                case 125:
                                    i23 += (i25 + l1);
                                    break;
                                case 126:
                                    i24 -= -12500;
                                    break;
                                case 127:
                                    i24 = by1;
                                    break;
                                case 128:
                                    i23 += (-245 + (i25 * i25));
                                    break;
                                case 129:
                                    Test0747.instanceCount ^= 5529;
                                    break;
                                case 130:
                                    i21 <<= i26;
                                    break;
                                case 131:
                                    i24 |= i26;
                                    break;
                            }
                        }
                }
            }
        } else {
            Test0747.instanceCount -= 13;
        }

        FuzzerUtils.out.println("l1 i21 i22 = " + l1 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 by1 iArr2 = " + i26 + "," + by1 + "," + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test0747.instanceCount Test0747.fFld Test0747.bFld = " + Test0747.instanceCount + "," +
                Float.floatToIntBits(Test0747.fFld) + "," + (Test0747.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0747.sFld dFld Test0747.dArrFld = " + Test0747.sFld + "," + Double.doubleToLongBits(dFld) +
                "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0747.dArrFld)));

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