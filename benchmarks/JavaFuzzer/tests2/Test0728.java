// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:46 2023
public class Test0728 {

    public static final int N = 400;

    public static volatile long instanceCount=3916523067311027263L;
    public static double dFld=-12.51339;
    public static short sFld=23951;
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0728.iArrFld, 53118);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i4, int i5, float f) {

        short s=7840;
        int i6=3861, i7=11, i8=0, i9=-1, i10=13, i11=-189;
        boolean b=true;

        s += (short)i4;
        i5 += (int) Test0728.instanceCount;
        Test0728.instanceCount = Test0728.instanceCount;
        Test0728.dFld = Test0728.instanceCount;
        for (i6 = 1; i6 < 386; i6++) {
            if (b) continue;
            i5 = i6;
            for (i8 = 1; 4 > i8; i8++) {
                for (i10 = 1; i10 < 2; ++i10) {
                    Test0728.iArrFld[i8 + 1] -= i10;
                    if (i11 != 0) {
                        vMeth1_check_sum += i4 + i5 + Float.floatToIntBits(f) + s + i6 + i7 + (b ? 1 : 0) + i8 + i9 +
                            i10 + i11;
                        return;
                    }
                    i7 <<= i9;
                    i7 >>= 60179;
                    i11 *= (int)f;
                    i5 -= 11;
                }
            }
        }
        vMeth1_check_sum += i4 + i5 + Float.floatToIntBits(f) + s + i6 + i7 + (b ? 1 : 0) + i8 + i9 + i10 + i11;
    }

    public static void vMeth(int i2, int i3) {

        float f1=0.536F;
        int i12=8, i13=0, i14=11, i15=32014, i16=50351;

        vMeth1(i2, i2, f1);
        Test0728.iArrFld = Test0728.iArrFld;
        Test0728.dFld -= i2;
        i12 = 1;
        do {
            i3 ^= i2;
            Test0728.sFld = (short) i2;
        } while (++i12 < 367);
        for (i13 = 361; 12 < i13; i13--) {
            Test0728.iArrFld[i13 - 1] >>>= (int) Test0728.instanceCount;
            Test0728.instanceCount = i14;
            switch ((i13 % 2) + 92) {
            case 92:
                for (i15 = 1; i15 < 5; ++i15) {
                    Test0728.dFld += i16;
                    i14 = i13;
                    i16 ^= i15;
                    i16 = i16;
                }
                break;
            case 93:
                i3 = i3;
            default:
                i3 -= i2;
            }
        }
        vMeth_check_sum += i2 + i3 + Float.floatToIntBits(f1) + i12 + i13 + i14 + i15 + i16;
    }

    public static int iMeth(int i, int i1, long l) {

        int i18=14, i19=-12629, i20=-1;
        float f2=-1.1018F;
        float[] fArr =new float[N];
        byte by=14;
        boolean b1=true;
        long[] lArr =new long[N];

        FuzzerUtils.init(fArr, 59.685F);
        FuzzerUtils.init(lArr, -223L);

        vMeth(4, i);
        i18 = 1;
        do {
            for (i19 = i18; 7 > i19; ++i19) {
                Test0728.dFld = l;
                Test0728.iArrFld[i18] ^= i20;
                f2 += ((long)i19 | (long)l);
                Test0728.iArrFld[i19 - 1] *= by;
                switch ((i19 % 9) + 105) {
                case 105:
                    i20 >>>= (int)-2L;
                    if (b1) {
                        f2 -= i18;
                        Test0728.dFld += l;
                        i20 += (i19 ^ i18);
                        if (b1) break;
                    } else if (b1) {
                        i1 += (int) Test0728.dFld;
                    } else {
                        by += (byte)(i19 + i20);
                    }
                    break;
                case 106:
                    fArr = fArr;
                    break;
                case 107:
                    lArr[i19 - 1] <<= -12;
                    break;
                case 108:
                    l -= (long) Test0728.dFld;
                case 109:
                    i20 += (((i19 * i18) + f2) - i18);
                    break;
                case 110:
                    f2 += i19;
                    break;
                case 111:
                    i20 = (int) Test0728.instanceCount;
                case 112:
                    i += (i19 ^ i);
                    break;
                case 113:
                    lArr[i19] >>= i1;
                    break;
                default:
                    Test0728.sFld ^= (short) i;
                }
            }
        } while (++i18 < 250);
        long meth_res = i + i1 + l + i18 + i19 + i20 + Float.floatToIntBits(f2) + by + (b1 ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i21=-54090;
        int[] iArr =new int[N];
        float f3=-41.706F;
        byte by1=-80;

        FuzzerUtils.init(iArr, 12);

        iArr[(-178 >>> 1) % N] += iMeth(i21, 31120, Test0728.instanceCount);
        f3 = 10;
        Test0728.sFld += (short) f3;
        i21 += by1;

        FuzzerUtils.out.println("i21 f3 by1 = " + i21 + "," + Float.floatToIntBits(f3) + "," + by1);
        FuzzerUtils.out.println("iArr = " + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test0728.instanceCount Test0728.dFld Test0728.sFld = " + Test0728.instanceCount + "," +
                Double.doubleToLongBits(Test0728.dFld) + "," + Test0728.sFld);
        FuzzerUtils.out.println("Test0728.iArrFld = " + FuzzerUtils.checkSum(Test0728.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0728 _instance = new Test0728();
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
