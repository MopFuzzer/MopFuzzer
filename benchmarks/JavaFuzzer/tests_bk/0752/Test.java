// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:12 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-3L;
    public int iFld=20193;
    public static int iFld1=11808;
    public static volatile float fFld=-51.878F;
    public volatile double dFld=-10.28739;
    public float fArrFld[]=new float[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 45);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i1, double d, long l1) {


        i1 += 9269;
        vMeth1_check_sum += i1 + Double.doubleToLongBits(d) + l1;
    }

    public static void vMeth(int i) {

        double d1=117.119063;

        i = (int)(Test.instanceCount--);
        vMeth1(i, d1, -28413L);
        vMeth_check_sum += i + Double.doubleToLongBits(d1);
    }

    public static int iMeth(float f, long l, float f1) {


        vMeth(Test.iFld1);
        long meth_res = Float.floatToIntBits(f) + l + Float.floatToIntBits(f1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i2=-8, i3=-11, i4=33155, i5=13, i6=1607, i7=-2, i8=-9, i9=6, i10=73, iArr[][]=new int[N][N];
        boolean b=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 14);
        FuzzerUtils.init(lArr, 8162930730907951597L);

        iFld -= iMeth(Test.fFld, -2777460008L, Test.fFld);
        for (i2 = 344; i2 > 3; i2 -= 2) {
            try {
                i3 = (i3 % -924171438);
                i3 = (iFld / i3);
                iFld = (iArr[i2][i2 - 1] / 1160);
            } catch (ArithmeticException a_e) {}
            iFld = i2;
            Test.instanceCount += iFld;
            i3 -= 55;
            for (i4 = i2; i4 < 148; i4++) {
                i3 -= (int)Test.fFld;
                i3 *= (int)Test.instanceCount;
                i3 = 9;
                fArrFld[i2 + 1] = Test.instanceCount;
                for (i6 = 1; i6 < 1; i6++) {
                    lArr[i2 - 1] += (long)Test.fFld;
                    Test.instanceCount <<= Test.instanceCount;
                    i8 -= (int)Test.fFld;
                    if (false) continue;
                }
                i7 <<= iFld;
                i8 = i3;
                for (i9 = 1; 1 > i9; i9++) {
                    Test.iFld1 = i2;
                    iArr[(-10 >>> 1) % N][i2] -= i4;
                    iArr[i9 + 1][i2 - 1] &= i5;
                    i10 += (i9 + i5);
                }
                Test.fFld -= Test.iFld1;
                Test.instanceCount -= i5;
            }
            iArr[i2][i2] /= (int)(Test.instanceCount | 1);
            i3 = i4;
        }
        if (b) {
            i10 = (int)Test.fFld;
            dFld = Test.iFld1;
        } else {
            iArr[(i2 >>> 1) % N][(i2 >>> 1) % N] *= i3;
        }

        FuzzerUtils.out.println("i2 i3 i4 = " + i2 + "," + i3 + "," + i4);
        FuzzerUtils.out.println("i5 i6 i7 = " + i5 + "," + i6 + "," + i7);
        FuzzerUtils.out.println("i8 i9 i10 = " + i8 + "," + i9 + "," + i10);
        FuzzerUtils.out.println("b iArr lArr = " + (b ? 1 : 0) + "," + FuzzerUtils.checkSum(iArr) + "," +
            FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test.instanceCount iFld Test.iFld1 = " + Test.instanceCount + "," + iFld + "," +
            Test.iFld1);
        FuzzerUtils.out.println("Test.fFld dFld fArrFld = " + Float.floatToIntBits(Test.fFld) + "," +
            Double.doubleToLongBits(dFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
