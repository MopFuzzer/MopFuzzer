// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:11 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2L;
    public float fFld=32.615F;
    public static byte byFld=119;
    public static boolean bFld=false;
    public static boolean bFld1=false;
    public volatile int iArrFld[][]=new int[N][N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i5, int i6) {

        double d1=1.9603;
        int i7=4766, i8=64970, i9=-11, i10=55688, i11=-55221, iArr[][]=new int[N][N];
        short s1=8361;
        float f=60.894F;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(iArr, 0);

        for (d1 = 126; d1 > 6; --d1) {
            for (i8 = 1; i8 < 13; i8++) {
                Test.byFld -= (byte)i7;
                bArr[(int)(d1 + 1)] = Test.bFld;
                for (i10 = 1; i10 < 2; i10 += 3) {
                    s1 = (short)i7;
                    Test.instanceCount += i6;
                    try {
                        i7 = (i10 / -1000912207);
                        i9 = (-70 % i8);
                        i6 = (i6 / i9);
                    } catch (ArithmeticException a_e) {}
                    Test.instanceCount *= -8;
                    iArr[(int)(d1 + 1)][(-12 >>> 1) % N] -= (int)f;
                    i9 |= i8;
                    i6 = (int)f;
                    i11 = 26535;
                    s1 += (short)f;
                    i7 += (((i10 * i11) + i5) - i6);
                }
            }
        }
        vMeth2_check_sum += i5 + i6 + Double.doubleToLongBits(d1) + i7 + i8 + i9 + i10 + i11 + s1 +
            Float.floatToIntBits(f) + FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(iArr);
    }

    public void vMeth1() {

        int i12=63618, i13=52544, i14=33209, i15=-24966, i16=-5, i17=97, i18=-13, i19=-155;
        short s2=-28175;

        vMeth2(31, i12);
        for (i13 = 2; i13 < 348; ++i13) {
            fFld += Test.instanceCount;
            Test.instanceCount -= i13;
            i14 += (i13 - i13);
        }
        for (i15 = 8; i15 < 332; ++i15) {
            i12 -= i14;
            i16 -= (int)Test.instanceCount;
            for (i17 = 1; i17 < 5; i17++) {
                i14 ^= (int)Test.instanceCount;
                i16 += (i17 | i12);
                i19 = 2;
                while (--i19 > 0) {
                    iArrFld[i19][i19] &= (int)Test.instanceCount;
                    s2 += (short)i14;
                    i16 += i19;
                }
            }
        }
        vMeth1_check_sum += i12 + i13 + i14 + i15 + i16 + i17 + i18 + i19 + s2;
    }

    public void vMeth(byte by) {

        int i4=11898, i20=20021, i21=-154, i22=-5290, i23=-11397;

        i4 -= (i4 *= (i4 = i4));
        i4 += by;
        vMeth1();
        i4 += by;
        for (i20 = 11; 308 > i20; i20++) {
            Test.bFld = true;
            i4 *= -3029;
            for (i22 = 1; 6 > i22; ++i22) {
                i21 += (-118 + (i22 * i22));
                i21 -= 20471;
                i4 += (int)(-11L + (i22 * i22));
            }
            switch (((i20 % 1) * 5) + 54) {
            case 55:
                i23 <<= i21;
                i21 += (i20 * i20);
                i23 &= 1;
                break;
            default:
                iArrFld[i20 - 1][i20 + 1] += -55;
            }
        }
        vMeth_check_sum += by + i4 + i20 + i21 + i22 + i23;
    }

    public void mainTest(String[] strArr1) {

        int i=8, i1=-8, i2=-3, i3=59526, i24=10, i25=-10, i26=0, i27=-30131, i28=26909, i29=13;
        double d=0.97583, d2=1.18446;
        short s=-5818;

        i = (int)(((-(i -= i)) * fFld) + i);
        for (i1 = 17; 365 > i1; i1++) {
            fFld += i1;
            for (d = i1; d < 72; d++) {
                Test.instanceCount += (long)(((d * s) + i3) - i1);
                vMeth(Test.byFld);
                iArrFld[(int)(d - 1)][i1] >>>= (int)Test.instanceCount;
                Test.instanceCount <<= i2;
                i2 -= (int)d;
                i += (14766 + (d * d));
                i2 *= (int)Test.instanceCount;
                i2 += (int)fFld;
            }
            i2 &= i;
            switch ((i1 % 4) + 70) {
            case 70:
            case 71:
                i2 &= i3;
                i = i2;
                for (i24 = 72; i24 > 4; i24--) {
                    Test.byFld &= (byte)i24;
                    if (Test.bFld1) break;
                    switch (((i1 % 2) * 5) + 63) {
                    case 68:
                        d2 += i1;
                        for (i26 = 1; 2 > i26; ++i26) {
                            i2 &= (int)Test.instanceCount;
                        }
                        break;
                    case 71:
                        i += Test.byFld;
                        i3 /= (int)(i24 | 1);
                        i *= i27;
                        for (i28 = 1; i28 < 2; i28++) {
                            i29 %= (int)(i3 | 1);
                            Test.bFld = Test.bFld;
                        }
                        break;
                    default:
                        iArrFld[i24 - 1][i24] = -82;
                    }
                }
            case 72:
                Test.instanceCount = Test.instanceCount;
                break;
            case 73:
                Test.instanceCount += i26;
                break;
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("d i3 s = " + Double.doubleToLongBits(d) + "," + i3 + "," + s);
        FuzzerUtils.out.println("i24 i25 d2 = " + i24 + "," + i25 + "," + Double.doubleToLongBits(d2));
        FuzzerUtils.out.println("i26 i27 i28 = " + i26 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("i29 = " + i29);

        FuzzerUtils.out.println("Test.instanceCount fFld Test.byFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(fFld) + "," + Test.byFld);
        FuzzerUtils.out.println("Test.bFld Test.bFld1 iArrFld = " + (Test.bFld ? 1 : 0) + "," + (Test.bFld1 ? 1 : 0) +
            "," + FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
