// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:01 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=91L;
    public static float fFld=-65.339F;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.lArrFld, -124L);
        FuzzerUtils.init(Test.iArrFld, 2);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i4) {

        double d=0.64018;
        int i5=-11, i6=-195, i7=-108, i8=62639, iArr[]=new int[N];
        float f=-108.946F;
        short s1=1595;
        boolean b1=false;

        FuzzerUtils.init(iArr, -97);

        Test.lArrFld[(i4 >>> 1) % N] = (long)d;
        for (i5 = 2; i5 < 167; i5++) {
            f = 1;
            do {
                iArr[(int)(f + 1)] >>= (int)Test.instanceCount;
                Test.fFld = Test.instanceCount;
                i7 = 1;
                do {
                    i6 *= s1;
                    Test.lArrFld[i7 - 1] -= 0;
                    if (true) {
                        if (b1) continue;
                        Test.instanceCount = Test.instanceCount;
                        i4 -= -5;
                        Test.instanceCount ^= i5;
                    } else if (b1) {
                        s1 += (short)(i7 * i7);
                    }
                    i8 <<= (int)Test.instanceCount;
                } while (++i7 < 2);
            } while ((f += 2) < 10);
        }
        long meth_res = i4 + Double.doubleToLongBits(d) + i5 + i6 + Float.floatToIntBits(f) + i7 + s1 + (b1 ? 1 : 0) +
            i8 + FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i1, long l) {

        int i2=12, i3=3, i9=-29718, i10=14, i11=-117, i12=137;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 1.189F);

        for (i2 = 7; i2 < 169; i2++) {
            i1 >>= (int)((i3 <<= (int)l) + Math.abs(lMeth(164)));
        }
        for (float f1 : fArr) {
            for (i9 = 1; i9 < 4; i9++) {
                Test.lArrFld[i9] -= i9;
                l = i2;
                i10 += (((i9 * i10) + i3) - i9);
                Test.lArrFld[(-174 >>> 1) % N] >>= i9;
                i3 = (int)l;
            }
            Test.iArrFld[(i1 >>> 1) % N][(i1 >>> 1) % N] = -37162;
        }
        l = i2;
        i10 = i3;
        for (i11 = 14; i11 < 388; ++i11) {
            Test.lArrFld[i11] /= (i10 | 1);
            l = 168;
        }
        vMeth_check_sum += i1 + l + i2 + i3 + i9 + i10 + i11 + i12 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vSmallMeth(int i, boolean b, short s) {


        vMeth(i, Test.instanceCount);
        vSmallMeth_check_sum += i + (b ? 1 : 0) + s;
    }

    public void mainTest(String[] strArr1) {

        boolean b2=true;
        short s2=23575, s3=-28702;
        int i13=49203, i14=104, i15=68, i16=-14, i17=-53240, i18=-38380, i19=40889, i20=236, i21=2, i22=-50;
        double d1=0.36877, dArr[]=new double[N];

        FuzzerUtils.init(dArr, 53.128513);

        for (int smallinvoc=0; smallinvoc<978; smallinvoc++) vSmallMeth(203, b2, s2);
        i13 = 190;
        while (--i13 > 0) {
            Test.iArrFld[i13 - 1][i13] = -22018;
            d1 += i13;
            i14 /= (int)(Test.instanceCount | 1);
            i14 = 51;
            Test.fFld += (((i13 * i13) + i14) - Test.fFld);
        }
        i15 = 1;
        while (++i15 < 397) {
            i14 += i14;
            i14 += (((i15 * Test.fFld) + Test.instanceCount) - i13);
        }
        i14 += s3;
        d1 = -1;
        if (b2) {
            i14 = i13;
            i14 += i13;
            i16 = 1;
            do {
                Test.lArrFld[i16 - 1] = Test.instanceCount;
            } while (++i16 < 242);
            for (i17 = 3; i17 < 354; i17++) {
                Test.iArrFld[i17 - 1][i17 + 1] = (int)Test.instanceCount;
                Test.instanceCount += (i17 + i14);
                Test.instanceCount -= i16;
                for (i19 = 2; i19 < 72; i19++) {
                    dArr[i19] = Test.fFld;
                    for (i21 = 1; i21 < 2; ++i21) {
                        i14 -= i13;
                        Test.iArrFld[i17][i17] <<= (int)Test.instanceCount;
                        Test.iArrFld[i17 + 1][i21] = i17;
                    }
                    i14 = -138;
                }
                Test.fFld += Test.instanceCount;
                Test.lArrFld = Test.lArrFld;
            }
        } else {
            Test.instanceCount *= i16;
        }

        FuzzerUtils.out.println("b2 s2 i13 = " + (b2 ? 1 : 0) + "," + s2 + "," + i13);
        FuzzerUtils.out.println("d1 i14 i15 = " + Double.doubleToLongBits(d1) + "," + i14 + "," + i15);
        FuzzerUtils.out.println("s3 i16 i17 = " + s3 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 dArr = " + i21 + "," + i22 + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.lArrFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + FuzzerUtils.checkSum(Test.lArrFld));
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  lMeth ->  lMeth vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
