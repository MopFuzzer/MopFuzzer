// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:02 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-57406L;
    public static int iFld=-6;
    public float fFld=119.705F;
    public static int iFld1=24919;
    public boolean bFld=false;
    public static int iArrFld[]=new int[N];
    public static volatile boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 18);
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i6, long l1, long l2) {

        byte by=-124;
        float f2=-97.483F;
        int i7=48938, i8=-187, i9=-6, i10=236, i11=-181, i12=3, i13=11, i14=-60077;
        boolean b=false;

        Test.iFld = by;
        f2 = -33577;
        for (i7 = 21; i7 < 387; ++i7) {
            Test.iArrFld[i7] *= (int)748669408L;
            f2 = Test.iFld;
            i6 = i7;
        }
        Test.iArrFld[(i8 >>> 1) % N] += 21880;
        for (i9 = 11; 332 > i9; ++i9) {
            for (i11 = 1; i11 < 5; ++i11) {
                Test.iArrFld[i11 + 1] >>= i8;
                i10 = (int)Test.instanceCount;
                for (i13 = 1; i13 < 2; i13++) {
                    i6 <<= Test.iFld;
                    b = b;
                    f2 += i13;
                }
            }
        }
        long meth_res = i6 + l1 + l2 + by + Float.floatToIntBits(f2) + i7 + i8 + i9 + i10 + i11 + i12 + i13 + i14 + (b
            ? 1 : 0);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(float f1) {

        int i5=0, i15=11, i16=5, iArr[]=new int[N];
        boolean b1=true;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -3471817728L);
        FuzzerUtils.init(iArr, 22);

        for (long l : lArr1) {
            i5 |= iArr[(-52 >>> 1) % N];
            Test.iFld += (Test.iFld -= -14);
            Test.iFld = i5;
        }
        Test.iFld = (iMeth(Test.iFld, -63349L, Test.instanceCount) - i5);
        if (b1) {
            Test.instanceCount <<= Test.iFld;
        } else {
            for (i15 = 7; i15 < 314; ++i15) {
                i16 += (i15 * i15);
                Test.instanceCount *= Test.instanceCount;
                i16 = i15;
                f1 += (i15 * i15);
            }
            Test.iFld -= (int)f1;
            i16 ^= i5;
            f1 *= Test.iFld;
        }
        vMeth1_check_sum += Float.floatToIntBits(f1) + i5 + (b1 ? 1 : 0) + i15 + i16 + FuzzerUtils.checkSum(lArr1) +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i, int i1) {

        int i2=-2, i3=-233, i4=13, i17=-14;
        float f=14.499F;
        long lArr[]=new long[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(lArr, -34L);
        FuzzerUtils.init(dArr, -40.73884);

        for (i2 = 11; i2 < 220; ++i2) {
            lArr[i2 - 1] = (++i3);
            f += i2;
            i4 = 1;
            do {
                vMeth1(f);
                dArr[i2] = -6601138063080512131L;
                i17 = 1;
                while (++i17 < 1) {
                    Test.iFld += (int)Test.instanceCount;
                    i += (i17 ^ (long)f);
                    Test.iArrFld[i2 + 1] += i1;
                    Test.iArrFld[i17 - 1] -= i17;
                    Test.instanceCount = 20526L;
                    Test.iArrFld = Test.iArrFld;
                    i >>= i2;
                    lArr[i17 - 1] = i17;
                }
            } while (++i4 < 8);
        }
        vMeth_check_sum += i + i1 + i2 + i3 + Float.floatToIntBits(f) + i4 + i17 + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        int i18=-10, i19=152, i20=-77, i21=-45157, i22=-10898, i23=18370, i24=9, i25=-2, i26=11, i27=-44941, i28=0,
            i29=55157;
        byte by1=-12;
        double dArr1[][]=new double[N][N];
        long lArr2[]=new long[N];

        FuzzerUtils.init(dArr1, 80.96788);
        FuzzerUtils.init(lArr2, 7428802260290180979L);

        vMeth(Test.iFld, 3);
        for (i18 = 2; i18 < 242; i18++) {
            by1 ^= (byte)Test.iFld;
            for (i20 = i18; i20 < 105; i20++) {
                Test.iFld += (i20 - fFld);
            }
            Test.iFld1 &= Test.iFld;
            for (i22 = i18; i22 < 105; i22++) {
                i21 += i22;
                for (i24 = 1; i24 > 1; i24--) {
                    i21 += i24;
                    if (bFld) {
                        Test.instanceCount = Test.instanceCount;
                    }
                    i25 |= 37;
                    Test.instanceCount += i19;
                    dArr1[i22][(119 >>> 1) % N] = i25;
                    Test.instanceCount = i25;
                }
                Test.bArrFld[i18 - 1] = bFld;
                if (true) break;
            }
        }
        i23 = (int)Test.instanceCount;
        Test.iArrFld[(i18 >>> 1) % N] += Test.iFld;
        Test.instanceCount &= Test.instanceCount;
        Test.iFld -= i21;
        i21 -= 5;
        bFld = bFld;
        for (i26 = 228; i26 > 1; i26--) {
            i25 = (int)Test.instanceCount;
            i21 += i26;
            for (i28 = 6; 111 > i28; ++i28) {
                lArr2[i28 + 1] += i25;
                i29 = -51;
            }
        }

        FuzzerUtils.out.println("i18 i19 by1 = " + i18 + "," + i19 + "," + by1);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 i27 i28 = " + i26 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("i29 dArr1 lArr2 = " + i29 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1))
            + "," + FuzzerUtils.checkSum(lArr2));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld fFld = " + Test.instanceCount + "," + Test.iFld + "," +
            Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("Test.iFld1 bFld Test.iArrFld = " + Test.iFld1 + "," + (bFld ? 1 : 0) + "," +
            FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.bArrFld = " + FuzzerUtils.checkSum(Test.bArrFld));

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
