// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:37 2023
public class Test0538 {

    public static final int N = 400;

    public static long instanceCount=0L;
    public static byte byFld=114;
    public static float fFld=-1.13F;
    public static boolean bFld=true;
    public static float[] fArrFld =new float[N];
    public static int[] iArrFld =new int[N];
    public static double[] dArrFld =new double[N];

    static {
        FuzzerUtils.init(Test0538.fArrFld, -89.665F);
        FuzzerUtils.init(Test0538.iArrFld, 7);
        FuzzerUtils.init(Test0538.dArrFld, -1.98770);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i3) {

        int i4=-117;
        int i5=-10586;
        int i6=11;
        int i7=-6;
        int[] iArr =new int[N];
        double d=60.63439;
        boolean b=false;
        long[] lArr =new long[N];

        FuzzerUtils.init(iArr, -6);
        FuzzerUtils.init(lArr, -53930L);

        i4 = 1;
        while (++i4 < 283) {
            iArr = iArr;
            i3 -= i3;
            i3 = (int) Test0538.instanceCount;
            i3 += i5;
            i5 += (((i4 * i4) + i4) - i4);
            i3 += (i4 | i4);
        }
        for (i6 = 15; i6 < 322; i6++) {
            d = i5;
            i7 += (int) Test0538.fFld;
        }
        lArr = FuzzerUtils.long1array(N, (long)-6480708180639442742L);
        Test0538.instanceCount += i7;
        lArr[(i7 >>> 1) % N] = Test0538.instanceCount;
        b = b;
        vMeth2_check_sum += i3 + i4 + i5 + i6 + i7 + Double.doubleToLongBits(d) + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1(int i, int i1, int i2) {

        float f=-2.330F;
        int i8=8, i9=192, i10=40280, i11=-15189, i12=49554, i13=64822;
        double d1=-62.101745;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(lArr1, 224L);

        f = (((Test0538.byFld++) + (i ^= -27231)) - ((-i1) * (-(-Math.abs(i2)))));
        vMeth2(17665);
        i1 -= i1;
        for (i8 = 4; i8 < 337; i8++) {
            lArr1 = lArr1;
            d1 += -8;
            for (i10 = 1; i10 < 5; ++i10) {
                i11 += i2;
                f *= i11;
            }
            for (i12 = 1; i12 < 5; ++i12) {
                i9 += i12;
                switch ((i8 % 2) + 101) {
                case 101:
                    Test0538.instanceCount = -62;
                case 102:
                    i2 -= i11;
                    i13 = i12;
                    break;
                default:
                    Test0538.fArrFld[i8] = -6;
                }
            }
        }
        vMeth1_check_sum += i + i1 + i2 + Float.floatToIntBits(f) + i8 + i9 + Double.doubleToLongBits(d1) + i10 + i11 +
            i12 + i13 + FuzzerUtils.checkSum(lArr1);
    }

    public static void vMeth() {

        int i14=-3, i15=1, i16=-61151, i17=-11, i18=9796;

        vMeth1(i14, i14, i14);
        Test0538.instanceCount = i14;
        i15 = 229;
        do {
            Test0538.fFld += i15;
            Test0538.fFld += (i15 * i15);
            i14 += (i15 ^ Test0538.instanceCount);
            i14 >>= i15;
            i14 = i14;
            for (i16 = 1; i16 < 14; i16++) {
                if (Test0538.bFld) break;
                i17 = i16;
                i18 = 1;
                while (++i18 < 2) {
                    i14 -= (int)-107L;
                    i14 = (int) Test0538.instanceCount;
                    Test0538.iArrFld[i15 - 1] -= (int) -60691L;
                }
            }
        } while ((i15 -= 2) > 0);
        vMeth_check_sum += i14 + i15 + i16 + i17 + i18;
    }

    public void mainTest(String[] strArr1) {

        int i19=113, i20=63581, i21=-96, i22=-13, i23=-33749, i24=38151, i25=-166;
        double d2=-46.88633;
        long[] lArr2 =new long[N];

        FuzzerUtils.init(lArr2, -45L);

        vMeth();
        i19 += i19;
        for (i20 = 1; 154 > i20; i20++) {
            Test0538.fFld += i19;
            i19 += (i20 | i20);
            lArr2[i20] = (long)d2;
            i21 += i20;
            for (i22 = 8; i22 < 164; ++i22) {
                for (i24 = 1; i24 < 2; ++i24) {
                    switch ((i20 % 4) + 42) {
                    case 42:
                        i23 = (int) Test0538.instanceCount;
                        if (Test0538.bFld) {
                            i21 += (int) Test0538.instanceCount;
                            Test0538.instanceCount = 9L;
                        }
                        d2 *= i19;
                        break;
                    case 43:
                        i25 += Test0538.byFld;
                        Test0538.fFld -= i23;
                    case 44:
                        Test0538.dArrFld[i22 - 1] = Test0538.instanceCount;
                        try {
                            i23 = (Test0538.iArrFld[i20 - 1] / i20);
                            i25 = (i22 / i23);
                            i21 = (i20 / i25);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 45:
                    }
                    i21 += (i24 * i24);
                    i19 += (i24 * i22);
                    switch ((((69 >>> 1) % 2) * 5) + 33) {
                    case 35:
                        Test0538.fArrFld[i20 + 1] = 4;
                        Test0538.instanceCount = i19;
                        break;
                    case 42:
                        i23 <<= 16;
                        i25 += (i24 | i23);
                    default:
                        switch (((i22 % 2) * 5) + 68) {
                        case 69:
                            i21 = -108;
                            i23 >>= (int) Test0538.instanceCount;
                            i25 = (int) Test0538.instanceCount;
                            break;
                        case 77:
                            i25 *= (int) Test0538.instanceCount;
                        }
                    }
                }
            }
        }

        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("d2 i22 i23 = " + Double.doubleToLongBits(d2) + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 lArr2 = " + i24 + "," + i25 + "," + FuzzerUtils.checkSum(lArr2));

        FuzzerUtils.out.println("Test0538.instanceCount Test0538.byFld Test0538.fFld = " + Test0538.instanceCount + "," + Test0538.byFld +
                "," + Float.floatToIntBits(Test0538.fFld));
        FuzzerUtils.out.println("Test0538.bFld Test0538.fArrFld Test0538.iArrFld = " + (Test0538.bFld ? 1 : 0) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0538.fArrFld)) + "," + FuzzerUtils.checkSum(Test0538.iArrFld));
        FuzzerUtils.out.println("Test0538.dArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0538.dArrFld)));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0538 _instance = new Test0538();
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
