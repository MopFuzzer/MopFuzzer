// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:05 2023
public class Test0477 {

    public static final int N = 400;

    public static long instanceCount = 8385285629829803958L;
    public static double dFld = 1.50343;
    public static volatile float fFld = -101.988F;
    public static int iFld = 0;
    public static boolean bFld = false;

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i = -10;
        int i1 = 14;
        int i2 = -23053;
        int i3 = -36811;
        int i4 = 7;
        int i5 = -14;
        int i6 = -44;
        int i7 = 65;
        int i8 = -245;
        int[] iArr1 = new int[N];
        byte by = 87;
        float[] fArr = new float[N];

        FuzzerUtils.init(fArr, -99.4F);
        FuzzerUtils.init(iArr1, 128);

        Test0477.instanceCount %= (i | 1);
        for (i1 = 8; i1 < 176; ++i1) {
            for (i3 = i1; i3 < 9; ++i3) {
                Test0477.fFld = -41;
            }
            for (i5 = 1; i5 < 9; ++i5) {
                boolean b = true;
                if (b) break;
                b = true;
                switch ((i5 % 1) + 43) {
                    case 43:
                        fArr[i1 - 1] *= i5;
                        i4 = 51;
                        by -= (byte) i5;
                        Test0477.instanceCount -= -34274;
                        break;
                }
                for (i7 = 1; i7 < 2; i7++) {
                    i8 -= -14009;
                    iArr1[i5] = (int) Test0477.instanceCount;
                }
            }
        }
        vMeth1_check_sum += i + i1 + i2 + i3 + i4 + i5 + i6 + by + i7 + i8 +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth() {

        int i9 = -176;
        int i10 = 7;
        int i11 = 1;
        int i12 = -5;
        int i13 = -37823;
        int[] iArr2 = new int[N];
        boolean b1 = false;

        FuzzerUtils.init(iArr2, 47572);

        vMeth1();
        iArr2 = iArr2;
        i9 = (int) Test0477.instanceCount;
        i9 = i9;
        Test0477.fFld -= i9;
        for (i10 = 301; i10 > 2; --i10) {
            byte by1 = -87;
            short s = -31916;
            if (b1) {
                by1 <<= (byte) i9;
                s *= (short) i10;
                for (i12 = 1; i12 < 6; i12++) {
                    if (b1) continue;
                    i13 += i12;
                    Test0477.instanceCount = i13;
                    try {
                        i13 = (-1907926231 / i10);
                        i9 = (i12 / i9);
                        i13 = (61983 % i12);
                    } catch (ArithmeticException a_e) {
                    }
                    try {
                        i11 = (iArr2[i10 - 1] / -36374);
                        iArr2[i10 + 1] = (i10 / i10);
                        iArr2[i12] = (i11 / i9);
                    } catch (ArithmeticException a_e) {
                    }
                }
            } else if (b1) {
                i9 += (int) (3897997241L + (i10 * i10));
            } else {
                Test0477.iFld = i9;
            }
        }
        long meth_res = i9 + i10 + i11 + i12 + i13 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth() {

        double d = 2.33566;
        int i14 = -15457;
        int i15 = 9757;
        int i16 = 4;
        int i17 = 4;
        int i18 = -8;
        int i19 = 10;
        int[] iArr = new int[N];

        FuzzerUtils.init(iArr, -134);

        iArr[(25 >>> 1) % N] = (int) Test0477.dFld;
        Test0477.instanceCount = iMeth();
        iArr[(149 >>> 1) % N] = Test0477.iFld;
        Test0477.iFld |= (int) -19628L;
        Test0477.instanceCount += 50694;
        for (d = 12; d < 357; ++d) {
            Test0477.dFld -= i14;
            Test0477.iFld += i14;
            for (i15 = (int) (d); 5 > i15; i15++) {
                Test0477.iFld = i15;
                for (i17 = 1; i17 < 1; ++i17) {
                    Test0477.iFld = (int) Test0477.instanceCount;
                }
                i19 *= (int) Test0477.fFld;
                i16 = i19;
                Test0477.instanceCount = Test0477.instanceCount;
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + i14 + i15 + i16 + i17 + i18 + i19 + FuzzerUtils.checkSum(iArr);
    }

    public static void main(String[] strArr) {

        try {
            Test0477 _instance = new Test0477();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i20 = 13;
        int i21 = -13;
        int i22 = 34623;
        int i23 = -80;
        int i24 = 235;
        int i25 = 56410;
        int[] iArr3 = new int[N];
        double d1 = 66.53919;
        byte by2 = -3;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, 14911L);
        FuzzerUtils.init(iArr3, 56839);

        vMeth();
        Test0477.iFld >>= (int) Test0477.instanceCount;
        i20 = 1;
        while (++i20 < 284) {
            for (d1 = 89; d1 > 4; --d1) {
                Test0477.instanceCount = i21;
                lArr[(int) (d1 + 1)] = -30211L;
                Test0477.iFld = i21;
                if (Test0477.bFld) break;
                for (i22 = 1; i22 < 2; i22++) {
                    i23 >>= 57560;
                    Test0477.iFld -= (int) Test0477.instanceCount;
                    i23 = i21;
                    iArr3[i20] >>= i21;
                    iArr3[i20 + 1] = (int) Test0477.instanceCount;
                    Test0477.iFld += i22;
                }
                for (i24 = 1; i24 < 2; i24++) {
                    Test0477.instanceCount -= Test0477.instanceCount;
                    Test0477.fFld += (i24 * i24);
                    try {
                        i23 = (i23 / iArr3[(int) (d1)]);
                        Test0477.iFld = (i21 % iArr3[(int) (d1)]);
                        iArr3[i24 - 1] = (i21 / 62195);
                    } catch (ArithmeticException a_e) {
                    }
                    iArr3 = iArr3;
                    i23 >>= i21;
                    by2 += (byte) i22;
                    switch ((((i23 >>> 1) % 2) * 5) + 46) {
                        case 53:
                            Test0477.fFld = Test0477.iFld;
                            Test0477.instanceCount *= by2;
                            iArr3[(int) (d1)] = i24;
                            break;
                        case 47:
                            by2 <<= (byte) i20;
                            Test0477.fFld = 47010;
                            i21 -= i25;
                            break;
                        default:
                            Test0477.instanceCount = Test0477.instanceCount;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i20 d1 i21 = " + i20 + "," + Double.doubleToLongBits(d1) + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 by2 lArr = " + i25 + "," + by2 + "," + FuzzerUtils.checkSum(lArr));
        FuzzerUtils.out.println("iArr3 = " + FuzzerUtils.checkSum(iArr3));

        FuzzerUtils.out.println("Test0477.instanceCount Test0477.dFld Test0477.fFld = " + Test0477.instanceCount + "," +
                Double.doubleToLongBits(Test0477.dFld) + "," + Float.floatToIntBits(Test0477.fFld));
        FuzzerUtils.out.println("Test0477.iFld Test0477.bFld = " + Test0477.iFld + "," + (Test0477.bFld ? 1 : 0));

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
