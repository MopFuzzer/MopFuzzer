// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:53 2023
public class Test0016 {

    public static final int N = 400;

    public static long instanceCount = 320422007860103430L;
    public static volatile byte byFld = -67;
    public static volatile int iFld = 32169;
    public static float fFld = 2.610F;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;
    public int iFld1 = 56568;
    public short sFld = -2089;
    public boolean[] bArrFld = new boolean[N];

    public static void vMeth2(double d) {

        int i7 = 99, i8 = 45, i9 = -12;
        float f1 = 2.499F;
        boolean b1 = false;
        byte by = -120;

        for (i7 = 7; i7 < 390; i7++) {
            i8 &= (int) Test0016.instanceCount;
            switch (((i7 % 1) * 5) + 84) {
                case 86:
                    i9 = 1;
                    do {
                        d *= -1;
                        f1 = 1;
                        while (++f1 < 1) {
                            float f2 = -50.924F;
                            if (true) {
                                switch ((int) ((f1 % 2) + 120)) {
                                    case 120:
                                        i8 = (int) f1;
                                        d -= i8;
                                    case 121:
                                        i8 *= (int) f1;
                                        i8 = i8;
                                        break;
                                }
                            } else if (b1) {
                                f2 += (((f1 * i8) + i9) - i7);
                                Test0016.instanceCount += i7;
                            }
                        }
                        by -= (byte) i8;
                    } while (++i9 < 4);
                    break;
                default:
                    Test0016.instanceCount &= i7;
            }
        }
        vMeth2_check_sum += Double.doubleToLongBits(d) + i7 + i8 + i9 + Float.floatToIntBits(f1) + (b1 ? 1 : 0) + by;
    }

    public static void vMeth1(int i4, float f, long l) {

        int i5 = -166, i6 = -2, i10 = -6317, i11 = 135, i12 = -54266;
        double d1 = 1.38646;
        short s = -6677;

        for (i5 = 6; i5 < 295; i5++) {
            vMeth2(d1);
            l = 80;
            i10 = 6;
            do {
                i4 >>= Test0016.byFld;
                i4 *= s;
                i4 += (6 + (i10 * i10));
                for (i11 = 1; i11 < 3; ++i11) {
                    i12 += i6;
                    i4 <<= i5;
                    i6 -= i10;
                    f += i11;
                    Test0016.instanceCount += (((i11 * f) + f) - i6);
                    f /= (s | 1);
                    i12 -= i6;
                }
            } while ((i10 -= 3) > 0);
        }
        vMeth1_check_sum += i4 + Float.floatToIntBits(f) + l + i5 + i6 + Double.doubleToLongBits(d1) + i10 + s + i11 +
                i12;
    }

    public static void vMeth(boolean b) {


        vMeth1(Test0016.iFld, Test0016.fFld, Test0016.instanceCount);
        Test0016.iFld += Test0016.iFld;
        vMeth_check_sum += (b ? 1 : 0);
    }

    public static void main(String[] strArr) {

        try {
            Test0016 _instance = new Test0016();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = 47455;
        int i1 = 193;
        int i2 = -63606;
        int i3 = 3813;
        int i13 = 8;
        int[] iArr = new int[N];
        boolean b2 = true;
        float f3 = 2.782F;
        float[] fArr = new float[N];
        double d2 = -103.88525;

        FuzzerUtils.init(fArr, 2.361F);
        FuzzerUtils.init(iArr, -31589);

        for (i = 14; 304 > i; ++i) {
            for (i2 = 87; i < i2; --i2) {
                vMeth(b2);
                for (f3 = 1; f3 < 1; f3++) {
                    Test0016.instanceCount -= (long) 101.87476;
                    bArrFld[i + 1] = false;
                    iFld1 = -15635;
                    switch ((((i3 >>> 1) % 7) * 5) + 67) {
                        case 82:
                            Test0016.fFld = i;
                            fArr = fArr;
                            break;
                        case 76:
                            Test0016.instanceCount += (long) d2;
                            Test0016.iFld += (int) (((f3 * i13) + i13) - i2);
                            Test0016.instanceCount += -139;
                            break;
                        case 72:
                            iArr[(int) (f3 + 1)] -= i1;
                            break;
                        case 90:
                            i13 = Test0016.byFld;
                            iArr[i2 - 1] |= (int) Test0016.instanceCount;
                            Test0016.iFld += (int) (f3 + i2);
                        case 71:
                            Test0016.instanceCount >>>= i13;
                            iFld1 += (int) (((f3 * i1) + i2) - i1);
                            Test0016.iFld = (int) Test0016.instanceCount;
                            i3 += Test0016.iFld;
                        case 74:
                            sFld |= sFld;
                            Test0016.iFld = (int) 18.243F;
                            break;
                        case 99:
                            Test0016.fFld += Test0016.instanceCount;
                            iFld1 += (int) f3;
                            break;
                        default:
                            iArr[(int) (f3 + 1)] *= (int) Test0016.instanceCount;
                            i1 = (int) Test0016.instanceCount;
                    }
                    Test0016.instanceCount >>= i13;
                    iArr[i2 + 1] <<= i1;
                    Test0016.instanceCount <<= Test0016.iFld;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 b2 f3 = " + i3 + "," + (b2 ? 1 : 0) + "," + Float.floatToIntBits(f3));
        FuzzerUtils.out.println("i13 d2 fArr = " + i13 + "," + Double.doubleToLongBits(d2) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));
        FuzzerUtils.out.println("iArr = " + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test0016.instanceCount Test0016.byFld Test0016.iFld = " + Test0016.instanceCount + "," + Test0016.byFld +
                "," + Test0016.iFld);
        FuzzerUtils.out.println("Test0016.fFld iFld1 sFld = " + Float.floatToIntBits(Test0016.fFld) + "," + iFld1 + "," + sFld);
        FuzzerUtils.out.println("bArrFld = " + FuzzerUtils.checkSum(bArrFld));

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