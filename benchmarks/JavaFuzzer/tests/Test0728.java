// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:11 2023
public class Test0728 {

    public static final int N = 400;

    public static long instanceCount = -56518L;
    public static int iFld = -23;
    public static boolean bFld = true;
    public static byte byFld = -64;
    public static long[] lArrFld = new long[N];
    public static int[][] iArrFld = new int[N][N];
    public static long iMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0728.lArrFld, 2711673199671868525L);
        FuzzerUtils.init(Test0728.iArrFld, -4);
    }

    public static double dMeth() {

        int i10 = 5303;
        long l2 = -2837709398L;
        short s1 = 25246;

        i10 = 1;
        while ((i10 += 2) < 182) {
            Test0728.lArrFld[i10 + 1] += i10;
            l2 = 1;
            while (++l2 < 17) {
                Test0728.iFld += (int) (((l2 * Test0728.iFld) + Test0728.iFld) - Test0728.iFld);
            }
            if (true) continue;
        }
        s1 /= (short) 40;
        Test0728.iArrFld[(i10 >>> 1) % N] = Test0728.iArrFld[(39 >>> 1) % N];
        long meth_res = i10 + l2 + s1;
        dMeth_check_sum += meth_res;
        return (double) meth_res;
    }

    public static short sMeth(short s, int i4) {

        int i5 = -9;
        int i6 = 23855;
        int i8 = -5;
        int i9 = -7;
        int[] iArr = new int[N];
        int[] iArr1 = new int[N];
        float f1 = 61.997F;
        double d = -2.112621;
        byte[] byArr = new byte[N];

        FuzzerUtils.init(iArr, -5367);
        FuzzerUtils.init(byArr, (byte) 36);
        FuzzerUtils.init(iArr1, -131);

        for (i5 = 8; i5 < 208; i5++) {
            for (i8 = 1; 8 > i8; i8++) {
                i9 = (int) ((++i9) * dMeth());
                i4 = (int) Test0728.instanceCount;
                i4 += i6;
                Test0728.iFld += i8;
                i4 += (int) 3646857305L;
                iArr[i5 + 1] = (int) f1;
                Test0728.iFld += i4;
                byArr[i8 - 1] *= (byte) i5;
                Test0728.iFld -= -50697;
            }
        }
        iArr1[(i8 >>> 1) % N] += i4;
        i4 -= i8;
        d -= s;
        long meth_res = s + i4 + i5 + i6 + i8 + i9 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d) +
                FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr1);
        sMeth_check_sum += meth_res;
        return (short) meth_res;
    }

    public static int iMeth(long l) {

        int i = 127, i1 = -107, i2 = -6, i3 = 26;
        long l1 = -44L;
        float f = -18.789F;
        short s2 = -23863;

        i = 225;
        while (--i > 0) {
            l1 += (i * i);
            i1 = 1;
            do {
                f += (float) ((l1 - (i + f)) + Double.longBitsToDouble(Test0728.instanceCount--));
                for (i2 = 1; i2 > 1; --i2) {
                    l1 += (((i3++) - (-3 + (3662231935L - (4L - sMeth(s2, i1))))) * i1);
                    if (Test0728.bFld) {
                        l = (long) f;
                        f = i2;
                        if (Test0728.bFld) continue;
                    }
                    i3 += i2;
                    f += i2;
                    Test0728.iArrFld[i1][i - 1] = i2;
                    i3 += (i2 * i2);
                    i3 += (i2 | i);
                }
            } while (++i1 < 7);
        }
        long meth_res = l + i + l1 + i1 + Float.floatToIntBits(f) + i2 + i3 + s2;
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0728 _instance = new Test0728();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        long l3 = -7L;
        double d1 = 5.19641, d2 = 0.50003;
        int i11 = -241, i12 = 60280, i13 = -86, i14 = -3, i15 = 8, i16 = -3, i17 = 7, i18 = -11, i19 = 170;
        float f2 = 2.781F;
        byte[] byArr1 = new byte[N];

        FuzzerUtils.init(byArr1, (byte) -70);

        Test0728.iFld = iMeth(Test0728.instanceCount);
        Test0728.instanceCount = 55;
        Test0728.instanceCount = Test0728.iFld;
        Test0728.iFld = (int) Test0728.instanceCount;
        Test0728.iArrFld[(146 >>> 1) % N][(31256 >>> 1) % N] = (int) -74.127F;
        l3 += Test0728.instanceCount;
        Test0728.iArrFld[(Test0728.iFld >>> 1) % N][(Test0728.iFld >>> 1) % N] *= (int) 2.10325;
        for (d1 = 11; d1 < 200; ++d1) {
            for (i12 = (int) (d1); i12 < 133; ++i12) {
                l3 += (4 + (i12 * i12));
                i11 += i12;
                Test0728.iArrFld[(int) (d1 - 1)][i12 + 1] = Test0728.iFld;
            }
            Test0728.iArrFld[(int) (d1 - 1)][(int) (d1 + 1)] *= (int) 12L;
        }
        Test0728.iFld += (int) d1;
        i14 = 1;
        while (++i14 < 164) {
            short s3 = -7514;
            byArr1[i14 - 1] -= (byte) i14;
            switch (((Test0728.iFld >>> 1) % 2) + 77) {
                case 77:
                    i13 >>>= s3;
                    for (i15 = 5; 153 > i15; ++i15) {
                        d2 += f2;
                    }
                    break;
                case 78:
                    for (i17 = i14; 153 > i17; ++i17) {
                        i19 = 1;
                        while ((i19 -= 2) > 0) {
                            i18 ^= 14;
                            f2 = 7044920456829318663L;
                            switch ((i14 % 2) + 80) {
                                case 80:
                                    Test0728.byFld = (byte) 99;
                                    Test0728.iFld <<= -155;
                                    break;
                                case 81:
                                    i11 += (int) Test0728.instanceCount;
                                    i16 -= (int) d1;
                                    Test0728.iFld += (int) d1;
                                default:
                                    l3 -= i16;
                            }
                        }
                    }
                    break;
                default:
                    i11 = i12;
            }
        }

        FuzzerUtils.out.println("l3 d1 i11 = " + l3 + "," + Double.doubleToLongBits(d1) + "," + i11);
        FuzzerUtils.out.println("i12 i13 i14 = " + i12 + "," + i13 + "," + i14);
        FuzzerUtils.out.println("i15 i16 d2 = " + i15 + "," + i16 + "," + Double.doubleToLongBits(d2));
        FuzzerUtils.out.println("f2 i17 i18 = " + Float.floatToIntBits(f2) + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 byArr1 = " + i19 + "," + FuzzerUtils.checkSum(byArr1));

        FuzzerUtils.out.println("Test0728.instanceCount Test0728.iFld Test0728.bFld = " + Test0728.instanceCount + "," + Test0728.iFld +
                "," + (Test0728.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0728.byFld Test0728.lArrFld Test0728.iArrFld = " + Test0728.byFld + "," +
                FuzzerUtils.checkSum(Test0728.lArrFld) + "," + FuzzerUtils.checkSum(Test0728.iArrFld));

        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  sMeth ->  sMeth iMeth mainTest
//DEBUG  dMeth ->  dMeth sMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}