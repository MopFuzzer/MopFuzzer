// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:01 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-1L;
    public static boolean bFld=false;
    public static byte byFld=106;
    public static volatile double dFld=0.26054;
    public static int iArrFld[]=new int[N];
    public static double dArrFld[]=new double[N];
    public static volatile long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -10);
        FuzzerUtils.init(Test.dArrFld, -4.17472);
        FuzzerUtils.init(Test.lArrFld, 2757029965038226971L);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i4) {

        int i5=0, i6=-212, iArr1[]=new int[N];
        float f1=2.776F;

        FuzzerUtils.init(iArr1, -19715);

        for (i5 = 209; i5 > 4; --i5) {
            i4 -= 42176;
        }
        Test.iArrFld[(-160 >>> 1) % N] -= -51891;
        i6 >>>= i5;
        f1 += i4;
        iArr1 = FuzzerUtils.int1array(N, (int)91);
        vMeth1_check_sum += i4 + i5 + i6 + Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i2, int i3) {

        int i7=-76, i8=9, i9=117, i10=-169, i11=1, i12=-36388, i13=86;
        float f2=-115.55F;
        double d=0.64687;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 54L);

        vMeth1(i2);
        Test.iArrFld = Test.iArrFld;
        for (i7 = 3; i7 < 210; i7++) {
            for (i9 = 1; i9 < 8; i9++) {
                for (f2 = 1; f2 < 2; f2++) {
                    Test.iArrFld[(int)(f2 - 1)] = (int)-109L;
                    Test.instanceCount += -5;
                }
                i3 %= (int)(Test.instanceCount | 1);
                i10 += (i9 ^ i2);
                i10 <<= i2;
                i11 += (i9 * i9);
                switch ((i7 % 8) + 50) {
                case 50:
                    for (i12 = 1; i12 < 2; ++i12) {
                        d -= Test.instanceCount;
                        if (Test.bFld) break;
                    }
                    break;
                case 51:
                    Test.dArrFld[i9 - 1] -= -32.60963;
                case 52:
                    lArr[i9 - 1] = (long)f2;
                    break;
                case 53:
                    d = f2;
                    break;
                case 54:
                    i3 -= (int)Test.instanceCount;
                case 55:
                    i8 += (i9 * i9);
                    break;
                case 56:
                    i3 -= (int)0L;
                    break;
                case 57:
                    Test.iArrFld[i7] >>= i11;
                    break;
                default:
                    i11 += i11;
                }
            }
        }
        vMeth_check_sum += i2 + i3 + i7 + i8 + i9 + i10 + Float.floatToIntBits(f2) + i11 + i12 + i13 +
            Double.doubleToLongBits(d) + FuzzerUtils.checkSum(lArr);
    }

    public static long lMeth(float f) {

        int i14=44576, i15=7, i16=199, i17=-116, i18=86, i19=-39;
        double d1=0.39625;
        byte by=27;

        vMeth(i14, 9);
        i15 = 311;
        while (--i15 > 0) {
            if (Test.bFld) break;
            i14 = (int)d1;
            i14 = i14;
            for (i16 = 1; i16 < 5; ++i16) {
                i14 += i15;
                if (Test.bFld) {
                    i17 += (i16 + i17);
                    for (i18 = 1; 2 > i18; ++i18) {
                        Test.lArrFld[i18 + 1] += i19;
                        switch ((i18 % 1) * 5) {
                        case 1:
                            f += (((i18 * i18) + Test.instanceCount) - i18);
                            Test.iArrFld[i15 + 1] >>= i15;
                            Test.instanceCount = Test.instanceCount;
                            break;
                        }
                    }
                } else if (true) {
                    i17 /= (int)(by | 1);
                } else if (Test.bFld) {
                    i17 *= i17;
                } else {
                    d1 += -4;
                }
            }
        }
        long meth_res = Float.floatToIntBits(f) + i14 + i15 + Double.doubleToLongBits(d1) + i16 + i17 + i18 + i19 + by;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr3) {

        float f3=0.641F;
        int i20=129, i21=11, i22=-17, i23=11996, i24=1870, i25=-7370, iArr[]=new int[N];
        long l=-13L;
        short s=24927;

        FuzzerUtils.init(iArr, -57);

        for (int i1 : iArr) {
            try {
                i1 = (i1 / 233);
                iArr[(i1 >>> 1) % N] = (i1 / i1);
                i1 = (i1 % 574700898);
            } catch (ArithmeticException a_e) {}
            i1 = (int)Test.instanceCount;
            if (((lMeth(1.593F) + i1) != i1) | Test.bFld) break;
            f3 = i1;
            Test.iArrFld[(i1 >>> 1) % N] = (int)f3;
            i1 <<= i1;
            i1 -= i1;
            i20 = 1;
            do {
                for (l = 1; 1 > l; ++l) {
                    Test.lArrFld[(int)(l - 1)] = i21;
                    Test.iArrFld = iArr;
                    i1 |= (int)l;
                    f3 += l;
                    Test.dArrFld = FuzzerUtils.double1array(N, (double)29.89160);
                    i1 += (int)(l + i1);
                    Test.instanceCount = l;
                    Test.instanceCount -= (long)f3;
                }
                Test.byFld -= (byte)i1;
                Test.lArrFld[i20 + 1] = i21;
                Test.iArrFld[i20] += i20;
                i21 = (int)Test.dFld;
                i1 -= (int)Test.instanceCount;
                i1 = s;
            } while (++i20 < 63);
            for (i22 = 2; i22 < 63; i22 += 2) {
                i21 = -21973;
                for (i24 = 1; i24 < 3; i24++) {
                    f3 = 7;
                    i25 /= (int)((long)(f3) | 1);
                    i1 *= i23;
                }
            }
        }

        FuzzerUtils.out.println("f3 i20 l = " + Float.floatToIntBits(f3) + "," + i20 + "," + l);
        FuzzerUtils.out.println("i21 s i22 = " + i21 + "," + s + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("iArr = " + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.byFld = " + Test.instanceCount + "," + (Test.bFld ?
            1 : 0) + "," + Test.byFld);
        FuzzerUtils.out.println("Test.dFld Test.iArrFld Test.dArrFld = " + Double.doubleToLongBits(Test.dFld) + "," +
            FuzzerUtils.checkSum(Test.iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));
        FuzzerUtils.out.println("Test.lArrFld = " + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }
    public static void main(String[] strArr2) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr2);
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
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}