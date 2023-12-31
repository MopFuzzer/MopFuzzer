// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:12 2023
public class Test0015 {

    public static final int N = 400;

    public static long instanceCount=36569L;
    public boolean bFld=true;
    public float fFld=-64.946F;
    public static short sFld=-6087;
    public int[] iArrFld =new int[N];
    public long[] lArrFld =new long[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long l2, int i5, float f1) {

        int i6=67, i7=-13;

        for (i6 = 1; i6 < 160; ++i6) {
            l2 += (((i6 * Test0015.instanceCount) + i6) - l2);
            f1 = -186;
            Test0015.instanceCount = i7;
        }
        vMeth2_check_sum += l2 + i5 + Float.floatToIntBits(f1) + i6 + i7;
    }

    public void vMeth1(long l1) {

        int i8=-3061;
        float f2=2.56F;

        bFld = bFld;
        vMeth2(-93987335L, i8, f2);
        vMeth1_check_sum += l1 + i8 + Float.floatToIntBits(f2);
    }

    public void vMeth(int i4, long l) {

        byte by=-55;
        float f=19.807F;
        float[] fArr =new float[N];
        double d=1.53394;
        int i9=1;
        int i10=-98;
        int i11=50314;
        int[] iArr =new int[N];

        FuzzerUtils.init(iArr, 57082);
        FuzzerUtils.init(fArr, 0.95F);

        iArr[(i4 >>> 1) % N] *= (((++by) + (i4 + i4)) * i4);
        i4 = (i4--);
        f = Math.abs(i4);
        vMeth1(Test0015.instanceCount);
        by -= (byte) Test0015.instanceCount;
        fFld += Test0015.instanceCount;
        d = 156;
        do {
            i9 = 1;
            do {
                for (i10 = 1; i10 < 1; i10++) {
                    Test0015.instanceCount <<= i9;
                    f = 56L;
                    i4 = i9;
                    fArr[(int)(d - 1)] -= i10;
                }
                i4 >>>= (int) Test0015.instanceCount;
                i11 *= i11;
            } while (++i9 < 10);
        } while (--d > 0);
        vMeth_check_sum += i4 + l + by + Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i9 + i10 + i11 +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i=243, i1=-49, i2=14, i3=-58691, i12=128, i13=232, i14=-49, i15=128, i16=40511, i17=-49;
        double d1=109.61738, d2=0.11233;
        byte by1=-104;

        for (i = 8; i < 202; ++i) {
            i1 += (i + i);
            for (i2 = i; i2 < 129; i2++) {
                vMeth(i3, Test0015.instanceCount);
            }
            if (bFld) {
                if (bFld) continue;
                for (d1 = 4; 129 > d1; d1++) {
                    i13 = 1;
                    do {
                        i3 = i;
                        fFld += (i13 * i13);
                        d2 = fFld;
                        Test0015.instanceCount += i2;
                    } while (++i13 < 2);
                    for (i14 = 1; i14 < 2; i14++) {
                        Test0015.instanceCount += i2;
                        i3 += (i14 | i1);
                        i12 ^= by1;
                        i12 += (4 + (i14 * i14));
                        Test0015.instanceCount += (i14 * i14);
                        if (bFld) {
                            Test0015.instanceCount = i2;
                            iArrFld[i + 1] ^= i;
                            i15 = 111;
                        }
                        i1 = (int) Test0015.instanceCount;
                        Test0015.sFld *= (short) i;
                    }
                    Test0015.sFld *= (short) 7;
                    Test0015.instanceCount /= (Test0015.instanceCount | 1);
                    i3 *= i;
                    for (i16 = 1; i16 < 2; ++i16) {
                        bFld = bFld;
                        i1 += (i16 | i13);
                    }
                }
            } else if (bFld) {
                lArrFld = lArrFld;
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 d1 i12 = " + i3 + "," + Double.doubleToLongBits(d1) + "," + i12);
        FuzzerUtils.out.println("i13 d2 i14 = " + i13 + "," + Double.doubleToLongBits(d2) + "," + i14);
        FuzzerUtils.out.println("i15 by1 i16 = " + i15 + "," + by1 + "," + i16);
        FuzzerUtils.out.println("i17 = " + i17);

        FuzzerUtils.out.println("Test0015.instanceCount bFld fFld = " + Test0015.instanceCount + "," + (bFld ? 1 : 0) + "," +
            Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("Test0015.sFld iArrFld lArrFld = " + Test0015.sFld + "," + FuzzerUtils.checkSum(iArrFld) + ","
            + FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0015 _instance = new Test0015();
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
