// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:47 2023
public class Test0759 {

    public static final int N = 400;

    public static long instanceCount=2L;
    public static double dFld=-122.90414;
    public static volatile float fFld=1.288F;
    public static int iFld=-5;
    public int[] iArrFld =new int[N];
    public static int[] iArrFld1 =new int[N];
    public static volatile float[] fArrFld =new float[N];
    public long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test0759.iArrFld1, -232);
        FuzzerUtils.init(Test0759.fArrFld, 0.872F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i4, int i5) {

        byte by=-68;
        int i6=-36164, i7=-58218, i8=-29277, i9=-60945, i10=-13;
        boolean b=false;
        float f2=56.227F;
        short s=26354;

        i4 = (int) Test0759.instanceCount;
        by = (byte)-154;
        Test0759.instanceCount = 31;
        for (i6 = 6; i6 < 223; ++i6) {
            if (b) break;
            try {
                i7 = (-10520 % i5);
                Test0759.iArrFld1[i6 - 1] = (-52 % Test0759.iArrFld1[i6 - 1]);
                Test0759.iArrFld1[i6 + 1] = (i5 % -1284202857);
            } catch (ArithmeticException a_e) {}
            i7 = i5;
            i5 -= i4;
            i4 = i6;
        }
        for (f2 = 156; f2 > 1; f2--) {
            float f3=0.723F;
            f3 = i8;
            Test0759.iArrFld1[(-45030 >>> 1) % N] *= (int) f3;
            for (i9 = 1; 10 > i9; i9++) {
                s += (short)(i9 ^ i8);
                i4 -= 241;
            }
        }
        vMeth2_check_sum += i4 + i5 + by + i6 + i7 + (b ? 1 : 0) + Float.floatToIntBits(f2) + i8 + i9 + i10 + s;
    }

    public static void vMeth1(double d, float f1, int i3) {

        int i11=-8, i12=17, i13=6, i14=-1;

        i3 -= (int) (Test0759.instanceCount += i3);
        i3 -= (int)((Math.abs(i3) + (-72.2129 * i3)) * -3);
        i3 += (int) (((Test0759.instanceCount++) - (-240 - (i3 * Test0759.instanceCount))) - ((i3 * -93) * (-6 *
                (--Test0759.iArrFld1[(i3 >>> 1) % N]))));
        vMeth2(i3, 0);
        i3 <<= (int) Test0759.instanceCount;
        for (i11 = 20; i11 < 327; i11 += 2) {
            i3 = i11;
            i3 >>= -4;
            for (i13 = 1; i13 < 10; i13++) {
                byte by1=33;
                Test0759.instanceCount += Test0759.instanceCount;
                Test0759.iArrFld1 = Test0759.iArrFld1;
                Test0759.instanceCount ^= i12;
                by1 = (byte)i13;
                Test0759.instanceCount = i12;
                Test0759.instanceCount += (((i13 * f1) + i12) - i12);
            }
        }
        vMeth1_check_sum += Double.doubleToLongBits(d) + Float.floatToIntBits(f1) + i3 + i11 + i12 + i13 + i14;
    }

    public static void vMeth(float f) {

        int i2=30071;
        int i15=18;
        int i16=-230;
        int i17=-15791;
        int i18=209;
        int i19=163;
        int[] iArr =new int[N];
        boolean b1=true;
        short s1=3135;

        FuzzerUtils.init(iArr, 198);

        iArr[(34664 >>> 1) % N] <<= i2;
        vMeth1(Test0759.dFld, f, i2);
        Test0759.fArrFld[(i2 >>> 1) % N] *= 1.825F;
        for (i15 = 5; i15 < 307; i15++) {
            i2 *= (int) Test0759.dFld;
            if (b1) {
                for (i17 = 1; i17 < 5; i17++) {
                    i2 <<= i16;
                    if (b1) {
                        Test0759.instanceCount += Test0759.instanceCount;
                        b1 = b1;
                        i19 = 1;
                        do {
                            i2 += (i19 ^ s1);
                            if (i2 != 0) {
                                vMeth_check_sum += Float.floatToIntBits(f) + i2 + i15 + i16 + i17 + i18 + (b1 ? 1 : 0)
                                    + i19 + s1 + FuzzerUtils.checkSum(iArr);
                                return;
                            }
                            i16 += 12036;
                        } while (++i19 < 2);
                    }
                }
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f) + i2 + i15 + i16 + i17 + i18 + (b1 ? 1 : 0) + i19 + s1 +
            FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i=63190, i1=14, i20=-15352, i21=32, i22=-85, i23=38467;
        float f4=-6.282F;
        boolean b2=false;
        byte by2=-18;

        for (i = 3; i < 238; ++i) {
            iArrFld[i + 1] = i;
            vMeth(Test0759.fFld);
            f4 = 1;
            while (++f4 < 107) {
                i1 = (int) Test0759.instanceCount;
                i1 *= (int)f4;
                Test0759.instanceCount += (long) (((f4 * f4) + Test0759.instanceCount) - i);
                i1 = i;
            }
            for (i20 = 4; i20 < 107; i20++) {
                for (i22 = 1; i22 < 2; ++i22) {
                    b2 = b2;
                    i23 += (int) Test0759.instanceCount;
                    if (b2) break;
                    iArrFld = Test0759.iArrFld1;
                    Test0759.instanceCount += by2;
                    i21 += i;
                    if (b2) {
                        lArrFld[i20] = by2;
                        Test0759.iArrFld1[i22 + 1] += i23;
                        if (b2) break;
                    } else if (b2) {
                        Test0759.instanceCount += i22;
                        try {
                            i21 = (i23 % i1);
                            i1 = (Test0759.iArrFld1[i + 1] % 14907);
                            i1 = (i23 / i);
                        } catch (ArithmeticException a_e) {}
                        i1 += i23;
                    } else if (b2) {
                        Test0759.instanceCount *= i1;
                        switch ((i % 2) + 37) {
                        case 37:
                            Test0759.fFld *= i21;
                            i23 = -36;
                            i23 <<= (int)4L;
                            Test0759.iArrFld1[i - 1] >>= (int) 1868535603L;
                            break;
                        case 38:
                            by2 += (byte) Test0759.instanceCount;
                            break;
                        default:
                            Test0759.iFld >>= i20;
                        }
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 f4 = " + i + "," + i1 + "," + Float.floatToIntBits(f4));
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 b2 by2 = " + i23 + "," + (b2 ? 1 : 0) + "," + by2);

        FuzzerUtils.out.println("Test0759.instanceCount Test0759.dFld Test0759.fFld = " + Test0759.instanceCount + "," +
                Double.doubleToLongBits(Test0759.dFld) + "," + Float.floatToIntBits(Test0759.fFld));
        FuzzerUtils.out.println("Test0759.iFld iArrFld Test0759.iArrFld1 = " + Test0759.iFld + "," + FuzzerUtils.checkSum(iArrFld)
                + "," + FuzzerUtils.checkSum(Test0759.iArrFld1));
        FuzzerUtils.out.println("Test0759.fArrFld lArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0759.fArrFld))
            + "," + FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0759 _instance = new Test0759();
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