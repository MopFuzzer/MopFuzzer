// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:04 2023
public class Test0449 {

    public static final int N = 400;

    public static long instanceCount = 25722L;
    public static float fFld = 1.851F;
    public static volatile long[] lArrFld = new long[N];
    public static long iMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0449.lArrFld, -34481L);
    }

    public static void vMeth(int i2, int i3) {

        int i4 = 212, i5 = -31826, i6 = -233, i7 = -17, i8 = -254, i9 = 0, i10 = 13;
        float f = -99.981F;
        boolean b = true;
        boolean[] bArr = new boolean[N];

        FuzzerUtils.init(bArr, true);

        Test0449.instanceCount = i3;
        for (i4 = 8; i4 < 214; ++i4) {
            switch ((i4 % 2) + 11) {
                case 11:
                    i6 = 1;
                    do {
                        Test0449.fFld -= i3;
                        switch (((i4 % 3) * 5) + 108) {
                            case 113:
                                i3 += (i6 * i5);
                                for (f = 1; f < 1; f++) {
                                    i8 -= i7;
                                }
                                bArr[i6] = b;
                                for (i9 = 1; i9 < 1; ++i9) {
                                    i2 += i9;
                                    Test0449.instanceCount *= Test0449.instanceCount;
                                    i5 *= i7;
                                    i8 ^= (int) Test0449.instanceCount;
                                }
                                break;
                            case 110:
                                i10 -= i9;
                                break;
                            case 120:
                        }
                    } while (++i6 < 8);
                    break;
                case 12:
                    i10 += i4;
                    break;
            }
        }
        vMeth_check_sum += i2 + i3 + i4 + i5 + i6 + Float.floatToIntBits(f) + i7 + i8 + (b ? 1 : 0) + i9 + i10 +
                FuzzerUtils.checkSum(bArr);
    }

    public static boolean bMeth(int i1) {

        short s = -7286;
        int i11 = 33739, i12 = -42, i13 = -27539, i14 = -37, i15 = -5, i16 = 66;

        vMeth(i1, -50673);
        i1 ^= i1;
        i1 -= i1;
        i1 <<= s;
        for (i11 = 330; i11 > 12; i11--) {
            i12 += (((i11 * i1) + i1) - i1);
            for (i13 = i11; i13 < 5; i13++) {
                i1 += (((i13 * Test0449.instanceCount) + Test0449.fFld) - Test0449.fFld);
                Test0449.fFld += (((i13 * i11) + i11) - s);
                Test0449.fFld = i12;
                Test0449.instanceCount -= -5;
            }
            for (i15 = 1; 5 > i15; i15++) {
                i12 = i15;
                Test0449.lArrFld[i15] ^= i14;
                i16 += (int) Test0449.instanceCount;
            }
        }
        long meth_res = i1 + s + i11 + i12 + i13 + i14 + i15 + i16;
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static void main(String[] strArr) {

        try {
            Test0449 _instance = new Test0449();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public int iMeth() {

        int i17 = 2621;

        bMeth(i17);
        long meth_res = i17;
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i = -27599;
        int i19 = 101;
        int i20 = -6;
        int i21 = 40;
        int i22 = 164;
        int i23 = 135;
        int[] iArr = new int[N];
        short s1 = 610;
        short[] sArr = new short[N];
        byte by = -127;
        boolean b1 = true;

        FuzzerUtils.init(iArr, 43389);
        FuzzerUtils.init(sArr, (short) 7228);

        i >>>= (iMeth() * i);
        iArr[(i >>> 1) % N] += i;
        i *= i;
        i /= (int) (s1 | 1);
        for (int i18 : iArr) {
            i -= -8;
            Test0449.fFld *= i18;
        }
        iArr[(i >>> 1) % N] <<= 4;
        i &= i;
        if (b1) {
            for (short s2 : sArr) {
                for (i19 = 3; i19 < 63; ++i19) {
                    for (i21 = 1; i21 < 2; i21++) {
                        iArr[i21 + 1] <<= 29;
                        iArr[i21 + 1] = 2723;
                        switch (((i21 % 3) * 5) + 79) {
                            case 80:
                                Test0449.instanceCount = by;
                                iArr[i19 + 1] = (int) -8341L;
                                break;
                            case 83:
                                i -= i22;
                                Test0449.fFld -= Test0449.instanceCount;
                                break;
                            case 82:
                                i = i21;
                                break;
                        }
                        Test0449.fFld += (i21 * i21);
                        i20 = i20;
                        Test0449.instanceCount += i22;
                    }
                    i23 = 1;
                    while (++i23 < 2) {
                        Test0449.instanceCount -= i23;
                        i20 ^= s2;
                        Test0449.fFld = -1;
                        if (b1) break;
                        iArr[i23 - 1] *= i21;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i s1 i19 = " + i + "," + s1 + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("by i23 b1 = " + by + "," + i23 + "," + (b1 ? 1 : 0));
        FuzzerUtils.out.println("iArr sArr = " + FuzzerUtils.checkSum(iArr) + "," + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test0449.instanceCount Test0449.fFld Test0449.lArrFld = " + Test0449.instanceCount + "," +
                Float.floatToIntBits(Test0449.fFld) + "," + FuzzerUtils.checkSum(Test0449.lArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  bMeth ->  bMeth iMeth mainTest
//DEBUG  vMeth ->  vMeth bMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
