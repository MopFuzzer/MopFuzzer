// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:23 2023
public class Test0251 {

    public static final int N = 400;

    public static long instanceCount=-54278L;
    public float fFld=-1.871F;
    public double dFld=85.26824;
    public static boolean bFld=false;
    public volatile short sFld=-10254;
    public static volatile float[] fArrFld =new float[N];
    public static int[][] iArrFld =new int[N][N];
    public static byte[] byArrFld =new byte[N];

    static {
        FuzzerUtils.init(Test0251.fArrFld, 109.80F);
        FuzzerUtils.init(Test0251.iArrFld, -195);
        FuzzerUtils.init(Test0251.byArrFld, (byte) -84);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l) {

        int i4=10;
        int i5=-5;
        int i6=72;
        int i7=-191;
        int[] iArr =new int[N];
        float f=0.474F;
        double d1=-100.78948;

        FuzzerUtils.init(iArr, 18);

        i4 = 1;
        do {
            Test0251.instanceCount = (long) f;
            l >>= i4;
            for (d1 = 1; d1 < 6; ++d1) {
                switch (((i4 % 4) * 5) + 86) {
                case 96:
                case 101:
                    Test0251.bFld = true;
                    iArr = FuzzerUtils.int1array(N, (int)11);
                    i5 += (int)d1;
                case 99:
                    for (i6 = 1; i6 < 2; i6++) {
                        if (Test0251.bFld) continue;
                        i5 += i4;
                        i5 >>= (int)238077920L;
                        if (true) break;
                    }
                    i5 += (int)(d1 * i6);
                    Test0251.instanceCount += i5;
                case 94:
                    i7 += (int)(d1 + l);
                    break;
                }
            }
        } while (++i4 < 278);
        vMeth1_check_sum += l + i4 + Float.floatToIntBits(f) + Double.doubleToLongBits(d1) + i5 + i6 + i7 +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i1) {

        double d=107.124012;
        int i2=0, i3=-210;
        float f1=-2.377F;
        short s=-1872;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -48L);

        d = 193;
        while ((d -= 2) > 0) {
            for (i2 = 1; 16 > i2; ++i2) {
                vMeth1(Test0251.instanceCount);
                i3 += (int)(-741L + (i2 * i2));
                switch ((i2 % 7) * 5) {
                case 8:
                    switch ((int)(((d % 8) * 5) + 40)) {
                    case 44:
                    case 48:
                        if (Test0251.bFld) break;
                        lArr[(int)(d + 1)] >>= -1;
                        f1 += i2;
                        break;
                    case 53:
                        Test0251.instanceCount = -20961;
                        Test0251.instanceCount &= i3;
                        Test0251.fArrFld[i2 - 1] -= 96.103F;
                        Test0251.iArrFld[i2 - 1][(int) (d)] *= i3;
                    case 65:
                        i1 += (i2 * i3);
                        i1 += (i2 * i2);
                        break;
                    case 46:
                        i1 = i2;
                        break;
                    case 67:
                        f1 = i2;
                    case 72:
                        i3 -= i2;
                        break;
                    case 71:
                        Test0251.instanceCount = -60045L;
                        break;
                    default:
                        Test0251.instanceCount *= i1;
                    }
                case 35:
                    s = (short)i1;
                    break;
                case 26:
                    i1 += (i2 * i2);
                case 3:
                    i1 += i3;
                    break;
                case 19:
                    i3 += (i2 * i2);
                    break;
                case 28:
                    Test0251.byArrFld[i2] += (byte) -39917;
                    break;
                case 30:
                    i3 -= (int)f1;
                default:
                    Test0251.iArrFld[(int) (d - 1)][i2 + 1] *= 41439;
                }
            }
        }
        vMeth_check_sum += i1 + Double.doubleToLongBits(d) + i2 + i3 + Float.floatToIntBits(f1) + s +
            FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth() {

        int i8=-5123, i9=-44, i10=-53772, i11=33479, i12=1, i13=-239;
        float f2=-1.694F;
        double[] dArr =new double[N];

        FuzzerUtils.init(dArr, 0.112347);

        vMeth(i8);
        f2 *= i8;
        dArr[(i8 >>> 1) % N] -= Test0251.instanceCount;
        for (i9 = 1; i9 < 161; i9++) {
            i10 += (i9 * i8);
            Test0251.iArrFld[i9][i9 - 1] <<= i9;
        }
        i10 -= i8;
        for (i11 = 13; i11 < 315; i11++) {
            short s1=15158;
            i12 += (((i11 * i8) + i11) - s1);
            s1 += (short)i11;
            i12 -= i8;
            Test0251.instanceCount *= i10;
            Test0251.bFld = Test0251.bFld;
            i12 += (i11 - i11);
            Test0251.iArrFld[i11 - 1][i11] ^= i13;
        }
        long meth_res = i8 + Float.floatToIntBits(f2) + i9 + i10 + i11 + i12 + i13 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-1, i14=-212, i15=9, i16=4, i17=-27, i18=-46, i19=199, i20=-52860;
        long l1=11L;
        long[] lArr1 =new long[N];
        double[][] dArr1 =new double[N][N];

        FuzzerUtils.init(lArr1, 26156L);
        FuzzerUtils.init(dArr1, 1.63566);

        i = (int)(Math.abs(++fFld) + (Math.abs(dFld) - iMeth()));
        i14 = 1;
        while (++i14 < 162) {
            for (i15 = 155; i15 > i14; i15--) {
                lArr1[i15] <<= i16;
                i ^= -68;
                i -= (int)fFld;
                i16 >>= i16;
            }
            for (l1 = 7; l1 < 155; l1++) {
                Test0251.iArrFld[i14][i14 - 1] -= i16;
                dArr1[i14][i14] = i14;
                Test0251.instanceCount -= 227;
                lArr1[i14 + 1] += i;
                i18 = 1;
                while (++i18 < 2) {
                    Test0251.instanceCount += i18;
                    Test0251.instanceCount *= Test0251.instanceCount;
                    Test0251.instanceCount += i18;
                    i16 += i16;
                    switch (((i18 >>> 1) % 1) + 112) {
                    case 112:
                        i17 <<= (int)l1;
                        break;
                    }
                    i = (int)fFld;
                    Test0251.instanceCount = i16;
                    Test0251.instanceCount += sFld;
                    Test0251.fArrFld[(int) (l1 + 1)] -= fFld;
                    dFld /= (l1 | 1);
                }
                for (i19 = 1; 2 > i19; i19++) {
                    i20 += (i19 * i19);
                    i17 += i19;
                    i17 = (int)221532191L;
                    dFld -= fFld;
                    i *= (int)fFld;
                }
            }
        }

        FuzzerUtils.out.println("i i14 i15 = " + i + "," + i14 + "," + i15);
        FuzzerUtils.out.println("i16 l1 i17 = " + i16 + "," + l1 + "," + i17);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("lArr1 dArr1 = " + FuzzerUtils.checkSum(lArr1) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)));

        FuzzerUtils.out.println("Test0251.instanceCount fFld dFld = " + Test0251.instanceCount + "," +
            Float.floatToIntBits(fFld) + "," + Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("Test0251.bFld sFld Test0251.fArrFld = " + (Test0251.bFld ? 1 : 0) + "," + sFld + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0251.fArrFld)));
        FuzzerUtils.out.println("Test0251.iArrFld Test0251.byArrFld = " + FuzzerUtils.checkSum(Test0251.iArrFld) + "," +
                FuzzerUtils.checkSum(Test0251.byArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0251 _instance = new Test0251();
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
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
