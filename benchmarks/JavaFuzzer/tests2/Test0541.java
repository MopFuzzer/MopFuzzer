// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:37 2023
public class Test0541 {

    public static final int N = 400;

    public static long instanceCount=-61425L;
    public static short sFld=-2357;
    public double dFld=2.16406;
    public long[] lArrFld =new long[N];

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i6, int i7, int i8) {

        double d=-2.103592;
        int i9=-9, i10=31, i11=-222, i12=170, i13=-5;
        byte by=-77;
        float f1=2.749F;
        float[] fArr =new float[N];

        FuzzerUtils.init(fArr, -2.717F);

        i7 <<= i8;
        d += -248;
        i7 = -139;
        i7 = i8;
        i9 = 1;
        while (++i9 < 232) {
            i7 += i6;
            Test0541.instanceCount = Test0541.instanceCount;
            for (i10 = 1; i10 < 7; ++i10) {
                for (i12 = 1; 2 > i12; ++i12) {
                    i7 = by;
                    i8 = -12;
                    i11 >>>= i11;
                }
                Test0541.instanceCount &= i12;
                fArr[i9 + 1] = 52560L;
                f1 += (i10 * Test0541.instanceCount);
            }
        }
        long meth_res = i6 + i7 + i8 + Double.doubleToLongBits(d) + i9 + i10 + i11 + i12 + i13 + by +
            Float.floatToIntBits(f1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth(int i3, int i4, int i5) {

        int i14=-64549;
        int i15=-18021;
        int i16=200;
        int i17=-28762;
        int[] iArr1 =new int[N];
        float f2=-44.185F;
        boolean b=false;
        short[] sArr =new short[N];

        FuzzerUtils.init(iArr1, -173);
        FuzzerUtils.init(sArr, (short)16586);

        Test0541.instanceCount *= lMeth(27525, i4, -13);
        i14 = 1;
        do {
            i3 += i5;
            iArr1 = iArr1;
            i4 = 29905;
            i15 = 1;
            while (++i15 < 8) {
                switch (((i14 % 3) * 5) + 103) {
                case 118:
                    Test0541.instanceCount += (i15 * i15);
                    iArr1[i14 - 1] *= (int)f2;
                case 108:
                    i5 += Test0541.sFld;
                    i4 -= i15;
                case 109:
                    for (i16 = 1; i16 > 1; i16 -= 2) {
                        if (i5 != 0) {
                        }
                        i5 = (int) Test0541.instanceCount;
                        sArr[i15 - 1] = (short)i17;
                    }
                    break;
                default:
                    b = b;
                }
            }
        } while (++i14 < 203);
        long meth_res = i3 + i4 + i5 + i14 + i15 + Float.floatToIntBits(f2) + i16 + i17 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(sArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth() {

        int i=102;
        int i1=-114;
        int i2=242;
        int[] iArr2 =new int[N];
        long l=2048639138L;
        long l1=-1511730396554038349L;
        long[][] lArr =new long[N][N];
        float f=21.254F;
        float[] fArr1 =new float[N];
        boolean b1=true;
        double d1=111.122719;

        FuzzerUtils.init(iArr2, 148);
        FuzzerUtils.init(lArr, 4124977641L);
        FuzzerUtils.init(fArr1, 0.557F);

        for (i = 195; i > 11; i--) {
            for (l = 1; 9 > l; l++) {
                f = 1;
                do {
                    Test0541.instanceCount *= (Test0541.sFld - iMeth(i, i2, i2));
                    switch ((int)((f % 5) + 26)) {
                    case 26:
                        iArr2[(int)(f)] = i2;
                        if (true) {
                            switch ((int)(((l % 8) * 5) + 8)) {
                            case 21:
                                switch (((i2 >>> 1) % 9) + 86) {
                                case 86:
                                    i2 = i1;
                                    iArr2[i] *= i;
                                    i2 = i1;
                                    iArr2[(int)(f)] = i1;
                                    break;
                                case 87:
                                    if (i != 0) {
                                        vMeth_check_sum += i + i1 + l + i2 + Float.floatToIntBits(f) + l1 + (b1 ? 1 :
                                            0) + Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr2) +
                                            FuzzerUtils.checkSum(lArr) +
                                            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
                                        return;
                                    }
                                    i2 = (int) Test0541.instanceCount;
                                case 88:
                                    i2 += (int)(((f * i1) + i) - l);
                                    break;
                                case 89:
                                    Test0541.instanceCount >>= i;
                                    break;
                                case 90:
                                    Test0541.instanceCount -= (long) f;
                                    break;
                                case 91:
                                    Test0541.instanceCount += (long) (f * f);
                                    break;
                                case 92:
                                    i1 = i;
                                    break;
                                case 93:
                                    i2 = (int) Test0541.instanceCount;
                                case 94:
                                    i2 -= (int)l;
                                    break;
                                }
                            case 13:
                                Test0541.instanceCount += (long) (((f * i1) + i2) - l);
                            case 40:
                                i2 <<= (int)l;
                                break;
                            case 15:
                                l1 -= Test0541.instanceCount;
                                break;
                            case 39:
                                i1 += (int)(((f * i) + i) - i1);
                                break;
                            case 27:
                                lArr[(i2 >>> 1) % N][(int)(l)] += l;
                                break;
                            case 24:
                                b1 = b1;
                                break;
                            case 33:
                                i2 = (int)l1;
                                break;
                            }
                        }
                        break;
                    case 27:
                        i2 = i2;
                        break;
                    case 28:
                        i1 >>= 61069;
                        break;
                    case 29:
                        i1 <<= -10;
                    case 30:
                        fArr1[(int)(l + 1)] = (float)d1;
                    default:
                        iArr2[(int)(f - 1)] += i1;
                    }
                } while (++f < 2);
            }
        }
        vMeth_check_sum += i + i1 + l + i2 + Float.floatToIntBits(f) + l1 + (b1 ? 1 : 0) + Double.doubleToLongBits(d1)
            + FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public void mainTest(String[] strArr1) {

        int i18=29730;
        int i19=150;
        int i20=-9;
        int i21=14;
        int i22=9;
        int i23=-41789;
        int i24=5;
        int[] iArr =new int[N];
        float f3=-1.867F;
        boolean b2=true;
        byte by1=-96;
        byte[] byArr =new byte[N];

        FuzzerUtils.init(iArr, -73);
        FuzzerUtils.init(byArr, (byte)19);

        iArr = (iArr = (iArr = iArr));
        vMeth();
        for (i18 = 9; 149 > i18; ++i18) {
            i19 += (i18 * i18);
        }
        switch ((((i18 >>> 1) % 7) * 5) + 81) {
        case 99:
            for (i20 = 16; i20 < 352; i20++) {
                i21 += (i20 | (long)f3);
                switch ((i20 % 5) + 121) {
                case 121:
                    Test0541.instanceCount += (i20 ^ i21);
                    f3 += (83.152F + (i20 * i20));
                case 122:
                    if (b2) continue;
                    if (b2) continue;
                    for (i22 = 75; i22 > 2; i22--) {
                        i23 >>= (int)-2204419136L;
                        i19 += i22;
                        i24 = 1;
                        while (++i24 < 2) {
                            i19 += (int)4630789830802045056L;
                            i23 += 39;
                            i19 += (((i24 * Test0541.sFld) + i18) - f3);
                            f3 = i18;
                            Test0541.instanceCount = Test0541.instanceCount;
                            i21 += i19;
                            byArr[i24 - 1] += (byte)i22;
                            Test0541.sFld = (short) -9;
                        }
                        Test0541.instanceCount = -52;
                        i21 += i18;
                        by1 -= (byte)-24166;
                        b2 = b2;
                        iArr[i22 + 1] -= i23;
                        i23 += i22;
                    }
                    break;
                case 123:
                    Test0541.instanceCount -= -61773114L;
                case 124:
                    Test0541.instanceCount -= i23;
                    break;
                case 125:
                    i21 = (int) Test0541.instanceCount;
                    break;
                }
            }
            break;
        case 112:
            byArr[(i24 >>> 1) % N] = (byte)-175L;
        case 84:
            dFld /= (i21 | 1);
            break;
        case 83:
            i23 += (int) Test0541.instanceCount;
            break;
        case 102:
            Test0541.instanceCount = i23;
            break;
        case 110:
            i23 |= (int) Test0541.instanceCount;
            break;
        case 114:
            i23 -= (int)dFld;
            break;
        default:
            iArr[(i21 >>> 1) % N] = i20;
        }

        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 f3 b2 = " + i21 + "," + Float.floatToIntBits(f3) + "," + (b2 ? 1 : 0));
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("by1 iArr byArr = " + by1 + "," + FuzzerUtils.checkSum(iArr) + "," +
            FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test0541.instanceCount Test0541.sFld dFld = " + Test0541.instanceCount + "," + Test0541.sFld + "," +
            Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("lArrFld = " + FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0541 _instance = new Test0541();
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