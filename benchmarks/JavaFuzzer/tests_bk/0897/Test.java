// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:16 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=28L;
    public static volatile float fFld=1.955F;
    public static int iFld=0;
    public static double dFld=66.54314;
    public static int iFld1=10;
    public static byte byFld=-108;
    public static short sFld=20124;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -194);
        FuzzerUtils.init(Test.lArrFld, -6815964265220317157L);
    }

    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public float fMeth(int i3) {

        int i4=-13044, i5=4;

        for (i4 = 12; 285 > i4; i4++) {
            Test.iArrFld[i4 + 1] += (int)Test.fFld;
            Test.instanceCount = (-Test.iArrFld[i4]);
            i5 = (int)(101.298F * i5);
            Test.iArrFld[i4 - 1] = (i5++);
            Test.iFld += (i4 ^ i4);
            Test.iArrFld[i4 - 1] = (i5++);
        }
        Test.fFld %= (Test.iArrFld[(5 >>> 1) % N] | 1);
        long meth_res = i3 + i4 + i5;
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth2() {

        float f=19.308F;
        int i6=6, i7=-34099, i8=20110, i9=24601, i10=-63027, i11=7761;
        long l3=-2405036776L;
        byte by=92;
        short s2=30640;

        for (f = 14; f < 271; f++) {
            for (i7 = 6; i7 > 1; i7 -= 2) {
                for (l3 = 1; l3 < 3; ++l3) {
                    Test.iArrFld[i7] = (int)-2.91F;
                }
                Test.fFld = i9;
                by = (byte)i6;
                i8 = (int)Test.dFld;
                i9 >>= s2;
                i8 *= (int)Test.dFld;
                for (i10 = 1; i10 < 3; i10++) {
                    i6 -= i7;
                    by += (byte)i10;
                    i8 -= (int)Test.instanceCount;
                }
                Test.iArrFld[i7] -= i7;
            }
            i8 <<= i8;
        }
        vMeth2_check_sum += Float.floatToIntBits(f) + i6 + i7 + i8 + l3 + i9 + by + s2 + i10 + i11;
    }

    public static void vMeth1(short s, short s1) {

        int i12=58883, i13=2, i14=-4, i15=55, i16=3;
        double d=2.16080;
        boolean b=false, b1=false;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 15675L);

        vMeth2();
        Test.iFld1 += (int)45.3601;
        i12 = 1;
        while (++i12 < 281) {
            for (d = 1; d < 6; ++d) {
                Test.iFld1 *= Test.iFld1;
                Test.iArrFld[i12 - 1] += Test.iFld1;
                i13 <<= Test.iFld;
                for (i14 = 1; i14 < 2; ++i14) {
                    Test.iArrFld[(int)(d - 1)] += (int)Test.fFld;
                    Test.instanceCount *= (long)Test.fFld;
                    if (b) {
                        lArr1 = FuzzerUtils.long1array(N, (long)0L);
                    } else if (b) {
                        i15 = Test.iFld;
                        Test.fFld -= 2;
                        Test.iFld += i14;
                    } else if (b1) {
                        i16 <<= i16;
                    } else {
                        s1 += (short)(i14 | Test.byFld);
                    }
                }
            }
        }
        vMeth1_check_sum += s + s1 + i12 + Double.doubleToLongBits(d) + i13 + i14 + i15 + i16 + (b ? 1 : 0) + (b1 ? 1 :
            0) + FuzzerUtils.checkSum(lArr1);
    }

    public void vMeth(long l, long l1) {

        long l2=2956749987L, lArr[]=new long[N];
        int i=9, i1=13205, i2=32415, iArr[]=new int[N];

        FuzzerUtils.init(iArr, 133);
        FuzzerUtils.init(lArr, -1568365702L);

        for (l2 = 19; l2 < 355; l2++) {
            i <<= i;
            try {
                iArr[(int)(l2)] = (i % -56137);
                iArr[(int)(l2)] = (8 % i);
                i = (iArr[(int)(l2)] % -1856);
            } catch (ArithmeticException a_e) {}
            for (i1 = 5; 1 < i1; i1--) {
                Test.instanceCount *= 130;
                Test.fFld *= ((++i2) * fMeth(i2 - -41493));
                lArr[(int)(l2 - 1)] -= (long)fMeth(i1);
                Test.iFld -= (int)((l %= ((-3545L + Test.iArrFld[i1 + 1]) | 1)) + ((-(i2 - l2)) + (i - Test.iFld)));
            }
            vMeth1(Test.sFld, Test.sFld);
            Test.iFld1 = (int)l1;
            Test.iFld1 = i1;
            Test.dFld += -32319;
            iArr[(int)(l2 - 1)] = i1;
            i2 >>>= i1;
        }
        Test.dFld += -252;
        vMeth_check_sum += l + l1 + l2 + i + i1 + i2 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i17=9, i18=157, i19=0, i20=68, i21=1, i22=-11, i23=-155, i24=-28215;
        boolean b2=true;
        float fArr[][]=new float[N][N];

        FuzzerUtils.init(fArr, 1.75F);

        vMeth(-70L, Test.instanceCount);
        for (i17 = 4; i17 < 153; i17++) {
            Test.fFld -= Test.iFld1;
            for (i19 = 168; i19 > 10; i19 -= 2) {
                for (i21 = 3; i21 > 1; i21--) {
                    Test.iArrFld[i17] >>= i20;
                }
                Test.iArrFld[(i21 >>> 1) % N] <<= i18;
                i22 -= 0;
                i20 = i18;
                if (b2) {
                    Test.instanceCount *= Test.instanceCount;
                    i20 += (((i19 * Test.iFld) + i20) - Test.instanceCount);
                } else if (b2) {
                    switch ((i17 % 10) + 6) {
                    case 6:
                        Test.iFld1 = Test.byFld;
                        Test.fFld += -13;
                        break;
                    case 7:
                        Test.iFld1 += i19;
                    case 8:
                        i18 = i19;
                        Test.iFld1 -= (int)Test.fFld;
                        break;
                    case 9:
                        i20 ^= (int)49L;
                        fArr = fArr;
                        i20 |= i22;
                        i20 += (int)Test.dFld;
                        break;
                    case 10:
                        Test.instanceCount ^= i22;
                        Test.fFld += ((long)i19 ^ (long)Test.instanceCount);
                    case 11:
                        Test.instanceCount += (((i19 * Test.instanceCount) + Test.fFld) - i18);
                        for (i23 = 1; i23 < 3; i23++) {
                            Test.fFld += (i23 * i23);
                            Test.lArrFld[i19] += i18;
                            Test.iFld = (int)34677L;
                            Test.lArrFld[i23] *= -6;
                        }
                        break;
                    case 12:
                        Test.iFld -= Test.byFld;
                        break;
                    case 13:
                        Test.instanceCount = Test.iFld;
                        break;
                    case 14:
                        i22 *= 8;
                        break;
                    case 15:
                        Test.sFld = (short)58279;
                        break;
                    default:
                        Test.instanceCount <<= 1678983534883873778L;
                    }
                } else {
                    Test.iArrFld[i17] -= -148;
                }
            }
        }

        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 b2 = " + i23 + "," + i24 + "," + (b2 ? 1 : 0));
        FuzzerUtils.out.println("fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.iFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.iFld);
        FuzzerUtils.out.println("Test.dFld Test.iFld1 Test.byFld = " + Double.doubleToLongBits(Test.dFld) + "," +
            Test.iFld1 + "," + Test.byFld);
        FuzzerUtils.out.println("Test.sFld Test.iArrFld Test.lArrFld = " + Test.sFld + "," +
            FuzzerUtils.checkSum(Test.iArrFld) + "," + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  fMeth ->  fMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}