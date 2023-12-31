// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:30 2023
public class Test0394 {

    public static final int N = 400;

    public static long instanceCount=-3601904957L;
    public static short sFld=-9903;
    public static boolean bFld=true;
    public static double dFld=1.90802;
    public static float fFld=-1.860F;

    public static long vSmallMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long lMeth1_check_sum = 0;

    public static void vSmallMeth(double d) {

        float f=1.556F;
        int i3=1;

        d -= (-4393 * (~(long)(f - i3)));
        vSmallMeth_check_sum += Double.doubleToLongBits(d) + Float.floatToIntBits(f) + i3;
    }

    public static long lMeth(long l, int i4) {


        vSmallMeth(-((--i4) / ((i4 - 20339) | 1)));
        long meth_res = l + i4;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static double dMeth() {

        int i5=23;
        int[] iArr1 =new int[N];

        FuzzerUtils.init(iArr1, -52144);

        iArr1[(i5 >>> 1) % N] -= i5;
        long meth_res = i5 + FuzzerUtils.checkSum(iArr1);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static long lMeth1(int i6) {

        int i7=-44370;
        int i8=10;
        int i9=13;
        int i10=-10;
        int[] iArr2 =new int[N];
        int[] iArr3 =new int[N];
        double d1=2.82638, d2=0.39372;
        float[] fArr =new float[N];
        long[] lArr =new long[N];

        FuzzerUtils.init(iArr2, 8);
        FuzzerUtils.init(fArr, 83.135F);
        FuzzerUtils.init(iArr3, 0);
        FuzzerUtils.init(lArr, 1945917281L);

        i7 = 1;
        do {
            if (Test0394.bFld) {
                vSmallMeth(d1);
                i6 += (((i7 * Test0394.instanceCount) + i6) - i7);
                switch (((i7 % 1) * 5) + 79) {
                case 82:
                    for (d2 = 1; d2 < 7; d2++) {
                        iArr2[i7] /= (int) (Test0394.sFld | 1);
                        i6 = i8;
                        if (Test0394.bFld) continue;
                        i8 -= (int)d2;
                    }
                    if (i8 != 0) {
                    }
                    for (i9 = 1; i9 < 7; ++i9) {
                        fArr[i9] = i6;
                        iArr3[i9] += (int) Test0394.instanceCount;
                        lArr[i9] *= i7;
                    }
                    break;
                }
            } else {
                d1 -= Test0394.instanceCount;
            }
        } while (++i7 < 250);
        long meth_res = i6 + i7 + Double.doubleToLongBits(d1) + Double.doubleToLongBits(d2) + i8 + i9 + i10 +
            FuzzerUtils.checkSum(iArr2) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(iArr3) + FuzzerUtils.checkSum(lArr);
        lMeth1_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth() {

        int i11=217;
        int i12=-234;
        int i13=-2110;
        int i14=3;
        int i15=-2;
        int[][] iArr4 =new int[N][N];
        float f1=121.984F;
        double[][] dArr =new double[N][N];
        long[] lArr1 =new long[N];

        FuzzerUtils.init(dArr, 0.13394);
        FuzzerUtils.init(lArr1, 3780889215397997657L);
        FuzzerUtils.init(iArr4, -59440);

        lMeth1(i11);
        i11 *= i11;
        dArr[(124 >>> 1) % N][(i11 >>> 1) % N] *= i11;
        if (Test0394.bFld) {
            i11 += i11;
            for (long l1 : lArr1) {
                for (i12 = 1; i12 < 4; ++i12) {
                    l1 |= i12;
                    iArr4[i12][i12 + 1] >>= i13;
                    i11 += i12;
                    for (i14 = 1; i14 < 2; ++i14) {
                        switch (((i12 >>> 1) % 7) + 117) {
                        case 117:
                            if (Test0394.bFld) continue;
                            i11 += (i14 - f1);
                            i11 += (((i14 * i11) + Test0394.instanceCount) - l1);
                            break;
                        case 118:
                        case 119:
                            if (Test0394.bFld) break;
                        case 120:
                            i15 -= 12;
                        case 121:
                            i11 -= i14;
                            break;
                        case 122:
                            f1 = i13;
                        case 123:
                            i11 &= i11;
                        default:
                            l1 = l1;
                        }
                    }
                }
            }
        } else if (Test0394.bFld) {
            i15 <<= (int) Test0394.instanceCount;
        } else if (Test0394.bFld) {
            i15 -= 7;
        } else {
            i13 = i14;
        }
        long meth_res = i11 + i12 + i13 + i14 + i15 + Float.floatToIntBits(f1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(lArr1) +
            FuzzerUtils.checkSum(iArr4);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-21144;
        int i1=80;
        int i2=-9;
        int i16=231;
        int i17=125;
        int i18=7;
        int i19=-110;
        int[] iArr =new int[N];
        byte[] byArr =new byte[N];
        long[] lArr2 =new long[N];

        FuzzerUtils.init(iArr, 8);
        FuzzerUtils.init(byArr, (byte)-116);
        FuzzerUtils.init(lArr2, 104L);

        for (i = 9; i < 358; i++) {
            i1 *= (int) (i1 ^= (int) (iArr[i] * (i1 *= (int) Test0394.instanceCount)));
            i1 += (i | Test0394.instanceCount);
            i2 = 1;
            do {
                Test0394.sFld *= (short) iArr[i - 1];
                for (int smallinvoc = 0; smallinvoc < 1; smallinvoc++)
                    vSmallMeth((-22652 + lMeth(Test0394.instanceCount, i2))
                            - ((i1--) + (-12008 - (i1 = Test0394.sFld))));
                Test0394.instanceCount <<= i;
                if (Test0394.bFld = ((dMeth() - (i2 * i1)) > (iMeth() * Test0394.instanceCount))) break;
                i1 -= i;
                i1 += i2;
            } while (++i2 < 72);
            Test0394.dFld /= -2.275F;
            i1 += (((i * i) + i2) - i);
            for (i16 = 1; 72 > i16; i16++) {
                i18 = 1;
                while (++i18 < 2) {
                    i1 *= i;
                    Test0394.instanceCount = -7;
                    i17 *= (int)-8241773064138589350L;
                }
                i19 = 1;
                while (++i19 < 2) {
                    i17 -= Test0394.sFld;
                    i1 = Test0394.sFld;
                    Test0394.fFld += i1;
                    byArr[i] = (byte)i17;
                    i1 = (int)-3835020282312741297L;
                    Test0394.instanceCount *= Test0394.instanceCount;
                    i1 -= (int) Test0394.fFld;
                    i17 += i16;
                    i1 = i17;
                    i1 -= i;
                }
            }
            Test0394.instanceCount = i19;
            lArr2[i + 1] += Test0394.instanceCount;
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 iArr byArr = " + i19 + "," + FuzzerUtils.checkSum(iArr) + "," +
            FuzzerUtils.checkSum(byArr));
        FuzzerUtils.out.println("lArr2 = " + FuzzerUtils.checkSum(lArr2));

        FuzzerUtils.out.println("Test0394.instanceCount Test0394.sFld Test0394.bFld = " + Test0394.instanceCount + "," + Test0394.sFld +
                "," + (Test0394.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0394.dFld Test0394.fFld = " + Double.doubleToLongBits(Test0394.dFld) + "," +
                Float.floatToIntBits(Test0394.fFld));

        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
        FuzzerUtils.out.println("lMeth1_check_sum: " + lMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0394 _instance = new Test0394();
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test lMeth lMeth1 iMeth
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  dMeth ->  dMeth mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  lMeth1 ->  lMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
