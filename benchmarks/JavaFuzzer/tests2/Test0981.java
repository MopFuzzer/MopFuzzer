// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:58 2023
public class Test0981 {

    public static final int N = 400;

    public static long instanceCount=-126L;
    public static byte byFld=55;
    public static double dFld=9.128769;
    public static volatile float fFld=1.210F;
    public static volatile boolean bFld=true;
    public static volatile long[] lArrFld =new long[N];
    public static boolean[] bArrFld =new boolean[N];
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0981.lArrFld, 34532L);
        FuzzerUtils.init(Test0981.bArrFld, false);
        FuzzerUtils.init(Test0981.iArrFld, -15331);
    }

    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i11) {

        boolean b=false;
        int i12=-2, i13=10, i14=147;
        byte[] byArr =new byte[N];

        FuzzerUtils.init(byArr, (byte)73);

        b = false;
        i11 += 230;
        i12 = 1;
        while (++i12 < 123) {
            Test0981.instanceCount = i12;
            Test0981.instanceCount += (i12 * i12);
        }
        i11 += i11;
        Test0981.dFld *= i11;
        byArr[(1 >>> 1) % N] <<= (byte)i12;
        for (i13 = 251; i13 > 6; --i13) {
            Test0981.byFld += (byte) i13;
            Test0981.byFld = (byte) Test0981.fFld;
            i11 <<= i14;
        }
        vMeth_check_sum += i11 + (b ? 1 : 0) + i12 + i13 + i14 + FuzzerUtils.checkSum(byArr);
    }

    public static int iMeth(long l) {

        int i8=19;
        int i9=11794;
        int i10=175;
        int i15=8;
        int i16=3;
        int i17=-7;
        int i18=-19487;
        int i19=55514;
        int[] iArr =new int[N];
        double d1=-1.59152;
        float f1=2.360F;

        FuzzerUtils.init(iArr, -46974);

        i8 -= (int) Float.intBitsToFloat((int) ((1.139F * Math.abs(d1)) * (++Test0981.lArrFld[(-36 >>> 1) % N])));
        for (i9 = 16; i9 < 331; i9 += 2) {
            if (i9 != 0) {
            }
        }
        i8 = iArr[(i10 >>> 1) % N];
        if (Test0981.bFld) {
            vMeth(i10);
        }
        for (i15 = 12; 193 > i15; i15++) {
            for (f1 = 9; f1 > 1; f1 -= 3) {
                for (i18 = 1; i18 < 5; ++i18) {
                    i8 = Test0981.byFld;
                    Test0981.byFld += (byte) (i18 * i18);
                    Test0981.fFld += (((i18 * i10) + Test0981.instanceCount) - l);
                    if (i17 != 0) {
                    }
                }
            }
            i8 += i15;
            if (Test0981.bFld) continue;
        }
        long meth_res = l + i8 + Double.doubleToLongBits(d1) + i9 + i10 + i15 + i16 + Float.floatToIntBits(f1) + i17 +
            i18 + i19 + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth(double d) {

        int i7=-41439;
        int i20=58319;
        int i21=-2;
        int i22=-7;
        int[] iArr1 =new int[N];
        short s=32182;

        FuzzerUtils.init(iArr1, -270);

        i7 = 1;
        while ((i7 += 2) < 143) {
            Test0981.byFld -= (byte) (iMeth(-2993130468L) + i7);
            switch ((i7 % 7) + 54) {
            case 54:
                Test0981.instanceCount -= Test0981.instanceCount;
                iArr1[i7 - 1] <<= i7;
                break;
            case 55:
                for (i20 = i7; i20 < 22; i20++) {
                    i22 = 1;
                    while (++i22 < 1) {
                        Test0981.fFld = i7;
                        iArr1[i22] -= -80;
                        Test0981.instanceCount -= s;
                        Test0981.instanceCount += i22;
                        if (Test0981.bFld) {
                            i21 = (int) Test0981.instanceCount;
                            Test0981.fFld = i7;
                        } else {
                            i21 = i20;
                        }
                    }
                }
            case 56:
                i21 += i20;
                break;
            case 57:
                s = (short) Test0981.instanceCount;
            case 58:
                s -= (short) Test0981.fFld;
                break;
            case 59:
                Test0981.lArrFld[i7] = i7;
                break;
            case 60:
                Test0981.fFld *= -30596;
                break;
            default:
                Test0981.bArrFld[(i20 >>> 1) % N] = Test0981.bFld;
            }
        }
        long meth_res = Double.doubleToLongBits(d) + i7 + i20 + i21 + i22 + s + FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=5, i1=1, i2=31, i3=-22540, i4=49038, i5=-4, i6=20031, i23=16950, i24=3, i26=-5, i27=244;
        float f=0.210F;
        short s1=25465;

        for (i = 9; i < 264; ++i) {
            for (i2 = 3; i2 < 99; ++i2) {
                i1 -= (int) Test0981.lArrFld[(i >>> 1) % N];
                i3 += (((i2 * i4) + i) - f);
                for (i5 = 1; i5 < 2; ++i5) {
                    Test0981.lArrFld[i2] = lMeth(Test0981.dFld);
                    Test0981.fFld -= i4;
                    i6 += i2;
                    i4 += (((i5 * i6) + i4) - Test0981.instanceCount);
                }
                Test0981.bFld = Test0981.bFld;
                for (i23 = 1; i23 < 2; ++i23) {
                    int i25=29;
                    switch (((i5 >>> 1) % 2) + 63) {
                    case 63:
                        try {
                            i24 = (i3 % Test0981.iArrFld[i2]);
                            i25 = (-36 / i23);
                            i25 = (138 % i2);
                        } catch (ArithmeticException a_e) {}
                        i6 += 58961;
                        break;
                    case 64:
                        i4 = s1;
                        i24 = (int) Test0981.instanceCount;
                        break;
                    }
                    i1 += (i23 ^ (long) Test0981.fFld);
                    i4 += i4;
                }
                switch (((i2 >>> 1) % 2) + 69) {
                case 69:
                    Test0981.instanceCount += (i2 * i2);
                    f += (((i2 * i24) + i) - f);
                    break;
                case 70:
                }
                i3 += (int)201L;
                i1 += (((i2 * Test0981.instanceCount) + i24) - i24);
                s1 += (short)(((i2 * f) + i24) - i23);
            }
            i6 = i2;
            Test0981.iArrFld = FuzzerUtils.int1array(N, (int) -12);
            for (i26 = 99; i < i26; i26--) {
                Test0981.instanceCount ^= -8L;
                Test0981.byFld += (byte) i26;
                i6 += (i26 * i26);
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i4 f = " + i3 + "," + i4 + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("i5 i6 i23 = " + i5 + "," + i6 + "," + i23);
        FuzzerUtils.out.println("i24 s1 i26 = " + i24 + "," + s1 + "," + i26);
        FuzzerUtils.out.println("i27 = " + i27);

        FuzzerUtils.out.println("Test0981.instanceCount Test0981.byFld Test0981.dFld = " + Test0981.instanceCount + "," + Test0981.byFld +
                "," + Double.doubleToLongBits(Test0981.dFld));
        FuzzerUtils.out.println("Test0981.fFld Test0981.bFld Test0981.lArrFld = " + Float.floatToIntBits(Test0981.fFld) + "," +
                (Test0981.bFld ? 1 : 0) + "," + FuzzerUtils.checkSum(Test0981.lArrFld));
        FuzzerUtils.out.println("Test0981.bArrFld Test0981.iArrFld = " + FuzzerUtils.checkSum(Test0981.bArrFld) + "," +
                FuzzerUtils.checkSum(Test0981.iArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0981 _instance = new Test0981();
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  iMeth ->  iMeth lMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
