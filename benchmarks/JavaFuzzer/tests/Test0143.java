// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:56 2023
public class Test0143 {

    public static final int N = 400;

    public static long instanceCount = -176L;
    public static double dFld = 76.26794;
    public static float fFld = -100.36F;
    public static float fFld1 = 60.973F;
    public static volatile boolean bFld = true;
    public static short sFld = -10205;
    public static int[] iArrFld = new int[N];
    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0143.iArrFld, -244);
    }

    public double[] dArrFld = new double[N];
    public byte[] byArrFld = new byte[N];

    public static double dMeth(long l1, long l2) {

        int i8 = -41979, i9 = 30, i10 = 4702, i11 = -50524, i12 = -42651, i13 = -73;
        boolean b = true;
        long l3 = -3181234955L, l4 = -1135144373019082093L;

        for (i8 = 387; i8 > 13; --i8) {
            for (i10 = 1; 5 > i10; i10++) {
                for (i12 = 1; 2 > i12; ++i12) {
                    Test0143.iArrFld[i8] -= (int) l2;
                    Test0143.iArrFld[i12 + 1] *= i8;
                    i11 += (((i12 * i9) + i12) - Test0143.instanceCount);
                    Test0143.fFld += i10;
                    Test0143.iArrFld = FuzzerUtils.int1array(N, (int) -167);
                    switch (((i12 % 7) * 5) + 69) {
                        case 71:
                            i11 ^= i8;
                            break;
                        case 102:
                            Test0143.iArrFld[i8 + 1] = 9;
                            b = b;
                            i13 = i13;
                            break;
                        case 92:
                            i11 = i11;
                            if (b) continue;
                            break;
                        case 87:
                            l2 *= l3;
                        case 84:
                            Test0143.dFld %= 73;
                            break;
                        case 74:
                            Test0143.fFld += (((i12 * Test0143.instanceCount) + l4) - i9);
                            break;
                        case 89:
                    }
                }
            }
        }
        long meth_res = l1 + l2 + i8 + i9 + i10 + i11 + i12 + i13 + (b ? 1 : 0) + l3 + l4;
        dMeth_check_sum += meth_res;
        return (double) meth_res;
    }

    public static void vMeth(int i3, int i4, long l) {

        int i5 = -127, i6 = 20516, i7 = -216, i14 = 47521, i15 = 129, i16 = -206, i17 = 34263;
        double d = 33.40951;
        double[] dArr = new double[N];
        short s = 15076;

        FuzzerUtils.init(dArr, 78.42095);

        i3 -= (int) l;
        for (i5 = 7; i5 < 236; i5++) {
            i4 += (i5 + i3);
        }
        i7 = 1;
        do {
            Test0143.iArrFld[i7 - 1] >>= (int) (((i3 * d) % (((long) (i4 + Test0143.dFld)) | 1)) * (i3 - (s % (l | 1))));
            i3 >>>= i5;
            i4 *= (int) (l * (i4 += (int) dArr[i7]));
            i3 -= (int) ((i3 - (++i6)) * (dMeth(l, l) - -2.64267));
            for (i14 = 5; i14 > 1; i14--) {
                Test0143.instanceCount = (long) d;
            }
            dArr[i7] = Test0143.instanceCount;
            switch (((110 >>> 1) % 8) + 52) {
                case 52:
                    for (i16 = i7; 5 > i16; i16++) {
                        Test0143.dFld = i16;
                        i17 -= -3;
                    }
                    break;
                case 53:
                    i3 += i6;
                    break;
                case 54:
                    l = s;
                    break;
                case 55:
                    i15 = i6;
                    break;
                case 56:
                    i6 -= s;
                    break;
                case 57:
                    i17 += (i7 * i7);
                    break;
                case 58:
                case 59:
                    i4 ^= (int) l;
                default:
                    Test0143.iArrFld[i7] *= -5700;
            }
        } while (++i7 < 320);
        vMeth_check_sum += i3 + i4 + l + i5 + i6 + i7 + Double.doubleToLongBits(d) + s + i14 + i15 + i16 + i17 +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static float fMeth(int i2, float f1) {

        long l5 = 2727237529L;
        int i18 = 0;

        vMeth(i2, i2, Test0143.instanceCount);
        for (l5 = 9; 341 > l5; ++l5) {
            f1 -= i2;
            if (Test0143.bFld) {
                i18 >>= i2;
            } else if (false) {
                if (true) {
                    i2 -= i2;
                    if (Test0143.bFld) {
                        Test0143.instanceCount = i2;
                        Test0143.iArrFld[(int) (l5 + 1)] += (int) Test0143.fFld1;
                        Test0143.dFld += -4;
                    } else {
                        Test0143.instanceCount += (((l5 * i2) + f1) - i2);
                        i18 <<= Test0143.sFld;
                    }
                    Test0143.instanceCount += (l5 ^ i18);
                    Test0143.bFld = Test0143.bFld;
                } else if (Test0143.bFld) {
                    i2 -= (int) Test0143.fFld1;
                } else if (Test0143.bFld) {
                    i18 = 0;
                } else {
                    i2 -= i2;
                }
            } else {
                Test0143.instanceCount += (long) Test0143.dFld;
            }
        }
        long meth_res = i2 + Float.floatToIntBits(f1) + l5 + i18;
        fMeth_check_sum += meth_res;
        return (float) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0143 _instance = new Test0143();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = -44359, i1 = 1175, i19 = 48, i20 = 14, i22 = 53838, i23 = -14, i24 = -150, i25 = 4;
        float f = -70.107F;
        float[] fArr = new float[N];
        byte by = -86;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, 6064829368232966214L);
        FuzzerUtils.init(fArr, -1.7F);

        i = (++i1);
        i1 = (int) (-10 * (f *= Math.abs(i)));
        i = (int) (((i1 * -210) + fMeth(i1, f)) * 1);
        dArrFld[(i1 >>> 1) % N] += Test0143.dFld;
        Test0143.instanceCount += (long) 118.108112;
        for (i19 = 19; i19 < 325; i19++) {
            lArr[i19 + 1] = Test0143.instanceCount;
        }
        byArrFld = byArrFld;
        Test0143.bFld = Test0143.bFld;
        for (int i21 : Test0143.iArrFld) {
            i20 += (int) Test0143.instanceCount;
            by = (byte) i;
            lArr[(i1 >>> 1) % N] = i19;
            i1 = i1;
            for (i22 = 1; i22 < 63; i22++) {
                for (i24 = 1; i24 < 2; ++i24) {
                    fArr[i22 + 1] -= i;
                    byArrFld[i22] = (byte) i20;
                    i23 += (11 + (i24 * i24));
                }
                i20 &= i;
                i += i22;
                if (Test0143.bFld) continue;
                lArr[i22] = Test0143.sFld;
                i25 <<= i25;
                Test0143.instanceCount += i24;
                if (Test0143.bFld) {
                    i25 += i22;
                    Test0143.instanceCount -= i23;
                    dArrFld[i22 - 1] += i23;
                } else {
                    if (Test0143.bFld) break;
                }
            }
        }

        FuzzerUtils.out.println("i i1 f = " + i + "," + i1 + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("i19 i20 by = " + i19 + "," + i20 + "," + by);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 lArr fArr = " + i25 + "," + FuzzerUtils.checkSum(lArr) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test0143.instanceCount Test0143.dFld Test0143.fFld = " + Test0143.instanceCount + "," +
                Double.doubleToLongBits(Test0143.dFld) + "," + Float.floatToIntBits(Test0143.fFld));
        FuzzerUtils.out.println("Test0143.fFld1 Test0143.bFld Test0143.sFld = " + Float.floatToIntBits(Test0143.fFld1) + "," +
                (Test0143.bFld ? 1 : 0) + "," + Test0143.sFld);
        FuzzerUtils.out.println("Test0143.iArrFld dArrFld byArrFld = " + FuzzerUtils.checkSum(Test0143.iArrFld) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)) + "," + FuzzerUtils.checkSum(byArrFld));

        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  dMeth ->  dMeth vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
