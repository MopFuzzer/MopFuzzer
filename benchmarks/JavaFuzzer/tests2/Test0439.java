// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:32 2023
public class Test0439 {

    public static final int N = 400;

    public static long instanceCount=28179L;
    public int iFld=-11;
    public static volatile float fFld=47.381F;
    public boolean bFld=true;
    public static byte byFld=47;
    public static int iFld1=59552;
    public static int iFld2=-4;
    public static int[] iArrFld =new int[N];
    public static float[] fArrFld =new float[N];

    static {
        FuzzerUtils.init(Test0439.iArrFld, -15665);
        FuzzerUtils.init(Test0439.fArrFld, 1.605F);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long byMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static void vSmallMeth(int i5) {


        i5 = (int) ((0.340F + (i5 * i5)) + (Test0439.fFld--));
        vSmallMeth_check_sum += i5;
    }

    public static long lMeth(short s1) {

        int i22=10, i23=0, i24=11112, i25=-36638, i26=-120, i27=119, i28=29838, i29=24619;
        double d2=0.79449;

        for (i22 = 185; i22 > 7; i22 -= 2) {
            i23 += (i22 ^ Test0439.iFld1);
            Test0439.fArrFld[i22 - 1] += -2;
        }
        i24 = 1;
        do {
            for (i25 = i24; i25 < 6; ++i25) {
                Test0439.iArrFld = Test0439.iArrFld;
                d2 += d2;
                i23 += i25;
                d2 = i27;
                for (i28 = 1; i28 < 1; i28++) {
                    Test0439.iArrFld[i25] = Test0439.iFld2;
                    i23 *= i29;
                    if (i25 != 0) {
                    }
                    i23 = Test0439.iFld1;
                    Test0439.iFld2 = i22;
                }
            }
        } while (++i24 < 284);
        long meth_res = s1 + i22 + i23 + i24 + i25 + i26 + Double.doubleToLongBits(d2) + i27 + i28 + i29;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static byte byMeth() {

        int i15=-7218, i16=243, i17=155, i18=-28, i19=-6, i20=-3750, i21=-10704;
        long l1=5626L;
        short s2=-30403;
        boolean b1=true;

        for (i15 = 219; i15 > 11; i15 -= 2) {
            i16 -= (((Test0439.byFld += (byte) i16) * (i15 - -176)) + (-(i16--)));
            for (i17 = 15; i17 > 1; i17--) {
                for (l1 = 2; 1 < l1; l1 -= 3) {
                    Test0439.iFld1 = -223;
                }
                i16 += i17;
                for (i20 = 1; i20 < 2; ++i20) {
                    i16 += (i20 ^ (long) Test0439.fFld);
                    Test0439.instanceCount >>= lMeth(s2);
                    i18 >>= 48440;
                    i16 += (-4 + (i20 * i20));
                    i21 = -19016;
                    b1 = true;
                }
                i18 = (int)-59683L;
                i16 <<= Test0439.byFld;
            }
        }
        long meth_res = i15 + i16 + i17 + i18 + l1 + i19 + i20 + i21 + s2 + (b1 ? 1 : 0);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public static int iMeth(boolean b) {

        int i10=214, i11=178, i12=8, i13=-22401, i14=168;
        byte by1=-77;
        double d1=1.125916;
        long l=160L;
        short s3=-3703;

        for (i10 = 1; i10 < 276; i10++) {
            vSmallMeth(i10);
            i11 = (int) (Test0439.instanceCount / ((by1 = (byte) (Test0439.instanceCount %= ((long) (Test0439.fFld) | 1))) | 1));
        }
        d1 = (++Test0439.iArrFld[(i11 >>> 1) % N]);
        for (l = 377; 6 < l; l -= 2) {
            for (i13 = 1; i13 < 9; ++i13) {
                Test0439.fArrFld[(int) (l)] -= (float) (d1 + (byMeth() - Test0439.iFld1));
                Test0439.iFld1 ^= Test0439.iFld1;
                i14 += Test0439.iFld2;
                if (b) break;
                i14 += (((i13 * i10) + i11) - s3);
                if (i12 != 0) {
                }
            }
            i14 = Test0439.iFld2;
            Test0439.iFld1 = (int) l;
            if (i10 != 0) {
            }
        }
        long meth_res = (b ? 1 : 0) + i10 + i11 + by1 + Double.doubleToLongBits(d1) + l + i12 + i13 + i14 + s3;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d=1.98093;
        double[] dArr =new double[N];
        int i=83;
        int i1=-159;
        int i2=0;
        int i3=28;
        int i6=-155;
        int i7=33406;
        int i8=-20934;
        int i9=0;
        int i30=53162;
        int[] iArr =new int[N];
        byte by=-79;
        short s=7049;
        long[] lArr =new long[N];
        boolean[] bArr =new boolean[N];

        FuzzerUtils.init(dArr, -6.36459);
        FuzzerUtils.init(lArr, -28532L);
        FuzzerUtils.init(iArr, -3);
        FuzzerUtils.init(bArr, true);

        dArr[(iFld >>> 1) % N] -= (iFld + ((25227 * lArr[(iFld >>> 1) % N]) + Math.sqrt(d)));
        iFld <<= iArr[(iFld >>> 1) % N];
        for (i = 15; i < 301; i++) {
            for (i2 = 1; i2 < 88; i2++) {
                Test0439.instanceCount += (long) (--d);
                iFld -= (int)((i1 - 5672438198646581517L) - i1);
            }
            for (int smallinvoc=0; smallinvoc<62; smallinvoc++) vSmallMeth(iFld);
            if (bFld) {
                i6 = 1;
                while (++i6 < 88) {
                    i7 = 1;
                    while (++i7 < 1) {
                        i3 += (15609 + (i7 * i7));
                        by *= (byte)(by - iFld);
                    }
                    bFld = ((--i3) != (i3--));
                    i3 <<= (int) ((Integer.reverseBytes(-105) - (i3 = (int) Test0439.instanceCount)) * ((Test0439.instanceCount -
                        s) + d));
                    for (i8 = 1; i8 < 1; i8++) {
                        if (bArr[i6]) continue;
                        i9 = (int) (i8 ^ (-(Test0439.instanceCount + i8)));
                        Test0439.fFld = (Test0439.instanceCount + iMeth(bFld));
                        Test0439.iFld1 += (i8 | (long) Test0439.fFld);
                        i1 = i1;
                        Test0439.instanceCount += (((i8 * Test0439.iFld1) + Test0439.iFld1) - i2);
                        Test0439.instanceCount += (i8 * i3);
                    }
                    if (bFld) break;
                    Test0439.instanceCount >>= Test0439.instanceCount;
                }
                Test0439.instanceCount >>>= i6;
                if (bFld) {
                    d -= d;
                    i30 = 1;
                    while (++i30 < 88) {
                        Test0439.instanceCount += i30;
                        Test0439.instanceCount += Test0439.instanceCount;
                    }
                } else if (false) {
                    Test0439.iArrFld[i - 1] += -10;
                } else {
                    i3 /= 73;
                }
            } else if (true) {
                i3 ^= Test0439.iFld1;
            } else {
                Test0439.iFld1 += i2;
            }
        }

        FuzzerUtils.out.println("d i i1 = " + Double.doubleToLongBits(d) + "," + i + "," + i1);
        FuzzerUtils.out.println("i2 i3 i6 = " + i2 + "," + i3 + "," + i6);
        FuzzerUtils.out.println("i7 by s = " + i7 + "," + by + "," + s);
        FuzzerUtils.out.println("i8 i9 i30 = " + i8 + "," + i9 + "," + i30);
        FuzzerUtils.out.println("dArr lArr iArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + "," +
            FuzzerUtils.checkSum(lArr) + "," + FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println("bArr = " + FuzzerUtils.checkSum(bArr));

        FuzzerUtils.out.println("Test0439.instanceCount iFld Test0439.fFld = " + Test0439.instanceCount + "," + iFld + "," +
                Float.floatToIntBits(Test0439.fFld));
        FuzzerUtils.out.println("bFld Test0439.byFld Test0439.iFld1 = " + (bFld ? 1 : 0) + "," + Test0439.byFld + "," + Test0439.iFld1);
        FuzzerUtils.out.println("Test0439.iFld2 Test0439.iArrFld Test0439.fArrFld = " + Test0439.iFld2 + "," +
                FuzzerUtils.checkSum(Test0439.iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0439.fArrFld)));

        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("byMeth_check_sum: " + byMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0439 _instance = new Test0439();
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test iMeth
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  byMeth ->  byMeth iMeth mainTest
//DEBUG  lMeth ->  lMeth byMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
