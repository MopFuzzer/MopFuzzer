// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:53 2023
public class Test0044 {

    public static final int N = 400;

    public static long instanceCount = -80L;
    public static volatile int iFld = 9;
    public static boolean bFld = true;
    public static short sFld = 26195;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;
    public float fFld = 1.498F;
    public int[] iArrFld = new int[N];

    public static void vMeth2() {

        float f = 47.855F;
        long l = -812793141L;
        int i5 = -12;
        int[] iArr = new int[N];
        boolean b = true;
        boolean[] bArr = new boolean[N];

        FuzzerUtils.init(iArr, 0);
        FuzzerUtils.init(bArr, false);

        iArr[(Test0044.iFld >>> 1) % N] -= Test0044.iFld;
        for (int i4 : iArr) {
            i4 *= Test0044.iFld;
            f = 1;
            do {
                iArr[(int) (f + 1)] -= (int) Test0044.instanceCount;
                l = 1;
                do {
                    i4 *= i4;
                    i5 += (int) l;
                    b = false;
                    i4 = -44876;
                    if (b) {
                        bArr[(int) (f)] = b;
                        iArr[(int) (l + 1)] *= i5;
                        vMeth2_check_sum += Float.floatToIntBits(f) + l + i5 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr)
                                + FuzzerUtils.checkSum(bArr);
                        return;
                    } else if (b) {
                        iArr[(int) (l)] += (int) f;
                        iArr[(int) (f)] = i4;
                    } else {
                        Test0044.instanceCount >>>= -6;
                    }
                } while (++l < 1);
            } while (++f < 4);
        }
        vMeth2_check_sum += Float.floatToIntBits(f) + l + i5 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr) +
                FuzzerUtils.checkSum(bArr);
    }

    public static void vMeth1(int i1) {

        int i2 = -58850;
        int i3 = 3;
        int i6 = -16;
        int i7 = 12;
        int[] iArr1 = new int[N];
        byte by = -62;
        boolean b1 = false;
        double[] dArr = new double[N];
        long[] lArr = new long[N];

        FuzzerUtils.init(dArr, 1.66737);
        FuzzerUtils.init(iArr1, 68);
        FuzzerUtils.init(lArr, 14127L);

        for (i2 = 10; i2 < 192; i2 += 2) {
            vMeth2();
            if (b1) {
                i6 = 1;
                do {
                    double d = -1.88520;
                    dArr[i6] -= d;
                    by += (byte) (i6 | Test0044.instanceCount);
                    i7 = 1;
                    do {
                        i1 = i1;
                        switch (((i3 >>> 1) % 2) + 60) {
                            case 60:
                                try {
                                    Test0044.iFld = (i1 % -201);
                                    iArr1[i2 + 1] = (iArr1[i6] / i6);
                                    iArr1[i2 + 1] = (i7 / -217);
                                } catch (ArithmeticException a_e) {
                                }
                                Test0044.iFld = -10;
                                Test0044.iFld %= (int) (Test0044.iFld | 1);
                            case 61:
                                lArr[i7 + 1] += (long) 1.12127;
                                i3 += i7;
                                Test0044.instanceCount += (i7 + i7);
                                break;
                        }
                    } while (++i7 < 1);
                } while (++i6 < 17);
            } else {
                by *= (byte) 29663;
            }
        }
        vMeth1_check_sum += i1 + i2 + i3 + i6 + by + i7 + (b1 ? 1 : 0) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr1) +
                FuzzerUtils.checkSum(lArr);
    }

    public static void main(String[] strArr) {

        try {
            Test0044 _instance = new Test0044();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void vMeth(int i) {

        long l1 = -4468L;

        vMeth1(i);
        iArrFld[(-11 >>> 1) % N] >>= i;
        Test0044.iFld = (int) l1;
        Test0044.instanceCount += -3L;
        Test0044.iFld -= (int) fFld;
        vMeth_check_sum += i + l1;
    }

    public void mainTest(String[] strArr1) {

        int i8 = 26, i10 = 33002, i11 = 1, i12 = 7, i13 = -59977, i14 = 14, i15 = 23, i16 = 22018;
        double d1 = 59.54106;
        long l2 = -102L;
        long[] lArr1 = new long[N];
        byte by1 = 50;
        float[] fArr = new float[N];

        FuzzerUtils.init(lArr1, 70L);
        FuzzerUtils.init(fArr, 1.614F);

        vMeth(Test0044.iFld);
        Test0044.iFld += (int) -459671497L;
        i8 = 1;
        do {
            if (Test0044.bFld) break;
            Test0044.iFld >>= i8;
            d1 *= fFld;
            Test0044.iFld = -790;
        } while (++i8 < 201);
        Test0044.sFld -= (short) fFld;
        Test0044.iFld = i8;
        d1 *= Test0044.iFld;
        iArrFld[(Test0044.iFld >>> 1) % N] = (int) -49360L;
        for (i10 = 367; i10 > 17; --i10) {
            d1 -= 2062543634997573908L;
            iArrFld[i10] = (int) Test0044.instanceCount;
            Test0044.iFld += (((i10 * l2) + i10) - Test0044.iFld);
        }
        Test0044.iFld ^= (int) 502421076L;
        for (i12 = 11; i12 < 231; ++i12) {
            l2 *= (long) -55.82242;
            i14 = 1;
            do {
                lArr1[i12] -= i12;
                iArrFld[(i11 >>> 1) % N] = i8;
                for (i15 = 1; 1 > i15; ++i15) {
                    Test0044.iFld -= i14;
                    i16 += i16;
                    i16 -= -11529;
                    by1 &= (byte) i15;
                    Test0044.iFld &= (int) Test0044.instanceCount;
                    fArr[i14] = Test0044.instanceCount;
                    Test0044.iFld += i8;
                    try {
                        i13 = (i15 % i16);
                        Test0044.iFld = (-6050 % Test0044.iFld);
                        i11 = (-35107 / iArrFld[i14 + 1]);
                    } catch (ArithmeticException a_e) {
                    }
                }
            } while (++i14 < 114);
        }

        FuzzerUtils.out.println("i8 d1 i10 = " + i8 + "," + Double.doubleToLongBits(d1) + "," + i10);
        FuzzerUtils.out.println("i11 l2 i12 = " + i11 + "," + l2 + "," + i12);
        FuzzerUtils.out.println("i13 i14 i15 = " + i13 + "," + i14 + "," + i15);
        FuzzerUtils.out.println("i16 by1 lArr1 = " + i16 + "," + by1 + "," + FuzzerUtils.checkSum(lArr1));
        FuzzerUtils.out.println("fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test0044.instanceCount Test0044.iFld fFld = " + Test0044.instanceCount + "," + Test0044.iFld + "," +
                Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("Test0044.bFld Test0044.sFld iArrFld = " + (Test0044.bFld ? 1 : 0) + "," + Test0044.sFld + "," +
                FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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