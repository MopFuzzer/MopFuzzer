// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:57 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=435087729L;
    public static float fFld=-51.544F;
    public static boolean bFld=true;
    public static volatile int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -76);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(float f1, int i4, float f2) {

        int i5=21040, i6=39023, i7=-11;
        double d=-74.11708;
        byte by=-41;

        i5 = 1;
        do {
            i6 = 1;
            do {
                for (d = 1; d < 1; ++d) {
                    i4 += (int)1279210909L;
                    i7 >>= (int)Test.instanceCount;
                    Test.instanceCount += (-5 + (d * d));
                    by += (byte)f2;
                    i7 -= 59798;
                    Test.iArrFld[i6 - 1] = (int)Test.instanceCount;
                    Test.instanceCount = i5;
                    switch (((i5 % 1) * 5) + 88) {
                    case 92:
                        try {
                            i7 = (i7 / 977);
                            i7 = (i7 % 4001);
                            i7 = (198 / i4);
                        } catch (ArithmeticException a_e) {}
                        Test.instanceCount >>= 39327;
                        by = (byte)f2;
                        i7 = i6;
                    default:
                        i7 += (int)(((d * i4) + i7) - i6);
                    }
                }
            } while (++i6 < 5);
        } while (++i5 < 330);
        vMeth2_check_sum += Float.floatToIntBits(f1) + i4 + Float.floatToIntBits(f2) + i5 + i6 +
            Double.doubleToLongBits(d) + i7 + by;
    }

    public static void vMeth1(long l, int i3) {


        vMeth2(Test.fFld, i3, 2.7F);
        l = i3;
        vMeth1_check_sum += l + i3;
    }

    public static void vMeth() {

        int i2=3, i8=-175, i9=-197, i10=-5103, i11=-54042, i12=-238;
        float f=-2.917F, fArr[][]=new float[N][N];
        boolean b=false;
        short s=-21252, sArr[]=new short[N];
        double d1=0.50656;

        FuzzerUtils.init(sArr, (short)-4494);
        FuzzerUtils.init(fArr, 41.198F);

        i2 -= (int)Test.instanceCount;
        i2 += (int)f;
        Test.instanceCount *= (long)f;
        vMeth1(Test.instanceCount, i2);
        for (i8 = 12; 243 > i8; ++i8) {
            Test.iArrFld[i8 + 1] *= i9;
            for (i10 = 1; i10 < 7; i10++) {
                if (b) break;
                switch ((((i11 >>> 1) % 2) * 5) + 110) {
                case 118:
                    sArr[i8 - 1] = s;
                    i12 = 1;
                    do {
                        i2 /= (int)((long)(d1) | 1);
                        fArr[i8 + 1][i10 - 1] += i11;
                    } while (++i12 < 2);
                    i9 += (((i10 * Test.instanceCount) + Test.instanceCount) - i12);
                    if (b) continue;
                    break;
                case 112:
                    Test.instanceCount -= i10;
                    break;
                }
            }
        }
        vMeth_check_sum += i2 + Float.floatToIntBits(f) + i8 + i9 + i10 + i11 + (b ? 1 : 0) + s + i12 +
            Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(sArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i=-119, i1=-6, i13=-9, i14=-14, i15=9, i16=11, i17=-37080;
        byte by1=125, byArr[]=new byte[N];
        double d2=1.34667;
        long l1=191L;

        FuzzerUtils.init(byArr, (byte)38);

        switch (((((int)(i - Test.instanceCount)) >>> 1) % 6) + 5) {
        case 5:
            i1 = 1;
            do {
                vMeth();
                i += (((i1 * i) + i1) - i1);
                for (i13 = 2; i13 < 205; i13++) {
                    Test.instanceCount >>= Test.instanceCount;
                    Test.bFld = Test.bFld;
                    i14 += (int)-2.108F;
                }
                i15 = 1;
                while (++i15 < 205) {
                    by1 |= (byte)Test.instanceCount;
                    Test.instanceCount += (i15 - Test.instanceCount);
                    i += (i15 * i15);
                    Test.instanceCount = Test.instanceCount;
                    i += (((i15 * i13) + i14) - Test.fFld);
                    for (i16 = 1; i16 > 1; --i16) {
                        Test.instanceCount -= i;
                        i17 = i15;
                        i17 >>= (int)-43481L;
                        Test.fFld = i13;
                        switch ((i1 % 6) + 8) {
                        case 8:
                            Test.bFld = Test.bFld;
                            Test.iArrFld[i15] = 38909;
                            break;
                        case 9:
                            i += -4;
                            break;
                        case 10:
                            Test.iArrFld[i16 - 1] = i14;
                            break;
                        case 11:
                            Test.iArrFld[i16 + 1] *= i13;
                            Test.fFld -= -115;
                            break;
                        case 12:
                        case 13:
                            d2 += -84;
                            i = i14;
                            Test.iArrFld[i15 + 1] = (int)l1;
                            break;
                        }
                        byArr = byArr;
                    }
                }
            } while (++i1 < 122);
            break;
        case 6:
            Test.instanceCount |= Test.instanceCount;
            break;
        case 7:
            Test.fFld += -124;
            break;
        case 8:
            i14 -= i13;
            break;
        case 9:
            Test.fFld %= 4L;
            break;
        case 10:
            i += (int)Test.instanceCount;
            break;
        default:
            i >>>= i1;
        }

        FuzzerUtils.out.println("i i1 i13 = " + i + "," + i1 + "," + i13);
        FuzzerUtils.out.println("i14 i15 by1 = " + i14 + "," + i15 + "," + by1);
        FuzzerUtils.out.println("i16 i17 d2 = " + i16 + "," + i17 + "," + Double.doubleToLongBits(d2));
        FuzzerUtils.out.println("l1 byArr = " + l1 + "," + FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.bFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(Test.iArrFld));

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
