// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:22 2023
public class Test0218 {

    public static final int N = 400;

    public static long instanceCount=181L;
    public static boolean bFld=false;
    public static int iFld=-7;
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0218.iArrFld, -12);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i3, float f, int i4) {

        int i5=-6146, i6=-3625, i7=-53111, i8=3863, i9=173, i10=-3;
        float[][] fArr =new float[N][N];
        long[][] lArr =new long[N][N];

        FuzzerUtils.init(fArr, 0.923F);
        FuzzerUtils.init(lArr, -213L);

        for (i5 = 10; 181 > i5; ++i5) {
            Test0218.instanceCount <<= i6;
            i7 = 1;
            while (++i7 < 9) {
                i4 = i6;
                i8 = 1;
                do {
                    Test0218.iArrFld[i7] <<= (int) Test0218.instanceCount;
                    Test0218.iArrFld[i8] -= i3;
                    i3 >>= i4;
                } while (++i8 < 1);
                i4 = 73;
                i6 += (i7 * i7);
            }
            fArr[(i7 >>> 1) % N][i5 - 1] *= i8;
            lArr[i5 + 1] = lArr[i5 + 1];
            for (i9 = 9; 1 < i9; i9 -= 2) {
                if (Test0218.bFld) continue;
            }
            fArr[i5 - 1][i5] += 10;
        }
        vMeth2_check_sum += i3 + Float.floatToIntBits(f) + i4 + i5 + i6 + i7 + i8 + i9 + i10 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1() {

        float f1=73.210F;

        vMeth2(Test0218.iFld, f1, Test0218.iFld);
        vMeth1_check_sum += Float.floatToIntBits(f1);
    }

    public static void vMeth(int i) {

        int i1=-13, i2=10932, i11=0, i12=-25560, i13=127, i14=-11;
        byte by=-39;
        double d=71.71724;

        for (i1 = 20; i1 < 373; i1++) {
            vMeth1();
            i >>= (int) Test0218.instanceCount;
            by += (byte)(i1 ^ i2);
            if (Test0218.bFld) continue;
        }
        i11 = 1;
        do {
            i2 += (-18022 + (i11 * i11));
            i12 = 9;
            while ((i12 -= 2) > 0) {
                d *= i13;
            }
            if (Test0218.bFld) continue;
            if (Test0218.bFld) continue;
            i14 = 1;
            do {
                i += (int) Test0218.instanceCount;
                d -= Test0218.instanceCount;
                by += (byte) (i14 * Test0218.instanceCount);
            } while (++i14 < 9);
        } while (++i11 < 181);
        vMeth_check_sum += i + i1 + i2 + by + i11 + i12 + Double.doubleToLongBits(d) + i13 + i14;
    }

    public void mainTest(String[] strArr1) {

        int i15=-2;
        int i16=1;
        int i17=-33104;
        int i18=18800;
        int i19=-45062;
        int i20=0;
        int i21=43994;
        int[] iArr =new int[N];
        short s=2204;
        byte by1=124;
        float f2=-106.127F;
        float[] fArr1 =new float[N];
        double d1=46.90251;
        double[] dArr =new double[N];

        FuzzerUtils.init(fArr1, 2.134F);
        FuzzerUtils.init(iArr, -198);
        FuzzerUtils.init(dArr, -65.52164);

        vMeth(Test0218.iFld);
        i15 = 1;
        do {
            i16 = 1;
            while (++i16 < 99) {
                Test0218.iArrFld = Test0218.iArrFld;
                Test0218.iFld *= i16;
                Test0218.iArrFld[i15] = s;
                Test0218.iFld *= -64283;
                by1 = (byte)i15;
                f2 = i16;
                switch ((i15 % 6) + 39) {
                case 39:
                    for (i17 = 1; i17 < 1; i17++) {
                        fArr1[(3 >>> 1) % N] = i15;
                        try {
                            Test0218.iArrFld[i16] = (i18 % i15);
                            Test0218.iFld = (i16 % i17);
                            Test0218.iFld = (i18 / -107);
                        } catch (ArithmeticException a_e) {}
                    }
                    for (i19 = 1; i19 < 1; i19++) {
                        i20 = i19;
                        switch ((i16 % 5) + 51) {
                        case 51:
                            iArr[i16] = (int) Test0218.instanceCount;
                            break;
                        case 52:
                            if (Test0218.bFld) {
                                Test0218.instanceCount = i17;
                                if (Test0218.bFld) {
                                    Test0218.iFld <<= 168;
                                    Test0218.instanceCount *= 100;
                                    i20 -= (int)f2;
                                    Test0218.instanceCount = -17823L;
                                } else {
                                    dArr[i16 - 1] -= f2;
                                }
                            }
                            i20 >>= -100;
                            break;
                        case 53:
                            Test0218.instanceCount *= (long) f2;
                            iArr = iArr;
                            break;
                        case 54:
                            f2 -= i17;
                            Test0218.instanceCount -= i16;
                            break;
                        case 55:
                            i18 = i21;
                        }
                    }
                case 40:
                    d1 = Test0218.instanceCount;
                case 41:
                    i18 ^= i21;
                case 42:
                    fArr1[i16 + 1] -= Test0218.iFld;
                    break;
                case 43:
                    Test0218.iFld >>>= i17;
                    break;
                case 44:
                    Test0218.instanceCount >>>= -9L;
                    break;
                default:
                    iArr[i16] *= Test0218.iFld;
                }
            }
        } while (++i15 < 254);

        FuzzerUtils.out.println("i15 i16 s = " + i15 + "," + i16 + "," + s);
        FuzzerUtils.out.println("by1 f2 i17 = " + by1 + "," + Float.floatToIntBits(f2) + "," + i17);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 d1 fArr1 = " + i21 + "," + Double.doubleToLongBits(d1) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));
        FuzzerUtils.out.println("iArr dArr = " + FuzzerUtils.checkSum(iArr) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test0218.instanceCount Test0218.bFld Test0218.iFld = " + Test0218.instanceCount + "," + (Test0218.bFld ? 1
                : 0) + "," + Test0218.iFld);
        FuzzerUtils.out.println("Test0218.iArrFld = " + FuzzerUtils.checkSum(Test0218.iArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0218 _instance = new Test0218();
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