// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:38 2023
public class Test0556 {

    public static final int N = 400;

    public static long instanceCount=153L;
    public volatile float fFld=1.586F;
    public static volatile byte byFld=-118;
    public static float[] fArrFld =new float[N];
    public static volatile int[] iArrFld =new int[N];
    public volatile double[] dArrFld =new double[N];

    static {
        FuzzerUtils.init(Test0556.fArrFld, 2.661F);
        FuzzerUtils.init(Test0556.iArrFld, 35281);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i13, int i14, long l) {

        double[] dArr =new double[N];

        FuzzerUtils.init(dArr, 0.108277);

        dArr[(i14 >>> 1) % N] -= -234;
        Test0556.iArrFld[(i14 >>> 1) % N] = -65;
        vMeth1_check_sum += i13 + i14 + l + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static int iMeth(int i4, int i5) {

        int i6=-108, i7=-12, i8=-52075, i9=11, i10=-253, i11=-183, i12=24724;
        short s=-31063;
        float f=2.95F;
        boolean b=false;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(lArr1, -20933L);

        i4 <<= i5;
        for (i6 = 10; i6 < 260; ++i6) {
            i8 = 7;
            while (--i8 > 0) {
                Test0556.iArrFld = Test0556.iArrFld;
                s += (short)i8;
                for (i9 = i6; 1 > i9; i9++) {
                    Test0556.instanceCount += (((i9 * f) + i10) - i4);
                    f += (~Test0556.iArrFld[i9 + 1]);
                }
                if (b) {
                    for (i11 = 1; i11 < 1; ++i11) {
                        vMeth1(i12, 45979, Test0556.instanceCount);
                        Test0556.iArrFld[i6] &= (int) Test0556.instanceCount;
                        Test0556.instanceCount = (long) f;
                        lArr1[i8] %= (Test0556.instanceCount | 1);
                    }
                } else {
                    Test0556.instanceCount += (((i8 * Test0556.instanceCount) + f) - i6);
                }
            }
        }
        long meth_res = i4 + i5 + i6 + i7 + i8 + s + i9 + i10 + Float.floatToIntBits(f) + i11 + i12 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i=36419, i1=-6, i2=-63, i3=9, i15=-13160, i16=-54;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, 56956L);

        for (i = 4; i < 234; i++) {
            lArr[i - 1] *= (lArr[i + 1] + i);
            i2 = 7;
            do {
                Test0556.fArrFld[i2 + 1] *= (-(Test0556.iArrFld[i + 1]--));
                i3 = 1;
                do {
                    i1 >>= iMeth(51285, 51660);
                    Test0556.instanceCount = -171L;
                    i1 += i3;
                    if (i2 != 0) {
                        vMeth_check_sum += i + i1 + i2 + i3 + i15 + i16 + FuzzerUtils.checkSum(lArr);
                        return;
                    }
                    i1 += i3;
                    i1 = 130;
                    i1 >>>= i1;
                } while (++i3 < 1);
                for (i15 = 1; i15 < 1; ++i15) {
                    i16 += (((i15 * Test0556.instanceCount) + i16) - i3);
                }
                i1 = (int) Test0556.instanceCount;
            } while (--i2 > 0);
        }
        vMeth_check_sum += i + i1 + i2 + i3 + i15 + i16 + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i17=-12, i18=-49846, i19=-12, i20=-232, i21=-50122, i22=155, i23=-17, i24=59173, i25=-190, i26=201,
            i27=-14, i28=-14, i29=0, i30=33681;
        double d1=2.61030, d2=64.59474;
        short s1=-6178;

        vMeth();
        i17 = -69;
        i17 = i17;
        i18 = 1;
        do {
            Test0556.instanceCount = i18;
            for (i19 = 3; i19 < 124; ++i19) {
                i20 += i19;
                i20 += (((i19 * Test0556.instanceCount) + i17) - Test0556.instanceCount);
                for (i21 = 1; 2 > i21; i21++) {
                    Test0556.instanceCount -= Test0556.instanceCount;
                }
                i17 = 21361;
                Test0556.instanceCount = (long) 11.106633;
                for (i23 = 1; i23 < 2; ++i23) {
                    double d=2.130626;
                    i22 += i23;
                    Test0556.instanceCount = (long) d;
                }
                i17 += i22;
                Test0556.iArrFld[i19] = i18;
                for (d1 = 1; 2 > d1; d1++) {
                    Test0556.iArrFld[i19] = (int) d1;
                    i20 += (int)(((d1 * i22) + s1) - fFld);
                    Test0556.iArrFld[i19] = i25;
                    dArrFld[i19] -= s1;
                    i17 = i26;
                }
            }
            for (i27 = 4; i27 < 124; ++i27) {
                i17 *= (int) Test0556.instanceCount;
                i17 *= (int) Test0556.instanceCount;
            }
            switch ((((i19 >>> 1) % 8) * 5) + 69) {
            case 95:
                for (i29 = i18; i29 < 124; i29 += 2) {
                    s1 = Test0556.byFld;
                    d2 = -7;
                }
                break;
            case 87:
                i22 = (int)7L;
            case 75:
                i25 += (i18 ^ Test0556.instanceCount);
                break;
            case 107:
                Test0556.iArrFld[i18 + 1] %= (int) (i19 | 1);
                break;
            case 93:
                Test0556.iArrFld = Test0556.iArrFld;
                break;
            case 79:
                i20 = (int)146L;
                break;
            case 90:
                fFld = Test0556.instanceCount;
                break;
            case 74:
                Test0556.instanceCount += (((i18 * i25) + Test0556.instanceCount) - i21);
            }
        } while (++i18 < 203);

        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 d1 = " + i23 + "," + i24 + "," + Double.doubleToLongBits(d1));
        FuzzerUtils.out.println("i25 s1 i26 = " + i25 + "," + s1 + "," + i26);
        FuzzerUtils.out.println("i27 i28 i29 = " + i27 + "," + i28 + "," + i29);
        FuzzerUtils.out.println("i30 d2 = " + i30 + "," + Double.doubleToLongBits(d2));

        FuzzerUtils.out.println("Test0556.instanceCount fFld Test0556.byFld = " + Test0556.instanceCount + "," +
                Float.floatToIntBits(fFld) + "," + Test0556.byFld);
        FuzzerUtils.out.println("Test0556.fArrFld Test0556.iArrFld dArrFld = " +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0556.fArrFld)) + "," + FuzzerUtils.checkSum(Test0556.iArrFld) +
            "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0556 _instance = new Test0556();
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