// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:09 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-13L;
    public float fFld=2.260F;
    public static double dFld=0.46568;
    public static float fArrFld[]=new float[N];
    public static long lArrFld[]=new long[N];
    public int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 0.981F);
        FuzzerUtils.init(Test.lArrFld, 31408L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i10) {

        int i11=-168, i12=8662, i13=24005, i14=906, i15=31, i16=-14, i17=-23340, i18=-3930, i19=1425, i20=-114;
        float f3=-32.66F;

        for (i11 = 6; i11 < 233; ++i11) {
            for (i13 = i11; i13 < 7; i13++) {
                i12 |= i14;
            }
            for (i15 = 1; 7 > i15; i15++) {
                for (i17 = 1; i17 < 2; ++i17) {
                    Test.instanceCount *= i10;
                    if (i16 != 0) {
                        vMeth2_check_sum += i10 + i11 + i12 + i13 + i14 + i15 + i16 + i17 + i18 +
                            Float.floatToIntBits(f3) + i19 + i20;
                        return;
                    }
                    i12 <<= 51;
                    i12 += (int)f3;
                    f3 -= i18;
                }
                Test.lArrFld[i11 - 1] -= 41779;
                for (i19 = 1; 2 > i19; i19++) {
                    f3 -= (float)Test.dFld;
                    f3 = i12;
                    i16 = (int)Test.instanceCount;
                }
            }
        }
        vMeth2_check_sum += i10 + i11 + i12 + i13 + i14 + i15 + i16 + i17 + i18 + Float.floatToIntBits(f3) + i19 + i20;
    }

    public static void vMeth1(int i9, float f2) {

        int i21=30, i22=57, i23=60, i24=184, i25=-22839, i26=-6, iArr[]=new int[N];
        short s1=27341;
        byte by=-126;
        boolean b1=true;

        FuzzerUtils.init(iArr, 1);

        vMeth2(-98);
        Test.instanceCount += i9;
        Test.instanceCount ^= i9;
        for (i21 = 15; 317 > i21; ++i21) {
            iArr[i21] *= s1;
            i9 += (i21 - Test.instanceCount);
            if (b1) {
                for (i23 = 1; i23 < 5; i23++) {
                    iArr[i23 + 1] = -2159;
                }
            } else if (true) {
                by += (byte)(i21 * i23);
                Test.lArrFld[i21 + 1] = Test.instanceCount;
                for (i25 = 5; i25 > 1; i25--) {
                    f2 *= f2;
                    Test.lArrFld[i21] = -3214;
                    i22 += (((i25 * i9) + i26) - s1);
                }
                vMeth1_check_sum += i9 + Float.floatToIntBits(f2) + i21 + i22 + s1 + i23 + i24 + by + i25 + i26 + (b1 ?
                    1 : 0) + FuzzerUtils.checkSum(iArr);
                return;
            }
        }
        vMeth1_check_sum += i9 + Float.floatToIntBits(f2) + i21 + i22 + s1 + i23 + i24 + by + i25 + i26 + (b1 ? 1 : 0)
            + FuzzerUtils.checkSum(iArr);
    }

    public void vMeth(int i3) {

        int i4=-79, i5=-55, i6=-28538, i7=229, i8=-6, i27=9, i28=20418, i29=-78;
        boolean b=true;
        short s=-13675;
        float f1=-83.75F;

        for (i4 = 3; i4 < 154; i4++) {
            b = (((i5 * i5) + fFld) != ((i3 + -11) - (s - i4)));
            for (i6 = 1; i6 < 10; i6 += 3) {
                for (f1 = 1; f1 < 4; f1++) {
                    vMeth1(i7, fFld);
                    s = (short)Test.instanceCount;
                    Test.dFld = i27;
                    Test.instanceCount = (long)fFld;
                    iArrFld[(int)(f1 + 1)] *= i3;
                }
                i7 += (int)Test.instanceCount;
                i3 += (((i6 * f1) + Test.instanceCount) - i4);
                Test.instanceCount += i3;
            }
        }
        for (i28 = 7; 224 > i28; ++i28) {
            Test.instanceCount += i8;
            Test.lArrFld[i28 + 1] >>>= i6;
        }
        vMeth_check_sum += i3 + i4 + i5 + (b ? 1 : 0) + s + i6 + i7 + Float.floatToIntBits(f1) + i8 + i27 + i28 + i29;
    }

    public void mainTest(String[] strArr1) {

        int i=70, i1=52718, i2=65, i30=-31, i31=-26593, i32=167, i33=7, i34=211;
        float f=1.195F, f4=0.807F;
        boolean b2=false;
        short s2=24432;
        double d=-2.90334, dArr[][]=new double[N][N];

        FuzzerUtils.init(dArr, -99.58961);

        i = 1;
        do {
            f -= i;
            for (i1 = 4; i1 < 134; ++i1) {
                dArr[i + 1][i1] -= i;
                i2 += (i1 * i1);
                Test.fArrFld[i1 - 1] %= (Test.lArrFld[i1 + 1] | 1);
            }
            vMeth(i1);
            i2 = i;
            i2 += i2;
            iArrFld[i - 1] += i1;
            if (true) {
                if (b2) continue;
                iArrFld[i] = (int)Test.instanceCount;
            } else {
                i2 = i;
                i2 += i2;
                iArrFld[i] -= (int)Test.instanceCount;
            }
        } while (++i < 187);
        iArrFld[(i2 >>> 1) % N] += i2;
        Test.lArrFld[(i2 >>> 1) % N] = i;
        i30 = 1;
        while (++i30 < 368) {
            s2 += (short)(5019 + (i30 * i30));
        }
        for (d = 16; d < 363; ++d) {
            for (i32 = (int)(d); 73 > i32; ++i32) {
                i33 = (int)77L;
                try {
                    i2 = (i30 % -80);
                    i2 = (i30 % -29117);
                    i2 = (144 % i30);
                } catch (ArithmeticException a_e) {}
            }
            for (f4 = 73; 3 < f4; f4--) {
                i34 -= (int)Test.dFld;
                i33 += (int)f4;
                Test.lArrFld[(int)(d - 1)] = i34;
                f *= 37066;
                Test.instanceCount = i2;
            }
        }

        FuzzerUtils.out.println("i f i1 = " + i + "," + Float.floatToIntBits(f) + "," + i1);
        FuzzerUtils.out.println("i2 b2 i30 = " + i2 + "," + (b2 ? 1 : 0) + "," + i30);
        FuzzerUtils.out.println("s2 d i31 = " + s2 + "," + Double.doubleToLongBits(d) + "," + i31);
        FuzzerUtils.out.println("i32 i33 f4 = " + i32 + "," + i33 + "," + Float.floatToIntBits(f4));
        FuzzerUtils.out.println("i34 dArr = " + i34 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test.instanceCount fFld Test.dFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(fFld) + "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.fArrFld Test.lArrFld iArrFld = " +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," + FuzzerUtils.checkSum(Test.lArrFld) +
            "," + FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
