// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:20 2023
public class Test0190 {

    public static final int N = 400;

    public static long instanceCount=-16L;
    public static float fFld=31.394F;
    public static double dFld=-108.4324;
    public long[][] lArrFld =new long[N][N];
    public static int[][] iArrFld =new int[N][N];

    static {
        FuzzerUtils.init(Test0190.iArrFld, 144);
    }

    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i6) {

        int i7=-61470, i8=-5, i9=-49370;
        byte by1=-108;
        long l=-890823134710788300L;
        boolean b=true;

        i6 += (int) Test0190.fFld;
        Test0190.fFld -= i6;
        for (i7 = 2; i7 < 133; ++i7) {
            i9 = 1;
            do {
                Test0190.fFld = by1;
            } while (++i9 < 12);
            Test0190.fFld -= Test0190.instanceCount;
            try {
                i8 = (i8 % 48743);
                i8 = (251 % i9);
                i8 = (i6 % i7);
            } catch (ArithmeticException a_e) {}
            i6 += (int) Test0190.instanceCount;
            switch (((i7 % 1) * 5) + 107) {
            case 112:
                Test0190.instanceCount = 7;
                Test0190.instanceCount -= i8;
                Test0190.fFld = i7;
                break;
            default:
                if (b) {
                    try {
                        i6 = (i9 / 1886);
                        Test0190.iArrFld[i7][i7] = (i9 % -18902);
                        i8 = (-65092 / i8);
                    } catch (ArithmeticException a_e) {}
                    i8 += (int)l;
                } else {
                    i8 += i7;
                }
            }
        }
        long meth_res = i6 + i7 + i8 + i9 + by1 + l + (b ? 1 : 0);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i10=0, i11=3491, i12=13261, i13=5192, i14=-6;
        double d1=85.83132;
        long l1=-10L;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -5L);

        if (false) {
            iMeth(i10);
            for (i11 = 6; i11 < 354; ++i11) {
                Test0190.instanceCount = i11;
                i12 -= i10;
                d1 *= i12;
                Test0190.instanceCount ^= Test0190.instanceCount;
                for (i13 = 1; i13 < 5; i13++) {
                    switch (((i11 % 6) * 5) + 72) {
                    case 100:
                        i10 <<= i12;
                        i12 = i12;
                        i14 += i10;
                        break;
                    case 95:
                        l1 += (i13 * i13);
                        if (i12 != 0) {
                            vMeth_check_sum += i10 + i11 + i12 + Double.doubleToLongBits(d1) + i13 + i14 + l1 +
                                FuzzerUtils.checkSum(lArr);
                            return;
                        }
                        Test0190.iArrFld[i13][i13 - 1] *= i12;
                        break;
                    case 77:
                        lArr[i11 - 1] |= i13;
                        break;
                    case 73:
                        l1 += (i13 ^ i10);
                        break;
                    case 80:
                        i10 -= i10;
                    case 92:
                        i12 += (-144 + (i13 * i13));
                        break;
                    }
                }
            }
        }
        vMeth_check_sum += i10 + i11 + i12 + Double.doubleToLongBits(d1) + i13 + i14 + l1 + FuzzerUtils.checkSum(lArr);
    }

    public static float fMeth(int i3) {

        int i4=10, i5=16604, i15=3335, i16=230, i17=1, i18=-35;
        float f1=-91.601F;
        short s=9247;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(lArr1, -19766L);

        for (i4 = 15; i4 < 304; i4++) {
            Test0190.instanceCount += (((i4 * i4) + i5) - i5);
            Test0190.iArrFld[i4 - 1][i4 + 1] ^= (int) (((++Test0190.iArrFld[i4 + 1][i4 + 1]) + (i4 * f1)) + i5);
            vMeth();
            i5 += -50673;
            i5 >>= s;
            for (i15 = 1; i15 < 6; ++i15) {
                lArr1[i15 + 1] = (long) Test0190.fFld;
                for (i17 = 1; i17 < 2; i17++) {
                    i18 += (((i17 * i4) + i5) - i4);
                    Test0190.instanceCount = 19529;
                    Test0190.dFld = i18;
                }
                i5 += i15;
                i18 = (int)16.297F;
                Test0190.instanceCount = i18;
            }
        }
        long meth_res = i3 + i4 + i5 + Float.floatToIntBits(f1) + s + i15 + i16 + i17 + i18 +
            FuzzerUtils.checkSum(lArr1);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d=63.67111;
        int i=-1, i1=-63403, i2=-7, i19=53322, i20=17329, i21=3;
        float f=0.400F;
        byte by=-89;
        boolean b1=false;

        d = 1;
        while (++d < 297) {
            for (i = 5; i < 85; ++i) {
                f -= i1;
                by = (byte)(i1 - Math.max((int)(d + f), Math.min(i, i)));
                i1 -= (int)-2.98453;
                Test0190.instanceCount += (((i * i1) + Test0190.instanceCount) - f);
                i2 = 1;
                while (++i2 < 2) {
                    i1 *= i;
                    i1 = (int) Test0190.instanceCount;
                    i1 = (int)((--lArrFld[i + 1][i2]) * fMeth(i2));
                    i1 -= i;
                    Test0190.instanceCount <<= -3L;
                    f += Test0190.instanceCount;
                    i1 -= (int)-38620L;
                    if (false) break;
                    Test0190.instanceCount &= Test0190.instanceCount;
                }
                i19 = 2;
                do {
                    i1 += i2;
                    Test0190.instanceCount += 26;
                } while (--i19 > 0);
                i1 += i;
            }
            switch ((int)((d % 2) + 22)) {
            case 22:
                i1 -= i2;
                i20 = 1;
                while (++i20 < 85) {
                    Test0190.instanceCount = i19;
                }
                Test0190.instanceCount = i20;
                i21 = 1;
                do {
                    i1 += i21;
                    i1 += (i21 | Test0190.instanceCount);
                    Test0190.instanceCount = 12;
                    Test0190.iArrFld[i21 - 1][i21] = i2;
                } while (++i21 < 85);
                break;
            case 23:
                b1 = b1;
                break;
            }
        }

        FuzzerUtils.out.println("d i i1 = " + Double.doubleToLongBits(d) + "," + i + "," + i1);
        FuzzerUtils.out.println("f by i2 = " + Float.floatToIntBits(f) + "," + by + "," + i2);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("b1 = " + (b1 ? 1 : 0));

        FuzzerUtils.out.println("Test0190.instanceCount Test0190.fFld Test0190.dFld = " + Test0190.instanceCount + "," +
                Float.floatToIntBits(Test0190.fFld) + "," + Double.doubleToLongBits(Test0190.dFld));
        FuzzerUtils.out.println("lArrFld Test0190.iArrFld = " + FuzzerUtils.checkSum(lArrFld) + "," +
                FuzzerUtils.checkSum(Test0190.iArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0190 _instance = new Test0190();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}