// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:49 2023
public class Test0791 {

    public static final int N = 400;

    public static long instanceCount=0L;
    public static int iFld=47159;
    public static float fFld=-4.493F;
    public static boolean bFld=true;
    public static long lFld=-41241L;
    public static short sFld=32622;
    public static long[] lArrFld =new long[N];
    public static volatile boolean[] bArrFld =new boolean[N];
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0791.lArrFld, -966659090355168786L);
        FuzzerUtils.init(Test0791.bArrFld, true);
        FuzzerUtils.init(Test0791.iArrFld, 54817);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i3) {

        int i4=152;
        int i5=62753;
        int i6=-51639;
        int i7=-16704;
        int[] iArr =new int[N];
        byte by=21;
        double d1=-117.81332;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(iArr, 6);
        FuzzerUtils.init(lArr1, -529562197L);

        iArr[(12686 >>> 1) % N] *= -232;
        for (i4 = 8; i4 < 147; ++i4) {
            i3 += i4;
            for (i6 = 1; i6 < 11; ++i6) {
                Test0791.fFld += (i6 * i6);
                lArr1[i4 + 1] = i4;
                Test0791.iFld = -176;
                i7 += i3;
                i7 = Test0791.iFld;
                Test0791.bFld = Test0791.bFld;
            }
            i7 += (((i4 * i3) + by) - i3);
            Test0791.fFld += Test0791.instanceCount;
            d1 = i6;
            i5 -= by;
            Test0791.instanceCount >>= i6;
        }
        vMeth1_check_sum += i3 + i4 + i5 + i6 + i7 + by + Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(lArr1);
    }

    public static int iMeth(short s) {

        double d=-12.81839;
        double[] dArr =new double[N];
        int i8=-34493;
        int i9=13;
        int i10=-254;
        int[] iArr1 =new int[N];
        byte by1=-110;
        float[] fArr =new float[N];

        FuzzerUtils.init(iArr1, -201);
        FuzzerUtils.init(dArr, 0.117281);
        FuzzerUtils.init(fArr, 1.961F);

        Test0791.iFld = (int) (((Test0791.iFld * Test0791.instanceCount) - (Test0791.instanceCount - Test0791.iFld)) + d);
        vMeth1(Test0791.iFld);
        for (i8 = 14; i8 < 234; ++i8) {
            Test0791.fFld = i8;
            s = (short)-2264154646L;
            i9 = i8;
            d -= i9;
            if (Test0791.bFld) continue;
            Test0791.iFld ^= i9;
            i10 = 1;
            while (++i10 < 7) {
                Test0791.fFld += Test0791.fFld;
            }
            switch (((i9 >>> 1) % 10) + 39) {
            case 39:
                i9 *= i8;
                Test0791.iFld += (((i8 * i10) + Test0791.iFld) - i9);
                i9 |= 3;
                break;
            case 40:
                iArr1 = iArr1;
            case 41:
                Test0791.lArrFld[i8 - 1] -= i9;
                break;
            case 42:
                iArr1[i8 + 1] >>= (int) Test0791.instanceCount;
            case 43:
                by1 = (byte) Test0791.fFld;
                break;
            case 44:
                Test0791.iFld += (i8 * Test0791.fFld);
                break;
            case 45:
                d = -22;
                break;
            case 46:
                Test0791.iFld += (i8 + s);
                break;
            case 47:
                if (false) continue;
                break;
            case 48:
                dArr[i8 + 1] -= i10;
                break;
            default:
                fArr[i8] -= Test0791.instanceCount;
            }
        }
        long meth_res = s + Double.doubleToLongBits(d) + i8 + i9 + i10 + by1 + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i1, int i2) {

        short s1=29121;
        short[] sArr =new short[N];
        int i11=-20999;
        int[] iArr2 =new int[N];
        double[] dArr1 =new double[N];
        float[][] fArr1 =new float[N][N];

        FuzzerUtils.init(sArr, (short)16193);
        FuzzerUtils.init(iArr2, -9);
        FuzzerUtils.init(dArr1, 0.106014);
        FuzzerUtils.init(fArr1, -94.338F);

        sArr[(i1 >>> 1) % N] >>= (short)iMeth(s1);
        iArr2[(i2 >>> 1) % N] = i1;
        Test0791.iFld = (int) Test0791.instanceCount;
        iArr2 = iArr2;
        Test0791.iFld = i1;
        Test0791.instanceCount -= Test0791.instanceCount;
        i2 = Test0791.iFld;
        switch ((((i2 >>> 1) % 2) * 5) + 68) {
        case 73:
            if (Test0791.bFld) {
                for (double d2 : dArr1) {
                    fArr1[(Test0791.iFld >>> 1) % N][(i2 >>> 1) % N] -= Test0791.instanceCount;
                    i2 -= i2;
                }
                i11 = 1;
                while (++i11 < 354) {
                    s1 += (short)i11;
                    try {
                        i1 = (i1 / i1);
                        i1 = (Test0791.iFld % iArr2[i11]);
                        i1 = (Test0791.iFld / iArr2[i11 - 1]);
                    } catch (ArithmeticException a_e) {}
                }
                vMeth_check_sum += i1 + i2 + s1 + i11 + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr2) +
                    Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)) +
                    Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
                return;
            } else {
                Test0791.lFld = -13;
            }
        case 75:
            i2 = (int) Test0791.instanceCount;
            break;
        default:
            Test0791.bArrFld[(0 >>> 1) % N] = Test0791.bFld;
        }
        vMeth_check_sum += i1 + i2 + s1 + i11 + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr2) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public void mainTest(String[] strArr1) {

        int i=-7, i12=9, i13=93, i14=-214;
        double d3=2.7144;
        short s2=20768;
        long[] lArr =new long[N];
        float[] fArr2 =new float[N];

        FuzzerUtils.init(lArr, 11L);
        FuzzerUtils.init(fArr2, 0.648F);

        for (long l : lArr) {
            i *= (int) Math.abs((l - i) * (Test0791.instanceCount - i));
            vMeth(-58937, i);
            if (false) {
                Test0791.lFld += Test0791.sFld;
                i12 = 1;
                while (++i12 < 63) {
                    Test0791.lFld = i12;
                    Test0791.iArrFld[i12] = (int) Test0791.fFld;
                }
            } else if (Test0791.bFld) {
                Test0791.iFld *= i12;
                i >>= i;
            }
        }
        for (i13 = 3; i13 < 322; ++i13) {
            Test0791.fFld = (float) d3;
            i = (int) Test0791.instanceCount;
        }
        fArr2[(i >>> 1) % N] += s2;
        i14 += i13;

        FuzzerUtils.out.println("i i12 i13 = " + i + "," + i12 + "," + i13);
        FuzzerUtils.out.println("i14 d3 s2 = " + i14 + "," + Double.doubleToLongBits(d3) + "," + s2);
        FuzzerUtils.out.println("lArr fArr2 = " + FuzzerUtils.checkSum(lArr) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr2)));

        FuzzerUtils.out.println("Test0791.instanceCount Test0791.iFld Test0791.fFld = " + Test0791.instanceCount + "," + Test0791.iFld +
                "," + Float.floatToIntBits(Test0791.fFld));
        FuzzerUtils.out.println("Test0791.bFld Test0791.lFld Test0791.sFld = " + (Test0791.bFld ? 1 : 0) + "," + Test0791.lFld + "," +
                Test0791.sFld);
        FuzzerUtils.out.println("Test0791.lArrFld Test0791.bArrFld Test0791.iArrFld = " + FuzzerUtils.checkSum(Test0791.lArrFld) + ","
                + FuzzerUtils.checkSum(Test0791.bArrFld) + "," + FuzzerUtils.checkSum(Test0791.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0791 _instance = new Test0791();
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
