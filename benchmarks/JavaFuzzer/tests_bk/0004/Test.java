// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:53 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=55078L;
    public byte byFld=-19;
    public static float fFld=2.545F;
    public short sFld=-5683;
    public static double dFld=-121.125185;
    public static short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)21273);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(float f1, int i2, long l1) {

        int i3=230, i4=52, i5=64668, i6=-164, i7=24106, iArr[]=new int[N];
        long l2=23264L, l3=-2034418362750384877L, lArr[]=new long[N];
        byte by=50;
        boolean b=true;

        FuzzerUtils.init(lArr, -5189568149179719778L);
        FuzzerUtils.init(iArr, 13);

        for (i3 = 4; 211 > i3; ++i3) {
            i4 += i2;
            f1 -= i3;
            lArr[i3] *= (long)-46.280F;
            for (i5 = 1; i5 < 8; i5++) {
                for (l2 = 1; l2 < 2; l2++) {
                    boolean b1=true;
                    Test.instanceCount = i3;
                    i7 >>= (int)l3;
                    by -= (byte)12372;
                    switch (((i6 >>> 1) % 7) + 21) {
                    case 21:
                        if (b) continue;
                        break;
                    case 22:
                        i4 = i6;
                        if (false) continue;
                        l3 += (long)f1;
                        b1 = b;
                        break;
                    case 23:
                        l3 >>= l1;
                        break;
                    case 24:
                        iArr[i5 - 1] = (int)-49087L;
                    case 25:
                        if (true) continue;
                        break;
                    case 26:
                        i2 = i5;
                        break;
                    case 27:
                        i2 += i4;
                        break;
                    default:
                        by *= (byte)f1;
                    }
                }
            }
        }
        vMeth2_check_sum += Float.floatToIntBits(f1) + i2 + l1 + i3 + i4 + i5 + i6 + l2 + i7 + l3 + by + (b ? 1 : 0) +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(short s, short s1) {

        float f2=34.515F;
        int i8=5;

        vMeth2(f2, i8, 248L);
        vMeth1_check_sum += s + s1 + Float.floatToIntBits(f2) + i8;
    }

    public static void vMeth(int i, int i1, long l) {

        float f=71.166F;
        double d=-109.89008, dArr[]=new double[N];
        int i9=-191, i10=-36591, i11=66, i12=6, i13=-246, iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, 44255);
        FuzzerUtils.init(dArr, 26.14396);

        i -= (int)(f++);
        i1 = i1;
        vMeth1((short)(-25281), (short)(-31365));
        l *= -92;
        i = -63292;
        for (d = 300; d > 7; d -= 2) {
            i9 = i9;
            try {
                i1 = (-30853 / i9);
                iArr1[(int)(d)] = (i / iArr1[(int)(d)]);
                i = (i9 % -61742);
            } catch (ArithmeticException a_e) {}
            for (i10 = (int)(d); i10 < 11; i10++) {
                f = i1;
                l = -7;
            }
        }
        i9 = (int)Test.instanceCount;
        for (i12 = 10; i12 < 238; i12 += 2) {
            dArr[i12] -= i;
            i13 = (int)Test.instanceCount;
        }
        vMeth_check_sum += i + i1 + l + Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i9 + i10 + i11 + i12 +
            i13 + FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        int i15=11, i16=-176, i17=-32460, i18=10, i19=26, i20=-22492, i21=-6241, i22=-233, i23=2, i24=23, iArr2[]=new
            int[N];
        boolean b2=true;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr2, 28521);
        FuzzerUtils.init(lArr1, -35L);

        vMeth(i15, i15, Test.instanceCount);
        i16 = 1;
        while (++i16 < 223) {
            iArr2 = iArr2;
            iArr2[i16 - 1] |= byFld;
            switch ((i16 % 5) + 82) {
            case 82:
                for (i17 = 113; i17 > 4; i17--) {
                    i19 = 1;
                    do {
                        Test.fFld += (i19 + i17);
                    } while (++i19 < 2);
                    Test.fFld -= i19;
                    Test.instanceCount *= sFld;
                    iArr2[i16 + 1] = 11;
                }
                break;
            case 83:
                Test.instanceCount += Test.instanceCount;
                sFld += (short)20616;
                lArr1[i16 - 1] += -22221;
                if (b2) {
                    lArr1[i16] = i15;
                    Test.instanceCount *= 16320;
                } else if (true) {
                    for (i20 = 5; i20 < 113; ++i20) {
                        switch ((i16 % 9) + 20) {
                        case 20:
                        case 21:
                            for (i22 = 1; i22 < 2; ++i22) {
                                Test.dFld = i17;
                                i23 |= i21;
                                sFld = (short)58718L;
                                i18 *= (int)Test.dFld;
                                try {
                                    i21 = (i22 / -23329);
                                    i18 = (i20 / -45145);
                                    i21 = (i23 % -201);
                                } catch (ArithmeticException a_e) {}
                                Test.sArrFld[i20] >>= (short)Test.instanceCount;
                                i18 += i22;
                                lArr1[i16] <<= i18;
                            }
                            i21 -= (int)Test.instanceCount;
                            try {
                                i23 = (i17 / i23);
                                iArr2[i20 + 1] = (35482 / i15);
                                i21 = (-852852239 % i16);
                            } catch (ArithmeticException a_e) {}
                            break;
                        case 22:
                            Test.instanceCount += (i20 * i20);
                            break;
                        case 23:
                            Test.instanceCount = i21;
                            break;
                        case 24:
                            iArr2 = iArr2;
                            break;
                        case 25:
                            Test.instanceCount += (i20 * i20);
                            break;
                        case 26:
                            try {
                                i21 = (i18 % 62548);
                                i24 = (i24 % i22);
                                i18 = (i23 / i18);
                            } catch (ArithmeticException a_e) {}
                            break;
                        case 27:
                            i24 *= (int)Test.fFld;
                        case 28:
                            i18 += byFld;
                            break;
                        }
                    }
                }
                break;
            case 84:
                Test.instanceCount -= (long)Test.dFld;
                break;
            case 85:
                Test.sArrFld = Test.sArrFld;
                break;
            case 86:
                i15 = (int)1L;
                break;
            }
        }

        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 b2 iArr2 = " + i24 + "," + (b2 ? 1 : 0) + "," + FuzzerUtils.checkSum(iArr2));
        FuzzerUtils.out.println("lArr1 = " + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test.instanceCount byFld Test.fFld = " + Test.instanceCount + "," + byFld + "," +
            Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("sFld Test.dFld Test.sArrFld = " + sFld + "," + Double.doubleToLongBits(Test.dFld) +
            "," + FuzzerUtils.checkSum(Test.sArrFld));

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
