// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:42 2023
public class Test0647 {

    public static final int N = 400;

    public static volatile long instanceCount=6340996965080873011L;
    public static double dFld=2.110359;
    public volatile long[] lArrFld =new long[N];
    public static int[] iArrFld =new int[N];
    public static volatile long[] lArrFld1 =new long[N];
    public static int[][] iArrFld1 =new int[N][N];

    static {
        FuzzerUtils.init(Test0647.iArrFld, 242);
        FuzzerUtils.init(Test0647.lArrFld1, -2652016075L);
        FuzzerUtils.init(Test0647.iArrFld1, 53153);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i7) {

        int i8=142, i9=9, i10=-24;
        boolean b=true;
        long l=-8173697324301518623L;
        long[] lArr =new long[N];
        short s=-27906;
        float f2=6.339F;
        byte by1=-2;

        FuzzerUtils.init(lArr, 22131L);

        i8 = 1;
        while (++i8 < 359) {
            if (b) {
                i7 += i8;
            }
            l = 1;
            do {
                s += (short)l;
                switch (((i7 >>> 1) % 7) + 63) {
                case 63:
                    i7 += (int)f2;
                    break;
                case 64:
                    i7 -= (int)f2;
                    for (i9 = 1; i9 < 1; ++i9) {
                        if (b) {
                            i7 = (int)l;
                            i10 = -4176;
                            i10 += by1;
                        } else {
                            f2 = -34891;
                            Test0647.instanceCount %= (i9 | 1);
                        }
                    }
                    break;
                case 65:
                    lArr[i8] *= by1;
                    break;
                case 66:
                    i7 %= (int)(i10 | 1);
                case 67:
                    Test0647.iArrFld[i8 + 1] += i8;
                    break;
                case 68:
                    i10 -= (int)l;
                    break;
                case 69:
                    s >>= (short)i9;
                    break;
                }
            } while (++l < 5);
        }
        vMeth1_check_sum += i7 + i8 + (b ? 1 : 0) + l + s + Float.floatToIntBits(f2) + i9 + i10 + by1 +
            FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth() {

        int i5=85, i6=-38455, i11=2, i12=-4;
        short s1=24645;

        for (i5 = 11; i5 < 302; ++i5) {
            vMeth1(i5);
            Test0647.instanceCount <<= i5;
            i6 -= s1;
            for (i11 = 1; 6 > i11; i11++) {
                i12 *= 13;
                Test0647.instanceCount = i6;
                Test0647.instanceCount >>= i6;
            }
            Test0647.lArrFld1[i5 + 1] = i11;
            Test0647.dFld += i11;
            i12 += (i5 ^ Test0647.instanceCount);
            i6 *= (int) Test0647.instanceCount;
            Test0647.iArrFld[i5 + 1] += i5;
            i12 += (40 + (i5 * i5));
        }
        Test0647.iArrFld1 = Test0647.iArrFld1;
        long meth_res = i5 + i6 + s1 + i11 + i12;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth(int i4, float f1) {

        double d=1.16919;
        int i13=-23219, i14=27, i15=84;
        long l1=2225473565471168153L;
        boolean b1=true;

        d -= (iMeth() - i4);
        i13 = 1;
        do {
            l1 = 8;
            while (--l1 > 0) {
                Test0647.instanceCount += l1;
                i14 = 1;
                while (++i14 < 1) {
                    switch ((((i4 >>> 1) % 2) * 5) + 73) {
                    case 74:
                        Test0647.instanceCount *= -62308L;
                        Test0647.instanceCount -= 0;
                        if (b1) {
                            i4 = i14;
                            b1 = b1;
                        }
                        switch ((i13 % 9) + 31) {
                        case 31:
                            Test0647.iArrFld[i13 + 1] += i15;
                            if (b1) break;
                        case 32:
                            i4 &= 9;
                        case 33:
                            i4 += i14;
                            break;
                        case 34:
                        case 35:
                            i4 = (int)l1;
                            break;
                        case 36:
                            f1 += i14;
                            break;
                        case 37:
                            if (i14 != 0) {
                                vMeth_check_sum += i4 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d) + i13 +
                                    l1 + i14 + (b1 ? 1 : 0) + i15;
                                return;
                            }
                            break;
                        case 38:
                            Test0647.iArrFld1[i14][i13] = -1;
                        case 39:
                            Test0647.dFld -= 145;
                            break;
                        default:
                        }
                        break;
                    case 82:
                        i15 += (int)l1;
                        break;
                    }
                }
            }
        } while (++i13 < 199);
        vMeth_check_sum += i4 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d) + i13 + l1 + i14 + (b1 ? 1 : 0) +
            i15;
    }

