// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:55 2023
public class Test0115 {

    public static final int N = 400;

    public static long instanceCount = -44499L;
    public static double dFld = 0.2712;
    public static long[] lArrFld = new long[N];
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0115.lArrFld, 61045L);
    }

    public static long lMeth(short s1, short s2, int i9) {

        int i10 = 0;
        int i11 = -239;
        int i12 = -12;
        int i13 = -151;
        int i14 = 131;
        int[][] iArr1 = new int[N][N];

        FuzzerUtils.init(iArr1, 7);

        i9 = i9;
        i10 = 1;
        do {
            for (i11 = 1; 7 > i11; ++i11) {
                Test0115.instanceCount += i11;
                i12 &= i13;
                i12 -= i9;
                i9 += i9;
                iArr1 = iArr1;
                i14 = 1;
                do {
                    i13 += i14;
                    Test0115.instanceCount = i13;
                    i9 <<= i9;
                    iArr1[i11][i10 - 1] -= 57;
                    Test0115.instanceCount += (i14 ^ Test0115.instanceCount);
                    Test0115.instanceCount += i10;
                } while (++i14 < 2);
            }
        } while (++i10 < 243);
        long meth_res = s1 + s2 + i9 + i10 + i11 + i12 + i13 + i14 + FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public static int iMeth1(int i6, byte by1, byte by2) {

        int i7 = -109;
        int i16 = -130;
        int i17 = -10806;
        int i18 = -14333;
        int[] iArr = new int[N];
        float f2 = -2.361F;
        short s3 = 2238;
        boolean b = true;

        FuzzerUtils.init(iArr, -47);

        Test0115.instanceCount = Test0115.instanceCount;
        i6 >>= (int) (i6 += (int) ((i7 * f2) * (75.883F - (1.29284 * (f2 / (i7 | 1))))));
        for (int i8 : iArr) {
            by1 >>= (byte) Integer.reverseBytes((int) ((i7 - 430029352L) * lMeth(s3, s3, 82)));
            iArr[(i8 >>> 1) % N] -= by1;
            i6 *= i7;
        }
        f2 = -204;
        for (int i15 : iArr) {
            if (i15 != 0) {
            }
        }
        i16 = 1;
        while (++i16 < 392) {
            switch ((i16 % 8) + 39) {
                case 39:
                    for (i17 = i16; i17 < 4; i17++) {
                        i6 = i17;
                        Test0115.instanceCount -= 9209;
                        Test0115.instanceCount = i6;
                    }
                    break;
                case 40:
                    Test0115.instanceCount *= 61;
                case 41:
                    i18 *= i16;
                case 42:
                    i7 += (((i16 * i7) + f2) - f2);
                    break;
                case 43:
                    b = b;
                    break;
                case 44:
                    Test0115.dFld += Test0115.dFld;
                    break;
                case 45:
                    i7 -= (int) Test0115.dFld;
                case 46:
                    i7 = i7;
                    break;
                default:
                    i18 = -27797;
            }
        }
        long meth_res = i6 + by1 + by2 + i7 + Float.floatToIntBits(f2) + s3 + i16 + i17 + i18 + (b ? 1 : 0) +
                FuzzerUtils.checkSum(iArr);
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public static int iMeth(int i3, int i4) {

        float f1 = 51.888F, f3 = -50.715F;
        int i5 = 63946;
        int i19 = -11;
        int i20 = -2;
        int i21 = -23133;
        int i22 = -14;
        int i23 = -4328;
        int i24 = -6;
        int i25 = 9;
        int i26 = -4;
        int[] iArr2 = new int[N];
        byte by = 45;
        short s = -29504;
        boolean b1 = true;

        FuzzerUtils.init(iArr2, 92);

        for (f1 = 5; 281 > f1; f1++) {
            Test0115.instanceCount += Integer.reverseBytes(i5);
            by *= (byte) ((Test0115.instanceCount--) << ((i4 - i4) * (by - s)));
            iMeth1(-9135, by, by);
            if (i19 != 0) {
            }
        }
        i20 *= (int) Test0115.instanceCount;
        for (i21 = 8; i21 < 129; i21++) {
            i20 <<= i22;
        }
        for (i23 = 5; i23 < 315; ++i23) {
            iArr2[i23 + 1] = (int) f1;
            for (i25 = 1; i25 < 5; i25++) {
                Test0115.instanceCount *= i23;
                i19 += (i25 * i25);
                if (b1) break;
                f3 = i22;
            }
        }
        long meth_res = i3 + i4 + Float.floatToIntBits(f1) + i5 + by + s + i19 + i20 + i21 + i22 + i23 + i24 + i25 +
                i26 + (b1 ? 1 : 0) + Float.floatToIntBits(f3) + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0115 _instance = new Test0115();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = 31551;
        int i1 = -119;
        int i2 = -59720;
        int i27 = -239;
        int i28 = -36926;
        int i29 = -8;
        int i30 = -42773;
        int i31 = 37357;
        int i32 = -65391;
        int i33 = -40994;
        int i34 = 14;
        int i35 = 10712;
        int i36 = -8;
        int i37 = -113;
        int i38 = -21;
        int[] iArr3 = new int[N];
        float f = 1.234F;
        short s4 = -275;
        byte by3 = -58;

        FuzzerUtils.init(iArr3, -7330);

        for (i = 15; i < 344; i++) {
            for (f = 4; f < 76; f++) {
                i2 >>= iMeth(i1, i2);
            }
        }
        i27 = 1;
        while (++i27 < 286) {
            Test0115.dFld *= i2;
        }
        iArr3[(4329 >>> 1) % N] += (int) Test0115.instanceCount;
        i28 = 371;
        while ((i28 -= 2) > 0) {
            for (i29 = 6; i29 < 135; ++i29) {
                s4 = (short) i28;
                Test0115.instanceCount = 1134;
                i1 *= i27;
                for (i31 = 1; i31 < 2; i31++) {
                    iArr3[i28 + 1] = i32;
                }
            }
            i2 -= i2;
            i30 += (int) Test0115.dFld;
            for (i33 = 2; i33 < 135; i33++) {
                Test0115.instanceCount <<= i28;
            }
            i2 *= i33;
        }
        i2 -= (int) Test0115.instanceCount;
        i35 = 1;
        while (++i35 < 219) {
            i34 += (int) f;
            Test0115.instanceCount += (i35 - i27);
            Test0115.instanceCount = Test0115.instanceCount;
            i36 = 1;
            do {
                Test0115.instanceCount = Test0115.instanceCount;
                Test0115.dFld *= i35;
            } while (++i36 < 115);
            for (i37 = i35; 115 > i37; i37++) {
                i34 += i32;
                s4 += (short) (i37 * i37);
                Test0115.lArrFld[i35 - 1] -= by3;
            }
        }

        FuzzerUtils.out.println("i i1 f = " + i + "," + i1 + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("i2 i27 i28 = " + i2 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("i29 i30 s4 = " + i29 + "," + i30 + "," + s4);
        FuzzerUtils.out.println("i31 i32 i33 = " + i31 + "," + i32 + "," + i33);
        FuzzerUtils.out.println("i34 i35 i36 = " + i34 + "," + i35 + "," + i36);
        FuzzerUtils.out.println("i37 i38 by3 = " + i37 + "," + i38 + "," + by3);
        FuzzerUtils.out.println("iArr3 = " + FuzzerUtils.checkSum(iArr3));

        FuzzerUtils.out.println("Test0115.instanceCount Test0115.dFld Test0115.lArrFld = " + Test0115.instanceCount + "," +
                Double.doubleToLongBits(Test0115.dFld) + "," + FuzzerUtils.checkSum(Test0115.lArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}