// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:01 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-215L;
    public static float fFld=2.536F;
    public static boolean bFld=true;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];
    public float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 59);
        FuzzerUtils.init(Test.lArrFld, 0L);
    }

    public static long dMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long dMeth1_check_sum = 0;

    public static double dMeth1(int i9, float f, long l) {

        int i10=10, i11=-33, i12=4, i13=-239, i14=241;
        double d=0.24059;
        short s=15333;

        i10 += i10;
        i10 = (int)Test.instanceCount;
        i11 = 1;
        while (++i11 < 280) {
            for (i12 = i11; i12 < 6; i12++) {
                d += s;
                i14 = 1;
                while (++i14 < 1) {
                    byte by=72;
                    i9 *= 9;
                    l += i11;
                    if (true) break;
                    l += by;
                    switch ((i12 % 6) + 36) {
                    case 36:
                        by += (byte)5340031993260494602L;
                        l += (i14 * i14);
                        break;
                    case 37:
                        i10 += (int)Test.instanceCount;
                        i13 = 6;
                        break;
                    case 38:
                        i13 += i14;
                        break;
                    case 39:
                        i10 = (int)Test.instanceCount;
                        break;
                    case 40:
                        i13 += i14;
                        break;
                    case 41:
                        i13 &= s;
                        break;
                    }
                }
            }
        }
        long meth_res = i9 + Float.floatToIntBits(f) + l + i10 + i11 + i12 + i13 + Double.doubleToLongBits(d) + s + i14;
        dMeth1_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth(int i8) {

        int i15=-57097, i16=232, i17=-42, i18=140;
        boolean b1=true;
        byte by1=38;

        dMeth1(i8, Test.fFld, Test.instanceCount);
        for (i15 = 5; i15 < 219; ++i15) {
            i16 = i8;
            i8 *= (int)Test.instanceCount;
            for (i17 = 1; i17 < 8; ++i17) {
                Test.iArrFld[i17 - 1] = i15;
                Test.fFld += i17;
                if (i8 != 0) {
                    vMeth_check_sum += i8 + i15 + i16 + i17 + i18 + (b1 ? 1 : 0) + by1;
                    return;
                }
                if (b1) {
                    i8 %= (int)61406L;
                    try {
                        i16 = (i16 % i17);
                        i16 = (Test.iArrFld[i17 + 1] / -39212);
                        Test.iArrFld[i17 + 1] = (-177 / i18);
                    } catch (ArithmeticException a_e) {}
                    i8 -= (int)Test.instanceCount;
                    Test.lArrFld[i15 - 1] = i18;
                } else {
                    Test.fFld += i15;
                    i8 += by1;
                }
            }
        }
        vMeth_check_sum += i8 + i15 + i16 + i17 + i18 + (b1 ? 1 : 0) + by1;
    }

    public static double dMeth() {

        int i5=146, i6=15214, i7=-30842, i19=35460, i20=0;
        double d1=0.67994;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -2.198F);

        Test.instanceCount |= (Test.iArrFld[(i5 >>> 1) % N]++);
        for (i6 = 346; i6 > 8; i6 -= 2) {
            Test.iArrFld[i6 + 1] = Test.iArrFld[i6 - 1];
            try {
                i5 = (36450 % i7);
                i5 = (121 % i5);
                i5 = (392496706 / Test.iArrFld[i6]);
            } catch (ArithmeticException a_e) {}
            Test.fFld += (i6 - i7);
            vMeth(i6);
            i7 += i6;
            i7 = (int)d1;
            i5 = -42934;
            if (Test.bFld) {
                try {
                    Test.iArrFld[i6] = (i5 % i7);
                    Test.iArrFld[i6 + 1] = (Test.iArrFld[i6 + 1] % i6);
                    i7 = (i5 / 2079880649);
                } catch (ArithmeticException a_e) {}
                for (i19 = 1; i19 < 9; i19++) {
                    short s1=-23254;
                    s1 = (short)i7;
                    Test.lArrFld[i19 - 1] *= Test.instanceCount;
                    i7 = i5;
                }
            } else if (true) {
                fArr[i6] -= i7;
            }
        }
        long meth_res = i5 + i6 + i7 + Double.doubleToLongBits(d1) + i19 + i20 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=98, i1=-57550, i2=7518, i3=7826, i4=17, i21=2, i22=14, i23=-125, i24=12, i25=21442;
        boolean b=false;
        double d2=0.110592;
        short s2=26111;

        i = 1;
        while (++i < 159) {
            byte by2=66;
            b = ((Test.iArrFld[i - 1] + (i1++)) > 18723);
            for (i2 = 2; i2 < 158; ++i2) {
                if (false) break;
                Test.fFld = Test.fFld;
            }
            i4 = 1;
            while (++i4 < 158) {
                Test.instanceCount = 21684;
                i3 = (int)((dMeth() - Test.instanceCount) + Test.instanceCount);
            }
            switch (((i % 7) * 5) + 78) {
            case 91:
                Test.instanceCount += (long)-1.659F;
                fArrFld[i] = i;
                break;
            case 106:
                for (i21 = 1; i21 < 158; ++i21) {
                    Test.iArrFld[i + 1] /= (int)(i4 | 1);
                    Test.fFld = i21;
                    for (i23 = 1; i23 < 2; i23++) {
                        Test.iArrFld[i23] += (int)Test.fFld;
                        i3 *= 31637;
                        d2 = Test.instanceCount;
                        i1 *= (int)-5L;
                        i1 += i23;
                        i22 >>>= i21;
                        Test.iArrFld[i23] = i4;
                    }
                    i25 = 1;
                    do {
                        Test.instanceCount += s2;
                    } while (++i25 < 2);
                    i1 += i24;
                }
                i1 |= i23;
                break;
            case 108:
                if (Test.bFld) {
                    if (b) {
                        d2 = i21;
                        b = Test.bFld;
                    } else {
                        by2 -= (byte)i2;
                    }
                } else {
                    Test.instanceCount = i4;
                }
                break;
            case 103:
                Test.instanceCount *= Test.instanceCount;
                break;
            case 97:
                Test.instanceCount += (((i * Test.instanceCount) + i1) - i3);
                break;
            case 86:
            case 105:
                i24 += (int)Test.fFld;
                break;
            }
        }

        FuzzerUtils.out.println("i b i1 = " + i + "," + (b ? 1 : 0) + "," + i1);
        FuzzerUtils.out.println("i2 i3 i4 = " + i2 + "," + i3 + "," + i4);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 d2 i25 = " + i24 + "," + Double.doubleToLongBits(d2) + "," + i25);
        FuzzerUtils.out.println("s2 = " + s2);

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.bFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.iArrFld Test.lArrFld fArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            FuzzerUtils.checkSum(Test.lArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));

        FuzzerUtils.out.println("dMeth1_check_sum: " + dMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
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
//DEBUG  dMeth ->  dMeth mainTest
//DEBUG  vMeth ->  vMeth dMeth mainTest
//DEBUG  dMeth1 ->  dMeth1 vMeth dMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}