// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:33 2023
public class Test0459 {

    public static final int N = 400;

    public static long instanceCount=-121L;
    public static byte byFld=-51;
    public static volatile double dFld=0.71599;
    public static volatile int[] iArrFld =new int[N];
    public static long[] lArrFld =new long[N];
    public float[] fArrFld =new float[N];

    static {
        FuzzerUtils.init(Test0459.iArrFld, 1);
        FuzzerUtils.init(Test0459.lArrFld, -33646L);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(boolean b) {

        double d=-15.117358;
        int i4=-9;
        int i5=2;
        int i6=-40911;
        int i7=-183;
        int[] iArr1 =new int[N];
        float f1=1.972F;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(iArr1, -60578);
        FuzzerUtils.init(lArr1, 3786062626L);

        for (d = 10; d < 348; ++d) {
            for (f1 = 1; f1 < 5; f1 += 3) {
                iArr1[(int)(f1 - 1)] <<= i4;
                lArr1 = lArr1;
                for (i6 = 1; i6 < 5; i6++) {
                    switch ((int)(((d % 5) * 5) + 84)) {
                    case 102:
                        if (b) {
                            i7 += i7;
                            if (b) continue;
                            iArr1[i6] += 21;
                            iArr1[i6 - 1] -= i6;
                        } else if (true) {
                            Test0459.instanceCount += (i6 + i5);
                            Test0459.byFld -= (byte) i4;
                            i5 = i7;
                        }
                        break;
                    case 93:
                        i4 = i6;
                        break;
                    case 103:
                        i4 %= (int)(i6 | 1);
                        break;
                    case 86:
                        i7 += (i6 * i6);
                        break;
                    case 94:
                        iArr1 = FuzzerUtils.int1array(N, (int)-7);
                        break;
                    }
                }
            }
        }
        vMeth1_check_sum += (b ? 1 : 0) + Double.doubleToLongBits(d) + i4 + Float.floatToIntBits(f1) + i5 + i6 + i7 +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr1);
    }

    public static int iMeth(long l1, long l2, int i2) {

        int i3=13, i8=28, i9=43995, i10=207, i11=-10, i12=30, i13=-3;
        boolean b1=false;

        i3 = 1;
        while (++i3 < 178) {
            vMeth1(b1);
            i2 -= (int) Test0459.instanceCount;
            i2 += (int)(-2.995F + (i3 * i3));
            i2 += i3;
        }
        for (i8 = 12; 398 > i8; i8 += 3) {
            for (i10 = 1; i10 < 12; ++i10) {
                i11 = -41388;
                for (i12 = 1; i12 < 2; i12++) {
                    i11 >>= i9;
                    i9 -= (int)l2;
                    i11 -= i12;
                    Test0459.instanceCount += l2;
                    Test0459.iArrFld[i10 - 1] >>>= i13;
                }
                i9 = (int)l2;
            }
        }
        long meth_res = l1 + l2 + i2 + i3 + (b1 ? 1 : 0) + i8 + i9 + i10 + i11 + i12 + i13;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i, long l) {

        float f=2.740F, f2=97.953F;
        int i1=31264;
        int i14=-14945;
        int i15=-13;
        int i16=-1;
        int i17=24;
        int[] iArr =new int[N];
        double d1=-94.68813, d2=-1.78119;
        short s=13951;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, 0L);
        FuzzerUtils.init(iArr, -5311);

