// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:56 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-4952110139687195494L;
    public static boolean bFld=false;
    public byte byFld=64;
    public static volatile long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -14L);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(float f1) {

        double d1=-2.29895, d2=-27.124715;
        int i7=62964, i9=-2, i10=7838, i11=48, iArr1[]=new int[N];
        short s=-27854;

        FuzzerUtils.init(iArr1, -2);

        for (d1 = 3; d1 < 130; ++d1) {
            switch ((int)((d1 % 2) + 106)) {
            case 106:
                Test.lArrFld[(int)(d1 + 1)] = Test.instanceCount;
                i9 = 12;
                while (--i9 > 0) {
                    switch ((int)((d1 % 2) + 9)) {
                    case 9:
                        f1 += (((i9 * Test.instanceCount) + i7) - f1);
                    case 10:
                        for (i10 = 1; i10 < 1; i10++) {
                            if (Test.bFld) continue;
                        }
                        i7 += (int)(-57015L + (i9 * i9));
                        break;
                    default:
                        Test.instanceCount *= -744;
                        s >>= (short)Test.instanceCount;
                        if (Test.bFld) break;
                        d2 = i10;
                    }
                    iArr1[i9 + 1] = -25519;
                }
                i7 <<= (int)Test.instanceCount;
            case 107:
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f1) + Double.doubleToLongBits(d1) + i7 + i9 + i10 + i11 + s +
            Double.doubleToLongBits(d2) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(boolean b, int i6) {

        float f2=2.152F;
        short s1=-23090;
        int i13=8, i14=53847, i15=13268, iArr2[]=new int[N];
        long l1=0L;

        FuzzerUtils.init(iArr2, 88);

        vMeth1(f2);
        s1 >>= (short)i6;
        if (false) {
            for (int i12 : iArr2) {
                for (i13 = 1; 4 > i13; i13++) {
                    i6 -= (int)Test.instanceCount;
                    iArr2 = iArr2;
                    switch ((i13 % 9) + 117) {
                    case 117:
                    case 118:
                        f2 -= (float)-21.46226;
                        break;
                    case 119:
                        s1 += (short)(((i13 * i6) + f2) - i6);
                        i15 = 2;
                        while ((i15 -= 3) > 0) {
                            i14 -= i14;
                            Test.instanceCount = i15;
                            i12 /= (int)(Test.instanceCount | 1);
                            Test.instanceCount <<= i14;
                        }
                    case 120:
                        i14 += (int)Test.instanceCount;
                    case 121:
                        i12 -= i15;
                        break;
                    case 122:
                        Test.instanceCount -= 49991;
                        break;
                    case 123:
                        l1 += (((i13 * i13) + Test.instanceCount) - i12);
                    case 124:
                        if (b) continue;
                        break;
                    case 125:
                        i12 -= (int)l1;
                    }
                }
            }
        } else if (b) {
            i14 = i6;
        }
        vMeth_check_sum += (b ? 1 : 0) + i6 + Float.floatToIntBits(f2) + s1 + i13 + i14 + i15 + l1 +
            FuzzerUtils.checkSum(iArr2);
    }

    public static long lMeth(int i4, int i5) {


        vMeth(true, i5);
        i5 = i4;
        long meth_res = i4 + i5;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr3) {

        int i=15387, i2=130, i3=7, i16=-148, i17=15261, iArr[]=new int[N];
        float f=101.480F, fArr[]=new float[N];
        long l=3130428420L;
        double d=-62.95786;

        FuzzerUtils.init(fArr, -2.596F);
        FuzzerUtils.init(iArr, -12);

        i = 1;
        do {
            int i1=-52578;
            fArr[i - 1] -= (-(iArr[i - 1]++));
            i1 += (i1--);
            switch (((i % 2) * 5) + 82) {
            case 84:
                i1 -= i1;
                i2 = 1;
                while (++i2 < 114) {
                    i1 *= (int)((-1164313259L * (i1++)) + f);
                    for (l = 1; l > i2; --l) {
                        i3 = ((i1--) - iArr[i2 - 1]);
                        Test.instanceCount += (((l * l) + Test.instanceCount) - f);
                        d *= (((-lMeth(10, 91)) + -4471452653683265551L) + i3);
                        i16 = byFld;
                        Test.lArrFld[i2 - 1] *= i1;
                    }
                    f += Test.instanceCount;
                    i16 += -3;
                    if (Test.bFld) continue;
                    f *= -59928;
                    i1 += i2;
                    i17 = 1;
                    do {
                        Test.instanceCount += i17;
                        switch ((i % 2) + 32) {
                        case 32:
                            i3 = i;
                            i1 *= (int)Test.instanceCount;
                            try {
                                iArr[i2 + 1] = (i / iArr[(i >>> 1) % N]);
                                iArr[i17 + 1] = (i17 % iArr[i]);
                                i16 = (179 / iArr[i17]);
                            } catch (ArithmeticException a_e) {}
                            Test.instanceCount *= i16;
                            break;
                        case 33:
                            i16 ^= i17;
                            Test.lArrFld[i2 + 1] = i2;
                            fArr[i17 - 1] /= (i | 1);
                            iArr[i17 - 1] -= (int)d;
                            break;
                        }
                        i1 >>= (int)Test.instanceCount;
                    } while (++i17 < 1);
                }
                break;
            case 86:
                i3 += (i | i);
                break;
            default:
                i3 = i1;
            }
        } while (++i < 221);

        FuzzerUtils.out.println("i i2 f = " + i + "," + i2 + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("l i3 d = " + l + "," + i3 + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("i16 i17 fArr = " + i16 + "," + i17 + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));
        FuzzerUtils.out.println("iArr = " + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld byFld = " + Test.instanceCount + "," + (Test.bFld ? 1 :
            0) + "," + byFld);
        FuzzerUtils.out.println("Test.lArrFld = " + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }
    public static void main(String[] strArr2) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr2);
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
