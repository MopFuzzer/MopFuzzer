// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:14 2023
public class Test0041 {

    public static final int N = 400;

    public static long instanceCount=-3965549202806142864L;
    public static volatile float fFld=60.1011F;
    public double dFld=71.129597;
    public static volatile boolean bFld=true;
    public static int[][] iArrFld =new int[N][N];

    static {
        FuzzerUtils.init(Test0041.iArrFld, 4);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long lMeth1_check_sum = 0;

    public static long lMeth1(long l1) {

        double d=1.32374, d1=-1.93106;
        int i3=-10, i4=105, i5=49386, i6=-21, i7=-13, i8=0, i9=-3, i10=-63, i11=9;
        float f=2.172F;
        boolean b=true;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -10L);

        for (d = 13; d < 382; ++d) {
            for (i4 = 1; 5 > i4; i4++) {
                i3 = i5;
                for (i6 = 1; i6 < 2; i6++) {
                    i7 = (int)f;
                    i7 -= i4;
                }
                Test0041.iArrFld[i4 - 1] = Test0041.iArrFld[i4];
                i3 -= i7;
            }
            for (i8 = 1; i8 < 5; i8++) {
                b = b;
                for (i10 = i8; 2 > i10; ++i10) {
                    i3 += i10;
                    lArr = lArr;
                    d1 = Test0041.instanceCount;
                    i9 += i10;
                }
            }
        }
        long meth_res = l1 + Double.doubleToLongBits(d) + i3 + i4 + i5 + i6 + i7 + Float.floatToIntBits(f) + i8 + i9 +
            (b ? 1 : 0) + i10 + i11 + Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(lArr);
        lMeth1_check_sum += meth_res;
        return (long)meth_res;
    }

    public static long lMeth(int i1, long l, int i2) {

        int i12=-51739, i13=59, i14=-4, i15=-11, i16=-43545;
        boolean b1=false;
        float[] fArr =new float[N];

        FuzzerUtils.init(fArr, 1.197F);

        lMeth1(l);
        i2 = i2;
        for (i12 = 9; i12 < 277; ++i12) {
            l -= i12;
            b1 = b1;
            if (true) {
                i2 = (int) Test0041.instanceCount;
            }
            i2 += (i12 * i12);
            for (i14 = 1; i14 < 6; ++i14) {
                i16 = 1;
                do {
                    i2 -= (int)l;
                    Test0041.iArrFld[i12][i16] += i16;
                } while (++i16 < 2);
            }
            i1 <<= i15;
        }
        l = i2;
        fArr[(i12 >>> 1) % N] += Test0041.fFld;
        long meth_res = i1 + l + i2 + i12 + i13 + (b1 ? 1 : 0) + i14 + i15 + i16 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i) {

        int i17=10, i18=-164, i19=71, i20=172, i21=-1, i22=-207, i23=-9;
        short s=-24915;
        boolean b2=false;

        lMeth(i, Test0041.instanceCount, i);
        for (i17 = 12; i17 < 330; ++i17) {
            i = s;
            i18 -= s;
            i18 += (i17 | (long) Test0041.fFld);
            Test0041.iArrFld[i17][i17] = i17;
            if (b2) break;
        }
        for (i19 = 8; 137 > i19; ++i19) {
            if (b2) continue;
        }
        i21 = 1;
        do {
            Test0041.instanceCount = i21;
            for (i22 = 1; i22 < 6; ++i22) {
                i20 *= (int) Test0041.instanceCount;
                i = i21;
                i20 = i21;
            }
        } while (++i21 < 297);
        vMeth_check_sum += i + i17 + i18 + s + (b2 ? 1 : 0) + i19 + i20 + i21 + i22 + i23;
    }

    public void mainTest(String[] strArr1) {

        int i24=152, i25=-23337, i26=-58184, i27=36993, i28=-3;
        float f1=120.428F;
        long l2=-4L;
        short s1=11631;

        vMeth(i24);
        Test0041.instanceCount *= -126;
        i24 = (int) Test0041.fFld;
        i24 = (int) Test0041.instanceCount;
        Test0041.iArrFld[(i24 >>> 1) % N][(i24 >>> 1) % N] *= (int) dFld;
        i24 *= i24;
        for (f1 = 1; f1 < 150; ++f1) {
            i26 = 1;
            while (++i26 < 168) {
                Test0041.instanceCount += (5L + (i26 * i26));
                try {
                    i25 = (-61260 % i24);
                    i25 = (i27 / 57443);
                    i25 = (i27 % 12873);
                } catch (ArithmeticException a_e) {}
                i24 += (i26 * i26);
                for (l2 = 1; l2 < 1; l2++) {
                    byte by=70;
                    i28 = s1;
                    i25 >>= i27;
                    i27 -= i28;
                    Test0041.fFld += by;
                    Test0041.instanceCount += (((l2 * i27) + s1) - i25);
                    Test0041.fFld += (float) 88.123337;
                    switch ((((i28 >>> 1) % 7) * 5) + 34) {
                    case 46:
                        i25 = by;
                        i24 += (int) (l2 * Test0041.instanceCount);
                        try {
                            i25 = (i28 / Test0041.iArrFld[(int) (f1 + 1)][(int) (l2 - 1)]);
                            i28 = (i24 / -187);
                            i24 = (-113 % Test0041.iArrFld[(int) (f1 + 1)][(int) (l2)]);
                        } catch (ArithmeticException a_e) {}
                        i28 -= (int)dFld;
                        break;
                    case 65:
                        Test0041.instanceCount += (l2 ^ (long) Test0041.fFld);
                        Test0041.instanceCount -= i24;
                        if (Test0041.bFld) break;
                        break;
                    case 39:
                        try {
                            i28 = (i24 % -13);
                            i25 = (i26 % -1753040113);
                            i24 = (-75 / i25);
                        } catch (ArithmeticException a_e) {}
                        Test0041.instanceCount -= (long) 38.107182;
                        i27 += (-29432 + (l2 * l2));
                        i25 *= (int)42.76359;
                        break;
                    case 44:
                        s1 -= (short)i28;
                    case 37:
                        Test0041.instanceCount -= i24;
                    case 48:
                        i24 += (int)14.647F;
                        break;
                    case 61:
                        Test0041.iArrFld[(int) (l2 - 1)][i26 + 1] = i24;
                    default:
                        i24 = i24;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i24 f1 i25 = " + i24 + "," + Float.floatToIntBits(f1) + "," + i25);
        FuzzerUtils.out.println("i26 i27 l2 = " + i26 + "," + i27 + "," + l2);
        FuzzerUtils.out.println("i28 s1 = " + i28 + "," + s1);

        FuzzerUtils.out.println("Test0041.instanceCount Test0041.fFld dFld = " + Test0041.instanceCount + "," +
                Float.floatToIntBits(Test0041.fFld) + "," + Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("Test0041.bFld Test0041.iArrFld = " + (Test0041.bFld ? 1 : 0) + "," +
                FuzzerUtils.checkSum(Test0041.iArrFld));

        FuzzerUtils.out.println("lMeth1_check_sum: " + lMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0041 _instance = new Test0041();
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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  lMeth1 ->  lMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
