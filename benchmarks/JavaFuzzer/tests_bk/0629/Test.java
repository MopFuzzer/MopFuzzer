// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:09 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3030762621280963070L;
    public float fFld=13.724F;
    public double dFld=2.59847;
    public static boolean bFld=false;
    public static short sFld=-3229;
    public static volatile long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 81L);
        FuzzerUtils.init(Test.iArrFld, 39644);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i8) {

        int i9=34883, i10=-1, i11=-3, i12=6, i13=188, i14=-237, i15=-31934, iArr[]=new int[N];
        boolean b=true;

        FuzzerUtils.init(iArr, -24436);

        for (i9 = 1; i9 < 345; i9++) {
            i8 += i9;
            Test.instanceCount += (i9 * i9);
            try {
                i8 = (-101 / i9);
                i8 = (i10 / iArr[i9 - 1]);
                i8 = (i8 / -47399);
            } catch (ArithmeticException a_e) {}
            i11 = (int)Test.instanceCount;
            for (i12 = 1; i12 < 5; i12 += 3) {
                for (i14 = i9; i14 < 5; ++i14) {
                    b = b;
                    i13 -= i8;
                    i8 -= (int)-709303659L;
                    if (i11 != 0) {
                        vMeth2_check_sum += i8 + i9 + i10 + i11 + i12 + i13 + i14 + i15 + (b ? 1 : 0) +
                            FuzzerUtils.checkSum(iArr);
                        return;
                    }
                }
            }
            i10 += -117;
            b = false;
            Test.lArrFld[i9 - 1] = Test.instanceCount;
            i8 = i14;
        }
        vMeth2_check_sum += i8 + i9 + i10 + i11 + i12 + i13 + i14 + i15 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(int i3, int i4, int i5) {

        int i6=54122, i7=12, i16=-11, i17=-226, i18=2272, i19=-127, iArr1[][]=new int[N][N];
        double d=2.69770;
        float f=1.512F;
        boolean b1=true;

        FuzzerUtils.init(iArr1, 37446);

        for (i6 = 3; i6 < 397; ++i6) {
            d = 43241;
            vMeth2(i7);
            i7 <<= i7;
            i3 += (int)Test.instanceCount;
            Test.instanceCount += (long)f;
            for (i16 = i6; i16 < 4; ++i16) {
                i3 &= i17;
                if (b1) {
                    switch (((i6 % 10) * 5) + 3) {
                    case 36:
                        for (i18 = i6; i18 < 1; ++i18) {
                            Test.instanceCount = Test.instanceCount;
                            Test.instanceCount = (long)d;
                        }
                    case 29:
                        if (b1) break;
                        f = i6;
                        break;
                    case 45:
                        d = Test.instanceCount;
                        break;
                    case 16:
                        iArr1[i16 - 1][i16 + 1] *= (int)Test.instanceCount;
                        break;
                    case 19:
                        iArr1[i6][i16 - 1] = i3;
                        break;
                    case 7:
                        d = Test.instanceCount;
                    case 33:
                        i4 += i6;
                        break;
                    case 15:
                        Test.lArrFld[i16] = (long)f;
                        break;
                    case 39:
                        iArr1[i6] = FuzzerUtils.int1array(N, (int)-252);
                        break;
                    case 10:
                        i19 >>= (int)Test.instanceCount;
                        break;
                    }
                } else if (false) {
                    i17 = (int)40.727F;
                } else if (b1) {
                    d *= Test.instanceCount;
                } else {
                    iArr1[i6 + 1][i6 - 1] = (int)10L;
                }
            }
        }
        vMeth1_check_sum += i3 + i4 + i5 + i6 + i7 + Double.doubleToLongBits(d) + Float.floatToIntBits(f) + i16 + i17 +
            i18 + i19 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i) {

        int i1=-14, i2=26885, i20=6, i21=31871, i22=98, i23=34959, i24=-193;
        long l=66L;
        float f1=22.742F;
        byte by=-122;

        for (i1 = 5; 357 > i1; i1++) {
            vMeth1(i1, i1, 248);
            for (l = 1; l < 5; l++) {
                i20 = i2;
                i += (int)l;
            }
            switch (((i1 % 2) * 5) + 116) {
            case 120:
                f1 *= i20;
                for (i21 = 1; i21 < 5; i21++) {
                    i20 += (i21 | i1);
                    i20 = i2;
                    f1 /= 232;
                    Test.instanceCount += i21;
                    for (i23 = i21; i23 < 2; i23++) {
                        f1 -= l;
                        by += (byte)(-33116 + (i23 * i23));
                    }
                }
                break;
            case 123:
                Test.iArrFld[i1 - 1] >>= i21;
                break;
            }
        }
        vMeth_check_sum += i + i1 + i2 + l + i20 + Float.floatToIntBits(f1) + i21 + i22 + i23 + i24 + by;
    }

    public void mainTest(String[] strArr1) {

        int i25=-8, i26=13, i27=125, i28=-201, i29=-4, i30=64930, i31=-40, i32=173;
        byte by1=91;
        double d1=1.50928;

        vMeth(i25);
        i25 += i25;
        Test.instanceCount += Test.instanceCount;
        for (i26 = 3; i26 < 277; ++i26) {
            i27 += by1;
            i27 += (((i26 * i26) + Test.instanceCount) - fFld);
            i27 = i27;
            i25 -= (int)Test.instanceCount;
            dFld += Test.instanceCount;
            i25 += i26;
            for (i28 = 92; i28 > 2; i28 -= 2) {
                Test.iArrFld[i26] /= 21578;
                i27 /= (int)((long)(fFld) | 1);
                for (i30 = 3; i30 > i28; i30 -= 2) {
                    i27 += (((i30 * Test.instanceCount) + i25) - Test.instanceCount);
                    i25 += (i30 * i30);
                    Test.bFld = Test.bFld;
                    i27 *= (int)Test.instanceCount;
                    i27 += (((i30 * i30) + Test.sFld) - fFld);
                    Test.instanceCount += (((i30 * i30) + i28) - i28);
                    if (Test.bFld) {
                        try {
                            Test.iArrFld[i26 - 1] = (Test.iArrFld[i30 - 1] % i29);
                            i27 = (Test.iArrFld[i28] / -28905693);
                            i25 = (i25 % i27);
                        } catch (ArithmeticException a_e) {}
                    } else {
                        fFld += i30;
                        dFld = -2.760F;
                        Test.bFld = Test.bFld;
                    }
                    Test.iArrFld[i26] = i26;
                    i25 = by1;
                }
                for (d1 = 1; d1 < 3; d1++) {
                    i27 ^= i27;
                    fFld += by1;
                }
            }
        }

        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("by1 i28 i29 = " + by1 + "," + i28 + "," + i29);
        FuzzerUtils.out.println("i30 i31 d1 = " + i30 + "," + i31 + "," + Double.doubleToLongBits(d1));
        FuzzerUtils.out.println("i32 = " + i32);

        FuzzerUtils.out.println("Test.instanceCount fFld dFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(fFld) + "," + Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("Test.bFld Test.sFld Test.lArrFld = " + (Test.bFld ? 1 : 0) + "," + Test.sFld + "," +
            FuzzerUtils.checkSum(Test.lArrFld));
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(Test.iArrFld));

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