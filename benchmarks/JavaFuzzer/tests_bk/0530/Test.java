// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:06 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=12L;
    public static byte byFld=34;
    public static boolean bFld=true;
    public static int iFld=-49689;
    public static int iFld1=-129;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 2);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i4=-39288;

        Test.iArrFld[(i4 >>> 1) % N] = Test.byFld;
        vMeth1_check_sum += i4;
    }

    public static long lMeth(int i3) {

        int i5=-12, i6=49065, i7=-201, i8=-134, i9=-12, i10=11, i11=-44725, i12=9099, i13=179;
        float f1=-4.439F;
        double d=-86.31939;

        if (Test.bFld) {
            vMeth1();
        }
        i3 = (int)Test.instanceCount;
        for (i5 = 13; 331 > i5; i5 += 3) {
            Test.bFld = Test.bFld;
        }
        i7 = 235;
        while ((i7 -= 2) > 0) {
            i3 *= -106;
            f1 -= i3;
            for (i8 = 1; 13 > i8; ++i8) {
                for (i10 = 2; i10 > 1; i10 -= 3) {
                    Test.iArrFld[i8 - 1] -= (int)f1;
                    i11 -= (int)d;
                }
                for (i12 = i7; 2 > i12; ++i12) {
                    i3 *= i10;
                    i6 += (i12 + i3);
                }
            }
        }
        long meth_res = i3 + i5 + i6 + i7 + Float.floatToIntBits(f1) + i8 + i9 + i10 + i11 + Double.doubleToLongBits(d)
            + i12 + i13;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i, int i1) {

        int i2=-210, i14=-3, i15=-14, i16=139, i17=0;
        float f=106.988F;

        try {
            Test.instanceCount -= (((i + i1) + (i * i2)) * Math.abs((int)(i * -90.791F)));
            f = (((i = i2) - Integer.reverseBytes(i)) * (lMeth(13) % (i1 | 1)));
            Test.iArrFld[(i2 >>> 1) % N] += (int)f;
            for (i14 = 8; i14 < 227; ++i14) {
                i1 -= i2;
                i -= i1;
                i15 *= i;
                f %= (i1 | 1);
                Test.bFld = true;
                i15 += i14;
            }
            i = 55444;
        }
        catch (NullPointerException exc1) {
            for (i16 = 1; i16 < 132; ++i16) {
                i1 = (int)Test.instanceCount;
                i = i17;
            }
        }
        vMeth_check_sum += i + i1 + i2 + Float.floatToIntBits(f) + i14 + i15 + i16 + i17;
    }

    public void mainTest(String[] strArr1) {

        int i18=-79, i19=12, i20=0, i21=11, i22=1, i23=-54188, i24=117, i25=-102, i26=11, i27=12, i28=5;
        float f2=-1.961F;
        long l=93L;
        short s=-10503;
        double d1=-27.70367;

        vMeth(10, Test.iFld);
        for (i18 = 1; 228 > i18; ++i18) {
            for (i20 = 111; i20 > 5; i20 -= 2) {
                if (Test.bFld) break;
            }
            f2 = i18;
            Test.iArrFld[i18 - 1] *= Test.iFld;
            for (l = i18; l < 111; ++l) {
                Test.instanceCount = -13604L;
                i19 += (int)Test.instanceCount;
                Test.iFld += i19;
            }
            Test.instanceCount = i22;
            i19 *= i18;
            for (i23 = 1; i23 < 111; i23++) {
                for (i25 = 1; i25 < 2; i25++) {
                    f2 += l;
                    i21 += (i25 + s);
                    i22 = (int)f2;
                    i24 += (i25 * i25);
                    try {
                        Test.iFld = (-15 / i21);
                        i24 = (24 % Test.iFld);
                        Test.iArrFld[i25 - 1] = (227 % i21);
                    } catch (ArithmeticException a_e) {}
                    Test.iArrFld[i18] += Test.iFld;
                    d1 = i22;
                    i19 = i25;
                    i22 = Test.iFld1;
                    d1 = i20;
                }
                f2 += (i23 * i23);
                for (i27 = 1; 2 > i27; ++i27) {
                    Test.instanceCount >>>= -251;
                    s >>= (short)i25;
                    Test.iFld <<= Test.byFld;
                    Test.iArrFld[i27 + 1] = i23;
                }
            }
        }

        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 f2 l = " + i21 + "," + Float.floatToIntBits(f2) + "," + l);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 i26 s = " + i25 + "," + i26 + "," + s);
        FuzzerUtils.out.println("d1 i27 i28 = " + Double.doubleToLongBits(d1) + "," + i27 + "," + i28);

        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.bFld = " + Test.instanceCount + "," + Test.byFld +
            "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.iFld Test.iFld1 Test.iArrFld = " + Test.iFld + "," + Test.iFld1 + "," +
            FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
