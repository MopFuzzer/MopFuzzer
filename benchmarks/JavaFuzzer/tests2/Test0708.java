// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:45 2023
public class Test0708 {

    public static final int N = 400;

    public static long instanceCount=5119590120643744855L;
    public static double dFld=-48.102914;
    public volatile float fFld=2.115F;
    public static int[] iArrFld =new int[N];
    public static volatile long[] lArrFld =new long[N];
    public float[] fArrFld =new float[N];

    static {
        FuzzerUtils.init(Test0708.iArrFld, -18844);
        FuzzerUtils.init(Test0708.lArrFld, 120L);
    }

    public static long fMeth_check_sum = 0;
    public static long fMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;

    public static float fMeth1(int i5, int i6) {

        long l1=-1074110302598425520L;
        int i7=200;
        float f=29.945F;
        double[] dArr =new double[N];

        FuzzerUtils.init(dArr, 58.58103);

        i5 -= (int) (Test0708.instanceCount + ((Test0708.instanceCount++) + i5));
        for (l1 = 8; 332 > l1; l1++) {
            i6 += (int)(dArr[(int)(l1 + 1)]++);
            i5 -= (int) (Test0708.instanceCount * f);
            Test0708.iArrFld[(int) (l1)] += (-(Test0708.iArrFld[(int) (l1 + 1)] >>= (i6 - 9)));
        }
        long meth_res = i5 + i6 + l1 + i7 + Float.floatToIntBits(f) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        fMeth1_check_sum += meth_res;
        return (float)meth_res;
    }

