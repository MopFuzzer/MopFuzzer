// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:07 2023
public class Test0562 {

    public static final int N = 400;

    public static long instanceCount = -3022928929L;
    public static byte byFld = 72;
    public static float fFld = 0.935F;
    public static volatile int[] iArrFld = new int[N];
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    static {
        FuzzerUtils.init(Test0562.iArrFld, -8);
    }

    public boolean[] bArrFld = new boolean[N];
    public float[][] fArrFld = new float[N][N];

    public static void vMeth2(int i8, float f1) {

        float f2 = -121.1F;
        int i9 = -225, i10 = 0, i11 = -2, i12 = 110, i13 = -1;
        short s = -16240, s1 = -10898;

        i8 += i8;
        Test0562.iArrFld = Test0562.iArrFld;
        for (f2 = 7; 175 > f2; f2 += 2) {
            for (i10 = 1; i10 < 18; i10++) {
                i9 += (((i10 * Test0562.instanceCount) + Test0562.instanceCount) - s);
                i11 += (i10 ^ i8);
                i9 ^= (int) Test0562.instanceCount;
                for (i12 = (int) (f2); 2 > i12; ++i12) {
                    switch (((i10 % 1) * 5) + 63) {
                        case 68:
                            s = (short) -9605;
                            i9 -= (int) f2;
                            Test0562.iArrFld[(int) (f2 + 1)] *= i11;
                        default:
                            s1 += (short) i12;
                    }
                    i9 &= (int) Test0562.instanceCount;
                    Test0562.instanceCount = i10;
                }
            }
        }
        vMeth2_check_sum += i8 + Float.floatToIntBits(f1) + Float.floatToIntBits(f2) + i9 + i10 + i11 + s + i12 + i13 +
                s1;
    }

    public static void vMeth1(int i6) {

        int i7 = 13, i14 = -170, i15 = 94, i16 = -33332;
        float f3 = -2.500F;
        float[] fArr = new float[N];
        double d2 = -2.57653;
        short s2 = 19145;
        boolean b = true;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, -11L);
        FuzzerUtils.init(fArr, -46.760F);

