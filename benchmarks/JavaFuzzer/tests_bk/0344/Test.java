// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:01 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-236L;
    public static boolean bFld=false;
    public static int iFld=110;
    public short sFld=-13251;
    public volatile long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 12);
        FuzzerUtils.init(Test.fArrFld, 97.571F);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i11=-109, i12=-32512, i13=108, i14=-106;
        float f1=112.440F;
        double d1=2.9133;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, -6L);

        for (int i10 : Test.iArrFld) {
            for (i11 = 1; 4 > i11; ++i11) {
                f1 = 1;
                for (i13 = 1; 2 > i13; i13++) {
                    byte by=5;
                    long l1=36120L;
                    f1 += i11;
                    d1 -= d1;
                    try {
                        i14 = (Test.iArrFld[i13] / i13);
                        i10 = (i14 % -36740);
                        Test.iArrFld[i13 + 1] = (Test.iArrFld[i13 - 1] % i10);
                    } catch (ArithmeticException a_e) {}
                    i10 -= 42;
                    by = (byte)i12;
                    i12 += i11;
                    try {
                        Test.iArrFld[i11] = (Test.iArrFld[i11 - 1] / 205);
                        i12 = (i13 % i12);
                        i12 = (i13 / i10);
                    } catch (ArithmeticException a_e) {}
                    l1 += l1;
                    l1 = l1;
                    Test.instanceCount >>= i14;
                }
                lArr[i11 + 1] = lArr[i11];
            }
        }
        vMeth1_check_sum += i11 + i12 + Float.floatToIntBits(f1) + i13 + i14 + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth() {

        int i15=0, i16=-46236, i17=-46235;
        float f2=98.680F;
        byte by1=91;
        long l2=6471357390133813985L;

        vMeth1();
        i15 = 316;
        while (--i15 > 0) {
            Test.iFld += (-236 + (i15 * i15));
            f2 = i15;
            Test.iFld >>>= -27929;
            by1 += (byte)(i15 - i15);
            Test.iFld += (int)Test.instanceCount;
            Test.fArrFld[i15] += Test.iFld;
            for (l2 = 5; l2 > i15; --l2) {
                if (i17 != 0) {
                    vMeth_check_sum += i15 + Float.floatToIntBits(f2) + by1 + l2 + i16 + i17;
                    return;
                }
                switch ((((i15 >>> 1) % 3) * 5) + 33) {
                case 45:
                    switch ((((Test.iFld >>> 1) % 2) * 5) + 105) {
                    case 106:
                        i17 += (int)f2;
                        break;
                    case 109:
                        i16 += (73 + (l2 * l2));
                        i17 = (int)Test.instanceCount;
                        break;
                    }
                    break;
                case 35:
                case 42:
                    i16 &= (int)l2;
                    break;
                }
            }
        }
        vMeth_check_sum += i15 + Float.floatToIntBits(f2) + by1 + l2 + i16 + i17;
    }

    public static int iMeth(long l) {

        int i8=13, i9=-48313, i18=248, i19=-91, i20=-25, iArr[]=new int[N];
        short s=-1645;
        double dArr[]=new double[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr, -49854);
        FuzzerUtils.init(dArr, -40.1045);
        FuzzerUtils.init(lArr1, 33868L);

        for (i8 = 342; i8 > 17; i8--) {
            iArr[i8 + 1] <<= s;
            vMeth();
        }
        Test.iArrFld[(i8 >>> 1) % N] += -11;
        i18 = 1;
        do {
            iArr[i18] -= i9;
            iArr[i18 + 1] *= -9;
            i9 = i18;
            Test.iFld >>>= i18;
            dArr[i18] *= i18;
            for (i19 = i18; i19 < 6; ++i19) {
                lArr1[i19] *= i9;
                l += (((i19 * i8) + i19) - i18);
                i20 += (i19 - Test.instanceCount);
                Test.iFld *= 11;
            }
        } while (++i18 < 297);
        long meth_res = l + i8 + i9 + s + i18 + i19 + i20 + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=14, i1=2, i2=0, i3=186, i4=-12, i5=14, i6=35740, i7=-48673;
        float f=60.123F;
        boolean b=false;
        double d=101.110909;

        for (i = 5; i < 153; ++i) {
            i1 = (int)(((i2 - -2L) - i1) * ((i + i) * (--f)));
            for (i3 = 7; i3 < 169; i3 += 2) {
                i1 += (int)(Test.instanceCount--);
                for (i5 = i3; i5 < 3; i5++) {
                    if (Test.bFld = (i3 < (-(Test.instanceCount - i2)))) break;
                    b = ((i6 + (11 + (Test.instanceCount - i5))) < (i6++));
                    lArrFld[i] -= (long)((d * (i1 - Test.instanceCount)) + (i2--));
                    switch ((((i2 >>> 1) % 6) * 5) + 78) {
                    case 97:
                    case 108:
                        i7 -= iMeth(Test.instanceCount);
                        Test.bFld = false;
                        d -= i6;
                    case 91:
                        Test.instanceCount += (i5 * i5);
                        Test.instanceCount = i6;
                        break;
                    case 101:
                        i7 = -133;
                    case 100:
                        b = false;
                        i2 <<= i1;
                        Test.iFld = i4;
                        Test.iFld <<= i3;
                        break;
                    case 102:
                        lArrFld[i + 1] = Test.instanceCount;
                        break;
                    default:
                        i4 = i4;
                        i2 -= 225;
                        i1 = i2;
                        Test.instanceCount *= Test.instanceCount;
                    }
                    Test.iArrFld[i5 - 1] = i;
                    Test.iFld += i5;
                    f += (float)d;
                    sFld += (short)i4;
                    Test.instanceCount -= i6;
                }
                if (false) continue;
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("f i3 i4 = " + Float.floatToIntBits(f) + "," + i3 + "," + i4);
        FuzzerUtils.out.println("i5 i6 b = " + i5 + "," + i6 + "," + (b ? 1 : 0));
        FuzzerUtils.out.println("d i7 = " + Double.doubleToLongBits(d) + "," + i7);

        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.iFld = " + Test.instanceCount + "," + (Test.bFld ? 1
            : 0) + "," + Test.iFld);
        FuzzerUtils.out.println("sFld lArrFld Test.iArrFld = " + sFld + "," + FuzzerUtils.checkSum(lArrFld) + "," +
            FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
