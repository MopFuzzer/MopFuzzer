// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:34 2023
public class Test0468 {

    public static final int N = 400;

    public static long instanceCount=-6406136290439203562L;
    public static volatile double dFld=-1.71265;
    public static byte byFld=91;
    public static float fFld=-40.479F;
    public static boolean bFld=false;
    public static short sFld=31777;
    public static long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test0468.lArrFld, -6889845981041409190L);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i4=-26;
        int i5=-86;
        int i6=-125;
        int i7=1;
        int i8=-143;
        int i9=123;
        int[] iArr1 =new int[N];
        byte by=119;
        float f=0.927F;
        float[] fArr =new float[N];
        double[] dArr =new double[N];

        FuzzerUtils.init(iArr1, -134);
        FuzzerUtils.init(dArr, -1.1713);
        FuzzerUtils.init(fArr, 48.1017F);

        for (i4 = 5; i4 < 232; i4++) {
            for (i6 = 1; i6 < 7; ++i6) {
                i5 <<= i5;
                Test0468.instanceCount = i5;
                i7 += -8;
                if (i5 != 0) {
                }
                for (i8 = i6; i8 < 2; i8++) {
                    i9 >>>= 126;
                    switch ((i8 % 10) + 45) {
                    case 45:
                        iArr1[i8] = (int) Test0468.instanceCount;
                        if (false) break;
                    case 46:
                        i9 += (int) Test0468.instanceCount;
                        break;
                    case 47:
                        by = (byte)1;
                        i9 += (((i8 * f) + by) - i9);
                        break;
                    case 48:
                        dArr[i8 + 1] -= i6;
                        break;
                    case 49:
                        Test0468.instanceCount -= -133L;
                        break;
                    case 50:
                        fArr[i6 + 1] = i7;
                    case 51:
                        by -= (byte) Test0468.instanceCount;
                        break;
                    case 52:
                        Test0468.dFld = Test0468.dFld;
                        break;
                    case 53:
                        i7 = -40940;
                        break;
                    case 54:
                        i5 *= i8;
                    default:
                        Test0468.lArrFld[i4] = i6;
                    }
                }
            }
        }
        long meth_res = i4 + i5 + i6 + i7 + i8 + i9 + by + Float.floatToIntBits(f) + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth(short s, int i3) {

        float f1=122.328F;
        int i10=-52891;
        int i11=-157;
        int i12=188;
        int i13=-22694;
        int i14=22;
        int[] iArr2 =new int[N];
        boolean b=false, b1=true;

        FuzzerUtils.init(iArr2, -169);

        Test0468.lArrFld[(i3 >>> 1) % N] = (long) (iMeth() / ((long) (f1) | 1));
        if (b1) {
            for (i10 = 2; i10 < 364; i10++) {
                if (b) break;
                f1 = -136;
                switch ((i10 % 9) + 115) {
                case 115:
                    i11 += i3;
                    i3 -= -9039;
                    for (i12 = 5; i12 > i10; i12 -= 2) {
                        i14 = 1;
                        do {
                            iArr2 = FuzzerUtils.int1array(N, (int)15115);
                            if (true) {
                                iArr2[i12] = i10;
                                i3 = (int) Test0468.instanceCount;
                            } else {
                                if (false) break;
                            }
                        } while (++i14 < 1);
                    }
                    break;
                case 116:
                    Test0468.lArrFld[i10 + 1] = i3;
                    break;
                case 117:
                    i11 = i3;
                    break;
                case 118:
                    i11 += (int) Test0468.instanceCount;
                case 119:
                    i13 += (int)f1;
                case 120:
                    Test0468.instanceCount += (i10 | i11);
                case 121:
                    try {
                        iArr2[i10] = (iArr2[i10] % i13);
                        i13 = (i11 % -66);
                        i11 = (-154 / iArr2[i10]);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 122:
                    i13 += Test0468.byFld;
                    break;
                case 123:
                    s += (short)i10;
                    break;
                default:
                    i3 -= i11;
                }
            }
        } else if (b1) {
            s |= (short) Test0468.instanceCount;
        }
        long meth_res = s + i3 + Float.floatToIntBits(f1) + i10 + i11 + (b ? 1 : 0) + i12 + i13 + i14 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr2);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth() {

        int i=12;
        int i1=-1;
        int i2=-181;
        int i15=0;
        int i16=-200;
        int i17=239;
        int[] iArr =new int[N];

        FuzzerUtils.init(iArr, 33904);

        if (Test0468.bFld) {
            iArr[(i >>> 1) % N] ^= (int) (++Test0468.instanceCount);
            for (i1 = 9; i1 < 184; ++i1) {
                i2 = (int) Test0468.instanceCount;
                i += (int)(iArr[i1] + lMeth((short)(17909), i));
                i2 = i;
                Test0468.fFld += (i1 - Test0468.instanceCount);
                Test0468.instanceCount = i2;
                iArr[i1 - 1] = (int) Test0468.fFld;
                i += (i1 | Test0468.instanceCount);
            }
        } else if (Test0468.bFld) {
            i15 = 1;
            do {
                for (i16 = 1; i16 < 5; ++i16) {
                    iArr[i15] = i16;
                    iArr[i16 + 1] = -11095;
                }
                i2 = (int)-78L;
            } while (++i15 < 359);
        } else {
            i = (int) Test0468.instanceCount;
        }
        vMeth_check_sum += i + i1 + i2 + i15 + i16 + i17 + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i18=-14;
        int i19=-154;
        int i20=58220;
        int i21=-4;
        int i22=179;
        int i23=9798;
        int i24=-173;
        int[][] iArr3 =new int[N][N];
        long l=25L;
        boolean[] bArr =new boolean[N];

        FuzzerUtils.init(iArr3, 30684);
        FuzzerUtils.init(bArr, true);

        vMeth();
        iArr3[(i18 >>> 1) % N][(i18 >>> 1) % N] >>>= i18;
        for (i19 = 3; i19 < 276; i19++) {
            Test0468.byFld += (byte) (12 + (i19 * i19));
            i18 -= i18;
            iArr3[i19][i19 + 1] = (int) Test0468.instanceCount;
            i18 &= i19;
            Test0468.instanceCount = i19;
            iArr3[i19][i19] = i20;
        }
        iArr3[(i18 >>> 1) % N][(i18 >>> 1) % N] = (int)65.71404;
        l = 1;
        do {
            i18 = (int) Test0468.instanceCount;
            i18 += (int)l;
            for (i21 = 1; 75 > i21; i21++) {
                Test0468.sFld >>= (short) Test0468.instanceCount;
                try {
                    i18 = (-6 % iArr3[(int)(l - 1)][(int)(l)]);
                    i22 = (i18 / -187554965);
                    i18 = (175 / iArr3[(int)(l)][(int)(l - 1)]);
                } catch (ArithmeticException a_e) {}
                Test0468.fFld -= 7;
                Test0468.instanceCount = i20;
                i20 = (int) Test0468.instanceCount;
                i18 += (i21 * i21);
            }
            Test0468.fFld += (((l * Test0468.byFld) + Test0468.fFld) - i18);
            bArr = bArr;
            iArr3[(int)(l)][(int)(l + 1)] -= i20;
            Test0468.lArrFld[(int) (l + 1)] = Test0468.instanceCount;
            i22 = -124;
            Test0468.dFld += i19;
            for (i23 = 3; i23 < 75; ++i23) {
                i20 += (-2 + (i23 * i23));
                i18 = (int)l;
            }
        } while (++l < 337);
        Test0468.byFld += (byte) i24;

        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("l i21 i22 = " + l + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 iArr3 = " + i23 + "," + i24 + "," + FuzzerUtils.checkSum(iArr3));
        FuzzerUtils.out.println("bArr = " + FuzzerUtils.checkSum(bArr));

        FuzzerUtils.out.println("Test0468.instanceCount Test0468.dFld Test0468.byFld = " + Test0468.instanceCount + "," +
                Double.doubleToLongBits(Test0468.dFld) + "," + Test0468.byFld);
        FuzzerUtils.out.println("Test0468.fFld Test0468.bFld Test0468.sFld = " + Float.floatToIntBits(Test0468.fFld) + "," + (Test0468.bFld
                ? 1 : 0) + "," + Test0468.sFld);
        FuzzerUtils.out.println("Test0468.lArrFld = " + FuzzerUtils.checkSum(Test0468.lArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0468 _instance = new Test0468();
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
//DEBUG  iMeth ->  iMeth lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
