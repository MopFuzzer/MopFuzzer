// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:29 2023
public class Test0376 {

    public static final int N = 400;

    public static long instanceCount=346607038L;
    public static double dFld=-1.34395;
    public int iFld=-104;
    public static int iFld1=0;
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0376.iArrFld, 44);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long l1) {

        int i3=-11;
        int i4=-1;
        int i5=43774;
        int i6=-12;
        int[] iArr1 =new int[N];

        FuzzerUtils.init(iArr1, -231);

        for (i3 = 18; i3 < 396; i3++) {
            i4 *= (int)-1.681F;
            for (i5 = 1; i5 < 4; i5++) {
                iArr1[i5] *= -7;
            }
        }
        vMeth2_check_sum += l1 + i3 + i4 + i5 + i6 + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth1(int i1) {

        short s=-22944;
        int i2=-41;
        int i7=55562;
        int i8=-36850;
        int i9=54656;
        int i10=-60496;
        int[] iArr =new int[N];
        float f=0.329F;
        boolean b=true;

        FuzzerUtils.init(iArr, 2);

        s <<= (short)(Integer.reverseBytes(i1) ^ iArr[(1 >>> 1) % N]);
        i2 = 1;
        do {
            i1 = i2;
            Test0376.dFld -= iArr[i2 + 1];
            vMeth2(Test0376.instanceCount);
            for (i7 = 5; i2 < i7; i7 -= 2) {
                i8 += (((i7 * Test0376.instanceCount) + f) - Test0376.instanceCount);
                i1 >>>= (int)-110L;
                for (i9 = 1; i9 < 1; ++i9) {
                    Test0376.instanceCount = i7;
                    Test0376.dFld += i2;
                    i8 %= (int)(i9 | 1);
                    i1 += i9;
                    iArr[i2] += i1;
                    b = b;
                }
            }
        } while (++i2 < 338);
        vMeth1_check_sum += i1 + s + i2 + i7 + i8 + Float.floatToIntBits(f) + i9 + i10 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(long l) {

        int i11=-45140, i13=-16994, i14=-3;
        byte by=-54;
        float f1=0.861F;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -2986385043L);

        vMeth1(i11);
        for (int i12 : Test0376.iArrFld) {
            i11 = 1;
            i11 *= by;
            for (i13 = 1; i13 < 4; ++i13) {
                lArr[i13 + 1] += -36519;
                Test0376.iArrFld[i13 - 1] /= (int) ((long) (f1) | 1);
                i14 = (int)l;
                Test0376.dFld /= ((long) (Test0376.dFld) | 1);
                Test0376.iArrFld[i13 - 1] -= (int) l;
                by = (byte)l;
                i11 *= 13;
            }
            i12 |= (int)1L;
            i12 *= (int)3739958743L;
            i12 -= (int) Test0376.instanceCount;
        }
        vMeth_check_sum += l + i11 + by + i13 + i14 + Float.floatToIntBits(f1) + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        double d=0.121430;
        int i=0, i15=-5, i16=9, i17=-26640, i18=-240, i19=22595, i20=29189, i21=-10272, i22=-32524, i23=5;
        long l3=4L;
        boolean b1=true;
        byte by1=-18;
        float f2=-2.789F;

        Test0376.instanceCount ^= (long) (64035 * Math.abs((float) (d + i)));
        vMeth(l3);
        d -= 10L;
        i = i;
        i15 = 1;
        while (++i15 < 265) {
            for (i16 = i15; i16 < 95; i16++) {
                i17 -= i15;
                l3 ^= Test0376.instanceCount;
                Test0376.iArrFld[i15 + 1] >>>= -185;
                for (i18 = 1; i18 < 1; i18++) {
                    i19 <<= 155;
                    iFld = i19;
                }
                for (i20 = 1; i20 < 1; i20++) {
                    i &= (int) Test0376.instanceCount;
                    Test0376.iArrFld = Test0376.iArrFld;
                    i17 += i20;
                    l3 = Test0376.instanceCount;
                    if (b1) break;
                    i17 |= i19;
                    Test0376.dFld *= i16;
                    i = -104;
                    l3 *= i20;
                    i21 = Test0376.iFld1;
                }
                by1 >>= (byte)i17;
                for (i22 = 1; i22 < 1; ++i22) {
                    Test0376.dFld = -9737;
                    i17 += 12;
                    f2 -= -37453;
                    i23 <<= 4500;
                }
            }
            Test0376.instanceCount &= i;
        }

        FuzzerUtils.out.println("d i l3 = " + Double.doubleToLongBits(d) + "," + i + "," + l3);
        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 b1 by1 = " + i21 + "," + (b1 ? 1 : 0) + "," + by1);
        FuzzerUtils.out.println("i22 i23 f2 = " + i22 + "," + i23 + "," + Float.floatToIntBits(f2));

        FuzzerUtils.out.println("Test0376.instanceCount Test0376.dFld iFld = " + Test0376.instanceCount + "," +
                Double.doubleToLongBits(Test0376.dFld) + "," + iFld);
        FuzzerUtils.out.println("Test0376.iFld1 Test0376.iArrFld = " + Test0376.iFld1 + "," + FuzzerUtils.checkSum(Test0376.iArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0376 _instance = new Test0376();
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
