// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:53 2023
public class Test0026 {

    public static final int N = 400;

    public static long instanceCount = -6065502813666242689L;
    public static volatile short sFld = -21596;
    public static volatile long[] lArrFld = new long[N];
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    static {
        FuzzerUtils.init(Test0026.lArrFld, -13L);
    }

    public float fFld = 2.47F;

    public static void vMeth2() {

        float f = 0.757F;
        double d1 = -2.126573;
        int i8 = 2693;
        int i9 = -5;
        int i10 = 11;
        int i11 = -3;
        int[] iArr = new int[N];
        byte by = -78;
        boolean b = true;

        FuzzerUtils.init(iArr, 57270);

        f -= (float) d1;
        for (i8 = 6; i8 < 396; ++i8) {
            i10 = 1;
            do {
                i9 -= 19329;
                by >>= (byte) i10;
                i11 = 1;
                while (++i11 < 1) {
                    iArr[i11 + 1] += i9;
                    iArr = FuzzerUtils.int1array(N, (int) -203);
                    i9 += (3 + (i11 * i11));
                    switch ((i10 % 10) + 76) {
                        case 76:
                            by += (byte) i9;
                            break;
                        case 77:
                            if (b) continue;
                            b = b;
                            i9 /= (int) 1.1013F;
                            break;
                        case 78:
                            if (b) continue;
                        case 79:
                            if (b) break;
                        case 80:
                            iArr[i11] = i8;
                            break;
                        case 81:
                            i9 *= -3;
                            break;
                        case 82:
                        case 83:
                            Test0026.instanceCount += i9;
                            break;
                        case 84:
                            i9 += (((i11 * by) + i9) - i10);
                            break;
                        case 85:
                            i9 = i10;
                            break;
                        default:
                            i9 += (i11 ^ i10);
                    }
                }
            } while (++i10 < 4);
        }
        vMeth2_check_sum += Float.floatToIntBits(f) + Double.doubleToLongBits(d1) + i8 + i9 + i10 + by + i11 + (b ? 1 :
                0) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(long l) {

        int i4 = 8, i5 = 12, i6 = 117, i7 = 5, i12 = 150, i13 = 40, i14 = 21, i15 = -994;
        double[] dArr = new double[N];

        FuzzerUtils.init(dArr, -19.105700);

        for (i4 = 17; i4 < 289; i4++) {
            i5 *= (int) -2.309F;
            for (i6 = 6; i6 > 1; i6--) {
                Test0026.instanceCount = Math.min(++Test0026.instanceCount, --Test0026.lArrFld[i6]);
            }
            switch (((i4 % 1) * 5) + 70) {
                case 73:
                    vMeth2();
                    i7 += (i4 ^ l);
                    for (i12 = 1; i12 < 6; ++i12) {
                        for (i14 = 1; i14 < 2; ++i14) {
                            float f1 = 2.750F;
                            i13 += (21869 + (i14 * i14));
                            dArr[i12 - 1] = i13;
                            i13 += (i14 * i5);
                            i13 += (int) l;
                            l ^= 86;
                            f1 += i14;
                        }
                    }
                    break;
                default:
                    i5 *= (int) -7049685763984262748L;
            }
        }
        vMeth1_check_sum += l + i4 + i5 + i6 + i7 + i12 + i13 + i14 + i15 +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth(int i, short s) {

        int i1 = 5;
        int i2 = -146;
        int i3 = -191;
        int[] iArr1 = new int[N];
        double d = 11.35351;
        boolean b1 = false;
        float f2 = 20.569F;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, -7008751003818676682L);
        FuzzerUtils.init(iArr1, -16162);

        i *= (int) (--lArr[(i >>> 1) % N]);
        i = i;
        i *= (i--);
        i = i;
        for (i1 = 321; 16 < i1; i1 -= 3) {
            for (d = 1; d < 15; d += 2) {
                double d2 = 86.80244;
                vMeth1(Test0026.instanceCount);
                b1 = b1;
                i2 = i;
                d2 -= -53587L;
                iArr1[i1 + 1] -= (int) Test0026.instanceCount;
                Test0026.instanceCount += (-14 + (d * d));
            }
            i -= (int) f2;
            i *= 56;
            i2 = (int) Test0026.instanceCount;
        }
        vMeth_check_sum += i + s + i1 + i2 + Double.doubleToLongBits(d) + i3 + (b1 ? 1 : 0) + Float.floatToIntBits(f2)
                + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1);
    }

