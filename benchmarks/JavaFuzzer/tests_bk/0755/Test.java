// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:12 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=9189387389374287834L;
    public static volatile boolean bFld=false;
    public static float fFld=81.632F;
    public static int iArrFld[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, -124);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i8, int i9) {

        int i10=9773, i11=0, i12=106, i13=-232, i14=-121;
        boolean b=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 3130070534963856692L);

        i10 = 1;
        do {
            for (i11 = 1; i11 < 5; ++i11) {
                float f=6.115F;
                Test.instanceCount -= (long)f;
                if (false) break;
                if (i8 != 0) {
                }
                i13 = 1;
                do {
                    i12 += (i13 - Test.instanceCount);
                } while (++i13 < 2);
                Test.iArrFld[i10 - 1][i10 - 1] = i13;
                b = b;
                i14 = 1;
                do {
                    lArr[i10] += i9;
                    Test.iArrFld[i14 - 1][i11] -= (int)Test.instanceCount;
                    Test.instanceCount += -7;
                } while (++i14 < 2);
                i12 = (int)Test.instanceCount;
                i9 &= (int)Test.instanceCount;
            }
        } while (++i10 < 352);
        long meth_res = i8 + i9 + i10 + i11 + i12 + i13 + (b ? 1 : 0) + i14 + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i1, int i2, int i3) {

        byte by1=-35;
        int i4=-45596, i5=-40923, i6=5, i7=11, i15=-3, i16=-173;
        float f1=1.556F;

        by1 = (byte)i1;
        for (i4 = 11; i4 < 263; i4++) {
            short s=1860;
            try {
                i1 = (-11289 % i3);
                i3 = (i4 % -1128785196);
                Test.iArrFld[i4 + 1][i4 + 1] = (1089605149 / i4);
            } catch (ArithmeticException a_e) {}
            switch (((i4 % 2) * 5) + 70) {
            case 71:
                for (i6 = i4; i6 < 6; i6++) {
                    i7 *= (--i1);
                    Test.iArrFld[i6 - 1][i4 + 1] += (((i1--) - Test.iArrFld[i6][i4]) + (iMeth(-185, i2) - i6));
                    if (Test.bFld) {
                        Test.instanceCount *= (long)f1;
                        i2 += (((i6 * i4) + i7) - i5);
                    } else if (Test.bFld) {
                        for (i15 = 1; i15 < 1; i15++) {
                            i1 += i15;
                            by1 = by1;
                            i16 = -33668;
                            f1 -= 3427183338L;
                        }
                    } else if (true) {
                        Test.iArrFld[i4 + 1][i6 + 1] -= by1;
                        vMeth1_check_sum += i1 + i2 + i3 + by1 + i4 + i5 + i6 + i7 + Float.floatToIntBits(f1) + i15 +
                            i16;
                        return;
                    } else {
                        Test.instanceCount += (i6 * i6);
                    }
                }
                break;
            case 80:
                i2 += s;
                break;
            }
        }
        vMeth1_check_sum += i1 + i2 + i3 + by1 + i4 + i5 + i6 + i7 + Float.floatToIntBits(f1) + i15 + i16;
    }

    public static void vMeth() {

        int i17=-48979;

        vMeth1(i17, i17, i17);
        i17 >>>= i17;
        i17 -= 9;
        Test.iArrFld[(-50844 >>> 1) % N] = Test.iArrFld[(i17 >>> 1) % N];
        Test.fFld *= Test.instanceCount;
        Test.instanceCount -= i17;
        vMeth_check_sum += i17;
    }

    public void mainTest(String[] strArr1) {

        byte by=49;
        int i=26211, i18=-1, i19=0, i20=-139, i21=11, i22=14621, i23=-54025;
        long lArr1[]=new long[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(lArr1, -10288L);
        FuzzerUtils.init(fArr, -84.203F);

        Test.instanceCount >>= by;
        i = 1;
        while (++i < 176) {
            vMeth();
            if (Test.bFld) break;
            i18 = 1;
            do {
                i19 = i;
                i19 >>>= i18;
                i19 = (int)Test.instanceCount;
            } while (++i18 < 143);
            i19 += i;
            Test.instanceCount = Test.instanceCount;
            i19 = i19;
            i19 -= (int)Test.instanceCount;
            for (i20 = 143; i20 > 1; i20 -= 2) {
                double d=-95.56540;
                i19 += i20;
                for (i22 = 1; i22 < 3; ++i22) {
                    i19 -= i19;
                    Test.instanceCount += (((i22 * i20) + Test.fFld) - Test.fFld);
                    lArr1[i20 - 1] += (long)Test.fFld;
                    i21 *= i21;
                    i23 = by;
                    i23 &= 0;
                    Test.iArrFld[i] = FuzzerUtils.int1array(N, (int)173);
                }
                i23 *= -36388;
                i23 = i21;
                switch (((i % 7) * 5) + 14) {
                case 28:
                    Test.instanceCount += (long)(-1.981F + (i20 * i20));
                    switch (((i23 >>> 1) % 5) + 4) {
                    case 4:
                        Test.instanceCount += (-9 + (i20 * i20));
                    case 5:
                        i21 += (-15456 + (i20 * i20));
                        i23 += i21;
                    case 6:
                        d += 2.129153;
                        break;
                    case 7:
                        Test.instanceCount = i18;
                        break;
                    case 8:
                        i21 *= by;
                        break;
                    default:
                        Test.iArrFld[i][i20 - 1] += (int)-4L;
                    }
                case 16:
                    d -= i22;
                    break;
                case 37:
                    fArr = fArr;
                    break;
                case 43:
                    Test.iArrFld[i + 1] = FuzzerUtils.int1array(N, (int)3);
                case 21:
                    i23 += (((i20 * Test.instanceCount) + i22) - by);
                    break;
                case 26:
                    if (true) break;
                case 17:
                    Test.fFld += (1.97F + (i20 * i20));
                }
            }
        }

        FuzzerUtils.out.println("by i i18 = " + by + "," + i + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 lArr1 = " + i22 + "," + i23 + "," + FuzzerUtils.checkSum(lArr1));
        FuzzerUtils.out.println("fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.fFld = " + Test.instanceCount + "," + (Test.bFld ? 1
            : 0) + "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
