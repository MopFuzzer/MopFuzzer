// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:20 2023
public class Test0166 {

    public static final int N = 400;

    public static long instanceCount=-3649076735989743953L;
    public static int iFld=3;
    public volatile double dFld=1.74554;
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0166.iArrFld, -10);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l2, int i6) {

        int i7=24545, i8=-210, i9=5;
        float f1=-1.918F;
        byte by1=24;
        short s1=-18090;
        boolean b=false;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(lArr1, -4395423035171499699L);

        for (i7 = 256; i7 > 6; i7--) {
            switch ((((i7 >>> 1) % 4) * 5) + 50) {
            case 69:
                i6 = i8;
                i9 = 1;
                while (++i9 < 7) {
                    i8 = i7;
                    f1 += (((i9 * i7) + l2) - i8);
                }
                lArr1[i7 + 1] *= i8;
            case 54:
                lArr1[i7 - 1] = by1;
                f1 = f1;
                switch (((i7 % 8) * 5) + 36) {
                case 73:
                    i6 += (((i7 * by1) + s1) - by1);
                    break;
                case 63:
                    i8 += -1;
                    break;
                case 47:
                    Test0166.instanceCount += -83;
                    f1 -= f1;
                    i6 = (int)f1;
                case 62:
                    if (b) continue;
                    break;
                case 51:
                    i6 *= i7;
                    break;
                case 72:
                    i6 += i8;
                case 48:
                    i8 = i9;
                    break;
                case 37:
                    i8 += (i7 | i6);
                    break;
                }
            case 52:
                l2 += i7;
                break;
            case 70:
                if (i6 != 0) {
                    vMeth1_check_sum += l2 + i6 + i7 + i8 + i9 + Float.floatToIntBits(f1) + by1 + s1 + (b ? 1 : 0) +
                        FuzzerUtils.checkSum(lArr1);
                    return;
                }
                break;
            }
        }
        vMeth1_check_sum += l2 + i6 + i7 + i8 + i9 + Float.floatToIntBits(f1) + by1 + s1 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(lArr1);
    }

    public static long lMeth(long l1, int i1, int i2) {

        int i3=239;
        int i4=23559;
        int i5=8;
        int i10=26;
        int[] iArr1 =new int[N];
        byte by=98;
        short s=-9563;
        float f2=26.853F;
        double d1=-78.18591;
        long[] lArr =new long[N];

        FuzzerUtils.init(iArr1, 46315);
        FuzzerUtils.init(lArr, -231L);

        i3 = 1;
        while (++i3 < 136) {
            by += (byte)(i3 * i3);
            iArr1[i3] = (int)(-5974L - s);
            i1 <<= (int)((lArr[i3 + 1] * iArr1[i3]) << (i2--));
            lArr[i3] = (i1++);
            iArr1[i3] = (int)l1;
            i1 = s;
            for (i4 = i3; 12 > i4; ++i4) {
                vMeth1(Test0166.instanceCount, i4);
                f2 -= i2;
                switch (((i3 % 1) * 5) + 93) {
                case 96:
                    i10 = 1;
                    while (++i10 < 1) {
                        iArr1[i4] += i2;
                        i1 = (int)f2;
                        lArr[i3] += (long)d1;
                    }
                    break;
                default:
                    lArr[i4] -= 19584;
                }
            }
        }
        long meth_res = l1 + i1 + i2 + i3 + by + s + i4 + i5 + Float.floatToIntBits(f2) + i10 +
            Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i) {

        long l=11L;
        long[] lArr2 =new long[N];
        float f=13.4F;
        float[] fArr =new float[N];
        double d=-2.16453;
        int i11=225;
        int i12=30;
        int i14=-169;
        int i15=-225;
        int i16=200;
        int i17=-103;
        int[][] iArr =new int[N][N];
        int[] iArr2 =new int[N];
        short s2=-26115;
        boolean b1=true;
        byte by2=85;
        byte[] byArr =new byte[N];

        FuzzerUtils.init(iArr, -5579);
        FuzzerUtils.init(iArr2, 1);
        FuzzerUtils.init(lArr2, -186L);
        FuzzerUtils.init(fArr, -31.510F);
        FuzzerUtils.init(byArr, (byte)-63);

        l = ((Math.abs(4L) * i) + (i << Math.min(-175, i)));
        f += (float)(((d - i) + iArr[(i >>> 1) % N][(i >>> 1) % N]) / ((long)(Math.abs(Math.abs(f))) | 1));
        i -= (int) (i = (int) lMeth(Test0166.instanceCount, i, -245));
        for (i11 = 6; i11 < 296; ++i11) {
            i += (((i11 * i11) + s2) - i12);
            i += (int) Test0166.instanceCount;
            for (i14 = i11; i14 < 6; i14++) {
                switch (((i11 % 9) * 5) + 2) {
                case 19:
                    i *= (int) Test0166.instanceCount;
                    for (i16 = i14; i16 < 1; i16++) {
                        lArr2 = FuzzerUtils.long1array(N, (long)1L);
                        fArr[i14] -= (float)d;
                        byArr[i11 - 1] += (byte)f;
                        if (b1) break;
                    }
                    l -= i15;
                case 25:
                    Test0166.instanceCount = i15;
                    break;
                case 38:
                    i >>>= i11;
                    break;
                case 31:
                    i17 <<= i12;
                case 26:
                    if (i15 != 0) {
                        vMeth_check_sum += i + l + Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i11 + i12 +
                            s2 + i14 + i15 + i16 + i17 + (b1 ? 1 : 0) + by2 + FuzzerUtils.checkSum(iArr) +
                            FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(lArr2) +
                            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(byArr);
                        return;
                    }
                case 13:
                    byArr[i11 + 1] *= by2;
                    break;
                case 3:
                    lArr2[i14 + 1] += (long)-45.111F;
                    break;
                case 16:
                    i17 -= i12;
                    break;
                case 32:
                    by2 -= (byte) Test0166.instanceCount;
                    break;
                }
            }
        }
        vMeth_check_sum += i + l + Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i11 + i12 + s2 + i14 + i15 +
            i16 + i17 + (b1 ? 1 : 0) + by2 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(iArr2) +
            FuzzerUtils.checkSum(lArr2) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(byArr);
    }

    public void mainTest(String[] strArr1) {

        float f3=87.593F;
        short s3=-27560;
        int i18=191, i19=95, i20=0, i21=10, i22=-9, i23=58233, i24=-140, i25=-15, i26=-8, i27=-84;
        byte by3=80;
        byte[][] byArr1 =new byte[N][N];
        long l3=115L;
        long[] lArr3 =new long[N];

        FuzzerUtils.init(byArr1, (byte)31);
        FuzzerUtils.init(lArr3, 91L);

        vMeth(35552);
        f3 = s3;
        for (i18 = 329; i18 > 15; --i18) {
            boolean b2=true;
            byArr1[i18 - 1][i18 - 1] = (byte) Test0166.instanceCount;
            i19 *= (int)1.115308;
            switch (((i19 >>> 1) % 9) + 41) {
            case 41:
                for (i20 = i18; 80 > i20; i20++) {
                    i22 = 1;
                    do {
                        Test0166.iFld = i22;
                    } while (++i22 < 1);
                    for (i23 = 1; i23 < 1; i23 += 3) {
                        i19 = Test0166.iFld;
                        dFld *= 111;
                        f3 += (((i23 * i19) + i18) - by3);
                    }
                }
                Test0166.iFld += Test0166.iFld;
                b2 = b2;
            case 42:
                Test0166.iArrFld[i18 - 1] = (int) Test0166.instanceCount;
            case 43:
                by3 = (byte) Test0166.iFld;
                l3 -= i22;
                i25 = 1;
                while (++i25 < 80) {
                    i21 <<= Test0166.iFld;
                    if (false) {
                        for (i26 = 1; i26 > 1; i26 -= 2) {
                            by3 >>= (byte)l3;
                            i24 *= (int)f3;
                            Test0166.iFld += i26;
                            Test0166.iFld -= i23;
                        }
                        i21 += (int)l3;
                    } else if (b2) {
                        Test0166.instanceCount -= i25;
                        l3 = Test0166.iFld;
                        i27 <<= i18;
                    } else {
                        Test0166.instanceCount = i18;
                    }
                }
            case 44:
                i21 *= 0;
            case 45:
                l3 >>= i21;
                break;
            case 46:
                i27 = i26;
                break;
            case 47:
                i24 += (92 + (i18 * i18));
                break;
            case 48:
            case 49:
                b2 = b2;
                break;
            default:
                lArr3[i18 + 1] -= l3;
            }
        }

        FuzzerUtils.out.println("f3 s3 i18 = " + Float.floatToIntBits(f3) + "," + s3 + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("by3 l3 i25 = " + by3 + "," + l3 + "," + i25);
        FuzzerUtils.out.println("i26 i27 byArr1 = " + i26 + "," + i27 + "," + FuzzerUtils.checkSum(byArr1));
        FuzzerUtils.out.println("lArr3 = " + FuzzerUtils.checkSum(lArr3));

        FuzzerUtils.out.println("Test0166.instanceCount Test0166.iFld dFld = " + Test0166.instanceCount + "," + Test0166.iFld + "," +
            Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("Test0166.iArrFld = " + FuzzerUtils.checkSum(Test0166.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0166 _instance = new Test0166();
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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}