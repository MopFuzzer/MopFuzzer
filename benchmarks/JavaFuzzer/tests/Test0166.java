// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:57 2023
public class Test0166 {

    public static final int N = 400;

    public static long instanceCount = -13L;
    public static int iFld = -7;
    public static int[] iArrFld = new int[N];
    public static float[] fArrFld = new float[N];
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    static {
        FuzzerUtils.init(Test0166.iArrFld, 27673);
        FuzzerUtils.init(Test0166.fArrFld, 63.36F);
    }

    public boolean bFld = true;
    public byte byFld = -114;
    public long[] lArrFld = new long[N];
    public double[] dArrFld = new double[N];

    public static void vMeth2(int i2, int i3, int i4) {

        int i5 = -38006, i6 = 46, i7 = -13, i8 = 55500, i9 = -211, i10 = 29019;
        float f1 = -1.656F;
        double d2 = 2.38192;

        i3 = (int) -113.107321;
        for (i5 = 7; i5 < 394; i5++) {
            i4 += (((i5 * Test0166.instanceCount) + Test0166.instanceCount) - f1);
            i3 = i3;
            for (i7 = 1; i7 < 4; i7++) {
                f1 += (i7 * i8);
                Test0166.iArrFld[i7 + 1] -= 13060;
                Test0166.instanceCount += (long) f1;
                Test0166.instanceCount = (long) f1;
                i8 &= -10;
            }
            d2 = i6;
        }
        for (i9 = 6; i9 < 293; ++i9) {
            f1 += i9;
        }
        d2 = i2;
        i2 = i2;
        vMeth2_check_sum += i2 + i3 + i4 + i5 + i6 + Float.floatToIntBits(f1) + i7 + i8 + Double.doubleToLongBits(d2) +
                i9 + i10;
    }