    public static void main(String[] strArr) {

        try {
            Test0026 _instance = new Test0026();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i16 = -12;
        int i17 = 6;
        int i18 = -59527;
        int i19 = -45;
        int[] iArr2 = new int[N];
        double d3 = -2.80815, d4 = -1.8865;
        byte by1 = -123;
        float f3 = 2.646F;
        boolean b2 = true;

        FuzzerUtils.init(iArr2, 86);

        vMeth(i16, Test0026.sFld);
        i17 = 1;
        do {
            try {
                i16 = (-1 % i17);
                i16 = (i17 / 210355409);
                i16 = (-56597 / i16);
            } catch (ArithmeticException a_e) {
            }
            for (d3 = i17; d3 < 67; d3++) {
                i16 += (int) fFld;
                Test0026.instanceCount = i16;
                Test0026.lArrFld[(int) (d3 + 1)] = by1;
                i18 *= i18;
                Test0026.instanceCount += (long) d3;
                f3 = 1;
                while (++f3 < 1) {
                    if (b2) {
                        Test0026.instanceCount = i16;
                        i19 += (int) (f3 * f3);
                        try {
                            iArr2[(int) (d3 - 1)] = (i17 / 58691);
                            i19 = (815808783 % i16);
                            i18 = (-51 % iArr2[(int) (d3 + 1)]);
                        } catch (ArithmeticException a_e) {
                        }
                        Test0026.instanceCount -= Test0026.instanceCount;
                    } else if (true) {
                        i19 -= (int) Test0026.instanceCount;
                    } else {
                        i19 = -10727;
                        iArr2[(int) (d3)] += i17;
                        switch ((int) (((f3 % 2) * 5) + 117)) {
                            case 125:
                                switch ((int) ((f3 % 2) + 99)) {
                                    case 99:
                                        i16 += (int) f3;
                                        Test0026.instanceCount *= i18;
                                        by1 *= (byte) i18;
                                        fFld += Test0026.instanceCount;
                                        break;
                                    case 100:
                                        i18 -= -171;
                                        b2 = b2;
                                        switch ((((i19 >>> 1) % 2) * 5) + 64) {
                                            case 72:
                                                i16 += -14106;
                                                d4 += i17;
                                                Test0026.instanceCount = Test0026.instanceCount;
                                                break;
                                            case 68:
                                                i16 *= (int) f3;
                                                break;
                                        }
                                        break;
                                    default:
                                        fFld += f3;
                                }
                                break;
                            case 118:
                                i19 += (int) (f3 * f3);
                                break;
                            default:
                                if (false) break;
                        }
                    }
                }
            }
        } while (++i17 < 378);

        FuzzerUtils.out.println("i16 i17 d3 = " + i16 + "," + i17 + "," + Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("i18 by1 f3 = " + i18 + "," + by1 + "," + Float.floatToIntBits(f3));
        FuzzerUtils.out.println("i19 b2 d4 = " + i19 + "," + (b2 ? 1 : 0) + "," + Double.doubleToLongBits(d4));
        FuzzerUtils.out.println("iArr2 = " + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test0026.instanceCount Test0026.sFld fFld = " + Test0026.instanceCount + "," + Test0026.sFld + "," +
                Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("Test0026.lArrFld = " + FuzzerUtils.checkSum(Test0026.lArrFld));

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
