// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:10 2023
public class Test0694 {

    public static final int N = 400;

    public static long instanceCount = 3586L;
    public static short sFld = -32244;
    public static byte byFld = -31;
    public static volatile boolean bFld = false;
    public static long[][] lArrFld = new long[N][N];
    public static volatile int[] iArrFld = new int[N];
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0694.lArrFld, -9093369115461415703L);
        FuzzerUtils.init(Test0694.iArrFld, 5);
    }

    public float fFld = 107.453F;

    public static int iMeth() {

        int i5 = -53588;
        float f1 = 1.255F;
        double d1 = 0.1996;

        i5 = 1;
        do {
            f1 += (17570 >> Math.min((long) (d1 + i5), Test0694.instanceCount * i5));
        } while (++i5 < 138);
        long meth_res = i5 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d1);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static long lMeth() {

        int i9 = 2;

        i9 += i9;
        Test0694.instanceCount <<= i9;
        Test0694.instanceCount = (long) 104.667F;
        long meth_res = i9;
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public static double dMeth() {

        int i6 = -128;
        int i7 = 40069;
        int i10 = 233;
        int i11 = 60921;
        int[] iArr = new int[N];
        double d2 = 0.118689;
        double[] dArr = new double[N];
        float f2 = 0.158F;
        float[] fArr1 = new float[N];

        FuzzerUtils.init(dArr, 0.24710);
        FuzzerUtils.init(iArr, -64487);
        FuzzerUtils.init(fArr1, -93.661F);

        for (i6 = 15; i6 < 350; i6++) {
            dArr[i6] -= (i7++);
            fArr1[i6 + 1] = 113;
            d2 -= (-(++Test0694.instanceCount));
            f2 = ((i7--) - Long.reverseBytes(lMeth()));
            iArr[i6 - 1] -= i7;
            Test0694.instanceCount += (((i6 * i7) + Test0694.instanceCount) - i6);
            for (i10 = 1; i10 < 5; i10++) {
                f2 = i11;
                Test0694.sFld >>= (short) 47;
                Test0694.lArrFld[i10 + 1][i10] -= Test0694.instanceCount;
                i11 ^= i11;
                i11 = (int) f2;
                try {
                    i11 = (i7 % iArr[i10]);
                    i7 = (-76 % i11);
                    i7 = (119 % i10);
                } catch (ArithmeticException a_e) {
                }
                i7 *= i7;
            }
        }
        long meth_res = i6 + i7 + Double.doubleToLongBits(d2) + Float.floatToIntBits(f2) + i10 + i11 +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
        dMeth_check_sum += meth_res;
        return (double) meth_res;
    }

    public static void vMeth(int i4, double d) {

        boolean b = true;
        int i12 = 61444, i13 = -175, i14 = -183, i15 = -62, i16 = 9074;
        float[] fArr = new float[N];

        FuzzerUtils.init(fArr, -109.519F);

        i4 += (int) Test0694.instanceCount;
        for (float f : fArr) {
            i4 = (int) (((i4--) + (i4 += (int) Test0694.instanceCount)) * Integer.reverseBytes(i4++));
            i4 >>= (int) ((Math.min(i4, i4) + iMeth()) + (-dMeth()));
            d = 69;
            b = b;
        }
        for (i12 = 13; i12 < 381; ++i12) {
            Test0694.iArrFld = Test0694.iArrFld;
            i4 += (((i12 * Test0694.instanceCount) + i4) - i13);
            i4 += i12;
            Test0694.instanceCount = i14;
            i13 ^= (int) 155L;
            for (i15 = 1; i15 < 5; ++i15) {
                if (b) break;
                Test0694.iArrFld = Test0694.iArrFld;
            }
        }
        vMeth_check_sum += i4 + Double.doubleToLongBits(d) + (b ? 1 : 0) + i12 + i13 + i14 + i15 + i16 +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void main(String[] strArr) {

        try {
            Test0694 _instance = new Test0694();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = 13, i1 = 24749, i2 = 8, i3 = 0, i17 = 6;
        float[] fArr2 = new float[N];

        FuzzerUtils.init(fArr2, -122.948F);

        Test0694.instanceCount = (i >>= (-(-(i * i))));
        i = i;
        for (i1 = 2; i1 < 176; ++i1) {
            i += Math.max(i1, Math.min(-1900 >> (-Short.reverseBytes(Test0694.sFld)), ++i));
            i3 = 1;
            do {
                double d3 = 87.50085;
                Test0694.instanceCount = i1;
                vMeth(i1, d3);
                i = (int) 14L;
                i17 = 1;
                do {
                    i -= -29321;
                    Test0694.iArrFld[i1 - 1] = (int) 3920529131L;
                    Test0694.sFld %= (short) (i1 | 1);
                    try {
                        i2 = (Test0694.iArrFld[i1] / 35);
                        i = (i17 % -21808);
                        Test0694.iArrFld[i3] = (i1 / -4);
                    } catch (ArithmeticException a_e) {
                    }
                    fArr2[i1] = i1;
                    d3 += i1;
                    Test0694.instanceCount <<= Test0694.byFld;
                    switch ((i1 % 8) + 108) {
                        case 108:
                            i2 *= 4;
                            if (Test0694.bFld) break;
                            i2 += (((i17 * Test0694.byFld) + Test0694.byFld) - i17);
                            break;
                        case 109:
                            i = (int) -17293L;
                            if (Test0694.bFld) break;
                            fArr2[i3 - 1] /= -82L;
                        case 110:
                            Test0694.byFld *= (byte) -57761;
                            Test0694.iArrFld[i1 + 1] = (int) -2L;
                            break;
                        case 111:
                            i2 *= i2;
                            i2 += (int) (-6.76F + (i17 * i17));
                            Test0694.instanceCount = 2002;
                            break;
                        case 112:
                            Test0694.instanceCount += (((i17 * fFld) + i) - i1);
                            Test0694.iArrFld[i1] <<= i3;
                            break;
                        case 113:
                            Test0694.instanceCount *= (long) d3;
                            break;
                        case 114:
                            i -= (int) fFld;
                        case 115:
                            d3 += Test0694.instanceCount;
                            break;
                        default:
                            Test0694.iArrFld[i17 - 1] -= (int) Test0694.instanceCount;
                    }
                } while (++i17 < 1);
            } while (++i3 < 144);
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i17 fArr2 = " + i3 + "," + i17 + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr2)));

        FuzzerUtils.out.println("Test0694.instanceCount Test0694.sFld Test0694.byFld = " + Test0694.instanceCount + "," + Test0694.sFld +
                "," + Test0694.byFld);
        FuzzerUtils.out.println("Test0694.bFld fFld Test0694.lArrFld = " + (Test0694.bFld ? 1 : 0) + "," +
                Float.floatToIntBits(fFld) + "," + FuzzerUtils.checkSum(Test0694.lArrFld));
        FuzzerUtils.out.println("Test0694.iArrFld = " + FuzzerUtils.checkSum(Test0694.iArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  dMeth ->  dMeth vMeth mainTest
//DEBUG  lMeth ->  lMeth dMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
