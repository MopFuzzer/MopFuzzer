// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:26 2023
public class Test0303 {

    public static final int N = 400;

    public static long instanceCount=2588634639L;
    public static int iFld=-247;
    public static volatile byte byFld=30;
    public static long lFld=193L;
    public static long lFld1=6L;
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0303.iArrFld, -42931);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        short s=3621;
        int i4=13;
        int i5=-55522;
        int i6=-7;
        int i7=1;
        int i8=6;
        int[] iArr =new int[N];
        float f1=-60.508F;
        boolean b=true;
        byte by1=43;

        FuzzerUtils.init(iArr, 10);

        Test0303.instanceCount = s;
        Test0303.iFld *= Test0303.iFld;
        for (i4 = 390; i4 > 2; i4--) {
            if (i5 != 0) {
                vMeth2_check_sum += s + i4 + i5 + Float.floatToIntBits(f1) + i6 + i7 + i8 + (b ? 1 : 0) + by1 +
                    FuzzerUtils.checkSum(iArr);
                return;
            }
            Test0303.iFld += (int) Test0303.instanceCount;
            iArr[i4] %= (int)((long)(f1) | 1);
        }
        i6 = 1;
        do {
            for (i7 = 5; i7 > 1; i7--) {
                try {
                    i5 = (i6 % i6);
                    i5 = (-2016 % i8);
                    i5 = (i7 / i6);
                } catch (ArithmeticException a_e) {}
                i8 -= i5;
                Test0303.iFld = Test0303.iFld;
                b = b;
                by1 >>= (byte)i8;
                iArr[i7 - 1] += i7;
                i5 -= -11;
            }
        } while (++i6 < 306);
        vMeth2_check_sum += s + i4 + i5 + Float.floatToIntBits(f1) + i6 + i7 + i8 + (b ? 1 : 0) + by1 +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(long l1, int i1, long l2) {

        int i2=32297;
        int i3=-62416;
        int i9=9;
        int i10=35778;
        int[] iArr1 =new int[N];
        float f2=-6.111F;
        long[] lArr =new long[N];
        double[] dArr =new double[N];

        FuzzerUtils.init(lArr, 108L);
        FuzzerUtils.init(dArr, 0.78458);
        FuzzerUtils.init(iArr1, 25857);

        for (i2 = 10; i2 < 295; i2 += 2) {
            Test0303.iFld = Test0303.iFld;
            i3 += (int)(i3 / (((l1 * i2) * (i3++)) | 1));
            Test0303.instanceCount = ((l1 << (i2 * 57846)) / ((Test0303.iFld++) | 1));
            vMeth2();
            lArr[i2] <<= i3;
            Test0303.iFld >>= Test0303.iFld;
        }
        dArr[(i3 >>> 1) % N] = i1;
        l2 = i1;
        for (i9 = 11; i9 < 237; ++i9) {
            i10 = (int)f2;
            i3 -= (int)l2;
            i3 *= (int)l1;
        }
        i10 *= i1;
        iArr1 = iArr1;
        vMeth1_check_sum += l1 + i1 + l2 + i2 + i3 + i9 + i10 + Float.floatToIntBits(f2) + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(float f, long l, byte by) {

        int i11=251, i12=-187, i13=2, i14=-183, i15=-141;
        double d=43.64158;

        switch (((((--Test0303.iFld) >>> 1) % 2) * 5) + 12) {
        case 18:
            vMeth1(Test0303.instanceCount, Test0303.iFld, Test0303.instanceCount);
            i11 = 372;
            while ((i11 -= 3) > 0) {
                for (i12 = 1; 13 > i12; i12++) {
                    for (i14 = 1; i14 < 2; i14++) {
                        switch (((i14 % 1) * 5) + 83) {
                        case 86:
                            i13 += (((i14 * i14) + f) - i11);
                            i15 = i13;
                            f = i13;
                            break;
                        }
                        Test0303.iFld += i13;
                        i13 += (i14 | i13);
                        i15 = -152;
                        i13 = -221;
                        Test0303.iFld -= (int) l;
                        d += i12;
                    }
                }
            }
            break;
        case 21:
            i13 *= i15;
            break;
        default:
            Test0303.iArrFld[(i15 >>> 1) % N] = by;
        }
        vMeth_check_sum += Float.floatToIntBits(f) + l + by + i11 + i12 + i13 + i14 + i15 + Double.doubleToLongBits(d);
    }

    public void mainTest(String[] strArr1) {

        int i=1, i16=2, i17=-49, i18=-181, i19=18257, i20=65, i21=31571, i22=64681;
        float f3=2.577F;
        float[][] fArr =new float[N][N];
        long l3=9L;
        boolean b1=true;

        FuzzerUtils.init(fArr, 1.363F);

        i = 1;
        do {
            vMeth(f3, Test0303.instanceCount, Test0303.byFld);
            i16 = 194;
            do {
                fArr = FuzzerUtils.float2array(N, (float)-45.268F);
                Test0303.byFld -= (byte) l3;
            } while (--i16 > 0);
        } while (++i < 129);
        Test0303.iFld += i16;
        for (i17 = 150; i17 > 2; --i17) {
            short s1=25644;
            Test0303.iFld *= (int) Test0303.instanceCount;
            s1 += (short)(i17 ^ l3);
            for (i19 = 1; 169 > i19; ++i19) {
                fArr[i19][i17 + 1] = i19;
                i20 += (((i19 * Test0303.instanceCount) + Test0303.iFld) - i19);
                Test0303.instanceCount += i20;
                for (i21 = 1; i21 < 2; i21++) {
                    i22 = i16;
                    b1 = b1;
                    i22 = i;
                    Test0303.iArrFld = FuzzerUtils.int1array(N, (int) 142);
                    Test0303.instanceCount += i20;
                    Test0303.iFld = i20;
                    switch ((i21 % 2) + 39) {
                    case 39:
                        f3 += i21;
                        i22 -= (int)11L;
                        i18 = i21;
                        break;
                    case 40:
                        Test0303.iFld -= i19;
                        Test0303.lFld *= s1;
                        break;
                    }
                }
                i22 += (i19 * i19);
                Test0303.lFld1 &= -42968;
                f3 *= Test0303.iFld;
                Test0303.lFld1 += (((i19 * f3) + Test0303.lFld) - l3);
            }
        }

        FuzzerUtils.out.println("i f3 i16 = " + i + "," + Float.floatToIntBits(f3) + "," + i16);
        FuzzerUtils.out.println("l3 i17 i18 = " + l3 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 b1 fArr = " + i22 + "," + (b1 ? 1 : 0) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test0303.instanceCount Test0303.iFld Test0303.byFld = " + Test0303.instanceCount + "," + Test0303.iFld +
                "," + Test0303.byFld);
        FuzzerUtils.out.println("Test0303.lFld Test0303.lFld1 Test0303.iArrFld = " + Test0303.lFld + "," + Test0303.lFld1 + "," +
                FuzzerUtils.checkSum(Test0303.iArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0303 _instance = new Test0303();
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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
