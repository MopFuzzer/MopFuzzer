// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:50 2023
public class Test0801 {

    public static final int N = 400;

    public static long instanceCount=-229L;
    public static volatile int iFld=48510;
    public static volatile short sFld=24009;
    public static float fFld=2.21F;
    public static short[] sArrFld =new short[N];

    static {
        FuzzerUtils.init(Test0801.sArrFld, (short) 3133);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i5, int i6, float f) {

        int i7=-13;
        int i8=11;
        int i9=-86;
        int i10=3;
        int i11=-55450;
        int[] iArr1 =new int[N];
        byte by=63;
        double d=0.58261;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(lArr1, 84L);
        FuzzerUtils.init(iArr1, -2);

        Test0801.iFld = i6;
        Test0801.iFld = i5;
        Test0801.instanceCount = i5;
        for (i7 = 342; 2 < i7; i7 -= 3) {
            f += i7;
            for (i9 = 1; i9 < 14; i9++) {
                switch ((i7 % 9) + 124) {
                case 124:
                    i11 = 2;
                    do {
                        switch (((i7 % 7) * 5) + 27) {
                        case 52:
                            f += i5;
                            i8 -= i5;
                            i5 = (int)50665L;
                            break;
                        case 43:
                            by >>= (byte) Test0801.sFld;
                            iArr1[i9 + 1] >>= i11;
                            i10 = -6380;
                            break;
                        case 56:
                            iArr1 = iArr1;
                            break;
                        case 41:
                            i8 += (i11 * i5);
                            break;
                        case 61:
                        case 55:
                            i8 += (-1 + (i11 * i11));
                            break;
                        case 40:
                            iArr1[i11] = (int)f;
                            break;
                        default:
                            i5 = (int) Test0801.instanceCount;
                        }
                    } while (--i11 > 0);
                    break;
                case 125:
                    lArr1[i7] = i7;
                    break;
                case 126:
                    Test0801.sFld = (short) i5;
                    break;
                case 127:
                    d += f;
                    break;
                case 128:
                    i8 = i8;
                    break;
                case 129:
                    i8 = 10;
                    break;
                case 130:
                    iArr1[i7 + 1] += (int) Test0801.instanceCount;
                    break;
                case 131:
                    Test0801.iFld -= i9;
                    break;
                case 132:
                    iArr1[i7] &= i5;
                    break;
                }
            }
        }
        long meth_res = i5 + i6 + Float.floatToIntBits(f) + i7 + i8 + i9 + i10 + i11 + by + Double.doubleToLongBits(d)
            + FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i2, int i3, int i4) {

        float f1=-1.41F;
        int i12=22740;
        int i13=97;
        int i14=28778;
        int[] iArr =new int[N];
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, 45971L);
        FuzzerUtils.init(iArr, 13);

        i2 = Math.abs((int) ((-48148 << (Test0801.iFld - 9)) + (lArr[(i4 >>> 1) % N] = i2)));
        i4 -= ((-iArr[(i3 >>> 1) % N]) << (iMeth1(Test0801.iFld, Test0801.iFld, f1) - i3));
        iArr[(i3 >>> 1) % N] += (int)-53L;
        i12 = 1;
        while (++i12 < 255) {
            for (i13 = 1; i13 < 6; ++i13) {
                i4 += (((i13 * i14) + Test0801.instanceCount) - i14);
                Test0801.iFld >>= i12;
            }
            i3 = (int) Test0801.instanceCount;
            Test0801.instanceCount -= i14;
            Test0801.instanceCount += (((i12 * i13) + i2) - i13);
            Test0801.iFld >>= i12;
            Test0801.sArrFld = Test0801.sArrFld;
            iArr[i12 - 1] = i3;
            i14 += (int) Test0801.instanceCount;
            if (i3 != 0) {
                vMeth_check_sum += i2 + i3 + i4 + Float.floatToIntBits(f1) + i12 + i13 + i14 +
                    FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
                return;
            }
        }
        vMeth_check_sum += i2 + i3 + i4 + Float.floatToIntBits(f1) + i12 + i13 + i14 + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(int i, int i1) {

        int i15=14253;
        int i16=-7553;
        int i18=-13;
        int i19=-9;
        int[] iArr2 =new int[N];
        byte by1=22;

        FuzzerUtils.init(iArr2, 50588);

        vMeth(i, Test0801.iFld, i1);
        i15 = 1;
        do {
            Test0801.fFld = i15;
        } while (++i15 < 385);
        i16 = 1;
        do {
            i1 /= -27;
        } while (++i16 < 198);
        Test0801.instanceCount ^= i1;
        for (int i17 : iArr2) {
            iArr2[(Test0801.iFld >>> 1) % N] += (int) Test0801.fFld;
            for (i18 = 1; i18 < 4; ++i18) {
                Test0801.instanceCount += (9 + (i18 * i18));
                if (true) {
                    iArr2 = iArr2;
                    Test0801.iFld = (int) -597705337932495689L;
                    by1 >>= (byte)i18;
                } else {
                    i19 = -9;
                }
            }
        }
        long meth_res = i + i1 + i15 + i16 + i18 + i19 + by1 + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int[] iArr3 =new int[N];
        float[][] fArr =new float[N][N];

        FuzzerUtils.init(iArr3, -25924);
        FuzzerUtils.init(fArr, 2.423F);

        Test0801.instanceCount -= ((--Test0801.iFld) - (iMeth(Test0801.iFld, Test0801.iFld) - Test0801.iFld));
        iArr3[(Test0801.iFld >>> 1) % N] ^= 15679;
        fArr[(Test0801.iFld >>> 1) % N] = fArr[(-33233 >>> 1) % N];
        Test0801.instanceCount = 46989;

        FuzzerUtils.out.println("iArr3 fArr = " + FuzzerUtils.checkSum(iArr3) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test0801.instanceCount Test0801.iFld Test0801.sFld = " + Test0801.instanceCount + "," + Test0801.iFld +
                "," + Test0801.sFld);
        FuzzerUtils.out.println("Test0801.fFld Test0801.sArrFld = " + Float.floatToIntBits(Test0801.fFld) + "," +
                FuzzerUtils.checkSum(Test0801.sArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0801 _instance = new Test0801();
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
