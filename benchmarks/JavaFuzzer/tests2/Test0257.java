// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:24 2023
public class Test0257 {

    public static final int N = 400;

    public static long instanceCount=-8921122015554327613L;
    public static int iFld=-9;
    public volatile double dFld=-36.113651;
    public static float fFld=-67.337F;
    public byte byFld=-83;
    public short sFld=11740;
    public int[] iArrFld =new int[N];
    public static long[][] lArrFld =new long[N][N];

    static {
        FuzzerUtils.init(Test0257.lArrFld, -4045885680934082732L);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vSmallMeth(double d, int i, int i1) {

        short s=27565;

        Test0257.iFld += ((s++) - Test0257.iFld);
        vSmallMeth_check_sum += Double.doubleToLongBits(d) + i + i1 + s;
    }

    public static void vMeth1(int i5) {

        int[][] iArr =new int[N][N];

        FuzzerUtils.init(iArr, -4);

        iArr[(i5 >>> 1) % N][(i5 >>> 1) % N] *= i5;
        i5 = (int) Test0257.fFld;
        vMeth1_check_sum += i5 + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth() {

        double d2=1.11304;
        int i6=95, i7=-47223, i8=-55336;

        vMeth1(27032);
        d2 = Test0257.iFld;
        i6 = 388;
        do {
            if (i6 != 0) {
                vMeth_check_sum += Double.doubleToLongBits(d2) + i6 + i7 + i8;
                return;
            }
            for (i7 = 1; i7 < 4; ++i7) {
                Test0257.fFld *= -1939L;
            }
            Test0257.iFld ^= (int) Test0257.instanceCount;
        } while (--i6 > 0);
        vMeth_check_sum += Double.doubleToLongBits(d2) + i6 + i7 + i8;
    }

    public long lMeth(int i2, double d1) {

        int i3=-3, i4=-4084, i9=-23, i10=60, i11=10, i12=-4, i13=-40374;

        for (i3 = 3; i3 < 249; i3++) {
            vMeth();
            i4 |= i4;
            i2 = (int) Test0257.instanceCount;
            if (i2 != 0) {
            }
            i4 -= Test0257.iFld;
            switch ((((i3 >>> 1) % 4) * 5) + 57) {
            case 62:
                iArrFld[i3 - 1] += Test0257.iFld;
                i9 = (int) Test0257.instanceCount;
                for (i10 = 1; i10 < 7; ++i10) {
                    i2 += (i10 * i10);
                    for (i12 = i3; i12 < 2; ++i12) {
                        byFld += (byte)dFld;
                        if (i13 != 0) {
                        }
                        Test0257.instanceCount -= i10;
                    }
                }
                break;
            case 76:
                d1 *= i4;
                break;
            case 75:
                dFld *= i10;
            case 77:
                d1 -= i13;
            }
        }
        long meth_res = i2 + Double.doubleToLongBits(d1) + i3 + i4 + i9 + i10 + i11 + i12 + i13;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f=66.931F;
        float[] fArr =new float[N];
        int i14=-2, i15=6, i16=-107, i17=2, i18=104, i19=-106, i20=34272, i21=15967, i22=55;
        long l=7L;
        boolean b=false;

        FuzzerUtils.init(fArr, 115.243F);

        f -= (-(10 & (Test0257.iFld + Test0257.iFld)));
        for (int smallinvoc = 0; smallinvoc < 592; smallinvoc++)
            vSmallMeth(dFld, iArrFld[(Test0257.iFld >>> 1) % N], -3 *
                    Math.min(Test0257.iFld++, iArrFld[(Test0257.iFld >>> 1) % N]));
        for (int smallinvoc = 0; smallinvoc < 174; smallinvoc++)
            vSmallMeth(dFld, -Math.max(Math.min(-11516, Test0257.iFld),
                    (int) (70 + lMeth(Test0257.iFld, dFld))), i14);
        for (i15 = 6; i15 < 127; ++i15) {
            for (l = 207; l > i15; l--) {
                switch ((i15 % 2) + 65) {
                case 65:
                    switch ((int)(((l % 2) * 5) + 50)) {
                    case 52:
                        if (b) {
                            i17 += (int)(l * l);
                            i16 = (int)dFld;
                            switch (((57746 >>> 1) % 7) + 33) {
                            case 33:
                                for (i18 = 1; 1 > i18; i18++) {
                                    Test0257.instanceCount += (((i18 * f) + Test0257.fFld) - i18);
                                    i14 = (int) Test0257.fFld;
                                    b = b;
                                }
                                break;
                            case 34:
                                for (i20 = 1; 1 > i20; ++i20) {
                                    iArrFld[i20] = i16;
                                    i16 += i20;
                                    fArr[i20 + 1] *= Test0257.iFld;
                                    i16 = byFld;
                                    iArrFld[(int)(l + 1)] -= i16;
                                    b = b;
                                    i19 = (int)l;
                                    sFld = (short)i14;
                                    Test0257.fFld += (((i20 * i20) + l) - i19);
                                    i16 -= (int) Test0257.fFld;
                                }
                                Test0257.instanceCount += l;
                                try {
                                    iArrFld[i15] = (29208 % i22);
                                    i19 = (-1603059075 / iArrFld[(int)(l - 1)]);
                                    iArrFld[i15] = (48347 % iArrFld[(int)(l)]);
                                } catch (ArithmeticException a_e) {}
                                break;
                            case 35:
                                i19 *= i22;
                                dFld = Test0257.fFld;
                                break;
                            case 36:
                                i16 += (-8680 + (l * l));
                                break;
                            case 37:
                                iArrFld[i15 + 1] /= (int)(i21 | 1);
                                break;
                            case 38:
                                Test0257.fFld -= -198;
                            case 39:
                                Test0257.lArrFld = Test0257.lArrFld;
                                break;
                            }
                        }
                        break;
                    case 54:
                        i16 = 4;
                        break;
                    }
                    break;
                case 66:
                    i19 -= i17;
                    break;
                }
            }
        }

        FuzzerUtils.out.println("f i14 i15 = " + Float.floatToIntBits(f) + "," + i14 + "," + i15);
        FuzzerUtils.out.println("i16 l i17 = " + i16 + "," + l + "," + i17);
        FuzzerUtils.out.println("i18 i19 b = " + i18 + "," + i19 + "," + (b ? 1 : 0));
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test0257.instanceCount Test0257.iFld dFld = " + Test0257.instanceCount + "," + Test0257.iFld + "," +
            Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("Test0257.fFld byFld sFld = " + Float.floatToIntBits(Test0257.fFld) + "," + byFld + "," + sFld);
        FuzzerUtils.out.println("iArrFld Test0257.lArrFld = " + FuzzerUtils.checkSum(iArrFld) + "," +
                FuzzerUtils.checkSum(Test0257.lArrFld));

        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0257 _instance = new Test0257();
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
