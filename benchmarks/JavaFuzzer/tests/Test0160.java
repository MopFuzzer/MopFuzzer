// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:56 2023
public class Test0160 {

    public static final int N = 400;

    public static long instanceCount = -7L;
    public static float fFld = 1.761F;
    public static long lFld = 7L;
    public static volatile double dFld = -60.43835;
    public static int[] iArrFld = new int[N];
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0160.iArrFld, -13789);
    }

    public short sFld = 12516;
    public byte byFld = 82;

    public static int iMeth1(float f1, boolean b, float f2) {

        int i5 = -47103, i6 = 40722, i7 = 121, i8 = -26290, i9 = -34, i10 = 69, i11 = -8;
        long l = 92L;
        short s1 = -24233;
        float[] fArr = new float[N];

        FuzzerUtils.init(fArr, 30.480F);

        Test0160.iArrFld[(i5 >>> 1) % N] *= (int) f2;
        for (i6 = 20; i6 < 398; i6++) {
            double d1 = 0.30952;
            i7 *= i6;
            d1 += Test0160.instanceCount;
            i5 <<= i5;
            for (i8 = 1; i8 < 4; i8++) {
                if (b) break;
                i10 = 1;
                do {
                    fArr[i6] -= i10;
                    i9 = -120;
                } while (++i10 < 2);
                for (l = i6; l < 2; l++) {
                    i9 = i8;
                    i9 -= i6;
                    i5 += (int) (((l * l) + i5) - i9);
                    s1 = (short) l;
                }
            }
        }
        long meth_res = Float.floatToIntBits(f1) + (b ? 1 : 0) + Float.floatToIntBits(f2) + i5 + i6 + i7 + i8 + i9 +
                i10 + l + i11 + s1 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth() {

        int i1 = 69, i2 = 229, i3 = 0, i4 = 9, i12 = 6, i13 = 39953, i14 = -33021, i15 = -12573, i16 = 24806, i17 = 148;
        double d = 0.60265;
        short s = -30967;
        boolean b1 = false;
        byte by = -73;
        long[] lArr1 = new long[N];

        FuzzerUtils.init(lArr1, 64173L);

        for (i1 = 7; i1 < 391; i1++) {
            for (i3 = 4; i3 > 1; i3 -= 2) {
                float f3 = -2.171F;
                i2 += (int) (d++);
                s += (short) (((11611 * iMeth1(f3, b1, f3)) * Test0160.instanceCount) / (i1 | 1));
                by = (byte) i2;
            }
            i4 += (((i1 * i1) + i2) - Test0160.fFld);
        }
        for (i12 = 9; i12 < 346; i12++) {
            for (i14 = 1; 5 > i14; i14 += 2) {
                Test0160.iArrFld[i14 - 1] += i12;
                for (i16 = 1; i16 < 3; i16++) {
                    switch (((i14 % 10) * 5) + 67) {
                        case 95:
                            Test0160.fFld = i4;
                            break;
                        case 76:
                            i17 += (int) Test0160.fFld;
                            Test0160.iArrFld[i16 + 1] += (int) Test0160.lFld;
                            if (b1) break;
                            break;
                        case 88:
                            Test0160.lFld ^= Test0160.lFld;
                            break;
                        case 117:
                            i13 *= i17;
                            break;
                        case 97:
                            i2 = i15;
                            break;
                        case 81:
                            lArr1[i12] += i1;
                            break;
                        case 98:
                            i13 = i13;
                            break;
                        case 114:
                            if (i16 != 0) {
                                vMeth_check_sum += i1 + i2 + i3 + i4 + Double.doubleToLongBits(d) + s + (b1 ? 1 : 0) + by +
                                        i12 + i13 + i14 + i15 + i16 + i17 + FuzzerUtils.checkSum(lArr1);
                                return;
                            }
                            break;
                        case 91:
                            d += i15;
                            break;
                        case 87:
                            if (i15 != 0) {
                                vMeth_check_sum += i1 + i2 + i3 + i4 + Double.doubleToLongBits(d) + s + (b1 ? 1 : 0) + by +
                                        i12 + i13 + i14 + i15 + i16 + i17 + FuzzerUtils.checkSum(lArr1);
                                return;
                            }
                            break;
                    }
                }
            }
        }
        vMeth_check_sum += i1 + i2 + i3 + i4 + Double.doubleToLongBits(d) + s + (b1 ? 1 : 0) + by + i12 + i13 + i14 +
                i15 + i16 + i17 + FuzzerUtils.checkSum(lArr1);
    }

    public static int iMeth(float f) {

        int i = -12, i18 = 10, i19 = -69, i20 = -7289, i21 = 8, i22 = -13, i23 = 2107;
        short s2 = 25532;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, -14L);

        lArr[(i >>> 1) % N] >>= i;
        vMeth();
        f = i;
        for (i18 = 16; i18 < 342; ++i18) {
            for (i20 = 1; i20 < 5; ++i20) {
                for (i22 = 2; i22 > i20; i22 -= 3) {
                    i23 = i21;
                    Test0160.dFld += i21;
                    i = i19;
                    Test0160.iArrFld[i18 + 1] = (int) Test0160.instanceCount;
                    i21 = s2;
                    Test0160.instanceCount *= i21;
                    s2 &= (short) i18;
                    i21 -= -9160;
                    f += i20;
                }
            }
        }
        long meth_res = Float.floatToIntBits(f) + i + i18 + i19 + i20 + i21 + i22 + i23 + s2 +
                FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0160 _instance = new Test0160();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i24 = -57265;
        int i26 = 8;
        int i27 = 43487;
        int i28 = 241;
        int[][] iArr = new int[N][N];
        boolean b2 = false, b3 = false;
        byte[] byArr = new byte[N];

        FuzzerUtils.init(byArr, (byte) 19);
        FuzzerUtils.init(iArr, 12);

        sFld = (short) iMeth(Test0160.fFld);
        Test0160.lFld = Test0160.lFld;
        Test0160.instanceCount *= 140;
        i24 = 270;
        do {
            int i25 = 92;
            i25 *= (int) Test0160.instanceCount;
            for (i26 = 186; 2 < i26; --i26) {
                if (b2) break;
                Test0160.lFld += (-58866 + (i26 * i26));
                switch (((i24 % 2) * 5) + 29) {
                    case 31:
                        i28 = 2;
                        while (--i28 > 0) {
                            i27 *= i25;
                            byArr[i26] -= (byte) -923874082L;
                            switch ((i26 % 10) + 79) {
                                case 79:
                                    switch (((i24 % 3) * 5) + 122) {
                                        case 137:
                                            i25 >>>= i25;
                                            i27 -= (int) Test0160.fFld;
                                            try {
                                                i27 = (i27 % -20986);
                                                i25 = (i24 % 61);
                                                i27 = (i26 % 40);
                                            } catch (ArithmeticException a_e) {
                                            }
                                            Test0160.instanceCount += i26;
                                            break;
                                        case 129:
                                            Test0160.fFld -= -3465129414254479881L;
                                            break;
                                        case 132:
                                            iArr[i24 - 1][i26] = -213;
                                            i27 += i24;
                                            i25 += 8529;
                                            break;
                                    }
                                    i27 += (i28 * Test0160.fFld);
                                    break;
                                case 80:
                                    i25 *= byFld;
                                    Test0160.instanceCount += (long) Test0160.fFld;
                                    Test0160.iArrFld[i26] = (int) Test0160.instanceCount;
                                    try {
                                        iArr[i24][i24] = (i27 % 32648);
                                        Test0160.iArrFld[i26] = (i25 / 56924);
                                        iArr[i26 - 1][i26 + 1] = (i24 % i27);
                                    } catch (ArithmeticException a_e) {
                                    }
                                    break;
                                case 81:
                                    i27 >>= i25;
                                    if (b2) break;
                                    Test0160.fFld = i25;
                                    break;
                                case 82:
                                case 83:
                                    Test0160.iArrFld = iArr[i26 + 1];
                                    break;
                                case 84:
                                case 85:
                                    i25 += i27;
                                    break;
                                case 86:
                                    Test0160.lFld += i25;
                                    break;
                                case 87:
                                    Test0160.iArrFld[i26 + 1] <<= (int) Test0160.lFld;
                                    break;
                                case 88:
                                    b3 = false;
                                    break;
                            }
                        }
                    case 38:
                        i25 = -2;
                        break;
                    default:
                        i25 += (i26 * Test0160.fFld);
                }
            }
        } while ((i24 -= 2) > 0);

        FuzzerUtils.out.println("i24 i26 i27 = " + i24 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("b2 i28 b3 = " + (b2 ? 1 : 0) + "," + i28 + "," + (b3 ? 1 : 0));
        FuzzerUtils.out.println("byArr iArr = " + FuzzerUtils.checkSum(byArr) + "," + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test0160.instanceCount sFld Test0160.fFld = " + Test0160.instanceCount + "," + sFld + "," +
                Float.floatToIntBits(Test0160.fFld));
        FuzzerUtils.out.println("Test0160.lFld Test0160.dFld byFld = " + Test0160.lFld + "," + Double.doubleToLongBits(Test0160.dFld) +
                "," + byFld);
        FuzzerUtils.out.println("Test0160.iArrFld = " + FuzzerUtils.checkSum(Test0160.iArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
