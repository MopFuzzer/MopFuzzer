// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:10 2023
public class Test0691 {

    public static final int N = 400;

    public static long instanceCount = -1604458900L;
    public static int iFld = 10571;
    public static double dFld = -48.12711;
    public static boolean bFld = false;
    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public float fFld = 1.222F;

    public static void main(String[] strArr) {

        try {
            Test0691 _instance = new Test0691();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public double dMeth() {

        int i4 = 0;
        int i5 = -8;
        int i6 = 0;
        int i7 = 3;
        int i8 = 138;
        int i9 = -160;
        int[] iArr = new int[N];
        short s1 = 21851;
        short[] sArr = new short[N];

        FuzzerUtils.init(sArr, (short) 6558);
        FuzzerUtils.init(iArr, 220);

        for (i4 = 165; i4 > 2; --i4) {
            Test0691.iFld = i4;
            i5 *= i5;
            for (i6 = 1; i6 < 10; i6++) {
                Test0691.iFld *= 120;
            }
            i5 += (((i4 * Test0691.instanceCount) + fFld) - s1);
        }
        for (i8 = 11; i8 < 378; i8++) {
            sArr[i8] += (short) i9;
            fFld = Test0691.instanceCount;
            i7 = i6;
            Test0691.dFld -= i7;
            try {
                Test0691.iFld = (-37251 % iArr[i8 + 1]);
                iArr[i8] = (i4 / 156);
                i5 = (iArr[i8 - 1] % -236);
            } catch (ArithmeticException a_e) {
            }
            i5 = i9;
            i7 *= s1;
        }
        Test0691.iFld = Test0691.iFld;
        long meth_res = i4 + i5 + i6 + i7 + s1 + i8 + i9 + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr);
        dMeth_check_sum += meth_res;
        return (double) meth_res;
    }

    public int iMeth(int i, int i1) {

        int i2 = -11703;
        int i3 = 0;
        int i11 = 228;
        int i12 = 169;
        int i13 = 4;
        int i14 = -9;
        int i15 = -177;
        int i16 = 9;
        int[] iArr1 = new int[N];
        byte by = 0;
        long[] lArr = new long[N];
        float[] fArr = new float[N];

        FuzzerUtils.init(lArr, 7530604225682133997L);
        FuzzerUtils.init(iArr1, 233);
        FuzzerUtils.init(fArr, 39.108F);

        for (i2 = 3; i2 < 273; ++i2) {
            i1 = (int) dMeth();
            for (i11 = 6; i11 > 1; --i11) {
                lArr[i11] = i1;
                iArr1[i2 + 1] += (int) -556394373L;
                try {
                    Test0691.iFld = (-155 / i2);
                    i12 = (22948 % i3);
                    i12 = (i12 % 55902);
                } catch (ArithmeticException a_e) {
                }
            }
        }
        i3 <<= i12;
        for (i13 = 12; i13 < 219; i13++) {
            fArr[i13 - 1] = Test0691.instanceCount;
            Test0691.iFld += (-25439 + (i13 * i13));
            for (i15 = 1; i15 < 8; i15++) {
                Test0691.instanceCount <<= by;
                i3 = -13;
                Test0691.instanceCount = -225;
                Test0691.instanceCount *= i1;
            }
        }
        long meth_res = i + i1 + i2 + i3 + i11 + i12 + i13 + i14 + i15 + i16 + by + FuzzerUtils.checkSum(lArr) +
                FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public long lMeth(long l) {

        int i17 = 5;
        int i18 = 11;
        int i19 = -215;
        int i20 = 13;
        int i21 = -214;
        int[] iArr2 = new int[N];
        short[][] sArr1 = new short[N][N];

        FuzzerUtils.init(iArr2, 29);
        FuzzerUtils.init(sArr1, (short) 15532);

        Test0691.instanceCount = iMeth(Test0691.iFld, 20);
        for (i17 = 8; 147 > i17; i17++) {
            i18 = 18794;
            iArr2[i17 + 1] = (int) fFld;
            i19 = 1;
            do {
                Test0691.iFld += (int) Test0691.dFld;
                l *= i19;
                i18 += (((i19 * Test0691.iFld) + Test0691.instanceCount) - i19);
                Test0691.iFld *= i19;
                fFld = i19;
                Test0691.iFld -= i17;
                sArr1[(-17956 >>> 1) % N] = sArr1[i19];
                for (i20 = 1; i20 < 1; ++i20) {
                    Test0691.iFld += i20;
                    Test0691.iFld += (i20 * i20);
                }
            } while (++i19 < 11);
        }
        long meth_res = l + i17 + i18 + i19 + i20 + i21 + FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(sArr1);
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public void mainTest(String[] strArr1) {

        short s = 31819;
        double d = 49.90616;
        double[] dArr = new double[N];
        int i22 = -217;
        int i23 = 133;
        int i24 = 186;
        int i25 = -9;
        int i26 = 236;
        int i27 = 29974;
        int[] iArr3 = new int[N];
        float f = -1.357F;
        long l1 = -3963885602259257476L;
        long[] lArr1 = new long[N];

        FuzzerUtils.init(dArr, -52.64693);
        FuzzerUtils.init(iArr3, 15955);
        FuzzerUtils.init(lArr1, 7L);

        Test0691.iFld += (int) (((s * -12190) - (Test0691.instanceCount - fFld)) - (-(Test0691.iFld << -40842L)));
        Test0691.iFld -= (int) (1.62061 + ((Test0691.instanceCount - d) - Test0691.iFld));
        s = (short) ((lMeth(Test0691.instanceCount) - Test0691.iFld) * Test0691.iFld);
        if (Test0691.bFld) {
            Test0691.iFld = Test0691.iFld;
            Test0691.iFld += Test0691.iFld;
            Test0691.iFld += Test0691.iFld;
            for (double d1 : dArr) {
                fFld = Test0691.iFld;
                Test0691.iFld = Test0691.iFld;
                fFld = fFld;
                for (i22 = 3; i22 < 63; ++i22) {
                    d += i23;
                    iArr3[i22 + 1] >>>= i23;
                    fFld = (float) d;
                    Test0691.iFld <<= (int) Test0691.instanceCount;
                }
                fFld = i22;
                Test0691.instanceCount = 175;
                for (f = 1; f < 63; f++) {
                    iArr3[(int) (f + 1)] &= i22;
                    for (i25 = 1; i25 < 2; ++i25) {
                        if (Test0691.bFld) continue;
                        lArr1[(int) (f + 1)] |= i25;
                        lArr1[i25 + 1] *= Test0691.instanceCount;
                        i26 += i25;
                    }
                    Test0691.iFld = 8;
                }
            }
        } else {
            Test0691.instanceCount = (long) d;
        }
        for (l1 = 8; l1 < 271; ++l1) {
            if (Test0691.bFld) break;
            i23 += i27;
        }

        FuzzerUtils.out.println("s d i22 = " + s + "," + Double.doubleToLongBits(d) + "," + i22);
        FuzzerUtils.out.println("i23 f i24 = " + i23 + "," + Float.floatToIntBits(f) + "," + i24);
        FuzzerUtils.out.println("i25 i26 l1 = " + i25 + "," + i26 + "," + l1);
        FuzzerUtils.out.println("i27 dArr iArr3 = " + i27 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
                "," + FuzzerUtils.checkSum(iArr3));
        FuzzerUtils.out.println("lArr1 = " + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test0691.instanceCount Test0691.iFld fFld = " + Test0691.instanceCount + "," + Test0691.iFld + "," +
                Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("Test0691.dFld Test0691.bFld = " + Double.doubleToLongBits(Test0691.dFld) + "," + (Test0691.bFld ? 1 :
                0));

        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  iMeth ->  iMeth lMeth mainTest
//DEBUG  dMeth ->  dMeth iMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
