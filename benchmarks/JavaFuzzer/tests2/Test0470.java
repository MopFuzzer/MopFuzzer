// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:34 2023
public class Test0470 {

    public static final int N = 400;

    public static long instanceCount=3L;
    public static int iFld=-6;
    public static float fFld=-2.39F;
    public static boolean bFld=false;
    public static float fFld1=-48.586F;
    public static byte byFld=-55;
    public static byte[] byArrFld =new byte[N];
    public long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test0470.byArrFld, (byte) -8);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i5=63620, i6=-12, i7=-8767, i8=-360, i9=63208, i10=164, i11=-8;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, 5267313527128515257L);

        for (i5 = 2; i5 < 270; i5 += 2) {
            for (i7 = i5; i7 < 12; ++i7) {
                i8 += (6 + (i7 * i7));
                i8 += (((i7 * i7) + Test0470.instanceCount) - i6);
                Test0470.instanceCount = i7;
                i6 -= i6;
                i6 = (int) Test0470.instanceCount;
            }
        }
        i6 >>= -58781;
        for (i9 = 16; i9 < 267; i9++) {
            i8 += (int)3040848290L;
        }
        i10 = 141;
        i6 >>= (int)1136489311L;
        i11 = 243;
        while (--i11 > 0) {
            lArr[i11 + 1] <<= Test0470.instanceCount;
            Test0470.instanceCount *= i5;
        }
        vMeth1_check_sum += i5 + i6 + i7 + i8 + i9 + i10 + i11 + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(float f1, double d) {

        float f2=2.135F;
        float[] fArr =new float[N];
        int i12=27187;
        int i13=73;
        int i14=-180;
        int i15=9;
        int[] iArr2 =new int[N];

        FuzzerUtils.init(iArr2, 7);
        FuzzerUtils.init(fArr, 1.610F);

        vMeth1();
        f2 = 1;
        do {
            Test0470.iFld %= (int) (Test0470.instanceCount | 1);
            iArr2 = iArr2;
            for (i12 = 1; i12 < 13; i12++) {
                i13 -= i12;
                if (false) break;
                i13 = 9;
                for (i14 = 2; i14 > 1; --i14) {
                    i13 = i15;
                    i13 = (int) Test0470.instanceCount;
                    fArr = fArr;
                    Test0470.fFld += i13;
                    f1 += i15;
                    Test0470.byArrFld[i14] = (byte) Test0470.instanceCount;
                }
            }
        } while ((f2 += 3) < 352);
        vMeth_check_sum += Float.floatToIntBits(f1) + Double.doubleToLongBits(d) + Float.floatToIntBits(f2) + i12 + i13
            + i14 + i15 + FuzzerUtils.checkSum(iArr2) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static long lMeth(int i2, long l, int i3) {

        int i4=-3;
        int i16=-218;
        int i17=-150;
        int i18=-17157;
        int[] iArr1 =new int[N];
        float f=-11.17F;
        long l1=228L;
        double[] dArr =new double[N];

        FuzzerUtils.init(dArr, -35.43203);
        FuzzerUtils.init(iArr1, -9);

        if (Test0470.bFld) {
            i4 = 1;
            while (++i4 < 319) {
                double d1=2.12857;
                i2 += (((i4 * i3) + i4) - i2);
                i2 &= (int)-100L;
                Test0470.instanceCount -= (i2 + (i3--));
                dArr[i4] = (iArr1[i4] += (int)f);
                vMeth(f, d1);
            }
        }
        Test0470.instanceCount += (long) Test0470.fFld1;
        Test0470.instanceCount <<= i2;
        Test0470.iFld *= i2;
        for (i16 = 176; i16 > 7; i16--) {
            i17 >>= Test0470.byFld;
            for (l1 = 9; l1 > 1; l1--) {
                i2 += (-12698 + (l1 * l1));
                Test0470.iFld += (int) (l1 - i17);
            }
        }
        long meth_res = i2 + l + i3 + i4 + Float.floatToIntBits(f) + i16 + i17 + l1 + i18 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-47620;
        int i1=1;
        int i19=-5125;
        int i20=8;
        int i21=-10;
        int i22=1;
        int i23=47;
        int i24=-122;
        int[] iArr =new int[N];
        boolean b=false;
        boolean[] bArr =new boolean[N];
        double d2=-51.22585;
        float f3=2.243F;

        FuzzerUtils.init(iArr, -248);
        FuzzerUtils.init(bArr, true);

        i = 1;
        while (++i < 221) {
            i1 += i;
            i1 += (--iArr[i]);
            i1 = (int) Test0470.instanceCount;
            b = bArr[i];
            i1 -= (int) lMeth(-6, Test0470.instanceCount, i);
            i1 = (int) Test0470.fFld1;
            for (i19 = 7; i19 < 114; i19++) {
                d2 = i;
                Test0470.fFld1 -= 11045L;
                Test0470.fFld1 = Test0470.instanceCount;
                for (f3 = 1; f3 < 2; f3++) {
                    Test0470.fFld1 += (float) -2.101834;
                    Test0470.fFld1 = Test0470.iFld;
                    lArrFld[i] = i19;
                    if (b) break;
                    iArr[i - 1] = (int) Test0470.fFld1;
                    Test0470.instanceCount -= Test0470.instanceCount;
                    iArr[(int)(f3 + 1)] += i1;
                    i20 = i21;
                }
                for (i22 = 1; i22 < 2; ++i22) {
                    i20 += i22;
                    i21 -= (int) Test0470.instanceCount;
                    iArr[i19 - 1] -= (int)59L;
                    switch (((i19 % 3) * 5) + 123) {
                    case 134:
                        iArr[i19] = i23;
                        i23 = i23;
                        iArr[i - 1] = i22;
                        break;
                    case 129:
                        try {
                            i21 = (i21 / -118);
                            i1 = (Test0470.iFld % -205);
                            i20 = (i24 % i23);
                        } catch (ArithmeticException a_e) {}
                        if (Test0470.bFld) break;
                        break;
                    case 128:
                        i23 >>= (int)-12L;
                        break;
                    default:
                        i20 -= i24;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 b = " + i + "," + i1 + "," + (b ? 1 : 0));
        FuzzerUtils.out.println("i19 i20 d2 = " + i19 + "," + i20 + "," + Double.doubleToLongBits(d2));
        FuzzerUtils.out.println("f3 i21 i22 = " + Float.floatToIntBits(f3) + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 iArr = " + i23 + "," + i24 + "," + FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println("bArr = " + FuzzerUtils.checkSum(bArr));

        FuzzerUtils.out.println("Test0470.instanceCount Test0470.iFld Test0470.fFld = " + Test0470.instanceCount + "," + Test0470.iFld +
                "," + Float.floatToIntBits(Test0470.fFld));
        FuzzerUtils.out.println("Test0470.bFld Test0470.fFld1 Test0470.byFld = " + (Test0470.bFld ? 1 : 0) + "," +
                Float.floatToIntBits(Test0470.fFld1) + "," + Test0470.byFld);
        FuzzerUtils.out.println("Test0470.byArrFld lArrFld = " + FuzzerUtils.checkSum(Test0470.byArrFld) + "," +
            FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0470 _instance = new Test0470();
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
