// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:56 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-4L;
    public static byte byFld=-108;
    public boolean bFld=true;
    public static volatile boolean bArrFld[]=new boolean[N];
    public static int iArrFld[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.bArrFld, true);
        FuzzerUtils.init(Test.iArrFld, -250);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i2) {

        int i3=-13921, i4=-47, i5=-164, i6=-5, i7=8, i8=5553, i9=-14, i10=125, iArr[]=new int[N];
        double d=-89.15439, dArr[][]=new double[N][N];
        float f=93.207F;
        byte by=-109;
        long l=-1L;

        FuzzerUtils.init(iArr, 7);
        FuzzerUtils.init(dArr, -29.102783);

        Test.instanceCount -= i2;
        for (i3 = 152; i3 > 3; i3--) {
            d *= Test.instanceCount;
            for (i5 = i3; i5 < 11; ++i5) {
                for (i7 = 1; i7 > 1; i7--) {
                    i2 += (i7 * i6);
                }
                iArr = FuzzerUtils.int1array(N, (int)6);
                f = Test.instanceCount;
            }
            Test.instanceCount = i2;
            dArr[i3 + 1][(i7 >>> 1) % N] = i4;
            switch (((i3 % 1) * 5) + 15) {
            case 17:
                for (i9 = 1; i9 < 11; ++i9) {
                    i8 = by;
                    Test.instanceCount >>= i3;
                    Test.instanceCount = i5;
                }
            default:
                i8 += (((i3 * l) + f) - Test.instanceCount);
            }
        }
        vMeth2_check_sum += i2 + i3 + i4 + Double.doubleToLongBits(d) + i5 + i6 + i7 + i8 + Float.floatToIntBits(f) +
            i9 + i10 + by + l + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth1() {

        int i=-124, i1=-145, i11=39496, i12=169, i13=-67, i14=59794, i15=-8, iArr1[]=new int[N];
        double d1=-91.26598;
        float f1=84.988F;
        boolean b=true, bArr[]=new boolean[N];
        short s=17057;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(lArr, -8L);
        FuzzerUtils.init(iArr1, -5);

        for (i = 10; i < 221; ++i) {
            vMeth2(i1);
            i1 += i;
            for (i11 = 1; 8 > i11; i11++) {
                switch ((i % 5) + 117) {
                case 117:
                    for (i13 = i; i13 < 2; i13++) {
                        switch (((i11 % 3) * 5) + 69) {
                        case 72:
                            Test.byFld *= (byte)d1;
                            f1 = Test.instanceCount;
                            if (b) break;
                            break;
                        case 74:
                            i1 += (i13 * i13);
                            i12 += i13;
                            if (i15 != 0) {
                                vMeth1_check_sum += i + i1 + i11 + i12 + i13 + i14 + Double.doubleToLongBits(d1) +
                                    Float.floatToIntBits(f1) + (b ? 1 : 0) + i15 + s + FuzzerUtils.checkSum(bArr) +
                                    FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1);
                                return;
                            }
                            break;
                        case 84:
                            i15 >>= i12;
                            bArr[i - 1] = b;
                            break;
                        default:
                            s += (short)(((i13 * f1) + i13) - i15);
                        }
                    }
                    break;
                case 118:
                    i14 += (((i11 * i13) + i12) - i12);
                    break;
                case 119:
                case 120:
                    lArr[i - 1][i11 + 1] += i12;
                    break;
                case 121:
                    iArr1[i - 1] <<= i15;
                    break;
                }
            }
        }
        vMeth1_check_sum += i + i1 + i11 + i12 + i13 + i14 + Double.doubleToLongBits(d1) + Float.floatToIntBits(f1) +
            (b ? 1 : 0) + i15 + s + FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth() {

        int i16=-6, i17=31991, i18=208, i19=-5846, iArr2[][]=new int[N][N];
        boolean b1=false;
        byte byArr[]=new byte[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(byArr, (byte)-75);
        FuzzerUtils.init(lArr1, -190L);
        FuzzerUtils.init(iArr2, 4);

        vMeth1();
        for (i16 = 5; i16 < 333; i16 += 2) {
            Test.bArrFld[i16] = b1;
            byArr[i16] = (byte)i17;
            switch (((i16 % 3) * 5) + 36) {
            case 45:
                if (b1) continue;
                i18 = 1;
                do {
                    i17 = (int)-12L;
                    i19 = 1;
                    while (++i19 < 1) {
                        Test.instanceCount <<= i16;
                        if (b1) break;
                        Test.byFld += (byte)(i19 * Test.instanceCount);
                    }
                    i17 = i16;
                    lArr1[i16 - 1] = -110;
                    i17 = i18;
                } while (++i18 < 10);
                break;
            case 44:
                i17 += i16;
                break;
            case 50:
                iArr2[i16 - 1][i16 - 1] += i16;
            default:
                lArr1[i16 - 1] = i18;
            }
        }
        vMeth_check_sum += i16 + i17 + (b1 ? 1 : 0) + i18 + i19 + FuzzerUtils.checkSum(byArr) +
            FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i20=-5850, i21=40503, i22=-1, i23=-51402, i24=-6, i25=13233, i26=42352, iArr3[][]=new int[N][N];
        double d2=-2.122154, d3=119.128584, dArr1[]=new double[N];
        short s1=12593;
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr3, -34148);
        FuzzerUtils.init(dArr1, 56.47290);
        FuzzerUtils.init(fArr, 0.695F);

        vMeth();
        for (i20 = 218; 13 < i20; --i20) {
            Test.instanceCount += i20;
            for (i22 = 122; i20 < i22; i22 -= 2) {
                i23 = i20;
                iArr3[i22 - 1][i20] = (int)Test.instanceCount;
            }
        }
        Test.instanceCount = i22;
        dArr1[(i20 >>> 1) % N] *= -50843L;
        for (d2 = 12; d2 < 250; d2++) {
            i21 ^= i22;
            i23 = i24;
            for (i25 = 3; i25 < 106; ++i25) {
                i26 >>= i20;
                i26 -= i24;
                d3 = 1;
                do {
                    Test.instanceCount += (long)(((d3 * Test.instanceCount) + i26) - i24);
                    i26 = i24;
                    i21 >>= (int)Test.instanceCount;
                    i24 += (int)d3;
                    if (false) continue;
                    i26 = i21;
                    i26 -= i21;
                } while (++d3 < 2);
                Test.instanceCount += (i25 | i24);
                iArr3[i25 - 1][(int)(d2 - 1)] -= (int)Test.instanceCount;
                if (true) {
                    Test.iArrFld[i25][i25] = i24;
                    fArr[i25 + 1] *= i25;
                    i23 = (int)Test.instanceCount;
                } else if (bFld) {
                    i23 = i22;
                    s1 &= (short)i24;
                } else if (true) {
                    i26 &= -3;
                } else {
                    i23 -= (int)-57.846F;
                }
            }
        }

        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 d2 i24 = " + i23 + "," + Double.doubleToLongBits(d2) + "," + i24);
        FuzzerUtils.out.println("i25 i26 d3 = " + i25 + "," + i26 + "," + Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("s1 iArr3 dArr1 = " + s1 + "," + FuzzerUtils.checkSum(iArr3) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)));
        FuzzerUtils.out.println("fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.byFld bFld = " + Test.instanceCount + "," + Test.byFld + "," +
            (bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.bArrFld Test.iArrFld = " + FuzzerUtils.checkSum(Test.bArrFld) + "," +
            FuzzerUtils.checkSum(Test.iArrFld));

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
