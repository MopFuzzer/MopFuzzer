// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:46 2023
public class Test0732 {

    public static final int N = 400;

    public static long instanceCount=-2505977042L;
    public static short sFld=7049;
    public static boolean bFld=true;
    public static float fFld=76.344F;
    public static double dFld=-48.31739;
    public int iFld=-16930;
    public static long[] lArrFld =new long[N];
    public static byte[] byArrFld =new byte[N];

    static {
        FuzzerUtils.init(Test0732.lArrFld, -166L);
        FuzzerUtils.init(Test0732.byArrFld, (byte) 4);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i5) {

        double d=-2.12179, d1=2.566;
        float f2=-114.100F;
        long l=6994744316806366027L;
        int i6=-191;
        int i7=-21012;
        int i8=169;
        int i9=-27338;
        int[] iArr1 =new int[N];
        byte by1=-31;

        FuzzerUtils.init(iArr1, 64);

        i5 >>= (int) Test0732.instanceCount;
        d *= Test0732.instanceCount;
        f2 -= f2;
        for (l = 21; 357 > l; l++) {
            Test0732.instanceCount = i6;
            for (d1 = 1; d1 < 5; d1++) {
                switch (((i5 >>> 1) % 1) + 55) {
                case 55:
                    iArr1[(int)(d1)] = by1;
                    break;
                }
                i6 += i5;
                for (i8 = 2; i8 > 1; --i8) {
                    i9 = i5;
                    Test0732.lArrFld[(int) (l)] -= l;
                    i7 <<= 22086;
                    i9 -= (int)d;
                    Test0732.sFld -= (short) i5;
                }
            }
        }
        vMeth1_check_sum += i5 + Double.doubleToLongBits(d) + Float.floatToIntBits(f2) + l + i6 +
            Double.doubleToLongBits(d1) + i7 + by1 + i8 + i9 + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(float f1, int i4) {

        int i10=-14;
        int i11=754;
        int i12=47279;
        int[] iArr2 =new int[N];
        byte by2=-20;
        double[] dArr =new double[N];

        FuzzerUtils.init(iArr2, -14);
        FuzzerUtils.init(dArr, -2.51396);

        vMeth1(i4);
        for (i10 = 9; i10 < 299; i10++) {
            if (Test0732.bFld) break;
        }
        i11 += -21;
        Test0732.bFld = false;
        i12 = 1;
        do {
            iArr2[i12 - 1] += by2;
            switch (((i12 % 5) * 5) + 50) {
            case 56:
                i11 >>= (int) Test0732.instanceCount;
                break;
            case 75:
                i11 += i12;
                break;
            case 55:
                i11 *= (int) Test0732.instanceCount;
                i4 -= (int)f1;
                iArr2[i12] /= (int)(i10 | 1);
                break;
            case 57:
                i11 = i4;
                i11 = (int) Test0732.instanceCount;
                break;
            case 69:
                Test0732.byArrFld[i12 - 1] = (byte) 3061;
                break;
            }
        } while (++i12 < 164);
        vMeth_check_sum += Float.floatToIntBits(f1) + i4 + i10 + i11 + i12 + by2 + FuzzerUtils.checkSum(iArr2) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static int iMeth(int i3, byte by) {

        int i13=11;
        int i14=44798;
        int i15=7;
        int i16=14;
        int i17=-37;
        int[] iArr3 =new int[N];
        double d3=-39.65927;

        FuzzerUtils.init(iArr3, 9);

        vMeth(Test0732.fFld, i3);
        i3 >>= (int) Test0732.instanceCount;
        i3 += by;
        i3 /= (int)(i3 | 1);
        Test0732.instanceCount <<= -6;
        for (i13 = 9; i13 < 363; ++i13) {
            i15 += (i13 ^ (long) Test0732.fFld);
            d3 = 1;
            while (++d3 < 5) {
                for (i16 = 1; 1 > i16; i16++) {
                    i3 += i16;
                    i17 |= (int) Test0732.instanceCount;
                    switch ((int)((d3 % 4) + 111)) {
                    case 111:
                        i15 = Test0732.sFld;
                        i14 = i16;
                        break;
                    case 112:
                        Test0732.fFld += i13;
                        break;
                    case 113:
                        Test0732.instanceCount = i15;
                    case 114:
                        iArr3[i16] = (int) Test0732.instanceCount;
                    default:
                        Test0732.dFld -= -2.886F;
                    }
                }
            }
        }
        long meth_res = i3 + by + i13 + i14 + i15 + Double.doubleToLongBits(d3) + i16 + i17 +
            FuzzerUtils.checkSum(iArr3);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-40773;
        int i1=-39;
        int i2=-13;
        int i18=-5227;
        int i19=-9;
        int i20=-11;
        int i21=204;
        int[] iArr =new int[N];
        float f=76.483F;
        float[][] fArr =new float[N][N];
        byte by3=-98;

        FuzzerUtils.init(iArr, 41132);
        FuzzerUtils.init(fArr, 1.801F);

        iArr[(-141 >>> 1) % N] <<= (int)(i + (++f));
        i = (i++);
        for (i1 = 8; i1 < 321; i1++) {
            Test0732.instanceCount = (Math.abs((int) (-1941894543L + iMeth(i, by3))) - i2);
            i2 ^= (int) Test0732.instanceCount;
            i2 += (((i1 * i) + i1) - Test0732.fFld);
            fArr[i1 - 1][i1] += 9;
            iArr = iArr;
            Test0732.sFld += (short) i2;
            switch ((((i >>> 1) % 2) * 5) + 8) {
            case 9:
                fArr[i1 + 1][i1] *= i1;
                switch ((i1 % 3) + 38) {
                case 38:
                    if (false) break;
                    fArr[i1][i1] = i;
                    i2 += i2;
                    break;
                case 39:
                    for (i18 = 80; i18 > 4; --i18) {
                        Test0732.instanceCount += (5765 + (i18 * i18));
                        i20 += (i18 * i20);
                        i19 >>= (int) Test0732.instanceCount;
                        i19 = i;
                        i21 = 1;
                        while (++i21 < 2) {
                            if (Test0732.bFld) continue;
                            i19 = i19;
                            i19 ^= (int) Test0732.instanceCount;
                            i2 += i;
                            Test0732.lArrFld[i1 - 1] %= (i21 | 1);
                            iFld = (int) Test0732.dFld;
                            Test0732.instanceCount = i20;
                            Test0732.instanceCount -= iFld;
                            i19 += (((i21 * Test0732.instanceCount) + i19) - f);
                        }
                    }
                case 40:
                    Test0732.instanceCount += (i1 * i21);
                }
            case 10:
                Test0732.instanceCount >>= i18;
                break;
            default:
                i19 += 2;
            }
        }

        FuzzerUtils.out.println("i f i1 = " + i + "," + Float.floatToIntBits(f) + "," + i1);
        FuzzerUtils.out.println("i2 by3 i18 = " + i2 + "," + by3 + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("iArr fArr = " + FuzzerUtils.checkSum(iArr) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test0732.instanceCount Test0732.sFld Test0732.bFld = " + Test0732.instanceCount + "," + Test0732.sFld +
                "," + (Test0732.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0732.fFld Test0732.dFld iFld = " + Float.floatToIntBits(Test0732.fFld) + "," +
                Double.doubleToLongBits(Test0732.dFld) + "," + iFld);
        FuzzerUtils.out.println("Test0732.lArrFld Test0732.byArrFld = " + FuzzerUtils.checkSum(Test0732.lArrFld) + "," +
                FuzzerUtils.checkSum(Test0732.byArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0732 _instance = new Test0732();
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
