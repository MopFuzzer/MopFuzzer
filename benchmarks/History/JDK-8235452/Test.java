// Generated by Java* Fuzzer test generator (1.0.001). Wed Dec  4 23:01:43 2019
public class Test {

    public static final int N = 400;

    public static long instanceCount=-14L;
    public int iFld=220;
    public static long[] lArrFld =new long[N];
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 7L);
        FuzzerUtils.init(Test.iArrFld, 52973);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i4, long l2) {

        int i5=20246, i6=-12061, i7=-49325, i8=-43, i9=13;
        byte by=-58;
        double[] dArr =new double[N];

        FuzzerUtils.init(dArr, 2.26184);

        for (i5 = 1; i5 < 342; ++i5) {
            i7 = 1;
            do {
                i4 = i7;
                i4 = -6;
                for (i8 = 1; i8 < 1; ++i8) {
                    float f1=37.897F;
                    short s=-12476;
                    f1 += (((i8 * i7) + i5) - i4);
                    i9 = i4;
                    Test.iArrFld[i7 - 1] |= -23;
                    Test.instanceCount |= i7;
                    dArr[i8] = i4;
                    switch (((i7 >>> 1) % 6) + 66) {
                    case 66:
                        Test.iArrFld = Test.iArrFld;
                        by = (byte)s;
                        break;
                    case 67:
                        i9 = i7;
                        i9 += -240;
                    case 68:
                        i9 += (((i8 * i5) + l2) - i9);
                    case 69:
                        Test.iArrFld[i7 - 1] = s;
                        break;
                    case 70:
                        i9 += i8;
                        break;
                    case 71:
                        f1 = i4;
                    }
                }
            } while (++i7 < 5);
        }
        long meth_res = i4 + l2 + i5 + i6 + i7 + i8 + i9 + by + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i3, long l1) {

        float f2=83.785F;
        int i10=161, i11=8, i12=14, i13=222, i14=-5;
        byte by1=-101;

        Test.lArrFld[(i3 >>> 1) % N] *= (long)(lMeth(-164, Test.instanceCount) + f2);
        for (i10 = 5; i10 < 314; ++i10) {
            i12 = 1;
            while (++i12 < 5) {
                Test.instanceCount = i11;
                Test.iArrFld[i10 + 1] = i3;
                by1 += (byte)i11;
                i11 = -15746;
                for (i13 = 1; 1 > i13; ++i13) {
                    Test.lArrFld[i12 - 1] = i13;
                    Test.iArrFld[i10] += -98;
                    l1 *= Test.instanceCount;
                    i3 <<= 37938;
                    try {
                        i14 = (52099 / i11);
                        i11 = (i14 % Test.iArrFld[i10 + 1]);
                        i14 = (i11 % i10);
                    } catch (ArithmeticException a_e) {}
                    f2 += i13;
                    Test.instanceCount += (i13 ^ Test.instanceCount);
                }
            }
        }
        vMeth_check_sum += i3 + l1 + Float.floatToIntBits(f2) + i10 + i11 + i12 + by1 + i13 + i14;
    }

    public static int iMeth() {

        int i15=6, i16=-1, i17=167, i18=20206, i19=4, i20=-1;
        short s1=-2617;
        double d=2.111958;
        double[] dArr1 =new double[N];
        boolean b=false;

        FuzzerUtils.init(dArr1, -103.84180);

        vMeth(i15, Test.instanceCount);
        for (i16 = 163; i16 > 7; --i16) {
            dArr1[i16 + 1] += i17;
            i18 = 1;
            do {
                for (i19 = 1; 1 > i19; ++i19) {
                    i17 += i19;
                    i15 >>= i18;
                    i15 += s1;
                    d -= i16;
                    Test.iArrFld[i18] *= i15;
                    if (b) break;
                    i15 = i17;
                    i15 = i20;
                    i20 = i20;
                    Test.instanceCount -= -1;
                }
            } while (++i18 < 10);
        }
        long meth_res = i15 + i16 + i17 + i18 + i19 + i20 + s1 + Double.doubleToLongBits(d) + (b ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=12, i1=-38, i2=7, i21=14, i22=2707, i23=6190, i24=26, i25=18218;
        long l=-3L;
        float f=0.23F;
        byte by2=80;
        boolean b1=true;

        for (i = 16; i < 338; ++i) {
            for (l = 4; l < 78; ++l) {
                f -= (i - iMeth());
                i2 += i1;
                i1 &= i;
                f = f;
            }
            try {
                i2 = (i2 % Test.iArrFld[i]);
                Test.iArrFld[i - 1] = (-340997040 / i2);
                Test.iArrFld[i] = (Test.iArrFld[i] / i);
            } catch (ArithmeticException a_e) {}
            if (b1) {
                i21 = 78;
                do {
                    by2 = (byte)i1;
                    i22 = 1;
                    do {
                        short s2=15025;
                        i2 += (((i22 * l) + i2) - i1);
                        i2 ^= (int)l;
                        i2 *= (int)Test.instanceCount;
                        i2 = i22;
                        if (b1) break;
                        i1 = s2;
                    } while (++i22 < 1);
                    f += f;
                    i1 = (int)l;
                    i1 >>= -14;
                    Test.instanceCount += i2;
                } while (--i21 > 0);
                i1 += (-60592 + (i * i));
            }
            iFld %= (int)(i | 1);
            i23 = 78;
            while (--i23 > 0) {
                Test.iArrFld[i + 1] = -179;
                for (i24 = i23; i24 < 1; i24++) {
                    i2 = i2;
                    i2 = 7;
                    i25 = i21;
                    i25 -= i25;
                }
            }
        }

        FuzzerUtils.out.println("i i1 l = " + i + "," + i1 + "," + l);
        FuzzerUtils.out.println("i2 f i21 = " + i2 + "," + Float.floatToIntBits(f) + "," + i21);
        FuzzerUtils.out.println("by2 i22 b1 = " + by2 + "," + i22 + "," + (b1 ? 1 : 0));
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);

        FuzzerUtils.out.println("Test.instanceCount iFld Test.lArrFld = " + Test.instanceCount + "," + iFld + "," +
            FuzzerUtils.checkSum(Test.lArrFld));
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
