// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:09 2023
public class Test0643 {

    public static final int N = 400;

    public static long instanceCount = -4067620986367236895L;
    public static int iFld = 54443;
    public static boolean bFld = false;
    public static float fFld1 = 0.999F;
    public static volatile short sFld = -613;
    public static byte byFld = 62;
    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long lMeth1_check_sum = 0;
    public volatile float fFld = 0.798F;
    public int iFld1 = 55220;
    public int[] iArrFld = new int[N];

    public static long lMeth1() {

        int i10 = -7697;
        int i11 = -233;
        int i12 = -14452;
        int i13 = -12;
        int i14 = -6;
        int[] iArr1 = new int[N];
        double d1 = -2.69197;
        long[] lArr = new long[N];

        FuzzerUtils.init(iArr1, -230);
        FuzzerUtils.init(lArr, 6L);

        for (int i9 : iArr1) {
            i10 = 1;
            do {
                i9 = 12;
            } while (++i10 < 4);
            i9 >>= (int) -423984446L;
            for (i11 = 1; i11 < 4; ++i11) {
                Test0643.instanceCount += (((i11 * Test0643.fFld1) + i11) - i9);
                Test0643.sFld -= (short) Test0643.fFld1;
                Test0643.instanceCount -= i9;
                if (Test0643.bFld) continue;
                for (i13 = 2; i13 > 1; i13--) {
                    Test0643.iFld += (((i13 * i11) + i13) - i10);
                    d1 *= Test0643.iFld;
                    Test0643.iFld += (int) d1;
                }
                Test0643.byFld ^= (byte) Test0643.instanceCount;
            }
            Test0643.sFld = (short) 0;
        }
        long meth_res = i10 + i11 + i12 + i13 + i14 + Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr1) +
                FuzzerUtils.checkSum(lArr);
        lMeth1_check_sum += meth_res;
        return (long) meth_res;
    }

    public static long lMeth() {

        int i8 = -14;
        int i15 = -10;
        int i16 = -37722;
        int i17 = 4;
        int i18 = -222;
        int[] iArr2 = new int[N];
        double[] dArr = new double[N];

        FuzzerUtils.init(dArr, 2.37497);
        FuzzerUtils.init(iArr2, 0);

        Test0643.iFld = ((Test0643.iFld++) + Test0643.iFld);
        Test0643.sFld >>= (short) ((++dArr[(Test0643.iFld >>> 1) % N]) + Test0643.iFld);
        i8 = 1;
        do {
            lMeth1();
            Test0643.iFld += i8;
            iArr2[i8 + 1] &= i8;
            Test0643.iFld *= 14;
            if (Test0643.bFld) {
                Test0643.iFld = (int) Test0643.instanceCount;
            } else if (true) {
                Test0643.iFld += (i8 - Test0643.iFld);
            }
        } while (++i8 < 295);
        for (i15 = 16; 309 > i15; i15++) {
            Test0643.iFld *= i8;
            for (i17 = 1; i17 < 6; i17++) {
                i18 ^= (int) Test0643.instanceCount;
                if (Test0643.bFld) continue;
            }
        }
        long meth_res = i8 + i15 + i16 + i17 + i18 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
                FuzzerUtils.checkSum(iArr2);
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public static void vMeth(double d, int i2, long l) {

        long l1 = 4094493037918324284L;
        int i3 = 52961;
        int i4 = -12;
        int i5 = -20615;
        int i6 = -225;
        int i7 = -44668;
        int[] iArr = new int[N];

        FuzzerUtils.init(iArr, 7201);

        for (l1 = 8; 244 > l1; l1++) {
            for (i4 = 1; i4 < 7; i4++) {
                i5 = (Test0643.iFld + (iArr[i4]++));
                switch ((((i5++) >>> 1) % 8) + 63) {
                    case 63:
                        for (i6 = i4; i6 < 2; i6++) {
                            l >>= (long) (i2 -= (int) (++Test0643.fFld1));
                            l = i3;
                            if ((lMeth() - Test0643.iFld) >= Test0643.iFld) continue;
                            iArr[i4] ^= (int) Test0643.instanceCount;
                            i3 >>= i5;
                            try {
                                Test0643.iFld = (i4 % i3);
                                i3 = (i5 % i6);
                                iArr[i4] = (i7 % iArr[(int) (l1 + 1)]);
                            } catch (ArithmeticException a_e) {
                            }
                            i7 += (int) l1;
                            i3 = i2;
                            iArr[i6 + 1] = (int) 2985252831446239204L;
                        }
                        i7 *= i4;
                        break;
                    case 64:
                        if (Test0643.bFld) break;
                        break;
                    case 65:
                        Test0643.bFld = Test0643.bFld;
                        break;
                    case 66:
                        Test0643.fFld1 += 2025014060L;
                    case 67:
                        Test0643.instanceCount *= -7235;
                        break;
                    case 68:
                        iArr[i4] = i5;
                        break;
                    case 69:
                        d += i4;
                        break;
                    case 70:
                        i7 -= (int) 0L;
                        break;
                    default:
                        Test0643.iFld += (((i4 * i7) + Test0643.instanceCount) - i2);
                }
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + i2 + l + l1 + i3 + i4 + i5 + i6 + i7 +
                FuzzerUtils.checkSum(iArr);
    }

    public static void main(String[] strArr) {

        try {
            Test0643 _instance = new Test0643();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public float fMeth(int i, boolean b, int i1) {


        i1 *= (int) (Test0643.instanceCount + Math.max(i1++, Test0643.iFld++));
        long meth_res = i + (b ? 1 : 0) + i1;
        fMeth_check_sum += meth_res;
        return (float) meth_res;
    }

    public void mainTest(String[] strArr1) {

        byte by = 53;
        double d2 = 0.127948;
        int i19 = 0, i20 = -121, i21 = 48012, i22 = 44483, i23 = 14947, i24 = 78, i25 = -76, i26 = 3, i27 = -20745, i28 = 194;
        float f = -109.542F;
        long[] lArr1 = new long[N];

        FuzzerUtils.init(lArr1, 8251651935298406913L);

        Test0643.iFld = (int) fMeth(Test0643.iFld - (iArrFld[(37819 >>> 1) % N]++), Test0643.bFld = (fFld <= by),
                (int) (Test0643.instanceCount - (-(Test0643.instanceCount - Test0643.iFld))));
        Test0643.iFld = (int) Test0643.instanceCount;
        vMeth(d2, Test0643.iFld, Test0643.instanceCount);
        Test0643.iFld -= (int) fFld;
        for (i19 = 13; i19 < 393; ++i19) {
            Test0643.iFld >>>= (int) Test0643.instanceCount;
            for (i21 = 66; i21 > 2; i21--) {
                i22 += iFld1;
                for (i23 = i21; i23 < 2; ++i23) {
                    if (Test0643.bFld) break;
                    lArr1[i19 + 1] = i20;
                    by += (byte) (i23 * i23);
                }
                Test0643.iFld += i21;
                for (i25 = 1; i25 < 2; ++i25) {
                    i24 >>= (int) Test0643.instanceCount;
                }
                iArrFld[i21] = -486;
                for (i27 = 1; i27 < 2; i27++) {
                    i20 = Test0643.byFld;
                    d2 = Test0643.instanceCount;
                    Test0643.sFld += (short) i27;
                    fFld = -7L;
                    i24 >>= i20;
                    lArr1[i27 - 1] *= Test0643.instanceCount;
                }
                i28 += (i21 ^ Test0643.instanceCount);
                try {
                    i26 = (i19 / iArrFld[i19 + 1]);
                    Test0643.iFld = (Test0643.iFld % iArrFld[i21]);
                    Test0643.iFld = (-233 / i24);
                } catch (ArithmeticException a_e) {
                }
                Test0643.sFld += (short) (i21 * fFld);
            }
            f = 1;
            while (++f < 66) {
                iFld1 >>>= (int) Test0643.instanceCount;
                Test0643.instanceCount >>>= i23;
                i26 /= (int) (iFld1 | 1);
            }
        }

        FuzzerUtils.out.println("by d2 i19 = " + by + "," + Double.doubleToLongBits(d2) + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 i27 i28 = " + i26 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("f lArr1 = " + Float.floatToIntBits(f) + "," + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test0643.instanceCount Test0643.iFld Test0643.bFld = " + Test0643.instanceCount + "," + Test0643.iFld +
                "," + (Test0643.bFld ? 1 : 0));
        FuzzerUtils.out.println("fFld Test0643.fFld1 Test0643.sFld = " + Float.floatToIntBits(fFld) + "," +
                Float.floatToIntBits(Test0643.fFld1) + "," + Test0643.sFld);
        FuzzerUtils.out.println("Test0643.byFld iFld1 iArrFld = " + Test0643.byFld + "," + iFld1 + "," +
                FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("lMeth1_check_sum: " + lMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  lMeth1 ->  lMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
