// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:00 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3157417358370819490L;
    public double dFld=53.11397;
    public static double dFld1=1.128774;
    public static int iFld=159;
    public static volatile float fFld=54.44F;
    public static boolean bFld=true;
    public byte byFld=122;
    public static float fArrFld[]=new float[N];
    public static int iArrFld[]=new int[N];
    public static double dArrFld[][]=new double[N][N];
    public long lArrFld[][]=new long[N][N];

    static {
        FuzzerUtils.init(Test.fArrFld, 0.948F);
        FuzzerUtils.init(Test.iArrFld, -12444);
        FuzzerUtils.init(Test.dArrFld, 45.37747);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(long l1, int i9) {

        long l2=-85L;
        int i10=-64944, i11=-6;
        float f=-1.352F;
        short s=-3080;
        boolean b=true;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 51.60018);

        l2 = 197;
        while (--l2 > 0) {
            dArr[(int)(l2)] = Test.instanceCount;
            i9 -= -64;
            i9 >>>= i9;
            i10 = 1;
            while (++i10 < 8) {
                f += f;
                s += (short)i9;
            }
            Test.dFld1 = -3598325945014413298L;
            Test.instanceCount = l2;
            if (b) break;
        }
        i9 += -28745;
        i11 = 1;
        while (++i11 < 302) {
            Test.iFld = -79;
            Test.fArrFld[i11] += i10;
            Test.iArrFld[i11] += Test.iFld;
        }
        long meth_res = l1 + i9 + l2 + i10 + Float.floatToIntBits(f) + s + (b ? 1 : 0) + i11 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i8) {

        int i12=161, i13=-52907, i15=64, i16=-53532, i17=-219, i18=4;
        boolean b1=false;

        Test.dFld1 = Test.fArrFld[(i8 >>> 1) % N];
        i8 = (int)(((Test.instanceCount--) - iMeth(9099555108747747222L, i8)) - i8);
        for (i12 = 4; i12 < 374; i12++) {
            Test.iFld >>= i13;
            if (false) continue;
            Test.fFld += Test.instanceCount;
            if (b1) continue;
        }
        i8 |= (int)Test.instanceCount;
        for (int i14 : Test.iArrFld) {
            Test.fArrFld[(i13 >>> 1) % N] -= Test.instanceCount;
            Test.instanceCount = (long)1.342F;
            for (i15 = 4; i15 > 1; --i15) {
                for (i17 = 2; i17 > 1; --i17) {
                    Test.fArrFld[i17 + 1] -= 28378;
                    i16 *= (int)5777943958537209774L;
                }
            }
        }
        vMeth1_check_sum += i8 + i12 + i13 + (b1 ? 1 : 0) + i15 + i16 + i17 + i18;
    }

    public static void vMeth(int i4, int i5, long l) {

        int i6=16102, i7=93, i19=2, i20=4, i21=165, i22=34767;
        float f1=-115.492F;
        short s1=31975;
        byte by=126;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -91L);

        for (i6 = 162; i6 > 7; i6 -= 2) {
            vMeth1(-84);
            Test.fFld = Test.fFld;
            for (i19 = 1; 20 > i19; i19++) {
                Test.iFld <<= (int)105L;
                for (i21 = 1; 2 > i21; ++i21) {
                    switch (((i19 % 2) * 5) + 41) {
                    case 47:
                        i4 *= (int)f1;
                        lArr[i21 + 1] ^= -45;
                        switch (((i6 % 4) * 5) + 106) {
                        case 110:
                            switch (((i19 % 3) * 5) + 79) {
                            case 87:
                                try {
                                    i5 = (-42054 % i5);
                                    i22 = (i20 / -860766544);
                                    i22 = (i6 / -56022);
                                } catch (ArithmeticException a_e) {}
                                lArr[i19 + 1] *= l;
                                break;
                            case 90:
                                i20 = (int)Test.instanceCount;
                                s1 = (short)i4;
                                break;
                            case 86:
                                i20 += (int)Test.instanceCount;
                                break;
                            default:
                                i7 *= i22;
                            }
                        case 123:
                            by = (byte)-184;
                            break;
                        case 108:
                            lArr[i6 - 1] = 25720;
                        case 118:
                            if (Test.bFld) break;
                            break;
                        default:
                            i20 += (-5 + (i21 * i21));
                        }
                        break;
                    case 45:
                        i4 += (i21 + i4);
                        break;
                    }
                }
            }
        }
        vMeth_check_sum += i4 + i5 + l + i6 + i7 + i19 + i20 + i21 + i22 + Float.floatToIntBits(f1) + s1 + by +
            FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i=10, i1=-27540, i2=106, i3=-72, i23=40738, i24=44008, i25=35924, i26=8, i27=-6, i28=61383, i29=-14500,
            iArr[]=new int[N];
        short s2=-18079, sArr[][]=new short[N][N];
        float f2=0.654F;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(iArr, 219);
        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(sArr, (short)25683);

        for (i = 9; i < 160; i++) {
            for (i2 = 4; i2 < 166; i2++) {
                dFld += (--Test.instanceCount);
            }
            i3 ^= iArr[i + 1];
            switch ((i % 6) + 10) {
            case 10:
                vMeth(-2, i2, Test.instanceCount);
                Test.iFld *= i23;
                break;
            case 11:
                bArr[i] = Test.bFld;
                Test.instanceCount <<= 21388;
                byFld -= (byte)Test.fFld;
                break;
            case 12:
                for (i24 = 166; i24 > 5; i24 -= 3) {
                    Test.instanceCount = 22622;
                    Test.dArrFld[i24][i - 1] -= i;
                    i23 = i23;
                    for (i26 = 1; i26 < 4; ++i26) {
                        Test.iFld = i26;
                        i3 = Test.iFld;
                        i3 *= i24;
                        i27 <<= i26;
                        i1 -= -11571;
                        sArr[i + 1][i26] >>>= (short)13;
                        i23 <<= 88;
                    }
                    Test.dFld1 -= 0.52F;
                    for (i28 = 1; i28 < 4; i28++) {
                        Test.instanceCount *= (long)Test.fFld;
                        lArrFld[i][i24 + 1] -= 0L;
                        Test.fFld -= i28;
                        lArrFld[i28 + 1][i - 1] *= i28;
                        i23 += i28;
                    }
                    Test.iArrFld[i] = i;
                }
                break;
            case 13:
                s2 = (short)i27;
                break;
            case 14:
                Test.fArrFld = Test.fArrFld;
                break;
            case 15:
                f2 = (float)Test.dFld1;
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i23 i24 = " + i3 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("i28 i29 s2 = " + i28 + "," + i29 + "," + s2);
        FuzzerUtils.out.println("f2 iArr bArr = " + Float.floatToIntBits(f2) + "," + FuzzerUtils.checkSum(iArr) + "," +
            FuzzerUtils.checkSum(bArr));
        FuzzerUtils.out.println("sArr = " + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test.instanceCount dFld Test.dFld1 = " + Test.instanceCount + "," +
            Double.doubleToLongBits(dFld) + "," + Double.doubleToLongBits(Test.dFld1));
        FuzzerUtils.out.println("Test.iFld Test.fFld Test.bFld = " + Test.iFld + "," + Float.floatToIntBits(Test.fFld)
            + "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("byFld Test.fArrFld Test.iArrFld = " + byFld + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.dArrFld lArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld))
            + "," + FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
