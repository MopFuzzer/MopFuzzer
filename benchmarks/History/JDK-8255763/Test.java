// Generated by Java* Fuzzer test generator (1.0.001). Sun Nov  1 21:51:00 2020
public class Test {

    public static final int N = 400;

    public static long instanceCount=0L;
    public static double dFld=-43.89870;
    public static boolean bFld=false;
    public static int iFld=37887;
    public byte byFld=-77;
    public static float fFld=-1.55F;
    public static int iFld1=159;
    public static boolean[] bArrFld =new boolean[N];
    public int[] iArrFld =new int[N];
    public double[] dArrFld =new double[N];

    static {
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long dMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i3, long l, long l1) {

        int i4=-26719;
        int i5=-10;
        int i6=-25538;
        int i7=174;
        int i8=227;
        int[] iArr =new int[N];
        long l2=188L;
        long[] lArr =new long[N];
        boolean b1=true;
        byte by=64;

        FuzzerUtils.init(lArr, -3980549174L);
        FuzzerUtils.init(iArr, 5);

        i3 = -67;
        i4 = 1;
        while (++i4 < 242) {
            lArr[i4] <<= -44982;
            if (b1) {
                for (l2 = 1; l2 < 7; ++l2) {
                    i5 -= (int)l;
                    i6 = 1;
                    while (++i6 < 2) {
                        i3 += i6;
                    }
                    if (b1) break;
                    for (i7 = 1; i7 < 2; ++i7) {
                        iArr[i7 - 1] = i6;
                        i5 += i3;
                        l += i3;
                        Test.dFld += l2;
                        l = i8;
                    }
                }
            } else if (b1) {
                i3 ^= by;
            }
        }
        long meth_res = i3 + l + l1 + i4 + l2 + i5 + i6 + (b1 ? 1 : 0) + i7 + i8 + by + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i2, float f, boolean b) {

        int i9=13;
        int i10=-7;
        int i11=-9;
        int i12=8;
        int i13=51837;
        int i14=154;
        int i15=68;
        int[] iArr1 =new int[N];
        short s=-19426;
        double[] dArr =new double[N];

        FuzzerUtils.init(iArr1, 40);
        FuzzerUtils.init(dArr, -2.128342);

        f = (Test.instanceCount = iMeth(i2, Test.instanceCount, Test.instanceCount));
        for (i9 = 6; 268 > i9; ++i9) {
            i2 += 46380;
            i2 = (int)f;
            for (i11 = 1; i11 < 6; ++i11) {
                iArr1[i11] %= -128;
                dArr[i11] *= -94.462F;
                i13 = 1;
                while (++i13 < 2) {
                    s >>>= (short)i12;
                    i12 += i13;
                }
                f += i11;
                for (i14 = i11; i14 < 2; i14 += 2) {
                    iArr1 = iArr1;
                }
                i10 ^= (int)Test.instanceCount;
                i15 &= i14;
            }
        }
        vMeth_check_sum += i2 + Float.floatToIntBits(f) + (b ? 1 : 0) + i9 + i10 + i11 + i12 + i13 + s + i14 + i15 +
            FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static double dMeth() {

        float f1=0.340F;
        int i16=213;
        int i17=25335;
        int i18=-8;
        int i19=-187;
        int[] iArr2 =new int[N];

        FuzzerUtils.init(iArr2, 7);

        vMeth(139, f1, Test.bFld);
        Test.instanceCount -= Test.iFld;
        for (i16 = 8; i16 < 264; i16++) {
            for (i18 = 1; 6 > i18; i18++) {
                i19 <<= i16;
                switch (((i16 % 1) * 5) + 116) {
                case 119:
                    Test.instanceCount = i16;
                    i17 += (int)f1;
                    Test.instanceCount = i19;
                    Test.bArrFld[i18 + 1] = Test.bFld;
                }
                f1 = -22751;
            }
            switch ((i16 % 1) + 97) {
            case 97:
                iArr2 = FuzzerUtils.int1array(N, (int)58555);
                iArr2[i16 + 1] >>= (int)Test.instanceCount;
                iArr2[i16 + 1] = i17;
                break;
            }
        }
        long meth_res = Float.floatToIntBits(f1) + i16 + i17 + i18 + i19 + FuzzerUtils.checkSum(iArr2);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=3, i1=54172, i20=-1206, i21=26092, i22=-9480, i23=42397;
        short s1=-32062;
        long l3=-52013L;
        long l4=55058L;
        long[][] lArr1 =new long[N][N];

        FuzzerUtils.init(lArr1, -3361088997L);

        i = 1;
        do {
            switch ((i % 9) + 5) {
            case 5:
                switch ((i % 2) + 79) {
                case 79:
                    i1 += (i + i1);
                    break;
                case 80:
                }
            case 6:
                dMeth();
                Test.iFld *= (int)Test.instanceCount;
            case 7:
                Test.iFld = byFld;
                for (i20 = 6; i20 < 121; i20++) {
                    for (i22 = 1; i22 < 2; i22++) {
                        iArrFld[i22] += Test.iFld;
                        i23 -= i20;
                        Test.instanceCount += (((i22 * Test.fFld) + Test.instanceCount) - i20);
                        i23 = i20;
                        Test.instanceCount %= -8;
                        switch ((i % 6) + 93) {
                        case 93:
                            Test.instanceCount += (i22 - Test.instanceCount);
                            break;
                        case 94:
                            Test.instanceCount = i21;
                            i21 = (int)Test.instanceCount;
                            Test.fFld += i21;
                            try {
                                iArrFld[i] = (i21 / iArrFld[i - 1]);
                                i1 = (14621 % i1);
                                i21 = (-164 % i);
                            } catch (ArithmeticException a_e) {}
                            break;
                        case 95:
                        case 96:
                            i23 -= i23;
                            Test.bFld = Test.bFld;
                        case 97:
                            dArrFld[i] -= Test.iFld;
                            break;
                        case 98:
                            Test.instanceCount = Test.iFld1;
                            s1 = byFld;
                            break;
                        }
                        lArr1[i22][i22 - 1] *= (long)Test.dFld;
                        Test.iFld1 += (int)Test.instanceCount;
                        i1 = 191;
                    }
                    if (Test.bFld) break;
                }
                Test.iFld += (((i * Test.iFld1) + Test.instanceCount) - i23);
                break;
            case 8:
                l3 *= i;
                break;
            case 9:
                l4 -= 187;
            case 10:
                if (Test.bFld) break;
            case 11:
                i23 = byFld;
                break;
            case 12:
                i21 = Test.iFld;
                break;
            case 13:
                byFld ^= (byte)5361;
                break;
            default:
                Test.dFld += Test.iFld;
            }
        } while (++i < 207);

        FuzzerUtils.out.println("i i1 i20 = " + i + "," + i1 + "," + i20);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("s1 l3 l4 = " + s1 + "," + l3 + "," + l4);
        FuzzerUtils.out.println("lArr1 = " + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.bFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(Test.dFld) + "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.iFld byFld Test.fFld = " + Test.iFld + "," + byFld + "," +
            Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.iFld1 Test.bArrFld iArrFld = " + Test.iFld1 + "," +
            FuzzerUtils.checkSum(Test.bArrFld) + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("dArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
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
//DEBUG  dMeth ->  dMeth mainTest
//DEBUG  vMeth ->  vMeth dMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth dMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
