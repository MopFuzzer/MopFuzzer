// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:59 2023
public class Test0265 {

    public static final int N = 400;

    public static long instanceCount = 804978439L;
    public static byte byFld = -126;
    public static int[] iArrFld = new int[N];
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0265.iArrFld, -2);
    }

    public boolean bFld = true;
    public int iFld = 129;
    public short[] sArrFld = new short[N];
    public long[] lArrFld = new long[N];

    public static long lMeth(int i6) {

        float f = 0.1016F;
        float[][] fArr = new float[N][N];
        int i7 = -12, i8 = 18835, i9 = 99;
        boolean b = true;
        short[] sArr = new short[N];

        FuzzerUtils.init(sArr, (short) 15080);
        FuzzerUtils.init(fArr, -111.280F);

        f += -22621;
        for (i7 = 8; 235 > i7; ++i7) {
            if (b) {
                i6 *= i6;
                sArr[i7 + 1] += (short) 201381464211439429L;
            } else if (b) {
                i6 += (248 + (i7 * i7));
            } else {
                Test0265.iArrFld[i7 - 1] = (int) -14L;
                i6 &= i8;
                i6 += (i7 + i7);
                i8 += (((i7 * i7) + i6) - i8);
            }
            i8 -= i8;
            i9 = 1;
            do {
                i6 += (((i9 * i6) + i9) - Test0265.instanceCount);
                fArr[i9 - 1] = fArr[i7 - 1];
                f += i9;
            } while ((i9 += 3) < 7);
        }
        long meth_res = i6 + Float.floatToIntBits(f) + i7 + i8 + (b ? 1 : 0) + i9 + FuzzerUtils.checkSum(sArr) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public static int iMeth(double d1, double d2) {

        int i10 = -193, i11 = -22198, i12 = 172, i13 = 44637, i14 = 48381;
        short s = -4565;

        Test0265.iArrFld[(-57468 >>> 1) % N] *= (int) ((lMeth(i10) - i11) - Test0265.instanceCount);
        for (i12 = 1; i12 < 182; i12++) {
            i14 = 1;
            while (++i14 < 9) {
                Test0265.iArrFld[i14 - 1] = i13;
                i13 *= Test0265.byFld;
                i13 = i13;
                s ^= (short) i13;
                i13 -= (int) 1124541213332155394L;
                switch (((227 >>> 1) % 2) + 63) {
                    case 63:
                        Test0265.iArrFld[i14 - 1] *= (int) 185L;
                        i13 += (int) Test0265.instanceCount;
                        i11 = i12;
                    case 64:
                        i10 += i12;
                }
                i10 >>= Test0265.byFld;
                Test0265.iArrFld[i14] *= (int) Test0265.instanceCount;
            }
        }
        long meth_res = Double.doubleToLongBits(d1) + Double.doubleToLongBits(d2) + i10 + i11 + i12 + i13 + i14 + s;
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth() {

        int i2 = -45436, i3 = -60004, i4 = 21587, i5 = -4, i15 = -87, i16 = -42, i17 = 8;
        byte by = 23;
        double d = 99.102697;
        double[] dArr = new double[N];
        float f1 = 0.823F;

        FuzzerUtils.init(dArr, 0.87464);

        for (i2 = 14; i2 < 378; i2++) {
            for (i4 = 1; i4 < 5; ++i4) {
                by -= (byte) Test0265.iArrFld[i2 + 1];
                d = iMeth(d, d);
                try {
                    i5 = (20120 % i5);
                    i3 = (-51 % i4);
                    i3 = (i15 / i3);
                } catch (ArithmeticException a_e) {
                }
                f1 *= (float) d;
                i15 -= i3;
                Test0265.iArrFld[i2] *= i16;
                dArr[i4 + 1] = i2;
                i3 *= (int) Test0265.instanceCount;
                f1 = i16;
                i17 = 1;
                do {
                    d += i5;
                    i5 = i5;
                    i5 -= i5;
                } while (++i17 < 2);
            }
        }
        vMeth_check_sum += i2 + i3 + i4 + i5 + by + Double.doubleToLongBits(d) + i15 + Float.floatToIntBits(f1) + i16 +
                i17 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void main(String[] strArr) {

        try {
            Test0265 _instance = new Test0265();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = -2936;
        int i1 = 64069;
        int i18 = -6;
        int i19 = -4681;
        int i20 = 7;
        int i21 = 11024;
        int[] iArr = new int[N];
        float f2 = 2.54F;
        double d3 = -111.54879;
        byte[] byArr = new byte[N];

        FuzzerUtils.init(iArr, -3);
        FuzzerUtils.init(byArr, (byte) -23);

        for (i = 18; i < 375; ++i) {
            Test0265.instanceCount <<= iArr[i + 1];
            vMeth();
            for (i18 = 3; i18 < 71; ++i18) {
                for (i20 = 1; i20 < 2; ++i20) {
                    Test0265.byFld = (byte) i1;
                    i1 -= i20;
                    Test0265.iArrFld[i20] *= i21;
                    iArr = Test0265.iArrFld;
                    if (bFld) {
                        Test0265.instanceCount = -179;
                        i19 = i20;
                        i1 += (((i20 * i20) + i18) - i1);
                    }
                    Test0265.instanceCount = i;
                    switch ((i20 % 4) + 101) {
                        case 101:
                            i19 += (int) 1.368F;
                            i21 *= 58;
                            Test0265.instanceCount += i20;
                        case 102:
                            i19 = i20;
                            iArr[i20 + 1] = (int) Test0265.instanceCount;
                            break;
                        case 103:
                            Test0265.iArrFld[i20 - 1] = 82;
                            i1 += (i20 * i20);
                            try {
                                iArr[i20] = (i1 / 37072);
                                i19 = (-68427620 % i21);
                                i21 = (50287 % i21);
                            } catch (ArithmeticException a_e) {
                            }
                            sArrFld[i18] += (short) iFld;
                            break;
                        case 104:
                            f2 = i;
                            if (bFld) {
                                d3 %= (i20 | 1);
                                iFld = i21;
                                if (false) break;
                                byArr[i] = (byte) -28991;
                            } else if (bFld) {
                                lArrFld[i18] *= Test0265.instanceCount;
                            }
                            break;
                        default:
                            i19 = i1;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 i18 = " + i + "," + i1 + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("f2 d3 iArr = " + Float.floatToIntBits(f2) + "," + Double.doubleToLongBits(d3) + "," +
                FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println("byArr = " + FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test0265.instanceCount Test0265.byFld bFld = " + Test0265.instanceCount + "," + Test0265.byFld + "," +
                (bFld ? 1 : 0));
        FuzzerUtils.out.println("iFld Test0265.iArrFld sArrFld = " + iFld + "," + FuzzerUtils.checkSum(Test0265.iArrFld) + ","
                + FuzzerUtils.checkSum(sArrFld));
        FuzzerUtils.out.println("lArrFld = " + FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
