// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:56 2023
public class Test0938 {

    public static final int N = 400;

    public static long instanceCount=2645591301L;
    public static byte byFld=98;
    public static short sFld=8340;
    public long[] lArrFld =new long[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i4, int i5, int i6) {

        int i7=-211;
        int i8=87;
        int[][] iArr =new int[N][N];
        double d=2.93703;
        double[] dArr =new double[N];
        boolean b=false;

        FuzzerUtils.init(dArr, 65.121501);
        FuzzerUtils.init(iArr, -104);

        i6 <<= i6;
        for (i7 = 8; 201 > i7; i7++) {
            float f1=52.658F;
            dArr[i7 + 1] -= i8;
            Test0938.instanceCount = (long) d;
            Test0938.instanceCount |= Test0938.instanceCount;
            Test0938.instanceCount += (i7 + Test0938.instanceCount);
            if (b) {
                iArr[i7 + 1][i7] <<= i4;
                if (b) {
                    d *= -6;
                    f1 *= i7;
                } else if (false) {
                    Test0938.instanceCount += (((i7 * Test0938.instanceCount) + i4) - i4);
                } else if (true) {
                    d *= i5;
                } else {
                    Test0938.instanceCount += (i7 + f1);
                    Test0938.instanceCount -= 185;
                }
            } else if (b) {
                try {
                    i8 = (-1275002406 / iArr[i7][i7 - 1]);
                    iArr[i7][i7 + 1] = (iArr[i7][i7] / i5);
                    iArr[i7 - 1][i7] = (i5 / i5);
                } catch (ArithmeticException a_e) {}
            } else if (b) {
                Test0938.byFld /= (byte) ((long) (f1) | 1);
            } else {
                iArr[i7 + 1][i7] += (int)f1;
            }
        }
        vMeth2_check_sum += i4 + i5 + i6 + i7 + i8 + Double.doubleToLongBits(d) + (b ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(long l1) {

        int i2=-1, i3=0, i10=3, i11=11;
        double d1=0.125894;
        float f2=-31.10F, f3=-53.75F;
        boolean b1=true;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, 4L);

        for (i2 = 8; i2 < 128; ++i2) {
            int i9=-43796;
            vMeth2(-104, i2, i9);
        }
        i10 = 1;
        do {
            d1 = -8462945496710151460L;
            for (f2 = 1; f2 < 5; f2++) {
                i3 *= (int)f2;
                Test0938.sFld -= (short) i11;
                l1 -= (long)d1;
                i11 >>= 8;
                l1 <<= l1;
                switch ((int)((f2 % 5) + 26)) {
                case 26:
                    f3 += f2;
                    i11 -= i11;
                    break;
                case 27:
                    i11 <<= i2;
                    break;
                case 28:
                    b1 = true;
                    break;
                case 29:
                    lArr = lArr;
                    break;
                case 30:
                    i11 += (int)((long)f2 | i11);
                default:
                    i11 *= i11;
                }
            }
        } while (++i10 < 324);
        vMeth1_check_sum += l1 + i2 + i3 + i10 + Double.doubleToLongBits(d1) + Float.floatToIntBits(f2) + i11 +
            Float.floatToIntBits(f3) + (b1 ? 1 : 0) + FuzzerUtils.checkSum(lArr);
    }

    public void vMeth(long l, int i1, float f) {

        int[] iArr1 =new int[N];

        FuzzerUtils.init(iArr1, 158);

        vMeth1(l);
        iArr1[(i1 >>> 1) % N] ^= 59;
        Test0938.instanceCount -= (long) f;
        vMeth_check_sum += l + i1 + Float.floatToIntBits(f) + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=-251;
        int i12=8356;
        int i13=228;
        int i14=139;
        int i15=251;
        int i16=68;
        int i17=-26925;
        int i18=9;
        int[][] iArr2 =new int[N][N];
        float f4=0.191F, f5=49.712F;
        double d2=4.83294;

        FuzzerUtils.init(iArr2, -44);

        lArrFld[(i >>> 1) % N] = (Test0938.instanceCount++);
        i = (++Test0938.byFld);
        vMeth(Test0938.instanceCount, i, f4);
        iArr2[(i >>> 1) % N][(34730 >>> 1) % N] <<= (int) Test0938.instanceCount;
        f5 = 204;
        do {
            boolean b2=false;
            Test0938.instanceCount *= 161;
            if (b2) break;
            i = (int) Test0938.instanceCount;
            i12 = 123;
            while (--i12 > 0) {
                i = i;
                f4 -= -574447503L;
                i += i13;
            }
            i13 += i;
            for (i14 = 2; i14 < 123; ++i14) {
                for (d2 = 1; d2 < 2; d2++) {
                    i16 /= 37644;
                    i13 -= i13;
                    i13 >>= (int)11L;
                    i13 = (int) Test0938.instanceCount;
                }
                Test0938.byFld -= Test0938.byFld;
                i15 += (int) Test0938.instanceCount;
                i16 += (i14 - i);
                i15 <<= (int) Test0938.instanceCount;
                i15 ^= Test0938.byFld;
                f4 = i15;
                for (i17 = i14; i17 < 2; i17++) {
                    i15 -= (int) Test0938.instanceCount;
                    i16 >>= (int) Test0938.instanceCount;
                    f4 += i12;
                    Test0938.instanceCount += (i17 | i14);
                }
            }
        } while (--f5 > 0);

        FuzzerUtils.out.println("i f4 f5 = " + i + "," + Float.floatToIntBits(f4) + "," + Float.floatToIntBits(f5));
        FuzzerUtils.out.println("i12 i13 i14 = " + i12 + "," + i13 + "," + i14);
        FuzzerUtils.out.println("i15 d2 i16 = " + i15 + "," + Double.doubleToLongBits(d2) + "," + i16);
        FuzzerUtils.out.println("i17 i18 iArr2 = " + i17 + "," + i18 + "," + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test0938.instanceCount Test0938.byFld Test0938.sFld = " + Test0938.instanceCount + "," + Test0938.byFld +
                "," + Test0938.sFld);
        FuzzerUtils.out.println("lArrFld = " + FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0938 _instance = new Test0938();
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
