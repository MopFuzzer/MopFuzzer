// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:22 2023
public class Test0224 {

    public static final int N = 400;

    public static volatile long instanceCount=-521572645L;
    public int iFld=50187;
    public static byte byFld=107;
    public static boolean bFld=false;
    public float fFld=-41.808F;
    public static short sFld=-1696;
    public static float[] fArrFld =new float[N];
    public static volatile int[] iArrFld =new int[N];
    public static long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test0224.fArrFld, 4.148F);
        FuzzerUtils.init(Test0224.iArrFld, 14858);
        FuzzerUtils.init(Test0224.lArrFld, -281336601L);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i11, short s) {

        int i12=-46569, i13=-132, i14=59468, i15=-9;
        float f1=8.109F;
        boolean b=true;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(lArr1, -171L);

        i12 = 1;
        do {
            Test0224.instanceCount -= (long) f1;
            Test0224.byFld += (byte) Test0224.instanceCount;
            for (i13 = 1; i13 < 6; i13++) {
                Test0224.instanceCount += (((i13 * Test0224.instanceCount) + i11) - i14);
                if (Test0224.bFld) {
                    lArr1[i12 + 1] = i12;
                    Test0224.iArrFld[i12 - 1] = (int) Test0224.instanceCount;
                    b = b;
                    Test0224.instanceCount = 7;
                } else if (b) {
                    Test0224.byFld *= (byte) i12;
                    i15 = 1;
                    while (++i15 < 2) {
                        Test0224.iArrFld[i13 - 1] = (int) 209894944L;
                        i11 += (((i15 * Test0224.instanceCount) + s) - i12);
                        Test0224.instanceCount += (((i15 * i15) + i15) - Test0224.instanceCount);
                    }
                }
            }
        } while (++i12 < 280);
        vMeth1_check_sum += i11 + s + i12 + Float.floatToIntBits(f1) + i13 + i14 + (b ? 1 : 0) + i15 +
            FuzzerUtils.checkSum(lArr1);
    }

    public static int iMeth() {

        int i7=15089;
        int i8=9;
        int i9=-11;
        int i10=122;
        int i16=1744;
        int i17=12;
        int[] iArr1 =new int[N];
        short s1=14557;
        float f2=0.249F;
        long[] lArr2 =new long[N];

        FuzzerUtils.init(iArr1, -169);
        FuzzerUtils.init(lArr2, -184L);

        for (i7 = 13; i7 < 366; i7++) {
            if (true) {
                for (i9 = 1; i9 < 5; i9++) {
                    Test0224.byFld -= Test0224.byFld;
                    i10 <<= iArr1[i9 + 1];
                    iArr1[i7] -= (int) (++Test0224.instanceCount);
                    vMeth1(i10, s1);
                    i10 = i8;
                    i10 = (int) Test0224.instanceCount;
                    lArr2[i7] += 169;
                    i8 = 43115;
                }
                switch ((i7 % 10) + 35) {
                case 35:
                case 36:
                case 37:
                    for (i16 = 1; i16 < 5; i16++) {
                        i17 *= (int)-61729L;
                        i8 <<= s1;
                    }
                    break;
                case 38:
                    Test0224.iArrFld[i7 + 1] = i9;
                case 39:
                    i8 += i17;
                    break;
                case 40:
                    i10 = (int)f2;
                    break;
                case 41:
                case 42:
                    Test0224.byFld = Test0224.byFld;
                    break;
                case 43:
                    if (Test0224.bFld) continue;
                case 44:
                    i8 *= 14;
                    break;
                default:
                    i8 = i8;
                }
            } else {
                i8 = (int)-5237809427442457703L;
            }
        }
        long meth_res = i7 + i8 + i9 + i10 + s1 + i16 + i17 + Float.floatToIntBits(f2) + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(lArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(double d, float f, int i2) {

        int i3=-836, i4=11, i5=38402, i6=-218;

        i3 = 1;
        while (++i3 < 170) {
            i4 = 1;
            do {
                for (i5 = 1; i5 > 1; i5 -= 2) {
                    Test0224.byFld += (byte) (i5 ^ i5);
                    d += (Test0224.fArrFld[i4 + 1] - (iMeth() + i5));
                    if (i5 != 0) {
                        vMeth_check_sum += Double.doubleToLongBits(d) + Float.floatToIntBits(f) + i2 + i3 + i4 + i5 +
                            i6;
                        return;
                    }
                    i6 += (i5 * i5);
                    i6 *= 4254;
                    i2 -= i3;
                    f += i3;
                    if (Test0224.bFld) {
                        Test0224.instanceCount *= Test0224.instanceCount;
                        Test0224.bFld = Test0224.bFld;
                        Test0224.lArrFld[i4 - 1] >>= -48;
                    } else if (false) {
                        i2 = i2;
                    } else {
                        i2 = i5;
                    }
                }
            } while (++i4 < 9);
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + Float.floatToIntBits(f) + i2 + i3 + i4 + i5 + i6;
    }

    public void mainTest(String[] strArr1) {

        int i=65111;
        int i1=-32234;
        int i18=10;
        int i19=-22;
        int i20=218;
        int i21=-56;
        int[] iArr =new int[N];
        double d1=0.45920;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -13L);
        FuzzerUtils.init(iArr, 3);

        lArr[(iFld >>> 1) % N] = ((iFld++) << (Test0224.instanceCount + (Test0224.byFld + iFld)));
        for (i = 14; i < 304; ++i) {
            switch (((i % 2) * 5) + 68) {
            case 77:
                switch ((i % 8) + 21) {
                case 21:
                    iArr[i - 1] += (int) ((lArr[i] * Test0224.instanceCount) + ((i + Test0224.byFld) + 19503));
                    vMeth(d1, fFld, 173);
                    for (i18 = 87; i18 > 4; --i18) {
                        for (i20 = 1; i20 < 2; i20++) {
                            short s2=29942;
                            i21 >>>= (int) Test0224.instanceCount;
                            switch ((((-254 >>> 1) % 3) * 5) + 75) {
                            case 83:
                                i19 = (int)1.949F;
                                i21 += i20;
                            case 77:
                                Test0224.iArrFld[(-10 >>> 1) % N] -= Test0224.byFld;
                                switch ((i20 % 3) + 118) {
                                case 118:
                                    iArr[i20 + 1] = i20;
                                    Test0224.bFld = Test0224.bFld;
                                    switch ((i % 4) + 70) {
                                    case 70:
                                        Test0224.iArrFld[i] %= 13;
                                        if (Test0224.bFld) break;
                                        switch ((i20 % 3) + 60) {
                                        case 60:
                                            switch ((i20 % 2) + 61) {
                                            case 61:
                                                iFld += (((i20 * fFld) + s2) - i18);
                                                lArr[i20] = i21;
                                                i21 = i;
                                                Test0224.instanceCount -= i21;
                                            case 62:
                                                Test0224.byFld &= (byte) Test0224.instanceCount;
                                                if (Test0224.bFld) {
                                                    Test0224.instanceCount = Test0224.byFld;
                                                    iArr[i20 + 1] |= -52;
                                                } else {
                                                    iFld = i18;
                                                }
                                                break;
                                            default:
                                                d1 %= (i21 | 1);
                                            }
                                            break;
                                        case 61:
                                            fFld += (((i20 * fFld) + iFld) - i18);
                                            break;
                                        case 62:
                                            Test0224.instanceCount &= -16640;
                                            break;
                                        }
                                    case 71:
                                        Test0224.instanceCount = Test0224.instanceCount;
                                        break;
                                    case 72:
                                        iFld -= i18;
                                    case 73:
                                        fFld -= i21;
                                        break;
                                    }
                                case 119:
                                    i1 += iFld;
                                    break;
                                case 120:
                                    iFld = (int) Test0224.instanceCount;
                                    break;
                                }
                                break;
                            case 76:
                                Test0224.lArrFld[i - 1] -= 184;
                            default:
                                i1 += (-22724 + (i20 * i20));
                            }
                        }
                    }
                    break;
                case 22:
                    i21 += (i - Test0224.sFld);
                case 23:
                    Test0224.fArrFld[i] *= i1;
                    break;
                case 24:
                    Test0224.instanceCount += i20;
                    break;
                case 25:
                    i21 += (i - i21);
                    break;
                case 26:
                    Test0224.iArrFld[i + 1] = Test0224.byFld;
                    break;
                case 27:
                case 28:
                    i19 >>= (int) Test0224.instanceCount;
                    break;
                default:
                    iFld >>= i18;
                }
                break;
            case 78:
                iFld = (int)-26187L;
                break;
            }
        }

        FuzzerUtils.out.println("i i1 d1 = " + i + "," + i1 + "," + Double.doubleToLongBits(d1));
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 lArr iArr = " + i21 + "," + FuzzerUtils.checkSum(lArr) + "," +
            FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test0224.instanceCount iFld Test0224.byFld = " + Test0224.instanceCount + "," + iFld + "," +
                Test0224.byFld);
        FuzzerUtils.out.println("Test0224.bFld fFld Test0224.sFld = " + (Test0224.bFld ? 1 : 0) + "," + Float.floatToIntBits(fFld)
                + "," + Test0224.sFld);
        FuzzerUtils.out.println("Test0224.fArrFld Test0224.iArrFld Test0224.lArrFld = " +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0224.fArrFld)) + "," + FuzzerUtils.checkSum(Test0224.iArrFld) +
                "," + FuzzerUtils.checkSum(Test0224.lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0224 _instance = new Test0224();
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
