// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:51 2023
public class Test0837 {

    public static final int N = 400;

    public static long instanceCount=228L;
    public static double dFld=22.36831;
    public static boolean bFld=false;
    public static int[] iArrFld =new int[N];
    public static float[][] fArrFld =new float[N][N];

    static {
        FuzzerUtils.init(Test0837.iArrFld, -7);
        FuzzerUtils.init(Test0837.fArrFld, 57.326F);
    }

    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i9, long l) {

        short s=7942;

        s *= s;
        long meth_res = i9 + l + s;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static float fMeth(int i3, int i4, int i5) {

        int i6=-36033, i7=29985, i8=15111, i10=160, i11=61957, i12=18380, i13=-236, i14=-8;

        i6 = 1;
        while (++i6 < 148) {
            switch (((((int) (i4 - Test0837.instanceCount)) >>> 1) % 3) + 82) {
            case 82:
                i5 <<= (int) (i5 + ((Test0837.instanceCount - Test0837.instanceCount) - (-20564 * Test0837.iArrFld[i6])));
                for (i7 = 1; i7 < 11; ++i7) {
                    i5 -= (int) (-lMeth(7, Test0837.instanceCount));
                    i8 -= 1;
                }
                i8 >>= (int) Test0837.instanceCount;
                break;
            case 83:
                for (i10 = 1; i10 < 11; ++i10) {
                    i12 = 2;
                    while (--i12 > 0) {
                        i4 = i12;
                        i11 += i3;
                    }
                    Test0837.iArrFld = Test0837.iArrFld;
                    for (i13 = 1; i13 < 2; ++i13) {
                        i11 += i8;
                        i4 = (int)-4149503739911404663L;
                    }
                }
                break;
            case 84:
                Test0837.instanceCount *= -103;
                break;
            default:
                i11 -= (int) Test0837.instanceCount;
            }
        }
        long meth_res = i3 + i4 + i5 + i6 + i7 + i8 + i10 + i11 + i12 + i13 + i14;
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth(float f) {

        int i2=59459;
        int i15=0;
        int i16=20;
        int i17=-47;
        int i18=14;
        int i19=98;
        int[] iArr =new int[N];
        double[] dArr =new double[N];

        FuzzerUtils.init(iArr, -51);
        FuzzerUtils.init(dArr, 2.11307);

        iArr[(i2 >>> 1) % N] = (int)(fMeth(i2, i2, i2) + -30199L);
        i2 >>>= -26384;
        i15 = 1;
        while (++i15 < 147) {
            for (i16 = i15; i16 < 11; i16 += 3) {
                Test0837.dFld += i16;
                i17 ^= i2;
                if (Test0837.bFld) continue;
                for (i18 = 1; i18 < 1; i18++) {
                    Test0837.instanceCount += i18;
                    if (false) break;
                    dArr[(-60128 >>> 1) % N] *= -30943L;
                    Test0837.fArrFld[i15][i16] += f;
                    i17 += (8 + (i18 * i18));
                    i19 += i18;
                }
                i19 = i2;
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f) + i2 + i15 + i16 + i17 + i18 + i19 + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        int i=-159, i1=-12, i20=-25816, i21=-1, i22=-49623, i23=-8, i24=60, i25=-6, i26=45317, i27=-49;
        float f1=0.667F, f2=-40.975F;
        byte by=42;
        double d=31.32774;

        for (i = 18; i < 313; ++i) {
            vMeth(f1);
            Test0837.instanceCount += i1;
            switch ((i % 2) + 59) {
            case 59:
                i1 |= i;
                break;
            case 60:
                by >>= (byte)1817386526318800768L;
                break;
            default:
                if (Test0837.bFld) {
                    for (f2 = 4; f2 < 85; ++f2) {
                        Test0837.iArrFld = FuzzerUtils.int1array(N, (int) 9);
                        for (i21 = 1; 2 > i21; i21++) {
                            Test0837.fArrFld[(int) (f2 + 1)][i - 1] = i22;
                            if (Test0837.bFld) continue;
                            Test0837.instanceCount = i21;
                            Test0837.dFld *= by;
                            i22 += (i21 * i21);
                        }
                        for (d = 1; d < 2; ++d) {
                            i20 -= (int) Test0837.instanceCount;
                            Test0837.instanceCount += i20;
                        }
                        i20 = by;
                        f1 += i23;
                        i1 -= i22;
                        Test0837.iArrFld[(int) (f2 - 1)] *= i;
                        i1 -= i23;
                    }
                }
                i23 *= (int)89.22273;
                for (i24 = 2; i24 < 85; i24++) {
                    Test0837.instanceCount += (i24 * i24);
                    Test0837.iArrFld[i - 1] += i22;
                    for (i26 = i24; i26 < 2; ++i26) {
                        i23 *= i24;
                        Test0837.dFld *= i21;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 f1 = " + i + "," + i1 + "," + Float.floatToIntBits(f1));
        FuzzerUtils.out.println("by f2 i20 = " + by + "," + Float.floatToIntBits(f2) + "," + i20);
        FuzzerUtils.out.println("i21 i22 d = " + i21 + "," + i22 + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 i27 = " + i26 + "," + i27);

        FuzzerUtils.out.println("Test0837.instanceCount Test0837.dFld Test0837.bFld = " + Test0837.instanceCount + "," +
                Double.doubleToLongBits(Test0837.dFld) + "," + (Test0837.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0837.iArrFld Test0837.fArrFld = " + FuzzerUtils.checkSum(Test0837.iArrFld) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0837.fArrFld)));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0837 _instance = new Test0837();
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
//DEBUG  fMeth ->  fMeth vMeth mainTest
//DEBUG  lMeth ->  lMeth fMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
