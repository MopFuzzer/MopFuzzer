// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:40 2023
public class Test0606 {

    public static final int N = 400;

    public static long instanceCount=-3933914069L;
    public static short sFld=-21232;
    public static float fFld=0.714F;
    public static boolean bFld=true;
    public static volatile byte byFld=-86;
    public static short[] sArrFld =new short[N];

    static {
        FuzzerUtils.init(Test0606.sArrFld, (short) 14667);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i3=-64527;
        int i4=7289;
        int i5=11;
        int i6=-14;
        int i7=-170;
        int i8=4;
        int[] iArr =new int[N];
        byte by=100;
        double d=-88.53090;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -8316683264719187088L);
        FuzzerUtils.init(iArr, 0);

        for (i3 = 14; i3 < 225; ++i3) {
            i4 = i4;
            iArr[i3] -= i4;
            for (i5 = 1; i5 < 8; ++i5) {
                iArr[(i3 >>> 1) % N] = (int)203L;
                for (i7 = 1; i7 < 2; i7++) {
                    i6 = i5;
                    i8 += (i7 - Test0606.instanceCount);
                    switch (((i6 >>> 1) % 9) + 94) {
                    case 94:
                        Test0606.sFld = (short) i8;
                        by += (byte)i7;
                        i4 += i7;
                        iArr[i7 - 1] -= i5;
                    case 95:
                        iArr[i3 - 1] = i3;
                        i4 = i5;
                        break;
                    case 96:
                        i6 = i5;
                        break;
                    case 97:
                        i8 -= (int) Test0606.instanceCount;
                    case 98:
                        Test0606.fFld -= i8;
                    case 99:
                        i8 >>= 41562;
                        break;
                    case 100:
                        iArr[i3] += (int)d;
                        break;
                    case 101:
                        i4 = (int) Test0606.instanceCount;
                        break;
                    case 102:
                        i6 *= Test0606.sFld;
                        break;
                    default:
                        iArr[i7 - 1] = (int) Test0606.instanceCount;
                    }
                }
            }
        }
        vMeth2_check_sum += i3 + i4 + i5 + i6 + i7 + i8 + by + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(lArr)
            + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1() {

        int i2=50962;
        int i9=13;
        int i10=-139;
        int i11=51;
        int i12=7314;
        int i13=-245;
        int i14=139;
        int[][] iArr1 =new int[N][N];
        boolean b=true;

        FuzzerUtils.init(iArr1, -1);

        i2 = 1;
        while (++i2 < 333) {
            vMeth2();
            Test0606.instanceCount += (((i2 * Test0606.instanceCount) + i2) - Test0606.instanceCount);
            i9 -= i2;
            iArr1[i2][i2 - 1] = -114;
            if (b) {
                i10 >>= (int) Test0606.instanceCount;
                Test0606.instanceCount <<= i2;
                i9 = i9;
                for (i11 = 1; 5 > i11; ++i11) {
                    for (i13 = i2; i13 < 2; ++i13) {
                        try {
                            i10 = (i12 % 3682);
                            i12 = (i14 % 37515);
                            i10 = (i10 % 115);
                        } catch (ArithmeticException a_e) {}
                    }
                    Test0606.instanceCount >>= -55;
                    Test0606.fFld += (i11 * i11);
                    i12 -= i9;
                }
            } else if (b) {
                i9 = i2;
            } else {
                iArr1[i2 + 1][i2 - 1] = (int) Test0606.instanceCount;
            }
        }
        vMeth1_check_sum += i2 + i9 + i10 + i11 + i12 + i13 + i14 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(float f, int i, int i1) {

        int i15=3;
        int i16=53550;
        int[] iArr2 =new int[N];
        byte by1=-108;
        boolean b1=false;
        double d1=-2.85064;
        float[] fArr =new float[N];

        FuzzerUtils.init(fArr, 116.782F);
        FuzzerUtils.init(iArr2, -2);

        vMeth1();
        i1 /= (int) (Test0606.instanceCount | 1);
        if (b1) {
            switch (((i1 >>> 1) % 2) + 31) {
            case 31:
                i *= i;
                break;
            case 32:
                i1 >>= i;
                switch (((i >>> 1) % 7) + 87) {
                case 87:
                    i += i1;
                case 88:
                    for (i15 = 16; i15 < 375; i15++) {
                        by1 += by1;
                        if (b1) {
                            i += (i15 * i16);
                            fArr[i15 + 1] += i1;
                            i16 += i;
                            if (b1) break;
                        } else {
                            i16 += (int) Test0606.instanceCount;
                        }
                    }
                    break;
                case 89:
                    d1 += -190;
                    break;
                case 90:
                    Test0606.fFld += i15;
                case 91:
                    f *= i15;
                    break;
                case 92:
                    Test0606.instanceCount = 13175;
                    break;
                case 93:
                    iArr2[(1 >>> 1) % N] = -5;
                    break;
                }
            default:
                i1 >>= (int) Test0606.instanceCount;
            }
        } else {
            iArr2[(i16 >>> 1) % N] += i16;
        }
        vMeth_check_sum += Float.floatToIntBits(f) + i + i1 + i15 + i16 + by1 + (b1 ? 1 : 0) +
            Double.doubleToLongBits(d1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i17=46938;
        int i18=11;
        int i19=-11;
        int i20=-3;
        int i21=-3;
        int i22=-3585;
        int i23=20807;
        int i24=216;
        int[] iArr3 =new int[N];
        double d2=2.27705;
        float[] fArr1 =new float[N];
        long[][] lArr1 =new long[N][N];

        FuzzerUtils.init(fArr1, 119.279F);
        FuzzerUtils.init(lArr1, -2660371246354768621L);
        FuzzerUtils.init(iArr3, -8);

        vMeth(Test0606.fFld, i17, i17);
        for (i18 = 176; i18 > 9; i18--) {
            Test0606.bFld = Test0606.bFld;
            i20 = 1;
            do {
                if (Test0606.bFld) {
                    switch (((i20 >>> 1) % 1) + 78) {
                    case 78:
                        Test0606.bFld = false;
                        Test0606.instanceCount += (i20 | Test0606.instanceCount);
                        d2 *= i19;
                        i17 = i19;
                        break;
                    }
                    Test0606.fFld += (i20 * i20);
                } else {
                    Test0606.sArrFld[i18] += (short) 9876;
                    for (i21 = 1; 1 > i21; i21++) {
                        Test0606.sFld = (short) i20;
                        Test0606.instanceCount *= i21;
                        i19 += (((i21 * Test0606.byFld) + i22) - i21);
                    }
                    i23 = 1;
                    while (++i23 < 1) {
                        d2 = i21;
                        fArr1[i23 + 1] -= i17;
                        Test0606.fFld += i23;
                    }
                    i24 = 1;
                    do {
                        d2 *= i23;
                        Test0606.fFld += i24;
                        Test0606.instanceCount -= i24;
                        lArr1[i24 - 1][i24 - 1] = i20;
                        Test0606.fFld += Test0606.instanceCount;
                        i17 = i23;
                        iArr3[i20 - 1] >>= i24;
                        try {
                            i22 = (-242 % i21);
                            i17 = (-47916 / i21);
                            i19 = (i20 / -232);
                        } catch (ArithmeticException a_e) {}
                        i22 >>= i24;
                    } while (++i24 < 1);
                }
            } while (++i20 < 150);
        }

        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 d2 i21 = " + i20 + "," + Double.doubleToLongBits(d2) + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("fArr1 lArr1 iArr3 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + "," +
            FuzzerUtils.checkSum(lArr1) + "," + FuzzerUtils.checkSum(iArr3));

        FuzzerUtils.out.println("Test0606.instanceCount Test0606.sFld Test0606.fFld = " + Test0606.instanceCount + "," + Test0606.sFld +
                "," + Float.floatToIntBits(Test0606.fFld));
        FuzzerUtils.out.println("Test0606.bFld Test0606.byFld Test0606.sArrFld = " + (Test0606.bFld ? 1 : 0) + "," + Test0606.byFld + "," +
                FuzzerUtils.checkSum(Test0606.sArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0606 _instance = new Test0606();
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
