// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:45 2023
public class Test0714 {

    public static final int N = 400;

    public static long instanceCount=72L;
    public int iFld=-5;
    public static double dFld=-2.88853;
    public byte byFld=-15;
    public static volatile short sFld=-27381;
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0714.iArrFld, -6);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i5) {

        float f=0.1001F;
        float[] fArr =new float[N];

        FuzzerUtils.init(fArr, -97.363F);

        f -= 24865;
        fArr[(i5 >>> 1) % N] -= 7;
        i5 = i5;
        i5 = (int) Test0714.instanceCount;
        vMeth1_check_sum += i5 + Float.floatToIntBits(f) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth(int i2, int i3, int i4) {

        int i6=4;
        int i7=-15521;
        int i8=-13;
        int[] iArr =new int[N];
        boolean b=true;
        double d1=-2.100317;

        FuzzerUtils.init(iArr, 12);

        vMeth1(i3);
        i6 = 206;
        do {
            i2 >>= i6;
            Test0714.iArrFld[i6] += i2;
            if (b) continue;
            for (i7 = 8; i7 > 1; i7 -= 3) {
                i2 = 46641;
                i8 = i2;
                i3 -= (int) Test0714.instanceCount;
                i3 >>= i8;
                i3 = i4;
                i2 >>= i8;
                iArr[i6] -= i3;
                d1 += i4;
                i3 = i8;
            }
        } while (--i6 > 0);
        vMeth_check_sum += i2 + i3 + i4 + i6 + (b ? 1 : 0) + i7 + i8 + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(int i, long l) {

        int i1=-26, i9=13, i10=13, i12=49305, i13=-9, i14=-62259;
        float f1=-114.89F;

        i1 = 1;
        do {
            i = i;
            vMeth(12, i, i);
            i = i;
            i = i;
            i += i;
            i |= 46;
        } while (++i1 < 383);
        for (i9 = 20; i9 < 323; i9++) {
            for (i12 = 1; i12 < 5; ++i12) {
                i = -47241;
            }
            f1 %= 190L;
            Test0714.iArrFld[i9 + 1] += (int) Test0714.dFld;
            i13 = i14;
            i14 <<= i10;
            Test0714.iArrFld[i9 + 1] = (int) Test0714.instanceCount;
        }
        long meth_res = i + l + i1 + i9 + i10 + i12 + i13 + Float.floatToIntBits(f1) + i14;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d=17.118880, d2=-1.24654;
        int i15=182, i16=104, i17=4662, i18=175;
        boolean b1=true;
        byte[][] byArr =new byte[N][N];
        float[] fArr1 =new float[N];

        FuzzerUtils.init(byArr, (byte)9);
        FuzzerUtils.init(fArr1, 0.705F);

        d += (-(++d));
        iFld = (int) (iMeth(iFld, Test0714.instanceCount) - Test0714.instanceCount);
        iFld = 4;
        Test0714.iArrFld[(iFld >>> 1) % N] = iFld;
        switch (((iFld >>> 1) % 9) + 106) {
        case 106:
            Test0714.instanceCount <<= iFld;
            i15 = 1;
            while (++i15 < 319) {
                iFld >>>= iFld;
                iFld += i15;
                for (i16 = i15; i16 < 79; i16++) {
                    float f2=2.589F;
                    Test0714.iArrFld[i15 + 1] = (int) 1.38115;
                    f2 = iFld;
                    iFld >>= (int) Test0714.instanceCount;
                    for (d2 = 1; d2 < 1; ++d2) {
                        switch (((i17 >>> 1) % 3) + 20) {
                        case 20:
                            i18 -= (int) Test0714.instanceCount;
                            Test0714.instanceCount = byFld;
                            if (b1) continue;
                            i18 = 166;
                            break;
                        case 21:
                            iFld >>= byFld;
                            break;
                        case 22:
                            i18 = i16;
                            i17 -= iFld;
                            switch ((((-58395 >>> 1) % 2) * 5) + 48) {
                            case 52:
                                iFld = i15;
                                b1 = b1;
                                switch (((6 >>> 1) % 9) + 100) {
                                case 100:
                                    Test0714.instanceCount += Test0714.instanceCount;
                                    i17 = iFld;
                                    break;
                                case 101:
                                    i17 = iFld;
                                    i17 += Test0714.sFld;
                                    break;
                                case 102:
                                    i17 <<= i17;
                                    break;
                                case 103:
                                    i18 = i15;
                                    break;
                                case 104:
                                case 105:
                                    Test0714.instanceCount += (-44036 + (d2 * d2));
                                    break;
                                case 106:
                                    i18 += (int)(((d2 * iFld) + i15) - i18);
                                    break;
                                case 107:
                                    i17 *= i16;
                                    break;
                                case 108:
                                    f2 *= iFld;
                                    break;
                                }
                            case 53:
                                byArr[i16 - 1][(int)(d2)] -= (byte)i17;
                                break;
                            default:
                                Test0714.instanceCount |= -58725;
                            }
                        }
                    }
                }
            }
            break;
        case 107:
            i17 = (int)-3L;
            break;
        case 108:
            i17 += (int)d;
            break;
        case 109:
        case 110:
            fArr1[(iFld >>> 1) % N] = i17;
            break;
        case 111:
            byFld = (byte)223;
            break;
        case 112:
            i17 = i15;
            break;
        case 113:
            i17 = (int)d;
            break;
        case 114:
            Test0714.instanceCount += 183;
            break;
        default:
            b1 = b1;
        }

        FuzzerUtils.out.println("d i15 i16 = " + Double.doubleToLongBits(d) + "," + i15 + "," + i16);
        FuzzerUtils.out.println("i17 d2 i18 = " + i17 + "," + Double.doubleToLongBits(d2) + "," + i18);
        FuzzerUtils.out.println("b1 byArr fArr1 = " + (b1 ? 1 : 0) + "," + FuzzerUtils.checkSum(byArr) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));

        FuzzerUtils.out.println("Test0714.instanceCount iFld Test0714.dFld = " + Test0714.instanceCount + "," + iFld + "," +
                Double.doubleToLongBits(Test0714.dFld));
        FuzzerUtils.out.println("byFld Test0714.sFld Test0714.iArrFld = " + byFld + "," + Test0714.sFld + "," +
                FuzzerUtils.checkSum(Test0714.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0714 _instance = new Test0714();
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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
