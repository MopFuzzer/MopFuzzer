// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:53 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=240L;
    public int iFld=-224;
    public static double dFld=0.106534;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -1873651794078255282L);
        FuzzerUtils.init(Test.iArrFld, -64767);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static void vSmallMeth(int i, int i1) {

        int iArr[]=new int[N];

        FuzzerUtils.init(iArr, 11);

        iArr[(i1 >>> 1) % N] = i1;
        vSmallMeth_check_sum += i + i1 + FuzzerUtils.checkSum(iArr);
    }

    public static long lMeth(long l1) {

        long l2=2054505799L;
        int i8=40, i9=-36879, i10=12546, i11=-12, i12=174;
        float f=1.920F;
        boolean b1=false;

        for (int i7 : Test.iArrFld) {
            for (l2 = 1; l2 < 4; l2++) {
                l1 -= (long)(f--);
                i7 = (int)(Math.max(Test.iArrFld[(int)(l2 - 1)], (int)(Test.instanceCount + -32490)) +
                    ((-875813688282089918L - Test.instanceCount) * Math.abs(Test.dFld)));
                vSmallMeth(i7, -10);
            }
        }
        i9 = 1;
        do {
            if (b1) {
                Test.lArrFld[i9 + 1] -= i8;
                l1 += (((i9 * i9) + i8) - i8);
            } else if (b1) {
                for (i10 = 1; 11 > i10; i10++) {
                    Test.iArrFld[i10] = (int)f;
                    if (i8 != 0) {
                    }
                }
                try {
                    i11 = (i9 / 116);
                    i11 = (Test.iArrFld[i9 + 1] % 24612);
                    i8 = (113 % i8);
                } catch (ArithmeticException a_e) {}
                i12 += i9;
            } else {
                l1 = (long)Test.dFld;
            }
        } while (++i9 < 148);
        long meth_res = l1 + l2 + i8 + Float.floatToIntBits(f) + i9 + i10 + i11 + i12 + (b1 ? 1 : 0);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i3, long l) {

        int i4=167, i5=57, i6=49386, i13=163, i14=-17048;
        byte by=81;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)-32285);

        i4 = 192;
        do {
            for (i5 = 1; i5 < 16; ++i5) {
                i3 -= i3;
                i3 += i5;
                i6 -= ((i6 ^= Test.iArrFld[i5 + 1]) + sArr[i5 - 1]);
            }
            i3 -= (int)lMeth(2095814599628318483L);
            Test.lArrFld[i4 - 1] += Test.instanceCount;
            for (i13 = 1; i13 < 16; ++i13) {
                i6 += i13;
                i6 += i13;
                i3 -= by;
            }
        } while ((i4 -= 2) > 0);
        i6 = i5;
        i3 *= (int)l;
        i14 += i14;
        i14 += i6;
        vMeth_check_sum += i3 + l + i4 + i5 + i6 + i13 + i14 + by + FuzzerUtils.checkSum(sArr);
    }

    public void mainTest(String[] strArr1) {

        boolean b=true;
        short s=-11580;

        Test.instanceCount -= iFld;
        for (int smallinvoc=0; smallinvoc<822; smallinvoc++) vSmallMeth(iFld--, iFld);
        b = b;
        s -= (short)((Test.lArrFld[(220 >>> 1) % N]--) * (-(iFld--)));
        for (int i2 : Test.iArrFld) {
            Test.iArrFld[(137 >>> 1) % N] >>= -305;
        }
        vMeth(12, Test.instanceCount);

        FuzzerUtils.out.println("b s = " + (b ? 1 : 0) + "," + s);

        FuzzerUtils.out.println("Test.instanceCount iFld Test.dFld = " + Test.instanceCount + "," + iFld + "," +
            Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.lArrFld Test.iArrFld = " + FuzzerUtils.checkSum(Test.lArrFld) + "," +
            FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test lMeth vMeth
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}