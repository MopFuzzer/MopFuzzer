// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:01 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=156L;
    public static float fFld=44.594F;
    public static volatile byte byFld=65;
    public volatile boolean bFld=true;
    public short sFld=-20993;

    public static long vMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i7, int i8) {

        int i9=4767, i10=-161, i11=-48830, i12=-2, iArr[]=new int[N];
        long l=-14L;
        boolean b=true;

        FuzzerUtils.init(iArr, -51205);

        i9 = 1;
        do {
            l += i9;
            for (i10 = 1; i10 < 6; i10++) {
                iArr[i10] = i11;
                iArr[i9 - 1] <<= (int)-2050784756L;
                if (b) continue;
                i8 = i7;
            }
            i11 += (i9 - l);
            i12 = 1;
            while (++i12 < 6) {
                i8 >>= i9;
                i7 >>= i9;
                i11 += i11;
                Test.instanceCount = i12;
                i8 *= (int)Test.fFld;
                i8 |= i8;
            }
        } while (++i9 < 266);
        vMeth1_check_sum += i7 + i8 + i9 + l + i10 + i11 + (b ? 1 : 0) + i12 + FuzzerUtils.checkSum(iArr);
    }

    public static double dMeth(float f) {

        int i5=39163, i6=-132, i13=-14, i14=-13, i15=9, i16=49731, iArr1[]=new int[N];
        byte by=-92;
        double dArr[]=new double[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(dArr, 2.126212);
        FuzzerUtils.init(iArr1, 58619);
        FuzzerUtils.init(sArr, (short)29254);

        for (i5 = 16; i5 < 369; i5++) {
            vMeth1(i6, i5);
            for (i13 = 1; i13 < 5; i13++) {
                dArr[i5] *= i13;
                i14 ^= i14;
                i6 += (int)-1.324F;
                for (i15 = i13; 2 > i15; ++i15) {
                    iArr1 = iArr1;
                    i14 = by;
                }
                i16 *= i13;
                f *= Test.fFld;
            }
            sArr[i5 + 1] ^= (short)Test.instanceCount;
            i14 += i15;
            i14 -= i14;
            i16 = i13;
        }
        long meth_res = Float.floatToIntBits(f) + i5 + i6 + i13 + i14 + i15 + i16 + by +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(sArr);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth(double d, int i, int i1) {

        int i2=-54788, i3=11, i4=-2, i17=3092, i18=-2, i19=0, iArr2[]=new int[N];
        short s=32607;

        FuzzerUtils.init(iArr2, -48121);

        for (i2 = 17; i2 < 274; ++i2) {
            i4 = 6;
            while (--i4 > 0) {
                i -= (int)(i1 * dMeth(Test.fFld));
                i3 -= i2;
                Test.byFld = (byte)-27.655F;
                i17 -= i3;
                for (i18 = 1; i18 < 1; i18++) {
                    i19 += (i18 * Test.instanceCount);
                    i19 = i1;
                    i3 *= i19;
                    Test.instanceCount += (i18 + i3);
                    iArr2[i2] = 101;
                    iArr2[i18 + 1] = 13;
                    d = i2;
                }
                i17 -= s;
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + i + i1 + i2 + i3 + i4 + i17 + i18 + i19 + s +
            FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        double d1=-56.130423;
        int i20=7088, i21=-119, i22=0, i23=8, i24=11, i25=-9, i26=199, i27=24286, i28=-54532, i29=36, i30=-13468,
            iArr3[]=new int[N];
        long l1=-6048576076455710756L;

        FuzzerUtils.init(iArr3, -179);

        vMeth(d1, i20, i20);
        for (i21 = 5; 157 > i21; i21++) {
            switch ((i21 % 7) + 111) {
            case 111:
                bFld = bFld;
                for (i23 = i21; 165 > i23; i23++) {
                    sFld += (short)-2;
                    iArr3[i23] = sFld;
                    for (i25 = 1; i25 < 1; ++i25) {
                        Test.fFld -= i21;
                        Test.instanceCount += Test.instanceCount;
                    }
                    Test.fFld += i23;
                    for (i27 = 1; i27 < 1; i27++) {
                        i22 = i27;
                        Test.instanceCount += 135;
                        iArr3[i27] *= i25;
                        Test.instanceCount /= (i21 | 1);
                        iArr3[i21] <<= i26;
                        Test.instanceCount -= l1;
                        i22 += (int)l1;
                        d1 = -48;
                        i24 += (((i27 * Test.instanceCount) + Test.fFld) - i20);
                    }
                }
                for (i29 = i21; i29 < 165; i29++) {
                    bFld = bFld;
                    switch ((i21 % 1) + 109) {
                    case 109:
                        i30 += (((i29 * i24) + i20) - Test.byFld);
                    default:
                        iArr3[i29] |= (int)l1;
                        iArr3[i21 - 1] = i25;
                        sFld -= (short)2235873066L;
                    }
                    iArr3[i21 + 1] += (int)Test.fFld;
                    i26 += i29;
                }
                break;
            case 112:
                i20 *= (int)-32L;
                break;
            case 113:
                i28 = 152;
                break;
            case 114:
                iArr3[i21 + 1] -= i29;
                break;
            case 115:
                Test.fFld += (((i21 * i20) + i22) - i30);
                break;
            case 116:
                i30 -= i26;
                break;
            case 117:
                Test.instanceCount = (long)Test.fFld;
                break;
            }
        }

        FuzzerUtils.out.println("d1 i20 i21 = " + Double.doubleToLongBits(d1) + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("i28 l1 i29 = " + i28 + "," + l1 + "," + i29);
        FuzzerUtils.out.println("i30 iArr3 = " + i30 + "," + FuzzerUtils.checkSum(iArr3));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.byFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.byFld);
        FuzzerUtils.out.println("bFld sFld = " + (bFld ? 1 : 0) + "," + sFld);

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
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
//DEBUG  dMeth ->  dMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 dMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
