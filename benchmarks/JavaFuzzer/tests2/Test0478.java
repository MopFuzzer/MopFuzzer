// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:34 2023
public class Test0478 {

    public static final int N = 400;

    public static long instanceCount=-1L;
    public static int iFld=48418;
    public static boolean bFld=false;
    public static float fFld=-70.533F;
    public byte byFld=31;
    public static int[] iArrFld =new int[N];
    public static float[] fArrFld =new float[N];
    public static long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test0478.iArrFld, -34);
        FuzzerUtils.init(Test0478.fArrFld, 2.210F);
        FuzzerUtils.init(Test0478.lArrFld, -1127953246744905855L);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i3=12, i4=55961, i5=-14, i6=6;
        float f=105.27F;
        double d1=0.123537, d2=2.95360;
        boolean b=false;

        if (false) {
            i3 = 1;
            do {
                Test0478.iArrFld[i3] = i3;
                i4 = i4;
                f *= i4;
                d1 = 1;
                while (++d1 < 7) {
                    Test0478.iArrFld[i3] = (int) Test0478.instanceCount;
                    i4 = (int)f;
                    b = b;
                    i4 += (int) (((d1 * Test0478.instanceCount) + i4) - Test0478.instanceCount);
                    i4 = i4;
                    Test0478.iArrFld[i3] -= (int) Test0478.instanceCount;
                    for (i5 = 1; i5 > 1; i5--) {
                        d2 -= i5;
                    }
                    if (b) break;
                }
            } while (++i3 < 222);
        }
        vMeth1_check_sum += i3 + i4 + Float.floatToIntBits(f) + Double.doubleToLongBits(d1) + (b ? 1 : 0) + i5 + i6 +
            Double.doubleToLongBits(d2);
    }

    public static long lMeth(long l1, double d, long l2) {

        int i2=1, i7=228, i8=156, i9=104, i10=-41638, i11=13;
        float f1=2.319F;
        short s=31589;

        i2 -= (--Test0478.iArrFld[(i2 >>> 1) % N]);
        Test0478.fArrFld = Test0478.fArrFld;
        vMeth1();
        for (i7 = 4; i7 < 179; ++i7) {
            i8 -= i2;
            if (false) {
                Test0478.iArrFld[i7 + 1] = Test0478.iFld;
                l2 = Test0478.iFld;
                i8 += (((i7 * i7) + i8) - i2);
                Test0478.iArrFld[i7] = (int) l1;
            } else if (Test0478.bFld) {
                for (i9 = 9; i9 > 1; i9 -= 3) {
                    i11 = 1;
                    do {
                        f1 += i11;
                    } while (++i11 < 5);
                }
                Test0478.iArrFld[i7 - 1] <<= s;
            } else {
                Test0478.iFld <<= i11;
            }
        }
        long meth_res = l1 + Double.doubleToLongBits(d) + l2 + i2 + i7 + i8 + i9 + i10 + i11 + Float.floatToIntBits(f1)
            + s;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(long l) {

        int i=46353, i1=11, i12=6, i13=28220, i14=-6;
        double d3=0.90784;
        short s1=-11027;

        for (i = 9; i < 318; i++) {
            float f2=87.180F;
            Test0478.instanceCount += (i + ((--i1) % (lMeth(l, d3, Test0478.instanceCount) | 1)));
            f2 = Test0478.iFld;
            f2 = Test0478.iFld;
            i1 += (int)f2;
            i12 = 1;
            while (++i12 < 5) {
                Test0478.lArrFld[i - 1] -= (long) f2;
                for (i13 = 1; i13 < 1; i13++) {
                    try {
                        Test0478.iFld = (i13 % -11666);
                        Test0478.iArrFld[i12 + 1] = (1665059298 % Test0478.iArrFld[i13]);
                        Test0478.iFld = (i14 / -53);
                    } catch (ArithmeticException a_e) {}
                    i14 += (((i13 * Test0478.iFld) + Test0478.instanceCount) - Test0478.iFld);
                    l = Test0478.iFld;
                    i14 = (int)l;
                    Test0478.bFld = Test0478.bFld;
                    i1 = (int)f2;
                    d3 = s1;
                }
            }
        }
        vMeth_check_sum += l + i + i1 + Double.doubleToLongBits(d3) + i12 + i13 + i14 + s1;
    }

    public void mainTest(String[] strArr1) {

        double d4=-2.51964;
        short s2=6838;
        short[] sArr =new short[N];
        int i15=-19, i16=-1, i17=217, i18=43, i19=-10, i20=-1, i21=51004;
        float f3=0.161F;

        FuzzerUtils.init(sArr, (short)-3096);

        vMeth(Test0478.instanceCount);
        Test0478.instanceCount += Test0478.iFld;
        d4 -= s2;
        for (i15 = 6; i15 < 325; i15++) {
            i16 += (((i15 * Test0478.instanceCount) + f3) - Test0478.instanceCount);
            i17 += i15;
            for (i18 = 1; 79 > i18; i18++) {
                Test0478.fFld += (i18 + i17);
                i17 += i18;
                if (Test0478.bFld) break;
                if (false) {
                    for (i20 = 2; i20 > 1; i20--) {
                        Test0478.instanceCount *= i21;
                        Test0478.iFld += (((i20 * i15) + Test0478.iFld) - i17);
                        switch ((((i16 >>> 1) % 4) * 5) + 87) {
                        case 91:
                            try {
                                i17 = (i19 % i20);
                                i19 = (i20 / 914475029);
                                i21 = (i19 / -59456);
                            } catch (ArithmeticException a_e) {}
                            Test0478.instanceCount = i20;
                            d4 = byFld;
                        case 102:
                            s2 = (short)-51.760F;
                            i16 += i20;
                            sArr[i20 + 1] -= (short)12794;
                            break;
                        case 96:
                            i17 += (((i20 * i16) + i15) - i19);
                            f3 = Test0478.iFld;
                            try {
                                i17 = (i18 % -1039);
                                i16 = (Test0478.iFld / 22);
                                Test0478.iFld = (i20 / -50496);
                            } catch (ArithmeticException a_e) {}
                            Test0478.instanceCount += (((i20 * i17) + i18) - i21);
                        case 100:
                        default:
                            i17 += i21;
                            i21 += i20;
                            if (Test0478.bFld) {
                                f3 = s2;
                            }
                            i21 >>= i20;
                        }
                    }
                }
            }
        }

        FuzzerUtils.out.println("d4 s2 i15 = " + Double.doubleToLongBits(d4) + "," + s2 + "," + i15);
        FuzzerUtils.out.println("i16 f3 i17 = " + i16 + "," + Float.floatToIntBits(f3) + "," + i17);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 sArr = " + i21 + "," + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test0478.instanceCount Test0478.iFld Test0478.bFld = " + Test0478.instanceCount + "," + Test0478.iFld +
                "," + (Test0478.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0478.fFld byFld Test0478.iArrFld = " + Float.floatToIntBits(Test0478.fFld) + "," + byFld + ","
                + FuzzerUtils.checkSum(Test0478.iArrFld));
        FuzzerUtils.out.println("Test0478.fArrFld Test0478.lArrFld = " +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0478.fArrFld)) + "," + FuzzerUtils.checkSum(Test0478.lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0478 _instance = new Test0478();
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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}