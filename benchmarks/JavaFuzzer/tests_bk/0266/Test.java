// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:59 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=163L;
    public static float fFld=6.534F;
    public static double dFld=0.124561;
    public static int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 7);
        FuzzerUtils.init(Test.fArrFld, -2.380F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i7, int i8) {

        int i9=-65107, i10=-14, i11=-3, i12=100, i13=38, i14=11;
        double d=-83.81247;
        byte by=94;

        for (i9 = 2; i9 < 189; ++i9) {
            d = 1;
            do {
                by /= (byte)(i7 | 1);
            } while (++d < 9);
            for (i11 = 9; i11 > 1; i11--) {
                i12 += i11;
                Test.instanceCount = i10;
                switch (((i9 % 7) * 5) + 42) {
                case 51:
                    i10 -= 11;
                    for (i13 = i11; i13 < 2; i13++) {
                        Test.fFld = Test.fFld;
                        try {
                            i10 = (i11 / 226);
                            Test.iArrFld[i11 + 1] = (205 % Test.iArrFld[i9]);
                            i12 = (Test.iArrFld[i13] % 13);
                        } catch (ArithmeticException a_e) {}
                        Test.instanceCount = -21375;
                        i8 += (i13 ^ i12);
                        Test.instanceCount += (i13 * i13);
                        Test.iArrFld[i11 + 1] -= (int)235L;
                    }
                    break;
                case 64:
                    Test.iArrFld[i11 - 1] >>= i8;
                    break;
                case 56:
                case 67:
                    Test.fArrFld = Test.fArrFld;
                    break;
                case 43:
                    i14 = i13;
                    break;
                case 76:
                    Test.fFld -= i7;
                    break;
                case 55:
                    i12 = 14;
                    break;
                default:
                    if (i7 != 0) {
                    }
                }
            }
        }
        long meth_res = i7 + i8 + i9 + i10 + Double.doubleToLongBits(d) + by + i11 + i12 + i13 + i14;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i4) {

        int i5=185, i6=10, i15=12, i16=14;

        i4 = 6013;
        for (i5 = 1; i5 < 364; ++i5) {
            if ((iMeth(i6, i4) - Test.instanceCount) <= i5) continue;
            i6 -= i5;
        }
        Test.instanceCount += Test.instanceCount;
        for (i15 = 3; i15 < 317; ++i15) {
            i6 += i15;
            Test.dFld += -13106;
            if (i16 != 0) {
                vMeth1_check_sum += i4 + i5 + i6 + i15 + i16;
                return;
            }
            Test.fFld = Test.fFld;
            Test.fFld = i16;
            try {
                i4 = (i15 / i16);
                i4 = (Test.iArrFld[i15 - 1] % 90);
                i16 = (5600 % i4);
            } catch (ArithmeticException a_e) {}
            i4 <<= i6;
            i6 += (i15 * i15);
            i4 >>= i4;
        }
        vMeth1_check_sum += i4 + i5 + i6 + i15 + i16;
    }

    public static void vMeth(int i2, long l) {

        float f=80.524F;
        int i3=159, iArr[][]=new int[N][N];

        FuzzerUtils.init(iArr, 14);

        Test.instanceCount -= (long)f;
        iArr = (iArr = (iArr = (iArr = iArr)));
        i3 = 1;
        while (++i3 < 348) {
            vMeth1(65);
            i2 = i3;
        }
        i2 += 179;
        iArr[(i2 >>> 1) % N][(i3 >>> 1) % N] -= (int)Test.instanceCount;
        vMeth_check_sum += i2 + l + Float.floatToIntBits(f) + i3 + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i=7, i1=-9, i17=7, i18=13, i19=192, i20=14, i21=-14, i22=14, i23=64, i24=-6;
        float f1=-57.50F;
        byte by1=-82;
        short s=-26073, sArr[]=new short[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 2508132954L);
        FuzzerUtils.init(sArr, (short)-703);

        for (i = 11; i < 242; i++) {
            Test.iArrFld[i + 1] += (int)((++Test.instanceCount) + i1);
            i1 *= i1;
            if (false) continue;
            vMeth(-53826, Test.instanceCount);
            Test.instanceCount = i1;
        }
        for (long l1 : lArr) {
            Test.iArrFld[(i >>> 1) % N] = i1;
            i1 >>>= i1;
        }
        for (i17 = 6; i17 < 287; i17++) {
            for (i19 = 1; i19 < 89; i19++) {
                sArr[i17 - 1] = (short)i19;
                f1 = Test.instanceCount;
                f1 += i19;
                by1 += (byte)i19;
                by1 -= (byte)i20;
                i18 = i19;
                Test.dFld -= Test.instanceCount;
                Test.iArrFld[i17] <<= i17;
                Test.dFld = i17;
            }
            f1 = Test.instanceCount;
            for (i21 = 89; i21 > i17; --i21) {
                for (i23 = 1; 1 > i23; i23++) {
                    Test.dFld = Test.instanceCount;
                    i22 -= 56584;
                    i18 += (i23 - Test.instanceCount);
                    try {
                        i22 = (Test.iArrFld[i23] % 221);
                        Test.iArrFld[i23 + 1] = (i22 % i24);
                        i24 = (-46121 / Test.iArrFld[i23 - 1]);
                    } catch (ArithmeticException a_e) {}
                    i20 += (i23 ^ s);
                    Test.instanceCount += Test.instanceCount;
                }
                i20 += (((i21 * Test.instanceCount) + i24) - s);
            }
        }

        FuzzerUtils.out.println("i i1 i17 = " + i + "," + i1 + "," + i17);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("f1 by1 i21 = " + Float.floatToIntBits(f1) + "," + by1 + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("s lArr sArr = " + s + "," + FuzzerUtils.checkSum(lArr) + "," +
            FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.dFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.iArrFld Test.fArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
