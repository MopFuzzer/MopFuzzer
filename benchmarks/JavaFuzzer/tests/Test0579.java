// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:07 2023
public class Test0579 {

    public static final int N = 400;

    public static long instanceCount = 8361267149520256742L;
    public static double dFld = 61.49034;
    public static volatile float fFld = 0.226F;
    public static byte byFld = -82;
    public static int[] iArrFld = new int[N];
    public static float[] fArrFld = new float[N];
    public static short[][] sArrFld = new short[N][N];
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0579.iArrFld, -12);
        FuzzerUtils.init(Test0579.fArrFld, 0.846F);
        FuzzerUtils.init(Test0579.sArrFld, (short) -28463);
    }

    public boolean bFld = false;
    public long[] lArrFld = new long[N];

    public static void vMeth1() {

        int i8 = -184, i9 = 41672, i10 = 158, i11 = 95, i12 = -53909, i13 = -22339;
        long l = 2588783197L;
        long[] lArr = new long[N];
        boolean b = true;
        byte by = 67;

        FuzzerUtils.init(lArr, -28L);

        i8 = i8;
        Test0579.instanceCount -= Test0579.instanceCount;
        Test0579.instanceCount = -2;
        for (i9 = 18; i9 < 294; i9 += 2) {
            lArr[i9 - 1] = -13180;
            if (false) {
                Test0579.instanceCount = Test0579.instanceCount;
                for (l = 1; l < 11; ++l) {
                    i10 += (int) (l | Test0579.instanceCount);
                    Test0579.dFld = i10;
                    for (i12 = 1; i12 < 2; i12++) {
                        i13 -= i12;
                        i8 = 6849;
                        b = b;
                        lArr = lArr;
                    }
                }
                vMeth1_check_sum += i8 + i9 + i10 + l + i11 + i12 + i13 + (b ? 1 : 0) + by + FuzzerUtils.checkSum(lArr);
                return;
            } else if (b) {
                i10 = by;
                vMeth1_check_sum += i8 + i9 + i10 + l + i11 + i12 + i13 + (b ? 1 : 0) + by + FuzzerUtils.checkSum(lArr);
                return;
            }
        }
        vMeth1_check_sum += i8 + i9 + i10 + l + i11 + i12 + i13 + (b ? 1 : 0) + by + FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth(int i3, int i4, int i5) {

        int i6 = 64, i7 = 77, i14 = 24, i15 = -2, i16 = 45;
        boolean b1 = true;
        short s = -4635;

        for (i6 = 3; i6 < 196; i6++) {
            i7 += Test0579.iArrFld[i6 - 1];
            vMeth1();
            i4 += i5;
            Test0579.fFld *= i6;
            try {
                i4 = (i6 / i3);
                i7 = (Test0579.iArrFld[i6] / i6);
                i5 = (i3 / -51261);
            } catch (ArithmeticException a_e) {
            }
        }
        for (i14 = 8; i14 < 170; i14++) {
            Test0579.fFld += (((i14 * i5) + Test0579.instanceCount) - i6);
            Test0579.sArrFld[i14][i14] += (short) i6;
            switch ((i14 % 2) + 119) {
                case 119:
                    Test0579.iArrFld[(i4 >>> 1) % N] *= i16;
                    i16 -= (int) Test0579.dFld;
                    b1 = b1;
                    break;
                case 120:
                    i16 = s;
                    break;
                default:
                    i3 = s;
            }
        }
        long meth_res = i3 + i4 + i5 + i6 + i7 + i14 + i15 + i16 + (b1 ? 1 : 0) + s;
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth() {

        float f = 0.564F;
        int i1 = 1, i2 = -62231, i17 = -13, i18 = -98, i19 = 163;
        short s1 = -3109;
        long l1 = -2647365595695237726L;

        f = Math.abs(Test0579.iArrFld[(i1 >>> 1) % N]);
        Test0579.fArrFld[(i1 >>> 1) % N] -= (-((long) (i2 - Test0579.dFld) | iMeth(-46889, i1, i1)));
        i2 <<= s1;
        i17 = 1;
        do {
            Test0579.iArrFld[i17] <<= (int) Test0579.instanceCount;
            Test0579.fArrFld[i17] -= (float) Test0579.dFld;
            try {
                i2 = (-1909832793 % i17);
                Test0579.iArrFld[i17] = (209 % Test0579.iArrFld[i17 - 1]);
                i2 = (-81 / i2);
            } catch (ArithmeticException a_e) {
            }
            Test0579.instanceCount += (long) Test0579.dFld;
            i1 += (((i17 * i17) + l1) - Test0579.fFld);
        } while (++i17 < 128);
        i1 += (int) l1;
        for (i18 = 1; i18 < 144; ++i18) {
            Test0579.instanceCount = i19;
            l1 = i2;
            l1 = i1;
            i1 = i18;
        }
        vMeth_check_sum += Float.floatToIntBits(f) + i1 + i2 + s1 + i17 + l1 + i18 + i19;
    }

    public static void main(String[] strArr) {

        try {
            Test0579 _instance = new Test0579();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = 12, i20 = -39227, i21 = -87, i22 = -13;
        double d = -1.53608;
        short s2 = 6016;

        i = i;
        vMeth();
        d = 1;
        while (++d < 375) {
            for (i20 = 1; i20 < 67; i20++) {
                i21 >>= (int) Test0579.instanceCount;
                i22 = 1;
                do {
                    Test0579.dFld += Test0579.instanceCount;
                    Test0579.instanceCount += i;
                    Test0579.iArrFld[i20] = i20;
                    switch (((i20 % 9) * 5) + 127) {
                        case 144:
                            lArrFld[i22] = Test0579.instanceCount;
                            Test0579.iArrFld = Test0579.iArrFld;
                            i21 += (36 + (i22 * i22));
                            Test0579.instanceCount += i21;
                            break;
                        case 154:
                            Test0579.instanceCount += i22;
                            break;
                        case 157:
                            Test0579.instanceCount += i22;
                            s2 += (short) (i22 + i22);
                            break;
                        case 137:
                            lArrFld[(int) (d)] = i21;
                            Test0579.instanceCount -= Test0579.instanceCount;
                            i >>= i;
                            break;
                        case 140:
                            Test0579.dFld = -13L;
                        case 142:
                            Test0579.instanceCount += i22;
                            i /= (int) (i20 | 1);
                            i += i;
                            i += i22;
                            break;
                        case 130:
                            i &= (int) Test0579.instanceCount;
                            switch ((i22 % 1) + 95) {
                                case 95:
                                    Test0579.fFld += (i22 * i22);
                                    if (true) break;
                                    Test0579.instanceCount = i;
                                    break;
                                default:
                                    if (bFld) break;
                            }
                            break;
                        case 136:
                            Test0579.instanceCount <<= i21;
                            break;
                        case 141:
                            i = Test0579.byFld;
                            break;
                    }
                } while (++i22 < 2);
            }
        }

        FuzzerUtils.out.println("i d i20 = " + i + "," + Double.doubleToLongBits(d) + "," + i20);
        FuzzerUtils.out.println("i21 i22 s2 = " + i21 + "," + i22 + "," + s2);

        FuzzerUtils.out.println("Test0579.instanceCount Test0579.dFld Test0579.fFld = " + Test0579.instanceCount + "," +
                Double.doubleToLongBits(Test0579.dFld) + "," + Float.floatToIntBits(Test0579.fFld));
        FuzzerUtils.out.println("bFld Test0579.byFld Test0579.iArrFld = " + (bFld ? 1 : 0) + "," + Test0579.byFld + "," +
                FuzzerUtils.checkSum(Test0579.iArrFld));
        FuzzerUtils.out.println("Test0579.fArrFld Test0579.sArrFld lArrFld = " +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0579.fArrFld)) + "," + FuzzerUtils.checkSum(Test0579.sArrFld) +
                "," + FuzzerUtils.checkSum(lArrFld));

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