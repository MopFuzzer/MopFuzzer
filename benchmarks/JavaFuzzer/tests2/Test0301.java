// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:26 2023
public class Test0301 {

    public static final int N = 400;

    public static long instanceCount=2171639105L;
    public volatile int iFld=-5678;
    public static byte byFld=114;
    public long lFld=241L;
    public boolean[] bArrFld =new boolean[N];
    public static volatile int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0301.iArrFld, -8088);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i3, short s1, int i4) {

        int i5=9, i6=-133, i7=189;
        boolean b=false;
        double d1=-58.13408;
        short s2=-13283;
        float f=-52.787F;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, 14L);

        for (long l1 : lArr) {
            Test0301.instanceCount -= i4;
            i4 = i3;
            i5 = 4;
            do {
                if (b) continue;
                i3 += i5;
                Test0301.iArrFld[i5] >>= s1;
                for (i6 = 1; 2 > i6; ++i6) {
                    Test0301.instanceCount <<= i6;
                    switch ((i5 % 6) + 120) {
                    case 120:
                        Test0301.iArrFld = Test0301.iArrFld;
                        s1 = (short)i5;
                        i3 <<= (int)l1;
                        if (true) break;
                        break;
                    case 121:
                        d1 = Test0301.instanceCount;
                    case 122:
                        Test0301.byFld = (byte) s2;
                        break;
                    case 123:
                        f = i4;
                        break;
                    case 124:
                        try {
                            i4 = (i4 % Test0301.iArrFld[i5]);
                            i7 = (Test0301.iArrFld[i6 + 1] % i3);
                            i3 = (i5 % -17277);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 125:
                        if (i3 != 0) {
                        }
                        break;
                    default:
                        Test0301.byFld = (byte) -2;
                    }
                }
            } while ((i5 -= 2) > 0);
        }
        long meth_res = i3 + s1 + i4 + i5 + (b ? 1 : 0) + i6 + i7 + Double.doubleToLongBits(d1) + s2 +
            Float.floatToIntBits(f) + FuzzerUtils.checkSum(lArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1(int i1, int i2) {

        int i8=-10;
        int i9=-40812;
        int i10=-11956;
        int i11=-28;
        int i12=10;
        int i13=222;
        int[] iArr =new int[N];
        short s3=28176;
        boolean b1=true;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(iArr, -37971);
        FuzzerUtils.init(lArr1, -8631715639628011780L);

        iArr[(i2 >>> 1) % N] = Math.max((int) ((Test0301.instanceCount + i2) - (i2 - Test0301.instanceCount)), i1);
        if (b1) {
            lMeth(i8, s3, i2);
            i9 = 296;
            while ((i9 -= 2) > 0) {
                for (i10 = 1; 11 > i10; ++i10) {
                    i11 += (i10 ^ Test0301.instanceCount);
                    lArr1[i10 - 1] >>>= i2;
                }
                i8 += i9;
                Test0301.instanceCount = i8;
            }
            i8 >>>= i9;
            Test0301.instanceCount *= 162L;
        }
        for (i12 = 17; i12 < 341; i12++) {
            if (b1) break;
            i11 += i12;
            Test0301.instanceCount = Test0301.byFld;
        }
        vMeth1_check_sum += i1 + i2 + i8 + s3 + i9 + i10 + i11 + (b1 ? 1 : 0) + i12 + i13 + FuzzerUtils.checkSum(iArr)
            + FuzzerUtils.checkSum(lArr1);
    }

    public static void vMeth(int i, long l, double d) {

        int i14=4, i15=5473, i16=-6, i17=-229;
        float f1=-67.41F;
        double d2=94.27242;
        long[] lArr2 =new long[N];

        FuzzerUtils.init(lArr2, -1571840759L);

        vMeth1(8, i);
        i = i;
        i = (int) Test0301.instanceCount;
        i14 = (int) Test0301.instanceCount;
        i /= (int)((long)(f1) | 1);
        for (i15 = 382; i15 > 2; --i15) {
            Test0301.iArrFld = Test0301.iArrFld;
            i14 = i15;
        }
        for (d2 = 5; d2 < 194; d2++) {
            short s4=-32695;
            l <<= i15;
            switch ((int)((d2 % 4) + 105)) {
            case 105:
                Test0301.iArrFld[(int) (d2 - 1)] >>>= i15;
                lArr2[(int)(d2 + 1)] <<= l;
                i17 *= i17;
                i = i17;
                break;
            case 106:
                Test0301.instanceCount = i16;
                break;
            case 107:
                s4 = (short)58438;
                break;
            case 108:
                i14 += (int)d2;
            default:
                i16 >>= (int) Test0301.instanceCount;
            }
        }
        vMeth_check_sum += i + l + Double.doubleToLongBits(d) + i14 + Float.floatToIntBits(f1) + i15 + i16 +
            Double.doubleToLongBits(d2) + i17 + FuzzerUtils.checkSum(lArr2);
    }

    public void mainTest(String[] strArr1) {

        short s=23173;
        double d3=0.113186, d4=0.13451;
        float f2=-2.733F, f3=0.630F;
        int i18=39576, i19=167, i20=959, i22=49, i23=13, i24=117, i25=81, i26=-70, i27=-4546;
        boolean b2=false;

        bArrFld = (bArrFld = (bArrFld = (bArrFld = bArrFld)));
        s = (short)(iFld - ((++iFld) * (iFld - -137)));
        vMeth(iFld, lFld, d3);
        for (f2 = 12; f2 < 323; f2++) {
            Test0301.iArrFld = Test0301.iArrFld;
            for (i19 = 4; i19 < 81; ++i19) {
                int i21=-252;
                iFld <<= i21;
                f3 += i20;
            }
            i22 = 1;
            while (++i22 < 81) {
                Test0301.instanceCount = i18;
                i18 ^= i18;
                for (i23 = 1; i23 < 1; ++i23) {
                    f3 += (i23 * i23);
                    iFld += (i23 * i23);
                    i24 = -17;
                    i18 = (int)lFld;
                    s >>= (short) Test0301.instanceCount;
                    Test0301.instanceCount >>= Test0301.instanceCount;
                    f3 = s;
                }
                if (b2) break;
                f3 = i23;
                iFld >>= s;
            }
            iFld += (int)f2;
            b2 = b2;
            for (d4 = 81; d4 > f2; d4 -= 3) {
                s = (short)-3722553563L;
                for (i26 = 1; i26 < 1; i26++) {
                    Test0301.iArrFld[i26 - 1] -= (int) Test0301.instanceCount;
                    try {
                        i20 = (i20 % -114);
                        i24 = (Test0301.iArrFld[(int) (f2)] / -194);
                        i24 = (i27 % -282116926);
                    } catch (ArithmeticException a_e) {}
                    d3 -= i26;
                }
            }
        }

        FuzzerUtils.out.println("s d3 f2 = " + s + "," + Double.doubleToLongBits(d3) + "," + Float.floatToIntBits(f2));
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("f3 i22 i23 = " + Float.floatToIntBits(f3) + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 b2 d4 = " + i24 + "," + (b2 ? 1 : 0) + "," + Double.doubleToLongBits(d4));
        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);

        FuzzerUtils.out.println("Test0301.instanceCount iFld Test0301.byFld = " + Test0301.instanceCount + "," + iFld + "," +
                Test0301.byFld);
        FuzzerUtils.out.println("lFld bArrFld Test0301.iArrFld = " + lFld + "," + FuzzerUtils.checkSum(bArrFld) + "," +
                FuzzerUtils.checkSum(Test0301.iArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0301 _instance = new Test0301();
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
