// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:14 2023
public class Test0823 {

    public static final int N = 400;

    public static long instanceCount = -36L;
    public static volatile float fFld = 60.348F;
    public static boolean bFld = true;
    public static long[][] lArrFld = new long[N][N];
    public static int[] iArrFld = new int[N];
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0823.lArrFld, 3386244985L);
        FuzzerUtils.init(Test0823.iArrFld, -34603);
    }

    public static void vMeth1() {

        int i4 = 49644;
        int i5 = -182;
        int i6 = -112;
        int i7 = -34226;
        int i8 = 1;
        int i9 = 51637;
        int[] iArr = new int[N];
        byte by = -69;
        boolean b = false;
        short[] sArr = new short[N];

        FuzzerUtils.init(iArr, -71);
        FuzzerUtils.init(sArr, (short) 13783);

        i4 -= (int) Test0823.instanceCount;
        Test0823.lArrFld[(i4 >>> 1) % N][(i4 >>> 1) % N] = i4;
        Test0823.fFld = i4;
        i5 = 1;
        do {
            i4 = i5;
            i4 += (((i5 * i5) + i5) - by);
            if (b) continue;
            i4 >>>= (int) Test0823.instanceCount;
            for (i6 = 1; i6 < 5; ++i6) {
                try {
                    i7 = (i4 % 182);
                    iArr[i6] = (i4 / iArr[i5 + 1]);
                    i4 = (221 % i4);
                } catch (ArithmeticException a_e) {
                }
                switch (((i6 % 6) * 5) + 119) {
                    case 123:
                        by = (byte) Test0823.instanceCount;
                        for (i8 = 2; i8 > 1; i8 -= 2) {
                            iArr[i6] = (int) 1879686739L;
                            i9 >>= i7;
                        }
                        break;
                    case 133:
                        sArr[i5 - 1] ^= (short) i6;
                        break;
                    case 131:
                        i7 -= (int) -31174L;
                        break;
                    case 136:
                        i9 += i8;
                    case 146:
                        Test0823.instanceCount += i9;
                        break;
                    case 127:
                        Test0823.instanceCount = i7;
                        break;
                }
            }
        } while (++i5 < 328);
        vMeth1_check_sum += i4 + i5 + by + (b ? 1 : 0) + i6 + i7 + i8 + i9 + FuzzerUtils.checkSum(iArr) +
                FuzzerUtils.checkSum(sArr);
    }

    public static int iMeth(int i3) {

        int i10 = 3;
        int i11 = 6;
        int[] iArr1 = new int[N];
        byte by1 = 98;
        double d = 19.3504;

        FuzzerUtils.init(iArr1, -88);

        if (Test0823.bFld) {
            vMeth1();
            Test0823.instanceCount = i3;
            for (i10 = 14; 296 > i10; i10++) {
                iArr1 = iArr1;
                Test0823.lArrFld[i10] = Test0823.lArrFld[i10 - 1];
            }
            if (Test0823.bFld) {
                Test0823.instanceCount = (long) Test0823.fFld;
                for (int i12 : iArr1) {
                    Test0823.instanceCount *= Test0823.instanceCount;
                }
                Test0823.instanceCount >>= -3434;
            } else if (true) {
                i3 *= i3;
                iArr1[(i11 >>> 1) % N] = i11;
                by1 = (byte) i11;
            } else {
                i11 += i10;
            }
        } else {
            d += i10;
        }
        long meth_res = i3 + i10 + i11 + by1 + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth(int i1, float f, int i2) {

        int i13 = -8, i14 = -91, i15 = 7, i16 = 0;
        short s = 6177;

        i2 &= (i2++);
        i2 = iMeth(i2);
        for (i13 = 6; i13 < 121; ++i13) {
            if (Test0823.bFld) continue;
            Test0823.instanceCount <<= Test0823.instanceCount;
            for (i15 = 1; i15 < 14; ++i15) {
                f += Test0823.instanceCount;
                Test0823.instanceCount += (4294 + (i15 * i15));
                Test0823.instanceCount += Test0823.instanceCount;
                if (Test0823.bFld) continue;
                i1 += (i15 - Test0823.instanceCount);
                i14 -= s;
                Test0823.iArrFld = Test0823.iArrFld;
            }
            i14 *= i16;
            i1 = i14;
        }
        vMeth_check_sum += i1 + Float.floatToIntBits(f) + i2 + i13 + i14 + i15 + i16 + s;
    }

    public static void main(String[] strArr) {

        try {
            Test0823 _instance = new Test0823();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = -24758, i17 = -36734, i18 = -10, i19 = -58, i20 = 1, i21 = -22523, i22 = 4, i23 = -35, i24 = -3, i25 = 79, i26 = -22961,
                i27 = 52931, i28 = 57;
        double d1 = 0.77788;
        byte by2 = 94;
        short s1 = -888;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, 10L);

        lArr = (lArr = (lArr = (Test0823.lArrFld[(i >>> 1) % N] = Test0823.lArrFld[(i >>> 1) % N])));
        vMeth(i, Test0823.fFld, i);
        for (i17 = 17; 303 > i17; ++i17) {
            for (i19 = 4; i19 < 88; ++i19) {
                i18 += i;
                for (i21 = i19; i21 < 2; ++i21) {
                    i18 <<= i21;
                    d1 *= i17;
                    i20 += (int) -1.50F;
                }
                Test0823.iArrFld[i17 + 1] = (int) Test0823.instanceCount;
                Test0823.iArrFld = Test0823.iArrFld;
                i18 >>= i;
                i23 = 1;
                while (++i23 < 2) {
                    i = i22;
                    d1 = by2;
                    i22 *= (int) Test0823.instanceCount;
                    i = (int) -8510637494095400828L;
                    i22 += (((i23 * Test0823.fFld) + i21) - i18);
                    i22 += (i23 * i23);
                    i22 *= i24;
                    i22 *= i20;
                    i20 = 4;
                }
                for (i25 = 1; i25 < 2; ++i25) {
                    s1 -= (short) Test0823.fFld;
                    Test0823.instanceCount += (((i25 * i19) + i24) - Test0823.instanceCount);
                    Test0823.instanceCount += (i25 * i25);
                    i26 += (((i25 * i18) + i22) - i);
                }
            }
            for (i27 = 2; i27 < 88; ++i27) {
                Test0823.fFld += by2;
                Test0823.instanceCount |= i19;
            }
        }

        FuzzerUtils.out.println("i i17 i18 = " + i + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 d1 i23 = " + i22 + "," + Double.doubleToLongBits(d1) + "," + i23);
        FuzzerUtils.out.println("by2 i24 i25 = " + by2 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 s1 i27 = " + i26 + "," + s1 + "," + i27);
        FuzzerUtils.out.println("i28 lArr = " + i28 + "," + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test0823.instanceCount Test0823.fFld Test0823.bFld = " + Test0823.instanceCount + "," +
                Float.floatToIntBits(Test0823.fFld) + "," + (Test0823.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0823.lArrFld Test0823.iArrFld = " + FuzzerUtils.checkSum(Test0823.lArrFld) + "," +
                FuzzerUtils.checkSum(Test0823.iArrFld));

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