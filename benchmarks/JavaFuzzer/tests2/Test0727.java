// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:46 2023
public class Test0727 {

    public static final int N = 400;

    public static long instanceCount=60857L;
    public static byte byFld=121;
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0727.iArrFld, -14);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;

    public static double dMeth(int i11, int i12) {

        int i13=-29011, i14=-20571, i15=-1, i16=9;
        float f2=124.686F;
        long l=-234L;
        long[] lArr1 =new long[N];
        byte[][] byArr1 =new byte[N][N];

        FuzzerUtils.init(lArr1, -12145L);
        FuzzerUtils.init(byArr1, (byte)62);

        for (i13 = 19; i13 < 372; ++i13) {
            i12 <<= i11;
            for (i15 = 1; i15 < 5; i15++) {
                try {
                    i16 = (i16 / i16);
                    i11 = (213 / Test0727.iArrFld[i15 - 1]);
                    i12 = (i12 / -7663);
                } catch (ArithmeticException a_e) {}
                lArr1[i13] += (long)f2;
                i11 = 4;
                i11 = (int) Test0727.instanceCount;
                i16 = i16;
                byArr1[i15][i13 + 1] *= (byte) Test0727.instanceCount;
                Test0727.instanceCount += (i15 * i15);
                if (i14 != 0) {
                }
            }
            l = 1;
            while (++l < 5) {
                i16 += (int) Test0727.instanceCount;
                i11 = i11;
                i16 *= i15;
            }
        }
        long meth_res = i11 + i12 + i13 + i14 + i15 + i16 + Float.floatToIntBits(f2) + l + FuzzerUtils.checkSum(lArr1)
            + FuzzerUtils.checkSum(byArr1);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static int iMeth(int i5, int i6, float f1) {

        int i7=-9;
        int i8=225;
        int i9=-6;
        int i10=-7;
        int i17=6;
        int[] iArr =new int[N];
        double d1=62.50144;
        byte by=127;
        long[][] lArr =new long[N][N];

        FuzzerUtils.init(iArr, 247);
        FuzzerUtils.init(lArr, 0L);

        i7 = 1;
        do {
            f1 += (i7 + f1);
            i5 += (int)(-2.786F + (i7 * i7));
            Test0727.instanceCount += (i7 ^ i7);
            for (i8 = 13; 1 < i8; i8 -= 2) {
                i10 = 3;
                while (--i10 > 0) {
                    iArr[i8 - 1] -= (int) (Math.max(-Test0727.instanceCount, ++Test0727.instanceCount) + iArr[i7 - 1]);
                    lArr = (lArr = (lArr = (lArr = lArr)));
                }
                i5 <<= i5;
                f1 += (float)dMeth(i9, -22429);
                i17 = 3;
                do {
                    i6 += (i17 * i5);
                    d1 *= 5L;
                    Test0727.instanceCount += by;
                    Test0727.iArrFld[i7 - 1] = i7;
                } while (--i17 > 0);
            }
        } while (++i7 < 125);
        long meth_res = i5 + i6 + Float.floatToIntBits(f1) + i7 + i8 + i9 + i10 + i17 + Double.doubleToLongBits(d1) +
            by + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i1, int i2) {

        int i3=0, i4=18644, i18=-3, i19=52016, i20=18376, i21=5, i22=-7, i23=146;
        double d=93.13638;
        float f=0.154F;
        short s=-11476, s1=3612;
        boolean b=false;

        for (i3 = 11; i3 < 244; ++i3) {
            Test0727.instanceCount = (long) d;
            i1 = (int)(((f * d) % (iMeth(i2, -9, f) | 1)) / ((long)(f) | 1));
            i18 = 7;
            while ((i18 -= 2) > 0) {
                i1 += (i18 ^ i2);
            }
        }
        for (i19 = 353; i19 > 3; i19 -= 3) {
            i4 -= (int) Test0727.instanceCount;
            Test0727.iArrFld[i19 + 1] += i2;
            f = s;
            b = b;
            for (i21 = i19; 13 > i21; ++i21) {
                Test0727.byFld += (byte) (i21 * s);
                i23 = 1;
                while (++i23 < 1) {
                    i4 = s1;
                    i22 += (int)(-21863L + (i23 * i23));
                }
            }
        }
        vMeth_check_sum += i1 + i2 + i3 + i4 + Double.doubleToLongBits(d) + Float.floatToIntBits(f) + i18 + i19 + i20 +
            s + (b ? 1 : 0) + i21 + i22 + i23 + s1;
    }

    public void mainTest(String[] strArr1) {

        int i=-11;
        byte[] byArr =new byte[N];
        short[] sArr =new short[N];

        FuzzerUtils.init(byArr, (byte)-63);
        FuzzerUtils.init(sArr, (short)21867);

        byArr[(i >>> 1) % N] = (byte)sArr[(-8739 >>> 1) % N];
        vMeth(i, i);
        i = i;
        i += (int) Test0727.instanceCount;

        FuzzerUtils.out.println("i byArr sArr = " + i + "," + FuzzerUtils.checkSum(byArr) + "," +
            FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test0727.instanceCount Test0727.byFld Test0727.iArrFld = " + Test0727.instanceCount + "," + Test0727.byFld
                + "," + FuzzerUtils.checkSum(Test0727.iArrFld));

        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0727 _instance = new Test0727();
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
//DEBUG  dMeth ->  dMeth iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
