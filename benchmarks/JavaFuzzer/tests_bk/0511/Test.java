// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:06 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-186L;
    public static short sFld=6701;
    public float fFld=-59.707F;
    public static volatile int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -51140);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(int i2, long l, float f1) {

        int i3=-35011, i4=143, i5=13, i6=1;
        boolean b1=false;
        double dArr[][]=new double[N][N];

        FuzzerUtils.init(dArr, -37.126778);

        l >>= i2;
        i3 = 229;
        do {
            i2 += (((i3 * f1) + f1) - i3);
            i2 += i2;
            for (i4 = 1; i4 < 7; i4++) {
                switch (((i4 % 2) * 5) + 4) {
                case 11:
                    l += (i4 - i5);
                case 9:
                    try {
                        Test.iArrFld[i3] = (-37588 % i3);
                        i5 = (i2 / i2);
                        i5 = (i3 % -5758);
                    } catch (ArithmeticException a_e) {}
                    Test.iArrFld[(i3 >>> 1) % N] = i2;
                    i6 = 1;
                    do {
                        f1 += f1;
                        dArr[i3 - 1][i6 + 1] += i2;
                        Test.instanceCount += (((i6 * i2) + i3) - i2);
                        i2 <<= i5;
                    } while (++i6 < 2);
                    b1 = b1;
                    break;
                }
            }
        } while (--i3 > 0);
        long meth_res = i2 + l + Float.floatToIntBits(f1) + i3 + i4 + i5 + i6 + (b1 ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth1(float f, boolean b) {

        int i=18550, i1=-60045, i7=-1690, i8=30878, i9=0, i10=-176, i11=8, i12=-65434;

        for (i = 15; 391 > i; ++i) {
            fMeth(i, Test.instanceCount, f);
            i1 += (((i * Test.instanceCount) + i) - i);
            for (i7 = 1; i7 < 4; ++i7) {
                i8 = -2537;
                if (b) break;
            }
            for (i9 = 1; i9 < 4; i9++) {
                for (i11 = 2; i11 > 1; i11 -= 3) {
                    if (b) {
                        Test.instanceCount = Test.instanceCount;
                        Test.iArrFld[i + 1] = i9;
                    }
                    i12 %= (int)-2.162F;
                    f = i1;
                    i12 <<= i;
                    Test.instanceCount = i7;
                }
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f) + (b ? 1 : 0) + i + i1 + i7 + i8 + i9 + i10 + i11 + i12;
    }

    public static void vMeth() {

        float f2=-60.741F;
        boolean b2=true;
        int i13=-2, i14=-42;

        vMeth1(f2, b2);
        Test.instanceCount += i13;
        i14 = 1;
        while (++i14 < 249) {
            i13 -= i13;
        }
        vMeth_check_sum += Float.floatToIntBits(f2) + (b2 ? 1 : 0) + i13 + i14;
    }

    public void mainTest(String[] strArr1) {

        int i15=249, i16=12, i17=-47709, i18=-6, i19=-73, i20=175, i21=53992, i22=6, i23=22, i24=-19046, i25=29;
        boolean b3=false, bArr[]=new boolean[N];
        double d=-2.55993;
        byte byArr[]=new byte[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(byArr, (byte)-18);
        FuzzerUtils.init(lArr, 11L);

        vMeth();
        for (i15 = 5; i15 < 142; i15++) {
            if (b3) break;
        }
        Test.instanceCount = -143;
        i16 = -242;
        for (i17 = 7; i17 < 195; ++i17) {
            for (i19 = 7; 133 > i19; i19++) {
                bArr[i17] = b3;
            }
            for (i21 = 6; i21 < 133; ++i21) {
                double d1=76.13545;
                Test.sFld += Test.sFld;
                Test.iArrFld[i17] >>= i18;
                for (d = 1; d < 2; d++) {
                    byArr[i17] += (byte)i20;
                    i23 *= (int)fFld;
                }
                fFld = i20;
                i16 *= (int)fFld;
                d1 += Test.instanceCount;
                Test.instanceCount = (long)fFld;
            }
            i23 -= -6;
        }
        for (i24 = 2; i24 < 156; i24++) {
            i25 += (int)d;
            i25 -= (int)fFld;
            i23 *= i16;
            if (b3) continue;
            Test.instanceCount += (i24 | Test.instanceCount);
            i25 = -156;
            Test.instanceCount += i24;
            lArr = FuzzerUtils.long1array(N, (long)-38262L);
            Test.instanceCount <<= i21;
            fFld += (i24 * i24);
        }

        FuzzerUtils.out.println("i15 i16 b3 = " + i15 + "," + i16 + "," + (b3 ? 1 : 0));
        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("d i23 i24 = " + Double.doubleToLongBits(d) + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 bArr byArr = " + i25 + "," + FuzzerUtils.checkSum(bArr) + "," +
            FuzzerUtils.checkSum(byArr));
        FuzzerUtils.out.println("lArr = " + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld fFld = " + Test.instanceCount + "," + Test.sFld + "," +
            Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  fMeth ->  fMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
