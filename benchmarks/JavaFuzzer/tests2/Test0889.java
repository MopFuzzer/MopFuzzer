// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:53 2023
public class Test0889 {

    public static final int N = 400;

    public static volatile long instanceCount=-8388821633960939658L;
    public int iFld=-45079;
    public static volatile double dFld=-1.83071;
    public static long lFld=170L;
    public static byte[] byArrFld =new byte[N];

    static {
        FuzzerUtils.init(Test0889.byArrFld, (byte) 26);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i4, byte by, int i5) {

        double d=2.55556;
        byte[] byArr =new byte[N];

        FuzzerUtils.init(byArr, (byte)75);

        i5 += (int)d;
        byArr[(i5 >>> 1) % N] += by;
        long meth_res = i4 + by + i5 + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(byArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth1() {

        int i3=14;
        int i6=-114;
        int i7=-34863;
        int i8=146;
        int i9=-64587;
        int i10=10;
        int[] iArr =new int[N];
        float f=2.859F;
        short s1=-10065;
        long[] lArr =new long[N];

        FuzzerUtils.init(iArr, 146);
        FuzzerUtils.init(lArr, -28629L);

        i3 = iMeth(-5, (byte)(51), i3);
        i6 = 1;
        do {
            try {
                i3 = (-208 % i3);
                iArr[i6 - 1] = (15 % i3);
                iArr[i6] = (i6 % -120);
            } catch (ArithmeticException a_e) {}
            Test0889.instanceCount = i6;
            for (i7 = 1; i7 < 5; i7++) {
                Test0889.instanceCount += i7;
                Test0889.instanceCount = (long) f;
                lArr[i6 + 1] += -14;
                for (i9 = 1; i9 < 2; ++i9) {
                    Test0889.instanceCount *= (long) 1.165F;
                    iArr[i9] <<= (int) Test0889.instanceCount;
                    Test0889.instanceCount = i10;
                    i8 += (int)f;
                    try {
                        i10 = (iArr[i9 - 1] % i3);
                        i3 = (-210 % iArr[i7 + 1]);
                        i10 = (i3 / i10);
                    } catch (ArithmeticException a_e) {}
                    i3 = s1;
                }
            }
        } while (++i6 < 352);
        vMeth1_check_sum += i3 + i6 + i7 + i8 + Float.floatToIntBits(f) + i9 + i10 + s1 + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(lArr);
    }

    public void vMeth(short s, int i) {

        int i1=78, i2=-10, i11=-22, i12=-9200;
        float f1=-1.838F;
        double d1=27.95903;
        byte[] byArr1 =new byte[N];

        FuzzerUtils.init(byArr1, (byte)92);

        for (i1 = 5; i1 < 204; ++i1) {
            vMeth1();
            i2 += 131;
            f1 = i2;
        }
        byArr1[(i2 >>> 1) % N] -= (byte)i2;
        d1 = i;
        for (i11 = 18; 340 > i11; i11++) {
            i2 |= i;
        }
        f1 -= i11;
        i *= i1;
        vMeth_check_sum += s + i + i1 + i2 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d1) + i11 + i12 +
            FuzzerUtils.checkSum(byArr1);
    }

    public void mainTest(String[] strArr1) {

        short s2=-29147;
        int i13=4;
        int i14=-240;
        int i16=-127;
        int i17=-6;
        int i18=-10;
        int i19=10;
        int i20=17370;
        int i21=7;
        int[] iArr1 =new int[N];
        boolean b=false;
        long[][] lArr1 =new long[N][N];

        FuzzerUtils.init(iArr1, 2);
        FuzzerUtils.init(lArr1, 8383923662233675846L);

        vMeth(s2, iFld);
        iFld = s2;
        for (i13 = 3; i13 < 157; i13 += 3) {
            for (int i15 : iArr1) {
                Test0889.byArrFld[i13 - 1] -= (byte) i15;
                i15 += iFld;
                for (i16 = i13; 2 > i16; i16++) {
                    i14 -= (int) Test0889.instanceCount;
                    iFld <<= i17;
                    iArr1 = iArr1;
                    lArr1[i16 + 1][i13 + 1] *= i13;
                }
            }
            for (i18 = 6; i18 < 252; i18++) {
                for (i20 = 1; 2 > i20; i20++) {
                    iFld += (i20 * i18);
                    switch ((i18 % 9) + 120) {
                    case 120:
                        i19 = i13;
                        i17 = (int) Test0889.dFld;
                        lArr1[i13 - 1][i20 - 1] = i16;
                        Test0889.instanceCount += i20;
                    case 121:
                        Test0889.instanceCount += (i20 * i20);
                        i21 = -15881;
                        i19 += 61;
                        break;
                    case 122:
                        i14 = (int) Test0889.instanceCount;
                        if (b) continue;
                    case 123:
                        i19 = i19;
                        lArr1[i18 + 1] = lArr1[i20];
                        break;
                    case 124:
                        i14 += i20;
                        iArr1[i18 + 1] += i21;
                        iFld *= i18;
                        Test0889.instanceCount -= i17;
                        break;
                    case 125:
                        i21 *= (int) Test0889.dFld;
                        break;
                    case 126:
                        i17 *= (int) Test0889.lFld;
                        break;
                    case 127:
                        Test0889.instanceCount >>= i17;
                        break;
                    case 128:
                        i14 += (i20 * i20);
                        break;
                    default:
                        Test0889.instanceCount = i14;
                    }
                }
            }
        }

        FuzzerUtils.out.println("s2 i13 i14 = " + s2 + "," + i13 + "," + i14);
        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("b iArr1 lArr1 = " + (b ? 1 : 0) + "," + FuzzerUtils.checkSum(iArr1) + "," +
            FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test0889.instanceCount iFld Test0889.dFld = " + Test0889.instanceCount + "," + iFld + "," +
                Double.doubleToLongBits(Test0889.dFld));
        FuzzerUtils.out.println("Test0889.lFld Test0889.byArrFld = " + Test0889.lFld + "," + FuzzerUtils.checkSum(Test0889.byArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0889 _instance = new Test0889();
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
