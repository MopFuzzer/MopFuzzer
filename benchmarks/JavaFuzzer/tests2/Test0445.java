// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:32 2023
public class Test0445 {

    public static final int N = 400;

    public static long instanceCount=8800333263604636680L;
    public boolean bFld=false;
    public static int iFld=-9;
    public static boolean bFld1=false;
    public static double dFld=75.106284;
    public static volatile long[][] lArrFld =new long[N][N];
    public int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0445.lArrFld, 13736L);
    }

    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(float f1, int i6, float f2) {

        int i7=54;
        int i8=78;
        int i9=-60;
        int i10=230;
        int i11=46290;
        int i12=-3;
        int[] iArr2 =new int[N];
        double d1=14.25243;
        byte[] byArr =new byte[N];

        FuzzerUtils.init(byArr, (byte)-63);
        FuzzerUtils.init(iArr2, 219);

        i6 -= -24618;
        f1 = Test0445.instanceCount;
        for (i7 = 6; i7 < 258; ++i7) {
            i8 = i6;
        }
        for (i9 = 8; i9 < 251; i9 += 2) {
            i10 += (((i9 * i6) + Test0445.instanceCount) - i7);
        }
        for (byte by1 : byArr) {
            iArr2[(38968 >>> 1) % N] += Test0445.iFld;
            Test0445.iFld = i9;
            for (i11 = 4; i11 > 1; i11 -= 2) {
                i8 += i8;
                i10 += Test0445.iFld;
                i12 /= (int)((long)(d1) | 1);
                i12 >>= i6;
                i12 += i8;
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f1) + i6 + Float.floatToIntBits(f2) + i7 + i8 + i9 + i10 + i11 + i12 +
            Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr2);
    }

    public static int iMeth(double d, int i2) {

        int i3=-89;
        int i4=-136;
        int i5=151;
        int[] iArr1 =new int[N];
        float f=-1.283F;
        byte[] byArr1 =new byte[N];

        FuzzerUtils.init(iArr1, -32265);
        FuzzerUtils.init(byArr1, (byte)-121);

        i2 = iArr1[(i2 >>> 1) % N];
        for (i3 = 2; 194 > i3; i3++) {
            switch ((((((int) (Test0445.instanceCount + Test0445.iFld)) >>> 1) % 10) * 5) + 96) {
            case 132:
            case 120:
                switch (((iArr1[i3 + 1] >>> 1) % 3) + 73) {
                case 73:
                    i2 += (((i3 * i3) + f) - i3);
                    break;
                case 74:
                    i2 += (int) ((-(Test0445.instanceCount * i2)) - (Test0445.instanceCount++));
                    i2 -= (i2--);
                    i5 = 1;
                    do {
                        Test0445.instanceCount += Test0445.instanceCount;
                        if (Test0445.iFld != 0) {
                        }
                        vMeth(f, i3, f);
                        i4 = i3;
                        Test0445.iFld = i2;
                        d -= d;
                    } while (++i5 < 8);
                    if (Test0445.bFld1) break;
                    break;
                case 75:
                    iArr1[i3 + 1] += Test0445.iFld;
                    break;
                }
                break;
            case 134:
                i2 -= (int) Test0445.instanceCount;
                break;
            case 100:
                Test0445.instanceCount = i2;
                break;
            case 119:
                byArr1[i3 - 1] = (byte)i4;
                break;
            case 139:
                Test0445.instanceCount -= Test0445.instanceCount;
                break;
            case 123:
                Test0445.iFld += Test0445.iFld;
                break;
            case 128:
                f += Test0445.instanceCount;
            case 99:
                i2 &= i3;
                break;
            case 111:
                f += -11;
                break;
            }
        }
        long meth_res = Double.doubleToLongBits(d) + i2 + i3 + i4 + Float.floatToIntBits(f) + i5 +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(byArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public long lMeth(byte by) {

        int i13=22;
        int i14=99;
        int i15=-221;
        int i16=-56329;
        int i17=0;
        int i18=50797;
        int i19=-225;
        int i20=-42918;
        int i21=29716;
        int[] iArr =new int[N];
        short s=-19956;

        FuzzerUtils.init(iArr, 31497);

        iArr[(Test0445.iFld >>> 1) % N] >>= iMeth(-52.51167, i13);
        iArr[(i13 >>> 1) % N] = s;
        for (i14 = 2; i14 < 285; ++i14) {
            Test0445.iFld += (-1 + (i14 * i14));
            if (Test0445.bFld1) {
                Test0445.instanceCount -= Test0445.instanceCount;
            } else {
                for (i16 = 6; i16 > 1; --i16) {
                    try {
                        Test0445.iFld = (i18 % -43458);
                        i13 = (i15 % i17);
                        i15 = (Test0445.iFld % 93);
                    } catch (ArithmeticException a_e) {}
                }
            }
            i18 -= i18;
            i18 <<= i18;
        }
        for (i19 = 297; i19 > 1; i19--) {
            Test0445.instanceCount = i15;
            i21 = 1;
            while (++i21 < 6) {
                Test0445.lArrFld[i21 - 1][i21] = i17;
                Test0445.instanceCount *= i18;
            }
        }
        long meth_res = by + i13 + s + i14 + i15 + i16 + i17 + i18 + i19 + i20 + i21 + FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-9, i1=224, i22=37, i23=0, i24=-24192, i25=14, i26=-231, i27=186;
        byte by2=18;
        float f3=0.677F;
        short s1=27416;
        long[] lArr =new long[N];
        boolean[] bArr =new boolean[N];

        FuzzerUtils.init(lArr, -13L);
        FuzzerUtils.init(bArr, true);

        lArr[(10188 >>> 1) % N] = -4189360980817308502L;
        bFld = bFld;
        for (i = 11; i < 176; ++i) {
            i1 = (int)lMeth(by2);
        }
        for (i22 = 11; i22 < 242; i22++) {
            for (i24 = 3; i24 < 109; i24++) {
                i25 = 91;
                Test0445.iFld += 13;
                switch ((i22 % 5) + 7) {
                case 7:
                    for (i26 = i22; i26 < 2; i26++) {
                        i1 >>= i23;
                        i27 -= i27;
                        i25 <<= (int) Test0445.instanceCount;
                        i23 += (((i26 * i1) + i23) - i25);
                        i23 = -129;
                        switch ((i22 % 8) + 5) {
                        case 5:
                            Test0445.instanceCount = Test0445.instanceCount;
                            f3 = s1;
                            break;
                        case 6:
                        case 7:
                            i23 = i23;
                            break;
                        case 8:
                            f3 -= Test0445.instanceCount;
                            if (Test0445.bFld1) {
                                f3 += f3;
                                i1 *= (int)f3;
                                i25 += i26;
                                Test0445.iFld += -19;
                            } else {
                                bArr[i26 - 1] = Test0445.bFld1;
                            }
                            break;
                        case 9:
                            i23 = (int) Test0445.dFld;
                            break;
                        case 10:
                            i1 -= s1;
                            i27 = by2;
                            by2 *= (byte) Test0445.dFld;
                            break;
                        case 11:
                        case 12:
                            i25 = (int)-54193L;
                        }
                    }
                case 8:
                    iArrFld[i24 - 1] = -77;
                    break;
                case 9:
                    s1 -= by2;
                    break;
                case 10:
                case 11:
                    i25 -= (int) Test0445.instanceCount;
                    break;
                }
            }
        }

        FuzzerUtils.out.println("i i1 by2 = " + i + "," + i1 + "," + by2);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("f3 s1 lArr = " + Float.floatToIntBits(f3) + "," + s1 + "," +
            FuzzerUtils.checkSum(lArr));
        FuzzerUtils.out.println("bArr = " + FuzzerUtils.checkSum(bArr));

        FuzzerUtils.out.println("Test0445.instanceCount bFld Test0445.iFld = " + Test0445.instanceCount + "," + (bFld ? 1 : 0) +
                "," + Test0445.iFld);
        FuzzerUtils.out.println("Test0445.bFld1 Test0445.dFld Test0445.lArrFld = " + (Test0445.bFld1 ? 1 : 0) + "," +
                Double.doubleToLongBits(Test0445.dFld) + "," + FuzzerUtils.checkSum(Test0445.lArrFld));
        FuzzerUtils.out.println("iArrFld = " + FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0445 _instance = new Test0445();
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  iMeth ->  iMeth lMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
