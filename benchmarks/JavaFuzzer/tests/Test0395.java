// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:03 2023
public class Test0395 {

    public static final int N = 400;

    public static long instanceCount = 6L;
    public static volatile byte byFld = -56;
    public static float fFld = 2.348F;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public short sFld = -15442;
    public byte[] byArrFld = new byte[N];

    public static int iMeth(float f, int i3) {

        int i4 = 36167;
        int i5 = 200;
        int i6 = -57670;
        int i7 = -130;
        int i8 = 217;
        int i9 = 12;
        int[] iArr = new int[N];
        boolean b = true;
        double d = 101.105898;
        float[] fArr = new float[N];
        long[] lArr = new long[N];

        FuzzerUtils.init(iArr, -7);
        FuzzerUtils.init(fArr, -22.598F);
        FuzzerUtils.init(lArr, 4L);

        for (i4 = 7; 310 > i4; ++i4) {
            if (b) break;
            i3 = Test0395.byFld;
            i3 -= -52936;
            i3 += 126;
            iArr[i4] = (int) d;
            for (i6 = 5; i6 > 1; --i6) {
                i5 = 4;
            }
            for (i8 = 1; 5 > i8; i8++) {
                i3 += i4;
                iArr[i4 + 1] += (int) f;
                i7 *= (int) Test0395.instanceCount;
                fArr[i4 - 1] -= i3;
                f -= -5734;
                lArr[i8 + 1] -= i4;
            }
        }
        long meth_res = Float.floatToIntBits(f) + i3 + i4 + i5 + (b ? 1 : 0) + Double.doubleToLongBits(d) + i6 + i7 +
                i8 + i9 + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
                FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth1(int i2) {

        int i10 = 4;
        int i11 = 11;
        int i12 = 51331;
        int i13 = 6801;
        int i14 = -45686;
        int i15 = 136;
        int[] iArr1 = new int[N];
        short s = 12403;

        FuzzerUtils.init(iArr1, -125);

        i2 *= Math.max((int) (Integer.reverseBytes(-5) * (2594L + iMeth(Test0395.fFld, -24))), i2);
        i2 *= -9;
        for (i10 = 9; i10 < 380; ++i10) {
            i11 = 46496;
            i11 += s;
            Test0395.instanceCount += (((i10 * Test0395.fFld) + i11) - Test0395.instanceCount);
            i2 += (int) (-104L + (i10 * i10));
            Test0395.fFld += (i10 - Test0395.instanceCount);
            for (i12 = i10; i12 < 5; i12 += 2) {
                for (i14 = 1; i14 < 1; i14++) {
                    switch ((i14 % 1) + 34) {
                        case 34:
                            switch ((((-171 >>> 1) % 6) * 5) + 53) {
                                case 70:
                                    i2 = (int) Test0395.instanceCount;
                                    i11 ^= (int) 17L;
                                    break;
                                case 68:
                                    i15 = i15;
                                    break;
                                case 74:
                                    i13 = i11;
                                    break;
                                case 79:
                                    i13 = i11;
                                    break;
                                case 75:
                                    iArr1[i10 - 1] *= (int) Test0395.instanceCount;
                                    break;
                                case 55:
                                    Test0395.instanceCount += 12;
                                    break;
                                default:
                                    i13 -= Test0395.byFld;
                            }
                            break;
                        default:
                            if (i13 != 0) {
                                vMeth1_check_sum += i2 + i10 + i11 + s + i12 + i13 + i14 + i15 +
                                        FuzzerUtils.checkSum(iArr1);
                                return;
                            }
                    }
                }
            }
        }
        vMeth1_check_sum += i2 + i10 + i11 + s + i12 + i13 + i14 + i15 + FuzzerUtils.checkSum(iArr1);
    }

    public static void main(String[] strArr) {

        try {
            Test0395 _instance = new Test0395();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void vMeth(int i1, byte by) {


        vMeth1(i1);
        vMeth_check_sum += i1 + by;
    }

    public void mainTest(String[] strArr1) {

        long l = -100L;
        long[] lArr1 = new long[N];
        int i = 0;
        int i17 = -44;
        int i18 = 28183;
        int i19 = -14;
        int i20 = -9;
        int i21 = 18304;
        int i22 = -50;
        int i23 = -22480;
        int[] iArr2 = new int[N];
        double d1 = -47.103510;
        double d2 = -50.111050;
        double[] dArr = new double[N];
        boolean b1 = true;

        FuzzerUtils.init(iArr2, -45);
        FuzzerUtils.init(lArr1, -56920L);
        FuzzerUtils.init(dArr, 0.126064);

        for (l = 10; 247 > l; ++l) {
            byArrFld[(int) (l - 1)] = (byte) i;
            vMeth(-240, (byte) (122));
            Test0395.fFld += (((l * l) + sFld) - Test0395.fFld);
            i *= 28270;
            Test0395.instanceCount -= i;
            for (i17 = 1; i17 < 106; i17++) {
                for (i19 = 1; i19 < 2; ++i19) {
                    Test0395.instanceCount = 74;
                    iArr2[(int) (l + 1)] = (int) -72.687F;
                    sFld = (short) i18;
                    lArr1[i17 + 1] -= l;
                    i18 += (((i19 * i19) + Test0395.fFld) - l);
                }
            }
        }
        iArr2[(i >>> 1) % N] += i20;
        for (long l1 : lArr1) {
            for (d1 = 3; 63 > d1; ++d1) {
                d2 *= l;
                i *= i20;
                for (i22 = (int) (d1); 2 > i22; i22++) {
                    l1 <<= i;
                    i18 >>= i23;
                    switch (((176 >>> 1) % 9) + 65) {
                        case 65:
                            switch ((int) (((d1 % 7) * 5) + 120)) {
                                case 127:
                                    i18 >>>= (int) Test0395.instanceCount;
                                    break;
                                case 140:
                                    Test0395.fFld *= l1;
                                    iArr2[i22 + 1] -= (int) d2;
                                    break;
                                case 133:
                                    i21 <<= i18;
                                    i23 += (((i22 * i22) + Test0395.fFld) - i17);
                                    i20 = i;
                                case 153:
                                    Test0395.byFld -= (byte) i21;
                                case 154:
                                    i21 += (i22 * i22);
                                case 123:
                                    i18 += (i22 * i17);
                                    break;
                                case 138:
                                    i23 += (i22 ^ i20);
                                    break;
                                default:
                                    i20 += i20;
                            }
                            break;
                        case 66:
                            i18 += (((i22 * i22) + Test0395.instanceCount) - i23);
                        case 67:
                            if (b1) continue;
                            break;
                        case 68:
                            d2 = Test0395.instanceCount;
                            break;
                        case 69:
                            dArr[i22 - 1] += Test0395.fFld;
                        case 70:
                            if (b1) continue;
                            break;
                        case 71:
                            sFld += (short) (((i22 * i22) + i20) - Test0395.fFld);
                            break;
                        case 72:
                            iArr2[i22 + 1] = i23;
                        case 73:
                            i21 += (i22 + i21);
                            break;
                        default:
                            i += (i22 | i20);
                    }
                }
            }
        }

        FuzzerUtils.out.println("l i i17 = " + l + "," + i + "," + i17);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("d1 i21 d2 = " + Double.doubleToLongBits(d1) + "," + i21 + "," +
                Double.doubleToLongBits(d2));
        FuzzerUtils.out.println("i22 i23 b1 = " + i22 + "," + i23 + "," + (b1 ? 1 : 0));
        FuzzerUtils.out.println("iArr2 lArr1 dArr = " + FuzzerUtils.checkSum(iArr2) + "," + FuzzerUtils.checkSum(lArr1)
                + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test0395.instanceCount Test0395.byFld Test0395.fFld = " + Test0395.instanceCount + "," + Test0395.byFld +
                "," + Float.floatToIntBits(Test0395.fFld));
        FuzzerUtils.out.println("sFld byArrFld = " + sFld + "," + FuzzerUtils.checkSum(byArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
