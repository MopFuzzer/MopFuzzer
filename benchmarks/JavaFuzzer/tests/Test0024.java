// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:53 2023
public class Test0024 {

    public static final int N = 400;

    public static long instanceCount = -14L;

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i7, int i8, int i9) {

        short s = 11343;
        float f = 69.722F;
        byte by1 = 72;
        int i10 = 7, i11 = 3, i12 = 240, i13 = -39740, i14 = 12, i15 = -9;
        double d = 0.60861;
        boolean b = false;

        i7 >>>= s;
        i7 = i8;
        f -= by1;
        for (i10 = 11; i10 < 364; i10 += 2) {
            for (i12 = 1; i12 < 9; ++i12) {
                Test0024.instanceCount = i10;
                i11 += i12;
                for (i14 = 1; i14 < 2; i14++) {
                    s |= (short) Test0024.instanceCount;
                    Test0024.instanceCount <<= i10;
                    i7 += (((i14 * i7) + i8) - Test0024.instanceCount);
                }
                f += (i12 * i9);
                if (b) {
                    d += i11;
                    i7 += i12;
                } else if (b) {
                    i7 += (i12 ^ i12);
                }
            }
        }
        vMeth1_check_sum += i7 + i8 + i9 + s + Float.floatToIntBits(f) + by1 + i10 + i11 + i12 + i13 + i14 + i15 +
                Double.doubleToLongBits(d) + (b ? 1 : 0);
    }

    public static void vMeth() {

        int i16 = 0, i17 = -45054, i18 = 172, i19 = 37707, i20 = 14, i21 = -41856;
        long l3 = 8929749300765652504L;
        long[] lArr = new long[N];
        float f1 = 5.941F;
        float[] fArr = new float[N];
        boolean b1 = true;
        double d1 = 2.96374;

        FuzzerUtils.init(lArr, -92L);
        FuzzerUtils.init(fArr, -55.324F);

        for (long l2 : lArr) {
            vMeth1(i16, i16, 0);
            lArr[(i16 >>> 1) % N] = i16;
            i16 -= (int) l3;
            i17 = 1;
            while (++i17 < 4) {
                i16 += (((i17 * i17) + i17) - i16);
                i16 *= i16;
            }
        }
        for (i18 = 9; 297 > i18; i18++) {
            for (i20 = 1; i20 < 6; i20++) {
                l3 = -3333777210L;
                f1 *= Test0024.instanceCount;
                if (b1) break;
            }
        }
        if (b1) {
            i16 = -13;
            fArr[(i18 >>> 1) % N] += i21;
        } else if (b1) {
            d1 += l3;
        } else if (b1) {
            b1 = b1;
        } else {
            i16 -= i21;
        }
        vMeth_check_sum += i16 + l3 + i17 + i18 + i19 + i20 + i21 + Float.floatToIntBits(f1) + (b1 ? 1 : 0) +
                Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(lArr) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static int iMeth(long l1) {

        int i3 = -23, i4 = -4871, i5 = 189, i6 = -3, i22 = -89, i23 = -11, i24 = 46835, i25 = 13;
        byte by = -33;
        float f2 = -6.443F;
        long[] lArr1 = new long[N];

        FuzzerUtils.init(lArr1, -3301723296L);

        for (i3 = 12; i3 < 343; i3++) {
            for (i5 = 1; i5 < 5; ++i5) {
                i6 = (by++);
                vMeth();
                i4 = (int) f2;
                i6 = (int) Test0024.instanceCount;
                for (i22 = 1; i22 < 2; i22 += 2) {
                    i6 = i5;
                    i23 += (((i22 * f2) + Test0024.instanceCount) - i4);
                    i6 += i22;
                    if (i23 != 0) {
                    }
                }
                switch ((i5 % 5) + 50) {
                    case 50:
                        for (i24 = 1; i24 < 2; ++i24) {
                            i4 += i25;
                        }
                        i25 += i5;
                    case 51:
                        i6 = 17647;
                        break;
                    case 52:
                        f2 += (i5 * i5);
                        break;
                    case 53:
                        i23 += (i5 | l1);
                        break;
                    case 54:
                        lArr1[i3 - 1] = i4;
                        break;
                    default:
                        i25 -= (int) 1.581F;
                }
            }
        }
        long meth_res = l1 + i3 + i4 + i5 + i6 + by + Float.floatToIntBits(f2) + i22 + i23 + i24 + i25 +
                FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0024 _instance = new Test0024();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        long l = 4L;
        int i1 = -158;
        int i2 = 162;
        int i26 = 19348;
        int i27 = 2;
        int i28 = -4000;
        int[] iArr = new int[N];
        float f3 = -73.663F;
        double d2 = 17.6692;
        byte by2 = 114;
        boolean b2 = true;
        short[] sArr = new short[N];

        FuzzerUtils.init(iArr, 203);
        FuzzerUtils.init(sArr, (short) -18394);

        l = 1;
        while (++l < 313) {
            int i = 63;
            iArr[(int) (l + 1)] <<= (i--);
            for (i1 = 4; i1 < 80; ++i1) {
                sArr[(int) (l)] -= (short) (iMeth(3613993349538825815L) - 6);
                i <<= i1;
                switch ((i1 % 8) + 78) {
                    case 78:
                        Test0024.instanceCount = i2;
                        break;
                    case 79:
                    case 80:
                    case 81:
                        i += (33 + (i1 * i1));
                        Test0024.instanceCount = i1;
                        break;
                    case 82:
                        Test0024.instanceCount -= Test0024.instanceCount;
                        i2 = (int) -4269728379L;
                        i2 = (int) f3;
                        for (d2 = i1; d2 < 2; ++d2) {
                            by2 *= (byte) i;
                            Test0024.instanceCount = (long) 1.38614;
                            iArr = iArr;
                            f3 += (float) (((d2 * i1) + i26) - i2);
                            f3 += -7;
                            f3 += (-3851556018L + (d2 * d2));
                        }
                        break;
                    case 83:
                        i26 += (((i1 * i1) + i) - i2);
                        if (b2) {
                            Test0024.instanceCount >>>= Test0024.instanceCount;
                            i += i1;
                            i26 <<= by2;
                            Test0024.instanceCount *= (long) f3;
                        } else {
                            for (i27 = 1; i27 < 2; i27++) {
                                f3 = Test0024.instanceCount;
                                iArr[(int) (l - 1)] = i2;
                                Test0024.instanceCount = Test0024.instanceCount;
                                iArr[i27 + 1] = by2;
                            }
                        }
                        break;
                    case 84:
                        i = i26;
                    case 85:
                        i2 = (int) -13950L;
                        break;
                    default:
                        Test0024.instanceCount += i1;
                }
            }
        }

        FuzzerUtils.out.println("l i1 i2 = " + l + "," + i1 + "," + i2);
        FuzzerUtils.out.println("f3 d2 i26 = " + Float.floatToIntBits(f3) + "," + Double.doubleToLongBits(d2) + "," +
                i26);
        FuzzerUtils.out.println("by2 b2 i27 = " + by2 + "," + (b2 ? 1 : 0) + "," + i27);
        FuzzerUtils.out.println("i28 iArr sArr = " + i28 + "," + FuzzerUtils.checkSum(iArr) + "," +
                FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test0024.instanceCount = " + Test0024.instanceCount);

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
