// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:16 2023
public class Test0902 {

    public static final int N = 400;

    public static long instanceCount = 11L;
    public static boolean bFld = true;
    public static volatile byte byFld = -53;
    public static long[] lArrFld = new long[N];
    public static int[] iArrFld = new int[N];
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    static {
        FuzzerUtils.init(Test0902.lArrFld, 2315086086L);
        FuzzerUtils.init(Test0902.iArrFld, 5);
    }

    public double dFld = 86.41329;
    public short sFld = 17474;

    public static void vMeth2(int i11) {

        double d1 = -2.48456;
        long l1 = 13701L;
        int i12 = -40199, i13 = 7, i14 = -9, i15 = 46, i16 = -4;
        float f3 = -91.894F;
        short s = -18362;

        i11 *= (int) d1;
        try {
            for (l1 = 6; l1 < 128; l1++) {
                for (i13 = 1; i13 < 13; ++i13) {
                    i11 = (int) f3;
                    Test0902.bFld = Test0902.bFld;
                    Test0902.iArrFld[i13] |= (int) l1;
                    for (i15 = 1; i15 < 2; ++i15) {
                        Test0902.byFld -= (byte) i13;
                        switch (((i13 % 4) * 5) + 5) {
                            case 12:
                                i14 <<= i13;
                                i16 -= i11;
                                i16 >>= i12;
                                i12 += (((i15 * i16) + i14) - s);
                                break;
                            case 25:
                                Test0902.iArrFld[i15 + 1] = (int) d1;
                                break;
                            case 18:
                                Test0902.lArrFld[i15] = (long) 1.74120;
                            case 22:
                                i12 = -19959;
                                break;
                        }
                    }
                }
            }
        } catch (ArithmeticException exc1) {
            Test0902.instanceCount = i16;
        }
        vMeth2_check_sum += i11 + Double.doubleToLongBits(d1) + l1 + i12 + i13 + i14 + Float.floatToIntBits(f3) + i15 +
                i16 + s;
    }

