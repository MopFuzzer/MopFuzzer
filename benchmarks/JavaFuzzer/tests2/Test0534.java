// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:37 2023
public class Test0534 {

    public static final int N = 400;

    public static volatile long instanceCount=6084956209824887439L;
    public static float fFld=-110.234F;
    public static int iFld=-137;
    public static volatile double dFld=29.98924;
    public byte byFld=105;
    public static boolean bFld=true;
    public boolean bFld1=false;
    public static long[] lArrFld =new long[N];
    public static int[] iArrFld =new int[N];
    public static short[] sArrFld =new short[N];
    public byte[] byArrFld =new byte[N];

    static {
        FuzzerUtils.init(Test0534.lArrFld, 3L);
        FuzzerUtils.init(Test0534.iArrFld, -61701);
        FuzzerUtils.init(Test0534.sArrFld, (short) -27856);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static int iMeth(long l1, int i4, int i5) {

        short s=25146;

        i5 <<= (int) ((i4++) + ((i4++) + (-47232 * (Test0534.fFld - Test0534.instanceCount))));
        Test0534.dFld += (s *= (short) (Test0534.iFld--));
        long meth_res = l1 + i4 + i5 + s;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1() {

        int i12=-5, i13=-9, i14=173, i15=21464, i16=-10, i17=14964, i18=-61534, i19=-4, i20=-136, i21=1;
        short s1=-5213;
        byte by=22;
        float[] fArr =new float[N];

        FuzzerUtils.init(fArr, -2.811F);

        for (i12 = 3; i12 < 149; ++i12) {
            for (i14 = 1; i14 < 11; i14++) {
                for (i16 = 1; i16 < 2; i16 += 3) {
                    i13 = i15;
                    s1 |= by;
                }
                i17 += i14;
                s1 += (short)i12;
                Test0534.sArrFld[i14 - 1] *= (short) 11L;
            }
        }
        i15 += s1;
        for (float f : fArr) {
            for (i18 = 1; i18 < 4; ++i18) {
                i13 *= i15;
                for (i20 = 1; i20 < 2; i20++) {
                    try {
                        i19 = (i20 / -682574619);
                        Test0534.iArrFld[i20 - 1] = (i20 / 215);
                        i19 = (i20 % Test0534.iFld);
                    } catch (ArithmeticException a_e) {}
                    Test0534.instanceCount += (i20 * i20);
                }
            }
        }
        vMeth1_check_sum += i12 + i13 + i14 + i15 + i16 + i17 + s1 + by + i18 + i19 + i20 + i21 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static int iMeth1(long l2) {

        int i9=-5339, i10=4, i11=28336, i22=-9, i23=-14, i24=6, i25=-17178;
        long l3=-1859904944L, l4=-532538603L;

        for (i9 = 9; i9 < 159; ++i9) {
            i10 += (int) (((i10 - Test0534.dFld) * (--Test0534.iArrFld[i9 - 1])) - (i11++));
        }
        Test0534.iArrFld[(i9 >>> 1) % N] = -3;
        vMeth1();
        Test0534.instanceCount &= Test0534.iFld;
        Test0534.fFld = 283780220L;
        l3 = 1;
        while (++l3 < 144) {
            i10 = i10;
            for (i22 = 1; i22 < 11; i22++) {
                Test0534.instanceCount += l3;
                Test0534.iFld += (int) l4;
                for (i24 = 1; i24 < 2; ++i24) {
                    l2 -= i25;
                    if (i23 != 0) {
                    }
                    if (Test0534.bFld) break;
                }
            }
        }
        long meth_res = l2 + i9 + i10 + i11 + l3 + i22 + i23 + l4 + i24 + i25;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth(long l) {


        if (byFld != iMeth((++Test0534.iFld) * (l--), Test0534.iFld, (int) ((4 + Test0534.fFld) - Test0534.iFld))) {
            Test0534.iFld = iMeth((long) (88 + (Test0534.iFld + 1.66926)), iMeth((long) (Test0534.fFld + -58588), iMeth(l, Test0534.iFld,
                    Test0534.iFld), Test0534.iFld++), --Test0534.iFld);
        }
        Test0534.lArrFld[(Test0534.iFld >>> 1) % N] -= (((l + Test0534.instanceCount) - (-215472978L - iMeth(l, Test0534.iFld,
                Test0534.iFld))) + (-(Test0534.iFld * Test0534.iFld)));
        vMeth_check_sum += l;
    }

    public long lMeth(int i6) {

        int i7=-14386, i8=-9, i27=194, i28=-4033;
        short s2=32506;

        for (i7 = 12; i7 < 242; ++i7) {
            i8 = (int) (((Test0534.instanceCount * Test0534.iFld) / (Test0534.iFld | 1)) + iMeth1(Test0534.instanceCount));
            if (true) {
                bFld1 = true;
            } else if (bFld1) {
                Test0534.instanceCount *= s2;
                Test0534.iArrFld[i7 + 1] = i7;
            } else if (bFld1) {
                i27 = 1;
                while (++i27 < 7) {
                    Test0534.iArrFld[i7] *= i27;
                    Test0534.iFld = -136;
                    i28 = 1;
                    while (++i28 < 1) {
                        switch ((i7 % 6) + 10) {
                        case 10:
                            i8 += -12;
                            i8 = (int) Test0534.fFld;
                            i8 += (i28 ^ byFld);
                            break;
                        case 11:
                            i6 = -23;
                        case 12:
                            Test0534.fFld += (i28 * i28);
                            break;
                        case 13:
                            Test0534.instanceCount -= Test0534.iFld;
                            break;
                        case 14:
                            Test0534.iArrFld[i27] = i28;
                            break;
                        case 15:
                            Test0534.iFld += i6;
                            break;
                        default:
                            Test0534.iFld += (i28 * i27);
                        }
                    }
                }
            }
        }
        long meth_res = i6 + i7 + i8 + s2 + i27 + i28;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-62021;
        int i1=64109;
        int i2=14;
        int[] iArr =new int[N];
        short s3=12079;
        boolean b=true;

        FuzzerUtils.init(iArr, -9);

        Test0534.lArrFld[(i >>> 1) % N] = (--i);
        Test0534.fFld = Test0534.fFld;
        for (i1 = 6; i1 < 179; i1++) {
            vMeth(lMeth(i));
            Test0534.lArrFld[i1 + 1] = i;
            s3 = (short)i1;
            Test0534.iArrFld[i1] >>= Test0534.iFld;
            b = bFld1;
            Test0534.fFld += (i1 + byFld);
            byArrFld = byArrFld;
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("s3 b iArr = " + s3 + "," + (b ? 1 : 0) + "," + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test0534.instanceCount Test0534.fFld Test0534.iFld = " + Test0534.instanceCount + "," +
                Float.floatToIntBits(Test0534.fFld) + "," + Test0534.iFld);
        FuzzerUtils.out.println("Test0534.dFld byFld Test0534.bFld = " + Double.doubleToLongBits(Test0534.dFld) + "," + byFld + ","
                + (Test0534.bFld ? 1 : 0));
        FuzzerUtils.out.println("bFld1 Test0534.lArrFld Test0534.iArrFld = " + (bFld1 ? 1 : 0) + "," +
                FuzzerUtils.checkSum(Test0534.lArrFld) + "," + FuzzerUtils.checkSum(Test0534.iArrFld));
        FuzzerUtils.out.println("Test0534.sArrFld byArrFld = " + FuzzerUtils.checkSum(Test0534.sArrFld) + "," +
            FuzzerUtils.checkSum(byArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0534 _instance = new Test0534();
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 lMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth1 lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}