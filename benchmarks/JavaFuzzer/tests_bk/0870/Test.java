// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:15 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3810832444L;
    public static boolean bFld=true;
    public static byte byFld=-95;
    public static double dFld=-1.128017;
    public volatile float fFld=-39.574F;
    public static volatile float fFld1=59.395F;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -2449790962L);
        FuzzerUtils.init(Test.iArrFld, 26897);
    }

    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long fMeth1_check_sum = 0;

    public static float fMeth1(int i4, int i5, int i6) {

        int i7=40797, i8=-181, i9=-9, i10=22, iArr[]=new int[N];
        double d=-120.54834;

        FuzzerUtils.init(iArr, -10);

        i5 += (int)Test.instanceCount;
        i6 = i5;
        i7 = 1;
        do {
            i8 = 7;
            while (--i8 > 0) {
                try {
                    i6 = (-28 / i6);
                    i4 = (i7 / 993236031);
                    i4 = (-161 / i4);
                } catch (ArithmeticException a_e) {}
                for (i9 = 1; 1 > i9; ++i9) {
                    Test.bFld = Test.bFld;
                    Test.instanceCount %= (Test.instanceCount | 1);
                    i5 = (int)d;
                    iArr[i9 + 1] = (int)d;
                    i4 += (i9 * i9);
                    i5 = i10;
                    if (true) {
                        i10 = 13;
                        try {
                            i5 = (i9 / -1123623463);
                            i4 = (iArr[i8] % -1);
                            iArr[i9] = (i5 % i10);
                        } catch (ArithmeticException a_e) {}
                    } else if (Test.bFld) {
                        Test.instanceCount += (i9 * i9);
                    }
                }
            }
        } while (++i7 < 228);
        long meth_res = i4 + i5 + i6 + i7 + i8 + i9 + i10 + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr);
        fMeth1_check_sum += meth_res;
        return (float)meth_res;
    }

    public static float fMeth(int i3) {

        float f=-3.834F, fArr[]=new float[N];
        int i11=10, i12=-246, i13=-58154, i14=35, i15=-111, i16=12, iArr1[]=new int[N];

        FuzzerUtils.init(fArr, 67.409F);
        FuzzerUtils.init(iArr1, 147);

        fMeth1(-60129, i3, i3);
        fArr[(i3 >>> 1) % N] = f;
        for (i11 = 5; 380 > i11; i11++) {
            Test.instanceCount ^= Test.byFld;
            Test.instanceCount += 9;
            for (i13 = i11; i13 < 5; ++i13) {
                i3 >>= (int)Test.instanceCount;
                i14 = i13;
                Test.instanceCount *= i3;
                i14 = i12;
                iArr1[i13] <<= (int)Test.instanceCount;
            }
            Test.instanceCount *= i3;
            for (i15 = 1; i15 < 5; ++i15) {
                i14 = (int)f;
            }
        }
        i3 -= i16;
        long meth_res = i3 + Float.floatToIntBits(f) + i11 + i12 + i13 + i14 + i15 + i16 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr1);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth(int i) {

        int i1=-32496, i2=-12, i17=14696, i18=-26531, i19=158, i20=-49736, i21=172, i22=7, i23=-62234;
        short s=-581;
        float f1=0.83F;

        for (i1 = 10; i1 < 353; i1++) {
            i2 >>= (int)((i2--) - fMeth(i1));
            for (i17 = 5; i17 > 1; --i17) {
                Test.instanceCount *= 60888L;
            }
            Test.instanceCount += (i1 * i1);
        }
        Test.dFld = i;
        for (i19 = 18; i19 < 370; i19++) {
            Test.lArrFld[i19 + 1] -= (long)1.573F;
            i20 = (int)Test.instanceCount;
            i21 = 1;
            while ((i21 += 3) < 5) {
                for (i22 = 1; 5 > i22; i22++) {
                    i20 = -12;
                    s += (short)(((i22 * i19) + Test.instanceCount) - i21);
                    f1 += (i22 - i);
                    i += i22;
                }
            }
        }
        vMeth_check_sum += i + i1 + i2 + i17 + i18 + i19 + i20 + i21 + i22 + i23 + s + Float.floatToIntBits(f1);
    }

    public void mainTest(String[] strArr1) {

        int i24=-11, i25=-58996, i26=-60338, i27=-12, i28=-38040, i29=-42561, i30=30040, i31=0, i32=36157, i33=-46234,
            i34=-6;
        short s1=-29032;
        boolean b=false;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)33);

        vMeth(i24);
        Test.lArrFld[(i24 >>> 1) % N] = i24;
        Test.lArrFld[(i24 >>> 1) % N] = Test.instanceCount;
        i25 = 1;
        while (++i25 < 259) {
            i26 = 1;
            do {
                Test.instanceCount = i26;
                Test.lArrFld[i25 + 1] += i26;
                for (i27 = 1; i27 < 1; i27++) {
                    Test.byFld += (byte)i27;
                    byArr[i26 + 1] = (byte)-9L;
                    s1 <<= (short)Test.instanceCount;
                    Test.iArrFld[i26] = i28;
                    i28 = i25;
                }
                if (Test.bFld) continue;
                for (i29 = 1; i29 < 1; i29++) {
                    if (b) {
                        i24 += i29;
                        i24 = i29;
                    }
                    fFld += (13878L + (i29 * i29));
                    i30 = i26;
                    i24 += (i29 * i29);
                }
                fFld = 47.912F;
            } while (++i26 < 97);
            i30 *= (int)10L;
            for (i31 = i25; i31 < 97; i31++) {
                Test.fFld1 += Test.instanceCount;
            }
            Test.iArrFld[i25 - 1] += (int)-6L;
            Test.lArrFld[i25] = Test.instanceCount;
            for (i33 = i25; i33 < 97; ++i33) {
                Test.fFld1 += i30;
                if (true) continue;
            }
        }

        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 i28 s1 = " + i27 + "," + i28 + "," + s1);
        FuzzerUtils.out.println("i29 i30 b = " + i29 + "," + i30 + "," + (b ? 1 : 0));
        FuzzerUtils.out.println("i31 i32 i33 = " + i31 + "," + i32 + "," + i33);
        FuzzerUtils.out.println("i34 byArr = " + i34 + "," + FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.byFld = " + Test.instanceCount + "," + (Test.bFld ?
            1 : 0) + "," + Test.byFld);
        FuzzerUtils.out.println("Test.dFld fFld Test.fFld1 = " + Double.doubleToLongBits(Test.dFld) + "," +
            Float.floatToIntBits(fFld) + "," + Float.floatToIntBits(Test.fFld1));
        FuzzerUtils.out.println("Test.lArrFld Test.iArrFld = " + FuzzerUtils.checkSum(Test.lArrFld) + "," +
            FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("fMeth1_check_sum: " + fMeth1_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  fMeth ->  fMeth vMeth mainTest
//DEBUG  fMeth1 ->  fMeth1 fMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}