// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:12 2023
public class Test0027 {

    public static final int N = 400;

    public static long instanceCount=9L;
    public static double dFld=0.115083;
    public static short sFld=-19612;
    public float fFld=2.939F;
    public static float fFld1=20.226F;
    public static int[] iArrFld =new int[N];
    public static int[] iArrFld1 =new int[N];

    static {
        FuzzerUtils.init(Test0027.iArrFld, -6);
        FuzzerUtils.init(Test0027.iArrFld1, 138);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long iMeth2_check_sum = 0;

    public static void vSmallMeth(int i2) {


        Test0027.instanceCount = Test0027.iArrFld[(i2 >>> 1) % N];
        vSmallMeth_check_sum += i2;
    }

    public static int iMeth2(int i12, int i13, int i14) {

        boolean b1=true;
        int i15=-55793, i16=-8, i17=76, i18=50277;
        float f1=-52.646F;

        i14 += 100;
        b1 = b1;
        Test0027.dFld = i12;
        for (i15 = 9; i15 < 296; i15++) {
            i16 = 36200;
            Test0027.iArrFld1[i15] += i12;
            i12 >>>= i12;
        }
        Test0027.iArrFld1[(218 >>> 1) % N] = i15;
        i14 = i14;
        f1 -= -48813;
        for (i17 = 2; i17 < 261; i17++) {
            Test0027.instanceCount = i17;
            i14 = i18;
            Test0027.instanceCount -= 2;
        }
        Test0027.instanceCount += i14;
        long meth_res = i12 + i13 + i14 + (b1 ? 1 : 0) + i15 + i16 + Float.floatToIntBits(f1) + i17 + i18;
        iMeth2_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth1(float f) {

        int i19=82, i20=2, i21=-43944, i22=23936, i23=-13, i24=10, i25=115;
        boolean b2=true;

        Test0027.iArrFld1[(115 >>> 1) % N] = iMeth2(i19, i19, i19);
        for (i20 = 4; i20 < 146; i20++) {
            for (i22 = 1; i22 < 11; i22++) {
                i19 = 3181;
                switch (((i20 % 2) * 5) + 34) {
                case 37:
                case 40:
                    Test0027.iArrFld[i20 - 1] += -92;
                    break;
                default:
                    i24 = 1;
                    while (++i24 < 2) {
                        i25 <<= (int) Test0027.instanceCount;
                        Test0027.iArrFld[i24 + 1] = i22;
                        Test0027.instanceCount = i24;
                        if (b2) continue;
                        i25 *= i19;
                        i21 = i25;
                    }
                    i19 <<= i21;
                }
                if (true) break;
            }
        }
        long meth_res = Float.floatToIntBits(f) + i19 + i20 + i21 + i22 + i23 + i24 + i25 + (b2 ? 1 : 0);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(boolean b, int i8, long l) {

        int i9=160, i10=-58127, i11=27471, i26=215, i27=-39911, i28=57, i29=-120, i30=-6;
        double d=-1.76342;
        float[] fArr =new float[N];

        FuzzerUtils.init(fArr, -2.899F);

        if (b) {
            for (i9 = 6; i9 < 232; i9++) {
                i8 &= (i9 + (++Test0027.iArrFld1[i9]));
            }
            Test0027.dFld -= Math.abs(i9);
        } else if (b) {
            i11 = 1;
            do {
                i8 ^= (int) ((iMeth1(Test0027.fFld1) % ((long) (Test0027.dFld) | 1)) + i10);
                try {
                    i26 = (-61189 % i8);
                    i26 = (43 / Test0027.iArrFld1[i11]);
                    i8 = (-50085 % i10);
                } catch (ArithmeticException a_e) {}
                l *= i10;
            } while (++i11 < 153);
        } else if (false) {
            i8 >>= -49251;
            i27 = 1;
            do {
                for (i28 = 1; i28 < 7; i28++) {
                    for (d = 1; d < 2; d++) {
                        i30 -= i26;
                    }
                    Test0027.fFld1 -= i11;
                    l -= i28;
                }
            } while (++i27 < 219);
        }
        long meth_res = (b ? 1 : 0) + i8 + l + i9 + i10 + i11 + i26 + i27 + i28 + i29 + Double.doubleToLongBits(d) +
            i30 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=10, i1=-4127, i3=-60, i4=-178, i5=10, i6=2870, i7=-1, i31=13, i32=191;
        boolean b3=true;
        long[] lArr =new long[N];
        double[] dArr =new double[N];

        FuzzerUtils.init(lArr, -4046318577L);
        FuzzerUtils.init(dArr, -2.12679);

        for (i = 1; i < 168; i += 2) {
            Test0027.iArrFld[i - 1] = i;
        }
        for (int smallinvoc=0; smallinvoc<530; smallinvoc++) vSmallMeth(i);
        if (b3) {
            i3 = 1;
            while (++i3 < 176) {
                i1 += (i3 - i);
                for (i4 = i3; i4 < 143; i4++) {
                    for (int smallinvoc=0; smallinvoc<1; smallinvoc++) vSmallMeth(-i3);
                    i1 <<= (-((i5 * i4) * (--i5)));
                    if (Test0027.iArrFld1[i3 - 1] <= ((Test0027.instanceCount + Test0027.iArrFld[i4 + 1]) - (i4 * (Test0027.dFld +
                        i3)))) break;
                    i5 /= (int) ((i1 >>>= (Test0027.sFld--)) | 1);
                    vSmallMeth((int) ((-Math.min(Test0027.instanceCount, Test0027.instanceCount)) - (i5 -= (-147 * (i1 - i5)))));
                    for (i6 = 1; i6 < 1; i6 += 3) {
                        i7 += i6;
                        fFld += (-(i7 >>>= (++i7)));
                    }
                    Test0027.instanceCount += (i4 ^ i5);
                    lArr[i4 - 1] ^= (i1++);
                    vSmallMeth(Math.min((int)((i5 - i5) + (fFld--)), i4));
                }
                i7 = Math.abs((int) ((30223 + (Test0027.dFld + i)) * (++i7)));
                vSmallMeth(iMeth(b3, i4, Test0027.instanceCount));
                Test0027.dFld = Test0027.sFld;
                if (b3) continue;
                i7 += i3;
            }
            for (i31 = 4; i31 < 208; ++i31) {
                Test0027.instanceCount = -13L;
            }
            i32 += (int) Test0027.dFld;
        } else {
            i7 *= i4;
        }
        i5 += i31;
        dArr[(i32 >>> 1) % N] -= i3;
        Test0027.sFld -= (short) Test0027.instanceCount;

        FuzzerUtils.out.println("i i1 i3 = " + i + "," + i1 + "," + i3);
        FuzzerUtils.out.println("i4 i5 i6 = " + i4 + "," + i5 + "," + i6);
        FuzzerUtils.out.println("i7 b3 i31 = " + i7 + "," + (b3 ? 1 : 0) + "," + i31);
        FuzzerUtils.out.println("i32 lArr dArr = " + i32 + "," + FuzzerUtils.checkSum(lArr) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test0027.instanceCount Test0027.dFld Test0027.sFld = " + Test0027.instanceCount + "," +
                Double.doubleToLongBits(Test0027.dFld) + "," + Test0027.sFld);
        FuzzerUtils.out.println("fFld Test0027.fFld1 Test0027.iArrFld = " + Float.floatToIntBits(fFld) + "," +
                Float.floatToIntBits(Test0027.fFld1) + "," + FuzzerUtils.checkSum(Test0027.iArrFld));
        FuzzerUtils.out.println("Test0027.iArrFld1 = " + FuzzerUtils.checkSum(Test0027.iArrFld1));

        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
        FuzzerUtils.out.println("iMeth2_check_sum: " + iMeth2_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0027 _instance = new Test0027();
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  iMeth2 ->  iMeth2 iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}