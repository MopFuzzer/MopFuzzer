// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:08 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-103L;
    public static short sFld=-21014;
    public static byte byFld=-83;
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.dArrFld, -2.104069);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i8=-59203, i9=2, i10=-44818, i11=-45525, i12=10180, i13=-40753, i14=14, iArr1[]=new int[N];
        byte by2=100;
        float f2=-2.809F;
        double d1=88.104128, dArr[]=new double[N];
        boolean b=false;

        FuzzerUtils.init(dArr, -27.55164);
        FuzzerUtils.init(iArr1, -52313);

        for (i8 = 8; 133 > i8; i8++) {
            i9 += (i8 ^ i8);
            dArr[i8] += i8;
            for (i10 = 1; i10 < 13; i10++) {
                iArr1[i10] = by2;
                i11 *= Test.sFld;
                for (i12 = 1; i12 < 2; i12++) {
                    f2 = i12;
                    Test.instanceCount -= -3070541138L;
                    d1 = i11;
                    if (b) continue;
                }
                dArr[i10] -= -7156;
                i14 += (i10 ^ Test.sFld);
                i9 += i9;
                i14 += (i10 | i11);
            }
        }
        vMeth2_check_sum += i8 + i9 + i10 + i11 + by2 + i12 + i13 + Float.floatToIntBits(f2) +
            Double.doubleToLongBits(d1) + (b ? 1 : 0) + i14 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth1() {

        int i4=-55889, i5=-139, i6=4, i7=42306, i15=11, iArr[]=new int[N];
        float f1=37.137F;
        byte by1=-54;

        FuzzerUtils.init(iArr, -11362);

        for (i4 = 3; i4 < 137; i4 += 2) {
            i5 += (((i4 * f1) + by1) - i5);
            i5 = 149;
            i5 -= (int)((-(by1 ^= (byte)-6836262926519812437L)) - ((i4 * i5) % ((Test.instanceCount +
                Test.instanceCount) | 1)));
            Test.instanceCount += (i4 + i5);
        }
        i5 ^= (i5 = (++iArr[(i4 >>> 1) % N]));
        for (i6 = 8; i6 < 293; ++i6) {
            vMeth2();
            iArr[i6] += i5;
        }
        i15 = 1;
        while ((i15 += 3) < 346) {
            switch (((i15 % 4) * 5) + 108) {
            case 112:
                i7 += (((i15 * i4) + i15) - by1);
                i5 -= -10;
            case 119:
                i5 -= i6;
                i5 = i15;
                break;
            case 123:
                i5 = i7;
                break;
            case 113:
                i5 = 55518;
                break;
            }
        }
        vMeth1_check_sum += i4 + i5 + Float.floatToIntBits(f1) + by1 + i6 + i7 + i15 + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth() {

        int i2=-53277, i3=-8, i16=-60, i17=1868, i18=34560, i19=254, i20=7, iArr2[]=new int[N];
        boolean b1=true;
        float f3=73.185F;
        double d2=-2.16860;

        FuzzerUtils.init(iArr2, 10);

        for (i2 = 286; i2 > 15; i2 -= 2) {
            vMeth1();
        }
        for (i16 = 9; i16 < 205; ++i16) {
            i18 = 1;
            while ((i18 += 2) < 8) {
                iArr2[i16 - 1] = i16;
                switch ((((182 >>> 1) % 8) * 5) + 29) {
                case 65:
                    b1 = true;
                    for (i19 = 2; i19 > 1; --i19) {
                        f3 -= Test.byFld;
                        switch ((i16 % 2) + 79) {
                        case 79:
                            d2 += f3;
                            i17 = i17;
                        case 80:
                            i3 += i19;
                        default:
                            Test.sFld += (short)(-92L + (i19 * i19));
                            i20 += i17;
                        }
                    }
                    break;
                case 37:
                    f3 += Test.byFld;
                    break;
                case 42:
                    i3 = i17;
                case 41:
                    i17 += (i18 * i18);
                case 47:
                    f3 -= i19;
                case 31:
                    d2 *= Test.instanceCount;
                    break;
                case 43:
                    i17 += (-2482 + (i18 * i18));
                    break;
                case 50:
                    i3 <<= (int)Test.instanceCount;
                    break;
                default:
                    i20 *= i18;
                }
            }
        }
        vMeth_check_sum += i2 + i3 + i16 + i17 + i18 + (b1 ? 1 : 0) + i19 + i20 + Float.floatToIntBits(f3) +
            Double.doubleToLongBits(d2) + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        double d=-96.75999;
        long l=4L;
        byte by=26;
        float f=19.600F, f4=-2.915F;
        int i1=-9, i21=48664, i22=59070, i23=5, i24=12, i25=-48013, i26=205, i27=-58368, i28=59146, i29=93, iArr3[]=new
            int[N];
        boolean b2=false;

        FuzzerUtils.init(iArr3, -31002);

        d = 1;
        while (++d < 269) {
            l = 93;
            while ((l -= 2) > 0) {
                int i=-143;
                i += (int)(l - by);
                for (f = 1; f < 2; ++f) {
                    short s=-19026;
                    s += (short)(i - ((-8577078938488250795L - (i - by)) + (l + i1)));
                    vMeth();
                    i = (int)-29.1006F;
                    i += (int)(((f * f) + Test.byFld) - i);
                }
                i1 *= -45669;
            }
            i1 += (int)(d * i1);
            i21 = 1;
            do {
                for (i22 = 1; i22 < 1; ++i22) {
                    Test.instanceCount *= i22;
                    iArr3[(int)(d)] *= (int)f;
                    i1 -= (int)Test.instanceCount;
                    i1 <<= (int)l;
                }
                i23 += -7;
                f4 = l;
                for (i24 = 1; i24 < 1; ++i24) {
                    i25 ^= i1;
                    Test.sFld += (short)(206 + (i24 * i24));
                }
                Test.dArrFld[(int)(d + 1)] = 26050;
            } while (++i21 < 93);
            iArr3[(int)(d - 1)] -= (int)d;
            if (b2) {
                for (i26 = 3; i26 < 93; i26++) {
                    for (i28 = 1; 2 > i28; i28++) {
                        i27 ^= i23;
                        i29 &= i27;
                        i25 += i28;
                        if (b2) break;
                    }
                }
            } else if (true) {
                Test.instanceCount -= i27;
            }
        }

        FuzzerUtils.out.println("d l by = " + Double.doubleToLongBits(d) + "," + l + "," + by);
        FuzzerUtils.out.println("f i1 i21 = " + Float.floatToIntBits(f) + "," + i1 + "," + i21);
        FuzzerUtils.out.println("i22 i23 f4 = " + i22 + "," + i23 + "," + Float.floatToIntBits(f4));
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 i28 i29 = " + i27 + "," + i28 + "," + i29);
        FuzzerUtils.out.println("b2 iArr3 = " + (b2 ? 1 : 0) + "," + FuzzerUtils.checkSum(iArr3));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.byFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Test.byFld);
        FuzzerUtils.out.println("Test.dArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));

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
