// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:44 2023
public class Test0680 {

    public static final int N = 400;

    public static long instanceCount=-6504372584711980277L;
    public static volatile float fFld=-2.670F;
    public static boolean bFld=true;
    public static byte byFld=77;
    public short sFld=-21454;
    public static volatile int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0680.iArrFld, 10);
    }

    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i4, long l) {

        double d=1.89854, d1=0.111267;
        int i5=5, i6=-147, i7=-152, i8=-2, i9=64;
        float f=12.258F;

        try {
            Test0680.iArrFld[(i4 >>> 1) % N] *= (int) d;
        }
        catch (ArrayIndexOutOfBoundsException exc1) {
            for (i5 = 10; i5 < 329; i5 += 2) {
                if (Test0680.bFld) break;
            }
            for (i7 = 9; 227 > i7; i7++) {
                f = 1;
                while (++f < 7) {
                    i6 |= i7;
                    i4 = i4;
                    for (d1 = 1; d1 < 1; ++d1) {
                        Test0680.iArrFld[i7 + 1] <<= -8;
                        Test0680.iArrFld[i7] = 838;
                        Test0680.byFld = (byte) i4;
                        if (false) {
                            i9 = (int) Test0680.instanceCount;
                            Test0680.instanceCount <<= i5;
                        } else if (Test0680.bFld) {
                            i6 += (int)d1;
                        }
                    }
                }
            }
        }
        vMeth1_check_sum += i4 + l + Double.doubleToLongBits(d) + i5 + i6 + i7 + i8 + Float.floatToIntBits(f) +
            Double.doubleToLongBits(d1) + i9;
    }

    public static void vMeth(int i1) {

        int i2=19641, i3=64234, i10=5, i11=33053, i12=-14, i13=10;
        short s=12436;
        short[] sArr =new short[N];

        FuzzerUtils.init(sArr, (short)24431);

        for (i2 = 12; i2 < 324; ++i2) {
            switch (((i2 % 5) * 5) + 28) {
            case 36:
                Test0680.fFld = (i2 - i2);
                s += (short)(i2 * i2);
                break;
            case 38:
                vMeth1(i1, Test0680.instanceCount);
                break;
            case 42:
                for (i10 = 1; i10 < 5; i10++) {
                    i1 = i1;
                    i3 += (239 + (i10 * i10));
                }
                if (Test0680.bFld) {
                    for (i12 = i2; i12 < 5; i12++) {
                        i11 ^= -7;
                        i11 *= i10;
                        Test0680.instanceCount += (((i12 * Test0680.instanceCount) + i13) - i2);
                        s *= (short)7759428915124847397L;
                        i11 = i3;
                    }
                } else if (Test0680.bFld) {
                    sArr[i2 + 1] += s;
                } else {
                    Test0680.instanceCount += (long) Test0680.fFld;
                    vMeth_check_sum += i1 + i2 + i3 + s + i10 + i11 + i12 + i13 + FuzzerUtils.checkSum(sArr);
                    return;
                }
                break;
            case 39:
                i11 += (i2 * i2);
            case 52:
                i13 *= (int) Test0680.instanceCount;
                break;
            }
        }
        vMeth_check_sum += i1 + i2 + i3 + s + i10 + i11 + i12 + i13 + FuzzerUtils.checkSum(sArr);
    }

    public static float fMeth() {

        int i14=-9, i15=-41, i16=-142, i17=-25921, i18=9, i19=-200, i20=-9, i21=-2;
        short s1=3217;
        float f1=116.400F;

        vMeth(i14);
        Test0680.iArrFld[(i14 >>> 1) % N] <<= s1;
        i14 += i14;
        for (i15 = 10; i15 < 238; i15 += 2) {
            for (i17 = i15; 14 > i17; i17++) {
                i16 >>= -64580;
                i14 = i14;
                for (f1 = 1; f1 < 1; ++f1) {
                    i20 = s1;
                    i20 &= i17;
                    i21 |= (int) Test0680.instanceCount;
                    i18 ^= i21;
                    Test0680.iArrFld[i17 + 1] *= (int) 0L;
                    i16 >>>= i18;
                    Test0680.instanceCount += (long) f1;
                }
            }
        }
        long meth_res = i14 + s1 + i15 + i16 + i17 + i18 + Float.floatToIntBits(f1) + i19 + i20 + i21;
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=5854, i22=51, i23=41592, i24=4563, i25=-13, i26=-14, i27=135, i28=-9246;
        boolean b=false;
        double d2=52.92527;
        double[] dArr =new double[N];
        float[][] fArr =new float[N][N];
        short[] sArr1 =new short[N];

        FuzzerUtils.init(dArr, 66.32379);
        FuzzerUtils.init(fArr, 2.971F);
        FuzzerUtils.init(sArr1, (short)9716);

        i -= (int)1.407F;
        Test0680.fFld = i;
        b = (((Test0680.instanceCount * i) < Math.abs(i)) & ((-(Test0680.iArrFld[(i >>> 1) % N]--)) < fMeth()));
        i22 = 1;
        do {
            dArr[i22 + 1] -= i;
            for (i23 = 6; i23 < 190; ++i23) {
                Test0680.bFld = Test0680.bFld;
                sFld += (short)i23;
                i = (int) Test0680.fFld;
                i24 = i23;
                for (i25 = 1; 2 > i25; i25++) {
                    Test0680.fFld = (float) d2;
                    i26 = i25;
                    Test0680.instanceCount += (i25 * i25);
                    try {
                        i = (i23 / 561443435);
                        i = (i25 / 4874);
                        i26 = (-175 % i23);
                    } catch (ArithmeticException a_e) {}
                    i24 += (((i25 * i26) + i24) - i24);
                    fArr[i23][i22] = Test0680.instanceCount;
                }
                dArr[(i26 >>> 1) % N] = Test0680.instanceCount;
                i = i25;
            }
            for (i27 = i22; i27 < 190; i27++) {
                i26 += (int)(516539519L + (i27 * i27));
                i = sFld;
                Test0680.iArrFld[i27 - 1] = i26;
                i26 += i27;
                sArr1[i27 + 1] = (short)d2;
            }
        } while (++i22 < 132);
        i28 -= (int) Test0680.instanceCount;
        if (true) {
            Test0680.iArrFld[(i23 >>> 1) % N] = i;
            Test0680.instanceCount >>= Test0680.instanceCount;
        }
        Test0680.instanceCount -= i22;

        FuzzerUtils.out.println("i b i22 = " + i + "," + (b ? 1 : 0) + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 d2 i27 = " + i26 + "," + Double.doubleToLongBits(d2) + "," + i27);
        FuzzerUtils.out.println("i28 dArr fArr = " + i28 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));
        FuzzerUtils.out.println("sArr1 = " + FuzzerUtils.checkSum(sArr1));

        FuzzerUtils.out.println("Test0680.instanceCount Test0680.fFld Test0680.bFld = " + Test0680.instanceCount + "," +
                Float.floatToIntBits(Test0680.fFld) + "," + (Test0680.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0680.byFld sFld Test0680.iArrFld = " + Test0680.byFld + "," + sFld + "," +
                FuzzerUtils.checkSum(Test0680.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0680 _instance = new Test0680();
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
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
