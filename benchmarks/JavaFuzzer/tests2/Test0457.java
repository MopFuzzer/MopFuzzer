// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:33 2023
public class Test0457 {

    public static final int N = 400;

    public static long instanceCount=2934928164L;
    public static long[][] lArrFld =new long[N][N];
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0457.lArrFld, 2001553167902481652L);
        FuzzerUtils.init(Test0457.iArrFld, 14465);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i8) {

        int i9=-7, i10=-10, i11=191, i12=1607, i13=217, i14=-8;
        boolean b=true;
        double d1=-84.107828;
        double[] dArr =new double[N];
        short[] sArr =new short[N];

        FuzzerUtils.init(dArr, 16.93902);
        FuzzerUtils.init(sArr, (short)-5298);

        if (true) {
            for (i9 = 5; 222 > i9; i9++) {
                Test0457.instanceCount = i9;
                i10 += (int)(42182L + (i9 * i9));
                i8 += (i9 * i8);
            }
            dArr[(i10 >>> 1) % N] += i8;
            vMeth2_check_sum += i8 + i9 + i10 + i11 + i12 + (b ? 1 : 0) + i13 + i14 + Double.doubleToLongBits(d1) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(sArr);
            return;
        } else if (b) {
            i10 = 3;
            for (i11 = 276; i11 > 2; --i11) {
                i12 <<= (int) Test0457.instanceCount;
                dArr[i11 + 1] = i11;
                if (b) continue;
                for (i13 = 1; i13 < 6; ++i13) {
                    i8 += i14;
                    i10 <<= i10;
                    sArr[i11 - 1] -= (short)-561754419220026272L;
                }
            }
        } else {
            d1 *= i11;
        }
        vMeth2_check_sum += i8 + i9 + i10 + i11 + i12 + (b ? 1 : 0) + i13 + i14 + Double.doubleToLongBits(d1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(sArr);
    }

    public static void vMeth1(int i5) {

        int i6=4, i7=-6, i15=64504;
        double d=127.111003;
        long l=5192407448756543281L;
        float f=-50.866F;

        for (i6 = 377; 14 < i6; i6 -= 2) {
            Test0457.lArrFld[i6 - 1] = (Test0457.lArrFld[i6 + 1] = (Test0457.lArrFld[i6] = (Test0457.lArrFld[i6 - 1] =
                    Test0457.lArrFld[i6])));
            Test0457.instanceCount += i6;
            Test0457.iArrFld[i6 - 1] = (++i7);
            Test0457.iArrFld[i6] = (int) (-3348039433L + (Test0457.instanceCount = 20957));
            switch ((((i6 ^ i6) >>> 1) % 1) + 7) {
            case 7:
                Test0457.iArrFld[i6] *= (int) ((-15.920F - (i5 * d)) + ((--Test0457.iArrFld[i6 + 1]) + (--i7)));
                break;
            }
            vMeth2(44185);
            i5 >>= i7;
            Test0457.instanceCount = 10728L;
        }
        i15 = 1;
        while (++i15 < 356) {
            l = 1;
            do {
                i5 -= (int) Test0457.instanceCount;
                f += ((long)l ^ (long)f);
                i5 = i5;
            } while (++l < 5);
        }
        vMeth1_check_sum += i5 + i6 + i7 + Double.doubleToLongBits(d) + i15 + l + Float.floatToIntBits(f);
    }

    public static void vMeth() {

        int i2=-5, i3=160, i4=8;
        float f1=14.845F;
        boolean b1=true;

        i2 = 1;
        while (++i2 < 219) {
            i3 += (i2 * i2);
            i4 = 1;
            while (++i4 < 7) {
                vMeth1(i4);
                i3 += (-2383 + (i4 * i4));
                i3 = (int)f1;
                i3 -= i2;
                f1 += i4;
            }
            i3 &= (int) Test0457.instanceCount;
            i3 = (int)29.754F;
            if (b1) {
                i3 >>= i2;
                i3 = (int) Test0457.instanceCount;
            } else if (b1) {
                i3 <<= i3;
            } else {
                f1 -= Test0457.instanceCount;
            }
        }
        vMeth_check_sum += i2 + i3 + i4 + Float.floatToIntBits(f1) + (b1 ? 1 : 0);
    }

    public void mainTest(String[] strArr1) {

        int i=-19;
        int i1=3;
        int i16=-5;
        int i17=172;
        int i18=-58;
        int i19=-194;
        int i20=-11;
        int i21=13690;
        int i22=8984;
        int i23=173;
        int i24=35566;
        int i25=26431;
        int i26=7;
        int[] iArr =new int[N];
        long l1=-12L;
        float f3=90.863F;
        float[] fArr =new float[N];
        boolean b2=false;

        FuzzerUtils.init(iArr, -4);
        FuzzerUtils.init(fArr, 0.916F);

        for (i = 4; i < 134; i++) {
            Test0457.instanceCount = iArr[i - 1];
            vMeth();
            for (l1 = i; 193 > l1; ++l1) {
                for (i17 = 1; i17 > 1; --i17) {
                    float f2=0.729F;
                    i16 <<= -2;
                    f2 += -213;
                    Test0457.instanceCount += (i17 - i18);
                    i16 -= i17;
                }
                i16 += (int) (((l1 * f3) + i17) - Test0457.instanceCount);
                i16 ^= i17;
                for (i19 = 1; i19 < 1; i19++) {
                    i18 = i20;
                }
            }
            for (i21 = 2; i21 < 193; ++i21) {
                i22 *= i22;
                b2 = b2;
            }
            i22 = i22;
            f3 = i21;
            for (i23 = 4; i23 < 193; i23++) {
                i1 = i19;
                Test0457.instanceCount &= 13;
                Test0457.instanceCount += i1;
                f3 = l1;
                i24 &= i1;
                fArr[i23] = i18;
            }
            i20 >>= 43801;
        }
        i1 += i20;
        for (i25 = 17; i25 < 284; i25++) {
            Test0457.iArrFld[i25] >>= (int) 5L;
            i1 += i25;
        }

        FuzzerUtils.out.println("i i1 l1 = " + i + "," + i1 + "," + l1);
        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("f3 i19 i20 = " + Float.floatToIntBits(f3) + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 b2 = " + i21 + "," + i22 + "," + (b2 ? 1 : 0));
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 iArr fArr = " + i26 + "," + FuzzerUtils.checkSum(iArr) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test0457.instanceCount Test0457.lArrFld Test0457.iArrFld = " + Test0457.instanceCount + "," +
                FuzzerUtils.checkSum(Test0457.lArrFld) + "," + FuzzerUtils.checkSum(Test0457.iArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0457 _instance = new Test0457();
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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
