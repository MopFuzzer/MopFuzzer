// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:18 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=172L;
    public static double dFld=62.394;
    public byte byFld=-40;
    public int iFld=-193;
    public static volatile int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];
    public double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -16073);
        FuzzerUtils.init(Test.lArrFld, 154L);
    }

    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long lMeth1_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static long lMeth() {

        int i=-12;

        Test.dFld -= (i--);
        long meth_res = i;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth1() {

        int i11=203, i12=-29, i13=-252, i14=-12;
        float f1=-2.918F;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -82.35223);

        i11 = 1;
        do {
            for (i12 = 1; i12 < 6; i12++) {
                f1 += (i12 * i12);
                Test.instanceCount += (i12 * i14);
                i13 >>= i13;
                dArr[i12 + 1] -= i13;
                Test.lArrFld[i12 - 1] = (long)1.649F;
                i14 -= i12;
                i13 += i12;
                Test.instanceCount += i14;
                Test.iArrFld[i11 - 1] -= (int)f1;
            }
        } while (++i11 < 296);
        i14 &= i13;
        i13 = i11;
        i14 = (int)f1;
        Test.iArrFld = Test.iArrFld;
        long meth_res = i11 + i12 + i13 + Float.floatToIntBits(f1) + i14 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public long lMeth1(int i7, int i8) {

        int i9=-34127, i10=-1, i15=6220, i16=7, i17=-7;
        float f=-121.66F;

        i9 = 1;
        while (++i9 < 219) {
            iFld -= (int)-2.416F;
            if (i9 != 0) {
            }
            i8 += (i9 * i9);
            i10 = 1;
            do {
                f *= Integer.reverseBytes(Test.iArrFld[i9 - 1]++);
                Test.instanceCount += (((i10 * i8) + i8) - i10);
                i7 += (i10 * i10);
            } while (++i10 < 7);
            iMeth1();
            f += (-10133 + (i9 * i9));
            Test.instanceCount += (i9 * i9);
        }
        for (i15 = 15; i15 < 287; i15++) {
            i17 = 6;
            do {
                i16 = i8;
                i16 = iFld;
            } while (--i17 > 0);
        }
        long meth_res = i7 + i8 + i9 + i10 + Float.floatToIntBits(f) + i15 + i16 + i17;
        lMeth1_check_sum += meth_res;
        return (long)meth_res;
    }

    public int iMeth() {

        int i3=199, i4=7, i5=-137, i6=-4, i18=35, i19=-1;
        long l=8334456835807711016L;

        iFld = 0;
        for (i3 = 10; i3 < 285; i3++) {
            for (i5 = 1; i5 < 6; ++i5) {
                i6 += i5;
                Test.instanceCount = (((Test.instanceCount <<= i3) - i6) * Test.iArrFld[i3 + 1]);
                l = 1;
                do {
                    Test.instanceCount *= iFld;
                    iFld = (int)lMeth1(9, i5);
                    Test.iArrFld[(int)(l + 1)] = i3;
                } while (++l < 2);
                Test.iArrFld[i5 + 1] -= i3;
                for (i18 = 1; i18 < 2; ++i18) {
                    Test.iArrFld[i3] = (int)l;
                    if (i18 != 0) {
                    }
                    i6 = i3;
                    if (i4 != 0) {
                    }
                }
            }
        }
        long meth_res = i3 + i4 + i5 + i6 + l + i18 + i19;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i1=-146, i2=172, i20=-15308, i21=-46681, i22=217, i23=-13, i24=-1, i25=-9, i26=6, iArr[]=new int[N];
        short s=-23122;
        float f2=-109.427F;
        boolean b=true;

        FuzzerUtils.init(iArr, 1329);

        lMeth();
        for (i1 = 9; i1 < 208; i1++) {
            iArr[i1] += byFld;
            i2 -= (iMeth() % 2);
            for (i20 = 7; i20 < 126; ++i20) {
                Test.instanceCount >>= Test.instanceCount;
                for (i22 = 1; i22 < 2; ++i22) {
                    Test.lArrFld[i20 + 1] *= i24;
                    s = (short)iFld;
                    i2 = (int)52.97066;
                    Test.iArrFld[i20] >>= i1;
                    f2 += (((i22 * i21) + i22) - byFld);
                    dArrFld = dArrFld;
                    i21 *= (int)f2;
                    i24 += i2;
                    i23 += (((i22 * f2) + Test.instanceCount) - Test.instanceCount);
                    i2 = i23;
                }
                iFld = (int)Test.instanceCount;
                iFld *= i2;
                i2 -= (int)Test.instanceCount;
                f2 = i20;
                Test.instanceCount = Test.instanceCount;
                i21 *= -5;
                for (i25 = 1; i25 < 2; i25++) {
                    iArr = iArr;
                    if (b) {
                        Test.iArrFld[i1] >>= i21;
                        b = false;
                        iArr[i20 + 1] -= i23;
                        Test.instanceCount += i25;
                    } else {
                        i26 = i26;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i1 i2 i20 = " + i1 + "," + i2 + "," + i20);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 s f2 = " + i24 + "," + s + "," + Float.floatToIntBits(f2));
        FuzzerUtils.out.println("i25 i26 b = " + i25 + "," + i26 + "," + (b ? 1 : 0));
        FuzzerUtils.out.println("iArr = " + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test.instanceCount Test.dFld byFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(Test.dFld) + "," + byFld);
        FuzzerUtils.out.println("iFld Test.iArrFld Test.lArrFld = " + iFld + "," + FuzzerUtils.checkSum(Test.iArrFld) +
            "," + FuzzerUtils.checkSum(Test.lArrFld));
        FuzzerUtils.out.println("dArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("lMeth1_check_sum: " + lMeth1_check_sum);
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  lMeth1 ->  lMeth1 iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 lMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
