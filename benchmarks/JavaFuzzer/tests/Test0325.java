// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:01 2023
public class Test0325 {

    public static final int N = 400;

    public static long instanceCount = 2061580011L;

    public static long vMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i7, short s) {

        byte by = 12;
        float f2 = 1.541F;
        int i8 = 28032;
        int i9 = 4;
        int i10 = -43800;
        int i11 = -17200;
        int i12 = 20;
        int i13 = 10;
        int[] iArr1 = new int[N];
        boolean b = true;

        FuzzerUtils.init(iArr1, -203);

        iArr1[(i7 >>> 1) % N] = i7;
        by += (byte) Test0325.instanceCount;
        s -= (short) f2;
        i7 >>= 1;
        s -= (short) i8;
        for (i9 = 13; i9 < 295; ++i9) {
            iArr1[i9] += i9;
            for (i11 = 1; i11 < 6; i11++) {
                Test0325.instanceCount -= Test0325.instanceCount;
                f2 += (i11 * i11);
                i13 = 1;
                while (++i13 < 2) {
                    f2 += -2;
                    i12 &= i7;
                    i12 |= i8;
                    if (b) break;
                }
            }
        }
        vMeth1_check_sum += i7 + s + by + Float.floatToIntBits(f2) + i8 + i9 + i10 + i11 + i12 + i13 + (b ? 1 : 0) +
                FuzzerUtils.checkSum(iArr1);
    }

    public static short sMeth(int i4, long l) {

        int i5 = 8;
        int i6 = -44393;
        int i14 = -10;
        int i15 = -217;
        int i16 = -14;
        int[] iArr2 = new int[N];
        double d = 109.35476;
        float f3 = 0.86F;
        boolean b1 = true;

        FuzzerUtils.init(iArr2, -106);

        i4 /= (int) (i4 | 1);
        for (i5 = 7; i5 < 308; i5++) {
            i4 = (int) (Test0325.instanceCount--);
            i6 += (-116 + (i5 * i5));
            vMeth1(i5, (short) (-19569));
            i14 = 1;
            while (++i14 < 5) {
                i6 = i5;
                iArr2 = iArr2;
                d -= 33152;
                i6 &= (int) l;
                for (i15 = 1; i15 < 1; i15++) {
                    f3 *= l;
                    b1 = b1;
                    i16 -= (int) 1.501F;
                    i6 += (((i15 * i15) + i14) - i5);
                }
            }
        }
        long meth_res = i4 + l + i5 + i6 + i14 + Double.doubleToLongBits(d) + i15 + i16 + Float.floatToIntBits(f3) +
                (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr2);
        sMeth_check_sum += meth_res;
        return (short) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0325 _instance = new Test0325();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void vMeth(int i1, float f1) {

        int i2 = -18;
        int i3 = 201;
        int i17 = -34534;
        int i18 = 2;
        int[] iArr3 = new int[N];
        short s1 = -27202;
        byte by1 = 56;
        boolean b2 = true;

        FuzzerUtils.init(iArr3, 125);

        Test0325.instanceCount = (long) f1;
        for (i2 = 1; i2 < 221; ++i2) {
            Test0325.instanceCount += i2;
            Test0325.instanceCount >>= (sMeth(i1, -119L) ^ i2);
            i3 += (i2 ^ Test0325.instanceCount);
            i1 = s1;
            iArr3[i2] = i1;
        }
        try {
            i3 <<= (int) Test0325.instanceCount;
            for (i17 = 318; 12 < i17; --i17) {
                Test0325.instanceCount = i1;
                if (b2) {
                    Test0325.instanceCount += by1;
                    f1 = i2;
                    Test0325.instanceCount = -81L;
                    vMeth_check_sum += i1 + Float.floatToIntBits(f1) + i2 + i3 + s1 + i17 + i18 + by1 + (b2 ? 1 : 0) +
                            FuzzerUtils.checkSum(iArr3);
                    return;
                } else if (b2) {
                    i3 >>>= i1;
                } else if (b2) {
                    i1 += (((i17 * i17) + i18) - i2);
                } else {
                    Test0325.instanceCount = -8;
                }
            }
        } catch (ArithmeticException exc1) {
            iArr3 = iArr3;
        }
        vMeth_check_sum += i1 + Float.floatToIntBits(f1) + i2 + i3 + s1 + i17 + i18 + by1 + (b2 ? 1 : 0) +
                FuzzerUtils.checkSum(iArr3);
    }

    public void mainTest(String[] strArr1) {

        int i = -12970;
        int i19 = -5;
        int i20 = 0;
        int i21 = -191;
        int i22 = -3;
        int i23 = 7;
        int i24 = -46993;
        int i25 = 221;
        int i26 = 2;
        int[][] iArr = new int[N][N];
        float f = -2.50F;
        float[] fArr = new float[N];
        double d1 = 0.120381, d2 = -101.88726;
        boolean b3 = true;
        short s2 = -7026;
        long l1 = -972691787701740622L;
        byte[] byArr = new byte[N];

        FuzzerUtils.init(byArr, (byte) 101);
        FuzzerUtils.init(iArr, -8);
        FuzzerUtils.init(fArr, 121.155F);

        byArr[(i >>> 1) % N] = (byte) iArr[(-140 >>> 1) % N][(i >>> 1) % N];
        f = (i--);
        switch ((((Math.max(i, 17303) >>> 1) % 8) * 5) + 71) {
            case 108:
                vMeth(i, -87.845F);
                for (d1 = 6; d1 < 126; d1++) {
                    Test0325.instanceCount = -42;
                    if (b3) continue;
                }
                i20 = 1;
                while (++i20 < 357) {
                    i -= 59417;
                    i19 += s2;
                    i += i;
                    iArr[i20] = iArr[i20 + 1];
                    d2 += i20;
                    i19 += i20;
                    for (i21 = 71; i21 > 2; i21--) {
                        Test0325.instanceCount += (((i21 * i19) + i21) - Test0325.instanceCount);
                    }
                    for (i23 = 1; i23 < 71; ++i23) {
                        iArr[i23] = iArr[i23 + 1];
                    }
                    byArr[i20 - 1] = (byte) l1;
                    i = (int) Test0325.instanceCount;
                }
                break;
            case 109:
                l1 = i19;
                for (i25 = 10; i25 < 240; ++i25) {
                    i24 += -3;
                    b3 = b3;
                    i = 0;
                    i24 = 55;
                    l1 += i25;
                    iArr[i25][i25 - 1] >>>= i20;
                    Test0325.instanceCount = i20;
                    l1 += (((i25 * Test0325.instanceCount) + Test0325.instanceCount) - i19);
                }
                break;
            case 88:
                fArr[(24631 >>> 1) % N] *= -138;
                break;
            case 106:
                i += (int) f;
            case 103:
                i22 = i23;
                break;
            case 74:
                Test0325.instanceCount = i22;
                break;
            case 96:
                l1 = i;
                break;
            case 92:
                f = i23;
                break;
        }

        FuzzerUtils.out.println("i f d1 = " + i + "," + Float.floatToIntBits(f) + "," + Double.doubleToLongBits(d1));
        FuzzerUtils.out.println("i19 b3 i20 = " + i19 + "," + (b3 ? 1 : 0) + "," + i20);
        FuzzerUtils.out.println("s2 d2 i21 = " + s2 + "," + Double.doubleToLongBits(d2) + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("l1 i25 i26 = " + l1 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("byArr iArr fArr = " + FuzzerUtils.checkSum(byArr) + "," + FuzzerUtils.checkSum(iArr) +
                "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test0325.instanceCount = " + Test0325.instanceCount);

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  sMeth ->  sMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 sMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
