// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:13 2023
public class Test0803 {

    public static final int N = 400;

    public static long instanceCount = 6929L;
    public static float fFld = 0.673F;
    public static byte byFld = -36;
    public static short sFld = 23622;
    public static volatile int[][] iArrFld = new int[N][N];
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0803.iArrFld, 69);
    }

    public boolean bFld = true;
    public long lFld = -1478500179895632083L;

    public static void vMeth1(float f1, float f2) {

        int i4 = -13;
        int i5 = -62323;
        int i6 = -7;
        int i7 = -6;
        int i8 = -46926;
        int i9 = -7544;
        int[] iArr1 = new int[N];
        short s = -18146;
        byte by = -126;
        double d = -2.124499;

        FuzzerUtils.init(iArr1, -2);

        for (i4 = 5; i4 < 155; ++i4) {
            f2 = -780982950846466526L;
            Test0803.instanceCount *= i5;
            iArr1[i4] -= i4;
            iArr1[i4 + 1] += i4;
            Test0803.instanceCount += s;
            for (i6 = 1; 11 > i6; ++i6) {
                for (i8 = 1; 2 > i8; i8 += 2) {
                    i5 -= i8;
                    by += (byte) 1833238086L;
                    f2 += (float) d;
                    s = (short) i6;
                    i9 = i4;
                    try {
                        i7 = (1081016835 / iArr1[i4 - 1]);
                        i5 = (68 % i6);
                        i5 = (i7 / i8);
                    } catch (ArithmeticException a_e) {
                    }
                    s += (short) f1;
                }
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f1) + Float.floatToIntBits(f2) + i4 + i5 + s + i6 + i7 + i8 + i9 + by
                + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr1);
    }

    public static void main(String[] strArr) {

        try {
            Test0803 _instance = new Test0803();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public int iMeth() {

        int i10 = 7;
        int i11 = -21520;
        int i12 = 43221;
        int i13 = 63186;
        int[] iArr2 = new int[N];
        double d1 = -1.111760, d2 = 64.130148;
        boolean b = false;

        FuzzerUtils.init(iArr2, 8);

        vMeth1(Test0803.fFld, Test0803.fFld);
        Test0803.instanceCount ^= i10;
        for (d1 = 4; d1 < 359; ++d1) {
            i11 = i11;
            Test0803.instanceCount -= Test0803.instanceCount;
            for (i12 = 1; i12 < 5; i12++) {
                Test0803.instanceCount += (i12 * i12);
                i10 += (int) Test0803.fFld;
                Test0803.fFld -= Test0803.instanceCount;
                Test0803.byFld = (byte) Test0803.instanceCount;
                Test0803.instanceCount *= i11;
                switch (((i12 % 8) * 5) + 122) {
                    case 158:
                        Test0803.sFld += (short) -53248;
                        i13 <<= i12;
                    case 145:
                        i11 = (int) Test0803.fFld;
                        break;
                    case 143:
                        i11 = i13;
                        break;
                    case 146:
                        Test0803.instanceCount = Test0803.instanceCount;
                    case 130:
                        d2 *= i11;
                        break;
                    case 160:
                        iArr2[(int) (d1 - 1)] += (int) d1;
                    case 149:
                        if (b) continue;
                    case 159:
                        try {
                            i10 = (i12 / -10470);
                            i11 = (i12 / -34631);
                            i10 = (187 % i13);
                        } catch (ArithmeticException a_e) {
                        }
                }
            }
        }
        long meth_res = i10 + Double.doubleToLongBits(d1) + i11 + i12 + i13 + Double.doubleToLongBits(d2) + (b ? 1 : 0)
                + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public void vMeth(int i, float f, int i1) {

        long l = -1479244349343892371L;
        int i3 = 156;
        int i14 = 14;
        int i15 = -221;
        int[] iArr = new int[N];
        float[] fArr = new float[N];

        FuzzerUtils.init(iArr, -12);
        FuzzerUtils.init(fArr, -2.68F);

        for (int i2 : iArr) {
            i >>>= ((-138 >> (i2 - i2)) * i);
            iArr[(i2 >>> 1) % N] = (int) (i + (-(i - l)));
            i3 = 1;
            while (++i3 < 4) {
                i += iMeth();
                i1 |= i2;
                i2 = i;
                for (i14 = 1; i14 > 1; i14--) {
                    Test0803.instanceCount >>= Test0803.instanceCount;
                    Test0803.iArrFld = Test0803.iArrFld;
                    i2 += i2;
                    Test0803.instanceCount += i3;
                }
                fArr = fArr;
                Test0803.sFld -= (short) i15;
                i2 ^= Test0803.byFld;
            }
        }
        vMeth_check_sum += i + Float.floatToIntBits(f) + i1 + l + i3 + i14 + i15 + FuzzerUtils.checkSum(iArr) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i16 = -2, i17 = -6, i18 = 3, i19 = -116, i20 = 13, i21 = -231, i22 = 240, i23 = 7;
        double d3 = -1.32989;
        float f3 = -2.181F;
        float[][] fArr1 = new float[N][N];
        boolean[] bArr = new boolean[N];
        long[] lArr = new long[N];

        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(lArr, 103L);
        FuzzerUtils.init(fArr1, 41.350F);

        vMeth(51086, 39.390F, i16);
        i16 = (int) Test0803.instanceCount;
        i16 *= i17;
        i18 = 352;
        while (--i18 > 0) {
            Test0803.instanceCount |= i18;
            bArr[i18 - 1] = true;
            Test0803.fFld += i18;
            i16 += (((i18 * i16) + i18) - i17);
            switch ((i18 % 10) + 121) {
                case 121:
                    for (d3 = 72; d3 > i18; --d3) {
                        i19 -= i18;
                        i19 <<= i16;
                    }
                    for (i20 = 72; i20 > 2; --i20) {
                        Test0803.fFld += (((i20 * i17) + i19) - Test0803.instanceCount);
                    }
                    i16 /= (int) (i19 | 1);
                    i16 = (int) d3;
                    break;
                case 122:
                    i16 = -13;
                case 123:
                    lArr = lArr;
                    for (i22 = 4; i22 < 72; ++i22) {
                        i16 -= i17;
                        i21 += i16;
                        i16 <<= (int) Test0803.instanceCount;
                        if (true) {
                            if (bFld) {
                                Test0803.byFld += (byte) i20;
                                i23 += (int) (-2691809023L + (i22 * i22));
                                switch ((i22 % 1) + 26) {
                                    case 26:
                                        Test0803.iArrFld[i18][i18 + 1] = 5;
                                        Test0803.fFld -= Test0803.instanceCount;
                                        Test0803.iArrFld[i18 - 1][i18 - 1] >>= i19;
                                        break;
                                    default:
                                        Test0803.instanceCount = (long) d3;
                                }
                            }
                        }
                    }
                case 124:
                    try {
                        i19 = (i21 % 162);
                        Test0803.iArrFld[i18][i18] = (181 / i16);
                        i21 = (i17 % i18);
                    } catch (ArithmeticException a_e) {
                    }
                    break;
                case 125:
                    i23 <<= i23;
                    break;
                case 126:
                    f3 += (i18 + Test0803.instanceCount);
                    break;
                case 127:
                    i17 = (int) Test0803.instanceCount;
                    break;
                case 128:
                    fArr1 = fArr1;
                    break;
                case 129:
                    i23 += (((i18 * lFld) + i16) - i20);
                    break;
                case 130:
                    i19 |= i21;
                    break;
                default:
                    i23 += (i18 * i18);
            }
        }

        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("d3 i19 i20 = " + Double.doubleToLongBits(d3) + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("f3 bArr lArr = " + Float.floatToIntBits(f3) + "," + FuzzerUtils.checkSum(bArr) + "," +
                FuzzerUtils.checkSum(lArr));
        FuzzerUtils.out.println("fArr1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));

        FuzzerUtils.out.println("Test0803.instanceCount Test0803.fFld Test0803.byFld = " + Test0803.instanceCount + "," +
                Float.floatToIntBits(Test0803.fFld) + "," + Test0803.byFld);
        FuzzerUtils.out.println("Test0803.sFld bFld lFld = " + Test0803.sFld + "," + (bFld ? 1 : 0) + "," + lFld);
        FuzzerUtils.out.println("Test0803.iArrFld = " + FuzzerUtils.checkSum(Test0803.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
