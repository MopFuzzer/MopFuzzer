// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:04 2023
public class Test0464 {

    public static final int N = 400;

    public static long instanceCount = 51936L;
    public static float fFld = -2.129F;
    public static int[] iArrFld = new int[N];
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    static {
        FuzzerUtils.init(Test0464.iArrFld, 13);
    }

    public volatile long[] lArrFld = new long[N];
    public float[] fArrFld = new float[N];

    public static void vMeth2(boolean b1, int i2, int i3) {

        float f1 = 89.266F;
        int i4 = -136, i5 = 39, i6 = -4, i7 = 3, i8 = 243, i9 = -111;
        short s = -15816;
        long l1 = -549663517L;
        long[] lArr = new long[N];
        double d = 0.87196;

        FuzzerUtils.init(lArr, 16814L);

        f1 = i2;
        Test0464.iArrFld[(i3 >>> 1) % N] |= i3;
        for (i4 = 2; i4 < 159; ++i4) {
            f1 += (i4 + Test0464.instanceCount);
            s = (short) 16633;
            for (l1 = 1; l1 < 10; l1++) {
                for (i7 = 2; 1 < i7; i7 -= 2) {
                    d += i2;
                    switch (((i8 >>> 1) % 10) + 15) {
                        case 15:
                            lArr[i4 - 1] += i6;
                            f1 += i6;
                            break;
                        case 16:
                            i3 = i6;
                            break;
                        case 17:
                            i8 += i7;
                            i8 += (int) -2.983F;
                            break;
                        case 18:
                            i6 += (int) 2827926124L;
                            break;
                        case 19:
                            i5 -= (int) l1;
                            break;
                        case 20:
                            i5 *= i7;
                            break;
                        case 21:
                            i6 >>= i8;
                        case 22:
                            if (b1) break;
                            break;
                        case 23:
                            Test0464.instanceCount += (i7 | i9);
                        case 24:
                            i3 += (int) l1;
                        default:
                            i3 -= (int) 111.786F;
                    }
                }
            }
        }
        vMeth2_check_sum += (b1 ? 1 : 0) + i2 + i3 + Float.floatToIntBits(f1) + i4 + i5 + s + l1 + i6 + i7 + i8 +
                Double.doubleToLongBits(d) + i9 + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1() {

        int i1 = -28;
        int i11 = -34974;
        int i12 = -223;
        int[] iArr = new int[N];
        boolean b = false;

        FuzzerUtils.init(iArr, 78);

        iArr = (iArr = iArr);
        try {
            Test0464.instanceCount -= Math.min(-142, Math.abs(i1));
        } catch (ArithmeticException exc4) {
            i1 *= (int) (Test0464.instanceCount++);
            b = (!b);
        } catch (ArrayIndexOutOfBoundsException exc5) {
            if (b) {
                vMeth2(b, i1, i1);
                for (int i10 : Test0464.iArrFld) {
                    Test0464.instanceCount = i1;
                    i1 -= i10;
                    Test0464.instanceCount = -7;
                }
            }
            for (i11 = 17; i11 < 336; i11++) {
                Test0464.instanceCount &= i12;
                i1 += i11;
                if (i12 != 0) {
                    vMeth1_check_sum += i1 + (b ? 1 : 0) + i11 + i12 + FuzzerUtils.checkSum(iArr);
                    return;
                }
            }
        }
        vMeth1_check_sum += i1 + (b ? 1 : 0) + i11 + i12 + FuzzerUtils.checkSum(iArr);
    }

    public static void main(String[] strArr) {

        try {
            Test0464 _instance = new Test0464();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void vMeth(long l) {

        int i13 = -5, i14 = 64709, i15 = -153, i16 = 26518, i17 = 9;
        double d1 = -67.32663;
        short s1 = 26858;

        vMeth1();
        fArrFld[(i13 >>> 1) % N] *= (float) d1;
        try {
            switch ((((i13 >>> 1) % 1) * 5) + 101) {
                case 105:
                    Test0464.instanceCount *= -9;
                default:
                    for (i14 = 3; i14 < 249; ++i14) {
                        Test0464.fFld = i15;
                        for (i16 = 7; 1 < i16; --i16) {
                            i15 *= s1;
                        }
                        i13 -= (int) l;
                        try {
                            i15 = (-20 % i14);
                            i13 = (Test0464.iArrFld[i14 - 1] / -31396);
                            Test0464.iArrFld[i14 + 1] = (Test0464.iArrFld[i14 - 1] % -217);
                        } catch (ArithmeticException a_e) {
                        }
                        lArrFld[i14 - 1] <<= 4;
                        i17 += (((i14 * i14) + i17) - i17);
                        i15 *= (int) l;
                    }
            }
            Test0464.iArrFld[(i15 >>> 1) % N] = -14;
        } catch (UserDefinedExceptionTest0464 exc6) {
            Test0464.iArrFld[(i15 >>> 1) % N] *= i13;
        } catch (NegativeArraySizeException exc7) {
            d1 += d1;
        }
        vMeth_check_sum += l + i13 + Double.doubleToLongBits(d1) + i14 + i15 + i16 + i17 + s1;
    }

    public void mainTest(String[] strArr1) {

        float f = 1.1009F;
        int i = -59018, i18 = -15876, i19 = 65436, i20 = -22094, i21 = 13, i22 = 37849;
        short s2 = -8607;
        boolean b2 = true;

        f = ((-8219888080229732671L - i) << lArrFld[(i >>> 1) % N]);
        vMeth(Test0464.instanceCount);
        lArrFld[(i >>> 1) % N] *= Test0464.instanceCount;
        i = i;
        for (i18 = 346; i18 > 5; i18--) {
            Test0464.instanceCount += 39383L;
            i = 920;
            Test0464.instanceCount <<= i19;
            i19 >>= i;
            Test0464.iArrFld[i18] -= i19;
            i += (((i18 * i) + i) - i19);
            Test0464.iArrFld[i18 - 1] -= -22924;
            s2 = (short) i18;
            i20 = 1;
            do {
                Test0464.iArrFld[i20] += i18;
                Test0464.iArrFld[i18 - 1] -= i;
                s2 = (short) i18;
                Test0464.instanceCount += (i20 | Test0464.instanceCount);
                for (i21 = i20; i21 < 1; i21++) {
                    try {
                        i = (i21 / i18);
                        i22 = (i20 / 61);
                        i = (i18 / Test0464.iArrFld[i18 + 1]);
                    } catch (ArithmeticException a_e) {
                    }
                    i <<= (int) Test0464.instanceCount;
                    lArrFld[i18] += 337199282583204629L;
                    lArrFld[i20 - 1] *= i19;
                    i22 /= (int) (i | 1);
                    if (b2) break;
                    lArrFld[i20] *= i20;
                    Test0464.iArrFld[i18 + 1] += i21;
                }
                Test0464.fFld += i;
                i19 += 119;
                i = (int) 60290L;
            } while (++i20 < 74);
        }

        FuzzerUtils.out.println("f i i18 = " + Float.floatToIntBits(f) + "," + i + "," + i18);
        FuzzerUtils.out.println("i19 s2 i20 = " + i19 + "," + s2 + "," + i20);
        FuzzerUtils.out.println("i21 i22 b2 = " + i21 + "," + i22 + "," + (b2 ? 1 : 0));

        FuzzerUtils.out.println("Test0464.instanceCount Test0464.fFld lArrFld = " + Test0464.instanceCount + "," +
                Float.floatToIntBits(Test0464.fFld) + "," + FuzzerUtils.checkSum(lArrFld));
        FuzzerUtils.out.println("Test0464.iArrFld fArrFld = " + FuzzerUtils.checkSum(Test0464.iArrFld) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
}

///////////////////////////////////////////////////////////////////////
class UserDefinedExceptionTest0464 extends RuntimeException {
    public int field;
}

//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
