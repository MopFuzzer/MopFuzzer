// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:44 2023
public class Test0692 {

    public static final int N = 400;

    public static long instanceCount=-39227L;
    public int iFld=0;
    public static volatile int iFld1=-150;
    public static double dFld=101.119999;
    public static long[] lArrFld =new long[N];
    public static float[] fArrFld =new float[N];
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0692.lArrFld, 5900363761383507841L);
        FuzzerUtils.init(Test0692.fArrFld, 0.172F);
        FuzzerUtils.init(Test0692.iArrFld, -241);
    }

    public static long sMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i9=-2421, i10=-130, i11=0, i12=147, i13=-168, i14=-86, i15=-7, i16=-9;
        float f1=15.492F;
        float[] fArr1 =new float[N];
        double d1=-3.77329;
        byte by=-32;
        boolean b1=true;

        FuzzerUtils.init(fArr1, -2.247F);

        i9 = 1;
        while (++i9 < 394) {
            for (i10 = 1; i10 < 4; i10++) {
                if (i9 != 0) {
                }
                f1 *= i9;
            }
            i11 += (47326 + (i9 * i9));
            i12 = 1;
            do {
                for (i13 = 1; i13 < 1; ++i13) {
                    d1 = i11;
                    i14 *= i9;
                }
                i14 *= 72;
                Test0692.instanceCount &= by;
                fArr1[i12] = i9;
                for (i15 = i12; i15 < 1; ++i15) {
                    if (b1) continue;
                    f1 += i11;
                }
            } while (++i12 < 4);
        }
        long meth_res = i9 + i10 + i11 + Float.floatToIntBits(f1) + i12 + i13 + i14 + Double.doubleToLongBits(d1) + by
            + i15 + i16 + (b1 ? 1 : 0) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i4=-156, i5=12, i6=6, i7=-18347, i8=-80;
        boolean b=false;
        boolean[][] bArr =new boolean[N][N];
        float f=-1.270F;
        float[] fArr =new float[N];
        long[] lArr =new long[N];
        byte[] byArr =new byte[N];

        FuzzerUtils.init(fArr, 0.990F);
        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(lArr, 5460128895598444445L);
        FuzzerUtils.init(byArr, (byte)94);

        Test0692.instanceCount >>= i4;
        b = b;
        i5 = 1;
        do {
            for (i6 = 5; 1 < i6; i6 -= 3) {
                i7 += (i6 | i8);
                Test0692.instanceCount += i6;
                i7 += (i6 * i6);
                if (bArr[i6 - 1][i6]) {
                    i8 = (int)fArr[i6 + 1];
                    Test0692.instanceCount -= (i7--);
                } else if (f <= (((-24900 + (f + f)) + (-Math.min(-98L, -365815019L))) + Math.abs(fArr[i5]--))) {
                } else {
                    switch (((((int)(0 + f)) >>> 1) % 9) + 2) {
                    case 2:
                        Test0692.instanceCount += (((i6 * i4) + i5) - i8);
                        i8 = (Math.min(-iMeth(), i7) - 122);
                        i8 *= -32303;
                        i8 *= i7;
                        break;
                    case 3:
                        Test0692.iFld1 += i8;
                    case 4:
                        i7 = (int) Test0692.instanceCount;
                        break;
                    case 5:
                        i4 += (((i6 * i6) + Test0692.iFld1) - i7);
                    case 6:
                        Test0692.lArrFld[i5] *= i8;
                        break;
                    case 7:
                        Test0692.iFld1 += i4;
                        break;
                    case 8:
                        lArr[i6 + 1] -= Test0692.instanceCount;
                        break;
                    case 9:
                        byArr[i5] *= (byte)-274;
                        break;
                    case 10:
                        i8 = i4;
                        break;
                    }
                    vMeth_check_sum += i4 + (b ? 1 : 0) + i5 + i6 + i7 + i8 + Float.floatToIntBits(f) +
                        Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(bArr) +
                        FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(byArr);
                    return;
                }
            }
        } while (++i5 < 318);
        vMeth_check_sum += i4 + (b ? 1 : 0) + i5 + i6 + i7 + i8 + Float.floatToIntBits(f) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(bArr) +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(byArr);
    }

    public static short sMeth(double d, int i2, int i3) {

        int i17=-2, i18=-19, i19=226, i20=-3, i21=11;
        float f3=-2.848F;

        vMeth();
        i17 = 1;
        do {
            switch (((i17 % 2) * 5) + 70) {
            case 80:
                switch ((i17 % 5) + 6) {
                case 6:
                    for (i18 = i17; i18 < 4; ++i18) {
                        i2 -= (int) Test0692.instanceCount;
                        switch (((i17 % 8) * 5) + 29) {
                        case 52:
                            f3 += i19;
                            Test0692.iFld1 = i19;
                            Test0692.instanceCount >>= i17;
                            break;
                        case 62:
                            Test0692.iFld1 <<= (int) Test0692.instanceCount;
                            i2 += (i18 + i19);
                            break;
                        case 63:
                            for (i20 = 1; i20 < 1; ++i20) {
                                i3 = Test0692.iFld1;
                                i3 *= i18;
                            }
                            break;
                        case 66:
                            i3 = (int) Test0692.instanceCount;
                            break;
                        case 60:
                            Test0692.iFld1 = i17;
                        case 35:
                            i19 += (i18 | Test0692.iFld1);
                            break;
                        case 55:
                            Test0692.instanceCount -= 193;
                        case 69:
                            i21 = i18;
                        }
                    }
                    break;
                case 7:
                case 8:
                    i21 = Test0692.iFld1;
                    break;
                case 9:
                case 10:
                    Test0692.iFld1 += (((i17 * f3) + Test0692.iFld1) - i21);
                    break;
                }
                break;
            case 78:
                Test0692.iArrFld = Test0692.iArrFld;
            }
        } while (++i17 < 388);
        long meth_res = Double.doubleToLongBits(d) + i2 + i3 + i17 + i18 + i19 + Float.floatToIntBits(f3) + i20 + i21;
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=17201;
        int i1=1;
        int i22=-245;
        int i23=62794;
        int i24=-124;
        int[] iArr =new int[N];
        byte by1=50;
        boolean b2=true;
        double[] dArr =new double[N];

        FuzzerUtils.init(iArr, -1770);
        FuzzerUtils.init(dArr, -2.123524);

        iArr[(iFld >>> 1) % N] ^= (int) ((++iFld) * (Test0692.instanceCount++));
        for (i = 4; 237 > i; ++i) {
            switch ((i % 7) + 114) {
            case 114:
                sMeth(Test0692.dFld, i, iFld);
                break;
            case 115:
                iArr[i - 1] = i1;
                iFld += i;
                Test0692.iFld1 >>= (int) Test0692.instanceCount;
                break;
            case 116:
                i1 &= iFld;
                iFld -= i;
                i22 = 1;
                do {
                    by1 += (byte)iFld;
                    for (i23 = 1; i23 > 1; i23 -= 3) {
                        float f4=1.355F;
                        i1 += (((i23 * f4) + i) - by1);
                        i24 |= Test0692.iFld1;
                        Test0692.iArrFld[i - 1] = (int) Test0692.instanceCount;
                        Test0692.iFld1 &= (int) Test0692.instanceCount;
                        Test0692.lArrFld[i23 + 1] -= (long) f4;
                        switch (((i1 >>> 1) % 9) + 100) {
                        case 100:
                            i24 -= (int)f4;
                            break;
                        case 101:
                            by1 = (byte)-8023914814127564706L;
                            Test0692.lArrFld[i23 + 1] = 57;
                            break;
                        case 102:
                            i24 *= i23;
                            break;
                        case 103:
                            dArr[i] %= -149;
                            b2 = false;
                            Test0692.dFld /= (Test0692.instanceCount | 1);
                            break;
                        case 104:
                        case 105:
                            f4 *= f4;
                            iFld *= (int) Test0692.instanceCount;
                            i24 -= Test0692.iFld1;
                            b2 = b2;
                            break;
                        case 106:
                            dArr[i] -= i1;
                            break;
                        case 107:
                            Test0692.iArrFld[i22] -= i22;
                            break;
                        case 108:
                            Test0692.iFld1 = (int) Test0692.instanceCount;
                            break;
                        }
                    }
                } while (++i22 < 108);
                break;
            case 117:
            case 118:
                i1 += (i - i);
                break;
            case 119:
                iFld += i24;
                break;
            case 120:
                Test0692.dFld *= -4;
                break;
            }
        }

        FuzzerUtils.out.println("i i1 i22 = " + i + "," + i1 + "," + i22);
        FuzzerUtils.out.println("by1 i23 i24 = " + by1 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("b2 iArr dArr = " + (b2 ? 1 : 0) + "," + FuzzerUtils.checkSum(iArr) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test0692.instanceCount iFld Test0692.iFld1 = " + Test0692.instanceCount + "," + iFld + "," +
                Test0692.iFld1);
        FuzzerUtils.out.println("Test0692.dFld Test0692.lArrFld Test0692.fArrFld = " + Double.doubleToLongBits(Test0692.dFld) + "," +
                FuzzerUtils.checkSum(Test0692.lArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0692.fArrFld)));
        FuzzerUtils.out.println("Test0692.iArrFld = " + FuzzerUtils.checkSum(Test0692.iArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0692 _instance = new Test0692();
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
//DEBUG  sMeth ->  sMeth mainTest
//DEBUG  vMeth ->  vMeth sMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth sMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
