// Generated by Java* Fuzzer test generator (1.0.001). Sat Aug 14 14:12:12 2021
public class Test {

    public static final int N = 400;

    public static long instanceCount=-1757217424L;
    public static byte byFld=-58;
    public static float fFld=65.255F;
    public static volatile double[] dArrFld =new double[N];
    public int[][] iArrFld =new int[N][N];

    static {
        FuzzerUtils.init(Test.dArrFld, 0.60712);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(double d, int i4) {


        i4 += i4;
        long meth_res = Double.doubleToLongBits(d) + i4;
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth1(int i3) {

        double d1=-2.9500;
        int i5=8;
        int i6=-57195;
        int i7=12546;
        int[] iArr =new int[N];

        FuzzerUtils.init(iArr, -3);

        iArr[(i3 >>> 1) % N] -= (int)(-fMeth(d1, i3));
        Test.instanceCount += i3;
        for (i5 = 1; 362 > i5; i5++) {
            i3 -= -98;
            i6 -= (int)d1;
            i7 >>= i7;
        }
        for (int i8 : iArr) {
            i8 = (int)d1;
        }
        vMeth1_check_sum += i3 + Double.doubleToLongBits(d1) + i5 + i6 + i7 + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i2) {

        float f=-2.264F;
        float[] fArr =new float[N];
        double d2=101.80889;
        int i9=55227;
        int i10=18302;
        int i11=-18836;
        int i12=-251;
        int[] iArr1 =new int[N];
        short s=-18769;
        boolean b=false;

        FuzzerUtils.init(fArr, -2.925F);
        FuzzerUtils.init(iArr1, -200);

        vMeth1(i2);
        fArr[(i2 >>> 1) % N] += 1;
        f += (float)d2;
        for (i9 = 3; i9 < 375; i9 += 2) {
            try {
                i10 = (iArr1[i9 - 1] % -6135);
                i2 = (i10 % i9);
                i2 = (167 / i9);
            } catch (ArithmeticException a_e) {}
            i10 -= (int)Test.instanceCount;
            i2 += s;
            fArr[i9] += i9;
            i2 = i10;
        }
        for (i11 = 3; i11 < 227; i11++) {
            i10 -= i2;
            if (b) break;
            Test.dArrFld[i11] = Test.instanceCount;
            i2 = i11;
            i2 = (int)Test.instanceCount;
        }
        vMeth_check_sum += i2 + Float.floatToIntBits(f) + Double.doubleToLongBits(d2) + i9 + i10 + s + i11 + i12 + (b ?
            1 : 0) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=-12419, i1=-1, i13=-39159, i14=4, i15=9, i16=7, i17=-215, i18=-249, i19=-13, i20=-116, i21=42057, i22=-6;
        float f1=-42.890F;
        double d3=18.84452;
        boolean b1=false;
        short s2=-3901;
        long[][] lArr =new long[N][N];
        byte[] byArr =new byte[N];

        FuzzerUtils.init(lArr, -42L);
        FuzzerUtils.init(byArr, (byte)31);

        for (i = 380; 20 < i; i -= 3) {
            vMeth(i1);
            i1 = i1;
            i1 = -108;
            i1 <<= Test.byFld;
            switch ((i % 10) + 108) {
            case 108:
                for (i13 = 2; i13 < 209; ++i13) {
                    i14 &= (int)Test.instanceCount;
                    for (f1 = 1; f1 < 2; ++f1) {
                        iArrFld[(int)(f1)][(-4 >>> 1) % N] += Test.byFld;
                        iArrFld[i - 1][i13] = (int)Test.instanceCount;
                        i1 <<= i1;
                        i15 >>= i15;
                    }
                    Test.fFld = i1;
                    switch ((((0 >>> 1) % 5) * 5) + 36) {
                    case 43:
                        lArr[i13 + 1][i13] -= i;
                        Test.instanceCount = i13;
                        break;
                    case 55:
                        for (i16 = 2; i16 > 1; --i16) {
                            iArrFld[i + 1] = iArrFld[i13];
                            d3 += i17;
                        }
                        i14 = -56354;
                        break;
                    case 52:
                        if (b1) {
                            for (i18 = 1; 2 > i18; ++i18) {
                                short s1=-15319;
                                i17 /= 193;
                                Test.fFld *= i1;
                                s1 += (short)163;
                                if (b1) continue;
                            }
                        } else {
                            for (i20 = 2; i20 > 1; i20--) {
                                d3 %= (i14 | 1);
                                if (b1) continue;
                            }
                        }
                        break;
                    case 39:
                        Test.byFld = (byte)i;
                        break;
                    case 41:
                        Test.instanceCount = i1;
                        break;
                    default:
                        iArrFld[i - 1][i13] *= s2;
                    }
                }
                break;
            case 109:
                Test.dArrFld[i + 1] += i22;
            case 110:
                Test.instanceCount += i19;
                break;
            case 111:
                i1 += i;
                break;
            case 112:
                i21 += (i - i16);
            case 113:
                byArr = byArr;
                break;
            case 114:
                Test.fFld /= (i21 | 1);
            case 115:
                i15 += (i * i);
                break;
            case 116:
                s2 = (short)i16;
                break;
            case 117:
                i17 = i13;
                break;
            default:
                i1 += (((i * Test.fFld) + i17) - i17);
            }
        }

        FuzzerUtils.out.println("i i1 i13 = " + i + "," + i1 + "," + i13);
        FuzzerUtils.out.println("i14 f1 i15 = " + i14 + "," + Float.floatToIntBits(f1) + "," + i15);
        FuzzerUtils.out.println("i16 i17 d3 = " + i16 + "," + i17 + "," + Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("i18 i19 b1 = " + i18 + "," + i19 + "," + (b1 ? 1 : 0));
        FuzzerUtils.out.println("i20 i21 s2 = " + i20 + "," + i21 + "," + s2);
        FuzzerUtils.out.println("i22 lArr byArr = " + i22 + "," + FuzzerUtils.checkSum(lArr) + "," +
            FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.fFld = " + Test.instanceCount + "," + Test.byFld +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.dArrFld iArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld))
            + "," + FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  fMeth ->  fMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}