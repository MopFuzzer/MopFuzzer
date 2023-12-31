// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:57 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=1L;
    public static float fFld=-37.268F;
    public double dFld=48.66192;
    public static int iFld=-36128;
    public static long lArrFld[]=new long[N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 57215L);
        FuzzerUtils.init(Test.dArrFld, 56.59635);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;

    public static short sMeth(float f, int i3) {

        int i4=-4, i5=10, i6=38600, i7=-45777, i8=7, iArr1[][]=new int[N][N];
        double d1=-117.130793;
        byte by=-62;

        FuzzerUtils.init(iArr1, -43920);

        for (i4 = 12; i4 < 373; ++i4) {
            i5 = (int)-2955516621L;
            iArr1 = iArr1;
            i3 -= i4;
        }
        d1 = i4;
        i5 = (int)Test.instanceCount;
        Test.lArrFld[(-97 >>> 1) % N] *= i5;
        i5 = i5;
        i5 += by;
        for (long l : Test.lArrFld) {
            i6 = 1;
            do {
                for (i7 = 1; i7 < 1; ++i7) {
                    d1 %= (i5 | 1);
                    i8 <<= (int)Test.instanceCount;
                    i3 += (((i7 * i3) + by) - Test.instanceCount);
                }
            } while (++i6 < 4);
        }
        long meth_res = Float.floatToIntBits(f) + i3 + i4 + i5 + Double.doubleToLongBits(d1) + by + i6 + i7 + i8 +
            FuzzerUtils.checkSum(iArr1);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static void vMeth(int i1) {

        double d=2.128365, d2=0.107063, dArr[][]=new double[N][N];
        int i2=-52651, i9=40537, i10=5, i11=-11, iArr[]=new int[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -1.859F);
        FuzzerUtils.init(iArr, -7);
        FuzzerUtils.init(dArr, -2.74936);

        fArr[(i1 >>> 1) % N] *= (Test.instanceCount * ((iArr[(i1 >>> 1) % N]--) - (fArr[(i1 >>> 1) % N]--)));
        switch (((((int)(Test.instanceCount - Test.fFld)) >>> 1) % 8) + 22) {
        case 22:
            for (d = 1; d < 308; ++d) {
                iArr[(int)(d)] -= (int)((~sMeth(Test.fFld, i2)) * d);
                iArr[(int)(d)] = (int)199L;
                Test.fFld += Test.fFld;
                for (i9 = 1; i9 < 5; i9++) {
                    Test.lArrFld[i9 + 1] -= (long)d;
                    Test.fFld = i10;
                    i2 = (int)Test.instanceCount;
                    i11 = 1;
                    while (++i11 < 2) {
                        dArr[i9][i9 + 1] = i11;
                        Test.instanceCount += Test.instanceCount;
                        iArr[i9 - 1] += -3;
                        i10 += (int)d;
                    }
                }
            }
            break;
        case 23:
            i1 *= i1;
        case 24:
            i1 -= (int)-3013805417094420922L;
            break;
        case 25:
            Test.instanceCount = i2;
        case 26:
            i10 = i10;
            break;
        case 27:
            i2 -= i10;
            break;
        case 28:
            d2 += Test.instanceCount;
        case 29:
            Test.instanceCount = i11;
        default:
            Test.instanceCount = i2;
        }
        vMeth_check_sum += i1 + Double.doubleToLongBits(d) + i2 + i9 + i10 + i11 + Double.doubleToLongBits(d2) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public int iMeth() {

        int i13=3680, i14=-152, i15=-18, i16=-1728, i17=-136, i18=-7, i19=-211, iArr2[]=new int[N];
        boolean b=true;
        long l1=-6L;
        short s=28593;

        FuzzerUtils.init(iArr2, 60353);

        vMeth(59);
        iArr2[(i13 >>> 1) % N] *= 23378;
        for (i14 = 11; i14 < 185; i14++) {
            i15 = (int)Test.instanceCount;
            i13 += (i14 + i15);
            if (b) break;
            dFld -= Test.fFld;
            for (i16 = 9; 1 < i16; i16--) {
                Test.instanceCount *= i15;
                for (i18 = 1; 2 > i18; i18++) {
                    iArr2[i16 - 1] ^= (int)l1;
                    i19 *= i14;
                    iArr2[i16 - 1] = i13;
                    i17 -= s;
                    i19 = i18;
                }
            }
        }
        long meth_res = i13 + i14 + i15 + (b ? 1 : 0) + i16 + i17 + i18 + i19 + l1 + s + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=40345, i20=-13, i21=13, i22=10, i23=42687, i24=120, i25=79, i26=213, iArr3[]=new int[N];
        long l2=1813250603328696469L;
        short s1=26365;
        boolean b1=false;

        FuzzerUtils.init(iArr3, -109);

        i = 1;
        do {
            Test.instanceCount = (i + iMeth());
            Test.iFld += i;
            for (i20 = 3; i20 < 118; ++i20) {
                for (l2 = 2; l2 > 1; l2--) {
                    iArr3[(int)(l2 - 1)] -= (int)l2;
                    Test.fFld += i;
                    try {
                        iArr3[i20] = (i22 % i);
                        iArr3[i20] = (i21 / 10542);
                        iArr3[i] = (i / i20);
                    } catch (ArithmeticException a_e) {}
                }
                Test.dArrFld[i - 1] -= Test.fFld;
                for (i23 = 1; i23 < 2; i23++) {
                    Test.instanceCount += (-2436874019L + (i23 * i23));
                    i21 -= (int)Test.instanceCount;
                    if (b1) {
                        if (b1) {
                            i24 = (int)-120.468F;
                            iArr3[i20] += (int)Test.fFld;
                            i21 |= (int)l2;
                        } else if (b1) {
                            i24 = i23;
                            i22 %= (int)(i23 | 1);
                            Test.instanceCount -= s1;
                        }
                        i21 *= -35175;
                        try {
                            i21 = (186 % i22);
                            i22 = (i / -761958063);
                            i22 = (1973976581 % i);
                        } catch (ArithmeticException a_e) {}
                        Test.instanceCount -= (long)Test.fFld;
                    }
                    i24 += i22;
                    Test.iFld = i21;
                    Test.instanceCount = i24;
                    iArr3[i + 1] = i;
                }
            }
            for (i25 = 6; i25 < 118; i25++) {
                Test.instanceCount *= i25;
                if (b1) continue;
            }
        } while (++i < 213);

        FuzzerUtils.out.println("i i20 i21 = " + i + "," + i20 + "," + i21);
        FuzzerUtils.out.println("l2 i22 i23 = " + l2 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 s1 b1 = " + i24 + "," + s1 + "," + (b1 ? 1 : 0));
        FuzzerUtils.out.println("i25 i26 iArr3 = " + i25 + "," + i26 + "," + FuzzerUtils.checkSum(iArr3));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld dFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("Test.iFld Test.lArrFld Test.dArrFld = " + Test.iFld + "," +
            FuzzerUtils.checkSum(Test.lArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));

        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  sMeth ->  sMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
