// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:49 2023
public class Test0796 {

    public static final int N = 400;

    public static long instanceCount=-6931046221549842892L;
    public static volatile int iFld=0;
    public volatile byte byFld=33;
    public static long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test0796.lArrFld, 6L);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l1, byte by, float f1) {

        int i7=-20411, i8=39863;

        Test0796.iFld += Test0796.iFld;
        for (i7 = 8; i7 < 135; i7++) {
            Test0796.iFld -= i7;
            l1 >>= i8;
        }
        by -= (byte)13009;
        vMeth1_check_sum += l1 + by + Float.floatToIntBits(f1) + i7 + i8;
    }

    public static void vMeth(long l, int i6) {

        byte by1=-62;
        float f2=-73.1023F;

        vMeth1(Test0796.instanceCount, by1, f2);
        vMeth_check_sum += l + i6 + by1 + Float.floatToIntBits(f2);
    }

    public static long lMeth(int i5) {

        int i9=-8896;
        int i10=-128;
        int i11=-4057;
        int i12=-26956;
        int i13=-5;
        int i14=-3;
        int[] iArr =new int[N];
        float f3=0.308F;
        double d=-17.1353;
        byte by2=82;
        boolean b=false;

        FuzzerUtils.init(iArr, -51430);

        vMeth(Test0796.instanceCount, i5);
        for (i9 = 8; i9 < 244; ++i9) {
            switch (((i9 % 7) * 5) + 22) {
            case 50:
                Test0796.instanceCount = 3L;
                Test0796.instanceCount |= i9;
                break;
            case 42:
                i10 -= (int) Test0796.instanceCount;
                break;
            case 51:
                iArr[i9 - 1] = (int)220L;
                for (i11 = 1; i11 < 7; i11++) {
                    i12 += (int)f3;
                }
                break;
            case 46:
                i5 += (i9 * i9);
                Test0796.instanceCount = i11;
                iArr[i9] = (int) Test0796.instanceCount;
                for (d = i9; d < 7; ++d) {
                    i10 = by2;
                    f3 += i13;
                }
                break;
            case 49:
                if (b) continue;
                break;
            case 40:
                f3 -= i10;
            case 57:
                i14 += i9;
                break;
            default:
                Test0796.instanceCount -= (long) d;
            }
        }
        long meth_res = i5 + i9 + i10 + i11 + i12 + Float.floatToIntBits(f3) + Double.doubleToLongBits(d) + i13 + by2 +
            (b ? 1 : 0) + i14 + FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-13;
        int i1=-13;
        int i2=47340;
        int i3=32399;
        int i4=-14835;
        int i15=-9;
        int i16=14;
        int i17=3;
        int i18=16;
        int i19=-60;
        int i20=-1;
        int i21=-77;
        int i22=12;
        int[] iArr1 =new int[N];
        float f=2.777F;
        float[] fArr =new float[N];
        boolean b1=false;
        double[] dArr =new double[N];

        FuzzerUtils.init(dArr, 0.47793);
        FuzzerUtils.init(iArr1, 0);
        FuzzerUtils.init(fArr, -1.286F);

        Test0796.iFld -= (++byFld);
        for (i = 4; i < 347; ++i) {
            for (i2 = 2; i2 < 73; ++i2) {
                i4 = 1;
                while (++i4 < 2) {
                    i3 = (i3--);
                    Test0796.lArrFld[i2] += ((-(i2 + i3)) + Test0796.lArrFld[i2 + 1]);
                    byFld -= (byte) (((Test0796.instanceCount | -17923) + (Test0796.instanceCount - i)) + (++f));
                    dArr[(16 >>> 1) % N] += lMeth(i2);
                    i1 += i4;
                    iArr1 = iArr1;
                }
                i1 = 13;
            }
        }
        i3 >>= i3;
        i15 = 1;
        do {
            i3 += i1;
            byFld *= (byte)i15;
        } while (++i15 < 275);
        Test0796.iFld *= (int) Test0796.instanceCount;
        for (i16 = 14; i16 < 245; i16++) {
            Test0796.iFld += (int) Test0796.instanceCount;
        }
        Test0796.iFld -= 115;
        fArr[(82 >>> 1) % N] *= i3;
        Test0796.lArrFld[(i15 >>> 1) % N] *= Test0796.iFld;
        for (i18 = 16; 396 > i18; i18++) {
            for (i20 = 1; i20 < 66; i20++) {
                Test0796.iFld = i17;
                i22 = 1;
                while (++i22 < 2) {
                    switch ((((i15 >>> 1) % 2) * 5) + 41) {
                    case 44:
                        Test0796.iFld += i16;
                        if (b1) continue;
                        b1 = b1;
                        i17 += (int) Test0796.instanceCount;
                        break;
                    case 49:
                        i21 += i1;
                        break;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i4 f = " + i3 + "," + i4 + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 b1 = " + i21 + "," + i22 + "," + (b1 ? 1 : 0));
        FuzzerUtils.out.println("dArr iArr1 fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + "," +
            FuzzerUtils.checkSum(iArr1) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test0796.instanceCount Test0796.iFld byFld = " + Test0796.instanceCount + "," + Test0796.iFld + "," +
            byFld);
        FuzzerUtils.out.println("Test0796.lArrFld = " + FuzzerUtils.checkSum(Test0796.lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0796 _instance = new Test0796();
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