// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:06 2023
public class Test0544 {

    public static final int N = 400;

    public static long instanceCount = 198L;
    public static boolean bFld = false;
    public static volatile float fFld = 59.285F;
    public static short sFld = 11037;
    public static int[] iArrFld = new int[N];
    public static int[][] iArrFld1 = new int[N][N];
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0544.iArrFld, 8);
        FuzzerUtils.init(Test0544.iArrFld1, -10);
    }

    public int iFld = -37081;
    public int[][] iArrFld2 = new int[N][N];

    public static int iMeth1() {

        int i6 = 0, i7 = -2, i8 = 160, i9 = 4422;
        boolean[] bArr = new boolean[N];

        FuzzerUtils.init(bArr, false);

        bArr[(-86 >>> 1) % N] = Test0544.bFld;
        for (i6 = 10; i6 < 245; i6++) {
            i7 = (int) Test0544.fFld;
            for (i8 = i6; i8 < 7; ++i8) {
                Test0544.fFld = i8;
                Test0544.instanceCount += (((i8 * Test0544.sFld) + Test0544.instanceCount) - i7);
                i9 += i8;
                Test0544.instanceCount += (i8 + i6);
                i9 = (int) Test0544.instanceCount;
                i9 = i8;
                Test0544.instanceCount = Test0544.instanceCount;
            }
            Test0544.fFld += (i6 + i6);
            i9 -= i9;
            i9 *= (int) -1.94702;
            i9 += i7;
        }
        long meth_res = i6 + i7 + i8 + i9 + FuzzerUtils.checkSum(bArr);
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth(float f2) {

        int i3 = 7, i4 = -54, i5 = 5, i10 = 43956, i11 = 152, i12 = -8;
        boolean b = true;
        float f3 = 0.53F;
        float f4 = -121.440F;
        float[] fArr1 = new float[N];
        byte by = -29;
        long[] lArr = new long[N];

        FuzzerUtils.init(fArr1, 0.957F);
        FuzzerUtils.init(lArr, 13L);

        f2 = Math.abs(fArr1[(i3 >>> 1) % N]);
        for (i4 = 9; i4 < 360; i4++) {
            if (b = (i3 == iMeth1())) break;
        }
        Test0544.iArrFld[(i4 >>> 1) % N] += i4;
        i10 = 360;
        do {
            f3 = 1;
            while (++f3 < 5) {
                i11 = 1;
                do {
                    if (Test0544.bFld) continue;
                    by = (byte) 62324;
                } while (++i11 < 1);
                Test0544.instanceCount += 4;
                for (f4 = 1; f4 < 1; f4++) {
                    i3 += (int) f4;
                    lArr = lArr;
                    i3 = -8675;
                    i3 -= (int) Test0544.instanceCount;
                }
            }
        } while (--i10 > 0);
        vMeth_check_sum += Float.floatToIntBits(f2) + i3 + i4 + i5 + (b ? 1 : 0) + i10 + Float.floatToIntBits(f3) + i11
                + by + Float.floatToIntBits(f4) + i12 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) +
                FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth(float f1, long l) {

        long l1 = -1696618430250459757L;
        long[] lArr1 = new long[N];
        int i1 = 6, i2 = -11, i13 = -14, i14 = 15, i15 = 36, i16 = -164;
        double d = -1.78880;
        float f5 = 78.928F;

        FuzzerUtils.init(lArr1, -1L);

        for (l1 = 20; l1 < 347; l1++) {
            for (d = 1; d < 5; d++) {
                vMeth(Test0544.fFld);
                for (i13 = 2; i13 > 1; --i13) {
                    i2 += i13;
                    if (Test0544.bFld) continue;
                }
                Test0544.iArrFld[(int) (d)] %= (int) -124.924F;
                for (i15 = 1; i15 < 2; i15++) {
                    i14 += Test0544.sFld;
                    if (Test0544.bFld) continue;
                    switch ((int) (((l1 % 1) * 5) + 67)) {
                        case 69:
                        default:
                            Test0544.fFld -= i2;
                            i2 += i1;
                            lArr1[(int) (d)] += (long) f5;
                    }
                    Test0544.iArrFld1 = Test0544.iArrFld1;
                }
            }
        }
        long meth_res = Float.floatToIntBits(f1) + l + l1 + i1 + Double.doubleToLongBits(d) + i2 + i13 + i14 + i15 +
                i16 + Float.floatToIntBits(f5) + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0544 _instance = new Test0544();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        float f = 1.846F;
        float[][] fArr = new float[N][N];
        int i = 224;
        int i17 = 17544;
        int i18 = -28;
        int i19 = -6;
        int i20 = -13;
        int i21 = -12;
        int i22 = -25407;
        int i23 = 1923;
        int i24 = -20980;
        int i25 = -8;
        int[] iArr = new
                int[N];
        double d1 = 1.81332;

        FuzzerUtils.init(fArr, 1.263F);
        FuzzerUtils.init(iArr, 232);

        fArr[(iFld >>> 1) % N][(iFld >>> 1) % N] += Math.abs((int) (iFld - (++f)));
        i = 231;
        do {
            iArr[i - 1] -= iMeth(f, -49978L);
            Test0544.fFld = Test0544.instanceCount;
            Test0544.instanceCount += i;
            iFld -= 13;
            i17 >>= iFld;
            i17 &= iFld;
        } while ((i -= 3) > 0);
        Test0544.instanceCount = iFld;
        iFld = i17;
        iFld = i;
        iFld += (int) Test0544.instanceCount;
        Test0544.instanceCount -= i;
        for (i18 = 3; i18 < 344; i18++) {
            Test0544.iArrFld[i18 - 1] = i;
        }
        Test0544.instanceCount *= Test0544.instanceCount;
        d1 += iFld;
        d1 *= i17;
        iArrFld2[(i >>> 1) % N][(i18 >>> 1) % N] <<= (int) Test0544.instanceCount;
        i19 = i;
        for (i20 = 22; i20 < 352; i20 += 3) {
            iFld += (i20 * i20);
            for (i22 = 228; i22 > 10; i22 -= 2) {
                for (i24 = 1; 3 > i24; i24++) {
                    iArr[i20 - 1] = Test0544.sFld;
                    if (Test0544.bFld) continue;
                    i23 += (((i24 * i20) + i25) - i17);
                    Test0544.instanceCount *= Test0544.instanceCount;
                    i17 += (-9 + (i24 * i24));
                    Test0544.sFld += (short) (((i24 * i23) + Test0544.instanceCount) - iFld);
                }
            }
        }

        FuzzerUtils.out.println("f i i17 = " + Float.floatToIntBits(f) + "," + i + "," + i17);
        FuzzerUtils.out.println("i18 i19 d1 = " + i18 + "," + i19 + "," + Double.doubleToLongBits(d1));
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("fArr iArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + "," +
                FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test0544.instanceCount iFld Test0544.bFld = " + Test0544.instanceCount + "," + iFld + "," +
                (Test0544.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0544.fFld Test0544.sFld Test0544.iArrFld = " + Float.floatToIntBits(Test0544.fFld) + "," +
                Test0544.sFld + "," + FuzzerUtils.checkSum(Test0544.iArrFld));
        FuzzerUtils.out.println("Test0544.iArrFld1 iArrFld2 = " + FuzzerUtils.checkSum(Test0544.iArrFld1) + "," +
                FuzzerUtils.checkSum(iArrFld2));

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
