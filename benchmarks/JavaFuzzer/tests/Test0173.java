// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:57 2023
public class Test0173 {

    public static final int N = 400;

    public static long instanceCount = -113L;
    public static float fFld = 70.968F;
    public static short sFld = -32737;
    public static int[] iArrFld = new int[N];
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0173.iArrFld, 2);
    }

    public int iFld = 25781;
    public byte byFld = -24;

    public static int iMeth1() {

        int i3 = -51786;
        int i4 = 178;
        int[] iArr1 = new int[N];
        double d = 0.87168, d1 = 0.82503;
        short s = -5503;

        FuzzerUtils.init(iArr1, -28097);

        for (i3 = 3; i3 < 201; ++i3) {
            d = 1;
            while ((d += 3) < 8) {
                int i5 = -151;
                i4 = (int) Test0173.instanceCount;
                iArr1[i3] >>= i4;
                i4 += (int) (d * Test0173.instanceCount);
                i4 >>>= (int) 44938L;
                i4 >>= (int) Test0173.instanceCount;
                i4 += (int) ((long) d | i5);
                i4 >>>= s;
                i4 -= (int) Test0173.instanceCount;
            }
            s *= (short) 4330;
            Test0173.fFld += i3;
            Test0173.instanceCount = i3;
            i4 = i3;
            d1 += i3;
        }
        long meth_res = i3 + i4 + Double.doubleToLongBits(d) + s + Double.doubleToLongBits(d1) +
                FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public static int iMeth(int i2) {

        double d2 = 43.106702;
        int i6 = 3, i7 = 53488, i8 = 207, i9 = -38605, i10 = -34980;

        iMeth1();
        Test0173.iArrFld = FuzzerUtils.int1array(N, (int) 5);
        i2 = (int) -943031127L;
        Test0173.instanceCount >>>= Test0173.instanceCount;
        Test0173.fFld *= i2;
        for (d2 = 11; d2 < 223; ++d2) {
            Test0173.instanceCount += (long) ((long) d2 ^ i2);
            Test0173.instanceCount += (long) (((d2 * Test0173.instanceCount) + i2) - i6);
            for (i7 = 1; 8 > i7; ++i7) {
                Test0173.fFld -= Test0173.fFld;
                for (i9 = 1; 2 > i9; ++i9) {
                    i2 *= i9;
                }
                Test0173.instanceCount = i10;
                Test0173.instanceCount = i2;
            }
            Test0173.instanceCount += (long) d2;
        }
        long meth_res = i2 + Double.doubleToLongBits(d2) + i6 + i7 + i8 + i9 + i10;
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth(int i) {

        long l = 4259924588L;
        int i1 = 199;
        int i11 = -14;
        int i12 = -31544;
        int i13 = 178;
        int i14 = -20;
        int i15 = 22488;
        int i16 = -154;
        int i17 = -4;
        int[] iArr = new int[N];
        float f = 0.371F;
        double d3 = 18.23563;

        FuzzerUtils.init(iArr, -9);

        iArr[(i >>> 1) % N] <<= (i++);
        for (l = 8; l < 199; l++) {
            f -= Math.max(iMeth(i1), i1);
            d3 -= i1;
            Test0173.fFld -= i;
        }
        for (i11 = 9; 214 > i11; i11++) {
            Test0173.iArrFld[i11] *= (int) l;
            for (i13 = 8; i13 > i11; --i13) {
                for (i15 = i11; i15 < 1; i15 += 2) {
                    d3 = i16;
                    i14 |= 44921;
                }
                i += (int) Test0173.fFld;
                i17 += i13;
                i14 += i1;
                i17 += (((i13 * Test0173.sFld) + Test0173.instanceCount) - i11);
            }
        }
        vMeth_check_sum += i + l + i1 + Float.floatToIntBits(f) + Double.doubleToLongBits(d3) + i11 + i12 + i13 + i14 +
                i15 + i16 + i17 + FuzzerUtils.checkSum(iArr);
    }

    public static void main(String[] strArr) {

        try {
            Test0173 _instance = new Test0173();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i18 = -14, i19 = -47, i20 = 4729, i21 = 5, i22 = 246, i23 = -162;
        boolean b = true;
        double d4 = 2.20430;
        double[] dArr = new double[N];
        long l1 = 7L;
        long[] lArr = new long[N];
        short s1 = 14930;
        float[] fArr = new float[N];

        FuzzerUtils.init(fArr, -1.715F);
        FuzzerUtils.init(dArr, -2.52603);
        FuzzerUtils.init(lArr, 1289913563L);

        vMeth(iFld);
        Test0173.sFld = (short) iFld;
        iFld += (int) 7L;
        i18 = 1;
        while (++i18 < 257) {
            for (i19 = i18; i19 < 98; ++i19) {
                Test0173.fFld *= Test0173.instanceCount;
                for (i21 = 1; i21 < 1; i21++) {
                    i22 = i22;
                    fArr = fArr;
                    Test0173.instanceCount = Test0173.sFld;
                    if (b) {
                        switch ((((i21 >>> 1) % 10) * 5) + 54) {
                            case 85:
                                iFld >>>= -243;
                                if (b) continue;
                                d4 += i21;
                                fArr = fArr;
                                break;
                            case 67:
                                iFld *= -1;
                                l1 += i21;
                                fArr[i18] = i20;
                                Test0173.iArrFld[i18 - 1] /= (int) (iFld | 1);
                            case 61:
                                i22 *= i20;
                                byFld *= (byte) i18;
                                iFld += (int) (-2.647F + (i21 * i21));
                                break;
                            case 65:
                                Test0173.iArrFld[i21 + 1] = byFld;
                                switch ((((i21 >>> 1) % 9) * 5) + 43) {
                                    case 61:
                                        switch ((i19 % 2) + 45) {
                                            case 45:
                                                switch (((i19 % 8) * 5) + 96) {
                                                    case 120:
                                                        Test0173.iArrFld[i18 + 1] = -25423;
                                                        dArr[i18 + 1] = iFld;
                                                    case 116:
                                                        i20 = (int) l1;
                                                    case 124:
                                                        iFld -= i18;
                                                    case 101:
                                                        Test0173.iArrFld = Test0173.iArrFld;
                                                    case 135:
                                                        iFld = s1;
                                                        break;
                                                    case 126:
                                                        Test0173.fFld = i19;
                                                        break;
                                                    case 122:
                                                        i22 += (i21 + i19);
                                                    case 121:
                                                        i20 += iFld;
                                                        break;
                                                    default:
                                                        Test0173.iArrFld[i18 - 1] *= (int) -1821916676653655952L;
                                                }
                                                break;
                                            case 46:
                                                iFld = byFld;
                                                break;
                                        }
                                    case 49:
                                        d4 -= l1;
                                        break;
                                    case 64:
                                        Test0173.iArrFld[i21] >>>= (int) l1;
                                        break;
                                    case 74:
                                        l1 -= l1;
                                        break;
                                    case 78:
                                        lArr[i19 + 1] *= Test0173.instanceCount;
                                    case 84:
                                        i20 = (int) l1;
                                        break;
                                    case 44:
                                        Test0173.iArrFld[i19 - 1] = i21;
                                        break;
                                    case 86:
                                        l1 = i19;
                                        break;
                                    case 70:
                                        i20 += (i21 | i20);
                                        break;
                                }
                                break;
                            case 70:
                                i22 &= i22;
                                break;
                            case 73:
                                Test0173.instanceCount += i23;
                                break;
                            case 92:
                                Test0173.iArrFld[i21] = i23;
                                break;
                            case 77:
                                d4 += i19;
                                break;
                            case 97:
                                i23 >>= (int) l1;
                            case 102:
                                i22 = (int) d4;
                        }
                    } else if (b) {
                        s1 -= (short) 1.34153;
                    } else {
                        i20 = i23;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 b = " + i21 + "," + i22 + "," + (b ? 1 : 0));
        FuzzerUtils.out.println("d4 l1 s1 = " + Double.doubleToLongBits(d4) + "," + l1 + "," + s1);
        FuzzerUtils.out.println("i23 fArr dArr = " + i23 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
                "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));
        FuzzerUtils.out.println("lArr = " + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test0173.instanceCount Test0173.fFld Test0173.sFld = " + Test0173.instanceCount + "," +
                Float.floatToIntBits(Test0173.fFld) + "," + Test0173.sFld);
        FuzzerUtils.out.println("iFld byFld Test0173.iArrFld = " + iFld + "," + byFld + "," +
                FuzzerUtils.checkSum(Test0173.iArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
