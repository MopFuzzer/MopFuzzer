// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:55 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-56L;
    public static volatile short sFld=9140;
    public static float fFld=88.1000F;
    public static long lArrFld[]=new long[N];
    public int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];
    public static int iArrFld1[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 27618L);
        FuzzerUtils.init(Test.fArrFld, -1.898F);
        FuzzerUtils.init(Test.iArrFld1, -10);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l, int i7, int i8) {

        byte by=-63;
        int i9=11226, i10=-30513, i11=129, i12=30, i13=-10, i14=-44;
        float f=0.646F;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 0.44761);

        Test.instanceCount = 31940;
        by >>>= (byte)i7;
        for (i9 = 143; i9 > 3; i9 -= 3) {
            f = 1;
            do {
                switch (((i9 >>> 1) % 2) + 95) {
                case 95:
                    i10 = 183;
                    i7 -= by;
                    for (i11 = 1; i11 > 1; --i11) {
                        i10 += (i11 * Test.instanceCount);
                    }
                    i10 = 8;
                    break;
                case 96:
                    i10 *= i12;
                    for (i13 = 1; i13 < 1; ++i13) {
                        i7 += (i13 | i8);
                        i7 <<= (int)1958519595L;
                        dArr[i9] -= 27214;
                    }
                default:
                    Test.fFld -= i9;
                }
            } while (++f < 33);
        }
        vMeth1_check_sum += l + i7 + i8 + by + i9 + i10 + Float.floatToIntBits(f) + i11 + i12 + i13 + i14 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static long lMeth(int i3, int i4) {

        int i5=-63100, i6=-115, iArr[]=new int[N];

        FuzzerUtils.init(iArr, -137);

        Test.sFld >>= (short)Test.instanceCount;
        for (i5 = 11; i5 < 213; ++i5) {
            iArr[i5 + 1] -= (i4++);
        }
        i3 *= iArr[(i4 >>> 1) % N];
        vMeth1(Test.instanceCount, i4, i5);
        Test.instanceCount = -25740548L;
        i3 += i3;
        i3 = (int)Test.instanceCount;
        i6 |= i4;
        i4 = i3;
        long meth_res = i3 + i4 + i5 + i6 + FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i2) {

        int i15=-25361, i16=-149, i17=-34421, i18=-20438, i19=61046, i20=-125, iArr1[]=new int[N], iArr2[][]=new
            int[N][N];
        byte by1=104;
        float f1=75.307F, f2=-2.781F;
        double d=-2.93198;
        boolean b=false;

        FuzzerUtils.init(iArr1, 59892);
        FuzzerUtils.init(iArr2, -165);

        i2 = (int)(i2 - (lMeth(i2, i2) * i2));
        for (i15 = 14; i15 < 255; i15++) {
            by1 += (byte)i15;
            switch ((i15 % 6) + 58) {
            case 58:
                for (f1 = 1; f1 < 7; ++f1) {
                    switch ((i15 % 8) + 7) {
                    case 7:
                        i17 += (int)((long)f1 | i16);
                        switch (((i15 >>> 1) % 5) + 120) {
                        case 120:
                            for (i18 = 1; i18 < 2; ++i18) {
                                d *= Test.instanceCount;
                            }
                            Test.instanceCount += (long)(((f1 * Test.instanceCount) + Test.instanceCount) - i17);
                            for (f2 = f1; 2 > f2; ++f2) {
                                Test.instanceCount *= 9;
                                Test.instanceCount = i19;
                            }
                            break;
                        case 121:
                            iArr1[i15] /= (int)((long)(Test.fFld) | 1);
                        case 122:
                            i20 -= (int)Test.fFld;
                        case 123:
                            i2 += (int)81.14F;
                            break;
                        case 124:
                            i2 += (int)(f1 * f1);
                            break;
                        default:
                            if (i18 != 0) {
                                vMeth_check_sum += i2 + i15 + i16 + by1 + Float.floatToIntBits(f1) + i17 + i18 + i19 +
                                    Double.doubleToLongBits(d) + Float.floatToIntBits(f2) + i20 + (b ? 1 : 0) +
                                    FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(iArr2);
                                return;
                            }
                        }
                        break;
                    case 8:
                        d *= f1;
                        break;
                    case 9:
                        i2 += i20;
                    case 10:
                        Test.instanceCount += i17;
                    case 11:
                        iArr1[i15] += 161;
                        break;
                    case 12:
                        Test.lArrFld[i15 + 1] -= i2;
                        break;
                    case 13:
                        Test.instanceCount *= Test.instanceCount;
                        break;
                    case 14:
                        Test.instanceCount = i15;
                        break;
                    }
                }
                break;
            case 59:
                if (b) break;
            case 60:
                iArr2 = FuzzerUtils.int2array(N, (int)-2);
                break;
            case 61:
                Test.instanceCount = by1;
                break;
            case 62:
                iArr2[i15][i15 - 1] = i20;
            case 63:
                by1 = (byte)i20;
            default:
                i19 += (i15 * i15);
            }
        }
        vMeth_check_sum += i2 + i15 + i16 + by1 + Float.floatToIntBits(f1) + i17 + i18 + i19 +
            Double.doubleToLongBits(d) + Float.floatToIntBits(f2) + i20 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i=-8, i1=-36694, i21=-10, i22=-30;
        byte by2=99;
        float f3=-49.186F, f4=6.338F;
        boolean b1=false;

        for (i = 7; i < 213; ++i) {
            vMeth(i1);
            Test.fFld += i;
            Test.lArrFld[i] = i;
            Test.instanceCount %= 9;
            iArrFld = iArrFld;
            i1 += (((i * Test.instanceCount) + i) - by2);
            i1 -= i;
            i21 = 1;
            do {
                double d1=96.16685;
                iArrFld = iArrFld;
                switch (((i % 2) * 5) + 14) {
                case 20:
                    Test.fFld = Test.instanceCount;
                    i1 += (int)Test.instanceCount;
                    d1 = i21;
                    for (f3 = 1; f3 < 1; f3++) {
                        i22 <<= (int)Test.instanceCount;
                        Test.instanceCount *= i;
                        switch (((i1 >>> 1) % 4) + 87) {
                        case 87:
                            iArrFld = iArrFld;
                            switch (((i % 8) * 5) + 116) {
                            case 131:
                                Test.fFld -= (float)d1;
                                break;
                            case 120:
                                b1 = b1;
                                Test.sFld += (short)f3;
                                break;
                            case 122:
                                Test.instanceCount -= (long)f4;
                                b1 = b1;
                                i22 = (int)f4;
                                i1 = (int)1.949F;
                                break;
                            case 153:
                                Test.fArrFld[(int)(f3)] = Test.instanceCount;
                                break;
                            case 123:
                                Test.instanceCount = by2;
                                iArrFld[i - 1] >>= i;
                                break;
                            case 144:
                                iArrFld[i] -= i21;
                            case 149:
                                by2 = (byte)Test.instanceCount;
                                break;
                            case 155:
                                Test.instanceCount = 4;
                                break;
                            default:
                                i22 += (int)(f3 * f3);
                            }
                        case 88:
                            b1 = b1;
                        case 89:
                            Test.fArrFld[(int)(f3 - 1)] += i;
                        case 90:
                            Test.fFld = i;
                        default:
                            Test.sFld = (short)-47;
                        }
                    }
                    break;
                case 19:
                    by2 += (byte)(((i21 * i22) + i21) - i22);
                default:
                    Test.iArrFld1[i21 + 1] -= by2;
                }
            } while (++i21 < 122);
        }

        FuzzerUtils.out.println("i i1 by2 = " + i + "," + i1 + "," + by2);
        FuzzerUtils.out.println("i21 f3 i22 = " + i21 + "," + Float.floatToIntBits(f3) + "," + i22);
        FuzzerUtils.out.println("b1 f4 = " + (b1 ? 1 : 0) + "," + Float.floatToIntBits(f4));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.fFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.lArrFld iArrFld Test.fArrFld = " + FuzzerUtils.checkSum(Test.lArrFld) + "," +
            FuzzerUtils.checkSum(iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));
        FuzzerUtils.out.println("Test.iArrFld1 = " + FuzzerUtils.checkSum(Test.iArrFld1));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}