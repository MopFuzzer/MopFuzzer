// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:04 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=2985335966726015480L;
    public static float fFld=0.438F;
    public static byte byFld=26;
    public static int iFld=-33995;
    public static int iFld1=16781;
    public static long lArrFld[]=new long[N];
    public static short sArrFld[]=new short[N];
    public static int iArrFld[]=new int[N];
    public volatile double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -2084956224L);
        FuzzerUtils.init(Test.sArrFld, (short)22220);
        FuzzerUtils.init(Test.iArrFld, -77);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long lMeth1_check_sum = 0;

    public static void vMeth(byte by, int i, int i1) {

        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)11180);

        for (short s : sArr) {
            Test.lArrFld[(i >>> 1) % N] = (i1 = i1);
        }
        vMeth_check_sum += by + i + i1 + FuzzerUtils.checkSum(sArr);
    }

    public static long lMeth1(long l) {

        int i5=-3, i6=132, i7=-35685, i8=-2, i9=-1, iArr[]=new int[N];
        double d=-2.100797;
        long lArr[][]=new long[N][N];
        float fArr[][]=new float[N][N];

        FuzzerUtils.init(lArr, 139L);
        FuzzerUtils.init(fArr, 2.492F);
        FuzzerUtils.init(iArr, -22313);

        lArr = lArr;
        for (i5 = 266; i5 > 3; i5--) {
            i6 = i5;
            Test.fFld = i5;
            if (i5 != 0) {
            }
            i6 >>= i5;
            i6 = (int)Test.fFld;
            i6 = i6;
            for (i7 = 1; i7 < 6; i7++) {
                fArr[i5 - 1][i5] = i8;
                i6 += i7;
                i6 += (int)Test.fFld;
                l -= (long)d;
                i6 += (i7 - i5);
                try {
                    iArr[i7] = (-51 % i7);
                    i6 = (i7 % iArr[i5 + 1]);
                    iArr[i5] = (i9 / i8);
                } catch (ArithmeticException a_e) {}
            }
        }
        long meth_res = l + i5 + i6 + i7 + i8 + Double.doubleToLongBits(d) + i9 + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr);
        lMeth1_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth() {

        int i10=-11033, i11=-7, i12=-49004, i13=8, i14=-36131, i15=1675;
        short s1=23125;
        float fArr1[]=new float[N];

        FuzzerUtils.init(fArr1, 0.388F);

        lMeth1(Test.instanceCount);
        for (i10 = 18; i10 < 354; ++i10) {
            i12 = 1;
            while (++i12 < 5) {
                Test.sArrFld[i10] *= (short)i11;
                for (i13 = i12; 1 > i13; ++i13) {
                    boolean b=true;
                    if (b) {
                        i11 >>= i12;
                        i14 >>= i13;
                        s1 = (short)i12;
                        Test.byFld += (byte)(((i13 * i10) + i10) - i14);
                    }
                    fArr1[i12 + 1] = i10;
                    s1 <<= s1;
                }
                i14 += i12;
                i11 = i12;
                try {
                    Test.iFld = (-163 / Test.iArrFld[i12 + 1]);
                    i15 = (Test.iFld % i15);
                    Test.iArrFld[i10] = (147 / i12);
                } catch (ArithmeticException a_e) {}
            }
        }
        long meth_res = i10 + i11 + i12 + i13 + i14 + s1 + i15 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth(int i3, int i4) {

        int i16=11, i17=-54891, i18=124;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -2.5073);

        iMeth();
        Test.iArrFld[(i4 >>> 1) % N] *= i4;
        Test.instanceCount *= Test.iFld;
        Test.iArrFld[(i4 >>> 1) % N] = i4;
        dArr[(Test.iFld >>> 1) % N] = i3;
        for (i16 = 4; i16 < 186; ++i16) {
            switch ((i16 % 2) + 52) {
            case 52:
                i4 -= i16;
                i4 += (int)Test.instanceCount;
                Test.instanceCount = i17;
                Test.fFld *= Test.iFld;
                break;
            case 53:
                Test.lArrFld[(i16 >>> 1) % N] >>= Test.instanceCount;
                Test.instanceCount = Test.iFld;
                break;
            default:
                i3 += (i16 | i16);
            }
            i3 += i18;
        }
        long meth_res = i3 + i4 + i16 + i17 + i18 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        byte by1=-99;
        int i2=13, i19=24, i20=0, i21=5, i22=-1, i23=-82, i24=38655, i25=-190, i26=45042, i27=-39695;
        long l1=-156L;
        double d1=121.73997;
        boolean b1=true;

        vMeth((byte)(by1++), (int)(i2 % ((lMeth(i2, Test.iFld) - Test.byFld) | 1)), Test.iFld);
        l1 = 154;
        while (--l1 > 0) {
            switch ((int)(((l1 % 6) * 5) + 70)) {
            case 82:
                try {
                    i2 = (-467959982 / Test.iFld);
                    Test.iArrFld[(int)(l1 + 1)] = (Test.iFld % -140);
                    i2 = (i2 / Test.iFld);
                } catch (ArithmeticException a_e) {}
                Test.iFld <<= Test.iFld1;
            case 100:
                for (i19 = 5; i19 < 163; i19++) {
                    if (false) break;
                    i2 += (i19 | (long)Test.fFld);
                    Test.fFld += (((i19 * i20) + i2) - Test.instanceCount);
                    for (i21 = 1; i21 < 2; ++i21) {
                        switch ((i21 % 2) + 119) {
                        case 119:
                            Test.iFld1 = Test.iFld;
                        case 120:
                            d1 -= l1;
                            Test.iArrFld[i21 - 1] <<= 12;
                            break;
                        }
                        Test.iArrFld[i21] *= (int)l1;
                        Test.iArrFld[(int)(l1 + 1)] = i2;
                        if (b1) break;
                        if (b1) break;
                    }
                    Test.iFld -= Test.iFld;
                    i22 *= i19;
                }
                Test.instanceCount += (l1 ^ by1);
                break;
            case 83:
                Test.instanceCount += (long)Test.fFld;
                for (i23 = 163; i23 > 1; --i23) {
                    Test.iArrFld[i23 - 1] *= (int)Test.fFld;
                }
                break;
            case 81:
                for (i25 = 6; i25 < 163; ++i25) {
                    i27 = 1;
                    while (++i27 < 2) {
                        i22 += (i27 * i27);
                        dArrFld[(int)(l1)] += l1;
                        i22 = (int)l1;
                        Test.iFld += (((i27 * i19) + i2) - i20);
                    }
                }
                break;
            case 73:
            case 77:
                Test.instanceCount += (-12 + (l1 * l1));
            default:
                Test.iFld = i20;
            }
        }

        FuzzerUtils.out.println("by1 i2 l1 = " + by1 + "," + i2 + "," + l1);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 d1 b1 = " + i22 + "," + Double.doubleToLongBits(d1) + "," + (b1 ? 1 : 0));
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 i27 = " + i26 + "," + i27);

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.byFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.byFld);
        FuzzerUtils.out.println("Test.iFld Test.iFld1 Test.lArrFld = " + Test.iFld + "," + Test.iFld1 + "," +
            FuzzerUtils.checkSum(Test.lArrFld));
        FuzzerUtils.out.println("Test.sArrFld Test.iArrFld dArrFld = " + FuzzerUtils.checkSum(Test.sArrFld) + "," +
            FuzzerUtils.checkSum(Test.iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth1_check_sum: " + lMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  iMeth ->  iMeth lMeth mainTest
//DEBUG  lMeth1 ->  lMeth1 iMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
