// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:10 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=1479114004L;
    public static float fFld=2.834F;
    public static double dFld=0.47445;
    public int iFld=20156;
    public byte byArrFld[]=new byte[N];

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(long l, long l1, long l2) {

        int i11=-1, i12=4, i13=-35357, i14=-57985, i15=161, i16=35, i17=52510, i18=-10, iArr1[][]=new int[N][N];
        byte byArr[][]=new byte[N][N];
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr1, -169);
        FuzzerUtils.init(byArr, (byte)-106);
        FuzzerUtils.init(fArr, 38.221F);

        for (i11 = 169; 4 < i11; --i11) {
            i12 += i12;
            iArr1[i11][i11 + 1] = 37651;
            i12 = (int)Test.instanceCount;
            i12 += (i11 * Test.fFld);
        }
        byArr[(14 >>> 1) % N][(i12 >>> 1) % N] = (byte)-30;
        i12 >>= i12;
        i12 *= i12;
        fArr[(i12 >>> 1) % N] += 20603L;
        for (i13 = 9; i13 < 300; i13++) {
            for (i15 = i13; i15 < 6; i15++) {
                for (i17 = 1; i17 > 1; i17 -= 3) {
                    iArr1[i17][i17] ^= 21923;
                    i12 = i15;
                    iArr1[i13 - 1][i15] = (int)Test.dFld;
                }
            }
        }
        vMeth_check_sum += l + l1 + l2 + i11 + i12 + i13 + i14 + i15 + i16 + i17 + i18 + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(byArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static int iMeth1() {

        int i7=-187, i8=-194, i9=-8, i10=-96, iArr2[]=new int[N];
        short s=-9123;

        FuzzerUtils.init(iArr2, 232);

        i7 = 1;
        do {
            byte by=26;
            i8 += (int)((-(++i8)) + ((i8 + by) + Test.instanceCount));
            Test.instanceCount += (i7 * i7);
            for (i9 = 1; i9 < 6; i9 += 3) {
                i10 ^= (i7 - (++i10));
                i8 -= (int)(++Test.instanceCount);
                i8 += (-2560 + (i9 * i9));
                vMeth(Test.instanceCount, Test.instanceCount, Test.instanceCount);
                i8 ^= i8;
                switch (((i10 >>> 1) % 8) + 62) {
                case 62:
                    Test.dFld = Test.fFld;
                    iArr2[i9 - 1] = -222;
                    break;
                case 63:
                    Test.instanceCount += (((i9 * Test.instanceCount) + Test.instanceCount) - i10);
                    s = (short)i9;
                    break;
                case 64:
                    Test.fFld = by;
                    break;
                case 65:
                    by |= (byte)i7;
                    break;
                case 66:
                    i10 *= i7;
                    break;
                case 67:
                    i10 *= (int)Test.instanceCount;
                case 68:
                case 69:
                    i8 *= i7;
                }
            }
        } while (++i7 < 279);
        long meth_res = i7 + i8 + i9 + i10 + s + FuzzerUtils.checkSum(iArr2);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i3) {

        int i4=-8, i5=-52, i6=-13, i19=23100, i20=-9, i21=-12, i22=-197, iArr3[]=new int[N];
        byte by1=-102;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr3, -39311);
        FuzzerUtils.init(lArr, -2891879152L);

        i3 -= (int)((++i3) + (Test.instanceCount--));
        i4 = 1;
        do {
            for (i5 = 1; i5 < 7; ++i5) {
                i3 = (int)((Test.fFld--) * ((i3--) + (i3 - i5)));
            }
            i3 = Math.min(i6++, iMeth1());
            Test.fFld = i5;
            Test.fFld -= i3;
            i3 = 82;
            i6 += (5935 + (i4 * i4));
        } while (++i4 < 217);
        Test.instanceCount = i3;
        for (i19 = 4; i19 < 377; ++i19) {
            for (i21 = i19; 5 > i21; ++i21) {
                iArr3[i19] -= by1;
                if (false) break;
                lArr[i21 - 1] = 4;
            }
        }
        long meth_res = i3 + i4 + i5 + i6 + i19 + i20 + i21 + i22 + by1 + FuzzerUtils.checkSum(iArr3) +
            FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i1=15680, i2=6, i23=-158, i24=78, i25=-22890, i26=-27892, i27=-14839, i28=8, iArr[]=new int[N];
        long l3=226199100L, lArr1[]=new long[N];
        short s1=11191;
        float fArr1[]=new float[N];

        FuzzerUtils.init(iArr, 11);
        FuzzerUtils.init(lArr1, 4811940095697261837L);
        FuzzerUtils.init(fArr1, -81.47F);

        for (int i : iArr) {
            for (i1 = 2; i1 < 63; ++i1) {
                iArr[i1 + 1] = iMeth(i2);
                i2 *= -51694;
                Test.dFld += 28413;
                Test.fFld = 47;
                i2 >>>= 13186;
            }
            i2 ^= (int)6L;
            lArr1[(i >>> 1) % N] = 37090;
            iArr[(i1 >>> 1) % N] = i;
            fArr1[(i >>> 1) % N] -= -48079;
            for (l3 = 3; l3 < 63; l3++) {
                iArr[(int)(l3 - 1)] = 71;
                byArrFld[(int)(l3 + 1)] -= (byte)Test.dFld;
                for (i24 = 2; i24 > l3; i24--) {
                    Test.instanceCount += (i24 * i24);
                    iFld = i1;
                    Test.dFld += 9;
                    i %= (int)(s1 | 1);
                    Test.instanceCount = i24;
                }
            }
            i += i23;
            i25 <<= i23;
            Test.instanceCount = s1;
            lArr1[(i2 >>> 1) % N] = -2820327504213732401L;
        }
        iArr[(-137 >>> 1) % N] += 9;
        i26 = 1;
        while (++i26 < 329) {
            for (i27 = i26; i27 < 76; i27++) {
                iArr[i27 + 1] = i2;
                i25 += i27;
                fArr1[i27 - 1] += l3;
            }
        }

        FuzzerUtils.out.println("i1 i2 l3 = " + i1 + "," + i2 + "," + l3);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("s1 i26 i27 = " + s1 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("i28 iArr lArr1 = " + i28 + "," + FuzzerUtils.checkSum(iArr) + "," +
            FuzzerUtils.checkSum(lArr1));
        FuzzerUtils.out.println("fArr1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.dFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("iFld byArrFld = " + iFld + "," + FuzzerUtils.checkSum(byArrFld));

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
