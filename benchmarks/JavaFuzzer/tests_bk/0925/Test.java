// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:16 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-154L;
    public static int iFld=-13;
    public static double dFld=0.59811;
    public static short sFld=27370;
    public static boolean bFld=false;
    public int iFld1=-28582;
    public byte byFld=-35;
    public float fFld=-121.111F;
    public static int iArrFld[]=new int[N];
    public byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 204);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i5, boolean b, double d) {

        int i6=37391, i7=190, i8=3, i9=184, i10=-25;
        float f1=0.161F, f2=2.549F, fArr[]=new float[N];
        short s=-4683;

        FuzzerUtils.init(fArr, -2.361F);

        for (i6 = 2; i6 < 274; ++i6) {
            for (f1 = i6; f1 < 6; ++f1) {
                f2 = -28692L;
                switch ((int)(((f1 % 1) * 5) + 58)) {
                case 63:
                    i9 = 1;
                    while (++i9 < 1) {
                        Test.iFld = i9;
                        i5 = (int)Test.instanceCount;
                        switch (((i6 % 7) * 5) + 22) {
                        case 23:
                            Test.instanceCount += i9;
                            if (i10 != 0) {
                            }
                            d += f2;
                            Test.instanceCount = 2;
                        case 40:
                            try {
                                i5 = (i6 / 65);
                                i8 = (3081 / i6);
                                i10 = (Test.iArrFld[(int)(f1)] % i10);
                            } catch (ArithmeticException a_e) {}
                            f2 = s;
                            break;
                        case 32:
                            Test.instanceCount += i9;
                        case 50:
                            if (i10 != 0) {
                            }
                            break;
                        case 52:
                            fArr[i9] = i5;
                            break;
                        case 27:
                            Test.iFld += (i9 * i9);
                        case 56:
                            i8 += (i9 * f1);
                            break;
                        }
                    }
                default:
                    i8 += (int)(f1 * i10);
                }
            }
        }
        long meth_res = i5 + (b ? 1 : 0) + Double.doubleToLongBits(d) + i6 + i7 + Float.floatToIntBits(f1) + i8 +
            Float.floatToIntBits(f2) + i9 + i10 + s + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth() {

        int i4=60288, i11=8, i12=-18295, i13=-46762, i14=-40888;
        boolean b1=false;
        byte by2=-16;
        float f3=-3.460F;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, 36862L);

        lArr[(-70 >>> 1) % N][(i4 >>> 1) % N] = (((++Test.instanceCount) - (Test.instanceCount + Test.iFld)) +
            (iMeth1(i4, b1, Test.dFld) * Test.iFld));
        Test.sFld >>= (short)Test.iFld;
        i11 = 1;
        while (++i11 < 212) {
            Test.iFld = (int)Test.dFld;
            lArr[i11][i11 + 1] = by2;
            for (i12 = 1; 8 > i12; ++i12) {
                i14 = 1;
                do {
                    Test.sFld += (short)i11;
                    Test.iFld = i11;
                    f3 += i14;
                    byArrFld[i11 + 1] += (byte)-86;
                    by2 -= (byte)i4;
                    i13 |= i12;
                    i13 -= by2;
                    try {
                        i13 = (Test.iFld / 145);
                        i4 = (1114751400 % i13);
                        Test.iFld = (Test.iArrFld[i14 + 1] % -182);
                    } catch (ArithmeticException a_e) {}
                } while (++i14 < 2);
            }
        }
        long meth_res = i4 + (b1 ? 1 : 0) + i11 + by2 + i12 + i13 + i14 + Float.floatToIntBits(f3) +
            FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth(int i, byte by, byte by1) {

        int i1=-125, i2=-167, i3=-54, i15=-83, i16=-228;
        float f=-105.745F;

        for (i1 = 5; 167 > i1; i1 += 2) {
            i3 = 1;
            do {
                i2 = (int)(i3 * (Test.instanceCount = Math.abs(77)));
                i2 /= (int)((long)(f) | 1);
                Test.instanceCount -= Long.reverseBytes(Math.max(i1, i2) - iMeth());
                Test.bFld = false;
                Test.instanceCount = by;
                if (Test.iFld != 0) {
                    vMeth_check_sum += i + by + by1 + i1 + i2 + i3 + Float.floatToIntBits(f) + i15 + i16;
                    return;
                }
                Test.dFld += Test.instanceCount;
                switch ((i3 % 3) + 112) {
                case 112:
                    i2 -= i3;
                    for (i15 = 1; i15 < 1; ++i15) {
                        if (i3 != 0) {
                            vMeth_check_sum += i + by + by1 + i1 + i2 + i3 + Float.floatToIntBits(f) + i15 + i16;
                            return;
                        }
                        Test.instanceCount -= i1;
                        i2 >>= Test.iFld;
                    }
                    break;
                case 113:
                    try {
                        iFld1 = (Test.iArrFld[i3 + 1] / -54585);
                        i16 = (i2 / Test.iArrFld[i3]);
                        Test.iFld = (169 % i3);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 114:
                    i += (i3 * i3);
                default:
                    Test.iFld >>>= i2;
                }
            } while (++i3 < 19);
        }
        vMeth_check_sum += i + by + by1 + i1 + i2 + i3 + Float.floatToIntBits(f) + i15 + i16;
    }

    public void mainTest(String[] strArr1) {

        int i17=53387, i18=-9, i19=-151, i20=43, i21=-59507, i22=-81, i23=-33110, i24=-2;
        double d1=0.45895;
        float fArr1[][]=new float[N][N];
        long lArr1[][]=new long[N][N];

        FuzzerUtils.init(fArr1, -4.507F);
        FuzzerUtils.init(lArr1, 3853685148481209465L);

        vMeth(-13, byFld, byFld);
        fArr1 = FuzzerUtils.float2array(N, (float)-104.1014F);
        for (i17 = 6; 158 > i17; i17++) {
            i19 = 1;
            do {
                fFld *= i19;
                byArrFld[i17 + 1] *= (byte)Test.instanceCount;
                lArr1[i19][i17 - 1] = i19;
                for (i20 = 1; i20 < 1; ++i20) {
                    Test.iArrFld[i17 - 1] >>= 2612;
                    Test.dFld -= 86;
                }
            } while (++i19 < 165);
            iFld1 = 6;
            i18 = Test.iFld;
            fFld -= Test.instanceCount;
            i21 = 46364;
            switch (((i17 % 9) * 5) + 77) {
            case 99:
            case 121:
                switch ((((iFld1 >>> 1) % 8) * 5) + 119) {
                case 157:
                    lArr1[i17 - 1][i17 + 1] *= Test.instanceCount;
                    i21 += (i17 * i17);
                    if (Test.bFld) continue;
                    Test.sFld += (short)Test.instanceCount;
                case 149:
                    Test.iArrFld[i17 + 1] += -14;
                    for (i22 = 3; i22 < 165; ++i22) {
                        fArr1[i22][i17] = 97;
                    }
                    Test.dFld *= i17;
                    break;
                case 139:
                    d1 = 1;
                    do {
                        i24 = 1;
                        do {
                            if (true) break;
                            i23 = 244;
                            iFld1 <<= (int)Test.instanceCount;
                            i21 -= (int)Test.instanceCount;
                        } while (++i24 < 1);
                    } while (++d1 < 165);
                    break;
                case 151:
                    iFld1 = (int)Test.instanceCount;
                    break;
                case 148:
                    fFld = i23;
                    break;
                case 125:
                    i21 = Test.iFld;
                    break;
                case 120:
                case 129:
                    iFld1 += i17;
                    break;
                }
                break;
            case 111:
                fFld -= i19;
                break;
            case 118:
                Test.iArrFld[i17] -= i23;
                break;
            case 91:
                i21 += Test.iFld;
                break;
            case 119:
                if (Test.bFld) continue;
                break;
            case 82:
            case 112:
                i23 = i24;
            case 100:
                fArr1[i17 + 1][i17 + 1] -= i19;
            }
        }

        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 d1 i24 = " + i23 + "," + Double.doubleToLongBits(d1) + "," + i24);
        FuzzerUtils.out.println("fArr1 lArr1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + "," +
            FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.dFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.sFld Test.bFld iFld1 = " + Test.sFld + "," + (Test.bFld ? 1 : 0) + "," + iFld1);
        FuzzerUtils.out.println("byFld fFld Test.iArrFld = " + byFld + "," + Float.floatToIntBits(fFld) + "," +
            FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("byArrFld = " + FuzzerUtils.checkSum(byArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
