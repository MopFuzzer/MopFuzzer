// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:04 2023
public class Test0437 {

    public static final int N = 400;

    public static long instanceCount = 76L;
    public static int iFld = -3177;
    public static boolean bFld = true;
    public static float[] fArrFld = new float[N];
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0437.fArrFld, -64.375F);
    }

    public float fFld = 0.684F;
    public volatile short sFld = 27297;

    public static void vMeth1(short s) {

        int i1 = -21799;
        int i2 = 105;
        int i3 = -1;
        int i4 = -123;
        int i5 = -141;
        int i6 = -9;
        int[] iArr = new int[N];
        double d1 = 33.103448;
        long l = 59931L;

        FuzzerUtils.init(iArr, -223);

        iArr[(Test0437.iFld >>> 1) % N] += (int) Test0437.instanceCount;
        iArr[(Test0437.iFld >>> 1) % N] -= (int) Test0437.instanceCount;
        for (i1 = 10; i1 < 207; ++i1) {
            Test0437.iFld = 158;
        }
        Test0437.fArrFld[(Test0437.iFld >>> 1) % N] -= i2;
        iArr[(Test0437.iFld >>> 1) % N] = -11;
        iArr[(Test0437.iFld >>> 1) % N] = i2;
        for (i3 = 5; i3 < 236; ++i3) {
            for (d1 = 1; d1 < 7; d1++) {
                for (l = 2; l > 1; --l) {
                    i6 += Test0437.iFld;
                    i5 = Test0437.iFld;
                    Test0437.instanceCount = Test0437.instanceCount;
                    i4 = (int) d1;
                }
                s -= (short) i4;
            }
        }
        vMeth1_check_sum += s + i1 + i2 + i3 + i4 + Double.doubleToLongBits(d1) + i5 + l + i6 +
                FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(double d, int i) {

        short s1 = 14923;
        int i7 = -142;
        int i8 = 97;
        int i9 = -14;
        int i10 = 9;
        int i11 = 2307;
        int i12 = 49268;
        int[] iArr1 = new int[N];
        byte by = -29;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, 3283609372L);
        FuzzerUtils.init(iArr1, -14711);

        if (Test0437.bFld) {
            i = (int) lArr[(i >>> 1) % N];
            vMeth1(s1);
            for (i7 = 7; i7 < 139; ++i7) {
                Test0437.iFld |= Test0437.iFld;
                i8 = i8;
                i += i;
                iArr1[i7 - 1] = -97;
                for (i9 = 1; i9 < 12; ++i9) {
                    i10 = (int) Test0437.instanceCount;
                }
                iArr1[i7] *= -12027;
                for (i11 = 12; i7 < i11; i11--) {
                    if (Test0437.bFld) continue;
                    i12 += (i11 - by);
                    iArr1[(i7 >>> 1) % N] -= i10;
                }
            }
        } else {
            lArr[(i8 >>> 1) % N] *= s1;
        }
        long meth_res = Double.doubleToLongBits(d) + i + s1 + i7 + i8 + i9 + i10 + i11 + i12 + by +
                FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth() {

        double d2 = -126.71836;
        int i13 = -6;
        int i14 = 12;
        int i15 = 4;
        int i16 = 59503;
        int i17 = -155;
        int[] iArr2 = new int[N];
        byte by1 = -6;
        float f = 2.26F;
        long[] lArr1 = new long[N];

        FuzzerUtils.init(lArr1, 3550155924379717708L);
        FuzzerUtils.init(iArr2, 199);

        Test0437.instanceCount -= ((iMeth(d2, Test0437.iFld) - Test0437.iFld) - Test0437.instanceCount);
        i13 = 1;
        while (++i13 < 209) {
            for (i14 = 1; i14 < 8; ++i14) {
                lArr1 = FuzzerUtils.long1array(N, (long) -6L);
                i15 += i13;
                by1 = (byte) i14;
                Test0437.instanceCount += -1;
                i15 -= (int) f;
            }
            for (i16 = 1; i16 < 8; i16++) {
                if (Test0437.bFld) break;
                by1 += (byte) (((i16 * i17) + i13) - i17);
                Test0437.iFld += (i16 * i16);
                try {
                    i17 = (i17 % i13);
                    i15 = (i13 % -1195716032);
                    iArr2[i13 + 1] = (i15 % 195);
                } catch (ArithmeticException a_e) {
                }
                i17 += i16;
                by1 -= (byte) Test0437.instanceCount;
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d2) + i13 + i14 + i15 + by1 + Float.floatToIntBits(f) + i16 + i17 +
                FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr2);
    }

    public static void main(String[] strArr) {

        try {
            Test0437 _instance = new Test0437();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i18 = 59360;
        int i19 = -11766;
        int i20 = 46532;
        int i21 = 227;
        int i22 = 28;
        int i23 = -238;
        int[] iArr3 = new int[N];
        double d3 = 0.114437, d4 = -1.71090;
        long[] lArr2 = new long[N], lArr3 = new long[N];

        FuzzerUtils.init(lArr2, 7L);
        FuzzerUtils.init(iArr3, 3);
        FuzzerUtils.init(lArr3, -3L);

        vMeth();
        Test0437.iFld = Test0437.iFld;
        if (Test0437.bFld) {
            lArr2[(Test0437.iFld >>> 1) % N] = (long) fFld;
            i18 = 1;
            while (++i18 < 300) {
                Test0437.iFld |= 2734;
            }
            Test0437.iFld >>= -4;
        }
        iArr3[(Test0437.iFld >>> 1) % N] |= i18;
        Test0437.iFld >>= Test0437.iFld;
        Test0437.iFld += Test0437.iFld;
        Test0437.iFld = (int) -5.822F;
        sFld = (short) i18;
        for (i19 = 7; i19 < 132; i19++) {
            for (d3 = 6; d3 < 201; d3++) {
                if (Test0437.bFld) {
                    for (i22 = i19; i22 < 2; ++i22) {
                        iArr3 = iArr3;
                        lArr3[i22] *= Test0437.instanceCount;
                        i20 += (int) Test0437.instanceCount;
                        i23 -= (int) Test0437.instanceCount;
                        Test0437.iFld += (153 + (i22 * i22));
                        Test0437.instanceCount = 44;
                    }
                    Test0437.instanceCount ^= i23;
                    i23 += i21;
                    Test0437.instanceCount -= i18;
                } else if (Test0437.bFld) {
                    Test0437.instanceCount += (13L + (d3 * d3));
                    i20 = -139;
                    d4 -= Test0437.iFld;
                }
                i23 = (int) 21509L;
            }
            Test0437.iFld >>= i18;
        }

        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("d3 i21 i22 = " + Double.doubleToLongBits(d3) + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 d4 lArr2 = " + i23 + "," + Double.doubleToLongBits(d4) + "," +
                FuzzerUtils.checkSum(lArr2));
        FuzzerUtils.out.println("iArr3 lArr3 = " + FuzzerUtils.checkSum(iArr3) + "," + FuzzerUtils.checkSum(lArr3));

        FuzzerUtils.out.println("Test0437.instanceCount Test0437.iFld Test0437.bFld = " + Test0437.instanceCount + "," + Test0437.iFld +
                "," + (Test0437.bFld ? 1 : 0));
        FuzzerUtils.out.println("fFld sFld Test0437.fArrFld = " + Float.floatToIntBits(fFld) + "," + sFld + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0437.fArrFld)));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
