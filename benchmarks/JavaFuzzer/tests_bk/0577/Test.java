// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:07 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-26027L;
    public float fFld=-28.360F;
    public static short sFld=-9571;
    public static double dFld=-1.76061;
    public static int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 199);
        FuzzerUtils.init(Test.fArrFld, -1.238F);
        FuzzerUtils.init(Test.bArrFld, true);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long sMeth_check_sum = 0;

    public static short sMeth(long l2) {

        int i5=-51209, i6=-27090, i7=55116, i8=52923, i9=7, i10=59189, i11=-14, i12=-19320, i13=-2, i14=-69;
        float f1=1.941F;
        byte by=115;

        Test.iArrFld[(-62 >>> 1) % N] -= i5;
        for (i6 = 349; i6 > 4; --i6) {
            for (i8 = 5; i8 > 1; i8--) {
                i9 += (((i8 * i9) + i7) - i8);
                i7 += (int)f1;
                i9 = (int)1L;
                i9 += (((i8 * i7) + Test.instanceCount) - i8);
            }
            l2 += i5;
            i10 = 1;
            do {
                Test.instanceCount = i8;
                for (i11 = 1; i11 < 1; i11 += 3) {
                    by -= (byte)-11499;
                }
                for (i13 = 1; i13 < 1; i13++) {
                    i7 += (i13 * i13);
                }
                i9 += i10;
            } while (++i10 < 5);
        }
        long meth_res = l2 + i5 + i6 + i7 + i8 + i9 + Float.floatToIntBits(f1) + i10 + i11 + i12 + by + i13 + i14;
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static int iMeth1() {

        long l1=10279L;
        int i4=0, i15=3, iArr[]=new int[N];
        float f=1.373F;
        double d=0.52251;

        FuzzerUtils.init(iArr, 30448);

        for (l1 = 5; 210 > l1; ++l1) {
            i4 += (int)(l1 | (long)f);
            i4 = (int)(iArr[(int)(l1 - 1)] - ((13119L * (i4 * i4)) + sMeth(-1646439061L)));
            i4 = (int)Test.instanceCount;
            i4 *= i4;
            Test.iArrFld[(int)(l1 + 1)] -= (int)d;
            Test.iArrFld[(int)(l1 + 1)] += (int)l1;
            i4 = (int)f;
            switch ((int)((l1 % 2) + 85)) {
            case 85:
                i4 >>= 46145;
                break;
            case 86:
                f += ((long)l1 | (long)i4);
                i4 <<= i4;
                i15 = 1;
                do {
                    i4 = Test.sFld;
                    Test.instanceCount = i15;
                } while (++i15 < 8);
                break;
            default:
                i4 = i4;
            }
        }
        long meth_res = l1 + i4 + Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i15 +
            FuzzerUtils.checkSum(iArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i2) {

        long l=10L;
        int i3=-149, i16=7081, i17=45, i18=-8939, i19=-5;
        byte by1=93;
        float f2=-14.895F;

        for (l = 1; l < 279; l++) {
            switch (((iMeth1() >>> 1) % 1) + 104) {
            case 104:
                switch ((int)(((l % 2) * 5) + 67)) {
                case 75:
                    i2 += -5;
                    break;
                case 73:
                    i3 += Test.sFld;
                    Test.instanceCount -= 49764;
                    if (i2 != 0) {
                    }
                    for (i16 = 1; i16 < 6; ++i16) {
                        for (i18 = 1; 2 > i18; ++i18) {
                            try {
                                i19 = (-898086449 / i3);
                                i17 = (i16 / Test.iArrFld[(int)(l - 1)]);
                                i17 = (447595309 % i17);
                            } catch (ArithmeticException a_e) {}
                            Test.dFld += i3;
                            by1 += (byte)i3;
                            i2 *= i16;
                            f2 *= i19;
                            Test.sFld >>= (short)52165;
                        }
                    }
                    break;
                }
                break;
            default:
                Test.instanceCount *= -20369;
            }
        }
        long meth_res = i2 + l + i3 + i16 + i17 + i18 + i19 + by1 + Float.floatToIntBits(f2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-105, i1=-5, i21=-4, i22=-3, i23=-1540, i24=3, i25=-157;
        byte by2=41;
        float f3=101.403F;
        boolean b=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 4477287860976366511L);

        for (i = 9; i < 370; i++) {
            if ((fFld - ((-(i + i1)) * (-(++fFld)))) >= (-(i1 - iMeth(i1)))) break;
        }
        i1 >>>= by2;
        for (int i20 : Test.iArrFld) {
            Test.instanceCount *= Test.instanceCount;
            Test.fArrFld[(i20 >>> 1) % N] += i1;
        }
        lArr[(4 >>> 1) % N] -= -1334505596391730462L;
        i21 = 274;
        do {
            i1 = i1;
        } while (--i21 > 0);
        for (i22 = 11; i22 < 211; i22++) {
            i23 <<= i1;
            Test.instanceCount = i23;
            for (i24 = 126; i24 > 3; --i24) {
                Test.iArrFld[i24 - 1] = i;
                Test.fArrFld[i22 - 1] -= 1896732817071256274L;
                i25 = i21;
                i1 += i24;
                f3 = 1;
                while (++f3 < 2) {
                    i1 >>= i22;
                    switch (((i22 % 5) * 5) + 78) {
                    case 83:
                        b = b;
                        Test.bArrFld[i24] = b;
                        Test.instanceCount += (long)(f3 * f3);
                        break;
                    case 94:
                        i23 = i25;
                    case 88:
                        switch ((int)((f3 % 1) + 63)) {
                        case 63:
                        default:
                            if (b) continue;
                            Test.iArrFld[i24 - 1] <<= 44164;
                            Test.instanceCount <<= i1;
                        }
                        lArr[i24 + 1] *= Test.sFld;
                        break;
                    case 97:
                        fFld += f3;
                    case 84:
                        i23 *= (int)466293942L;
                        break;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 by2 = " + i + "," + i1 + "," + by2);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 f3 = " + i24 + "," + i25 + "," + Float.floatToIntBits(f3));
        FuzzerUtils.out.println("b lArr = " + (b ? 1 : 0) + "," + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test.instanceCount fFld Test.sFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(fFld) + "," + Test.sFld);
        FuzzerUtils.out.println("Test.dFld Test.iArrFld Test.fArrFld = " + Double.doubleToLongBits(Test.dFld) + "," +
            FuzzerUtils.checkSum(Test.iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));
        FuzzerUtils.out.println("Test.bArrFld = " + FuzzerUtils.checkSum(Test.bArrFld));

        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  sMeth ->  sMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
