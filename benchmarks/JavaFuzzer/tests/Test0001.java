// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:53 2023
public class Test0001 {

    public static final int N = 400;

    public static long instanceCount = 3786117593L;
    public static float fFld = 45.712F;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public int iFld = -36;
    public volatile boolean bFld = false;
    public long[] lArrFld = new long[N];

    public static void vMeth() {

        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, 6L);

        Test0001.instanceCount = (long) ((Math.abs(-48.386F) + (Test0001.instanceCount--)) + (Test0001.fFld++));
        lArr = (lArr = (lArr = (lArr = lArr)));
        vMeth_check_sum += FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth1(long l, int i1) {

        int i2 = -12;
        int i3 = -19447;
        int i4 = 28718;
        int i5 = 14;
        int[] iArr = new int[N];
        long l1 = 58116L;
        long[][] lArr1 = new long[N][N];
        byte by1 = 87;

        FuzzerUtils.init(lArr1, 16631L);
        FuzzerUtils.init(iArr, 1526);

        for (i2 = 11; i2 < 291; i2++) {
            for (l1 = 1; l1 < 6; ++l1) {
                i1 <<= ((-(i4 ^ -39434)) + (-(i1 + i4)));
                vMeth();
                i1 = by1;
                switch ((i2 % 2) + 42) {
                    case 42:
                        i1 += (int) l1;
                        i3 *= i4;
                        break;
                    case 43:
                        i5 = 1;
                        do {
                            l -= (long) Test0001.fFld;
                            Test0001.instanceCount = l;
                            Test0001.instanceCount = i1;
                            by1 -= (byte) -194;
                            lArr1[i2 + 1] = lArr1[(int) (l1)];
                            i3 *= i3;
                        } while (++i5 < 2);
                        break;
                    default:
                        iArr[i2 + 1] = -1;
                }
            }
        }
        long meth_res = l + i1 + i2 + i3 + l1 + i4 + by1 + i5 + FuzzerUtils.checkSum(lArr1) +
                FuzzerUtils.checkSum(iArr);
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public static int iMeth(double d) {

        int i = 11, i6 = -2, i7 = -45061, i8 = -8, i9 = -118, i10 = -4552, i11 = 5;
        byte by = -16;
        boolean b = false;
        double[] dArr = new double[N];

        FuzzerUtils.init(dArr, -2.69339);

        vMeth();
        Test0001.instanceCount = (long) (++dArr[(i >>> 1) % N]);
        dArr[(i >>> 1) % N] += (by -= (byte) 195);
        i <<= ((++i) / ((i--) | 1));
        vMeth();
        i -= iMeth1(Test0001.instanceCount, i);
        if (b) {
            for (i6 = 376; i6 > 15; --i6) {
                d = -85;
                switch ((i6 % 2) + 122) {
                    case 122:
                        for (i8 = 1; 5 > i8; ++i8) {
                            i10 = 1;
                            while (++i10 < 2) {
                                Test0001.fFld -= -10625;
                                i7 = i;
                                i9 = (int) 1.962F;
                            }
                        }
                        break;
                    case 123:
                        i11 += i;
                        break;
                }
            }
        } else {
            i -= i8;
        }
        long meth_res = Double.doubleToLongBits(d) + i + by + i6 + i7 + i8 + i9 + i10 + i11 + (b ? 1 : 0) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0001 _instance = new Test0001();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        double d1 = 1.31573;
        int i12 = 144;
        int i13 = -14;
        int i14 = 96;
        int i15 = -57464;
        int i16 = -51;
        int i17 = -2;
        int i18 = -13;
        int[] iArr1 = new int[N];
        short s = 12612;

        FuzzerUtils.init(iArr1, 6852);

        Test0001.instanceCount += (iMeth(d1) - iFld);
        for (i12 = 11; i12 < 200; i12++) {
            i13 += (int) Test0001.instanceCount;
            Test0001.instanceCount -= Test0001.instanceCount;
        }
        i14 = 1;
        while (++i14 < 338) {
            double d2 = 0.34078;
            iArr1 = iArr1;
            Test0001.instanceCount -= i13;
            iArr1[i14 + 1] += (int) d2;
            i13 = i13;
            for (i15 = 1; i15 < 74; i15++) {
                lArrFld[i14] -= (long) Test0001.fFld;
                iFld = 170;
                for (i17 = 2; i17 > 1; i17 -= 2) {
                    iArr1 = iArr1;
                    iArr1[i14 - 1] = -151;
                    i18 = (int) -99.321F;
                    i13 *= (int) -1L;
                    iArr1[(iFld >>> 1) % N] += (int) d1;
                    lArrFld = FuzzerUtils.long1array(N, (long) 7230755896451291070L);
                    if (bFld) break;
                    switch (((i14 % 4) * 5) + 98) {
                        case 114:
                            iArr1[i17 + 1] -= (int) Test0001.instanceCount;
                            break;
                        case 109:
                            iArr1[i14] += s;
                            if (bFld) continue;
                            iFld += i17;
                            break;
                        case 100:
                            d2 = -50;
                            i18 += i12;
                            if (bFld) continue;
                            break;
                        case 111:
                            i13 -= -12;
                            lArrFld[i15 - 1] *= i13;
                            break;
                    }
                }
            }
        }

        FuzzerUtils.out.println("d1 i12 i13 = " + Double.doubleToLongBits(d1) + "," + i12 + "," + i13);
        FuzzerUtils.out.println("i14 i15 i16 = " + i14 + "," + i15 + "," + i16);
        FuzzerUtils.out.println("i17 i18 s = " + i17 + "," + i18 + "," + s);
        FuzzerUtils.out.println("iArr1 = " + FuzzerUtils.checkSum(iArr1));

        FuzzerUtils.out.println("Test0001.instanceCount Test0001.fFld iFld = " + Test0001.instanceCount + "," +
                Float.floatToIntBits(Test0001.fFld) + "," + iFld);
        FuzzerUtils.out.println("bFld lArrFld = " + (bFld ? 1 : 0) + "," + FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest iMeth1
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
