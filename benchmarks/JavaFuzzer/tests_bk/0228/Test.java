// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:58 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-5L;
    public static short sFld=18675;
    public static boolean bFld=true;
    public static double dFld=1.13582;
    public static double dArrFld[]=new double[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 2.103588);
        FuzzerUtils.init(Test.lArrFld, -46716L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i7, int i8, long l) {

        int i9=10, i10=10869, i11=-11, i12=-15309, i13=-63, i14=-13;
        long l1=-3910125841L;
        float fArr[]=new float[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(fArr, -31.958F);
        FuzzerUtils.init(dArr, 115.87069);

        i7 = 706;
        for (i9 = 6; i9 < 360; i9++) {
            i7 = i7;
            i11 = 1;
            while (++i11 < 5) {
                i8 += i11;
                l /= (long)-43.216F;
                for (l1 = 1; l1 < 1; l1++) {
                    i7 += (int)(((l1 * i10) + l1) - i10);
                    fArr[(int)(l1 + 1)] = l1;
                    dArr[i9 + 1] = i9;
                    i8 *= (int)-1.884F;
                    i7 += (int)l1;
                }
                for (i13 = 1; i13 < 1; ++i13) {
                    i10 -= i7;
                    i14 -= 29;
                }
            }
        }
        long meth_res = i7 + i8 + l + i9 + i10 + i11 + l1 + i12 + i13 + i14 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(boolean b) {

        int i6=-9, i15=8, i16=25626, i17=-175, i18=156, i19=4, i20=-156, i21=-6, iArr[]=new int[N];
        float f=82.127F;
        double d=59.11749, d1=-38.95992;
        short sArr[]=new short[N];

        FuzzerUtils.init(iArr, 39198);
        FuzzerUtils.init(sArr, (short)31727);

        Test.sFld = (short)((Math.max(Test.instanceCount, Test.instanceCount) + iArr[(i6 >>> 1) % N]) + iMeth1(i6, i6,
            Test.instanceCount));
        f -= i6;
        for (d = 8; d < 247; d++) {
            d1 -= -55;
            if (i15 != 0) {
                vMeth_check_sum += (b ? 1 : 0) + i6 + Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i15 +
                    Double.doubleToLongBits(d1) + i16 + i17 + i18 + i19 + i20 + i21 + FuzzerUtils.checkSum(iArr) +
                    FuzzerUtils.checkSum(sArr);
                return;
            }
            sArr[(int)(d)] -= (short)i15;
        }
        Test.sFld = (short)Test.instanceCount;
        Test.instanceCount *= i15;
        for (i16 = 3; 161 > i16; ++i16) {
            for (i18 = 10; i18 > 1; --i18) {
                Test.instanceCount = -36;
            }
            i15 += i18;
            for (i20 = 1; i20 < 10; i20++) {
                i15 -= (int)d1;
                i6 += i18;
            }
        }
        vMeth_check_sum += (b ? 1 : 0) + i6 + Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i15 +
            Double.doubleToLongBits(d1) + i16 + i17 + i18 + i19 + i20 + i21 + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(sArr);
    }

    public static int iMeth(int i2, int i3, int i4) {

        int i5=-1, i22=139, i23=-11, i24=102, i25=-65495;
        float f1=-16.313F;

        i5 = 1;
        while (++i5 < 250) {
            vMeth(Test.bFld);
            i3 = (int)f1;
            i3 += (i5 * i5);
            for (i22 = 1; 7 > i22; ++i22) {
                if (Test.bFld) {
                    i2 = i3;
                    for (i24 = 1; i24 < 2; i24++) {
                        i2 -= 64;
                        switch (((5 >>> 1) % 3) + 73) {
                        case 73:
                            i23 = (int)Test.dFld;
                            i23 = -24145;
                            break;
                        case 74:
                            f1 += i24;
                            Test.instanceCount = i24;
                            Test.dArrFld[i5] -= i24;
                            break;
                        case 75:
                            i2 <<= i24;
                            break;
                        }
                    }
                } else if (Test.bFld) {
                    i4 |= -15288;
                } else {
                    Test.sFld -= (short)-11;
                }
            }
        }
        long meth_res = i2 + i3 + i4 + i5 + Float.floatToIntBits(f1) + i22 + i23 + i24 + i25;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=156, i1=-11, i26=-17, i27=-5, i28=0, i29=-19402, i30=42531, i31=1, i32=11, iArr1[]=new int[N];
        float f2=1.307F;

        FuzzerUtils.init(iArr1, 132);

        for (i = 14; i < 368; ++i) {
            Test.instanceCount -= (((i - i) - (i - -14)) - iMeth(i1, -58771, i));
            if (Test.bFld) {
                for (i26 = 1; i26 < 71; i26++) {
                    long l2=-59L;
                    for (i28 = i26; i28 < 2; ++i28) {
                        i27 -= i27;
                        f2 -= i26;
                        i27 *= i29;
                        i27 += (i28 * i28);
                    }
                    Test.instanceCount += l2;
                    i30 = 1;
                    do {
                        i1 += (i30 | i1);
                        switch ((i30 % 1) + 124) {
                        case 124:
                            Test.instanceCount += i30;
                            break;
                        default:
                            i29 -= -82;
                            iArr1[i + 1] -= i30;
                        }
                        i1 += i26;
                    } while (++i30 < 2);
                    i27 += (i26 + i26);
                    try {
                        iArr1[i26 - 1] = (i27 % i26);
                        i1 = (i28 / i);
                        i29 = (iArr1[i] % -215);
                    } catch (ArithmeticException a_e) {}
                    Test.instanceCount -= i1;
                    l2 /= (Test.instanceCount | 1);
                    i1 += i26;
                    Test.dArrFld[(i30 >>> 1) % N] -= Test.instanceCount;
                    for (i31 = i26; 2 > i31; ++i31) {
                        i29 += -12;
                        Test.lArrFld[i + 1] += Test.sFld;
                        iArr1 = iArr1;
                        if (Test.bFld) {
                            i29 -= i30;
                            i32 >>= (int)-8L;
                        } else if (Test.bFld) {
                            l2 += (i31 + i27);
                        }
                    }
                }
            } else {
                i1 += (i * i);
            }
        }

        FuzzerUtils.out.println("i i1 i26 = " + i + "," + i1 + "," + i26);
        FuzzerUtils.out.println("i27 i28 i29 = " + i27 + "," + i28 + "," + i29);
        FuzzerUtils.out.println("f2 i30 i31 = " + Float.floatToIntBits(f2) + "," + i30 + "," + i31);
        FuzzerUtils.out.println("i32 iArr1 = " + i32 + "," + FuzzerUtils.checkSum(iArr1));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.bFld = " + Test.instanceCount + "," + Test.sFld +
            "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.dFld Test.dArrFld Test.lArrFld = " + Double.doubleToLongBits(Test.dFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)) + "," + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
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
//DEBUG  iMeth1 ->  iMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
