// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:11 2023
public class Test0736 {

    public static final int N = 400;

    public static long instanceCount = 60525L;
    public static int iFld = 16706;
    public static int iFld1 = 51653;
    public static short[] sArrFld = new short[N];
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0736.sArrFld, (short) -19998);
    }

    public short sFld = -4392;

    public static int iMeth(boolean b) {

        double d = -1.126517, d1 = 0.118972;
        int i4 = -31355;
        int i5 = 27;
        int i6 = -33583;
        int[] iArr = new int[N];
        float f = 2.720F, f1 = 8.454F;
        short[] sArr = new short[N];

        FuzzerUtils.init(sArr, (short) -31992);
        FuzzerUtils.init(iArr, -11);

        d *= Test0736.instanceCount;
        for (d1 = 9; 196 > d1; ++d1) {
            sArr[(int) (d1 - 1)] -= (short) i4;
            i4 += (int) d1;
            Test0736.instanceCount *= i4;
            f += (float) d1;
            Test0736.instanceCount = -146;
            for (f1 = 1; 9 > f1; ++f1) {
                Test0736.instanceCount += (long) f1;
                i6 = 2;
                do {
                    i4 = i4;
                    iArr[(int) (f1 - 1)] >>= (int) 7963L;
                    i5 -= i5;
                    try {
                        i4 = (-58185 / i6);
                        i5 = (-29893 / i4);
                        i5 = (i6 % 50356);
                    } catch (ArithmeticException a_e) {
                    }
                    i5 *= i5;
                } while ((i6 -= 2) > 0);
            }
        }
        long meth_res = (b ? 1 : 0) + Double.doubleToLongBits(d) + Double.doubleToLongBits(d1) + i4 +
                Float.floatToIntBits(f) + Float.floatToIntBits(f1) + i5 + i6 + FuzzerUtils.checkSum(sArr) +
                FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth1(int i) {

        int i1 = 9;
        int i2 = 45;
        int i3 = -1;
        int i7 = -204;
        int i8 = 9;
        int i9 = 38486;
        int i10 = 11;
        int[] iArr1 = new int[N];
        boolean b1 = true;
        float f2 = -95.648F;
        byte by = 115;

        FuzzerUtils.init(iArr1, 42657);

        Test0736.instanceCount += Math.abs((-(--i)) + (i * 10L));
        for (i1 = 6; i1 < 246; i1++) {
            i3 = iMeth(b1);
            Test0736.instanceCount += i1;
            for (i7 = 7; i7 > 1; --i7) {
                for (i9 = 2; i9 > 1; i9 -= 3) {
                    iArr1[i9 - 1] &= i1;
                    Test0736.instanceCount -= i1;
                    switch (((i7 >>> 1) % 2) + 66) {
                        case 66:
                            Test0736.instanceCount += (i9 * i2);
                            i10 = i1;
                            break;
                        case 67:
                            i3 -= (int) f2;
                            Test0736.instanceCount = (long) f2;
                            i2 |= (int) Test0736.instanceCount;
                    }
                    by += (byte) i9;
                }
            }
        }
        vMeth1_check_sum += i + i1 + i2 + i3 + (b1 ? 1 : 0) + i7 + i8 + i9 + i10 + Float.floatToIntBits(f2) + by +
                FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth() {

        float f3 = 2.209F;
        short s = 23006;
        int i11 = 2;
        int i12 = 50570;
        int i14 = 39767;
        int i15 = -61489;
        int[] iArr2 = new int[N];
        boolean b2 = true;
        double d2 = 33.37319;

        FuzzerUtils.init(iArr2, 105);

        vMeth1(Test0736.iFld);
        f3 += s;
        for (i11 = 2; i11 < 244; ++i11) {
            if (b2) continue;
            iArr2 = iArr2;
            i12 *= -9936;
            d2 += Test0736.instanceCount;
            d2 *= -1450613054L;
            switch ((i11 % 2) + 61) {
                case 61:
                    for (i14 = 1; 7 > i14; ++i14) {
                        iArr2 = FuzzerUtils.int1array(N, (int) -36584);
                        Test0736.instanceCount >>= i11;
                    }
                    Test0736.instanceCount = Test0736.iFld;
                    break;
                case 62:
                    i12 += i11;
                    i15 >>>= Test0736.iFld1;
                    break;
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f3) + s + i11 + i12 + (b2 ? 1 : 0) + Double.doubleToLongBits(d2) + i14
                + i15 + FuzzerUtils.checkSum(iArr2);
    }

    public static void main(String[] strArr) {

        try {
            Test0736 _instance = new Test0736();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        long l = 237L;
        int i16 = 77;
        int i17 = -38412;
        int i18 = -75;
        int i19 = -3;
        int i20 = -86;
        int i21 = -74;
        int i22 = -6;
        int i23 = 149;
        int[] iArr3 = new int[N];
        float f4 = -2.404F;
        double d3 = -1.130952;
        byte by1 = -23;

        FuzzerUtils.init(iArr3, 4487);

        l = 1;
        while (++l < 238) {
            vMeth();
            Test0736.iFld1 -= i16;
        }
        iArr3[(i16 >>> 1) % N] = -95;
        for (i17 = 15; i17 < 303; ++i17) {
            i18 = Test0736.iFld1;
            Test0736.instanceCount -= i17;
            Test0736.instanceCount += (5 + (i17 * i17));
            if (true) continue;
            i16 += (i17 | Test0736.instanceCount);
            i19 = 1;
            do {
                i16 += i19;
                iArr3[i19] *= i19;
                i16 += 30297;
                Test0736.instanceCount = (long) f4;
                f4 = f4;
                i16 <<= i16;
                iArr3 = iArr3;
            } while (++i19 < 87);
            i16 += (i17 * i17);
            iArr3 = iArr3;
            Test0736.iFld = 245;
        }
        for (i20 = 1; i20 < 387; ++i20) {
            d3 = i17;
            i16 -= (int) d3;
            sFld -= by1;
        }
        for (i22 = 220; 2 < i22; --i22) {
            d3 -= i20;
            i21 = -4374;
            d3 -= -5;
            i23 += i19;
        }

        FuzzerUtils.out.println("l i16 i17 = " + l + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 i19 f4 = " + i18 + "," + i19 + "," + Float.floatToIntBits(f4));
        FuzzerUtils.out.println("i20 i21 d3 = " + i20 + "," + i21 + "," + Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("by1 i22 i23 = " + by1 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("iArr3 = " + FuzzerUtils.checkSum(iArr3));

        FuzzerUtils.out.println("Test0736.instanceCount Test0736.iFld Test0736.iFld1 = " + Test0736.instanceCount + "," + Test0736.iFld +
                "," + Test0736.iFld1);
        FuzzerUtils.out.println("sFld Test0736.sArrFld = " + sFld + "," + FuzzerUtils.checkSum(Test0736.sArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
