// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:15 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-510851695311686651L;
    public static byte byFld=83;
    public float fFld=1.363F;
    public double dFld=118.78548;
    public static int iArrFld[]=new int[N];
    public static volatile long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -59160);
        FuzzerUtils.init(Test.lArrFld, 242537568L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i3) {

        int i4=7, i5=0, i6=-23573, i7=33916, i8=216;
        boolean b=false;
        float f=-81.407F;
        short s=21684;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 0L);

        for (i4 = 8; 211 > i4; ++i4) {
            switch (((i4 % 10) * 5) + 102) {
            case 106:
                i5 = i4;
                for (i6 = 1; i6 < 8; i6 += 2) {
                    i3 += i3;
                    b = b;
                    f = i7;
                }
                break;
            case 105:
                i3 *= i6;
                Test.iArrFld[i4] = (int)Test.instanceCount;
                i8 = 1;
                while (++i8 < 8) {
                    Test.instanceCount = Test.byFld;
                    switch ((((i8 >>> 1) % 8) * 5) + 63) {
                    case 88:
                        Test.iArrFld[i4 - 1] = (int)188L;
                        break;
                    case 83:
                        f += i8;
                        break;
                    case 86:
                        i3 -= s;
                        break;
                    case 101:
                        i3 += (((i8 * Test.instanceCount) + i6) - i3);
                        break;
                    case 98:
                        f += (i8 * i8);
                        break;
                    case 84:
                        i7 += i8;
                        break;
                    case 78:
                        i3 = i7;
                        break;
                    case 80:
                        i5 = 18485;
                        break;
                    }
                }
                break;
            case 137:
                f = f;
                break;
            case 130:
                Test.instanceCount <<= i3;
                break;
            case 113:
                f -= -14140L;
            case 149:
                i7 = 9;
                break;
            case 150:
                f += i4;
                break;
            case 129:
                i5 = (int)Test.instanceCount;
                break;
            case 108:
                Test.iArrFld[i4] = (int)Test.instanceCount;
            case 147:
                Test.instanceCount = 36;
                break;
            default:
                lArr[i4] -= i6;
            }
        }
        vMeth2_check_sum += i3 + i4 + i5 + i6 + i7 + (b ? 1 : 0) + Float.floatToIntBits(f) + i8 + s +
            FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1(int i2, double d) {

        int i9=12954, i10=138, i11=-4, i12=5, i13=-184;
        double d1=-7.28939;
        float f1=-126.530F;
        short s1=16846;

        i2 = i2;
        vMeth2(i2);
        i2 -= i2;
        for (i9 = 6; i9 < 335; i9 += 3) {
            Test.instanceCount -= (long)-2.807F;
            switch ((((-1593 >>> 1) % 10) * 5) + 13) {
            case 33:
                for (d1 = 1; 14 > d1; d1++) {
                    Test.instanceCount += (long)((long)d1 | Test.instanceCount);
                    for (i12 = 2; i12 > d1; --i12) {
                        i11 &= i2;
                        f1 += i12;
                        if (i13 != 0) {
                            vMeth1_check_sum += i2 + Double.doubleToLongBits(d) + i9 + i10 +
                                Double.doubleToLongBits(d1) + i11 + i12 + i13 + Float.floatToIntBits(f1) + s1;
                            return;
                        }
                        i2 += (((i12 * Test.instanceCount) + Test.byFld) - i2);
                        i13 = (int)Test.instanceCount;
                        if (i13 != 0) {
                            vMeth1_check_sum += i2 + Double.doubleToLongBits(d) + i9 + i10 +
                                Double.doubleToLongBits(d1) + i11 + i12 + i13 + Float.floatToIntBits(f1) + s1;
                            return;
                        }
                    }
                }
                break;
            case 32:
            case 47:
                Test.iArrFld[i9 + 1] = i12;
                break;
            case 18:
                i11 = i9;
                break;
            case 34:
                i10 += (int)f1;
            case 61:
                Test.instanceCount <<= s1;
                break;
            case 30:
            case 55:
            case 27:
                Test.instanceCount ^= i12;
                break;
            case 29:
                Test.instanceCount += (((i9 * Test.instanceCount) + i12) - i12);
                break;
            }
        }
        vMeth1_check_sum += i2 + Double.doubleToLongBits(d) + i9 + i10 + Double.doubleToLongBits(d1) + i11 + i12 + i13
            + Float.floatToIntBits(f1) + s1;
    }

    public static void vMeth(int i, int i1) {

        double d2=-2.72491;

        vMeth1(-12, d2);
        i = (int)-232L;
        vMeth_check_sum += i + i1 + Double.doubleToLongBits(d2);
    }

    public void mainTest(String[] strArr1) {

        int i14=-103, i15=-2, i16=14, i17=-89, i18=36, i19=-7;
        boolean b1=true;

        vMeth(i14, i14);
        for (i15 = 7; i15 < 152; ++i15) {
            if (b1) {
                i16 = -13281;
                switch ((i15 % 3) + 33) {
                case 33:
                    i14 += (i15 * i15);
                    i14 += (-12 + (i15 * i15));
                    fFld = i14;
                case 34:
                    i14 += (i15 | i15);
                case 35:
                    i16 += i15;
                    i16 -= Test.byFld;
                    Test.iArrFld = Test.iArrFld;
                    dFld = i14;
                    break;
                default:
                    i14 += (int)dFld;
                }
                b1 = b1;
                i16 = i14;
            } else {
                i17 = 1;
                while (++i17 < 173) {
                    for (i18 = 1; i18 > 1; i18 -= 3) {
                        Test.iArrFld[i15 + 1] = -61051;
                        Test.instanceCount >>= i18;
                        Test.byFld += (byte)(i18 - i16);
                        Test.instanceCount >>= i16;
                        switch (((i17 % 9) * 5) + 46) {
                        case 75:
                            b1 = b1;
                            Test.lArrFld = Test.lArrFld;
                            fFld = i15;
                            Test.byFld += (byte)i15;
                            break;
                        case 83:
                            i19 = Test.byFld;
                            break;
                        case 51:
                            Test.instanceCount >>>= i18;
                            i19 += (-13 + (i18 * i18));
                            break;
                        case 57:
                            i14 += (int)(32660L + (i18 * i18));
                            break;
                        case 48:
                            i16 = (int)Test.instanceCount;
                            break;
                        case 50:
                            i14 += (((i18 * i15) + Test.instanceCount) - i14);
                            break;
                        case 64:
                            Test.instanceCount = (long)-92.91F;
                            break;
                        case 73:
                            i19 = 22000;
                            break;
                        case 52:
                            i14 = (int)Test.instanceCount;
                            break;
                        default:
                            b1 = b1;
                        }
                    }
                }
            }
        }

        FuzzerUtils.out.println("i14 i15 i16 = " + i14 + "," + i15 + "," + i16);
        FuzzerUtils.out.println("b1 i17 i18 = " + (b1 ? 1 : 0) + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 = " + i19);

        FuzzerUtils.out.println("Test.instanceCount Test.byFld fFld = " + Test.instanceCount + "," + Test.byFld + "," +
            Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("dFld Test.iArrFld Test.lArrFld = " + Double.doubleToLongBits(dFld) + "," +
            FuzzerUtils.checkSum(Test.iArrFld) + "," + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
