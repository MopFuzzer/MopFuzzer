// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:16 2023
public class Test0915 {

    public static final int N = 400;

    public static volatile long instanceCount = -2272869688817314823L;
    public static short sFld = -30743;
    public static long lFld = 14L;
    public static float fFld = 83.308F;
    public static double dFld = -1.35029;
    public static short[] sArrFld = new short[N];
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0915.sArrFld, (short) -9069);
    }

    public static long lMeth(int i10, int i11) {

        int i12 = 3, i13 = -1, i14 = 48, i15 = -181, i16 = 36354, i17 = 10705;
        float f = -23.174F;
        boolean b = true;

        i10 = -98;
        for (i12 = 15; 270 > i12; ++i12) {
            i10 += i13;
            f += (i12 * i12);
            i10 = i11;
            for (i14 = i12; i14 < 6; i14 += 2) {
                i13 += i14;
                Test0915.instanceCount >>>= -28844;
                for (i16 = 1; 1 > i16; i16++) {
                    Test0915.instanceCount += i16;
                    switch (((i16 % 1) * 5) + 43) {
                        case 44:
                            Test0915.instanceCount *= i11;
                            break;
                        default:
                            if (b) break;
                            Test0915.sFld <<= (short) i10;
                            i10 |= i12;
                    }
                }
            }
        }
        long meth_res = i10 + i11 + i12 + i13 + Float.floatToIntBits(f) + i14 + i15 + i16 + i17 + (b ? 1 : 0);
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public static int iMeth1(short s, int i7, int i8) {

        int i18 = -17086;
        int i19 = -29158;
        int i20 = 48112;
        int i21 = 3;
        int i22 = -1;
        int i23 = -133;
        int i24 = 50695;
        int[] iArr1 = new int[N];
        float f1 = 46.725F;

        FuzzerUtils.init(iArr1, 63882);

        for (int i9 : iArr1) {
            i8 -= (int) ((lMeth(i9, i9) + 10498L) - i7);
            for (i18 = 1; i18 < 4; ++i18) {
                iArr1[i18 + 1] = (int) Test0915.instanceCount;
            }
            for (i20 = 1; i20 < 4; ++i20) {
                Test0915.instanceCount += (((i20 * f1) + i18) - i7);
                Test0915.instanceCount = i21;
                i7 = (int) Test0915.instanceCount;
            }
            iArr1[(i19 >>> 1) % N] &= i22;
            i19 += i20;
            i19 -= (int) Test0915.instanceCount;
            for (i23 = 1; i23 < 4; ++i23) {
                Test0915.sArrFld = Test0915.sArrFld;
                i22 <<= 139;
                i7 += (214 + (i23 * i23));
            }
        }
        long meth_res = s + i7 + i8 + i18 + i19 + i20 + i21 + Float.floatToIntBits(f1) + i22 + i23 + i24 +
                FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public static int iMeth(int i3, long l) {

        int i4 = -47119;
        int i5 = -1;
        int i6 = -56467;
        int i25 = 34260;
        int i26 = 16673;
        int i27 = 42;
        int[] iArr = new int[N];
        double d = 93.99751;

        FuzzerUtils.init(iArr, 27790);

        for (i4 = 17; i4 < 274; ++i4) {
            i6 = 1;
            while (++i6 < 6) {
                boolean b1 = false;
                switch ((i4 % 9) + 60) {
                    case 60:
                        d += ((iArr[i4 + 1]++) % ((iMeth1((short) (-31300), i4, i5) & Test0915.lFld) | 1));
                        i25 = 1;
                        while (++i25 < 1) {
                            i5 /= (int) (i5 | 1);
                            Test0915.fFld += (-3027258337L + (i25 * i25));
                            d += i5;
                            i5 = 216;
                        }
                        break;
                    case 61:
                        b1 = b1;
                        for (i26 = 1; i26 < 1; i26++) {
                            i3 -= (int) Test0915.fFld;
                            iArr[i26 + 1] = i5;
                            i27 = i6;
                            l += i26;
                        }
                        break;
                    case 62:
                    case 63:
                        i3 *= i4;
                        break;
                    case 64:
                        i27 >>= (int) Test0915.instanceCount;
                    case 65:
                        Test0915.fFld *= l;
                    case 66:
                        Test0915.sFld += (short) (i6 | i3);
                        break;
                    case 67:
                        i5 = (int) Test0915.instanceCount;
                        break;
                    case 68:
                        if (b1) break;
                    default:
                        i3 -= i27;
                }
            }
        }
        long meth_res = i3 + l + i4 + i5 + i6 + Double.doubleToLongBits(d) + i25 + i26 + i27 +
                FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0915 _instance = new Test0915();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = 59919;
        int i1 = -12;
        int i2 = 207;
        int i28 = -6;
        int i29 = 126;
        int i30 = 68;
        int i31 = -8;
        int i32 = 1;
        int[] iArr2 = new int[N];
        boolean b2 = true;

        FuzzerUtils.init(iArr2, 5);

        for (i = 10; i < 201; ++i) {
            i1 += (i ^ Test0915.instanceCount);
            i2 = 1;
            while (++i2 < 131) {
                i1 = ((i2 - (i2 + i1)) + ((i2 + i1) - iMeth(i1, Test0915.instanceCount)));
                Test0915.fFld += (float) Test0915.dFld;
                for (i28 = 1; 1 > i28; ++i28) {
                    try {
                        i29 = (iArr2[i] % i29);
                        iArr2[i2 - 1] = (76 / iArr2[i28]);
                        i1 = (i29 % i2);
                    } catch (ArithmeticException a_e) {
                    }
                    i29 = -25660;
                    i1 = (int) Test0915.lFld;
                    iArr2[i28 - 1] -= (int) Test0915.dFld;
                    iArr2[i28 - 1] += 0;
                    iArr2[i + 1] = i28;
                    i29 += 27176;
                    if (b2) continue;
                    i1 += 10;
                }
            }
            Test0915.lFld += (i - i28);
            if (b2) {
                i30 = 1;
                do {
                    if (true) continue;
                    i29 += (i30 - i28);
                    for (i31 = i30; 1 > i31; ++i31) {
                        i29 -= i32;
                        Test0915.dFld = i29;
                        i1 += i31;
                        Test0915.lFld = Test0915.sFld;
                        i32 += (i31 * i31);
                        i32 |= (int) Test0915.instanceCount;
                        Test0915.fFld = 60499L;
                    }
                    i29 *= i28;
                } while (++i30 < 131);
            }
        }
        i1 = (int) Test0915.instanceCount;

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i28 i29 b2 = " + i28 + "," + i29 + "," + (b2 ? 1 : 0));
        FuzzerUtils.out.println("i30 i31 i32 = " + i30 + "," + i31 + "," + i32);
        FuzzerUtils.out.println("iArr2 = " + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test0915.instanceCount Test0915.sFld Test0915.lFld = " + Test0915.instanceCount + "," + Test0915.sFld +
                "," + Test0915.lFld);
        FuzzerUtils.out.println("Test0915.fFld Test0915.dFld Test0915.sArrFld = " + Float.floatToIntBits(Test0915.fFld) + "," +
                Double.doubleToLongBits(Test0915.dFld) + "," + FuzzerUtils.checkSum(Test0915.sArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  lMeth ->  lMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}