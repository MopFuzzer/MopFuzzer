// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:09 2023
public class Test0663 {

    public static final int N = 400;

    public static long instanceCount = 197L;
    public static float fFld = -7.846F;
    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public boolean bFld = true;
    public int iFld = -13;
    public long[] lArrFld = new long[N];

    public static int iMeth(int i2, double d) {


        i2 <<= (int) ((--i2) / (((long) ((i2 + d) + (i2 + Test0663.instanceCount))) | 1));
        long meth_res = i2 + Double.doubleToLongBits(d);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth() {

        int i11 = -2;
        int i12 = 24609;
        int i13 = 11;
        int i15 = -1;
        int i16 = 26332;
        int i17 = -26766;
        int[] iArr1 = new int[N];
        byte by2 = 82;
        double d3 = 13.42595;

        FuzzerUtils.init(iArr1, 130);

        for (i11 = 4; 241 > i11; ++i11) {
            by2 = (byte) i13;
        }
        Test0663.instanceCount >>= i13;
        i13 += i13;
        for (int i14 : iArr1) {
            for (i15 = 1; i15 < 4; i15 += 3) {
                i13 += i11;
                i17 = 1;
                do {
                    iArr1 = iArr1;
                    i13 = i17;
                } while (++i17 < 4);
                d3 = 1;
                do {
                    by2 += (byte) (((d3 * Test0663.instanceCount) + i17) - i17);
                    i14 <<= (int) Test0663.instanceCount;
                    iArr1[i15 + 1] = -10966;
                    i12 += (int) (d3 + Test0663.instanceCount);
                } while (++d3 < 4);
            }
        }
        vMeth_check_sum += i11 + i12 + by2 + i13 + i15 + i16 + i17 + Double.doubleToLongBits(d3) +
                FuzzerUtils.checkSum(iArr1);
    }

    public static float fMeth(int i9, long l, int i10) {

        float f = 2.901F;
        float[] fArr = new float[N];
        int i18 = 15925;
        int i19 = 144;
        int i20 = 8;
        int i21 = -14851;
        int[][] iArr2 = new int[N][N];
        byte by3 = -117;
        double d4 = -97.64844;

        FuzzerUtils.init(fArr, 21.879F);
        FuzzerUtils.init(iArr2, 181);

        l -= (long) (++f);
        vMeth();
        l = Test0663.instanceCount;
        for (i18 = 7; 392 > i18; i18++) {
            if (true) break;
            fArr[(i18 >>> 1) % N] += i18;
            fArr[i18 + 1] -= l;
        }
        by3 = (byte) i19;
        d4 = 1;
        while (++d4 < 378) {
            iArr2[(int) (d4)][(int) (d4)] += i9;
            f *= i18;
            for (i20 = 1; i20 < 4; ++i20) {
                f = Test0663.instanceCount;
                l = i19;
                f += (-183 + (i20 * i20));
            }
        }
        long meth_res = i9 + l + i10 + Float.floatToIntBits(f) + i18 + i19 + by3 + Double.doubleToLongBits(d4) + i20 +
                i21 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr2);
        fMeth_check_sum += meth_res;
        return (float) meth_res;
    }

    public static long lMeth(byte by1, int i7) {

        double d2 = 2.114074;
        int i8 = -14, i22 = 49798, i23 = -242, i24 = -3;

        for (d2 = 4; d2 < 161; d2++) {
            i7 = (int) (Test0663.instanceCount - fMeth(i7, Test0663.instanceCount, i7));
            i7 <<= i7;
            i8 += (int) (2L + (d2 * d2));
            i8 >>>= (int) Test0663.instanceCount;
        }
        i8 = i7;
        i7 += i8;
        Test0663.fFld += Test0663.fFld;
        i8 *= by1;
        i7 = (int) Test0663.fFld;
        Test0663.fFld = i7;
        for (i22 = 8; i22 < 147; ++i22) {
            Test0663.instanceCount -= 8983L;
            Test0663.instanceCount += i22;
            i24 += (i22 * i22);
        }
        long meth_res = by1 + i7 + Double.doubleToLongBits(d2) + i8 + i22 + i23 + i24;
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0663 _instance = new Test0663();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = -45476;
        int i3 = -225;
        int i4 = 213;
        int i5 = -9;
        int i6 = 8;
        int[] iArr = new int[N];
        byte by = -124;

        FuzzerUtils.init(iArr, -5);

        i = 1;
        do {
            int i1 = -11;
            double d1 = -96.69409;
            iArr[i - 1] += (int) (i1 = (int) (iMeth(i1, d1) - (Test0663.instanceCount - -9)));
            i1 *= (int) ((lArrFld[i - 1] = (long) (++d1)) * ((by--) - by));
            for (i3 = 4; i3 < 74; i3++) {
                i1 += i3;
                try {
                    iArr[i3 - 1] = (20 / i4);
                    i1 = (-137 % i1);
                    iArr[i3 + 1] = (i4 % 14);
                } catch (ArithmeticException a_e) {
                }
                for (i5 = 1; i5 < 2; i5++) {
                    int i25 = 79;
                    Test0663.instanceCount += i5;
                    d1 *= lMeth(by, i3);
                    i1 -= (int) Test0663.instanceCount;
                    i1 += (-1045 + (i5 * i5));
                    i4 = (int) Test0663.instanceCount;
                    i1 *= (int) Test0663.instanceCount;
                    switch ((((-49145 >>> 1) % 7) * 5) + 79) {
                        case 90:
                            i1 -= i5;
                            iArr[i] -= i4;
                            i6 += by;
                            iArr = iArr;
                        case 109:
                            by += (byte) (i5 * i5);
                            break;
                        case 105:
                            Test0663.instanceCount += 81;
                        case 87:
                            i1 += i1;
                            Test0663.instanceCount += (((i5 * i6) + i5) - i);
                            i4 += (int) Test0663.instanceCount;
                            i6 -= i;
                            break;
                        case 103:
                            lArrFld[i - 1] >>= i6;
                            break;
                        case 111:
                            i4 += i5;
                        case 106:
                            if (bFld) continue;
                            break;
                        default:
                            try {
                                i4 = (i4 % i6);
                                iFld = (i6 / -30407);
                                i1 = (829731410 % i4);
                            } catch (ArithmeticException a_e) {
                            }
                    }
                    i6 += (i5 | Test0663.instanceCount);
                    try {
                        i4 = (i25 % 40636);
                        i1 = (i4 % 103);
                        iFld = (i5 / i4);
                    } catch (ArithmeticException a_e) {
                    }
                }
            }
        } while (++i < 338);

        FuzzerUtils.out.println("i by i3 = " + i + "," + by + "," + i3);
        FuzzerUtils.out.println("i4 i5 i6 = " + i4 + "," + i5 + "," + i6);
        FuzzerUtils.out.println("iArr = " + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test0663.instanceCount Test0663.fFld bFld = " + Test0663.instanceCount + "," +
                Float.floatToIntBits(Test0663.fFld) + "," + (bFld ? 1 : 0));
        FuzzerUtils.out.println("iFld lArrFld = " + iFld + "," + FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  fMeth ->  fMeth lMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
