// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:17 2023
public class Test0962 {

    public static final int N = 400;

    public static long instanceCount = 1370261888L;
    public static volatile int iFld = -32645;
    public static double dFld = -90.128162;
    public static int[][] iArrFld = new int[N][N];
    public static long byMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0962.iArrFld, -3);
    }

    public static void vMeth() {

        int i4 = 47892;
        int i6 = 31767;
        int[] iArr = new int[N];
        float f1 = -2.554F;
        double d = 69.56634;
        double[] dArr = new double[N];
        double[][] dArr1 = new double[N][N];
        long[][] lArr = new long[N][N];

        FuzzerUtils.init(iArr, 10);
        FuzzerUtils.init(dArr, 1.21775);
        FuzzerUtils.init(lArr, 4L);
        FuzzerUtils.init(dArr1, -127.84174);

        i4 += i4;
        switch (((41 >>> 1) % 10) * 5) {
            case 25:
            case 24:
                try {
                    for (int i5 : iArr) {
                        long l1 = -44816L;
                        i5 >>= (int) l1;
                        i4 <<= (int) Test0962.instanceCount;
                        i4 += 14;
                    }
                    i4 &= i4;
                    i4 *= (int) Test0962.instanceCount;
                } catch (UserDefinedExceptionTest0962 exc2) {
                    i4 += i4;
                }
                for (f1 = 22; f1 < 380; f1++) {
                    dArr[(int) (f1 - 1)] = f1;
                    i6 = -120;
                    i4 = i6;
                    iArr[(int) (f1 - 1)] <<= (int) Test0962.instanceCount;
                }
                break;
            case 28:
                lArr = lArr;
            case 30:
                i6 *= i4;
            case 31:
                Test0962.instanceCount += i4;
                break;
            case 13:
            case 27:
                dArr[(50 >>> 1) % N] *= -114;
                break;
            case 37:
                d += i4;
                break;
            case 45:
                Test0962.instanceCount += -63;
                break;
            case 22:
                dArr1 = dArr1;
            default:
                iArr = iArr;
        }
        vMeth_check_sum += i4 + Float.floatToIntBits(f1) + i6 + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr)
                + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(lArr) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1));
    }

    public static int iMeth() {

        int i8 = -19962, i9 = -119, i10 = 0, i11 = 16390, i12 = 47182, i13 = 6, i14 = -60568, i15 = -61337;
        float f2 = -1.65F;
        float[] fArr = new float[N];
        double d1 = 118.102565;
        long[] lArr1 = new long[N];

        FuzzerUtils.init(fArr, 1.812F);
        FuzzerUtils.init(lArr1, 37661L);

        vMeth();
        for (i8 = 2; i8 < 239; i8++) {
            try {
                Test0962.iArrFld[i8 + 1][i8] = (Test0962.iArrFld[i8 + 1][i8 + 1] % i8);
                i9 = (i9 % i9);
                i9 = (-6395 % i8);
            } catch (ArithmeticException a_e) {
            }
            fArr[i8] *= i10;
            i10 += i9;
            i10 *= i9;
            lArr1[i8 + 1] = i10;
            i9 *= (int) 12.29F;
            for (i11 = 1; i11 < 7; i11++) {
                switch (((i8 >>> 1) % 9) + 96) {
                    case 96:
                        for (i13 = 1; i13 < 2; ++i13) {
                            i10 = (int) Test0962.instanceCount;
                            i14 += (((i13 * f2) + Test0962.instanceCount) - i15);
                            Test0962.iArrFld[i11][i8 + 1] *= (int) Test0962.instanceCount;
                            Test0962.instanceCount = i12;
                        }
                    case 97:
                    case 98:
                        Test0962.iArrFld[i11][i8 - 1] -= (int) Test0962.instanceCount;
                    case 99:
                        i9 += (i11 * i11);
                    case 100:
                        i15 += 198;
                        break;
                    case 101:
                        i12 >>>= i8;
                        break;
                    case 102:
                        i10 *= (int) d1;
                        break;
                    case 103:
                        Test0962.instanceCount += i13;
                        break;
                    case 104:
                        Test0962.instanceCount += i9;
                        break;
                }
            }
        }
        long meth_res = i8 + i9 + i10 + i11 + i12 + i13 + i14 + Float.floatToIntBits(f2) + i15 +
                Double.doubleToLongBits(d1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
                FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static byte byMeth(int i, int i1, long l) {

        int i2 = -16745;
        int i3 = 183;
        int i17 = -5;
        int i18 = -139;
        int[] iArr1 = new int[N];
        float f = 1.552F;
        long l2 = 5L;

        FuzzerUtils.init(iArr1, 3);

        i = ((--i) - (i--));
        for (i2 = 5; i2 < 238; i2++) {
            l -= (long) ((Math.min(i, i3) * (-(i + f))) + Math.min(iMeth(), -7));
            i3 += (((i2 * Test0962.instanceCount) + l2) - i);
            for (i17 = 1; 7 > i17; ++i17) {
                l += (i17 | i3);
                i1 += (int) (-8L + (i17 * i17));
                i1 += (i17 - i17);
            }
            i18 = 12;
        }
        i18 -= i18;
        i1 >>= i18;
        i1 += (int) f;
        long meth_res = i + i1 + l + i2 + i3 + Float.floatToIntBits(f) + l2 + i17 + i18 + FuzzerUtils.checkSum(iArr1);
        byMeth_check_sum += meth_res;
        return (byte) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0962 _instance = new Test0962();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i19 = 12, i20 = 147, i21 = 252, i22 = -9, i23 = -4, i24 = 43785, i25 = 0, i26 = 153, i27 = -61;
        long l3 = -1500L;
        long[] lArr2 = new long[N];
        short s = -18475;
        boolean b = true;
        byte by = -76;
        float f3 = -2.918F;

        FuzzerUtils.init(lArr2, -11L);

        byMeth(Test0962.iFld, Test0962.iFld, Test0962.instanceCount);
        for (i19 = 2; 162 > i19; i19++) {
            Test0962.iArrFld[i19 - 1][i19] = Test0962.iFld;
            Test0962.iArrFld[i19 + 1] = Test0962.iArrFld[i19];
            Test0962.dFld += 11;
            i21 = 1;
            do {
                l3 = 1;
                while (++l3 < 1) {
                    lArr2[i21] = s;
                    i20 <<= (int) l3;
                    b = b;
                    i20 = i19;
                    b = b;
                    i20 += (int) 33949L;
                }
                Test0962.dFld -= l3;
                Test0962.iArrFld[i19 + 1][i19] -= (int) -34141L;
            } while (++i21 < 157);
            for (i22 = 1; i22 < 157; i22++) {
                long l4 = 2657940153L;
                i23 += (14 + (i22 * i22));
                Test0962.iFld = 23472;
                Test0962.iArrFld[i19][i19] = (int) 55413L;
                Test0962.instanceCount -= by;
                i23 = -11;
                i20 += i22;
                f3 -= f3;
                lArr2[i22 - 1] = l4;
                i20 = i20;
                i20 = i21;
            }
            for (i24 = 6; 157 > i24; i24++) {
                for (i26 = 1; i26 < 2; ++i26) {
                    try {
                        i23 = (i26 / -2070478410);
                        i25 = (i23 / i21);
                        i20 = (i21 / i21);
                    } catch (ArithmeticException a_e) {
                    }
                    Test0962.instanceCount += s;
                }
            }
        }

        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("l3 s b = " + l3 + "," + s + "," + (b ? 1 : 0));
        FuzzerUtils.out.println("i22 i23 by = " + i22 + "," + i23 + "," + by);
        FuzzerUtils.out.println("f3 i24 i25 = " + Float.floatToIntBits(f3) + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 i27 lArr2 = " + i26 + "," + i27 + "," + FuzzerUtils.checkSum(lArr2));

        FuzzerUtils.out.println("Test0962.instanceCount Test0962.iFld Test0962.dFld = " + Test0962.instanceCount + "," + Test0962.iFld +
                "," + Double.doubleToLongBits(Test0962.dFld));
        FuzzerUtils.out.println("Test0962.iArrFld = " + FuzzerUtils.checkSum(Test0962.iArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("byMeth_check_sum: " + byMeth_check_sum);
    }
}

///////////////////////////////////////////////////////////////////////
class UserDefinedExceptionTest0962 extends RuntimeException {
    public int field;
}

//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  byMeth ->  byMeth mainTest
//DEBUG  iMeth ->  iMeth byMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth byMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
