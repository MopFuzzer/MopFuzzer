// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:49 2023
public class Test0781 {

    public static final int N = 400;

    public static long instanceCount=-6391055333798601472L;
    public static short sFld=-13733;
    public static byte byFld=-79;
    public double dFld=-1.48969;
    public static int iFld=-11;
    public static float[] fArrFld =new float[N];
    public static int[][] iArrFld =new int[N][N];

    static {
        FuzzerUtils.init(Test0781.fArrFld, 1.335F);
        FuzzerUtils.init(Test0781.iArrFld, 12);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i7=-5;
        int i8=39772;
        int i9=-4;
        int i10=1;
        int[] iArr1 =new int[N];
        boolean b=false;
        double d=-33.29137;
        double[][] dArr =new double[N][N];
        byte by1=20;
        short[] sArr1 =new short[N];

        FuzzerUtils.init(sArr1, (short)-5787);
        FuzzerUtils.init(iArr1, -6);
        FuzzerUtils.init(dArr, 1.12180);

        i7 = 1;
        while (++i7 < 147) {
            b = b;
            for (i8 = 1; i8 < 11; ++i8) {
                byte by=-70;
                by *= (byte) Test0781.instanceCount;
                i9 += i8;
                if (i9 != 0) {
                    vMeth2_check_sum += i7 + (b ? 1 : 0) + i8 + i9 + Double.doubleToLongBits(d) + i10 + by1 +
                        FuzzerUtils.checkSum(sArr1) + FuzzerUtils.checkSum(iArr1) +
                        Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                    return;
                }
                sArr1[i7 + 1] *= (short) Test0781.instanceCount;
                i9 -= (int)-8729742012598904484L;
                iArr1[i8] >>>= (int) Test0781.instanceCount;
                d += Test0781.instanceCount;
            }
            i10 = 11;
            do {
                switch ((i10 % 9) + 58) {
                case 58:
                    i9 = (int)1481854383L;
                    i9 += (int) Test0781.instanceCount;
                    i9 += (i10 * i10);
                case 59:
                    i9 = i8;
                case 60:
                    Test0781.instanceCount <<= -47701L;
                case 61:
                    Test0781.sFld = (short) Test0781.instanceCount;
                    break;
                case 62:
                    iArr1[i7] |= by1;
                case 63:
                    Test0781.instanceCount = 8378;
                    break;
                case 64:
                    dArr[i7 - 1][i10] -= 7322L;
                    break;
                case 65:
                    try {
                        i9 = (iArr1[i7] / 92);
                        i9 = (i9 / -138);
                        i9 = (iArr1[i10 - 1] / iArr1[i10 - 1]);
                    } catch (ArithmeticException a_e) {}
                case 66:
                default:
                    if (b) continue;
                }
            } while (--i10 > 0);
        }
        vMeth2_check_sum += i7 + (b ? 1 : 0) + i8 + i9 + Double.doubleToLongBits(d) + i10 + by1 +
            FuzzerUtils.checkSum(sArr1) + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth1(int i5, int i6, long l) {

        boolean b1=true;
        int i11=-17;
        int i12=202;
        int i13=-3965;
        int i14=110;
        int[][] iArr2 =new int[N][N];
        double d1=86.64125;
        short[] sArr =new short[N];
        byte[] byArr =new byte[N];
        long[] lArr =new long[N];

        FuzzerUtils.init(sArr, (short)-25518);
        FuzzerUtils.init(byArr, (byte)-98);
        FuzzerUtils.init(iArr2, 13);
        FuzzerUtils.init(lArr, 10L);

        for (short s : sArr) {
            byArr[(i6 >>> 1) % N] >>= (byte)i5;
            switch ((((i6 >>> 1) % 6) * 5) + 39) {
            case 51:
                switch ((((-Math.max(i6, i5)) >>> 1) % 2) + 15) {
                case 15:
                    i5 >>= Math.abs(Math.abs(i6) - i6);
                case 16:
                    vMeth2();
                    if (b1) break;
                    i5 <<= i5;
                    for (i11 = 4; i11 > 1; --i11) {
                        i5 += i6;
                        if (b1) break;
                        for (i13 = 2; i13 > 1; --i13) {
                            iArr2[i13 - 1][i11 + 1] += i5;
                            Test0781.byFld = (byte) i6;
                            Test0781.fArrFld[i13 - 1] = i6;
                        }
                    }
                    break;
                }
                break;
            case 64:
                try {
                    i6 = (-97 / i5);
                    i6 = (i12 % -61715);
                    iArr2[(i13 >>> 1) % N][(i11 >>> 1) % N] = (i13 % iArr2[(i11 >>> 1) % N][(i14 >>> 1) % N]);
                } catch (ArithmeticException a_e) {}
            case 60:
                lArr[(i6 >>> 1) % N] &= i6;
                break;
            case 42:
                iArr2[(i12 >>> 1) % N][(i11 >>> 1) % N] = i12;
            case 55:
                Test0781.instanceCount = (long) d1;
            case 48:
                Test0781.byFld += (byte) 10;
                break;
            default:
                lArr[(i11 >>> 1) % N] = i11;
            }
        }
        vMeth1_check_sum += i5 + i6 + l + (b1 ? 1 : 0) + i11 + i12 + i13 + i14 + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr2) +
            FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(int i3, int i4) {

        long l1=-1013096039L;
        int i15=-92, i16=-233, i17=11, i18=219, i19=61814, i20=-176;

        vMeth1(-49052, -69, Test0781.instanceCount);
        Test0781.instanceCount >>= i4;
        i3 = (int) Test0781.instanceCount;
        i4 *= (int) Test0781.instanceCount;
        for (l1 = 7; l1 < 190; ++l1) {
            float f=82.657F;
            f = i3;
            for (i16 = 1; i16 < 9; ++i16) {
                for (i18 = 1; i18 < 2; i18++) {
                    i3 = i15;
                    i17 = i4;
                    f = i17;
                    Test0781.instanceCount += (i18 - i20);
                    try {
                        i3 = (226 % i17);
                        i4 = (i17 % Test0781.iArrFld[i16 + 1][(int) (l1)]);
                        i3 = (-42237 % i19);
                    } catch (ArithmeticException a_e) {}
                    Test0781.fArrFld = Test0781.fArrFld;
                    f = 125;
                }
            }
        }
        vMeth_check_sum += i3 + i4 + l1 + i15 + i16 + i17 + i18 + i19 + i20;
    }

    public void mainTest(String[] strArr1) {

        int i=-49877;
        int i1=39041;
        int i2=44089;
        int i21=-58594;
        int i22=-13;
        int i23=46447;
        int i24=-14;
        int i25=-48;
        int i26=-52416;
        int i27=-35679;
        int i28=243;
        int i29=129;
        int[] iArr =new int[N];
        float f1=6.380F;
        long l2=-1894322056L;

        FuzzerUtils.init(iArr, 0);

        i = 1;
        do {
            for (i1 = 4; i1 < 141; ++i1) {
                i2 += (i1 ^ i2);
                iArr[i - 1] = (iArr[i1 - 1]++);
            }
            vMeth(-2, i);
            for (i21 = 4; i21 < 141; i21++) {
                Test0781.instanceCount += (((i21 * i22) + i2) - i2);
            }
            for (i23 = 2; 141 > i23; ++i23) {
                f1 *= Test0781.instanceCount;
                i2 += (int) Test0781.instanceCount;
                Test0781.instanceCount *= (long) dFld;
                i25 = 1;
                while (++i25 < 2) {
                    Test0781.iArrFld = Test0781.iArrFld;
                    f1 += (((i25 * i22) + i2) - Test0781.byFld);
                    i2 += i25;
                    if (true) break;
                    i24 *= (int)dFld;
                }
                Test0781.instanceCount += (((i23 * i22) + i23) - i24);
                if (true) break;
            }
        } while (++i < 178);
        for (i26 = 10; 246 > i26; ++i26) {
            Test0781.instanceCount += Test0781.instanceCount;
            for (i28 = 5; i28 < 106; i28++) {
                l2 |= 180L;
                f1 = i25;
                Test0781.iFld -= i23;
                i2 = -221;
                i24 = 12;
            }
            Test0781.instanceCount += i26;
            i22 = i21;
            Test0781.instanceCount += (i26 - i27);
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 f1 i25 = " + i24 + "," + Float.floatToIntBits(f1) + "," + i25);
        FuzzerUtils.out.println("i26 i27 i28 = " + i26 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("i29 l2 iArr = " + i29 + "," + l2 + "," + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test0781.instanceCount Test0781.sFld Test0781.byFld = " + Test0781.instanceCount + "," + Test0781.sFld +
                "," + Test0781.byFld);
        FuzzerUtils.out.println("dFld Test0781.iFld Test0781.fArrFld = " + Double.doubleToLongBits(dFld) + "," + Test0781.iFld +
                "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0781.fArrFld)));
        FuzzerUtils.out.println("Test0781.iArrFld = " + FuzzerUtils.checkSum(Test0781.iArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0781 _instance = new Test0781();
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
