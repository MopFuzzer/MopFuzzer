// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:59 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-5L;
    public static short sFld=29613;
    public static float fFld=60.80F;
    public static boolean bFld=false;
    public static float fArrFld[]=new float[N];
    public static long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 60.331F);
        FuzzerUtils.init(Test.lArrFld, 187L);
        FuzzerUtils.init(Test.iArrFld, -12);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(double d, int i7, byte by) {

        int i8=2, i9=15704, i10=-37992, i11=-4, iArr1[]=new int[N];
        float f1=2.661F;
        boolean b=false;

        FuzzerUtils.init(iArr1, 41007);

        for (i8 = 9; i8 < 391; ++i8) {
            for (f1 = 1; 4 > f1; ++f1) {
                iArr1 = iArr1;
                i10 += (int)(((f1 * i7) + i7) - i7);
                i7 += (int)Test.instanceCount;
                i7 >>= -251;
                if (i9 != 0) {
                }
                if (b) break;
                i11 = 1;
                while (++i11 < 2) {
                    i10 += (i11 + i8);
                    switch ((i8 % 3) + 92) {
                    case 92:
                        Test.instanceCount = i10;
                        break;
                    case 93:
                        i10 = i8;
                        Test.instanceCount += (((i11 * Test.instanceCount) + i7) - by);
                        i7 += Test.sFld;
                    case 94:
                        by = (byte)f1;
                        break;
                    }
                }
            }
        }
        long meth_res = Double.doubleToLongBits(d) + i7 + by + i8 + i9 + Float.floatToIntBits(f1) + i10 + (b ? 1 : 0) +
            i11 + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(long l1, long l2, int i4) {

        int i5=84, i6=11, i12=-29172, i13=14, i14=-7, i15=-13208, iArr[][]=new int[N][N];
        double d1=43.633;
        byte by1=97;
        boolean b1=true, bArr[][]=new boolean[N][N];

        FuzzerUtils.init(iArr, 6);
        FuzzerUtils.init(bArr, false);

        i4 -= i4;
        for (i5 = 376; i5 > 23; i5 -= 2) {
            iArr[i5 - 1][i5 + 1] += Math.abs(7 - iMeth(d1, 45614, by1));
            Test.fArrFld[i5 + 1] -= l2;
            iArr[(i5 >>> 1) % N][i5] += (int)936461098893019000L;
            bArr[i5 + 1][i5] = b1;
            for (i12 = 9; i12 > i5; i12--) {
                for (i14 = 1; i14 > i12; i14--) {
                    i15 -= (int)l2;
                }
                by1 |= (byte)l2;
                i15 += (((i12 * i6) + i5) - Test.fFld);
                Test.sFld %= (short)((long)(Test.fFld) | 1);
                i6 *= (int)-2867851495L;
                i15 >>= i4;
                i4 = (int)Test.instanceCount;
            }
        }
        vMeth1_check_sum += l1 + l2 + i4 + i5 + i6 + Double.doubleToLongBits(d1) + by1 + (b1 ? 1 : 0) + i12 + i13 + i14
            + i15 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(bArr);
    }

    public static void vMeth(int i3, long l, float f) {

        int i16=27500, i17=26, i18=-78, i19=3;

        vMeth1(Test.instanceCount, l, i3);
        i3 = 213;
        i3 = 9424;
        Test.lArrFld = Test.lArrFld;
        for (i16 = 7; i16 < 289; i16++) {
            i18 = 1;
            while (++i18 < 6) {
                Test.iArrFld[i18] -= i17;
                i19 = 1;
                while (--i19 > 0) {
                    Test.iArrFld[i18] -= (int)Test.instanceCount;
                    i3 = i18;
                    i3 += i19;
                    switch ((i19 % 6) + 57) {
                    case 57:
                        Test.instanceCount += (((i19 * i19) + i3) - i17);
                        Test.bFld = Test.bFld;
                        Test.instanceCount ^= i17;
                        break;
                    case 58:
                        i17 |= i16;
                        break;
                    case 59:
                        i3 += (int)l;
                    case 60:
                        l = (long)Test.fFld;
                        break;
                    case 61:
                        Test.iArrFld[i18] *= i16;
                        break;
                    case 62:
                        Test.fFld -= i16;
                        break;
                    default:
                        i3 += (int)-15340L;
                    }
                }
            }
        }
        vMeth_check_sum += i3 + l + Float.floatToIntBits(f) + i16 + i17 + i18 + i19;
    }

    public void mainTest(String[] strArr1) {

        int i=50003, i1=20998, i2=11, i21=-38862, i22=2, i23=-31759, i24=-65, i25=-51991, i26=-11, i27=-112,
            i28=-34934, i29=7, i30=99;
        short s=-1856;
        byte by2=-14;
        double d2=98.67493;

        for (i = 7; i < 159; ++i) {
            Test.instanceCount *= i1;
        }
        i2 = 1;
        while (++i2 < 298) {
            i1 = ((Short.reverseBytes(s) - i1) + i1);
            vMeth(i1, Test.instanceCount, Test.fFld);
            for (i21 = 2; i21 < 84; i21++) {
                i1 -= i22;
                Test.instanceCount += (long)Test.fFld;
                Test.fArrFld[i2] -= -8;
                Test.bFld = Test.bFld;
                Test.iArrFld[i2] ^= i22;
                i1 >>= i1;
                Test.instanceCount *= Test.instanceCount;
                i22 += i2;
            }
            for (i23 = 1; 84 > i23; i23++) {
                i24 += (((i23 * Test.fFld) + Test.instanceCount) - Test.instanceCount);
                i22 += i23;
                i1 = i22;
                i24 += (int)Test.instanceCount;
            }
        }
        for (i25 = 8; i25 < 240; i25++) {
            i1 = -18322;
            Test.fFld -= i26;
            by2 -= (byte)d2;
            for (i27 = i25; i27 < 108; i27++) {
                i26 = i21;
            }
            i28 >>= -62188;
        }
        for (i29 = 9; i29 < 239; ++i29) {
            i1 = -148;
            i26 += (i29 * i29);
            Test.sFld += (short)2.431F;
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("s i21 i22 = " + s + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 by2 d2 = " + i26 + "," + by2 + "," + Double.doubleToLongBits(d2));
        FuzzerUtils.out.println("i27 i28 i29 = " + i27 + "," + i28 + "," + i29);
        FuzzerUtils.out.println("i30 = " + i30);

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.fFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.bFld Test.fArrFld Test.lArrFld = " + (Test.bFld ? 1 : 0) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," + FuzzerUtils.checkSum(Test.lArrFld));
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}