// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:22 2023
public class Test0220 {

    public static final int N = 400;

    public static long instanceCount=-6505374217377745731L;
    public static float fFld=-84.458F;
    public static double dFld=62.86885;
    public int iFld=5;
    public static boolean bFld=false;
    public static boolean[] bArrFld =new boolean[N];
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0220.bArrFld, true);
        FuzzerUtils.init(Test0220.iArrFld, -10);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i1, short s, long l1) {

        long l2=-135L;
        boolean b=false;
        int i2=-12431, i3=-37174, i4=13183, i5=-252, i6=-1, i7=-185;

        l2 = 1;
        while (++l2 < 229) {
            i1 = i1;
            Test0220.fFld = -9;
        }
        Test0220.bArrFld[(i1 >>> 1) % N] = b;
        i1 = (int) Test0220.fFld;
        Test0220.dFld -= i1;
        i1 = i1;
        i1 = i1;
        for (i2 = 3; 153 > i2; i2++) {
            for (i4 = 1; 11 > i4; ++i4) {
                Test0220.fFld -= i3;
            }
            for (i6 = 1; i6 < 11; i6 += 3) {
                Test0220.fFld = i2;
                i3 += (int)-1621623537L;
                i1 += (i6 | i2);
            }
        }
        long meth_res = i1 + s + l1 + l2 + (b ? 1 : 0) + i2 + i3 + i4 + i5 + i6 + i7;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth1(long l, float f) {

        int i=10, i8=-5;
        short s1=-30002;
        byte by=60;
        long l3=-6L;
        long[] lArr =new long[N];
        boolean b1=true;

        FuzzerUtils.init(lArr, 1L);

        i = (-(Integer.reverseBytes(i) + (i * i)));
        iMeth(729, s1, 4L);
        by >>= (byte)-3;
        for (l3 = 8; l3 < 299; ++l3) {
            lArr[(int) (l3 - 1)] += (long) Test0220.dFld;
            i8 += (int)(10600L + (l3 * l3));
            if (b1) break;
            if (b1) continue;
        }
        vMeth1_check_sum += l + Float.floatToIntBits(f) + i + s1 + by + l3 + i8 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(lArr);
    }

    public void vMeth() {

        float f1=1.80F;
        int i9=-15437, i10=43423, i11=9370, i12=-9, i13=0, i14=19049;

        vMeth1(Test0220.instanceCount, Test0220.fFld);
        iFld %= (int)(iFld | 1);
        Test0220.iArrFld[(iFld >>> 1) % N] = (int) Test0220.fFld;
        Test0220.iArrFld[(173 >>> 1) % N] <<= (int) Test0220.instanceCount;
        for (f1 = 1; f1 < 147; f1++) {
            iFld = (int) Test0220.dFld;
            iFld += (int)f1;
        }
        for (i10 = 16; i10 < 306; i10++) {
            for (i12 = 1; i12 < 6; ++i12) {
                Test0220.instanceCount -= i10;
                Test0220.bArrFld[(i13 >>> 1) % N] = Test0220.bFld;
                i14 = 1;
                while (++i14 < 2) {
                    iFld |= i12;
                    i13 = i11;
                    i11 *= (int) Test0220.instanceCount;
                }
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f1) + i9 + i10 + i11 + i12 + i13 + i14;
    }

    public void mainTest(String[] strArr1) {

        int i15=65004, i16=-246, i17=56306, i18=-20042, i19=-59022;
        double d=-2.113463;
        double[] dArr =new double[N];
        long[] lArr1 =new long[N];

        FuzzerUtils.init(dArr, -2.4803);
        FuzzerUtils.init(lArr1, 219L);

        vMeth();
        dArr[(iFld >>> 1) % N] = Test0220.fFld;
        lArr1[(iFld >>> 1) % N] <<= iFld;
        for (i15 = 14; i15 < 316; i15++) {
            i16 = i16;
            iFld += i15;
            for (d = i15; d < 83; ++d) {
                i18 = 1;
                while (++i18 < 1) {
                    Test0220.instanceCount = i15;
                    i17 <<= i15;
                    switch (((i15 % 2) * 5) + 52) {
                    case 61:
                        i16 &= i17;
                        iFld >>= (int) Test0220.instanceCount;
                        switch (((-63055 >>> 1) % 1) + 71) {
                        case 71:
                            iFld = iFld;
                            Test0220.iArrFld[i18] >>= 44385;
                            iFld *= 5;
                            break;
                        default:
                            Test0220.fFld -= 186L;
                            Test0220.instanceCount = i18;
                        }
                        Test0220.dFld *= -119;
                        break;
                    case 58:
                        i16 -= i17;
                        iFld += (4 + (i18 * i18));
                        i17 >>= i16;
                        Test0220.instanceCount += (long) Test0220.fFld;
                        break;
                    }
                    iFld += i15;
                }
                i19 = 1;
                while (++i19 < 1) {
                    Test0220.dFld += iFld;
                    Test0220.fFld = i15;
                    Test0220.instanceCount >>= 22164;
                    i17 = i18;
                }
            }
        }

        FuzzerUtils.out.println("i15 i16 d = " + i15 + "," + i16 + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("dArr lArr1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + "," +
            FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test0220.instanceCount Test0220.fFld Test0220.dFld = " + Test0220.instanceCount + "," +
                Float.floatToIntBits(Test0220.fFld) + "," + Double.doubleToLongBits(Test0220.dFld));
        FuzzerUtils.out.println("iFld Test0220.bFld Test0220.bArrFld = " + iFld + "," + (Test0220.bFld ? 1 : 0) + "," +
                FuzzerUtils.checkSum(Test0220.bArrFld));
        FuzzerUtils.out.println("Test0220.iArrFld = " + FuzzerUtils.checkSum(Test0220.iArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0220 _instance = new Test0220();
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
