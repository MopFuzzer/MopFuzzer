// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:20 2023
public class Test0163 {

    public static final int N = 400;

    public static long instanceCount=10L;
    public volatile int iFld=0;
    public static int iFld1=79;
    public static float fFld=1.65F;
    public volatile boolean bFld=false;
    public static volatile int[] iArrFld =new int[N];
    public double[] dArrFld =new double[N];
    public float[] fArrFld =new float[N];

    static {
        FuzzerUtils.init(Test0163.iArrFld, -47);
    }

    public static long dMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(long l1) {

        short s=-15615;
        int i4=-57142, i5=-33688, i6=-12;
        double d1=2.79101;
        float f2=1.337F;
        long[][] lArr2 =new long[N][N];

        FuzzerUtils.init(lArr2, 903235539L);

        s += (short)i4;
        i5 = 1;
        while (++i5 < 256) {
            i4 = (int)d1;
            f2 = i4;
            i6 = 1;
            while (++i6 < 6) {
                i4 *= i4;
                f2 += (float)d1;
                i4 -= i5;
            }
        }
        i4 /= (int)(i6 | 1);
        i4 = i6;
        lArr2[(-46888 >>> 1) % N][(i6 >>> 1) % N] += i4;
        Test0163.iArrFld[(-8 >>> 1) % N] = i4;
        Test0163.instanceCount = l1;
        long meth_res = l1 + s + i4 + i5 + Double.doubleToLongBits(d1) + Float.floatToIntBits(f2) + i6 +
            FuzzerUtils.checkSum(lArr2);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth() {

        int i2=777;
        int i3=-89;
        int[][] iArr =new int[N][N];
        double d=-1.57968;
        double[] dArr =new double[N];
        float[] fArr =new float[N];
        long[] lArr1 =new long[N];
        byte[][] byArr =new byte[N][N];

        FuzzerUtils.init(fArr, 0.561F);
        FuzzerUtils.init(lArr1, -57701L);
        FuzzerUtils.init(iArr, -9);
        FuzzerUtils.init(dArr, 79.4426);
        FuzzerUtils.init(byArr, (byte)59);

        for (int i1 : Test0163.iArrFld) {
            i1 += (int) Test0163.instanceCount;
            Test0163.iArrFld[(i1 >>> 1) % N] <<= (int) (i1 += (int) fArr[(i1 >>> 1) % N]);
            i2 = 1;
            do {
                for (d = 1; 1 > d; d++) {
                    lArr1[(int)(d + 1)] = i2;
                    iArr = (iArr = (iArr = FuzzerUtils.int2array(N, (int)-19929)));
                    Test0163.instanceCount = ((Test0163.instanceCount++) * (-40241 * Test0163.instanceCount));
                    Test0163.iArrFld[(int) (d - 1)] <<= (int) lMeth(-30461L);
                    i1 >>= i2;
                }
                i3 += (i2 * i3);
                i1 += i2;
                dArr[i2] += 101.428F;
                byArr[i2][(i1 >>> 1) % N] -= (byte)i2;
                Test0163.iArrFld = FuzzerUtils.int1array(N, (int) 11591);
            } while (++i2 < 4);
        }
        long meth_res = i2 + Double.doubleToLongBits(d) + i3 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(byArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static double dMeth(int i, long l, float f1) {

        int i7=-204, i8=-25420, i9=-20, i10=52222;
        float f3=116.115F;

        i = iMeth();
        i7 = 1;
        while (++i7 < 332) {
            l = Test0163.instanceCount;
            i += i7;
            for (f3 = 1; f3 < 5; f3 += 2) {
                for (i9 = 1; i9 < 3; i9++) {
                    i8 += (i9 * i9);
                    i8 *= (int)f3;
                    Test0163.instanceCount += (i9 ^ l);
                    Test0163.iArrFld[(int) (f3 - 1)] = (int) l;
                    try {
                        i8 = (-246 % i10);
                        i = (i9 / Test0163.iFld1);
                        Test0163.iFld1 = (i10 % 369590208);
                    } catch (ArithmeticException a_e) {}
                    i10 = (int)f1;
                }
                Test0163.iArrFld[i7] = i;
                l += (long)(f3 * f3);
                Test0163.iFld1 = i;
            }
        }
        long meth_res = i + l + Float.floatToIntBits(f1) + i7 + Float.floatToIntBits(f3) + i8 + i9 + i10;
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f=2.244F;
        int i11=240, i12=6938, i13=4, i14=206, i15=-178, i16=-183, i17=64565, i18=4;
        short s1=-22220;
        long l2=-8L;
        long[] lArr =new long[N];
        double d2=-2.64444;

        FuzzerUtils.init(lArr, 2541902600L);

        f = 1;
        do {
            Test0163.iArrFld[(int) (f + 1)] >>= (int) lArr[(int) (f - 1)];
            iFld *= (int) dMeth(iFld, Test0163.instanceCount, -83.901F);
            Test0163.iArrFld[(int) (f)] /= (int) (Test0163.instanceCount | 1);
            Test0163.fFld -= Test0163.iFld1;
        } while (++f < 200);
        bFld = false;
        Test0163.iArrFld[(-13 >>> 1) % N] = Test0163.iFld1;
        for (i11 = 3; i11 < 128; ++i11) {
            Test0163.instanceCount *= s1;
            iFld += (i11 * i11);
            Test0163.iArrFld[(i11 >>> 1) % N] = (int) Test0163.instanceCount;
        }
        for (i13 = 19; i13 < 371; i13++) {
            i14 += (i13 | Test0163.instanceCount);
            i14 &= i14;
            i12 += 64449;
            if (bFld) continue;
        }
        dArrFld[(i12 >>> 1) % N] *= Test0163.instanceCount;
        l2 = 227;
        do {
            if (bFld) continue;
            switch (((i13 >>> 1) % 4) + 41) {
            case 41:
                Test0163.iArrFld[(int) (l2)] >>= i12;
                switch ((int)((l2 % 7) + 113)) {
                case 113:
                    bFld = bFld;
                    fArrFld[(int)(l2)] = i12;
                    for (i15 = (int)(l2); 111 > i15; i15++) {
                        i14 -= (int)d2;
                        i17 = 1;
                        do {
                            iFld = i16;
                            bFld = bFld;
                            lArr[i15 + 1] >>= i17;
                        } while (++i17 < 1);
                    }
                    break;
                case 114:
                    iFld %= (int)4327694445932635106L;
                    break;
                case 115:
                    Test0163.instanceCount = i11;
                    break;
                case 116:
                    d2 *= Test0163.fFld;
                    break;
                case 117:
                    dArrFld[(int) (l2 - 1)] -= Test0163.fFld;
                    break;
                case 118:
                    Test0163.iArrFld[(int) (l2 + 1)] = i15;
                    break;
                case 119:
                    Test0163.fFld += 149;
                }
                break;
            case 42:
            case 43:
                Test0163.fFld *= Test0163.iFld1;
            case 44:
                i18 += (int)l2;
                break;
            }
        } while (--l2 > 0);

        FuzzerUtils.out.println("f i11 i12 = " + Float.floatToIntBits(f) + "," + i11 + "," + i12);
        FuzzerUtils.out.println("s1 i13 i14 = " + s1 + "," + i13 + "," + i14);
        FuzzerUtils.out.println("l2 i15 i16 = " + l2 + "," + i15 + "," + i16);
        FuzzerUtils.out.println("d2 i17 i18 = " + Double.doubleToLongBits(d2) + "," + i17 + "," + i18);
        FuzzerUtils.out.println("lArr = " + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test0163.instanceCount iFld Test0163.iFld1 = " + Test0163.instanceCount + "," + iFld + "," +
                Test0163.iFld1);
        FuzzerUtils.out.println("Test0163.fFld bFld Test0163.iArrFld = " + Float.floatToIntBits(Test0163.fFld) + "," + (bFld ? 1 :
                0) + "," + FuzzerUtils.checkSum(Test0163.iArrFld));
        FuzzerUtils.out.println("dArrFld fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0163 _instance = new Test0163();
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
//DEBUG  lMeth ->  lMeth iMeth dMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}