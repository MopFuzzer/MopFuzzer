// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:08 2023
public class Test0602 {

    public static final int N = 400;

    public static long instanceCount = -27363L;
    public static int iFld = 16;
    public static volatile byte byFld = 105;
    public static short sFld = -739;
    public static volatile double dFld = 0.73238;
    public static float fFld = 0.643F;
    public static int[] iArrFld = new int[N];
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0602.iArrFld, -7);
    }

    public static long lMeth(long l, int i7) {

        int i8 = 39, i9 = 135, i10 = 22798, i11 = -1, i12 = -6, i13 = -4;
        float f2 = 0.584F;
        boolean b1 = true;

        for (i8 = 7; i8 < 193; ++i8) {
            Test0602.instanceCount /= (l | 1);
            Test0602.iFld += (int) -1.4537;
            for (i10 = 1; i10 < 9; i10++) {
                Test0602.instanceCount -= (long) f2;
                Test0602.iFld >>= -16386;
                for (i12 = 1; i12 < 2; ++i12) {
                    i9 = (int) Test0602.instanceCount;
                    if (b1) {
                        l >>>= i10;
                        Test0602.iArrFld[i12 + 1] += Test0602.sFld;
                        f2 -= Test0602.instanceCount;
                    } else {
                        i13 += (i12 * i7);
                    }
                }
            }
            i7 = (int) 1.586F;
            i13 += (int) Test0602.dFld;
        }
        long meth_res = l + i7 + i8 + i9 + i10 + i11 + Float.floatToIntBits(f2) + i12 + i13 + (b1 ? 1 : 0);
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public static void vMeth1(int i4, int i5, int i6) {

        float f1 = -69.193F;
        float[] fArr = new float[N];
        long l1 = -2385091906L;
        int i14 = 9, i15 = -11, i16 = -145, i17 = 65;

        FuzzerUtils.init(fArr, 2.698F);

        fArr[(i6 >>> 1) % N] *= i4;
        Test0602.instanceCount -= (long) (++f1);
        i6 += (int) (lMeth(7030346655019638195L, i4) + -52114);
        for (l1 = 9; l1 < 306; l1++) {
            Test0602.dFld += i5;
            Test0602.dFld += Test0602.iFld;
            Test0602.iArrFld[(int) (l1)] -= (int) Test0602.instanceCount;
            i15 = 1;
            do {
                f1 += (i15 * i15);
                f1 -= -13L;
                Test0602.iArrFld[i15 + 1] += i4;
                Test0602.iArrFld[(int) (l1 + 1)] += i4;
            } while (++i15 < 6);
            for (i16 = 1; i16 < 6; ++i16) {
                if (false) break;
                Test0602.iArrFld[(int) (l1)] >>= (int) l1;
            }
        }
        vMeth1_check_sum += i4 + i5 + i6 + Float.floatToIntBits(f1) + l1 + i14 + i15 + i16 + i17 +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth(float f) {

        int i = -27704;
        int i1 = -10;
        int i2 = -41608;
        int i3 = -4;
        int[] iArr = new int[N];
        boolean b = true;
        double d = -1.127815;
        byte[] byArr = new byte[N];

        FuzzerUtils.init(iArr, 221);
        FuzzerUtils.init(byArr, (byte) 85);

        for (i = 14; i < 281; ++i) {
            if (b) continue;
            for (i2 = i; 6 > i2; ++i2) {
                Test0602.instanceCount = ((Test0602.instanceCount + (i - Test0602.instanceCount)) + iArr[i + 1]);
                switch ((i % 10) + 82) {
                    case 82:
                    case 83:
                    case 84:
                        f -= (float) d;
                        Test0602.iFld <<= byArr[i2];
                        i3 *= (int) (((-(-1309924674729948214L | (Test0602.iFld + -99))) + (i % (Test0602.instanceCount | 1))) +
                                ((14 - (--Test0602.iFld)) << (Test0602.byFld - Test0602.instanceCount)));
                        vMeth1(i, i, i3);
                        break;
                    case 85:
                        Test0602.iFld += i2;
                        if (b) {
                            i3 += (i2 + Test0602.sFld);
                        } else {
                            i3 += (int) d;
                        }
                        break;
                    case 86:
                    case 87:
                        Test0602.iFld >>= Test0602.iFld;
                    case 88:
                        Test0602.instanceCount -= -41775;
                    case 89:
                        i1 = Test0602.byFld;
                    case 90:
                        if (i2 != 0) {
                            vMeth_check_sum += Float.floatToIntBits(f) + i + i1 + (b ? 1 : 0) + i2 + i3 +
                                    Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(byArr);
                            return;
                        }
                        break;
                    case 91:
                    default:
                        if (false) break;
                }
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f) + i + i1 + (b ? 1 : 0) + i2 + i3 + Double.doubleToLongBits(d) +
                FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(byArr);
    }

    public static void main(String[] strArr) {

        try {
            Test0602 _instance = new Test0602();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i18 = -55322, i19 = -13, i20 = 1, i21 = -242, i22 = 7, i23 = 28120, i24 = 0, i25 = -53, i26 = -59143, i27 = -5;
        long l2 = 51L;

        Test0602.instanceCount -= (Test0602.iFld + ((Test0602.instanceCount - 10663) - (Test0602.iFld << Test0602.iFld)));
        vMeth(Test0602.fFld);
        Test0602.iFld |= -63032;
        Test0602.sFld ^= (short) Test0602.iFld;
        for (i18 = 13; i18 < 332; i18++) {
            i19 = 57897;
            for (i20 = i18; i20 < 79; i20++) {
                i19 += i20;
                Test0602.instanceCount = Test0602.sFld;
                i22 = 1;
                do {
                    Test0602.instanceCount >>= -10461;
                    if (true) {
                        Test0602.instanceCount = i18;
                        Test0602.dFld = -5226;
                    }
                    i21 += i22;
                    Test0602.instanceCount = (long) Test0602.fFld;
                } while (++i22 < 1);
                i23 = 1;
                while (++i23 < 1) {
                    Test0602.instanceCount = i19;
                    Test0602.dFld -= Test0602.fFld;
                    Test0602.fFld *= i19;
                    Test0602.instanceCount = -208L;
                    i19 = 60560;
                }
                Test0602.iArrFld[i20 + 1] = (int) Test0602.fFld;
                for (i24 = 1; i24 < 1; ++i24) {
                    i19 <<= Test0602.sFld;
                    Test0602.instanceCount -= i19;
                }
                for (i26 = 1; i26 < 1; i26++) {
                    Test0602.sFld += (short) (i26 + Test0602.byFld);
                    Test0602.iArrFld[i18 - 1] >>>= i26;
                    Test0602.instanceCount += (((i26 * Test0602.instanceCount) + i23) - l2);
                }
            }
        }

        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 l2 = " + i27 + "," + l2);

        FuzzerUtils.out.println("Test0602.instanceCount Test0602.iFld Test0602.byFld = " + Test0602.instanceCount + "," + Test0602.iFld +
                "," + Test0602.byFld);
        FuzzerUtils.out.println("Test0602.sFld Test0602.dFld Test0602.fFld = " + Test0602.sFld + "," +
                Double.doubleToLongBits(Test0602.dFld) + "," + Float.floatToIntBits(Test0602.fFld));
        FuzzerUtils.out.println("Test0602.iArrFld = " + FuzzerUtils.checkSum(Test0602.iArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
