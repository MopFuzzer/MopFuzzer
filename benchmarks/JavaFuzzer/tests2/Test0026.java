// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:12 2023
public class Test0026 {

    public static final int N = 400;

    public static long instanceCount=-839205719L;
    public static int iFld=219;
    public byte byFld=86;
    public static float fFld=64.765F;
    public boolean bFld=true;
    public static int[] iArrFld =new int[N];
    public long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test0026.iArrFld, 0);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i1) {

        float f2=-85.147F;
        float[][] fArr =new float[N][N];
        int i2=5540;
        int i3=31470;
        int i4=-18687;
        int i5=31945;
        int i6=-34463;
        int[] iArr =new int[N];
        double d1=-90.123571;
        double[] dArr =new double[N];
        boolean b=true;

        FuzzerUtils.init(dArr, 0.15404);
        FuzzerUtils.init(iArr, -37689);
        FuzzerUtils.init(fArr, -2.997F);

        Test0026.iFld = 7;
        Test0026.instanceCount = Test0026.iFld;
        dArr[(Test0026.iFld >>> 1) % N] += i1;
        Test0026.instanceCount = i1;
        Test0026.instanceCount *= -14;
        for (f2 = 351; f2 > 16; f2 -= 2) {
            switch ((int)(((f2 % 2) * 5) + 45)) {
            case 51:
                for (i3 = 1; i3 < 9; i3++) {
                    Test0026.instanceCount += (((i3 * i4) + i2) - Test0026.instanceCount);
                    for (i5 = 2; 1 < i5; --i5) {
                        d1 = -30251;
                        if (b) break;
                        Test0026.iFld >>>= i3;
                        try {
                            iArr[i5 + 1] = (i6 / iArr[(int)(f2 + 1)]);
                            iArr[(int)(f2)] = (146 / i2);
                            Test0026.iFld = (iArr[(i5 >>> 1) % N] / i6);
                        } catch (ArithmeticException a_e) {}
                        fArr = fArr;
                    }
                }
                break;
            case 49:
                d1 -= -7;
                break;
            }
        }
        vMeth_check_sum += i1 + Float.floatToIntBits(f2) + i2 + i3 + i4 + i5 + i6 + Double.doubleToLongBits(d1) + (b ?
            1 : 0) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static short sMeth(float f1) {

        long l=4093081384510065908L;
        int i7=-16;
        int i8=33754;
        int i9=-165;
        int[] iArr1 =new int[N];

        FuzzerUtils.init(iArr1, 211);

        l = 1;
        do {
            Test0026.iFld += (int) l;
            vMeth(11544);
            i7 = 1;
            do {
                for (i8 = 1; i8 > 1; --i8) {
                    i9 &= (int)l;
                    iArr1[i8] *= i7;
                    f1 += i8;
                    if (i7 != 0) {
                    }
                    Test0026.iFld -= i9;
                    Test0026.iFld += i9;
                    i9 += i9;
                    i9 += 41809;
                }
                i9 *= -2;
                i9 += (((i7 * Test0026.instanceCount) + f1) - i7);
            } while (++i7 < 6);
        } while (++l < 262);
        long meth_res = Float.floatToIntBits(f1) + l + i7 + i8 + i9 + FuzzerUtils.checkSum(iArr1);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static void vSmallMeth(double d, int i) {

        float f=95.396F;

        Test0026.instanceCount -= Math.max((int) ((-(i * 0.998F)) - (i - f)), i * sMeth(f));
        i *= (int)d;
        vSmallMeth_check_sum += Double.doubleToLongBits(d) + i + Float.floatToIntBits(f);
    }

    public void mainTest(String[] strArr1) {

        int i10=25, i11=11582, i12=-14, i13=13, i14=-161;
        float f3=1.1009F;
        short s=-5699;

        for (int smallinvoc = 0; smallinvoc < 862; smallinvoc++) vSmallMeth(-1.82077, Test0026.iFld);
        for (i10 = 24; i10 < 396; ++i10) {
            switch (((i10 % 3) * 5) + 63) {
            case 78:
                for (f3 = i10; f3 < 68; f3++) {
                    for (i13 = 1; i13 > 1; i13--) {
                        double d2=1.101917;
                        byFld += (byte)-5;
                        i12 = i12;
                        Test0026.instanceCount = (long) 2.284F;
                        try {
                            i14 = (56 % Test0026.iArrFld[(int) (f3 - 1)]);
                            i12 = (-549238221 / i10);
                            i12 = (19449 / i14);
                        } catch (ArithmeticException a_e) {}
                        if (bFld) {
                            switch ((((i14 >>> 1) % 7) * 5) + 108) {
                            case 143:
                                i12 = Test0026.iFld;
                                Test0026.instanceCount += Test0026.instanceCount;
                                Test0026.iFld = i13;
                                break;
                            case 114:
                                Test0026.fFld += (-83 + (i13 * i13));
                                lArrFld = lArrFld;
                                Test0026.instanceCount += i13;
                                i12 += i11;
                                break;
                            case 134:
                                i14 *= 4;
                                switch (((i10 % 7) * 5) + 111) {
                                case 132:
                                    i12 += i11;
                                    d2 = -4;
                                case 115:
                                    byFld >>= (byte)i10;
                                    Test0026.instanceCount += 38;
                                    Test0026.iArrFld[i10 - 1] = (int) Test0026.instanceCount;
                                    i11 -= i13;
                                    break;
                                case 129:
                                    switch ((int)(((f3 % 2) * 5) + 96)) {
                                    case 98:
                                    case 97:
                                        i11 += i13;
                                    }
                                    lArrFld[(int)(f3 + 1)] -= (long)d2;
                                    if (true) break;
                                    break;
                                case 127:
                                    d2 -= 0.29130;
                                    break;
                                case 119:
                                    i11 += (i13 * Test0026.iFld);
                                    break;
                                case 139:
                                    i12 <<= 63153;
                                    break;
                                case 145:
                                    Test0026.instanceCount = -36377;
                                default:
                                    if (false) break;
                                }
                                break;
                            case 124:
                                Test0026.iFld *= (int) 3L;
                                break;
                            case 139:
                                i11 >>= i12;
                                break;
                            case 140:
                                Test0026.instanceCount = Test0026.instanceCount;
                                break;
                            case 121:
                                Test0026.iArrFld[i10 - 1] = i14;
                            default:
                                Test0026.iArrFld[i13] = s;
                            }
                        } else if (bFld) {
                            if (bFld) continue;
                        } else if (bFld) {
                            if (bFld) continue;
                        }
                    }
                }
            case 71:
                Test0026.iArrFld[i10 - 1] -= i13;
                break;
            case 76:
                if (bFld) continue;
            default:
                i14 = 1;
            }
        }

        FuzzerUtils.out.println("i10 i11 f3 = " + i10 + "," + i11 + "," + Float.floatToIntBits(f3));
        FuzzerUtils.out.println("i12 i13 i14 = " + i12 + "," + i13 + "," + i14);
        FuzzerUtils.out.println("s = " + s);

        FuzzerUtils.out.println("Test0026.instanceCount Test0026.iFld byFld = " + Test0026.instanceCount + "," + Test0026.iFld + "," +
            byFld);
        FuzzerUtils.out.println("Test0026.fFld bFld Test0026.iArrFld = " + Float.floatToIntBits(Test0026.fFld) + "," + (bFld ? 1 :
                0) + "," + FuzzerUtils.checkSum(Test0026.iArrFld));
        FuzzerUtils.out.println("lArrFld = " + FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0026 _instance = new Test0026();
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  sMeth ->  sMeth vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth sMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
