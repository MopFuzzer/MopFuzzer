// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:58 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-15582L;
    public byte byFld=31;
    public static volatile double dFld=0.58790;
    public static float fFld=1.506F;
    public static byte byFld1=-49;
    public static int iArrFld[]=new int[N];
    public static short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 2);
        FuzzerUtils.init(Test.sArrFld, (short)12893);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i5=-42933, i6=2, i7=-236, i8=12787, i9=3, i10=-128;
        byte by1=62;
        short s1=18471;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -71.98F);

        i5 = i5;
        i6 = 1;
        do {
            for (i7 = 1; 5 > i7; i7++) {
                for (i9 = 1; i9 < 2; i9++) {
                    switch (((i10 >>> 1) % 8) + 36) {
                    case 36:
                        fArr[i9] += Test.instanceCount;
                        Test.fFld += i9;
                        by1 -= (byte)i7;
                        Test.instanceCount = i6;
                        break;
                    case 37:
                        Test.fFld += i9;
                        i10 >>= i7;
                        break;
                    case 38:
                        i8 = (int)-56609L;
                        s1 -= (short)Test.instanceCount;
                    case 39:
                        i8 += i9;
                        break;
                    case 40:
                    case 41:
                        Test.iArrFld[i9] = i9;
                    case 42:
                        i10 -= i9;
                        break;
                    case 43:
                        i8 = i9;
                        break;
                    }
                }
            }
        } while (++i6 < 353);
        vMeth1_check_sum += i5 + i6 + i7 + i8 + i9 + i10 + by1 + s1 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth(byte by) {

        int i3=5, i4=-1;

        for (i3 = 3; 379 > i3; ++i3) {
            Test.dFld = by;
            vMeth1();
            i4 = i4;
            Test.iArrFld[i3] <<= i3;
        }
        vMeth_check_sum += by + i3 + i4;
    }

    public static void vSmallMeth(long l, int i2) {


        i2 <<= Test.sArrFld[(i2 >>> 1) % N];
        vMeth(Test.byFld1);
        vSmallMeth_check_sum += l + i2;
    }

    public void mainTest(String[] strArr1) {

        double d=-76.21237;
        int i=11, i1=-213, i11=44301, i12=156, i13=4, i14=-46, i15=-3, i16=14222, i17=0, i18=200;
        short s=19845;
        float f=0.442F, f1=-2.365F, fArr1[]=new float[N];
        boolean b=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -7813115918066946958L);
        FuzzerUtils.init(fArr1, -2.311F);

        Test.instanceCount -= (long)((Test.instanceCount++) * ((d + Test.instanceCount) * (Test.instanceCount--)));
        for (i = 14; 333 > i; ++i) {
            Test.iArrFld[i + 1] <<= (--byFld);
            i1 += (s--);
        }
        switch (((((int)(f * i1)) >>> 1) % 1) + 83) {
        case 83:
            for (int smallinvoc=0; smallinvoc<948; smallinvoc++) vSmallMeth(Test.instanceCount, -1);
            break;
        default:
            i1 -= i;
            for (f1 = 6; f1 < 237; ++f1) {
                i1 += (int)(f1 - Test.instanceCount);
                b = b;
            }
            i12 = 1;
            while (++i12 < 348) {
                lArr[i12 + 1] = -13L;
                for (i13 = 4; i13 < 72; ++i13) {
                    b = false;
                    b = true;
                    Test.fFld -= i13;
                    Test.iArrFld[i13 - 1] -= i1;
                    i1 ^= byFld;
                    b = b;
                    Test.iArrFld[i12 - 1] = i1;
                }
                i14 -= (int)-41.253F;
                byFld *= (byte)i14;
                Test.instanceCount += i;
                for (i15 = i12; i15 < 72; i15 += 3) {
                    i11 += i15;
                    for (i17 = 1; i17 < 1; ++i17) {
                        Test.iArrFld[i15] = i13;
                        Test.instanceCount |= i;
                        d = -137;
                        fArr1[i17] = 6;
                    }
                }
            }
        }

        FuzzerUtils.out.println("d i i1 = " + Double.doubleToLongBits(d) + "," + i + "," + i1);
        FuzzerUtils.out.println("s f f1 = " + s + "," + Float.floatToIntBits(f) + "," + Float.floatToIntBits(f1));
        FuzzerUtils.out.println("i11 b i12 = " + i11 + "," + (b ? 1 : 0) + "," + i12);
        FuzzerUtils.out.println("i13 i14 i15 = " + i13 + "," + i14 + "," + i15);
        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("lArr fArr1 = " + FuzzerUtils.checkSum(lArr) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));

        FuzzerUtils.out.println("Test.instanceCount byFld Test.dFld = " + Test.instanceCount + "," + byFld + "," +
            Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.fFld Test.byFld1 Test.iArrFld = " + Float.floatToIntBits(Test.fFld) + "," +
            Test.byFld1 + "," + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.sArrFld = " + FuzzerUtils.checkSum(Test.sArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
