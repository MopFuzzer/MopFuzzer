// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:44 2023
public class Test0673 {

    public static final int N = 400;

    public static long instanceCount=-738867731L;
    public int iFld=5;
    public static int iFld1=-8;
    public static double dFld=-45.58886;
    public static volatile float fFld=-51.785F;
    public static volatile int iFld2=-15419;
    public static boolean bFld=false;
    public static long[][] lArrFld =new long[N][N];
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0673.lArrFld, -1926818512L);
        FuzzerUtils.init(Test0673.iArrFld, 43326);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i3) {

        float f=-114.45F;
        int i4=12, i5=21840, i6=117, i7=-38820;
        double d1=5.60625;
        short s=-21304;

        f -= i3;
        for (i4 = 7; i4 < 191; i4++) {
            i6 = 1;
            while (++i6 < 9) {
                d1 += i5;
                Test0673.instanceCount -= 2786098632L;
                i5 += (((i6 * i6) + Test0673.instanceCount) - Test0673.iFld1);
                i5 = i3;
                i7 = 1;
                do {
                    Test0673.instanceCount *= -1;
                    i5 = (int)f;
                    i5 -= (int)d1;
                    f -= i6;
                    d1 %= (s | 1);
                    Test0673.instanceCount <<= i3;
                    Test0673.iFld1 >>= (int) Test0673.instanceCount;
                } while (++i7 < 1);
            }
        }
        long meth_res = i3 + Float.floatToIntBits(f) + i4 + i5 + i6 + Double.doubleToLongBits(d1) + i7 + s;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i1=16018, i2=53167, i8=0, i9=9, i10=5;
        double d=0.82131;
        float f1=0.855F, f2=-97.627F;
        byte by=-114;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -7319322459091653425L);

        Test0673.lArrFld[(9 >>> 1) % N] = (Test0673.lArrFld[(-11 >>> 1) % N] = (Test0673.lArrFld[(6 >>> 1) % N] =
                (Test0673.lArrFld[(39697 >>> 1) % N] = Test0673.lArrFld[(Test0673.iFld1 >>> 1) % N])));
        for (i1 = 4; i1 < 274; i1++) {
            i2 *= (int)(-((i1 + i2) * (i2 * d)));
            i2 -= (++Test0673.iFld1);
            lArr[i1 - 1] %= (iMeth1(Test0673.iFld1) | 1);
            Test0673.iFld1 = i2;
            i2 += i2;
            f1 = Test0673.instanceCount;
            for (f2 = i1; f2 < 6; ++f2) {
                for (i9 = 1; i9 > 1; i9--) {
                    Test0673.instanceCount = Test0673.instanceCount;
                }
                try {
                    i10 = (Test0673.iFld1 / i1);
                    Test0673.iArrFld[(int) (f2 + 1)] = (i1 % 77);
                    Test0673.iArrFld[i1] = (i1 / 253);
                } catch (ArithmeticException a_e) {}
                by >>= (byte)i2;
                i2 = i1;
            }
            i8 += (i1 + i2);
        }
        vMeth_check_sum += i1 + i2 + Double.doubleToLongBits(d) + Float.floatToIntBits(f1) + Float.floatToIntBits(f2) +
            i8 + i9 + i10 + by + FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth(int i) {

        int i11=-57991;
        int i12=-8;
        int i13=-49740;
        int i14=5;
        int i15=7;
        int i16=-6;
        int[][] iArr =new int[N][N];
        double d2=-81.82311;
        float f3=2.520F;

        FuzzerUtils.init(iArr, -181);

        iArr[(i >>> 1) % N] = (iArr[(i >>> 1) % N] = (iArr[(i >>> 1) % N] = (iArr[(-118 >>> 1) % N] = iArr[(i >>> 1) %
            N])));
        vMeth();
        i11 = 1;
        do {
            d2 /= (i12 | 1);
            Test0673.dFld -= i11;
            i *= Test0673.iFld1;
            for (i13 = 1; i13 < 8; i13++) {
                Test0673.fFld = i14;
                Test0673.lArrFld[i11 - 1][i11] = i12;
            }
            for (f3 = 1; f3 < 8; f3++) {
                i16 = 1;
                while (++i16 < 2) {
                    Test0673.iArrFld = Test0673.iArrFld;
                    i15 += (int) Test0673.instanceCount;
                    Test0673.iFld2 = (int) Test0673.instanceCount;
                    i12 += i;
                }
            }
        } while (++i11 < 204);
        long meth_res = i + i11 + Double.doubleToLongBits(d2) + i12 + i13 + i14 + Float.floatToIntBits(f3) + i15 + i16
            + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        short s1=25515;
        int i17=128, i18=38994, i19=-27690, i20=-12, i21=-16489, i22=-228, i23=203, i24=-425, i25=-11;
        byte[] byArr =new byte[N];
        float[] fArr =new float[N];

        FuzzerUtils.init(byArr, (byte)41);
        FuzzerUtils.init(fArr, 92.987F);

        iFld = (iMeth(Test0673.iFld1) - -14);
        Test0673.iFld1 += iFld;
        s1 = (short)iFld;
        i17 = 1;
        do {
            if (Test0673.bFld) continue;
            Test0673.instanceCount += Test0673.instanceCount;
            i18 = 1;
            do {
                Test0673.instanceCount = Test0673.instanceCount;
                i19 >>= (int) Test0673.instanceCount;
                switch (((i17 % 8) * 5) + 59) {
                case 92:
                    for (i20 = 1; i20 < 1; ++i20) {
                        Test0673.instanceCount *= s1;
                        i19 += (((i20 * iFld) + iFld) - Test0673.iFld2);
                    }
                    for (i22 = i18; 1 > i22; i22 += 3) {
                        i23 += i19;
                        Test0673.instanceCount += Test0673.iFld1;
                        Test0673.instanceCount = (long) Test0673.dFld;
                        Test0673.instanceCount += iFld;
                        Test0673.instanceCount = i23;
                        Test0673.instanceCount = i20;
                    }
                    break;
                case 98:
                    switch ((i18 % 7) + 110) {
                    case 110:
                        Test0673.iArrFld[i18 - 1] = Test0673.iFld1;
                        break;
                    case 111:
                        Test0673.iFld1 += (i18 * i18);
                        for (i24 = 1; i24 < 1; i24++) {
                            i25 = iFld;
                            s1 -= (short)i23;
                            i23 -= (int) Test0673.fFld;
                            byArr[i18 - 1] >>= (byte)i23;
                            Test0673.iArrFld[i17 + 1] = 132;
                            fArr[i17 + 1] *= 29093;
                        }
                        break;
                    case 112:
                        if (Test0673.bFld) break;
                        break;
                    case 113:
                        iFld = (int) Test0673.instanceCount;
                        break;
                    case 114:
                        Test0673.iArrFld[(i23 >>> 1) % N] /= (int) (i17 | 1);
                        break;
                    case 115:
                        Test0673.instanceCount >>= iFld;
                    case 116:
                        Test0673.instanceCount = Test0673.instanceCount;
                        break;
                    default:
                        Test0673.fFld += i19;
                    }
                case 85:
                    Test0673.iFld1 += (int) -46.363F;
                case 82:
                    i21 &= i22;
                    break;
                case 79:
                    i23 = (int) Test0673.instanceCount;
                    break;
                case 94:
                    iFld += (int)1.48861;
                    break;
                case 86:
                case 87:
                    i23 += (i18 - i24);
                    break;
                }
            } while (++i18 < 93);
        } while (++i17 < 269);

        FuzzerUtils.out.println("s1 i17 i18 = " + s1 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 byArr fArr = " + i25 + "," + FuzzerUtils.checkSum(byArr) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test0673.instanceCount iFld Test0673.iFld1 = " + Test0673.instanceCount + "," + iFld + "," +
                Test0673.iFld1);
        FuzzerUtils.out.println("Test0673.dFld Test0673.fFld Test0673.iFld2 = " + Double.doubleToLongBits(Test0673.dFld) + "," +
                Float.floatToIntBits(Test0673.fFld) + "," + Test0673.iFld2);
        FuzzerUtils.out.println("Test0673.bFld Test0673.lArrFld Test0673.iArrFld = " + (Test0673.bFld ? 1 : 0) + "," +
                FuzzerUtils.checkSum(Test0673.lArrFld) + "," + FuzzerUtils.checkSum(Test0673.iArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0673 _instance = new Test0673();
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
//DEBUG  iMeth1 ->  iMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
