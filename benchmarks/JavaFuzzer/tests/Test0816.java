// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:13 2023
public class Test0816 {

    public static final int N = 400;

    public static long instanceCount = 20583L;
    public static int iFld = 16;
    public static short sFld = 6111;
    public static long[] lArrFld = new long[N];
    public static long iMeth_check_sum = 0;
    public static long byMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0816.lArrFld, 262863177659983583L);
    }

    public double dFld = -36.50395;
    public int[][] iArrFld = new int[N][N];

    public static void vMeth(float f, long l2, int i3) {

        boolean b = true;
        int i4 = 31375;
        int i5 = 2;
        int i6 = -11;
        int i7 = 56743;
        int i8 = 191;
        int[] iArr = new int[N];
        short s1 = -31610;
        byte by = 100;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, 7L);
        FuzzerUtils.init(iArr, -51040);

        b = b;
        for (i4 = 9; i4 < 258; ++i4) {
            i5 = s1;
        }
        for (i6 = 283; i6 > 2; --i6) {
            lArr[i6] -= i6;
            Test0816.lArrFld[i6] -= i6;
            iArr[i6 + 1] = (int) f;
            i3 = (int) 56400L;
            i8 = 1;
            while (++i8 < 6) {
                if (b) continue;
                Test0816.instanceCount = 12;
                iArr[i8 - 1] += (int) 1.84436;
            }
            i3 += s1;
            i3 += by;
            i5 |= i6;
        }
        vMeth_check_sum += Float.floatToIntBits(f) + l2 + i3 + (b ? 1 : 0) + i4 + i5 + s1 + i6 + i7 + i8 + by +
                FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
    }

    public static byte byMeth(long l1, double d) {

        float f1 = 24.102F;
        int i9 = 2;
        int i10 = -8;
        int i11 = 20301;
        int i12 = -14;
        int i13 = -8;
        int i14 = -46;
        int[] iArr1 = new int[N];
        double[] dArr = new double[N];

        FuzzerUtils.init(iArr1, 67);
        FuzzerUtils.init(dArr, 0.66898);

        vMeth(f1, Test0816.instanceCount, Test0816.iFld);
        iArr1[(-14 >>> 1) % N] *= (int) 1.375F;
        Test0816.iFld = Test0816.iFld;
        for (i9 = 1; i9 < 164; i9++) {
            Test0816.sFld *= (short) Test0816.iFld;
            Test0816.instanceCount -= -253L;
            dArr[i9] = i9;
            for (i11 = 1; 10 > i11; ++i11) {
                Test0816.lArrFld[i11 - 1] <<= 7;
                for (i13 = 1; i13 < 2; ++i13) {
                    Test0816.instanceCount += (i13 * i13);
                    f1 = i13;
                    l1 += (i13 | Test0816.iFld);
                    i12 -= (int) Test0816.instanceCount;
                    i10 -= (int) Test0816.instanceCount;
                }
            }
        }
        long meth_res = l1 + Double.doubleToLongBits(d) + Float.floatToIntBits(f1) + i9 + i10 + i11 + i12 + i13 + i14 +
                FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        byMeth_check_sum += meth_res;
        return (byte) meth_res;
    }

    public static int iMeth(long l, short s, int i2) {

        double d1 = 101.68030, d2 = -47.87275;
        int i15 = 217;
        int i16 = -55253;
        int i17 = -36911;
        int i18 = -184;
        int[] iArr2 = new int[N];
        int[] iArr3 = new int[N];

        FuzzerUtils.init(iArr2, -188);
        FuzzerUtils.init(iArr3, -82);

        i2 = byMeth(l, d1);
        Test0816.lArrFld[(i2 >>> 1) % N] >>= s;
        l += Test0816.iFld;
        i15 = 1;
        do {
            for (d2 = 1; d2 < 9; ++d2) {
                for (i17 = i15; 2 > i17; ++i17) {
                    float f2 = 0.731F;
                    d1 *= i15;
                    i18 >>>= i16;
                    switch (((i18 >>> 1) % 10) + 76) {
                        case 76:
                        case 77:
                            Test0816.iFld -= (int) 39.147F;
                            i18 -= i17;
                            iArr2[(int) (d2 - 1)] *= i2;
                            i16 -= (int) -37122L;
                            break;
                        case 78:
                            iArr2[i17 - 1] -= i18;
                            iArr3[i17] += i15;
                            break;
                        case 79:
                            Test0816.iFld <<= (int) l;
                            break;
                        case 80:
                            iArr3[i15 + 1] >>= i16;
                        case 81:
                            f2 = i2;
                            break;
                        case 82:
                            f2 -= l;
                            break;
                        case 83:
                            l += (i17 | i15);
                            break;
                        case 84:
                            i16 += (i17 | Test0816.iFld);
                            break;
                        case 85:
                            Test0816.instanceCount += i18;
                    }
                }
            }
        } while (++i15 < 174);
        long meth_res = l + s + i2 + Double.doubleToLongBits(d1) + i15 + Double.doubleToLongBits(d2) + i16 + i17 + i18
                + FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(iArr3);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0816 _instance = new Test0816();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = -182, i19 = 2, i20 = 14, i21 = 12132, i22 = 217, i23 = -5, i24 = 11218, i25 = -251, i26 = -56383;
        float f3 = -1.61F;
        byte by1 = -104;
        long l3 = 13L;
        boolean b1 = true;

        i = 1;
        do {
            int i1 = -110;
            i1 += (int) (((-155L * (i1++)) - iMeth(Test0816.instanceCount, Test0816.sFld, i)) + Test0816.instanceCount);
            for (i19 = i; i19 < 166; ++i19) {
                dFld -= i;
                i20 = -122;
                Test0816.iFld = i;
                iArrFld = iArrFld;
                if (b1) {
                    i1 *= (int) Test0816.instanceCount;
                    i20 += (((i19 * i1) + f3) - Test0816.instanceCount);
                    f3 += (-237 + (i19 * i19));
                } else if (b1) {
                    for (i21 = 1; 1 < i21; --i21) {
                        Test0816.instanceCount = Test0816.instanceCount;
                        Test0816.instanceCount <<= by1;
                        dFld = Test0816.instanceCount;
                        i1 = 8;
                    }
                    for (i23 = 1; 1 > i23; i23++) {
                        i24 = (int) 6L;
                    }
                    Test0816.instanceCount = -35080;
                    for (l3 = 1; l3 > 1; l3--) {
                        i22 <<= i;
                    }
                } else {
                    f3 += (i19 + f3);
                    i26 = 1;
                    do {
                        i24 -= (int) Test0816.instanceCount;
                        i20 = Test0816.sFld;
                        i25 ^= i23;
                        f3 += 109;
                        iArrFld[i26][i26 + 1] += (int) -87.389F;
                        if (false) continue;
                        f3 += (i26 * i26);
                    } while (++i26 < 1);
                }
            }
        } while (++i < 151);

        FuzzerUtils.out.println("i i19 i20 = " + i + "," + i19 + "," + i20);
        FuzzerUtils.out.println("f3 i21 i22 = " + Float.floatToIntBits(f3) + "," + i21 + "," + i22);
        FuzzerUtils.out.println("by1 i23 i24 = " + by1 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("l3 i25 b1 = " + l3 + "," + i25 + "," + (b1 ? 1 : 0));
        FuzzerUtils.out.println("i26 = " + i26);

        FuzzerUtils.out.println("Test0816.instanceCount Test0816.iFld Test0816.sFld = " + Test0816.instanceCount + "," + Test0816.iFld +
                "," + Test0816.sFld);
        FuzzerUtils.out.println("dFld Test0816.lArrFld iArrFld = " + Double.doubleToLongBits(dFld) + "," +
                FuzzerUtils.checkSum(Test0816.lArrFld) + "," + FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("byMeth_check_sum: " + byMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  byMeth ->  byMeth iMeth mainTest
//DEBUG  vMeth ->  vMeth byMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
