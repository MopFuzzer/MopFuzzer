// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:06 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-55197L;
    public static float fFld=0.236F;
    public static short sFld=28997;
    public static int iArrFld[][]=new int[N][N];
    public static boolean bArrFld[]=new boolean[N];
    public long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -10);
        FuzzerUtils.init(Test.bArrFld, true);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i2=-77, i4=-139, i5=-170, i6=8843, iArr[]=new int[N];
        double d=0.31765;
        boolean b=true;
        long l=-2367941598306367372L, lArr[]=new long[N];
        float f=-36.374F;
        byte by=5;

        FuzzerUtils.init(lArr, 34744L);
        FuzzerUtils.init(iArr, -42857);

        lArr[(92 >>> 1) % N] *= i2;
        i2 -= (int)-46944L;
        Test.iArrFld[(-175 >>> 1) % N] = Test.iArrFld[(i2 >>> 1) % N];
        for (int i3 : iArr) {
            d += i2;
            if (b) break;
            i2 += -98;
            for (l = 1; 4 > l; l++) {
                for (i5 = 1; i5 < 2; i5++) {
                    f = f;
                    i4 = (int)15.298F;
                    Test.iArrFld[(int)(l)] = Test.iArrFld[i5];
                    i2 = (int)Test.instanceCount;
                }
                Test.iArrFld[(int)(l)][(int)(l - 1)] += i6;
                f += by;
            }
        }
        vMeth1_check_sum += i2 + Double.doubleToLongBits(d) + (b ? 1 : 0) + l + i4 + i5 + i6 + Float.floatToIntBits(f)
            + by + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(int i1) {

        int i7=45386, i8=-20739, i9=56700, i10=5793, i11=32964, i12=-195, i13=18, i14=-216;
        long l1=-60412L;
        double d1=0.9632;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 74.869F);

        vMeth1();
        for (i7 = 5; i7 < 149; ++i7) {
            i8 -= 63557;
            Test.fFld = i7;
        }
        for (i9 = 9; i9 < 189; ++i9) {
            Test.instanceCount += i10;
            for (i11 = 1; i11 < 9; ++i11) {
                i12 *= i10;
                for (i13 = 1; i13 < 2; ++i13) {
                    fArr[i11] -= i11;
                    i1 = Test.sFld;
                    i12 ^= i10;
                    l1 -= 4L;
                    l1 += -12;
                    Test.iArrFld[i11][i13] -= (int)d1;
                }
            }
        }
        long meth_res = i1 + i7 + i8 + i9 + i10 + i11 + i12 + i13 + i14 + l1 + Double.doubleToLongBits(d1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i=176, i15=-5, i17=-8, i18=129, i19=-27, i20=13391, iArr1[]=new int[N];
        double d2=28.43881, dArr[]=new double[N];
        byte by1=-60;
        long lArr1[]=new long[N], lArr2[][]=new long[N][N];

        FuzzerUtils.init(iArr1, -13);
        FuzzerUtils.init(lArr1, 3766856189L);
        FuzzerUtils.init(lArr2, -229L);
        FuzzerUtils.init(dArr, 63.55124);

        i = iMeth(i);
        i15 = 1;
        do {
            Test.instanceCount >>= i15;
            i *= i15;
            lArr1[i15] *= (long)d2;
            i += (i15 - i15);
            Test.fFld += (i15 * i15);
            for (i17 = i15; i17 < 10; i17++) {
                boolean b1=true;
                switch ((i15 % 7) + 117) {
                case 117:
                    for (i19 = 1; i19 < 1; i19++) {
                        try {
                            i20 = (64389 % i20);
                            i = (i % i18);
                            i = (i17 % -42);
                        } catch (ArithmeticException a_e) {}
                        if (i17 != 0) {
                            vMeth_check_sum += i + i15 + Double.doubleToLongBits(d2) + i17 + i18 + i19 + i20 + by1 +
                                FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(lArr2)
                                + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                            return;
                        }
                        iArr1[i19 - 1] = (int)Test.instanceCount;
                        lArr2 = lArr2;
                        Test.fFld *= i19;
                    }
                    break;
                case 118:
                    Test.fFld += Test.fFld;
                case 119:
                    by1 = (byte)i;
                    break;
                case 120:
                    if (b1) break;
                    break;
                case 121:
                    by1 += (byte)(((i17 * i19) + Test.instanceCount) - i18);
                    break;
                case 122:
                    i -= -67;
                    break;
                case 123:
                    i18 += 49;
                    break;
                default:
                    dArr[i17] *= i20;
                }
            }
        } while (++i15 < 154);
        vMeth_check_sum += i + i15 + Double.doubleToLongBits(d2) + i17 + i18 + i19 + i20 + by1 +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(lArr2) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        int i21=48907, i22=40579, i23=62060, i24=8, i25=181, i26=-13130, i27=38310, i28=150, i29=10;
        double d3=1.81505, dArr1[]=new double[N];
        long l3=-2L;
        boolean b2=false;

        FuzzerUtils.init(dArr1, 2.37646);

        vMeth();
        i21 -= i21;
        for (i22 = 17; i22 < 294; ++i22) {
            Test.fFld -= Test.sFld;
            i21 += (int)-4663842861671008365L;
            for (d3 = 3; d3 < 91; d3++) {
                byte by2=-118;
                i24 += (int)(((d3 * Test.instanceCount) + Test.instanceCount) - Test.instanceCount);
                i23 -= by2;
                Test.instanceCount += (long)(((d3 * i22) + i22) - Test.instanceCount);
                Test.fFld = l3;
                i21 = i21;
                Test.instanceCount *= i24;
                l3 += Test.instanceCount;
            }
        }
        i25 = 1;
        while (++i25 < 382) {
            i24 += i23;
            for (i26 = 4; i26 < 66; ++i26) {
                Test.fFld += (6867L + (i26 * i26));
                dArr1[i25 + 1] -= 2;
                for (i28 = 1; i28 < 2; i28++) {
                    long l4=-2259163832L;
                    b2 = false;
                    Test.bArrFld = Test.bArrFld;
                    Test.iArrFld[i28 - 1][i28] -= i28;
                    i24 += i28;
                    b2 = b2;
                    Test.fFld = i29;
                    b2 = b2;
                    lArrFld[i28 - 1] += -35766;
                    l4 = -244;
                }
                i21 += i21;
                i29 *= i23;
            }
        }

        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("d3 i24 l3 = " + Double.doubleToLongBits(d3) + "," + i24 + "," + l3);
        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("i28 i29 b2 = " + i28 + "," + i29 + "," + (b2 ? 1 : 0));
        FuzzerUtils.out.println("dArr1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.sFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.sFld);
        FuzzerUtils.out.println("Test.iArrFld Test.bArrFld lArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            FuzzerUtils.checkSum(Test.bArrFld) + "," + FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
