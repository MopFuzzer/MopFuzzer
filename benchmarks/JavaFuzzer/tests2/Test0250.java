// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:23 2023
public class Test0250 {

    public static final int N = 400;

    public static long instanceCount=5876593392229128077L;
    public static double dFld=-1.76047;
    public static float fFld=-30.384F;
    public static short sFld=14731;
    public byte byFld=64;
    public static int[] iArrFld =new int[N];
    public static int[] iArrFld1 =new int[N];

    static {
        FuzzerUtils.init(Test0250.iArrFld, 6);
        FuzzerUtils.init(Test0250.iArrFld1, -17826);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i7, double d, long l2) {

        int i8=-21352, i9=-168;
        float f1=2.300F;

        for (i8 = 174; 2 < i8; i8--) {
            Test0250.instanceCount -= l2;
        }
        f1 *= -9L;
        Test0250.instanceCount = i8;
        Test0250.instanceCount = i9;
        long meth_res = i7 + Double.doubleToLongBits(d) + l2 + i8 + i9 + Float.floatToIntBits(f1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i4, long l1) {

        int i5=60, i6=-51314, i10=191, i11=0, i12=24214, i13=33090;
        short s=-21742;
        byte by=122;
        double d1=99.50894;

        for (i5 = 5; i5 < 368; ++i5) {
            i6 = iMeth(i6, Test0250.dFld, Test0250.instanceCount);
            i6 = i6;
        }
        Test0250.iArrFld[(i4 >>> 1) % N] *= (int) Test0250.fFld;
        for (i10 = 8; i10 < 285; ++i10) {
            s -= (short)-9647;
            by += (byte)i6;
            Test0250.iArrFld[i10 + 1] -= 199;
            for (d1 = 1; d1 < 6; d1 += 3) {
                i4 <<= i4;
                i13 = 1;
                do {
                    i6 += (i13 + i4);
                    Test0250.dFld -= -121.38317;
                    Test0250.iArrFld1 = Test0250.iArrFld;
                    i4 -= -7;
                } while (++i13 < 6);
            }
        }
        vMeth1_check_sum += i4 + l1 + i5 + i6 + i10 + i11 + s + by + Double.doubleToLongBits(d1) + i12 + i13;
    }

    public static void vMeth(float f, long l, int i) {

        int i1=-7449;
        int i2=198;
        int i3=-9;
        int i14=1;
        int i15=13;
        int[] iArr =new int[N];
        long[] lArr =new long[N];

        FuzzerUtils.init(iArr, -3);
        FuzzerUtils.init(lArr, 2691353395L);

        iArr[(-34 >>> 1) % N] >>= (i--);
        i = i;
        i1 = 1;
        do {
            i += (int)((-1.820F * (--i)) - ((-i1) + i1));
        } while (++i1 < 273);
        for (i2 = 9; i2 < 338; ++i2) {
            vMeth1(i3, l);
            Test0250.fFld -= i1;
            i += (i2 * i2);
            lArr[i2] += i3;
            Test0250.instanceCount = i2;
            iArr[i2 - 1] += i3;
            l += i3;
            for (i14 = 1; i14 < 5; i14++) {
                l *= i2;
                Test0250.iArrFld[i14 - 1] = i15;
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f) + l + i + i1 + i2 + i3 + i14 + i15 + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i16=-5, i17=63, i18=-91, i19=-4, i20=31385, i21=10, i22=-212, i23=27074, i24=-53857, i25=-323;
        boolean b=true;
        double[] dArr =new double[N];

        FuzzerUtils.init(dArr, -1.53797);

        vMeth(Test0250.fFld, Test0250.instanceCount, i16);
        for (i17 = 1; i17 < 188; i17++) {
            Test0250.dFld *= Test0250.instanceCount;
            i16 -= (int)1.636F;
            for (i19 = 3; 134 > i19; i19++) {
                i20 *= i16;
                i16 *= (int) Test0250.instanceCount;
                for (i21 = 1; i21 < 2; i21++) {
                    i16 -= i19;
                    i20 -= -175;
                    Test0250.instanceCount = -8;
                }
                i23 = 1;
                while (++i23 < 2) {
                    Test0250.sFld += (short) (((i23 * i19) + i22) - i18);
                    dArr[i19 - 1] = i23;
                }
                for (i24 = i19; i24 < 2; i24++) {
                    Test0250.instanceCount = i20;
                    byFld -= (byte)i23;
                    b = b;
                    i22 <<= i19;
                }
                Test0250.instanceCount += (i19 ^ Test0250.instanceCount);
                Test0250.instanceCount += i19;
            }
            if (b) break;
            Test0250.sFld >>>= (short) Test0250.instanceCount;
        }

        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 b dArr = " + i25 + "," + (b ? 1 : 0) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test0250.instanceCount Test0250.dFld Test0250.fFld = " + Test0250.instanceCount + "," +
                Double.doubleToLongBits(Test0250.dFld) + "," + Float.floatToIntBits(Test0250.fFld));
        FuzzerUtils.out.println("Test0250.sFld byFld Test0250.iArrFld = " + Test0250.sFld + "," + byFld + "," +
                FuzzerUtils.checkSum(Test0250.iArrFld));
        FuzzerUtils.out.println("Test0250.iArrFld1 = " + FuzzerUtils.checkSum(Test0250.iArrFld1));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0250 _instance = new Test0250();
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
