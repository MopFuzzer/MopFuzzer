// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:12 2023
public class Test0009 {

    public static final int N = 400;

    public static volatile long instanceCount=133L;
    public static volatile int iFld=14;
    public static volatile float fFld=2.534F;
    public short sFld=2467;
    public double dFld=2.16993;
    public static double[] dArrFld =new double[N];
    public int[] iArrFld =new int[N];
    public short[][] sArrFld =new short[N][N];
    public float[][] fArrFld =new float[N][N];

    static {
        FuzzerUtils.init(Test0009.dArrFld, 116.99957);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(float f) {

        int i2=10;
        int i3=-46;
        int i4=99;
        int i5=229;
        int[] iArr1 =new int[N];
        float f1=-109.628F;
        boolean b=true;
        double d1=-35.102569;
        byte by1=-91;

        FuzzerUtils.init(iArr1, -153);

        i2 = 1;
        do {
            Test0009.iFld = i2;
            Test0009.iFld = (int) 11L;
            Test0009.iFld += (((i2 * Test0009.instanceCount) + i2) - i2);
            for (i3 = 1; i3 < 4; i3++) {
                iArr1 = iArr1;
                for (f1 = 2; f1 > 1; --f1) {
                    b = b;
                    Test0009.instanceCount += (long) (f1 * f1);
                    if (b) {
                        Test0009.dArrFld[(int) (f1 + 1)] += d1;
                        Test0009.iFld += i4;
                        iArr1[i3 + 1] -= by1;
                    }
                    Test0009.iFld += (int) (((f1 * Test0009.iFld) + Test0009.instanceCount) - i2);
                    if (b) break;
                }
            }
        } while (++i2 < 380);
        vMeth_check_sum += Float.floatToIntBits(f) + i2 + i3 + i4 + Float.floatToIntBits(f1) + i5 + (b ? 1 : 0) +
            Double.doubleToLongBits(d1) + by1 + FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth1(int i1, short s) {

        byte by=-67;
        int i6=3134;
        int i7=-4;
        int i8=8;
        int i9=-10;
        int i10=-16011;
        int i11=43473;
        int i12=-7;
        int[][] iArr =new int[N][N];

        FuzzerUtils.init(iArr, 10);

        iArr[(i1 >>> 1) % N][(i1 >>> 1) % N] -= (int) ((by + (Test0009.instanceCount * i1)) - (i1++));
        vMeth(Test0009.fFld);
        i6 = 1;
        do {
            for (i7 = 1; 13 > i7; i7++) {
                switch ((i6 % 9) + 66) {
                case 66:
                case 67:
                    Test0009.instanceCount += (i7 * i7);
                    for (i9 = 2; i9 > 1; i9 -= 3) {
                        i10 <<= i7;
                        Test0009.iFld += i9;
                        i10 += i9;
                    }
                    break;
                case 68:
                    for (i11 = 1; i11 < 2; i11++) {
                        switch (((i11 % 4) * 5) + 121) {
                        case 137:
                            Test0009.instanceCount <<= by;
                            i8 |= by;
                            by -= (byte)33961;
                            break;
                        case 126:
                            Test0009.fFld += i8;
                            break;
                        case 130:
                            i10 *= Test0009.iFld;
                        case 122:
                            i1 = i7;
                        default:
                            Test0009.iFld <<= i10;
                        }
                    }
                    break;
                case 69:
                    Test0009.instanceCount *= i12;
                    break;
                case 70:
                    Test0009.iFld >>= i9;
                    break;
                case 71:
                    Test0009.iFld <<= i7;
                    break;
                case 72:
                    i8 += i7;
                case 73:
                    i1 += i12;
                    break;
                case 74:
                }
            }
        } while (++i6 < 125);
        long meth_res = i1 + s + by + i6 + i7 + i8 + i9 + i10 + i11 + i12 + FuzzerUtils.checkSum(iArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth(int i) {

        long l=-4550L;
        long[] lArr =new long[N];
        double d=0.116624;
        short s1=30112;
        short[] sArr =new short[N];
        int i13=-9;
        int i14=-45615;
        int i15=3;
        int i16=0;
        int i17=6;
        int i18=4;
        int[] iArr2 =new int[N];

        FuzzerUtils.init(lArr, 7L);
        FuzzerUtils.init(sArr, (short)28142);
        FuzzerUtils.init(iArr2, 5);

        l <<= i;
        d -= (iMeth1(Test0009.iFld, s1) - -2.72420);
        for (i13 = 11; i13 < 235; i13++) {
            i = Test0009.iFld;
            for (i15 = 1; i15 < 7; ++i15) {
                lArr[i13 + 1] -= i13;
                i += (((i15 * Test0009.iFld) + i15) - l);
                Test0009.iFld += (i15 * i15);
                for (i17 = 2; i17 > 1; i17--) {
                    i18 -= i18;
                    l = i15;
                    Test0009.instanceCount *= (long) -1.580F;
                    sArr[i13 + 1] = (short)i16;
                    Test0009.iFld = (int) Test0009.instanceCount;
                    iArr2[i17] = (int)l;
                }
            }
        }
        long meth_res = i + l + Double.doubleToLongBits(d) + s1 + i13 + i14 + i15 + i16 + i17 + i18 +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        byte by2=-117;
        int i19=-56286, i20=-42, i21=-188, i22=-14, i23=32563, i24=58, i25=132, i26=54576, i27=-2, i28=-11, i29=44809;
        long l1=20L;
        boolean b1=true;

        iMeth(36);
        by2 = (byte) Test0009.instanceCount;
        for (i19 = 5; i19 < 295; i19++) {
            Test0009.iFld = (int) 1.476F;
            iArrFld[i19 + 1] += Test0009.iFld;
            sArrFld[i19 - 1][i19 - 1] = (short) Test0009.iFld;
            for (l1 = i19; l1 < 87; l1++) {
                for (i22 = 1; i22 < 1; i22++) {
                    if (b1) {
                        sFld >>>= (short)-3;
                        Test0009.iFld -= (int) dFld;
                        Test0009.iFld = -185;
                    } else if (b1) {
                        i21 <<= -186;
                        switch ((i22 % 2) + 82) {
                        case 82:
                        case 83:
                            iArrFld[(int) (l1)] += (int) Test0009.instanceCount;
                            if (b1) continue;
                            dFld = i22;
                            sFld = (short)-83;
                            break;
                        }
                        Test0009.iFld &= i23;
                        Test0009.instanceCount |= i21;
                    }
                    Test0009.fFld *= Test0009.iFld;
                    fArrFld[i22][(int) (l1)] -= Test0009.fFld;
                }
                i21 += (int)l1;
                Test0009.instanceCount += (((l1 * Test0009.instanceCount) + Test0009.fFld) - i19);
            }
            for (i24 = 4; i24 < 87; i24++) {
                for (i26 = i24; i26 < 2; ++i26) {
                    Test0009.instanceCount -= (long) Test0009.fFld;
                }
                for (i28 = 1; i28 < 2; ++i28) {
                    by2 *= (byte) Test0009.instanceCount;
                    Test0009.instanceCount += i28;
                }
            }
        }

        FuzzerUtils.out.println("by2 i19 i20 = " + by2 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("l1 i21 i22 = " + l1 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 b1 i24 = " + i23 + "," + (b1 ? 1 : 0) + "," + i24);
        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("i28 i29 = " + i28 + "," + i29);

        FuzzerUtils.out.println("Test0009.instanceCount Test0009.iFld Test0009.fFld = " + Test0009.instanceCount + "," + Test0009.iFld +
                "," + Float.floatToIntBits(Test0009.fFld));
        FuzzerUtils.out.println("sFld dFld Test0009.dArrFld = " + sFld + "," + Double.doubleToLongBits(dFld) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0009.dArrFld)));
        FuzzerUtils.out.println("iArrFld sArrFld fArrFld = " + FuzzerUtils.checkSum(iArrFld) + "," +
            FuzzerUtils.checkSum(sArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0009 _instance = new Test0009();
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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
