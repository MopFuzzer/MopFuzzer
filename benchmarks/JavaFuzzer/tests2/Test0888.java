// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:53 2023
public class Test0888 {

    public static final int N = 400;

    public static long instanceCount=-3263188332L;
    public static volatile long lFld=-107L;
    public static short sFld=-8545;
    public static volatile byte byFld=-43;
    public boolean bFld=true;
    public static int iFld=-147;
    public double dFld=1.17407;
    public volatile float[][] fArrFld =new float[N][N];
    public byte[] byArrFld =new byte[N];

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long iMeth2_check_sum = 0;

    public static int iMeth2(int i3) {

        int i4=5, i5=-13, i6=158, i7=14, i8=-12, i9=-5, i10=-122, i11=-8, i12=13;
        byte by1=-72;
        float f=-1.608F;
        double d2=64.4474;
        boolean b=true;
        boolean[] bArr =new boolean[N];
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -229L);
        FuzzerUtils.init(bArr, false);

        for (i4 = 16; i4 < 279; i4++) {
            lArr[i4] -= i3;
            for (i6 = 1; i6 < 6; i6 += 3) {
                for (i8 = 1; i8 < 6; ++i8) {
                    bArr = bArr;
                    i3 += (((i8 * Test0888.lFld) + Test0888.lFld) - i7);
                    i9 += i9;
                }
                Test0888.lFld = by1;
                lArr[i4 + 1] >>= i3;
                Test0888.lFld = (long) f;
                for (i10 = 1; i10 < 6; i10++) {
                    Test0888.instanceCount *= (long) d2;
                    Test0888.sFld += (short) i10;
                    if (i12 != 0) {
                    }
                    if (b) continue;
                }
            }
        }
        long meth_res = i3 + i4 + i5 + i6 + i7 + i8 + i9 + by1 + Float.floatToIntBits(f) + i10 + i11 +
            Double.doubleToLongBits(d2) + i12 + (b ? 1 : 0) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(bArr);
        iMeth2_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth1(int i2, byte by) {

        double d1=-1.86075;
        int i13=130;
        int i14=72;
        int i15=-75;
        int i16=-230;
        int i17=174;
        int i18=10;
        int[] iArr =new int[N];
        long l=9211L;

        FuzzerUtils.init(iArr, 90);

        i2 -= (++i2);
        d1 = 7;
        iMeth2(i2);
        d1 = i2;
        for (i13 = 8; i13 < 349; i13 += 3) {
            iArr[i13] *= i2;
            for (i15 = 1; i15 < 14; ++i15) {
                i2 += (int)(-86.676F + (i15 * i15));
                iArr[i15 - 1] *= (int)l;
            }
            i16 *= i14;
            Test0888.instanceCount += 247L;
            for (i17 = 1; 14 > i17; ++i17) {
                if (i17 != 0) {
                }
                Test0888.lFld += (-3007286919539976915L + (i17 * i17));
                l |= Test0888.sFld;
            }
        }
        long meth_res = i2 + by + Double.doubleToLongBits(d1) + i13 + i14 + i15 + i16 + l + i17 + i18 +
            FuzzerUtils.checkSum(iArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth(int i, double d, int i1) {

        float f1=35.919F;
        int i19=48599, i20=-11, i21=-37591, i22=2, i23=-104, i24=5, i25=-225;

        i <<= ((iMeth1(160, Test0888.byFld) - Test0888.byFld) ^ 37);
        i += (int)f1;
        for (i19 = 1; i19 < 134; ++i19) {
            for (i21 = 1; i21 < 12; i21++) {
                i1 = i1;
                for (i23 = 1; i23 < 2; i23++) {
                    i1 += (int)f1;
                    i24 >>= (int) Test0888.instanceCount;
                    Test0888.byFld += (byte) (i23 + i20);
                    i1 += (i23 * i23);
                    i24 <<= i24;
                    Test0888.sFld += (short) (((i23 * Test0888.byFld) + i22) - f1);
                }
                i25 = 1;
                while (++i25 < 2) {
                    i20 = i;
                    bFld = bFld;
                }
            }
        }
        long meth_res = i + Double.doubleToLongBits(d) + i1 + Float.floatToIntBits(f1) + i19 + i20 + i21 + i22 + i23 +
            i24 + i25;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i26=12042, i27=44075, i28=-180, i29=-2915, i30=3, i31=107;
        float f2=-89.138F;
        short s=23966;

        iMeth(Test0888.iFld, dFld, Test0888.iFld);
        for (i26 = 8; i26 < 187; i26++) {
            Test0888.instanceCount += (i26 * i26);
            Test0888.lFld -= (long) f2;
        }
        Test0888.iFld -= s;
        Test0888.iFld = i27;
        for (i28 = 8; i28 < 282; i28++) {
            fArrFld = fArrFld;
            Test0888.instanceCount = Test0888.byFld;
            Test0888.instanceCount += i28;
            for (i30 = 92; 1 < i30; --i30) {
                Test0888.instanceCount = i30;
                byArrFld[i28] += (byte)i27;
            }
            Test0888.instanceCount += (((i28 * Test0888.instanceCount) + i29) - Test0888.byFld);
        }
        i31 = i26;

        FuzzerUtils.out.println("i26 i27 f2 = " + i26 + "," + i27 + "," + Float.floatToIntBits(f2));
        FuzzerUtils.out.println("s i28 i29 = " + s + "," + i28 + "," + i29);
        FuzzerUtils.out.println("i30 i31 = " + i30 + "," + i31);

        FuzzerUtils.out.println("Test0888.instanceCount Test0888.lFld Test0888.sFld = " + Test0888.instanceCount + "," + Test0888.lFld +
                "," + Test0888.sFld);
        FuzzerUtils.out.println("Test0888.byFld bFld Test0888.iFld = " + Test0888.byFld + "," + (bFld ? 1 : 0) + "," + Test0888.iFld);
        FuzzerUtils.out.println("dFld fArrFld byArrFld = " + Double.doubleToLongBits(dFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)) + "," + FuzzerUtils.checkSum(byArrFld));

        FuzzerUtils.out.println("iMeth2_check_sum: " + iMeth2_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0888 _instance = new Test0888();
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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  iMeth2 ->  iMeth2 iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}