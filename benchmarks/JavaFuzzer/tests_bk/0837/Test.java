// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:14 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=141L;
    public static byte byFld=-6;
    public int iFld=-234;
    public boolean bFld=true;
    public static float fFld=-2.792F;
    public static int iArrFld[]=new int[N];
    public static float fArrFld[][]=new float[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, -138);
        FuzzerUtils.init(Test.fArrFld, 0.599F);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i3=17562, i4=72, i5=22896, i6=-127;
        byte by=-71;
        float f1=2.471F;
        double d=101.46159, d1=2.96135;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -2377194392L);

        i3 = by;
        f1 *= i3;
        d += i3;
        if (true) {
            d1 = 1;
            while (++d1 < 209) {
                i4 = 8;
                do {
                    d -= f1;
                    try {
                        i3 = (i4 / i3);
                        i3 = (i3 / i4);
                        i3 = (i4 % -52332);
                    } catch (ArithmeticException a_e) {}
                    i3 ^= i4;
                    i3 -= i4;
                    for (i5 = (int)(d1); i5 < 1; i5++) {
                        if (i6 != 0) {
                            vMeth1_check_sum += i3 + by + Float.floatToIntBits(f1) + Double.doubleToLongBits(d) +
                                Double.doubleToLongBits(d1) + i4 + i5 + i6 + FuzzerUtils.checkSum(lArr);
                            return;
                        }
                    }
                    f1 += (i4 + i3);
                    Test.iArrFld[(int)(d1 - 1)] *= i4;
                    if (true) break;
                } while (--i4 > 0);
            }
        } else {
            lArr[(3 >>> 1) % N] = (long)d;
        }
        vMeth1_check_sum += i3 + by + Float.floatToIntBits(f1) + Double.doubleToLongBits(d) +
            Double.doubleToLongBits(d1) + i4 + i5 + i6 + FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth(int i2, long l, float f) {

        short s=-18747;
        int i7=22543, i8=59, i9=7, i10=-81, i11=6;
        double d2=123.11554;
        boolean b=true;
        byte by1=29;
        long lArr1[][]=new long[N][N];

        FuzzerUtils.init(lArr1, 1471108749590531433L);

        vMeth1();
        s -= (short)i2;
        for (i7 = 12; 333 > i7; i7++) {
            i2 += -13;
            for (d2 = 1; d2 < 5; d2++) {
                i10 = 1;
                do {
                    i2 += (-31098 + (i10 * i10));
                    i2 <<= (int)l;
                    b = false;
                    i8 = (int)-28174L;
                } while (++i10 < 2);
                switch ((int)((d2 % 10) + 66)) {
                case 66:
                    switch ((((10 >>> 1) % 4) * 5) + 16) {
                    case 27:
                        by1 -= (byte)f;
                        i2 *= 6088;
                        Test.instanceCount += (long)d2;
                        break;
                    case 32:
                        if (true) continue;
                    case 30:
                        i11 -= (int)Test.instanceCount;
                        break;
                    case 33:
                        i9 = i7;
                        break;
                    }
                    break;
                case 67:
                case 68:
                    by1 += (byte)i9;
                    break;
                case 69:
                    i9 += (int)(((d2 * i2) + i2) - i9);
                    break;
                case 70:
                    l += 12905;
                    break;
                case 71:
                    b = b;
                case 72:
                    if (b) break;
                    break;
                case 73:
                    i8 += i7;
                    break;
                case 74:
                    lArr1[i7][(int)(d2 - 1)] <<= i7;
                    break;
                case 75:
                    i2 -= s;
                    break;
                default:
                    Test.iArrFld[i7 + 1] = (int)l;
                }
            }
        }
        long meth_res = i2 + l + Float.floatToIntBits(f) + s + i7 + i8 + Double.doubleToLongBits(d2) + i9 + i10 + (b ?
            1 : 0) + by1 + i11 + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i, int i1) {

        boolean b1=true;
        int i12=39, i13=35, i14=-34, i15=-221;

        if (b1) {
            i = (int)Math.abs(Test.instanceCount -= iMeth(i, Test.instanceCount, 0.433F));
            Test.iArrFld[(i1 >>> 1) % N] += (int)Test.instanceCount;
        }
        for (i12 = 270; i12 > 10; --i12) {
            for (i14 = 1; i14 < 6; i14 += 3) {
                switch (((i >>> 1) % 2) + 77) {
                case 77:
                    if (b1) {
                        i13 = -6538;
                        if (i12 != 0) {
                            vMeth_check_sum += i + i1 + (b1 ? 1 : 0) + i12 + i13 + i14 + i15;
                            return;
                        }
                        Test.instanceCount <<= Test.instanceCount;
                        i1 += (i14 | i13);
                    } else if (true) {
                        if (b1) {
                            Test.iArrFld[i14] += i15;
                            i1 += -6;
                        }
                        Test.instanceCount += (i14 * Test.byFld);
                    }
                case 78:
                    i = i;
                    break;
                default:
                    i1 = i13;
                }
            }
        }
        vMeth_check_sum += i + i1 + (b1 ? 1 : 0) + i12 + i13 + i14 + i15;
    }

    public void mainTest(String[] strArr1) {

        int i16=25, i17=63175, i18=36375, i19=6693, i20=5, i21=-28, i22=4316, i23=-8, i24=-113, i25=4, i26=-42378,
            i27=20823;
        long l1=-3355886337L;
        double d3=1.44836;

        vMeth(iFld, iFld);
        Test.instanceCount = 11;
        i16 = 332;
        while (--i16 > 0) {
            iFld += (i16 + iFld);
            for (i17 = 4; i17 < 76; i17++) {
                try {
                    Test.iArrFld[i16 + 1] = (-47970 % i16);
                    i18 = (Test.iArrFld[i17 - 1] / -31);
                    i18 = (-45708 % i16);
                } catch (ArithmeticException a_e) {}
            }
            i18 += iFld;
            iFld = i18;
            i18 *= (int)Test.instanceCount;
            Test.instanceCount += (-7 + (i16 * i16));
            iFld *= 13;
            for (i19 = 1; i19 < 76; i19++) {
                Test.fArrFld = Test.fArrFld;
                for (l1 = 1; l1 < 2; l1++) {
                    Test.iArrFld = Test.iArrFld;
                    Test.iArrFld[i16] += (int)Test.instanceCount;
                    Test.instanceCount += (27979 + (l1 * l1));
                    i21 += i21;
                    Test.instanceCount = (long)105.1015F;
                }
                i20 -= i17;
            }
            if (bFld) break;
        }
        for (i22 = 10; i22 < 233; i22++) {
            for (i24 = 4; i24 < 113; ++i24) {
                i18 >>>= (int)-10L;
                switch (((i24 % 5) * 5) + 1) {
                case 18:
                    for (i26 = 1; i26 < 2; ++i26) {
                        switch ((((i27 >>> 1) % 5) * 5) + 56) {
                        case 74:
                            i27 += (((i26 * Test.fFld) + i23) - i26);
                            d3 = Test.instanceCount;
                            i21 <<= -5;
                            break;
                        case 66:
                            i18 += (-4 + (i26 * i26));
                        case 70:
                            d3 -= i16;
                        case 73:
                            Test.fFld = l1;
                            break;
                        case 81:
                            Test.fFld += i26;
                            break;
                        }
                    }
                    break;
                case 2:
                    Test.instanceCount += (i24 - i26);
                    break;
                case 14:
                    try {
                        i20 = (i26 / i21);
                        Test.iArrFld[i22] = (Test.iArrFld[i22] / 28601);
                        i27 = (i25 % Test.iArrFld[i22 + 1]);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 3:
                    Test.instanceCount += i17;
                    break;
                case 22:
                    if (bFld) continue;
                    break;
                }
            }
        }

        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 i20 l1 = " + i19 + "," + i20 + "," + l1);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 d3 = " + i27 + "," + Double.doubleToLongBits(d3));

        FuzzerUtils.out.println("Test.instanceCount Test.byFld iFld = " + Test.instanceCount + "," + Test.byFld + "," +
            iFld);
        FuzzerUtils.out.println("bFld Test.fFld Test.iArrFld = " + (bFld ? 1 : 0) + "," +
            Float.floatToIntBits(Test.fFld) + "," + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}