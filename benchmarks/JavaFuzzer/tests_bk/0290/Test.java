// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:00 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=1086499768L;
    public short sFld=25418;
    public static short sFld1=-19258;
    public static volatile byte byFld=-23;
    public static int iFld=-40259;
    public volatile boolean bFld=true;
    public double dFld=0.28545;
    public static volatile float fFld=-61.322F;
    public int iArrFld[]=new int[N];
    public static short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)22245);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(float f, int i10) {

        double d1=-2.60830;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 58060L);

        lArr1[(56 >>> 1) % N] -= i10;
        d1 -= 44268L;
        vMeth1_check_sum += Float.floatToIntBits(f) + i10 + Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(lArr1);
    }

    public static long lMeth(int i6, int i7, byte by) {

        int i8=40718, i9=-53070, i11=-61393, i12=-59531, i13=-209;
        float f1=0.680F, fArr[]=new float[N];
        double d2=-2.14046;
        long lArr2[]=new long[N];

        FuzzerUtils.init(lArr2, 42820L);
        FuzzerUtils.init(fArr, 45.125F);

        for (i8 = 16; 344 > i8; ++i8) {
            vMeth1(f1, -9);
            for (i11 = 1; i11 < 5; ++i11) {
                i9 += (i11 + by);
                i12 = Test.sFld1;
                i6 = i11;
                Test.instanceCount += (((i11 * f1) + Test.instanceCount) - f1);
                i6 += i6;
                i9 += (int)(-139L + (i11 * i11));
                lArr2[i11 + 1] *= i12;
            }
            i9 += (i8 * i8);
            f1 -= (float)d2;
        }
        i13 = 1;
        while (++i13 < 137) {
            d2 += Test.instanceCount;
            try {
                i12 = (i8 / i6);
                i12 = (i7 / i6);
                i12 = (i9 / -63686);
            } catch (ArithmeticException a_e) {}
        }
        long meth_res = i6 + i7 + by + i8 + i9 + Float.floatToIntBits(f1) + i11 + i12 + Double.doubleToLongBits(d2) +
            i13 + FuzzerUtils.checkSum(lArr2) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void vMeth(int i, int i1, int i2) {

        double d=0.51802;
        int i3=107, i4=-168, i5=62, i14=-156, i15=-1;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 9L);

        for (d = 8; d < 377; d++) {
            i += i2;
            i3 += (int)d;
            Test.instanceCount -= ((++lArr[(i1 >>> 1) % N]) * (++i1));
            for (i4 = 1; i4 < 5; i4++) {
                if (((i -= (++i2)) + ((sFld++) * lMeth(i4, i3, Test.byFld))) > i3) break;
                iArrFld[i4] &= i1;
                Test.byFld -= (byte)i5;
                for (i14 = 1; i14 < 2; i14++) {
                    Test.instanceCount = i15;
                    Test.instanceCount -= -72;
                    i3 += (i14 | Test.instanceCount);
                    i2 >>= i2;
                    i15 += (i14 * i14);
                }
                Test.sFld1 <<= (short)i;
            }
        }
        vMeth_check_sum += i + i1 + i2 + Double.doubleToLongBits(d) + i3 + i4 + i5 + i14 + i15 +
            FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i16=-8386, i17=0, i18=-43599, i19=3687;
        long lArr3[]=new long[N];

        FuzzerUtils.init(lArr3, 1280200985344872298L);

        vMeth(Test.iFld, Test.iFld, 6);
        i16 = 1;
        while (++i16 < 347) {
            Test.iFld += (((i16 * Test.iFld) + Test.byFld) - i16);
            for (i17 = 2; 73 > i17; ++i17) {
                i18 *= Test.iFld;
                iArrFld[i16 - 1] &= (int)Test.instanceCount;
                i18 += (i17 - sFld);
                i19 = 1;
                do {
                    lArr3[i16 - 1] = i16;
                    switch ((i17 % 3) + 103) {
                    case 103:
                        Test.iFld -= Test.sFld1;
                        i18 >>>= Test.iFld;
                        break;
                    case 104:
                        iArrFld[i19 - 1] = (int)1082495108L;
                        i18 = -1;
                        switch (((i16 >>> 1) % 8) + 40) {
                        case 40:
                            i18 = i16;
                            Test.iFld *= i19;
                            Test.instanceCount += (long)(32.764F + (i19 * i19));
                            if (bFld) break;
                            break;
                        case 41:
                            i18 += i18;
                            iArrFld[i19] *= (int)Test.instanceCount;
                        case 42:
                            Test.sArrFld[i17 + 1] ^= (short)i16;
                        case 43:
                            iArrFld[i17 - 1] -= (int)Test.instanceCount;
                            break;
                        case 44:
                            i18 += i16;
                            dFld = i16;
                            break;
                        case 45:
                            bFld = bFld;
                        case 46:
                            Test.instanceCount <<= -28984;
                            Test.sFld1 = (short)i17;
                            break;
                        case 47:
                            Test.fFld += -2;
                            break;
                        default:
                            Test.fFld += i19;
                        }
                    case 105:
                        i18 = i17;
                        break;
                    default:
                        Test.byFld <<= (byte)Test.instanceCount;
                    }
                } while (++i19 < 2);
            }
        }

        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 lArr3 = " + i19 + "," + FuzzerUtils.checkSum(lArr3));

        FuzzerUtils.out.println("Test.instanceCount sFld Test.sFld1 = " + Test.instanceCount + "," + sFld + "," +
            Test.sFld1);
        FuzzerUtils.out.println("Test.byFld Test.iFld bFld = " + Test.byFld + "," + Test.iFld + "," + (bFld ? 1 : 0));
        FuzzerUtils.out.println("dFld Test.fFld iArrFld = " + Double.doubleToLongBits(dFld) + "," +
            Float.floatToIntBits(Test.fFld) + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("Test.sArrFld = " + FuzzerUtils.checkSum(Test.sArrFld));

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
