// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:54 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2597595449937207774L;
    public static short sFld=-5664;
    public static byte byFld=-34;
    public static double dFld=-53.103577;
    public volatile int iFld=71;

    public static long lMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;

    public static double dMeth(int i4, int i5, byte by) {

        double d1=1.74746;
        int i6=252, i7=-1, i8=5, i9=-85, i10=-9, i11=-2786;
        float f2=-54.289F;

        i5 <<= -132;
        i4 <<= i4;
        i5 -= 108;
        d1 -= -127L;
        for (i6 = 141; i6 > 4; i6--) {
            i5 += (i6 + i4);
            for (i8 = 1; i8 < 11; ++i8) {
                i7 *= (int)f2;
            }
        }
        Test.instanceCount = Test.instanceCount;
        Test.instanceCount -= (long)f2;
        i5 -= i5;
        by = (byte)Test.sFld;
        for (i10 = 7; i10 < 233; ++i10) {
            by += (byte)(i10 + i8);
            f2 += i4;
        }
        long meth_res = i4 + i5 + by + Double.doubleToLongBits(d1) + i6 + i7 + i8 + i9 + Float.floatToIntBits(f2) + i10
            + i11;
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static float fMeth(float f, float f1, int i3) {


        dMeth(i3, i3, Test.byFld);
        long meth_res = Float.floatToIntBits(f) + Float.floatToIntBits(f1) + i3;
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public long lMeth(double d, int i2) {

        float f3=1.989F;
        int i12=221, iArr[]=new int[N];

        FuzzerUtils.init(iArr, 90);

        i2 = i2;
        i2 = i2;
        i2 = (int)((iArr[(i2 >>> 1) % N] -= (int)(-(i2 - 142L))) - (fMeth(f3, f3, i2) + f3));
        i12 >>= i2;
        long meth_res = Double.doubleToLongBits(d) + i2 + Float.floatToIntBits(f3) + i12 + FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=18977, i1=0, i13=-4, i14=172, i15=14, i16=-3, i17=14, i18=-51655, i19=34293, i20=-10, iArr1[][]=new
            int[N][N];
        boolean b=false;
        double d2=101.110276;
        float f4=27.2F;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr1, 12);
        FuzzerUtils.init(lArr, -120L);

        for (i = 162; i > 2; i--) {
            Test.instanceCount <<= lMeth(Test.dFld, i1);
            i1 += 80;
            for (i13 = 6; i13 < 157; ++i13) {
                b = b;
                Test.instanceCount = i1;
                i14 += (i13 * i13);
                Test.instanceCount <<= i;
            }
            Test.instanceCount += (i + i1);
        }
        for (i15 = 3; 214 > i15; i15 += 2) {
            i17 = 1;
            while (++i17 < 239) {
                i14 += i15;
            }
            iArr1[i15 + 1][i15 - 1] = (int)Test.instanceCount;
            for (d2 = 239; 5 < d2; d2--) {
                switch ((i15 % 9) + 100) {
                case 100:
                    i16 += i16;
                    Test.instanceCount = Test.instanceCount;
                    iFld = i13;
                case 101:
                    b = b;
                    Test.instanceCount += i17;
                    if (b) continue;
                    if (b) continue;
                    break;
                case 102:
                case 103:
                    iFld = i15;
                    break;
                case 104:
                    for (i19 = (int)(d2); i19 < 2; i19++) {
                        i16 = i1;
                        iArr1[i19][(int)(d2 + 1)] <<= i15;
                        Test.dFld -= -121;
                        i16 = -231;
                        lArr[(int)(d2)] *= (long)f4;
                        Test.sFld = (short)i17;
                    }
                    break;
                case 105:
                    f4 = i19;
                    break;
                case 106:
                    i16 /= (int)53778L;
                    break;
                case 107:
                    iArr1[(int)(d2)][i15 - 1] = (int)Test.dFld;
                case 108:
                    iArr1[(int)(d2)][(int)(d2)] <<= i1;
                    break;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i13 = " + i + "," + i1 + "," + i13);
        FuzzerUtils.out.println("i14 b i15 = " + i14 + "," + (b ? 1 : 0) + "," + i15);
        FuzzerUtils.out.println("i16 i17 d2 = " + i16 + "," + i17 + "," + Double.doubleToLongBits(d2));
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("f4 iArr1 lArr = " + Float.floatToIntBits(f4) + "," + FuzzerUtils.checkSum(iArr1) + ","
            + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.byFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Test.byFld);
        FuzzerUtils.out.println("Test.dFld iFld = " + Double.doubleToLongBits(Test.dFld) + "," + iFld);

        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  fMeth ->  fMeth lMeth mainTest
//DEBUG  dMeth ->  dMeth fMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
