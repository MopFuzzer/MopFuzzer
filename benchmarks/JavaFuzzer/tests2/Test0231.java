// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:23 2023
public class Test0231 {

    public static final int N = 400;

    public static volatile long instanceCount=-5654129434425201023L;
    public static int iFld=-6;
    public static float fFld=-59.889F;
    public static byte byFld=109;
    public static int iFld1=6;
    public static volatile double dFld=-1.24753;
    public int iFld2=63104;
    public static short[] sArrFld =new short[N];
    public static volatile boolean[][] bArrFld =new boolean[N][N];
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0231.sArrFld, (short) -28793);
        FuzzerUtils.init(Test0231.bArrFld, false);
        FuzzerUtils.init(Test0231.iArrFld, -89);
    }

    public static long byMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        float f1=0.646F;
        float[] fArr1 =new float[N];
        int i9=206, i10=-55414, i11=-86, i12=213;
        double d=65.112750;
        double[] dArr =new double[N];
        boolean b=true;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(dArr, -114.24266);
        FuzzerUtils.init(lArr1, -2275848157L);
        FuzzerUtils.init(fArr1, 1.336F);

        for (f1 = 1; f1 < 225; ++f1) {
            dArr[(int)(f1 + 1)] = i9;
        }
        Test0231.instanceCount = Test0231.instanceCount;
        i9 = Test0231.iFld;
        i10 = 1;
        while (++i10 < 175) {
            byte by=-66;
            lArr1[i10 + 1] = Test0231.instanceCount;
            i9 += (((i10 * Test0231.instanceCount) + i9) - by);
            fArr1[i10 - 1] = (float)d;
            i9 = (int)f1;
            i9 &= 52;
            d -= 9L;
            for (i11 = 1; i11 < 9; i11++) {
                Test0231.fFld += Test0231.instanceCount;
            }
            Test0231.instanceCount += i10;
            b = b;
        }
        vMeth1_check_sum += Float.floatToIntBits(f1) + i9 + i10 + Double.doubleToLongBits(d) + i11 + i12 + (b ? 1 : 0)
            + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(lArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public static void vMeth(int i3) {

        int i4=42178, i5=-3, i6=-186, i7=-25971, i8=-25317;
        boolean b1=true;
        long l=-6L;
        long[] lArr2 =new long[N];
        short s=13658;

        FuzzerUtils.init(lArr2, -10L);

        for (i4 = 17; i4 < 277; ++i4) {
            i6 = 6;
            while ((i6 -= 2) > 0) {
                Test0231.iFld >>>= (++Test0231.sArrFld[i4 + 1]);
                for (i7 = 1; i7 < 2; ++i7) {
                    vMeth1();
                    i5 = i3;
                    Test0231.instanceCount += (((i7 * i4) + i8) - i7);
                    Test0231.bArrFld[i7 + 1][i6 - 1] = true;
                    Test0231.instanceCount -= Test0231.byFld;
                    b1 = b1;
                    switch (((i6 >>> 1) % 6) + 45) {
                    case 45:
                        i5 -= (int)l;
                    case 46:
                        i5 = i6;
                        lArr2[i4] = s;
                    case 47:
                    case 48:
                        if (b1) continue;
                        break;
                    case 49:
                        Test0231.fFld += ((long) i7 ^ (long) Test0231.fFld);
                        break;
                    case 50:
                        Test0231.instanceCount += i4;
                        break;
                    default:
                        Test0231.iFld1 += (i7 + i5);
                    }
                }
            }
        }
        vMeth_check_sum += i3 + i4 + i5 + i6 + i7 + i8 + (b1 ? 1 : 0) + l + s + FuzzerUtils.checkSum(lArr2);
    }

    public static byte byMeth(int i2) {

        int i13=-3, i14=163, i15=-13, i16=57;
        float[] fArr2 =new float[N];

        FuzzerUtils.init(fArr2, -1.727F);

        Test0231.iFld <<= (int) (--Test0231.instanceCount);
        vMeth(Test0231.iFld);
        Test0231.instanceCount = -7;
        Test0231.iFld = i2;
        for (i13 = 13; i13 < 395; ++i13) {
            boolean b2=false;
            i2 += Test0231.iFld1;
            b2 = b2;
            for (i15 = i13; i15 < 4; i15++) {
                fArr2[i13] *= (float) Test0231.dFld;
                Test0231.iFld1 *= (int) -1.850F;
                i14 += (i15 | Test0231.instanceCount);
            }
            Test0231.iArrFld[i13 - 1] >>= i16;
            Test0231.fFld -= Test0231.instanceCount;
            i16 = i2;
            i2 >>= (int) Test0231.instanceCount;
        }
        long meth_res = i2 + i13 + i14 + i15 + i16 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr2));
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=9004, i1=-13, i17=71, i18=-2, i19=199, i20=8277;
        boolean b3=true;
        float f2=2.733F;
        float[] fArr =new float[N];
        long[][] lArr =new long[N][N];

        FuzzerUtils.init(fArr, -123.348F);
        FuzzerUtils.init(lArr, 11879L);

        for (float f : fArr) {
            Test0231.iFld -= (int) (((Test0231.instanceCount - 104) - (Test0231.iFld - 75.31F)) - (Test0231.iFld * Test0231.iFld));
            for (i = 2; i < 63; i += 3) {
                switch ((((((int) (Test0231.instanceCount + i1)) >>> 1) % 8) * 5) + 28) {
                case 51:
                    lArr[i][i] *= byMeth(Test0231.iFld);
                    break;
                case 52:
                    Test0231.dFld *= Test0231.iFld1;
                    break;
                case 54:
                    for (i17 = 1; i17 < 4; ++i17) {
                        Test0231.iFld1 += Test0231.iFld;
                        Test0231.iFld -= -35560;
                        Test0231.iFld = Test0231.iFld1;
                        fArr[i17 - 1] -= i18;
                    }
                    Test0231.dFld = Test0231.instanceCount;
                    Test0231.iFld *= i18;
                    if (b3) break;
                    break;
                case 32:
                    Test0231.iFld1 *= i1;
                case 29:
                    f -= i17;
                    Test0231.iFld1 += 4;
                    f2 = 1;
                    while (++f2 < 4) {
                        Test0231.iArrFld[(int) (f2)] >>= 168;
                    }
                    if (false) break;
                case 37:
                    for (i19 = 1; i19 < 4; ++i19) {
                        Test0231.instanceCount -= 50128;
                        Test0231.iFld *= iFld2;
                        i20 %= (int)(i18 | 1);
                        Test0231.iFld1 -= i;
                        Test0231.instanceCount |= i17;
                    }
                    f += i19;
                    Test0231.instanceCount += i20;
                    break;
                case 67:
                    lArr[(i17 >>> 1) % N][i] += i17;
                    Test0231.instanceCount >>= i19;
                    break;
                case 63:
                    Test0231.dFld -= i1;
                    break;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i17 = " + i + "," + i1 + "," + i17);
        FuzzerUtils.out.println("i18 b3 f2 = " + i18 + "," + (b3 ? 1 : 0) + "," + Float.floatToIntBits(f2));
        FuzzerUtils.out.println("i19 i20 fArr = " + i19 + "," + i20 + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));
        FuzzerUtils.out.println("lArr = " + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test0231.instanceCount Test0231.iFld Test0231.fFld = " + Test0231.instanceCount + "," + Test0231.iFld +
                "," + Float.floatToIntBits(Test0231.fFld));
        FuzzerUtils.out.println("Test0231.byFld Test0231.iFld1 Test0231.dFld = " + Test0231.byFld + "," + Test0231.iFld1 + "," +
                Double.doubleToLongBits(Test0231.dFld));
        FuzzerUtils.out.println("iFld2 Test0231.sArrFld Test0231.bArrFld = " + iFld2 + "," + FuzzerUtils.checkSum(Test0231.sArrFld)
                + "," + FuzzerUtils.checkSum(Test0231.bArrFld));
        FuzzerUtils.out.println("Test0231.iArrFld = " + FuzzerUtils.checkSum(Test0231.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("byMeth_check_sum: " + byMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0231 _instance = new Test0231();
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
//DEBUG  byMeth ->  byMeth mainTest
//DEBUG  vMeth ->  vMeth byMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth byMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
