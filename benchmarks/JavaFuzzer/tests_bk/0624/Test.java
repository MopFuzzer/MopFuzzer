// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:08 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3174659764075807072L;
    public static boolean bFld=false;

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(float f, long l1, int i4) {

        int i5=78, i6=-5, i7=-31630, i8=0, i9=117, i10=-10, iArr1[]=new int[N];
        byte by1=-69;

        FuzzerUtils.init(iArr1, -12);

        if (Test.bFld) {
            i4 = i4;
        } else if (Test.bFld) {
            for (i5 = 3; i5 < 172; i5++) {
                for (i7 = 1; i7 < 9; ++i7) {
                    Test.instanceCount = i8;
                    by1 = (byte)i7;
                }
                i6 -= i8;
                l1 = i5;
                l1 *= l1;
            }
            i8 *= (int)f;
        }
        for (i9 = 359; i9 > 16; i9 -= 2) {
            iArr1[i9 - 1] = by1;
            i4 = i4;
            if (Test.bFld) break;
            i4 *= (int)Test.instanceCount;
        }
        vMeth1_check_sum += Float.floatToIntBits(f) + l1 + i4 + i5 + i6 + i7 + i8 + by1 + i9 + i10 +
            FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i2, long l) {

        int i3=41861, i11=-32619, i12=-55986, i13=55095, iArr2[]=new int[N];
        float f1=-1.781F;

        FuzzerUtils.init(iArr2, -143);

        i3 = 1;
        while (++i3 < 123) {
            i2 <<= -13;
            switch (((i3 % 7) * 5) + 41) {
            case 65:
                vMeth1(f1, -39365L, 58679);
                break;
            case 71:
                Test.instanceCount <<= i2;
                switch ((i3 % 2) + 94) {
                case 94:
                    i2 = (int)-2658894862L;
                    Test.instanceCount = i2;
                case 95:
                }
                for (i11 = 1; i11 < 13; ++i11) {
                    i12 = 35948;
                    i13 = 1;
                    while (++i13 < 2) {
                        i2 %= (int)-1.48640;
                        iArr2[i3] -= (int)Test.instanceCount;
                        i2 *= i3;
                        Test.bFld = Test.bFld;
                    }
                }
                break;
            case 44:
            case 66:
                i2 += (int)(-3381131815L + (i3 * i3));
            case 61:
                if (Test.bFld) continue;
            case 63:
                l += (i3 * i3);
                break;
            case 72:
                i2 -= i11;
            }
        }
        vMeth_check_sum += i2 + l + i3 + Float.floatToIntBits(f1) + i11 + i12 + i13 + FuzzerUtils.checkSum(iArr2);
    }

    public static int iMeth(byte by, double d) {

        int i14=26327, i15=248, i16=3, i17=10, i18=-8, i19=-35245, i20=-43749;
        short s=15230;
        float f2=65.928F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -5590722525026732158L);

        vMeth(-131, Test.instanceCount);
        for (i14 = 2; i14 < 203; ++i14) {
            switch ((i14 % 1) + 12) {
            case 12:
                i15 += i15;
                i15 = i15;
                for (i16 = 1; i16 < 8; ++i16) {
                    lArr[i14] <<= Test.instanceCount;
                    s += (short)(-214 + (i16 * i16));
                }
                break;
            default:
                Test.instanceCount += i14;
                d += s;
                f2 -= i14;
            }
            for (i18 = 1; i18 < 8; ++i18) {
                i20 = 2;
                do {
                    f2 += i15;
                    Test.bFld = false;
                } while (--i20 > 0);
            }
        }
        long meth_res = by + Double.doubleToLongBits(d) + i14 + i15 + i16 + i17 + s + Float.floatToIntBits(f2) + i18 +
            i19 + i20 + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-3, i1=53165, i21=12, i22=-28301, i23=-106, i24=23384, i25=-24642, i26=-34575, iArr[]=new int[N];
        byte by2=-24;
        double d1=51.106570, d2=-1.47160;
        float f3=-113.444F;
        long l2=3L;
        short s1=-22542;

        FuzzerUtils.init(iArr, 52373);

        for (i = 1; i < 163; i++) {
            Test.instanceCount = ((-(iArr[i - 1]++)) * (iMeth(by2, -46.69170) >> i));
            i1 <<= i;
        }
        for (i21 = 8; 201 > i21; ++i21) {
            i1 = i1;
            i22 -= i21;
            i22 = (int)-671018299L;
            i1 += (i21 | Test.instanceCount);
            i22 = i1;
            Test.instanceCount = -92;
        }
        i23 = 1;
        do {
            for (d1 = 3; d1 < 119; d1++) {
                i24 += (int)f3;
                for (l2 = 1; l2 < 2; ++l2) {
                    f3 += (((l2 * i22) + i23) - i23);
                    if (Test.bFld) continue;
                }
                i1 = i22;
                f3 -= i22;
                Test.instanceCount += (long)(((d1 * l2) + f3) - i25);
                i24 = -40;
            }
            i24 = by2;
        } while (++i23 < 211);
        i26 = 1;
        while (++i26 < 378) {
            switch ((i26 % 3) + 39) {
            case 39:
                Test.instanceCount += i;
                break;
            case 40:
                d2 = i;
                iArr[i26] |= i1;
                i1 *= (int)Test.instanceCount;
                d2 = s1;
                break;
            case 41:
                f3 += (i26 - by2);
                f3 *= f3;
                break;
            default:
                f3 -= i24;
            }
        }

        FuzzerUtils.out.println("i i1 by2 = " + i + "," + i1 + "," + by2);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("d1 i24 f3 = " + Double.doubleToLongBits(d1) + "," + i24 + "," +
            Float.floatToIntBits(f3));
        FuzzerUtils.out.println("l2 i25 i26 = " + l2 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("d2 s1 iArr = " + Double.doubleToLongBits(d2) + "," + s1 + "," +
            FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld = " + Test.instanceCount + "," + (Test.bFld ? 1 : 0));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}