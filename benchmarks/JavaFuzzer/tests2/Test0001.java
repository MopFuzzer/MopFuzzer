// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:12 2023
public class Test0001 {

    public static final int N = 400;

    public static volatile long instanceCount=38314L;
    public volatile double dFld=-21.103572;
    public static int[][] iArrFld =new int[N][N];

    static {
        FuzzerUtils.init(Test0001.iArrFld, 34192);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;

    public static short sMeth(float f, int i8) {

        int i9=-2, i10=43710, i11=-187, i12=199, i13=-59119, i14=-3668;
        double d2=103.20689;
        byte by=-106;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -32919L);

        i8 = (int) Test0001.instanceCount;
        for (i9 = 4; i9 < 254; i9++) {
            lArr[i9] = -177;
            i10 = 97;
            for (i11 = 1; i11 < 7; ++i11) {
                short s1=-24769;
                d2 = i11;
                for (i13 = 2; i13 > 1; i13 -= 2) {
                    by += (byte)i9;
                    i8 >>>= i14;
                    Test0001.instanceCount -= i9;
                    i14 += (69 + (i13 * i13));
                    i14 += (int)(-724L + (i13 * i13));
                    Test0001.iArrFld[i9 + 1][i9] = by;
                }
                Test0001.instanceCount = by;
                i12 <<= s1;
            }
        }
        long meth_res = Float.floatToIntBits(f) + i8 + i9 + i10 + i11 + i12 + Double.doubleToLongBits(d2) + i13 + i14 +
            by + FuzzerUtils.checkSum(lArr);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static void vMeth(long l) {

        double d1=95.236;
        int i3=64762, i4=-25195, i5=8106, i6=13, i7=9;
        float f1=-83.290F;
        byte by1=-75;

        for (d1 = 228; d1 > 5; d1--) {
            switch ((int)((d1 % 6) + 48)) {
            case 48:
                for (i4 = (int)(d1); i4 < 7; i4++) {
                    for (i6 = i4; i6 < 1; ++i6) {
                        i3 += (8 + (i6 * i6));
                        i7 += i6;
                        i7 = sMeth(f1, 109);
                        i3 += (int)(-4708098177502972011L + (i6 * i6));
                        by1 *= (byte)i5;
                        Test0001.iArrFld[i6][(int) (d1)] <<= i3;
                        try {
                            Test0001.iArrFld[i6][i6 + 1] = (-21338 % i6);
                            i3 = (242 / i6);
                            i5 = (i6 / Test0001.iArrFld[(int) (d1 + 1)][(int) (d1)]);
                        } catch (ArithmeticException a_e) {}
                        Test0001.iArrFld[(int) (d1 + 1)][(int) (d1)] *= by1;
                    }
                    Test0001.instanceCount = (long) f1;
                    i5 += (int)(-97.19F + (i4 * i4));
                }
                i3 -= (int)d1;
                break;
            case 49:
                i3 = i5;
                break;
            case 50:
                i5 *= i4;
            case 51:
                i3 >>= i3;
                break;
            case 52:
            case 53:
                i5 += (5 + (d1 * d1));
            default:
                if (i5 != 0) {
                    vMeth_check_sum += l + Double.doubleToLongBits(d1) + i3 + i4 + i5 + i6 + i7 +
                        Float.floatToIntBits(f1) + by1;
                    return;
                }
            }
        }
        vMeth_check_sum += l + Double.doubleToLongBits(d1) + i3 + i4 + i5 + i6 + i7 + Float.floatToIntBits(f1) + by1;
    }

    public static long lMeth() {

        double d=122.85547;
        int i1=5, i2=167, i15=-44334, i16=35264;
        short s=13979;
        float f2=-90.229F;
        boolean b=false;
        byte[] byArr =new byte[N];

        FuzzerUtils.init(byArr, (byte)-69);

        Test0001.instanceCount /= (((long) (++d)) | 1);
        for (i1 = 10; i1 < 331; i1++) {
            if (b) {
                s += (short) (((i1 * Test0001.instanceCount) + i1) - i1);
            } else if (b) {
                vMeth(Test0001.instanceCount);
                byArr = FuzzerUtils.byte1array(N, (byte)59);
                switch (((i1 % 7) * 5) + 46) {
                case 51:
                    for (i15 = 5; i15 > 1; i15--) {
                        byte by2=43;
                        i2 <<= i15;
                        i2 += (int)f2;
                        Test0001.instanceCount -= i16;
                        by2 -= (byte)-100;
                        i16 += i1;
                        i16 += i16;
                        f2 = i1;
                    }
                    break;
                case 72:
                    Test0001.instanceCount -= i15;
                    break;
                case 67:
                case 55:
                    Test0001.iArrFld[i1 + 1] = Test0001.iArrFld[i1 - 1];
                    break;
                case 48:
                    Test0001.instanceCount += i1;
                case 61:
                    i2 -= (int)11L;
                    break;
                case 64:
                    b = b;
                }
            }
        }
        long meth_res = Double.doubleToLongBits(d) + i1 + i2 + s + i15 + i16 + Float.floatToIntBits(f2) + (b ? 1 : 0) +
            FuzzerUtils.checkSum(byArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-56924, i17=14, i18=-33863, i19=36534, i20=-10, i21=233, i22=12, i23=1, i24=238;
        float f3=-55.388F;
        short s2=3537;
        byte by3=55;
        boolean b1=false;

        Test0001.iArrFld[(i >>> 1) % N][(31522 >>> 1) % N] -= Math.max((int) (Test0001.iArrFld[(217 >>> 1) % N][(i >>> 1) % N] *
            lMeth()), i);
        Test0001.instanceCount <<= i;
        i17 = 1;
        while (++i17 < 304) {
            i += i17;
            i *= 14;
            f3 += (i17 * i17);
            for (i18 = 5; i18 < 83; i18++) {
                i -= (int)115.92F;
            }
            Test0001.instanceCount = i18;
            i19 = s2;
        }
        f3 = Test0001.instanceCount;
        for (i20 = 5; i20 < 169; ++i20) {
            Test0001.iArrFld[i20][i20] = (int) 11L;
        }
        i21 >>>= by3;
        dFld += Test0001.instanceCount;
        Test0001.instanceCount = -370;
        for (i22 = 13; 212 > i22; ++i22) {
            Test0001.iArrFld[i22 - 1][i22] = 4;
            i23 *= (int)f3;
            if (b1) {
                i23 = i23;
                i19 ^= i18;
            } else if (b1) {
                i21 = (int) Test0001.instanceCount;
                b1 = false;
                i -= (int) Test0001.instanceCount;
                i24 = 126;
                while ((i24 -= 2) > 0) {
                    i21 += -20;
                    if (b1) continue;
                    i21 += (i24 * i24);
                    try {
                        i21 = (Test0001.iArrFld[i22 + 1][i24] % 873312589);
                        i21 = (31387538 / i);
                        i = (i20 / i18);
                    } catch (ArithmeticException a_e) {}
                }
            } else {
                i23 = i22;
            }
        }

        FuzzerUtils.out.println("i i17 f3 = " + i + "," + i17 + "," + Float.floatToIntBits(f3));
        FuzzerUtils.out.println("i18 i19 s2 = " + i18 + "," + i19 + "," + s2);
        FuzzerUtils.out.println("i20 i21 by3 = " + i20 + "," + i21 + "," + by3);
        FuzzerUtils.out.println("i22 i23 b1 = " + i22 + "," + i23 + "," + (b1 ? 1 : 0));
        FuzzerUtils.out.println("i24 = " + i24);

        FuzzerUtils.out.println("Test0001.instanceCount dFld Test0001.iArrFld = " + Test0001.instanceCount + "," +
                Double.doubleToLongBits(dFld) + "," + FuzzerUtils.checkSum(Test0001.iArrFld));

        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0001 _instance = new Test0001();
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
//DEBUG  sMeth ->  sMeth vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
