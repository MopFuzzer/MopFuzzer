// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:08 2023
public class Test0600 {

    public static final int N = 400;

    public static long instanceCount = 716604824L;
    public static float fFld = -108.945F;
    public static volatile int iFld = 130;
    public static long lFld = 3042097224L;
    public static int[] iArrFld = new int[N];
    public static long[] lArrFld = new long[N];
    public static byte[][] byArrFld = new byte[N][N];
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0600.iArrFld, -16);
        FuzzerUtils.init(Test0600.lArrFld, -74L);
        FuzzerUtils.init(Test0600.byArrFld, (byte) -118);
    }

    public short sFld = -10797;

    public static boolean bMeth(int i9) {

        int i10 = -60146, i11 = -164, i12 = 7, i13 = -9917, i14 = -183, i15 = 53266;
        boolean b1 = false;
        short s1 = -14452;
        float[][] fArr = new float[N][N];

        FuzzerUtils.init(fArr, -2.608F);

        for (i10 = 11; 254 > i10; i10++) {
            if (b1) continue;
            i11 = i10;
            Test0600.fFld += i9;
            i12 = 1;
            do {
                i9 <<= i10;
                s1 += (short) i13;
                i13 *= 125;
                Test0600.fFld += Test0600.instanceCount;
                Test0600.iArrFld[i12 - 1] = i11;
                Test0600.instanceCount ^= Test0600.instanceCount;
                Test0600.iArrFld[i10 + 1] = i11;
                for (i14 = 1; 1 > i14; ++i14) {
                    fArr[i12 + 1][i12 - 1] -= i12;
                    Test0600.iFld = (int) Test0600.instanceCount;
                }
            } while (++i12 < 7);
        }
        long meth_res = i9 + i10 + i11 + (b1 ? 1 : 0) + i12 + s1 + i13 + i14 + i15 +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static int iMeth() {

        boolean b = true;
        int i16 = 51806;
        int i17 = -8;
        int i18 = 10;
        int[] iArr = new int[N];
        double d = 0.3912;

        FuzzerUtils.init(iArr, 44694);

        for (int i8 : iArr) {
            b = bMeth(Test0600.iFld);
            if (true) {
                i8 = 9616;
            } else if (b) {
                Test0600.fFld = 0.870F;
            }
            try {
                iArr[(i8 >>> 1) % N] = (Test0600.iFld % -98);
                i8 = (-22 / i8);
                i8 = (Test0600.iFld % -137);
            } catch (ArithmeticException a_e) {
            }
            i16 = 1;
            do {
                i8 &= i16;
                for (i17 = i16; i17 < 1; i17++) {
                    Test0600.iArrFld[i16] <<= i18;
                    d += Test0600.instanceCount;
                    Test0600.instanceCount >>= 122;
                    i18 += (i17 - i8);
                    Test0600.lArrFld[i16] -= Test0600.instanceCount;
                }
            } while (++i16 < 4);
            Test0600.iArrFld[(9 >>> 1) % N] -= (int) Test0600.instanceCount;
        }
        long meth_res = (b ? 1 : 0) + i16 + i17 + i18 + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth(int i2) {

        long l = 212L;
        int i3 = -6, i4 = -27075, i5 = 136, i6 = -51440, i7 = 163, i19 = 24373, i20 = -98, i21 = 1;
        byte by = -60;
        double d1 = 26.97478;

        Test0600.fFld -= (((++l) * (i3 - Test0600.instanceCount)) * (by++));
        for (i4 = 11; i4 < 303; i4++) {
            for (i6 = 1; 6 > i6; i6++) {
                short s = 11307;
                s = (short) iMeth();
                for (i19 = 2; i19 > i6; --i19) {
                    i7 += (3 + (i19 * i19));
                }
                i21 = 2;
                while (--i21 > 0) {
                    i2 += (int) 47.70628;
                    Test0600.iArrFld[i6] *= (int) Test0600.instanceCount;
                    switch ((i21 % 6) + 25) {
                        case 25:
                            i3 += (int) (19144L + (i21 * i21));
                            s *= (short) 0;
                            i2 += i21;
                        case 26:
                            i5 = by;
                            d1 = l;
                            break;
                        case 27:
                            Test0600.instanceCount += i21;
                        case 28:
                            i3 = (int) l;
                            break;
                        case 29:
                            if (i20 != 0) {
                                vMeth_check_sum += i2 + l + i3 + by + i4 + i5 + i6 + i7 + i19 + i20 + i21 +
                                        Double.doubleToLongBits(d1);
                                return;
                            }
                            break;
                        case 30:
                            i5 = i19;
                            break;
                    }
                }
            }
        }
        vMeth_check_sum += i2 + l + i3 + by + i4 + i5 + i6 + i7 + i19 + i20 + i21 + Double.doubleToLongBits(d1);
    }

    public static void main(String[] strArr) {

        try {
            Test0600 _instance = new Test0600();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = -181, i1 = 30306, i22 = 8, i23 = 8, i24 = -126, i25 = 58, i26 = -151;
        double d2 = -44.15982;
        boolean b2 = false;
        byte by1 = -66;
        float[][] fArr1 = new float[N][N];

        FuzzerUtils.init(fArr1, -71.484F);

        for (i = 9; i < 169; i++) {
            vMeth(i);
            for (d2 = 157; d2 > 2; d2--) {
                Test0600.byArrFld[(int) (d2 + 1)][i + 1] <<= (byte) 187;
                Test0600.instanceCount = Test0600.iFld;
                Test0600.iFld = sFld;
                Test0600.iFld = (int) Test0600.fFld;
                for (i23 = 1; i23 < 2; i23++) {
                    b2 = b2;
                    if (b2) continue;
                    i1 += Test0600.iFld;
                    fArr1[i + 1] = FuzzerUtils.float1array(N, (float) -59.552F);
                }
                b2 = b2;
                Test0600.instanceCount <<= i22;
                for (i25 = 1; i25 < 2; i25++) {
                    if (b2) {
                        Test0600.iArrFld[(int) (d2)] *= i22;
                        i1 += 61711;
                        Test0600.iFld = (int) Test0600.instanceCount;
                        i1 = (int) Test0600.fFld;
                    } else if (b2) {
                        Test0600.iArrFld[i25] += -759;
                    }
                    if (b2) break;
                    switch (((i % 6) * 5) + 119) {
                        case 146:
                            Test0600.fFld *= -21619;
                            Test0600.instanceCount = Test0600.instanceCount;
                            i1 *= sFld;
                            i26 += i25;
                            break;
                        case 123:
                            Test0600.lFld += i24;
                            Test0600.iArrFld[(int) (d2)] = i1;
                            Test0600.iArrFld[i25 + 1] = i25;
                            break;
                        case 149:
                            Test0600.iArrFld[i25] >>= 2;
                        case 125:
                            if (b2) continue;
                            break;
                        case 131:
                            Test0600.iArrFld[i25] += by1;
                            break;
                        case 135:
                            Test0600.lFld += (i25 * i25);
                            break;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 d2 = " + i + "," + i1 + "," + Double.doubleToLongBits(d2));
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("b2 i25 i26 = " + (b2 ? 1 : 0) + "," + i25 + "," + i26);
        FuzzerUtils.out.println("by1 fArr1 = " + by1 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));

        FuzzerUtils.out.println("Test0600.instanceCount Test0600.fFld Test0600.iFld = " + Test0600.instanceCount + "," +
                Float.floatToIntBits(Test0600.fFld) + "," + Test0600.iFld);
        FuzzerUtils.out.println("sFld Test0600.lFld Test0600.iArrFld = " + sFld + "," + Test0600.lFld + "," +
                FuzzerUtils.checkSum(Test0600.iArrFld));
        FuzzerUtils.out.println("Test0600.lArrFld Test0600.byArrFld = " + FuzzerUtils.checkSum(Test0600.lArrFld) + "," +
                FuzzerUtils.checkSum(Test0600.byArrFld));

        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
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
//DEBUG  bMeth ->  bMeth iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
