// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:06 2023
public class Test0537 {

    public static final int N = 400;

    public static long instanceCount = -6738608390325520622L;
    public static volatile byte byFld = 22;
    public static float[] fArrFld = new float[N];
    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0537.fArrFld, 4.535F);
    }

    public static void vMeth1(float f, long l, float f1) {

        int i5 = 5, i6 = -10258, i7 = 45197, i8 = -237, i9 = 11, i10 = 0, i11 = 248;
        byte by = -64;
        double d = 119.61800;
        short[] sArr = new short[N];
        long[] lArr = new long[N];

        FuzzerUtils.init(sArr, (short) 119);
        FuzzerUtils.init(lArr, 4071627415L);

        i5 <<= i5;
        for (i6 = 15; 271 > i6; ++i6) {
            boolean b1 = false;
            if (b1) {
                sArr[i6 + 1] *= (short) l;
                switch ((((i6 >>> 1) % 5) * 5) + 79) {
                    case 86:
                        i7 *= i6;
                        Test0537.instanceCount -= i5;
                        break;
                    case 81:
                        i7 += (((i6 * by) + i6) - i6);
                        for (i8 = 6; i8 > 1; --i8) {
                            try {
                                i7 = (141 % i10);
                                i9 = (224 % i6);
                                i7 = (i8 % i11);
                            } catch (ArithmeticException a_e) {
                            }
                            i7 += i11;
                            d = 1;
                            do {
                                i7 += 11;
                                i10 = i9;
                                i11 = (int) l;
                            } while (++d < 2);
                        }
                    case 89:
                        f1 += i6;
                    case 96:
                        i11 += (i6 | i10);
                    case 93:
                        lArr[i6 - 1] |= Test0537.instanceCount;
                        break;
                }
            } else {
                lArr = lArr;
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f) + l + Float.floatToIntBits(f1) + i5 + i6 + i7 + by + i8 + i9 + i10
                + i11 + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth() {

        float f2 = 0.827F, f3 = 5.913F;
        int i12 = 7;
        int i13 = -74;
        int i15 = 123;
        int i16 = 197;
        int i17 = -7;
        int[] iArr = new int[N];
        byte by1 = 115;
        short s = 12372;
        short[] sArr1 = new short[N];
        double d1 = -38.40613;

        FuzzerUtils.init(iArr, -36564);
        FuzzerUtils.init(sArr1, (short) -12605);

        vMeth1(f2, 0L, f2);
        for (i12 = 15; 393 > i12; ++i12) {
            by1 *= (byte) s;
        }
        for (i15 = 336; i15 > 13; i15 -= 3) {
            Test0537.instanceCount *= i15;
            switch ((((-61828 >>> 1) % 3) * 5) + 14) {
                case 19:
                case 26:
                    i16 += (int) -2724878169L;
                    for (f3 = 1; f3 < 15; ++f3) {
                        boolean b2 = true;
                        switch ((int) ((f3 % 4) + 110)) {
                            case 110:
                                i17 &= s;
                                sArr1[(int) (f3)] += (short) d1;
                                iArr[(int) (f3 - 1)] *= (int) Test0537.instanceCount;
                                break;
                            case 111:
                                b2 = b2;
                                break;
                            case 112:
                                Test0537.fArrFld[i15] = 10;
                                i17 = 11;
                                break;
                            case 113:
                                d1 += i17;
                        }
                    }
                    break;
                case 15:
                    d1 = i15;
                    break;
                default:
                    i13 += (i15 | i16);
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f2) + i12 + i13 + by1 + s + i15 + i16 + Float.floatToIntBits(f3) + i17
                + Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(sArr1);
    }

    public static void vSmallMeth(int i4) {


        vMeth();
        vSmallMeth_check_sum += i4;
    }

    public static void main(String[] strArr) {

        try {
            Test0537 _instance = new Test0537();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = 11;
        int i1 = -8;
        int i2 = 28;
        int i3 = 227;
        int[] iArr1 = new int[N];
        boolean b = false;
        long l1 = 1542208889L;
        float f4 = -58.589F;
        byte[][] byArr = new byte[N][N];

        FuzzerUtils.init(byArr, (byte) -89);
        FuzzerUtils.init(iArr1, 22012);

        for (i = 8; i < 149; ++i) {
            for (i2 = i; 178 > i2; ++i2) {
                if (b) break;
                for (int smallinvoc = 0; smallinvoc < 1; smallinvoc++) vSmallMeth(i2);
                byArr[i2 - 1][(i2 >>> 1) % N] = (byte) Test0537.instanceCount;
                iArr1[i2 - 1] -= i;
                i3 += (49413 + (i2 * i2));
                Test0537.instanceCount += i2;
                l1 = 1;
                while (++l1 < 1) {
                    iArr1[i2] -= i;
                    if (false) {
                        Test0537.instanceCount += (l1 * l1);
                        i1 = -17545;
                        i1 = 34;
                    } else if (b) {
                        Test0537.instanceCount -= i3;
                        i1 *= i3;
                        Test0537.instanceCount -= -10;
                        Test0537.instanceCount += l1;
                    } else {
                        if (b) {
                            iArr1[i2 - 1] -= i3;
                            i3 -= (int) f4;
                            Test0537.instanceCount &= Test0537.instanceCount;
                        } else if (b) {
                            i3 += (int) (0.129F + (l1 * l1));
                            i1 *= i;
                            f4 = i1;
                        } else if (b) {
                            i3 *= 61216;
                            i3 += i2;
                        } else {
                            iArr1[i2 - 1] = (int) Test0537.instanceCount;
                            Test0537.instanceCount -= Test0537.byFld;
                        }
                    }
                }
                i3 <<= (int) -46040904357517855L;
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 b l1 = " + i3 + "," + (b ? 1 : 0) + "," + l1);
        FuzzerUtils.out.println("f4 byArr iArr1 = " + Float.floatToIntBits(f4) + "," + FuzzerUtils.checkSum(byArr) +
                "," + FuzzerUtils.checkSum(iArr1));

        FuzzerUtils.out.println("Test0537.instanceCount Test0537.byFld Test0537.fArrFld = " + Test0537.instanceCount + "," + Test0537.byFld
                + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0537.fArrFld)));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  vMeth1 ->  vMeth1 vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