        i7 = 1;
        do {
            vMeth2(30480, f3);
        } while (++i7 < 307);
        Test0562.instanceCount += (long) d2;
        i14 = 231;
        do {
            Test0562.instanceCount *= i6;
        } while (--i14 > 0);
        i6 ^= i14;
        Test0562.iArrFld[(i7 >>> 1) % N] = i6;
        s2 = Test0562.byFld;
        for (i15 = 15; i15 < 336; ++i15) {
            switch ((i15 % 2) + 66) {
                case 66:
                    if (b) {
                        Test0562.iArrFld[i15 + 1] *= 14;
                        lArr[i15] += s2;
                        i16 -= (int) f3;
                        fArr[i15 - 1] += i16;
                    } else if (b) {
                        i16 -= Test0562.byFld;
                    }
                    break;
                case 67:
                    if (i15 != 0) {
                        vMeth1_check_sum += i6 + i7 + Float.floatToIntBits(f3) + Double.doubleToLongBits(d2) + i14 + s2 +
                                i15 + i16 + (b ? 1 : 0) + FuzzerUtils.checkSum(lArr) +
                                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                        return;
                    }
                    break;
            }
        }
        vMeth1_check_sum += i6 + i7 + Float.floatToIntBits(f3) + Double.doubleToLongBits(d2) + i14 + s2 + i15 + i16 +
                (b ? 1 : 0) + FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void main(String[] strArr) {

        try {
            Test0562 _instance = new Test0562();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void vMeth(double d1, int i3, float f) {

        int i4 = -4;
        int i5 = -14;
        int i17 = 3;
        int i18 = 42239;
        int[] iArr = new int[N];
        byte by = 113;
        short s3 = 7345;

        FuzzerUtils.init(iArr, -44774);

        for (i4 = 5; i4 < 188; i4++) {
            i3 = Math.abs(iArr[i4]);
            iArr[i4] >>= (int) (((--i5) * (-(i4 - i4))) + (Integer.reverseBytes(i4) * (Test0562.instanceCount + f)));
            Test0562.instanceCount = (long) (((i5 - f) - (i4 >>> by)) + (by--));
            vMeth1(i5);
        }
        i3 = (int) -1.10229;
        i5 = s3;
        i5 += 45239;
        i5 = (int) f;
        i5 -= i5;
        Test0562.instanceCount -= 10271;
        iArr[(i3 >>> 1) % N] >>= i4;
        for (i17 = 312; i17 > 7; i17 -= 3) {
            Test0562.instanceCount += (long) f;
        }
        i18 = 13;
        vMeth_check_sum += Double.doubleToLongBits(d1) + i3 + Float.floatToIntBits(f) + i4 + i5 + by + s3 + i17 + i18 +
                FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i = 4, i1 = -145, i2 = 0, i19 = 27, i20 = -8074, i21 = -26557, i22 = 0, i23 = 136, i24 = -159, i25 = -4, i26 = 26106, i27 = -140,
                i28 = 186;
        double d = 15.112845;
        short s4 = -14495;
        boolean b1 = false;
        long[] lArr1 = new long[N];

        FuzzerUtils.init(lArr1, -1393235357L);

        i = 1;
        do {
            i1 = 1;
            while (++i1 < 112) {
                Test0562.instanceCount |= Integer.reverseBytes(++i2);
                bArrFld[i] = ((-(++i2)) >= ((i2 = (int) Test0562.instanceCount) * d));
                vMeth(d, i, Test0562.fFld);
                i2 = -8;
                lArr1[i + 1] = i;
                i2 += (((i1 * i2) + i2) - i2);
                for (i19 = 1; i19 > i; i19 -= 2) {
                    i2 = -832;
                    i20 += (((i19 * Test0562.instanceCount) + i20) - i2);
                }
                Test0562.iArrFld[i - 1] <<= -15;
                for (i21 = 1; i21 < 1; ++i21) {
                    lArr1[i] <<= Test0562.instanceCount;
                }
            }
        } while (++i < 225);
        i22 -= i1;
        i2 += i20;
        for (i23 = 1; i23 < 396; i23++) {
            i2 = s4;
            for (i25 = i23; i25 < 64; i25 += 2) {
                switch (((i25 % 7) * 5) + 50) {
                    case 54:
                        i26 = i21;
                        break;
                    case 76:
                        i22 |= Test0562.byFld;
                    case 78:
                        i26 = -11;
                        for (i27 = 1; 1 > i27; i27++) {
                            if (b1) break;
                            fArrFld[i27] = fArrFld[i23];
                            i2 = i26;
                            Test0562.iArrFld[i25 - 1] <<= 35498;
                            if (true) break;
                            Test0562.fFld -= i25;
                        }
                    case 67:
                        d = i25;
                        break;
                    case 77:
                        i20 = (int) Test0562.instanceCount;
                        break;
                    case 84:
                        i22 -= i19;
                    case 62:
                        i20 *= i1;
                        break;
                    default:
                        Test0562.instanceCount -= i27;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("d i19 i20 = " + Double.doubleToLongBits(d) + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 s4 i25 = " + i24 + "," + s4 + "," + i25);
        FuzzerUtils.out.println("i26 i27 i28 = " + i26 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("b1 lArr1 = " + (b1 ? 1 : 0) + "," + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test0562.instanceCount Test0562.byFld Test0562.fFld = " + Test0562.instanceCount + "," + Test0562.byFld +
                "," + Float.floatToIntBits(Test0562.fFld));
        FuzzerUtils.out.println("bArrFld Test0562.iArrFld fArrFld = " + FuzzerUtils.checkSum(bArrFld) + "," +
                FuzzerUtils.checkSum(Test0562.iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));

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
