// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:56 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=17232L;
    public static float fFld=0.424F;
    public short sFld=-24490;
    public static short sArrFld[]=new short[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)-24653);
        FuzzerUtils.init(Test.iArrFld, 72);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i3, double d, boolean b1) {

        int i4=2, i5=592, i6=-3, i7=-90, i8=44964, i9=10810, iArr[]=new int[N];
        long l=-6401863095550735760L;

        FuzzerUtils.init(iArr, -74);

        for (i4 = 325; i4 > 1; i4 -= 3) {
            i5 -= (int)d;
            i3 -= i5;
            Test.fFld += (i4 * Test.fFld);
            if (b1) continue;
        }
        i5 = -1;
        for (i6 = 331; i6 > 14; i6--) {
            i5 <<= i4;
            l = i7;
            i7 += i6;
            iArr[i6] += i7;
            d = i6;
            for (i8 = 1; i8 < 5; i8++) {
                Test.instanceCount -= i3;
                i3 = (int)d;
            }
        }
        vMeth2_check_sum += i3 + Double.doubleToLongBits(d) + (b1 ? 1 : 0) + i4 + i5 + i6 + i7 + l + i8 + i9 +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1() {

        int i10=8, i11=-44360, i12=4, i13=-7, i14=55937, i15=12, i16=-55201, i18=3;
        double d1=-5.81627, dArr[]=new double[N];
        boolean b2=false;
        long l1=7525300024471100318L;
        float f=50.804F, fArr[][]=new float[N][N];
        byte by=67;
        short s=-25317;

        FuzzerUtils.init(fArr, 0.612F);
        FuzzerUtils.init(dArr, 73.61366);

        vMeth2(i10, d1, b2);
        if (b2) {
            Test.fFld += -6513964337493847149L;
        } else {
            for (i11 = 9; i11 < 161; i11++) {
                fArr[i11][(53107 >>> 1) % N] += Test.instanceCount;
                if (b2) {
                    i12 = (int)d1;
                    i10 *= (int)Test.instanceCount;
                    switch (((i12 >>> 1) % 9) + 10) {
                    case 10:
                        for (i13 = 1; i13 < 10; i13++) {
                            Test.fFld += (i13 - i14);
                            for (i15 = 2; i15 > i11; i15 -= 3) {
                                d1 = Test.fFld;
                                dArr[i11] = Test.instanceCount;
                                i16 <<= (int)59561L;
                            }
                        }
                        break;
                    case 11:
                        l1 = (long)d1;
                        break;
                    case 12:
                        i14 += i11;
                    case 13:
                        f *= f;
                    case 14:
                        i14 = by;
                    case 15:
                        Test.instanceCount -= i16;
                        break;
                    case 16:
                        s &= (short)l1;
                        break;
                    case 17:
                        i10 += i13;
                        break;
                    case 18:
                        i18 *= (int)d1;
                        break;
                    default:
                        Test.fFld *= -8;
                    }
                } else if (true) {
                    Test.iArrFld[i11 + 1] -= (int)d1;
                } else {
                    Test.iArrFld[i11 + 1] = -7136;
                }
            }
        }
        vMeth1_check_sum += i10 + Double.doubleToLongBits(d1) + (b2 ? 1 : 0) + i11 + i12 + i13 + i14 + i15 + i16 + l1 +
            Float.floatToIntBits(f) + by + s + i18 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth(int i1, int i2) {

        int i19=95;

        i2 /= (int)((--Test.sArrFld[(-196 >>> 1) % N]) | 1);
        vMeth1();
        Test.instanceCount ^= i19;
        vMeth_check_sum += i1 + i2 + i19;
    }

    public void mainTest(String[] strArr1) {

        boolean b=true, bArr[][]=new boolean[N][N];
        int i=-6, i20=197, i21=-10, i22=-58, i23=50, i24=-5, i25=-5, i26=180;
        double d2=-1.84243;
        float f1=93.470F;
        byte by1=89;

        FuzzerUtils.init(bArr, false);

        b = (!bArr[(-8 >>> 1) % N][(i >>> 1) % N]);
        if (b) {
            vMeth(i, i);
        } else if (b) {
            i20 *= (int)d2;
            i = (int)Test.fFld;
            for (i21 = 14; i21 < 309; i21++) {
                i = sFld;
                Test.fFld += (((i21 * Test.fFld) + Test.fFld) - i20);
            }
        } else if (b) {
            Test.fFld -= i;
            f1 = 258;
            do {
                Test.fFld = i20;
                i22 += (int)f1;
                i22 -= -129;
                for (i23 = (int)(f1); i23 < 97; ++i23) {
                    for (i25 = 1; i25 > 1; i25--) {
                        Test.instanceCount += (i25 - i);
                        switch ((int)((f1 % 2) + 121)) {
                        case 121:
                            Test.iArrFld[i23 - 1] += i25;
                            i24 <<= sFld;
                            i20 = i25;
                            i -= i22;
                            break;
                        case 122:
                            switch ((int)(((f1 % 10) * 5) + 88)) {
                            case 120:
                                switch (((i25 % 2) * 5) + 72) {
                                case 77:
                                    switch (((58199 >>> 1) % 1) + 2) {
                                    case 2:
                                        i20 += i;
                                        Test.instanceCount <<= i25;
                                        break;
                                    default:
                                        Test.instanceCount |= i25;
                                    }
                                    i20 *= -3;
                                    d2 = 137;
                                    i24 += (((i25 * Test.fFld) + i22) - Test.instanceCount);
                                    break;
                                case 75:
                                    Test.instanceCount = Test.instanceCount;
                                    break;
                                default:
                                    by1 = (byte)i21;
                                }
                                break;
                            case 90:
                                Test.iArrFld[(int)(f1 + 1)] += i22;
                            case 114:
                                i26 = i24;
                                break;
                            case 94:
                                d2 += Test.fFld;
                                break;
                            case 126:
                                Test.instanceCount += i21;
                                break;
                            case 123:
                                i24 += (i25 * i25);
                                break;
                            case 111:
                                Test.iArrFld[i23 - 1] -= 79;
                            case 100:
                                Test.iArrFld[(int)(f1 + 1)] <<= sFld;
                                break;
                            case 118:
                                if (b) break;
                                break;
                            case 125:
                                i22 += 57435;
                                break;
                            }
                            break;
                        }
                    }
                }
            } while (--f1 > 0);
        } else {
            Test.instanceCount = -6218;
        }

        FuzzerUtils.out.println("b i i20 = " + (b ? 1 : 0) + "," + i + "," + i20);
        FuzzerUtils.out.println("d2 i21 i22 = " + Double.doubleToLongBits(d2) + "," + i21 + "," + i22);
        FuzzerUtils.out.println("f1 i23 i24 = " + Float.floatToIntBits(f1) + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 i26 by1 = " + i25 + "," + i26 + "," + by1);
        FuzzerUtils.out.println("bArr = " + FuzzerUtils.checkSum(bArr));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld sFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + sFld);
        FuzzerUtils.out.println("Test.sArrFld Test.iArrFld = " + FuzzerUtils.checkSum(Test.sArrFld) + "," +
            FuzzerUtils.checkSum(Test.iArrFld));

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
