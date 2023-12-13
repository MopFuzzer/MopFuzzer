// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:56 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=35565L;
    public static byte byFld=87;
    public static volatile float fFld=-119.90F;
    public static double dArrFld[]=new double[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.dArrFld, -115.58700);
        FuzzerUtils.init(Test.iArrFld, -1);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(float f1, int i5) {

        int i6=6, i7=54175, i8=-5, i9=11, i10=-147, iArr[]=new int[N];
        double d=-80.14906;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -9);
        FuzzerUtils.init(lArr, -3599654989135250403L);

        for (i6 = 3; i6 < 210; ++i6) {
            i7 = (int)f1;
            for (i8 = 1; i8 < 8; ++i8) {
                iArr[i6 - 1] += -32329;
                i5 *= (int)1.269F;
                for (d = 1; 2 > d; ++d) {
                    i10 = -9;
                    i9 ^= i6;
                    i10 = Test.byFld;
                    Test.instanceCount += (long)d;
                    i5 <<= i9;
                    lArr[i8 - 1] *= (long)f1;
                    i5 += (int)(((d * i9) + Test.instanceCount) - i6);
                }
                i9 += i8;
                if (i6 != 0) {
                    vMeth_check_sum += Float.floatToIntBits(f1) + i5 + i6 + i7 + i8 + i9 + Double.doubleToLongBits(d) +
                        i10 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
                    return;
                }
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f1) + i5 + i6 + i7 + i8 + i9 + Double.doubleToLongBits(d) + i10 +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth(float f) {

        int i1=14801, i2=-9, i3=-4, i4=202, i11=40044, i12=-3087, i13=-31;
        double d1=0.19131;
        float f2=31.177F;

        for (i1 = 7; i1 < 153; i1++) {
            for (i3 = 1; i3 < 11; i3++) {
                vMeth(f, i3);
                d1 += i4;
            }
            f -= i3;
            Test.dArrFld[i1] = i4;
            for (i11 = i1; 11 > i11; ++i11) {
                f -= i12;
                Test.iArrFld[i11 + 1] *= (int)Test.instanceCount;
            }
            i2 *= i1;
            i12 = -72;
            for (f2 = i1; f2 < 11; f2++) {
                boolean b=true;
                b = true;
                i2 += (int)(f2 - i1);
                if (b) break;
            }
        }
        long meth_res = Float.floatToIntBits(f) + i1 + i2 + i3 + i4 + Double.doubleToLongBits(d1) + i11 + i12 +
            Float.floatToIntBits(f2) + i13;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vSmallMeth(long l) {

        int i=12;

        i -= (i = iMeth(Test.fFld));
        vSmallMeth_check_sum += l + i;
    }

    public void mainTest(String[] strArr1) {

        int i14=-61121, i15=-3, i16=-27, i17=44757, i18=-5, i19=8, i20=-228, i21=32408, i22=54741;
        boolean b1=false;
        short s=-9466, sArr[]=new short[N];
        double d2=-2.107316, d3=-103.118244;
        long l1=7L;

        FuzzerUtils.init(sArr, (short)-23975);

        for (int smallinvoc=0; smallinvoc<273; smallinvoc++) vSmallMeth(Test.instanceCount);
        i14 = i14;
        i14 += i14;
        b1 = false;
        i15 = 1;
        while (++i15 < 224) {
            Test.instanceCount += Test.instanceCount;
            for (i16 = 7; 112 > i16; i16++) {
                i17 += s;
                for (i18 = 1; 2 > i18; i18++) {
                    sArr[i18 + 1] = (short)i17;
                    b1 = false;
                    i19 = s;
                    d2 /= (Test.byFld | 1);
                    Test.byFld += (byte)i19;
                    Test.iArrFld[i16 + 1] = (int)Test.instanceCount;
                    i19 -= i17;
                    Test.instanceCount = i19;
                }
                Test.instanceCount -= Test.instanceCount;
                Test.instanceCount = i16;
            }
            for (i20 = 112; i20 > 1; i20--) {
                i19 += (45079 + (i20 * i20));
                d3 = 1;
                while (++d3 < 2) {
                    Test.iArrFld[i15 + 1] ^= 57;
                    i14 |= i21;
                    i21 -= i20;
                    Test.instanceCount = i21;
                    Test.instanceCount += (long)d3;
                }
                for (l1 = i20; l1 < 2; l1++) {
                    Test.instanceCount = l1;
                    if (false) break;
                }
            }
        }

        FuzzerUtils.out.println("i14 b1 i15 = " + i14 + "," + (b1 ? 1 : 0) + "," + i15);
        FuzzerUtils.out.println("i16 i17 s = " + i16 + "," + i17 + "," + s);
        FuzzerUtils.out.println("i18 i19 d2 = " + i18 + "," + i19 + "," + Double.doubleToLongBits(d2));
        FuzzerUtils.out.println("i20 i21 d3 = " + i20 + "," + i21 + "," + Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("l1 i22 sArr = " + l1 + "," + i22 + "," + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.fFld = " + Test.instanceCount + "," + Test.byFld +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.dArrFld Test.iArrFld = " +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)) + "," + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth iMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
