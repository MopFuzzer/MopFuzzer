// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:41 2023
public class Test0635 {

    public static final int N = 400;

    public static long instanceCount=1597196637L;
    public static volatile short sFld=10903;
    public float fFld=-1.165F;
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0635.iArrFld, -252);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        float f1=-1.687F;
        int i3=53350;
        int i4=-62;
        int i5=17863;
        int i6=7;
        int i7=8;
        int[] iArr =new int[N];
        boolean b=false;
        boolean[] bArr =new boolean[N];
        double d2=0.72594;
        short s=-18739;
        long[] lArr =new long[N];

        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(iArr, -1);
        FuzzerUtils.init(lArr, 831715328L);

        for (f1 = 1; f1 < 267; ++f1) {
            bArr[(int)(f1 - 1)] = b;
            i3 = i3;
            iArr[(int)(f1 - 1)] -= -15;
            d2 -= d2;
            for (i4 = 1; 6 > i4; i4++) {
                s ^= (short)181;
                Test0635.instanceCount *= i3;
                i5 = i5;
                bArr[i4 + 1] = b;
                if (i5 != 0) {
                }
                i5 %= (int)(i3 | 1);
                for (i6 = 1; i6 < 2; ++i6) {
                    lArr = lArr;
                    iArr[(int)(f1 + 1)] >>>= i6;
                }
            }
        }
        long meth_res = Float.floatToIntBits(f1) + i3 + (b ? 1 : 0) + Double.doubleToLongBits(d2) + i4 + i5 + s + i6 +
            i7 + FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(long l1, double d1, long l2) {

        int i2=1, i8=50016;
        float f2=-109.762F;

        i2 = 1;
        while (++i2 < 153) {
            l2 = (Math.min(iMeth(), 141) * -46270);
            i8 >>>= 227;
            f2 *= -2.1012F;
        }
        i8 <<= (int)-2736847032L;
        vMeth1_check_sum += l1 + Double.doubleToLongBits(d1) + l2 + i2 + i8 + Float.floatToIntBits(f2);
    }

    public static void vMeth(long l, double d, float f) {

        int i9=11;
        int i10=4;
        int i11=-61913;
        int i12=12;
        int i13=8;
        int i14=-3;
        int i15=0;
        int i16=16703;
        int[][] iArr1 =new int[N][N];
        byte by=-123;
        long[][] lArr1 =new long[N][N];

        FuzzerUtils.init(lArr1, 42985L);
        FuzzerUtils.init(iArr1, 49);

        vMeth1(Test0635.instanceCount, d, Test0635.instanceCount);
        Test0635.iArrFld[(i9 >>> 1) % N] -= (int) d;
        i10 = 1;
        do {
            for (i11 = 1; i11 < 9; i11++) {
                if (true) continue;
                switch ((i11 % 9) + 5) {
                case 5:
                    i9 = Test0635.sFld;
                    by = (byte)-72;
                    for (i13 = 1; i13 < 2; ++i13) {
                        i9 += (int)d;
                        Test0635.iArrFld[i11 + 1] -= by;
                        l *= i9;
                    }
                    for (i15 = 1; i15 < 2; i15++) {
                        i16 += (-11801 + (i15 * i15));
                        i16 *= i12;
                    }
                    break;
                case 6:
                    d += i12;
                    break;
                case 7:
                case 8:
                    lArr1[i11 + 1][i10 + 1] *= i10;
                    break;
                case 9:
                    f = 0.307F;
                    break;
                case 10:
                    i14 = (int) Test0635.instanceCount;
                case 11:
                    Test0635.instanceCount = i13;
                case 12:
                    i12 += 50370;
                    break;
                case 13:
                    iArr1 = iArr1;
                    break;
                default:
                    i14 *= i9;
                }
            }
        } while (++i10 < 170);
        vMeth_check_sum += l + Double.doubleToLongBits(d) + Float.floatToIntBits(f) + i9 + i10 + i11 + i12 + by + i13 +
            i14 + i15 + i16 + FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=76, i1=13, i17=-9, i18=-40931, i19=-46, i20=-164, i21=-225;
        double d3=-112.123278;
        long l3=37348L;
        long[] lArr2 =new long[N];
        boolean b1=true;
        byte[] byArr =new byte[N];

        FuzzerUtils.init(lArr2, -111L);
        FuzzerUtils.init(byArr, (byte)107);

        for (i = 318; i > 12; i--) {
            i1 += (7 + (i * i));
            i1 *= i;
            if (true) {
                switch ((i % 2) + 2) {
                case 2:
                    vMeth(Test0635.instanceCount, 1.17788, fFld);
                    i17 = 82;
                    while (--i17 > 0) {
                        i1 *= i17;
                        Test0635.iArrFld[i] = (int) 1.35F;
                        i1 *= 150;
                        switch ((i % 8) + 71) {
                        case 71:
                            i1 = i1;
                            i1 *= (int) Test0635.instanceCount;
                            i1 = i;
                            Test0635.instanceCount += (7 + (i17 * i17));
                            break;
                        case 72:
                            for (i18 = 1; i18 < 1; i18++) {
                                Test0635.instanceCount -= i;
                                i19 += i;
                            }
                            d3 += i17;
                            Test0635.iArrFld[i17] += (int) fFld;
                            i19 += (((i17 * i19) + i17) - Test0635.instanceCount);
                        case 73:
                            i1 >>>= i17;
                            break;
                        case 74:
                            try {
                                i1 = (16817 / i17);
                                Test0635.iArrFld[i17] = (i18 % 153);
                                i1 = (i18 / i19);
                            } catch (ArithmeticException a_e) {}
                            for (i20 = 1; i20 < 1; i20++) {
                                i1 *= i;
                                i19 *= 2;
                                i21 += i17;
                                i19 += i20;
                                i1 += (((i20 * i21) + fFld) - fFld);
                                Test0635.instanceCount = i;
                            }
                        case 75:
                            l3 -= (long)fFld;
                            break;
                        case 76:
                            i19 &= Test0635.sFld;
                            break;
                        case 77:
                            l3 &= i21;
                            break;
                        case 78:
                        }
                    }
                case 3:
                    if (b1) break;
                    break;
                default:
                    lArr2[i - 1] *= 1;
                }
            } else {
                byArr[i - 1] <<= (byte)l3;
            }
        }

        FuzzerUtils.out.println("i i1 i17 = " + i + "," + i1 + "," + i17);
        FuzzerUtils.out.println("i18 i19 d3 = " + i18 + "," + i19 + "," + Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("i20 i21 l3 = " + i20 + "," + i21 + "," + l3);
        FuzzerUtils.out.println("b1 lArr2 byArr = " + (b1 ? 1 : 0) + "," + FuzzerUtils.checkSum(lArr2) + "," +
            FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test0635.instanceCount Test0635.sFld fFld = " + Test0635.instanceCount + "," + Test0635.sFld + "," +
            Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("Test0635.iArrFld = " + FuzzerUtils.checkSum(Test0635.iArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0635 _instance = new Test0635();
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
