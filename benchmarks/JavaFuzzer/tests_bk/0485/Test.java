// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:05 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-44L;
    public static volatile float fFld=-35.14F;
    public static byte byFld=126;
    public static int iFld=10;
    public static long lFld=-6L;
    public volatile long lArrFld[]=new long[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(long l1, boolean b) {


        Test.iFld >>= (int)Test.instanceCount;
        long meth_res = l1 + (b ? 1 : 0);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth1(int i4, int i5, float f) {

        int i6=-10, i7=-64039, i8=-1, iArr1[]=new int[N];
        double d=-15.54808;
        short s=14708;
        boolean b1=false;

        FuzzerUtils.init(iArr1, 46394);

        for (i6 = 2; i6 < 278; i6++) {
            i4 *= (int)(((f * i5) + (Test.instanceCount - i5)) - Math.abs(i5--));
            switch ((i6 % 2) + 71) {
            case 71:
            case 72:
                i5 |= (i7 -= ((Test.byFld - i4) + (-i4)));
                for (d = 1; d < 6; ++d) {
                    switch ((int)((d % 8) + 89)) {
                    case 89:
                        try {
                            i5 = (i8 / -107);
                            iArr1[(int)(d + 1)] = (-42475 / i8);
                            i4 = (i4 % 8864);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 90:
                        i8 &= (--iArr1[(int)(d + 1)]);
                        try {
                            i4 = (iArr1[(int)(d - 1)] % -49729);
                            i8 = (-56 / i8);
                            i5 = (i8 / -233);
                        } catch (ArithmeticException a_e) {}
                        i5 = (int)Test.instanceCount;
                    case 91:
                        Test.instanceCount += (long)((long)d | s);
                        i5 += (int)(2723771008L + (d * d));
                        i8 >>= i5;
                        Test.fFld += (((++i7) - fMeth(Test.instanceCount, b1)) * -14);
                        break;
                    case 92:
                        i5 = (int)f;
                    case 93:
                        iArr1[(int)(d - 1)] = (int)d;
                        break;
                    case 94:
                        Test.instanceCount = Test.instanceCount;
                    case 95:
                        f -= i6;
                        break;
                    case 96:
                        i5 -= i5;
                        break;
                    }
                }
                break;
            default:
                Test.instanceCount = -1533497898L;
            }
        }
        vMeth1_check_sum += i4 + i5 + Float.floatToIntBits(f) + i6 + i7 + Double.doubleToLongBits(d) + i8 + s + (b1 ? 1
            : 0) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth() {

        int i3=-42484, i9=-10, i10=12295, i11=3, i12=74, i13=29750, iArr[]=new int[N];
        double d1=0.91593;
        float fArr[]=new float[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -173);
        FuzzerUtils.init(fArr, -1.535F);
        FuzzerUtils.init(lArr, 989808248L);

        iArr[(i3 >>> 1) % N] *= (iArr[(i3 >>> 1) % N]--);
        if (true) {
            vMeth1(i3, Test.iFld, 0.763F);
        } else {
            i9 = 1;
            do {
                for (i10 = 1; i10 < 5; ++i10) {
                    for (i12 = 2; 1 < i12; --i12) {
                        switch ((i9 % 3) + 89) {
                        case 89:
                            Test.byFld += (byte)(((i12 * Test.byFld) + Test.fFld) - Test.lFld);
                            fArr[i12 - 1] = Test.byFld;
                            Test.iFld = i10;
                            break;
                        case 90:
                            lArr[i10 - 1] ^= i3;
                            iArr = iArr;
                            iArr[i10 + 1] = -1;
                        case 91:
                        default:
                            d1 = i10;
                        }
                        iArr = iArr;
                    }
                }
            } while (++i9 < 334);
        }
        vMeth_check_sum += i3 + i9 + i10 + i11 + i12 + i13 + Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i=38291, i1=7830, i2=1, i14=-50, i15=-12, i16=-12, i17=-1147, i18=117, i19=-3, i20=-12, iArr2[]=new int[N];
        byte by=72;
        double d2=-2.73481, d3=-114.80381, dArr[]=new double[N];
        long l2=3414996616746685552L;
        float fArr1[]=new float[N];

        FuzzerUtils.init(iArr2, -135);
        FuzzerUtils.init(fArr1, -114.567F);
        FuzzerUtils.init(dArr, 1.44675);

        for (long l : lArrFld) {
            for (i = 2; 63 > i; ++i) {
                i2 = 1;
                do {
                    Test.instanceCount += (((i2 * Test.fFld) + i) - l);
                    i1 = Integer.reverseBytes(i1);
                } while (++i2 < 2);
                Test.instanceCount += (((i * i) + i1) - by);
                Test.instanceCount = (l * i);
                vMeth();
                i1 += i;
                Test.fFld = i1;
            }
        }
        d2 = Test.lFld;
        for (i14 = 5; i14 < 232; i14++) {
            i15 += (i14 + i1);
            for (i16 = 6; i16 < 111; i16++) {
                iArr2 = iArr2;
                for (i18 = 1; 2 > i18; ++i18) {
                    boolean b2=false;
                    fArr1[i14 - 1] = Test.lFld;
                    i1 <<= i1;
                    lArrFld[i14 - 1] %= ((long)(d2) | 1);
                    if (b2) break;
                    try {
                        i19 = (-1671621317 / i);
                        iArr2[i16 - 1] = (-49591 % i14);
                        Test.iFld = (1170669918 % i19);
                    } catch (ArithmeticException a_e) {}
                    l2 += i18;
                }
                switch ((i16 % 3) + 104) {
                case 104:
                    i19 *= -171;
                    dArr = dArr;
                    break;
                case 105:
                    fArr1 = fArr1;
                    i17 = i14;
                    break;
                case 106:
                    for (d3 = 2; d3 > 1; d3 -= 2) {
                        Test.instanceCount += (long)d3;
                        i20 -= Test.iFld;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("by d2 i14 = " + by + "," + Double.doubleToLongBits(d2) + "," + i14);
        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 i19 l2 = " + i18 + "," + i19 + "," + l2);
        FuzzerUtils.out.println("d3 i20 iArr2 = " + Double.doubleToLongBits(d3) + "," + i20 + "," +
            FuzzerUtils.checkSum(iArr2));
        FuzzerUtils.out.println("fArr1 dArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.byFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.byFld);
        FuzzerUtils.out.println("Test.iFld Test.lFld lArrFld = " + Test.iFld + "," + Test.lFld + "," +
            FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  fMeth ->  fMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
