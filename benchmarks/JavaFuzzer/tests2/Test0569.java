// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:38 2023
public class Test0569 {

    public static final int N = 400;

    public static long instanceCount=25711L;
    public static volatile int iFld=7;
    public static short sFld=8549;
    public byte byFld=-14;
    public static double dFld=0.15976;
    public float fFld=16.707F;
    public int[][] iArrFld =new int[N][N];
    public static int[] iArrFld1 =new int[N];

    static {
        FuzzerUtils.init(Test0569.iArrFld1, 5);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i4, long l, int i5) {

        float f1=2.123F;
        int i6=81, i7=67, i8=-49492, i9=6, i10=-54694;
        double d1=-126.29079;
        double[] dArr =new double[N];

        FuzzerUtils.init(dArr, -1.111989);

        f1 = f1;
        Test0569.iFld = i4;
        i6 = 1;
        while (++i6 < 202) {
            Test0569.instanceCount >>= -13;
            i5 += (int)d1;
            i4 *= 0;
            i5 -= Test0569.iFld;
            for (i7 = 1; i7 < 8; ++i7) {
                dArr[i7] *= Test0569.instanceCount;
                Test0569.instanceCount += (((i7 * i4) + f1) - i5);
                for (i9 = 1; i9 < 2; i9++) {
                    f1 = i9;
                    i10 |= 245;
                }
                f1 *= -180L;
                i4 = (int)f1;
            }
        }
        long meth_res = i4 + l + i5 + Float.floatToIntBits(f1) + i6 + Double.doubleToLongBits(d1) + i7 + i8 + i9 + i10
            + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth() {

        short s=18549;
        double d=-16.56278;
        float f=-126.199F;
        float[] fArr =new float[N];
        int i2=-12763;
        int i3=0;
        int i11=-38814;
        int[] iArr =new int[N];
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -3001680794551880922L);
        FuzzerUtils.init(fArr, -87.235F);
        FuzzerUtils.init(iArr, -33785);

        s -= (short) (((d - f) + (-62231 - (++lArr[(-9 >>> 1) % N]))) - Math.abs(Test0569.iFld));
        f -= (Test0569.iFld--);
        for (i2 = 6; i2 < 137; i2++) {
            Test0569.instanceCount *= (long) (((Test0569.iFld++) - fArr[i2]) + lMeth(Test0569.iFld, Test0569.instanceCount, i11));
        }
        Test0569.instanceCount |= i3;
        Test0569.iFld = (int) Test0569.instanceCount;
        i3 >>>= i3;
        Test0569.instanceCount = (long) f;
        iArr[(112 >>> 1) % N] <<= (int) Test0569.instanceCount;
        vMeth_check_sum += s + Double.doubleToLongBits(d) + Float.floatToIntBits(f) + i2 + i3 + i11 +
            FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(int i, boolean b, int i1) {

        int i12=-177, i13=-38491, i14=-14, i15=25804;
        double d2=0.55792;
        byte by=44;

        vMeth();
        i12 = 1;
        while (++i12 < 283) {
            switch ((i12 % 2) + 59) {
            case 59:
                for (i13 = 1; i13 < 6; i13++) {
                    i |= i12;
                    Test0569.instanceCount %= (Test0569.iFld | 1);
                    Test0569.instanceCount += Test0569.sFld;
                }
                break;
            case 60:
                for (d2 = 1; d2 < 6; ++d2) {
                    i1 >>= i12;
                    by = (byte) Test0569.instanceCount;
                    try {
                        i15 = (i13 % i13);
                        Test0569.iArrFld1[i12] = (i14 % i);
                        i14 = (i14 / Test0569.iFld);
                    } catch (ArithmeticException a_e) {}
                    i1 += (-38745 + (d2 * d2));
                    i15 += (int)d2;
                    Test0569.instanceCount -= i15;
                }
                i1 >>= i13;
                break;
            }
        }
        long meth_res = i + (b ? 1 : 0) + i1 + i12 + i13 + i14 + Double.doubleToLongBits(d2) + i15 + by;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        boolean b1=false;
        byte by1=73;
        int i16=-12, i17=9, i18=222, i19=3, i20=6, i21=6, i22=14;
        float f2=22.745F;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(lArr1, 1472153078L);

        iArrFld[(Test0569.iFld >>> 1) % N][(Test0569.iFld >>> 1) % N] -= ((iMeth(Test0569.iFld, b1, Test0569.iFld) << by1) + Test0569.iFld);
        for (i16 = 1; i16 < 201; ++i16) {
            Test0569.iFld >>= -2;
            Test0569.iFld += (i16 * i16);
            for (f2 = 126; f2 > i16; f2 -= 2) {
                i18 += (2 + (f2 * f2));
                i19 = 1;
                while (++i19 < 1) {
                    lArr1[(int) (f2)] = Test0569.iFld;
                    Test0569.instanceCount -= -104L;
                    i18 += (((i19 * Test0569.instanceCount) + f2) - i17);
                    i18 = i19;
                    Test0569.iFld = Test0569.iFld;
                    Test0569.instanceCount <<= Test0569.iFld;
                    Test0569.iFld += (((i19 * Test0569.iFld) + i16) - Test0569.iFld);
                }
                i18 -= (int) Test0569.instanceCount;
                Test0569.instanceCount += (long) (((f2 * i18) + i18) - Test0569.iFld);
                try {
                    Test0569.iFld = (i16 / Test0569.iFld);
                    i17 = (29176 / iArrFld[(int)(f2 - 1)][(int)(f2 + 1)]);
                    i17 = (i16 % Test0569.iFld);
                } catch (ArithmeticException a_e) {}
                i18 = by1;
            }
            byFld *= (byte)-1258590435020132831L;
            Test0569.instanceCount -= i16;
            i20 = 1;
            while (++i20 < 126) {
                for (i21 = 1; i21 > i20; --i21) {
                    Test0569.dFld = -165;
                    i22 += i21;
                    fFld += (((i21 * Test0569.instanceCount) + Test0569.instanceCount) - i20);
                    i22 += -35214;
                    i18 *= (int) Test0569.dFld;
                    try {
                        iArrFld[i21 + 1][i20] = (61 % i17);
                        i18 = (146 / Test0569.iArrFld1[i16 - 1]);
                        i18 = (i17 % -195);
                    } catch (ArithmeticException a_e) {}
                    i22 = i20;
                    Test0569.instanceCount *= (long) 1.509F;
                }
            }
        }

        FuzzerUtils.out.println("b1 by1 i16 = " + (b1 ? 1 : 0) + "," + by1 + "," + i16);
        FuzzerUtils.out.println("i17 f2 i18 = " + i17 + "," + Float.floatToIntBits(f2) + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 lArr1 = " + i22 + "," + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test0569.instanceCount Test0569.iFld Test0569.sFld = " + Test0569.instanceCount + "," + Test0569.iFld +
                "," + Test0569.sFld);
        FuzzerUtils.out.println("byFld Test0569.dFld fFld = " + byFld + "," + Double.doubleToLongBits(Test0569.dFld) + "," +
            Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("iArrFld Test0569.iArrFld1 = " + FuzzerUtils.checkSum(iArrFld) + "," +
                FuzzerUtils.checkSum(Test0569.iArrFld1));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0569 _instance = new Test0569();
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
//DEBUG  lMeth ->  lMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
