// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:23 2023
public class Test0238 {

    public static final int N = 400;

    public static long instanceCount=627275427L;
    public static int iFld=-111;
    public static double dFld=1.108214;
    public static float fFld=2.68F;
    public static volatile short sFld=6749;
    public static volatile float fFld1=2.177F;
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0238.iArrFld, -8);
    }

    public static long bMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i4, int i5, boolean b) {


        Test0238.instanceCount += Test0238.instanceCount;
        long meth_res = i4 + i5 + (b ? 1 : 0);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i3=166;
        int i6=-27609;
        int i7=15804;
        int i8=142;
        int i9=0;
        int[] iArr =new int[N];
        byte by1=-106;
        boolean b1=true;
        long[] lArr =new long[N];

        FuzzerUtils.init(iArr, -21);
        FuzzerUtils.init(lArr, -8L);

        Test0238.instanceCount += Test0238.iFld;
        i3 = 161;
        do {
            iArr[i3] -= (int) (iArr[i3] += (int) (Test0238.iFld = (int) (i3 * 39.114F)));
            by1 += (byte) iMeth(Test0238.iFld, Test0238.iFld, b1);
            if (b1) {
                for (i6 = 28; i6 > 1; i6--) {
                    iArr[i6 - 1] |= i6;
                    for (i8 = 2; i8 > 1; i8--) {
                        try {
                            Test0238.iFld = (i6 / -35611);
                            iArr[i3 + 1] = (i7 % Test0238.iFld);
                            iArr[i6] = (51931 % iArr[i3]);
                        } catch (ArithmeticException a_e) {}
                        Test0238.dFld += Test0238.instanceCount;
                        i9 = 25358;
                        lArr[(i6 >>> 1) % N] += Test0238.instanceCount;
                        i9 *= i9;
                        Test0238.dFld = i6;
                        i9 += (i8 * i8);
                    }
                }
            } else {
                i7 += (((i3 * i6) + i3) - by1);
            }
        } while ((i3 -= 3) > 0);
        vMeth_check_sum += i3 + by1 + (b1 ? 1 : 0) + i6 + i7 + i8 + i9 + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(lArr);
    }

    public static boolean bMeth() {

        int i2=6;
        int i10=9;
        int i11=-59807;
        int i12=20741;
        int i13=-180;
        int[] iArr1 =new int[N];
        byte by=-39;

        FuzzerUtils.init(iArr1, -21258);

        i2 = 1;
        do {
            by += (byte) (i2 - Test0238.iFld);
            vMeth();
            try {
                Test0238.iFld = (i2 % -481504112);
                Test0238.iFld = (-495244146 / i2);
                iArr1[i2] = (i2 % 294329900);
            } catch (ArithmeticException a_e) {}
            for (i10 = 1; i10 < 5; i10++) {
                boolean b2=true;
                if (b2) break;
            }
            for (i12 = 5; i12 > 1; i12 -= 3) {
                if (true) {
                    if (i12 != 0) {
                        return ((int)(i2 + by + i10 + i11 + i12 + i13 + FuzzerUtils.checkSum(iArr1))) % 2 > 0;
                    }
                }
                Test0238.iFld *= (int) Test0238.dFld;
                i13 >>= i13;
                Test0238.fFld += 1263251862L;
                if (i11 != 0) {
                    return ((int)(i2 + by + i10 + i11 + i12 + i13 + FuzzerUtils.checkSum(iArr1))) % 2 > 0;
                }
                i11 += (i12 + Test0238.fFld);
                i11 = i10;
            }
        } while (++i2 < 319);
        long meth_res = i2 + by + i10 + i11 + i12 + i13 + FuzzerUtils.checkSum(iArr1);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public void mainTest(String[] strArr1) {

        int i=-132, i1=-56941, i14=-61044, i15=-59, i16=-7, i17=4, i18=0, i19=58618, i20=-6;
        boolean b3=true;
        double d2=19.15297;
        double[] dArr =new double[N];
        long l=59L;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(dArr, -1.119373);
        FuzzerUtils.init(lArr1, -9L);

        for (i = 8; i < 355; i++) {
            double d=0.26327;
            if (bMeth()) continue;
            Test0238.iFld += (((i * Test0238.iFld) + i1) - i);
            Test0238.instanceCount += (((i * Test0238.sFld) + Test0238.fFld) - i);
            Test0238.iFld = i;
            try {
                i1 = (i1 % -214);
                i1 = (Test0238.iArrFld[i + 1] / i1);
                Test0238.iArrFld[i + 1] = (Test0238.iArrFld[i] % Test0238.iFld);
            } catch (ArithmeticException a_e) {}
            d -= Test0238.fFld;
            Test0238.fFld1 = i;
            i1 += Test0238.sFld;
            Test0238.instanceCount = 4;
        }
        i14 = 1;
        while (++i14 < 366) {
            if (b3) break;
            for (i15 = 69; i15 > 1; --i15) {
                Test0238.fFld *= Test0238.fFld1;
                switch ((((i16 >>> 1) % 10) * 5) + 9) {
                case 38:
                    Test0238.fFld += -84;
                    break;
                case 25:
                    for (i17 = i15; i17 < 2; ++i17) {
                        Test0238.instanceCount += i15;
                        lArr1[i17 + 1] |= i15;
                        lArr1[i17 - 1] -= (long) Test0238.fFld;
                    }
                    Test0238.instanceCount += (((i15 * i15) + Test0238.fFld) - Test0238.sFld);
                    for (d2 = 1; d2 < 2; d2++) {
                        lArr1[(int)(d2 - 1)] |= i17;
                        Test0238.fFld = i1;
                    }
                    break;
                case 47:
                    i1 += Test0238.iFld;
                    dArr[i14] = i;
                    i20 = (int) Test0238.instanceCount;
                    i18 = i1;
                    break;
                case 44:
                    lArr1[i14] = Test0238.instanceCount;
                    l += (i15 ^ i);
                case 14:
                case 20:
                    i16 += (i15 * i15);
                    break;
                case 40:
                    try {
                        Test0238.iFld = (-623489499 % i1);
                        Test0238.iArrFld[i14 - 1] = (i1 / i);
                        Test0238.iArrFld[i15 + 1] = (i14 / i19);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 15:
                    Test0238.fFld = 174;
                case 30:
                    i16 += i16;
                    break;
                case 59:
                    i19 *= (int) Test0238.fFld;
                    break;
                default:
                    i18 = i15;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i14 = " + i + "," + i1 + "," + i14);
        FuzzerUtils.out.println("b3 i15 i16 = " + (b3 ? 1 : 0) + "," + i15 + "," + i16);
        FuzzerUtils.out.println("i17 i18 d2 = " + i17 + "," + i18 + "," + Double.doubleToLongBits(d2));
        FuzzerUtils.out.println("i19 i20 l = " + i19 + "," + i20 + "," + l);
        FuzzerUtils.out.println("dArr lArr1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + "," +
            FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test0238.instanceCount Test0238.iFld Test0238.dFld = " + Test0238.instanceCount + "," + Test0238.iFld +
                "," + Double.doubleToLongBits(Test0238.dFld));
        FuzzerUtils.out.println("Test0238.fFld Test0238.sFld Test0238.fFld1 = " + Float.floatToIntBits(Test0238.fFld) + "," + Test0238.sFld
                + "," + Float.floatToIntBits(Test0238.fFld1));
        FuzzerUtils.out.println("Test0238.iArrFld = " + FuzzerUtils.checkSum(Test0238.iArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0238 _instance = new Test0238();
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
//DEBUG  bMeth ->  bMeth mainTest
//DEBUG  vMeth ->  vMeth bMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth bMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}