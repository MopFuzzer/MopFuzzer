// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:04 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=22250L;
    public static boolean bFld=true;
    public static volatile byte byFld=-34;
    public static int iFld=-85;
    public static short sFld=23571;
    public int iArrFld[]=new int[N];

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(int i4) {

        int i5=-56501, i6=55331, i7=-19574, iArr[]=new int[N];

        FuzzerUtils.init(iArr, -19760);

        for (i5 = 189; i5 > 1; i5 -= 3) {
            i4 -= i6;
            Test.instanceCount -= i4;
            if (Test.bFld) {
                i7 = 1;
                do {
                    i6 -= i6;
                    iArr[i7] -= i7;
                    i4 = i7;
                    i6 ^= i6;
                    i4 <<= (int)Test.instanceCount;
                    if (Test.bFld) {
                        Test.instanceCount ^= 12L;
                        if (Test.bFld) break;
                        Test.byFld ^= (byte)Test.instanceCount;
                    } else {
                        Test.instanceCount *= i6;
                    }
                } while (++i7 < 25);
            }
        }
        long meth_res = i4 + i5 + i6 + i7 + FuzzerUtils.checkSum(iArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth(long l, int i3) {

        int i8=-5, i9=18349, i10=-2, iArr1[]=new int[N];
        short s1=-2521;
        double d1=93.1528;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr1, -53184);
        FuzzerUtils.init(lArr1, 263598075L);

        i3 = (int)fMeth(i3);
        for (i8 = 2; i8 < 257; i8++) {
            i3 -= (int)-5L;
            l += (((i8 * i8) + i3) - i8);
            s1 += (short)Test.instanceCount;
            iArr1[i8] = (int)l;
            try {
                i9 = (i9 % 33);
                i3 = (-954720264 / i8);
                iArr1[i8] = (-165 % i8);
            } catch (ArithmeticException a_e) {}
            lArr1[i8 - 1] -= i9;
            i10 = 6;
            while (--i10 > 0) {
                l = (long)d1;
                if (Test.bFld) {
                    i9 >>= i3;
                    i9 += (i10 + i9);
                    i9 = i8;
                    i3 *= i3;
                }
            }
        }
        vMeth_check_sum += l + i3 + i8 + i9 + s1 + i10 + Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(lArr1);
    }

    public static int iMeth(double d) {

        int i11=-3, i12=35153, i13=11, i14=-96, iArr2[]=new int[N];

        FuzzerUtils.init(iArr2, -11);

        vMeth(Test.instanceCount, Test.iFld);
        for (i11 = 11; 220 > i11; i11++) {
            for (i13 = 1; 8 > i13; i13 += 3) {
                i12 <<= (int)Test.instanceCount;
                Test.iFld |= Test.byFld;
                Test.sFld <<= (short)i12;
                iArr2[i13 + 1] = i12;
                iArr2[i11 + 1] = Test.iFld;
            }
            i14 -= i13;
            iArr2[i11 + 1] = (int)1.63F;
            Test.iFld = (int)Test.instanceCount;
            i12 += (i11 | i14);
            Test.instanceCount &= 705835093L;
            i14 *= Test.iFld;
        }
        i12 -= i11;
        long meth_res = Double.doubleToLongBits(d) + i11 + i12 + i13 + i14 + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr3) {

        int i1=107, i2=40, i15=1, i16=28, i17=-5, i18=206, i19=-17246, i20=10534, i21=-34636;
        byte byArr[]=new byte[N];
        long lArr2[]=new long[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(byArr, (byte)-37);
        FuzzerUtils.init(lArr2, 0L);
        FuzzerUtils.init(fArr, 105.808F);

        for (i1 = 11; 237 > i1; ++i1) {
            double d2=0.124434;
            i2 = ((iArrFld[i1]--) + (iMeth(d2) + Test.iFld));
            if (Test.bFld) break;
        }
        for (i15 = 9; i15 < 335; i15++) {
            for (i17 = 1; i17 < 77; i17++) {
                iArrFld = iArrFld;
                for (i19 = 1; i19 < 2; ++i19) {
                    Test.instanceCount >>= i15;
                }
                Test.instanceCount *= i17;
                byArr[i15 + 1] += (byte)-1688925723L;
                switch ((i17 % 2) + 76) {
                case 76:
                    i21 = 1;
                    do {
                        Test.instanceCount += Test.byFld;
                        i2 = i15;
                        Test.sFld = (short)38561;
                        Test.instanceCount -= -57177L;
                        i18 = 88;
                        Test.instanceCount <<= i1;
                        Test.iFld = (int)Test.instanceCount;
                        lArr2[i17] = Test.instanceCount;
                        i2 *= (int)Test.instanceCount;
                    } while (++i21 < 2);
                    iArrFld[i15] >>= (int)Test.instanceCount;
                    Test.bFld = Test.bFld;
                    try {
                        i18 = (-159 % iArrFld[i15 - 1]);
                        i2 = (Test.iFld / i17);
                        i2 = (-155 % i20);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 77:
                    fArr[i15 - 1] += Test.instanceCount;
                    i18 = (int)0L;
                    Test.instanceCount += (i17 ^ i16);
                    iArrFld[i17 + 1] -= i17;
                    break;
                default:
                    i2 = i17;
                    i18 >>= (int)Test.instanceCount;
                }
            }
        }

        FuzzerUtils.out.println("i1 i2 i15 = " + i1 + "," + i2 + "," + i15);
        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("byArr lArr2 fArr = " + FuzzerUtils.checkSum(byArr) + "," + FuzzerUtils.checkSum(lArr2)
            + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.byFld = " + Test.instanceCount + "," + (Test.bFld ?
            1 : 0) + "," + Test.byFld);
        FuzzerUtils.out.println("Test.iFld Test.sFld iArrFld = " + Test.iFld + "," + Test.sFld + "," +
            FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr2) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr2);
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
//DEBUG  fMeth ->  fMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
