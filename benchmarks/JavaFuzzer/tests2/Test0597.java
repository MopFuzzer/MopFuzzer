// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:40 2023
public class Test0597 {

    public static final int N = 400;

    public static long instanceCount=21562L;
    public static int iFld=-13;
    public static byte byFld=-79;
    public static volatile double dFld=-83.28035;
    public static boolean bFld=false;
    public static int[] iArrFld =new int[N];
    public static long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test0597.iArrFld, 10);
        FuzzerUtils.init(Test0597.lArrFld, -19802L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long l) {

        float f2=-2.269F;
        short s=-19552;
        int i2=12;
        int i3=11;
        int i5=23121;
        int i6=167;
        int[] iArr =new int[N];

        FuzzerUtils.init(iArr, 31611);

        Test0597.iFld *= Test0597.iFld;
        Test0597.iFld -= Test0597.iFld;
        Test0597.iFld -= Test0597.iFld;
        f2 *= s;
        Test0597.iFld = Test0597.iFld;
        f2 = Test0597.iFld;
        l *= (long)f2;
        for (i2 = 16; i2 < 382; ++i2) {
            Test0597.iFld += (int) (11L + (i2 * i2));
            f2 *= Test0597.iFld;
            if (i3 != 0) {
                vMeth2_check_sum += l + Float.floatToIntBits(f2) + s + i2 + i3 + i5 + i6 + FuzzerUtils.checkSum(iArr);
                return;
            }
            for (i5 = i2; i5 < 5; ++i5) {
                i6 = 1;
                i3 <<= (int)l;
                Test0597.iFld <<= i3;
            }
        }
        vMeth2_check_sum += l + Float.floatToIntBits(f2) + s + i2 + i3 + i5 + i6 + FuzzerUtils.checkSum(iArr);
    }

    public void vMeth1(float f1) {

        int i1=46239, i7=-59170, i8=-37855, i9=-218, i10=251, i11=207, i12=215;

        i1 += Integer.reverseBytes((int) ((Test0597.instanceCount + f1) + i1));
        vMeth2(Test0597.instanceCount);
        Test0597.iArrFld[(i7 >>> 1) % N] += i1;
        i1 *= (int)f1;
        f1 += 33975;
        for (i8 = 182; i8 > 7; i8--) {
            Test0597.byFld += (byte) i9;
            for (i10 = 9; i10 > 1; --i10) {
                i11 += i10;
                i7 = i7;
            }
            switch ((((i1 >>> 1) % 4) * 5) + 68) {
            case 82:
                i12 = 1;
                do {
                    Test0597.lArrFld[i12 + 1] = Test0597.instanceCount;
                    i7 += (int)(113.599F + (i12 * i12));
                    Test0597.iArrFld[i8 + 1] = i9;
                } while (++i12 < 9);
                break;
            case 78:
                i9 += (i8 * i8);
                break;
            case 87:
                f1 = i8;
                break;
            case 71:
                try {
                    i11 = (i10 % -180);
                    i7 = (Test0597.iArrFld[i8 - 1] / -432);
                    i1 = (Test0597.iFld % Test0597.iFld);
                } catch (ArithmeticException a_e) {}
                break;
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f1) + i1 + i7 + i8 + i9 + i10 + i11 + i12;
    }

    public void vMeth() {

        float f=32.866F;
        int i=10, i13=-25923, i14=-31, i15=9, i16=9, i17=-32782;
        long l1=90L;

        for (f = 2; f < 198; ++f) {
            vMeth1(f);
            for (l1 = 1; l1 < 8; l1++) {
                for (i14 = 1; i14 < 2; i14++) {
                    Test0597.instanceCount = -31498;
                    Test0597.instanceCount += (i14 * i14);
                    Test0597.iArrFld[(int) (l1)] &= i14;
                    Test0597.lArrFld[(int) (l1 + 1)] >>= Test0597.instanceCount;
                    i15 += i14;
                    Test0597.instanceCount -= (long) f;
                }
                i15 += i15;
                i15 -= (int)f;
                for (i16 = 1; i16 < 2; i16++) {
                    Test0597.dFld -= i13;
                    Test0597.iArrFld[(int) (l1)] = (int) l1;
                }
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f) + i + l1 + i13 + i14 + i15 + i16 + i17;
    }

    public void mainTest(String[] strArr1) {


        vMeth();
        Test0597.iFld = Test0597.iFld;
        Test0597.iFld *= Test0597.iFld;
        Test0597.bFld = true;


        FuzzerUtils.out.println("Test0597.instanceCount Test0597.iFld Test0597.byFld = " + Test0597.instanceCount + "," + Test0597.iFld +
                "," + Test0597.byFld);
        FuzzerUtils.out.println("Test0597.dFld Test0597.bFld Test0597.iArrFld = " + Double.doubleToLongBits(Test0597.dFld) + "," +
                (Test0597.bFld ? 1 : 0) + "," + FuzzerUtils.checkSum(Test0597.iArrFld));
        FuzzerUtils.out.println("Test0597.lArrFld = " + FuzzerUtils.checkSum(Test0597.lArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0597 _instance = new Test0597();
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
