// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:02 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-14L;
    public static volatile boolean bFld=true;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[][]=new long[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, 153);
        FuzzerUtils.init(Test.lArrFld, -151L);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long iMeth2_check_sum = 0;

    public static int iMeth2(int i5, float f, int i6) {

        int i7=26, i8=48857, i9=64, i10=26519, i11=14, i12=234, i13=-23189;
        float f1=-56.423F;
        boolean b1=false;

        for (i7 = 3; i7 < 194; i7++) {
            for (i9 = 8; i9 > 1; i9 -= 2) {
                Test.instanceCount = Test.instanceCount;
                f1 = 1;
                while (++f1 < 3) {
                    i6 *= i5;
                    i5 = i10;
                    Test.iArrFld[i9 - 1] -= (int)Test.instanceCount;
                    i10 += (int)((long)f1 ^ (long)f1);
                }
                if (b1) break;
            }
            i8 = i9;
            i11 = 1;
            do {
                Test.instanceCount = i7;
                for (i12 = 1; i12 > 1; --i12) {
                    Test.iArrFld[i7] >>= -68;
                    Test.instanceCount = i9;
                }
            } while (++i11 < 8);
        }
        long meth_res = i5 + Float.floatToIntBits(f) + i6 + i7 + i8 + i9 + i10 + Float.floatToIntBits(f1) + (b1 ? 1 :
            0) + i11 + i12 + i13;
        iMeth2_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth1(long l1, double d) {

        int i=-18570, i1=18773, i2=53036, i3=-75, i4=5;
        boolean b=false;
        float f2=-2.663F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 254L);

        for (i = 7; i < 355; ++i) {
            for (i2 = 5; i2 > 1; --i2) {
                i4 = 1;
                while (++i4 < 2) {
                    b = (b = (Test.iArrFld[i2 - 1] != iMeth2(i3, f2, i1)));
                    i1 *= (int)f2;
                    lArr[i4] >>= i2;
                    switch ((((i1 >>> 1) % 9) * 5) + 50) {
                    case 75:
                        Test.instanceCount += (long)28.124205;
                        b = b;
                        break;
                    case 83:
                        i3 += (i4 * i3);
                        b = b;
                        switch ((i4 % 2) + 35) {
                        case 35:
                            i1 += i3;
                            i1 = (int)f2;
                            i1 &= i3;
                            break;
                        case 36:
                            lArr[i2 + 1] -= i3;
                            break;
                        default:
                            f2 += (i4 - i2);
                        }
                        break;
                    case 92:
                        f2 = (float)d;
                    case 52:
                        i3 -= i3;
                        break;
                    case 88:
                        i1 >>>= i;
                        break;
                    case 93:
                        Test.iArrFld[i4] -= i2;
                        break;
                    case 84:
                        i3 -= i2;
                        break;
                    case 82:
                        i3 += (i4 | i4);
                        break;
                    case 95:
                        i3 = i4;
                    }
                }
            }
        }
        long meth_res = l1 + Double.doubleToLongBits(d) + i + i1 + i2 + i3 + i4 + (b ? 1 : 0) +
            Float.floatToIntBits(f2) + FuzzerUtils.checkSum(lArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(long l) {

        double d1=-90.43258;
        int i14=-19196, i15=50344, i16=7, i17=5, i18=11, i19=-5292, i20=186, iArr[][]=new int[N][N];
        byte by=-14;
        float f3=109.125F;

        FuzzerUtils.init(iArr, 19);

        iMeth1(l, d1);
        iArr = iArr;
        i14 -= -23;
        for (i15 = 21; i15 < 370; ++i15) {
            by *= (byte)-37484;
            i16 -= i15;
            for (i17 = 1; i17 < 5; ++i17) {
                l ^= -12;
                i18 *= i17;
                for (i19 = 1; i19 < 2; ++i19) {
                    Test.iArrFld[i17] ^= i18;
                    f3 *= i18;
                    l += by;
                    Test.instanceCount += -2095259713L;
                    Test.instanceCount *= i18;
                }
            }
        }
        long meth_res = l + Double.doubleToLongBits(d1) + i14 + i15 + i16 + by + i17 + i18 + i19 + i20 +
            Float.floatToIntBits(f3) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f4=1.183F, fArr[]=new float[N];
        int i21=-2, i22=41259, i23=7, i24=-10, i25=102;
        double d2=2.130284;
        short s=-2020;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(fArr, -95.377F);

        if (Test.bFld) {
            iMeth(4474L);
            f4 /= (i21 | 1);
        } else {
            i22 = 209;
            while ((i22 -= 2) > 0) {
                i23 = 239;
                do {
                    Test.instanceCount += (-49948 + (i23 * i23));
                    d2 = -3.31F;
                    Test.lArrFld[i22][i22 + 1] -= i21;
                    Test.instanceCount >>= s;
                    Test.instanceCount = i21;
                    Test.instanceCount += (i23 * Test.instanceCount);
                } while (--i23 > 0);
                Test.instanceCount = i22;
                i21 *= i23;
                for (i24 = i22; i24 < 239; ++i24) {
                    try {
                        i25 = (-32901 % i22);
                        i25 = (-428560300 % i25);
                        Test.iArrFld[i24] = (i22 % 43311);
                    } catch (ArithmeticException a_e) {}
                    if (false) continue;
                    f4 = i23;
                    bArr[i22 - 1] = Test.bFld;
                }
                try {
                    i25 = (-24644 / Test.iArrFld[i22 + 1]);
                    i25 = (-26886 / i22);
                    i21 = (i23 / i23);
                } catch (ArithmeticException a_e) {}
                i21 *= -57610;
                i21 = i24;
                fArr = fArr;
                i25 = i21;
            }
        }
        i21 &= i22;
        i25 >>= 30;
        i25 = (int)d2;
        f4 *= -2774;
        i25 <<= i24;
        i25 += i22;
        i25 *= i21;

        FuzzerUtils.out.println("f4 i21 i22 = " + Float.floatToIntBits(f4) + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 d2 s = " + i23 + "," + Double.doubleToLongBits(d2) + "," + s);
        FuzzerUtils.out.println("i24 i25 bArr = " + i24 + "," + i25 + "," + FuzzerUtils.checkSum(bArr));
        FuzzerUtils.out.println("fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.iArrFld = " + Test.instanceCount + "," + (Test.bFld
            ? 1 : 0) + "," + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.lArrFld = " + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("iMeth2_check_sum: " + iMeth2_check_sum);
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
//DEBUG  iMeth2 ->  iMeth2 iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
