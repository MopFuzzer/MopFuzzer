// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:43 2023
public class Test0663 {

    public static final int N = 400;

    public static long instanceCount=1168183811L;
    public static boolean bFld=true;
    public static volatile int iFld=-11;
    public static volatile boolean[][] bArrFld =new boolean[N][N];

    static {
        FuzzerUtils.init(Test0663.bArrFld, false);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i10) {

        float f=-1.707F;
        float[] fArr =new float[N];
        int i11=-61723, i12=50616, i13=-7, i14=10, i15=-63046, i16=23412, i17=5;
        double d=-117.39433, d1=-25.27803;
        byte by=26;

        FuzzerUtils.init(fArr, -2.176F);

        f -= Test0663.instanceCount;
        for (i11 = 216; i11 > 12; --i11) {
            Test0663.instanceCount = 214L;
        }
        try {
            i12 = i10;
            fArr[(-2 >>> 1) % N] += i12;
            for (i13 = 9; i13 < 315; i13++) {
                for (i15 = i13; 5 > i15; ++i15) {
                    d *= Test0663.instanceCount;
                    Test0663.instanceCount = i10;
                }
                switch ((i13 % 7) + 23) {
                case 23:
                    for (d1 = 1; 5 > d1; d1++) {
                        i16 += (int) Test0663.instanceCount;
                        d = i17;
                        Test0663.instanceCount = Test0663.instanceCount;
                    }
                case 24:
                    i10 += (i13 * i13);
                    break;
                case 25:
                    f = (float)d1;
                    break;
                case 26:
                    d += i12;
                    break;
                case 27:
                    by >>= (byte)46310;
                case 28:
                    Test0663.bArrFld[i13 - 1][i13 + 1] = Test0663.bFld;
                case 29:
                    i16 += (i13 | i14);
                    break;
                default:
                    i12 -= i10;
                }
            }
        }
        catch (NegativeArraySizeException exc1) {
            i10 = i10;
        }
        vMeth1_check_sum += i10 + Float.floatToIntBits(f) + i11 + i12 + i13 + i14 + i15 + i16 +
            Double.doubleToLongBits(d) + Double.doubleToLongBits(d1) + i17 + by +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static boolean bMeth(long l, int i9) {

        int i18=568;
        int i19=-4;
        int[] iArr =new int[N];
        float f1=47.13F;
        float[] fArr1 =new float[N];
        long l1=-2997329470969462947L;
        double d2=-2.62952;

        FuzzerUtils.init(iArr, -24420);
        FuzzerUtils.init(fArr1, 31.262F);

        switch ((((i9 >>> 1) % 2) * 5) + 79) {
        case 80:
            vMeth1(i9);
            break;
        case 88:
            iArr[(i9 >>> 1) % N] -= i9;
            break;
        default:
            i18 = 175;
            while (--i18 > 0) {
                f1 = 1;
                while (++f1 < 9) {
                    i9 = i9;
                    i9 = 12;
                    for (l1 = 1; l1 < 1; ++l1) {
                        fArr1[(int)(l1 + 1)] = (float)d2;
                        Test0663.instanceCount = Test0663.iFld;
                        i19 += (int)(l1 | i9);
                    }
                }
                d2 = i19;
                l += l1;
                if (Test0663.bFld) break;
                i9 += (int)l;
            }
        }
        long meth_res = l + i9 + i18 + Float.floatToIntBits(f1) + l1 + i19 + Double.doubleToLongBits(d2) +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public void vMeth() {

        int i=6;

        i ^= (int) (Test0663.instanceCount - (Integer.reverseBytes(i) + 93.114680));
        vMeth_check_sum += i;
    }

    public int iMeth(int i6) {

        int i7=-133;
        int i8=187;
        int i20=9953;
        int i21=-44879;
        int i22=-14;
        int i23=1;
        int i24=103;
        int[] iArr1 =new int[N];
        float f2=-1.457F;
        double d3=-62.46547;

        FuzzerUtils.init(iArr1, 84);

        for (i7 = 5; i7 < 335; i7++) {
            Test0663.bFld = bMeth(Test0663.instanceCount, -5);
        }
        for (i20 = 10; i20 < 243; ++i20) {
            f2 = Test0663.instanceCount;
            iArr1[i20] += i20;
            Test0663.bArrFld[i20 + 1][i20] = Test0663.bFld;
            Test0663.instanceCount = -45414;
            for (d3 = 1; d3 < 7; d3++) {
                i22 >>= 5;
            }
            i23 = 1;
            while (++i23 < 7) {
                Test0663.iFld -= (int) -2.70031;
                iArr1 = iArr1;
                i24 = 1;
                while (++i24 < 1) {
                    Test0663.iFld &= (int) Test0663.instanceCount;
                }
                Test0663.instanceCount <<= Test0663.instanceCount;
            }
        }
        long meth_res = i6 + i7 + i8 + i20 + i21 + Float.floatToIntBits(f2) + Double.doubleToLongBits(d3) + i22 + i23 +
            i24 + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        boolean b=true;
        boolean[][] bArr =new boolean[N][N];
        int i1=-12, i2=1, i3=54354, i4=28, i5=-157;
        float f3=2.287F;
        short s=28553;

        FuzzerUtils.init(bArr, false);

        vMeth();
        b = bArr[(i1 >>> 1) % N][(i1 >>> 1) % N];
        for (i2 = 9; i2 < 169; i2++) {
            for (i4 = 9; i4 < 157; ++i4) {
                i5 <<= iMeth(i1);
                Test0663.iFld *= i4;
                i3 += (((i4 * f3) + i3) - Test0663.instanceCount);
                s += (short)(7038 + (i4 * i4));
            }
            i1 -= -44;
            i5 = i1;
        }
        s *= (short)-89.254F;

        FuzzerUtils.out.println("b i1 i2 = " + (b ? 1 : 0) + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i4 i5 = " + i3 + "," + i4 + "," + i5);
        FuzzerUtils.out.println("f3 s bArr = " + Float.floatToIntBits(f3) + "," + s + "," + FuzzerUtils.checkSum(bArr));

        FuzzerUtils.out.println("Test0663.instanceCount Test0663.bFld Test0663.iFld = " + Test0663.instanceCount + "," + (Test0663.bFld ? 1
                : 0) + "," + Test0663.iFld);
        FuzzerUtils.out.println("Test0663.bArrFld = " + FuzzerUtils.checkSum(Test0663.bArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0663 _instance = new Test0663();
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  bMeth ->  bMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 bMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
