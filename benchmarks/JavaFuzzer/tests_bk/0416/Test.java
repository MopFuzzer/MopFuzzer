// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:03 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-4L;
    public static int iFld=-55103;
    public static short sFld=8387;
    public boolean bFld=true;
    public static long lArrFld[]=new long[N];
    public static volatile short sArrFld[]=new short[N];
    public int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 21636L);
        FuzzerUtils.init(Test.sArrFld, (short)4413);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1() {

        int i2=-24067, i3=-12, i4=41728, i5=234, i6=14, iArr1[]=new int[N];
        float f1=0.444F, fArr[]=new float[N];
        boolean b=true;
        double d=-1.35373;

        FuzzerUtils.init(iArr1, -190);
        FuzzerUtils.init(fArr, -1.764F);

        for (i2 = 3; i2 < 148; i2++) {
            Test.sArrFld[i2 + 1] -= (short)i2;
            f1 -= i3;
            if (b) continue;
            switch (((i2 % 10) * 5) + 73) {
            case 101:
                Test.instanceCount = i3;
                break;
            case 99:
                Test.instanceCount = -1;
                for (i4 = 1; 11 > i4; ++i4) {
                    Test.instanceCount >>= i4;
                    i5 += (((i4 * Test.instanceCount) + Test.instanceCount) - Test.instanceCount);
                    iArr1[i2 + 1] = (int)Test.instanceCount;
                    i6 = 1;
                    while (++i6 < 2) {
                        fArr = fArr;
                        d *= i3;
                        i5 += (((i6 * i2) + i3) - f1);
                    }
                }
                break;
            case 97:
                iArr1[i2] *= i5;
                break;
            case 74:
                iArr1[i2 + 1] = i2;
                break;
            case 118:
                i3 = i5;
                break;
            case 87:
                i5 >>>= i3;
                break;
            case 94:
                iArr1[i2] -= 4;
                break;
            case 98:
                i5 *= (int)Test.instanceCount;
                break;
            case 96:
            case 108:
                i5 += (int)Test.instanceCount;
                break;
            }
        }
        long meth_res = i2 + i3 + Float.floatToIntBits(f1) + (b ? 1 : 0) + i4 + i5 + i6 + Double.doubleToLongBits(d) +
            FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i1, byte by, float f) {

        int i7=-96, i8=14, i9=130, i10=-6, i11=-17, iArr2[]=new int[N];
        double d1=0.74625;
        boolean b1=true;

        FuzzerUtils.init(iArr2, -13);

        Test.lArrFld[(i1 >>> 1) % N] = Math.max(-12524 - (13 - (i1 - -33178)), (5 - iMeth1()) + i1);
        i7 = 1;
        while (++i7 < 323) {
            for (i8 = 1; i8 < 5; ++i8) {
                if (b1) {
                    d1 = 0;
                    iArr2[i8 - 1] |= i9;
                }
                i1 += (int)f;
            }
            iArr2[i7] = i7;
            for (i10 = 1; 5 > i10; i10 += 3) {
                i11 += (i10 + Test.instanceCount);
            }
            Test.instanceCount += Test.iFld;
        }
        Test.instanceCount -= i11;
        i11 = (int)f;
        f += i11;
        i1 -= i1;
        long meth_res = i1 + by + Float.floatToIntBits(f) + i7 + i8 + i9 + Double.doubleToLongBits(d1) + (b1 ? 1 : 0) +
            i10 + i11 + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth(long l) {

        float f2=0.307F;
        int i12=26857, i13=-5, i14=-135, i15=-60089, i16=-166, i17=-10;
        double d2=1.26623;

        iMeth(-139, (byte)(2), f2);
        for (i12 = 19; i12 < 364; i12++) {
            f2 += (i12 * i12);
            i13 += -25608;
            iArrFld[i12 + 1] >>= i12;
            i13 -= -8;
            if (true) {
                f2 -= i12;
                i13 >>= i13;
            } else {
                for (i14 = 1; 5 > i14; ++i14) {
                    Test.sFld += (short)(42 + (i14 * i14));
                    try {
                        i13 = (i13 % -227);
                        i15 = (i13 / -205);
                        iArrFld[i12 + 1] = (i15 % i13);
                    } catch (ArithmeticException a_e) {}
                    for (i16 = 2; i16 > 1; i16 -= 3) {
                        i15 += (int)d2;
                        Test.instanceCount += (((i16 * i12) + i17) - i16);
                    }
                }
            }
        }
        vMeth_check_sum += l + Float.floatToIntBits(f2) + i12 + i13 + i14 + i15 + i16 + i17 +
            Double.doubleToLongBits(d2);
    }

    public void mainTest(String[] strArr1) {

        int i=-4, i18=-27601, i19=-8, i20=1, i21=-28892, i22=47838, i23=18773, i24=213, i26=-120, i27=8, i28=5, i29=9,
            i30=-4, iArr[]=new int[N];
        float f3=2.46F, fArr1[]=new float[N];
        double d3=0.130461;
        byte by1=102;

        FuzzerUtils.init(iArr, 3);
        FuzzerUtils.init(fArr1, 0.274F);

        i -= (int)((iArr[(i >>> 1) % N] % ((i - i) | 1)) - (Test.instanceCount * i));
        vMeth(-32870L);
        Test.lArrFld[(i >>> 1) % N] *= i;
        for (i18 = 15; i18 < 260; i18++) {
            if (bFld) break;
            i = (int)1.361F;
            i <<= i;
            i19 >>>= i18;
            i = i18;
            i20 = 1;
            while (++i20 < 103) {
                Test.iFld -= (int)f3;
                for (i21 = 1; i21 < 1; ++i21) {
                    bFld = bFld;
                    Test.instanceCount = -24803;
                    i22 = i22;
                    Test.instanceCount += i21;
                    fArr1[i21] -= i;
                    d3 = Test.instanceCount;
                    try {
                        i22 = (i19 % -833323981);
                        i22 = (i21 % 503256350);
                        i22 = (i % 227);
                    } catch (ArithmeticException a_e) {}
                    i22 += (-217 + (i21 * i21));
                    by1 += (byte)i21;
                }
            }
        }
        for (i23 = 5; i23 < 217; i23++) {
            switch (((i23 % 9) * 5) + 78) {
            case 102:
                for (i26 = 2; i26 < 118; ++i26) {
                    if (bFld) {
                        Test.iFld = i24;
                        for (i28 = 1; i28 < 2; i28++) {
                            i22 = i24;
                            Test.lArrFld[i28] *= (long)94.128813;
                        }
                    }
                    iArr[i26 - 1] -= i22;
                }
                break;
            case 111:
                iArr[i23 + 1] -= i24;
            case 92:
                bFld = bFld;
                break;
            case 98:
                try {
                    i30 = (i26 / 15713);
                    i27 = (54188 % iArr[i23 - 1]);
                    i = (-159 / i22);
                } catch (ArithmeticException a_e) {}
                break;
            case 96:
                i22 = i28;
                break;
            case 94:
                i30 <<= i28;
            case 105:
                iArr = iArr;
                break;
            case 101:
                Test.instanceCount = 14;
                break;
            case 115:
                Test.sFld += (short)i26;
                break;
            default:
                i19 *= (int)Test.instanceCount;
            }
        }

        FuzzerUtils.out.println("i i18 i19 = " + i + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 f3 i21 = " + i20 + "," + Float.floatToIntBits(f3) + "," + i21);
        FuzzerUtils.out.println("i22 d3 by1 = " + i22 + "," + Double.doubleToLongBits(d3) + "," + by1);
        FuzzerUtils.out.println("i23 i24 i26 = " + i23 + "," + i24 + "," + i26);
        FuzzerUtils.out.println("i27 i28 i29 = " + i27 + "," + i28 + "," + i29);
        FuzzerUtils.out.println("i30 iArr fArr1 = " + i30 + "," + FuzzerUtils.checkSum(iArr) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.sFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Test.sFld);
        FuzzerUtils.out.println("bFld Test.lArrFld Test.sArrFld = " + (bFld ? 1 : 0) + "," +
            FuzzerUtils.checkSum(Test.lArrFld) + "," + FuzzerUtils.checkSum(Test.sArrFld));
        FuzzerUtils.out.println("iArrFld = " + FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
