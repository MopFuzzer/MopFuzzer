// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:04 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=4979916984197733048L;
    public static double dFld=78.11275;
    public static volatile int iFld=-27558;
    public static float fFld=1.559F;
    public static short sFld=-5866;
    public boolean bFld=false;
    public static byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)27);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static long lMeth(float f) {

        int i2=-243;

        Test.instanceCount += (long)(((long)(f - -156) >> i2) * (-(1.857F + (i2 + i2))));
        long meth_res = Float.floatToIntBits(f) + i2;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i6, int i7, float f2) {

        int i8=-6, i9=-38037;
        double d1=47.75512;
        boolean b=true;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 130L);

        Test.instanceCount = i7;
        i8 = 1;
        while (++i8 < 167) {
            Test.instanceCount += Test.instanceCount;
            f2 += i7;
            i9 = 1;
            while (++i9 < 9) {
                i7 += 83;
                i6 ^= i9;
                i7 /= (int)(i7 | 1);
                i6 = i9;
            }
            switch ((i8 % 6) + 20) {
            case 20:
            case 21:
                i6 = (int)Test.instanceCount;
                d1 *= i7;
                break;
            case 22:
                lArr1[i8 - 1] = Test.instanceCount;
                break;
            case 23:
                i7 += i9;
                if (b) continue;
                break;
            case 24:
                b = b;
                break;
            case 25:
                b = true;
                break;
            }
        }
        vMeth_check_sum += i6 + i7 + Float.floatToIntBits(f2) + i8 + i9 + Double.doubleToLongBits(d1) + (b ? 1 : 0) +
            FuzzerUtils.checkSum(lArr1);
    }

    public static float fMeth(int i3, double d, float f1) {

        int i4=-5, i5=16939, i10=-57131, i11=15099, i12=22134, i13=12, i14=74, i15=-3;
        boolean b1=false;
        byte by1=-101;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -2754435727081275555L);

        i3 >>= (int)(lArr[(i3 >>> 1) % N]--);
        for (i4 = 4; i4 < 336; ++i4) {
            lArr[i4 + 1] = (i5--);
            i3 >>= i3;
            vMeth(i4, i4, f1);
            for (i10 = 1; i10 < 5; i10++) {
                for (i12 = 1; i12 < 2; i12++) {
                    b1 = b1;
                    i5 -= 47535;
                    i11 += -61;
                    f1 += i12;
                }
                Test.instanceCount -= by1;
                for (i14 = 1; i14 < 2; ++i14) {
                    Test.instanceCount += (i14 | Test.instanceCount);
                    i3 <<= i3;
                }
            }
        }
        long meth_res = i3 + Double.doubleToLongBits(d) + Float.floatToIntBits(f1) + i4 + i5 + i10 + i11 + i12 + i13 +
            (b1 ? 1 : 0) + by1 + i14 + i15 + FuzzerUtils.checkSum(lArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vSmallMeth() {

        float f3=2.48F;

        lMeth(fMeth(Test.iFld, -1.126328, f3));
        vSmallMeth_check_sum += Float.floatToIntBits(f3);
    }

    public void mainTest(String[] strArr1) {

        int i=101, i1=-101, i16=-11, i17=-66, i18=-14194, i19=58030, i20=-176, iArr[]=new int[N];
        float f4=-1.600F, fArr[]=new float[N];
        long lArr2[]=new long[N];

        FuzzerUtils.init(iArr, 2027);
        FuzzerUtils.init(lArr2, -6804179202275332359L);
        FuzzerUtils.init(fArr, 2.289F);

        for (byte by : Test.byArrFld) {
            for (i = 3; i < 63; i++) {
                i1 *= (int)(++Test.dFld);
                i1 += (i * i);
                i1 += i;
            }
            for (int smallinvoc=0; smallinvoc<62; smallinvoc++) vSmallMeth();
            iArr[(i >>> 1) % N] *= (int)Test.instanceCount;
            i1 -= (int)Test.dFld;
            iArr[(i >>> 1) % N] = -9;
            i16 = 1;
            while (++i16 < 63) {
                i1 = 53;
                Test.instanceCount += (i16 * i16);
            }
        }
        Test.iFld *= (int)f4;
        Test.fFld -= 113;
        iArr[(i16 >>> 1) % N] = Test.sFld;
        for (i17 = 15; i17 < 273; i17++) {
            Test.iFld += i18;
            Test.iFld = (int)Test.instanceCount;
            i18 += (((i17 * i18) + f4) - i16);
            f4 += (3 + (i17 * i17));
            lArr2 = lArr2;
            for (i19 = 5; i19 < 97; ++i19) {
                i20 -= i18;
                i20 -= (int)Test.dFld;
                if (bFld) break;
                fArr = fArr;
                Test.instanceCount = i16;
            }
            if (bFld) break;
            Test.instanceCount = i17;
            Test.iFld -= 27203;
        }

        FuzzerUtils.out.println("i i1 i16 = " + i + "," + i1 + "," + i16);
        FuzzerUtils.out.println("f4 i17 i18 = " + Float.floatToIntBits(f4) + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 i20 iArr = " + i19 + "," + i20 + "," + FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println("lArr2 fArr = " + FuzzerUtils.checkSum(lArr2) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.iFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(Test.dFld) + "," + Test.iFld);
        FuzzerUtils.out.println("Test.fFld Test.sFld bFld = " + Float.floatToIntBits(Test.fFld) + "," + Test.sFld + ","
            + (bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.byArrFld = " + FuzzerUtils.checkSum(Test.byArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  lMeth ->  lMeth vSmallMeth mainTest Test
//DEBUG  fMeth ->  fMeth vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth fMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
