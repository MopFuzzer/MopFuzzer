// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:55 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-247L;
    public static float fFld=0.808F;
    public static int iFld=-1;
    public static volatile double dFld=86.19704;
    public static boolean bFld=true;
    public double dArrFld[]=new double[N];

    public static long vSmallMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(double d) {

        int i3=-11, i4=142, i5=-143, i6=-185, iArr1[]=new int[N];
        double dArr[]=new double[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(dArr, 50.12983);
        FuzzerUtils.init(lArr, -2366856067447987557L);
        FuzzerUtils.init(iArr1, -21965);

        i3 = 1;
        do {
            dArr[i3] -= Test.instanceCount;
            if (false) continue;
            i4 = 1;
            while ((i4 += 2) < 7) {
                i5 = i5;
                i6 = 1;
                do {
                    Test.instanceCount = Test.instanceCount;
                    i5 += i5;
                    d *= -4755372557024295901L;
                    i5 += (((i6 * Test.instanceCount) + i3) - i5);
                    lArr = lArr;
                    iArr1[i4] *= i4;
                    d += 2202800294486983348L;
                } while (++i6 < 3);
                i5 = i5;
                i5 %= (int)((long)(Test.fFld) | 1);
            }
        } while (++i3 < 247);
        long meth_res = Double.doubleToLongBits(d) + i3 + i4 + i5 + i6 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr1);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static int iMeth(float f) {

        int i1=-25842, i2=-140, i8=-4, i9=4, iArr[]=new int[N];
        double d1=107.103807;
        byte by2=-58;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr, 6);
        FuzzerUtils.init(lArr1, -4144073477L);

        for (i1 = 8; i1 < 175; ++i1) {
            i2 >>>= (int)(((i1 + i1) * (iArr[i1 + 1]--)) * (-fMeth(d1)));
            Test.iFld >>= (int)Test.instanceCount;
        }
        Test.iFld <<= 7;
        switch ((((Test.iFld >>> 1) % 3) * 5) + 33) {
        case 35:
            i2 += i1;
        case 40:
            for (int i7 : iArr) {
                for (i8 = 1; i8 < 4; ++i8) {
                    lArr1[i8] += 7;
                    Test.instanceCount = i1;
                    Test.instanceCount = i8;
                    if (i8 != 0) {
                    }
                    iArr[i8 - 1] &= i8;
                    Test.iFld += i8;
                    i2 -= (int)3510789423507341981L;
                }
            }
        case 37:
            by2 = (byte)-60;
        }
        long meth_res = Float.floatToIntBits(f) + i1 + i2 + Double.doubleToLongBits(d1) + i8 + i9 + by2 +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vSmallMeth(int i, byte by, byte by1) {


        iMeth(Test.fFld);
        Test.instanceCount *= Test.iFld;
        vSmallMeth_check_sum += i + by + by1;
    }

    public void mainTest(String[] strArr1) {

        byte by3=79;
        int i10=38397, i11=-219, i12=9, i13=-12636, i14=83, i15=6, i16=14, i17=45731, i18=16, i19=13, i20=46705,
            i21=-2, iArr2[]=new int[N];
        long lArr2[]=new long[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(lArr2, 129L);
        FuzzerUtils.init(iArr2, 29149);
        FuzzerUtils.init(fArr, 1.895F);

        for (int smallinvoc=0; smallinvoc<899; smallinvoc++) vSmallMeth(Test.iFld, by3, by3);
        lArr2[(Test.iFld >>> 1) % N] = Test.instanceCount;
        for (i10 = 10; i10 < 221; i10++) {
            try {
                i11 = (Test.iFld / i10);
                Test.iFld = (Test.iFld / -34299);
                i11 = (Test.iFld / i11);
            } catch (ArithmeticException a_e) {}
            Test.instanceCount = (long)Test.dFld;
            Test.iFld -= i11;
            for (i12 = 5; i12 < 119; i12++) {
                short s=17850;
                for (i14 = i12; i14 < 2; i14++) {
                    iArr2[i12 + 1] = (int)Test.fFld;
                    Test.iFld *= Test.iFld;
                    i11 = (int)Test.dFld;
                }
                Test.iFld *= (int)Test.fFld;
                i15 += (i12 + Test.instanceCount);
                Test.fFld *= s;
                Test.fFld = i10;
                Test.instanceCount = (long)Test.dFld;
            }
            iArr2[i10] = i14;
            for (i16 = 2; i16 < 119; i16++) {
                Test.instanceCount >>= -41822;
                fArr[i10] -= Test.iFld;
                Test.instanceCount = 245;
                iArr2[i16] = (int)Test.instanceCount;
                for (i18 = 2; i18 > 1; --i18) {
                    lArr2[i18 + 1] += i18;
                    Test.instanceCount += (long)Test.fFld;
                }
                for (i20 = 1; i20 < 2; ++i20) {
                    i11 += i20;
                    Test.bFld = Test.bFld;
                    i11 -= i11;
                    dArrFld[i10 + 1] = i21;
                }
            }
        }

        FuzzerUtils.out.println("by3 i10 i11 = " + by3 + "," + i10 + "," + i11);
        FuzzerUtils.out.println("i12 i13 i14 = " + i12 + "," + i13 + "," + i14);
        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 lArr2 iArr2 = " + i21 + "," + FuzzerUtils.checkSum(lArr2) + "," +
            FuzzerUtils.checkSum(iArr2));
        FuzzerUtils.out.println("fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.iFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.iFld);
        FuzzerUtils.out.println("Test.dFld Test.bFld dArrFld = " + Double.doubleToLongBits(Test.dFld) + "," +
            (Test.bFld ? 1 : 0) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));

        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  fMeth ->  fMeth iMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
