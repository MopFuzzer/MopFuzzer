// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:12 2023
public class Test0766 {

    public static final int N = 400;

    public static long instanceCount = -4079095496L;
    public static short sFld = 11850;
    public static byte byFld = 46;
    public static double dFld = -35.62055;
    public static int iFld = -28;
    public static double[] dArrFld = new double[N];
    public static short[] sArrFld = new short[N];
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long dMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0766.dArrFld, 2.37732);
        FuzzerUtils.init(Test0766.sArrFld, (short) -5786);
    }

    public long[][] lArrFld = new long[N][N];

    public static double dMeth() {

        int i8 = -44;
        int i9 = -2;
        int i10 = 16;
        int i11 = 2722;
        int i12 = -184;
        int i13 = -12602;
        int i14 = 25363;
        int[][] iArr2 = new int[N][N];
        long l = -8L;
        float f1 = 77.380F;
        short[] sArr = new short[N];

        FuzzerUtils.init(iArr2, -6917);
        FuzzerUtils.init(sArr, (short) 10317);

        for (i8 = 8; i8 < 148; ++i8) {
            Test0766.instanceCount &= -144;
        }
        for (i10 = 18; i10 < 326; i10++) {
            for (l = i10; l < 5; l++) {
                i9 += i11;
                i9 += (int) l;
                i11 += (int) -62641L;
                for (i13 = (int) (l); 1 > i13; ++i13) {
                    double d = -8.100415;
                    Test0766.instanceCount &= Test0766.sFld;
                    i11 = i12;
                    switch (((i10 % 6) * 5) + 82) {
                        case 111:
                            iArr2[i10][i10] = (int) l;
                        case 102:
                            i12 += (((i13 * f1) + i11) - i13);
                            break;
                        case 83:
                            sArr[(int) (l - 1)] *= (short) d;
                            i11 *= i10;
                            break;
                        case 105:
                            Test0766.byFld += (byte) (i13 * i13);
                            break;
                        case 110:
                            Test0766.byFld += (byte) i13;
                            break;
                        case 87:
                            i14 <<= Test0766.sFld;
                            break;
                    }
                }
            }
        }
        long meth_res = i8 + i9 + i10 + i11 + l + i12 + i13 + i14 + Float.floatToIntBits(f1) +
                FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(sArr);
        dMeth_check_sum += meth_res;
        return (double) meth_res;
    }

    public static void vMeth1() {

        byte by = 93;
        int i7 = -119;
        int i15 = 62886;
        int i16 = -83;
        int i17 = 1581;
        int i18 = -131;
        int i19 = 0;
        int i20 = -7;
        int[][] iArr3 = new int[N][N];
        float f2 = 121.676F;
        float[] fArr = new float[N];

        FuzzerUtils.init(iArr3, -7);
        FuzzerUtils.init(fArr, -66.671F);

        by <<= (byte) (i7 - dMeth());
        for (i15 = 3; 195 > i15; i15++) {
            for (i17 = 8; i17 > 1; i17 -= 2) {
                f2 *= i17;
                for (i19 = i15; 3 > i19; ++i19) {
                    iArr3 = FuzzerUtils.int2array(N, (int) 108);
                    iArr3[i17 - 1][i15 - 1] -= Test0766.sFld;
                    i16 = i16;
                    i7 = (int) Test0766.instanceCount;
                    i7 -= -13;
                }
                switch ((i17 % 2) + 115) {
                    case 115:
                        if (false) continue;
                        Test0766.instanceCount += (i17 * i17);
                        fArr[i17 + 1] *= i18;
                        Test0766.dFld -= Test0766.instanceCount;
                        break;
                    case 116:
                        Test0766.instanceCount *= i16;
                        break;
                    default:
                        iArr3[i15 - 1][i15] <<= i15;
                }
            }
        }
        vMeth1_check_sum += by + i7 + i15 + i16 + i17 + i18 + Float.floatToIntBits(f2) + i19 + i20 +
                FuzzerUtils.checkSum(iArr3) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void main(String[] strArr) {

        try {
            Test0766 _instance = new Test0766();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void vMeth() {

        int i3 = 157;
        int i4 = -30816;
        int i5 = 116;
        int i6 = 49507;
        int i21 = 1;
        int[] iArr1 = new int[N];

        FuzzerUtils.init(iArr1, 7);

        iArr1[(i3 >>> 1) % N] >>>= i3;
        i4 = 1;
        while (++i4 < 204) {
            for (i5 = i4; i5 < 8; i5++) {
                i3 = ((i3 += (i3--)) + (--iArr1[i4]));
                vMeth1();
                i3 -= 164;
                Test0766.instanceCount = 58;
                Test0766.instanceCount -= Test0766.iFld;
                Test0766.instanceCount %= 4;
                i21 = 1;
                do {
                    lArrFld[i5][i5] *= i5;
                    Test0766.iFld ^= (int) Test0766.instanceCount;
                    Test0766.instanceCount += (((i21 * i5) + i6) - i21);
                    lArrFld[i21 - 1][i5] >>= i5;
                    i3 = i4;
                } while (++i21 < 1);
            }
        }
        vMeth_check_sum += i3 + i4 + i5 + i6 + i21 + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i = -517;
        int i1 = -49942;
        int i2 = -229;
        int i22 = 61801;
        int i23 = 40;
        int i24 = -1;
        int i25 = 3667;
        int i26 = -35273;
        int[] iArr = new int[N];
        float f = -90.185F, f3 = 0.224F;
        long l1 = -193L;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, 94L);
        FuzzerUtils.init(iArr, 5);

        i = (int) (lArr[(-55963 >>> 1) % N]--);
        for (i1 = 15; 364 > i1; i1++) {
            iArr = (iArr = (iArr = (iArr = FuzzerUtils.int1array(N, (int) -692))));
            f += (--i);
            lArr[i1 + 1] = (long) (-(--f));
            Test0766.dArrFld = (Test0766.dArrFld = (Test0766.dArrFld = Test0766.dArrFld));
            vMeth();
            Test0766.byFld = (byte) Test0766.instanceCount;
            Test0766.iFld -= i1;
        }
        Test0766.sFld = (short) 3271117216L;
        lArr[(33171 >>> 1) % N] -= Test0766.iFld;
        for (i22 = 14; i22 < 255; ++i22) {
            Test0766.instanceCount = -2935401791432274298L;
            for (i24 = 104; i24 > 2; i24 -= 2) {
                f3 = 1;
                do {
                    i += (int) ((long) f3 ^ Test0766.instanceCount);
                } while (++f3 < 3);
                Test0766.iFld %= 17025;
                i26 = 1;
                while (++i26 < 3) {
                    switch (((i24 % 3) * 5) + 30) {
                        case 41:
                            Test0766.sArrFld[i24] -= (short) i25;
                        case 32:
                            i23 += (int) -78.278F;
                            lArr[i26] = 11869;
                            i -= (int) l1;
                            iArr[i26 + 1] = (int) Test0766.instanceCount;
                            break;
                        case 38:
                            i -= i26;
                            i2 = (int) 1.146F;
                            Test0766.sFld = (short) f;
                            break;
                    }
                }
                f += i22;
                iArr[i24] = Test0766.byFld;
                iArr[i22 + 1] = (int) l1;
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("f i22 i23 = " + Float.floatToIntBits(f) + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 f3 = " + i24 + "," + i25 + "," + Float.floatToIntBits(f3));
        FuzzerUtils.out.println("i26 l1 lArr = " + i26 + "," + l1 + "," + FuzzerUtils.checkSum(lArr));
        FuzzerUtils.out.println("iArr = " + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test0766.instanceCount Test0766.sFld Test0766.byFld = " + Test0766.instanceCount + "," + Test0766.sFld +
                "," + Test0766.byFld);
        FuzzerUtils.out.println("Test0766.dFld Test0766.iFld Test0766.dArrFld = " + Double.doubleToLongBits(Test0766.dFld) + "," +
                Test0766.iFld + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0766.dArrFld)));
        FuzzerUtils.out.println("lArrFld Test0766.sArrFld = " + FuzzerUtils.checkSum(lArrFld) + "," +
                FuzzerUtils.checkSum(Test0766.sArrFld));

        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  dMeth ->  dMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}