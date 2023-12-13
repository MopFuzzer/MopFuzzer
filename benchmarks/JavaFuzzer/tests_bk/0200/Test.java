// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:58 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=2747032094L;
    public static int iFld=-31;
    public static float fFld=-20.933F;
    public static short sFld=-28429;

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l1, double d, int i6) {

        int i7=82, i8=8, i9=-6, i10=3, i11=2548, iArr1[]=new int[N];
        byte by=-83;
        double dArr[]=new double[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(dArr, -66.10138);
        FuzzerUtils.init(fArr, -76.625F);
        FuzzerUtils.init(iArr1, 61697);

        for (i7 = 17; i7 < 376; ++i7) {
            i9 = 1;
            do {
                Test.iFld %= (int)(i8 | 1);
                Test.iFld &= i9;
                Test.iFld -= by;
            } while (++i9 < 5);
            for (i10 = 1; i10 < 5; ++i10) {
                dArr[i10] = i8;
                l1 += (((i10 * i8) + Test.iFld) - i9);
                i6 += i8;
                Test.iFld -= Test.iFld;
            }
            i11 <<= i9;
            fArr[i7 - 1] += Test.fFld;
            iArr1[i7 - 1] = 16334;
            l1 += (26676 + (i7 * i7));
        }
        Test.iFld += i8;
        vMeth1_check_sum += l1 + Double.doubleToLongBits(d) + i6 + i7 + i8 + i9 + by + i10 + i11 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(iArr1);
    }

    public static long lMeth(int i4, int i5) {

        double d1=103.24612, d2=-125.15309;
        int i12=-195, i13=11, i14=3, i15=12, i16=14, i17=-30277;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -32373L);

        vMeth1(Test.instanceCount, d1, i4);
        for (i12 = 4; i12 < 378; i12++) {
            i13 = i13;
            lArr[i12 + 1] = i4;
        }
        switch (((i12 >>> 1) % 2) + 23) {
        case 23:
            i14 = 197;
            while (--i14 > 0) {
                Test.instanceCount *= i13;
            }
            i4 *= (int)Test.instanceCount;
            i13 = (int)Test.instanceCount;
        case 24:
            Test.fFld *= i5;
            for (i15 = 9; i15 < 249; i15++) {
                if (Test.iFld != 0) {
                }
                for (d2 = 7; 1 < d2; d2--) {
                    i17 -= 1751;
                    i4 += (-15 + (d2 * d2));
                }
            }
            break;
        }
        long meth_res = i4 + i5 + Double.doubleToLongBits(d1) + i12 + i13 + i14 + i15 + i16 +
            Double.doubleToLongBits(d2) + i17 + FuzzerUtils.checkSum(lArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(long l) {

        float f=-15.261F;
        int i1=2, i2=-8, i3=-14803, i18=-49313, iArr2[][]=new int[N][N];
        boolean b=false;
        long l2=-9L, lArr1[][]=new long[N][N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-123);
        FuzzerUtils.init(iArr2, -4764);
        FuzzerUtils.init(lArr1, -216L);

        for (f = 6; 146 > f; f++) {
            for (i2 = 1; i2 < 11; i2++) {
                byArr[i2 + 1] += (byte)lMeth(i3, -2);
                if (b) {
                    i3 -= 16091;
                    if (b) break;
                    iArr2[i2 + 1][i2] >>= Test.sFld;
                    for (l2 = 1; l2 < 2; ++l2) {
                        i3 *= i3;
                        lArr1[(int)(f)][(int)(l2 + 1)] -= Test.iFld;
                        i1 += (int)(l2 + i18);
                        Test.fFld -= i18;
                        i3 -= i18;
                    }
                } else if (b) {
                    i1 += (5 + (i2 * i2));
                    i18 -= i18;
                } else if (b) {
                    Test.fFld -= -89.462F;
                } else {
                    lArr1[i2 - 1][(int)(f)] >>= i3;
                }
            }
        }
        vMeth_check_sum += l + Float.floatToIntBits(f) + i1 + i2 + i3 + (b ? 1 : 0) + l2 + i18 +
            FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(lArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=1, iArr[]=new int[N];

        FuzzerUtils.init(iArr, -11569);

        i = 1;
        while (++i < 365) {
            Test.iFld -= (i + i);
            iArr[i + 1] = (int)(Test.instanceCount--);
        }
        vMeth(Test.instanceCount);

        FuzzerUtils.out.println("i iArr = " + i + "," + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.fFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.sFld = " + Test.sFld);

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
