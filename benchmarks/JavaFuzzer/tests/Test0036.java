// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:53 2023
public class Test0036 {

    public static final int N = 400;

    public static long instanceCount = 1465474959L;
    public static float fFld = 2.205F;
    public static int iFld = -3;
    public static boolean bFld = true;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public volatile short[] sArrFld = new short[N];

    public static void vMeth1(int i4) {

        double d = 0.94348;
        boolean b = false;
        boolean[] bArr = new boolean[N];
        int i5 = -18;
        int i6 = 163;
        int i7 = 2;
        int i8 = 48062;
        int[] iArr1 = new int[N];
        long[][] lArr1 = new long[N][N];

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(iArr1, -14);
        FuzzerUtils.init(lArr1, 121L);

        d = 1;
        do {
            bArr[(int) (d)] = b;
            Test0036.instanceCount += (long) (d * d);
        } while (++d < 170);
        iArr1 = iArr1;
        i5 = 1;
        do {
            i6 = 1;
            do {
                Test0036.instanceCount -= i6;
                i4 >>= i4;
                iArr1[i6 - 1] |= (int) Test0036.instanceCount;
                i4 = (int) Test0036.instanceCount;
                for (i7 = 1; 1 > i7; ++i7) {
                    lArr1 = lArr1;
                    Test0036.instanceCount *= -2;
                    Test0036.instanceCount += (i7 * Test0036.instanceCount);
                    i4 = i4;
                }
            } while (++i6 < 4);
        } while (++i5 < 393);
        vMeth1_check_sum += i4 + Double.doubleToLongBits(d) + (b ? 1 : 0) + i5 + i6 + i7 + i8 +
                FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr1);
    }

    public static int iMeth(long l) {

        int i9 = 3;
        int i10 = 175;
        int i11 = -9;
        int i12 = 27088;
        int i13 = -26723;
        int i14 = -5;
        int[] iArr2 = new int[N];
        short s = 2486;
        byte by = 102;
        float[][] fArr = new float[N][N];

        FuzzerUtils.init(iArr2, -14);
        FuzzerUtils.init(fArr, -116.248F);

        vMeth1(Test0036.iFld);
        for (i9 = 20; i9 < 361; ++i9) {
            Test0036.iFld += s;
            i10 = i9;
            for (i11 = 1; i11 < 5; ++i11) {
                i10 -= i11;
                if (Test0036.iFld != 0) {
                }
                for (i13 = 1; i13 < 2; i13++) {
                    i10 *= i14;
                }
                by += (byte) (((i11 * i9) + Test0036.instanceCount) - i10);
                by = (byte) Test0036.instanceCount;
                try {
                    i10 = (i13 / -4841);
                    i10 = (i13 % iArr2[i11]);
                    Test0036.iFld = (-214 % i12);
                } catch (ArithmeticException a_e) {
                }
                l *= Test0036.instanceCount;
                iArr2 = iArr2;
                fArr[i11 + 1][i9] += i9;
            }
        }
        long meth_res = l + i9 + i10 + s + i11 + i12 + i13 + i14 + by + FuzzerUtils.checkSum(iArr2) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth(int i) {

        int i1 = -15999;
        int i2 = -5;
        int i3 = 25110;
        int i15 = 5;
        int i16 = 98;
        int[] iArr = new int[N];
        boolean b1 = true;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, -5L);
        FuzzerUtils.init(iArr, -119);

        i1 = 1;
        while (++i1 < 264) {
            double d1 = 123.5942;
            i += i1;
            Test0036.fFld += Test0036.fFld;
            if (b1) {
                i2 = 1;
                do {
                    i3 = 1;
                    while (++i3 < 1) {
                        i *= (int) (lArr[i1 - 1] + ((45 - iArr[i2]) + iMeth(Test0036.instanceCount)));
                        Test0036.fFld *= 855121075392075796L;
                        iArr[i2 - 1] = (int) Test0036.fFld;
                        if (i2 != 0) {
                            vMeth_check_sum += i + i1 + i2 + i3 + i15 + i16 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(lArr)
                                    + FuzzerUtils.checkSum(iArr);
                            return;
                        }
                    }
                    for (i15 = 1; i15 > 1; i15 -= 2) {
                        Test0036.iFld += i16;
                        i16 ^= (int) Test0036.instanceCount;
                        Test0036.iFld = i1;
                        i += i3;
                    }
                } while (++i2 < 6);
            } else {
                Test0036.instanceCount -= (long) d1;
                vMeth_check_sum += i + i1 + i2 + i3 + i15 + i16 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(lArr) +
                        FuzzerUtils.checkSum(iArr);
                return;
            }
        }
        vMeth_check_sum += i + i1 + i2 + i3 + i15 + i16 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(lArr) +
                FuzzerUtils.checkSum(iArr);
    }

    public static void main(String[] strArr) {

        try {
            Test0036 _instance = new Test0036();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        float f = -2.640F;
        float[] fArr1 = new float[N];
        int i17 = -49;
        int i18 = -8865;
        int i20 = 3;
        int i21 = 61;
        int i22 = -9;
        int i23 = 43253;
        int i24 = 63;
        int i25 = 6;
        int[] iArr3 = new int[N];

        FuzzerUtils.init(iArr3, 0);
        FuzzerUtils.init(fArr1, 2.908F);

        vMeth(Test0036.iFld);
        Test0036.instanceCount = Test0036.iFld;
        Test0036.iFld -= Test0036.iFld;
        f = 1;
        while (++f < 165) {
            if (Test0036.bFld) continue;
            for (i17 = 1; i17 < 152; i17 += 3) {
                if (Test0036.bFld) break;
            }
            i18 = i18;
            i18 = Test0036.iFld;
            Test0036.fFld += (f * f);
            iArr3[(int) (f - 1)] >>= i17;
            for (i20 = 9; 152 > i20; ++i20) {
                if (Test0036.bFld) continue;
                Test0036.iFld <<= (int) Test0036.instanceCount;
            }
            for (i22 = 152; i22 > 8; i22 -= 3) {
                if (Test0036.bFld) {
                    if (Test0036.bFld) continue;
                    i23 += i22;
                    for (i24 = 1; i24 < 4; i24++) {
                        iArr3[i22] >>= i17;
                        i25 >>= (int) Test0036.instanceCount;
                        switch ((int) (((f % 9) * 5) + 60)) {
                            case 62:
                                i18 += (i24 * i20);
                                i18 ^= 61;
                                break;
                            case 74:
                                i18 += i24;
                                Test0036.instanceCount *= i23;
                                if (Test0036.bFld) {
                                    i21 = (int) Test0036.instanceCount;
                                    Test0036.instanceCount += (i24 * i24);
                                } else if (Test0036.bFld) {
                                    Test0036.instanceCount += (i24 | Test0036.instanceCount);
                                } else if (Test0036.bFld) {
                                    fArr1[i22] = -7;
                                }
                                break;
                            case 97:
                                i18 = i18;
                                break;
                            case 96:
                                i18 %= (int) ((long) (f) | 1);
                                break;
                            case 76:
                                Test0036.bFld = Test0036.bFld;
                                break;
                            case 61:
                                i25 = i18;
                                break;
                            case 95:
                                iArr3[i22] -= i21;
                                break;
                            case 89:
                                Test0036.iFld <<= (int) Test0036.instanceCount;
                                break;
                            case 93:
                                sArrFld = sArrFld;
                                break;
                        }
                    }
                } else if (Test0036.bFld) {
                    i25 += (i22 * i22);
                } else {
                    iArr3[(int) (f)] *= i17;
                }
            }
        }

        FuzzerUtils.out.println("f i17 i18 = " + Float.floatToIntBits(f) + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("iArr3 fArr1 = " + FuzzerUtils.checkSum(iArr3) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));

        FuzzerUtils.out.println("Test0036.instanceCount Test0036.fFld Test0036.iFld = " + Test0036.instanceCount + "," +
                Float.floatToIntBits(Test0036.fFld) + "," + Test0036.iFld);
        FuzzerUtils.out.println("Test0036.bFld sArrFld = " + (Test0036.bFld ? 1 : 0) + "," + FuzzerUtils.checkSum(sArrFld));

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
