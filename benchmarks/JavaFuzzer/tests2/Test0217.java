// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:22 2023
public class Test0217 {

    public static final int N = 400;

    public static long instanceCount=11L;
    public static byte byFld=-106;
    public static int[] iArrFld =new int[N];
    public static long[] lArrFld =new long[N];
    public static volatile boolean[] bArrFld =new boolean[N];

    static {
        FuzzerUtils.init(Test0217.iArrFld, 66);
        FuzzerUtils.init(Test0217.lArrFld, 21754L);
        FuzzerUtils.init(Test0217.bArrFld, true);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i8=0, i9=189, i10=-13, i11=173, i12=-253, i13=218;
        boolean b=true;

        i8 <<= (int) Test0217.instanceCount;
        i8 = i8;
        for (i9 = 23; i9 < 380; ++i9) {
            Test0217.instanceCount += i9;
            for (i11 = 1; i11 < 5; i11++) {
                i8 -= i12;
                try {
                    i12 = (i8 / -65020);
                    i8 = (i10 / i10);
                    i8 = (68 % i11);
                } catch (ArithmeticException a_e) {}
                i8 *= i9;
                try {
                    i10 = (i9 % i11);
                    i8 = (i10 % -18202);
                    i12 = (i9 % i12);
                } catch (ArithmeticException a_e) {}
                i13 = 1;
                while (++i13 < 2) {
                    Test0217.iArrFld[i9] -= i10;
                    i8 += (((i13 * Test0217.instanceCount) + i12) - i12);
                    i8 = i11;
                    if (b) continue;
                    i8 *= 71;
                }
            }
        }
        long meth_res = i8 + i9 + i10 + i11 + i12 + i13 + (b ? 1 : 0);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i3, int i4, long l1) {

        double d1=0.100858;
        int i5=160, i6=11, i7=22, i14=-14, i15=-70, i16=-199, i17=-22702;
        float f2=-73.104F;
        float[] fArr =new float[N];

        FuzzerUtils.init(fArr, 0.769F);

        Test0217.iArrFld[(i3 >>> 1) % N] <<= (int) (((i4++) - (i4--)) + (++Test0217.instanceCount));
        for (d1 = 7; 381 > d1; ++d1) {
            i3 *= (int) (0.29650 + (Test0217.lArrFld[(int) (d1 + 1)]++));
            for (i6 = 1; 5 > i6; ++i6) {
                fArr[i6] = Math.abs((-10 & Math.abs(i5)) + iMeth());
                i5 = i4;
                l1 += i6;
                i4 -= (int)d1;
                for (i14 = 1; i14 < 2; i14++) {
                    fArr[i14 - 1] *= i6;
                }
            }
            for (i16 = 1; i16 < 5; i16++) {
                i17 ^= 5;
                i15 += (((i16 * i7) + f2) - i14);
                i7 = i16;
                try {
                    i17 = (-48 % i6);
                    i15 = (Test0217.iArrFld[i16 - 1] % i16);
                    Test0217.iArrFld[i16 - 1] = (i16 % i7);
                } catch (ArithmeticException a_e) {}
            }
        }
        vMeth1_check_sum += i3 + i4 + l1 + Double.doubleToLongBits(d1) + i5 + i6 + i7 + i14 + i15 + i16 + i17 +
            Float.floatToIntBits(f2) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth(int i2) {

        float f1=-112.394F;
        long l2=187L;
        int i18=-12, i19=6, i20=13;
        short s=17503;
        double d2=2.96331;
        byte[] byArr =new byte[N];

        FuzzerUtils.init(byArr, (byte)-113);

        switch (((i2 >>> 1) % 6) + 45) {
        case 45:
            f1 -= i2;
            vMeth1(i2, i2, -64077L);
            break;
        case 46:
            i2 -= (int)11L;
            for (byte by : byArr) {
                Test0217.lArrFld[(i2 >>> 1) % N] <<= i2;
                for (l2 = 1; l2 < 4; l2++) {
                    i2 = -92;
                    for (i19 = 1; i19 < 2; i19++) {
                        Test0217.iArrFld[i19 + 1] -= (int) 0L;
                        i18 = (int)f1;
                        Test0217.instanceCount += i2;
                        i2 = s;
                        i18 >>>= by;
                        i20 = 53887;
                    }
                }
            }
            break;
        case 47:
            i18 = (int)f1;
            break;
        case 48:
            i20 <<= i2;
            break;
        case 49:
            d2 *= i18;
            break;
        case 50:
            i18 = i19;
            break;
        }
        vMeth_check_sum += i2 + Float.floatToIntBits(f1) + l2 + i18 + i19 + i20 + s + Double.doubleToLongBits(d2) +
            FuzzerUtils.checkSum(byArr);
    }

    public void mainTest(String[] strArr1) {

        int i=158, i1=-82, i21=-2, i22=32895, i23=13, i24=-8, i25=-63918, i26=52337, i27=-48, i28=1, i29=2, i30=-2767;
        double d=1.9737;
        long l=-11610L;
        long l3=14L;
        long[] lArr =new long[N];
        float f=87.92F;
        boolean b1=false;

        FuzzerUtils.init(lArr, -14L);

        lArr[(i >>> 1) % N] += (long)Math.abs(d);
        for (l = 3; l < 365; ++l) {
            i >>= -2;
            i += (int)(++f);
            vMeth(i1);
            Test0217.byFld += (byte) l;
            i += i;
        }
        for (i21 = 4; i21 < 316; ++i21) {
            i23 = 1;
            do {
                try {
                    i = (i21 % 19);
                    i = (i / -34526);
                    i = (i / -17);
                } catch (ArithmeticException a_e) {}
            } while (++i23 < 81);
        }
        Test0217.instanceCount -= i23;
        for (i24 = 1; i24 < 386; i24++) {
            Test0217.byFld += (byte) 110;
            i26 = 1;
            do {
                i22 = i25;
                for (i27 = 1; i27 < 1; i27 += 3) {
                    Test0217.instanceCount *= i21;
                    d -= 1452964555L;
                    Test0217.lArrFld = lArr;
                    Test0217.bArrFld[i26] = b1;
                    Test0217.instanceCount = Test0217.instanceCount;
                    Test0217.iArrFld[i26 + 1] = (int) l;
                    Test0217.iArrFld[i24] = i24;
                }
                Test0217.instanceCount = l3;
                try {
                    Test0217.iArrFld[i26] = (i27 / -150);
                    i25 = (i % 7366);
                    i25 = (Test0217.iArrFld[i24] / 40727);
                } catch (ArithmeticException a_e) {}
                i += (i26 + i28);
                i1 = -51017;
            } while (++i26 < 65);
            for (i29 = 2; i29 < 65; ++i29) {
                f *= i22;
                Test0217.instanceCount = i22;
            }
        }

        FuzzerUtils.out.println("i d l = " + i + "," + Double.doubleToLongBits(d) + "," + l);
        FuzzerUtils.out.println("i1 f i21 = " + i1 + "," + Float.floatToIntBits(f) + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("i28 b1 l3 = " + i28 + "," + (b1 ? 1 : 0) + "," + l3);
        FuzzerUtils.out.println("i29 i30 lArr = " + i29 + "," + i30 + "," + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test0217.instanceCount Test0217.byFld Test0217.iArrFld = " + Test0217.instanceCount + "," + Test0217.byFld
                + "," + FuzzerUtils.checkSum(Test0217.iArrFld));
        FuzzerUtils.out.println("Test0217.lArrFld Test0217.bArrFld = " + FuzzerUtils.checkSum(Test0217.lArrFld) + "," +
                FuzzerUtils.checkSum(Test0217.bArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0217 _instance = new Test0217();
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}