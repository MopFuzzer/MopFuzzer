// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:03 2023
public class Test0410 {

    public static final int N = 400;

    public static long instanceCount = -3878533395L;
    public static volatile double dFld = 0.65192;
    public static boolean bFld = false;
    public static byte byFld = -104;
    public static int[] iArrFld = new int[N];
    public static long[][] lArrFld = new long[N][N];
    public static byte[] byArrFld = new byte[N];
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0410.iArrFld, -64863);
        FuzzerUtils.init(Test0410.lArrFld, -1990289180377917532L);
        FuzzerUtils.init(Test0410.byArrFld, (byte) 73);
    }

    public static void vMeth1(int i2, long l, float f) {

        int i3 = -92, i4 = -13, i5 = -20045;
        float f1 = -2.304F;
        float[] fArr = new float[N];

        FuzzerUtils.init(fArr, 66.89F);

        for (i3 = 19; i3 < 340; ++i3) {
            for (f1 = i3; f1 < 5; ++f1) {
                if (i3 != 0) {
                    vMeth1_check_sum += i2 + l + Float.floatToIntBits(f) + i3 + i4 + Float.floatToIntBits(f1) + i5 +
                            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                    return;
                }
                i4 += (int) (-49.743F + (f1 * f1));
                Test0410.bFld = Test0410.bFld;
                switch ((i3 % 1) + 94) {
                    case 94:
                        Test0410.iArrFld[(int) (f1 - 1)] -= i3;
                        i2 += i3;
                        break;
                    default:
                        i4 >>= i2;
                        fArr[(int) (f1 - 1)] += i5;
                        Test0410.iArrFld[i3] ^= i2;
                        i5 /= (int) (l | 1);
                }
                fArr[(int) (f1)] *= 197;
            }
            Test0410.lArrFld[i3 + 1][i3 - 1] += (long) f1;
            f = i3;
        }
        vMeth1_check_sum += i2 + l + Float.floatToIntBits(f) + i3 + i4 + Float.floatToIntBits(f1) + i5 +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static int iMeth() {

        int i6 = -193, i7 = -14, i8 = 180, i9 = 14;
        double d = 44.22813;
        float f2 = 0.136F;
        float[] fArr1 = new float[N];

        FuzzerUtils.init(fArr1, -46.604F);

        vMeth1(i6, Test0410.instanceCount, 67.283F);
        for (d = 3; 135 > d; ++d) {
            Test0410.iArrFld[(int) (d - 1)] -= i7;
            i7 += (int) (d * i6);
            i7 *= (int) d;
            if (i6 != 0) {
            }
            i8 = (int) -18.41788;
            i6 = 426;
            fArr1[(int) (d)] += i8;
            Test0410.byFld = (byte) i7;
            i9 = 1;
            do {
                i7 -= i7;
                i7 = (int) f2;
                Test0410.instanceCount = i7;
                Test0410.byArrFld[i9 - 1] *= (byte) i9;
            } while (++i9 < 12);
        }
        long meth_res = i6 + Double.doubleToLongBits(d) + i7 + i8 + i9 + Float.floatToIntBits(f2) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth(int i1) {


        i1 <<= iMeth();
        vMeth_check_sum += i1;
    }

    public static void main(String[] strArr) {

        try {
            Test0410 _instance = new Test0410();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = 4, i10 = 12, i11 = 79, i12 = -50, i13 = 16, i14 = -39595, i16 = 12202, i17 = -166, i18 = -128, i19 = -44074;
        short s = 18187;
        float f3 = -16.909F, f4 = 37.805F;

        Test0410.instanceCount -= (long) (i - (Test0410.dFld++));
        vMeth(6413);
        Test0410.iArrFld[(i >>> 1) % N] <<= i;
        for (i10 = 355; i10 > 13; i10--) {
            s += (short) (i10 ^ i11);
        }
        i <<= i10;
        for (i12 = 15; i12 < 286; i12++) {
            f3 /= ((long) (f3) | 1);
            Test0410.lArrFld[i12][i12 - 1] *= (long) f3;
            i <<= (int) Test0410.instanceCount;
            i11 += i13;
            Test0410.instanceCount *= Test0410.instanceCount;
        }
        i14 = 1;
        do {
            i13 *= i14;
            Test0410.instanceCount = i;
            Test0410.instanceCount += i11;
            i13 |= i14;
        } while (++i14 < 292);
        i -= (int) f3;
        if (true) {
            for (i16 = 13; i16 < 279; i16++) {
                i = (int) 49264L;
                f3 = 0;
                i13 = i;
                if (Test0410.bFld) break;
                Test0410.lArrFld[i16 - 1][i16] = i12;
                i11 -= (int) Test0410.instanceCount;
                Test0410.lArrFld[i16][i16 + 1] += i16;
                for (i18 = i16; i18 < 94; ++i18) {
                    Test0410.iArrFld[i18] = i;
                    f3 -= f3;
                }
            }
        } else if (true) {
            Test0410.lArrFld[(155 >>> 1) % N][(i >>> 1) % N] |= Test0410.instanceCount;
        } else if (true) {
            f4 += i16;
        } else {
            i17 |= (int) Test0410.instanceCount;
        }

        FuzzerUtils.out.println("i i10 i11 = " + i + "," + i10 + "," + i11);
        FuzzerUtils.out.println("s i12 i13 = " + s + "," + i12 + "," + i13);
        FuzzerUtils.out.println("f3 i14 i16 = " + Float.floatToIntBits(f3) + "," + i14 + "," + i16);
        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("f4 = " + Float.floatToIntBits(f4));

        FuzzerUtils.out.println("Test0410.instanceCount Test0410.dFld Test0410.bFld = " + Test0410.instanceCount + "," +
                Double.doubleToLongBits(Test0410.dFld) + "," + (Test0410.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0410.byFld Test0410.iArrFld Test0410.lArrFld = " + Test0410.byFld + "," +
                FuzzerUtils.checkSum(Test0410.iArrFld) + "," + FuzzerUtils.checkSum(Test0410.lArrFld));
        FuzzerUtils.out.println("Test0410.byArrFld = " + FuzzerUtils.checkSum(Test0410.byArrFld));

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