    public static void vMeth1(double d1) {

        int i1 = -210;
        int i11 = -186;
        int i12 = 59422;
        int i13 = -9;
        int i14 = -11;
        int i15 = -232;
        int[] iArr = new int[N];
        float f = -18.772F;
        boolean b = false;
        long[] lArr = new long[N];

        FuzzerUtils.init(iArr, 9);
        FuzzerUtils.init(lArr, 9L);

        iArr[(i1 >>> 1) % N] = (int) (Test0166.instanceCount *= (long) f);
        i1 <<= (i1 - (Integer.reverseBytes(i1) - (i1 * i1)));
        vMeth2(i1, i1, i1);
        i1 = i1;
        for (i11 = 8; i11 < 256; i11++) {
            i1 = -27572;
            i12 += (((i11 * i1) + f) - i12);
            i13 = 1;
            do {
                i1 = i13;
            } while (++i13 < 7);
            iArr[i11 - 1] <<= i11;
            i12 = i12;
            i14 -= 14;
            i15 = 1;
            do {
                if (b) break;
                Test0166.instanceCount += i1;
            } while (++i15 < 7);
        }
        vMeth1_check_sum += Double.doubleToLongBits(d1) + i1 + Float.floatToIntBits(f) + i11 + i12 + i13 + i14 + i15 +
                (b ? 1 : 0) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(int i) {

        double d = 2.87914;
        int i16 = 86, i17 = 32234, i18 = 4, i19 = -108, i20 = -34664, i21 = -38, i22 = 91;
        byte by = 7;
        short s = 32385;
        float f2 = 0.870F;

        d = 1;
        while (++d < 267) {
            vMeth1(d);
            switch ((int) (((d % 2) * 5) + 9)) {
                case 19:
                case 13:
                    for (i16 = 1; i16 < 6; ++i16) {
                        try {
                            Test0166.iArrFld[(int) (d - 1)] = (i17 % -180);
                            i = (i16 % i);
                            i17 = (i / -168);
                        } catch (ArithmeticException a_e) {
                        }
                    }
                    by = (byte) i17;
            }
            s = (short) f2;
            i17 -= (int) -4.56233;
            Test0166.fArrFld[(int) (d - 1)] = i;
        }
        for (i18 = 7; i18 < 143; ++i18) {
            i20 = 1;
            while (++i20 < 12) {
                for (i21 = i20; 1 > i21; ++i21) {
                    Test0166.instanceCount >>= -12;
                    Test0166.iArrFld[i18] += 8;
                    f2 -= i17;
                }
            }
        }
        vMeth_check_sum += i + Double.doubleToLongBits(d) + i16 + i17 + by + s + Float.floatToIntBits(f2) + i18 + i19 +
                i20 + i21 + i22;
    }

    public static void main(String[] strArr) {

        try {
            Test0166 _instance = new Test0166();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i23 = 26079, i24 = -65, i25 = 3, i26 = 222, i27 = 27958, i28 = -12, i29 = -41, i30 = 9;
        float f3 = -1.670F;
        short[] sArr = new short[N];

        FuzzerUtils.init(sArr, (short) -14882);

        vMeth(i23);
        i23 = i23;
        for (i24 = 2; i24 < 245; ++i24) {
            long l1 = -6762990710703778619L;
            f3 -= i25;
            i23 += (((i24 * i24) + Test0166.instanceCount) - Test0166.instanceCount);
            Test0166.instanceCount &= i25;
            Test0166.instanceCount -= (long) f3;
            i23 += (i24 * l1);
            bFld = bFld;
            i23 = i25;
        }
        i23 = i25;
        for (i26 = 4; i26 < 145; ++i26) {
            int i31 = -8;
            i28 = 1;
            while (++i28 < 178) {
                i25 += i25;
                Test0166.fArrFld[i28 + 1] *= i26;
                i25 += (i28 ^ i24);
                lArrFld[i28] = i28;
                Test0166.fArrFld[i28 + 1] += i27;
                try {
                    i27 = (i27 % Test0166.iArrFld[i28]);
                    i25 = (i26 % 1730758232);
                    Test0166.iArrFld[i26] = (i27 % 1203292445);
                } catch (ArithmeticException a_e) {
                }
            }
            dArrFld[i26] = i28;
            Test0166.instanceCount *= i25;
            Test0166.iArrFld[i26 - 1] >>= (int) Test0166.instanceCount;
            byFld |= (byte) Test0166.iFld;
            switch (((i26 % 10) * 5) + 48) {
                case 85:
                    Test0166.instanceCount ^= -147;
                    switch ((i26 % 2) + 34) {
                        case 34:
                            for (i29 = 178; i29 > 1; i29--) {
                                i23 <<= i25;
                                sArr[i29] = (short) Test0166.iFld;
                                if (bFld) continue;
                            }
                            break;
                        case 35:
                            Test0166.instanceCount &= Test0166.instanceCount;
                            break;
                        default:
                            i31 -= (int) Test0166.instanceCount;
                    }
                    break;
                case 52:
                    i31 += i23;
                    break;
                case 79:
                    Test0166.iArrFld[i26 - 1] -= -191;
                    break;
                case 82:
                    i25 -= i26;
                    break;
                case 56:
                    i25 = i31;
                    break;
                case 83:
                    f3 = i30;
                    break;
                case 57:
                    try {
                        i30 = (110 / i27);
                        Test0166.iArrFld[i26] = (Test0166.iArrFld[i26] % 19212);
                        i31 = (-72 % i28);
                    } catch (ArithmeticException a_e) {
                    }
                case 51:
                    i30 += i26;
                case 60:
                    Test0166.instanceCount += (i26 ^ (long) f3);
                case 77:
                    f3 -= -9;
                    break;
            }
        }

        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("f3 i26 i27 = " + Float.floatToIntBits(f3) + "," + i26 + "," + i27);
        FuzzerUtils.out.println("i28 i29 i30 = " + i28 + "," + i29 + "," + i30);
        FuzzerUtils.out.println("sArr = " + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test0166.instanceCount bFld byFld = " + Test0166.instanceCount + "," + (bFld ? 1 : 0) + "," +
                byFld);
        FuzzerUtils.out.println("Test0166.iFld Test0166.iArrFld Test0166.fArrFld = " + Test0166.iFld + "," +
                FuzzerUtils.checkSum(Test0166.iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0166.fArrFld)));
        FuzzerUtils.out.println("lArrFld dArrFld = " + FuzzerUtils.checkSum(lArrFld) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
