// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug  1 15:40:37 2018
public class Test {

    public static final int N = 400;

    public static long instanceCount=-5152076001200925332L;
    public int iFld=-17790;
    public static short sFld=-11952;
    public static byte byFld=-55;
    public static double dFld=-71.129686;
    public static boolean bFld=true;
    public static long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 226L);
    }

    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long fMeth1_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static float fMeth(float f1, float f2, int i4) {


        i4 *= (int)(--Test.lArrFld[(i4 >>> 1) % N]);
        long meth_res = Float.floatToIntBits(f1) + Float.floatToIntBits(f2) + i4;
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth1(double d1, int i6) {

        int i7=-73;
        int i8=-14;
        int i9=-17;
        int i10=216;
        int i11=11;
        int i12=132;
        int[] iArr =new int[N];
        double d2=-65.73617;
        boolean b=true;

        FuzzerUtils.init(iArr, 81);

        i7 = 1;
        do {
            Test.instanceCount += (i7 + i6);
            i6 += (((i7 * i7) + i6) - i7);
        } while (++i7 < 154);
        for (i8 = 1; i8 < 139; ++i8) {
            for (d2 = 1; d2 < 11; ++d2) {
                for (i11 = 1; i11 < 2; ++i11) {
                    float f4=0.805F;
                    f4 = (float)d2;
                    if (b) continue;
                    i6 -= i8;
                    i10 += i11;
                    i9 -= (int)f4;
                    switch (((i8 % 1) * 5) + 95) {
                    case 98:
                        i6 = Test.byFld;
                        f4 += (((i11 * i8) + f4) - i8);
                        iArr = iArr;
                    }
                }
            }
        }
        vMeth1_check_sum += Double.doubleToLongBits(d1) + i6 + i7 + i8 + i9 + Double.doubleToLongBits(d2) + i10 + i11 +
            i12 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr);
    }

    public static float fMeth1(float f3, int i5) {

        int i13=37487;
        int i14=10;
        int i15=-54122;
        int i16=3;
        int[] iArr1 =new int[N];

        FuzzerUtils.init(iArr1, 4);

        vMeth1(Test.dFld, i5);
        for (i13 = 17; i13 < 374; i13 += 3) {
            i5 -= (int)Test.instanceCount;
            i14 += i13;
            i14 += (((i13 * i14) + i13) - i13);
            i5 -= 6116;
            i14 = (int)Test.instanceCount;
            i15 = 1;
            do {
                i14 *= i13;
                i5 += i15;
                i14 += (((i15 * i14) + i5) - i15);
                i16 = 1;
                do {
                    i5 += i16;
                    Test.bFld = Test.bFld;
                } while (++i16 < 1);
            } while (++i15 < 13);
            iArr1[i13 - 1] += i13;
        }
        long meth_res = Float.floatToIntBits(f3) + i5 + i13 + i14 + i15 + i16 + FuzzerUtils.checkSum(iArr1);
        fMeth1_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth() {

        int i=131;
        int i1=91;
        int i2=4;
        int i3=8;
        int i17=6;
        int i18=95;
        int[] iArr2 =new int[N];
        long l=-1661579399L;

        FuzzerUtils.init(iArr2, 132);

        for (i = 2; i < 316; i++) {
            float f=1.970F;
            Test.instanceCount += (((i * i1) + f) - i1);
            for (i2 = 1; 5 > i2; ++i2) {
                Test.instanceCount = (long)Math.abs(fMeth(fMeth1(f, i2), f, i));
                Test.instanceCount += (i2 * i);
                i3 *= i;
                iArr2[i] += 5;
            }
            i17 = 1;
            while (++i17 < 5) {
                i1 += (int)(-669150066351304210L + (i17 * i17));
                for (l = 1; l < 1; l++) {
                    try {
                        i18 = (-220 % iArr2[(int)(l)]);
                        iArr2[(int)(l)] = (-235 % iArr2[i17 - 1]);
                        i18 = (i18 % -32796);
                    } catch (ArithmeticException a_e) {}
                }
                iArr2[i - 1] = i18;
                Test.lArrFld[i17 - 1] = i18;
                Test.instanceCount ^= 8637871727415385953L;
            }
            i18 += (((i * l) + i17) - i3);
        }
        vMeth_check_sum += i + i1 + i2 + i3 + i17 + l + i18 + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        double d=-1.66059;
        int i19=-57264;
        int i20=55619;
        int i21=-250;
        int i22=5653;
        int i23=44645;
        int i24=-10;
        int[][] iArr3 =new int[N][N];
        long l1=-57976L;
        float f5=-90.553F;
        float[] fArr =new float[N];

        FuzzerUtils.init(iArr3, 8);
        FuzzerUtils.init(fArr, -2.321F);

        iFld = (int)Test.instanceCount;
        iFld = (int)(Test.lArrFld[(iFld >>> 1) % N] /= (Test.sFld | 1));
        iFld = (int)((--Test.instanceCount) + 2.105147);
        iFld = (int)(((iFld - d) - (Test.sFld += (short)iFld)) * (++iFld));
        vMeth();
        switch ((((iFld >>> 1) % 4) * 5) + 116) {
        case 130:
            i19 = 1;
            while (++i19 < 233) {
                try {
                    iFld = (iFld % i19);
                    iFld = (i19 / -1);
                    iFld = (684135212 / iFld);
                } catch (ArithmeticException a_e) {}
                Test.instanceCount *= i19;
                for (i20 = 3; i20 < 108; ++i20) {
                    switch ((i20 % 1) + 100) {
                    case 100:
                        for (l1 = 1; l1 < 2; ++l1) {
                            iFld += (int)(((l1 * i20) + iFld) - i22);
                            if (Test.bFld) {
                                i21 -= (int)l1;
                                f5 -= i22;
                            } else if (false) {
                                i22 = (int)l1;
                                i21 *= i22;
                                f5 = i21;
                                iFld >>>= i20;
                            }
                        }
                        break;
                    }
                    i22 *= iFld;
                    iFld *= -145;
                }
            }
            for (i23 = 151; i23 > 8; --i23) {
                Test.instanceCount ^= l1;
                iFld -= (int)Test.instanceCount;
                Test.instanceCount = 49733;
                i22 -= (int)Test.instanceCount;
                iArr3[i23 - 1][i23] = Test.byFld;
                Test.bFld = true;
                i21 += i23;
            }
            break;
        case 120:
            iFld = (int)l1;
        case 122:
            i21 >>= i24;
        case 118:
            fArr[(i19 >>> 1) % N] = -8L;
        default:
            iArr3[(i24 >>> 1) % N][(i20 >>> 1) % N] = (int)l1;
        }

        FuzzerUtils.out.println("d i19 i20 = " + Double.doubleToLongBits(d) + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 l1 i22 = " + i21 + "," + l1 + "," + i22);
        FuzzerUtils.out.println("f5 i23 i24 = " + Float.floatToIntBits(f5) + "," + i23 + "," + i24);
        FuzzerUtils.out.println("iArr3 fArr = " + FuzzerUtils.checkSum(iArr3) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount iFld Test.sFld = " + Test.instanceCount + "," + iFld + "," +
            Test.sFld);
        FuzzerUtils.out.println("Test.byFld Test.dFld Test.bFld = " + Test.byFld + "," +
            Double.doubleToLongBits(Test.dFld) + "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.lArrFld = " + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("fMeth1_check_sum: " + fMeth1_check_sum);
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
//DEBUG  fMeth ->  fMeth vMeth mainTest
//DEBUG  fMeth1 ->  fMeth1 vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 fMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
