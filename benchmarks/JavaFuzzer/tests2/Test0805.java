// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:50 2023
public class Test0805 {

    public static final int N = 400;

    public static long instanceCount=-4471932780297609729L;
    public static int iFld=164;
    public static volatile int iFld1=69;
    public static float fFld=0.749F;
    public double dFld=1.101256;
    public short sFld=5273;
    public static int iFld2=10;
    public static int iFld3=6;
    public short sFld1=-28918;
    public byte byFld=-36;
    public static float[] fArrFld =new float[N];

    static {
        FuzzerUtils.init(Test0805.fArrFld, -103.495F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i11, int i12, long l) {

        int i13=4664, i14=-21325, i15=13, i16=198, i17=0, i18=0;
        float f=0.154F;
        double d=1.114764;
        byte by=-81;

        i12 = i12;
        for (i13 = 192; i13 > 1; --i13) {
            i11 |= i13;
            for (f = 1; 8 > f; f++) {
                i11 += (int)f;
                for (i16 = 2; i16 > f; i16--) {
                    d += i17;
                    i15 <<= (int)684215872L;
                    i17 = (int)-48L;
                    l -= (long)1.733F;
                }
                Test0805.iFld = -30846;
                i12 += (int)l;
                i18 = 1;
                while (++i18 < 2) {
                    i17 *= by;
                    i14 += i18;
                }
            }
        }
        vMeth2_check_sum += i11 + i12 + l + i13 + i14 + Float.floatToIntBits(f) + i15 + i16 + i17 +
            Double.doubleToLongBits(d) + i18 + by;
    }

    public static void vMeth1() {

        int i5=-4;
        int i6=55;
        int i7=-8;
        int i8=101;
        int i9=-95;
        int i10=-47337;
        int i19=35676;
        int[] iArr1 =new int[N];
        double d1=-1.66622;
        float f1=0.632F;

        FuzzerUtils.init(iArr1, 5);

        Test0805.iFld += (int) ((Test0805.iFld += (--Test0805.iFld)) * (++Test0805.instanceCount));
        for (i5 = 6; i5 < 343; ++i5) {
            iArr1[i5 + 1] -= i6;
            i6 = (int) (--Test0805.instanceCount);
            iArr1[i5 + 1] = (Test0805.iFld--);
            for (i7 = 1; i7 < 5; ++i7) {
                for (i9 = 1; i9 < 2; ++i9) {
                    vMeth2(i9, i8, Test0805.instanceCount);
                    Test0805.instanceCount *= i8;
                    i10 += (4766 + (i9 * i9));
                }
                i6 = 53312;
                for (d1 = i7; d1 < 2; d1++) {
                    i10 *= (int)f1;
                    i10 = Test0805.iFld1;
                    i8 = i5;
                }
            }
        }
        vMeth1_check_sum += i5 + i6 + i7 + i8 + i9 + i10 + Double.doubleToLongBits(d1) + i19 + Float.floatToIntBits(f1)
            + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth() {

        int i2=14;
        int i3=43;
        int i4=-25700;
        int i20=8;
        int i21=145;
        int i22=-10;
        int[][] iArr2 =new int[N][N];
        short s=22561;

        FuzzerUtils.init(iArr2, 56497);

        i2 = 160;
        while ((i2 -= 2) > 0) {
            for (i3 = 1; i3 < 19; i3++) {
                vMeth1();
                for (i20 = 2; i20 > 1; --i20) {
                    boolean b=true;
                    Test0805.fFld *= i21;
                    iArr2[i2][i3 - 1] *= (int) Test0805.instanceCount;
                    Test0805.iFld = (int) Test0805.fFld;
                    Test0805.iFld1 -= -208;
                    switch ((i3 % 10) + 32) {
                    case 32:
                        iArr2[i2 - 1][i2 - 1] = (int) Test0805.instanceCount;
                        i21 = i3;
                        Test0805.instanceCount <<= i2;
                        break;
                    case 33:
                        if (b) break;
                        i4 = Test0805.iFld1;
                        break;
                    case 34:
                        Test0805.fArrFld[i3 + 1] *= Test0805.iFld1;
                        break;
                    case 35:
                        Test0805.fArrFld[i3] = i21;
                        break;
                    case 36:
                        Test0805.fFld = 8991;
                    case 37:
                        Test0805.iFld -= 2;
                        break;
                    case 38:
                        s += (short) (((i20 * Test0805.iFld1) + s) - i2);
                        break;
                    case 39:
                        i22 -= (int) Test0805.instanceCount;
                        break;
                    case 40:
                        Test0805.instanceCount -= i21;
                        break;
                    case 41:
                        iArr2[i3 - 1][i20 + 1] ^= (int) Test0805.instanceCount;
                    }
                }
            }
        }
        vMeth_check_sum += i2 + i3 + i4 + i20 + i21 + s + i22 + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr3) {

        int i1=38;
        int i23=161;
        int i24=5966;
        int i25=-5;
        int i26=7393;
        int[] iArr =new int[N];
        boolean b1=true;
        boolean[] bArr =new boolean[N];
        double[] dArr =new double[N];

        FuzzerUtils.init(iArr, -246);
        FuzzerUtils.init(dArr, -1.45660);
        FuzzerUtils.init(bArr, false);

        Test0805.iFld += Test0805.iFld;
        i1 = 1;
        while (++i1 < 142) {
            Test0805.iFld -= (int) (((39272 * (iArr[i1 - 1] += (int) 81L)) - Test0805.iFld) - ((Test0805.instanceCount - -2.843F) +
                    (Test0805.instanceCount + Test0805.iFld)));
            vMeth();
            dFld = Test0805.fFld;
            Test0805.iFld += (((i1 * Test0805.iFld) + i1) - Test0805.instanceCount);
            for (i23 = 10; i23 < 177; ++i23) {
                Test0805.instanceCount = sFld;
                switch ((((i24 >>> 1) % 8) * 5) + 79) {
                case 99:
                    Test0805.instanceCount += i1;
                    for (i25 = 1; i25 < 2; ++i25) {
                        dArr[i25 - 1] = 14;
                        i26 >>= i1;
                        Test0805.iFld2 -= Test0805.iFld;
                        i26 = i23;
                        i24 = (int) Test0805.instanceCount;
                        Test0805.fFld += (float) dFld;
                        Test0805.instanceCount = (long) Test0805.fFld;
                        Test0805.iFld2 = Test0805.iFld3;
                        switch ((i25 % 9) + 22) {
                        case 22:
                            if (b1) {
                                i26 = i26;
                            } else if (b1) {
                                iArr[i23] += Test0805.iFld1;
                            } else if (b1) {
                                dFld = Test0805.iFld1;
                                Test0805.iFld3 += (((i25 * Test0805.iFld3) + i25) - sFld);
                                iArr[i25] -= (int) Test0805.instanceCount;
                            } else {
                                Test0805.iFld += i24;
                                Test0805.iFld += (i25 * i25);
                                Test0805.iFld2 -= -30444;
                                Test0805.iFld1 += i25;
                            }
                            break;
                        case 23:
                            Test0805.iFld2 += (((i25 * i25) + Test0805.fFld) - Test0805.iFld2);
                            break;
                        case 24:
                            Test0805.fFld -= i25;
                            break;
                        case 25:
                            iArr = iArr;
                        case 26:
                            bArr[i23] = b1;
                        case 27:
                            sFld = (short)-60989;
                            break;
                        case 28:
                            sFld1 >>= byFld;
                            break;
                        case 29:
                            Test0805.iFld2 &= i23;
                        case 30:
                            Test0805.iFld1 += i25;
                            break;
                        default:
                            if (b1) continue;
                        }
                    }
                    break;
                case 100:
                    try {
                        iArr[i23 + 1] = (iArr[i1 - 1] / 1388952535);
                        Test0805.iFld = (1628 % i23);
                        iArr[i23] = (22715 / Test0805.iFld3);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 84:
                    sFld1 = (short)i24;
                case 92:
                    Test0805.fFld *= i23;
                    break;
                case 82:
                    iArr = iArr;
                    break;
                case 97:
                    Test0805.instanceCount += (3 + (i23 * i23));
                    break;
                case 118:
                    Test0805.iFld = i1;
                    break;
                case 80:
                    Test0805.iFld2 += i1;
                default:
                    byFld += (byte)(-3026640856299443266L + (i23 * i23));
                }
            }
        }

        FuzzerUtils.out.println("i1 i23 i24 = " + i1 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 i26 b1 = " + i25 + "," + i26 + "," + (b1 ? 1 : 0));
        FuzzerUtils.out.println("iArr dArr bArr = " + FuzzerUtils.checkSum(iArr) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + "," + FuzzerUtils.checkSum(bArr));

        FuzzerUtils.out.println("Test0805.instanceCount Test0805.iFld Test0805.iFld1 = " + Test0805.instanceCount + "," + Test0805.iFld +
                "," + Test0805.iFld1);
        FuzzerUtils.out.println("Test0805.fFld dFld sFld = " + Float.floatToIntBits(Test0805.fFld) + "," +
            Double.doubleToLongBits(dFld) + "," + sFld);
        FuzzerUtils.out.println("Test0805.iFld2 Test0805.iFld3 sFld1 = " + Test0805.iFld2 + "," + Test0805.iFld3 + "," + sFld1);
        FuzzerUtils.out.println("byFld Test0805.fArrFld = " + byFld + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0805.fArrFld)));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr2) {

        try {
            Test0805 _instance = new Test0805();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr2);
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
