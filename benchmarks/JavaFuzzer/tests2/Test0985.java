// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:58 2023
public class Test0985 {

    public static final int N = 400;

    public static long instanceCount=8L;
    public static int iFld=6;
    public static short sFld=-27092;
    public static volatile boolean bFld=false;
    public static float fFld=112.997F;
    public static int iFld1=-141;
    public static long[] lArrFld =new long[N];
    public double[] dArrFld =new double[N];

    static {
        FuzzerUtils.init(Test0985.lArrFld, 239L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i6, int i7, int i8) {

        int i9=-7, i10=-25, i11=238, i12=-59074, i13=-158, i14=6078, i15=-14, i16=-3, i17=55647;
        float f=1.464F;
        byte by=43;
        long l=-48L;

        for (i9 = 5; i9 < 169; ++i9) {
            i11 = 1;
            do {
                for (i12 = i11; 1 > i12; i12 += 2) {
                    Test0985.instanceCount += (i12 + f);
                }
                by -= (byte)i10;
                f += -7;
            } while (++i11 < 10);
            i8 = Test0985.iFld;
            for (i14 = 10; i14 > i9; --i14) {
                i13 -= i16;
                Test0985.instanceCount += (long) (-68.947F + (i14 * i14));
                Test0985.instanceCount += (long) f;
                for (l = i14; 1 > l; ++l) {
                    i10 ^= (int) Test0985.instanceCount;
                    i17 >>= 13732;
                }
            }
            Test0985.lArrFld[i9 + 1] >>>= Test0985.instanceCount;
        }
        long meth_res = i6 + i7 + i8 + i9 + i10 + i11 + i12 + i13 + Float.floatToIntBits(f) + by + i14 + i15 + i16 + l
            + i17;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1() {

        int i5=66, i18=105, i19=-14126, i20=50922;
        double d=33.67892;
        byte by1=-79;
        float f1=-66.985F;

        Test0985.iFld -= Short.reverseBytes((short) (-3755));
        i5 = 1;
        while (++i5 < 309) {
            Test0985.sFld >>= (short) i5;
            Test0985.iFld = (((i5 + Test0985.iFld) - (i5 + 8)) - ((i5 * i5) * iMeth(i5, i18, Test0985.iFld)));
            i18 <<= (int) Test0985.instanceCount;
            Test0985.iFld += (i5 - i18);
            d /= (i5 | 1);
            for (i19 = 1; i19 < 5; ++i19) {
                i20 <<= Test0985.iFld;
                i18 += (((i19 * i18) + i19) - Test0985.instanceCount);
                Test0985.iFld += i19;
                Test0985.instanceCount = by1;
                f1 += (i19 - i19);
                if (Test0985.bFld) break;
                i20 += (((i19 * Test0985.iFld) + i19) - i18);
            }
        }
        vMeth1_check_sum += i5 + i18 + Double.doubleToLongBits(d) + i19 + i20 + by1 + Float.floatToIntBits(f1);
    }

    public static void vMeth(int i) {

        int i1=-7;
        int i2=-138;
        int i3=-11;
        int i4=-15;
        int i21=4;
        int[] iArr =new int[N];
        byte by2=-117;

        FuzzerUtils.init(iArr, -46327);

        i *= i;
        for (i1 = 17; i1 < 357; ++i1) {
            for (i3 = 1; i3 < 5; ++i3) {
                vMeth1();
                switch (((i1 % 3) * 5) + 30) {
                case 31:
                    by2 *= (byte)i;
                    if (false) break;
                    Test0985.iFld = Test0985.iFld;
                    break;
                case 33:
                    iArr[i1] *= (int) Test0985.fFld;
                    i = i;
                    i21 += (int)9L;
                    Test0985.iFld1 = by2;
                    break;
                case 43:
                default:
                    Test0985.instanceCount += (i3 ^ i1);
                    i2 = i21;
                }
            }
            Test0985.instanceCount = Test0985.instanceCount;
        }
        vMeth_check_sum += i + i1 + i2 + i3 + i4 + by2 + i21 + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i22=238, i23=3, i24=-130, i25=-10140, i26=58653, i27=2, i28=6116, i29=8148;
        byte by3=-104;
        double d1=-2.41590;
        long l2=2787444478L;

        vMeth(Test0985.iFld1);
        for (long l1 : Test0985.lArrFld) {
            for (i22 = 1; i22 < 63; ++i22) {
                Test0985.sFld = (short) i22;
                Test0985.instanceCount -= Test0985.instanceCount;
                by3 -= (byte) Test0985.iFld1;
                for (i24 = 1; i24 < 2; ++i24) {
                    i23 += (i24 | l1);
                    by3 = (byte)-5;
                    Test0985.lArrFld[i24] = 12;
                    l1 = (long)d1;
                    Test0985.iFld1 = by3;
                    d1 *= i22;
                }
            }
            for (i26 = 2; i26 < 63; ++i26) {
                by3 *= (byte)1.627F;
            }
            i27 = 16125;
            Test0985.lArrFld[(i27 >>> 1) % N] = l1;
            for (i28 = 3; i28 < 63; ++i28) {
                i25 += (i28 ^ Test0985.instanceCount);
                Test0985.iFld += (i28 + Test0985.iFld);
                dArrFld[i28 + 1] += Test0985.instanceCount;
                l2 = 1;
                do {
                    Test0985.sFld += (short) (l2 * l2);
                    Test0985.fFld = -2;
                    Test0985.iFld <<= by3;
                    Test0985.fFld += (l2 * l2);
                    Test0985.lArrFld[(int) (l2)] = i24;
                    l1 -= i28;
                    Test0985.iFld += (int) (l2 * l2);
                    i23 = i23;
                } while (++l2 < 2);
            }
        }

        FuzzerUtils.out.println("i22 i23 by3 = " + i22 + "," + i23 + "," + by3);
        FuzzerUtils.out.println("i24 i25 d1 = " + i24 + "," + i25 + "," + Double.doubleToLongBits(d1));
        FuzzerUtils.out.println("i26 i27 i28 = " + i26 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("i29 l2 = " + i29 + "," + l2);

        FuzzerUtils.out.println("Test0985.instanceCount Test0985.iFld Test0985.sFld = " + Test0985.instanceCount + "," + Test0985.iFld +
                "," + Test0985.sFld);
        FuzzerUtils.out.println("Test0985.bFld Test0985.fFld Test0985.iFld1 = " + (Test0985.bFld ? 1 : 0) + "," +
                Float.floatToIntBits(Test0985.fFld) + "," + Test0985.iFld1);
        FuzzerUtils.out.println("Test0985.lArrFld dArrFld = " + FuzzerUtils.checkSum(Test0985.lArrFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0985 _instance = new Test0985();
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}