// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:16 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=119L;
    public byte byFld=104;
    public static short sFld=28803;
    public static float fFld=-2.822F;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -42401);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i7) {

        int i8=12413, i9=-7, i11=11, i12=52930, i13=6063, i14=12, i15=129;
        boolean b=false;
        float f2=-19.710F, f3=10.988F;

        for (i8 = 17; i8 < 381; ++i8) {
            for (i11 = 5; i11 > 1; --i11) {
                double d1=-1.93947;
                Test.instanceCount = (long)d1;
                i13 = 1;
                do {
                    b = b;
                    i7 *= (int)3556518661196358732L;
                    Test.instanceCount -= i13;
                    f2 += (i13 - i11);
                    f3 = i13;
                    i9 -= -13;
                } while (++i13 < 2);
            }
            f2 -= f2;
            for (i14 = 5; i14 > 1; i14 -= 3) {
                Test.instanceCount = i12;
                i15 += (-84 + (i14 * i14));
                i9 = 1;
            }
        }
        vMeth1_check_sum += i7 + i8 + i9 + i11 + i12 + i13 + (b ? 1 : 0) + Float.floatToIntBits(f2) +
            Float.floatToIntBits(f3) + i14 + i15;
    }

    public static void vMeth(int i6) {

        int i16=-14508, i17=12, i18=-114, i19=7634;
        float f4=33.209F;
        boolean b1=true;

        vMeth1(i6);
        try {
            Test.instanceCount >>= Test.sFld;
            i6 += i6;
        }
        catch (ArithmeticException exc1) {
            for (i16 = 10; i16 < 381; i16++) {
                Test.instanceCount -= i16;
                Test.instanceCount = 21690;
                Test.iArrFld = Test.iArrFld;
            }
        }
        for (i18 = 8; i18 < 144; i18++) {
            i6 = (int)f4;
            i6 <<= i18;
            if (b1) {
                i19 += i18;
                Test.sFld += (short)i18;
                i6 += (int)Test.instanceCount;
            }
        }
        vMeth_check_sum += i6 + i16 + i17 + i18 + i19 + Float.floatToIntBits(f4) + (b1 ? 1 : 0);
    }

    public static int iMeth(int i2) {

        int i3=7, i4=-1, i20=-56, i21=227, i22=-1934;
        boolean b2=true;
        byte by=-107;
        long lArr[]=new long[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(lArr, 3301188831L);
        FuzzerUtils.init(fArr, 0.691F);

        for (i3 = 8; i3 < 130; ++i3) {
            float f1=74.57F;
            f1 -= (((i2 * Test.instanceCount) * i2) + (lArr[i3 + 1] = Math.abs(i2)));
            vMeth(i4);
            i20 = 1;
            do {
                i2 <<= i3;
                for (i21 = 1; i21 < 1; ++i21) {
                    i4 = Test.sFld;
                    if (b2) {
                        Test.instanceCount <<= i20;
                    }
                    i22 ^= by;
                    try {
                        i2 = (i22 % i22);
                        i4 = (i22 % -245);
                        Test.iArrFld[i21 - 1] = (40031 % Test.iArrFld[i20]);
                    } catch (ArithmeticException a_e) {}
                }
            } while (++i20 < 13);
            fArr[i3 - 1] = Test.instanceCount;
            f1 -= 43641;
            i22 += (i3 - Test.instanceCount);
            Test.iArrFld[i3] = (int)Test.instanceCount;
        }
        long meth_res = i2 + i3 + i4 + i20 + i21 + i22 + (b2 ? 1 : 0) + by + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f=-81.259F, fArr1[]=new float[N];
        int i=-126, i23=-48260, i24=10, i26=157, i27=0, i28=8;
        double d=0.96490;
        short sArr[]=new short[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(sArr, (short)17429);
        FuzzerUtils.init(lArr1, -2585186410L);
        FuzzerUtils.init(fArr1, 0.595F);

        for (f = 10; 167 > f; ++f) {
            Test.instanceCount += (long)(f * f);
            d += Long.reverseBytes(i + (--i));
            i -= (int)(((i * d) * (i + 120)) + ((i - byFld) - (i + f)));
            d = (-byFld);
            i = iMeth(i);
        }
        for (i23 = 7; i23 < 376; ++i23) {
            i24 *= i23;
            Test.iArrFld[i23] = 0;
            Test.fFld *= i;
            i26 = 68;
            do {
                sArr[i23 + 1] >>= (short)Test.instanceCount;
                for (i27 = i23; i27 < 1; ++i27) {
                    lArr1[i26 - 1] >>= i27;
                    i ^= (int)2285610576L;
                    lArr1 = lArr1;
                    sArr[i26 - 1] += (short)-53;
                    i *= (int)Test.instanceCount;
                }
            } while (--i26 > 0);
            byFld &= (byte)Test.instanceCount;
            i24 += (int)Test.instanceCount;
            i = i26;
        }
        Test.iArrFld[(i27 >>> 1) % N] -= i26;
        for (int i29 : Test.iArrFld) {
            Test.instanceCount >>= i23;
            i24 -= 36395;
            i28 = 47317;
            switch ((((i24 >>> 1) % 6) * 5) + 54) {
            case 58:
                fArr1[(i28 >>> 1) % N] = Test.instanceCount;
                Test.instanceCount = i23;
                Test.iArrFld[(-8 >>> 1) % N] += (int)Test.instanceCount;
            case 84:
                byFld >>= (byte)i29;
                break;
            case 55:
                Test.iArrFld = Test.iArrFld;
                break;
            case 80:
                i = i24;
            case 83:
                Test.fFld = i28;
                break;
            case 69:
                i29 -= (int)Test.instanceCount;
            }
        }

        FuzzerUtils.out.println("f i d = " + Float.floatToIntBits(f) + "," + i + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("i23 i24 i26 = " + i23 + "," + i24 + "," + i26);
        FuzzerUtils.out.println("i27 i28 sArr = " + i27 + "," + i28 + "," + FuzzerUtils.checkSum(sArr));
        FuzzerUtils.out.println("lArr1 fArr1 = " + FuzzerUtils.checkSum(lArr1) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));

        FuzzerUtils.out.println("Test.instanceCount byFld Test.sFld = " + Test.instanceCount + "," + byFld + "," +
            Test.sFld);
        FuzzerUtils.out.println("Test.fFld Test.iArrFld = " + Float.floatToIntBits(Test.fFld) + "," +
            FuzzerUtils.checkSum(Test.iArrFld));

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
