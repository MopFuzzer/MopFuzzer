// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:01 2023
public class Test0352 {

    public static final int N = 400;

    public static long instanceCount = 6L;
    public static long iMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public volatile boolean bFld = true;
    public int iFld = 21524;

    public static void vMeth(long l, short s1) {

        double d = 46.39750;
        int i5 = 25;
        int i6 = -2;
        int i7 = -8;
        int i8 = -12;
        int i9 = 601;
        int i10 = -41011;
        int[] iArr2 = new int[N];
        long l1 = 160L;
        byte by = 28;

        FuzzerUtils.init(iArr2, 20111);

        d *= i5;
        i6 = 1;
        do {
            Test0352.instanceCount += i5;
            for (i7 = 1; 6 > i7; i7++) {
                for (i9 = 2; i9 > 1; i9 -= 2) {
                    i5 += (i9 + i7);
                    s1 = (short) i9;
                    iArr2[i9 - 1] -= i6;
                    l += l1;
                    i10 += (i9 * i9);
                }
                i10 >>= i8;
                i10 ^= i5;
                d -= i5;
                i8 >>= (int) Test0352.instanceCount;
                by >>= (byte) i7;
            }
        } while (++i6 < 266);
        vMeth_check_sum += l + s1 + Double.doubleToLongBits(d) + i5 + i6 + i7 + i8 + i9 + i10 + l1 + by +
                FuzzerUtils.checkSum(iArr2);
    }

    public static double dMeth(float f, int i2, int i3) {

        int i4 = 59775;
        int i11 = -31;
        int i12 = 153;
        int i13 = 9;
        int[] iArr1 = new int[N];
        short s = 10726;
        double d1 = -29.491, d2 = 125.115031;
        boolean b = true;
        byte[] byArr = new byte[N];
        long[] lArr = new long[N];

        FuzzerUtils.init(iArr1, -147);
        FuzzerUtils.init(byArr, (byte) -64);
        FuzzerUtils.init(lArr, 5L);

        i4 = 1;
        while (++i4 < 384) {
            iArr1[i4 - 1] = (s - (iArr1[i4]++));
            iArr1[i4] = (i2--);
            f -= Test0352.instanceCount;
            switch ((i4 % 9) + 5) {
                case 5:
                    vMeth(Test0352.instanceCount, s);
                    d1 = i4;
                    switch ((((-55858 >>> 1) % 3) * 5) + 5) {
                        case 8:
                            byArr[i4 - 1] <<= (byte) -2;
                            break;
                        case 12:
                            for (i11 = i4; i11 < 4; ++i11) {
                                i2 += (i11 ^ Test0352.instanceCount);
                                i2 += (((i11 * Test0352.instanceCount) + i4) - i2);
                            }
                            break;
                        case 14:
                            for (d2 = 1; d2 < 4; ++d2) {
                                i13 >>= i4;
                                i12 >>= -208;
                            }
                            break;
                    }
                    break;
                case 6:
                    d1 += Test0352.instanceCount;
                    break;
                case 7:
                    i12 = -204;
                    break;
                case 8:
                    Test0352.instanceCount += (i4 * i4);
                    break;
                case 9:
                    lArr[i4 - 1] >>= -69;
                case 10:
                    i3 |= (int) Test0352.instanceCount;
                case 11:
                    if (b) continue;
                    break;
                case 12:
                    if (b) continue;
                    break;
                case 13:
                    Test0352.instanceCount += (((i4 * i3) + i4) - Test0352.instanceCount);
                default:
                    i2 += (i4 * i4);
            }
        }
        long meth_res = Float.floatToIntBits(f) + i2 + i3 + i4 + s + Double.doubleToLongBits(d1) + i11 + i12 +
                Double.doubleToLongBits(d2) + i13 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(byArr)
                + FuzzerUtils.checkSum(lArr);
        dMeth_check_sum += meth_res;
        return (double) meth_res;
    }

