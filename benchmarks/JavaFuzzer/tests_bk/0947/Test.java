// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:17 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=2012992249L;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 14L);
        FuzzerUtils.init(Test.iArrFld, 33948);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth1() {

        int i1=-2;

        Test.instanceCount -= (((Test.instanceCount--) << (i1--)) + i1);
        vMeth1_check_sum += i1;
    }

    public static void vMeth(long l, int i, long l1) {

        double dArr[]=new double[N];
        int iArr[]=new int[N];

        FuzzerUtils.init(dArr, 93.15499);
        FuzzerUtils.init(iArr, 153);

        vMeth1();
        vMeth1();
        dArr[(i >>> 1) % N] += (iArr[(2 >>> 1) % N]++);
        vMeth_check_sum += l + i + l1 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth2() {

        int i13=27, i14=40414, i15=177, i16=-44839, i17=0, i18=13, iArr2[][]=new int[N][N];
        long l2=-1890025415L, lArr1[]=new long[N];
        byte by1=54;
        boolean b=false;
        short s=26469;
        float f1=2.542F;

        FuzzerUtils.init(lArr1, 3287902037L);
        FuzzerUtils.init(iArr2, -157);

        switch ((((-10 >>> 1) % 5) * 5) + 109) {
        case 123:
            i13 = i13;
            break;
        case 120:
            for (l2 = 12; l2 < 339; ++l2) {
                for (i15 = (int)(l2); i15 < 5; i15++) {
                    i16 = i14;
                    by1 += (byte)(i15 * i15);
                    i16 += (i15 ^ i14);
                    i14 = i15;
                    lArr1[i15] -= Test.instanceCount;
                    for (i17 = 1; i17 < 1; i17++) {
                        by1 += (byte)(i17 - i15);
                        if (b) break;
                        i13 += (((i17 * by1) + by1) - i15);
                        i14 |= i16;
                    }
                    if (i17 != 0) {
                        vMeth2_check_sum += i13 + l2 + i14 + i15 + i16 + by1 + i17 + i18 + (b ? 1 : 0) + s +
                            Float.floatToIntBits(f1) + FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr2);
                        return;
                    }
                }
            }
            break;
        case 132:
            i13 = s;
            break;
        case 115:
            i16 /= (int)1688150782L;
            break;
        case 121:
            iArr2[(i18 >>> 1) % N] = iArr2[(i17 >>> 1) % N];
            break;
        default:
            i14 *= (int)f1;
        }
        vMeth2_check_sum += i13 + l2 + i14 + i15 + i16 + by1 + i17 + i18 + (b ? 1 : 0) + s + Float.floatToIntBits(f1) +
            FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr2);
    }

    public static long lMeth(int i12) {

        int i19=-16283, i20=235, i21=13100, i22=-18;
        float f3=-37.779F, fArr[]=new float[N];
        double d1=115.48738, d2=1.81418;
        short s1=29582;
        byte by2=24;

        FuzzerUtils.init(fArr, -85.644F);

        vMeth2();
        for (i19 = 306; i19 > 2; i19--) {
            Test.lArrFld[i19 - 1] %= ((long)(f3) | 1);
            Test.instanceCount *= -2;
            for (d1 = 1; d1 < 5; d1 += 2) {
                s1 += (short)d1;
                Test.instanceCount -= i12;
            }
            fArr[i19 - 1] *= Test.instanceCount;
            Test.lArrFld[i19] *= i12;
            by2 -= (byte)-8757;
            d2 = 1;
            do {
                i12 += (int)d2;
                i22 = 1;
                while ((i22 += 2) < 1) {
                    i12 |= i12;
                    Test.instanceCount <<= i20;
                }
            } while (++d2 < 5);
        }
        long meth_res = i12 + i19 + i20 + Float.floatToIntBits(f3) + Double.doubleToLongBits(d1) + i21 + s1 + by2 +
            Double.doubleToLongBits(d2) + i22 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static float fMeth(int i3, int i4, int i5) {

        byte by=-103;
        float f=0.45F;
        int i6=40, i7=0, i8=-7442, i9=-39428, i10=6, i11=-36825, iArr1[]=new int[N];
        double d=0.49571, dArr1[]=new double[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr1, -28);
        FuzzerUtils.init(dArr1, 59.99871);
        FuzzerUtils.init(lArr, 3781186615L);

        by *= (byte)((long)(184 * (by + f)) << i5);
        i6 = 1;
        do {
            for (i7 = 1; i7 < 11; i7++) {
                iArr1[i6] *= (int)Test.instanceCount;
            }
            i5 += (int)(d + ((i3++) + (Test.instanceCount - f)));
            Test.instanceCount = (--i3);
            vMeth1();
            i9 += (i6 * i5);
            Test.instanceCount *= (long)((++dArr1[i6]) - (--lArr[i6 - 1]));
            i8 = (int)Long.reverseBytes(Test.instanceCount);
        } while (++i6 < 142);
        i8 >>= 3792;
        for (i10 = 9; i10 < 187; i10++) {
            i11 += (int)lMeth(-12878);
            i8 *= i9;
            Test.instanceCount = i7;
        }
        long meth_res = i3 + i4 + i5 + by + Float.floatToIntBits(f) + i6 + i7 + i8 + Double.doubleToLongBits(d) + i9 +
            i10 + i11 + FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)) +
            FuzzerUtils.checkSum(lArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i2=-39402, i23=-38, i24=-61271, i25=-8551, i26=-246, i27=-61908, i28=12, i29=10, i30=-7911, i31=-12;
        long l3=-2L;
        double d3=51.82594;
        byte by3=104;
        boolean b1=false, bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, true);

        vMeth(Test.instanceCount, -(i2 /= (int)((-16381 * (i2 - -233)) | 1)), Test.instanceCount);
        vMeth(++Test.instanceCount, (int)(-Math.abs(fMeth(i2, i2, i2))), Test.instanceCount);
        l3 <<= -9;
        d3 += i2;
        for (i23 = 4; 249 > i23; i23++) {
            float f4=-6.729F;
            i2 -= i23;
            f4 -= l3;
            i2 -= i24;
            Test.iArrFld[i23] = (int)l3;
            switch ((i23 % 10) + 127) {
            case 127:
                Test.iArrFld[i23 - 1] = i23;
                if (false) {
                    i24 = 7580;
                } else {
                    for (i25 = i23; i25 < 103; ++i25) {
                        i27 = 1;
                        while (++i27 < 1) {
                            i2 += (i27 ^ l3);
                            switch (((i25 % 2) * 5) + 56) {
                            case 65:
                                if (true) continue;
                                f4 += (i27 - Test.instanceCount);
                                bArr[i27 - 1] = true;
                                break;
                            case 60:
                                by3 = (byte)i26;
                                l3 >>= 44951;
                                d3 *= i23;
                                i2 = i25;
                                break;
                            }
                            l3 = (long)-98.1011F;
                            i24 -= i26;
                        }
                    }
                    for (i28 = 103; i28 > 3; i28 -= 3) {
                        for (i30 = 1; i30 < 4; i30++) {
                            Test.iArrFld[i30] = (int)d3;
                            i29 -= (int)l3;
                        }
                    }
                }
                break;
            case 128:
            case 129:
                Test.iArrFld[i23 + 1] += by3;
                break;
            case 130:
                i26 -= 157;
                break;
            case 131:
                i29 = i26;
                break;
            case 132:
                i29 += (i23 * i23);
                break;
            case 133:
                i29 = (int)d3;
                break;
            case 134:
                if (b1) break;
                break;
            case 135:
                l3 += Test.instanceCount;
            case 136:
                i31 = i27;
                break;
            }
        }

        FuzzerUtils.out.println("i2 l3 d3 = " + i2 + "," + l3 + "," + Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 i27 by3 = " + i26 + "," + i27 + "," + by3);
        FuzzerUtils.out.println("i28 i29 i30 = " + i28 + "," + i29 + "," + i30);
        FuzzerUtils.out.println("i31 b1 bArr = " + i31 + "," + (b1 ? 1 : 0) + "," + FuzzerUtils.checkSum(bArr));

        FuzzerUtils.out.println("Test.instanceCount Test.lArrFld Test.iArrFld = " + Test.instanceCount + "," +
            FuzzerUtils.checkSum(Test.lArrFld) + "," + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest fMeth
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  lMeth ->  lMeth fMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 lMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
