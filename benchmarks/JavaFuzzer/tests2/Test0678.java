// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:44 2023
public class Test0678 {

    public static final int N = 400;

    public static long instanceCount=10L;
    public static volatile byte byFld=-28;
    public static short sFld=-6058;
    public static int iFld=175;
    public static float[] fArrFld =new float[N];

    static {
        FuzzerUtils.init(Test0678.fArrFld, -2.564F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(long l, int i5, int i6) {

        short s=-28405;
        byte by=-70, by1=5;
        int i7=-13, i8=129, i9=24667, i10=-73;
        long l1=3851087444L;
        boolean b=true;
        float f1=1.34F;

        i6 <<= s;
        Test0678.instanceCount &= 63936;
        by += (byte)i5;
        for (i7 = 7; i7 < 125; i7 += 2) {
            for (l1 = 1; 26 > l1; l1++) {
                b = b;
                i9 /= (int)(by1 | 1);
                i10 = 1;
                do {
                    i8 += (int)(-3183106298L + (i10 * i10));
                    if (i6 != 0) {
                    }
                    i5 = (int)f1;
                    Test0678.instanceCount -= 235;
                    i9 -= i6;
                    i5 = i10;
                    i6 = 25061;
                } while (++i10 < 2);
            }
        }
        long meth_res = l + i5 + i6 + s + by + i7 + i8 + l1 + i9 + (b ? 1 : 0) + by1 + i10 + Float.floatToIntBits(f1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i2) {

        int i3=-10299;
        int i4=-13912;
        int i11=-14;
        int i12=5;
        int i13=-48718;
        int[] iArr1 =new int[N];
        float f=-123.136F;

        FuzzerUtils.init(iArr1, 52);

        for (i3 = 3; i3 < 288; ++i3) {
            double d=-103.79627;
            if (((Integer.reverseBytes(i3) - i2) - (++i4)) >= Test0678.instanceCount) {
                i2 *= (int) (Test0678.instanceCount | (i2 <<= (int) (d - 3)));
                i4 += (((i3 * i3) + i2) - i3);
            } else {
                Test0678.fArrFld[i3] = (float) (d = ((Test0678.instanceCount + Test0678.instanceCount) - f));
                if (i2 != 0) {
                    vMeth1_check_sum += i2 + i3 + i4 + Float.floatToIntBits(f) + i11 + i12 + i13 +
                        FuzzerUtils.checkSum(iArr1);
                    return;
                }
                i2 *= iMeth(Test0678.instanceCount, i3, i2);
                i2 *= i3;
            }
            iArr1[i3 + 1] >>>= i2;
            for (i11 = 1; i11 < 6; ++i11) {
                Test0678.instanceCount -= i13;
                try {
                    iArr1[i11] = (i4 % i2);
                    i4 = (i3 % -198);
                    i13 = (i12 / i2);
                } catch (ArithmeticException a_e) {}
                i4 += i4;
                i13 += i11;
            }
            iArr1[i3 - 1] = i12;
        }
        vMeth1_check_sum += i2 + i3 + i4 + Float.floatToIntBits(f) + i11 + i12 + i13 + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth() {

        int i1=-92;
        int i14=24;
        int i15=145;
        int i16=28179;
        int i17=161;
        int i18=11891;
        int i19=-5;
        int i20=10;
        int i21=8;
        int i22=42;
        int i23=10;
        int[] iArr2 =new
                    int[N];
        boolean[] bArr =new boolean[N];

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(iArr2, 28092);

        i1 >>= (i1++);
        vMeth1(-1619);
        for (i14 = 10; i14 < 173; i14++) {
            bArr[i14 + 1] = true;
            i1 *= i15;
            Test0678.instanceCount *= i16;
            Test0678.byFld |= (byte) i17;
            for (i18 = i14; i18 < 10; ++i18) {
                for (i20 = 1; i20 < 1; ++i20) {
                    iArr2[i14] = (int)-1.923F;
                }
                i1 += (i18 * i18);
                for (i22 = 1; i22 < 1; i22++) {
                    i21 = i17;
                }
                Test0678.sFld -= (short) i14;
                Test0678.instanceCount += (i18 + i16);
            }
        }
        vMeth_check_sum += i1 + i14 + i15 + i16 + i17 + i18 + i19 + i20 + i21 + i22 + i23 + FuzzerUtils.checkSum(bArr)
            + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i=-34647;
        int i24=-64076;
        int i25=38902;
        int i26=-1;
        int i27=-2;
        int i28=8;
        int i29=50108;
        int i30=-13;
        int i31=19457;
        int i32=-54826;
        int i33=-78;
        int[] iArr =new int[N];
        double d1=-1.65814;
        float f2=115.95F, f3=-92.985F;
        boolean b1=true;
        byte[][] byArr =new byte[N][N];

        FuzzerUtils.init(iArr, 13);
        FuzzerUtils.init(byArr, (byte)-1);

        iArr[(-13 >>> 1) % N] = (i = ((i + i) + byArr[(-14380 >>> 1) % N][(0 >>> 1) % N]));
        vMeth();
        i -= i;
        for (i24 = 271; i24 > 1; i24 -= 2) {
            Test0678.instanceCount += (i24 * i24);
            Test0678.instanceCount += (long) d1;
            for (i26 = 2; i26 < 186; i26++) {
                i28 += (i26 * Test0678.byFld);
                Test0678.byFld *= (byte) i25;
                try {
                    i = (i28 / i27);
                    iArr[i26] = (iArr[i26] % iArr[i24 - 1]);
                    i27 = (-466415542 / iArr[i24 + 1]);
                } catch (ArithmeticException a_e) {}
                i *= (int)d1;
                Test0678.instanceCount += (long) f2;
                Test0678.fArrFld[i24] *= i24;
            }
            i += (((i24 * Test0678.iFld) + i27) - i26);
            iArr[i24 - 1] = (int) Test0678.instanceCount;
        }
        f3 = 1;
        do {
            Test0678.sFld -= (short) -6;
            f2 -= i24;
            f2 = Test0678.byFld;
            i27 %= (int)(i27 | 1);
            switch ((int)((f3 % 6) + 126)) {
            case 126:
                i25 = (int) Test0678.instanceCount;
                iArr[(int) (f3 - 1)] = (int) Test0678.instanceCount;
                break;
            case 127:
                if (b1) {
                    if (b1) break;
                    i -= i27;
                } else if (b1) {
                    for (i29 = 2; i29 < 77; i29++) {
                        for (i31 = 1; i31 < 2; i31++) {
                            i28 = i26;
                            Test0678.instanceCount = i32;
                        }
                    }
                } else if (false) {
                    i30 += (int) ((long) f3 ^ Test0678.sFld);
                } else {
                    Test0678.instanceCount -= Test0678.sFld;
                }
                break;
            case 128:
                i32 = i33;
            case 129:
                i30 = Test0678.byFld;
            case 130:
                Test0678.byFld += (byte) (0.506F + (f3 * f3));
                break;
            case 131:
                i32 += (int)(3128386142565288942L + (f3 * f3));
                break;
            default:
                Test0678.instanceCount += i26;
            }
        } while (++f3 < 326);

        FuzzerUtils.out.println("i i24 i25 = " + i + "," + i24 + "," + i25);
        FuzzerUtils.out.println("d1 i26 i27 = " + Double.doubleToLongBits(d1) + "," + i26 + "," + i27);
        FuzzerUtils.out.println("i28 f2 f3 = " + i28 + "," + Float.floatToIntBits(f2) + "," + Float.floatToIntBits(f3));
        FuzzerUtils.out.println("b1 i29 i30 = " + (b1 ? 1 : 0) + "," + i29 + "," + i30);
        FuzzerUtils.out.println("i31 i32 i33 = " + i31 + "," + i32 + "," + i33);
        FuzzerUtils.out.println("iArr byArr = " + FuzzerUtils.checkSum(iArr) + "," + FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test0678.instanceCount Test0678.byFld Test0678.sFld = " + Test0678.instanceCount + "," + Test0678.byFld +
                "," + Test0678.sFld);
        FuzzerUtils.out.println("Test0678.iFld Test0678.fArrFld = " + Test0678.iFld + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0678.fArrFld)));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0678 _instance = new Test0678();
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
