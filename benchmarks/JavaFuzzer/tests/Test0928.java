// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:16 2023
public class Test0928 {

    public static final int N = 400;

    public static long instanceCount = -6020L;
    public static long vMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public int iFld = -13399;
    public short sFld = 21458;
    public int iFld1 = -2;

    public static void vMeth1(int i8, int i9) {

        int i10 = 198;
        int i11 = 12;
        int i12 = 7;
        int i13 = 5695;
        int i14 = -28;
        int i15 = 192;
        int[] iArr1 = new int[N];
        float f2 = -21.218F;

        FuzzerUtils.init(iArr1, -11);

        for (i10 = 9; i10 < 280; i10++) {
            for (i12 = 1; i12 < 6; ++i12) {
                i8 -= (int) -3006064415L;
                f2 = i11;
                iArr1[i12 - 1] -= i10;
                i8 = i12;
                f2 = i13;
                iArr1[i12 + 1] += i12;
                i8 >>= -18727;
                for (i14 = 1; i14 < 2; ++i14) {
                    switch ((((i8 >>> 1) % 2) * 5) + 105) {
                        case 114:
                            if (i8 != 0) {
                                vMeth1_check_sum += i8 + i9 + i10 + i11 + i12 + i13 + Float.floatToIntBits(f2) + i14 + i15
                                        + FuzzerUtils.checkSum(iArr1);
                                return;
                            }
                            iArr1[i10 - 1] += 6;
                            i15 = i11;
                            break;
                        case 115:
                            i8 += (-121 + (i14 * i14));
                    }
                }
            }
        }
        vMeth1_check_sum += i8 + i9 + i10 + i11 + i12 + i13 + Float.floatToIntBits(f2) + i14 + i15 +
                FuzzerUtils.checkSum(iArr1);
    }

    public static boolean bMeth(int i2, int i3) {

        float f1 = -22.72F;
        int i4 = -187;
        int i5 = -233;
        int i6 = -106;
        int i7 = -88;
        int[] iArr = new int[N];
        byte by = -75;
        short s = -30488;
        double d = 0.93742;
        double[] dArr = new double[N];
        boolean b = false;

        FuzzerUtils.init(iArr, 2);
        FuzzerUtils.init(dArr, 1.57247);

        iArr[(i2 >>> 1) % N] -= (int) dArr[(i2 >>> 1) % N];
        Test0928.instanceCount -= (long) (((Test0928.instanceCount + 49.68046) - (f1 - i2)) * (-(++i2)));
        for (i4 = 3; i4 < 339; i4++) {
            by = (byte) ((++i5) * iArr[i4 + 1]);
            for (i6 = 1; i6 < 5; ++i6) {
                i7 = Math.abs(Math.min(iArr[i6 + 1], s + i5));
                iArr[i6] = ((++i5) * Integer.reverseBytes(i5));
                i5 -= 65;
                if (b) {
                    iArr[i4] = (int) (++d);
                    vMeth1(i2, i7);
                    b = b;
                    f1 -= -119;
                } else if (true) {
                    Test0928.instanceCount += (i6 | i7);
                    Test0928.instanceCount >>>= Test0928.instanceCount;
                } else {
                    i5 >>>= i2;
                }
            }
        }
        long meth_res = i2 + i3 + Float.floatToIntBits(f1) + i4 + i5 + by + i6 + i7 + s + Double.doubleToLongBits(d) +
                (b ? 1 : 0) + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static void vMeth(float f, long l) {

        int i = -164;
        int i1 = 1;
        int i16 = -12;
        int i17 = -171;
        int i18 = 185;
        int i19 = -52;
        int[][] iArr2 = new int[N][N];
        short s1 = 21267;
        double d1 = 0.98875;
        double[] dArr1 = new double[N];

        FuzzerUtils.init(iArr2, 79);
        FuzzerUtils.init(dArr1, 0.30821);

        for (i = 219; i > 8; i -= 2) {
            bMeth(i1, -14);
            iArr2[i][i] = s1;
            i1 >>= -194;
            Test0928.instanceCount = l;
        }
        f = (float) d1;
        i16 = 1;
        while (++i16 < 282) {
            i1 = i16;
            iArr2[i16][i16 - 1] -= i16;
            for (i17 = 1; i17 < 6; ++i17) {
                iArr2[i17][i16] = i16;
                i1 = (int) Test0928.instanceCount;
                dArr1[i16] = i1;
                i18 -= i19;
            }
            i1 += (i16 * i16);
        }
        vMeth_check_sum += Float.floatToIntBits(f) + l + i + i1 + s1 + Double.doubleToLongBits(d1) + i16 + i17 + i18 +
                i19 + FuzzerUtils.checkSum(iArr2) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1));
    }

    public static void main(String[] strArr) {

        try {
            Test0928 _instance = new Test0928();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        float f3 = 0.518F;
        int i21 = 18097;
        int i22 = 4;
        int i23 = -31;
        int i24 = 8;
        int i25 = 224;
        int[] iArr3 = new int[N];
        boolean b1 = false;
        long l1 = 3961248865L;
        long[] lArr = new long[N];

        FuzzerUtils.init(iArr3, 13);
        FuzzerUtils.init(lArr, -2581091262L);

        vMeth(f3, Test0928.instanceCount);
        iFld = iFld;
        for (int i20 : iArr3) {
            iFld <<= iFld;
            i20 <<= iFld;
            iFld >>= sFld;
            for (i21 = 2; i21 < 63; ++i21) {
                i22 = (int) Test0928.instanceCount;
                if (false) continue;
                if (b1) break;
                iArr3[i21] -= iFld;
                i20 = i20;
            }
            i20 <<= -215;
            i22 = i20;
            switch (((101 >>> 1) % 3) + 61) {
                case 61:
                    for (i23 = 1; i23 < 63; ++i23) {
                        i22 <<= (int) Test0928.instanceCount;
                    }
                    i24 += iFld;
                    if (b1) {
                        i20 = i21;
                        f3 -= -154L;
                        lArr[(i23 >>> 1) % N] -= i23;
                    }
                    break;
                case 62:
                    Test0928.instanceCount = i23;
                    iArr3[(8 >>> 1) % N] -= (int) Test0928.instanceCount;
                    for (l1 = 2; l1 < 63; ++l1) {
                        i24 -= i22;
                    }
                    break;
                case 63:
                    Test0928.instanceCount = -90;
                    i25 = -555;
                    iFld >>= i25;
                    break;
            }
        }
        i24 <<= (int) Test0928.instanceCount;

        FuzzerUtils.out.println("f3 i21 i22 = " + Float.floatToIntBits(f3) + "," + i21 + "," + i22);
        FuzzerUtils.out.println("b1 i23 i24 = " + (b1 ? 1 : 0) + "," + i23 + "," + i24);
        FuzzerUtils.out.println("l1 i25 iArr3 = " + l1 + "," + i25 + "," + FuzzerUtils.checkSum(iArr3));
        FuzzerUtils.out.println("lArr = " + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test0928.instanceCount iFld sFld = " + Test0928.instanceCount + "," + iFld + "," + sFld);
        FuzzerUtils.out.println("iFld1 = " + iFld1);

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  bMeth ->  bMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 bMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
