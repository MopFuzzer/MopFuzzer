// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:28 2023
public class Test0347 {

    public static final int N = 400;

    public static long instanceCount=4L;
    public static byte byFld=-116;
    public int iFld=3;
    public static int[] iArrFld =new int[N];
    public static float[] fArrFld =new float[N];

    static {
        FuzzerUtils.init(Test0347.iArrFld, 87);
        FuzzerUtils.init(Test0347.fArrFld, 62.107F);
    }

    public static long fMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(float f3, int i6) {

        long l1=-12L;
        int i7=2;
        int i8=47;
        int i9=0;
        int i10=47345;
        int[] iArr =new int[N];
        short s=23385;

        FuzzerUtils.init(iArr, 25849);

        for (l1 = 23; l1 < 382; l1++) {
            Test0347.byFld += (byte) (l1 * l1);
            i8 = 5;
            do {
                f3 = -186;
                i6 *= i7;
            } while (--i8 > 0);
            Test0347.byFld *= (byte) 9;
            s -= (short)i6;
            i6 = i7;
        }
        i9 = 1;
        while (++i9 < 367) {
            s &= (short)i8;
            i10 = 1;
            do {
                Test0347.instanceCount = (long) 47.811F;
                iArr[i10 + 1] = (int)-2.574F;
                f3 = l1;
                iArr[i10 - 1] = s;
            } while (++i10 < 5);
        }
        vMeth_check_sum += Float.floatToIntBits(f3) + i6 + l1 + i7 + i8 + s + i9 + i10 + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(int i5, float f2) {

        float f4=0.409F;
        int i11=-30436;
        int i12=-9;
        int i13=-16773;
        int i14=23122;
        int[] iArr1 =new int[N];
        double d=127.34071, d1=-79.92582;
        boolean b=false;

        FuzzerUtils.init(iArr1, -1811);

        i5 -= Test0347.byFld;
        vMeth(f2, i5);
        for (f4 = 19; f4 < 346; ++f4) {
            for (d = 1; 5 > d; ++d) {
                Test0347.instanceCount += -12;
            }
            d1 -= i11;
            Test0347.byFld += (byte) (f4 + i5);
            i12 *= i11;
            if (i12 != 0) {
            }
            for (i13 = 1; i13 < 5; i13++) {
                d1 = Test0347.byFld;
                iArr1[(int)(f4 + 1)] += i14;
                if (b) break;
                f2 -= f2;
                i5 >>= 236;
            }
        }
        long meth_res = i5 + Float.floatToIntBits(f2) + Float.floatToIntBits(f4) + i11 + Double.doubleToLongBits(d) +
            i12 + Double.doubleToLongBits(d1) + i13 + i14 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static float fMeth(int i2, int i3, int i4) {

        float f1=-32.400F;
        int i16=64, i17=8, i18=-6, i19=-6, i20=-42333, i21=-242;
        boolean b1=false;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, 7236408647706757215L);

        f1 += iMeth(i3, 72.488F);
        for (int i15 : Test0347.iArrFld) {
            lArr[(-43208 >>> 1) % N] = 64416;
            if (i3 != 0) {
            }
            Test0347.instanceCount = Test0347.instanceCount;
        }
        for (i16 = 18; i16 < 321; i16++) {
            i18 = 1;
            while (++i18 < 5) {
                i19 += (i18 - i16);
            }
        }
        i3 -= -5;
        for (i20 = 9; i20 < 386; i20++) {
            Test0347.instanceCount = i18;
            if (b1) {
                try {
                    i17 = (-44 / i19);
                    i2 = (143 / Test0347.iArrFld[i20]);
                    Test0347.iArrFld[i20 - 1] = (i18 % -402019928);
                } catch (ArithmeticException a_e) {}
            } else if (b1) {
                i19 -= i2;
                i19 |= -42277;
            } else if (b1) {
                Test0347.iArrFld[i20 + 1] = i3;
            } else {
                Test0347.fArrFld[i20 + 1] += -12;
            }
        }
        long meth_res = i2 + i3 + i4 + Float.floatToIntBits(f1) + i16 + i17 + i18 + i19 + i20 + i21 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(lArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        long l=-760504451379249248L;
        long[][] lArr1 =new long[N][N];
        int i=-50897, i1=57549, i22=4, i23=2, i24=-64291, i25=250, i26=-12192, i27=-5, i28=-92, i29=-5, i30=7, i31=5,
            i32=37;
        float f=0.857F;
        double d2=-59.53176;
        double[] dArr =new double[N];

        FuzzerUtils.init(dArr, -2.121674);
        FuzzerUtils.init(lArr1, -33090L);

        l = 1;
        while (++l < 282) {
            Test0347.byFld = (byte) Integer.reverseBytes(Math.min(iFld, (int) (Test0347.instanceCount * -27476)));
            iFld %= (int) ((++Test0347.byFld) | 1);
            for (i = (int)(l); i < 89; ++i) {
                iFld = (int)dArr[i - 1];
                f = fMeth(iFld, i1, i1);
                for (i22 = 1; 1 < i22; i22 -= 2) {
                    i1 = i23;
                    d2 = i23;
                    iFld -= (int)l;
                    Test0347.instanceCount -= i;
                    i1 >>= -32288;
                    i1 += 12878;
                }
                d2 -= -46;
            }
            for (i24 = 5; i24 < 89; ++i24) {
                i1 = (int)l;
                Test0347.instanceCount -= (long) f;
                i25 = (int)d2;
                try {
                    i1 = (i23 / -41324);
                    i25 = (iFld % i1);
                    i1 = (i23 / 8);
                } catch (ArithmeticException a_e) {}
                Test0347.iArrFld[(int) (l + 1)] = i23;
            }
        }
        i26 = 1;
        do {
            i1 += (int)f;
            i1 += (int)l;
            for (i27 = 4; i27 < 101; i27++) {
                for (i29 = 1; i29 < 2; i29++) {
                    f -= 0;
                }
            }
            for (i31 = 2; i31 < 101; i31++) {
                lArr1[i31][i26 + 1] >>= i24;
                lArr1[i26][i26] %= -40382;
                Test0347.instanceCount += -218;
            }
        } while (++i26 < 248);

        FuzzerUtils.out.println("l i i1 = " + l + "," + i + "," + i1);
        FuzzerUtils.out.println("f i22 i23 = " + Float.floatToIntBits(f) + "," + i22 + "," + i23);
        FuzzerUtils.out.println("d2 i24 i25 = " + Double.doubleToLongBits(d2) + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 i27 i28 = " + i26 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("i29 i30 i31 = " + i29 + "," + i30 + "," + i31);
        FuzzerUtils.out.println("i32 dArr lArr1 = " + i32 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            "," + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test0347.instanceCount Test0347.byFld iFld = " + Test0347.instanceCount + "," + Test0347.byFld + "," +
            iFld);
        FuzzerUtils.out.println("Test0347.iArrFld Test0347.fArrFld = " + FuzzerUtils.checkSum(Test0347.iArrFld) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0347.fArrFld)));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0347 _instance = new Test0347();
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
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  iMeth ->  iMeth fMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
