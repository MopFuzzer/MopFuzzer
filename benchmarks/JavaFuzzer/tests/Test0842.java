// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:14 2023
public class Test0842 {

    public static final int N = 400;

    public static long instanceCount = 104L;
    public static int iFld = 0;
    public static byte byFld = -5;
    public static short sFld = 5653;
    public static volatile boolean[] bArrFld = new boolean[N];
    public static volatile short[] sArrFld = new short[N];
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0842.bArrFld, true);
        FuzzerUtils.init(Test0842.sArrFld, (short) 5106);
    }

    public double dFld = 2.16415;

    public static int iMeth1(int i10, int i11) {

        double d1 = 59.64613;
        float f2 = -2.867F;
        int i12 = -63362;
        int i13 = -2;
        int i14 = 57327;
        int[][] iArr2 = new int[N][N];

        FuzzerUtils.init(iArr2, 138);

        d1 = 1;
        do {
            Test0842.instanceCount += (long) (((d1 * Test0842.iFld) + i10) - Test0842.instanceCount);
            iArr2[(int) (d1 - 1)][(i11 >>> 1) % N] += i11;
            i10 += (int) (((d1 * i10) + i11) - f2);
            i11 += (int) d1;
            i12 = 8;
            while (--i12 > 0) {
                i11 = i10;
                for (i13 = 1; i13 > 1; i13 -= 3) {
                    iArr2[(int) (d1 - 1)] = iArr2[(int) (d1 + 1)];
                    Test0842.iFld *= (int) 81.824F;
                    i11 += (i13 * i12);
                }
                iArr2[i12 - 1][(int) (d1)] <<= (int) Test0842.instanceCount;
                i11 += (i12 - Test0842.instanceCount);
            }
            i11 = i14;
            i11 = (int) Test0842.instanceCount;
        } while (++d1 < 205);
        long meth_res = i10 + i11 + Double.doubleToLongBits(d1) + Float.floatToIntBits(f2) + i12 + i13 + i14 +
                FuzzerUtils.checkSum(iArr2);
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth(double d, int i8, int i9) {

        float f1 = 0.470F;
        float[] fArr = new float[N];
        int i15 = 6;
        int i16 = 0;
        int i17 = 11;
        int i18 = -3;
        int i19 = 12969;
        int i20 = 9;
        int[] iArr3 = new int[N];
        byte by = 9;

        FuzzerUtils.init(fArr, -2.1001F);
        FuzzerUtils.init(iArr3, -9);

        f1 += (iMeth1(Test0842.iFld, i8) + Test0842.instanceCount);
        for (i15 = 1; i15 < 375; ++i15) {
            d -= -7;
            Test0842.instanceCount <<= Test0842.iFld;
            fArr[i15 + 1] = Test0842.instanceCount;
            iArr3[i15 - 1] -= i16;
            iArr3[i15] &= (int) Test0842.instanceCount;
            i9 /= (int) (by | 1);
        }
        i16 -= Test0842.iFld;
        for (i17 = 9; i17 < 164; ++i17) {
            i18 = (int) Test0842.instanceCount;
            for (i19 = 1; i19 < 10; ++i19) {
                i8 >>>= i17;
                i9 %= (int) ((long) (d) | 1);
                Test0842.instanceCount -= i19;
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + i8 + i9 + Float.floatToIntBits(f1) + i15 + i16 + by + i17 + i18
                + i19 + i20 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr3);
    }

    public static int iMeth(boolean b1) {

        int i6 = -22196;
        int i7 = -13;
        int i21 = 0;
        int i22 = -14;
        int i23 = -45393;
        int i24 = -14;
        int[] iArr4 = new int[N];
        double d2 = 1.36653;
        float f3 = 2.764F;
        long l = 332610223L;
        long[] lArr1 = new long[N];

        FuzzerUtils.init(lArr1, -1084227829412244800L);
        FuzzerUtils.init(iArr4, -12);

        for (i6 = 17; i6 < 306; i6++) {
            vMeth(d2, i6, i7);
            lArr1[i6 - 1] -= -46182L;
            i21 = 1;
            while (++i21 < 6) {
                switch ((((-110 >>> 1) % 8) * 5) + 119) {
                    case 124:
                        switch ((i6 % 5) + 26) {
                            case 26:
                                f3 *= Test0842.instanceCount;
                                i22 = 1;
                                while (--i22 > 0) {
                                    Test0842.iFld = i21;
                                    Test0842.instanceCount = Test0842.instanceCount;
                                    i7 = 62;
                                }
                                for (i23 = 1; 1 > i23; i23 += 2) {
                                    if (i21 != 0) {
                                    }
                                    Test0842.sArrFld[i21] += (short) Test0842.iFld;
                                    i7 += -142;
                                }
                                break;
                            case 27:
                            case 28:
                                b1 = b1;
                                break;
                            case 29:
                                d2 = d2;
                                break;
                            case 30:
                            default:
                                Test0842.byFld >>= (byte) i23;
                        }
                        break;
                    case 121:
                        iArr4[i21] -= i23;
                    case 135:
                        Test0842.iFld -= -228;
                        break;
                    case 149:
                        Test0842.instanceCount = (long) 81.100421;
                        break;
                    case 156:
                        iArr4[i6 - 1] -= i7;
                        break;
                    case 130:
                        i7 += (((i21 * f3) + Test0842.iFld) - i21);
                        break;
                    case 122:
                        if (b1) break;
                        break;
                    case 126:
                        i24 /= (int) (i21 | 1);
                        break;
                    default:
                        Test0842.instanceCount -= l;
                }
            }
        }
        long meth_res = (b1 ? 1 : 0) + i6 + i7 + Double.doubleToLongBits(d2) + i21 + Float.floatToIntBits(f3) + i22 +
                i23 + i24 + l + FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr4);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0842 _instance = new Test0842();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = 234;
        int i1 = -65030;
        int i2 = 30827;
        int i3 = -107;
        int i4 = 4727;
        int i5 = -19787;
        int i25 = -59968;
        int i26 = -35813;
        int[] iArr = new int[N];
        int[] iArr1 = new int[N];
        float f = 115.840F;
        boolean b = false;
        long[] lArr = new long[N];
        byte[] byArr = new byte[N];

        FuzzerUtils.init(iArr, -4);
        FuzzerUtils.init(lArr, 64L);
        FuzzerUtils.init(iArr1, -146);
        FuzzerUtils.init(byArr, (byte) 43);

        for (i = 363; i > 15; i--) {
            for (i2 = 1; i2 < 72; i2++) {
                iArr[i2 - 1] = Math.max(1, (int) (186 - (Test0842.instanceCount - i2)));
                i1 = (int) (((i3 + 46L) - (lArr[i2 + 1] >>= Test0842.instanceCount)) - (--i3));
                for (i4 = i; i4 < 2; ++i4) {
                    Test0842.instanceCount += (i5--);
                    if (((i3 + (i3 + i3)) != Math.abs((long) (f + i4))) || b) break;
                    if (b) {
                        i3 <<= (i5--);
                        i5 = (int) (((--i1) / (iArr1[i + 1] | 1)) * ((i3++) << (Test0842.instanceCount - i4)));
                    } else if (b) {
                        try {
                            i5 = (Test0842.iFld / -2143672514);
                            i1 = (-1027497379 % i5);
                            Test0842.iFld = (i1 / i4);
                        } catch (ArithmeticException a_e) {
                        }
                        Test0842.bArrFld[i - 1] = (((-(i1++)) - 1.308F) == iMeth(b));
                        Test0842.sFld = (short) Test0842.instanceCount;
                    } else if (b) {
                        switch ((i4 % 1) + 9) {
                            case 9:
                                Test0842.instanceCount = 56217;
                                i1 += (int) f;
                                Test0842.iFld = Test0842.sFld;
                                Test0842.iFld = Test0842.iFld;
                                break;
                            default:
                                i3 *= i2;
                                i1 = i4;
                                Test0842.instanceCount += (((i4 * i3) + Test0842.instanceCount) - Test0842.iFld);
                        }
                    } else {
                        i5 = Test0842.iFld;
                        iArr[i] >>= i;
                        Test0842.bArrFld[i2 - 1] = b;
                        switch ((((i1 >>> 1) % 8) * 5) + 60) {
                            case 100:
                                byArr[i2 - 1] += (byte) dFld;
                            case 86:
                                switch ((i4 % 8) + 45) {
                                    case 45:
                                        i5 += (int) Test0842.instanceCount;
                                        Test0842.sFld *= (short) Test0842.iFld;
                                        Test0842.instanceCount += i4;
                                        break;
                                    case 46:
                                        i3 -= (int) f;
                                        break;
                                    case 47:
                                        try {
                                            i25 = (11063 / iArr1[i4 - 1]);
                                            i5 = (i5 % 1682860319);
                                            Test0842.iFld = (76 / i3);
                                        } catch (ArithmeticException a_e) {
                                        }
                                    case 48:
                                        i3 += i3;
                                    case 49:
                                        iArr1[i4] /= (int) (i26 | 1);
                                        break;
                                    case 50:
                                        Test0842.instanceCount &= Test0842.instanceCount;
                                        break;
                                    case 51:
                                        iArr[i4 + 1] = i25;
                                    case 52:
                                        Test0842.instanceCount = Test0842.byFld;
                                        break;
                                    default:
                                        i25 += (int) Test0842.instanceCount;
                                }
                            case 77:
                                i5 += (int) Test0842.instanceCount;
                                break;
                            case 83:
                                Test0842.iFld -= i2;
                                break;
                            case 79:
                                f += -26716;
                                break;
                            case 81:
                            case 66:
                                lArr[i] -= (long) f;
                                break;
                            case 91:
                                Test0842.instanceCount = 9;
                                break;
                            default:
                                if (b) continue;
                        }
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i4 i5 = " + i3 + "," + i4 + "," + i5);
        FuzzerUtils.out.println("f b i25 = " + Float.floatToIntBits(f) + "," + (b ? 1 : 0) + "," + i25);
        FuzzerUtils.out.println("i26 iArr lArr = " + i26 + "," + FuzzerUtils.checkSum(iArr) + "," +
                FuzzerUtils.checkSum(lArr));
        FuzzerUtils.out.println("iArr1 byArr = " + FuzzerUtils.checkSum(iArr1) + "," + FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test0842.instanceCount Test0842.iFld Test0842.byFld = " + Test0842.instanceCount + "," + Test0842.iFld +
                "," + Test0842.byFld);
        FuzzerUtils.out.println("Test0842.sFld dFld Test0842.bArrFld = " + Test0842.sFld + "," + Double.doubleToLongBits(dFld) +
                "," + FuzzerUtils.checkSum(Test0842.bArrFld));
        FuzzerUtils.out.println("Test0842.sArrFld = " + FuzzerUtils.checkSum(Test0842.sArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}