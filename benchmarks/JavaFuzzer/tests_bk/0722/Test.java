// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:11 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=2620716938L;
    public static float fFld=-31.206F;
    public static byte byFld=92;
    public volatile short sFld=5960;
    public boolean bFld=true;
    public static int iArrFld[][]=new int[N][N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 11);
        FuzzerUtils.init(Test.lArrFld, -4074110915057989333L);
    }

    public static long bMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(short s1) {

        int i3=-210, i4=-5, i5=179, i6=-12898, i7=-8, i8=-104, iArr[]=new int[N], iArr1[][]=new int[N][N];
        double d=-14.37413;

        FuzzerUtils.init(iArr, -9);
        FuzzerUtils.init(iArr1, 61590);

        i3 -= (int)Test.instanceCount;
        for (i4 = 4; i4 < 140; i4++) {
            i3 -= (int)Test.instanceCount;
            i6 = 1;
            do {
                Test.fFld += i6;
                iArr[i6] += i6;
            } while (++i6 < 12);
            for (i7 = 12; i7 > i4; i7 -= 3) {
                switch ((((i4 >>> 1) % 1) * 5) + 99) {
                case 103:
                    Test.instanceCount *= i6;
                    break;
                }
                d = i7;
                Test.instanceCount -= -4456489200406871979L;
                Test.byFld <<= (byte)i5;
                Test.instanceCount >>= i6;
                Test.instanceCount >>= Test.instanceCount;
                try {
                    iArr1[i7][i7] = (70 % iArr[i7 - 1]);
                    i8 = (i3 / 120);
                    i3 = (i3 % -133);
                } catch (ArithmeticException a_e) {}
            }
        }
        vMeth1_check_sum += s1 + i3 + i4 + i5 + i6 + i7 + i8 + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr)
            + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth() {

        int i=-7298, i1=7, i2=-15761, i9=5, i10=-234, i11=227, i12=65435, i13=-6;
        float f2=-1.574F;
        short s2=29820;

        for (i = 12; i < 329; ++i) {
            for (f2 = 1; f2 < 5; f2++) {
                i1 = (int)(i1 + Math.min(-(Test.instanceCount++), ++Test.instanceCount));
            }
            vMeth1(s2);
            for (i9 = 5; i9 > i; i9--) {
                i11 = (int)Test.instanceCount;
                Test.iArrFld[i - 1][i9 - 1] = i10;
                Test.fFld -= f2;
            }
            Test.iArrFld[i + 1][i] += 12787;
            Test.instanceCount = 5;
            i2 -= (int)-103.47371;
        }
        for (i12 = 9; i12 < 158; ++i12) {
            try {
                i10 = (53617 % i10);
                Test.iArrFld[i12 + 1][i12 + 1] = (i12 % i1);
                i13 = (-248 % i9);
            } catch (ArithmeticException a_e) {}
            i2 *= (int)1.875F;
        }
        Test.instanceCount >>= i9;
        vMeth_check_sum += i + i1 + Float.floatToIntBits(f2) + i2 + s2 + i9 + i10 + i11 + i12 + i13;
    }

    public static boolean bMeth(float f, short s, float f1) {

        int i14=5, i15=-231, i16=-9897, i17=113, i18=-10, i19=213, i20=6, i21=-35936;
        boolean b1=false;

        vMeth();
        s = (short)Test.instanceCount;
        for (i14 = 1; 237 > i14; i14++) {
            for (i16 = i14; i16 < 7; ++i16) {
                i15 = i16;
                if (b1) continue;
                for (i18 = 1; i18 < 1; ++i18) {
                    try {
                        i20 = (55523 % i14);
                        i19 = (i17 / i20);
                        Test.iArrFld[i14][i14] = (-54812 / i19);
                    } catch (ArithmeticException a_e) {}
                    i15 = i21;
                    Test.instanceCount -= i19;
                    Test.iArrFld[i18 + 1][i16] = (int)Test.instanceCount;
                    i21 += (((i18 * i14) + Test.instanceCount) - Test.instanceCount);
                    if (false) {
                        Test.byFld += (byte)(i18 * i18);
                        i19 |= i16;
                    }
                }
            }
        }
        long meth_res = Float.floatToIntBits(f) + s + Float.floatToIntBits(f1) + i14 + i15 + i16 + i17 + (b1 ? 1 : 0) +
            i18 + i19 + i20 + i21;
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public void mainTest(String[] strArr1) {

        boolean b=true;
        double d1=-2.60175, d2=-2.78558, d3=2.20696, dArr[]=new double[N];
        int i22=59126, i23=107, i24=33718, i25=-1, i26=-3, i27=32, i28=-18623, i29=5, i30=-49764;
        float f3=77.185F;

        FuzzerUtils.init(dArr, 20.18640);

        b = bMeth(Test.fFld, sFld, Test.fFld);
        for (d1 = 10; d1 < 334; d1++) {
            i22 = (int)-8792771845289155273L;
            for (f3 = 1; f3 < 78; f3++) {
                Test.iArrFld[(int)(f3 - 1)][(int)(f3)] >>= i22;
                i23 += (int)f3;
                try {
                    i23 = (i22 / i23);
                    i23 = (i23 % i22);
                    i23 = (95914067 / i22);
                } catch (ArithmeticException a_e) {}
                for (i24 = 1; 2 > i24; i24++) {
                    Test.lArrFld = Test.lArrFld;
                    try {
                        i22 = (i25 % Test.iArrFld[i24 + 1][(int)(f3)]);
                        i23 = (i22 / 80);
                        Test.iArrFld[i24 - 1][(int)(f3 - 1)] = (Test.iArrFld[(int)(f3)][(int)(f3 + 1)] % i23);
                    } catch (ArithmeticException a_e) {}
                    Test.lArrFld[(int)(d1)] %= (long)-2.449F;
                    i22 += (int)Test.instanceCount;
                }
                for (i26 = 1; i26 < 2; i26++) {
                    long l=-18412L;
                    d2 += i27;
                    Test.instanceCount = l;
                    Test.byFld += (byte)(98L + (i26 * i26));
                    Test.iArrFld[i26 + 1][(int)(d1)] = i22;
                    Test.iArrFld[i26] = Test.iArrFld[i26 - 1];
                    dArr[(int)(d1 + 1)] = 54108;
                    i22 += (i26 * l);
                    Test.fFld += Test.instanceCount;
                }
                b = b;
            }
            i22 = 0;
            if (bFld) break;
            for (i28 = 3; i28 < 78; i28++) {
                if (bFld) break;
            }
            for (d3 = 78; d3 > 4; d3 -= 2) {
                i29 += (int)d3;
                i22 += (int)(((d3 * i26) + Test.instanceCount) - Test.instanceCount);
                i25 += i26;
            }
        }

        FuzzerUtils.out.println("b d1 i22 = " + (b ? 1 : 0) + "," + Double.doubleToLongBits(d1) + "," + i22);
        FuzzerUtils.out.println("f3 i23 i24 = " + Float.floatToIntBits(f3) + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("d2 i28 i29 = " + Double.doubleToLongBits(d2) + "," + i28 + "," + i29);
        FuzzerUtils.out.println("d3 i30 dArr = " + Double.doubleToLongBits(d3) + "," + i30 + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.byFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.byFld);
        FuzzerUtils.out.println("sFld bFld Test.iArrFld = " + sFld + "," + (bFld ? 1 : 0) + "," +
            FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.lArrFld = " + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
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
//DEBUG  bMeth ->  bMeth mainTest
//DEBUG  vMeth ->  vMeth bMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth bMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
