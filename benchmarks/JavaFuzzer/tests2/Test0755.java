// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:47 2023
public class Test0755 {

    public static final int N = 400;

    public static long instanceCount=5487L;
    public static double dFld=0.47560;
    public static float fFld=42.203F;
    public static int iFld=6;
    public static int iFld1=1;
    public static short sFld=15527;
    public static float[][] fArrFld =new float[N][N];

    static {
        FuzzerUtils.init(Test0755.fArrFld, 2.366F);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long iMeth2_check_sum = 0;

    public static int iMeth2(int i7) {

        int i8=6;
        int i9=189;
        int i10=-190;
        int i11=-40479;
        int i12=58730;
        int i13=-6192;
        int[] iArr =new int[N];
        short s=-18387;
        boolean b=true;

        FuzzerUtils.init(iArr, -24);

        Test0755.dFld += Test0755.fFld;
        for (i8 = 5; i8 < 292; i8++) {
            for (i10 = 1; i10 < 6; i10++) {
                if (i9 != 0) {
                }
                for (i12 = 1; i12 < 2; ++i12) {
                    Test0755.fFld = i9;
                    Test0755.iFld += i12;
                    s = (short)i7;
                    if (b) {
                        Test0755.fFld -= -44;
                    } else {
                        if (i13 != 0) {
                        }
                        Test0755.fFld = Test0755.fFld;
                    }
                }
                i13 += (int)(2.991F + (i10 * i10));
                iArr[i10 - 1] -= i7;
                i13 |= (int) Test0755.instanceCount;
            }
        }
        long meth_res = i7 + i8 + i9 + i10 + i11 + i12 + i13 + s + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr);
        iMeth2_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth1() {

        int i4=-6625;
        int i5=4;
        int i6=-27841;
        int i14=17;
        int i15=-64830;
        int i17=6;
        int[][] iArr1 =new int[N][N];
        int[] iArr2 =new int[N];
        int[] iArr3 =new int[N];
        double d=111.127665;
        double[] dArr =new double[N];
        short s1=-4982;

        FuzzerUtils.init(dArr, -1.50498);
        FuzzerUtils.init(iArr1, -35995);
        FuzzerUtils.init(iArr2, 58);
        FuzzerUtils.init(iArr3, -11);

        for (i4 = 12; i4 < 303; i4 += 3) {
            i6 = 1;
            do {
                Test0755.instanceCount = (long) (((12 + (i5 >>> Test0755.instanceCount)) / ((long) (d) | 1)) + iMeth2(Test0755.iFld));
                for (i14 = i4; 1 > i14; i14++) {
                    Test0755.instanceCount += (i14 * i14);
                }
                i5 *= (int) Test0755.instanceCount;
                i5 = i6;
                i15 = i15;
                i5 += i6;
                dArr[i6 - 1] -= 14;
            } while (++i6 < 16);
        }
        Test0755.instanceCount >>>= Test0755.iFld1;
        i15 = i15;
        iArr1[(i5 >>> 1) % N][(i5 >>> 1) % N] = s1;
        Test0755.iFld = i14;
        iArr3[(-6 >>> 1) % N] = i17;
        long meth_res = i4 + i5 + i6 + Double.doubleToLongBits(d) + i14 + i15 + s1 + i17 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(iArr3);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i1) {

        int i2=-11;
        int i3=-7;
        int i18=22203;
        int i19=-14;
        int i20=-15349;
        int i21=-199;
        int[] iArr4 =new int[N];

        FuzzerUtils.init(iArr4, -4);

        for (i2 = 7; i2 < 350; i2 += 3) {
            switch (((i2 % 2) * 5) + 102) {
            case 112:
                if (iMeth1() < i3) break;
                break;
            case 106:
                Test0755.instanceCount <<= 7;
                for (i18 = 1; i18 < 14; i18++) {
                    Test0755.fFld += (((i18 * i3) + Test0755.fFld) - i3);
                    for (i20 = 1; 2 > i20; i20++) {
                        Test0755.instanceCount += i20;
                        switch (((Test0755.iFld >>> 1) % 8) + 112) {
                        case 112:
                            Test0755.instanceCount -= -15810;
                        case 113:
                            i21 %= (int)-1.227F;
                            i21 += i20;
                            if (i19 != 0) {
                            }
                            iArr4[i18 - 1] = 20911;
                        case 114:
                            Test0755.sFld *= (short) Test0755.fFld;
                            break;
                        case 115:
                            Test0755.iFld *= (int) 6056638778411543245L;
                            break;
                        case 116:
                            Test0755.instanceCount += (61391 + (i20 * i20));
                            break;
                        case 117:
                            i3 = 0;
                            break;
                        case 118:
                            iArr4[i20] &= Test0755.iFld;
                            break;
                        case 119:
                        }
                    }
                }
                break;
            default:
                Test0755.iFld = i20;
            }
        }
        long meth_res = i1 + i2 + i3 + i18 + i19 + i20 + i21 + FuzzerUtils.checkSum(iArr4);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=27968;
        int i22=-249;
        int i23=-49601;
        int i24=3940;
        int i25=-38196;
        int i26=149;
        int i27=5;
        int i28=-24609;
        int i29=-64414;
        int[] iArr5 =new
                    int[N];
        long l=-49908L;
        long l1=-35284L;
        long[] lArr =new long[N];
        byte by=55;
        boolean b1=true;
        double[] dArr1 =new double[N];

        FuzzerUtils.init(iArr5, 11);
        FuzzerUtils.init(dArr1, -1.126730);
        FuzzerUtils.init(lArr, -10L);

        i |= iMeth(Test0755.iFld);
        i22 = 1;
        while (++i22 < 262) {
            for (i23 = 6; i23 < 96; i23++) {
                iArr5[i22] *= (int)l;
                for (i25 = 1; i25 < 2; i25++) {
                    Test0755.dFld = Test0755.fFld;
                    Test0755.fFld -= Test0755.iFld1;
                    i24 *= (int)l;
                }
                Test0755.dFld -= Test0755.fFld;
                switch ((i22 % 5) + 124) {
                case 124:
                    Test0755.iFld1 -= (int) 6603153520858391255L;
                    i = i23;
                    Test0755.fArrFld[i23][i23 - 1] = i22;
                    break;
                case 125:
                    Test0755.fFld = i26;
                    i -= i24;
                    for (i27 = 1; i27 < 2; ++i27) {
                        Test0755.instanceCount *= i25;
                        l = 10;
                        i28 >>= i27;
                        by -= (byte) Test0755.fFld;
                        l >>= 3689;
                        dArr1[i23] += by;
                        b1 = b1;
                        Test0755.iFld += i27;
                        lArr[i23 + 1] += i27;
                        i24 += (i27 - Test0755.instanceCount);
                    }
                    if (b1) break;
                    break;
                case 126:
                    for (l1 = 1; l1 < 2; l1++) {
                        Test0755.instanceCount += l1;
                        i += (int)l1;
                    }
                    break;
                case 127:
                case 128:
                    by *= (byte) Test0755.fFld;
                    break;
                default:
                    i += i23;
                }
            }
        }

        FuzzerUtils.out.println("i i22 i23 = " + i + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 l i25 = " + i24 + "," + l + "," + i25);
        FuzzerUtils.out.println("i26 i27 i28 = " + i26 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("by b1 l1 = " + by + "," + (b1 ? 1 : 0) + "," + l1);
        FuzzerUtils.out.println("i29 iArr5 dArr1 = " + i29 + "," + FuzzerUtils.checkSum(iArr5) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)));
        FuzzerUtils.out.println("lArr = " + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test0755.instanceCount Test0755.dFld Test0755.fFld = " + Test0755.instanceCount + "," +
                Double.doubleToLongBits(Test0755.dFld) + "," + Float.floatToIntBits(Test0755.fFld));
        FuzzerUtils.out.println("Test0755.iFld Test0755.iFld1 Test0755.sFld = " + Test0755.iFld + "," + Test0755.iFld1 + "," + Test0755.sFld);
        FuzzerUtils.out.println("Test0755.fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0755.fArrFld)));

        FuzzerUtils.out.println("iMeth2_check_sum: " + iMeth2_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0755 _instance = new Test0755();
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
//DEBUG  iMeth2 ->  iMeth2 iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}