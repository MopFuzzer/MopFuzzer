// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:56 2023
public class Test0929 {

    public static final int N = 400;

    public static long instanceCount=-4261636742L;
    public static volatile double dFld=0.44191;
    public static float fFld=2.317F;
    public static short sFld=29201;
    public static int[] iArrFld =new int[N];
    public static volatile long[] lArrFld =new long[N];
    public static float[] fArrFld =new float[N];

    static {
        FuzzerUtils.init(Test0929.iArrFld, -61067);
        FuzzerUtils.init(Test0929.lArrFld, -53446L);
        FuzzerUtils.init(Test0929.fArrFld, -1.781F);
    }

    public static long bMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l, int i5, float f) {

        double d1=-1.44323;
        int i6=-6, i7=106, i8=6939, i9=-10;
        short s=-30640;
        byte by=-80;
        boolean b=false;
        float[] fArr =new float[N];

        FuzzerUtils.init(fArr, 0.343F);

        fArr[(i5 >>> 1) % N] *= i5;
        for (d1 = 14; d1 < 235; d1++) {
            i7 = 1;
            while (++i7 < 7) {
                if (false) continue;
            }
            i8 = 1;
            do {
                switch ((int)(((d1 % 5) * 5) + 64)) {
                case 77:
                    s += (short)i8;
                    i9 = 1;
                    while (++i9 < 1) {
                        Test0929.instanceCount = -871;
                        Test0929.lArrFld[(int) (d1)] >>= i6;
                        Test0929.dFld = i7;
                        i6 += (i9 + i7);
                        Test0929.iArrFld = FuzzerUtils.int1array(N, (int) 12);
                        Test0929.iArrFld[i8 - 1] = (int) Test0929.instanceCount;
                        Test0929.instanceCount *= l;
                    }
                    break;
                case 83:
                    by += (byte)185;
                    break;
                case 72:
                    i5 += (((i8 * by) + i7) - i7);
                case 78:
                    Test0929.iArrFld = Test0929.iArrFld;
                case 82:
                    b = b;
                    break;
                }
            } while (++i8 < 7);
        }
        vMeth1_check_sum += l + i5 + Float.floatToIntBits(f) + Double.doubleToLongBits(d1) + i6 + i7 + i8 + s + i9 + by
            + (b ? 1 : 0) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth(int i4) {

        int i10=-9, i11=48501, i12=14, i13=-168;
        boolean b1=false;
        double[] dArr =new double[N];

        FuzzerUtils.init(dArr, -2.106431);

        vMeth1(10L, i4, Test0929.fFld);
        if (b1) {
            i10 = 1;
            while (++i10 < 183) {
                i4 = (int) Test0929.instanceCount;
                i4 <<= i4;
                i11 = 1;
                while (++i11 < 9) {
                    for (i12 = 1; i12 < 1; i12++) {
                        switch ((i11 % 1) + 77) {
                        case 77:
                            i4 += (int) Test0929.dFld;
                            i13 += (int) Test0929.dFld;
                            i13 += i12;
                            break;
                        default:
                            i13 += i4;
                            dArr = FuzzerUtils.double1array(N, (double)69.105154);
                            Test0929.dFld += Test0929.sFld;
                            i13 = i13;
                        }
                    }
                }
            }
        }
        vMeth_check_sum += i4 + i10 + i11 + i12 + i13 + (b1 ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static boolean bMeth() {

        int i14=-59, i15=4, i16=46023, i17=-228, i18=237, i19=11, i20=-112;
        double[] dArr1 =new double[N];

        FuzzerUtils.init(dArr1, 10.114540);

        vMeth(i14);
        for (i15 = 5; i15 < 122; i15++) {
            i16 = (int) Test0929.instanceCount;
            Test0929.iArrFld[i15] = i15;
            dArr1[i15 - 1] += i14;
            Test0929.fFld += Test0929.fFld;
            for (i17 = 1; i17 < 13; ++i17) {
                Test0929.fArrFld[i15 - 1] += 4;
                for (i19 = 1; i19 < 2; ++i19) {
                    i20 = Test0929.sFld;
                    Test0929.dFld -= i16;
                    i16 = (int) Test0929.instanceCount;
                    try {
                        i20 = (i19 % -188);
                        i14 = (i15 / -49256);
                        i14 = (i16 / 626404730);
                    } catch (ArithmeticException a_e) {}
                    Test0929.instanceCount = (long) Test0929.dFld;
                    i20 = (int) Test0929.fFld;
                }
            }
        }
        long meth_res = i14 + i15 + i16 + i17 + i18 + i19 + i20 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1));
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public void mainTest(String[] strArr1) {

        int i=-120, i1=19844, i2=2, i3=6, i21=40, i22=42302, i23=-11, i24=130, i25=50941, i26=-82, i27=-12363;
        double d=33.120526;
        long l1=4600122420743946428L;

        for (i = 11; i < 362; ++i) {
            i2 = 1;
            do {
                Test0929.iArrFld[i + 1] = (int) (((i2 * -98) - Test0929.dFld) + (i1 - Test0929.instanceCount));
                Test0929.instanceCount += i2;
                i1 += (int) Test0929.fFld;
                Test0929.iArrFld[i + 1] = (int) (i1 - Test0929.instanceCount);
                for (d = 1; d > 1; d--) {
                    i1 += (int) ((long) d | Test0929.instanceCount);
                    if (bMeth()) break;
                    switch ((int)((d % 2) + 70)) {
                    case 70:
                    case 71:
                        i3 = i3;
                    }
                    Test0929.instanceCount = i;
                }
                i3 = i1;
                Test0929.instanceCount += i3;
            } while (++i2 < 72);
            for (i21 = 3; i21 < 72; ++i21) {
                boolean b2=false;
                if (b2) {
                    i22 = i;
                    for (l1 = 1; l1 < 2; l1++) {
                        Test0929.dFld -= i23;
                        i23 >>= (int)l1;
                        i23 *= (int)l1;
                    }
                    i3 = (int) Test0929.instanceCount;
                }
            }
            i22 <<= i23;
            for (i24 = i; 72 > i24; i24++) {
                i3 += (((i24 * i3) + i23) - i23);
                i23 = (int)l1;
                Test0929.dFld += -43;
                for (i26 = 1; i26 < 1; ++i26) {
                    if (true) continue;
                    i27 += 62;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("d i3 i21 = " + Double.doubleToLongBits(d) + "," + i3 + "," + i21);
        FuzzerUtils.out.println("i22 l1 i23 = " + i22 + "," + l1 + "," + i23);
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 = " + i27);

        FuzzerUtils.out.println("Test0929.instanceCount Test0929.dFld Test0929.fFld = " + Test0929.instanceCount + "," +
                Double.doubleToLongBits(Test0929.dFld) + "," + Float.floatToIntBits(Test0929.fFld));
        FuzzerUtils.out.println("Test0929.sFld Test0929.iArrFld Test0929.lArrFld = " + Test0929.sFld + "," +
                FuzzerUtils.checkSum(Test0929.iArrFld) + "," + FuzzerUtils.checkSum(Test0929.lArrFld));
        FuzzerUtils.out.println("Test0929.fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0929.fArrFld)));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0929 _instance = new Test0929();
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
//DEBUG  vMeth1 ->  vMeth1 vMeth bMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
