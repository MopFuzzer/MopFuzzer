// Generated by Java* Fuzzer test generator (1.0.001). Thu Feb 18 16:14:54 2021
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=478992341L;
    public static volatile int iFld=35710;
    public static boolean bFld=true;
    public float[][] fArrFld =new float[N][N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i6=-89, i7=-229, i8=-11931, i9=18838, i10=-48896, i11=-13;
        float f=-101.721F;

        for (i6 = 14; 366 > i6; ++i6) {
            i7 += i6;
            i7 += Test.iFld;
            for (i8 = i6; i8 < 5; ++i8) {
                byte by=48;
                i7 = by;
                i7 = i9;
            }
            if (Test.bFld) {
                i9 += (i6 * i6);
            } else if (true) {
                i10 = 1;
                do {
                    i9 *= (int)Test.instanceCount;
                    Test.iFld >>= i10;
                    i7 <<= (int)Test.instanceCount;
                    for (f = 1; f < 1; ++f) {
                        i9 = i9;
                        i7 = i7;
                    }
                } while (++i10 < 5);
            }
        }
        vMeth2_check_sum += i6 + i7 + i8 + i9 + i10 + Float.floatToIntBits(f) + i11;
    }

    public static void vMeth1(int i2, int i3, int i4) {

        byte by1=109;
        int i12=-13;
        int i13=-14;
        int[] iArr =new int[N];
        double d=39.42627;

        FuzzerUtils.init(iArr, 2);

        for (int i5 : iArr) {
            vMeth2();
            i5 *= by1;
            if (true) {
                i2 = i4;
                i12 = 1;
                do {
                    iArr[i12 + 1] = Test.iFld;
                    i5 = i4;
                    i4 = i3;
                } while (++i12 < 4);
                vMeth1_check_sum += i2 + i3 + i4 + by1 + i12 + i13 + Double.doubleToLongBits(d) +
                    FuzzerUtils.checkSum(iArr);
                return;
            } else {
                iArr[(Test.iFld >>> 1) % N] = (int)Test.instanceCount;
            }
        }
        i3 += (int)119.379F;
        i13 = 1;
        do {
            i4 += i13;
            i4 = i3;
        } while (++i13 < 208);
        d = i13;
        vMeth1_check_sum += i2 + i3 + i4 + by1 + i12 + i13 + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth() {

        int i=1423;
        int i1=37960;
        int i14=-1;
        int i15=112;
        int i16=228;
        int i17=-61008;
        int[] iArr1 =new int[N];
        float f1=2.428F;

        FuzzerUtils.init(iArr1, -9);

        for (i = 13; i < 321; i++) {
            vMeth1(Test.iFld, i, 151);
            for (i14 = 1; i14 < 5; i14++) {
                double d1=2.36200;
                Test.iFld = -19130;
                i1 -= (int)5.101121;
                iArr1 = iArr1;
                iArr1[i14] *= i;
                Test.iFld = (int)d1;
                Test.iFld += (((i14 * Test.instanceCount) + i15) - i);
            }
            f1 = 1;
            while ((f1 += 3) < 5) {
                iArr1[(int)(f1 - 1)] = i14;
                for (i16 = 1; i16 < 5; i16++) {
                    Test.instanceCount = -5;
                    iArr1[i + 1] = (int)Test.instanceCount;
                    iArr1[i + 1] -= i17;
                }
            }
        }
        vMeth_check_sum += i + i1 + i14 + i15 + Float.floatToIntBits(f1) + i16 + i17 + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i18=24402;
        int i19=-150;
        int i20=-3;
        int i21=253;
        int i22=171;
        int i23=199;
        int i24=-36572;
        int[] iArr2 =new int[N];
        double d2=0.126331;
        double[] dArr =new double[N];
        float f2=41.489F;
        long l=6389487884724543269L;
        byte by2=-122;

        FuzzerUtils.init(iArr2, 13);
        FuzzerUtils.init(dArr, 0.106498);

        vMeth();
        for (i18 = 5; i18 < 154; i18++) {
            switch (((i19 >>> 1) % 1) + 24) {
            case 24:
                for (i20 = 1; i20 < 168; i20 += 2) {
                    Test.iFld -= i18;
                    i19 = (int)Test.instanceCount;
                    d2 = i20;
                    i21 = i18;
                    f2 = Test.instanceCount;
                    i21 = (int)Test.instanceCount;
                    try {
                        i21 = (235493750 / i19);
                        iArr2[i20] = (-56306 % i19);
                        i19 = (-12032 / Test.iFld);
                    } catch (ArithmeticException a_e) {}
                    Test.instanceCount = i18;
                }
                dArr[i18 + 1] = Test.iFld;
                for (i22 = 8; 168 > i22; i22 += 2) {
                    for (l = i22; l < 3; ++l) {
                        switch (((i22 % 8) * 5) + 83) {
                        case 113:
                            Test.instanceCount += (l * l);
                            i23 <<= i19;
                        case 119:
                            i19 = i23;
                            i23 = by2;
                            if (Test.bFld) break;
                            i23 += (int)(((l * f2) + l) - l);
                        case 103:
                            Test.iFld *= (int)d2;
                            Test.iFld *= i19;
                            break;
                        case 98:
                            Test.iFld -= (int)5335244462660909805L;
                            fArrFld[i18][(int)(l)] += Test.iFld;
                            break;
                        case 102:
                            iArr2 = iArr2;
                            break;
                        case 121:
                            if (Test.bFld) continue;
                            Test.instanceCount = (long)d2;
                            iArr2 = iArr2;
                            break;
                        case 89:
                            Test.instanceCount += (((l * l) + i23) - i24);
                            break;
                        case 107:
                            f2 += 164;
                            break;
                        }
                    }
                }
                break;
            default:
                i21 -= (int)l;
            }
        }

        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 d2 f2 = " + i21 + "," + Double.doubleToLongBits(d2) + "," +
            Float.floatToIntBits(f2));
        FuzzerUtils.out.println("i22 i23 l = " + i22 + "," + i23 + "," + l);
        FuzzerUtils.out.println("i24 by2 iArr2 = " + i24 + "," + by2 + "," + FuzzerUtils.checkSum(iArr2));
        FuzzerUtils.out.println("dArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.bFld = " + Test.instanceCount + "," + Test.iFld +
            "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));

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
