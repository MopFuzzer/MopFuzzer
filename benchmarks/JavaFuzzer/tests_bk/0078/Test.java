// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:54 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=528693516L;
    public static short sFld=10101;
    public static volatile float fFld=2.374F;
    public byte byFld=-117;
    public static boolean bFld=false;
    public int iArrFld[]=new int[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(float f, float f1, int i5) {

        int i6=-178, i7=24339, i8=-12, i9=2, i10=9480;
        byte by1=-108;
        short s=-15355;
        float fArr[][]=new float[N][N];

        FuzzerUtils.init(fArr, -9.984F);

        fArr[(i5 >>> 1) % N][(i5 >>> 1) % N] = i5;
        try {
            for (i6 = 13; i6 < 309; i6++) {
                i5 = -2;
                for (i8 = 1; i8 < 6; ++i8) {
                    i7 *= (int)Test.instanceCount;
                    i7 += (i8 ^ i5);
                    f -= i7;
                    i10 = 2;
                    while (--i10 > 0) {
                        i5 += (i10 - by1);
                        f += i8;
                        i9 = (int)Test.instanceCount;
                        i7 -= i10;
                        i5 = 33252;
                        s += (short)i9;
                    }
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException exc1) {
            i7 += i9;
        }
        vMeth2_check_sum += Float.floatToIntBits(f) + Float.floatToIntBits(f1) + i5 + i6 + i7 + i8 + i9 + i10 + by1 + s
            + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth1(long l1) {

        float f2=-1.664F;
        int i11=0, i12=2, i13=9, i14=-1977, i15=11966, i16=-14, i17=-5, iArr1[]=new int[N];
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(iArr1, 20577);
        FuzzerUtils.init(bArr, false);

        vMeth2(-35.38F, f2, i11);
        for (i12 = 12; 307 > i12; ++i12) {
            for (i14 = 1; i14 < 6; i14++) {
                iArr1[i14 - 1] = -12;
                for (i16 = 1; i16 < 2; i16++) {
                    l1 = -956818037L;
                    switch (((i16 % 2) * 5) + 127) {
                    case 128:
                        i11 *= (int)Test.instanceCount;
                        f2 -= i14;
                        if (i13 != 0) {
                            vMeth1_check_sum += l1 + Float.floatToIntBits(f2) + i11 + i12 + i13 + i14 + i15 + i16 + i17
                                + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(bArr);
                            return;
                        }
                    case 132:
                        i15 += (((i16 * i16) + i15) - l1);
                        break;
                    }
                    bArr[i16 + 1] = true;
                    try {
                        iArr1[i14] = (-53826 / iArr1[i14 - 1]);
                        iArr1[i12] = (700866230 % iArr1[i16 + 1]);
                        i17 = (i13 / i12);
                    } catch (ArithmeticException a_e) {}
                    if (i12 != 0) {
                        vMeth1_check_sum += l1 + Float.floatToIntBits(f2) + i11 + i12 + i13 + i14 + i15 + i16 + i17 +
                            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(bArr);
                        return;
                    }
                    l1 |= Test.sFld;
                }
            }
        }
        vMeth1_check_sum += l1 + Float.floatToIntBits(f2) + i11 + i12 + i13 + i14 + i15 + i16 + i17 +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(bArr);
    }

    public static void vMeth(byte by, double d, long l) {

        int i3=-24431, i4=32723, i18=-64341, i19=61363, iArr[]=new int[N];
        boolean b=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 5);
        FuzzerUtils.init(lArr, 6L);

        for (int i2 : iArr) {
            for (i3 = 1; i3 < 4; i3++) {
                vMeth1(Test.instanceCount);
                l = (long)Test.fFld;
                switch (((i2 >>> 1) % 4) + 81) {
                case 81:
                    if (b) {
                        for (i18 = i3; i18 < 2; ++i18) {
                            i19 = i4;
                            i4 += (i18 + Test.sFld);
                            by = (byte)i18;
                            i2 += i18;
                            lArr[i18] = -56240;
                        }
                    }
                    i19 += i19;
                    i4 += i3;
                case 82:
                case 83:
                    i19 -= Test.sFld;
                    break;
                case 84:
                    Test.sFld += (short)Test.instanceCount;
                    break;
                }
            }
        }
        vMeth_check_sum += by + Double.doubleToLongBits(d) + l + i3 + i4 + i18 + i19 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i=-47644, i1=-76, i20=5, i21=-93, i22=37314, i23=8, i24=-113, i25=9059, i26=-7;
        double d1=127.52206;

        for (i = 13; 342 > i; i++) {
            vMeth(byFld, d1, Test.instanceCount);
            byFld = (byte)i;
            i1 += -9;
            for (i20 = i; i20 < 76; ++i20) {
                try {
                    i21 = (39538 / i1);
                    i1 = (-208 / i);
                    i1 = (i20 / -150);
                } catch (ArithmeticException a_e) {}
                Test.sFld += (short)i20;
                i1 += (i20 + Test.instanceCount);
                i21 += (((i20 * Test.sFld) + i21) - i20);
                i1 = (int)Test.instanceCount;
                iArrFld[i20 + 1] += i20;
                Test.sFld = (short)11;
                for (i22 = 1; i22 > 1; i22 -= 2) {
                    Test.sFld += (short)(((i22 * Test.instanceCount) + i20) - byFld);
                    i21 <<= (int)Test.instanceCount;
                }
            }
            i24 = 1;
            do {
                for (i25 = 1; 1 > i25; i25 += 3) {
                    d1 *= Test.instanceCount;
                    i26 += (((i25 * i20) + i22) - i21);
                    i26 &= i26;
                    iArrFld[i + 1] >>= i26;
                    i21 = i21;
                    Test.fFld += Test.fFld;
                    i26 += i25;
                    Test.instanceCount >>= 87;
                    Test.bFld = false;
                    i1 = i25;
                }
            } while (++i24 < 76);
            i1 += (i * i24);
        }
        i21 = (int)d1;
        i23 += (int)d1;

        FuzzerUtils.out.println("i i1 d1 = " + i + "," + i1 + "," + Double.doubleToLongBits(d1));
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 = " + i26);

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.fFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("byFld Test.bFld iArrFld = " + byFld + "," + (Test.bFld ? 1 : 0) + "," +
            FuzzerUtils.checkSum(iArrFld));

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
