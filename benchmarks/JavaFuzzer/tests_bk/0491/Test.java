// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:05 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=4181141333L;
    public static int iFld=217;
    public volatile double dFld=-57.33392;
    public float fFld=-24.207F;
    public static float fArrFld[]=new float[N];
    public byte byArrFld[]=new byte[N];
    public int iArrFld[]=new int[N];
    public static short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 0.943F);
        FuzzerUtils.init(Test.sArrFld, (short)-23012);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i5=6, i6=0, i7=4, i8=14, i9=-71, iArr[]=new int[N];
        float f=50.933F;
        double d=2.1420, dArr[][]=new double[N][N];
        byte by=-63;
        boolean b1=false;

        FuzzerUtils.init(iArr, 8);
        FuzzerUtils.init(dArr, 58.58326);

        for (i5 = 4; i5 < 368; ++i5) {
            i7 = 5;
            while (--i7 > 0) {
                i6 += (((i7 * i5) + f) - i5);
                d += by;
            }
            iArr = iArr;
            i6 = -18353;
            for (i8 = 1; i8 < 5; ++i8) {
                iArr[i8] -= i5;
                dArr[i5][i5] /= ((long)(f) | 1);
                iArr[i5 - 1] = i9;
                f = i9;
                Test.instanceCount *= 10;
                i9 += 13;
                b1 = b1;
                i9 += -45470;
            }
        }
        vMeth1_check_sum += i5 + i6 + i7 + Float.floatToIntBits(f) + Double.doubleToLongBits(d) + by + i8 + i9 + (b1 ?
            1 : 0) + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth(boolean b) {

        short s=-18535;
        int i10=-41197, i11=-4, i12=2, i13=-12, i14=14, iArr1[]=new int[N];
        float f1=1.33F;
        byte by1=120, byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)73);
        FuzzerUtils.init(iArr1, -9);

        vMeth1();
        Test.iFld = (int)Test.instanceCount;
        s *= (short)Test.iFld;
        for (i10 = 4; i10 < 290; i10++) {
            i12 = 1;
            while (++i12 < 6) {
                switch ((i10 % 10) + 2) {
                case 2:
                    s |= (short)i11;
                    i11 += (int)f1;
                    Test.instanceCount = Test.iFld;
                    Test.instanceCount <<= s;
                    break;
                case 3:
                    switch ((i10 % 1) + 89) {
                    case 89:
                        Test.instanceCount = Test.instanceCount;
                        for (i13 = 1; i13 < 1; i13++) {
                            if (true) continue;
                            i14 = (int)Test.instanceCount;
                        }
                    default:
                        byArr[i10 - 1] = (byte)Test.iFld;
                    }
                case 4:
                    if (b) continue;
                    break;
                case 5:
                    if (Test.iFld != 0) {
                        vMeth_check_sum += (b ? 1 : 0) + s + i10 + i11 + i12 + Float.floatToIntBits(f1) + i13 + i14 +
                            by1 + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr1);
                        return;
                    }
                    break;
                case 6:
                    s -= (short)i13;
                    break;
                case 7:
                    Test.instanceCount += (i12 * i12);
                    break;
                case 8:
                    i14 += Test.iFld;
                    break;
                case 9:
                    Test.fArrFld[i12] = -10L;
                    break;
                case 10:
                    iArr1[i10 - 1] = by1;
                    break;
                case 11:
                    i11 -= (int)46.80006;
                default:
                    i11 += (i12 * i12);
                }
            }
        }
        vMeth_check_sum += (b ? 1 : 0) + s + i10 + i11 + i12 + Float.floatToIntBits(f1) + i13 + i14 + by1 +
            FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr1);
    }

    public int iMeth(int i2) {

        int i3=-214, i4=2, i15=165, i16=-250, i17=10, i18=-14;
        boolean b2=false;
        byte by2=6;
        short s1=16263;
        float f2=-124.146F;

        for (i3 = 12; i3 < 322; ++i3) {
            vMeth(b2);
        }
        i4 = (int)Test.instanceCount;
        for (i15 = 5; i15 < 228; i15++) {
            by2 += (byte)(((i15 * s1) + i2) - Test.instanceCount);
            i16 += (int)Test.instanceCount;
            i2 = Test.iFld;
            Test.iFld *= (int)f2;
            Test.fArrFld[i15] *= i15;
            for (i17 = i15; i17 < 7; i17++) {
                try {
                    iArrFld[i17 + 1] = (Test.iFld % i2);
                    iArrFld[i15 - 1] = (i3 % iArrFld[i17 - 1]);
                    i2 = (281759595 / i18);
                } catch (ArithmeticException a_e) {}
                Test.sArrFld = Test.sArrFld;
                by2 = (byte)i16;
                iArrFld = iArrFld;
                i18 *= 38262;
            }
        }
        long meth_res = i2 + i3 + i4 + (b2 ? 1 : 0) + i15 + i16 + by2 + s1 + Float.floatToIntBits(f2) + i17 + i18;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=19094, i1=-7, i19=251, i20=10841, i21=19211, i22=11, i23=-2, iArr2[]=new int[N];
        short s2=19464;
        byte by4=43;
        boolean b3=true;
        long l=-4047901851625701665L, lArr[]=new long[N];

        FuzzerUtils.init(lArr, -3873417016L);
        FuzzerUtils.init(iArr2, -6933);

        for (i = 16; i < 349; i += 3) {
            iMeth(i1);
            dFld = s2;
            Test.iFld += (((i * i) + Test.iFld) - i1);
            i19 = i1;
            for (i20 = 11; i20 < 226; ++i20) {
                iArrFld[i20 + 1] += -58628;
                for (i22 = 1; i22 < 2; ++i22) {
                    Test.fArrFld[i20] -= 8;
                    switch (i + 31) {
                    case 31:
                        i1 += i22;
                        switch ((i % 4) + 42) {
                        case 42:
                            lArr[i22 - 1] *= -204;
                            lArr[i22] -= i1;
                            i21 |= i20;
                            i23 = i22;
                            break;
                        case 43:
                            i19 -= Test.iFld;
                            i23 += i22;
                            break;
                        case 44:
                            try {
                                i19 = (i21 % -2518);
                                i1 = (i19 / 15338);
                                iArr2[i22 + 1] = (8617 % i20);
                            } catch (ArithmeticException a_e) {}
                            break;
                        case 45:
                            iArr2[i20] = Test.iFld;
                            break;
                        default:
                            Test.iFld += i19;
                        }
                        i21 += (12 + (i22 * i22));
                        break;
                    case 32:
                        by4 += (byte)i22;
                    case 33:
                    case 34:
                        Test.instanceCount += i22;
                        i23 = i19;
                        break;
                    case 35:
                        switch (((Test.iFld >>> 1) % 1) + 16) {
                        case 16:
                            Test.instanceCount = (long)dFld;
                            i23 += (5 + (i22 * i22));
                            if (b3) break;
                        default:
                            i23 *= (int)Test.instanceCount;
                        }
                        break;
                    case 36:
                        try {
                            i23 = (iArrFld[i20 - 1] % -161);
                            iArrFld[i22 + 1] = (i21 % i1);
                            i1 = (-151 % i22);
                        } catch (ArithmeticException a_e) {}
                    case 37:
                        i23 = i20;
                    case 38:
                        i21 += (((i22 * fFld) + fFld) - Test.instanceCount);
                    case 39:
                        iArr2[i22 + 1] -= (int)dFld;
                    case 40:
                        Test.iFld *= i20;
                        break;
                    case 41:
                        i1 -= (int)Test.instanceCount;
                        break;
                    case 42:
                        iArr2[i20] = i20;
                        break;
                    case 43:
                        fFld += i22;
                    case 44:
                        if (b3) break;
                        break;
                    case 45:
                        Test.instanceCount -= l;
                        break;
                    case 46:
                        iArrFld[i - 1] -= s2;
                        break;
                    case 47:
                        fFld += 104;
                    case 48:
                        i19 = i21;
                        break;
                    case 49:
                        i19 = i23;
                    case 50:
                        i21 *= (int)l;
                    case 51:
                        i19 += (int)Test.instanceCount;
                    case 52:
                        dFld -= i;
                        break;
                    case 53:
                        i23 = Test.iFld;
                        break;
                    case 54:
                        l *= i19;
                        break;
                    case 55:
                        fFld = fFld;
                        break;
                    case 56:
                        i21 -= (int)Test.instanceCount;
                        break;
                    case 57:
                        iArr2 = iArrFld;
                        break;
                    case 58:
                        s2 %= (short)(s2 | 1);
                        break;
                    case 59:
                        i21 = by4;
                        break;
                    case 60:
                        iArr2[i + 1] <<= (int)Test.instanceCount;
                        break;
                    case 61:
                        if (true) break;
                        break;
                    case 62:
                    case 63:
                        i23 *= i19;
                    case 64:
                        fFld += (((i22 * s2) + i23) - fFld);
                    case 65:
                        fFld -= -150;
                        break;
                    case 66:
                        iArr2[i22] = by4;
                        break;
                    case 67:
                        i23 += i1;
                        break;
                    case 68:
                        b3 = b3;
                        break;
                    case 69:
                        i19 = i1;
                        break;
                    case 70:
                        if (b3) continue;
                        break;
                    case 71:
                        iArrFld[i - 1] += (int)dFld;
                        break;
                    case 72:
                        i21 = (int)Test.instanceCount;
                        break;
                    case 73:
                        iArr2[i20 + 1] = -57;
                        break;
                    case 74:
                        Test.iFld <<= i21;
                    case 75:
                        Test.iFld = (int)Test.instanceCount;
                        break;
                    case 76:
                        i19 -= i21;
                        break;
                    case 77:
                        if (b3) break;
                        break;
                    case 78:
                        fFld *= Test.instanceCount;
                        break;
                    case 79:
                    case 80:
                        iArrFld[i - 1] = -1;
                        break;
                    case 81:
                        Test.iFld -= i;
                        break;
                    case 82:
                        i23 -= i19;
                        break;
                    case 83:
                        i23 = -11340;
                    case 84:
                        i19 += i22;
                    case 85:
                        Test.sArrFld[i20 + 1] += (short)i19;
                        break;
                    case 86:
                        iArr2[i20] = i1;
                        break;
                    case 87:
                        dFld -= l;
                    case 88:
                        Test.instanceCount += (i22 * i22);
                        break;
                    case 89:
                        Test.iFld = s2;
                        break;
                    case 90:
                        i23 <<= i19;
                    case 91:
                        fFld += -68;
                        break;
                    case 92:
                        i1 /= (int)(l | 1);
                        break;
                    case 93:
                        iArrFld[i20 + 1] += i;
                    case 94:
                        iArr2[i20] <<= (int)l;
                    case 95:
                        i21 -= i21;
                    case 96:
                        l += (((i22 * i20) + i20) - l);
                    case 97:
                        Test.iFld = i19;
                        break;
                    case 98:
                        Test.iFld = 37;
                        break;
                    case 99:
                        i19 = Test.iFld;
                        break;
                    case 100:
                        i1 <<= i;
                        break;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 s2 = " + i + "," + i1 + "," + s2);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 by4 = " + i22 + "," + i23 + "," + by4);
        FuzzerUtils.out.println("b3 l lArr = " + (b3 ? 1 : 0) + "," + l + "," + FuzzerUtils.checkSum(lArr));
        FuzzerUtils.out.println("iArr2 = " + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld dFld = " + Test.instanceCount + "," + Test.iFld + "," +
            Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("fFld Test.fArrFld byArrFld = " + Float.floatToIntBits(fFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," + FuzzerUtils.checkSum(byArrFld));
        FuzzerUtils.out.println("iArrFld Test.sArrFld = " + FuzzerUtils.checkSum(iArrFld) + "," +
            FuzzerUtils.checkSum(Test.sArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
