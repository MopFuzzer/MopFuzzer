// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:14 2023
public class Test0061 {

    public static final int N = 400;

    public static volatile long instanceCount=-5L;
    public static short sFld=6807;
    public static byte byFld=-65;
    public static boolean bFld=false;
    public float fFld=76.172F;
    public static int[] iArrFld =new int[N];
    public static boolean[] bArrFld =new boolean[N];

    static {
        FuzzerUtils.init(Test0061.iArrFld, -60551);
        FuzzerUtils.init(Test0061.bArrFld, true);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i1, int i2) {

        int i3=-23045, i4=0, i5=11428, i6=1553, i7=-14940, i8=5, i9=14;
        long l1=5L;
        double d=-2.60317;
        float f1=2.860F;

        i2 += i3;
        for (l1 = 5; l1 < 161; l1++) {
            boolean b=true;
            if (b) {
                Test0061.instanceCount *= i2;
            } else if (false) {
                for (i5 = 1; 10 > i5; ++i5) {
                    for (i7 = (int)(l1); i7 < 2; i7++) {
                        i1 += (((i7 * i2) + i5) - i3);
                    }
                    d = Test0061.instanceCount;
                    i8 -= (int)f1;
                    Test0061.instanceCount += -47127;
                    i6 = (int)f1;
                    Test0061.iArrFld[(int) (l1 - 1)] = i1;
                    f1 += (i5 * i5);
                    Test0061.instanceCount += (((i5 * i7) + f1) - l1);
                }
                if (i7 != 0) {
                }
            } else if (b) {
                i2 *= (int)d;
            } else {
                f1 += i9;
            }
        }
        long meth_res = i1 + i2 + i3 + l1 + i4 + i5 + i6 + i7 + i8 + Double.doubleToLongBits(d) +
            Float.floatToIntBits(f1) + i9;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(short s, long l, int i) {

        float f2=0.642F, f3=0.798F;
        double d1=-1.5621;
        int i10=9, i11=-32512, i12=-201;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -7L);

        i <<= (int)((i - iMeth1(12565, i)) + f2);
        d1 = d1;
        i -= (int)f2;
        for (f3 = 6; f3 < 263; ++f3) {
            for (i11 = 6; 1 < i11; --i11) {
                i10 >>= (int) Test0061.instanceCount;
                s *= (short)1;
                i10 += i12;
                l += i11;
                i += (int)l;
                i10 -= i11;
                s += (short)i;
                Test0061.iArrFld[i11 + 1] = 38189;
            }
            lArr[(int)(f3 + 1)] -= 46L;
            Test0061.instanceCount /= (i | 1);
        }
        vMeth_check_sum += s + l + i + Float.floatToIntBits(f2) + Double.doubleToLongBits(d1) +
            Float.floatToIntBits(f3) + i10 + i11 + i12 + FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth(float f) {

        int i13=-199, i14=-13, i15=2, i16=5, i17=-39583, i18=2;
        short[][] sArr =new short[N][N];

        FuzzerUtils.init(sArr, (short)-3180);

        vMeth(Test0061.sFld, Test0061.instanceCount, i13);
        for (i14 = 18; i14 < 360; ++i14) {
            i15 += (((i14 * Test0061.instanceCount) + i15) - i15);
            i16 = 1;
            do {
                for (i17 = 1; 1 > i17; ++i17) {
                    sArr[i14 + 1][i14 + 1] = Test0061.byFld;
                    i15 -= (int) Test0061.instanceCount;
                    sArr[i16 - 1][i16 - 1] = (short)i14;
                    Test0061.sFld = (short) i14;
                    i13 = i16;
                    f += 71.937F;
                    if (i18 != 0) {
                    }
                    if (Test0061.bFld) {
                        i15 = 242;
                    } else {
                        Test0061.instanceCount += 214;
                    }
                }
            } while (++i16 < 5);
        }
        long meth_res = Float.floatToIntBits(f) + i13 + i14 + i15 + i16 + i17 + i18 + FuzzerUtils.checkSum(sArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i19=119, i20=44835, i21=8, i22=97, i23=40, i24=191, i25=-48909;
        double d2=2.161, d3=-2.102246;
        long[] lArr1 =new long[N];
        float[] fArr =new float[N];

        FuzzerUtils.init(lArr1, -52432L);
        FuzzerUtils.init(fArr, -9.182F);

        iMeth(fFld);
        switch ((((-4875 >>> 1) % 6) * 5) + 84) {
        case 95:
            fFld = fFld;
            for (i19 = 17; 382 > i19; i19++) {
                Test0061.iArrFld[i19] -= (int) Test0061.instanceCount;
                Test0061.sFld = (short) 204;
                lArr1[i19] >>>= i19;
                d2 = 1;
                while (++d2 < 69) {
                    Test0061.instanceCount = i19;
                    Test0061.byFld >>= (byte) i19;
                    Test0061.bArrFld[i19 + 1] = Test0061.bFld;
                }
                i20 += i19;
                d3 = 1;
                while (++d3 < 69) {
                    Test0061.iArrFld[i19 - 1] = i20;
                    Test0061.instanceCount = 15;
                    for (i21 = i19; i21 < 1; ++i21) {
                        i20 += (i21 ^ i20);
                    }
                }
                fFld *= i19;
                i20 *= 7;
            }
        case 92:
            i23 = 1;
            while (++i23 < 389) {
                Test0061.instanceCount *= i22;
                i22 = i21;
                i20 = (int) Test0061.instanceCount;
                for (i24 = 1; i24 < 65; i24++) {
                    Test0061.iArrFld = Test0061.iArrFld;
                    Test0061.bFld = Test0061.bFld;
                    Test0061.byFld += (byte) i19;
                    Test0061.instanceCount += i24;
                    i22 -= 29;
                    i25 *= i23;
                }
            }
            break;
        case 108:
            i22 -= i25;
            break;
        case 96:
            Test0061.iArrFld[(i22 >>> 1) % N] <<= i22;
        case 104:
            fArr[(i25 >>> 1) % N] -= -7;
            break;
        case 93:
            i20 += (int)-60974L;
            break;
        default:
            Test0061.instanceCount <<= i22;
        }

        FuzzerUtils.out.println("i19 i20 d2 = " + i19 + "," + i20 + "," + Double.doubleToLongBits(d2));
        FuzzerUtils.out.println("d3 i21 i22 = " + Double.doubleToLongBits(d3) + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("lArr1 fArr = " + FuzzerUtils.checkSum(lArr1) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test0061.instanceCount Test0061.sFld Test0061.byFld = " + Test0061.instanceCount + "," + Test0061.sFld +
                "," + Test0061.byFld);
        FuzzerUtils.out.println("Test0061.bFld fFld Test0061.iArrFld = " + (Test0061.bFld ? 1 : 0) + "," +
                Float.floatToIntBits(fFld) + "," + FuzzerUtils.checkSum(Test0061.iArrFld));
        FuzzerUtils.out.println("Test0061.bArrFld = " + FuzzerUtils.checkSum(Test0061.bArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0061 _instance = new Test0061();
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