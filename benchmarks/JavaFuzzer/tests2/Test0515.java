// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:36 2023
public class Test0515 {

    public static final int N = 400;

    public static long instanceCount=2350733771923540103L;
    public static byte byFld=-24;
    public static boolean bFld=true;
    public double dFld=-2.26967;
    public volatile float fFld=14.1012F;
    public static short sFld=4800;

    public static long dMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;

    public static short sMeth() {

        boolean b=true;
        int i10=27091;
        int i11=27380;
        int i12=-4092;
        int i13=61376;
        int i14=-61965;
        int[] iArr2 =new int[N];
        double d=0.129094;
        float[] fArr =new float[N];

        FuzzerUtils.init(fArr, 103.722F);
        FuzzerUtils.init(iArr2, -2);

        b = Test0515.bFld;
        for (float f2 : fArr) {
            i10 = 1;
            do {
                for (i11 = 1; i11 > 1; i11 -= 3) {
                    i12 = i10;
                }
                i12 += i10;
                for (i13 = i10; i13 < 1; i13++) {
                    i14 += i10;
                    i14 -= (int)1.56373;
                    f2 /= (i12 | 1);
                    i14 *= (int)f2;
                    i12 = i14;
                    Test0515.instanceCount -= (long) d;
                }
                f2 = Test0515.instanceCount;
                iArr2[i10 + 1] *= i11;
            } while (++i10 < 4);
        }
        long meth_res = (b ? 1 : 0) + i10 + i11 + i12 + i13 + i14 + Double.doubleToLongBits(d) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr2);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static int iMeth() {

        int i7=-197;
        int i8=248;
        int i9=-27449;
        int i15=5248;
        int i16=6;
        int i17=6740;
        int i18=38;
        int i19=14;
        int[][] iArr1 =new int[N][N];
        double d1=-1.70077;
        float f3=24.72F;

        FuzzerUtils.init(iArr1, 20066);

        iArr1[(i7 >>> 1) % N][(i7 >>> 1) % N] >>= ((iArr1[(i7 >>> 1) % N][(i7 >>> 1) % N] -= iArr1[(i7 >>> 1) % N][(i7
            >>> 1) % N]) + ((i7 - i8) - (i8 * i9)));
        Test0515.byFld += (byte) (Test0515.instanceCount -= sMeth());
        Test0515.instanceCount += i9;
        for (i15 = 11; i15 < 312; i15++) {
            i16 -= i16;
            Test0515.instanceCount = i8;
            for (i17 = 1; i17 < 5; ++i17) {
                Test0515.instanceCount = 231;
                i19 = 2;
                do {
                    Test0515.instanceCount = i15;
                    iArr1[i19 + 1][i15 + 1] = i7;
                    i8 = (int)d1;
                    Test0515.instanceCount = Test0515.instanceCount;
                } while (--i19 > 0);
                f3 += (i17 * i17);
                i8 = i8;
            }
        }
        long meth_res = i7 + i8 + i9 + i15 + i16 + i17 + i18 + i19 + Double.doubleToLongBits(d1) +
            Float.floatToIntBits(f3) + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static double dMeth() {

        int i=-10;
        int i1=27;
        int i2=0;
        int i3=179;
        int i4=14;
        int i5=205;
        int i6=10;
        int[] iArr =new int[N];
        float f1=24.214F;
        double d2=85.59932;
        double[] dArr =new double[N];
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, 132L);
        FuzzerUtils.init(iArr, -59);
        FuzzerUtils.init(dArr, 13.2281);

        for (i = 4; 287 > i; ++i) {
            for (i2 = 1; 6 > i2; i2++) {
                Test0515.instanceCount += (i2 ^ Test0515.byFld);
                for (i4 = 1; i4 < 2; i4++) {
                    if ((223L + i) != (Test0515.instanceCount += (i3--))) {
                        f1 = (((++i6) + (i4 * -12)) + ((++lArr[i4]) + iArr[i4 - 1]));
                    } else {
                        iArr[i - 1] >>>= i;
                        i6 *= (int)(dArr[i4] * iMeth());
                    }
                    i1 += (i4 * i1);
                    i1 += (i4 | Test0515.instanceCount);
                    switch ((i % 8) + 118) {
                    case 118:
                        i5 ^= i1;
                        iArr[i4] = i1;
                        break;
                    case 119:
                        i6 = i6;
                        Test0515.bFld = Test0515.bFld;
                        break;
                    case 120:
                        lArr[i2 - 1] -= 125;
                        break;
                    case 121:
                        Test0515.instanceCount = (long) d2;
                        break;
                    case 122:
                        i1 += i4;
                        break;
                    case 123:
                        i5 |= i6;
                    case 124:
                        i6 = i3;
                        break;
                    case 125:
                        f1 += (i4 + i);
                        break;
                    default:
                        iArr[i4] -= (int)-17145L;
                    }
                }
            }
        }
        long meth_res = i + i1 + i2 + i3 + i4 + i5 + Float.floatToIntBits(f1) + i6 + Double.doubleToLongBits(d2) +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f=-16.225F, f4=-1.324F;
        int i20=-42931;
        int i21=2;
        int i22=-3;
        int i23=4;
        int i24=-217;
        int i25=56798;
        int i26=-13321;
        int[] iArr3 =new int[N];

        FuzzerUtils.init(iArr3, 178);

        f = 194;
        while (--f > 0) {
            Test0515.instanceCount += (long) (f * f);
            dMeth();
            Test0515.instanceCount >>= Test0515.instanceCount;
            for (i20 = (int)(f); 129 > i20; i20++) {
                dFld += Test0515.instanceCount;
                fFld = f;
                i21 = (int) Test0515.instanceCount;
                i21 *= (int) Test0515.instanceCount;
                i21 += i20;
                Test0515.instanceCount = 49;
                i21 = (int) Test0515.instanceCount;
                for (f4 = 1; f4 < 1; ++f4) {
                    try {
                        i22 = (i21 / 1464930482);
                        i22 = (i21 % 28829);
                        i21 = (-15307 / i22);
                    } catch (ArithmeticException a_e) {}
                    if (Test0515.bFld) break;
                    Test0515.sFld += (short) (f4 * f4);
                    i22 >>>= (int) Test0515.instanceCount;
                    i22 -= -9;
                    Test0515.instanceCount = 56;
                    fFld = i21;
                    fFld += i21;
                }
                for (i23 = (int)(f); i23 < 1; i23++) {
                    i21 = (int) Test0515.instanceCount;
                    Test0515.instanceCount = i21;
                    Test0515.instanceCount &= -45;
                }
            }
            for (i25 = 6; 129 > i25; i25++) {
                i26 |= i23;
                dFld -= i24;
            }
            Test0515.instanceCount += (long) f;
            i24 = i20;
        }

        FuzzerUtils.out.println("f i20 i21 = " + Float.floatToIntBits(f) + "," + i20 + "," + i21);
        FuzzerUtils.out.println("f4 i22 i23 = " + Float.floatToIntBits(f4) + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("iArr3 = " + FuzzerUtils.checkSum(iArr3));

        FuzzerUtils.out.println("Test0515.instanceCount Test0515.byFld Test0515.bFld = " + Test0515.instanceCount + "," + Test0515.byFld +
                "," + (Test0515.bFld ? 1 : 0));
        FuzzerUtils.out.println("dFld fFld Test0515.sFld = " + Double.doubleToLongBits(dFld) + "," +
                Float.floatToIntBits(fFld) + "," + Test0515.sFld);

        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0515 _instance = new Test0515();
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
//DEBUG  iMeth ->  iMeth dMeth mainTest
//DEBUG  sMeth ->  sMeth iMeth dMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
