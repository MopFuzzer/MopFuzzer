// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:06 2023
public class Test0541 {

    public static final int N = 400;

    public static long instanceCount = 0L;
    public static double dFld = 0.109112;
    public static short sFld = 14801;
    public static float fFld1 = 0.602F;
    public static boolean bFld = true;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public float fFld = 1.148F;
    public int[] iArrFld = new int[N];
    public long[] lArrFld = new long[N];
    public volatile float[] fArrFld = new float[N];

    public static double dMeth() {

        int i8 = 23;

        Test0541.fFld1 *= i8;
        long meth_res = i8;
        dMeth_check_sum += meth_res;
        return (double) meth_res;
    }

    public static long lMeth(float f, int i5, int i6) {

        long l1 = -1L;
        long l2 = 229L;
        long[] lArr1 = new long[N];
        int i7 = -246, i9 = -153, i10 = 32134, i11 = 38;
        boolean b = true;
        short s = -31242;

        FuzzerUtils.init(lArr1, -5123350019045915704L);

        for (l1 = 9; l1 < 182; ++l1) {
            if ((-Math.max(-2182517513L, --lArr1[(int) (l1)])) != (i6--)) break;
            i6 *= Math.max((int) ((i5 * 165) + (-8 - (++Test0541.dFld))), (int) (0.728F + (i7 + i7)));
            f = (float) Test0541.dFld;
            Test0541.sFld -= (short) (((5 + (i7 % ((long) (f) | 1))) - dMeth()) + -76);
            for (l2 = 1; l2 < 9; l2++) {
                i6 = i7;
            }
            i5 += i6;
            Test0541.instanceCount = i6;
            if (b) break;
        }
        s -= (short) i5;
        i6 *= (int) Test0541.fFld1;
        for (i10 = 11; i10 < 183; i10++) {
            Test0541.instanceCount += i10;
            i5 += (((i10 * Test0541.sFld) + i11) - i10);
        }
        long meth_res = Float.floatToIntBits(f) + i5 + i6 + l1 + i7 + l2 + i9 + (b ? 1 : 0) + s + i10 + i11 +
                FuzzerUtils.checkSum(lArr1);
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0541 _instance = new Test0541();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void vMeth(int i2, int i3) {

        long l = 900170257L;
        long[] lArr = new long[N];
        int i4 = 14;
        boolean b1 = false;
        byte by = -101;

        FuzzerUtils.init(lArr, 167L);

        for (l = 10; 291 > l; l += 3) {
            lArr = (lArr = (lArr = (lArr = lArr)));
            i4 += (int) (l * l);
            i3 <<= (int) ((-(i4 * Test0541.dFld)) - Math.min(-48634, Math.min(i3, i4)));
            if (i3 != 0) {
                vMeth_check_sum += i2 + i3 + l + i4 + (b1 ? 1 : 0) + by + FuzzerUtils.checkSum(lArr);
                return;
            }
            switch ((int) (((l % 2) * 5) + 119)) {
                case 126:
                    switch ((((iArrFld[(int) (l + 1)] >>> 1) % 1) * 5) + 26) {
                        case 27:
                        default:
                            i2 |= (int) (lMeth(Test0541.fFld1, i2, i3) * i2);
                            lArr = lArr;
                    }
                    Test0541.sFld -= (short) i3;
                case 124:
                    i2 = i2;
                    break;
                default:
                    fFld -= i2;
                    if (b1) continue;
                    Test0541.fFld1 -= by;
            }
        }
        vMeth_check_sum += i2 + i3 + l + i4 + (b1 ? 1 : 0) + by + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i = 19183, i1 = 34865, i12 = 220, i13 = -12575, i14 = 12, i15 = -19, i16 = 6358, i17 = -2, i18 = 32056;
        byte by1 = 53;

        for (i = 4; i < 330; ++i) {
            i1 ^= (int) ((--i1) * (++fFld));
            i1 = (int) (Test0541.instanceCount++);
            vMeth(i1, i1);
            switch (((-7 >>> 1) % 5) + 3) {
                case 3:
                    Test0541.instanceCount &= i1;
                    iArrFld[i] -= i;
                    for (i12 = 3; i12 < 77; ++i12) {
                        i13 %= 3;
                        i14 = 1;
                        while (++i14 < 2) {
                            Test0541.instanceCount = i13;
                            i1 += (i14 + Test0541.instanceCount);
                            i13 += i14;
                        }
                        if (Test0541.bFld) continue;
                        i1 += (i12 | (long) fFld);
                    }
                case 4:
                    i1 = (int) 2517051780L;
                    for (i15 = 1; i15 < 77; ++i15) {
                        Test0541.instanceCount += (long) (-51.300F + (i15 * i15));
                        for (i17 = 1; i17 < 2; ++i17) {
                            i18 = i17;
                            fFld = 2651014153L;
                            Test0541.instanceCount += i17;
                            lArrFld[i15 + 1] *= (long) Test0541.fFld1;
                            Test0541.instanceCount += (((i17 * i14) + i1) - i13);
                            iArrFld[i - 1] += 221;
                            i18 = (int) Test0541.instanceCount;
                        }
                        fArrFld[i] = -215;
                    }
                    iArrFld[i - 1] += by1;
                    break;
                case 5:
                    Test0541.instanceCount += i;
                    i18 = (int) Test0541.fFld1;
                case 6:
                    Test0541.fFld1 += i13;
                    break;
                case 7:
                    fFld -= i1;
                    break;
                default:
                    i1 = by1;
            }
        }

        FuzzerUtils.out.println("i i1 i12 = " + i + "," + i1 + "," + i12);
        FuzzerUtils.out.println("i13 i14 i15 = " + i13 + "," + i14 + "," + i15);
        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("by1 = " + by1);

        FuzzerUtils.out.println("Test0541.instanceCount fFld Test0541.dFld = " + Test0541.instanceCount + "," +
                Float.floatToIntBits(fFld) + "," + Double.doubleToLongBits(Test0541.dFld));
        FuzzerUtils.out.println("Test0541.sFld Test0541.fFld1 Test0541.bFld = " + Test0541.sFld + "," +
                Float.floatToIntBits(Test0541.fFld1) + "," + (Test0541.bFld ? 1 : 0));
        FuzzerUtils.out.println("iArrFld lArrFld fArrFld = " + FuzzerUtils.checkSum(iArrFld) + "," +
                FuzzerUtils.checkSum(lArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));

        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  dMeth ->  dMeth lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}