// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:54 2023
public class Test0070 {

    public static final int N = 400;

    public static long instanceCount = 2579696125L;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;
    public short sFld = 6320;
    public volatile int[] iArrFld = new int[N];

    public static void vMeth2(int i3, int i4, double d) {

        boolean b = false;
        int i5 = 37299, i6 = 100, i7 = 5, i8 = 77, i9 = -24117;
        float f1 = 1.581F;

        b = b;
        i3 += (int) Test0070.instanceCount;
        for (i5 = 353; i5 > 17; --i5) {
            i6 = i6;
            i3 = i3;
        }
        for (i7 = 16; i7 < 341; i7++) {
            i3 = i6;
            i6 += (i7 * i7);
            if (i4 != 0) {
                vMeth2_check_sum += i3 + i4 + Double.doubleToLongBits(d) + (b ? 1 : 0) + i5 + i6 + i7 + i8 +
                        Float.floatToIntBits(f1) + i9;
                return;
            }
            for (f1 = 1; f1 < 5; ++f1) {
                i9 += (int) d;
            }
            Test0070.instanceCount += (-195 + (i7 * i7));
            i4 += i7;
            i6 >>= 9;
        }
        vMeth2_check_sum += i3 + i4 + Double.doubleToLongBits(d) + (b ? 1 : 0) + i5 + i6 + i7 + i8 +
                Float.floatToIntBits(f1) + i9;
    }

    public static void vMeth1() {

        float f = -100.864F;
        float[] fArr = new float[N];
        int i2 = -1524;
        int i10 = 1;
        int i11 = 35569;
        int i12 = -79;
        int i13 = 96;
        int[] iArr = new int[N];
        double d1 = 2.954;
        short s = -21174;

        FuzzerUtils.init(iArr, 41383);
        FuzzerUtils.init(fArr, 1.82F);

        f -= (((-199 * (i2 + i2)) + i2) << (iArr[(i2 >>> 1) % N] |= (int) (i2 - 2.470F)));
        vMeth2(i2, i2, d1);
        fArr[(1 >>> 1) % N] %= (i2 | 1);
        Test0070.instanceCount = i2;
        for (i10 = 2; i10 < 123; i10 += 3) {
            fArr[i10 + 1] -= i2;
            for (i12 = 38; i12 > 2; --i12) {
                i13 = i10;
                i13 = (int) Test0070.instanceCount;
                s -= (short) d1;
            }
        }
        i13 >>= i11;
        i2 -= i10;
        vMeth1_check_sum += Float.floatToIntBits(f) + i2 + Double.doubleToLongBits(d1) + i10 + i11 + i12 + i13 + s +
                FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth() {

        int i = -72;
        int i1 = -223;
        int i14 = 1;
        int i15 = 5;
        int[][] iArr1 = new int[N][N];
        double d2 = 0.92319;
        float f2 = -8.12F, f3 = -4.198F;
        short s1 = 31320;

        FuzzerUtils.init(iArr1, -4243);

        i = 1;
        do {
            switch ((i % 10) + 108) {
                case 108:
                    i1 -= (i + (i1 >> (++i1)));
                    vMeth1();
                    iArr1 = FuzzerUtils.int2array(N, (int) -26855);
                    i14 = 1;
                    do {
                        i1 += (int) d2;
                        i1 >>= i14;
                        i1 += (i14 ^ i1);
                        i1 = i;
                    } while (++i14 < 8);
                    break;
                case 109:
                    for (f2 = 1; f2 < 8; f2++) {
                        i1 = i15;
                        Test0070.instanceCount += (long) (f2 * f2);
                        i1 += (int) (f2 * Test0070.instanceCount);
                        i1 >>= i14;
                    }
                case 110:
                    i15 += i1;
                    break;
                case 111:
                    i15 *= i1;
                    break;
                case 112:
                    s1 = (short) d2;
                    break;
                case 113:
                    i1 >>= 7;
                case 114:
                    i15 *= (int) -6L;
                    break;
                case 115:
                    d2 += Test0070.instanceCount;
                    break;
                case 116:
                    f3 += i;
                case 117:
                    Test0070.instanceCount -= -7;
                    break;
                default:
                    i1 = 12696;
            }
        } while (++i < 213);
        vMeth_check_sum += i + i1 + i14 + Double.doubleToLongBits(d2) + Float.floatToIntBits(f2) + i15 + s1 +
                Float.floatToIntBits(f3) + FuzzerUtils.checkSum(iArr1);
    }

    public static void main(String[] strArr) {

        try {
            Test0070 _instance = new Test0070();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i16 = -4, i17 = -222, i18 = -237, i19 = -209, i20 = -14, i21 = -33871, i22 = 38371;
        float f4 = 0.925F;
        float[] fArr1 = new float[N];
        boolean b1 = true;
        double d3 = 1.38995;
        byte by = 126;
        byte[] byArr = new byte[N];

        FuzzerUtils.init(fArr1, 114.656F);
        FuzzerUtils.init(byArr, (byte) -64);

        vMeth();
        i16 *= 94;
        i17 = 1;
        do {
            sFld = (short) f4;
            if (b1) {
                i16 = i16;
            }
            f4 += (i17 - i17);
            for (i18 = 1; i18 < 64; i18++) {
                Test0070.instanceCount += i18;
            }
            fArr1[i17] = i16;
            f4 = Test0070.instanceCount;
        } while (++i17 < 393);
        iArrFld[(i17 >>> 1) % N] ^= i19;
        i16 = i18;
        i16 = i19;
        i19 = i17;
        for (i20 = 19; i20 < 359; i20++) {
            iArrFld[i20 + 1] >>>= i16;
            i19 = -65302;
            if (b1) continue;
        }
        d3 -= Test0070.instanceCount;
        i19 = (int) Test0070.instanceCount;
        Test0070.instanceCount = i20;
        i22 = 1;
        while (++i22 < 257) {
            i19 *= by;
            switch (((i19 >>> 1) % 2) + 25) {
                case 25:
                    Test0070.instanceCount = -50;
                    i16 += i22;
                    f4 = i22;
                    iArrFld[i22 + 1] += (int) d3;
                case 26:
                    i19 += (60598 + (i22 * i22));
                    break;
                default:
                    byArr[i22] -= (byte) Test0070.instanceCount;
            }
        }

        FuzzerUtils.out.println("i16 i17 f4 = " + i16 + "," + i17 + "," + Float.floatToIntBits(f4));
        FuzzerUtils.out.println("b1 i18 i19 = " + (b1 ? 1 : 0) + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 d3 = " + i20 + "," + i21 + "," + Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("i22 by fArr1 = " + i22 + "," + by + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));
        FuzzerUtils.out.println("byArr = " + FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test0070.instanceCount sFld iArrFld = " + Test0070.instanceCount + "," + sFld + "," +
                FuzzerUtils.checkSum(iArrFld));

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
