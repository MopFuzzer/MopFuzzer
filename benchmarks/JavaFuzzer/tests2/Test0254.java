// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:23 2023
public class Test0254 {

    public static final int N = 400;

    public static long instanceCount=-180L;
    public static volatile int iFld=17;
    public static volatile int[] iArrFld =new int[N];
    public long[][] lArrFld =new long[N][N];

    static {
        FuzzerUtils.init(Test0254.iArrFld, 1);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i1, double d1, int i2) {

        int i3=12551, i4=15240, i5=-16657, i6=-13;
        long l1=98L;
        byte by=-47, by1=91;
        float f2=1.418F, f3=-1.1009F;

        for (i3 = 335; i3 > 11; --i3) {
            for (i5 = i3; i5 < 5; i5++) {
                Test0254.iArrFld[i5] = i5;
                Test0254.iArrFld[i5] -= (int) 3002453701800196564L;
                i2 = i3;
            }
            switch (((i3 % 7) * 5) + 78) {
            case 103:
                switch (((i3 >>> 1) % 1) + 95) {
                case 95:
                    l1 = 1;
                    do {
                        int i7=-63024;
                        by += (byte)(l1 * l1);
                        Test0254.iArrFld[i3] *= i7;
                    } while (++l1 < 5);
                    Test0254.iArrFld[i3 + 1] = (int) -17L;
                    f2 = 5;
                    do {
                        d1 += i6;
                        i4 -= (int) Test0254.instanceCount;
                        Test0254.iArrFld[i3 + 1] *= (int) -8.6572;
                    } while (--f2 > 0);
                    break;
                }
            case 112:
                f3 = -14;
            case 88:
                i2 ^= i3;
                break;
            case 104:
                if (i6 != 0) {
                }
            case 79:
                i4 -= (int) Test0254.instanceCount;
            case 109:
                i4 = i4;
                break;
            case 87:
                Test0254.iArrFld[i3 - 1] = by1;
                break;
            }
        }
        long meth_res = i1 + Double.doubleToLongBits(d1) + i2 + i3 + i4 + i5 + i6 + l1 + by + Float.floatToIntBits(f2)
            + Float.floatToIntBits(f3) + by1;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth(double d, int i) {

        float f1=110.211F;
        int i8=-5, i9=48679, i10=-2, i11=-66, i12=110, i13=2;
        byte by2=122;
        boolean b=false;

        Test0254.instanceCount <<= (long) (((long) (f1 - i) ^ lMeth(229, 28.81494, i)) + -2.100944);
        for (i8 = 15; i8 < 318; ++i8) {
            short s=13175;
            Test0254.iArrFld[i8 + 1] >>= (int) Test0254.instanceCount;
            by2 = (byte)i8;
            Test0254.instanceCount += (i8 * i8);
            Test0254.instanceCount += (((i8 * Test0254.instanceCount) + i8) - i);
            i9 += (((i8 * s) + i9) - i8);
            i9 = i;
        }
        for (i10 = 2; i10 < 383; i10++) {
            i += (i10 * i10);
            i = (int)124.275F;
            for (i12 = 1; i12 < 4; i12 += 2) {
                b = b;
                Test0254.instanceCount += (long) f1;
            }
            i -= 52623;
        }
        long meth_res = Double.doubleToLongBits(d) + i + Float.floatToIntBits(f1) + i8 + i9 + by2 + i10 + i11 + i12 +
            i13 + (b ? 1 : 0);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth(long l, float f) {

        double d2=-125.27923;
        int i14=24409, i15=244, i16=17808, i17=146, i18=87, i19=10, i20=-217, i21=42703, i22=-3979;
        byte by3=63;

        Test0254.iArrFld[(-6996 >>> 1) % N] = iMeth(d2, Test0254.iFld);
        i14 = 1;
        while (++i14 < 282) {
            Test0254.iFld += (i14 + by3);
        }
        Test0254.iFld ^= Test0254.iFld;
        Test0254.iFld = Test0254.iFld;
        for (i15 = 9; i15 < 147; i15 += 3) {
            for (i17 = 1; i17 < 33; i17++) {
                for (i19 = 2; i19 > 1; i19--) {
                    Test0254.iFld -= i19;
                }
            }
            i16 *= -34;
            switch ((((i15 >>> 1) % 2) * 5) + 63) {
            case 69:
                for (i21 = 2; i21 < 33; i21++) {
                    f += (i21 * i21);
                    Test0254.iFld *= i19;
                    l <<= l;
                }
            case 73:
                Test0254.iFld += (i15 * i15);
            }
        }
        vMeth_check_sum += l + Float.floatToIntBits(f) + Double.doubleToLongBits(d2) + i14 + by3 + i15 + i16 + i17 +
            i18 + i19 + i20 + i21 + i22;
    }

    public void mainTest(String[] strArr1) {

        float f4=-5.759F, f5=103.336F, f6=-1.58F;
        int i23=-39725, i24=-49453, i26=3, i27=-59969, i28=-200;
        double d3=1.59267;
        byte by4=-75;
        short s1=-25286;

        vMeth(Test0254.instanceCount, f4);
        Test0254.instanceCount += Test0254.instanceCount;
        for (i23 = 12; i23 < 275; ++i23) {
            boolean b1=false;
            if (b1) break;
            d3 += i23;
            i26 *= i26;
            i27 = 1;
            while (++i27 < 96) {
                f5 = 1;
                while (++f5 < 1) {
                    switch (((i23 >>> 1) % 9) + 12) {
                    case 12:
                    case 13:
                        lArrFld[i27][i27 + 1] += i26;
                        i26 |= i23;
                        if (b1) continue;
                        if (true) break;
                    case 14:
                        if (b1) {
                            d3 = by4;
                            Test0254.iFld = (int) Test0254.instanceCount;
                            Test0254.instanceCount *= Test0254.instanceCount;
                        } else if (b1) {
                            Test0254.instanceCount += i24;
                        }
                        i26 = i23;
                        break;
                    case 15:
                        Test0254.instanceCount = Test0254.instanceCount;
                        if (true) break;
                        i24 += (int)f5;
                        break;
                    case 16:
                        switch ((int)((f5 % 7) + 68)) {
                        case 68:
                            f4 += 3388395377860150687L;
                            i28 += i27;
                            Test0254.iFld += (int) (((f5 * s1) + i27) - i24);
                            break;
                        case 69:
                            if (b1) continue;
                            Test0254.iArrFld[(int) (f5)] -= -22362;
                            Test0254.iFld = (int) Test0254.instanceCount;
                        case 70:
                            Test0254.iArrFld[i23 + 1] *= (int) 327831209303949784L;
                            break;
                        case 71:
                            Test0254.iArrFld[(int) (f5 - 1)] >>>= i26;
                        case 72:
                            if (b1) continue;
                        case 73:
                            Test0254.iFld += i26;
                        case 74:
                            d3 = f4;
                            break;
                        default:
                            i28 = (int) Test0254.instanceCount;
                        }
                        break;
                    case 17:
                        lArrFld[(int)(f5 + 1)][i23] -= (long)f4;
                    case 18:
                        Test0254.iFld = (int) Test0254.instanceCount;
                        break;
                    case 19:
                        f6 += (-8406096640447730723L + (f5 * f5));
                    case 20:
                        d3 += i28;
                    default:
                        i26 >>>= i24;
                    }
                }
            }
        }

        FuzzerUtils.out.println("f4 i23 i24 = " + Float.floatToIntBits(f4) + "," + i23 + "," + i24);
        FuzzerUtils.out.println("d3 i26 i27 = " + Double.doubleToLongBits(d3) + "," + i26 + "," + i27);
        FuzzerUtils.out.println("f5 by4 i28 = " + Float.floatToIntBits(f5) + "," + by4 + "," + i28);
        FuzzerUtils.out.println("s1 f6 = " + s1 + "," + Float.floatToIntBits(f6));

        FuzzerUtils.out.println("Test0254.instanceCount Test0254.iFld Test0254.iArrFld = " + Test0254.instanceCount + "," + Test0254.iFld +
                "," + FuzzerUtils.checkSum(Test0254.iArrFld));
        FuzzerUtils.out.println("lArrFld = " + FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0254 _instance = new Test0254();
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
//DEBUG  lMeth ->  lMeth iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
