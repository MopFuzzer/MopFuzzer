// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:20 2023
public class Test0182 {

    public static final int N = 400;

    public static long instanceCount=35338L;
    public static volatile double dFld=0.34383;
    public static float fFld=16.560F;
    public static volatile long lFld=-43744L;
    public static int[] iArrFld =new int[N];
    public volatile float[] fArrFld =new float[N];
    public long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test0182.iArrFld, 234);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i3, int i4, byte by) {

        float f2=65.858F;
        boolean b1=true;
        int i5=-24304, i6=-1, i7=44832, i8=-8, i9=6, i10=-86, i11=-62612;
        double[] dArr =new double[N];
        long[] lArr1 =new long[N];
        short[][] sArr =new short[N][N];

        FuzzerUtils.init(dArr, -81.104941);
        FuzzerUtils.init(lArr1, 1237973703L);
        FuzzerUtils.init(sArr, (short)-12768);

        f2 = Test0182.instanceCount;
        for (double d1 : dArr) {
            if (b1) break;
            f2 = Test0182.instanceCount;
            i5 = 1;
            do {
                i6 = 1;
                do {
                    i3 += i6;
                } while (++i6 < 1);
                lArr1[i5] <<= Test0182.instanceCount;
            } while (++i5 < 4);
            i7 = 1;
            while (++i7 < 4) {
                i4 += (((i7 * f2) + i7) - i4);
                for (i8 = 1; 1 > i8; ++i8) {
                    sArr[i8][i7] = (short)4;
                }
                for (i10 = 1; i10 > 1; i10 -= 3) {
                    f2 = i3;
                    i9 = -30292;
                }
            }
        }
        long meth_res = i3 + i4 + by + Float.floatToIntBits(f2) + (b1 ? 1 : 0) + i5 + i6 + i7 + i8 + i9 + i10 + i11 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(lArr1) +
            FuzzerUtils.checkSum(sArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth() {

        int i2=48832, i12=12530, i13=202;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -54L);

        i2 -= (int) Test0182.dFld;
        Test0182.instanceCount -= (Test0182.instanceCount + (lArr[(i2 >>> 1) % N]++));
        Test0182.dFld *= iMeth1(i2, i2, (byte) (-28));
        i2 = i2;
        for (i12 = 159; i12 > 1; --i12) {
            i2 ^= i2;
        }
        long meth_res = i2 + i12 + i13 + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(float f, long l) {

        int i1=-49257, i14=-195, i15=97;
        boolean b=true;
        boolean[][] bArr =new boolean[N][N];
        long l1=-5L;
        long[] lArr2 =new long[N];
        byte by1=-116;
        float[] fArr =new float[N];

        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(fArr, 2.918F);
        FuzzerUtils.init(lArr2, -3L);

        bArr[(i1 >>> 1) % N][(i1 >>> 1) % N] = b;
        for (float f1 : fArr) {
            iMeth();
        }
        i1 *= (int)l;
        i1 = (int)131L;
        i1 -= (int) Test0182.instanceCount;
        for (i14 = 7; i14 < 176; ++i14) {
            lArr2[i14] <<= Test0182.instanceCount;
            if (i1 != 0) {
                vMeth_check_sum += Float.floatToIntBits(f) + l + i1 + (b ? 1 : 0) + i14 + i15 + l1 + by1 +
                    FuzzerUtils.checkSum(bArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
                    FuzzerUtils.checkSum(lArr2);
                return;
            }
            Test0182.dFld += -191;
            if (b) break;
            if (b) {
                if (b) break;
                l1 = -122;
                try {
                    i15 = (56128 / i14);
                    i15 = (i14 / 25927);
                    Test0182.iArrFld[i14] = (i1 % -76);
                } catch (ArithmeticException a_e) {}
            } else if (b) {
                i1 |= -37;
            } else {
                by1 = (byte)i14;
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f) + l + i1 + (b ? 1 : 0) + i14 + i15 + l1 + by1 +
            FuzzerUtils.checkSum(bArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(lArr2);
    }

    public void mainTest(String[] strArr1) {

        double d=0.46718;
        int i=-147;
        int i16=-139;
        int i17=64914;
        int i18=0;
        int[][] iArr =new int[N][N];
        boolean b2=true;
        byte by2=-65;
        short s=-13028;

        FuzzerUtils.init(iArr, 4);

        for (d = 1; d < 218; ++d) {
            vMeth(Test0182.fFld, Test0182.instanceCount);
            if (b2) break;
            Test0182.iArrFld[(int) (d)] ^= i;
            switch ((int)(((d % 6) * 5) + 90)) {
            case 109:
                i16 = 1;
                do {
                    if (b2) break;
                    Test0182.iArrFld[i16] = i;
                    i = i16;
                    by2 += (byte) Test0182.dFld;
                    i = i;
                    Test0182.instanceCount >>= -9190891362094616186L;
                    i = i;
                    s += (short)213;
                } while (++i16 < 116);
                if (b2) {
                } else if (true) {
                    if (true) break;
                    if (b2) continue;
                    i -= i;
                }
                Test0182.instanceCount += (long) d;
                for (i17 = 5; i17 < 116; ++i17) {
                    lArrFld = lArrFld;
                    Test0182.lFld = i18;
                }
                break;
            case 101:
                Test0182.lFld <<= i;
                i = i;
                i >>>= i16;
                switch (((i16 >>> 1) % 1) + 15) {
                case 15:
                    if (b2) {
                        lArrFld[(int)(d)] = -148;
                        i <<= i18;
                    } else if (b2) {
                        Test0182.dFld *= i16;
                    }
                    break;
                }
                break;
            case 92:
                i = (int) Test0182.lFld;
            case 106:
                Test0182.iArrFld[(int) (d - 1)] -= (int) Test0182.fFld;
                break;
            case 105:
                i18 = i17;
                break;
            case 113:
                i += (int) Test0182.fFld;
            default:
                iArr = iArr;
            }
        }

        FuzzerUtils.out.println("d i b2 = " + Double.doubleToLongBits(d) + "," + i + "," + (b2 ? 1 : 0));
        FuzzerUtils.out.println("i16 by2 s = " + i16 + "," + by2 + "," + s);
        FuzzerUtils.out.println("i17 i18 iArr = " + i17 + "," + i18 + "," + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test0182.instanceCount Test0182.dFld Test0182.fFld = " + Test0182.instanceCount + "," +
                Double.doubleToLongBits(Test0182.dFld) + "," + Float.floatToIntBits(Test0182.fFld));
        FuzzerUtils.out.println("Test0182.lFld Test0182.iArrFld fArrFld = " + Test0182.lFld + "," +
                FuzzerUtils.checkSum(Test0182.iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));
        FuzzerUtils.out.println("lArrFld = " + FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0182 _instance = new Test0182();
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
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
