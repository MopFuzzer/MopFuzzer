// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:01 2023
public class Test0319 {

    public static final int N = 400;

    public static long instanceCount = -398526046398506977L;
    public static float fFld = -2.137F;
    public static int iFld = -206;
    public static byte byFld = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;
    public short sFld = -16895;
    public int[] iArrFld = new int[N];

    public static void vMeth2(double d, int i2, double d1) {

        byte by = -20;
        float f = -2.409F;
        int i3 = 19707;
        int i4 = -14;
        int i5 = -233;
        int i6 = -10;
        int[] iArr = new int[N];
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, -9L);
        FuzzerUtils.init(iArr, 61);

        for (long l : lArr) {
            iArr[(i2 >>> 1) % N] -= 140;
            by += (byte) f;
            for (i3 = 1; 4 > i3; ++i3) {
                by = (byte) i3;
                iArr[i3] += i2;
                for (i5 = i3; i5 < 2; ++i5) {
                    i2 -= (int) 2.68322;
                    iArr[i3 + 1] += i2;
                    f += (i5 * i5);
                    i4 >>= i3;
                    d1 = i3;
                    i6 = i6;
                    l += (i5 * i5);
                    i6 |= 241;
                }
            }
        }
        vMeth2_check_sum += Double.doubleToLongBits(d) + i2 + Double.doubleToLongBits(d1) + by +
                Float.floatToIntBits(f) + i3 + i4 + i5 + i6 + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(int i, int i1) {

        double d2 = -27.20369;
        int i7 = -12;
        int i8 = 14;
        int i9 = 0;
        int i10 = -253;
        int i11 = -155;
        int i12 = -54722;
        int i13 = 14;
        int[] iArr1 = new int[N];
        boolean b = false;
        byte by1 = 44;
        byte[] byArr = new byte[N];
        float[] fArr = new float[N];

        FuzzerUtils.init(iArr1, -8);
        FuzzerUtils.init(fArr, 2.947F);
        FuzzerUtils.init(byArr, (byte) 102);

        vMeth2(d2, i, d2);
        for (i7 = 4; i7 < 133; i7 += 2) {
            i8 = (int) Test0319.instanceCount;
            iArr1 = iArr1;
            fArr[i7 + 1] = Test0319.fFld;
            for (i9 = 1; 24 > i9; i9++) {
                Test0319.fFld = Test0319.fFld;
            }
            for (i11 = 24; i7 < i11; --i11) {
                i13 = 1;
                while (++i13 < 1) {
                    byArr[i11] = (byte) -696937319L;
                    d2 *= i10;
                    i1 += (i13 * i13);
                    if (b) break;
                    i -= (int) 55398L;
                    Test0319.fFld = by1;
                }
            }
        }
        vMeth1_check_sum += i + i1 + Double.doubleToLongBits(d2) + i7 + i8 + i9 + i10 + i11 + i12 + i13 + (b ? 1 : 0) +
                by1 + FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
                FuzzerUtils.checkSum(byArr);
    }

    public static void vMeth() {

        int i14 = -188;
        int i15 = 11977;
        int i16 = 3;
        int i17 = -192;
        int i18 = 57676;
        int i19 = 29086;
        int[] iArr2 = new int[N];
        double d3 = 93.47089;
        boolean b1 = true;
        boolean[][] bArr = new boolean[N][N];

        FuzzerUtils.init(iArr2, -11060);
        FuzzerUtils.init(bArr, true);

        vMeth1(Test0319.iFld, -10850);
        for (i14 = 10; i14 < 252; ++i14) {
            Test0319.iFld = i14;
            Test0319.instanceCount += (i14 - i15);
            iArr2[i14 + 1] += 19277;
            for (i16 = 7; i16 > 1; i16--) {
                for (i18 = 2; i18 > i14; i18--) {
                    i19 = i18;
                    i17 += (int) d3;
                    iArr2[i16] = (int) d3;
                    d3 += Test0319.fFld;
                    b1 = false;
                }
                i15 = i15;
                bArr[i14 + 1][i14 + 1] = b1;
                iArr2 = FuzzerUtils.int1array(N, (int) -42227);
            }
        }
        vMeth_check_sum += i14 + i15 + i16 + i17 + i18 + i19 + Double.doubleToLongBits(d3) + (b1 ? 1 : 0) +
                FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(bArr);
    }

    public static void main(String[] strArr) {

        try {
            Test0319 _instance = new Test0319();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i20 = 18, i21 = 2, i22 = -13, i23 = -149, i24 = 14, i25 = 52441, i26 = 180, i27 = -172;
        long l1 = -42983L;
        long[] lArr1 = new long[N];
        boolean b2 = true, b3 = false;
        double d4 = -47.43358;
        short[] sArr = new short[N];

        FuzzerUtils.init(sArr, (short) -8688);
        FuzzerUtils.init(lArr1, -459502120L);

        vMeth();
        for (i20 = 7; i20 < 326; i20++) {
            for (i22 = 2; i22 < 79; ++i22) {
                i23 &= (int) Test0319.instanceCount;
                Test0319.instanceCount += (34704 + (i22 * i22));
                sArr[i20 - 1] = (short) i23;
                Test0319.iFld += (i22 * i22);
                Test0319.instanceCount += (long) Test0319.fFld;
                sFld -= (short) i22;
                for (l1 = 1; l1 < 2; l1++) {
                    try {
                        i24 = (i20 / i22);
                        i23 = (i24 % 17861);
                        i24 = (i21 / Test0319.iFld);
                    } catch (ArithmeticException a_e) {
                    }
                    Test0319.instanceCount = i21;
                    Test0319.iFld = i23;
                    Test0319.iFld = i21;
                    i25 += i24;
                    Test0319.instanceCount = (long) 2.267F;
                }
                i24 += (int) (-10L + (i22 * i22));
                if (b2) continue;
            }
            Test0319.iFld -= -7463;
            i23 *= (int) Test0319.instanceCount;
            switch ((i20 % 6) + 11) {
                case 11:
                    i24 = (int) d4;
                    for (i26 = 2; i26 < 79; i26++) {
                        i23 = Test0319.byFld;
                        if (b3) break;
                        i27 -= (int) Test0319.fFld;
                        iArrFld[i20 - 1] += (int) Test0319.fFld;
                        sFld <<= (short) i20;
                    }
                case 12:
                    Test0319.instanceCount += i26;
                    break;
                case 13:
                    lArr1[i20] -= -145;
                    break;
                case 14:
                    i24 -= i20;
                    break;
                case 15:
                    lArr1[i20] >>>= -223;
                case 16:
                    Test0319.fFld -= -12L;
                    break;
                default:
                    Test0319.iFld += i27;
            }
        }

        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 l1 i24 = " + i23 + "," + l1 + "," + i24);
        FuzzerUtils.out.println("i25 b2 d4 = " + i25 + "," + (b2 ? 1 : 0) + "," + Double.doubleToLongBits(d4));
        FuzzerUtils.out.println("i26 i27 b3 = " + i26 + "," + i27 + "," + (b3 ? 1 : 0));
        FuzzerUtils.out.println("sArr lArr1 = " + FuzzerUtils.checkSum(sArr) + "," + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test0319.instanceCount Test0319.fFld Test0319.iFld = " + Test0319.instanceCount + "," +
                Float.floatToIntBits(Test0319.fFld) + "," + Test0319.iFld);
        FuzzerUtils.out.println("sFld Test0319.byFld iArrFld = " + sFld + "," + Test0319.byFld + "," +
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
