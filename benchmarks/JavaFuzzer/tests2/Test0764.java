// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:47 2023
public class Test0764 {

    public static final int N = 400;

    public static long instanceCount=-48008L;
    public static boolean bFld=false;
    public int iFld=-2;

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i8=-4;
        int i9=-155;
        int i10=-7;
        int i11=0;
        int[] iArr1 =new int[N];
        float f1=61.743F, f2=106.696F;
        short s=-27045;
        long[] lArr =new long[N];

        FuzzerUtils.init(iArr1, 3);
        FuzzerUtils.init(lArr, -14L);

        for (i8 = 22; i8 < 383; ++i8) {
            f1 = i9;
            iArr1[i8 + 1] = -77;
            Test0764.instanceCount <<= i9;
            s -= (short)44159;
            for (f2 = i8; 5 > f2; f2++) {
                i9 *= i10;
                i10 *= 6;
            }
            i11 = 1;
            do {
                if (Test0764.bFld) {
                    lArr = lArr;
                    i10 = (int)69.929F;
                    if (Test0764.bFld) continue;
                    i10 += (int)f2;
                } else if (Test0764.bFld) {
                    i9 = (int) Test0764.instanceCount;
                } else {
                    iArr1[i11] += (int)4896644868872115079L;
                }
            } while (++i11 < 5);
        }
        long meth_res = i8 + i9 + Float.floatToIntBits(f1) + s + Float.floatToIntBits(f2) + i10 + i11 +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(long l1, int i2, long l2) {

        float f=-114.816F, f3=-90.139F;
        int i3=0;
        int i4=-17712;
        int i5=-9673;
        int i6=-169;
        int i7=-7;
        int[][] iArr =new int[N][N];
        byte by=95;
        double d=113.101225;
        double[] dArr =new double[N];
        long[][] lArr1 =new long[N][N];

        FuzzerUtils.init(iArr, -44554);
        FuzzerUtils.init(dArr, -68.98040);
        FuzzerUtils.init(lArr1, 1666502110151270821L);

        switch ((((iArr[(i2 >>> 1) % N][(i2 >>> 1) % N] >>> 1) % 3) * 5) + 88) {
        case 98:
            for (f = 298; f > 14; --f) {
                i3 += i2;
                for (i4 = 1; i4 < 6; ++i4) {
                    i2 = (((--i2) + by) % ((i5 = (--i3)) | 1));
                    i5 += (((i4 * i2) + i4) - f);
                    l2 = Math.abs(Math.max(iArr[(int)(f + 1)][i4 + 1] = 59494, i3--));
                }
                i3 += (int)f;
                for (i6 = 1; i6 < 6; ++i6) {
                    dArr[(int)(f)] += iMeth();
                    i2 = (int) Test0764.instanceCount;
                    l2 = i2;
                    lArr1[(int)(f)][(int)(f - 1)] *= 244;
                    iArr[i6 + 1][i6 + 1] += i7;
                    i3 = i5;
                }
            }
            break;
        case 97:
            f3 += (float)d;
            break;
        case 99:
            i5 = i2;
        }
        vMeth_check_sum += l1 + i2 + l2 + Float.floatToIntBits(f) + i3 + i4 + i5 + by + i6 + i7 +
            Float.floatToIntBits(f3) + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(lArr1);
    }

    public static void vSmallMeth(int i, boolean b, int i1) {

        long l=-58075L;

        l = ((i1 = (int) (Test0764.instanceCount + l)) + ((224L - (i - i)) - i));
        vMeth(-158L, i1, 213L);
        vSmallMeth_check_sum += i + (b ? 1 : 0) + i1 + l;
    }

    public void mainTest(String[] strArr1) {


        for (int smallinvoc = 0; smallinvoc < 423; smallinvoc++) vSmallMeth(-8364, Test0764.bFld, iFld);


        FuzzerUtils.out.println("Test0764.instanceCount Test0764.bFld iFld = " + Test0764.instanceCount + "," + (Test0764.bFld ? 1 : 0)
            + "," + iFld);

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0764 _instance = new Test0764();
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  iMeth ->  iMeth vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
