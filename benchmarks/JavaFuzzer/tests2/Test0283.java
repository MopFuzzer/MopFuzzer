// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:25 2023
public class Test0283 {

    public static final int N = 400;

    public static long instanceCount=-55247L;
    public static volatile float fFld=1.596F;
    public static int iFld=-13;
    public static boolean bFld=true;
    public static byte byFld=-70;
    public volatile int iFld1=168;
    public static byte[] byArrFld =new byte[N];

    static {
        FuzzerUtils.init(Test0283.byArrFld, (byte) 121);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i4, float f, long l1) {

        double d=-108.117347, d1=-122.111240;
        int i5=-217;
        int i6=-50008;
        int i7=-189;
        int i8=-7;
        int[] iArr1 =new int[N];
        boolean b1=true;
        short s=30746;
        float[] fArr =new float[N];

        FuzzerUtils.init(iArr1, 221);
        FuzzerUtils.init(fArr, -71.510F);

        iArr1[(13 >>> 1) % N] += (int)d;
        fArr[(i4 >>> 1) % N] *= -106.429F;
        i5 = 1;
        do {
            Test0283.instanceCount %= -23540;
            for (d1 = i5; d1 < 5; ++d1) {
                try {
                    i6 = (i6 / i4);
                    i6 = (i4 / -185);
                    i6 = (i4 / 17506);
                } catch (ArithmeticException a_e) {}
                try {
                    i4 = (i6 / i5);
                    iArr1[i5] = (iArr1[i5 + 1] % iArr1[(int)(d1 + 1)]);
                    i6 = (i4 % 212);
                } catch (ArithmeticException a_e) {}
                if (b1) break;
                i7 = 1;
                do {
                    s -= (short)i7;
                    iArr1[(int)(d1 + 1)] += 43285;
                } while (++i7 < 1);
                if (b1) continue;
            }
            i4 += (int)l1;
            i4 = i6;
            i8 /= (int)(l1 | 1);
        } while (++i5 < 347);
        vMeth1_check_sum += i4 + Float.floatToIntBits(f) + l1 + Double.doubleToLongBits(d) + i5 +
            Double.doubleToLongBits(d1) + i6 + (b1 ? 1 : 0) + i7 + s + i8 + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth(boolean b) {

        int i9=-14;
        int i10=161;
        int[] iArr2 =new int[N];
        long l2=3L;
        long[] lArr =new long[N];
        double d2=74.46652, d3=83.91662;
        byte by=114;
        short[] sArr =new short[N];

        FuzzerUtils.init(lArr, -1268181068777655360L);
        FuzzerUtils.init(sArr, (short)-16071);
        FuzzerUtils.init(iArr2, -39686);

        vMeth1(i9, -1.959F, l2);
        if (b) {
            i9 *= i9;
        } else if (b) {
            Test0283.instanceCount += (long) Test0283.fFld;
        }
        i9 = 235;
        for (long l3 : lArr) {
            if (i9 != 0) {
                vMeth_check_sum += (b ? 1 : 0) + i9 + l2 + Double.doubleToLongBits(d2) + by +
                    Double.doubleToLongBits(d3) + i10 + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(sArr) +
                    FuzzerUtils.checkSum(iArr2);
                return;
            }
            i9 -= (int)d2;
            i9 /= (int)(by | 1);
            i9 = i9;
            l3 *= Test0283.iFld;
            for (d3 = 1; d3 < 4; ++d3) {
                i10 += (int)d3;
                try {
                    Test0283.iFld = (Test0283.iFld / Test0283.iFld);
                    i9 = (i10 % i9);
                    i9 = (Test0283.iFld / i10);
                } catch (ArithmeticException a_e) {}
                iArr2[(int)(d3 + 1)] = (int)l3;
            }
        }
        vMeth_check_sum += (b ? 1 : 0) + i9 + l2 + Double.doubleToLongBits(d2) + by + Double.doubleToLongBits(d3) + i10
            + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr2);
    }

