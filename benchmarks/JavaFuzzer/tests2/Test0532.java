// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:37 2023
public class Test0532 {

    public static final int N = 400;

    public static long instanceCount=6806310612116045848L;
    public static int iFld=-9;
    public static long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test0532.lArrFld, -1544839998L);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth() {

        int i8=248;
        int i9=10;
        int i10=0;
        int i11=-64331;
        int i12=46062;
        int i13=-12;
        int i14=4;
        int i15=-58716;
        int i16=-6;
        int[] iArr2 =new int[N];
        float f3=-39.591F;
        double d2=8.103962;

        FuzzerUtils.init(iArr2, -13);

        for (i8 = 4; i8 < 127; ++i8) {
            for (f3 = 1; f3 < 13; f3++) {
                for (i11 = 1; 2 > i11; i11++) {
                    Test0532.instanceCount += (((i11 * i11) + i8) - i12);
                    i12 += (int)d2;
                }
            }
            for (i13 = 1; i13 < 13; ++i13) {
                Test0532.instanceCount -= i14;
            }
            for (i15 = i8; i15 < 13; i15 += 2) {
                i12 += (i15 * i15);
                i12 >>= (int) Test0532.instanceCount;
                if (true) break;
                i14 += i16;
                i16 += i15;
                iArr2 = iArr2;
            }
            Test0532.instanceCount -= (long) f3;
        }
        long meth_res = i8 + i9 + Float.floatToIntBits(f3) + i10 + i11 + i12 + Double.doubleToLongBits(d2) + i13 + i14
            + i15 + i16 + FuzzerUtils.checkSum(iArr2);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static long lMeth(long l, double d1, int i7) {

        float f2=81.260F;
        int[] iArr1 =new int[N];

        FuzzerUtils.init(iArr1, 14932);

        f2 += ((++i7) + ((-(++i7)) << (i7 += i7)));
        iArr1[(i7 >>> 1) % N] = (int) Long.reverseBytes(Test0532.instanceCount++);
        f2 -= ((fMeth() / (Test0532.instanceCount | 1)) - i7);
        long meth_res = l + Double.doubleToLongBits(d1) + i7 + Float.floatToIntBits(f2) + FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i4, int i5) {

        short s=25760;
        byte by=25;
        int i6=-22;
        int i17=-58593;
        int[] iArr =new int[N];
        float f4=-2.753F;
        long l1=-58707L;

        FuzzerUtils.init(iArr, 6897);

        i4 = ((i4 += s) + (by * iArr[(i5 >>> 1) % N]));
        i4 += (int) (((Test0532.instanceCount + i5) * (-(Test0532.instanceCount + i5))) - ((i5++) * -1.509F));
        i6 = 1;
        do {
            float f1=-1.862F;
            double d3=-1.45772;
            if (true) {
                s += (short)i6;
                i5 = (int) (iArr[i6 + 1] >>= (int) ((Test0532.instanceCount * 55) + (i5 * f1)));
                i4 -= ((i4++) / (Integer.reverseBytes(Integer.reverseBytes(i4)) | 1));
            } else {
                iArr[i6] -= iArr[i6 + 1];
                Test0532.lArrFld[i6] = (long) (((11 - lMeth(Test0532.instanceCount, d3, i4)) + f4) - Test0532.instanceCount);
                l1 = 1;
                do {
                    i4 = i4;
                    i4 &= i4;
                } while (++l1 < 5);
            }
            i5 *= i17;
            Test0532.instanceCount += (long) -2.361F;
        } while (++i6 < 363);
        Test0532.instanceCount -= i4;
        vMeth_check_sum += i4 + i5 + s + by + i6 + Float.floatToIntBits(f4) + l1 + i17 + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i=37572;
        int i1=10826;
        int i2=20353;
        int i3=21543;
        int i18=-66;
        int i19=-6;
        int i20=166;
        int i21=-12;
        int[][] iArr3 =new int[N][N];
        float f=40.741F, f5=0.182F;
        double d=91.74440;
        byte by1=-43;
        long l2=5L;
        boolean b=true;

        FuzzerUtils.init(iArr3, -63096);

        for (i = 3; 213 > i; i += 3) {
            for (i2 = 17; i2 < 358; ++i2) {
                switch (((((int) (Test0532.instanceCount + 3683484004L)) >>> 1) % 1) + 90) {
                case 90:
                    i1 = (int) Test0532.instanceCount;
                }
                f *= (Math.min((int) (9 + (Test0532.instanceCount + d)), (int) (i2 - 5L)) * -2);
                vMeth(i1, i3);
                iArr3[i2 + 1][i2] >>= (int) Test0532.instanceCount;
                Test0532.instanceCount &= -34699L;
                Test0532.instanceCount >>>= i3;
                i1 &= (int) Test0532.instanceCount;
                Test0532.lArrFld[i] += i3;
            }
            f = i1;
            i1 += (((i * f5) + i3) - Test0532.instanceCount);
            by1 += (byte) (((i * i) + i3) - Test0532.instanceCount);
            for (i18 = 5; i18 < 358; i18++) {
                i3 = (int)l2;
                switch ((i18 % 2) + 8) {
                case 8:
                    i19 = i19;
                    b = b;
                    for (i20 = 1; i20 < 2; ++i20) {
                        i1 = (int)d;
                        switch ((i18 % 4) + 38) {
                        case 38:
                            Test0532.instanceCount >>= i1;
                            break;
                        case 39:
                            f5 *= i;
                            i19 += (int)(3570396488111693767L + (i20 * i20));
                            iArr3[i20 + 1][i - 1] -= i19;
                            break;
                        case 40:
                            i1 = -33;
                            break;
                        case 41:
                            Test0532.lArrFld[i20 - 1] = l2;
                            i1 += (i20 * i20);
                            break;
                        }
                        Test0532.iFld = Test0532.iFld;
                    }
                    break;
                case 9:
                    Test0532.lArrFld[i18 + 1] += (long) d;
                    break;
                default:
                    Test0532.lArrFld = FuzzerUtils.long1array(N, (long) 6110404798303160528L);
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 f d = " + i3 + "," + Float.floatToIntBits(f) + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("f5 by1 i18 = " + Float.floatToIntBits(f5) + "," + by1 + "," + i18);
        FuzzerUtils.out.println("i19 l2 b = " + i19 + "," + l2 + "," + (b ? 1 : 0));
        FuzzerUtils.out.println("i20 i21 iArr3 = " + i20 + "," + i21 + "," + FuzzerUtils.checkSum(iArr3));

        FuzzerUtils.out.println("Test0532.instanceCount Test0532.iFld Test0532.lArrFld = " + Test0532.instanceCount + "," + Test0532.iFld +
                "," + FuzzerUtils.checkSum(Test0532.lArrFld));

        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0532 _instance = new Test0532();
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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  fMeth ->  fMeth lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
