// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:14 2023
public class Test0057 {

    public static final int N = 400;

    public static long instanceCount=-57659L;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i6, long l) {

        float f1=-2.768F;
        long[][] lArr =new long[N][N];

        FuzzerUtils.init(lArr, 16526L);

        lArr[(i6 >>> 1) % N][(-226 >>> 1) % N] -= (long)f1;
        vMeth2_check_sum += i6 + l + Float.floatToIntBits(f1) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1(int i5) {

        int i7=8, i8=11, i9=185, i10=-114, i11=3, i12=8;
        float f2=-2.464F;
        byte by=59;

        vMeth2(i5, Test0057.instanceCount);
        for (i7 = 9; i7 < 228; i7 += 3) {
            Test0057.instanceCount += i8;
            for (i9 = i7; i9 < 21; i9++) {
                i10 = (int) Test0057.instanceCount;
                i10 = (int) Test0057.instanceCount;
                f2 -= 6599;
                i10 -= (int) Test0057.instanceCount;
                i10 &= (int)76L;
                for (i11 = 1; i11 < 1; ++i11) {
                    f2 = Test0057.instanceCount;
                }
                i8 += i5;
            }
            if (i11 != 0) {
                vMeth1_check_sum += i5 + i7 + i8 + i9 + i10 + Float.floatToIntBits(f2) + i11 + i12 + by;
                return;
            }
            by *= (byte)i11;
            Test0057.instanceCount += (0 + (i7 * i7));
        }
        vMeth1_check_sum += i5 + i7 + i8 + i9 + i10 + Float.floatToIntBits(f2) + i11 + i12 + by;
    }

    public static void vMeth(int i) {

        int i1=-13;
        int i2=78;
        int i3=-9085;
        int i4=166;
        int[][] iArr =new int[N][N];
        int[] iArr1 =new int[N];
        float f=-112.636F;
        float[] fArr =new float[N];
        double d=70.1446;
        short s=1229;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(iArr, 2);
        FuzzerUtils.init(lArr1, 2120487982118281884L);
        FuzzerUtils.init(iArr1, -5);
        FuzzerUtils.init(fArr, 1.195F);

        for (i1 = 4; 393 > i1; i1++) {
            i2 += (((i1 * Test0057.instanceCount) + f) - i);
            for (i3 = 4; i3 > 1; i3--) {
                d = (i++);
                vMeth1(i);
                Test0057.instanceCount ^= i2;
                iArr[i3 + 1][i1 - 1] -= (int)-8124665135041581590L;
                i &= i1;
                if (i2 != 0) {
                    vMeth_check_sum += i + i1 + i2 + Float.floatToIntBits(f) + i3 + i4 + Double.doubleToLongBits(d) + s
                        + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr1) +
                        Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                    return;
                }
                i4 += i3;
                lArr1[i1] += i2;
            }
            i4 += i1;
            i2 += 3;
            i2 += s;
            fArr[i1 + 1] *= i1;
        }
        vMeth_check_sum += i + i1 + i2 + Float.floatToIntBits(f) + i3 + i4 + Double.doubleToLongBits(d) + s +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i14=206;

        vMeth(i14);

        FuzzerUtils.out.println("i14 = " + i14);

        FuzzerUtils.out.println("Test0057.instanceCount = " + Test0057.instanceCount);

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0057 _instance = new Test0057();
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