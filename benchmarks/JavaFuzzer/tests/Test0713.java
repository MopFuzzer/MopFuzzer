// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:11 2023
public class Test0713 {

    public static final int N = 400;

    public static long instanceCount = 9L;
    public static short sFld = -16717;
    public static byte byFld = -113;
    public static int iFld = 7;
    public static int iFld1 = 56731;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public float fFld = 113.519F;

    public static float fMeth(byte by, long l) {

        int i6 = 23527;
        int i7 = -230;
        int i8 = -244;
        int i9 = 1;
        int i10 = 92;
        int i11 = 27129;
        int[] iArr = new int[N];
        double d = -37.58862;
        float f1 = -88.825F;
        float[] fArr = new float[N];

        FuzzerUtils.init(fArr, -120.245F);
        FuzzerUtils.init(iArr, 1631);

        i6 *= (int) -9169300597151740786L;
        d = i6;
        i6 *= (int) Test0713.instanceCount;
        fArr[(i6 >>> 1) % N] -= (float) 60.93015;
        Test0713.instanceCount /= (i6 | 1);
        for (i7 = 273; i7 > 1; i7 -= 2) {
            iArr[i7] = (int) -13L;
            for (i9 = 1; i9 < 12; ++i9) {
                i8 += (((i9 * f1) + i7) - Test0713.sFld);
                switch (((i9 % 5) * 5) + 69) {
                    case 89:
                        switch ((i7 % 1) + 7) {
                            case 7:
                                iArr[i7 + 1] = -69;
                                i11 = 1;
                                while (++i11 < 2) {
                                    i10 = (int) Test0713.instanceCount;
                                    i8 += (int) d;
                                }
                                break;
                            default:
                                iArr[i9 + 1] = (int) f1;
                        }
                    case 87:
                        d -= i11;
                        break;
                    case 74:
                        i6 = (int) l;
                        break;
                    case 81:
                        f1 += i8;
                        break;
                    case 86:
                        i10 += i9;
                }
            }
        }
        long meth_res = by + l + i6 + Double.doubleToLongBits(d) + i7 + i8 + i9 + i10 + Float.floatToIntBits(f1) + i11
                + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr);
        fMeth_check_sum += meth_res;
        return (float) meth_res;
    }

    public static void vMeth(int i3, int i4, int i5) {

        long l1 = -15617L;
        long[][] lArr = new long[N][N];
        int i12 = 13, i13 = -38107, i14 = 210;
        double d1 = -2.30076;
        boolean b1 = false;

        FuzzerUtils.init(lArr, -1635814030L);

        fMeth(Test0713.byFld, Test0713.instanceCount);
        for (l1 = 133; l1 > 6; --l1) {
            boolean b = false;
            i5 -= (int) d1;
            if (b) break;
        }
        i4 >>= i5;
        lArr = lArr;
        for (i13 = 148; 6 < i13; --i13) {
            i3 += (((i13 * i12) + i12) - i4);
            Test0713.instanceCount += i3;
            i3 -= -13;
            switch (((i13 % 4) * 5) + 123) {
                case 141:
                    i4 = i14;
                    if (b1) continue;
                    break;
                case 135:
                    if (b1) break;
                    i4 |= i14;
                    break;
                case 124:
                    d1 = 4;
                case 128:
                    i4 >>= i12;
                default:
                    if (i13 != 0) {
                        vMeth_check_sum += i3 + i4 + i5 + l1 + i12 + Double.doubleToLongBits(d1) + i13 + i14 + (b1 ? 1 : 0)
                                + FuzzerUtils.checkSum(lArr);
                        return;
                    }
            }
        }
        vMeth_check_sum += i3 + i4 + i5 + l1 + i12 + Double.doubleToLongBits(d1) + i13 + i14 + (b1 ? 1 : 0) +
                FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth() {

        int i1 = 37002, i2 = 0, i15 = 52484, i16 = 14;
        float f2 = 89.598F;

        for (i1 = 13; i1 < 376; ++i1) {
            i2 = (i2++);
            if (i1 != 0) {
            }
            vMeth(i1, 54355, i2);
            i2 += i1;
        }
        f2 = Test0713.instanceCount;
        i2 = i2;
        i2 += (int) f2;
        Test0713.instanceCount |= Test0713.instanceCount;
        for (i15 = 2; i15 < 190; ++i15) {
            Test0713.instanceCount -= i15;
        }
        long meth_res = i1 + i2 + Float.floatToIntBits(f2) + i15 + i16;
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0713 _instance = new Test0713();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = 40;
        int i17 = 179;
        int i18 = -38546;
        int i19 = -56612;
        int i20 = -46262;
        int i21 = -23313;
        int i22 = -45554;
        int i23 = -177;
        int[] iArr1 = new int[N];
        float f = 2.493F;
        double d2 = 0.5245;
        double d3 = 0.76537;
        double[][] dArr = new double[N][N];

        FuzzerUtils.init(iArr1, 13135);
        FuzzerUtils.init(dArr, -58.46176);

        Test0713.instanceCount = (long) ((i--) - (f = iMeth()));
        for (i17 = 380; i17 > 3; --i17) {
            for (i19 = i17; i19 < 67; ++i19) {
                d2 -= 37787L;
                fFld *= 6;
                iArr1[i17 + 1] = i21;
                Test0713.byFld >>= Test0713.byFld;
                i -= Test0713.sFld;
                fFld = i19;
                Test0713.instanceCount <<= Test0713.instanceCount;
                dArr[i19][i19 + 1] -= i18;
                i20 = i19;
                d3 = i;
            }
            iArr1[i17] = -241;
            Test0713.instanceCount = i21;
            switch (((i17 % 2) * 5) + 62) {
                case 68:
                    f *= Test0713.instanceCount;
                    i20 *= (int) Test0713.instanceCount;
                    i20 *= i20;
                case 67:
                    i18 -= (int) -1.48021;
                    for (i22 = 2; i22 < 67; i22 += 3) {
                        boolean b2 = true;
                        Test0713.iFld += (i22 + Test0713.iFld);
                        Test0713.iFld >>= i17;
                        switch (((i17 % 7) * 5) + 73) {
                            case 98:
                                i20 <<= i17;
                                i18 = (int) fFld;
                                d3 = 9127;
                                break;
                            case 97:
                                i18 += (((i22 * i19) + i) - Test0713.instanceCount);
                                b2 = b2;
                                i23 = (int) d2;
                                break;
                            case 83:
                                Test0713.iFld += (i22 * Test0713.iFld1);
                                break;
                            case 85:
                                iArr1[i22 - 1] = i18;
                                break;
                            case 102:
                            case 107:
                                i18 -= -60565;
                                break;
                            case 84:
                                Test0713.iFld1 -= i19;
                        }
                    }
                    break;
                default:
                    Test0713.instanceCount = (long) d3;
            }
        }

        FuzzerUtils.out.println("i f i17 = " + i + "," + Float.floatToIntBits(f) + "," + i17);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("d2 i21 d3 = " + Double.doubleToLongBits(d2) + "," + i21 + "," +
                Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("i22 i23 iArr1 = " + i22 + "," + i23 + "," + FuzzerUtils.checkSum(iArr1));
        FuzzerUtils.out.println("dArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test0713.instanceCount Test0713.sFld Test0713.byFld = " + Test0713.instanceCount + "," + Test0713.sFld +
                "," + Test0713.byFld);
        FuzzerUtils.out.println("fFld Test0713.iFld Test0713.iFld1 = " + Float.floatToIntBits(fFld) + "," + Test0713.iFld + "," +
                Test0713.iFld1);

        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  fMeth ->  fMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
