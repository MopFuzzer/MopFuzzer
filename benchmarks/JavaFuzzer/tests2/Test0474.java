// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:34 2023
public class Test0474 {

    public static final int N = 400;

    public static long instanceCount=-14L;
    public static float fFld=0.67F;
    public static long lFld=-277L;
    public static boolean bFld=false;
    public static volatile short[] sArrFld =new short[N];
    public static float[] fArrFld =new float[N];
    public static long[][] lArrFld =new long[N][N];
    public int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0474.sArrFld, (short) 26278);
        FuzzerUtils.init(Test0474.fArrFld, 0.367F);
        FuzzerUtils.init(Test0474.lArrFld, 41683L);
    }

    public static long vMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long dMeth1_check_sum = 0;

    public static double dMeth1() {

        int i8=7;
        int i9=-5762;
        int i10=38165;
        int i11=11;
        int i12=34273;
        int i13=-50963;
        int i14=-9;
        int[] iArr =new int[N];

        FuzzerUtils.init(iArr, -2);

        for (i8 = 8; i8 < 250; ++i8) {
            Test0474.fFld = i9;
            iArr[i8 + 1] = i9;
            i9 += (((i8 * i8) + i8) - i8);
            for (i10 = i8; i10 < 7; i10++) {
                for (i12 = 1; i12 > 1; i12--) {
                    i9 += (5 + (i12 * i12));
                }
                Test0474.instanceCount += i10;
            }
            i14 = 7;
            while ((i14 -= 3) > 0) {
                i13 = i10;
                Test0474.instanceCount += Test0474.instanceCount;
                Test0474.instanceCount = Test0474.instanceCount;
                Test0474.fFld -= (float) 0.48425;
                Test0474.instanceCount *= i13;
                i9 += i11;
            }
        }
        long meth_res = i8 + i9 + i10 + i11 + i12 + i13 + i14 + FuzzerUtils.checkSum(iArr);
        dMeth1_check_sum += meth_res;
        return (double)meth_res;
    }

    public static double dMeth(float f1) {

        int i1=36427, i2=-60, i3=2, i4=32038, i5=26, i6=-44, i7=-127, i15=-244;
        boolean b=false;
        double d=1.46706;
        long l=17L;
        long[] lArr =new long[N];
        byte by=-82;
        short s=-9105;

        FuzzerUtils.init(lArr, -252L);

        i1 -= (int)1.621F;
        for (i2 = 1; 175 > i2; i2++) {
            for (i4 = 1; 9 > i4; ++i4) {
                for (i6 = 1; i6 < 2; ++i6) {
                    b = (i4 < (Math.max(Test0474.instanceCount, Test0474.instanceCount) >> (--i7)));
                    d /= ((long)(dMeth1()) | 1);
                }
                for (l = 1; l < 2; ++l) {
                    i15 = (int)l;
                    Test0474.instanceCount = i5;
                    d = i5;
                    switch (((i4 % 5) * 5) + 102) {
                    case 107:
                        i1 += (int)(((l * i5) + l) - i15);
                        lArr[(int)(l)] = i1;
                        by = (byte)i5;
                    case 110:
                        s -= s;
                        break;
                    case 125:
                    case 124:
                        Test0474.fArrFld[i2] -= i4;
                        break;
                    case 113:
                        s += (short)l;
                    default:
                        by >>= (byte)33;
                    }
                }
            }
        }
        long meth_res = Float.floatToIntBits(f1) + i1 + i2 + i3 + i4 + i5 + i6 + i7 + (b ? 1 : 0) +
            Double.doubleToLongBits(d) + l + i15 + by + s + FuzzerUtils.checkSum(lArr);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void vMeth(float f) {

        int i=-46797;
        int i16=18954;
        int i17=14;
        int i18=0;
        int[] iArr1 =new int[N];
        float f2=112.230F;
        double d1=3.90666;

        FuzzerUtils.init(iArr1, 13);

        Test0474.sArrFld[(i >>> 1) % N] = (short) (i + dMeth(f2));
        i16 = 1;
        do {
            Test0474.lArrFld[i16 + 1][i16 - 1] = (long) -108.915F;
            for (i17 = 1; i17 < 7; ++i17) {
                i18 = (int)f2;
            }
            iArr1[i16 - 1] = i16;
        } while (++i16 < 237);
        i18 *= (int)d1;
        i ^= (int)91L;
        vMeth_check_sum += Float.floatToIntBits(f) + i + Float.floatToIntBits(f2) + i16 + i17 + i18 +
            Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i19=-142, i20=129, i21=-10947, i22=33, i23=3, i24=-245, i25=160, i26=-28374, i27=0;
        byte by1=23;
        short s1=10425;
        double[] dArr =new double[N];

        FuzzerUtils.init(dArr, 45.28055);

        vMeth(Test0474.fFld);
        for (i19 = 129; i19 > 1; i19 -= 3) {
            i20 *= i19;
            for (i21 = 251; i21 > 5; --i21) {
                i23 = 1;
                do {
                    Test0474.instanceCount -= (long) 1.73F;
                    i22 *= i21;
                    switch ((((i22 >>> 1) % 1) * 5) + 98) {
                    case 102:
                        i22 += i23;
                        Test0474.fFld += (i23 + Test0474.lFld);
                        Test0474.lFld = Test0474.instanceCount;
                    default:
                        Test0474.instanceCount = i23;
                        Test0474.instanceCount = by1;
                        s1 += (short) (((i23 * Test0474.instanceCount) + Test0474.fFld) - i23);
                    }
                } while (++i23 < 3);
                i20 += s1;
            }
            for (i24 = 192; i24 > 6; --i24) {
                i20 += (int)3907734797L;
                Test0474.lFld >>= -175;
                i20 += (i24 + Test0474.instanceCount);
                Test0474.lArrFld[i19][i24] <<= -233;
                for (i26 = 1; 4 > i26; i26++) {
                    i22 /= (int) (Test0474.lFld | 1);
                    dArr[i26] %= (s1 | 1);
                    i20 *= i25;
                    dArr[i24] = i25;
                    i22 -= i22;
                    Test0474.lFld += Test0474.instanceCount;
                    if (Test0474.bFld) {
                        iArrFld = iArrFld;
                        i27 += (int) Test0474.instanceCount;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 by1 = " + i22 + "," + i23 + "," + by1);
        FuzzerUtils.out.println("s1 i24 i25 = " + s1 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 i27 dArr = " + i26 + "," + i27 + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test0474.instanceCount Test0474.fFld Test0474.lFld = " + Test0474.instanceCount + "," +
                Float.floatToIntBits(Test0474.fFld) + "," + Test0474.lFld);
        FuzzerUtils.out.println("Test0474.bFld Test0474.sArrFld Test0474.fArrFld = " + (Test0474.bFld ? 1 : 0) + "," +
                FuzzerUtils.checkSum(Test0474.sArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0474.fArrFld)));
        FuzzerUtils.out.println("Test0474.lArrFld iArrFld = " + FuzzerUtils.checkSum(Test0474.lArrFld) + "," +
            FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("dMeth1_check_sum: " + dMeth1_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0474 _instance = new Test0474();
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
//DEBUG  dMeth ->  dMeth vMeth mainTest
//DEBUG  dMeth1 ->  dMeth1 dMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
