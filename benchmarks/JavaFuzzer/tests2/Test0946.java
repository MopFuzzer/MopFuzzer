// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:56 2023
public class Test0946 {

    public static final int N = 400;

    public static long instanceCount=-4423006431075840602L;
    public static float fFld=-2.233F;
    public static boolean bFld=false;
    public short sFld=4096;
    public static float[] fArrFld =new float[N];
    public int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0946.fArrFld, -100.59F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i9=-10, i10=155;

        for (i9 = 6; i9 < 300; ++i9) {
            i10 += (((i9 * Test0946.fFld) + Test0946.fFld) - Test0946.fFld);
            i10 += (int) Test0946.instanceCount;
            i10 = i9;
            Test0946.fFld = -4;
            i10 = i9;
            if (i9 != 0) {
                vMeth2_check_sum += i9 + i10;
                return;
            }
            i10 >>= -51635;
            Test0946.instanceCount += -26;
            i10 += (int) Test0946.fFld;
        }
        vMeth2_check_sum += i9 + i10;
    }

    public static void vMeth1(int i6, int i7, long l1) {

        float f1=38.70F;
        int i8=20;
        int i11=-28;
        int i12=200;
        int i13=-24;
        int i14=168;
        int i15=61;
        int i16=-11;
        int i17=56785;
        int[] iArr1 =new int[N];
        short s=-14245;
        double d1=72.9069;

        FuzzerUtils.init(iArr1, 1);

        for (f1 = 6; f1 < 215; ++f1) {
            vMeth2();
            s += (short)(((f1 * i6) + i6) - i6);
            i8 = (int)d1;
            for (i11 = 1; i11 < 8; ++i11) {
                i13 = 1;
                do {
                    i8 = i11;
                    s -= (short)-7L;
                } while (++i13 < 2);
                for (i14 = 1; 2 > i14; i14++) {
                    if (i7 != 0) {
                        vMeth1_check_sum += i6 + i7 + l1 + Float.floatToIntBits(f1) + i8 + s +
                            Double.doubleToLongBits(d1) + i11 + i12 + i13 + i14 + i15 + i16 + i17 +
                            FuzzerUtils.checkSum(iArr1);
                        return;
                    }
                    l1 *= i12;
                    iArr1[i14 - 1] *= s;
                }
                for (i16 = 1; i16 < 2; i16++) {
                    Test0946.fArrFld[i16] = i6;
                    iArr1[i16] -= -14326;
                }
            }
        }
        vMeth1_check_sum += i6 + i7 + l1 + Float.floatToIntBits(f1) + i8 + s + Double.doubleToLongBits(d1) + i11 + i12
            + i13 + i14 + i15 + i16 + i17 + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(float f, long l, int i1) {

        int i2=-106;
        int i3=-3855;
        int i4=-64391;
        int i5=68;
        int i18=-1520;
        int i19=-2;
        int[] iArr =new int[N];
        double d=2.6713;
        short s1=24506;
        byte[] byArr =new byte[N];

        FuzzerUtils.init(iArr, 21);
        FuzzerUtils.init(byArr, (byte)-55);

        try {
            for (i2 = 5; i2 < 327; ++i2) {
                d *= (--iArr[i2]);
                iArr = (iArr = (iArr = iArr));
                for (i4 = 1; 5 > i4; ++i4) {
                    vMeth1(i4, i3, Test0946.instanceCount);
                    for (i18 = 1; i18 < 2; ++i18) {
                        iArr[i18] *= -58181;
                        iArr[i18 + 1] = s1;
                        iArr[i4 - 1] = i1;
                        iArr[i4 + 1] -= (int)-4L;
                        Test0946.instanceCount = i1;
                        if (Test0946.bFld) break;
                        i19 += (i18 - f);
                    }
                }
                Test0946.instanceCount = Test0946.instanceCount;
            }
        }
        catch (ArithmeticException exc1) {
            f = (float)d;
        }
        finally {
            d += -26419L;
        }
        vMeth_check_sum += Float.floatToIntBits(f) + l + i1 + i2 + i3 + Double.doubleToLongBits(d) + i4 + i5 + i18 +
            i19 + s1 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(byArr);
    }

    public void mainTest(String[] strArr1) {

        int i=-5, i20=-12, i21=0, i22=3449, i23=-7, i24=-9, i25=187, i26=162, i27=-13;
        byte by1=105;
        boolean[] bArr =new boolean[N];

        FuzzerUtils.init(bArr, false);

        Test0946.fFld += Test0946.instanceCount;
        bArr = (bArr = (bArr = (bArr = bArr)));
        i = 1;
        while (++i < 326) {
            vMeth(0.768F, Test0946.instanceCount, i);
            for (i20 = 3; i20 < 77; i20++) {
                iArrFld[i20 - 1] -= (int)-782297013L;
                for (i22 = 2; i22 > 1; i22--) {
                    iArrFld[i22 + 1] = by1;
                    Test0946.fFld += (i22 * i22);
                    sFld = (short) Test0946.instanceCount;
                    Test0946.fFld *= i23;
                    i23 += (i22 - Test0946.instanceCount);
                    iArrFld[i + 1] -= i22;
                    Test0946.instanceCount += (((i22 * i21) + i23) - i23);
                    i23 += (int)1448838971L;
                    sFld += (short)61217;
                }
                Test0946.bFld = Test0946.bFld;
                Test0946.instanceCount = i22;
            }
            if (Test0946.bFld) {
                for (i24 = 3; i24 < 77; i24++) {
                    Test0946.instanceCount += by1;
                    iArrFld[i] &= (int) Test0946.instanceCount;
                }
            }
            Test0946.fFld *= i25;
            for (i26 = 3; 77 > i26; ++i26) {
                Test0946.instanceCount -= (long) Test0946.fFld;
                Test0946.instanceCount += i26;
                Test0946.instanceCount += i26;
                i27 ^= 6;
            }
        }
        i23 -= i;
        iArrFld[(i22 >>> 1) % N] <<= i;

        FuzzerUtils.out.println("i i20 i21 = " + i + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 by1 = " + i22 + "," + i23 + "," + by1);
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 bArr = " + i27 + "," + FuzzerUtils.checkSum(bArr));

        FuzzerUtils.out.println("Test0946.instanceCount Test0946.fFld Test0946.bFld = " + Test0946.instanceCount + "," +
                Float.floatToIntBits(Test0946.fFld) + "," + (Test0946.bFld ? 1 : 0));
        FuzzerUtils.out.println("sFld Test0946.fArrFld iArrFld = " + sFld + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0946.fArrFld)) + "," + FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0946 _instance = new Test0946();
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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
