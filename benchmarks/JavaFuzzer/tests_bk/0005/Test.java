// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:53 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-127L;
    public static int iFld=-8;
    public static short sFld=-3014;
    public static boolean bFld=true;
    public static float fFld=126.74F;
    public static byte byFld=30;

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        double d1=3.26985;
        int i5=7, i6=11, i7=164, i8=9, iArr[]=new int[N];

        FuzzerUtils.init(iArr, -127);

        Test.instanceCount ^= 241;
        iArr[(Test.iFld >>> 1) % N] += (int)d1;
        for (i5 = 14; i5 < 276; i5++) {
            iArr = iArr;
            if (Test.bFld) {
                Test.iFld *= i6;
                i7 = 1;
                do {
                    Test.iFld *= i5;
                    if (Test.bFld) {
                        i8 = 1;
                        while (++i8 < 1) {
                            try {
                                Test.iFld = (-75 / Test.iFld);
                                i6 = (i5 % i5);
                                iArr[i8 - 1] = (iArr[i5] % -179);
                            } catch (ArithmeticException a_e) {}
                            Test.iFld = i7;
                            Test.sFld = (short)Test.iFld;
                            i6 = i6;
                            Test.bFld = Test.bFld;
                        }
                    } else if (false) {
                        if (i7 != 0) {
                            vMeth1_check_sum += Double.doubleToLongBits(d1) + i5 + i6 + i7 + i8 +
                                FuzzerUtils.checkSum(iArr);
                            return;
                        }
                    }
                } while (++i7 < 6);
            } else {
                Test.instanceCount += i7;
            }
        }
        vMeth1_check_sum += Double.doubleToLongBits(d1) + i5 + i6 + i7 + i8 + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(float f) {

        double d=0.41737;
        int i3=-51719, i4=14, i9=8, i10=-40, i11=-10, i12=27, i13=-203, i14=-86, i15=-71, iArr1[]=new int[N];
        boolean b=true;
        byte by=44;

        FuzzerUtils.init(iArr1, 12);

        Test.iFld = (int)(d - ((f - Test.iFld) + (--Test.iFld)));
        for (i3 = 8; i3 < 299; i3++) {
            b = (b && ((d + by) <= (Test.instanceCount - i3)));
            vMeth1();
            Test.iFld = Test.iFld;
            Test.iFld = Test.iFld;
        }
        Test.iFld -= i3;
        i4 = (int)Test.instanceCount;
        iArr1[(Test.iFld >>> 1) % N] ^= (int)Test.instanceCount;
        for (i9 = 9; i9 < 373; ++i9) {
            for (i11 = 5; i11 > 1; --i11) {
                for (i13 = 2; i13 > 1; --i13) {
                    Test.iFld += i9;
                    Test.instanceCount = i10;
                    i12 = i15;
                }
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i3 + i4 + (b ? 1 : 0) + by + i9 + i10
            + i11 + i12 + i13 + i14 + i15 + FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth(int i) {

        int i1=-192, i2=17058, i16=-59929, i17=-3, i18=150, i19=-199, i20=33062;
        float f1=-2.161F;
        byte by1=91;

        for (i1 = 4; i1 < 144; i1++) {
            vMeth(-47.687F);
        }
        for (i16 = 9; i16 < 240; i16++) {
            for (i18 = 1; 7 > i18; ++i18) {
                i20 = 1;
                do {
                    i = -40063;
                    i19 -= i20;
                    i17 += (i20 * i20);
                    Test.iFld >>= i16;
                    i19 += Test.iFld;
                    f1 += i20;
                    by1 = (byte)i16;
                    Test.instanceCount >>= Test.iFld;
                    i2 = i17;
                } while (++i20 < 2);
                Test.iFld = i16;
            }
        }
        long meth_res = i + i1 + i2 + i16 + i17 + i18 + i19 + i20 + Float.floatToIntBits(f1) + by1;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i21=55, i22=12, i23=-11, i24=6, i25=43862, i26=-137, i27=71, i28=50715, iArr2[]=new int[N];
        double d2=120.95956;
        float f2=-73.152F;

        FuzzerUtils.init(iArr2, -48412);

        Test.iFld <<= (int)(((Test.instanceCount + Test.instanceCount) * (Test.instanceCount + Test.instanceCount)) +
            (Test.iFld - iMeth(13)));
        Test.fFld -= Test.fFld;
        iArr2[(-216 >>> 1) % N] *= Test.sFld;
        Test.instanceCount += Test.sFld;
        Test.iFld *= (int)Test.instanceCount;
        Test.byFld = (byte)Test.iFld;
        Test.iFld = 121;
        for (i21 = 3; i21 < 130; i21++) {
            for (i23 = 5; i23 < 197; i23++) {
                iArr2[i21 + 1] &= i23;
                i22 += (i23 * i23);
                iArr2[i23] ^= i23;
                Test.iFld = i21;
            }
        }
        iArr2[(i21 >>> 1) % N] -= (int)Test.fFld;
        i25 = 213;
        do {
            d2 -= Test.byFld;
            i24 = i21;
            iArr2[i25 - 1] -= Test.iFld;
            i24 += Test.iFld;
            iArr2[i25] = i24;
            i22 <<= i21;
            Test.iFld = i23;
            f2 = 1;
            while (++f2 < 118) {
                for (i26 = i25; i26 < 1; i26++) {
                    i24 = i27;
                    d2 -= i25;
                    Test.iFld += (i26 ^ Test.instanceCount);
                    i27 += i21;
                    Test.byFld >>= (byte)i23;
                    try {
                        i27 = (Test.iFld % iArr2[i26]);
                        i22 = (i28 % i24);
                        i27 = (iArr2[i25 + 1] % -1715476826);
                    } catch (ArithmeticException a_e) {}
                }
            }
        } while (--i25 > 0);

        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 d2 = " + i24 + "," + i25 + "," + Double.doubleToLongBits(d2));
        FuzzerUtils.out.println("f2 i26 i27 = " + Float.floatToIntBits(f2) + "," + i26 + "," + i27);
        FuzzerUtils.out.println("i28 iArr2 = " + i28 + "," + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.sFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Test.sFld);
        FuzzerUtils.out.println("Test.bFld Test.fFld Test.byFld = " + (Test.bFld ? 1 : 0) + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.byFld);

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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}