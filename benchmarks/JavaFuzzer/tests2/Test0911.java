// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:55 2023
public class Test0911 {

    public static final int N = 400;

    public static volatile long instanceCount=-345283166946974373L;
    public static int iFld=-26401;
    public static volatile double dFld=0.96898;
    public float[][] fArrFld =new float[N][N];
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0911.iArrFld, 62101);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(long l, int i2, byte by) {

        int i3=46248, i4=0, i5=14, i6=-22168, i7=1, i8=-56149;

        Test0911.iFld = Test0911.iFld;
        Test0911.iArrFld = Test0911.iArrFld;
        l *= i2;
        for (i3 = 8; i3 < 163; ++i3) {
            Test0911.instanceCount += (-33455L + (i3 * i3));
            i2 -= Test0911.iFld;
            for (i5 = 1; i5 < 10; i5++) {
                if (false) continue;
                for (i7 = 1; i7 < 2; ++i7) {
                    if (i6 != 0) {
                    }
                    by = by;
                    Test0911.dFld += 129;
                }
            }
            i4 >>= i6;
            Test0911.iFld <<= i3;
            i2 += (i3 - Test0911.iFld);
        }
        long meth_res = l + i2 + by + i3 + i4 + i5 + i6 + i7 + i8;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i1) {

        byte by1=29;
        int i10=-6, i11=5, i12=4183, i13=104, i14=-12, i15=-14;
        float f1=0.610F;
        short s=16862;

        Test0911.iArrFld[(40 >>> 1) % N] <<= (iMeth1(Test0911.instanceCount, -164, by1) - 48789);
        Test0911.iFld <<= Test0911.iFld;
        for (i10 = 197; i10 > 1; i10 -= 3) {
            i11 = 4237;
            Test0911.iArrFld[i10 + 1] <<= (int) Test0911.instanceCount;
            i11 -= i11;
            i1 = by1;
            switch ((i10 % 3) + 51) {
            case 51:
                if (i11 != 0) {
                }
                for (i12 = 24; i12 > 1; --i12) {
                    for (i14 = 1; i14 < 2; i14++) {
                        i11 = i13;
                        Test0911.iFld = 4888;
                        Test0911.instanceCount -= i14;
                        f1 /= (i1 | 1);
                    }
                }
            case 52:
                Test0911.iArrFld = Test0911.iArrFld;
                break;
            case 53:
                i13 ^= s;
            default:
            }
        }
        long meth_res = i1 + by1 + i10 + i11 + i12 + i13 + i14 + i15 + Float.floatToIntBits(f1) + s;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        short s1=14080;
        int i16=-13, i17=160, i18=8, i19=206, i20=-7;
        long l1=1693927105994003337L;
        long[] lArr =new long[N];
        byte by2=36;
        float f2=-2.108F;

        FuzzerUtils.init(lArr, 123L);

        Test0911.instanceCount = ((lArr[(-249 >>> 1) % N] >>= iMeth(Test0911.iFld)) - -193);
        s1 *= (short)86.45502;
        i16 = 1;
        do {
            switch (((i16 % 6) * 5) + 2) {
            case 15:
                Test0911.iArrFld[i16] = i16;
                break;
            case 8:
                for (l1 = 1; l1 < 5; ++l1) {
                    i17 += (int)l1;
                    Test0911.iFld = 4;
                }
                i17 += i17;
                for (i18 = 5; i18 > 1; --i18) {
                    i20 = 1;
                    do {
                        by2 *= (byte)l1;
                        lArr[i16 + 1] |= 27463;
                        Test0911.iFld += (int) l1;
                    } while (++i20 < 2);
                    f2 = -26062;
                }
            case 19:
                Test0911.dFld %= (i18 | 1);
                break;
            case 17:
                Test0911.iFld += i19;
                break;
            case 11:
                Test0911.iArrFld[i16 + 1] = i18;
                break;
            case 30:
                Test0911.instanceCount *= i20;
                break;
            }
        } while (++i16 < 343);
        vMeth_check_sum += s1 + i16 + l1 + i17 + i18 + i19 + i20 + by2 + Float.floatToIntBits(f2) +
            FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i=11, i21=13, i22=-3, i23=14, i24=4;
        double d=101.2707;
        float f=0.469F;
        short s2=-206;
        boolean b=false;

        i = 1;
        do {
            Test0911.iFld &= (int) ((d++) - ((fArrFld[i][i - 1]--) + (-59 << (-14413L * Integer.reverseBytes(Test0911.iFld)))));
            Test0911.iFld *= (int) fArrFld[i - 1][i - 1];
            Test0911.iFld += (((i * Test0911.instanceCount) + f) - Test0911.iFld);
            Test0911.iFld *= 14;
            vMeth();
            switch (((14 >>> 1) % 10) + 79) {
            case 79:
                Test0911.iArrFld[i + 1] -= (int) -2071319983L;
                break;
            case 80:
                Test0911.iFld = Test0911.iFld;
                Test0911.iArrFld[i] |= -106;
            case 81:
                try {
                    Test0911.iFld = (Test0911.iFld % Test0911.iFld);
                    Test0911.iFld = (i / Test0911.iFld);
                    Test0911.iFld = (-62 / Test0911.iArrFld[i]);
                } catch (ArithmeticException a_e) {}
                s2 >>= (short)i;
                switch ((i % 2) + 89) {
                case 89:
                    Test0911.dFld += i;
                    break;
                case 90:
                    Test0911.iFld = (int) Test0911.instanceCount;
                    f += Test0911.iFld;
                    b = false;
                    break;
                }
                Test0911.instanceCount -= Test0911.instanceCount;
                break;
            case 82:
                Test0911.iFld += (((i * i) + f) - i);
                Test0911.instanceCount -= Test0911.iFld;
                Test0911.iFld -= (int) Test0911.instanceCount;
                for (i21 = 88; i21 > i; i21--) {
                    i22 += (i21 ^ i);
                    for (i23 = 1; i23 < 1; ++i23) {
                        switch ((i23 % 10) + 63) {
                        case 63:
                            i24 = (int)6L;
                            break;
                        case 64:
                            if (b) break;
                            break;
                        case 65:
                            Test0911.iFld += i24;
                            Test0911.iFld += i23;
                            i24 = (int) Test0911.instanceCount;
                            break;
                        case 66:
                            i24 += (((i23 * i) + Test0911.iFld) - Test0911.instanceCount);
                            break;
                        case 67:
                            Test0911.dFld += 109;
                            break;
                        case 68:
                            i22 += i23;
                        case 69:
                            Test0911.iFld += (int) Test0911.dFld;
                            break;
                        case 70:
                            Test0911.iArrFld[i21 + 1] = i23;
                            break;
                        case 71:
                            Test0911.iFld += (i23 * i23);
                            break;
                        case 72:
                            i22 += (((i23 * i24) + i22) - i23);
                            break;
                        default:
                            Test0911.dFld -= i;
                        }
                    }
                }
            case 83:
                i24 -= (int) Test0911.instanceCount;
                break;
            case 84:
                Test0911.iFld *= i24;
            case 85:
                Test0911.iFld *= -62013;
                break;
            case 86:
                try {
                    i22 = (i24 % -42557);
                    i24 = (Test0911.iFld % Test0911.iArrFld[i + 1]);
                    i24 = (-13110 / i24);
                } catch (ArithmeticException a_e) {}
                break;
            case 87:
                i22 += (((i * Test0911.instanceCount) + i22) - i24);
                break;
            case 88:
                fArrFld[i][i + 1] = (float) Test0911.dFld;
                break;
            }
        } while (++i < 287);

        FuzzerUtils.out.println("i d f = " + i + "," + Double.doubleToLongBits(d) + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("s2 b i21 = " + s2 + "," + (b ? 1 : 0) + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);

        FuzzerUtils.out.println("Test0911.instanceCount Test0911.iFld Test0911.dFld = " + Test0911.instanceCount + "," + Test0911.iFld +
                "," + Double.doubleToLongBits(Test0911.dFld));
        FuzzerUtils.out.println("fArrFld Test0911.iArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)) +
                "," + FuzzerUtils.checkSum(Test0911.iArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0911 _instance = new Test0911();
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
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
