// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:46 2023
public class Test0721 {

    public static final int N = 400;

    public static long instanceCount=-43L;
    public static volatile int iFld=-24502;
    public volatile float fFld=68.454F;
    public static byte byFld=-110;
    public static double dFld=2.99016;
    public static boolean bFld=true;
    public volatile int[] iArrFld =new int[N];

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth() {

        float f1=-2.274F;
        int i10=45;
        int[] iArr1 =new int[N];
        byte[] byArr =new byte[N];

        FuzzerUtils.init(byArr, (byte)-90);
        FuzzerUtils.init(iArr1, -156);

        Test0721.instanceCount += (long) ((++byArr[(Test0721.iFld >>> 1) % N]) - f1);
        for (int i9 : iArr1) {
            i9 |= Test0721.iFld;
        }
        i10 = 1;
        while (++i10 < 214) {
            iArr1[i10] -= i10;
        }
        vMeth_check_sum += Float.floatToIntBits(f1) + i10 + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth2(long l2, int i15, int i16) {

        long l3=5372849277604868421L;
        int i17=-3;
        int i18=102;
        int i19=-211;
        int i20=-58106;
        int[] iArr2 =new int[N];
        float f2=-74.233F;
        boolean b1=false;

        FuzzerUtils.init(iArr2, -6);

        i15 = (int)l3;
        Test0721.iFld = 63;
        i17 = 1;
        do {
            i18 = 4;
            do {
                Test0721.byFld += (byte) 245;
                Test0721.instanceCount -= l2;
                f2 = -80;
                Test0721.dFld += l3;
                iArr2[i17 - 1] = i16;
                i16 *= i17;
                Test0721.iFld >>= i18;
                for (i19 = 1; i19 > 1; i19 -= 2) {
                    if (b1) {
                        i20 *= i18;
                        if (i19 != 0) {
                            vMeth2_check_sum += l2 + i15 + i16 + l3 + i17 + i18 + Float.floatToIntBits(f2) + i19 + i20
                                + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr2);
                            return;
                        }
                    } else {
                        i15 >>>= -10;
                    }
                }
            } while (--i18 > 0);
        } while (++i17 < 395);
        vMeth2_check_sum += l2 + i15 + i16 + l3 + i17 + i18 + Float.floatToIntBits(f2) + i19 + i20 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr2);
    }

    public static void vMeth1(int i13, int i14, double d) {

        long l1=-2L;
        int i21=-11, i22=-12, i23=-8351, i24=154, i25=215, i26=52952;
        float f3=0.347F;
        byte[] byArr1 =new byte[N];

        FuzzerUtils.init(byArr1, (byte)-81);

        Test0721.instanceCount += (i13 = (int) l1);
        vMeth2(l1, 109, i14);
        if (false) {
            l1 += Test0721.iFld;
            for (i21 = 5; i21 < 233; i21++) {
                Test0721.instanceCount = l1;
                Test0721.iFld >>= (int) -4L;
                byArr1[i21 + 1] += (byte) Test0721.iFld;
                for (i23 = 1; 7 > i23; ++i23) {
                    i22 %= (int)(i24 | 1);
                    for (i25 = 2; i25 > 1; i25--) {
                        d = 54363L;
                        i13 += -8893;
                        f3 += (i25 * i13);
                        i22 = (int) Test0721.dFld;
                    }
                }
            }
        }
        vMeth1_check_sum += i13 + i14 + Double.doubleToLongBits(d) + l1 + i21 + i22 + i23 + i24 + i25 + i26 +
            Float.floatToIntBits(f3) + FuzzerUtils.checkSum(byArr1);
    }

    public static int iMeth(float f, long l, int i4) {

        int i5=-9;
        int i6=31430;
        int i7=-60248;
        int i8=-14080;
        int i11=106;
        int i12=54;
        int i27=0;
        int i28=-57549;
        int[] iArr =new int[N];
        boolean b=true;
        byte by1=-61;
        float[] fArr =new float[N];

        FuzzerUtils.init(iArr, -7541);
        FuzzerUtils.init(fArr, 0.752F);

        for (i5 = 6; i5 < 225; i5++) {
            for (i7 = 1; 7 > i7; ++i7) {
                if (b = (i4 >= (Float.intBitsToFloat(i5) * (iArr[i5]++)))) continue;
                vMeth();
                for (i11 = 1; i11 < 2; i11 += 2) {
                    f = fArr[i5 + 1];
                    l = by1;
                }
                try {
                    i8 = (-30351 / iArr[i5 + 1]);
                    Test0721.iFld = (iArr[i5] / 16575);
                    i12 = (Test0721.iFld / i8);
                } catch (ArithmeticException a_e) {}
                if (i11 != 0) {
                }
                vMeth1(126, 11, Test0721.dFld);
                for (i27 = 1; i27 < 2; i27++) {
                    Test0721.instanceCount = Test0721.instanceCount;
                    iArr[i5 + 1] = i12;
                    i6 = i8;
                    l = (long)f;
                }
            }
        }
        long meth_res = Float.floatToIntBits(f) + l + i4 + i5 + i6 + i7 + i8 + (b ? 1 : 0) + i11 + i12 + by1 + i27 +
            i28 + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-163, i1=-114, i2=148, i3=-63576, i29=22763, i30=5;
        byte by=-70;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, 88L);

        iArrFld[(i >>> 1) % N] = (int) (i + Math.max(i - 12, i - Test0721.iFld));
        i -= (-(i--));
        Test0721.instanceCount >>= Test0721.instanceCount;
        by = (byte) ((fFld--) + ((iArrFld[(i >>> 1) % N]--) - (Test0721.instanceCount--)));
        for (i1 = 6; i1 < 176; i1 += 2) {
            i -= (iArrFld[i1] + i1);
            iArrFld[i1] += (int)(lArr[i1 - 1]++);
            i3 = 1;
            do {
                by %= (byte)(i3 | 1);
                Test0721.iFld %= (int) ((++i2) | 1);
                iMeth(fFld, Test0721.instanceCount, i);
                iArrFld[i3] &= i2;
                for (i29 = i3; i29 < 1; i29++) {
                    iArrFld[i1 + 1] = (int) Test0721.instanceCount;
                    Test0721.byFld = (byte) i30;
                    switch (((-14 >>> 1) % 2) + 103) {
                    case 103:
                        Test0721.instanceCount += (long) Test0721.dFld;
                        break;
                    case 104:
                        i2 += (i29 ^ i30);
                        Test0721.instanceCount = i29;
                        i2 >>= i29;
                        iArrFld[i29 - 1] *= i30;
                    default:
                        fFld -= -636632768L;
                        Test0721.instanceCount += (i29 * i29);
                        iArrFld[i1 + 1] *= i1;
                    }
                    Test0721.bFld = Test0721.bFld;
                    iArrFld[i3] <<= (int) Test0721.instanceCount;
                }
                Test0721.iFld = i2;
                Test0721.dFld = Test0721.instanceCount;
                iArrFld[i3] ^= i1;
                Test0721.dFld += i;
            } while (++i3 < 295);
        }

        FuzzerUtils.out.println("i by i1 = " + i + "," + by + "," + i1);
        FuzzerUtils.out.println("i2 i3 i29 = " + i2 + "," + i3 + "," + i29);
        FuzzerUtils.out.println("i30 lArr = " + i30 + "," + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test0721.instanceCount Test0721.iFld fFld = " + Test0721.instanceCount + "," + Test0721.iFld + "," +
            Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("Test0721.byFld Test0721.dFld Test0721.bFld = " + Test0721.byFld + "," +
                Double.doubleToLongBits(Test0721.dFld) + "," + (Test0721.bFld ? 1 : 0));
        FuzzerUtils.out.println("iArrFld = " + FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0721 _instance = new Test0721();
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
//DEBUG  vMeth1 ->  vMeth1 iMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
