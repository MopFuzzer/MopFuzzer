// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:34 2023
public class Test0475 {

    public static final int N = 400;

    public static long instanceCount=-4372403757942320002L;
    public static double dFld=-1.116379;
    public static int iFld=-2;
    public static short sFld=-25220;
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0475.iArrFld, -239);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i3, short s, int i4) {

        float f=0.799F;
        int i5=-94, i6=-248, i7=234, i8=-117;
        boolean b=false;

        f -= i4;
        i4 -= i3;
        i4 -= i3;
        for (i5 = 300; i5 > 15; i5 -= 2) {
            i3 += (i5 * i5);
            Test0475.dFld += i6;
            i4 <<= -52638;
            for (i7 = 1; i7 < 11; i7++) {
                f += i7;
                Test0475.iArrFld[i5] -= i6;
                i8 += i3;
                Test0475.iArrFld[i7 + 1] = i7;
            }
            f *= i8;
            i6 = i6;
            b = b;
        }
        long meth_res = i3 + s + i4 + Float.floatToIntBits(f) + i5 + i6 + i7 + i8 + (b ? 1 : 0);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1() {

        int i9=42, i10=-49, i11=-202, i12=54547, i13=254, i14=-4, i15=1;
        short s1=-14888;
        byte by=-104;
        boolean b1=false;
        double[] dArr =new double[N];
        long[] lArr =new long[N];

        FuzzerUtils.init(dArr, 1.60306);
        FuzzerUtils.init(lArr, -25676758L);

        lMeth(i9, s1, i9);
        i10 = 1;
        while (++i10 < 139) {
            i9 = i9;
            i11 = 11;
            while (--i11 > 0) {
                Test0475.instanceCount &= -228;
                dArr[i10 - 1] *= by;
            }
        }
        for (i12 = 1; 209 > i12; i12++) {
            lArr = lArr;
            if (b1) {
                switch ((i12 % 10) + 22) {
                case 22:
                case 23:
                    for (i14 = i12; i14 < 8; ++i14) {
                        if (b1) continue;
                        i15 = -83;
                        i15 -= i11;
                        Test0475.iArrFld[i14] = -22278;
                    }
                    break;
                case 24:
                case 25:
                    try {
                        i13 = (-32 % i10);
                        i13 = (-57621 / i12);
                        i9 = (Test0475.iArrFld[i12 + 1] / -9943);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 26:
                    i13 *= (int) Test0475.instanceCount;
                case 27:
                    i9 += i12;
                    break;
                case 28:
                    Test0475.iArrFld = Test0475.iArrFld;
                case 29:
                case 30:
                    i13 = i14;
                    break;
                case 31:
                    Test0475.iArrFld[i12 - 1] *= (int) Test0475.dFld;
                    break;
                }
            } else if (b1) {
                i15 += i15;
            } else if (false) {
                by += (byte) Test0475.instanceCount;
            } else {
                try {
                    Test0475.iArrFld[i12 - 1] = (-99 % i15);
                    i13 = (i10 % i14);
                    i9 = (-1335913231 / i14);
                } catch (ArithmeticException a_e) {}
                vMeth1_check_sum += i9 + s1 + i10 + i11 + by + i12 + i13 + i14 + i15 + (b1 ? 1 : 0) +
                    Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(lArr);
                return;
            }
        }
        vMeth1_check_sum += i9 + s1 + i10 + i11 + by + i12 + i13 + i14 + i15 + (b1 ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(lArr);
    }

    public void vMeth(long l) {

        double d=2.107395;
        int i16=-25;

        d = 1;
        while (++d < 285) {
            vMeth1();
            i16 >>= i16;
        }
        Test0475.instanceCount /= (l | 1);
        i16 += i16;
        vMeth_check_sum += l + Double.doubleToLongBits(d) + i16;
    }

    public void mainTest(String[] strArr1) {

        int i=141;
        int i1=-12;
        int i2=65255;
        int i17=6;
        int i18=0;
        int i19=29238;
        int i20=-53853;
        int i21=-253;
        int i22=-58703;
        int i23=26044;
        int i24=63;
        int i25=-243;
        int[] iArr =new int[N];
        byte by1=-119;
        float f1=-66.233F;

        FuzzerUtils.init(iArr, -13);

        Test0475.instanceCount = (iArr[(i >>> 1) % N] + (++i));
        switch (((((int) (Test0475.instanceCount * 24301)) >>> 1) % 3) + 20) {
        case 20:
            for (i1 = 2; i1 < 235; ++i1) {
                i2 = (int) ((i - (i1 >> Test0475.instanceCount)) - 54437);
                Test0475.instanceCount >>= (Test0475.instanceCount - (i *= i));
            }
            break;
        case 21:
            vMeth(Test0475.instanceCount);
            break;
        case 22:
            i = by1;
            Test0475.iFld <<= (int) Test0475.instanceCount;
        default:
            Test0475.iFld *= (int) Test0475.dFld;
        }
        for (i17 = 7; 122 > i17; ++i17) {
            boolean b2=false;
            i2 += i17;
            if (b2) continue;
            iArr = Test0475.iArrFld;
            i19 = 1;
            while (++i19 < 218) {
                for (i20 = 1; i20 < 1; ++i20) {
                    i21 -= (int) Test0475.instanceCount;
                    f1 += (-984341990981843552L + (i20 * i20));
                }
                i2 *= Test0475.iFld;
                Test0475.instanceCount = i17;
                Test0475.iFld += i19;
                Test0475.instanceCount += (((i19 * Test0475.sFld) + f1) - Test0475.instanceCount);
            }
            i18 *= (int) Test0475.dFld;
            for (i22 = 218; i22 > 13; i22--) {
                f1 += (((i22 * i21) + i2) - i17);
                try {
                    i = (219 % iArr[i22]);
                    i = (-138 / i22);
                    i = (i20 % Test0475.iFld);
                } catch (ArithmeticException a_e) {}
                i21 += (i22 - i22);
                i21 = i17;
            }
            for (i24 = 7; i24 < 218; i24++) {
                Test0475.dFld = Test0475.instanceCount;
                f1 += i;
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("by1 i17 i18 = " + by1 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("f1 i22 i23 = " + Float.floatToIntBits(f1) + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 iArr = " + i24 + "," + i25 + "," + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test0475.instanceCount Test0475.dFld Test0475.iFld = " + Test0475.instanceCount + "," +
                Double.doubleToLongBits(Test0475.dFld) + "," + Test0475.iFld);
        FuzzerUtils.out.println("Test0475.sFld Test0475.iArrFld = " + Test0475.sFld + "," + FuzzerUtils.checkSum(Test0475.iArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0475 _instance = new Test0475();
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
//DEBUG  lMeth ->  lMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}