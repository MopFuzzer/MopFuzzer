// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:00 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-3703661620L;
    public static boolean bFld=true;
    public static volatile double dFld=-1.130296;
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 65.103366);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l1, short s1, int i8) {

        long l2=4594753071407389216L, lArr[]=new long[N];
        int i9=-11, i10=55586, i11=0, iArr1[]=new int[N];
        float f=0.773F;
        double d=1.102083;

        FuzzerUtils.init(iArr1, -56);
        FuzzerUtils.init(lArr, 195L);

        for (l2 = 5; l2 < 131; ++l2) {
            f *= (float)-57.127558;
            Test.bFld = Test.bFld;
            try {
                i9 = (i9 / i8);
                i8 = (i9 % i8);
                i9 = (iArr1[(int)(l2)] / -58691);
            } catch (ArithmeticException a_e) {}
            l1 += 0;
            i9 -= i9;
            switch ((int)(((l2 % 8) * 5) + 114)) {
            case 137:
                for (i10 = 12; 1 < i10; --i10) {
                    f += (((i10 * i11) + i8) - i9);
                    i8 += i10;
                    d = i10;
                    i9 += i10;
                    iArr1[(int)(l2 - 1)] -= i11;
                    lArr[i10 + 1] = 1150008139L;
                }
                break;
            case 126:
                i11 += (int)(((l2 * l1) + i9) - i10);
            case 149:
                i11 += s1;
            case 131:
                l1 += i9;
                break;
            case 147:
                i8 *= i11;
                break;
            case 122:
                l1 = Test.instanceCount;
                break;
            case 150:
                i9 = 63945;
                break;
            case 128:
                i9 = i8;
            default:
                i8 = (int)1.70395;
            }
        }
        vMeth1_check_sum += l1 + s1 + i8 + l2 + i9 + Float.floatToIntBits(f) + i10 + i11 + Double.doubleToLongBits(d) +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(short s, int i3, long l) {

        int i4=-6, i5=13, i6=8, i7=-4, i12=-109, i13=-55971, iArr[]=new int[N];
        double d1=-79.11018;

        FuzzerUtils.init(iArr, -1);

        for (i4 = 20; i4 < 362; ++i4) {
            i3 ^= (++s);
            i3 += (--iArr[i4 - 1]);
            i3 -= (++i5);
            for (i6 = 1; i6 < 5; i6++) {
                vMeth1(Test.instanceCount, s, i3);
                Test.dArrFld[i4 - 1] = i6;
                i3 += (((i6 * i4) + Test.instanceCount) - i5);
            }
            for (i12 = 1; i12 < 5; i12++) {
                i7 = -2;
                iArr[i4 + 1] >>= 20241;
                d1 -= i13;
                s >>= (short)i13;
                i3 += (i12 ^ i3);
                i5 -= i3;
            }
        }
        vMeth_check_sum += s + i3 + l + i4 + i5 + i6 + i7 + i12 + i13 + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vSmallMeth(int i2) {


        vMeth((short)(26479), i2, Test.instanceCount);
        i2 -= i2;
        vSmallMeth_check_sum += i2;
    }

    public void mainTest(String[] strArr1) {

        int i=-1, i1=184, i14=25752, i15=13, i16=12, i17=14769, i18=-7294, i19=3, iArr2[][]=new int[N][N];
        double d2=-1.73545;
        byte by=-45;
        short s2=-30153;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 95.982F);
        FuzzerUtils.init(iArr2, 185);

        for (i = 9; i < 202; i++) {
            for (int smallinvoc=0; smallinvoc<62; smallinvoc++) vSmallMeth(i1);
        }
        fArr[(i >>> 1) % N] -= i;
        for (i14 = 250; 9 < i14; --i14) {
            float f1=45.219F;
            i1 = (int)Test.dFld;
            Test.instanceCount = Test.instanceCount;
            switch ((i14 % 7) + 45) {
            case 45:
                switch ((i14 % 10) + 98) {
                case 98:
                    d2 = 1;
                    while (++d2 < 104) {
                        Test.dFld = i14;
                    }
                    f1 += (float)d2;
                    break;
                case 99:
                    if (Test.bFld) continue;
                case 100:
                    i16 = 1;
                    do {
                        for (i17 = 1; i17 < 1; i17++) {
                            iArr2[i17][i17] = by;
                            if (false) break;
                            i15 += i17;
                        }
                        Test.instanceCount ^= Test.instanceCount;
                        i15 = (int)f1;
                        Test.instanceCount ^= Test.instanceCount;
                        i15 = -77;
                        i19 = 1;
                        do {
                            Test.bFld = true;
                            iArr2[i19] = FuzzerUtils.int1array(N, (int)-252);
                            iArr2[i14 + 1][i16 - 1] *= i18;
                            i18 += (i19 - i18);
                            i18 *= (int)2.106995;
                            iArr2[i19][i19] ^= i14;
                            f1 -= f1;
                            i1 += (i19 + Test.instanceCount);
                        } while (++i19 < 1);
                    } while (++i16 < 104);
                    break;
                case 101:
                    if (Test.bFld) break;
                    break;
                case 102:
                    i15 <<= i15;
                    break;
                case 103:
                    i18 -= i18;
                    break;
                case 104:
                    by += (byte)f1;
                    break;
                case 105:
                    i15 -= (int)Test.instanceCount;
                    break;
                case 106:
                    if (Test.bFld) break;
                    break;
                case 107:
                    i18 -= (int)Test.dFld;
                    break;
                default:
                    i1 = (int)Test.instanceCount;
                }
                break;
            case 46:
                f1 = 5;
                break;
            case 47:
                Test.dFld -= i14;
            case 48:
                i18 += 9;
                break;
            case 49:
                Test.instanceCount ^= i17;
                break;
            case 50:
                i1 = i17;
                break;
            case 51:
                i18 += (((i14 * i18) + Test.instanceCount) - i19);
            default:
                i18 *= s2;
            }
        }

        FuzzerUtils.out.println("i i1 i14 = " + i + "," + i1 + "," + i14);
        FuzzerUtils.out.println("i15 d2 i16 = " + i15 + "," + Double.doubleToLongBits(d2) + "," + i16);
        FuzzerUtils.out.println("i17 i18 by = " + i17 + "," + i18 + "," + by);
        FuzzerUtils.out.println("i19 s2 fArr = " + i19 + "," + s2 + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));
        FuzzerUtils.out.println("iArr2 = " + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.dFld = " + Test.instanceCount + "," + (Test.bFld ? 1
            : 0) + "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.dArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));

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
