// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:56 2023
public class Test0940 {

    public static final int N = 400;

    public static volatile long instanceCount=-2533127223L;
    public static short sFld=22722;
    public static boolean bFld=true;
    public int iFld=-5;
    public static float fFld=124.132F;
    public long[] lArrFld =new long[N];
    public static volatile float[] fArrFld =new float[N];
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0940.fArrFld, 2.297F);
        FuzzerUtils.init(Test0940.iArrFld, 11711);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1() {

        int i6=-72;
        int i7=58038;
        int i8=11171;
        int i9=-89;
        int i10=192;
        int i11=8846;
        int[] iArr =new int[N];
        double[] dArr =new double[N];

        FuzzerUtils.init(dArr, 60.65029);
        FuzzerUtils.init(iArr, 94);

        for (double d1 : dArr) {
            for (i6 = 1; i6 < 4; i6++) {
                for (i8 = 1; 2 > i8; i8++) {
                    if (Test0940.bFld) continue;
                }
                Test0940.instanceCount += (98 + (i6 * i6));
                i9 = -57493;
                i7 = i8;
                i7 |= (int) Test0940.instanceCount;
                iArr[i6 + 1] = i6;
                for (i10 = 1; i10 < 2; ++i10) {
                    switch (((i10 % 5) * 5) + 51) {
                    case 55:
                        i7 += (int) Test0940.instanceCount;
                        iArr[i6 - 1] = -2;
                        i11 += (int) Test0940.instanceCount;
                        break;
                    case 66:
                        i9 += (i10 * Test0940.instanceCount);
                        break;
                    case 54:
                        try {
                            iArr[(i9 >>> 1) % N] = (9527 % i8);
                            i9 = (217 / iArr[i10 + 1]);
                            i9 = (i8 % i11);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 69:
                        i11 = i11;
                        break;
                    case 65:
                        Test0940.instanceCount = -326056237L;
                    }
                }
            }
        }
        long meth_res = i6 + i7 + i8 + i9 + i10 + i11 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            FuzzerUtils.checkSum(iArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i2, int i3, int i4) {

        int i5=91;

        i2 += (int) (((Test0940.instanceCount + i5) - iMeth1()) * i2);
        vMeth_check_sum += i2 + i3 + i4 + i5;
    }

    public int iMeth(float f, long l, int i) {

        long l1=-4L;
        int i1=64, i12=23, i13=93;

        for (l1 = 20; l1 < 370; ++l1) {
            if ((i++) != Math.min(--i, i--)) break;
            Test0940.sFld *= (short) i;
            i += (int)(l1 + i1);
            vMeth(-32079, i, i);
            for (i12 = 1; i12 < 5; i12 += 2) {
                double d2=55.2862;
                l += (i12 | (long)f);
                d2 *= l1;
                d2 += Test0940.sFld;
                i1 += i12;
                i1 += (((i12 * i12) + i13) - i);
            }
            Test0940.instanceCount >>= i13;
            i1 = Test0940.sFld;
            l += i;
        }
        lArrFld[(-103 >>> 1) % N] ^= i1;
        long meth_res = Float.floatToIntBits(f) + l + i + l1 + i1 + i12 + i13;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d=-2.102438, d3=2.93161;
        int i14=25415, i15=93, i16=-111, i17=-51899, i18=-9513, i19=10, i20=-13, i21=33035;
        float f1=0.698F;

        d += Math.min(14, iMeth(-1.845F, Test0940.instanceCount, iFld));
        Test0940.instanceCount = Test0940.instanceCount;
        for (i14 = 2; i14 < 280; i14++) {
            Test0940.instanceCount -= (long) d;
            i16 = 90;
            do {
                Test0940.instanceCount ^= Test0940.sFld;
                Test0940.sFld += (short) (((i16 * Test0940.sFld) + Test0940.instanceCount) - Test0940.fFld);
                Test0940.fArrFld[i14] += Test0940.sFld;
                if (Test0940.bFld) break;
                Test0940.fFld += i16;
                Test0940.iArrFld[i14 + 1] *= 15008;
                for (d3 = 1; d3 < 1; d3++) {
                    Test0940.instanceCount -= -14;
                    d -= iFld;
                    Test0940.instanceCount = iFld;
                    Test0940.instanceCount += (long) (((d3 * Test0940.fFld) + iFld) - Test0940.instanceCount);
                    i17 = i16;
                    d *= iFld;
                    i15 += (int)d;
                }
            } while (--i16 > 0);
            Test0940.bFld = Test0940.bFld;
            f1 = 1;
            do {
                i18 = i15;
                i19 *= i15;
                i19 += i15;
                Test0940.instanceCount |= i15;
                for (i20 = 1; i20 < 1; i20 += 3) {
                    Test0940.fFld = 0.756F;
                }
                iFld += (int)(f1 * f1);
                i18 += (int)6L;
            } while (++f1 < 90);
            Test0940.fFld = i16;
        }

        FuzzerUtils.out.println("d i14 i15 = " + Double.doubleToLongBits(d) + "," + i14 + "," + i15);
        FuzzerUtils.out.println("i16 d3 i17 = " + i16 + "," + Double.doubleToLongBits(d3) + "," + i17);
        FuzzerUtils.out.println("f1 i18 i19 = " + Float.floatToIntBits(f1) + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 = " + i20 + "," + i21);

        FuzzerUtils.out.println("Test0940.instanceCount Test0940.sFld Test0940.bFld = " + Test0940.instanceCount + "," + Test0940.sFld +
                "," + (Test0940.bFld ? 1 : 0));
        FuzzerUtils.out.println("iFld Test0940.fFld lArrFld = " + iFld + "," + Float.floatToIntBits(Test0940.fFld) + "," +
            FuzzerUtils.checkSum(lArrFld));
        FuzzerUtils.out.println("Test0940.fArrFld Test0940.iArrFld = " +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0940.fArrFld)) + "," + FuzzerUtils.checkSum(Test0940.iArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0940 _instance = new Test0940();
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
