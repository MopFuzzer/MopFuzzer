// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:55 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=4L;
    public int iFld=13;
    public static int iFld1=22552;
    public static double dFld=1.44285;
    public static byte byFld=114;
    public static short sFld=-28864;
    public boolean bFld=false;
    public static volatile int iArrFld[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, 121);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l) {

        float f=119.891F, f1=2.659F;
        int i5=-22804, i6=-12586, i7=-4, i8=92;
        boolean b=true;

        f *= f;
        for (i5 = 10; 342 > i5; ++i5) {
            for (f1 = 1; f1 < 5; ++f1) {
                switch (((i7 >>> 1) % 5) + 80) {
                case 80:
                    i8 = 1;
                    do {
                        switch ((int)((f1 % 2) + 78)) {
                        case 78:
                            f *= i8;
                        case 79:
                            i6 |= i8;
                            i6 += (i8 * i8);
                            Test.iArrFld[(int)(f1)][i8 - 1] >>= (int)l;
                            break;
                        default:
                            b = b;
                            Test.iArrFld[(int)(f1 + 1)][i8] *= (int)l;
                            i6 = (int)Test.instanceCount;
                            i7 = i8;
                        }
                    } while (++i8 < 2);
                    try {
                        Test.iArrFld[(int)(f1)][(i5 >>> 1) % N] = (17978 / i6);
                        i7 = (Test.iArrFld[(i6 >>> 1) % N][i5] / i6);
                        i6 = (i5 / -1677783289);
                    } catch (ArithmeticException a_e) {}
                case 81:
                    i6 += (int)(f1 * i6);
                    break;
                case 82:
                    f -= -46655L;
                    break;
                case 83:
                    i6 = (int)3L;
                    break;
                case 84:
                    Test.iArrFld[(int)(f1 - 1)][(int)(f1)] <<= Test.iFld1;
                    break;
                default:
                    if (i7 != 0) {
                        vMeth1_check_sum += l + Float.floatToIntBits(f) + i5 + i6 + Float.floatToIntBits(f1) + i7 + i8
                            + (b ? 1 : 0);
                        return;
                    }
                }
            }
        }
        vMeth1_check_sum += l + Float.floatToIntBits(f) + i5 + i6 + Float.floatToIntBits(f1) + i7 + i8 + (b ? 1 : 0);
    }

    public static void vMeth(int i2) {

        int i3=-26103, i4=-4438, i9=-35, i10=-120, i11=-11, i12=-1, i13=-9;
        byte by=72;
        short s=30627;

        for (i3 = 3; i3 < 170; ++i3) {
            if (((-(Test.instanceCount * by)) + (-(i2 - i3))) < i4) continue;
            vMeth1(Test.instanceCount);
            if (true) continue;
            i2 <<= i3;
            for (i9 = 1; 9 > i9; ++i9) {
                s += (short)(i9 + i9);
            }
            i10 += (i3 * i3);
            i2 += (i3 | Test.iFld1);
        }
        for (i11 = 8; 336 > i11; ++i11) {
            i13 = 1;
            while ((i13 += 3) < 5) {
                boolean b1=false;
                b1 = b1;
                i4 = Test.iFld1;
            }
            i12 = (int)Test.instanceCount;
        }
        i2 >>= (int)Test.instanceCount;
        vMeth_check_sum += i2 + i3 + i4 + by + i9 + i10 + s + i11 + i12 + i13;
    }

    public static int iMeth(int i, int i1) {

        int i14=-28215, i15=-4, i16=96, i17=89, i18=33675, i19=-134;
        byte by1=-65;
        float f2=85.481F;

        vMeth(-5180);
        for (i14 = 169; i14 > 9; i14 -= 3) {
            i15 = (int)Test.instanceCount;
            if (i != 0) {
            }
            for (i16 = i14; 29 > i16; ++i16) {
                for (i18 = 1; i18 < 1; ++i18) {
                    i17 += (((i18 * Test.instanceCount) + i19) - i17);
                    i <<= i19;
                    try {
                        i19 = (13940 / i16);
                        i15 = (104 / i19);
                        Test.iArrFld[i16 - 1][i16 - 1] = (i1 % -11877);
                    } catch (ArithmeticException a_e) {}
                    by1 += (byte)i19;
                    Test.iArrFld[i18 - 1][i16] = (int)Test.instanceCount;
                    f2 += Test.iFld1;
                    i17 = i19;
                }
                Test.instanceCount += i15;
                Test.dFld -= i1;
            }
        }
        long meth_res = i + i1 + i14 + i15 + i16 + i17 + i18 + i19 + by1 + Float.floatToIntBits(f2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i20=45310, i21=1, i22=-7, i23=12, i24=12, i25=-11, i26=-56677, i27=8, i28=-14331;
        float f3=2.762F, fArr[]=new float[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 46053L);
        FuzzerUtils.init(fArr, 0.43F);

        iFld = (int)(lArr[(iFld >>> 1) % N] = iMeth(Test.iFld1, Test.iFld1));
        for (i20 = 13; i20 < 272; ++i20) {
            i21 += (21 + (i20 * i20));
            Test.byFld += (byte)(((i20 * Test.iFld1) + f3) - i21);
            Test.instanceCount ^= iFld;
            i21 = i20;
        }
        i22 = 287;
        do {
            lArr[i22] += Test.iFld1;
            Test.instanceCount += i22;
            iFld -= 115;
            Test.iFld1 = (int)Test.dFld;
        } while ((i22 -= 2) > 0);
        Test.instanceCount = (long)1.946F;
        for (i23 = 4; i23 < 264; ++i23) {
            i21 = Test.iFld1;
            Test.instanceCount >>= Test.instanceCount;
            for (i25 = 97; i25 > 3; i25 -= 2) {
                i21 >>= iFld;
                for (i27 = 3; i27 > 1; i27 -= 2) {
                    fArr[i23 - 1] = i22;
                    Test.instanceCount -= i21;
                    Test.instanceCount -= i22;
                    switch (((i27 % 9) * 5) + 61) {
                    case 62:
                        lArr[i23 - 1] -= i21;
                        Test.dFld -= i28;
                        try {
                            i28 = (-106 % i26);
                            i21 = (i25 / i25);
                            i26 = (i25 / -2742);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 104:
                        iFld -= -11;
                        f3 += ((long)i27 | (long)Test.sFld);
                        Test.instanceCount += (((i27 * Test.instanceCount) + Test.instanceCount) - i20);
                        break;
                    case 72:
                        Test.dFld *= Test.dFld;
                        Test.iArrFld[i23 + 1][i23 - 1] *= i27;
                        break;
                    case 106:
                        iFld = (int)Test.dFld;
                    case 85:
                        if (bFld) break;
                        break;
                    case 84:
                        Test.instanceCount += Test.iFld1;
                        break;
                    case 75:
                        Test.iArrFld[i25 + 1] = Test.iArrFld[i25];
                        break;
                    case 97:
                        Test.instanceCount += (9187 + (i27 * i27));
                        break;
                    case 78:
                        iFld <<= (int)Test.instanceCount;
                        break;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i20 i21 f3 = " + i20 + "," + i21 + "," + Float.floatToIntBits(f3));
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("i28 lArr fArr = " + i28 + "," + FuzzerUtils.checkSum(lArr) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount iFld Test.iFld1 = " + Test.instanceCount + "," + iFld + "," +
            Test.iFld1);
        FuzzerUtils.out.println("Test.dFld Test.byFld Test.sFld = " + Double.doubleToLongBits(Test.dFld) + "," +
            Test.byFld + "," + Test.sFld);
        FuzzerUtils.out.println("bFld Test.iArrFld = " + (bFld ? 1 : 0) + "," + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
