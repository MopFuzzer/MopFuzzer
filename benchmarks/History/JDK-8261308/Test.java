// Generated by Java* Fuzzer test generator (1.0.001). Fri Feb  5 07:39:57 2021
public class Test {

    public static final int N = 400;

    public static long instanceCount=163L;
    public static double dFld=2.111255;
    public static float fFld=0.438F;
    public static short sFld=-16210;
    public static boolean bFld=false;
    public long[] lArrFld =new long[N];
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -55113);
    }

    public static long vMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static boolean bMeth(int i8, double d) {

        int[] iArr =new int[N];

        FuzzerUtils.init(iArr, 26415);

        i8 = (--iArr[(14 >>> 1) % N]);
        long meth_res = i8 + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static void vMeth2() {

        int i10=1;
        int i11=-9;
        int i12=-133;
        int i13=-131;
        int[] iArr2 =new int[N];
        boolean b=true;
        boolean[] bArr =new boolean[N];
        byte by2=-42;
        short s1=1467;

        FuzzerUtils.init(iArr2, 0);
        FuzzerUtils.init(bArr, false);

        for (i10 = 7; 189 > i10; ++i10) {
            b = b;
            if (b) continue;
            i11 -= (int)Test.instanceCount;
            i11 >>= i11;
        }
        iArr2[(i10 >>> 1) % N] = by2;
        iArr2 = FuzzerUtils.int1array(N, (int)0);
        for (i12 = 19; 313 > i12; i12++) {
            bArr = bArr;
        }
        i13 = i10;
        i13 = 14;
        i13 = s1;
        vMeth2_check_sum += i10 + i11 + (b ? 1 : 0) + by2 + i12 + i13 + s1 + FuzzerUtils.checkSum(iArr2) +
            FuzzerUtils.checkSum(bArr);
    }

    public static void vMeth1() {

        int i9=-12, i14=7, i15=14563, i16=6969, i17=128;
        byte by1=65;
        long l=-652972055L;
        short s2=-26082;
        double[] dArr =new double[N];

        FuzzerUtils.init(dArr, 1.86675);

        dArr[(i9 >>> 1) % N] += (by1++);
        vMeth2();
        i9 <<= i9;
        for (l = 1; l < 314; l++) {
            i14 <<= i9;
            for (i15 = 1; i15 < 5; ++i15) {
                Test.fFld = s2;
                i17 = 1;
                do {
                    i14 += (i17 ^ s2);
                    try {
                        i16 = (i17 % 1334241134);
                        Test.iArrFld[i15 + 1] = (i16 % 31058);
                        i14 = (Test.iArrFld[(int)(l)] % i15);
                    } catch (ArithmeticException a_e) {}
                    Test.fFld /= (Test.instanceCount | 1);
                    i9 += i17;
                    if (i16 != 0) {
                        vMeth1_check_sum += i9 + by1 + l + i14 + i15 + i16 + s2 + i17 +
                            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                        return;
                    }
                } while (++i17 < 2);
                by1 += (byte)i15;
                i14 = i9;
            }
        }
        vMeth1_check_sum += i9 + by1 + l + i14 + i15 + i16 + s2 + i17 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void vMeth(int i) {

        int i1=64639;
        int i2=33163;
        int i3=-2;
        int i4=249;
        int i5=-148;
        int i6=-63;
        int i7=11;
        int[] iArr1 =new int[N];
        byte by=31;
        short s=-17898;

        FuzzerUtils.init(iArr1, -12);

        for (i1 = 271; i1 > 7; i1--) {
            i2 += (i1 | i2);
        }
        for (i3 = 4; i3 < 235; ++i3) {
            i += (((i3 * i2) + Test.instanceCount) - Test.instanceCount);
            by += (byte)i3;
            Test.instanceCount -= (++s);
            switch ((((++i4) >>> 1) % 3) + 84) {
            case 84:
                i5 = 1;
                while (++i5 < 7) {
                    if (i1 != 0) {
                        vMeth_check_sum += i + i1 + i2 + i3 + i4 + by + s + i5 + i6 + i7 + FuzzerUtils.checkSum(iArr1);
                        return;
                    }
                    for (i6 = 1; 1 > i6; i6++) {
                        if (bMeth(Math.min(iArr1[i3]++, (int)(126.43418 - (-4 - (++i7)))), Test.dFld--) &&
                            bMeth((int)(-(i4 + Test.instanceCount)), Test.dFld)) continue;
                        lArrFld[i3] += Test.instanceCount;
                        Test.instanceCount -= i4;
                        vMeth1();
                        Test.fFld -= i;
                    }
                }
                break;
            case 85:
                i7 = i7;
                break;
            case 86:
                i2 = (int)Test.instanceCount;
            default:
                i2 += (((i3 * Test.instanceCount) + i1) - Test.instanceCount);
            }
        }
        vMeth_check_sum += i + i1 + i2 + i3 + i4 + by + s + i5 + i6 + i7 + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i18=142, i19=9, i21=53798, i22=2608;
        long l1=1189855284L;
        float[] fArr =new float[N];

        FuzzerUtils.init(fArr, -83.692F);

        vMeth(i18);
        i19 = 1;
        do {
            Test.iArrFld[i19] = Test.sFld;
            i18 += i19;
            if (Test.bFld) {
                i18 += (i19 * Test.instanceCount);
                i18 = i18;
                i18 += (((i19 * i19) + i18) - Test.fFld);
                if (Test.bFld) continue;
            } else {
                i18 += (-19052 + (i19 * i19));
                Test.iArrFld[i19 - 1] /= (int)((long)(Test.fFld) | 1);
                Test.fFld = i19;
                if (true) {
                    if (Test.bFld) {
                        i21 = 1;
                        do {
                            i18 += i21;
                            Test.dFld = Test.instanceCount;
                        } while (++i21 < 145);
                    } else if (true) {
                        l1 = 1;
                        do {
                            Test.bFld = Test.bFld;
                            i22 = 1;
                            do {
                                Test.iArrFld[(int)(l1)] = (int)l1;
                                Test.iArrFld[i22 - 1] |= i21;
                                Test.instanceCount += (((i22 * Test.sFld) + i22) - i19);
                                Test.instanceCount = (long)Test.fFld;
                                i18 -= Test.sFld;
                                lArrFld[i22] >>= l1;
                                i18 += (((i22 * i21) + Test.sFld) - Test.instanceCount);
                                fArr[(int)(l1 - 1)] = i19;
                            } while (++i22 < 1);
                            Test.instanceCount += l1;
                            lArrFld[i19 + 1] *= i21;
                        } while (++l1 < 145);
                    } else if (Test.bFld) {
                        i18 += (i19 + l1);
                    }
                }
            }
        } while (++i19 < 173);

        FuzzerUtils.out.println("i18 i19 i21 = " + i18 + "," + i19 + "," + i21);
        FuzzerUtils.out.println("l1 i22 fArr = " + l1 + "," + i22 + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.fFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(Test.dFld) + "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.sFld Test.bFld lArrFld = " + Test.sFld + "," + (Test.bFld ? 1 : 0) + "," +
            FuzzerUtils.checkSum(lArrFld));
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  bMeth ->  bMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
