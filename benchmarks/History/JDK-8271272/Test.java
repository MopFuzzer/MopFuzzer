// Generated by Java* Fuzzer test generator (1.0.001). Sat Jul 24 15:16:41 2021
public class Test {

    public static final int N = 400;

    public static long instanceCount=1028145301125055218L;
    public static float fFld=-49.539F;
    public static byte byFld=46;
    public static volatile boolean bFld=false;
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 32719);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i5=-3;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, 32718L);

        lArr[(i5 >>> 1) % N] -= i5;
        i5 -= i5;
        vMeth2_check_sum += i5 + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1() {

        int i6=-50343, i7=61713, i8=34036, i9=-3, i10=-783;
        boolean b=false;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(lArr1, -59L);

        vMeth2();
        i6 = 15;
        Test.instanceCount %= ((long)(Test.fFld) | 1);
        for (long l : lArr1) {
            if (b) {
                for (i7 = 1; i7 < 4; ++i7) {
                    l += i7;
                    i6 *= i6;
                    b = b;
                }
                Test.fFld = i8;
                lArr1[(i6 >>> 1) % N] -= i7;
            } else if (b) {
                Test.iArrFld[(i8 >>> 1) % N] *= i7;
            } else if (b) {
                for (i9 = 1; i9 < 4; i9++) {
                    i10 += (((i9 * i6) + i7) - i9);
                    Test.instanceCount /= (i8 | 1);
                }
            } else {
                try {
                    i10 = (i8 / -1789967521);
                    i8 = (i6 / 1725903535);
                    i10 = (56 % i6);
                } catch (ArithmeticException a_e) {}
            }
        }
        vMeth1_check_sum += i6 + i7 + i8 + (b ? 1 : 0) + i9 + i10 + FuzzerUtils.checkSum(lArr1);
    }

    public static void vMeth(int i3, float f, int i4) {

        short s=-29369;
        int i11=-2, i12=-12, i13=32901, i14=43741, i15=12;

        s += (short)(Test.instanceCount + i4);
        vMeth1();
        i4 = i3;
        i3 = i4;
        for (i11 = 7; i11 < 325; ++i11) {
            s += (short)7L;
            i13 = 1;
            while ((i13 += 3) < 5) {
                i12 += (i13 * i13);
                Test.instanceCount *= i11;
                i4 += i13;
                Test.instanceCount = s;
                Test.iArrFld[i13 - 1] = 906;
                for (i14 = i13; i14 < 5; i14 += 2) {
                    Test.instanceCount += i14;
                    i3 += i14;
                }
            }
        }
        vMeth_check_sum += i3 + Float.floatToIntBits(f) + i4 + s + i11 + i12 + i13 + i14 + i15;
    }

    public void mainTest(String[] strArr1) {

        int i=-93;
        int i1=0;
        int i2=11;
        int i16=-31571;
        int i17=-12863;
        int i18=-47790;
        int i19=84;
        int i20=94;
        int i21=1;
        int[][] iArr =new int[N][N];
        double d=0.103923, d1=2.95070;
        short s1=-16066;
        short[] sArr =new short[N];

        FuzzerUtils.init(iArr, -8);
        FuzzerUtils.init(sArr, (short)-9247);

        i *= (((i + i) - (-6091 << Integer.reverseBytes(i))) + i);
        for (i1 = 12; i1 < 226; i1++) {
            vMeth(i1, 122.835F, i);
            d = s1;
            Test.iArrFld[i1 + 1] = 26368;
            Test.fFld = Test.byFld;
            Test.bFld = Test.bFld;
            i *= s1;
        }
        for (i16 = 12; i16 < 282; i16++) {
            Test.iArrFld[i16 - 1] = i2;
            for (i18 = 2; i18 < 93; i18++) {
                i17 += (-19 + (i18 * i18));
                i = (int)d;
                Test.instanceCount -= i17;
            }
            d = i1;
            d1 = 1;
            while (++d1 < 93) {
                i17 += (int)(((d1 * i) + i17) - i1);
                for (i20 = 1; i20 < 1; ++i20) {
                    switch ((((i20 >>> 1) % 5) * 5) + 31) {
                    case 56:
                        i17 -= (int)Test.instanceCount;
                        break;
                    case 33:
                        i %= (int)(i18 | 1);
                        i21 += (-4602 + (i20 * i20));
                        iArr = iArr;
                        Test.instanceCount = -81;
                        break;
                    case 51:
                        sArr[(int)(d1)] = (short)12;
                        iArr[(int)(d1)][(int)(d1 + 1)] /= (int)(Test.instanceCount | 1);
                        break;
                    case 48:
                    case 41:
                        Test.iArrFld[i20 + 1] += i21;
                        Test.instanceCount <<= i18;
                        break;
                    }
                    iArr[i20] = iArr[i20];
                }
                i = (int)-4948575231618180707L;
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("d s1 i16 = " + Double.doubleToLongBits(d) + "," + s1 + "," + i16);
        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("d1 i20 i21 = " + Double.doubleToLongBits(d1) + "," + i20 + "," + i21);
        FuzzerUtils.out.println("iArr sArr = " + FuzzerUtils.checkSum(iArr) + "," + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.byFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.byFld);
        FuzzerUtils.out.println("Test.bFld Test.iArrFld = " + (Test.bFld ? 1 : 0) + "," +
            FuzzerUtils.checkSum(Test.iArrFld));

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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
