// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:50 2023
public class Test0809 {

    public static final int N = 400;

    public static volatile long instanceCount=4L;
    public static float fFld=-124.475F;
    public static volatile boolean bFld=false;
    public static byte byFld=94;
    public static short[] sArrFld =new short[N];

    static {
        FuzzerUtils.init(Test0809.sArrFld, (short) -12307);
    }

    public static long lMeth_check_sum = 0;
    public static long lMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i4, long l2) {

        int i5=0;
        int i6=-2;
        int i7=-163;
        int i8=737;
        int i9=79;
        int i10=-3;
        int[] iArr1 =new int[N];
        int[][] iArr2 =new int[N][N];
        short s=18737;
        byte by1=111;
        boolean b=false;

        FuzzerUtils.init(iArr1, 14);
        FuzzerUtils.init(iArr2, -32758);

        for (i5 = 8; i5 < 154; ++i5) {
            iArr1[i5 - 1] -= (int)36453L;
            iArr2 = iArr2;
            i4 = i5;
            s = (short)i6;
            l2 >>>= i5;
            for (i7 = 11; i7 > 1; i7 -= 2) {
                for (i9 = 1; i9 < 3; i9++) {
                    i4 *= i9;
                    iArr1[i7 + 1] = (int) Test0809.fFld;
                    by1 = (byte)i8;
                    b = b;
                    l2 |= i8;
                    try {
                        i10 = (-986429773 / i10);
                        i4 = (-33723 % i6);
                        iArr2[i5][(i8 >>> 1) % N] = (i4 % i10);
                    } catch (ArithmeticException a_e) {}
                    Test0809.instanceCount += (((i9 * i8) + Test0809.fFld) - i6);
                }
            }
        }
        vMeth_check_sum += i4 + l2 + i5 + i6 + s + i7 + i8 + i9 + i10 + by1 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr1)
            + FuzzerUtils.checkSum(iArr2);
    }

    public static long lMeth1(long l, long l1) {

        int i11=-42713;
        int i12=-3;
        int i13=11;
        int i14=-1;
        int i15=55612;
        int i16=36626;
        int i17=-14;
        int i18=34;
        int[] iArr3 =new int[N];
        double d1=-110.99664;
        short s1=-10754;
        byte by2=33;
        boolean[] bArr =new boolean[N];

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(iArr3, 4);

        vMeth(i11, 6782046284211362676L);
        i12 += -32403;
        for (i13 = 4; i13 < 194; ++i13) {
            for (i15 = 1; i15 < 8; ++i15) {
                double d=-1.78447;
                switch (((i13 % 7) * 5) + 121) {
                case 126:
                    Test0809.bFld = Test0809.bFld;
                    switch (((i15 % 1) * 5) + 117) {
                    case 119:
                        d -= i11;
                        for (d1 = i15; d1 < 2; ++d1) {
                            bArr[i13 + 1] = true;
                            i14 -= s1;
                            Test0809.sArrFld[i13] += (short) -68.927F;
                            i17 <<= by2;
                            try {
                                i18 = (i17 / i11);
                                i14 = (i11 % i17);
                                i12 = (i12 % i13);
                            } catch (ArithmeticException a_e) {}
                            i14 -= (int) Test0809.instanceCount;
                        }
                        break;
                    default:
                        i11 |= by2;
                    }
                    break;
                case 134:
                    iArr3 = iArr3;
                    break;
                case 128:
                    Test0809.fFld += i12;
                    break;
                case 138:
                    if (Test0809.bFld) break;
                    break;
                case 151:
                    d = by2;
                    break;
                case 142:
                    i17 += (int)d;
                    break;
                case 145:
                    i11 = 1;
                    break;
                default:
                    i11 -= -3;
                }
            }
        }
        long meth_res = l + l1 + i11 + i12 + i13 + i14 + i15 + i16 + Double.doubleToLongBits(d1) + i17 + s1 + by2 + i18
            + FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(iArr3);
        lMeth1_check_sum += meth_res;
        return (long)meth_res;
    }

    public static long lMeth(float f, int i2) {

        int i3=-66;
        int i19=-8;
        int[][] iArr =new int[N][N];
        int[] iArr4 =new int[N];

        FuzzerUtils.init(iArr, -2);
        FuzzerUtils.init(iArr4, 58728);

        i3 = 263;
        do {
            byte by=-24;
            by <<= (byte)(--iArr[i3 - 1][i3]);
        } while ((i3 -= 2) > 0);
        i2 = (int) (Test0809.instanceCount = (lMeth1(Test0809.instanceCount, Test0809.instanceCount) * Test0809.instanceCount));
        i19 = 1;
        do {
            switch ((i19 % 4) + 28) {
            case 28:
                Test0809.instanceCount = i19;
                if (Test0809.bFld) continue;
                i2 += Test0809.byFld;
            case 29:
                if (Test0809.bFld) break;
                break;
            case 30:
            case 31:
                i2 = 188;
                if (true) {
                    i2 -= i3;
                    i2 *= i3;
                } else {
                    Test0809.byFld = (byte) i3;
                    i2 = (int)236L;
                }
            }
        } while (++i19 < 251);
        long meth_res = Float.floatToIntBits(f) + i2 + i3 + i19 + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(iArr4);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=37257;
        int i1=9;
        int i21=-174;
        int i22=13;
        int i23=-4;
        int i24=-190;
        int i25=5;
        int i26=100;
        int i27=0;
        int i28=1;
        int[] iArr5 =new int[N];
        double d2=-2.40769;
        short s2=6865;
        long[] lArr =new long[N];
        long[][] lArr1 =new long[N][N];

        FuzzerUtils.init(lArr, 197185898L);
        FuzzerUtils.init(iArr5, 2);
        FuzzerUtils.init(lArr1, 9063196213308838266L);

        i += (int) ((++i) * ((Test0809.instanceCount - 12) - (Test0809.instanceCount--)));
        i1 = 1;
        while (++i1 < 286) {
            Test0809.instanceCount <<= (((Test0809.instanceCount - i1) - lMeth(Test0809.fFld, 2)) - Test0809.instanceCount);
            i += (((i1 * i1) + Test0809.instanceCount) - Test0809.instanceCount);
            for (i21 = i1; i21 < 88; i21++) {
                for (i23 = 1; i23 < 1; i23++) {
                    d2 += i1;
                    Test0809.instanceCount = i1;
                    lArr[i23] >>= -3;
                    i24 = (int)-6735716317645783997L;
                    i24 = i23;
                    Test0809.byFld += (byte) i22;
                    i22 = i24;
                    i22 = i;
                }
                switch ((((i1 >>> 1) % 7) * 5) + 119) {
                case 142:
                    for (i25 = 1; i25 > i1; i25--) {
                        Test0809.instanceCount += (((i25 * i25) + i22) - i23);
                        d2 += Test0809.instanceCount;
                        i += i25;
                        i24 = s2;
                        Test0809.instanceCount = Test0809.instanceCount;
                        Test0809.byFld = (byte) i26;
                        iArr5[i21 + 1] += i;
                        iArr5[i1 - 1] >>>= 8773;
                    }
                    i26 *= (int)-1133875868006405127L;
                    break;
                case 134:
                    iArr5[i1] = (int) Test0809.instanceCount;
                    d2 = 2;
                    break;
                case 129:
                    for (i27 = 1; i27 < 1; ++i27) {
                        i -= i1;
                        i22 = i28;
                    }
                case 153:
                    d2 = d2;
                    break;
                case 137:
                    Test0809.instanceCount -= Test0809.instanceCount;
                    break;
                case 126:
                    d2 -= 22467;
                    break;
                case 131:
                    lArr1[i1][i21] = i25;
                    break;
                default:
                    i22 += i;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i21 = " + i + "," + i1 + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("d2 i25 i26 = " + Double.doubleToLongBits(d2) + "," + i25 + "," + i26);
        FuzzerUtils.out.println("s2 i27 i28 = " + s2 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("lArr iArr5 lArr1 = " + FuzzerUtils.checkSum(lArr) + "," + FuzzerUtils.checkSum(iArr5)
            + "," + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test0809.instanceCount Test0809.fFld Test0809.bFld = " + Test0809.instanceCount + "," +
                Float.floatToIntBits(Test0809.fFld) + "," + (Test0809.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0809.byFld Test0809.sArrFld = " + Test0809.byFld + "," + FuzzerUtils.checkSum(Test0809.sArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth1_check_sum: " + lMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0809 _instance = new Test0809();
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
//DEBUG  lMeth1 ->  lMeth1 lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth1 lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
