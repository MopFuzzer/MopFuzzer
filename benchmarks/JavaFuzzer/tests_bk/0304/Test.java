// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:00 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-51L;
    public double dFld=-107.38213;
    public static float fFld=119.675F;
    public static short sFld=20147;
    public static volatile boolean bFld=false;
    public static double dFld1=19.54434;
    public double dFld2=106.21374;
    public static int iArrFld[]=new int[N];
    public static short sArrFld[]=new short[N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 29475);
        FuzzerUtils.init(Test.sArrFld, (short)-16343);
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i3) {

        int i4=-25984, i5=28, i6=-251;

        Test.fFld = Test.sFld;
        if (true) {
            i3 = -114;
        } else if (Test.bFld) {
            for (i4 = 7; 150 > i4; i4++) {
                boolean b2=true;
                i3 = 1;
                b2 = b2;
                i5 = (int)8L;
                i3 += -49;
                i3 -= i3;
                if (b2) {
                    Test.instanceCount = Test.instanceCount;
                    i6 = 1;
                    while (++i6 < 11) {
                        i3 += (int)Test.fFld;
                        Test.bArrFld = FuzzerUtils.boolean1array(N, (boolean)true);
                        Test.instanceCount -= Test.instanceCount;
                    }
                } else if (b2) {
                    i3 >>= i5;
                }
            }
        }
        vMeth1_check_sum += i3 + i4 + i5 + i6;
    }

    public static void vMeth(int i2, long l, long l1) {

        boolean b=true, b1=true;
        int i7=165, i8=-115, i9=33, i10=0;
        byte by=-72;

        i2 = (int)(l1++);
        b = b1;
        vMeth1(i2);
        Test.iArrFld[(i2 >>> 1) % N] &= 15;
        i2 &= (int)l1;
        for (i7 = 14; i7 < 332; i7++) {
            i8 += i8;
            if (b) {
                i8 = i8;
                for (i9 = 1; 5 > i9; ++i9) {
                    l1 = i8;
                }
                by += (byte)Test.fFld;
                Test.iArrFld = Test.iArrFld;
            } else if (Test.bFld) {
                Test.iArrFld[(i2 >>> 1) % N] <<= 15;
                i2 = (int)Test.dFld1;
            } else if (b1) {
                Test.sFld = (short)i10;
            } else {
                b = b;
            }
        }
        vMeth_check_sum += i2 + l + l1 + (b ? 1 : 0) + (b1 ? 1 : 0) + i7 + i8 + i9 + i10 + by;
    }

    public static int iMeth() {

        int i11=-193, i12=-44978, i13=-43, i14=185, i15=0;
        byte by1=76;
        float f=78.567F;

        vMeth(-14, Test.instanceCount, -45842L);
        i11 = 1;
        while (++i11 < 312) {
            Test.fFld += i11;
            Test.instanceCount += -3440790302301158309L;
            for (i12 = 1; i12 < 5; i12++) {
                i13 = i11;
                i13 = -81;
                i14 = 1;
                do {
                    by1 -= (byte)i11;
                    try {
                        i13 = (i13 % i11);
                        Test.iArrFld[i14 + 1] = (Test.iArrFld[i14] % i12);
                        Test.iArrFld[i12 + 1] = (-28828 / i14);
                    } catch (ArithmeticException a_e) {}
                } while (++i14 < 2);
                for (f = i11; f < 2; f++) {
                    switch ((i11 % 1) + 120) {
                    case 120:
                        Test.sFld <<= by1;
                        i13 += i15;
                        i15 = i11;
                        break;
                    default:
                        i15 += (int)(((f * i15) + Test.instanceCount) - Test.sFld);
                    }
                }
            }
        }
        long meth_res = i11 + i12 + i13 + i14 + by1 + Float.floatToIntBits(f) + i15;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=1, i1=9843, i16=-56861, i17=-29, i18=14, i19=-191, i20=161, i21=9, i22=-63910, i23=-44;
        float f1=-50.438F, fArr[][]=new float[N][N];
        byte by2=47;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, 3L);
        FuzzerUtils.init(fArr, 0.205F);

        for (i = 10; i < 182; ++i) {
            Test.iArrFld = (Test.iArrFld = (Test.iArrFld = (Test.iArrFld = Test.iArrFld)));
            Test.instanceCount -= i;
            Test.instanceCount = (-((lArr[i - 1][i - 1] += i1) + (-166 * (i1--))));
            Test.instanceCount += Math.max((int)((Test.sArrFld[(i1 >>> 1) % N]--) - (--dFld)), iMeth());
        }
        for (i16 = 5; i16 < 391; i16++) {
            for (f1 = 1; 65 > f1; ++f1) {
                i17 += (int)(f1 - Test.instanceCount);
                fArr = fArr;
                for (i19 = 2; 1 < i19; i19--) {
                    Test.instanceCount >>= Test.instanceCount;
                    Test.iArrFld[(int)(f1 - 1)] *= i19;
                    i20 -= 6956;
                    i18 = (int)f1;
                    Test.iArrFld[i16 - 1] = (int)Test.instanceCount;
                    i1 <<= i16;
                }
                if (Test.bFld) continue;
                dFld -= Test.fFld;
                i20 += 124;
                i17 = by2;
                i1 = i21;
                dFld *= i21;
            }
            Test.bArrFld[i16] = Test.bFld;
            for (i22 = 65; 4 < i22; i22 -= 3) {
                Test.fFld = i1;
                dFld2 = i17;
                by2 = (byte)i20;
                i21 = (int)Test.instanceCount;
            }
            Test.sFld = (short)i19;
            i20 += (int)Test.instanceCount;
        }

        FuzzerUtils.out.println("i i1 i16 = " + i + "," + i1 + "," + i16);
        FuzzerUtils.out.println("i17 f1 i18 = " + i17 + "," + Float.floatToIntBits(f1) + "," + i18);
        FuzzerUtils.out.println("i19 i20 by2 = " + i19 + "," + i20 + "," + by2);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("lArr fArr = " + FuzzerUtils.checkSum(lArr) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount dFld Test.fFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(dFld) + "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.sFld Test.bFld Test.dFld1 = " + Test.sFld + "," + (Test.bFld ? 1 : 0) + "," +
            Double.doubleToLongBits(Test.dFld1));
        FuzzerUtils.out.println("dFld2 Test.iArrFld Test.sArrFld = " + Double.doubleToLongBits(dFld2) + "," +
            FuzzerUtils.checkSum(Test.iArrFld) + "," + FuzzerUtils.checkSum(Test.sArrFld));
        FuzzerUtils.out.println("Test.bArrFld = " + FuzzerUtils.checkSum(Test.bArrFld));

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
