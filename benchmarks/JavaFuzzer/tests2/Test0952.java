// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:56 2023
public class Test0952 {

    public static final int N = 400;

    public static long instanceCount=48L;
    public double dFld=-2.118964;
    public static double dFld1=-51.25689;
    public byte byFld=-5;
    public static double[] dArrFld =new double[N];
    public static byte[] byArrFld =new byte[N];

    static {
        FuzzerUtils.init(Test0952.dArrFld, -126.91165);
        FuzzerUtils.init(Test0952.byArrFld, (byte) 15);
    }

    public static long iMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        int i10=40494;
        int i11=69;
        int i12=4;
        int i13=5;
        int i14=8;
        int i15=-54;
        int i16=-5;
        int i17=29958;
        int i18=-107;
        int[][] iArr2 =new int[N][N];
        byte by=81;
        double d=-83.124454;
        long[] lArr =new long[N];

        FuzzerUtils.init(iArr2, -28825);
        FuzzerUtils.init(lArr, -4266651989L);

        i10 = 221;
        do {
            by = (byte)i10;
            i11 = 1;
            while (++i11 < 21) {
                i12 = i12;
                for (i13 = 1; i13 < 1; i13 += 2) {
                    i15 += i13;
                }
                i12 <<= i13;
                i14 = i15;
                iArr2[i10][i11 + 1] += i15;
                for (i16 = 1; 1 > i16; ++i16) {
                    d = by;
                    i14 += i11;
                    try {
                        i18 = (i12 % -1401873252);
                        iArr2[i11 - 1][(i12 >>> 1) % N] = (i11 % i15);
                        i14 = (i13 % i12);
                    } catch (ArithmeticException a_e) {}
                    Test0952.instanceCount -= i11;
                    lArr[i16 - 1] -= by;
                }
            }
        } while ((i10 -= 3) > 0);
        vMeth_check_sum += i10 + by + i11 + i12 + i13 + i14 + i15 + i16 + i17 + Double.doubleToLongBits(d) + i18 +
            FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(lArr);
    }

    public static double dMeth() {

        int i9=-9;
        int i19=169;
        int i20=11;
        int i21=2;
        int i22=-44928;
        int[] iArr3 =new int[N];
        float f=-1.355F;
        short s=-23943;
        long l=11L;
        long l1=-4714L;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(iArr3, -4);
        FuzzerUtils.init(lArr1, 2337L);

        i9 *= (int)(((f + s) * f) + (Math.max(i9, 233) - i9));
        Test0952.dArrFld[(-10 >>> 1) % N] += Test0952.instanceCount;
        vMeth();
        Test0952.dArrFld = Test0952.dArrFld;
        i19 = 1;
        do {
            i9 = 164;
            iArr3[i19] += i19;
        } while (++i19 < 260);
        for (l = 11; l < 223; ++l) {
            l1 <<= i19;
        }
        lArr1[(i20 >>> 1) % N] += i20;
        for (i21 = 4; i21 < 215; ++i21) {
            i9 = i22;
            i9 += (((i21 * i19) + l1) - f);
            i20 += (i21 * i21);
            Test0952.instanceCount += (i21 * i21);
        }
        long meth_res = i9 + Float.floatToIntBits(f) + s + i19 + l + i20 + l1 + i21 + i22 + FuzzerUtils.checkSum(iArr3)
            + FuzzerUtils.checkSum(lArr1);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static int iMeth(int i4) {

        int i5=-5;
        int i6=12;
        int i7=76;
        int i8=-174;
        int[] iArr1 =new int[N];
        boolean b=false;
        short s1=29680;
        byte by1=-58;

        FuzzerUtils.init(iArr1, -62121);

        for (i5 = 172; i5 > 9; --i5) {
            for (i7 = 1; 10 > i7; i7++) {
                i4 += i7;
                iArr1[i5] -= (-iArr1[i7 - 1]);
                switch (((0 >>> 1) % 7) + 41) {
                case 41:
                    i4 <<= iArr1[i7];
                    b = ((i4 = (i8++)) > dMeth());
                    switch ((((4 >>> 1) % 5) * 5) + 46) {
                    case 51:
                        Test0952.instanceCount += s1;
                        i6 += (int) Test0952.instanceCount;
                        break;
                    case 64:
                        Test0952.instanceCount = i7;
                        Test0952.instanceCount >>= i4;
                        break;
                    case 67:
                        iArr1[(i6 >>> 1) % N] = (int) Test0952.instanceCount;
                        i4 += by1;
                        Test0952.dFld1 = i6;
                        break;
                    case 52:
                        Test0952.instanceCount -= i4;
                        break;
                    case 70:
                        Test0952.instanceCount = i4;
                        break;
                    }
                    break;
                case 42:
                    iArr1[i5 - 1] = i6;
                    break;
                case 43:
                    i6 += (int)41.117F;
                    break;
                case 44:
                    i8 -= i6;
                case 45:
                    i8 = i4;
                    break;
                case 46:
                    i6 += (((i7 * i4) + i6) - i5);
                    break;
                case 47:
                    i6 *= i8;
                    break;
                }
            }
        }
        long meth_res = i4 + i5 + i6 + i7 + i8 + (b ? 1 : 0) + s1 + by1 + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-5;
        int i1=10936;
        int i2=44123;
        int i3=-11;
        int i23=-13;
        int i24=-226;
        int i25=153;
        int i26=6;
        int i27=-130;
        int i28=55267;
        int i29=-52579;
        int i30=-3182;
        int i31=675;
        int i32=-9;
        int[][] iArr =new int[N][N];
        float f1=31.610F;
        double d1=1.6619;
        short s2=15537;
        short[][] sArr =new short[N][N];

        FuzzerUtils.init(iArr, -95);
        FuzzerUtils.init(sArr, (short)-15692);

        for (i = 18; i < 394; ++i) {
            try {
                i1 = (i1 / 51060);
                i1 = (i / i);
                i1 = (i1 / i1);
            } catch (ArithmeticException a_e) {}
            for (i2 = 2; 67 > i2; i2++) {
                i1 *= (--i3);
                i3 <<= (int)(-((dFld * -67) - i2));
                Test0952.dArrFld[i2 - 1] -= (iArr[i + 1][i2 - 1]++);
                sArr[i][i2 + 1] >>= (short)iMeth(19);
            }
            for (i23 = 2; i23 < 67; ++i23) {
                i1 += i23;
                i25 = 1;
                while (++i25 < 2) {
                    i24 = (int) Test0952.instanceCount;
                }
                Test0952.instanceCount -= Test0952.instanceCount;
                iArr[i][i] *= (int) Test0952.instanceCount;
                f1 += (162 + (i23 * i23));
                for (i26 = 1; 2 > i26; ++i26) {
                    f1 -= (float)d1;
                    i24 = (int)f1;
                    Test0952.instanceCount -= 1;
                    i24 = i;
                }
                for (i28 = 1; i28 < 2; ++i28) {
                    try {
                        i24 = (i / 216);
                        i29 = (i / i27);
                        i1 = (i24 / 29777);
                    } catch (ArithmeticException a_e) {}
                    i24 += (i28 | s2);
                    i3 += i26;
                    i3 = s2;
                }
            }
            i30 = 1;
            do {
                Test0952.instanceCount *= Test0952.instanceCount;
                f1 -= Test0952.instanceCount;
            } while (++i30 < 67);
            for (i31 = 1; i31 < 67; i31++) {
                Test0952.byArrFld[i - 1] = byFld;
            }
            byFld += (byte)-16;
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i23 i24 = " + i3 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 f1 i26 = " + i25 + "," + Float.floatToIntBits(f1) + "," + i26);
        FuzzerUtils.out.println("i27 d1 i28 = " + i27 + "," + Double.doubleToLongBits(d1) + "," + i28);
        FuzzerUtils.out.println("i29 s2 i30 = " + i29 + "," + s2 + "," + i30);
        FuzzerUtils.out.println("i31 i32 iArr = " + i31 + "," + i32 + "," + FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println("sArr = " + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test0952.instanceCount dFld Test0952.dFld1 = " + Test0952.instanceCount + "," +
                Double.doubleToLongBits(dFld) + "," + Double.doubleToLongBits(Test0952.dFld1));
        FuzzerUtils.out.println("byFld Test0952.dArrFld Test0952.byArrFld = " + byFld + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0952.dArrFld)) + "," + FuzzerUtils.checkSum(Test0952.byArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0952 _instance = new Test0952();
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
//DEBUG  dMeth ->  dMeth iMeth mainTest
//DEBUG  vMeth ->  vMeth dMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
