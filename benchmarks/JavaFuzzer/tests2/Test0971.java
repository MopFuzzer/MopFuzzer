// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:58 2023
public class Test0971 {

    public static final int N = 400;

    public static long instanceCount=-219L;
    public static float fFld=36.968F;
    public static double dFld=69.36844;
    public static short sFld=9963;
    public static boolean bFld=false;

    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i7) {

        int i8=-58;
        int i9=-165;
        int i10=-11;
        int i11=-9873;
        int[] iArr =new int[N];
        float f=0.612F;
        long l=-183L;
        long[] lArr =new long[N];
        double d1=0.52446;

        FuzzerUtils.init(lArr, -33001L);
        FuzzerUtils.init(iArr, 10759);

        i8 = 160;
        do {
            i7 += (i8 * i8);
            f = i8;
            for (l = 1; l < 10; l++) {
                i7 >>= i7;
                Test0971.instanceCount = l;
                lArr[(int)(l)] += (long)f;
                for (i10 = 1; i10 < 2; ++i10) {
                    long l1=-236L;
                    i7 = i11;
                    i11 <<= i11;
                    i11 ^= i10;
                    iArr[i10] = i7;
                    d1 -= 11;
                    i7 <<= (int)l1;
                }
                i11 = 28850;
            }
        } while (--i8 > 0);
        vMeth_check_sum += i7 + i8 + Float.floatToIntBits(f) + l + i9 + i10 + i11 + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
    }

    public static long lMeth(int i3, int i4) {

        int i5=117;
        int i6=-21160;
        int i12=64207;
        int i13=120;
        int i14=148;
        int i15=7;
        int[] iArr1 =new int[N];
        float f1=-1.775F;
        double d2=108.27395, d3=-51.1656;
        long l2=55334L;
        byte by=53;

        FuzzerUtils.init(iArr1, -10);

        for (i5 = 14; 389 > i5; ++i5) {
            vMeth(i5);
            i4 *= i5;
            iArr1[i5 - 1] = (int) Test0971.instanceCount;
            i6 += i5;
            iArr1 = iArr1;
            for (f1 = 1; 5 > f1; ++f1) {
                i12 += (int)d2;
                for (d3 = 1; d3 < 2; ++d3) {
                    i3 += (int)l2;
                    Test0971.fFld += by;
                    iArr1[(int)(f1 + 1)] >>>= (int)l2;
                }
                for (i14 = (int)(f1); i14 < 2; ++i14) {
                    Test0971.fFld += i12;
                }
                i6 = i13;
            }
        }
        long meth_res = i3 + i4 + i5 + i6 + Float.floatToIntBits(f1) + i12 + Double.doubleToLongBits(d2) +
            Double.doubleToLongBits(d3) + i13 + l2 + by + i14 + i15 + FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth(double d, int i2) {

        int i16=-50, i17=-6, i18=4347, i19=-97, i20=247, i21=-9646;
        byte by1=5;
        long[][] lArr1 =new long[N][N];

        FuzzerUtils.init(lArr1, -9574L);

        lMeth(i2, -9);
        Test0971.instanceCount *= Test0971.instanceCount;
        Test0971.fFld += Test0971.instanceCount;
        i2 >>= 11;
        for (i16 = 7; i16 < 309; ++i16) {
            i2 >>= -84;
            i2 = (int) Test0971.instanceCount;
            lArr1[(-2 >>> 1) % N] = lArr1[(i17 >>> 1) % N];
        }
        for (i18 = 11; i18 < 351; ++i18) {
            for (i20 = 5; i20 > 1; --i20) {
                i17 = (int) Test0971.instanceCount;
                i17 += (i20 + i18);
                Test0971.instanceCount *= (long) d;
                i21 <<= i20;
                by1 += (byte)(i20 + i2);
            }
        }
        long meth_res = Double.doubleToLongBits(d) + i2 + i16 + i17 + i18 + i19 + i20 + i21 + by1 +
            FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=62870;
        int i1=51;
        int i22=0;
        int i23=0;
        int i24=25330;
        int i25=-27;
        int[] iArr2 =new int[N];
        byte by2=-92;
        float[] fArr =new float[N];

        FuzzerUtils.init(fArr, -59.349F);
        FuzzerUtils.init(iArr2, 226);

        if (Test0971.bFld) {
            for (i = 11; i < 216; ++i) {
                switch ((i % 4) + 99) {
                case 99:
                    Test0971.instanceCount += iMeth(Test0971.dFld, i);
                    break;
                case 100:
                    fArr = FuzzerUtils.float1array(N, (float)0.959F);
                    Test0971.instanceCount += i;
                    i22 = 1;
                    do {
                        for (i23 = 1; 1 > i23; ++i23) {
                            iArr2[i] *= i22;
                            i24 >>>= (int) Test0971.instanceCount;
                            Test0971.instanceCount += (((i23 * Test0971.instanceCount) + Test0971.fFld) - i22);
                            if (false) {
                                Test0971.sFld <<= by2;
                            } else if (Test0971.bFld) {
                                iArr2[i23 + 1] = (int) Test0971.dFld;
                                Test0971.dFld -= i1;
                                Test0971.instanceCount = i;
                                i1 *= (int)-120.98F;
                            } else if (Test0971.bFld) {
                                i1 += (-9 + (i23 * i23));
                                Test0971.instanceCount &= i1;
                                iArr2[i] <<= i24;
                            }
                            if (Test0971.bFld) {
                                i1 ^= i24;
                                i24 += (int)(-7L + (i23 * i23));
                                i1 -= i22;
                            } else {
                                Test0971.dFld += i22;
                            }
                        }
                        switch ((i22 % 2) + 57) {
                        case 57:
                            i25 = 1;
                            do {
                                i24 ^= i;
                            } while (++i25 < 1);
                            Test0971.instanceCount *= Test0971.instanceCount;
                            break;
                        case 58:
                            Test0971.sFld += (short) (142 + (i22 * i22));
                            break;
                        }
                    } while (++i22 < 122);
                    break;
                case 101:
                    i1 /= (int)(i24 | 1);
                    break;
                case 102:
                    Test0971.sFld = (short) i23;
                    break;
                }
            }
        } else if (true) {
            iArr2[(i22 >>> 1) % N] -= Test0971.sFld;
        } else {
            i24 -= i23;
        }

        FuzzerUtils.out.println("i i1 i22 = " + i + "," + i1 + "," + i22);
        FuzzerUtils.out.println("i23 i24 by2 = " + i23 + "," + i24 + "," + by2);
        FuzzerUtils.out.println("i25 fArr iArr2 = " + i25 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            "," + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test0971.instanceCount Test0971.fFld Test0971.dFld = " + Test0971.instanceCount + "," +
                Float.floatToIntBits(Test0971.fFld) + "," + Double.doubleToLongBits(Test0971.dFld));
        FuzzerUtils.out.println("Test0971.sFld Test0971.bFld = " + Test0971.sFld + "," + (Test0971.bFld ? 1 : 0));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0971 _instance = new Test0971();
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
//DEBUG  lMeth ->  lMeth iMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}