// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:28 2023
public class Test0352 {

    public static final int N = 400;

    public static long instanceCount=-21625L;
    public byte byFld=-44;
    public static double dFld=-2.37407;
    public static float fFld=73.890F;
    public static short sFld=-1164;
    public float[] fArrFld =new float[N];
    public int[] iArrFld =new int[N];
    public static long[] lArrFld =new long[N];
    public static double[] dArrFld =new double[N];
    public static short[][] sArrFld =new short[N][N];

    static {
        FuzzerUtils.init(Test0352.lArrFld, 2696353013606273763L);
        FuzzerUtils.init(Test0352.dArrFld, -72.80210);
        FuzzerUtils.init(Test0352.sArrFld, (short) 51);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i9, int i10) {

        int i11=-40200;
        int i12=-2;
        int i13=-1;
        int i14=32211;
        int i15=31681;
        int[] iArr =new int[N];
        boolean b1=true;
        boolean[] bArr =new boolean[N];

        FuzzerUtils.init(iArr, -177);
        FuzzerUtils.init(bArr, true);

        for (i11 = 3; i11 < 350; ++i11) {
            for (i13 = 5; i13 > 1; i13 -= 3) {
                int i16=10642;
                i12 = (int) Test0352.instanceCount;
                i9 *= i9;
                i15 = 1;
                while (++i15 < 5) {
                    i14 -= (int)-1397224440L;
                    i9 = i13;
                    try {
                        iArr[i11] = (217854846 % iArr[i15 + 1]);
                        iArr[i13 + 1] = (-12680 / i11);
                        iArr[i11] = (i13 % i14);
                    } catch (ArithmeticException a_e) {}
                }
                Test0352.instanceCount -= (long) Test0352.fFld;
                Test0352.instanceCount += i16;
                bArr[(i11 >>> 1) % N] = b1;
            }
            Test0352.instanceCount >>>= i13;
            Test0352.instanceCount = Test0352.instanceCount;
            i14 = i11;
            Test0352.lArrFld[i11 - 1] += i10;
        }
        vMeth1_check_sum += i9 + i10 + i11 + i12 + i13 + i14 + i15 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(bArr);
    }

