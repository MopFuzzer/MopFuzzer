// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:10 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3840158974L;
    public static float fFld=1.993F;
    public static int iFld=-226;
    public static volatile int iFld1=12717;
    public static double dArrFld[]=new double[N];
    public int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 89.101869);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth(byte by) {

        short s=-18547;
        int i1=-63267;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 8L);

        s += (short)(((-(i1--)) - (Test.instanceCount - Test.instanceCount)) - ((i1 + i1) - Math.abs(i1)));
        Test.dArrFld[(i1 >>> 1) % N] *= (++lArr[(i1 >>> 1) % N]);
        vMeth_check_sum += by + s + i1 + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1(int i3, int i4, int i5) {

        int i6=0, i7=-43878, i8=11, i9=119, i10=28168, i11=17597, i12=-2, i13=-55461, iArr1[]=new int[N];
        float f=-109.52F;
        boolean b=false;

        FuzzerUtils.init(iArr1, 146);

        for (i6 = 13; 227 > i6; ++i6) {
            i5 -= i3;
            for (i8 = 1; i8 < 8; i8++) {
                i3 += i7;
            }
            if (b) {
                Test.instanceCount += i7;
                for (f = 8; 1 < f; f--) {
                    if (i3 != 0) {
                        vMeth1_check_sum += i3 + i4 + i5 + i6 + i7 + i8 + i9 + Float.floatToIntBits(f) + i10 + i11 +
                            i12 + i13 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr1);
                        return;
                    }
                    switch ((int)((f % 10) + 42)) {
                    case 42:
                        switch ((i6 % 4) + 2) {
                        case 2:
                            try {
                                iArr1[i6 + 1] = (-9857 / i6);
                                i10 = (i11 % iArr1[(int)(f - 1)]);
                                i5 = (i11 / iArr1[i6]);
                            } catch (ArithmeticException a_e) {}
                            Test.iFld = (int)224L;
                            for (i12 = 1; i12 < 2; ++i12) {
                                Test.instanceCount += i6;
                                i9 *= i4;
                            }
                            break;
                        case 3:
                            Test.instanceCount ^= i12;
                            break;
                        case 4:
                            i4 = i5;
                            break;
                        case 5:
                            i4 &= (int)Test.instanceCount;
                            break;
                        default:
                            i3 <<= i3;
                        }
                        break;
                    case 43:
                        iArr1[(int)(f)] -= i5;
                        break;
                    case 44:
                        i5 -= i3;
                        break;
                    case 45:
                        i11 -= i13;
                    case 46:
                        Test.dArrFld[(int)(f)] = 134;
                        break;
                    case 47:
                        i7 += (int)(f * f);
                    case 48:
                        Test.iFld += (int)((long)f ^ Test.instanceCount);
                        break;
                    case 49:
                        i5 = i6;
                    case 50:
                        iArr1[(int)(f)] /= (int)(Test.instanceCount | 1);
                        break;
                    case 51:
                        i4 ^= i3;
                    }
                }
            }
        }
        vMeth1_check_sum += i3 + i4 + i5 + i6 + i7 + i8 + i9 + Float.floatToIntBits(f) + i10 + i11 + i12 + i13 + (b ? 1
            : 0) + FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth1(int i2) {

        int i14=-1, i15=-7, i16=1730;
        byte by1=84;

        vMeth1(Test.iFld, Test.iFld1, -142);
        for (i14 = 15; i14 < 284; ++i14) {
            i16 = 6;
            do {
                Test.iFld = by1;
                i2 += (i16 - i2);
                Test.iFld >>= i16;
            } while (--i16 > 0);
        }
        long meth_res = i2 + i14 + i15 + i16 + by1;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(long l, long l1) {

        int iArr[]=new int[N];

        FuzzerUtils.init(iArr, -197);

        vMeth((byte)(28));
        iArr[(Test.iFld >>> 1) % N] |= iMeth1(-62765);
        long meth_res = l + l1 + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-165, i17=-564, i18=-60640, i19=-83, i20=9, i21=54, i22=251, i23=-36610, i24=-42319, i25=14, i26=-37407;
        boolean b1=true, b2=true;
        short s1=2758;
        double d=-1.38520;
        byte by2=60;
        long l2=5958274084709307795L;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 43.400F);

        i = (int)(Test.fFld * iMeth(Test.instanceCount, -11L));
        for (i17 = 2; i17 < 175; ++i17) {
            Test.instanceCount = Test.iFld1;
            for (i19 = 9; 145 > i19; ++i19) {
                b1 = b2;
                Test.instanceCount = Test.instanceCount;
                s1 -= (short)Test.instanceCount;
                Test.instanceCount += i19;
                for (i21 = 1; i21 < 2; ++i21) {
                    Test.instanceCount -= i21;
                    Test.instanceCount = i22;
                    Test.instanceCount ^= Test.instanceCount;
                    iArrFld[i17] -= (int)Test.instanceCount;
                }
                fArr[i19 + 1] %= 45653;
                Test.instanceCount += (13141 + (i19 * i19));
            }
            d += Test.instanceCount;
            for (i23 = 145; i23 > 2; i23 -= 3) {
                Test.fFld = i24;
                i18 <<= -95;
                Test.iFld += (int)Test.instanceCount;
                i22 ^= i;
                by2 >>= (byte)i22;
                by2 += (byte)(i23 + Test.iFld1);
                for (i25 = 1; i25 < 4; ++i25) {
                    i26 += (((i25 * Test.instanceCount) + Test.iFld1) - Test.fFld);
                    i26 >>= (int)Test.instanceCount;
                    l2 += (long)d;
                    i20 += (i25 ^ Test.iFld);
                    Test.fFld -= (float)2.46245;
                    Test.instanceCount ^= 107;
                }
            }
        }

        FuzzerUtils.out.println("i i17 i18 = " + i + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 i20 b1 = " + i19 + "," + i20 + "," + (b1 ? 1 : 0));
        FuzzerUtils.out.println("b2 s1 i21 = " + (b2 ? 1 : 0) + "," + s1 + "," + i21);
        FuzzerUtils.out.println("i22 d i23 = " + i22 + "," + Double.doubleToLongBits(d) + "," + i23);
        FuzzerUtils.out.println("i24 by2 i25 = " + i24 + "," + by2 + "," + i25);
        FuzzerUtils.out.println("i26 l2 fArr = " + i26 + "," + l2 + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.iFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.iFld);
        FuzzerUtils.out.println("Test.iFld1 Test.dArrFld iArrFld = " + Test.iFld1 + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)) + "," + FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
