// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:17 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=129L;
    public static int iFld=-4;
    public boolean bFld=false;
    public int iFld1=-55810;
    public byte byFld=-115;
    public short sFld=-32203;
    public static float fArrFld[]=new float[N];
    public static long lArrFld[]=new long[N];
    public boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 1.261F);
        FuzzerUtils.init(Test.lArrFld, 120L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(long l1, long l2) {

        float f=0.1014F;
        int i7=14, i8=14831, i9=159, i10=-31, i11=-10, i12=-3029, iArr1[]=new int[N], iArr2[][]=new int[N][N];

        FuzzerUtils.init(iArr1, 56643);
        FuzzerUtils.init(iArr2, -55);

        Test.instanceCount += (long)f;
        Test.fArrFld[(Test.iFld >>> 1) % N] += Test.iFld;
        for (i7 = 1; i7 < 350; i7++) {
            i8 *= 42842;
            for (i9 = 1; i9 < 5; i9++) {
                for (i11 = i9; i11 < 2; ++i11) {
                    f = Test.iFld;
                    iArr1 = iArr1;
                    i12 -= -4;
                    Test.iFld += (i11 | Test.instanceCount);
                    l1 += (-14L + (i11 * i11));
                }
                if (false) break;
                iArr2 = iArr2;
                i8 += (3 + (i9 * i9));
                i10 = -50;
            }
        }
        long meth_res = l1 + l2 + Float.floatToIntBits(f) + i7 + i8 + i9 + i10 + i11 + i12 +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(long l, int i5, int i6) {

        double d=0.7175;
        int i13=-7, i14=142, i15=28899, i16=-6492, i17=61314, i18=5, iArr3[]=new int[N];
        float f1=0.47F;
        short s=4804;
        byte by=-6;

        FuzzerUtils.init(iArr3, 10);

        Test.iFld = i5;
        Test.iFld = (int)((iMeth(2394465433912705886L, l) * d) - i5);
        i13 = 1;
        do {
            for (i14 = 1; 6 > i14; i14 += 3) {
                l = (long)f1;
                switch ((i13 % 6) + 8) {
                case 8:
                case 9:
                    iArr3[i14 + 1] %= (int)(s | 1);
                    for (i16 = 1; i16 < 6; i16++) {
                        iArr3[i14 - 1] -= by;
                        i15 += (((i16 * Test.iFld) + i17) - Test.iFld);
                        Test.fArrFld[i14 + 1] = by;
                        switch ((i16 % 4) + 89) {
                        case 89:
                            l = l;
                            i5 = i5;
                            i17 += i16;
                        case 90:
                            i17 += i16;
                            break;
                        case 91:
                            i6 >>= 38925;
                            break;
                        case 92:
                            try {
                                Test.iFld = (330796157 % i6);
                                i6 = (i15 % -133);
                                i17 = (Test.iFld % -39857);
                            } catch (ArithmeticException a_e) {}
                            break;
                        }
                    }
                    break;
                case 10:
                    Test.instanceCount >>>= i18;
                case 11:
                    s <<= (short)i14;
                    break;
                case 12:
                    i5 = i13;
                    break;
                case 13:
                    f1 = l;
                default:
                    Test.lArrFld[i13] = 9;
                }
            }
        } while (++i13 < 299);
        vMeth1_check_sum += l + i5 + i6 + Double.doubleToLongBits(d) + i13 + i14 + i15 + Float.floatToIntBits(f1) + s +
            i16 + i17 + by + i18 + FuzzerUtils.checkSum(iArr3);
    }

    public static void vMeth(int i2) {

        int i3=-71, i4=0, i19=-187, i20=4133, i21=-18076, iArr4[]=new int[N];
        double d1=-2.91677;

        FuzzerUtils.init(iArr4, 42233);

        for (i3 = 5; i3 < 266; i3++) {
            vMeth1(Test.instanceCount, 15811, -14);
            switch (((i3 % 5) * 5) + 28) {
            case 46:
                Test.iFld <<= Test.iFld;
                break;
            case 42:
                Test.lArrFld[i3 + 1] -= Test.iFld;
            case 39:
                i2 += 240;
                for (i19 = i3; i19 < 6; i19++) {
                    Test.iFld *= i2;
                    Test.fArrFld = Test.fArrFld;
                    i20 = (int)d1;
                    Test.instanceCount -= Test.instanceCount;
                }
            case 48:
                try {
                    i4 = (122 % i19);
                    i20 = (10 % i19);
                    i20 = (i19 / -61887);
                } catch (ArithmeticException a_e) {}
                i21 = 1;
                do {
                    i2 >>= 165;
                    iArr4[i3] -= i2;
                } while (++i21 < 6);
                break;
            case 32:
                Test.instanceCount = i20;
                break;
            default:
                i4 >>= i19;
            }
        }
        vMeth_check_sum += i2 + i3 + i4 + i19 + i20 + Double.doubleToLongBits(d1) + i21 + FuzzerUtils.checkSum(iArr4);
    }

    public void mainTest(String[] strArr1) {

        int i=-44693, i1=-37, i22=-29125, i23=138, i24=2, i25=4109, i26=0, iArr[]=new int[N];
        float f2=0.483F;
        long l3=167L;
        short s1=-13980;
        double d2=-48.119185;

        FuzzerUtils.init(iArr, 11);

        Test.iFld >>= (((++Test.iFld) - iArr[(Test.iFld >>> 1) % N]) + Test.iFld);
        i = 1;
        do {
            Test.iFld = (int)-2L;
            i1 = 1;
            while ((i1 += 3) < 68) {
                vMeth(i);
                f2 += (134 + (i1 * i1));
                i22 = 1;
                do {
                    Test.iFld += (i22 + i);
                    Test.iFld *= i1;
                    bFld = bFld;
                } while (++i22 < 4);
                f2 += (i1 - f2);
                for (i23 = 1; i23 < 4; i23 += 2) {
                    Test.instanceCount += (((i23 * Test.instanceCount) + l3) - Test.instanceCount);
                    Test.iFld += (i23 - iFld1);
                    Test.iFld = (int)f2;
                    switch ((i % 10) + 34) {
                    case 34:
                        switch (((i % 8) * 5) + 108) {
                        case 122:
                            iFld1 >>= i;
                            Test.iFld = i22;
                            Test.instanceCount *= -6232L;
                            iArr[i] = (int)f2;
                            break;
                        case 148:
                            bArrFld[i + 1] = bFld;
                            try {
                                Test.iFld = (iFld1 % 17767);
                                iArr[i + 1] = (i1 / -8292);
                                Test.iFld = (iArr[i23 + 1] / i);
                            } catch (ArithmeticException a_e) {}
                            if (bFld) continue;
                            Test.iFld = Test.iFld;
                            break;
                        case 133:
                            byFld += (byte)66.72824;
                            l3 >>= l3;
                            iFld1 %= 2;
                            i25 -= 14;
                            break;
                        case 129:
                            iArr[(i1 >>> 1) % N] |= (int)l3;
                            break;
                        case 115:
                            i25 = s1;
                        case 146:
                            Test.fArrFld[i23] = l3;
                        case 121:
                            d2 -= Test.instanceCount;
                            break;
                        case 126:
                        default:
                            i25 = i25;
                        }
                        break;
                    case 35:
                        iFld1 += i;
                        break;
                    case 36:
                        i24 += (int)d2;
                        break;
                    case 37:
                        Test.lArrFld[i23] += iFld1;
                    case 38:
                        iFld1 = (int)Test.instanceCount;
                        break;
                    case 39:
                        Test.iFld += (((i23 * i23) + Test.instanceCount) - sFld);
                        break;
                    case 40:
                        l3 -= i1;
                    case 41:
                        iFld1 >>= i26;
                        break;
                    case 42:
                        try {
                            i26 = (Test.iFld % i22);
                            i26 = (i23 % -1015651926);
                            i24 = (i22 / Test.iFld);
                        } catch (ArithmeticException a_e) {}
                    case 43:
                        Test.instanceCount += (i23 - byFld);
                        break;
                    }
                }
            }
        } while (++i < 369);

        FuzzerUtils.out.println("i i1 f2 = " + i + "," + i1 + "," + Float.floatToIntBits(f2));
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("l3 i25 s1 = " + l3 + "," + i25 + "," + s1);
        FuzzerUtils.out.println("d2 i26 iArr = " + Double.doubleToLongBits(d2) + "," + i26 + "," +
            FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld bFld = " + Test.instanceCount + "," + Test.iFld + "," +
            (bFld ? 1 : 0));
        FuzzerUtils.out.println("iFld1 byFld sFld = " + iFld1 + "," + byFld + "," + sFld);
        FuzzerUtils.out.println("Test.fArrFld Test.lArrFld bArrFld = " +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," + FuzzerUtils.checkSum(Test.lArrFld) +
            "," + FuzzerUtils.checkSum(bArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