    public static void vMeth(int i8) {

        int i17=43808;
        int i18=234;
        int i19=62;
        int i20=-143;
        int[] iArr1 =new int[N];
        byte by=-97;
        boolean b2=false;

        FuzzerUtils.init(iArr1, 135);

        vMeth1(i8, i8);
        for (i17 = 13; 283 > i17; ++i17) {
            iArr1[i17 - 1] -= i18;
            iArr1[i17 + 1] &= (int) Test0352.instanceCount;
            Test0352.instanceCount += (i17 * Test0352.fFld);
            iArr1[i17 - 1] -= (int) Test0352.dFld;
            for (i19 = 1; 6 > i19; i19++) {
                Test0352.dFld = 144;
                i8 = by;
                iArr1 = iArr1;
                i20 -= i19;
                Test0352.fFld -= i8;
            }
            if (b2) break;
            i18 = i20;
        }
        vMeth_check_sum += i8 + i17 + i18 + i19 + i20 + by + (b2 ? 1 : 0) + FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth(long l1, float f) {

        int i6=145;
        int i7=-1;
        int i21=41507;
        int i22=-8;
        int i23=-13487;
        int[] iArr2 =new int[N];
        boolean b=false;

        FuzzerUtils.init(iArr2, 46170);

        for (i6 = 13; i6 < 326; ++i6) {
            if ((b = b) && false) break;
            i7 -= (int)f;
            vMeth(36568);
            i21 = 1;
            do {
                b = b;
                switch (((i6 >>> 1) % 6) + 118) {
                case 118:
                    if (b) break;
                    iArr2[i21 - 1] -= (int) Test0352.instanceCount;
                    for (i22 = 1; i22 < 1; i22++) {
                        i7 -= (int) Test0352.fFld;
                        iArr2[i21 + 1] ^= i7;
                    }
                    break;
                case 119:
                case 120:
                    i7 += i21;
                    i7 = 56528;
                    i23 |= i23;
                    break;
                case 121:
                    l1 <<= i22;
                    break;
                case 122:
                    Test0352.dFld = i21;
                case 123:
                    i7 = Test0352.sFld;
                    break;
                }
            } while (++i21 < 5);
        }
        long meth_res = l1 + Float.floatToIntBits(f) + i6 + i7 + (b ? 1 : 0) + i21 + i22 + i23 +
            FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-167, i1=38769, i2=-36486, i3=3, i4=-246, i5=9;
        long l=-3276436045445639191L;
        boolean b3=false;
        boolean[][] bArr1 =new boolean[N][N];

        FuzzerUtils.init(bArr1, true);

        for (i = 8; i < 137; ++i) {
            fArrFld[i + 1] *= (iArrFld[i + 1]--);
            for (i2 = 10; 194 > i2; ++i2) {
                for (i4 = 1; i4 < 2; i4++) {
                    switch (((i % 2) * 5) + 2) {
                    case 6:
                        Test0352.instanceCount += (i4 * i4);
                        i1 += (int)(Long.reverseBytes(++l) - ((--i5) + (l *= i4)));
                        byFld += (byte)i4;
                    case 3:
                        if (b3) {
                            Test0352.dFld = (i4 - (++i3));
                        } else if (b3) {
                            switch ((i % 6) + 54) {
                            case 54:
                                i5 -= (((i2 + 205) - iMeth(l, Test0352.fFld)) + i2);
                                break;
                            case 55:
                                Test0352.dArrFld[i + 1] = -284288573L;
                                i1 = i2;
                                break;
                            case 56:
                                i3 += -1;
                            case 57:
                                i5 = (int) Test0352.instanceCount;
                                bArr1[i4 - 1][i4] = b3;
                                break;
                            case 58:
                                l -= i2;
                                break;
                            case 59:
                                if (b3) {
                                    Test0352.dFld *= i4;
                                    l += 122;
                                    i1 += -28915;
                                    Test0352.dFld += i;
                                } else {
                                    Test0352.sFld += (short) (i4 + i5);
                                    if (b3) {
                                        switch ((i % 3) + 37) {
                                        case 37:
                                            iArrFld[i4 - 1] += (int)l;
                                            l *= (long) Test0352.dFld;
                                            i3 = 16;
                                            Test0352.sArrFld[(2 >>> 1) % N] = Test0352.sArrFld[i - 1];
                                            break;
                                        case 38:
                                            Test0352.fFld -= i;
                                            break;
                                        case 39:
                                            Test0352.fFld -= i1;
                                            break;
                                        }
                                    }
                                }
                            default:
                                Test0352.fFld = Test0352.fFld;
                            }
                        } else {
                            i5 += i1;
                        }
                        break;
                    default:
                        i1 += (9 + (i4 * i4));
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i4 i5 = " + i3 + "," + i4 + "," + i5);
        FuzzerUtils.out.println("l b3 bArr1 = " + l + "," + (b3 ? 1 : 0) + "," + FuzzerUtils.checkSum(bArr1));

        FuzzerUtils.out.println("Test0352.instanceCount byFld Test0352.dFld = " + Test0352.instanceCount + "," + byFld + "," +
                Double.doubleToLongBits(Test0352.dFld));
        FuzzerUtils.out.println("Test0352.fFld Test0352.sFld fArrFld = " + Float.floatToIntBits(Test0352.fFld) + "," + Test0352.sFld +
            "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));
        FuzzerUtils.out.println("iArrFld Test0352.lArrFld Test0352.dArrFld = " + FuzzerUtils.checkSum(iArrFld) + "," +
                FuzzerUtils.checkSum(Test0352.lArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0352.dArrFld)));
        FuzzerUtils.out.println("Test0352.sArrFld = " + FuzzerUtils.checkSum(Test0352.sArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0352 _instance = new Test0352();
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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}