    public static int iMeth(int i2) {

        long l=188L;
        int i3=-252;
        int i11=40203;
        int i12=37;
        int i13=243;
        int i14=221;
        int[][] iArr3 =new int[N][N];
        int[] iArr4 =new int[N];
        double d4=2.110459;

        FuzzerUtils.init(iArr3, -37503);
        FuzzerUtils.init(iArr4, 14);

        Test0283.byArrFld[(i2 >>> 1) % N] = (byte) (++i2);
        for (l = 13; l < 261; l++) {
            vMeth(Test0283.bFld);
        }
        d4 += i2;
        for (i11 = 2; i11 < 331; ++i11) {
            i2 *= i11;
            i12 += (i11 + Test0283.instanceCount);
            switch ((i11 % 5) + 88) {
            case 88:
                Test0283.instanceCount *= Test0283.iFld;
                for (i13 = 5; i13 > i11; --i13) {
                    i14 += i13;
                    if (Test0283.bFld) break;
                    i2 -= i2;
                }
                iArr3[i11][i11 + 1] = (int)l;
                i2 -= (int)-38532L;
            case 89:
                Test0283.fFld -= 90L;
                break;
            case 90:
                i12 += (int)l;
                break;
            case 91:
                if (Test0283.bFld) break;
                break;
            case 92:
            default:
                Test0283.fFld = -14;
            }
        }
        long meth_res = i2 + l + i3 + Double.doubleToLongBits(d4) + i11 + i12 + i13 + i14 + FuzzerUtils.checkSum(iArr3)
            + FuzzerUtils.checkSum(iArr4);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-4466;
        int i1=-9;
        int i17=-47378;
        int i18=-190;
        int i19=-1;
        int[] iArr =new int[N];
        long l4=-7L;
        double d5=73.64532;
        short s2=12984;

        FuzzerUtils.init(iArr, 61647);

        for (i = 2; i < 380; i += 3) {
            i1 = iArr[i];
            i1 |= iMeth(i1);
            Test0283.fFld += Test0283.iFld;
            iArr[i - 1] = i;
            Test0283.iFld |= Test0283.iFld;
            Test0283.iFld = (int) -57872L;
            l4 *= (long) Test0283.fFld;
            if (Test0283.bFld) {
                i1 = i1;
                i1 = (int)l4;
                Test0283.instanceCount = i;
            } else if (Test0283.bFld) {
                i17 = 1;
                do {
                    Test0283.fFld -= i;
                    d5 = Test0283.iFld;
                    for (i18 = 1; i18 < 1; ++i18) {
                        Test0283.iFld >>= Test0283.byFld;
                        l4 += Test0283.instanceCount;
                        Test0283.fFld = Test0283.iFld;
                        i1 = i1;
                        l4 -= -11;
                        Test0283.iFld += i19;
                        i19 += (int)l4;
                        s2 += (short)i18;
                        switch ((i17 % 8) + 39) {
                        case 39:
                            Test0283.iFld = i1;
                            Test0283.byFld += (byte) (((i18 * Test0283.fFld) + Test0283.fFld) - Test0283.iFld);
                            l4 ^= i18;
                        case 40:
                            Test0283.iFld += Test0283.iFld;
                            i19 += (i18 | Test0283.instanceCount);
                            break;
                        case 41:
                        case 42:
                            i1 = i18;
                            break;
                        case 43:
                            Test0283.iFld += (i18 - l4);
                            break;
                        case 44:
                            iArr[i18 - 1] = iFld1;
                            break;
                        case 45:
                        case 46:
                            Test0283.instanceCount /= (Test0283.iFld | 1);
                            break;
                        default:
                            Test0283.iFld *= i17;
                        }
                    }
                } while (++i17 < 199);
            } else {
                i19 += (i * i18);
            }
        }

        FuzzerUtils.out.println("i i1 l4 = " + i + "," + i1 + "," + l4);
        FuzzerUtils.out.println("i17 d5 i18 = " + i17 + "," + Double.doubleToLongBits(d5) + "," + i18);
        FuzzerUtils.out.println("i19 s2 iArr = " + i19 + "," + s2 + "," + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test0283.instanceCount Test0283.fFld Test0283.iFld = " + Test0283.instanceCount + "," +
                Float.floatToIntBits(Test0283.fFld) + "," + Test0283.iFld);
        FuzzerUtils.out.println("Test0283.bFld Test0283.byFld iFld1 = " + (Test0283.bFld ? 1 : 0) + "," + Test0283.byFld + "," + iFld1);
        FuzzerUtils.out.println("Test0283.byArrFld = " + FuzzerUtils.checkSum(Test0283.byArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0283 _instance = new Test0283();
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}