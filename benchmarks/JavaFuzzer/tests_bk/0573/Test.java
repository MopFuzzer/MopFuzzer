// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:07 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=39L;
    public static double dFld=2.98563;
    public int iFld=-46113;
    public static float fArrFld[][]=new float[N][N];
    public int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 1.248F);
    }

    public static long sMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i5, long l1, double d) {

        double d1=60.122533;
        int i6=55951, i7=-200, i8=-83, i9=0, i10=-106, iArr[]=new int[N], iArr1[]=new int[N];
        float f=0.53F, fArr[]=new float[N];
        short s=-6937;

        FuzzerUtils.init(iArr, -3673);
        FuzzerUtils.init(iArr1, -99);
        FuzzerUtils.init(fArr, 111.66F);

        for (d1 = 17; 345 > d1; ++d1) {
            for (i7 = (int)(d1); i7 < 5; i7++) {
                for (i9 = i7; i9 < 1; i9 += 2) {
                    i5 += -3;
                    iArr = iArr1;
                    i5 += (i9 | l1);
                    fArr[(int)(d1)] = f;
                    iArr = iArr1;
                    switch ((i7 % 6) + 60) {
                    case 60:
                        i10 += (((i9 * l1) + i8) - i8);
                        i8 += i9;
                        Test.instanceCount += (i9 - i5);
                        s = (short)i10;
                        break;
                    case 61:
                        i8 += (75 + (i9 * i9));
                        l1 &= s;
                        break;
                    case 62:
                        try {
                            iArr1[(int)(d1 + 1)] = (42910 / i8);
                            i5 = (iArr[i9] / i6);
                            i10 = (i5 / -25);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 63:
                        iArr1[i9] -= s;
                    case 64:
                        i6 = i7;
                        break;
                    case 65:
                        Test.instanceCount >>= i10;
                        break;
                    }
                }
            }
        }
        vMeth_check_sum += i5 + l1 + Double.doubleToLongBits(d) + Double.doubleToLongBits(d1) + i6 + i7 + i8 + i9 + i10
            + Float.floatToIntBits(f) + s + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static int iMeth(long l, int i3, int i4) {

        double d2=112.85905;
        int i11=-173, i12=5, i13=-115, i14=13, iArr2[][]=new int[N][N];
        byte by=0;
        float f2=-105.160F;
        boolean b=false;

        FuzzerUtils.init(iArr2, 51016);

        if (b) {
            i4 = i3;
            vMeth(7, l, d2);
            iArr2[(i11 >>> 1) % N][(i3 >>> 1) % N] = 6762;
            for (i12 = 4; i12 < 278; ++i12) {
                float f1=124.733F;
                l = by;
                i4 += (int)123L;
                Test.instanceCount *= (long)f1;
                i13 += (((i12 * l) + f1) - i4);
                for (f2 = 6; f2 > 1; --f2) {
                    try {
                        i3 = (iArr2[(int)(f2 - 1)][(int)(f2)] / i11);
                        iArr2[(int)(f2 + 1)][i12 + 1] = (1169252904 / i4);
                        i11 = (i13 / i11);
                    } catch (ArithmeticException a_e) {}
                    b = b;
                    iArr2[i12][i12 - 1] -= -52690;
                }
                i14 >>>= i3;
            }
        } else {
            i14 -= -115;
        }
        long meth_res = l + i3 + i4 + Double.doubleToLongBits(d2) + i11 + i12 + i13 + by + Float.floatToIntBits(f2) +
            i14 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static short sMeth() {

        int i1=41018, i2=-1, i15=-114, i16=3170, i17=25759, i18=218;
        double d3=-2.93376;
        byte by1=-56;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 53875L);

        for (i1 = 8; i1 < 188; i1++) {
            lArr[i1 + 1] *= iMeth(Test.instanceCount, i2, i1);
            Test.fArrFld[i1 - 1][i1] -= i2;
            i2 *= i1;
        }
        d3 -= i2;
        for (i15 = 18; 324 > i15; i15++) {
            i16 += i15;
            Test.instanceCount -= (long)d3;
            for (i17 = 5; i17 > 1; i17--) {
                float f3=-71.87F;
                f3 %= ((long)(f3) | 1);
                lArr[i15 - 1] -= i16;
                Test.instanceCount = i16;
                d3 = i18;
                Test.instanceCount -= -13;
                d3 = by1;
            }
        }
        long meth_res = i1 + i2 + Double.doubleToLongBits(d3) + i15 + i16 + i17 + i18 + by1 +
            FuzzerUtils.checkSum(lArr);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-32031, i20=19311, i21=-242, i22=-11, i23=-190;
        boolean b1=true;
        float f4=-127.632F;
        long lArr1[][]=new long[N][N];

        FuzzerUtils.init(lArr1, -7515769369943800929L);

        i <<= (sMeth() + i);
        for (int i19 : iArrFld) {
            Test.instanceCount ^= 2048412307L;
            if (b1) {
                i19 *= (int)Test.instanceCount;
                if (b1) continue;
                if (b1) {
                    switch (((i >>> 1) % 3) + 21) {
                    case 21:
                        i19 = i19;
                    case 22:
                        f4 -= -95;
                        Test.instanceCount >>= -242;
                        for (i20 = 2; i20 < 63; ++i20) {
                            iArrFld[i20] += 72;
                            iArrFld[(i20 >>> 1) % N] -= i21;
                            lArr1[i20 + 1][i20] -= i19;
                            f4 += (((i20 * f4) + f4) - i21);
                            for (i22 = 1; i22 < 2; ++i22) {
                                short s1=-8527;
                                iArrFld[i22] /= (int)((long)(Test.dFld) | 1);
                                i19 += i20;
                                Test.instanceCount *= Test.instanceCount;
                                i21 = (int)Test.instanceCount;
                                i += (i22 * i22);
                                switch (((i22 >>> 1) % 2) + 122) {
                                case 122:
                                    switch ((i22 % 4) + 104) {
                                    case 104:
                                        i19 = i21;
                                        break;
                                    case 105:
                                        i21 = (int)-2.240F;
                                        f4 += iFld;
                                        s1 += (short)Test.dFld;
                                        break;
                                    case 106:
                                        Test.instanceCount += 2883300511564054110L;
                                    case 107:
                                        f4 += i22;
                                        break;
                                    }
                                    break;
                                case 123:
                                    i19 += i22;
                                }
                            }
                        }
                    case 23:
                        i21 = -53;
                        break;
                    }
                }
            } else {
                Test.dFld = i20;
            }
        }

        FuzzerUtils.out.println("i b1 f4 = " + i + "," + (b1 ? 1 : 0) + "," + Float.floatToIntBits(f4));
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 lArr1 = " + i23 + "," + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test.instanceCount Test.dFld iFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(Test.dFld) + "," + iFld);
        FuzzerUtils.out.println("Test.fArrFld iArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld))
            + "," + FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
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
//DEBUG  sMeth ->  sMeth mainTest
//DEBUG  iMeth ->  iMeth sMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth sMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
