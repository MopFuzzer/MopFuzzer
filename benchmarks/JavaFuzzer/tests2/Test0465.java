// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:34 2023
public class Test0465 {

    public static final int N = 400;

    public static long instanceCount=-5175160579967173210L;
    public static int iFld=-53893;
    public static volatile float fFld=-1.1016F;
    public short sFld=1173;
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0465.iArrFld, -156);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(float f, byte by, double d) {

        short s=-2958;
        int i4=8, i5=-30791, i6=55486, i7=-165, i8=-7, i9=-2;
        float f1=-24.964F, f2=2.651F, f3=-106.612F;
        boolean b=false;

        s >>= (short) Test0465.iFld;
        for (i4 = 3; i4 < 131; i4++) {
            Test0465.iFld += (((i4 * i4) + i5) - f1);
        }
        Test0465.instanceCount = Test0465.instanceCount;
        Test0465.iFld = (int) 60.28002;
        for (i6 = 6; i6 < 277; ++i6) {
            i5 = i7;
            if (i6 != 0) {
            }
            for (f2 = 1; 6 > f2; ++f2) {
                b = false;
                i7 >>>= i7;
                for (f3 = f2; f3 < 2; ++f3) {
                    i7 += (47681 + (f3 * f3));
                    Test0465.iArrFld[(int) (f3)] += (int) f3;
                    i9 *= s;
                }
            }
        }
        long meth_res = Float.floatToIntBits(f) + by + Double.doubleToLongBits(d) + s + i4 + i5 +
            Float.floatToIntBits(f1) + i6 + i7 + Float.floatToIntBits(f2) + i8 + (b ? 1 : 0) + Float.floatToIntBits(f3)
            + i9;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i1=52433, i2=5, i3=6;
        long l1=46L;
        long[] lArr =new long[N];
        byte by1=-43;
        double d1=-42.62647;
        float[] fArr =new float[N];

        FuzzerUtils.init(lArr, -3720323633674139314L);
        FuzzerUtils.init(fArr, 10.721F);

        i1 = 1;
        do {
            for (i2 = 1; i2 < 11; i2++) {
                Test0465.instanceCount += ((Test0465.iArrFld[i1 + 1]--) * (Math.min(i1, i1) * (l1 * Test0465.instanceCount)));
                i3 += (int) (((++i3) << Math.max(65435, i1)) - ((++lArr[i2 + 1]) - (Test0465.instanceCount + l1)));
                i3 ^= iMeth(Test0465.fFld, by1, d1);
                if (i1 != 0) {
                    vMeth_check_sum += i1 + i2 + i3 + l1 + by1 + Double.doubleToLongBits(d1) +
                        FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                    return;
                }
                i3 = (int) Test0465.instanceCount;
            }
            l1 -= (long)d1;
            l1 += (long) Test0465.fFld;
            l1 += (((i1 * by1) + by1) - Test0465.fFld);
        } while (++i1 < 143);
        i3 ^= i3;
        Test0465.fFld = Test0465.fFld;
        Test0465.fFld -= 14109;
        i3 = i3;
        fArr[(i2 >>> 1) % N] *= Test0465.instanceCount;
        vMeth_check_sum += i1 + i2 + i3 + l1 + by1 + Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vSmallMeth(long l, int i) {

        boolean b1=false;

        vMeth();
        b1 = b1;
        vSmallMeth_check_sum += l + i + (b1 ? 1 : 0);
    }

    public void mainTest(String[] strArr1) {

        int i10=-15, i11=9, i12=3, i13=-12, i14=-2, i15=9, i16=24, i17=9, i18=1;
        double d2=1.108520;
        short s1=-6321;
        long l2=18050L;
        long l3=5768488000275373009L;
        long[] lArr1 =new long[N];
        boolean b2=false;
        float[] fArr1 =new float[N];

        FuzzerUtils.init(lArr1, 8730653052745994625L);
        FuzzerUtils.init(fArr1, -113.361F);

        for (int smallinvoc = 0; smallinvoc < 648; smallinvoc++) vSmallMeth(Test0465.instanceCount, 155);
        Test0465.iFld -= Test0465.iFld;
        Test0465.iFld += Test0465.iFld;
        i10 = 1;
        while (++i10 < 298) {
            Test0465.instanceCount += Test0465.iFld;
            d2 = s1;
        }
        Test0465.iFld *= Test0465.iFld;
        Test0465.iFld = i10;
        Test0465.iFld = i10;
        Test0465.iFld = i10;
        Test0465.iFld += (int) Test0465.fFld;
        for (i11 = 13; i11 < 271; ++i11) {
            Test0465.instanceCount = -7071;
        }
        for (l2 = 7; l2 < 263; l2++) {
            i14 = 1;
            while (++i14 < 98) {
                lArr1[i14] = -1105443166L;
                fArr1[i14 - 1] = Test0465.fFld;
                for (i15 = 1; i15 < 1; ++i15) {
                    i13 %= (int)(i15 | 1);
                    Test0465.iArrFld[(int) (l2 - 1)] *= i14;
                }
            }
            sFld -= (short)i14;
            switch ((int)((l2 % 1) + 76)) {
            case 76:
                for (i17 = 5; i17 < 98; i17++) {
                    b2 = b2;
                    i13 >>= i13;
                    Test0465.iArrFld[i17 - 1] += (int) l3;
                    Test0465.iArrFld[(int) (l2 + 1)] = 35;
                    i16 *= i13;
                    Test0465.instanceCount -= (long) 1.952F;
                    d2 -= 115.122377;
                }
                break;
            }
        }

        FuzzerUtils.out.println("i10 d2 s1 = " + i10 + "," + Double.doubleToLongBits(d2) + "," + s1);
        FuzzerUtils.out.println("i11 i12 l2 = " + i11 + "," + i12 + "," + l2);
        FuzzerUtils.out.println("i13 i14 i15 = " + i13 + "," + i14 + "," + i15);
        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("b2 l3 lArr1 = " + (b2 ? 1 : 0) + "," + l3 + "," + FuzzerUtils.checkSum(lArr1));
        FuzzerUtils.out.println("fArr1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));

        FuzzerUtils.out.println("Test0465.instanceCount Test0465.iFld Test0465.fFld = " + Test0465.instanceCount + "," + Test0465.iFld +
                "," + Float.floatToIntBits(Test0465.fFld));
        FuzzerUtils.out.println("sFld Test0465.iArrFld = " + sFld + "," + FuzzerUtils.checkSum(Test0465.iArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0465 _instance = new Test0465();
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  iMeth ->  iMeth vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
