// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:14 2023
public class Test0054 {

    public static final int N = 400;

    public static volatile long instanceCount=-20734L;
    public static int iFld=3;
    public static boolean bFld=false;
    public static volatile int iFld1=-2;
    public static int iFld2=-14;
    public static volatile double[] dArrFld =new double[N];
    public static int[] iArrFld =new int[N];
    public static long[] lArrFld =new long[N];
    public float[] fArrFld =new float[N];

    static {
        FuzzerUtils.init(Test0054.dArrFld, -49.59793);
        FuzzerUtils.init(Test0054.iArrFld, -79);
        FuzzerUtils.init(Test0054.lArrFld, 46L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(byte by, int i2) {

        int i3=-3, i4=13, i5=1, i6=184, i7=51616, i8=52547;
        boolean b=false;
        float f=-70.656F;
        float[] fArr =new float[N];
        short s=-27216;
        double d=-1.79978;

        FuzzerUtils.init(fArr, 72.899F);

        i2 = i2;
        for (i3 = 13; i3 < 282; ++i3) {
            i4 *= i3;
            switch ((i3 % 6) + 31) {
            case 31:
                for (i5 = 1; 6 > i5; i5++) {
                    i2 ^= i3;
                    if (b) continue;
                    i4 |= i3;
                    f += i4;
                    i6 += i5;
                    f += i4;
                    Test0054.iArrFld[i3] = -36;
                    for (i7 = 1; i7 < 2; i7++) {
                        i8 += (int) Test0054.instanceCount;
                        fArr[i7] -= s;
                    }
                }
                break;
            case 32:
            case 33:
                Test0054.iFld += i2;
                break;
            case 34:
                i6 ^= (int) Test0054.instanceCount;
                break;
            case 35:
                i8 += Test0054.iFld;
            case 36:
                i2 = i8;
                break;
            default:
                d *= i5;
            }
        }
        vMeth1_check_sum += by + i2 + i3 + i4 + i5 + i6 + (b ? 1 : 0) + Float.floatToIntBits(f) + i7 + i8 + s +
            Double.doubleToLongBits(d) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth(int i1) {

        byte by1=-126;
        int i9=-32437, i10=7, i11=-207, i12=43887, i13=205, i14=-13;
        double d1=0.46661;
        float f1=86.374F;

        vMeth1(by1, -21682);
        Test0054.lArrFld[(65 >>> 1) % N] *= -8;
        for (i9 = 13; i9 < 221; i9++) {
            for (i11 = 1; i11 < 8; ++i11) {
                Test0054.instanceCount += (((i11 * i12) + i10) - Test0054.instanceCount);
                i10 *= i10;
                for (i13 = 1; i13 < 2; ++i13) {
                    Test0054.bFld = Test0054.bFld;
                    try {
                        i12 = (-1728310913 % i9);
                        i14 = (i14 / -35299);
                        Test0054.iArrFld[i9 - 1] = (-134 / i14);
                    } catch (ArithmeticException a_e) {}
                    switch (((-4 >>> 1) % 2) + 10) {
                    case 10:
                        Test0054.instanceCount += i11;
                        by1 += (byte)-3;
                        break;
                    case 11:
                        d1 = i13;
                        break;
                    default:
                        try {
                            i12 = (i1 % Test0054.iFld);
                            i10 = (-5062 / Test0054.iArrFld[i9 + 1]);
                            i14 = (-188 / i1);
                        } catch (ArithmeticException a_e) {}
                        f1 = Test0054.instanceCount;
                    }
                }
            }
        }
        vMeth_check_sum += i1 + by1 + i9 + i10 + i11 + i12 + i13 + i14 + Double.doubleToLongBits(d1) +
            Float.floatToIntBits(f1);
    }

    public static int iMeth(int i) {

        int i15=-37244, i16=-24477, i17=-7165, i18=-18530, i19=-11, i20=-11;
        float f3=-99.621F, f4=0.127F;
        double d2=2.94637;

        vMeth(i);
        for (i15 = 7; i15 < 131; ++i15) {
            short s1=25541;
            for (i17 = 1; i17 < 13; i17++) {
                float f2=0.89F;
                f2 -= Test0054.iFld;
                i16 += (i17 * i17);
            }
            if (Test0054.bFld) break;
            s1 += (short)(i15 * i17);
            for (i19 = i15; 13 > i19; ++i19) {
                byte by2=-90;
                if (Test0054.bFld) break;
                by2 &= (byte)i15;
                switch (((i19 % 8) * 5) + 4) {
                case 28:
                    f3 *= (float)d2;
                    f4 -= i;
                    Test0054.iArrFld[i15 + 1] = i19;
                    break;
                case 26:
                    try {
                        i16 = (-42 % i18);
                        i = (i20 % -29876);
                        i16 = (i17 % i16);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 7:
                    try {
                        i18 = (i % i19);
                        i18 = (40 % i19);
                        i = (i15 % Test0054.iArrFld[i15]);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 29:
                    i18 += (-148 + (i19 * i19));
                case 36:
                    i20 -= (int) Test0054.instanceCount;
                    break;
                case 37:
                    Test0054.iFld = (int) Test0054.instanceCount;
                    break;
                case 23:
                    Test0054.instanceCount >>= s1;
                    break;
                case 5:
                    i16 = i20;
                    break;
                }
            }
        }
        long meth_res = i + i15 + i16 + i17 + i18 + i19 + i20 + Float.floatToIntBits(f3) + Double.doubleToLongBits(d2)
            + Float.floatToIntBits(f4);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i21=-59174;
        int i22=-89;
        int i23=-43003;
        int i24=5;
        int i25=-2;
        int i26=-9070;
        int i27=11;
        int i28=-46514;
        int i29=-160;
        int[] iArr =new int[N];
        float f5=-2.319F;
        short s2=3656;
        long l=-39L;
        long l1=2779910472L;
        long[][] lArr =new long[N][N];
        double d3=11.122386;
        byte by3=86;

        FuzzerUtils.init(lArr, 2095608779007222700L);
        FuzzerUtils.init(iArr, 37870);

        Test0054.iFld = (int) ((Test0054.dArrFld[(Test0054.iFld >>> 1) % N] + (-Test0054.instanceCount)) - iMeth(Test0054.iFld));
        for (i21 = 4; i21 < 208; ++i21) {
            i22 >>= (int) Test0054.instanceCount;
            f5 += (i21 * i21);
            for (i23 = 3; i23 < 123; ++i23) {
                s2 += (short)(((i23 * i23) + i21) - i22);
                for (l = 1; l < 2; ++l) {
                    i25 -= i23;
                    i24 = (int)f5;
                    Test0054.iArrFld[(i23 >>> 1) % N] += i24;
                    fArrFld[(int)(l + 1)] -= i24;
                    Test0054.iArrFld[i21 - 1] *= i21;
                }
                for (i26 = 2; i26 > i23; i26 -= 2) {
                    switch (i23 + 6) {
                    case 6:
                        i24 >>= i24;
                        Test0054.iFld += (int) f5;
                        i24 = i25;
                        break;
                    case 7:
                        Test0054.instanceCount += (i26 * i26);
                        Test0054.iArrFld[i23 - 1] <<= s2;
                        i22 *= 207;
                        Test0054.instanceCount += (i26 * i25);
                        break;
                    case 8:
                        Test0054.bFld = Test0054.bFld;
                        break;
                    case 9:
                    case 10:
                        Test0054.lArrFld[i26] -= Test0054.instanceCount;
                        Test0054.lArrFld[i26 + 1] += Test0054.iFld1;
                        d3 = i27;
                    case 11:
                        Test0054.instanceCount += by3;
                        break;
                    case 12:
                        lArr = lArr;
                        Test0054.instanceCount += Test0054.iFld2;
                    case 13:
                        i24 += (i26 - Test0054.iFld2);
                        Test0054.lArrFld[i23] += by3;
                        break;
                    case 14:
                        Test0054.instanceCount += (long) f5;
                        break;
                    case 15:
                        Test0054.iArrFld[i21] += i25;
                    case 16:
                        Test0054.iArrFld[i26] = i28;
                        break;
                    case 17:
                        fArrFld[i26] = l;
                        break;
                    case 18:
                        Test0054.iArrFld[i21] <<= i23;
                        break;
                    case 19:
                        Test0054.iArrFld[i21] -= (int) f5;
                        break;
                    case 20:
                        d3 *= d3;
                    case 21:
                        Test0054.iFld1 = Test0054.iFld1;
                        break;
                    case 22:
                        i25 = -93;
                        break;
                    case 23:
                        lArr[i23 + 1][i23] = s2;
                    case 24:
                        i25 = (int)d3;
                    case 25:
                        i28 += (i26 - i26);
                        break;
                    case 26:
                        Test0054.iFld += (((i26 * i21) + Test0054.instanceCount) - i26);
                        break;
                    case 27:
                        Test0054.iFld1 += i26;
                        break;
                    case 28:
                        i28 += (i26 ^ (long)f5);
                    case 29:
                        Test0054.instanceCount >>>= -14;
                        break;
                    case 30:
                        i28 ^= (int) Test0054.instanceCount;
                    case 31:
                        i25 += (i26 * i26);
                        break;
                    case 32:
                    case 33:
                        Test0054.instanceCount = -5802;
                        break;
                    case 34:
                        Test0054.iFld2 = (int) l;
                    case 35:
                        d3 -= i25;
                        break;
                    case 36:
                        if (Test0054.bFld) break;
                        break;
                    case 37:
                        Test0054.iFld1 -= (int) d3;
                        break;
                    case 38:
                    case 39:
                        i24 *= i26;
                        break;
                    case 40:
                        i27 *= i28;
                        break;
                    case 41:
                        Test0054.instanceCount &= l;
                    case 42:
                        Test0054.lArrFld = lArr[i26];
                    case 43:
                        try {
                            i22 = (i21 % i21);
                            i28 = (i22 % Test0054.iFld2);
                            i27 = (Test0054.iFld / -73);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 44:
                        Test0054.iFld2 += i26;
                        break;
                    case 45:
                        i27 *= i28;
                        break;
                    case 46:
                        Test0054.iArrFld[i23] >>= Test0054.iFld1;
                        break;
                    case 47:
                        try {
                            Test0054.iArrFld[i23 - 1] = (i27 / 621124908);
                            i27 = (20664 % i27);
                            Test0054.iFld1 = (1285 / Test0054.iArrFld[i21]);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 48:
                        iArr[i21 + 1] -= i25;
                        break;
                    case 49:
                        i24 <<= -13006;
                        break;
                    case 50:
                        Test0054.iArrFld[i21 - 1] -= i27;
                        break;
                    case 51:
                        i27 = (int)l;
                    case 52:
                        i28 = i25;
                        break;
                    case 53:
                        by3 *= (byte)i26;
                    case 54:
                        Test0054.iFld2 = i22;
                        break;
                    case 55:
                        Test0054.iFld <<= i21;
                        break;
                    case 56:
                        i29 += (i26 + i26);
                        break;
                    case 57:
                        iArr[i23 + 1] -= Test0054.iFld2;
                        break;
                    case 58:
                        Test0054.bFld = Test0054.bFld;
                        break;
                    case 59:
                        f5 = l;
                        break;
                    case 60:
                        i29 = Test0054.iFld;
                    case 61:
                        if (Test0054.bFld) break;
                    case 62:
                        Test0054.instanceCount += i25;
                    case 63:
                        s2 = (short)d3;
                    case 64:
                        by3 = (byte)d3;
                        break;
                    case 65:
                        Test0054.iFld = Test0054.iFld;
                        break;
                    case 66:
                        f5 += i26;
                        break;
                    case 67:
                        if (Test0054.bFld) break;
                    case 68:
                        l1 += i26;
                    case 69:
                        Test0054.iFld = i23;
                        break;
                    case 70:
                        f5 += ((long)i26 ^ (long)i24);
                        break;
                    case 71:
                        i22 <<= i21;
                        break;
                    case 72:
                        Test0054.iArrFld[i21] -= (int) Test0054.instanceCount;
                        break;
                    case 73:
                        i25 -= (int) Test0054.instanceCount;
                        break;
                    case 74:
                        f5 = Test0054.iFld;
                    case 75:
                        i22 -= (int)f5;
                        break;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i21 i22 f5 = " + i21 + "," + i22 + "," + Float.floatToIntBits(f5));
        FuzzerUtils.out.println("i23 i24 s2 = " + i23 + "," + i24 + "," + s2);
        FuzzerUtils.out.println("l i25 i26 = " + l + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 d3 by3 = " + i27 + "," + Double.doubleToLongBits(d3) + "," + by3);
        FuzzerUtils.out.println("i28 i29 l1 = " + i28 + "," + i29 + "," + l1);
        FuzzerUtils.out.println("lArr iArr = " + FuzzerUtils.checkSum(lArr) + "," + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test0054.instanceCount Test0054.iFld Test0054.bFld = " + Test0054.instanceCount + "," + Test0054.iFld +
                "," + (Test0054.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0054.iFld1 Test0054.iFld2 Test0054.dArrFld = " + Test0054.iFld1 + "," + Test0054.iFld2 + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0054.dArrFld)));
        FuzzerUtils.out.println("Test0054.iArrFld Test0054.lArrFld fArrFld = " + FuzzerUtils.checkSum(Test0054.iArrFld) + "," +
                FuzzerUtils.checkSum(Test0054.lArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0054 _instance = new Test0054();
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