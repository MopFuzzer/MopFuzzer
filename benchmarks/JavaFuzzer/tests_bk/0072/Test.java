// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:54 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-25780L;
    public static float fFld=2.648F;
    public static volatile int iArrFld[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, -33596);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l, int i) {

        int i1=-65022, i2=48239, i3=12, i4=-15202, i5=159, i6=-6, i7=11, iArr[]=new int[N];
        short s=12086;
        double d=-1.11952;
        float f1=0.101F, fArr[]=new float[N];

        FuzzerUtils.init(fArr, -58.163F);
        FuzzerUtils.init(iArr, 6);

        i1 = 1;
        while (++i1 < 151) {
            for (i2 = 1; i2 < 10; i2++) {
                Test.fFld += -65107;
                i -= (int)l;
                switch ((i1 % 4) + 25) {
                case 25:
                    s += (short)(i2 * i2);
                    d = l;
                    Test.instanceCount += (long)Test.fFld;
                    for (f1 = 1; 2 > f1; f1++) {
                        i += (int)d;
                    }
                case 26:
                    fArr[i2 + 1] -= i;
                    try {
                        i5 = (i3 % -249);
                        iArr[i1 - 1] = (21029432 % i);
                        i = (i4 % i5);
                    } catch (ArithmeticException a_e) {}
                    for (i6 = 1; i6 < 2; ++i6) {
                        i5 += (i6 | (long)Test.fFld);
                        Test.iArrFld = Test.iArrFld;
                    }
                case 27:
                case 28:
                    i7 += i2;
                    break;
                }
            }
        }
        vMeth1_check_sum += l + i + i1 + i2 + i3 + s + Double.doubleToLongBits(d) + Float.floatToIntBits(f1) + i4 + i5
            + i6 + i7 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth() {

        int i8=-6, i9=-68, i10=-14, i11=38740, i12=-10422;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 30.6080);

        vMeth1(Test.instanceCount, i8);
        for (double d1 : dArr) {
            for (i9 = 1; i9 < 4; i9++) {
                i10 = i8;
                d1 = i8;
                try {
                    i8 = (i8 / -365567463);
                    Test.iArrFld[i9][i9] = (Test.iArrFld[i9 + 1][i9 - 1] % -220);
                    Test.iArrFld[i9 - 1][i9] = (57646 % i9);
                } catch (ArithmeticException a_e) {}
                Test.iArrFld[i9][i9 + 1] &= i10;
                if (i8 != 0) {
                    vMeth_check_sum += i8 + i9 + i10 + i11 + i12 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                    return;
                }
            }
            i10 = i9;
            for (i11 = 1; i11 < 4; ++i11) {
                Test.instanceCount += (-4 + (i11 * i11));
                i8 <<= i11;
            }
            i12 = i11;
            i12 *= (int)Test.fFld;
        }
        i12 *= i10;
        vMeth_check_sum += i8 + i9 + i10 + i11 + i12 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vSmallMeth(float f) {

        int i13=-104;
        double d2=0.126740;

        vMeth();
        i13 -= (int)d2;
        vSmallMeth_check_sum += Float.floatToIntBits(f) + i13 + Double.doubleToLongBits(d2);
    }

    public void mainTest(String[] strArr1) {


        for (int smallinvoc=0; smallinvoc<542; smallinvoc++) vSmallMeth(Test.fFld);


        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.iArrFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  vMeth1 ->  vMeth1 vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}