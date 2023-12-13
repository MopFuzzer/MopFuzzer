// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:08 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-856526192421224728L;
    public static long lFld=-48L;
    public double dFld=-108.70656;
    public float fArrFld[]=new float[N];
    public static volatile int iArrFld[]=new int[N];
    public long lArrFld[]=new long[N];
    public byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -5);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i6, double d1) {

        double d2=-1.99203;
        int i7=8029, i8=-56144, i9=0, i10=20, i11=19;
        boolean b=true;
        float f1=86.721F;
        byte by=-33;

        Test.instanceCount -= Test.instanceCount;
        i6 *= 21930;
        for (d2 = 7; d2 < 139; ++d2) {
            Test.instanceCount += (long)(d2 * d2);
            i6 &= i6;
            i7 += i7;
            Test.iArrFld[(int)(d2)] = (int)Test.lFld;
            for (i8 = 1; 12 > i8; i8++) {
                for (i10 = 1; 2 > i10; i10++) {
                    Test.iArrFld[i10] = (int)1.678F;
                    if (b) continue;
                    f1 += (((i10 * i11) + f1) - Test.instanceCount);
                    Test.instanceCount |= by;
                    Test.iArrFld[i8 - 1] ^= i9;
                    Test.instanceCount = i7;
                }
            }
        }
        long meth_res = i6 + Double.doubleToLongBits(d1) + Double.doubleToLongBits(d2) + i7 + i8 + i9 + i10 + i11 + (b
            ? 1 : 0) + Float.floatToIntBits(f1) + by;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(double d, int i3) {

        int i4=12, i5=-43884, i12=2253, i13=39295, i14=213, i15=-228, iArr[]=new int[N];
        float f2=-2.189F;
        byte by1=-21, byArr[]=new byte[N];
        boolean b1=true;

        FuzzerUtils.init(iArr, 150);
        FuzzerUtils.init(byArr, (byte)-122);

        for (i4 = 7; i4 < 282; ++i4) {
            iArr[i4 - 1] >>= (int)(lMeth(i3, d) - f2);
            i3 = (int)f2;
            d *= i5;
            i5 |= by1;
            i12 = 1;
            while (++i12 < 6) {
                i5 -= (int)Test.instanceCount;
                b1 = b1;
                d -= i3;
            }
            for (i13 = 6; i13 > 1; i13 -= 3) {
                i15 = 1;
                while (++i15 < 6) {
                    Test.lFld = 34402;
                }
                byArr[i4] *= (byte)i5;
                iArr[i13 - 1] |= i14;
            }
            Test.instanceCount += (i4 ^ i3);
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + i3 + i4 + i5 + Float.floatToIntBits(f2) + by1 + i12 + (b1 ? 1 :
            0) + i13 + i14 + i15 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(byArr);
    }

    public int iMeth(int i2) {

        float f=36.291F;
        int i16=161, i17=-1068, i18=-2, i19=9;

        fArrFld[(i2 >>> 1) % N] *= ((f++) * (++Test.instanceCount));
        vMeth(dFld, i2);
        Test.instanceCount = i2;
        Test.lFld /= (Test.lFld | 1);
        lArrFld = lArrFld;
        Test.lFld >>= -9;
        i2 ^= i2;
        for (i16 = 3; i16 < 137; ++i16) {
            i2 <<= i17;
            for (i18 = 1; i18 < 12; i18++) {
                Test.lFld += 28432;
                i2 += (int)Test.lFld;
                dFld += i16;
                i2 += (31560 + (i18 * i18));
                i19 += (int)-17.611F;
            }
        }
        long meth_res = i2 + Float.floatToIntBits(f) + i16 + i17 + i18 + i19;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-14572, i1=243, i20=-47814;
        float f3=-2.899F;
        short s=25293;
        long l=2L;

        for (i = 23; i < 395; ++i) {
            iMeth(11);
            i1 = i;
            f3 -= -3832140778808813217L;
            f3 += i1;
            i1 += (i | s);
            for (l = i; 68 > l; l += 3) {
                byArrFld = byArrFld;
                Test.lFld *= Test.lFld;
            }
        }

        FuzzerUtils.out.println("i i1 f3 = " + i + "," + i1 + "," + Float.floatToIntBits(f3));
        FuzzerUtils.out.println("s l i20 = " + s + "," + l + "," + i20);

        FuzzerUtils.out.println("Test.instanceCount Test.lFld dFld = " + Test.instanceCount + "," + Test.lFld + "," +
            Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("fArrFld Test.iArrFld lArrFld = " +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)) + "," + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            FuzzerUtils.checkSum(lArrFld));
        FuzzerUtils.out.println("byArrFld = " + FuzzerUtils.checkSum(byArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
