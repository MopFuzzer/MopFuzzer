// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:47 2023
public class Test0742 {

    public static final int N = 400;

    public static long instanceCount=7615649836589508204L;
    public static byte byFld=-57;
    public short sFld=-458;
    public boolean bFld=true;
    public static long[] lArrFld =new long[N];
    public static double[] dArrFld =new double[N];
    public static float[] fArrFld =new float[N];

    static {
        FuzzerUtils.init(Test0742.lArrFld, -195L);
        FuzzerUtils.init(Test0742.dArrFld, 2.127040);
        FuzzerUtils.init(Test0742.fArrFld, 55.276F);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static int iMeth() {

        int i4=-182;

        Test0742.instanceCount = ((i4 *= (int) (i4 >>>= (int) Test0742.instanceCount)) + (-(--i4)));
        long meth_res = i4;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth2(int i6) {

        double d1=41.66032;
        int i7=0;
        int i8=132;
        int[] iArr1 =new int[N];
        boolean b1=false;
        long l=-2309401552L, l1=-1677692705034938673L;

        FuzzerUtils.init(iArr1, -47542);

        for (d1 = 169; d1 > 2; d1--) {
            iArr1[(int)(d1 + 1)] = i6;
            iArr1 = iArr1;
            if (b1) break;
            i6 -= (int)4L;
            i6 += (int) (((d1 * Test0742.byFld) + i7) - Test0742.byFld);
            i7 = i7;
            i6 -= (int) Test0742.instanceCount;
        }
        for (l = 15; 335 > l; l++) {
            int i9=59361;
            i9 = -154;
            l1 = 1;
            while (++l1 < 5) {
                i9 = i7;
                i6 += (int)(((l1 * l) + l1) - i7);
                iArr1[(int) (l1)] -= (int) Test0742.instanceCount;
            }
            i9 *= i6;
        }
        vMeth2_check_sum += i6 + Double.doubleToLongBits(d1) + i7 + (b1 ? 1 : 0) + l + i8 + l1 +
            FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth1(int i5) {


        vMeth2(i5);
        vMeth1_check_sum += i5;
    }

    public static void vMeth(int i, int i1, int i2) {

        float f=0.203F;
        int i3=39;
        int i10=-6;
        int i11=-67;
        int[] iArr =new int[N];
        boolean b=false;
        double d=2.60310;
        short s=21154;

        FuzzerUtils.init(iArr, -9);

        i += (int)f;
        iArr[(i >>> 1) % N] -= (int) ((f++) * ((Test0742.instanceCount - Test0742.instanceCount) - (i1 - i2)));
        i3 = 1;
        while (++i3 < 379) {
            b = (((i - -43677L) % (Math.min(4049568705L, Test0742.instanceCount) | 1)) > iArr[i3]);
            Test0742.byFld >>= (byte) (Test0742.byFld - Test0742.lArrFld[i3]);
            Test0742.dArrFld[i3] -= (i1--);
            iMeth();
            Test0742.byFld = (byte) (iArr[i3 - 1] ^ (long) ((--d) + (i * i3)));
            i &= (int) Test0742.instanceCount;
            vMeth1(i2);
        }
        s = (short)i1;
        for (i10 = 229; i10 > 6; --i10) {
            iArr[i10 + 1] += s;
        }
        Test0742.instanceCount >>>= i;
        vMeth_check_sum += i + i1 + i2 + Float.floatToIntBits(f) + i3 + (b ? 1 : 0) + Double.doubleToLongBits(d) + s +
            i10 + i11 + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i12=-11;
        int i13=13971;
        int i14=166;
        int i15=-140;
        int i16=1;
        int i17=41949;
        int i18=-34012;
        int i19=-74;
        int i20=-13;
        int i21=7;
        int i22=7668;
        int i23=-40536;
        int i24=5;
        int i25=-43;
        int[] iArr2 =new int[N];
        double d2=-11.32420, d3=127.98786;
        float f1=-9.314F;
        long l2=-6554752486052688319L;

        FuzzerUtils.init(iArr2, 13);

        vMeth(i12, i12, i12);
        for (i13 = 8; i13 < 132; ++i13) {
            for (i15 = 6; i15 < 202; ++i15) {
                for (d2 = 1; d2 < 2; ++d2) {
                    i14 += sFld;
                    Test0742.instanceCount += -173;
                    i16 += i17;
                    i17 += sFld;
                    Test0742.lArrFld[(int) (d2 - 1)] *= -46;
                    Test0742.dArrFld[(int) (d2)] -= i17;
                }
                d3 /= (i15 | 1);
            }
            i16 += (14 + (i13 * i13));
            f1 += (i13 * i13);
            i16 -= 119;
            try {
                iArr2[i13 + 1] = (i13 % iArr2[i13]);
                i17 = (i12 / i17);
                i12 = (iArr2[(i12 >>> 1) % N] / i13);
            } catch (ArithmeticException a_e) {}
        }
        i12 >>= (int) Test0742.instanceCount;
        if (true) {
            switch (((i14 >>> 1) % 2) + 57) {
            case 57:
                for (i18 = 2; i18 < 211; i18++) {
                    i17 += i18;
                }
                Test0742.instanceCount *= i19;
                for (i20 = 10; i20 < 297; i20++) {
                    d3 = -45826;
                    iArr2[i20] = i22;
                    for (i23 = 88; i23 > 1; i23--) {
                        i17 += i23;
                        i16 = (int)f1;
                        for (l2 = i23; l2 < 2; l2++) {
                            Test0742.instanceCount = 203;
                        }
                        i24 += (i23 + Test0742.instanceCount);
                    }
                }
            case 58:
                f1 += i17;
            }
        } else if (bFld) {
            Test0742.lArrFld[(48580 >>> 1) % N] *= 24443;
        }

        FuzzerUtils.out.println("i12 i13 i14 = " + i12 + "," + i13 + "," + i14);
        FuzzerUtils.out.println("i15 i16 d2 = " + i15 + "," + i16 + "," + Double.doubleToLongBits(d2));
        FuzzerUtils.out.println("i17 d3 f1 = " + i17 + "," + Double.doubleToLongBits(d3) + "," +
            Float.floatToIntBits(f1));
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 l2 i25 = " + i24 + "," + l2 + "," + i25);
        FuzzerUtils.out.println("iArr2 = " + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test0742.instanceCount Test0742.byFld sFld = " + Test0742.instanceCount + "," + Test0742.byFld + "," +
            sFld);
        FuzzerUtils.out.println("bFld Test0742.lArrFld Test0742.dArrFld = " + (bFld ? 1 : 0) + "," +
                FuzzerUtils.checkSum(Test0742.lArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0742.dArrFld)));
        FuzzerUtils.out.println("Test0742.fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0742.fArrFld)));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0742 _instance = new Test0742();
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}