// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:09 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-1069L;
    public static float fFld=-32.289F;
    public static double dFld=-24.22222;
    public static boolean bFld=true;
    public static byte byFld=83;
    public int iFld=-137;
    public static long lArrFld[][]=new long[N][N];
    public int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 2518426917L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i6, int i7) {

        int i8=-6, i9=35743, i10=187, i11=8, i12=-9, iArr[]=new int[N];

        FuzzerUtils.init(iArr, 11);

        i8 = 147;
        do {
            iArr[i8] = i6;
            for (i9 = 1; i9 < 31; i9++) {
                i11 = 1;
                while (++i11 < 2) {
                    Test.fFld = Test.instanceCount;
                    iArr[i9 - 1] += i9;
                    switch (((i7 >>> 1) % 1) + 42) {
                    case 42:
                        iArr[i9] = i6;
                        i7 = i7;
                    default:
                        switch (((i9 % 1) * 5) + 62) {
                        case 67:
                            Test.instanceCount *= (long)Test.dFld;
                            i7 <<= 3;
                        }
                        Test.dFld = -22366;
                        i12 = i8;
                    }
                    i7 -= i11;
                }
            }
        } while ((i8 -= 3) > 0);
        long meth_res = i6 + i7 + i8 + i9 + i10 + i11 + i12 + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i3) {

        int i4=55, i5=57066, i13=54, i14=158, i15=-124, i16=-23910, iArr1[]=new int[N];
        long l=4451298455100892374L, lArr[]=new long[N];
        byte by=-34, byArr1[]=new byte[N];

        FuzzerUtils.init(byArr1, (byte)63);
        FuzzerUtils.init(lArr, -135L);
        FuzzerUtils.init(iArr1, -30);

        for (i4 = 267; i4 > 9; i4--) {
            Test.fFld -= (Test.instanceCount--);
            l |= by;
            i5 += byArr1[i4];
            i5 += (((i4 * i5) + Test.fFld) - i3);
            if ((lArr[i4 - 1] + ((--Test.dFld) + (Test.fFld * Test.fFld))) <= (i3 = (iMeth(i4, i4) + i3))) break;
            i3 = (int)Test.dFld;
            iArr1[i4] = i3;
            for (i13 = 1; 6 > i13; ++i13) {
                i5 -= 33101;
                switch (((i4 % 10) * 5) + 125) {
                case 169:
                    i5 -= i14;
                    i14 += -179;
                    l *= (long)Test.dFld;
                    lArr[(-4895 >>> 1) % N] |= i5;
                    break;
                case 161:
                    l += -127;
                case 159:
                    iArr1[i4 + 1] = i14;
                    break;
                case 171:
                    try {
                        i14 = (i3 / 3);
                        i3 = (144 / i5);
                        i15 = (i5 % -193);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 167:
                    Test.instanceCount = (long)Test.fFld;
                    break;
                case 130:
                    Test.dFld %= (i14 | 1);
                    break;
                case 175:
                    Test.fFld *= i3;
                    break;
                case 158:
                    i5 += (i13 * i5);
                case 129:
                    i16 -= i5;
                    break;
                case 134:
                    i14 += (39646 + (i13 * i13));
                }
            }
        }
        vMeth1_check_sum += i3 + i4 + i5 + l + by + i13 + i14 + i15 + i16 + FuzzerUtils.checkSum(byArr1) +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i) {

        double d=1.6740;
        short s=3156;
        int i1=-162, i2=105, i17=-10, i18=11, i19=-123, i20=6, iArr2[]=new int[N];
        byte byArr[]=new byte[N];
        long lArr1[]=new long[N];
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(byArr, (byte)-56);
        FuzzerUtils.init(lArr1, 30437L);
        FuzzerUtils.init(iArr2, -36972);
        FuzzerUtils.init(bArr, false);

        d += s;
        byArr[(i >>> 1) % N] = (byte)(++i);
        for (i1 = 6; i1 < 171; ++i1) {
            vMeth1(i2);
            i = (int)Test.fFld;
            Test.instanceCount <<= i;
            lArr1[i1] = i2;
            switch (((i >>> 1) % 10) + 81) {
            case 81:
                for (i17 = i1; i17 < 10; ++i17) {
                    Test.fFld = -30535;
                    for (i19 = i1; 1 > i19; i19++) {
                        i *= i20;
                        if (i17 != 0) {
                            vMeth_check_sum += i + Double.doubleToLongBits(d) + s + i1 + i2 + i17 + i18 + i19 + i20 +
                                FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr2)
                                + FuzzerUtils.checkSum(bArr);
                            return;
                        }
                        i -= i19;
                        d -= -12;
                    }
                }
            case 82:
                if (i20 != 0) {
                    vMeth_check_sum += i + Double.doubleToLongBits(d) + s + i1 + i2 + i17 + i18 + i19 + i20 +
                        FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr2) +
                        FuzzerUtils.checkSum(bArr);
                    return;
                }
            case 83:
                Test.fFld += (i1 * i19);
                break;
            case 84:
                iArr2[i1 - 1] = 10;
                break;
            case 85:
                iArr2[i1 + 1] = (int)Test.instanceCount;
                break;
            case 86:
                i18 >>>= i17;
            case 87:
                s *= (short)i20;
                break;
            case 88:
                Test.instanceCount -= i19;
                break;
            case 89:
                if (i20 != 0) {
                    vMeth_check_sum += i + Double.doubleToLongBits(d) + s + i1 + i2 + i17 + i18 + i19 + i20 +
                        FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr2) +
                        FuzzerUtils.checkSum(bArr);
                    return;
                }
            case 90:
            default:
                bArr[(i1 >>> 1) % N] = Test.bFld;
            }
        }
        vMeth_check_sum += i + Double.doubleToLongBits(d) + s + i1 + i2 + i17 + i18 + i19 + i20 +
            FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr2) +
            FuzzerUtils.checkSum(bArr);
    }

    public void mainTest(String[] strArr1) {

        int i21=1, i22=-52829, i23=237, i24=-133, i25=-253, i26=197, i27=-24978, i28=9;
        short s1=-1062;
        long l1=3924573615L;

        vMeth(i21);
        i22 = 1;
        do {
            Test.fFld -= s1;
            Test.byFld += (byte)(((i22 * Test.fFld) + i21) - i21);
            for (i23 = 4; 107 > i23; ++i23) {
                s1 += (short)(((i23 * i22) + iFld) - i23);
                Test.byFld /= (byte)((long)(Test.fFld) | 1);
                for (l1 = 1; l1 < 2; ++l1) {
                    i21 = (int)Test.instanceCount;
                    Test.instanceCount = (long)Test.dFld;
                    i25 = (int)Test.instanceCount;
                    Test.fFld -= iFld;
                    Test.fFld += (((l1 * iFld) + i21) - i21);
                    iFld += i21;
                }
                Test.instanceCount >>>= 15;
                Test.instanceCount *= (long)Test.dFld;
                Test.instanceCount = i25;
                iFld += (-108 + (i23 * i23));
            }
            Test.lArrFld[i22 + 1][i22] *= i22;
            i26 = 1;
            do {
                iArrFld[i26 - 1] -= iFld;
                i21 += i26;
                Test.instanceCount -= 3723436846L;
                for (i27 = 1; 1 < i27; i27--) {
                    i24 = 233;
                    Test.lArrFld[i27 + 1] = FuzzerUtils.long1array(N, (long)-1L);
                    iFld += (((i27 * Test.fFld) + i22) - i25);
                    i24 = i28;
                    Test.instanceCount += (((i27 * iFld) + s1) - i21);
                }
            } while (++i26 < 107);
            i25 += (int)(3L + (i22 * i22));
        } while (++i22 < 234);

        FuzzerUtils.out.println("i21 i22 s1 = " + i21 + "," + i22 + "," + s1);
        FuzzerUtils.out.println("i23 i24 l1 = " + i23 + "," + i24 + "," + l1);
        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("i28 = " + i28);

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.dFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.bFld Test.byFld iFld = " + (Test.bFld ? 1 : 0) + "," + Test.byFld + "," + iFld);
        FuzzerUtils.out.println("Test.lArrFld iArrFld = " + FuzzerUtils.checkSum(Test.lArrFld) + "," +
            FuzzerUtils.checkSum(iArrFld));

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
