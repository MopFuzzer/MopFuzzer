// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:12 2023
public class Test0003 {

    public static final int N = 400;

    public static long instanceCount=-10291L;
    public float fFld=-71.534F;
    public static int iFld=193;
    public static byte byFld=-109;
    public volatile int[][] iArrFld =new int[N][N];

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(float f, boolean b, short s1) {

        int i5=-37;
        int i6=239;
        int i7=13;
        int i8=-20388;
        int i9=-108;
        int[] iArr2 =new int[N];
        float[][] fArr =new float[N][N];
        long[][] lArr1 =new long[N][N];
        boolean[] bArr =new boolean[N];

        FuzzerUtils.init(fArr, -26.426F);
        FuzzerUtils.init(lArr1, 51864L);
        FuzzerUtils.init(iArr2, 195);
        FuzzerUtils.init(bArr, true);

        Test0003.iFld = Test0003.iFld;
        i5 = 1;
        do {
            for (i6 = i5; 4 > i6; ++i6) {
                i7 = (int) Test0003.instanceCount;
                i8 = 1;
                do {
                    i7 += (i8 * i8);
                    fArr[i6][i5 - 1] -= Test0003.byFld;
                    lArr1[i5 - 1][i8] += Test0003.iFld;
                } while (++i8 < 1);
                i9 = 1;
                do {
                    switch (((i5 % 3) * 5) + 14) {
                    case 21:
                        i7 -= (int)f;
                        f += (43830 + (i9 * i9));
                    case 26:
                        if (false) break;
                    case 19:
                        iArr2[i5 - 1] -= Test0003.byFld;
                        Test0003.iFld = 11;
                        break;
                    default:
                        bArr[i5 + 1] = b;
                    }
                } while ((i9 += 3) < 1);
            }
        } while (++i5 < 386);
        long meth_res = Float.floatToIntBits(f) + (b ? 1 : 0) + s1 + i5 + i6 + i7 + i8 + i9 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr1) +
            FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(bArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public long lMeth(int i1, short s) {

        int i3=13;
        int i4=-38241;
        int i10=-6867;
        int i11=12979;
        int i12=51257;
        int i13=-231;
        int i14=12;
        int[] iArr1 =new int[N];
        boolean b1=true;
        double d1=-51.67996;

        FuzzerUtils.init(iArr1, -52349);

        for (int i2 : iArr1) {
            for (i3 = 1; i3 < 4; ++i3) {
                iArr1 = (iArr1 = (iArrFld[i3] = (iArr1 = FuzzerUtils.int1array(N, (int)49544))));
                fFld /= (iMeth(fFld, b1, s) | 1);
                for (i10 = 1; i10 < 2; ++i10) {
                    i11 -= i2;
                    fFld = (float)d1;
                }
            }
            i2 -= i3;
            i12 = 1;
            while (++i12 < 4) {
                i2 = i3;
                for (i13 = 1; 1 > i13; ++i13) {
                    i14 = -96;
                    i1 = Test0003.iFld;
                    s -= (short) Test0003.instanceCount;
                    i4 = i14;
                }
            }
        }
        long meth_res = i1 + s + i3 + i4 + (b1 ? 1 : 0) + i10 + i11 + Double.doubleToLongBits(d1) + i12 + i13 + i14 +
            FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void vMeth() {

        int i=149;
        int i15=57409;
        int i16=72;
        int i18=254;
        int i19=-9;
        int[] iArr =new int[N];
        double d=-2.103821;
        long l=-1659677678L;
        long[] lArr =new long[N];
        boolean b2=false;

        FuzzerUtils.init(iArr, -5229);
        FuzzerUtils.init(lArr, -1L);

        iArr[(i >>> 1) % N] = (int) (((++iArr[(i >>> 1) % N]) - (fFld * Test0003.instanceCount)) * Math.max(Math.max(i, i),
                (int) (Test0003.instanceCount + d)));
        if (b2) {
            iArr[(2 >>> 1) % N] *= (i--);
        } else if (b2) {
            lArr[(3 >>> 1) % N] -= lMeth(Test0003.iFld, (short) (5576));
            i += i;
            for (i15 = 5; i15 < 297; ++i15) {
                Test0003.iFld += (((i15 * Test0003.iFld) + fFld) - i);
                l += (long)(-69.880F + (i15 * i15));
                for (i18 = i15; i18 < 6; i18++) {
                    i += i18;
                    if (b2) continue;
                    l = i19;
                    i16 *= i15;
                    d *= i;
                    fFld += (8544476703306913373L + (i18 * i18));
                }
            }
        } else {
            i = 87;
        }
        vMeth_check_sum += i + Double.doubleToLongBits(d) + i15 + i16 + l + i18 + i19 + (b2 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {


        vMeth();


        FuzzerUtils.out.println("Test0003.instanceCount fFld Test0003.iFld = " + Test0003.instanceCount + "," +
                Float.floatToIntBits(fFld) + "," + Test0003.iFld);
        FuzzerUtils.out.println("Test0003.byFld iArrFld = " + Test0003.byFld + "," + FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0003 _instance = new Test0003();
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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  iMeth ->  iMeth lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
