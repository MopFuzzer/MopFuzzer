// Generated by Java* Fuzzer test generator (1.0.001). Wed May 20 08:46:28 2020
public class Test {

    public static final int N = 400;

    public static long instanceCount=-7110117601766016560L;
    public static float fFld=0.611F;
    public static byte byFld=-70;
    public boolean bFld=false;
    public static int iFld=-46;
    public short sFld=31790;
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -8009);
    }

    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(float f1) {

        int i3=-5735;
        int i4=-11;
        int i5=29281;
        int i6=-6;
        int i7=187;
        int i8=-225;
        int i9=-35376;
        int[] iArr =new int[N];
        float[][] fArr =new float[N][N];

        FuzzerUtils.init(fArr, -17.477F);
        FuzzerUtils.init(iArr, 0);

        i3 &= -12707;
        fArr[(i3 >>> 1) % N] = fArr[(i3 >>> 1) % N];
        for (i4 = 11; 189 > i4; ++i4) {
            f1 = Test.instanceCount;
            iArr = iArr;
            iArr = iArr;
            i6 = 1;
            while (++i6 < 9) {
                i3 += (i6 - i6);
                switch ((i6 % 8) + 102) {
                case 102:
                case 103:
                    for (i7 = 1; i7 < 1; i7++) {
                        i5 += i7;
                        i5 >>= (int)-2973216040L;
                        i3 += i7;
                        i8 *= i7;
                        i9 = i9;
                    }
                case 104:
                    Test.instanceCount *= i9;
                case 105:
                    Test.instanceCount = i6;
                    break;
                case 106:
                    i5 *= i7;
                    break;
                case 107:
                    i9 -= i5;
                case 108:
                    i9 = i4;
                    break;
                case 109:
                    i3 = (int)f1;
                    break;
                }
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f1) + i3 + i4 + i5 + i6 + i7 + i8 + i9 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i, int i1, int i2) {

        float f2=99.850F;
        double d=-76.29400;
        int i10=0;
        int i11=238;
        int i12=-114;
        int i13=57931;
        int i14=-228;
        int i15=11;
        int[] iArr1 =new int[N];

        FuzzerUtils.init(iArr1, -11);

        vMeth1(f2);
        i2 += (int)d;
        iArr1[(i2 >>> 1) % N] -= i10;
        i10 >>= (int)Test.instanceCount;
        i += (int)f2;
        i10 -= i;
        i2 *= -7;
        i10 -= i1;
        for (i11 = 218; i11 > 10; i11--) {
            for (i13 = 8; 1 < i13; --i13) {
                boolean b1=false;
                i12 = (int)1.131F;
                i15 = 1;
                while (++i15 < 2) {
                    try {
                        i1 = (-223 / i10);
                        iArr1[i11 - 1] = (i2 % -18);
                        i14 = (-49678 / iArr1[i15 + 1]);
                    } catch (ArithmeticException a_e) {}
                }
                Test.instanceCount -= (long)f2;
                if (b1) break;
            }
        }
        vMeth_check_sum += i + i1 + i2 + Float.floatToIntBits(f2) + Double.doubleToLongBits(d) + i10 + i11 + i12 + i13
            + i14 + i15 + FuzzerUtils.checkSum(iArr1);
    }

    public static float fMeth(boolean b) {

        int i16=2, i17=95, i18=-13, i19=-203, i20=-144, i21=-19590, i22=11;
        short s=-2676;
        float[] fArr1 =new float[N];
        long[] lArr =new long[N];

        FuzzerUtils.init(fArr1, 37.179F);
        FuzzerUtils.init(lArr, 4713586770598379189L);

        vMeth(i16, i16, i17);
        fArr1[(-148 >>> 1) % N] += -6042;
        for (i18 = 10; i18 < 359; i18++) {
            for (i20 = i18; i20 < 5; i20++) {
                i19 += (i20 + i16);
                i19 += i19;
                Test.fFld *= Test.instanceCount;
                lArr[i20] *= i19;
                i21 += 11632;
                Test.instanceCount += (i20 * i20);
                i19 += i17;
                i22 = 1;
                while (++i22 < 1) {
                    s = (short)1.75090;
                    Test.iArrFld[i22 - 1] += 6;
                    Test.byFld >>>= (byte)i16;
                }
            }
        }
        long meth_res = (b ? 1 : 0) + i16 + i17 + i18 + i19 + i20 + i21 + i22 + s +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + FuzzerUtils.checkSum(lArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f=0.423F;
        float[] fArr2 =new float[N];
        int i23=3, i24=-49, i25=7, i26=0, i27=-145, i28=-234, i29=-11, i30=-1, i31=-57941, i32=7, i33=-159, i34=-8;
        double d1=29.25878;
        double[] dArr =new double[N];

        FuzzerUtils.init(dArr, 84.86690);
        FuzzerUtils.init(fArr2, 2.937F);

        f = fMeth(bFld);
        for (i23 = 16; 350 > i23; i23++) {
            for (i25 = 1; i25 < 75; i25 += 2) {
                i26 = i24;
                for (i27 = 1; 3 > i27; i27++) {
                    i28 *= (int)Test.instanceCount;
                    Test.instanceCount *= i25;
                    Test.instanceCount = i25;
                    try {
                        Test.iArrFld[i23 - 1] = (Test.iArrFld[i23 + 1] % 71);
                        i26 = (i27 / 23678);
                        i28 = (Test.iArrFld[i23 + 1] / i24);
                    } catch (ArithmeticException a_e) {}
                    Test.iFld += i27;
                }
                f += (i25 * i28);
                i28 += (((i25 * i27) + i28) - i28);
                i26 = i25;
                try {
                    i24 = (i26 / 148);
                    Test.iFld = (i26 / 113812069);
                    i26 = (i28 / -157);
                } catch (ArithmeticException a_e) {}
                if (bFld) break;
                dArr[i25 - 1] = d1;
            }
            for (i29 = 75; i29 > i23; --i29) {
                Test.iArrFld[i23] -= (int)Test.instanceCount;
                Test.iArrFld[i29 + 1] = (int)-1.125193;
                fArr2[i29] += i26;
            }
            for (i31 = 4; i31 < 75; i31++) {
                f -= Test.fFld;
                Test.instanceCount = sFld;
            }
            switch ((i23 % 8) + 27) {
            case 27:
                if (bFld) {
                    for (i33 = 1; i33 < 75; ++i33) {
                        Test.instanceCount |= i32;
                        Test.instanceCount = 16423;
                        i28 <<= -126;
                        Test.instanceCount += Test.instanceCount;
                    }
                } else {
                    d1 -= i24;
                }
                break;
            case 28:
                Test.iArrFld[i23] = i28;
            case 29:
                d1 = Test.iFld;
                break;
            case 30:
                Test.instanceCount = i31;
                break;
            case 31:
                if (bFld) break;
            case 32:
                i32 += -186;
                break;
            case 33:
            case 34:
                Test.instanceCount -= (long)d1;
                break;
            }
        }

        FuzzerUtils.out.println("f i23 i24 = " + Float.floatToIntBits(f) + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("i28 d1 i29 = " + i28 + "," + Double.doubleToLongBits(d1) + "," + i29);
        FuzzerUtils.out.println("i30 i31 i32 = " + i30 + "," + i31 + "," + i32);
        FuzzerUtils.out.println("i33 i34 dArr = " + i33 + "," + i34 + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));
        FuzzerUtils.out.println("fArr2 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr2)));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.byFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.byFld);
        FuzzerUtils.out.println("bFld Test.iFld sFld = " + (bFld ? 1 : 0) + "," + Test.iFld + "," + sFld);
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}