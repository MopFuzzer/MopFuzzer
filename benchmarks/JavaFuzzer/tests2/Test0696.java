// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:44 2023
public class Test0696 {

    public static final int N = 400;

    public static long instanceCount=-8731664829936031955L;
    public int iFld=-7219;
    public double dFld=64.67900;
    public volatile float fFld=0.352F;
    public static long[] lArrFld =new long[N];
    public static volatile short[] sArrFld =new short[N];

    static {
        FuzzerUtils.init(Test0696.lArrFld, 144L);
        FuzzerUtils.init(Test0696.sArrFld, (short) -24090);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i3, long l1) {

        short s=6780;

        l1 += 4;
        s -= s;
        long meth_res = i3 + l1 + s;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1(float f) {

        int i1=248;
        int i2=-229;
        int i4=11374;
        int i5=46941;
        int i6=-4;
        int i7=-11;
        int i8=201;
        int i9=14;
        int[] iArr1 =new int[N];
        int[][] iArr2 =new
                    int[N][N];
        short s1=809;

        FuzzerUtils.init(iArr1, -9);
        FuzzerUtils.init(iArr2, 250);

        for (i1 = 11; i1 < 234; i1++) {
            Test0696.lArrFld[i1 + 1] >>= (i2 - lMeth(i1, Test0696.instanceCount));
            Test0696.instanceCount = Test0696.instanceCount;
        }
        Test0696.instanceCount &= -37480;
        i2 += (int) Test0696.instanceCount;
        for (i4 = 169; i4 > 1; --i4) {
            i6 = 1;
            while (++i6 < 9) {
                f += i5;
                i7 += (((i6 * i7) + Test0696.instanceCount) - Test0696.instanceCount);
                for (i8 = 1; i8 < 1; ++i8) {
                    switch (((i6 >>> 1) % 8) + 72) {
                    case 72:
                        i9 += (i8 - Test0696.instanceCount);
                        i5 += (i8 * i8);
                        Test0696.sArrFld = FuzzerUtils.short1array(N, (short) -6205);
                        i2 += (((i8 * Test0696.instanceCount) + s1) - i7);
                        break;
                    case 73:
                        f *= i1;
                        break;
                    case 74:
                        i7 += i4;
                    case 75:
                        iArr1 = FuzzerUtils.int1array(N, (int)-54594);
                        break;
                    case 76:
                        Test0696.instanceCount += (i8 + f);
                        break;
                    case 77:
                        i9 += (((i8 * i2) + i7) - i7);
                        break;
                    case 78:
                        if (i6 != 0) {
                            vMeth1_check_sum += Float.floatToIntBits(f) + i1 + i2 + i4 + i5 + i6 + i7 + i8 + i9 + s1 +
                                FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(iArr2);
                            return;
                        }
                    case 79:
                        iArr2 = FuzzerUtils.int2array(N, (int)250);
                        break;
                    default:
                        i2 -= i9;
                    }
                }
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f) + i1 + i2 + i4 + i5 + i6 + i7 + i8 + i9 + s1 +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(iArr2);
    }

    public void vMeth(double d) {

        float f1=0.276F;
        int i10=17648;
        int i11=181;
        int i12=-8;
        int i13=-230;
        int i14=146;
        int i15=-10;
        int[] iArr3 =new int[N];
        byte by=62;
        byte[][] byArr =new byte[N][N];

        FuzzerUtils.init(byArr, (byte)-10);
        FuzzerUtils.init(iArr3, -34282);

        d *= Integer.reverseBytes((int) ((iFld * 76) * (Test0696.instanceCount * iFld)));
        vMeth1(f1);
        Test0696.instanceCount -= -15914;
        byArr[(iFld >>> 1) % N][(iFld >>> 1) % N] += (byte)iFld;
        for (i10 = 11; i10 < 220; ++i10) {
            for (i12 = 1; i12 < 8; ++i12) {
                for (i14 = i10; i14 < 2; ++i14) {
                    iArr3[i12 - 1] = (int) Test0696.instanceCount;
                    iArr3 = FuzzerUtils.int1array(N, (int)32880);
                    iArr3[i14] -= (int) Test0696.instanceCount;
                    i15 %= (int)(i12 | 1);
                }
                by += (byte)(10L + (i12 * i12));
                iArr3[i10 - 1] -= iFld;
                Test0696.instanceCount -= Test0696.instanceCount;
                if (i13 != 0) {
                    vMeth_check_sum += Double.doubleToLongBits(d) + Float.floatToIntBits(f1) + i10 + i11 + i12 + i13 +
                        i14 + i15 + by + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr3);
                    return;
                }
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + Float.floatToIntBits(f1) + i10 + i11 + i12 + i13 + i14 + i15 +
            by + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr3);
    }

    public void mainTest(String[] strArr1) {

        long l=994646271481055687L;
        int i=26483;
        int i16=-102;
        int i17=-27;
        int i18=7;
        int i19=9;
        int i20=220;
        int i21=11;
        int i22=59160;
        int i23=-153;
        int i24=-110;
        int[] iArr =new int[N];
        byte by1=-39;
        byte[] byArr1 =new byte[N];
        boolean b=false;
        float[] fArr =new float[N];

        FuzzerUtils.init(iArr, 1);
        FuzzerUtils.init(fArr, 1.907F);
        FuzzerUtils.init(byArr1, (byte)121);

        iArr[(iFld >>> 1) % N] -= (--iFld);
        for (l = 24; 385 > l; l++) {
            vMeth(dFld);
            for (i16 = (int)(l); 70 > i16; ++i16) {
                fArr[(iFld >>> 1) % N] *= l;
                iArr[(int) (l - 1)] -= (int) Test0696.instanceCount;
                iArr[i16 - 1] -= -53724;
                i = i16;
                i = i16;
                fFld = i17;
                for (i18 = 1; 1 > i18; i18++) {
                    i -= i18;
                    fArr[(int)(l)] += i16;
                    Test0696.instanceCount *= 125;
                    iFld += (((i18 * by1) + i16) - Test0696.instanceCount);
                }
                dFld += 0.102232;
            }
            iFld >>= i19;
            switch ((int)(((l % 8) * 5) + 48)) {
            case 61:
                fFld -= i18;
                break;
            case 80:
                i = i17;
                iArr[(int)(l + 1)] >>= i17;
                break;
            case 52:
                if (b) continue;
                for (i20 = (int)(l); i20 < 70; i20 += 2) {
                    for (i22 = 1; i22 > 1; i22 -= 3) {
                        iArr[(int)(l)] = i22;
                        i17 = i23;
                        if (false) break;
                    }
                    i24 = 1;
                    do {
                        dFld -= i20;
                    } while (++i24 < 1);
                    i17 = (int) Test0696.instanceCount;
                }
                break;
            case 78:
                byArr1[(int)(l - 1)] = (byte)i20;
            case 55:
                i -= (int)l;
                break;
            case 60:
                iArr[(int)(l)] = i22;
                break;
            case 59:
                fFld = fFld;
            case 56:
                Test0696.instanceCount = Test0696.instanceCount;
                break;
            }
        }

        FuzzerUtils.out.println("l i i16 = " + l + "," + i + "," + i16);
        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("by1 b i20 = " + by1 + "," + (b ? 1 : 0) + "," + i20);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 iArr fArr = " + i24 + "," + FuzzerUtils.checkSum(iArr) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));
        FuzzerUtils.out.println("byArr1 = " + FuzzerUtils.checkSum(byArr1));

        FuzzerUtils.out.println("Test0696.instanceCount iFld dFld = " + Test0696.instanceCount + "," + iFld + "," +
            Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("fFld Test0696.lArrFld Test0696.sArrFld = " + Float.floatToIntBits(fFld) + "," +
                FuzzerUtils.checkSum(Test0696.lArrFld) + "," + FuzzerUtils.checkSum(Test0696.sArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0696 _instance = new Test0696();
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