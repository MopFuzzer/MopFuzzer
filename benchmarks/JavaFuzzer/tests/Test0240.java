// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:59 2023
public class Test0240 {

    public static final int N = 400;

    public static long instanceCount = -1881987149586129630L;
    public static float fFld = 1.868F;
    public static double dFld = 1.2421;
    public static short sFld = 25311;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i4, int i5, long l) {

        int i6 = 53005, i7 = 21, i8 = -9, i9 = 12, i10 = 3;
        byte by = 42;

        for (i6 = 3; 356 > i6; ++i6) {
            i4 += i5;
            Test0240.instanceCount *= (long) Test0240.fFld;
            i7 >>= (int) 35225L;
            i7 -= i7;
        }
        for (i8 = 4; 143 > i8; i8 += 2) {
            Test0240.dFld = i8;
            i7 += (int) Test0240.fFld;
            i10 = 1;
            do {
                if (i10 != 0) {
                    vMeth2_check_sum += i4 + i5 + l + i6 + i7 + i8 + i9 + i10 + by;
                    return;
                }
                i4 = i9;
                i7 = (int) Test0240.instanceCount;
                by <<= (byte) Test0240.instanceCount;
                i9 = i9;
                Test0240.instanceCount %= (i6 | 1);
            } while ((i10 += 3) < 22);
        }
        vMeth2_check_sum += i4 + i5 + l + i6 + i7 + i8 + i9 + i10 + by;
    }

    public static void vMeth1(int i3) {

        int i11 = 6;
        int i12 = 9;
        int[] iArr = new int[N];
        boolean b = true;

        FuzzerUtils.init(iArr, -21641);

        vMeth2(i3, i3, Test0240.instanceCount);
        i11 *= -4549;
        i11 *= i3;
        i3 += (int) -104.84169;
        i12 = 1;
        while (++i12 < 214) {
            i3 = i11;
            i3 = Test0240.sFld;
        }
        i3 += i11;
        if (b) {
            Test0240.instanceCount += (long) Test0240.dFld;
            if (false) {
                b = b;
                i11 -= (int) Test0240.fFld;
                iArr[(-5 >>> 1) % N] -= i12;
            }
            iArr = FuzzerUtils.int1array(N, (int) 8);
        }
        vMeth1_check_sum += i3 + i11 + i12 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr);
    }

    public static void main(String[] strArr) {

        try {
            Test0240 _instance = new Test0240();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void vMeth(int i, int i1, int i2) {

        int i13 = 39393, i14 = 16, i15 = -14, i16 = -10, i17 = -10;
        long l1 = -1L;

        vMeth1(-59332);
        i >>= i1;
        i2 *= (int) Test0240.dFld;
        i >>= -37;
        i1 -= (int) Test0240.dFld;
        for (i13 = 17; i13 < 383; i13++) {
            Test0240.fFld -= i13;
        }
        i14 ^= i;
        Test0240.instanceCount >>= 6965092739739961255L;
        for (i15 = 9; i15 < 151; i15++) {
            i1 += (0 + (i15 * i15));
            for (l1 = 1; l1 < 11; l1++) {
                i16 += (int) l1;
                i16 += 116;
                Test0240.instanceCount = (long) Test0240.fFld;
            }
        }
        vMeth_check_sum += i + i1 + i2 + i13 + i14 + i15 + i16 + l1 + i17;
    }

    public void mainTest(String[] strArr1) {

        int i18 = 207, i19 = -63380, i20 = -12, i21 = 0, i22 = -11, i23 = 6, i24 = -1, i25 = 7, i26 = -4;
        byte by1 = -113;
        float f = -1.168F;
        double d = 40.130774;
        long[][] lArr = new long[N][N];

        FuzzerUtils.init(lArr, -421979352L);

        vMeth(i18, i18, i19);
        try {
            for (i20 = 8; i20 < 293; ++i20) {
                for (i22 = 88; i22 > i20; i22--) {
                    by1 += (byte) (((i22 * Test0240.instanceCount) + i18) - i20);
                    f = 1;
                    do {
                        lArr[i20 - 1][i22 - 1] += 14;
                        i21 -= i21;
                        Test0240.instanceCount += (long) (((f * f) + f) - i23);
                        i18 = i18;
                    } while (++f < 1);
                    i24 = 1;
                    while (++i24 < 1) {
                        i18 = (int) 1.527F;
                        i19 = i21;
                        i19 = (int) f;
                        i18 >>= 7;
                        i19 = (int) Test0240.instanceCount;
                        i19 += i24;
                        i23 = (int) f;
                    }
                    i18 >>>= i23;
                    d *= Test0240.sFld;
                }
                Test0240.instanceCount &= Test0240.instanceCount;
                Test0240.instanceCount += (i20 | i24);
                i21 += i20;
                Test0240.instanceCount -= 0L;
                i23 = i21;
                i19 = 48828;
                i18 = i23;
                for (i25 = 3; i25 < 88; ++i25) {
                    Test0240.instanceCount = i25;
                    i19 &= -64;
                }
            }
        } catch (ArithmeticException exc1) {
            Test0240.dFld -= i21;
        }

        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("by1 f i24 = " + by1 + "," + Float.floatToIntBits(f) + "," + i24);
        FuzzerUtils.out.println("d i25 i26 = " + Double.doubleToLongBits(d) + "," + i25 + "," + i26);
        FuzzerUtils.out.println("lArr = " + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test0240.instanceCount Test0240.fFld Test0240.dFld = " + Test0240.instanceCount + "," +
                Float.floatToIntBits(Test0240.fFld) + "," + Double.doubleToLongBits(Test0240.dFld));
        FuzzerUtils.out.println("Test0240.sFld = " + Test0240.sFld);

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}