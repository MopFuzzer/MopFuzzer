// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:53 2023
public class Test0876 {

    public static final int N = 400;

    public static volatile long instanceCount=4654340848638508035L;
    public static boolean bFld=false;
    public static float fFld=-2.209F;
    public static int[] iArrFld =new int[N];
    public volatile short[] sArrFld =new short[N];
    public static long[][] lArrFld =new long[N][N];

    static {
        FuzzerUtils.init(Test0876.iArrFld, 3);
        FuzzerUtils.init(Test0876.lArrFld, -5L);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long iMeth2_check_sum = 0;

    public static int iMeth2(int i6) {

        int i7=-12, i8=-36373, i9=11, i10=-240, i12=-9, i13=0;
        float f2=-2.718F;
        byte by1=83;
        double d1=-1.112269;
        boolean[] bArr =new boolean[N];

        FuzzerUtils.init(bArr, false);

        i6 = (int)-28237L;
        i7 = 1;
        do {
            for (i8 = i7; i8 < 5; i8++) {
                i10 = 1;
                while (++i10 < 1) {
                    int i11=-14969;
                    byte by=-120;
                    Test0876.instanceCount += (i10 * i10);
                    Test0876.instanceCount -= i9;
                    i11 += i10;
                    Test0876.instanceCount += i10;
                    f2 = by;
                }
                i9 = (int)f2;
                by1 = (byte)f2;
                for (i12 = 1; 1 > i12; ++i12) {
                    bArr[i8 + 1] = Test0876.bFld;
                    i6 = (int) Test0876.instanceCount;
                    by1 += (byte)d1;
                }
            }
        } while (++i7 < 353);
        long meth_res = i6 + i7 + i8 + i9 + i10 + Float.floatToIntBits(f2) + by1 + i12 + i13 +
            Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(bArr);
        iMeth2_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth1(int i4, float f1, int i5) {

        byte by2=61;

        Test0876.iArrFld[(i5 >>> 1) % N] = (iMeth2(-57) / (by2 | 1));
        long meth_res = i4 + Float.floatToIntBits(f1) + i5 + by2;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(long l, long l1, float f) {

        int i3=27086, i14=-2, i15=157, i16=-10, i17=16092, i18=-127, i19=-163, i20=10, i21=88;

        Test0876.instanceCount = ((i3--) + iMeth1(-149, f, i3));
        for (i14 = 141; 1 < i14; --i14) {
            short s=26135;
            s += (short)i14;
            i15 += (i14 - i14);
            Test0876.instanceCount += (i14 * i14);
            if (Test0876.bFld) break;
            for (i16 = 1; i16 < 11; ++i16) {
                for (i18 = 1; i18 < 2; ++i18) {
                    f -= Test0876.instanceCount;
                    i17 += 9;
                    if (Test0876.bFld) break;
                }
                for (i20 = 1; 2 > i20; ++i20) {
                    i15 <<= 46717;
                    l1 += i20;
                    i21 += i14;
                }
            }
        }
        long meth_res = l + l1 + Float.floatToIntBits(f) + i3 + i14 + i15 + i16 + i17 + i18 + i19 + i20 + i21;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-6, i1=-13, i2=-43540, i22=99, i23=-13315, i24=-11, i25=-7;
        double d=2.64309, d2=2.128296;

        for (i = 6; 366 > i; i++) {
            Test0876.iArrFld[i - 1] <<= (int) (((i + i) - (i1 = i)) + (247 / (((long) (d - i)) | 1)));
            i2 = 1;
            while (++i2 < 70) {
                i1 >>>= Integer.reverseBytes((int) ((i ^ Test0876.instanceCount) + (Test0876.instanceCount++)));
                i1 = (iMeth(Test0876.instanceCount, 32728L, Test0876.fFld) - 57067);
                Test0876.bFld = Test0876.bFld;
                sArrFld[i] = (short)5;
            }
            i22 = 1;
            while (++i22 < 70) {
                if (Test0876.bFld) continue;
                for (d2 = 1; 1 < d2; --d2) {
                    if (Test0876.bFld) {
                        i23 += i2;
                        Test0876.lArrFld[(int) (d2)][i - 1] = Test0876.instanceCount;
                        i23 <<= i;
                    } else {
                        Test0876.fFld = -5L;
                        i1 += (int) (d2 + Test0876.instanceCount);
                        Test0876.instanceCount *= i2;
                    }
                    Test0876.iArrFld[i22 - 1] = (int) Test0876.instanceCount;
                }
                i23 = -164;
                i23 -= (int) Test0876.instanceCount;
                i23 = (int) Test0876.fFld;
                Test0876.instanceCount >>>= i22;
                i1 = (int) Test0876.instanceCount;
                i23 = -87;
                i1 = (int) Test0876.fFld;
                for (i24 = 1; 1 > i24; ++i24) {
                    i1 <<= (int) Test0876.instanceCount;
                    i25 *= (int)1.4859;
                    i23 = (int) Test0876.instanceCount;
                    Test0876.instanceCount -= Test0876.instanceCount;
                }
            }
        }

        FuzzerUtils.out.println("i i1 d = " + i + "," + i1 + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("i2 i22 d2 = " + i2 + "," + i22 + "," + Double.doubleToLongBits(d2));
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);

        FuzzerUtils.out.println("Test0876.instanceCount Test0876.bFld Test0876.fFld = " + Test0876.instanceCount + "," + (Test0876.bFld ? 1
                : 0) + "," + Float.floatToIntBits(Test0876.fFld));
        FuzzerUtils.out.println("Test0876.iArrFld sArrFld Test0876.lArrFld = " + FuzzerUtils.checkSum(Test0876.iArrFld) + "," +
                FuzzerUtils.checkSum(sArrFld) + "," + FuzzerUtils.checkSum(Test0876.lArrFld));

        FuzzerUtils.out.println("iMeth2_check_sum: " + iMeth2_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0876 _instance = new Test0876();
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
