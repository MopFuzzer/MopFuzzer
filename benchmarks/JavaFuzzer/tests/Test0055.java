// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:54 2023
public class Test0055 {

    public static final int N = 400;

    public static long instanceCount = -1835050312554950727L;
    public static int iFld = 241;
    public static int iFld1 = -34036;
    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public byte byFld = -10;
    public double dFld = -52.78984;

    public static int iMeth() {

        int i11 = -32;
        int i12 = -1;
        int i13 = -50065;
        int i14 = 191;
        int i15 = 7;
        int[] iArr1 = new int[N];
        float f1 = 34.442F;
        float[] fArr = new float[N];

        FuzzerUtils.init(iArr1, -141);
        FuzzerUtils.init(fArr, 0.885F);

        for (i11 = 8; i11 < 160; i11++) {
            iArr1[i11 - 1] = 14;
            for (i13 = i11; i13 < 10; ++i13) {
                i15 = 1;
                while (++i15 < 1) {
                    fArr[i11 + 1] += Test0055.iFld;
                    i14 = 244;
                    i14 += (i15 * i15);
                    Test0055.iFld = 14145;
                    Test0055.iFld += i12;
                    Test0055.iFld += (-5 + (i15 * i15));
                }
                f1 = Test0055.iFld;
                Test0055.iFld = Test0055.iFld;
                Test0055.iFld = i12;
                i12 += (int) (11L + (i13 * i13));
                Test0055.instanceCount = Test0055.instanceCount;
            }
        }
        long meth_res = i11 + i12 + i13 + i14 + i15 + Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr1) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth() {

        int i5 = -9, i6 = 1, i7 = 124, i8 = -223, i9 = -21190, i10 = -218;
        byte by = 97;
        float f = 0.828F;
        long l = 7268749111802473615L, l1 = 3L;
        short s1 = 16295;
        double d = 124.121195;
        boolean b = true;

        for (i5 = 1; i5 < 303; i5++) {
            for (i7 = i5; i7 < 5; ++i7) {
                i9 = 1;
                do {
                    Test0055.instanceCount = (long) (((i5 - -60622) - (by + i6)) + ((Test0055.iFld--) - (f++)));
                    i8 += (int) (1.133F + (i9 * i9));
                    f += (((i9 * i9) + i10) - i7);
                    Test0055.iFld += i9;
                    Test0055.instanceCount >>>= iMeth();
                    Test0055.iFld += (((i9 * i10) + i8) - i7);
                    switch (((i9 % 10) * 5) + 81) {
                        case 92:
                            i8 = i9;
                            i8 = (int) l;
                            break;
                        case 107:
                            i6 += (((i9 * Test0055.iFld) + Test0055.iFld) - l);
                            s1 += (short) (i9 - i5);
                            Test0055.iFld *= (int) d;
                        case 93:
                            l1 = i10;
                        case 118:
                            f -= l;
                            break;
                        case 98:
                            i10 = Test0055.iFld;
                            break;
                        case 116:
                            if (b) break;
                            break;
                        case 87:
                            Test0055.instanceCount = i6;
                            break;
                        case 113:
                            b = false;
                            break;
                        case 122:
                            d *= -38;
                        case 119:
                            l *= l1;
                            break;
                        default:
                            Test0055.iFld >>= i7;
                    }
                } while (++i9 < 1);
            }
        }
        vMeth_check_sum += i5 + i6 + i7 + i8 + i9 + by + Float.floatToIntBits(f) + i10 + l + s1 +
                Double.doubleToLongBits(d) + l1 + (b ? 1 : 0);
    }

