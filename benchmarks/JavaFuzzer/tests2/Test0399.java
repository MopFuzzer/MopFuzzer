// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:31 2023
public class Test0399 {

    public static final int N = 400;

    public static long instanceCount=31647L;
    public static volatile float fFld=4.986F;
    public static double dFld=-1.111526;
    public int iFld=10;
    public static boolean bFld=false;
    public static volatile byte byFld=-21;
    public float[] fArrFld =new float[N];
    public static volatile long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test0399.lArrFld, -3917894268L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i3, short s) {

        float f=2.431F;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -23L);

        lArr[(i3 >>> 1) % N] -= (long)f;
        vMeth2_check_sum += i3 + s + Float.floatToIntBits(f) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1() {

        int i1=8;
        int i2=-39329;
        int i4=590;
        int i5=147;
        int i6=-6342;
        int[] iArr =new int[N];
        short s1=-29225;
        long l=-27928L;
        double d=0.71993;
        float f1=0.499F;

        FuzzerUtils.init(iArr, 2);

        for (i1 = 5; i1 < 135; i1++) {
            vMeth2(i2, s1);
            for (i4 = i1; i4 < 12; i4++) {
                byte by=97;
                by += (byte) (i4 - Test0399.instanceCount);
                iArr[i4 + 1] += i6;
                l = 1;
                while (++l < 1) {
                    switch ((((i5 >>> 1) % 3) * 5) + 31) {
                    case 46:
                        Test0399.instanceCount += 85;
                        i6 |= (int) Test0399.instanceCount;
                        d -= Test0399.instanceCount;
                        i6 = (int)f1;
                    case 38:
                        Test0399.instanceCount = l;
                        i6 <<= i1;
                        i6 = -73;
                        break;
                    case 41:
                        d -= 240;
                        break;
                    }
                }
            }
        }
        vMeth1_check_sum += i1 + i2 + s1 + i4 + i5 + i6 + l + Double.doubleToLongBits(d) + Float.floatToIntBits(f1) +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i) {

        short s2=7090;
        byte by1=-9;

        vMeth1();
        Test0399.fFld = s2;
        i += i;
        by1 += (byte)1.20460;
        i += (int) Test0399.instanceCount;
        i = (int) Test0399.instanceCount;
        i += (int) Test0399.instanceCount;
        Test0399.dFld = i;
        vMeth_check_sum += i + s2 + by1;
    }

    public void mainTest(String[] strArr1) {

        int i7=5;
        int i8=3;
        int i9=44;
        int i10=227;
        int i11=4;
        int i12=18285;
        int i13=-4;
        int i14=-12;
        int i15=-58;
        int[][] iArr1 =new int[N][N];
        short s3=16891;

        FuzzerUtils.init(iArr1, -9);

        vMeth(iFld);
        iArr1[(iFld >>> 1) % N][(iFld >>> 1) % N] = (int) Test0399.instanceCount;
        for (i7 = 7; i7 < 293; ++i7) {
            if (Test0399.bFld) continue;
            for (i9 = 4; i9 < 88; i9++) {
                if (Test0399.bFld) continue;
                iFld -= (int) Test0399.instanceCount;
                iArr1[i7][i7] = i9;
                fArrFld[i9] = -162;
                Test0399.dFld += Test0399.instanceCount;
                Test0399.lArrFld[i9] &= i7;
                Test0399.lArrFld[i9 - 1] = 2;
                iFld *= -3;
                iFld += (i9 * i9);
                i8 += (((i9 * i9) + i10) - i8);
            }
            for (i11 = 2; i11 < 88; i11++) {
                i8 += (i11 | i10);
                for (i13 = 1; i13 < 2; i13++) {
                    s3 += (short)(i13 ^ i8);
                    i8 &= 8641;
                    iArr1[i13 - 1][i7] = (int) Test0399.dFld;
                    try {
                        iArr1[i13][i11 + 1] = (i11 % i10);
                        iArr1[i11][i13] = (35511 % i7);
                        iArr1[i7 + 1][i13 + 1] = (-12898 % i12);
                    } catch (ArithmeticException a_e) {}
                    iArr1[i11 + 1][i13] += (int) Test0399.instanceCount;
                }
                i14 += (-179 + (i11 * i11));
                i8 = (int) Test0399.instanceCount;
                try {
                    iArr1[i7 - 1][i7 + 1] = (i7 / 55819);
                    i10 = (i14 % 58);
                    i12 = (i13 / i11);
                } catch (ArithmeticException a_e) {}
                Test0399.byFld += (byte) i12;
            }
            Test0399.instanceCount += (185 + (i7 * i7));
            i15 += (int)(-126.519F + (i7 * i7));
            Test0399.instanceCount <<= i8;
        }

        FuzzerUtils.out.println("i7 i8 i9 = " + i7 + "," + i8 + "," + i9);
        FuzzerUtils.out.println("i10 i11 i12 = " + i10 + "," + i11 + "," + i12);
        FuzzerUtils.out.println("i13 i14 s3 = " + i13 + "," + i14 + "," + s3);
        FuzzerUtils.out.println("i15 iArr1 = " + i15 + "," + FuzzerUtils.checkSum(iArr1));

        FuzzerUtils.out.println("Test0399.instanceCount Test0399.fFld Test0399.dFld = " + Test0399.instanceCount + "," +
                Float.floatToIntBits(Test0399.fFld) + "," + Double.doubleToLongBits(Test0399.dFld));
        FuzzerUtils.out.println("iFld Test0399.bFld Test0399.byFld = " + iFld + "," + (Test0399.bFld ? 1 : 0) + "," + Test0399.byFld);
        FuzzerUtils.out.println("fArrFld Test0399.lArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)) +
                "," + FuzzerUtils.checkSum(Test0399.lArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0399 _instance = new Test0399();
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