// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:02 2023
public class Test0390 {

    public static final int N = 400;

    public static volatile long instanceCount = -7L;
    public static long[] lArrFld = new long[N];
    public static int[] iArrFld = new int[N];
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0390.lArrFld, -7888539340473931533L);
        FuzzerUtils.init(Test0390.iArrFld, -11);
    }

    public byte byFld = -49;
    public boolean bFld = true;
    public boolean[][] bArrFld = new boolean[N][N];

    public static void vMeth1(int i7, long l, int i8) {

        int i9 = 12, i10 = -14;
        boolean b = true;

        for (i9 = 4; i9 < 122; i9++) {
            b = b;
        }
        vMeth1_check_sum += i7 + l + i8 + i9 + i10 + (b ? 1 : 0);
    }

    public static int iMeth(int i5, int i6) {

        short s = -20443;
        int i12 = -49531;
        int i13 = 11582;
        int[] iArr = new int[N];
        byte by1 = -38;

        FuzzerUtils.init(iArr, 166);

        vMeth1(i6, Test0390.instanceCount, i6);
        Test0390.lArrFld[(i6 >>> 1) % N] -= i5;
        Test0390.instanceCount <<= 8;
        s = (short) i5;
        i5 += (int) -2797215300L;
        for (int i11 : iArr) {
            double d = 50.21880;
            if (i5 != 0) {
            }
            for (i12 = 1; i12 < 4; i12++) {
                i6 += i6;
                i11 += (i12 - i11);
            }
            d -= i13;
            by1 -= (byte) -14L;
            i11 += i6;
        }
        i13 += (int) Test0390.instanceCount;
        i13 = (int) -4038255369L;
        long meth_res = i5 + i6 + s + i12 + i13 + by1 + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth(byte by) {

        int i4 = 42284;
        int i14 = 52262;
        int i15 = -26;
        int i16 = 55384;
        int i17 = -47;
        int i18 = -212;
        int i19 = 8;
        int i20 = -126;
        int i21 = 242;
        int[] iArr1 = new int[N];
        float f = 2.574F;

        FuzzerUtils.init(iArr1, -8);

        Test0390.lArrFld[(i4 >>> 1) % N] = (iMeth(i4, i14) + Test0390.instanceCount);
        for (i15 = 3; i15 < 174; i15 += 2) {
            double d1 = -90.72860;
            i16 += (((i15 * Test0390.instanceCount) + i16) - i4);
            i14 = (int) d1;
        }
        by -= (byte) i4;
        for (i17 = 12; i17 < 374; ++i17) {
            Test0390.instanceCount += 13;
            for (f = 1; f < 5; f++) {
                for (i20 = 1; i20 < 2; i20++) {
                    i14 = -8;
                    i19 &= i18;
                }
                Test0390.instanceCount &= i16;
            }
            if (false) break;
            i19 <<= i15;
            iArr1[i17 + 1] -= i20;
        }
        vMeth_check_sum += by + i4 + i14 + i15 + i16 + i17 + i18 + Float.floatToIntBits(f) + i19 + i20 + i21 +
                FuzzerUtils.checkSum(iArr1);
    }

    public static void main(String[] strArr) {

        try {
            Test0390 _instance = new Test0390();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = -76, i1 = -186, i2 = 62, i3 = -2, i22 = 52, i23 = 193, i24 = -159, i25 = 0, i26 = 6, i27 = 64, i28 = 14;
        float f1 = -2.831F;
        double d2 = 21.105120;

        for (i = 4; i < 230; i += 2) {
            i1 += (((i * i) + i1) - i);
            for (i2 = 5; i2 < 222; ++i2) {
                vMeth(byFld);
                Test0390.iArrFld = Test0390.iArrFld;
            }
            Test0390.iArrFld[i + 1] >>= 11;
        }
        f1 = i22;
        for (i23 = 15; 315 > i23; ++i23) {
            switch ((i23 % 4) + 120) {
                case 120:
                    for (i25 = i23; i25 < 84; ++i25) {
                        d2 = 1;
                        do {
                            if (false) break;
                            i26 = i25;
                            i1 <<= i3;
                            i22 += (int) d2;
                            byFld += (byte) i2;
                            Test0390.lArrFld[i25] = Test0390.instanceCount;
                        } while ((d2 += 3) < 1);
                        Test0390.iArrFld[i23] += -24;
                        i1 = i26;
                        for (i27 = 1; i27 > i23; --i27) {
                            i26 <<= i22;
                            i3 >>= i23;
                            i24 |= i2;
                            i22 -= -78;
                            i24 |= -210;
                            switch (((i23 % 7) * 5) + 125) {
                                case 136:
                                    f1 *= byFld;
                                    bArrFld[i23 - 1] = FuzzerUtils.boolean1array(N, (boolean) false);
                                    Test0390.iArrFld[i25 + 1] -= i25;
                                case 142:
                                    bFld = bFld;
                                    break;
                                case 155:
                                    i28 >>= i3;
                                    break;
                                case 137:
                                    i3 = (int) Test0390.instanceCount;
                                case 153:
                                    Test0390.iArrFld[i27 + 1] <<= (int) 70L;
                                    break;
                                case 126:
                                    i24 += (i27 - i2);
                                case 132:
                                    f1 *= f1;
                                    break;
                            }
                        }
                    }
                case 121:
                    byFld *= (byte) Test0390.instanceCount;
                    break;
                case 122:
                    Test0390.instanceCount = Test0390.instanceCount;
                    break;
                case 123:
                    i28 -= i28;
                default:
                    Test0390.iArrFld[i23] += i23;
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 f1 i22 = " + i3 + "," + Float.floatToIntBits(f1) + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 d2 i27 = " + i26 + "," + Double.doubleToLongBits(d2) + "," + i27);
        FuzzerUtils.out.println("i28 = " + i28);

        FuzzerUtils.out.println("Test0390.instanceCount byFld bFld = " + Test0390.instanceCount + "," + byFld + "," + (bFld ? 1
                : 0));
        FuzzerUtils.out.println("Test0390.lArrFld Test0390.iArrFld bArrFld = " + FuzzerUtils.checkSum(Test0390.lArrFld) + "," +
                FuzzerUtils.checkSum(Test0390.iArrFld) + "," + FuzzerUtils.checkSum(bArrFld));

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
