// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:13 2023
public class Test0815 {

    public static final int N = 400;

    public static long instanceCount = 12L;
    public static int iFld = -14;
    public static double dFld = 50.48690;
    public static volatile int iFld1 = 51183;
    public static byte byFld = -112;
    public static byte[] byArrFld = new byte[N];
    public static int[] iArrFld = new int[N];
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0815.byArrFld, (byte) -87);
        FuzzerUtils.init(Test0815.iArrFld, 11);
    }

    public short sFld = 19965;
    public long[] lArrFld = new long[N];

    public static void vMeth1(int i5) {

        int i6 = -176;
        int i7 = -14;
        int i8 = -4;
        int i9 = 3;
        int[] iArr2 = new int[N];
        float f2 = 0.895F;
        short s = -16256;
        double d = -15.64735;

        FuzzerUtils.init(iArr2, 238);

        switch (((Test0815.iFld >>> 1) % 2) + 74) {
            case 74:
                for (i6 = 8; 174 > i6; i6++) {
                    for (i8 = 1; i8 < 10; i8++) {
                        i7 = (int) Test0815.dFld;
                        i5 ^= i7;
                        Test0815.instanceCount -= i6;
                        f2 += (-25777 + (i8 * i8));
                        Test0815.instanceCount += (((i8 * s) + s) - Test0815.iFld);
                        d = 1;
                        do {
                            Test0815.dFld -= i9;
                            Test0815.instanceCount += (long) d;
                            i9 += Test0815.iFld1;
                            i7 += Test0815.byFld;
                            Test0815.iFld += (24594 + (d * d));
                            Test0815.instanceCount <<= i6;
                        } while (++d < 2);
                    }
                }
                break;
            case 75:
                iArr2[(Test0815.iFld >>> 1) % N] = i6;
                break;
            default:
                Test0815.iFld = (int) f2;
        }
        vMeth1_check_sum += i5 + i6 + i7 + i8 + i9 + Float.floatToIntBits(f2) + s + Double.doubleToLongBits(d) +
                FuzzerUtils.checkSum(iArr2);
    }

    public static void vMeth(boolean b) {

        float f1 = -63.505F;
        int i2 = 2;
        int i3 = 72;
        int i4 = -181;
        int i11 = -143;
        int i12 = 4;
        int i13 = -30628;
        int i14 = -90;
        int i15 = -12;
        int[] iArr1 = new int[N];

        FuzzerUtils.init(iArr1, -12);

        f1 *= Test0815.byArrFld[(i2 >>> 1) % N];
        b = ((Test0815.instanceCount -= (i2 / (i2 | 1))) != ((i2 * Test0815.instanceCount) - 2));
        for (i3 = 8; i3 < 241; ++i3) {
            f1 += (iArr1[i3] *= (int) ((i4 + Test0815.instanceCount) / (((long) (f1++)) | 1)));
            vMeth1(Test0815.iFld1);
            i2 = i4;
            for (i11 = 1; i11 < 7; i11 += 2) {
                Test0815.instanceCount = Test0815.iFld;
                for (i13 = 1; i13 < 3; i13++) {
                    i4 *= (int) f1;
                    i2 = (int) Test0815.instanceCount;
                }
                iArr1[i11 + 1] *= i12;
                i15 = 3;
                while (--i15 > 0) {
                    i4 -= i11;
                    i12 = 196;
                }
            }
        }
        vMeth_check_sum += (b ? 1 : 0) + Float.floatToIntBits(f1) + i2 + i3 + i4 + i11 + i12 + i13 + i14 + i15 +
                FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth(int i1) {

        float f = -1.1012F;
        boolean b1 = false;
        int i16 = 208;
        int i17 = 11;
        int i18 = -3;
        int[] iArr = new int[N];
        byte[] byArr = new byte[N];
        long[] lArr = new long[N];

        FuzzerUtils.init(byArr, (byte) 106);
        FuzzerUtils.init(iArr, 2);
        FuzzerUtils.init(lArr, -47904L);

        i1 += (int) (byArr[(i1 >>> 1) % N] + (iArr[(i1 >>> 1) % N] <<= (int) (-(87 / (((long) (f + 127)) | 1)))));
        i1 -= (int) (lArr[(i1 >>> 1) % N] * ((i1 - i1) + (Test0815.instanceCount = 11)));
        vMeth(b1);
        i16 = 379;
        do {
            iArr[i16] -= 0;
            iArr[i16 + 1] -= -1312;
            Test0815.instanceCount >>= Test0815.iFld1;
            for (i17 = 8; i17 > 1; i17 -= 2) {
                i18 *= Test0815.iFld1;
                if (b1) {
                    Test0815.iFld1 += (int) Test0815.instanceCount;
                } else if (b1) {
                    Test0815.iFld |= -10106;
                } else if (false) {
                    iArr[i17 - 1] = (int) Test0815.instanceCount;
                    Test0815.iFld = i17;
                } else {
                    iArr[i16] = (int) Test0815.instanceCount;
                }
            }
        } while ((i16 -= 2) > 0);
        long meth_res = i1 + Float.floatToIntBits(f) + (b1 ? 1 : 0) + i16 + i17 + i18 + FuzzerUtils.checkSum(byArr) +
                FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0815 _instance = new Test0815();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = 60824, i19 = 33448, i20 = -22257, i21 = 10, i22 = 174, i23 = 52291, i24 = 16679, i25 = 208, i26 = -247, i27 = 34858;
        boolean b2 = true;
        float f3 = 0.299F;
        double d1 = -4.126683;

        i >>= iMeth(Test0815.iFld);
        for (long l : lArrFld) {
            for (i19 = 2; i19 < 63; i19++) {
                Test0815.instanceCount *= (long) Test0815.dFld;
            }
            for (i21 = 3; i21 < 63; ++i21) {
                for (i23 = 1; i23 < 2; ++i23) {
                    Test0815.iFld -= 23;
                }
                Test0815.iArrFld[i21 - 1] -= (int) 4L;
                i20 += (-11572 + (i21 * i21));
                if (b2) {
                    i += (int) l;
                    Test0815.iArrFld[i21 + 1] = Test0815.iFld;
                    switch ((i21 % 1) + 59) {
                        case 59:
                            i22 += i21;
                            if (b2) continue;
                            break;
                    }
                } else if (b2) {
                    f3 = i24;
                    Test0815.iArrFld[i21 + 1] |= -14;
                    for (d1 = 1; d1 < 2; d1++) {
                        Test0815.iFld ^= (int) l;
                        Test0815.iFld1 += (int) d1;
                        i25 *= i25;
                        f3 -= sFld;
                        if (true) continue;
                    }
                } else if (b2) {
                    i20 = i21;
                    for (i26 = 1; 2 > i26; i26++) {
                        Test0815.dFld = i25;
                        Test0815.iFld += (i26 * i23);
                        i27 <<= Test0815.byFld;
                        sFld = (short) i21;
                        f3 += (i26 * i26);
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i19 i20 = " + i + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 b2 f3 = " + i24 + "," + (b2 ? 1 : 0) + "," + Float.floatToIntBits(f3));
        FuzzerUtils.out.println("d1 i25 i26 = " + Double.doubleToLongBits(d1) + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 = " + i27);

        FuzzerUtils.out.println("Test0815.instanceCount Test0815.iFld Test0815.dFld = " + Test0815.instanceCount + "," + Test0815.iFld +
                "," + Double.doubleToLongBits(Test0815.dFld));
        FuzzerUtils.out.println("Test0815.iFld1 Test0815.byFld sFld = " + Test0815.iFld1 + "," + Test0815.byFld + "," + sFld);
        FuzzerUtils.out.println("Test0815.byArrFld lArrFld Test0815.iArrFld = " + FuzzerUtils.checkSum(Test0815.byArrFld) + "," +
                FuzzerUtils.checkSum(lArrFld) + "," + FuzzerUtils.checkSum(Test0815.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
