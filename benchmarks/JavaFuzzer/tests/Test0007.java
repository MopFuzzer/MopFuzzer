// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:53 2023
public class Test0007 {

    public static final int N = 400;

    public static volatile long instanceCount = -7L;
    public static int iFld = -145;
    public static byte byFld = -122;

    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;

    public static boolean bMeth(int i4, int i5, int i6) {

        int i7 = -40;
        int i8 = 13;
        int i9 = 17679;
        int i10 = -61297;
        int i11 = 9;
        int i12 = -11;
        int i13 = 87;
        int i14 = 12;
        int i15 = 165;
        int i16 = 5883;
        int[] iArr1 = new int[N];
        float f2 = 1.974F;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, -6567546209455139897L);
        FuzzerUtils.init(iArr1, 7);

        i7 = 1;
        do {
            for (i8 = 1; i8 < 5; i8++) {
                f2 -= i6;
                lArr[i8 + 1] += Test0007.instanceCount;
            }
            for (i10 = 1; i10 < 5; ++i10) {
                i9 >>= 63557;
            }
            i12 = 1;
            do {
                for (i13 = 1; i13 > i12; i13 -= 2) {
                    iArr1[i13] -= (int) Test0007.instanceCount;
                    Test0007.instanceCount <<= Test0007.byFld;
                    Test0007.instanceCount -= 23;
                    Test0007.iFld &= (int) Test0007.instanceCount;
                }
                for (i15 = 1; i15 > 1; --i15) {
                    iArr1[i7] *= 2;
                    f2 -= 2;
                }
            } while (++i12 < 5);
        } while (++i7 < 362);
        long meth_res = i4 + i5 + i6 + i7 + i8 + i9 + Float.floatToIntBits(f2) + i10 + i11 + i12 + i13 + i14 + i15 +
                i16 + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static int iMeth(float f1, int i3) {

        boolean b1 = true;

        b1 = bMeth(i3, i3, i3);
        long meth_res = Float.floatToIntBits(f1) + i3 + (b1 ? 1 : 0);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static long lMeth() {

        double d = -98.102725;
        boolean b = true;
        int i2 = 9;
        int[] iArr = new int[N];
        float f3 = 0.570F;
        short s = 14717;
        long l = -6152230686527663052L;

        FuzzerUtils.init(iArr, 82);

        d = 1;
        while (++d < 374) {
            b = (b = b);
            Test0007.iFld &= (--Test0007.iFld);
            iArr[(int) (d + 1)] = (int) ((Integer.reverseBytes(17383) + iArr[(int) (d + 1)]) - Test0007.instanceCount);
            i2 = 1;
            while (++i2 < 5) {
                byte by = -72;
                Test0007.iFld = (~iMeth(f3, Test0007.iFld));
                iArr[i2 + 1] &= s;
                if (b) continue;
                f3 = by;
                l = 1;
                while (++l < 1) {
                    iArr[(int) (d + 1)] -= (int) f3;
                    Test0007.iFld = Test0007.iFld;
                    if (i2 != 0) {
                    }
                    iArr[(int) (l)] = -4;
                    iArr[(int) (l - 1)] += (int) Test0007.instanceCount;
                }
            }
        }
        long meth_res = Double.doubleToLongBits(d) + (b ? 1 : 0) + i2 + Float.floatToIntBits(f3) + s + l +
                FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0007 _instance = new Test0007();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        float f = -2.708F;
        int i = -4;
        int i1 = 11;
        int i17 = 8;
        int i18 = 62501;
        int i19 = -43747;
        int i20 = -2;
        int i21 = 13;
        int i22 = -19758;
        int[] iArr2 = new int[N];
        short s1 = -12165;
        short[] sArr = new short[N];
        long[][] lArr1 = new long[N][N];

        FuzzerUtils.init(iArr2, -6);
        FuzzerUtils.init(lArr1, 682838973L);
        FuzzerUtils.init(sArr, (short) -6013);

        Test0007.iFld = (Math.min((int) (f * Test0007.iFld), Test0007.iFld * -46464) << -228);
        for (i = 16; i < 321; i++) {
            Test0007.iFld = (int) (lMeth() >> Test0007.instanceCount);
            f = Test0007.iFld;
            Test0007.iFld += s1;
            i17 = 1;
            do {
                for (i18 = 1; 1 < i18; --i18) {
                    Test0007.instanceCount <<= -23;
                }
                iArr2[i] = i18;
                Test0007.instanceCount = i18;
                Test0007.iFld += i17;
                Test0007.iFld -= i1;
                for (i20 = 1; 1 > i20; ++i20) {
                    lArr1[i20][i] = i20;
                    Test0007.instanceCount += (i20 * i20);
                    Test0007.instanceCount += (i20 * i20);
                    Test0007.iFld = i19;
                    Test0007.iFld += Test0007.iFld;
                    i19 += i18;
                    iArr2[i17 + 1] = s1;
                    i21 = i;
                    i21 += i20;
                }
                iArr2[i17 + 1] <<= i1;
                i21 += 122;
            } while (++i17 < 82);
            i22 = 1;
            do {
                i19 += (i22 | i1);
                Test0007.iFld = (int) Test0007.instanceCount;
                i21 = Test0007.iFld;
                Test0007.iFld >>>= i17;
            } while (++i22 < 82);
            sArr = sArr;
        }

        FuzzerUtils.out.println("f i i1 = " + Float.floatToIntBits(f) + "," + i + "," + i1);
        FuzzerUtils.out.println("s1 i17 i18 = " + s1 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 iArr2 lArr1 = " + i22 + "," + FuzzerUtils.checkSum(iArr2) + "," +
                FuzzerUtils.checkSum(lArr1));
        FuzzerUtils.out.println("sArr = " + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test0007.instanceCount Test0007.iFld Test0007.byFld = " + Test0007.instanceCount + "," + Test0007.iFld +
                "," + Test0007.byFld);

        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
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
//DEBUG  bMeth ->  bMeth iMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}