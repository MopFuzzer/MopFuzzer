// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:57 2023
public class Test0958 {

    public static final int N = 400;

    public static long instanceCount=5624060993400582918L;
    public static int iFld=-25459;
    public static short sFld=29717;
    public static double dFld=1.46386;
    public volatile float fFld=-89.222F;
    public byte byFld=51;
    public static int[] iArrFld =new int[N];
    public static long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test0958.iArrFld, 12);
        FuzzerUtils.init(Test0958.lArrFld, -1791563627824069122L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i2) {

        int i3=-80, i4=41, i5=0, i6=-2, i7=63138, i8=59376;
        double d=-1.86056;
        byte by=11;
        float f2=-1.488F;
        short s=-6289;
        boolean b1=false;

        switch ((((Test0958.iFld >>> 1) % 8) * 5) + 98) {
        case 127:
            Test0958.instanceCount = i2;
            for (i3 = 11; i3 < 282; i3++) {
                for (i5 = 1; 6 > i5; i5++) {
                    i6 *= 30;
                    i6 -= i6;
                    i7 = 1;
                    do {
                        i4 += i5;
                        d -= by;
                        Test0958.iArrFld[i3 + 1] = (int) 125.2575;
                        i6 += i3;
                        if (b1) {
                            i4 = (int)f2;
                            i6 = (int)-8136001841317929809L;
                            Test0958.lArrFld[i7 - 1] -= s;
                        } else if (b1) {
                            i6 += i4;
                        } else {
                            i4 = i8;
                            vMeth1_check_sum += i2 + i3 + i4 + i5 + i6 + i7 + Double.doubleToLongBits(d) + by +
                                Float.floatToIntBits(f2) + s + (b1 ? 1 : 0) + i8;
                            return;
                        }
                    } while (++i7 < 2);
                }
            }
            break;
        case 114:
            Test0958.iFld = i7;
            break;
        case 125:
            i2 = i2;
            break;
        case 126:
            i2 += i5;
            break;
        case 123:
            i2 = (int) Test0958.instanceCount;
        case 117:
        case 138:
            Test0958.iFld *= i6;
            break;
        case 133:
            i6 = by;
            break;
        }
        vMeth1_check_sum += i2 + i3 + i4 + i5 + i6 + i7 + Double.doubleToLongBits(d) + by + Float.floatToIntBits(f2) +
            s + (b1 ? 1 : 0) + i8;
    }

    public static void vMeth(float f1) {

        int i9=-34486, i10=-24891, i11=-10, i12=-6385, i13=-5;
        byte by1=-112;
        boolean b2=true;

        vMeth1(-5);
        i9 = 1;
        while (++i9 < 252) {
            by1 = (byte) Test0958.iFld;
            Test0958.iFld += i9;
            for (i10 = 1; i10 < 6; i10++) {
                Test0958.iFld >>= (int) 357792856034954236L;
                for (i12 = 1; 2 > i12; ++i12) {
                    Test0958.iFld = i10;
                    f1 *= i13;
                    if (b2) {
                        i11 += (i12 * by1);
                        i11 *= i10;
                        f1 -= Test0958.sFld;
                    }
                    f1 = i9;
                    i11 += (((i12 * Test0958.iFld) + i11) - Test0958.instanceCount);
                }
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f1) + i9 + by1 + i10 + i11 + i12 + i13 + (b2 ? 1 : 0);
    }

    public static int iMeth(float f, int i) {

        long l=-3376655129L, l1=149L;
        int i1=-2, i14=-17, i15=-2, i16=16679, i17=-228;
        boolean b=false;

        try {
            for (l = 3; l < 124; l += 2) {
                b = b;
            }
            if (b) {
                Test0958.iArrFld[(i >>> 1) % N] |= (7 - (--Test0958.iFld));
                vMeth(f);
            } else {
                Test0958.lArrFld[(11 >>> 1) % N] -= i;
                Test0958.dFld = -164;
            }
            for (i14 = 1; i14 < 180; ++i14) {
                for (i16 = 1; i16 < 9; i16++) {
                    i1 += (int)f;
                    Test0958.lArrFld[i16 + 1] = Test0958.sFld;
                    Test0958.instanceCount *= -27343;
                    l1 += (-3484446609L + (i16 * i16));
                    i1 += (((i16 * l) + i15) - Test0958.iFld);
                }
            }
        }
        catch (NegativeArraySizeException exc1) {
            Test0958.iArrFld[(i17 >>> 1) % N] = Test0958.iFld;
        }
        long meth_res = Float.floatToIntBits(f) + i + l + i1 + (b ? 1 : 0) + i14 + i15 + i16 + i17 + l1;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i18=19866, i19=42054, i20=-233, i21=44436, i22=-54734, i23=61409, i24=-136, i25=61470, i26=50072,
            i27=15199, i28=11;
        boolean b3=true;
        short[] sArr =new short[N];

        FuzzerUtils.init(sArr, (short)-13391);

        Test0958.iFld <<= (++Test0958.iFld);
        iMeth(fFld, Test0958.iFld);
        for (i18 = 5; i18 < 386; i18++) {
            for (i20 = i18; i20 < 66; i20++) {
                Test0958.instanceCount >>>= i19;
                if (b3) continue;
                i19 = i20;
                for (i22 = 1; 1 < i22; --i22) {
                    i19 >>= i18;
                    sArr[i20] += (short)fFld;
                    Test0958.instanceCount += (i22 + fFld);
                    i21 += (i22 ^ (long)fFld);
                    i23 *= (int) Test0958.instanceCount;
                    byFld += (byte)(((i22 * i23) + i19) - i19);
                    Test0958.iFld <<= i23;
                    b3 = b3;
                    i19 >>= i21;
                    sArr[i20 + 1] = (short)i20;
                }
            }
            i23 -= -39974;
            fFld -= (float)-2.60076;
        }
        fFld = (float) Test0958.dFld;
        Test0958.iArrFld[(253 >>> 1) % N] = i19;
        Test0958.instanceCount >>= Test0958.instanceCount;
        i24 = 1;
        do {
            Test0958.instanceCount += 86;
            for (i25 = i24; 72 > i25; ++i25) {
                Test0958.iFld -= (int) Test0958.instanceCount;
                for (i27 = 1; i27 < 1; ++i27) {
                    Test0958.iFld = i20;
                    Test0958.dFld = Test0958.instanceCount;
                }
            }
        } while (++i24 < 350);

        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 b3 i22 = " + i21 + "," + (b3 ? 1 : 0) + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 i27 i28 = " + i26 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("sArr = " + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test0958.instanceCount Test0958.iFld Test0958.sFld = " + Test0958.instanceCount + "," + Test0958.iFld +
                "," + Test0958.sFld);
        FuzzerUtils.out.println("Test0958.dFld fFld byFld = " + Double.doubleToLongBits(Test0958.dFld) + "," +
            Float.floatToIntBits(fFld) + "," + byFld);
        FuzzerUtils.out.println("Test0958.iArrFld Test0958.lArrFld = " + FuzzerUtils.checkSum(Test0958.iArrFld) + "," +
                FuzzerUtils.checkSum(Test0958.lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0958 _instance = new Test0958();
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
