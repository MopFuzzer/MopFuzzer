// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:56 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-12L;
    public static short sFld=18976;
    public static byte byFld=81;
    public static boolean bFld=true;
    public float fFld=0.528F;
    public static int iArrFld[]=new int[N];
    public static double dArrFld[]=new double[N];
    public int iArrFld1[][]=new int[N][N];
    public boolean bArrFld[]=new boolean[N];
    public long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 143);
        FuzzerUtils.init(Test.dArrFld, 0.112144);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i3=-207, i4=-8599, i5=-4, i6=-19, i7=214, i8=11752, i9=-9, i10=-1;
        float f1=-85.107F;
        double d=0.61636;

        Test.sFld &= (short)i3;
        i4 = 266;
        while (--i4 > 0) {
            for (i5 = 1; 6 > i5; i5++) {
                Test.iArrFld[i5 - 1] *= Test.byFld;
                i6 -= (int)f1;
                i7 = 1;
                do {
                    Test.sFld = (short)i3;
                    Test.instanceCount += i5;
                } while (++i7 < 2);
            }
        }
        d *= i3;
        for (i8 = 3; i8 < 177; ++i8) {
            Test.dArrFld[i8 + 1] += Test.instanceCount;
        }
        i10 = 1;
        do {
            Test.instanceCount >>>= i5;
            Test.instanceCount = i7;
            Test.bFld = Test.bFld;
        } while (++i10 < 343);
        long meth_res = i3 + i4 + i5 + i6 + Float.floatToIntBits(f1) + i7 + Double.doubleToLongBits(d) + i8 + i9 + i10;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth() {

        int i1=11, i2=-211, i11=45, i12=-53076, i13=0, i14=158;
        float f2=0.699F;

        i1 = 1;
        while (++i1 < 202) {
            Test.instanceCount += (i1 - Test.instanceCount);
            i2 -= iMeth();
            f2 += i1;
            Test.byFld += (byte)i2;
            i2 = i2;
            Test.instanceCount += i1;
            for (i11 = 1; i11 < 8; ++i11) {
                i12 += (((i11 * i1) + i12) - i12);
                i12 += (((i11 * i12) + i12) - Test.byFld);
                for (i13 = i11; i13 < 2; ++i13) {
                    i14 += (162 + (i13 * i13));
                    if (Test.bFld) {
                        i14 *= (int)Test.instanceCount;
                        Test.iArrFld[i13 - 1] = i13;
                    } else {
                        i14 = (int)f2;
                    }
                }
            }
        }
        long meth_res = i1 + i2 + Float.floatToIntBits(f2) + i11 + i12 + i13 + i14;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vSmallMeth(int i, float f) {


        i = (int)(lMeth() + Test.sFld);
        vSmallMeth_check_sum += i + Float.floatToIntBits(f);
    }

    public void mainTest(String[] strArr1) {

        int i15=-38619, i16=52917, i17=3, i18=-3682, i19=13866, i20=12710;
        double d1=0.61596;

        for (int smallinvoc=0; smallinvoc<658; smallinvoc++) vSmallMeth(38151, fFld);
        for (i15 = 282; i15 > 7; --i15) {
            for (i17 = 91; i17 > i15; i17 -= 2) {
                i16 = (int)Test.instanceCount;
                d1 += i18;
                d1 = 63713;
                if (Test.bFld) break;
                for (i19 = i15; 1 > i19; ++i19) {
                    i16 += (i19 ^ i17);
                    fFld += fFld;
                    Test.iArrFld[(i15 >>> 1) % N] -= (int)Test.instanceCount;
                    Test.instanceCount += i15;
                    switch (((i19 >>> 1) % 4) + 23) {
                    case 23:
                        Test.iArrFld[i19] = -14;
                        i16 <<= i18;
                        i18 <<= (int)Test.instanceCount;
                    case 24:
                        Test.byFld -= (byte)i16;
                        break;
                    case 25:
                        i16 -= -31558;
                        i18 += (int)Test.instanceCount;
                        iArrFld1 = iArrFld1;
                        switch ((i17 % 7) + 92) {
                        case 92:
                            i18 -= i17;
                            i16 >>= i15;
                            i20 += (8 + (i19 * i19));
                            i20 = Test.sFld;
                            break;
                        case 93:
                            Test.instanceCount >>= i18;
                            bArrFld = bArrFld;
                            i18 *= i20;
                            i18 = i18;
                            break;
                        case 94:
                            if (Test.bFld) continue;
                        case 95:
                            try {
                                Test.iArrFld[i19 + 1] = (i19 / i15);
                                iArrFld1[i15][i19] = (i19 % Test.iArrFld[i17 + 1]);
                                i18 = (i16 / i19);
                            } catch (ArithmeticException a_e) {}
                            break;
                        case 96:
                            i18 = i18;
                        case 97:
                            try {
                                i20 = (i20 / i19);
                                i18 = (i17 / 20);
                                iArrFld1[i19 + 1][i19 + 1] = (i16 / i17);
                            } catch (ArithmeticException a_e) {}
                            break;
                        case 98:
                            Test.instanceCount += i19;
                        }
                    case 26:
                        Test.byFld = (byte)Test.instanceCount;
                        break;
                    default:
                        lArrFld[i19 + 1] = i16;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 d1 i19 = " + i18 + "," + Double.doubleToLongBits(d1) + "," + i19);
        FuzzerUtils.out.println("i20 = " + i20);

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.byFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Test.byFld);
        FuzzerUtils.out.println("Test.bFld fFld Test.iArrFld = " + (Test.bFld ? 1 : 0) + "," +
            Float.floatToIntBits(fFld) + "," + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.dArrFld iArrFld1 bArrFld = " +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)) + "," + FuzzerUtils.checkSum(iArrFld1) + "," +
            FuzzerUtils.checkSum(bArrFld));
        FuzzerUtils.out.println("lArrFld = " + FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth vSmallMeth mainTest Test
//DEBUG  iMeth ->  iMeth lMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
