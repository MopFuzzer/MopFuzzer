// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:54 2023
public class Test0047 {

    public static final int N = 400;

    public static long instanceCount = -3075772087L;
    public static boolean bFld = false;
    public static volatile float fFld = 0.907F;
    public static long[] lArrFld = new long[N];
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0047.lArrFld, 1400833103L);
    }

    public static void vMeth1() {

        int i5 = -36605;
        int i6 = 18;
        int i7 = 6253;
        int i8 = 1560;
        int i9 = 40727;
        int i10 = 214;
        int i11 = 132;
        int i12 = -190;
        int i13 = -33405;
        int[] iArr = new int[N];
        double d1 = -48.61039;

        FuzzerUtils.init(iArr, 4);

        for (i5 = 17; i5 < 325; i5 += 3) {
            Test0047.bFld = Test0047.bFld;
        }
        for (i7 = 2; i7 < 356; i7++) {
            iArr[i7 + 1] ^= 13;
            Test0047.fFld /= (i8 | 1);
            if (true) {
                for (i9 = 1; i9 < 5; ++i9) {
                    i10 += -55;
                    for (i11 = i9; i11 < 2; ++i11) {
                        i8 += i11;
                        i6 = i8;
                        i10 += (int) Test0047.instanceCount;
                        Test0047.fFld += i11;
                        try {
                            i12 = (iArr[i7] % i13);
                            i13 = (iArr[i7 - 1] / iArr[i9 - 1]);
                            i10 = (-40 / i6);
                        } catch (ArithmeticException a_e) {
                        }
                        Test0047.instanceCount *= i5;
                    }
                }
                vMeth1_check_sum += i5 + i6 + i7 + i8 + i9 + i10 + i11 + i12 + i13 + Double.doubleToLongBits(d1) +
                        FuzzerUtils.checkSum(iArr);
                return;
            } else {
                Test0047.lArrFld[i7 + 1] = (long) d1;
            }
        }
        vMeth1_check_sum += i5 + i6 + i7 + i8 + i9 + i10 + i11 + i12 + i13 + Double.doubleToLongBits(d1) +
                FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth() {

        int i4 = -164, i14 = 14;
        double d = -39.87020;
        long l = 156L;

        i4 *= ((i4--) - Math.min(i4, (int) (d - i4)));
        vMeth1();
        for (l = 18; l < 337; ++l) {
            i14 *= (int) Test0047.instanceCount;
        }
        i4 <<= i14;
        Test0047.fFld = Test0047.instanceCount;
        Test0047.instanceCount = Test0047.instanceCount;
        vMeth_check_sum += i4 + Double.doubleToLongBits(d) + l + i14;
    }

    public static int iMeth(int i1, int i2, int i3) {

        int i15 = 251;
        int i16 = -199;
        int i17 = 59996;
        int i18 = -64224;
        int i19 = -10;
        int[] iArr1 = new int[N];
        double d2 = -114.5703;
        byte[] byArr = new byte[N];

        FuzzerUtils.init(iArr1, 51);
        FuzzerUtils.init(byArr, (byte) 59);

        if (Test0047.bFld) {
            vMeth();
            for (i15 = 19; i15 < 380; i15++) {
                i2 = (int) Test0047.instanceCount;
                for (i17 = i15; i17 < 5; ++i17) {
                    Test0047.instanceCount += i15;
                    Test0047.instanceCount += (i17 | Test0047.instanceCount);
                    for (d2 = 1; d2 < 1; d2++) {
                        i3 += (int) Test0047.instanceCount;
                        iArr1[i17] -= 20643;
                    }
                    iArr1 = iArr1;
                    if (false) continue;
                    i19 = i2;
                    if (Test0047.bFld) break;
                    i3 = (int) Test0047.instanceCount;
                }
            }
        } else if (Test0047.bFld) {
            i19 -= i18;
        } else if (Test0047.bFld) {
            byArr[(i17 >>> 1) % N] -= (byte) i1;
        } else {
            i1 = (int) Test0047.instanceCount;
        }
        long meth_res = i1 + i2 + i3 + i15 + i16 + i17 + i18 + Double.doubleToLongBits(d2) + i19 +
                FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(byArr);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0047 _instance = new Test0047();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = 50760;
        int i20 = 56468;
        int i21 = 32462;
        int i22 = 0;
        int i23 = -95;
        int i24 = 3759;
        int i25 = -10;
        int i26 = -1;
        int i27 = -193;
        int i28 = -158;
        int i29 = 6961;
        int[] iArr2 = new int[N];
        float f = 75.412F;
        byte by = 124;

        FuzzerUtils.init(iArr2, 42391);

        Test0047.instanceCount <<= i;
        Test0047.instanceCount *= ((iMeth(-12, i, 13145) + -33883) + -93);
        for (f = 5; f < 155; ++f) {
            Test0047.instanceCount += (long) ((long) f ^ i);
            if (Test0047.bFld) break;
            iArr2[(int) (f - 1)] *= by;
            for (i21 = 5; 167 > i21; ++i21) {
                for (i23 = 2; i23 > 1; i23--) {
                    i += (i23 ^ Test0047.instanceCount);
                    i20 -= i22;
                    Test0047.fFld += i22;
                    i24 += i23;
                    if (Test0047.bFld) break;
                    if (Test0047.bFld) continue;
                    Test0047.fFld -= 18612;
                    i20 -= i21;
                }
                for (i25 = 1; i25 < 2; ++i25) {
                    i24 %= (int) (Test0047.instanceCount | 1);
                    Test0047.fFld += (((i25 * by) + i25) - Test0047.instanceCount);
                }
                for (i27 = 1; i27 < 2; ++i27) {
                    i24 += i24;
                    iArr2[i21] *= (int) Test0047.instanceCount;
                    i24 *= i28;
                    iArr2[i27 + 1] <<= i;
                    i26 = i29;
                    i28 <<= i22;
                    i <<= (int) Test0047.instanceCount;
                    Test0047.instanceCount = i26;
                }
                i -= i;
            }
            Test0047.fFld += ((long) f ^ (long) Test0047.instanceCount);
        }

        FuzzerUtils.out.println("i f i20 = " + i + "," + Float.floatToIntBits(f) + "," + i20);
        FuzzerUtils.out.println("by i21 i22 = " + by + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 i27 i28 = " + i26 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("i29 iArr2 = " + i29 + "," + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test0047.instanceCount Test0047.bFld Test0047.fFld = " + Test0047.instanceCount + "," + (Test0047.bFld ? 1
                : 0) + "," + Float.floatToIntBits(Test0047.fFld));
        FuzzerUtils.out.println("Test0047.lArrFld = " + FuzzerUtils.checkSum(Test0047.lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
