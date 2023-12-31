// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:17 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=47071L;
    public static double dFld=-64.47804;
    public static byte byFld=60;
    public static boolean bFld=false;
    public int iFld=-20428;
    public static short sFld=-23636;
    public static int iArrFld[][]=new int[N][N];
    public long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 1);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i5, float f) {

        int i6=30375, i7=-42628, i8=-251, i9=-61416, i10=7, i11=-1, i12=-1, iArr[]=new int[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 3710);
        FuzzerUtils.init(lArr, -8L);

        for (i6 = 1; i6 < 251; ++i6) {
            i5 += (int)2.104745;
            i7 = i5;
        }
        f += i6;
        for (i8 = 7; i8 < 164; ++i8) {
            Test.instanceCount = i7;
            iArr[i8 - 1] += (int)f;
            i10 = 1;
            do {
                Test.dFld = 26362;
                Test.instanceCount += (((i10 * i8) + i10) - Test.byFld);
                lArr[i10] -= 9;
                Test.instanceCount += (i10 * i10);
                for (i11 = 1; i11 < 2; i11++) {
                    int i13=64;
                    i13 += (i11 * i11);
                    if (Test.bFld) continue;
                }
            } while ((i10 += 2) < 10);
        }
        vMeth2_check_sum += i5 + Float.floatToIntBits(f) + i6 + i7 + i8 + i9 + i10 + i11 + i12 +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1(int i4) {

        float f1=-94.5F;
        int i14=7, i15=-79, i16=62133;

        vMeth2(i4, f1);
        Test.iArrFld[(i4 >>> 1) % N][(-5 >>> 1) % N] = i4;
        i14 = 1;
        while (++i14 < 365) {
            i4 += (int)Test.instanceCount;
            for (i15 = 1; i15 < 5; i15++) {
                i4 <<= i16;
                i4 = (int)Test.instanceCount;
                i4 = i4;
            }
        }
        i4 <<= (int)Test.instanceCount;
        i4 = i4;
        Test.iArrFld[(i16 >>> 1) % N] = Test.iArrFld[(i4 >>> 1) % N];
        Test.instanceCount = Test.instanceCount;
        Test.byFld = (byte)i15;
        i16 = 80;
        Test.iArrFld[(i15 >>> 1) % N] = Test.iArrFld[(i4 >>> 1) % N];
        vMeth1_check_sum += i4 + Float.floatToIntBits(f1) + i14 + i15 + i16;
    }

    public static void vMeth(int i1, int i2) {

        int i3=14;

        i3 = 1;
        while (++i3 < 380) {
            vMeth1(i3);
        }
        vMeth_check_sum += i1 + i2 + i3;
    }

    public void mainTest(String[] strArr1) {

        int i=-3, i17=35745, i18=-139, i19=-63715, i20=11;
        float f2=-1.582F;

        i = 1;
        while (++i < 180) {
            vMeth(i, i);
            switch (((i % 5) * 5) + 74) {
            case 95:
                lArrFld[i] = i;
                iFld = iFld;
                iFld += -1595;
                break;
            case 92:
                iFld = (int)f2;
                iFld += i;
                break;
            case 80:
                if (Test.bFld) {
                    f2 += (i + iFld);
                    iFld -= (int)Test.instanceCount;
                } else if (Test.bFld) {
                    Test.iArrFld[i + 1][i - 1] -= iFld;
                    Test.dFld *= i;
                }
                for (i17 = 139; i17 > 2; --i17) {
                    iFld += (i17 ^ (long)f2);
                    for (i19 = 1; i19 < 2; ++i19) {
                        iFld += i20;
                        Test.instanceCount += (((i19 * i20) + i17) - i);
                        Test.iArrFld[i19][i19] ^= i17;
                        Test.sFld <<= (short)Test.instanceCount;
                        i20 >>= i;
                    }
                    i20 *= (int)Test.instanceCount;
                    Test.iArrFld[i17 - 1][i] = i17;
                    i20 += 57;
                    Test.instanceCount <<= Test.instanceCount;
                    i18 <<= i;
                    i18 -= i17;
                    Test.instanceCount += (((i17 * i19) + i19) - i);
                }
            case 76:
                i20 = (int)-76.25639;
                break;
            case 86:
                iFld = i17;
                break;
            }
        }

        FuzzerUtils.out.println("i f2 i17 = " + i + "," + Float.floatToIntBits(f2) + "," + i17);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);

        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.byFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(Test.dFld) + "," + Test.byFld);
        FuzzerUtils.out.println("Test.bFld iFld Test.sFld = " + (Test.bFld ? 1 : 0) + "," + iFld + "," + Test.sFld);
        FuzzerUtils.out.println("Test.iArrFld lArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            FuzzerUtils.checkSum(lArrFld));

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
