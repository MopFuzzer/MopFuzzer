// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:18 2023
public class Test0134 {

    public static final int N = 400;

    public static long instanceCount=-112L;
    public static byte byFld=104;
    public double dFld=-67.65590;
    public int iFld=-55;
    public static float[] fArrFld =new float[N];
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0134.fArrFld, 1.250F);
        FuzzerUtils.init(Test0134.iArrFld, 247);
    }

    public static long dMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i3, float f, int i4) {

        double d2=-90.50450, d3=70.65315;
        int i5=12;
        int i6=55995;
        int i7=5;
        int i8=14;
        int i9=175;
        int[] iArr =new int[N];
        boolean b=false;

        FuzzerUtils.init(iArr, 2);

        for (d2 = 5; 123 > d2; d2++) {
            b = b;
            i3 &= -6;
        }
        Test0134.instanceCount = Test0134.byFld;
        i5 >>= i5;
        for (i6 = 5; i6 < 210; i6++) {
            b = false;
            i8 = 1;
            while (++i8 < 8) {
                Test0134.byFld += (byte) (i8 + Test0134.instanceCount);
                for (d3 = 1; d3 < 1; ++d3) {
                    i7 += i4;
                    iArr[i6] = (int)f;
                    i9 *= i3;
                    i7 *= i4;
                    if (i9 != 0) {
                        vMeth1_check_sum += i3 + Float.floatToIntBits(f) + i4 + Double.doubleToLongBits(d2) + i5 + (b ?
                            1 : 0) + i6 + i7 + i8 + Double.doubleToLongBits(d3) + i9 + FuzzerUtils.checkSum(iArr);
                        return;
                    }
                }
            }
        }
        vMeth1_check_sum += i3 + Float.floatToIntBits(f) + i4 + Double.doubleToLongBits(d2) + i5 + (b ? 1 : 0) + i6 +
            i7 + i8 + Double.doubleToLongBits(d3) + i9 + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i2) {

        double d1=-115.32379;
        float f1=12.831F;
        int i10=6;
        int i11=-11;
        int i12=53956;
        int i13=-23252;
        int[][] iArr1 =new int[N][N];
        boolean b1=true;

        FuzzerUtils.init(iArr1, -5);

        i2 >>>= (int) (((i2 - Test0134.instanceCount) + (814667213L - (i2 + d1))) + ((--Test0134.instanceCount) +
                Test0134.fArrFld[(-251 >>> 1) % N]));
        Test0134.instanceCount = (-i2);
        i2 += i2;
        vMeth1(i2, f1, i2);
        for (i10 = 4; 356 > i10; i10++) {
            i2 -= (int) Test0134.instanceCount;
            for (i12 = 1; i12 < 5; i12++) {
                switch (((i10 % 3) * 5) + 118) {
                case 127:
                    i13 += (i12 * i12);
                    break;
                case 121:
                    i11 += i2;
                    switch ((i12 % 7) + 18) {
                    case 18:
                        Test0134.instanceCount += i13;
                        iArr1[i12 - 1][i10 + 1] = i10;
                        i13 += i12;
                        break;
                    case 19:
                        b1 = false;
                    case 20:
                        Test0134.instanceCount -= -214;
                        break;
                    case 21:
                        i11 += (int)-89L;
                        break;
                    case 22:
                        b1 = b1;
                        break;
                    case 23:
                        Test0134.instanceCount = i2;
                        break;
                    case 24:
                        i11 = i10;
                        break;
                    default:
                        i11 += (i12 | i13);
                    }
                case 126:
                    i13 += (i12 * i12);
                }
            }
        }
        vMeth_check_sum += i2 + Double.doubleToLongBits(d1) + Float.floatToIntBits(f1) + i10 + i11 + i12 + i13 + (b1 ?
            1 : 0) + FuzzerUtils.checkSum(iArr1);
    }

    public static double dMeth(double d, int i1) {


        vMeth(-3);
        long meth_res = Double.doubleToLongBits(d) + i1;
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-33251, i14=-8, i15=28273, i16=0, i17=-7, i19=0, i20=5;
        long l=-2088037023L;
        long[][] lArr =new long[N][N];
        float f2=102.87F;
        boolean b2=false;

        FuzzerUtils.init(lArr, -2088900644908135874L);

        i -= (int)dMeth(dFld, 233);
        Test0134.iArrFld[(i >>> 1) % N] = -3;
        i14 = 1;
        while (++i14 < 312) {
            i = i14;
            for (l = i14; 81 > l; ++l) {
                int i18=-24881;
                i15 += (int)(l | i14);
                f2 = 101.432F;
                switch ((int)((l % 2) + 15)) {
                case 15:
                    i15 += -61794;
                    Test0134.byFld = (byte) l;
                    Test0134.iArrFld[(int) (l + 1)] = -8;
                    break;
                case 16:
                    if (b2) break;
                    break;
                }
                i15 *= i;
                i *= (int)-13L;
                i += (int)(((l * f2) + i15) - i14);
                i <<= (int)l;
                lArr[i14][i14 + 1] >>= Test0134.instanceCount;
                f2 = i;
                switch ((i14 % 5) + 26) {
                case 26:
                    i -= (int)f2;
                    i >>>= i;
                    f2 += (l + i14);
                    break;
                case 27:
                    Test0134.iArrFld[(int) (l + 1)] ^= (int) l;
                    switch ((int)((l % 2) * 5)) {
                    case 4:
                        for (i16 = 1; i16 < 1; i16++) {
                            Test0134.instanceCount = i15;
                            b2 = b2;
                            lArr[i14][i16 - 1] *= (long)f2;
                            i17 &= i17;
                            i15 -= 0;
                        }
                    case 2:
                        try {
                            i15 = (iFld / -7995);
                            i17 = (i15 % -47528);
                            i15 = (i18 / i19);
                        } catch (ArithmeticException a_e) {}
                    }
                    break;
                case 28:
                    dFld = l;
                    break;
                case 29:
                    Test0134.instanceCount %= (Test0134.byFld | 1);
                case 30:
                    i20 >>>= i15;
                    break;
                }
            }
        }

        FuzzerUtils.out.println("i i14 l = " + i + "," + i14 + "," + l);
        FuzzerUtils.out.println("i15 f2 b2 = " + i15 + "," + Float.floatToIntBits(f2) + "," + (b2 ? 1 : 0));
        FuzzerUtils.out.println("i16 i17 i19 = " + i16 + "," + i17 + "," + i19);
        FuzzerUtils.out.println("i20 lArr = " + i20 + "," + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test0134.instanceCount Test0134.byFld dFld = " + Test0134.instanceCount + "," + Test0134.byFld + "," +
            Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("iFld Test0134.fArrFld Test0134.iArrFld = " + iFld + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0134.fArrFld)) + "," + FuzzerUtils.checkSum(Test0134.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0134 _instance = new Test0134();
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
//DEBUG  dMeth ->  dMeth mainTest
//DEBUG  vMeth ->  vMeth dMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth dMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