        lArr[(i >>> 1) % N] = (long)(0.86934 - (i = (-(-i))));
        for (f = 9; f < 292; f++) {
            iArr[(int) (f + 1)] = (-(iMeth(Test0459.instanceCount, l, i) / (i | 1)));
            i += (int)f;
        }
        for (i14 = 10; i14 < 334; i14++) {
            i15 += (i14 + i);
            f2 += i14;
        }
        switch ((((i >>> 1) % 9) * 5) + 51) {
        case 56:
            l = i1;
            i = i;
            d1 = 1;
            while (++d1 < 322) {
                for (i16 = 1; 5 > i16; ++i16) {
                    i1 += (((i16 * i) + i15) - i14);
                    l += (i16 * i16);
                    iArr[(int)(d1 - 1)] -= s;
                }
            }
            break;
        case 81:
            iArr[(i >>> 1) % N] *= i14;
        case 79:
            i15 = i14;
            break;
        case 68:
            s -= (short)f2;
            break;
        case 59:
            d2 -= d2;
        case 61:
            i17 *= i15;
        case 78:
            s = (short)i17;
        case 77:
            Test0459.iArrFld[(i17 >>> 1) % N] -= 0;
            break;
        case 53:
            Test0459.instanceCount -= i14;
            break;
        default:
            i17 = i1;
        }
        vMeth_check_sum += i + l + Float.floatToIntBits(f) + i1 + i14 + i15 + Float.floatToIntBits(f2) +
            Double.doubleToLongBits(d1) + i16 + i17 + s + Double.doubleToLongBits(d2) + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i18=0, i19=21, i20=14, i21=-32807, i22=-210, i23=5, i24=53, i25=1, i26=-10, i27=14208, i28=161, i29=-7,
            i30=-9;
        short s1=22617;
        float f3=0.687F;
        boolean b2=true;
        double[] dArr =new double[N];

        FuzzerUtils.init(dArr, -2.123522);

        vMeth(i18, 104L);
        for (i19 = 1; i19 < 235; i19++) {
            dArr[i19 + 1] -= i19;
        }
        i18 = (int) Test0459.instanceCount;
        for (i21 = 5; 279 > i21; ++i21) {
            i20 *= i22;
            Test0459.iArrFld[i21 + 1] -= s1;
            i18 *= (int)f3;
            Test0459.lArrFld[i21] >>= i21;
        }
        i22 &= i18;
        i20 += (int) Test0459.dFld;
        for (i23 = 335; i23 > 2; i23 -= 3) {
            i25 = 1;
            while (++i25 < 226) {
                Test0459.byFld -= (byte) 199;
                switch ((i25 % 9) + 31) {
                case 31:
                    for (i26 = 1; i26 < 1; ++i26) {
                        if (b2) break;
                        Test0459.instanceCount -= s1;
                        Test0459.iArrFld[i23] *= 0;
                        fArrFld[i26] *= (float) Test0459.dFld;
                        f3 += i26;
                    }
                    Test0459.iArrFld[i23] = i27;
                    for (i28 = 1; i28 > i23; --i28) {
                        i18 = i24;
                    }
                    i27 *= i24;
                    break;
                case 32:
                    Test0459.instanceCount = Test0459.byFld;
                    Test0459.byFld += (byte) i24;
                    break;
                case 33:
                    f3 -= Test0459.instanceCount;
                case 34:
                    Test0459.instanceCount += (-127 + (i25 * i25));
                    fArrFld[i25] = -61326;
                    break;
                case 35:
                    i20 *= s1;
                case 36:
                    f3 += ((long)i25 ^ (long)i30);
                    break;
                case 37:
                    i18 += (-6351 + (i25 * i25));
                    break;
                case 38:
                    Test0459.iArrFld[i25 + 1] <<= s1;
                    break;
                case 39:
                    i29 <<= 2;
                    break;
                default:
                    Test0459.instanceCount += -229;
                }
            }
        }

        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 s1 = " + i21 + "," + i22 + "," + s1);
        FuzzerUtils.out.println("f3 i23 i24 = " + Float.floatToIntBits(f3) + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("b2 i28 i29 = " + (b2 ? 1 : 0) + "," + i28 + "," + i29);
        FuzzerUtils.out.println("i30 dArr = " + i30 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test0459.instanceCount Test0459.byFld Test0459.dFld = " + Test0459.instanceCount + "," + Test0459.byFld +
                "," + Double.doubleToLongBits(Test0459.dFld));
        FuzzerUtils.out.println("Test0459.iArrFld Test0459.lArrFld fArrFld = " + FuzzerUtils.checkSum(Test0459.iArrFld) + "," +
                FuzzerUtils.checkSum(Test0459.lArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0459 _instance = new Test0459();
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
