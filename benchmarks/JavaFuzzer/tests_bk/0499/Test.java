// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:05 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-1411828873L;
    public static volatile int iFld=7;
    public static double dFld=-1.38718;
    public static boolean bFld=true;
    public float fFld=-1.455F;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -7);
        FuzzerUtils.init(Test.lArrFld, 7L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i16, int i17, boolean b) {

        float f1=0.343F, f2=-2.335F;
        int i19=60327, i20=-208, i21=5764, i22=135;
        short s2=17960;
        byte by=59;

        for (int i18 : Test.iArrFld) {
            float f=41.617F;
            Test.iArrFld[(Test.iFld >>> 1) % N] = i17;
            Test.dFld += Test.iFld;
            f -= Test.iFld;
            if (b) break;
        }
        Test.instanceCount = (long)f1;
        Test.iArrFld[(i16 >>> 1) % N] *= 9;
        f2 = 1;
        while (++f2 < 367) {
            for (i19 = 1; 5 > i19; i19++) {
                s2 -= (short)Test.dFld;
                for (i21 = 1; i21 < 2; i21++) {
                    f1 += i21;
                    Test.instanceCount = Test.iFld;
                    i16 = 14;
                    by += (byte)(i21 * i21);
                }
            }
        }
        vMeth2_check_sum += i16 + i17 + (b ? 1 : 0) + Float.floatToIntBits(f1) + Float.floatToIntBits(f2) + i19 + i20 +
            s2 + i21 + i22 + by;
    }

    public static void vMeth1() {

        short s1=16313;
        int i8=5, i9=8, i10=-7131, i11=16674, i12=-14, i13=-20622, i14=-183, i15=-106;
        double d=-77.30678;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -1L);

        Test.iFld = Test.iFld;
        Test.iArrFld[(Test.iFld >>> 1) % N] = (s1--);
        Test.iArrFld[(Test.iFld >>> 1) % N] += (++Test.iFld);
        lArr1 = (lArr1 = (lArr1 = (lArr1 = FuzzerUtils.long1array(N, (long)4073963029760106050L))));
        Test.instanceCount *= (Test.iFld + Test.iFld);
        for (i8 = 10; i8 < 259; ++i8) {
            Test.iFld -= (int)(((d * s1) + (--Test.iFld)) - ((Test.instanceCount >> i9) * (Test.iFld--)));
        }
        for (i10 = 8; i10 < 130; i10++) {
            for (i12 = 13; 1 < i12; i12 -= 3) {
                Test.iArrFld[i12 + 1] = (int)(Test.instanceCount - ((i11 + i11) - (i9 + i12)));
            }
            i9 >>= (i13++);
            for (i14 = i10; i14 < 13; ++i14) {
                vMeth2(i11, i10, Test.bFld);
                i13 += i14;
                i13 -= -18161;
            }
        }
        vMeth1_check_sum += s1 + i8 + i9 + Double.doubleToLongBits(d) + i10 + i11 + i12 + i13 + i14 + i15 +
            FuzzerUtils.checkSum(lArr1);
    }

    public static void vMeth(int i5, int i6, int i7) {


        vMeth1();
        Test.lArrFld[(i7 >>> 1) % N] += i6;
        if (Test.bFld) {
            Test.iFld = -18900;
        }
        vMeth_check_sum += i5 + i6 + i7;
    }

    public void mainTest(String[] strArr1) {

        int i=12, i1=-12, i2=85, i3=1, i4=234;
        short s=30265, sArr[]=new short[N];
        byte by1=91, byArr[]=new byte[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 1488695114356331509L);
        FuzzerUtils.init(sArr, (short)-19490);
        FuzzerUtils.init(byArr, (byte)-49);

        i = 1;
        while (++i < 236) {
            for (i1 = i; i1 < 106; ++i1) {
                for (i3 = i; i3 < 1; i3++) {
                    float f3=0.914F;
                    Test.iArrFld[i1 + 1] *= (int)((lArr[i + 1] = i2) + ((i4 - i4) + (Test.instanceCount * s)));
                    Test.iArrFld[i1 + 1] >>= (int)(++Test.instanceCount);
                    switch (((((int)(Test.instanceCount - -40743)) >>> 1) % 1) + 50) {
                    case 50:
                        i4 += i3;
                        if (Test.bFld) {
                            vMeth(-7, i3, i);
                            sArr[i - 1] = (short)53692;
                            sArr = sArr;
                            i2 += (((i3 * Test.instanceCount) + i1) - Test.instanceCount);
                        } else if (Test.bFld) {
                            i2 += (i3 + i);
                            by1 += (byte)i3;
                            i4 *= i3;
                        }
                        break;
                    default:
                        byArr[i3 - 1] -= (byte)i1;
                        s <<= (short)i1;
                        i4 = i1;
                    }
                    f3 -= i2;
                    s = (short)i3;
                    i2 += (int)Test.instanceCount;
                    i4 >>= (int)12L;
                }
                Test.iFld = (int)37481L;
            }
            i2 = i;
            Test.iArrFld[i - 1] = (int)Test.instanceCount;
            s = (short)-92;
            Test.instanceCount = (long)fFld;
            Test.instanceCount = Test.iFld;
            s = (short)fFld;
            Test.iFld *= (int)fFld;
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i4 s = " + i3 + "," + i4 + "," + s);
        FuzzerUtils.out.println("by1 lArr sArr = " + by1 + "," + FuzzerUtils.checkSum(lArr) + "," +
            FuzzerUtils.checkSum(sArr));
        FuzzerUtils.out.println("byArr = " + FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.dFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.bFld fFld Test.iArrFld = " + (Test.bFld ? 1 : 0) + "," +
            Float.floatToIntBits(fFld) + "," + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.lArrFld = " + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
