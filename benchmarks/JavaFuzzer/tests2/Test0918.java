// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:55 2023
public class Test0918 {

    public static final int N = 400;

    public static long instanceCount=253L;
    public static boolean bFld=true;
    public float fFld=0.673F;
    public static int iFld=-252;
    public static byte byFld=-10;
    public static int[] iArrFld =new int[N];
    public static long[] lArrFld =new long[N];
    public static byte[] byArrFld =new byte[N];

    static {
        FuzzerUtils.init(Test0918.iArrFld, 6);
        FuzzerUtils.init(Test0918.lArrFld, -2L);
        FuzzerUtils.init(Test0918.byArrFld, (byte) -40);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public void vMeth2(int i5) {

        int i6=-11, i7=57197, i8=-7, i9=-161, i10=-41082, i11=32299, i12=-16027, i13=10;
        double d1=-33.10;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -9L);

        i6 = 1;
        while (++i6 < 190) {
            for (i7 = 8; i7 > 1; i7 -= 2) {
                i5 = (int) Test0918.instanceCount;
            }
        }
        lArr[(-16678 >>> 1) % N] = i7;
        for (i9 = 5; i9 < 140; ++i9) {
            d1 -= i10;
            for (i11 = i9; i11 < 12; ++i11) {
                i12 = (int) Test0918.instanceCount;
                i13 = 1;
                do {
                    i12 >>= i9;
                    i5 = (int) Test0918.instanceCount;
                    Test0918.instanceCount += i13;
                    i8 = -7;
                    try {
                        i12 = (-871232434 % i10);
                        i5 = (i8 % -156);
                        i10 = (i7 % -890);
                    } catch (ArithmeticException a_e) {}
                    Test0918.iArrFld[i11] += i9;
                } while (++i13 < 1);
            }
        }
        vMeth2_check_sum += i5 + i6 + i7 + i8 + i9 + i10 + Double.doubleToLongBits(d1) + i11 + i12 + i13 +
            FuzzerUtils.checkSum(lArr);
    }

    public void vMeth1() {

        int i1=-14;
        int i2=42438;
        int i3=-44774;
        int i4=6;
        int i14=-8;
        int i15=-71;
        int i16=-108;
        int[] iArr =new int[N];
        double d=-61.46648;

        FuzzerUtils.init(iArr, -168);

        for (i1 = 8; i1 < 206; ++i1) {
            try {
                i2 = (i1 / i2);
                i2 = (-25701 % i1);
                iArr[i1 - 1] = (-190 / iArr[(i1 >>> 1) % N]);
            } catch (ArithmeticException a_e) {}
            Test0918.instanceCount += i1;
            for (i3 = 1; i3 < 8; ++i3) {
                try {
                    i4 = (29002 / i4);
                    iArr[i1 - 1] = (-48550 % i3);
                    iArr[i1 - 1] = (i4 / iArr[i3 - 1]);
                } catch (ArithmeticException a_e) {}
                Test0918.instanceCount -= (i2--);
            }
            if (i1 != 0) {
                vMeth1_check_sum += i1 + i2 + i3 + i4 + Double.doubleToLongBits(d) + i14 + i15 + i16 +
                    FuzzerUtils.checkSum(iArr);
                return;
            }
            d /= (Math.max((iArr[i1 - 1] = i1) % ((++i2) | 1), Test0918.instanceCount) | 1);
            if (Test0918.bFld) {
                vMeth2(i1);
                Test0918.iArrFld[i1] *= i3;
                for (i14 = 1; i14 < 8; i14++) {
                    i16 = 1;
                    while (++i16 < 2) {
                        Test0918.instanceCount >>= 5936069768056425732L;
                        try {
                            i4 = (i16 / 97);
                            i4 = (i15 / -105);
                            i4 = (i3 / iArr[i1 - 1]);
                        } catch (ArithmeticException a_e) {}
                    }
                }
            }
        }
        vMeth1_check_sum += i1 + i2 + i3 + i4 + Double.doubleToLongBits(d) + i14 + i15 + i16 +
            FuzzerUtils.checkSum(iArr);
    }

