// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:00 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=54L;
    public static volatile byte byFld=34;
    public static float fFld=2.896F;
    public static volatile int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -3);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth() {

        boolean b=true;
        int i8=98, i9=-27893, i10=6, i11=-8, i12=-58369, i13=-55, i14=-33775, i15=14430;
        float f1=84.244F;

        b = b;
        for (i8 = 13; 350 > i8; i8 += 3) {
            i9 = i9;
            if (b) {
                f1 = i9;
                Test.iArrFld[i8 - 1] = (int)Test.instanceCount;
                for (i10 = 1; 14 > i10; ++i10) {
                    for (i12 = i8; i12 < 2; ++i12) {
                        f1 += i12;
                        i9 += (i12 | i11);
                        f1 += (((i12 * i12) + Test.instanceCount) - i10);
                    }
                    for (i14 = i10; i14 < 2; i14++) {
                        Test.instanceCount = i15;
                        Test.iArrFld[i14] += i15;
                        i15 *= -9;
                    }
                }
            } else if (b) {
                try {
                    i13 = (i14 / -33066);
                    i11 = (Test.iArrFld[i8 + 1] % 205);
                    i13 = (i11 % i9);
                } catch (ArithmeticException a_e) {}
            } else if (b) {
                i9 += (i8 - i13);
            } else {
                i13 += i9;
            }
        }
        long meth_res = (b ? 1 : 0) + i8 + i9 + Float.floatToIntBits(f1) + i10 + i11 + i12 + i13 + i14 + i15;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1(float f, long l, int i3) {

        int i4=8, i5=-1342, i6=-43510, i7=-109;
        double d1=0.2406;
        short s1=-9330;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -5L);

        i4 = 1;
        while (++i4 < 184) {
            for (d1 = 1; d1 < 9; d1++) {
                i5 <<= i3;
                Test.iArrFld[(int)(d1 - 1)] = Test.iArrFld[(int)(d1 - 1)];
                switch ((int)((d1 % 10) + 44)) {
                case 44:
                    i5 = (int)(Test.instanceCount -= ((i5++) + (i3 + 191)));
                case 45:
                    l = (--i5);
                    break;
                case 46:
                    for (i6 = (int)(d1); i6 < 2; i6++) {
                        f += (((i6 * f) + i5) - f);
                        l *= i7;
                        lMeth();
                        i3 <<= i4;
                        i7 = i7;
                    }
                    i3 += (int)(d1 * d1);
                    s1 -= Test.byFld;
                case 47:
                    l -= i7;
                    break;
                case 48:
                    i5 += (64474 + (d1 * d1));
                    break;
                case 49:
                    lArr[i4 + 1] -= i6;
                    break;
                case 50:
                    i7 += i5;
                case 51:
                    i7 += (int)(((d1 * f) + i4) - i5);
                    break;
                case 52:
                    Test.iArrFld[i4] += -3;
                    break;
                case 53:
                    l = l;
                    break;
                default:
                    i7 += i7;
                }
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f) + l + i3 + i4 + Double.doubleToLongBits(d1) + i5 + i6 + i7 + s1 +
            FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(int i1, int i2) {

        double d=0.79361;
        int i16=10, i17=-6, i18=11, i19=-19754;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 0.243F);

        fArr = (fArr = FuzzerUtils.float1array(N, (float)-2.1020F));
        i2 = (Test.iArrFld[(i1 >>> 1) % N] * (i1++));
        d += (--i2);
        vMeth1(Test.fFld, Test.instanceCount, -11);
        for (i16 = 9; i16 < 341; i16++) {
            i18 = 1;
            do {
                i1 = (int)-2.104556;
                Test.fFld = Test.instanceCount;
                i17 = i18;
                switch ((((i2 >>> 1) % 2) * 5) + 1) {
                case 11:
                    i19 = 1;
                    do {
                        i1 += (((i19 * Test.fFld) + Test.instanceCount) - i19);
                        i1 *= (int)Test.instanceCount;
                        Test.iArrFld[i18 - 1] = Test.byFld;
                        fArr[i16] = Test.instanceCount;
                    } while (++i19 < 1);
                    break;
                case 6:
                }
            } while (++i18 < 5);
        }
        vMeth_check_sum += i1 + i2 + Double.doubleToLongBits(d) + i16 + i17 + i18 + i19 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i=7152, iArr[]=new int[N];
        short s=-2243;

        FuzzerUtils.init(iArr, 36469);

        iArr[(i >>> 1) % N] *= Short.reverseBytes((short)(--s));
        vMeth(i, 32623);

        FuzzerUtils.out.println("i s iArr = " + i + "," + s + "," + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.fFld = " + Test.instanceCount + "," + Test.byFld +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
