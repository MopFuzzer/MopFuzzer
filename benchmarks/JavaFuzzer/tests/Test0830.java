// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:14 2023
public class Test0830 {

    public static final int N = 400;

    public static long instanceCount = -15457L;
    public static int iFld = -26347;
    public static double dFld = 46.10429;
    public static int[][] iArrFld = new int[N][N];
    public static float[] fArrFld = new float[N];
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;
    public static long iMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0830.iArrFld, 46295);
        FuzzerUtils.init(Test0830.fArrFld, -2.540F);
    }

    public float fFld = 2.609F;

    public static int iMeth(int i4) {


        i4 -= i4;
        long meth_res = i4;
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth2() {

        double d = -116.15252;
        byte by = -96;
        int i5 = -61584, i6 = -241, i7 = -10, i8 = -47207;
        boolean b = true;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, -59761400250107353L);

        iMeth(Test0830.iFld);
        d -= -24618;
        Test0830.instanceCount *= by;
        for (i5 = 6; i5 < 227; i5++) {
            lArr[i5 + 1] -= -21079;
            Test0830.iFld = 37;
            Test0830.iFld <<= (int) Test0830.instanceCount;
            for (i7 = 1; i7 < 7; i7++) {
                if (b) break;
                Test0830.iArrFld[i5 + 1][i5 - 1] += 57824;
                by += (byte) i7;
            }
        }
        Test0830.iFld *= Test0830.iFld;
        i8 += i6;
        i8 -= i6;
        Test0830.iArrFld[(Test0830.iFld >>> 1) % N][(-20073 >>> 1) % N] = Test0830.iFld;
        vMeth2_check_sum += Double.doubleToLongBits(d) + by + i5 + i6 + i7 + i8 + (b ? 1 : 0) +
                FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1(short s, long l) {

        int i2 = 198;
        int i3 = 159;
        int i9 = -129;
        int[] iArr = new int[N];
        float f = 2.518F;
        long l1 = 2520623021104320154L;

        FuzzerUtils.init(iArr, 497);

        iArr[(Test0830.iFld >>> 1) % N] = (int) (Test0830.instanceCount + (-(Test0830.iFld - 87.18990)));
        i2 = 1;
        while (++i2 < 179) {
            boolean b1 = true;
            iArr = (iArr = (iArr = (iArr = FuzzerUtils.int1array(N, (int) 12))));
            i3 += (i2 | i3);
            switch (((i2 % 10) * 5) + 97) {
                case 98:
                    f += (f * (Math.abs(-62654) * (~(Test0830.instanceCount + -1))));
                    if (true) {
                        Test0830.instanceCount += (i2 * i2);
                        vMeth2();
                        i3 -= Test0830.iFld;
                        i3 >>= i2;
                    } else {
                        iArr[i2 + 1] = (int) f;
                        i3 /= (int) (i2 | 1);
                        f -= (float) Test0830.dFld;
                        i3 = (int) f;
                    }
                case 128:
                    i3 = Test0830.iFld;
                    break;
                case 122:
                    Test0830.iFld += (i2 | i2);
                case 125:
                    Test0830.iFld |= s;
                    break;
                case 121:
                    l1 *= i3;
                    break;
                case 135:
                    if (b1) break;
                    break;
                case 124:
                    Test0830.iFld -= i3;
                    break;
                case 133:
                    l += (i2 * i2);
                case 139:
                    if (i9 != 0) {
                        vMeth1_check_sum += s + l + i2 + i3 + Float.floatToIntBits(f) + l1 + i9 +
                                FuzzerUtils.checkSum(iArr);
                        return;
                    }
                    break;
                case 100:
                    Test0830.iFld >>>= i3;
                    break;
            }
        }
        vMeth1_check_sum += s + l + i2 + i3 + Float.floatToIntBits(f) + l1 + i9 + FuzzerUtils.checkSum(iArr);
    }

    public static void main(String[] strArr) {

        try {
            Test0830 _instance = new Test0830();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void vMeth() {

        int i1 = -6;

        i1 += (int) ((Integer.reverseBytes(i1) - Math.min(i1, i1)) - (-(-(Test0830.instanceCount++))));
        vMeth_check_sum += i1;
    }

    public void mainTest(String[] strArr1) {

        int i = 101, i10 = 11, i11 = -81, i12 = -126, i13 = 50175, i14 = 19736, i15 = -160, i16 = 48588, i17 = 11, i18 = -52, i19 = 148;
        boolean b2 = false;

        i = (--i);
        vMeth();
        i = Math.abs(i);
        vMeth1((short) (-1431), Test0830.instanceCount);
        Test0830.iArrFld[(i >>> 1) % N] = Test0830.iArrFld[(i >>> 1) % N];
        for (i10 = 12; i10 < 232; ++i10) {
            i11 = (int) Test0830.instanceCount;
            for (i12 = 2; i12 < 114; ++i12) {
                i = (int) Test0830.instanceCount;
                Test0830.instanceCount /= 14114L;
                i = 31645;
                i = -26906;
            }
            Test0830.iArrFld[i10 - 1][i10 + 1] += (int) Test0830.instanceCount;
            for (i14 = 114; i14 > i10; --i14) {
                i15 += (i14 * i14);
                fFld += (i14 + i15);
                if (b2) {
                    i = i14;
                } else if (b2) {
                    for (i16 = 1; i16 < 1; i16++) {
                        i15 += i;
                        fFld += fFld;
                        i += (-20278 + (i16 * i16));
                        Test0830.fArrFld[i14 + 1] -= -11;
                        if (b2) continue;
                        try {
                            Test0830.iArrFld[i14][i10 + 1] = (i14 / i);
                            Test0830.iFld = (i15 % 1945265901);
                            i13 = (i14 / 242);
                        } catch (ArithmeticException a_e) {
                        }
                        i13 = i11;
                    }
                    Test0830.dFld += Test0830.instanceCount;
                    for (i18 = 1; i18 < 1; i18++) {
                        i13 += (((i18 * Test0830.instanceCount) + Test0830.instanceCount) - i19);
                        Test0830.instanceCount = Test0830.instanceCount;
                    }
                } else if (b2) {
                    i -= (int) Test0830.instanceCount;
                }
            }
        }

        FuzzerUtils.out.println("i i10 i11 = " + i + "," + i10 + "," + i11);
        FuzzerUtils.out.println("i12 i13 i14 = " + i12 + "," + i13 + "," + i14);
        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("b2 i18 i19 = " + (b2 ? 1 : 0) + "," + i18 + "," + i19);

        FuzzerUtils.out.println("Test0830.instanceCount Test0830.iFld Test0830.dFld = " + Test0830.instanceCount + "," + Test0830.iFld +
                "," + Double.doubleToLongBits(Test0830.dFld));
        FuzzerUtils.out.println("fFld Test0830.iArrFld Test0830.fArrFld = " + Float.floatToIntBits(fFld) + "," +
                FuzzerUtils.checkSum(Test0830.iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0830.fArrFld)));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 mainTest
//DEBUG  iMeth ->  iMeth vMeth2 vMeth1 mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}