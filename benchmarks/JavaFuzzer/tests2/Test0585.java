// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:39 2023
public class Test0585 {

    public static final int N = 400;

    public static long instanceCount=-2874896291L;
    public float fFld=42.805F;
    public double dFld=2.52089;
    public byte byFld=44;
    public boolean bFld=false;
    public static byte[] byArrFld =new byte[N];
    public static int[] iArrFld =new int[N];
    public int[][] iArrFld1 =new int[N][N];
    public static float[] fArrFld =new float[N];

    static {
        FuzzerUtils.init(Test0585.byArrFld, (byte) -106);
        FuzzerUtils.init(Test0585.iArrFld, -15541);
        FuzzerUtils.init(Test0585.fArrFld, 1.470F);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vSmallMeth(int i, int i1, int i2) {


        Test0585.instanceCount = i;
        vSmallMeth_check_sum += i + i1 + i2;
    }

    public static void vMeth(int i9) {

        double d1=38.37785;

        d1 *= 8461852937447943604L;
        d1 = i9;
        i9 = -209;
        Test0585.instanceCount -= i9;
        i9 = (int) Test0585.instanceCount;
        vMeth_check_sum += i9 + Double.doubleToLongBits(d1);
    }

    public static int iMeth(int i7, int i8, long l) {

        int i10=-62085, i11=13, i12=10, i13=55, i14=-3, i15=21517;
        float f=-19.283F, f1=2.335F;
        byte by=-50;

        i8 = (--i8);
        vMeth(i8);
        l %= (i8 | 1);
        for (i10 = 10; i10 < 393; ++i10) {
            f += i10;
            f1 += -74;
            by = (byte)i8;
            i8 = (int) Test0585.instanceCount;
        }
        l *= i11;
        l = 5;
        for (i12 = 16; 263 > i12; i12++) {
            for (i14 = 1; i14 < 7; i14++) {
                boolean b=false;
                Test0585.instanceCount ^= i11;
                if (b) break;
                if (b) continue;
            }
        }
        long meth_res = i7 + i8 + l + i10 + i11 + Float.floatToIntBits(f) + Float.floatToIntBits(f1) + by + i12 + i13 +
            i14 + i15;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public float fMeth(int i4, double d) {

        int i5=-48507, i6=-174, i16=9, i17=-13;
        long l1=-33047L;
        float f2=10.856F;

        i4 |= (++Test0585.byArrFld[(56190 >>> 1) % N]);
        for (i5 = 9; 231 > i5; i5++) {
            i4 -= (i4--);
            i4 *= iMeth(i6, 39491, Test0585.instanceCount);
        }
        d *= -174;
        for (l1 = 8; l1 < 203; ++l1) {
            if (true) break;
            try {
                i16 = (i6 % 188);
                Test0585.iArrFld[(int) (l1 + 1)] = (Test0585.iArrFld[(int) (l1 + 1)] % Test0585.iArrFld[(int) (l1 + 1)]);
                i6 = (182 % i16);
            } catch (ArithmeticException a_e) {}
            if (i4 != 0) {
            }
            fFld += i6;
        }
        Test0585.instanceCount *= Test0585.instanceCount;
        for (f2 = 4; f2 < 193; ++f2) {
            i16 = (int)fFld;
            fFld = i6;
            i4 >>= -6;
        }
        long meth_res = i4 + Double.doubleToLongBits(d) + i5 + i6 + l1 + i16 + Float.floatToIntBits(f2) + i17;
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i3=40329;
        int i18=-19557;
        int i19=-13;
        int i20=31046;
        int i21=-2;
        int i22=8;
        int i23=-231;
        int[] iArr =new int[N];
        short s=6556;
        short[] sArr =new short[N];
        boolean[] bArr =new boolean[N];

        FuzzerUtils.init(iArr, -52665);
        FuzzerUtils.init(sArr, (short)109);
        FuzzerUtils.init(bArr, true);

        fFld = iArr[(-26181 >>> 1) % N];
        for (int smallinvoc=0; smallinvoc<293; smallinvoc++) vSmallMeth(Integer.reverseBytes(++i3), (int)(-Math.abs(7 -
            (i3 * -42746))), (int)((fMeth(i3, dFld) + i3) + 3012851248L));
        i3 ^= i3;
        Test0585.instanceCount = (long) -83.12600;
        for (i18 = 13; i18 < 245; i18++) {
            for (i20 = 4; i20 < 108; i20 += 2) {
                Test0585.instanceCount = -19;
                i21 = i3;
                switch ((i20 % 5) + 2) {
                case 2:
                    iArr[i18] *= i20;
                    iArrFld1 = iArrFld1;
                    switch (((i19 >>> 1) % 2) + 23) {
                    case 23:
                        i3 <<= i18;
                        i21 += s;
                        byFld += (byte) Test0585.instanceCount;
                        break;
                    case 24:
                        iArrFld1[i18 - 1][(i19 >>> 1) % N] = i3;
                        i21 -= (int) Test0585.instanceCount;
                        break;
                    default:
                        for (i22 = 1; i22 < 3; i22++) {
                            Test0585.instanceCount = i21;
                            i21 = i22;
                            switch ((i18 % 2) + 93) {
                            case 93:
                                fFld -= s;
                                break;
                            case 94:
                            }
                            switch ((i22 % 8) + 63) {
                            case 63:
                                sArr[i22 + 1] = (short)i21;
                                Test0585.instanceCount += s;
                                if (bFld) {
                                    s += (short)-23.60091;
                                    if (bFld) break;
                                }
                                break;
                            case 64:
                                i23 <<= i18;
                                break;
                            case 65:
                                bArr[i22 - 1] = bFld;
                                break;
                            case 66:
                                i3 -= i23;
                                break;
                            case 67:
                                i21 += i21;
                                break;
                            case 68:
                                i3 = (int)-1792287796L;
                                break;
                            case 69:
                                fFld -= Test0585.instanceCount;
                                break;
                            case 70:
                                Test0585.fArrFld[i20 - 1] += i3;
                            }
                        }
                    }
                    break;
                case 3:
                    fFld += Test0585.instanceCount;
                    break;
                case 4:
                    bArr[i20] = false;
                    break;
                case 5:
                    Test0585.iArrFld[i20 + 1] -= i22;
                    break;
                case 6:
                    i3 = (int) Test0585.instanceCount;
                    break;
                }
            }
        }

        FuzzerUtils.out.println("i3 i18 i19 = " + i3 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 s = " + i20 + "," + i21 + "," + s);
        FuzzerUtils.out.println("i22 i23 iArr = " + i22 + "," + i23 + "," + FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println("sArr bArr = " + FuzzerUtils.checkSum(sArr) + "," + FuzzerUtils.checkSum(bArr));

        FuzzerUtils.out.println("Test0585.instanceCount fFld dFld = " + Test0585.instanceCount + "," +
            Float.floatToIntBits(fFld) + "," + Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("byFld bFld Test0585.byArrFld = " + byFld + "," + (bFld ? 1 : 0) + "," +
                FuzzerUtils.checkSum(Test0585.byArrFld));
        FuzzerUtils.out.println("Test0585.iArrFld iArrFld1 Test0585.fArrFld = " + FuzzerUtils.checkSum(Test0585.iArrFld) + "," +
                FuzzerUtils.checkSum(iArrFld1) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test0585.fArrFld)));

        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0585 _instance = new Test0585();
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  iMeth ->  iMeth fMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