    public static int iMeth(int i1) {

        float f1 = 2.782F;
        int i14 = 11;
        int i15 = 6;
        int i16 = 8;
        int i17 = -144;
        int i18 = -65265;
        int i19 = 10;
        int i20 = -55357;
        int i21 = -228;
        int[] iArr3 = new int[N];
        byte[] byArr1 = new byte[N];

        FuzzerUtils.init(iArr3, 40906);
        FuzzerUtils.init(byArr1, (byte) 30);

        i1 = (int) ((i1 + (-(Test0352.instanceCount + i1))) - (Test0352.instanceCount--));
        Test0352.instanceCount -= (long) ((dMeth(f1, -13, i1) * i1) + i1);
        iArr3[(i1 >>> 1) % N] -= i1;
        i1 += -192;
        i1 <<= (int) Test0352.instanceCount;
        for (i14 = 225; 10 < i14; i14 -= 3) {
            for (i16 = 1; i16 < 22; i16++) {
                for (i18 = 1; i18 < 2; i18 += 3) {
                    iArr3[i16] >>>= i15;
                    byArr1[i18 - 1] += (byte) Test0352.instanceCount;
                }
                i17 = (int) Test0352.instanceCount;
                i19 = (int) -117.84512;
                for (i20 = 1; 2 > i20; ++i20) {
                    i15 <<= i19;
                }
            }
            i19 += i20;
        }
        long meth_res = i1 + Float.floatToIntBits(f1) + i14 + i15 + i16 + i17 + i18 + i19 + i20 + i21 +
                FuzzerUtils.checkSum(iArr3) + FuzzerUtils.checkSum(byArr1);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0352 _instance = new Test0352();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = -3000;
        int i22 = 4;
        int i23 = -9;
        int i25 = 245;
        int i26 = -3;
        int i27 = 12;
        int i28 = 129;
        int i29 = -41631;
        int i30 = -11229;
        int i31 = 50;
        int[] iArr = new int[N];
        float f2 = -71.261F;
        double d3 = 88.61667, d4 = 39.61889;

        FuzzerUtils.init(iArr, -39);

        iArr[(i >>> 1) % N] += (int) ((i - Long.reverseBytes(Test0352.instanceCount)) + iMeth(i));
        for (i22 = 14; 363 > i22; ++i22) {
            if (bFld) {
                f2 += i22;
                iArr = iArr;
            }
            Test0352.instanceCount /= -7;
            for (i25 = 1; 72 > i25; i25++) {
                i >>>= i26;
                i26 = i26;
            }
            for (i27 = 72; i27 > i22; --i27) {
                d3 *= i25;
                i23 -= i23;
                for (i29 = i22; i29 < 1; ++i29) {
                    switch ((i27 % 1) + 31) {
                        case 31:
                            Test0352.instanceCount += Test0352.instanceCount;
                            break;
                        default:
                            i23 += 107;
                    }
                }
                i28 = (int) Test0352.instanceCount;
                switch (((i22 >>> 1) % 1) + 114) {
                    case 114:
                        i += (i27 * i27);
                        Test0352.instanceCount *= i29;
                        d3 = i29;
                        for (d4 = 1; d4 < 1; ++d4) {
                            Test0352.instanceCount *= i31;
                            i30 -= 151;
                            i += (int) f2;
                            Test0352.instanceCount += 5;
                            i30 += (-47983 + (d4 * d4));
                            iFld += (int) (d4 * Test0352.instanceCount);
                        }
                        break;
                    default:
                        i30 += (int) Test0352.instanceCount;
                        i28 += (((i27 * f2) + i29) - Test0352.instanceCount);
                }
            }
        }

        FuzzerUtils.out.println("i i22 i23 = " + i + "," + i22 + "," + i23);
        FuzzerUtils.out.println("f2 i25 i26 = " + Float.floatToIntBits(f2) + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 i28 d3 = " + i27 + "," + i28 + "," + Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("i29 i30 d4 = " + i29 + "," + i30 + "," + Double.doubleToLongBits(d4));
        FuzzerUtils.out.println("i31 iArr = " + i31 + "," + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test0352.instanceCount bFld iFld = " + Test0352.instanceCount + "," + (bFld ? 1 : 0) + "," +
                iFld);

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  dMeth ->  dMeth iMeth mainTest
//DEBUG  vMeth ->  vMeth dMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
