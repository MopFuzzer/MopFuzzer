// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:03 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2L;
    public static int iFld=-63421;
    public static byte byFld=-96;
    public short sFld=-32129;
    public static float fFld=-1.744F;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 185018633217206165L);
        FuzzerUtils.init(Test.iArrFld, 250);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i) {

        int i1=-205, i2=-200, i3=-54477, i4=62762;
        boolean b=true;
        float f=29.672F;

        try {
            for (i1 = 5; i1 < 169; i1++) {
                Test.byFld *= (byte)Test.iFld;
                i = i2;
                if (b) {
                    if (i2 != 0) {
                        vMeth2_check_sum += i + i1 + i2 + (b ? 1 : 0) + Float.floatToIntBits(f) + i3 + i4;
                        return;
                    }
                    i2 += (int)-93.339F;
                } else {
                    Test.lArrFld = FuzzerUtils.long1array(N, (long)67L);
                    Test.iFld = i;
                }
            }
            try {
                if ((i1) < 65536) throw new UserDefinedExceptionTest();
                f = 1;
                do {
                    for (i3 = 1; i3 < 9; i3++) {
                        i4 = i1;
                        if (b) continue;
                    }
                } while ((f += 2) < 341);
            }
            catch (ArithmeticException exc3) {
                Test.iFld -= (int)Test.instanceCount;
            }
        }
        catch (UserDefinedExceptionTest exc4) {
            i = (int)Test.instanceCount;
        }
        finally {
            i += i;
        }
        vMeth2_check_sum += i + i1 + i2 + (b ? 1 : 0) + Float.floatToIntBits(f) + i3 + i4;
    }

    public static void vMeth1() {

        int i5=-5005, i6=-7, i7=158, i8=-5, i9=-250, i10=-12, i11=14, iArr[]=new int[N];
        boolean b1=true;
        float f1=2.107F;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)18413);
        FuzzerUtils.init(iArr, 3);

        vMeth2(46);
        for (i5 = 12; i5 < 214; ++i5) {
            Test.instanceCount -= Test.instanceCount;
            b1 = b1;
            for (i7 = 8; i7 > 1; i7--) {
                i9 = 1;
                while (++i9 < 2) {
                    switch (((i6 >>> 1) % 2) + 3) {
                    case 3:
                        sArr = sArr;
                        break;
                    case 4:
                        i6 += (((i9 * i9) + i6) - Test.instanceCount);
                        break;
                    default:
                        Test.iFld += i7;
                        iArr[i7] >>= 27;
                    }
                }
                for (i10 = 1; i10 < 2; i10 += 3) {
                    i6 >>= i5;
                    i11 += i10;
                    i11 = (int)f1;
                }
            }
        }
        vMeth1_check_sum += i5 + i6 + (b1 ? 1 : 0) + i7 + i8 + i9 + i10 + i11 + Float.floatToIntBits(f1) +
            FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth() {

        double d=-1.5979;
        byte by=-49;
        int i12=60261, i13=38547, i14=-95, i15=2, i16=27157, i17=-13, i18=-86;
        boolean b2=true;
        float f2=-2.658F, fArr[][]=new float[N][N];

        FuzzerUtils.init(fArr, 106.314F);

        d = (((Test.iFld * by) + (Test.iFld - Test.iFld)) + (Test.instanceCount % (((long)(--fArr[(Test.iFld >>> 1) %
            N][(234 >>> 1) % N])) | 1)));
        vMeth1();
        for (i12 = 2; 190 > i12; ++i12) {
            for (i14 = 1; i14 < 8; ++i14) {
                for (i16 = 2; i16 > 1; i16--) {
                    i13 = i15;
                    fArr[i16 - 1][i16 - 1] *= Test.instanceCount;
                    i13 = i16;
                    if (b2) continue;
                    f2 = i13;
                    i13 = i16;
                    i18 = i12;
                    Test.iFld += (((i16 * f2) + i17) - i12);
                    i18 >>>= i14;
                    f2 = by;
                }
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + by + i12 + i13 + i14 + i15 + i16 + i17 + (b2 ? 1 : 0) +
            Float.floatToIntBits(f2) + i18 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i19=-20, i20=-11, i21=-8, i22=45212, i23=-3;
        double d1=0.96844;
        short s=-18943;

        vMeth();
        Test.iFld >>= sFld;
        i19 = 1;
        while ((i19 += 2) < 303) {
            Test.iFld = Test.iFld;
            Test.iFld = (int)Test.instanceCount;
            for (i20 = i19; i20 < 166; i20++) {
                Test.iFld /= (int)(Test.iFld | 1);
                i22 = 1;
                while (++i22 < 1) {
                    Test.iFld += (int)5115L;
                    Test.iArrFld[i19] <<= (int)Test.instanceCount;
                    i21 *= -14;
                    Test.instanceCount -= i21;
                    i21 = sFld;
                    i21 = 9;
                    Test.fFld = Test.iFld;
                }
                Test.instanceCount &= i22;
                d1 = i19;
                Test.lArrFld[i20 - 1] = (long)Test.fFld;
                i21 += i20;
                Test.iFld *= i22;
                Test.lArrFld[i19 + 1] = i21;
                Test.iFld = (int)-2330180445L;
                Test.fFld *= i19;
            }
            sFld = (short)-2.56352;
            Test.iFld += (((i19 * Test.instanceCount) + Test.iFld) - Test.fFld);
            Test.iArrFld[i19 - 1] = -61379;
        }
        Test.fFld *= s;
        i23 = i22;
        i23 *= Test.iFld;
        i21 += (int)66.112F;

        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 d1 s = " + i22 + "," + Double.doubleToLongBits(d1) + "," + s);
        FuzzerUtils.out.println("i23 = " + i23);

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.byFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Test.byFld);
        FuzzerUtils.out.println("sFld Test.fFld Test.lArrFld = " + sFld + "," + Float.floatToIntBits(Test.fFld) + "," +
            FuzzerUtils.checkSum(Test.lArrFld));
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
class UserDefinedExceptionTest extends RuntimeException {
    public int field;
}

//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