    public static boolean bMeth() {

        int i10=94, i11=-10, i12=13, i13=167, i14=-26145, i15=5;
        float f2=22.785F, f3=107.548F, f4=-49.981F;
        double d=-1.74999;
        byte by=121;

        i10 += (int) Test0708.instanceCount;
        f2 = 1;
        while (++f2 < 317) {
            i11 = 1;
            do {
                Test0708.iArrFld[i11] *= (int) Test0708.instanceCount;
                i10 >>= i11;
            } while (++i11 < 5);
            Test0708.instanceCount = i11;
        }
        for (i12 = 1; i12 < 217; i12++) {
            f3 *= i10;
            f3 -= f2;
            i13 = (int) Test0708.instanceCount;
            for (f4 = 1; 7 > f4; f4 += 3) {
                for (d = 1; d < 4; d += 3) {
                    by = (byte) Test0708.instanceCount;
                    Test0708.instanceCount += (long) (((d * Test0708.instanceCount) + Test0708.instanceCount) - i14);
                    Test0708.instanceCount += i10;
                }
            }
        }
        long meth_res = i10 + Float.floatToIntBits(f2) + i11 + i12 + i13 + Float.floatToIntBits(f3) +
            Float.floatToIntBits(f4) + i14 + Double.doubleToLongBits(d) + i15 + by;
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static void vMeth(float f1, int i8, int i9) {

        boolean b=true;
        int i16=-22157, i17=-4, i18=-245, i19=-36154, i20=6, i21=186, i22=-158;
        short s=-7748;

        b = (b = bMeth());
        i16 = 1;
        do {
            switch ((((i8 >>> 1) % 4) * 5) + 7) {
            case 12:
                for (i17 = i16; i17 < 6; ++i17) {
                    f1 += (i17 + i17);
                    i18 = i18;
                    Test0708.iArrFld[i16 + 1] += (int) Test0708.dFld;
                }
                f1 += i16;
                for (i19 = 1; i19 < 6; ++i19) {
                    Test0708.iArrFld[i16] -= -10;
                    for (i21 = 1; i21 < 2; ++i21) {
                        Test0708.lArrFld[i19] = i17;
                        i18 -= (int) Test0708.instanceCount;
                        i18 = i17;
                        i18 += i18;
                    }
                }
                break;
            case 9:
                i9 = s;
                break;
            case 21:
                i20 = -214;
                break;
            case 25:
            default:
                Test0708.instanceCount = i22;
            }
        } while (++i16 < 283);
        vMeth_check_sum += Float.floatToIntBits(f1) + i8 + i9 + (b ? 1 : 0) + i16 + i17 + i18 + i19 + i20 + i21 + i22 +
            s;
    }

    public static float fMeth(long l, int i2) {

        int i3=-14, i4=-23461, i23=-1897, i24=-192, i25=12044;
        float f5=2.392F;
        short s1=16536;

        for (i3 = 10; i3 < 284; i3++) {
            fMeth1((int) (Test0708.dFld * ((l--) - i2)), (--Test0708.iArrFld[i3 + 1]) * i4);
            vMeth(f5, i2, -38992);
            i23 = 1;
            do {
                l = s1;
                i2 <<= (int) Test0708.instanceCount;
                switch ((i3 % 2) + 9) {
                case 9:
                    Test0708.iArrFld[i23 - 1] -= (int) Test0708.instanceCount;
                    Test0708.instanceCount += (((i23 * f5) + i23) - l);
                    Test0708.iArrFld = Test0708.iArrFld;
                    break;
                case 10:
                    Test0708.dFld += i23;
                }
                for (i24 = 1; i24 < 1; i24++) {
                    l -= 107;
                    Test0708.dFld *= Test0708.instanceCount;
                    f5 += (i24 - f5);
                }
            } while (++i23 < 6);
        }
        long meth_res = l + i2 + i3 + i4 + Float.floatToIntBits(f5) + i23 + s1 + i24 + i25;
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-86, i1=-6705, i26=-236, i27=2, i28=-187, i29=-17905;
        boolean b1=true;
        byte by1=32;
        short s2=-10710;
        double[] dArr1 =new double[N];

        FuzzerUtils.init(dArr1, -1.110983);

        for (i = 3; i < 168; ++i) {
            i1 = (int) (fMeth(Test0708.instanceCount, i) - i);
            for (i26 = 6; i26 < 152; i26++) {
                Test0708.dFld += 0;
                fFld -= i1;
                switch ((i % 7) + 26) {
                case 26:
                    Test0708.instanceCount <<= i1;
                    for (i28 = i; 2 > i28; i28++) {
                        i27 += (int)-248L;
                        if (b1) break;
                        i27 += by1;
                        i1 += (i28 + i1);
                        Test0708.instanceCount <<= i;
                        fArrFld[i] = by1;
                    }
                    i29 -= (int) Test0708.dFld;
                    break;
                case 27:
                    i1 |= 178;
                    Test0708.instanceCount <<= i;
                    i27 = (int) Test0708.instanceCount;
                case 28:
                    if (b1) {
                        i1 += 114;
                        fFld += i;
                        dArr1[i26] += Test0708.instanceCount;
                    } else if (b1) {
                        Test0708.instanceCount = i28;
                        i27 += -17;
                        i1 >>= i27;
                    } else {
                        i27 >>= (int) Test0708.instanceCount;
                        i1 = i26;
                    }
                    break;
                case 29:
                    b1 = b1;
                    break;
                case 30:
                    if (b1) break;
                    Test0708.iArrFld[i] -= i1;
                    break;
                case 31:
                    Test0708.instanceCount -= s2;
                    break;
                case 32:
                    Test0708.instanceCount = i28;
                    break;
                default:
                    i1 += i26;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i26 = " + i + "," + i1 + "," + i26);
        FuzzerUtils.out.println("i27 i28 i29 = " + i27 + "," + i28 + "," + i29);
        FuzzerUtils.out.println("b1 by1 s2 = " + (b1 ? 1 : 0) + "," + by1 + "," + s2);
        FuzzerUtils.out.println("dArr1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)));

        FuzzerUtils.out.println("Test0708.instanceCount Test0708.dFld fFld = " + Test0708.instanceCount + "," +
                Double.doubleToLongBits(Test0708.dFld) + "," + Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("Test0708.iArrFld Test0708.lArrFld fArrFld = " + FuzzerUtils.checkSum(Test0708.iArrFld) + "," +
                FuzzerUtils.checkSum(Test0708.lArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));

        FuzzerUtils.out.println("fMeth1_check_sum: " + fMeth1_check_sum);
        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0708 _instance = new Test0708();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  fMeth1 ->  fMeth1 fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  bMeth ->  bMeth vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}