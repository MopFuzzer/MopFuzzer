// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:12 2023
public class Test0770 {

    public static final int N = 400;

    public static long instanceCount = 3427934398L;
    public static float fFld = 2.567F;
    public static boolean bFld = true;
    public static double dFld = 64.69421;
    public static short sFld = 28524;
    public static long[] lArrFld = new long[N];
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    static {
        FuzzerUtils.init(Test0770.lArrFld, 10L);
    }

    public int iFld = -13;
    public byte byFld = -29;

    public static void vMeth2() {

        int i7 = -141, i8 = 61213;

        i7 = (int) Test0770.fFld;
        i8 = 151;
        while (--i8 > 0) {
            i7 += (((i8 * i8) + i8) - i7);
            i7 *= (int) Test0770.fFld;
            i7 = i8;
        }
        vMeth2_check_sum += i7 + i8;
    }

    public static void vMeth1(int i4) {

        int i5 = -233;
        int i6 = -8;
        int[] iArr = new int[N];
        double d = -90.1607;
        byte by = 0;
        float[] fArr = new float[N];

        FuzzerUtils.init(iArr, 14);
        FuzzerUtils.init(fArr, -102.807F);

        Test0770.instanceCount = (long) Test0770.fFld;
        for (i5 = 129; i5 > 8; i5 -= 2) {
            d -= (d - (-(i4 * Test0770.fFld)));
            i4 += i5;
            vMeth2();
            iArr = iArr;
            i6 += (int) Test0770.instanceCount;
        }
        for (int i9 : iArr) {
            i6 *= (int) d;
            iArr[(i6 >>> 1) % N] = by;
            switch ((((23728 >>> 1) % 2) * 5) + 4) {
                case 7:
                    Test0770.lArrFld[(i5 >>> 1) % N] *= i5;
                    break;
                case 9:
                    Test0770.bFld = false;
                    i6 = i4;
                default:
                    fArr = fArr;
            }
        }
        vMeth1_check_sum += i4 + i5 + i6 + Double.doubleToLongBits(d) + by + FuzzerUtils.checkSum(iArr) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth(int i2, int i3) {

        int i10 = -38498;
        int i11 = 24918;
        int i12 = -3;
        int i13 = -14;
        int i14 = 149;
        int i15 = -30612;
        int[] iArr1 = new int[N];

        FuzzerUtils.init(iArr1, -8090);

        Test0770.instanceCount += ((i2 += i2) - i2);
        vMeth1(i10);
        i10 = (int) Test0770.instanceCount;
        i11 = 1;
        do {
            for (i12 = 1; i12 < 10; i12++) {
                switch (((i12 % 6) * 5) + 121) {
                    case 138:
                        Test0770.instanceCount *= -45982;
                        i13 += i12;
                        break;
                    case 147:
                        for (i14 = 1; i14 < 2; i14++) {
                            i15 = i10;
                            try {
                                i15 = (i15 % -28484);
                                i10 = (i10 / -1211919446);
                                i2 = (i14 / -129);
                            } catch (ArithmeticException a_e) {
                            }
                        }
                        switch ((i11 % 2) + 27) {
                            case 27:
                                i15 -= (int) Test0770.fFld;
                                Test0770.dFld *= i14;
                                Test0770.dFld *= 2;
                                break;
                            case 28:
                                i13 *= i10;
                            default:
                                i10 += (int) (-2322014462L + (i12 * i12));
                        }
                        break;
                    case 124:
                        i3 += (int) Test0770.instanceCount;
                        break;
                    case 128:
                        i15 <<= i15;
                    case 129:
                        i15 += (((i12 * Test0770.fFld) + i3) - i15);
                        break;
                    case 131:
                        iArr1[i11 + 1] >>>= i15;
                        break;
                }
            }
        } while ((i11 += 2) < 314);
        vMeth_check_sum += i2 + i3 + i10 + i11 + i12 + i13 + i14 + i15 + FuzzerUtils.checkSum(iArr1);
    }

    public static void main(String[] strArr) {

        try {
            Test0770 _instance = new Test0770();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = 230;
        int i1 = 113;
        int i16 = -66;
        int i17 = 184;
        int i18 = 53736;
        int i19 = -35436;
        int i20 = 3;
        int i21 = -202;
        int i22 = -5;
        int i23 = 6;
        int[] iArr2 = new int[N];
        double[] dArr = new double[N];

        FuzzerUtils.init(iArr2, -161);
        FuzzerUtils.init(dArr, 77.62717);

        iFld <<= (int) ((Long.reverseBytes(1013568459L) * (Test0770.instanceCount - iFld)) - iFld);
        for (i = 5; 225 > i; ++i) {
            vMeth(-228, i);
            i16 += (i * i);
            Test0770.instanceCount += (((i * i) + Test0770.sFld) - i16);
            Test0770.fFld = Test0770.instanceCount;
            iFld = Test0770.sFld;
            for (i17 = 1; i17 < 114; i17++) {
                i16 <<= 11;
                i1 -= (int) Test0770.instanceCount;
                for (i19 = 2; i19 > 1; i19--) {
                    Test0770.dFld += i20;
                }
                i21 = 1;
                do {
                    Test0770.fFld += 31668;
                    i18 = 2;
                    Test0770.instanceCount += (i21 * i21);
                    byFld += (byte) i1;
                    Test0770.instanceCount = i;
                    i18 = i1;
                    iFld >>= i17;
                    Test0770.instanceCount = i1;
                } while (++i21 < 2);
                switch ((((10 >>> 1) % 1) * 5) + 90) {
                    case 91:
                        for (i22 = 1; i22 < 2; ++i22) {
                            Test0770.instanceCount = Test0770.instanceCount;
                            i16 = i16;
                            i16 += -14124;
                            iArr2[i17 - 1] *= i19;
                            i18 >>= i19;
                        }
                        break;
                }
                dArr[i] = i16;
                Test0770.instanceCount -= 231;
            }
        }

        FuzzerUtils.out.println("i i1 i16 = " + i + "," + i1 + "," + i16);
        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 iArr2 dArr = " + i23 + "," + FuzzerUtils.checkSum(iArr2) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test0770.instanceCount iFld Test0770.fFld = " + Test0770.instanceCount + "," + iFld + "," +
                Float.floatToIntBits(Test0770.fFld));
        FuzzerUtils.out.println("Test0770.bFld Test0770.dFld Test0770.sFld = " + (Test0770.bFld ? 1 : 0) + "," +
                Double.doubleToLongBits(Test0770.dFld) + "," + Test0770.sFld);
        FuzzerUtils.out.println("byFld Test0770.lArrFld = " + byFld + "," + FuzzerUtils.checkSum(Test0770.lArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}