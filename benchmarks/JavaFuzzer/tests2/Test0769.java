// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:48 2023
public class Test0769 {

    public static final int N = 400;

    public static long instanceCount=3081355866353535910L;
    public static float fFld=-1.856F;
    public static int iFld=-49147;
    public static double dFld=-2.31629;
    public static short sFld=6093;
    public static boolean bFld=true;
    public static volatile int iFld1=45;
    public static double[] dArrFld =new double[N];
    public static int[][] iArrFld =new int[N][N];

    static {
        FuzzerUtils.init(Test0769.dArrFld, -38.93859);
        FuzzerUtils.init(Test0769.iArrFld, 3944);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long sMeth_check_sum = 0;

    public static short sMeth(int i4) {

        double d=80.79383;
        int i5=27298;
        int i6=21547;
        int i7=9;
        int i8=234;
        int[] iArr =new int[N];
        long l2=-55664L;
        byte by1=23;

        FuzzerUtils.init(iArr, 34);

        Test0769.instanceCount = Test0769.iFld;
        for (d = 17; d < 372; ++d) {
            i6 = 1;
            while (++i6 < 5) {
                short s=11650;
                s >>= (short)l2;
                iArr[(int)(d + 1)] %= (int)(i6 | 1);
                if (false) break;
            }
            l2 += (long) Test0769.fFld;
            by1 = (byte)-111;
            for (i7 = 5; i7 > 1; --i7) {
                i4 = i4;
                Test0769.fFld = Test0769.instanceCount;
                i5 = (int)61076L;
                Test0769.instanceCount += i5;
            }
            l2 = Test0769.instanceCount;
            iArr[(int)(d + 1)] = -42365;
        }
        long meth_res = i4 + Double.doubleToLongBits(d) + i5 + i6 + l2 + by1 + i7 + i8 + FuzzerUtils.checkSum(iArr);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static int iMeth1(long l1) {

        int i3=11, i9=64, i10=246, i11=-11, i12=97, i13=-151, i14=-11;
        boolean b=true;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, 249L);

        try {
            lArr[(Test0769.iFld >>> 1) % N] = (Test0769.instanceCount * l1);
            i3 = 1;
            while (++i3 < 152) {
                sMeth(Test0769.iFld);
                Test0769.dArrFld[i3] += Test0769.iFld;
                Test0769.iFld = Test0769.iFld;
                i9 = 1;
                while (++i9 < 10) {
                    b = b;
                    Test0769.iFld -= Test0769.iFld;
                }
                for (i10 = i3; 10 > i10; i10++) {
                    Test0769.dFld -= i9;
                    for (i12 = 1; i12 < (1 + 400); i12++) {
                        i14 -= i13;
                        if (b) continue;
                        Test0769.fFld += (i12 * i14);
                    }
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException exc1) {
            Test0769.dFld = i13;
        }
        long meth_res = l1 + i3 + i9 + (b ? 1 : 0) + i10 + i11 + i12 + i13 + i14 + FuzzerUtils.checkSum(lArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth(int i2, long l, byte by) {

        int i15=41617;
        int i16=9;
        int i17=-188;
        int[] iArr1 =new int[N];
        int[][] iArr2 =new int[N][N];

        FuzzerUtils.init(iArr1, -60);
        FuzzerUtils.init(iArr2, 11);

        i2 <<= (int)(l--);
        switch (((Math.min(i2, -6) >>> 1) % 8) + 4) {
        case 4:
            l += ((iMeth1(l) + l) + i2);
            for (i15 = 6; i15 < 267; i15++) {
                iArr1[i15] = i15;
            }
            i2 += i2;
            break;
        case 5:
            Test0769.fFld += l;
            i17 = 1;
            while (++i17 < 398) {
                i2 -= -253;
                i16 += (i17 * i17);
                Test0769.dFld -= -8159765198766575591L;
                Test0769.fFld *= Test0769.sFld;
            }
            l = l;
            i16 -= i17;
        case 6:
        case 7:
            l = i16;
            break;
        case 8:
            Test0769.instanceCount |= l;
            break;
        case 9:
            i2 += (int) Test0769.fFld;
        case 10:
            Test0769.fFld = 3;
            break;
        case 11:
            iArr1 = iArr2[(81 >>> 1) % N];
            break;
        default:
            Test0769.fFld -= -1.377F;
        }
        long meth_res = i2 + l + by + i15 + i16 + i17 + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-52109, i1=21, i19=-14452, i20=-92, i21=-12155, i22=28222, i23=-62990, i24=-14, i25=-19928;
        double d1=1.52959;
        float[] fArr =new float[N];

        FuzzerUtils.init(fArr, -2.862F);

        for (i = 12; i < 376; ++i) {
            Test0769.fFld = Math.abs(iMeth(Test0769.iFld, Test0769.instanceCount, (byte) (68)));
        }
        fArr[(i1 >>> 1) % N] += i1;
        for (i19 = 9; i19 < 154; ++i19) {
            Test0769.dFld -= Test0769.sFld;
            switch (((i19 % 7) * 5) + 82) {
            case 91:
                for (d1 = 8; d1 < 173; ++d1) {
                    Test0769.instanceCount += Test0769.iFld;
                    Test0769.iFld >>= 65426;
                }
                i20 -= -5;
            case 117:
                fArr[i19 - 1] += 11;
                for (i22 = 10; i22 < 173; i22++) {
                    Test0769.instanceCount = (long) Test0769.fFld;
                    i20 -= (int) Test0769.dFld;
                    Test0769.iArrFld[i22 + 1][i19] = (int) Test0769.fFld;
                    Test0769.sFld = (short) i;
                    i24 = 2;
                    do {
                        if (Test0769.bFld) break;
                        Test0769.iArrFld[i19 - 1][i22 + 1] = i20;
                        Test0769.iFld -= i20;
                        i21 -= i24;
                        if (Test0769.bFld) continue;
                        switch (((i19 >>> 1) % 2) + 104) {
                        case 104:
                            i21 = i21;
                            break;
                        case 105:
                            Test0769.iArrFld[i24][i19 + 1] = (int) Test0769.dFld;
                            i21 += (i24 - Test0769.iFld);
                            i21 += (((i24 * i) + i23) - i22);
                            Test0769.iArrFld[i24 + 1] = Test0769.iArrFld[i24];
                            break;
                        default:
                            i25 += i22;
                            i23 = i21;
                        }
                    } while (--i24 > 0);
                }
                break;
            case 89:
                i25 -= i19;
            case 86:
                Test0769.instanceCount <<= -27012;
                break;
            case 95:
                i21 += (i19 - Test0769.sFld);
                break;
            case 103:
                i25 += (i19 * i19);
                break;
            case 87:
                i23 &= i25;
                break;
            default:
                Test0769.instanceCount -= Test0769.iFld1;
            }
        }

        FuzzerUtils.out.println("i i1 i19 = " + i + "," + i1 + "," + i19);
        FuzzerUtils.out.println("i20 d1 i21 = " + i20 + "," + Double.doubleToLongBits(d1) + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 fArr = " + i25 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test0769.instanceCount Test0769.fFld Test0769.iFld = " + Test0769.instanceCount + "," +
                Float.floatToIntBits(Test0769.fFld) + "," + Test0769.iFld);
        FuzzerUtils.out.println("Test0769.dFld Test0769.sFld Test0769.bFld = " + Double.doubleToLongBits(Test0769.dFld) + "," +
                Test0769.sFld + "," + (Test0769.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0769.iFld1 Test0769.dArrFld Test0769.iArrFld = " + Test0769.iFld1 + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0769.dArrFld)) + "," + FuzzerUtils.checkSum(Test0769.iArrFld));

        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0769 _instance = new Test0769();
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