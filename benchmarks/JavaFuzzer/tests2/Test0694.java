// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:44 2023
public class Test0694 {

    public static final int N = 400;

    public static long instanceCount=7797937938283344610L;
    public double dFld=1.23411;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i2) {

        int i3=-47;
        int i4=-19115;
        int i5=14;
        int i6=45439;
        int i7=7619;
        int[] iArr =new int[N];
        float f1=0.152F;
        float[][] fArr =new float[N][N];
        byte by=55;
        double d=-1.80572;

        FuzzerUtils.init(iArr, 79);
        FuzzerUtils.init(fArr, -46.582F);

        for (i3 = 5; i3 < 248; i3++) {
            Test0694.instanceCount = Test0694.instanceCount;
            i2 = (int)f1;
            iArr[i3] ^= by;
            for (i5 = 1; 7 > i5; ++i5) {
                f1 *= i4;
                for (d = 1; d < 2; ++d) {
                    f1 -= (float)d;
                    i2 -= (int)-25882L;
                    i7 *= -55;
                    Test0694.instanceCount ^= i5;
                }
                i7 += (218 + (i5 * i5));
                fArr[i5 + 1][i5] -= f1;
                Test0694.instanceCount <<= by;
                Test0694.instanceCount -= by;
            }
        }
        long meth_res = i2 + i3 + i4 + Float.floatToIntBits(f1) + by + i5 + i6 + Double.doubleToLongBits(d) + i7 +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(float f, int i1, long l2) {


        iMeth(i1);
        vMeth1_check_sum += Float.floatToIntBits(f) + i1 + l2;
    }

    public static void vMeth(long l, long l1, int i) {

        float f2=-2.387F;
        int i8=63989, i9=-3, i10=-38, i11=19, i12=-3175, i13=9;
        byte by1=-92;
        double[] dArr =new double[N];
        long[] lArr =new long[N];

        FuzzerUtils.init(dArr, 2.58498);
        FuzzerUtils.init(lArr, -112L);

        vMeth1(f2, i, 3630952354255339519L);
        l = i;
        for (i8 = 10; i8 < 161; ++i8) {
            l1 += Test0694.instanceCount;
            i9 = 10;
            f2 -= i9;
            i9 += (i8 - i9);
            i -= i;
            for (i10 = 10; i10 > i8; i10--) {
                dArr[i8 + 1] += i;
                switch ((((26792 >>> 1) % 1) * 5) + 32) {
                case 34:
                    i -= (int)l1;
                    break;
                }
            }
            for (i12 = 1; i12 < 10; i12++) {
                int i14=50481;
                i13 >>= by1;
                lArr[(i14 >>> 1) % N] <<= i14;
            }
        }
        vMeth_check_sum += l + l1 + i + Float.floatToIntBits(f2) + i8 + i9 + i10 + i11 + i12 + i13 + by1 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i15=-39582, i16=13, i17=-30845, i18=59469, i19=30606, i20=-9, i21=47194, i22=-39761, i23=52043, i24=-87;
        short s=-25949;
        float f3=-25.802F;
        float[] fArr1 =new float[N];

        FuzzerUtils.init(fArr1, 100.69F);

        vMeth(0L, -161L, i15);
        for (i16 = 14; i16 < 259; i16++) {
            for (i18 = i16; i18 < 103; i18++) {
                i17 -= (int) Test0694.instanceCount;
                i19 += i15;
                i17 -= -2;
                i20 = 1;
                do {
                    i19 += (((i20 * i20) + i16) - i18);
                    i15 <<= s;
                    i19 += (i20 ^ (long)f3);
                    f3 = i18;
                    i15 -= (int) Test0694.instanceCount;
                    f3 -= Test0694.instanceCount;
                    i17 >>= i16;
                    i19 >>= i17;
                } while (++i20 < 1);
                i19 >>= i16;
                s = (short)i18;
                f3 = (float)dFld;
            }
            dFld *= i19;
            Test0694.instanceCount += (1267 + (i16 * i16));
            fArr1[i16 - 1] = f3;
            dFld = i17;
            f3 += (i16 * i16);
        }
        for (i21 = 12; i21 < 357; i21++) {
            for (i23 = 3; 73 > i23; i23++) {
                i17 &= i17;
                i19 += (((i23 * f3) + Test0694.instanceCount) - i19);
                Test0694.instanceCount >>= i24;
                Test0694.instanceCount = i16;
            }
            i19 -= (int) Test0694.instanceCount;
        }

        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("s f3 i21 = " + s + "," + Float.floatToIntBits(f3) + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("fArr1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));

        FuzzerUtils.out.println("Test0694.instanceCount dFld = " + Test0694.instanceCount + "," +
            Double.doubleToLongBits(dFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0694 _instance = new Test0694();
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
