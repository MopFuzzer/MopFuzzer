// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:42 2023
public class Test0652 {

    public static final int N = 400;

    public static long instanceCount=159L;
    public static double dFld=-70.57285;
    public static int iFld=-14;
    public static int[] iArrFld =new int[N];
    public boolean[] bArrFld =new boolean[N];

    static {
        FuzzerUtils.init(Test0652.iArrFld, -24739);
    }

    public static long lMeth_check_sum = 0;
    public static long lMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(float f2, int i4) {

        int i5=0;
        byte by=-61;
        byte[] byArr1 =new byte[N];
        boolean b=false;
        long[] lArr =new long[N];
        float[] fArr =new float[N];

        FuzzerUtils.init(lArr, -3867513188L);
        FuzzerUtils.init(byArr1, (byte)22);
        FuzzerUtils.init(fArr, 0.870F);

        i5 = 1;
        while (++i5 < 384) {
            switch (((i5 % 7) * 5) + 36) {
            case 64:
                Test0652.dFld += i4;
                if (b) {
                    by += (byte)(i5 | i5);
                    lArr[i5] %= -11;
                }
                break;
            case 43:
                f2 += i4;
                break;
            case 37:
                byArr1[i5] |= (byte)25328;
            case 62:
                try {
                    Test0652.iArrFld[i5 + 1] = (-34238 % i5);
                    i4 = (235 / i5);
                    i4 = (-61312 / i5);
                } catch (ArithmeticException a_e) {}
                Test0652.instanceCount += -46157L;
                i4 >>= -75;
                i4 *= i5;
            case 38:
                i4 += (i5 * i4);
                byArr1 = byArr1;
                break;
            case 47:
                fArr[i5 + 1] -= (float)-28.23976;
                break;
            case 45:
                i4 >>= i4;
                break;
            default:
                i4 *= i4;
            }
        }
        long meth_res = Float.floatToIntBits(f2) + i4 + i5 + by + (b ? 1 : 0) + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(byArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth1(long l, float f1) {

        int i3=-208;
        byte[] byArr =new byte[N];

        FuzzerUtils.init(byArr, (byte)-12);

        byArr[(i3 >>> 1) % N] ^= (byte)(iMeth(f1, i3) - i3);
        long meth_res = l + Float.floatToIntBits(f1) + i3 + FuzzerUtils.checkSum(byArr);
        lMeth1_check_sum += meth_res;
        return (long)meth_res;
    }

    public static long lMeth() {

        float f=1.245F;
        int i6=119;
        boolean b1=true;
        long[] lArr1 =new long[N];
        byte[] byArr2 =new byte[N];

        FuzzerUtils.init(lArr1, -9L);
        FuzzerUtils.init(byArr2, (byte)110);

        Test0652.instanceCount += (long) (((Test0652.instanceCount * f) + lMeth1(Test0652.instanceCount, 46.708F)) - i6);
        i6 = i6;
        Test0652.iArrFld[(i6 >>> 1) % N] |= (int) Test0652.instanceCount;
        Test0652.dFld -= Test0652.dFld;
        Test0652.instanceCount += (long) f;
        i6 += (int)-62.105F;
        Test0652.iArrFld[(i6 >>> 1) % N] -= -11891;
        i6 -= (int) Test0652.instanceCount;
        for (long l1 : lArr1) {
            Test0652.iArrFld[(i6 >>> 1) % N] <<= (int) l1;
        }
        for (byte by1 : byArr2) {
            if (b1) {
                Test0652.instanceCount = Test0652.instanceCount;
            } else {
                Test0652.instanceCount -= -150L;
                Test0652.iArrFld[(-30069 >>> 1) % N] += -31464;
            }
        }
        long meth_res = Float.floatToIntBits(f) + i6 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(lArr1) +
            FuzzerUtils.checkSum(byArr2);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-63469, i1=57470, i2=-2, i7=-84, i8=97, i9=63155, i10=-13;
        double d=0.103098;
        short s=-9357;
        boolean b2=true;
        float f3=8.995F;
        float[] fArr1 =new float[N];
        long[] lArr2 =new long[N];

        FuzzerUtils.init(fArr1, -118.773F);
        FuzzerUtils.init(lArr2, 876916927L);

        for (i = 18; i < 347; ++i) {
            i2 = 1;
            while (++i2 < 76) {
                byte by2=-31;
                d *= (lMeth() - Test0652.instanceCount);
                for (i7 = 1; i7 < 1; ++i7) {
                    d -= d;
                    if (false) continue;
                    Test0652.instanceCount += i7;
                    i1 += i;
                    i8 = (int) Test0652.instanceCount;
                    i8 = (int)2.1772;
                    try {
                        i8 = (Test0652.iFld % -358429429);
                        Test0652.iFld = (248 % Test0652.iArrFld[i2 + 1]);
                        i8 = (i7 % 1356304357);
                    } catch (ArithmeticException a_e) {}
                    Test0652.instanceCount *= -3324;
                    Test0652.iFld <<= (int) 11L;
                    i8 += (int) Test0652.instanceCount;
                }
                Test0652.instanceCount += (long) -88.66105;
                if (b2) {
                    for (i9 = 1; i9 < 1; ++i9) {
                        fArr1[i2] = i10;
                        i10 *= (int) Test0652.instanceCount;
                        switch (((i9 % 3) * 5) + 36) {
                        case 51:
                            switch ((i % 6) + 41) {
                            case 41:
                                lArr2[i + 1] -= i9;
                                break;
                            case 42:
                                i1 -= Test0652.iFld;
                                break;
                            case 43:
                                i1 = i1;
                                Test0652.iFld = i9;
                                break;
                            case 44:
                                i1 = i1;
                                i8 = i9;
                                break;
                            case 45:
                                Test0652.iFld += (((i9 * i2) + s) - Test0652.instanceCount);
                                if (b2) break;
                                f3 += (12774 + (i9 * i9));
                            case 46:
                            default:
                                Test0652.instanceCount = i1;
                            }
                        case 42:
                            Test0652.iArrFld[i - 1] -= (int) Test0652.instanceCount;
                            break;
                        case 48:
                            i10 = (int) Test0652.instanceCount;
                            break;
                        default:
                            bArrFld[i9] = b2;
                        }
                    }
                } else {
                    by2 = (byte) Test0652.instanceCount;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("d i7 i8 = " + Double.doubleToLongBits(d) + "," + i7 + "," + i8);
        FuzzerUtils.out.println("i9 i10 s = " + i9 + "," + i10 + "," + s);
        FuzzerUtils.out.println("b2 f3 fArr1 = " + (b2 ? 1 : 0) + "," + Float.floatToIntBits(f3) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));
        FuzzerUtils.out.println("lArr2 = " + FuzzerUtils.checkSum(lArr2));

        FuzzerUtils.out.println("Test0652.instanceCount Test0652.dFld Test0652.iFld = " + Test0652.instanceCount + "," +
                Double.doubleToLongBits(Test0652.dFld) + "," + Test0652.iFld);
        FuzzerUtils.out.println("Test0652.iArrFld bArrFld = " + FuzzerUtils.checkSum(Test0652.iArrFld) + "," +
            FuzzerUtils.checkSum(bArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("lMeth1_check_sum: " + lMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0652 _instance = new Test0652();
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  lMeth1 ->  lMeth1 lMeth mainTest
//DEBUG  iMeth ->  iMeth lMeth1 lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
