// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:00 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=58590L;
    public static float fFld=2.366F;
    public static int iFld=14502;
    public static byte byFld=3;
    public short sFld=-32739;
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -246L);
    }

    public static long dMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i9) {

        int i10=51269, i11=177, i12=179, i13=208, i14=-43312, i15=-2064, i16=-7877, iArr1[]=new int[N];
        long l=669691910818572346L;
        double d1=-2.53932;
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr1, 45701);
        FuzzerUtils.init(fArr, 1.738F);

        for (i10 = 10; i10 < 168; i10++) {
            i9 = (int)l;
            iArr1[i10] = (int)9091837555826503606L;
            for (i12 = 1; i12 < 10; i12++) {
                d1 = i9;
            }
            i9 = i9;
            Test.instanceCount >>= -152;
            switch ((i10 % 6) + 85) {
            case 85:
                l += (((i10 * Test.fFld) + i12) - i12);
                i14 = 1;
                do {
                    fArr[i10] = -11;
                    i11 += (((i14 * i13) + i11) - i9);
                    for (i15 = 1; i15 < 2; ++i15) {
                        i16 *= (int)l;
                        iArr1[i15 - 1] <<= i13;
                    }
                } while ((i14 += 2) < 10);
                break;
            case 86:
                i11 += (int)l;
                break;
            case 87:
                i11 = i9;
            case 88:
                i11 += (((i10 * i11) + i9) - i12);
            case 89:
                Test.fFld += i9;
                break;
            case 90:
                d1 = 1140645246L;
                break;
            }
        }
        long meth_res = i9 + i10 + i11 + l + i12 + i13 + Double.doubleToLongBits(d1) + i14 + i15 + i16 +
            FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i4, int i5, double d) {

        int i6=9, i7=-12665, i8=-105, iArr[]=new int[N];
        float f=0.662F;
        boolean b=true;
        byte by1=49;
        long lArr1[]=new long[N], lArr2[]=new long[N];

        FuzzerUtils.init(iArr, -12);
        FuzzerUtils.init(lArr1, -37181L);
        FuzzerUtils.init(lArr2, -3762240387L);

        for (i6 = 337; 2 < i6; --i6) {
            i8 = 1;
            while (++i8 < 5) {
                if (b) {
                    f = (12L + f);
                    iArr[i6 - 1] = i8;
                    if (((-(f + -2.86794)) != i4) | ((d += Math.min(i5, 15835)) != i5)) break;
                    vMeth_check_sum += i4 + i5 + Double.doubleToLongBits(d) + i6 + i7 + i8 + Float.floatToIntBits(f) +
                        (b ? 1 : 0) + by1 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr1) +
                        FuzzerUtils.checkSum(lArr2);
                    return;
                } else if (b) {
                    Test.instanceCount = ((-(i7 + i4)) & lMeth(i6));
                } else {
                    i7 = i5;
                    lArr1[i8] *= i4;
                }
                by1 *= (byte)0L;
                Test.instanceCount = i4;
                by1 += (byte)i7;
            }
            i4 += (i6 | Test.instanceCount);
        }
        Test.instanceCount = (long)Test.fFld;
        lArr2 = lArr1;
        vMeth_check_sum += i4 + i5 + Double.doubleToLongBits(d) + i6 + i7 + i8 + Float.floatToIntBits(f) + (b ? 1 : 0)
            + by1 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(lArr2);
    }

    public static double dMeth(byte by) {

        int i1=-211, i2=-10, i3=14429, i17=180, i18=-3, i19=-2;
        boolean b1=false;

        i1 = (~(i1++));
        Test.instanceCount -= ((i1 << (-11 - (i1 + i1))) + (i1++));
        for (i2 = 11; i2 < 198; i2++) {
            vMeth(i2, i2, -123.17687);
            i17 = 1;
            while (++i17 < 9) {
                i1 = (int)22085L;
                i1 = (int)-23483L;
            }
            switch ((i2 % 1) + 56) {
            case 56:
                i1 >>>= Test.iFld;
                Test.instanceCount *= i3;
                break;
            }
            for (i18 = 1; 9 > i18; ++i18) {
                Test.instanceCount += i17;
                Test.lArrFld[i18] *= (long)1.36330;
                Test.fFld -= Test.instanceCount;
                if (b1) break;
            }
        }
        long meth_res = by + i1 + i2 + i3 + i17 + i18 + i19 + (b1 ? 1 : 0);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=13, i20=-50119, i21=-14, i22=75, i23=4, i24=-7, i25=48709, iArr2[][]=new int[N][N];
        boolean b2=false;
        double d2=0.46858;
        long l1=-917281708L, lArr[]=new long[N];

        FuzzerUtils.init(lArr, -8L);
        FuzzerUtils.init(iArr2, 46268);

        Test.instanceCount = ((-4913199513095615182L - (i -= i)) % ((--i) | 1));
        lArr[(i >>> 1) % N] = (long)(((-43 + (i * i)) - Math.max(i, i)) + dMeth(Test.byFld));
        i20 = 336;
        while ((i20 -= 3) > 0) {
            Test.instanceCount += i;
            b2 = b2;
        }
        iArr2[(Test.iFld >>> 1) % N] = iArr2[(i >>> 1) % N];
        i *= i;
        i &= 2;
        for (i21 = 4; i21 < 275; ++i21) {
            d2 = i22;
            Test.fFld += Test.instanceCount;
            Test.iFld += -1900;
            Test.instanceCount <<= -36227;
            switch (((i21 % 2) * 5) + 97) {
            case 106:
                Test.iFld *= (int)Test.instanceCount;
                break;
            case 102:
                Test.iFld *= (int)Test.fFld;
                Test.iFld = i22;
                iArr2[i21] = FuzzerUtils.int1array(N, (int)-13776);
                for (i23 = 1; i23 < 93; i23++) {
                    for (l1 = 2; l1 > i23; l1 -= 3) {
                        if (b2) {
                            i24 /= 11;
                        } else {
                            Test.instanceCount = l1;
                        }
                        i24 = i23;
                        Test.iFld = sFld;
                        i22 -= (int)l1;
                        iArr2[i21][i21 - 1] += i23;
                        sFld *= (short)i20;
                        d2 -= -2.74798;
                    }
                    d2 += 62;
                }
                break;
            }
        }

        FuzzerUtils.out.println("i i20 b2 = " + i + "," + i20 + "," + (b2 ? 1 : 0));
        FuzzerUtils.out.println("i21 i22 d2 = " + i21 + "," + i22 + "," + Double.doubleToLongBits(d2));
        FuzzerUtils.out.println("i23 i24 l1 = " + i23 + "," + i24 + "," + l1);
        FuzzerUtils.out.println("i25 lArr iArr2 = " + i25 + "," + FuzzerUtils.checkSum(lArr) + "," +
            FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.iFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.iFld);
        FuzzerUtils.out.println("Test.byFld sFld Test.lArrFld = " + Test.byFld + "," + sFld + "," +
            FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
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
//DEBUG  dMeth ->  dMeth mainTest
//DEBUG  vMeth ->  vMeth dMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth dMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
