// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:26 2023
public class Test0308 {

    public static final int N = 400;

    public static long instanceCount=-8991L;
    public static long lFld=46L;
    public static boolean bFld=true;
    public static byte byFld=115;
    public static short[] sArrFld =new short[N];
    public static double[] dArrFld =new double[N];
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0308.sArrFld, (short) 12432);
        FuzzerUtils.init(Test0308.dArrFld, 0.31705);
        FuzzerUtils.init(Test0308.iArrFld, -39416);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long iMeth2_check_sum = 0;

    public static int iMeth2(double d, double d1, int i14) {


        i14 -= i14;
        long meth_res = Double.doubleToLongBits(d) + Double.doubleToLongBits(d1) + i14;
        iMeth2_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth1(int i8, int i9) {

        int i10=-135;
        int i11=49737;
        int i12=-1;
        int i13=-12;
        int i15=9;
        int i16=11560;
        int[] iArr1 =new int[N];
        double d2=2.129475;
        float f1=1.211F;

        FuzzerUtils.init(iArr1, -76);

        for (i10 = 8; i10 < 151; ++i10) {
            for (i12 = 1; i12 < 11; i12++) {
                Test0308.instanceCount >>>= (Math.max(--i11, i9 + i12) - (i9 + (i8 + i12)));
                i11 += (i12 * i12);
                i8 ^= (iMeth2(d2, d2, -184) * i13);
                i9 = (int)-94L;
                try {
                    i13 = (i11 / -34203);
                    i9 = (i12 % -40701);
                    i9 = (i8 / iArr1[i10]);
                } catch (ArithmeticException a_e) {}
                if (Test0308.bFld) {
                    i13 *= -7078;
                    for (i15 = 1; i15 < 2; i15 += 3) {
                        iArr1[i15 - 1] <<= i8;
                        Test0308.lFld += (long) f1;
                    }
                    i16 <<= (int) Test0308.lFld;
                }
                i16 -= i10;
                i16 += (((i12 * i15) + i9) - f1);
            }
        }
        long meth_res = i8 + i9 + i10 + i11 + i12 + i13 + Double.doubleToLongBits(d2) + i15 + i16 +
            Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(long l) {

        int i2=14;
        int i3=-4;
        int i4=34701;
        int i5=8207;
        int i6=81;
        int i7=4;
        int[] iArr =new int[N];
        short s=-8444;
        float f=0.145F;
        float[] fArr =new float[N];

        FuzzerUtils.init(fArr, 53.121F);
        FuzzerUtils.init(iArr, -9);

        for (i2 = 19; i2 < 362; i2++) {
            for (i4 = i2; i4 < 5; ++i4) {
                s -= (short)(-13 * (l--));
                f *= (fArr[i4]++);
                i3 += (((i4 * i5) + Test0308.instanceCount) - Test0308.instanceCount);
                iArr[i2 + 1] &= (++i3);
            }
            i6 = 1;
            do {
                i7 = 1;
                while (++i7 < 1) {
                    switch (((i7 % 9) * 5) + 42) {
                    case 87:
                    case 74:
                        Test0308.sArrFld[i6 + 1] -= (short) i4;
                        s += (short)(-3068514370L + (i7 * i7));
                        i3 = (int)(i4 - (iMeth1(i3, i3) - 57L));
                        Test0308.dArrFld[i6] = 518953938515172738L;
                        break;
                    case 78:
                        iArr[i6 - 1] = 5;
                        break;
                    case 84:
                        i3 = -13;
                        break;
                    case 63:
                        s += (short)(i7 ^ l);
                    case 50:
                        try {
                            i3 = (i7 / 65150);
                            i5 = (iArr[i6 - 1] / Test0308.iArrFld[i2]);
                            i3 = (i5 / 1064729083);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 45:
                        f = 9L;
                        break;
                    case 77:
                        iArr[i6 - 1] += (int)-174L;
                        break;
                    case 81:
                        i5 *= (int)f;
                        break;
                    default:
                        i5 = 62838;
                    }
                }
            } while (++i6 < 5);
        }
        long meth_res = l + i2 + i3 + i4 + i5 + s + Float.floatToIntBits(f) + i6 + i7 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-83, i1=-3, i17=8, i18=5, i19=229, i20=-3, i21=-9;
        short s1=40;
        long l1=3007898664L;
        long[] lArr =new long[N];
        double d3=-2.2811;
        float f2=1.84F;
        byte[][] byArr =new byte[N][N];

        FuzzerUtils.init(byArr, (byte)3);
        FuzzerUtils.init(lArr, -133L);

        for (i = 12; i < 377; i++) {
            i1 -= (iMeth(5494008147035758875L) + i);
            i17 += (((i * i1) + i17) - i1);
            s1 -= (short) Test0308.instanceCount;
            switch (((i18 >>> 1) % 4) + 75) {
            case 75:
                for (l1 = 1; l1 < 69; ++l1) {
                    switch ((((-78 >>> 1) % 8) * 5) + 8) {
                    case 48:
                        d3 -= i19;
                        Test0308.lFld += Test0308.byFld;
                        if (Test0308.bFld) {
                            switch ((int)((l1 % 10) + 17)) {
                            case 17:
                                i18 = i19;
                                i18 += (int)(l1 * l1);
                                i17 = i;
                                break;
                            case 18:
                                Test0308.iArrFld[(int) (l1)] &= i1;
                                break;
                            case 19:
                            case 20:
                                if (Test0308.bFld) continue;
                                i19 -= i17;
                                Test0308.instanceCount = i;
                                i19 += (int) Test0308.lFld;
                                break;
                            case 21:
                                Test0308.bFld = Test0308.bFld;
                                break;
                            case 22:
                                f2 = Test0308.lFld;
                                try {
                                    i1 = (Test0308.iArrFld[i + 1] / 39812);
                                    i1 = (i17 / Test0308.iArrFld[(int) (l1 + 1)]);
                                    Test0308.iArrFld[(int) (l1 - 1)] = (-34936 / i17);
                                } catch (ArithmeticException a_e) {}
                                for (i20 = 1; i20 < 2; ++i20) {
                                    byArr[(int) (l1)][i20 + 1] -= (byte) Test0308.instanceCount;
                                    f2 += i;
                                    i17 = i21;
                                    Test0308.iArrFld[i20] <<= i21;
                                    Test0308.iArrFld[i20 - 1] = (int) d3;
                                    s1 += (short)f2;
                                    i19 = i19;
                                }
                            case 23:
                                f2 += (l1 * l1);
                                break;
                            case 24:
                                i19 += (int)(((l1 * i18) + i19) - i21);
                                break;
                            case 25:
                                Test0308.sArrFld[(int) (l1 - 1)] -= (short) i18;
                                break;
                            case 26:
                                f2 -= i19;
                                break;
                            default:
                                f2 += i1;
                            }
                        } else if (false) {
                            i17 += (int) (((l1 * Test0308.lFld) + i1) - f2);
                        }
                        break;
                    case 15:
                        i21 = (int)f2;
                        break;
                    case 31:
                        f2 += Test0308.lFld;
                        break;
                    case 45:
                        i17 += (int)l1;
                        break;
                    case 26:
                        lArr[(int)(l1 - 1)] = i;
                        break;
                    case 38:
                        i18 *= -137;
                        break;
                    case 23:
                        i21 += (int)(110L + (l1 * l1));
                        break;
                    case 9:
                        Test0308.byFld -= (byte) i;
                        break;
                    default:
                        try {
                            Test0308.iArrFld[i + 1] = (-32063 % i19);
                            i19 = (i20 / -21455);
                            i19 = (-27993 / i18);
                        } catch (ArithmeticException a_e) {}
                    }
                }
            case 76:
                Test0308.byFld <<= (byte) i21;
                break;
            case 77:
                Test0308.instanceCount = i21;
                break;
            case 78:
                Test0308.instanceCount <<= i;
                break;
            default:
                Test0308.iArrFld[i - 1] >>>= (int) l1;
            }
        }

        FuzzerUtils.out.println("i i1 i17 = " + i + "," + i1 + "," + i17);
        FuzzerUtils.out.println("s1 i18 l1 = " + s1 + "," + i18 + "," + l1);
        FuzzerUtils.out.println("i19 d3 f2 = " + i19 + "," + Double.doubleToLongBits(d3) + "," +
            Float.floatToIntBits(f2));
        FuzzerUtils.out.println("i20 i21 byArr = " + i20 + "," + i21 + "," + FuzzerUtils.checkSum(byArr));
        FuzzerUtils.out.println("lArr = " + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test0308.instanceCount Test0308.lFld Test0308.bFld = " + Test0308.instanceCount + "," + Test0308.lFld +
                "," + (Test0308.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0308.byFld Test0308.sArrFld Test0308.dArrFld = " + Test0308.byFld + "," +
                FuzzerUtils.checkSum(Test0308.sArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0308.dArrFld)));
        FuzzerUtils.out.println("Test0308.iArrFld = " + FuzzerUtils.checkSum(Test0308.iArrFld));

        FuzzerUtils.out.println("iMeth2_check_sum: " + iMeth2_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0308 _instance = new Test0308();
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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  iMeth2 ->  iMeth2 iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
