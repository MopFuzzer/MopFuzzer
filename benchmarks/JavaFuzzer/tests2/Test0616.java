// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:41 2023
public class Test0616 {

    public static final int N = 400;

    public static long instanceCount=-3033381664L;
    public static double dFld=1.105390;
    public static short sFld=5155;
    public byte byFld=-36;
    public volatile int iFld=50255;
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0616.iArrFld, 13);
    }

    public static long vMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l, float f, int i5) {

        int i6=-6;
        int i7=-28562;
        int i8=-57115;
        int i9=7;
        int i10=5;
        int i11=-73;
        int[] iArr1 =new int[N];
        byte by=11;
        boolean b=true;
        double[] dArr =new double[N];

        FuzzerUtils.init(iArr1, -4);
        FuzzerUtils.init(dArr, -2.94991);

        for (i6 = 1; 326 > i6; ++i6) {
            for (i8 = i6; i8 < 5; i8++) {
                iArr1[i6 + 1] = i9;
                by = (byte)l;
                if (b) {
                    i9 += (((i8 * i8) + i9) - f);
                } else if (b) {
                    for (i10 = 1; 1 > i10; ++i10) {
                        dArr = dArr;
                        i5 |= i10;
                        f -= i10;
                        iArr1[i8 - 1] -= i9;
                        f = i10;
                        b = b;
                        f += (((i10 * Test0616.instanceCount) + i5) - by);
                    }
                    i7 = i6;
                } else if (false) {
                    Test0616.dFld = i11;
                }
            }
        }
        vMeth1_check_sum += l + Float.floatToIntBits(f) + i5 + i6 + i7 + i8 + i9 + by + i10 + i11 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static short sMeth(int i2, int i3) {

        int i4=-19, i12=-23162, i13=80, i14=-17;
        float f1=-14.838F;
        boolean b1=true;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, 1695962246L);

        i4 *= (++i2);
        vMeth1(-187L, f1, 4);
        i12 = 1;
        do {
            Test0616.dFld += Test0616.dFld;
            if (i2 != 0) {
            }
            if (b1) {
                for (i13 = i12; i13 < 10; i13++) {
                    byte by1=-45;
                    i4 += Test0616.sFld;
                    lArr[i13] /= (Test0616.sFld | 1);
                    by1 = (byte)i3;
                    i2 |= i12;
                }
            } else if (b1) {
                if (true) continue;
            } else if (false) {
                i14 = i14;
            }
            Test0616.dFld *= i13;
            Test0616.iArrFld[i12 + 1] >>>= Test0616.sFld;
        } while (++i12 < 155);
        long meth_res = i2 + i3 + i4 + Float.floatToIntBits(f1) + i12 + i13 + i14 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(lArr);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static void vMeth(double d) {

        int i=-29919;
        int i1=-46225;
        int i15=2;
        int i16=-187;
        int i17=-58481;
        int i18=-11;
        int[] iArr =new int[N];
        float f2=102.517F;
        short[][] sArr =new short[N][N];

        FuzzerUtils.init(iArr, 70);
        FuzzerUtils.init(sArr, (short)-10001);

        for (i = 3; i < 141; i++) {
            iArr[i - 1] >>>= (int) Test0616.instanceCount;
            i1 -= sMeth(i, i1);
            i1 += (i * i);
            i1 += (-26 + (i * i));
            iArr = Test0616.iArrFld;
            Test0616.sFld = (short) Test0616.instanceCount;
            i1 >>>= i;
            Test0616.instanceCount += i1;
            for (i15 = 1; i15 < 11; i15++) {
                for (i17 = 1; 2 > i17; ++i17) {
                    i18 += (((i17 * f2) + f2) - f2);
                    i1 += i1;
                    Test0616.iArrFld[i15 - 1] += i15;
                    sArr[i17 - 1][i17 - 1] *= (short)d;
                }
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + i + i1 + i15 + i16 + i17 + i18 + Float.floatToIntBits(f2) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(sArr);
    }

    public void mainTest(String[] strArr1) {

        int i19=-59402, i20=-19170, i21=-51, i22=-9, i23=-43389, i24=-3, i25=-74, i26=6, i27=-2, i28=-15257, i29=-32,
            i30=10;
        boolean b2=false;
        float f3=6.260F;
        double d1=80.11387;
        double[] dArr1 =new double[N];
        long[] lArr1 =new long[N];

        FuzzerUtils.init(dArr1, 47.78234);
        FuzzerUtils.init(lArr1, -54827L);

        vMeth(Test0616.dFld);
        for (i19 = 6; i19 < 165; i19++) {
            i20 = (int) Test0616.instanceCount;
            i21 = 1;
            while (++i21 < 158) {
                for (i22 = 1; i22 < 1; ++i22) {
                    Test0616.iArrFld[i21] += i23;
                }
                if (b2) break;
                for (i24 = 1; i24 < 1; ++i24) {
                    Test0616.iArrFld[i24 - 1] += (int) Test0616.instanceCount;
                }
                try {
                    i25 = (Test0616.iArrFld[i19 + 1] % 88);
                    Test0616.iArrFld[i19] = (Test0616.iArrFld[i21 + 1] / Test0616.iArrFld[i19 + 1]);
                    i25 = (i24 % i23);
                } catch (ArithmeticException a_e) {}
            }
            Test0616.dFld -= i20;
        }
        for (i26 = 22; i26 < 387; ++i26) {
            i20 |= i20;
            for (i28 = 1; i28 < 69; ++i28) {
                f3 *= Test0616.instanceCount;
                for (d1 = 2; d1 > 1; d1--) {
                    byFld *= (byte)i19;
                    Test0616.sFld *= (short) i21;
                    dArr1[i26] *= Test0616.instanceCount;
                    byFld = (byte)iFld;
                    Test0616.instanceCount = i28;
                    i23 += (int)((long)d1 ^ i26);
                    dArr1[i28 - 1] *= i30;
                    iFld += (int)(d1 * d1);
                    f3 -= -65;
                    i27 = 12912;
                }
                i23 -= i30;
            }
        }
        f3 = (float)d1;
        i29 += (int) Test0616.instanceCount;
        f3 -= i29;

        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 b2 = " + i22 + "," + i23 + "," + (b2 ? 1 : 0));
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 i28 i29 = " + i27 + "," + i28 + "," + i29);
        FuzzerUtils.out.println("f3 d1 i30 = " + Float.floatToIntBits(f3) + "," + Double.doubleToLongBits(d1) + "," +
            i30);
        FuzzerUtils.out.println("dArr1 lArr1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)) + "," +
            FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test0616.instanceCount Test0616.dFld Test0616.sFld = " + Test0616.instanceCount + "," +
                Double.doubleToLongBits(Test0616.dFld) + "," + Test0616.sFld);
        FuzzerUtils.out.println("byFld iFld Test0616.iArrFld = " + byFld + "," + iFld + "," +
                FuzzerUtils.checkSum(Test0616.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0616 _instance = new Test0616();
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  sMeth ->  sMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 sMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
