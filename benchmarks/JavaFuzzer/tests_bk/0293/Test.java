// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:00 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-8L;
    public static short sFld=-30181;
    public static double dFld=-91.127857;
    public static float fFld=-20.943F;
    public static int iFld=18859;
    public static boolean bFld=true;
    public static int iFld1=-13;
    public double dArrFld[]=new double[N];

    public static long dMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i7, int i8) {

        float f=2.266F;
        long l=-2L, l1=4012774197L, lArr[]=new long[N];
        int i9=45041, iArr1[]=new int[N];
        double d1=-1.93434, dArr[]=new double[N];

        FuzzerUtils.init(lArr, 30423L);
        FuzzerUtils.init(iArr1, 231);
        FuzzerUtils.init(dArr, -1.41421);

        f -= i7;
        for (l = 8; l < 194; l++) {
            lArr[(int)(l + 1)] = (long)-40.121981;
            l1 = 1;
            while (++l1 < 9) {
                if (true) continue;
                i7 += (int)l1;
                i9 &= (int)l;
                switch ((((i8 >>> 1) % 3) * 5) + 46) {
                case 48:
                    i8 ^= (int)Test.instanceCount;
                    i9 = (int)l1;
                    switch ((int)((l1 % 6) + 87)) {
                    case 87:
                        i9 = 12;
                        f -= l1;
                        Test.instanceCount = i8;
                        i7 /= (int)((long)(f) | 1);
                        break;
                    case 88:
                        d1 *= i8;
                        break;
                    case 89:
                        Test.instanceCount *= i7;
                        break;
                    case 90:
                        i9 = (int)l1;
                        break;
                    case 91:
                        Test.instanceCount >>= l1;
                    case 92:
                        iArr1[(int)(l - 1)] += (int)47.5441;
                        break;
                    }
                case 53:
                    i9 = i8;
                    break;
                case 59:
                    dArr[(int)(l)] = Test.sFld;
                    break;
                default:
                    Test.instanceCount ^= i8;
                }
            }
        }
        vMeth1_check_sum += i7 + i8 + Float.floatToIntBits(f) + l + i9 + l1 + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth(int i2) {

        int i3=4, i4=51, i5=33618, i6=1, i10=14, iArr2[]=new int[N];
        boolean b=false;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -115.65F);
        FuzzerUtils.init(iArr2, -37536);

        for (i3 = 12; 299 > i3; ++i3) {
            for (i5 = 1; i5 < 6; i5++) {
                Test.instanceCount -= Test.instanceCount;
                fArr = (fArr = (fArr = fArr));
                i4 = -246;
                vMeth1(i6, i3);
                i6 += (i5 - i4);
                i4 += i5;
                i6 = i5;
            }
            Test.dFld *= i10;
            if (b) {
                i4 += (i3 * i3);
            } else {
                i10 |= -31110;
                iArr2[i3 - 1] += i4;
                vMeth_check_sum += i2 + i3 + i4 + i5 + i6 + i10 + (b ? 1 : 0) +
                    Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr2);
                return;
            }
            Test.fFld -= Test.iFld;
        }
        vMeth_check_sum += i2 + i3 + i4 + i5 + i6 + i10 + (b ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr2);
    }

    public static double dMeth(int i1, double d) {

        int i11=146, i12=184, i13=187, i14=-56410, i15=-13, i16=201, iArr3[]=new int[N];

        FuzzerUtils.init(iArr3, -2);

        vMeth(161);
        i1 = i1;
        Test.sFld = (short)Test.instanceCount;
        for (i11 = 1; i11 < 215; ++i11) {
            try {
                i1 = (iArr3[i11 - 1] / i1);
                Test.iFld = (i1 / iArr3[i11]);
                i12 = (Test.iFld % -9430);
            } catch (ArithmeticException a_e) {}
            Test.iFld += (int)-51.4F;
            i1 = -26282;
        }
        for (i13 = 3; i13 < 169; i13 += 3) {
            Test.instanceCount -= 40675;
            Test.iFld += (int)Test.fFld;
            Test.bFld = Test.bFld;
            for (i15 = 1; i15 < 28; ++i15) {
                iArr3[i15 - 1] = i12;
                Test.instanceCount -= (long)Test.fFld;
                i1 &= i15;
            }
        }
        long meth_res = i1 + Double.doubleToLongBits(d) + i11 + i12 + i13 + i14 + i15 + i16 +
            FuzzerUtils.checkSum(iArr3);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-6, i17=-9, i18=44, i19=231, i20=178, i21=12, i22=-158, i23=43463, i24=-187, i25=46020, i26=2, iArr[]=new
            int[N];
        byte by=76;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr, 17800);
        FuzzerUtils.init(lArr1, 6217307126815161960L);

        iArr[(i >>> 1) % N] = (int)((dMeth(i, Test.dFld) * -11) - Test.iFld);
        for (double d2 : dArrFld) {
            Test.instanceCount = Test.iFld;
            Test.instanceCount -= i;
            lArr1[(10 >>> 1) % N] = -40510;
            for (i17 = 63; i17 > 1; --i17) {
                switch ((((i17 >>> 1) % 7) * 5) + 48) {
                case 49:
                    Test.instanceCount <<= Test.iFld1;
                    Test.iFld1 >>>= i17;
                    try {
                        iArr[i17 + 1] = (iArr[i17] % -104);
                        Test.iFld = (i18 % 153);
                        iArr[i17 + 1] = (i17 / 55942117);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 83:
                    i = i;
                    i18 *= Test.sFld;
                    for (i19 = 2; 1 < i19; --i19) {
                        if (Test.bFld) continue;
                        Test.iFld1 >>= i18;
                        Test.instanceCount = by;
                    }
                    break;
                case 77:
                    for (i21 = 2; i21 > 1; i21 -= 3) {
                        dArrFld[i21 - 1] = Test.instanceCount;
                    }
                    for (i23 = 1; i23 < 2; i23++) {
                        Test.fFld += -194L;
                        i24 += i23;
                    }
                case 69:
                    i += (int)(-178L + (i17 * i17));
                    Test.instanceCount ^= -86L;
                    for (i25 = 1; i25 < 2; i25++) {
                        i24 += i22;
                    }
                    switch ((i17 % 9) + 99) {
                    case 99:
                        iArr[i17] = i20;
                        break;
                    case 100:
                        Test.iFld1 += (int)d2;
                        break;
                    case 101:
                        i22 += (int)(-105L + (i17 * i17));
                        Test.instanceCount -= Test.sFld;
                        break;
                    case 102:
                        lArr1[i17] += i22;
                    case 103:
                        iArr[i17 - 1] += i21;
                        break;
                    case 104:
                        i24 += Test.sFld;
                    case 105:
                        i18 += -54346;
                        break;
                    case 106:
                        iArr[i17] -= 100;
                        break;
                    case 107:
                        try {
                            Test.iFld1 = (iArr[i17 + 1] / iArr[i17 + 1]);
                            i24 = (-9678 % i20);
                            i20 = (-21 % iArr[i17 - 1]);
                        } catch (ArithmeticException a_e) {}
                    default:
                        i26 += (int)Test.instanceCount;
                    }
                    break;
                case 62:
                    Test.iFld = (int)Test.instanceCount;
                    break;
                case 54:
                    Test.fFld -= i20;
                    break;
                case 56:
                    i26 += i22;
                    break;
                }
            }
        }

        FuzzerUtils.out.println("i i17 i18 = " + i + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 i20 by = " + i19 + "," + i20 + "," + by);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("iArr lArr1 = " + FuzzerUtils.checkSum(iArr) + "," + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.dFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.fFld Test.iFld Test.bFld = " + Float.floatToIntBits(Test.fFld) + "," + Test.iFld
            + "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.iFld1 dArrFld = " + Test.iFld1 + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
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
//DEBUG  dMeth ->  dMeth mainTest
//DEBUG  vMeth ->  vMeth dMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth dMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
