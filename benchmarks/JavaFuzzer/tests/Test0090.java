// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:55 2023
public class Test0090 {

    public static final int N = 400;

    public static long instanceCount = 1573976398857764135L;
    public static int iFld = -209;
    public static byte byFld = -79;
    public static double dFld = 39.97096;
    public static short sFld1 = -1425;
    public static boolean bFld = true;
    public static float fFld = -51.528F;
    public static long[] lArrFld = new long[N];
    public static volatile int[] iArrFld = new int[N];
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0090.lArrFld, 154377834L);
        FuzzerUtils.init(Test0090.iArrFld, 151);
    }

    public short sFld = 2428;

    public static int iMeth() {

        int i7 = 4277, i8 = -14, i9 = -107;
        long l1 = -6268L;
        float f1 = 1.822F;

        Test0090.iFld = Test0090.iFld;
        i7 = 1;
        do {
            Test0090.instanceCount *= Test0090.instanceCount;
            switch ((i7 % 4) + 36) {
                case 36:
                    l1 = 1;
                    while (++l1 < 8) {
                        Test0090.iArrFld = Test0090.iArrFld;
                        switch ((((Test0090.iFld >>> 1) % 2) * 5) + 114) {
                            case 124:
                                Test0090.iFld += (int) (l1 ^ i7);
                                break;
                            case 117:
                                for (i8 = 1; i8 < 1; i8++) {
                                    Test0090.iFld = Test0090.iFld;
                                    Test0090.iFld = Test0090.byFld;
                                    Test0090.iFld += (((i8 * i9) + l1) - f1);
                                    i9 >>= Test0090.iFld;
                                    Test0090.instanceCount = -53614;
                                    if (i8 != 0) {
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 37:
                    Test0090.instanceCount += (((i7 * i9) + Test0090.sFld1) - Test0090.instanceCount);
                    break;
                case 38:
                    Test0090.iFld = i8;
                case 39:
                    Test0090.instanceCount = i7;
                    break;
            }
        } while (++i7 < 210);
        long meth_res = i7 + l1 + i8 + i9 + Float.floatToIntBits(f1);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth1(double d) {

        float f2 = 2.502F;
        boolean b = false;
        int i10 = -238, i11 = 21239, i12 = 251, i13 = 5;
        byte[] byArr = new byte[N];
        short[] sArr = new short[N];

        FuzzerUtils.init(byArr, (byte) -114);
        FuzzerUtils.init(sArr, (short) -28555);

        Test0090.iFld = (int) (Test0090.instanceCount - Test0090.iFld);
        Test0090.lArrFld[(-55494 >>> 1) % N] = Math.abs(iMeth());
        if (b) {
            Test0090.sFld1 -= (short) f2;
        } else {
            for (i10 = 14; i10 < 310; ++i10) {
                byArr[i10 - 1] -= (byte) Test0090.instanceCount;
                i12 = 1;
                while (++i12 < 6) {
                    f2 += 80;
                    sArr[i12] = (short) -1.61282;
                    Test0090.iFld *= 157;
                    d *= f2;
                    Test0090.lArrFld = Test0090.lArrFld;
                    Test0090.iFld = i13;
                    Test0090.iFld = i13;
                    Test0090.instanceCount += i12;
                }
            }
        }
        vMeth1_check_sum += Double.doubleToLongBits(d) + Float.floatToIntBits(f2) + (b ? 1 : 0) + i10 + i11 + i12 + i13
                + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(sArr);
    }

    public static void vMeth(int i3, int i4) {

        int i5 = 113;
        int i6 = -22970;
        int i14 = 181;
        int[] iArr1 = new int[N];
        float f = -15.831F;
        long[] lArr = new long[N];
        boolean[] bArr = new boolean[N];

        FuzzerUtils.init(iArr1, 2);
        FuzzerUtils.init(lArr, 12L);
        FuzzerUtils.init(bArr, true);

        Test0090.dFld = Math.abs(iArr1[(i3 >>> 1) % N]);
        for (long l : lArr) {
            for (i5 = 1; i5 < 4; i5++) {
                l += (((i5 * f) + i6) - Test0090.iFld);
                Test0090.instanceCount = i4;
                i3 += (i5 + i3);
                i6 >>= i4;
                i6 += (i5 * i5);
                vMeth1(Test0090.dFld);
                i14 = 1;
                do {
                    f *= 2;
                    bArr[i5] = Test0090.bFld;
                    if (true) break;
                    Test0090.instanceCount = -14;
                    Test0090.iFld = -48477;
                } while (++i14 < 2);
            }
        }
        vMeth_check_sum += i3 + i4 + i5 + i6 + Float.floatToIntBits(f) + i14 + FuzzerUtils.checkSum(iArr1) +
                FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(bArr);
    }

    public static void main(String[] strArr) {

        try {
            Test0090 _instance = new Test0090();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = -173;
        int i1 = 56261;
        int i2 = -12484;
        int i15 = -88;
        int[] iArr = new int[N];
        double[] dArr = new double[N];
        float[] fArr = new float[N];

        FuzzerUtils.init(dArr, -65.23680);
        FuzzerUtils.init(fArr, 51.137F);
        FuzzerUtils.init(iArr, -54830);

        i = 1;
        do {
            Test0090.iFld = (int) Test0090.instanceCount;
            for (i1 = 1; i1 < 132; ++i1) {
                int i16 = 110;
                Test0090.byFld = (byte) ((dArr[i - 1] * (sFld - i)) - (fArr[i1]++));
                switch (((i % 1) * 5) + 100) {
                    case 105:
                        Test0090.instanceCount += (iArr[i - 1]--);
                        break;
                    default:
                        vMeth(i1, i2);
                        i2 = (int) Test0090.instanceCount;
                        iArr[i1 + 1] *= Test0090.iFld;
                        Test0090.instanceCount -= -106;
                }
                iArr[i1 - 1] += (int) Test0090.instanceCount;
                Test0090.instanceCount |= -189;
                iArr[i] = Test0090.iFld;
                switch ((i % 6) + 82) {
                    case 82:
                        Test0090.iArrFld[i] >>= Test0090.iFld;
                        iArr[i + 1] >>= i1;
                        break;
                    case 83:
                        switch ((i % 6) + 25) {
                            case 25:
                                Test0090.byFld *= (byte) Test0090.instanceCount;
                                switch (((i % 6) * 5) + 44) {
                                    case 56:
                                        i15 = 2;
                                        do {
                                            Test0090.iFld += (int) Test0090.instanceCount;
                                            i2 -= -31949;
                                            if (true) break;
                                            Test0090.iArrFld[i1 - 1] = (int) Test0090.instanceCount;
                                            Test0090.fFld -= Test0090.fFld;
                                            Test0090.iFld *= i2;
                                            dArr = dArr;
                                        } while (--i15 > 0);
                                        Test0090.fFld += 6;
                                        break;
                                    case 66:
                                        i2 -= (int) Test0090.fFld;
                                        i2 *= (int) 6182632113231479196L;
                                        break;
                                    case 60:
                                        Test0090.fFld -= Test0090.fFld;
                                    case 59:
                                        i2 |= Test0090.iFld;
                                        break;
                                    case 45:
                                    case 54:
                                        Test0090.fFld -= i;
                                        break;
                                    default:
                                        Test0090.instanceCount *= Test0090.instanceCount;
                                }
                                break;
                            case 26:
                                Test0090.instanceCount = i2;
                                break;
                            case 27:
                                Test0090.iFld = i;
                                break;
                            case 28:
                                Test0090.lArrFld[i1 - 1] = -185;
                                break;
                            case 29:
                                iArr[i] = Test0090.byFld;
                                break;
                            case 30:
                                Test0090.sFld1 += (short) (i1 | Test0090.instanceCount);
                                break;
                            default:
                                iArr[i1] %= (int) (i1 | 1);
                        }
                    case 84:
                        i2 *= (int) Test0090.dFld;
                        break;
                    case 85:
                        Test0090.lArrFld[i1] -= (long) Test0090.fFld;
                        break;
                    case 86:
                        i2 /= (int) (i16 | 1);
                        break;
                    case 87:
                        i2 = (int) Test0090.instanceCount;
                        break;
                    default:
                        Test0090.sFld1 += (short) i1;
                }
            }
        } while (++i < 190);

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i15 dArr fArr = " + i15 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
                "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));
        FuzzerUtils.out.println("iArr = " + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test0090.instanceCount Test0090.iFld Test0090.byFld = " + Test0090.instanceCount + "," + Test0090.iFld +
                "," + Test0090.byFld);
        FuzzerUtils.out.println("sFld Test0090.dFld Test0090.sFld1 = " + sFld + "," + Double.doubleToLongBits(Test0090.dFld) + ","
                + Test0090.sFld1);
        FuzzerUtils.out.println("Test0090.bFld Test0090.fFld Test0090.lArrFld = " + (Test0090.bFld ? 1 : 0) + "," +
                Float.floatToIntBits(Test0090.fFld) + "," + FuzzerUtils.checkSum(Test0090.lArrFld));
        FuzzerUtils.out.println("Test0090.iArrFld = " + FuzzerUtils.checkSum(Test0090.iArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}