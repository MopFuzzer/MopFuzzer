// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:20 2023
public class Test0173 {

    public static final int N = 400;

    public static long instanceCount=57296L;
    public static short sFld=9489;
    public static int iFld=176;
    public static byte byFld=56;
    public static int[] iArrFld =new int[N];
    public static short[] sArrFld =new short[N];
    public static volatile boolean[] bArrFld =new boolean[N];
    public static float[] fArrFld =new float[N];

    static {
        FuzzerUtils.init(Test0173.iArrFld, 1);
        FuzzerUtils.init(Test0173.sArrFld, (short) 2873);
        FuzzerUtils.init(Test0173.bArrFld, true);
        FuzzerUtils.init(Test0173.fArrFld, -41.48F);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i16) {

        int i17=4, i18=-2, i19=-11, i20=-1523, i21=-5592, i22=10;
        double d2=113.55087;
        float f4=-49.446F, f5=-1.526F;

        for (i17 = 4; i17 < 168; ++i17) {
            Test0173.sFld = (short) i16;
            for (i19 = 1; i19 < 10; ++i19) {
                i18 += i19;
                Test0173.iArrFld[i17 + 1] = i17;
                Test0173.iArrFld[i19] >>>= (int) Test0173.instanceCount;
                i16 += (((i19 * i16) + i17) - i19);
                d2 = Test0173.instanceCount;
                for (f4 = i19; f4 < 2; ++f4) {
                    Test0173.bArrFld[i17] = false;
                    Test0173.iArrFld[i17] += (int) Test0173.instanceCount;
                    f5 = i22;
                    i20 += (int)(f4 * f5);
                    i22 += i20;
                }
                i21 = (int) Test0173.instanceCount;
            }
        }
        vMeth1_check_sum += i16 + i17 + i18 + i19 + i20 + Double.doubleToLongBits(d2) + Float.floatToIntBits(f4) + i21
            + Float.floatToIntBits(f5) + i22;
    }

    public static void vMeth() {

        int i14=7, i15=45, i23=-4, i24=12, i25=-5;
        double d1=-47.4424;
        float f3=-2.285F;
        long l1=12L;
        boolean b=true;
        byte by1=121;

        i14 = 1;
        do {
            i15 += (i14 + Test0173.instanceCount);
            Test0173.iArrFld[i14 + 1] >>= (int) ((i14 + (-(d1 + 37503))) + Math.abs((int) (f3 % ((long) (f3) | 1))));
        } while (++i14 < 160);
        vMeth1(i14);
        for (l1 = 288; l1 > 13; --l1) {
            try {
                i15 = (i23 / i23);
                i15 = (i15 / Test0173.iArrFld[(int) (l1 - 1)]);
                i15 = (13 % Test0173.iFld);
            } catch (ArithmeticException a_e) {}
            Test0173.fArrFld[(int) (l1)] = Test0173.iFld;
        }
        for (i24 = 3; i24 < 351; i24++) {
            if (b) continue;
            Test0173.fArrFld[i24 - 1] *= by1;
            d1 *= -30533;
            Test0173.iArrFld[i24] >>= 56184;
            i15 += i24;
            b = b;
            Test0173.iFld &= (int) Test0173.instanceCount;
        }
        vMeth_check_sum += i14 + i15 + Double.doubleToLongBits(d1) + Float.floatToIntBits(f3) + l1 + i23 + i24 + i25 +
            (b ? 1 : 0) + by1;
    }

