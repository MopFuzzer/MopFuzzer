// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:53 2023
public class Test0885 {

    public static final int N = 400;

    public static long instanceCount=-3022378210L;
    public int iFld=7;
    public static int iFld1=35323;
    public float[] fArrFld =new float[N];
    public volatile boolean[] bArrFld =new boolean[N];

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth(int i, int i1) {

        short s=9536;

        i1 = (s = (short)((-(0 - i1)) + (i + i1)));
        vMeth_check_sum += i + i1 + s;
    }

    public static void vMeth1(int i2, int i3) {

        int i4=5;
        int i5=-6;
        int i6=8800;
        int[] iArr =new int[N];
        double d1=-2.25164;
        float f1=1.615F;
        short s1=-10658;
        boolean b=false;

        FuzzerUtils.init(iArr, 14);

        vMeth(i2, i3);
        Test0885.instanceCount |= i3;
        if (b) {
            for (i4 = 14; i4 < 318; ++i4) {
                for (d1 = 1; d1 < 5; d1 += 3) {
                    f1 = 227;
                    f1 += (float)((long)d1 ^ (long)i2);
                    Test0885.instanceCount -= (long) d1;
                    Test0885.instanceCount -= i4;
                    switch ((i4 % 1) + 43) {
                    case 43:
                        i3 *= (int)f1;
                        i5 = -73;
                        s1 = (short)i4;
                        i3 <<= (int) Test0885.instanceCount;
                        break;
                    }
                }
                iArr[i4 + 1] <<= 0;
            }
        } else if (b) {
            s1 = (short)i4;
        }
        vMeth1_check_sum += i2 + i3 + i4 + i5 + Double.doubleToLongBits(d1) + i6 + Float.floatToIntBits(f1) + s1 + (b ?
            1 : 0) + FuzzerUtils.checkSum(iArr);
    }

    public long lMeth(long l, byte by, float f) {

        double d=0.52675;
        int i7=-3;

        vMeth((int)(Float.intBitsToFloat(--iFld) - (-69 * (f = iFld))), (int)(d * (++d)));
        vMeth1(iFld, iFld);
        by <<= (byte)iFld;
        i7 = 1;
        do {
            iFld -= iFld;
            iFld = Test0885.iFld1;
        } while (++i7 < 353);
        fArrFld[(iFld >>> 1) % N] -= f;
        f = -37876L;
        f *= -18663L;
        long meth_res = l + by + Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i7;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        byte by1=33;
        float f2=0.161F, f3=10.1001F;
        int i8=41007;
        int i9=-12;
        int i10=-9;
        int i11=-9;
        int i12=154;
        int i13=103;
        int i14=56305;
        int i15=40621;
        int i16=-7;
        int i17=14;
        int[] iArr1 =new
                    int[N];
        double d2=-2.72695;
        short s2=-5025;

        FuzzerUtils.init(iArr1, -244);

        vMeth(iFld, iFld);
        fArrFld[(iFld >>> 1) % N] = ((-4469853018173302779L + lMeth(Test0885.instanceCount, by1, f2)) * Test0885.instanceCount);
        iArr1[(iFld >>> 1) % N] = -90;
        for (f3 = 4; f3 < 130; ++f3) {
            i9 += (int) Test0885.instanceCount;
            try {
                i9 = (iFld / -77);
                i8 = (-35264 % iFld);
                i9 = (-35813 % i8);
            } catch (ArithmeticException a_e) {}
            for (i10 = 12; i10 < 199; i10++) {
                i11 -= (int)1.147F;
            }
            for (i12 = 199; i12 > 2; i12 -= 3) {
                f2 -= Test0885.instanceCount;
                i11 += i13;
                Test0885.instanceCount >>= i8;
                d2 *= i13;
                i13 <<= Test0885.iFld1;
                for (i14 = 1; i14 < 4; ++i14) {
                    Test0885.instanceCount += (3L + (i14 * i14));
                    Test0885.instanceCount *= 47;
                    iFld += (i14 | Test0885.instanceCount);
                    f2 *= 31;
                    f2 += i14;
                    iFld = (int) Test0885.instanceCount;
                    i8 = Test0885.iFld1;
                }
            }
            bArrFld = bArrFld;
        }
        Test0885.instanceCount += i8;
        Test0885.instanceCount = Test0885.instanceCount;
        for (i16 = 7; i16 < 152; i16++) {
            s2 = (short)4779;
            i13 += (i16 - Test0885.instanceCount);
            iFld = i17;
            d2 = i8;
        }

        FuzzerUtils.out.println("by1 f2 f3 = " + by1 + "," + Float.floatToIntBits(f2) + "," + Float.floatToIntBits(f3));
        FuzzerUtils.out.println("i8 i9 i10 = " + i8 + "," + i9 + "," + i10);
        FuzzerUtils.out.println("i11 i12 i13 = " + i11 + "," + i12 + "," + i13);
        FuzzerUtils.out.println("d2 i14 i15 = " + Double.doubleToLongBits(d2) + "," + i14 + "," + i15);
        FuzzerUtils.out.println("i16 i17 s2 = " + i16 + "," + i17 + "," + s2);
        FuzzerUtils.out.println("iArr1 = " + FuzzerUtils.checkSum(iArr1));

        FuzzerUtils.out.println("Test0885.instanceCount iFld Test0885.iFld1 = " + Test0885.instanceCount + "," + iFld + "," +
                Test0885.iFld1);
        FuzzerUtils.out.println("fArrFld bArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)) + "," +
            FuzzerUtils.checkSum(bArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0885 _instance = new Test0885();
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
//DEBUG  vMeth ->  vMeth mainTest lMeth vMeth1
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}