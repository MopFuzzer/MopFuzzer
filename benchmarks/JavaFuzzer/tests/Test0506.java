// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:05 2023
public class Test0506 {

    public static final int N = 400;

    public static long instanceCount = 186L;
    public static int iFld = 219;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;
    public float fFld = -1.843F;
    public short sFld = -2526;
    public volatile int[] iArrFld = new int[N];
    public volatile double[] dArrFld = new double[N];

    public static void vMeth2(double d1, int i5, int i6) {

        int i7 = 14100;
        int i8 = -161;
        int i9 = -24372;
        int i10 = 30344;
        int i11 = -32430;
        int i12 = 53253;
        int[] iArr = new int[N];
        float f = -65.165F, f1 = 1.847F;
        short s = 5439;
        long[] lArr1 = new long[N];
        boolean[] bArr = new boolean[N];

        FuzzerUtils.init(lArr1, 3444793538773799534L);
        FuzzerUtils.init(iArr, -20);
        FuzzerUtils.init(bArr, true);

        for (i7 = 7; i7 < 246; i7 += 3) {
            for (i9 = 1; i9 < 19; ++i9) {
                d1 += f;
                i8 += i9;
                Test0506.instanceCount -= (long) d1;
                lArr1[i9 + 1] = -160;
                d1 *= Test0506.instanceCount;
                try {
                    i10 = (Test0506.iFld / i10);
                    i10 = (iArr[i9 - 1] / i7);
                    Test0506.iFld = (i6 % Test0506.iFld);
                } catch (ArithmeticException a_e) {
                }
                lArr1 = lArr1;
                i8 += (((i9 * Test0506.instanceCount) + i10) - i9);
                Test0506.iFld += (i9 - i10);
                bArr[i9 - 1] = true;
            }
        }
        for (i11 = 4; 363 > i11; ++i11) {
            s = (short) f1;
            iArr[i11] -= (int) f;
        }
        vMeth2_check_sum += Double.doubleToLongBits(d1) + i5 + i6 + i7 + i8 + i9 + i10 + Float.floatToIntBits(f) + i11
                + i12 + s + Float.floatToIntBits(f1) + FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr) +
                FuzzerUtils.checkSum(bArr);
    }

    public static void vMeth1(int i4, long l) {

        byte by = -69;
        double d2 = 0.128743;
        int i13 = -10, i14 = -231;

        i4 = (Short.reverseBytes((short) (by * Test0506.instanceCount)) + i4);
        vMeth2(d2, 6443, i4);
        i4 += (int) 20596L;
        i13 = 1;
        do {
            i14 = 1;
            while (++i14 < 9) {
                i4 -= (int) Test0506.instanceCount;
            }
        } while (++i13 < 178);
        Test0506.iFld *= i4;
        Test0506.instanceCount *= i4;
        vMeth1_check_sum += i4 + l + by + Double.doubleToLongBits(d2) + i13 + i14;
    }

    public static void main(String[] strArr) {

        try {
            Test0506 _instance = new Test0506();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void vMeth(int i1, int i2, int i3) {


        i1 >>= (++iArrFld[(i1 >>> 1) % N]);
        vMeth1(i1, Test0506.instanceCount);
        vMeth_check_sum += i1 + i2 + i3;
    }

    public void mainTest(String[] strArr1) {

        int i = -111, i15 = 45600, i16 = -11, i17 = 12, i18 = 254;
        double d = -2.71836, d3 = 112.35251;
        long l1 = 29707L;
        long[] lArr = new long[N];
        byte[] byArr = new byte[N];

        FuzzerUtils.init(lArr, 56598L);
        FuzzerUtils.init(byArr, (byte) 39);

        iArrFld[(i >>> 1) % N] = (int) -20121L;
        d = 1;
        while (++d < 319) {
            lArr[(int) (d + 1)] >>= (i--);
            i /= (int) (i | 1);
            vMeth(i, Test0506.iFld, i);
            i = i;
        }
        Test0506.iFld = (int) fFld;
        for (i15 = 14; i15 < 277; i15 += 3) {
            switch ((i15 % 1) + 66) {
                case 66:
                    iArrFld[i15 + 1] = i;
                    lArr[i15] += i;
                    Test0506.iFld <<= (int) Test0506.instanceCount;
                    for (l1 = 288; 5 < l1; l1 -= 2) {
                        i16 = (int) fFld;
                        fFld += i16;
                        i18 = 1;
                        while (++i18 < 3) {
                            Test0506.iFld += (((i18 * i15) + i15) - Test0506.iFld);
                            switch ((((14 >>> 1) % 2) * 5) + 14) {
                                case 20:
                                    i17 += (i18 ^ Test0506.instanceCount);
                                    i16 += (int) fFld;
                                    break;
                                case 24:
                                    dArrFld[i18 + 1] -= i17;
                                    Test0506.iFld += Test0506.iFld;
                                    break;
                                default:
                                    sFld |= (short) Test0506.instanceCount;
                                    Test0506.iFld = i;
                                    fFld *= 6;
                                    i = 28713;
                            }
                            byArr[i15 + 1] = (byte) -63297;
                            i = i15;
                        }
                    }
                    break;
            }
            i16 += (i15 - Test0506.instanceCount);
            d3 -= fFld;
        }

        FuzzerUtils.out.println("i d i15 = " + i + "," + Double.doubleToLongBits(d) + "," + i15);
        FuzzerUtils.out.println("i16 l1 i17 = " + i16 + "," + l1 + "," + i17);
        FuzzerUtils.out.println("i18 d3 lArr = " + i18 + "," + Double.doubleToLongBits(d3) + "," +
                FuzzerUtils.checkSum(lArr));
        FuzzerUtils.out.println("byArr = " + FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test0506.instanceCount Test0506.iFld fFld = " + Test0506.instanceCount + "," + Test0506.iFld + "," +
                Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("sFld iArrFld dArrFld = " + sFld + "," + FuzzerUtils.checkSum(iArrFld) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));

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
