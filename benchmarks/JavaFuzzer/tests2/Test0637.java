// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:41 2023
public class Test0637 {

    public static final int N = 400;

    public static long instanceCount=-4L;
    public static int iFld=-179;
    public static float fFld=0.439F;
    public static byte byFld=-6;
    public short sFld=7353;
    public static double dFld=0.93187;
    public static long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test0637.lArrFld, 8003734680678045833L);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i2, int i3) {

        int i4=-5, i5=-132, i6=58274;
        float f=92.508F;
        boolean b=false;
        double d=91.120295;
        short s=19321;
        byte[] byArr =new byte[N];

        FuzzerUtils.init(byArr, (byte)-89);

        i4 = 1;
        do {
            i2 -= (int) Test0637.instanceCount;
            for (i5 = i4; i5 < 6; ++i5) {
                if (b) {
                    i6 += i5;
                    i2 += (int)f;
                } else {
                    byArr[i5 - 1] ^= (byte)16217;
                    i6 += (((i5 * Test0637.instanceCount) + i2) - Test0637.instanceCount);
                }
                Test0637.iFld *= Test0637.iFld;
                i2 = i2;
            }
            d = i4;
            i6 -= Test0637.iFld;
            if (b) {
                i2 += (i4 | s);
                if (b) continue;
            } else if (b) {
                Test0637.lArrFld[i4 + 1] = s;
            }
        } while (++i4 < 290);
        long meth_res = i2 + i3 + i4 + i5 + i6 + Float.floatToIntBits(f) + (b ? 1 : 0) + Double.doubleToLongBits(d) + s
            + FuzzerUtils.checkSum(byArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth() {

        byte by1=3;
        int i7=-147, i8=-167, i9=-6175, i10=-11;
        boolean b1=true;
        double d1=0.120242;
        float f1=1.859F;
        float[] fArr =new float[N];

        FuzzerUtils.init(fArr, -85.468F);

        by1 -= (byte) Math.max((int) ((Test0637.iFld - Test0637.iFld) + (Test0637.iFld + Test0637.instanceCount)),
                (int) (iMeth1(Test0637.iFld, Test0637.iFld) * Test0637.instanceCount));
        for (i7 = 9; i7 < 245; ++i7) {
            i8 += (i7 | by1);
            b1 = b1;
            for (d1 = 1; 7 > d1; ++d1) {
                i10 = 1;
                while (++i10 < 2) {
                    switch ((int)(((d1 % 9) * 5) + 58)) {
                    case 95:
                        if (b1) {
                            f1 += i10;
                        }
                        Test0637.instanceCount = -3;
                        fArr[(int)(d1)] *= i7;
                        Test0637.lArrFld[(int) (d1 - 1)] -= i8;
                        break;
                    case 65:
                        if (b1) continue;
                        break;
                    case 59:
                        fArr[i10 + 1] -= i7;
                        i9 = -11;
                        break;
                    case 64:
                    case 77:
                        i9 -= i9;
                        break;
                    case 75:
                        f1 += Test0637.iFld;
                        break;
                    case 74:
                        i8 *= i8;
                    case 91:
                        b1 = b1;
                        break;
                    case 93:
                        Test0637.instanceCount -= i8;
                        break;
                    }
                }
            }
        }
        long meth_res = by1 + i7 + i8 + (b1 ? 1 : 0) + Double.doubleToLongBits(d1) + i9 + i10 +
            Float.floatToIntBits(f1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth(byte by) {

        int i=42671;
        int i1=4;
        int i11=64109;
        int i12=-9;
        int i13=9;
        int[] iArr =new int[N];

        FuzzerUtils.init(iArr, 11);

        for (i = 13; i < 239; i++) {
            i1 = iMeth();
            Test0637.iFld &= i1;
            iArr[i] = i1;
            Test0637.fFld += i;
            i11 = 1;
            while (++i11 < 7) {
                for (i12 = 1; i12 < 1; i12++) {
                    Test0637.instanceCount *= i1;
                    Test0637.fFld += (((i12 * by) + i13) - i11);
                    i13 = -40537;
                    Test0637.instanceCount ^= i1;
                    i1 = i12;
                    iArr = iArr;
                    Test0637.fFld *= Test0637.iFld;
                    i1 -= i11;
                }
            }
        }
        vMeth_check_sum += by + i + i1 + i11 + i12 + i13 + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i14=-230;
        int i15=166;
        int i16=12;
        int i17=-155;
        int i18=4;
        int i19=2;
        int i20=113;
        int i21=-115;
        int i22=-64428;
        int i23=-36;
        int[] iArr1 =new
                    int[N];
        boolean b2=false;
        float[] fArr1 =new float[N];

        FuzzerUtils.init(fArr1, 0.578F);
        FuzzerUtils.init(iArr1, 14764);

        vMeth(Test0637.byFld);
        Test0637.fFld = Test0637.iFld;
        Test0637.iFld = Test0637.iFld;
        fArr1[(Test0637.iFld >>> 1) % N] = -53;
        Test0637.iFld >>>= (int) -254L;
        sFld = (short) Test0637.iFld;
        Test0637.iFld = (int) Test0637.instanceCount;
        for (i14 = 7; 166 > i14; ++i14) {
            b2 = b2;
            i15 -= (int) Test0637.instanceCount;
            iArr1[i14 - 1] >>= Test0637.iFld;
            Test0637.iFld = i14;
        }
        if (b2) {
            sFld *= (short) Test0637.iFld;
            i16 = 226;
            while (--i16 > 0) {
                i17 = 1;
                do {
                    Test0637.iFld += (((i17 * Test0637.fFld) + Test0637.instanceCount) - i14);
                    i15 = 63870;
                    Test0637.instanceCount = Test0637.instanceCount;
                } while (++i17 < 111);
            }
            for (i18 = 3; i18 < 155; i18++) {
                iArr1[i18] += i15;
                if (b2) {
                    sFld |= (short) Test0637.iFld;
                    Test0637.instanceCount += (i18 | i14);
                    iArr1[i18 + 1] += i15;
                    for (i20 = 6; i20 < 165; ++i20) {
                        for (i22 = i18; 2 > i22; ++i22) {
                            Test0637.lArrFld[i22 + 1] >>= Test0637.byFld;
                            Test0637.fFld += Test0637.byFld;
                            i23 = (int) Test0637.instanceCount;
                        }
                    }
                } else {
                    Test0637.instanceCount += (i18 - Test0637.instanceCount);
                }
            }
        } else {
            iArr1[(i18 >>> 1) % N] -= (int) Test0637.dFld;
        }

        FuzzerUtils.out.println("i14 i15 b2 = " + i14 + "," + i15 + "," + (b2 ? 1 : 0));
        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 fArr1 = " + i22 + "," + i23 + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));
        FuzzerUtils.out.println("iArr1 = " + FuzzerUtils.checkSum(iArr1));

        FuzzerUtils.out.println("Test0637.instanceCount Test0637.iFld Test0637.fFld = " + Test0637.instanceCount + "," + Test0637.iFld +
                "," + Float.floatToIntBits(Test0637.fFld));
        FuzzerUtils.out.println("Test0637.byFld sFld Test0637.dFld = " + Test0637.byFld + "," + sFld + "," +
                Double.doubleToLongBits(Test0637.dFld));
        FuzzerUtils.out.println("Test0637.lArrFld = " + FuzzerUtils.checkSum(Test0637.lArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0637 _instance = new Test0637();
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
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}