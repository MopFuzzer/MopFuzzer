// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:51 2023
public class Test0835 {

    public static final int N = 400;

    public static long instanceCount=-14075L;
    public static int iFld=-5;
    public static double dFld=-2.62253;
    public static boolean bFld=false;
    public static volatile short sFld=-17289;
    public static int[] iArrFld =new int[N];
    public static short[] sArrFld =new short[N];

    static {
        FuzzerUtils.init(Test0835.iArrFld, -40298);
        FuzzerUtils.init(Test0835.sArrFld, (short) 14698);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1() {

        int i7=-6;
        int i8=6;
        int i9=13;
        int i10=168;
        int i11=88;
        int i12=-17045;
        int[] iArr =new int[N];
        double[] dArr =new double[N];

        FuzzerUtils.init(dArr, 47.83099);
        FuzzerUtils.init(iArr, -28735);

        for (i7 = 16; i7 < 330; i7++) {
            dArr[i7 + 1] = i8;
            Test0835.instanceCount *= i7;
            i8 += (i7 | Test0835.instanceCount);
            i8 ^= i7;
            i8 = i7;
            for (i9 = 1; i9 < 5; i9++) {
                i8 <<= 59864;
                i8 <<= (int)151L;
                for (i11 = 1; i11 < 2; ++i11) {
                    iArr[i11] -= i10;
                    i10 = (int)-8131L;
                    try {
                        Test0835.iFld = (58 / i10);
                        i8 = (114 / Test0835.iFld);
                        i12 = (iArr[i7 + 1] % 112);
                    } catch (ArithmeticException a_e) {}
                    Test0835.iFld += (i11 - Test0835.iFld);
                }
                i8 = i7;
            }
        }
        long meth_res = i7 + i8 + i9 + i10 + i11 + i12 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            FuzzerUtils.checkSum(iArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i4) {

        int i5=20957, i6=-18295, i13=-2126, i14=4272, i15=9, i16=-5, i17=-5, i18=-29053;
        float f=56.532F;
        byte by1=-94;
        boolean b=false;

        for (i5 = 6; 196 > i5; i5++) {
            i6 = (int)Math.max((++i6) + iMeth1(), 9L);
        }
        i6 = i5;
        i4 -= i6;
        i4 = 46779;
        Test0835.iArrFld[(-10 >>> 1) % N] = i4;
        if (b) {
            for (i13 = 3; i13 < 246; i13++) {
                for (i15 = 1; i15 < 7; ++i15) {
                    Test0835.iArrFld[i15 + 1] *= (int) f;
                    i6 += (int)f;
                }
                i16 *= by1;
                for (i17 = 1; i17 < 7; i17++) {
                    Test0835.iArrFld[i17 + 1] = -62039;
                    i4 += (i17 + Test0835.instanceCount);
                }
            }
        } else if (b) {
        } else if (b) {
            Test0835.instanceCount |= Test0835.instanceCount;
        } else {
            Test0835.instanceCount += i4;
        }
        vMeth_check_sum += i4 + i5 + i6 + i13 + i14 + i15 + i16 + Float.floatToIntBits(f) + by1 + i17 + i18 + (b ? 1 :
            0);
    }

    public static int iMeth(int i1, int i2, int i3) {

        short s=-5978;
        int i19=-9, i20=-14, i21=0, i22=-202, i23=13811, i24=192;
        float f1=45.104F;

        s = (short) Test0835.instanceCount;
        vMeth(144);
        Test0835.iArrFld[(-5 >>> 1) % N] -= (int) Test0835.instanceCount;
        Test0835.iFld += i1;
        i19 = 1;
        do {
            try {
                Test0835.iArrFld[i19] = (i19 % i1);
                i3 = (219 % i2);
                Test0835.iArrFld[i19] = (i2 / -59127);
            } catch (ArithmeticException a_e) {}
            Test0835.dFld -= Test0835.iFld;
        } while (++i19 < 303);
        for (i20 = 3; i20 < 300; i20++) {
            i22 = 1;
            do {
                int i25=1;
                i3 *= i1;
                switch ((i22 % 6) + 44) {
                case 44:
                    for (i23 = 1; i23 > 1; i23 -= 2) {
                        i3 += (int)f1;
                        i2 *= i1;
                        i2 += (((i23 * i20) + i19) - i21);
                    }
                    break;
                case 45:
                    i24 = (int)f1;
                    break;
                case 46:
                    Test0835.iFld += (2 + (i22 * i22));
                    break;
                case 47:
                    i2 = i25;
                    break;
                case 48:
                    i3 -= -235;
                case 49:
                    Test0835.instanceCount -= i1;
                    break;
                default:
                    Test0835.iFld += (int) Test0835.instanceCount;
                }
            } while (++i22 < 6);
        }
        long meth_res = i1 + i2 + i3 + s + i19 + i20 + i21 + i22 + i23 + i24 + Float.floatToIntBits(f1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-3, i26=11, i27=32028, i28=-47599, i29=9, i30=48363;
        byte by=-16;
        byte[] byArr =new byte[N];
        double d=64.39870, d1=0.92562, d2=-1.25129;
        float f2=98.321F;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -25445L);
        FuzzerUtils.init(byArr, (byte)0);

        i = (by++);
        d -= ((iMeth(Test0835.iFld, Test0835.iFld, Test0835.iFld) - Test0835.instanceCount) + Test0835.instanceCount);
        i26 = 1;
        do {
            if (Test0835.bFld) {
                i = -207;
            } else {
                Test0835.dFld = i;
                Test0835.iFld -= i;
                i += (32 + (i26 * i26));
                for (i27 = 10; i27 < 325; ++i27) {
                    for (d1 = 1; d1 < 2; d1++) {
                        Test0835.sFld = (short) -44130;
                        lArr[(int)(d1 + 1)] = i27;
                        Test0835.instanceCount -= (long) f2;
                        Test0835.sFld = (short) i29;
                        Test0835.iArrFld[i26] += (int) 20L;
                        Test0835.iArrFld[i27 + 1] <<= (int) Test0835.instanceCount;
                        i *= Test0835.iFld;
                        byArr[i27 + 1] = (byte) Test0835.iFld;
                    }
                    for (d2 = 1; 2 > d2; ++d2) {
                        Test0835.instanceCount -= Test0835.instanceCount;
                        by = (byte)i;
                        Test0835.iArrFld[(-8649 >>> 1) % N] *= 0;
                        i29 += (int)d2;
                        Test0835.dFld -= i;
                        Test0835.instanceCount += (long) d2;
                        Test0835.sArrFld[i26 + 1] += (short) Test0835.iFld;
                        lArr[i26 - 1] += Test0835.instanceCount;
                        f2 -= -7;
                    }
                    Test0835.iFld += i26;
                    f2 -= i30;
                }
            }
        } while ((i26 += 3) < 231);

        FuzzerUtils.out.println("i by d = " + i + "," + by + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("i26 i27 i28 = " + i26 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("d1 i29 f2 = " + Double.doubleToLongBits(d1) + "," + i29 + "," +
            Float.floatToIntBits(f2));
        FuzzerUtils.out.println("d2 i30 lArr = " + Double.doubleToLongBits(d2) + "," + i30 + "," +
            FuzzerUtils.checkSum(lArr));
        FuzzerUtils.out.println("byArr = " + FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test0835.instanceCount Test0835.iFld Test0835.dFld = " + Test0835.instanceCount + "," + Test0835.iFld +
                "," + Double.doubleToLongBits(Test0835.dFld));
        FuzzerUtils.out.println("Test0835.bFld Test0835.sFld Test0835.iArrFld = " + (Test0835.bFld ? 1 : 0) + "," + Test0835.sFld + "," +
                FuzzerUtils.checkSum(Test0835.iArrFld));
        FuzzerUtils.out.println("Test0835.sArrFld = " + FuzzerUtils.checkSum(Test0835.sArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0835 _instance = new Test0835();
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
//DEBUG  iMeth1 ->  iMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
