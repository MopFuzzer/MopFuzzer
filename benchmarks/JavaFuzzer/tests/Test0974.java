// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:18 2023
public class Test0974 {

    public static final int N = 400;

    public static long instanceCount = 57951L;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public double[] dArrFld = new double[N];

    public static void vMeth1(short s, long l2) {

        int i7 = -10367;
        float f1 = 1.720F;

        i7 = 10;
        f1 += i7;
        i7 += i7;
        vMeth1_check_sum += s + l2 + i7 + Float.floatToIntBits(f1);
    }

    public static int iMeth(int i4, int i5, int i6) {

        int i8 = -5, i9 = -5, i10 = 5, i11 = 0, i12 = 27087;
        byte by = 56;
        float f2 = 2.735F;
        short s1 = 5465;
        boolean b = true;
        long[] lArr = new long[N];
        double[] dArr = new double[N];

        FuzzerUtils.init(lArr, 35118L);
        FuzzerUtils.init(dArr, 1.64615);

        vMeth1((short) (-12895), Test0974.instanceCount);
        for (i8 = 22; i8 < 371; ++i8) {
            for (i10 = 1; i10 < 5; i10++) {
                Test0974.instanceCount += Test0974.instanceCount;
                by -= (byte) i6;
                i4 += (((i10 * i4) + i9) - f2);
                i6 += (i10 * i10);
                lArr[i10 - 1] *= 5;
                i9 = i11;
                s1 &= (short) i9;
                Test0974.instanceCount = i12;
            }
            i5 += (((i8 * Test0974.instanceCount) + i12) - i4);
            if (b) break;
            dArr = dArr;
            i5 += (i8 * i8);
        }
        long meth_res = i4 + i5 + i6 + i8 + i9 + i10 + i11 + by + Float.floatToIntBits(f2) + s1 + i12 + (b ? 1 : 0) +
                FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth(long l1) {

        int i3 = -40317;
        int i13 = -41704;
        int i14 = 2;
        int i15 = 0;
        int i16 = 3837;
        int i17 = 88;
        int i18 = 51890;
        int i19 = 0;
        int i20 = -154;
        int[][] iArr1 = new int[N][N];
        double d = -2.20226;
        float f3 = -35.679F;

        FuzzerUtils.init(iArr1, 13);

        i3 = iMeth(i3, i3, i3);
        Test0974.instanceCount -= (long) d;
        i3 *= (int) -42190L;
        i3 = -12506;
        i3 -= i3;
        f3 = Test0974.instanceCount;
        for (i13 = 7; i13 < 152; i13++) {
            i3 += i13;
        }
        for (i15 = 14; i15 < 319; i15++) {
            for (i17 = 1; 5 > i17; i17 += 3) {
                for (i19 = i17; i19 < 5; i19 += 3) {
                    Test0974.instanceCount += i19;
                    if (i3 != 0) {
                        vMeth_check_sum += l1 + i3 + Double.doubleToLongBits(d) + Float.floatToIntBits(f3) + i13 + i14
                                + i15 + i16 + i17 + i18 + i19 + i20 + FuzzerUtils.checkSum(iArr1);
                        return;
                    }
                    i16 = (int) 21947L;
                    iArr1[i19 - 1][i19] |= (int) l1;
                }
            }
        }
        vMeth_check_sum += l1 + i3 + Double.doubleToLongBits(d) + Float.floatToIntBits(f3) + i13 + i14 + i15 + i16 +
                i17 + i18 + i19 + i20 + FuzzerUtils.checkSum(iArr1);
    }

    public static void main(String[] strArr2) {

        try {
            Test0974 _instance = new Test0974();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr2);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr3) {

        int i1 = -248;
        int i2 = 34199;
        int i21 = 8;
        int i22 = 46252;
        int i23 = 0;
        int i24 = -57;
        int i25 = 14;
        int i26 = -197;
        int i27 = 6;
        int i28 = 130;
        int[] iArr2 = new int[N];
        long l = -4031909755381746189L;
        long[] lArr1 = new long[N];
        float f = 0.882F;
        double d1 = -2.23713;
        byte by1 = 29;
        boolean b1 = false;

        FuzzerUtils.init(lArr1, -34841L);
        FuzzerUtils.init(iArr2, 10);

        dArrFld[(i1 >>> 1) % N] = (--i1);
        for (l = 2; l < 201; ++l) {
            i2 += (int) (((l * i1) + i2) - i1);
            f += ((long) l ^ (long) f);
            vMeth(Test0974.instanceCount);
            i1 += i2;
            for (i21 = (int) (l); 126 > i21; i21++) {
                for (i23 = 1; i23 < 1; i23++) {
                    i24 = i24;
                    d1 *= i22;
                    i1 += i23;
                    lArr1[i23] = i21;
                    i2 += i23;
                    Test0974.instanceCount += i2;
                    i1 -= by1;
                    i24 = (int) l;
                    Test0974.instanceCount = i24;
                }
                Test0974.instanceCount = i21;
                i24 += i24;
                for (i25 = 1; l < i25; --i25) {
                    f *= (float) d1;
                }
            }
            if (b1) {
                iArr2[(int) (l)] <<= i24;
                for (i27 = 6; i27 < 126; i27++) {
                    i2 = by1;
                    iArr2[(int) (l)] = i22;
                    i28 -= (int) -108.994F;
                    i26 += (i27 * i27);
                    f -= i23;
                    f += 5;
                }
            } else if (false) {
                i26 += (int) (l - i27);
            } else {
                i1 <<= i2;
            }
        }

        FuzzerUtils.out.println("i1 l i2 = " + i1 + "," + l + "," + i2);
        FuzzerUtils.out.println("f i21 i22 = " + Float.floatToIntBits(f) + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 d1 = " + i23 + "," + i24 + "," + Double.doubleToLongBits(d1));
        FuzzerUtils.out.println("by1 i25 i26 = " + by1 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 i28 b1 = " + i27 + "," + i28 + "," + (b1 ? 1 : 0));
        FuzzerUtils.out.println("lArr1 iArr2 = " + FuzzerUtils.checkSum(lArr1) + "," + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test0974.instanceCount dArrFld = " + Test0974.instanceCount + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));

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
