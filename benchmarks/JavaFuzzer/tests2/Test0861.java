// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:52 2023
public class Test0861 {

    public static final int N = 400;

    public static long instanceCount=-35404L;
    public static int iFld=65;
    public static byte byFld=-77;
    public static float[] fArrFld =new float[N];
    public static short[] sArrFld =new short[N];
    public static double[] dArrFld =new double[N];

    static {
        FuzzerUtils.init(Test0861.fArrFld, -4.639F);
        FuzzerUtils.init(Test0861.sArrFld, (short) 23522);
        FuzzerUtils.init(Test0861.dArrFld, 1.76785);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vSmallMeth_check_sum = 0;
    public static long lMeth1_check_sum = 0;

    public static long lMeth(float f1, long l, float f2) {

        short s=22807;
        int i3=-53381;
        int[] iArr =new int[N];

        FuzzerUtils.init(iArr, 8);

        f1 = s;
        iArr[(i3 >>> 1) % N] = (int) ((i3 | (i3++)) + ((i3 += (int) Test0861.instanceCount) * 9799));
        long meth_res = Float.floatToIntBits(f1) + l + Float.floatToIntBits(f2) + s + i3 + FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(float f) {

        int i2=-36890;

        i2 += (int) lMeth(Float.intBitsToFloat(i2 + i2), ++Test0861.instanceCount, 48.89F + lMeth(f, Test0861.instanceCount, f));
        vMeth_check_sum += Float.floatToIntBits(f) + i2;
    }

    public static long lMeth1() {

        float f3=-36.468F, f4=107.515F;
        int i5=-122;
        int i6=-12605;
        int i7=179;
        int i8=56;
        int i9=-48728;
        int i10=-7;
        int i11=-94;
        int i12=-13;
        int i13=40;
        int[] iArr1 =new int[N];
        int[] iArr2 =new int[N];
        boolean b=true;
        short s2=12584;
        long l1=2332015565L;
        double d1=-7.37459;
        byte[][] byArr =new byte[N][N];

        FuzzerUtils.init(iArr1, 37618);
        FuzzerUtils.init(byArr, (byte)-25);
        FuzzerUtils.init(iArr2, -21482);

        vMeth(f3);
        switch (((Test0861.iFld >>> 1) % 8) + 86) {
        case 86:
            for (i5 = 12; 338 > i5; i5++) {
                iArr1[i5 + 1] <<= i5;
                for (i7 = 1; i7 < 5; ++i7) {
                    iArr1[i5] -= (int)f3;
                    for (i9 = 1; 2 > i9; i9++) {
                        f3 += Test0861.iFld;
                        Test0861.iFld += i9;
                        Test0861.fArrFld[i5 + 1] = -236;
                        if (i10 != 0) {
                        }
                        switch (i7 + 34) {
                        case 34:
                            Test0861.instanceCount |= 12286;
                            i10 -= (int) Test0861.instanceCount;
                            iArr1[i5 + 1] = (int) Test0861.instanceCount;
                        case 35:
                            Test0861.instanceCount = -65469;
                            break;
                        case 36:
                            Test0861.instanceCount += (i9 | Test0861.instanceCount);
                        case 37:
                            i10 = (int) Test0861.instanceCount;
                        case 38:
                            i6 += i9;
                            break;
                        case 39:
                            Test0861.instanceCount = -31;
                            break;
                        case 40:
                            i10 += (int)f3;
                            break;
                        case 41:
                        case 42:
                            b = b;
                            break;
                        case 43:
                            iArr1[i5] += Test0861.iFld;
                            break;
                        case 44:
                            if (b) continue;
                            break;
                        case 45:
                            iArr1[i9 - 1] -= i10;
                            break;
                        case 46:
                            s2 *= (short)i7;
                            break;
                        case 47:
                            iArr1[i5] <<= -29;
                            break;
                        case 48:
                            byArr[i9][i9 - 1] *= (byte)i9;
                            break;
                        case 49:
                            f3 += i9;
                        case 50:
                            Test0861.sArrFld[i7] -= (short) 4585;
                        case 51:
                            if (b) break;
                        case 52:
                            iArr1 = iArr1;
                            break;
                        case 53:
                            i8 += i7;
                            break;
                        case 54:
                            Test0861.instanceCount += (((i9 * i8) + Test0861.iFld) - i8);
                            break;
                        case 55:
                            i10 = -39258;
                            break;
                        case 56:
                            Test0861.instanceCount -= i7;
                            break;
                        case 57:
                            i6 += (((i9 * s2) + f3) - l1);
                        case 58:
                            i8 *= i11;
                            break;
                        case 59:
                            i11 = (int)d1;
                            break;
                        case 60:
                            iArr1[i5 - 1] = (int)l1;
                            break;
                        case 61:
                        case 62:
                            b = b;
                        case 63:
                        case 64:
                            iArr1[i7 + 1] |= Test0861.iFld;
                            break;
                        case 65:
                            f3 *= i11;
                            break;
                        case 66:
                            if (b) break;
                            break;
                        case 67:
                            if (b) break;
                            break;
                        case 68:
                            Test0861.instanceCount += (long) d1;
                        case 69:
                            if (b) break;
                            break;
                        case 70:
                            Test0861.iFld = (int) Test0861.instanceCount;
                            break;
                        case 71:
                            iArr1[i7] *= i6;
                            break;
                        case 72:
                            l1 = 14;
                            break;
                        case 73:
                            Test0861.instanceCount >>= i9;
                            break;
                        case 74:
                            Test0861.fArrFld[i9] = 716058158L;
                            break;
                        case 75:
                            try {
                                i10 = (199 / i9);
                                i10 = (i5 % i11);
                                i10 = (i9 / i8);
                            } catch (ArithmeticException a_e) {}
                        case 76:
                            Test0861.iFld += i6;
                            break;
                        case 77:
                            b = b;
                        case 78:
                            Test0861.instanceCount = i10;
                        case 79:
                            i12 -= i11;
                            break;
                        case 80:
                            l1 += i9;
                        case 81:
                            i12 = (int)f3;
                            break;
                        case 82:
                            d1 = l1;
                            break;
                        case 83:
                            i12 += (((i9 * i9) + i7) - l1);
                            break;
                        case 84:
                            iArr2[i7 + 1] <<= 5;
                            break;
                        case 85:
                        case 86:
                            i10 -= (int)f4;
                            break;
                        case 87:
                            i13 += (int)-2.62F;
                            break;
                        case 88:
                            d1 += s2;
                            break;
                        case 89:
                        case 90:
                            d1 -= -41623;
                            break;
                        case 91:
                            iArr1[(i8 >>> 1) % N] <<= i11;
                            break;
                        case 92:
                            if (b) break;
                        case 93:
                            i10 >>= i7;
                            break;
                        case 94:
                            i8 += (((i9 * i10) + l1) - i6);
                            break;
                        case 95:
                            i13 = i5;
                            break;
                        case 96:
                            if (b) break;
                            break;
                        case 97:
                            l1 <<= 39482;
                            break;
                        case 98:
                            s2 = (short)38592;
                            break;
                        case 99:
                            f3 += (((i9 * Test0861.iFld) + f4) - i9);
                            break;
                        case 100:
                            l1 += (i9 * i9);
                            break;
                        case 101:
                            f3 += (i9 - i9);
                            break;
                        case 102:
                            i10 = (int)l1;
                            break;
                        case 103:
                            i8 -= -90;
                            break;
                        default:
                            Test0861.iFld = (int) d1;
                        }
                    }
                }
            }
            break;
        case 87:
            f3 = -83;
            break;
        case 88:
            iArr2[(i13 >>> 1) % N] += (int) Test0861.instanceCount;
            break;
        case 89:
            iArr2[(i7 >>> 1) % N] = i7;
            break;
        case 90:
            Test0861.dArrFld = Test0861.dArrFld;
            break;
        case 91:
            i13 = Test0861.byFld;
        case 92:
            Test0861.instanceCount += i10;
            break;
        case 93:
            i8 += Test0861.iFld;
        default:
            i13 |= i13;
        }
        long meth_res = Float.floatToIntBits(f3) + i5 + i6 + i7 + i8 + i9 + i10 + (b ? 1 : 0) + s2 + l1 + i11 +
            Double.doubleToLongBits(d1) + i12 + Float.floatToIntBits(f4) + i13 + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr2);
        lMeth1_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vSmallMeth(byte by, int i4) {


        i4 = (int)(i4 - lMeth1());
        vSmallMeth_check_sum += by + i4;
    }

    public void mainTest(String[] strArr1) {

        int i=8, i1=-57340;
        double d=1.75243;
        short s1=-17469;
        boolean b1=true;
        boolean[] bArr =new boolean[N];

        FuzzerUtils.init(bArr, false);

        for (i = 4; i < 289; ++i) {
            Test0861.instanceCount -= i1;
            vMeth((float)(((d - i1) * (i1 - i1)) * 25323));
            s1 += (short)(i * i);
            for (int smallinvoc = 0; smallinvoc < 62; smallinvoc++) vSmallMeth(Test0861.byFld, -252);
            Test0861.iFld += (i * i);
            i1 ^= i;
        }
        bArr[(Test0861.iFld >>> 1) % N] = b1;
        i1 = (int)-2.533F;

        FuzzerUtils.out.println("i i1 d = " + i + "," + i1 + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("s1 b1 bArr = " + s1 + "," + (b1 ? 1 : 0) + "," + FuzzerUtils.checkSum(bArr));

        FuzzerUtils.out.println("Test0861.instanceCount Test0861.iFld Test0861.byFld = " + Test0861.instanceCount + "," + Test0861.iFld +
                "," + Test0861.byFld);
        FuzzerUtils.out.println("Test0861.fArrFld Test0861.sArrFld Test0861.dArrFld = " +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0861.fArrFld)) + "," + FuzzerUtils.checkSum(Test0861.sArrFld) +
                "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0861.dArrFld)));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth1_check_sum: " + lMeth1_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0861 _instance = new Test0861();
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
//DEBUG  vMeth ->  vMeth mainTest lMeth1 vSmallMeth Test
//DEBUG  lMeth ->  lMeth vMeth mainTest lMeth1 vSmallMeth Test
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  lMeth1 ->  lMeth1 vSmallMeth mainTest Test
//DEBUG  Depth = 4
//DEBUG  Classes = 1
//DEBUG  static objects = {}
