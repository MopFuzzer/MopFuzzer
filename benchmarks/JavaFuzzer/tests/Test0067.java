// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:54 2023
public class Test0067 {

    public static final int N = 400;

    public static volatile long instanceCount = -729535326L;
    public static boolean bFld = true;
    public static byte byFld = 16;
    public static long[] lArrFld = new long[N];
    public static volatile int[] iArrFld = new int[N];
    public static int[][] iArrFld1 = new int[N][N];
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0067.lArrFld, -250L);
        FuzzerUtils.init(Test0067.iArrFld, -24);
        FuzzerUtils.init(Test0067.iArrFld1, 0);
    }

    public double dFld = -2.127722;
    public float fFld = -70.106F;

    public static void vMeth1() {

        int i6 = -192;
        int i7 = 170;
        int i8 = -132;
        int i9 = -6;
        int i10 = 123;
        int i11 = -4;
        int i12 = -44122;
        int i13 = -4;
        int[] iArr1 = new int[N];
        double d = -117.81674;
        long l1 = 58L;
        float f = -42.162F;

        FuzzerUtils.init(iArr1, 9329);

        i6 = 1;
        while (++i6 < 132) {
            Test0067.instanceCount += i6;
            for (i7 = 12; 1 < i7; --i7) {
                d += Test0067.instanceCount;
                i8 += i8;
            }
            iArr1 = iArr1;
            for (i9 = i6; i9 < 12; i9++) {
                i11 = 1;
                do {
                    i8 <<= (int) l1;
                    i8 = (int) d;
                    f += i11;
                } while (++i11 < 1);
                for (i12 = 1; i12 > 1; i12--) {
                    f += i13;
                    Test0067.instanceCount = l1;
                    try {
                        i10 = (iArr1[i9 + 1] % -89);
                        i8 = (121 % iArr1[i9]);
                        i8 = (i6 % i13);
                    } catch (ArithmeticException a_e) {
                    }
                }
            }
        }
        vMeth1_check_sum += i6 + i7 + i8 + Double.doubleToLongBits(d) + i9 + i10 + i11 + l1 + Float.floatToIntBits(f) +
                i12 + i13 + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(long l, int i3) {

        int i4 = -17794, i5 = 8410, i14 = -22608, i15 = 67, i16 = -17955, i17 = -2, i18 = 1, i19 = 6;
        boolean b = false;
        byte by = 46;
        byte[] byArr1 = new byte[N];
        short s1 = 8268;
        short[] sArr = new short[N];

        FuzzerUtils.init(byArr1, (byte) -100);
        FuzzerUtils.init(sArr, (short) -5800);

        for (i4 = 9; i4 < 225; i4++) {
            byArr1[i4] = (byte) l;
            vMeth1();
        }
        i3 = i5;
        b = true;
        for (i14 = 6; i14 < 182; ++i14) {
            for (i16 = i14; i16 < 9; i16 += 2) {
                if (b) continue;
                for (i18 = 1; 1 < i18; --i18) {
                    Test0067.lArrFld[i14 + 1] -= Test0067.instanceCount;
                    sArr[i14] = (short) i16;
                }
                by *= (byte) 17618;
                Test0067.instanceCount = s1;
                if (false) break;
                i5 >>= 47589;
            }
        }
        vMeth_check_sum += l + i3 + i4 + i5 + (b ? 1 : 0) + i14 + i15 + i16 + i17 + i18 + i19 + by + s1 +
                FuzzerUtils.checkSum(byArr1) + FuzzerUtils.checkSum(sArr);
    }

    public static int iMeth() {

        int i1 = -12;
        int i2 = 8535;
        int[][] iArr = new int[N][N];
        short s = 20745;
        float f1 = 1.359F;
        float f2 = -106.666F;
        float[] fArr = new float[N];
        byte by1 = 59;
        byte[] byArr = new byte[N];
        double d1 = 1.20108;

        FuzzerUtils.init(iArr, -50313);
        FuzzerUtils.init(byArr, (byte) -14);
        FuzzerUtils.init(fArr, 34.549F);

        for (i1 = 7; i1 < 213; i1++) {
            iArr[i1] = (iArr[i1 - 1] = (iArr[i1 - 1] = (iArr[i1] = iArr[i1 - 1])));
            i2 += (int) (byArr[i1] - (--Test0067.lArrFld[i1 - 1]));
            i2 += (((i1 * i2) + s) - i2);
            vMeth(8L, -185);
        }
        iArr[(-33838 >>> 1) % N][(i1 >>> 1) % N] += i1;
        if (true) {
            f1 = 1;
            do {
                if (i2 != 0) {
                }
                fArr[(int) (f1 - 1)] *= by1;
                f2 += (f1 * f1);
                d1 = 1;
                while (++d1 < 5) {
                    Test0067.bFld = false;
                    i2 -= i1;
                    i2 -= (int) Test0067.instanceCount;
                }
            } while (++f1 < 357);
        } else if (Test0067.bFld) {
            iArr[(i2 >>> 1) % N][(i2 >>> 1) % N] += (int) -1.20247;
        } else {
            i2 *= i2;
        }
        long meth_res = i1 + i2 + s + Float.floatToIntBits(f1) + by1 + Float.floatToIntBits(f2) +
                Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(byArr) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0067 _instance = new Test0067();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = -19213, i20 = -7, i21 = 10, i22 = 13, i23 = -162, i24 = -11;
        long l2 = 7768417353186107280L;
        short s2 = 8642;
        byte[] byArr2 = new byte[N];

        FuzzerUtils.init(byArr2, (byte) 1);

        i += iMeth();
        i += -219;
        Test0067.instanceCount = (long) dFld;
        i += (int) 10L;
        Test0067.instanceCount = Test0067.instanceCount;
        for (i20 = 121; i20 > 2; --i20) {
            Test0067.iArrFld[i20 + 1] &= (int) Test0067.instanceCount;
            i21 = (int) Test0067.instanceCount;
            switch ((i20 % 6) + 92) {
                case 92:
                    if (Test0067.bFld) {
                        Test0067.instanceCount <<= Test0067.instanceCount;
                        i22 = 1;
                        while (++i22 < 211) {
                            switch ((i22 % 1) + 97) {
                                case 97:
                                    Test0067.instanceCount += i;
                                default:
                                    for (l2 = 1; 1 > l2; ++l2) {
                                        Test0067.iArrFld1 = FuzzerUtils.int2array(N, (int) 209);
                                        Test0067.iArrFld[i22 + 1] *= i21;
                                        s2 += (short) (((l2 * i23) + l2) - Test0067.instanceCount);
                                        i21 -= (int) fFld;
                                        Test0067.instanceCount = i;
                                        byArr2[(int) (l2 + 1)] <<= (byte) Test0067.instanceCount;
                                        Test0067.instanceCount -= -200;
                                    }
                            }
                            s2 += (short) i22;
                        }
                    } else if (Test0067.bFld) {
                        i24 = 211;
                        while ((i24 -= 2) > 0) {
                            i21 += (-6 + (i24 * i24));
                            i |= (int) Test0067.instanceCount;
                            Test0067.byFld += (byte) 1.926F;
                            byArr2[i20 + 1] = (byte) -88;
                            fFld -= Test0067.instanceCount;
                            Test0067.lArrFld[i20 - 1] = i20;
                        }
                    }
                    break;
                case 93:
                    i21 = (int) 1.989F;
                    break;
                case 94:
                    i21 += i20;
                    break;
                case 95:
                    Test0067.instanceCount += i20;
                    break;
                case 96:
                    i = i20;
                    break;
                case 97:
                    if (false) break;
            }
        }

        FuzzerUtils.out.println("i i20 i21 = " + i + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 l2 i23 = " + i22 + "," + l2 + "," + i23);
        FuzzerUtils.out.println("s2 i24 byArr2 = " + s2 + "," + i24 + "," + FuzzerUtils.checkSum(byArr2));

        FuzzerUtils.out.println("Test0067.instanceCount Test0067.bFld dFld = " + Test0067.instanceCount + "," + (Test0067.bFld ? 1 : 0)
                + "," + Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("fFld Test0067.byFld Test0067.lArrFld = " + Float.floatToIntBits(fFld) + "," + Test0067.byFld + ","
                + FuzzerUtils.checkSum(Test0067.lArrFld));
        FuzzerUtils.out.println("Test0067.iArrFld Test0067.iArrFld1 = " + FuzzerUtils.checkSum(Test0067.iArrFld) + "," +
                FuzzerUtils.checkSum(Test0067.iArrFld1));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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