// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:50 2023
public class Test0818 {

    public static final int N = 400;

    public static long instanceCount=-2838230653L;
    public boolean bFld=true;
    public static boolean bFld1=false;
    public static int iFld=35;
    public static byte byFld=-7;
    public int iFld1=80;
    public static short sFld=20420;
    public static volatile int[] iArrFld =new int[N];
    public static byte[] byArrFld =new byte[N];

    static {
        FuzzerUtils.init(Test0818.iArrFld, 154);
        FuzzerUtils.init(Test0818.byArrFld, (byte) 18);
    }

    public static long bMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1() {

        int i9=17421;
        int i10=-56495;
        int i11=6;
        int i12=-59099;
        int i13=-11;
        int[] iArr =new int[N];
        double d1=52.5391;
        float f3=-2.571F;
        short s=-25420;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(lArr1, 87L);
        FuzzerUtils.init(iArr, -31866);

        Test0818.bFld1 = Test0818.bFld1;
        Test0818.instanceCount = Test0818.iFld;
        switch ((((Test0818.iFld >>> 1) % 8) * 5) + 11) {
        case 37:
            Test0818.iFld *= (int) Test0818.instanceCount;
            break;
        case 34:
            for (i9 = 3; i9 < 125; i9++) {
                i11 = 1;
                while (++i11 < 13) {
                    double d=-26.49222;
                    i10 = (int)d;
                    d += i10;
                    Test0818.iFld += (((i11 * Test0818.instanceCount) + i11) - Test0818.iFld);
                    i10 += i11;
                    for (i12 = 1; i12 > 1; i12 -= 3) {
                        if (Test0818.bFld1) break;
                        lArr1[i11 - 1] = i9;
                        i13 -= (int) Test0818.instanceCount;
                        i13 += (i12 * i12);
                    }
                }
            }
        case 44:
            Test0818.instanceCount -= i11;
            break;
        case 45:
            iArr[(i11 >>> 1) % N] += i11;
        case 28:
            d1 /= -159;
            break;
        case 46:
            d1 += i12;
            break;
        case 29:
            Test0818.iFld = (int) f3;
            break;
        case 35:
            i10 = i11;
            break;
        default:
            Test0818.instanceCount >>= s;
        }
        long meth_res = i9 + i10 + i11 + i12 + i13 + Double.doubleToLongBits(d1) + Float.floatToIntBits(f3) + s +
            FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i3, int i4) {

        int i5=-184;
        int i6=27523;
        int i7=24786;
        int i8=31169;
        int i14=4;
        int[][] iArr1 =new int[N][N];
        float f2=-61.298F;
        double d2=-1.61036;
        long l1=-3595677021L;
        long[][] lArr2 =new long[N][N];

        FuzzerUtils.init(lArr2, -11L);
        FuzzerUtils.init(iArr1, 4);

        i4 = (int) Test0818.instanceCount;
        for (i5 = 7; i5 < 134; ++i5) {
            for (i7 = 1; i7 < 12; i7++) {
                f2 = i8;
                f2 += (++i6);
                iMeth1();
                Test0818.iArrFld[i7 - 1] = (int) Test0818.instanceCount;
                i14 = 1;
                while (++i14 < 2) {
                    switch (((i5 % 8) * 5) + 54) {
                    case 66:
                        i6 += i14;
                    case 87:
                        Test0818.instanceCount += i3;
                        lArr2[i7] = lArr2[i7 + 1];
                        Test0818.instanceCount += i14;
                        break;
                    case 83:
                        Test0818.iArrFld = Test0818.iArrFld;
                    case 90:
                        i6 /= (int)((long)(d2) | 1);
                        break;
                    case 69:
                        iArr1 = iArr1;
                        break;
                    case 62:
                        if (i14 != 0) {
                        }
                        break;
                    case 91:
                        lArr2[i14 + 1][i14] = i6;
                    case 60:
                        Test0818.instanceCount -= 3366778495L;
                    default:
                        Test0818.instanceCount ^= l1;
                    }
                }
            }
        }
        long meth_res = i3 + i4 + i5 + i6 + i7 + i8 + Float.floatToIntBits(f2) + i14 + Double.doubleToLongBits(d2) + l1
            + FuzzerUtils.checkSum(lArr2) + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static boolean bMeth(int i2, float f1) {

        short s2=-4594;
        short[] sArr =new short[N];
        int i15=46895, i16=-2;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, 1968243911368077641L);
        FuzzerUtils.init(sArr, (short)6573);

        for (long l : lArr) {
            i2 = i2;
            i2 = (int) Test0818.instanceCount;
            iMeth(Test0818.iFld, Test0818.iFld);
        }
        Test0818.instanceCount *= Test0818.instanceCount;
        for (short s1 : sArr) {
            if (Test0818.bFld1) break;
            lArr = lArr;
            i2 = Test0818.byFld;
            Test0818.bFld1 = Test0818.bFld1;
            Test0818.instanceCount -= Test0818.iFld;
        }
        i2 = s2;
        for (i15 = 4; 250 > i15; i15++) {
            Test0818.iFld += (i15 * i15);
        }
        Test0818.bFld1 = Test0818.bFld1;
        long meth_res = i2 + Float.floatToIntBits(f1) + s2 + i15 + i16 + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(sArr);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public void mainTest(String[] strArr1) {

        int i=5, i1=-25472, i17=31373, i18=60717, i19=-104, i20=14, i21=19009, i22=150;
        float f=-67.426F;

        for (i = 3; i < 269; ++i) {
            i1 <<= (int) ((11 - (-(Test0818.instanceCount - f))) - (i1 + (i1 + Test0818.instanceCount)));
            Test0818.instanceCount += i;
            switch ((i % 2) + 65) {
            case 65:
                f += i;
                bFld = bMeth(Test0818.iFld, f);
                break;
            case 66:
                Test0818.instanceCount %= (Test0818.iFld | 1);
                i1 <<= i1;
                break;
            }
            for (i17 = i; i17 < 94; i17++) {
                switch ((i17 % 5) + 46) {
                case 46:
                    iFld1 &= i1;
                    Test0818.iFld = i1;
                    break;
                case 47:
                    i1 = i;
                    for (i19 = i; i19 < 1; ++i19) {
                        f = Test0818.instanceCount;
                        Test0818.instanceCount -= i20;
                        Test0818.iArrFld[i17 + 1] -= i1;
                        Test0818.sFld += (short) (((i19 * Test0818.instanceCount) + Test0818.instanceCount) - i20);
                        Test0818.instanceCount = i;
                        switch (((i >>> 1) % 2) + 61) {
                        case 61:
                            Test0818.iArrFld[i19 - 1] += Test0818.sFld;
                            break;
                        case 62:
                            Test0818.sFld = (short) f;
                            if (Test0818.bFld1) continue;
                            Test0818.sFld = (short) i1;
                            break;
                        default:
                            Test0818.iArrFld[i17] = i1;
                            Test0818.instanceCount += (i19 ^ i20);
                        }
                    }
                    for (i21 = 1; i21 < 1; ++i21) {
                        i20 = Test0818.sFld;
                        bFld = bFld;
                        i1 += i21;
                    }
                case 48:
                    f += i17;
                    break;
                case 49:
                    Test0818.sFld = Test0818.byFld;
                case 50:
                    Test0818.iFld = -10;
                    break;
                default:
                    Test0818.byArrFld[i - 1] -= (byte) i18;
                }
            }
        }

        FuzzerUtils.out.println("i i1 f = " + i + "," + i1 + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);

        FuzzerUtils.out.println("Test0818.instanceCount bFld Test0818.bFld1 = " + Test0818.instanceCount + "," + (bFld ? 1 : 0) +
                "," + (Test0818.bFld1 ? 1 : 0));
        FuzzerUtils.out.println("Test0818.iFld Test0818.byFld iFld1 = " + Test0818.iFld + "," + Test0818.byFld + "," + iFld1);
        FuzzerUtils.out.println("Test0818.sFld Test0818.iArrFld Test0818.byArrFld = " + Test0818.sFld + "," +
                FuzzerUtils.checkSum(Test0818.iArrFld) + "," + FuzzerUtils.checkSum(Test0818.byArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0818 _instance = new Test0818();
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
//DEBUG  bMeth ->  bMeth mainTest
//DEBUG  iMeth ->  iMeth bMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth bMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
