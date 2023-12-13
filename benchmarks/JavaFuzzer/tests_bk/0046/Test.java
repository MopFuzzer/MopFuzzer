// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:54 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=10L;
    public static volatile double dFld=-69.117900;
    public static int iFld=-8;
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 179L);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i2=96, i3=43, i5=-7790, i6=-69, i7=4, iArr[]=new int[N];
        boolean b=true;
        float f=63.163F;

        FuzzerUtils.init(iArr, 59);

        i2 -= i2;
        Test.lArrFld[(i2 >>> 1) % N] ^= -3;
        i3 = 1;
        while (++i3 < 395) {
            if (b) {
                i2 *= -2139;
                i2 = 208;
                i2 += i2;
            }
            iArr[i3] *= (int)f;
            i5 = 1;
            do {
                for (i6 = 1; i6 < 1; ++i6) {
                    iArr[i3] = 111;
                    i2 >>= i6;
                    i7 *= i6;
                    b = b;
                    iArr[i5] -= i3;
                }
            } while (++i5 < 4);
        }
        long meth_res = i2 + i3 + (b ? 1 : 0) + Float.floatToIntBits(f) + i5 + i6 + i7 + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i, int i1) {

        int i8=3510, i9=-224, i11=50569, i12=-34097, i13=-5, i14=2, iArr1[]=new int[N];
        boolean b1=true;
        float f1=60.501F, fArr[]=new float[N];
        short s=9546;

        FuzzerUtils.init(iArr1, 26967);
        FuzzerUtils.init(fArr, -89.504F);

        i -= iMeth();
        for (i8 = 11; i8 < 319; i8++) {
            Test.instanceCount += i8;
            if (b1) continue;
            for (i11 = 5; i11 > 1; i11--) {
                for (i13 = 2; 1 < i13; --i13) {
                    fArr[i8] += f1;
                    s += (short)(((i13 * Test.instanceCount) + i12) - Test.instanceCount);
                    i9 *= (int)Test.instanceCount;
                    iArr1[i13 - 1] -= i13;
                    Test.dFld *= i8;
                }
                i12 += (4 + (i11 * i11));
                f1 -= i8;
            }
            f1 += (i8 * i1);
            i += (i8 * i1);
        }
        vMeth_check_sum += i + i1 + i8 + i9 + (b1 ? 1 : 0) + i11 + i12 + i13 + i14 + Float.floatToIntBits(f1) + s +
            FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vSmallMeth() {


        vMeth(Test.iFld, Test.iFld);
        Test.iFld += Test.iFld;
        vSmallMeth_check_sum += 0;
    }

    public void mainTest(String[] strArr1) {


        for (int smallinvoc=0; smallinvoc<895; smallinvoc++) vSmallMeth();


        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.iFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(Test.dFld) + "," + Test.iFld);
        FuzzerUtils.out.println("Test.lArrFld = " + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  iMeth ->  iMeth vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}