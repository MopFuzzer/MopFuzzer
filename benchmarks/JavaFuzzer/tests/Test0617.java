// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:08 2023
public class Test0617 {

    public static final int N = 400;

    public static volatile long instanceCount = -7627949825503448137L;
    public static volatile double dFld = 0.19625;
    public static volatile byte byFld = 76;
    public static int[] iArrFld = new int[N];
    public static float[] fArrFld = new float[N];
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0617.iArrFld, 226);
        FuzzerUtils.init(Test0617.fArrFld, 0.231F);
    }

    public int iFld = 11;
    public int iFld1 = 59649;

    public static void vMeth1(int i2) {

        float f2 = 70.105F;
        int i3 = -184, i4 = 202, i5 = 39631, i6 = 6, i7 = -14;
        short s = 8913;
        boolean b = false;
        boolean[] bArr = new boolean[N];
        double d = 1.51274;
        long[] lArr = new long[N];

        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(lArr, -37040L);

        i2 = (int) f2;
        i2 = (int) Test0617.dFld;
        for (i3 = 4; i3 < 267; i3 += 2) {
            i4 ^= (int) 3113546954580558813L;
            s += (short) (i3 * i4);
            if (b) {
                i4 = (int) Test0617.dFld;
            } else {
                for (d = 1; d < 12; ++d) {
                    Test0617.instanceCount -= Test0617.instanceCount;
                    for (i6 = (int) (d); i6 < 2; i6++) {
                        Test0617.instanceCount -= i7;
                        Test0617.dFld -= Test0617.byFld;
                        i4 += (i6 - i3);
                        bArr[(int) (d - 1)] = b;
                    }
                    lArr[i3] >>= s;
                }
                vMeth1_check_sum += i2 + Float.floatToIntBits(f2) + i3 + i4 + s + (b ? 1 : 0) +
                        Double.doubleToLongBits(d) + i5 + i6 + i7 + FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(lArr);
                return;
            }
        }
        vMeth1_check_sum += i2 + Float.floatToIntBits(f2) + i3 + i4 + s + (b ? 1 : 0) + Double.doubleToLongBits(d) + i5
                + i6 + i7 + FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth(float f, float f1, int i1) {

        long l1 = 4158445062L;
        long[] lArr1 = new long[N];
        int i8 = 18, i9 = 27489, i10 = -10, i11 = 16084, i12 = 64765, i13 = -2;
        float f3 = 90.519F;
        short s1 = 19365;

        FuzzerUtils.init(lArr1, -10L);

        vMeth1(i1);
        Test0617.instanceCount -= (long) 125.794F;
        for (l1 = 6; 392 > l1; ++l1) {
            lArr1[(int) (l1 + 1)] += (long) Test0617.dFld;
        }
        for (i9 = 1; i9 < 126; i9++) {
            for (i11 = 1; i11 < 13; ++i11) {
                for (f3 = 1; f3 < 2; f3 += 2) {
                    switch (((i9 % 1) * 5) + 51) {
                        case 56:
                            Test0617.instanceCount = Test0617.instanceCount;
                            i8 -= i8;
                            break;
                    }
                    i10 += (int) f;
                    Test0617.instanceCount = Test0617.instanceCount;
                    Test0617.instanceCount = -189;
                    s1 = (short) l1;
                    try {
                        Test0617.iArrFld[(int) (f3)] = (-416763678 / i13);
                        i10 = (i9 / 30);
                        Test0617.iArrFld[i11] = (i12 / i10);
                    } catch (ArithmeticException a_e) {
                    }
                }
            }
        }
        long meth_res = Float.floatToIntBits(f) + Float.floatToIntBits(f1) + i1 + l1 + i8 + i9 + i10 + i11 + i12 +
                Float.floatToIntBits(f3) + i13 + s1 + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth(long l) {

        int i = 160, i14 = 43805, i16 = 11, i17 = 104, i18 = -2;
        float f4 = -25.884F;
        boolean b1 = true;
        boolean[][] bArr1 = new boolean[N][N];
        short s2 = 2230;
        long l2 = 46123L;
        double d1 = 2.63975;

        FuzzerUtils.init(bArr1, true);

        Test0617.iArrFld[(i >>> 1) % N] = Math.min(iMeth(f4, f4, 54189), i);
        i14 = 1;
        do {
            switch ((i14 * 5) + 70) {
                case 383:
                    Test0617.instanceCount = i14;
                    f4 += (((i14 * i) + l) - i14);
                    i = (int) l;
                    l -= i;
                    break;
                case 364:
                    i *= (int) -15.211F;
                    b1 = b1;
                    Test0617.byFld = (byte) l;
                    break;
                case 157:
                    for (i16 = 1; i16 < 5; i16++) {
                        l += (i16 ^ (long) f4);
                        i18 = 2;
                        while ((i18 -= 3) > 0) {
                            Test0617.instanceCount += i18;
                            Test0617.iArrFld[i16 - 1] *= -8;
                        }
                    }
                    break;
                case 235:
                    i17 += (i14 - Test0617.byFld);
                    break;
                case 233:
                    if (false) break;
                    break;
                case 263:
                    l += i14;
                    break;
                case 137:
                    Test0617.instanceCount &= -40100;
                case 392:
                case 283:
                    if (i != 0) {
                        vMeth_check_sum += l + i + Float.floatToIntBits(f4) + i14 + (b1 ? 1 : 0) + i16 + i17 + i18 + s2 +
                                l2 + Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(bArr1);
                        return;
                    }
                    break;
                case 335:
                    i += -24027;
                    break;
                case 96:
                case 270:
                    Test0617.iArrFld[i14 - 1] = i18;
                    break;
                case 245:
                    l += (((i14 * i18) + i16) - i17);
                case 195:
                    i = (int) Test0617.instanceCount;
                    break;
                case 115:
                    l -= -197L;
                    break;
                case 299:
                    i17 = (int) Test0617.instanceCount;
                    break;
                case 394:
                    i += i14;
                    break;
                case 98:
                    i17 <<= i14;
                    break;
                case 358:
                    i -= 127;
                    break;
                case 226:
                    Test0617.dFld -= f4;
                    break;
                case 272:
                    Test0617.instanceCount = (long) f4;
                    break;
                case 236:
                    f4 += i14;
                    break;
                case 116:
                    i += (((i14 * i) + l) - i18);
                    break;
                case 84:
                    Test0617.iArrFld[i14 + 1] += i14;
                    break;
                case 133:
                    if (b1) continue;
                    break;
                case 305:
                    s2 += (short) i14;
                    break;
                case 348:
                    Test0617.fArrFld[i14 - 1] += s2;
                    break;
                case 225:
                case 75:
                    i += i14;
                    break;
                case 71:
                    i -= i18;
                    break;
                case 407:
                    i = i14;
                    break;
                case 367:
                    s2 = (short) i;
                case 228:
                    i17 += (int) f4;
                    break;
                case 308:
                    Test0617.fArrFld[i14] = l2;
                    break;
                case 404:
                    i *= (int) l2;
                    break;
                case 259:
                    l += i14;
                    break;
                case 210:
                    i17 += i14;
                case 160:
                    Test0617.byFld = (byte) i;
                    break;
                case 249:
                    i = (int) Test0617.instanceCount;
                    break;
                case 81:
                    f4 += i16;
                    break;
                case 203:
                    i = i17;
                    break;
                case 359:
                    i17 += i14;
                    break;
                case 174:
                    i17 >>>= s2;
                    break;
                case 159:
                    l2 -= i14;
                    break;
                case 119:
                    f4 *= l;
                    break;
                case 420:
                    i += (((i14 * i) + Test0617.byFld) - f4);
                    break;
                case 72:
                    s2 = (short) -110.444F;
                case 238:
                    i17 = i16;
                    break;
                case 109:
                case 192:
                    Test0617.iArrFld[i14] += i;
                    break;
                case 148:
                    Test0617.iArrFld[i14 - 1] = (int) l;
                case 130:
                    l2 <<= i18;
                    break;
                case 208:
                case 276:
                    Test0617.iArrFld[i14 + 1] = -177;
                    break;
                case 78:
                    Test0617.instanceCount -= 67;
                    break;
                case 122:
                    Test0617.fArrFld[i14] -= i17;
                    break;
                case 279:
                    i17 -= 225;
                    break;
                case 300:
                    Test0617.fArrFld[i14 + 1] += i16;
                    break;
                case 105:
                    i += (i14 ^ i14);
                case 232:
                    s2 >>= s2;
                    break;
                case 223:
                    i17 -= i16;
                    break;
                case 390:
                    bArr1[i14][i14 - 1] = b1;
                    break;
                case 312:
                    Test0617.instanceCount <<= i14;
                    break;
                case 368:
                    d1 = i18;
                    break;
                case 242:
                    f4 -= Test0617.instanceCount;
                case 177:
                    bArr1[i14 + 1][i14] = b1;
                    break;
                case 87:
                    Test0617.iArrFld[i14 + 1] = Test0617.byFld;
                    break;
                case 94:
                    Test0617.iArrFld[i14 - 1] ^= i16;
                    break;
                case 258:
                    i17 %= (int) (Test0617.instanceCount | 1);
                    break;
                case 243:
                    Test0617.dFld += i17;
                    break;
            }
        } while (++i14 < 324);
        vMeth_check_sum += l + i + Float.floatToIntBits(f4) + i14 + (b1 ? 1 : 0) + i16 + i17 + i18 + s2 + l2 +
                Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(bArr1);
    }

    public static void main(String[] strArr) {

        try {
            Test0617 _instance = new Test0617();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i20 = 145, i21 = -6, i22 = 40, i23 = -1, i24 = 7;
        long l3 = -2001242765874884626L;
        boolean b2 = true;
        short s3 = -26869;
        float f5 = -113.776F;
        double[] dArr = new double[N];

        FuzzerUtils.init(dArr, 47.45699);

        if (b2) {
            vMeth(Test0617.instanceCount);
            iFld >>= (int) Test0617.instanceCount;
            iFld = iFld;
        } else if (b2) {
            i20 = 1;
            do {
                iFld += i20;
                if (b2) {
                    for (i21 = 1; i21 < 191; i21++) {
                        i22 += i22;
                        i22 += (25998 + (i21 * i21));
                        for (l3 = 1; l3 < 2; l3++) {
                            Test0617.dFld *= 9;
                            dArr[i21] = Test0617.instanceCount;
                            i23 += iFld;
                            iFld -= 103;
                            if (b2) break;
                            i23 = (int) Test0617.instanceCount;
                            s3 = (short) -64765;
                            switch ((i21 % 4) + 11) {
                                case 11:
                                    Test0617.iArrFld = Test0617.iArrFld;
                                    i24 = Test0617.byFld;
                                    break;
                                case 12:
                                    i24 += (int) (-117L + (l3 * l3));
                                    f5 = -122.420F;
                                    break;
                                case 13:
                                    Test0617.instanceCount += (l3 * l3);
                                    i24 += iFld;
                                    break;
                                case 14:
                                    i24 = i21;
                            }
                        }
                        iFld1 = i23;
                        i24 += (((i21 * i24) + Test0617.instanceCount) - i24);
                    }
                    iFld -= (int) Test0617.instanceCount;
                    i22 = i24;
                }
            } while (++i20 < 131);
        } else if (b2) {
            i23 *= iFld1;
        } else {
            iFld = i23;
        }

        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("l3 i23 b2 = " + l3 + "," + i23 + "," + (b2 ? 1 : 0));
        FuzzerUtils.out.println("s3 i24 f5 = " + s3 + "," + i24 + "," + Float.floatToIntBits(f5));
        FuzzerUtils.out.println("dArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test0617.instanceCount Test0617.dFld Test0617.byFld = " + Test0617.instanceCount + "," +
                Double.doubleToLongBits(Test0617.dFld) + "," + Test0617.byFld);
        FuzzerUtils.out.println("iFld iFld1 Test0617.iArrFld = " + iFld + "," + iFld1 + "," +
                FuzzerUtils.checkSum(Test0617.iArrFld));
        FuzzerUtils.out.println("Test0617.fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0617.fArrFld)));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
