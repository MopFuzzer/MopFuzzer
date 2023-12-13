// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:07 2023
public class Test0587 {

    public static final int N = 400;

    public static volatile long instanceCount = 2435812488L;
    public static volatile double dFld = -51.66840;
    public static float fFld = -34.473F;
    public static byte byFld = -56;

    public static long iMeth_check_sum = 0;
    public static long byMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i12, boolean b, long l) {

        int i13 = 10, i14 = 186, i15 = -21929, i16 = 0, i17 = 7, i18 = 13, i19 = 7, i20 = -222;
        long[] lArr = new long[N];
        double[] dArr = new double[N];

        FuzzerUtils.init(lArr, 4L);
        FuzzerUtils.init(dArr, -1.101235);

        for (i13 = 5; i13 < 166; i13++) {
            switch ((i13 % 2) + 6) {
                case 6:
                    i14 += (i13 ^ l);
                    Test0587.fFld += i14;
                    for (i15 = 1; 10 > i15; i15++) {
                        for (i17 = 1; i17 < 2; ++i17) {
                            i18 = (int) Test0587.dFld;
                            i18 >>>= i16;
                            i18 = i13;
                            Test0587.byFld += (byte) i16;
                            i16 = -8;
                        }
                        i16 -= i15;
                        for (i19 = 1; i19 < 2; i19++) {
                            lArr[i19 - 1] = i12;
                            Test0587.fFld = Test0587.fFld;
                        }
                    }
                    break;
                case 7:
                    dArr[i13] *= Test0587.dFld;
                    break;
            }
        }
        long meth_res = i12 + (b ? 1 : 0) + l + i13 + i14 + i15 + i16 + i17 + i18 + i19 + i20 +
                FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public static byte byMeth(int i7) {

        int i8 = 5;
        int i9 = 26114;
        int i10 = 53460;
        int i11 = 2;
        int i21 = -28535;
        int i22 = 349;
        int[] iArr1 = new int[N];
        boolean b1 = true;
        float[] fArr = new float[N];

        FuzzerUtils.init(iArr1, 210);
        FuzzerUtils.init(fArr, 2.921F);

        for (i8 = 5; i8 < 161; ++i8) {
            i7 = (int) Test0587.dFld;
            for (i10 = 10; i10 > 1; i10 -= 3) {
                Test0587.fFld %= (iMeth1(i7, b1, -1L) | 1);
                Test0587.dFld += i8;
                iArr1[i10 + 1] = Test0587.byFld;
                Test0587.instanceCount *= i8;
                i11 += 35551;
                Test0587.fFld += i9;
                i21 = 1;
                do {
                    i7 = (int) 2.605F;
                    fArr[i8] *= i10;
                    Test0587.instanceCount = i7;
                    i22 += Test0587.byFld;
                    i7 += (68 + (i21 * i21));
                } while (++i21 < 4);
            }
        }
        long meth_res = i7 + i8 + i9 + i10 + i11 + (b1 ? 1 : 0) + i21 + i22 + FuzzerUtils.checkSum(iArr1) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        byMeth_check_sum += meth_res;
        return (byte) meth_res;
    }

    public static int iMeth(int i4, int i5, int i6) {

        short s = 1760;
        int i23 = 3, i24 = 75;

        i5 = -3;
        i6 += byMeth(i6);
        s += (short) i6;
        i5 *= (int) Test0587.instanceCount;
        i23 = 1;
        while (++i23 < 206) {
            i24 = 1;
            while (++i24 < 8) {
                i4 += (((i24 * Test0587.instanceCount) + i5) - Test0587.instanceCount);
                i5 += (25 + (i24 * i24));
                Test0587.byFld += (byte) (((i24 * i5) + Test0587.instanceCount) - i4);
                i4 += i24;
            }
        }
        i5 += (int) Test0587.fFld;
        long meth_res = i4 + i5 + i6 + s + i23 + i24;
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0587 _instance = new Test0587();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = -10;
        int i1 = -104;
        int i2 = 28484;
        int i3 = 99;
        int i25 = -50611;
        int i26 = -54175;
        int i27 = -3;
        int i28 = -4;
        int i29 = -10;
        int i30 = -3373;
        int i31 = 6;
        int i32 = 35;
        int[] iArr = new int[N];
        float f = 1.440F;
        short s1 = -18013;

        FuzzerUtils.init(iArr, 61461);

        for (i = 6; i < 232; i++) {
            i1 += iArr[(i >>> 1) % N];
            for (i2 = 3; i2 < 111; i2++) {
                i1 += 1;
                f += (i2 + Test0587.instanceCount);
                Test0587.instanceCount = iMeth(154, i1, i3);
                i3 >>= 13;
                i25 = 1;
                do {
                    i1 += Test0587.byFld;
                    i26 += (((i25 * i26) + Test0587.instanceCount) - i);
                    if (true) break;
                    i26 &= (int) Test0587.instanceCount;
                    i26 |= i;
                    i1 -= i;
                    i3 = (int) Test0587.fFld;
                } while (++i25 < 2);
                i26 -= 52357;
                if (false) continue;
                iArr[i2] *= i1;
            }
            for (i27 = 5; i27 < 111; ++i27) {
                i26 >>>= (int) Test0587.instanceCount;
            }
            for (i29 = 2; 111 > i29; i29++) {
                Test0587.fFld += (-3 + (i29 * i29));
            }
            for (i31 = 3; i31 < 111; ++i31) {
                i26 = s1;
                i28 += (i31 ^ i27);
                try {
                    iArr[i - 1] = (10041 / i31);
                    i32 = (77 % i32);
                    i1 = (177 % iArr[i31 - 1]);
                } catch (ArithmeticException a_e) {
                }
                Test0587.instanceCount += 13;
                iArr[i31 - 1] = (int) Test0587.dFld;
                Test0587.instanceCount -= i25;
                s1 += (short) (-12454 + (i31 * i31));
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 f i25 = " + i3 + "," + Float.floatToIntBits(f) + "," + i25);
        FuzzerUtils.out.println("i26 i27 i28 = " + i26 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("i29 i30 i31 = " + i29 + "," + i30 + "," + i31);
        FuzzerUtils.out.println("i32 s1 iArr = " + i32 + "," + s1 + "," + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test0587.instanceCount Test0587.dFld Test0587.fFld = " + Test0587.instanceCount + "," +
                Double.doubleToLongBits(Test0587.dFld) + "," + Float.floatToIntBits(Test0587.fFld));
        FuzzerUtils.out.println("Test0587.byFld = " + Test0587.byFld);

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
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
//DEBUG  iMeth1 ->  iMeth1 byMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
