// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:53 2023
public class Test0018 {

    public static final int N = 400;

    public static long instanceCount = -3152727908L;
    public static short sFld = 27450;
    public static int iFld = 57940;

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long dMeth_check_sum = 0;

    public static double dMeth(float f1, int i7) {

        int i8 = -55348;
        int i9 = -52529;
        int i10 = -225;
        int i11 = 36140;
        int i12 = -37270;
        int i13 = 5;
        int[] iArr = new int[N];
        float f2 = 24.952F;
        short s = 1140;
        long l1 = 1239773346L;
        byte by = 63;

        FuzzerUtils.init(iArr, -1);

        for (i8 = 5; 155 > i8; ++i8) {
            Test0018.instanceCount -= i9;
        }
        i9 -= (int) Test0018.instanceCount;
        f1 -= f2;
        i10 = 206;
        while ((i10 -= 3) > 0) {
            s += (short) i10;
            iArr[i10 + 1] <<= i8;
            i7 -= (int) l1;
            for (i11 = 1; i11 < 22; ++i11) {
                i9 += (208 + (i11 * i11));
                i13 = 1;
                while ((i13 += 3) < 2) {
                    Test0018.instanceCount = (long) -1.215F;
                    i7 = (int) f2;
                }
                i9 -= by;
                iArr[i11 - 1] = 57463;
            }
        }
        long meth_res = Float.floatToIntBits(f1) + i7 + i8 + i9 + Float.floatToIntBits(f2) + i10 + s + l1 + i11 + i12 +
                i13 + by + FuzzerUtils.checkSum(iArr);
        dMeth_check_sum += meth_res;
        return (double) meth_res;
    }

    public static int iMeth1(int i5, int i6) {

        double d = 2.115241;
        float f3 = -18.271F;
        boolean b = false;
        int i14 = 4;
        int i15 = -13;
        int i16 = 38589;
        int i17 = -36030;
        int i18 = 0;
        int[] iArr1 = new int[N];
        short s1 = 22055;

        FuzzerUtils.init(iArr1, 3);

        i5 = (int) (2033108869215006216L - Float.intBitsToFloat((int) (d + 7)));
        dMeth(f3, i5);
        i5 = -72;
        b = b;
        i14 = 1;
        while (++i14 < 193) {
            iArr1[i14] += (int) Test0018.instanceCount;
            for (i15 = 1; i15 < 8; i15++) {
                for (i17 = i15; 2 > i17; i17++) {
                    i18 |= s1;
                    i18 >>= -9;
                    i5 += (-162 + (i17 * i17));
                    if (i6 != 0) {
                    }
                }
                i16 += (i15 - i14);
                iArr1[i14] *= (int) 76.574F;
                d -= d;
            }
        }
        long meth_res = i5 + i6 + Double.doubleToLongBits(d) + Float.floatToIntBits(f3) + (b ? 1 : 0) + i14 + i15 + i16
                + i17 + i18 + s1 + FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public static int iMeth(int i2, int i3, int i4) {

        long l = 11L;
        boolean b1 = false;
        int i19 = -38;
        int i20 = 40728;
        int i21 = -253;
        int[] iArr2 = new int[N];
        float f4 = 90.512F;
        double[] dArr = new double[N];

        FuzzerUtils.init(iArr2, -130);
        FuzzerUtils.init(dArr, -53.25678);

        l = 1;
        do {
            iMeth1(i3, i2);
            Test0018.sFld = (short) Test0018.instanceCount;
            if (b1) {
                b1 = b1;
                i3 += (int) (((l * i2) + i3) - l);
                Test0018.instanceCount += l;
            } else if (b1) {
                for (i19 = (int) (l); i19 < 4; i19++) {
                    iArr2[(int) (l + 1)] -= (int) f4;
                    iArr2[(int) (l)] = i2;
                    i4 += (((i19 * Test0018.instanceCount) + i21) - i2);
                    Test0018.instanceCount *= i19;
                    i20 = i19;
                    i21 += (i19 * i19);
                }
                dArr[(int) (l + 1)] = i20;
            } else {
                Test0018.instanceCount -= i3;
            }
        } while (++l < 391);
        long meth_res = i2 + i3 + i4 + l + (b1 ? 1 : 0) + i19 + i20 + Float.floatToIntBits(f4) + i21 +
                FuzzerUtils.checkSum(iArr2) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0018 _instance = new Test0018();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = -3;
        int i1 = -4;
        int i22 = 180;
        int i23 = -201;
        int[] iArr3 = new int[N];
        float f = 2.340F, f5 = 41.217F, f6 = 0.127F;
        long l2 = 52254L;
        double d1 = 0.48996;
        boolean b2 = false;

        FuzzerUtils.init(iArr3, 205);

        for (i = 5; 192 > i; i++) {
            i1 += (-61432 + (i * i));
            i1 += (int) (f - (-iMeth(i, i, i)));
        }
        for (l2 = 4; l2 < 288; l2++) {
            switch ((int) (((l2 % 8) * 5) + 126)) {
                case 157:
                    Test0018.instanceCount *= i22;
                    Test0018.instanceCount = i;
                    if (b2) {
                        d1 = Test0018.sFld;
                    } else {
                        i22 |= i1;
                        i1 = 65;
                        i1 += (int) Test0018.instanceCount;
                    }
                    i1 += i22;
                    break;
                case 136:
                case 165:
                    switch ((int) (((l2 % 2) * 5) + 121)) {
                        case 130:
                            i22 = (int) Test0018.instanceCount;
                            if (b2) continue;
                            f5 = 1;
                            while ((f5 += 2) < 89) {
                                Test0018.instanceCount += i22;
                                i1 = i1;
                                Test0018.instanceCount += (long) (((f5 * i) + i22) - i);
                            }
                            f -= -572;
                        case 131:
                            Test0018.instanceCount = i;
                            i1 -= i22;
                            break;
                        default:
                            i23 = 1;
                            while (++i23 < 89) {
                                Test0018.instanceCount += i23;
                                Test0018.instanceCount -= 3L;
                                if (false) {
                                    f6 = 1;
                                    while (++f6 < 1) {
                                        iArr3 = iArr3;
                                        i22 -= Test0018.iFld;
                                    }
                                }
                            }
                    }
                    break;
                case 154:
                    Test0018.sFld = (short) i;
                    break;
                case 147:
                    f += l2;
                case 150:
                case 133:
                    i1 = (int) 88.331F;
                    break;
                case 139:
                    i22 -= (int) f;
                    break;
            }
        }

        FuzzerUtils.out.println("i i1 f = " + i + "," + i1 + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("l2 i22 d1 = " + l2 + "," + i22 + "," + Double.doubleToLongBits(d1));
        FuzzerUtils.out.println("b2 f5 i23 = " + (b2 ? 1 : 0) + "," + Float.floatToIntBits(f5) + "," + i23);
        FuzzerUtils.out.println("f6 iArr3 = " + Float.floatToIntBits(f6) + "," + FuzzerUtils.checkSum(iArr3));

        FuzzerUtils.out.println("Test0018.instanceCount Test0018.sFld Test0018.iFld = " + Test0018.instanceCount + "," + Test0018.sFld +
                "," + Test0018.iFld);

        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
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
//DEBUG  dMeth ->  dMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
