// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:12 2023
public class Test0005 {

    public static final int N = 400;

    public static volatile long instanceCount=-1786620055L;
    public static byte byFld=127;
    public static long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test0005.lArrFld, 9926L);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(double d, int i5) {

        int i6=-10, i7=-116, i8=-4, i9=-1, i10=17591, i11=19795;
        float f=35.520F;
        short s=-4276;

        i5 = i5;
        i6 = 262;
        do {
            i5 = i5;
            i5 = i5;
            i5 |= i5;
        } while (--i6 > 0);
        for (i7 = 212; i7 > 9; i7--) {
            i5 = (int)d;
            for (i9 = i7; i9 < 8; ++i9) {
                byte by=54;
                for (f = 1; f < 1; ++f) {
                    i10 -= i11;
                    s <<= (short)i10;
                    i8 -= (int) Test0005.instanceCount;
                    i8 += i6;
                }
                i8 += i9;
                by >>= (byte)i8;
            }
        }
        vMeth1_check_sum += Double.doubleToLongBits(d) + i5 + i6 + i7 + i8 + i9 + i10 + Float.floatToIntBits(f) + i11 +
            s;
    }

    public static int iMeth(int i2, int i3, int i4) {

        double d1=1.7781;
        int i12=-36134;
        int i13=-2018;
        int i14=0;
        int i15=-11;
        int[] iArr =new int[N];
        boolean b=false;
        long[] lArr =new long[N];

        FuzzerUtils.init(iArr, -203);
        FuzzerUtils.init(lArr, 2L);

        vMeth1(d1, 2);
        i12 = 364;
        do {
            b = b;
        } while (--i12 > 0);
        i3 = (int) Test0005.instanceCount;
        Test0005.instanceCount &= i12;
        for (i13 = 17; i13 < 343; i13++) {
            try {
                iArr[i13 - 1] = (i12 / i4);
                i4 = (i14 / iArr[i13 + 1]);
                i2 = (iArr[i13] % 1354475152);
            } catch (ArithmeticException a_e) {}
            d1 -= Test0005.instanceCount;
            i15 = 1;
            do {
                lArr[i15 + 1] *= i12;
                i14 -= (int)d1;
                i14 += (((i15 * Test0005.instanceCount) + Test0005.instanceCount) - i3);
                i2 <<= (int) Test0005.instanceCount;
                Test0005.instanceCount *= Test0005.instanceCount;
                i14 >>= i14;
            } while (++i15 < 5);
        }
        long meth_res = i2 + i3 + i4 + Double.doubleToLongBits(d1) + i12 + (b ? 1 : 0) + i13 + i14 + i15 +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i) {

        int i1=-6, i16=-99, i17=-1600, i18=-209, i19=26, i20=12, i21=4;

        i1 = 1;
        while (++i1 < 128) {
            Test0005.instanceCount += Integer.reverseBytes(iMeth(i1, i1, i1));
            for (i16 = 1; 12 > i16; ++i16) {
                for (i18 = 1; i18 < 2; ++i18) {
                    i19 = (int) Test0005.instanceCount;
                    Test0005.instanceCount >>= i18;
                    i19 += (((i18 * i) + Test0005.instanceCount) - i16);
                    i -= -9152;
                }
                Test0005.instanceCount |= i19;
                Test0005.lArrFld[i1] = i16;
                for (i20 = 1; 2 > i20; i20++) {
                    i += i;
                    Test0005.lArrFld[i20 - 1] >>>= i;
                    i += i20;
                    i19 -= i16;
                }
            }
        }
        vMeth_check_sum += i + i1 + i16 + i17 + i18 + i19 + i20 + i21;
    }

    public void mainTest(String[] strArr1) {

        int i22=-62;
        int i23=-12;
        int i24=-30523;
        int i25=-11;
        int i26=223;
        int i27=140;
        int i28=-75;
        int i29=75;
        int i30=5;
        int i31=-250;
        int[] iArr1 =new
                    int[N];
        double d2=1.92370;
        double[][] dArr =new double[N][N];
        short s1=-1989;
        float f1=-2.336F;

        FuzzerUtils.init(iArr1, -124);
        FuzzerUtils.init(dArr, -1.42299);

        vMeth(14142);
        Test0005.instanceCount = Test0005.byFld;
        for (i22 = 1; i22 < 267; ++i22) {
            i24 = 1;
            do {
                iArr1[i22 + 1] -= i23;
                i23 = (int) Test0005.instanceCount;
                Test0005.instanceCount = -32753;
                Test0005.instanceCount &= -223;
                i23 = i23;
                d2 -= i24;
            } while (++i24 < 94);
        }
        Test0005.lArrFld = FuzzerUtils.long1array(N, (long) -51L);
        i23 ^= (int) Test0005.instanceCount;
        iArr1[(-8 >>> 1) % N] -= i23;
        i23 >>>= i22;
        i23 |= Test0005.byFld;
        i23 &= i25;
        for (i26 = 9; i26 < 197; i26++) {
            i27 = s1;
            if (true) {
                for (i28 = i26; i28 < 133; i28++) {
                    i27 = (int) Test0005.instanceCount;
                    i27 = i24;
                }
                switch ((i26 % 1) + 50) {
                case 50:
                    dArr[i26 + 1][i26] += i26;
                    i23 += i26;
                    Test0005.instanceCount *= (long) f1;
                    for (i30 = i26; 133 > i30; ++i30) {
                        Test0005.instanceCount -= -275689778L;
                        i25 ^= i30;
                        s1 = (short)f1;
                    }
                default:
                    iArr1[i26 + 1] -= i28;
                }
            }
        }

        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("d2 i25 i26 = " + Double.doubleToLongBits(d2) + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 s1 i28 = " + i27 + "," + s1 + "," + i28);
        FuzzerUtils.out.println("i29 f1 i30 = " + i29 + "," + Float.floatToIntBits(f1) + "," + i30);
        FuzzerUtils.out.println("i31 iArr1 dArr = " + i31 + "," + FuzzerUtils.checkSum(iArr1) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test0005.instanceCount Test0005.byFld Test0005.lArrFld = " + Test0005.instanceCount + "," + Test0005.byFld
                + "," + FuzzerUtils.checkSum(Test0005.lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0005 _instance = new Test0005();
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
