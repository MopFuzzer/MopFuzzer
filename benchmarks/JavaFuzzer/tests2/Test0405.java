// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:31 2023
public class Test0405 {

    public static final int N = 400;

    public static long instanceCount=-12925L;
    public static byte byFld=95;
    public float fFld=11.870F;
    public static double dFld=0.5213;
    public static double[] dArrFld =new double[N];
    public static volatile int[] iArrFld =new int[N];
    public static byte[] byArrFld =new byte[N];

    static {
        FuzzerUtils.init(Test0405.dArrFld, 5.28226);
        FuzzerUtils.init(Test0405.iArrFld, -60222);
        FuzzerUtils.init(Test0405.byArrFld, (byte) 40);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i6=40, i7=10, i8=13664, i9=13, i10=5, i11=12200;
        float f1=0.86F, f2=2.892F;
        short s=-30488;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, 2964L);

        i6 = 10;
        Test0405.iArrFld[(i6 >>> 1) % N] += i6;
        Test0405.instanceCount -= i6;
        f1 *= i6;
        for (i7 = 211; i7 > 1; i7 -= 3) {
            i6 -= (int) Test0405.instanceCount;
        }
        for (i9 = 17; i9 < 303; i9++) {
            for (f2 = 1; 6 > f2; ++f2) {
                lArr = lArr;
            }
            i6 = s;
            Test0405.byArrFld[i9 - 1] = (byte) Test0405.instanceCount;
            if (true) break;
            s >>>= (short)i11;
            i6 += (i9 | Test0405.instanceCount);
            i8 = i10;
        }
        long meth_res = i6 + Float.floatToIntBits(f1) + i7 + i8 + i9 + i10 + Float.floatToIntBits(f2) + i11 + s +
            FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(float f) {

        double d1=1.84776;
        int i12=53481;
        int i13=-63179;
        int i14=-13;
        int i15=2;
        int i16=31135;
        int i17=196;
        int[] iArr1 =new int[N];
        short s1=9467;

        FuzzerUtils.init(iArr1, 144);

        for (int i5 : iArr1) {
            Test0405.instanceCount += (long) (-90 * (d1 += iMeth()));
            Test0405.instanceCount -= 1931852038209604126L;
            i5 = (int) Test0405.instanceCount;
            i5 = (int)f;
            i5 *= (int)-22114L;
            for (i12 = 1; i12 < 4; i12++) {
                Test0405.instanceCount <<= 6;
                Test0405.instanceCount *= s1;
                Test0405.byFld >>= (byte) i12;
                Test0405.instanceCount *= i13;
            }
        }
        for (i14 = 6; i14 < 131; ++i14) {
            for (i16 = i14; i16 < 13; ++i16) {
                i13 = i14;
                i13 += (i16 - Test0405.instanceCount);
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f) + Double.doubleToLongBits(d1) + i12 + i13 + s1 + i14 + i15 + i16 +
            i17 + FuzzerUtils.checkSum(iArr1);
    }

    public void vMeth(double d, long l, int i3) {

        int i4=-5;
        int[] iArr2 =new int[N];
        boolean b=false;
        boolean[] bArr =new boolean[N];
        long[] lArr1 =new long[N];
        long[][] lArr2 =new long[N][N];

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(lArr1, -6L);
        FuzzerUtils.init(lArr2, 12L);
        FuzzerUtils.init(iArr2, 251);

        i4 = 1;
        while (++i4 < 267) {
            vMeth1(-110.400F);
            switch ((i4 % 7) + 69) {
            case 69:
                Test0405.instanceCount += -8;
                break;
            case 70:
                if (b) {
                    Test0405.iArrFld = Test0405.iArrFld;
                    bArr[i4] = b;
                    switch ((i4 % 4) + 93) {
                    case 93:
                    case 94:
                        i3 *= i4;
                        i3 += (i4 * i4);
                        if (b) {
                            i3 = (int) Test0405.instanceCount;
                            if (i4 != 0) {
                                vMeth_check_sum += Double.doubleToLongBits(d) + l + i3 + i4 + (b ? 1 : 0) +
                                    FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(lArr1) +
                                    FuzzerUtils.checkSum(lArr2) + FuzzerUtils.checkSum(iArr2);
                                return;
                            }
                        } else if (b) {
                            if (b) break;
                            Test0405.byFld += (byte) (i4 | i3);
                        } else {
                            lArr1[i4] = i3;
                            vMeth_check_sum += Double.doubleToLongBits(d) + l + i3 + i4 + (b ? 1 : 0) +
                                FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(lArr2)
                                + FuzzerUtils.checkSum(iArr2);
                            return;
                        }
                        break;
                    case 95:
                        Test0405.byFld *= (byte) i4;
                        break;
                    case 96:
                        Test0405.iArrFld[i4 + 1] = -51560;
                        break;
                    }
                    vMeth_check_sum += Double.doubleToLongBits(d) + l + i3 + i4 + (b ? 1 : 0) +
                        FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(lArr2) +
                        FuzzerUtils.checkSum(iArr2);
                    return;
                } else if (b) {
                    lArr2 = FuzzerUtils.long2array(N, (long)-4269757582L);
                }
            case 71:
                i3 += i4;
                break;
            case 72:
                i3 += (i4 | Test0405.byFld);
                break;
            case 73:
                iArr2[i4 + 1] <<= i4;
                break;
            case 74:
                d -= i3;
            case 75:
                d -= 4922870419094631781L;
                break;
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + l + i3 + i4 + (b ? 1 : 0) + FuzzerUtils.checkSum(bArr) +
            FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(lArr2) + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i=19;
        int i1=-55933;
        int i2=162;
        int i19=-11;
        int i20=-58328;
        int i21=-9;
        int[] iArr =new int[N];
        long[] lArr3 =new long[N];

        FuzzerUtils.init(iArr, 7);
        FuzzerUtils.init(lArr3, -63527L);

        Test0405.byFld >>= (byte) (iArr[(i >>> 1) % N]++);
        i += Math.min(i, -13);
        for (i1 = 7; i1 < 344; ++i1) {
            i *= (int) (Test0405.dArrFld[i1] + i);
            i2 /= (int)(((long)(((-21 + (1 - (-(i = (int)fFld)))) - (i + -69.322F)) / (Math.abs(i2 + i2) | 1))) | 1);
            vMeth(Test0405.dFld, 7277027969086313459L, i1);
            if (false) {
                i -= (int)fFld;
                fFld = Test0405.byFld;
                Test0405.dFld += -79;
                Test0405.iArrFld[i1 + 1] *= i1;
            } else {
                i19 = 1;
                do {
                    Test0405.dFld += i19;
                    Test0405.byFld ^= Test0405.byFld;
                    i >>= (int) Test0405.instanceCount;
                    iArr = Test0405.iArrFld;
                    for (i20 = 1; i20 > 1; --i20) {
                        i2 >>= i;
                    }
                    i2 *= (int) Test0405.instanceCount;
                    if (true) continue;
                    Test0405.instanceCount += (i19 * i19);
                    Test0405.instanceCount >>= Test0405.instanceCount;
                } while (++i19 < 75);
                lArr3[i1 - 1] >>>= 39;
                i >>= i19;
            }
            i -= (int)fFld;
            try {
                i21 = (-89 / i19);
                i = (1156894811 / i20);
                iArr[i1 - 1] = (i20 % 1552976391);
            } catch (ArithmeticException a_e) {}
            if (true) continue;
            fFld += (3 + (i1 * i1));
            lArr3[i1] = i21;
        }
        fFld -= Test0405.byFld;

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("iArr lArr3 = " + FuzzerUtils.checkSum(iArr) + "," + FuzzerUtils.checkSum(lArr3));

        FuzzerUtils.out.println("Test0405.instanceCount Test0405.byFld fFld = " + Test0405.instanceCount + "," + Test0405.byFld + "," +
            Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("Test0405.dFld Test0405.dArrFld Test0405.iArrFld = " + Double.doubleToLongBits(Test0405.dFld) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0405.dArrFld)) + "," + FuzzerUtils.checkSum(Test0405.iArrFld));
        FuzzerUtils.out.println("Test0405.byArrFld = " + FuzzerUtils.checkSum(Test0405.byArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0405 _instance = new Test0405();
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}