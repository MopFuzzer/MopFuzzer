// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:07 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-6248699834602810866L;
    public volatile int iFld=-1;
    public static volatile short sFld=-5525;
    public static float fFld=58.144F;
    public static double dFld=48.113240;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];
    public static short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 5);
        FuzzerUtils.init(Test.lArrFld, 171L);
        FuzzerUtils.init(Test.sArrFld, (short)26701);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;

    public static int iMeth(int i5, int i6, int i7) {


        Test.instanceCount >>= i6;
        long meth_res = i5 + i6 + i7;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static boolean bMeth(short s, int i14) {

        long l1=-7L, l2=-103L;
        int i15=40933, i16=-13, i17=9, i18=1107;
        double d2=0.79943;
        byte by=55;

        i14 += (int)Test.instanceCount;
        Test.lArrFld[(i14 >>> 1) % N] *= i14;
        i14 *= i14;
        l1 = 1;
        while (++l1 < 139) {
            i14 <<= i14;
            for (l2 = 1; l2 < 11; l2++) {
                i14 = (int)Test.instanceCount;
                for (d2 = l2; d2 < 2; ++d2) {
                    i16 += (int)(((d2 * Test.instanceCount) + i15) - by);
                }
                try {
                    Test.iArrFld[(int)(l2 + 1)] = (i16 % -17725);
                    i15 = (890674831 / Test.iArrFld[(int)(l2)]);
                    i14 = (-48 % i15);
                } catch (ArithmeticException a_e) {}
                Test.iArrFld[(int)(l2 - 1)] >>= (int)l2;
            }
            by = (byte)i14;
            for (i17 = 1; i17 < 11; ++i17) {
                Test.iArrFld = Test.iArrFld;
                Test.fFld += i17;
            }
        }
        long meth_res = s + i14 + l1 + l2 + i15 + Double.doubleToLongBits(d2) + i16 + by + i17 + i18;
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static long lMeth(double d1) {

        int i19=56816, i20=161, i21=111, i22=38846, i23=-56086, i24=15925, i25=-49592, i26=13;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -47.633F);

        bMeth(Test.sFld, 7);
        for (i19 = 1; i19 < 239; ++i19) {
            Test.iArrFld = Test.iArrFld;
            i20 += i19;
            fArr[i19] -= i20;
            Test.lArrFld[i19] -= i19;
            for (i21 = 1; i21 < 7; i21++) {
                for (i23 = 2; i21 < i23; i23--) {
                    i24 = i22;
                }
            }
            Test.sFld |= (short)i22;
            for (i25 = 1; i25 < 7; i25++) {
                i20 *= i23;
                Test.instanceCount >>= -46;
                Test.instanceCount *= i25;
                if (i24 != 0) {
                }
            }
        }
        long meth_res = Double.doubleToLongBits(d1) + i19 + i20 + i21 + i22 + i23 + i24 + i25 + i26 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i8, long l) {

        int i9=-8, i10=-43438, i11=10, i12=-6, i13=21;
        float fArr1[][]=new float[N][N];

        FuzzerUtils.init(fArr1, 1.96F);

        l = (Test.iArrFld[(i8 >>> 1) % N]++);
        i9 = 1;
        do {
            for (i10 = 1; i10 < 7; ++i10) {
                Test.fFld -= (((i9 - i9) - i10) + i9);
                for (i12 = 1; 2 > i12; i12++) {
                    i8 += i12;
                    i8 *= (int)((long)(Test.fFld - (i9 - -223)) >> (long)((-213 - (Test.fFld++)) * i9));
                    Test.lArrFld[i9] = lMeth(Test.dFld);
                    i13 -= i11;
                    i13 >>>= -36373;
                    fArr1[i9 + 1][i9 + 1] -= i10;
                    Test.iArrFld[i10 - 1] = i13;
                    Test.fFld += (i12 * i12);
                }
                i8 >>= i8;
            }
            i11 -= i11;
        } while (++i9 < 234);
        vMeth_check_sum += i8 + l + i9 + i10 + i11 + i12 + i13 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public void mainTest(String[] strArr1) {

        double d=0.85111, d3=0.64812;
        int i=-9, i1=62981, i2=-1, i3=-5, i4=0, i27=56634, i28=-11, i29=-31257, i30=163, i31=164, iArr[]=new int[N];
        float f=-92.50F;
        boolean b=false;
        short s1=21220;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 1498106207797868991L);
        FuzzerUtils.init(iArr, 4);

        Test.instanceCount += (long)Math.sqrt(-2.28012);
        lArr[(iFld >>> 1) % N] = (long)(Math.sqrt(d = -25896) * ((d - iFld) * Test.sFld));
        iFld = (int)(--lArr[(55359 >>> 1) % N]);
        i = 215;
        while (--i > 0) {
            for (i1 = 7; i1 < 117; i1++) {
                for (i3 = 2; i3 > 1; --i3) {
                    iArr[i1 - 1] += (int)(iArr[i3 - 1] - (--f));
                    i2 = iMeth(iArr[i3], iArr[i1 - 1] - (i4 + i1), --iFld);
                    vMeth(i1, Test.instanceCount);
                    i4 += i3;
                    d *= Test.instanceCount;
                    if (b) continue;
                }
                for (i27 = 1; i27 < 2; i27++) {
                    Test.sArrFld[i + 1] = (short)i2;
                }
                Test.sFld = (short)i27;
                i4 += (i1 * i1);
                for (d3 = 1; 2 > d3; ++d3) {
                    i4 *= iFld;
                    i2 >>= i;
                    f += (float)(((d3 * Test.instanceCount) + iFld) - i28);
                    Test.instanceCount >>= Test.instanceCount;
                    iArr[i1 + 1] -= -61516;
                    Test.instanceCount += (long)(((d3 * i27) + Test.fFld) - f);
                    iFld += (int)(((d3 * s1) + i4) - i);
                    i4 = i28;
                    iFld += (int)(((d3 * Test.fFld) + iFld) - Test.instanceCount);
                }
            }
            for (i30 = 4; i30 < 117; ++i30) {
                b = b;
            }
            Test.iArrFld[i] *= -17;
            i28 += 0;
        }

        FuzzerUtils.out.println("d i i1 = " + Double.doubleToLongBits(d) + "," + i + "," + i1);
        FuzzerUtils.out.println("i2 i3 i4 = " + i2 + "," + i3 + "," + i4);
        FuzzerUtils.out.println("f b i27 = " + Float.floatToIntBits(f) + "," + (b ? 1 : 0) + "," + i27);
        FuzzerUtils.out.println("i28 d3 i29 = " + i28 + "," + Double.doubleToLongBits(d3) + "," + i29);
        FuzzerUtils.out.println("s1 i30 i31 = " + s1 + "," + i30 + "," + i31);
        FuzzerUtils.out.println("lArr iArr = " + FuzzerUtils.checkSum(lArr) + "," + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test.instanceCount iFld Test.sFld = " + Test.instanceCount + "," + iFld + "," +
            Test.sFld);
        FuzzerUtils.out.println("Test.fFld Test.dFld Test.iArrFld = " + Float.floatToIntBits(Test.fFld) + "," +
            Double.doubleToLongBits(Test.dFld) + "," + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.lArrFld Test.sArrFld = " + FuzzerUtils.checkSum(Test.lArrFld) + "," +
            FuzzerUtils.checkSum(Test.sArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  bMeth ->  bMeth lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
