// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:03 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-1036739859L;
    public static int iFld=-6;
    public static float fFld=-2.436F;
    public boolean bFld=false;
    public int iFld1=-88;
    public byte byFld=-110;
    public static int iFld2=-22194;
    public static double dArrFld[]=new double[N];
    public static long lArrFld[]=new long[N];
    public static volatile float fArrFld[][]=new float[N][N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 18.39744);
        FuzzerUtils.init(Test.lArrFld, -5021877862314447615L);
        FuzzerUtils.init(Test.fArrFld, 2.782F);
        FuzzerUtils.init(Test.iArrFld, 1);
    }

    public static long iMeth_check_sum = 0;
    public static long byMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(long l1) {

        byte by=67;
        int i5=13, i6=-13, i7=-49685, iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, -34147);

        Test.iFld *= Test.iFld;
        Test.lArrFld[(Test.iFld >>> 1) % N] = by;
        Test.iFld = Test.iFld;
        Test.fFld *= Test.iFld;
        Test.instanceCount &= Test.iFld;
        iArr1[(Test.iFld >>> 1) % N] *= (int)Test.fFld;
        Test.fFld -= Test.iFld;
        i5 = 1;
        do {
            iArr1 = iArr1;
            for (i6 = 1; i6 < 5; ++i6) {
                Test.lArrFld[i6] &= Test.iFld;
                i7 += (i6 - Test.fFld);
                Test.iFld <<= 9;
                iArr1[i5 + 1] = (int)Test.instanceCount;
            }
            Test.fFld = Test.fFld;
        } while (++i5 < 320);
        long meth_res = l1 + by + i5 + i6 + i7 + FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static byte byMeth(int i2, int i3) {

        float f1=-86.366F;
        int i4=-3, i8=-41856, i9=29, iArr2[]=new int[N];
        double d=28.106006, d1=-19.26037;
        long l=3180952391L;

        FuzzerUtils.init(iArr2, -4);

        i3 = ((-i3) % (i2 | 1));
        for (f1 = 17; f1 < 318; f1 += 3) {
            d = 1;
            do {
                i2 -= i3;
                Test.instanceCount += (long)(((d * f1) + i3) - i2);
                l -= (long)((i4 - (++i4)) % (((long)((Test.dArrFld[(int)(d)]--) * (d - Test.instanceCount))) | 1));
                i4 += (int)(d - i2);
                d1 -= iMeth1(l);
                for (i8 = 1; 1 > i8; ++i8) {
                    l *= (long)d;
                    try {
                        i4 = (iArr2[i8 + 1] % i9);
                        iArr2[(int)(f1 + 1)] = (i8 % 207);
                        i4 = (53226 / iArr2[(int)(d + 1)]);
                    } catch (ArithmeticException a_e) {}
                    if (Test.iFld != 0) {
                    }
                    Test.instanceCount += Test.iFld;
                }
                i3 |= i8;
            } while (++d < 16);
        }
        i4 = (int)d;
        long meth_res = i2 + i3 + Float.floatToIntBits(f1) + i4 + Double.doubleToLongBits(d) + l +
            Double.doubleToLongBits(d1) + i8 + i9 + FuzzerUtils.checkSum(iArr2);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public int iMeth(int i) {

        float f=64.292F;
        int i1=31212, i10=-24153, i11=-188, iArr[]=new int[N];
        double d2=58.87523;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)31);
        FuzzerUtils.init(iArr, 4);

        f -= byArr[(i >>> 1) % N];
        i1 = 144;
        do {
            i = ((--iArr[i1 + 1]) * byMeth(Test.iFld, i1));
            f *= i;
            d2 += Test.fFld;
            iArr = iArr;
            if (bFld) {
                f -= (float)d2;
                Test.iFld = Test.iFld;
                i = i;
                i += (((i1 * Test.instanceCount) + i1) - i1);
            } else {
                Test.instanceCount += (-56 + (i1 * i1));
                for (i10 = i1; i10 < 11; ++i10) {
                    Test.fArrFld[i1 + 1][i1] -= i1;
                    Test.instanceCount += (-40462 + (i10 * i10));
                }
            }
        } while (--i1 > 0);
        long meth_res = i + Float.floatToIntBits(f) + i1 + Double.doubleToLongBits(d2) + i10 + i11 +
            FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d3=-115.98645;
        int i12=-39984, i13=-59485, i14=-7, i15=-246, i16=14, i17=-39113, i18=-45639;

        iMeth(Test.iFld);
        Test.dArrFld = Test.dArrFld;
        d3 -= Test.instanceCount;
        Test.iArrFld[(i12 >>> 1) % N] = 49;
        i12 -= (int)Test.instanceCount;
        i13 = 1;
        do {
            i12 = (int)Test.instanceCount;
        } while (++i13 < 377);
        for (i14 = 5; i14 < 362; i14 += 2) {
            Test.iArrFld[i14 - 1] += 14537;
            Test.fFld *= iFld1;
            try {
                i15 = (Test.iArrFld[i14 + 1] % i14);
                i12 = (Test.iFld / i14);
                Test.iArrFld[i14] = (Test.iFld / 483512729);
            } catch (ArithmeticException a_e) {}
            i16 = 1;
            do {
                i12 <<= 9;
                Test.instanceCount = -116;
                switch (((i14 % 2) * 5) + 116) {
                case 124:
                    Test.iFld *= Test.iFld;
                    switch ((i16 % 8) + 104) {
                    case 104:
                        Test.dArrFld[i16] *= i12;
                        Test.iFld *= byFld;
                        Test.iFld2 += (int)d3;
                        if (true) continue;
                        break;
                    case 105:
                        i12 %= (int)(i15 | 1);
                        for (i17 = 1; i17 < 1; i17++) {
                            switch ((i14 % 1) + 103) {
                            case 103:
                                Test.fFld += Test.instanceCount;
                                break;
                            }
                            Test.iFld2 += 216;
                            iFld1 += (((i17 * i16) + Test.instanceCount) - i18);
                        }
                        if (bFld) break;
                        break;
                    case 106:
                    case 107:
                    case 108:
                        Test.instanceCount += byFld;
                        iFld1 = i14;
                        break;
                    case 109:
                        i12 += i13;
                    case 110:
                        Test.iFld2 <<= i15;
                        break;
                    case 111:
                        if (false) continue;
                        break;
                    }
                    break;
                case 120:
                    byFld = (byte)-104;
                    break;
                default:
                    iFld1 <<= i13;
                }
            } while (++i16 < 141);
        }

        FuzzerUtils.out.println("d3 i12 i13 = " + Double.doubleToLongBits(d3) + "," + i12 + "," + i13);
        FuzzerUtils.out.println("i14 i15 i16 = " + i14 + "," + i15 + "," + i16);
        FuzzerUtils.out.println("i17 i18 = " + i17 + "," + i18);

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.fFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("bFld iFld1 byFld = " + (bFld ? 1 : 0) + "," + iFld1 + "," + byFld);
        FuzzerUtils.out.println("Test.iFld2 Test.dArrFld Test.lArrFld = " + Test.iFld2 + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)) + "," + FuzzerUtils.checkSum(Test.lArrFld));
        FuzzerUtils.out.println("Test.fArrFld Test.iArrFld = " +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("byMeth_check_sum: " + byMeth_check_sum);
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
//DEBUG  byMeth ->  byMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 byMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
