// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:41 2023
public class Test0614 {

    public static final int N = 400;

    public static long instanceCount=-2257301738L;

    public static long lMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i2, long l) {


        i2 += (int) Test0614.instanceCount;
        vMeth_check_sum += i2 + l;
    }

    public static boolean bMeth(int i1, double d, double d1) {


        vMeth(i1, Test0614.instanceCount);
        long meth_res = i1 + Double.doubleToLongBits(d) + Double.doubleToLongBits(d1);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static long lMeth(float f, boolean b) {

        int i=247;
        double d2=3.32598;

        b = (((3256975387L * (i * 4)) < i) || (b = bMeth(i, 93.128250, d2)));
        long meth_res = Float.floatToIntBits(f) + (b ? 1 : 0) + i + Double.doubleToLongBits(d2);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f1=0.839F;
        int i3=-28776;
        int i4=40;
        int i5=8;
        int i6=-14;
        int i7=-3;
        int i8=20671;
        int i9=123;
        int i10=35029;
        int[] iArr =new int[N];
        long l1=94L;
        boolean b1=false;
        short s=-26082;
        byte by=-78;
        double[] dArr =new double[N];

        FuzzerUtils.init(dArr, 2.82240);
        FuzzerUtils.init(iArr, 29591);

        lMeth(f1, true);
        i3 += (int)-1.788F;
        for (l1 = 16; 392 > l1; l1++) {
            if (b1) continue;
            Test0614.instanceCount = i4;
            switch ((((i3 >>> 1) % 1) * 5) + 48) {
            case 50:
                switch (((i3 >>> 1) % 2) + 46) {
                case 46:
                    i3 -= i3;
                    i4 += i4;
                    i4 += i4;
                case 47:
                    i3 -= -63;
                    break;
                }
                i4 += (int)(((l1 * i4) + i3) - i3);
                i3 <<= i3;
            }
            i5 = 1;
            do {
                i3 = i3;
                i3 >>= s;
                i3 |= (int)l1;
                dArr = dArr;
                i3 += i5;
                Test0614.instanceCount = 216;
            } while (++i5 < 67);
            for (i6 = 3; i6 < 67; ++i6) {
                for (i8 = 1; i8 < 2; i8++) {
                    iArr = iArr;
                    i4 <<= i6;
                    i3 = -42;
                    if (b1) continue;
                    s += (short)(67 + (i8 * i8));
                    f1 += (i8 * by);
                    Test0614.instanceCount -= 0;
                    i4 += (((i8 * i10) + i5) - f1);
                }
            }
        }

        FuzzerUtils.out.println("f1 i3 l1 = " + Float.floatToIntBits(f1) + "," + i3 + "," + l1);
        FuzzerUtils.out.println("i4 b1 i5 = " + i4 + "," + (b1 ? 1 : 0) + "," + i5);
        FuzzerUtils.out.println("s i6 i7 = " + s + "," + i6 + "," + i7);
        FuzzerUtils.out.println("i8 i9 by = " + i8 + "," + i9 + "," + by);
        FuzzerUtils.out.println("i10 dArr iArr = " + i10 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            "," + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test0614.instanceCount = " + Test0614.instanceCount);

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0614 _instance = new Test0614();
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  bMeth ->  bMeth lMeth mainTest
//DEBUG  vMeth ->  vMeth bMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
