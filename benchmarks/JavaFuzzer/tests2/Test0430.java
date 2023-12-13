// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:32 2023
public class Test0430 {

    public static final int N = 400;

    public static long instanceCount=139L;
    public static int iFld=-40844;
    public short sFld=17843;
    public double dFld=-2.110928;
    public static float fFld=-50.53F;
    public static byte byFld=104;
    public static boolean bFld=true;
    public int[] iArrFld =new int[N];
    public static boolean[] bArrFld =new boolean[N];
    public static int[] iArrFld1 =new int[N];
    public byte[] byArrFld =new byte[N];
    public static int[] iArrFld2 =new int[N];

    static {
        FuzzerUtils.init(Test0430.bArrFld, true);
        FuzzerUtils.init(Test0430.iArrFld1, -179);
        FuzzerUtils.init(Test0430.iArrFld2, -42413);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static void vMeth(float f, double d, short s) {


        Test0430.iFld = (int) (++Test0430.instanceCount);
        vMeth_check_sum += Float.floatToIntBits(f) + Double.doubleToLongBits(d) + s;
    }

    public static int iMeth(int i) {


        i -= i;
        long meth_res = i;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth1(float f3) {

        int i4=6, i5=-49160, i6=-46396, i7=155, i8=-38309, i9=-17, i10=12;
        double d1=0.107603;

        Test0430.iFld *= (int) (f3 += Long.reverseBytes(Test0430.instanceCount));
        for (i4 = 1; i4 < 270; i4++) {
            Test0430.iFld &= (int) (d1 + ((Test0430.iFld--) + (Test0430.iFld - i4)));
        }
        Test0430.bArrFld[(12 >>> 1) % N] = ((++i5) < (Test0430.iFld + (++Test0430.iFld)));
        for (i6 = 361; i6 > 6; i6 -= 2) {
            i7 = (((Test0430.iFld - i7) | (i4 + i4)) - (Test0430.iFld >>>= iMeth(Test0430.iFld)));
            for (i8 = i6; i8 < 9; ++i8) {
                i9 ^= i4;
                Test0430.iArrFld1[i8] *= (int) Test0430.fFld;
            }
            i7 *= i6;
            Test0430.instanceCount = i6;
            i10 = 1;
            while (++i10 < 9) {
                i7 -= -2;
                Test0430.byFld += (byte) (i10 - Test0430.instanceCount);
                Test0430.fFld = Test0430.instanceCount;
            }
        }
        long meth_res = Float.floatToIntBits(f3) + i4 + i5 + Double.doubleToLongBits(d1) + i6 + i7 + i8 + i9 + i10;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public long lMeth(long l) {

        int i1=4, i2=-40689, i3=-16;
        float f2=-80.420F;
        double[] dArr =new double[N];
        long[][] lArr =new long[N][N];

        FuzzerUtils.init(dArr, 0.39869);
        FuzzerUtils.init(lArr, -1603639983L);

        for (i1 = 358; i1 > 13; i1--) {
            i2 += (i1 - Test0430.iFld);
            Test0430.iFld += (i1 | Test0430.instanceCount);
            Test0430.instanceCount += (i1 * i1);
            if (true) {
                Test0430.iFld -= (int) Test0430.fFld;
                Test0430.iFld <<= (int) l;
            } else if (Test0430.bFld) {
                f2 = 1;
                do {
                    switch ((int)((f2 % 10) + 47)) {
                    case 47:
                        i3 += (1 + (f2 * f2));
                    case 48:
                        Test0430.iFld += (int) (--dArr[(int) (f2 - 1)]);
                    case 49:
                        i2 |= (int) (iArrFld[(int) (f2 + 1)] - Test0430.fFld);
                        iArrFld[i1] += (int) ((-(i1 | Test0430.instanceCount)) % (((63 - sFld) * (Test0430.byFld % (i2 | 1))) |
                            1));
                        break;
                    case 50:
                        Test0430.instanceCount = 29346;
                        break;
                    case 51:
                        iArrFld[(int)(f2)] >>= i2;
                        break;
                    case 52:
                        Test0430.iFld = (int) (++Test0430.instanceCount);
                        break;
                    case 53:
                        lArr[(int)(f2 - 1)] = (lArr[(int)(f2)] = (lArr[(int)(f2 - 1)] = FuzzerUtils.long1array(N,
                            (long)971607186521985590L)));
                        break;
                    case 54:
                        try {
                            i3 = (i1 % -1528848088);
                            i2 = (iArrFld[i1] % -223);
                            iArrFld[(int)(f2)] = (-201 % i1);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 55:
                        if ((Test0430.fFld > (Test0430.instanceCount--)) & Test0430.bArrFld[i1]) continue;
                        break;
                    case 56:
                        i3 += (int)f2;
                    default:
                        iMeth1(f2);
                    }
                } while (++f2 < 5);
            } else if (Test0430.bFld) {
                lArr[i1 + 1][i1] *= i2;
            } else {
                l -= 149;
            }
        }
        long meth_res = l + i1 + i2 + Float.floatToIntBits(f2) + i3 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(lArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f1=1.438F, f4=42.588F;
        byte by=3;
        long l1=-2031018685649086899L;
        long[] lArr1 =new long[N];
        int i11=-8, i12=250, i13=-14, i14=150, i15=-13;
        double[] dArr1 =new double[N];

        FuzzerUtils.init(lArr1, 2635601139765881864L);
        FuzzerUtils.init(dArr1, -126.100749);

        vMeth(Test0430.iFld - ((++sFld) << (Test0430.iFld * -9)), Double.longBitsToDouble((long) ((Test0430.iFld - dFld) *
                (Test0430.iFld + Test0430.iFld))), (short) ((iMeth(Test0430.iFld) + f1) * f1));
        vMeth(-70.21F, ((Test0430.iFld + sFld) + (Test0430.iFld * by)) * Test0430.iFld, (short) (lMeth(Test0430.instanceCount) +
                Test0430.iFld));
        Test0430.iFld = -242;
        Test0430.fFld = 60;
        lArr1[(Test0430.iFld >>> 1) % N] = Test0430.iFld;
        Test0430.instanceCount >>= Test0430.instanceCount;
        f4 = 202;
        while (--f4 > 0) {
            for (l1 = 124; l1 > 6; --l1) {
                for (i12 = 1; i12 < 2; ++i12) {
                    Test0430.iFld = i12;
                    Test0430.fFld = Test0430.instanceCount;
                    Test0430.instanceCount = i11;
                    byArrFld[(int) (f4 + 1)] = (byte) Test0430.iFld;
                    if (Test0430.bFld) break;
                    dArr1[i12] = l1;
                    i13 *= i11;
                    i11 = i13;
                }
                switch ((int)((l1 % 2) + 81)) {
                case 81:
                    i11 &= i13;
                    for (i14 = 2; i14 > 1; --i14) {
                        Test0430.byFld += (byte) i15;
                        i11 = i11;
                        dFld -= i12;
                        sFld >>= (short) Test0430.iFld;
                        switch (((i14 % 2) * 5) + 80) {
                        case 81:
                            i15 = (int)dFld;
                        case 87:
                            Test0430.instanceCount ^= -61;
                            Test0430.iArrFld1[(int) (f4 - 1)] >>= (int) 75L;
                            break;
                        default:
                            i13 <<= i11;
                            i11 = i13;
                        }
                    }
                    break;
                case 82:
                    Test0430.iArrFld2[(int) (f4)] = i12;
                    break;
                default:
                    Test0430.byFld += (byte) l1;
                }
            }
        }

        FuzzerUtils.out.println("f1 by f4 = " + Float.floatToIntBits(f1) + "," + by + "," + Float.floatToIntBits(f4));
        FuzzerUtils.out.println("l1 i11 i12 = " + l1 + "," + i11 + "," + i12);
        FuzzerUtils.out.println("i13 i14 i15 = " + i13 + "," + i14 + "," + i15);
        FuzzerUtils.out.println("lArr1 dArr1 = " + FuzzerUtils.checkSum(lArr1) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)));

        FuzzerUtils.out.println("Test0430.instanceCount Test0430.iFld sFld = " + Test0430.instanceCount + "," + Test0430.iFld + "," +
            sFld);
        FuzzerUtils.out.println("dFld Test0430.fFld Test0430.byFld = " + Double.doubleToLongBits(dFld) + "," +
                Float.floatToIntBits(Test0430.fFld) + "," + Test0430.byFld);
        FuzzerUtils.out.println("Test0430.bFld iArrFld Test0430.bArrFld = " + (Test0430.bFld ? 1 : 0) + "," +
                FuzzerUtils.checkSum(iArrFld) + "," + FuzzerUtils.checkSum(Test0430.bArrFld));
        FuzzerUtils.out.println("Test0430.iArrFld1 byArrFld Test0430.iArrFld2 = " + FuzzerUtils.checkSum(Test0430.iArrFld1) + "," +
                FuzzerUtils.checkSum(byArrFld) + "," + FuzzerUtils.checkSum(Test0430.iArrFld2));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0430 _instance = new Test0430();
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
//DEBUG  iMeth ->  iMeth mainTest iMeth1 lMeth
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
