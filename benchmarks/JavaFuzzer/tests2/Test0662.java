// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:43 2023
public class Test0662 {

    public static final int N = 400;

    public static long instanceCount=4L;
    public float fFld=1.771F;
    public int iFld=950;
    public static int iFld1=53015;
    public static byte byFld=33;

    public static long iMeth_check_sum = 0;
    public static long byMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public int iMeth() {

        short s=-28929;
        int[] iArr1 =new int[N];

        FuzzerUtils.init(iArr1, 8);

        iFld = ((iArr1[(iFld >>> 1) % N] - (iFld -= s)) - iFld);
        long meth_res = s + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth(int i11, int i12) {

        int i13=0;
        int i14=-5;
        int i15=25641;
        int i16=-10;
        int i17=-193;
        int i18=-8;
        int[][] iArr3 =new int[N][N];
        float f=-29.993F;
        double d=1.56943;
        long l=6L;

        FuzzerUtils.init(iArr3, -53289);

        for (i13 = 4; 155 > i13; ++i13) {
            f += (-58151 + (i13 * i13));
            f += i13;
            i11 += (i13 + i14);
            d += l;
            i12 = (int)115L;
        }
        i11 -= 39;
        iArr3[(i12 >>> 1) % N][(i14 >>> 1) % N] += i14;
        for (i15 = 23; i15 < 388; i15++) {
            i16 = i15;
            i12 = (int)f;
            for (i17 = 1; i17 < 5; ++i17) {
                i18 = -101;
                Test0662.instanceCount = Test0662.instanceCount;
                Test0662.instanceCount -= i15;
            }
        }
        long meth_res = i11 + i12 + i13 + i14 + Float.floatToIntBits(f) + Double.doubleToLongBits(d) + l + i15 + i16 +
            i17 + i18 + FuzzerUtils.checkSum(iArr3);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth() {

        int i9=-90;
        int i10=224;
        int i19=99;
        int i20=922;
        int i21=-27485;
        int i22=252;
        int[] iArr2 =new int[N];
        short s1=-3554;
        float f1=0.70F;
        float[] fArr1 =new float[N];
        double d1=-20.97629;

        FuzzerUtils.init(iArr2, 57553);
        FuzzerUtils.init(fArr1, 116.708F);

        for (i9 = 8; i9 < 147; ++i9) {
            iArr2[i9 - 1] += (int)(lMeth(i9, i10) << s1);
            i10 = (int)f1;
            for (i19 = 11; 1 < i19; i19 -= 3) {
                try {
                    iArr2[i9 - 1] = (i9 / -27);
                    i20 = (28665 / iArr2[i9]);
                    i20 = (i10 % iArr2[i9]);
                } catch (ArithmeticException a_e) {}
                i20 >>= -9;
                iArr2[i19] += (int)d1;
                i10 = i20;
                Test0662.instanceCount >>= Test0662.instanceCount;
                for (i21 = i9; i21 < 4; ++i21) {
                    i10 += i21;
                    i22 += (i21 * i21);
                    f1 -= i10;
                    try {
                        i10 = (1732625958 % i19);
                        i22 = (i20 / 238);
                        iArr2[i21 + 1] = (-32786 % i19);
                    } catch (ArithmeticException a_e) {}
                    fArr1[(i21 >>> 1) % N] += Test0662.instanceCount;
                }
            }
        }
        vMeth_check_sum += i9 + i10 + s1 + Float.floatToIntBits(f1) + i19 + i20 + Double.doubleToLongBits(d1) + i21 +
            i22 + FuzzerUtils.checkSum(iArr2) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public static byte byMeth() {

        int i8=3946;
        int i23=216;
        int i24=18;
        int i26=178;
        int i27=-48357;
        int i28=5;
        int[] iArr4 =new int[N];
        short s2=-28690;
        boolean b1=true;

        FuzzerUtils.init(iArr4, 1);

        if (b1) {
            Test0662.instanceCount = (--i8);
        } else if (b1) {
            vMeth();
            for (i23 = 151; i23 > 3; i23--) {
                switch ((i23 % 2) + 68) {
                case 68:
                    i24 *= s2;
                    for (i26 = 1; i26 < 11; i26++) {
                        i28 = 1;
                        do {
                            Test0662.iFld1 &= i28;
                            Test0662.instanceCount -= i26;
                            iArr4[i23 + 1] = i28;
                            i27 *= -132;
                            Test0662.instanceCount <<= i23;
                            if (i8 != 0) {
                            }
                            Test0662.iFld1 >>>= (int) Test0662.instanceCount;
                        } while (++i28 < 2);
                    }
                    break;
                case 69:
                    Test0662.iFld1 = i27;
                    break;
                default:
                    i8 = (int) Test0662.instanceCount;
                }
            }
        } else {
            iArr4[(i23 >>> 1) % N] ^= (int) Test0662.instanceCount;
        }
        long meth_res = i8 + i23 + i24 + s2 + i26 + i27 + i28 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr4);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-5;
        int i1=-6;
        int i2=-17537;
        int i3=0;
        int i4=87;
        int i5=41108;
        int i6=51961;
        int i7=-2;
        int i29=191;
        int i30=8;
        int[] iArr =new int[N];
        boolean b=true;
        double d2=119.49510, d3=2.69321;
        short s3=-4239;
        float[] fArr =new float[N];

        FuzzerUtils.init(iArr, 11);
        FuzzerUtils.init(fArr, -86.609F);

        for (i = 8; i < 368; i++) {
            fFld = (--i1);
            for (i2 = i; 70 > i2; i2++) {
                i3 += (i2 + i1);
            }
            try {
                i1 = (iArr[i] / 76);
                i1 = (-4787 % i3);
                i3 = (i3 % -48118);
            } catch (ArithmeticException a_e) {}
            if (false) break;
            i3 = iMeth();
            switch ((((iFld--) >>> 1) % 7) + 41) {
            case 41:
                for (i4 = 70; i4 > 4; i4--) {
                    i1 += (i4 * i4);
                }
                break;
            case 42:
                for (i6 = 3; i6 < 70; ++i6) {
                    try {
                        i5 = (i7 / 60188);
                        iFld = (i % -42097);
                        iFld = (i1 % iArr[i]);
                    } catch (ArithmeticException a_e) {}
                    b = (Long.reverseBytes(-5L) < (iArr[i] <<= (++i5)));
                    fArr[i - 1] -= byMeth();
                    i5 /= (int) (Test0662.instanceCount | 1);
                    Test0662.iFld1 += (i6 * i6);
                    Test0662.instanceCount *= 13;
                    i7 = iFld;
                }
                Test0662.iFld1 += Test0662.byFld;
                Test0662.byFld -= (byte) d2;
                break;
            case 43:
                i7 = (int)d2;
                i1 *= i5;
                break;
            case 44:
                i7 += (i * i);
                iArr[i] >>= -39;
                i3 = i6;
                break;
            case 45:
                Test0662.iFld1 *= -7;
                for (i29 = 3; i29 < 70; ++i29) {
                    i3 %= (int)(iFld | 1);
                    iFld -= s3;
                    d3 *= i4;
                }
                break;
            case 46:
                iFld = (int) Test0662.instanceCount;
                break;
            case 47:
                iArr[i + 1] += i6;
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i4 i5 = " + i3 + "," + i4 + "," + i5);
        FuzzerUtils.out.println("i6 i7 b = " + i6 + "," + i7 + "," + (b ? 1 : 0));
        FuzzerUtils.out.println("d2 i29 i30 = " + Double.doubleToLongBits(d2) + "," + i29 + "," + i30);
        FuzzerUtils.out.println("s3 d3 iArr = " + s3 + "," + Double.doubleToLongBits(d3) + "," +
            FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println("fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test0662.instanceCount fFld iFld = " + Test0662.instanceCount + "," +
            Float.floatToIntBits(fFld) + "," + iFld);
        FuzzerUtils.out.println("Test0662.iFld1 Test0662.byFld = " + Test0662.iFld1 + "," + Test0662.byFld);

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("byMeth_check_sum: " + byMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0662 _instance = new Test0662();
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
//DEBUG  byMeth ->  byMeth mainTest
//DEBUG  vMeth ->  vMeth byMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth byMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
