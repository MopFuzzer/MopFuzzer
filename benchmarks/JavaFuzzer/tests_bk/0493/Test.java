// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:05 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3434140786L;
    public double dFld=1.128076;
    public static int iFld=-64;
    public static volatile float fFld=0.728F;
    public static double dFld1=87.92100;
    public static byte byFld=48;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];
    public static double dArrFld[][]=new double[N][N];

    static {
        FuzzerUtils.init(Test.lArrFld, -4070686721L);
        FuzzerUtils.init(Test.iArrFld, -38561);
        FuzzerUtils.init(Test.dArrFld, 1.104030);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(int i3) {

        int i4=63107, i5=-69, i6=-74, i7=-11, i8=-10, i9=3, iArr2[]=new int[N];

        FuzzerUtils.init(iArr2, -156);

        Test.iFld = i3;
        for (i4 = 265; 7 < i4; i4 -= 3) {
            Test.iFld >>>= Test.iFld;
            Test.fFld = (float)Test.dFld1;
            Test.iFld = (int)Test.instanceCount;
            for (i6 = 18; i6 > 1; --i6) {
                iArr2[i6 + 1] += i7;
                i5 -= (int)Test.fFld;
            }
            i3 += i5;
            for (i8 = 1; i8 < 18; ++i8) {
                i7 += (i8 * i8);
                Test.fFld -= i3;
                i7 += (int)Test.instanceCount;
            }
        }
        Test.iFld = 52097;
        Test.instanceCount >>>= Test.iFld;
        long meth_res = i3 + i4 + i5 + i6 + i7 + i8 + i9 + FuzzerUtils.checkSum(iArr2);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth() {

        int i10=38694, i11=12, i12=11, i13=601, iArr3[]=new int[N];
        boolean b=false;
        float fArr1[]=new float[N];

        FuzzerUtils.init(fArr1, 98.137F);
        FuzzerUtils.init(iArr3, 226);

        switch ((((Test.iFld - Test.iFld) >>> 1) % 9) + 73) {
        case 73:
            Test.lArrFld[(Test.iFld >>> 1) % N] *= (long)((fMeth(Test.iFld) - -42676) + Test.iFld);
            for (i10 = 10; i10 < 280; i10++) {
                Test.instanceCount = 38639;
                b = b;
                Test.instanceCount = Test.instanceCount;
                Test.fFld /= (i10 | 1);
                for (i12 = 6; i12 > 1; i12 -= 2) {
                    Test.byFld += (byte)i11;
                    Test.instanceCount += (i12 * i12);
                    switch ((i10 % 1) + 12) {
                    case 12:
                        i13 -= i11;
                        break;
                    }
                    i11 -= (int)-183189804L;
                    Test.instanceCount >>= i10;
                    if (b) continue;
                }
            }
            break;
        case 74:
            Test.instanceCount -= Test.iFld;
            break;
        case 75:
            fArr1[(i11 >>> 1) % N] = i13;
            break;
        case 76:
            Test.instanceCount += i13;
            break;
        case 77:
            iArr3[(Test.iFld >>> 1) % N] *= i13;
            break;
        case 78:
            Test.iFld -= i10;
            break;
        case 79:
            Test.instanceCount -= Test.iFld;
            break;
        case 80:
            Test.iFld -= i13;
            break;
        case 81:
            i13 *= i11;
            break;
        }
        vMeth_check_sum += i10 + i11 + (b ? 1 : 0) + i12 + i13 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) +
            FuzzerUtils.checkSum(iArr3);
    }

    public static int iMeth() {

        double d=-1.8235;
        int i2=-14, i14=-41425, i15=-8, iArr1[]=new int[N];
        float f1=1.282F;
        byte by1=119;
        short s=-9219;

        FuzzerUtils.init(iArr1, -58738);

        d *= (iArr1[(i2 >>> 1) % N]++);
        i2 *= (int)(Test.instanceCount = (i2 << (i2 + i2)));
        f1 = 1;
        do {
            i2 += (int)((Test.instanceCount--) * ((by1 - s) - (i2 = i2)));
            vMeth();
            Test.instanceCount += Test.instanceCount;
            Test.iFld += (int)(7574953684446768891L + (f1 * f1));
            Test.instanceCount += (long)113.48299;
            try {
                Test.iFld = (iArr1[(int)(f1 + 1)] % -23765);
                Test.iFld = (Test.iFld / i2);
                Test.iFld = (Test.iFld / 317044600);
            } catch (ArithmeticException a_e) {}
            for (i14 = 1; 9 > i14; i14++) {
                d = i15;
                Test.instanceCount &= i15;
            }
            Test.iArrFld[(int)(f1)] -= (int)3733441204L;
        } while (++f1 < 174);
        Test.dArrFld[(i15 >>> 1) % N][(i2 >>> 1) % N] *= i2;
        i15 = (int)Test.instanceCount;
        long meth_res = Double.doubleToLongBits(d) + i2 + Float.floatToIntBits(f1) + by1 + s + i14 + i15 +
            FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=11669, i1=-225, i16=9, i17=-29, i18=-6, i19=-3394, i20=152, i21=59, iArr[]=new int[N];
        float f=44.500F, fArr[][]=new float[N][N];
        byte by=-106;
        short s1=-24534;

        FuzzerUtils.init(iArr, 194);
        FuzzerUtils.init(fArr, -47.398F);

        iArr[(i >>> 1) % N] = (int)dFld;
        i1 = 220;
        while (--i1 > 0) {
            f += (((i1 * i1) + i1) - i);
            Test.instanceCount += (49057 + by);
            i = (int)(((f * i) * (Test.instanceCount--)) - (--iArr[i1]));
            f = i;
            Test.lArrFld[i1] = i;
            i = (int)Math.max(Test.instanceCount--, (long)(f - Math.max(i1, i1)));
            fArr[(i1 >>> 1) % N][i1] = (iMeth() * Test.instanceCount);
            for (i16 = 3; i16 < 114; ++i16) {
                i17 &= i1;
                switch ((i1 % 1) + 99) {
                case 99:
                    Test.instanceCount += (((i16 * i1) + i1) - Test.instanceCount);
                    s1 += (short)(((i16 * i1) + Test.iFld) - Test.fFld);
                    switch (((i16 % 9) * 5) + 30) {
                    case 59:
                        i17 += (((i16 * Test.instanceCount) + i16) - i1);
                        for (i18 = 1; i18 < 2; ++i18) {
                            Test.fFld += (((i18 * i18) + Test.instanceCount) - i19);
                            s1 -= (short)i20;
                            i20 += i18;
                            Test.instanceCount >>= -8;
                            Test.instanceCount >>>= i17;
                        }
                        break;
                    case 43:
                        Test.fFld -= 2694;
                    case 35:
                        i21 = 2;
                        do {
                            i19 = Test.iFld;
                            i19 >>= i;
                            Test.fFld -= Test.instanceCount;
                            i -= (int)Test.fFld;
                            by = (byte)i1;
                            i19 += -59247;
                        } while (--i21 > 0);
                    case 34:
                        Test.iArrFld[i1 + 1] *= -61366;
                        break;
                    case 69:
                        i *= (int)Test.instanceCount;
                        break;
                    case 49:
                        f += (((i16 * s1) + Test.instanceCount) - i21);
                        break;
                    case 75:
                        i19 += (((i16 * i19) + Test.instanceCount) - Test.instanceCount);
                        break;
                    case 56:
                        Test.iArrFld = iArr;
                    case 66:
                        i20 /= (int)(i16 | 1);
                    }
                    break;
                default:
                    i19 = i18;
                }
            }
        }

        FuzzerUtils.out.println("i i1 f = " + i + "," + i1 + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("by i16 i17 = " + by + "," + i16 + "," + i17);
        FuzzerUtils.out.println("s1 i18 i19 = " + s1 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 iArr = " + i20 + "," + i21 + "," + FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println("fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount dFld Test.iFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(dFld) + "," + Test.iFld);
        FuzzerUtils.out.println("Test.fFld Test.dFld1 Test.byFld = " + Float.floatToIntBits(Test.fFld) + "," +
            Double.doubleToLongBits(Test.dFld1) + "," + Test.byFld);
        FuzzerUtils.out.println("Test.lArrFld Test.iArrFld Test.dArrFld = " + FuzzerUtils.checkSum(Test.lArrFld) + ","
            + FuzzerUtils.checkSum(Test.iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));

        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  fMeth ->  fMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
