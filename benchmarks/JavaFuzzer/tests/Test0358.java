// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:02 2023
public class Test0358 {

    public static final int N = 400;

    public static long instanceCount = 5L;
    public static double dFld = 118.70460;
    public static volatile byte byFld = -84;

    public static long bMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i3, short s1) {

        float f = -87.576F;
        int i4 = -4;
        int i5 = -12;
        int i6 = -155;
        int i7 = -42127;
        int[] iArr = new int[N];
        boolean b2 = true;

        FuzzerUtils.init(iArr, 4205);

        iArr[(-7 >>> 1) % N] -= (int) f;
        i4 = 220;
        while (--i4 > 0) {
            for (i5 = 1; i5 < 7; i5 += 3) {
                float f1 = 21.276F;
                if (true) {
                    i6 *= i4;
                    i6 = i5;
                    switch ((i4 % 9) + 29) {
                        case 29:
                            i7 = 1;
                            do {
                                i3 >>= 168;
                                b2 = b2;
                                i3 = i7;
                                f += (float) Test0358.dFld;
                                Test0358.byFld = (byte) 13L;
                                iArr[i5 + 1] -= (int) f;
                                iArr[i7 + 1] = (int) 47691L;
                            } while (++i7 < 4);
                        case 30:
                            i6 -= (int) 117L;
                            break;
                        case 31:
                        case 32:
                        case 33:
                            iArr[i4 - 1] += (int) Test0358.instanceCount;
                            break;
                        case 34:
                            iArr[i4] = (int) Test0358.instanceCount;
                            break;
                        case 35:
                            Test0358.byFld += (byte) f;
                            break;
                        case 36:
                            i6 *= -3;
                            break;
                        case 37:
                            Test0358.dFld *= f1;
                            break;
                    }
                }
            }
        }
        long meth_res = i3 + s1 + Float.floatToIntBits(f) + i4 + i5 + i6 + i7 + (b2 ? 1 : 0) +
                FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public static void vMeth(int i2, boolean b1) {

        short s2 = -17995;
        float f2 = -2.562F;

        i2 &= (int) lMeth(i2, s2);
        f2 = i2;
        f2 *= i2;
        vMeth_check_sum += i2 + (b1 ? 1 : 0) + s2 + Float.floatToIntBits(f2);
    }

    public static boolean bMeth(int i1) {

        boolean b3 = true;
        int i8 = -5;
        int i9 = -69;
        int i10 = -21;
        int i11 = 9;
        int i12 = 154;
        int i13 = -138;
        int[] iArr1 = new int[N];
        float f3 = 0.460F;
        short s3 = -31256;

        FuzzerUtils.init(iArr1, 4);

        vMeth(28105, b3);
        i8 = 1;
        while (++i8 < 197) {
            for (i9 = 1; i9 < 8; i9++) {
                Test0358.instanceCount %= ((long) (f3) | 1);
                i10 += (-49686 + (i9 * i9));
                if (i8 != 0) {
                    return ((int) (i1 + (b3 ? 1 : 0) + i8 + i9 + i10 + Float.floatToIntBits(f3) + i11 + i12 + s3 + i13 +
                            FuzzerUtils.checkSum(iArr1))) % 2 > 0;
                }
                iArr1[i9 + 1] += (int) Test0358.instanceCount;
                for (i11 = 1; i11 < 2; ++i11) {
                    i12 += i8;
                    iArr1[i11 + 1] = i12;
                    i10 += (i11 + f3);
                    Test0358.instanceCount -= i12;
                    s3 -= Test0358.byFld;
                    i12 -= i12;
                    i13 -= (int) -214L;
                }
            }
        }
        long meth_res = i1 + (b3 ? 1 : 0) + i8 + i9 + i10 + Float.floatToIntBits(f3) + i11 + i12 + s3 + i13 +
                FuzzerUtils.checkSum(iArr1);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static void main(String[] strArr) {

        try {
            Test0358 _instance = new Test0358();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        boolean b = false;
        boolean[] bArr = new boolean[N];
        double d = 2.77816;
        double d1 = 0.102566;
        double[] dArr = new double[N];
        int i = 203;
        int i14 = -441;
        int i15 = 6;
        int i16 = 1;
        int i17 = -64500;
        int i19 = 87;
        int i20 = -250;
        int i21 = 0;
        int i22 = 1;
        int i23 = 23131;
        int i24 = -10;
        int i25 = 51716;
        int[] iArr2 = new int[N];
        short s = 29688;
        float f4 = 61.470F;
        long[] lArr = new long[N];

        FuzzerUtils.init(iArr2, -3);
        FuzzerUtils.init(lArr, -112L);
        FuzzerUtils.init(dArr, -81.94393);
        FuzzerUtils.init(bArr, false);

        b = ((d != (i - s)) || (bMeth(i) && b));
        for (i14 = 316; i14 > 8; --i14) {
            i |= (int) Test0358.instanceCount;
            for (i16 = 3; 82 > i16; ++i16) {
                iArr2[i14] <<= i;
            }
            i *= s;
            switch ((((i >>> 1) % 2) * 5) + 45) {
                case 48:
                    iArr2[i14 - 1] = (int) Test0358.instanceCount;
                    break;
                case 54:
                    iArr2[i14 - 1] = i16;
                    f4 *= Test0358.instanceCount;
                    i += (((i14 * Test0358.instanceCount) + Test0358.instanceCount) - f4);
                    i17 *= (int) 2.114F;
                default:
                    try {
                        i15 = (-233 / i16);
                        iArr2[i14 - 1] = (i16 / -161);
                        i15 = (i17 % 55323);
                    } catch (ArithmeticException a_e) {
                    }
                    Test0358.instanceCount = s;
                    for (i19 = 1; 82 > i19; i19++) {
                        for (d1 = i14; d1 < 2; d1++) {
                            try {
                                i20 = (iArr2[i14] % -1632569612);
                                i21 = (iArr2[i14] % 216);
                                i21 = (iArr2[(int) (d1)] / i17);
                            } catch (ArithmeticException a_e) {
                            }
                            i20 &= i16;
                        }
                        i22 = 1;
                        while (++i22 < 2) {
                            Test0358.byFld -= (byte) i19;
                            i15 = (int) -164072259L;
                            i23 = (int) Test0358.instanceCount;
                            lArr[i14 - 1] -= Test0358.instanceCount;
                        }
                        for (i24 = 1; i24 < 2; i24++) {
                            dArr[i19 + 1] += -58436;
                            Test0358.instanceCount ^= i19;
                            i15 = i14;
                            i17 = i14;
                        }
                        iArr2[(-44967 >>> 1) % N] = (int) Test0358.instanceCount;
                        bArr[i14] = b;
                    }
            }
        }

        FuzzerUtils.out.println("b d i = " + (b ? 1 : 0) + "," + Double.doubleToLongBits(d) + "," + i);
        FuzzerUtils.out.println("s i14 i15 = " + s + "," + i14 + "," + i15);
        FuzzerUtils.out.println("i16 i17 f4 = " + i16 + "," + i17 + "," + Float.floatToIntBits(f4));
        FuzzerUtils.out.println("i19 i20 d1 = " + i19 + "," + i20 + "," + Double.doubleToLongBits(d1));
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 iArr2 = " + i24 + "," + i25 + "," + FuzzerUtils.checkSum(iArr2));
        FuzzerUtils.out.println("lArr dArr bArr = " + FuzzerUtils.checkSum(lArr) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + "," + FuzzerUtils.checkSum(bArr));

        FuzzerUtils.out.println("Test0358.instanceCount Test0358.dFld Test0358.byFld = " + Test0358.instanceCount + "," +
                Double.doubleToLongBits(Test0358.dFld) + "," + Test0358.byFld);

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  bMeth ->  bMeth mainTest
//DEBUG  vMeth ->  vMeth bMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth bMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
