// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:53 2023
public class Test0037 {

    public static final int N = 400;

    public static long instanceCount = 0L;
    public static byte byFld = 104;
    public static int iFld = -197;
    public static float fFld = 53.460F;
    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public double dFld = -81.67727;

    public static void vMeth(int i) {

        double d = -1.97054;
        float f = -114.481F;

        Test0037.instanceCount >>= (i++);
        d -= Math.max((long) (-f), Test0037.instanceCount);
        vMeth_check_sum += i + Double.doubleToLongBits(d) + Float.floatToIntBits(f);
    }

    public static void vMeth1(long l) {

        int i2 = 38;
        int i3 = 45723;
        int i4 = -21293;
        int i5 = -7;
        int i6 = -12;
        int i7 = -57383;
        int i8 = 9144;
        int[] iArr1 = new int[N];
        float f1 = -47.15F;
        double d1 = 0.102932;
        double[] dArr = new double[N];
        boolean b = true;

        FuzzerUtils.init(iArr1, 65343);
        FuzzerUtils.init(dArr, -42.113117);

        vMeth(i2);
        for (i3 = 6; i3 < 182; ++i3) {
            for (i5 = 1; i5 < 9; ++i5) {
                if (true) {
                    switch ((i3 % 5) + 56) {
                        case 56:
                            Test0037.instanceCount += i3;
                            i4 = i3;
                            i6 = Test0037.byFld;
                            break;
                        case 57:
                            i2 += (((i5 * i2) + i2) - i2);
                            if (true) continue;
                            break;
                        case 58:
                            f1 *= f1;
                            for (i7 = 1; i7 < 2; ++i7) {
                                i6 *= (int) d1;
                                iArr1[i3 + 1] = (int) Test0037.instanceCount;
                                i2 += (-63074 + (i7 * i7));
                            }
                            break;
                        case 59:
                            i2 = (int) d1;
                            break;
                        case 60:
                            i6 -= (int) d1;
                            break;
                    }
                    vMeth1_check_sum += l + i2 + i3 + i4 + i5 + i6 + Float.floatToIntBits(f1) + i7 + i8 +
                            Double.doubleToLongBits(d1) + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr1) +
                            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                    return;
                } else if (b) {
                    Test0037.iFld = i8;
                } else if (b) {
                    l += (-6417 + (i5 * i5));
                } else {
                    dArr = dArr;
                }
            }
        }
        vMeth1_check_sum += l + i2 + i3 + i4 + i5 + i6 + Float.floatToIntBits(f1) + i7 + i8 +
                Double.doubleToLongBits(d1) + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr1) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static long lMeth() {

        int i1 = -8;
        int i9 = -58544;
        int i10 = -108;
        int i11 = -77;
        int i12 = -129;
        int i13 = -215;
        int i14 = 227;
        int i15 = 110;
        int i16 = 0;
        int[] iArr = new int[N];

        FuzzerUtils.init(iArr, -115);

        vMeth(Math.abs(iArr[(i1 >>> 1) % N]));
        vMeth1(4836L);
        for (i9 = 10; 278 > i9; ++i9) {
            Test0037.instanceCount >>>= Test0037.iFld;
            for (i11 = 1; i11 < 6; i11++) {
                i10 *= i11;
            }
            switch ((i9 % 5) + 69) {
                case 69:
                    if (i12 != 0) {
                    }
                    i12 = i9;
                    for (i13 = i9; i13 < 6; i13 += 3) {
                        Test0037.byFld += (byte) (((i13 * Test0037.fFld) + i14) - i15);
                        if (i12 != 0) {
                        }
                        i16 = 1;
                        while (++i16 < 1) {
                            i10 -= 239;
                            i14 = Test0037.byFld;
                        }
                    }
                    break;
                case 70:
                    i10 &= -220;
                    break;
                case 71:
                    Test0037.instanceCount -= i11;
                    break;
                case 72:
                    iArr[i9] -= (int) -1.127452;
                    break;
                case 73:
                    i15 &= (int) Test0037.instanceCount;
                    break;
            }
        }
        long meth_res = i1 + i9 + i10 + i11 + i12 + i13 + i14 + i15 + i16 + FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0037 _instance = new Test0037();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i18 = 64;
        int i19 = -64030;
        int i20 = -209;
        int i21 = 10;
        int i22 = -8;
        int i23 = -6;
        int i24 = -14;
        int[] iArr2 = new int[N];
        boolean b1 = true;
        double[] dArr1 = new double[N];

        FuzzerUtils.init(iArr2, 4);
        FuzzerUtils.init(dArr1, -2.91440);

        Test0037.instanceCount |= lMeth();
        iArr2[(2 >>> 1) % N] = (int) Test0037.instanceCount;
        for (i18 = 269; i18 > 16; --i18) {
            for (i20 = 5; i20 < 99; ++i20) {
                Test0037.iFld -= (int) Test0037.fFld;
                iArr2[i20] *= Test0037.iFld;
                i22 = 1;
                while (++i22 < 2) {
                    Test0037.instanceCount = Test0037.instanceCount;
                    iArr2[i22 - 1] >>= i18;
                    if (b1) break;
                    Test0037.fFld += 1228445230L;
                    iArr2 = iArr2;
                }
                if (b1) continue;
                i19 += (9 + (i20 * i20));
                dFld -= i21;
                for (i23 = 1; i23 < 2; ++i23) {
                    Test0037.instanceCount -= 49;
                    iArr2[i18 - 1] = Test0037.iFld;
                    i19 -= i20;
                    Test0037.iFld += i18;
                    try {
                        i21 = (i20 % 11877);
                        Test0037.iFld = (i19 % Test0037.iFld);
                        Test0037.iFld = (i18 / i24);
                    } catch (ArithmeticException a_e) {
                    }
                    iArr2 = iArr2;
                    dArr1[i20 - 1] *= i19;
                    i24 >>= i23;
                    Test0037.fFld += Test0037.iFld;
                }
                Test0037.iFld *= i21;
            }
            iArr2[i18] = i18;
            Test0037.instanceCount = Test0037.iFld;
            i21 >>= -53596;
            try {
                i24 = (Test0037.iFld % -20953);
                Test0037.iFld = (i23 % i19);
                i24 = (i22 % Test0037.iFld);
            } catch (ArithmeticException a_e) {
            }
        }

        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 b1 = " + i21 + "," + i22 + "," + (b1 ? 1 : 0));
        FuzzerUtils.out.println("i23 i24 iArr2 = " + i23 + "," + i24 + "," + FuzzerUtils.checkSum(iArr2));
        FuzzerUtils.out.println("dArr1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)));

        FuzzerUtils.out.println("Test0037.instanceCount Test0037.byFld Test0037.iFld = " + Test0037.instanceCount + "," + Test0037.byFld +
                "," + Test0037.iFld);
        FuzzerUtils.out.println("Test0037.fFld dFld = " + Float.floatToIntBits(Test0037.fFld) + "," +
                Double.doubleToLongBits(dFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth mainTest vMeth1
//DEBUG  vMeth1 ->  vMeth1 lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