    public static void vMeth1(int i6) {

        float f1 = 48.417F;
        float f2 = 40.836F;
        float[] fArr1 = new float[N];
        int i7 = 6734, i8 = -58500, i9 = -13, i10 = -5130;
        long l = -144L;
        double d = -68.54186;
        short s1 = 28043;

        FuzzerUtils.init(fArr1, 0.169F);

        Test0902.lArrFld = (Test0902.lArrFld = Test0902.lArrFld);
        i6 = (i6 * (-192 + (i6 - i6)));
        for (f1 = 16; f1 < 260; ++f1) {
            for (i8 = 7; i8 > 1; i8 -= 3) {
                if (fArr1[i8] != ((Math.max(i6, i8) * (i9 - i9)) - i9)) continue;
                f2 += i8;
                for (l = (long) (f1); l < 4; ++l) {
                    d += (((i7 -= (int) l) + -2.85750) * (fArr1[(int) (l - 1)]--));
                    Test0902.instanceCount += (long) (--f2);
                    vMeth2(i9);
                    Test0902.instanceCount -= Test0902.instanceCount;
                    Test0902.lArrFld[(int) (f1 + 1)] = i9;
                    s1 -= (short) Test0902.instanceCount;
                    i9 *= (int) -7747458887589493416L;
                    i10 += (int) (l * l);
                }
            }
        }
        vMeth1_check_sum += i6 + Float.floatToIntBits(f1) + i7 + i8 + i9 + Float.floatToIntBits(f2) + l + i10 +
                Double.doubleToLongBits(d) + s1 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public static void vMeth(int i3, int i4, int i5) {

        double d2 = 115.17660;
        float f4 = 92.356F;
        int i17 = 4, i18 = 48164, i19 = 56, i20 = -4;

        vMeth1(i4);
        i4 = (int) d2;
        switch (((i3 >>> 1) % 1) + 31) {
            case 31:
                d2 *= Test0902.instanceCount;
                break;
            default:
                f4 *= (float) d2;
                Test0902.instanceCount *= i4;
                i5 %= (int) (i5 | 1);
                for (i17 = 6; i17 < 385; i17++) {
                    for (i19 = 1; i19 < 4; ++i19) {
                        f4 *= i5;
                        try {
                            i20 = (i20 % i3);
                            Test0902.iArrFld[i19 + 1] = (i4 / i17);
                            i3 = (i5 / i17);
                        } catch (ArithmeticException a_e) {
                        }
                        i20 += (int) f4;
                    }
                    f4 = i3;
                    Test0902.iArrFld[i17 + 1] = i19;
                    Test0902.instanceCount += (i17 | i5);
                }
        }
        vMeth_check_sum += i3 + i4 + i5 + Double.doubleToLongBits(d2) + Float.floatToIntBits(f4) + i17 + i18 + i19 +
                i20;
    }

    public static void main(String[] strArr) {

        try {
            Test0902 _instance = new Test0902();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = -5;
        int i1 = -48921;
        int i2 = -224;
        int i21 = -13;
        int i22 = 7;
        int i23 = -49702;
        int i24 = 9;
        int i25 = 76;
        int i26 = 5;
        int i27 = 10;
        int i28 = 103;
        int[] iArr = new
                int[N];
        float f = 0.774F;
        float[] fArr = new float[N];
        byte[] byArr = new byte[N];
        short[] sArr = new short[N];

        FuzzerUtils.init(iArr, -19626);
        FuzzerUtils.init(fArr, 1.56F);
        FuzzerUtils.init(byArr, (byte) 125);
        FuzzerUtils.init(sArr, (short) -4099);

        iArr[(i >>> 1) % N] += (int) f;
        for (i1 = 320; 20 < i1; --i1) {
            fArr[i1] -= (i1 + i1);
            dFld = (-(i2--));
            i2 = (int) (((i1 + i2) - Math.abs(f)) - ((i2 + i) >> Integer.reverseBytes(i2)));
            vMeth(-61654, i, i2);
            f -= Test0902.instanceCount;
        }
        Test0902.instanceCount = i;
        i2 -= i;
        for (i21 = 2; i21 < 125; ++i21) {
            for (i23 = 12; i23 < 204; ++i23) {
                iArr[i21] += (int) 2875167532L;
                byArr[i23] = (byte) Test0902.instanceCount;
                Test0902.instanceCount -= (long) dFld;
            }
            i25 = 1;
            while (++i25 < 204) {
                f -= f;
                sArr[i25 - 1] |= (short) i21;
                for (i26 = 1; i26 > 1; i26 -= 3) {
                    Test0902.lArrFld[i21] *= (long) f;
                    Test0902.byFld = (byte) sFld;
                    i27 += (int) -34507L;
                }
                iArr[i21 + 1] += i26;
                f = i22;
                i2 += (i25 + i1);
            }
            Test0902.iArrFld = FuzzerUtils.int1array(N, (int) 64574);
            if (Test0902.bFld) break;
            i = i22;
        }
        i28 = 1;
        while (++i28 < 260) {
            f -= 0.441F;
            Test0902.instanceCount += (((i28 * i) + i23) - sFld);
        }

        FuzzerUtils.out.println("i f i1 = " + i + "," + Float.floatToIntBits(f) + "," + i1);
        FuzzerUtils.out.println("i2 i21 i22 = " + i2 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 i27 i28 = " + i26 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("iArr fArr byArr = " + FuzzerUtils.checkSum(iArr) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + "," + FuzzerUtils.checkSum(byArr));
        FuzzerUtils.out.println("sArr = " + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test0902.instanceCount dFld Test0902.bFld = " + Test0902.instanceCount + "," +
                Double.doubleToLongBits(dFld) + "," + (Test0902.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0902.byFld sFld Test0902.lArrFld = " + Test0902.byFld + "," + sFld + "," +
                FuzzerUtils.checkSum(Test0902.lArrFld));
        FuzzerUtils.out.println("Test0902.iArrFld = " + FuzzerUtils.checkSum(Test0902.iArrFld));

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
