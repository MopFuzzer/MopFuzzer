// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:17 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-3775034303L;
    public static volatile short sFld=-22045;
    public static volatile float fFld=0.364F;
    public int iFld=-4;
    public double dFld=2.1047;
    public static long lArrFld[][]=new long[N][N];

    static {
        FuzzerUtils.init(Test.lArrFld, 1809421595448547000L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i1) {

        int i2=47965, i3=-49940, i4=-17234, i5=-40402, i6=31629, i7=-14751, iArr[]=new int[N];
        boolean b=false, bArr[]=new boolean[N];
        float f=123.416F;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(iArr, -160);
        FuzzerUtils.init(lArr, 85L);
        FuzzerUtils.init(bArr, false);

        i1 = i1;
        for (i2 = 297; i2 > 18; --i2) {
            for (i4 = 1; i4 < 6; ++i4) {
                i1 = (int)-2306760652L;
            }
            i3 *= i1;
            for (i6 = i2; i6 < 6; i6++) {
                iArr = iArr;
                lArr[i6][i2] -= i7;
                bArr[i6] = false;
                i1 += i6;
                i3 += (i6 * i6);
                bArr[i2 + 1] = b;
                i3 = i7;
                i1 = (int)f;
                Test.instanceCount = (long)f;
            }
        }
        vMeth2_check_sum += i1 + i2 + i3 + i4 + i5 + i6 + i7 + (b ? 1 : 0) + Float.floatToIntBits(f) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(bArr);
    }

    public static void vMeth1() {

        int i8=-8;

        vMeth2(i8);
        i8 = i8;
        i8 += (int)Test.instanceCount;
        i8 *= i8;
        i8 <<= i8;
        vMeth1_check_sum += i8;
    }

    public static void vMeth() {

        int i9=-63337, i10=-17, i11=-130, i12=245, i13=-44, iArr1[]=new int[N];
        float f1=43.830F;
        short s=16849;

        FuzzerUtils.init(iArr1, -15528);

        vMeth1();
        for (i9 = 2; i9 < 130; i9++) {
            Test.instanceCount = i9;
            i10 -= (int)f1;
            for (i11 = 1; i11 < 12; i11++) {
                s = (short)62.336F;
                i12 *= i9;
                i12 = -1;
                iArr1[i11 - 1] = -4835;
                i13 = 2;
                while (--i13 > 0) {
                    i10 += i12;
                    i10 = (int)f1;
                }
                Test.instanceCount |= i9;
                iArr1[i11] -= i11;
                i10 %= -3;
            }
        }
        vMeth_check_sum += i9 + i10 + Float.floatToIntBits(f1) + i11 + i12 + s + i13 + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=51, i14=1, i15=-5, i16=41926, i17=-838, i18=-49, i19=0;
        double d=5.27608;
        float f2=-58.276F;
        boolean b1=false;

        i = (int)(d -= i);
        vMeth();
        Test.lArrFld[(-17395 >>> 1) % N] = Test.lArrFld[(-15175 >>> 1) % N];
        Test.instanceCount >>= i;
        i14 = 1;
        while (++i14 < 247) {
            i = i;
        }
        for (f2 = 9; f2 < 306; ++f2) {
            i >>= Test.sFld;
            Test.instanceCount += (-217 + (f2 * f2));
            i15 = i14;
            i = Test.sFld;
            i16 = 85;
            while (--i16 > 0) {
                for (i17 = 1; i17 < 1; ++i17) {
                    i += i16;
                    if (false) continue;
                    i15 += (-10 + (i17 * i17));
                    Test.lArrFld[i16 - 1][(int)(f2)] = i14;
                    Test.lArrFld[(int)(f2)][(int)(f2 + 1)] += Test.instanceCount;
                }
                i19 = 1;
                while (--i19 > 0) {
                    int i20=18545;
                    Test.fFld *= 10752;
                    i18 = i15;
                    iFld += (i19 ^ i14);
                    Test.instanceCount = Test.instanceCount;
                    dFld *= i20;
                    iFld += -30357;
                    i += i15;
                    i += (int)-56L;
                    if (b1) break;
                    i = i17;
                }
                i18 = (int)Test.fFld;
            }
        }

        FuzzerUtils.out.println("i d i14 = " + i + "," + Double.doubleToLongBits(d) + "," + i14);
        FuzzerUtils.out.println("f2 i15 i16 = " + Float.floatToIntBits(f2) + "," + i15 + "," + i16);
        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("b1 = " + (b1 ? 1 : 0));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.fFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("iFld dFld Test.lArrFld = " + iFld + "," + Double.doubleToLongBits(dFld) + "," +
            FuzzerUtils.checkSum(Test.lArrFld));

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
