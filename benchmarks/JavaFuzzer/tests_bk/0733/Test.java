// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:11 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-14L;
    public double dFld=-67.2477;
    public static int iFld=47106;
    public static byte byFld=82;
    public static boolean bFld=true;

    public static long dMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(float f2) {

        int i7=-175, i8=-149, i9=2, i10=-13, i11=140, i12=-21286, iArr1[]=new int[N];
        short s=2033;

        FuzzerUtils.init(iArr1, -45075);

        i7 = 1;
        do {
            Test.iFld = 2;
            Test.iFld <<= 240;
            s <<= (short)-83;
            for (i8 = 1; i8 < 7; ++i8) {
                i9 = i7;
                for (i10 = 1; i10 < 2; i10++) {
                    iArr1[i8 - 1] >>>= i11;
                    i9 += (i10 ^ Test.byFld);
                    switch (((Test.iFld >>> 1) % 2) + 17) {
                    case 17:
                        Test.instanceCount += (((i10 * i11) + i9) - Test.instanceCount);
                        if (i11 != 0) {
                            vMeth1_check_sum += Float.floatToIntBits(f2) + i7 + s + i8 + i9 + i10 + i11 + i12 +
                                FuzzerUtils.checkSum(iArr1);
                            return;
                        }
                        Test.instanceCount = i8;
                        i11 = (int)Test.instanceCount;
                        break;
                    case 18:
                        i11 = i12;
                    }
                }
            }
        } while (++i7 < 250);
        vMeth1_check_sum += Float.floatToIntBits(f2) + i7 + s + i8 + i9 + i10 + i11 + i12 + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(float f1, long l, long l1) {

        int i13=41798, i14=-5, i15=-55985, i16=-11;
        boolean b=true;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -2.54206);

        vMeth1(f1);
        dArr = dArr;
        for (i13 = 2; i13 < 288; i13 += 2) {
            l1 *= 0L;
            b = b;
            i15 = 1;
            do {
                Test.iFld -= Test.byFld;
                i16 = 1;
                do {
                    Test.iFld <<= Test.iFld;
                    Test.iFld = (int)l1;
                    i14 += (int)l;
                    switch ((i13 % 2) + 43) {
                    case 43:
                        l = i16;
                        break;
                    case 44:
                        i14 = i13;
                        Test.instanceCount += Test.iFld;
                        break;
                    }
                } while ((i16 += 3) < 1);
            } while (++i15 < 11);
        }
        vMeth_check_sum += Float.floatToIntBits(f1) + l + l1 + i13 + i14 + (b ? 1 : 0) + i15 + i16 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static double dMeth() {

        int i3=-128, i4=-61, i5=0, i6=-7, i17=236, i18=-208, i19=-9, i20=13;
        float f=70.294F, fArr[][]=new float[N][N];
        double d=0.70650;
        short s1=-22714;
        boolean b1=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(fArr, 1.36F);
        FuzzerUtils.init(lArr, 129L);

        for (i3 = 7; i3 < 283; i3++) {
            for (i5 = 6; i5 > 1; i5--) {
                fArr[i3 - 1] = (fArr[i5 - 1] = (fArr[i3 - 1] = fArr[i5 - 1]));
                i6 += (((i5 * f) + Test.instanceCount) - i6);
                vMeth(f, 5326654142196372576L, Test.instanceCount);
                lArr[i3 - 1] <<= i5;
                for (i17 = 1; 2 > i17; i17++) {
                    d = i17;
                }
                lArr[i5 + 1] -= s1;
                Test.instanceCount = i17;
                Test.byFld *= (byte)i17;
                for (i19 = i5; 2 > i19; ++i19) {
                    if (b1) {
                        f += (((i19 * Test.instanceCount) + Test.instanceCount) - i20);
                    } else {
                        f = 11;
                    }
                }
            }
        }
        long meth_res = i3 + i4 + i5 + i6 + Float.floatToIntBits(f) + i17 + i18 + Double.doubleToLongBits(d) + s1 + i19
            + i20 + (b1 ? 1 : 0) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=14, i1=-7, i2=178, i22=-42112, i23=-32251, i24=17978, i25=11443, i26=59319, iArr[]=new int[N];
        float f3=1.719F, fArr1[]=new float[N];
        long lArr1[][]=new long[N][N];

        FuzzerUtils.init(iArr, 47481);
        FuzzerUtils.init(fArr1, 108.168F);
        FuzzerUtils.init(lArr1, 2777647259L);

        i -= (iArr[(-222 >>> 1) % N]--);
        dFld += (iArr[(i >>> 1) % N]--);
        Test.instanceCount += (iArr[(i >>> 1) % N] + (i += iArr[(i >>> 1) % N]));
        for (i1 = 5; i1 < 387; ++i1) {
            i = (int)(dMeth() - i2);
        }
        if (Test.bFld) {
            for (int i21 : iArr) {
                Test.iFld = i2;
                Test.iFld += 7018;
                Test.iFld -= (int)Test.instanceCount;
                for (i22 = 2; i22 < 63; ++i22) {
                    for (i24 = 1; i24 < 2; i24 += 2) {
                        i25 |= i21;
                        Test.iFld *= i25;
                        fArr1[i22] += 9;
                        Test.iFld += (1 + (i24 * i24));
                    }
                    i21 -= (int)4088650566L;
                    Test.instanceCount >>= i;
                    try {
                        iArr[i22] = (i22 / iArr[i22 + 1]);
                        i21 = (Test.iFld % -29801);
                        i = (Test.iFld % 21652);
                    } catch (ArithmeticException a_e) {}
                    i >>= Test.byFld;
                    for (f3 = 1; f3 < 2; ++f3) {
                        Test.instanceCount *= (long)f3;
                        if (Test.bFld) break;
                        Test.byFld += (byte)-59L;
                        Test.instanceCount -= i2;
                        switch ((((i21 >>> 1) % 2) * 5) + 12) {
                        case 19:
                            lArr1[i22][i22 - 1] >>= i24;
                            Test.instanceCount *= (long)dFld;
                            i21 = i26;
                            break;
                        case 15:
                            lArr1[(int)(f3 - 1)][i22] -= Test.byFld;
                            break;
                        }
                    }
                }
            }
        } else {
            Test.instanceCount += (long)dFld;
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 f3 i26 = " + i25 + "," + Float.floatToIntBits(f3) + "," + i26);
        FuzzerUtils.out.println("iArr fArr1 lArr1 = " + FuzzerUtils.checkSum(iArr) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + "," + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test.instanceCount dFld Test.iFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(dFld) + "," + Test.iFld);
        FuzzerUtils.out.println("Test.byFld Test.bFld = " + Test.byFld + "," + (Test.bFld ? 1 : 0));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
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
//DEBUG  dMeth ->  dMeth mainTest
//DEBUG  vMeth ->  vMeth dMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth dMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
