// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:59 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-9L;
    public double dFld=1.129974;
    public int iFld=4;
    public static int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];
    public long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 41405);
        FuzzerUtils.init(Test.fArrFld, 46.207F);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long byMeth_check_sum = 0;

    public static byte byMeth(int i2, int i3, float f2) {

        int i4=-3, i5=32, i6=2, i7=12906, i8=22, i9=7, i10=-41542, iArr1[]=new int[N];
        byte by=19;
        double d=-14.88875;
        long lArr1[][]=new long[N][N];

        FuzzerUtils.init(iArr1, -43);
        FuzzerUtils.init(lArr1, 509735942L);

        for (i4 = 7; i4 < 248; i4++) {
            i3 += i4;
            for (i6 = 7; 1 < i6; i6 -= 2) {
                i2 -= (int)f2;
                i2 = 5;
            }
            switch ((i4 % 6) + 9) {
            case 9:
                i7 -= by;
                i5 += (((i4 * i4) + i3) - i3);
                i8 = 1;
                do {
                    i7 <<= -1;
                    f2 *= Test.instanceCount;
                    d *= i5;
                    for (i9 = 1; i9 < 1; i9++) {
                        Test.instanceCount = i10;
                        i10 = 8;
                    }
                } while (++i8 < 7);
            case 10:
                iArr1[i4] = i7;
            case 11:
                Test.instanceCount += (i4 - Test.instanceCount);
                break;
            case 12:
                i7 += (i4 * i4);
                break;
            case 13:
                lArr1[i4][i4] = i5;
                break;
            case 14:
                Test.instanceCount = i10;
                break;
            default:
                iArr1[i4 - 1] = i3;
            }
        }
        long meth_res = i2 + i3 + Float.floatToIntBits(f2) + i4 + i5 + i6 + i7 + by + i8 + Double.doubleToLongBits(d) +
            i9 + i10 + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr1);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public static int iMeth(int i1, float f1) {

        int i12=-44427, i13=-56, i14=-67;
        double d1=-92.69107;
        float f3=-77.642F, fArr[][]=new float[N][N];

        FuzzerUtils.init(fArr, 0.803F);

        Test.instanceCount = (byMeth(i1, i1, f1) - Test.instanceCount);
        i12 = 1;
        do {
            i1 = i12;
            f1 -= Test.instanceCount;
            f1 += (i12 - f1);
        } while (++i12 < 142);
        i1 = -69;
        Test.iArrFld[(i12 >>> 1) % N] = (int)-31L;
        f1 *= i1;
        for (i13 = 3; i13 < 259; ++i13) {
            short s=32079;
            s += (short)(((i13 * f1) + i13) - i13);
            d1 -= Test.instanceCount;
            i14 = i1;
            f3 = 6;
            do {
                fArr[(int)(f3 - 1)][(int)(f3 - 1)] += i14;
                i14 <<= i13;
            } while (--f3 > 0);
        }
        long meth_res = i1 + Float.floatToIntBits(f1) + i12 + i13 + i14 + Double.doubleToLongBits(d1) +
            Float.floatToIntBits(f3) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vSmallMeth(float f, int i, long l) {

        int iArr[][]=new int[N][N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 1);
        FuzzerUtils.init(lArr, 182L);

        iArr[(-202 >>> 1) % N][(i >>> 1) % N] -= (i--);
        lArr[(i >>> 1) % N] = iMeth(-6, f);
        vSmallMeth_check_sum += Float.floatToIntBits(f) + i + l + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        float f4=2.790F;
        int i16=-4865, i17=-3265, i18=14, i19=-64111, i20=35890, i21=-6, i22=-11268, i23=0, i24=6, i25=22223, i26=22559;
        boolean b=true;
        byte by1=66;

        for (int smallinvoc=0; smallinvoc<470; smallinvoc++) vSmallMeth(f4, i16, Test.instanceCount);
        for (i17 = 6; i17 < 124; ++i17) {
            switch (((i18 >>> 1) % 1) + 10) {
            case 10:
                for (i19 = 2; i19 < 212; ++i19) {
                    if (b) continue;
                    try {
                        i16 = (1697945637 / i20);
                        i18 = (i19 % -82);
                        i16 = (i20 / 23364);
                    } catch (ArithmeticException a_e) {}
                }
                switch ((((i19 >>> 1) % 1) * 5) + 104) {
                case 107:
                    f4 = 47026;
                    break;
                }
            default:
                i21 = 1;
                while (++i21 < 212) {
                    for (i22 = 1; 1 > i22; i22++) {
                        i16 = i23;
                        Test.instanceCount -= by1;
                    }
                    i16 >>>= -54;
                    Test.fArrFld[i21] -= by1;
                    i23 = (int)f4;
                }
                f4 = i23;
            }
            i16 += (i17 * f4);
            i20 ^= i20;
            i18 = (int)dFld;
            for (i24 = i17; i24 < 212; i24++) {
                i23 += i24;
                Test.iArrFld[i17 - 1] += (int)Test.instanceCount;
                i18 -= (int)Test.instanceCount;
                iFld %= (int)(i18 | 1);
                iFld += i23;
                switch ((i17 % 8) + 21) {
                case 21:
                    f4 += Test.instanceCount;
                case 22:
                    lArrFld[i17 - 1] += i19;
                    i16 = (int)Test.instanceCount;
                    break;
                case 23:
                    dFld -= iFld;
                    break;
                case 24:
                    dFld = i24;
                    break;
                case 25:
                    if (b) break;
                    break;
                case 26:
                    Test.instanceCount += (i24 | Test.instanceCount);
                    break;
                case 27:
                    f4 += i24;
                    break;
                case 28:
                    i18 &= i26;
                    break;
                default:
                    iFld -= i23;
                }
            }
        }

        FuzzerUtils.out.println("f4 i16 i17 = " + Float.floatToIntBits(f4) + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("b i21 i22 = " + (b ? 1 : 0) + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 by1 i24 = " + i23 + "," + by1 + "," + i24);
        FuzzerUtils.out.println("i25 i26 = " + i25 + "," + i26);

        FuzzerUtils.out.println("Test.instanceCount dFld iFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(dFld) + "," + iFld);
        FuzzerUtils.out.println("Test.iArrFld Test.fArrFld lArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," + FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("byMeth_check_sum: " + byMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  iMeth ->  iMeth vSmallMeth mainTest Test
//DEBUG  byMeth ->  byMeth iMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
