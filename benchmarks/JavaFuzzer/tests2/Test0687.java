// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:44 2023
public class Test0687 {

    public static final int N = 400;

    public static long instanceCount=-2615837543L;
    public static boolean bFld=false;
    public static boolean[] bArrFld =new boolean[N];
    public static volatile double[] dArrFld =new double[N];
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0687.bArrFld, true);
        FuzzerUtils.init(Test0687.dArrFld, 2.35525);
        FuzzerUtils.init(Test0687.iArrFld, -13);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;

    public static double dMeth(float f1, float f2) {

        int i6=224, i7=110, i8=-47019, i9=10, i10=-60730;
        byte by=-38;
        long l=3832L;
        boolean b=true;

        for (i6 = 10; i6 < 163; i6++) {
            Test0687.instanceCount = i6;
            i7 ^= by;
            for (i8 = i6; 10 > i8; i8++) {
                for (l = 1; l < 1; l++) {
                    i9 = -10;
                    i10 *= (int)l;
                    i9 += (int) (((l * i6) + Test0687.instanceCount) - f2);
                    Test0687.instanceCount -= l;
                    Test0687.bArrFld[(58680 >>> 1) % N] = b;
                    i7 += i7;
                }
                i9 += (int)(83.809F + (i8 * i8));
                f1 = l;
            }
            i7 += (((i6 * l) + i7) - i10);
            i7 = i9;
        }
        long meth_res = Float.floatToIntBits(f1) + Float.floatToIntBits(f2) + i6 + i7 + by + i8 + i9 + l + i10 + (b ? 1
            : 0);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static int iMeth(int i1) {

        int i2=-11;
        int i3=48313;
        int i4=-14;
        int i5=44;
        int[] iArr =new int[N];
        double d1=0.71317, d2=-1.23195;
        float f3=77.214F;

        FuzzerUtils.init(iArr, -40649);

        for (i2 = 13; i2 < 214; i2 += 3) {
            for (i4 = 23; i4 > 1; --i4) {
                i3 -= (int) (Test0687.instanceCount--);
                i5 *= (int)(++d1);
                i5 += (int)((i5--) + (dMeth(f3, f3) * i3));
                i5 = i2;
                i5 += (i4 ^ i2);
                d2 = 1;
                do {
                    Test0687.instanceCount = (long) f3;
                    i5 = i5;
                    if (Test0687.bFld) continue;
                    f3 += -56;
                    iArr[i4] >>= i4;
                    f3 *= -158;
                    Test0687.instanceCount -= (long) f3;
                } while (++d2 < 2);
            }
        }
        long meth_res = i1 + i2 + i3 + i4 + i5 + Double.doubleToLongBits(d1) + Float.floatToIntBits(f3) +
            Double.doubleToLongBits(d2) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(double d, int i, float f) {

        double d3=75.8034;
        int i11=-207;
        int i12=-2;
        int i13=-8;
        int i14=-253;
        int i15=-174;
        int[] iArr1 =new int[N];
        float f4=0.671F;
        float[] fArr =new float[N];

        FuzzerUtils.init(fArr, 1.763F);
        FuzzerUtils.init(iArr1, -12429);

        i += (int)((iMeth(i) * i) - -2796182732800655078L);
        for (d3 = 14; d3 < 368; d3++) {
            for (i12 = (int)(d3); 5 > i12; ++i12) {
                for (i14 = 1; 1 > i14; ++i14) {
                    Test0687.instanceCount = 5;
                    switch ((i14 % 1) + 108) {
                    case 108:
                        Test0687.dArrFld[i14] = f4;
                        i -= i13;
                        break;
                    default:
                        fArr[i12 - 1] = i;
                        if (i12 != 0) {
                            vMeth_check_sum += Double.doubleToLongBits(d) + i + Float.floatToIntBits(f) +
                                Double.doubleToLongBits(d3) + i11 + i12 + i13 + i14 + i15 + Float.floatToIntBits(f4) +
                                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr1);
                            return;
                        }
                        iArr1[i14 + 1] -= (int)24.389F;
                        i11 <<= i15;
                    }
                    i15 = 14;
                    Test0687.instanceCount += (13 + (i14 * i14));
                    i = i13;
                }
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + i + Float.floatToIntBits(f) + Double.doubleToLongBits(d3) + i11
            + i12 + i13 + i14 + i15 + Float.floatToIntBits(f4) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i16=12, i17=14, i18=-152, i20=-9, i21=10, i22=47422, i23=40761;
        float f5=2.552F, f6=-2.349F;
        short s=2871;
        double d4=47.77391;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -99L);

        vMeth(0.111303, i16, f5);
        s -= (short)i16;
        i16 -= i16;
        f6 = 1;
        do {
            Test0687.iArrFld[(int) (f6)] = 14;
        } while (++f6 < 368);
        Test0687.iArrFld[(i17 >>> 1) % N] &= 192;
        for (d4 = 8; 148 > d4; ++d4) {
            if (false) continue;
            for (i20 = 2; i20 < 179; i20++) {
                i17 = i18;
                Test0687.instanceCount -= i18;
                f5 *= 206;
                i16 = i16;
                i21 &= (int) Test0687.instanceCount;
                for (i22 = 2; i22 > 1; i22--) {
                    Test0687.iArrFld[(int) (d4 + 1)] += (int) 1.588F;
                    if (Test0687.bFld) {
                        i18 += (i22 | i18);
                        Test0687.iArrFld[i22] <<= i21;
                    }
                    if (true) break;
                    i17 = i18;
                    i17 = i18;
                    s >>= (short)6689349617042796195L;
                    i23 = 69;
                    Test0687.instanceCount >>= Test0687.instanceCount;
                    switch (((i22 >>> 1) % 3) + 116) {
                    case 116:
                        i17 += (((i22 * i17) + i16) - i17);
                        i23 = (int)-3056933606L;
                        break;
                    case 117:
                        i21 = i17;
                        break;
                    case 118:
                        lArr[i22 + 1] = i17;
                        break;
                    default:
                        Test0687.instanceCount *= (long) f5;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i16 f5 s = " + i16 + "," + Float.floatToIntBits(f5) + "," + s);
        FuzzerUtils.out.println("f6 i17 d4 = " + Float.floatToIntBits(f6) + "," + i17 + "," +
            Double.doubleToLongBits(d4));
        FuzzerUtils.out.println("i18 i20 i21 = " + i18 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 lArr = " + i22 + "," + i23 + "," + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test0687.instanceCount Test0687.bFld Test0687.bArrFld = " + Test0687.instanceCount + "," + (Test0687.bFld
                ? 1 : 0) + "," + FuzzerUtils.checkSum(Test0687.bArrFld));
        FuzzerUtils.out.println("Test0687.dArrFld Test0687.iArrFld = " +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0687.dArrFld)) + "," + FuzzerUtils.checkSum(Test0687.iArrFld));

        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0687 _instance = new Test0687();
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  dMeth ->  dMeth iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}