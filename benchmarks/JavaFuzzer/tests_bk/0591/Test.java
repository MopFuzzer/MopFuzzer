// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:08 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-9L;
    public static boolean bFld=false;
    public static double dFld=-2.29691;
    public static byte byFld=-70;
    public static int iArrFld[]=new int[N];
    public static double dArrFld[]=new double[N];
    public long lArrFld[][]=new long[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, -1);
        FuzzerUtils.init(Test.dArrFld, -32.25769);
    }

    public static long sMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i3=64266, i4=-14, i5=113, i6=81, i7=-26, iArr[]=new int[N];
        short s=29225;
        float f=-49.423F, fArr1[]=new float[N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(iArr, -29985);
        FuzzerUtils.init(fArr1, -72.143F);
        FuzzerUtils.init(byArr, (byte)-37);

        i3 = 1;
        while (++i3 < 123) {
            if (Test.bFld) break;
            switch ((((i3 >>> 1) % 2) * 5) + 91) {
            case 101:
                switch (((i3 % 7) * 5) + 113) {
                case 126:
                    for (i4 = 1; 13 > i4; i4++) {
                        i5 += i4;
                        for (i6 = i4; i6 < 2; i6 += 3) {
                            switch ((i6 % 10) + 41) {
                            case 41:
                                Test.iArrFld[i4] += i3;
                                i7 += i7;
                            case 42:
                                try {
                                    i7 = (i6 % -146);
                                    Test.iArrFld[i4] = (76 / i7);
                                    Test.iArrFld[i4 + 1] = (9614 % Test.iArrFld[i6]);
                                } catch (ArithmeticException a_e) {}
                                i5 *= (int)8.16F;
                                s += (short)(i6 | i4);
                                break;
                            case 43:
                                i5 += (i6 + i5);
                                Test.dArrFld[i4] *= i7;
                                break;
                            case 44:
                                f += i4;
                                break;
                            case 45:
                                i5 -= -4205;
                                break;
                            case 46:
                                i7 = (int)166L;
                            case 47:
                                i5 += (((i6 * f) + i5) - i6);
                                break;
                            case 48:
                                i5 -= i6;
                                break;
                            case 49:
                                i5 += i3;
                                break;
                            case 50:
                                try {
                                    i7 = (iArr[i6] / 47975);
                                    i7 = (i3 / i4);
                                    i7 = (100 / i7);
                                } catch (ArithmeticException a_e) {}
                            }
                        }
                    }
                    break;
                case 143:
                case 131:
                    i7 += (i3 * Test.instanceCount);
                case 125:
                    i7 = i5;
                    break;
                case 124:
                    f *= (float)Test.dFld;
                    break;
                case 146:
                    fArr1 = FuzzerUtils.float1array(N, (float)42.167F);
                    break;
                case 133:
                    byArr[i3 - 1] = (byte)Test.instanceCount;
                    break;
                default:
                    Test.instanceCount >>= 126;
                }
            case 97:
                Test.dArrFld[i3] -= -9;
            }
        }
        vMeth1_check_sum += i3 + i4 + i5 + i6 + i7 + s + Float.floatToIntBits(f) + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + FuzzerUtils.checkSum(byArr);
    }

    public static void vMeth(int i2) {

        int i8=-116, i9=172, i10=-226, i11=0, i12=23;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -64985L);

        vMeth1();
        for (i8 = 8; i8 < 231; i8++) {
            if (Test.bFld) continue;
            if (Test.bFld) {
                i2 -= (int)Test.instanceCount;
                lArr[i8] += i2;
                for (i10 = 7; i8 < i10; i10 -= 3) {
                    i11 += (i10 * i2);
                }
                lArr[i8] |= i11;
            }
        }
        i12 = 1;
        do {
            i2 += i12;
            Test.dFld = -121.224F;
            Test.dArrFld = Test.dArrFld;
            i9 *= Test.byFld;
            i9 >>= (int)Test.instanceCount;
        } while (++i12 < 168);
        vMeth_check_sum += i2 + i8 + i9 + i10 + i11 + i12 + FuzzerUtils.checkSum(lArr);
    }

    public static short sMeth(boolean b, long l, double d) {

        int i=-110, i1=45;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 0.249F);

        for (i = 13; 332 > i; ++i) {
            fArr = (fArr = (fArr = (fArr = fArr)));
            vMeth(2);
        }
        i1 -= (int)10L;
        long meth_res = (b ? 1 : 0) + l + Double.doubleToLongBits(d) + i + i1 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i13=-3, i14=-46, i15=7, i16=-177, i17=-13;
        float f1=45.865F, fArr2[]=new float[N];
        long l1=-44393L;

        FuzzerUtils.init(fArr2, 107.945F);

        sMeth(Test.bFld, Test.instanceCount, 54.61095);
        Test.bFld = Test.bFld;
        Test.dFld -= i13;
        i14 = 1;
        do {
            Test.instanceCount += (13 + (i14 * i14));
        } while (++i14 < 238);
        f1 = 1;
        while (++f1 < 370) {
            Test.instanceCount = i13;
            i13 = (int)Test.instanceCount;
            Test.iArrFld[(int)(f1)] = i14;
            i13 = i14;
            i13 -= i13;
            Test.instanceCount += (long)f1;
            i13 += (int)f1;
            i13 >>>= -56;
            i13 = (int)Test.instanceCount;
            Test.iArrFld[(int)(f1)] = i13;
        }
        for (i15 = 4; 169 > i15; ++i15) {
            switch ((i15 % 5) + 43) {
            case 43:
            case 44:
                switch ((i15 % 3) + 21) {
                case 21:
                    if (Test.bFld) continue;
                    i16 += i15;
                    lArrFld[i15][i15 + 1] = (long)Test.dFld;
                    break;
                case 22:
                    i13 <<= i16;
                    i16 *= -14;
                    Test.instanceCount = i16;
                    i16 = (int)Test.instanceCount;
                    break;
                case 23:
                    for (l1 = 3; l1 < 152; ++l1) {
                        Test.iArrFld[(int)(l1 - 1)] |= i14;
                        fArr2[i15] += -4;
                        try {
                            i13 = (i17 % 48921);
                            Test.iArrFld[i15 + 1] = (i13 % 256);
                            i13 = (i15 / 1393);
                        } catch (ArithmeticException a_e) {}
                    }
                    break;
                }
            case 45:
                Test.instanceCount += i15;
                break;
            case 46:
                i16 ^= (int)Test.instanceCount;
                break;
            case 47:
                i16 -= i13;
            }
        }

        FuzzerUtils.out.println("i13 i14 f1 = " + i13 + "," + i14 + "," + Float.floatToIntBits(f1));
        FuzzerUtils.out.println("i15 i16 l1 = " + i15 + "," + i16 + "," + l1);
        FuzzerUtils.out.println("i17 fArr2 = " + i17 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr2)));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.dFld = " + Test.instanceCount + "," + (Test.bFld ? 1
            : 0) + "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.byFld Test.iArrFld Test.dArrFld = " + Test.byFld + "," +
            FuzzerUtils.checkSum(Test.iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));
        FuzzerUtils.out.println("lArrFld = " + FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
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
//DEBUG  sMeth ->  sMeth mainTest
//DEBUG  vMeth ->  vMeth sMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth sMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
