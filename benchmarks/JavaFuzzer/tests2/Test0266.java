// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:24 2023
public class Test0266 {

    public static final int N = 400;

    public static volatile long instanceCount=6L;
    public static short sFld=2197;
    public static boolean bFld=false;
    public static float[] fArrFld =new float[N];
    public short[][] sArrFld =new short[N][N];

    static {
        FuzzerUtils.init(Test0266.fArrFld, 0.958F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        boolean b=true;
        float f=-2.618F;
        float f1=0.1002F;
        float[] fArr =new float[N];
        int i8=-4;
        int i9=10084;
        int i10=-30303;
        int i11=83;
        int i12=47913;
        int i13=-51551;
        int i14=49637;
        int i15=11;
        int[] iArr =new int[N];
        byte by=-91;

        FuzzerUtils.init(iArr, 51545);
        FuzzerUtils.init(fArr, -36.273F);

        b = b;
        f = 396;
        do {
            for (i8 = (int)(f); i8 < 4; ++i8) {
                Test0266.instanceCount = Test0266.instanceCount;
                by += (byte)(34.767F + (i8 * i8));
            }
            for (i10 = 1; 4 > i10; i10++) {
                b = b;
                f1 -= i11;
            }
            for (i12 = 1; i12 < 4; i12 += 2) {
                iArr[i12] /= (int)(i13 | 1);
                i11 = i10;
                iArr[(int)(f)] -= i10;
                for (i14 = 1; i14 < 4; ++i14) {
                    Test0266.instanceCount += (21284 + (i14 * i14));
                    fArr[i12 - 1] -= Test0266.instanceCount;
                }
            }
        } while (--f > 0);
        long meth_res = (b ? 1 : 0) + Float.floatToIntBits(f) + i8 + i9 + by + i10 + i11 + Float.floatToIntBits(f1) +
            i12 + i13 + i14 + i15 + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i3, int i4, int i5) {

        int i6=39804;
        int i7=-6;
        int i16=-7;
        int i17=189;
        int[] iArr1 =new int[N];
        long l1=170L;

        FuzzerUtils.init(iArr1, 42);

        for (i6 = 10; i6 < 229; i6++) {
            iMeth();
            iArr1 = iArr1;
            i3 += (i6 * i6);
            i3 = i6;
            if (i6 != 0) {
                vMeth1_check_sum += i3 + i4 + i5 + i6 + i7 + l1 + i16 + i17 + FuzzerUtils.checkSum(iArr1);
                return;
            }
            l1 = 1;
            while (++l1 < 7) {
                for (i16 = 1; i16 < 1; ++i16) {
                    i3 = Test0266.sFld;
                    i17 -= i17;
                    Test0266.instanceCount -= i4;
                    if (true) {
                        Test0266.instanceCount ^= i4;
                    } else if (true) {
                        i4 >>>= (int)l1;
                        iArr1 = iArr1;
                    } else if (Test0266.bFld) {
                        i7 -= (int)l1;
                    }
                }
            }
        }
        vMeth1_check_sum += i3 + i4 + i5 + i6 + i7 + l1 + i16 + i17 + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth() {

        long l=-4795428690689213818L;
        int i=6456, i1=-191, i2=78, i18=7, i19=-35761, i20=-3, i21=2;
        double d=-54.78504;
        short s=-19448;
        float f2=-61.711F;

        for (l = 10; l < 182; ++l) {
            i = (int)(((i++) + (i + i)) & (long)((d++) - i));
        }
        i1 = 1;
        do {
            i2 = 1;
            do {
                s += (short) (((Test0266.instanceCount--) + (i + i1)) * -176L);
                vMeth1(i2, i, 11);
                for (i18 = 1; i18 < 1; i18++) {
                    i += 4;
                    i19 += (((i18 * Test0266.instanceCount) + l) - l);
                    f2 -= l;
                    i >>= (int) Test0266.instanceCount;
                }
                for (i20 = 1; i20 < 1; i20++) {
                    i -= i18;
                    Test0266.fArrFld[i1] = Test0266.instanceCount;
                    i19 = i;
                }
            } while (++i2 < 8);
        } while (++i1 < 191);
        vMeth_check_sum += l + i + Double.doubleToLongBits(d) + i1 + i2 + s + i18 + i19 + Float.floatToIntBits(f2) +
            i20 + i21;
    }

    public void mainTest(String[] strArr1) {

        int i22=17777;
        int i23=2;
        int i24=-128;
        int i25=-38155;
        int i26=-44781;
        int i27=13;
        int i28=165;
        int[] iArr2 =new int[N];
        float f3=-1.155F, f4=-2.613F;
        byte by1=-66;
        byte[][] byArr =new byte[N][N];
        double d1=42.14620;
        double[] dArr =new double[N];

        FuzzerUtils.init(iArr2, -3);
        FuzzerUtils.init(dArr, 2.97963);
        FuzzerUtils.init(byArr, (byte)63);

        vMeth();
        iArr2[(i22 >>> 1) % N] -= (int) Test0266.instanceCount;
        i22 = (int)3016346944L;
        for (i23 = 1; i23 < 285; i23++) {
            i22 += (((i23 * i23) + i23) - i22);
            Test0266.instanceCount += (((i23 * i22) + i22) - f3);
            if (Test0266.bFld) break;
            i25 = 1;
            do {
                switch ((i23 % 2) + 95) {
                case 95:
                    i24 -= i23;
                    for (i26 = 1; i26 < 1; ++i26) {
                        i24 = (int)4L;
                        dArr[i23 - 1] *= by1;
                        i27 -= (int) Test0266.instanceCount;
                        i27 *= i27;
                        byArr[i23 - 1][i25] = (byte)d1;
                        sArrFld[i23][i26 + 1] = (short) Test0266.instanceCount;
                        Test0266.instanceCount = by1;
                        Test0266.sFld *= (short) -61451;
                        Test0266.instanceCount &= i27;
                        by1 += (byte)-3484;
                    }
                    Test0266.bFld = Test0266.bFld;
                case 96:
                    i22 -= (int) Test0266.instanceCount;
                    for (f4 = 1; f4 < 1; f4++) {
                        i27 -= i25;
                        i27 += (int)-148L;
                        i24 += (int)f4;
                    }
                }
                i27 <<= Test0266.sFld;
                Test0266.instanceCount <<= Test0266.instanceCount;
                Test0266.fArrFld[i25] += (float) d1;
            } while (++i25 < 89);
        }

        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("f3 i25 i26 = " + Float.floatToIntBits(f3) + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 by1 d1 = " + i27 + "," + by1 + "," + Double.doubleToLongBits(d1));
        FuzzerUtils.out.println("f4 i28 iArr2 = " + Float.floatToIntBits(f4) + "," + i28 + "," +
            FuzzerUtils.checkSum(iArr2));
        FuzzerUtils.out.println("dArr byArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + "," +
            FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test0266.instanceCount Test0266.sFld Test0266.bFld = " + Test0266.instanceCount + "," + Test0266.sFld +
                "," + (Test0266.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0266.fArrFld sArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0266.fArrFld))
            + "," + FuzzerUtils.checkSum(sArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0266 _instance = new Test0266();
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
