// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:17 2023
public class Test0950 {

    public static final int N = 400;

    public static long instanceCount = 6L;
    public static volatile short sFld = -26381;
    public static volatile double dFld = 56.42916;
    public static int iFld = 37565;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public byte byFld = 37;

    public static void vMeth1(int i1, long l1) {

        int i2 = 58248;
        int i3 = 12;
        int i4 = 9;
        int i5 = -112;
        int i6 = 14;
        int i7 = 75;
        int i8 = 24;
        int i9 = 54;
        int[] iArr = new int[N];
        boolean b = false;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, 12L);
        FuzzerUtils.init(iArr, -217);

        for (i2 = 3; i2 < 202; ++i2) {
            for (i4 = i2; 8 > i4; ++i4) {
                Test0950.instanceCount -= l1;
                i1 = i4;
            }
            lArr[(i5 >>> 1) % N] = i4;
            lArr[i2] += i5;
            iArr[i2 - 1] -= (int) 2.180F;
            Test0950.sFld = (short) i2;
        }
        b = b;
        for (i6 = 193; 9 < i6; i6--) {
            Test0950.dFld = i6;
        }
        iArr[(i5 >>> 1) % N] = i5;
        for (i8 = 21; 350 > i8; ++i8) {
            iArr = iArr;
            Test0950.instanceCount += Test0950.instanceCount;
        }
        vMeth1_check_sum += i1 + l1 + i2 + i3 + i4 + i5 + (b ? 1 : 0) + i6 + i7 + i8 + i9 + FuzzerUtils.checkSum(lArr)
                + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(double d, byte by, int i) {

        int i10 = 114;
        int i11 = -53933;
        int i12 = 35120;
        int i13 = -30929;
        int i14 = -11;
        int i15 = 46783;
        int[][] iArr1 = new int[N][N];
        float f = 2.160F;
        long l2 = -7L;

        FuzzerUtils.init(iArr1, -3);

        vMeth1(-31316, Test0950.instanceCount);
        i -= i;
        for (i10 = 16; i10 < 352; ++i10) {
            iArr1[i10 - 1][i10 + 1] <<= (int) Test0950.instanceCount;
            i11 += (int) f;
            i = i11;
        }
        for (i12 = 2; i12 < 338; i12++) {
            i13 = i11;
            Test0950.instanceCount += -29;
            l2 = 1;
            do {
                i <<= i10;
                for (i14 = (int) (l2); i14 < 1; i14++) {
                    if (false) {
                        by += (byte) (i14 * i14);
                    } else if (true) {
                        i11 = i13;
                    }
                }
            } while (++l2 < 5);
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + by + i + i10 + i11 + Float.floatToIntBits(f) + i12 + i13 + l2 +
                i14 + i15 + FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth(long l) {

        byte by1 = -69;

        vMeth(Test0950.dFld, by1, Test0950.iFld);
        Test0950.iFld = (int) Test0950.instanceCount;
        long meth_res = l + by1;
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0950 _instance = new Test0950();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i16 = 14;
        int i17 = 44785;
        int i18 = 483;
        int i19 = -119;
        int i20 = -64;
        int i21 = -2;
        int i22 = -3;
        int i23 = 4;
        int[] iArr2 = new int[N];
        float f1 = 0.426F;
        float[][] fArr = new float[N][N];
        float[] fArr1 = new float[N];
        boolean b1 = false;
        long[] lArr1 = new long[N];

        FuzzerUtils.init(iArr2, -134);
        FuzzerUtils.init(fArr, -2.5F);
        FuzzerUtils.init(fArr1, -2.393F);
        FuzzerUtils.init(lArr1, 2485863934L);

        Test0950.sFld = (short) Math.abs(iMeth(Test0950.instanceCount) - Test0950.iFld);
        Test0950.iFld *= Test0950.iFld;
        iArr2[(Test0950.iFld >>> 1) % N] <<= Test0950.iFld;
        for (i16 = 1; 219 > i16; ++i16) {
            for (i18 = 3; 115 > i18; i18++) {
                fArr[i18][i18 - 1] = -63;
                for (i20 = 1; i20 < 2; ++i20) {
                    fArr[i20 + 1][i16] += f1;
                    iArr2[i18 - 1] = 9;
                    i17 = (int) Test0950.instanceCount;
                    fArr[i16 + 1][i18] *= Test0950.iFld;
                    Test0950.instanceCount = i18;
                    i21 = Test0950.iFld;
                }
                i21 = i18;
                i17 *= i17;
                i17 += (i18 * i18);
                fArr1[i16] = -22;
                for (i22 = 1; 2 > i22; ++i22) {
                    i17 = i20;
                    if (b1) {
                        f1 = i21;
                        i23 = Test0950.iFld;
                    }
                }
                switch ((((i23 >>> 1) % 2) * 5) + 103) {
                    case 110:
                        i21 += (((i18 * i16) + i21) - i17);
                        break;
                    case 106:
                        lArr1[i16 - 1] = i23;
                        break;
                    default:
                        i23 += (i18 + byFld);
                        Test0950.iFld <<= 30;
                        Test0950.instanceCount += (i18 * i18);
                        Test0950.instanceCount -= i16;
                }
                Test0950.iFld = (int) Test0950.instanceCount;
            }
        }

        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("f1 i22 i23 = " + Float.floatToIntBits(f1) + "," + i22 + "," + i23);
        FuzzerUtils.out.println("b1 iArr2 fArr = " + (b1 ? 1 : 0) + "," + FuzzerUtils.checkSum(iArr2) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));
        FuzzerUtils.out.println("fArr1 lArr1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + "," +
                FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test0950.instanceCount Test0950.sFld Test0950.dFld = " + Test0950.instanceCount + "," + Test0950.sFld +
                "," + Double.doubleToLongBits(Test0950.dFld));
        FuzzerUtils.out.println("Test0950.iFld byFld = " + Test0950.iFld + "," + byFld);

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