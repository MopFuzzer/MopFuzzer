// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:30 2023
public class Test0396 {

    public static final int N = 400;

    public static volatile long instanceCount=1511932701L;
    public static double dFld=-1.27823;
    public static long[] lArrFld =new long[N];
    public int[] iArrFld =new int[N];
    public static volatile int[] iArrFld1 =new int[N];
    public static float[] fArrFld =new float[N];

    static {
        FuzzerUtils.init(Test0396.lArrFld, 6125L);
        FuzzerUtils.init(Test0396.iArrFld1, 10);
        FuzzerUtils.init(Test0396.fArrFld, 0.784F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i5, int i6) {

        int i8=-11, i9=0, i10=-6, i11=1334;
        boolean b=false;
        byte by=-111;
        float f2=-2.107F;
        short s=4090;

        switch ((((i6 >>> 1) % 10) * 5) + 78) {
        case 95:
            for (int i7 : Test0396.iArrFld1) {
                for (i8 = 1; i8 < 4; i8++) {
                    i9 = (int) Test0396.instanceCount;
                    Test0396.instanceCount <<= -6L;
                    if (b) continue;
                    Test0396.instanceCount = Test0396.instanceCount;
                    switch ((i8 % 5) + 49) {
                    case 49:
                        for (i10 = i8; i10 < 2; i10++) {
                            by = (byte)-52;
                            i6 -= (int) Test0396.instanceCount;
                            f2 += i5;
                            if (b) continue;
                            i6 -= (int)-2.249F;
                            i7 += i10;
                        }
                    case 50:
                        Test0396.instanceCount *= i6;
                        break;
                    case 51:
                        s = (short)f2;
                        break;
                    case 52:
                        i9 += i10;
                        break;
                    case 53:
                        i6 = i10;
                        break;
                    }
                }
            }
            break;
        case 90:
            Test0396.iArrFld1[(i11 >>> 1) % N] *= by;
            break;
        case 115:
            Test0396.dFld *= i5;
            break;
        case 81:
            Test0396.instanceCount = 4;
            break;
        case 94:
            i11 -= (int) Test0396.instanceCount;
            break;
        case 87:
            i6 -= i5;
            break;
        case 125:
            Test0396.dFld *= Test0396.dFld;
            break;
        case 89:
            f2 -= i6;
            break;
        case 86:
            Test0396.fArrFld[(i9 >>> 1) % N] += i9;
            break;
        case 105:
            Test0396.instanceCount += 6;
            break;
        }
        vMeth2_check_sum += i5 + i6 + i8 + i9 + (b ? 1 : 0) + i10 + i11 + by + Float.floatToIntBits(f2) + s;
    }

    public static void vMeth1(int i4, double d1) {

        long l=5565106075029978459L, l2=42791L;
        float f1=0.927F;
        int i12=-57040, i13=4;
        short s1=-26359;

        i4 *= (~((i4--) * (i4 + 19412)));
        Test0396.iArrFld1[(i4 >>> 1) % N] += i4;
        i4 ^= 216;
        l = 1;
        do {
            f1 -= (float)(((-48706 * (d1 - i4)) - d1) / ((i4++) | 1));
            Test0396.iArrFld1[(int) (l - 1)] = (--i4);
            vMeth2(i4, i4);
            for (l2 = 1; 8 > l2; l2++) {
                i4 += (int)l2;
                Test0396.fArrFld[(int) (l2 + 1)] += 20.134F;
                i13 = 1;
                do {
                    i12 *= i4;
                    i12 -= i4;
                    i4 += i13;
                    i12 -= s1;
                } while (++i13 < 2);
            }
        } while (++l < 193);
        vMeth1_check_sum += i4 + Double.doubleToLongBits(d1) + l + Float.floatToIntBits(f1) + l2 + i12 + i13 + s1;
    }

    public void vMeth(float f, double d) {

        int i=-134, i1=-3, i2=184, i3=46980;
        float[] fArr =new float[N];

        FuzzerUtils.init(fArr, -64.492F);

        for (i = 345; i > 14; --i) {
            Test0396.lArrFld[i + 1] = Test0396.instanceCount;
            for (i2 = 1; i2 < 5; i2++) {
                fArr[i - 1] = i;
                switch ((i2 % 7) + 50) {
                case 50:
                    switch (((i2 % 8) * 5) + 124) {
                    case 128:
                        try {
                            i1 = (-1415607206 % i);
                            i3 = (5079 % iArrFld[i2 + 1]);
                            i3 = (-29073 % i3);
                        } catch (ArithmeticException a_e) {}
                        d = (-i2);
                        break;
                    case 152:
                        f = (Math.abs(fArr[i2 - 1]--) * i2);
                        switch (((Math.max(i1, i) >>> 1) % 7) + 85) {
                        case 85:
                            i3 = (int) (f + (Test0396.instanceCount++));
                        case 86:
                            vMeth1(-27, d);
                            break;
                        case 87:
                            i1 = i;
                        case 88:
                            if (i1 != 0) {
                                vMeth_check_sum += Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i + i1 + i2 +
                                    i3 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                                return;
                            }
                            i3 = 5;
                            break;
                        case 89:
                            Test0396.instanceCount = Test0396.instanceCount;
                            break;
                        case 90:
                            Test0396.iArrFld1[i2 - 1] += i1;
                            break;
                        case 91:
                            Test0396.instanceCount += (i2 * i2);
                            break;
                        }
                        break;
                    case 153:
                        iArrFld[i] -= (int) Test0396.instanceCount;
                        break;
                    case 127:
                        Test0396.instanceCount = Test0396.instanceCount;
                        break;
                    case 130:
                        try {
                            i3 = (44561 / Test0396.iArrFld1[i]);
                            i3 = (i2 / iArrFld[i2 + 1]);
                            i1 = (iArrFld[i + 1] / i);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 139:
                        i1 *= (int)d;
                        break;
                    case 131:
                        i3 += (((i2 * i2) + i) - i3);
                        break;
                    case 149:
                        i1 += i;
                        break;
                    default:
                        i3 -= (int)-4854471769306777615L;
                    }
                case 51:
                    i1 |= i;
                case 52:
                    i1 += i2;
                    break;
                case 53:
                    i1 <<= i2;
                    break;
                case 54:
                    i3 += (((i2 * i) + Test0396.instanceCount) - f);
                case 55:
                    i1 += i1;
                    break;
                case 56:
                    i1 = (int)-2073312556930449622L;
                default:
                    Test0396.iArrFld1[i - 1] = (int) Test0396.instanceCount;
                }
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i + i1 + i2 + i3 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        float f3=0.817F, f4=0.1014F;
        int i14=0, i15=9, i16=0, i17=1, i18=175, i19=23340, i20=-1, i21=31423, i22=-16531;
        short s2=-12573;
        byte by1=-69;
        boolean b1=true;
        double[] dArr =new double[N];

        FuzzerUtils.init(dArr, 0.1662);

        vMeth(f3, Test0396.dFld);
        dArr = dArr;
        iArrFld[(i14 >>> 1) % N] = s2;
        for (i15 = 10; i15 < 219; i15++) {
            if (b1) {
                for (i17 = 3; 120 > i17; i17++) {
                    Test0396.instanceCount -= Test0396.instanceCount;
                    i18 = i14;
                    i16 -= (int) Test0396.instanceCount;
                    dArr[i15 + 1] = 0.339F;
                    f3 += 171;
                    i18 = 66;
                    i18 *= i18;
                }
                for (i19 = 7; i19 < 120; i19 += 3) {
                    Test0396.iArrFld1[i19] = (int) Test0396.instanceCount;
                    Test0396.instanceCount = Test0396.instanceCount;
                    Test0396.iArrFld1[i19 + 1] = i20;
                    switch ((i19 % 3) + 115) {
                    case 115:
                        i16 >>>= i16;
                        Test0396.dFld += by1;
                        i16 = i17;
                        i14 = i15;
                        break;
                    case 116:
                        try {
                            i18 = (Test0396.iArrFld1[i19 - 1] % 34632);
                            i20 = (i18 % -63);
                            Test0396.iArrFld1[i19 - 1] = (-124 % i20);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 117:
                        Test0396.dFld = -10497;
                        i16 = -49;
                        for (i21 = 1; 4 > i21; i21++) {
                            f3 -= -8374;
                            Test0396.dFld = f4;
                            i16 >>= i20;
                            i20 = i21;
                        }
                        break;
                    }
                }
            }
        }

        FuzzerUtils.out.println("f3 i14 s2 = " + Float.floatToIntBits(f3) + "," + i14 + "," + s2);
        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("by1 i21 i22 = " + by1 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("f4 b1 dArr = " + Float.floatToIntBits(f4) + "," + (b1 ? 1 : 0) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test0396.instanceCount Test0396.dFld Test0396.lArrFld = " + Test0396.instanceCount + "," +
                Double.doubleToLongBits(Test0396.dFld) + "," + FuzzerUtils.checkSum(Test0396.lArrFld));
        FuzzerUtils.out.println("iArrFld Test0396.iArrFld1 Test0396.fArrFld = " + FuzzerUtils.checkSum(iArrFld) + "," +
                FuzzerUtils.checkSum(Test0396.iArrFld1) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0396.fArrFld)));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0396 _instance = new Test0396();
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
