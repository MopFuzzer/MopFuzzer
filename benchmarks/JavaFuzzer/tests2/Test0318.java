// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:26 2023
public class Test0318 {

    public static final int N = 400;

    public static long instanceCount=-39812L;
    public static boolean bFld=true;
    public static double dFld=-1.97181;
    public static volatile float fFld=0.506F;
    public static short sFld=32470;
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0318.iArrFld, 0);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i5=-5, i6=-2, i7=5, i8=-51603, i9=-61597;
        byte by1=-126;
        double d2=90.42292;
        double[][] dArr =new double[N][N];
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -440559205L);
        FuzzerUtils.init(dArr, 1.80675);

        for (i5 = 1; 241 > i5; ++i5) {
            i6 *= (int)1.13422;
            i6 = i5;
        }
        i7 = 1;
        while (++i7 < 272) {
            Test0318.iArrFld[i7 - 1] += i5;
            for (i8 = 1; i8 < 6; ++i8) {
                Test0318.instanceCount += i8;
                by1 >>= (byte)i8;
                by1 ^= (byte)0L;
                dArr[i7 - 1][i8 + 1] += d2;
                Test0318.iArrFld[i7] *= i8;
                switch (((i7 % 2) * 5) + 67) {
                case 73:
                    if (Test0318.bFld) continue;
                    i9 -= i8;
                    break;
                case 70:
                    i9 *= i8;
                    break;
                }
            }
        }
        vMeth1_check_sum += i5 + i6 + i7 + i8 + i9 + by1 + Double.doubleToLongBits(d2) + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth(float f, int i4, byte by) {

        int i10=-88, i11=-185, i12=18395, i13=36;
        float f1=0.876F;
        short s1=-28873;

        vMeth1();
        i10 <<= i4;
        Test0318.iArrFld[(1 >>> 1) % N] = i4;
        by = (byte)29033;
        if (Test0318.bFld) {
            i4 %= (int)(i10 | 1);
            for (i11 = 189; i11 > 1; i11--) {
                f1 = 1;
                do {
                    i12 += (int)f1;
                    Test0318.dFld -= 191;
                    i4 = s1;
                    Test0318.instanceCount = i12;
                    f *= Test0318.instanceCount;
                    i4 = i13;
                    Test0318.bFld = Test0318.bFld;
                } while (++f1 < 8);
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f) + i4 + by + i10 + i11 + i12 + Float.floatToIntBits(f1) + s1 + i13;
    }

    public static void vSmallMeth(short s, long l, boolean b) {

        int i3=-156;
        double d1=81.22626;
        byte by2=75;

        i3 *= (int)d1;
        vMeth(Test0318.fFld, i3, by2);
        vSmallMeth_check_sum += s + l + (b ? 1 : 0) + i3 + Double.doubleToLongBits(d1) + by2;
    }

    public void mainTest(String[] strArr1) {

        int i=49292;
        int i1=-9;
        int i2=-11;
        int i14=-25465;
        int i15=-175;
        int i16=57;
        int i17=-15328;
        int i18=12;
        int i19=25471;
        int[] iArr =new int[N];
        double d=-75.46121;
        float f2=-40.113F;
        byte by3=-76;
        long[] lArr1 =new long[N];
        short[] sArr =new short[N];

        FuzzerUtils.init(iArr, -78);
        FuzzerUtils.init(lArr1, 4816024610004171444L);
        FuzzerUtils.init(sArr, (short)-10382);

        i = 1;
        do {
            i1 = 111;
            while (--i1 > 0) {
                iArr[i1 - 1] <<= (++i2);
                i2 += (i1 ^ i2);
                d = i1;
            }
            for (int smallinvoc = 0; smallinvoc < 62; smallinvoc++)
                vSmallMeth(Test0318.sFld, Test0318.instanceCount, Test0318.bFld);
            i2 ^= i1;
            Test0318.fFld *= f2;
            i2 += i;
            i2 -= i;
            f2 = -65117;
            Test0318.iArrFld[i - 1] -= (int) -2.121570;
            Test0318.instanceCount = 3799725932L;
            for (i14 = 6; i14 < 111; ++i14) {
                for (i16 = 2; i16 > 1; i16--) {
                    i17 += (((i16 * i17) + i14) - i);
                    i2 <<= (int) Test0318.instanceCount;
                    i15 >>>= (int) Test0318.instanceCount;
                    lArr1[i14 - 1] = 59221;
                    if (Test0318.bFld) {
                        Test0318.sFld <<= (short) i16;
                    } else if (Test0318.bFld) {
                        i17 += (i16 * i16);
                    } else if (Test0318.bFld) {
                        Test0318.iArrFld[i + 1] += i14;
                        Test0318.iArrFld[i16] <<= i16;
                        lArr1[i - 1] = -53525;
                    }
                }
                iArr = iArr;
                sArr[i + 1] += (short)i14;
                for (i18 = i; i18 < 2; ++i18) {
                    by3 = (byte)-50275;
                    i15 += (i18 - Test0318.instanceCount);
                }
            }
        } while (++i < 226);

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("d f2 i14 = " + Double.doubleToLongBits(d) + "," + Float.floatToIntBits(f2) + "," +
            i14);
        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 i19 by3 = " + i18 + "," + i19 + "," + by3);
        FuzzerUtils.out.println("iArr lArr1 sArr = " + FuzzerUtils.checkSum(iArr) + "," + FuzzerUtils.checkSum(lArr1) +
            "," + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test0318.instanceCount Test0318.bFld Test0318.dFld = " + Test0318.instanceCount + "," + (Test0318.bFld ? 1
                : 0) + "," + Double.doubleToLongBits(Test0318.dFld));
        FuzzerUtils.out.println("Test0318.fFld Test0318.sFld Test0318.iArrFld = " + Float.floatToIntBits(Test0318.fFld) + "," +
                Test0318.sFld + "," + FuzzerUtils.checkSum(Test0318.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0318 _instance = new Test0318();
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
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  vMeth1 ->  vMeth1 vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
