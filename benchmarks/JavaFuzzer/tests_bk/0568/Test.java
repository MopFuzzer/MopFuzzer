// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:07 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=28626L;
    public static float fFld=-116.652F;
    public byte byFld=82;
    public volatile short sFld=-32726;
    public byte byArrFld[][]=new byte[N][N];
    public long lArrFld[]=new long[N];
    public volatile int iArrFld[]=new int[N];
    public static float fArrFld[][]=new float[N][N];

    static {
        FuzzerUtils.init(Test.fArrFld, -2.523F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public void vMeth2(int i5, int i6) {

        int i7=29, i8=-29498, i9=-17461, i10=2, i11=12;
        float f1=0.537F;

        i7 = 1;
        do {
            for (i8 = 1; i8 < 6; ++i8) {
                lArrFld = lArrFld;
                lArrFld[i8 + 1] <<= 165;
                for (i10 = 1; i10 < 2; ++i10) {
                    Test.instanceCount = i7;
                    if (false) {
                        Test.instanceCount -= Test.instanceCount;
                    } else {
                        lArrFld = lArrFld;
                        Test.instanceCount += (i10 + f1);
                    }
                    iArrFld[i8] *= i9;
                    i9 >>>= i7;
                    Test.instanceCount = -123L;
                    Test.instanceCount &= i7;
                }
                f1 -= Test.instanceCount;
            }
        } while (++i7 < 271);
        vMeth2_check_sum += i5 + i6 + i7 + i8 + i9 + i10 + i11 + Float.floatToIntBits(f1);
    }

    public void vMeth1(float f, int i3, int i4) {

        boolean b=false;
        int i12=238, i13=21135;
        byte by=-93;
        short s=4475;
        double d1=-74.3942;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 0.188F);

        b = b;
        vMeth2(i4, i3);
        if (b) {
            i3 -= i4;
        }
        i12 = 166;
        do {
            i4 *= by;
            Test.instanceCount += by;
            i3 += i12;
            iArrFld[i12 - 1] = i12;
        } while (--i12 > 0);
        s *= (short)i4;
        d1 += i4;
        fArr[(i12 >>> 1) % N] += i13;
        Test.instanceCount += 8;
        i4 *= i3;
        vMeth1_check_sum += Float.floatToIntBits(f) + i3 + i4 + (b ? 1 : 0) + i12 + by + s +
            Double.doubleToLongBits(d1) + i13 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void vMeth(int i1, int i2) {

        double d=-126.34527;
        int i14=-210, i15=-9, i16=-7, i17=14, i18=-225, i19=-21989, i20=25960, iArr[][]=new int[N][N];
        float f2=33.892F;
        short s1=-16863;

        FuzzerUtils.init(iArr, -5);

        d = (++i1);
        i2 *= iArr[(i1 >>> 1) % N][(i2 >>> 1) % N];
        vMeth1(Test.fFld, -53169, 8055);
        for (i14 = 5; i14 < 162; ++i14) {
            if (i2 != 0) {
                vMeth_check_sum += i1 + i2 + Double.doubleToLongBits(d) + i14 + i15 + i16 + i17 + i18 + i19 +
                    Float.floatToIntBits(f2) + i20 + s1 + FuzzerUtils.checkSum(iArr);
                return;
            }
            for (i16 = 1; i16 < 10; ++i16) {
                i17 = -11696;
                switch (((i14 >>> 1) % 10) + 87) {
                case 87:
                    Test.instanceCount += i2;
                    for (i18 = 1; i18 < 2; i18++) {
                        Test.instanceCount += i17;
                        i17 = i15;
                        i17 -= (int)Test.instanceCount;
                        Test.instanceCount *= -2;
                        i1 -= (int)f2;
                    }
                    break;
                case 88:
                    i17 = (int)d;
                case 89:
                    Test.instanceCount = Test.instanceCount;
                    break;
                case 90:
                    iArr[i14 - 1][i16] = i19;
                    break;
                case 91:
                    d += i14;
                    break;
                case 92:
                    try {
                        i15 = (-110 % i20);
                        iArr[i16][i14 + 1] = (i14 % iArrFld[i14 - 1]);
                        i20 = (-16114 % i14);
                    } catch (ArithmeticException a_e) {}
                case 93:
                    Test.fFld -= i2;
                    break;
                case 94:
                    i17 >>= i2;
                    break;
                case 95:
                    s1 *= (short)-54L;
                case 96:
                    iArr[i14 - 1][i14 - 1] = i15;
                    break;
                default:
                    i2 -= i2;
                }
            }
        }
        vMeth_check_sum += i1 + i2 + Double.doubleToLongBits(d) + i14 + i15 + i16 + i17 + i18 + i19 +
            Float.floatToIntBits(f2) + i20 + s1 + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i=-38443, i21=0, i22=12, i24=-46428, i25=61940, i26=181, i27=-3, i28=-2, iArr1[][]=new int[N][N];
        boolean b1=true;
        double d2=-1.2792;

        FuzzerUtils.init(iArr1, 40792);

        i = 1;
        do {
            byArrFld = byArrFld;
        } while (++i < 267);
        vMeth(i, i);
        for (i21 = 11; i21 < 214; ++i21) {
            switch ((((i >>> 1) % 3) * 5) + 92) {
            case 102:
                i24 = 1;
                while (++i24 < 124) {
                    i22 -= (int)10.12962;
                    i22 *= 61;
                    i22 <<= i21;
                    i22 += (int)113L;
                    i22 = i24;
                    if (b1) continue;
                }
                for (i25 = 124; i25 > 4; i25--) {
                    i22 += i25;
                    i22 = i;
                    Test.fArrFld[i21 - 1][i25] += -40124;
                }
                break;
            case 100:
                i22 *= i22;
                if (b1) {
                    byFld = (byte)-53868;
                    i22 = i26;
                    sFld += (short)(((i21 * i25) + Test.instanceCount) - i);
                } else {
                    i26 |= (int)Test.instanceCount;
                    i22 = (int)Test.instanceCount;
                }
                Test.fFld *= (float)d2;
                iArr1 = iArr1;
                break;
            case 97:
                if (b1) {
                    if (b1) {
                        for (i27 = 3; i27 < 124; ++i27) {
                            iArr1[i27 - 1][i21] = i;
                            d2 /= ((long)(d2) | 1);
                        }
                    } else {
                        Test.instanceCount *= i;
                    }
                } else {
                    d2 -= i21;
                }
                break;
            }
        }

        FuzzerUtils.out.println("i i21 i22 = " + i + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i24 b1 i25 = " + i24 + "," + (b1 ? 1 : 0) + "," + i25);
        FuzzerUtils.out.println("i26 d2 i27 = " + i26 + "," + Double.doubleToLongBits(d2) + "," + i27);
        FuzzerUtils.out.println("i28 iArr1 = " + i28 + "," + FuzzerUtils.checkSum(iArr1));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld byFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + byFld);
        FuzzerUtils.out.println("sFld byArrFld lArrFld = " + sFld + "," + FuzzerUtils.checkSum(byArrFld) + "," +
            FuzzerUtils.checkSum(lArrFld));
        FuzzerUtils.out.println("iArrFld Test.fArrFld = " + FuzzerUtils.checkSum(iArrFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));

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
