// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:12 2023
public class Test0002 {

    public static final int N = 400;

    public static long instanceCount=895113297L;
    public static float fFld=0.294F;
    public static byte byFld=-76;
    public static short sFld=-9474;
    public static volatile boolean bFld=false;
    public volatile int iFld=209;
    public static int iFld1=176;
    public static short[][] sArrFld =new short[N][N];
    public static float[] fArrFld =new float[N];
    public static long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test0002.sArrFld, (short) -20179);
        FuzzerUtils.init(Test0002.fArrFld, 1.691F);
        FuzzerUtils.init(Test0002.lArrFld, -8689983488503123448L);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(byte by, int i5) {

        int i6=-194;
        int i7=151;
        int i8=42030;
        int i9=10;
        int[] iArr =new int[N];
        double d1=1.69976;
        double[] dArr =new double[N];

        FuzzerUtils.init(dArr, -2.36585);
        FuzzerUtils.init(iArr, -97);

        for (i6 = 8; i6 < 317; ++i6) {
            Test0002.sArrFld[i6][i6 - 1] = (short) Test0002.fFld;
            i7 ^= (int)-252L;
            for (i8 = 1; i8 < 5; ++i8) {
                if (true) continue;
                i5 += (int)2695035142L;
                d1 *= d1;
                Test0002.fFld += (i8 - i8);
                iArr[i8 - 1] &= i8;
                i7 += 123;
                i9 <<= i9;
                Test0002.instanceCount += (-26 + (i8 * i8));
                Test0002.fArrFld[i6 + 1] = (float) d1;
            }
        }
        Test0002.fArrFld[(i8 >>> 1) % N] += i7;
        i7 = (int) Test0002.fFld;
        long meth_res = by + i5 + i6 + i7 + i8 + i9 + Double.doubleToLongBits(d1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth(int i3, long l1, int i4) {

        double d2=4.101299;
        int i10=117;
        int i11=28;
        int i12=5;
        int[] iArr1 =new int[N];
        boolean b=false;

        FuzzerUtils.init(iArr1, -9);

        l1 -= ((l1 - (i4 -= i3)) * (lMeth(Test0002.byFld, i4) * i3));
        i3 -= 196;
        if (b) {
            d2 += Test0002.sFld;
            d2 = Test0002.instanceCount;
            for (i10 = 140; i10 > 1; i10 -= 2) {
                i4 += (int) Test0002.fFld;
                Test0002.fArrFld[i10 + 1] = 13237;
                i4 = (int)1.43660;
                iArr1[i10] = i11;
                Test0002.fFld += (i10 * i10);
                i12 = 1;
                do {
                    i3 *= Test0002.sFld;
                    i3 -= (int)l1;
                    iArr1[i12 + 1] %= (int)27.3069;
                } while (++i12 < 22);
            }
        } else {
            i3 -= 13863;
        }
        long meth_res = i3 + l1 + i4 + Double.doubleToLongBits(d2) + i10 + i11 + i12 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i, long l) {

        int i1=91;
        int i2=5251;
        int i13=-51;
        int i14=-40;
        int i16=-8;
        int i17=31014;
        int[] iArr2 =new int[N];
        double[][] dArr1 =new double[N][N];

        FuzzerUtils.init(dArr1, 1.58198);
        FuzzerUtils.init(iArr2, -66);

        for (i1 = 245; i1 > 1; --i1) {
            Test0002.fFld = (i = iMeth(i1, Test0002.instanceCount, i1));
            if (Test0002.bFld) break;
            dArr1 = FuzzerUtils.double2array(N, (double)0.31614);
        }
        for (i13 = 214; 3 < i13; --i13) {
            i2 = i13;
            i *= i1;
        }
        for (int i15 : iArr2) {
            if (Test0002.bFld) {
                iArr2[(i >>> 1) % N] = (int) Test0002.instanceCount;
                if (Test0002.bFld) {
                    dArr1[(i2 >>> 1) % N][(i2 >>> 1) % N] = Test0002.instanceCount;
                    for (i16 = 1; i16 < 4; ++i16) {
                        i <<= i17;
                        Test0002.sFld += (short) 3;
                    }
                } else {
                    Test0002.lArrFld[(i16 >>> 1) % N] += l;
                }
            } else if (false) {
                i15 = (int)l;
            } else if (Test0002.bFld) {
                i -= i;
            } else {
                i *= i14;
            }
        }
        vMeth_check_sum += i + l + i1 + i2 + i13 + i14 + i16 + i17 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)) + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i18=11, i19=9134, i20=-1, i21=-215, i22=213, i23=178, i24=64092, i25=-28607, i26=-102, i27=112;
        double d3=-1.123962;
        boolean b1=true;

        vMeth(66, Test0002.instanceCount);
        iFld /= (int) (Test0002.byFld | 1);
        for (i18 = 3; i18 < 382; i18 += 2) {
            if (Test0002.bFld) {
                iFld += i18;
            }
            Test0002.instanceCount >>= i19;
            d3 = -11697L;
            for (i20 = 1; 133 > i20; i20++) {
                iFld += (i20 | (long) Test0002.fFld);
                i19 = (int) Test0002.instanceCount;
                iFld = (int) Test0002.instanceCount;
                Test0002.bFld = Test0002.bFld;
            }
            for (i22 = i18; i22 < 133; ++i22) {
                Test0002.instanceCount += i22;
                Test0002.instanceCount += (long) d3;
                i24 = 1;
                do {
                    Test0002.bFld = Test0002.bFld;
                    iFld -= i18;
                } while (++i24 < 1);
                i19 = (int) Test0002.instanceCount;
                Test0002.fFld += (i22 * i22);
                i23 <<= iFld;
                i21 += (((i22 * Test0002.instanceCount) + Test0002.fFld) - iFld);
                iFld >>= -9;
                i23 += (int) Test0002.instanceCount;
                iFld = i18;
            }
            Test0002.fFld *= Test0002.iFld1;
            i25 = 1;
            do {
                for (i26 = 1; i26 < 1; ++i26) {
                    if (b1) continue;
                    i21 *= i21;
                }
            } while (++i25 < 133);
        }

        FuzzerUtils.out.println("i18 i19 d3 = " + i18 + "," + i19 + "," + Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 i27 b1 = " + i26 + "," + i27 + "," + (b1 ? 1 : 0));

        FuzzerUtils.out.println("Test0002.instanceCount Test0002.fFld Test0002.byFld = " + Test0002.instanceCount + "," +
                Float.floatToIntBits(Test0002.fFld) + "," + Test0002.byFld);
        FuzzerUtils.out.println("Test0002.sFld Test0002.bFld iFld = " + Test0002.sFld + "," + (Test0002.bFld ? 1 : 0) + "," + iFld);
        FuzzerUtils.out.println("Test0002.iFld1 Test0002.sArrFld Test0002.fArrFld = " + Test0002.iFld1 + "," +
                FuzzerUtils.checkSum(Test0002.sArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0002.fArrFld)));
        FuzzerUtils.out.println("Test0002.lArrFld = " + FuzzerUtils.checkSum(Test0002.lArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0002 _instance = new Test0002();
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  lMeth ->  lMeth iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
