// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:37 2023
public class Test0525 {

    public static final int N = 400;

    public static long instanceCount=-15L;
    public static volatile float fFld=38.905F;
    public static byte byFld=105;
    public static boolean bFld=true;
    public static volatile int iFld=240;
    public static short sFld=475;
    public static long lFld=0L;
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0525.iArrFld, -38182);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i2) {

        int i3=-17904, i4=-55432, i5=-118, i6=2, i7=3640, i8=196, i9=19262;
        double d1=-2.111768;
        float[] fArr =new float[N];
        short[] sArr =new short[N];
        boolean[] bArr =new boolean[N];

        FuzzerUtils.init(fArr, 30.522F);
        FuzzerUtils.init(sArr, (short)-17709);
        FuzzerUtils.init(bArr, false);

        i3 = 1;
        do {
            for (i4 = 1; i4 < 7; i4++) {
                switch ((i4 % 2) + 28) {
                case 28:
                    for (i6 = i3; i6 < 2; ++i6) {
                        Test0525.fFld -= i6;
                        i7 -= 4;
                    }
                    switch (((i3 % 6) * 5) + 36) {
                    case 38:
                        fArr = fArr;
                        i2 *= i7;
                        i5 = i3;
                        switch (((i4 % 2) * 5) + 34) {
                        case 37:
                            i2 = i4;
                            for (i8 = 1; i8 < 2; ++i8) {
                                sArr = FuzzerUtils.short1array(N, (short)9952);
                                Test0525.byFld += (byte) (i8 | i5);
                            }
                            break;
                        case 40:
                            if (Test0525.bFld) break;
                        default:
                            bArr[i4 + 1] = Test0525.bFld;
                        }
                    case 43:
                        Test0525.instanceCount += (i4 * i4);
                        break;
                    case 56:
                        if (Test0525.bFld) continue;
                        break;
                    case 58:
                        Test0525.iArrFld[i4 - 1] = 8119;
                        break;
                    case 59:
                        Test0525.iArrFld[i3] = 63352;
                    case 48:
                        Test0525.instanceCount = -43617L;
                        break;
                    }
                    break;
                case 29:
                default:
                    d1 = i3;
                }
            }
        } while (++i3 < 249);
        vMeth1_check_sum += i2 + i3 + i4 + i5 + i6 + i7 + i8 + i9 + Double.doubleToLongBits(d1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(sArr) +
            FuzzerUtils.checkSum(bArr);
    }

    public static int iMeth() {

        int i10=-12331, i11=-27, i12=44607, i13=-20, i14=-43694;
        short s=-12452;

        vMeth1(Test0525.iFld);
        i10 = 1;
        do {
            s -= (short)i10;
            for (i11 = 1; i11 < 8; i11++) {
                Test0525.iFld -= (int) Test0525.instanceCount;
                Test0525.fFld = i11;
                Test0525.iFld = -9;
                if (i10 != 0) {
                }
            }
            for (i13 = 1; 8 > i13; i13++) {
                Test0525.instanceCount += (i13 | i12);
            }
            Test0525.iFld = i12;
        } while ((i10 += 2) < 378);
        long meth_res = i10 + s + i11 + i12 + i13 + i14;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i, double d, int i1) {

        int[] iArr =new int[N];

        FuzzerUtils.init(iArr, 10);

        iArr[(i >>> 1) % N] = (((iArr[(-111 >>> 1) % N]++) * iMeth()) + 37);
        vMeth_check_sum += i + Double.doubleToLongBits(d) + i1 + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        double d2=-43.43488;
        int i15=-64219, i16=-55364, i17=-35747, i18=14, i19=-9, i20=10291, i21=-58909, i22=7, i23=-13469, i24=34317,
            i25=42104;

        vMeth(Test0525.iFld, d2, Test0525.iFld);
        for (i15 = 4; i15 < 168; ++i15) {
            Test0525.iFld = Test0525.sFld;
            Test0525.instanceCount += (i15 * i15);
            Test0525.byFld = (byte) 33277L;
            if (Test0525.bFld) continue;
        }
        try {
            i17 = 1;
            while (++i17 < 391) {
                i18 = 1;
                while (++i18 < 64) {
                    Test0525.iFld = (int) 76L;
                }
            }
        }
        catch (ArithmeticException exc1) {
            Test0525.iFld -= i18;
        }
        for (i19 = 6; i19 < 177; ++i19) {
            for (i21 = i19; i21 < 147; i21++) {
                Test0525.instanceCount %= (i17 | 1);
            }
            switch (i19 % 1) {
            case 0:
                Test0525.iFld = i16;
                i23 = 147;
                while (--i23 > 0) {
                    Test0525.fFld += (211 + (i23 * i23));
                    Test0525.iFld = Test0525.byFld;
                    i20 -= (int) Test0525.lFld;
                    for (i24 = 1; i24 < 1; ++i24) {
                        Test0525.lFld += (((i24 * i18) + Test0525.lFld) - i25);
                        Test0525.bFld = true;
                        i20 = i20;
                        i25 = (int) Test0525.fFld;
                    }
                    i20 ^= Test0525.byFld;
                }
                i20 += (((i19 * i23) + Test0525.fFld) - Test0525.lFld);
                i20 -= (int) Test0525.lFld;
            default:
                Test0525.iArrFld[i19] |= i21;
                Test0525.bFld = Test0525.bFld;
            }
        }

        FuzzerUtils.out.println("d2 i15 i16 = " + Double.doubleToLongBits(d2) + "," + i15 + "," + i16);
        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);

        FuzzerUtils.out.println("Test0525.instanceCount Test0525.fFld Test0525.byFld = " + Test0525.instanceCount + "," +
                Float.floatToIntBits(Test0525.fFld) + "," + Test0525.byFld);
        FuzzerUtils.out.println("Test0525.bFld Test0525.iFld Test0525.sFld = " + (Test0525.bFld ? 1 : 0) + "," + Test0525.iFld + "," +
                Test0525.sFld);
        FuzzerUtils.out.println("Test0525.lFld Test0525.iArrFld = " + Test0525.lFld + "," + FuzzerUtils.checkSum(Test0525.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0525 _instance = new Test0525();
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