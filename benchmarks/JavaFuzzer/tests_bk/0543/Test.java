// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:06 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-11L;
    public static double dFld=-1.87773;
    public static volatile boolean bFld=true;
    public static short sArrFld[]=new short[N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)31028);
        FuzzerUtils.init(Test.dArrFld, 0.109249);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l, float f1) {

        int i9=-11, i10=-6, i11=47901, i12=9114, i13=13, i14=-1, i15=-54293, iArr[]=new int[N];
        boolean b=false, bArr[]=new boolean[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 52);
        FuzzerUtils.init(lArr, -41106L);
        FuzzerUtils.init(bArr, false);

        i9 = 1;
        do {
            for (i10 = 1; i10 < 5; i10++) {
                iArr[i9 + 1] = i9;
            }
            for (i12 = i9; i12 < 5; ++i12) {
                for (i14 = 1; i14 < 1; ++i14) {
                    i13 = i13;
                    switch ((((i14 >>> 1) % 2) * 5) + 116) {
                    case 125:
                        b = b;
                    case 118:
                        if (i15 != 0) {
                            vMeth1_check_sum += l + Float.floatToIntBits(f1) + i9 + i10 + i11 + i12 + i13 + i14 + i15 +
                                (b ? 1 : 0) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr) +
                                FuzzerUtils.checkSum(bArr);
                            return;
                        }
                        f1 = l;
                        break;
                    default:
                        i13 *= (int)Test.instanceCount;
                        if (i14 != 0) {
                            vMeth1_check_sum += l + Float.floatToIntBits(f1) + i9 + i10 + i11 + i12 + i13 + i14 + i15 +
                                (b ? 1 : 0) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr) +
                                FuzzerUtils.checkSum(bArr);
                            return;
                        }
                        Test.sArrFld[i14] -= (short)f1;
                        if (i9 != 0) {
                            vMeth1_check_sum += l + Float.floatToIntBits(f1) + i9 + i10 + i11 + i12 + i13 + i14 + i15 +
                                (b ? 1 : 0) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr) +
                                FuzzerUtils.checkSum(bArr);
                            return;
                        }
                    }
                    bArr[i9] = Test.bFld;
                }
            }
        } while (++i9 < 367);
        vMeth1_check_sum += l + Float.floatToIntBits(f1) + i9 + i10 + i11 + i12 + i13 + i14 + i15 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(bArr);
    }

    public static void vMeth(int i2, int i3, int i4) {

        short s=-24192;
        int i5=-246, i6=0, i7=8842, i8=7730, i16=62142, i17=91, i18=-37, i19=-111, iArr1[]=new int[N];
        float f3=-2.569F;
        byte by=-26;

        FuzzerUtils.init(iArr1, 42259);

        i3 = s;
        for (i5 = 378; i5 > 1; --i5) {
            for (i7 = i5; i7 < 4; i7 += 2) {
                float f2=0.433F;
                i4 = Integer.reverseBytes(--i6);
                vMeth1(-3829552541L, f2);
            }
            for (i16 = 1; i16 < 4; ++i16) {
                for (i18 = 1; i18 < 2; i18 += 3) {
                    iArr1[i5] = (int)Test.instanceCount;
                    Test.bFld = Test.bFld;
                    i6 *= (int)140L;
                    i4 >>>= i6;
                    f3 += Test.instanceCount;
                    i3 = (int)Test.dFld;
                }
            }
            by = (byte)i19;
            if (false) break;
        }
        vMeth_check_sum += i2 + i3 + i4 + s + i5 + i6 + i7 + i8 + i16 + i17 + i18 + i19 + Float.floatToIntBits(f3) + by
            + FuzzerUtils.checkSum(iArr1);
    }

    public static long lMeth(int i, int i1, float f) {

        int i20=53053, i21=4, i22=30284, i23=8, i24=-5, iArr2[]=new int[N];
        short s1=27832;
        float fArr[][]=new float[N][N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(fArr, -87.804F);
        FuzzerUtils.init(byArr, (byte)90);
        FuzzerUtils.init(iArr2, 41);

        vMeth(i, i1, i);
        Test.instanceCount = i1;
        i20 = 142;
        do {
            Test.dArrFld[i20 - 1] = i20;
            for (i21 = 1; i21 < 11; i21 += 2) {
                f += s1;
                if (Test.bFld) break;
                fArr[i20][i21] *= i1;
            }
            for (i23 = 1; i23 < 11; i23++) {
                i -= i;
                byArr[i23 - 1] -= (byte)65183L;
                i22 += i1;
                iArr2[i23] = i21;
                if (i20 != 0) {
                }
                Test.sArrFld[i20 + 1] = (short)Test.instanceCount;
            }
        } while (--i20 > 0);
        long meth_res = i + i1 + Float.floatToIntBits(f) + i20 + i21 + i22 + s1 + i23 + i24 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(byArr) +
            FuzzerUtils.checkSum(iArr2);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i25=9, i26=-3, i27=183, i28=3, i29=48923, iArr3[]=new int[N];
        float f4=-13.1014F, f5=69.314F;
        byte by1=-14;
        boolean bArr1[]=new boolean[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr3, 52103);
        FuzzerUtils.init(bArr1, true);
        FuzzerUtils.init(lArr1, -11L);

        Test.dFld -= lMeth(i25, i25, 73.336F);
        i26 = 1;
        do {
            short s2=-8824;
            Test.instanceCount -= i26;
            i25 += i26;
            switch (((i26 >>> 1) % 3) + 21) {
            case 21:
                if (true) {
                    f4 %= 6;
                    switch ((i26 % 9) + 10) {
                    case 10:
                        iArr3[i26 - 1] >>= 196;
                        f4 += (i26 * i26);
                        break;
                    case 11:
                        by1 += (byte)s2;
                        i25 = i25;
                        Test.instanceCount = i26;
                        for (i27 = 4; i27 < 65; ++i27) {
                            switch ((((i26 >>> 1) % 10) * 5) + 4) {
                            case 50:
                                i28 -= (int)Test.instanceCount;
                                break;
                            case 8:
                                switch (((i27 % 1) * 5) + 60) {
                                case 63:
                                    Test.dFld += i25;
                                    s2 &= (short)i25;
                                }
                                break;
                            case 17:
                            case 13:
                            case 14:
                                iArr3[i27 - 1] <<= (int)6712746306000909373L;
                                break;
                            case 29:
                                bArr1[i27 + 1] = true;
                                iArr3[i27] = i26;
                                Test.instanceCount = (long)1.322F;
                                break;
                            case 34:
                                i28 = by1;
                                Test.instanceCount -= Test.instanceCount;
                                switch ((i27 % 2) + 55) {
                                case 55:
                                    for (f5 = i27; 2 > f5; ++f5) {
                                        i29 |= 254;
                                        i29 = (int)Test.dFld;
                                        lArr1[i26 + 1] <<= i26;
                                    }
                                    break;
                                case 56:
                                    iArr3[i27] -= (int)Test.dFld;
                                default:
                                    iArr3[i27 - 1] = -187;
                                }
                            case 15:
                                i28 -= by1;
                                break;
                            case 30:
                                i29 += (i27 | Test.instanceCount);
                                break;
                            case 27:
                                s2 += (short)i29;
                                break;
                            default:
                                i28 <<= i27;
                            }
                        }
                    case 12:
                        iArr3 = iArr3;
                    case 13:
                        iArr3[i26] += s2;
                        break;
                    case 14:
                        Test.instanceCount += (i26 * i26);
                        break;
                    case 15:
                        iArr3[i26] = i28;
                    case 16:
                    case 17:
                        i28 = (int)Test.instanceCount;
                        break;
                    case 18:
                        Test.instanceCount = (long)f5;
                        break;
                    }
                } else if (Test.bFld) {
                    try {
                        i29 = (i28 / -71);
                        i29 = (i26 / -183);
                        i25 = (iArr3[i26] % 1863336855);
                    } catch (ArithmeticException a_e) {}
                } else if (Test.bFld) {
                    i25 += (i26 + i28);
                } else {
                    i29 = i27;
                }
            case 22:
                i25 += (int)Test.dFld;
                break;
            case 23:
                lArr1[i26 + 1] = i25;
                break;
            }
        } while (++i26 < 387);

        FuzzerUtils.out.println("i25 i26 f4 = " + i25 + "," + i26 + "," + Float.floatToIntBits(f4));
        FuzzerUtils.out.println("by1 i27 i28 = " + by1 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("f5 i29 iArr3 = " + Float.floatToIntBits(f5) + "," + i29 + "," +
            FuzzerUtils.checkSum(iArr3));
        FuzzerUtils.out.println("bArr1 lArr1 = " + FuzzerUtils.checkSum(bArr1) + "," + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.bFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(Test.dFld) + "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.sArrFld Test.dArrFld = " + FuzzerUtils.checkSum(Test.sArrFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
