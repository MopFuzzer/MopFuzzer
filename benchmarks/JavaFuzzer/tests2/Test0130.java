// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:18 2023
public class Test0130 {

    public static final int N = 400;

    public static long instanceCount=57951L;
    public static double dFld=2.45589;
    public static boolean bFld=true;
    public static int[][] iArrFld =new int[N][N];
    public static boolean[] bArrFld =new boolean[N];

    static {
        FuzzerUtils.init(Test0130.iArrFld, 3);
        FuzzerUtils.init(Test0130.bArrFld, true);
    }

    public static long vMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i4=2;
        int i5=-3;
        int i6=-59085;
        int i7=85;
        int[] iArr =new int[N];
        double d=0.12901;
        boolean b=false;
        short[] sArr =new short[N];
        long[] lArr =new long[N];

        FuzzerUtils.init(sArr, (short)12386);
        FuzzerUtils.init(lArr, -11L);
        FuzzerUtils.init(iArr, 59726);

        sArr[(47240 >>> 1) % N] = (short)i4;
        i4 = (int) Test0130.instanceCount;
        d = 1;
        do {
            for (i5 = 1; 10 > i5; i5++) {
                byte by=-87;
                Test0130.instanceCount >>>= i4;
                by = (byte)i5;
                i7 = 1;
                do {
                    switch ((int)((d % 3) + 10)) {
                    case 10:
                        i6 = i6;
                        Test0130.instanceCount = i7;
                        switch (((i7 % 3) * 5) + 19) {
                        case 20:
                            Test0130.instanceCount = i6;
                            Test0130.instanceCount = i4;
                            lArr[i7] -= (long)d;
                            break;
                        case 30:
                            i6 = (int)-8L;
                            break;
                        case 31:
                            iArr[(int)(d - 1)] <<= 0;
                        }
                        break;
                    case 11:
                        if (b) break;
                        break;
                    case 12:
                    }
                } while (++i7 < 2);
            }
        } while (++d < 159);
        vMeth1_check_sum += i4 + Double.doubleToLongBits(d) + i5 + i6 + i7 + (b ? 1 : 0) + FuzzerUtils.checkSum(sArr) +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
    }

    public static double dMeth(long l1, int i1, float f) {

        int i2=197, i3=-8, i8=-63483;
        short s=-30575;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(lArr1, -6L);

        for (i2 = 9; i2 < 272; ++i2) {
            vMeth1();
            lArr1[i2] = i1;
        }
        i3 = i2;
        Test0130.iArrFld[(-5 >>> 1) % N][(i1 >>> 1) % N] += i1;
        l1 += Test0130.instanceCount;
        i8 = 1;
        while ((i8 += 2) < 310) {
            if (i8 != 0) {
            }
            if (true) continue;
            switch ((i8 % 1) + 65) {
            case 65:
                i3 *= (int)4655681703774735846L;
                i3 -= i1;
                if (i1 != 0) {
                }
                break;
            default:
                s -= (short)f;
                f += (-21816 + (i8 * i8));
            }
        }
        long meth_res = l1 + i1 + Float.floatToIntBits(f) + i2 + i3 + i8 + s + FuzzerUtils.checkSum(lArr1);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth(long l, int i) {

        float f1=-1.292F;
        int i9=-3, i10=-185, i11=121, i12=-211, i13=13, i14=-13;

        i = (int) (-((-5 * Math.abs(i)) - dMeth(Test0130.instanceCount, i, f1)));
        for (i9 = 11; i9 < 282; i9++) {
            for (i11 = 1; i11 < 6; i11++) {
                Test0130.iArrFld[i11 + 1][i11 - 1] = i9;
                i12 -= (int) Test0130.dFld;
                if (Test0130.bFld) continue;
                i += i11;
                i10 *= i10;
                for (i13 = i11; i13 < 2; ++i13) {
                    i += i14;
                    try {
                        i14 = (-224 % i12);
                        i12 = (i9 % -15904);
                        Test0130.iArrFld[i9 - 1][i9] = (Test0130.iArrFld[i11][i9] / i11);
                    } catch (ArithmeticException a_e) {}
                    if (Test0130.bFld) continue;
                    f1 -= i9;
                    if (true) continue;
                    Test0130.instanceCount = 3744788668L;
                }
            }
        }
        vMeth_check_sum += l + i + Float.floatToIntBits(f1) + i9 + i10 + i11 + i12 + i13 + i14;
    }

    public void mainTest(String[] strArr1) {

        int i15=-187;
        int i17=11;
        int i18=176;
        int i19=705;
        int i20=80;
        int[] iArr1 =new int[N];
        short s1=21473;

        FuzzerUtils.init(iArr1, 36341);

        vMeth(Test0130.instanceCount, i15);
        for (int i16 : iArr1) {
            i16 *= i15;
            for (i17 = 3; 63 > i17; i17++) {
                for (i19 = 1; i19 < 2; i19++) {
                    float f2=92.406F;
                    try {
                        i20 = (-160 / i16);
                        i15 = (174 / iArr1[i19 - 1]);
                        i18 = (i17 % i15);
                    } catch (ArithmeticException a_e) {}
                    if (true) break;
                    i20 = i15;
                    if (Test0130.bFld) {
                        Test0130.instanceCount *= 28;
                        Test0130.instanceCount += (((i19 * i17) + i17) - i19);
                    } else if (false) {
                        i18 += (i19 + Test0130.instanceCount);
                        s1 -= (short)i18;
                        f2 *= i16;
                        f2 -= i19;
                    } else {
                        switch (((i17 % 2) * 5) + 110) {
                        case 117:
                            switch ((((i16 >>> 1) % 3) * 5) + 25) {
                            case 35:
                                iArr1[i17 + 1] *= 181;
                                f2 += (i19 + i19);
                                break;
                            case 31:
                                f2 *= i18;
                                s1 += (short) (i19 - Test0130.instanceCount);
                                Test0130.instanceCount += i15;
                                i18 -= (int) Test0130.instanceCount;
                                break;
                            case 34:
                                i18 *= (int) Test0130.instanceCount;
                                i20 += (i19 | i20);
                            }
                            i15 += (i19 ^ i20);
                            i15 += (int)4156021337119637209L;
                            break;
                        case 118:
                            Test0130.iArrFld[i17 - 1][i17] += (int) Test0130.instanceCount;
                            break;
                        }
                        Test0130.iArrFld[i17] = Test0130.iArrFld[i17 - 1];
                    }
                    Test0130.bArrFld[i19] = true;
                }
            }
        }

        FuzzerUtils.out.println("i15 i17 i18 = " + i15 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 i20 s1 = " + i19 + "," + i20 + "," + s1);
        FuzzerUtils.out.println("iArr1 = " + FuzzerUtils.checkSum(iArr1));

        FuzzerUtils.out.println("Test0130.instanceCount Test0130.dFld Test0130.bFld = " + Test0130.instanceCount + "," +
                Double.doubleToLongBits(Test0130.dFld) + "," + (Test0130.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0130.iArrFld Test0130.bArrFld = " + FuzzerUtils.checkSum(Test0130.iArrFld) + "," +
                FuzzerUtils.checkSum(Test0130.bArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0130 _instance = new Test0130();
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
//DEBUG  vMeth1 ->  vMeth1 dMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
