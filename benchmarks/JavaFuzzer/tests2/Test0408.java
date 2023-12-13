// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:31 2023
public class Test0408 {

    public static final int N = 400;

    public static long instanceCount=8529949588769822210L;
    public static int[][] iArrFld =new int[N][N];
    public static double[][] dArrFld =new double[N][N];

    static {
        FuzzerUtils.init(Test0408.iArrFld, 323);
        FuzzerUtils.init(Test0408.dArrFld, -72.86875);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(byte by, int i2) {

        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -5541756293318017076L);

        lArr[(i2 >>> 1) % N] = i2;
        i2 += i2;
        Test0408.instanceCount >>= i2;
        Test0408.instanceCount += i2;
        lArr[(i2 >>> 1) % N] = i2;
        vMeth1_check_sum += by + i2 + FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth(long l1, int i1) {

        byte by1=-31;
        int i3=64048;
        int i4=-36153;
        int[] iArr =new int[N];

        FuzzerUtils.init(iArr, 22717);

        vMeth1(by1, i1);
        for (i3 = 2; i3 < 398; i3++) {
            short s=-2739;
            i1 >>= i4;
            Test0408.iArrFld[i3][i3 - 1] = s;
            i4 = (int)l1;
        }
        i4 += i4;
        for (int i5 : iArr) {
            i4 = i4;
            Test0408.instanceCount -= 3372L;
        }
        long meth_res = l1 + i1 + by1 + i3 + i4 + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(long l) {

        int i=12;
        byte by2=-68;

        l = i;
        i *= (iMeth(1834336054454146552L, i) % 8);
        i += -231;
        i += by2;
        i += -1;
        vMeth_check_sum += l + i + by2;
    }

    public void mainTest(String[] strArr1) {

        int i6=11;
        int i7=98;
        int i8=28723;
        int i9=53;
        int i10=14;
        int i11=178;
        int i13=72;
        int i14=21;
        int[] iArr1 =new int[N];
        float f=-119.394F;
        byte by3=-106;
        byte[] byArr =new byte[N];
        double d=-43.5953;
        boolean b=false;
        long l2=-1790290886L;
        long[] lArr1 =new long[N];
        short s1=-24916;

        FuzzerUtils.init(iArr1, 6);
        FuzzerUtils.init(byArr, (byte)72);
        FuzzerUtils.init(lArr1, -124L);

        vMeth(Test0408.instanceCount);
        Test0408.instanceCount = i6;
        i6 -= i6;
        for (i7 = 340; i7 > 1; i7--) {
            f += i7;
            for (i9 = 2; 74 > i9; i9++) {
                Test0408.instanceCount += i9;
                i11 = 1;
                do {
                    i8 = by3;
                    i8 += (((i11 * f) + i8) - f);
                    i8 = -21615;
                    i6 = i7;
                    Test0408.iArrFld[i9 - 1][i7 - 1] += (int) f;
                    Test0408.instanceCount += (long) d;
                } while (++i11 < 2);
            }
            i6 = (int) Test0408.instanceCount;
            f -= (float)d;
            byArr[i7 - 1] >>= (byte) Test0408.instanceCount;
            i8 &= 10;
            lArr1[i7 - 1] = i8;
            f = i8;
            f += ((long) i7 ^ (long) Test0408.instanceCount);
            if (b) continue;
        }
        i8 = (int)l2;
        i6 <<= s1;
        iArr1[(i11 >>> 1) % N] = i11;
        i8 = (int)f;
        Test0408.iArrFld = Test0408.iArrFld;
        for (i13 = 3; i13 < 314; ++i13) {
            Test0408.dArrFld[i13][i13 + 1] *= -20982;
            i14 /= (int) (Test0408.instanceCount | 1);
        }

        FuzzerUtils.out.println("i6 i7 i8 = " + i6 + "," + i7 + "," + i8);
        FuzzerUtils.out.println("f i9 i10 = " + Float.floatToIntBits(f) + "," + i9 + "," + i10);
        FuzzerUtils.out.println("i11 by3 d = " + i11 + "," + by3 + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("b l2 s1 = " + (b ? 1 : 0) + "," + l2 + "," + s1);
        FuzzerUtils.out.println("i13 i14 iArr1 = " + i13 + "," + i14 + "," + FuzzerUtils.checkSum(iArr1));
        FuzzerUtils.out.println("byArr lArr1 = " + FuzzerUtils.checkSum(byArr) + "," + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test0408.instanceCount Test0408.iArrFld Test0408.dArrFld = " + Test0408.instanceCount + "," +
                FuzzerUtils.checkSum(Test0408.iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0408.dArrFld)));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0408 _instance = new Test0408();
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
