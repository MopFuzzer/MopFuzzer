// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:08 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=9L;
    public static double dFld=0.60028;
    public static byte byFld=112;
    public long lArrFld[]=new long[N];

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i6=12, i7=8, i8=-57044, i9=-9, i10=10, i11=-6, i12=24878, iArr1[]=new int[N];
        boolean b=false;
        short s=20928;
        float f=-41.750F, fArr1[]=new float[N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(iArr1, -221);
        FuzzerUtils.init(byArr, (byte)-85);
        FuzzerUtils.init(fArr1, 88.509F);

        Test.instanceCount = i6;
        i6 = i6;
        for (i7 = 9; i7 < 389; i7++) {
            for (i9 = 4; i9 > 1; i9 -= 3) {
                byte by=-75;
                switch ((i7 % 5) + 28) {
                case 28:
                    by += (byte)i9;
                    Test.instanceCount = Test.instanceCount;
                    break;
                case 29:
                    for (i11 = 1; 4 > i11; i11++) {
                        if (b) break;
                        if (b) continue;
                        Test.instanceCount += i8;
                        switch ((((i7 >>> 1) % 5) * 5) + 31) {
                        case 51:
                            s = (short)i7;
                            Test.instanceCount -= Test.instanceCount;
                            i12 ^= i9;
                        case 43:
                            i8 += (i11 * i11);
                        case 42:
                            iArr1[i11] *= i10;
                            break;
                        case 45:
                            i12 += (((i11 * i6) + f) - i11);
                            break;
                        case 40:
                            i10 <<= -182;
                            break;
                        default:
                            Test.dFld += i12;
                        }
                    }
                    break;
                case 30:
                    byArr[i9] <<= (byte)s;
                    break;
                case 31:
                    b = b;
                    break;
                case 32:
                default:
                    fArr1[i9] = i7;
                }
            }
        }
        vMeth1_check_sum += i6 + i7 + i8 + i9 + i10 + i11 + i12 + (b ? 1 : 0) + s + Float.floatToIntBits(f) +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(byArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public static void vMeth(long l) {

        int i3=0, i4=-9, i5=16, i13=-60, i14=-13, i15=-8, i16=-1, iArr[]=new int[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -107.729F);
        FuzzerUtils.init(iArr, 8361);

        i3 = 380;
        while ((i3 -= 3) > 0) {
            for (i4 = 1; i4 < 12; i4++) {
                Test.instanceCount = ((++Test.instanceCount) - (i5++));
                i5 = (int)(((i3 + -6958) - (--l)) + fArr[i4 - 1]);
                i5 = i3;
                l >>= 30087;
                i5 -= (i5--);
                iArr[i4 + 1] += (i5++);
            }
            vMeth1();
            for (i13 = 1; i13 < 12; ++i13) {
                for (i15 = 1; i15 < 2; i15++) {
                    l ^= i5;
                    i14 <<= i16;
                    i14 += (21918 + (i15 * i15));
                }
            }
            Test.byFld += (byte)i13;
        }
        vMeth_check_sum += l + i3 + i4 + i5 + i13 + i14 + i15 + i16 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr);
    }

    public static void vSmallMeth(int i, int i1, int i2) {


        vMeth(-137L);
        vSmallMeth_check_sum += i + i1 + i2;
    }

    public void mainTest(String[] strArr1) {

        int i17=-56638, i18=-58, i19=-13, i20=15274, i21=-5, i22=-9, i23=-50424, i24=-237, i25=-220, iArr2[]=new int[N];
        float f1=-54.382F, fArr2[]=new float[N];
        boolean b1=false;
        long l1=-21819L;
        short s2=1219;

        FuzzerUtils.init(fArr2, 111.966F);
        FuzzerUtils.init(iArr2, 14);

        for (int smallinvoc=0; smallinvoc<916; smallinvoc++) vSmallMeth(i17, i17, i17);
        Test.instanceCount -= (long)Test.dFld;
        switch (((i17 >>> 1) % 9) + 29) {
        case 29:
        case 30:
            for (i18 = 7; i18 < 223; ++i18) {
                f1 += (((i18 * f1) + i19) - f1);
                Test.instanceCount += i18;
                i17 = i18;
                b1 = b1;
                Test.instanceCount *= i17;
                for (i20 = 7; i20 < 116; ++i20) {
                    short s1=13038;
                    lArrFld[i20] *= i17;
                    switch (((i17 >>> 1) % 6) + 114) {
                    case 114:
                        Test.instanceCount += i18;
                        i17 = -27478;
                        s1 += (short)(i20 - i21);
                        break;
                    case 115:
                        for (l1 = 1; l1 < 2; l1++) {
                            i19 &= 38200;
                            i19 = 79;
                            if (b1) {
                                if (b1) break;
                                fArr2[i18] -= f1;
                                i22 -= i22;
                                if (b1) continue;
                            }
                        }
                    case 116:
                        Test.instanceCount += (i20 - i21);
                        for (i23 = i20; 2 > i23; i23++) {
                            switch (((i22 >>> 1) % 9) + 14) {
                            case 14:
                                i17 *= (int)f1;
                                if (b1) continue;
                                s1 += (short)(i23 * i23);
                                break;
                            case 15:
                            case 16:
                                i21 += (((i23 * i23) + Test.byFld) - Test.byFld);
                                break;
                            case 17:
                                iArr2[i23 + 1] = -52;
                                break;
                            case 18:
                                i24 = i23;
                                break;
                            case 19:
                                i24 += s1;
                            case 20:
                                iArr2[i18] -= (int)f1;
                                break;
                            case 21:
                                i17 <<= i24;
                                break;
                            case 22:
                                Test.byFld += (byte)(i23 | i24);
                            }
                        }
                        break;
                    case 117:
                        i19 >>= i18;
                    case 118:
                        i19 += i18;
                        break;
                    case 119:
                        i19 = i24;
                        break;
                    default:
                        Test.instanceCount += i20;
                    }
                }
            }
        case 31:
            iArr2[(i21 >>> 1) % N] -= -4708;
        case 32:
            Test.dFld = i22;
            break;
        case 33:
            i21 &= (int)Test.instanceCount;
            break;
        case 34:
            iArr2[(i24 >>> 1) % N] = i19;
            break;
        case 35:
            i17 -= (int)f1;
        case 36:
            i25 += (int)-2.493F;
        case 37:
            Test.instanceCount -= 52;
        default:
            i17 = s2;
        }

        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("f1 b1 i20 = " + Float.floatToIntBits(f1) + "," + (b1 ? 1 : 0) + "," + i20);
        FuzzerUtils.out.println("i21 l1 i22 = " + i21 + "," + l1 + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("s2 fArr2 iArr2 = " + s2 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr2)) +
            "," + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.byFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(Test.dFld) + "," + Test.byFld);
        FuzzerUtils.out.println("lArrFld = " + FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  vMeth1 ->  vMeth1 vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}