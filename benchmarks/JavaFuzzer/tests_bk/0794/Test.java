// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:13 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=5260795754233033238L;
    public static float fFld=1.241F;
    public static int iFld=-75;
    public int iFld1=-5;
    public static int iArrFld[]=new int[N];
    public static volatile long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 3);
        FuzzerUtils.init(Test.lArrFld, 9L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i8=-4768, i9=-6148, i10=221, i11=-44, i12=8, i13=-46594, i14=-17097;
        float f=0.682F, fArr[][]=new float[N][N];
        byte by=-81;

        FuzzerUtils.init(fArr, 7.722F);

        i8 = (int)100L;
        for (i9 = 291; i9 > 17; --i9) {
            for (i11 = 1; i11 < 6; ++i11) {
                for (i13 = 1; i13 < 2; i13 += 2) {
                    i14 -= (int)f;
                    fArr[i9][i13 - 1] *= i9;
                    i8 += (-1 + (i13 * i13));
                    switch (((i11 % 7) * 5) + 26) {
                    case 58:
                        fArr[i9 - 1][i13] -= i14;
                        if (false) {
                            i14 = (int)-2730981895L;
                        } else {
                            i10 -= i10;
                        }
                        Test.iArrFld[i11] <<= i8;
                        break;
                    case 36:
                        f -= i9;
                        try {
                            i12 = (21408 / i14);
                            i12 = (i10 % Test.iArrFld[i9 + 1]);
                            i12 = (-24521 / Test.iArrFld[i9 + 1]);
                        } catch (ArithmeticException a_e) {}
                    case 43:
                        f *= 62835;
                        break;
                    case 38:
                        Test.lArrFld[i11 - 1] -= (long)f;
                        break;
                    case 39:
                        if (i12 != 0) {
                        }
                        break;
                    case 53:
                        i8 >>= (int)4L;
                    case 57:
                        Test.instanceCount += (i13 + i14);
                        break;
                    default:
                        f += by;
                    }
                }
            }
        }
        long meth_res = i8 + i9 + i10 + i11 + i12 + i13 + i14 + Float.floatToIntBits(f) + by +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i, int i1) {

        int i2=27, i3=13, i4=62483, i5=-54088, i6=-24179, i7=-11, iArr[]=new int[N];
        short s=1540;
        byte by1=-101;
        double d=-35.44613;

        FuzzerUtils.init(iArr, -114);

        switch (((((--Test.iArrFld[(i >>> 1) % N]) >>> 1) % 7) * 5) + 124) {
        case 140:
            i2 = 158;
            do {
                Test.iArrFld = Test.iArrFld;
                i1 = (int)(-4 * ((i | i1) + (i1 = (int)123L)));
                i3 = 19;
                do {
                    i = (i++);
                } while (--i3 > 0);
                switch (((i2 % 1) * 5) + 71) {
                case 73:
                    for (i4 = 1; i4 < 19; i4++) {
                        for (i6 = 2; i6 > 1; i6--) {
                            i7 = (int)(((Test.instanceCount++) * (s - 0.916F)) - iMeth());
                            i /= (int)(Test.instanceCount | 1);
                        }
                        Test.iArrFld[i2] = (int)Test.instanceCount;
                        Test.instanceCount = i2;
                    }
                    i += i2;
                    break;
                }
            } while ((i2 -= 2) > 0);
            break;
        case 156:
            by1 += (byte)i5;
        case 127:
            Test.fFld += i6;
            break;
        case 130:
            i7 >>= i5;
            break;
        case 148:
            Test.iArrFld = iArr;
        case 151:
            by1 |= (byte)Test.instanceCount;
            break;
        case 129:
            d %= (i4 | 1);
            break;
        }
        vMeth1_check_sum += i + i1 + i2 + i3 + i4 + i5 + i6 + i7 + s + by1 + Double.doubleToLongBits(d) +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth() {

        double d1=79.12527, d2=121.9643;
        int i15=-187, i16=-231, i17=7, i18=-31616, i19=37889;
        short s1=-29433;
        float fArr1[]=new float[N];

        FuzzerUtils.init(fArr1, 48.650F);

        vMeth1(Test.iFld, Test.iFld);
        Test.iFld -= (int)d1;
        for (i15 = 3; i15 < 248; ++i15) {
            for (d2 = 1; d2 < 7; d2++) {
                for (i18 = 1; i18 < 2; i18++) {
                    try {
                        Test.iFld = (i18 / 1270959356);
                        i16 = (220 / i18);
                        i19 = (Test.iArrFld[(int)(d2)] % Test.iArrFld[i15]);
                    } catch (ArithmeticException a_e) {}
                    s1 = (short)i19;
                    Test.iFld *= (int)Test.instanceCount;
                }
                Test.instanceCount = Test.instanceCount;
                i17 += (int)(d2 + Test.instanceCount);
                fArr1[i15] += Test.instanceCount;
                Test.iArrFld[i15] = i15;
            }
            Test.instanceCount -= -11;
        }
        Test.iArrFld[(Test.iFld >>> 1) % N] <<= i15;
        d1 %= (Test.instanceCount | 1);
        vMeth_check_sum += Double.doubleToLongBits(d1) + i15 + i16 + Double.doubleToLongBits(d2) + i17 + i18 + i19 + s1
            + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public void mainTest(String[] strArr1) {

        int i21=0, i22=60375, i23=8, i24=-14, i25=8, i26=-12, i27=-46909, i28=-92, i29=-248;
        double d3=0.5641;
        float f1=2.314F;
        boolean b=false;

        vMeth();
        switch (((Test.iFld >>> 1) % 2) + 88) {
        case 88:
            for (int i20 : Test.iArrFld) {
                for (i21 = 2; i21 < 63; ++i21) {
                    i22 = Test.iFld;
                    d3 *= d3;
                }
                for (i23 = 1; i23 < 63; ++i23) {
                    i22 = i24;
                    Test.iArrFld[i23 - 1] -= Test.iFld;
                    i22 += (((i23 * Test.iFld) + i20) - i24);
                }
                Test.iArrFld[(i20 >>> 1) % N] += (int)Test.fFld;
                i24 = i22;
                Test.iFld -= i24;
                Test.iFld = i22;
                for (f1 = 2; f1 < 63; f1 += 3) {
                    b = b;
                    Test.fFld += (f1 * i24);
                    Test.iArrFld[(int)(f1)] = i22;
                    b = b;
                    i22 <<= i21;
                    for (i26 = 1; i26 < 4; ++i26) {
                        d3 = Test.iFld;
                        i27 = (int)Test.instanceCount;
                        b = b;
                    }
                    if (b) {
                        Test.iArrFld[(int)(f1)] *= -63328;
                        for (i28 = 1; i28 < 4; i28++) {
                            i29 = -9325;
                            d3 += -126L;
                            Test.instanceCount -= iFld1;
                        }
                    } else if (true) {
                        i20 += (int)(f1 * i20);
                    }
                }
            }
            break;
        case 89:
            i25 *= (int)Test.fFld;
            break;
        default:
            i24 -= i25;
        }

        FuzzerUtils.out.println("i21 i22 d3 = " + i21 + "," + i22 + "," + Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("i23 i24 f1 = " + i23 + "," + i24 + "," + Float.floatToIntBits(f1));
        FuzzerUtils.out.println("i25 b i26 = " + i25 + "," + (b ? 1 : 0) + "," + i26);
        FuzzerUtils.out.println("i27 i28 i29 = " + i27 + "," + i28 + "," + i29);

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.iFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.iFld);
        FuzzerUtils.out.println("iFld1 Test.iArrFld Test.lArrFld = " + iFld1 + "," + FuzzerUtils.checkSum(Test.iArrFld)
            + "," + FuzzerUtils.checkSum(Test.lArrFld));

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
