// Generated by Java* Fuzzer test generator (1.0.001). Sun May 23 02:22:16 2021
public class Test {

    public static final int N = 400;

    public static long instanceCount=-3724052306L;
    public static int iFld=98;
    public static double dFld=108.112610;
    public static boolean bFld=false;
    public static int[] iArrFld =new int[N];
    public static volatile float[] fArrFld =new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 19516);
        FuzzerUtils.init(Test.fArrFld, 0.13F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(byte by) {

        int i3=11, i4=14, i5=-17, i6=12;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, 64L);

        Test.instanceCount = Test.iFld;
        i3 = 1;
        while ((i3 += 3) < 337) {
            lArr[i3 - 1] *= (long)1.65048;
            lArr = lArr;
            for (i4 = 1; i4 < 14; i4++) {
                float f=-106.859F;
                f -= 0;
                Test.instanceCount = i4;
                i6 = 1;
                while (++i6 < 2) {
                    Test.dFld += i6;
                    i5 += (i6 * i6);
                    Test.instanceCount += (i6 + i3);
                    Test.iFld -= i6;
                    Test.iFld -= (int)Test.instanceCount;
                    Test.iFld += (i6 | i6);
                    Test.iArrFld[i6] *= (int)Test.dFld;
                }
            }
        }
        vMeth2_check_sum += by + i3 + i4 + i5 + i6 + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1() {

        byte by1=83;
        int i7=-150, i8=-52143, i9=-85;
        boolean b=false;

        Test.dFld = (-((Test.iFld - Test.instanceCount) + (Test.iFld - Test.iFld)));
        for (int i2 : Test.iArrFld) {
            vMeth2(by1);
            if (b) {
                Test.iArrFld[(Test.iFld >>> 1) % N] -= i2;
                i7 = 4;
                while (--i7 > 0) {
                    i2 += (i7 * i7);
                }
                Test.instanceCount = Test.iFld;
                Test.instanceCount /= -27;
            } else {
                i2 -= i2;
                for (i8 = 4; 1 < i8; i8--) {
                    Test.iArrFld[i8] -= i8;
                    Test.iArrFld[i8] = i2;
                    i2 = -214;
                    if (i2 != 0) {
                        vMeth1_check_sum += by1 + i7 + (b ? 1 : 0) + i8 + i9;
                        return;
                    }
                }
            }
        }
        vMeth1_check_sum += by1 + i7 + (b ? 1 : 0) + i8 + i9;
    }

    public static void vMeth() {

        int i=-101, i1=-7, i10=-6, i11=5849, i12=6, i13=-8, i14=108;
        short s=681;
        float f1=-11.558F;

        Test.iFld = Test.iFld;
        for (i = 11; i < 339; ++i) {
            vMeth1();
            Test.iFld *= (int)Test.instanceCount;
            s += (short)(((i * Test.instanceCount) + s) - i1);
        }
        Test.iFld *= Test.iFld;
        i10 = 1;
        do {
            for (i11 = 1; 5 > i11; ++i11) {
                Test.dFld += i1;
                for (i13 = i10; i13 < 2; ++i13) {
                    f1 += (i13 * i13);
                    switch ((i11 % 5) + 9) {
                    case 9:
                        Test.iFld = 1006;
                        break;
                    case 10:
                        Test.instanceCount += i1;
                        i1 ^= i13;
                    case 11:
                        i12 = (int)Test.instanceCount;
                        break;
                    case 12:
                        Test.iFld >>>= i10;
                    case 13:
                        Test.iFld -= 5203;
                        break;
                    }
                }
            }
        } while (++i10 < 333);
        vMeth_check_sum += i + i1 + s + i10 + i11 + i12 + i13 + i14 + Float.floatToIntBits(f1);
    }

    public void mainTest(String[] strArr1) {

        int i15=-8, i16=-8, i17=-48, i18=0, i19=14;
        float f2=103.684F;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(lArr1, 3619068619L);

        vMeth();
        if (Test.bFld) {
            for (i15 = 9; 280 > i15; i15++) {
                if (Test.bFld) {
                    i17 = 1;
                    do {
                        i18 += (int)(19897L + (i17 * i17));
                        Test.iFld <<= i17;
                    } while (++i17 < 93);
                } else if (Test.bFld) {
                    Test.iFld -= (int)Test.dFld;
                    Test.iFld += i15;
                    switch (((Test.iFld >>> 1) % 6) + 126) {
                    case 126:
                    case 127:
                        Test.instanceCount += (i15 ^ i16);
                        break;
                    case 128:
                        i18 += i16;
                        i16 <<= 33;
                        Test.instanceCount = Test.iFld;
                        break;
                    case 129:
                    case 130:
                        i19 = 1;
                        do {
                            lArr1[i19] *= Test.iFld;
                            i18 += i15;
                            switch (((i15 % 3) * 5) + 26) {
                            case 27:
                                i18 /= (int)(Test.iFld | 1);
                                lArr1[i19 + 1] = i19;
                                lArr1[i19] = i17;
                                Test.iFld = i16;
                                break;
                            case 34:
                                Test.instanceCount += -1;
                                i18 += (int)Test.instanceCount;
                                lArr1 = lArr1;
                                break;
                            case 39:
                                Test.iArrFld[i19] = (int)1.39143;
                                Test.iFld = (int)Test.instanceCount;
                                break;
                            default:
                                f2 += (i19 - Test.instanceCount);
                                i16 -= (int)f2;
                            }
                            i16 = (int)Test.instanceCount;
                        } while (++i19 < 93);
                    case 131:
                        Test.fArrFld[i15 - 1] -= f2;
                        break;
                    }
                } else {
                    Test.iFld += 70;
                }
            }
        } else {
            Test.instanceCount = i15;
        }

        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 i19 f2 = " + i18 + "," + i19 + "," + Float.floatToIntBits(f2));
        FuzzerUtils.out.println("lArr1 = " + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.dFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.bFld Test.iArrFld Test.fArrFld = " + (Test.bFld ? 1 : 0) + "," +
            FuzzerUtils.checkSum(Test.iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));

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
