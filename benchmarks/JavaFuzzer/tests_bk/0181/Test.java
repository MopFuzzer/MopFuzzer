// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:57 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-4L;
    public double dFld=79.42267;
    public volatile double dArrFld[]=new double[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 2);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i7) {

        int i8=47414, i9=-5, i10=226, i11=188, i12=10, i13=-2525, i14=6276, i15=14;
        float f1=2.761F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -1114939458L);

        for (i8 = 15; i8 < 350; ++i8) {
            for (i10 = 5; 1 < i10; i10 -= 2) {
                Test.instanceCount += (((i10 * Test.instanceCount) + f1) - i10);
                lArr[i8] = Test.instanceCount;
                Test.instanceCount += (i10 + Test.instanceCount);
                i11 = 35723;
            }
            for (i12 = i8; i12 < 5; i12++) {
                f1 += (i12 - Test.instanceCount);
                i11 |= (int)Test.instanceCount;
                for (i14 = 1; 1 > i14; i14++) {
                    i11 -= (int)14L;
                    Test.instanceCount += i14;
                    i9 = i13;
                    i11 *= i10;
                    i7 = (int)Test.instanceCount;
                }
            }
        }
        vMeth_check_sum += i7 + i8 + i9 + i10 + i11 + Float.floatToIntBits(f1) + i12 + i13 + i14 + i15 +
            FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth1(int i4) {

        int i5=45, i6=-129, i17=-7, i18=13;
        short s1=-6697;
        boolean b=true;
        float f2=2.444F;
        double d=4.7606;

        for (i5 = 11; i5 < 225; ++i5) {
            vMeth(i6);
            i6 -= s1;
            i6 <<= i6;
        }
        b = b;
        i6 ^= (int)Test.instanceCount;
        i6 += i5;
        f2 = -28298;
        i6 += i5;
        Test.iArrFld[(i6 >>> 1) % N] -= (int)d;
        for (int i16 : Test.iArrFld) {
            for (i17 = 1; i17 < 4; i17++) {
                i4 = s1;
                b = b;
                f2 += i17;
            }
        }
        long meth_res = i4 + i5 + i6 + s1 + (b ? 1 : 0) + Float.floatToIntBits(f2) + Double.doubleToLongBits(d) + i17 +
            i18;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth(int i, long l, int i1) {

        int i2=0, i3=-228;
        short s=26787;
        float f=60.606F, fArr[]=new float[N];

        FuzzerUtils.init(fArr, -30.542F);

        dFld -= i1;
        i2 = 1;
        while (++i2 < 279) {
            s += (short)(-((i1 - i) * l));
        }
        i *= i1;
        i3 = 1;
        do {
            i1 ^= (int)(~((i - l) + (-13L + (103 * (++i)))));
            if (i != 0) {
            }
            i1 = ((++s) + ((i--) + (-(i1--))));
            s >>>= (short)(((i + f) + (-dFld)) / (((long)((++dFld) - (-(i++)))) | 1));
            dArrFld[i3 + 1] = i2;
            i -= (iMeth1(i2) << i2);
            fArr[i3 - 1] *= i;
            Test.iArrFld[i3] -= i;
            f *= i;
        } while (++i3 < 298);
        Test.iArrFld = Test.iArrFld;
        long meth_res = i + l + i1 + i2 + s + i3 + Float.floatToIntBits(f) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i19=-43719, i20=-211, i21=26, i22=-64495, i23=10, i24=-245, i25=56, i26=7, i27=23879, i28=56302, i29=242,
            i30=104;
        boolean b1=false;
        float f4=-1.181F, f5=2.132F, fArr1[]=new float[N];
        byte by=-101;

        FuzzerUtils.init(fArr1, -1.975F);

        switch ((((iMeth(i19, 3519799553L, i19) >>> 1) % 2) * 5) + 13) {
        case 19:
            i19 -= (int)dFld;
            switch (((-6 >>> 1) % 6) + 16) {
            case 16:
                i19 >>>= i19;
                i19 = 5;
                for (i20 = 5; 151 > i20; ++i20) {
                    for (i22 = 5; i22 < 172; ++i22) {
                        Test.instanceCount = Test.instanceCount;
                        Test.instanceCount += (12 + (i22 * i22));
                        b1 = b1;
                    }
                    i19 |= i19;
                }
                for (f4 = 2; f4 < 220; f4++) {
                    for (i25 = 4; i25 < 115; ++i25) {
                        i21 -= i26;
                        by = (byte)dFld;
                        switch ((i25 % 8) + 59) {
                        case 59:
                            Test.iArrFld[(int)(f4)] = i24;
                            for (i27 = 1; i27 < 2; i27++) {
                                if (b1) continue;
                                i19 += (186 + (i27 * i27));
                                b1 = b1;
                                fArr1[i25 + 1] = (float)dFld;
                                i28 += (int)(8451196352952580977L + (i27 * i27));
                            }
                            i26 += (int)2.50808;
                            i24 *= (int)dFld;
                            break;
                        case 60:
                            i24 = 14;
                            for (i29 = 2; 1 < i29; i29--) {
                                i21 >>= i25;
                                i19 = (int)f4;
                                i23 = i19;
                            }
                        case 61:
                            if (b1) continue;
                            break;
                        case 62:
                            i23 += (int)dFld;
                            break;
                        case 63:
                            i24 += (int)Test.instanceCount;
                            break;
                        case 64:
                            f5 = f4;
                        case 65:
                            i24 -= (int)-9L;
                        case 66:
                            Test.instanceCount = i26;
                            break;
                        default:
                            i23 *= (int)Test.instanceCount;
                        }
                    }
                }
                break;
            case 17:
                i19 -= (int)191188307L;
                break;
            case 18:
                i23 += by;
                break;
            case 19:
                Test.iArrFld[(i30 >>> 1) % N] -= -1;
                break;
            case 20:
                i19 >>= i28;
                break;
            case 21:
                i21 /= (int)((long)(f4) | 1);
                break;
            default:
                i30 = i19;
            }
            break;
        case 22:
            i28 = i27;
            break;
        }

        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 b1 = " + i22 + "," + i23 + "," + (b1 ? 1 : 0));
        FuzzerUtils.out.println("f4 i24 i25 = " + Float.floatToIntBits(f4) + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 by i27 = " + i26 + "," + by + "," + i27);
        FuzzerUtils.out.println("i28 i29 i30 = " + i28 + "," + i29 + "," + i30);
        FuzzerUtils.out.println("f5 fArr1 = " + Float.floatToIntBits(f5) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));

        FuzzerUtils.out.println("Test.instanceCount dFld dArrFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(dFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
