// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:04 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=112L;
    public boolean bFld=true;
    public int iFld=7750;
    public static int iFld1=57195;
    public double dFld=-54.73512;
    public short sFld=-14324;
    public int iFld2=0;
    public byte byArrFld[][]=new byte[N][N];
    public static float fArrFld[]=new float[N];
    public static int iArrFld[]=new int[N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 57.155F);
        FuzzerUtils.init(Test.iArrFld, 5);
        FuzzerUtils.init(Test.dArrFld, 1.61958);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {


        Test.instanceCount >>= Test.iFld1;
        vMeth1_check_sum += 0;
    }

    public static int iMeth(int i, double d, int i1) {

        float f=-104.50F;
        short s=10747;
        int i2=11, i3=-61194, i4=-155, i5=-71, i6=-188, i7=-12, i8=-42, iArr[]=new int[N];
        boolean b=true;
        byte by=-9;

        FuzzerUtils.init(iArr, 3818);

        f = (((4356 - i1) - i) - ((++i) + Math.abs(i1)));
        vMeth1();
        Test.iFld1 = 77;
        iArr[(i1 >>> 1) % N] = (int)f;
        s *= (short)i1;
        i2 = 221;
        while (--i2 > 0) {
            for (i3 = 1; i3 < 7; i3++) {
                i4 += (i3 + f);
                b = b;
            }
            Test.iFld1 >>= -14163;
            by += (byte)(i2 + Test.instanceCount);
            for (i5 = 1; 7 > i5; i5++) {
                for (i7 = 1; i7 < 2; i7++) {
                    Test.fArrFld[i5 - 1] -= Test.instanceCount;
                    Test.instanceCount = by;
                }
            }
        }
        long meth_res = i + Double.doubleToLongBits(d) + i1 + Float.floatToIntBits(f) + s + i2 + i3 + i4 + (b ? 1 : 0)
            + by + i5 + i6 + i7 + i8 + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth() {

        int i10=-7, i11=-6, i12=-12, i13=-18388, i14=-124;
        double d1=0.124936;

        bFld = false;
        iFld *= (-(byArrFld[(iFld >>> 1) % N][(iFld >>> 1) % N] -= (byte)iMeth(-63, dFld, iFld)));
        iFld -= iFld;
        for (int i9 : Test.iArrFld) {
            Test.iArrFld[(iFld >>> 1) % N] <<= Test.iFld1;
            i10 = 1;
            do {
                try {
                    i9 = (29852 % Test.iArrFld[i10]);
                    Test.iFld1 = (i11 % -252);
                    Test.iArrFld[i10 + 1] = (i11 % i10);
                } catch (ArithmeticException a_e) {}
                if (bFld) {
                    for (i12 = 1; i12 < 1; i12++) {
                        Test.iArrFld[i10 - 1] *= i9;
                        Test.instanceCount = i9;
                        Test.instanceCount = i12;
                    }
                } else {
                    for (d1 = 1; d1 < 1; ++d1) {
                        i13 += (int)d1;
                        Test.fArrFld[i10 - 1] = Test.instanceCount;
                    }
                }
            } while (++i10 < 4);
        }
        vMeth_check_sum += i10 + i11 + i12 + i13 + Double.doubleToLongBits(d1) + i14;
    }

    public void mainTest(String[] strArr1) {

        int i15=12, i16=107, i17=239, i18=21607, i19=-52, i20=7, i21=38500;
        byte by1=123;
        float f1=-41.136F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -7L);

        vMeth();
        i15 = 280;
        while ((i15 -= 3) > 0) {
            lArr[i15 + 1] -= 14;
            sFld += (short)Test.iFld1;
            switch (((i15 % 10) * 5) + 37) {
            case 82:
                for (i16 = 266; i16 > 4; i16--) {
                    try {
                        i17 = (Test.iArrFld[i16] % 183);
                        iFld = (i16 / 32);
                        Test.iArrFld[i15 + 1] = (Test.iArrFld[i15 - 1] / -51);
                    } catch (ArithmeticException a_e) {}
                    Test.iFld1 = Test.iFld1;
                    i17 -= (int)dFld;
                    i17 = (int)dFld;
                    bFld = bFld;
                    i17 >>= i17;
                    iFld = iFld;
                    switch ((((-7992 >>> 1) % 2) * 5) + 29) {
                    case 36:
                    case 33:
                        i17 *= (int)dFld;
                        break;
                    }
                    Test.fArrFld[i16 + 1] -= Test.iFld1;
                    Test.instanceCount = 7;
                }
                break;
            case 86:
                by1 >>= (byte)Test.iFld1;
                Test.iFld1 = i17;
                iFld2 -= (int)f1;
                for (i18 = 266; 9 < i18; i18 -= 3) {
                    for (i20 = 1; i20 < 4; i20++) {
                        i17 >>= 12;
                    }
                    i17 *= (int)25.633F;
                    switch (((i15 % 10) * 5) + 92) {
                    case 113:
                        switch ((i18 % 1) + 81) {
                        case 81:
                            Test.instanceCount += i20;
                            i17 >>= i16;
                            Test.instanceCount -= 149;
                            f1 *= iFld;
                            break;
                        default:
                            dFld += -1.726F;
                        }
                        break;
                    case 120:
                        try {
                            i17 = (Test.iArrFld[i18] % iFld);
                            i21 = (i19 % Test.iArrFld[i15]);
                            Test.iArrFld[i15] = (i19 % 2);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 141:
                        bFld = false;
                        break;
                    case 121:
                        Test.instanceCount = iFld;
                        break;
                    case 97:
                        f1 = f1;
                    case 126:
                        f1 += -125;
                        break;
                    case 142:
                        i19 += (0 + (i18 * i18));
                        break;
                    case 139:
                        iFld ^= i16;
                        break;
                    case 105:
                        i19 -= i16;
                        break;
                    case 98:
                        by1 = (byte)iFld2;
                        break;
                    }
                }
                break;
            case 58:
                dFld += i21;
                break;
            case 52:
                iFld = Test.iFld1;
                break;
            case 39:
                dFld = Test.instanceCount;
            case 42:
                Test.dArrFld[i15 - 1] *= Test.instanceCount;
                break;
            case 83:
                i21 = (int)-998460321L;
            case 85:
                iFld2 >>= -234;
            case 54:
                f1 -= 71.45F;
            case 60:
                Test.iFld1 += i15;
                break;
            default:
                iFld2 += i18;
            }
        }

        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("by1 f1 i18 = " + by1 + "," + Float.floatToIntBits(f1) + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("lArr = " + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test.instanceCount bFld iFld = " + Test.instanceCount + "," + (bFld ? 1 : 0) + "," +
            iFld);
        FuzzerUtils.out.println("Test.iFld1 dFld sFld = " + Test.iFld1 + "," + Double.doubleToLongBits(dFld) + "," +
            sFld);
        FuzzerUtils.out.println("iFld2 byArrFld Test.fArrFld = " + iFld2 + "," + FuzzerUtils.checkSum(byArrFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));
        FuzzerUtils.out.println("Test.iArrFld Test.dArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
