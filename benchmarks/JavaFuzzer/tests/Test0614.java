// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:08 2023
public class Test0614 {

    public static final int N = 400;

    public static long instanceCount = -403658957L;
    public static byte byFld = 47;
    public static boolean bFld = true;
    public static short sFld = 3610;
    public static int[] iArrFld = new int[N];
    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0614.iArrFld, 4);
    }

    public static int iMeth() {

        float f1 = 1.561F, f2 = 118.405F;
        double d = -38.33899;
        int i9 = -41;
        int i10 = 172;
        int i11 = 54729;
        int i12 = -8138;
        int[] iArr = new int[N];
        short s = -22114;
        boolean b1 = false;

        FuzzerUtils.init(iArr, 97);

        f1 -= Test0614.instanceCount;
        iArr[(215 >>> 1) % N] = (int) -21L;
        for (d = 4; d < 184; d++) {
            Test0614.instanceCount -= Test0614.byFld;
            for (i10 = 1; i10 < 9; ++i10) {
                Test0614.byFld |= (byte) i9;
                iArr[i10 - 1] += i9;
                Test0614.instanceCount += (((i10 * i9) + i10) - i11);
            }
            for (f2 = 1; f2 < 9; ++f2) {
                Test0614.instanceCount = 2;
                s *= (short) i12;
                Test0614.instanceCount = 53217;
                if (b1) break;
            }
        }
        long meth_res = Float.floatToIntBits(f1) + Double.doubleToLongBits(d) + i9 + i10 + i11 +
                Float.floatToIntBits(f2) + i12 + s + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth() {

        int i3 = 57317;
        int i4 = 148;
        int i5 = -58834;
        int i6 = -12;
        int i7 = 9;
        int i8 = 4;
        int[] iArr1 = new int[N];
        float f = 1.886F;
        boolean[] bArr = new boolean[N];

        FuzzerUtils.init(iArr1, -188);
        FuzzerUtils.init(bArr, true);

        for (i3 = 4; i3 < 172; i3++) {
            for (i5 = 1; i5 < 9; i5++) {
                i4 = (int) (f--);
                i4 += (((i5 * i5) + Test0614.instanceCount) - i6);
                for (i7 = 1; i7 < 2; ++i7) {
                    i8 -= (int) Math.abs(f);
                    i4 += (i4++);
                    i8 ^= (int) Test0614.instanceCount;
                    i8 += (i7 * i3);
                    i6 = iMeth();
                    i4 += (int) (-67.331F + (i7 * i7));
                    iArr1 = FuzzerUtils.int1array(N, (int) -41341);
                }
                f += (i5 * i5);
            }
            Test0614.instanceCount += (((i3 * i8) + i6) - f);
            bArr[i3] = Test0614.bFld;
        }
        vMeth_check_sum += i3 + i4 + i5 + i6 + Float.floatToIntBits(f) + i7 + i8 + FuzzerUtils.checkSum(iArr1) +
                FuzzerUtils.checkSum(bArr);
    }

    public static long lMeth(boolean b) {

        int i13 = -13;
        int i14 = -32861;
        int i15 = 40376;
        int i16 = 11;
        int i17 = -58876;
        int i18 = 2078;
        int i19 = 55289;
        int[] iArr2 = new int[N];
        float f3 = 39.971F;
        double d1 = 68.53148;

        FuzzerUtils.init(iArr2, -10);

        vMeth();
        i13 = Test0614.sFld;
        for (i14 = 4; i14 < 186; i14++) {
            for (i16 = 1; 9 > i16; ++i16) {
                for (i18 = 1; 2 > i18; ++i18) {
                    Test0614.instanceCount >>= i18;
                    switch ((i14 % 5) + 70) {
                        case 70:
                            f3 += 8;
                            f3 += i18;
                            f3 += i18;
                        case 71:
                            Test0614.bFld = Test0614.bFld;
                            iArr2[i16] -= Test0614.byFld;
                            d1 += 47007;
                            break;
                        case 72:
                            i13 += (((i18 * f3) + i16) - Test0614.instanceCount);
                            Test0614.bFld = Test0614.bFld;
                            break;
                        case 73:
                            b = false;
                            break;
                        case 74:
                            Test0614.instanceCount += (((i18 * i14) + f3) - i14);
                        default:
                            i19 -= i17;
                    }
                }
            }
        }
        long meth_res = (b ? 1 : 0) + i13 + i14 + i15 + i16 + i17 + i18 + i19 + Float.floatToIntBits(f3) +
                Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr2);
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0614 _instance = new Test0614();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = -23745;
        int i1 = 157;
        int i2 = -5;
        int i20 = -206;
        int i21 = -54336;
        int i22 = 81;
        int i23 = -24268;
        int i24 = 51428;
        int i25 = -20;
        int i26 = 29437;
        int i27 = 9;
        int[][] iArr3 = new int[N][N];
        boolean b2 = true;
        double d2 = 0.5342;
        float f4 = 0.314F;
        long l = -2091018479L;
        long[] lArr = new long[N];
        byte[] byArr = new byte[N];

        FuzzerUtils.init(byArr, (byte) -91);
        FuzzerUtils.init(lArr, 26576L);
        FuzzerUtils.init(iArr3, 22641);

        for (i = 14; i < 296; ++i) {
            i2 = 1;
            do {
                i1 += i2;
                i1 = (int) (lMeth(b2) + Test0614.byFld);
            } while (++i2 < 89);
            i1 = i1;
        }
        Test0614.instanceCount <<= i;
        for (i20 = 5; i20 < 190; i20++) {
            Test0614.iArrFld[i20 + 1] -= i20;
            for (i22 = 5; i22 < 136; ++i22) {
                for (i24 = 1; i24 < 2; ++i24) {
                    byArr[i20 - 1] -= Test0614.byFld;
                    Test0614.iArrFld[i22] <<= i2;
                    i25 += (((i24 * i26) + i) - Test0614.instanceCount);
                    Test0614.iArrFld[i24] = 59852;
                    Test0614.iArrFld[i24 + 1] = (int) -25.75F;
                    i1 = -117;
                    Test0614.byFld += (byte) d2;
                    i21 += (i24 ^ Test0614.sFld);
                    i27 += (i24 * i24);
                    f4 += (((i24 * i21) + i2) - i27);
                }
                try {
                    i26 = (Test0614.iArrFld[i22 + 1] % i25);
                    Test0614.iArrFld[i20 + 1] = (i25 % -111);
                    i23 = (i25 % Test0614.iArrFld[i20]);
                } catch (ArithmeticException a_e) {
                }
                Test0614.instanceCount *= i22;
                Test0614.instanceCount += Test0614.instanceCount;
                lArr[i22 + 1] &= 40506;
                i1 += (int) l;
                if (Test0614.bFld) continue;
                Test0614.iArrFld[i22 - 1] = i1;
            }
            i23 = i;
            iArr3 = iArr3;
            Test0614.instanceCount >>= Test0614.instanceCount;
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("b2 i20 i21 = " + (b2 ? 1 : 0) + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 i26 d2 = " + i25 + "," + i26 + "," + Double.doubleToLongBits(d2));
        FuzzerUtils.out.println("i27 f4 l = " + i27 + "," + Float.floatToIntBits(f4) + "," + l);
        FuzzerUtils.out.println("byArr lArr iArr3 = " + FuzzerUtils.checkSum(byArr) + "," + FuzzerUtils.checkSum(lArr)
                + "," + FuzzerUtils.checkSum(iArr3));

        FuzzerUtils.out.println("Test0614.instanceCount Test0614.byFld Test0614.bFld = " + Test0614.instanceCount + "," + Test0614.byFld +
                "," + (Test0614.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0614.sFld Test0614.iArrFld = " + Test0614.sFld + "," + FuzzerUtils.checkSum(Test0614.iArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
