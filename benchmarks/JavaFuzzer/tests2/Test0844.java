// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:52 2023
public class Test0844 {

    public static final int N = 400;

    public static long instanceCount=-1873L;
    public static float fFld=0.757F;
    public static boolean bFld=false;
    public static short sFld=-7626;
    public static long[][] lArrFld =new long[N][N];
    public byte[] byArrFld =new byte[N];

    static {
        FuzzerUtils.init(Test0844.lArrFld, 6203667039328738067L);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(double d1, long l1) {

        double d2=-117.7406;
        int i2=-117;
        int i3=-54196;
        int i4=-12;
        int[] iArr =new int[N];
        boolean b=false;
        short s1=-23217;
        float[] fArr =new float[N];

        FuzzerUtils.init(fArr, 2.695F);
        FuzzerUtils.init(iArr, 25515);

        for (d2 = 8; 143 > d2; ++d2) {
            for (i3 = 12; i3 > 1; --i3) {
                i4 = -31284;
                Test0844.fFld += -13;
                if (b) break;
                i4 <<= (int)3031011247L;
                Test0844.fFld *= i3;
                Test0844.instanceCount += 28;
                fArr = FuzzerUtils.float1array(N, (float)-101.398F);
                Test0844.fFld += i4;
                l1 += (((i3 * i2) + i4) - s1);
                try {
                    iArr[i3] = (i3 % -15865);
                    i2 = (i2 / -859791510);
                    i4 = (-47753 % i3);
                } catch (ArithmeticException a_e) {}
            }
            i4 = i3;
            i4 = (int)l1;
            i2 = i4;
        }
        vMeth_check_sum += Double.doubleToLongBits(d1) + l1 + Double.doubleToLongBits(d2) + i2 + i3 + i4 + (b ? 1 : 0)
            + s1 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth1(double d, long l) {

        int i1=131, i5=-151, i6=-350, i7=7513, i8=-32238, i9=-5;
        short s=8432;
        byte[] byArr =new byte[N];

        FuzzerUtils.init(byArr, (byte)59);

        i1 += (int)((i1 / (s | 1)) - ((d - -12) + i1));
        byArr[(i1 >>> 1) % N] *= (byte)(i1++);
        vMeth(d, l);
        for (i5 = 6; i5 < 198; ++i5) {
            Test0844.fFld += ((long) i5 | (long) i5);
            i7 = 1;
            while (++i7 < 8) {
                Test0844.lArrFld = Test0844.lArrFld;
                for (i8 = 1; i8 > 1; i8--) {
                    if (Test0844.bFld) continue;
                    i6 += (i8 * i8);
                    i1 -= s;
                    switch (((i5 >>> 1) % 3) + 58) {
                    case 58:
                        i9 = (int)l;
                        i6 %= (int)(i6 | 1);
                        i9 += (((i8 * i8) + Test0844.fFld) - Test0844.instanceCount);
                        break;
                    case 59:
                    case 60:
                        l = -4;
                        break;
                    }
                }
            }
        }
        long meth_res = Double.doubleToLongBits(d) + l + i1 + s + i5 + i6 + i7 + i8 + i9 + FuzzerUtils.checkSum(byArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i) {

        double d3=87.97965;
        int i10=3121;
        int i11=-8178;
        int i12=-176;
        int i13=5;
        int[] iArr1 =new int[N];
        byte by=116;
        long l2=-241L;

        FuzzerUtils.init(iArr1, -36606);

        if (Test0844.bFld) {
            i -= ((-iMeth1(d3, Test0844.instanceCount)) * i);
            for (i10 = 186; i10 > 10; i10--) {
                try {
                    i = (4992 % iArr1[i10 - 1]);
                    i11 = (1524119592 % i11);
                    i = (i11 / 1876778449);
                } catch (ArithmeticException a_e) {}
                switch (((6 >>> 1) % 8) + 15) {
                case 15:
                    iArr1[i10 - 1] = by;
                    Test0844.instanceCount *= Test0844.instanceCount;
                    i += (int)d3;
                    if (Test0844.bFld) {
                        l2 = 9;
                        do {
                            Test0844.instanceCount = -34L;
                            if (true) {
                                for (i12 = 1; i12 < 1; i12++) {
                                    Test0844.fFld += (i12 * i12);
                                    i11 = i12;
                                }
                            }
                        } while (--l2 > 0);
                    } else {
                        if (Test0844.bFld) continue;
                    }
                    break;
                case 16:
                    i11 -= (int)50.852F;
                    break;
                case 17:
                    Test0844.instanceCount = 0;
                case 18:
                case 19:
                case 20:
                    i += (i10 * i10);
                    break;
                case 21:
                    Test0844.instanceCount = Test0844.instanceCount;
                case 22:
                    Test0844.instanceCount = Test0844.instanceCount;
                    break;
                default:
                    i13 = i12;
                }
            }
        } else {
            Test0844.fFld -= i10;
        }
        long meth_res = i + Double.doubleToLongBits(d3) + i10 + i11 + by + l2 + i12 + i13 + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i14=11;
        int i15=-155;
        int i16=-12;
        int i17=-46;
        int i18=85;
        int i19=26617;
        int i20=21699;
        int i21=-19234;
        int i22=12;
        int i23=2;
        int[] iArr2 =new
                    int[N];
        int[][] iArr3 =new int[N][N];
        double d4=-37.129958;

        FuzzerUtils.init(iArr2, 36);
        FuzzerUtils.init(iArr3, -7);

        Test0844.instanceCount -= iMeth(i14);
        for (i15 = 6; i15 < 140; ++i15) {
            for (i17 = 187; i17 > 2; i17 -= 3) {
                i18 = (int) Test0844.fFld;
            }
            i16 += i17;
            Test0844.bFld = Test0844.bFld;
        }
        for (i19 = 14; i19 < 259; ++i19) {
            i21 = 1;
            while (++i21 < 103) {
                switch ((i21 % 8) + 96) {
                case 96:
                    Test0844.fFld += i21;
                    break;
                case 97:
                    for (i22 = 1; i22 < 1; ++i22) {
                        i18 += (i22 * i22);
                        iArr2[i19 - 1] -= (int) Test0844.fFld;
                        i14 >>= i17;
                        i23 += (((i22 * Test0844.sFld) + i17) - Test0844.sFld);
                        i20 -= (int) Test0844.fFld;
                        d4 -= i14;
                        switch (((i21 % 1) * 5) + 81) {
                        case 84:
                            if (Test0844.bFld) break;
                            i18 -= Test0844.sFld;
                            i23 = (int)d4;
                            Test0844.fFld -= i23;
                        default:
                            i20 -= (int) Test0844.fFld;
                        }
                        Test0844.instanceCount += i22;
                        Test0844.instanceCount ^= Test0844.instanceCount;
                        iArr3 = iArr3;
                    }
                    byArrFld[i21] += (byte)i17;
                    Test0844.fFld += Test0844.fFld;
                    break;
                case 98:
                    Test0844.sFld >>= (short) Test0844.instanceCount;
                    Test0844.lArrFld[i19 + 1][i21] += Test0844.instanceCount;
                    break;
                case 99:
                    i14 -= 14;
                    break;
                case 100:
                    Test0844.instanceCount = -11;
                case 101:
                    iArr3[i21 + 1][i19] >>= Test0844.sFld;
                    break;
                case 102:
                    Test0844.instanceCount += (i21 - Test0844.instanceCount);
                    break;
                case 103:
                    try {
                        iArr3[i19][i21 - 1] = (60060 / i14);
                        i20 = (i17 / 45);
                        iArr3[i21][(24937 >>> 1) % N] = (-22948 / i18);
                    } catch (ArithmeticException a_e) {}
                    break;
                }
            }
        }

        FuzzerUtils.out.println("i14 i15 i16 = " + i14 + "," + i15 + "," + i16);
        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 d4 iArr2 = " + i23 + "," + Double.doubleToLongBits(d4) + "," +
            FuzzerUtils.checkSum(iArr2));
        FuzzerUtils.out.println("iArr3 = " + FuzzerUtils.checkSum(iArr3));

        FuzzerUtils.out.println("Test0844.instanceCount Test0844.fFld Test0844.bFld = " + Test0844.instanceCount + "," +
                Float.floatToIntBits(Test0844.fFld) + "," + (Test0844.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0844.sFld Test0844.lArrFld byArrFld = " + Test0844.sFld + "," +
                FuzzerUtils.checkSum(Test0844.lArrFld) + "," + FuzzerUtils.checkSum(byArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0844 _instance = new Test0844();
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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
