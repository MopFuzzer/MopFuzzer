// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:05 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=8020928990064778971L;
    public static boolean bFld=false;
    public static float fFld=-101.454F;
    public static int iFld=-112;

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i5) {

        int i6=-56043, i7=631, i8=-3, i9=-7, i10=123;
        float f=20.482F;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, false);

        i6 = 1;
        while (++i6 < 221) {
            i5 += (i6 | Test.instanceCount);
            for (i7 = 7; i7 > 1; --i7) {
                i8 = i5;
                f -= -81;
                Test.bFld = Test.bFld;
                bArr[i6] = Test.bFld;
                for (i9 = i7; 2 > i9; i9++) {
                    f += Test.instanceCount;
                    f += (((i9 * Test.instanceCount) + i6) - i7);
                    i5 += i5;
                    i8 = i10;
                    bArr[i7 + 1] = Test.bFld;
                    i8 /= (int)((long)(f) | 1);
                    i5 &= (int)Test.instanceCount;
                }
            }
        }
        long meth_res = i5 + i6 + i7 + i8 + Float.floatToIntBits(f) + i9 + i10 + FuzzerUtils.checkSum(bArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth(double d, int i4) {

        int i11=63356, i12=-32503, i13=42582, i14=11;
        float f1=1.28F;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -60.61755);

        Test.bFld = Test.bFld;
        i4 += iMeth(i4);
        i4 *= i4;
        i4 %= (int)(Test.instanceCount | 1);
        for (i11 = 9; 234 > i11; ++i11) {
            i4 >>= i4;
            for (i13 = 1; i13 < 7; i13++) {
                i4 = (int)Test.instanceCount;
                switch (((i13 % 4) * 5) + 64) {
                case 72:
                    i12 += (int)(7L + (i13 * i13));
                    f1 = 2;
                    while (--f1 > 0) {
                        float f2=15.704F;
                        f2 -= i4;
                    }
                    if (Test.bFld) continue;
                    Test.instanceCount = -2910;
                case 81:
                    i12 >>= i4;
                    break;
                case 73:
                    i12 -= (int)d;
                    break;
                case 80:
                    dArr[i11] += f1;
                }
            }
        }
        long meth_res = Double.doubleToLongBits(d) + i4 + i11 + i12 + i13 + i14 + Float.floatToIntBits(f1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i1, int i2, int i3) {

        double d1=59.119076, d2=-26.60561;
        int i15=-44, i16=-136, i17=10, i18=-4, iArr[]=new int[N];
        short s=-14333;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 1848178638910868599L);
        FuzzerUtils.init(iArr, -14);

        lArr[(i1 >>> 1) % N] >>>= Test.instanceCount;
        lMeth(d1, i3);
        Test.fFld -= i3;
        i2 = -209;
        i1 -= i1;
        i3 = i3;
        iArr[(i1 >>> 1) % N] <<= i3;
        i15 = 1;
        do {
            iArr[i15] = -8;
            i2 += i16;
            switch (((i15 % 5) * 5) + 55) {
            case 69:
                for (d2 = i15; d2 < 5; d2++) {
                    iArr[i15 + 1] ^= i15;
                    i16 = i3;
                    Test.instanceCount -= (long)Test.fFld;
                }
                break;
            case 67:
                i18 |= s;
            case 64:
                lArr[i15 - 1] <<= i15;
                break;
            case 75:
                i3 = (int)Test.instanceCount;
                break;
            case 57:
                Test.instanceCount -= Test.instanceCount;
                break;
            default:
                i16 *= (int)d1;
            }
        } while (++i15 < 372);
        vMeth_check_sum += i1 + i2 + i3 + Double.doubleToLongBits(d1) + i15 + i16 + Double.doubleToLongBits(d2) + i17 +
            i18 + s + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i=4, i19=0, i20=-13, i21=-17508, i22=9, i23=47448, iArr1[]=new int[N];
        float f3=2.518F;
        double d3=1.50173;
        short s1=-8502;
        byte by=-125;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr1, 7);
        FuzzerUtils.init(lArr1, -7388401608583192712L);

        i = 1;
        do {
            vMeth(i19, i19, i19);
            for (f3 = 1; f3 < 116; f3++) {
                i21 = 1;
                do {
                    if (true) break;
                    d3 = -35139;
                    i19 = i;
                    i19 = (int)6512227802175527541L;
                    Test.instanceCount >>>= i21;
                    Test.instanceCount += (((i21 * Test.iFld) + Test.instanceCount) - i19);
                    Test.fFld *= Test.instanceCount;
                    i20 += 148;
                    iArr1[i - 1] = i20;
                    iArr1[(int)(f3 + 1)] *= i;
                } while (++i21 < 2);
                switch ((int)((f3 % 2) + 16)) {
                case 16:
                    Test.iFld >>= (int)Test.instanceCount;
                    s1 ^= (short)1;
                    Test.instanceCount = Test.iFld;
                    i19 += (int)f3;
                case 17:
                    for (i22 = 1; i22 < 2; i22++) {
                        lArr1[i22] ^= by;
                        iArr1[i + 1] = (int)Test.instanceCount;
                        lArr1 = lArr1;
                        i20 = i20;
                        Test.bFld = Test.bFld;
                        Test.iFld *= 9;
                        i19 <<= i20;
                        i20 *= i20;
                        Test.instanceCount = i20;
                    }
                    Test.instanceCount *= (long)f3;
                    break;
                default:
                    i19 = i21;
                }
            }
        } while (++i < 217);

        FuzzerUtils.out.println("i i19 f3 = " + i + "," + i19 + "," + Float.floatToIntBits(f3));
        FuzzerUtils.out.println("i20 i21 d3 = " + i20 + "," + i21 + "," + Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("s1 i22 i23 = " + s1 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("by iArr1 lArr1 = " + by + "," + FuzzerUtils.checkSum(iArr1) + "," +
            FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.fFld = " + Test.instanceCount + "," + (Test.bFld ? 1
            : 0) + "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.iFld = " + Test.iFld);

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  iMeth ->  iMeth lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
