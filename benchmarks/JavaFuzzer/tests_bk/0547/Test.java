// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:07 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-15140L;
    public static byte byFld=-54;
    public static double dFld=0.77741;
    public static boolean bFld=false;
    public float fFld=1.946F;
    public static volatile int iFld=-83;
    public int iFld1=-158;
    public static int iFld2=62093;
    public static float fFld1=-2.65F;
    public static long lArrFld[]=new long[N];
    public volatile double dArrFld[]=new double[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -222L);
        FuzzerUtils.init(Test.iArrFld, 2008);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i6, int i7, double d) {

        int i8=6, i9=3, i10=230, i11=-7584, i12=6;
        float f=0.470F;

        Test.iArrFld[(i7 >>> 1) % N] -= 13;
        i6 *= (int)Test.instanceCount;
        for (i8 = 4; 293 > i8; i8++) {
            Test.instanceCount &= i6;
            i10 = 6;
            while ((i10 -= 3) > 0) {
                i6 += (i10 * i10);
                f = Test.byFld;
                for (i11 = 1; i11 < 3; i11++) {
                    switch (((3 >>> 1) % 2) + 17) {
                    case 17:
                        i9 = -7;
                        Test.instanceCount >>= i12;
                        f = i7;
                        f = i6;
                        break;
                    case 18:
                        Test.instanceCount = i11;
                        f -= Test.instanceCount;
                        break;
                    default:
                        i12 = i11;
                    }
                }
            }
        }
        vMeth1_check_sum += i6 + i7 + Double.doubleToLongBits(d) + i8 + i9 + i10 + Float.floatToIntBits(f) + i11 + i12;
    }

    public static long lMeth(int i3, int i4) {

        int i5=-133, i13=-7, i14=10, i15=-43, i16=-13;
        double d1=-1.5853;
        boolean b=true, bArr[]=new boolean[N];
        long l=10561L;
        float f1=100.141F, fArr[]=new float[N];

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(fArr, 0.236F);

        i5 = 1;
        do {
            vMeth1(i4, i3, d1);
            for (i13 = 5; i13 > 1; i13 -= 2) {
                bArr[i13 + 1] = b;
                for (i15 = 1; i15 < 3; ++i15) {
                    int i17=146;
                    i14 -= i16;
                    i14 *= (int)l;
                    switch (((i13 % 1) * 5) + 5) {
                    case 6:
                        Test.instanceCount = i4;
                        i14 *= (int)f1;
                        i16 <<= 7;
                    default:
                        d1 *= -30;
                        fArr[i15 - 1] += 11156;
                        try {
                            i14 = (Test.iArrFld[i5] / 8657);
                            i3 = (i13 % 44745);
                            i16 = (Test.iArrFld[i15] % i17);
                        } catch (ArithmeticException a_e) {}
                        i14 += (i15 * i15);
                    }
                }
            }
        } while (++i5 < 345);
        long meth_res = i3 + i4 + i5 + Double.doubleToLongBits(d1) + i13 + i14 + (b ? 1 : 0) + i15 + i16 + l +
            Float.floatToIntBits(f1) + FuzzerUtils.checkSum(bArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth() {

        int i2=27350, i18=3, i19=3, i20=164, i21=37007, i22=42339, i23=201;

        i2 = (int)lMeth(i2, i2);
        for (i18 = 10; i18 < 262; i18++) {
            i19 = i2;
            i2 *= i18;
            i2 = (int)Test.instanceCount;
            i2 += 22193;
            i20 = 1;
            while (++i20 < 6) {
                i2 = i2;
                i2 = Test.byFld;
                Test.lArrFld[i20 - 1] ^= i21;
                i19 = i18;
                for (i22 = 1; 1 > i22; ++i22) {
                    Test.dFld -= Test.instanceCount;
                    Test.instanceCount += i22;
                    Test.bFld = Test.bFld;
                }
            }
        }
        vMeth_check_sum += i2 + i18 + i19 + i20 + i21 + i22 + i23;
    }

    public void mainTest(String[] strArr1) {

        int i=-12, i1=96, i24=79, i25=64637, i26=-13268, i27=-32781, i28=-29245, i29=0, i30=-3;

        for (i = 4; i < 171; i++) {
            i1 += (((i * i1) + i) - i1);
        }
        Test.lArrFld[(i >>> 1) % N] += (long)(-(dArrFld[(i1 >>> 1) % N]--));
        vMeth();
        for (i24 = 9; i24 < 222; i24++) {
            i1 += (int)fFld;
            for (i26 = 2; i26 < 118; ++i26) {
                i1 <<= 6;
                Test.iFld -= (int)fFld;
                i28 = 1;
                do {
                    Test.instanceCount >>>= Test.instanceCount;
                    if (Test.bFld) continue;
                    i1 += (int)1.567F;
                    i1 -= (int)Test.instanceCount;
                    Test.iArrFld[i26 + 1] = i;
                } while (++i28 < 2);
                i25 >>= i25;
                Test.lArrFld = Test.lArrFld;
                Test.dFld += 103;
                i25 -= i;
                for (i29 = i26; i29 < 2; ++i29) {
                    iFld1 += i29;
                    if (Test.bFld) {
                        fFld += (i29 * i29);
                        Test.dFld += i29;
                        try {
                            i30 = (i24 / 4031);
                            i27 = (Test.iArrFld[i29 - 1] % Test.iArrFld[i24 + 1]);
                            i27 = (4134 / i27);
                        } catch (ArithmeticException a_e) {}
                    } else if (Test.bFld) {
                        i30 += (int)Test.instanceCount;
                        switch ((i29 % 1) + 122) {
                        case 122:
                            Test.iFld2 -= (int)Test.fFld1;
                            if (true) break;
                            break;
                        }
                        Test.bFld = Test.bFld;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 i24 = " + i + "," + i1 + "," + i24);
        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("i28 i29 i30 = " + i28 + "," + i29 + "," + i30);

        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.dFld = " + Test.instanceCount + "," + Test.byFld +
            "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.bFld fFld Test.iFld = " + (Test.bFld ? 1 : 0) + "," + Float.floatToIntBits(fFld)
            + "," + Test.iFld);
        FuzzerUtils.out.println("iFld1 Test.iFld2 Test.fFld1 = " + iFld1 + "," + Test.iFld2 + "," +
            Float.floatToIntBits(Test.fFld1));
        FuzzerUtils.out.println("Test.lArrFld dArrFld Test.iArrFld = " + FuzzerUtils.checkSum(Test.lArrFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)) + "," + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}