    public void mainTest(String[] strArr1) {

        int i=-57720;
        int i1=-22556;
        int i2=-52;
        int i3=-216;
        int i16=3;
        int i17=172;
        int i18=-30120;
        int i19=6870;
        int i20=16;
        int i21=247;
        int i22=20;
        int i23=-1;
        int i24=-187;
        int i25=-59249;
        int[] iArr =new int[N];
        float f=72.783F;
        byte by=28;
        boolean b2=false;
        short s2=23225;
        double[] dArr =new double[N];

        FuzzerUtils.init(iArr, 149);
        FuzzerUtils.init(dArr, -20.107538);

        i *= (int)(lArrFld[(i >>> 1) % N]--);
        i1 = 1;
        while (++i1 < 296) {
            i += (((i1 * Test0647.instanceCount) + f) - i1);
            f += (((i1 * f) + i) - Test0647.instanceCount);
            for (i2 = i1; i2 < 85; ++i2) {
                iArr[i1] = (int) Test0647.instanceCount;
                i += (int)(6305191435417702976L + (i2 * i2));
                Test0647.instanceCount = ((++i) - (by + i));
                vMeth(i2, f);
                i3 = (int)f;
            }
            Test0647.lArrFld1[i1] = i;
        }
        for (i16 = 10; i16 < 167; i16++) {
            i3 >>>= i2;
            for (i18 = 3; i18 < 160; ++i18) {
                i3 += i;
            }
            for (i20 = 2; 160 > i20; ++i20) {
                i17 = i1;
                i19 += i20;
                dArr[i16] -= i3;
            }
            for (i22 = 160; i22 > 9; --i22) {
                Test0647.instanceCount ^= i2;
                f *= i23;
                if (b2) continue;
                for (i24 = i16; i24 < 2; ++i24) {
                    if (b2) break;
                    i += (((i24 * i16) + Test0647.instanceCount) - Test0647.instanceCount);
                    Test0647.instanceCount = Test0647.instanceCount;
                    i <<= s2;
                    if (b2) continue;
                    by += (byte)(i24 | i22);
                }
            }
        }

        FuzzerUtils.out.println("i i1 f = " + i + "," + i1 + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("i2 i3 by = " + i2 + "," + i3 + "," + by);
        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 b2 = " + i22 + "," + i23 + "," + (b2 ? 1 : 0));
        FuzzerUtils.out.println("i24 i25 s2 = " + i24 + "," + i25 + "," + s2);
        FuzzerUtils.out.println("iArr dArr = " + FuzzerUtils.checkSum(iArr) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test0647.instanceCount Test0647.dFld lArrFld = " + Test0647.instanceCount + "," +
                Double.doubleToLongBits(Test0647.dFld) + "," + FuzzerUtils.checkSum(lArrFld));
        FuzzerUtils.out.println("Test0647.iArrFld Test0647.lArrFld1 Test0647.iArrFld1 = " + FuzzerUtils.checkSum(Test0647.iArrFld) +
                "," + FuzzerUtils.checkSum(Test0647.lArrFld1) + "," + FuzzerUtils.checkSum(Test0647.iArrFld1));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0647 _instance = new Test0647();
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
