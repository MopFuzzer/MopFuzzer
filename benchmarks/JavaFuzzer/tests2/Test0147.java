// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:18 2023
public class Test0147 {

    public static final int N = 400;

    public static long instanceCount=-1072967641L;
    public static short sFld=-28588;
    public static byte byFld=-89;
    public static volatile int iFld=-36247;
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0147.iArrFld, 1);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(boolean b, long l) {

        double d1=0.8175, d2=-109.69917;
        int i6=12305, i7=4, i9=-42, i10=18321, i11=59758, i12=116, i13=-5724;
        float f1=0.252F;

        d1 *= -11L;
        for (i6 = 1; i6 < 215; i6++) {
            l ^= i6;
            d2 = f1;
            for (i9 = 1; i9 < 8; i9++) {
                Test0147.iArrFld[i9] ^= i9;
                i7 = (int) Test0147.instanceCount;
                for (i11 = 1; i11 < 2; ++i11) {
                    i12 = i9;
                    i10 += (((i11 * i6) + i12) - l);
                    i12 >>= (int) Test0147.instanceCount;
                    Test0147.iArrFld[i6] = (int) l;
                    i7 = i13;
                    Test0147.instanceCount += (i11 * i11);
                    i13 += (i11 * i13);
                }
            }
        }
        vMeth1_check_sum += (b ? 1 : 0) + l + Double.doubleToLongBits(d1) + i6 + i7 + Double.doubleToLongBits(d2) +
            Float.floatToIntBits(f1) + i9 + i10 + i11 + i12 + i13;
    }

    public static void vMeth() {

        int i4=-9, i14=-33, i15=-240;
        double d=121.67023;
        double[] dArr =new double[N];
        boolean b1=false;
        float[] fArr =new float[N];
        short[] sArr =new short[N];

        FuzzerUtils.init(fArr, 17.142F);
        FuzzerUtils.init(sArr, (short)23903);
        FuzzerUtils.init(dArr, -11.27755);

        Test0147.sFld += (short) fArr[(i4 >>> 1) % N];
        for (int i5 : Test0147.iArrFld) {
            i5 ^= Short.reverseBytes((short)(sArr[(i5 >>> 1) % N] = (short)(d + -37.824F)));
            i5 += (int)d;
            vMeth1(b1, Test0147.instanceCount);
            Test0147.instanceCount <<= Test0147.instanceCount;
            i4 = Test0147.byFld;
            Test0147.instanceCount = -12L;
            i4 += i5;
            for (i14 = 1; i14 < 4; i14++) {
                if (i4 != 0) {
                    vMeth_check_sum += i4 + Double.doubleToLongBits(d) + (b1 ? 1 : 0) + i14 + i15 +
                        Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(sArr) +
                        Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                    return;
                }
                dArr[i14] = 21977;
            }
        }
        fArr[(i14 >>> 1) % N] -= Test0147.instanceCount;
        i15 = i14;
        d = i4;
        vMeth_check_sum += i4 + Double.doubleToLongBits(d) + (b1 ? 1 : 0) + i14 + i15 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(sArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static int iMeth(int i1, float f) {

        int i2=-5393, i3=10, i16=-52270, i17=-73, i18=-91, i19=9, i21=206, i22=-177;
        double d3=1.25323;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(lArr1, 1443549541182046921L);

        for (i2 = 14; i2 < 347; i2++) {
            i3 = (int)f;
            vMeth();
            i3 -= i2;
        }
        for (i16 = 10; i16 < 198; i16 += 2) {
            d3 = -9;
            for (i18 = 16; i18 > i16; i18--) {
                int i20=155;
                f += (((i18 * i1) + f) - i1);
                i19 <<= 44987;
                f -= i20;
                for (i21 = i18; i21 < 1; i21++) {
                    i17 += (i21 | i21);
                    lArr1[i16 - 1] += i21;
                    i1 += (1 + (i21 * i21));
                    i17 -= (int)f;
                }
            }
        }
        long meth_res = i1 + Float.floatToIntBits(f) + i2 + i3 + i16 + i17 + Double.doubleToLongBits(d3) + i18 + i19 +
            i21 + i22 + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=47136, i23=-145, i24=0, i25=-41, i26=-124, i27=161, i28=-14, i29=178, i30=2, i31=61, i32=4, i33=52062;
        float f2=2.105F;
        double d4=117.118427;
        long[] lArr =new long[N];
        byte[] byArr =new byte[N];

        FuzzerUtils.init(lArr, 59418L);
        FuzzerUtils.init(byArr, (byte)96);

        i = 1;
        while (++i < 334) {
            lArr[i + 1] = (iMeth(6, -44.481F) * i);
        }
        i23 = 1;
        while (++i23 < 214) {
            f2 = i23;
            d4 = f2;
        }
        for (i24 = 2; 234 > i24; i24++) {
            f2 += i23;
            i25 = i;
            i25 += (int) Test0147.instanceCount;
            byArr[i24 - 1] = (byte)96;
            i25 <<= -40572;
        }
        Test0147.instanceCount <<= i23;
        f2 *= Test0147.instanceCount;
        for (i26 = 9; i26 < 378; i26++) {
            i25 += (i26 * Test0147.instanceCount);
        }
        d4 -= i25;
        for (i28 = 126; 6 < i28; --i28) {
            for (i30 = 9; i30 < 209; ++i30) {
                Test0147.instanceCount += i30;
                Test0147.iFld += 13;
                d4 = i30;
                i29 >>= i26;
                for (i32 = 2; i32 > i30; i32 -= 2) {
                    Test0147.iFld -= (int) Test0147.instanceCount;
                    Test0147.instanceCount = 113L;
                    Test0147.instanceCount += i32;
                    if (true) {
                        Test0147.iArrFld[i30 - 1] = i31;
                        Test0147.iArrFld[i28 + 1] >>>= i29;
                        Test0147.iArrFld[i32 - 1] /= (int) (i27 | 1);
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i23 f2 = " + i + "," + i23 + "," + Float.floatToIntBits(f2));
        FuzzerUtils.out.println("d4 i24 i25 = " + Double.doubleToLongBits(d4) + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 i27 i28 = " + i26 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("i29 i30 i31 = " + i29 + "," + i30 + "," + i31);
        FuzzerUtils.out.println("i32 i33 lArr = " + i32 + "," + i33 + "," + FuzzerUtils.checkSum(lArr));
        FuzzerUtils.out.println("byArr = " + FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test0147.instanceCount Test0147.sFld Test0147.byFld = " + Test0147.instanceCount + "," + Test0147.sFld +
                "," + Test0147.byFld);
        FuzzerUtils.out.println("Test0147.iFld Test0147.iArrFld = " + Test0147.iFld + "," + FuzzerUtils.checkSum(Test0147.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0147 _instance = new Test0147();
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
