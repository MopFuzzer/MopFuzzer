// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:54 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=7847148411097479957L;
    public static int iFld=198;
    public float fFld=-1.971F;
    public volatile boolean bFld=false;
    public static boolean bFld1=false;
    public static float fFld1=0.403F;
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.fArrFld, -1.669F);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static long lMeth() {


        Test.iFld += (int)-42.109545;
        long meth_res = 0;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth(int i5, float f) {

        double d1=-86.36939;
        int i6=18, i7=192, i8=0, i9=-50831, iArr3[]=new int[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr3, 245);
        FuzzerUtils.init(fArr, -1.554F);

        if (true) {
            switch ((((-47145 >>> 1) % 5) * 5) + 11) {
            case 20:
                iArr3[(i5 >>> 1) % N] = (int)d1;
            case 23:
                iArr3[(i5 >>> 1) % N] ^= Test.iFld;
                for (i6 = 10; i6 < 274; i6++) {
                    Test.instanceCount -= Test.instanceCount;
                }
            case 13:
            case 15:
                if (Test.bFld1) {
                    i5 += (int)72.26427;
                } else if (Test.bFld1) {
                    Test.iFld = 3;
                } else {
                    f = 32146;
                    i7 = i7;
                    for (i8 = 8; i8 < 176; i8++) {
                        if (i7 != 0) {
                        }
                        iArr3[i8 + 1] = -102;
                        f *= Test.instanceCount;
                    }
                }
            case 22:
                i7 = (int)Test.instanceCount;
                break;
            }
        } else if (Test.bFld1) {
            i9 = i9;
        } else {
            i5 = i9;
        }
        long meth_res = i5 + Float.floatToIntBits(f) + Double.doubleToLongBits(d1) + i6 + i7 + i8 + i9 +
            FuzzerUtils.checkSum(iArr3) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(double d, long l) {

        int i2=19984, i3=-165, i4=-8, i10=59172, i11=57186, i12=12, i13=-13, iArr2[]=new int[N];
        short s=5665;
        long l1=-9L, lArr1[]=new long[N];

        FuzzerUtils.init(iArr2, 22105);
        FuzzerUtils.init(lArr1, 17553L);

        for (i2 = 9; i2 < 283; i2++) {
            s = (short)(Math.min(Test.instanceCount, l++) - ((Test.iFld -= (int)l) % (Test.iFld | 1)));
            i4 = 1;
            do {
                Test.iFld += (int)Math.abs((s + Test.iFld) + (--i3));
                iArr2[i4 + 1] += (int)(iMeth(i4, Test.fFld1) - l);
                for (l1 = 1; 1 > l1; ++l1) {
                    if (Test.bFld1) {
                        i10 = Test.iFld;
                    }
                    lArr1[i2] *= Test.instanceCount;
                }
                i3 = (int)Test.instanceCount;
                Test.instanceCount += (i4 ^ s);
                Test.fArrFld[i2 + 1] = l1;
                for (i11 = 1; i11 < 1; i11++) {
                    l -= Test.iFld;
                    Test.fArrFld[i11 - 1] -= i13;
                }
            } while (++i4 < 6);
        }
        vMeth1_check_sum += Double.doubleToLongBits(d) + l + i2 + i3 + s + i4 + l1 + i10 + i11 + i12 + i13 +
            FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(lArr1);
    }

    public static void vMeth() {

        double d2=-42.89768;
        int i14=200, i15=-7, i16=17, i17=-7, iArr1[][]=new int[N][N];
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -16336L);
        FuzzerUtils.init(iArr1, -40382);

        Test.iFld *= (int)(lArr[(37446 >>> 1) % N]++);
        Test.iFld += iArr1[(14 >>> 1) % N][(-14 >>> 1) % N];
        vMeth1(d2, Test.instanceCount);
        i14 = 1;
        do {
            Test.bFld1 = true;
            lArr[i14 - 1] = Test.instanceCount;
            Test.fFld1 -= i14;
        } while (++i14 < 295);
        if (false) {
            Test.iFld -= 9;
        } else {
            for (i15 = 13; i15 < 355; ++i15) {
                i17 = 1;
                while (++i17 < 5) {
                    Test.iFld -= (int)Test.instanceCount;
                    Test.iFld >>>= (int)-457059154308035019L;
                    if (i15 != 0) {
                        vMeth_check_sum += Double.doubleToLongBits(d2) + i14 + i15 + i16 + i17 +
                            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1);
                        return;
                    }
                    d2 = i16;
                }
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d2) + i14 + i15 + i16 + i17 + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=4, i1=-99, i18=0, i19=-46838, i20=-7, iArr[]=new int[N];
        long l2=-204L;
        boolean bArr[][]=new boolean[N][N];

        FuzzerUtils.init(iArr, -11);
        FuzzerUtils.init(bArr, false);

        iArr[(i >>> 1) % N] = (int)((++Test.iFld) - (Test.iFld + (fFld--)));
        iArr[(i >>> 1) % N] %= (int)(Test.iFld | 1);
        bArr[(i >>> 1) % N][(Test.iFld >>> 1) % N] = (bFld = ((i + 55744L) != (--i)));
        Test.iFld *= (int)(((-57811 - lMeth()) + (-2.37150 * (i - 116))) + i);
        i1 = 283;
        while (--i1 > 0) {
            vMeth();
            i += (int)fFld;
            for (i18 = 5; i18 < 89; i18++) {
                i20 = 1;
                do {
                    i19 = i18;
                    i19 += i20;
                    Test.instanceCount = i19;
                } while (++i20 < 2);
                Test.iFld = 19806;
                l2 = 2;
                do {
                    double d3=0.120673;
                    Test.iFld += (int)Test.fFld1;
                    Test.iFld += (int)l2;
                    i19 >>= (int)l2;
                    i19 = i;
                    Test.iFld >>= i20;
                    iArr[i18 + 1] &= i19;
                    Test.instanceCount <<= Test.instanceCount;
                    i19 = i20;
                    switch (((i18 % 2) * 5) + 108) {
                    case 118:
                        i19 += (112 + (l2 * l2));
                        Test.fFld1 += (l2 * l2);
                        iArr[i1] += i;
                        i19 -= (int)Test.fFld1;
                        break;
                    case 111:
                        d3 -= -59.901F;
                        Test.fFld1 *= i20;
                        Test.iFld <<= (int)l2;
                        break;
                    default:
                        i <<= i1;
                    }
                } while ((l2 -= 3) > 0);
            }
        }

        FuzzerUtils.out.println("i i1 i18 = " + i + "," + i1 + "," + i18);
        FuzzerUtils.out.println("i19 i20 l2 = " + i19 + "," + i20 + "," + l2);
        FuzzerUtils.out.println("iArr bArr = " + FuzzerUtils.checkSum(iArr) + "," + FuzzerUtils.checkSum(bArr));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld fFld = " + Test.instanceCount + "," + Test.iFld + "," +
            Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("bFld Test.bFld1 Test.fFld1 = " + (bFld ? 1 : 0) + "," + (Test.bFld1 ? 1 : 0) + "," +
            Float.floatToIntBits(Test.fFld1));
        FuzzerUtils.out.println("Test.fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}