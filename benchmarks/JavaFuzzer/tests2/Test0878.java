// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:53 2023
public class Test0878 {

    public static final int N = 400;

    public static long instanceCount=112L;
    public short sFld=24431;
    public static int iFld=129;
    public static boolean bFld=false;
    public float fFld=-124.595F;
    public static volatile int[] iArrFld =new int[N];
    public static long[][] lArrFld =new long[N][N];
    public byte[] byArrFld =new byte[N];
    public static volatile float[] fArrFld =new float[N];
    public static double[] dArrFld =new double[N];

    static {
        FuzzerUtils.init(Test0878.iArrFld, 41);
        FuzzerUtils.init(Test0878.lArrFld, -3597485758L);
        FuzzerUtils.init(Test0878.fArrFld, -57.293F);
        FuzzerUtils.init(Test0878.dArrFld, -2.18427);
    }

    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i4) {

        float f1=-101.295F;
        int i7=-6;
        boolean b=true;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(lArr1, -329071002L);

        for (int i5 : Test0878.iArrFld) {
            double d2=85.34962;
            Test0878.iArrFld[(Test0878.iFld >>> 1) % N] -= (int) -4276923558L;
            i4 += 45227;
            i5 = i4;
            f1 -= (float)d2;
            f1 -= i5;
        }
        for (int i6 : Test0878.iArrFld) {
            i7 = 1;
            while (++i7 < 4) {
                if (i6 != 0) {
                }
                if (b) continue;
                i4 += (i7 + i7);
                Test0878.iArrFld[i7 + 1] *= (int) Test0878.instanceCount;
            }
            i4 = i4;
            Test0878.instanceCount -= Test0878.instanceCount;
            f1 = i7;
        }
        long meth_res = i4 + Float.floatToIntBits(f1) + i7 + (b ? 1 : 0) + FuzzerUtils.checkSum(lArr1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(long l) {

        int i2=0, i3=-147, i8=-162, i9=1, i10=-45255, i11=8, i12=-56419, i13=-57406;
        double d1=-1.55308;
        long l2=-7L;
        short[] sArr =new short[N];

        FuzzerUtils.init(sArr, (short)-6033);

        sArr[(Test0878.iFld >>> 1) % N] -= (short) Test0878.instanceCount;
        for (i2 = 137; i2 > 6; i2 -= 2) {
            float f=-21.467F;
            f -= (float) ((Math.abs(6770276486511339169L) + (d1 = Test0878.iFld)) * (iMeth1(Test0878.iFld) - l2));
            Test0878.iFld %= (int) (Test0878.iFld | 1);
            if (true) break;
        }
        for (i8 = 10; i8 < 252; ++i8) {
            if (Test0878.bFld) continue;
            i3 -= i8;
            for (i10 = 1; i10 < 7; i10++) {
                Test0878.lArrFld[i10] = Test0878.lArrFld[i8];
            }
        }
        i3 = 143;
        Test0878.iFld = i3;
        for (i12 = 8; i12 < 195; ++i12) {
            i9 ^= -107;
            d1 -= Test0878.iFld;
        }
        long meth_res = l + i2 + i3 + Double.doubleToLongBits(d1) + l2 + i8 + i9 + i10 + i11 + i12 + i13 +
            FuzzerUtils.checkSum(sArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public long lMeth(double d) {

        int i14=23773, i15=4, i16=-12, i17=-30215, i18=-1, i19=-231, i20=23021, i21=6997;

        Test0878.iFld += iMeth(Test0878.instanceCount);
        if (Test0878.bFld) {
            for (i14 = 247; i14 > 11; i14--) {
                i15 -= i14;
                for (i16 = i14; i16 < 7; ++i16) {
                    i15 %= (int)(i14 | 1);
                }
                Test0878.instanceCount = (long) 1.46F;
                for (i18 = 7; i18 > 1; i18 -= 3) {
                    Test0878.instanceCount >>>= 2434L;
                }
                byArrFld[i14 - 1] <<= (byte)sFld;
                i17 += i14;
            }
        }
        for (i20 = 12; 358 > i20; i20++) {
            i19 = (int) Test0878.instanceCount;
            i17 += i20;
        }
        i19 = (int) Test0878.instanceCount;
        long meth_res = Double.doubleToLongBits(d) + i14 + i15 + i16 + i17 + i18 + i19 + i20 + i21;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=0, i1=-120, i22=99, i23=-10, i24=4, i25=-158, i26=40113, i27=59666, i28=-12, i29=55;
        double d3=-84.45652;
        long l3=57923L;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -14L);

        for (i = 9; i < 296; i++) {
            sFld = (short) Math.max((int) ((--lArr[i]) % ((i1--) | 1)), Math.abs((int) (-2 * (--Test0878.instanceCount))));
            i1 = (int)lMeth(d3);
            for (i22 = i; i22 < 88; i22++) {
                Test0878.iFld += (int) Test0878.instanceCount;
                if (Test0878.bFld) {
                    i1 = i1;
                    byArrFld[i22 + 1] >>= (byte) Test0878.instanceCount;
                    d3 = i;
                    i24 = 1;
                    while (++i24 < 1) {
                        Test0878.iArrFld[i + 1] *= i24;
                        sFld >>= (short)9;
                        i1 += (int)-39.447F;
                    }
                }
                Test0878.iArrFld[i - 1] += (int) 682952191L;
                Test0878.instanceCount >>= i22;
                i23 = i23;
                for (i25 = i22; i25 < 1; i25++) {
                    if (Test0878.bFld) break;
                    Test0878.fArrFld[i22] *= i;
                }
                Test0878.iFld = (int) Test0878.instanceCount;
            }
            Test0878.iFld += i;
            Test0878.instanceCount += (i * i25);
            Test0878.iArrFld = Test0878.iArrFld;
            i23 -= i1;
            for (l3 = 3; l3 < 88; l3++) {
                d3 *= i22;
                for (i28 = (int)(l3); i28 < 2; ++i28) {
                    d3 += fFld;
                    Test0878.dArrFld[i28 + 1] -= i24;
                    sFld = sFld;
                }
            }
        }

        FuzzerUtils.out.println("i i1 d3 = " + i + "," + i1 + "," + Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 i26 l3 = " + i25 + "," + i26 + "," + l3);
        FuzzerUtils.out.println("i27 i28 i29 = " + i27 + "," + i28 + "," + i29);
        FuzzerUtils.out.println("lArr = " + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test0878.instanceCount sFld Test0878.iFld = " + Test0878.instanceCount + "," + sFld + "," +
                Test0878.iFld);
        FuzzerUtils.out.println("Test0878.bFld fFld Test0878.iArrFld = " + (Test0878.bFld ? 1 : 0) + "," +
                Float.floatToIntBits(fFld) + "," + FuzzerUtils.checkSum(Test0878.iArrFld));
        FuzzerUtils.out.println("Test0878.lArrFld byArrFld Test0878.fArrFld = " + FuzzerUtils.checkSum(Test0878.lArrFld) + "," +
                FuzzerUtils.checkSum(byArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0878.fArrFld)));
        FuzzerUtils.out.println("Test0878.dArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0878.dArrFld)));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0878 _instance = new Test0878();
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
//DEBUG  iMeth ->  iMeth lMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
