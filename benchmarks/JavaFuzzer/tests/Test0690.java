// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:10 2023
public class Test0690 {

    public static final int N = 400;

    public static long instanceCount = -7395017842325320048L;
    public static int iFld = 8;
    public static long lFld = -28712L;
    public static float fFld = 90.398F;
    public static volatile double dFld = -1.61272;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(long l1, int i2) {

        int i3 = -10;
        int i4 = -25923;
        int i5 = 91;
        int i6 = 8;
        int i7 = -40;
        int[] iArr1 = new int[N];
        long l2 = -43919L;
        long[] lArr = new long[N];
        double d = -1.4504;
        boolean b = false;
        float[] fArr = new float[N];

        FuzzerUtils.init(fArr, 2.131F);
        FuzzerUtils.init(iArr1, 0);
        FuzzerUtils.init(lArr, 19L);

        i2 = (int) l1;
        for (i3 = 9; i3 < 222; i3++) {
            fArr = fArr;
            for (l2 = 1; l2 < 8; l2++) {
                short s1 = -25706;
                try {
                    iArr1[(int) (l2 - 1)] = (-30818 % i4);
                    i2 = (-39367 % i4);
                    Test0690.iFld = (iArr1[i3] / i4);
                } catch (ArithmeticException a_e) {
                }
                i2 = s1;
                i5 += (-46817 + (l2 * l2));
                iArr1[i3] += i5;
                lArr[i3] = i4;
                switch ((i3 % 10) + 53) {
                    case 53:
                        for (i6 = 1; i6 < 2; i6++) {
                            Test0690.instanceCount += (i6 - i6);
                            d = Test0690.instanceCount;
                            iArr1[i6 - 1] = (int) l1;
                            if (i6 != 0) {
                            }
                        }
                        break;
                    case 54:
                        iArr1 = iArr1;
                        break;
                    case 55:
                        l1 -= Test0690.lFld;
                        break;
                    case 56:
                        iArr1[i3 - 1] = Test0690.iFld;
                        break;
                    case 57:
                        if (b) break;
                    case 58:
                        iArr1[(int) (l2 + 1)] -= i2;
                        break;
                    case 59:
                        if (i2 != 0) {
                        }
                        break;
                    case 60:
                        l1 %= (i2 | 1);
                        break;
                    case 61:
                        i2 += (int) (l2 ^ i7);
                        break;
                    case 62:
                        Test0690.iFld &= i4;
                        break;
                }
            }
        }
        long meth_res = l1 + i2 + i3 + i4 + l2 + i5 + i6 + i7 + Double.doubleToLongBits(d) + (b ? 1 : 0) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr1) +
                FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth1() {

        int i8 = 2;
        int i9 = 1;
        int[][] iArr2 = new int[N][N];
        short[] sArr = new short[N];

        FuzzerUtils.init(sArr, (short) 7927);
        FuzzerUtils.init(iArr2, 14);

        Test0690.iFld = iMeth(Test0690.lFld, Test0690.iFld);
        for (i8 = 3; i8 < 209; i8 += 2) {
            Test0690.iFld += i8;
            Test0690.lFld *= (long) Test0690.fFld;
            sArr[i8 + 1] = (short) Test0690.iFld;
            i9 *= i9;
            iArr2[i8][i8] = (int) Test0690.instanceCount;
            Test0690.dFld *= Test0690.instanceCount;
            i9 += i8;
        }
        Test0690.fFld = Test0690.lFld;
        Test0690.iFld += (int) Test0690.lFld;
        vMeth1_check_sum += i8 + i9 + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr2);
    }

    public static void vMeth(long l) {

        int i = -240;
        int i1 = -6789;
        int i10 = 158;
        int i11 = -7;
        int i12 = -22157;
        int[] iArr = new int[N];
        short s = 3630;
        long l3 = -7822822294891046360L;

        FuzzerUtils.init(iArr, -12626);

        for (i = 6; i < 319; i++) {
            i1 -= (~iArr[i - 1]);
            l |= (((Test0690.instanceCount + 44300) * (i - i)) + ((i + s) + (l + i)));
            i1 -= (iArr[i] = -45890);
            i1 += (i * i);
            vMeth1();
            i1 -= Test0690.iFld;
            i1 = -21041;
            for (i10 = 1; i10 < 5; i10++) {
                Test0690.instanceCount = (long) 14.53269;
                Test0690.fFld = i11;
                for (l3 = i; l3 < 2; l3++) {
                    Test0690.dFld -= i10;
                    Test0690.fFld += i12;
                }
                Test0690.iFld = i10;
            }
        }
        vMeth_check_sum += l + i + i1 + s + i10 + i11 + l3 + i12 + FuzzerUtils.checkSum(iArr);
    }

    public static void main(String[] strArr) {

        try {
            Test0690 _instance = new Test0690();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        double d1 = -49.81602;
        double[] dArr = new double[N];
        int i13 = 12;
        int i14 = 5;
        int i15 = -41725;
        int i16 = 65;
        int i17 = 19126;
        int i18 = 3661;
        int i19 = 0;
        int i20 = -148;
        int i21 = 1;
        int[] iArr3 = new int[N];
        short s2 = 17929;
        long l4 = 25070436301974287L;
        boolean b1 = false;
        float[] fArr1 = new float[N];
        float[][] fArr2 = new float[N][N];

        FuzzerUtils.init(dArr, -70.85959);
        FuzzerUtils.init(iArr3, 0);
        FuzzerUtils.init(fArr1, 0.547F);
        FuzzerUtils.init(fArr2, -1.984F);

        vMeth(Test0690.instanceCount);
        dArr[(-10 >>> 1) % N] = Test0690.iFld;
        Test0690.iFld |= Test0690.iFld;
        Test0690.lFld -= (long) Test0690.fFld;
        for (d1 = 11; d1 < 318; d1++) {
            Test0690.iFld = (int) Test0690.fFld;
            Test0690.instanceCount -= s2;
            i13 = -14;
            switch ((int) ((d1 % 8) + 20)) {
                case 20:
                    for (i14 = (int) (d1); i14 < 82; i14++) {
                        try {
                            i13 = (-210 / iArr3[(int) (d1)]);
                            Test0690.iFld = (i15 % i13);
                            i13 = (-255 % Test0690.iFld);
                        } catch (ArithmeticException a_e) {
                        }
                    }
                    fArr1[(int) (d1 + 1)] -= -171;
                    for (i16 = 82; 4 < i16; i16 -= 2) {
                        l4 = 1;
                        while (++l4 < 3) {
                            if (b1) {
                                Test0690.lFld = i17;
                                Test0690.instanceCount += i15;
                                if (true) break;
                            }
                            i15 = (int) Test0690.lFld;
                            Test0690.iFld += 5;
                            Test0690.lFld = i13;
                            iArr3[i16 + 1] += Test0690.iFld;
                        }
                        Test0690.instanceCount = i16;
                        fArr2 = fArr2;
                    }
                    Test0690.fFld += (float) (d1 - Test0690.instanceCount);
                    break;
                case 21:
                    for (i18 = 3; i18 < 82; i18++) {
                        for (i20 = 1; i20 < 2; ++i20) {
                            i17 += (i20 + Test0690.iFld);
                            Test0690.iFld -= i16;
                            dArr[(int) (d1)] = -10790;
                        }
                    }
                    break;
                case 22:
                    Test0690.lFld *= i15;
                case 23:
                    i19 -= (int) -4L;
                    break;
                case 24:
                    iArr3[(int) (d1 + 1)] = -53631;
                    break;
                case 25:
                case 26:
                    iArr3[(int) (d1)] *= i13;
                    break;
                case 27:
                    i13 &= i15;
                    break;
                default:
                    i15 += (int) ((long) d1 | i18);
            }
        }

        FuzzerUtils.out.println("d1 i13 s2 = " + Double.doubleToLongBits(d1) + "," + i13 + "," + s2);
        FuzzerUtils.out.println("i14 i15 i16 = " + i14 + "," + i15 + "," + i16);
        FuzzerUtils.out.println("i17 l4 b1 = " + i17 + "," + l4 + "," + (b1 ? 1 : 0));
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 dArr iArr3 = " + i21 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
                "," + FuzzerUtils.checkSum(iArr3));
        FuzzerUtils.out.println("fArr1 fArr2 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr2)));

        FuzzerUtils.out.println("Test0690.instanceCount Test0690.iFld Test0690.lFld = " + Test0690.instanceCount + "," + Test0690.iFld +
                "," + Test0690.lFld);
        FuzzerUtils.out.println("Test0690.fFld Test0690.dFld = " + Float.floatToIntBits(Test0690.fFld) + "," +
                Double.doubleToLongBits(Test0690.dFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
