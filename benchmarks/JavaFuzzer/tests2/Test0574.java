// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:38 2023
public class Test0574 {

    public static final int N = 400;

    public static long instanceCount=310335622L;
    public static float fFld=-43.276F;
    public short sFld=-23248;

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i5) {

        int i6=6;
        int i7=16900;
        int i8=11;
        int i9=-9;
        int i10=41746;
        int[] iArr2 =new int[N];
        short[] sArr =new short[N];

        FuzzerUtils.init(sArr, (short)21312);
        FuzzerUtils.init(iArr2, -5);

        for (i6 = 3; i6 < 257; ++i6) {
            i8 = 1;
            do {
                sArr[i6 - 1] >>= (short) Test0574.instanceCount;
                iArr2[i8] *= (int) Test0574.instanceCount;
                i5 += (i8 * Test0574.fFld);
                for (i9 = 1; 1 > i9; ++i9) {
                    Test0574.instanceCount += i8;
                }
                i7 += (i8 * i8);
            } while (++i8 < 6);
            Test0574.instanceCount = i10;
        }
        vMeth1_check_sum += i5 + i6 + i7 + i8 + i9 + i10 + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr2);
    }

    public static long lMeth() {

        int i3=-1;
        int i4=58758;
        int i11=-52251;
        int i12=34918;
        int i13=4;
        int i14=-170;
        int[] iArr1 =new int[N];
        byte by=-24;
        double d1=0.64083;
        long[] lArr =new long[N];
        boolean[] bArr =new boolean[N];

        FuzzerUtils.init(lArr, -14L);
        FuzzerUtils.init(iArr1, 39512);
        FuzzerUtils.init(bArr, true);

        i3 = (int)Math.abs(lArr[(-117 >>> 1) % N] + (iArr1[(i3 >>> 1) % N]--));
        i4 = 1;
        do {
            Test0574.instanceCount = by;
            vMeth1(-12);
            i3 <<= -34612;
            i3 += i3;
            lArr[i4 + 1] = Test0574.instanceCount;
            if (i4 != 0) {
            }
            for (i11 = 1; i11 < 10; i11 += 3) {
                i12 -= (int)d1;
                for (i13 = i11; 4 > i13; i13++) {
                    i3 *= i14;
                    if (i12 != 0) {
                    }
                    bArr[i4] = true;
                    Test0574.fFld = 27450;
                }
            }
        } while (++i4 < 152);
        long meth_res = i3 + i4 + by + i11 + i12 + Double.doubleToLongBits(d1) + i13 + i14 + FuzzerUtils.checkSum(lArr)
            + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(bArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i1, long l, int i2) {

        double d2=-79.87058;
        int i15=57353;
        int i16=-16519;
        int i17=65094;
        int i18=-6;
        int[] iArr3 =new int[N];
        float f1=-71.45F;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(iArr3, 13);
        FuzzerUtils.init(lArr1, -3689236258655475381L);

        lMeth();
        iArr3 = FuzzerUtils.int1array(N, (int)-2);
        Test0574.instanceCount = (long) Test0574.fFld;
        i1 = (int)d2;
        for (i15 = 334; i15 > 3; i15--) {
            Test0574.instanceCount -= 86;
        }
        Test0574.fFld = Test0574.instanceCount;
        i17 = 1;
        while (++i17 < 296) {
            for (f1 = 1; f1 < 6; ++f1) {
                if (false) {
                    Test0574.fFld = -11;
                    Test0574.instanceCount += (long) f1;
                } else {
                    i16 += (int)21L;
                    lArr1[i17 - 1] |= -124;
                    if (i17 != 0) {
                        vMeth_check_sum += i1 + l + i2 + Double.doubleToLongBits(d2) + i15 + i16 + i17 +
                            Float.floatToIntBits(f1) + i18 + FuzzerUtils.checkSum(iArr3) + FuzzerUtils.checkSum(lArr1);
                        return;
                    }
                }
            }
        }
        vMeth_check_sum += i1 + l + i2 + Double.doubleToLongBits(d2) + i15 + i16 + i17 + Float.floatToIntBits(f1) + i18
            + FuzzerUtils.checkSum(iArr3) + FuzzerUtils.checkSum(lArr1);
    }

    public void mainTest(String[] strArr1) {

        float f=-121.1016F;
        int i=-9;
        int i19=-14;
        int i20=62708;
        int i21=46;
        int i22=-7;
        int i23=-245;
        int i24=195;
        int i25=79;
        int[] iArr =new int[N];
        double d=41.21616;
        boolean b=true;
        boolean[] bArr1 =new boolean[N];
        byte by1=65;

        FuzzerUtils.init(iArr, -5652);
        FuzzerUtils.init(bArr1, true);

        f *= (iArr[(i >>> 1) % N]++);
        d = ((i <<= (iArr[(i >>> 1) % N]--)) + ((-(f += 1)) + (Test0574.instanceCount + i)));
        vMeth(240, Test0574.instanceCount, i);
        switch (((i >>> 1) % 7) + 104) {
        case 104:
            Test0574.instanceCount -= i;
            Test0574.instanceCount |= 3;
            break;
        case 105:
            for (i19 = 22; i19 < 389; ++i19) {
                i |= i;
            }
            Test0574.fFld -= (float) d;
            for (i21 = 12; i21 < 312; i21++) {
                if (false) break;
                for (i23 = 5; i23 < 84; ++i23) {
                    i25 = 1;
                    do {
                        switch ((i21 % 8) + 113) {
                        case 113:
                            d *= i19;
                            if (b) {
                                i *= (int) Test0574.fFld;
                            } else if (b) {
                                switch (((i21 % 1) * 5) + 81) {
                                case 82:
                                    i24 *= (int) Test0574.instanceCount;
                                    i22 += (-38055 + (i25 * i25));
                                }
                                d -= 14;
                            } else {
                                d -= i24;
                                Test0574.fFld = Test0574.instanceCount;
                            }
                        case 114:
                            i20 <<= (int) Test0574.instanceCount;
                            i += i25;
                        case 115:
                            switch ((i21 % 2) + 33) {
                            case 33:
                                i22 = (int) Test0574.instanceCount;
                                Test0574.fFld = Test0574.instanceCount;
                                break;
                            case 34:
                                Test0574.fFld += (float) d;
                            }
                        case 116:
                            i22 %= 38;
                        case 117:
                            by1 &= (byte)-197;
                            break;
                        case 118:
                        case 119:
                            d += f;
                        case 120:
                        default:
                            Test0574.instanceCount += i20;
                        }
                    } while (++i25 < 2);
                }
            }
        case 106:
            i24 = -146;
            break;
        case 107:
        case 108:
            iArr[(i23 >>> 1) % N] >>>= 37;
        case 109:
            iArr[(i21 >>> 1) % N] = 2;
            break;
        case 110:
            i24 -= sFld;
            break;
        default:
            bArr1[(i19 >>> 1) % N] = b;
        }

        FuzzerUtils.out.println("f i d = " + Float.floatToIntBits(f) + "," + i + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 b by1 = " + i25 + "," + (b ? 1 : 0) + "," + by1);
        FuzzerUtils.out.println("iArr bArr1 = " + FuzzerUtils.checkSum(iArr) + "," + FuzzerUtils.checkSum(bArr1));

        FuzzerUtils.out.println("Test0574.instanceCount Test0574.fFld sFld = " + Test0574.instanceCount + "," +
                Float.floatToIntBits(Test0574.fFld) + "," + sFld);

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0574 _instance = new Test0574();
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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}