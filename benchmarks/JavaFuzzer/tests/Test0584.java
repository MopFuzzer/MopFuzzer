// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:07 2023
public class Test0584 {

    public static final int N = 400;

    public static long instanceCount = -7L;
    public static volatile double dFld = 60.27160;
    public static float fFld = -2.820F;
    public static boolean bFld = false;
    public static double[] dArrFld = new double[N];
    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0584.dArrFld, 0.116032);
    }

    public int[] iArrFld = new int[N];
    public long[] lArrFld = new long[N];

    public static void vMeth1(double d, double d1) {

        int i11 = -2284, i12 = 0, i13 = -152, i14 = 30059;
        double d2 = -1.44787;
        short s = 18;
        boolean b1 = true;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, -1022023777550078323L);

        for (i11 = 10; 282 > i11; ++i11) {
            i12 += i11;
            d2 = 1;
            while (++d2 < 6) {
                Test0584.instanceCount += (long) d2;
                i12 |= (int) 6342559221249264507L;
                lArr[(int) (d2 + 1)] += i12;
                for (i13 = (int) (d2); 1 > i13; i13++) {
                    i14 >>>= i13;
                    i14 = s;
                    i14 = i13;
                    Test0584.instanceCount = i14;
                    i14 = i14;
                }
                if (b1) break;
                i12 = i14;
            }
            i12 += (i11 - i12);
        }
        vMeth1_check_sum += Double.doubleToLongBits(d) + Double.doubleToLongBits(d1) + i11 + i12 +
                Double.doubleToLongBits(d2) + i13 + i14 + s + (b1 ? 1 : 0) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth() {

        int i10 = 8;
        int i15 = 103;
        int i16 = -7647;
        int i17 = 27;
        int i18 = 13;
        int i19 = 17;
        int[] iArr = new int[N];

        FuzzerUtils.init(iArr, 12);

        iArr[(i10 >>> 1) % N] = (int) ((-32994 - Test0584.instanceCount) << i10);
        if (Test0584.bFld) {
            vMeth1(Test0584.dFld, Test0584.dFld);
            Test0584.fFld *= (float) Test0584.dFld;
            iArr[(i10 >>> 1) % N] -= -13;
        } else if (Test0584.bFld) {
        } else {
            Test0584.dFld *= i10;
        }
        Test0584.instanceCount = i10;
        i10 = -76;
        Test0584.instanceCount = i10;
        for (i15 = 3; 121 > i15; i15++) {
            iArr[i15 - 1] ^= 223;
            for (i17 = i15; i17 < 13; ++i17) {
                i16 = (int) Test0584.instanceCount;
                Test0584.dArrFld[i15 - 1] %= ((long) (Test0584.dFld) | 1);
                if (i19 != 0) {
                    vMeth_check_sum += i10 + i15 + i16 + i17 + i18 + i19 + FuzzerUtils.checkSum(iArr);
                    return;
                }
            }
        }
        vMeth_check_sum += i10 + i15 + i16 + i17 + i18 + i19 + FuzzerUtils.checkSum(iArr);
    }

    public static long lMeth(int i6) {

        int i7 = -79, i8 = 96, i9 = 6, i20 = 163;
        float f = 0.639F;
        boolean[] bArr = new boolean[N];

        FuzzerUtils.init(bArr, true);

        for (i7 = 216; i7 > 5; --i7) {
            for (f = 1; f < 8; ++f) {
                i9 += (int) (f * f);
                Test0584.instanceCount -= (long) Test0584.dFld;
                vMeth();
                Test0584.fFld = Test0584.instanceCount;
                bArr[(int) (f - 1)] = Test0584.bFld;
            }
            i8 = i6;
            if (false) {
                i20 = 1;
                do {
                    switch (((i20 % 2) * 5) + 93) {
                        case 96:
                            Test0584.instanceCount &= 6;
                            i8 = (int) Test0584.fFld;
                            i9 <<= (int) Test0584.instanceCount;
                            break;
                        case 99:
                            i6 += (int) (-6925611776274315984L + (i20 * i20));
                            break;
                    }
                } while (++i20 < 8);
            } else if (Test0584.bFld) {
                Test0584.fFld -= i20;
            } else if (Test0584.bFld) {
                i6 *= i8;
            }
        }
        long meth_res = i6 + i7 + i8 + Float.floatToIntBits(f) + i9 + i20 + FuzzerUtils.checkSum(bArr);
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0584 _instance = new Test0584();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = -182, i1 = 242, i2 = 0, i3 = 42, i4 = -21, i5 = 3, i21 = -9, i22 = 63885, i23 = 106, i24 = -54, i25 = -224, i26 = 23, i27 = 14;
        boolean b = false;
        byte by = -80;
        float f1 = -28.957F;

        for (i = 7; i < 186; i++) {
            iArrFld = (iArrFld = (iArrFld = (iArrFld = iArrFld)));
            Test0584.dFld *= Test0584.instanceCount;
            for (i2 = 2; i2 < 140; i2 += 3) {
                b = (((14 - i2) + i3) != Test0584.fFld);
            }
            i3 += (int) (((i2 + i3) + (i2 * Test0584.instanceCount)) - (++i3));
            i1 ^= 212;
            for (i4 = 3; 140 > i4; i4++) {
                i3 *= (int) ((--by) - ((Test0584.instanceCount |= i) * (i5 + 1)));
            }
        }
        i1 = (int) ((lMeth(i21) - 7) + i);
        lArrFld[(i2 >>> 1) % N] >>= i5;
        i1 *= (int) Test0584.dFld;
        iArrFld[(1 >>> 1) % N] += i2;
        Test0584.dArrFld[(i3 >>> 1) % N] = i5;
        i21 <<= (int) Test0584.instanceCount;
        Test0584.dFld = i3;
        Test0584.dFld *= Test0584.instanceCount;
        for (i22 = 8; i22 < 136; ++i22) {
            i5 += (((i22 * Test0584.instanceCount) + i5) - Test0584.fFld);
            i1 *= i2;
            Test0584.fFld = i22;
            i5 += (i22 * i22);
            Test0584.instanceCount >>>= i23;
            for (f1 = 3; f1 < 196; ++f1) {
                i23 = i23;
                Test0584.dArrFld[(int) (f1 + 1)] += Test0584.instanceCount;
                for (i25 = (int) (f1); i25 < 2; i25++) {
                    i27 += i25;
                    Test0584.instanceCount += by;
                    if (b) continue;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 b i4 = " + i3 + "," + (b ? 1 : 0) + "," + i4);
        FuzzerUtils.out.println("i5 by i21 = " + i5 + "," + by + "," + i21);
        FuzzerUtils.out.println("i22 i23 f1 = " + i22 + "," + i23 + "," + Float.floatToIntBits(f1));
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 = " + i27);

        FuzzerUtils.out.println("Test0584.instanceCount Test0584.dFld Test0584.fFld = " + Test0584.instanceCount + "," +
                Double.doubleToLongBits(Test0584.dFld) + "," + Float.floatToIntBits(Test0584.fFld));
        FuzzerUtils.out.println("Test0584.bFld iArrFld Test0584.dArrFld = " + (Test0584.bFld ? 1 : 0) + "," +
                FuzzerUtils.checkSum(iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0584.dArrFld)));
        FuzzerUtils.out.println("lArrFld = " + FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
