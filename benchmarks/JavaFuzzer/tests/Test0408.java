// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:03 2023
public class Test0408 {

    public static final int N = 400;

    public static long instanceCount = -54711L;
    public static byte byFld = 60;
    public static int iFld = -13912;
    public static float fFld = -103.169F;
    public static long lFld = -62088L;
    public static double dFld = -1.65739;
    public static long lFld1 = -9L;
    public static int[] iArrFld = new int[N];
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0408.iArrFld, 12103);
    }

    public short sFld = -28733;

    public static void vMeth(long l1) {

        boolean b = true;
        float f2 = 2.491F;
        int i8 = 14;
        int i9 = 38761;
        int i10 = 150;
        int i11 = -111;
        int[] iArr = new int[N];
        long l2 = 8L;

        FuzzerUtils.init(iArr, 0);

        iArr[(Test0408.iFld >>> 1) % N] -= Test0408.iFld;
        b = b;
        f2 = 1;
        do {
            for (i8 = 1; i8 < 7; ++i8) {
                Test0408.iFld |= i8;
                Test0408.iFld <<= Test0408.iFld;
                i9 += i8;
                Test0408.iFld += (((i8 * Test0408.byFld) + i9) - Test0408.instanceCount);
                for (l2 = 1; l2 < 2; l2++) {
                    i10 += (int) (((l2 * i10) + f2) - Test0408.iFld);
                    Test0408.fFld -= Test0408.lFld;
                    i10 = i9;
                    b = false;
                    i10 = i11;
                    Test0408.lFld = i10;
                }
            }
        } while (++f2 < 242);
        vMeth_check_sum += l1 + (b ? 1 : 0) + Float.floatToIntBits(f2) + i8 + i9 + l2 + i10 + i11 +
                FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth1(short s, float f1, int i7) {

        float f3 = 2.573F;
        int i12 = 5, i13 = 3, i14 = -11, i15 = 18487, i16 = 185;
        boolean b1 = false;
        byte[] byArr = new byte[N];
        long[] lArr = new long[N];

        FuzzerUtils.init(byArr, (byte) -14);
        FuzzerUtils.init(lArr, 7L);

        vMeth(248L);
        Test0408.iFld += 7;
        Test0408.instanceCount &= i7;
        Test0408.iFld &= Test0408.iFld;
        for (f3 = 225; f3 > 3; f3--) {
            f1 -= Test0408.instanceCount;
            Test0408.lFld = Test0408.iFld;
        }
        for (i13 = 344; i13 > 21; --i13) {
            byArr[i13 - 1] = (byte) Test0408.instanceCount;
            switch (((i13 % 10) * 5) + 100) {
                case 141:
                case 102:
                    Test0408.instanceCount += -219L;
                    for (i15 = 5; i15 > i13; i15--) {
                        double d1 = 0.34043;
                        if (b1) continue;
                        d1 -= Test0408.byFld;
                    }
                    i12 *= (int) Test0408.dFld;
                    break;
                case 147:
                    i7 = i13;
                    break;
                case 118:
                    if (b1) continue;
                    break;
                case 131:
                    f1 -= i7;
                    break;
                case 103:
                    i16 += (i13 - i7);
                    break;
                case 143:
                    i14 *= i13;
                    break;
                case 139:
                    Test0408.iFld += i14;
                    break;
                case 148:
                    s = (short) i13;
                    break;
                case 127:
                    i16 += (i13 - Test0408.instanceCount);
                    break;
                default:
                    i12 -= i7;
            }
        }
        long meth_res = s + Float.floatToIntBits(f1) + i7 + Float.floatToIntBits(f3) + i12 + i13 + i14 + i15 + i16 +
                (b1 ? 1 : 0) + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(lArr);
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public static int iMeth(int i, int i1, long l) {

        int i2 = -4097;
        int i3 = 17;
        int i4 = 55;
        int i5 = -5310;
        int i6 = -57500;
        int[] iArr1 = new int[N];
        float f = 0.733F;
        double d = 14.126699;
        short s1 = 16410;

        FuzzerUtils.init(iArr1, 135);

        i1 *= (int) -2.863F;
        for (i2 = 5; i2 < 289; i2 += 3) {
            for (i4 = 1; i4 < 16; i4++) {
                f -= (-(--i));
                i6 = 1;
                do {
                    Test0408.byFld >>= (byte) ((f--) - (++i1));
                    d = ((--i5) | l);
                    Test0408.iFld = (int) (d--);
                    i1 = (iMeth1(s1, f, i1) + -48258);
                    i %= (int) ((long) (d) | 1);
                    i3 *= (int) Test0408.lFld;
                } while (++i6 < 2);
                l = Test0408.lFld;
                iArr1[i2 - 1] -= (int) Test0408.instanceCount;
                d -= 48381;
                i5 -= i1;
            }
        }
        long meth_res = i + i1 + l + i2 + i3 + i4 + i5 + Float.floatToIntBits(f) + i6 + Double.doubleToLongBits(d) + s1
                + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0408 _instance = new Test0408();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i17 = -10, i18 = -117, i19 = 71, i20 = -13106, i21 = 14, i22 = 8721, i23 = -2, i24 = -54245;
        boolean b2 = true;

        Test0408.instanceCount <<= iMeth(Test0408.iFld, Test0408.iFld, Test0408.lFld);
        Test0408.dFld -= Test0408.iFld;
        for (i17 = 15; i17 < 278; i17++) {
            i18 += i17;
            Test0408.instanceCount *= i19;
            i19 = i19;
            Test0408.fFld += 81;
            for (i20 = i17; i20 < 96; i20++) {
                Test0408.iFld = 19478;
                if (b2) {
                    i18 = i20;
                    i21 = i19;
                    i18 = 427;
                } else if (b2) {
                    for (i22 = 1; i22 < 1; i22 += 3) {
                        Test0408.fFld = Test0408.iFld;
                        Test0408.lFld1 -= (long) Test0408.dFld;
                        i21 *= 4;
                        Test0408.instanceCount = 16047;
                        if (b2) {
                            Test0408.iArrFld[i20 + 1] *= (int) Test0408.lFld1;
                            sFld <<= (short) -914292110L;
                        } else if (b2) {
                            if (b2) continue;
                        } else if (b2) {
                            Test0408.iArrFld[i20] *= (int) Test0408.fFld;
                            Test0408.instanceCount = i18;
                        } else {
                            i21 = i17;
                            Test0408.iFld *= i18;
                            i21 += (i22 * i22);
                        }
                    }
                } else if (b2) {
                    i24 = 1;
                    do {
                        i21 = -9267;
                    } while (--i24 > 0);
                    if (b2) break;
                } else {
                    Test0408.iFld |= Test0408.byFld;
                }
            }
        }

        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 b2 i24 = " + i23 + "," + (b2 ? 1 : 0) + "," + i24);

        FuzzerUtils.out.println("Test0408.instanceCount Test0408.byFld Test0408.iFld = " + Test0408.instanceCount + "," + Test0408.byFld +
                "," + Test0408.iFld);
        FuzzerUtils.out.println("Test0408.fFld Test0408.lFld Test0408.dFld = " + Float.floatToIntBits(Test0408.fFld) + "," + Test0408.lFld
                + "," + Double.doubleToLongBits(Test0408.dFld));
        FuzzerUtils.out.println("Test0408.lFld1 sFld Test0408.iArrFld = " + Test0408.lFld1 + "," + sFld + "," +
                FuzzerUtils.checkSum(Test0408.iArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
