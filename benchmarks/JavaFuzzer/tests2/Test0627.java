// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:41 2023
public class Test0627 {

    public static final int N = 400;

    public static long instanceCount=844193798L;
    public static boolean bFld=true;
    public static volatile long lFld=16977L;
    public static long[] lArrFld =new long[N];
    public float[] fArrFld =new float[N];

    static {
        FuzzerUtils.init(Test0627.lArrFld, -107L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i6) {

        float f1=-108.222F;
        int i7=3;
        int i8=207;
        int i9=5733;
        int i10=234;
        int i11=-14;
        int i12=6;
        int[] iArr =new int[N];
        long l=9916L;
        double d=-2.97525;
        boolean b1=false;

        FuzzerUtils.init(iArr, -56977);

        if (b1) {
            Test0627.lArrFld[(i6 >>> 1) % N] = i6;
            switch (((i6 >>> 1) % 2) + 2) {
            case 2:
                f1 -= -182;
                for (i7 = 4; 272 > i7; i7 += 2) {
                    Test0627.instanceCount += (long) f1;
                    i8 -= i8;
                    i9 = 1;
                    do {
                        Test0627.instanceCount += i9;
                        iArr[i7 - 1] = (int)-79.483F;
                        for (i10 = i7; 1 > i10; ++i10) {
                            iArr[i10 + 1] <<= i7;
                            i12 = i12;
                            i8 = i9;
                            Test0627.lArrFld[i10 + 1] = Test0627.instanceCount;
                        }
                    } while (++i9 < 12);
                }
                break;
            case 3:
                i8 *= (int)l;
                break;
            default:
                i12 = (int)d;
            }
        } else {
            iArr[(i8 >>> 1) % N] -= -54353;
        }
        vMeth2_check_sum += i6 + Float.floatToIntBits(f1) + i7 + i8 + i9 + i10 + i11 + i12 + l +
            Double.doubleToLongBits(d) + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(boolean b, int i3, float f) {

        int i4=-26310;
        int i5=-12;
        int i13=-63;
        int i14=36949;
        int[] iArr1 =new int[N];
        byte by=41;
        byte[] byArr =new byte[N];
        long l1=54L;
        double d1=117.81251;

        FuzzerUtils.init(iArr1, -11);
        FuzzerUtils.init(byArr, (byte)63);

        for (i4 = 9; i4 < 219; ++i4) {
            vMeth2(i4);
            i5 += (i4 | by);
            if (b) break;
            l1 = 8;
            do {
                for (i13 = (int)(l1); 1 > i13; i13++) {
                    if (false) {
                        i5 += i3;
                        Test0627.instanceCount = i14;
                        d1 %= ((long)(d1) | 1);
                        i5 += i13;
                    } else if (Test0627.bFld) {
                        iArr1[(int)(l1 + 1)] <<= (int)l1;
                        i14 = (int)l1;
                        byArr = byArr;
                    } else {
                        i14 <<= i5;
                    }
                }
            } while (--l1 > 0);
        }
        vMeth1_check_sum += (b ? 1 : 0) + i3 + Float.floatToIntBits(f) + i4 + i5 + by + l1 + i13 + i14 +
            Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(byArr);
    }

    public void vMeth(int i, int i1, int i2) {

        int i15=90;
        int i16=-14;
        int i17=2;
        int i18=84;
        int i19=-253;
        int i20=3;
        int[] iArr2 =new int[N];
        double d2=37.63428;
        float f2=75.823F;

        FuzzerUtils.init(iArr2, 167);

        vMeth1(Test0627.bFld, i1, 91.95F);
        if (Test0627.bFld) {
            for (i15 = 8; i15 < 154; ++i15) {
                for (i17 = 11; i17 > 1; --i17) {
                    for (i19 = 1; 2 > i19; ++i19) {
                        i2 += (int) Test0627.lFld;
                        d2 = i19;
                        if (Test0627.bFld) {
                            d2 += i20;
                        }
                        f2 += (float)d2;
                        Test0627.lArrFld = Test0627.lArrFld;
                        i2 += (((i19 * f2) + Test0627.lFld) - i19);
                        i += i15;
                        i = i;
                        fArrFld[i17 - 1] -= i2;
                    }
                }
            }
        } else {
            iArr2[(i20 >>> 1) % N] *= i17;
        }
        vMeth_check_sum += i + i1 + i2 + i15 + i16 + i17 + i18 + i19 + i20 + Double.doubleToLongBits(d2) +
            Float.floatToIntBits(f2) + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i21=-112;

        vMeth(i21, i21, i21);

        FuzzerUtils.out.println("i21 = " + i21);

        FuzzerUtils.out.println("Test0627.instanceCount Test0627.bFld Test0627.lFld = " + Test0627.instanceCount + "," + (Test0627.bFld ? 1
                : 0) + "," + Test0627.lFld);
        FuzzerUtils.out.println("Test0627.lArrFld fArrFld = " + FuzzerUtils.checkSum(Test0627.lArrFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0627 _instance = new Test0627();
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