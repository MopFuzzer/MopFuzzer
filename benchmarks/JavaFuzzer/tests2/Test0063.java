// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:14 2023
public class Test0063 {

    public static final int N = 400;

    public static long instanceCount=2429075246L;
    public static float fFld=66.621F;
    public double dFld=42.76828;
    public byte[] byArrFld =new byte[N];
    public long[] lArrFld =new long[N];
    public static volatile double[] dArrFld =new double[N];
    public static int[][] iArrFld =new int[N][N];
    public static int[] iArrFld1 =new int[N];

    static {
        FuzzerUtils.init(Test0063.dArrFld, 0.32982);
        FuzzerUtils.init(Test0063.iArrFld, -13);
        FuzzerUtils.init(Test0063.iArrFld1, -37);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i3, int i4) {

        int i5=2392, i6=-142, i7=13, i8=13, i9=-13, i10=-92;
        double d=-1.125798;

        i4 -= (int)-4L;
        for (i5 = 7; i5 < 156; i5++) {
            for (i7 = 1; i7 < 11; ++i7) {
                i4 = 57;
                i9 = 2;
                do {
                    Test0063.fFld -= i8;
                    Test0063.fFld = Test0063.instanceCount;
                    i4 <<= i4;
                } while (--i9 > 0);
                i3 += i7;
            }
        }
        Test0063.instanceCount += (long) d;
        Test0063.iArrFld[(i3 >>> 1) % N][(i4 >>> 1) % N] <<= i5;
        i10 = 1;
        while (++i10 < 330) {
            Test0063.instanceCount += (i10 | i6);
        }
        i8 -= (int) Test0063.instanceCount;
        i4 = i8;
        vMeth1_check_sum += i3 + i4 + i5 + i6 + i7 + i8 + i9 + Double.doubleToLongBits(d) + i10;
    }

    public static int iMeth(long l) {

        short s=-17670;
        int i2=-41;
        int i11=1;
        int i12=-5;
        int i13=-78;
        int i14=18297;
        int i15=-222;
        int i16=-24624;
        int[] iArr1 =new int[N];
        boolean b=false;
        long[] lArr =new long[N];

        FuzzerUtils.init(iArr1, -43048);
        FuzzerUtils.init(lArr, 5740106287178661512L);

        s = (short)iArr1[(i2 >>> 1) % N];
        i2 = (int)(--l);
        Test0063.instanceCount += (long) (((Test0063.fFld * l) + (s * i2)) + ((i2--) * (i2 - Test0063.fFld)));
        lArr[(i2 >>> 1) % N] *= i2;
        switch (((((i2--) >>> 1) % 8) * 5) + 90) {
        case 114:
            vMeth1(i2, i2);
            break;
        case 92:
            for (i11 = 2; i11 < 283; ++i11) {
                if (b) break;
                for (i13 = i11; i13 < 6; ++i13) {
                    iArr1[i11] >>= i2;
                }
                i14 = i14;
            }
            Test0063.fFld -= -3468012310L;
            for (i15 = 9; 381 > i15; i15++) {
                i16 += i15;
                i16 *= i2;
            }
            break;
        case 120:
            i14 = (int)l;
        case 100:
            Test0063.iArrFld[(i12 >>> 1) % N][(i16 >>> 1) % N] = -3504;
            break;
        case 115:
            i2 ^= i16;
        case 98:
            i12 = i14;
            break;
        case 108:
            Test0063.fFld += Test0063.fFld;
            break;
        case 128:
            i16 *= i16;
            break;
        default:
            iArr1[(i16 >>> 1) % N] -= i16;
        }
        long meth_res = l + s + i2 + i11 + i12 + (b ? 1 : 0) + i13 + i14 + i15 + i16 + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i1=179, i18=191, i19=118, i20=-231;
        short s1=15235;
        long l1=6L;
        boolean b1=true;

        i1 += (iMeth(Test0063.instanceCount) + s1);
        Test0063.iArrFld[(i1 >>> 1) % N] = Test0063.iArrFld[(10 >>> 1) % N];
        i1 = i1;
        for (i18 = 3; i18 < 136; ++i18) {
            i19 = -18;
            Test0063.instanceCount = i18;
            i1 >>= i19;
            i1 = 64402;
            i1 ^= (int)l1;
            i19 |= i18;
            i20 = 1;
            do {
                l1 = i20;
                if (b1) continue;
                i19 = -23304;
            } while (++i20 < 12);
            i1 += (i18 - Test0063.fFld);
        }
        vMeth_check_sum += i1 + s1 + i18 + i19 + l1 + i20 + (b1 ? 1 : 0);
    }

    public void mainTest(String[] strArr1) {

        float f=62.124F;
        int i=-16109;
        int i21=-22;
        int i22=-7;
        int i23=2;
        int i24=14;
        int i25=24539;
        int i26=32313;
        int i27=-115;
        int i28=-198;
        int[] iArr =new int[N];

        FuzzerUtils.init(iArr, 223);

        for (f = 7; f < 235; ++f) {
            iArr[(int)(f + 1)] = byArrFld[(int)(f + 1)];
            Test0063.instanceCount = i;
            Test0063.instanceCount /= ((i >>= (int) (lArrFld[(int) (f + 1)]++)) | 1);
            Test0063.dArrFld[(int) (f + 1)] = (((i - i) * i) - ((i++) - (i++)));
        }
        vMeth();
        for (i21 = 199; i21 > 11; i21 -= 2) {
            Test0063.instanceCount -= i22;
            for (i23 = 266; i23 > 10; i23 -= 2) {
                dFld -= i;
                i22 = 13;
                i /= (int)(i22 | 1);
                switch ((i23 % 2) + 126) {
                case 126:
                    Test0063.fFld += (i23 * i23);
                    i24 = (int) Test0063.instanceCount;
                    break;
                case 127:
                    i24 += (-1 + (i23 * i23));
                    lArrFld = lArrFld;
                    switch (((i21 % 2) * 5) + 31) {
                    case 39:
                        for (i25 = 1; i25 < 3; i25++) {
                            short s2=26536;
                            dFld = -2.35649;
                            Test0063.iArrFld1[i21 + 1] *= i;
                            i22 *= s2;
                            Test0063.instanceCount = i23;
                            Test0063.instanceCount -= i21;
                            i26 = -32398;
                            i26 += (((i25 * Test0063.instanceCount) + i21) - i23);
                        }
                        for (i27 = 1; i27 < 3; ++i27) {
                            i += (int) Test0063.instanceCount;
                            Test0063.iArrFld[i23] = Test0063.iArrFld[i21 - 1];
                            Test0063.instanceCount >>= 4157;
                        }
                    case 34:
                        i26 -= i24;
                        break;
                    }
                    break;
                default:
                    iArr = Test0063.iArrFld1;
                }
            }
        }

        FuzzerUtils.out.println("f i i21 = " + Float.floatToIntBits(f) + "," + i + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("i28 iArr = " + i28 + "," + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test0063.instanceCount Test0063.fFld dFld = " + Test0063.instanceCount + "," +
                Float.floatToIntBits(Test0063.fFld) + "," + Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("byArrFld lArrFld Test0063.dArrFld = " + FuzzerUtils.checkSum(byArrFld) + "," +
                FuzzerUtils.checkSum(lArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0063.dArrFld)));
        FuzzerUtils.out.println("Test0063.iArrFld Test0063.iArrFld1 = " + FuzzerUtils.checkSum(Test0063.iArrFld) + "," +
                FuzzerUtils.checkSum(Test0063.iArrFld1));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0063 _instance = new Test0063();
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
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
