// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:53 2023
public class Test0015 {

    public static final int N = 400;

    public static volatile long instanceCount = 863557566853124429L;
    public static byte byFld = 31;
    public static double dFld = -64.71496;
    public static int[] iArrFld = new int[N];
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0015.iArrFld, -204);
    }

    public float fFld = 94.33F;

    public static void vMeth1(long l, int i7) {

        float f = -113.64F;
        int i9 = -55561, i10 = 12, i11 = -5, i12 = 47965, i13 = 5;
        boolean b1 = false;
        short s1 = 18157;

        i7 &= (int) l;
        i7 = -7;
        for (int i8 : Test0015.iArrFld) {
            i7 <<= Test0015.byFld;
            Test0015.dFld = f;
            for (i9 = 1; i9 < 4; i9++) {
                b1 = false;
                f += (((i9 * i10) + i8) - i9);
                l = l;
                i10 -= i7;
                for (i11 = i9; i11 < 2; ++i11) {
                    b1 = b1;
                    i7 = i8;
                    Test0015.instanceCount >>= i13;
                    Test0015.iArrFld[i9 + 1] += s1;
                }
            }
        }
        vMeth1_check_sum += l + i7 + Float.floatToIntBits(f) + i9 + i10 + (b1 ? 1 : 0) + i11 + i12 + i13 + s1;
    }

    public static int iMeth(double d2, double d3, int i4) {

        int i5 = -7, i6 = 181, i14 = -11, i15 = -50;
        short s2 = 3346;

        for (i5 = 4; i5 < 298; i5++) {
            i6 -= Test0015.iArrFld[i5 - 1];
            vMeth1(Test0015.instanceCount, i4);
            Test0015.instanceCount = i6;
            if (false) {
                i6 = s2;
                try {
                    i4 = (i4 % Test0015.iArrFld[i5 + 1]);
                    i4 = (-191 / i4);
                    i6 = (i5 % i6);
                } catch (ArithmeticException a_e) {
                }
                i4 = -9;
            }
            i4 -= i5;
            i4 *= -246;
            i6 += 66;
            for (i14 = 1; 6 > i14; ++i14) {
                Test0015.instanceCount -= i4;
                try {
                    i6 = (950205643 / i5);
                    Test0015.iArrFld[i5] = (-11 / i15);
                    i6 = (173 % i4);
                } catch (ArithmeticException a_e) {
                }
                i6 += (((i14 * i15) + i4) - i6);
            }
        }
        long meth_res = Double.doubleToLongBits(d2) + Double.doubleToLongBits(d3) + i4 + i5 + i6 + s2 + i14 + i15;
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth(boolean b, short s) {

        int i2 = -15114, i3 = 10, i16 = -102, i17 = 51602, i18 = -2717;
        double d1 = 2.48437;
        long l1 = -14L;
        float f1 = -17.363F;
        float[] fArr = new float[N];

        FuzzerUtils.init(fArr, 0.738F);

        for (i2 = 7; i2 < 272; i2++) {
            i3 += i2;
            d1 -= (((++Test0015.instanceCount) * (-(++Test0015.iArrFld[i2 + 1]))) - iMeth(0.63979, Test0015.dFld, -14));
            Test0015.instanceCount += i3;
            for (i16 = 6; i16 > 1; i16--) {
                i3 = (int) Test0015.instanceCount;
                i18 = 1;
                while (++i18 < 2) {
                    i3 += (i18 * i18);
                    Test0015.instanceCount >>= i17;
                    i3 >>>= i3;
                    Test0015.iArrFld[i18 + 1] -= i3;
                    fArr[i16] = Test0015.instanceCount;
                }
                l1 = 2;
                do {
                    s -= (short) i16;
                    f1 += l1;
                } while (--l1 > 0);
            }
        }
        vMeth_check_sum += (b ? 1 : 0) + s + i2 + i3 + Double.doubleToLongBits(d1) + i16 + i17 + i18 + l1 +
                Float.floatToIntBits(f1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void main(String[] strArr) {

        try {
            Test0015 _instance = new Test0015();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = 14, i1 = -10, i19 = -5, i20 = -7, i21 = 1, i22 = -2, i23 = -6, i24 = -6711, i25 = -8;
        double d = -1.3327;
        boolean b2 = true;
        float f2 = -1.445F;
        float[] fArr1 = new float[N];
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, 36042L);
        FuzzerUtils.init(fArr1, -45.76F);

        for (i = 16; 290 > i; ++i) {
            d = (lArr[i]++);
            vMeth(b2, (short) (-7770));
            for (i19 = 5; i19 < 92; i19++) {
                i20 *= (int) Test0015.instanceCount;
                i20 = i20;
                i20 += (i19 + i19);
                i1 = i20;
            }
            fFld += i;
            i20 = i20;
            for (i21 = 92; i21 > 1; i21 -= 2) {
                Test0015.instanceCount += (long) Test0015.dFld;
            }
            switch ((((i1 >>> 1) % 5) * 5) + 47) {
                case 62:
                    i20 += (i | i20);
                case 51:
                    for (f2 = i; f2 < 92; f2++) {
                        for (i24 = 1; i24 < 1; i24++) {
                            short s3 = 2267;
                            i20 = s3;
                            switch ((i24 % 7) + 1) {
                                case 1:
                                    Test0015.instanceCount &= i21;
                                    Test0015.iArrFld[i - 1] -= i24;
                                case 2:
                                    Test0015.instanceCount += (i24 * i24);
                                    break;
                                case 3:
                                    Test0015.byFld += (byte) (((i24 * Test0015.byFld) + i1) - i20);
                                case 4:
                                    i20 -= (int) fFld;
                                case 5:
                                    i22 <<= -19;
                                    Test0015.iArrFld[i + 1] = (int) f2;
                                    d *= i25;
                                    if (true) break;
                                    break;
                                case 6:
                                    i23 += (int) Test0015.dFld;
                                    i1 = (int) Test0015.instanceCount;
                                    d -= Test0015.instanceCount;
                                    break;
                                case 7:
                                    s3 += (short) Test0015.instanceCount;
                            }
                        }
                    }
                case 59:
                    fArr1 = fArr1;
                case 49:
                    fArr1[i - 1] -= Test0015.instanceCount;
                case 70:
                    i1 *= 13;
                    break;
                default:
                    Test0015.dFld += -4;
            }
        }

        FuzzerUtils.out.println("i i1 d = " + i + "," + i1 + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("b2 i19 i20 = " + (b2 ? 1 : 0) + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 f2 = " + i21 + "," + i22 + "," + Float.floatToIntBits(f2));
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("lArr fArr1 = " + FuzzerUtils.checkSum(lArr) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));

        FuzzerUtils.out.println("Test0015.instanceCount Test0015.byFld Test0015.dFld = " + Test0015.instanceCount + "," + Test0015.byFld +
                "," + Double.doubleToLongBits(Test0015.dFld));
        FuzzerUtils.out.println("fFld Test0015.iArrFld = " + Float.floatToIntBits(fFld) + "," +
                FuzzerUtils.checkSum(Test0015.iArrFld));

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