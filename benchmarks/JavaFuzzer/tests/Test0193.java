// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:57 2023
public class Test0193 {

    public static final int N = 400;

    public static long instanceCount = 7940440886476823779L;
    public static double dFld = -46.6871;
    public static long[] lArrFld = new long[N];
    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0193.lArrFld, 24912L);
    }

    public volatile double[] dArrFld = new double[N];

    public static int iMeth(short s, long l1, int i10) {

        int i11 = 180;
        int i12 = -212;
        int i13 = -29824;
        int[] iArr = new int[N];
        float f = 2.319F;
        double[] dArr = new double[N];

        FuzzerUtils.init(iArr, -52399);
        FuzzerUtils.init(dArr, 104.123170);

        i11 = 1;
        do {
            i10 *= (int) Test0193.dFld;
            i10 = (int) l1;
            iArr[i11 + 1] = i11;
            Test0193.dFld = i11;
            i10 += i10;
        } while (++i11 < 227);
        i10 -= (int) -42.679F;
        for (i12 = 6; 248 > i12; i12++) {
            f -= i11;
            i13 = (int) 1.569F;
            l1 -= 81;
        }
        dArr[(-23839 >>> 1) % N] = i13;
        long meth_res = s + l1 + i10 + i11 + i12 + i13 + Float.floatToIntBits(f) + FuzzerUtils.checkSum(iArr) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth(int i6, int i7) {

        int i8 = 60332;
        int i9 = -8;
        int i14 = 0;
        int i15 = 228;
        int i16 = 25831;
        int i17 = 1102;
        int[][] iArr1 = new int[N][N];
        byte by1 = -80;
        short s1 = -26314;
        short[] sArr = new short[N];
        float f1 = 2.59F;
        float[] fArr = new float[N];
        float[][] fArr1 = new float[N][N];
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, 1L);
        FuzzerUtils.init(iArr1, -42);
        FuzzerUtils.init(fArr, 7.805F);
        FuzzerUtils.init(sArr, (short) 11049);
        FuzzerUtils.init(fArr1, -2.836F);

        for (i8 = 11; i8 < 288; ++i8) {
            by1 = (byte) iMeth(s1, Test0193.instanceCount, i9);
            i14 = 1;
            while (++i14 < 6) {
                i6 -= (int) Test0193.instanceCount;
            }
            iArr1[i8 + 1][i8] >>>= (int) Test0193.instanceCount;
            f1 += i8;
        }
        for (i15 = 13; i15 < 303; i15++) {
            fArr[i15 - 1] -= 1.942F;
        }
        i9 *= (int) Test0193.instanceCount;
        i16 *= i7;
        i7 = (int) Test0193.instanceCount;
        i17 *= i8;
        sArr[(i14 >>> 1) % N] &= (short) 167L;
        fArr1 = fArr1;
        vMeth_check_sum += i6 + i7 + i8 + i9 + by1 + s1 + i14 + Float.floatToIntBits(f1) + i15 + i16 + i17 +
                FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(sArr) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public static float fMeth(int i, long l, byte by) {

        double d = -2.64769;
        int i1 = -47;
        int i2 = 77;
        int i3 = 25766;
        int i4 = -91;
        int i5 = -114;
        int[] iArr2 = new int[N];
        boolean b = false;
        short s2 = -23771;
        float f2 = 0.106F;

        FuzzerUtils.init(iArr2, 53718);

        for (d = 7; d < 134; ++d) {
            if (i != 0) {
            }
            if (b) {
                for (i2 = 12; 1 < i2; i2 -= 2) {
                    for (i4 = 1; 3 > i4; i4++) {
                        vMeth(i2, i4);
                        if (b) continue;
                        Test0193.instanceCount -= i3;
                        Test0193.lArrFld[i4 - 1] = 53340;
                        i += (int) l;
                        iArr2 = iArr2;
                        iArr2[(int) (d)] = s2;
                        i1 -= i4;
                        i = i;
                        Test0193.instanceCount += s2;
                    }
                }
            } else if (b) {
                Test0193.dFld = f2;
            } else {
                s2 += (short) i5;
            }
        }
        long meth_res = i + l + by + Double.doubleToLongBits(d) + i1 + i2 + i3 + i4 + i5 + (b ? 1 : 0) + s2 +
                Float.floatToIntBits(f2) + FuzzerUtils.checkSum(iArr2);
        fMeth_check_sum += meth_res;
        return (float) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0193 _instance = new Test0193();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i18 = -91;
        int i19 = 8;
        int i20 = -46611;
        int i21 = 3;
        int i22 = 4;
        int i23 = 87;
        int i24 = -5;
        int i26 = -10847;
        int i27 = -30694;
        int[] iArr3 = new int[N];
        byte by2 = -110;
        float f3 = 83.321F;
        boolean b1 = true;
        double d1 = 2.3845;

        FuzzerUtils.init(iArr3, -87);

        Test0193.instanceCount += (long) fMeth(i18, Test0193.instanceCount, by2);
        for (i19 = 356; i19 > 13; i19 -= 2) {
            f3 *= i19;
            for (i21 = i19; 147 > i21; ++i21) {
                try {
                    i18 = (1781521096 % i19);
                    iArr3[i21] = (i18 / -37290);
                    i22 = (63744 / i20);
                } catch (ArithmeticException a_e) {
                }
                i18 >>= 12;
                i18 += i22;
                for (i23 = 1; i23 < 1; i23++) {
                    int i25 = 239;
                    dArrFld[i23 + 1] -= Test0193.dFld;
                    i20 = i23;
                    if (b1) continue;
                    i22 += i18;
                    i25 -= i19;
                    i18 += (i23 * i23);
                    Test0193.instanceCount &= Test0193.instanceCount;
                    iArr3[i19 + 1] = (int) Test0193.instanceCount;
                }
                for (i26 = 1; i26 < 1; i26++) {
                    i24 -= i24;
                    i27 = -196;
                    i18 = (int) Test0193.instanceCount;
                    try {
                        i18 = (i26 % i26);
                        iArr3[i21 + 1] = (i23 / 41297);
                        i18 = (i23 / 26219);
                    } catch (ArithmeticException a_e) {
                    }
                }
                i18 += i18;
                i20 += i21;
                d1 = 1;
                do {
                    f3 += i24;
                    i18 *= (int) 102.69219;
                    f3 += i24;
                    if (b1) continue;
                    iArr3 = iArr3;
                    Test0193.dFld *= i23;
                } while (++d1 < 1);
            }
        }

        FuzzerUtils.out.println("i18 by2 i19 = " + i18 + "," + by2 + "," + i19);
        FuzzerUtils.out.println("i20 f3 i21 = " + i20 + "," + Float.floatToIntBits(f3) + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("b1 i26 i27 = " + (b1 ? 1 : 0) + "," + i26 + "," + i27);
        FuzzerUtils.out.println("d1 iArr3 = " + Double.doubleToLongBits(d1) + "," + FuzzerUtils.checkSum(iArr3));

        FuzzerUtils.out.println("Test0193.instanceCount Test0193.dFld Test0193.lArrFld = " + Test0193.instanceCount + "," +
                Double.doubleToLongBits(Test0193.dFld) + "," + FuzzerUtils.checkSum(Test0193.lArrFld));
        FuzzerUtils.out.println("dArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
