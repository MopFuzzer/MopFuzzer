// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:03 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=5673836648447485810L;
    public static float fFld=3.592F;
    public static byte byFld=-25;
    public static volatile double dFld=0.119163;
    public static short sFld=32151;
    public static volatile int iFld=49;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 139);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth1(int i3) {

        float f=69.83F;

        i3 = (int)(i3 += (int)((f - i3) * (480 - Test.instanceCount)));
        i3 ^= i3;
        Test.instanceCount = (long)(Test.iArrFld[(i3 >>> 1) % N] + Math.abs(++f));
        vMeth1_check_sum += i3 + Float.floatToIntBits(f);
    }

    public static void vMeth2(int i7, long l) {

        long l1=-2680281573725821849L, lArr1[]=new long[N];
        int i8=153, i9=13, i10=-47, i11=-203, i12=42527, i13=41241, i14=20836;
        short s=12962;
        double d=0.18875;
        float fArr[]=new float[N];

        FuzzerUtils.init(lArr1, -5521L);
        FuzzerUtils.init(fArr, 35.1020F);

        for (l1 = 13; l1 < 349; ++l1) {
            for (i9 = 5; i9 > 1; i9--) {
                for (i11 = 1; i11 < 2; ++i11) {
                    i7 = 119;
                    Test.instanceCount += (((i11 * i10) + s) - i12);
                    d += i7;
                    Test.fFld *= Test.instanceCount;
                    lArr1[i11 - 1] *= (long)Test.fFld;
                    i12 = i8;
                    l -= i12;
                }
                Test.fFld -= i10;
                fArr[i9] -= 0.236F;
            }
        }
        for (i13 = 6; i13 < 156; ++i13) {
            i14 -= 99;
            i14 >>>= i9;
        }
        vMeth2_check_sum += i7 + l + l1 + i8 + i9 + i10 + i11 + i12 + s + Double.doubleToLongBits(d) + i13 + i14 +
            FuzzerUtils.checkSum(lArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static int iMeth(float f1, int i6) {

        int i15=-35270, i16=14350, i17=-230, i18=4, i19=64414, i20=-30645;
        short s1=-19570;
        long lArr2[][]=new long[N][N];

        FuzzerUtils.init(lArr2, 246L);

        vMeth2(i6, Test.instanceCount);
        for (i15 = 130; i15 > 3; i15--) {
            if (true) {
                for (i17 = 1; i17 < 12; i17 += 2) {
                    Test.instanceCount += i16;
                    switch (((i15 % 2) * 5) + 3) {
                    case 9:
                        lArr2[i17 + 1][i15 + 1] += -51;
                        break;
                    case 4:
                        Test.byFld >>= (byte)38222;
                    default:
                        i6 *= s1;
                        i16 += (i17 * i17);
                    }
                    for (i19 = 1; i19 < 3; ++i19) {
                        Test.byFld += (byte)(-3461 + (i19 * i19));
                        Test.iArrFld[i17 - 1] -= (int)Test.instanceCount;
                        i20 = s1;
                        Test.instanceCount -= (long)Test.dFld;
                    }
                }
            } else {
                Test.instanceCount += (((i15 * i17) + f1) - i19);
            }
        }
        long meth_res = Float.floatToIntBits(f1) + i6 + i15 + i16 + i17 + i18 + s1 + i19 + i20 +
            FuzzerUtils.checkSum(lArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i2) {

        int i4=235, i5=-1, i21=113, i22=2, iArr[]=new int[N];
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(iArr, -188);
        FuzzerUtils.init(lArr, 2948168046L);

        iArr = FuzzerUtils.int1array(N, (int)6);
        vMeth1(i2);
        lArr[(-8 >>> 1) % N][(i2 >>> 1) % N] = i2;
        Test.fFld = Test.byFld;
        for (i4 = 8; i4 < 199; i4++) {
            boolean b=false;
            lArr[i4][i4 + 1] -= ((-Math.abs(-45)) * ((++i5) - (i2 * 4)));
            if (b) {
                i5 >>= iMeth(Test.fFld, -2633);
                i2 *= 226;
                i5 += (int)Test.dFld;
            } else {
                for (i21 = 1; 8 > i21; i21++) {
                    if (true) continue;
                }
                i2 = i5;
                i5 -= i5;
            }
            Test.instanceCount += (((i4 * i21) + i5) - Test.instanceCount);
        }
        vMeth_check_sum += i2 + i4 + i5 + i21 + i22 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i=-1, i1=7, i23=-13, i24=-66, i25=16918, i26=7, i27=12, i28=47780, i29=-1376, i30=-41413, i31=140;
        boolean b1=true;
        long lArr3[]=new long[N];

        FuzzerUtils.init(lArr3, 82L);

        for (i = 3; i < 189; i++) {
            vMeth(i1);
            lArr3[i] = (long)Test.dFld;
            for (i23 = 5; i23 < 135; i23++) {
                i1 += (i23 | (long)Test.fFld);
                i24 *= 58050;
                if (b1) continue;
                for (i25 = 2; i25 > 1; --i25) {
                    Test.fFld = i26;
                    Test.dFld = i26;
                    i1 = Test.sFld;
                    Test.fFld = 0.581F;
                    i1 = (int)Test.fFld;
                    i24 = i;
                }
                for (i27 = 2; i27 > 1; i27--) {
                    Test.instanceCount %= (i23 | 1);
                    Test.instanceCount = 3;
                }
                i24 += (i23 * Test.sFld);
                Test.instanceCount += (i23 * i23);
                for (i29 = 1; i29 < 2; ++i29) {
                    i30 *= i31;
                    Test.iArrFld[i] += Test.sFld;
                    i30 <<= i23;
                    i1 %= (int)(i30 | 1);
                    Test.dFld = Test.fFld;
                    Test.iArrFld = Test.iArrFld;
                    Test.sFld = (short)i24;
                    Test.instanceCount -= Test.instanceCount;
                    Test.instanceCount += (((i29 * Test.instanceCount) + Test.instanceCount) - Test.fFld);
                }
                try {
                    i31 = (i29 / Test.iFld);
                    Test.iArrFld[i + 1] = (18496 / Test.iFld);
                    i24 = (1011342098 / Test.iArrFld[i]);
                } catch (ArithmeticException a_e) {}
            }
        }

        FuzzerUtils.out.println("i i1 i23 = " + i + "," + i1 + "," + i23);
        FuzzerUtils.out.println("i24 b1 i25 = " + i24 + "," + (b1 ? 1 : 0) + "," + i25);
        FuzzerUtils.out.println("i26 i27 i28 = " + i26 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("i29 i30 i31 = " + i29 + "," + i30 + "," + i31);
        FuzzerUtils.out.println("lArr3 = " + FuzzerUtils.checkSum(lArr3));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.byFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.byFld);
        FuzzerUtils.out.println("Test.dFld Test.sFld Test.iFld = " + Double.doubleToLongBits(Test.dFld) + "," +
            Test.sFld + "," + Test.iFld);
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
