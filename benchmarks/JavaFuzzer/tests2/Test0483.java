// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:35 2023
public class Test0483 {

    public static final int N = 400;

    public static long instanceCount=-14L;
    public short sFld=-5278;
    public int[][] iArrFld =new int[N][N];
    public long[] lArrFld =new long[N];

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i8) {

        int i9=7834;
        int i10=-2;
        int i11=55;
        int i12=-45590;
        int[] iArr =new int[N];
        double d1=-18.50582;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -23183L);
        FuzzerUtils.init(iArr, 251);

        for (long l : lArr) {
            l = i8;
            Test0483.instanceCount = Test0483.instanceCount;
            l = i9;
            try {
                i9 = (-73 % i9);
                i8 = (i9 % 179);
                i9 = (i9 / i9);
            } catch (ArithmeticException a_e) {}
            l = i8;
            i10 = 1;
            do {
                i8 = (int)l;
                for (i11 = 1; 1 > i11; ++i11) {
                    d1 += i10;
                    iArr[i11] >>= (int)-164L;
                    i9 *= i8;
                    lArr[i10 - 1] = -139;
                    i8 -= (int)l;
                    i9 += (i11 * i11);
                }
            } while (++i10 < 4);
        }
        vMeth1_check_sum += i8 + i9 + i10 + i11 + i12 + Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr);
    }

    public void vMeth(int i3, int i4, int i5) {

        int i6=237, i7=-63292, i13=8, i14=-53, i15=-119;
        float f2=90.963F;
        float[] fArr =new float[N];

        FuzzerUtils.init(fArr, 1.876F);

        for (i6 = 340; i6 > 4; i6 -= 3) {
            vMeth1(-62479);
            Test0483.instanceCount += 36133;
            Test0483.instanceCount = i5;
            i13 = 1;
            while (++i13 < 14) {
                fArr[i6 + 1] += Test0483.instanceCount;
                i4 = 7;
                i3 >>= i4;
                iArrFld[i13 - 1][i6 - 1] = (int) Test0483.instanceCount;
            }
            iArrFld[i6 - 1][i6 + 1] *= i4;
            for (i14 = 1; i14 < 14; ++i14) {
                f2 -= i13;
                i4 -= (int) Test0483.instanceCount;
                Test0483.instanceCount += i5;
                i15 -= (int) Test0483.instanceCount;
            }
        }
        vMeth_check_sum += i3 + i4 + i5 + i6 + i7 + i13 + i14 + i15 + Float.floatToIntBits(f2) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public long lMeth(float f1) {

        int i16=-71, i17=-1, i18=-3, i19=-6, i20=-53267, i21=-5, i22=14;

        vMeth(i16, 0, i16);
        Test0483.instanceCount += Test0483.instanceCount;
        for (i17 = 214; i17 > 9; --i17) {
            double d2=0.9942;
            i16 += i17;
            f1 = f1;
            d2 += i18;
            i16 /= (int) (Test0483.instanceCount | 1);
            for (i19 = 1; i19 < 8; ++i19) {
                i20 += (i19 - i18);
                sFld += (short)i19;
                for (i21 = 1; i21 < 2; i21++) {
                    f1 *= f1;
                }
            }
            f1 += i17;
            f1 += (i17 * i17);
            f1 = i16;
        }
        long meth_res = Float.floatToIntBits(f1) + i16 + i17 + i18 + i19 + i20 + i21 + i22;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-8, i1=3, i2=143, i23=-2767, i24=233, i25=-107, i26=178;
        float f=-2.1022F;
        float[] fArr1 =new float[N];
        double d=51.57097;
        double[] dArr =new double[N];
        byte[] byArr =new byte[N];

        FuzzerUtils.init(dArr, -74.347);
        FuzzerUtils.init(byArr, (byte)-127);
        FuzzerUtils.init(fArr1, -71.548F);

        for (i = 7; 149 > i; ++i) {
            for (f = 4; f < 177; ++f) {
                d = Math.min((int)(lMeth(f) + f), 12767);
                i1 = -13;
                i2 = i;
                i1 -= i1;
                i1 += (int)f;
                for (i23 = 1; 2 > i23; ++i23) {
                    float f3=-62.723F;
                    f3 += f;
                    dArr[i23] -= Test0483.instanceCount;
                    byArr[(int) (f)] -= (byte) Test0483.instanceCount;
                    Test0483.instanceCount <<= i2;
                    i1 = (int) Test0483.instanceCount;
                }
                for (i25 = 2; i25 > 1; --i25) {
                    fArr1[(int)(f)] -= i23;
                    i26 = (int) Test0483.instanceCount;
                    i24 += i25;
                }
                Test0483.instanceCount >>>= i2;
                lArrFld[i] -= 2915118116698939050L;
                i26 |= 2;
            }
            iArrFld[i + 1][i + 1] >>= -24436;
            Test0483.instanceCount >>>= i1;
            Test0483.instanceCount *= Test0483.instanceCount;
            sFld *= (short) Test0483.instanceCount;
            i1 = i1;
            i2 *= i;
            Test0483.instanceCount = i24;
            lArrFld[i - 1] = i1;
        }

        FuzzerUtils.out.println("i i1 f = " + i + "," + i1 + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("i2 d i23 = " + i2 + "," + Double.doubleToLongBits(d) + "," + i23);
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("dArr byArr fArr1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + "," +
            FuzzerUtils.checkSum(byArr) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));

        FuzzerUtils.out.println("Test0483.instanceCount sFld iArrFld = " + Test0483.instanceCount + "," + sFld + "," +
            FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("lArrFld = " + FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0483 _instance = new Test0483();
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
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
