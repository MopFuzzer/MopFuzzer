// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:23 2023
public class Test0225 {

    public static final int N = 400;

    public static long instanceCount=-2891370570L;
    public static byte byFld=99;
    public static float fFld=59.844F;
    public static int iFld=-7;
    public static double dFld=78.64331;
    public static boolean bFld=true;
    public static double[] dArrFld =new double[N];
    public static volatile long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test0225.dArrFld, -1.61039);
        FuzzerUtils.init(Test0225.lArrFld, 136L);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vSmallMeth(int i) {


        Test0225.byFld |= (byte) (-((Test0225.instanceCount - Test0225.fFld) + Test0225.instanceCount));
        vSmallMeth_check_sum += i;
    }

    public static void vMeth1(long l1, int i15, int i16) {

        short s1=-12970;
        int i17=-3;
        int i18=-18266;
        int i19=46;
        int i20=193;
        int i21=31670;
        int i22=-6;
        int i23=-32413;
        int[] iArr3 =new int[N];

        FuzzerUtils.init(iArr3, -8);

        s1 -= (short) Test0225.dFld;
        for (i17 = 12; i17 < 218; i17++) {
            try {
                i15 = (35691 / i16);
                i18 = (i18 % i18);
                i18 = (iArr3[i17] % iArr3[i17 - 1]);
            } catch (ArithmeticException a_e) {}
            for (i19 = i17; i19 < 8; i19++) {
                Test0225.iFld &= Test0225.iFld;
                iArr3[i19] = i18;
            }
            i15 = 5;
            for (i21 = 1; 8 > i21; ++i21) {
                i16 = -50719;
                i23 = 1;
                while (++i23 < 2) {
                    switch ((i23 % 2) + 104) {
                    case 104:
                        Test0225.byFld += (byte) (-12 + (i23 * i23));
                        Test0225.dFld -= i22;
                        iArr3[i17 + 1] = (int) Test0225.fFld;
                        Test0225.dArrFld[i21 - 1] *= -62886;
                        break;
                    case 105:
                        s1 -= (short)i17;
                    }
                }
            }
        }
        vMeth1_check_sum += l1 + i15 + i16 + s1 + i17 + i18 + i19 + i20 + i21 + i22 + i23 + FuzzerUtils.checkSum(iArr3);
    }

    public static void vMeth(int i9, int i10, int i11) {

        int i12=5;
        int i13=-143;
        int i14=22;
        int i24=-162;
        int i25=40;
        int[] iArr2 =new int[N];
        short s2=-7930;

        FuzzerUtils.init(iArr2, 3);

        i12 = 1;
        do {
            Test0225.fFld += (i12 - i12);
            Test0225.fFld -= (iArr2[i12 - 1] += (++i10));
            iArr2[i12 + 1] *= (int) ((i12 - Test0225.instanceCount) * ((Test0225.instanceCount = i12) - (i10 + i9)));
            Test0225.instanceCount = Test0225.instanceCount;
            Test0225.instanceCount ^= (Test0225.instanceCount--);
        } while (++i12 < 348);
        for (i13 = 9; i13 < 248; i13++) {
            int i26=-22226;
            vMeth1(Test0225.instanceCount, i14, 151);
            switch ((i13 % 5) + 1) {
            case 1:
                for (i24 = 1; i24 < 7; i24++) {
                    i10 *= i24;
                    Test0225.instanceCount *= 8;
                    s2 += (short)i24;
                    s2 <<= (short)i12;
                    Test0225.iFld += (int) (2537843906L + (i24 * i24));
                }
                break;
            case 2:
                i26 = (int)58.940F;
                break;
            case 3:
                s2 += (short)i12;
                break;
            case 4:
                iArr2[i13] <<= i24;
                break;
            case 5:
                i25 = (int) Test0225.instanceCount;
                break;
            default:
                iArr2 = FuzzerUtils.int1array(N, (int)51106);
            }
        }
        vMeth_check_sum += i9 + i10 + i11 + i12 + i13 + i14 + i24 + i25 + s2 + FuzzerUtils.checkSum(iArr2);
    }

    public int iMeth(int i5) {

        int i6=64772;
        int i7=19;
        int i8=-51;
        int i28=-121;
        int i29=242;
        int[] iArr1 =new int[N];
        float f=1.365F;
        short s=-20417;

        FuzzerUtils.init(iArr1, -12550);

        vSmallMeth((int) (Test0225.iFld - Float.intBitsToFloat(iArr1[(Test0225.iFld >>> 1) % N])));
        for (i6 = 15; 286 > i6; i6++) {
            i5 /= (int) (((long) (-((Test0225.instanceCount + f) * (++Test0225.instanceCount)))) | 1);
            i7 = i5;
            Test0225.instanceCount = (-(s = (short) (i7 ^ i7)));
            i8 = 1;
            while (++i8 < 6) {
                i7 -= Test0225.iFld;
                vMeth(i7, i5, Test0225.iFld);
            }
            for (i28 = 6; i28 > 1; --i28) {
                if (Test0225.bFld) {
                    i7 = (int) Test0225.instanceCount;
                    i29 *= 31960;
                    s += (short) Test0225.iFld;
                    Test0225.fFld += Test0225.instanceCount;
                } else {
                    iArr1[i28 - 1] *= (int) Test0225.instanceCount;
                }
            }
        }
        long meth_res = i5 + i6 + i7 + Float.floatToIntBits(f) + s + i8 + i28 + i29 + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i1=-6;
        int i2=33;
        int i4=25297;
        int i30=233;
        int i31=-65184;
        int i32=132;
        int i33=133;
        int i34=-3;
        int i35=242;
        int i36=-11;
        int i37=8486;
        int[] iArr =new int[N];
        double d=2.59895;

        FuzzerUtils.init(iArr, 182);

        for (int smallinvoc=0; smallinvoc<291; smallinvoc++)
            vSmallMeth((int)((-Long.reverseBytes(-6274764764102547924L)) + (++i1)));
        vSmallMeth(63479);
        Test0225.dArrFld[(i1 >>> 1) % N] += (4284L - (i1++));
        iArr[(Test0225.iFld >>> 1) % N] = (int) (Test0225.instanceCount--);
        vSmallMeth((int) ((long) (-(Test0225.dFld--)) | Test0225.iFld));
        i2 = 1;
        while (++i2 < 215) {
            for (d = i2; 117 > d; d++) {
                iArr[i2] = (int) (((Test0225.instanceCount--) + (0 % ((i2 - i2) | 1))) + Test0225.iFld);
            }
            i1 <<= (int)(Integer.reverseBytes(iMeth(i1)) - -13L);
        }
        for (i30 = 6; i30 < 223; i30++) {
            i4 += (i30 * i30);
            for (i32 = 3; 116 > i32; i32++) {
                for (i34 = 1; i34 < 2; ++i34) {
                    iArr[i30] *= i31;
                    i33 += (int)(13605L + (i34 * i34));
                    i31 = i4;
                    iArr[i32 - 1] /= (int)-123.584F;
                    i4 += (((i34 * i2) + i31) - Test0225.fFld);
                    Test0225.dArrFld[i30 - 1] += -222;
                    Test0225.iFld = i30;
                }
                i31 >>= i35;
                Test0225.bFld = Test0225.bFld;
                Test0225.dArrFld = Test0225.dArrFld;
                for (i36 = 1; i36 < 2; i36++) {
                    i1 += i1;
                    i35 = (int) Test0225.instanceCount;
                }
                Test0225.iFld -= i34;
                i1 >>= (int) Test0225.instanceCount;
            }
            iArr[i30 - 1] = i36;
            Test0225.fFld += i30;
        }

        FuzzerUtils.out.println("i1 i2 d = " + i1 + "," + i2 + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("i4 i30 i31 = " + i4 + "," + i30 + "," + i31);
        FuzzerUtils.out.println("i32 i33 i34 = " + i32 + "," + i33 + "," + i34);
        FuzzerUtils.out.println("i35 i36 i37 = " + i35 + "," + i36 + "," + i37);
        FuzzerUtils.out.println("iArr = " + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test0225.instanceCount Test0225.byFld Test0225.fFld = " + Test0225.instanceCount + "," + Test0225.byFld +
                "," + Float.floatToIntBits(Test0225.fFld));
        FuzzerUtils.out.println("Test0225.iFld Test0225.dFld Test0225.bFld = " + Test0225.iFld + "," +
                Double.doubleToLongBits(Test0225.dFld) + "," + (Test0225.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0225.dArrFld Test0225.lArrFld = " +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0225.dArrFld)) + "," + FuzzerUtils.checkSum(Test0225.lArrFld));

        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0225 _instance = new Test0225();
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test iMeth
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}