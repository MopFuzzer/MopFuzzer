// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:35 2023
public class Test0504 {

    public static final int N = 400;

    public static long instanceCount=-27L;
    public static int iFld=6;
    public static float fFld=0.490F;
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0504.iArrFld, -46691);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth() {

        long l1=-65023L;
        long[] lArr =new long[N];
        int i4=-39960;
        int i5=-37315;
        int i6=-133;
        int i7=47425;
        int i8=-53595;
        int i9=-202;
        int[][] iArr1 =new int[N][N];
        double[] dArr =new double[N];

        FuzzerUtils.init(dArr, -1.16655);
        FuzzerUtils.init(lArr, 44600L);
        FuzzerUtils.init(iArr1, 57090);

        Test0504.iFld = Test0504.iFld;
        for (l1 = 221; l1 > 9; l1--) {
            Test0504.instanceCount += l1;
            switch (((0 >>> 1) % 10) + 39) {
            case 39:
            case 40:
                Test0504.iArrFld[(int) (l1 - 1)] |= Test0504.iFld;
                break;
            case 41:
                for (i5 = 1; i5 < 8; ++i5) {
                    double d1=-109.105201;
                    i4 = i4;
                    i4 >>>= 54;
                    d1 += Test0504.iFld;
                    i4 = (int)d1;
                    Test0504.iFld = i4;
                    for (i7 = 1; i7 < 2; ++i7) {
                        dArr[i7] += i8;
                        lArr = FuzzerUtils.long1array(N, (long)-3887349202L);
                        Test0504.iFld += (((i7 * Test0504.iFld) + i8) - l1);
                    }
                }
            case 42:
                Test0504.iFld += (int) (((l1 * Test0504.iFld) + i4) - i4);
                break;
            case 43:
                Test0504.iFld = i9;
                break;
            case 44:
                lArr[(int)(l1 - 1)] -= i6;
                break;
            case 45:
                Test0504.iArrFld[(int) (l1 + 1)] += i6;
            case 46:
                i6 += (int)(l1 | i8);
                break;
            case 47:
                try {
                    Test0504.iFld = (1354519882 / iArr1[(int) (l1 - 1)][(int) (l1 - 1)]);
                    i4 = (iArr1[(int) (l1 - 1)][(int) (l1 - 1)] / Test0504.iArrFld[(int) (l1)]);
                    i6 = (Test0504.iArrFld[(int) (l1 - 1)] % 30664);
                } catch (ArithmeticException a_e) {}
                break;
            case 48:
                Test0504.iArrFld[(int) (l1 - 1)] = (int) Test0504.instanceCount;
            default:
                if (true) continue;
            }
        }
        long meth_res = l1 + i4 + i5 + i6 + i7 + i8 + i9 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth() {

        float[] fArr =new float[N];

        FuzzerUtils.init(fArr, 89.228F);

        fArr[(Test0504.iFld >>> 1) % N] -= (-Math.min(Test0504.iFld, Test0504.iFld - Test0504.iFld));
        fMeth();
        Test0504.iFld %= (int) (Test0504.iFld | 1);
        vMeth_check_sum += Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static int iMeth(double d, long l, int i1) {

        float f=-1.344F, f1=1.943F;
        int i2=-60, i3=30220, i10=52582, i11=-29051, i12=2;
        double[] dArr1 =new double[N];

        FuzzerUtils.init(dArr1, 31.71336);

        Test0504.iArrFld[(i1 >>> 1) % N] += ((-i1) + Math.abs((int) (l - f)));
        for (i2 = 9; i2 < 167; ++i2) {
            vMeth();
            f *= (float)d;
            Test0504.iFld = (int) d;
            d += Test0504.iFld;
            i3 -= 46815;
            for (f1 = 1; f1 < 10; ++f1) {
                for (i11 = 2; i11 > 1; --i11) {
                    f = i11;
                }
                Test0504.iArrFld[(int) (f1)] -= (int) d;
                dArr1[i2 - 1] = -319156358L;
                l >>= -27290;
                Test0504.iFld = Test0504.iFld;
                i12 -= i11;
            }
        }
        long meth_res = Double.doubleToLongBits(d) + l + i1 + Float.floatToIntBits(f) + i2 + i3 +
            Float.floatToIntBits(f1) + i10 + i11 + i12 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=3;
        int[] iArr =new int[N];
        double d2=-51.37466;

        FuzzerUtils.init(iArr, 165);

        i = (int)(i * ((i - -48033L) - (i + i)));
        Test0504.instanceCount *= (((i = (int) 4259235232963949655L) - (i = i)) >> Math.min(iArr[(-5 >>> 1) % N], iMeth(d2,
                Test0504.instanceCount, i)));
        Test0504.fFld += i;
        i %= (int) (Test0504.iFld | 1);

        FuzzerUtils.out.println("i d2 iArr = " + i + "," + Double.doubleToLongBits(d2) + "," +
            FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test0504.instanceCount Test0504.iFld Test0504.fFld = " + Test0504.instanceCount + "," + Test0504.iFld +
                "," + Float.floatToIntBits(Test0504.fFld));
        FuzzerUtils.out.println("Test0504.iArrFld = " + FuzzerUtils.checkSum(Test0504.iArrFld));

        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0504 _instance = new Test0504();
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  fMeth ->  fMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}