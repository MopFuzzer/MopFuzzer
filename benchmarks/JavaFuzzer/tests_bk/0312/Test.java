// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:00 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=4008138866L;
    public static float fFld=71.513F;
    public static double dFld=-1.36375;
    public static byte byFld=-69;
    public static float fFld1=1.990F;
    public volatile float fArrFld[][]=new float[N][N];
    public static double dArrFld[]=new double[N];
    public static volatile long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.dArrFld, -42.11882);
        FuzzerUtils.init(Test.lArrFld, -60102L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i9, int i10) {

        int i11=0, i12=-111, i13=143, i14=-38067, i15=-1913, iArr2[]=new int[N];
        double d=0.65166;
        boolean b=true;

        FuzzerUtils.init(iArr2, -5);

        i10 -= i10;
        for (i11 = 4; i11 < 270; ++i11) {
            switch ((i11 % 4) + 36) {
            case 36:
            case 37:
                if (false) {
                    Test.instanceCount -= 97;
                    i13 = 1;
                    while (++i13 < 6) {
                        Test.fFld += (i13 * i13);
                        Test.instanceCount += (((i13 * i9) + i11) - Test.instanceCount);
                    }
                    i10 -= (int)d;
                } else if (b) {
                    iArr2[i11 + 1] = i11;
                }
                Test.instanceCount = -58220L;
                for (i14 = 1; i14 < 6; ++i14) {
                    Test.dArrFld[i11 + 1] = i14;
                    if (i9 != 0) {
                        vMeth2_check_sum += i9 + i10 + i11 + i12 + i13 + Double.doubleToLongBits(d) + (b ? 1 : 0) + i14
                            + i15 + FuzzerUtils.checkSum(iArr2);
                        return;
                    }
                    Test.fFld = i11;
                }
            case 38:
                i10 = i15;
                break;
            case 39:
                Test.fFld += i11;
                break;
            }
        }
        vMeth2_check_sum += i9 + i10 + i11 + i12 + i13 + Double.doubleToLongBits(d) + (b ? 1 : 0) + i14 + i15 +
            FuzzerUtils.checkSum(iArr2);
    }

    public static void vMeth1(int i5) {

        float f=-84.795F;
        int i6=-148, i7=-105, i16=35, i17=-89, i18=0, iArr1[]=new int[N];
        boolean b1=false, bArr[]=new boolean[N];
        double dArr[]=new double[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr1, 11);
        FuzzerUtils.init(dArr, -1.45516);
        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(lArr, -1371386961L);

        iArr1[(91 >>> 1) % N] -= -213;
        i5 = (int)(((i5 - i5) * iArr1[(5 >>> 1) % N]) * (-f));
        for (i6 = 7; i6 < 350; i6++) {
            i7 += (int)dArr[i6];
            vMeth2(i6, i6);
            f -= i6;
            b1 = b1;
        }
        for (i16 = 3; i16 < 262; ++i16) {
            Test.dFld = i18;
            i18 += i6;
            i5 >>= i17;
            switch (((i16 % 8) * 5) + 110) {
            case 127:
                bArr[i16 - 1] = b1;
                i17 = i17;
                i17 += i16;
                break;
            case 132:
                i18 = i16;
                break;
            case 142:
                Test.byFld = (byte)14;
                break;
            case 118:
                i5 >>= -55;
                break;
            case 141:
                lArr[i16 - 1] ^= i6;
                break;
            case 143:
                iArr1[i16] >>= i18;
                break;
            case 135:
                lArr = lArr;
            case 145:
                Test.byFld -= (byte)Test.dFld;
            default:
                i17 -= (int)f;
            }
        }
        vMeth1_check_sum += i5 + Float.floatToIntBits(f) + i6 + i7 + (b1 ? 1 : 0) + i16 + i17 + i18 +
            FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(long l) {

        int i4=5, i19=-39818, i20=-201, i21=-16634, i22=5, i23=12016, i24=-253, iArr[][]=new int[N][N];
        double d1=118.63152;
        short s=30678;

        FuzzerUtils.init(iArr, 60922);

        i4 += (int)(-(++Test.instanceCount));
        iArr[(i4 >>> 1) % N][(i4 >>> 1) % N] <<= (int)((++l) + (91 << (iArr[(2 >>> 1) % N][(i4 >>> 1) % N]++)));
        vMeth1(i4);
        i19 = 1;
        while (++i19 < 284) {
            Test.instanceCount = Test.instanceCount;
            Test.dArrFld[i19 + 1] += i19;
        }
        i4 -= i19;
        for (i20 = 258; i20 > 1; i20--) {
            for (i22 = 1; i22 < 6; ++i22) {
                i21 -= i20;
            }
            for (d1 = 6; d1 > 1; --d1) {
                s += (short)(((d1 * l) + l) - i19);
                Test.lArrFld = Test.lArrFld;
                i21 = i4;
                iArr[i20 - 1][i20 - 1] = (int)Test.fFld;
            }
        }
        vMeth_check_sum += l + i4 + i19 + i20 + i21 + i22 + i23 + Double.doubleToLongBits(d1) + i24 + s +
            FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i=3, i1=-51, i2=-172, i3=155, i25=-130, i26=-64416, i27=-146, i28=-32586, i29=-50760, i30=96, i31=-3771,
            iArr3[]=new int[N];
        short s1=31305;

        FuzzerUtils.init(iArr3, -11);

        fArrFld[(i >>> 1) % N][(i >>> 1) % N] = (float)((i - 64.99734) - (i++));
        for (i1 = 10; i1 < 318; i1++) {
            i3 = 1;
            while (++i3 < 82) {
                vMeth(Test.instanceCount);
                switch ((((i >>> 1) % 8) * 5) + 45) {
                case 66:
                    for (i25 = 1; i25 < 1; i25++) {
                        Test.dFld = s1;
                        try {
                            i26 = (139 % i2);
                            i26 = (i3 / -90);
                            i = (i3 % 234972996);
                        } catch (ArithmeticException a_e) {}
                        try {
                            i = (43103 % i);
                            i2 = (i26 / iArr3[i3 - 1]);
                            i2 = (i25 % i1);
                        } catch (ArithmeticException a_e) {}
                        i2 += (i25 ^ i26);
                        Test.dFld = i25;
                    }
                    i2 %= (int)(Test.instanceCount | 1);
                    Test.instanceCount -= i3;
                    break;
                case 78:
                case 80:
                    Test.instanceCount += (220 + (i3 * i3));
                    Test.fFld1 *= i2;
                    Test.instanceCount = i1;
                case 62:
                    for (i27 = i3; i27 < 1; ++i27) {
                        i2 *= i27;
                    }
                    i26 -= -5;
                    break;
                case 69:
                    fArrFld[i1][i1 - 1] = Test.instanceCount;
                case 65:
                    iArr3[i3 - 1] >>>= i3;
                    break;
                case 70:
                    Test.instanceCount = i1;
                    i28 = 14;
                    i29 += (((i3 * i3) + i27) - i27);
                    i30 = 1;
                    do {
                        i26 -= i28;
                        Test.fFld1 *= i2;
                        Test.instanceCount += (((i30 * i27) + Test.instanceCount) - Test.fFld);
                        try {
                            i28 = (i31 / 202);
                            i28 = (i25 % i2);
                            i29 = (i3 % iArr3[i30]);
                        } catch (ArithmeticException a_e) {}
                        Test.dFld += -75;
                    } while (++i30 < 1);
                    break;
                case 67:
                    Test.instanceCount += i27;
                default:
                    Test.instanceCount += (((i3 * Test.fFld1) + Test.instanceCount) - i25);
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i25 i26 = " + i3 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("s1 i27 i28 = " + s1 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("i29 i30 i31 = " + i29 + "," + i30 + "," + i31);
        FuzzerUtils.out.println("iArr3 = " + FuzzerUtils.checkSum(iArr3));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.dFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.byFld Test.fFld1 fArrFld = " + Test.byFld + "," +
            Float.floatToIntBits(Test.fFld1) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));
        FuzzerUtils.out.println("Test.dArrFld Test.lArrFld = " +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)) + "," + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
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
