// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:00 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-215L;
    public int iFld=3;
    public static double dFld=58.46600;
    public static float fFld=-115.730F;
    public short sFld=6213;
    public byte byFld=91;
    public static volatile int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 4);
    }

    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(double d, boolean b, int i7) {

        int i8=-40550, i9=-44226, i10=11, i11=-45785, i12=-49359, i13=-63523, i14=50165;
        double d1=0.34235;
        float f=94.638F;

        for (i8 = 7; i8 < 313; i8 += 3) {
            Test.instanceCount = -38411;
            Test.instanceCount = i7;
        }
        i10 = 1;
        do {
            switch ((((i10 >>> 1) % 4) * 5) + 84) {
            case 104:
                for (i11 = 1; i11 < 6; i11++) {
                    if (b) continue;
                    for (d1 = 1; d1 < 2; d1++) {
                        if (i12 != 0) {
                            vMeth_check_sum += Double.doubleToLongBits(d) + (b ? 1 : 0) + i7 + i8 + i9 + i10 + i11 +
                                i12 + Double.doubleToLongBits(d1) + i13 + Float.floatToIntBits(f) + i14;
                            return;
                        }
                        i7 *= -3;
                    }
                    i13 += (((i11 * i13) + i13) - f);
                    d += 227;
                    Test.dFld -= Test.instanceCount;
                    i7 = -7994;
                }
                break;
            case 86:
                i13 = i14;
                break;
            case 97:
                i9 += i10;
            case 98:
                i12 += i12;
                break;
            }
        } while (++i10 < 296);
        vMeth_check_sum += Double.doubleToLongBits(d) + (b ? 1 : 0) + i7 + i8 + i9 + i10 + i11 + i12 +
            Double.doubleToLongBits(d1) + i13 + Float.floatToIntBits(f) + i14;
    }

    public static long lMeth(int i4, int i5, int i6) {

        boolean b1=false;
        float f1=1.183F;
        int i16=10, i17=5, i18=-154;
        byte by1=-102;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 11.31433);

        vMeth(Test.dFld, b1, 32670);
        for (f1 = 4; f1 < 208; f1++) {
            by1 += (byte)(((f1 * i4) + i16) - f1);
            i6 += (int)f1;
            i6 += (int)((long)f1 ^ i16);
            for (i17 = 1; i17 < 8; ++i17) {
                short s1=-24472;
                i4 = s1;
                switch ((int)(((f1 % 2) * 5) + 26)) {
                case 33:
                    i16 += (i17 ^ s1);
                    break;
                case 35:
                    i4 >>= (int)Test.instanceCount;
                default:
                    i6 -= i18;
                    Test.instanceCount <<= i4;
                }
                i16 += (int)(89.796F + (i17 * i17));
                dArr[i17 - 1] += Test.instanceCount;
                if (i4 != 0) {
                }
            }
        }
        long meth_res = i4 + i5 + i6 + (b1 ? 1 : 0) + Float.floatToIntBits(f1) + i16 + by1 + i17 + i18 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public int iMeth() {

        int i=-4916, i1=13, i2=-45407, i3=-43790;
        short s=13020;
        byte by2=97;

        for (i = 7; 130 > i; i++) {
            for (i2 = 1; i2 < 13; ++i2) {
                byte by=124;
                by = (byte)(-(iFld++));
                Test.instanceCount -= Math.max((s - i2) - lMeth(iFld, i2, iFld), Test.instanceCount);
                Test.fFld = s;
                Test.instanceCount = Test.instanceCount;
            }
        }
        i1 -= (int)Test.instanceCount;
        i3 = (int)Test.instanceCount;
        Test.iArrFld[(i1 >>> 1) % N] *= (int)Test.instanceCount;
        s = (short)Test.instanceCount;
        Test.instanceCount >>>= Test.instanceCount;
        by2 *= (byte)s;
        iFld = i1;
        Test.instanceCount = 3132910942L;
        i3 = (int)Test.instanceCount;
        long meth_res = i + i1 + i2 + i3 + s + by2;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d2=-29.101446;
        int i19=-2, i20=202, i21=16696, i22=-64650, i23=-51435, i24=-10;
        boolean b2=false;

        iFld *= Math.min(-93 + (++iFld), iFld++);
        Test.dFld -= ((iFld + iMeth()) - iFld);
        sFld += (short)19L;
        iFld >>= iFld;
        Test.instanceCount = Test.instanceCount;
        for (d2 = 1; d2 < 273; ++d2) {
            i20 = 92;
            while ((i20 -= 3) > 0) {
                iFld = -13;
                i21 = 1;
                while (++i21 < 3) {
                    i19 = iFld;
                }
                i19 += (i20 * i20);
                b2 = b2;
                i22 = 1;
                while (++i22 < 3) {
                    iFld -= (int)Test.dFld;
                    b2 = b2;
                    Test.dFld = 14694;
                    iFld = i22;
                    Test.instanceCount |= i22;
                }
                Test.iArrFld[i20 + 1] += (int)Test.instanceCount;
                Test.dFld *= i21;
                Test.instanceCount += (i20 * i20);
            }
            i19 >>= 54;
            Test.instanceCount >>= iFld;
            Test.fFld += (float)d2;
            for (i23 = 4; i23 < 92; i23++) {
                Test.instanceCount += sFld;
                iFld = (int)Test.instanceCount;
                Test.dFld += i19;
                i24 -= (int)Test.instanceCount;
                i24 = byFld;
            }
        }

        FuzzerUtils.out.println("d2 i19 i20 = " + Double.doubleToLongBits(d2) + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 b2 i22 = " + i21 + "," + (b2 ? 1 : 0) + "," + i22);
        FuzzerUtils.out.println("i23 i24 = " + i23 + "," + i24);

        FuzzerUtils.out.println("Test.instanceCount iFld Test.dFld = " + Test.instanceCount + "," + iFld + "," +
            Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.fFld sFld byFld = " + Float.floatToIntBits(Test.fFld) + "," + sFld + "," + byFld);
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth iMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
