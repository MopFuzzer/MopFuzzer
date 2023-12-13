// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:56 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=5926816804793121778L;
    public static volatile int iFld=19615;
    public volatile float fFld=4.952F;
    public int iFld1=-4;
    public short sFld=-5160;
    public static double dArrFld[]=new double[N];
    public static int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 0.2367);
        FuzzerUtils.init(Test.iArrFld, -17149);
        FuzzerUtils.init(Test.fArrFld, -1.310F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long byMeth_check_sum = 0;

    public static byte byMeth(long l2, long l3, int i5) {

        float f2=-2.745F;

        Test.iFld += i5;
        f2 -= 221;
        Test.instanceCount *= (long)2.119398;
        long meth_res = l2 + l3 + i5 + Float.floatToIntBits(f2);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public static void vMeth1(double d) {

        int i3=6, i4=2, i6=1, i7=-32252, iArr[][]=new int[N][N];
        float f3=104.108F, f4=1.1016F;
        byte by=-80;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -3808237328L);
        FuzzerUtils.init(iArr, 7789);

        for (i3 = 16; i3 < 316; i3++) {
            Test.dArrFld[i3 + 1] = 22.464F;
            Test.iFld += (int)lArr[i3];
            i4 -= (int)7.73990;
        }
        for (long l1 : lArr) {
            if (((i4--) + l1) >= d) break;
            Test.iFld = byMeth(l1, Test.instanceCount, Test.iFld);
            for (f3 = 1; 4 > f3; ++f3) {
                i6 %= (int)508293049058249419L;
                iArr[(5622 >>> 1) % N][(int)(f3 + 1)] = i3;
                f4 /= (Test.iFld | 1);
                by -= (byte)i6;
                i6 %= -84;
                Test.iFld += i4;
                i7 = 71;
            }
        }
        vMeth1_check_sum += Double.doubleToLongBits(d) + i3 + i4 + Float.floatToIntBits(f3) + i6 +
            Float.floatToIntBits(f4) + by + i7 + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth() {

        float f=-90.660F, f1=7.261F;
        int i2=-111, i8=-11, i9=143, i10=9;
        double d1=7.107714, d2=116.128576;

        Test.instanceCount -= Math.abs(Test.iFld);
        Test.instanceCount -= (long)(((-(++f)) + Math.abs(f)) % (((long)(-(Test.iFld - f))) | 1));
        for (f1 = 19; f1 < 325; ++f1) {
            vMeth1(d1);
            for (d2 = 1; 5 > d2; d2++) {
                d1 *= -132;
                Test.iFld = i2;
                d1 += i2;
                i2 += (int)(((d2 * i2) + Test.instanceCount) - Test.instanceCount);
                for (i9 = 2; 1 < i9; i9 -= 3) {
                    int i11=50016;
                    i2 += Test.iFld;
                    i8 >>= i9;
                    d1 += Test.instanceCount;
                    i2 *= Test.iFld;
                    Test.iArrFld[i9 - 1] += i11;
                }
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f) + Float.floatToIntBits(f1) + i2 + Double.doubleToLongBits(d1) +
            Double.doubleToLongBits(d2) + i8 + i9 + i10;
    }

    public void mainTest(String[] strArr1) {

        int i=-47, i1=15784, i12=-6, i13=-141, i14=-10, i15=50591, i16=-57949, i17=8;
        long l=-12L, l4=-2957814275026002359L, lArr1[]=new long[N];
        double d3=2.84280;
        boolean b=false;

        FuzzerUtils.init(lArr1, 9L);

        i = 1;
        do {
            for (l = i; l < 74; l++) {
                Test.instanceCount -= ((Test.instanceCount++) * Math.min(++Test.iFld, i1 * i));
                Test.instanceCount = (-7604 * (Test.instanceCount--));
                vMeth();
                fFld *= i1;
                d3 %= (i | 1);
                Test.iArrFld = Test.iArrFld;
                for (l4 = 1; l4 < 1; ++l4) {
                    if (b) break;
                    Test.fArrFld[(int)(l4 - 1)] = fFld;
                    i1 = i12;
                    i1 = Test.iFld;
                    Test.iFld *= i1;
                    iFld1 -= (int)fFld;
                    if (b) continue;
                    fFld += (((l4 * i12) + l4) - i1);
                    i12 += (int)(l4 * Test.instanceCount);
                    if (b) continue;
                }
                Test.iFld += (int)l;
                fFld += (l * sFld);
            }
            Test.iArrFld[i - 1] = (int)l4;
            for (i13 = 1; 74 > i13; i13++) {
                i15 = 1;
                while (++i15 < 2) {
                    Test.iArrFld = FuzzerUtils.int1array(N, (int)177);
                }
                i12 += i13;
                for (i16 = i13; 2 > i16; i16++) {
                    i12 += i16;
                    lArr1[i13 + 1] -= sFld;
                    Test.iArrFld[i13] >>>= i12;
                }
            }
        } while (++i < 339);

        FuzzerUtils.out.println("i l i1 = " + i + "," + l + "," + i1);
        FuzzerUtils.out.println("d3 l4 i12 = " + Double.doubleToLongBits(d3) + "," + l4 + "," + i12);
        FuzzerUtils.out.println("b i13 i14 = " + (b ? 1 : 0) + "," + i13 + "," + i14);
        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("lArr1 = " + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld fFld = " + Test.instanceCount + "," + Test.iFld + "," +
            Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("iFld1 sFld Test.dArrFld = " + iFld1 + "," + sFld + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));
        FuzzerUtils.out.println("Test.iArrFld Test.fArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));

        FuzzerUtils.out.println("byMeth_check_sum: " + byMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  byMeth ->  byMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
