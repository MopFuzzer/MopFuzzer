// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:50 2023
public class Test0802 {

    public static final int N = 400;

    public static long instanceCount=-51377L;
    public byte byFld=45;
    public static float fFld=2.660F;
    public static boolean bFld=true;
    public static double dFld=-17.21469;
    public int[] iArrFld =new int[N];
    public float[][] fArrFld =new float[N][N];
    public int[] iArrFld1 =new int[N];
    public static double[] dArrFld =new double[N];

    static {
        FuzzerUtils.init(Test0802.dArrFld, -2.59412);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i7, boolean b) {

        int i8=8, i9=-56865;

        for (i8 = 11; i8 < 211; ++i8) {
            i7 = i9;
            i7 = -78;
        }
        vMeth1_check_sum += i7 + (b ? 1 : 0) + i8 + i9;
    }

    public int iMeth(long l, int i3) {

        float f=0.981F;
        int i4=-1, i5=-203, i6=-166;
        short s=1719;
        boolean b1=true;
        double[] dArr =new double[N];

        FuzzerUtils.init(dArr, -1.37928);

        iArrFld[(176 >>> 1) % N] <<= i3;
        f += (((byFld--) - (i3 - 33755)) % (((i3 + i3) | (i3 ^ 6)) | 1));
        for (i4 = 8; 148 > i4; i4++) {
            f += (((i4 * i4) + Test0802.instanceCount) - s);
        }
        i6 = 1;
        while (++i6 < 169) {
            iArrFld[i6] = (int)790518129458319630L;
            vMeth1(i3, b1);
            f -= i5;
            i5 += 6;
            b1 = b1;
            l += i5;
            s <<= (short)l;
        }
        for (double d : dArr) {
            fArrFld[(-60753 >>> 1) % N][(i6 >>> 1) % N] += i5;
            i5 -= (int)-17.979F;
        }
        long meth_res = l + i3 + Float.floatToIntBits(f) + i4 + i5 + s + i6 + (b1 ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth(int i, byte by) {

        int i1=-11, i2=0, i10=-37, i11=20217, i12=106;
        double d1=1.123846;
        short s1=8375;

        for (i1 = 7; i1 < 121; i1++) {
            Test0802.instanceCount -= Math.max((i1 - i1) + iMeth(Test0802.instanceCount, i2), i);
        }
        for (i10 = 9; i10 < 229; ++i10) {
            iArrFld1[i10 - 1] *= i;
            i11 = (int)d1;
            iArrFld1[i10 + 1] |= 20074;
        }
        i2 += i2;
        try {
            Test0802.instanceCount += (long) Test0802.fFld;
            i12 = 1;
            do {
                i -= i;
                iArrFld1[i12] *= i;
                if (i11 != 0) {
                    vMeth_check_sum += i + by + i1 + i2 + i10 + i11 + Double.doubleToLongBits(d1) + i12 + s1;
                    return;
                }
            } while (++i12 < 224);
            Test0802.bFld = true;
        }
        catch (UserDefinedExceptionTest exc1) {
            i2 -= s1;
        }
        vMeth_check_sum += i + by + i1 + i2 + i10 + i11 + Double.doubleToLongBits(d1) + i12 + s1;
    }

    public void mainTest(String[] strArr1) {

        int i13=71, i14=-251, i15=214, i16=-43, i17=-243, i18=-4, i19=-245, i20=20556;
        long l1=-45L;
        byte[][] byArr =new byte[N][N];

        FuzzerUtils.init(byArr, (byte)-22);

        vMeth(90, byFld);
        for (i13 = 3; i13 < 243; i13 += 2) {
            i14 = byFld;
            Test0802.dFld = Test0802.fFld;
        }
        Test0802.instanceCount -= i13;
        Test0802.instanceCount = Test0802.instanceCount;
        l1 = 1;
        do {
            Test0802.fFld *= -32.732F;
            Test0802.instanceCount = (long) -2.516F;
            i14 += i14;
            for (i15 = 5; i15 < 148; i15 += 2) {
                Test0802.instanceCount += (-9 + (i15 * i15));
                Test0802.dFld += i14;
                i14 |= i13;
                byArr[i15 + 1][i15 - 1] *= (byte)i16;
                i16 += i15;
                fArrFld[(int)(l1 + 1)][i15 - 1] -= i14;
                for (i17 = 1; i17 < 3; i17++) {
                    Test0802.fFld -= i16;
                    Test0802.dArrFld[i15] += Test0802.dFld;
                    i14 = i17;
                    Test0802.bFld = Test0802.bFld;
                    i14 |= i14;
                    i18 = (int)l1;
                    i18 = i19;
                }
            }
            i20 = 148;
            do {
                i16 += (((i20 * i15) + i15) - Test0802.fFld);
                iArrFld1[(int)(l1)] = -55854;
                i14 += (i20 + i19);
                i14 += (int) Test0802.instanceCount;
            } while (--i20 > 0);
        } while (++l1 < 169);

        FuzzerUtils.out.println("i13 i14 l1 = " + i13 + "," + i14 + "," + l1);
        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("byArr = " + FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test0802.instanceCount byFld Test0802.fFld = " + Test0802.instanceCount + "," + byFld + "," +
                Float.floatToIntBits(Test0802.fFld));
        FuzzerUtils.out.println("Test0802.bFld Test0802.dFld iArrFld = " + (Test0802.bFld ? 1 : 0) + "," +
                Double.doubleToLongBits(Test0802.dFld) + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("fArrFld iArrFld1 Test0802.dArrFld = " +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)) + "," + FuzzerUtils.checkSum(iArrFld1) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0802.dArrFld)));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0802 _instance = new Test0802();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
class UserDefinedExceptionTest extends RuntimeException {
    public int field;
}

//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
