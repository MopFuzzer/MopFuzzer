// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:17 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-173L;
    public short sFld=10955;
    public static short sFld1=-27696;
    public static byte byFld=-71;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -19958);
        FuzzerUtils.init(Test.lArrFld, -53895L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(short s, byte by1, int i9) {

        int i10=31803, i11=-54256, i12=-115, i13=-51265, i14=4, i15=-2, i16=1;
        float f=-32.22F;

        for (i10 = 8; i10 < 309; i10++) {
            f += Test.instanceCount;
            i9 = (int)Test.instanceCount;
            try {
                i11 = (Test.iArrFld[i10 + 1] / 242);
                i11 = (-58 / i11);
                Test.iArrFld[i10 - 1] = (i10 / i11);
            } catch (ArithmeticException a_e) {}
            Test.instanceCount += (i10 * i10);
        }
        i11 += (int)Test.instanceCount;
        for (i12 = 20; 351 > i12; i12 += 3) {
            i11 *= i9;
            Test.instanceCount = i13;
            for (i14 = 14; i14 > 1; i14--) {
                switch (((i15 >>> 1) % 3) + 110) {
                case 110:
                    i16 = 1;
                    do {
                        i15 <<= by1;
                    } while (++i16 < 2);
                    f *= i9;
                    i13 = (int)f;
                    break;
                case 111:
                    Test.instanceCount -= 166;
                case 112:
                    if (false) break;
                }
            }
        }
        vMeth2_check_sum += s + by1 + i9 + i10 + i11 + Float.floatToIntBits(f) + i12 + i13 + i14 + i15 + i16;
    }

    public static void vMeth1(int i5, long l) {

        int i6=0, i7=5, i8=-23254, i17=143, i18=-1, i19=212, i20=-11, i21=7, iArr[]=new int[N];
        byte by=62;
        double d=-13.107400;

        FuzzerUtils.init(iArr, -223);

        i5 = (iArr[(i5 >>> 1) % N]++);
        for (i6 = 9; i6 < 197; i6++) {
            i7 >>= (by - (iArr[i6 + 1] >>= (i5 + by)));
        }
        for (d = 22; d < 389; d++) {
            vMeth2(Test.sFld1, by, i7);
            try {
                i7 = (198 / i7);
                i5 = (i7 % -28891);
                i8 = (Test.iArrFld[(int)(d)] % -21188);
            } catch (ArithmeticException a_e) {}
            for (i17 = 1; i17 < 5; ++i17) {
                Test.instanceCount >>= i18;
            }
            i19 = 1;
            while (++i19 < 5) {
                l += i19;
                switch (((i19 % 4) * 5) + 104) {
                case 108:
                    for (i20 = 1; i20 < 1; ++i20) {
                        i7 = (int)1.40121;
                        Test.instanceCount += (((i20 * Test.sFld1) + l) - i21);
                        Test.instanceCount += (((i20 * i7) + i19) - l);
                    }
                    break;
                case 118:
                    i7 <<= i21;
                    break;
                case 107:
                case 105:
                    i5 *= Test.sFld1;
                    break;
                }
            }
        }
        vMeth1_check_sum += i5 + l + i6 + i7 + by + Double.doubleToLongBits(d) + i8 + i17 + i18 + i19 + i20 + i21 +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i2) {

        int i3=41372, i4=-9, i22=50820, i23=36889, i24=-168, i25=-241;
        boolean b=false;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -2.67117);

        for (i3 = 9; i3 < 303; i3++) {
            vMeth1(i4, Test.instanceCount);
            Test.iArrFld[i3 - 1] += i4;
            i4 >>= i4;
            i2 += i2;
            Test.instanceCount += i3;
        }
        if (b) {
            i2 += i4;
            for (i22 = 236; i22 > 11; --i22) {
                i24 = 1;
                do {
                    if (b) {
                        Test.lArrFld[i24 + 1] += Test.instanceCount;
                    } else if (b) {
                        i25 = i2;
                    } else if (b) {
                        Test.lArrFld[i22 + 1] -= i3;
                        i2 += (i24 * i24);
                    }
                } while (++i24 < 7);
            }
        } else if (b) {
            Test.instanceCount = 203;
        } else {
            dArr = dArr;
            vMeth_check_sum += i2 + i3 + i4 + i22 + i23 + i24 + i25 + (b ? 1 : 0) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
            return;
        }
        vMeth_check_sum += i2 + i3 + i4 + i22 + i23 + i24 + i25 + (b ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        int i=-158, i1=9, i26=-64424, i27=-207, i28=13708, i29=-109, i30=-13, i31=55490, i32=-34, i33=138;
        float f1=1.859F, f2=2.553F;

        i = 1;
        while (++i < 301) {
            sFld = (short)(++i1);
            vMeth(i);
        }
        Test.instanceCount += i1;
        for (i26 = 11; 272 > i26; i26++) {
            i28 = 1;
            while (++i28 < 96) {
                i1 &= i27;
            }
            i27 += i1;
            i27 = -50;
            switch (((i26 % 5) * 5) + 67) {
            case 88:
            case 78:
            case 81:
            case 69:
                Test.sFld1 *= (short)i1;
                i29 = 1;
                while (++i29 < 96) {
                    double d1=-10.14276;
                    f1 += (float)d1;
                    Test.instanceCount *= sFld;
                    Test.instanceCount *= i;
                    f1 = i1;
                    i27 = (int)Test.instanceCount;
                    i27 = (int)Test.instanceCount;
                    i27 <<= 99;
                }
                i27 *= (int)Test.instanceCount;
                break;
            case 90:
                for (i30 = 5; i30 < 96; i30++) {
                    Test.sFld1 = (short)i30;
                    for (i32 = 1; i32 < 2; ++i32) {
                        i33 += i32;
                        Test.iArrFld[i32 + 1] += (int)Test.instanceCount;
                        i31 -= i;
                        f1 += f2;
                        i33 = -207;
                        f1 += (i32 + i27);
                        i31 *= 1;
                    }
                }
            default:
                Test.byFld = (byte)i1;
            }
        }

        FuzzerUtils.out.println("i i1 i26 = " + i + "," + i1 + "," + i26);
        FuzzerUtils.out.println("i27 i28 i29 = " + i27 + "," + i28 + "," + i29);
        FuzzerUtils.out.println("f1 i30 i31 = " + Float.floatToIntBits(f1) + "," + i30 + "," + i31);
        FuzzerUtils.out.println("i32 i33 f2 = " + i32 + "," + i33 + "," + Float.floatToIntBits(f2));

        FuzzerUtils.out.println("Test.instanceCount sFld Test.sFld1 = " + Test.instanceCount + "," + sFld + "," +
            Test.sFld1);
        FuzzerUtils.out.println("Test.byFld Test.iArrFld Test.lArrFld = " + Test.byFld + "," +
            FuzzerUtils.checkSum(Test.iArrFld) + "," + FuzzerUtils.checkSum(Test.lArrFld));

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
