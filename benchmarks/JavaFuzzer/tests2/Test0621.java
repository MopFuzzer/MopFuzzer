// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:41 2023
public class Test0621 {

    public static final int N = 400;

    public static long instanceCount=-4099570217L;
    public volatile int iFld=127;
    public double dFld=1.18474;
    public byte byFld=-124;
    public static volatile float fFld=77.564F;
    public short sFld=-23038;
    public static byte byFld1=-21;
    public int iFld1=-214;
    public static long[] lArrFld =new long[N];
    public static volatile int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0621.lArrFld, -2749798418L);
        FuzzerUtils.init(Test0621.iArrFld, -39);
    }

    public static long iMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i16) {

        float f=100.1010F;
        int i17=101, i18=-2, i19=-7, i20=-39313, i21=235, i22=-14;
        double d=-14.70064;

        i16 += i16;
        for (f = 11; f < 223; f++) {
            for (i18 = 1; i18 < 8; ++i18) {
                Test0621.instanceCount *= -5;
                Test0621.lArrFld[i18] = Test0621.instanceCount;
                for (i20 = 1; i20 < 2; ++i20) {
                    Test0621.byFld1 += (byte) (i20 + i18);
                    i17 >>= i17;
                }
                Test0621.fFld += (float) d;
                Test0621.instanceCount += (long) 2.112F;
            }
            i17 += (int) (((f * i21) + Test0621.instanceCount) - Test0621.byFld1);
        }
        i22 = 221;
        while (--i22 > 0) {
            i19 += i22;
            if (i17 != 0) {
                vMeth_check_sum += i16 + Float.floatToIntBits(f) + i17 + i18 + i19 + i20 + i21 +
                    Double.doubleToLongBits(d) + i22;
                return;
            }
            i16 &= i19;
        }
        vMeth_check_sum += i16 + Float.floatToIntBits(f) + i17 + i18 + i19 + i20 + i21 + Double.doubleToLongBits(d) +
            i22;
    }

    public static boolean bMeth() {

        int i15=-9, i23=-9, i24=5, i25=-10, i26=138, i27=87;
        boolean b2=true;
        double[] dArr =new double[N];

        FuzzerUtils.init(dArr, -1.39213);

        Test0621.lArrFld[(-6 >>> 1) % N] *= ((--Test0621.iArrFld[(-10632 >>> 1) % N]) - (i15 * (i15 = i15)));
        vMeth(13);
        for (i23 = 6; 307 > i23; ++i23) {
            if (b2) continue;
            for (i25 = i23; 5 > i25; i25++) {
                i24 += (i25 * i25);
                dArr[i25] -= Test0621.fFld;
                i15 += (((i25 * Test0621.instanceCount) + Test0621.instanceCount) - i15);
                i24 = i15;
                Test0621.instanceCount += (i25 * i25);
                try {
                    i27 = (i26 / -18313);
                    Test0621.iArrFld[i25 + 1] = (i25 / i26);
                    i26 = (i25 % 218);
                } catch (ArithmeticException a_e) {}
            }
            Test0621.lArrFld[i23] &= -18390;
            if (b2) continue;
            i15 %= (int) (Test0621.instanceCount | 1);
            Test0621.fFld += i23;
        }
        long meth_res = i15 + i23 + i24 + (b2 ? 1 : 0) + i25 + i26 + i27 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public int iMeth(int i7, int i8) {

        int i9=-10;
        int i10=-161;
        int i11=106;
        int i12=77;
        int i13=-65;
        int i14=39975;
        int[] iArr1 =new int[N];
        long l=178L;

        FuzzerUtils.init(iArr1, -5710);

        i9 = 1;
        while (++i9 < 359) {
            for (i10 = 1; i10 < 5; ++i10) {
                for (i12 = 1; 2 > i12; ++i12) {
                    Test0621.instanceCount *= (long) (--Test0621.fFld);
                }
                Test0621.lArrFld[i10 - 1] += (++iFld);
                if (bMeth()) {
                    for (l = 1; l < 2; ++l) {
                        boolean b1=true;
                        b1 = ((31 * (--Test0621.instanceCount)) != i14);
                        i11 -= (int) ((39.93F / ((--iArr1[i9]) | 1)) * ((l % (Test0621.instanceCount | 1)) * dFld));
                    }
                } else {
                    i14 = (int) Test0621.fFld;
                }
                iFld += (i10 ^ iFld);
                Test0621.instanceCount += (long) Test0621.fFld;
                Test0621.lArrFld[i9 + 1] = i12;
                if (iFld != 0) {
                }
            }
            iArr1[i9 + 1] = (int)l;
        }
        long meth_res = i7 + i8 + i9 + i10 + i11 + i12 + i13 + l + i14 + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=14322;
        int i1=-3;
        int i2=150;
        int i3=-14;
        int i4=-215;
        int i5=5;
        int i6=-190;
        int i28=-2929;
        int i29=-149;
        int[] iArr =new int[N];
        boolean b=false;
        byte[] byArr =new byte[N];

        FuzzerUtils.init(byArr, (byte)-12);
        FuzzerUtils.init(iArr, 12);

        iFld = (byArr[(iFld >>> 1) % N]++);
        dFld = Long.reverseBytes((i++) >>> (Test0621.instanceCount - i));
        switch ((((iFld--) >>> 1) % 2) + 58) {
        case 58:
            for (i1 = 17; i1 < 312; ++i1) {
                b = ((Math.min(i2, i2) * (0.90577 - Test0621.lArrFld[i1 - 1])) < ((iFld++) - (byFld - iFld)));
            }
            i2 -= Math.abs(iArr[(-3 >>> 1) % N]);
            i3 = 1;
            while (++i3 < 206) {
                if (b) {
                    i2 += (int)(1.636F + (i3 * i3));
                    i4 = 1;
                    while (++i4 < 122) {
                        Test0621.lArrFld[i3 - 1] = (Integer.reverseBytes((int) (i3 + Test0621.fFld)) - (Math.min(i1, 53391) -
                            (-3L * (i - i1))));
                        switch ((((i4 - iFld) >>> 1) % 7) + 125) {
                        case 125:
                            for (i5 = 1; i5 < 1; i5++) {
                                sFld = (short)(--dFld);
                                i >>= (int)(4709264894030918921L >> i6);
                                i = iMeth(i4, i);
                                switch ((i4 % 9) + 47) {
                                case 47:
                                    switch ((((i6 >>> 1) % 7) * 5) + 108) {
                                    case 131:
                                        iFld += i4;
                                        i6 = i;
                                        iArr[i5 - 1] = i3;
                                        break;
                                    case 124:
                                        Test0621.fFld += (((i5 * i2) + Test0621.fFld) - Test0621.instanceCount);
                                        i2 <<= sFld;
                                        break;
                                    case 110:
                                        i += i28;
                                        Test0621.iArrFld[i5 + 1] = i28;
                                        break;
                                    case 117:
                                        iFld -= i3;
                                        Test0621.fFld += (i5 * i5);
                                        Test0621.iArrFld[i5] = (int) -10L;
                                        break;
                                    case 143:
                                        i2 <<= -25871;
                                        break;
                                    case 116:
                                        Test0621.fFld = iFld;
                                        break;
                                    case 115:
                                        Test0621.fFld *= i3;
                                        break;
                                    default:
                                        Test0621.lArrFld[i4 + 1] -= i4;
                                    }
                                case 48:
                                    i2 <<= i1;
                                    break;
                                case 49:
                                    i2 = 18885;
                                    break;
                                case 50:
                                    iFld = i5;
                                    break;
                                case 51:
                                    i2 += i5;
                                    break;
                                case 52:
                                    Test0621.instanceCount -= (long) -12.985F;
                                    break;
                                case 53:
                                    i = -13;
                                case 54:
                                case 55:
                                    Test0621.instanceCount -= i2;
                                    break;
                                }
                            }
                            break;
                        case 126:
                            Test0621.lArrFld = Test0621.lArrFld;
                        case 127:
                            iFld1 = i28;
                        case 128:
                            Test0621.instanceCount += iFld1;
                            break;
                        case 129:
                            i += byFld;
                        case 130:
                            i2 |= (int)-1127131470L;
                            break;
                        case 131:
                            Test0621.instanceCount = i;
                            break;
                        }
                    }
                } else {
                    iArr[i3 + 1] = 14;
                }
            }
            break;
        case 59:
            i29 >>= i2;
            break;
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("b i3 i4 = " + (b ? 1 : 0) + "," + i3 + "," + i4);
        FuzzerUtils.out.println("i5 i6 i28 = " + i5 + "," + i6 + "," + i28);
        FuzzerUtils.out.println("i29 byArr iArr = " + i29 + "," + FuzzerUtils.checkSum(byArr) + "," +
            FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test0621.instanceCount iFld dFld = " + Test0621.instanceCount + "," + iFld + "," +
            Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("byFld Test0621.fFld sFld = " + byFld + "," + Float.floatToIntBits(Test0621.fFld) + "," + sFld);
        FuzzerUtils.out.println("Test0621.byFld1 iFld1 Test0621.lArrFld = " + Test0621.byFld1 + "," + iFld1 + "," +
                FuzzerUtils.checkSum(Test0621.lArrFld));
        FuzzerUtils.out.println("Test0621.iArrFld = " + FuzzerUtils.checkSum(Test0621.iArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0621 _instance = new Test0621();
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
//DEBUG  bMeth ->  bMeth iMeth mainTest
//DEBUG  vMeth ->  vMeth bMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
