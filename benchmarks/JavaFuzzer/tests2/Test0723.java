// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:46 2023
public class Test0723 {

    public static final int N = 400;

    public static long instanceCount=-5971942440762804807L;
    public static double dFld=0.6861;
    public boolean bFld=true;
    public static float[] fArrFld =new float[N];
    public static int[] iArrFld =new int[N];
    public volatile boolean[] bArrFld =new boolean[N];

    static {
        FuzzerUtils.init(Test0723.fArrFld, 0.238F);
        FuzzerUtils.init(Test0723.iArrFld, 13);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i2) {

        float f=-104.657F;
        int i3=8, i4=-11, i5=12631, i6=-2, i7=-173, i8=62523;
        boolean b=false;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, 3510078574671933088L);

        lArr[(6 >>> 1) % N] *= (long)f;
        i3 = 1;
        do {
            for (i4 = i3; 6 > i4; ++i4) {
                i5 = i5;
                i2 = i2;
                b = b;
                i2 >>= i2;
                i5 = (int) Test0723.instanceCount;
            }
        } while (++i3 < 264);
        i6 = 1;
        while (++i6 < 280) {
            for (i7 = i6; i7 < 6; ++i7) {
                Test0723.instanceCount >>= Test0723.instanceCount;
                i5 += (-170 + (i7 * i7));
                b = b;
                i2 += (i7 * i7);
                Test0723.instanceCount *= i2;
            }
        }
        vMeth_check_sum += i2 + Float.floatToIntBits(f) + i3 + i4 + i5 + (b ? 1 : 0) + i6 + i7 + i8 +
            FuzzerUtils.checkSum(lArr);
    }

    public static float fMeth(int i1, long l) {

        int i9=197, i10=-3, i11=-154, i12=33058;
        float f1=0.981F;
        short s=21047;
        double[] dArr =new double[N];

        FuzzerUtils.init(dArr, 2.100553);

        vMeth(i1);
        for (i9 = 12; 366 > i9; i9++) {
            l <<= i1;
            i10 = 5;
            Test0723.dFld += f1;
            dArr = FuzzerUtils.double1array(N, (double)-126.108230);
            Test0723.dFld = -63704;
        }
        i1 ^= i9;
        f1 *= i9;
        i11 = 1;
        do {
            s -= (short)90.240F;
            Test0723.fArrFld = Test0723.fArrFld;
            i12 = 1;
            do {
                Test0723.fArrFld = FuzzerUtils.float1array(N, (float) 44.792F);
                dArr[i11] -= i1;
            } while (++i12 < 18);
        } while ((i11 += 2) < 174);
        long meth_res = i1 + l + i9 + i10 + Float.floatToIntBits(f1) + i11 + s + i12 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vSmallMeth() {

        int i=2;

        i *= (int) (38412 * fMeth(131, Test0723.instanceCount));
        Test0723.instanceCount -= (long) 1.124523;
        vSmallMeth_check_sum += i;
    }

    public void mainTest(String[] strArr1) {

        int i13=3573, i14=-173, i15=3, i16=4, i17=-7, i18=3;
        long l2=-9L;
        float f2=-2.790F;
        short[] sArr =new short[N];
        double[][] dArr1 =new double[N][N];

        FuzzerUtils.init(sArr, (short)962);
        FuzzerUtils.init(dArr1, -48.54976);

        for (int smallinvoc=0; smallinvoc<849; smallinvoc++) vSmallMeth();
        Test0723.instanceCount -= i13;
        sArr[(i13 >>> 1) % N] |= (short) Test0723.instanceCount;
        try {
            for (i14 = 5; 166 > i14; ++i14) {
                dArr1 = dArr1;
                i15 += i14;
                for (l2 = 7; l2 < 156; l2++) {
                    Test0723.instanceCount -= l2;
                    for (i17 = 1; i17 < 2; i17 += 2) {
                        int i19=14;
                        i18 = i13;
                        Test0723.iArrFld = Test0723.iArrFld;
                        bFld = bFld;
                        if (bFld) {
                            if (bFld) {
                                bArrFld[i14 - 1] = true;
                                switch (((i17 >>> 1) % 9) + 18) {
                                case 18:
                                    Test0723.instanceCount = l2;
                                    Test0723.instanceCount |= i15;
                                    switch (((i14 % 2) * 5) + 14) {
                                    case 17:
                                        i15 -= (int)2633538845L;
                                        i16 *= (int)f2;
                                        if (bFld) break;
                                    case 20:
                                        dArr1[i17 + 1][i14] = i13;
                                        break;
                                    default:
                                        i15 *= i15;
                                        i18 = (int)l2;
                                        Test0723.dFld += i18;
                                    }
                                case 19:
                                    Test0723.instanceCount += i18;
                                    break;
                                case 20:
                                case 21:
                                    i19 = i19;
                                    Test0723.dFld = i18;
                                case 22:
                                    i13 = i18;
                                    break;
                                case 23:
                                    Test0723.iArrFld[(int) (l2 + 1)] <<= (int) l2;
                                    break;
                                case 24:
                                    Test0723.iArrFld[(int) (l2 + 1)] = -13;
                                    break;
                                case 25:
                                    i15 *= i16;
                                    break;
                                case 26:
                                    Test0723.instanceCount = i13;
                                    break;
                                }
                            } else if (true) {
                                f2 += i18;
                            }
                        }
                    }
                }
            }
        }
        catch (NullPointerException exc1) {
            f2 /= (i13 | 1);
        }

        FuzzerUtils.out.println("i13 i14 i15 = " + i13 + "," + i14 + "," + i15);
        FuzzerUtils.out.println("l2 i16 i17 = " + l2 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 f2 sArr = " + i18 + "," + Float.floatToIntBits(f2) + "," +
            FuzzerUtils.checkSum(sArr));
        FuzzerUtils.out.println("dArr1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)));

        FuzzerUtils.out.println("Test0723.instanceCount Test0723.dFld bFld = " + Test0723.instanceCount + "," +
                Double.doubleToLongBits(Test0723.dFld) + "," + (bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0723.fArrFld Test0723.iArrFld bArrFld = " +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0723.fArrFld)) + "," + FuzzerUtils.checkSum(Test0723.iArrFld) +
            "," + FuzzerUtils.checkSum(bArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0723 _instance = new Test0723();
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
//DEBUG  fMeth ->  fMeth vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth fMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}