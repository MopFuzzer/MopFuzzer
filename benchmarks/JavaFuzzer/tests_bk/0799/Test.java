// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:13 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=2010181880L;
    public static float fFld=-17.952F;

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i7) {

        int i9=2, i10=9, i11=126, iArr3[]=new int[N];

        FuzzerUtils.init(iArr3, -63515);

        for (int i8 : iArr3) {
            i7 += -23232;
            for (i9 = 1; i9 < 4; ++i9) {
                switch ((i9 % 3) + 10) {
                case 10:
                    i7 *= -14;
                    i10 = 6;
                    break;
                case 11:
                    iArr3[i9 - 1] >>>= i8;
                    Test.instanceCount += (i9 * i9);
                    i10 = -208;
                    Test.instanceCount += i10;
                case 12:
                    Test.fFld -= i8;
                    i11 = 1;
                    while (++i11 < 2) {
                        try {
                            i7 = (i11 % 13628);
                            i10 = (i9 / -10252);
                            iArr3[i11] = (i11 / i10);
                        } catch (ArithmeticException a_e) {}
                        iArr3[i9 + 1] = i9;
                        Test.instanceCount += (7 + (i11 * i11));
                    }
                default:
                    Test.instanceCount += Test.instanceCount;
                }
            }
        }
        long meth_res = i7 + i9 + i10 + i11 + FuzzerUtils.checkSum(iArr3);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth1() {

        int i5=2, i6=183, i12=42340, i13=17398, i14=-245, iArr2[]=new int[N];
        short s=-10303;
        double d1=-80.25872;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr2, -53410);
        FuzzerUtils.init(lArr, 4758206851115412973L);

        for (i5 = 7; i5 < 297; i5++) {
            iArr2[i5] <<= Math.min((int)(3425076640L * lMeth(i6)), i5);
            s *= (short)Test.instanceCount;
            for (i12 = 6; i12 > i5; i12 -= 2) {
                for (d1 = 1; 1 > d1; d1++) {
                    lArr[i5] = (long)d1;
                    i13 += 91;
                    i13 += (int)(d1 + Test.instanceCount);
                    i6 /= (int)(Test.instanceCount | 1);
                    i13 = (int)Test.instanceCount;
                }
                Test.instanceCount += s;
                i14 -= (int)Test.fFld;
            }
            if (i12 != 0) {
            }
            i14 += (int)Test.instanceCount;
            i14 += (i5 * i5);
        }
        long meth_res = i5 + i6 + s + i12 + i13 + Double.doubleToLongBits(d1) + i14 + FuzzerUtils.checkSum(iArr2) +
            FuzzerUtils.checkSum(lArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth() {

        int i1=59237, i2=231, i3=-34204, i4=-64019, iArr1[][]=new int[N][N], iArr4[]=new int[N];
        double d=-115.78815, dArr[]=new double[N];

        FuzzerUtils.init(dArr, -96.89432);
        FuzzerUtils.init(iArr1, 101);
        FuzzerUtils.init(iArr4, 43941);

        dArr[(i1 >>> 1) % N] -= (i1 >> Math.min(iArr1[(i1 >>> 1) % N][(i1 >>> 1) % N], Math.min(i1, -23)));
        Test.instanceCount >>= iArr1[(i1 >>> 1) % N][(i1 >>> 1) % N];
        for (d = 7; d < 171; d += 2) {
            for (i3 = 1; i3 < 19; i3++) {
                i4 = (int)(((i3 - Test.instanceCount) - iMeth1()) * i4);
                Test.instanceCount += (long)Test.fFld;
                i4 += i3;
                Test.instanceCount += (((i3 * i1) + Test.instanceCount) - Test.fFld);
                i1 >>= i1;
                switch ((i3 % 1) + 117) {
                case 117:
                    Test.instanceCount -= i2;
                    i4 = i2;
                    break;
                default:
                    i4 += (i3 * i3);
                    i4 <<= (int)Test.instanceCount;
                }
                iArr4 = iArr4;
            }
        }
        long meth_res = i1 + Double.doubleToLongBits(d) + i2 + i3 + i4 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(iArr4);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr3) {

        float f=1.677F;
        int i=33387;

        f = (((Test.instanceCount + Test.instanceCount) - (f + i)) + iMeth());
        i = i;

        FuzzerUtils.out.println("f i = " + Float.floatToIntBits(f) + "," + i);

        FuzzerUtils.out.println("Test.instanceCount Test.fFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr2) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr2);
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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  lMeth ->  lMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}