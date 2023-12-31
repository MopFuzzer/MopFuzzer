// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:10 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=4490836329210888279L;
    public static float fFld=2.1018F;
    public static double dFld=0.95846;
    public static volatile short sFld=9050;
    public static volatile float fArrFld[]=new float[N];
    public static byte byArrFld[][]=new byte[N][N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.fArrFld, -2.574F);
        FuzzerUtils.init(Test.byArrFld, (byte)109);
        FuzzerUtils.init(Test.dArrFld, 0.91095);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vSmallMeth(float f) {

        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 3214121054839288908L);

        lArr = (lArr = (lArr = (lArr = lArr)));
        vSmallMeth_check_sum += Float.floatToIntBits(f) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1(int i9, double d, long l) {

        boolean b=true;
        int i10=-130, i11=-65, i12=201, i13=-12905, i14=-2, i15=149, i16=223;

        b = b;
        i9 -= i9;
        i9 *= (int)l;
        for (i10 = 11; i10 < 380; i10++) {
            i11 >>= i9;
            i11 = i12;
            Test.fFld += (((i10 * i12) + i12) - i11);
            for (i13 = 1; i13 < 5; ++i13) {
                for (i15 = 1; i15 < 2; i15 += 2) {
                    if (b) {
                        l += (i15 - Test.fFld);
                        i16 *= (int)d;
                        i14 = (int)Test.instanceCount;
                        Test.fArrFld[i15] -= i16;
                    } else {
                        Test.byArrFld[i13][i15] += (byte)i12;
                    }
                }
            }
        }
        vMeth1_check_sum += i9 + Double.doubleToLongBits(d) + l + (b ? 1 : 0) + i10 + i11 + i12 + i13 + i14 + i15 + i16;
    }

    public static void vMeth(int i7, int i8, float f2) {

        float f3=-53.971F;
        boolean b1=true;
        double d1=0.91974;
        int i17=-72, i18=-13, i19=-9, iArr[]=new int[N];
        byte by1=0;

        FuzzerUtils.init(iArr, 7);

        f3 = 1;
        do {
            i8 += (2 + (f3 * f3));
            vMeth1(i8, 0.128146, Test.instanceCount);
            i8 += i8;
            iArr[(int)(f3 - 1)] -= i8;
        } while (++f3 < 373);
        Test.instanceCount = i7;
        b1 = b1;
        for (d1 = 6; d1 < 198; ++d1) {
            Test.dFld += i7;
            by1 += (byte)i7;
            Test.dFld = i8;
            for (i18 = 8; i18 > 1; i18 -= 3) {
                Test.sFld -= (short)i17;
            }
            if (b1) break;
            Test.instanceCount -= i17;
        }
        vMeth_check_sum += i7 + i8 + Float.floatToIntBits(f2) + Float.floatToIntBits(f3) + (b1 ? 1 : 0) +
            Double.doubleToLongBits(d1) + i17 + by1 + i18 + i19 + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth() {

        int i5=6, i6=58, i20=-8336, i21=6601, i22=32715, i23=6, i24=55, iArr1[]=new int[N];
        boolean b2=true;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr1, 178);
        FuzzerUtils.init(lArr1, -11L);

        for (i5 = 9; i5 < 158; i5++) {
            vMeth(i6, i5, Test.fFld);
            iArr1[i5 - 1] += -7;
            i6 |= i5;
            if (b2) break;
            i6 <<= Test.sFld;
            i20 = 1;
            while (++i20 < 11) {
                Test.dFld = i6;
                i6 &= 4346;
                i6 = (int)Test.fFld;
                for (i21 = i20; i21 < 1; i21++) {
                    switch (((i5 >>> 1) % 9) + 46) {
                    case 46:
                        iArr1[i20] = (int)Test.instanceCount;
                        i6 = i21;
                        i23 = -27217;
                        break;
                    case 47:
                        lArr1[i5 + 1] -= (long)1.917F;
                        break;
                    case 48:
                        i6 = i22;
                        break;
                    case 49:
                        i6 -= (int)Test.instanceCount;
                        break;
                    case 50:
                        Test.instanceCount -= 47;
                        break;
                    case 51:
                        i23 += (((i21 * i22) + Test.instanceCount) - i22);
                        break;
                    case 52:
                        i24 <<= 4;
                        break;
                    case 53:
                        i22 = -244;
                        break;
                    case 54:
                        Test.fFld += i22;
                        break;
                    }
                }
            }
        }
        long meth_res = i5 + i6 + (b2 ? 1 : 0) + i20 + i21 + i22 + i23 + i24 + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f1=-85.478F;
        int i=-34992, i1=-38378, i2=-51441, i3=2, i4=4, i25=200, i26=52453, iArr2[]=new int[N];
        byte by=-55;

        FuzzerUtils.init(iArr2, -12757);

        for (int smallinvoc=0; smallinvoc<389; smallinvoc++) vSmallMeth(f1);
        for (i = 21; i < 378; ++i) {
            i1 = (int)Test.instanceCount;
            for (i2 = 2; i2 < 71; i2++) {
                i4 = 1;
                do {
                    short s=-2874;
                    boolean b3=true;
                    switch ((i4 % 1) + 2) {
                    case 2:
                        i3 -= (i3--);
                        switch ((i % 8) + 33) {
                        case 33:
                            by += (byte)(i4 * i4);
                            break;
                        case 34:
                            i1 = i;
                            i3 -= (int)Test.instanceCount;
                            i1 += i4;
                        case 35:
                            s += (short)(++i3);
                            i1 = (--i1);
                            break;
                        case 36:
                            f1 -= ((++Test.instanceCount) * (iMeth() - i2));
                            break;
                        case 37:
                        case 38:
                            if (b3) continue;
                            try {
                                i3 = (-1355061911 % i26);
                                i1 = (iArr2[(i4 >>> 1) % N] / 213);
                                i3 = (i4 / -40181);
                            } catch (ArithmeticException a_e) {}
                            break;
                        case 39:
                            Test.dArrFld = Test.dArrFld;
                            i25 = -197;
                            b3 = b3;
                            switch (((i2 % 2) * 5) + 86) {
                            case 90:
                                i25 = (int)-60248L;
                                s += (short)(((i4 * i2) + Test.instanceCount) - Test.instanceCount);
                                Test.instanceCount = i3;
                                break;
                            case 89:
                                Test.instanceCount += (long)Test.fFld;
                                f1 = f1;
                                i26 = 52218;
                                break;
                            }
                        case 40:
                            b3 = b3;
                            break;
                        }
                        break;
                    default:
                        i1 |= i1;
                        b3 = true;
                    }
                } while ((i4 += 2) < 2);
            }
        }

        FuzzerUtils.out.println("f1 i i1 = " + Float.floatToIntBits(f1) + "," + i + "," + i1);
        FuzzerUtils.out.println("i2 i3 i4 = " + i2 + "," + i3 + "," + i4);
        FuzzerUtils.out.println("by i25 i26 = " + by + "," + i25 + "," + i26);
        FuzzerUtils.out.println("iArr2 = " + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.dFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.sFld Test.fArrFld Test.byArrFld = " + Test.sFld + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," + FuzzerUtils.checkSum(Test.byArrFld));
        FuzzerUtils.out.println("Test.dArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));

        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
