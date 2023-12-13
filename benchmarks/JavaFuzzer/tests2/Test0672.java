// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:43 2023
public class Test0672 {

    public static final int N = 400;

    public static long instanceCount=65361L;
    public static byte byFld=-8;
    public static boolean bFld=false;
    public static short sFld=27484;
    public double dFld=0.83453;
    public float fFld=-2.357F;
    public static float[][] fArrFld =new float[N][N];
    public long[] lArrFld =new long[N];
    public static short[] sArrFld =new short[N];

    static {
        FuzzerUtils.init(Test0672.fArrFld, 0.889F);
        FuzzerUtils.init(Test0672.sArrFld, (short) -23015);
    }

    public static long lMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long fMeth1_check_sum = 0;

    public static float fMeth1(double d1) {

        int i7=216;
        int i8=-202;
        int i9=-264;
        int[] iArr1 =new int[N];
        float f1=-1.478F;
        long[] lArr =new long[N];

        FuzzerUtils.init(iArr1, 1);
        FuzzerUtils.init(lArr, -4641379753786971485L);

        i7 = 1;
        while ((i7 += 2) < 320) {
            iArr1[i7] >>>= i7;
            iArr1[i7 - 1] >>= (int) Test0672.instanceCount;
        }
        iArr1[(107 >>> 1) % N] -= Test0672.byFld;
        lArr[(i7 >>> 1) % N] -= 56833;
        for (i8 = 284; i8 > 10; i8 -= 2) {
            i9 >>= i8;
            Test0672.instanceCount -= i9;
            iArr1[i8] = 0;
            iArr1[i8 + 1] += 1;
        }
        if (Test0672.bFld) {
            i9 += i7;
            f1 = f1;
            i9 = i8;
        }
        i9 = (int) Test0672.instanceCount;
        long meth_res = Double.doubleToLongBits(d1) + i7 + i8 + i9 + Float.floatToIntBits(f1) +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr);
        fMeth1_check_sum += meth_res;
        return (float)meth_res;
    }

    public static float fMeth(boolean b1) {

        double d=1.12106, d2=30.18572;
        int i10=53032;
        int i11=90;
        int i12=-37690;
        int i13=11;
        int i14=32701;
        int i15=8;
        int i16=-5;
        int[] iArr2 =new int[N];
        float f2=74.5F;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(iArr2, 7);
        FuzzerUtils.init(lArr1, -1672654322325997457L);

        d *= (-fMeth1(d));
        for (i10 = 6; i10 < 325; i10++) {
            for (i12 = 1; 5 > i12; i12++) {
                i11 += i12;
                for (d2 = 1; d2 < 2; ++d2) {
                    i13 -= (int)f2;
                    if (i11 != 0) {
                    }
                }
                Test0672.sFld += (short) i11;
                i14 += (int)f2;
                iArr2[i12 - 1] = Test0672.byFld;
                iArr2[i10 - 1] = i11;
                lArr1[i10] = i14;
            }
            for (i15 = 5; 1 < i15; --i15) {
                Test0672.byFld -= (byte) i15;
                try {
                    iArr2[i15 + 1] = (0 / i14);
                    i14 = (32 % i13);
                    i14 = (-2108059140 % iArr2[i15]);
                } catch (ArithmeticException a_e) {}
            }
        }
        long meth_res = (b1 ? 1 : 0) + Double.doubleToLongBits(d) + i10 + i11 + i12 + i13 + Double.doubleToLongBits(d2)
            + i14 + Float.floatToIntBits(f2) + i15 + i16 + FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(lArr1);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static long lMeth() {

        int i5=-53338, i6=148, i17=14, i18=-44084, i19=-26, i20=33143;
        float f=0.57F;
        double[] dArr =new double[N];

        FuzzerUtils.init(dArr, 72.66027);

        i5 = 1;
        do {
            i6 += (i5 | i5);
            i6 = (int) (((-(i6 + i5)) - dArr[i5]) + ((f - f) + fMeth(Test0672.bFld)));
            f *= i6;
            f = Test0672.sFld;
            Test0672.fArrFld[i5][i5 - 1] = i5;
            if (i6 != 0) {
            }
            i6 >>>= (int) Test0672.instanceCount;
            i17 = 1;
            do {
                Test0672.bFld = Test0672.bFld;
                i18 += -1;
                for (i19 = i17; i19 < 1; ++i19) {
                    Test0672.instanceCount <<= Test0672.instanceCount;
                    i18 = i18;
                }
                i6 *= i19;
            } while (++i17 < 4);
        } while (++i5 < 381);
        long meth_res = i5 + i6 + Float.floatToIntBits(f) + i17 + i18 + i19 + i20 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=45;
        int i1=-244;
        int i2=-250;
        int i3=-2;
        int i4=-168;
        int i21=7;
        int i22=152;
        int[] iArr =new int[N];
        int[] iArr3 =new int[N];
        boolean b=false;

        FuzzerUtils.init(iArr, 7);
        FuzzerUtils.init(iArr3, -12);

        i = (iArr[(i >>> 1) % N] - (-(i - Test0672.byFld)));
        for (i1 = 9; i1 < 319; i1++) {
            for (i3 = 5; i3 < 81; i3++) {
                if (b) break;
                iArr[i3] -= (int) ((--i2) - (lMeth() + Test0672.instanceCount));
                dFld = Test0672.instanceCount;
                i2 = i4;
                iArr[i3] = -26977;
                lArrFld = FuzzerUtils.long1array(N, (long)6585719222731687862L);
                for (i21 = 1; 2 > i21; i21++) {
                    i >>= i2;
                    Test0672.instanceCount += (long) (-2.224F + (i21 * i21));
                    i <<= i3;
                    switch (((i3 >>> 1) % 4) + 119) {
                    case 119:
                        Test0672.instanceCount += i1;
                        i2 -= 203;
                        dFld *= i3;
                    case 120:
                        i4 = 162;
                        fFld += (-6198334602071755917L + (i21 * i21));
                        i2 -= (int) Test0672.instanceCount;
                        break;
                    case 121:
                        try {
                            iArr3[i21 + 1] = (i1 % iArr[i1 + 1]);
                            iArr3[i3] = (6366 % i2);
                            i2 = (i % -1906580235);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 122:
                        i -= i;
                        fFld += (i21 + i22);
                        break;
                    default:
                        if (Test0672.bFld) continue;
                    }
                    i2 <<= i4;
                }
                i2 <<= i2;
            }
            Test0672.instanceCount *= (long) dFld;
            Test0672.sArrFld[i1] = (short) i1;
            dFld = -48049;
        }
        i22 = (int) Test0672.instanceCount;

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i4 b = " + i3 + "," + i4 + "," + (b ? 1 : 0));
        FuzzerUtils.out.println("i21 i22 iArr = " + i21 + "," + i22 + "," + FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println("iArr3 = " + FuzzerUtils.checkSum(iArr3));

        FuzzerUtils.out.println("Test0672.instanceCount Test0672.byFld Test0672.bFld = " + Test0672.instanceCount + "," + Test0672.byFld +
                "," + (Test0672.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0672.sFld dFld fFld = " + Test0672.sFld + "," + Double.doubleToLongBits(dFld) + "," +
            Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("Test0672.fArrFld lArrFld Test0672.sArrFld = " +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0672.fArrFld)) + "," + FuzzerUtils.checkSum(lArrFld) + "," +
                FuzzerUtils.checkSum(Test0672.sArrFld));

        FuzzerUtils.out.println("fMeth1_check_sum: " + fMeth1_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0672 _instance = new Test0672();
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
//DEBUG  fMeth ->  fMeth lMeth mainTest
//DEBUG  fMeth1 ->  fMeth1 fMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}