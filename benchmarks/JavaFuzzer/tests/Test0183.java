// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:57 2023
public class Test0183 {

    public static final int N = 400;

    public static long instanceCount = -53256L;
    public static double dFld = -1.53142;
    public static float fFld = 53.469F;
    public static volatile boolean bFld = false;
    public static long[] lArrFld = new long[N];
    public static int[] iArrFld = new int[N];
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0183.lArrFld, 0L);
        FuzzerUtils.init(Test0183.iArrFld, -109);
    }

    public static int iMeth1(int i11, long l1) {

        int i12 = -3;
        int i13 = -15058;
        int i14 = 34663;
        int i15 = -6;
        int i16 = -9574;
        int i17 = 3;
        int i18 = 208;
        int i19 = 242;
        int i20 = 24227;
        int[] iArr1 = new int[N];
        short s = -16547;
        float f2 = 2.807F;

        FuzzerUtils.init(iArr1, 46651);

        iArr1[(i11 >>> 1) % N] = (int) 2456611721965018311L;
        for (i12 = 6; 217 > i12; ++i12) {
            for (i14 = 1; 8 > i14; i14++) {
                for (i16 = 1; i16 < 2; ++i16) {
                    i15 |= i16;
                }
                i13 = (int) Test0183.instanceCount;
                i17 *= s;
                f2 = i14;
                for (i18 = i14; 2 > i18; i18++) {
                    s += (short) (117 + (i18 * i18));
                    i11 <<= 15845;
                }
            }
            Test0183.instanceCount = -9;
            i20 = 1;
            do {
                f2 = i15;
                i19 += i20;
            } while (++i20 < 8);
        }
        long meth_res = i11 + l1 + i12 + i13 + i14 + i15 + i16 + i17 + s + Float.floatToIntBits(f2) + i18 + i19 + i20 +
                FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public static int iMeth(int i9, double d) {

        float f1 = 2.516F, f3 = -2.814F;
        int i10 = 62241;
        int i21 = -154;
        int i22 = 65;
        int i23 = -55111;
        int i24 = 3;
        int[] iArr2 = new int[N];
        boolean b = true;
        boolean[] bArr = new boolean[N];

        FuzzerUtils.init(iArr2, -36596);
        FuzzerUtils.init(bArr, true);

        for (f1 = 11; 228 > f1; f1++) {
            b = (!b);
            switch (((iMeth1(i9, Test0183.instanceCount) >>> 1) % 2) + 97) {
                case 97:
                    for (i21 = (int) (f1); 7 > i21; i21++) {
                        for (i23 = 1; i23 > 1; i23 -= 2) {
                            iArr2[i21 + 1] <<= i22;
                            Test0183.instanceCount *= i23;
                            i9 += i21;
                            f3 -= -19509;
                            switch ((i21 % 1) + 83) {
                                case 83:
                                    i22 = i24;
                                    try {
                                        i24 = (iArr2[i23 - 1] / -57671);
                                        i22 = (iArr2[(int) (f1)] % 231);
                                        i24 = (-35440 % i22);
                                    } catch (ArithmeticException a_e) {
                                    }
                                    iArr2[i23 + 1] = i10;
                                    break;
                                default:
                                    Test0183.instanceCount *= (long) -127.784F;
                                    f3 += (49914 + (i23 * i23));
                            }
                        }
                    }
                    break;
                case 98:
                    bArr[(int) (f1 - 1)] = b;
                default:
                    iArr2[(int) (f1 + 1)] >>= i24;
            }
        }
        long meth_res = i9 + Double.doubleToLongBits(d) + Float.floatToIntBits(f1) + i10 + (b ? 1 : 0) + i21 + i22 +
                i23 + i24 + Float.floatToIntBits(f3) + FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(bArr);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0183 _instance = new Test0183();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void vMeth(int i3, int i4, long l) {

        int i5 = 12, i6 = 5, i7 = -4, i8 = -17450;
        boolean b1 = true;

        for (i5 = 137; 1 < i5; --i5) {
            for (i7 = 1; i7 < 12; ++i7) {
                switch (((i5 % 6) * 5) + 61) {
                    case 71:
                        Test0183.instanceCount = iMeth(-207, Test0183.dFld);
                        i6 = i8;
                        if (i7 != 0) {
                            vMeth_check_sum += i3 + i4 + l + i5 + i6 + i7 + i8 + (b1 ? 1 : 0);
                            return;
                        }
                        break;
                    case 81:
                        b1 = b1;
                        i6 = i6;
                        if (i6 != 0) {
                            vMeth_check_sum += i3 + i4 + l + i5 + i6 + i7 + i8 + (b1 ? 1 : 0);
                            return;
                        }
                        break;
                    case 77:
                        b1 = false;
                        i6 -= (int) l;
                        l -= i5;
                        Test0183.iArrFld[i5] /= (int) (i6 | 1);
                    case 90:
                        i8 *= (int) Test0183.dFld;
                        Test0183.instanceCount = i3;
                        break;
                    case 91:
                        i3 >>>= -50;
                        break;
                    case 89:
                    default:
                        Test0183.fFld = i3;
                }
            }
        }
        vMeth_check_sum += i3 + i4 + l + i5 + i6 + i7 + i8 + (b1 ? 1 : 0);
    }

    public void mainTest(String[] strArr1) {

        int i = 5;
        int i1 = -2;
        int i2 = 2;
        int i25 = 1;
        int i26 = 201;
        int i27 = -16;
        int i28 = -14;
        int i29 = 65277;
        int i30 = -24656;
        int[] iArr = new int[N];
        float f = 1.23F;
        float f4 = 0.907F;
        float[] fArr = new float[N];
        byte by = -87;
        byte[] byArr = new byte[N];
        short s1 = 9287;
        boolean b2 = true;

        FuzzerUtils.init(iArr, -3);
        FuzzerUtils.init(byArr, (byte) 22);
        FuzzerUtils.init(fArr, -2.290F);

        i = (int) (((i + f) - (Test0183.instanceCount + f)) + (by + (Test0183.lArrFld[(i >>> 1) % N] = Test0183.instanceCount)));
        for (i1 = 201; i1 > 5; i1--) {
            switch ((i1 % 3) + 123) {
                case 123:
                    iArr[i1 - 1] = (i1 + (byArr[i1 + 1]++));
                    break;
                case 124:
                    vMeth(i, i, Test0183.instanceCount);
                    for (i25 = 1; 128 > i25; i25++) {
                        for (i27 = 2; i27 > 1; i27 -= 3) {
                            Test0183.dFld -= -2.108064;
                            Test0183.instanceCount += (i27 + Test0183.instanceCount);
                            Test0183.iArrFld[i27 + 1] += i28;
                            i += i28;
                            Test0183.instanceCount >>>= i;
                            Test0183.fFld -= i;
                            Test0183.dFld += Test0183.instanceCount;
                        }
                        fArr[i1] -= -55970;
                        i += (int) 22.48265;
                        for (i29 = 1; 2 > i29; ++i29) {
                            Test0183.iArrFld[i1 - 1] *= i26;
                            Test0183.instanceCount = i2;
                            i28 += i29;
                            i26 -= s1;
                            switch ((i29 % 1) + 92) {
                                case 92:
                                    b2 = Test0183.bFld;
                                    f4 *= Test0183.fFld;
                                    Test0183.bFld = Test0183.bFld;
                                default:
                                    i30 -= i;
                            }
                            i28 = 21;
                            i2 *= (int) f;
                            Test0183.dFld = i27;
                            i -= i25;
                        }
                    }
                    break;
                case 125:
                    Test0183.lArrFld[i1 - 1] = i1;
                default:
                    i = by;
            }
        }

        FuzzerUtils.out.println("i f by = " + i + "," + Float.floatToIntBits(f) + "," + by);
        FuzzerUtils.out.println("i1 i2 i25 = " + i1 + "," + i2 + "," + i25);
        FuzzerUtils.out.println("i26 i27 i28 = " + i26 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("i29 i30 s1 = " + i29 + "," + i30 + "," + s1);
        FuzzerUtils.out.println("b2 f4 iArr = " + (b2 ? 1 : 0) + "," + Float.floatToIntBits(f4) + "," +
                FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println("byArr fArr = " + FuzzerUtils.checkSum(byArr) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test0183.instanceCount Test0183.dFld Test0183.fFld = " + Test0183.instanceCount + "," +
                Double.doubleToLongBits(Test0183.dFld) + "," + Float.floatToIntBits(Test0183.fFld));
        FuzzerUtils.out.println("Test0183.bFld Test0183.lArrFld Test0183.iArrFld = " + (Test0183.bFld ? 1 : 0) + "," +
                FuzzerUtils.checkSum(Test0183.lArrFld) + "," + FuzzerUtils.checkSum(Test0183.iArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
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
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
