// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:07 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=26L;
    public static volatile int iFld=-46169;
    public volatile byte byFld=33;
    public float fFld=-87.124F;
    public static boolean bFld=false;
    public static boolean bFld1=true;
    public static byte byFld1=-3;
    public static short sFld=32189;
    public static volatile double dFld=0.82095;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 61030);
    }

    public static long byMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static boolean bMeth(int i2, int i3, int i4) {

        boolean b=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -160L);

        b = ((lArr[(i3 >>> 1) % N] += (Test.instanceCount % 121)) < i4);
        long meth_res = i2 + i3 + i4 + (b ? 1 : 0) + FuzzerUtils.checkSum(lArr);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static void vMeth1(int i8, int i9, float f1) {

        int i10=55457, i11=-64, i12=-235, i13=-34755, i14=48730, i15=-37986;
        short s=5522;

        for (i10 = 261; 8 < i10; --i10) {
            i8 >>= i9;
            if (false) {
                s %= (short)((long)(f1) | 1);
            } else {
                i11 = Test.byFld1;
                i12 = 6;
                while (--i12 > 0) {
                    double d=1.49589;
                    d = i11;
                    i13 = (int)Test.instanceCount;
                    i9 += (int)Test.instanceCount;
                }
                i9 -= i12;
            }
            if (true) {
                for (i14 = 1; i14 < 6; i14++) {
                    if (true) {
                        i11 /= (int)(Test.sFld | 1);
                        Test.iArrFld[i10] = i13;
                        vMeth1_check_sum += i8 + i9 + Float.floatToIntBits(f1) + i10 + i11 + s + i12 + i13 + i14 + i15;
                        return;
                    } else {
                        i9 += i13;
                    }
                }
                vMeth1_check_sum += i8 + i9 + Float.floatToIntBits(f1) + i10 + i11 + s + i12 + i13 + i14 + i15;
                return;
            } else {
                Test.instanceCount -= i14;
            }
        }
        vMeth1_check_sum += i8 + i9 + Float.floatToIntBits(f1) + i10 + i11 + s + i12 + i13 + i14 + i15;
    }

    public static void vMeth(long l, int i5) {

        float f=-110.1013F;
        int i6=-190, i7=32539, i16=7, i17=-12, i18=10, i19=3, i20=-190;
        long l1=7416L;
        double d1=2.24106;

        Test.instanceCount = (long)(++f);
        for (i6 = 7; i6 < 127; i6++) {
            vMeth1(Test.iFld, -5, f);
            for (l1 = i6; l1 < 13; l1++) {
                Test.iFld = 0;
                i16 *= (int)-4041862571L;
            }
            for (i17 = 13; i17 > 1; i17--) {
                Test.iArrFld[i17] *= 13643;
            }
            i7 += i6;
            d1 -= Test.byFld1;
            for (i19 = 1; 13 > i19; i19++) {
                d1 -= 3;
                i18 *= i20;
                i16 = i7;
                f += i18;
            }
        }
        vMeth_check_sum += l + i5 + Float.floatToIntBits(f) + i6 + i7 + l1 + i16 + i17 + i18 +
            Double.doubleToLongBits(d1) + i19 + i20;
    }

    public static byte byMeth() {

        int i=-28776, i1=64, i21=17512, i22=9479, iArr[][]=new int[N][N];
        float f2=-45.193F;
        long l2=1052053274241704489L;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(iArr, 8);

        for (i = 323; 3 < i; i -= 2) {
            bArr[i] = ((bMeth(Test.iFld, 149, Test.iFld) || (Test.bFld || Test.bFld1)) && Test.bFld1);
            vMeth(Test.instanceCount, i1);
            Test.iArrFld[i + 1] = i1;
            iArr = FuzzerUtils.int2array(N, (int)132);
            f2 = Test.instanceCount;
            for (i21 = 1; i21 < 10; i21++) {
                i1 = (int)217L;
                i22 += (int)Test.dFld;
                l2 -= 11;
                if (Test.bFld) {
                    f2 = Test.instanceCount;
                    iArr[i21 - 1][i21 - 1] = Test.byFld1;
                    i22 += i21;
                    Test.instanceCount ^= l2;
                } else {
                    Test.byFld1 += (byte)i21;
                }
            }
        }
        long meth_res = i + i1 + Float.floatToIntBits(f2) + i21 + i22 + l2 + FuzzerUtils.checkSum(bArr) +
            FuzzerUtils.checkSum(iArr);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d2=-13.120953;
        int i23=3;
        long l3=3378595026813830439L, l4=30168L;

        Test.iFld = (int)((Test.instanceCount * (Test.iFld * Test.iFld)) - (--Test.iFld));
        byFld = (byte)Test.iFld;
        fFld = (--Test.iFld);
        Test.iArrFld[(Test.iFld >>> 1) % N] -= byMeth();
        if (false) {
            for (d2 = 18; d2 < 315; d2++) {
                if (Test.bFld) continue;
                Test.instanceCount += (long)(((d2 * Test.instanceCount) + fFld) - Test.instanceCount);
                i23 += (int)(d2 * d2);
                byFld = (byte)28204L;
                Test.instanceCount = Test.sFld;
                l3 = 1;
                while (++l3 < 85) {
                    i23 += Test.iFld;
                    Test.instanceCount += (-59530 + (l3 * l3));
                    Test.iFld = Test.iFld;
                    Test.iArrFld[(int)(l3)] = (int)fFld;
                    Test.instanceCount *= -9;
                    switch ((int)((l3 % 2) + 64)) {
                    case 64:
                        Test.instanceCount = Test.instanceCount;
                        Test.iArrFld = Test.iArrFld;
                        Test.instanceCount = (long)d2;
                        Test.iArrFld[(int)(d2 + 1)] += -244;
                        break;
                    case 65:
                        i23 -= 145;
                        if (Test.bFld) break;
                        i23 = i23;
                        break;
                    default:
                        i23 += (int)(l3 + i23);
                        Test.instanceCount += (((l3 * Test.iFld) + Test.iFld) - i23);
                    }
                    l4 += (long)fFld;
                    Test.iArrFld[(int)(d2)] = (int)2899471907L;
                    i23 += (int)(((l3 * i23) + i23) - Test.instanceCount);
                }
            }
        } else if (Test.bFld) {
            Test.iArrFld[(i23 >>> 1) % N] = Test.iFld;
        } else {
            i23 = Test.sFld;
        }

        FuzzerUtils.out.println("d2 i23 l3 = " + Double.doubleToLongBits(d2) + "," + i23 + "," + l3);
        FuzzerUtils.out.println("l4 = " + l4);

        FuzzerUtils.out.println("Test.instanceCount Test.iFld byFld = " + Test.instanceCount + "," + Test.iFld + "," +
            byFld);
        FuzzerUtils.out.println("fFld Test.bFld Test.bFld1 = " + Float.floatToIntBits(fFld) + "," + (Test.bFld ? 1 : 0)
            + "," + (Test.bFld1 ? 1 : 0));
        FuzzerUtils.out.println("Test.byFld1 Test.sFld Test.dFld = " + Test.byFld1 + "," + Test.sFld + "," +
            Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("byMeth_check_sum: " + byMeth_check_sum);
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
//DEBUG  byMeth ->  byMeth mainTest
//DEBUG  bMeth ->  bMeth byMeth mainTest
//DEBUG  vMeth ->  vMeth byMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth byMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}