// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:12 2023
public class Test0779 {

    public static final int N = 400;

    public static long instanceCount = 8L;
    public static int iFld = 59947;
    public static boolean bFld = false;
    public static long lFld = 8L;
    public static long[] lArrFld = new long[N];
    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0779.lArrFld, 2476135444L);
    }

    public double dFld = 0.24926;

    public static void vMeth1() {

        boolean b = true;
        double d = -1.111078;
        float f = 0.742F;
        int i4 = -62472;
        int i5 = 19502;
        int i6 = -14;
        int i7 = -25420;
        int i8 = 30174;
        int[] iArr1 = new int[N];
        long[][] lArr = new long[N][N];

        FuzzerUtils.init(lArr, -1234L);
        FuzzerUtils.init(iArr1, -13);

        b = true;
        if (Test0779.bFld) {
            d = Test0779.iFld;
        }
        f += f;
        Test0779.iFld = Test0779.iFld;
        lArr = lArr;
        for (i4 = 15; i4 < 289; ++i4) {
            f = -60518;
            d += Test0779.iFld;
            Test0779.iFld *= (int) 8005L;
            i6 = 1;
            do {
                Test0779.iFld <<= i6;
                i7 = 1;
                do {
                    iArr1[i6] += i8;
                    Test0779.instanceCount = i4;
                } while (++i7 < 1);
            } while (++i6 < 6);
        }
        vMeth1_check_sum += (b ? 1 : 0) + Double.doubleToLongBits(d) + Float.floatToIntBits(f) + i4 + i5 + i6 + i7 + i8
                + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth() {

        int i3 = 2;
        int i9 = 239;
        int i10 = -9;
        int i11 = -24733;
        int i12 = -5;
        int i13 = 5;
        int i14 = 14;
        int[] iArr = new int[N];
        short s = 14475;
        double[] dArr = new double[N];
        float[] fArr = new float[N];
        long[] lArr1 = new long[N];

        FuzzerUtils.init(iArr, 11);
        FuzzerUtils.init(dArr, 125.75754);
        FuzzerUtils.init(fArr, 1.200F);
        FuzzerUtils.init(lArr1, -3339426086L);

        iArr[(88 >>> 1) % N] = (int) (Math.abs(dArr[(i3 >>> 1) % N]++) * fArr[(-43303 >>> 1) % N]);
        switch (((((int) (Test0779.instanceCount - i3)) >>> 1) % 10) + 3) {
            case 3:
                vMeth1();
                break;
            case 4:
                for (i9 = 17; 348 > i9; i9++) {
                    if (Test0779.bFld) continue;
                }
                break;
            case 5:
                for (i11 = 19; i11 < 394; i11++) {
                    lArr1[i11] = i9;
                    Test0779.instanceCount = i11;
                    for (i13 = 1; i13 < 5; i13++) {
                        s += (short) (73.510F + (i13 * i13));
                        i3 = i13;
                        switch (((i11 % 8) * 5) + 116) {
                            case 127:
                                if (Test0779.bFld) continue;
                                Test0779.instanceCount = Test0779.iFld;
                                i10 -= (int) Test0779.instanceCount;
                                break;
                            case 147:
                                i3 += i12;
                                break;
                            case 120:
                                Test0779.instanceCount >>= i10;
                            case 136:
                                i14 -= 28006;
                                break;
                            case 155:
                            case 138:
                                i12 += 23658;
                            case 137:
                                i12 *= i9;
                            case 144:
                                s += (short) (((i13 * Test0779.instanceCount) + i14) - i9);
                                break;
                        }
                    }
                }
                break;
            case 6:
                lArr1[(i12 >>> 1) % N] = i12;
                break;
            case 7:
                Test0779.iFld = (int) 105.903F;
                break;
            case 8:
                Test0779.iFld |= (int) Test0779.instanceCount;
                break;
            case 9:
                Test0779.iFld = (int) Test0779.instanceCount;
                break;
            case 10:
                Test0779.instanceCount *= -115;
                break;
            case 11:
                i12 = (int) -13L;
                break;
            case 12:
                iArr[(i12 >>> 1) % N] -= (int) 152L;
                break;
        }
        vMeth_check_sum += i3 + i9 + i10 + i11 + i12 + i13 + i14 + s + FuzzerUtils.checkSum(iArr) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
                FuzzerUtils.checkSum(lArr1);
    }

    public static long lMeth(int i1, int i2, long l) {

        int i16 = -59470;
        int i17 = 130;
        int i18 = -19;
        int i19 = -4600;
        int i21 = 1633;
        int i22 = 8;
        int[] iArr2 = new int[N];
        short s1 = 5271;
        float f1 = -15.157F;
        long[] lArr2 = new long[N];

        FuzzerUtils.init(lArr2, -656713390204190737L);
        FuzzerUtils.init(iArr2, 12);

        vMeth();
        lArr2[(-53545 >>> 1) % N] >>>= 1670244427968658748L;
        for (i16 = 9; i16 < 191; ++i16) {
            Test0779.iFld |= Test0779.iFld;
            for (i18 = 9; 1 < i18; --i18) {
                s1 <<= (short) i17;
                Test0779.instanceCount += l;
                Test0779.instanceCount += 12;
                i19 += (((i18 * i1) + i19) - i19);
            }
            switch ((i16 % 1) + 79) {
                case 79:
                    f1 = i17;
                    for (i21 = 1; i21 < 9; i21++) {
                        if (Test0779.bFld) continue;
                        iArr2[i16 + 1] += (int) -1.111499;
                        i17 <<= (int) -134L;
                    }
                    break;
                default:
                    l += i16;
            }
        }
        long meth_res = i1 + i2 + l + i16 + i17 + i18 + i19 + s1 + Float.floatToIntBits(f1) + i21 + i22 +
                FuzzerUtils.checkSum(lArr2) + FuzzerUtils.checkSum(iArr2);
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0779 _instance = new Test0779();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = -3;
        int i23 = -7;
        int i24 = -111;
        int[] iArr3 = new int[N];
        float f2 = 0.220F;
        float[][] fArr1 = new float[N][N];
        double d1 = -33.55250;
        double[] dArr1 = new double[N];
        short s2 = 7050;
        short[][] sArr = new short[N][N];

        FuzzerUtils.init(dArr1, -71.85306);
        FuzzerUtils.init(iArr3, -155);
        FuzzerUtils.init(fArr1, 27.51F);
        FuzzerUtils.init(sArr, (short) 23977);

        i *= (int) (Math.max(Test0779.instanceCount * i, lMeth(Test0779.iFld, Test0779.iFld, Test0779.instanceCount)) + i);
        dArr1[(i >>> 1) % N] *= 4;
        f2 += i;
        i23 = 1;
        while (++i23 < 345) {
            dFld += i23;
            iArr3 = iArr3;
        }
        d1 = 1;
        do {
            Test0779.iFld = Test0779.iFld;
            fArr1 = fArr1;
            Test0779.iFld *= i23;
            Test0779.bFld = Test0779.bFld;
            s2 += (short) (d1 * d1);
            iArr3[(int) (d1)] = i;
            switch ((int) ((d1 % 5) + 45)) {
                case 45:
                    Test0779.lArrFld[(int) (d1 + 1)] >>= 1029448116434601148L;
                    dFld /= (i | 1);
                    try {
                        Test0779.iFld = (i % -211);
                        iArr3[(int) (d1 + 1)] = (iArr3[(int) (d1 + 1)] / -65);
                        iArr3[(int) (d1 + 1)] = (-34156 % i);
                    } catch (ArithmeticException a_e) {
                    }
                    break;
                case 46:
                    i24 = 139;
                    do {
                        fArr1[i24 - 1][(int) (d1)] %= (i23 | 1);
                        i -= (int) Test0779.instanceCount;
                        Test0779.iFld -= (int) Test0779.instanceCount;
                        Test0779.lArrFld[i24 - 1] -= i;
                        Test0779.iFld += i24;
                        iArr3[i24 - 1] >>= i24;
                        Test0779.lFld = 56968L;
                        i -= i;
                        Test0779.lFld += i23;
                    } while (--i24 > 0);
                    i -= -25955;
                    Test0779.lArrFld[(int) (d1 + 1)] &= i23;
                    Test0779.lArrFld[(int) (d1 - 1)] -= Test0779.lFld;
                    break;
                case 47:
                    sArr[(int) (d1)][(int) (d1)] *= (short) Test0779.iFld;
                case 48:
                    Test0779.iFld += (int) (d1 * i23);
                case 49:
                    Test0779.iFld += Test0779.iFld;
            }
        } while (++d1 < 180);

        FuzzerUtils.out.println("i f2 i23 = " + i + "," + Float.floatToIntBits(f2) + "," + i23);
        FuzzerUtils.out.println("d1 s2 i24 = " + Double.doubleToLongBits(d1) + "," + s2 + "," + i24);
        FuzzerUtils.out.println("dArr1 iArr3 fArr1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)) + "," +
                FuzzerUtils.checkSum(iArr3) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));
        FuzzerUtils.out.println("sArr = " + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test0779.instanceCount Test0779.iFld Test0779.bFld = " + Test0779.instanceCount + "," + Test0779.iFld +
                "," + (Test0779.bFld ? 1 : 0));
        FuzzerUtils.out.println("dFld Test0779.lFld Test0779.lArrFld = " + Double.doubleToLongBits(dFld) + "," + Test0779.lFld +
                "," + FuzzerUtils.checkSum(Test0779.lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
