// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:10 2023
public class Test0677 {

    public static final int N = 400;

    public static long instanceCount = -194L;
    public static int iFld = 31;
    public static short[][] sArrFld = new short[N][N];
    public static int[] iArrFld = new int[N];
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(Test0677.sArrFld, (short) -9938);
        FuzzerUtils.init(Test0677.iArrFld, 22545);
    }

    public short sFld = 5310;
    public float fFld = -8.502F;

    public static void vMeth1(boolean b, int i5, boolean b1) {

        int i6 = 12, i7 = 40347, i8 = 61, i9 = -54821, i10 = -156;
        byte by = 121;
        long l = -7L;
        long[] lArr = new long[N];
        short s2 = -4463;
        float f2 = -102.776F;
        float[] fArr = new float[N];
        double[][] dArr = new double[N][N];

        FuzzerUtils.init(lArr, -26238L);
        FuzzerUtils.init(dArr, 1.18775);
        FuzzerUtils.init(fArr, -39.274F);

        i5 = (int) Test0677.instanceCount;
        for (i6 = 7; i6 < 367; i6 += 2) {
            lArr[i6 - 1] |= Test0677.iFld;
            switch ((i6 % 10) + 59) {
                case 59:
                    by += by;
                    for (i8 = 1; i8 < 9; ++i8) {
                        Test0677.iFld = i5;
                        for (l = 1; l < 2; ++l) {
                            s2 ^= (short) i10;
                        }
                        i7 -= s2;
                    }
                    dArr[i6][i6] -= -121;
                    break;
                case 60:
                    if (true) {
                        i9 -= i5;
                    }
                    Test0677.instanceCount += (long) f2;
                    i9 += (((i6 * i6) + i7) - l);
                    break;
                case 61:
                    Test0677.instanceCount = s2;
                    break;
                case 62:
                    i5 -= by;
                    break;
                case 63:
                    f2 += i9;
                case 64:
                    i7 = i9;
                    break;
                case 65:
                    Test0677.sArrFld[i6 + 1][i6 + 1] |= (short) i9;
                    break;
                case 66:
                    fArr[i6 + 1] = i7;
                    break;
                case 67:
                    i5 <<= i7;
                    break;
                case 68:
                    f2 += l;
                default:
                    Test0677.iFld -= (int) f2;
            }
        }
        vMeth1_check_sum += (b ? 1 : 0) + i5 + (b1 ? 1 : 0) + i6 + i7 + by + i8 + i9 + l + i10 + s2 +
                Float.floatToIntBits(f2) + FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr))
                + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth() {

        short s1 = -24307;
        float f1 = -62.941F;
        boolean b2 = false;
        int i11 = -11458, i12 = 1817, i13 = 155;
        double d = 0.113217;
        double[] dArr1 = new double[N];

        FuzzerUtils.init(dArr1, 0.115616);

        Test0677.iFld += (int) (((Test0677.instanceCount * s1) * (f1++)) * ((Test0677.iFld - Test0677.iFld) + (-Test0677.iFld)));
        Test0677.iFld <<= (int) (((-(++Test0677.instanceCount)) + (Test0677.iFld * Test0677.instanceCount)) * (Test0677.iFld--));
        vMeth1(b2, Test0677.iFld, b2);
        for (i11 = 9; i11 < 198; i11++) {
            d += i12;
            i12 = 58;
            i13 = 1;
            while (++i13 < 8) {
                dArr1[i11] += i13;
                i12 = (int) f1;
                Test0677.iFld = (int) Test0677.instanceCount;
                Test0677.iFld += (int) (43816L + (i13 * i13));
                d -= i12;
            }
            Test0677.instanceCount = (long) f1;
            Test0677.iArrFld[i11 + 1] = i11;
            s1 = (short) -3;
        }
        vMeth_check_sum += s1 + Float.floatToIntBits(f1) + (b2 ? 1 : 0) + i11 + i12 + Double.doubleToLongBits(d) + i13
                + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1));
    }

    public static int iMeth(short s) {

        int i = -169, i1 = 144, i2 = -85, i3 = -173, i4 = -251, i14 = -11, i15 = -55;
        float f = 0.207F;
        float[] fArr1 = new float[N];
        boolean b3 = false;
        double[] dArr2 = new double[N];

        FuzzerUtils.init(dArr2, 58.7978);
        FuzzerUtils.init(fArr1, 78.36F);

        if (b3) {
            for (i = 7; i < 169; i++) {
                i2 = 1;
                do {
                    for (i3 = i; i3 < 1; ++i3) {
                        f = Test0677.instanceCount;
                        vMeth();
                        switch (((4 >>> 1) % 1) + 11) {
                            case 11:
                                i1 = i4;
                                Test0677.iFld += i3;
                                break;
                        }
                        Test0677.instanceCount += (-32 + (i3 * i3));
                    }
                    i1 <<= 117;
                    for (i14 = i; i14 < 1; i14++) {
                        double d1 = 82.44793;
                        d1 -= Test0677.instanceCount;
                        dArr2[i14 + 1] = i2;
                        Test0677.instanceCount = i4;
                    }
                } while (++i2 < 10);
            }
        } else if (b3) {
            Test0677.iArrFld[(6 >>> 1) % N] = (int) 11L;
        } else {
            i15 ^= 40501;
        }
        long meth_res = s + i + i1 + i2 + i3 + i4 + Float.floatToIntBits(f) + i14 + i15 + (b3 ? 1 : 0) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr2)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0677 _instance = new Test0677();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i16 = -5, i17 = 64575, i18 = 207, i19 = -10, i20 = -231, i21 = -35310, i22 = 218;
        boolean b4 = true;
        byte by1 = -52;
        double d2 = -2.22611;
        double[] dArr3 = new double[N];
        long[] lArr1 = new long[N];

        FuzzerUtils.init(lArr1, -5L);
        FuzzerUtils.init(dArr3, -2.81943);

        switch ((((Test0677.iFld * Test0677.iFld) >>> 1) % 10) + 53) {
            case 53:
            case 54:
                Test0677.iFld = iMeth(sFld);
                fFld += 7454;
                break;
            case 55:
                Test0677.instanceCount -= 50918;
                break;
            case 56:
                try {
                    for (i16 = 22; 376 > i16; ++i16) {
                        lArr1[i16 - 1] <<= Test0677.instanceCount;
                        for (i18 = 71; i18 > 2; i18--) {
                            for (i20 = 1 - 400; 2 > i20; ++i20) {
                                i21 += (i20 - i21);
                                switch (((i20 % 5) * 5) + 107) {
                                    case 132:
                                        Test0677.iFld += (((i20 * sFld) + Test0677.instanceCount) - fFld);
                                        if (b4) {
                                            Test0677.iFld = i16;
                                            i19 &= i18;
                                            i17 = 19815;
                                        } else {
                                            i19 = -84;
                                        }
                                        Test0677.iFld += (((i20 * i19) + fFld) - i20);
                                        break;
                                    case 117:
                                        Test0677.iFld = (int) Test0677.instanceCount;
                                        Test0677.instanceCount = 64101;
                                        if (b4) continue;
                                    case 122:
                                        i21 += (i20 * by1);
                                        Test0677.iFld += i20;
                                        i17 &= Test0677.iFld;
                                        break;
                                    case 115:
                                        Test0677.iArrFld[i18] += i20;
                                        i21 = i20;
                                        break;
                                    case 126:
                                    default:
                                        i22 += (((i20 * fFld) + i16) - by1);
                                }
                                b4 = b4;
                                Test0677.iArrFld[i20 - 1] *= by1;
                                d2 = Test0677.instanceCount;
                            }
                        }
                    }
                } catch (ArrayIndexOutOfBoundsException exc2) {
                    i22 = (int) -150946616L;
                }
                break;
            case 57:
                i19 <<= i20;
                break;
            case 58:
                i21 = i21;
                break;
            case 59:
                i22 = (int) Test0677.instanceCount;
            case 60:
                lArr1[(i16 >>> 1) % N] = sFld;
            case 61:
                dArr3[(-7 >>> 1) % N] += fFld;
                break;
            case 62:
                Test0677.iArrFld[(i20 >>> 1) % N] -= i21;
        }

        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("b4 by1 i22 = " + (b4 ? 1 : 0) + "," + by1 + "," + i22);
        FuzzerUtils.out.println("d2 lArr1 dArr3 = " + Double.doubleToLongBits(d2) + "," + FuzzerUtils.checkSum(lArr1) +
                "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr3)));

        FuzzerUtils.out.println("Test0677.instanceCount Test0677.iFld sFld = " + Test0677.instanceCount + "," + Test0677.iFld + "," +
                sFld);
        FuzzerUtils.out.println("fFld Test0677.sArrFld Test0677.iArrFld = " + Float.floatToIntBits(fFld) + "," +
                FuzzerUtils.checkSum(Test0677.sArrFld) + "," + FuzzerUtils.checkSum(Test0677.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}