// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:57 2023
public class Test0192 {

    public static final int N = 400;

    public static long instanceCount = 2669731958L;
    public static float fFld = -49.669F;
    public static int[][] iArrFld = new int[N][N];
    public static short[] sArrFld = new short[N];
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0192.iArrFld, -129);
        FuzzerUtils.init(Test0192.sArrFld, (short) -23482);
    }

    public static void vMeth(int i8, int i9, float f1) {


        Test0192.fFld /= (i9 | 1);
        vMeth_check_sum += i8 + i9 + Float.floatToIntBits(f1);
    }

    public static long lMeth(int i12, float f2) {

        int i13 = -220, i14 = -190, i15 = -10, i16 = 23, i17 = -9, i18 = 47183;
        short s1 = 32312;
        float f3 = 1.846F;
        boolean b1 = false;

        for (i13 = 13; i13 < 313; ++i13) {
            s1 = (short) i14;
        }
        i14 = (int) Test0192.instanceCount;
        if (b1) {
            for (i15 = 10; i15 < 177; i15++) {
                Test0192.iArrFld = Test0192.iArrFld;
                switch (((i15 % 2) * 5) + 28) {
                    case 36:
                        for (i17 = 1; i17 < 9; i17 += 2) {
                            i16 += i17;
                            Test0192.fFld += -38323;
                            Test0192.iArrFld[i17][i17 - 1] = i16;
                            i12 += (int) f3;
                            i12 <<= i12;
                            i14 += i17;
                            i14 += (int) Test0192.instanceCount;
                        }
                        break;
                    case 34:
                        i18 += i17;
                        break;
                }
            }
        } else if (b1) {
            f3 -= i12;
        }
        long meth_res = i12 + Float.floatToIntBits(f2) + i13 + i14 + s1 + i15 + i16 + i17 + i18 +
                Float.floatToIntBits(f3) + (b1 ? 1 : 0);
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public static void vMeth1(long l) {

        int i11 = -220, i19 = -134, i21 = 41113;
        double d1 = 93.55252;
        double d2 = -101.74201;
        double[] dArr = new double[N];
        byte by = 116;
        boolean b2 = true;

        FuzzerUtils.init(dArr, -125.126604);

        Test0192.fFld *= ((i11 + Math.abs(i11)) + Integer.reverseBytes(i11--));
        i11 *= (int) (lMeth(i11, Test0192.fFld) / ((long) (d1) | 1));
        i19 = 161;
        do {
            int i20 = 13;
            l = by;
            if (b2) {
                Test0192.sArrFld[i19 + 1] = (short) l;
                Test0192.instanceCount = i20;
            } else {
                i20 = i19;
                i20 = (int) Test0192.fFld;
            }
            for (d2 = 1; 19 > d2; d2++) {
                i21 += (int) -34.69345;
                i20 = (int) Test0192.instanceCount;
                i20 -= (int) Test0192.instanceCount;
                dArr[(int) (d2 + 1)] *= -141L;
                i21 %= (int) (l | 1);
            }
        } while ((i19 -= 2) > 0);
        vMeth1_check_sum += l + i11 + Double.doubleToLongBits(d1) + i19 + by + (b2 ? 1 : 0) +
                Double.doubleToLongBits(d2) + i21 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static int iMeth() {

        int i10 = 1293, i22 = -63, i23 = 37242, i24 = -73, i25 = -186, i26 = -43600;
        boolean b3 = true;

        Test0192.instanceCount >>>= ((Test0192.instanceCount - (i10 - i10)) + (++i10));
        vMeth1(Test0192.instanceCount);
        for (i22 = 6; i22 < 154; ++i22) {
            Test0192.instanceCount *= i23;
            i23 += (8 + (i22 * i22));
            Test0192.iArrFld[i22 - 1][i22 - 1] = i22;
            i10 = i10;
            if (i23 != 0) {
            }
            for (i24 = 11; i24 > 1; --i24) {
                i23 += i24;
                Test0192.iArrFld[i22 + 1][i22] = i25;
                i26 = 1;
                do {
                    Test0192.instanceCount = 32072;
                } while (++i26 < 2);
                if (b3) continue;
                if (b3) break;
            }
        }
        long meth_res = i10 + i22 + i23 + i24 + i25 + i26 + (b3 ? 1 : 0);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0192 _instance = new Test0192();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        float f = -111.397F;
        float[] fArr = new float[N];
        int i = -7;
        int i1 = 51000;
        int i2 = 10;
        int i3 = 35922;
        int i4 = 1;
        int i5 = -12;
        int i6 = -59024;
        int i7 = -113;
        int[] iArr = new int[N];
        boolean b = true;
        short s = -29426;
        double d = -29.123211;
        long[] lArr = new long[N];

        FuzzerUtils.init(iArr, 193);
        FuzzerUtils.init(fArr, -98.93F);
        FuzzerUtils.init(lArr, 2524307248035804032L);

        for (f = 8; f < 143; ++f) {
            b = b;
            for (i1 = 8; i1 < 186; i1++) {
                Test0192.fFld += Test0192.instanceCount;
                if (b) continue;
                for (i3 = (int) (f); i3 < 2; i3++) {
                    Test0192.fFld = (-(++i4));
                    iArr[(i >>> 1) % N] >>>= (int) Test0192.instanceCount;
                }
                iArr[(int) (f)] = (int) (((i2 - Test0192.instanceCount) * (s - i2)) - i4);
                for (d = 1; d < 2; d++) {
                    i5 -= (i5 &= i2);
                }
                for (i6 = 2; i6 > 1; --i6) {
                    switch ((int) ((f % 3) + 5)) {
                        case 5:
                            i2 = (int) (Test0192.instanceCount--);
                            break;
                        case 6:
                            fArr = (fArr = (fArr = (fArr = FuzzerUtils.float1array(N, (float) -2.93F))));
                        case 7:
                            i5 *= i7;
                            i = (int) lArr[i1];
                            switch (((i6 % 4) * 5) + 52) {
                                case 60:
                                    s = (short) ((--Test0192.instanceCount) - ((-160L + (-200 * (-12 - Test0192.instanceCount))) <<
                                            -13));
                                    i2 -= (--i4);
                                    lArr[i6 + 1] = i2;
                                    break;
                                case 68:
                                    vMeth(i3, i2, fArr[i6]);
                                    break;
                                case 62:
                                    iArr[i6 + 1] |= ((i7++) - i3);
                                    s >>= (short) (i2++);
                                case 65:
                                    if (b) continue;
                                    break;
                                default:
                                    i4 += (((i6 * i2) + i2) - Test0192.instanceCount);
                                    iArr[(int) (f + 1)] += (int) Test0192.instanceCount;
                                    lArr[i6 - 1] = (i + (++i));
                                    i2 *= (int) (((i2 - i3) % ((i - Test0192.instanceCount) | 1)) + (iMeth() + Test0192.instanceCount));
                            }
                            i4 = (int) Test0192.instanceCount;
                            break;
                        default:
                            Test0192.instanceCount += Test0192.instanceCount;
                    }
                }
            }
        }

        FuzzerUtils.out.println("f i b = " + Float.floatToIntBits(f) + "," + i + "," + (b ? 1 : 0));
        FuzzerUtils.out.println("i1 i2 i3 = " + i1 + "," + i2 + "," + i3);
        FuzzerUtils.out.println("i4 s d = " + i4 + "," + s + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("i5 i6 i7 = " + i5 + "," + i6 + "," + i7);
        FuzzerUtils.out.println("iArr fArr lArr = " + FuzzerUtils.checkSum(iArr) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + "," + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test0192.instanceCount Test0192.fFld Test0192.iArrFld = " + Test0192.instanceCount + "," +
                Float.floatToIntBits(Test0192.fFld) + "," + FuzzerUtils.checkSum(Test0192.iArrFld));
        FuzzerUtils.out.println("Test0192.sArrFld = " + FuzzerUtils.checkSum(Test0192.sArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
