// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:56 2023
public class Test0957 {

    public static final int N = 400;

    public static long instanceCount=5217L;
    public static float fFld=2.470F;
    public static int iFld=-6;
    public static volatile boolean bFld=false;
    public static int[] iArrFld =new int[N];
    public static byte[] byArrFld =new byte[N];
    public static float[] fArrFld =new float[N];
    public static long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test0957.iArrFld, 14);
        FuzzerUtils.init(Test0957.byArrFld, (byte) -38);
        FuzzerUtils.init(Test0957.fArrFld, -125.893F);
        FuzzerUtils.init(Test0957.lArrFld, 8L);
    }

    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(double d1, long l, int i14) {

        int i15=-185, i16=-5, i17=72, i18=245, i19=52720, i20=-20637;
        boolean b=true;

        for (i15 = 4; 312 > i15; ++i15) {
            if (b) {
                d1 -= i14;
                Test0957.iFld = -5;
            } else {
                Test0957.fFld = i15;
                vMeth_check_sum += Double.doubleToLongBits(d1) + l + i14 + i15 + i16 + (b ? 1 : 0) + i17 + i18 + i19 +
                    i20;
                return;
            }
        }
        for (i17 = 10; i17 < 169; ++i17) {
            for (i19 = 1; i19 < 10; i19++) {
                i20 += i19;
                i14 -= Test0957.iFld;
                l = i17;
                Test0957.iFld += (23591 + (i19 * i19));
                i16 += (int)1.78875;
                Test0957.instanceCount = -44;
                l = Test0957.iFld;
                Test0957.iArrFld[i17 + 1] = Test0957.iFld;
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d1) + l + i14 + i15 + i16 + (b ? 1 : 0) + i17 + i18 + i19 + i20;
    }

    public static int iMeth(int i10, int i11, double d) {

        int i12=11, i13=-144, i21=10, i22=26762;
        double d2=20.22116;
        double[] dArr =new double[N];
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, 9385L);
        FuzzerUtils.init(dArr, -73.122098);

        d += (i11++);
        Test0957.iArrFld = (Test0957.iArrFld = (Test0957.iArrFld = (Test0957.iArrFld = Test0957.iArrFld)));
        i10 <<= (int) ((Test0957.iArrFld[(i10 >>> 1) % N] - (Test0957.fFld + Test0957.fFld)) * ((Test0957.iFld * i11) + (Test0957.fFld *
            24476)));
        for (i12 = 5; i12 < 186; ++i12) {
            lArr[i12 + 1] ^= (i11 = (int) Test0957.instanceCount);
            vMeth(d, Test0957.instanceCount, i21);
            for (d2 = 1; d2 < 9; ++d2) {
                long l1=-18331L;
                Test0957.byArrFld[i12 + 1] = (byte) i22;
                i13 = (int)l1;
                Test0957.fFld = -7;
                i22 = -57754;
                i21 = i10;
                dArr[(int)(d2 + 1)] = i21;
                i21 -= i11;
                Test0957.iArrFld = Test0957.iArrFld;
            }
        }
        long meth_res = i10 + i11 + Double.doubleToLongBits(d) + i12 + i13 + i21 + Double.doubleToLongBits(d2) + i22 +
            FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth(int i5, int i6, int i7) {

        int i8=2, i9=51805, i23=-8, i24=-6, i25=54185;
        byte by=103;
        short s=-14577;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(lArr1, 8L);

        for (i8 = 231; i8 > 8; --i8) {
            Test0957.instanceCount += (Test0957.instanceCount--);
            i6 = (int) (++Test0957.fFld);
            Test0957.fFld -= iMeth(i7, i6, 1.108085);
            i23 = 1;
            do {
                for (i24 = 1; i24 < 3; i24++) {
                    i7 += i24;
                    Test0957.iArrFld[i23 - 1] = (int) Test0957.instanceCount;
                    i7 >>= (int) Test0957.instanceCount;
                    Test0957.fFld += (((i24 * Test0957.instanceCount) + Test0957.instanceCount) - i23);
                    if (true) {
                        Test0957.instanceCount = Test0957.iFld;
                        Test0957.instanceCount += (((i24 * i6) + i9) - by);
                        Test0957.iFld = (int) Test0957.instanceCount;
                    } else if (false) {
                        i25 += i5;
                    } else if (Test0957.bFld) {
                        Test0957.fArrFld[i23 + 1] = s;
                    } else {
                        lArr1[i8] += Test0957.instanceCount;
                    }
                }
            } while ((i23 += 2) < 7);
        }
        long meth_res = i5 + i6 + i7 + i8 + i9 + i23 + i24 + i25 + by + s + FuzzerUtils.checkSum(lArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-62712;
        int i1=-5;
        int i2=0;
        int i3=160;
        int i4=6;
        int i26=51;
        int i27=39648;
        int i28=-46050;
        int i29=-25113;
        int i30=-14934;
        int[] iArr =new
                    int[N];
        byte by1=-5;
        double d3=-1.63509;
        boolean[] bArr =new boolean[N];

        FuzzerUtils.init(iArr, -204);
        FuzzerUtils.init(bArr, true);

        i = (++iArr[(i >>> 1) % N]);
        i *= (int)(((i + 2.385F) * i) + (--i));
        for (i1 = 10; 318 > i1; i1++) {
            for (i3 = 5; i3 < 82; i3 += 2) {
                i4 = (int)lMeth(i, i1, i4);
                Test0957.fArrFld[i1] -= 12;
                Test0957.iFld -= (int) 4037375614333869807L;
                Test0957.fArrFld[i1 + 1] = 12;
            }
            for (i26 = 3; i26 < 82; i26++) {
                Test0957.instanceCount = i26;
                switch ((i1 % 5) + 35) {
                case 35:
                    Test0957.lArrFld[i26 + 1] <<= i4;
                    break;
                case 36:
                    i27 = i26;
                    bArr[i26] = Test0957.bFld;
                    by1 |= (byte)i2;
                    break;
                case 37:
                    Test0957.fFld = Test0957.instanceCount;
                    for (i28 = 2; i28 > 1; i28 -= 3) {
                        iArr[i28 - 1] &= i29;
                        Test0957.instanceCount -= -240L;
                        i4 = (int) Test0957.fFld;
                        switch (((i1 % 1) * 5) + 21) {
                        case 22:
                            i27 = Test0957.iFld;
                            d3 += Test0957.instanceCount;
                            break;
                        default:
                            by1 |= (byte)i;
                        }
                    }
                    break;
                case 38:
                    i30 = 1;
                    do {
                        Test0957.instanceCount += i30;
                        Test0957.lArrFld[i26] = 220L;
                        if (Test0957.bFld) continue;
                        Test0957.iFld = (int) Test0957.fFld;
                        Test0957.fFld = -3355634017L;
                    } while (++i30 < 2);
                    break;
                case 39:
                default:
                    d3 += i30;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i4 i26 = " + i3 + "," + i4 + "," + i26);
        FuzzerUtils.out.println("i27 by1 i28 = " + i27 + "," + by1 + "," + i28);
        FuzzerUtils.out.println("i29 d3 i30 = " + i29 + "," + Double.doubleToLongBits(d3) + "," + i30);
        FuzzerUtils.out.println("iArr bArr = " + FuzzerUtils.checkSum(iArr) + "," + FuzzerUtils.checkSum(bArr));

        FuzzerUtils.out.println("Test0957.instanceCount Test0957.fFld Test0957.iFld = " + Test0957.instanceCount + "," +
                Float.floatToIntBits(Test0957.fFld) + "," + Test0957.iFld);
        FuzzerUtils.out.println("Test0957.bFld Test0957.iArrFld Test0957.byArrFld = " + (Test0957.bFld ? 1 : 0) + "," +
                FuzzerUtils.checkSum(Test0957.iArrFld) + "," + FuzzerUtils.checkSum(Test0957.byArrFld));
        FuzzerUtils.out.println("Test0957.fArrFld Test0957.lArrFld = " +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0957.fArrFld)) + "," + FuzzerUtils.checkSum(Test0957.lArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0957 _instance = new Test0957();
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  iMeth ->  iMeth lMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
