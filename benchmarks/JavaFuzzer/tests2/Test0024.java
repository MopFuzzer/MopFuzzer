// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:12 2023
public class Test0024 {

    public static final int N = 400;

    public static long instanceCount=-128L;
    public float fFld=0.274F;
    public static byte byFld=36;
    public static boolean bFld=false;
    public static float fFld1=-83.291F;
    public static double dFld=-76.18460;
    public static int iFld=36639;
    public static boolean bFld1=true;
    public static double dFld1=0.81415;
    public int[] iArrFld =new int[N];
    public static int[] iArrFld1 =new int[N];

    static {
        FuzzerUtils.init(Test0024.iArrFld1, 7);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static int iMeth(int i7) {


        i7 = (i7--);
        long meth_res = i7;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth2(int i13, int i14, int i15) {

        float f=2.626F;
        int i16=78;
        int i17=10;
        int i18=-6;
        int i19=216;
        int i20=-215;
        int i21=-2;
        int[] iArr =new int[N];
        double d=-45.15112;
        short s=27520;
        byte[] byArr =new byte[N];

        FuzzerUtils.init(iArr, 15045);
        FuzzerUtils.init(byArr, (byte)-95);

        Test0024.instanceCount += Test0024.instanceCount;
        f += Test0024.instanceCount;
        for (i16 = 14; i16 < 255; i16++) {
            iArr[i16] <<= 7251;
            i18 = 1;
            do {
                byArr[i16] += (byte)i15;
                if (Test0024.bFld) break;
                for (i19 = 1; 1 > i19; i19++) {
                    Test0024.byFld -= (byte) i21;
                    Test0024.instanceCount ^= 12417;
                    d = Test0024.instanceCount;
                    i14 ^= i16;
                }
                i14 += (i18 - i20);
                Test0024.instanceCount -= s;
                i15 &= i13;
            } while (++i18 < 7);
        }
        vMeth2_check_sum += i13 + i14 + i15 + Float.floatToIntBits(f) + i16 + i17 + i18 + i19 + i20 + i21 +
            Double.doubleToLongBits(d) + s + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(byArr);
    }

    public static void vMeth1() {

        int i12=254, i22=-50861, i23=8, i24=-58768;
        long l=2120843745L;
        double[] dArr =new double[N];

        FuzzerUtils.init(dArr, -20.21817);

        i12 += ((-(i12++)) + (++Test0024.byFld));
        vMeth2(i12, -9, 15888);
        Test0024.fFld1 = 25;
        i12 *= (int) Test0024.instanceCount;
        i22 = 1;
        while (++i22 < 243) {
            if (Test0024.bFld) {
                i12 = -42534;
                Test0024.iArrFld1[i22 + 1] >>>= 92;
                for (i23 = i22; i23 < 7; i23++) {
                    Test0024.iArrFld1[i22] += (int) l;
                    i24 = i12;
                    i12 += i23;
                    Test0024.iArrFld1[i22 - 1] -= i23;
                    Test0024.bFld = Test0024.bFld;
                    dArr[i23] = 0.722F;
                }
            } else {
                Test0024.iArrFld1[i22] += i22;
            }
        }
        vMeth1_check_sum += i12 + i22 + i23 + i24 + l + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth(int i10, int i11) {

        int i25=35203, i26=-202, i27=-10, i28=-4, i29=148, i30=-3;

        vMeth1();
        i25 = 1;
        while (++i25 < 261) {
            i26 -= i26;
            i27 = 1;
            while (++i27 < 6) {
                for (i28 = 1; 1 > i28; i28++) {
                    Test0024.iArrFld1[i27 + 1] -= 9;
                    i11 += (int) Test0024.instanceCount;
                    Test0024.byFld += (byte) (-28748 + (i28 * i28));
                    Test0024.dFld = i29;
                }
                Test0024.instanceCount -= (long) Test0024.fFld1;
                i30 = i10;
                Test0024.instanceCount = i26;
                Test0024.instanceCount += i27;
                if (Test0024.bFld) break;
                Test0024.iArrFld1[i27 + 1] <<= (int) Test0024.instanceCount;
            }
        }
        vMeth_check_sum += i10 + i11 + i25 + i26 + i27 + i28 + i29 + i30;
    }

    public void mainTest(String[] strArr1) {

        int i=-44;
        int i1=-244;
        int i2=39541;
        int i3=-50390;
        int i4=-219;
        int i5=-39;
        int i6=-6;
        int i8=2;
        int i9=148;
        int[] iArr1 =new int[N];
        short s1=18780;
        float[] fArr =new float[N];

        FuzzerUtils.init(fArr, 0.306F);
        FuzzerUtils.init(iArr1, -61135);

        for (i = 126; i > 7; --i) {
            iArrFld[i] -= (int)(fArr[i - 1]++);
            for (i2 = 5; i2 < 211; i2++) {
                Test0024.instanceCount = (long) (((fFld += -9L) - Float.intBitsToFloat(-46809)) + i3);
            }
        }
        i4 = 1;
        do {
            switch (((i4 % 5) * 5) + 37) {
            case 44:
                i3 += (((i4 * Test0024.instanceCount) + Test0024.instanceCount) - i3);
                for (i5 = 186; 1 < i5; i5 -= 3) {
                    iMeth((int) (i5 * (--Test0024.instanceCount)));
                    for (i8 = 1; i8 < 4; i8++) {
                        vMeth(i1, i8);
                        s1 *= (short)i2;
                        if (Test0024.bFld1) {
                            i9 &= 2;
                            Test0024.dFld = -39433;
                        } else if (Test0024.bFld) {
                            switch (((i >>> 1) % 6) + 58) {
                            case 58:
                                try {
                                    i9 = (i1 / 251);
                                    i6 = (255 % i2);
                                    i6 = (iArr1[i4] / 63215);
                                } catch (ArithmeticException a_e) {}
                                i9 = 12;
                                iArr1[i4] = i2;
                                i3 += -61558;
                                break;
                            case 59:
                                i1 *= -8;
                                i9 = Test0024.byFld;
                                switch (((i4 % 5) * 5) + 67) {
                                case 78:
                                    i6 -= (int) Test0024.fFld1;
                                    Test0024.fFld1 -= i8;
                                case 71:
                                    Test0024.instanceCount += i8;
                                    Test0024.iArrFld1[i8 - 1] -= i2;
                                    break;
                                case 68:
                                    i9 = Test0024.byFld;
                                    Test0024.instanceCount *= 8;
                                    break;
                                case 75:
                                    i6 ^= Test0024.iFld;
                                case 70:
                                    iArr1[i4] += i;
                                }
                                break;
                            case 60:
                                i6 += (int) Test0024.instanceCount;
                                break;
                            case 61:
                                Test0024.instanceCount = -114;
                                break;
                            case 62:
                                iArrFld[i8] -= (int)2263525739L;
                                break;
                            case 63:
                                Test0024.byFld *= (byte) -40L;
                                break;
                            }
                        } else {
                            i1 += (int) Test0024.instanceCount;
                        }
                    }
                }
                break;
            case 53:
                Test0024.iFld /= (int) (i6 | 1);
                break;
            case 55:
                if (Test0024.bFld1) continue;
                break;
            case 50:
                fFld += i;
                break;
            case 54:
                Test0024.dFld1 = 0.127674;
                break;
            default:
                Test0024.iFld = i5;
            }
        } while (++i4 < 135);

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i4 i5 = " + i3 + "," + i4 + "," + i5);
        FuzzerUtils.out.println("i6 i8 i9 = " + i6 + "," + i8 + "," + i9);
        FuzzerUtils.out.println("s1 fArr iArr1 = " + s1 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            "," + FuzzerUtils.checkSum(iArr1));

        FuzzerUtils.out.println("Test0024.instanceCount fFld Test0024.byFld = " + Test0024.instanceCount + "," +
                Float.floatToIntBits(fFld) + "," + Test0024.byFld);
        FuzzerUtils.out.println("Test0024.bFld Test0024.fFld1 Test0024.dFld = " + (Test0024.bFld ? 1 : 0) + "," +
                Float.floatToIntBits(Test0024.fFld1) + "," + Double.doubleToLongBits(Test0024.dFld));
        FuzzerUtils.out.println("Test0024.iFld Test0024.bFld1 Test0024.dFld1 = " + Test0024.iFld + "," + (Test0024.bFld1 ? 1 : 0) + "," +
                Double.doubleToLongBits(Test0024.dFld1));
        FuzzerUtils.out.println("iArrFld Test0024.iArrFld1 = " + FuzzerUtils.checkSum(iArrFld) + "," +
                FuzzerUtils.checkSum(Test0024.iArrFld1));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0024 _instance = new Test0024();
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}