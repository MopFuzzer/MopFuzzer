// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:00 2023
public class Test0305 {

    public static final int N = 400;

    public static long instanceCount = -6510722821751257125L;
    public static volatile long[][] lArrFld = new long[N][N];
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0305.lArrFld, 591900230L);
    }

    public static void vMeth(int i7, float f, short s) {

        int i8 = 49;
        int i9 = 63948;
        int i10 = 5;
        int i11 = 50;
        int[] iArr2 = new int[N];
        long l1 = 676362214729366420L;
        boolean b1 = false;

        FuzzerUtils.init(iArr2, 7335);

        i7 -= (int) Test0305.instanceCount;
        i8 = 1;
        do {
            Test0305.instanceCount += -13;
            iArr2[i8] *= (int) f;
            Test0305.instanceCount += 954666529L;
            for (i9 = 1; i9 < 5; i9++) {
                switch (((i8 >>> 1) % 10) + 49) {
                    case 49:
                        if (false) break;
                        for (l1 = 1; l1 < 2; l1++) {
                            i10 += (int) l1;
                            i10 += (int) (11L + (l1 * l1));
                            i10 += (int) (l1 * l1);
                            i11 += (-159 + (l1 * l1));
                        }
                        iArr2 = iArr2;
                        if (b1) break;
                        break;
                    case 50:
                        i10 -= i11;
                        break;
                    case 51:
                        i10 = 53;
                        break;
                    case 52:
                        i11 += (i9 * i7);
                        break;
                    case 53:
                    case 54:
                        i7 = i7;
                        break;
                    case 55:
                        iArr2[i9 - 1] *= i9;
                    case 56:
                        i10 >>= i10;
                    case 57:
                        s = (short) i10;
                        break;
                    case 58:
                        i10 += (i9 * i9);
                        break;
                    default:
                        f = i11;
                }
            }
        } while (++i8 < 318);
        vMeth_check_sum += i7 + Float.floatToIntBits(f) + s + i8 + i9 + i10 + l1 + i11 + (b1 ? 1 : 0) +
                FuzzerUtils.checkSum(iArr2);
    }

    public static int iMeth1(int i6) {

        float f1 = 108.674F;
        boolean b2 = true;
        int i12 = -8;
        int i13 = -36748;
        int i14 = 6;
        int i15 = 53778;
        int[] iArr1 = new int[N];
        short s2 = 22877;
        byte by1 = 66;
        byte[] byArr = new byte[N];
        double d1 = 2.1207;

        FuzzerUtils.init(byArr, (byte) 8);
        FuzzerUtils.init(iArr1, -3);

        for (byte by : byArr) {
            short s1 = -10585;
            i6 = (++iArr1[(i6 >>> 1) % N]);
            vMeth(i6, f1, s1);
            i6 = i6;
            iArr1[(8 >>> 1) % N] -= i6;
            b2 = b2;
        }
        for (i12 = 3; 328 > i12; i12++) {
            i13 = (int) 9L;
            if (b2) break;
            for (i14 = 1; i14 < 5; ++i14) {
                s2 = (short) i14;
                i6 += (-74 + (i14 * i14));
                Test0305.instanceCount = i15;
                iArr1[i12 + 1] = by1;
                d1 -= i15;
            }
        }
        long meth_res = i6 + Float.floatToIntBits(f1) + (b2 ? 1 : 0) + i12 + i13 + i14 + i15 + s2 + by1 +
                Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public static int iMeth(long l) {

        int i2 = -64208, i3 = 44, i4 = -14, i5 = 20060, i16 = 0, i17 = 230;
        double d2 = 5.58386;

        for (i2 = 8; 337 > i2; ++i2) {
            for (i4 = 1; i4 < 5; i4++) {
                i5 = iMeth1(-39791);
                switch ((i2 % 2) + 16) {
                    case 16:
                        i3 = i2;
                        Test0305.lArrFld[i2 - 1][i4] += i5;
                        i3 += (i4 * i4);
                        break;
                    case 17:
                        for (i16 = 1; 2 > i16; i16++) {
                            i17 += -121;
                            i5 += (int) l;
                            switch (((i4 >>> 1) % 1) + 15) {
                                case 15:
                                    i5 = i16;
                                    i17 -= (int) d2;
                                    Test0305.instanceCount *= Test0305.instanceCount;
                                    i5 += i16;
                            }
                        }
                        break;
                }
            }
        }
        long meth_res = l + i2 + i3 + i4 + i5 + i16 + i17 + Double.doubleToLongBits(d2);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0305 _instance = new Test0305();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        double d = -89.74933;
        int i = 13;
        int i18 = 0;
        int i19 = -34;
        int i20 = 206;
        int i21 = -119;
        int i22 = -13;
        int[] iArr = new int[N];
        boolean b = false;
        short s3 = -19211;
        short[] sArr = new short[N];
        float f2 = 1.214F;
        byte by2 = 40;

        FuzzerUtils.init(iArr, 6);
        FuzzerUtils.init(sArr, (short) -8393);

        d = 1;
        do {
            i *= (int) ((i -= (int) (-12 * Test0305.instanceCount)) - -3);
            b = ((b = b) ^ ((i - i) <= (i - i)));
            Test0305.lArrFld[(int) (d + 1)][(int) (d)] = ((iMeth(Test0305.instanceCount) * i) - s3);
            for (i18 = 7; i18 < 177; i18++) {
                i20 = 1;
                do {
                    i19 = i20;
                    Test0305.instanceCount &= i;
                    i = (int) f2;
                    f2 += -247;
                    i ^= i19;
                    i -= i18;
                    sArr[(int) (d)] *= by2;
                    Test0305.instanceCount -= i19;
                    s3 += (short) (i20 ^ i);
                } while (++i20 < 2);
                Test0305.lArrFld[i18 - 1][i18 - 1] >>= i19;
                try {
                    i19 = (i18 / 30548);
                    i19 = (i19 / -42802);
                    i = (-145 / i19);
                } catch (ArithmeticException a_e) {
                }
                for (i21 = 1; i21 < 2; ++i21) {
                    i22 += i21;
                    if (b) break;
                    if (true) continue;
                    i19 -= i20;
                    b = b;
                    switch ((((3 >>> 1) % 3) * 5) + 29) {
                        case 39:
                            f2 += (21558 + (i21 * i21));
                            Test0305.instanceCount *= i19;
                            if (b) break;
                            break;
                        case 41:
                            Test0305.instanceCount = i21;
                            i = i20;
                        case 38:
                            Test0305.instanceCount >>= i;
                    }
                }
            }
        } while (++d < 142);

        FuzzerUtils.out.println("d i b = " + Double.doubleToLongBits(d) + "," + i + "," + (b ? 1 : 0));
        FuzzerUtils.out.println("s3 i18 i19 = " + s3 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 f2 by2 = " + i20 + "," + Float.floatToIntBits(f2) + "," + by2);
        FuzzerUtils.out.println("i21 i22 iArr = " + i21 + "," + i22 + "," + FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println("sArr = " + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test0305.instanceCount Test0305.lArrFld = " + Test0305.instanceCount + "," +
                FuzzerUtils.checkSum(Test0305.lArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
