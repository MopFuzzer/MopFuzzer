// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:10 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-39035L;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i12, long l1, boolean b) {

        float f1=0.684F, f2=0.217F;
        int i13=96, i14=9, i15=-167, iArr2[]=new int[N];
        byte by1=37;

        FuzzerUtils.init(iArr2, -163);

        for (f1 = 7; f1 < 181; f1++) {
            i12 *= (int)Test.instanceCount;
            switch ((int)(((f1 % 6) * 5) + 14)) {
            case 18:
                i12 = i12;
                by1 = (byte)i12;
                i12 = (int)l1;
                i13 *= (int)f1;
                break;
            case 26:
                i13 = i12;
                i12 -= i12;
                Test.instanceCount += (long)f1;
                break;
            case 34:
                for (i14 = 1; i14 < 9; ++i14) {
                    l1 &= i15;
                    l1 >>>= i14;
                }
                i12 += 0;
                l1 = i12;
                break;
            case 29:
                iArr2[(int)(f1 + 1)] /= (int)(Test.instanceCount | 1);
                break;
            case 43:
                f2 = i13;
                break;
            case 23:
                f2 += (((f1 * i12) + i15) - Test.instanceCount);
            default:
                i12 += (int)(((f1 * i15) + i14) - i14);
            }
        }
        vMeth2_check_sum += i12 + l1 + (b ? 1 : 0) + Float.floatToIntBits(f1) + i13 + by1 + i14 + i15 +
            Float.floatToIntBits(f2) + FuzzerUtils.checkSum(iArr2);
    }

    public static void vMeth1(int i8) {

        int i9=12, i10=-1, i11=12, i17=-51051, iArr3[]=new int[N];
        boolean b1=false;
        long l2=-1L, lArr1[]=new long[N];
        float f3=-114.148F;
        double d=0.39832, dArr[]=new double[N];

        FuzzerUtils.init(dArr, 2.115552);
        FuzzerUtils.init(iArr3, -6827);
        FuzzerUtils.init(lArr1, -2953260890L);

        for (i9 = 8; i9 < 180; ++i9) {
            i11 = 1;
            while (++i11 < 9) {
                vMeth2(i8, Test.instanceCount, b1);
                for (l2 = 1; l2 < 1; l2++) {
                    i10 -= (int)f3;
                    i10 += (int)(l2 * l2);
                    dArr[(int)(l2 + 1)] -= i11;
                    i10 = i9;
                    i17 = i11;
                    iArr3[i11 - 1] = i9;
                    i8 += (int)(l2 + i10);
                    iArr3 = iArr3;
                    lArr1[(int)(l2)] = l2;
                    i17 *= (int)d;
                }
                i10 += (18299 + (i11 * i11));
            }
        }
        vMeth1_check_sum += i8 + i9 + i10 + i11 + (b1 ? 1 : 0) + l2 + i17 + Float.floatToIntBits(f3) +
            Double.doubleToLongBits(d) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            FuzzerUtils.checkSum(iArr3) + FuzzerUtils.checkSum(lArr1);
    }

    public static void vMeth(int i6, long l, int i7) {

        double d1=-1.10774;
        int i18=11231, i19=25095, i20=8, iArr4[]=new int[N];
        long l3=-212L;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(iArr4, 8);
        FuzzerUtils.init(bArr, true);

        Test.instanceCount = (i7++);
        vMeth1(-43324);
        for (d1 = 5; d1 < 346; d1++) {
            i7 += i7;
            for (i19 = 5; i19 > d1; i19--) {
                iArr4[(int)(d1)] >>= i19;
                bArr = bArr;
                iArr4[i19 - 1] %= (int)(i7 | 1);
                i7 >>= i18;
                iArr4[i19 - 1] += (int)204L;
                i18 += (((i19 * l) + Test.instanceCount) - i19);
                l3 = (long)d1;
                Test.instanceCount += (((i19 * i18) + i6) - Test.instanceCount);
                if (i6 != 0) {
                    vMeth_check_sum += i6 + l + i7 + Double.doubleToLongBits(d1) + i18 + i19 + i20 + l3 +
                        FuzzerUtils.checkSum(iArr4) + FuzzerUtils.checkSum(bArr);
                    return;
                }
            }
            l += (long)(d1 - i19);
        }
        vMeth_check_sum += i6 + l + i7 + Double.doubleToLongBits(d1) + i18 + i19 + i20 + l3 +
            FuzzerUtils.checkSum(iArr4) + FuzzerUtils.checkSum(bArr);
    }

    public void mainTest(String[] strArr3) {

        byte by=38;
        int i1=6, i2=-13, i3=-14, i4=1222, i5=-4, i21=-168, i22=3, i23=1834, i24=-9, i25=216, i26=91, iArr1[]=new
            int[N];
        float f=10.1008F, fArr[]=new float[N];
        double d2=1.60966;
        long lArr2[][]=new long[N][N];

        FuzzerUtils.init(iArr1, 17022);
        FuzzerUtils.init(lArr2, -11L);
        FuzzerUtils.init(fArr, 0.811F);

        iArr1[(-11551 >>> 1) % N] = (by + i1);
        i2 = 1;
        do {
            iArr1[i2] = i1;
            for (i3 = 3; i3 < 114; i3++) {
                f += (i3 - i4);
                try {
                    i4 = (iArr1[(228 >>> 1) % N] / i1);
                    i4 = (i1 / -62098);
                    i1 = (i2 / 1627653668);
                } catch (ArithmeticException a_e) {}
                i5 = 1;
                do {
                    vMeth(i2, Test.instanceCount, -28141);
                    by = (byte)f;
                    lArr2[i5 - 1] = FuzzerUtils.long1array(N, (long)4L);
                    d2 -= Test.instanceCount;
                    i4 += i2;
                    f += (i5 + i2);
                    Test.instanceCount = i4;
                    i1 += (i5 | i2);
                } while (++i5 < 2);
            }
            for (i21 = i2; 114 > i21; ++i21) {
                for (i23 = 1; i23 < 1; ++i23) {
                    iArr1[i23] = (int)f;
                    lArr2[i21 - 1][i21 + 1] = (long)f;
                    fArr[i21 + 1] -= Test.instanceCount;
                    Test.instanceCount += (((i23 * f) + i24) - i24);
                    i22 += i23;
                    i4 >>>= (int)4216326060L;
                }
                lArr2[i21 - 1][i2] -= i1;
                iArr1[i2 + 1] *= i5;
                for (i25 = 1; 1 > i25; i25++) {
                    Test.instanceCount <<= Test.instanceCount;
                    fArr[i21] -= Test.instanceCount;
                    i26 = 32322;
                }
                i24 += (((i21 * i22) + i3) - i25);
            }
        } while (++i2 < 221);

        FuzzerUtils.out.println("by i1 i2 = " + by + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i4 f = " + i3 + "," + i4 + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("i5 d2 i21 = " + i5 + "," + Double.doubleToLongBits(d2) + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 i26 iArr1 = " + i25 + "," + i26 + "," + FuzzerUtils.checkSum(iArr1));
        FuzzerUtils.out.println("lArr2 fArr = " + FuzzerUtils.checkSum(lArr2) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount = " + Test.instanceCount);

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
