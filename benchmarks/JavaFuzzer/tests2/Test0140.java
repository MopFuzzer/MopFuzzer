// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:18 2023
public class Test0140 {

    public static final int N = 400;

    public static long instanceCount=73L;
    public static float fFld=-34.762F;
    public static short sFld=24581;
    public float[] fArrFld =new float[N];
    public static int[] iArrFld =new int[N];
    public volatile double[] dArrFld =new double[N];
    public static long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test0140.iArrFld, -155);
        FuzzerUtils.init(Test0140.lArrFld, 216L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(boolean b1, long l, int i8) {

        int i9=219, i10=-83, i11=-10, i12=58532, i13=18341;
        double d=118.4036;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, 249L);

        i8 = Test0140.sFld;
        i9 = 1;
        while (++i9 < 273) {
            lArr[i9] = i9;
        }
        switch (((i9 >>> 1) % 6) + 107) {
        case 107:
            i8 *= i9;
            for (i10 = 7; 136 > i10; ++i10) {
                if (b1) {
                    Test0140.iArrFld[i10] += (int) d;
                    d = 34092L;
                    d -= i8;
                    i11 %= (int)(l | 1);
                } else if (false) {
                    i11 += i11;
                    for (i12 = 1; i12 < 12; i12++) {
                        i11 = i13;
                        l += (105 + (i12 * i12));
                    }
                } else {
                    i8 -= (int)d;
                }
            }
            break;
        case 108:
            Test0140.iArrFld = Test0140.iArrFld;
            break;
        case 109:
            Test0140.instanceCount -= (long) Test0140.fFld;
            break;
        case 110:
            i8 = -32764;
        case 111:
            i13 = i10;
            break;
        case 112:
            Test0140.sFld -= Test0140.sFld;
        }
        vMeth1_check_sum += (b1 ? 1 : 0) + l + i8 + i9 + i10 + i11 + Double.doubleToLongBits(d) + i12 + i13 +
            FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(int i7) {

        boolean b2=false;
        int i14=235, i15=-54865, i16=0, i17=-12, i18=31528, i19=105, i20=-105;
        byte by=0;

        vMeth1(b2, -2211426128L, i7);
        i14 = 1;
        while (++i14 < 212) {
            for (i15 = 1; i15 < 8; i15++) {
                i16 = i14;
            }
            for (i17 = i14; 8 > i17; i17 += 2) {
                i18 = by;
                i16 *= i15;
                for (i19 = 1; i19 < 1; ++i19) {
                    Test0140.iArrFld = Test0140.iArrFld;
                }
                i7 &= i16;
                i18 += (i17 - i17);
                i7 = (int) Test0140.instanceCount;
                i20 -= i18;
                i18 *= -43;
                i16 += i18;
            }
        }
        vMeth_check_sum += i7 + (b2 ? 1 : 0) + i14 + i15 + i16 + i17 + i18 + by + i19 + i20;
    }

    public static int iMeth(boolean b) {

        int i6=23972;

        i6 += Math.max(i6, (int) ((36980 - (Test0140.fFld = i6)) % (Math.min(i6, 11) | 1)));
        vMeth(i6);
        long meth_res = (b ? 1 : 0) + i6;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=51895, i1=19660, i2=1, i3=2585, i4=136, i5=173, i21=72, i22=10606, i23=-228, i24=186;
        byte by1=-81;
        long l1=3875850600L;
        double d1=109.29966, d2=1.18977, d3=-24.60069;
        boolean b3=false;

        i *= (int)(--fArrFld[(i1 >>> 1) % N]);
        for (i2 = 22; 384 > i2; ++i2) {
            for (i4 = 1; 70 > i4; i4++) {
                i3 >>>= ((i >>= (Test0140.iArrFld[i2 - 1] *= i1)) - (iMeth(true) - by1));
                i5 += i4;
                i <<= Test0140.sFld;
            }
            if (b3) {
                for (l1 = i2; l1 < 70; l1++) {
                    i1 -= (int) Test0140.instanceCount;
                    dArrFld[(int)(l1 + 1)] -= -56358;
                }
                i += (i2 * i2);
                i3 += (int) Test0140.instanceCount;
            } else if (b3) {
                i21 = (int)l1;
            } else if (true) {
                d1 = 1;
                do {
                    if (true) break;
                } while (++d1 < 70);
                i1 >>= i1;
            } else {
                for (i22 = 4; i22 < 70; ++i22) {
                    i5 = Test0140.sFld;
                    Test0140.iArrFld[i2 - 1] = i1;
                    Test0140.lArrFld[i2] += i4;
                    for (d2 = 1; d2 < 2; d2++) {
                        d3 *= i24;
                        i24 += (int)-1157072232L;
                        i = (int)d2;
                        i = i21;
                        i -= i1;
                        switch ((i22 % 2) + 124) {
                        case 124:
                            i1 -= 16630;
                            Test0140.fFld = i22;
                            break;
                        case 125:
                            i += (int)-2.45813;
                            break;
                        default:
                            Test0140.iArrFld[(int) (d2 + 1)] = (int) Test0140.instanceCount;
                        }
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i4 i5 = " + i3 + "," + i4 + "," + i5);
        FuzzerUtils.out.println("by1 l1 i21 = " + by1 + "," + l1 + "," + i21);
        FuzzerUtils.out.println("d1 b3 i22 = " + Double.doubleToLongBits(d1) + "," + (b3 ? 1 : 0) + "," + i22);
        FuzzerUtils.out.println("i23 d2 i24 = " + i23 + "," + Double.doubleToLongBits(d2) + "," + i24);
        FuzzerUtils.out.println("d3 = " + Double.doubleToLongBits(d3));

        FuzzerUtils.out.println("Test0140.instanceCount Test0140.fFld Test0140.sFld = " + Test0140.instanceCount + "," +
                Float.floatToIntBits(Test0140.fFld) + "," + Test0140.sFld);
        FuzzerUtils.out.println("fArrFld Test0140.iArrFld dArrFld = " +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)) + "," + FuzzerUtils.checkSum(Test0140.iArrFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));
        FuzzerUtils.out.println("Test0140.lArrFld = " + FuzzerUtils.checkSum(Test0140.lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0140 _instance = new Test0140();
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