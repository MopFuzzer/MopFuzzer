// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:15 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-6774145295962536381L;
    public static float fFld=1.243F;
    public static short sFld=16750;
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 126.143F);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i11=-16, i12=93, i13=4108, i14=12, i15=203, i16=-6, iArr[][]=new int[N][N], iArr1[]=new int[N];
        double d=19.113220;
        byte by1=10, byArr[]=new byte[N];
        float f=1.192F;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -16550L);
        FuzzerUtils.init(iArr, -119);
        FuzzerUtils.init(byArr, (byte)25);
        FuzzerUtils.init(iArr1, 0);

        for (i11 = 1; i11 < 191; i11++) {
            switch (((i11 % 9) * 5) + 127) {
            case 160:
                for (i13 = 1; i13 < 8; ++i13) {
                    for (i15 = 1; i15 < 2; ++i15) {
                        i16 += i15;
                        i16 += (int)d;
                        lArr1[i13] >>= Test.instanceCount;
                        i16 = i15;
                        i16 *= by1;
                        iArr[i11][i11 - 1] += 172;
                        iArr[i13 + 1][i11] >>= i15;
                        Test.instanceCount = i14;
                        i14 *= (int)Test.instanceCount;
                        i12 = by1;
                    }
                    iArr[i11][i11] -= (int)f;
                }
            case 147:
                byArr[i11] += (byte)Test.instanceCount;
                break;
            case 156:
                try {
                    i12 = (60746 / i15);
                    i14 = (iArr1[i11 - 1] % -184);
                    i12 = (0 / i11);
                } catch (ArithmeticException a_e) {}
                break;
            case 128:
                i12 += 8;
                break;
            case 136:
                i12 = i14;
                break;
            case 129:
            case 157:
                i12 = (int)d;
                break;
            case 140:
                by1 += (byte)f;
                break;
            case 170:
                iArr[i11 + 1][i11 - 1] *= i14;
            }
        }
        vMeth1_check_sum += i11 + i12 + i13 + i14 + i15 + i16 + Double.doubleToLongBits(d) + by1 +
            Float.floatToIntBits(f) + FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i8, int i9, int i10) {

        int i18=61398, i19=37912, i20=-11, i21=11, iArr2[][]=new int[N][N];
        byte by2=-110;
        float fArr[]=new float[N];
        long lArr2[]=new long[N];

        FuzzerUtils.init(iArr2, 193);
        FuzzerUtils.init(fArr, -45.889F);
        FuzzerUtils.init(lArr2, -21807L);

        vMeth1();
        Test.fFld -= i8;
        Test.instanceCount += i10;
        iArr2[(i9 >>> 1) % N][(-88 >>> 1) % N] *= (int)Test.fFld;
        switch (((i10 >>> 1) % 4) + 51) {
        case 51:
            for (i18 = 9; i18 < 298; i18++) {
                fArr[i18 + 1] *= i18;
                i19 >>= i19;
                try {
                    i9 = (i18 / i8);
                    i8 = (i9 / iArr2[i18][i18 - 1]);
                    iArr2[i18][i18] = (i9 / -53627);
                } catch (ArithmeticException a_e) {}
                by2 = (byte)-52274;
                for (i20 = 1; i20 < 6; ++i20) {
                    by2 = (byte)i8;
                    i19 += (i20 * i20);
                    Test.fFld += (9L + (i20 * i20));
                    i19 *= i21;
                }
            }
            break;
        case 52:
            i9 = Test.sFld;
            break;
        case 53:
            Test.fFld *= (float)0.36388;
            break;
        case 54:
            i19 = (int)Test.instanceCount;
            break;
        default:
            i8 *= Test.sFld;
        }
        vMeth_check_sum += i8 + i9 + i10 + i18 + i19 + by2 + i20 + i21 + FuzzerUtils.checkSum(iArr2) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr2);
    }

    public static long lMeth(long l, int i6) {

        int i7=-10, i22=-1, i23=-28315, i24=15788, i25=1, i26=131;
        double d1=1.4356;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 22652L);

        lArr[(i6 >>> 1) % N] -= i6;
        i7 = 1;
        while (++i7 < 249) {
            i6 <<= i6;
            vMeth(1, i6, i7);
            for (i22 = 1; 7 > i22; i22++) {
                d1 = -11L;
                i23 += 22383;
                for (i24 = 1; 2 > i24; i24 += 2) {
                    i23 <<= i6;
                    Test.fFld += i24;
                    Test.instanceCount = i7;
                    i25 >>= i22;
                    Test.sFld -= (short)i23;
                    i26 *= i7;
                    Test.fArrFld[i7 - 1] -= i25;
                }
            }
        }
        long meth_res = l + i6 + i7 + i22 + i23 + Double.doubleToLongBits(d1) + i24 + i25 + i26 +
            FuzzerUtils.checkSum(lArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-61, i1=185, i2=0, i3=-108, i4=-11844, i5=-9, i27=-215, i28=115, i29=-46, i30=-54023, iArr3[]=new int[N];
        short s=-31707;
        boolean b=true;
        double d2=1.17906;
        long lArr3[]=new long[N];

        FuzzerUtils.init(iArr3, -150);
        FuzzerUtils.init(lArr3, -12L);

        for (i = 18; i < 351; ++i) {
            for (i2 = 1; i2 < 76; ++i2) {
                for (i4 = i; 2 > i4; i4++) {
                    byte by=-74;
                    i3 -= Math.max(i1 >>= Math.abs(i3), i1);
                    by ^= (byte)(s + lMeth(Test.instanceCount, i5));
                    try {
                        i1 = (-425000026 / i4);
                        i1 = (i / i2);
                        i3 = (i3 % 20);
                    } catch (ArithmeticException a_e) {}
                    try {
                        iArr3[i - 1] = (-36709 / i1);
                        iArr3[i + 1] = (iArr3[i - 1] / iArr3[i]);
                        i5 = (i3 / i5);
                    } catch (ArithmeticException a_e) {}
                }
                switch ((i % 7) + 62) {
                case 62:
                    Test.fFld = -12705L;
                    Test.instanceCount = 26;
                    i1 = (int)Test.instanceCount;
                    break;
                case 63:
                    i3 += i4;
                    i27 = 1;
                    do {
                        iArr3 = iArr3;
                    } while (++i27 < 2);
                    iArr3[i2 - 1] *= 32548;
                    break;
                case 64:
                    b = false;
                    for (i28 = 1; i28 < 2; ++i28) {
                        i5 = i1;
                        d2 -= Test.fFld;
                        i1 += (i28 + i);
                    }
                    break;
                case 65:
                    lArr3[i] |= i27;
                    i5 += (i2 + Test.fFld);
                    break;
                case 66:
                    Test.instanceCount += (((i2 * i1) + Test.fFld) - i27);
                    i5 += (-31682 + (i2 * i2));
                case 67:
                    i29 >>= (int)Test.instanceCount;
                    i30 = 1;
                    do {
                        Test.instanceCount += (i30 * Test.fFld);
                        i1 <<= 12;
                        i5 <<= i27;
                        i5 += i30;
                    } while (++i30 < 2);
                    break;
                case 68:
                    i1 = i27;
                    break;
                default:
                    s >>= (short)i29;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i4 i5 = " + i3 + "," + i4 + "," + i5);
        FuzzerUtils.out.println("s i27 b = " + s + "," + i27 + "," + (b ? 1 : 0));
        FuzzerUtils.out.println("i28 i29 d2 = " + i28 + "," + i29 + "," + Double.doubleToLongBits(d2));
        FuzzerUtils.out.println("i30 iArr3 lArr3 = " + i30 + "," + FuzzerUtils.checkSum(iArr3) + "," +
            FuzzerUtils.checkSum(lArr3));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.sFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.sFld);
        FuzzerUtils.out.println("Test.fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
