// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:26 2023
public class Test0306 {

    public static final int N = 400;

    public static long instanceCount=64155L;
    public static short sFld=-18414;
    public boolean bFld=false;
    public static int[] iArrFld =new int[N];
    public static float[][] fArrFld =new float[N][N];
    public static int[][] iArrFld1 =new int[N][N];

    static {
        FuzzerUtils.init(Test0306.iArrFld, -5);
        FuzzerUtils.init(Test0306.fArrFld, 1.91F);
        FuzzerUtils.init(Test0306.iArrFld1, 2);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {


        Test0306.fArrFld = Test0306.fArrFld;
        vMeth1_check_sum += 0;
    }

    public static void vMeth(long l, long l1, short s) {

        int i7=-110, i8=-5, i9=-208, i10=41981, i11=-34786, i12=-49320;
        boolean b=false;

        for (i7 = 15; i7 < 339; ++i7) {
            i8 += (i7 ^ i7);
        }
        vMeth1();
        for (i9 = 17; 349 > i9; i9++) {
            i8 += (((i9 * i7) + i8) - i9);
            Test0306.iArrFld[i9 + 1] ^= i9;
            Test0306.iArrFld[i9] *= i8;
            Test0306.iArrFld[i9] -= 10;
            if (b) {
                Test0306.iArrFld[i9] += 0;
                for (i11 = i9; i11 < 5; i11++) {
                    if (b) break;
                    Test0306.instanceCount += (70 + (i11 * i11));
                }
                Test0306.iArrFld[i9 - 1] = i9;
                i10 |= (int)l1;
            }
        }
        vMeth_check_sum += l + l1 + s + i7 + i8 + i9 + i10 + i11 + i12 + (b ? 1 : 0);
    }

    public static int iMeth() {

        int i4=-61860, i5=-106, i6=28430, i13=-2, i14=9, i15=-60194, i16=13238;
        double d=-1.29315;

        for (i4 = 14; 362 > i4; ++i4) {
            i6 = 5;
            do {
                vMeth(Test0306.instanceCount, Test0306.instanceCount, (short) (2488));
            } while (--i6 > 0);
        }
        i5 += i5;
        i5 = (int)d;
        for (i13 = 20; 386 > i13; ++i13) {
            float f1=2.418F;
            Test0306.instanceCount *= (long) f1;
            i14 += (((i13 * i4) + Test0306.instanceCount) - Test0306.sFld);
            if (i14 != 0) {
            }
            Test0306.iArrFld = Test0306.iArrFld;
        }
        i5 *= (int)d;
        i14 += i13;
        for (i15 = 7; i15 < 270; i15++) {
            i14 += (int) Test0306.instanceCount;
            i5 += (i15 ^ i4);
        }
        long meth_res = i4 + i5 + i6 + Double.doubleToLongBits(d) + i13 + i14 + i15 + i16;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-5, i1=-64, i2=48999, i3=-156, i17=98, i18=77, i19=2358, i20=11;
        float f=2.19F;
        long l2=-241L;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, 0L);

        for (i = 1; i < 239; ++i) {
            Test0306.instanceCount += i;
        }
        i2 = 1;
        while (++i2 < 362) {
            switch ((((((int)(i + f)) >>> 1) % 3) * 5) + 69) {
            case 78:
            case 77:
                Test0306.iArrFld[i2] += (int) Test0306.instanceCount;
                i3 = 1;
                do {
                    double d1=-2.19473;
                    i1 += ((i1 += (14 + (--Test0306.sFld))) + -145);
                    lArr[i3 - 1] ^= Test0306.iArrFld[i3 + 1];
                    if (38807 >= (-((-1.985F - (21 * (1150665607841263699L + (i1++)))) - iMeth()))) continue;
                    d1 *= i1;
                    Test0306.instanceCount += (((i3 * i3) + i2) - i1);
                    i1 += (int)d1;
                    f = i3;
                } while (++i3 < 70);
                try {
                    i1 = (-1359611731 / i2);
                    i1 = (i3 / i3);
                    i1 = (i / 222);
                } catch (ArithmeticException a_e) {}
                break;
            case 74:
                for (i17 = 2; 70 > i17; i17++) {
                    for (i19 = 1; i19 < 2; ++i19) {
                        i20 -= i19;
                        i18 += (((i19 * i3) + i3) - Test0306.instanceCount);
                    }
                    i1 -= -5;
                    l2 = (long)-22.78F;
                    i20 *= (int)l2;
                    Test0306.iArrFld1 = Test0306.iArrFld1;
                    if (false) continue;
                    i20 >>= i20;
                    i18 *= (int)l2;
                    bFld = bFld;
                    try {
                        i20 = (-328408666 % i20);
                        i1 = (42948 / i2);
                        i1 = (i20 % i);
                    } catch (ArithmeticException a_e) {}
                }
                Test0306.fArrFld[i2 + 1] = Test0306.fArrFld[i2 + 1];
                i20 -= (int)1.20376;
                break;
            default:
                if (bFld) continue;
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("f i3 i17 = " + Float.floatToIntBits(f) + "," + i3 + "," + i17);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("l2 lArr = " + l2 + "," + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test0306.instanceCount Test0306.sFld bFld = " + Test0306.instanceCount + "," + Test0306.sFld + "," +
            (bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0306.iArrFld Test0306.fArrFld Test0306.iArrFld1 = " + FuzzerUtils.checkSum(Test0306.iArrFld) + ","
                + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0306.fArrFld)) + "," + FuzzerUtils.checkSum(Test0306.iArrFld1));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0306 _instance = new Test0306();
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
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}