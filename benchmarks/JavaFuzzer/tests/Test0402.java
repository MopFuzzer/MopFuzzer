// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:03 2023
public class Test0402 {

    public static final int N = 400;

    public static long instanceCount = -2382330642175432176L;
    public static float fFld = 0.333F;
    public static boolean bFld = false;
    public static byte byFld = 63;
    public static double dFld = 111.89208;
    public static float[] fArrFld = new float[N];
    public static boolean[] bArrFld = new boolean[N];
    public static long[] lArrFld = new long[N];
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0402.fArrFld, -2.536F);
        FuzzerUtils.init(Test0402.bArrFld, true);
        FuzzerUtils.init(Test0402.lArrFld, 2L);
    }

    public short sFld = 23203;

    public static int iMeth1(int i7, int i8) {

        int i9 = -3;
        int i10 = 51469;
        int i11 = 9;
        int i12 = -34;
        int i13 = 11618;
        int i14 = -53868;
        int i15 = -226;
        int[] iArr = new int[N];
        boolean b = true;
        boolean[] bArr = new boolean[N];

        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(iArr, 14);

        i9 = 184;
        while ((i9 -= 3) > 0) {
            i7 -= i9;
        }
        i8 = 229;
        bArr[(i8 >>> 1) % N] = b;
        if (b) {
            for (i10 = 7; 283 > i10; i10++) {
                switch ((((55747 >>> 1) % 8) * 5) + 3) {
                    case 9:
                        iArr[i10 + 1] -= i10;
                        for (i12 = 1; i12 < 6; i12++) {
                            for (i14 = 1; i14 < 2; ++i14) {
                                Test0402.instanceCount = i11;
                                try {
                                    i11 = (48190 % i13);
                                    i8 = (-740824997 % i8);
                                    iArr[i14 - 1] = (-226 % i14);
                                } catch (ArithmeticException a_e) {
                                }
                                i15 <<= i15;
                                iArr[i10 - 1] -= -42024;
                                i15 *= i13;
                            }
                        }
                        break;
                    case 37:
                        Test0402.instanceCount = 194;
                        break;
                    case 20:
                        Test0402.instanceCount += (-2 + (i10 * i10));
                        break;
                    case 40:
                        Test0402.fFld = Test0402.instanceCount;
                        break;
                    case 34:
                        i8 += (int) Test0402.instanceCount;
                        break;
                    case 7:
                        Test0402.instanceCount += i15;
                    case 35:
                        if (i8 != 0) {
                        }
                    case 12:
                        i11 |= (int) Test0402.instanceCount;
                }
            }
        } else {
            Test0402.fArrFld[(i15 >>> 1) % N] -= i15;
        }
        long meth_res = i7 + i8 + i9 + (b ? 1 : 0) + i10 + i11 + i12 + i13 + i14 + i15 + FuzzerUtils.checkSum(bArr) +
                FuzzerUtils.checkSum(iArr);
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public static int iMeth(int i4) {

        int i5 = 5, i6 = 5, i16 = 222, i17 = -6, i18 = 194;

        for (i5 = 18; i5 < 393; ++i5) {
            iMeth1(i4, i6);
            i16 = 1;
            do {
                Test0402.bFld = Test0402.bFld;
                Test0402.fFld = i4;
                i4 += (((i16 * Test0402.instanceCount) + i4) - Test0402.byFld);
                for (i17 = i5; i17 < 1; ++i17) {
                    if (Test0402.bFld) {
                        i4 = i16;
                        Test0402.bArrFld[i16 - 1] = Test0402.bFld;
                        i6 += (i17 ^ (long) Test0402.fFld);
                        if (Test0402.bFld) continue;
                    } else {
                        Test0402.instanceCount >>= -3;
                        Test0402.lArrFld = Test0402.lArrFld;
                        i4 += i18;
                    }
                }
            } while (++i16 < 5);
        }
        long meth_res = i4 + i5 + i6 + i16 + i17 + i18;
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth(int i, int i1) {

        int i2 = 39997;
        int i3 = -25607;
        int i19 = 34417;
        int i20 = 3;
        int[][] iArr1 = new int[N][N];
        float f1 = 2.152F;
        double[] dArr = new double[N];

        FuzzerUtils.init(dArr, 61.44458);
        FuzzerUtils.init(iArr1, 224);

        for (i2 = 19; i2 < 331; i2++) {
            switch ((i2 % 10) + 38) {
                case 38:
                    i = (int) (--Test0402.instanceCount);
                    break;
                case 39:
                    i -= (int) (i2 + ((-1.197F - Math.abs(39)) + (f1--)));
                    iMeth(i);
                    Test0402.dFld -= Test0402.instanceCount;
                    i19 = 1;
                    while (++i19 < 5) {
                        i3 *= -32386;
                        switch (((i19 % 5) * 5) + 121) {
                            case 136:
                                i20 = 1;
                                do {
                                    i3 = i2;
                                } while (++i20 < 1);
                                switch (((i19 % 2) * 5) + 106) {
                                    case 110:
                                        i1 = i;
                                        dArr[i2] -= i20;
                                    case 113:
                                    default:
                                        i += (i19 * i19);
                                }
                            case 139:
                                i1 = (int) 70977947507714312L;
                            case 130:
                                Test0402.instanceCount += 121L;
                                break;
                            case 125:
                                i3 = i2;
                            case 146:
                                i >>= (int) Test0402.instanceCount;
                                break;
                            default:
                        }
                    }
                    break;
                case 40:
                    iArr1[i2 - 1][i2 + 1] = (int) Test0402.dFld;
                    break;
                case 41:
                    Test0402.instanceCount += 124;
                    break;
                case 42:
                    i1 -= i20;
                case 43:
                    iArr1[i2 - 1][i2] += -4;
                    break;
                case 44:
                    iArr1[i2] = iArr1[i2 - 1];
                case 45:
                    Test0402.instanceCount -= Test0402.instanceCount;
                    break;
                case 46:
                    Test0402.fArrFld = Test0402.fArrFld;
                    break;
                case 47:
                    iArr1[i2 - 1][i2 + 1] >>= i2;
                    break;
                default:
                    i1 = i19;
            }
        }
        vMeth_check_sum += i + i1 + i2 + i3 + Float.floatToIntBits(f1) + i19 + i20 +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr1);
    }

    public static void main(String[] strArr) {

        try {
            Test0402 _instance = new Test0402();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        float f = 0.564F;
        int i21 = 82;
        int i22 = 131;
        int i23 = -103;
        int i24 = -2322;
        int i25 = -3385;
        int i26 = -3;
        int i27 = 220;
        int[] iArr2 = new int[N];
        long[] lArr = new long[N];
        byte[] byArr = new byte[N];

        FuzzerUtils.init(lArr, 2000859797094857236L);
        FuzzerUtils.init(byArr, (byte) -56);
        FuzzerUtils.init(iArr2, 37096);

        f *= sFld;
        lArr = (lArr = lArr);
        vMeth(i21, i21);
        i21 = (int) Test0402.dFld;
        Test0402.instanceCount |= i21;
        for (i22 = 22; 373 > i22; i22++) {
            Test0402.fFld += (i22 - Test0402.instanceCount);
            i21 += (int) -12L;
            i24 = 1;
            do {
                i23 -= i23;
            } while (++i24 < 72);
            i21 *= sFld;
            i21 -= i23;
            byArr[i22 - 1] += Test0402.byFld;
            for (i25 = 2; i25 < 72; i25++) {
                Test0402.bArrFld[i25] = true;
                iArr2[i22 + 1] <<= -11;
                i27 = 1;
                do {
                    lArr[i27 - 1] += (long) 12.680;
                    switch ((i22 % 2) + 55) {
                        case 55:
                            i23 += i27;
                        case 56:
                            Test0402.instanceCount = i26;
                            Test0402.instanceCount >>= i21;
                            break;
                    }
                    switch ((i27 % 2) + 91) {
                        case 91:
                            i23 = (int) Test0402.instanceCount;
                            i21 = (int) f;
                            i26 -= sFld;
                            i21 += (i27 + i24);
                            break;
                        case 92:
                            if (true) {
                                i26 += (i27 * i27);
                            } else if (Test0402.bFld) {
                                i26 = (int) Test0402.instanceCount;
                            } else if (Test0402.bFld) {
                                i21 = i23;
                            }
                    }
                } while (++i27 < 2);
            }
        }

        FuzzerUtils.out.println("f i21 i22 = " + Float.floatToIntBits(f) + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 i27 lArr = " + i26 + "," + i27 + "," + FuzzerUtils.checkSum(lArr));
        FuzzerUtils.out.println("byArr iArr2 = " + FuzzerUtils.checkSum(byArr) + "," + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test0402.instanceCount sFld Test0402.fFld = " + Test0402.instanceCount + "," + sFld + "," +
                Float.floatToIntBits(Test0402.fFld));
        FuzzerUtils.out.println("Test0402.bFld Test0402.byFld Test0402.dFld = " + (Test0402.bFld ? 1 : 0) + "," + Test0402.byFld + "," +
                Double.doubleToLongBits(Test0402.dFld));
        FuzzerUtils.out.println("Test0402.fArrFld Test0402.bArrFld Test0402.lArrFld = " +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0402.fArrFld)) + "," + FuzzerUtils.checkSum(Test0402.bArrFld) +
                "," + FuzzerUtils.checkSum(Test0402.lArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
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
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
