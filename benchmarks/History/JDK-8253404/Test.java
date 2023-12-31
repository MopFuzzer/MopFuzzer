// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep 18 10:14:12 2020
public class Test {

    public static final int N = 400;

    public static long instanceCount=-157L;
    public int iFld=-3765;
    public byte byFld=-55;
    public double dFld=-1.48516;
    public float fFld=-62.741F;
    public long[][] lArrFld =new long[N][N];
    public float[] fArrFld =new float[N];
    public static volatile int[] iArrFld =new int[N];
    public volatile short[] sArrFld =new short[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -47);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i1=-15580;
        int i2=6;
        int i3=0;
        int i4=-13;
        int i5=-35;
        int i6=-3;
        int[] iArr =new int[N];
        short s=23041;
        byte by1=119;
        float f1=-2.453F;
        long[] lArr =new long[N];
        double[] dArr =new double[N];

        FuzzerUtils.init(iArr, -7);
        FuzzerUtils.init(lArr, -2508829661162070758L);
        FuzzerUtils.init(dArr, 1.16068);

        for (i1 = 11; i1 < 215; i1 += 2) {
            Test.instanceCount += (i1 * i1);
            iArr[i1] >>>= i1;
            Test.instanceCount >>= i1;
            for (i3 = 1; 15 > i3; i3++) {
                for (i5 = 2; 1 < i5; --i5) {
                    i6 *= i2;
                    iArr[i1 + 1] = i2;
                    s = by1;
                    lArr[i1] = Test.instanceCount;
                    Test.instanceCount >>= by1;
                    f1 = i2;
                    i6 += i5;
                    i4 -= i4;
                }
                dArr[i3 - 1] = i6;
            }
        }
        vMeth1_check_sum += i1 + i2 + i3 + i4 + i5 + i6 + s + by1 + Float.floatToIntBits(f1) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void vMeth() {

        double d=24.110845;
        int i7=-229;
        int i8=63663;
        int i9=45647;
        int i10=3;
        int[] iArr1 =new int[N];
        float f2=34.1005F;

        FuzzerUtils.init(iArr1, 17645);

        vMeth1();
        iArr1[(iFld >>> 1) % N] *= (int)d;
        for (i7 = 6; i7 < 259; i7 += 3) {
            lArrFld[i7 - 1][i7] <<= i8;
            switch ((i7 % 1) + 99) {
            case 99:
                d += Test.instanceCount;
                i8 -= (int)f2;
                i8 = (int)f2;
                i8 = byFld;
                break;
            }
            i8 = i7;
            Test.instanceCount -= 19848;
            Test.instanceCount += (((i7 * i8) + Test.instanceCount) - Test.instanceCount);
            for (i9 = 1; i9 < 18; ++i9) {
                i8 += (i9 + i8);
                f2 = i7;
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + i7 + i8 + Float.floatToIntBits(f2) + i9 + i10 +
            FuzzerUtils.checkSum(iArr1);
    }

    public long lMeth(boolean b, int i, byte by) {

        float f=0.745F;
        int i11=-8, i12=-1;
        short s1=-22106;

        i = (int)Math.max((long)((-5 + (++i)) + (f * i)), (-iFld) + Test.instanceCount);
        Test.instanceCount *= i;
        vMeth();
        for (float f3 : fArrFld) {
            iFld <<= iFld;
            switch (((iFld >>> 1) % 10) + 63) {
            case 63:
                Test.iArrFld = Test.iArrFld;
                break;
            case 64:
                dFld *= i;
                for (i11 = 1; i11 < 4; i11++) {
                    Test.iArrFld[i11 - 1] += byFld;
                    switch ((i11 % 8) + 105) {
                    case 105:
                        i12 -= (int)f3;
                        try {
                            i = (i / i12);
                            iFld = (-59 / i12);
                            iFld = (-163 % Test.iArrFld[i11 + 1]);
                        } catch (ArithmeticException a_e) {}
                        Test.iArrFld = Test.iArrFld;
                        i &= i12;
                        break;
                    case 106:
                        s1 >>= (short)i11;
                        break;
                    case 107:
                        Test.instanceCount >>>= iFld;
                        break;
                    case 108:
                        i12 += (int)Test.instanceCount;
                        break;
                    case 109:
                        Test.instanceCount += i11;
                    case 110:
                        Test.iArrFld[(i11 >>> 1) % N] ^= -26854;
                        break;
                    case 111:
                        i += byFld;
                        break;
                    case 112:
                    default:
                        f3 = 452;
                    }
                }
            case 65:
                sArrFld[(i12 >>> 1) % N] = (short)iFld;
            case 66:
                if (b) continue;
                break;
            case 67:
                i *= i11;
                break;
            case 68:
                if (false) break;
                break;
            case 69:
                s1 = (short)i;
                break;
            case 70:
                f3 = i;
                break;
            case 71:
                i = iFld;
            case 72:
                i -= -102;
                break;
            }
        }
        long meth_res = (b ? 1 : 0) + i + by + Float.floatToIntBits(f) + i11 + i12 + s1;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        boolean b1=true;
        int i13=38219, i16=39922, i17=-71, i19=-8, i20=-47;

        lMeth(b1, iFld, byFld);
        i13 = 1;
        while (++i13 < 200) {
            int i14=-223;
            if (b1) {
                if (false) break;
                try {
                    Test.iArrFld[i13 + 1] = (iFld % iFld);
                    iFld = (61788 / i14);
                    iFld = (-8668 / Test.iArrFld[i13 - 1]);
                } catch (ArithmeticException a_e) {}
                if (b1) break;
                Test.instanceCount += (13 + (i13 * i13));
            } else if (b1) {
                switch (((i13 % 2) * 5) + 14) {
                case 21:
                    for (i16 = 1; i16 < 126; i16 += 2) {
                        int i18=35;
                        fFld += (i16 + i14);
                        i17 = (int)Test.instanceCount;
                        fFld *= Test.instanceCount;
                        Test.instanceCount <<= i16;
                        Test.instanceCount &= i14;
                        Test.iArrFld[i16] = (int)fFld;
                        iFld = i13;
                        i18 -= (int)fFld;
                        Test.instanceCount = i18;
                    }
                    try {
                        iFld = (103 % i14);
                        i17 = (i16 % Test.iArrFld[i13]);
                        i17 = (-166 % i17);
                    } catch (ArithmeticException a_e) {}
                    if (b1) continue;
                    Test.iArrFld[i13] *= (int)Test.instanceCount;
                    break;
                case 24:
                    byFld += (byte)i13;
                    i17 += (i13 * i13);
                    break;
                }
                i17 = i14;
                iFld *= -8;
                fFld -= 14566;
            } else if (b1) {
                i14 = i14;
                for (i19 = 6; i19 < 126; ++i19) {
                    i17 += (-8 + (i19 * i19));
                    b1 = b1;
                }
            } else {
                fFld += (i13 * i13);
            }
        }

        FuzzerUtils.out.println("b1 i13 i16 = " + (b1 ? 1 : 0) + "," + i13 + "," + i16);
        FuzzerUtils.out.println("i17 i19 i20 = " + i17 + "," + i19 + "," + i20);

        FuzzerUtils.out.println("Test.instanceCount iFld byFld = " + Test.instanceCount + "," + iFld + "," + byFld);
        FuzzerUtils.out.println("dFld fFld lArrFld = " + Double.doubleToLongBits(dFld) + "," +
            Float.floatToIntBits(fFld) + "," + FuzzerUtils.checkSum(lArrFld));
        FuzzerUtils.out.println("fArrFld Test.iArrFld sArrFld = " +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)) + "," + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            FuzzerUtils.checkSum(sArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
