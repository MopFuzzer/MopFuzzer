// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:10 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-13L;
    public static boolean bFld=true;
    public static short sFld=31179;
    public static byte byFld=71;
    public static float fFld=-47.661F;
    public static int iFld=-58057;
    public static int iFld1=-61908;
    public static int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -81);
        FuzzerUtils.init(Test.fArrFld, 91.209F);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth() {

        int i5=5, i6=-59523, i7=174, i8=8, i9=35209;
        long l=392426442715033063L, l1=6L;
        double d=0.89519;

        i5 = i5;
        for (i6 = 260; i6 > 14; --i6) {
            i8 = 1;
            do {
                i7 %= (int)(Test.instanceCount | 1);
                Test.instanceCount %= (i5 | 1);
                for (l = 1; l > 1; --l) {
                    if (true) break;
                    switch ((i6 % 10) + 78) {
                    case 78:
                        i5 = (int)Test.instanceCount;
                        d = i8;
                        if (Test.bFld) continue;
                        Test.sFld *= (short)3686552620665228990L;
                        break;
                    case 79:
                        if (Test.bFld) continue;
                        Test.iArrFld[i8 - 1] >>>= (int)l;
                        i9 -= (int)l;
                        break;
                    case 80:
                        Test.sFld -= (short)i7;
                    case 81:
                        l1 >>= l;
                        break;
                    case 82:
                        Test.bFld = Test.bFld;
                        break;
                    case 83:
                        i9 += i8;
                        break;
                    case 84:
                        d += 46378;
                        break;
                    case 85:
                        Test.fArrFld[i6] *= i7;
                        break;
                    case 86:
                        Test.instanceCount -= (long)d;
                    case 87:
                        d -= 5547;
                        break;
                    }
                }
            } while (++i8 < 7);
        }
        long meth_res = i5 + i6 + i7 + i8 + l + i9 + Double.doubleToLongBits(d) + l1;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth(int i1, int i2) {

        int i3=-6663, i4=49797, i10=35879, i11=252, i12=-161, i13=12;
        byte by=75;
        float f=0.997F;

        Test.iArrFld = Test.iArrFld;
        for (i3 = 11; 227 > i3; ++i3) {
            i4 = (int)(((-lMeth()) * Test.instanceCount) - -217);
            i4 -= i4;
            switch (((i3 % 10) * 5) + 44) {
            case 49:
                i1 += (i3 + i1);
                break;
            case 74:
                i1 -= i2;
                for (i10 = 1; i10 < 7; ++i10) {
                    Test.sFld <<= (short)i11;
                }
                break;
            case 73:
                for (i12 = 1; 7 > i12; ++i12) {
                    by = (byte)i11;
                }
                break;
            case 70:
                Test.fArrFld[i3] += -3243267927L;
                i11 = (int)Test.instanceCount;
                i4 += (i3 | Test.sFld);
            case 53:
                f += i2;
            case 63:
            case 77:
                Test.iArrFld[i3] >>= (int)-41L;
                break;
            case 71:
            case 50:
                Test.instanceCount -= i13;
                break;
            case 84:
                i1 = i3;
                break;
            default:
                Test.instanceCount += (((i3 * Test.sFld) + i3) - i1);
            }
        }
        long meth_res = i1 + i2 + i3 + i4 + i10 + i11 + i12 + i13 + by + Float.floatToIntBits(f);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i=-17197, i14=-37, i15=-1, i16=1702, i17=12, i18=14404, i19=1, i20=-101, iArr[]=new int[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -44);
        FuzzerUtils.init(lArr, -14723L);

        i = (i--);
        iMeth(i, i);
        iArr[(i >>> 1) % N] <<= i;
        Test.instanceCount -= Test.byFld;
        for (i14 = 13; i14 < 220; i14++) {
            i &= i;
            Test.fFld += i;
            switch (((i14 % 5) * 5) + 109) {
            case 121:
                Test.iFld += (((i14 * Test.instanceCount) + i) - i15);
                for (i16 = 1; 8 > i16; i16++) {
                    for (i18 = 1; i18 < 2; i18++) {
                        Test.instanceCount = Test.instanceCount;
                        iArr[i16] <<= -3;
                        i15 += (int)Test.fFld;
                        lArr[(i19 >>> 1) % N] = i19;
                    }
                }
            case 115:
                Test.instanceCount -= i20;
                break;
            case 117:
                i17 += (((i14 * Test.byFld) + Test.iFld1) - i14);
            case 112:
                if (Test.bFld) continue;
                break;
            case 123:
                i15 += (((i14 * i) + Test.byFld) - i14);
                break;
            default:
                i = Test.byFld;
            }
        }
        vMeth_check_sum += i + i14 + i15 + i16 + i17 + i18 + i19 + i20 + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        double d1=0.96417, d2=1.123458;
        int i22=12, i23=-3, i24=1, i25=2, i26=-7, i27=-41459, i28=64840, i29=7, i30=-24, i31=0;
        byte by1=-124, byArr[]=new byte[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -8639495404235429327L);
        FuzzerUtils.init(byArr, (byte)-56);

        vMeth();
        for (int i21 : Test.iArrFld) {
            i21 = (int)d1;
            for (i22 = 63; i22 > 2; --i22) {
                d1 = Test.iFld;
                lArr1[i22 + 1] = Test.instanceCount;
                by1 += (byte)(-44 + (i22 * i22));
                try {
                    i25 = (i24 % -21084);
                    i25 = (-141 % i24);
                    Test.iArrFld[i22] = (7070 % i23);
                } catch (ArithmeticException a_e) {}
            }
            Test.iArrFld[(Test.iFld >>> 1) % N] -= (int)Test.fFld;
            i26 = 1;
            do {
                Test.iFld *= i22;
                i21 <<= -6;
                Test.instanceCount += Test.instanceCount;
                Test.bFld = Test.bFld;
            } while (++i26 < 63);
            i23 += (int)51409L;
            i21 >>= (int)243559318L;
            Test.instanceCount = i24;
            d2 = Test.instanceCount;
        }
        i27 = 1;
        while (++i27 < 201) {
            Test.fFld += (-49 + (i27 * i27));
            byArr[i27] += (byte)19790;
            for (i28 = i27; i28 < 125; ++i28) {
                for (i30 = 1; i30 > 1; i30--) {
                    Test.iFld1 += i30;
                    Test.fArrFld[i27 + 1] *= i24;
                    Test.iFld *= (int)Test.instanceCount;
                    Test.instanceCount <<= Test.iFld;
                }
                i29 = (int)-1.741F;
                i25 = Test.iFld;
                by1 += (byte)(((i28 * Test.fFld) + Test.fFld) - i25);
            }
        }

        FuzzerUtils.out.println("d1 i22 i23 = " + Double.doubleToLongBits(d1) + "," + i22 + "," + i23);
        FuzzerUtils.out.println("by1 i24 i25 = " + by1 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 d2 i27 = " + i26 + "," + Double.doubleToLongBits(d2) + "," + i27);
        FuzzerUtils.out.println("i28 i29 i30 = " + i28 + "," + i29 + "," + i30);
        FuzzerUtils.out.println("i31 lArr1 byArr = " + i31 + "," + FuzzerUtils.checkSum(lArr1) + "," +
            FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.sFld = " + Test.instanceCount + "," + (Test.bFld ? 1
            : 0) + "," + Test.sFld);
        FuzzerUtils.out.println("Test.byFld Test.fFld Test.iFld = " + Test.byFld + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.iFld);
        FuzzerUtils.out.println("Test.iFld1 Test.iArrFld Test.fArrFld = " + Test.iFld1 + "," +
            FuzzerUtils.checkSum(Test.iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  lMeth ->  lMeth iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
