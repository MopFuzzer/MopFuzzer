// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:14 2023
public class Test0053 {

    public static final int N = 400;

    public static long instanceCount=1037563721L;
    public static short sFld=-3308;
    public static double dFld=0.16007;
    public static float fFld=2.986F;
    public int[][] iArrFld =new int[N][N];
    public static byte[] byArrFld =new byte[N];

    static {
        FuzzerUtils.init(Test0053.byArrFld, (byte) 116);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;

    public static double dMeth(int i6, float f1, int i7) {

        int i8=9;
        int i9=-4;
        int i10=112;
        int i11=-8;
        int i12=4;
        int i13=15634;
        int[] iArr1 =new int[N];
        boolean b=false;
        long l=-9L;

        FuzzerUtils.init(iArr1, -14);

        for (i8 = 6; i8 < 301; i8++) {
            i9 &= i9;
            switch (((i8 % 2) * 5) + 85) {
            case 94:
                for (i10 = 6; i10 > 1; --i10) {
                    iArr1 = iArr1;
                    Test0053.sFld <<= (short) -46360;
                    b = b;
                    i9 >>= (int) Test0053.instanceCount;
                }
                for (l = 1; l < 6; l++) {
                    i7 += Test0053.sFld;
                    iArr1[i8] *= i11;
                    i13 = 1;
                    do {
                        try {
                            i9 = (i11 % i9);
                            i9 = (iArr1[i13 - 1] / i11);
                            i6 = (53454515 % i6);
                        } catch (ArithmeticException a_e) {}
                        f1 += 226;
                    } while (++i13 < 2);
                    i6 >>= (int) Test0053.instanceCount;
                }
                break;
            case 95:
                iArr1[i8 + 1] -= i12;
                break;
            }
        }
        long meth_res = i6 + Float.floatToIntBits(f1) + i7 + i8 + i9 + i10 + i11 + (b ? 1 : 0) + l + i12 + i13 +
            FuzzerUtils.checkSum(iArr1);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth(int i1, int i2) {

        int i3=-11;
        int i4=164;
        int i5=-29319;
        int[] iArr =new int[N];
        float f=0.790F;
        double[] dArr =new double[N];

        FuzzerUtils.init(dArr, 61.32043);
        FuzzerUtils.init(iArr, 10);

        for (i3 = 12; 200 > i3; i3++) {
            i1 += (((i3 * Test0053.instanceCount) + i2) - f);
            i2 += (i3 * i3);
            i2 += (-24 + (i3 * i3));
            i2 *= (--i2);
            Test0053.instanceCount = (long) dArr[i3 - 1];
            i5 = 1;
            do {
                iArr[i5 + 1] = (int)dMeth(47838, -2.0F, 248);
                f += (i5 * i1);
                iArr[i5 + 1] = -28092;
                iArr[i3 - 1] -= (int) Test0053.instanceCount;
                i2 |= i3;
                i2 = (int) Test0053.instanceCount;
                i4 += i2;
                if (i4 != 0) {
                    vMeth_check_sum += i1 + i2 + i3 + i4 + Float.floatToIntBits(f) + i5 +
                        Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr);
                    return;
                }
            } while (++i5 < 8);
        }
        vMeth_check_sum += i1 + i2 + i3 + i4 + Float.floatToIntBits(f) + i5 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr);
    }

    public static void vSmallMeth(int i) {


        vMeth(i, i);
        Test0053.dFld /= (Test0053.instanceCount | 1);
        vSmallMeth_check_sum += i;
    }

    public void mainTest(String[] strArr1) {

        int i14=-32370;
        int i16=-942;
        int i17=43434;
        int i18=-12881;
        int i19=10;
        int i20=-144;
        int i21=-44309;
        int i22=-128;
        int i23=-2;
        int[] iArr2 =new
                    int[N];
        boolean b1=true;
        long l1=-204L;
        long[] lArr =new long[N];
        byte by=-116;

        FuzzerUtils.init(lArr, -50127L);
        FuzzerUtils.init(iArr2, -132);

        for (int smallinvoc=0; smallinvoc<864; smallinvoc++) vSmallMeth(i14);
        i14 = i14;
        iArrFld[(i14 >>> 1) % N][(-172 >>> 1) % N] += (int) Test0053.instanceCount;
        lArr[(i14 >>> 1) % N] &= i14;
        i14 <<= i14;
        i14 = (int) Test0053.dFld;
        for (int i15 : iArr2) {
            b1 = b1;
            for (i16 = 63; i16 > 2; i16 -= 2) {
                Test0053.instanceCount -= i15;
                l1 <<= i16;
                i17 = (int) Test0053.instanceCount;
                for (i18 = 1; i18 < 3; ++i18) {
                    Test0053.instanceCount %= (Test0053.instanceCount | 1);
                    Test0053.dFld = Test0053.instanceCount;
                    b1 = true;
                    iArrFld[i18][i18] = (int)l1;
                    i17 >>= i14;
                    i14 += i19;
                    by += (byte)i18;
                }
                for (i20 = 1; 3 > i20; i20++) {
                    i21 += i20;
                    b1 = b1;
                    Test0053.fFld -= i20;
                }
                l1 += 3;
                if (b1) break;
                i14 = i16;
            }
        }
        for (i22 = 12; i22 < 242; i22 += 3) {
            i17 *= (int)55.14F;
        }
        i19 <<= (int)l1;

        FuzzerUtils.out.println("i14 b1 i16 = " + i14 + "," + (b1 ? 1 : 0) + "," + i16);
        FuzzerUtils.out.println("i17 l1 i18 = " + i17 + "," + l1 + "," + i18);
        FuzzerUtils.out.println("i19 by i20 = " + i19 + "," + by + "," + i20);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("lArr iArr2 = " + FuzzerUtils.checkSum(lArr) + "," + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test0053.instanceCount Test0053.sFld Test0053.dFld = " + Test0053.instanceCount + "," + Test0053.sFld +
                "," + Double.doubleToLongBits(Test0053.dFld));
        FuzzerUtils.out.println("Test0053.fFld iArrFld Test0053.byArrFld = " + Float.floatToIntBits(Test0053.fFld) + "," +
                FuzzerUtils.checkSum(iArrFld) + "," + FuzzerUtils.checkSum(Test0053.byArrFld));

        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0053 _instance = new Test0053();
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
//DEBUG  dMeth ->  dMeth vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}