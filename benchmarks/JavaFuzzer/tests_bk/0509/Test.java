// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:05 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=46951L;
    public static volatile float fFld=-2.523F;
    public static short sFld=-30966;
    public static volatile int iFld=-16820;
    public double dFld=-9.94936;
    public static boolean bFld=true;
    public static volatile int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -15364);
        FuzzerUtils.init(Test.lArrFld, 44860L);
        FuzzerUtils.init(Test.fArrFld, 92.714F);
    }

    public static long sMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i10, int i11, boolean b) {

        int i12=36, i13=1232;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -215L);

        i10 = (int)Test.fFld;
        Test.instanceCount -= -16;
        Test.iArrFld = Test.iArrFld;
        for (i12 = 1; i12 < 218; ++i12) {
            i13 -= i13;
            Test.instanceCount -= i13;
            i13 += i12;
            i10 += i11;
            Test.fFld = 1;
            if (b) continue;
            i13 = (int)-1.260F;
            Test.instanceCount -= -2806428117889863785L;
            if (i12 != 0) {
                vMeth1_check_sum += i10 + i11 + (b ? 1 : 0) + i12 + i13 + FuzzerUtils.checkSum(lArr);
                return;
            }
        }
        lArr[(i11 >>> 1) % N] += Test.instanceCount;
        Test.fFld += i13;
        vMeth1_check_sum += i10 + i11 + (b ? 1 : 0) + i12 + i13 + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(int i6, int i7) {

        int i8=-59149, i9=13, i14=7, i15=-202, i16=-3483, i17=-13;
        boolean b1=true, b2=true;
        double d=2.68785;

        for (i8 = 8; 201 > i8; i8++) {
            vMeth1(19762, 7680, b1);
            if (b2) break;
            for (i14 = 1; i14 < 8; ++i14) {
                d *= i7;
                Test.fFld = Test.instanceCount;
                for (i16 = 1; i16 < 2; ++i16) {
                    Test.fFld += (i16 * i6);
                    i7 += (i16 + Test.instanceCount);
                    i9 = Test.sFld;
                    d = i16;
                    if (i15 != 0) {
                        vMeth_check_sum += i6 + i7 + i8 + i9 + (b1 ? 1 : 0) + (b2 ? 1 : 0) + i14 + i15 +
                            Double.doubleToLongBits(d) + i16 + i17;
                        return;
                    }
                    i7 = i17;
                    Test.lArrFld[i14] = (long)Test.fFld;
                    Test.fFld *= i9;
                }
            }
        }
        vMeth_check_sum += i6 + i7 + i8 + i9 + (b1 ? 1 : 0) + (b2 ? 1 : 0) + i14 + i15 + Double.doubleToLongBits(d) +
            i16 + i17;
    }

    public static short sMeth(long l) {

        int i1=-245, i2=-48685, i3=-208, i4=-113, i5=3, iArr[]=new int[N];
        byte by=94;

        FuzzerUtils.init(iArr, -41151);

        i1 ^= (int)(((i1 % (l | 1)) + (++i1)) - Test.fFld);
        for (i2 = 4; i2 < 168; i2++) {
            for (i4 = 1; 10 > i4; i4++) {
                iArr[i2] += i5;
                vMeth(i1, i4);
                by *= (byte)55619;
                Test.sFld += (short)(((i4 * l) + i3) - i3);
                i3 += (int)(-23.513F + (i4 * i4));
                if (true) break;
                i1 += (i4 ^ by);
                i5 = 3;
                Test.fFld += (14L + (i4 * i4));
            }
            i5 += (((i2 * i2) + i5) - i1);
            try {
                i5 = (i3 % i5);
                i3 = (-1945906029 % i5);
                i1 = (iArr[i2 + 1] / i2);
            } catch (ArithmeticException a_e) {}
            i1 >>>= Test.iFld;
        }
        long meth_res = l + i1 + i2 + i3 + i4 + i5 + by + FuzzerUtils.checkSum(iArr);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=13, i18=0, i19=49366, i20=25334, i21=-20, i22=-19081, i23=0;
        byte by1=92;
        long l1=24896L;

        switch (((i >>> 1) % 3) + 80) {
        case 80:
            i += ((i--) * sMeth(Test.instanceCount));
            by1 ^= (byte)i;
            dFld -= 0.148F;
            break;
        case 81:
            Test.iArrFld[(i >>> 1) % N] -= Test.iFld;
            i = Test.iFld;
        case 82:
            for (i18 = 5; i18 < 122; i18++) {
                Test.bFld = Test.bFld;
                i = Test.iFld;
                Test.instanceCount >>= i19;
                Test.iArrFld = FuzzerUtils.int1array(N, (int)0);
                Test.iArrFld[i18] >>= -210;
                for (i20 = i18; i20 < 214; ++i20) {
                    Test.fArrFld = FuzzerUtils.float1array(N, (float)-30.352F);
                }
                if (Test.bFld) {
                    Test.iFld = -57;
                    i19 += (i18 * i18);
                    i22 = 1;
                    while (++i22 < 214) {
                        by1 -= (byte)Test.fFld;
                        l1 = 1;
                        while ((l1 += 3) < 1) {
                            Test.instanceCount >>= i22;
                            Test.instanceCount += l1;
                            Test.sFld += (short)l1;
                            Test.instanceCount = i22;
                            Test.bFld = Test.bFld;
                            if (Test.bFld) break;
                            if (Test.bFld) break;
                            Test.iFld = (int)Test.instanceCount;
                            Test.iFld += (int)l1;
                            Test.fFld += (l1 + l1);
                        }
                    }
                } else if (true) {
                    Test.iArrFld[i18 - 1] >>= (int)-31270L;
                } else {
                    i23 = i20;
                }
            }
        }

        FuzzerUtils.out.println("i by1 i18 = " + i + "," + by1 + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 l1 i23 = " + i22 + "," + l1 + "," + i23);

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.sFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.sFld);
        FuzzerUtils.out.println("Test.iFld dFld Test.bFld = " + Test.iFld + "," + Double.doubleToLongBits(dFld) + "," +
            (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.iArrFld Test.lArrFld Test.fArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + ","
            + FuzzerUtils.checkSum(Test.lArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
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
//DEBUG  sMeth ->  sMeth mainTest
//DEBUG  vMeth ->  vMeth sMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth sMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
