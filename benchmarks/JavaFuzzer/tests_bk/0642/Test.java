// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:09 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=173742116L;
    public static byte byFld=19;
    public static short sFld=5082;
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 2.554F);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(long l1, int i5, boolean b) {

        int i6=158, i7=58787, i8=4, i9=3, i10=-14, i11=-716, i12=-3, i13=103, i14=-33734, iArr[]=new int[N];
        short s1=17777;
        float f1=2.728F;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 37101);
        FuzzerUtils.init(lArr, 3213947909750867828L);

        Test.instanceCount += Test.byFld;
        i5 -= i5;
        for (i6 = 3; i6 < 177; i6++) {
            if (b) {
                for (i8 = 1; i8 < 9; ++i8) {
                    i5 = s1;
                    iArr[i6] *= i6;
                    i5 += (((i8 * l1) + s1) - i5);
                    Test.fArrFld[i8 + 1] = i7;
                    i9 = i10;
                }
                for (i11 = i6; i11 < 9; ++i11) {
                    i10 += i9;
                    for (i13 = 1; 1 < i13; i13 -= 2) {
                        lArr[i6 - 1] %= (Test.instanceCount | 1);
                        s1 >>= (short)l1;
                    }
                }
            } else {
                i14 += (((i6 * f1) + i14) - i6);
            }
        }
        vMeth_check_sum += l1 + i5 + (b ? 1 : 0) + i6 + i7 + i8 + i9 + s1 + i10 + i11 + i12 + i13 + i14 +
            Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth1(short s, int i2) {

        int i3=14, i4=-1, i15=9748, i16=46, i17=-19715, i18=19099, i19=-12, iArr1[]=new int[N];
        boolean b1=false;

        FuzzerUtils.init(iArr1, -51);

        for (i3 = 5; i3 < 332; ++i3) {
            vMeth(Test.instanceCount, i2, b1);
            Test.instanceCount += i15;
            i4 += (((i3 * Test.instanceCount) + Test.instanceCount) - i3);
            Test.instanceCount += i3;
            for (i16 = 1; i16 < 5; ++i16) {
                i2 = 9;
                for (i18 = 1; i18 < 2; ++i18) {
                    iArr1[i16 + 1] += i17;
                    i4 -= 211;
                    iArr1[i16 + 1] += i4;
                    Test.instanceCount = i15;
                    i2 -= i3;
                    i17 = i3;
                    iArr1[i16 + 1] = (int)Test.instanceCount;
                }
            }
        }
        long meth_res = s + i2 + i3 + i4 + (b1 ? 1 : 0) + i15 + i16 + i17 + i18 + i19 + FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i, int i1, long l) {

        int i20=-10, i21=-152;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)0);

        byArr[(i1 >>> 1) % N] = (byte)iMeth1(Test.sFld, -12);
        for (i20 = 3; i20 < 312; i20++) {
            i1 >>>= (int)l;
            i += i20;
            i -= i20;
        }
        Test.byFld >>>= (byte)l;
        long meth_res = i + i1 + l + i20 + i21 + FuzzerUtils.checkSum(byArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i22=227, i23=-19828, i24=-21, i25=-31362, i26=64374, i27=0, i28=-164, i29=-13, i30=-8, i31=10, i32=-105,
            i33=43590, iArr2[]=new int[N];
        boolean b2=false;
        double d=21.102347, d1=13.96167;
        long lArr1[]=new long[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(iArr2, 24986);
        FuzzerUtils.init(lArr1, 1364697751L);
        FuzzerUtils.init(sArr, (short)18275);

        iMeth(i22, 6, Test.instanceCount);
        Test.instanceCount *= i22;
        Test.instanceCount -= -42;
        if (b2) {
            i23 = 1;
            do {
                Test.sFld &= (short)Test.instanceCount;
                for (i24 = i23; i24 < 124; i24++) {
                    if (b2) continue;
                    i25 += (((i24 * Test.instanceCount) + i23) - i22);
                }
                for (i26 = 124; i26 > 2; i26 -= 3) {
                    Test.fArrFld[i26] = 142;
                    for (d = 1; d < 4; ++d) {
                        iArr2[i23 - 1] <<= Test.sFld;
                        iArr2 = iArr2;
                        lArr1[i26 - 1] = Test.byFld;
                        d1 = -126;
                        i22 += (int)(((d * i23) + i28) - Test.instanceCount);
                    }
                    i27 = i25;
                }
                i25 = 133;
                switch ((i23 % 1) + 71) {
                case 71:
                    i22 -= (int)Test.instanceCount;
                    break;
                }
            } while (++i23 < 203);
            i29 = 1;
            do {
                Test.instanceCount >>= -6;
                i25 += (((i29 * Test.byFld) + Test.instanceCount) - i24);
                for (i30 = 68; i29 < i30; --i30) {
                    for (i32 = 1; i32 < 1; ++i32) {
                        Test.instanceCount = Test.instanceCount;
                        d1 += -73.627F;
                        i31 = 2;
                        i27 -= i26;
                    }
                }
            } while (++i29 < 371);
        } else {
            sArr[(i31 >>> 1) % N] = (short)i25;
        }

        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 b2 i26 = " + i25 + "," + (b2 ? 1 : 0) + "," + i26);
        FuzzerUtils.out.println("i27 d i28 = " + i27 + "," + Double.doubleToLongBits(d) + "," + i28);
        FuzzerUtils.out.println("d1 i29 i30 = " + Double.doubleToLongBits(d1) + "," + i29 + "," + i30);
        FuzzerUtils.out.println("i31 i32 i33 = " + i31 + "," + i32 + "," + i33);
        FuzzerUtils.out.println("iArr2 lArr1 sArr = " + FuzzerUtils.checkSum(iArr2) + "," + FuzzerUtils.checkSum(lArr1)
            + "," + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.sFld = " + Test.instanceCount + "," + Test.byFld +
            "," + Test.sFld);
        FuzzerUtils.out.println("Test.fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}