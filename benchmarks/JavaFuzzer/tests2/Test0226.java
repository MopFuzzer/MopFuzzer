// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:23 2023
public class Test0226 {

    public static final int N = 400;

    public static long instanceCount=-19550L;
    public int iFld=31;
    public static float fFld=0.938F;
    public static short sFld=21375;
    public volatile int[] iArrFld =new int[N];
    public static int[] iArrFld1 =new int[N];

    static {
        FuzzerUtils.init(Test0226.iArrFld1, 58016);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l2, float f) {

        int i4=8, i5=187, i6=-187, i7=2, i8=-33, i9=7;
        double d=0.56056;
        boolean b=true;

        i4 = i4;
        i4 |= i4;
        i4 = i4;
        Test0226.iArrFld1[(i4 >>> 1) % N] += 27030;
        i4 *= i4;
        for (i5 = 2; 163 > i5; ++i5) {
            for (i7 = 1; i7 < 10; ++i7) {
                Test0226.iArrFld1 = Test0226.iArrFld1;
                i8 /= (int)(i6 | 1);
                d -= i4;
                if (b) {
                    i9 = 1;
                    while (++i9 < 2) {
                        i8 += (int) Test0226.fFld;
                        try {
                            i4 = (880492832 / i6);
                            i6 = (i5 / i5);
                            i8 = (i4 / 52);
                        } catch (ArithmeticException a_e) {}
                        i6 = 27;
                    }
                } else if (true) {
                    Test0226.iArrFld1[i7] = Test0226.sFld;
                }
            }
        }
        vMeth1_check_sum += l2 + Float.floatToIntBits(f) + i4 + i5 + i6 + i7 + i8 + Double.doubleToLongBits(d) + i9 +
            (b ? 1 : 0);
    }

    public static void vMeth(int i2) {

        int i3=-2, i10=33469, i11=-8859, i12=169, i13=-156;
        long l3=35456L;
        byte by1=105;
        double d1=120.25069;

        i3 = 1;
        while (++i3 < 362) {
            vMeth1(Test0226.instanceCount, Test0226.fFld);
            i2 >>= i3;
            for (i10 = 1; i10 < 5; ++i10) {
                Test0226.sFld %= (short) (i3 | 1);
                Test0226.iArrFld1[i3] <<= i11;
                Test0226.iArrFld1[i3 - 1] %= (int) (i2 | 1);
            }
            i11 = (int) Test0226.instanceCount;
            for (l3 = 1; l3 < 5; l3++) {
                i2 = (int)l3;
                by1 += (byte)(((l3 * i11) + i12) - i13);
                i11 <<= (int) Test0226.instanceCount;
                i12 *= (int)d1;
                i12 >>= (int)l3;
                if (i3 != 0) {
                    vMeth_check_sum += i2 + i3 + i10 + i11 + l3 + i12 + by1 + i13 + Double.doubleToLongBits(d1);
                    return;
                }
            }
        }
        vMeth_check_sum += i2 + i3 + i10 + i11 + l3 + i12 + by1 + i13 + Double.doubleToLongBits(d1);
    }

    public static int iMeth(byte by, long l, long l1) {

        int i=-26640, i1=96, i14=54890, i15=-28, i16=-233, i17=-963;
        boolean b1=false;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -3802460324219262975L);

        for (i = 7; i < 192; i++) {
            switch ((i % 8) + 44) {
            case 44:
            case 45:
                vMeth(i);
                break;
            case 46:
                if (true) {
                    Test0226.iArrFld1[i + 1] = i;
                    i1 -= i1;
                    for (i14 = 9; i14 > i; --i14) {
                        Test0226.iArrFld1[i] = (int) l1;
                        for (i16 = 1; i16 > 1; i16 -= 2) {
                            i17 += (int)39032L;
                            if (b1) {
                                i17 -= i15;
                            } else {
                                Test0226.fFld = -8013L;
                                try {
                                    i15 = (Test0226.iArrFld1[i16 + 1] / i);
                                    i17 = (33 % i16);
                                    i1 = (i15 % 241);
                                } catch (ArithmeticException a_e) {}
                            }
                            i17 = i14;
                        }
                    }
                } else {
                    Test0226.iArrFld1[i + 1] -= i15;
                }
                break;
            case 47:
                i17 ^= i;
            case 48:
                i17 %= (int) ((long) (Test0226.fFld) | 1);
                break;
            case 49:
                i1 = 50185;
                break;
            case 50:
                i15 = (int) Test0226.instanceCount;
            case 51:
                l <<= i16;
                break;
            default:
                Test0226.fFld += 16;
            }
        }
        long meth_res = by + l + l1 + i + i1 + i14 + i15 + i16 + i17 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        short s=5781;
        byte by2=119;
        double d2=110.129884;
        int i18=8;
        int i19=24376;
        int i20=-2;
        int i21=-1249;
        int i22=4;
        int[][] iArr =new int[N][N];
        boolean b2=false;
        long l5=57338L, l6=-13L;

        FuzzerUtils.init(iArr, 28037);

        iArrFld[(iFld >>> 1) % N] *= iFld;
        iFld = (int) ((iFld * (16.707F * Integer.reverseBytes(iFld))) - (s = (short) (0L ^ (Test0226.instanceCount * iFld))));
        iFld += (iFld * ((iFld * iFld) + iMeth(by2, 43388L, Test0226.instanceCount)));
        iFld /= (int)((long)(d2) | 1);
        iFld *= by2;
        for (i18 = 3; 122 > i18; i18++) {
            if (b2) break;
            l5 = 1;
            do {
                if (true) {
                    d2 = Test0226.instanceCount;
                } else {
                    iArr[i18 + 1] = iArr[i18];
                }
                for (i20 = 1; i20 < 1; ++i20) {
                    Test0226.iArrFld1[i18] >>= i21;
                    iFld = i21;
                    iFld = (int)l5;
                }
                Test0226.instanceCount += (l5 * l5);
                for (l6 = 1; 1 > l6; l6++) {
                    Test0226.instanceCount += (((l6 * i20) + i18) - i19);
                    iArrFld[(int)(l6 + 1)] *= i19;
                    iFld = i19;
                    switch (((i18 % 2) * 5) + 7) {
                    case 14:
                        try {
                            i22 = (iFld / 53884);
                            iFld = (i20 % -38635);
                            i22 = (iArrFld[i18] / i20);
                        } catch (ArithmeticException a_e) {}
                        i22 |= i21;
                    case 15:
                        i22 -= i22;
                        i22 = i19;
                        iFld -= iFld;
                    default:
                        i21 -= 22197;
                        i22 = i18;
                        if (b2) continue;
                        d2 = i18;
                    }
                }
            } while (++l5 < 211);
        }

        FuzzerUtils.out.println("s by2 d2 = " + s + "," + by2 + "," + Double.doubleToLongBits(d2));
        FuzzerUtils.out.println("i18 i19 b2 = " + i18 + "," + i19 + "," + (b2 ? 1 : 0));
        FuzzerUtils.out.println("l5 i20 i21 = " + l5 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("l6 i22 iArr = " + l6 + "," + i22 + "," + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test0226.instanceCount iFld Test0226.fFld = " + Test0226.instanceCount + "," + iFld + "," +
                Float.floatToIntBits(Test0226.fFld));
        FuzzerUtils.out.println("Test0226.sFld iArrFld Test0226.iArrFld1 = " + Test0226.sFld + "," + FuzzerUtils.checkSum(iArrFld)
                + "," + FuzzerUtils.checkSum(Test0226.iArrFld1));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0226 _instance = new Test0226();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
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
