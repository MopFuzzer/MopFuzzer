// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:35 2023
public class Test0510 {

    public static final int N = 400;

    public static long instanceCount=-1191524803L;
    public static int iFld=-20019;
    public static float fFld=-38.820F;
    public static volatile boolean bFld=true;
    public static double[] dArrFld =new double[N];

    static {
        FuzzerUtils.init(Test0510.dArrFld, 0.52713);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1() {

        int i9=-246;
        int i11=63136;
        int[] iArr2 =new int[N];
        float f1=0.907F;
        short[] sArr =new short[N];
        long[] lArr =new long[N];

        FuzzerUtils.init(sArr, (short)29818);
        FuzzerUtils.init(iArr2, -47);
        FuzzerUtils.init(lArr, 73L);

        sArr[(Test0510.iFld >>> 1) % N] >>= (short) 43779;
        Test0510.bFld = Test0510.bFld;
        Test0510.iFld = (int) Test0510.fFld;
        i9 = 1;
        while (++i9 < 326) {
            Test0510.iFld += (((i9 * i9) + i9) - Test0510.instanceCount);
            for (f1 = 1; f1 < 5; ++f1) {
                i11 -= 14622;
                Test0510.dArrFld[(int) (f1 + 1)] = Test0510.instanceCount;
                lArr = lArr;
                lArr[i9 + 1] = (long)f1;
                iArr2[i9] = (int)-298439160L;
                Test0510.instanceCount -= Test0510.instanceCount;
                i11 -= -4;
                Test0510.iFld <<= i11;
            }
        }
        long meth_res = i9 + Float.floatToIntBits(f1) + i11 + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr2)
            + FuzzerUtils.checkSum(lArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth() {

        int i1=-119;
        int i2=-11657;
        int i3=-41088;
        int i4=-6;
        int i5=218;
        int i6=41;
        int i7=41916;
        int i8=-4346;
        int[] iArr =new int[N];
        int[] iArr1 =new
                    int[N];
        double d=-2.25353;
        byte by=-69;
        long l=10L;

        FuzzerUtils.init(iArr, 10);
        FuzzerUtils.init(iArr1, -15);

        iArr[(Test0510.iFld >>> 1) % N] += Test0510.iFld;
        for (i1 = 228; 12 < i1; i1--) {
            for (i3 = 1; 7 > i3; ++i3) {
                i4 += (((i3 * i2) + Test0510.fFld) - i1);
            }
            for (i5 = 1; i5 < 7; ++i5) {
                d += (--by);
                for (i7 = 2; i7 > i5; i7--) {
                    Test0510.instanceCount = (++i2);
                    Test0510.fFld += (((i7 * Test0510.instanceCount) + i8) - Test0510.iFld);
                    i6 += (223 + (i7 * i7));
                    Test0510.instanceCount &= (l++);
                    i8 = (--i4);
                }
                i8 %= (int) (Math.abs((int) ((Test0510.fFld + i8) + (i8 + d))) | 1);
                i8 = (int)(l--);
                iArr1[i5] -= (int) (iMeth1() - Test0510.fFld);
            }
        }
        long meth_res = i1 + i2 + i3 + i4 + i5 + i6 + Double.doubleToLongBits(d) + by + i7 + i8 + l +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(float f, int i) {

        int i12=10;
        int i13=1;
        int i14=-13094;
        int i15=-4202;
        int i16=-10;
        int[] iArr3 =new int[N];
        double d1=1.124183;

        FuzzerUtils.init(iArr3, 13);

        i = iMeth();
        i12 = 1;
        while (++i12 < 254) {
            for (i13 = 1; i13 < 6; i13 += 2) {
                Test0510.fFld = i13;
                i14 = i14;
                Test0510.instanceCount = (long) d1;
                Test0510.iFld -= (int) Test0510.instanceCount;
            }
            iArr3[i12] ^= -116;
            for (i15 = 1; 6 > i15; ++i15) {
                iArr3[i15 + 1] = i16;
                Test0510.instanceCount = -16;
                i += (i15 * i15);
                Test0510.fFld -= -3;
                iArr3[(i15 >>> 1) % N] -= 7;
                try {
                    Test0510.iFld = (Test0510.iFld % i);
                    i14 = (iArr3[i15] % -63232);
                    iArr3[i12] = (i12 % i);
                } catch (ArithmeticException a_e) {}
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f) + i + i12 + i13 + i14 + Double.doubleToLongBits(d1) + i15 + i16 +
            FuzzerUtils.checkSum(iArr3);
    }

    public void mainTest(String[] strArr1) {


        vMeth(-108.900F, Test0510.iFld);


        FuzzerUtils.out.println("Test0510.instanceCount Test0510.iFld Test0510.fFld = " + Test0510.instanceCount + "," + Test0510.iFld +
                "," + Float.floatToIntBits(Test0510.fFld));
        FuzzerUtils.out.println("Test0510.bFld Test0510.dArrFld = " + (Test0510.bFld ? 1 : 0) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0510.dArrFld)));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0510 _instance = new Test0510();
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
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
