// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:53 2023
public class Test0034 {

    public static final int N = 400;

    public static long instanceCount = -12L;
    public static float fFld = 29.26F;
    public static short sFld = -12109;

    public static long iMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        int i5 = -111, i6 = 234, i7 = 9, i8 = 174, i9 = 187, i10 = -1454;
        short s1 = -3664;
        float f = -11.848F;
        long[] lArr1 = new long[N];

        FuzzerUtils.init(lArr1, 6L);

        i5 = 139;
        do {
            lArr1[i5] = i5;
            i6 = 1;
            while (++i6 < 11) {
                s1 += (short) (0 + (i6 * i6));
                for (i7 = 1; i7 < 1; i7++) {
                    i8 ^= (int) Test0034.instanceCount;
                    i8 += (int) Test0034.instanceCount;
                }
                i8 *= (int) Test0034.instanceCount;
                f *= 2;
                for (i9 = i6; 1 > i9; ++i9) {
                    i8 += (-114 + (i9 * i9));
                    i8 = (int) Test0034.instanceCount;
                    i10 *= i6;
                    i8 *= i7;
                }
                i10 += i6;
            }
        } while (--i5 > 0);
        vMeth_check_sum += i5 + i6 + s1 + i7 + i8 + Float.floatToIntBits(f) + i9 + i10 + FuzzerUtils.checkSum(lArr1);
    }

    public static boolean bMeth(long l) {

        int i11 = 37042;
        int i12 = -12;
        int i13 = -114;
        int i14 = 9;
        int[] iArr1 = new int[N];
        double d1 = 0.73636, d2 = -124.64920;
        short[] sArr = new short[N];
        long[] lArr2 = new long[N];

        FuzzerUtils.init(iArr1, 34460);
        FuzzerUtils.init(sArr, (short) 17679);
        FuzzerUtils.init(lArr2, 569123727L);

        vMeth();
        Test0034.instanceCount -= -5809419592669432920L;
        for (i11 = 11; i11 < 327; ++i11) {
            iArr1[i11 - 1] = i12;
            Test0034.instanceCount = Test0034.instanceCount;
            for (d1 = 5; d1 > 1; d1--) {
                i14 = 1;
                while (++i14 < 2) {
                    sArr[i14 - 1] >>>= (short) 9;
                    iArr1[i11] ^= i12;
                    Test0034.fFld -= -181;
                    i12 = i13;
                    lArr2[i14 - 1] -= i14;
                    d2 *= -251;
                }
                i13 = i13;
                i12 += (int) ((long) d1 ^ Test0034.sFld);
            }
        }
        long meth_res = l + i11 + i12 + Double.doubleToLongBits(d1) + i13 + i14 + Double.doubleToLongBits(d2) +
                FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(lArr2);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static int iMeth() {

        boolean b = false;
        int i15 = 7441, i16 = 166, i17 = -52931, i18 = 1599, i19 = -9, i20 = -66;
        float[] fArr = new float[N];

        FuzzerUtils.init(fArr, -106.675F);

        b = bMeth(Test0034.instanceCount);
        b = false;
        i15 += (int) Test0034.instanceCount;
        i16 = 1;
        do {
            i15 += (i16 * i16);
            for (i17 = 1; i17 < 11; ++i17) {
                i18 >>>= i16;
                Test0034.fFld -= i17;
                fArr[i16] = -2.321F;
                i18 -= (int) -1.375F;
                for (i19 = 1; 2 > i19; i19++) {
                    i20 ^= (int) Test0034.instanceCount;
                    if (b) {
                        Test0034.instanceCount = i19;
                        i18 += i15;
                    }
                }
            }
        } while (++i16 < 148);
        long meth_res = (b ? 1 : 0) + i15 + i16 + i17 + i18 + i19 + i20 +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0034 _instance = new Test0034();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = -5;
        int i1 = 56521;
        int i2 = 19251;
        int i3 = 101;
        int i4 = 4;
        int[] iArr = new int[N];
        short s = 22144;
        double d = -115.77573, d3 = -2.14233;
        boolean b1 = true;
        long[] lArr = new long[N];

        FuzzerUtils.init(iArr, 40316);
        FuzzerUtils.init(lArr, 2877028899L);

        for (i = 10; i < 254; i++) {
            Test0034.instanceCount = iArr[i];
            i1 = ((i1 * Math.abs(i1)) + s);
            for (d = 4; 103 > d; d++) {
                i1 += (int) ((long) d ^ i);
                i1 -= (int) (Math.max(i2, (int) (i1 + Test0034.instanceCount)) - lArr[i]);
                iArr[(int) (d - 1)] -= i2;
                for (i3 = 1; i3 < 2; i3++) {
                    iArr[(int) (d + 1)] &= iMeth();
                    i1 = i2;
                    i2 = i1;
                    iArr[i] <<= i4;
                    switch (((i3 % 10) * 5) + 37) {
                        case 43:
                        case 75:
                            iArr[i - 1] += -24815;
                            if (b1) continue;
                            Test0034.instanceCount *= i;
                            Test0034.instanceCount = 46104;
                            break;
                        case 64:
                        case 71:
                            i4 = i2;
                            Test0034.fFld += (138 + (i3 * i3));
                            break;
                        case 46:
                            i2 = (int) 24382L;
                            break;
                        case 42:
                            Test0034.fFld = i1;
                            Test0034.instanceCount -= (long) Test0034.fFld;
                            i2 -= i3;
                            switch ((int) (((d % 1) * 5) + 111)) {
                                case 116:
                                    i4 >>= (int) Test0034.instanceCount;
                                    i4 = i1;
                                    i4 = i3;
                                    Test0034.fFld %= (i2 | 1);
                                default:
                                    d3 -= i4;
                            }
                        case 61:
                            i4 = i1;
                        case 79:
                            i1 -= i2;
                            break;
                        case 62:
                            iArr = iArr;
                            break;
                        case 39:
                            i4 |= i;
                            break;
                        default:
                            Test0034.instanceCount = i;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 s = " + i + "," + i1 + "," + s);
        FuzzerUtils.out.println("d i2 i3 = " + Double.doubleToLongBits(d) + "," + i2 + "," + i3);
        FuzzerUtils.out.println("i4 b1 d3 = " + i4 + "," + (b1 ? 1 : 0) + "," + Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("iArr lArr = " + FuzzerUtils.checkSum(iArr) + "," + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test0034.instanceCount Test0034.fFld Test0034.sFld = " + Test0034.instanceCount + "," +
                Float.floatToIntBits(Test0034.fFld) + "," + Test0034.sFld);

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  bMeth ->  bMeth iMeth mainTest
//DEBUG  vMeth ->  vMeth bMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
