// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:05 2023
public class Test0474 {

    public static final int N = 400;

    public static long instanceCount = -57L;
    public static double dFld1 = 1.85004;
    public static int[] iArrFld = new int[N];
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0474.iArrFld, 3);
    }

    public double dFld = 2.15849;
    public int iFld = -4;
    public byte byFld = 74;
    public volatile long[] lArrFld = new long[N];

    public static long lMeth(double d, int i) {

        int i1 = 321, i2 = 36461, i3 = 0, i4 = 46259, i5 = -49507, i6 = 241, i7 = -12, i8 = -5, i9 = 57;
        short s = -15800;
        boolean b = true;
        double[] dArr = new double[N];

        FuzzerUtils.init(dArr, -90.30152);

        dArr[(i >>> 1) % N] = -11;
        i1 = 1;
        do {
            i += (i1 * i1);
            Test0474.instanceCount += (i1 * i1);
            i += (i1 - i1);
        } while (++i1 < 193);
        i -= i;
        i = (int) d;
        i = i;
        for (i2 = 16; i2 < 398; ++i2) {
            s += (short) (i2 * i2);
            for (i4 = 4; i4 > 1; i4 -= 2) {
                i6 -= 14;
                for (i7 = 1; i7 < 4; i7++) {
                    i9 = i1;
                }
            }
            if (b) continue;
        }
        long meth_res = Double.doubleToLongBits(d) + i + i1 + i2 + i3 + s + i4 + i5 + i6 + i7 + i8 + i9 + (b ? 1 : 0) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public static void vMeth1() {

        int i10 = -126;
        int i11 = -123;
        int i12 = 49784;
        int i13 = -197;
        int i14 = -14;
        int i15 = -10;
        int i16 = 12;
        int[] iArr = new int[N];
        float f1 = -63.66F;
        boolean b1 = false;

        FuzzerUtils.init(iArr, -11);

        iArr[(-3 >>> 1) % N] = (int) lMeth(Test0474.dFld1, i10);
        for (i11 = 12; i11 < 253; i11++) {
            i10 = i10;
            for (i13 = 1; i13 < 7; ++i13) {
                i12 = (int) f1;
                if (b1) break;
                i14 *= i15;
                f1 -= i12;
                i14 += i12;
                i16 = 1;
                do {
                    iArr[i11] = 140;
                    b1 = b1;
                    i12 >>= i14;
                    i10 += i16;
                    if (b1) break;
                } while (++i16 < 2);
            }
        }
        vMeth1_check_sum += i10 + i11 + i12 + i13 + i14 + Float.floatToIntBits(f1) + (b1 ? 1 : 0) + i15 + i16 +
                FuzzerUtils.checkSum(iArr);
    }

    public static void main(String[] strArr) {

        try {
            Test0474 _instance = new Test0474();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void vMeth() {

        float f = 15.710F;
        int i17 = 9, i18 = 2, i19 = 1, i20 = -7;

        Test0474.instanceCount = (long) (248 - (dFld += (109.77775 + iFld)));
        iFld <<= (int) (Math.abs((long) (iFld - f)) * (Test0474.instanceCount |= (long) (197 - f)));
        iFld -= (int) (iFld - (Test0474.instanceCount * (iFld * iFld)));
        vMeth1();
        for (i17 = 4; 206 > i17; i17++) {
            byFld += (byte) Test0474.instanceCount;
            lArrFld[i17 - 1] = i18;
        }
        for (i19 = 11; i19 < 342; i19++) {
            i20 = i18;
            i18 <<= 7;
            iFld ^= i17;
            Test0474.iArrFld[i19 - 1] += (int) f;
        }
        f -= i18;
        Test0474.iArrFld[(3 >>> 1) % N] -= iFld;
        iFld += i18;
        vMeth_check_sum += Float.floatToIntBits(f) + i17 + i18 + i19 + i20;
    }

    public void mainTest(String[] strArr1) {

        int i21 = 3, i22 = 6, i23 = -166, i25 = 39270, i26 = 148, i27 = 49362;
        float f2 = -115.695F;
        float[] fArr = new float[N];
        boolean b2 = true;
        short s1 = -32349;

        FuzzerUtils.init(fArr, 44.842F);

        vMeth();
        i21 = 1;
        do {
            Test0474.instanceCount += (i21 * i21);
            switch (((i21 % 8) * 5) + 122) {
                case 156:
                    for (i22 = 107; i22 > 5; i22 -= 3) {
                        iFld = iFld;
                        i23 += (int) Test0474.instanceCount;
                        i23 = i23;
                        byFld -= (byte) Test0474.dFld1;
                    }
                    iFld <<= iFld;
                    fArr[i21] -= 31861;
                    if (b2) {
                        iFld <<= i21;
                    } else if (b2) {
                        i23 = i22;
                        iFld += i21;
                        iFld *= (int) Test0474.instanceCount;
                        i23 += i21;
                    } else if (true) {
                        iFld = byFld;
                        for (i25 = 107; i25 > 5; i25 -= 2) {
                            i23 -= (int) -2.663F;
                            switch (((i21 % 1) * 5) + 14) {
                                case 19:
                                    i27 = 1;
                                    while (++i27 < 3) {
                                        i26 = i22;
                                        iFld = i26;
                                        f2 = byFld;
                                        i23 &= i23;
                                        if (b2) continue;
                                        i23 += i27;
                                        Test0474.iArrFld[i27 - 1] >>= i26;
                                        Test0474.iArrFld = Test0474.iArrFld;
                                    }
                                    break;
                                default:
                                    iFld <<= i25;
                            }
                        }
                    } else {
                        fArr = FuzzerUtils.float1array(N, (float) 2.510F);
                    }
                    break;
                case 150:
                    if (b2) break;
                    break;
                case 138:
                    f2 = f2;
                case 158:
                    iFld += (-55680 + (i21 * i21));
                    break;
                case 135:
                    if (true) continue;
                case 132:
                    s1 >>= (short) -34645;
                    break;
                case 137:
                    i23 &= (int) Test0474.instanceCount;
                    break;
                case 145:
                    Test0474.iArrFld[i21] += (int) dFld;
                    break;
            }
        } while (++i21 < 234);

        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("f2 b2 s1 = " + Float.floatToIntBits(f2) + "," + (b2 ? 1 : 0) + "," + s1);
        FuzzerUtils.out.println("fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test0474.instanceCount dFld iFld = " + Test0474.instanceCount + "," +
                Double.doubleToLongBits(dFld) + "," + iFld);
        FuzzerUtils.out.println("Test0474.dFld1 byFld lArrFld = " + Double.doubleToLongBits(Test0474.dFld1) + "," + byFld + ","
                + FuzzerUtils.checkSum(lArrFld));
        FuzzerUtils.out.println("Test0474.iArrFld = " + FuzzerUtils.checkSum(Test0474.iArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
