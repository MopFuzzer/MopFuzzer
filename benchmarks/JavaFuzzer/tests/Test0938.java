// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:17 2023
public class Test0938 {

    public static final int N = 400;

    public static volatile long instanceCount = -13L;
    public static short[] sArrFld = new short[N];
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    static {
        FuzzerUtils.init(Test0938.sArrFld, (short) 19300);
    }

    public int iFld = -55817;
    public double dFld = -28.113285;
    public float[] fArrFld = new float[N];
    public int[] iArrFld = new int[N];

    public static void vMeth2(int i5, int i6, int i7) {

        int i8 = -51099;
        int i9 = 228;
        int i10 = -310;
        int i11 = -191;
        int[] iArr = new int[N];
        int[] iArr1 = new int[N];
        boolean b = true;
        float f2 = -76.927F;
        byte by = 61;

        FuzzerUtils.init(iArr, -52161);
        FuzzerUtils.init(iArr1, 205);

        iArr[(-1 >>> 1) % N] >>= i5;
        Test0938.instanceCount = i5;
        Test0938.instanceCount = i6;
        for (i8 = 14; i8 < 235; ++i8) {
            if (b) continue;
            Test0938.instanceCount *= i6;
            i6 = i6;
            Test0938.instanceCount = i8;
            f2 += (i8 * i8);
            for (i10 = 1; i10 < 7; ++i10) {
                try {
                    iArr1[i10 - 1] = (i8 % i10);
                    i7 = (i11 % 38995);
                    i5 = (152 % iArr1[i8 - 1]);
                } catch (ArithmeticException a_e) {
                }
                f2 *= i10;
            }
            by <<= (byte) -13;
            if (false) break;
            i5 = i9;
        }
        vMeth2_check_sum += i5 + i6 + i7 + i8 + i9 + (b ? 1 : 0) + Float.floatToIntBits(f2) + i10 + i11 + by +
                FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth1() {

        int i12 = 6619;
        double d1 = 1.45307;
        short[] sArr = new short[N];

        FuzzerUtils.init(sArr, (short) -31600);

        vMeth2(i12, 16168, i12);
        d1 = 7L;
        i12 = (int) Test0938.instanceCount;
        sArr[(i12 >>> 1) % N] >>= (short) Test0938.instanceCount;
        vMeth1_check_sum += i12 + Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(sArr);
    }

    public static void vMeth(int i2, double d) {

        int i3 = -22215, i4 = -5;
        float f1 = 0.688F;

        for (i3 = 154; i3 > 5; i3 -= 2) {
            f1 += i3;
            vMeth1();
        }
        vMeth_check_sum += i2 + Double.doubleToLongBits(d) + i3 + i4 + Float.floatToIntBits(f1);
    }

    public static void main(String[] strArr) {

        try {
            Test0938 _instance = new Test0938();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        float f = 1.111F, f3 = 1.999F, f4 = 122.543F;
        int i = 60852, i1 = -24281, i13 = -10, i14 = -95, i15 = 37134, i16 = -191, i17 = 185;
        short s = 11456;
        boolean b1 = false;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, 26184L);

        f -= iFld;
        for (i = 12; i < 196; ++i) {
            vMeth(3, dFld);
            lArr[i + 1] += i1;
            iFld += (i + f);
            iFld = iFld;
            f += s;
            f += Test0938.instanceCount;
        }
        Test0938.sArrFld[(i1 >>> 1) % N] *= (short) 1.919F;
        fArrFld[(iFld >>> 1) % N] = Test0938.instanceCount;
        i1 >>>= iFld;
        lArr[(iFld >>> 1) % N] ^= i1;
        switch (((i1 >>> 1) % 2) + 89) {
            case 89:
                Test0938.instanceCount -= i;
                for (i13 = 4; i13 < 278; i13++) {
                    for (i15 = 1; i15 < 92; ++i15) {
                        Test0938.instanceCount <<= i13;
                    }
                    i14 = (int) -54L;
                }
                break;
            case 90:
                iArrFld[(i15 >>> 1) % N] = 201;
                f3 = 1;
                while (++f3 < 270) {
                    i1 = i15;
                    if (b1) continue;
                    b1 = true;
                    Test0938.instanceCount += Test0938.instanceCount;
                    i1 %= (int) (i16 | 1);
                    if (b1) break;
                }
                b1 = b1;
                for (f4 = 8; f4 < 148; f4 += 3) {
                    f = i13;
                    i14 -= (int) f4;
                }
                break;
            default:
                Test0938.instanceCount = i14;
        }

        FuzzerUtils.out.println("f i i1 = " + Float.floatToIntBits(f) + "," + i + "," + i1);
        FuzzerUtils.out.println("s i13 i14 = " + s + "," + i13 + "," + i14);
        FuzzerUtils.out.println("i15 i16 f3 = " + i15 + "," + i16 + "," + Float.floatToIntBits(f3));
        FuzzerUtils.out.println("b1 f4 i17 = " + (b1 ? 1 : 0) + "," + Float.floatToIntBits(f4) + "," + i17);
        FuzzerUtils.out.println("lArr = " + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test0938.instanceCount iFld dFld = " + Test0938.instanceCount + "," + iFld + "," +
                Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("Test0938.sArrFld fArrFld iArrFld = " + FuzzerUtils.checkSum(Test0938.sArrFld) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)) + "," + FuzzerUtils.checkSum(iArrFld));

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
