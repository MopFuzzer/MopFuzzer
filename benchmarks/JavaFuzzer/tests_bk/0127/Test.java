// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:55 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2583887784632657878L;
    public static int iFld=-57599;
    public static double dFld=1.124391;
    public static volatile float fFld=-1.990F;
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 48.712F);
    }

    public static long vMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i3=2, i4=131, i5=-4481, i6=14, i7=12571, i8=59;
        boolean b1=true;

        for (i3 = 268; i3 > 9; i3--) {
            Test.iFld += (((i3 * Test.iFld) + i4) - Test.instanceCount);
            try {
                i4 = (i4 / Test.iFld);
                i4 = (105 / i3);
                Test.iFld = (i3 / i4);
            } catch (ArithmeticException a_e) {}
        }
        Test.fArrFld = Test.fArrFld;
        i4 %= (int)(i4 | 1);
        for (i5 = 7; i5 < 150; ++i5) {
            Test.iFld = i6;
            Test.instanceCount <<= i4;
            Test.instanceCount += (i5 * i3);
            Test.dFld *= i5;
            i6 = -155;
            i6 <<= Test.iFld;
            for (i7 = 11; i7 > i5; --i7) {
                b1 = b1;
                Test.instanceCount = i7;
            }
        }
        long meth_res = i3 + i4 + i5 + i6 + i7 + i8 + (b1 ? 1 : 0);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static double dMeth(int i2, byte by, long l) {

        int i9=99, i10=8, i11=159, iArr[]=new int[N];
        short s=-11089;

        FuzzerUtils.init(iArr, -2080);

        Test.iFld *= (int)(((++l) - iMeth()) * -10);
        Test.iFld = 4004;
        Test.iFld = i2;
        Test.fArrFld[(Test.iFld >>> 1) % N] += 12;
        for (i9 = 11; i9 < 243; i9++) {
            Test.iFld >>>= i10;
            l <<= -20605;
            i2 += i9;
            i11 &= (int)Test.instanceCount;
            i10 += (int)Test.instanceCount;
            i11 = i11;
            i10 -= (int)l;
        }
        Test.fFld += Test.iFld;
        iArr[(-11 >>> 1) % N] -= (int)Test.dFld;
        by <<= (byte)s;
        long meth_res = i2 + by + l + i9 + i10 + i11 + s + FuzzerUtils.checkSum(iArr);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth(int i, int i1) {

        boolean b=true;
        byte by1=109;
        int i12=-10, i13=-9959, i14=13, i15=-9718, iArr1[]=new int[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(iArr1, -83);
        FuzzerUtils.init(dArr, -72.65751);

        b = (i1 != dMeth(i, by1, Test.instanceCount));
        Test.iFld -= i1;
        iArr1 = iArr1;
        Test.fArrFld[(0 >>> 1) % N] += i;
        by1 -= (byte)Test.dFld;
        Test.fFld *= Test.instanceCount;
        i = i;
        i12 = 1;
        do {
            Test.iFld ^= (int)Test.instanceCount;
            for (i13 = 1; i13 < 8; i13++) {
                i15 -= i;
                i1 = i14;
                Test.fFld = Test.instanceCount;
                dArr[i12] -= i12;
                b = false;
            }
        } while (++i12 < 204);
        vMeth_check_sum += i + i1 + (b ? 1 : 0) + by1 + i12 + i13 + i14 + i15 + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        int i16=-140, i17=54388, i18=0, i19=10, i20=-61160, i21=-49888, i22=95, i23=21057, iArr2[][]=new int[N][N];
        boolean b2=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 4129943949309557580L);
        FuzzerUtils.init(iArr2, -127);

        Test.iFld |= (int)lArr[(36974 >>> 1) % N];
        vMeth(11, Test.iFld);
        Test.iFld *= Test.iFld;
        Test.iFld += (int)Test.fFld;
        Test.iFld = (int)-1505685550L;
        i16 = 136;
        do {
            for (i17 = 7; i17 < 184; ++i17) {
                i18 -= i18;
                i18 *= i16;
                iArr2[i16 + 1][i17 - 1] *= -12;
            }
        } while (--i16 > 0);
        Test.iFld >>= (int)Test.instanceCount;
        Test.iFld = (int)Test.instanceCount;
        lArr[(Test.iFld >>> 1) % N] <<= Test.instanceCount;
        i18 *= -2;
        i18 = i17;
        i19 = 1;
        while (++i19 < 341) {
            i18 = i17;
            Test.fFld = 13;
            for (i20 = 74; i20 > i19; --i20) {
                Test.instanceCount = (long)Test.fFld;
                if (b2) break;
                try {
                    iArr2[i19 - 1][i20] = (i21 / i21);
                    i21 = (iArr2[(i19 >>> 1) % N][i20] / iArr2[i19][i19 + 1]);
                    i18 = (i20 / 304832546);
                } catch (ArithmeticException a_e) {}
                for (i22 = 1; 1 > i22; i22++) {
                    i18 -= (int)Test.instanceCount;
                    b2 = b2;
                    i21 += i22;
                    Test.instanceCount += (i22 | i19);
                }
                i23 += (i20 * i20);
                Test.instanceCount -= i22;
                Test.instanceCount = i17;
            }
        }

        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("b2 i22 i23 = " + (b2 ? 1 : 0) + "," + i22 + "," + i23);
        FuzzerUtils.out.println("lArr iArr2 = " + FuzzerUtils.checkSum(lArr) + "," + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.dFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.fFld Test.fArrFld = " + Float.floatToIntBits(Test.fFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  dMeth ->  dMeth vMeth mainTest
//DEBUG  iMeth ->  iMeth dMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
