// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:23 2023
public class Test0246 {

    public static final int N = 400;

    public static volatile long instanceCount=-6L;
    public static byte byFld=107;
    public static int iFld=228;
    public static boolean bFld=true;
    public short sFld=-10769;
    public static boolean[] bArrFld =new boolean[N];
    public static int[] iArrFld =new int[N];
    public static long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test0246.bArrFld, true);
        FuzzerUtils.init(Test0246.iArrFld, -18);
        FuzzerUtils.init(Test0246.lArrFld, -36684678935668820L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(byte by, int i7, int i8) {

        int i9=-253;
        int i10=36335;
        int i11=-14;
        int i12=-23079;
        int[] iArr =new int[N];
        float f1=120.982F;

        FuzzerUtils.init(iArr, 150);

        i8 -= i7;
        i7 = i8;
        for (i9 = 347; i9 > 12; --i9) {
            i8 += (i9 * i9);
            Test0246.bArrFld = Test0246.bArrFld;
            f1 += (0 + (i9 * i9));
            i8 = 25549;
            for (i11 = 1; i11 < 5; ++i11) {
                f1 += (i11 + f1);
                i10 *= 13;
                iArr = FuzzerUtils.int1array(N, (int)53169);
                i8 >>= (int) Test0246.instanceCount;
                i7 += (i11 | i8);
                iArr[i11] += i12;
            }
            f1 = i12;
        }
        vMeth1_check_sum += by + i7 + i8 + i9 + i10 + Float.floatToIntBits(f1) + i11 + i12 + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i5) {

        double d=-1.48866;
        float f=1.691F;
        int i6=145;
        int i13=-15251;
        int i14=13;
        int i15=-190;
        int i16=-211;
        int[] iArr1 =new int[N];

        FuzzerUtils.init(iArr1, 2);

        d += (++f);
        i6 = 1;
        do {
            vMeth1(Test0246.byFld, i5, 21683);
            i5 = (int) Test0246.instanceCount;
            i13 = 1;
            do {
                Test0246.byFld *= (byte) i5;
                i5 *= i6;
                if (true) break;
                for (i14 = 1; i14 < 1; ++i14) {
                    i15 = Test0246.byFld;
                }
                i16 = 1;
                do {
                    i5 += (i16 | i14);
                    f -= Test0246.iFld;
                    iArr1[i6] <<= -57475;
                    f = Test0246.iFld;
                } while (--i16 > 0);
            } while (++i13 < 9);
        } while (++i6 < 176);
        vMeth_check_sum += i5 + Double.doubleToLongBits(d) + Float.floatToIntBits(f) + i6 + i13 + i14 + i15 + i16 +
            FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth(int i2, int i3) {

        long l=102L, l1=-112L;
        int i4=6, i17=-11791, i18=-1, i19=-56312, i20=56408, i21=6286;
        short s=6121;
        float f2=0.901F;
        boolean b1=true;

        for (l = 16; l < 267; l += 3) {
            s += (short)(l - i4);
            vMeth(i4);
            Test0246.byFld += (byte) Test0246.instanceCount;
            switch ((int)((l % 2) + 120)) {
            case 120:
                Test0246.instanceCount += (l - f2);
                for (i17 = (int)(l); i17 < 19; i17++) {
                    Test0246.iArrFld[(int) (l - 1)] = i2;
                    if (true) {
                        i2 <<= i4;
                    } else if (false) {
                        s += (short)i19;
                        for (i20 = 1; i20 > i17; --i20) {
                            boolean b=true;
                            i19 = i3;
                            if (b) break;
                            i21 = (int)l1;
                        }
                    } else if (b1) {
                        Test0246.iFld += (int) (2706359390L + (i17 * i17));
                    } else {
                        l1 = Test0246.iFld;
                    }
                }
                break;
            case 121:
                Test0246.lArrFld[(int) (l + 1)] += (long) -125.47975;
                break;
            default:
                l1 <<= i21;
            }
        }
        long meth_res = i2 + i3 + l + i4 + s + Float.floatToIntBits(f2) + i17 + i18 + i19 + i20 + i21 + l1 + (b1 ? 1 :
            0);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-116, i1=23422, i22=-16, i23=-49691, i24=193, i25=-4, i26=-45289, i27=-13356, i28=33425, i29=-2;
        double d1=-2.95347;
        float f3=60.212F;

        Test0246.instanceCount -= Test0246.instanceCount;
        for (i = 335; i > 14; --i) {
            i1 -= iMeth(i1, i);
            Test0246.lArrFld[i] -= -57585L;
            Test0246.iFld += i;
            i1 = i;
            Test0246.iFld ^= 55;
            Test0246.iFld = i1;
            switch (((i >>> 1) % 2) + 4) {
            case 4:
                Test0246.byFld *= (byte) Test0246.iFld;
                Test0246.iFld += i;
                break;
            case 5:
                i1 += (((i * Test0246.iFld) + Test0246.iFld) - Test0246.instanceCount);
                for (i22 = i; i22 < 78; i22++) {
                    Test0246.iFld += (i22 + i23);
                    d1 -= Test0246.instanceCount;
                    if (Test0246.bFld) continue;
                    for (i24 = 1; 1 > i24; ++i24) {
                        i25 = -8;
                        Test0246.instanceCount += (((i24 * Test0246.instanceCount) + Test0246.byFld) - Test0246.instanceCount);
                        i1 = i23;
                        i26 += (int)-640954781502344695L;
                        i27 = sFld;
                        Test0246.instanceCount = 11;
                        i26 /= (int)(i23 | 1);
                        Test0246.iFld -= (int) -118.698F;
                    }
                    Test0246.instanceCount -= i24;
                }
                f3 = 1;
                while (++f3 < 78) {
                    for (i28 = (int)(f3); 1 > i28; ++i28) {
                        sFld -= (short)i25;
                        i27 >>= i24;
                    }
                }
                break;
            }
        }

        FuzzerUtils.out.println("i i1 i22 = " + i + "," + i1 + "," + i22);
        FuzzerUtils.out.println("i23 d1 i24 = " + i23 + "," + Double.doubleToLongBits(d1) + "," + i24);
        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("f3 i28 i29 = " + Float.floatToIntBits(f3) + "," + i28 + "," + i29);

        FuzzerUtils.out.println("Test0246.instanceCount Test0246.byFld Test0246.iFld = " + Test0246.instanceCount + "," + Test0246.byFld +
                "," + Test0246.iFld);
        FuzzerUtils.out.println("Test0246.bFld sFld Test0246.bArrFld = " + (Test0246.bFld ? 1 : 0) + "," + sFld + "," +
                FuzzerUtils.checkSum(Test0246.bArrFld));
        FuzzerUtils.out.println("Test0246.iArrFld Test0246.lArrFld = " + FuzzerUtils.checkSum(Test0246.iArrFld) + "," +
                FuzzerUtils.checkSum(Test0246.lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0246 _instance = new Test0246();
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