    public void vMeth(int i, long l, long l1) {

        byte by=-68;
        int i17=-37355, i18=8;
        short s=-27233;
        boolean[] bArr =new boolean[N];

        FuzzerUtils.init(bArr, false);

        if (true) {
            if (Test0918.bFld) {
                Test0918.instanceCount += Math.abs((i - i) & (i - i));
                i -= (int) ((--Test0918.instanceCount) + (by + (i * l)));
                vMeth1();
            } else {
                for (i17 = 2; i17 < 205; i17 += 2) {
                    switch (((i17 % 6) * 5) + 112) {
                    case 135:
                        bArr[i17 - 1] = Test0918.bFld;
                        i -= i;
                        i += (int)l1;
                        i >>>= -3;
                        break;
                    case 133:
                        Test0918.instanceCount = by;
                        fFld -= l;
                        by += (byte)i17;
                        break;
                    case 115:
                        i18 = -22822;
                        break;
                    case 137:
                        i = 0;
                        break;
                    case 118:
                        Test0918.bFld = false;
                        break;
                    case 125:
                        i18 += (int)1L;
                        break;
                    default:
                        s *= (short)10;
                    }
                }
            }
        } else if (false) {
            i *= (int)l;
        }
        vMeth_check_sum += i + l + l1 + by + i17 + i18 + s + FuzzerUtils.checkSum(bArr);
    }

    public void mainTest(String[] strArr1) {

        int i19=4, i20=165, i21=-32972, i22=-40316, i23=11034, i24=5, i25=-56426, i26=-213, i27=-129;
        double d2=1.44406, d3=1.128145;
        short s1=-18717;

        vMeth(Test0918.iFld, 42667L, Test0918.instanceCount);
        i19 = 335;
        while ((i19 -= 3) > 0) {
            Test0918.lArrFld[i19 - 1] += Test0918.instanceCount;
            for (i20 = 224; i20 > 1; i20--) {
                Test0918.iArrFld[i20 + 1] -= Test0918.iFld;
                d2 *= s1;
                i21 += (((i20 * i19) + i19) - Test0918.instanceCount);
                Test0918.iArrFld[i20 - 1] = -13565;
                if (Test0918.bFld) break;
            }
        }
        Test0918.iFld -= (int) fFld;
        Test0918.iFld -= (int) d2;
        Test0918.iFld = i21;
        for (i22 = 6; i22 < 245; ++i22) {
            i23 >>= 5;
        }
        for (i24 = 11; i24 < 191; ++i24) {
            for (d3 = 8; 139 > d3; ++d3) {
                Test0918.instanceCount *= (long) fFld;
                Test0918.byArrFld[i24] /= (byte) (Test0918.instanceCount | 1);
                Test0918.instanceCount = (long) d3;
                Test0918.iArrFld[(int) (d3 - 1)] |= i26;
                if (Test0918.bFld) continue;
                Test0918.iArrFld[(int) (d3)] = i19;
                Test0918.iArrFld[(int) (d3)] -= i24;
                i25 += (int)122.217F;
                i25 = i21;
            }
            switch ((((i27 >>> 1) % 4) * 5) + 82) {
            case 90:
                fFld += -46.665F;
            case 86:
                Test0918.lArrFld[i24 - 1] = Test0918.instanceCount;
                i27 = -3;
                Test0918.iFld += (i24 + Test0918.byFld);
                break;
            case 87:
                Test0918.instanceCount += (((i24 * Test0918.instanceCount) + i25) - Test0918.instanceCount);
                break;
            case 93:
                Test0918.instanceCount >>= i20;
                break;
            }
        }

        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("d2 s1 i22 = " + Double.doubleToLongBits(d2) + "," + s1 + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("d3 i26 i27 = " + Double.doubleToLongBits(d3) + "," + i26 + "," + i27);

        FuzzerUtils.out.println("Test0918.instanceCount Test0918.bFld fFld = " + Test0918.instanceCount + "," + (Test0918.bFld ? 1 : 0)
            + "," + Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("Test0918.iFld Test0918.byFld Test0918.iArrFld = " + Test0918.iFld + "," + Test0918.byFld + "," +
                FuzzerUtils.checkSum(Test0918.iArrFld));
        FuzzerUtils.out.println("Test0918.lArrFld Test0918.byArrFld = " + FuzzerUtils.checkSum(Test0918.lArrFld) + "," +
                FuzzerUtils.checkSum(Test0918.byArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0918 _instance = new Test0918();
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
