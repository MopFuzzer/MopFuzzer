// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:09 2023
public class Test0644 {

    public static final int N = 400;

    public static volatile long instanceCount = -25502L;
    public static float fFld = -2.406F;
    public static byte byFld = -67;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public double dFld = -116.104362;

    public static void vMeth() {

        int i8 = 1;
        int i9 = -127;
        int i10 = -16050;
        int i11 = 11;
        int[] iArr = new int[N];
        boolean b2 = true;
        byte by1 = -67;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, -5L);
        FuzzerUtils.init(iArr, -59826);

        for (long l : lArr) {
            i8 = 1;
            while (++i8 < 4) {
                i9 -= i9;
                for (i10 = 1; i10 < 1; i10++) {
                    i9 <<= i10;
                    b2 = b2;
                    i9 = 120;
                }
                lArr[i8 + 1] <<= i11;
                i9 += (i8 | i9);
                by1 = (byte) i11;
                l += (-7 + (i8 * i8));
                i9 = i10;
                iArr[i8 - 1] <<= i9;
                i11 /= (int) (i11 | 1);
                i9 = i8;
            }
        }
        vMeth_check_sum += i8 + i9 + i10 + i11 + (b2 ? 1 : 0) + by1 + FuzzerUtils.checkSum(lArr) +
                FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth1(int i5, byte by) {

        int i6 = 11;
        int i7 = 14490;
        int i12 = -13;
        int i13 = 2;
        int i14 = -55852;
        int[] iArr1 = new int[N];
        float f = -2.28F;
        long l1 = -8L;
        long[] lArr1 = new long[N];
        double[] dArr = new double[N];

        FuzzerUtils.init(iArr1, -1);
        FuzzerUtils.init(dArr, -1.18194);
        FuzzerUtils.init(lArr1, 251L);

        for (i6 = 9; 370 > i6; i6++) {
            vMeth();
            i7 -= (int) Test0644.instanceCount;
            Test0644.instanceCount <<= 20920;
            Test0644.instanceCount += (i6 * i6);
        }
        i7 = (int) Test0644.instanceCount;
        iArr1[(i7 >>> 1) % N] = (int) Test0644.instanceCount;
        Test0644.instanceCount %= (Test0644.instanceCount | 1);
        for (f = 7; f < 131; ++f) {
            l1 = 1;
            do {
                i7 = i6;
            } while (++l1 < 13);
        }
        for (i13 = 4; i13 < 219; ++i13) {
            dArr[i13 + 1] = Test0644.instanceCount;
            lArr1[i13] = Test0644.instanceCount;
        }
        Test0644.fFld = i7;
        long meth_res = i5 + by + i6 + i7 + Float.floatToIntBits(f) + i12 + l1 + i13 + i14 +
                FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
                FuzzerUtils.checkSum(lArr1);
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public static int iMeth(boolean b1) {

        int i3 = 108;
        int i4 = -48;
        int i15 = -17839;
        int i16 = -136;
        int i17 = 53485;
        int[] iArr2 = new int[N];
        long[] lArr2 = new long[N];

        FuzzerUtils.init(lArr2, -108L);
        FuzzerUtils.init(iArr2, -41178);

        i3 = 1;
        do {
            i4 *= (int) Float.intBitsToFloat(iMeth1(i3, Test0644.byFld) << i4);
            if (b1) continue;
            i4 = 3916;
            Test0644.instanceCount += (i3 ^ i3);
            i15 = 1;
            do {
                lArr2[i3] += Test0644.instanceCount;
                iArr2[i15 + 1] *= i4;
                i4 <<= (int) Test0644.instanceCount;
                switch ((i15 % 2) + 47) {
                    case 47:
                        switch ((i15 % 7) + 41) {
                            case 41:
                                Test0644.byFld = (byte) i3;
                                for (i16 = 1; i16 < 1; i16++) {
                                    i17 += i17;
                                    iArr2[i3 - 1] = i17;
                                }
                                break;
                            case 42:
                                if (b1) continue;
                            case 43:
                            case 44:
                                i17 *= 60954;
                                break;
                            case 45:
                                i17 *= i4;
                                break;
                            case 46:
                                lArr2[i15] %= (Test0644.instanceCount | 1);
                                break;
                            case 47:
                                i4 = i4;
                                break;
                            default:
                                if (i16 != 0) {
                                }
                        }
                        break;
                    case 48:
                        Test0644.byFld = (byte) Test0644.instanceCount;
                }
            } while (++i15 < 5);
        } while (++i3 < 367);
        long meth_res = (b1 ? 1 : 0) + i3 + i4 + i15 + i16 + i17 + FuzzerUtils.checkSum(lArr2) +
                FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0644 _instance = new Test0644();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = -2;
        int i1 = -104;
        int i2 = 201;
        int i18 = 206;
        int i19 = -9;
        int i20 = 77;
        int i21 = 169;
        int i22 = 12;
        int i23 = -192;
        int i24 = 8;
        int i25 = -5;
        int i26 = -1;
        int[] iArr3 = new int[N];
        boolean b = true;
        short s = 16636;
        long[] lArr3 = new long[N];
        float[] fArr = new float[N];

        FuzzerUtils.init(lArr3, -6766748820252889572L);
        FuzzerUtils.init(iArr3, -64166);
        FuzzerUtils.init(fArr, 94.427F);

        i = 1;
        while (++i < 129) {
            for (i1 = i; i1 < 194; ++i1) {
                if (b) continue;
                dFld = iMeth(b);
                i2 <<= (int) 523908529L;
                lArr3[i1 + 1] += i2;
            }
            for (i18 = 5; 194 > i18; ++i18) {
                i2 += i18;
                Test0644.instanceCount = Test0644.instanceCount;
                i19 >>= s;
            }
            for (i20 = 10; i20 < 194; i20++) {
                for (i22 = 1; i22 < 2; ++i22) {
                    i2 += i22;
                }
                i19 -= i;
            }
            if (true) {
                switch (((189 >>> 1) % 5) + 74) {
                    case 74:
                        Test0644.byFld >>= (byte) i22;
                        break;
                    case 75:
                        i23 = i2;
                        break;
                    case 76:
                        Test0644.fFld = i18;
                        i24 = 1;
                        while (++i24 < 194) {
                            i21 += (((i24 * i23) + i) - s);
                            i19 -= (int) Test0644.instanceCount;
                            if (true) break;
                            i23 += i24;
                            for (i25 = 1; i25 < 1; i25++) {
                                iArr3[i25] >>>= i18;
                                i21 += (int) Test0644.instanceCount;
                                fArr[i25 - 1] %= ((long) (dFld) | 1);
                                lArr3[i25 + 1] *= -238;
                                lArr3[i] = i23;
                            }
                        }
                        break;
                    case 77:
                        Test0644.instanceCount += (38943L + (i * i));
                        break;
                    case 78:
                        Test0644.fFld += -162;
                        break;
                    default:
                        Test0644.instanceCount -= s;
                }
            } else {
                dFld = Test0644.fFld;
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("b i18 i19 = " + (b ? 1 : 0) + "," + i18 + "," + i19);
        FuzzerUtils.out.println("s i20 i21 = " + s + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 i26 lArr3 = " + i25 + "," + i26 + "," + FuzzerUtils.checkSum(lArr3));
        FuzzerUtils.out.println("iArr3 fArr = " + FuzzerUtils.checkSum(iArr3) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test0644.instanceCount dFld Test0644.fFld = " + Test0644.instanceCount + "," +
                Double.doubleToLongBits(dFld) + "," + Float.floatToIntBits(Test0644.fFld));
        FuzzerUtils.out.println("Test0644.byFld = " + Test0644.byFld);

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
