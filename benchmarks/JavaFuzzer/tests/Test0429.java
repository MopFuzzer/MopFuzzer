// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:03 2023
public class Test0429 {

    public static final int N = 400;

    public static long instanceCount = 2249900874L;
    public static float fFld = 47.736F;
    public static volatile boolean bFld = false;
    public static long[] lArrFld = new long[N];
    public static int[] iArrFld = new int[N];
    public static long vSmallMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0429.lArrFld, -1564300025L);
        FuzzerUtils.init(Test0429.iArrFld, 24010);
    }

    public short sFld = 13326;

    public static void vSmallMeth(int i, int i1, int i2) {

        float f = -1.702F;

        i2 = (int) (i1 *= (int) (-1.408F - (++f)));
        vSmallMeth_check_sum += i + i1 + i2 + Float.floatToIntBits(f);
    }

    public static int iMeth1(int i8, int i9, int i10) {

        double d1 = 37.124700;
        int i11 = 30914;
        int i12 = -150;
        int i13 = -37427;
        int i14 = -4;
        int i15 = -10;
        int i16 = -7310;
        int[] iArr = new int[N];
        boolean b = true;
        float f2 = 0.985F;

        FuzzerUtils.init(iArr, -55679);

        d1 = d1;
        iArr[(i8 >>> 1) % N] = (int) Test0429.instanceCount;
        for (i11 = 280; i11 > 10; --i11) {
            for (i13 = 1; i13 < 6; i13++) {
                if (b) continue;
                Test0429.instanceCount |= i11;
                i8 *= i13;
                for (i15 = 1; i15 < 2; i15++) {
                    iArr[i11 - 1] = i12;
                    f2 = i9;
                    i14 += (i15 | i15);
                    if (b) break;
                    Test0429.instanceCount = Test0429.instanceCount;
                    Test0429.instanceCount = Test0429.instanceCount;
                }
                i10 -= i16;
            }
        }
        long meth_res = i8 + i9 + i10 + Double.doubleToLongBits(d1) + i11 + i12 + i13 + i14 + (b ? 1 : 0) + i15 + i16 +
                Float.floatToIntBits(f2) + FuzzerUtils.checkSum(iArr);
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth(long l) {

        int i6 = -203, i7 = -2, i17 = -8, i18 = 9373, i19 = 87, i20 = -112;
        double d = 0.11135;
        double[] dArr = new double[N];

        FuzzerUtils.init(dArr, 0.10416);

        for (i6 = 10; i6 < 258; ++i6) {
            if (Test0429.bFld) {
                i7 += i6;
                d *= (((14 * iMeth1(i6, i6, i6)) - i7) | Test0429.instanceCount);
                i7 *= (int) Test0429.fFld;
            }
            for (i17 = 1; i17 < 7; ++i17) {
                dArr = dArr;
                i7 <<= i17;
                d -= i18;
                i7 >>= i18;
            }
            i7 += (((i6 * i18) + i7) - i7);
            for (i19 = 1; i19 < 7; ++i19) {
                Test0429.instanceCount >>= l;
                i7 += (i19 * i17);
                l &= Test0429.instanceCount;
            }
        }
        vMeth_check_sum += l + i6 + i7 + Double.doubleToLongBits(d) + i17 + i18 + i19 + i20 +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static int iMeth() {

        int i4 = -14821;
        int i5 = 25914;
        int i21 = -56577;
        int i22 = -24114;
        int i23 = -5;
        int i25 = 188;
        int i26 = -124;
        int[] iArr1 = new int[N];
        short s = 22038;
        float f3 = 16.759F;

        FuzzerUtils.init(iArr1, 211);

        Test0429.instanceCount = (i4 - (3319089425L + (i5 >>>= s)));
        vMeth(27180L);
        for (f3 = 2; f3 < 284; f3++) {
            Test0429.instanceCount = i4;
            i21 += i4;
            i21 <<= i4;
            i5 += (int) (((f3 * i5) + Test0429.instanceCount) - Test0429.instanceCount);
        }
        for (i22 = 378; i22 > 17; --i22) {
            i23 += (i22 * i22);
            i4 += i5;
            for (i25 = i22; i25 < 5; ++i25) {
                if (Test0429.bFld) {
                    iArr1[i25 - 1] *= (int) Test0429.instanceCount;
                } else if (Test0429.bFld) {
                    i4 = -15;
                    i26 = i21;
                }
            }
        }
        long meth_res = i4 + i5 + s + Float.floatToIntBits(f3) + i21 + i22 + i23 + i25 + i26 +
                FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0429 _instance = new Test0429();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i3 = -62239, i27 = 23180, i28 = -5905, i29 = -7, i30 = 55272, i31 = 9;
        float f1 = -4.963F;
        float[] fArr = new float[N];
        double d2 = 91.122955;

        FuzzerUtils.init(fArr, -2.824F);

        for (int smallinvoc = 0; smallinvoc < 992; smallinvoc++)
            vSmallMeth(-8, 8 + ((--i3) * i3), (int) (sFld - ((f1 += f1)
                    - i3)));
        vSmallMeth(iMeth(), i3, 1);
        i3 = i3;
        for (i27 = 124; i27 > 6; i27 -= 2) {
            i29 = 1;
            while (++i29 < i27) {
                Test0429.instanceCount = sFld;
                fArr[i27] = i3;
                i28 ^= i29;
                i28 = i29;
                for (i30 = 1; i30 < 2; i30++) {
                    i28 *= i28;
                    i31 >>= i31;
                    i28 = i27;
                    fArr[i30] += Test0429.instanceCount;
                    switch (((i27 >>> 1) % 10) + 58) {
                        case 58:
                            Test0429.instanceCount += (long) d2;
                            switch ((i30 % 8) + 83) {
                                case 83:
                                    Test0429.lArrFld[i29 - 1] = Test0429.instanceCount;
                                    i28 &= -50;
                                    Test0429.fFld += (((i30 * Test0429.instanceCount) + i30) - Test0429.instanceCount);
                                    break;
                                case 84:
                                    i3 = (int) Test0429.instanceCount;
                                    i3 /= (int) -2.799F;
                                    i31 -= (int) 56.7649;
                                    i31 *= i30;
                                case 85:
                                    if (Test0429.bFld) break;
                                    Test0429.fFld += (i30 * i30);
                                    Test0429.lArrFld[i29] *= i27;
                                case 86:
                                    Test0429.instanceCount -= -143;
                                case 87:
                                    i28 >>= i28;
                                    i3 = (int) Test0429.instanceCount;
                                case 88:
                                    Test0429.fFld = Test0429.instanceCount;
                                    break;
                                case 89:
                                    fArr[i27 - 1] -= i28;
                                    break;
                                case 90:
                                default:
                                    Test0429.instanceCount &= i27;
                            }
                        case 59:
                            Test0429.iArrFld[i29] = 10;
                            break;
                        case 60:
                            i31 <<= i29;
                            break;
                        case 61:
                            Test0429.iArrFld[i29 + 1] = (int) Test0429.instanceCount;
                            break;
                        case 62:
                            Test0429.lArrFld[i29 + 1] -= (long) f1;
                        case 63:
                            f1 += (((i30 * i31) + i28) - i29);
                            break;
                        case 64:
                            i31 = -45944;
                            break;
                        case 65:
                        case 66:
                            i28 += i30;
                            break;
                        case 67:
                            i31 += i29;
                            break;
                        default:
                            Test0429.fFld += -26221L;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i3 f1 i27 = " + i3 + "," + Float.floatToIntBits(f1) + "," + i27);
        FuzzerUtils.out.println("i28 i29 i30 = " + i28 + "," + i29 + "," + i30);
        FuzzerUtils.out.println("i31 d2 fArr = " + i31 + "," + Double.doubleToLongBits(d2) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test0429.instanceCount sFld Test0429.fFld = " + Test0429.instanceCount + "," + sFld + "," +
                Float.floatToIntBits(Test0429.fFld));
        FuzzerUtils.out.println("Test0429.bFld Test0429.lArrFld Test0429.iArrFld = " + (Test0429.bFld ? 1 : 0) + "," +
                FuzzerUtils.checkSum(Test0429.lArrFld) + "," + FuzzerUtils.checkSum(Test0429.iArrFld));

        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}