// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:23 2023
public class Test0248 {

    public static final int N = 400;

    public static long instanceCount=7L;
    public static short sFld=-32382;
    public static byte byFld=-31;
    public static double dFld=-104.25381;
    public volatile float fFld=-1.739F;
    public static boolean bFld=false;

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i2, int i3, int i4) {

        int i5=-47;
        int i6=-12288;
        int i7=-58019;
        int[] iArr =new int[N];
        byte by=84;
        short s=-28414;
        float f1=1.715F;
        long[] lArr =new long[N];

        FuzzerUtils.init(iArr, 29558);
        FuzzerUtils.init(lArr, -675473496205372354L);

        for (i5 = 186; i5 > 10; i5 -= 2) {
            switch (((i5 >>> 1) % 2) + 77) {
            case 77:
                by += (byte)(((i5 * i2) + by) - s);
                break;
            case 78:
                i6 *= i6;
                i7 = 1;
                do {
                    i3 += i7;
                    iArr[i5] -= s;
                    iArr[i7 - 1] *= -150;
                    lArr[i7 - 1] = (long)f1;
                    Test0248.instanceCount -= (long) f1;
                    Test0248.instanceCount += i5;
                    Test0248.instanceCount = i7;
                    Test0248.instanceCount *= i5;
                    i3 = i5;
                    try {
                        i6 = (i2 / -46);
                        i2 = (-47414 / i7);
                        iArr[i5 + 1] = (171 % iArr[i5 - 1]);
                    } catch (ArithmeticException a_e) {}
                } while (++i7 < 18);
                break;
            default:
                try {
                    i6 = (iArr[i5] / i4);
                    i4 = (i5 % i7);
                    i2 = (i3 / i3);
                } catch (ArithmeticException a_e) {}
            }
        }
        vMeth1_check_sum += i2 + i3 + i4 + i5 + i6 + by + s + i7 + Float.floatToIntBits(f1) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(int i, boolean b, int i1) {

        float f=1.449F;
        int i8=-18366, i9=26, i10=-6, i11=166, i12=14, i13=-31910;
        double d=126.48575;
        short[] sArr =new short[N];

        FuzzerUtils.init(sArr, (short)29404);

        i = (int)((-i) * ((--i) - (++f)));
        vMeth1(i1, i, i);
        f += f;
        for (i8 = 4; i8 < 151; ++i8) {
            Test0248.instanceCount *= i8;
            i1 = i9;
        }
        for (i10 = 20; 338 > i10; i10++) {
            d -= d;
            if (b) {
                for (i12 = 1; i12 < 5; i12++) {
                    b = true;
                    Test0248.sFld = (short) i11;
                    i = i9;
                    i1 += (((i12 * i1) + Test0248.instanceCount) - i8);
                    f = i9;
                }
            } else if (true) {
                sArr[i10 + 1] *= (short)f;
            }
        }
        vMeth_check_sum += i + (b ? 1 : 0) + i1 + Float.floatToIntBits(f) + i8 + i9 + i10 + i11 +
            Double.doubleToLongBits(d) + i12 + i13 + FuzzerUtils.checkSum(sArr);
    }

    public static int iMeth() {

        int i14=-8;
        int i15=-7;
        int i16=2;
        int i17=-25195;
        int i18=-1;
        int[] iArr1 =new int[N];
        boolean b1=true;
        float f2=-1.153F, f3=2.439F;

        FuzzerUtils.init(iArr1, -58387);

        vMeth(i14, b1, i14);
        f2 *= i14;
        for (i15 = 14; i15 < 252; ++i15) {
            if (b1) {
                i14 += (int) Test0248.instanceCount;
                Test0248.instanceCount += (((i15 * Test0248.instanceCount) + Test0248.instanceCount) - Test0248.sFld);
                i17 = 1;
                while (++i17 < 7) {
                    Test0248.byFld = (byte) Test0248.dFld;
                    for (f3 = 1; f3 > 1; --f3) {
                        Test0248.sFld += Test0248.byFld;
                        switch ((i15 % 4) + 26) {
                        case 26:
                            i18 += (int)(f3 * f3);
                            Test0248.dFld -= f2;
                            try {
                                i18 = (16862 % iArr1[(i18 >>> 1) % N]);
                                iArr1[(int)(f3)] = (i16 % 22133);
                                i14 = (iArr1[i17 + 1] / -140372393);
                            } catch (ArithmeticException a_e) {}
                            i14 *= i18;
                            break;
                        case 27:
                            i16 += (int)(f3 * f3);
                            break;
                        case 28:
                            Test0248.instanceCount = i17;
                        case 29:
                            iArr1[i17 - 1] *= (int) Test0248.instanceCount;
                            break;
                        }
                    }
                }
            } else if (b1) {
                i16 += (i15 ^ i15);
            } else {
                i18 = i16;
            }
        }
        long meth_res = i14 + (b1 ? 1 : 0) + Float.floatToIntBits(f2) + i15 + i16 + i17 + Float.floatToIntBits(f3) +
            i18 + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i19=14190;
        int i21=3238;
        int i22=50051;
        int i23=0;
        int i24=9;
        int i25=143;
        int[] iArr2 =new int[N];
        double[] dArr =new double[N];
        long[] lArr1 =new long[N];

        FuzzerUtils.init(dArr, 2.82899);
        FuzzerUtils.init(iArr2, -5);
        FuzzerUtils.init(lArr1, 1347752181L);

        iMeth();
        i19 = i19;
        dArr[(i19 >>> 1) % N] /= (i19 | 1);
        try {
            i19 = i19;
            dArr[(i19 >>> 1) % N] = fFld;
            i19 *= (int)-7L;
            i19 >>= Test0248.sFld;
            for (int i20 : iArr2) {
                Test0248.bFld = Test0248.bFld;
                iArr2[(i20 >>> 1) % N] += (int) Test0248.instanceCount;
                switch ((((i20 >>> 1) % 3) * 5) + 31) {
                case 44:
                    i19 >>>= (int)4254578547641058543L;
                    iArr2[(-5 >>> 1) % N] <<= (int) Test0248.instanceCount;
                    for (i21 = 3 - 400; i21 < 63; ++i21) {
                        fFld = i21;
                        switch ((((i20 >>> 1) % 8) * 5) + 109) {
                        case 133:
                            for (i23 = 1 + 400; i23 > 1; --i23) {
                                i22 += (int)(-1.631F + (i23 * i23));
                                fFld += i24;
                                i24 >>= (int) Test0248.instanceCount;
                                i22 += i23;
                                i20 += i23;
                                if (Test0248.bFld) {
                                    i19 = i21;
                                    i24 >>= i24;
                                    fFld -= i24;
                                }
                                try {
                                    iArr2[i23 - 1] = (i22 % -18382);
                                    i24 = (i20 / 11139);
                                    i20 = (iArr2[i21] / -1632861805);
                                } catch (ArithmeticException a_e) {}
                                fFld += 1338117482711165362L;
                                Test0248.instanceCount = i25;
                            }
                            break;
                        case 139:
                            i20 += (int)-22365L;
                        case 143:
                            fFld += (i21 - i22);
                            break;
                        case 122:
                            Test0248.instanceCount -= i24;
                            break;
                        case 148:
                            fFld += i21;
                            break;
                        case 125:
                            if (Test0248.bFld) continue;
                            break;
                        case 129:
                            fFld += (88.592F + (i21 * i21));
                            break;
                        case 116:
                            iArr2 = iArr2;
                        }
                    }
                    break;
                case 36:
                    lArr1[(i21 >>> 1) % N] = i23;
                    break;
                case 34:
                    iArr2[(i21 >>> 1) % N] -= i22;
                    break;
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException exc1) {
            fFld *= i23;
        }

        FuzzerUtils.out.println("i19 i21 i22 = " + i19 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("dArr iArr2 lArr1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + "," +
            FuzzerUtils.checkSum(iArr2) + "," + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test0248.instanceCount Test0248.sFld Test0248.byFld = " + Test0248.instanceCount + "," + Test0248.sFld +
                "," + Test0248.byFld);
        FuzzerUtils.out.println("Test0248.dFld fFld Test0248.bFld = " + Double.doubleToLongBits(Test0248.dFld) + "," +
                Float.floatToIntBits(fFld) + "," + (Test0248.bFld ? 1 : 0));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0248 _instance = new Test0248();
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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
