// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:25 2023
public class Test0281 {

    public static final int N = 400;

    public static long instanceCount=-8605022541173802055L;
    public static float fFld=25.931F;
    public static short sFld=25034;
    public static int iFld=134;
    public boolean bFld=true;
    public static int[] iArrFld =new int[N];
    public static float[] fArrFld =new float[N];

    static {
        FuzzerUtils.init(Test0281.iArrFld, 63490);
        FuzzerUtils.init(Test0281.fArrFld, 0.991F);
    }

    public static long dMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i3=-11;
        int i4=6;
        int i5=-47452;
        int i6=0;
        int i7=3;
        int[] iArr =new int[N];
        boolean b=false;
        boolean[] bArr =new boolean[N];

        FuzzerUtils.init(iArr, 33523);
        FuzzerUtils.init(bArr, false);

        for (i3 = 8; i3 < 203; i3++) {
            for (i5 = 1; i5 < 8; i5++) {
                Test0281.fFld += i6;
                i7 = 1;
                do {
                    i6 += i7;
                    i6 >>= i6;
                    i6 += -3;
                } while (++i7 < 2);
                Test0281.instanceCount = Test0281.instanceCount;
            }
            i6 = i4;
        }
        i6 *= i3;
        for (int i8 : iArr) {
            i4 = i5;
            i8 += 6;
            i6 += -8010;
            bArr[(-12 >>> 1) % N] = b;
        }
        vMeth1_check_sum += i3 + i4 + i5 + i6 + i7 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(bArr);
    }

    public static void vMeth() {

        int i2=7, i9=153, i10=109, i11=-14, i12=252;
        double d=2.66413, d1=-1.74916;
        long l=50L;
        long[] lArr =new long[N];
        float f=121.38F;

        FuzzerUtils.init(lArr, -48033L);

        i2 = 375;
        do {
            vMeth1();
            Test0281.fFld = i2;
            for (d = i2; d < 8; ++d) {
                d1 = i9;
            }
            i9 = i2;
            for (l = 1; l < 8; ++l) {
                i10 = i9;
            }
            for (i11 = 1; i11 < 8; ++i11) {
                f = 1;
                do {
                    switch ((((i12 >>> 1) % 2) * 5) + 124) {
                    case 126:
                    case 127:
                        lArr[i11] /= (i9 | 1);
                    default:
                        i12 = (int)l;
                        i12 >>>= i11;
                    }
                    i12 = i11;
                } while (++f < 2);
            }
        } while ((i2 -= 2) > 0);
        vMeth_check_sum += i2 + Double.doubleToLongBits(d) + i9 + Double.doubleToLongBits(d1) + l + i10 + i11 + i12 +
            Float.floatToIntBits(f) + FuzzerUtils.checkSum(lArr);
    }

    public static double dMeth() {

        int i=-7, i1=49, i13=1, i14=7199, i15=219, i16=54600;
        byte by=-87;

        for (i = 1; i < 127; ++i) {
            boolean b1=false;
            Test0281.instanceCount += (-2 + (i * i));
            vMeth();
            Test0281.instanceCount += Test0281.instanceCount;
            if (b1) break;
            Test0281.fFld = i;
            for (i13 = 12; i13 > 1; i13--) {
                i1 += (((i13 * Test0281.fFld) + by) - i13);
                for (i15 = i; 2 > i15; ++i15) {
                    Test0281.instanceCount += (((i15 * i15) + Test0281.fFld) - Test0281.instanceCount);
                    i1 += (((i15 * i15) + i1) - Test0281.instanceCount);
                    Test0281.instanceCount += i15;
                    i14 += i15;
                    i14 >>= (int)-191520308L;
                }
            }
            i1 -= (int) Test0281.instanceCount;
        }
        long meth_res = i + i1 + i13 + i14 + by + i15 + i16;
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i17=-39, i18=-20461, i19=3, i20=14127, i21=-8, i22=-6, i23=-12, i24=113, i25=27618, i26=157, i27=-4;
        byte by1=-5;
        byte[][] byArr =new byte[N][N];
        double d2=2.21736;

        FuzzerUtils.init(byArr, (byte)113);

        Test0281.instanceCount -= (long) dMeth();
        byArr[(i17 >>> 1) % N][(i17 >>> 1) % N] <<= (byte)-47L;
        for (i18 = 210; i18 > 12; --i18) {
            for (i20 = 3; i20 < 127; i20 += 2) {
                i17 -= i20;
                i21 += (((i20 * i20) + Test0281.sFld) - i20);
                try {
                    i21 = (i17 % i21);
                    i17 = (Test0281.iFld / -15998);
                    Test0281.iArrFld[i20] = (Test0281.iArrFld[i18 + 1] / 22597);
                } catch (ArithmeticException a_e) {}
                i17 = 245;
                Test0281.fFld *= 3118884705369288154L;
                Test0281.sFld ^= (short) 19859;
                i17 &= (int) Test0281.instanceCount;
                i19 += (((i20 * i17) + i18) - i21);
                Test0281.instanceCount >>= i20;
            }
            Test0281.iArrFld[i18] -= (int) Test0281.fFld;
            if (bFld) break;
        }
        Test0281.instanceCount = Test0281.instanceCount;
        for (i22 = 4; i22 < 147; ++i22) {
            if (bFld) continue;
            for (i24 = 2; i24 < 175; ++i24) {
                Test0281.fArrFld[i22 + 1] *= i23;
                i17 >>>= 41341;
            }
            for (i26 = 2; i26 < 175; i26++) {
                Test0281.iArrFld[i26] *= (int) Test0281.instanceCount;
                if (bFld) continue;
                by1 *= (byte)i22;
                Test0281.instanceCount <<= i19;
                Test0281.iArrFld[i22 + 1] = i23;
                i27 = i21;
                if (bFld) continue;
                d2 -= d2;
            }
        }

        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 i27 by1 = " + i26 + "," + i27 + "," + by1);
        FuzzerUtils.out.println("d2 byArr = " + Double.doubleToLongBits(d2) + "," + FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test0281.instanceCount Test0281.fFld Test0281.sFld = " + Test0281.instanceCount + "," +
                Float.floatToIntBits(Test0281.fFld) + "," + Test0281.sFld);
        FuzzerUtils.out.println("Test0281.iFld bFld Test0281.iArrFld = " + Test0281.iFld + "," + (bFld ? 1 : 0) + "," +
                FuzzerUtils.checkSum(Test0281.iArrFld));
        FuzzerUtils.out.println("Test0281.fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0281.fArrFld)));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0281 _instance = new Test0281();
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
//DEBUG  dMeth ->  dMeth mainTest
//DEBUG  vMeth ->  vMeth dMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth dMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}