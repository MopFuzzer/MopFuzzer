// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:29 2023
public class Test0378 {

    public static final int N = 400;

    public static long instanceCount=-2L;
    public static byte byFld=-20;
    public static boolean bFld=false;
    public static short sFld=25733;
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0378.iArrFld, 11);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(double d2, float f1, float f2) {

        int i10=-26728, i11=-198, i12=-85, i13=64, i14=-5;
        long[][] lArr1 =new long[N][N];
        double[] dArr1 =new double[N];

        FuzzerUtils.init(lArr1, 134L);
        FuzzerUtils.init(dArr1, -1.3308);

        i10 >>= -56169;
        i10 *= (int)f2;
        i11 = 1;
        do {
            if (Test0378.bFld) break;
        } while (++i11 < 308);
        d2 = d2;
        for (i12 = 13; 265 > i12; ++i12) {
            Test0378.iArrFld[i12] -= (int) Test0378.instanceCount;
            switch (((i12 % 2) * 5) + 9) {
            case 15:
                Test0378.iArrFld[i12 + 1] = (int) Test0378.instanceCount;
            case 17:
                i14 = 1;
                do {
                    lArr1[i14][i14 + 1] -= Test0378.instanceCount;
                    f1 -= f2;
                    dArr1[i12 + 1] = i10;
                    f2 -= i12;
                    if (i11 != 0) {
                    }
                } while (++i14 < 6);
                break;
            }
        }
        long meth_res = Double.doubleToLongBits(d2) + Float.floatToIntBits(f1) + Float.floatToIntBits(f2) + i10 + i11 +
            i12 + i13 + i14 + FuzzerUtils.checkSum(lArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i5) {

        double d1=2.128935;
        double[][] dArr =new double[N][N];
        int i6=3, i7=241, i8=-137, i9=-9116;
        float f=-2.483F;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, 12L);
        FuzzerUtils.init(dArr, 0.14131);

        lArr[(i5 >>> 1) % N] |= (long)(d1 - 70);
        for (i6 = 3; i6 < 128; ++i6) {
            for (i8 = i6; i8 < 13; ++i8) {
                switch (((((i9 + Test0378.byFld) >>> 1) % 1) * 5) + 25) {
                case 27:
                    lArr[i6] ^= -3367775382L;
                    f += i8;
                    break;
                default:
                    i9 = (int) (((Test0378.iArrFld[i8 - 1]--) - dArr[i8][i8]) * lMeth(d1, f, f));
                    i5 >>>= i9;
                }
                i9 -= -1;
                i9 = i7;
                if (Test0378.bFld) break;
                Test0378.instanceCount += (long) d1;
            }
        }
        i5 <<= (int) Test0378.instanceCount;
        i5 = 124;
        i9 -= i7;
        vMeth_check_sum += i5 + Double.doubleToLongBits(d1) + i6 + i7 + i8 + i9 + Float.floatToIntBits(f) +
            FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public int iMeth(int i1) {

        int i2=163, i3=27651, i4=-4160;
        double d=0.48662, d3=-106.6700;
        short s=-13200;
        byte[] byArr =new byte[N];

        FuzzerUtils.init(byArr, (byte)125);

        for (byte by : byArr) {
            Test0378.iArrFld = (Test0378.iArrFld = (Test0378.iArrFld = (Test0378.iArrFld = Test0378.iArrFld)));
            for (i2 = 1; i2 < 4; i2++) {
                for (d = 2; d > 1; d -= 3) {
                    s = s;
                    vMeth(i1);
                    i1 += (int)d;
                    Test0378.instanceCount <<= i3;
                    if (Test0378.bFld) {
                        i4 += (int)d;
                    } else {
                        Test0378.iArrFld[(int) (d)] >>>= i4;
                        i3 <<= i4;
                        i1 = i3;
                        d3 *= s;
                    }
                    s -= (short) Test0378.instanceCount;
                }
            }
        }
        long meth_res = i1 + i2 + i3 + Double.doubleToLongBits(d) + i4 + s + Double.doubleToLongBits(d3) +
            FuzzerUtils.checkSum(byArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=26936, i15=-18323, i16=10156, i17=48968, i18=-194;
        long l=6927741026865557518L;
        long l1=9151752557647677965L;
        long[] lArr2 =new long[N];
        float f3=2.1013F;
        double d4=0.65081;
        boolean b=true;

        FuzzerUtils.init(lArr2, -662930121L);

        i = 1;
        while (++i < 225) {
            Test0378.byFld += (byte) ((-(++l)) + (iMeth(i) * i));
            Test0378.sFld -= (short) -220;
            for (l1 = 6; 112 > l1; l1++) {
                lArr2 = lArr2;
                i15 += (int)(l1 * l1);
                i15 -= (int) Test0378.instanceCount;
                lArr2 = lArr2;
                f3 -= (float)d4;
                i15 += (int)(l1 | i);
                i15 >>= (int)l1;
                Test0378.bFld = Test0378.bFld;
            }
        }
        Test0378.iArrFld[(12 >>> 1) % N] = i;
        Test0378.instanceCount /= ((long) (d4) | 1);
        Test0378.instanceCount *= i15;
        Test0378.instanceCount = -8;
        for (long l2 : lArr2) {
            i16 = 63;
            while ((i16 -= 2) > 0) {
                try {
                    i15 = (i / -138);
                    i15 = (Test0378.iArrFld[i16 - 1] % -60919052);
                    i15 = (i16 % i);
                } catch (ArithmeticException a_e) {}
                i15 *= i;
                i15 = (int)l;
                Test0378.instanceCount += (i16 * i);
                l = i16;
                i15 &= 18;
                b = b;
                i15 = (int)-2341293617051361139L;
            }
            for (i17 = 1; i17 < 63; ++i17) {
                d4 += i;
                i18 = -35384;
                i15 >>>= i16;
            }
        }

        FuzzerUtils.out.println("i l l1 = " + i + "," + l + "," + l1);
        FuzzerUtils.out.println("i15 f3 d4 = " + i15 + "," + Float.floatToIntBits(f3) + "," +
            Double.doubleToLongBits(d4));
        FuzzerUtils.out.println("i16 b i17 = " + i16 + "," + (b ? 1 : 0) + "," + i17);
        FuzzerUtils.out.println("i18 lArr2 = " + i18 + "," + FuzzerUtils.checkSum(lArr2));

        FuzzerUtils.out.println("Test0378.instanceCount Test0378.byFld Test0378.bFld = " + Test0378.instanceCount + "," + Test0378.byFld +
                "," + (Test0378.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0378.sFld Test0378.iArrFld = " + Test0378.sFld + "," + FuzzerUtils.checkSum(Test0378.iArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0378 _instance = new Test0378();
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
//DEBUG  lMeth ->  lMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}