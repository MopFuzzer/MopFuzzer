// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:32 2023
public class Test0443 {

    public static final int N = 400;

    public static long instanceCount=-35L;
    public short sFld=14473;

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l, int i7) {

        int i8=-114;
        int i9=-6;
        int i10=-36821;
        int i11=20308;
        int i12=-43456;
        int[] iArr1 =new int[N];
        boolean b=true;
        short s=-22258;
        short[] sArr =new short[N];
        long l1=-1L;
        double d2=-1.34435;
        float f=20.979F;
        float[] fArr =new float[N];

        FuzzerUtils.init(iArr1, -254);
        FuzzerUtils.init(sArr, (short)-1947);
        FuzzerUtils.init(fArr, 0.91F);

        for (i8 = 1; i8 < 161; i8++) {
            i7 = i9;
            Test0443.instanceCount += i8;
            if (b) break;
        }
        iArr1[(i8 >>> 1) % N] %= (int)(i9 | 1);
        Test0443.instanceCount -= l;
        for (i10 = 12; i10 < 239; i10 += 2) {
            s = (short)l1;
            sArr[i10] &= (short)i7;
            i12 = 1;
            while (++i12 < 14) {
                d2 = 1;
                do {
                    if (b) continue;
                    fArr[i12] += i7;
                    i11 = (int)f;
                    i11 *= i8;
                } while (++d2 < 1);
            }
        }
        vMeth1_check_sum += l + i7 + i8 + i9 + (b ? 1 : 0) + i10 + i11 + s + l1 + i12 + Double.doubleToLongBits(d2) +
            Float.floatToIntBits(f) + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(sArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static int iMeth(int i3, int i4, int i5) {

        int i6=5, i13=-4, i14=5, i15=-29988, i16=214, i17=11157;
        byte by=51;
        double d3=-2.56404;
        float f1=104.268F;
        float[][] fArr1 =new float[N][N];
        boolean b1=false;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, 1876716861737613027L);
        FuzzerUtils.init(fArr1, -27.169F);

        i6 = 1;
        while (++i6 < 368) {
            vMeth1(Test0443.instanceCount, -150);
            by -= (byte)i3;
            if (true) continue;
            i4 = (int)d3;
            if (b1) {
                Test0443.instanceCount = i13;
                lArr[i6] -= i13;
                f1 += i6;
            }
            for (i14 = 1; 5 > i14; ++i14) {
                i5 = i6;
                if (b1) {
                    for (i16 = 1; i16 < 2; i16++) {
                        i15 /= (int)(i13 | 1);
                        i4 += (int) Test0443.instanceCount;
                    }
                } else if (true) {
                    i5 -= (int) Test0443.instanceCount;
                } else if (b1) {
                    fArr1[i6] = fArr1[i14 - 1];
                } else {
                    if (i14 != 0) {
                    }
                }
            }
        }
        long meth_res = i3 + i4 + i5 + i6 + by + Double.doubleToLongBits(d3) + i13 + Float.floatToIntBits(f1) + (b1 ? 1
            : 0) + i14 + i15 + i16 + i17 + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i=106;
        int i1=-178;
        int i2=-4;
        int i18=14;
        int i19=-6;
        int i20=13;
        int[] iArr =new int[N];
        double d1=2.39226;
        short s1=-11818;

        FuzzerUtils.init(iArr, 397);

        for (i = 15; i < 286; ++i) {
            for (d1 = 1; d1 < 6; ++d1) {
                iArr[i + 1] += (i1 * 22277);
                i2 += (iMeth(i, i2, 29542) * i1);
                i18 = 1;
                do {
                    i2 += i18;
                    Test0443.instanceCount += (i18 * i18);
                } while (++i18 < 2);
                i2 = (int) Test0443.instanceCount;
                i1 = i1;
                i1 = (int) Test0443.instanceCount;
                for (i19 = 1; i19 < 2; ++i19) {
                    i1 = (int) Test0443.instanceCount;
                    i2 >>= (int) Test0443.instanceCount;
                    i1 = s1;
                    i2 *= i20;
                }
            }
        }
        vMeth_check_sum += i + i1 + Double.doubleToLongBits(d1) + i2 + i18 + i19 + i20 + s1 +
            FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        double d=-5.79514;
        float f2=-1.122F;
        float[][] fArr2 =new float[N][N];
        int i21=7;
        int i22=25;
        int i23=-11;
        int i24=137;
        int i25=95;
        int i26=-13282;
        int i27=-8;
        int i28=11;
        int i29=-155;
        int i30=27;
        int[] iArr2 =new int[N];
        boolean b2=true;
        long[][] lArr1 =new long[N][N];

        FuzzerUtils.init(iArr2, 189);
        FuzzerUtils.init(lArr1, -837327409L);
        FuzzerUtils.init(fArr2, -74.47F);

        d = -2.127133;
        vMeth();
        f2 = i21;
        sFld += (short)i21;
        for (i22 = 5; i22 < 140; ++i22) {
            iArr2[i22 + 1] = -13;
            d -= -23835;
            i23 += i22;
            i21 *= i22;
        }
        d = i24;
        Test0443.instanceCount <<= Test0443.instanceCount;
        for (i25 = 12; i25 < 220; ++i25) {
            lArr1[i25] = lArr1[i25 - 1];
            i21 = (int) Test0443.instanceCount;
            lArr1[i25 - 1][i25 - 1] = Test0443.instanceCount;
            Test0443.instanceCount = 160;
            iArr2[i25 - 1] <<= i25;
            i26 += i25;
            i23 >>= i22;
            i23 += (int)1.296F;
            if (b2) {
                i21 += i23;
                iArr2[i25 - 1] = (int) Test0443.instanceCount;
            } else if (true) {
                for (i27 = i25; i27 < 121; ++i27) {
                    for (i29 = 1; 1 > i29; ++i29) {
                        byte by1=62;
                        if (b2) continue;
                        by1 *= (byte)i23;
                        if (b2) {
                            i30 += (i29 * i26);
                            i24 = i28;
                        } else if (b2) {
                            fArr2[i25 - 1][i27 - 1] = i26;
                        }
                    }
                }
            } else if (b2) {
                fArr2[i25 + 1][i25] = i29;
            }
        }

        FuzzerUtils.out.println("d f2 i21 = " + Double.doubleToLongBits(d) + "," + Float.floatToIntBits(f2) + "," +
            i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("i28 i29 i30 = " + i28 + "," + i29 + "," + i30);
        FuzzerUtils.out.println("b2 iArr2 lArr1 = " + (b2 ? 1 : 0) + "," + FuzzerUtils.checkSum(iArr2) + "," +
            FuzzerUtils.checkSum(lArr1));
        FuzzerUtils.out.println("fArr2 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr2)));

        FuzzerUtils.out.println("Test0443.instanceCount sFld = " + Test0443.instanceCount + "," + sFld);

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0443 _instance = new Test0443();
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}