// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:13 2023
public class Test0796 {

    public static final int N = 400;

    public static long instanceCount = 27867L;
    public static volatile int iFld = -5;
    public static float fFld = -49.163F;
    public static byte byFld = -28;
    public static long iMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public boolean bFld = true;
    public volatile int[] iArrFld = new int[N];

    public static void vMeth() {

        int i7 = -8;
        int i8 = -5372;
        int i9 = -210;
        int i10 = -59109;
        int i11 = 5;
        int i12 = -1;
        int[] iArr1 = new int[N];
        boolean b = false;
        double d1 = 0.49480;
        double[] dArr = new double[N];
        short s1 = 9384;

        FuzzerUtils.init(dArr, -2.66864);
        FuzzerUtils.init(iArr1, -7);

        dArr[(Test0796.iFld >>> 1) % N] = 2;
        if (b) {
            for (i7 = 5; i7 < 148; ++i7) {
                Test0796.instanceCount = Test0796.instanceCount;
                i9 = 11;
                while (--i9 > 0) {
                    dArr[i9 - 1] -= Test0796.iFld;
                }
                Test0796.instanceCount = -22939;
            }
            Test0796.fFld += i7;
        }
        Test0796.instanceCount += (long) d1;
        for (i10 = 13; i10 < 299; i10++) {
            i12 = 1;
            while (++i12 < 6) {
                iArr1[i10 - 1] += 2100;
                Test0796.instanceCount += (i12 | i9);
                i8 += (i12 + s1);
                i8 -= -120;
            }
        }
        vMeth_check_sum += i7 + i8 + i9 + (b ? 1 : 0) + Double.doubleToLongBits(d1) + i10 + i11 + i12 + s1 +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr1);
    }

    public static boolean bMeth(long l) {

        double d = 0.78579;
        int i6 = 18378, i13 = 43084;
        float f = -80.365F;
        float[] fArr = new float[N];
        byte by = -35;
        short s2 = -19674;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, 650352454L);
        FuzzerUtils.init(fArr, 1.977F);

        for (d = 1; d < 123; ++d) {
            vMeth();
            for (f = 1; f < 13; ++f) {
                i6 *= i6;
                i13 -= -23057;
                l += (long) (((f * f) + i6) - l);
                i6 += (int) f;
                i6 >>= Test0796.iFld;
                i13 /= (int) (Test0796.iFld | 1);
                switch (((Test0796.iFld >>> 1) % 4) + 58) {
                    case 58:
                        Test0796.instanceCount += (-104 + (f * f));
                        lArr[(int) (f)] -= i6;
                        break;
                    case 59:
                        lArr[(i13 >>> 1) % N] <<= Test0796.iFld;
                        i13 = (int) Test0796.fFld;
                        i6 -= i13;
                        break;
                    case 60:
                        by += (byte) ((long) f | s2);
                    case 61:
                        fArr[(int) (d)] *= s2;
                        break;
                }
            }
        }
        long meth_res = l + Double.doubleToLongBits(d) + i6 + Float.floatToIntBits(f) + i13 + by + s2 +
                FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static void main(String[] strArr) {

        try {
            Test0796 _instance = new Test0796();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public int iMeth(int i) {

        int i1 = 218, i2 = 2876, i3 = -162, i4 = 31485, i5 = -79, i14 = 2, i15 = -7;
        short s = 4540;

        for (i1 = 13; i1 < 286; ++i1) {
            for (i3 = i1; 6 > i3; i3++) {
                i += (i3 * i3);
                i5 = 1;
                do {
                    i2 += (int) (0.170F * s);
                    i4 >>= (((i1 + i2) + (--i2)) - ((i++) << -3));
                    i += (((i5 * i3) + Test0796.instanceCount) - Test0796.instanceCount);
                    iArrFld[i3 + 1] >>= (s--);
                    bFld = bMeth(Test0796.instanceCount);
                    Test0796.instanceCount >>>= Test0796.instanceCount;
                } while (++i5 < 1);
                for (i14 = 1; 1 > i14; i14 += 2) {
                    Test0796.instanceCount >>>= i;
                    Test0796.iFld += i;
                    i4 = 11186;
                    Test0796.instanceCount += i14;
                }
            }
        }
        long meth_res = i + i1 + i2 + i3 + i4 + i5 + s + i14 + i15;
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public void mainTest(String[] strArr1) {

        short s3 = 26661;
        short[] sArr = new short[N];
        double d2 = 67.94432, d3 = -54.54380;
        int i17 = 5;
        int i18 = 18;
        int i19 = -97;
        int i20 = -38302;
        int i21 = -13;
        int[] iArr = new int[N];

        FuzzerUtils.init(iArr, 18087);
        FuzzerUtils.init(sArr, (short) 30343);

        iArr[(Test0796.iFld >>> 1) % N] *= (int) (((Test0796.iFld + Test0796.instanceCount) - (-iMeth(Test0796.iFld))) - Test0796.iFld);
        s3 -= (short) Test0796.iFld;
        Test0796.iFld = Test0796.iFld;
        Test0796.iFld *= (int) -6L;
        try {
            if (bFld) {
                for (short s4 : sArr) {
                    int i16 = -40106;
                    Test0796.instanceCount = s3;
                    Test0796.iFld += Test0796.iFld;
                    Test0796.instanceCount *= Test0796.iFld;
                    i16 = 35828;
                    Test0796.iFld -= (int) Test0796.instanceCount;
                    Test0796.instanceCount -= Test0796.iFld;
                    i16 ^= (int) -1894673911L;
                }
                Test0796.fFld -= Test0796.instanceCount;
                Test0796.instanceCount += Test0796.iFld;
                for (d2 = 7 - 400; d2 < 140; d2 += 3) {
                    Test0796.iFld = Test0796.iFld;
                    Test0796.byFld -= (byte) Test0796.instanceCount;
                    d3 = Test0796.iFld;
                    i17 *= 36;
                }
            } else if (bFld) {
                i17 += -76;
                Test0796.iFld += (int) Test0796.instanceCount;
            }
            i17 += Test0796.iFld;
            Test0796.iFld = (int) Test0796.instanceCount;
        } catch (ArrayIndexOutOfBoundsException exc1) {
            for (i18 = 22; i18 < 354; i18++) {
                i17 += (int) (-245L + (i18 * i18));
                for (i20 = 2; 76 > i20; i20++) {
                    Test0796.instanceCount |= i20;
                }
                i17 *= -39295;
            }
        }

        FuzzerUtils.out.println("s3 d2 i17 = " + s3 + "," + Double.doubleToLongBits(d2) + "," + i17);
        FuzzerUtils.out.println("d3 i18 i19 = " + Double.doubleToLongBits(d3) + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 iArr = " + i20 + "," + i21 + "," + FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println("sArr = " + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test0796.instanceCount Test0796.iFld bFld = " + Test0796.instanceCount + "," + Test0796.iFld + "," +
                (bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0796.fFld Test0796.byFld iArrFld = " + Float.floatToIntBits(Test0796.fFld) + "," + Test0796.byFld
                + "," + FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  bMeth ->  bMeth iMeth mainTest
//DEBUG  vMeth ->  vMeth bMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
