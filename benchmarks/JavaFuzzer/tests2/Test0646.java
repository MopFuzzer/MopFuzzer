// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:42 2023
public class Test0646 {

    public static final int N = 400;

    public static long instanceCount=239L;
    public static float fFld=2.759F;
    public static long lFld=7L;
    public static short sFld=7055;
    public static volatile long lFld1=11L;
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0646.iArrFld, -27570);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(int i8) {

        int i9=-61057;
        int i10=37571;
        int i11=-206;
        int i12=212;
        int i13=191;
        int i14=7;
        int[] iArr1 =new int[N];
        byte by1=59;
        float f=-94.951F;
        double d=124.101485;

        FuzzerUtils.init(iArr1, -76);

        for (i9 = 11; i9 < 191; ++i9) {
            i10 = 1;
            Test0646.fFld -= Test0646.instanceCount;
            for (i11 = 1; i11 < 9; i11 += 3) {
                i10 = by1;
                try {
                    i10 = (i11 / -1655410702);
                    i12 = (i13 % i13);
                    i10 = (-86 % i11);
                } catch (ArithmeticException a_e) {}
                Test0646.instanceCount *= i10;
                i13 += (i11 * i11);
                i13 += i11;
                for (f = 1; 5 > f; ++f) {
                    i13 = i12;
                    i10 -= (int)-9236L;
                    Test0646.instanceCount = i13;
                    try {
                        Test0646.iArrFld[(int) (f - 1)] = (i14 % i10);
                        i13 = (i9 % i12);
                        i8 = (Test0646.iArrFld[(int) (f)] / iArr1[(i8 >>> 1) % N]);
                    } catch (ArithmeticException a_e) {}
                }
                Test0646.instanceCount += (long) d;
            }
        }
        long meth_res = i8 + i9 + i10 + i11 + i12 + by1 + i13 + Float.floatToIntBits(f) + i14 +
            Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr1);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth1(int i7, short s) {

        int i15=2, i16=-8738, i17=14, i18=-63859, i19=1;
        byte by2=-116;
        boolean b=false;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(lArr1, -1572651773L);

        i7 <<= (int)((fMeth(103) * i7) + i7);
        for (long l : lArr1) {
            for (i15 = 4; i15 > 1; i15--) {
                Test0646.fFld -= Test0646.fFld;
                i16 >>>= 0;
                i7 += by2;
                i17 -= i7;
            }
            i17 <<= i7;
            for (i18 = 1; i18 < 4; i18 += 3) {
                if (b) continue;
                Test0646.instanceCount = Test0646.lFld;
                s = (short)i17;
                i7 -= 30662;
                i17 -= (int) Test0646.lFld;
            }
            i7 = (int) Test0646.lFld;
        }
        vMeth1_check_sum += i7 + s + i15 + i16 + by2 + i17 + i18 + i19 + (b ? 1 : 0) + FuzzerUtils.checkSum(lArr1);
    }

    public static void vMeth(int i, byte by) {

        int i1=12464;
        int i2=57352;
        int i3=7;
        int i4=-59456;
        int i5=-64436;
        int i6=-186;
        int[] iArr =new int[N];
        short s1=30182;
        long[] lArr =new long[N];
        float[][] fArr =new float[N][N];

        FuzzerUtils.init(iArr, -7);
        FuzzerUtils.init(lArr, -7501567885338484173L);
        FuzzerUtils.init(fArr, 124.428F);

        for (i1 = 6; i1 < 347; ++i1) {
            iArr[i1] += i2;
            for (i3 = 5; i3 > 1; i3--) {
                for (i5 = 1; i5 < 2; i5++) {
                    lArr[i3 - 1] <<= (i6--);
                    i2 += i5;
                    vMeth1(i5, s1);
                    i2 /= (int)(i1 | 1);
                    if (i5 != 0) {
                        vMeth_check_sum += i + by + i1 + i2 + i3 + i4 + i5 + i6 + s1 + FuzzerUtils.checkSum(iArr) +
                            FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                        return;
                    }
                    Test0646.fFld += (((i5 * i5) + Test0646.fFld) - Test0646.lFld);
                }
                fArr[i1 - 1][i3] -= -1;
                Test0646.fFld = i;
                if (i3 != 0) {
                    vMeth_check_sum += i + by + i1 + i2 + i3 + i4 + i5 + i6 + s1 + FuzzerUtils.checkSum(iArr) +
                        FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                    return;
                }
                i6 = i;
                Test0646.instanceCount -= i1;
            }
        }
        vMeth_check_sum += i + by + i1 + i2 + i3 + i4 + i5 + i6 + s1 + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i20=-77, i21=-14, i22=-3, i23=-195, i24=-29918, i25=-214, i26=25589, i27=28280, i28=-7652;
        byte by3=-42;
        boolean b1=true;
        long l1=6280726037243496991L;

        vMeth(i20, (byte)(85));
        for (i21 = 6; 297 > i21; ++i21) {
            Test0646.fFld += (i21 - i22);
            Test0646.instanceCount &= Test0646.instanceCount;
        }
        i23 = 1;
        while (++i23 < 265) {
            Test0646.instanceCount >>= i22;
            i20 -= i22;
            for (i24 = 3; i24 < 95; i24 += 2) {
                Test0646.lFld |= Test0646.instanceCount;
                i20 *= 4;
            }
            Test0646.fFld -= i22;
            by3 *= (byte)-13;
            for (i26 = i23; 95 > i26; i26++) {
                b1 = b1;
                i25 -= i23;
                Test0646.sFld += (short) (((i26 * i25) + i24) - i22);
                for (l1 = i26; l1 < 1; l1++) {
                    i22 = (int) Test0646.fFld;
                    i28 = by3;
                    switch (((i23 % 5) * 5) + 30) {
                    case 53:
                        i22 = i28;
                        Test0646.instanceCount = Test0646.lFld1;
                        i27 += (int)l1;
                        i28 >>>= 39;
                    case 54:
                        i28 *= i21;
                    case 37:
                        if (b1) break;
                        b1 = b1;
                        Test0646.fFld *= l1;
                        Test0646.iArrFld[i26] *= -11864;
                        break;
                    case 36:
                        if (b1) break;
                        break;
                    case 46:
                        Test0646.fFld += Test0646.lFld;
                        break;
                    default:
                        i28 *= (int)2842319323L;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("by3 i26 i27 = " + by3 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("b1 l1 i28 = " + (b1 ? 1 : 0) + "," + l1 + "," + i28);

        FuzzerUtils.out.println("Test0646.instanceCount Test0646.fFld Test0646.lFld = " + Test0646.instanceCount + "," +
                Float.floatToIntBits(Test0646.fFld) + "," + Test0646.lFld);
        FuzzerUtils.out.println("Test0646.sFld Test0646.lFld1 Test0646.iArrFld = " + Test0646.sFld + "," + Test0646.lFld1 + "," +
                FuzzerUtils.checkSum(Test0646.iArrFld));

        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0646 _instance = new Test0646();
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  fMeth ->  fMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
