// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 13 18:25:34 2018
public class Test {

    public static final int N = 400;

    public static long instanceCount=-4622920139809038929L;
    public static boolean bFld=true;
    public static float fFld=-30.236F;
    public short sFld=18312;
    public static float[] fArrFld =new float[N];
    public static long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test.fArrFld, -1.715F);
        FuzzerUtils.init(Test.lArrFld, -3672443148244861704L);
    }

    public static long vMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i3=13;
        int i4=-42;
        int i5=-193;
        int i6=-247;
        int i7=-237;
        int i8=178;
        int[] iArr =new int[N];
        short s=29432;
        byte by=74;
        double d2=-104.87687;
        boolean b=false;

        FuzzerUtils.init(iArr, -13);

        for (i3 = 229; 1 < i3; --i3) {
            for (i5 = i3; i5 < 7; ++i5) {
                s += (short)i4;
                iArr[i3] = by;
            }
            for (i7 = 7; i7 > 1; i7--) {
                switch (((i3 % 10) * 5) + 127) {
                case 173:
                    i4 >>= (int)Test.instanceCount;
                    i6 += i3;
                case 162:
                case 139:
                    i6 = i6;
                    i6 += (((i7 * i8) + i3) - Test.instanceCount);
                    break;
                case 148:
                    switch ((i3 % 6) + 16) {
                    case 16:
                        i6 = (int)Test.instanceCount;
                        i6 = i8;
                        break;
                    case 17:
                        i6 >>= i7;
                        i8 += (11 + (i7 * i7));
                        break;
                    case 18:
                        Test.fArrFld[i3] += i5;
                    case 19:
                        iArr[i3 + 1] ^= i5;
                        break;
                    case 20:
                        i6 += (i7 - i6);
                        break;
                    case 21:
                        iArr[i3 - 1] += (int)d2;
                        break;
                    default:
                        b = b;
                    }
                case 150:
                case 166:
                    Test.instanceCount += (((i7 * i4) + i8) - i6);
                    break;
                case 164:
                    Test.instanceCount = Test.instanceCount;
                case 167:
                    if (i7 != 0) {
                        vMeth1_check_sum += i3 + i4 + i5 + i6 + s + by + i7 + i8 + Double.doubleToLongBits(d2) + (b ? 1
                            : 0) + FuzzerUtils.checkSum(iArr);
                        return;
                    }
                case 137:
                    i4 *= 0;
                    break;
                case 161:
                    Test.lArrFld = Test.lArrFld;
                }
            }
        }
        vMeth1_check_sum += i3 + i4 + i5 + i6 + s + by + i7 + i8 + Double.doubleToLongBits(d2) + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr);
    }

    public static short sMeth(double d1) {

        int i9=-47086;
        int i10=1;
        int i11=2;
        int i12=238;
        int i13=16640;
        int i14=-60;
        int[][] iArr1 =new int[N][N];
        byte by1=46;
        short s1=-9413;

        FuzzerUtils.init(iArr1, 7);

        vMeth1();
        Test.fArrFld[(-60636 >>> 1) % N] -= (float)d1;
        i9 = 1;
        while (++i9 < 381) {
            Test.lArrFld[i9] += i9;
            i10 = (int)Test.instanceCount;
            by1 = (byte)Test.instanceCount;
            Test.instanceCount += (((i9 * i10) + Test.instanceCount) - Test.instanceCount);
            for (i11 = 1; i11 < 4; ++i11) {
                iArr1[i11 - 1][i11] += s1;
            }
            i13 = 1;
            do {
                if (Test.bFld) break;
                i14 = 1;
                while (++i14 < 1) {
                    float f=0.926F;
                    i10 *= (int)f;
                    i12 >>= i14;
                    i10 = i10;
                }
            } while (++i13 < 4);
        }
        long meth_res = Double.doubleToLongBits(d1) + i9 + i10 + by1 + i11 + i12 + s1 + i13 + i14 +
            FuzzerUtils.checkSum(iArr1);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static void vMeth() {

        double d=-108.58793;
        int i2=-7;
        int i15=-19829;
        int i16=6;
        int i17=10;
        int i18=-8879;
        int[] iArr2 =new int[N];
        float f1=47.515F;

        FuzzerUtils.init(iArr2, -61);

        for (d = 1; d < 354; ++d) {
            i2 >>= (int)((--Test.instanceCount) - sMeth(d));
            Test.bFld = Test.bFld;
            Test.fArrFld[(int)(d + 1)] = -11;
            for (i15 = 1; i15 < 5; ++i15) {
                iArr2[i15] += (int)d;
                if (i2 != 0) {
                    vMeth_check_sum += Double.doubleToLongBits(d) + i2 + i15 + i16 + Float.floatToIntBits(f1) + i17 +
                        i18 + FuzzerUtils.checkSum(iArr2);
                    return;
                }
                if (Test.bFld) break;
                i16 = i2;
                iArr2[(int)(d)] = (int)Test.instanceCount;
                f1 = -60647;
                for (i17 = 2; i17 > 1; i17--) {
                    i18 = i16;
                    Test.lArrFld[(int)(d)] &= Test.instanceCount;
                    i18 -= (int)f1;
                }
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + i2 + i15 + i16 + Float.floatToIntBits(f1) + i17 + i18 +
            FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i=-112;
        int i1=-211;
        int i20=54720;
        int i21=205;
        int i22=2184;
        int i23=58;
        int i24=-50110;
        int[] iArr3 =new int[N];
        int[] iArr4 =new int[N];
        double d3=-1.63277;

        FuzzerUtils.init(iArr3, 194);
        FuzzerUtils.init(iArr4, 15969);

        for (i = 11; i < 226; i++) {
            vMeth();
            i1 -= i1;
            iArr3[i + 1] = i;
            i1 = 24811;
        }
        for (i20 = 16; 331 > i20; ++i20) {
            i1 = i20;
            i21 += i1;
            i21 += i20;
            i1 <<= (int)Test.instanceCount;
            iArr3[i20] <<= (int)Test.instanceCount;
            i21 &= i21;
            for (i22 = 4; i22 < 80; i22++) {
                i21 = i23;
                i24 = 1;
                while (++i24 < 2) {
                    try {
                        iArr3[i22] = (i23 / i1);
                        iArr3[i24 + 1] = (i % i1);
                        iArr4[i22] = (127 % i20);
                    } catch (ArithmeticException a_e) {}
                    i21 += (int)Test.fFld;
                    iArr3 = iArr3;
                    i23 = i24;
                    Test.fFld *= i21;
                    switch ((i20 % 6) + 40) {
                    case 40:
                        i23 += i24;
                        i1 = (int)Test.instanceCount;
                        Test.fFld += i23;
                        Test.fFld += (i24 - i21);
                        break;
                    case 41:
                        i23 += i;
                        i21 = 33891;
                        break;
                    case 42:
                        iArr4[i24] = -27377;
                        sFld = (short)108;
                    case 43:
                        i23 = (int)d3;
                        break;
                    case 44:
                        iArr3[i20 + 1] = i21;
                    case 45:
                        Test.lArrFld = FuzzerUtils.long1array(N, (long)-4458665695687616056L);
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 i20 = " + i + "," + i1 + "," + i20);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 d3 iArr3 = " + i24 + "," + Double.doubleToLongBits(d3) + "," +
            FuzzerUtils.checkSum(iArr3));
        FuzzerUtils.out.println("iArr4 = " + FuzzerUtils.checkSum(iArr4));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.fFld = " + Test.instanceCount + "," + (Test.bFld ? 1
            : 0) + "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("sFld Test.fArrFld Test.lArrFld = " + sFld + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
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
//DEBUG  sMeth ->  sMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 sMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
