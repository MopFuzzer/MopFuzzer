// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:53 2023
public class Test0883 {

    public static final int N = 400;

    public static long instanceCount=14598L;
    public static double dFld=-20.99823;
    public static int iFld=11191;
    public static boolean bFld=true;
    public static float fFld=28.802F;
    public static int[] iArrFld =new int[N];
    public static long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test0883.iArrFld, 48230);
        FuzzerUtils.init(Test0883.lArrFld, -1504525011285181140L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i3=-14;
        int i4=-8;
        int i5=14;
        int i6=-14;
        int i7=0;
        int i8=54;
        int[] iArr1 =new int[N];
        float f1=0.344F, f2=0.166F;
        byte by1=125;

        FuzzerUtils.init(iArr1, -8467);

        i3 = i3;
        i3 ^= -43182;
        for (f1 = 17; f1 < 391; f1++) {
            i5 = 1;
            do {
                i4 += i4;
            } while (++i5 < 5);
            switch ((int)((f1 % 8) + 114)) {
            case 114:
                i3 += (int) Test0883.instanceCount;
                break;
            case 115:
                i6 = 1;
                while (++i6 < 5) {
                    i3 += i6;
                }
                break;
            case 116:
                f2 = i3;
                for (i7 = (int)(f1); i7 < 5; ++i7) {
                    iArr1[(int)(f1)] = i6;
                    f2 *= Test0883.instanceCount;
                    i8 = by1;
                    iArr1[(int)(f1)] |= 15054;
                }
            case 117:
                Test0883.instanceCount += Test0883.instanceCount;
                break;
            case 118:
                Test0883.dFld = 36195;
                break;
            case 119:
                iArr1[(int)(f1)] = (int)-64.767F;
                break;
            case 120:
                i8 -= i7;
            case 121:
                f2 = i3;
                break;
            default:
                Test0883.dFld += i8;
            }
        }
        long meth_res = i3 + Float.floatToIntBits(f1) + i4 + i5 + i6 + Float.floatToIntBits(f2) + i7 + i8 + by1 +
            FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(long l) {

        byte by=-122;
        int i9=26, i10=6, i11=-250, i12=6, i13=-82, i14=178, i15=-40805;
        float f3=-28.743F;
        short s=-13693;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -69063303351147260L);

        l = (long) (Math.sqrt(by + 114) - ((Test0883.instanceCount & by) + (236 - (Test0883.instanceCount * -91.58F))));
        Test0883.dFld += (iMeth() - Test0883.iFld);
        Test0883.iFld <<= Test0883.iFld;
        Test0883.instanceCount = l;
        for (i9 = 4; i9 < 124; i9++) {
            Test0883.instanceCount += i9;
            for (i11 = 1; i11 < 13; i11++) {
                Test0883.iFld = i9;
            }
            Test0883.iFld = i13;
            i14 = 1;
            do {
                if (Test0883.bFld) {
                    for (f3 = i9; f3 < 1; ++f3) {
                        by += (byte)i10;
                        lArr[i14] ^= 6199880757714985027L;
                        Test0883.iFld += (int) (((f3 * i12) + i10) - s);
                    }
                } else if (Test0883.bFld) {
                    i13 += i14;
                } else if (Test0883.bFld) {
                    Test0883.dFld = i15;
                } else {
                    if (Test0883.bFld) continue;
                    vMeth1_check_sum += l + by + i9 + i10 + i11 + i12 + i13 + i14 + Float.floatToIntBits(f3) + i15 + s
                        + FuzzerUtils.checkSum(lArr);
                    return;
                }
            } while (++i14 < 13);
        }
        vMeth1_check_sum += l + by + i9 + i10 + i11 + i12 + i13 + i14 + Float.floatToIntBits(f3) + i15 + s +
            FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(int i1) {

        double d=97.92730;
        int i2=92;
        int i16=-3;
        int i17=-35090;
        int i18=-6;
        int[] iArr =new int[N];
        float f4=82.191F;
        float[] fArr =new float[N];
        short s1=4284;
        boolean[] bArr =new boolean[N];

        FuzzerUtils.init(iArr, 2);
        FuzzerUtils.init(fArr, 0.130F);
        FuzzerUtils.init(bArr, true);

        d -= (--iArr[(i1 >>> 1) % N]);
        i2 = 1;
        do {
            vMeth1(-16217L);
            i1 ^= (int) Test0883.instanceCount;
            Test0883.dFld *= Test0883.iFld;
            f4 += (i2 * i2);
            for (i16 = 1; i16 < 10; i16++) {
                Test0883.instanceCount += (i16 * i16);
                Test0883.iFld += (i16 | s1);
                i17 = i18;
                switch ((i2 % 2) + 115) {
                case 115:
                    iArr[i2 + 1] += Test0883.iFld;
                    fArr[i2] += -157;
                    break;
                case 116:
                    bArr = bArr;
                    f4 *= Test0883.iFld;
                    break;
                }
            }
        } while (++i2 < 158);
        vMeth_check_sum += i1 + Double.doubleToLongBits(d) + i2 + Float.floatToIntBits(f4) + i16 + i17 + s1 + i18 +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(bArr);
    }

    public void mainTest(String[] strArr1) {

        float f=91.725F;
        int i=-52351, i19=-6, i20=2, i21=29410, i22=-1;
        long l1=5903246606732056312L;

        for (f = 193; f > 6; f--) {
            vMeth(Test0883.iFld);
            Test0883.iFld *= (int) -7045946347751255637L;
            Test0883.instanceCount = Test0883.instanceCount;
            Test0883.iArrFld[(int) (f + 1)] += i;
            i -= Test0883.iFld;
            Test0883.iArrFld[(int) (f - 1)] >>= (int) Test0883.instanceCount;
            Test0883.iArrFld[(int) (f - 1)] = i;
        }
        i19 = 1;
        do {
            for (i20 = 2; 85 > i20; i20++) {
                Test0883.instanceCount *= Test0883.iFld;
                i21 -= (int)f;
                Test0883.iFld += i21;
                i21 += (-34 + (i20 * i20));
                Test0883.iFld <<= (int) Test0883.instanceCount;
                Test0883.instanceCount += i20;
                Test0883.iFld >>= i;
                i21 <<= Test0883.iFld;
            }
            i22 = 1;
            do {
                Test0883.iFld = (int) Test0883.instanceCount;
                switch ((((Test0883.iFld >>> 1) % 10) * 5) + 42) {
                case 81:
                    l1 = 1;
                    do {
                        Test0883.instanceCount = Test0883.iFld;
                        Test0883.iFld = i;
                        i21 /= (int)(i22 | 1);
                        Test0883.iFld *= (int) Test0883.instanceCount;
                        i = (int) Test0883.instanceCount;
                        Test0883.lArrFld[(int) (l1 + 1)] += i19;
                    } while (++l1 < 1);
                    i21 <<= i;
                    break;
                case 51:
                    i21 *= i20;
                    break;
                case 77:
                    i = Test0883.iFld;
                    break;
                case 88:
                    Test0883.iFld >>= i;
                    break;
                case 73:
                    i21 += i22;
                    break;
                case 83:
                    Test0883.lArrFld[i19 - 1] -= i21;
                    break;
                case 56:
                    Test0883.iFld += -6;
                case 55:
                    i21 += (int)(26311L + (i22 * i22));
                    break;
                case 79:
                    Test0883.instanceCount *= l1;
                    break;
                case 45:
                    Test0883.iArrFld[i22 - 1] -= (int) -44809L;
                    break;
                default:
                    Test0883.fFld += i22;
                }
            } while (++i22 < 85);
        } while (++i19 < 296);

        FuzzerUtils.out.println("f i i19 = " + Float.floatToIntBits(f) + "," + i + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("l1 = " + l1);

        FuzzerUtils.out.println("Test0883.instanceCount Test0883.dFld Test0883.iFld = " + Test0883.instanceCount + "," +
                Double.doubleToLongBits(Test0883.dFld) + "," + Test0883.iFld);
        FuzzerUtils.out.println("Test0883.bFld Test0883.fFld Test0883.iArrFld = " + (Test0883.bFld ? 1 : 0) + "," +
                Float.floatToIntBits(Test0883.fFld) + "," + FuzzerUtils.checkSum(Test0883.iArrFld));
        FuzzerUtils.out.println("Test0883.lArrFld = " + FuzzerUtils.checkSum(Test0883.lArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0883 _instance = new Test0883();
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
