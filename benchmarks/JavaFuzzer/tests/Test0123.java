// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:55 2023
public class Test0123 {

    public static final int N = 400;

    public static long instanceCount = 75L;
    public static double dFld = -1.86972;
    public static volatile float fFld = 25.848F;
    public static long[] lArrFld = new long[N];
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0123.lArrFld, -1097835881L);
    }

    public static void vMeth1(int i2, long l, int i3) {

        int i4 = -41954;
        int i5 = -102;
        int i6 = -4;
        int i7 = -21012;
        int i8 = -34010;
        int i9 = -27;
        int i10 = 19787;
        int i11 = 6;
        int i12 = 0;
        int i13 = -5;
        int[][] iArr1 = new
                int[N][N];
        float f1 = -2.523F;
        boolean b = true;

        FuzzerUtils.init(iArr1, -25538);

        try {
            i3 -= i3;
            for (i4 = 2; 249 > i4; ++i4) {
                Test0123.instanceCount &= l;
            }
            i5 ^= i4;
            i3 = (int) l;
            for (f1 = 9; 244 > f1; f1++) {
                for (i7 = 1; 7 > i7; i7 += 2) {
                    for (i9 = 1; i9 < 3; i9++) {
                        if (b) continue;
                        i3 += (i9 * i9);
                    }
                    l *= i3;
                    for (i11 = 1; 3 > i11; i11 += 3) {
                        iArr1[i7 - 1][i7 + 1] -= (int) f1;
                        l += (i11 * i11);
                    }
                }
            }
        } catch (NegativeArraySizeException exc1) {
            i13 -= (int) Test0123.dFld;
        }
        vMeth1_check_sum += i2 + l + i3 + i4 + i5 + Float.floatToIntBits(f1) + i6 + i7 + i8 + i9 + i10 + (b ? 1 : 0) +
                i11 + i12 + i13 + FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth() {

        int i14 = -78, i15 = 138;
        byte by = -107;
        byte[] byArr = new byte[N];
        short s = -2248, s1 = 22368;
        float f2 = 1.103F, f3 = 42.832F;
        boolean b1 = true;
        double[] dArr = new double[N];

        FuzzerUtils.init(byArr, (byte) -44);
        FuzzerUtils.init(dArr, 2.98360);

        vMeth1(i14, Test0123.instanceCount, i14);
        i14 >>>= i14;
        Test0123.instanceCount = Test0123.instanceCount;
        by = (byte) i15;
        byArr[(10 >>> 1) % N] = (byte) i14;
        Test0123.lArrFld = Test0123.lArrFld;
        s += (short) i15;
        i14 = (int) Test0123.instanceCount;
        f2 = 5L;
        i15 += (int) 16668L;
        f3 = 1;
        do {
            i14 = i14;
            if (b1) {
                dArr[(int) (f3 + 1)] = Test0123.instanceCount;
                i15 *= i14;
            } else {
                i14 = s1;
            }
        } while (++f3 < 178);
        long meth_res = i14 + by + i15 + s + Float.floatToIntBits(f2) + Float.floatToIntBits(f3) + (b1 ? 1 : 0) + s1 +
                FuzzerUtils.checkSum(byArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth() {

        float f = -38.515F;
        int i16 = -22, i17 = -8, i18 = 0, i19 = 9;
        long l1 = 50601L;
        boolean b2 = true;
        short s2 = 27037;

        f += iMeth();
        Test0123.instanceCount *= i16;
        i16 = 12;
        i16 = i16;
        Test0123.instanceCount ^= -7;
        Test0123.instanceCount *= i16;
        for (i17 = 4; i17 < 228; ++i17) {
            i18 += (((i17 * i16) + f) - i16);
            f = Test0123.instanceCount;
            for (l1 = 7; l1 > 1; l1 -= 3) {
                if (b2) continue;
                if (b2) break;
                i19 >>>= -30;
                i16 += (int) (((l1 * l1) + i18) - i19);
                s2 <<= (short) -66;
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f) + i16 + i17 + i18 + l1 + i19 + (b2 ? 1 : 0) + s2;
    }

    public static void main(String[] strArr) {

        try {
            Test0123 _instance = new Test0123();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = 24517;
        int i1 = -5;
        int i21 = -43802;
        int i22 = 7;
        int i23 = -439;
        int[] iArr = new int[N];
        long l2 = -9L;
        byte by1 = -100;
        boolean b3 = false;
        short s3 = 9503;
        float f4 = 0.1010F;

        FuzzerUtils.init(iArr, -130);

        for (i = 1; 330 > i; i++) {
            iArr[i] >>>= 179;
            Test0123.instanceCount += (i * i1);
        }
        vMeth();
        Test0123.instanceCount += 121;
        i1 *= i;
        i1 += i1;
        l2 = 1;
        while (++l2 < 239) {
            if (b3) {
                i1 >>= (int) Test0123.instanceCount;
                Test0123.instanceCount -= by1;
            }
        }
        for (int i20 : iArr) {
            i20 -= (int) 1.129528;
            iArr[(i >>> 1) % N] <<= -71;
            iArr[(i1 >>> 1) % N] += s3;
            for (i21 = 2; i21 < 63; i21++) {
                i22 += (((i21 * i22) + i21) - i21);
                Test0123.instanceCount = -6;
                Test0123.fFld *= Test0123.instanceCount;
                i1 /= (int) -101L;
                i20 -= (int) Test0123.dFld;
                i20 <<= -29488;
                for (f4 = i21; f4 < 2; f4++) {
                    Test0123.instanceCount = 62351;
                    i23 += (int) l2;
                    Test0123.fFld -= Test0123.instanceCount;
                    i23 = i20;
                    i22 = (int) Test0123.instanceCount;
                    s3 *= (short) -12;
                    Test0123.instanceCount = l2;
                }
            }
        }

        FuzzerUtils.out.println("i i1 l2 = " + i + "," + i1 + "," + l2);
        FuzzerUtils.out.println("by1 b3 s3 = " + by1 + "," + (b3 ? 1 : 0) + "," + s3);
        FuzzerUtils.out.println("i21 i22 f4 = " + i21 + "," + i22 + "," + Float.floatToIntBits(f4));
        FuzzerUtils.out.println("i23 iArr = " + i23 + "," + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test0123.instanceCount Test0123.dFld Test0123.fFld = " + Test0123.instanceCount + "," +
                Double.doubleToLongBits(Test0123.dFld) + "," + Float.floatToIntBits(Test0123.fFld));
        FuzzerUtils.out.println("Test0123.lArrFld = " + FuzzerUtils.checkSum(Test0123.lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
