// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:57 2023
public class Test0180 {

    public static final int N = 400;

    public static volatile long instanceCount = 311668409642726872L;
    public static float fFld = -125.473F;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long iMeth2_check_sum = 0;
    public int iFld = -41578;
    public boolean bFld = false;
    public double dFld = 48.24562;
    public int[] iArrFld = new int[N];

    public static int iMeth2(int i4, int i5) {

        int i6 = 41007, i7 = 207, i8 = -1546, i9 = -65070, i10 = 3, i11 = -51915;
        long l1 = -131L, l2 = 7L;
        byte by = -71;
        boolean b = true;

        for (i6 = 3; i6 < 151; i6++) {
            i8 = i8;
            i4 = i8;
            for (l1 = i6; l1 < 11; ++l1) {
                for (i10 = 1; 1 > i10; ++i10) {
                    i4 -= (int) l2;
                    i7 *= (int) l1;
                    by += (byte) (8 + (i10 * i10));
                    i4 += i9;
                    if (i10 != 0) {
                    }
                    i7 += (i10 | Test0180.instanceCount);
                    if (b) {
                        Test0180.fFld -= i9;
                        l2 += i5;
                        i4 >>= i7;
                    } else if (b) {
                        i11 = i7;
                    }
                }
            }
        }
        long meth_res = i4 + i5 + i6 + i7 + i8 + l1 + i9 + i10 + i11 + l2 + by + (b ? 1 : 0);
        iMeth2_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0180 _instance = new Test0180();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public int iMeth1(float f) {

        int i12 = 6, i13 = 13;
        double d1 = -2.101851;
        float[] fArr1 = new float[N];

        FuzzerUtils.init(fArr1, 0.173F);

        iArrFld[(iFld >>> 1) % N] >>>= iMeth2(-7, iFld);
        Test0180.instanceCount >>= iFld;
        iFld -= iFld;
        switch (((-3 >>> 1) % 1) + 18) {
            case 18:
                for (i12 = 333; i12 > 12; i12--) {
                    iFld = i12;
                    iFld += iFld;
                    if (bFld) break;
                    fArr1[i12] = f;
                    iFld = (int) Test0180.instanceCount;
                    iFld = (int) Test0180.instanceCount;
                    iFld = (int) f;
                    d1 -= 204L;
                    i13 = 45066;
                    Test0180.instanceCount += (248L + (i12 * i12));
                }
        }
        long meth_res = Float.floatToIntBits(f) + i12 + i13 + Double.doubleToLongBits(d1) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
        iMeth1_check_sum += meth_res;
        return (int) meth_res;
    }

    public int iMeth(int i, double d, int i1) {

        int i2 = 9, i3 = -8, i14 = -1, i15 = -5, i16 = 7;
        long l = 172L;
        short s = -6858;
        byte by1 = 82;

        Test0180.fFld += ((iArrFld[(i >>> 1) % N] -= (++i)) + Math.min(i1 + iFld, iFld));
        iArrFld[(i >>> 1) % N] -= (++iArrFld[(i >>> 1) % N]);
        for (i2 = 1; i2 < 210; i2++) {
            Test0180.fFld -= (-(--iFld));
            l = 1;
            while (++l < 8) {
                d = iMeth1(Test0180.fFld);
                iFld = 22853;
                for (i14 = 1; i14 < 1; i14++) {
                    i3 -= (int) l;
                }
                i16 = 1;
                while (++i16 < 1) {
                    switch ((((iFld >>> 1) % 8) * 5) + 56) {
                        case 66:
                            i15 *= i3;
                        case 92:
                            iFld *= s;
                            bFld = bFld;
                            i += i16;
                            break;
                        case 67:
                            i += i14;
                            break;
                        case 60:
                            i *= (int) Test0180.fFld;
                        case 78:
                            by1 *= (byte) iFld;
                        case 80:
                            i15 -= (int) Test0180.instanceCount;
                            break;
                        case 64:
                            i1 -= s;
                            break;
                        case 70:
                            Test0180.instanceCount >>= s;
                            break;
                    }
                }
            }
        }
        long meth_res = i + Double.doubleToLongBits(d) + i1 + i2 + i3 + l + i14 + i15 + i16 + s + by1;
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i17 = -4, i18 = -196, i19 = 3, i20 = 6, i21 = 33504, i22 = 82, i23 = -51435;
        short s1 = -20413;
        float f1 = 32.965F;
        float[] fArr = new float[N];
        byte by2 = -40;
        long[] lArr = new long[N];

        FuzzerUtils.init(fArr, 57.922F);
        FuzzerUtils.init(lArr, 28814L);

        iFld -= (int) (fArr[(0 >>> 1) % N]--);
        Test0180.instanceCount += ((iFld - iMeth(27409, dFld, iFld)) - 11);
        for (i17 = 2; i17 < 123; i17 += 2) {
            for (i19 = 1; i19 < i17; i19++) {
                iArrFld[i19] = i20;
                iFld += (i19 | s1);
                for (i21 = 1; i21 < 2; ++i21) {
                    if (bFld) {
                        i20 += iFld;
                    } else if (bFld) {
                        lArr[i17] >>= i17;
                        i22 = (int) 4098526945L;
                        i22 += (-20342 + (i21 * i21));
                    }
                    i22 += (((i21 * i18) + Test0180.fFld) - Test0180.instanceCount);
                    iArrFld[i21] = iFld;
                    iFld -= s1;
                    try {
                        i22 = (iArrFld[i21 - 1] / i21);
                        iArrFld[i21] = (i17 / -607790954);
                        iArrFld[i19 + 1] = (80 / i20);
                    } catch (ArithmeticException a_e) {
                    }
                    bFld = bFld;
                    iArrFld[i21 + 1] -= i20;
                    Test0180.instanceCount -= -40;
                    fArr[i17] = -22L;
                }
                i18 &= i20;
                i22 >>>= i22;
                for (f1 = 1; f1 < 2; ++f1) {
                    i23 = i22;
                    Test0180.instanceCount = i22;
                    by2 += (byte) f1;
                    dFld = Test0180.instanceCount;
                    Test0180.fFld += i21;
                    dFld += i22;
                    if (true) continue;
                }
            }
        }

        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 s1 i21 = " + i20 + "," + s1 + "," + i21);
        FuzzerUtils.out.println("i22 f1 i23 = " + i22 + "," + Float.floatToIntBits(f1) + "," + i23);
        FuzzerUtils.out.println("by2 fArr lArr = " + by2 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
                "," + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test0180.instanceCount iFld Test0180.fFld = " + Test0180.instanceCount + "," + iFld + "," +
                Float.floatToIntBits(Test0180.fFld));
        FuzzerUtils.out.println("bFld dFld iArrFld = " + (bFld ? 1 : 0) + "," + Double.doubleToLongBits(dFld) + "," +
                FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("iMeth2_check_sum: " + iMeth2_check_sum);
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
//DEBUG  iMeth2 ->  iMeth2 iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
