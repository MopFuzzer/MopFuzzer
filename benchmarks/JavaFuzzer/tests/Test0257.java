// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:59 2023
public class Test0257 {

    public static final int N = 400;

    public static long instanceCount = -46201L;
    public static byte byFld = -35;
    public static volatile double[] dArrFld = new double[N];
    public static int[][] iArrFld = new int[N][N];
    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0257.dArrFld, -49.39989);
        FuzzerUtils.init(Test0257.iArrFld, 198);
    }

    public short sFld = -29880;

    public static void vSmallMeth() {

        int i = 119;
        double d = -1.127754;

        i -= (int) (d++);
        vSmallMeth_check_sum += i + Double.doubleToLongBits(d);
    }

    public static void vMeth1(float f2) {


        Test0257.iArrFld = Test0257.iArrFld;
        vMeth1_check_sum += Float.floatToIntBits(f2);
    }

    public static int iMeth(int i4) {

        int i5 = -52;
        int i6 = 105;
        int i7 = -27592;
        int i8 = -62257;
        int i9 = -12;
        int i10 = -11;
        int i11 = 59122;
        int i12 = -13;
        int[][] iArr = new int[N][N];
        float f1 = 1.83F;
        float[] fArr = new float[N];
        double d1 = 127.97240;

        FuzzerUtils.init(fArr, 1.135F);
        FuzzerUtils.init(iArr, -11);

        for (i5 = 15; 343 > i5; i5++) {
            fArr[i5] = (++i6);
        }
        i7 = 1;
        do {
            iArr[i7 - 1][i7 - 1] -= (int) Math.abs(++f1);
            if (i5 != 0) {
            }
            vMeth1(f1);
        } while ((i7 += 3) < 169);
        Test0257.iArrFld[(i4 >>> 1) % N][(i4 >>> 1) % N] &= -8;
        Test0257.instanceCount >>= i7;
        for (i8 = 9; i8 < 148; ++i8) {
            i6 = i9;
            i10 = 1;
            while (++i10 < 11) {
                Test0257.instanceCount = (long) -2.5981;
            }
            for (i11 = 1; i11 < 11; i11 += 2) {
                i12 = Test0257.byFld;
            }
            d1 %= (i7 | 1);
        }
        long meth_res = i4 + i5 + i6 + i7 + Float.floatToIntBits(f1) + i8 + i9 + i10 + i11 + i12 +
                Double.doubleToLongBits(d1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
                FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth(long l, float f) {

        long l1 = -42158L;
        long[][] lArr = new long[N][N];
        int i3 = 33261, i13 = 243, i14 = -18;
        short s = 3186;
        boolean b = false;

        FuzzerUtils.init(lArr, 14L);

        for (l1 = 9; l1 < 190; ++l1) {
            i3 = (int) (lArr[(int) (l1)][(int) (l1)] + s);
            i3 *= (int) (Test0257.dArrFld[(int) (l1)] * iMeth(i3));
            f += l1;
            i3 = s;
            if (b) break;
            Test0257.byFld = (byte) i3;
        }
        i13 = 1;
        while (++i13 < 284) {
            Test0257.iArrFld[i13 - 1][i13] += i3;
            i14 = 1;
            do {
                double d2 = -44.25520;
                l = (long) d2;
                if (i3 != 0) {
                    vMeth_check_sum += l + Float.floatToIntBits(f) + l1 + i3 + s + (b ? 1 : 0) + i13 + i14 +
                            FuzzerUtils.checkSum(lArr);
                    return;
                }
                d2 = i13;
                l = i3;
            } while (++i14 < 6);
            i3 <<= (int) -7L;
        }
        vMeth_check_sum += l + Float.floatToIntBits(f) + l1 + i3 + s + (b ? 1 : 0) + i13 + i14 +
                FuzzerUtils.checkSum(lArr);
    }

    public static void main(String[] strArr) {

        try {
            Test0257 _instance = new Test0257();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i1 = 253, i2 = 10, i15 = -23921, i16 = 11, i17 = -1;
        float f3 = -13.230F;
        float f4 = 89.187F;
        float[] fArr1 = new float[N];
        double d3 = -118.116735;
        boolean b1 = true;
        long l2 = 4675966934878506802L;

        FuzzerUtils.init(fArr1, 0.967F);

        for (int smallinvoc = 0; smallinvoc < 669; smallinvoc++) vSmallMeth();
        for (i1 = 10; i1 < 245; ++i1) {
            vMeth(Test0257.instanceCount, f3);
            Test0257.instanceCount *= (long) -1.29469;
            for (i15 = i1; 107 > i15; ++i15) {
                if (false) break;
                d3 = i1;
                Test0257.dArrFld[i1 + 1] = 70;
                switch ((((i15 >>> 1) % 9) * 5) + 78) {
                    case 87:
                        i16 += (int) f3;
                        i16 += (i15 ^ (long) f3);
                        break;
                    case 90:
                        for (f4 = 1; f4 < 1; f4++) {
                            Test0257.instanceCount = i2;
                            Test0257.instanceCount -= Test0257.instanceCount;
                            i16 = -2;
                            f3 = i17;
                            i16 >>= i17;
                            i17 += i17;
                            Test0257.instanceCount = Test0257.instanceCount;
                        }
                        if (b1) continue;
                        i16 |= i17;
                        Test0257.instanceCount = Test0257.instanceCount;
                        break;
                    case 112:
                        i2 += i15;
                        i16 = sFld;
                        i17 &= (int) Test0257.instanceCount;
                        i17 += (i15 * i15);
                        break;
                    case 80:
                        Test0257.iArrFld[i1 - 1][i15] = (int) Test0257.instanceCount;
                        l2 = 1;
                        do {
                            fArr1 = FuzzerUtils.float1array(N, (float) 0.253F);
                            i17 ^= i16;
                        } while (++l2 < 1);
                        break;
                    case 116:
                        i17 = (int) d3;
                        break;
                    case 111:
                        f3 -= -41790;
                        break;
                    case 103:
                        Test0257.instanceCount -= 35;
                        break;
                    case 119:
                        i2 += i15;
                        break;
                    case 88:
                        Test0257.iArrFld[i15][i15 - 1] += (int) -8L;
                        break;
                    default:
                        Test0257.instanceCount = i15;
                }
            }
        }

        FuzzerUtils.out.println("i1 i2 f3 = " + i1 + "," + i2 + "," + Float.floatToIntBits(f3));
        FuzzerUtils.out.println("i15 i16 d3 = " + i15 + "," + i16 + "," + Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("f4 i17 b1 = " + Float.floatToIntBits(f4) + "," + i17 + "," + (b1 ? 1 : 0));
        FuzzerUtils.out.println("l2 fArr1 = " + l2 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));

        FuzzerUtils.out.println("Test0257.instanceCount Test0257.byFld sFld = " + Test0257.instanceCount + "," + Test0257.byFld + "," +
                sFld);
        FuzzerUtils.out.println("Test0257.dArrFld Test0257.iArrFld = " +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0257.dArrFld)) + "," + FuzzerUtils.checkSum(Test0257.iArrFld));

        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
