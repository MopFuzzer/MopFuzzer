// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:24 2023
public class Test0267 {

    public static final int N = 400;

    public static volatile long instanceCount=-5L;
    public float fFld=-1.847F;
    public static double dFld=92.80125;
    public static byte byFld=68;
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0267.iArrFld, -201);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(long l1, int i9) {

        float f2=60.754F;
        int i10=11602, i11=41052, i12=10, i13=167;
        byte by=118;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(lArr1, -3658433890L);

        i9 = -119;
        i9 = -11;
        l1 = i9;
        l1 >>= i9;
        i9 >>>= i9;
        lArr1[(i9 >>> 1) % N] /= ((long)(f2) | 1);
        Test0267.iArrFld[(i9 >>> 1) % N] ^= i9;
        i9 = i9;
        i9 = (int)l1;
        for (i10 = 10; 288 > i10; i10++) {
            i11 += i10;
            for (i12 = 1; i12 < 6; i12++) {
                Test0267.instanceCount -= (long) Test0267.dFld;
                i9 -= (int)l1;
                i13 = by;
            }
        }
        long meth_res = l1 + i9 + Float.floatToIntBits(f2) + i10 + i11 + i12 + i13 + by + FuzzerUtils.checkSum(lArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i7, int i8, float f1) {


        Test0267.instanceCount += lMeth(Test0267.instanceCount, -12);
        vMeth_check_sum += i7 + i8 + Float.floatToIntBits(f1);
    }

    public static int iMeth() {

        int i1=-11;
        int i2=-10;
        int i3=-54229;
        int i4=-7030;
        int i5=19871;
        int i6=-20790;
        int[] iArr =new int[N];
        float f=-34.989F;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -70L);
        FuzzerUtils.init(iArr, 0);

        for (i1 = 12; i1 < 224; i1++) {
            i2 -= Integer.reverseBytes(i2 - -2782);
            for (i3 = 1; 8 > i3; ++i3) {
                i2 = (++i2);
                if (((Test0267.instanceCount--) * (i2 *= (int) (Test0267.dFld + i2))) < i1) continue;
            }
            i4 *= (int)(-35.566F + (++i4));
            for (i5 = 1; i5 < 8; i5++) {
                i4 = (int)((-(--lArr[i5])) - ((i4--) + (i6--)));
                f *= (f++);
                i2 += (int) (i6 *= (int) (Test0267.instanceCount + (++i4)));
                iArr[i5 + 1] <<= i3;
                vMeth(i6, i5, f);
                Test0267.instanceCount = 29960;
            }
            Test0267.byFld += (byte) -23;
            i4 = i2;
        }
        long meth_res = i1 + i2 + i3 + i4 + i5 + i6 + Float.floatToIntBits(f) + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        long l=-3780328313L;
        int i=143, i14=8, i15=2, i16=14214, i17=59, i18=12, i19=-36617, i20=0, i21=207;
        short s=27177;
        double d=2.19594;

        for (l = 304; l > 7; --l) {
            i += (int) (((l * i) + i) - Test0267.instanceCount);
            i += (int)(((fFld--) + i) - (-fFld));
        }
        Test0267.instanceCount = iMeth();
        for (i14 = 3; i14 < 329; ++i14) {
            for (i16 = i14; i16 < 77; ++i16) {
                Test0267.iArrFld[i16 - 1] = -226;
                i15 |= i;
                i15 += (((i16 * l) + Test0267.instanceCount) - s);
                Test0267.dFld *= -90.78684;
                fFld += 18140;
                Test0267.dFld += i15;
            }
            Test0267.iArrFld[i14 - 1] += (int) Test0267.instanceCount;
            for (d = 2; d < 77; ++d) {
                Test0267.instanceCount -= -14;
                i += (int)l;
                i += (int)(d * l);
                for (i19 = 1; 2 > i19; ++i19) {
                    i18 = i;
                    Test0267.instanceCount <<= 6L;
                    i18 = i18;
                    i += (((i19 * i18) + i19) - Test0267.instanceCount);
                    i17 >>>= i16;
                    Test0267.instanceCount = i19;
                    i20 += (i19 * i20);
                }
                s <<= (short)1;
                i21 = 1;
                do {
                    i18 -= i16;
                    i18 >>= (int) Test0267.instanceCount;
                    fFld *= l;
                } while (++i21 < 2);
            }
        }

        FuzzerUtils.out.println("l i i14 = " + l + "," + i + "," + i14);
        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("s d i18 = " + s + "," + Double.doubleToLongBits(d) + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);

        FuzzerUtils.out.println("Test0267.instanceCount fFld Test0267.dFld = " + Test0267.instanceCount + "," +
                Float.floatToIntBits(fFld) + "," + Double.doubleToLongBits(Test0267.dFld));
        FuzzerUtils.out.println("Test0267.byFld Test0267.iArrFld = " + Test0267.byFld + "," + FuzzerUtils.checkSum(Test0267.iArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0267 _instance = new Test0267();
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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
