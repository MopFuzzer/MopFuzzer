// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:54 2023
public class Test0060 {

    public static final int N = 400;

    public static long instanceCount = 193L;
    public static int iFld = 164;
    public static short sFld = -13129;
    public static volatile long[] lArrFld = new long[N];
    public static byte[] byArrFld = new byte[N];
    public static byte[][] byArrFld1 = new byte[N][N];
    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0060.lArrFld, -4060559741L);
        FuzzerUtils.init(Test0060.byArrFld, (byte) -124);
        FuzzerUtils.init(Test0060.byArrFld1, (byte) 115);
    }

    public byte byFld = -47;

    public static void vMeth() {

        int i9 = 45, i10 = -1, i11 = 7, i12 = 46445, i13 = 52601, i14 = -53;
        float f1 = 2.4F;

        Test0060.instanceCount = Test0060.iFld;
        for (i9 = 7; i9 < 123; ++i9) {
            i11 = 1;
            while (++i11 < 13) {
                for (i12 = i11; i12 < 1; i12++) {
                    switch ((i12 % 7) + 20) {
                        case 20:
                            Test0060.iFld = i10;
                            Test0060.lArrFld[i12 + 1] <<= i11;
                            i10 *= i10;
                            break;
                        case 21:
                            i14 -= -36153;
                            f1 += i12;
                            break;
                        case 22:
                            Test0060.iFld += i12;
                            if (i13 != 0) {
                                vMeth_check_sum += i9 + i10 + i11 + i12 + i13 + i14 + Float.floatToIntBits(f1);
                                return;
                            }
                            i13 *= (int) Test0060.instanceCount;
                        case 23:
                            Test0060.instanceCount = (long) 2.324F;
                            i14 = i11;
                            break;
                        case 24:
                            Test0060.iFld = (int) 121.130106;
                            break;
                        case 25:
                        case 26:
                            i13 >>>= 1776;
                            break;
                    }
                }
            }
        }
        vMeth_check_sum += i9 + i10 + i11 + i12 + i13 + i14 + Float.floatToIntBits(f1);
    }

    public static int iMeth(boolean b, int i8) {

        float f = 53.454F;
        short s = 20257;
        int i15 = -6, i16 = -28832, i17 = 0;
        double d1 = 0.36334;
        boolean[] bArr = new boolean[N];

        FuzzerUtils.init(bArr, false);

        f -= (Test0060.instanceCount--);
        s = (short) i8;
        vMeth();
        i15 = 1;
        do {
            switch (((Test0060.iFld >>> 1) % 5) + 42) {
                case 42:
                    Test0060.iFld += Test0060.iFld;
                    Test0060.iFld >>= (int) Test0060.instanceCount;
                    s ^= (short) i8;
                    Test0060.instanceCount -= Test0060.iFld;
                    break;
                case 43:
                    i16 = 1;
                    do {
                        for (d1 = 1; 5 > d1; d1++) {
                            Test0060.iFld = (int) Test0060.instanceCount;
                            bArr[i16] = false;
                            i17 >>= -161;
                            if (b) continue;
                        }
                    } while ((i16 += 3) < 5);
                case 44:
                    Test0060.instanceCount = (long) d1;
                case 45:
                    Test0060.instanceCount += i15;
                    break;
                case 46:
            }
        } while (++i15 < 321);
        long meth_res = (b ? 1 : 0) + i8 + Float.floatToIntBits(f) + s + i15 + i16 + Double.doubleToLongBits(d1) + i17
                + FuzzerUtils.checkSum(bArr);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0060 _instance = new Test0060();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public long lMeth(int i3, double d) {

        long l = 4271982098L;
        int i4 = 130;
        int i5 = -43236;
        int i6 = 211;
        int i7 = -41;
        int[] iArr = new int[N];
        boolean b1 = true;

        FuzzerUtils.init(iArr, -11);

        i3 = (int) ((iArr[(i3 >>> 1) % N] + (++d)) + ((-41 - i3) - Integer.reverseBytes(i3)));
        for (l = 333; l > 19; --l) {
            for (i5 = 1; i5 < 5; ++i5) {
                i7 = 1;
                do {
                    switch ((int) ((l % 7) + 125)) {
                        case 125:
                            i6 = (Math.max(-iMeth(b1, i4), i3) + -20983);
                            iArr[i5 + 1] ^= i6;
                            break;
                        case 126:
                            Test0060.byArrFld[i5] = (byte) i7;
                            break;
                        case 127:
                            i6 <<= (int) l;
                        case 128:
                            i4 += (i7 | i5);
                            d *= Test0060.instanceCount;
                            break;
                        case 129:
                            i4 = (int) Test0060.instanceCount;
                        case 130:
                            Test0060.lArrFld[i7 + 1] = Test0060.instanceCount;
                            byFld += (byte) (i7 * i7);
                            Test0060.lArrFld[(int) (l - 1)] = l;
                        case 131:
                            Test0060.byArrFld1 = Test0060.byArrFld1;
                            break;
                        default:
                            i3 = (int) Test0060.instanceCount;
                    }
                } while (++i7 < 2);
            }
        }
        long meth_res = i3 + Double.doubleToLongBits(d) + l + i4 + i5 + i6 + i7 + (b1 ? 1 : 0) +
                FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i = 8;
        int i1 = 6;
        int i2 = 203;
        int i18 = 3;
        int i19 = -137;
        int i20 = -199;
        int i21 = -10;
        int i22 = 0;
        int i23 = 49970;
        int i24 = 21;
        int i25 = 51814;
        int i26 = 209;
        int i27 = -10;
        int[] iArr1 = new int[N];
        double d2 = -123.39680;
        boolean b2 = true;
        long[][] lArr = new long[N][N];

        FuzzerUtils.init(lArr, -904296699714410828L);
        FuzzerUtils.init(iArr1, -8);

        lArr[(i >>> 1) % N] = lArr[(i >>> 1) % N];
        for (i1 = 4; i1 < 297; i1++) {
            i2 += (int) lMeth(i2, d2);
            for (i18 = 5; i18 < 86; i18++) {
                i = i2;
            }
            for (i20 = 5; i20 < 86; i20++) {
                d2 = Test0060.iFld;
                Test0060.instanceCount -= Test0060.instanceCount;
            }
            Test0060.sFld += (short) i1;
            Test0060.sFld = (short) -9;
            iArr1[i1] = (int) Test0060.instanceCount;
        }
        b2 = b2;
        i21 -= i19;
        i = (int) Test0060.instanceCount;
        for (i22 = 8; i22 < 288; ++i22) {
            i21 += (((i22 * Test0060.instanceCount) + Test0060.sFld) - Test0060.iFld);
            i23 = -56;
            Test0060.instanceCount = i22;
            i24 = 1;
            while (++i24 < 90) {
                for (i25 = 1; i25 < 1; i25++) {
                    i26 = -7300;
                    i *= i1;
                    Test0060.instanceCount += (i25 * i25);
                    Test0060.instanceCount -= -205;
                    Test0060.instanceCount += i;
                    if (b2) {
                        iArr1 = iArr1;
                        Test0060.instanceCount -= i21;
                    } else if (false) {
                        Test0060.instanceCount += Test0060.sFld;
                        i21 += (((i25 * i24) + i1) - i27);
                    } else {
                        if (b2) break;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("d2 i18 i19 = " + Double.doubleToLongBits(d2) + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 b2 = " + i20 + "," + i21 + "," + (b2 ? 1 : 0));
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("lArr iArr1 = " + FuzzerUtils.checkSum(lArr) + "," + FuzzerUtils.checkSum(iArr1));

        FuzzerUtils.out.println("Test0060.instanceCount Test0060.iFld byFld = " + Test0060.instanceCount + "," + Test0060.iFld + "," +
                byFld);
        FuzzerUtils.out.println("Test0060.sFld Test0060.lArrFld Test0060.byArrFld = " + Test0060.sFld + "," +
                FuzzerUtils.checkSum(Test0060.lArrFld) + "," + FuzzerUtils.checkSum(Test0060.byArrFld));
        FuzzerUtils.out.println("Test0060.byArrFld1 = " + FuzzerUtils.checkSum(Test0060.byArrFld1));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  vMeth ->  vMeth iMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}