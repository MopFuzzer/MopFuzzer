// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:31 2023
public class Test0410 {

    public static final int N = 400;

    public static long instanceCount=7L;
    public double dFld=1.34721;
    public static float fFld=1.983F;
    public static double dFld1=11.62519;
    public static boolean bFld=false;
    public byte byFld=-50;
    public boolean bFld1=false;
    public static volatile short sFld=12076;
    public static float[] fArrFld =new float[N];
    public static long[] lArrFld =new long[N];
    public int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0410.fArrFld, 32.960F);
        FuzzerUtils.init(Test0410.lArrFld, 35108L);
    }

    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i13=-28, i14=0, i15=-27861, i16=-12;
        byte by=-21;
        double[] dArr =new double[N];

        FuzzerUtils.init(dArr, 69.99959);

        for (i13 = 5; i13 < 146; ++i13) {
            i14 %= 125;
            Test0410.fFld = by;
            for (i15 = 1; i15 < 11; ++i15) {
                Test0410.bFld = Test0410.bFld;
                dArr[i15] = i15;
                i14 = (int)10.335F;
            }
        }
        long meth_res = i13 + i14 + by + i15 + i16 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static float fMeth(int i6, long l, int i7) {

        boolean b=true;
        long l1=1896520484L, l2=28L;
        int i8=-9;
        int i9=212;
        int i10=13091;
        int i11=-243;
        int i12=250;
        int[] iArr =new int[N];

        FuzzerUtils.init(iArr, -17871);

        b = b;
        try {
            for (l1 = 7; l1 < 122; ++l1) {
                i8 += (int) (((l1 * i6) + Test0410.instanceCount) - Test0410.fFld);
                i9 = 1;
                do {
                    Test0410.dFld1 -= (i8++);
                } while (++i9 < 14);
                for (i10 = 1; 14 > i10; ++i10) {
                    for (l2 = 1; 2 > l2; ++l2) {
                        i7 += i11;
                        Test0410.lArrFld[(int) (l2)] %= (Math.max(i9 ^ i10, (int) (Test0410.instanceCount - i6)) +
                                ((Test0410.instanceCount--) + (i8 - 9626)));
                        i12 = (iArr[(int)(l2 + 1)]--);
                        if (b) continue;
                        l += (l2 * l2);
                        l += iMeth();
                    }
                    i7 = i10;
                }
            }
        }
        catch (ArithmeticException exc1) {
            Test0410.fArrFld[(i8 >>> 1) % N] = i11;
        }
        finally {
            Test0410.instanceCount *= i6;
        }
        long meth_res = i6 + l + i7 + (b ? 1 : 0) + l1 + i8 + i9 + i10 + i11 + l2 + i12 + FuzzerUtils.checkSum(iArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth(int i3) {

        int i4=10, i5=0, i17=304;
        long l3=683572512L;
        long[] lArr =new long[N];
        short[] sArr =new short[N];

        FuzzerUtils.init(lArr, 132L);
        FuzzerUtils.init(sArr, (short)-4695);

        for (i4 = 276; 16 < i4; --i4) {
            if (Test0410.bFld) {
                i5 += (int)(97.172F + (i4 * i4));
                switch ((i4 % 5) + 104) {
                case 104:
                    i3 += (i4 * i4);
                    Test0410.fFld += i4;
                    break;
                case 105:
                    lArr[i4 + 1] = (long) (--Test0410.fFld);
                    Test0410.fArrFld[i4 - 1] -= Integer.reverseBytes(++i3);
                    i3 -= (int) fMeth(i5, Test0410.instanceCount, i4);
                    Test0410.bFld = Test0410.bFld;
                    break;
                case 106:
                    i17 = 1;
                    while (++i17 < 6) {
                        Test0410.fFld -= Test0410.fFld;
                        i5 = (int) Test0410.dFld1;
                        i5 = i4;
                    }
                    l3 *= 239;
                    break;
                case 107:
                    sArr[i4] = (short)i4;
                    break;
                case 108:
                    i5 = i3;
                    break;
                }
            } else {
                Test0410.dFld1 += Test0410.instanceCount;
            }
        }
        vMeth_check_sum += i3 + i4 + i5 + i17 + l3 + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(sArr);
    }

    public void mainTest(String[] strArr1) {

        int i=14, i1=-18413, i2=4, i18=-2, i19=41487, i20=1, i21=8;

        i ^= (int) (Test0410.instanceCount--);
        for (i1 = 329; i1 > 10; --i1) {
            Test0410.instanceCount = (long) ((--i2) * (dFld--));
            vMeth(i1);
            switch ((i1 % 1) + 47) {
            case 47:
                i18 = 1;
                do {
                    i2 = -21135;
                } while (++i18 < 79);
                break;
            default:
                i2 += (i1 - i18);
                iArrFld = iArrFld;
                for (i19 = 2; i19 < 79; ++i19) {
                    i21 = 1;
                    do {
                        i2 += (int) Test0410.instanceCount;
                        Test0410.lArrFld[i1 + 1] += i1;
                        i += (int)(-1259065607L + (i21 * i21));
                        Test0410.instanceCount += i21;
                        i20 = (int)-85.194F;
                        switch (((i1 % 10) * 5) + 96) {
                        case 127:
                            i2 >>= i19;
                            break;
                        case 99:
                            i2 -= (int) Test0410.fFld;
                            break;
                        case 114:
                            i = i20;
                            switch ((i19 % 1) + 11) {
                            case 11:
                                i += (i21 * i21);
                                switch ((i1 % 2) + 34) {
                                case 34:
                                    byFld -= (byte)i;
                                    i20 ^= (int) Test0410.instanceCount;
                                    break;
                                case 35:
                                    Test0410.fFld = Test0410.instanceCount;
                                    if (bFld1) {
                                        Test0410.fFld += (((i21 * i) + Test0410.instanceCount) - Test0410.fFld);
                                        iArrFld[i21] = i18;
                                        try {
                                            iArrFld[i19 - 1] = (iArrFld[i19 - 1] % -797526237);
                                            i20 = (i20 / 1492520411);
                                            i20 = (149 / i2);
                                        } catch (ArithmeticException a_e) {}
                                    } else {
                                        Test0410.sFld += (short) Test0410.fFld;
                                    }
                                    break;
                                }
                                break;
                            }
                            break;
                        case 124:
                            i2 += (i21 ^ i21);
                            break;
                        case 107:
                            iArrFld[i21 + 1] += (int) Test0410.instanceCount;
                            break;
                        case 123:
                            Test0410.lArrFld[i21] *= (long) Test0410.fFld;
                        case 101:
                            i2 += i;
                            break;
                        case 136:
                            Test0410.instanceCount += (((i21 * i) + i21) - i);
                        case 146:
                            i2 = i1;
                            break;
                        case 139:
                            i2 = i;
                            break;
                        }
                    } while (++i21 < 2);
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 = " + i21);

        FuzzerUtils.out.println("Test0410.instanceCount dFld Test0410.fFld = " + Test0410.instanceCount + "," +
                Double.doubleToLongBits(dFld) + "," + Float.floatToIntBits(Test0410.fFld));
        FuzzerUtils.out.println("Test0410.dFld1 Test0410.bFld byFld = " + Double.doubleToLongBits(Test0410.dFld1) + "," +
                (Test0410.bFld ? 1 : 0) + "," + byFld);
        FuzzerUtils.out.println("bFld1 Test0410.sFld Test0410.fArrFld = " + (bFld1 ? 1 : 0) + "," + Test0410.sFld + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0410.fArrFld)));
        FuzzerUtils.out.println("Test0410.lArrFld iArrFld = " + FuzzerUtils.checkSum(Test0410.lArrFld) + "," +
            FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0410 _instance = new Test0410();
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
//DEBUG  fMeth ->  fMeth vMeth mainTest
//DEBUG  iMeth ->  iMeth fMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