    public static int iMeth() {

        int i6=-55850, i7=222, i8=2, i9=0, i10=45999, i11=205, i12=0, i13=0;
        float f1=-69.678F, f2=31.794F;
        double d=-1.9185;
        double[] dArr =new double[N];
        short s=-28632;

        FuzzerUtils.init(dArr, -2.69083);

        for (i6 = 124; i6 > 6; i6--) {
            Test0173.instanceCount = Test0173.instanceCount;
            f1 *= Test0173.sArrFld[i6];
        }
        for (i8 = 9; i8 < 320; ++i8) {
            byte by=-108;
            for (i10 = 5; i10 > 1; i10--) {
                f1 = 6;
                i7 += (i10 - i7);
            }
            i11 -= (--i11);
            switch (((i8 % 4) * 5) + 42) {
            case 61:
                f1 = (float) (((Test0173.instanceCount + i8) + (Test0173.instanceCount + -243)) - (dArr[i8 + 1] -= (d - i8)));
                for (i12 = 1; i12 < 5; i12++) {
                    f1 = (((f1 - -99.811F) * i10) - Integer.reverseBytes(i6 - 3));
                }
                if (((-(i12 + -45104)) * (s += (short)(-i7))) < (++i7)) {
                    Test0173.iArrFld[i8 - 1] = Integer.reverseBytes(Test0173.iArrFld[i8 + 1]);
                    by *= (byte)(by + i8);
                } else {
                    i7 = (int) (Test0173.iArrFld[i8 - 1] *= (int) (--dArr[i8 + 1]));
                }
                break;
            case 51:
                try {
                    i11 = (i13 % i8);
                    i9 = (Test0173.iArrFld[i8 - 1] % -226);
                    i7 = (-36 / i10);
                } catch (ArithmeticException a_e) {}
                break;
            case 52:
                by += (byte)f2;
                break;
            case 57:
                vMeth();
                break;
            }
        }
        long meth_res = i6 + i7 + Float.floatToIntBits(f1) + i8 + i9 + i10 + i11 + Double.doubleToLongBits(d) + i12 +
            i13 + s + Float.floatToIntBits(f2) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=6, i1=0, i2=-12, i3=1553, i4=-10, i5=-190, i26=227, i27=-7, i28=-9, i29=1, i30=-12968;
        float f=1.294F;
        long l=134L;
        boolean b1=false;
        double d3=48.34428;

        i = (int) (((-(Test0173.instanceCount * Test0173.instanceCount)) + (-47616 + (++i))) + 13);
        f = Math.min((int)((i | 6665870125359781558L) * (i << i)), 248 >> (i * i));
        i -= (++i);
        for (i1 = 1; i1 < 137; ++i1) {
            for (l = i1; 184 > l; ++l) {
                i = (int) (Test0173.instanceCount += Test0173.iArrFld[i1]);
                for (i4 = 1; i4 < 1; i4++) {
                    i5 <<= Test0173.iArrFld[(int) (l + 1)];
                    i3 >>= (int) (Test0173.instanceCount++);
                    Test0173.instanceCount -= (Math.min(3144179247L, i2 * i) / (Math.max(iMeth(), i3) | 1));
                    Test0173.iArrFld[(int) (l - 1)] = Test0173.iFld;
                    b1 = b1;
                }
                for (i26 = 1; 1 > i26; i26 += 2) {
                    d3 -= i26;
                    i3 <<= i;
                    Test0173.instanceCount += i26;
                    Test0173.byFld ^= (byte) Test0173.iFld;
                    Test0173.instanceCount |= -14;
                }
                i5 += (int)(l * l);
                for (i28 = 1; i28 < 1; i28++) {
                    i27 = -10384;
                    i5 -= i28;
                    Test0173.instanceCount *= l;
                }
                Test0173.instanceCount >>= i;
            }
            i3 = i29;
        }
        i30 = 1;
        do {
            i = (int)-5L;
            i27 >>= i30;
            f += i30;
            Test0173.iFld >>= i30;
        } while (++i30 < 393);

        FuzzerUtils.out.println("i f i1 = " + i + "," + Float.floatToIntBits(f) + "," + i1);
        FuzzerUtils.out.println("i2 l i3 = " + i2 + "," + l + "," + i3);
        FuzzerUtils.out.println("i4 i5 b1 = " + i4 + "," + i5 + "," + (b1 ? 1 : 0));
        FuzzerUtils.out.println("i26 i27 d3 = " + i26 + "," + i27 + "," + Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("i28 i29 i30 = " + i28 + "," + i29 + "," + i30);

        FuzzerUtils.out.println("Test0173.instanceCount Test0173.sFld Test0173.iFld = " + Test0173.instanceCount + "," + Test0173.sFld +
                "," + Test0173.iFld);
        FuzzerUtils.out.println("Test0173.byFld Test0173.iArrFld Test0173.sArrFld = " + Test0173.byFld + "," +
                FuzzerUtils.checkSum(Test0173.iArrFld) + "," + FuzzerUtils.checkSum(Test0173.sArrFld));
        FuzzerUtils.out.println("Test0173.bArrFld Test0173.fArrFld = " + FuzzerUtils.checkSum(Test0173.bArrFld) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0173.fArrFld)));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0173 _instance = new Test0173();
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