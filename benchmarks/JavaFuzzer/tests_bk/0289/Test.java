// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:00 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=6L;
    public static byte byFld=-45;
    public static double dFld=-104.59673;
    public static boolean bFld=true;
    public static double dFld1=-2.6406;
    public static int iArrFld[]=new int[N];
    public static int iArrFld1[][]=new int[N][N];
    public static long lArrFld[]=new long[N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 6);
        FuzzerUtils.init(Test.iArrFld1, -2);
        FuzzerUtils.init(Test.lArrFld, 8L);
        FuzzerUtils.init(Test.bArrFld, true);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static int iMeth(int i1, double d) {

        float f=2.949F;

        Test.byFld -= (byte)(++f);
        long meth_res = i1 + Double.doubleToLongBits(d) + Float.floatToIntBits(f);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i9, int i10, int i11) {

        double d2=-2.65409;
        int i12=10, i13=6, i14=34223;
        float f2=0.921F;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)20517);

        d2 = 134;
        while (--d2 > 0) {
            short s=-8402;
            Test.instanceCount += (long)(d2 * d2);
            i9 -= s;
            i10 *= i10;
            i12 = 1;
            while (++i12 < 12) {
                i9 ^= (int)Test.instanceCount;
                Test.instanceCount += (long)Test.dFld;
                Test.instanceCount <<= 27;
                if (Test.bFld) continue;
                sArr[(int)(d2 + 1)] -= (short)i9;
                for (f2 = 1; f2 < 1; f2++) {
                    i9 = i9;
                    i9 <<= i12;
                    Test.dFld1 += -6432;
                    i14 += (int)58L;
                }
            }
        }
        vMeth1_check_sum += i9 + i10 + i11 + Double.doubleToLongBits(d2) + i12 + Float.floatToIntBits(f2) + i13 + i14 +
            FuzzerUtils.checkSum(sArr);
    }

    public static int iMeth1(int i6, int i7, int i8) {

        int i16=17021, i17=60795, i18=-2;
        float f3=-1.573F;

        vMeth1(i8, i8, i8);
        for (int i15 : Test.iArrFld) {
            Test.iArrFld1 = Test.iArrFld1;
            Test.dFld = Test.dFld;
        }
        for (i16 = 4; i16 < 241; i16++) {
            i18 = 1;
            do {
                switch (((i16 % 3) * 5) + 53) {
                case 65:
                    i7 = (int)15508L;
                    Test.instanceCount = i7;
                    Test.bFld = Test.bFld;
                    break;
                case 60:
                    f3 = (float)Test.dFld;
                    i8 += (int)Test.instanceCount;
                    i8 += (((i18 * i7) + i7) - Test.instanceCount);
                    break;
                case 61:
                }
                Test.lArrFld[i18 - 1] = Test.instanceCount;
                Test.bArrFld[i16 + 1] = Test.bFld;
            } while (++i18 < 7);
        }
        long meth_res = i6 + i7 + i8 + i16 + i17 + i18 + Float.floatToIntBits(f3);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i5=89, i19=-9, i20=-36787, i21=20240, i22=14, i23=156, i24=0, i25=-169, i26=0, i27=1, iArr[][]=new
            int[N][N];
        float f4=0.246F;

        FuzzerUtils.init(iArr, -8);

        i5 = (int)((iArr[(i5 >>> 1) % N][(i5 >>> 1) % N] * Math.sqrt(Test.dFld)) * iMeth1(i5, i5, i5));
        for (i19 = 2; i19 < 290; ++i19) {
            if (Test.bFld) continue;
            for (i21 = 1; 6 > i21; i21++) {
                for (i23 = 1; i23 < 2; i23++) {
                    if (true) break;
                    Test.instanceCount = i22;
                }
                i22 += (-10 + (i21 * i21));
                for (i25 = 2; i25 > 1; i25 -= 2) {
                    i26 -= i24;
                }
                if (Test.bFld) break;
                i27 = 1;
                do {
                    i26 *= (int)f4;
                    Test.instanceCount = -17473L;
                } while (++i27 < 2);
                Test.lArrFld[i21 - 1] %= (Test.instanceCount | 1);
            }
        }
        vMeth_check_sum += i5 + i19 + i20 + i21 + i22 + i23 + i24 + i25 + i26 + i27 + Float.floatToIntBits(f4) +
            FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i=1, i2=-113, i3=2, i4=6, i28=-16, i29=-168, i30=172, i31=-15318, i32=-101;
        double d1=95.105209, dArr[][]=new double[N][N];
        long l=-2L, l1=2940541582180455339L;
        float f1=2.1F, fArr[]=new float[N];
        short s1=7736, sArr1[]=new short[N];
        byte byArr[][]=new byte[N][N];

        FuzzerUtils.init(dArr, -2.93216);
        FuzzerUtils.init(fArr, 0.726F);
        FuzzerUtils.init(sArr1, (short)24993);
        FuzzerUtils.init(byArr, (byte)56);

        i >>= Integer.reverseBytes(iMeth(++i, d1));
        dArr[(i >>> 1) % N][(i >>> 1) % N] *= (19355 - (++i));
        for (l = 13; 393 > l; l += 2) {
            fArr[(int)(l - 1)] -= (Math.max(i2 % (Test.byFld | 1), (int)(i * Test.instanceCount)) * i2);
            fArr[(int)(l - 1)] += 3;
            Test.instanceCount += (((l * Test.instanceCount) + f1) - Test.instanceCount);
        }
        for (i3 = 1; i3 < 396; ++i3) {
            vMeth();
            i |= s1;
            for (i28 = i3; i28 < 64; ++i28) {
                for (i30 = 1; i30 < 1; ++i30) {
                    Test.instanceCount += (((i30 * i) + i4) - l);
                    i29 = (int)l;
                    Test.instanceCount *= l;
                    if (Test.bFld) break;
                }
                for (l1 = 1; l1 < 1; ++l1) {
                    i31 += (int)l1;
                    Test.iArrFld1[i28][i28 + 1] *= i30;
                }
                switch (((i3 % 2) * 5) + 115) {
                case 119:
                    Test.iArrFld[i3] = (int)l;
                    Test.instanceCount *= i;
                    i2 *= 28202;
                    Test.instanceCount -= i31;
                case 123:
                    if (Test.bFld) break;
                    Test.instanceCount = i31;
                    sArr1[i3 + 1] += (short)i2;
                    dArr[i3][i28 - 1] += i32;
                    break;
                default:
                    i31 %= (int)-161L;
                }
                i29 <<= (int)Test.instanceCount;
                byArr[i28 - 1][i28 - 1] = (byte)i4;
            }
        }

        FuzzerUtils.out.println("i d1 l = " + i + "," + Double.doubleToLongBits(d1) + "," + l);
        FuzzerUtils.out.println("i2 f1 i3 = " + i2 + "," + Float.floatToIntBits(f1) + "," + i3);
        FuzzerUtils.out.println("i4 s1 i28 = " + i4 + "," + s1 + "," + i28);
        FuzzerUtils.out.println("i29 i30 i31 = " + i29 + "," + i30 + "," + i31);
        FuzzerUtils.out.println("l1 i32 dArr = " + l1 + "," + i32 + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));
        FuzzerUtils.out.println("fArr sArr1 byArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + "," +
            FuzzerUtils.checkSum(sArr1) + "," + FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.dFld = " + Test.instanceCount + "," + Test.byFld +
            "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.bFld Test.dFld1 Test.iArrFld = " + (Test.bFld ? 1 : 0) + "," +
            Double.doubleToLongBits(Test.dFld1) + "," + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.iArrFld1 Test.lArrFld Test.bArrFld = " + FuzzerUtils.checkSum(Test.iArrFld1) +
            "," + FuzzerUtils.checkSum(Test.lArrFld) + "," + FuzzerUtils.checkSum(Test.bArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
