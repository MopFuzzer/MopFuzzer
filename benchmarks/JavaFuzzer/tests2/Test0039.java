// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:14 2023
public class Test0039 {

    public static final int N = 400;

    public static long instanceCount=18L;
    public float fFld=0.203F;
    public static int iFld=-43798;
    public static volatile int iFld1=4;
    public static volatile double dFld=-1.45111;
    public static long[] lArrFld =new long[N];
    public static volatile int[] iArrFld =new int[N];
    public double[][] dArrFld =new double[N][N];
    public static float[] fArrFld =new float[N];

    static {
        FuzzerUtils.init(Test0039.lArrFld, -58884L);
        FuzzerUtils.init(Test0039.iArrFld, 42273);
        FuzzerUtils.init(Test0039.fArrFld, 0.818F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i2) {

        byte by=-12;

        i2 -= i2;
        i2 = Test0039.iFld;
        i2 = (int)2322439387L;
        i2 = by;
        Test0039.iFld >>= Test0039.iFld;
        vMeth2_check_sum += i2 + by;
    }

    public static void vMeth1(int i, float f) {

        int i1=-1;
        int i3=-185;
        int i4=-9;
        int i5=22211;
        int[] iArr =new int[N];
        double d=0.18246;
        short s=16299;
        float[] fArr =new float[N];
        boolean[] bArr =new boolean[N];

        FuzzerUtils.init(fArr, 2.470F);
        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(iArr, 3);

        f -= (--i);
        i1 = 1;
        do {
            vMeth2(Test0039.iFld);
            fArr = fArr;
            Test0039.iFld >>>= (int) Test0039.instanceCount;
            d = s;
            Test0039.lArrFld[(i1 >>> 1) % N] -= (long) 51.241F;
            f += i1;
            for (i3 = 1; 5 > i3; ++i3) {
                i = i4;
                i5 = 1;
                do {
                    boolean b=false;
                    Test0039.instanceCount += (i5 * i5);
                    bArr[i1 + 1] = b;
                    i = Test0039.iFld;
                    iArr[i5 + 1] += i3;
                } while (++i5 < 2);
            }
        } while (++i1 < 344);
        vMeth1_check_sum += i + Float.floatToIntBits(f) + i1 + Double.doubleToLongBits(d) + s + i3 + i4 + i5 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(bArr) +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth() {

        float f1=2.39F;
        int i6=-218;
        int i7=13;
        int i8=36692;
        int i9=33087;
        int i10=27310;
        int[] iArr1 =new int[N];
        boolean b1=false;

        FuzzerUtils.init(iArr1, 31881);

        vMeth1(Test0039.iFld, f1);
        iArr1[(Test0039.iFld >>> 1) % N] ^= Test0039.iFld1;
        try {
            iArr1[(Test0039.iFld >>> 1) % N] -= Test0039.iFld1;
            Test0039.instanceCount = 162;
            TestClassTest obj = null;
            obj.meth();
            Test0039.iFld = (int) Test0039.instanceCount;
        }
        catch (NullPointerException exc1) {
            i6 = 1;
            do {
                Test0039.iFld1 += (i6 * i6);
            } while (++i6 < 203);
            for (i7 = 9; i7 < 311; ++i7) {
                if (true) break;
                for (i9 = 1; i9 < 5; ++i9) {
                    Test0039.iFld1 += (((i9 * Test0039.iFld) + i6) - i10);
                    if (b1) break;
                    Test0039.iFld += (((i9 * i6) + f1) - i6);
                }
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f1) + i6 + i7 + i8 + i9 + i10 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i11=-84, i12=-204, i13=-33082, i14=1332, i15=-169, i16=64252;
        short s1=-4754;
        byte by1=-38;
        boolean b2=true;
        long[][] lArr =new long[N][N];

        FuzzerUtils.init(lArr, 4L);

        fFld = (Test0039.iFld++);
        vMeth();
        for (i11 = 22; i11 < 393; ++i11) {
            i13 = 1;
            while ((i13 += 3) < 68) {
                i14 = 1;
                do {
                    Test0039.iArrFld[i11] *= s1;
                    i12 *= (int)-106.572F;
                    Test0039.lArrFld[i14 - 1] += i13;
                    i12 += i14;
                    Test0039.iFld1 += (i14 - by1);
                    dArrFld[i14 - 1][i13 - 1] += i11;
                    Test0039.dFld *= fFld;
                    Test0039.iFld *= (int) Test0039.instanceCount;
                    Test0039.iFld1 >>= -11;
                    i12 <<= i12;
                } while (++i14 < 4);
                b2 = true;
                Test0039.instanceCount -= -7;
                Test0039.iFld = (int) Test0039.instanceCount;
                dArrFld[i13 + 1][i13 + 1] += s1;
                Test0039.instanceCount += (i13 ^ i11);
                Test0039.iFld = (int) Test0039.instanceCount;
            }
            fFld += Test0039.iFld;
            Test0039.fArrFld[i11] -= i14;
            Test0039.instanceCount -= (long) fFld;
            for (i15 = 2; i15 < 68; i15++) {
                Test0039.iFld1 -= (int) 63032L;
                i16 = -50;
            }
            i12 >>= (int)-3207321586L;
            lArr = lArr;
        }
        lArr[(i15 >>> 1) % N][(i11 >>> 1) % N] = 5;

        FuzzerUtils.out.println("i11 i12 i13 = " + i11 + "," + i12 + "," + i13);
        FuzzerUtils.out.println("i14 s1 by1 = " + i14 + "," + s1 + "," + by1);
        FuzzerUtils.out.println("b2 i15 i16 = " + (b2 ? 1 : 0) + "," + i15 + "," + i16);
        FuzzerUtils.out.println("lArr = " + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test0039.instanceCount fFld Test0039.iFld = " + Test0039.instanceCount + "," +
                Float.floatToIntBits(fFld) + "," + Test0039.iFld);
        FuzzerUtils.out.println("Test0039.iFld1 Test0039.dFld Test0039.lArrFld = " + Test0039.iFld1 + "," +
                Double.doubleToLongBits(Test0039.dFld) + "," + FuzzerUtils.checkSum(Test0039.lArrFld));
        FuzzerUtils.out.println("Test0039.iArrFld dArrFld Test0039.fArrFld = " + FuzzerUtils.checkSum(Test0039.iArrFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0039.fArrFld)));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0039 _instance = new Test0039();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
class TestClassTest {
    public int field;
    public void meth() {field = 1;}
}

//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
