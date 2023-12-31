// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:16 2023
public class Test0096 {

    public static final int N = 400;

    public static long instanceCount=224710966L;
    public static float fFld=-30.136F;
    public static short sFld=13153;
    public static boolean bFld=true;
    public static double dFld=111.78718;
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0096.iArrFld, -170);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i2) {


        Test0096.iArrFld[(i2 >>> 1) % N] = i2;
        Test0096.fFld = -10;
        vMeth2_check_sum += i2;
    }

    public static void vMeth1(int i1) {


        vMeth2(i1);
        vMeth1_check_sum += i1;
    }

    public static void vMeth(boolean b, int i) {

        int i3=-11, i4=-11, i5=7, i6=27891;
        long[] lArr =new long[N];
        boolean[] bArr =new boolean[N];

        FuzzerUtils.init(lArr, -8787549557103681895L);
        FuzzerUtils.init(bArr, false);

        i *= i;
        vMeth1(i);
        for (i3 = 2; i3 < 144; i3++) {
            lArr[i3 + 1] >>>= Test0096.instanceCount;
            i4 += (i3 * i3);
            switch (((i4 >>> 1) % 1) + 92) {
            case 92:
                for (i5 = 1; i5 < 11; ++i5) {
                    byte by=19;
                    i4 *= i5;
                    i4 += -194;
                    by *= (byte)-3L;
                    Test0096.sFld = (short) i4;
                }
                i6 += i;
                break;
            }
            Test0096.iArrFld[i3 - 1] = i4;
            Test0096.instanceCount += (((i3 * Test0096.fFld) + Test0096.instanceCount) - Test0096.instanceCount);
            bArr[i3 + 1] = b;
        }
        vMeth_check_sum += (b ? 1 : 0) + i + i3 + i4 + i5 + i6 + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(bArr);
    }

    public void mainTest(String[] strArr1) {

        int i7=-37493, i8=5631, i9=-20121, i10=5, i11=15289, i12=-16;
        double d=62.83421;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(lArr1, 236L);

        vMeth(Test0096.bFld, -59);
        i7 = 338;
        do {
            if (true) break;
            d = 1;
            do {
                i8 = i8;
                i8 = i8;
                switch ((int)((d % 6) + 66)) {
                case 66:
                    i8 = i8;
                    break;
                case 67:
                    Test0096.instanceCount = Test0096.instanceCount;
                    i8 -= Test0096.sFld;
                case 68:
                    Test0096.bFld = Test0096.bFld;
                    for (i9 = 1; i9 < 1; i9++) {
                        i8 ^= (int) Test0096.instanceCount;
                        i10 = i7;
                        i10 >>= i10;
                        i8 *= i10;
                        Test0096.fFld *= 163;
                        i10 += i9;
                        Test0096.iArrFld = FuzzerUtils.int1array(N, (int) -3);
                        Test0096.instanceCount *= i7;
                        if (true) break;
                    }
                    i8 -= i9;
                    Test0096.dFld += i8;
                case 69:
                    i10 -= i10;
                    break;
                case 70:
                    Test0096.instanceCount += Test0096.instanceCount;
                    i10 = (int) Test0096.dFld;
                    i10 += (int)(d + i9);
                case 71:
                    for (i11 = 1; 1 > i11; i11++) {
                        i10 += (((i11 * i11) + i12) - Test0096.instanceCount);
                        Test0096.sFld -= (short) Test0096.fFld;
                    }
                    break;
                default:
                    lArr1[(int)(d + 1)] += i10;
                }
            } while (++d < 74);
        } while (--i7 > 0);

        FuzzerUtils.out.println("i7 d i8 = " + i7 + "," + Double.doubleToLongBits(d) + "," + i8);
        FuzzerUtils.out.println("i9 i10 i11 = " + i9 + "," + i10 + "," + i11);
        FuzzerUtils.out.println("i12 lArr1 = " + i12 + "," + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test0096.instanceCount Test0096.fFld Test0096.sFld = " + Test0096.instanceCount + "," +
                Float.floatToIntBits(Test0096.fFld) + "," + Test0096.sFld);
        FuzzerUtils.out.println("Test0096.bFld Test0096.dFld Test0096.iArrFld = " + (Test0096.bFld ? 1 : 0) + "," +
                Double.doubleToLongBits(Test0096.dFld) + "," + FuzzerUtils.checkSum(Test0096.iArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0096 _instance = new Test0096();
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
