// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:53 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2972758776L;
    public int iFld=95;
    public static boolean bFld=true;
    public static short sFld=-14760;
    public int iFld1=-3878;
    public static int iArrFld[]=new int[N];
    public static short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 0);
        FuzzerUtils.init(Test.sArrFld, (short)24794);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public void vMeth(long l, int i, int i1) {

        int iArr[]=new int[N];

        FuzzerUtils.init(iArr, -14);

        iArr[(i1 >>> 1) % N] = ((i--) * (--iArr[(i1 >>> 1) % N]));
        vMeth_check_sum += l + i + i1 + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth2(byte by, int i4, double d) {

        int i5=-37334;
        boolean b=true;

        Test.instanceCount %= (Test.instanceCount | 1);
        i5 = i4;
        b = b;
        i5 += i4;
        vMeth2_check_sum += by + i4 + Double.doubleToLongBits(d) + i5 + (b ? 1 : 0);
    }

    public static void vMeth1(long l1) {

        byte by1=16;
        int i6=11, i7=195, i8=7599, i9=-41421, i10=-108, i11=47964, iArr1[]=new int[N];
        double d1=13.89102, d2=0.22108, dArr[]=new double[N];
        short s=20834;

        FuzzerUtils.init(iArr1, -176);
        FuzzerUtils.init(dArr, 71.64133);

        vMeth2(by1, i6, d1);
        for (d2 = 19; 385 > d2; d2++) {
            for (i8 = (int)(d2); i8 < 5; i8++) {
                for (i10 = 1; i10 < 1; i10++) {
                    i6 >>>= (int)Test.instanceCount;
                }
                i11 = (int)l1;
                iArr1[i8 + 1] += i11;
                switch (((i8 % 2) * 5) + 39) {
                case 45:
                    Test.iArrFld[i8 + 1] &= i8;
                    break;
                case 46:
                    by1 = (byte)d2;
                    break;
                }
            }
            switch ((int)(((d2 % 2) * 5) + 64)) {
            case 70:
                i9 <<= 5;
                s += (short)32.11847;
                Test.instanceCount |= i6;
                break;
            case 65:
                l1 -= l1;
            default:
                dArr[(int)(d2)] = -61;
            }
        }
        vMeth1_check_sum += l1 + by1 + i6 + Double.doubleToLongBits(d1) + Double.doubleToLongBits(d2) + i7 + i8 + i9 +
            i10 + i11 + s + FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static int iMeth(int i2, int i3) {

        short s1=-7496;
        double d3=-101.95747;
        float f=-2.359F;
        int i12=7, i13=61869, i14=-12, i15=-8310, i16=3, iArr2[][]=new int[N][N];
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 53174L);
        FuzzerUtils.init(iArr2, 247);

        vMeth1(45029L);
        for (long l2 : lArr) {
            if (Test.bFld) break;
            Test.iArrFld[(5 >>> 1) % N] = i3;
            Test.iArrFld[(i3 >>> 1) % N] *= s1;
            iArr2 = iArr2;
        }
        d3 *= f;
        for (i12 = 20; i12 < 325; ++i12) {
            i3 /= (int)(i12 | 1);
            for (i14 = i12; i14 < 5; ++i14) {
                i16 = 1;
                while (--i16 > 0) {
                    Test.instanceCount += i16;
                    i15 += i13;
                }
                i2 += (int)Test.instanceCount;
                Test.instanceCount = i12;
            }
        }
        long meth_res = i2 + i3 + s1 + Double.doubleToLongBits(d3) + Float.floatToIntBits(f) + i12 + i13 + i14 + i15 +
            i16 + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f1=0.28F;
        long l3=-8L, l4=242L, l5=963558377907661429L, lArr1[]=new long[N];
        double d4=-2.94337, d5=-1.52860;
        int i17=10, i18=12, i19=-40948, i20=13, i21=-227;
        byte by2=91;

        FuzzerUtils.init(lArr1, 739035640L);

        vMeth(--Test.instanceCount, iFld, (int)(Integer.reverseBytes(iMeth(iFld, iFld)) + f1));
        iFld = (int)l3;
        iFld = iFld;
        d4 = 1;
        while (++d4 < 377) {
            l4 /= ((long)(f1) | 1);
        }
        l3 ^= iFld;
        Test.iArrFld[(iFld >>> 1) % N] += -74;
        Test.sArrFld[(iFld >>> 1) % N] %= (short)(iFld | 1);
        for (l5 = 7; l5 < 206; l5++) {
            iFld = (int)1745410370L;
            switch (((i17 >>> 1) % 10) + 102) {
            case 102:
                if (Test.bFld) continue;
                iFld = (int)l3;
                for (i18 = 2; i18 < 126; ++i18) {
                    iFld += (i18 ^ Test.instanceCount);
                }
                Test.iArrFld[(int)(l5)] = (int)Test.instanceCount;
                break;
            case 103:
                iFld -= i19;
                f1 += l5;
                iFld += by2;
                break;
            case 104:
                iFld += -134;
                switch (((i17 >>> 1) % 10) + 61) {
                case 61:
                    iFld -= i17;
                    for (i20 = 5; 126 > i20; ++i20) {
                        i19 = (int)l5;
                        i19 = i18;
                        if (Test.bFld) {
                            i21 += (((i20 * i21) + l5) - i17);
                        } else {
                            iFld >>= i17;
                            i17 = i20;
                            iFld = (int)17251L;
                        }
                    }
                    break;
                case 62:
                    i19 = (int)f1;
                    break;
                case 63:
                    i19 /= 9;
                case 64:
                    try {
                        Test.iArrFld[(int)(l5 - 1)] = (i21 % -400090064);
                        Test.iArrFld[(int)(l5 + 1)] = (52087 / Test.iArrFld[(int)(l5 - 1)]);
                        Test.iArrFld[(int)(l5)] = (i21 % 62738);
                    } catch (ArithmeticException a_e) {}
                case 65:
                    Test.iArrFld[(int)(l5 + 1)] = iFld;
                    break;
                case 66:
                    i19 = (int)Test.instanceCount;
                case 67:
                    lArr1[(int)(l5)] -= i19;
                case 68:
                    i19 += Test.sFld;
                case 69:
                    iFld <<= i17;
                    break;
                case 70:
                    iFld += (int)l5;
                default:
                    l4 = iFld;
                }
                break;
            case 105:
                i21 = i20;
            case 106:
                i19 += (int)l5;
                break;
            case 107:
                Test.iArrFld[(int)(l5 - 1)] = (int)l5;
            case 108:
                f1 = iFld;
                break;
            case 109:
                i21 = i20;
                break;
            case 110:
                iFld1 += i17;
                break;
            case 111:
                d5 -= f1;
                break;
            }
        }

        FuzzerUtils.out.println("f1 l3 d4 = " + Float.floatToIntBits(f1) + "," + l3 + "," +
            Double.doubleToLongBits(d4));
        FuzzerUtils.out.println("l4 l5 i17 = " + l4 + "," + l5 + "," + i17);
        FuzzerUtils.out.println("i18 i19 by2 = " + i18 + "," + i19 + "," + by2);
        FuzzerUtils.out.println("i20 i21 d5 = " + i20 + "," + i21 + "," + Double.doubleToLongBits(d5));
        FuzzerUtils.out.println("lArr1 = " + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test.instanceCount iFld Test.bFld = " + Test.instanceCount + "," + iFld + "," +
            (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.sFld iFld1 Test.iArrFld = " + Test.sFld + "," + iFld1 + "," +
            FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.sArrFld = " + FuzzerUtils.checkSum(Test.sArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}