// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:13 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=4167300243419766724L;
    public static int iFld=77;
    public static double dFld=-21.30092;
    public static short sFld=19454;
    public float fFld=2.930F;
    public int iArrFld[][]=new int[N][N];

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;

    public static double dMeth() {

        int i3=5119, i4=43, i5=-27584, i6=21205;
        float f=-2.0F;
        boolean b=false, bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, true);

        for (i3 = 11; i3 < 202; ++i3) {
            f += (((i3 * i3) + i4) - i3);
            bArr[i3] = b;
            i5 = 1;
            while (++i5 < 8) {
                Test.instanceCount |= 51;
                i6 = 1;
                do {
                    Test.instanceCount += i6;
                    Test.instanceCount = Test.instanceCount;
                    Test.instanceCount = 7847385886041950576L;
                } while (++i6 < 1);
                i4 *= -15;
            }
            if (b) {
                i4 += 14;
                i4 *= 31972;
            } else {
                f = i4;
                Test.instanceCount += (i3 - Test.instanceCount);
            }
        }
        long meth_res = i3 + i4 + Float.floatToIntBits(f) + (b ? 1 : 0) + i5 + i6 + FuzzerUtils.checkSum(bArr);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth(double d) {

        int i1=-236, i2=3, i7=9, i8=-34738, iArr[]=new int[N];
        float f1=-1.737F;
        byte by=-81;

        FuzzerUtils.init(iArr, 33143);

        i1 = 1;
        do {
            i2 = 1;
            while (++i2 < 4) {
                dMeth();
                Test.iFld += i2;
                f1 -= Test.instanceCount;
                Test.iFld += (i2 * by);
                Test.instanceCount = Test.instanceCount;
                iArr[i1] *= (int)f1;
                for (i7 = i2; i7 < 1; ++i7) {
                    Test.iFld += (i7 * Test.iFld);
                    f1 += i7;
                    i8 += (i7 * i7);
                    Test.iFld *= i1;
                }
                i8 += Test.iFld;
            }
            Test.instanceCount -= Test.instanceCount;
        } while (++i1 < 389);
        vMeth_check_sum += Double.doubleToLongBits(d) + i1 + i2 + Float.floatToIntBits(f1) + by + i7 + i8 +
            FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(int i) {

        int i9=-14, i10=-58595, i11=-4, i12=14;
        float f2=-50.564F, fArr[]=new float[N];
        boolean b1=true;

        FuzzerUtils.init(fArr, 45.117F);

        if (b1) {
            vMeth(117.125996);
            i -= Test.iFld;
        } else if (true) {
            i += 3;
            try {
                for (i9 = 8; i9 < 256; i9++) {
                    fArr[(i >>> 1) % N] += Test.instanceCount;
                }
                Test.iFld = -96;
                Test.iFld = i9;
                Test.instanceCount *= (long)Test.dFld;
                f2 += i;
            }
            catch (NegativeArraySizeException exc2) {
                for (i11 = 14; 374 > i11; i11++) {
                    Test.iFld >>>= i11;
                    i10 += (i11 - f2);
                    Test.sFld *= (short)Test.iFld;
                }
            }
        }
        long meth_res = i + i9 + i10 + Float.floatToIntBits(f2) + i11 + i12 + (b1 ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i13=66, i14=42, i16=-3, i17=10, i18=22987, i19=12987, iArr1[]=new int[N];
        boolean b2=true;
        float f3=2.133F;
        long l1=-56748L, lArr[]=new long[N];
        byte by1=-70, byArr[]=new byte[N];

        FuzzerUtils.init(lArr, 2032883721L);
        FuzzerUtils.init(byArr, (byte)7);
        FuzzerUtils.init(iArr1, -228);

        iMeth(Test.iFld);
        for (i13 = 8; 288 > i13; ++i13) {
            iArrFld[i13][i13 - 1] <<= i14;
            i14 += i13;
            Test.iFld += i13;
            fFld += i13;
            byArr[i13] = (byte)i14;
            Test.iFld -= i14;
            i14 >>= i13;
            if (b2) continue;
            Test.instanceCount += (i13 * i13);
            Test.iFld = Test.iFld;
        }
        for (int i15 : iArr1) {
            Test.iFld += (int)fFld;
            iArrFld = iArrFld;
            switch ((((39607 >>> 1) % 4) * 5) + 16) {
            case 36:
                if (b2) {
                    try {
                        iArrFld[(Test.iFld >>> 1) % N][(i15 >>> 1) % N] = (-22940 / i15);
                        Test.iFld = (209 / i15);
                        i17 = (i14 / iArrFld[(i16 >>> 1) % N][(i17 >>> 1) % N]);
                    } catch (ArithmeticException a_e) {}
                    Test.dFld *= fFld;
                    lArr[(i17 >>> 1) % N] += (long)fFld;
                    for (f3 = 1; f3 < 63; ++f3) {
                        i17 += (int)14623L;
                        iArr1[(int)(f3)] = Test.sFld;
                        for (l1 = 1; l1 < 2; ++l1) {
                            iArr1[(int)(f3 + 1)] = by1;
                            fFld -= i14;
                            i17 -= (int)l1;
                            try {
                                i16 = (i16 % i13);
                                i17 = (-1192832858 % Test.iFld);
                                i19 = (116 % iArrFld[(int)(f3)][(int)(l1)]);
                            } catch (ArithmeticException a_e) {}
                            iArrFld[(int)(f3)][(int)(f3 + 1)] -= Test.sFld;
                            iArrFld[(int)(l1 + 1)][(int)(f3 + 1)] = Test.iFld;
                        }
                    }
                }
                break;
            case 27:
                i18 -= i17;
                break;
            case 19:
                i19 = Test.iFld;
                break;
            case 22:
                i17 -= i16;
                break;
            default:
                b2 = b2;
            }
        }

        FuzzerUtils.out.println("i13 i14 b2 = " + i13 + "," + i14 + "," + (b2 ? 1 : 0));
        FuzzerUtils.out.println("i16 i17 f3 = " + i16 + "," + i17 + "," + Float.floatToIntBits(f3));
        FuzzerUtils.out.println("i18 l1 i19 = " + i18 + "," + l1 + "," + i19);
        FuzzerUtils.out.println("by1 lArr byArr = " + by1 + "," + FuzzerUtils.checkSum(lArr) + "," +
            FuzzerUtils.checkSum(byArr));
        FuzzerUtils.out.println("iArr1 = " + FuzzerUtils.checkSum(iArr1));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.dFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.sFld fFld iArrFld = " + Test.sFld + "," + Float.floatToIntBits(fFld) + "," +
            FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  dMeth ->  dMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
