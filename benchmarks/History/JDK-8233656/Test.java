// Generated by Java* Fuzzer test generator (1.0.001). Mon Nov  4 20:50:10 2019
public class Test {

    public static final int N = 400;

    public static long instanceCount=2798488677018622289L;
    public boolean bFld=false;
    public static volatile int iFld=-24471;
    public static byte byFld=33;
    public static volatile double dFld=1.67766;
    public static short sFld=-6798;
    public static long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -12L);
    }

    public static long lMeth_check_sum = 0;
    public static long lMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        int i1=14;
        int i2=187;
        int i3=163;
        int i4=87;
        int i5=-23283;
        int[] iArr =new int[N];
        byte by=64;
        double d1=0.82410, d2=-2.126471;
        float f1=-56.74F;

        FuzzerUtils.init(iArr, 14);

        for (i1 = 24; i1 < 384; i1++) {
            i2 -= by;
            for (d1 = 5; d1 > 1; d1 -= 3) {
                iArr[(int)(d1)] -= i3;
                Test.iFld = Test.iFld;
                f1 += 14;
                d2 += Test.instanceCount;
                Test.iFld = i2;
                i3 = i2;
                i2 += Test.iFld;
                for (i4 = 1; 5 > i4; ++i4) {
                    if (i4 != 0) {
                        vMeth_check_sum += i1 + i2 + by + Double.doubleToLongBits(d1) + i3 + Float.floatToIntBits(f1) +
                            Double.doubleToLongBits(d2) + i4 + i5 + FuzzerUtils.checkSum(iArr);
                        return;
                    }
                    i5 *= i4;
                    iArr[(i3 >>> 1) % N] *= i2;
                    i5 += (int)Test.instanceCount;
                }
            }
        }
        vMeth_check_sum += i1 + i2 + by + Double.doubleToLongBits(d1) + i3 + Float.floatToIntBits(f1) +
            Double.doubleToLongBits(d2) + i4 + i5 + FuzzerUtils.checkSum(iArr);
    }

    public static long lMeth1(int i, float f) {

        float f2=-1.572F;
        int i6=-35158, i7=10092, i8=52084, i9=3, i10=14;
        double d3=2.1628;
        boolean b=true;

        vMeth();
        try {
            i -= i;
            for (f2 = 14; f2 < 398; ++f2) {
                long l=6508890096125268209L;
                Test.instanceCount = Test.iFld;
                d3 -= -71.432F;
                if (b) continue;
                if (b) {
                    l += i;
                    f += f2;
                    for (i7 = (int)(f2); i7 < 4; i7++) {
                        for (i9 = 1; i9 < 1; i9++) {
                            i -= (int)l;
                            i10 *= i6;
                            Test.byFld += (byte)f;
                        }
                    }
                }
            }
        }
        catch (NegativeArraySizeException exc2) {
            Test.iFld -= i6;
        }
        catch (UserDefinedExceptionTest exc3) {
            i10 = (int)f2;
        }
        long meth_res = i + Float.floatToIntBits(f) + Float.floatToIntBits(f2) + i6 + Double.doubleToLongBits(d3) + (b
            ? 1 : 0) + i7 + i8 + i9 + i10;
        lMeth1_check_sum += meth_res;
        return (long)meth_res;
    }

    public static long lMeth() {

        int i11=-169;
        int i12=-91;
        int i13=-41700;
        int i14=-7;
        int i15=0;
        int i16=-64777;
        int[] iArr1 =new int[N];

        FuzzerUtils.init(iArr1, -228);

        Test.instanceCount = (8590781004000563416L + lMeth1(Test.iFld, -2.588F));
        Test.instanceCount *= (long)Test.dFld;
        Test.iFld = (int)3483475854L;
        Test.instanceCount >>= Test.iFld;
        iArr1[(Test.iFld >>> 1) % N] = Test.iFld;
        Test.iFld >>= (int)Test.instanceCount;
        Test.iFld = (int)Test.instanceCount;
        if (true) {
            iArr1[(Test.iFld >>> 1) % N] >>= 13;
        }
        for (i11 = 14; 242 > i11; ++i11) {
            for (i13 = 1; 7 > i13; ++i13) {
                for (i15 = 1; i15 < 2; i15++) {
                    Test.instanceCount += (127L + (i15 * i15));
                    i12 *= i16;
                    Test.instanceCount <<= i13;
                }
            }
        }
        long meth_res = i11 + i12 + i13 + i14 + i15 + i16 + FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d=-58.102664;
        int i17=-51263;
        int i18=-7;
        int i19=181;
        int i20=-18190;
        int i21=20259;
        int i22=25448;
        int[] iArr2 =new int[N];
        int[] iArr3 =new int[N];
        float f3=30.695F;
        float f4=-56.275F;
        float[] fArr =new float[N];

        FuzzerUtils.init(fArr, 1.710F);
        FuzzerUtils.init(iArr2, 140);
        FuzzerUtils.init(iArr3, 1);

        bFld = (((fArr[(Test.iFld >>> 1) % N]--) - d) != Test.iFld);
        Test.lArrFld = (Test.lArrFld = Test.lArrFld);
        Test.iFld -= (int)((8 + (Test.iFld + Test.instanceCount)) - (lMeth() + -59365));
        for (i17 = 6; i17 < 176; i17++) {
            Test.dFld = i17;
            if (bFld) continue;
            for (i19 = 2; i19 < 148; ++i19) {
                Test.sFld = (short)Test.dFld;
                Test.instanceCount -= (long)f3;
                Test.iFld += Test.iFld;
                Test.iFld >>= i19;
                i21 = 1;
                while (++i21 < 2) {
                    Test.instanceCount += (((i21 * Test.iFld) + i18) - Test.iFld);
                    Test.iFld += (int)111.6F;
                    if (bFld) continue;
                    switch (((i19 % 5) * 5) + 117) {
                    case 136:
                        i18 = 0;
                        Test.iFld *= i17;
                        i20 = (int)Test.instanceCount;
                        f3 = f4;
                    case 125:
                        try {
                            i20 = (i18 / i21);
                            i22 = (iArr2[i17 - 1] % 25262);
                            iArr3[i17 + 1] = (-4235 / iArr2[i21 - 1]);
                        } catch (ArithmeticException a_e) {}
                        i18 += (i21 * i21);
                        switch ((i21 % 2) + 27) {
                        case 27:
                        case 28:
                        }
                        break;
                    case 131:
                        i18 -= Test.iFld;
                        break;
                    case 133:
                    case 132:
                        try {
                            i22 = (iArr3[i21 - 1] / 1901681777);
                            i18 = (i21 / 12062);
                            i20 = (i19 / i19);
                        } catch (ArithmeticException a_e) {}
                        break;
                    }
                    Test.lArrFld[i21 - 1] = i22;
                    switch (((i19 % 2) * 5) + 11) {
                    case 16:
                        i18 += i22;
                        f3 += (((i21 * Test.instanceCount) + Test.instanceCount) - Test.byFld);
                        Test.instanceCount = -4;
                        break;
                    case 12:
                        i18 = -2105;
                        break;
                    default:
                        i20 = i22;
                    }
                }
            }
        }

        FuzzerUtils.out.println("d i17 i18 = " + Double.doubleToLongBits(d) + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 i20 f3 = " + i19 + "," + i20 + "," + Float.floatToIntBits(f3));
        FuzzerUtils.out.println("i21 f4 i22 = " + i21 + "," + Float.floatToIntBits(f4) + "," + i22);
        FuzzerUtils.out.println("fArr iArr2 iArr3 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + "," +
            FuzzerUtils.checkSum(iArr2) + "," + FuzzerUtils.checkSum(iArr3));

        FuzzerUtils.out.println("Test.instanceCount bFld Test.iFld = " + Test.instanceCount + "," + (bFld ? 1 : 0) +
            "," + Test.iFld);
        FuzzerUtils.out.println("Test.byFld Test.dFld Test.sFld = " + Test.byFld + "," +
            Double.doubleToLongBits(Test.dFld) + "," + Test.sFld);
        FuzzerUtils.out.println("Test.lArrFld = " + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth1_check_sum: " + lMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
class UserDefinedExceptionTest extends RuntimeException {
    public int field;
}

//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  lMeth1 ->  lMeth1 lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth1 lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
