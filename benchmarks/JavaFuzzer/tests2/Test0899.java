// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:54 2023
public class Test0899 {

    public static final int N = 400;

    public static long instanceCount=-45190L;
    public static double dFld=1.62835;
    public static float fFld=98.157F;
    public boolean bFld=true;
    public short sFld=-29075;
    public int[] iArrFld =new int[N];
    public static volatile int[] iArrFld1 =new int[N];
    public long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test0899.iArrFld1, 0);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth() {

        int i9=6;
        int i10=-1;
        int i11=-9;
        int i12=-12;
        int i13=-199;
        int i14=114;
        int[][] iArr =new int[N][N];
        byte by=-2;
        long[] lArr =new long[N];
        float[] fArr =new float[N];

        FuzzerUtils.init(lArr, 3L);
        FuzzerUtils.init(iArr, -232);
        FuzzerUtils.init(fArr, 0.165F);

        Test0899.instanceCount >>>= Test0899.instanceCount;
        Test0899.instanceCount -= Test0899.instanceCount;
        for (i9 = 8; i9 < 164; ++i9) {
            i10 ^= i9;
            lArr[i9] = i10;
            i10 = i10;
            by -= (byte)i10;
            for (i11 = 1; i11 < 10; i11++) {
                i12 += (i11 * i11);
                i10 %= (int)(by | 1);
                Test0899.fFld -= i11;
                iArr = iArr;
                for (i13 = 2; i13 > 1; i13 -= 2) {
                    i14 <<= -52035;
                    fArr = FuzzerUtils.float1array(N, (float)5.933F);
                }
            }
        }
        long meth_res = i9 + i10 + by + i11 + i12 + i13 + i14 + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr)
            + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth(int i7, int i8) {

        short s=26264;
        double d=0.1874;
        int i15=2228, i16=-454, i17=-99, i18=11;
        float[] fArr1 =new float[N];

        FuzzerUtils.init(fArr1, 1.315F);

        i7 -= (int) (i7 - Test0899.dFld);
        s -= (short)lMeth();
        for (d = 5; d < 176; d++) {
            i8 = i15;
            Test0899.instanceCount += Test0899.instanceCount;
            Test0899.iArrFld1[(int) (d + 1)] *= (int) Test0899.instanceCount;
            Test0899.instanceCount = -154;
            i16 = 9;
            while (--i16 > 0) {
                i7 -= (int) Test0899.instanceCount;
                Test0899.instanceCount -= i7;
                for (i17 = 1; i17 < 1; ++i17) {
                    if (i15 != 0) {
                    }
                    s += (short)(i17 - i17);
                    fArr1[(int)(d - 1)] -= i17;
                    Test0899.iArrFld1[i16] = (int) Test0899.instanceCount;
                }
            }
        }
        long meth_res = i7 + i8 + s + Double.doubleToLongBits(d) + i15 + i16 + i17 + i18 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i2, int i3, int i4) {

        int i5=9, i6=-8, i19=-140, i20=-3, i21=-7;
        byte by2=63;
        byte[] byArr =new byte[N];
        boolean b=false;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(lArr1, 1001442650657118138L);
        FuzzerUtils.init(byArr, (byte)17);

        for (i5 = 10; 278 > i5; i5++) {
            if ((Math.abs(Test0899.instanceCount) != (Test0899.iArrFld1[i5]--)) || ((i2 = (int) (4L * iMeth(i2, i6))) >= i2))
                break;
            lArr1[i5 - 1] += i4;
            for (i19 = 1; i19 < 6; i19++) {
                i21 = 2;
                while (--i21 > 0) {
                    Test0899.instanceCount %= (Test0899.instanceCount | 1);
                    Test0899.iArrFld1[i5 + 1] = (int) Test0899.fFld;
                    Test0899.instanceCount -= i19;
                    i20 = -111;
                }
                Test0899.instanceCount = i21;
            }
            if (b) {
                Test0899.iArrFld1[i5] = 31;
                Test0899.instanceCount += (i5 * i5);
                Test0899.instanceCount >>= i2;
                by2 += (byte)(i5 * i3);
            } else {
                Test0899.dFld += Test0899.fFld;
            }
        }
        vMeth_check_sum += i2 + i3 + i4 + i5 + i6 + i19 + i20 + i21 + by2 + (b ? 1 : 0) + FuzzerUtils.checkSum(lArr1) +
            FuzzerUtils.checkSum(byArr);
    }

    public void mainTest(String[] strArr1) {

        int i=-194, i1=144, i22=-8, i23=157, i24=7, i25=24, i26=-233, i27=61181, i28=44, i29=44, i30=-114, i31=129;
        byte by3=-27;
        float[] fArr2 =new float[N];

        FuzzerUtils.init(fArr2, 75.424F);

        i += i;
        i += i;
        i1 = 1;
        while (++i1 < 369) {
            if (iArrFld[(54995 >>> 1) % N] < i1) break;
            Test0899.instanceCount ^= iArrFld[i1];
            vMeth(59351, i, -98);
        }
        for (long l : lArrFld) {
            i -= -126;
            by3 += (byte)i;
            for (i22 = 1; 63 > i22; ++i22) {
                i23 -= i23;
                if (bFld) {
                    iArrFld[i22 + 1] = (int)l;
                } else if (bFld) {
                    Test0899.fFld = i1;
                } else {
                    i23 -= (int) Test0899.fFld;
                }
            }
            lArrFld[(i22 >>> 1) % N] = sFld;
            for (i24 = 2; i24 < 63; i24++) {
                for (i26 = 1; i26 < 2; i26++) {
                    sFld *= (short)i23;
                    bFld = bFld;
                    i25 = i26;
                    l -= i22;
                    i = -5;
                }
            }
            fArr2[(i24 >>> 1) % N] -= 24484;
        }
        for (i28 = 3; i28 < 140; ++i28) {
            Test0899.instanceCount = Test0899.instanceCount;
            for (i30 = 183; i30 > i28; i30--) {
                Test0899.instanceCount += (long) (-2.318F + (i30 * i30));
                i29 -= (int) Test0899.fFld;
                Test0899.iArrFld1[i30] -= 12;
            }
        }

        FuzzerUtils.out.println("i i1 by3 = " + i + "," + i1 + "," + by3);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("i28 i29 i30 = " + i28 + "," + i29 + "," + i30);
        FuzzerUtils.out.println("i31 fArr2 = " + i31 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr2)));

        FuzzerUtils.out.println("Test0899.instanceCount Test0899.dFld Test0899.fFld = " + Test0899.instanceCount + "," +
                Double.doubleToLongBits(Test0899.dFld) + "," + Float.floatToIntBits(Test0899.fFld));
        FuzzerUtils.out.println("bFld sFld iArrFld = " + (bFld ? 1 : 0) + "," + sFld + "," +
            FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("Test0899.iArrFld1 lArrFld = " + FuzzerUtils.checkSum(Test0899.iArrFld1) + "," +
            FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0899 _instance = new Test0899();
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  lMeth ->  lMeth iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}