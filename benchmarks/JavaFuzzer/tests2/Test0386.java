// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:30 2023
public class Test0386 {

    public static final int N = 400;

    public static long instanceCount=59749L;
    public static int iFld=-4;
    public int iFld1=5;
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0386.iArrFld, -22702);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1() {

        int i7=14, i8=11, i9=-79, i10=8358;
        float f2=0.429F;
        short s1=649;
        long l3=-1754554415906900155L;
        boolean b1=true;
        double[] dArr1 =new double[N];

        FuzzerUtils.init(dArr1, -14.31974);

        for (i7 = 9; i7 < 173; i7++) {
            i8 = (int)f2;
            i8 = (int) Test0386.instanceCount;
            f2 = Test0386.iFld;
            dArr1[i7] *= i7;
        }
        Test0386.iFld -= (int) Test0386.instanceCount;
        s1 = (short) Test0386.instanceCount;
        for (i9 = 2; i9 < 166; ++i9) {
            try {
                i10 = (-11757 / i10);
                Test0386.iFld = (i7 / i10);
                Test0386.iArrFld[i9] = (i7 % Test0386.iArrFld[i9]);
            } catch (ArithmeticException a_e) {}
            i8 += i7;
            l3 = 1;
            do {
                i8 += (int) (((l3 * Test0386.iFld) + i10) - i10);
            } while (++l3 < 10);
            if (b1) continue;
            Test0386.iFld = (int) Test0386.instanceCount;
        }
        Test0386.iFld *= (int) 1.200F;
        long meth_res = i7 + i8 + Float.floatToIntBits(f2) + s1 + i9 + i10 + l3 + (b1 ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(boolean b, short s, long l2) {

        int i5=-52, i6=-6, i12=1, i13=21725, i14=-2, i15=11;
        byte by=-22;
        float f3=15.220F;
        double d=40.10083;

        for (i5 = 16; i5 < 324; ++i5) {
            i6 -= ((by * iMeth1()) - Test0386.iFld);
        }
        for (int i11 : Test0386.iArrFld) {
            for (i12 = 4; i12 > 1; i12--) {
                i6 += (-15 + (i12 * i12));
                f3 *= i6;
                for (i14 = 1; i14 < 2; i14++) {
                    i11 += i14;
                    b = b;
                }
                f3 = l2;
                i15 = s;
            }
            i15 = Test0386.iFld;
            i15 <<= -2;
            f3 = (float)d;
            Test0386.iFld &= i13;
        }
        long meth_res = (b ? 1 : 0) + s + l2 + i5 + i6 + by + i12 + i13 + Float.floatToIntBits(f3) + i14 + i15 +
            Double.doubleToLongBits(d);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth(long l, float f, long l1) {

        int i1=-198, i2=-1, i3=-15122, i4=-71;
        float f1=85.702F;
        boolean b2=true;
        double d1=1.43363;
        double[][] dArr =new double[N][N];

        FuzzerUtils.init(dArr, -43.31478);

        l1 = (-(Math.max(i1, i1) + l1));
        f1 = 1;
        while ((f1 += 2) < 172) {
            Test0386.iArrFld[(int) (f1)] = (int) (-2.351F * (l++));
            i1 >>= i1;
            for (i2 = 1; i2 < 18; ++i2) {
                Test0386.iArrFld[i2] |= (int) ((i4++) - ((l - i1) - Math.min(i2, -13)));
                dArr[(int) (f1 - 1)][i2 + 1] = iMeth(b2, (short) (-4545), Test0386.instanceCount);
                switch ((((Test0386.iFld >>> 1) % 2) * 5) + 58) {
                case 67:
                case 61:
                }
                i1 = i3;
                i1 -= i2;
                i3 += (-74 + (i2 * i2));
                d1 = 7;
            }
            if (i2 != 0) {
                vMeth_check_sum += l + Float.floatToIntBits(f) + l1 + i1 + Float.floatToIntBits(f1) + i2 + i3 + i4 +
                    (b2 ? 1 : 0) + Double.doubleToLongBits(d1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                return;
            }
            d1 -= l1;
            d1 = i4;
        }
        vMeth_check_sum += l + Float.floatToIntBits(f) + l1 + i1 + Float.floatToIntBits(f1) + i2 + i3 + i4 + (b2 ? 1 :
            0) + Double.doubleToLongBits(d1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        int i=9, i16=-10, i17=-7, i18=0, i19=240, i20=-4, i21=7229, i22=-62, i23=2;
        long l4=-2253212415766657274L;
        long[] lArr =new long[N];
        float f4=-2.880F;
        short s2=26469;
        double d2=-69.62089;
        boolean b3=false;

        FuzzerUtils.init(lArr, -55368L);

        Test0386.iArrFld[(41390 >>> 1) % N] = Test0386.iArrFld[(i >>> 1) % N];
        i -= Test0386.iArrFld[(i >>> 1) % N];
        vMeth(l4, f4, 73L);
        f4 += i;
        for (i16 = 10; i16 < 185; i16++) {
            Test0386.instanceCount = s2;
            f4 = i16;
            for (i18 = 143; i18 > 4; i18 -= 2) {
                i19 -= (int)d2;
                d2 = iFld1;
                switch ((i16 % 1) + 73) {
                case 73:
                    i19 += -18564;
                    if (b3) continue;
                    i19 += (i18 * i18);
                    i19 += i18;
                }
                for (i20 = 1; 3 > i20; i20++) {
                    lArr[i16] = i20;
                    Test0386.iArrFld[i20] -= i20;
                    i19 -= (int) Test0386.instanceCount;
                    i17 += (((i20 * iFld1) + Test0386.iFld) - l4);
                    iFld1 += Test0386.iFld;
                    i17 = (int)f4;
                    i19 += (((i20 * Test0386.instanceCount) + i) - i19);
                    i = iFld1;
                    try {
                        i17 = (i20 % -129);
                        i17 = (i21 / -238);
                        i21 = (i16 / i18);
                    } catch (ArithmeticException a_e) {}
                }
            }
            Test0386.iArrFld[i16] += iFld1;
            Test0386.iFld += i16;
            for (i22 = 6; i22 < 143; i22++) {
                s2 = (short)i18;
                i21 += (((i22 * f4) + i16) - i23);
            }
        }

        FuzzerUtils.out.println("i l4 f4 = " + i + "," + l4 + "," + Float.floatToIntBits(f4));
        FuzzerUtils.out.println("i16 i17 s2 = " + i16 + "," + i17 + "," + s2);
        FuzzerUtils.out.println("i18 i19 d2 = " + i18 + "," + i19 + "," + Double.doubleToLongBits(d2));
        FuzzerUtils.out.println("b3 i20 i21 = " + (b3 ? 1 : 0) + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 lArr = " + i22 + "," + i23 + "," + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test0386.instanceCount Test0386.iFld iFld1 = " + Test0386.instanceCount + "," + Test0386.iFld + "," +
            iFld1);
        FuzzerUtils.out.println("Test0386.iArrFld = " + FuzzerUtils.checkSum(Test0386.iArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0386 _instance = new Test0386();
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
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
