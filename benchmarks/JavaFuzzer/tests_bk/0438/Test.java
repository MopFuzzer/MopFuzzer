// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:04 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-10L;
    public static short sFld=6996;
    public static boolean bFld=false;
    public static double dFld=-118.47526;
    public static volatile float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 116.411F);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1() {

        byte by=52;
        int i9=-18413, i10=-4, i11=3, i12=-2655, iArr2[]=new int[N];

        FuzzerUtils.init(iArr2, 0);

        by <<= (byte)Test.instanceCount;
        for (i9 = 14; 288 > i9; i9++) {
            iArr2[i9 - 1] >>= (int)Test.instanceCount;
            if (Test.bFld) {
                i10 *= i10;
                Test.instanceCount &= i9;
            } else if (Test.bFld) {
                if (i10 != 0) {
                }
                i10 = i9;
                try {
                    i10 = (i10 % -209);
                    i10 = (-192 % i10);
                    i10 = (i10 % -1622363729);
                } catch (ArithmeticException a_e) {}
                i10 += i10;
            } else if (Test.bFld) {
                if (Test.bFld) continue;
                for (i11 = 1; i11 < 6; ++i11) {
                    if (Test.bFld) continue;
                    Test.instanceCount += 7740348171192453299L;
                    i10 += (((i11 * Test.instanceCount) + i9) - Test.instanceCount);
                }
            } else {
                Test.bFld = true;
            }
        }
        long meth_res = by + i9 + i10 + i11 + i12 + FuzzerUtils.checkSum(iArr2);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i5, int i6, double d) {

        int i7=-14, i8=-36541, i13=2, i14=-48763, i15=93, i16=8, iArr1[]=new int[N];
        float f1=1.626F;

        FuzzerUtils.init(iArr1, 5);

        i6 = iArr1[(i5 >>> 1) % N];
        i6 += (int)((Test.fArrFld[(i6 >>> 1) % N] * (--i6)) + (-i6));
        iArr1 = (iArr1 = FuzzerUtils.int1array(N, (int)39));
        i6 = i5;
        for (i7 = 11; i7 < 209; ++i7) {
            Test.fArrFld[i7] += (iMeth1() - i7);
            for (i13 = 1; i13 < 8; ++i13) {
                i14 -= (int)f1;
                for (i15 = 1; 2 > i15; ++i15) {
                    int i17=-12;
                    i16 = i15;
                    i8 /= (int)(i16 | 1);
                    i14 += (i15 * i5);
                    d = i7;
                    i8 -= i17;
                    try {
                        i17 = (-43492 / i5);
                        i17 = (i8 / -169);
                        i6 = (i6 % i5);
                    } catch (ArithmeticException a_e) {}
                }
            }
        }
        long meth_res = i5 + i6 + Double.doubleToLongBits(d) + i7 + i8 + i13 + i14 + Float.floatToIntBits(f1) + i15 +
            i16 + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i1, float f, int i2) {

        boolean b=true;
        int i3=14, i4=35903, i18=14, i19=-5, i20=-118, i21=-6, iArr[]=new int[N];
        double d1=-98.111358;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)31606);
        FuzzerUtils.init(iArr, -12);

        b = (((Test.instanceCount >>> Test.sFld) - Test.fArrFld[(i2 >>> 1) % N]) != (++Test.instanceCount));
        i1 <<= (i1++);
        for (i3 = 144; i3 > 6; i3 -= 3) {
            i2 -= sArr[i3 + 1];
            iArr[i3] <<= iMeth(i3, i1, d1);
            for (i18 = 2; i18 < 33; i18++) {
                for (i20 = 1; 2 > i20; i20++) {
                    f -= i19;
                    i21 <<= i1;
                    switch ((i3 % 2) + 52) {
                    case 52:
                        i1 ^= (int)Test.instanceCount;
                        i1 = i2;
                        break;
                    case 53:
                        d1 -= Test.instanceCount;
                        i21 = i2;
                        i19 = (int)-20261L;
                    default:
                        iArr[i18 + 1] += (int)Test.instanceCount;
                    }
                }
            }
        }
        vMeth_check_sum += i1 + Float.floatToIntBits(f) + i2 + (b ? 1 : 0) + i3 + i4 + Double.doubleToLongBits(d1) +
            i18 + i19 + i20 + i21 + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i=-14, i22=210, i23=8, i24=53470, i25=6, i26=-39160, i27=-56985, iArr3[]=new int[N];
        float f2=1.309F;
        byte by1=-34, byArr[]=new byte[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr3, -9);
        FuzzerUtils.init(lArr, -2283245148L);
        FuzzerUtils.init(byArr, (byte)-115);

        switch (((((i - i) >>> 1) % 6) * 5) + 64) {
        case 76:
            vMeth(i, f2, i);
            for (i22 = 9; i22 < 271; i22++) {
                switch ((i22 % 2) + 7) {
                case 7:
                    i -= i22;
                    break;
                case 8:
                    i23 -= i22;
                    Test.dFld = Test.instanceCount;
                    for (i24 = 1; 96 > i24; i24++) {
                        if (Test.bFld) break;
                        i23 += i24;
                        Test.instanceCount += i25;
                        f2 = (float)Test.dFld;
                        by1 += (byte)83;
                        if (Test.bFld) continue;
                        Test.instanceCount += i24;
                        iArr3[i22 - 1] = i25;
                        iArr3[i22] -= (int)Test.instanceCount;
                        for (i26 = i24; i26 < 2; ++i26) {
                            switch ((i22 % 2) + 40) {
                            case 40:
                                i27 &= i25;
                                i += (i26 - i26);
                                Test.bFld = Test.bFld;
                                i27 *= i;
                                break;
                            case 41:
                                lArr[i26 - 1] = -29071;
                                i23 -= (int)Test.dFld;
                                break;
                            default:
                                byArr[(i >>> 1) % N] = (byte)Test.instanceCount;
                                i27 += (((i26 * Test.instanceCount) + i24) - Test.instanceCount);
                                by1 = (byte)f2;
                            }
                            try {
                                i23 = (i27 / iArr3[i24 + 1]);
                                iArr3[i22] = (i % -100);
                                i25 = (-76 / i22);
                            } catch (ArithmeticException a_e) {}
                        }
                    }
                    i23 >>= i;
                    break;
                }
            }
            break;
        case 73:
            i25 = (int)Test.instanceCount;
        case 89:
            Test.fArrFld[(-226 >>> 1) % N] += (float)Test.dFld;
            break;
        case 86:
            i23 = i24;
            break;
        case 69:
            i27 *= (int)Test.instanceCount;
            break;
        case 91:
            Test.dFld -= Test.instanceCount;
            break;
        }

        FuzzerUtils.out.println("i f2 i22 = " + i + "," + Float.floatToIntBits(f2) + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("by1 i26 i27 = " + by1 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("iArr3 lArr byArr = " + FuzzerUtils.checkSum(iArr3) + "," + FuzzerUtils.checkSum(lArr)
            + "," + FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.bFld = " + Test.instanceCount + "," + Test.sFld +
            "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.dFld Test.fArrFld = " + Double.doubleToLongBits(Test.dFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
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
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}