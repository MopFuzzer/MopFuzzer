// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:52 2023
public class Test0862 {

    public static final int N = 400;

    public static long instanceCount=60600L;
    public static int iFld=-9;
    public static byte byFld=104;
    public boolean bFld=true;
    public float fFld=31.465F;
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0862.iArrFld, -65);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l1, long l2) {

        boolean b1=true;
        int i=-78;
        int i1=-10;
        int i2=16;
        int i3=-9;
        int[] iArr1 =new int[N];
        byte by=80;
        float f=1.277F;
        double d=-7.43675;
        short s=16065;

        FuzzerUtils.init(iArr1, -27);

        if (b1) {
            vMeth1_check_sum += l1 + l2 + (b1 ? 1 : 0) + i + i1 + by + Float.floatToIntBits(f) +
                Double.doubleToLongBits(d) + i2 + i3 + s + FuzzerUtils.checkSum(iArr1);
            return;
        }
        if (b1) {
            for (i = 10; 190 > i; i++) {
                l2 -= -131;
                i1 = by;
                i1 = 32170;
                f = (float)d;
                Test0862.instanceCount = Test0862.iFld;
                i1 <<= i1;
                i1 = i;
            }
            Test0862.iFld *= (int) d;
            for (i2 = 3; 342 > i2; ++i2) {
                d -= l2;
                s = (short) Test0862.iFld;
                i1 = (int)f;
            }
        } else if (b1) {
            l1 = i2;
        } else {
            l2 >>= 22;
        }
        vMeth1_check_sum += l1 + l2 + (b1 ? 1 : 0) + i + i1 + by + Float.floatToIntBits(f) + Double.doubleToLongBits(d)
            + i2 + i3 + s + FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth() {

        long l3=8116398331192426188L;
        long[] lArr =new long[N];
        int i5=219;
        int i6=-12;
        int i7=-109;
        int i8=197;
        int[] iArr2 =new int[N];
        short s1=-11240;
        double d1=2.51826;

        FuzzerUtils.init(lArr, 76L);
        FuzzerUtils.init(iArr2, 166);

        vMeth1(Test0862.instanceCount, l3);
        for (i5 = 12; i5 < 231; i5 += 3) {
            i6 = Test0862.iFld;
        }
        for (long l4 : lArr) {
            s1 += (short)i6;
            Test0862.instanceCount -= l4;
            l3 += i5;
            Test0862.iFld += (int) Test0862.instanceCount;
            Test0862.iFld = i6;
        }
        iArr2[(-12 >>> 1) % N] = i5;
        Test0862.iFld -= Test0862.iFld;
        for (i7 = 10; i7 < 170; i7++) {
            d1 -= -6;
            s1 = (short)5;
            if (true) break;
        }
        long meth_res = l3 + i5 + i6 + s1 + i7 + i8 + Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth(boolean b, long l) {

        int i9=-13;
        int i10=-46176;
        int i11=-1017;
        int i12=47809;
        int i13=1;
        int[] iArr =new int[N];
        float[] fArr =new float[N];

        FuzzerUtils.init(iArr, -53);
        FuzzerUtils.init(fArr, -53.105F);

        iArr[(Test0862.iFld >>> 1) % N] = iMeth();
        Test0862.iFld = Test0862.iFld;
        i9 = 1;
        while (++i9 < 133) {
            for (i10 = 12; i10 > 1; i10--) {
                for (i12 = 1; i12 < 2; ++i12) {
                    Test0862.instanceCount += i12;
                    i13 = i13;
                    i13 += (((i12 * i9) + i9) - Test0862.byFld);
                    Test0862.iFld = -52969;
                    i11 *= (int) Test0862.instanceCount;
                    fArr[i12 - 1] *= i11;
                    if (true) break;
                    i11 += (i12 * Test0862.instanceCount);
                    Test0862.iFld += (((i12 * i12) + Test0862.instanceCount) - Test0862.instanceCount);
                }
                Test0862.iFld -= i10;
            }
        }
        vMeth_check_sum += (b ? 1 : 0) + l + i9 + i10 + i11 + i12 + i13 + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i14=10, i15=8, i16=-9, i17=13, i18=-188, i19=7387, i20=52930;
        double d2=2.67384;
        double[] dArr =new double[N];
        short s2=-18717;

        FuzzerUtils.init(dArr, -98.77307);

        vMeth(bFld, Test0862.instanceCount);
        for (i14 = 6; i14 < 208; ++i14) {
            Test0862.iArrFld[i14 - 1] += -98;
            d2 += Test0862.instanceCount;
            for (i16 = 3; i16 < 124; i16++) {
                i15 -= s2;
                i15 += (int) Test0862.instanceCount;
                Test0862.iFld = i15;
                d2 /= (i15 | 1);
            }
            try {
                Test0862.iArrFld[i14] = (Test0862.iArrFld[i14 + 1] % Test0862.iArrFld[i14 + 1]);
                i17 = (-100 % i14);
                Test0862.iArrFld[i14 + 1] = (i15 / -745379101);
            } catch (ArithmeticException a_e) {}
            i18 = 1;
            while (++i18 < 124) {
                Test0862.iFld += (i18 * i18);
                for (i19 = 1; 1 > i19; ++i19) {
                    fFld += i14;
                    Test0862.iFld = i18;
                }
                if (true) continue;
                Test0862.iFld = i20;
                switch (((i18 % 1) * 5) + 37) {
                case 38:
                    i20 ^= i14;
                    Test0862.iArrFld[i18 - 1] -= i19;
                    Test0862.iFld = i18;
                default:
                    dArr[i18 - 1] -= i14;
                    d2 -= fFld;
                    i15 += (i18 + Test0862.instanceCount);
                }
                i17 += (int)(-40486L + (i18 * i18));
                if (false) continue;
                switch (((i18 % 2) * 5) + 1) {
                case 7:
                case 6:
                    if (true) break;
                    i15 >>= i19;
                    break;
                default:
                    Test0862.instanceCount += (i18 | i14);
                }
            }
        }

        FuzzerUtils.out.println("i14 i15 d2 = " + i14 + "," + i15 + "," + Double.doubleToLongBits(d2));
        FuzzerUtils.out.println("i16 i17 s2 = " + i16 + "," + i17 + "," + s2);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("dArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test0862.instanceCount Test0862.iFld Test0862.byFld = " + Test0862.instanceCount + "," + Test0862.iFld +
                "," + Test0862.byFld);
        FuzzerUtils.out.println("bFld fFld Test0862.iArrFld = " + (bFld ? 1 : 0) + "," + Float.floatToIntBits(fFld) + "," +
                FuzzerUtils.checkSum(Test0862.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0862 _instance = new Test0862();
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}