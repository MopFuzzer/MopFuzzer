// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:11 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-14L;
    public static int iFld=137;
    public static float fFld=1.185F;
    public static byte byFld=68;
    public static double dFld=122.55421;
    public static volatile int iFld1=21520;
    public static boolean bFld=true;
    public static double dArrFld[]=new double[N];
    public static int iArrFld[]=new int[N];
    public float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 21.106541);
        FuzzerUtils.init(Test.iArrFld, -235);
    }

    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l1, int i4) {

        int i5=42, i6=-252, i7=34051, i8=11, i9=128, i10=-9, iArr[]=new int[N];
        double d2=-2.48182;

        FuzzerUtils.init(iArr, 57675);

        Test.instanceCount = i4;
        i5 = 1;
        do {
            l1 = l1;
            Test.instanceCount = i4;
            i4 += (((i5 * i5) + Test.iFld) - Test.fFld);
            Test.instanceCount ^= i4;
            for (i6 = 1; i6 < 13; ++i6) {
                i7 = i4;
                Test.instanceCount = 110;
                i8 += (((i6 * Test.instanceCount) + Test.instanceCount) - i6);
                i4 = (int)12L;
                for (i9 = 1; i9 < 2; i9++) {
                    d2 += i9;
                    iArr[i6] = 10;
                    i4 = (int)l1;
                }
            }
        } while (++i5 < 121);
        vMeth1_check_sum += l1 + i4 + i5 + i6 + i7 + i8 + i9 + i10 + Double.doubleToLongBits(d2) +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i2) {

        double d1=64.82359;
        int i3=8, iArr1[]=new int[N];
        float f=41.225F;
        long l2=-5668183118172180264L, lArr[]=new long[N];
        byte by=-32;

        FuzzerUtils.init(lArr, 8L);
        FuzzerUtils.init(iArr1, -35640);

        for (d1 = 7; d1 < 263; d1++) {
            Test.instanceCount = Test.instanceCount;
            Test.instanceCount >>= (long)(f - (++i2));
            i3 = (int)Test.instanceCount;
            vMeth1(Test.instanceCount, i3);
            i2 -= (int)d1;
            i2 -= Test.iFld;
            switch ((((i3 >>> 1) % 5) * 5) + 115) {
            case 129:
                lArr[(int)(d1)] += Test.iFld;
                switch ((int)(((d1 % 2) * 5) + 70)) {
                case 78:
                    l2 -= Test.instanceCount;
                    break;
                case 74:
                default:
                    Test.iFld = i3;
                    Test.instanceCount += -70;
                    i2 += (int)l2;
                    Test.instanceCount += l2;
                }
            case 134:
                iArr1[(int)(d1 + 1)] -= by;
            case 139:
            case 116:
                i3 >>>= by;
                break;
            case 136:
                i3 += (int)(d1 * d1);
            default:
                Test.iFld = i3;
            }
        }
        vMeth_check_sum += i2 + Double.doubleToLongBits(d1) + i3 + Float.floatToIntBits(f) + l2 + by +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1);
    }

    public static float fMeth(int i1) {

        double d=24.77452;
        int i11=1, i12=-63619, i13=-3, i14=7, i15=-11, i16=4931, iArr2[]=new int[N];

        FuzzerUtils.init(iArr2, 0);

        d = 1;
        while (++d < 159) {
            vMeth(i1);
            Test.instanceCount += (-25 + (d * d));
            i1 = Test.byFld;
            for (i11 = 1; i11 < 10; ++i11) {
                Test.fFld += i1;
                for (i13 = 1; i13 < 2; ++i13) {
                    Test.instanceCount &= Test.instanceCount;
                    i1 *= -170;
                    iArr2[i13 - 1] >>= i11;
                }
            }
            i12 += (int)(27.231F + (d * d));
        }
        for (i15 = 2; i15 < 293; i15++) {
            Test.instanceCount = 53648L;
            Test.dFld = Test.fFld;
            i16 += (int)Test.fFld;
        }
        long meth_res = i1 + Double.doubleToLongBits(d) + i11 + i12 + i13 + i14 + i15 + i16 +
            FuzzerUtils.checkSum(iArr2);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        long l=8727818815444453821L, lArr1[]=new long[N];
        int i=-11, i17=11, i18=136, i19=0, i20=3, i21=5, i22=6, i23=-10;
        short s=-13128;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(lArr1, -5528458103737448952L);
        FuzzerUtils.init(byArr, (byte)-51);

        for (l = 226; l > 5; l--) {
            if (Test.bFld) {
                i += (int)l;
                Test.dArrFld[(int)(l - 1)] = ((fMeth(i) + Test.fFld) * i);
            } else if (Test.bFld) {
                Test.iArrFld[(int)(l + 1)] = (int)l;
                fArrFld[(int)(l - 1)] -= Test.iFld;
            } else if (Test.bFld) {
                lArr1[(int)(l + 1)] += s;
                if (false) continue;
                for (i17 = 3; i17 < 114; i17++) {
                    i19 = 1;
                    do {
                        i18 = (int)Test.instanceCount;
                        Test.iArrFld[i19 - 1] += Test.iFld;
                        i18 = s;
                        Test.iFld1 += i19;
                    } while (++i19 < 2);
                }
                i18 += (int)(((l * Test.iFld1) + s) - Test.fFld);
            } else {
                Test.iFld1 += Test.iFld;
                Test.bFld = Test.bFld;
            }
            for (i20 = 5; i20 < 114; i20 += 3) {
                switch (((-251 >>> 1) % 1) + 52) {
                case 52:
                    Test.iArrFld = Test.iArrFld;
                    i21 -= (int)Test.dFld;
                    i18 = Test.iFld;
                    Test.fFld += (6338 + (i20 * i20));
                    break;
                default:
                    for (i22 = 1; i22 < 4; i22++) {
                        i21 += (0 + (i22 * i22));
                        if (Test.bFld) continue;
                        byArr[(int)(l)] += (byte)Test.dFld;
                        Test.instanceCount -= i23;
                        i18 = (int)l;
                        i23 = Test.byFld;
                    }
                }
            }
        }

        FuzzerUtils.out.println("l i s = " + l + "," + i + "," + s);
        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 lArr1 byArr = " + i23 + "," + FuzzerUtils.checkSum(lArr1) + "," +
            FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.fFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.byFld Test.dFld Test.iFld1 = " + Test.byFld + "," +
            Double.doubleToLongBits(Test.dFld) + "," + Test.iFld1);
        FuzzerUtils.out.println("Test.bFld Test.dArrFld Test.iArrFld = " + (Test.bFld ? 1 : 0) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)) + "," + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
