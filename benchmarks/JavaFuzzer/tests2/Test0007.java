// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:12 2023
public class Test0007 {

    public static final int N = 400;

    public static long instanceCount=-7L;
    public static int iFld=10355;
    public volatile byte byFld=-71;
    public static short sFld=31540;
    public static boolean bFld=true;
    public static int[][] iArrFld =new int[N][N];
    public static long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test0007.iArrFld, 8452);
        FuzzerUtils.init(Test0007.lArrFld, -13L);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long byMeth_check_sum = 0;

    public static byte byMeth(double d, short s) {

        int i8=-91, i9=12, i10=51145, i11=-2, i12=-151, i13=51371, i14=-16108, i15=198;
        float f2=-57.417F;

        for (i8 = 2; 223 > i8; i8++) {
            i9 *= (int)f2;
            Test0007.iArrFld[i8 + 1][i8 + 1] = -13;
        }
        Test0007.iArrFld[(i8 >>> 1) % N] = Test0007.iArrFld[(i9 >>> 1) % N];
        Test0007.iArrFld[(i8 >>> 1) % N][(Test0007.iFld >>> 1) % N] -= i8;
        Test0007.iFld -= (int) 31.113947;
        i9 = i10;
        for (i11 = 4; i11 < 325; ++i11) {
            for (i13 = i11; i13 < 5; ++i13) {
                if (i15 != 0) {
                }
                Test0007.iFld >>>= (int) Test0007.instanceCount;
                Test0007.instanceCount >>>= Test0007.iFld;
                i9 = 43598;
                i12 *= 46;
                d += i15;
            }
        }
        long meth_res = Double.doubleToLongBits(d) + s + i8 + i9 + Float.floatToIntBits(f2) + i10 + i11 + i12 + i13 +
            i14 + i15;
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public static int iMeth() {

        float f1=0.885F;
        long l=37348L;
        long[] lArr =new long[N];
        int i7=-8, i16=-170, i17=-14352;
        double d1=118.8737;

        FuzzerUtils.init(lArr, 46774L);

        Test0007.iArrFld[(-136 >>> 1) % N][(Test0007.iFld >>> 1) % N] = Test0007.iArrFld[(Test0007.iFld >>> 1) % N][(Test0007.iFld >>> 1) %
            N];
        Test0007.instanceCount -= (Test0007.iFld++);
        Test0007.instanceCount += (long) (((++Test0007.sFld) * Test0007.sFld) * f1);
        lArr = (lArr = (lArr = lArr));
        for (l = 143; l > 7; l -= 2) {
            i7 += (++i7);
            Test0007.instanceCount = (l * byMeth(d1, Test0007.sFld));
            switch ((int)((l % 4) + 84)) {
            case 84:
                try {
                    Test0007.iArrFld[(int) (l)][(int) (l)] = (i7 % i7);
                    Test0007.iArrFld[(int) (l)][(int) (l)] = (1004 / i7);
                    Test0007.iFld = (Test0007.iFld / Test0007.iArrFld[(int) (l - 1)][(i7 >>> 1) % N]);
                } catch (ArithmeticException a_e) {}
                for (i16 = 23; i16 > 1; --i16) {
                    try {
                        Test0007.iArrFld[(int) (l - 1)][i16 + 1] = (47745 / i16);
                        i7 = (1066 / Test0007.iArrFld[i16 - 1][(int) (l)]);
                        i17 = (Test0007.iArrFld[(int) (l)][i16 - 1] % Test0007.iFld);
                    } catch (ArithmeticException a_e) {}
                    i17 -= i7;
                    if (i7 != 0) {
                    }
                    f1 *= (float)2.60467;
                    d1 %= (i16 | 1);
                }
                break;
            case 85:
                Test0007.instanceCount = i16;
            case 86:
                i7 += (int)(((l * i17) + i16) - f1);
                break;
            case 87:
            }
        }
        long meth_res = Float.floatToIntBits(f1) + l + i7 + Double.doubleToLongBits(d1) + i16 + i17 +
            FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth(float f) {

        int i1=5, i2=-3, i3=-123, i4=45165, i5=94, i6=3, i18=41485;
        double d2=-2.12808;

        for (i1 = 8; i1 < 135; ++i1) {
            for (i3 = 1; i3 < 12; ++i3) {
                i4 += i3;
                for (i5 = 1; i5 < 2; i5++) {
                    byFld = (byte) Short.reverseBytes((short) (iMeth() - Test0007.iFld));
                    Test0007.instanceCount = i4;
                    d2 -= i4;
                    i18 %= (int)(byFld | 1);
                    i2 = Test0007.iFld;
                    f = Test0007.instanceCount;
                    f += i5;
                    d2 -= i1;
                    Test0007.lArrFld[i3 + 1] = byFld;
                    i4 += i5;
                }
                byFld *= (byte)i1;
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f) + i1 + i2 + i3 + i4 + i5 + i6 + Double.doubleToLongBits(d2) + i18;
    }

    public void mainTest(String[] strArr1) {

        float f3=2.730F;
        float[][] fArr =new float[N][N];
        int i19=-46349;
        int i20=13320;
        int i21=2;
        int i22=57086;
        int i23=-7;
        int[] iArr =new int[N];
        double d3=73.112902;

        FuzzerUtils.init(iArr, 11);
        FuzzerUtils.init(fArr, 2.536F);

        for (int i : iArr) {
            switch (((iArr[(Test0007.iFld >>> 1) % N] >>> 1) % 7) + 73) {
            case 73:
                vMeth(f3);
                Test0007.iFld = i;
                fArr[(8725 >>> 1) % N] = fArr[(Test0007.iFld >>> 1) % N];
                Test0007.iFld = i;
                break;
            case 74:
                for (i19 = 3; i19 < 63; i19++) {
                    i = i;
                    i %= -33754;
                    Test0007.iFld <<= (int) -11L;
                    Test0007.bFld = Test0007.bFld;
                    Test0007.instanceCount |= i20;
                    for (i21 = i19; i21 < 2; ++i21) {
                        i22 %= (int) (Test0007.iFld | 1);
                        d3 = i20;
                        Test0007.instanceCount -= -31683L;
                        Test0007.iArrFld[i19][i21] += (int) f3;
                        Test0007.instanceCount += (i21 | i21);
                        switch ((i21 % 1) + 107) {
                        case 107:
                            iArr[i21 + 1] = (int)d3;
                            break;
                        }
                        i *= i22;
                        f3 = f3;
                        i20 = 45507;
                        Test0007.iFld -= 131;
                    }
                }
                break;
            case 75:
                i20 -= (int) Test0007.instanceCount;
                iArr[(i23 >>> 1) % N] = i23;
                f3 *= Test0007.instanceCount;
                break;
            case 76:
                f3 = (float)d3;
                break;
            case 77:
                try {
                    Test0007.iFld = (607650335 / iArr[(24 >>> 1) % N]);
                    i22 = (i % -35604);
                    i22 = (244 % i20);
                } catch (ArithmeticException a_e) {}
                Test0007.iFld = (int) Test0007.instanceCount;
            case 78:
                f3 -= i20;
                break;
            case 79:
                i22 >>= i21;
                break;
            }
        }

        FuzzerUtils.out.println("f3 i19 i20 = " + Float.floatToIntBits(f3) + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 d3 = " + i21 + "," + i22 + "," + Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("i23 iArr fArr = " + i23 + "," + FuzzerUtils.checkSum(iArr) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test0007.instanceCount Test0007.iFld byFld = " + Test0007.instanceCount + "," + Test0007.iFld + "," +
            byFld);
        FuzzerUtils.out.println("Test0007.sFld Test0007.bFld Test0007.iArrFld = " + Test0007.sFld + "," + (Test0007.bFld ? 1 : 0) + "," +
                FuzzerUtils.checkSum(Test0007.iArrFld));
        FuzzerUtils.out.println("Test0007.lArrFld = " + FuzzerUtils.checkSum(Test0007.lArrFld));

        FuzzerUtils.out.println("byMeth_check_sum: " + byMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0007 _instance = new Test0007();
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  byMeth ->  byMeth iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}