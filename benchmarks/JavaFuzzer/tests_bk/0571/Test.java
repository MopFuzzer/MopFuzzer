// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:07 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-453058165L;
    public static int iFld=13;
    public static short sFld=-26258;
    public static boolean bFld=true;
    public short sArrFld[]=new short[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 2.181F);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth() {

        int i6=59762, i7=5, i8=4, iArr2[]=new int[N];
        float f2=2.755F;
        byte by=-35, byArr[][]=new byte[N][N];
        short sArr[]=new short[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(byArr, (byte)39);
        FuzzerUtils.init(sArr, (short)-6487);
        FuzzerUtils.init(lArr1, 1582L);
        FuzzerUtils.init(iArr2, 56233);

        byArr[(Test.iFld >>> 1) % N][(-58244 >>> 1) % N] -= (byte)-49124;
        Test.sFld *= (short)100;
        if (false) {
            for (i6 = 5; 275 > i6; ++i6) {
                Test.iFld *= (int)f2;
                by = (byte)Test.iFld;
                i8 = 1;
                while (++i8 < 6) {
                    sArr = sArr;
                    switch (((i8 % 2) * 5) + 6) {
                    case 7:
                    case 8:
                        i7 <<= Test.sFld;
                        if (Test.bFld) break;
                        Test.instanceCount = Test.instanceCount;
                        lArr1[i6] = (long)-81.73595;
                        break;
                    default:
                        Test.bFld = Test.bFld;
                        Test.iFld += i8;
                    }
                }
            }
        } else {
            Test.iFld = i8;
        }
        long meth_res = i6 + i7 + Float.floatToIntBits(f2) + by + i8 + FuzzerUtils.checkSum(byArr) +
            FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr2);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth() {

        int i1=12630, i2=-51894, i3=57513, i4=6561, i5=-2, iArr1[]=new int[N];
        double d1=-40.37143;
        short s=-11713;

        FuzzerUtils.init(iArr1, 47088);

        for (i1 = 21; 356 > i1; i1++) {
            if (Test.bFld) {
                for (d1 = 1; d1 < 5; ++d1) {
                    i3 <<= (iArr1[i1 - 1] + ((--i2) - iArr1[(int)(d1)]));
                    iArr1[i1 + 1] = 63;
                    iArr1[i1 + 1] = Test.iFld;
                    for (i4 = 1; i4 < 2; i4++) {
                        i2 += (((i4 * Test.instanceCount) + Test.instanceCount) - s);
                        Test.instanceCount *= (i2 = (int)(Test.instanceCount++));
                        i5 += (((i4 * i4) + s) - i1);
                        Test.instanceCount -= (long)d1;
                        if (i5 == (i2 *= (int)lMeth())) continue;
                    }
                }
                Test.instanceCount |= 91;
            } else {
                Test.instanceCount &= Test.instanceCount;
                Test.iFld += (((i1 * i1) + i5) - Test.instanceCount);
            }
        }
        long meth_res = i1 + i2 + Double.doubleToLongBits(d1) + i3 + i4 + i5 + s + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        double d2=24.70027, d3=2.13732;
        byte by1=19;
        int i10=152, i11=10, iArr3[]=new int[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 48.770F);
        FuzzerUtils.init(iArr3, -55363);

        for (float f1 : fArr) {
            Test.iFld = iMeth();
            d2 *= 41446;
            Test.iFld -= by1;
            for (i10 = 1; 4 > i10; i10++) {
                d3 = 1;
                while (++d3 < 2) {
                    Test.instanceCount += (long)(((d3 * Test.iFld) + Test.sFld) - Test.iFld);
                    iArr3[i10] = by1;
                    i11 = i10;
                    Test.iFld += (int)d3;
                    iArr3[(int)(d3 + 1)] = i10;
                    i11 &= i10;
                    Test.bFld = Test.bFld;
                }
                by1 = (byte)94;
                i11 += i10;
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d2) + by1 + i10 + i11 + Double.doubleToLongBits(d3) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr3);
    }

    public void mainTest(String[] strArr1) {

        float f=0.17F;
        int i=-68, i12=6935, i13=189, i14=4, i15=205, i16=-6, i17=0, i18=25294, i19=-38400, i20=23781, i21=-94,
            iArr[][]=new int[N][N];
        double d=0.10130;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 5);
        FuzzerUtils.init(lArr, 6470646830016180243L);

        f = (((Test.iFld >>= Test.iFld) - (Test.iFld - Test.iFld)) + ((f - Test.instanceCount) - Test.iFld));
        i = 1;
        while (++i < 253) {
            iArr[i][i + 1] = (int)(Test.instanceCount + lArr[i + 1]);
            f -= (float)d;
            sArrFld[i + 1] &= (short)(Test.instanceCount - (-156 - Test.iFld));
            f += iArr[i + 1][i + 1];
            vMeth();
            Test.iFld += Test.iFld;
            if (Test.bFld) break;
            Test.iFld = i;
        }
        i12 = 1;
        do {
            i13 = 1;
            do {
                for (i14 = i12; i14 < 3; i14++) {
                    Test.instanceCount += Test.instanceCount;
                    Test.iFld += Test.iFld;
                    i15 += (i14 * Test.instanceCount);
                    Test.instanceCount <<= i;
                    Test.iFld += (((i14 * i) + f) - i13);
                    Test.iFld >>>= i14;
                    Test.iFld = (int)Test.instanceCount;
                }
            } while ((i13 += 3) < 69);
        } while (++i12 < 365);
        for (i16 = 9; 198 > i16; i16++) {
            Test.iFld = 48758;
            i18 = 1;
            do {
                i19 = 1;
                do {
                    Test.iFld -= (int)Test.instanceCount;
                    i17 -= i;
                } while ((i19 += 2) < 1);
                for (i20 = 1; 1 > i20; i20++) {
                    Test.fArrFld[(52 >>> 1) % N] = f;
                    Test.iFld = i14;
                    Test.fArrFld[i16] = 2;
                }
            } while (++i18 < 133);
        }

        FuzzerUtils.out.println("f i d = " + Float.floatToIntBits(f) + "," + i + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("i12 i13 i14 = " + i12 + "," + i13 + "," + i14);
        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 iArr lArr = " + i21 + "," + FuzzerUtils.checkSum(iArr) + "," +
            FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.sFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Test.sFld);
        FuzzerUtils.out.println("Test.bFld sArrFld Test.fArrFld = " + (Test.bFld ? 1 : 0) + "," +
            FuzzerUtils.checkSum(sArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  lMeth ->  lMeth iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