    public static float fMeth(short s, int i1, int i2) {

        int i3 = -60880, i4 = -243, i16 = -49951;
        byte by1 = 31;
        float f2 = -1.583F;

        for (i3 = 274; i3 > 7; i3--) {
            vMeth();
            i2 += i4;
            i2 = 10;
            i4 += (0 + (i3 * i3));
        }
        i16 = 1;
        do {
            boolean b1 = false;
            i2 *= i1;
            Test0055.iFld >>= i2;
            Test0055.iFld1 *= i4;
            if (b1) {
                switch ((i16 % 3) + 72) {
                    case 72:
                        Test0055.instanceCount = by1;
                        Test0055.instanceCount += (((i16 * i3) + f2) - f2);
                        f2 += (((i16 * i16) + Test0055.iFld) - i16);
                        s >>>= (short) i3;
                        break;
                    case 73:
                        i2 += (i16 ^ (long) f2);
                        break;
                    case 74:
                        f2 -= i3;
                        break;
                }
            }
        } while ((i16 += 3) < 198);
        long meth_res = s + i1 + i2 + i3 + i4 + i16 + by1 + Float.floatToIntBits(f2);
        fMeth_check_sum += meth_res;
        return (float) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0055 _instance = new Test0055();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = -2;
        int i17 = -5;
        int i18 = 7;
        int i19 = 2;
        int i21 = 11790;
        int i22 = 22342;
        int i23 = -139;
        int i24 = 13837;
        int i25 = -30039;
        int i26 = -58519;
        int i27 = 52754;
        int i28 = 63;
        int i29 = -3;
        int i30 = 49449;
        int i31 = -9;
        int i32 = -132;
        int[] iArr = new int[N];
        short s2 = 236;
        float[] fArr1 = new float[N];

        FuzzerUtils.init(iArr, 9081);
        FuzzerUtils.init(fArr1, 2.438F);

        i = 1;
        do {
            Test0055.iFld = (iArr[i]++);
            fMeth(s2, -24358, Test0055.iFld1);
            Test0055.iFld += i;
        } while ((i += 3) < 223);
        Test0055.instanceCount = 9;
        i17 = i17;
        for (i18 = 19; i18 < 317; i18++) {
            i17 += Test0055.iFld1;
            Test0055.instanceCount >>= i17;
            for (i21 = 3; i21 < 84; i21++) {
                for (i23 = 2; i23 > 1; i23 -= 2) {
                    i22 %= (int) (i22 | 1);
                }
                Test0055.instanceCount = Test0055.iFld1;
                Test0055.instanceCount += -19516;
            }
            Test0055.instanceCount >>= i21;
        }
        for (i25 = 11; i25 < 212; ++i25) {
            Test0055.instanceCount &= 54942L;
            switch ((i25 % 4) + 50) {
                case 50:
                    i19 >>>= i19;
                    iArr[i25] = byFld;
                    for (i27 = 125; 2 < i27; --i27) {
                        for (i29 = 1; 2 > i29; ++i29) {
                            Test0055.instanceCount &= -179L;
                            Test0055.instanceCount += (-154L + (i29 * i29));
                        }
                        switch (((i27 % 9) * 5) + 23) {
                            case 44:
                                fArr1 = FuzzerUtils.float1array(N, (float) 90.940F);
                                for (i31 = 1; 2 > i31; i31++) {
                                    Test0055.iFld += (int) (-55.134F + (i31 * i31));
                                }
                                Test0055.instanceCount = i21;
                                i24 += i27;
                            case 61:
                                iArr[i27] = i18;
                                break;
                            case 40:
                                byFld -= (byte) Test0055.iFld1;
                                break;
                            case 38:
                                i32 -= -10495;
                                break;
                            case 57:
                                iArr = FuzzerUtils.int1array(N, (int) -40769);
                            case 36:
                            case 28:
                                i24 += (i27 * i27);
                                break;
                            case 30:
                                i26 = (int) 1.13523;
                                break;
                            case 32:
                                iArr[i27 + 1] = i19;
                        }
                    }
                    break;
                case 51:
                    i17 = i;
                    break;
                case 52:
                    dFld -= -54719;
                    break;
                case 53:
                    byFld += (byte) (i25 * i25);
                    break;
            }
        }

        FuzzerUtils.out.println("i s2 i17 = " + i + "," + s2 + "," + i17);
        FuzzerUtils.out.println("i18 i19 i21 = " + i18 + "," + i19 + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("i28 i29 i30 = " + i28 + "," + i29 + "," + i30);
        FuzzerUtils.out.println("i31 i32 iArr = " + i31 + "," + i32 + "," + FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println("fArr1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));

        FuzzerUtils.out.println("Test0055.instanceCount Test0055.iFld Test0055.iFld1 = " + Test0055.instanceCount + "," + Test0055.iFld +
                "," + Test0055.iFld1);
        FuzzerUtils.out.println("byFld dFld = " + byFld + "," + Double.doubleToLongBits(dFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
