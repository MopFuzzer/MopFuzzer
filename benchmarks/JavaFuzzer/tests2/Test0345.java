// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:28 2023
public class Test0345 {

    public static final int N = 400;

    public static long instanceCount=-18111L;
    public static int iFld=-50341;
    public static short sFld=-2251;
    public static volatile long lFld=64286L;
    public static boolean bFld=false;
    public int iFld1=228;
    public float[] fArrFld =new float[N];

    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(double d, float f2, int i15) {

        int i16=-158;
        int i17=-1;
        int i18=218;
        int i19=-61628;
        int i20=9732;
        int[] iArr2 =new int[N];
        float f3=33.883F;
        short[] sArr =new short[N];

        FuzzerUtils.init(sArr, (short)-20766);
        FuzzerUtils.init(iArr2, -167);

        if (Test0345.bFld) {
            i16 = 1;
            do {
                sArr[i16 + 1] += (short)i15;
                Test0345.instanceCount = (long) 62.944F;
                for (i17 = i16; i17 < 4; ++i17) {
                    i15 += (((i17 * i18) + i17) - Test0345.iFld);
                    d = d;
                    for (i19 = i17; i19 < 1; ++i19) {
                        i18 += (i19 | i18);
                        if (Test0345.bFld) continue;
                        switch ((i19 % 5) + 35) {
                        case 35:
                            i15 = (int)d;
                            Test0345.instanceCount = Test0345.instanceCount;
                        case 36:
                            f2 += (((i19 * i15) + i18) - Test0345.instanceCount);
                            iArr2[i16 + 1] &= i15;
                            break;
                        case 37:
                            f3 += (i19 * Test0345.iFld);
                        case 38:
                            i20 += (((i19 * Test0345.sFld) + f3) - i18);
                        case 39:
                            iArr2[i17] = (int) Test0345.lFld;
                            break;
                        }
                    }
                }
            } while (++i16 < 381);
        } else {
            Test0345.sFld = (short) Test0345.iFld;
        }
        long meth_res = Double.doubleToLongBits(d) + Float.floatToIntBits(f2) + i15 + i16 + i17 + i18 + i19 + i20 +
            Float.floatToIntBits(f3) + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i8, long l, int i9) {

        int i10=8223;
        int i11=28145;
        int i12=96;
        int i21=161;
        int i22=-34135;
        int i23=-10;
        int i24=-6;
        int i25=-2239;
        int[] iArr1 =new int[N];
        float f1=-30.795F;
        double d1=0.38427;
        byte by=-15;

        FuzzerUtils.init(iArr1, 196);

        i10 = 1;
        do {
            iArr1[i10] = Math.abs((int)(-(l - i10)));
        } while (++i10 < 295);
        for (i11 = 306; 17 < i11; i11 -= 2) {
            int i14=86;
            iArr1[i11] = (int) (((f1 + Test0345.lFld) * (Test0345.sFld + i14)) + iArr1[i11 + 1]);
            if (Test0345.bFld) {
                iArr1[i11] += (int)Long.reverseBytes(-(30575 - iMeth(d1, f1, i14)));
            }
        }
        i21 = 1;
        do {
            i8 += (i21 * i21);
            for (i22 = i21; i22 < 6; i22 += 3) {
                i8 += (i22 * i22);
                Test0345.bFld = true;
                i8 *= (int)76L;
                for (i24 = 1; i24 < 1; i24++) {
                    by *= (byte)d1;
                    Test0345.lFld -= i12;
                }
            }
        } while (++i21 < 252);
        vMeth_check_sum += i8 + l + i9 + i10 + i11 + i12 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d1) + i21
            + i22 + i23 + i24 + i25 + by + FuzzerUtils.checkSum(iArr1);
    }

    public static float fMeth(int i6, int i7) {

        int i26=-12, i27=22888, i28=-6, i29=213, i30=-206, i31=5679, i32=30779;
        float f4=-23.927F;
        short[] sArr1 =new short[N];

        FuzzerUtils.init(sArr1, (short)-29884);

        vMeth(i7, Test0345.lFld, i7);
        for (i26 = 1; i26 < 350; ++i26) {
            f4 -= Test0345.sFld;
            Test0345.sFld += (short) i26;
            i6 = -127;
            Test0345.iFld += i26;
            i6 = (int) Test0345.lFld;
        }
        i7 = -17;
        for (i28 = 5; i28 < 252; ++i28) {
            switch (((i30 >>> 1) % 2) + 126) {
            case 126:
                i6 = i28;
                i27 = 32628;
                for (i31 = 1; i31 < 7; i31++) {
                    sArr1[i28 + 1] *= (short) Test0345.instanceCount;
                    f4 = -10;
                }
            case 127:
                i32 -= -5964;
            default:
                i29 >>= (int) Test0345.instanceCount;
            }
        }
        long meth_res = i6 + i7 + i26 + i27 + Float.floatToIntBits(f4) + i28 + i29 + i30 + i31 + i32 +
            FuzzerUtils.checkSum(sArr1);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f=30.628F;
        int i=-22187;
        int i1=-191;
        int i2=-11;
        int i3=-10;
        int i4=-3;
        int i5=-13551;
        int i33=-9;
        int i34=41998;
        int i35=6;
        int i36=-14;
        int[] iArr =new int[N];
        double d2=0.51958;
        long[] lArr =new long[N];

        FuzzerUtils.init(iArr, -25805);
        FuzzerUtils.init(lArr, 3960312347L);

        f *= f;
        Test0345.instanceCount -= Test0345.iFld;
        for (i = 4; 171 > i; i++) {
            Test0345.iFld += (((i * f) + Test0345.iFld) - Test0345.sFld);
            Test0345.iFld = (Math.abs(i * i) << i);
            for (i2 = 2; 150 > i2; ++i2) {
                i3 += (i2 + Test0345.instanceCount);
                f *= i3;
                for (i4 = 1; i4 < 2; ++i4) {
                    Test0345.instanceCount = iArr[i - 1];
                    lArr[i4 - 1] -= (long) (1.78882 + (i2 + (-25 + fMeth(Test0345.iFld, -126))));
                    try {
                        i5 = (184 % i4);
                        iFld1 = (i2 % i);
                        Test0345.iFld = (152 / iArr[i2 - 1]);
                    } catch (ArithmeticException a_e) {}
                    i5 <<= (int) Test0345.lFld;
                    iFld1 -= (int)d2;
                    Test0345.lFld = i4;
                }
                i33 = 1;
                do {
                    try {
                        i1 = (1739511533 / i1);
                        iFld1 = (-21571 % Test0345.iFld);
                        i3 = (-759761359 % i33);
                    } catch (ArithmeticException a_e) {}
                    iFld1 += (int)(3548666876L + (i33 * i33));
                } while (++i33 < 2);
                Test0345.sFld -= (short) i1;
                Test0345.sFld /= (short) (Test0345.instanceCount | 1);
            }
            Test0345.iFld += (58134 + (i * i));
            Test0345.sFld -= (short) Test0345.instanceCount;
            d2 += Test0345.sFld;
        }
        iFld1 <<= (int) Test0345.lFld;
        i34 = 1;
        while (++i34 < 376) {
            for (i35 = 3; i35 < 67; i35++) {
                fArrFld[i35 + 1] += 16935;
                i1 &= (int) Test0345.instanceCount;
                i3 = (int) Test0345.instanceCount;
                iArr[i35 + 1] -= i34;
            }
        }

        FuzzerUtils.out.println("f i i1 = " + Float.floatToIntBits(f) + "," + i + "," + i1);
        FuzzerUtils.out.println("i2 i3 i4 = " + i2 + "," + i3 + "," + i4);
        FuzzerUtils.out.println("i5 d2 i33 = " + i5 + "," + Double.doubleToLongBits(d2) + "," + i33);
        FuzzerUtils.out.println("i34 i35 i36 = " + i34 + "," + i35 + "," + i36);
        FuzzerUtils.out.println("iArr lArr = " + FuzzerUtils.checkSum(iArr) + "," + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test0345.instanceCount Test0345.iFld Test0345.sFld = " + Test0345.instanceCount + "," + Test0345.iFld +
                "," + Test0345.sFld);
        FuzzerUtils.out.println("Test0345.lFld Test0345.bFld iFld1 = " + Test0345.lFld + "," + (Test0345.bFld ? 1 : 0) + "," + iFld1);
        FuzzerUtils.out.println("fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0345 _instance = new Test0345();
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
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}