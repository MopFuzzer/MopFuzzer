// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:07 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=1891331330L;
    public static short sFld=-15673;
    public static double dFld=-22.74582;
    public static boolean bFld=false;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 135);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth1_check_sum = 0;

    public static long lMeth1() {

        int i9=0, i10=-77, i11=10938, i12=62778, i13=-214, i14=-8, i15=-253, i16=110, i17=-49487;
        boolean b=true;
        float f1=-64.955F;
        long lArr1[][]=new long[N][N];

        FuzzerUtils.init(lArr1, -2641288271L);

        for (i9 = 2; i9 < 315; i9++) {
            for (i11 = 1; i11 < 5; i11 += 2) {
                Test.iArrFld = Test.iArrFld;
                if (b) continue;
                for (i13 = 1; 3 > i13; ++i13) {
                    i14 >>>= (int)Test.instanceCount;
                    Test.dFld *= i11;
                    lArr1[i13 + 1][i9] -= 20907;
                }
                Test.instanceCount += (((i11 * i9) + f1) - i13);
            }
            i10 += i9;
            if (true) continue;
            for (i15 = 1; i15 < 5; i15++) {
                i17 += (((i15 * Test.instanceCount) + Test.instanceCount) - Test.instanceCount);
                i17 += (((i15 * i14) + i15) - Test.instanceCount);
            }
            Test.iArrFld[i9 + 1] *= (int)Test.instanceCount;
        }
        long meth_res = i9 + i10 + i11 + i12 + (b ? 1 : 0) + i13 + i14 + Float.floatToIntBits(f1) + i15 + i16 + i17 +
            FuzzerUtils.checkSum(lArr1);
        lMeth1_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i2) {

        int i3=4, i4=-6, i5=-62707, i6=-18233, i7=-13, i8=4;
        double d=0.7417;
        long l3=11551L, lArr[]=new long[N];
        float f=0.414F;

        FuzzerUtils.init(lArr, 6L);

        Test.sFld = (short)(-Test.instanceCount);
        i3 = 1;
        while (++i3 < 281) {
            for (i4 = 1; i4 < 6; ++i4) {
                for (i6 = 1; 2 > i6; i6 += 2) {
                    long l2=-3528916228304531057L;
                    byte by=9;
                    i5 += Integer.reverseBytes(i2--);
                    i2 += (--i2);
                    i7 <<= (int)l2;
                    i7 -= (int)((i5--) - (Long.reverseBytes(l2) * (d + i6)));
                    i7 *= (int)(lArr[i4] + lArr[i4]);
                    Test.iArrFld[i3 - 1] = (int)(((-(i2 += i7)) + (l3 + by)) * (-(i7 + d)));
                    i7 += i8;
                    l3 <<= (--i5);
                }
                Test.sFld = (short)(i3 - (i2 / (i7 | 1)));
                i8 = (int)((Math.min(i6, i5) + (Test.instanceCount % ((long)(f) | 1))) + lMeth1());
                Test.instanceCount += -114;
            }
        }
        vMeth_check_sum += i2 + i3 + i4 + i5 + i6 + i7 + Double.doubleToLongBits(d) + l3 + i8 + Float.floatToIntBits(f)
            + FuzzerUtils.checkSum(lArr);
    }

    public static long lMeth(long l, long l1, int i1) {

        byte by1=-7;
        int i18=12, i19=-8, i20=0, i21=-9, i22=48709;
        float f2=-1.794F;
        double d1=122.62524;
        boolean bArr[][]=new boolean[N][N];
        long lArr2[]=new long[N];

        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(lArr2, -21289L);

        vMeth(i1);
        by1 -= (byte)i1;
        for (i18 = 4; i18 < 144; ++i18) {
            Test.bFld = Test.bFld;
            i19 += (i18 * l);
        }
        by1 = (byte)f2;
        i1 += i1;
        bArr[(i19 >>> 1) % N][(i19 >>> 1) % N] = true;
        for (d1 = 4; 173 > d1; d1++) {
            bArr[(int)(d1 + 1)][(int)(d1)] = Test.bFld;
            f2 *= -48946;
            i19 %= (int)(i20 | 1);
            for (i21 = 1; 9 > i21; i21++) {
                lArr2[i21] = Test.instanceCount;
                l1 >>= Test.instanceCount;
            }
        }
        long meth_res = l + l1 + i1 + by1 + i18 + i19 + Float.floatToIntBits(f2) + Double.doubleToLongBits(d1) + i20 +
            i21 + i22 + FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(lArr2);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=131;
        long lArr3[]=new long[N];

        FuzzerUtils.init(lArr3, 38321L);

        i = (int)(-((13 - (26580 - lMeth(Test.instanceCount, Test.instanceCount, i))) - i));
        lArr3[(i >>> 1) % N] = i;

        FuzzerUtils.out.println("i lArr3 = " + i + "," + FuzzerUtils.checkSum(lArr3));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.dFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.bFld Test.iArrFld = " + (Test.bFld ? 1 : 0) + "," +
            FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("lMeth1_check_sum: " + lMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
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
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  lMeth1 ->  lMeth1 vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
